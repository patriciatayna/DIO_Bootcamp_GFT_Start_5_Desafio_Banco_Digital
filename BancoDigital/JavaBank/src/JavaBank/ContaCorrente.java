package JavaBank;

public class ContaCorrente extends Conta {

    protected String tipoDaConta;

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.tipoDaConta = "Conta Corrente";

    }

    @Override
    public String toString() {
        return "ContaCorrente {" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=R$" + saldo +
                '}';
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n==========   " + Banco.getNome() + "   ==========");
        System.out.println("===  Extrato da Conta Corrente ===\n");
        System.out.println("Tipo de Conta: " + this.getTipoDaConta());
        cliente.imprimirInfosCliente(cliente);
        imprimirInfosComuns();
    }
}
