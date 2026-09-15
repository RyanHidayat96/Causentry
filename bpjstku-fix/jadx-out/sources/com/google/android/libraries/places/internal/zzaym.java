package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzayl;
import com.google.android.libraries.places.internal.zzaym;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaym<MessageType extends zzaym<MessageType, BuilderType>, BuilderType extends zzayl<MessageType, BuilderType>> implements zzbbl {
    protected int zza = 0;

    protected static void zzbc(Iterable iterable, List list) {
        zzayl.zzv(iterable, list);
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final zzayz zzaY() {
        try {
            int iZzbl = zzbl();
            byte[] bArr = new byte[iZzbl];
            zzazf zzazfVar = new zzazf(bArr, 0, iZzbl);
            zzbz(zzazfVar);
            zzazfVar.zzE();
            return new zzayy(bArr);
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final byte[] zzaZ() {
        try {
            int iZzbl = zzbl();
            byte[] bArr = new byte[iZzbl];
            zzazf zzazfVar = new zzazf(bArr, 0, iZzbl);
            zzbz(zzazfVar);
            zzazfVar.zzE();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final void zzba(OutputStream outputStream) throws IOException {
        int iZzbl = zzbl();
        if (iZzbl > 4096) {
            iZzbl = 4096;
        }
        zzazh zzazhVar = new zzazh(outputStream, iZzbl);
        zzbz(zzazhVar);
        zzazhVar.zzx();
    }

    int zzbb(zzbbz zzbbzVar) {
        throw null;
    }
}
