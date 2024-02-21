import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Entre com o nome: ");
        
        String nome = teclado.nextLine();

        System.out.print("Entre com o ano que nasceu: ");
        
        int anoNasc = teclado.nextInt();
        
        System.out.print("Entre com o ano Atual: ");
        
        int anoAtual = teclado.nextInt();
        
        int idade = (anoAtual - anoNasc);

        System.out.println(nome + ", possui " + idade + " anos") ;
        


    }

}