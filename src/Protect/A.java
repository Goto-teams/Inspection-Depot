package Protect;


public class A {
	public static void main(String[] args) {
	
		System.out.println("***九九乘法表***");
		for (int i = 1; i <= 9; i++) {
			System.out.println("");
			for (int j = 1; j <= i; j++) {
//				System.out.print(i + "*" + j + "=" + i*j + "\t");
				System.out.printf("%-10s",i + "*" + j + "=" + i*j );  
			}		
		}
	}
}
