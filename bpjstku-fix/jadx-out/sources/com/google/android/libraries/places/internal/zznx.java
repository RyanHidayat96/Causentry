package com.google.android.libraries.places.internal;

import androidx.p002lifecycle.ViewModel;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
public final class zznx implements ViewModelProvider.Factory {
    private final zznn zza;
    private final zzoa zzb;
    private final zzoz zzc;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls) {
        if (cls == zzny.class) {
            return new zzny(this.zza, this.zzb, this.zzc, null);
        }
        throw new IllegalArgumentException("This factory can only be used to instantiate its enclosing class.");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls, CreationExtras creationExtras) {
        return create(cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(KClass kClass, CreationExtras creationExtras) {
        return create(JvmClassMappingKt.getJavaClass(kClass));
    }

    public zznx(zznn zznnVar, zzoa zzoaVar, zzoz zzozVar) {
        this.zza = zznnVar;
        this.zzb = zzoaVar;
        this.zzc = zzozVar;
    }
}
