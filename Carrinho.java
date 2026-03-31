import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens = new ArrayList<>();

    public void adicionar(Item item) {
        itens.add(item);
    }

    public double total() {
        return itens.stream().mapToDouble(Item::getPreco).sum(); 
    }

    public void exibirItens() {
        System.out.println("Carrinho:"); 
        for (Item item : itens) {
            System.out.printf("%s: R$ %.2f\n", item.getDescricao(), item.getPreco());
        }
        System.out.printf("Total: R$ %.2f\n", total()); 
    }

    public void finalizarCompra(ProcessadorPagamento proc) { 
        double valorTotal = total(); 
        if (proc.pagar(valorTotal)) { 
            proc.emitirRecibo(valorTotal); 
        } else {
            System.out.println("Pagamento recusado..."); 
        }
    }
}