package salario;

public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            double surplus = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            return (super.getSalarioFixo() * 0.2) + (surplus * 0.01);
        } else {
            return 0;
        }
    }
}
