import java.util.Random;
import java.util.Scanner;

public class Exo32 {
    public static void main(String[] args) {
        //exo32-En considérant deux tableaux d'entiers (non triés),
        //réalisez un algorithme qui place tous les éléments des deux
        //tableaux dans un troisième. Ce dernier doit être trié une fois
        //l'algorithme terminé. Notez que le tri doit être fait en même temps
        //que la fusion des deux tableaux et pas après.


        //Déclaration
        int temp = 0, indice=0;
        final int TAB1_TAILLE = 4; // nombre d'éléments dans le tableau 1
        int[] tab1 = new int[TAB1_TAILLE];
        final int TAB2_TAILLE = 4; // nombre d'éléments dans le tableau 2
        int[] tab2 = new int[TAB2_TAILLE];
        final int TAB3_TAILLE = 8; // nombre d'éléments dans le tableau 3
        int[] tab3 = new int[TAB3_TAILLE];
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez les valeurs du tableau 1");

        //Entrer des valeurs du tableau 1 + insertion dans le tableau 3
        for ( int i = 0; i < TAB1_TAILLE; i++) {
                tab1[i] = Integer.parseInt(sc.nextLine());
                tab3[indice] = tab1[i];
                System.out.print("[" + tab1[i] + "]");
                indice++;
        }

        System.out.println("Entrez les valeurs du tableau 2");

        //Entrer des valeurs du tableau 2 + insertion dans le tableau 3
        for ( int i = 0; i < TAB2_TAILLE; i++) {
                tab2[i] = Integer.parseInt(sc.nextLine());
                tab3[indice] = tab2[i];
                System.out.print("[" + tab2[i] + "]");
                indice++;
        }


        //Triage du tableau 3
        for  ( int i = 0; i < TAB3_TAILLE-1; i++) {

            //Boucle pour comparer les valeurs et les remettres dans l'orde
            for (  indice = 1; indice < (TAB3_TAILLE); indice++) {

                //Condition ( si I-1 est plus grand que I alors on l'inverse )
                if (tab3[indice-1] > tab3[indice]){

                    temp = tab3[indice - 1];
                    tab3[indice - 1] = tab3[indice];
                    tab3[indice] = temp;
                }
            }
        }



        //Affichage des tableaux
        System.out.println("Tableau 1");
        for( int i = 0; i<TAB1_TAILLE;i++) {
            System.out.print("[" + tab1[i] + "]");
        }
        System.out.println("\nTableau 2");
        for( int i = 0; i<TAB2_TAILLE;i++) {
            System.out.print("[" + tab2[i] + "]");
        }
        System.out.println("\nTableau 3");
        for( int i = 0; i<TAB3_TAILLE;i++) {
            System.out.print("[" + tab3[i] + "]");
        }
    }
}

