package entidades;

public class Gerente extends Funcionario {

    
    private double abonoSalarial;

    
    
    public Gerente(String nome, String cpf) {
        super(nome, cpf);
        //TODO Auto-generated constructor stub
    }
    
    @Overrride
    public String toString(){
        String texto = super.toString();

        return texto + " abono: "+ abonoSalarial;

    }   


    public void defineAbono(double montantedevendas){
        abonoSalarial = montantedevendas * 0.05;
    }



}
