package com.mbank.util;

import java.util.concurrent.atomic.AtomicLong;

public class SequenceNumber {
    private static AtomicLong numberGenerator = new AtomicLong(910000000000L);

    public static long getNext() {
        return numberGenerator.getAndIncrement();
    }

}


