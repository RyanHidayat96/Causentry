package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzazj implements zzbcz {
    private final zzazi zza;

    private zzazj(zzazi zzaziVar) {
        this.zza = zzaziVar;
        zzaziVar.zze = this;
    }

    public static zzazj zza(zzazi zzaziVar) {
        zzazj zzazjVar = zzaziVar.zze;
        return zzazjVar != null ? zzazjVar : new zzazj(zzaziVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzG(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzl(i, (zzayz) list.get(i2));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zzN(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzc(int i, long j) throws IOException {
        this.zza.zzO(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zze(int i, float f) throws IOException {
        this.zza.zzN(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzi(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzg(int i, int i2) throws IOException {
        this.zza.zzL(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzh(int i, long j) throws IOException {
        this.zza.zzO(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzL(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzj(int i, long j) throws IOException {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzN(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzl(int i, boolean z) throws IOException {
        this.zza.zzj(i, z);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzm(int i, String str) throws IOException {
        this.zza.zzk(i, str);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzn(int i, zzayz zzayzVar) throws IOException {
        this.zza.zzl(i, zzayzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzo(int i, int i2) throws IOException {
        this.zza.zzM(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzp(int i, int i2) throws IOException {
        this.zza.zzM(i, (i2 + i2) ^ (i2 >> 31));
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzq(int i, long j) throws IOException {
        this.zza.zzO(i, (j + j) ^ (j >> 63));
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzr(int i, Object obj, zzbbz zzbbzVar) throws IOException {
        this.zza.zzm(i, (zzbbl) obj, zzbbzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzs(int i, Object obj, zzbbz zzbbzVar) throws IOException {
        zzazi zzaziVar = this.zza;
        zzaziVar.zzK(i, 3);
        zzbbzVar.zzf((zzbbl) obj, zzaziVar.zze);
        zzaziVar.zzK(i, 4);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    @Deprecated
    public final void zzt(int i) throws IOException {
        this.zza.zzK(i, 3);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    @Deprecated
    public final void zzu(int i) throws IOException {
        this.zza.zzK(i, 4);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzv(int i, Object obj) throws IOException {
        if (obj instanceof zzayz) {
            this.zza.zzo(i, (zzayz) obj);
        } else {
            this.zza.zzn(i, (zzbbl) obj);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzF(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbax)) {
            while (i2 < list.size()) {
                this.zza.zzk(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzbax zzbaxVar = (zzbax) list;
        while (i2 < list.size()) {
            Object objZzc = zzbaxVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzk(i, (String) objZzc);
            } else {
                this.zza.zzl(i, (zzayz) objZzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbba)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 8;
            }
            zzaziVar.zzr(i3);
            while (i2 < list.size()) {
                zzaziVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzbba zzbbaVar = (zzbba) list;
        if (!z) {
            while (i2 < zzbbaVar.size()) {
                this.zza.zzi(i, zzbbaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbbaVar.size(); i6++) {
            zzbbaVar.zze(i6);
            i5 += 8;
        }
        zzaziVar2.zzr(i5);
        while (i2 < zzbbaVar.size()) {
            zzaziVar2.zzu(zzbbaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzH(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzM(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int iZzz = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzz += zzazi.zzz(((Integer) list.get(i3)).intValue());
            }
            zzaziVar.zzr(iZzz);
            while (i2 < list.size()) {
                zzaziVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z) {
            while (i2 < zzbafVar.size()) {
                this.zza.zzM(i, zzbafVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int iZzz2 = 0;
        for (int i4 = 0; i4 < zzbafVar.size(); i4++) {
            iZzz2 += zzazi.zzz(zzbafVar.zzf(i4));
        }
        zzaziVar2.zzr(iZzz2);
        while (i2 < zzbafVar.size()) {
            zzaziVar2.zzr(zzbafVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzN(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 4;
            }
            zzaziVar.zzr(i3);
            while (i2 < list.size()) {
                zzaziVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z) {
            while (i2 < zzbafVar.size()) {
                this.zza.zzN(i, zzbafVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbafVar.size(); i6++) {
            zzbafVar.zzf(i6);
            i5 += 4;
        }
        zzaziVar2.zzr(i5);
        while (i2 < zzbafVar.size()) {
            zzaziVar2.zzs(zzbafVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbba)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzO(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzazi.zzA(((Long) list.get(i3)).longValue());
            }
            zzaziVar.zzr(iZzA);
            while (i2 < list.size()) {
                zzaziVar.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzbba zzbbaVar = (zzbba) list;
        if (!z) {
            while (i2 < zzbbaVar.size()) {
                this.zza.zzO(i, zzbbaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzbbaVar.size(); i4++) {
            iZzA2 += zzazi.zzA(zzbbaVar.zze(i4));
        }
        zzaziVar2.zzr(iZzA2);
        while (i2 < zzbbaVar.size()) {
            zzaziVar2.zzt(zzbbaVar.zze(i2));
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzayr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3++;
            }
            zzaziVar.zzr(i3);
            while (i2 < list.size()) {
                zzaziVar.zzp(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzayr zzayrVar = (zzayr) list;
        if (!z) {
            while (i2 < zzayrVar.size()) {
                this.zza.zzj(i, zzayrVar.zze(i2));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzayrVar.size(); i6++) {
            zzayrVar.zze(i6);
            i5++;
        }
        zzaziVar2.zzr(i5);
        while (i2 < zzayrVar.size()) {
            zzaziVar2.zzp(zzayrVar.zze(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzw(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzL(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzazi.zzA(((Integer) list.get(i3)).intValue());
            }
            zzaziVar.zzr(iZzA);
            while (i2 < list.size()) {
                zzaziVar.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z) {
            while (i2 < zzbafVar.size()) {
                this.zza.zzL(i, zzbafVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzbafVar.size(); i4++) {
            iZzA2 += zzazi.zzA(zzbafVar.zzf(i4));
        }
        zzaziVar2.zzr(iZzA2);
        while (i2 < zzbafVar.size()) {
            zzaziVar2.zzq(zzbafVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzazw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzN(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 4;
            }
            zzaziVar.zzr(i3);
            while (i2 < list.size()) {
                zzaziVar.zzs(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzazw zzazwVar = (zzazw) list;
        if (!z) {
            while (i2 < zzazwVar.size()) {
                this.zza.zzN(i, Float.floatToRawIntBits(zzazwVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzazwVar.size(); i6++) {
            zzazwVar.zze(i6);
            i5 += 4;
        }
        zzaziVar2.zzr(i5);
        while (i2 < zzazwVar.size()) {
            zzaziVar2.zzs(Float.floatToRawIntBits(zzazwVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzazk)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 8;
            }
            zzaziVar.zzr(i3);
            while (i2 < list.size()) {
                zzaziVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzazk zzazkVar = (zzazk) list;
        if (!z) {
            while (i2 < zzazkVar.size()) {
                this.zza.zzi(i, Double.doubleToRawLongBits(zzazkVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzazkVar.size(); i6++) {
            zzazkVar.zze(i6);
            i5 += 8;
        }
        zzaziVar2.zzr(i5);
        while (i2 < zzazkVar.size()) {
            zzaziVar2.zzu(Double.doubleToRawLongBits(zzazkVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzN(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 4;
            }
            zzaziVar.zzr(i3);
            while (i2 < list.size()) {
                zzaziVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z) {
            while (i2 < zzbafVar.size()) {
                this.zza.zzN(i, zzbafVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbafVar.size(); i6++) {
            zzbafVar.zzf(i6);
            i5 += 4;
        }
        zzaziVar2.zzr(i5);
        while (i2 < zzbafVar.size()) {
            zzaziVar2.zzs(zzbafVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbba)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 8;
            }
            zzaziVar.zzr(i3);
            while (i2 < list.size()) {
                zzaziVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzbba zzbbaVar = (zzbba) list;
        if (!z) {
            while (i2 < zzbbaVar.size()) {
                this.zza.zzi(i, zzbbaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbbaVar.size(); i6++) {
            zzbbaVar.zze(i6);
            i5 += 8;
        }
        zzaziVar2.zzr(i5);
        while (i2 < zzbbaVar.size()) {
            zzaziVar2.zzu(zzbbaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzL(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzazi.zzA(((Integer) list.get(i3)).intValue());
            }
            zzaziVar.zzr(iZzA);
            while (i2 < list.size()) {
                zzaziVar.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z) {
            while (i2 < zzbafVar.size()) {
                this.zza.zzL(i, zzbafVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzbafVar.size(); i4++) {
            iZzA2 += zzazi.zzA(zzbafVar.zzf(i4));
        }
        zzaziVar2.zzr(iZzA2);
        while (i2 < zzbafVar.size()) {
            zzaziVar2.zzq(zzbafVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzazi zzaziVar = this.zza;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    zzaziVar.zzM(i, (iIntValue + iIntValue) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            zzazi zzaziVar2 = this.zza;
            zzaziVar2.zzK(i, 2);
            int iZzz = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iZzz += zzazi.zzz((iIntValue2 + iIntValue2) ^ (iIntValue2 >> 31));
            }
            zzaziVar2.zzr(iZzz);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                zzaziVar2.zzr((iIntValue3 + iIntValue3) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z) {
            while (i2 < zzbafVar.size()) {
                zzazi zzaziVar3 = this.zza;
                int iZzf = zzbafVar.zzf(i2);
                zzaziVar3.zzM(i, (iZzf + iZzf) ^ (iZzf >> 31));
                i2++;
            }
            return;
        }
        zzazi zzaziVar4 = this.zza;
        zzaziVar4.zzK(i, 2);
        int iZzz2 = 0;
        for (int i4 = 0; i4 < zzbafVar.size(); i4++) {
            int iZzf2 = zzbafVar.zzf(i4);
            iZzz2 += zzazi.zzz((iZzf2 + iZzf2) ^ (iZzf2 >> 31));
        }
        zzaziVar4.zzr(iZzz2);
        while (i2 < zzbafVar.size()) {
            int iZzf3 = zzbafVar.zzf(i2);
            zzaziVar4.zzr((iZzf3 + iZzf3) ^ (iZzf3 >> 31));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbba)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzazi zzaziVar = this.zza;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    zzaziVar.zzO(i, (jLongValue + jLongValue) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            zzazi zzaziVar2 = this.zza;
            zzaziVar2.zzK(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iZzA += zzazi.zzA((jLongValue2 + jLongValue2) ^ (jLongValue2 >> 63));
            }
            zzaziVar2.zzr(iZzA);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                zzaziVar2.zzt((jLongValue3 + jLongValue3) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        zzbba zzbbaVar = (zzbba) list;
        if (!z) {
            while (i2 < zzbbaVar.size()) {
                zzazi zzaziVar3 = this.zza;
                long jZze = zzbbaVar.zze(i2);
                zzaziVar3.zzO(i, (jZze + jZze) ^ (jZze >> 63));
                i2++;
            }
            return;
        }
        zzazi zzaziVar4 = this.zza;
        zzaziVar4.zzK(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzbbaVar.size(); i4++) {
            long jZze2 = zzbbaVar.zze(i4);
            iZzA2 += zzazi.zzA((jZze2 + jZze2) ^ (jZze2 >> 63));
        }
        zzaziVar4.zzr(iZzA2);
        while (i2 < zzbbaVar.size()) {
            long jZze3 = zzbbaVar.zze(i2);
            zzaziVar4.zzt((jZze3 + jZze3) ^ (jZze3 >> 63));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzbba)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzO(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzazi.zzA(((Long) list.get(i3)).longValue());
            }
            zzaziVar.zzr(iZzA);
            while (i2 < list.size()) {
                zzaziVar.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzbba zzbbaVar = (zzbba) list;
        if (!z) {
            while (i2 < zzbbaVar.size()) {
                this.zza.zzO(i, zzbbaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzbbaVar.size(); i4++) {
            iZzA2 += zzazi.zzA(zzbbaVar.zze(i4));
        }
        zzaziVar2.zzr(iZzA2);
        while (i2 < zzbbaVar.size()) {
            zzaziVar2.zzt(zzbbaVar.zze(i2));
            i2++;
        }
    }
}
