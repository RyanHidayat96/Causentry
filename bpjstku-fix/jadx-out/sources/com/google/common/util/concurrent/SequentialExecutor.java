package com.google.common.util.concurrent;

import defpackage.getPrescribedStreamFormat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class SequentialExecutor implements Executor {
    private static final getPrescribedStreamFormat TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getPrescribedStreamFormat(SequentialExecutor.class);
    private final Executor b;
    private final Deque<Runnable> TuitionPaymentFragmentbindingInflater1 = new ArrayDeque();
    private WorkerRunningState g = WorkerRunningState.IDLE;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private final b TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new b(this, 0);

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    static /* synthetic */ long TuitionPaymentFragmentbindingInflater1(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        sequentialExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1 + j;
        return j;
    }

    public SequentialExecutor(Executor executor) {
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.TuitionPaymentFragmentbindingInflater1) {
            if (this.g != WorkerRunningState.RUNNING && this.g != WorkerRunningState.QUEUED) {
                long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Runnable runnable2 = new Runnable(this) { // from class: com.google.common.util.concurrent.SequentialExecutor.4
                    private /* synthetic */ SequentialExecutor TuitionPaymentFragmentbindingInflater1;

                    {
                        this.TuitionPaymentFragmentbindingInflater1 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        runnable.run();
                    }

                    public final String toString() {
                        return runnable.toString();
                    }
                };
                this.TuitionPaymentFragmentbindingInflater1.add(runnable2);
                this.g = WorkerRunningState.QUEUING;
                try {
                    this.b.execute(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (this.g != WorkerRunningState.QUEUING) {
                        return;
                    }
                    synchronized (this.TuitionPaymentFragmentbindingInflater1) {
                        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == j && this.g == WorkerRunningState.QUEUING) {
                            this.g = WorkerRunningState.QUEUED;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (this.TuitionPaymentFragmentbindingInflater1) {
                        boolean z = (this.g == WorkerRunningState.IDLE || this.g == WorkerRunningState.QUEUING) && this.TuitionPaymentFragmentbindingInflater1.removeLastOccurrence(runnable2);
                        if (!(th instanceof RejectedExecutionException) || z) {
                            throw th;
                        }
                        return;
                    }
                }
            }
            this.TuitionPaymentFragmentbindingInflater1.add(runnable);
        }
    }

    final class b implements Runnable {
        private Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        private b() {
        }

        /* synthetic */ b(SequentialExecutor sequentialExecutor, byte b) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            } catch (Error e2) {
                synchronized (SequentialExecutor.this.TuitionPaymentFragmentbindingInflater1) {
                    SequentialExecutor.this.g = WorkerRunningState.IDLE;
                    throw e2;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0085  */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r0 != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        
            r0 = r0 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        
            r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        
            r4 = com.google.common.util.concurrent.SequentialExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            r5 = java.util.logging.Level.SEVERE;
            r6 = new java.lang.StringBuilder();
            r6.append("Exception while executing runnable ");
            r6.append(r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            r4.log(r5, r6.toString(), (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        
            r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.common.util.concurrent.SequentialExecutor r2 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = com.google.common.util.concurrent.SequentialExecutor.b(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r1 != 0) goto L26
                com.google.common.util.concurrent.SequentialExecutor r1 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7f
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.common.util.concurrent.SequentialExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1)     // Catch: java.lang.Throwable -> L7f
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r1 != r3) goto L19
                monitor-exit(r2)
                if (r0 == 0) goto L40
                goto L41
            L19:
                com.google.common.util.concurrent.SequentialExecutor r1 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7f
                com.google.common.util.concurrent.SequentialExecutor.TuitionPaymentFragmentbindingInflater1(r1)     // Catch: java.lang.Throwable -> L7f
                com.google.common.util.concurrent.SequentialExecutor r1 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7f
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L7f
                com.google.common.util.concurrent.SequentialExecutor.b(r1, r3)     // Catch: java.lang.Throwable -> L7f
                r1 = 1
            L26:
                com.google.common.util.concurrent.SequentialExecutor r3 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = com.google.common.util.concurrent.SequentialExecutor.b(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L49
                com.google.common.util.concurrent.SequentialExecutor r1 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7f
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L7f
                com.google.common.util.concurrent.SequentialExecutor.b(r1, r3)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r2)
                if (r0 != 0) goto L41
            L40:
                return
            L41:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                return
            L49:
                monitor-exit(r2)
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L82
                r0 = r0 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
                r3.run()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
                goto L79
            L56:
                r1 = move-exception
                goto L7c
            L58:
                r3 = move-exception
                getPrescribedStreamFormat r4 = com.google.common.util.concurrent.SequentialExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault2()     // Catch: java.lang.Throwable -> L56
                java.util.logging.Logger r4 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2()     // Catch: java.lang.Throwable -> L56
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L56
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
                r6.<init>()     // Catch: java.lang.Throwable -> L56
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L56
                java.lang.Runnable r7 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3     // Catch: java.lang.Throwable -> L56
                r6.append(r7)     // Catch: java.lang.Throwable -> L56
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L56
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L56
            L79:
                r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L7c:
                r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2     // Catch: java.lang.Throwable -> L82
                throw r1     // Catch: java.lang.Throwable -> L82
            L7f:
                r1 = move-exception
                monitor-exit(r2)
                throw r1     // Catch: java.lang.Throwable -> L82
            L82:
                r1 = move-exception
                if (r0 == 0) goto L8c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L8c:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2():void");
        }

        public final String toString() {
            Runnable runnable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (runnable != null) {
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{running=");
                sb.append(runnable);
                sb.append("}");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
            sb2.append(SequentialExecutor.this.g);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SequentialExecutor@");
        sb.append(System.identityHashCode(this));
        sb.append("{");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
