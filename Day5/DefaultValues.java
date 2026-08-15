package Day5;

class Student
{
    int rollno;
    int age;
    double cgpa;
    char grade;
    boolean pass;
}

public class DefaultValues
{
    public static void main(String[] args)
    {
        Student student = new Student();

        System.out.println(student.rollno);
        System.out.println(student.age);
        System.out.println(student.cgpa);
        System.out.println(student.grade);
        System.out.println(student.pass);

    }
}
