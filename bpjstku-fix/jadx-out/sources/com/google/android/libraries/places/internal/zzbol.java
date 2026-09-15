package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.isCameraClosing;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbol extends zzbjg {
    private static final boolean zza = zzbhi.zza(zzbol.class.getClassLoader());

    @Override // com.google.android.libraries.places.internal.zzbja
    public final zzbjf zza(URI uri, zzbiy zzbiyVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            throw new NullPointerException("targetPath");
        }
        if (!path.startsWith("/")) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("the path component (%s) of the target (%s) must start with '/'", path, uri));
        }
        return new zzbok(uri.getAuthority(), path.substring(1), zzbiyVar, zzbpf.zzm, isCameraClosing.TuitionPaymentFragmentbindingInflater1(), zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbjg
    protected final boolean zzc() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbjg
    public final int zzd() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.zzbjg
    public final Collection zze() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // com.google.android.libraries.places.internal.zzbja
    public final String zzb() {
        return "dns";
    }
}
