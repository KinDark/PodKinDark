package zadania_dom;

import struktury_danych.stos_lista.StosPustyException;

public class ZadanieA {


    private ZadanieB qw;


    public void zapis(int value) {
      // this.qw = new ZadanieB(value, this.qw);
        // inaczej
       // System.out.println(this.qw);
         ZadanieB elem = new ZadanieB(value, this.qw );
         this.qw = elem;
      //  System.out.println(this.qw = elem);
    }

    public int pop() {  //usunięcie	ze	szczytu	stosu elentu
        if (qw == null) {  // jeżeli stos pusty to wyrzuc wyjątek
            throw new StosPustyException(); //throw wyzuc wyjatek
        }
        int value = qw.getValue();
        this.qw = qw.getPrev();
        return value;

    }


    public static void main(String[] args) {
        ZadanieA st = new ZadanieA();
        st.zapis(1);
        st.zapis(4);
        st.zapis(8);
        st.zapis(12);


        st.pop();
        st.pop();
        st.pop();



    }
}
