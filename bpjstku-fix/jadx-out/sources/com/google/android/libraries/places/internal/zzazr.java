package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzazr extends zzazq {
    @Override // com.google.android.libraries.places.internal.zzazq
    final zzazu zza(Object obj) {
        zzbab zzbabVar = (zzbab) obj;
        if (zzbabVar.zzb.zzc()) {
            zzbabVar.zzb = zzbabVar.zzb.clone();
        }
        return zzbabVar.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzazq
    final void zzb(Object obj) {
        ((zzbab) obj).zzb.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzazq
    final void zzc(zzbcz zzbczVar, Map.Entry entry) throws IOException {
        switch (((zzbac) entry.getKey()).zzb) {
            case DOUBLE:
                zzbczVar.zzf(525004180, ((Double) entry.getValue()).doubleValue());
                break;
            case FLOAT:
                zzbczVar.zze(525004180, ((Float) entry.getValue()).floatValue());
                break;
            case INT64:
                zzbczVar.zzc(525004180, ((Long) entry.getValue()).longValue());
                break;
            case UINT64:
                zzbczVar.zzh(525004180, ((Long) entry.getValue()).longValue());
                break;
            case INT32:
                zzbczVar.zzi(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case FIXED64:
                zzbczVar.zzj(525004180, ((Long) entry.getValue()).longValue());
                break;
            case FIXED32:
                zzbczVar.zzk(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case BOOL:
                zzbczVar.zzl(525004180, ((Boolean) entry.getValue()).booleanValue());
                break;
            case STRING:
                zzbczVar.zzm(525004180, (String) entry.getValue());
                break;
            case GROUP:
                zzbczVar.zzs(525004180, entry.getValue(), zzbbv.zza().zzb(entry.getValue().getClass()));
                break;
            case MESSAGE:
                zzbczVar.zzr(525004180, entry.getValue(), zzbbv.zza().zzb(entry.getValue().getClass()));
                break;
            case BYTES:
                zzbczVar.zzn(525004180, (zzayz) entry.getValue());
                break;
            case UINT32:
                zzbczVar.zzo(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case ENUM:
                zzbczVar.zzi(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case SFIXED32:
                zzbczVar.zzb(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case SFIXED64:
                zzbczVar.zzd(525004180, ((Long) entry.getValue()).longValue());
                break;
            case SINT32:
                zzbczVar.zzp(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case SINT64:
                zzbczVar.zzq(525004180, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazq
    final void zzd(zzbby zzbbyVar, Object obj, zzazp zzazpVar, zzazu zzazuVar) throws IOException {
        zzbad zzbadVar = (zzbad) obj;
        zzazuVar.zzg(zzbadVar.zzb, zzbbyVar.zzo(zzbadVar.zza.getClass(), zzazpVar));
    }

    zzazr() {
    }
}
