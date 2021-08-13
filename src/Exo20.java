import java.util.Scanner;

public class Exo20 {
    public static void main(String[] args) {
        // exo20-Reprenez l’exercice précédent et modifiez-le pour que
        // l’utilisateur entre également l’exposant qu’il désire calculer.

        //Déclaration
        int nombre, resultat, compteur, exp;
        Scanner sc = new Scanner(System.in);

        //Demander à l'utilisateur d'entrer un nombre
        System.out.println("Entrez un nombre");
        nombre = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez un exposant");
        exp = Integer.parseInt(sc.nextLine());

        //Affectation
        compteur = 0;
        resultat = 1;

        //Boucler sur l'exposant 10
        while ( compteur < exp )
        {
            //Calculer le résultat
            resultat = resultat * nombre;
            //Attention boucle infinie
            compteur = compteur + 1;
        }
        // Afficher le résultat
        System.out.println(nombre + " exposant " + exp + " = " + resultat);


    }
}
