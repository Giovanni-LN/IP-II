import java.time.LocalDate;

class Cliente {
  private String cpf, nome;
  private LocalDate dataNascimento;

  public Cliente() {
    cpf = "0000000000";
    nome = "Cliente indefinido";
    dataNascimento = LocalDate.now();
  }

  public void SetCliente(String cpf, String nome, LocalDate dtNascimento) {
    this.cpf = cpf;
    this.nome = nome;
    dataNascimento = dtNascimento;
  }

  public int CalculaIdade() {
    return LocalDate.now().getYear() - dataNascimento.getYear();
  }

  public String GetCpf() {
    return cpf;
  }

  public String GetNome() {
    return nome;
  }

}