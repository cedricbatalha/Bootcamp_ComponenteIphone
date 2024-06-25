package galeria;

import orquestrador.Orquestrador;
import orquestrador.OrquestradorGaleria;

public class Video implements Orquestrador, OrquestradorGaleria {
    public void checkApp(){
        System.out.println("Video Interface Orquestrador");
    }

    public void checkAppGaleria(){
        System.out.println("Video Interface Orquestrador Galeria");
    }

}