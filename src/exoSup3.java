import java.util.Scanner;

public class exoSup3 {
    public static void main(String[] args) {
        //Ecrivez un algorithme qui demande à l’utilisateur de taper
        //10 entiers et qui affiche le plus petit de ces entiers.

        int nb, nb10, min;
        Scanner sc = new Scanner(System.in);

        nb10 = 1;

        System.out.println("Entrez un nombre");
        nb = Integer.parseInt(sc.nextLine());
        min = nb;

        while ( nb10 != 10 ) {
            System.out.println("Entrez un nombre");
            nb = Integer.parseInt(sc.nextLine());

            if (nb < min)
            {
                min = nb;
            }
            nb10 = nb10 + 1;
        }
        System.out.println("Le plus petit nombre est " + min);
    }

}
