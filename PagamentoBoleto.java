import java.util.UUID;

public class PagamentoBoleto implements ProcessadorPagamento {
    @Override
    public boolean pagar(double valor) {
        if (valor > 0) { [cite: 47]
            String linhaDigitavel = UUID.randomUUID().toString(); [cite: 48]
            System.out.println("Boleto gerado com sucesso!");
            System.out.println("Linha digitável: " + linhaDigitavel); [cite: 49]
            System.out.println("Por favor, pague o boleto para concluir a compra."); [cite: 49]
            return true; [cite: 50]
        }
        System.out.println("Erro: Valor do boleto inválido."); [cite: 50]
        return false;
    }
}