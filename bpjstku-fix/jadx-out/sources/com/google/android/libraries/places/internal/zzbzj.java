package com.google.android.libraries.places.internal;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzj implements zzbzb {
    final zzbze zza;
    private final zzcbl zzb;
    private final zzbzh zzc;

    zzbzj(zzcbl zzcblVar, int i, boolean z) {
        this.zzb = zzcblVar;
        zzbzh zzbzhVar = new zzbzh(zzcblVar);
        this.zzc = zzbzhVar;
        this.zza = new zzbze(4096, 4096, zzbzhVar);
    }

    private final List zzb(int i, short s, byte b, int i2) throws IOException {
        zzbzh zzbzhVar = this.zzc;
        zzbzhVar.zzd = i;
        zzbzhVar.zza = i;
        zzbzhVar.zze = s;
        zzbzhVar.zzb = b;
        zzbzhVar.zzc = i2;
        zzbze zzbzeVar = this.zza;
        zzbzeVar.zzb();
        return zzbzeVar.zzc();
    }

    private final void zzc(zzbza zzbzaVar, int i) throws IOException {
        zzcbl zzcblVar = this.zzb;
        zzcblVar.zzm();
        zzcblVar.zzj();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzb.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.zzbzb
    public final boolean zza(zzbza zzbzaVar) throws IOException {
        try {
            this.zzb.zzg(9L);
            zzcbl zzcblVar = this.zzb;
            int iZzf = zzbzl.zzf(zzcblVar);
            if (iZzf > 16384) {
                throw zzbzl.zzi("FRAME_SIZE_ERROR: %s", Integer.valueOf(iZzf));
            }
            byte bZzj = zzcblVar.zzj();
            byte bZzj2 = zzcblVar.zzj();
            int iZzm = zzcblVar.zzm();
            byte b = (byte) (bZzj & UByte.MAX_VALUE);
            byte b2 = (byte) (bZzj2 & UByte.MAX_VALUE);
            int i = iZzm & Integer.MAX_VALUE;
            if (zzbzl.zza.isLoggable(Level.FINE)) {
                zzbzl.zza.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Reader", "nextFrame", zzbzi.zza(true, i, iZzf, b, b2));
            }
            switch (b) {
                case 0:
                    if ((b2 & 32) != 0) {
                        throw zzbzl.zzi("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    int iZzj = (b2 & 8) != 0 ? zzcblVar.zzj() & UByte.MAX_VALUE : 0;
                    zzbzaVar.zza(1 == (b2 & 1), i, zzcblVar, zzbzl.zze(iZzf, b2, (short) iZzj), iZzf);
                    zzcblVar.zzt(iZzj);
                    return true;
                case 1:
                    if (i == 0) {
                        throw zzbzl.zzi("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    int iZzj2 = (b2 & 8) != 0 ? zzcblVar.zzj() & UByte.MAX_VALUE : 0;
                    if ((b2 & 32) != 0) {
                        zzc(zzbzaVar, i);
                        iZzf -= 5;
                    }
                    short s = (short) iZzj2;
                    zzbzaVar.zzh(false, 1 == (b2 & 1), i, -1, zzb(zzbzl.zze(iZzf, b2, s), s, b2, i), 4);
                    return true;
                case 2:
                    if (iZzf != 5) {
                        throw zzbzl.zzi("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iZzf));
                    }
                    if (i == 0) {
                        throw zzbzl.zzi("TYPE_PRIORITY streamId == 0", new Object[0]);
                    }
                    zzc(zzbzaVar, i);
                    return true;
                case 3:
                    if (iZzf != 4) {
                        throw zzbzl.zzi("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iZzf));
                    }
                    if (i == 0) {
                        throw zzbzl.zzi("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    int iZzm2 = zzcblVar.zzm();
                    zzbyz zzbyzVarZza = zzbyz.zza(iZzm2);
                    if (zzbyzVarZza == null) {
                        throw zzbzl.zzi("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iZzm2));
                    }
                    zzbzaVar.zzb(i, zzbyzVarZza);
                    return true;
                case 4:
                    if (i != 0) {
                        throw zzbzl.zzi("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((b2 & 1) == 0) {
                        if (iZzf % 6 != 0) {
                            throw zzbzl.zzi("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iZzf));
                        }
                        zzbzo zzbzoVar = new zzbzo();
                        for (int i2 = 0; i2 < iZzf; i2 += 6) {
                            short sZzl = zzcblVar.zzl();
                            int iZzm3 = zzcblVar.zzm();
                            switch (sZzl) {
                                case 1:
                                case 6:
                                    break;
                                case 2:
                                    if (iZzm3 != 0 && iZzm3 != 1) {
                                        throw zzbzl.zzi("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    }
                                    break;
                                case 3:
                                    sZzl = 4;
                                    break;
                                case 4:
                                    if (iZzm3 < 0) {
                                        throw zzbzl.zzi("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    }
                                    sZzl = 7;
                                    break;
                                    break;
                                case 5:
                                    if (iZzm3 < 16384 || iZzm3 > 16777215) {
                                        throw zzbzl.zzi("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iZzm3));
                                    }
                                    break;
                                default:
                                    continue;
                                    break;
                            }
                            zzbzoVar.zza(sZzl, 0, iZzm3);
                        }
                        zzbzaVar.zzc(false, zzbzoVar);
                        if (zzbzoVar.zze() >= 0) {
                            this.zza.zza(zzbzoVar.zze());
                        }
                    } else if (iZzf != 0) {
                        throw zzbzl.zzi("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    }
                    return true;
                case 5:
                    if (i == 0) {
                        throw zzbzl.zzi("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    short sZzj = (short) ((b2 & 8) != 0 ? zzcblVar.zzj() & UByte.MAX_VALUE : 0);
                    zzbzaVar.zzf(i, zzcblVar.zzm() & Integer.MAX_VALUE, zzb(zzbzl.zze(iZzf - 4, b2, sZzj), sZzj, b2, i));
                    return true;
                case 6:
                    if (iZzf != 8) {
                        throw zzbzl.zzi("TYPE_PING length != 8: %s", Integer.valueOf(iZzf));
                    }
                    if (i != 0) {
                        throw zzbzl.zzi("TYPE_PING streamId != 0", new Object[0]);
                    }
                    zzbzaVar.zzd(1 == (b2 & 1), zzcblVar.zzm(), zzcblVar.zzm());
                    return true;
                case 7:
                    if (iZzf < 8) {
                        throw zzbzl.zzi("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iZzf));
                    }
                    if (i != 0) {
                        throw zzbzl.zzi("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    int i3 = iZzf - 8;
                    int iZzm4 = zzcblVar.zzm();
                    int iZzm5 = zzcblVar.zzm();
                    zzbyz zzbyzVarZza2 = zzbyz.zza(iZzm5);
                    if (zzbyzVarZza2 == null) {
                        throw zzbzl.zzi("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iZzm5));
                    }
                    zzcbn zzcbnVarZzn = zzcbn.zza;
                    if (i3 > 0) {
                        zzcbnVarZzn = zzcblVar.zzn(i3);
                    }
                    zzbzaVar.zze(iZzm4, zzbyzVarZza2, zzcbnVarZzn);
                    return true;
                case 8:
                    if (iZzf != 4) {
                        throw zzbzl.zzi("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iZzf));
                    }
                    long jZzm = ((long) zzcblVar.zzm()) & SieveCacheKt.NodeLinkMask;
                    if (jZzm == 0) {
                        throw zzbzl.zzi("windowSizeIncrement was 0", new Object[0]);
                    }
                    zzbzaVar.zzg(i, jZzm);
                    return true;
                default:
                    zzcblVar.zzt(iZzf);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
