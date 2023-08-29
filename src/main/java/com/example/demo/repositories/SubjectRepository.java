package com.example.demo.repositories;

import com.example.demo.entity.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {
    private static List<Subject> subjects;
    public List<Subject> findAll(){
        return subjects;
    }
    public SubjectRepository(){
        initial();
    }

    private void initial(){
        subjects= new ArrayList<>(20);
        subjects.add(new Subject("INT100" ,"IT Fundamental",3));
        subjects.add(new Subject("INT101","Java Programming",3));
        subjects.add(new Subject("INT105","Web Technology",3));
        subjects.add(new Subject("INT100","Computer and Society",3));
        subjects.add(new Subject("INT100","Data Communication and Networking",3));
        subjects.add(new Subject("INT100","Management Information Systems",3));
        subjects.add(new Subject("INT100","Internship",3));
    };
}
