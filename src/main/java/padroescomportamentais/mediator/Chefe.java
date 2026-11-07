package padroescomportamentais.mediator;

public class Chefe implements Gestor {

    private static Chefe instancia = new Chefe();

    private Chefe() {}

    public static Chefe getInstancia() {
        return instancia;
    }

    public String receberPedidoFerias(String mensagem) {
        return "O Chefe vai avaliar o pedido de férias: " + mensagem;
    }

    public String receberPedidoAumento(String mensagem) {
        return "O Chefe vai analisar o pedido de aumento: " + mensagem;
    }

    public String receberDenuncia(String mensagem) {
        return "O Chefe vai apurar a denúncia: " + mensagem;
    }
}