package zadania_dom;

public class ZadanieB {

    private int value;
    private ZadanieB prev;

public ZadanieB(int value, ZadanieB prev){
    this.value = value;
    this.prev = prev;
}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ZadanieB getPrev() {
        return prev;
    }

    public void setPrev(ZadanieB prev) {
        this.prev = prev;
    }
}
