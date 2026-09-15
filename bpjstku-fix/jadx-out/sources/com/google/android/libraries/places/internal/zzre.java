package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzre {
    public final String toString() {
        return TextUtils.join(" -> ", zza());
    }

    public abstract ImmutableList zza();

    public abstract ImmutableList zzb();

    public abstract UUID zzc();

    public abstract long zzd();

    zzre() {
    }
}
