import java.util.Random;
import java.util.Scanner;

public class ExoProjet {
    public static void main(String[] args) {
        /*Projet : Améliorez encore le justePrix: l'utilisateur
        a droit à 10 essais après ces 10 essais, il a perdu et
        l'ordinateur affiche le justePrix●Ajouter un niveau
        :○facile : entre 1 et 10○moyen : entre 1 et 100○difficile :
        entre 1 et 1000●Tant que la personne veut rejouer,
        redemandez le niveau et générez un nombre.●Vérifiez
        que tout caractère entré est correct,
        c'est-à-dire pour que le programme ne plante jamais*/

        //Déclaration
        int tentative, justePrix, proposition;
        int essai;
        boolean jouer;
        char niveau, facile, moyen, difficile;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Affectation
        facile = '1';
        moyen = '2';
        difficile = '3';

        //Affichage et saisie du jeu
        System.out.println("Voulez vous jouer? true/false");
        jouer = Boolean.parseBoolean(sc.nextLine());

        //Boucle pour trouver le juste prix
        while (jouer)
        {
            essai = 0;
            tentative = 0;
            System.out.println("Menu :");
            System.out.println("1. Facile(1-10)");
            System.out.println("2. Moyen(1-100");
            System.out.println("3. Difficile(1-1000");
            niveau = sc.nextLine().charAt(0);

            //Choix du niveau
            while ((niveau != '1') && (niveau != '2') && (niveau != '3'))
            {
                System.out.println("Erreur d'entrée, veuillez choisir entre 1, 2 ou 3!");
                niveau = sc.nextLine().charAt(0);
            }

            //Conditions du choix du niveau
            if (niveau == '1' || niveau == '2' || niveau == '3')
            {
                if (niveau == '1')
                {
                    justePrix = random.nextInt(10);
                }
                else if (niveau == '2')
                {
                    justePrix = random.nextInt(100);
                }
                else
                {
                    justePrix = random.nextInt(1000);
                }

                //Selection de la proposition
                System.out.println("Choix d'un nombre par l'ordinateur");
                System.out.println("Entre la proposition");
                proposition = Integer.parseInt(sc.nextLine());
                System.out.println(proposition);
                tentative = 1;

                //Boucle de tentative avec indications +/-
                do
                {
                    essai = essai + 1;

                    if ( proposition < justePrix)
                    {
                        System.out.println("C'est plus");
                    }
                    else
                    {
                        System.out.println("C'est moins");
                    }
                    proposition = Integer.parseInt(sc.nextLine());
                    System.out.println(proposition);
                    tentative = tentative + 1;
                }
                while ( (proposition != justePrix) && (essai < 10));

                //Affichage gagné/perdu
                if ( justePrix != proposition )
                {
                    System.out.println("Vous avez perdu!");
                    System.out.println("Le juste prix était"+ " "+ justePrix);
                }
                else
                {
                    System.out.println("C'est gagné!");
                    System.out.println(tentative + " " + "tentative avant de trouver la réponse");
                }

                //Demande à l'utilisateur si il veut rejouer
                System.out.println("Voulez vous rejouer? true/false");
                jouer = Boolean.parseBoolean(sc.nextLine());
            }
        }


    }
}
