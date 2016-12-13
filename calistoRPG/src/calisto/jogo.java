
package calisto;

import java.util.*;

class Jogador {
    String nome;
    int fisico = 0;
    int mental = 0;
    String[] nome_pericias = new String[4];
    int[] valor_pericias = new int[4];
    
    Scanner entrada = new Scanner(System.in);
    
    void definir_atributos(){
        System.out.println("Defina o físico de seu personagem:");
        fisico = entrada.nextInt();
        
        switch (fisico) {
            case 1:
                mental = 4;
                break;
            case 2:
                mental = 3;
                break;
            case 3:
                mental = 2;
                break;
            case 4:
                mental = 1;
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }    
    
    void definir_pericias(){
        for (int i = 0; i <= 4; i++){
            System.out.println("Digite o nome de uma perícia:");
            String x = entrada.nextLine();
            nome_pericias[i] = x;
            valor_pericias[i] = 4-i;
        }
    }
        
    void fazer_jogada(){
        Random sorteio = new Random();
        int dado = sorteio.nextInt(5);
        System.out.println("Valor do dado - " + (dado+1));
        System.out.println("Escolha um dos atributos // 0 - Físico  1 - Mental");
        int escolha = 0;
        while (escolha != 0 || escolha != 1){
            escolha = entrada.nextInt();
            switch (escolha){
                case 0:
                    System.out.println("Valor da jogada - " + (dado+1 + fisico)); 
                case 1:
                    System.out.println("Valor da jogada - " + (dado+1 + mental));
                default:
                    System.out.println("Atributo inválido");
            } 
        }
        
    }
        
}   
    

public class jogo {
    
    public static void main(String[] args) {
        
        Jogador jogador1 = new Jogador();
        
        jogador1.definir_atributos();
        System.out.println("Físico - " + jogador1.fisico);
        System.out.println("Mental - " + jogador1.mental);
        
        jogador1.definir_pericias();
        System.out.println("Pericia " + jogador1.nome_pericias[0] + " - " + jogador1.valor_pericias[0]);
        System.out.println("Pericia " + jogador1.nome_pericias[1] + " - " + jogador1.valor_pericias[1]);
        System.out.println("Pericia " + jogador1.nome_pericias[2] + " - " + jogador1.valor_pericias[2]);
        System.out.println("Pericia " + jogador1.nome_pericias[3] + " - " + jogador1.valor_pericias[3]);
        jogador1.fazer_jogada();
    }
}
