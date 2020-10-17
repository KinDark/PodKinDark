package struktury_danych.dwukierunkowa_lista;

public class DwukierunListaElem {

    private int value;
    private DwukierunListaElem next;    //nastepny
    private DwukierunListaElem prev;    //poprzedni

    public DwukierunListaElem(int value){
        this.value = value;
        this.next = null;
        this.prev = null;

    }
    public DwukierunListaElem(int value, DwukierunListaElem prev){
        this.value = value;
        this.prev = prev;
    }

    public int getValue() {
                return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DwukierunListaElem getNext() {
        return next;
    }

    public void setNext(DwukierunListaElem next) {
            this.next = next;
    }

    public DwukierunListaElem getPrev() {
        return prev;
    }

    public void setPrev(DwukierunListaElem prev) {
        this.prev = prev;
    }
}
