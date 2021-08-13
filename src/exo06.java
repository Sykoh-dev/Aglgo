public class exo06 {
    public static void main(String[] args) {
        // Déclaration
        int a, b, e;
        boolean c, d;
// Affectation
        a = 3;
        b = 9;
        c = false;
        d = !(c);
        e = 9;
// Comparaison

        System.out.println(a>8);

        System.out.println((b == 9));

        System.out.println((!(a != 3)));

        System.out.println((!(c)));

        System.out.println(((a < b) || c));

        System.out.println(!((a + b) != 12));

        System.out.println(((b == 5) || ((e > 10) && (a < 8))));

        System.out.println(((((b == 5) || ((e > 10) && (a < 8))) || (a < b) || c) && c));


    }
}
