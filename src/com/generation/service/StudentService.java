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
            for (Student student: students.values()) {
                System.out.println(student);
                System.out.println("Enrolled Course: ");
                List<Course> course = student.getEnrolledCourses();
                if(course.size() > 0) {
                    for (Course myCourse: course) {
                        System.out.println(myCourse + " Grade: " + student.getGrade(myCourse.getCode()));
                    }
                } else {
                    System.out.println("No course enrolled for this student");
                }
            }
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
        if (students.containsKey(studentId)) {
            Student student = students.get(studentId);
            student.enrollToCourse(course);
        }
    }











}
