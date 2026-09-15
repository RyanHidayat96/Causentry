package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzbcb {
    public static final /* synthetic */ int zza = 0;
    private static final zzbcm zzb = new zzbco();

    static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzC(zzazq zzazqVar, Object obj, Object obj2) {
        zzazu zzazuVar = ((zzbab) obj2).zzb;
        if (zzazuVar.zza.isEmpty()) {
            return;
        }
        zzazqVar.zza(obj).zzi(zzazuVar);
    }

    static void zzD(zzbcm zzbcmVar, Object obj, Object obj2) {
        zzbae zzbaeVar = (zzbae) obj;
        zzbcn zzbcnVarZzc = zzbaeVar.zzc;
        zzbcn zzbcnVar = ((zzbae) obj2).zzc;
        if (!zzbcn.zza().equals(zzbcnVar)) {
            if (zzbcn.zza().equals(zzbcnVarZzc)) {
                zzbcnVarZzc = zzbcn.zzc(zzbcnVarZzc, zzbcnVar);
            } else {
                zzbcnVarZzc.zzl(zzbcnVar);
            }
        }
        zzbaeVar.zzc = zzbcnVarZzc;
    }

    static Object zzE(Object obj, int i, List list, zzbak zzbakVar, Object obj2, zzbcm zzbcmVar) {
        if (zzbakVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzbakVar.zza(iIntValue)) {
                    obj2 = zzF(obj, i, iIntValue, obj2, zzbcmVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            if (zzbakVar.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(iIntValue2));
                }
                i2++;
            } else {
                obj2 = zzF(obj, i, iIntValue2, obj2, zzbcmVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object zzF(Object obj, int i, int i2, Object obj2, zzbcm zzbcmVar) {
        if (obj2 == null) {
            obj2 = zzbcmVar.zzh(obj);
        }
        zzbcmVar.zza(obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzC(i, list, z);
    }

    public static void zzb(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzB(i, list, z);
    }

    public static void zzc(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzy(i, list, z);
    }

    public static void zzd(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzz(i, list, z);
    }

    public static void zze(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzL(i, list, z);
    }

    public static void zzf(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzA(i, list, z);
    }

    public static void zzg(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzJ(i, list, z);
    }

    public static void zzh(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzw(i, list, z);
    }

    public static void zzi(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzH(i, list, z);
    }

    public static void zzj(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzK(i, list, z);
    }

    public static void zzk(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzx(i, list, z);
    }

    public static void zzl(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzI(i, list, z);
    }

    public static void zzm(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzD(i, list, z);
    }

    public static void zzn(int i, List list, zzbcz zzbczVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzE(i, list, z);
    }

    static int zzo(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbba)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzazi.zzA(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzA;
        }
        zzbba zzbbaVar = (zzbba) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzazi.zzA(zzbbaVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    static int zzp(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbba)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzazi.zzA(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzA;
        }
        zzbba zzbbaVar = (zzbba) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzazi.zzA(zzbbaVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    static int zzq(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbba)) {
            int iZzA = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzA += zzazi.zzA((jLongValue + jLongValue) ^ (jLongValue >> 63));
                i++;
            }
            return iZzA;
        }
        zzbba zzbbaVar = (zzbba) list;
        int iZzA2 = 0;
        while (i < size) {
            long jZze = zzbbaVar.zze(i);
            iZzA2 += zzazi.zzA((jZze + jZze) ^ (jZze >> 63));
            i++;
        }
        return iZzA2;
    }

    static int zzr(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbaf)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzazi.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzbaf zzbafVar = (zzbaf) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzazi.zzA(zzbafVar.zzf(i));
            i++;
        }
        return iZzA2;
    }

    static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbaf)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzazi.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzbaf zzbafVar = (zzbaf) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzazi.zzA(zzbafVar.zzf(i));
            i++;
        }
        return iZzA2;
    }

    static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbaf)) {
            int iZzz = 0;
            while (i < size) {
                iZzz += zzazi.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzz;
        }
        zzbaf zzbafVar = (zzbaf) list;
        int iZzz2 = 0;
        while (i < size) {
            iZzz2 += zzazi.zzz(zzbafVar.zzf(i));
            i++;
        }
        return iZzz2;
    }

    static int zzu(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbaf)) {
            int iZzz = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzz += zzazi.zzz((iIntValue + iIntValue) ^ (iIntValue >> 31));
                i++;
            }
            return iZzz;
        }
        zzbaf zzbafVar = (zzbaf) list;
        int iZzz2 = 0;
        while (i < size) {
            int iZzf = zzbafVar.zzf(i);
            iZzz2 += zzazi.zzz((iZzf + iZzf) ^ (iZzf >> 31));
            i++;
        }
        return iZzz2;
    }

    static int zzv(List list) {
        return list.size() * 4;
    }

    static int zzw(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzazi.zzz(i << 3) + 4);
    }

    static int zzx(List list) {
        return list.size() * 8;
    }

    static int zzy(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzazi.zzz(i << 3) + 8);
    }

    static int zzz(int i, Object obj, zzbbz zzbbzVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzbaw)) {
            return zzazi.zzz(i2) + zzazi.zzD((zzbbl) obj, zzbbzVar);
        }
        int iZzz = zzazi.zzz(i2);
        int iZzb = ((zzbaw) obj).zzb();
        return iZzz + zzazi.zzz(iZzb) + iZzb;
    }

    public static zzbcm zzA() {
        return zzb;
    }
}
