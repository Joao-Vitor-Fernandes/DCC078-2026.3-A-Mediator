package padroescomportamentais.mediator;

public interface Gestor {
    String receberPedidoFerias(String mensagem);
    String receberPedidoAumento(String mensagem);
    String receberDenuncia(String mensagem);
}