package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class SequentialExecutor implements Executor {
    private static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    private final Executor executor;
    private final Deque<Runnable> queue = new ArrayDeque();
    private WorkerRunningState workerRunningState = WorkerRunningState.IDLE;
    private long workerRunCount = 0;
    private final QueueWorker worker = new QueueWorker();

    /* JADX INFO: loaded from: classes6.dex */
    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j;
        return j;
    }

    SequentialExecutor(Executor executor) {
        this.executor = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.queue) {
            if (this.workerRunningState != WorkerRunningState.RUNNING && this.workerRunningState != WorkerRunningState.QUEUED) {
                long j = this.workerRunCount;
                Runnable runnable2 = new Runnable() { // from class: com.google.firebase.concurrent.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public String toString() {
                        return runnable.toString();
                    }
                };
                this.queue.add(runnable2);
                this.workerRunningState = WorkerRunningState.QUEUING;
                try {
                    this.executor.execute(this.worker);
                    if (this.workerRunningState != WorkerRunningState.QUEUING) {
                        return;
                    }
                    synchronized (this.queue) {
                        if (this.workerRunCount == j && this.workerRunningState == WorkerRunningState.QUEUING) {
                            this.workerRunningState = WorkerRunningState.QUEUED;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.queue) {
                        boolean z = (this.workerRunningState == WorkerRunningState.IDLE || this.workerRunningState == WorkerRunningState.QUEUING) && this.queue.removeLastOccurrence(runnable2);
                        if (!(e2 instanceof RejectedExecutionException) || z) {
                            throw e2;
                        }
                    }
                    return;
                }
            }
            this.queue.add(runnable);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    final class QueueWorker implements Runnable {
        Runnable task;

        private QueueWorker() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                workOnQueue();
            } catch (Error e2) {
                synchronized (SequentialExecutor.this.queue) {
                    SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                    throw e2;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0081  */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r0 != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        
            r0 = r0 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        
            r8.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        
            r4 = com.google.firebase.concurrent.SequentialExecutor.log;
            r5 = java.util.logging.Level.SEVERE;
            r6 = new java.lang.StringBuilder();
            r6.append("Exception while executing runnable ");
            r6.append(r8.task);
            r4.log(r5, r6.toString(), (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        
            r8.task = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void workOnQueue() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.firebase.concurrent.SequentialExecutor r2 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7e
                java.util.Deque r2 = com.google.firebase.concurrent.SequentialExecutor.access$100(r2)     // Catch: java.lang.Throwable -> L7e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L7e
                if (r1 != 0) goto L26
                com.google.firebase.concurrent.SequentialExecutor r1 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7b
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.firebase.concurrent.SequentialExecutor.access$200(r1)     // Catch: java.lang.Throwable -> L7b
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L7b
                if (r1 != r3) goto L19
                monitor-exit(r2)
                if (r0 == 0) goto L40
                goto L41
            L19:
                com.google.firebase.concurrent.SequentialExecutor r1 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7b
                com.google.firebase.concurrent.SequentialExecutor.access$308(r1)     // Catch: java.lang.Throwable -> L7b
                com.google.firebase.concurrent.SequentialExecutor r1 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7b
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L7b
                com.google.firebase.concurrent.SequentialExecutor.access$202(r1, r3)     // Catch: java.lang.Throwable -> L7b
                r1 = 1
            L26:
                com.google.firebase.concurrent.SequentialExecutor r3 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7b
                java.util.Deque r3 = com.google.firebase.concurrent.SequentialExecutor.access$100(r3)     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7b
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7b
                r8.task = r3     // Catch: java.lang.Throwable -> L7b
                if (r3 != 0) goto L49
                com.google.firebase.concurrent.SequentialExecutor r1 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7b
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L7b
                com.google.firebase.concurrent.SequentialExecutor.access$202(r1, r3)     // Catch: java.lang.Throwable -> L7b
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
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L7e
                r0 = r0 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.task     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L58
                r3.run()     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L58
                goto L75
            L56:
                r1 = move-exception
                goto L78
            L58:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.SequentialExecutor.access$400()     // Catch: java.lang.Throwable -> L56
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L56
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
                r6.<init>()     // Catch: java.lang.Throwable -> L56
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L56
                java.lang.Runnable r7 = r8.task     // Catch: java.lang.Throwable -> L56
                r6.append(r7)     // Catch: java.lang.Throwable -> L56
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L56
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L56
            L75:
                r8.task = r2     // Catch: java.lang.Throwable -> L7e
                goto L2
            L78:
                r8.task = r2     // Catch: java.lang.Throwable -> L7e
                throw r1     // Catch: java.lang.Throwable -> L7e
            L7b:
                r1 = move-exception
                monitor-exit(r2)
                throw r1     // Catch: java.lang.Throwable -> L7e
            L7e:
                r1 = move-exception
                if (r0 == 0) goto L88
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L88:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.QueueWorker.workOnQueue():void");
        }

        public final String toString() {
            Runnable runnable = this.task;
            if (runnable != null) {
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{running=");
                sb.append(runnable);
                sb.append("}");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
            sb2.append(SequentialExecutor.this.workerRunningState);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SequentialExecutor@");
        sb.append(System.identityHashCode(this));
        sb.append("{");
        sb.append(this.executor);
        sb.append("}");
        return sb.toString();
    }
}
