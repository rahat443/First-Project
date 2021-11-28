package designPattern;

public class student {

    int a = 5;
    public static final student STUDENT = new student();
    private student()
    {


    }

    public static student getstudent(){
        return STUDENT;
    }



}
