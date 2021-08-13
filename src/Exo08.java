import java.util.Scanner;

public class Exo08 {
    public static void main(String[] args) {
        // exo08 - Lanceur de balles
        // Réalisez l’algorithme d’un lanceur de balles de tennis. Ce lanceur possède deux états :
        // – pret : permet de savoir si le tennisman est prêt. Il ne faut pas lancer de balles dans
        // le cas contraire
        // – panierVide : permet de savoir s’il y a encore des balles disponibles
        // Le lanceur de balle possède l’opération « lancerBalle » qui, vous l’aurez compris,
        // permet de lancer une balle.


        // Déclaration
        boolean pret;
        boolean panierVide;

        // Demander à l'utilisateur (prêt & panier vide)
        System.out.println("Êtes-vous prêt ? true/false");
        Scanner sc = new Scanner (System.in);
        pret = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Le panier est-il vide ? true/false");
        panierVide = Boolean.parseBoolean(sc.nextLine());

        // Vérification
        if (pret && (!panierVide))
        {

            System.out.println("Lancer la balle");
        }

        else
        {
            System.out.println("Ne pas lancer la balle");


            if (!pret)
            {
                System.out.println("Vous n'êtes pas prêt");
            }

            if (panierVide)
            {
                System.out.println("Le panier est vide");
            }
        }

    }
}
