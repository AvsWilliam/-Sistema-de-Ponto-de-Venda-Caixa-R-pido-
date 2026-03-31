import java.util.Scanner;

public class CaixaRapido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho(); 

        // Adicionando itens de exemplo [cite: 75]
        carrinho.adicionar(new Item("Café", 8.50));
        carrinho.adicionar(new Item("Pão de Queijo", 6.00));
        carrinho.adicionar(new Item("Suco", 9.90));

        carrinho.exibirItens();

        System.out.print("Selecione o meio de pagamento [1-Pix, 2-Cartão, 3-Boleto]: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        ProcessadorPagamento processador = null;

        switch (opcao) {
            case 1:
                System.out.print("Digite a chave Pix: ");
                String chave = scanner.nextLine();
                processador = new PagamentoPix(chave); 
                break;
            case 2:
                System.out.print("Número do Cartão: ");
                String num = scanner.nextLine();
                System.out.print("Nome do Titular: ");
                String nome = scanner.nextLine();
                System.out.print("CVV: ");
                String cvv = scanner.nextLine();
                validarCvv (cvv);
                processador = new PagamentoCartaoCredito(num, nome, cvv);
                break;          
            case 3:
                processador = new PagamentoBoleto(); 
                break;
            default:
                System.out.println("Opção inválida!");
        }

        if (processador != null) {
            carrinho.finalizarCompra(processador);
        }

        scanner.close();
    }
}