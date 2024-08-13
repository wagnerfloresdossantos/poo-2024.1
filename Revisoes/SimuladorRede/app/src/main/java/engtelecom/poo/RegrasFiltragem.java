package engtelecom.poo;

import java.util.Objects;
/**
 * Classe que representa regras de filtragem, herdando de Pacote.
 */
public class RegrasFiltragem extends Pacote {

    private Acao acao;

    /**
     * Construtor que inicializa atributos do pacote e a ação de filtragem.
     *
     * @param enderecoIpOrigem  Endereço IP de origem.
     * @param portaOrigem       Porta de origem.
     * @param enderecoIpDestino Endereço IP de destino.
     * @param portaDestino      Porta de destino.
     * @param macDestino        Endereço MAC de destino.
     * @param conteudo          Conteúdo do pacote.
     * @param acao              Ação de filtragem a ser tomada (ENCAMINHAR ou DESCARTAR).
     */
    public RegrasFiltragem(String enderecoIpOrigem, String portaOrigem, String enderecoIpDestino, String portaDestino, String macDestino, String conteudo, Acao acao) {
        super(enderecoIpOrigem, portaOrigem, enderecoIpDestino, portaDestino, macDestino, conteudo);
        this.acao = acao;
    }

    /**
     * Getter para acessar atributo
     *
     * @return A ação a ser tomada
     */
    public Acao getAcao() {
        return acao;
    }
    /**
     * Compara esta regra de filtragem com outro objeto para verificar a igualdade.
     *
     * @param o O objeto a ser comparado.
     * @return true se os objetos forem iguais, false caso contrário.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pacote)) return false;
        Pacote pacote = (Pacote) o;
        return Objects.equals(getEnderecoIpOrigem(), pacote.getEnderecoIpOrigem()) &&
                Objects.equals(getPortaOrigem(), pacote.getPortaOrigem()) &&
                Objects.equals(getEnderecoIpDestino(), pacote.getEnderecoIpDestino()) &&
                Objects.equals(getPortaDestino(), pacote.getPortaDestino()) &&
                Objects.equals(getMacDestino(), pacote.getMacDestino());
    }
    /**
     * @return O código hash para esta regra de filtragem.
     */
    public int hashCode() {
        return Objects.hash(getEnderecoIpOrigem(), getPortaOrigem(), getEnderecoIpDestino(), getPortaDestino(), getMacDestino());
    }
}
