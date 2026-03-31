import java.util.Scanner;

public class CaixaRapido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho(); [cite: 74]

        // Adicionando itens de exemplo [cite: 75]
        carrinho.adicionar(new Item("Café", 8.50));
        carrinho.adicionar(new Item("Pão de Queijo", 6.00));
        carrinho.adicionar(new Item("Suco", 9.90));

        carrinho.exibirItens(); [cite: 76]

        System.out.print("Selecione o meio de pagamento [1-Pix, 2-Cartão, 3-Boleto]: "); [cite: 77, 92]
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        ProcessadorPagamento processador = null; [cite: 83]

        switch (opcao) { [cite: 78]
            case 1:
                System.out.print("Digite a chave Pix: "); [cite: 81]
                String chave = scanner.nextLine();
                processador = new PagamentoPix(chave); [cite: 82]
                break;
            case 2:
                System.out.print("Número do Cartão: ");
                String num = scanner.nextLine();
                System.out.print("Nome do Titular: ");
                String nome = scanner.nextLine();
                System.out.print("CVV: ");
                String cvv = scanner.nextLine();
                processador = new PagamentoCartaoCredito(num, nome, cvv); [cite: 82]
                break;
            case 3:
                processador = new PagamentoBoleto(); [cite: 82]
                break;
            default:
                System.out.println("Opção inválida!");
        }

        if (processador != null) {
            carrinho.finalizarCompra(processador); [cite: 84]
        }

        scanner.close(); [cite: 84]
    }
}