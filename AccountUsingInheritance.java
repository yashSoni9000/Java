public class AccountUsingInheritance {
    public static void main(String[] args){

    }
}

class Account{
    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public double getBalance() {
        return balance;
    }

    private String accNo;
    private String name;

    public void setPhoneNo(int phoneNo) {
        int checkNum=phoneNo;
        int count=0;
        while(checkNum>0){
            count++;
            checkNum/=10;
        }
        if(count==9) this.phoneNo = phoneNo;
        else this.phoneNo=0;
    }

    public void setBalance(double balance) {
        if(balance>0) this.balance = balance;
        else this.balance=0;
    }

    private String address;
    private int phoneNo;
    private double balance;

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    private String DOB;

    public Account(String accNo,String name,String address,int phoneNo,double balance){
        setBalance(balance);
        setPhoneNo(phoneNo);
        this.accNo=accNo;
        this.name=name;
        this.address=address;
    }
}

class SavingAccount extends Account{

    public SavingAccount(String accNo, String name, String address, int phoneNo, double balance) {
        super(accNo, name, address, phoneNo, balance);// why it is mandatory
    }
}