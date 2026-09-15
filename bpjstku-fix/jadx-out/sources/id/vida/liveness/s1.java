package id.vida.liveness;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import defpackage.initSession;
import id.vida.liveness.listeners.VidaTutorialDialogEventListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public class s1 extends BottomSheetDialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VidaTutorialDialogEventListener f1165a;

    private static /* synthetic */ DialogInterface.OnShowListener $liveness$C3ba63ccb() {
        return new DialogInterface.OnShowListener() { // from class: id.vida.liveness.s1$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                s1.a(dialogInterface);
            }
        };
    }

    public static native /* synthetic */ void a(DialogInterface dialogInterface);

    @Override // androidx.fragment.app.DialogFragment
    public native int getTheme();

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public native Dialog onCreateDialog(Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public native void onViewCreated(View view, Bundle bundle);

    public native void setListener(VidaTutorialDialogEventListener vidaTutorialDialogEventListener);

    static {
        Object[] objArr;
        ClassLoader classLoader = s1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-16773802) - Color.rgb(0, 0, 0)), 1558 - ((byte) KeyEvent.getModifierMetaStateMask()), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 206308714, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 206308714};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.green(0) + 43042), 3111 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), ImageFormat.getBitsPerPixel(0) + 519, 76 - (ViewConfiguration.getTapTimeout() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i4};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i6 = ~((-1120532603) | startElapsedRealtime);
                int i7 = ~startElapsedRealtime;
                int i8 = i3 + 291400238 + ((i6 | (~(1658846970 | i7))) * (-406)) + ((~((-1074348115) | i7)) * (-406)) + (((~(startElapsedRealtime | (-584498857))) | (~(1120532602 | i7))) * 406);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                objArr = new Object[]{new int[1], new int[]{i5}, iArr, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr4[3];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i11 = ((int[]) objArr4[0])[0];
                int i12 = ((int[]) objArr4[2])[0];
                int i13 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr2 = {i12};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i14 = ~((-759813723) | iUptimeMillis);
                int i15 = ~iUptimeMillis;
                int i16 = i11 + 1603527346 + ((i14 | (~(945217736 | i15))) * (-1808)) + (((~((-675332169) | iUptimeMillis)) | (~(i15 | 1029699290))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iUptimeMillis | (-945217737))) | 84481554 | (~(759813722 | i15))) * TypedValues.Custom.TYPE_BOOLEAN);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(s1.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i19 = ((int[]) objArr[0])[0];
                int i20 = i19 * i19;
                int i21 = -(1115435702 * i19);
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                int i23 = -(i19 * (-723813880));
                int i24 = ((i22 ^ i23) + ((i23 & i22) << 1)) - (-1080883009);
                int i25 = i24 >> 22;
                int i26 = ((i25 & (-2047)) + (i25 | (-2047))) / 1024;
                int i27 = (i26 ^ 1) + ((i26 & 1) << 1);
                int i28 = -(((((i24 >> 28) - 31) / 16) + 1) ^ (((i24 | i27) << 1) - (i27 ^ i24)));
                int i29 = (i28 ^ 1) + ((i28 & 1) << 1);
                int i30 = ((i29 >> 28) - 31) / 16;
                int i31 = (i30 ^ 1) + ((i30 & 1) << 1);
                Loader.l((1012817922 / (((-((i31 ^ 1) + ((i31 & 1) << 1))) & i29) * 6)) + 219173538);
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
