import java.util.Random;
import java.util.Scanner;

public class ExoProjet2 {

    //COLOR FRONT
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //COLOR BACK
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
//PROCEDURE
    //Affichage du message : Voulez vous jouer
    public static void jeu(){
        System.out.println(ANSI_BLACK_BACKGROUND+ANSI_WHITE + "     [LE JUSTE PRIX]     "    + ANSI_RESET);
        System.out.println("Voulez vous jouer? (true/false)");
    }

    //Affichage du menu du jeu
    public static void menu(){
        System.out.println("Menu :");
        System.out.println(ANSI_GREEN +"1. Facile(1-10)"+ ANSI_RESET);
        System.out.println(ANSI_BLUE +"2. Moyen(1-100)"+ ANSI_RESET);
        System.out.println(ANSI_RED +"3. Difficile(1-1000)"+ ANSI_RESET);
    }

    //Affichage du message de fin de jeu ( gagné ou perdu )
    public static void winOrNot(int justePrix, int proposition, int tentative){
        if ( justePrix != proposition )
        {
            System.out.println("Vous avez perdu!");
            System.out.println("Le juste prix était"+ " "+ justePrix);
        }
        else
        {
            System.out.println(ANSI_YELLOW+"Félicitation vous avez gagné!"+ ANSI_RESET);
            System.out.println(" vous avez mis " + tentative + " " + "tentative avant de trouver la réponse\n");
        }
    }

    //Affichage d'un message de plus ou de moins si la proposition n'est pas bonne
    public static void lessOrMore(int proposition, int justePrix){
        if ( proposition < justePrix)
        {
            System.out.println("C'est plus!");
        }
        else
        {
            System.out.println("C'est moins!");
        }
    }

//MAIN
    public static void main(String[] args) {

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
        jeu();
        jouer = Boolean.parseBoolean(sc.nextLine());

        //Boucle principal pour trouver le juste prix
        while (jouer)
        {
            essai = 0;
            tentative = 0;
            menu();
            niveau = sc.nextLine().charAt(0);

            //Choix du niveau avec message d'erreur si le choix est incorrect
            while ((niveau != '1') && (niveau != '2') && (niveau != '3'))
            {
                System.out.println("Erreur d'entrée, veuillez choisir entre 1, 2 ou 3!");
                niveau = sc.nextLine().charAt(0);
            }

            //Conditions du choix du niveau avec selection d'un nombre random par l'ordinateur
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

                //Selection de la proposition pour trouver le justePrix
                System.out.println("Choix d'un nombre par l'ordinateur");
                System.out.println("Entrez votre proposition");
                proposition = Integer.parseInt(sc.nextLine());
                System.out.println("->"+proposition+"<-");
                tentative = 1;

                //Boucle de tentative avec indications +/-
                do
                {
                    essai = essai + 1;
                    lessOrMore(proposition, justePrix);
                    proposition = Integer.parseInt(sc.nextLine()); // Entrer de la proposition
                    System.out.println("->"+proposition+"<-"); //Affichage de la proposition du joueur
                    tentative = tentative + 1;
                }
                while ( (proposition != justePrix) && (essai < 10));

                //Affichage gagné/perdu
                winOrNot(justePrix, proposition, tentative);

                //Demande à l'utilisateur si il veut jouer à nouveau
                jeu();
                jouer = Boolean.parseBoolean(sc.nextLine());
            }
        }


    }
}
