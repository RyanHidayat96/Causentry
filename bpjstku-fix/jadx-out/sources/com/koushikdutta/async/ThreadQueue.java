package com.koushikdutta.async;

import defpackage.VideoUtil;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
public class ThreadQueue extends LinkedList<Runnable> {
    private static final WeakHashMap<Thread, ThreadQueue> TuitionPaymentFragmentbindingInflater1 = new WeakHashMap<>();
    public Semaphore queueSemaphore = new Semaphore(0);
    public VideoUtil waiter;

    ThreadQueue() {
    }

    public static ThreadQueue TuitionPaymentFragmentspecialinlinedviewModeldefault2(Thread thread) {
        ThreadQueue threadQueue;
        WeakHashMap<Thread, ThreadQueue> weakHashMap = TuitionPaymentFragmentbindingInflater1;
        synchronized (weakHashMap) {
            threadQueue = weakHashMap.get(thread);
            if (threadQueue == null) {
                threadQueue = new ThreadQueue();
                weakHashMap.put(thread, threadQueue);
            }
        }
        return threadQueue;
    }

    public static void TuitionPaymentFragmentbindingInflater1(VideoUtil videoUtil) {
        WeakHashMap<Thread, ThreadQueue> weakHashMap = TuitionPaymentFragmentbindingInflater1;
        synchronized (weakHashMap) {
            for (ThreadQueue threadQueue : weakHashMap.values()) {
                if (threadQueue.waiter == videoUtil) {
                    threadQueue.queueSemaphore.release();
                }
            }
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final boolean add(Runnable runnable) {
        boolean zAdd;
        synchronized (this) {
            zAdd = super.add(runnable);
        }
        return zAdd;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this) {
            zRemove = super.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final Runnable remove() {
        synchronized (this) {
            if (isEmpty()) {
                return null;
            }
            return (Runnable) super.remove();
        }
    }
}
