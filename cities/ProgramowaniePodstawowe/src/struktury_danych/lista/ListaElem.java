package struktury_danych.lista;

public class ListaElem {

    private ListaElem prev;//poprzedni
    private ListaElem next;//nastepny
    private int value;

    public ListaElem(int value){
        this.value = value;
        this.prev = this.next = null;
    }

    public ListaElem getPrev() {
        return prev;
    }

    public void setPrev(ListaElem prev) {
        this.prev = prev;
    }

    public ListaElem getNext() {
        return next;
    }

    public void setNext(ListaElem next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
