
package vetores;

import java.util.*;
public class vetor {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();
        String[] nomes = new String[10];
        
        nomes[0] = "Caio";
        nomes[1] = "Matheus";
        nomes[2] = "Gilmar";
        nomes[3] = "Cássio";
        nomes[4] = "Rafael";
        
        for (int i = 5; i < 10; i++){
            System.out.println("Digite mais um nome [ nomes restantes("+(10-i)+") ]");
            nomes[i] = entrada.nextLine();
        }
        
        for (int i = 0; i < 10; i++){
            System.out.println("Camisa " + gerador.nextInt(9) + " - " + nomes[i]);
        }
    }
}
