package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbp {
    public static final zzcbl zzc(zzcbz zzcbzVar) {
        Intrinsics.checkNotNullParameter(zzcbzVar, "");
        return new zzcbt(zzcbzVar);
    }

    public static final zzcbk zzd(zzcbx zzcbxVar) {
        Intrinsics.checkNotNullParameter(zzcbxVar, "");
        return new zzcbs(zzcbxVar);
    }

    public static final zzcbx zza(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "");
        zzcby zzcbyVar = new zzcby(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        zzcbr zzcbrVar = new zzcbr(outputStream, zzcbyVar);
        Intrinsics.checkNotNullParameter(zzcbrVar, "");
        return new zzcbg(zzcbyVar, zzcbrVar);
    }

    public static final zzcbz zzb(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "");
        zzcby zzcbyVar = new zzcby(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "");
        zzcbo zzcboVar = new zzcbo(inputStream, zzcbyVar);
        Intrinsics.checkNotNullParameter(zzcboVar, "");
        return new zzcbh(zzcbyVar, zzcboVar);
    }
}
