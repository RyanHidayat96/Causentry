package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CameraFilters implements Runnable {
    public final TaskCompletionSource TuitionPaymentFragmentbindingInflater1;

    protected abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e2) {
            TaskCompletionSource taskCompletionSource = this.TuitionPaymentFragmentbindingInflater1;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e2);
            }
        }
    }

    CameraFilters() {
        this.TuitionPaymentFragmentbindingInflater1 = null;
    }

    public CameraFilters(TaskCompletionSource taskCompletionSource) {
        this.TuitionPaymentFragmentbindingInflater1 = taskCompletionSource;
    }
}
