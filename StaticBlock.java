public class StaticBlock {
    public static void main(String[] args){
//        Blocksaa b= new Blocksaa();
//        Blocksaa.setS(10);
        System.out.println(Blocksaa.getS());
        SubBlocksaa s=new SubBlocksaa();
        SubBlocksaa.setS(50);
        System.out.println(Blocksaa.getS());
    }
}
class Blocksaa{
    private static int s;

    static {
        System.out.println("block 1");
        s=10;
    }
    public static void setS(int s) {
        Blocksaa.s = s;
    }

    public static int getS() {
        return s;
    }

    static {
        System.out.println("block 2");
    }
}
class SubBlocksaa extends Blocksaa{
    public static void setS(int s) {

        System.out.println("just overriding "+s);
//        SubBlocksaa.s=s; // this is also doing overriding if static is public
//        Blocksaa.setS(s);// when this line is commented then static s is not changed
    }
}