public class Exo13 {
    public static void main(String[] args) {
        // exo13
// À l’aide d’une boucle, affichez la table de multiplication par 2.

        //Déclaration
        int resultat, nombre;

        //Affectation
        nombre = 1;

        //Boucle
        while ( nombre <= 10 )
        {
            //Calcul
            resultat = ( nombre * 2);

            //Affichage
            System.out.println(nombre + " * 2 = " + resultat);

            //Incrémentation
            nombre = nombre + 1;
        }
    }
}
