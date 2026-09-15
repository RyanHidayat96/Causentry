package com.google.android.gms.internal.mlkit_common;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzas extends zzak implements Set {
    private transient zzao zza;

    zzas() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzba.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzbb iterator();

    public final zzao zzf() {
        zzao zzaoVar = this.zza;
        if (zzaoVar != null) {
            return zzaoVar;
        }
        zzao zzaoVarZzg = zzg();
        this.zza = zzaoVarZzg;
        return zzaoVarZzg;
    }

    zzao zzg() {
        return zzao.zzh(toArray());
    }
}
