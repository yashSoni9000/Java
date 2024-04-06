public class InterfaceStore {
    public static void main(String[] args){
        Store s=new Store();
        Customer c1=new Customer("yash");
        Customer c2=new Customer("mumma");
        Customer c3=new Customer("papa");
        s.register(c1);
        s.register(c2);
        s.register(c3);
        s.inviteSale();
    }
}
interface Member{
    void callback();
}
class Customer implements Member{
    String name;
    Customer(String name){
        this.name=name;
    }
    @Override
    public void callback() {
        System.out.println("Ok, I will visit, "+this.name);
    }
}
class Store{
    Member[] mem = new Member[100];
    int count=0;
    void register(Member m){
        mem[count++]=m;
    }
    void inviteSale(){
        for(int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}