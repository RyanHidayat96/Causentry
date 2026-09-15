package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbbp implements zzbbz {
    private final zzbbl zza;
    private final zzbcm zzb;
    private final boolean zzc;
    private final zzazq zzd;

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final Object zza() {
        zzbbl zzbblVar = this.zza;
        return zzbblVar instanceof zzbae ? ((zzbae) zzbblVar).zzbg() : zzbblVar.zzby().zzF();
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final boolean zzb(Object obj, Object obj2) {
        if (!((zzbae) obj).zzc.equals(((zzbae) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzbab) obj).zzb.equals(((zzbab) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final int zzc(Object obj) {
        int iHashCode = ((zzbae) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzbab) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzd(Object obj, Object obj2) {
        zzbcb.zzD(this.zzb, obj, obj2);
        if (this.zzc) {
            zzbcb.zzC(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final int zze(Object obj) {
        int iZzh = ((zzbae) obj).zzc.zzh();
        return this.zzc ? iZzh + ((zzbab) obj).zzb.zzj() : iZzh;
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzf(Object obj, zzbcz zzbczVar) throws IOException {
        Iterator itZze = ((zzbab) obj).zzb.zze();
        while (itZze.hasNext()) {
            Map.Entry entry = (Map.Entry) itZze.next();
            zzazt zzaztVar = (zzazt) entry.getKey();
            if (zzaztVar.zzc() != zzbcy.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzaztVar.zzd();
            zzaztVar.zze();
            if (entry instanceof zzbat) {
                zzaztVar.zza();
                zzbczVar.zzv(525004180, ((zzbat) entry).zza().zzc());
            } else {
                zzaztVar.zza();
                zzbczVar.zzv(525004180, entry.getValue());
            }
        }
        ((zzbae) obj).zzc.zzf(zzbczVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzg(Object obj, zzbby zzbbyVar, zzazp zzazpVar) throws IOException {
        boolean zZzd;
        zzazq zzazqVar = this.zzd;
        zzbcm zzbcmVar = this.zzb;
        Object objZzh = zzbcmVar.zzh(obj);
        zzazu zzazuVarZza = zzazqVar.zza(obj);
        while (true) {
            try {
                if (zzbbyVar.zzb() == Integer.MAX_VALUE) {
                    break;
                }
                int iZzc = zzbbyVar.zzc();
                if (iZzc != 11) {
                    if ((iZzc & 7) == 2) {
                        zzbad zzbadVarZzb = zzazpVar.zzb(this.zza, iZzc >>> 3);
                        if (zzbadVarZzb != null) {
                            zzazqVar.zzd(zzbbyVar, zzbadVarZzb, zzazpVar, zzazuVarZza);
                        } else {
                            zZzd = zzbcmVar.zzk(objZzh, zzbbyVar, 0);
                        }
                    } else {
                        zZzd = zzbbyVar.zzd();
                    }
                    if (!zZzd) {
                        break;
                    }
                } else {
                    zzbad zzbadVarZzb2 = null;
                    zzayz zzayzVarZzs = null;
                    int iZzt = 0;
                    for (int i = Integer.MAX_VALUE; zzbbyVar.zzb() != i; i = Integer.MAX_VALUE) {
                        int iZzc2 = zzbbyVar.zzc();
                        if (iZzc2 == 16) {
                            iZzt = zzbbyVar.zzt();
                            zzbadVarZzb2 = zzazpVar.zzb(this.zza, iZzt);
                        } else if (iZzc2 != 26) {
                            if (iZzc2 == 12 || !zzbbyVar.zzd()) {
                                break;
                                break;
                            }
                        } else if (zzbadVarZzb2 != null) {
                            zzazqVar.zzd(zzbbyVar, zzbadVarZzb2, zzazpVar, zzazuVarZza);
                        } else {
                            zzayzVarZzs = zzbbyVar.zzs();
                        }
                    }
                    if (zzbbyVar.zzc() != 12) {
                        throw new zzbar("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzayzVarZzs != null) {
                        if (zzbadVarZzb2 != null) {
                            zzbad zzbadVar = zzbadVarZzb2;
                            zzazy zzazyVar = (zzazy) ((zzbae) zzbadVarZzb2.zza).zzb(5, null, null);
                            zzazc zzazcVarZzH = zzazc.zzH(((zzayy) zzayzVarZzs).zza, 0, ((zzayy) zzayzVarZzs).zzc(), true);
                            zzazyVar.zzx(zzazcVarZzH, zzazpVar);
                            zzazuVarZza.zzg(zzbadVarZzb2.zzb, zzazyVar.zzF());
                            zzazcVarZzH.zzb(0);
                        } else {
                            zzbcmVar.zzd(objZzh, iZzt, zzayzVarZzs);
                        }
                    }
                }
            } catch (Throwable th) {
                zzbcmVar.zzi(obj, objZzh);
                throw th;
            }
        }
        zzbcmVar.zzi(obj, objZzh);
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzh(Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final boolean zzi(Object obj) {
        return ((zzbab) obj).zzb.zzh();
    }

    private zzbbp(zzbcm zzbcmVar, zzazq zzazqVar, zzbbl zzbblVar) {
        this.zzb = zzbcmVar;
        this.zzc = zzbblVar instanceof zzbab;
        this.zzd = zzazqVar;
        this.zza = zzbblVar;
    }

    static zzbbp zzj(zzbcm zzbcmVar, zzazq zzazqVar, zzbbl zzbblVar) {
        return new zzbbp(zzbcmVar, zzazqVar, zzbblVar);
    }
}
