package struktury_danych.stos_lista;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class StosElem {
    private int value;
    private StosElem prev;  //poprzedni

    public StosElem(int value, StosElem prev){
       this.value = value;
        this.prev = prev;

    }
// getValue Instancja obiektu, z którego chcesz uzyskać wartość właściwości, jeśli właściwość nie jest statyczna. Opcjonalne, jeśli właściwość jest statyczna.
    public int getValue() {
        return value;
    }
//getPrev - Zwraca poprzedni wpis bieżącego lub określonego wpisu w nawigatorze widoku
    public StosElem getPrev() {
        return prev;
    }
}
