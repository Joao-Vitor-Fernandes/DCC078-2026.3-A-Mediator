package padroescomportamentais.mediator;

public abstract class Pessoa {

    public String solicitarFerias(String mensagem) {
        return RH.getInstancia().receberPedidoFeriasChefe(mensagem);
    }

    public String solicitarAumento(String mensagem) {
        return RH.getInstancia().receberPedidoAumentoChefe(mensagem);
    }

    public String denunciarAssedio(String mensagem) {
        return RH.getInstancia().receberDenunciaChefe(mensagem);
    }

}