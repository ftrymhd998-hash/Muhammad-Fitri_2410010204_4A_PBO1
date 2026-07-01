// Nama: Muhammad Fitri
// NPM : 2410010204
package ServiceHP;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Input Output Sederhana
        Scanner input = new Scanner(System.in);

        //Array
        ArrayList<ServiceHP> data = new ArrayList<>();

        int pilih = 0;

        do {

            System.out.println("\n==============================");
            System.out.println("   SERVICE HANDPHONE");
            System.out.println("==============================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Total Biaya");
            System.out.println("5. Hapus Data");
            System.out.println("6. Keluar");
            System.out.print("Pilih : ");

            //Error Handling
            try {

                pilih = input.nextInt();
                input.nextLine();

                //seleksi
                switch (pilih) {

                    case 1:

                        //Input Output Sederhana
                        System.out.print("Nama           : ");
                        String nama = input.nextLine();

                        System.out.print("No HP          : ");
                        String nohp = input.nextLine();

                        System.out.print("Merk HP        : ");
                        String merk = input.nextLine();

                        System.out.print("Kerusakan      : ");
                        String rusak = input.nextLine();

                        System.out.print("Biaya Service  : ");
                        int biaya = input.nextInt();
                        input.nextLine();

                        // object
                        ServiceHP service = new ServiceHP(
                                nama,
                                nohp,
                                merk,
                                rusak,
                                biaya
                        );
                        // Menampilkan isi object 
                        System.out.println("\nData yang dimasukkan:");
                        
                        //Input Output Sederhana
                        System.out.println(service);

                        // Menyimpan object ke ArrayList
                        data.add(service);

                        System.out.println("\nData berhasil ditambahkan.");
                        break;

                    case 2:

                        if (data.isEmpty()) {

                            System.out.println("Belum ada data.");

                        } else {

                            System.out.println("\n===== DATA SERVICE =====");

                            for (int i = 0; i < data.size(); i++) {

                                System.out.println("\nData ke-" + (i + 1));
                                System.out.println(data.get(i));
                            }
                        }

                        break;

                    case 3:

                        System.out.print("Masukkan Nama : ");
                        String cari = input.nextLine();

                        boolean ketemu = false;

                        //perulangan
                        for (ServiceHP s : data) {

                            if (s.getNama().equalsIgnoreCase(cari)) {

                                System.out.println("\nData Ditemukan");
                                System.out.println(s);
                                ketemu = true;
                            }
                        }

                        if (!ketemu) {

                            System.out.println("Data tidak ditemukan.");
                        }

                        break;

                    case 4:

                        int total = 0;

                        for (ServiceHP s : data) {

                            total += s.getBiaya();
                        }

                        System.out.println("Total Biaya Service : Rp" + total);

                        break;

                    case 5:

                        System.out.print("Masukkan Nama : ");
                        String hapus = input.nextLine();

                        boolean ditemukan = false;

                        for (int i = 0; i < data.size(); i++) {

                            if (data.get(i).getNama().equalsIgnoreCase(hapus)) {

                                data.remove(i);

                                System.out.println("Data berhasil dihapus.");

                                ditemukan = true;

                                break;
                            }
                        }

                        if (!ditemukan) {

                            System.out.println("Data tidak ditemukan.");
                        }

                        break;

                    case 6:

                        System.out.println("Terima kasih.");

                        break;

                    default:

                        System.out.println("Menu tidak tersedia.");
                }

            //Error Handling
            } catch (Exception e) {

                System.out.println("Input harus berupa angka!");

                input.nextLine();
            }

        } while (pilih != 6);

    }
}
