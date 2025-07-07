import java.util.Scanner;

public class InvertiStringa {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Scrivi una parola: ");
        String parola = scan.nextLine();
        String parolainvertita = "";
        
        for(int i = parola.length()-1; i>=0; i--){
       
            parolainvertita = parolainvertita + parola.charAt(i);
        }
        
        System.out.print("La parola invertita e': " );
        System.out.println(parolainvertita);
  }
}
    
       

