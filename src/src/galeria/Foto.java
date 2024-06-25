package galeria;

import orquestrador.Orquestrador;
import orquestrador.OrquestradorGaleria;

public class Foto implements Orquestrador, OrquestradorGaleria {
    @Override
    public void checkApp() {
        System.out.println("Foto Interface Orquestrador");
    }

    @Override
    public void checkAppGaleria() {
        System.out.println("Foto Interface Orquestrador Galeria");
    }
}
