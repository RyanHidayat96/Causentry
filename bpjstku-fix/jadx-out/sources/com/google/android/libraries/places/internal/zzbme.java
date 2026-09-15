package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbme extends zzbkn {
    private static final zzbmc zze = new zzblx();
    private static final zzbmc zzf = new zzbly();
    private static final zzbmc zzg = new zzblz();
    private static final zzbmc zzh = new zzbma();
    private static final zzbmd zzi = new zzbmb();
    private final Deque zza;
    private Deque zzb;
    private int zzc;
    private boolean zzd;

    public zzbme() {
        new ArrayDeque(2);
        this.zza = new ArrayDeque();
    }

    private final int zzm(zzbmd zzbmdVar, int i, Object obj, int i2) throws IOException {
        zzd(i);
        Deque deque = this.zza;
        if (!deque.isEmpty()) {
            zzo();
        }
        while (i > 0 && !deque.isEmpty()) {
            zzbtu zzbtuVar = (zzbtu) deque.peek();
            int iMin = Math.min(i, zzbtuVar.zzf());
            i2 = zzbmdVar.zza(zzbtuVar, iMin, obj, i2);
            i -= iMin;
            this.zzc -= iMin;
            zzo();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int zzn(zzbmc zzbmcVar, int i, Object obj, int i2) {
        try {
            return zzm(zzbmcVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void zzo() {
        if (((zzbtu) this.zza.peek()).zzf() == 0) {
            zzp();
        }
    }

    private final void zzp() {
        if (!this.zzd) {
            ((zzbtu) this.zza.remove()).close();
            return;
        }
        Deque deque = this.zzb;
        Deque deque2 = this.zza;
        deque.add((zzbtu) deque2.remove());
        zzbtu zzbtuVar = (zzbtu) deque2.peek();
        if (zzbtuVar != null) {
            zzbtuVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            } else {
                ((zzbtu) deque.remove()).close();
            }
        }
        if (this.zzb != null) {
            while (!this.zzb.isEmpty()) {
                ((zzbtu) this.zzb.remove()).close();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final boolean zza() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!((zzbtu) it.next()).zza()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final void zzc() {
        if (!this.zzd) {
            throw new InvalidMarkException();
        }
        Deque deque = this.zza;
        zzbtu zzbtuVar = (zzbtu) deque.peek();
        if (zzbtuVar != null) {
            int iZzf = zzbtuVar.zzf();
            zzbtuVar.zzc();
            this.zzc += zzbtuVar.zzf() - iZzf;
        }
        while (true) {
            zzbtu zzbtuVar2 = (zzbtu) this.zzb.pollLast();
            if (zzbtuVar2 == null) {
                return;
            }
            zzbtuVar2.zzc();
            deque.addFirst(zzbtuVar2);
            this.zzc += zzbtuVar2.zzf();
        }
    }

    public final void zze(zzbtu zzbtuVar) {
        boolean z = this.zzd && this.zza.isEmpty();
        if (zzbtuVar instanceof zzbme) {
            zzbme zzbmeVar = (zzbme) zzbtuVar;
            while (true) {
                Deque deque = zzbmeVar.zza;
                if (deque.isEmpty()) {
                    break;
                } else {
                    this.zza.add((zzbtu) deque.remove());
                }
            }
            this.zzc += zzbmeVar.zzc;
            zzbmeVar.zzc = 0;
            zzbmeVar.close();
        } else {
            this.zza.add(zzbtuVar);
            this.zzc += zzbtuVar.zzf();
        }
        if (z) {
            ((zzbtu) this.zza.peek()).zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzg() {
        return zzn(zze, 1, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzh(int i) {
        zzn(zzf, i, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzi(byte[] bArr, int i, int i2) {
        zzn(zzg, i2, bArr, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzj(ByteBuffer byteBuffer) {
        zzn(zzh, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzk(OutputStream outputStream, int i) throws IOException {
        zzm(zzi, i, outputStream, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final zzbtu zzl(int i) {
        zzbtu zzbtuVarZzl;
        int i2;
        zzbtu zzbtuVarZzl2;
        if (i <= 0) {
            return zzbtx.zza();
        }
        zzd(i);
        this.zzc -= i;
        zzbtu zzbtuVar = null;
        zzbme zzbmeVar = null;
        while (true) {
            Deque deque = this.zza;
            zzbtu zzbtuVar2 = (zzbtu) deque.peek();
            int iZzf = zzbtuVar2.zzf();
            if (iZzf > i) {
                zzbtuVarZzl2 = zzbtuVar2.zzl(i);
                i2 = 0;
            } else {
                if (this.zzd) {
                    zzbtuVarZzl = zzbtuVar2.zzl(iZzf);
                    zzp();
                } else {
                    zzbtuVarZzl = (zzbtu) deque.poll();
                }
                zzbtu zzbtuVar3 = zzbtuVarZzl;
                i2 = i - iZzf;
                zzbtuVarZzl2 = zzbtuVar3;
            }
            if (zzbtuVar == null) {
                zzbtuVar = zzbtuVarZzl2;
            } else {
                if (zzbmeVar == null) {
                    zzbme zzbmeVar2 = new zzbme(i2 != 0 ? Math.min(deque.size() + 2, 16) : 2);
                    zzbmeVar2.zze(zzbtuVar);
                    zzbtuVar = zzbmeVar2;
                    zzbmeVar = zzbtuVar;
                }
                zzbmeVar.zze(zzbtuVarZzl2);
            }
            if (i2 <= 0) {
                return zzbtuVar;
            }
            i = i2;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final void zzb() {
        if (this.zzb == null) {
            this.zzb = new ArrayDeque(Math.min(this.zza.size(), 16));
        }
        while (!this.zzb.isEmpty()) {
            ((zzbtu) this.zzb.remove()).close();
        }
        this.zzd = true;
        zzbtu zzbtuVar = (zzbtu) this.zza.peek();
        if (zzbtuVar != null) {
            zzbtuVar.zzb();
        }
    }

    public zzbme(int i) {
        new ArrayDeque(2);
        this.zza = new ArrayDeque(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzf() {
        return this.zzc;
    }
}
