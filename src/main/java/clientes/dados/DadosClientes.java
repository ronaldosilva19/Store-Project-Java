package clientes.dados;

// Dados dos clientes.
public class DadosClientes {
    private String nome;
    private String cidade;
    private String data_nascimento;
    private String estado;
    private double saldo_conta;

    public DadosClientes(String nome, String cidade, String data_nascimento, String estado, double saldo_conta) {
        this.nome = nome;
        this.cidade = cidade;
        this.data_nascimento = data_nascimento;
        this.estado = estado;
        this.saldo_conta = saldo_conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDataNascimento() {
        return data_nascimento;
    }

    public void setDataNascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSaldoConta() {
        return saldo_conta;
    }

    public void setSaldoConta(double saldo_conta) {
        this.saldo_conta = saldo_conta;
    }
}
