import java.util.Scanner;
public class Exo25 {
    public static void main(String[] args) {
        //exo25-Inverser un tableau: soit un tableau T. Saisir ce tableau.
        //Changer de place les éléments de ce tableau de façon à ce que le
        //nouveau tableau soit une sorte de miroir de l'ancien et afficher le nouveau tableau.

        //Déclaration
        int  i, i1 ;
        final int MAX = 3;
        int[] tableau = new int[MAX];
        int[] tableau1 = new int[MAX];
        i1 = MAX;

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer les valeurs tu tableau");

        //Tableau avec valeur aléatoir
        for (  i = 0; i < MAX; i++ )
        {
            tableau[i] = Integer.parseInt(sc.nextLine());
            System.out.println(tableau[i]);
            tableau1[i1-1] = tableau[i];
            i1 --;
        }

        //Affichage du nouveau tableau
        for ( i =0; i < MAX; i++)
        {
            System.out.println(tableau1[i]);
        }
    }
}
