import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Flower flower1 = new Flower("Rose", 5, 1500);
        Flower flower2 = new Flower("Lily", 9, 500);
        Flower flower3 = new Flower("Sunflower", 8, 800);
        Flower flower4 = new Flower("Tulip", 5, 2200);
        Flower flower5 = new Flower("Orchid", 2, 5000);
        Flower[] flowers = {flower1, flower2, flower3, flower4, flower5};

        for (int i = 0; i < flowers.length; i++) {
            Flower person = flowers[i];
            System.out.println("=============================================");
            System.out.println("Flower " + (i + 1) + ":");
            System.out.println("Name: " + person.getFlowerName());
            System.out.println("Frech: " + person.getFreshness());
            System.out.println("Price: " + person.getPrice());
            System.out.println("=============================================");
        }

        while (true) {
            System.out.println("1 - Price check\n2 - Frech check\n3 - Sort arrays");
            System.out.print("Select an action: ");
            int x = scan.nextInt();
            switch (x) {
                case 1:
                    System.out.println();
                    Prices(flowers);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    Frechs(flowers);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    SORT(flowers);
                    System.out.println();
                    break;
            }
        }
    }public static void Prices(Flower[] flowers) {
        int maxPrice = flowers[0].getPrice();
        for (Flower max : flowers) {
            if (max.getPrice() > maxPrice) {
                maxPrice = max.getPrice();
            }
        }
        System.out.println("Most expensive flower: " + maxPrice);
    }

    public static void Frechs(Flower[] flowers) {
        int low = 0;
        int middle = 0;
        int high = 0;
        for (Flower frechh : flowers) {
            if (frechh.getFreshness() <= 3 && frechh.getFreshness() >= 1) {
                low++;
            } else if (frechh.getFreshness() <= 6 && frechh.getFreshness() > 3) {
                middle++;
            } else if (frechh.getFreshness() <= 10 && frechh.getFreshness() > 6) {
                high++;
            }
        }
        System.out.println("Low frech: " + low);
        System.out.println("Middle frecg: " + middle);
        System.out.println("High frech: " + high);
    }

    public static void SORT(Flower[] flowers) {
        String maxLenght = flowers[0].getFlowerName();
        for (int i = 1; i < flowers.length; i++) {
            String x = flowers[i].getFlowerName();
            if (x.length() > maxLenght.length()) {
                maxLenght = x;
            }
        }
        System.out.println("VERY long flower: " + maxLenght);
    }
}