package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum zzbpd {
    NO_ERROR(0, zzbjv.zzi),
    PROTOCOL_ERROR(1, zzbjv.zzh),
    INTERNAL_ERROR(2, zzbjv.zzh),
    FLOW_CONTROL_ERROR(3, zzbjv.zzh),
    SETTINGS_TIMEOUT(4, zzbjv.zzh),
    STREAM_CLOSED(5, zzbjv.zzh),
    FRAME_SIZE_ERROR(6, zzbjv.zzh),
    REFUSED_STREAM(7, zzbjv.zzi),
    CANCEL(8, zzbjv.zzb),
    COMPRESSION_ERROR(9, zzbjv.zzh),
    CONNECT_ERROR(10, zzbjv.zzh),
    ENHANCE_YOUR_CALM(11, zzbjv.zzf.zze("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, zzbjv.zze.zze("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, zzbjv.zzc);

    private static final zzbpd[] zzo;
    private final int zzp;
    private final zzbjv zzq;

    static {
        zzbpd[] zzbpdVarArrValues = values();
        zzbpd[] zzbpdVarArr = new zzbpd[zzbpdVarArrValues[zzbpdVarArrValues.length - 1].zzp + 1];
        for (zzbpd zzbpdVar : zzbpdVarArrValues) {
            zzbpdVarArr[zzbpdVar.zzp] = zzbpdVar;
        }
        zzo = zzbpdVarArr;
    }

    zzbpd(int i, zzbjv zzbjvVar) {
        this.zzp = i;
        String strConcat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (zzbjvVar.zzh() != null) {
            String strZzh = zzbjvVar.zzh();
            StringBuilder sb = new StringBuilder(strConcat.length() + 2 + String.valueOf(strZzh).length() + 1);
            sb.append(strConcat);
            sb.append(" (");
            sb.append(strZzh);
            sb.append(")");
            strConcat = sb.toString();
        }
        this.zzq = zzbjvVar.zze(strConcat);
    }

    public static zzbjv zza(long j) {
        zzbpd[] zzbpdVarArr = zzo;
        zzbpd zzbpdVar = null;
        if (j < zzbpdVarArr.length && j >= 0) {
            zzbpdVar = zzbpdVarArr[(int) j];
        }
        if (zzbpdVar != null) {
            return zzbpdVar.zzq;
        }
        zzbjv zzbjvVarZza = zzbjv.zza(INTERNAL_ERROR.zzq.zzg().zza());
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 32);
        sb.append("Unrecognized HTTP/2 error code: ");
        sb.append(j);
        return zzbjvVarZza.zze(sb.toString());
    }
}
