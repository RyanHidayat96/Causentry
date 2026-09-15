package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsr implements zzbow {
    private final zzbsq zza;
    private zzbwq zzc;
    private int zzd;
    private final zzbwr zzh;
    private final zzbwg zzi;
    private boolean zzj;
    private int zzk;
    private long zzm;
    private int zzb = -1;
    private zzbfu zze = zzbfs.zza;
    private final zzbsp zzf = new zzbsp(this, null);
    private final ByteBuffer zzg = ByteBuffer.allocate(5);
    private int zzl = -1;

    public zzbsr(zzbsq zzbsqVar, zzbwr zzbwrVar, zzbwg zzbwgVar) {
        if (zzbsqVar == null) {
            throw new NullPointerException("sink");
        }
        this.zza = zzbsqVar;
        if (zzbwrVar == null) {
            throw new NullPointerException("bufferAllocator");
        }
        this.zzh = zzbwrVar;
        if (zzbwgVar == null) {
            throw new NullPointerException("statsTraceCtx");
        }
        this.zzi = zzbwgVar;
    }

    private final void zzi(zzbso zzbsoVar, boolean z) {
        int iZza = zzbsoVar.zza();
        int i = this.zzb;
        if (i >= 0 && iZza > i) {
            throw new zzbjy(zzbjv.zzf.zze(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iZza), Integer.valueOf(this.zzb))), null);
        }
        ByteBuffer byteBuffer = this.zzg;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iZza);
        zzbwq zzbwqVarZza = this.zzh.zza(5);
        zzbwqVarZza.zza(byteBuffer.array(), 0, byteBuffer.position());
        if (iZza == 0) {
            this.zzc = zzbwqVarZza;
            return;
        }
        zzbsq zzbsqVar = this.zza;
        zzbsqVar.zzj(zzbwqVarZza, false, false, this.zzk - 1);
        this.zzk = 1;
        List listZzb = zzbsoVar.zzb();
        for (int i2 = 0; i2 < listZzb.size() - 1; i2++) {
            zzbsqVar.zzj((zzbwq) listZzb.get(i2), false, false, 0);
        }
        this.zzc = (zzbwq) listZzb.get(listZzb.size() - 1);
        this.zzm = iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zzj(InputStream inputStream, OutputStream outputStream) throws IOException {
        return ((zzbgk) inputStream).zza(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final void zzg(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            zzbwq zzbwqVar = this.zzc;
            if (zzbwqVar != null && zzbwqVar.zzc() == 0) {
                zzl(false, false);
            }
            if (this.zzc == null) {
                int i3 = this.zzd;
                if (!(i3 > 0)) {
                    throw new IllegalStateException("knownLengthPendingAllocation reached 0");
                }
                zzbwq zzbwqVarZza = this.zzh.zza(i3);
                this.zzc = zzbwqVarZza;
                int i4 = this.zzd;
                this.zzd = i4 - Math.min(i4, zzbwqVarZza.zzc());
            }
            int iMin = Math.min(i2, this.zzc.zzc());
            this.zzc.zza(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    private final void zzl(boolean z, boolean z2) {
        zzbwq zzbwqVar = this.zzc;
        this.zzc = null;
        this.zza.zzj(zzbwqVar, z, z2, this.zzk);
        this.zzk = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final void zza(InputStream inputStream) {
        int iZzj;
        if (this.zzj) {
            throw new IllegalStateException("Framer already closed");
        }
        this.zzk++;
        int i = this.zzl + 1;
        this.zzl = i;
        this.zzm = 0L;
        this.zzi.zzf(i);
        zzbfu zzbfuVar = this.zze;
        zzbft zzbftVar = zzbfs.zza;
        try {
            int iAvailable = inputStream.available();
            if (iAvailable != 0 && zzbfuVar != zzbftVar) {
                zzbso zzbsoVar = new zzbso(this, null);
                OutputStream outputStreamZzb = this.zze.zzb(zzbsoVar);
                try {
                    iZzj = zzj(inputStream, outputStreamZzb);
                    outputStreamZzb.close();
                    int i2 = this.zzb;
                    if (i2 >= 0 && iZzj > i2) {
                        throw new zzbjy(zzbjv.zzf.zze(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iZzj), Integer.valueOf(this.zzb))), null);
                    }
                    zzi(zzbsoVar, true);
                } catch (Throwable th) {
                    outputStreamZzb.close();
                    throw th;
                }
            } else if (iAvailable != -1) {
                this.zzm = iAvailable;
                int i3 = this.zzb;
                if (i3 >= 0 && iAvailable > i3) {
                    throw new zzbjy(zzbjv.zzf.zze(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(this.zzb))), null);
                }
                ByteBuffer byteBuffer = this.zzg;
                byteBuffer.clear();
                byteBuffer.put((byte) 0).putInt(iAvailable);
                this.zzd = iAvailable + 5;
                zzg(byteBuffer.array(), 0, byteBuffer.position());
                iZzj = zzj(inputStream, this.zzf);
            } else {
                zzbso zzbsoVar2 = new zzbso(this, null);
                iZzj = zzj(inputStream, zzbsoVar2);
                zzi(zzbsoVar2, false);
            }
            if (iAvailable != -1 && iZzj != iAvailable) {
                throw new zzbjy(zzbjv.zzh.zze(String.format("Message length inaccurate %s != %s", Integer.valueOf(iZzj), Integer.valueOf(iAvailable))), null);
            }
            zzbwg zzbwgVar = this.zzi;
            long j = iZzj;
            zzbwgVar.zzj(j);
            zzbwgVar.zzk(this.zzm);
            zzbwgVar.zzh(this.zzl, this.zzm, j);
        } catch (zzbjy e2) {
            throw e2;
        } catch (IOException e3) {
            throw new zzbjy(zzbjv.zzh.zze("Failed to frame message").zzd(e3), null);
        } catch (RuntimeException e4) {
            throw new zzbjy(zzbjv.zzh.zze("Failed to frame message").zzd(e4), null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final void zzb() {
        zzbwq zzbwqVar = this.zzc;
        if (zzbwqVar == null || zzbwqVar.zzd() <= 0) {
            return;
        }
        zzl(false, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final void zzd() {
        if (this.zzj) {
            return;
        }
        this.zzj = true;
        zzbwq zzbwqVar = this.zzc;
        if (zzbwqVar != null && zzbwqVar.zzd() == 0) {
            this.zzc = null;
        }
        zzl(true, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final /* synthetic */ zzbow zze(zzbfu zzbfuVar) {
        if (zzbfuVar == null) {
            throw new NullPointerException("Can't pass an empty compressor");
        }
        this.zze = zzbfuVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final void zzf(int i) {
        if (!(this.zzb == -1)) {
            throw new IllegalStateException("max size already set");
        }
        this.zzb = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final boolean zzc() {
        return this.zzj;
    }

    final /* synthetic */ zzbwr zzh() {
        return this.zzh;
    }
}
