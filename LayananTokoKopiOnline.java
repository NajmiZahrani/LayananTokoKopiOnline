package UASAlgoritma;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LayananTokoKopiOnline {
    public static int total, milih;
    public static int counter1 = 0;
    public static String inputPilihan, input;
    public static ArrayList kopi = new ArrayList();
    public static String [] namaKopi = {"Kopi Arabica Aceh Gayo, 100g Rp.24.000", "Kopi Kintamani Bali, 100g Rp.18.000",
                                        "Kopi Robusta Lampung, 100g Rp.20.000", "Kopi Arabika Toraja, 100g Rp.21.500",
                                        "Kopi Liberika Rangsang Meranti Riau, 100g Rp.22.000", "Kopi Robusta Tamanggung, 100g Rp.23.000"};
//    public static ArrayList recomend = new ArrayList();
    public static ArrayList counter = new ArrayList();
    public static String basabasi() {
        String endddd = "Program Dihentikan!";
        System.out.println("Selamat Datang Di Aplikasi Chat Bot Tentang Layanan Toko Kopi Online");
        System.out.println("Ada yang bisa saya bantu?");
        pilihan ();
        return endddd;
    }
    public static void pilihan(){
        System.out.println("A. Jual Kopi Apa Saja?");
        System.out.println("B. Kopi Yang Terbaik Yang Mana?");
        System.out.println("C. Saya Ingin Belajar Tentang Kopi");
        System.out.println("D. Rekomendasikan Kopi Pada Saya Secara Random");
        System.out.println("E. Check Out");
//        System.out.println("F. Hapus List Keranjang");
        System.out.println("X. Keluar");
        lanjutan();
    }
    public static void lanjutan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Pilihan Anda");
        inputPilihan = sc.nextLine();
        if (inputPilihan.equalsIgnoreCase("A")){
            listkopi();
        } else if (inputPilihan.equalsIgnoreCase("B")) {
            System.out.println("Untuk Rasa Menurut Saya Lebih Baik Anda Memilih Kopi Arabica Aceh Gayo, 100g");
            System.out.println("Tetapi Kalau Ingin Murah Lebih Baik Kopi Kapal Api Saja, Atau Beli Pop Ice Di warung Iqbal :D");
            System.out.println("Apa? Nyari yang sempurna? Jika kau mencari yg sempurna maka kau akan mencari selamanya :D");
            pesanlagi();
        } else if (inputPilihan.equalsIgnoreCase("C")) {
            System.out.println("Jika Ingin Belajar Tentang Kopi Lebih Lanjut Bisa Datang Ke toko Kami Langsung!");
        } else if (inputPilihan.equalsIgnoreCase("D")) {
            recomend();
            pesanlagi();
        } else if (inputPilihan.equalsIgnoreCase("E")){
            checkout();
            bayar();
            pesanlagi();
        } else {
            theEnd();
        }
    }
    public static void listkopi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Kopi Arabica Aceh Gayo, 100g Rp.24.000");
        System.out.println("2. Kopi Kintamani Bali, 100g Rp.18.000");
        System.out.println("3. Kopi Robusta Lampung, 100g Rp.20.000");
        System.out.println("4. Kopi Arabika Toraja, 100g Rp.21.500");
        System.out.println("5. Kopi Liberika Rangsang Meranti Riau, 100g Rp.22.000");
        System.out.println("6. Kopi Robusta Tamanggung, 100g Rp.23.000");
        System.out.println("Tekan Q untuk Kembali Ke menu Awal");
        milih = sc.nextInt();
        switch (milih){
            case 1 -> {
                kopi1();
            }
            case 2 -> {
                kopi2();
            }
            case 3 -> {
                kopi3();
            }
            case 4 -> {
                kopi4();
            }
            case 5 -> {
                kopi5();
            }
            case 6 -> {
                kopi6();
            }
            default -> {
                basabasi();
            }
        }
    }
    public static void recomend() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int angka = r.nextInt(6);
        String getKopi = namaKopi[angka];
        System.out.println("saya punya kopi bagus , yaitu Kopi "+getKopi);
        if (getKopi.equals("Kopi Arabica Aceh Gayo, 100g Rp.24.000")){
            System.out.println("Apakah Kamu Ingin Membelinya?");
            bayar();
            kopi1();
        } else if (getKopi.equals("Kopi Kintamani Bali, 100g Rp.18.000")){
            System.out.println("Apakah Kamu Ingin Membelinya?");
            bayar();
            kopi2();
        } else if (getKopi.equals("Kopi Robusta Lampung, 100g Rp.20.000")) {
            System.out.println("Apakah Kamu Ingin Membelinya?");
            bayar();
            kopi3();
        } else if (getKopi.equals("Kopi Arabika Toraja, 100g Rp.21.500")){
            System.out.println("Apakah Kamu Ingin Membelinya?");
            bayar();
            kopi4();
        } else if (getKopi.equals("Kopi Liberika Rangsang Meranti Riau, 100g Rp.22.000")) {
            System.out.println("Apakah Kamu Ingin Membelinya?");
            bayar();
            kopi5();
        } else if (getKopi.equals("Kopi Robusta Tamanggung, 100g Rp.23.000")) {
            System.out.println("Apakah Kamu Ingin Membelinya?");
            bayar();
            kopi6();
        }
    }
    public static void checkout(){
        System.out.println("Produk yang anda pesan adalah");
        System.out.println("Anda Membeli "+kopi.size()+" Produk Hari Ini");
        System.out.println("Berikut List Nya:");
        for (int i = 0; i < kopi.size(); i++){
            System.out.println(counter.get(i) +". "+kopi.get(i));
        }
        System.out.println("Total " +total);
        System.out.println("Apakah anda Ingin Melakukan Pembayaran?");
    }
    public static void bayar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("(Y) Untuk Bayar");
        System.out.println("(N) Kembali Ke Menu Awal");
        input = sc.nextLine();
        if (input.equalsIgnoreCase("Y")){
            System.out.println("Terimakasih telah membeli produk kami");
            kopi.clear();
            total = 0;
            pesanlagi();
        } else {
            basabasi();
        }
    }
    public static void pesanlagi(){
        System.out.println("apakah ada yang ingin di pesan lagi?");
        System.out.println("(Y) Untuk pesan lagi");
        System.out.println("(N) Untuk Ke Menu Awal");
        Scanner sc = new Scanner(System.in);
        inputPilihan = sc.nextLine();
        if (inputPilihan.equalsIgnoreCase("Y")){
            listkopi();
        } else {
            basabasi();
        }
    }
    public void end (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah Anda Yakin Ingin Keluar?");
        System.out.println("(Y) Untuk Keluar");
        System.out.println("(N) Untuk Kembali Ke Menu Awal");
        input = sc.nextLine();
        if (input.equalsIgnoreCase("Y")){
            theEnd();
        } else {
            basabasi();
        }
    }
    public static String theEnd(){
        String ending = "Terimakasih, Program Dihentikan!";
        return ending;
    }
    public static void kopi1(){
        counter1++;
        counter.add(counter1);
        kopi.add("Kopi Arabica Aceh Gayo, 100g Rp.24.000");
        total = total + 24000;
        pesanlagi();
    }
    public static void kopi2(){
        counter1++;
        counter.add(counter1);
        kopi.add ("Kopi Kintamani Bali, 100g Rp.18.000");
        total = total + 18000;
        pesanlagi();
    }
    public static void kopi3(){
        counter1++;
        counter.add(counter1);
        kopi.add ("Kopi Robusta Lampung, 100g Rp.20.000");
        total = total + 20000;
        pesanlagi();
    }
    public static void kopi4(){
        counter1++;
        counter.add(counter1);
        kopi.add ("Kopi Arabika Toraja, 100g Rp.21.500");
        total = total + 21500;
        pesanlagi();
    }
    public static void kopi5(){
        counter1++;
        counter.add(counter1);
        kopi.add ("Kopi Liberika Rangsang Meranti Riau, 100g Rp.22.000");
        total = total + 22000;
        pesanlagi();
    }
    public static void kopi6(){
        counter1++;
        counter.add(counter1);
        kopi.add ("Kopi Robusta Tamanggung, 100g Rp.23.000");
        total = total + 23000;
        pesanlagi();
    }

}
