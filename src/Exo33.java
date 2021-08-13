import java.util.Scanner;

  /*         !EXEMPLE!
    public  static void procedure(){
        System.out.println("Hello World");
    }
    public static int fonction(){
        return 5;
    }

    public static void main(String[] args) {
        procedure();
        System.out.println("Le nombre retourné est " + fonction());
    }*/

public class Exo33 {

    //exo33-Réalisez une fonction calculant le carré d’un nombre entier donné en paramètre.

    // Fonction du calcul du carré
    public static int multiplication(int nb1, int nb2){

        return (nb1*nb2);
    }

    public static void main(String[] args) {

        //Déclaration
        int nb;
        Scanner sc = new Scanner(System.in);

        //Affichage + saisie du nombre à calculer pour trouver le carré
        System.out.println("Entrez une valeur pour trouver son carré");
        nb = Integer.parseInt(sc.nextLine());

        //Affichage du résultat par appel de la fonction
        //System.out.println("Le carré de "+ nb + " est : " + carré(nb));
    }
}
