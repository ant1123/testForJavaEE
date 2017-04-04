package tests;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IncrementSynchronize {
    private int value = 0;

    public int getNextValue1() {
        synchronized(this) {
            return ++value;
        }
    }

    public synchronized int getNextValue2() {
        return ++value;
    }

    public int getNextValue3() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            value++;
        }
        finally {
            lock.unlock();
        }
        return value;
    }
}
