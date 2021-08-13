import java.util.Scanner;

public class exoSup4 {
    public static void main(String[] args) {
        //Algorithme demandant 3 nombres :
        //nbRep, nbTiret, nbEtoile.
        //Ce dernier affiche à l'écran autant de tiret
        //que la valeur de nbTiret, suivi d'autant d'étoiles
        //que la valeur de nbEtoile. Le tout autant de fois
        //que la valeur de nbRep.
        //Exemple : si nbRep= 2, nbTiret= 1 et nbEtoile= 3
        //le résultat est le suivant :|-***-***|

        int nbEtoile, nbTiret, nbRep, ligne, ligne1, ligne2;
        String etoile, tiret;
        Scanner sc = new Scanner(System.in);

        etoile = "*";
        tiret = "-";
        ligne = 0;

        System.out.println("Entrez un nombre de tiret");
        nbTiret = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez un nombre d'étoile");
        nbEtoile = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez un nombre de répétition");
        nbRep= Integer.parseInt(sc.nextLine());

        while ( ligne != nbRep )
        {
            ligne1 = 1;
            while ( ligne1 != nbTiret )
            {
                ligne1 = ligne1 + 1;
                tiret = (tiret + "-");
            }
            ligne2 = 1;
            while ( ligne2 != nbEtoile )
            {
                ligne2 = ligne2 + 1;
                etoile = (etoile + "*");
            }

            System.out.print(tiret + etoile);
            etoile = "*";
            tiret = "-";
            ligne = ligne + 1;
        }
    }


}
