import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main_ITP1_2_D {		//
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {	//Scanerクラスを変数scで使えるようにする
        	System.out.println("長方形の座標(W,H)と円の中心座標(x,y)と半径rを入力してください");
            int W = sc.nextInt();	//二つの変数a,b,cに整数を入力
            int H = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();

            if(W - r < x || r > x || H - r < y || r > y) {		
            	System.out.println("No");
            }else {
            	System.out.println("Yes");
            }
         }
     }
}
