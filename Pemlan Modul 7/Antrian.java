import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Antrian {

    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>(); // mengubah queue menjadi linkedlist
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Antrian Pelanggan:");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Antrian Terdepan"); // ← menu baru
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");

            try {
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Masukan Nama Pelanggan: ");
                        String nama = sc.nextLine(); // yang termasuk BARIS 19
                       
                        // pengecekan khusus jika nama "Budi"
                        if (nama.equalsIgnoreCase("Budi")) {
                            queue.addFirst(nama); // Budi masuk paling depan
                            System.out.println(nama + " ditambahkan ke antrian paling depan!");
                        } else {
                            queue.addLast(nama);  // selain Budi, masuk paling belakang
                            System.out.println(nama + " ditambahkan ke antrian.");
                    }
                    break;

                    case 2:
                        if (queue.isEmpty())
                            System.out.println("Antrian kosong.");
                        else {
                            String nama2 = queue.poll(); // yang termasuk BARIS 26: keluarkan dari depan queue
                            System.out.println("Melayani pelanggan : " + nama2);
                        }
                        break;

                    case 3:
                        System.out.println("Antrian Saat Ini: " + queue);
                        break;

                    // case baru no.2 adanya peek()
                    case 4:
                        if (queue.isEmpty())
                            System.out.println("Tidak ada antrian."); // ← pesan jika kosong
                        else
                            System.out.println("Antrian terdepan: " + queue.peek());
                        break;

                    case 5:
                        System.out.println("Keluar.");
                        sc.close();
                        return;

                    default:
                        throw new Exception("Invalid input.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input.");
                sc.next();
            }
        }
    } 
}