package com.google.android.libraries.places.internal;

import com.google.firebase.messaging.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsn implements Closeable, zzbmk {
    private zzbsk zza;
    private int zzb;
    private final zzbwg zzc;
    private final zzbwp zzd;
    private zzbgh zze;
    private boolean zzg;
    private zzbme zzh;
    private long zzj;
    private int zzm;
    private int zzp = 1;
    private int zzf = 5;
    private zzbme zzi = new zzbme();
    private boolean zzk = false;
    private int zzl = -1;
    private boolean zzn = false;
    private volatile boolean zzo = false;

    public zzbsn(zzbsk zzbskVar, zzbgh zzbghVar, int i, zzbwg zzbwgVar, zzbwp zzbwpVar) {
        if (zzbskVar == null) {
            throw new NullPointerException("sink");
        }
        this.zza = zzbskVar;
        if (zzbghVar == null) {
            throw new NullPointerException("decompressor");
        }
        this.zze = zzbghVar;
        this.zzb = i;
        if (zzbwgVar == null) {
            throw new NullPointerException("statsTraceCtx");
        }
        this.zzc = zzbwgVar;
        if (zzbwpVar == null) {
            throw new NullPointerException("transportTracer");
        }
        this.zzd = zzbwpVar;
    }

    private final boolean zzh() {
        return this.zzi.zzf() == 0;
    }

    private final void zzi() {
        int i;
        InputStream zzbtvVar;
        if (this.zzk) {
            return;
        }
        this.zzk = true;
        loop0: while (this.zzj > 0) {
            try {
                try {
                    if (this.zzh == null) {
                        this.zzh = new zzbme();
                    }
                    i = 0;
                    while (true) {
                        try {
                            int iZzf = this.zzf - this.zzh.zzf();
                            if (iZzf > 0) {
                                if (this.zzi.zzf() == 0) {
                                    if (i <= 0) {
                                        break loop0;
                                    }
                                    this.zza.zzD(i);
                                    if (this.zzp != 2) {
                                        break loop0;
                                    }
                                    this.zzc.zzm(i);
                                    this.zzm += i;
                                    break loop0;
                                }
                                int iMin = Math.min(iZzf, this.zzi.zzf());
                                i += iMin;
                                this.zzh.zze(this.zzi.zzl(iMin));
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (i > 0) {
                                this.zza.zzD(i);
                                if (this.zzp == 2) {
                                    this.zzc.zzm(i);
                                    this.zzm += i;
                                }
                            }
                            throw th;
                        }
                    }
                    if (i > 0) {
                        this.zza.zzD(i);
                        if (this.zzp == 2) {
                            this.zzc.zzm(i);
                            this.zzm += i;
                        }
                    }
                    int i2 = this.zzp;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        int iZzg = this.zzh.zzg();
                        if ((iZzg & 254) != 0) {
                            throw new zzbjy(zzbjv.zzh.zze("gRPC frame header malformed: reserved bits not zero"), null);
                        }
                        this.zzg = 1 == (iZzg & 1);
                        zzbme zzbmeVar = this.zzh;
                        zzbmeVar.zzd(4);
                        int iZzg2 = zzbmeVar.zzg() | (zzbmeVar.zzg() << 24) | (zzbmeVar.zzg() << 16) | (zzbmeVar.zzg() << 8);
                        this.zzf = iZzg2;
                        if (iZzg2 < 0 || iZzg2 > this.zzb) {
                            throw new zzbjy(zzbjv.zzf.zze(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.zzb), Integer.valueOf(this.zzf))), null);
                        }
                        int i4 = this.zzl + 1;
                        this.zzl = i4;
                        this.zzc.zzg(i4);
                        this.zzd.zzd();
                        this.zzp = 2;
                    } else {
                        if (i3 != 1) {
                            String str = i2 != 1 ? "BODY" : "HEADER";
                            StringBuilder sb = new StringBuilder(str.length() + 15);
                            sb.append("Invalid state: ");
                            sb.append(str);
                            throw new AssertionError(sb.toString());
                        }
                        zzbwg zzbwgVar = this.zzc;
                        int i5 = this.zzl;
                        long j = this.zzm;
                        zzbwgVar.zzi(i5, j, true != this.zzg ? j : -1L);
                        this.zzm = 0;
                        if (this.zzg) {
                            zzbgh zzbghVar = this.zze;
                            if (zzbghVar == zzbfs.zza) {
                                throw new zzbjy(zzbjv.zzh.zze("Can't decode compressed gRPC message as compression not configured"), null);
                            }
                            try {
                                zzbtvVar = new zzbsm(zzbghVar.zzc(new zzbtv(this.zzh)), this.zzb, zzbwgVar);
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else {
                            zzbwgVar.zzl(this.zzh.zzf());
                            zzbtvVar = new zzbtv(this.zzh);
                        }
                        this.zzh = null;
                        this.zza.zzn(new zzbsl(zzbtvVar, null));
                        this.zzp = 1;
                        this.zzf = 5;
                        this.zzj--;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
            } catch (Throwable th3) {
                this.zzk = false;
                throw th3;
            }
        }
        if (this.zzn && zzh()) {
            close();
        }
        this.zzk = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzbmk
    public final void close() {
        if (zzg()) {
            return;
        }
        zzbme zzbmeVar = this.zzh;
        boolean z = false;
        if (zzbmeVar != null && zzbmeVar.zzf() > 0) {
            z = true;
        }
        try {
            zzbme zzbmeVar2 = this.zzi;
            if (zzbmeVar2 != null) {
                zzbmeVar2.close();
            }
            zzbme zzbmeVar3 = this.zzh;
            if (zzbmeVar3 != null) {
                zzbmeVar3.close();
            }
            this.zzi = null;
            this.zzh = null;
            this.zza.zzb(z);
        } catch (Throwable th) {
            this.zzi = null;
            this.zzh = null;
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final void zzc(int i) {
        if (zzg()) {
            return;
        }
        this.zzj += (long) i;
        zzi();
    }

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final void zzd(zzbtu zzbtuVar) throws Throwable {
        boolean z;
        if (zzbtuVar == null) {
            throw new NullPointerException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        try {
            if (!zzg() && !this.zzn) {
                this.zzi.zze(zzbtuVar);
                try {
                    zzi();
                    return;
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    if (z) {
                        zzbtuVar.close();
                    }
                    throw th;
                }
            }
            zzbtuVar.close();
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final void zze() {
        if (zzg()) {
            return;
        }
        if (zzh()) {
            close();
        } else {
            this.zzn = true;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final void zzb(zzbgh zzbghVar) {
        if (zzbghVar == null) {
            throw new NullPointerException("Can't pass an empty decompressor");
        }
        this.zze = zzbghVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final void zza(int i) {
        this.zzb = i;
    }

    final void zzf(zzbsk zzbskVar) {
        this.zza = zzbskVar;
    }

    public final boolean zzg() {
        return this.zzi == null;
    }
}
