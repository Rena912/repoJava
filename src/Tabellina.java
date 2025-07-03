import java.util.Scanner ;
 
public class Tabellina {
    
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Scegliere la tabellina: ");
        int tabellina = scan.nextInt();
        System.out.println("Sceglin il moltiplicatore: ");
        int moltiplicatore = scan.nextInt();
        int fineMoltiplicatore = tabellina * moltiplicatore; 

        for (int i = 0; i <= fineMoltiplicatore; i += tabellina) {
            int numeroFinale = i;
            System.out.println(numeroFinale);
        }


        


    }
}
