package id.vida.liveness.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.C0772w0;
import id.vida.liveness.config.VidaUICustomizationOption;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: loaded from: classes7.dex */
public class ProgressOverlayView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f1181a;
    public RectF b;
    public int c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1182e;
    public VidaUICustomizationOption f;
    public float g;
    public float h;
    public ValueAnimator i;
    public long j;
    public C0772w0 k;

    private static native Object[] $liveness$B078923aa(Context context, AttributeSet attributeSet);

    private static native Object[] $liveness$B7f4c4fc5(Context context, AttributeSet attributeSet, int i);

    private static native Object[] $liveness$Bb237ce90(Context context);

    private static /* synthetic */ ValueAnimator.AnimatorUpdateListener $liveness$C0bc17ba7(final ProgressOverlayView progressOverlayView) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: id.vida.liveness.ui.ProgressOverlayView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.a(valueAnimator);
            }
        };
    }

    private static native void $liveness$E078923aa(Object obj, Object obj2);

    private static native void $liveness$E7f4c4fc5(Object obj, Object obj2);

    private static native void $liveness$Eb237ce90(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public ProgressOverlayView(Context context) {
        Object[] objArr$liveness$Bb237ce90 = $liveness$Bb237ce90(context);
        super((Context) objArr$liveness$Bb237ce90[3]);
        $liveness$Eb237ce90(this, objArr$liveness$Bb237ce90);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProgressOverlayView(Context context, AttributeSet attributeSet) {
        Object[] objArr$liveness$B078923aa = $liveness$B078923aa(context, attributeSet);
        super((Context) objArr$liveness$B078923aa[3], (AttributeSet) objArr$liveness$B078923aa[4]);
        $liveness$E078923aa(this, objArr$liveness$B078923aa);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProgressOverlayView(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr$liveness$B7f4c4fc5 = $liveness$B7f4c4fc5(context, attributeSet, i);
        super((Context) objArr$liveness$B7f4c4fc5[1], (AttributeSet) objArr$liveness$B7f4c4fc5[2], ((Value) objArr$liveness$B7f4c4fc5[3]).i);
        $liveness$E7f4c4fc5(this, objArr$liveness$B7f4c4fc5);
    }

    public final native /* synthetic */ void a(ValueAnimator valueAnimator);

    public final native void a(Context context);

    public final native void a(Canvas canvas);

    public native int getDisplayedProgress();

    @Override // android.view.View
    public native void onDraw(Canvas canvas);

    public native void setProgress(int i);

    static {
        Object[] objArr;
        ClassLoader classLoader = ProgressOverlayView.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1558 - TextUtils.indexOf((CharSequence) "", '0'), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1346230128, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1346230128};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - KeyEvent.keyCodeFromString("")), 3112 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 22 - Color.blue(0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getMaxKeyCode() >> 16), 518 - ExpandableListView.getPackedPositionType(0L), Color.blue(0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~((int) Process.getElapsedCpuTime());
                int i7 = i3 + (((1511855794 + (((~(i6 | (-1629094489))) | (~((-67404933) | i6))) * (-184))) + (((4266019 | (~((-71670952) | i6))) | (~((-1633360508) | i6))) * 184)) - 591771832);
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr4[3];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i10 = ((int[]) objArr4[0])[0];
                int i11 = ((int[]) objArr4[2])[0];
                int i12 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt();
                int i13 = ~iNextInt;
                int i14 = i10 + (-498553052) + ((1570679807 | i13) * (-369)) + (((~((-143559668) | i13)) | 1561471791) * (-369)) + (((~(iNextInt | 143559667)) | 1427120140 | (~(i13 | (-9208017)))) * 369);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(ProgressOverlayView.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((((i17 * i17) - (~(-(1626522993 * i17)))) - 1) - (~(-(i17 * 445838541)))) - 1;
                int i19 = (i18 & (-1476752959)) + ((-1476752959) | i18);
                int i20 = ((i19 >> 25) - 255) / 128;
                int i21 = (i20 ^ 1) + ((i20 & 1) << 1);
                int i22 = (i19 & i21) + (i21 | i19);
                int i23 = i19 >> 21;
                int i24 = ((i23 & (-4095)) + (i23 | (-4095))) / 2048;
                int i25 = -(i22 ^ ((i24 & 1) + (i24 | 1)));
                int i26 = ((i25 | 6) << 1) - (i25 ^ 6);
                int i27 = ((i26 >> 18) - 32767) / 16384;
                int i28 = (i27 ^ 1) + ((i27 & 1) << 1);
                Loader.l(((-2030454684) / (((-((i28 ^ 1) + ((i28 & 1) << 1))) & i26) * 2)) - 513567454);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } catch (Throwable th) {
            Throwable cause2 = th.getCause();
            if (cause2 == null) {
                throw th;
            }
            throw cause2;
        }
    }
}
