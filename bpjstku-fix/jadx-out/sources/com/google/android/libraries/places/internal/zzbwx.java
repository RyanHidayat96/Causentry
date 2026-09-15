package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
final class zzbwx implements zzcbx {
    private final zzbvw zzc;
    private final zzbwy zzd;
    private zzcbx zzh;
    private Socket zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private final Object zza = new Object();
    private final zzcbj zzb = new zzcbj();
    private boolean zze = false;
    private boolean zzf = false;
    private boolean zzg = false;

    private zzbwx(zzbvw zzbvwVar, zzbwy zzbwyVar, int i) {
        if (zzbvwVar == null) {
            throw new NullPointerException("executor");
        }
        this.zzc = zzbvwVar;
        if (zzbwyVar == null) {
            throw new NullPointerException("exceptionHandler");
        }
        this.zzd = zzbwyVar;
    }

    static zzbwx zza(zzbvw zzbvwVar, zzbwy zzbwyVar, int i) {
        return new zzbwx(zzbvwVar, zzbwyVar, 10000);
    }

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        this.zzc.execute(new zzbwu(this));
    }

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzg) {
            throw new IOException("closed");
        }
        synchronized (this.zza) {
            if (this.zzf) {
                return;
            }
            this.zzf = true;
            this.zzc.execute(new zzbwt(this));
        }
    }

    final void zzb(zzcbx zzcbxVar, Socket socket) {
        if (!(this.zzh == null)) {
            throw new IllegalStateException("AsyncSink's becomeConnected should only be called once.");
        }
        if (zzcbxVar == null) {
            throw new NullPointerException("sink");
        }
        this.zzh = zzcbxVar;
        if (socket == null) {
            throw new NullPointerException("socket");
        }
        this.zzi = socket;
    }

    @Override // com.google.android.libraries.places.internal.zzcbx
    public final void zzc(zzcbj zzcbjVar, long j) throws IOException {
        if (zzcbjVar == null) {
            throw new NullPointerException("source");
        }
        if (this.zzg) {
            throw new IOException("closed");
        }
        synchronized (this.zza) {
            zzcbj zzcbjVar2 = this.zzb;
            zzcbjVar2.zzc(zzcbjVar, j);
            int i = this.zzl + this.zzk;
            this.zzl = i;
            boolean z = false;
            this.zzk = 0;
            if (this.zzj || i <= 10000) {
                if (!this.zze && !this.zzf && zzcbjVar2.zzi() > 0) {
                    this.zze = true;
                }
                return;
            }
            this.zzj = true;
            z = true;
            if (!z) {
                this.zzc.execute(new zzbws(this));
                return;
            }
            try {
                this.zzi.close();
            } catch (IOException e2) {
                this.zzd.zzg(e2);
            }
        }
    }

    final /* synthetic */ Object zzd() {
        return this.zza;
    }

    final /* synthetic */ zzcbj zze() {
        return this.zzb;
    }

    final /* synthetic */ zzbwy zzf() {
        return this.zzd;
    }

    final /* synthetic */ void zzg(boolean z) {
        this.zze = false;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zzf = false;
    }

    final /* synthetic */ zzcbx zzi() {
        return this.zzh;
    }

    final /* synthetic */ Socket zzj() {
        return this.zzi;
    }

    final /* synthetic */ int zzk() {
        return this.zzk;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzk = i;
    }

    final /* synthetic */ int zzm() {
        return this.zzl;
    }

    final /* synthetic */ void zzn(int i) {
        this.zzl = i;
    }
}
