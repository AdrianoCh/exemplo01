package pucrs.s2b.exemplo01;

public class Hello {
	public static void main(String[] args) {
		int a= 20;
		int b= 30;
		int r = somar(a, b);
		
		if(r == 50) {
			System.out.println("Resultado est� certo");
		} else {
			System.out.println("O resultado est� errado");
		}
	}

	public static int somar(int a, int b) {
		int r= a+b;
		return r;
	}
}