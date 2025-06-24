public class Exception1 { 
    public static void main(String[] args) { 
        int a[] = new int[5]; 
        try {
            a[5] = 100; // Akses indeks yang tidak ada
        } catch (Exception e) {
            System.out.println("Terjadi pelanggaran memory"); // Menangkap error
        } 
    } 
}
