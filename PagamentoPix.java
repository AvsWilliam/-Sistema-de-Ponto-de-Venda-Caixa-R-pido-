public class PagamentoPix implements ProcessadorPagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix; 
    }

    @Override
    public boolean pagar(double valor) {
        if (valor > 0 && chavePix != null && !chavePix.isEmpty()) { 
            System.out.println("Processando PIX para chave: " + chavePix);
            System.out.println("Pagamento aprovado via PIX!"); 
            return true; 
        }
        System.out.println("Erro: Chave Pix inválida ou valor zerado."); 
        return false;
    }
}