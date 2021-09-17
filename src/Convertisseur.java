
public class Convertisseur {
	
	/*Programme de conversion entre un code Unicode et le caractère correspondant*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unicode;
		char caractere;
		
		System.out.println("Bienvenue!");
		System.out.println("Entrez un code Unicode: ");
		
		// Lecture via la classe 'Lire', la vérification de l'entier est aussi réalisée avec message d'erreur le cas échéant.
		unicode = Lire.Entier();
		caractere = (char) unicode;
		
		System.out.println("Le caractère correspondant est: " + caractere);
	}

}
