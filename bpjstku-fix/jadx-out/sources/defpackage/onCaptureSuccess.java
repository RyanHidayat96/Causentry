package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.lang.reflect.Field;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class onCaptureSuccess extends CaptureBundlesCaptureBundleImpl {
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(TuitionPaymentFragmentbindingInflater1);

    @Override // defpackage.CaptureBundlesCaptureBundleImpl
    protected final Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 40, (ViewConfiguration.getTapTimeout() >> 16) + 19, 1513912262, false, "b", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37835), 59 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 18 - View.MeasureSpec.getMode(0), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 37836), 58 - TextUtils.lastIndexOf("", '0', 0, 0), 18 - (Process.myTid() >> 22), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -721;
        long j3 = i;
        long j4 = -1;
        long j5 = j4 ^ 1488346874515331828L;
        long j6 = j4 ^ 4030906622644454411L;
        long j7 = 4032880832312942335L ^ j4;
        long j8 = (j2 * 1488346874515331828L) + (j2 * 4030906622644454411L) + (((long) 1444) * ((j3 ^ j4) | ((j5 | j6) ^ j4) | j7)) + (((long) (-1444)) * (j7 | ((j3 | 1488346874515331828L) ^ j4) | ((j3 | 4030906622644454411L) ^ j4))) + (((long) 722) * ((j4 ^ (j6 | 1488346874515331828L)) | ((j5 | 4030906622644454411L) ^ j4)));
        int i6 = 0;
        while (true) {
            for (int i7 = 0; i7 != 8; i7++) {
                i5 = (((((int) (j >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
            }
            if (i6 != 0) {
                break;
            }
            i6++;
            j = j8;
        }
        if (i5 != i3) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - Color.red(0)), 40 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            int[] iArr = new int[i4];
            int i8 = i4 - 1;
            iArr[i8] = 1;
            Toast.makeText((Context) null, iArr[((i4 * i8) % 2) - 1], 1).show();
        }
        return ExperimentalCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmapPool, bitmap, i, i2);
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        return obj instanceof onCaptureSuccess;
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterCrop".hashCode();
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }
}
