
package usandoSwitch;

import java.util.Scanner;

public class jogodeperguntas {
    
    public static void main(String[] args) {
        
        int p = 5;
        String direcao = "";
        
        Scanner input = new Scanner(System.in);
        System.out.println("Voce está na coordenada " + p);
        
        
        while (direcao != "q"){
            System.out.println("Escolha uma direção \nA..Esquerda"
                + "\nS..Abaixo\nW..Acima\nD..Direita");
            direcao = input.nextLine();
            switch(direcao){
                case "a":
                    if (p == 1 || p == 4 || p == 7){
                        System.out.println("Voce agora está em " + p);
                        System.out.println("Não é possivel ir mais para esquerda");
                    } else {
                        p -= 1;
                        System.out.println("Voce agora está em " + p);
                    }
                    break;
                case "w":
                    if (p == 7 || p == 8 || p == 9){
                        System.out.println("Voce agora está em " + p);
                        System.out.println("Não é possível subir mais");
                    } else {
                        p += 3;
                        System.out.println("Voce agora está em " + p);
                    }
                    break;
                case "s":
                    if (p == 1 || p == 2 || p == 3){
                        System.out.println("Voce agora está em " + p);
                        System.out.println("Não é possível descer mais");
                    } else {
                        p -= 3;
                        System.out.println("Voce agora está em " + p);
                    }
                    break;
                case "d":
                    if (p == 3 || p == 6 || p == 9){
                        System.out.println("Voce agora está em " + p);
                        System.out.println("Não é possível ir mais para direita");
                    } else {
                        p += 1;
                        System.out.println("Voce agora está em " + p);
                    }   
                    break;
            }
        } 
    }   
}
