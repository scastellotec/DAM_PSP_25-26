public class Cuenta {
    int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }

    public void sacarDinero(int dinero) {
        this.saldo -= dinero;
    }

    public void ingresarDinero(int dinero) {
        this.saldo += dinero;
    }
}
