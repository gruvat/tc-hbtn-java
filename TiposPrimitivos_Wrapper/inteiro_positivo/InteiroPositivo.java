public class InteiroPositivo {

    // Crie o atributo valor do tipo int, que é o valor “envelopado” na classe.
    // Crie um construtor que receba um valor int que converta e inicializa o atributo valor.
    // Crie um construtor que receba um valor String que converta e inicializa o atributo valor.
    // Deve-se validar se o valor é inteiro, senão deve lançar uma exceção Valor nao eh um 
    // valor inteiro positivo.
    // Daremos mais “poder” para nossa classe incluindo o método ehPrimo que retorna um boolean
    // que returna true se o número “envelopado” for primo, senão retorna false.

    private int valor;

    InteiroPositivo(int valor) throws IllegalArgumentException {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    InteiroPositivo(String valor) throws IllegalArgumentException {
        if (Integer.valueOf(valor) >= 0) {
            this.valor = Integer.valueOf(valor);
        } else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public boolean ehPrimo() {
        int divisores = 0;
        for (int i=1; i<= this.valor; i++) {
            if ((this.valor % i) == 0) {
                divisores += 1;
            }
        }
        if (divisores == 2) {
            return true;
        } else {
            return false;
        }
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) throws IllegalArgumentException {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

}
