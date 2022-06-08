package salario;

public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            return super.getSalarioFixo() * 0.2;
        } else {
            return 0;
        }
    }
}
