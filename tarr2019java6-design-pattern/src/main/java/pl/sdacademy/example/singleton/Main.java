package pl.sdacademy.example.singleton;

import pl.sdacademy.example.singleton.billpugh.BillPughSingleton;
import pl.sdacademy.example.singleton.earger.EagerInitializedSingleton;
import pl.sdacademy.example.singleton.enumimpl.SingletonEnum;
import pl.sdacademy.example.singleton.lazy.LazyInitSingleton;
import pl.sdacademy.example.singleton.staticblock.StaticBlockInitSingleton;
import pl.sdacademy.example.singleton.threadsafe.ThreadSafeDoubleCheckSingleton;
import pl.sdacademy.example.singleton.threadsafe.ThreadSafeSingleton;

public class Main {

    public static void main(String[] args) {
        /**
         * SINGLETON
         *
         * Umożliwia utworzenie tylko jednej instancji, która ma globalny dostęp.
         * Nie można utworzyć obiektu bezpośrednio poprzez new Singleton.
         * Robimy to poprzez wywołanie globalnej instancji obiektu Singleton.getInstance().
         * W większości przypadków powinno się unikać stosowania Singletona.
         *
         * Projektuj swoje aplikacje ze świadomością, iż wzorce istnieją,
         * ale nie próbuj upychać ich gdzie popadnie.
         *
         */

        // implemntacja eager
        EagerInitializedSingleton singletonEager = EagerInitializedSingleton.getInstance();

        // lazy
        LazyInitSingleton singletonLazy = LazyInitSingleton.getInstance();

        // static block
        StaticBlockInitSingleton singletonStatic = StaticBlockInitSingleton.getInstance();

        // thread safe
        ThreadSafeSingleton singletonThread = ThreadSafeSingleton.getInstance();

        ThreadSafeDoubleCheckSingleton singletonThreadDoubleCheck = ThreadSafeDoubleCheckSingleton.getInstance();

        // enum
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum.getValue()); // output: 0
        singletonEnum.setValue(2);
        System.out.println(singletonEnum.getValue()); // output: 2


        // bill pugh
        BillPughSingleton singletonBill = BillPughSingleton.getInstance();

    }
}
