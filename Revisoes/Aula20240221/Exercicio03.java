import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);    

    Random r = new Random();

    int numeroSorteado = r.nextInt(100)+1;

    int palpite;
    int tentativas = 0;
    int palpiteAnterior = 0;
    
    System.out.println("tente descobrir um numero entre 1 e 100");

        do {
         System.out.println("Digite o Papite");

         palpite = teclado.nextInt();
         tentativas++;

         if (palpite == palpiteAnterior){
            System.out.println("Você escolheu 2 vezes o número: " + palpite);
        } else{
             if (palpite == numeroSorteado){
                 System.out.println("Parabéns você venceu");
             } else if (palpite < numeroSorteado) {
                System.out.println("Experimente um número maior, o número sorteado está entre " + (palpite + 1) + " e 100");
             } else {
                 System.out.println("Experimente um número menor, o número sorteado está entre 1 e " + (palpite - 1) + ".");
             }
             palpiteAnterior = palpite;
        }
     } while (palpite != numeroSorteado);
    }  
}