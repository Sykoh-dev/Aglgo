import java.util.Random;
import java.util.Scanner;

public class Pendu {

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
    public static void affichageMenu(int nivWin) {

        System.out.println("|---------------------------------------------------------------------|");
        System.out.println("| Le pendu :                                                          |");
        System.out.println("|---------------------------------------------------------------------|");
        System.out.println("| Vous avez réussi " + nivWin + " niveaux                             |");
        System.out.println("|---------------------------------------------------------------------|");
        System.out.println("Choisissez un niveau  :");
        System.out.println(ANSI_GREEN + "1 = niveau facile     : 5 à 6 lettres oooo" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "2 = niveau moyen      : 7 à 10 lettres oooo" + ANSI_RESET);
        System.out.println(ANSI_RED + "3 = niveau difficile  : 12 à 26 lettres oooo" + ANSI_RESET);
        System.out.println("Quel niveau ?");
    }

    public static void affichageJeu(int[] tabProposition, char[] tabMotAChercher, int j) {

        System.out.print(" Le mot mystère : ");
        for (int i = 0; i < tabMotAChercher.length; i++) {
            tabMotAChercher[i] = '_';
            System.out.print(tabMotAChercher[i]);

        }

        System.out.println("\n|-------------------------------------------------------------------------|");
        System.out.println("|            |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  | 1 0  |");
        System.out.println("|-------------------------------------------------------------------------|");
        System.out.println("|Proposition |     |     |     |     |     |     |     |     |     |      |");
        System.out.println("|-------------------------------------------------------------------------|");
        System.out.println("Votre proposition:" + tabProposition[j]);
        int i=0;
    }

    public static void affichageLettre(int[] tabProposition, char[] tabMotAChercher, int j, char lettreChoix) {

        System.out.print(" Le mot mystère : ");
        for (int i = 0; i < tabMotAChercher.length; i++) {
            System.out.print(tabMotAChercher[i]);

        }

        System.out.println("\n|-------------------------------------------------------------------------|");
        System.out.println("|            |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  | 1 0  |");
        System.out.println("|-------------------------------------------------------------------------|");
        System.out.println("|Proposition |     |     |     |     |     |     |     |     |     |      |");
        System.out.println("|-------------------------------------------------------------------------|");
        System.out.println("Votre proposition:" + tabProposition[j] + " " + lettreChoix);
        int i=0;
    }
//FONCTION

    // Retour d'un booléen pour savoir si on est arrivé au bout de nos propositions
    public boolean estPendu(int pendu) {

        boolean valeur = false;
        if (pendu <= 0) {
            valeur = true;
        }
        return valeur;
    }

    //MAIN
    public static void main(String[] args) {

        //Déclararation des variables
        int reussiteNiv, proposition, erreur = 0, nb, longueurMotAChercher = 0, nivWin = 0, i = 0, k = 0, j = 0;
        int nbLettresBonnes = 0;
        boolean jouerPendu = true, motTrouver, lettre = false;
        char niveau, facile, moyen, difficile, o, lettreChoix = (' ');
        int[] tabFacileWin = new int[4];
        int[] tabMoyenWin = new int[4];
        int[] tabDifficileWin = new int[4];
        int[] tabProposition = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random rand = new Random();
        String[] tabMotFacile = {"lourd", "prune", "mignon", "goblet"};
        String[] tabMotMoyen = {"losange", "gangster", "forteresse", "apocalypse"};
        String[] tabMotDifficile = {"conspirateur", "sorcellerie", "abracadabra", "chlorophylle "};
        String motADeviner = ("");
        char tabMotAChercher[];
        char lettreFausse[];
        lettreFausse = new char[10];
        tabMotAChercher = new char[longueurMotAChercher];

        Scanner sc = new Scanner(System.in);


        //Affectation
        facile = ('1');
        moyen = ('2');
        difficile = ('3');
        reussiteNiv = 0;

        //Entrée dans le jeu avec affichage du menu
        while (jouerPendu) {

            //Boucle pour compter le réussite d'un niveau

            erreur = 0;
            tabProposition[j] = 0;
            nbLettresBonnes = 0;
            longueurMotAChercher = 0;
            affichageMenu(nivWin);
            niveau = sc.nextLine().charAt(0);

            //Choix du niveau avec message d'erreur si le choix est incorrect
            while ((niveau != '1') && (niveau != '2') && (niveau != '3')) {
                System.out.println(ANSI_PURPLE + "Niveau inconnu : veuillez saisir 1, 2 ou 3" + ANSI_RESET);
                niveau = sc.nextLine().charAt(0);
            }

            //Condition d'entrée dans un niveau avec choix d'un mot en fonction du niveau
            if (niveau == '1' || niveau == '2' || niveau == '3') {

                if (niveau == '1') {
                    //for(int iFacile = 0; iFacile < tabFacileWin.length; iFacile++) {

                    nb = rand.nextInt(tabMotFacile.length);
                    motADeviner = tabMotFacile[nb];
                    longueurMotAChercher = motADeviner.length();
                    tabMotAChercher = new char[longueurMotAChercher];

                    //}
                } else if (niveau == '2') {
                    //for(int iMoyen = 0; iMoyen < tabMoyenWin.length; iMoyen++) {

                    nb = rand.nextInt(tabMotMoyen.length);
                    motADeviner = tabMotMoyen[nb];
                    longueurMotAChercher = motADeviner.length();
                    tabMotAChercher = new char[longueurMotAChercher];

                    //}
                } else {
                    //for (int iDifficile = 0; iDifficile < tabDifficileWin.length; iDifficile++) {

                    nb = rand.nextInt(tabMotDifficile.length);
                    motADeviner = tabMotDifficile[nb];
                    longueurMotAChercher = motADeviner.length();
                    tabMotAChercher = new char[longueurMotAChercher];
                    //}
                }


            }

            affichageJeu(tabProposition, tabMotAChercher, j);

            motTrouver = false;
            do {


                affichageLettre(tabProposition, tabMotAChercher, j, lettreChoix);
                lettreChoix = sc.nextLine().charAt(0);


                //Boucle de recherche de bonne lettre tappée par l'utilisateur
                for (i = 0; i < tabMotAChercher.length; i++) {


                    if (lettreChoix == motADeviner.charAt(i)) {


                        tabMotAChercher[i] = lettreChoix;
                        lettre = true;
                    }


                }

                //Si la lettre tappée est mauvaise, on rajoute +1 à erreur
                if (lettre != true) {

                    erreur = erreur + 1;
                    tabProposition[j] = j++;

                }



                if (lettre) {


                    for (i = 0; i < tabMotAChercher.length; i++) {


                        //Comptage des lettres
                        if (tabMotAChercher[i] == motADeviner.charAt(i)) {

                            nbLettresBonnes = nbLettresBonnes + 1;


                        }

                        //Si le nombre de lettres bonnes = le nombre de tiret, l'utilisateur gagne
                        if (nbLettresBonnes == motADeviner.length()) {

                            motTrouver = true;
                            affichageLettre(tabProposition, tabMotAChercher, j, lettreChoix);

                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println(ANSI_GREEN + "Gagné" + ANSI_RESET);
                            System.out.println("-----------------------------------------------------------------------------");


                        }

                    }

                }
                lettre = false;
            }
                while ((erreur != 9) && (motTrouver == false)) ;


                //Si l'erreur arrive à 11 on perd
                if (erreur == 9) {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println(ANSI_RED + "C'est perdu ! Le mot était : " + motADeviner + ANSI_RESET);
                    System.out.println("-----------------------------------------------------------------------------");

                }

                //Demande à l'utilisateur si il veut rejouer
                System.out.println("Voulez vous rejouer? true/false");
                jouerPendu = Boolean.parseBoolean(sc.nextLine());



        }

    }
}

