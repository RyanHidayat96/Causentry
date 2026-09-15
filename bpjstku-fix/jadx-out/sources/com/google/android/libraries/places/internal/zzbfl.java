package com.google.android.libraries.places.internal;

import com.appsflyer.AppsFlyerProperties;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfl {
    public static int b = 1445868757;

    public static zzbfe zza(zzbfe zzbfeVar, List list) {
        if (zzbfeVar == null) {
            throw new NullPointerException(AppsFlyerProperties.CHANNEL);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbfeVar = new zzbfk(zzbfeVar, (zzbfj) it.next(), null);
        }
        return zzbfeVar;
    }
}
