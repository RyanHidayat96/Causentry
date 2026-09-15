package com.bpjstku.presentation.about;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.android.volley.ExecutorDelivery;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityApplicationVersionBinding;
import com.bpjstku.presentation.about.ApplicationVersionActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import defpackage.AutoValue_MediaSpec1;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getHorizontalOffset;
import defpackage.getMaxImages;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u000b8\u0015X\u0095D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/bpjstku/presentation/about/ApplicationVersionActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityApplicationVersionBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApplicationVersionActivity extends BindingBaseActivity<ActivityApplicationVersionBinding> {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.activity_application_version;
    private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$f = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {5, -91, 77, 46, -16, -2, 59, -73, -2, -8, 16, -21, 9, -20, 1, 62, -69, 0, -1, -16, -4, 0, 62, -63, -9, -10, 11, -17, 0, 9, -15, 58, -60, -16, 13, -16, 4, -3, 50, -36, -23, -16, 4, 11, -15, -15, -13, 12, 31, -46, -7, 8, -12, 21, -23, 0, -7, -5, -17, 74, -17, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63};
    private static final int $$k = 108;
    private static final byte[] $$a = {80, -8, 43, 65, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 104;
    private static int asBinder = 0;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i2 | i3);
        int i9 = (~((~i3) | i2)) | (~(i2 | i));
        int i10 = i2 + i + i4 + (32217706 * i6) + (238734613 * i5);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i2) - 528416768) + (677943110 * i) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i4) + ((-154927104) * i6) + ((-131989504) * i5) + ((-1876361216) * i11);
        int i13 = ((i2 * 1127137324) - 440746823) + (i * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i4 * 1127136485) + (i6 * 976419026) + (i5 * 1106960329) + (i11 * 279773184);
        return i12 + ((i13 * i13) * (-1943076864)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 53 - r7
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.presentation.about.ApplicationVersionActivity.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.ApplicationVersionActivity.c(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r6 = r6 * 5
            int r0 = 58 - r6
            int r5 = r5 * 57
            int r5 = 60 - r5
            byte[] r1 = com.bpjstku.presentation.about.ApplicationVersionActivity.$$j
            byte[] r0 = new byte[r0]
            int r6 = 57 - r6
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            int r5 = r5 + 1
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r5]
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-4)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.ApplicationVersionActivity.f(byte, short, int, java.lang.Object[]):void");
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = i3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityApplicationVersionBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        ApplicationVersionActivity$bindingInflater$1 applicationVersionActivity$bindingInflater$1 = ApplicationVersionActivity$bindingInflater$1.b;
        int i4 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return applicationVersionActivity$bindingInflater$1;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ba  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), Color.alpha(0) + 3291, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, 1199271174, false, $$i(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.getDefaultSize(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 651, 44 - (ViewConfiguration.getLongPressTimeout() >> 16), -450685997, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i7 = $11 + 17;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i2 << setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 651, TextUtils.indexOf((CharSequence) "", '0') + 45, -450685997, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        j = 0;
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - Process.getGidForName("")), 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.red(0) + 44, -450685997, false, $$i(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                    } else {
                        j = 0;
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    i4 = 29209604;
                }
            }
            int i8 = $11 + 101;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0378  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int iResolveSize = 876 - View.resolveSize(0, 0);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) 15, bArr[7], bArr[5], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSize, keyRepeatDelay, -1650998592, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(true, 245 - TextUtils.getTrimmedLength(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step4).substring(26, 27).length() + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_mandiri_point).substring(1, 3).codePointAt(1) - 105, new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 213, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_sub_title_text).substring(0, 1).length() + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_6).substring(0, 1).codePointAt(0) - 67, new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
            int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b2, (short) (b2 | 37), bArr2[5], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iMakeMeasureSpec, i2, 2012020043, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int mode = View.MeasureSpec.getMode(0) + 876;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                byte[] bArr3 = $$a;
                byte b3 = bArr3[7];
                Object[] objArr7 = new Object[1];
                c(b3, (short) (b3 | 89), bArr3[5], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, mode, threadPriority, 2012931276, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_challenged).substring(23, 25).codePointAt(1) - 512598379;
            int i3 = ((14871344 + (((-75974662) | (~iCodePointAt)) * (-490))) + (((~(iCodePointAt | 304132784)) | (-380107446)) * 490)) - 1896639966;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr9 = new Object[1];
                e(true, 245 - ExpandableListView.getPackedPositionGroup(0L), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 15, Drawable.resolveOpacity(0, 0) + 8, new char[]{65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.danamon_online_description_2).substring(0, 1).codePointAt(0) + 172, 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 23, new char[]{65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527}, objArr10);
                baseContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = baseContext.getApplicationContext();
                    int i6 = b + 97;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    int i8 = b + 73;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                    if (i8 % 2 == 0) {
                        ((ContextWrapper) baseContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = baseContext.getApplicationContext();
                        int i9 = b + 97;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                        int i10 = i9 % 2;
                    } else {
                        int i11 = b + 13;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                        int i12 = i11 % 2;
                        baseContext = null;
                    }
                }
            }
            Object[] objArr11 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.expand_link_prima).substring(1, 2).codePointAt(0) + 139, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_threat_detected_error).substring(0, 25).length() - 9, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 111, new char[]{11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(true, View.combineMeasuredStates(0, 0) + 248, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 106, new char[]{65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r'}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            b = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr13 = {baseContext, Integer.valueOf(iIntValue), 0, -623287650};
                byte[] bArr4 = $$j;
                byte b4 = bArr4[14];
                Object[] objArr14 = new Object[1];
                f(b4, bArr4[17], b4, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b5 = bArr4[17];
                Object[] objArr15 = new Object[1];
                f(b5, bArr4[14], b5, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (baseContext != null) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i17 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iBlue = Color.blue(0) + 10;
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b6, (short) (b6 | 89), bArr5[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, i17, iBlue, 2012931276, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_bni_transfer).substring(0, 8).codePointAt(7) + 172, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_notification_shopee_app).substring(26, 27).codePointAt(0) - 10, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(false, 250 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 84, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_invalid_phone_number).substring(13, 14).length() + 12, new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 876;
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 10;
                            byte[] bArr6 = $$a;
                            byte b7 = bArr6[7];
                            Object[] objArr20 = new Object[1];
                            c(b7, (short) (b7 | 37), bArr6[5], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, touchSlop, iResolveSizeAndState, 2012020043, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i18 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                            int bitsPerPixel = 9 - ImageFormat.getBitsPerPixel(0);
                            byte[] bArr7 = $$a;
                            Object[] objArr21 = new Object[1];
                            c((byte) 15, bArr7[7], bArr7[5], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay2, i18, bitsPerPixel, -1650998592, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[0])[0];
        if (i20 == i19) {
            int i21 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode;
            int i23 = i21 + 594138376 + (((~((-963004344) | i22)) | (-922694115)) * 519) + (((~(i22 | (-811991459))) | (~((-110702657) | iIdentityHashCode))) * (-519)) + (((~(iIdentityHashCode | (-922694115))) | 963004343) * 519);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[1])[0] = i25 ^ (i25 << 5);
        } else {
            Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
            int i26 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode2;
            int i28 = i26 + 1114219552 + (((~(216946619 | i27)) | (~((-11145772) | iIdentityHashCode2))) * (-831)) + ((~(268402619 | iIdentityHashCode2)) * (-1662)) + (((~(iIdentityHashCode2 | (-216946620))) | (~(i27 | (-257256849))) | (~(257256848 | iIdentityHashCode2))) * 831);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[1])[0] = i30 ^ (i30 << 5);
        }
        MaterialButton materialButton = ((ActivityApplicationVersionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnAppVersion;
        int i31 = ((int[]) objArr2[1])[0];
        int i32 = i31 * i31;
        int i33 = -(1932225878 * i31);
        int i34 = (((i32 & i33) + (i32 | i33)) - (~(-(i31 * (-1209493782))))) - 1;
        int i35 = (i34 ^ (-1971026944)) + (((-1971026944) & i34) << 1);
        int i36 = i35 >> 25;
        int i37 = (((i36 | (-255)) << 1) - (i36 ^ (-255))) / 128;
        int i38 = (i37 ^ 1) + ((i37 & 1) << 1);
        int i39 = (i35 & i38) + (i38 | i35);
        int i40 = i35 >> 23;
        int i41 = -(i39 ^ ((((i40 ^ (-1023)) + ((i40 & (-1023)) << 1)) / 512) + 1));
        int i42 = (i41 & 1) + (i41 | 1);
        int i43 = i42 >> 22;
        int i44 = (((i43 | (-2047)) << 1) - (i43 ^ (-2047))) / 1024;
        int i45 = ((i44 | 1) << 1) - (i44 ^ 1);
        Intrinsics.checkNotNullExpressionValue(materialButton, "14,4,btnAppVersion".substring(225 / (((-((i45 & 1) + (i45 | 1))) & i42) * 45)));
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: ActivityResultContractsOpenDocument
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApplicationVersionActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = ((ActivityApplicationVersionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAppVersionTitle;
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        textView.setText(getMaxImages.g());
        TextView textView2 = ((ActivityApplicationVersionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAppVersionContent;
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        textView2.setText(getMaxImages.TuitionPaymentFragmentbindingInflater1());
        int i4 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
            int gidForName = 1754 - Process.getGidForName("");
            int i3 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 15, bArr[7], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, gidForName, i3, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            b = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int mirror = 1803 - AndroidCharacter.getMirror('0');
                int iMyPid = (Process.myPid() >> 22) + 23;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[7];
                Object[] objArr3 = new Object[1];
                c(b2, (short) (b2 | 37), bArr2[5], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, mirror, iMyPid, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i6 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i6}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 588894958;
            int i7 = ((~((-178357521) | iCodePointAt)) * 521) + 1435086172 + (((~((~iCodePointAt) | (-178357521))) | 657445) * 521) + 28666755;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step4).substring(3, 4).length() + 243, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_image_signing_failed).substring(0, 24).codePointAt(20) - 93, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 115, new char[]{11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 150, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, 10 - KeyEvent.normalizeMetaState(0), new char[]{65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r'}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {181801028};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.myPid() >> 22) + 42049), 1726 - KeyEvent.normalizeMetaState(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 28666755, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char gidForName2 = (char) (29943 - Process.getGidForName(""));
                    int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[7];
                    Object[] objArr8 = new Object[1];
                    c(b3, (short) (b3 | 37), bArr3[5], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName2, doubleTapTimeout, iRgb, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_5).substring(17, 19).codePointAt(1) + 213, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.klikbca_instruction_1).substring(21, 22).length() + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.show_instruction).substring(1, 2).codePointAt(0) - 89, new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 213, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card_message).substring(0, 1).codePointAt(0) - 70, new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[7];
                        Object[] objArr11 = new Object[1];
                        c(b4, (short) (b4 | 141), bArr4[5], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, iMakeMeasureSpec, i10, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1755;
                        int iRgb2 = (-16777193) - Color.rgb(0, 0, 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((byte) 15, bArr5[7], bArr5[5], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, packedPositionGroup, iRgb2, 986134021, false, (String) objArr12[0], null);
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
            int i11 = b + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            while (i2 < strArr.length) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                b = i13 % 128;
                int i14 = i13 % 2;
                arrayList.add(strArr[i2]);
                i2++;
            }
            throw null;
        }
        int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i16 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr13 = {new int[]{i16}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i17 = ~System.identityHashCode(this);
        int i18 = i15 + (-897372938) + (((~((-1056307386) | i17)) | 843704959) * (-933)) + (((~(i17 | 843704959)) | (-1056832256)) * 933) + 489703710;
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr13[3])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i21 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i22 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
            byte[] bArr6 = $$a;
            byte b5 = bArr6[7];
            Object[] objArr14 = new Object[1];
            c(b5, (short) (b5 | 89), bArr6[5], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout, i21, i22, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 209, 21 - TextUtils.indexOf((CharSequence) "", '0', 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step2).substring(13, 14).length() + 15, new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(false, 297 - AndroidCharacter.getMirror('0'), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, 13 - (Process.myTid() >> 22), new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
            int defaultSize = View.getDefaultSize(0, 0) + 15;
            byte[] bArr7 = $$a;
            byte b6 = bArr7[7];
            Object[] objArr17 = new Object[1];
            c(b6, (short) (b6 | 37), bArr7[5], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, touchSlop, defaultSize, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 1031;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
                Object[] objArr18 = new Object[1];
                c((byte) ($$b >>> 1), (short) 193, $$a[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(jumpTapTimeout, iIndexOf, maximumDrawingCacheSize, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr19[3])[0];
            int i24 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i25 = ~iElapsedRealtime;
            int i26 = ((613886679 + (((~((-876106403) | i25)) | (~(iElapsedRealtime | (-631826233)))) * 333)) + (((~(iElapsedRealtime | (-876106403))) | (~(i25 | (-631826233)))) * 333)) - 2013806440;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[2])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_installment).substring(12, 13).length() + 243, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_6).substring(7, 8).length() + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step1).substring(2, 4).codePointAt(1) - 100, new char[]{11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(true, ((Process.getThreadPriority(0) + 20) >> 6) + 248, 16 - View.MeasureSpec.makeMeasureSpec(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_5).substring(16, 17).codePointAt(0) - 106, new char[]{65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r'}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {181801028};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46037), 1134 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Process.getGidForName("") + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -2013806440, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                int i29 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr8 = $$a;
                byte b7 = bArr8[7];
                Object[] objArr24 = new Object[1];
                c(b7, (short) (b7 | 89), bArr8[5], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(longPressTimeout, iNormalizeMetaState, i29, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionGroup(0L) + 45993), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1116, (Process.myPid() >> 22) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0');
                int iAxisFromString = MotionEvent.axisFromString("") + 16;
                Object[] objArr25 = new Object[1];
                c((byte) ($$b >>> 1), (short) 193, $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cArgb, iLastIndexOf, iAxisFromString, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 209, KeyEvent.getDeadChar(0, 0) + 22, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(false, (ViewConfiguration.getTouchSlop() >> 8) + 249, 15 - View.resolveSize(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indomaret).substring(0, 9).length() + 4, new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int mirror2 = AndroidCharacter.getMirror('0') + 983;
                    int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte[] bArr9 = $$a;
                    byte b8 = bArr9[7];
                    Object[] objArr28 = new Object[1];
                    c(b8, (short) (b8 | 37), bArr9[5], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, mirror2, iIndexOf2, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int i30 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                    int i31 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                    byte[] bArr10 = $$a;
                    byte b9 = bArr10[7];
                    Object[] objArr29 = new Object[1];
                    c(b9, (short) (b9 | 89), bArr10[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(mode, i30, i31, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                b = i32 % 128;
                int i33 = i32 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i34 = ((int[]) objArr[1])[0];
        int i35 = ((int[]) objArr[3])[0];
        if (i35 != i34) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                b = i36 % 128;
                int i37 = i36 % 2;
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i35));
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i38 = ((int[]) objArr[2])[0];
        int i39 = ((int[]) objArr[3])[0];
        int i40 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i41 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i42 = ~i41;
        int i43 = i38 + ((((~(379582462 | i42)) | (~((-33555975) | i41))) * 988) - 1103135707) + (((~(i41 | 101746318)) | 277836144 | (~(i42 | (-33555975)))) * 988);
        int i44 = (i43 << 13) ^ i43;
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr30[2])[0] = i45 ^ (i45 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iMyPid = Process.myPid();
        if (i4 != (((~((-73662545) | iMyPid)) | (-1996291450)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 334420058 + ((~((~iMyPid) | (-73662545))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
            throw null;
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_cannot_proccessed).substring(0, 6).length() - 1374328029;
        if (i5 != ((1284515164 + (((~(1959563601 | length)) | (-243652271)) * (-948))) + ((~((~length) | (-167855791))) * (-948))) - 1841046452) {
            throw null;
        }
        super.onResume();
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IllegalAccessException {
        ApplicationVersionActivity applicationVersionActivity = (ApplicationVersionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i5 = ~iUptimeMillis;
        if (i4 != 1365134180 + (((~(i5 | (-977671962))) | 147684418) * (-1042)) + (((-977671962) | iUptimeMillis) * 521) + (((~(iUptimeMillis | (-147684419))) | 9005122 | (~(i5 | (-838992666)))) * 521)) {
            throw new RuntimeException("-1080950861");
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyTid = Process.myTid();
        if (i6 != (-491241212) + ((~((~iMyTid) | (-92274713))) * 433) + (((~((-2049752771) | iMyTid)) | (-529303195)) * (-433)) + (((~(iMyTid | (-529303195))) | (-2142027483)) * 433)) {
            throw new RuntimeException("1129701763");
        }
        super.onStart();
        int i7 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = b + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i5 = (~((-9223581) | startUptimeMillis)) | 8955276;
        if (i4 != (-1473026136) + (i5 * 992) + ((i5 | (~((~startUptimeMillis) | (-838942820)))) * (-496)) + ((startUptimeMillis | (-839211124)) * 496)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int[] iArr = new int[470531515];
                iArr[470531514] = 0;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[470531515];
                iArr2[470531514] = 1;
                int i7 = (-1499207458) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i10 = (-28437636) + (((~(39290423 | i9)) | (-1755201755)) * 672);
        int i11 = ~i9;
        if (i8 != i10 + (((~(i9 | (-1755201755))) | (~((-39290424) | i11))) * (-672)) + (((~(1755201754 | i11)) | (-1793050368)) * 672)) {
            int i12 = 39004896 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ Unit b(ApplicationVersionActivity applicationVersionActivity) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        b = i2 % 128;
        int i3 = i2 % 2;
        applicationVersionActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        b = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static {
        asInterface = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 43;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(41483959, -41483958, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_video).substring(0, 5).codePointAt(1) - 392836847, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(1106116533, -1106116533, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), (-481969331) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.successful).substring(5, 6).codePointAt(0), new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step5).substring(28, 29).length() + 766876665, getHorizontalOffset.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    static void g() {
        TuitionPaymentFragmentbindingInflater1 = -83722256;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, short r7, byte r8) {
        /*
            int r7 = r7 + 119
            byte[] r0 = com.bpjstku.presentation.about.ApplicationVersionActivity.$$c
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r7 = r7 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.ApplicationVersionActivity.$$i(short, short, byte):java.lang.String");
    }
}
