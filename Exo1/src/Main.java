import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        exercice5();
    }

    // ───────────────────────────────────────────────
    // EXERCICE 1 — Somme de deux nombres
    // ───────────────────────────────────────────────
    public static void exercice1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un premier nombre : ");
        int a = scanner.nextInt();

        System.out.print("Entrez un deuxième nombre : ");
        int b = scanner.nextInt();

        int somme = a + b;

        System.out.println("La somme est : " + somme);

        scanner.close();
    }

    // ───────────────────────────────────────────────
    // EXERCICE 2 — Nom + âge : majeur / mineur
    // ───────────────────────────────────────────────
    public static void exercice2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Bonjour " + nom + ", vous êtes majeur.");
        } else {
            System.out.println("Bonjour " + nom + ", vous êtes mineur.");
        }

        scanner.close();
    }

    // ───────────────────────────────────────────────
    // EXERCICE 3 — Table de multiplication
    // ───────────────────────────────────────────────
    public static void exercice3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }

    // ───────────────────────────────────────────────
    // EXERCICE 4 — 3 nombres, tableau, moyenne, max
    // ───────────────────────────────────────────────
    public static void exercice4() {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Entrez le nombre " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
        }

        System.out.print("Tableau : ");
        for (int val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();

        double moyenne = (tab[0] + tab[1] + tab[2]) / 3.0;

        int max = tab[0];
        if (tab[1] > max) max = tab[1];
        if (tab[2] > max) max = tab[2];

        System.out.println("Moyenne = " + moyenne);
        System.out.println("Plus grand entier = " + max);

        scanner.close();
    }

    // ───────────────────────────────────────────────
    // EXERCICE 5 — Recommencer (boucle)
    // ───────────────────────────────────────────────
    public static void exercice5() {
        Scanner scanner = new Scanner(System.in);
        String choix;

        do {
            System.out.print("Entrez un premier nombre : ");
            int a = scanner.nextInt();

            System.out.print("Entrez un deuxième nombre : ");
            int b = scanner.nextInt();

            System.out.println("La somme est : " + (a + b));

            // nettoyage du scanner
            scanner.nextLine();

            System.out.print("Voulez-vous recommencer ? (o/n) : ");
            choix = scanner.nextLine().toLowerCase();

        } while (choix.equals("o") || choix.equals("oui"));

        System.out.println("Terminé.");

        scanner.close();
    }

    // ───────────────────────────────────────────────
    // EXERCICE 6 — Tri à bulles
    // ───────────────────────────────────────────────
    public static void exercice6() {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Entrez le nombre " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
        }

        System.out.print("Tableau initial : ");
        for (int n : tab) System.out.print(n + " ");
        System.out.println();

        // Tri à bulles : on compare et on échange si nécessaire
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }

        System.out.print("Tableau trié : ");
        for (int n : tab) System.out.print(n + " ");
        System.out.println();

        scanner.close();
    }
}
