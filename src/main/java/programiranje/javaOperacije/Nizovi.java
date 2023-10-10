package programiranje.javaOperacije;

public class Nizovi {
    public static void main(String[] args) {
        int[] niz = {2, 5, 8, 12, 7};

        System.out.println("Prvi element niza: " + niz[3]);

        niz[3] = 50;

        System.out.println(niz[3]);

        System.out.println("Svi elementi niza:");
        for (int broj: niz)
        {
            System.out.println(" " + broj);
        }

        String[] imena = {"Marko", "Sloba", "Mile", "Dragomir", "Milomir"};

        System.out.println("Delivery manager je: " + imena[2]);

        System.out.println("Poslednje ime je: " + imena[imena.length-1]);

        System.out.println("Sva imena:");
        for (String tim: imena)
        {
            System.out.println(" " + tim);
        }
    }
}
