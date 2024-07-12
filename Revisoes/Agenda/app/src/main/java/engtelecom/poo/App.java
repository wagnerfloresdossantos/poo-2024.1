/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {


        private Agenda agenda;

        public App() {
                this.agenda = new Agenda();
        }

        public int menu() {

                Scanner entrada = new Scanner(System.in);

                System.out.printf("..::AGENDA::..\n" +
                "1 - Adicionar Contato\n" +
                "2 - Remover Contato\n" +
                "3 - Adicionar Telefone\n" +
                "4 - Adicionar E-mail\n" +
                "5 - Atualizar Telefone\n" +
                "6 - Atualizar E-mail\n" +
                "7 - Remover Telefone\n" +
                "8 - Remover E-mail\n" +
                "9 - Listar Contatos \n" +
                "10 - Sair \n" +
                "> ");

                int opcao = entrada.nextInt();
                return opcao;
        }

        public boolean adicionarContato() {

                Scanner entrada = new Scanner(System.in);

                System.out.println("Nome:");
                String nome = entrada.nextLine();
                System.out.println("Sobrenome:");
                String sobrenome = entrada.nextLine();
                System.out.println("Data de Nascimento do Contato (formato AAAA-MM-DD:)");
                String dataNascimento = entrada.nextLine();

                LocalDate dataNasc = LocalDate.parse(dataNascimento);

                Contato novoContato = new Contato(nome,sobrenome,dataNasc);

                agenda.addContato(novoContato);
                System.out.println(novoContato);
                System.out.println();

                return true;
        }

        public boolean removeContato(){
                Scanner entrada = new Scanner(System.in);
                System.out.println("Digite o nome do contato; ");
                String nome = entrada.nextLine();
                System.out.println("Digite o sobrenome; ");
                String sobrenome = entrada.nextLine();

                return agenda.removeContato(nome,sobrenome);
        }

        public boolean adicionaTelefone2() {
                Scanner entrada = new Scanner(System.in);
                listarContatos();
                System.out.println("Digite a posição do contato na lista ; ");
                int posicao = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite o Rótulo do Novo Telefone; ");
                String rotulo = entrada.nextLine();
                System.out.println("Digite o numero do Novo Telefone; ");
                String telefone = entrada.nextLine();

                agenda.addTelefone(rotulo, telefone, posicao);

                System.out.println(agenda.getAgenda().get(posicao));
                System.out.println();

                return true;
        }


        public boolean adicionaEmail(){
                Scanner entrada = new Scanner(System.in);
                listarContatos();
                System.out.println("Digite a posição do contato na lista ; ");
                int posicao = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite o Rótulo do Novo Email; ");
                String rotulo = entrada.nextLine();
                System.out.println("Digite Novo Email; ");
                String email = entrada.nextLine();

                agenda.addEmail(rotulo, email, posicao);

                System.out.println(agenda.getAgenda().get(posicao));
                System.out.println();

                return true;
        }

        public boolean atualizaTelefone(){
                Scanner entrada = new Scanner(System.in);
                listarContatos();
                System.out.println("Digite a posição do contato na lista ; ");
                int posicao = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite o Rótulo do Telefone a ser alterado; ");
                String rotulo = entrada.nextLine();
                System.out.println("Digite Novo Telefone; ");
                String telefone = entrada.nextLine();

                agenda.updateTelefone(rotulo, telefone, posicao);

                System.out.println(agenda.getAgenda().get(posicao));
                System.out.println();

                return true;

        }

        public boolean atualizaEmail(){
                Scanner entrada = new Scanner(System.in);
                listarContatos();
                System.out.println("Digite a posição do contato na lista ; ");
                int posicao = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite o Rótulo do Email a ser alterado; ");
                String rotulo = entrada.nextLine();
                System.out.println("Digite Novo Email; ");
                String email = entrada.nextLine();

                agenda.updateEmail(rotulo, email, posicao);

                System.out.println(agenda.getAgenda().get(posicao));
                System.out.println();

                return true;
        }

        public boolean removeTelefone(){
                Scanner entrada = new Scanner(System.in);
                listarContatos();
                System.out.println("Digite a posição do contato na lista ; ");
                int posicao = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite o Rótulo do Telefone a ser Removido; ");
                String rotulo = entrada.nextLine();

                agenda.removeTelefone(rotulo, posicao);

                System.out.println(agenda.getAgenda().get(posicao));
                System.out.println();

                return true;

        }

        public boolean removeEmail(){
                Scanner entrada = new Scanner(System.in);
                listarContatos();
                System.out.println("Digite a posição do contato na lista ; ");
                int posicao = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite o Rótulo do Email a ser removido; ");
                String rotulo = entrada.nextLine();

                agenda.removeEmail(rotulo, posicao);

                System.out.println(agenda.getAgenda().get(posicao));
                System.out.println();

                return true;
        }

        public boolean listarContatos(){
                return agenda.listaTodosContatos();
        }


        public static void main(String[] args) {


            App app = new App();
            int opcao;

            do {
                    opcao = app.menu();

                    switch (opcao) {

                          case 1 -> app.adicionarContato();
                          case 2 -> app.removeContato();
                          case 3 -> app.adicionaTelefone2();
                          case 4 -> app.adicionaEmail();
                          case 5 -> app.atualizaTelefone();
                          case 6 -> app.atualizaEmail();
                          case 7 -> app.removeTelefone();
                          case 8 -> app.removeEmail();
                          case 9 -> app.listarContatos();

                    }
            } while (opcao != 10);

    }






                // Telefone telefone = new Telefone("comercial","48999815336");
                // System.out.println(telefone);

                // Email emailA = new Email("pessoal", "wagner.fs@aluno.ifsc.edu.br");
                // Email emailB = new Email("pessoal", "wagner.fsaluno.ifsc.edu.br");

                //  System.out.println(emailA);
                //  System.out.println(emailB);
/*
                Contato novoContato = new Contato("Wagner", "Santos", LocalDate.parse("1981-06-06"));
                novoContato.addEmail("Comercial", "wagner@ifsc.edu.br");
                novoContato.addTelefone("Pessoal", "48999815336");


 */

                //novoContato.addEmail("Wagner", "wagnerifsc.edu.br");

                // System.out.println(Wagner);

                // Wagner.removeTelefone("Wagner");
                //  Wagner.removeEmail("Wagner");

                //     System.out.println(Wagner);

                //novoContato.updateTelefone("Wagner", "48999446265");
                //novoContato.updateEmail("Wagner", "carlos@carlos.com.br");

                // System.out.println(Wagner);
/*
                Agenda agenda = new Agenda();

                agenda.addContato(novoContato);

                System.out.println(novoContato);



 */
                //agenda.removeContato("Wagner", "Santos");
/*
                agenda.addTelefone("Comercial", "4855555555", novoContato);
                agenda.addEmail("Comercial", "wu@eu.com.br", novoContato);

                System.out.println(novoContato);


 */
                //agenda.updateTelefone("Comercial","4899999999",Wagner);

                //agenda.updateEmail("Comercial","aaaa@aaaaa.aaa.aa", Wagner);

                //agenda.removeTelefone("Comercial", Wagner);

                //agenda.removeEmail("Wagner", Wagner);

                //System.out.println(agenda);


      //  }
}

