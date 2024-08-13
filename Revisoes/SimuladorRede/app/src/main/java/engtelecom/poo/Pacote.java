package engtelecom.poo;

import java.util.Objects;

/**
 * Classe que representa um pacote de dados na rede
 */
public class Pacote {

    private String enderecoIpOrigem;
    private String portaOrigem;
    private String enderecoIpDestino;
    private String portaDestino;
    private String macDestino;
    private String conteudo;

    /**
     * Construtor para inicializar os atributos do pacote.
     *
     * @param enderecoIpOrigem  Endereço IP de origem
     * @param portaOrigem       Porta de Origem
     * @param enderecoIpDestino Endereço IP de destino
     * @param portaDestino      Porta de destino
     * @param macDestino        Endereço MAC de destino
     * @param conteudo          Conteudo do pacote
     */
    public Pacote(String enderecoIpOrigem, String portaOrigem, String enderecoIpDestino, String portaDestino, String macDestino, String conteudo) {
        this.enderecoIpOrigem = enderecoIpOrigem;
        this.portaOrigem = portaOrigem;
        this.enderecoIpDestino = enderecoIpDestino;
        this.portaDestino = portaDestino;
        this.macDestino = macDestino;
        this.conteudo = conteudo;
    }

    /**
     * Getters e setters para acessar e modificar atributos
     */
    public String getEnderecoIpOrigem() {
        return enderecoIpOrigem;
    }

    public void setEnderecoIpOrigem(String enderecoIpOrigem) {
        this.enderecoIpOrigem = enderecoIpOrigem;
    }

    public String getPortaOrigem() {
        return portaOrigem;
    }

    public void setPortaOrigem(String portaOrigem) {
        this.portaOrigem = portaOrigem;
    }

    public String getEnderecoIpDestino() {
        return enderecoIpDestino;
    }

    public void setEnderecoIpDestino(String enderecoIpDestino) {
        this.enderecoIpDestino = enderecoIpDestino;
    }

    public String getPortaDestino() {
        return portaDestino;
    }

    public void setPortaDestino(String portaDestino) {
        this.portaDestino = portaDestino;
    }

    public String getMacDestino() {
        return macDestino;
    }

    public void setMacDestino(String macDestino) {
        this.macDestino = macDestino;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * Compara este pacote com outro objeto para verificar a igualdade
     *
     * @param o Objeto a ser comparado
     * @return true se os objetos forem iguais, false caso contrario
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacote pacote = (Pacote) o;
        return Objects.equals(enderecoIpOrigem, pacote.enderecoIpOrigem) && Objects.equals(portaOrigem, pacote.portaOrigem) && Objects.equals(enderecoIpDestino, pacote.enderecoIpDestino) && Objects.equals(portaDestino, pacote.portaDestino) && Objects.equals(macDestino, pacote.macDestino) && Objects.equals(conteudo, pacote.conteudo);
    }
    /**
     * @return O código hash para esta regra de filtragem.
     */
    @Override
    public int hashCode() {
        return Objects.hash(enderecoIpOrigem, portaOrigem, enderecoIpDestino, portaDestino, macDestino, conteudo);
    }
}