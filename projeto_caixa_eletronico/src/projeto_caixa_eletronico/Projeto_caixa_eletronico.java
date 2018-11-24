package projeto_caixa_eletronico;

public class Projeto_caixa_eletronico extends banco {

    public static void main(String[] args) {
        int i = 0;
        banco b = new banco();
        
        contaPoupanca poupanca = new contaPoupanca();
        contaCorrente correntes = new contaCorrente();
        contaCorrente correntes1 = new contaCorrente();
                
        correntes.contaCorrente("454", 1, true);
        //correntes.contaCorrente("456", 1, true);
        correntes1.contaCorrente("456", 2.9, true);
        poupanca.contaPoupanca("1234456", 27.7, true);
        b.contas.add(correntes);
        b.contas.add(poupanca);
                b.contas.add(correntes1);
                correntes.contaCorrente("igor", 25, true);
        b.contas.add(correntes);
                        correntes.contaCorrente("ivo", 25, true);
                b.contas.add(correntes);
                System.out.println(correntes.getId()+" testrando"+correntes.getSaldo());
        System.out.println(b.vetor.length);
        b.vetor[0] = correntes.getId();
        b.vetor[1] = correntes.getSaldo();
        b.vetor[2] = correntes.getIdentificador();
        
       // b.vetor[3] = correntes;
// b.setId("123");
       // b.setIdentificador(true);
       /// b.setSaldo(100);
       // b.isIdentificador();
       // b.dados.add("igor");
       // b.dados.add("ivo");
       // b.vetor[0][0]=b.getId();
      //  b.vetor[0][1]=b.getSaldo();
       // b.vetor[0][2]=b.isIdentificador();

       for (Object item:b.vetor){            
            System.out.println(i+" "+item);
            i++;
        }
        for (projeto_caixa_eletronico.Conta item:b.contas){            
            System.out.println(i+" "+item.getId()+" "+item.getIdentificador()+" "+item.getSaldo());
            i++;
        }
    }
    
}
