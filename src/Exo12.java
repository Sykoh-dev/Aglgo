import java.util.Scanner;

public class Exo12 {
    public static void main(String[] args) {
        /* Réalisez un algorithme utilisant le convertisseur de secondes,
   il reçoit deux durées en jours, heures, minutes et secondes et
   calcule la différence entre ces dernières puis l'affiche
   au format : jours, heures, minutes, secondes.*/

        int jour1, heure1, minute1, seconde1;
        int jour2, heure2, minute2, seconde2;
        int jourT, heureT, minuteT, secondeT;
        int duree1, duree2, dureeT;

        System.out.println("Entrez la première durée");
        Scanner sc = new Scanner(System.in);
        jour1 = Integer.parseInt(sc.next());
        heure1 = Integer.parseInt(sc.next());
        minute1 = Integer.parseInt(sc.next());
        seconde1 = Integer.parseInt(sc.next());

        System.out.println("Entrez la seconde durée");
        jour2 = Integer.parseInt(sc.next());
        heure2 = Integer.parseInt(sc.next());
        minute2 = Integer.parseInt(sc.next());
        seconde2 = Integer.parseInt(sc.next());

        duree1 = jour1 * 86400 + heure1 * 3600 + minute1 * 60 + seconde1;
        duree2 = jour2 * 86400 + heure2 * 3600 + minute2 * 60 + seconde2;

        dureeT = duree1 - duree2;

        if ( dureeT > 0 )
        {
            jourT = dureeT / 86400;
            heureT = (dureeT % 86400) / 3600;
            minuteT = ((dureeT % 86400) % 3600) / 60;
            secondeT = ((dureeT % 86400) % 3600) % 60;
        }
        else
        {
            jourT = 0;
            heureT = 0;
            minuteT = 0;
            secondeT = 0;
        }
        System.out.println(jourT + " jours " + heureT + " heures " + minuteT + " minutes " + secondeT + " secondes.");
    }
}
