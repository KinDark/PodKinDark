package struktury_danych.stos_lista;

import javax.crypto.spec.PSource;

public class StosLista {

    private StosElem top;

    public StosLista() {
        top = null;

    }

    public void push(int value) {  //dodanie na	szczyt stosu nowego

        this.top = new StosElem(value, this.top);
                    // inaczej
        // StosElem elem = new StosElem(value, this.top );
        //    this.top = elem;
    }

    public int pop() {  //usunięcie	ze	szczytu	stosu elentu
        if (top == null) {  // jeżeli stos pusty to wyrzuc wyjątek
            throw new StosPustyException(); //throw wyzuc wyjatek
        }
        int value = top.getValue();
        this.top = top.getPrev();
        return value;

    }

    public int peek() {  //zwraca element ze szczytu
        if (top == null) {  // jeżeli stos pusty to wyrzuc wyjątek
            throw new StosPustyException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {  //zwraca true, jeżeli stos nie zawiera	żadnego	elementu
        return top == null;
    }

    public void show() {
        StosElem tmp = top;
        while (tmp != null) {
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.getPrev();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        StosLista stos = new StosLista();
        stos.push(9);
        stos.push(100);
        stos.push(3);

        stos.show();
        System.out.println("Pop:" + stos.pop());
        System.out.println("Peek:" + stos.peek());
        System.out.println("Pop: " + stos.pop());
        System.out.println("Peek:" + stos.peek());
        System.out.println("Pop: " + stos.pop());

        System.out.println("isEmpty: " + stos.isEmpty());

        try {
            stos.pop();
        }catch(StosPustyException wyjatek){
            System.out.println(wyjatek.getMessage());
            wyjatek.printStackTrace(); // wyswietlenie longu wyjatku
        }finally{  //zawsze sie wykona czy jest wyjetek czy nie
            System.out.println("Zamykamy sprawe. Zawsze się wykonam!");
        }
        System.out.println("Cokolwiek !!!!");

    }


}
