public interface ProcessadorPagamento {
    boolean pagar(double valor);

    default void emitirRecibo(double valor) {
        System.out.printf("Recibo: pagamento de R$ %.2f confirmado.\n", valor);
    }
}