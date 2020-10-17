package struktury_danych.kolejka_lista;

public class KolejkaLista {

    private KolejkaElem frist;  //pierwszy
    private KolejkaElem last;   //ostatni

    public KolejkaLista() {
        frist = last = null;
    }

    public boolean isEmpty() { // sprawdza czy pusty
        return frist == null && last == null;
    }

    public void add(int value) { //dodaje elenent do kolejki jak ostatni
        KolejkaElem elem = new KolejkaElem(value);

        if (isEmpty()) {
            frist = last = elem;
        } else {
            last.setNext(elem);
            last = elem;


        }
    }

    public int peek() { //podglad pierwszego w kojejce
        if (isEmpty()) {
            //powinien być wyjatek w razie bledu
        }
        return frist.getValue();
    }

    public int poll(){ //kasuje pierwszego z kolejki i przypisuje dane do int value
        if(isEmpty()){
            //powinien być wyjatek bo kolejka pusta
        }
        int value = frist.getValue();
        frist=frist.getNext();
        if(frist == null){  //jezeli usuwamy ostatni obiekt z kolejki
            last = null;
        }
        return value;
    }

    public static void main(String[] args) {
        KolejkaLista kolejka = new KolejkaLista();
        kolejka.add(5);
        kolejka.add(10);
        kolejka.add(22);
        kolejka.add(33);
        kolejka.add(-100);

//        kolejka.poll();
//        kolejka.poll();
//        kolejka.poll();
//        kolejka.poll();


        System.out.println("Peek: " + kolejka.peek());
        System.out.println("Poll: " + kolejka.poll());
        System.out.println("Poll: " + kolejka.poll());
        System.out.println("Poll: " + kolejka.poll());


    }


}



