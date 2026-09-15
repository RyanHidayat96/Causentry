package com.google.common.base.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public class Finalizer implements Runnable {
    private static final Logger b = Logger.getLogger(Finalizer.class.getName());
    private final ReferenceQueue<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3() == null) {
            TuitionPaymentFragmentbindingInflater1();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                throw new NullPointerException();
            } catch (InterruptedException unused) {
            }
        }
    }

    private static Field TuitionPaymentFragmentbindingInflater1() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            b.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    private static Constructor<Thread> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }
}
