public class PagamentoPix implements ProcessadorPagamento {
    private String chavePix; [cite: 27]

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix; [cite: 30]
    }

    @Override
    public boolean pagar(double valor) {
        if (valor > 0 && chavePix != null && !chavePix.isEmpty()) { [cite: 31]
            System.out.println("Processando PIX para chave: " + chavePix); [cite: 32, 94]
            System.out.println("Pagamento aprovado via PIX!"); [cite: 33, 95]
            return true; [cite: 34]
        }
        System.out.println("Erro: Chave Pix inválida ou valor zerado."); [cite: 34]
        return false;
    }
}