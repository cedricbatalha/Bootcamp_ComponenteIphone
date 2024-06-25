package telefone;

import orquestrador.Orquestrador;

public class LigacaoPassivo implements Orquestrador {
    public void checkApp() {
        System.out.println("Recebe Ligação");
    }
}
