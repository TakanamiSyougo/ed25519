import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main_ITP1_5_B {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				int H = sc.nextInt();
				int W = sc.nextInt();

				if(H ==0 && W == 0)break;

				for(int i = 0;i < H;i++) {
					for(int j = 0;j < W;j++) {
						if(i == 0 || i == H-1) {
						System.out.print("#");
						}else {
							if(j == 0 || j == W -1) {
								System.out.print("#");
							}else {
								System.out.print(".");
							}
						}
					}
					System.out.println("");
				}
				System.out.println("");
			}
		}
	}
}




