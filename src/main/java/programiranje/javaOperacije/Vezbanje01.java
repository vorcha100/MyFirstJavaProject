package programiranje.javaOperacije;

public class Vezbanje01 {
    public static void main(String[] args) {
        int[] fibonacci = {1, 1, 2, 3, 5};
        System.out.println(fibonacci[2]);

        String[] igre = {"Final Fantasy", "God of War", "Call of Duty", "Assasin's Creed", "Witcher"};
        System.out.println(igre[2]);

        System.out.println("Prvih 5 brojeva Fibonaccijevog niza su: ");
        for (int broj: fibonacci) {

            System.out.println(" " + broj);
        }

        System.out.println("5 poznatih video igara: ");
        for (String ime: igre) {
            System.out.println("- " + ime);
        }

    }
}
