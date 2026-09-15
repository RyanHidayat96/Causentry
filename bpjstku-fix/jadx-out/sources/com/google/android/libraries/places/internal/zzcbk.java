package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public interface zzcbk extends WritableByteChannel, zzcbx {
    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    void flush() throws IOException;

    zzcbk zzH(String str) throws IOException;

    zzcbk zzI(byte[] bArr) throws IOException;

    zzcbk zzJ(int i) throws IOException;

    zzcbk zzK(int i) throws IOException;

    zzcbk zzL(int i) throws IOException;
}
