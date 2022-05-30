package com.generation.model;

public class Course
{
    private final String code;
    private final String name;
    private final int credits;
    private final Module module;

    private float grade;

    public Course( String code, String name, int credits, Module module )
    {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.module = module;
        this.grade = 0.0f;
    }

    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public int getCredits()
    {
        return credits;
    }

    public Module getModule()
    {
        return module;
    }

    public float getGrade() {
        return grade;
    }
    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String showGrade() {
        String printGrade = "";
         if (grade == 0.0f) {
             return printGrade;
         } else {
             String title = "Grade: ";
             printGrade = String.valueOf(grade);
             return title + printGrade;
         }
    }


    @Override
    public String toString()
    {
        return "Course{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", credits=" + credits + ", module="
            + module + '}' + this.showGrade();
    }
}
