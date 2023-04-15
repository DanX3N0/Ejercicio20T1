import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String textoACifrar = scan.nextLine();
		System.out.println(cifrarTexto(textoACifrar));
	}
	public static  String cifrarTexto(String texto) {
		String textoCifrado = "";
		for(int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);
			if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				textoCifrado += "$";
			}else {
				textoCifrado += "#";
			}
		}
		return textoCifrado;
	}
	
}
