package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzayl;
import com.google.android.libraries.places.internal.zzaym;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzayl<MessageType extends zzaym<MessageType, BuilderType>, BuilderType extends zzayl<MessageType, BuilderType>> implements zzbbk {
    private static void zza(List list, int i) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    protected static void zzv(Iterable iterable, List list) {
        if (!(iterable instanceof zzbax)) {
            if (iterable instanceof zzbbu) {
                list.addAll((Collection) iterable);
                return;
            }
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzbbw) {
                ((zzbbw) list).zze(list.size() + size);
            }
            int size2 = list.size();
            if (!(iterable instanceof RandomAccess)) {
                for (Object obj : iterable) {
                    if (obj == null) {
                        zza(list, size2);
                    }
                    list.add(obj);
                }
                return;
            }
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i = 0; i < size3; i++) {
                Object obj2 = list2.get(i);
                if (obj2 == null) {
                    zza(list, size2);
                }
                list.add(obj2);
            }
            return;
        }
        List listZza = ((zzbax) iterable).zza();
        zzbax zzbaxVar = (zzbax) list;
        int size4 = list.size();
        for (Object obj3 : listZza) {
            if (obj3 == null) {
                int size5 = zzbaxVar.size() - size4;
                StringBuilder sb = new StringBuilder(String.valueOf(size5).length() + 26);
                sb.append("Element at index ");
                sb.append(size5);
                sb.append(" is null.");
                String string = sb.toString();
                int size6 = zzbaxVar.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string);
                    }
                    zzbaxVar.remove(size6);
                }
            } else if (obj3 instanceof zzayz) {
                zzbaxVar.zzb();
            } else if (obj3 instanceof byte[]) {
                byte[] bArr = (byte[]) obj3;
                zzayz.zzh(bArr, 0, bArr.length);
                zzbaxVar.zzb();
            } else {
                zzbaxVar.add((String) obj3);
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public abstract zzayl clone();

    protected abstract zzayl zzu(zzaym zzaymVar);

    @Override // com.google.android.libraries.places.internal.zzbbk
    public final /* synthetic */ zzbbk zzw(zzbbl zzbblVar) {
        if (zzbB().getClass().isInstance(zzbblVar)) {
            return zzu((zzaym) zzbblVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.libraries.places.internal.zzbbk
    public /* synthetic */ zzbbk zzx(zzazc zzazcVar, zzazp zzazpVar) throws IOException {
        throw null;
    }
}
