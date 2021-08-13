//exo35-Réalisez une procédure dont l’objectif est de fusionner deux tableaux d’entiers.

public class Exo35 {

    //(PROCEDURE) Insertion du tableau 1 et 2 dans le tableau 3
    public static void insertionTab(int tab1[], int tab2[], int tab3[]) {


        for (int indice = 0; indice < tab3.length; indice++) {
            for (int i = 0; i < tab1.length; i++) {
                tab3[indice] = tab1[i];
                indice++;
            }
            for (int i = 0; i < tab1.length; i++) {
                tab3[indice] = tab2[i];
                indice++;
            }

        }
    }

        //(PROCEDURE) Affichage des tableaux 1, 2, 3
        public static void affichageTab (int tab1[], int tab2[], int tab3[]){


            System.out.println("\nTableau 1");
            for (int i = 0; i < tab1.length; i++) {
                System.out.print("[" + tab1[i] + "]");
            }
            System.out.println("\nTableau 2");
            for (int i = 0; i < tab2.length; i++) {
                System.out.print("[" + tab2[i] + "]");
            }
            System.out.println("\nTableau 3");
            for (int i = 0; i < tab3.length; i++) {
                System.out.print("[" + tab3[i] + "]");
            }
        }

        //(MAIN)
        public static void main (String[]args){

            //Déclaration
            int[] tab1 = {1, 2, 3, 4};
            int[] tab2 = {5, 6, 7, 8};
            final int TAB3_TAILLE = 8; // nombre d'éléments dans le tableau 3
            int[] tab3 = new int[TAB3_TAILLE];

            insertionTab(tab1, tab2, tab3);

            affichageTab(tab1, tab2, tab3);

        }


}

