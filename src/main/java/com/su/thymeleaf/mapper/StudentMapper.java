package com.su.thymeleaf.mapper;

import com.su.thymeleaf.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from student")
    List<Student> findAllStudent();

    @Select("select * from student where sid = #{sid} ")
    Student getStudent(int sid);

    @Delete("delete from student where sid= #{sid} ")
    void deleteStudent(Integer sid);

    @Insert("insert into student (sname,sage,score,address) values (#{sname},#{sage},#{score},#{address})")
    void addStudent(Student student);

    @Update("update student set sname=#{sname}, sage=#{sage} ,address=#{address} where sid=#{sid}")
    void updateStudent(Student student);
}
