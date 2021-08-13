import java.util.Scanner;

public class Exo23 {
    public static void main(String[] args) {
        //exo23-BONUS: initialiser un tableau de 10 entiers avec les valeurs
        //2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 à l’aide d’une boucle.
        //Ensuite, à l’aide d’une boucle afficher la valeur de chaque cellule
        //du tableau avec l’opération Ecrire().

        int[] tableau = new int[10];
        int i, r, puissance, n;

        puissance = 0;
        i = 0;
        n = 2;
        r = 1;
        Scanner sc = new Scanner(System.in);
        while ( puissance != 10 )
        {
            puissance = puissance + 1;
            r = n * r;
            tableau [i] = r;
            i++;
        }

        System.out.println("Affichage des valeurs du tableau");

        i = 0;
        while (i < tableau.length) {
            System.out.println(tableau[i]);
            i++;
        }
    }
}
