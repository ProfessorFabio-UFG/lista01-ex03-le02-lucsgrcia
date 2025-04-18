package ex3;

public class Morador {

    private String nome, dataNascimento, cpf, celular;
    private char sexo;
    private int apartamento, bloco;
    private static int codigo_sequencial = 1;
    private int codigo_acesso = 0;

    public Morador(String nome, String dataNascimento, char sexo, String cpf, String celular, int apartamento, int bloco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.celular = celular;
        this.apartamento = apartamento;
        this.bloco = bloco;
        this.codigo_acesso = codigo_sequencial++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getApartamento() {
        return apartamento;
    }

    public void setApartamento(int apartamento) {
        this.apartamento = apartamento;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public int getCodigo_acesso() {
        return codigo_acesso;
    }

    @Override
    public String toString() {
        return "\nDados do morador" +
                "\nNome: " + nome +
                "\nData de Nascimento: " + dataNascimento +
                "\nSexo: " + sexo +
                "\nCPF: " + cpf +
                "\nCelular: " + celular +
                "\nApartamento: " + apartamento +
                "\nBloco: " + bloco +
                "\nCodigo de Acesso: " + codigo_acesso;
    }
}
