import java.time.LocalDate;
import java.util.ArrayList;

class Venda {
  private LocalDate data;
  private String atendente;
  private Cliente cliente;
  private ArrayList<ItemVenda> listItemVenda = new ArrayList<>();

  public Venda() {
    data = LocalDate.now();
    atendente = "Ainda não Registado";
  }

  public void SetAtendente(String atendente) {
    this.atendente = atendente;
  }

  public void SetCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void AdicionarItem(ItemVenda item) {
    listItemVenda.add(item);
  }

  public double CalculaTotal() {
    double valorTotal = 0;
    for (ItemVenda item : listItemVenda) {
      valorTotal += item.CalculaTotal();
    }
    return valorTotal;
  }

  public void ListarItensVenda() {
    System.out.printf("Data da Venda: %1$td/%1$tm/%1$ty%n", data);
    
    System.out.printf("Cliente: %s | CPF: %s | Idade: %d %n", cliente.GetNome(), cliente.GetCpf(),
        cliente.CalculaIdade());
    System.out.printf("Atendente: %s%n%n", atendente);
    
    System.out.println("Nome do produto | Preço    | Quantidade | Total");
    System.out.println("-----------------------------------------------------");
    for (ItemVenda itemVenda : listItemVenda) {
      System.out.printf("%-15s | R$ %5.2f | %10d | R$ %8.2f%n", itemVenda.GetProduto().GetNome(),itemVenda.GetProduto().GetPreco(), itemVenda.GetQuantidade(), itemVenda.CalculaTotal());
    }
    System.out.println("-----------------------------------------------------");
    System.out.printf("%-43s R$ %.2f%n", "Total da Venda:", CalculaTotal());

  }
}//