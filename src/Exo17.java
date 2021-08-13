import java.util.Scanner;

public class Exo17 {
    public static void main(String[] args) {

    // exo18-À l’aide d’une boucle Faire … TantQue, améliorez l’algorithme
    // de la calculatrice afin qu’elle demande à l’utilisateur s’il veut
    // faire un autre calcul (tant qu’il le désire).

        //Déclaration
        boolean encore;
        int choix, stockEau, stockCoca, stockFanta;

        //Affectation
        stockEau = 1;
        stockCoca = 5;
        stockFanta = 0;

        do
        {

            //Demander à l'utilisateur quelle boisson veut-il
            System.out.println("Menu : ");
            System.out.println("1 : Eau");
            System.out.println("2 : Coca");
            System.out.println("3 : Fanta");
            Scanner sc = new Scanner(System.in);
            choix = Integer.parseInt(sc.nextLine());

            //Vérifier la boisson et le stock
            if ((choix == 1) || (choix == 2) || (choix == 3)) {
                //Boisson reconnue
                if (choix == 1) {
                    //Eau
                    if (stockEau > 0) {
                        System.out.println("Merci pour votre achat");
                        stockEau = stockEau - 1;
                    } else {
                        System.out.println("Il n'y a plus de stock");
                    }
                } else if (choix == 2) {
                    //Coca
                    if (stockCoca > 0) {
                        System.out.println("Merci pour votre achat");
                        stockCoca = stockCoca - 1;
                    } else {
                        System.out.println("Il n'y a plus de stock");
                    }
                } else {
                    //Fanta
                    if (stockFanta > 0) {
                        System.out.println("Merci pour votre achat");
                        stockFanta = stockFanta - 1;
                    } else {
                        System.out.println("Il n'y a plus de stock");
                    }
                }
            } else
            //Boisson non reconnue
            {
                System.out.println("Boisson non reconnue");
            }
            System.out.println("Voulez-vous encore acheter ?");
            encore = Boolean.parseBoolean(sc.nextLine());
        }
        while ( encore );


    }
}