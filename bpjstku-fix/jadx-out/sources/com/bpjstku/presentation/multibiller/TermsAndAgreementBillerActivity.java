package com.bpjstku.presentation.multibiller;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityTermsAndAgreementBillerBinding;
import com.bpjstku.presentation.multibiller.TermsAndAgreementBillerActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.api.internal.zag;
import com.google.android.material.button.MaterialButton;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionProcessor;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.ParameterHandler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012"}, d2 = {"Lcom/bpjstku/presentation/multibiller/TermsAndAgreementBillerActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTermsAndAgreementBillerBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "onBackPressed", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TermsAndAgreementBillerActivity extends BindingBaseActivity<ActivityTermsAndAgreementBillerBinding> {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asBinder;
    private static long b;
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {27, -8, 5, 78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 58;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f570a = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int d = 1;

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~i;
        int i10 = (~(i7 | i8 | i9)) | (~(i2 | i));
        int i11 = ~(i7 | i9);
        int i12 = i2 | i11;
        int i13 = (~(i | i3)) | i11 | (~(i8 | i3));
        int i14 = i3 + i2 + i5 + (296844165 * i6) + (1729652556 * i4);
        int i15 = i14 * i14;
        int i16 = ((i3 * 599922083) - 580124672) + (599922083 * i2) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i5) + ((-279707648) * i6) + ((-265289728) * i4) + (2117271552 * i15);
        int i17 = (i3 * (-1181628991)) + 1322814002 + (i2 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i5 * (-1181629109)) + (i6 * (-698251017)) + (i4 * 1773125444) + (i15 * 938541056);
        int i18 = i16 + (i17 * i17 * (-109772800));
        if (i18 != 1) {
            return i18 != 2 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return b(objArr);
    }

    private static void c(int i, short s, short s2, Object[] objArr) {
        int i2 = s + 4;
        byte[] bArr = $$a;
        int i3 = (i * 14) + 84;
        byte[] bArr2 = new byte[53 - s2];
        int i4 = 52 - s2;
        int i5 = -1;
        if (bArr == null) {
            int i6 = (i2 + (-i4)) - 11;
            i2 = i2;
            i3 = i6;
        }
        while (true) {
            int i7 = i2 + 1;
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = i7;
            i3 = (i3 + (-bArr[i7])) - 11;
        }
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.multibiller.TermsAndAgreementBillerActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/multibiller/TermsAndAgreementBillerActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "b", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent b(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new Intent(p0, (Class<?>) TermsAndAgreementBillerActivity.class);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d + 57;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        TermsAndAgreementBillerActivity$bindingInflater$1 termsAndAgreementBillerActivity$bindingInflater$1 = TermsAndAgreementBillerActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 121;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return termsAndAgreementBillerActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityTermsAndAgreementBillerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnBackBiller;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: hasId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TermsAndAgreementBillerActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        MaterialButton materialButton2 = ((ActivityTermsAndAgreementBillerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnConfirmBiller;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getCallbackBinder
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TermsAndAgreementBillerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        d = i2 % 128;
        int i3 = i2 % 2;
        d_();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int iIndexOf = 1031 - TextUtils.indexOf("", "", 0);
            int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b2, bArr[132], b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, fadingEdgeLength, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{26511, 13520, 48731, 11973}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_permission).substring(0, 77).length() - 77), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step2).substring(35, 36).codePointAt(0) - 32, new char[]{36868, 2264, 3377, 59260, 12500, 40694, 28787, 7909, 37185, 55984, 3497, 5314, 57870, 30634, 19880, 19991, 45102, 56876, 12845, 39271, 57588, 49535}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{5826, 27340, 46749, 30118}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_uob).substring(1, 3).length() + 42676), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellResolutionDescription).substring(0, 60).length() - 1653945382, new char[]{17475, 32250, 24920, 19990, 23374, 34100, 12496, 54086, 10966, 46693, 13637, 56794, 30415, 54646, 63173}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char gidForName = (char) (Process.getGidForName("") + 1);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
            int size = 15 - View.MeasureSpec.getSize(0);
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            c(b5, (short) (b5 | 51), b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, threadPriority, size, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                byte b6 = $$a[5];
                Object[] objArr6 = new Object[1];
                c(b6, (short) (b6 | 102), (byte) 52, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, threadPriority2, scrollDefaultDelay, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bni_mobile).substring(0, 14).codePointAt(7) + 1698677802;
            int i6 = ~(104085070 | iCodePointAt);
            int i7 = ~iCodePointAt;
            int i8 = i6 | (~(348365240 | i7));
            int i9 = ~((-104085071) | i7);
            int i10 = ((((-1291846323) + ((i8 | i9) * (-516))) + (((~(iCodePointAt | (-281248177))) | (~((-67117065) | i7))) * 516)) + ((67117064 | i9) * 516)) - 73935551;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{38007, 2383, 45608, 25502}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_alto).substring(1, 3).length() + 40624), TextUtils.indexOf("", "", 0, 0), new char[]{33580, 3379, 31575, 45270, 64116, 34972, 20873, 34183, 45736, 36455, 10641, 50209, 30654, 4953, 47526, 54295}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{32285, 35641, 11123, 20329}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 26816), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{27331, 21952, 52500, 1846, 21266, 19251, 49519, 7466, 6718, 5327, 40418, 1932, 25095, 27619, 34246, 50324}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-515021306};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), MotionEvent.axisFromString("") + 1135, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -73935551, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int i13 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iAxisFromString = 14 - MotionEvent.axisFromString("");
                    byte[] bArr2 = $$a;
                    byte b7 = bArr2[7];
                    Object[] objArr12 = new Object[1];
                    c(b7, bArr2[132], b7, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, i13, iAxisFromString, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf("", "", 0) + 1117, 17 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Boolean.TYPE});
                }
                Object[] objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                    int size2 = View.MeasureSpec.getSize(0) + 15;
                    byte b8 = $$a[5];
                    Object[] objArr14 = new Object[1];
                    c(b8, (short) (b8 | 102), (byte) 52, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, minimumFlingVelocity, size2, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{26511, 13520, 48731, 11973}, (char) (KeyEvent.getMaxKeyCode() >> 16), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{36868, 2264, 3377, 59260, 12500, 40694, 28787, 7909, 37185, 55984, 3497, 5314, 57870, 30634, 19880, 19991, 45102, 56876, 12845, 39271, 57588, 49535}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{5826, 27340, 46749, 30118}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 42566), (-1653945322) - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{17475, 32250, 24920, 19990, 23374, 34100, 12496, 54086, 10966, 46693, 13637, 56794, 30415, 54646, 63173}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char mode = (char) View.MeasureSpec.getMode(0);
                        int keyRepeatDelay = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i14 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr17 = new Object[1];
                        c(b10, (short) (b10 | 51), b9, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mode, keyRepeatDelay, i14, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                        int size3 = 15 - View.MeasureSpec.getSize(0);
                        byte[] bArr3 = $$a;
                        byte b11 = bArr3[7];
                        Object[] objArr18 = new Object[1];
                        c(b11, bArr3[132], b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize, tapTimeout, size3, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr13;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            for (String str : strArr2) {
                arrayList.add(str);
            }
            throw null;
        }
        int i15 = d + 77;
        TuitionPaymentFragmentbindingInflater1 = i15 % 128;
        int i16 = i15 % 2;
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i20 = i17 + (-349953430) + (((~((-277884045) | (~iUptimeMillis))) | 33603874) * (-591)) + ((iUptimeMillis | (-277884045)) * 591);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr19[2])[0] = i22 ^ (i22 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
            int iAxisFromString2 = MotionEvent.axisFromString("") + 1756;
            int i23 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
            byte b12 = $$a[7];
            Object[] objArr20 = new Object[1];
            c(b12, (short) (b12 | 103), (byte) 15, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize, iAxisFromString2, i23, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i24 = TuitionPaymentFragmentbindingInflater1 + 33;
            d = i24 % 128;
            int i25 = i24 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                byte b13 = $$a[7];
                byte b14 = b13;
                Object[] objArr21 = new Object[1];
                c(b14, (short) (b14 | 51), b13, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, offsetAfter, iNormalizeMetaState, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step3).substring(35, 41).codePointAt(2) - 168168516;
            int i26 = 1804512879 + (((~((-702706360) | iCodePointAt2)) | 545390769) * (-140)) + ((~((-157315591) | iCodePointAt2)) * 70) + (((~(iCodePointAt2 | 915308785)) | (-527233607)) * 70) + 1401697804;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i28 ^ (i28 << 5);
            int i29 = TuitionPaymentFragmentbindingInflater1 + 83;
            d = i29 % 128;
            int i30 = i29 % 2;
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{38007, 2383, 45608, 25502}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku_instruction_step2).substring(2, 3).length() + 40625), TextUtils.indexOf("", "", 0), new char[]{33580, 3379, 31575, 45270, 64116, 34972, 20873, 34183, 45736, 36455, 10641, 50209, 30654, 4953, 47526, 54295}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{32285, 35641, 11123, 20329}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26912), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{27331, 21952, 52500, 1846, 21266, 19251, 49519, 7466, 6718, 5327, 40418, 1932, 25095, 27619, 34246, 50324}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-515021306};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42049), 1726 - Color.alpha(0), View.getDefaultSize(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1401697804);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                int i31 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                byte b15 = $$a[7];
                byte b16 = b15;
                Object[] objArr26 = new Object[1];
                c(b16, (short) (b16 | 51), b15, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, i31, packedPositionGroup, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{26511, 13520, 48731, 11973}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, new char[]{36868, 2264, 3377, 59260, 12500, 40694, 28787, 7909, 37185, 55984, 3497, 5314, 57870, 30634, 19880, 19991, 45102, 56876, 12845, 39271, 57588, 49535}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{5826, 27340, 46749, 30118}, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42679), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1653945358, new char[]{17475, 32250, 24920, 19990, 23374, 34100, 12496, 54086, 10966, 46693, 13637, 56794, 30415, 54646, 63173}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                    int iMyPid = (Process.myPid() >> 22) + 1755;
                    int i32 = 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b17 = $$a[7];
                    byte b18 = b17;
                    Object[] objArr29 = new Object[1];
                    c(b18, (short) (b18 | 140), b17, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf2, iMyPid, i32, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 24;
                    byte b19 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(b19, (short) (b19 | 103), (byte) 15, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(deadChar, keyRepeatDelay2, iIndexOf2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i33 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i34 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i34 == i33) {
            int i35 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i36 = ~iIdentityHashCode;
            int i37 = i35 + (-1175349257) + (((~(475430823 | i36)) | (~((-688033250) | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | 1029111783)) | (~(i36 | (-134352290)))) * 210);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr31[3])[0] = i39 ^ (i39 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
        if (strArr4 != null) {
            int i40 = d + 101;
            TuitionPaymentFragmentbindingInflater1 = i40 % 128;
            int i41 = i40 % 2;
            int i42 = 0;
            while (i42 < strArr4.length) {
                arrayList2.add(strArr4[i42]);
                i42++;
                int i43 = TuitionPaymentFragmentbindingInflater1 + 95;
                d = i43 % 128;
                int i44 = i43 % 2;
            }
        }
        int[] iArr = new int[i34];
        int i45 = i34 - 1;
        iArr[i45] = 1;
        Toast.makeText((Context) null, iArr[((i34 * i45) % 2) - 1], 1).show();
        int i46 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int i47 = ~new Random().nextInt();
        int i48 = i46 + 1620773313 + ((1065285626 | i47) * 184) + (((~(i47 | 1058702322)) | 225769034) * 184);
        int i49 = (i48 << 13) ^ i48;
        int i50 = i49 ^ (i49 >>> 17);
        ((int[]) objArr32[3])[0] = i50 ^ (i50 << 5);
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 67;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.red(0) + 8328), 1235 - TextUtils.indexOf("", ""), 35 - ExpandableListView.getPackedPositionType(0L), -653973969, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2764, TextUtils.indexOf((CharSequence) "", '0', 0) + 15, 1504416861, false, $$i(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Drawable.resolveOpacity(0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 253, 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (-b6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - KeyEvent.keyCodeFromString("")), 2891 - TextUtils.getOffsetAfter("", 0), 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2012627446, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $11 + 27;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        if (i4 != ((550387624 + (((~((-1017758194) | i5)) | 277446961) * 1504)) + ((~(i5 | (-740311233))) * (-1504))) - 2048776800) {
            int i6 = 1151399124 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        if (i7 != 444474800 + (((-539262977) | i8) * (-627)) + (((~((-1556771583) | i8)) | 1022284382) * (-627)) + (((~(i8 | 1022284382)) | (~((~i8) | 1556771582))) * 627)) {
            throw new RuntimeException("130335693");
        }
        super.onResume();
        int i9 = TuitionPaymentFragmentbindingInflater1 + 67;
        d = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i6 = (~(1567420841 | i5)) | 579864146;
        int i7 = ~((~i5) | (-1409851690));
        if (i4 != 1123221428 + ((i6 | i7) * (-470)) + (((~(i5 | 2147284987)) | i7) * 470)) {
            throw new RuntimeException("-1559250862");
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = ~iIdentityHashCode;
        int i10 = ~((-2414110) | i9);
        int i11 = ~(1718325440 | iIdentityHashCode);
        if (i8 != 1385593784 + ((i10 | i11) * 1150) + (((~((-1718325441) | i9)) | i11) * (-575)) + (((~(iIdentityHashCode | (-2414110))) | (~(i9 | 2414109))) * 575)) {
            int i12 = (-1322316668) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i13 = d + 13;
        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
        int i14 = i13 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        TermsAndAgreementBillerActivity termsAndAgreementBillerActivity = (TermsAndAgreementBillerActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = d + 53;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ~((int) SystemClock.elapsedRealtime());
        if (i4 != (-262890018) + (((~(1226265722 | i5)) | (-396278180)) * (-983)) + (((~(i5 | (-396278180))) | 18223138) * 983)) {
            throw null;
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i7 = ~(2048345675 | startElapsedRealtime);
        int i8 = ~startElapsedRealtime;
        if (i6 != (-1944957852) + ((i7 | (~((-1745306692) | i8))) * (-406)) + ((~(2077741035 | i8)) * (-406)) + (((~(startElapsedRealtime | (-332434345))) | (~((-2048345676) | i8))) * 406)) {
            throw null;
        }
        super.onCreate(bundle);
        int i9 = TuitionPaymentFragmentbindingInflater1 + 75;
        d = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(TermsAndAgreementBillerActivity termsAndAgreementBillerActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        termsAndAgreementBillerActivity.setResult(TypedValues.PositionType.TYPE_DRAWPATH);
        termsAndAgreementBillerActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = d + 41;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit b(TermsAndAgreementBillerActivity termsAndAgreementBillerActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 35;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            termsAndAgreementBillerActivity.d_();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        termsAndAgreementBillerActivity.d_();
        Unit unit2 = Unit.INSTANCE;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 103;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    static {
        asBinder = 1;
        g();
        INSTANCE = new Companion(null);
        int i = f570a + 59;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTermsAndAgreementBillerBinding> TuitionPaymentFragmentbindingInflater1() {
        return (Function1) b(zag.TuitionPaymentFragmentbindingInflater1(), 600375492, new Object[]{this}, -600375491, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.how_much_point).substring(27, 28).codePointAt(0) + 1139186151, zag.TuitionPaymentFragmentbindingInflater1(), zag.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 123;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_terms_and_agreement_biller;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = d + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 29;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = d + 83;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b(zag.TuitionPaymentFragmentbindingInflater1(), 2093307762, new Object[]{this, bundle}, -2093307760, ParameterHandler.AnonymousClass1.b(), zag.TuitionPaymentFragmentbindingInflater1(), ParameterHandler.AnonymousClass1.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        b(ParameterHandler.AnonymousClass1.b(), 1080444696, new Object[]{this}, -1080444696, zag.TuitionPaymentFragmentbindingInflater1(), ParameterHandler.AnonymousClass1.b(), ParameterHandler.AnonymousClass1.b());
    }

    static void g() {
        b = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 27793;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        TermsAndAgreementBillerActivity termsAndAgreementBillerActivity = (TermsAndAgreementBillerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 55;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r7, int r8, int r9) {
        /*
            int r7 = r7 + 102
            int r9 = r9 * 2
            int r9 = r9 + 1
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.presentation.multibiller.TermsAndAgreementBillerActivity.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r8
            r3 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L21:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.multibiller.TermsAndAgreementBillerActivity.$$i(short, int, int):java.lang.String");
    }
}
