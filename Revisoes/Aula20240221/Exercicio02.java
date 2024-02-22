public class Exercicio02 {

    public static void main(String[] args){

        // verifica se foram inseridas via argumento as 3 notas necessária via argumento
        if (args.length != 3){
            // caso não foram inseridas retorna mensaqgem
            System.out.println("notas invalidas, preencha p1, p2 e a");
        } else{
            // imprimi quantas notas foram fornecidas e para qual avaliação
            System.out.println("Forneceu " + args.length + " notas"); 
            System.out.println("Notas Fornecidas: ");
            System.out.println("P1: " + args[0]);
            System.out.println("P2: " + args[1]);
            System.out.println("a: " + args[2]);

            // Executa o calculo do conceito final e salva em um Double
            double CF = Math.round(((((Double.parseDouble(args[0]))*2)+((Double.parseDouble(args[1])*3)))/5)*0.9+Double.parseDouble(args[2])*0.1);
            
            // imprimi na tela o conceito final
            System.out.println("Conceito Final: " + CF);

            // Se o conceito final foi igual ou maior que 6 imprimi na tela Aprovado e se não Reprovado.
            if (CF >= 6){
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
        }
      }
    }

}