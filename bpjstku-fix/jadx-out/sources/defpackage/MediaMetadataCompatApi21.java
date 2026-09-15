package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompatApi21 {
    public static final MediaMetadataCompatLongKey TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, MediaMetadataCompatLongKey.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, getVolumeAttributes getvolumeattributes) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !getLaunchPendingIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new MediaMetadataCompatTextKey();
        }
        try {
            return new fromRating(connectivityManager, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } catch (Exception e2) {
            if (getvolumeattributes != null) {
                new RuntimeException("Failed to register network observer.", e2);
            }
            return new MediaMetadataCompatTextKey();
        }
    }
}
