package entidades;

public class Funcionario {
    private String nome;
    private double salario;
    private String cpf;

    public Funcionario(String nome,  String cpf) {
        this.nome = nome;
        this.salario = 1500;
        this.cpf = cpf;
    }

    private Funcionario(){

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        String texto = "Nome: " + nome + " CPF: " + cpf + " Salario: " + salario;
        return texto;
    }
}
