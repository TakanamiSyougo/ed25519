import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main_ITP1_3_B {
	public static void main(String[] args) {
		int x = 0;
		int i = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while(x != 0) {
				x = sc.nextInt();

			if(x == 0)break;
			System.out.println(String.format("Case %d: %d",i,x));
			i++;
			}
		}
	}
}

