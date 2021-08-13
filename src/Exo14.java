import java.util.Scanner;

public class Exo14 {
    public static void main(String[] args) {
        //exo14-Reprenez l’algorithme du lanceur de balles
        //de tennis et faites en sorte qu’il lance une balle
        //tant que le stock n’est pas vide. Il y a donc 2 variables
        //stockBalleset pret

        boolean pret;
        int stockBalles;

        //Demander à l'utilisateur (stockBalles)
        System.out.println("Combien de balles avez vous?");
        Scanner sc = new Scanner(System.in);
        stockBalles = Integer.parseInt(sc.nextLine());

        //Vérification de pret et stockBalles avec boucle et condition
        while ( stockBalles !=0 )
        {
            System.out.println("Etes-vous prêt ? true/false");
            pret = Boolean.parseBoolean(sc.nextLine());

            if ( pret )
            {
                stockBalles = stockBalles - 1;
                System.out.println("Lancer la balles");
            }
            else
            {
                System.out.println("Ne pas lancer la balle!");
                System.out.println("Vous n'êtes pas prêt");
            }

        }
        //Affichage de fin de boucle
        System.out.println("Le panier est vide");
    }
}
