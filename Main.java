import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Main {

  public static void main(String[] args) {
    TesteVendaMain();

  }

  public static void TesteVendaMain() {
    Produto produto01 = new Produto();
    Produto produto02 = new Produto();
    Produto produto03 = new Produto();
    Produto produto04 = new Produto();

    produto01.SetProduto(0001, "Produto 01", "Produto 01", 10);
    produto02.SetProduto(0002, "Produto 02", "Produto 02", 5);
    produto03.SetProduto(0003, "Produto 03", "Produto 03", 20);
    produto04.SetProduto(0004, "Produto 04", "Produto 04", 15);

    ItemVenda item01 = new ItemVenda(10, produto01);
    ItemVenda item02 = new ItemVenda(5, produto02);
    ItemVenda item03 = new ItemVenda(10, produto03);
    ItemVenda item04 = new ItemVenda(2, produto04);

    Cliente cliente = new Cliente();
    cliente.SetCliente("123456", "José Maria Marques",
        LocalDate.parse("01/01/1996", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    Venda venda = new Venda();
    venda.SetCliente(cliente);
    venda.SetAtendente("Maria Dolores Sampaio");
    venda.AdicionarItem(item01);
    venda.AdicionarItem(item02);
    venda.AdicionarItem(item03);
    venda.AdicionarItem(item04);

    venda.ListarItensVenda();
  }
}