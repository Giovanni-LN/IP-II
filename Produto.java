class Produto {
  private int codigo;
  private String nome, descricao;
  private double preco;

  public Produto() {
    this.codigo = 0000;
    this.nome = "Produto indefinido";
    this.descricao = "Produto não foi devidamente registrado.";
    this.preco = 0.000;
  }

  public void SetProduto(int codigo, String nome, String descricao, double preco) {
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
  }

  public int GetCodigo() {
    return codigo;
  }

  public String GetNome() {
    return nome;
  }

  public String GetDescricao() {
    return descricao;
  }

  public double GetPreco() {
    return preco;
  }

}