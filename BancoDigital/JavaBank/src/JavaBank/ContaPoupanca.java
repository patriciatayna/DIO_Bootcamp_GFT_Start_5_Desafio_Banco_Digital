package JavaBank;

public class ContaPoupanca extends Conta {

    private String tipoDaConta;

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.tipoDaConta = "Conta Poupança";
    }

    @Override
    public String toString() {
        return "ContaPoupanca {" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=R$" + saldo +
                '}';
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n==========   " + Banco.getNome() + "   ==========");
        System.out.println("=== Extrato da Conta Poupança ===\n");
        System.out.println("Tipo de Conta: " + this.getTipoDaConta());
        cliente.imprimirInfosCliente(cliente);
        imprimirInfosComuns();
    }
}
