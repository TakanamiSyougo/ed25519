import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main_ITP1_2_A {		//二つの整数の大小を比べる
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {	//Scanerクラスを変数scで使えるようにする
	            int a = sc.nextInt();	//二つの変数a,bに整数を入力
	            int b = sc.nextInt();

	            //ifを用いた比較
	            if(a > b) {				//aがbより大きかった場合
	            	System.out.println("a > b");	//
	            }else if(a < b) { 		//bがaより大きかった場合
	            	System.out.println("a < b");
	            }else if(a == b) {		//aとbが同じ数値だった場合
	            	System.out.println("a == b");
	            }
	        }
	    }
}


