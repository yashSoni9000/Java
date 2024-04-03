public class SubjectUsingConstructor {
    public static void main(String[] args){
        // following is method without array of objects
//        SubjectConstructor s2=new SubjectConstructor("Jen-z","Java");
//        s2.setMarksObtained(100);
//
//        ProductConstructor p3= new ProductConstructor("JS01","JavaScript",100,70);

        // following is method with array of objects
        SubjectConstructor[] sub=new SubjectConstructor[3];
        sub[0]=new SubjectConstructor("J101","Java");
        sub[1]=new SubjectConstructor("S102","JS");
        sub[2]=new SubjectConstructor("P103","Python");

        for(SubjectConstructor s:sub){
            System.out.println(s);
        }
    }
}

class SubjectConstructor{
    private String subID;
    private String name= "";
    private int maxMarks;
    private int marksObtained;

    public String getSubID(){
        return subID;
    }

    public String name() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(int m){
        marksObtained=m;
    }

//    public SubjectConstructor(){ // we must take subject id and name
//        subID="ABC-123";
//        name="Maths";
//        maxMarks=100;
//
//    }
    public SubjectConstructor(String i,String n){
        subID=i; // we can add validations to item no and name, but now I am using as it is
        name=n;
    }
    public SubjectConstructor(String i,String n,int p,int q){
        subID=i; // we can add validations to item no and name, but now I am using as it is
        name=n;
        maxMarks=p;
        marksObtained=q;
    }

    public String toString(){
        return "\n Subject ID:"+subID+"\nName :"+name+"Marks Obtained :"+marksObtained;
    }
}
