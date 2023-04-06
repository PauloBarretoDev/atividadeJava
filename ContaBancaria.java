public class ContaBancaria {
    public double saldo;
    public Cliente cliente;

    public ContaBancaria(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    public void sacar(int valor) {
        if (valor > saldo) {
            System.out.println("Você não possui saldo!");
        } else {
            this.saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "Informações do cliente: \n" + this.cliente;
    }
}
