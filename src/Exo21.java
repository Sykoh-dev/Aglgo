import java.util.Random;
import java.util.Scanner;

public class Exo21 {
    public static void main(String[] args) {
        // exo21-Améliorez le "C'est plus, c'est moins, c'est gagné"
        // pour qu'il tourne en boucle tant que le justePrix n'a pas
        // été trouvé. L'ordinateur choisit un nombre aléatoirement
        // entre 1 et 100.
        // L'utilisateur est invité à entrer un nombre et l'algorithme
        // nous répond "C'est plus" ou "C'est moins". Lorsqu'on a trouvé
        // le bon nombre, l'algorithme affiche le nombre de tentatives
        // effectuées pour trouver le résultat

        //Déclaration
        int justePrix, proposition;
        double nbTentatives;
        final double MAX_NB_TENTATIVES = 10;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        //Affectation
        nbTentatives = MAX_NB_TENTATIVES;

        //Générer le juste prix
        justePrix = random.nextInt(100);

        //Demander à l'utilisateur une proposition
        System.out.println("Entrez une proposition");
        proposition = Integer.parseInt(sc.nextLine());
        nbTentatives = nbTentatives - 1;

        while ( proposition != justePrix )
        {
            if ( proposition < justePrix )
            {
                System.out.println("C'est plus");
            }
            else
            {
                System.out.println("C'est moins");
            }
            System.out.println("Entrez une proposition");
            proposition = Integer.parseInt(sc.nextLine());
            nbTentatives = nbTentatives - 1;

        }
        System.out.println("C'est gagné en " + (MAX_NB_TENTATIVES - nbTentatives) + " tentatives !");


    }


}
