package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class onSetRepeatMode {
    private static PointF b = new PointF();

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static float TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static double b(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static boolean b(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF b(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void b(MediaControllerCompatApi23 mediaControllerCompatApi23, Path path) {
        path.reset();
        PointF pointF = mediaControllerCompatApi23.TuitionPaymentFragmentbindingInflater1;
        path.moveTo(pointF.x, pointF.y);
        b.set(pointF.x, pointF.y);
        for (int i = 0; i < mediaControllerCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size(); i++) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = mediaControllerCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i);
            PointF pointF2 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.b;
            PointF pointF3 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            PointF pointF4 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.TuitionPaymentFragmentbindingInflater1;
            if (pointF2.equals(b) && pointF3.equals(pointF4)) {
                path.lineTo(pointF4.x, pointF4.y);
            } else {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            }
            b.set(pointF4.x, pointF4.y);
        }
        if (mediaControllerCompatApi23.b) {
            path.close();
        }
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static float TuitionPaymentFragmentbindingInflater1(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2, getMediaController getmediacontroller) {
        if (mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getmediacontroller.b(), i)) {
            String strB = getmediacontroller.b();
            MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo3 = new MediaControllerCompatPlaybackInfo(mediaControllerCompatPlaybackInfo2);
            mediaControllerCompatPlaybackInfo3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(strB);
            MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo4 = new MediaControllerCompatPlaybackInfo(mediaControllerCompatPlaybackInfo3);
            mediaControllerCompatPlaybackInfo4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getmediacontroller;
            list.add(mediaControllerCompatPlaybackInfo4);
        }
    }

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i % i2 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }
}
