
package examples;

public class EntrevistaGoogle {
    
    public static void main(String[] args) {
        
        //int[] array01 = {1, 2, 3, 9};
        int[] array02 = {1, 2, 4, 4};
        
        for (int i = 0; i < array02.length; i++) {
            int num01 = array02[i];
            int ind01 = i;
            for (int j = 0; j < array02.length; j++) {
                if (i != j) {
                    int num02 = array02[j];
                    int ind02 = j;
                    if (num01 + num02 == 8) {
                        System.out.println(num01 + " con indice " + ind01 + " + " + num02 + " con indice " + ind02 + ".");
                    }
                }
            }
        }
    }
}