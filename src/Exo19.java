import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args) {
        // exo19-À l’aide de la boucle TantQue … Faire, réalisez un algorithme
        // calculant le résultat de N10. N étant un nombre saisi par l’utilisateur.

        //Déclaration
        int nombre, resultat, compteur;
        Scanner sc = new Scanner(System.in);

        //Demander à l'utilisateur d'entrer un nombre
        System.out.println("Entrez un nombre");
        nombre = Integer.parseInt(sc.nextLine());

        //Affectation
        compteur = 0;
        resultat = 1;

        //Boucler sur l'exposant 10
        while ( compteur < 10 )
        {
            //Calculer le résultat
            resultat = resultat * nombre;
            //Attention boucle infinie
            compteur = compteur + 1;
        }
        // Afficher le résultat
        System.out.println( nombre + " expostant 10 = " + resultat );
    }
}
