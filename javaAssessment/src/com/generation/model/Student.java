package com.generation.model;


import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Student
    extends Person
    implements Evaluation
{
    private ArrayList<Course> enrolledCourses;

    float PASS_MIN_GRADE = 3.0f;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
        enrolledCourses = new ArrayList<>();
    }


    public void enrollToCourse( Course course )
    {
        enrolledCourses.add(course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO

        return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
       if (enrolledCourses.contains(courseId)) {
           //Need to get the Course object
           //Pass in Course object instead
           int indexCourse = enrolledCourses.indexOf(courseId);
           return enrolledCourses.get(enrolledCourses.indexOf(courseId));
       } else {
           return null;
       }
    }



    public String listEnrolledCourses() {

        String list = "";

        if (enrolledCourses.size() == 0) {
            return list;
        } else {
            String title = "\nEnrolled Course: \n";

            for (Course c: enrolledCourses) {
                list += c + "\n";
            }
            return title + list;
        }
    }

    public void toGrade(Course courseID) {

    }






    @Override
    public List<Course> getEnrolledCourses() {
        //TODO
        return enrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}" + this.listEnrolledCourses();
    }

}
