//while文での繰り返し
class Main_ITP1_3_A {
	public static void main(String[] args) {
		int i = 1;		//変数宣言

		while(i <= 1000){		//while(条件式)
			System.out.println("Hello World");		//処理
			i++;									//無限ループをしないように変数に加算
		}
	}
}

//for文の繰り返し
//
//for(int i = 1; i <= 1000;i++){				//for(変数宣言; 条件式;反復処理){
//	System.out.println("Hello World");						処理
//}
//
