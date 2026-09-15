package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
class RequestDeduplicator {
    private final Executor executor;
    private final Map<String, Task<String>> getTokenRequests = new ArrayMap();

    interface GetTokenRequest {
        Task<String> start();
    }

    RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    Task<String> getOrStartGetTokenRequest(final String str, GetTokenRequest getTokenRequest) {
        synchronized (this) {
            Task<String> task = this.getTokenRequests.get(str);
            if (task != null) {
                Log.isLoggable(Constants.TAG, 3);
                return task;
            }
            Log.isLoggable(Constants.TAG, 3);
            Task taskContinueWithTask = getTokenRequest.start().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.messaging.RequestDeduplicator$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return this.f$0.m7982x7161fc54(str, task2);
                }
            });
            this.getTokenRequests.put(str, (Task<String>) taskContinueWithTask);
            return taskContinueWithTask;
        }
    }

    /* JADX INFO: renamed from: lambda$getOrStartGetTokenRequest$0$com-google-firebase-messaging-RequestDeduplicator, reason: not valid java name */
    /* synthetic */ Task m7982x7161fc54(String str, Task task) throws Exception {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }
}
