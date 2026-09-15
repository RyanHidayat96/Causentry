package com.bpjstku.util.viewbinding;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.util.viewbinding.BindingPassiveFormActivity;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import com.nbs.validacion.PassiveFormActivity;
import defpackage.getCause;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\f\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u00108%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00028\u00008EX\u0085\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/bpjstku/util/viewbinding/BindingPassiveFormActivity;", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/nbs/validacion/PassiveFormActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "", "setContentView", "(I)V", "Landroid/view/View;", "(Landroid/view/View;)V", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "onTransact", "()Landroidx/viewbinding/ViewBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BindingPassiveFormActivity<B extends ViewBinding> extends PassiveFormActivity {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: AutoValue_ImageReaderFormatRecommender_FormatCombo
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1629139043;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BindingPassiveFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        }
    });
    private static final byte[] $$l = {58, 66, -14, -31};
    private static final int $$o = 18;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {49, 84, -120, 101, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 117;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59773, 59875, 59872, 59897, 59902, 59886, 59828, 59842, 59874, 59885, 59886, 59847, 59853, 59873, 59873, 59887, 59705, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757, 59723, 59788, 59778, 59776, 59803, 59783, 59789, 59746, 59749, 59802, 59771, 59755, 59789, 59805, 59800, 59783, 59778, 59763, 59772, 59782, 59778, 59788, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746};

    private static void h(int i, short s, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = (i * 14) + 84;
        int i3 = 197 - s;
        byte[] bArr2 = new byte[s2 + 1];
        int i4 = -1;
        if (bArr == null) {
            int i5 = i3 + (-i2);
            int i6 = i3 + 1;
            int i7 = i5 - 11;
            i4 = -1;
            i3 = i6;
            i2 = i7;
        }
        while (true) {
            int i8 = i4 + 1;
            bArr2[i8] = (byte) i2;
            if (i8 == s2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i3;
            i4 = i8;
            i3 = i9 + 1;
            i2 = (i2 + (-bArr[i3])) - 11;
        }
    }

    protected abstract Function1<LayoutInflater, B> TuitionPaymentFragmentbindingInflater1();

    public final B onTransact() {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        B b2 = (B) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        b = i4 % 128;
        int i5 = i4 % 2;
        return b2;
    }

    @Override // com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle p0) {
        ViewBinding viewBinding;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            super.onCreate(p0);
            WindowCompat.setDecorFitsSystemWindows(getWindow(), true);
            viewBinding = (ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        } else {
            super.onCreate(p0);
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
            viewBinding = (ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        }
        setContentView(viewBinding.getRoot());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.setContentView(p0);
        View childAt = ((ViewGroup) findViewById(R.id.content)).getChildAt(0);
        if (childAt != null) {
            ViewCompat.setOnApplyWindowInsetsListener(childAt, new getCause());
            int i4 = b + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View p0) {
        int i = 2 % 2;
        int i2 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.setContentView(p0);
        View childAt = ((ViewGroup) findViewById(R.id.content)).getChildAt(0);
        if (childAt != null) {
            ViewCompat.setOnApplyWindowInsetsListener(childAt, new getCause());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
            int size = View.MeasureSpec.getSize(0) + 1755;
            int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
            byte b2 = $$d[7];
            Object[] objArr2 = new Object[1];
            h(b2, (short) (b2 | 193), (byte) ($$e & 175), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, size, maxKeyCode, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                int defaultSize = 1755 - View.getDefaultSize(0, 0);
                int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0');
                byte b3 = $$d[7];
                Object[] objArr3 = new Object[1];
                h(b3, (short) (b3 | 156), (byte) ($$e & 190), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, defaultSize, iLastIndexOf, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i5 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i5}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i6 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation) | (-639362925));
            int i7 = (((((-920647663) | i6) * (-970)) - 1725689329) + ((i6 | 281284738) * 970)) - 2059285060;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            i(new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{0, 16, 127, 0}, true, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            i(new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{16, 16, 0, 0}, true, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1910550911};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.getCapsMode("", 0, 0)), 1774 - AndroidCharacter.getMirror('0'), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -2059285060, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int iIndexOf = 1755 - TextUtils.indexOf("", "");
                    int iIndexOf2 = TextUtils.indexOf("", "") + 23;
                    byte b4 = $$d[7];
                    Object[] objArr8 = new Object[1];
                    h(b4, (short) (b4 | 156), (byte) ($$e & 190), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, iIndexOf, iIndexOf2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    i(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{32, 22, 32, 0}, false, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    i(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 0, 0}, false, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1755;
                        int size2 = View.MeasureSpec.getSize(0) + 23;
                        byte b5 = $$d[7];
                        short s = (short) (b5 | 104);
                        Object[] objArr11 = new Object[1];
                        h(b5, s, (byte) (s >>> 1), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, offsetAfter, size2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int gidForName = Process.getGidForName("") + 1756;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
                        byte b6 = $$d[7];
                        Object[] objArr12 = new Object[1];
                        h(b6, (short) (b6 | 193), (byte) ($$e & 175), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, gidForName, scrollDefaultDelay, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                arrayList.add(strArr[i2]);
                i2++;
            }
            throw null;
        }
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr13 = {new int[]{i13}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i14 = ~System.identityHashCode(this);
        int i15 = i12 + 481923148 + ((~((-32897) | i14)) * (-783)) + (((~(i14 | (-160739971))) | (-373342397)) * 783);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i19 = i18 + 31;
        b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = i18 + 35;
        b = i21 % 128;
        int i22 = i21 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
            int i23 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
            byte b7 = $$d[7];
            short s2 = (short) (b7 | 52);
            Object[] objArr14 = new Object[1];
            h(b7, s2, (byte) s2, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(pressedStateDuration, iResolveOpacity, i23, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        i(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{32, 22, 32, 0}, false, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        i(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 0, 0}, false, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int defaultSize2 = 1031 - View.getDefaultSize(0, 0);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
            byte b8 = $$d[7];
            Object[] objArr17 = new Object[1];
            h(b8, (short) (b8 | 156), (byte) ($$e & 190), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyPid, defaultSize2, modifierMetaStateMask, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                byte[] bArr = $$d;
                byte b9 = bArr[5];
                short s3 = bArr[7];
                Object[] objArr18 = new Object[1];
                h(b9, s3, (byte) s3, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iKeyCodeFromString, tapTimeout, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr19[3])[0];
            int i25 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = 1866967784 + (((~((-9831181) | iIdentityHashCode)) | 9437196) * 345) + (((~((-9831181) | (~iIdentityHashCode))) | 225011793) * 345) + ((~(iIdentityHashCode | (-9437197))) * 345) + 1745445685;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[2])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            i(new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{0, 16, 127, 0}, true, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            i(new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{16, 16, 0, 0}, true, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-1910550911};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0')), 1134 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1745445685, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                int size3 = View.MeasureSpec.getSize(0) + 15;
                byte b10 = $$d[7];
                short s4 = (short) (b10 | 52);
                Object[] objArr24 = new Object[1];
                h(b10, s4, (byte) s4, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollDefaultDelay2, edgeSlop, size3, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1117, 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Boolean.TYPE});
            }
            Object[] objArr25 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int iMyPid = (Process.myPid() >> 22) + 1031;
                int modifierMetaStateMask2 = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte[] bArr2 = $$d;
                byte b11 = bArr2[5];
                short s5 = bArr2[7];
                Object[] objArr26 = new Object[1];
                h(b11, s5, (byte) s5, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(bitsPerPixel, iMyPid, modifierMetaStateMask2, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr25);
            try {
                Object[] objArr27 = new Object[1];
                i(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{32, 22, 32, 0}, false, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                i(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 0, 0}, false, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int i29 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int iBlue = Color.blue(0) + 15;
                    byte b12 = $$d[7];
                    Object[] objArr29 = new Object[1];
                    h(b12, (short) (b12 | 156), (byte) ($$e & 190), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, i29, iBlue, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                    int i30 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b13 = $$d[7];
                    short s6 = (short) (b13 | 52);
                    Object[] objArr30 = new Object[1];
                    h(b13, s6, (byte) s6, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, iNormalizeMetaState, i30, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr25;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr[1])[0];
        int i32 = ((int[]) objArr[3])[0];
        if (i32 != i31) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                    int i33 = b + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                    int i34 = i33 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i32));
        }
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i35 = ((int[]) objArr[2])[0];
        int i36 = ((int[]) objArr[3])[0];
        int i37 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i38 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i39 = ~i38;
        int i40 = i35 + 698583513 + ((~(79551742 | i39)) * (-560)) + ((~(i38 | (-155189762))) * (-560)) + (((~(164728427 | i39)) | 70013076) * 560);
        int i41 = (i40 << 13) ^ i40;
        int i42 = i41 ^ (i41 >>> 17);
        ((int[]) objArr31[2])[0] = i42 ^ (i42 << 5);
    }

    private static void i(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        byte b2;
        char[] cArr;
        char c;
        int i2 = 2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 83;
                $11 = i11 % 128;
                int i12 = i11 % i2;
                try {
                    Object[] objArr2 = new Object[i6];
                    objArr2[i4] = Integer.valueOf(cArr2[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) i4;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + i6), 1270 - (ViewConfiguration.getEdgeSlop() >> 16), 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 407021364, false, $$r(b3, b4, (byte) (b4 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i10++;
                    i2 = 2;
                    i4 = 0;
                    i6 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i7];
        System.arraycopy(cArr2, i5, cArr4, 0, i7);
        if (bArr != null) {
            int i13 = $10 + 39;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr = new char[i7];
                b2 = 1;
                setvideostabilizationmode.b = 1;
                c = 1;
            } else {
                b2 = 1;
                cArr = new char[i7];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i7) {
                if (bArr[setvideostabilizationmode.b] == b2) {
                    int i14 = $10 + 115;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.combineMeasuredStates(0, 0), 3224 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 13 - KeyEvent.getDeadChar(0, 0), 2133916302, false, $$r(b5, b6, (byte) (b6 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        int i16 = 41 / 0;
                    } else {
                        int i17 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3225, 12 - TextUtils.lastIndexOf("", '0', 0), 2133916302, false, $$r(b7, b8, (byte) (b8 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                } else {
                    int i18 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b9 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944), 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 23 - View.MeasureSpec.getSize(0), 387247676, false, $$r(b9, b9, (byte) $$l.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 41241), 1705 - Drawable.resolveOpacity(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, -1434471773, false, $$r(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                b2 = 1;
            }
            cArr4 = cArr;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i7);
            int i19 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr4, i19, i9);
            System.arraycopy(cArr5, i9, cArr4, 0, i19);
        } else {
            i = 0;
        }
        if (!(!z)) {
            char[] cArr6 = new char[i7];
            loop2: while (true) {
                setvideostabilizationmode.b = i;
                while (true) {
                    if (setvideostabilizationmode.b >= i7) {
                        break loop2;
                    }
                    int i20 = $11 + 29;
                    $10 = i20 % 128;
                    if (i20 % 2 != 0) {
                        cArr6[setvideostabilizationmode.b] = cArr4[i7 << setvideostabilizationmode.b];
                        setvideostabilizationmode.b %= 0;
                    } else {
                        cArr6[setvideostabilizationmode.b] = cArr4[(i7 - setvideostabilizationmode.b) - 1];
                        i = setvideostabilizationmode.b + 1;
                    }
                }
            }
            cArr4 = cArr6;
        }
        if (i8 > 0) {
            int i21 = $11 + 35;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (true) {
                setvideostabilizationmode.b = i23;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i23 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ ViewBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1(BindingPassiveFormActivity bindingPassiveFormActivity) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        b = i2 % 128;
        int i3 = i2 % 2;
        Function1<LayoutInflater, B> function1TuitionPaymentFragmentbindingInflater1 = bindingPassiveFormActivity.TuitionPaymentFragmentbindingInflater1();
        LayoutInflater layoutInflater = bindingPassiveFormActivity.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
        B bInvoke = function1TuitionPaymentFragmentbindingInflater1.invoke(layoutInflater);
        int i4 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return bInvoke;
    }

    public static /* synthetic */ WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        b = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompat;
    }

    @Override // com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$r(byte r5, short r6, short r7) {
        /*
            int r5 = r5 * 2
            int r5 = 4 - r5
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.bpjstku.util.viewbinding.BindingPassiveFormActivity.$$l
            int r7 = 105 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r4 = r1[r5]
            int r3 = r3 + 1
        L27:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.viewbinding.BindingPassiveFormActivity.$$r(byte, short, short):java.lang.String");
    }
}
