public class Exercício02 {

    public static void main(String[] args){


        if (args.length != 3){
            System.out.println("notas invalidas, preencha p1, p2 e a");
        } else{
            System.out.println("Forneceu " + args.length + " notas"); 
            System.out.println("Notas Fornecidas: ");
            System.out.println("P1: " + args[0]);
            System.out.println("P2: " + args[1]);
            System.out.println("a: " + args[2]);

            double CF = Math.round(((((Double.parseDouble(args[0]))*2)+((Double.parseDouble(args[1])*3)))/5)*0.9+Double.parseDouble(args[2])*0.1);
    
            System.out.println("Conceito Final: " + CF);

            if (CF >= 6){
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
        }
      }
    }

}