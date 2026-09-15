package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpEngine;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class Dispatcher {
    private ExecutorService executorService;
    private int maxRequests = 64;
    private int maxRequestsPerHost = 5;
    private final Deque<Call.AsyncCall> readyCalls = new ArrayDeque();
    private final Deque<Call.AsyncCall> runningCalls = new ArrayDeque();
    private final Deque<Call> executedCalls = new ArrayDeque();

    public Dispatcher(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public Dispatcher() {
    }

    public final ExecutorService getExecutorService() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.executorService == null) {
                this.executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
            }
            executorService = this.executorService;
        }
        return executorService;
    }

    public final void setMaxRequests(int i) {
        synchronized (this) {
            try {
                if (i <= 0) {
                    StringBuilder sb = new StringBuilder("max < 1: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.maxRequests = i;
                promoteCalls();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int getMaxRequests() {
        int i;
        synchronized (this) {
            i = this.maxRequests;
        }
        return i;
    }

    public final void setMaxRequestsPerHost(int i) {
        synchronized (this) {
            try {
                if (i <= 0) {
                    StringBuilder sb = new StringBuilder("max < 1: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.maxRequestsPerHost = i;
                promoteCalls();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int getMaxRequestsPerHost() {
        int i;
        synchronized (this) {
            i = this.maxRequestsPerHost;
        }
        return i;
    }

    final void enqueue(Call.AsyncCall asyncCall) {
        synchronized (this) {
            if (this.runningCalls.size() < this.maxRequests && runningCallsForHost(asyncCall) < this.maxRequestsPerHost) {
                this.runningCalls.add(asyncCall);
                getExecutorService().execute(asyncCall);
            } else {
                this.readyCalls.add(asyncCall);
            }
        }
    }

    public final void cancel(Object obj) {
        synchronized (this) {
            for (Call.AsyncCall asyncCall : this.readyCalls) {
                if (Util.equal(obj, asyncCall.tag())) {
                    asyncCall.cancel();
                }
            }
            for (Call.AsyncCall asyncCall2 : this.runningCalls) {
                if (Util.equal(obj, asyncCall2.tag())) {
                    asyncCall2.get().canceled = true;
                    HttpEngine httpEngine = asyncCall2.get().engine;
                    if (httpEngine != null) {
                        httpEngine.cancel();
                    }
                }
            }
            for (Call call : this.executedCalls) {
                if (Util.equal(obj, call.tag())) {
                    call.cancel();
                }
            }
        }
    }

    final void finished(Call.AsyncCall asyncCall) {
        synchronized (this) {
            if (!this.runningCalls.remove(asyncCall)) {
                throw new AssertionError("AsyncCall wasn't running!");
            }
            promoteCalls();
        }
    }

    private void promoteCalls() {
        if (this.runningCalls.size() >= this.maxRequests || this.readyCalls.isEmpty()) {
            return;
        }
        Iterator<Call.AsyncCall> it = this.readyCalls.iterator();
        while (it.hasNext()) {
            Call.AsyncCall next = it.next();
            if (runningCallsForHost(next) < this.maxRequestsPerHost) {
                it.remove();
                this.runningCalls.add(next);
                getExecutorService().execute(next);
            }
            if (this.runningCalls.size() >= this.maxRequests) {
                return;
            }
        }
    }

    private int runningCallsForHost(Call.AsyncCall asyncCall) {
        Iterator<Call.AsyncCall> it = this.runningCalls.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().host().equals(asyncCall.host())) {
                i++;
            }
        }
        return i;
    }

    final void executed(Call call) {
        synchronized (this) {
            this.executedCalls.add(call);
        }
    }

    final void finished(Call call) {
        synchronized (this) {
            if (!this.executedCalls.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
    }

    public final int getRunningCallCount() {
        int size;
        synchronized (this) {
            size = this.runningCalls.size();
        }
        return size;
    }

    public final int getQueuedCallCount() {
        int size;
        synchronized (this) {
            size = this.readyCalls.size();
        }
        return size;
    }
}
