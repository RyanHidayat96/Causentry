package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.zzs;

/* JADX INFO: loaded from: classes6.dex */
final class zzdq extends zzs {
    private ListenerHolder zza;

    zzdq(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    final void zzc(ListenerHolder listenerHolder) {
        synchronized (this) {
            ListenerHolder listenerHolder2 = this.zza;
            if (listenerHolder2 != listenerHolder) {
                listenerHolder2.clear();
                this.zza = listenerHolder;
            }
        }
    }

    @Override // com.google.android.gms.location.zzt
    public final void zzd(DeviceOrientation deviceOrientation) {
        ListenerHolder listenerHolder;
        synchronized (this) {
            listenerHolder = this.zza;
        }
        listenerHolder.notifyListener(new zzdp(this, deviceOrientation));
    }

    final void zze() {
        synchronized (this) {
            this.zza.clear();
        }
    }
}
