package JavaBank;

public abstract class Conta implements IConta{
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.agencia = 1001;
        this.numero = SEQUENCIAL;
        this.saldo = 0d;

        SEQUENCIAL++;
    }



    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirInfosComuns() {
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número da Conta: %d%n", this.numero);
        System.out.printf("Saldo: R$%.2f%n", this.saldo);
    }
}
