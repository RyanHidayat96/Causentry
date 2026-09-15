package defpackage;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;

/* JADX INFO: loaded from: classes4.dex */
public final class CaptureNode {
    static {
        String str = SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Deprecated
    public static DisplayMetrics TuitionPaymentFragmentspecialinlinedviewModeldefault2(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    @Deprecated
    public static Point TuitionPaymentFragmentspecialinlinedviewModeldefault1(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
