
public class ContadoraDeEstoque {
	public static void main(String[] args) {
		
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
		
		double soma = livroJava8 + livroTDD;
		
		System.out.println("O total em estoque é " + soma);
		
		//Aplicando Casting
		/**
		int numeroInteiro = (int) livroJava8;
		
		System.out.println(numeroInteiro);
		**/
		
		if (soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque está muito alto!");
		} else {
			System.out.println("Seu estoque está bom");
		}
		
		int v1 = 1;
		int v2 = 2;
		double valor = v1 > v2 ? 100 : 2;
		System.out.println(valor);
		
		
	}
}
