package entidades;

public class Vendedor extends Funcionario{
    
    private double totaldevendas;


    public Vendedor(String nome, String cpf){
        super(nome, cpf);
        totaldevendas = 0;

    }

    public void registraVenda(double valor){
        if(valor > 0){
            this.totaldevendas += valor;
        }
    }

    public double calcularComissao(double d){
        double comissao = totaldevendas * 0.01;
        return comissao;
    }

    @Override
    public double getSalario(){
        double comissao = calcularComissao(totaldevendas);
        double base = super.getSalario();
        
        return comissao + base;
    }
       

}
