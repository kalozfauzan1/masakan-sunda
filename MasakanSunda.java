public class MasakanSunda {

    private String nama;
    private String bahanUtama;
    private String bumbuHalus;
    private String bahanSambal;
    private String bahanPelengkap;
    private String caraMembuat;

    // Konstruktor tanpa parameter
    public MasakanSunda() {
    }

    // Konstruktor dengan parameter
    public MasakanSunda(String nama, String bahanUtama, String bumbuHalus, String bahanSambal,
                        String bahanPelengkap, String caraMembuat) {
        this.nama = nama;
        this.bahanUtama = bahanUtama;
        this.bumbuHalus = bumbuHalus;
        this.bahanSambal = bahanSambal;
        this.bahanPelengkap = bahanPelengkap;
        this.caraMembuat = caraMembuat;
    }

    // Overloading konstruktor
    public MasakanSunda(String nama, String bahanUtama, String bumbuHalus, String caraMembuat) {
        this(nama, bahanUtama, bumbuHalus, null, null, caraMembuat);
    }

    // Metode untuk menampilkan informasi resep
    public void infoResep() {
        System.out.println("Resep " + nama);
        System.out.println("Bahan Utama: " + bahanUtama);
        System.out.println("Bumbu Halus: " + bumbuHalus);

        if (bahanSambal != null) {
            System.out.println("Bahan Sambal: " + bahanSambal);
        }

        if (bahanPelengkap != null) {
            System.out.println("Bahan Pelengkap: " + bahanPelengkap);
        }

        System.out.println("Cara Membuat: " + caraMembuat);
        System.out.println();
    }

    public static void main(String[] args) {
        // Membuat objek Mie Kocok Bandung
        MasakanSunda mieKocok = new MasakanSunda("Mie Kocok Bandung", "Mie", "Kuah kocok", "Bumbu halus mie kocok",
                "Sambal terasi", "Daun bawang, seledri, emping");

        // Membuat objek Lotek
        MasakanSunda lotek = new MasakanSunda("Lotek", "Sayuran segar", "Bumbu kacang", "Cara membuat lotek yang enak");

        // Membuat objek Sate Maranggi
        MasakanSunda sateMaranggi = new MasakanSunda("Sate Maranggi", "Daging sapi", "Bumbu kacang sate maranggi",
                "Sambal kecap", "Lontong, bawang merah, tomat", "Cara membuat sate maranggi yang lezat");

        // Menampilkan informasi resep
        mieKocok.infoResep();
        lotek.infoResep();
        sateMaranggi.infoResep();
    }
}