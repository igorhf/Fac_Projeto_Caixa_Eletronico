package projeto_caixa_eletronico;

public class Conta {
    
    private String id;
    private double saldo;
    private boolean identificador;
 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getIdentificador() {
        return identificador;
    }

    public void setIdentificador(boolean identificador) {
        this.identificador = identificador;
    }
        
    public void Conta(String id,double saldo,boolean identificador){
    this.id=id;
    this.saldo=saldo;
    this.identificador=identificador;   
    }
    
    public void saque(double saque){
        setSaldo(getSaldo() - saque);
    }
    
    public void deposito(double deposito){
        setSaldo(getSaldo() + deposito);
    }
    
    public void juros(double juros){
        setSaldo(getSaldo() * juros);
    }
}
