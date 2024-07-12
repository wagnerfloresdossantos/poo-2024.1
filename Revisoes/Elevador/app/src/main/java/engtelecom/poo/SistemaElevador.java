package engtelecom.poo;

import java.util.ArrayList;

/**
 * Classe que representa o sistema de um elevador
 * Integra todas as partes (Elevador, PainelInterno e PainelExterno)
 * Contém os métodos para processar os passos da simulação e exibir o status do sistema
 */
public class SistemaElevador {

    /**
     * Elevador
     * Painel Interno
     * ArrayList de paineis
     */
    private Elevador elevador;
    private PainelInterno painelInterno;
    private ArrayList<PainelAndar> paineisAndar;
    private int numAndares;

    /**
     * Método contrutor
     * @param numAndares recebe como parâmetro o número de andares que terá o edifício
     */
    public SistemaElevador(int numAndares) {
       elevador = new Elevador(numAndares);
       painelInterno = new PainelInterno(numAndares);
       paineisAndar = new ArrayList<>(numAndares);
       for (int i=0; i < numAndares; i++){
           paineisAndar.add(new PainelAndar(i));
        }
       this.numAndares = numAndares;
    }

    /**
     * Requisita o elevador para um determinado andar e direção
     * Atualiza os dados dos botões no painel do andar e solicita o andar no elevador
     * @param andar andar onde o elevador foi chamado
     * @param direcao direção para qual o elevador foi chamado
     */
    public void chamarElevador(int andar, String direcao){
        if (direcao.equals("subir")){
            paineisAndar.get(andar).pressBotaoSubir();
        } else if (direcao.equals("descer")) {
            paineisAndar.get(andar).pressBotaoDescer();
        }
        elevador.requisitarAndar(andar);
    }

    /**
     * Seleciona o andar de destino a partir do Painel Interno do elevador
     * @param andar andar de destino selecionado
     */
    public void selecionaAndar(int andar){
        painelInterno.pressBotao(andar);
        elevador.requisitarAndar(andar);
    }

    /**
     * Executa uma espera de movimentação do elevador
      * @throws InterruptedException se a thread for interrompida enquanto ele dorme
     */
   public void espera() throws InterruptedException{
        elevador.mover();
        int andarAtual = elevador.getAndarAtual();
        if (paineisAndar.get(andarAtual).isBotaoSubir()){
            paineisAndar.get(andarAtual).resetBotaoSubir();
        }
        if (paineisAndar.get(andarAtual).isBotaoDescer()){
            paineisAndar.get(andarAtual).resetBotaoDescer();
        }
        painelInterno.resetBotao(andarAtual);
        displayStatus();
        Thread.sleep(1000);
   }

    /**
     * Exibe o status atual do elevador e dos paineis de cada andar
     */
    private void displayStatus(){
        System.out.println("Elevador | Andar atual: " + elevador.getAndarAtual() + " | Direcão: "+ elevador.getDirecao());
        System.out.println("Botões: ");
        for (int i = 0; i < painelInterno.getBotoes().size(); i++){
            System.out.print(i + " (" + (painelInterno.getBotoes().get(i) ? "1" : "0" ) + ") ");
        }
        System.out.println();
        for(PainelAndar painelAndar : paineisAndar){
            System.out.println(painelAndar.getAndar() + "o Andar: Elevador: " + elevador.getDirecao() + " | Andar: " + elevador.getAndarAtual() + " | Botões: subir (" +(painelAndar.isBotaoSubir() ? "1" : "0") + ") descer (" + (painelAndar.isBotaoDescer() ? "1" : "0") + ")" );
        }
    }

    /**
     * Método Get para número de andares
     * @return numero de andares
     */
    public int getNumAndares() {
        return numAndares;
    }
}
