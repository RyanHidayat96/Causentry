package defpackage;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class fastForward {
    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap bitmap) {
        int i;
        if (bitmap.isRecycled()) {
            StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
            sb.append(bitmap);
            sb.append(" [");
            sb.append(bitmap.getWidth());
            sb.append(" x ");
            sb.append(bitmap.getHeight());
            sb.append("] + ");
            sb.append(bitmap.getConfig());
            throw new IllegalStateException(sb.toString().toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int width = bitmap.getWidth() * bitmap.getHeight();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i = 2;
            } else {
                i = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
            }
            return width * i;
        }
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static final Bitmap.Config TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }
}
