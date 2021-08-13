import java.util.Scanner;

public class Exo16 {
    public static void main(String[] args) {
        // exo16-Un algorithme reçoit deux nombres de l’utilisateur (opération Lire) :
        // justePrix et proposition.
        // • Il répond : « C’est plus » lorsque proposition est plus petit
        //   que justePrix.
        // • Et inversement, il répond : « C’est moins » lorsque proposition
        //   est plus grand que justePrix.
        // • Si justePrix est égal à proposition, il répond : « C’est gagné ».

        int justePrix, proposition;

        System.out.println("Entrez un juste prix : (nombre à deviner)");
        Scanner sc = new Scanner(System.in);
        justePrix = Integer.parseInt(sc.nextLine());

        System.out.println("Entrez une proposition");
        proposition = Integer.parseInt(sc.nextLine());

        while ( proposition != justePrix )
        {
            if ( proposition < justePrix )
            {
                System.out.println("C'est plus");
            }
            else
            {
                System.out.println("C'est moins");
            }
            System.out.println("Entrez une proposition");
            proposition = Integer.parseInt(sc.nextLine());

        }
        System.out.println("C'est gagné !");
    }
}
