public interface ProcessadorPagamento {
    // Método abstrato para processar o pagamento [cite: 19]
    boolean pagar(double valor);

    // Método padrão para emissão de recibo [cite: 22]
    default void emitirRecibo(double valor) {
        System.out.printf("Recibo: pagamento de R$ %.2f confirmado.\n", valor); [cite: 22, 96]
    }
}