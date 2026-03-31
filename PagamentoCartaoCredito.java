public class PagamentoCartaoCredito implements ProcessadorPagamento {
    private String numero;
    private String nomeTitular;
    private String cvv;
    private double limiteSimulado = 5000.0; [cite: 39]

    public PagamentoCartaoCredito(String numero, String nomeTitular, String cvv) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.cvv = cvv; [cite: 40]
    }

    @Override
    public boolean pagar(double valor) {
        // Verifica se campos estão preenchidos e se há limite [cite: 42]
        if (numero != null && !numero.isEmpty() && nomeTitular != null && 
            !nomeTitular.isEmpty() && cvv != null && !cvv.isEmpty() && valor <= limiteSimulado) {
            
            System.out.println("Autorizando cartão para: " + nomeTitular); [cite: 43]
            return true; [cite: 44]
        }
        System.out.println("Pagamento no cartão recusado: Dados inválidos ou limite insuficiente."); [cite: 44]
        return false;
    }
}