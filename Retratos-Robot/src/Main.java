import java.util.Scanner;

public class Main {
	
	static Scanner in = new Scanner(System.in);
	static String [][] rasgos = {
		{"pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
		{"ojos", "|  O O  |", "|-(� �)-|", "|-(o o)-|", "|  \\ /  |"},
		{"nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
		{"boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
		{"barbilla", "\\_______/", "\\,,,,,,,/"}
	};
	
	static String getRasgo(int faccion) {
		int rasgo;
		for (int i=1; i<rasgos[faccion].length; i++)
			System.out.println(i + " - " + rasgos[faccion][i]);
		do {
			System.out.println("Elige la opci�n para " + rasgos[faccion][0] + " (1-" + (rasgos[faccion].length - 1) + "):");
			rasgo = in.nextInt();
			if (rasgo < 1 || rasgo > rasgos[faccion].length)
				System.out.println("La opci�n elegida no es correcta. Vuelve a introducirla");
		} while (rasgo < 1 || rasgo > rasgos[faccion].length);
		return rasgos[faccion][rasgo];
	}
	
	public static void main(String[] args) {
		
		String [] retrato = new String[5];
		for (int i=0; i<retrato.length; i++)
			retrato[i] = getRasgo(i);
		for (int i=0; i<retrato.length; i++)
			System.out.println(retrato[i]);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static void retratos() {
//		Scanner teclado = new Scanner(System.in);
//		int opcionPelo;
//		do {
//			System.out.println("Selecciona el pelo(1-4): ");
//			System.out.println("1. WWWWWWWWW ");
//			System.out.println("2. \\\\\\//////");
//			System.out.println("3. |\"\"\"\"\"\"\"|");
//			System.out.println("4. |||||||||");
//
//			opcionPelo = teclado.nextInt();
//			if (opcionPelo > 4 || opcionPelo < 1) {
//				System.out.println("opci�n no v�lida para pelo, vuelve a introducir");
//			}
//		} while (opcionPelo > 4 || opcionPelo < 1);
//
//		int opcionOjos;
//		do {
//			System.out.println("Selecciona los ojos(1-4): ");
//			System.out.println("1. |  O O  |");
//			System.out.println("2. |-(� �)-|");
//			System.out.println("3. |-(o o)-|");
//			System.out.println("4. |  \\ /  |");
//
//			opcionOjos = teclado.nextInt();
//			if (opcionOjos > 4 || opcionOjos < 1) {
//				System.out.println("opci�n no v�lida para ojos, vuelve a introducir");
//			}
//		} while (opcionOjos > 4 || opcionOjos < 1);
//
//		int opcionNariz;
//
//		do {
//			System.out.println("Selecciona la Nariz y Orejas(1-4): ");
//			System.out.println("1. @   J   @");
//			System.out.println("2. {   \"   }");
//			System.out.println("3. [   j   ]");
//			System.out.println("4. <   -   >");
//
//			opcionNariz = teclado.nextInt();
//			if (opcionNariz > 4 || opcionNariz < 1) {
//				System.out.println("opci�n no v�lida para Nariz, vuelve a introducir");
//			}
//		} while (opcionNariz > 4 || opcionNariz < 1);
//
//		int opcionBoca;
//
//		do {
//			System.out.println("Selecciona la Boca(1-4): ");
//
//			System.out.println("1. |  ===  |");
//			System.out.println("2. |   -   |");
//			System.out.println("3. |  ___  |");
//			System.out.println("4. |  ---  |");
//
//			opcionBoca = teclado.nextInt();
//			if (opcionBoca > 4 || opcionBoca < 1) {
//				System.out.println("opci�n no v�lida para Boca, vuelve a introducir");
//			}
//		} while (opcionBoca > 4 || opcionBoca < 1);
//
//		switch (opcionPelo) {
//		case 1:
//			System.out.println("WWWWWWWWW");
//			break;
//		case 2:
//			System.out.println("\\\\\\//////");
//			break;
//		case 3:
//			System.out.println("|\"\"\"\"\"\"\"|");
//			break;
//		case 4:
//			System.out.println("|||||||||");
//
//		}
//		switch (opcionOjos) {
//		case 1:
//			System.out.println("|  O O  |");
//			break;
//		case 2:
//			System.out.println("|-(� �)-|");
//			break;
//		case 3:
//			System.out.println("|-(o o)-|");
//			break;
//		case 4:
//			System.out.println("|  \\\\ /  |");
//
//		}
//
//		switch (opcionNariz) {
//		case 1:
//			System.out.println("@   J   @");
//			break;
//		case 2:
//			System.out.println("{   \"   }");
//			break;
//		case 3:
//			System.out.println("[   j   ]");
//			break;
//		case 4:
//			System.out.println("<   -   >");
//
//		}
//
//		switch (opcionBoca) {
//		case 1:
//			System.out.println("|  ===  |");
//			break;
//		case 2:
//			System.out.println("|   -   |");
//			break;
//		case 3:
//			System.out.println("|  ___  |");
//			break;
//		case 4:
//			System.out.println("|  ---  |");
//		}
//		
//		System.out.println("\\_______/ ");
//		
//		System.out.println("  WANTED   ");
	

	
	
	


