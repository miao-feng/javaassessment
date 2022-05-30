package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;
import com.generation.service.CourseService;
import com.generation.java.*;
import java.util.*;

public class StudentService
{



    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put(student.getId(), student);

    }

    public Student findStudent( String studentId )
    {
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }

    public boolean showSummary()
    {
        //TODO
        if (students.size() > 0) {
            return true;
        }
        return false;
    }

    public String studentSummary() {
        String printAllStudents = "";

        for (Student s: students.values()) {
            printAllStudents += s + "\n";
        }
        return printAllStudents;
    }


    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        Student student = students.get(studentId);
        student.enrollToCourse(course);
    }

    public void inputGrade( Student student, String courseId, float grade) {
        Course getCourse = student.findCourseById(courseId);
        getCourse.setGrade(grade);
    }









}
