package com.southwind.repository.impl;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private Map<Integer,Student> studentMap;

    public StudentRepositoryImpl() {
        studentMap = new HashMap<>();
        studentMap.put(1,new Student(1,"张三",21));
        studentMap.put(2,new Student(2,"李四",22));
        studentMap.put(3,new Student(3,"王五",23));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public void deleteById(Integer id) {
        studentMap.remove(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }
}
