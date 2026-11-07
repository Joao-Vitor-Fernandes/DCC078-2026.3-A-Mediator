package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    void deveSolicitarFerias() {
        Funcionario funcionario = new Funcionario();
        assertEquals("O RH agradece seu contato.\nO Chefe respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Chefe vai avaliar o pedido de férias: 15 dias em dezembro",
                funcionario.solicitarFerias("15 dias em dezembro"));
    }

    @Test
    void deveSolicitarAumento() {
        Funcionario funcionario = new Funcionario();
        assertEquals("O RH agradece seu contato.\nO Chefe respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Chefe vai analisar o pedido de aumento: Novas responsabilidades na equipe",
                funcionario.solicitarAumento("Novas responsabilidades na equipe"));
    }

    @Test
    void deveDenunciarAssedio() {
        Funcionario funcionario = new Funcionario();
        assertEquals("O RH agradece seu contato.\nO Chefe respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Chefe vai apurar a denúncia: Assédio moral no setor",
                funcionario.denunciarAssedio("Assédio moral no setor"));
    }

}
