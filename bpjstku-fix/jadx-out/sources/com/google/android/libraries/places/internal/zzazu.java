package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzazu {
    private static final zzazu zzd = new zzazu(true);
    final zzbcg zza = new zzbcc();
    private boolean zzb;
    private boolean zzc;

    private zzazu() {
    }

    public static int zzk(zzazt zzaztVar, Object obj) {
        int iZzA;
        int iZzc;
        int iZzz;
        zzbcx zzbcxVarZzb = zzaztVar.zzb();
        zzaztVar.zza();
        zzaztVar.zzd();
        int iZzz2 = zzazi.zzz(-94933856);
        if (zzbcxVarZzb == zzbcx.GROUP) {
            zzbbl zzbblVar = (zzbbl) obj;
            if (zzbblVar instanceof zzayn) {
                throw null;
            }
            iZzz2 += iZzz2;
        }
        switch (zzbcxVarZzb.ordinal()) {
            case 0:
                iZzA = 8;
                return iZzz2 + iZzA;
            case 1:
                iZzA = 4;
                return iZzz2 + iZzA;
            case 2:
                iZzA = zzazi.zzA(((Long) obj).longValue());
                return iZzz2 + iZzA;
            case 3:
                iZzA = zzazi.zzA(((Long) obj).longValue());
                return iZzz2 + iZzA;
            case 4:
                iZzA = zzazi.zzA(((Integer) obj).intValue());
                return iZzz2 + iZzA;
            case 5:
                iZzA = 8;
                return iZzz2 + iZzA;
            case 6:
                iZzA = 4;
                return iZzz2 + iZzA;
            case 7:
                iZzA = 1;
                return iZzz2 + iZzA;
            case 8:
                if (obj instanceof zzayz) {
                    iZzc = ((zzayz) obj).zzc();
                    iZzz = zzazi.zzz(iZzc);
                    iZzA = iZzc + iZzz;
                } else {
                    iZzA = zzazi.zzB((String) obj);
                }
                return iZzz2 + iZzA;
            case 9:
                iZzA = ((zzbbl) obj).zzbl();
                return iZzz2 + iZzA;
            case 10:
                if (obj instanceof zzbav) {
                    iZzc = ((zzbav) obj).zzb();
                    iZzz = zzazi.zzz(iZzc);
                    iZzA = iZzc + iZzz;
                } else {
                    iZzA = zzazi.zzC((zzbbl) obj);
                }
                return iZzz2 + iZzA;
            case 11:
                if (obj instanceof zzayz) {
                    iZzc = ((zzayz) obj).zzc();
                    iZzz = zzazi.zzz(iZzc);
                } else {
                    iZzc = ((byte[]) obj).length;
                    iZzz = zzazi.zzz(iZzc);
                }
                iZzA = iZzc + iZzz;
                return iZzz2 + iZzA;
            case 12:
                iZzA = zzazi.zzz(((Integer) obj).intValue());
                return iZzz2 + iZzA;
            case 13:
                iZzA = obj instanceof zzbai ? zzazi.zzA(((zzbai) obj).zza()) : zzazi.zzA(((Integer) obj).intValue());
                return iZzz2 + iZzA;
            case 14:
                iZzA = 4;
                return iZzz2 + iZzA;
            case 15:
                iZzA = 8;
                return iZzz2 + iZzA;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzA = zzazi.zzz((iIntValue + iIntValue) ^ (iIntValue >> 31));
                return iZzz2 + iZzA;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzA = zzazi.zzA((jLongValue + jLongValue) ^ (jLongValue >> 63));
                return iZzz2 + iZzA;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean zzl(Map.Entry entry) {
        zzazt zzaztVar = (zzazt) entry.getKey();
        if (zzaztVar.zzc() != zzbcy.MESSAGE) {
            return true;
        }
        zzaztVar.zzd();
        Object value = entry.getValue();
        if (value instanceof zzbbm) {
            return ((zzbbm) value).zzbA();
        }
        if (value instanceof zzbav) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static Object zzm(Object obj) {
        if (obj instanceof zzbbq) {
            return ((zzbbq) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzn(Map.Entry entry) {
        zzazt zzaztVar = (zzazt) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzbav;
        zzaztVar.zzd();
        if (zzaztVar.zzc() != zzbcy.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzaztVar, zzm(value));
            return;
        }
        Object objZzf = zzf(zzaztVar);
        if (objZzf == null) {
            this.zza.put(zzaztVar, zzm(value));
            if (z) {
                this.zzc = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        this.zza.put(zzaztVar, objZzf instanceof zzbbq ? zzaztVar.zzg((zzbbq) objZzf, (zzbbq) value) : zzaztVar.zzf(((zzbbl) objZzf).zzbx(), (zzbbl) value).zzG());
    }

    private static final int zzo(Map.Entry entry) {
        int i;
        int iZzz;
        int iZzz2;
        zzazt zzaztVar = (zzazt) entry.getKey();
        Object value = entry.getValue();
        if (zzaztVar.zzc() != zzbcy.MESSAGE) {
            return zzk(zzaztVar, value);
        }
        zzaztVar.zzd();
        zzaztVar.zze();
        if (value instanceof zzbav) {
            ((zzazt) entry.getKey()).zza();
            int iZzz3 = zzazi.zzz(8);
            i = iZzz3 + iZzz3;
            iZzz = zzazi.zzz(16) + zzazi.zzz(525004180);
            int iZzz4 = zzazi.zzz(24);
            int iZzb = ((zzbav) value).zzb();
            iZzz2 = iZzz4 + zzazi.zzz(iZzb) + iZzb;
        } else {
            ((zzazt) entry.getKey()).zza();
            int iZzz5 = zzazi.zzz(8);
            i = iZzz5 + iZzz5;
            iZzz = zzazi.zzz(16) + zzazi.zzz(525004180);
            iZzz2 = zzazi.zzz(24) + zzazi.zzC((zzbbl) value);
        }
        return i + iZzz + iZzz2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzazu) {
            return this.zza.equals(((zzazu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzbcg zzbcgVar = this.zza;
        int iZzc = zzbcgVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = zzbcgVar.zzd(i).getValue();
            if (value instanceof zzbae) {
                ((zzbae) value).zzbi();
            }
        }
        Iterator it = zzbcgVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzbae) {
                ((zzbae) value2).zzbi();
            }
        }
        zzbcgVar.zza();
        this.zzb = true;
    }

    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzazu clone() {
        zzazu zzazuVar = new zzazu();
        zzbcg zzbcgVar = this.zza;
        int iZzc = zzbcgVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzd = zzbcgVar.zzd(i);
            zzazuVar.zzg((zzazt) ((zzbcd) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzbcgVar.zze()) {
            zzazuVar.zzg((zzazt) entry.getKey(), entry.getValue());
        }
        zzazuVar.zzc = this.zzc;
        return zzazuVar;
    }

    public final Iterator zze() {
        zzbcg zzbcgVar = this.zza;
        if (zzbcgVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzc ? new zzbau(zzbcgVar.entrySet().iterator()) : zzbcgVar.entrySet().iterator();
    }

    public final Object zzf(zzazt zzaztVar) {
        Object obj = this.zza.get(zzaztVar);
        if (!(obj instanceof zzbav)) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if ((r3 instanceof com.google.android.libraries.places.internal.zzbai) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r3 instanceof com.google.android.libraries.places.internal.zzbav) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(com.google.android.libraries.places.internal.zzazt r2, java.lang.Object r3) {
        /*
            r1 = this;
            r2.zzd()
            com.google.android.libraries.places.internal.zzbcx r0 = r2.zzb()
            com.google.android.libraries.places.internal.zzbcy r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L13;
                default: goto L12;
            }
        L12:
            goto L4e
        L13:
            boolean r0 = r3 instanceof com.google.android.libraries.places.internal.zzbbl
            if (r0 != 0) goto L41
            boolean r0 = r3 instanceof com.google.android.libraries.places.internal.zzbav
            if (r0 == 0) goto L4e
            goto L41
        L1c:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r3 instanceof com.google.android.libraries.places.internal.zzbai
            if (r0 == 0) goto L4e
            goto L41
        L25:
            boolean r0 = r3 instanceof com.google.android.libraries.places.internal.zzayz
            if (r0 != 0) goto L41
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L4e
            goto L41
        L2e:
            boolean r0 = r3 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r3 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r3 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r3 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r3 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L4e
        L41:
            boolean r0 = r3 instanceof com.google.android.libraries.places.internal.zzbav
            if (r0 == 0) goto L48
            r0 = 1
            r1.zzc = r0
        L48:
            com.google.android.libraries.places.internal.zzbcg r0 = r1.zza
            r0.put(r2, r3)
            return
        L4e:
            r2.zza()
            com.google.android.libraries.places.internal.zzbcx r2 = r2.zzb()
            com.google.android.libraries.places.internal.zzbcy r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r0 = 525004180(0x1f4aed94, float:4.2971684E-20)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2, r3}
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzazu.zzg(com.google.android.libraries.places.internal.zzazt, java.lang.Object):void");
    }

    public final boolean zzh() {
        zzbcg zzbcgVar = this.zza;
        int iZzc = zzbcgVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzl(zzbcgVar.zzd(i))) {
                return false;
            }
        }
        Iterator it = zzbcgVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzl((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void zzi(zzazu zzazuVar) {
        zzbcg zzbcgVar = zzazuVar.zza;
        int iZzc = zzbcgVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            zzn(zzbcgVar.zzd(i));
        }
        Iterator it = zzbcgVar.zze().iterator();
        while (it.hasNext()) {
            zzn((Map.Entry) it.next());
        }
    }

    public final int zzj() {
        zzbcg zzbcgVar = this.zza;
        int iZzc = zzbcgVar.zzc();
        int iZzo = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzo += zzo(zzbcgVar.zzd(i));
        }
        Iterator it = zzbcgVar.zze().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    private zzazu(boolean z) {
        zzb();
        zzb();
    }

    public static zzazu zza() {
        return zzd;
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
