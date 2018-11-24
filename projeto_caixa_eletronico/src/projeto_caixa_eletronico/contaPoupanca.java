package projeto_caixa_eletronico;

public class contaPoupanca extends Conta {
    
    public void contaPoupanca(String id,double saldo,boolean identificador){
        setId(id);
        setSaldo(saldo);
        setIdentificador(identificador);
    }
}
