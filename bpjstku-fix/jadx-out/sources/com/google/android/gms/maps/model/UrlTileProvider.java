package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.ViewPortBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UrlTileProvider implements TileProvider {
    private final int zza;
    private final int zzb;

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        URL tileUrl = getTileUrl(i, i2, i3);
        if (tileUrl == null) {
            return NO_TILE;
        }
        try {
            com.google.android.gms.internal.maps.zzh.zzb(4352);
            int i4 = this.zza;
            int i5 = this.zzb;
            int i6 = com.google.android.gms.internal.maps.zze.zzb;
            URLConnection uRLConnectionOpenConnection = tileUrl.openConnection();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
            InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(uRLConnectionOpenConnection);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Preconditions.checkNotNull(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2, "from must not be null.");
            Preconditions.checkNotNull(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int i7 = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2.read(bArr);
                if (i7 == -1) {
                    return new Tile(i4, i5, byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i7);
            }
        } catch (IOException unused) {
            return null;
        } finally {
            com.google.android.gms.internal.maps.zzh.zza();
        }
    }

    public abstract URL getTileUrl(int i, int i2, int i3);

    public UrlTileProvider(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }
}
