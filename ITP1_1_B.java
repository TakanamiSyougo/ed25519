import java.util.Scanner;

class Main_ITP1_1_B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(n * n * n);
        }
    }
}
