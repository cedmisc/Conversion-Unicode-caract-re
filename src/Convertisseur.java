
public class Convertisseur {
	
	/*Programme de conversion entre un code Unicode et le caract�re correspondant*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unicode;
		char caractere;
		
		System.out.println("Bienvenue!");
		System.out.println("Entrez un code Unicode: ");
		
		// Lecture via la classe 'Lire', la v�rification de l'entier est aussi r�alis�e avec message d'erreur le cas �ch�ant.
		unicode = Lire.Entier();
		caractere = (char) unicode;
		
		System.out.println("Le caract�re correspondant est: " + caractere);
	}

}
