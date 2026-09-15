package com.google.android.libraries.places.internal;

import android.net.Uri;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzhx implements SuccessContinuation {
    static final /* synthetic */ zzhx zza = new zzhx();

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final /* synthetic */ Task then(Object obj) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(FetchResolvedPhotoUriResponse.newInstance(Uri.parse(((zzavc) obj).zza())));
        return taskCompletionSource.getTask();
    }

    private /* synthetic */ zzhx() {
    }
}
