import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main_ITP1_5_D{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int num = sc.nextInt();
			for(int i = 1; i <= num ; i++ ) {
				if(i%3 == 0) {
					System.out.print(" " + i);
				}
				else for(int j = i; 0<j ; j /= 10) {
					if(j%10 == 3) {
						System.out.print(" " + i);
						break;
					}
				}
			}
			System.out.println();
		}
	}
}