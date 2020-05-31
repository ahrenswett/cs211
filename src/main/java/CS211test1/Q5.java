package CS211test1;

public class Q5 {
    public static void main(String[] args) {
        A(3);
    }
    static void A(int n) {
        if (n > 0) {
            A(n - 1);
            for (int i = 0; i < 2; i++) {
                System.out.println(n - i);
            }
        }
    }
}
