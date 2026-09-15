package com.midtrans.sdk.uikit.abstracts;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import com.akexorcist.localizationactivity.ui.LocalizationActivity;
import com.bpjstku.R;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.google.android.libraries.places.internal.zzpu;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.UIKitCustomSetting;
import com.midtrans.sdk.corekit.core.themes.BaseColorTheme;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.OptionsBundle;
import defpackage.calculateInvertedTextureTransform;
import defpackage.getCameraSupportedResolutions;
import defpackage.getHumanReadableName;
import defpackage.getRccTransportControlFlagsFromActions;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.setSessionImpl;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseActivity extends LocalizationActivity implements getCameraSupportedResolutions {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "BaseActivity";
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f849a;
    private volatile MidtransSDK asBinder;
    private DefaultTextView asInterface;
    private ImageView d;
    private static final byte[] $$s = {60, 80, 13, 34, 9, 26, -23, 40, 11, 16, -28, 35, 20, 18, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$t = 90;
    private static final byte[] $$d = {94, -56, 58, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 33;
    private static int notify = 0;
    private static int cancel = 1;
    private static long cancelAll = 3522219023517651362L;
    public int b = 0;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private int g = 0;
    public boolean TuitionPaymentFragmentbindingInflater1 = false;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i5));
        int i12 = i8 | i2;
        int i13 = ~(i12 | i);
        int i14 = (~(i5 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i2 + i + i3 + (1650861130 * i4) + ((-924421097) * i6);
        int i16 = i15 * i15;
        int i17 = (i2 * (-405912681)) + 1474035712 + ((-405912681) * i) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i3) + (986710016 * i4) + ((-948436992) * i6) + ((-1864630272) * i16);
        int i18 = ((i2 * (-959335331)) - 587927435) + (i * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i3 * (-959334869)) + (i4 * 22983790) + (i6 * 637852125) + (i16 * (-1124859904));
        if (i17 + (i18 * i18 * (-1807482880)) != 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[1];
        int i19 = 2 % 2;
        int i20 = cancel + 69;
        notify = i20 % 128;
        int i21 = i20 % 2;
        int i22 = baseActivity.g;
        if (i22 != 0) {
            appCompatEditText.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{i22}));
            int i23 = notify + 83;
            cancel = i23 % 128;
            int i24 = i23 % 2;
        }
        return null;
    }

    public static /* synthetic */ DefaultTextView TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = notify + 91;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        DefaultTextView defaultTextView = baseActivity.asInterface;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 17;
        notify = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return defaultTextView;
    }

    public static /* synthetic */ LinearLayout b(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = notify + 9;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = baseActivity.f849a;
        int i5 = i3 + 67;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = com.midtrans.sdk.uikit.abstracts.BaseActivity.$$d
            int r7 = r7 + 4
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.abstracts.BaseActivity.h(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void j(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.abstracts.BaseActivity.$$s
            int r6 = r6 * 42
            int r1 = 53 - r6
            int r7 = r7 * 19
            int r7 = 103 - r7
            int r5 = r5 * 10
            int r5 = 14 - r5
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r5
            r7 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2b:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.abstracts.BaseActivity.j(int, short, int, java.lang.Object[]):void");
    }

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    @Override // com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        new setSessionImpl();
        setSessionImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, j_().getLanguageCode(), j_().getLanguageCode().equals("id") ? "ID" : "US");
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(getRccTransportControlFlagsFromActions.INSTANCE.b(context));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
            byte[] bArr = $$d;
            byte b = bArr[5];
            short s = bArr[28];
            Object[] objArr2 = new Object[1];
            h(b, s, (byte) (s & 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iNormalizeMetaState, iMakeMeasureSpec, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cAlpha = (char) (29944 - Color.alpha(0));
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                byte[] bArr2 = $$d;
                Object[] objArr3 = new Object[1];
                h(bArr2[5], (short) ($$e + 3), bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, longPressTimeout, modifierMetaStateMask, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i2 = (int) Runtime.getRuntime().totalMemory();
            int i3 = ~i2;
            int i4 = ((((-1492189655) + (((~(i3 | 220169090)) | ((~(7566664 | i3)) | (-226490315))) * 464)) + (((-218923651) | i2) * (-464))) + (((~(i2 | 220169090)) | (-226490315)) * 464)) - 1684492872;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            i(new char[]{14547, 34199, 16977, 3893, 52651, 35422, 22274, 5630, 53926, 40784, 24060, 6821, 59262, 42446, 25230, 12149}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 48452, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            i(new char[]{14544, 48420, 13102, 43324, 12073, 42253, 6939, 37135, 5945, 36121, 880, 63842, 32598, 62835, 27459, 57675}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 34286, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-699819403};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - Color.green(0)), 1727 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1684492872, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                    int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                    byte[] bArr3 = $$d;
                    Object[] objArr8 = new Object[1];
                    h(bArr3[5], (short) ($$e + 3), bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, scrollBarSize, i7, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    i(new char[]{14552, 62806, 41951, 20552, 3794, 15189, 59867, 42512, 21726, 323, 16285, 60513, 39628, 22343, 1475, 12883, 57540, 40299, 19399, 30789, 14030, 58183}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step3).substring(17, 18).codePointAt(0) + 52499, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    i(new char[]{14556, 550, 19774, 34832, 54022, 7779, 22895, 42062, 61252, 10835, 30123, 45244, 64436, 50819, 406}, 15091 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int iIndexOf = 23 - TextUtils.indexOf("", "", 0, 0);
                        byte[] bArr4 = $$d;
                        Object[] objArr11 = new Object[1];
                        h(bArr4[5], (short) 88, bArr4[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, iLastIndexOf, iIndexOf, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                        byte[] bArr5 = $$d;
                        byte b2 = bArr5[5];
                        short s2 = bArr5[28];
                        Object[] objArr12 = new Object[1];
                        h(b2, s2, (byte) (s2 & 15), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, maximumDrawingCacheSize, pressedStateDuration2, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i11 = ~iFreeMemory;
            int i12 = i10 + 956424961 + (((~((-31730812) | i11)) | 8398897) * 184) + ((iFreeMemory | (-267665152)) * (-184)) + ((~((-244333238) | i11)) * 184);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr13[3])[0] = i14 ^ (i14 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                int i15 = cancel + 119;
                notify = i15 % 128;
                int i16 = i15 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i9];
            int i17 = i9 - 1;
            iArr[i17] = 1;
            Toast.makeText((Context) null, iArr[((i9 * i17) % 2) - 1], 1).show();
            int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int i19 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode | 160405897);
            int i20 = i18 + (((177466681 | i19) * (-658)) - 289257637) + ((i19 | 34628656) * 658);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr14[3])[0] = i22 ^ (i22 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iRgb = (-16776185) - Color.rgb(0, 0, 0);
            int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
            byte[] bArr6 = $$d;
            Object[] objArr15 = new Object[1];
            h(bArr6[5], (short) 140, bArr6[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop, iRgb, longPressTimeout2, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        i(new char[]{14552, 62806, 41951, 20552, 3794, 15189, 59867, 42512, 21726, 323, 16285, 60513, 39628, 22343, 1475, 12883, 57540, 40299, 19399, 30789, 14030, 58183}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 52573, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        i(new char[]{14556, 550, 19774, 34832, 54022, 7779, 22895, 42062, 61252, 10835, 30123, 45244, 64436, 50819, 406}, 15090 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 1031;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
            byte[] bArr7 = $$d;
            Object[] objArr18 = new Object[1];
            h(bArr7[5], (short) ($$e + 3), bArr7[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, iNormalizeMetaState2, iResolveOpacity, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i23 = cancel + 99;
            notify = i23 % 128;
            int i24 = i23 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int edgeSlop = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i25 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b3 = $$d[7];
                Object[] objArr19 = new Object[1];
                h(b3, (short) (b3 | 192), (byte) 52, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, edgeSlop, i25, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr20[3])[0];
            int i27 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i28 = (int) Runtime.getRuntime().totalMemory();
            int i29 = (((((~(245973993 | i28)) | (-328330427)) * 398) + 1616903393) + (((~((~i28) | 245973993)) | (-328330427)) * 398)) - 750839647;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr[2])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            i(new char[]{14547, 34199, 16977, 3893, 52651, 35422, 22274, 5630, 53926, 40784, 24060, 6821, 59262, 42446, 25230, 12149}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 48462, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            i(new char[]{14544, 48420, 13102, 43324, 12073, 42253, 6939, 37135, 5945, 36121, 880, 63842, 32598, 62835, 27459, 57675}, TextUtils.indexOf("", "", 0) + 34297, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-699819403};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.indexOf("", "", 0) + 1134, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -750839647, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c3 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int i32 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                byte[] bArr8 = $$d;
                Object[] objArr25 = new Object[1];
                h(bArr8[5], (short) 140, bArr8[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c3, iIndexOf2, i32, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 1116 - ExpandableListView.getPackedPositionChild(0L), 17 - Color.blue(0)), Boolean.TYPE});
            }
            Object[] objArr26 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int i33 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int pressedStateDuration3 = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte b4 = $$d[7];
                Object[] objArr27 = new Object[1];
                h(b4, (short) (b4 | 192), (byte) 52, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maxKeyCode, i33, pressedStateDuration3, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr26);
            try {
                Object[] objArr28 = new Object[1];
                i(new char[]{14552, 62806, 41951, 20552, 3794, 15189, 59867, 42512, 21726, 323, 16285, 60513, 39628, 22343, 1475, 12883, 57540, 40299, 19399, 30789, 14030, 58183}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 52573, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                i(new char[]{14556, 550, 19774, 34832, 54022, 7779, 22895, 42062, 61252, 10835, 30123, 45244, 64436, 50819, 406}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto7_bni).substring(105, 113).codePointAt(2) + 14981, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iAlpha = Color.alpha(0) + 1031;
                    int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
                    byte[] bArr9 = $$d;
                    Object[] objArr30 = new Object[1];
                    h(bArr9[5], (short) ($$e + 3), bArr9[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollBarSize2, iAlpha, offsetAfter, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int size = View.MeasureSpec.getSize(0) + 1031;
                    int scrollBarSize3 = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte[] bArr10 = $$d;
                    Object[] objArr31 = new Object[1];
                    h(bArr10[5], (short) 140, bArr10[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maximumFlingVelocity, size, scrollBarSize3, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr26;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList2.add(str2);
                }
            }
            throw null;
        }
        int i34 = cancel + 21;
        notify = i34 % 128;
        int i35 = i34 % 2;
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i36 = ((int[]) objArr[2])[0];
        int i37 = ((int[]) objArr[3])[0];
        int i38 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i39 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        int i40 = i36 + (-32342713) + (((~i39) | 831558814) * 1444) + (((~(i39 | (-461936284))) | (~(706216453 | i39)) | 293639322) * (-1444)) + 909957010;
        int i41 = i40 ^ (i40 << 13);
        int i42 = i41 ^ (i41 >>> 17);
        ((int[]) objArr32[2])[0] = i42 ^ (i42 << 5);
        int i43 = cancel + 45;
        notify = i43 % 128;
        int i44 = i43 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0190  */
    /* JADX WARN: Code duplicated, block: B:39:0x0191  */
    private static void i(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 81;
        while (true) {
            $11 = i3 % 128;
            int i4 = i3 % 2;
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - TextUtils.getTrimmedLength("")), 2625 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777229, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (cancelAll ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39423 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 482, View.getDefaultSize(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                i3 = $10 + 101;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 125;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (Process.myPid() >> 22)), (ViewConfiguration.getEdgeSlop() >> 16) + 481, 37 - (KeyEvent.getMaxKeyCode() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 482 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // defpackage.getCameraSupportedResolutions
    public final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 53;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            setResult(15719);
        } else {
            setResult(-999);
        }
        finish();
        int i3 = notify + 3;
        cancel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
    }

    public final void b() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        new Handler().postDelayed(new Runnable() { // from class: com.midtrans.sdk.uikit.abstracts.BaseActivity.2
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseActivity.b(BaseActivity.this) != null) {
                    BaseActivity.b(BaseActivity.this).setVisibility(8);
                }
                if (BaseActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseActivity.this) != null) {
                    BaseActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseActivity.this).setText(R.string.loading);
                }
            }
        }, 500L);
        int i2 = cancel + 25;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = cancel + 47;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            this.TuitionPaymentFragmentbindingInflater1 = true;
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = false;
        }
        super.onDestroy();
        int i3 = cancel + 13;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 119;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            this.TuitionPaymentFragmentbindingInflater1 = false;
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = false;
        }
        super.onPause();
        int i3 = cancel + 21;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = cancel + 113;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        this.TuitionPaymentFragmentbindingInflater1 = true;
        int i4 = cancel + 91;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = notify + 29;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStart();
        } else {
            super.onStart();
        }
        this.TuitionPaymentFragmentbindingInflater1 = true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int i = 2 % 2;
        int i2 = cancel + 57;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            this.TuitionPaymentFragmentbindingInflater1 = false;
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = false;
        }
        super.onStop();
        int i3 = notify + 31;
        cancel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 95;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            baseActivity.j_().getUIKitCustomSetting();
            obj.hashCode();
            throw null;
        }
        UIKitCustomSetting uIKitCustomSetting = baseActivity.j_().getUIKitCustomSetting();
        if (uIKitCustomSetting != null && uIKitCustomSetting.isEnabledAnimation()) {
            int i3 = notify + 95;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            baseActivity.overridePendingTransition(R.anim.slide_in_back, R.anim.slide_out_back);
            if (i4 == 0) {
                int i5 = 92 / 0;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = cancel + 57;
        notify = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i2 == -999) {
            int i6 = notify + 9;
            cancel = i6 % 128;
            if (i6 % 2 != 0) {
                setResult(i2);
                finish();
            } else {
                setResult(i2);
                finish();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    @Override // com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        int i = 2 % 2;
        int i2 = cancel + 89;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (j_() == null) {
            int i4 = cancel + 119;
            notify = i4 % 128;
            int i5 = i4 % 2;
            setResult(-999);
            finish();
        }
        BaseColorTheme colorTheme = j_().getColorTheme();
        if (colorTheme != null) {
            int i6 = notify + 1;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            this.b = colorTheme.getPrimaryColor();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = colorTheme.getPrimaryDarkColor();
            this.g = colorTheme.getSecondaryColor();
        }
        String languageCode = j_().getLanguageCode();
        if (j_().getLanguageCode().equals("id")) {
            int i8 = notify + 3;
            cancel = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            str = "ID";
        } else {
            int i9 = cancel + 11;
            notify = i9 % 128;
            int i10 = i9 % 2;
            str = "US";
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(languageCode, str);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = cancel + 1;
        int i3 = i2 % 128;
        notify = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            super.onBackPressed();
            UIKitCustomSetting uIKitCustomSetting = j_().getUIKitCustomSetting();
            if (uIKitCustomSetting != null && uIKitCustomSetting.isEnabledAnimation()) {
                overridePendingTransition(R.anim.slide_in_back, R.anim.slide_out_back);
            }
            int i4 = notify + 71;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = i3 + 63;
        cancel = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setColorFilter(View view) throws RuntimeException {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 95;
        notify = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i5 != 0) {
            int i6 = i2 + 63;
            notify = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                throw null;
            }
            if (view != null) {
                if (!(view instanceof ImageButton)) {
                    view.getBackground().setColorFilter(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, PorterDuff.Mode.SRC_ATOP);
                    int i7 = notify + 113;
                    cancel = i7 % 128;
                    int i8 = i7 % 2;
                    return;
                }
                int i9 = i2 + 71;
                notify = i9 % 128;
                if (i9 % 2 == 0) {
                    ((ImageButton) view).setColorFilter(i5, PorterDuff.Mode.SRC_ATOP);
                } else {
                    ((ImageButton) view).setColorFilter(i5, PorterDuff.Mode.SRC_ATOP);
                    obj.hashCode();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    public final MidtransSDK j_() {
        int i = 2 % 2;
        int i2 = notify + 31;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.asBinder == null) {
            int i3 = notify + 109;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            this.asBinder = MidtransSDK.getInstance();
            if (this.asBinder != null) {
                int i5 = cancel + 89;
                notify = i5 % 128;
                int i6 = i5 % 2;
                if (this.asBinder.isSdkNotAvailable()) {
                    setResult(-999);
                    finish();
                    int i7 = cancel + 73;
                    notify = i7 % 128;
                    int i8 = i7 % 2;
                }
            } else {
                setResult(-999);
                finish();
                int i9 = cancel + 73;
                notify = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        MidtransSDK midtransSDK = this.asBinder;
        int i11 = notify + 55;
        cancel = i11 % 128;
        int i12 = i11 % 2;
        return midtransSDK;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        int i2 = 2 % 2;
        int i3 = notify + 95;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        super.setContentView(i);
        this.asInterface = (DefaultTextView) findViewById(R.id.progress_bar_message);
        this.f849a = (LinearLayout) findViewById(R.id.progress_container);
        ImageView imageView = (ImageView) findViewById(R.id.progress_bar_image);
        this.d = imageView;
        if (imageView != null) {
            getHumanReadableName.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3<? extends getHumanReadableName.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3<?>> tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("android.resource://");
            sb2.append(getPackageName());
            sb2.append("/");
            sb.append(sb2.toString());
            sb.append(R.drawable.midtrans_loader);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(sb.toString());
            int i5 = cancel + 57;
            notify = i5 % 128;
            int i6 = i5 % 2;
        }
        try {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } catch (RuntimeException e2) {
            String str = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb3 = new StringBuilder("initTheme():");
            sb3.append(e2.getMessage());
            Logger.e(str, sb3.toString());
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatCheckBox appCompatCheckBox) throws RuntimeException {
        int i = 2 % 2;
        int i2 = cancel + 103;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.g;
        if (i3 != 0) {
            appCompatCheckBox.setSupportButtonTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{-7829368, i3}));
            int i4 = cancel + 15;
            notify = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void setPrimaryBackgroundColor(View view) throws RuntimeException {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 31534);
            int mode = View.MeasureSpec.getMode(0) + 921;
            int iArgb = Color.argb(0, 0, 0, 0) + 28;
            byte b = $$d[7];
            Object[] objArr2 = new Object[1];
            h(b, (short) (b | 192), (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, mode, iArgb, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        i(new char[]{14552, 62806, 41951, 20552, 3794, 15189, 59867, 42512, 21726, 323, 16285, 60513, 39628, 22343, 1475, 12883, 57540, 40299, 19399, 30789, 14030, 58183}, Process.getGidForName("") + 52610, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        i(new char[]{14556, 550, 19774, 34832, 54022, 7779, 22895, 42062, 61252, 10835, 30123, 45244, 64436, 50819, 406}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.what_is_cvv).substring(7, 12).codePointAt(3) + 15005, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cGreen = (char) (31533 - Color.green(0));
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 922;
            int i2 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27;
            byte[] bArr = $$d;
            Object[] objArr5 = new Object[1];
            h(bArr[5], (short) ($$e + 3), bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, packedPositionChild, i2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = cancel + 103;
            notify = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode2 = (char) (View.MeasureSpec.getMode(0) + 31533);
                int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
                int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27;
                byte[] bArr2 = $$d;
                byte b2 = bArr2[5];
                short s = bArr2[28];
                Object[] objArr6 = new Object[1];
                h(b2, s, (byte) (s & 15), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode2, iResolveSizeAndState, i5, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i6 = ~new Random().nextInt();
            int i7 = (-747111892) + (((~((-52474253) | i6)) | (-1721605392)) * (-933)) + (((~(i6 | (-1721605392))) | 1688013827) * 933) + 1360597328;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i10 = notify + 9;
                cancel = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr8 = new Object[1];
                i(new char[]{14552, 42304, 1011, 57358, 20106, 11043, 35159, 30646, 54368, 45702, 7983, 65002, 23532, 14449, 42639, 777, 57791, 20439, 11347, 35573, 30497, 54706, 45617, 4173, 65264, 23394}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.btn_save_card).substring(1, 2).length() + 40342, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                i(new char[]{14554, 32275, 46453, 60502, 9120, 23180, 37367, 51425, 3633, 17694, 64611, 13125, 27310, 41355, 55551, 8129, 21798, 35864}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.details_message_invalid).substring(0, 6).codePointAt(0) + 18059, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            i(new char[]{14547, 34199, 16977, 3893, 52651, 35422, 22274, 5630, 53926, 40784, 24060, 6821, 59262, 42446, 25230, 12149}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 48417, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            i(new char[]{14544, 48420, 13102, 43324, 12073, 42253, 6939, 37135, 5945, 36121, 880, 63842, 32598, 62835, 27459, 57675}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_secondary_cta_text).substring(0, 8).codePointAt(5) + 34190, objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1738338080};
                byte[] bArr3 = $$s;
                byte b3 = (byte) (-bArr3[15]);
                Object[] objArr13 = new Object[1];
                j(b3, b3, bArr3[17], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b4 = bArr3[17];
                Object[] objArr14 = new Object[1];
                j(b4, b4, (byte) (-bArr3[15]), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                    int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i12 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                    byte[] bArr4 = $$d;
                    byte b5 = bArr4[5];
                    short s2 = bArr4[28];
                    Object[] objArr16 = new Object[1];
                    h(b5, s2, (byte) (s2 & 15), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, tapTimeout, i12, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    i(new char[]{14552, 62806, 41951, 20552, 3794, 15189, 59867, 42512, 21726, 323, 16285, 60513, 39628, 22343, 1475, 12883, 57540, 40299, 19399, 30789, 14030, 58183}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step5).substring(37, 38).codePointAt(0) + 52512, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    i(new char[]{14556, 550, 19774, 34832, 54022, 7779, 22895, 42062, 61252, 10835, 30123, 45244, 64436, 50819, 406}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_no_network_message).substring(0, 23).codePointAt(13) + 14972, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mode3 = (char) (31533 - View.MeasureSpec.getMode(0));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                        int i13 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr5 = $$d;
                        Object[] objArr19 = new Object[1];
                        h(bArr5[5], (short) ($$e + 3), bArr5[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode3, keyRepeatTimeout, i13, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                        int maxKeyCode = 921 - (KeyEvent.getMaxKeyCode() >> 16);
                        int gidForName = Process.getGidForName("") + 29;
                        byte b6 = $$d[7];
                        Object[] objArr20 = new Object[1];
                        h(b6, (short) (b6 | 192), (byte) 52, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, maxKeyCode, gidForName, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i14 = cancel + 71;
                    notify = i14 % 128;
                    int i15 = i14 % 2;
                    objArr = objArr15;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = (~((-1129013828) | iIdentityHashCode)) | 37904448;
            int i20 = ~((~iIdentityHashCode) | 1736175195);
            int i21 = i18 + (-1885666277) + ((i19 | i20) * (-470)) + (((~(iIdentityHashCode | (-1091109380))) | i20) * 470);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr21[0])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i24 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i25 = ~iIdentityHashCode2;
            int i26 = i24 + (-1353703297) + (((~(1602104311 | i25)) | 171975332) * 220) + (((~(i25 | 1333406438)) | 440673205) * (-440)) + ((iIdentityHashCode2 | 1602104311) * 220);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr22[0])[0] = i28 ^ (i28 << 5);
        }
        int i29 = this.b;
        if (i29 == 0 || view == null) {
            return;
        }
        view.setBackgroundColor(i29);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public void setSecondaryBackgroundColor(View view) throws RuntimeException {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 99;
        notify = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.g;
        if (i5 != 0) {
            int i6 = i2 + 47;
            notify = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 48 / 0;
                if (view != null) {
                    view.setBackgroundColor(i5);
                }
            } else if (view != null) {
                view.setBackgroundColor(i5);
            }
        }
        int i8 = cancel + 1;
        notify = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        int i = 2 % 2;
        super.startActivity(intent);
        if (j_().getUIKitCustomSetting().isEnabledAnimation()) {
            int i2 = notify + 91;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            if (i3 == 0) {
                int i4 = 95 / 0;
            }
        }
        int i5 = notify + 21;
        cancel = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        int i2 = 2 % 2;
        int i3 = notify + 19;
        cancel = i3 % 128;
        if (i3 % 2 == 0) {
            super.startActivityForResult(intent, i);
            int i4 = 99 / 0;
            if (j_().getUIKitCustomSetting().isEnabledAnimation()) {
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            }
        } else {
            super.startActivityForResult(intent, i);
            if (j_().getUIKitCustomSetting().isEnabledAnimation()) {
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            }
        }
        int i5 = notify + 69;
        cancel = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setTextColor(View view) throws RuntimeException {
        int i = 2 % 2;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i2 != 0) {
            int i3 = cancel + 63;
            int i4 = i3 % 128;
            notify = i4;
            int i5 = i3 % 2;
            if (view != null) {
                if (!(view instanceof TextView)) {
                    if (view instanceof FancyButton) {
                        ((FancyButton) view).setTextColor(i2);
                        return;
                    }
                    return;
                }
                int i6 = i4 + 39;
                cancel = i6 % 128;
                if (i6 % 2 != 0) {
                    ((TextView) view).setTextColor(i2);
                    return;
                }
                ((TextView) view).setTextColor(i2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int i = 2 % 2;
        int i2 = notify + 43;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        if (!TextUtils.isEmpty(str)) {
            this.asInterface.setText(str);
        }
        LinearLayout linearLayout = this.f849a;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.f849a.setClickable(true);
            int i4 = notify + 33;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void asBinder() {
        int i = 2 % 2;
        int i2 = notify + 17;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("");
        int i4 = cancel + 43;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TextInputLayout textInputLayout) throws RuntimeException {
        int i = 2 % 2;
        int i2 = cancel + 95;
        notify = i2 % 128;
        int i3 = i2 % 2;
        if (this.g != 0) {
            try {
                Field declaredField = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                declaredField.setAccessible(true);
                declaredField.set(textInputLayout, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.g}));
                Field declaredField2 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                declaredField2.setAccessible(true);
                declaredField2.set(textInputLayout, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.g}));
                return;
            } catch (IllegalAccessException | NoSuchFieldException | RuntimeException e2) {
                String str = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                StringBuilder sb = new StringBuilder("tilfilter():");
                sb.append(e2.getMessage());
                Logger.e(str, sb.toString());
            }
        }
        int i4 = notify + 35;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void asInterface() {
        TuitionPaymentFragmentbindingInflater1(-1981207147, 1981207147, new Object[]{this}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), OptionsBundle.b());
    }

    public final void b(AppCompatEditText appCompatEditText) throws RuntimeException {
        TuitionPaymentFragmentbindingInflater1(-54430369, 54430370, new Object[]{this, appCompatEditText}, OptionsBundle.b(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }
}
