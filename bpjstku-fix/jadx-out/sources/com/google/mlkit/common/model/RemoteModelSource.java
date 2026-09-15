package com.google.mlkit.common.model;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzw;
import com.google.android.gms.internal.mlkit_common.zzx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RemoteModelSource {
    private final String zza;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        return Objects.equal(this.zza, ((RemoteModelSource) obj).zza);
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public String toString() {
        zzw zzwVarZzb = zzx.zzb("RemoteModelSource");
        zzwVarZzb.zza("firebaseModelName", this.zza);
        return zzwVarZzb.toString();
    }

    protected RemoteModelSource(String str) {
        this.zza = str;
    }

    public final String zza() {
        return this.zza;
    }
}
