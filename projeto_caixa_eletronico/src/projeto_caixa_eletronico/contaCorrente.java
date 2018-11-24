package projeto_caixa_eletronico;

public class contaCorrente extends Conta {
    
    public void contaCorrente(String id,double saldo,boolean identificador){
        setId(id);
        setSaldo(saldo);
        setIdentificador(identificador);  
        
    }    
}
