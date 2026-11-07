package padroescomportamentais.mediator;

public class RH {

    private static RH instancia = new RH();

    private RH() {}

    public static RH getInstancia() {
        return instancia;
    }

    public String receberPedidoFeriasChefe(String mensagem) {
        return "O RH agradece seu contato.\n" +
                "O Chefe respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Chefe.getInstancia().receberPedidoFerias(mensagem);
    }

    public String receberPedidoAumentoChefe(String mensagem) {
        return "O RH agradece seu contato.\n" +
                "O Chefe respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Chefe.getInstancia().receberPedidoAumento(mensagem);
    }

    public String receberDenunciaChefe(String mensagem) {
        return "O RH agradece seu contato.\n" +
                "O Chefe respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Chefe.getInstancia().receberDenuncia(mensagem);
    }

}