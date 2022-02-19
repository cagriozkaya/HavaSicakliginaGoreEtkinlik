import java.util.Scanner;

public class EtkinlikProgrami {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println(" Sıcaklık Giriniz. ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (heat <= 25)
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsin.");
            }
        if (heat <= 18) {
            System.out.println("Pikniğe Gidebilirsin.");
        } else {

            {
                System.out.println("Yüzmeye Gidebilirsin");
            }
        }

    }

}