package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbva {
    final boolean zza;
    final List zzb;
    final Collection zzc;
    final Collection zzd;
    final int zze;
    final zzbvj zzf;
    final boolean zzg;
    final boolean zzh;

    zzbva(List list, Collection collection, Collection collection2, zzbvj zzbvjVar, boolean z, boolean z2, boolean z3, int i) {
        this.zzb = list;
        if (collection == null) {
            throw new NullPointerException("drainedSubstreams");
        }
        this.zzc = collection;
        this.zzf = zzbvjVar;
        this.zzd = collection2;
        this.zzg = z;
        this.zza = z2;
        this.zzh = z3;
        this.zze = i;
        if (!(!z2 || list == null)) {
            throw new IllegalStateException("passThrough should imply buffer is null");
        }
        if (!((z2 && zzbvjVar == null) ? false : true)) {
            throw new IllegalStateException("passThrough should imply winningSubstream != null");
        }
        if (!(!z2 || (collection.size() == 1 && collection.contains(zzbvjVar)) || (collection.size() == 0 && zzbvjVar.zzb))) {
            throw new IllegalStateException("passThrough should imply winningSubstream is drained");
        }
        if (!((z && zzbvjVar == null) ? false : true)) {
            throw new IllegalStateException("cancelled should imply committed");
        }
    }

    final zzbva zza(zzbvj zzbvjVar) {
        Collection collectionUnmodifiableCollection;
        List list;
        if (!(!this.zza)) {
            throw new IllegalStateException("Already passThrough");
        }
        if (zzbvjVar.zzb) {
            collectionUnmodifiableCollection = this.zzc;
        } else {
            Collection collection = this.zzc;
            if (collection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(zzbvjVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(zzbvjVar);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collectionUnmodifiableCollection;
        zzbvj zzbvjVar2 = this.zzf;
        boolean z = zzbvjVar2 != null;
        List list2 = this.zzb;
        if (z) {
            if (!(zzbvjVar2 == zzbvjVar)) {
                throw new IllegalStateException("Another RPC attempt has already committed");
            }
            list = null;
        } else {
            list = list2;
        }
        return new zzbva(list, collection2, this.zzd, zzbvjVar2, this.zzg, z, this.zzh, this.zze);
    }

    final zzbva zzb() {
        return this.zzh ? this : new zzbva(this.zzb, this.zzc, this.zzd, this.zzf, this.zzg, this.zza, true, this.zze);
    }

    final zzbva zzc(zzbvj zzbvjVar) {
        Collection collectionUnmodifiableCollection;
        boolean z = this.zzh;
        if (!(!z)) {
            throw new IllegalStateException("hedging frozen");
        }
        zzbvj zzbvjVar2 = this.zzf;
        if (!(zzbvjVar2 == null)) {
            throw new IllegalStateException("already committed");
        }
        Collection collection = this.zzd;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(zzbvjVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(zzbvjVar);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new zzbva(this.zzb, this.zzc, collectionUnmodifiableCollection, zzbvjVar2, this.zzg, this.zza, z, this.zze + 1);
    }
}
