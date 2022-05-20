package JavaBank;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria", "01203398213");
        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);

        System.out.println(cc);
        System.out.println(cp);

        cc.depositar(250.00);
        cc.transferir(cp, 150.00);
        cp.sacar(100.00);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
