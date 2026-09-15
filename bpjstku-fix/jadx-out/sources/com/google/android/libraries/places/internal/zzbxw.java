package com.google.android.libraries.places.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxw {
    private final Logger zza;
    private final Level zzb;

    zzbxw(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        if (level == null) {
            throw new NullPointerException(FirebaseAnalytics.Param.LEVEL);
        }
        this.zzb = level;
        if (logger == null) {
            throw new NullPointerException("logger");
        }
        this.zza = logger;
    }

    private static String zzk(zzcbj zzcbjVar) {
        return zzcbjVar.zzb() <= 64 ? zzcbjVar.zzF().zzg() : String.valueOf(zzcbjVar.zzG((int) Math.min(zzcbjVar.zzb(), 64L)).zzg()).concat("...");
    }

    private final boolean zzl() {
        return this.zza.isLoggable(this.zzb);
    }

    final void zza(int i, int i2, zzcbj zzcbjVar, int i3, boolean z) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i);
            String strZzk = zzk(zzcbjVar);
            StringBuilder sb = new StringBuilder(strZza.length() + 16 + String.valueOf(i2).length() + 11 + String.valueOf(z).length() + 8 + String.valueOf(i3).length() + 7 + String.valueOf(strZzk).length());
            sb.append(strZza);
            sb.append(" DATA: streamId=");
            sb.append(i2);
            sb.append(" endStream=");
            sb.append(z);
            sb.append(" length=");
            sb.append(i3);
            sb.append(" bytes=");
            sb.append(strZzk);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logData", sb.toString());
        }
    }

    final void zzb(int i, int i2, List list, boolean z) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String string = list.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 35 + string.length() + 11 + String.valueOf(z).length());
            sb.append("INBOUND HEADERS: streamId=");
            sb.append(i2);
            sb.append(" headers=");
            sb.append(string);
            sb.append(" endStream=");
            sb.append(z);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logHeaders", sb.toString());
        }
    }

    final void zzc(int i, int i2, zzbyz zzbyzVar) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i);
            String strValueOf = String.valueOf(zzbyzVar);
            StringBuilder sb = new StringBuilder(strZza.length() + 22 + String.valueOf(i2).length() + 11 + String.valueOf(strValueOf).length());
            sb.append(strZza);
            sb.append(" RST_STREAM: streamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(strValueOf);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", sb.toString());
        }
    }

    final void zzd(int i) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logSettingsAck", zzbxu.zza(2).concat(" SETTINGS: ack=true"));
        }
    }

    final void zze(int i, zzbzo zzbzoVar) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i);
            EnumMap enumMap = new EnumMap(zzbxv.class);
            for (zzbxv zzbxvVar : zzbxv.values()) {
                if (zzbzoVar.zzb(zzbxvVar.zza())) {
                    enumMap.put(zzbxvVar, Integer.valueOf(zzbzoVar.zzc(zzbxvVar.zza())));
                }
            }
            String string = enumMap.toString();
            StringBuilder sb = new StringBuilder(strZza.length() + 30 + String.valueOf(string).length());
            sb.append(strZza);
            sb.append(" SETTINGS: ack=false settings=");
            sb.append(string);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", sb.toString());
        }
    }

    final void zzf(int i, long j) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i);
            StringBuilder sb = new StringBuilder(strZza.length() + 23 + String.valueOf(j).length());
            sb.append(strZza);
            sb.append(" PING: ack=false bytes=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", sb.toString());
        }
    }

    final void zzg(int i, long j) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(2);
            StringBuilder sb = new StringBuilder(strZza.length() + 22 + String.valueOf(j).length());
            sb.append(strZza);
            sb.append(" PING: ack=true bytes=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", sb.toString());
        }
    }

    final void zzh(int i, int i2, int i3, List list) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String string = list.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 49 + String.valueOf(i3).length() + 9 + string.length());
            sb.append("INBOUND PUSH_PROMISE: streamId=");
            sb.append(i2);
            sb.append(" promisedStreamId=");
            sb.append(i3);
            sb.append(" headers=");
            sb.append(string);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPushPromise", sb.toString());
        }
    }

    final void zzi(int i, int i2, zzbyz zzbyzVar, zzcbn zzcbnVar) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i);
            String strValueOf = String.valueOf(zzbyzVar);
            int iZzj = zzcbnVar.zzj();
            zzcbj zzcbjVar = new zzcbj();
            zzcbjVar.zzu(zzcbnVar);
            String strZzk = zzk(zzcbjVar);
            StringBuilder sb = new StringBuilder(strZza.length() + 23 + String.valueOf(i2).length() + 11 + String.valueOf(strValueOf).length() + 8 + String.valueOf(iZzj).length() + 7 + String.valueOf(strZzk).length());
            sb.append(strZza);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(strValueOf);
            sb.append(" length=");
            sb.append(iZzj);
            sb.append(" bytes=");
            sb.append(strZzk);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", sb.toString());
        }
    }

    final void zzj(int i, int i2, long j) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbxu.zza(i);
            StringBuilder sb = new StringBuilder(strZza.length() + 25 + String.valueOf(i2).length() + 21 + String.valueOf(j).length());
            sb.append(strZza);
            sb.append(" WINDOW_UPDATE: streamId=");
            sb.append(i2);
            sb.append(" windowSizeIncrement=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", sb.toString());
        }
    }
}
