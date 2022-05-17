package ru.gb.jc;

public class Course {
    public String title;

    public Course(String title) {
        this.title = title;
    }

    public int run;
    public int jump;

    public Course(String title, int run, int jump) {
        this.title = title;
        this.run = run;
        this.jump = jump;
    }

    Course[] courses = {new Course("Min",105,25),
                        new Course("Medium", 115,27),
                        new Course("Max", 120,30)};
    public static void doIt()


}





