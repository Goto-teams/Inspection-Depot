public class multi {
	public static void main(String[] args) {
		//使用循环打印99乘法表
		System.out.println("***使用循环打印99乘法表***");
		for (int i = 1; i <= 9; i++) {
			System.out.println("");
			for (int j = 1; j <= i; j++) {
//				System.out.print(i + "*" + j + "=" + i*j + "\t");
				System.out.printf("%-10s",i + "*" + j + "=" + i*j );  //格式化打印流
			}		
		}
	}
}
