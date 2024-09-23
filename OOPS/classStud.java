import java.util.*;
public class classStud {
    public static void access(Student x){
        System.out.println(x.rno);

    }
    public static void main(String args[]){
        Student s1 = new Student("abc",212,78.90);
        System.out.println(s1.name);
        access(s1);
        System.out.println(s1.getNumberOfstudents());
        Student s2 = new Student("pqr",678,98.9);
        System.out.println(s2.getNumberOfstudents());
        Student s3 = new Student("xyz",567,89.00);
        System.out.println(s3.getNumberOfstudents());

    }
    
}
