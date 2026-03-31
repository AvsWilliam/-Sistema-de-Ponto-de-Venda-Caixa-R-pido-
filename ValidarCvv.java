ValidarCvv extends CaixaRapido {
    protected boolean validarCvv(String cvv) {
        return cvv != null && cvv.matches("\\d{3}");
    }
}