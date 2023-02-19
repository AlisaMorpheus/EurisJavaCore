package it.euris.academy2023.esercizioscuola;

public abstract class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private String id;

    public Persona(String nome, String cognome, int eta, String id) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nome= " + nome + '\n' +
                ", cognome= '" + cognome + '\n' +
                ", eta= " + eta +
                "\n, id= " + id + ".\n";
    }
}
