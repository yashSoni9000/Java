public class StudentUsingClass {
    public static void main(String[] args){
        Student s=new Student();
        s.rollNo=1;
        s.name="abc";
        s.course="maths";
        s.m1=70;
        s.m2=70;
        s.m3=70;
        System.out.println(s.total());
        System.out.println(s.average());
        System.out.println(s.grade());
    }
}
class Student{
    public int rollNo;
    public String name;
    public String course;
    public double m1,m2,m3;
    public double total(){
        return m1+m2+m3;
    }
    public int average(){
        return (int) total()/3;
    }
    public char grade(){
        int avg=average();
        char c = 0;
        if(avg>=70) return 'A';
        else if(avg>=50) return 'B';
        else return 'C';
    }
}
