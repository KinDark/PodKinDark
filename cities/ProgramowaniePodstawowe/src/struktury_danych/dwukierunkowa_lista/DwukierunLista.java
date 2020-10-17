package struktury_danych.dwukierunkowa_lista;

import struktury_danych.kolejka_lista.KolejkaLista;
import struktury_danych.stos_lista.StosElem;

public class DwukierunLista {

    private DwukierunListaElem frist;   //pierwszy
    private DwukierunListaElem last;    //ostatni

    private DwukierunLista() {
        frist = last = null;
    }

    public boolean isEmpty() { // sprawdza czy pusty
        return frist == null && last == null;
    }

    //....................................................................................................
    public void addFrist(int value) {   //dodaj pierwszy element z listy
        int value1 = last.getValue();
        DwukierunListaElem elem = new DwukierunListaElem(value1);
        last.setNext(elem);
        elem.setPrev(last);
        last = elem;
        DwukierunListaElem elem1 = frist;
        elem1 = elem1.getNext();
        while (elem1 != elem) {
            elem = elem.getPrev();
            elem = elem.getPrev();
            value1 = elem.getValue();
            elem = elem.getNext();
            elem.setValue(value1);
            //    elem = elem.getPrev();
        }
        elem = elem.getPrev();
        elem.setValue(value);
        // show();
    }

    //....................................................................................................
    public void addLast(int value) {     //dodaj ostatni element do listy
        DwukierunListaElem elem = new DwukierunListaElem(value);
        if (isEmpty()) {
            frist = last = elem;
        } else {
            last.setNext(elem);
            elem.setPrev(last);
            last = elem;
        }
    }

    //....................................................................................................
    public int pollFrist() { //kasuje pierwszego z listy i przypisuje dane do int value
        int value = frist.getValue();
        frist = frist.getNext();
        if (frist == null) {  //jezeli usuwamy ostatni obiekt z kolejki
            last = null;
        }
        return value;
    }

    //....................................................................................................
    public int pollLast() { //kasuje oststniego z listy i przypisuje dane do int value
        int value = last.getValue();
        last = last.getPrev();
        if (last == null) {  //jezeli usuwamy ostatni obiekt z kolejki
            frist = null;
        }
        return value;
    }

    //....................................................................................................
    public int peekFrist() { //podglad pierwszego w kojejce
        if (isEmpty()) {
            //powinien być wyjatek w razie bledu
        }
        return frist.getValue();
    }

    //....................................................................................................
    public int peekLast() { //podglad postatniego w kojejce
        if (isEmpty()) {
            //powinien być wyjatek w razie bledu
        }
        return last.getValue();
    }

    //....................................................................................................
    public void show() {  //czyta od przodu
        DwukierunListaElem elem = frist;
        while (elem != null) {
            System.out.print(elem.getValue() + " ");
            if (last == elem) {
                break;
            }
            elem = elem.getNext();
        }
        System.out.println();
    }

    //...................................................................................................
    public void showReverse() {  //czyta od tyly
        DwukierunListaElem elem = last;
        while (elem != null) {
            System.out.print(elem.getValue() + " ");
            if (frist == elem) {
                break;
            }
            elem = elem.getPrev();
        }
        System.out.println();
    }

//****************************************************************************************************

    public static void main(String[] args) {
        DwukierunLista kolejka = new DwukierunLista();
        kolejka.addLast(4);
        kolejka.addLast(5);
        kolejka.addLast(9);

        kolejka.addFrist(100);
        kolejka.addFrist(101);
        kolejka.addFrist(102);
        kolejka.show();
        kolejka.showReverse();
        kolejka.addLast(13);
        kolejka.addLast(23);
        kolejka.show();
        kolejka.showReverse();
//        kolejka.addLast(33);
//        kolejka.addLast(43);
//        kolejka.addLast(53);
//        kolejka.addLast(63);
//        kolejka.show();
//        kolejka.showReverse();
//        kolejka.addLast(77);
//        kolejka.addLast(88);
//        kolejka.show();
//        kolejka.showReverse();
//      //  kolejka.pollFrist(); //kasuje pierwszego
////        kolejka.showReverse();
//        // kolejka.pollFrist();
//          System.out.println("kasuje ostatniego: " + kolejka.pollLast());
//           System.out.println("kasuje ostatniego: " + kolejka.pollLast());
//         kolejka.show();
//         kolejka.showReverse();
//        System.out.println("kasuje pierwszego: " + kolejka.pollFrist());
// //       System.out.println("kasuje pierwszego: " + kolejka.pollFrist());
//        // kolejka.addLast(99);
//        // kolejka.show();
//        System.out.println("podgląd pierwszego: " + kolejka.peekFrist());
//        kolejka.show();
//        kolejka.showReverse();
//        //    kolejka.showReverse();
//
//        // kolejka.addFrist(4);
//        // kolejka.addFrist(8);
//
//        //       System.out.println("kasuje ostatniego: " + kolejka.pollLast());
//
//        //       System.out.println("podgląd pierwszego: " + kolejka.peekFrist());
//               System.out.println("podgląd ostatniego: " + kolejka.peekLast());

//        kolejka.add(810);
//        kolejka.add(810);
//        kolejka.add(810);

//        kolejka.poll();
//        kolejka.poll();
//        kolejka.poll();
//        kolejka.poll();
//        kolejka.poll();


        //  System.out.println("Poll: " + kolejka.poll());
        //   System.out.println("Poll: " + kolejka.poll());

    }


}
