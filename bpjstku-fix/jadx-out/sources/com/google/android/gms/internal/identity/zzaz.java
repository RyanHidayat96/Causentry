package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes6.dex */
final class zzaz implements zzdr {
    private ListenerHolder zza;

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzb(ListenerHolder listenerHolder) {
        synchronized (this) {
            ListenerHolder listenerHolder2 = this.zza;
            if (listenerHolder2 != listenerHolder) {
                listenerHolder2.clear();
                this.zza = listenerHolder;
            }
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
    }

    zzaz(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final ListenerHolder zza() {
        ListenerHolder listenerHolder;
        synchronized (this) {
            listenerHolder = this.zza;
        }
        return listenerHolder;
    }
}
