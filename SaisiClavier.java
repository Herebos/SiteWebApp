import java.util.Scanner;
public class SaisiClavier {
	public static void main (String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez votre nom");
		String nom = clavier.nextLine();
		System.out.println("Entrez votre style");
		String style = clavier.nextLine();
		System.out.println("Entrez votre instrument");
		String instru = clavier.nextLine();
		System.out.println("Vous êtes "+nom+", vous jouez du "+style+" sur "+instru);
		clavier.close();
	}
}
