package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzgw implements Continuation {
    static final /* synthetic */ zzgw zza = new zzgw();

    private /* synthetic */ zzgw() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return zzhb.zzL(task);
    }
}
