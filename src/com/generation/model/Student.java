package com.generation.model;


import java.util.*;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }
    private Map<String, EnrolledCourse> enrolledCourses = new HashMap<>();

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        List<Course> passedCourses = new ArrayList<>();
        for (EnrolledCourse enrolledCourse: enrolledCourses.values()) {
            if (enrolledCourse.getGrade() >= PASS_MIN_GRADE) {
                passedCourses.add(enrolledCourse);
            }
        }
        return passedCourses;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
       return enrolledCourses.getOrDefault(courseId, null);
    }


    public void enrollToCourse(Course course) {
        EnrolledCourse enrollCourse = new EnrolledCourse(course);
        enrolledCourses.put(course.getCode(), enrollCourse);
    }

    @Override
    public List<Course> getEnrolledCourses() {
        //TODO
        return new ArrayList<>(enrolledCourses.values());
    }

    public void setGrade(String courseCode, float grade) {
        if (enrolledCourses.containsKey(courseCode)) {
            enrolledCourses.get(courseCode).setGrade(grade);
        }
    }


    public float getGrade(String courseCode) {
        float grade = 0.0f;
        if (enrolledCourses.containsKey(courseCode)) {
            grade = enrolledCourses.get(courseCode).getGrade();
        }
        return grade;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}" + this.getEnrolledCourses();
    }
}
