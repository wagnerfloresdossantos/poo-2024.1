package engtelecom.poo;

/**
 * Classe que representa o painel de elevador de cada andar de um edifício
 * Contém métodos para pressionar, resetar e verificar estado dos botões
 */
public class PainelAndar {

    /**
     * andar em que está o painel
     * botão para selecionar descer de andar
     * botão para selecionar subir de andar
     */
    private int andar;
    private boolean botaoDescer;
    private boolean botaoSubir;

    /**
     * Método Contrutor
     * @param andar recebe como parâmetro o andar em que está o painel
     */
    public PainelAndar(int andar) {
        this.andar = andar;
        this.botaoSubir = false;
        this.botaoDescer = false;
    }

    /**
     * Método para pressionar o botão subir
     */
    public void pressBotaoSubir(){
        botaoSubir = true;
    }

    /**
     * Metodo para pressionar o botão descer
     */
    public void pressBotaoDescer(){
        botaoDescer= true;
    }

    /**
     * Método que retorna o estado atual do botão descer
     * @return true ou false
     */
    public boolean isBotaoDescer() {
        return botaoDescer;
    }

    /**
     * Método que retorna o estado atual do botão subir
     * @return true ou false
     */
    public boolean isBotaoSubir() {
        return botaoSubir;
    }

    /**
     * Método que reseta o botão subir
     * false
     */
    public void resetBotaoSubir(){
        botaoSubir = false;
    }

    /**
     * Método que reseta o botão descer
     * false
     */
    public void resetBotaoDescer(){
        botaoDescer = false;
    }

    /**
     * Métodp Get para o argumento andar
     * @return andar
     */
    public int getAndar() {
        return andar;
    }
}
