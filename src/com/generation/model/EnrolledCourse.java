package com.generation.model;

public class EnrolledCourse extends Course{

    private float grade = 0.0f;

    public EnrolledCourse(Course course) {
        super(course.getCode(), course.getName(), course.getCredits(), course.getModule());
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }


}
