package grapro20.src.main.java.com.njusoft.grapro20.mapper;


import grapro20.src.main.java.com.njusoft.grapro20.model.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    Student selectByPrimaryKey(Integer id);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);

    List<Integer> descid();

    List<Student> selectByName(String name);
}