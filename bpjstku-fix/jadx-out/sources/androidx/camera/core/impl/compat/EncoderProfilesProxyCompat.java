package androidx.camera.core.impl.compat;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* JADX INFO: loaded from: classes5.dex */
public final class EncoderProfilesProxyCompat {
    private static final String TAG = "EncoderProfilesProxyCompat";

    public static EncoderProfilesProxy from(EncoderProfiles encoderProfiles) {
        if (Build.VERSION.SDK_INT >= 33) {
            return EncoderProfilesProxyCompatApi33Impl.from(encoderProfiles);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return EncoderProfilesProxyCompatApi31Impl.from(encoderProfiles);
        }
        StringBuilder sb = new StringBuilder("Unable to call from(EncoderProfiles) on API ");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(". Version 31 or higher required.");
        throw new RuntimeException(sb.toString());
    }

    public static EncoderProfilesProxy from(CamcorderProfile camcorderProfile) {
        if (Build.VERSION.SDK_INT >= 31) {
            StringBuilder sb = new StringBuilder("Should use from(EncoderProfiles) on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("instead. CamcorderProfile is deprecated on API 31.");
            Logger.w(TAG, sb.toString());
        }
        return EncoderProfilesProxyCompatBaseImpl.from(camcorderProfile);
    }

    private EncoderProfilesProxyCompat() {
    }
}
