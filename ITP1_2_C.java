import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class ITP1_2_C {	//三つの整数を比較する
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {	//Scanerクラスを変数scで使えるようにする
        	System.out.println("三つの整数を入力してください");
            int a = sc.nextInt();	//二つの変数a,b,cに整数を入力
            int b = sc.nextInt();
            int c = sc.nextInt();

            //かつ(&&),または(||)を用いたif文
            if(a < b && b < c) {							//bがaより大きくcがaより大きい場合
            	System.out.println(String.format("%d %d %d",a,b,c));
            }else if(a > b && b > c){ 						//aがｂより大きくbがｃより大きいの場合
            	System.out.println(String.format("%d %d %d",c,b,a));
            }else if(a < b && b > c){						//ｂが一番大きい場合
            	if(a >c) {
            	System.out.println(String.format("%d %d %d",c,a,b));
            	}else {
            		System.out.println(String.format("%d %d %d",a,c,b));
            	}
            }else if(a > b && b < c){						//ｂが一番小さい場合
            	if(a >c) {
                	System.out.println(String.format("%d %d %d",b,c,a));
                	}else {
                		System.out.println(String.format("%d %d %d",b,a,c));
                	}
            }else if(a == b || b == c || a == c) {			//二つの整数がイコールの場合
            	if(a == b) {
            		if(c > a) {
            			System.out.println(String.format("%d %d %d",a,b,c));
            		}else {
            			System.out.println(String.format("%d %d %d",c,a,b));
            		}
            	}else if(c == b) {
            		if(c > a) {
            			System.out.println(String.format("%d %d %d",a,b,c));
            		}else {
            			System.out.println(String.format("%d %d %d",b,c,a));
            		}
            	}else if(a == c) {
            		if(b > a) {
            			System.out.println(String.format("%d %d %d",a,c,b));
            		}else {
            			System.out.println(String.format("%d %d %d",b,c,a));
            		}
            	}
            }
        }
    }
}
