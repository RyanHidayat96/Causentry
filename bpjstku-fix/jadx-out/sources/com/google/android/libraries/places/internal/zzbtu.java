package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface zzbtu extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean zza();

    void zzb();

    void zzc();

    int zzf();

    int zzg();

    void zzh(int i);

    void zzi(byte[] bArr, int i, int i2);

    void zzj(ByteBuffer byteBuffer);

    void zzk(OutputStream outputStream, int i) throws IOException;

    zzbtu zzl(int i);
}
