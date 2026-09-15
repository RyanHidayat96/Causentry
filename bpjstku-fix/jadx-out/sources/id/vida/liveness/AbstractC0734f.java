package id.vida.liveness;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: renamed from: id.vida.liveness.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0734f extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f1124a;
    public final TypedValue b;
    public Paint c;

    private static native Object[] $liveness$B100bf854(Context context, AttributeSet attributeSet, int i);

    private static native Object[] $liveness$B42f7771f(Context context);

    private static native Object[] $liveness$B9848cc39(Context context, AttributeSet attributeSet);

    private static native void $liveness$E100bf854(Object obj, Object obj2);

    private static native void $liveness$E42f7771f(Object obj, Object obj2);

    private static native void $liveness$E9848cc39(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0734f(Context context) {
        Object[] objArr$liveness$B42f7771f = $liveness$B42f7771f(context);
        super((Context) objArr$liveness$B42f7771f[2]);
        $liveness$E42f7771f(this, objArr$liveness$B42f7771f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0734f(Context context, AttributeSet attributeSet) {
        Object[] objArr$liveness$B9848cc39 = $liveness$B9848cc39(context, attributeSet);
        super((Context) objArr$liveness$B9848cc39[1], (AttributeSet) objArr$liveness$B9848cc39[2]);
        $liveness$E9848cc39(this, objArr$liveness$B9848cc39);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0734f(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr$liveness$B100bf854 = $liveness$B100bf854(context, attributeSet, i);
        super((Context) objArr$liveness$B100bf854[1], (AttributeSet) objArr$liveness$B100bf854[2], ((Value) objArr$liveness$B100bf854[3]).i);
        $liveness$E100bf854(this, objArr$liveness$B100bf854);
    }

    public final native void a(Context context);

    public abstract void buildPath(Path path, int i, int i2);

    public abstract Rect getMaskBounds();

    @Override // android.view.View
    public native void onDraw(Canvas canvas);

    static {
        Object[] objArr;
        ClassLoader classLoader = AbstractC0734f.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3414), ((byte) KeyEvent.getModifierMetaStateMask()) + 1560, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 2145181868, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 2145181868};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - Drawable.resolveOpacity(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 3112, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 518 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i6 = ~iFreeMemory;
                int i7 = i3 + (-1796411576) + (((~((-375864547) | i6)) | (~((-1329166913) | i6))) * (-867)) + (((~((-375864547) | iFreeMemory)) | 102840384 | (~((-1329166913) | iFreeMemory))) * (-1734)) + (((~(iFreeMemory | (-1226326529))) | (~(i6 | (-102840385))) | (~((-273024163) | iFreeMemory))) * 867);
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
                int[] iArr = {i12};
                int iMyPid = Process.myPid();
                int i13 = (-1932239678) + ((~(iMyPid | 158094399)) * 216);
                int i14 = ~iMyPid;
                int i15 = i10 + i13 + (((-1410343617) | i14) * (-216)) + (((~(i14 | 158094399)) | 1546937059) * 216);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(AbstractC0734f.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i18 = ((int[]) objArr[0])[0];
                int i19 = i18 * i18;
                int i20 = -(404208683 * i18);
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                int i22 = -(i18 * (-1574673479));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                int i24 = (i23 & (-1850326844)) + ((-1850326844) | i23);
                int i25 = ((i24 >> 22) - 2047) / 1024;
                int i26 = (i25 & 1) + (i25 | 1);
                int i27 = ((i24 | i26) << 1) - (i26 ^ i24);
                int i28 = i24 >> 16;
                int i29 = ((i28 & (-131071)) + (i28 | (-131071))) / 65536;
                int i30 = (-(i27 ^ (((i29 | 1) << 1) - (i29 ^ 1)))) + 2;
                int i31 = i30 >> 23;
                int i32 = ((i31 ^ (-1023)) + ((i31 & (-1023)) << 1)) / 512;
                int i33 = (i32 ^ 1) + ((i32 & 1) << 1);
                Loader.l((615202860 / ((i30 & (-((i33 ^ 1) + ((i33 & 1) << 1)))) * 2)) + 372246595);
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
