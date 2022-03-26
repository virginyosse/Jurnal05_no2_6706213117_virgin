import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Generic generic = new Generic();
        Scanner in = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Pilihlah Menu:");
            System.out.println("1. Menambah Pekerjaan");
            System.out.println("2. Urutan Pekerjaan");
            System.out.println("3. Hapus Pekerjaan");
            System.out.println("4. List Pekerjaan");
            System.out.println("5. Keluar");

            pilihan = in.nextInt();

            switch (pilihan){
                case 1:
                    System.out.println("Silakan masukkan pekerjaan");
                    String namaPekerjaan = in.next();
                    Queue input = new Queue(namaPekerjaan);
                    generic.enQ(input);
                    System.out.println();

                    break;
                case 2:
                    generic.first();
                    System.out.println();
                    break;
                case 3:
                    generic.delQ();
                    System.out.println();
                    break;
                case 4:
                    generic.display();
                    System.out.println();
            }
        }while (pilihan!=5);
    }
}
