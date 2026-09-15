package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
final class zzbto extends zzbia {
    private final zzbhr zzf;
    private zzbhx zzg;
    private zzbfy zzh = zzbfy.IDLE;

    zzbto(zzbhr zzbhrVar) {
        if (zzbhrVar == null) {
            throw new NullPointerException("helper");
        }
        this.zzf = zzbhrVar;
    }

    private final void zzg(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        this.zzh = zzbfyVar;
        this.zzf.zzb(zzbfyVar, zzbhyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final zzbjv zza(zzbhw zzbhwVar) {
        zzbtk zzbtkVar;
        Boolean bool;
        List listZzc = zzbhwVar.zzc();
        if (listZzc.isEmpty()) {
            zzbjv zzbjvVar = zzbjv.zzi;
            String strValueOf = String.valueOf(zzbhwVar.zzc());
            String strValueOf2 = String.valueOf(zzbhwVar.zzd());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 55 + String.valueOf(strValueOf2).length());
            sb.append("NameResolver returned no usable address. addrs=");
            sb.append(strValueOf);
            sb.append(", attrs=");
            sb.append(strValueOf2);
            zzbjv zzbjvVarZze = zzbjvVar.zze(sb.toString());
            zzb(zzbjvVarZze);
            return zzbjvVarZze;
        }
        if ((zzbhwVar.zze() instanceof zzbtk) && (bool = (zzbtkVar = (zzbtk) zzbhwVar.zze()).zza) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(listZzc);
            Long l = zzbtkVar.zzb;
            Collections.shuffle(arrayList, new Random());
            listZzc = arrayList;
        }
        zzbhx zzbhxVar = this.zzg;
        if (zzbhxVar == null) {
            zzbhr zzbhrVar = this.zzf;
            zzbhm zzbhmVarZzd = zzbho.zzd();
            zzbhmVarZzd.zzb(listZzc);
            zzbhx zzbhxVarZza = zzbhrVar.zza(zzbhmVarZzd.zzc());
            zzbhxVarZza.zza(new zzbtj(this, zzbhxVarZza));
            this.zzg = zzbhxVarZza;
            zzg(zzbfy.CONNECTING, new zzbtl(zzbht.zza(zzbhxVarZza, null)));
            zzbhxVarZza.zzc();
        } else {
            zzbhxVar.zzd(listZzc);
        }
        return zzbjv.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzb(zzbjv zzbjvVar) {
        zzbhx zzbhxVar = this.zzg;
        if (zzbhxVar != null) {
            zzbhxVar.zzb();
            this.zzg = null;
        }
        zzg(zzbfy.TRANSIENT_FAILURE, new zzbtl(zzbht.zzb(zzbjvVar)));
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzc() {
        zzbhx zzbhxVar = this.zzg;
        if (zzbhxVar != null) {
            zzbhxVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzd() {
        zzbhx zzbhxVar = this.zzg;
        if (zzbhxVar != null) {
            zzbhxVar.zzc();
        }
    }

    final /* synthetic */ void zze(zzbhx zzbhxVar, zzbfz zzbfzVar) {
        zzbhy zzbtlVar;
        zzbfy zzbfyVarZzc = zzbfzVar.zzc();
        if (zzbfyVarZzc != zzbfy.SHUTDOWN) {
            zzbfy zzbfyVar = zzbfy.TRANSIENT_FAILURE;
            if (zzbfyVarZzc == zzbfyVar || zzbfyVarZzc == zzbfy.IDLE) {
                this.zzf.zzc();
            }
            if (this.zzh == zzbfyVar) {
                if (zzbfyVarZzc == zzbfy.CONNECTING) {
                    return;
                }
                if (zzbfyVarZzc == zzbfy.IDLE) {
                    zzd();
                    return;
                }
            }
            int iOrdinal = zzbfyVarZzc.ordinal();
            if (iOrdinal == 0) {
                zzbtlVar = new zzbtl(zzbht.zzd());
            } else if (iOrdinal == 1) {
                zzbtlVar = new zzbtl(zzbht.zza(zzbhxVar, null));
            } else if (iOrdinal == 2) {
                zzbtlVar = new zzbtl(zzbht.zzb(zzbfzVar.zzd()));
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(String.valueOf(zzbfyVarZzc))));
                }
                zzbtlVar = new zzbtn(this, zzbhxVar);
            }
            zzg(zzbfyVarZzc, zzbtlVar);
        }
    }

    final /* synthetic */ zzbhr zzf() {
        return this.zzf;
    }
}
