public class ThrowExample { 
    static void demo() { 
        NullPointerException t; 
        t = new NullPointerException("Coba Throw");
        throw t; // Melemparkan exception secara manual
    } 
    public static void main(String[] args) { 
        try { 
            demo(); 
            System.out.println("Selesai");
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        } 
    } 
}
