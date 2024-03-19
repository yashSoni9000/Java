public class MergingTwoInOneVariable {
    public static void main(String[] args) {
        byte a = 9, b = 12;
        int
                c = a;
        c = c << 4;
        c = c | b;
        System.out.println((c | 0b11110000) >> 4);
        System.out.println((c | 0b00001111));
    }
}
