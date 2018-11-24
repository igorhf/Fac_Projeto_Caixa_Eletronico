package projeto_caixa_eletronico;

import java.util.ArrayList;
import java.util.List;

public class banco extends Conta {
    contaCorrente corrente = new contaCorrente();   
    List<Conta> contas = new ArrayList<>();
    Object[] vetor = new Object[20];

}
