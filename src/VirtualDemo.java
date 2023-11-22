public class VirtualDemo {
    public static void main(String[] args){ 
        System.out.println("Menyusun Pegawai");
        //Polimorfisme
        Gaji s = new Gaji("Mey", "Tapan", 1, 5000.00);
        Pegawai m = new Gaji("Angel", "Batusangkar", 2, 2500.00);
        Pegawai n = new Pegawai("Putri", "Padang", 3);

        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        m.mailCheck();
        m.Info();

        System.out.println("\nMemanggil mailCheck Berdasarkan Class Pegawai--");
        n.mailCheck();
        n.Info();
    }
}