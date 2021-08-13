import java.util.Scanner;

public class Exo09 {
    public static void main(String[] args) {

        // exo09-Distributeur de boissons
// Réalisez l’algorithme d’un distributeur de boissons.
// Ce dernier propose plusieurs boissons et l’utilisateur choisit celle
// qu’il désire en entrant le numéro correspondant. N'oubliez pas de vérifier
// s’il y a encore des boissons en stock.

        //Déclaration
        int choix, stockEau, stockCoca, stockFanta;

        //Affectation
        stockEau = 1;
        stockCoca = 5;
        stockFanta = 0;

        //Demander à l'utilisateur quelle boisson veut-il
        System.out.println("Menu : ");
        System.out.println("1 : Eau");
        System.out.println("2 : Coca");
        System.out.println("3 : Fanta");
        Scanner sc = new Scanner (System.in);
        choix = Integer.parseInt(sc.nextLine());

        //Vérifier la boisson et le stock
        if ((choix==1) || (choix==2) || (choix==3)) {
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
        }
        else
                //Boisson non reconnue
            {
                System.out.println("Boisson non reconnue");
            }


    }
}

