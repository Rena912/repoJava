public class ValoreMassimo {
    
    public static void main(String[] args) {
        
        int [] numeri = {1,6,12,7,5};
        int max = numeri[0];
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] > max){
                max = numeri[i];          
            }
        }
        System.out.println("Il valore massimo è: " + max);
    }
}
