import java.util.Scanner;
public class FattorialeNumero {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.err.println("Scegli un numero: ");
        int numero = scan.nextInt();

        for (int i = numero; i > 0; i--) {
            int fattoriale = i;
                
            System.out.println(fattoriale);
        }


        
    }

}
