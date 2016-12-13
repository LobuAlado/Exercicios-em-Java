
package usandoFor;

public class lacoFor {
    
    public static void main(String[] args) {
        int i = 0;
        
        for (int cont = i; cont <= 100; cont++){
            System.out.println("linha nº " + cont);
        }
        
        System.out.println("");
        for (int cont = 1;cont <= 10;cont++){
            System.out.println(cont +" * 2 = "+ (cont*2) + "\n" + cont + " + 2 = "
            + (cont + 2) + "\n" + cont + " - 2 = " + (cont-2) + "\n");
        }
    }
}
