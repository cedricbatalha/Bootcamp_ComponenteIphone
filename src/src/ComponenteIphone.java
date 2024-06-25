import galeria.Foto;
import galeria.Video;
import ipod.ExibeVideo;
import ipod.ListaCapaAlbum;
import ipod.PesquisaMusica;
import ipod.TocaMusica;
import navegador.AbreNavegador;
import navegador.AdicionaNovaAba;
import navegador.AtualizaPagina;
import telefone.Conferencia;
import telefone.Contatos;
import telefone.CorreioDeVoz;
import telefone.LigacaoAtivo;
import telefone.LigacaoPassivo;
import orquestrador.Orquestrador;
import orquestrador.OrquestradorGaleria;

public class ComponenteIphone {
    public static void main(String[] args) {

        //System.out.println("Main");

        // TODO: Informa qual o aplicativo escolhido
        String appEscolhido = "galeria";


        if(appEscolhido.equals("ipod")) {
            escolhaIpod();
        }
        else if(appEscolhido.equals("telefone")) {
            escolhaTelefone();
        }
        else if (appEscolhido.equals("navegador")) {
            escolhaNavegador();
        }
        else if (appEscolhido.equals("galeria")) {
            escolhaGaleria();
        }

    }

    //Escolheu o IPOD
    public static void escolhaIpod(){
        Orquestrador ExibeVideo = new ExibeVideo();
        ExibeVideo.checkApp();

        Orquestrador ListaCapaAlbum = new ListaCapaAlbum();
        ListaCapaAlbum.checkApp();

        Orquestrador PesquisaMusica = new PesquisaMusica();
        PesquisaMusica.checkApp();

        Orquestrador TocaMusica = new TocaMusica();
        TocaMusica.checkApp();
    }

    // Escolheu o Telefone
    public static void escolhaTelefone(){
        Orquestrador Conferencia = new Conferencia();
        Conferencia.checkApp();

        Orquestrador Contatos = new Contatos();
        Contatos.checkApp();

        Orquestrador CorreioDeVoz = new CorreioDeVoz();
        CorreioDeVoz.checkApp();

        Orquestrador LigacaoAtivo = new LigacaoAtivo();
        LigacaoAtivo.checkApp();

        Orquestrador LigacaoPassivo = new LigacaoPassivo();
        LigacaoPassivo.checkApp();
    }

    //Escolheu o navegador
    public static void escolhaNavegador(){
        Orquestrador AbreNavegador = new AbreNavegador();
        AbreNavegador.checkApp();

        Orquestrador AdicionaNovaAba = new AdicionaNovaAba();
        AdicionaNovaAba.checkApp();

        Orquestrador AtualizaPagina = new AtualizaPagina();
        AtualizaPagina.checkApp();
    }

    //Escolheu a galeria
    public static void escolhaGaleria(){
        Orquestrador Foto = new Foto();
        Foto.checkApp();

        OrquestradorGaleria FotoGaleria = new Foto();
        FotoGaleria.checkAppGaleria();

        Orquestrador Video = new Video();
        Video.checkApp();

        OrquestradorGaleria VideoGaleria = new Video();
        VideoGaleria.checkAppGaleria();

    }
}
