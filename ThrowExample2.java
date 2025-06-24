public class ThrowExample2 { 
    public static void main(String[] args) { 
        try { 
            throw new Exception("Here's my Exception"); 
        } catch (Exception e) { 
            System.out.println("Caught Exception"); 
            e.printStackTrace(); // Menampilkan detail stack trace
        } 
    } 
}
