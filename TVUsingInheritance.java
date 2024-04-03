public class TVUsingInheritance {
    public static void main(String[] args){
        TV t1=new TV();
        t1.switchON();
        t1.changeChannel();

        SmartTV st1=new SmartTV();
        st1.switchON();
        st1.changeChannel();
        st1.browse();

        TV t=new SmartTV();
        t.switchON();
        t.changeChannel();
//        t.browse(); not applicable

//        SmartTV st= new TV(); // not applicable as we can not call a "TV" as smart TV but, we can call a "smart TV " as TV.
//        st.switchON();
//        st.changeChannel();
//        st.browse();
    }
}
class TV{
    public void switchON(){ System.out.println("TV switched ON");}

    public void changeChannel(){ System.out.println("TV channel changed");}

}
class SmartTV extends TV{
    @Override
    public void switchON(){System.out.println("SmartTV switchON");}
    @Override
    public void changeChannel(){ System.out.println("SmartTV channel changed");}
    public void browse(){System.out.println("SmartTV browsing");}
}