package struktury_danych.lista;

public class Lista {
    private ListaElem frist;    //pierwszy
    private ListaElem last;     //ostatni

    public Lista() {
        this.frist = this.last = null;
    }

    public boolean isEmpty() {
        return frist == null && last == null;
//        if (frist == null && last == null) {
//            return true;
//        }else{
//        return false;
//    }
    }

    public void addFrist(int value) {  //dodaj element na początek
        ListaElem elem = new ListaElem(value);

        if (isEmpty()) {
            frist = elem;
            last = elem;
        } else {
            elem.setNext(frist);
            frist.setPrev(elem);
            frist = elem;
        }
    }

    public void addLast(int value) {     //dodaj element na koniec kolejki
        ListaElem elem = new ListaElem(value);
        if (isEmpty()) {
            frist = elem;
            last = elem;
        } else {
            elem.setPrev(last);
            last.setNext(elem);
            last = elem;
        }
    }

    public int peekFrist() { //podgląd pierwszego elemetu
        if (isEmpty()) {
            //wyrzucic wyjątek, który w main powinien zostać obsłużony
        }
        return frist.getValue();
    }

    public int peekLast() {
        if (isEmpty()) {
            //wyrzucic wyjątek, który w main powinien zostać obsłużony
        }
        return last.getValue();
    }

    public int pollFrist() { //kasuje pierwszego z listy i przypisuje dane do int value
        if (isEmpty()) {
            //wyrzucic wyjątek, który w main powinien zostać obsłużony
        }
        int value = frist.getValue();
        if (frist == last) { //jeżeli w liście znajduje się jeden element
            frist = last = null;
        } else { //jężeli w liście znajduję sie wiele elementów
            frist = frist.getNext();
            frist.setPrev(null);
        }
//        if (frist == null) {
//            last = null;
//        } else {
//            frist.setPrev(null);
//        }
        return value;
    }

    public int pollLast() { //kasuje ostatniego z listy i przypisuje dane do int value
        if (isEmpty()) {
            //wyrzucic wyjątek, który w main powinien zostać obsłużony
        }
        int value = last.getValue();
        if (frist == last) { //jeżeli w liście znajduje się jeden element
            frist = last = null;
        } else { //jężeli w liście znajduję sie wiele elementów
            last = last.getPrev();
            last.setNext(null);
        }
        return value;
    }

    public void show() { //odczytuje liste od początku po koleji
        ListaElem tmp = frist;
        while (tmp != null) {
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.getNext();
        }
        System.out.println();

    }

    public void showReverse() { //odczytuje liste od końca po koleji
        ListaElem tmp = last;
        while (tmp != null) {
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.getPrev();
        }
        System.out.println();

    }

    public ListaElem search(int value) { //wyszukuje wartość od początku po koleji
        ListaElem tmp = frist;
        while (tmp != null) {
            if (value == tmp.getValue()) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    public boolean remove(int value) { // metoda do usunięcia dowolnego elementu z listy
        ListaElem found = search(value);

        if (found == null) { //nie znaleziono wartości do usuniecia
            return false;    //to program zwraca false i metoda kończy się w tym miejscu
        }
        if (found == frist) {           //jeżeli szukany element jest pierwszym na liście
            pollFrist();                // to wykorzystaj metodę pollFirst do usunięcia go
        } else if (found == last) {     // jeżeli szukany element jest ostatnim na liście
            pollLast();                 // to wykorzystaj metodę pollLast do usunięcia go
        } else {
            found.getPrev().setNext(found.getNext()); // found pobiera referencję do poprzedniego elementu (getPrev) i ustawia poprzedniemu elementowi nową referencję next (setNext)
            // którym nie jest już element found ale element kolejnypo found, dlatego found.getNext()
            found.getNext().setPrev(found.getPrev());
            // następnie found pobiera referencję do kolejnego elementu (getNext) i ustawia mu nową referencję prev (setPrev), która od teraz
            // nie będzie wskazywała już na element found ale na element przed nim, dlatego found.getPrev()
            // ostatecznie element poprzedni i następny w stosunku do found nie wskazują już swoimi referencjami next i prev na found i element wskazywany przez found
            // zostanie usunięty przez garbage collector
        }
        return true;
    }


    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.addFrist(4);
        lista.addLast(1);
        lista.addLast(5);
        // lista.addLast(99);

        System.out.println(lista.remove(1));


        lista.show();
        lista.showReverse();

        System.out.println("pollLast: " + lista.pollLast());
        System.out.println("peekLast: " + lista.peekLast());
        System.out.println("pollLast: " + lista.pollLast());
        System.out.println("pollFrist: " + lista.pollFrist());


    }
}
