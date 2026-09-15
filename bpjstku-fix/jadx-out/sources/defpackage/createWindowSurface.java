package defpackage;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes4.dex */
public final class createWindowSurface {
    public static int b(TelephonyManager telephonyManager) {
        try {
            return telephonyManager.getDataNetworkType();
        } catch (SecurityException unused) {
            return 0;
        }
    }
}
