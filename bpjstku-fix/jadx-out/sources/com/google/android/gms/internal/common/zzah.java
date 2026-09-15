package com.google.android.gms.internal.common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class zzah extends zzae {
    zzah(int i) {
        super(4);
    }

    public final zzah zzb(Object obj) {
        super.zza(obj);
        return this;
    }

    public final zzah zzc(Iterator it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    public zzah() {
        throw null;
    }
}
