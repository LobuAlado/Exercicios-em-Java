package condicional;

import java.util.Scanner;

public class condicional {
    
    public static void main(String[]args){
        String nome;
        int opt;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo:\n");
        nome = ler.nextLine();
        System.out.println("\nSeu nome é " + nome);
        System.out.println("Digite um numero de 1 até 3:\n");
        opt = ler.nextInt();
        
        if (opt == 1){
            System.out.println("\nSeu novo nome é " + nome + " Stark");
        } else if (opt == 2){
            System.out.println("\nSeu novo nome é " + nome + " Raynold");
        } else if (opt == 3){
            System.out.println("\nSeu novo nome é " + nome + " Harrys");
        } else{
            System.out.println("Voce digitou um número inválido");
        }
    }
}
