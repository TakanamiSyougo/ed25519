import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main_ITP1_1_C {	//長方形の面積と周の長さ
    public static void main(String[] args) {

    	System.out.println("長方形の面積と周の長さを求めます");

        try (Scanner sc = new Scanner(System.in)) {	//try(Scanner sc = new Scanner(Sytem.in)){で標準入力が使える

            System.out.println("縦の長さを入力してください");
        	int a = sc.nextInt();			//縦	int a = sc.nextInt();

        	System.out.println("横の長さを入力してください");
            int b = sc.nextInt();			//横	int a = sc.nextInt();
            System.out.println(String.format("面積:%d  周の長さ:%d", a * b, 2 * (a + b)));	//面積と周の長さを表示
        }
    }
}
