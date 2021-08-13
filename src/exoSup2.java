import java.util.Scanner;

public class exoSup2 {
    public static void main(String[] args) {
    //2) Réalisez un algorithme qui demande un nombre
    //à l'utilisateur et affiche autant de ligne que le
    //nombre spécifié par l'utilisateur.
    //Exemple : l'utilisateur a rentré le nombre 5 et
    //l'algorithme affiche :
        // *
        // **
        // ***
        // ****
        // *****

        //Déclaration
        int nb, ligne;
        String etoile;
        Scanner sc = new Scanner(System.in);

        //Affectation
        etoile = "*";
        ligne = 0;

        //Saisie d'un nombre
        System.out.println("Entrez un nombre");
        nb = Integer.parseInt(sc.nextLine());

        //Boucle d'affichage des étoiles
        while ( ligne != nb )
        {
            System.out.println(etoile);
            ligne = ligne + 1;
            etoile = (etoile + "*");
        }




    }
}
