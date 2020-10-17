package struktury_danych.kolejka_lista;

public class StosTablica {

    private int[] tab;
    private int top;

    public StosTablica(int size) {
        tab = new int[size];
        top = -1;

    }

    public void push(int value) {
        // powinno obsłużyć wyjątek jeżeli stos pełen
      //  top++;
      //  tab[top] = value;  //inaczej
        tab[++top] = value;
    }

    public int pop(){       // odczyt tab i przesuwa top 0 -1
        // powinno obsłużyć wyjątek jeżeli stos pusty
        int value = tab[top--];
//        int value = tab[top]; // innaczej
//        top--;
        return value;
    }

    public int getTop() {
        return top;
    }

    int peek() {   //podglad
        return tab[top];
    }

    public int size() { //wielkosc topa
        return top + 1;
    }
    public boolean isEmpty(){  //sprawdzam stos czy jest pusty
        return top==-1;
//        if( top==-1){
//            return true;
//        }else{
//            return false;
//        }
    }

    public static void main(String[] args) {

        StosTablica stosTablica = new StosTablica(5);
        stosTablica.push(5);
        stosTablica.push(2);
        stosTablica.push(1);

        System.out.println("pop: " + stosTablica.pop());
        System.out.println("pop: " + stosTablica.pop());
        System.out.println("Peek: " + stosTablica.peek());

        System.out.println("Pop: " + stosTablica.pop());

        System.out.println("isEmpty: " + stosTablica.isEmpty());



    }
}
