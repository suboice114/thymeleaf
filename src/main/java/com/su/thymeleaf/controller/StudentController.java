package com.su.thymeleaf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.su.thymeleaf.mapper.StudentMapper;
import com.su.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentMapper studentMapper;

    @RequestMapping("/listStudent")
    public String listStudet(Model model, @RequestParam(value = "start", defaultValue = "0") int start,
                             @RequestParam(value = "size", defaultValue = "5") int size){
        PageHelper.startPage(start,size," sid desc ");
        List<Student> students = studentMapper.findAllStudent();

        PageInfo<Student> pageInfo = new PageInfo<>(students);
        model.addAttribute("page",pageInfo);
        return "student/listStudent";
    }

    @RequestMapping("/editStudent")
    public String editStudent(int sid, Model model){
        Student student = studentMapper.getStudent(sid);
        model.addAttribute("student", student);
        return "student/editStudent";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        studentMapper.updateStudent(student);
        return "redirect:/student/listStudent";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(Student student){
        studentMapper.deleteStudent(student.getSid());
        return "redirect:/student/listStudent";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        studentMapper.addStudent(student);
        return "redirect:/student/listStudent";
    }

}
