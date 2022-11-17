class ItemVenda {
  private int quantidade;
  private Produto produto;

  public ItemVenda() {// contrutor vazio
  }

  // construtor que vai auxiliar nos testes
  public ItemVenda(int quantidade, Produto pd) {

    this.quantidade = quantidade;
    this.produto = pd;
  }

  public void SetItemVenda(int quantidade, Produto pd) {
    this.quantidade = quantidade;
    this.produto = pd;
  }
  public Produto GetProduto(){
    return produto;
  }
  public int GetQuantidade(){
    return quantidade;
  }

  public double CalculaTotal() {
    return produto.GetPreco() * quantidade;
  }
  
}