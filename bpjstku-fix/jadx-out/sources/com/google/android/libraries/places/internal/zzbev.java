package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbev implements zzbep {
    private final List zza;
    private final List zzb;

    static {
        zzbeq.zza(Collections.emptySet());
    }

    public static zzbeu zza(int i, int i2) {
        return new zzbeu(1, 0, null);
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzbes) list2.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            hashSet.add(((zzbes) list.get(i2)).zzb());
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            Iterator it = ((Collection) arrayList.get(i3)).iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* synthetic */ zzbev(List list, List list2, zzbet zzbetVar) {
        this.zza = list;
        this.zzb = list2;
    }
}
