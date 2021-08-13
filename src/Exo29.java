import java.util.Scanner;

public class Exo29 {
    public static void main(String[] args) {
        //exo29-Réalisez un algorithme nous permettant de déplacer un pion
        //dans un tableau de 10 éléments. Au début, le pion se trouve dans
        //la première case du tableau. Nous pouvons ensuite le déplacer par
        //la gauche (g), par la droite (d) ou de stopper l'algorithme (q).
        //Déclaration

        int indice;
        String deplacement;
        char d;
        String[] tab = {"X", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        int tailleTab = tab.length;
        Scanner sc = new Scanner(System.in);

        //Affichage du message de déplacement
        System.out.println("Déplacez vous avec g(gauche) et d(droite), q pour quitter");

        //Affichage de mon tableau et de mon pion en position 1
        System.out.print("[");

        for (int i = 0; i < tab.length; i++) {
            System.out.print(" " + tab[i] + " ");
            if (i < tab.length - 1) System.out.print("|");
        }

        System.out.println("]");

        //Boucle de déplacement  faire tant que 'q' n'est pas taper
        indice = 0;
        do {
            deplacement = sc.nextLine();
            d = deplacement.charAt(0);

            //Affichage d'une mauvaise entrée
            while (( d != 'g') && ( d != 'd') && ( d != 'q'))
            {
                System.out.println("Erreur d'entrée, veuillez choisir entre g, d ou q!");
                deplacement = sc.nextLine();
                d = deplacement.charAt(0);
            }

            if (d == ('g')) {

                if (indice > 0) {

                    //Inversion du pion vers la gauche
                    tab[indice] = " ";
                    indice--;
                    tab[indice] = "X";

                }
                else
                {
                    System.out.println("Mouvement impossible");
                }
            }
            // Déplacement vers la droite
            if (d == ('d')) {

                if (indice < tab.length - 1)
                {
                    //Inversion du pion vers la droite
                    tab[indice] = " ";
                    indice++;
                    tab[indice] = "X";

                }
                else
                {
                    System.out.println("Mouvement impossible");
                }
            }
            // Affichage de ton tableau
            System.out.print("[");

            for (int i = 0; i < tab.length; i++)
            {
                System.out.print(" " + tab[i] + " ");

                if (i < tab.length - 1) System.out.print("|");
            }
            System.out.println("]");
        }

        while (d != 'q');

    }
}
