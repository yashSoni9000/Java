public class StudentUsingConstructor {
    public static void main(String[] args){
        SubjectConstructor[] subjects= new SubjectConstructor[3];
        subjects[0]=new SubjectConstructor("J101","Java",100,80);
        subjects[1]=new SubjectConstructor("S102","JS",100,90);
        subjects[2]=new SubjectConstructor("P103","Python",100,70);
        StudentConstructor st1=new StudentConstructor(1,"yash","cs",subjects);
        SubjectConstructor[] temp=st1.getSubject();
        for(SubjectConstructor s:temp) System.out.print(s+" ");
        System.out.println();
        System.out.println(st1);
    }
}

class StudentConstructor{
    private int rollNo;
    private String name;
    private String dept;
    private SubjectConstructor[] sub;

    public int getRollNo() {return this.rollNo;}
    public String getName() {return this.name;}
    public String getDept() {return this.dept;}
    public SubjectConstructor[] getSubject(){
        return this.sub;
    }


    public void setStudentSubjects(SubjectConstructor ...subjects){
        this.sub=subjects;
    }

    public StudentConstructor(int rollNo,String name,String dept,SubjectConstructor ...subject){
        this.rollNo=rollNo;
        this.name=name;
        this.dept=dept;
        setStudentSubjects(subject);
    }
    public String toString(){
        String temp="";
        for(SubjectConstructor s:sub){
            temp+=s.name();
            temp+=" ";
        }
        return "\nSubject ID:"+rollNo+"\nName :"+name+"\nMarks Obtained :"+dept+"\nSubjects :"+temp;
    }
}