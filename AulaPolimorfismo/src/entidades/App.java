package entidades;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Rhuan", "125-125-154-65");
        Gerente g = new Gerente("rhuan", "1235");
        g.defineAbono(10000);
        System.out.println(f);
        System.out.println(g.getSalario());
    }
}
