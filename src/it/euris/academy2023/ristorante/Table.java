package it.euris.academy2023.ristorante;

public class Table {
    int idTable;
    int coverTable;

    public Table(int idTable, int coverTable) {
        this.idTable = idTable;
        this.coverTable = coverTable;
    }

    public int getIdTable() {
        return idTable;
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    public int getCoverTable() {
        return coverTable;
    }

    public void setCoverTable(int coverTable) {
        this.coverTable = coverTable;
    }
}
