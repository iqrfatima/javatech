public class Student {
    String name;
    int rno;
    double percent;
    private static int numberOfStudents;
    public Student(){

    }
    public Student(String name,int rno,double percent){
        this.name=name;
        this.rno=rno;
        this.percent=percent;
        numberOfStudents++;
    }
    //to illustrate the usage of getter and setter function
    public int getNumberOfstudents(){
        return numberOfStudents;
    }
}
