public class ValoreMinimo {
    public static void main(String[] args) {
        
        int [] numeri = {1,6,12,7,5};
        int min = numeri[0];
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] < min){
                min = numeri[i];          
            }
        }
        System.out.println("Il valore minimo è: " + min);
    }
}

