package myProjektTarr2019java6Dar.podstawy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 15.02.2020
 **/
public class Mlotek {

    private String kolor;// właściwość, pole

    /**
     * Konstruktor domyślny (bezargumentowy) w klasie młotek
     * domyślny młotek jest czerwony
     */
    public Mlotek(/*to jest pusto nie ma argumentów*/) {
        // konstruktor bez argumentowy
        // domyślne właściwości
        kolor = "czerwony";
    }

    /*
    Konstruktor argumentowy: argumentem jest kolor młotka
     */
    public Mlotek(String wprowadzonyKolor){
        kolor = wprowadzonyKolor;
    }


    /*
    Metoda do pobierania koloru młotka
     */
    public String pobierzKolor(){
        return kolor;
    }

    public String toString(){
        return "Mlotek "+kolor;
    }
}
