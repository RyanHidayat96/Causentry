package com.google.android.libraries.places.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlr {
    private final Map zza = new HashMap();

    public zzlr(zzln zzlnVar) {
    }

    public final Task zza(Task task, CancellationToken cancellationToken, long j, String str) {
        final TaskCompletionSource taskCompletionSource = cancellationToken == null ? new TaskCompletionSource() : new TaskCompletionSource(cancellationToken);
        Map map = this.zza;
        if (!map.containsKey(taskCompletionSource)) {
            HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
            handlerThread.start();
            map.put(taskCompletionSource, handlerThread);
            final String str2 = "Location timeout.";
            new Handler(handlerThread.getLooper()).postDelayed(new Runnable(str2) { // from class: com.google.android.libraries.places.internal.zzlq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.trySetException(new ApiException(new Status(15, "Location timeout.")));
                }
            }, j);
        }
        task.continueWithTask(new Continuation(this) { // from class: com.google.android.libraries.places.internal.zzlo
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task2) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                Exception exception = task2.getException();
                if (task2.isSuccessful()) {
                    taskCompletionSource2.setResult(task2.getResult());
                } else if (!task2.isCanceled() && exception != null) {
                    taskCompletionSource2.setException(exception);
                }
                return taskCompletionSource2.getTask();
            }
        });
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzlp
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                this.zza.zzb(taskCompletionSource, task2);
            }
        });
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ void zzb(TaskCompletionSource taskCompletionSource, Task task) {
        HandlerThread handlerThread = (HandlerThread) this.zza.remove(taskCompletionSource);
        if (handlerThread == null) {
            return;
        }
        handlerThread.quit();
    }
}
