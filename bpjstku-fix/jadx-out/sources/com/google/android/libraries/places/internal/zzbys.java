package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
final class zzbys extends zzbyv {
    private final Method zzb;
    private final Method zzc;

    /* synthetic */ zzbys(Provider provider, Method method, Method method2, byte[] bArr) {
        super(provider);
        this.zzb = method;
        this.zzc = method2;
    }

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final void zza(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbyw zzbywVar = (zzbyw) it.next();
            if (zzbywVar != zzbyw.HTTP_1_0) {
                arrayList.add(zzbywVar.toString());
            }
        }
        try {
            this.zzb.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final String zzb(SSLSocket sSLSocket) {
        try {
            return (String) this.zzc.invoke(sSLSocket, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final int zzc() {
        return 1;
    }
}
