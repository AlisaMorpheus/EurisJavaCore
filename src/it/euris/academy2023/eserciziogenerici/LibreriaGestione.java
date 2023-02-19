package it.euris.academy2023.eserciziogenerici;

public class LibreriaGestione {

    private Libreria <Media> mediaLibreria;

    public LibreriaGestione(Libreria<Media> mediaLibreria) {
        this.mediaLibreria = mediaLibreria;
    }

    public void gestione(String comando, String tipoMedia, String titoloMedia) {
        switch (comando){
            case "i":
                aggiungere(tipoMedia, titoloMedia);
                break;
            case "r":
                restituire(tipoMedia, titoloMedia);
                break;
            default:
                System.out.println("Operazione non disponibile");
        }
    }

    public void aggiungere(String tipoMedia, String titoloMedia){
        switch (tipoMedia){
            case "l":
                Media element = new Libro(titoloMedia);
                mediaLibreria.getListaMedia().add(element);
        }

    }

    public void restituire(String tipoMedia, String titoloMedia){

    }
}
