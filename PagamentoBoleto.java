import java.util.UUID;

public class PagamentoBoleto implements ProcessadorPagamento {
    @Override
    public boolean pagar(double valor) {
        if (valor > 0) {
            String linhaDigitavel = UUID.randomUUID().toString(); 
            System.out.println("Boleto gerado com sucesso!");
            System.out.println("Linha digitável: " + linhaDigitavel); 
            System.out.println("Por favor, pague o boleto para concluir a compra.");
            return true;
        }
        System.out.println("Erro: Valor do boleto inválido.");
        return false;
    }
}