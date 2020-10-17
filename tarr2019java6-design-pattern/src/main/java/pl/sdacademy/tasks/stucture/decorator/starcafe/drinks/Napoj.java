package pl.sdacademy.tasks.stucture.decorator.starcafe.drinks;

public abstract class Napoj {

    private String opis = "Napoj nieznany";

    public Napoj(String opis) {
        this.opis = opis;
    }

    public String pobierzOpis() {
        return this.opis;
    }

    public void ustawOpis(String opis) {
       this.opis = opis;
    }

    public abstract float koszt();
}
