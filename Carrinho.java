import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens = new ArrayList<>(); [cite: 58]

    public void adicionar(Item item) {
        itens.add(item); [cite: 62]
    }

    public double total() {
        return itens.stream().mapToDouble(Item::getPreco).sum(); [cite: 63]
    }

    public void exibirItens() {
        System.out.println("Carrinho:"); [cite: 87]
        for (Item item : itens) {
            System.out.printf("%s: R$ %.2f\n", item.getDescricao(), item.getPreco()); [cite: 64, 88]
        }
        System.out.printf("Total: R$ %.2f\n", total()); [cite: 91]
    }

    public void finalizarCompra(ProcessadorPagamento proc) { [cite: 65, 66]
        double valorTotal = total(); [cite: 67]
        if (proc.pagar(valorTotal)) { [cite: 68]
            proc.emitirRecibo(valorTotal); [cite: 69]
        } else {
            System.out.println("Pagamento recusado..."); [cite: 71]
        }
    }
}