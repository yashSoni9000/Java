public class ProductUsingConstructor {
    public static void main(String[] args){
        ProductConstructor p1=new ProductConstructor();
        p1.setPrice(69.9);
        p1.setQuantity(1);

        ProductConstructor p2=new ProductConstructor("Abir69","abirChoudhury");
        p2.setPrice(96.69);
        p2.setQuantity(2);

        ProductConstructor p3= new ProductConstructor("Macchi","Bengali",420.69d,3);

        System.out.println("P1==>");
        System.out.println(p1.getItemNo());
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.getQuantity());

        System.out.println("P2==>");
        System.out.println(p2.getItemNo());
        System.out.println(p2.getName());
        System.out.println(p2.getPrice());
        System.out.println(p2.getQuantity());

        System.out.println("P3==>");
        System.out.println(p3.getItemNo());
        System.out.println(p3.getName());
        System.out.println(p3.getPrice());
        System.out.println(p3.getQuantity());
    }
}

class ProductConstructor{
    private String itemNo;
    private String name= "";
    private double price;
    private int quantity;

    public double getPrice() {
        return price;
    }

    public String getItemNo() {
        return itemNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductConstructor(){
        itemNo="ABC-123";
        name="BengaliMacchi";

    }
    public ProductConstructor(String i,String n){
        itemNo=i; // we can add validations to item no and name but now i am using as it is
        name=n;
    }
    public ProductConstructor(String i,String n,double p,int q){
        itemNo=i; // we can add validations to item no and name but now i am using as it is
        name=n;
        price=p;
        quantity=q;
    }

}
