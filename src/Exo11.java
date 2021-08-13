import java.util.Scanner;

public class Exo11 {
    public static void main(String[] args) {
        // exo11-Note
// Ecrire un algorithme qui met l'appréciation par rapport à des
// notes. Ces notes sont comprises entre 0 et 20.
// 0-10 : I, 11-12 : S, 13-15 : B, 16-18 : TB, 19-20 : Excellent
// /!\ Gérer les erreurs : ex : -2; 25
        double note;

        System.out.println("Entrez une note : ");
        Scanner sc = new Scanner(System.in);
        note = Double.parseDouble(sc.nextLine());

        if ((note >= 0) && ( note <= 20))
        {
            // if ( interval.getSeconds() >=0 ) && ( interval.getSeconds() <= 40 )
            //
            // while ( i < 40 )
            // i=i+2
            // point = 10
            //
            if (note < 11)
            {
                System.out.println("Insuffisant");
            }
            else if (note < 13)
            {
                System.out.println("Suffisant");
            }
            else if (note < 16)
            {
                System.out.println("Bien");
            }
            else if (note < 19)
            {
                System.out.println("Très bien");
            }
            else
            {
                System.out.println("Excellent");
            }
        }
        else
        {
            System.out.println("La note n'est pas comprise entre 0 et 20");
        }
    }
}
