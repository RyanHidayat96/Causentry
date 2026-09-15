package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import defpackage.setVideoStabilization;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfh {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = TimeUnit.MINUTES.toMicros(1);
    private final zzdy zzc;
    private final Context zzd;

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    public final ImmutableList zza(String str) {
        boolean z;
        WifiManager wifiManager = (WifiManager) this.zzd.getSystemService("wifi");
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            return ImmutableList.asInterface();
        }
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (scanResults == null || scanResults.isEmpty()) {
            return ImmutableList.asInterface();
        }
        ImmutableList immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setVideoStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzfg.zza), scanResults);
        ArrayList arrayList = new ArrayList();
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        int size = immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
        for (int i = 0; i < size; i++) {
            ScanResult scanResult = (ScanResult) immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i);
            if (scanResult != null && !TextUtils.isEmpty(scanResult.SSID)) {
                long jZzb = this.zzc.zzb();
                long j = scanResult.timestamp;
                long j2 = zzb;
                String str2 = scanResult.SSID;
                if (str2 == null) {
                    throw new IllegalArgumentException("Null SSID.");
                }
                if (str2.indexOf(95) < 0) {
                    z = false;
                } else {
                    String lowerCase = str2.toLowerCase(Locale.ENGLISH);
                    z = true;
                    if (!lowerCase.contains("_nomap") && !lowerCase.contains("_optout")) {
                        z = false;
                    }
                }
                if ((jZzb * 1000) - j <= j2 && !z) {
                    arrayList.add(new zzff(connectionInfo, scanResult));
                }
            }
        }
        return ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList);
    }

    zzfh(Context context, zzdy zzdyVar) {
        this.zzd = context;
        this.zzc = zzdyVar;
    }
}
