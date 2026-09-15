package com.google.android.libraries.places.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.midtrans.sdk.corekit.core.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzg {
    private static final zzcbn zza = zzcbm.zza(":");
    private static final zzbzd[] zzb = {new zzbzd(zzbzd.zze, zzcbm.zza("")), new zzbzd(zzbzd.zzb, zzcbm.zza(ShareTarget.METHOD_GET)), new zzbzd(zzbzd.zzb, zzcbm.zza(ShareTarget.METHOD_POST)), new zzbzd(zzbzd.zzc, zzcbm.zza("/")), new zzbzd(zzbzd.zzc, zzcbm.zza("/index.html")), new zzbzd(zzbzd.zzd, zzcbm.zza("http")), new zzbzd(zzbzd.zzd, zzcbm.zza("https")), new zzbzd(zzbzd.zza, zzcbm.zza(Constants.STATUS_CODE_200)), new zzbzd(zzbzd.zza, zzcbm.zza("204")), new zzbzd(zzbzd.zza, zzcbm.zza("206")), new zzbzd(zzbzd.zza, zzcbm.zza("304")), new zzbzd(zzbzd.zza, zzcbm.zza(Constants.STATUS_CODE_400)), new zzbzd(zzbzd.zza, zzcbm.zza("404")), new zzbzd(zzbzd.zza, zzcbm.zza("500")), new zzbzd("accept-charset", ""), new zzbzd("accept-encoding", "gzip, deflate"), new zzbzd("accept-language", ""), new zzbzd("accept-ranges", ""), new zzbzd("accept", ""), new zzbzd("access-control-allow-origin", ""), new zzbzd("age", ""), new zzbzd("allow", ""), new zzbzd("authorization", ""), new zzbzd("cache-control", ""), new zzbzd("content-disposition", ""), new zzbzd("content-encoding", ""), new zzbzd("content-language", ""), new zzbzd("content-length", ""), new zzbzd("content-location", ""), new zzbzd("content-range", ""), new zzbzd("content-type", ""), new zzbzd("cookie", ""), new zzbzd("date", ""), new zzbzd("etag", ""), new zzbzd("expect", ""), new zzbzd("expires", ""), new zzbzd("from", ""), new zzbzd("host", ""), new zzbzd("if-match", ""), new zzbzd("if-modified-since", ""), new zzbzd("if-none-match", ""), new zzbzd("if-range", ""), new zzbzd("if-unmodified-since", ""), new zzbzd("last-modified", ""), new zzbzd(DynamicLink.Builder.KEY_LINK, ""), new zzbzd(FirebaseAnalytics.Param.LOCATION, ""), new zzbzd("max-forwards", ""), new zzbzd("proxy-authenticate", ""), new zzbzd("proxy-authorization", ""), new zzbzd("range", ""), new zzbzd("referer", ""), new zzbzd("refresh", ""), new zzbzd("retry-after", ""), new zzbzd("server", ""), new zzbzd("set-cookie", ""), new zzbzd("strict-transport-security", ""), new zzbzd("transfer-encoding", ""), new zzbzd("user-agent", ""), new zzbzd("vary", ""), new zzbzd("via", ""), new zzbzd("www-authenticate", "")};
    private static final Map zzc;

    static /* synthetic */ zzcbn zza(zzcbn zzcbnVar) throws IOException {
        int iZzj = zzcbnVar.zzj();
        for (int i = 0; i < iZzj; i++) {
            byte bZzi = zzcbnVar.zzi(i);
            if (bZzi >= 65 && bZzi <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(zzcbnVar.zze()));
            }
        }
        return zzcbnVar;
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i = 0;
        while (true) {
            zzbzd[] zzbzdVarArr = zzb;
            int length = zzbzdVarArr.length;
            if (i >= 61) {
                zzc = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(zzbzdVarArr[i].zzf)) {
                    linkedHashMap.put(zzbzdVarArr[i].zzf, Integer.valueOf(i));
                }
                i++;
            }
        }
    }
}
