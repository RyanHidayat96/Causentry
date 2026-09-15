package androidx.camera.core.impl.utils.executor;

import androidx.core.util.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes5.dex */
final class SequentialExecutor implements Executor {
    private static final String TAG = "SequentialExecutor";
    private final Executor mExecutor;
    final Deque<Runnable> mQueue = new ArrayDeque();
    private final QueueWorker mWorker = new QueueWorker();
    WorkerRunningState mWorkerRunningState = WorkerRunningState.IDLE;
    long mWorkerRunCount = 0;

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    SequentialExecutor(Executor executor) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.mQueue) {
            if (this.mWorkerRunningState != WorkerRunningState.RUNNING && this.mWorkerRunningState != WorkerRunningState.QUEUED) {
                long j = this.mWorkerRunCount;
                Runnable runnable2 = new Runnable() { // from class: androidx.camera.core.impl.utils.executor.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }
                };
                this.mQueue.add(runnable2);
                this.mWorkerRunningState = WorkerRunningState.QUEUING;
                try {
                    this.mExecutor.execute(this.mWorker);
                    if (this.mWorkerRunningState != WorkerRunningState.QUEUING) {
                        return;
                    }
                    synchronized (this.mQueue) {
                        if (this.mWorkerRunCount == j && this.mWorkerRunningState == WorkerRunningState.QUEUING) {
                            this.mWorkerRunningState = WorkerRunningState.QUEUED;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.mQueue) {
                        boolean z = (this.mWorkerRunningState == WorkerRunningState.IDLE || this.mWorkerRunningState == WorkerRunningState.QUEUING) && this.mQueue.removeLastOccurrence(runnable2);
                        if (!(e2 instanceof RejectedExecutionException) || z) {
                            throw e2;
                        }
                    }
                    return;
                }
            }
            this.mQueue.add(runnable);
        }
    }

    final class QueueWorker implements Runnable {
        QueueWorker() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                workOnQueue();
            } catch (Error e2) {
                synchronized (SequentialExecutor.this.mQueue) {
                    SequentialExecutor.this.mWorkerRunningState = WorkerRunningState.IDLE;
                    throw e2;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:33:0x006b  */
        /* JADX WARN: Code duplicated, block: B:42:0x0031 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
            if (r0 != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        
            r0 = r0 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        
            r4 = new java.lang.StringBuilder();
            r4.append("Exception while executing runnable ");
            r4.append(r3);
            androidx.camera.core.Logger.e(androidx.camera.core.impl.utils.executor.SequentialExecutor.TAG, r4.toString(), r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void workOnQueue() {
            /*
                r7 = this;
                r0 = 0
                r1 = r0
            L2:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L68
                java.util.Deque<java.lang.Runnable> r2 = r2.mQueue     // Catch: java.lang.Throwable -> L68
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L68
                if (r1 != 0) goto L25
                androidx.camera.core.impl.utils.executor.SequentialExecutor r1 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = r1.mWorkerRunningState     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L65
                if (r1 != r3) goto L15
                monitor-exit(r2)
                if (r0 == 0) goto L3a
                goto L3b
            L15:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r1 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L65
                long r3 = r1.mWorkerRunCount     // Catch: java.lang.Throwable -> L65
                r5 = 1
                long r3 = r3 + r5
                r1.mWorkerRunCount = r3     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor r1 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L65
                r1.mWorkerRunningState = r3     // Catch: java.lang.Throwable -> L65
                r1 = 1
            L25:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L65
                java.util.Deque<java.lang.Runnable> r3 = r3.mQueue     // Catch: java.lang.Throwable -> L65
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L65
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L65
                if (r3 != 0) goto L43
                androidx.camera.core.impl.utils.executor.SequentialExecutor r1 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L65
                r1.mWorkerRunningState = r3     // Catch: java.lang.Throwable -> L65
                monitor-exit(r2)
                if (r0 != 0) goto L3b
            L3a:
                return
            L3b:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                return
            L43:
                monitor-exit(r2)
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L68
                r0 = r0 | r2
                r3.run()     // Catch: java.lang.RuntimeException -> L4d java.lang.Throwable -> L68
                goto L2
            L4d:
                r2 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
                r4.<init>()     // Catch: java.lang.Throwable -> L68
                java.lang.String r5 = "SequentialExecutor"
                java.lang.String r6 = "Exception while executing runnable "
                r4.append(r6)     // Catch: java.lang.Throwable -> L68
                r4.append(r3)     // Catch: java.lang.Throwable -> L68
                java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L68
                androidx.camera.core.Logger.e(r5, r3, r2)     // Catch: java.lang.Throwable -> L68
                goto L2
            L65:
                r1 = move-exception
                monitor-exit(r2)
                throw r1     // Catch: java.lang.Throwable -> L68
            L68:
                r1 = move-exception
                if (r0 == 0) goto L72
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L72:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker.workOnQueue():void");
        }
    }
}
