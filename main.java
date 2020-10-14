package ex2;

public class main {

	public static void main(String[] args) {
		chiffre_affaire ca = new chiffre_affaire();
		
		ca.ajout_CA("BNA", 56897.25);
		ca.ajout_CA("TEK", 4465.5);
		ca.ajout_CA("TELECOM", 41578.0);
		ca.ajout_CA("RootME", 3365.5);
		
		ca.suppression("RootME");
		
		ca.affiche();
		
		ca.CA_max();
		}

}
