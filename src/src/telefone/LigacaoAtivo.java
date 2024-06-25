package telefone;

import orquestrador.Orquestrador;

public class LigacaoAtivo implements Orquestrador {
    public void checkApp() {
        System.out.println("Faz Ligação");
    }
}
