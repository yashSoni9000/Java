import java.sql.Array;

public class StudentUsingConstructor {
    public static void main(String[] args){
        String[] subjects={"Java","Js","Python"};
        StudentConstructor st1=new StudentConstructor(1,"yash","cs",subjects);
//        st1.setStudentSubjects();
        System.out.println(st1.toString());
    }
}

class StudentConstructor{
    private int rollNo;
    private String name;
    private String dept;
    private String[] sub=new String[3];

    public int getRollNo() {return this.rollNo;}
    public String getName() {return this.name;}
    public String getDept() {return this.dept;}
    public String [] getSubject(){
        return sub;
    }


    public void setStudentSubjects(String ...subjects){
        for(int i=0;i<subjects.length;i++){
//            sub[i]=new SubjectConstructor(subjects[i],subjects[i]);
            sub[i]=subjects[i];
        }
    }

    public StudentConstructor(int rollNo,String name,String dept,String ...subject){
        this.rollNo=rollNo;
        this.name=name;
        this.dept=dept;
        setStudentSubjects(subject);
    }
    public String toString(){
        String temp="";
        for(String s:sub){
            temp+=s;
            temp+=" ";
        }
        return "\nSubject ID:"+rollNo+"\nName :"+name+"\nMarks Obtained :"+dept+"\nSubjects :"+temp;
    }
}