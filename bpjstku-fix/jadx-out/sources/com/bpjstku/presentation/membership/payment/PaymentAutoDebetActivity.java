package com.bpjstku.presentation.membership.payment;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityPaymentAutoDebetBinding;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.payment.PaymentAutoDebetActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.datadog.android.core.internal.persistence.file.FileExtKt$readLinesSafe$1;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.EncoderImplByteBufferInput;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.TransformExperimental;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentAutoDebetActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPaymentAutoDebetBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentAutoDebetActivity extends BindingBaseActivity<ActivityPaymentAutoDebetBinding> {
    private static int[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {67, -127, -109, 9};
    private static final int $$f = 172;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {84, 10, 24, -102, 4, -11, -11, -19, -10, 6, -22, 38, -39, -21, -1, -22, 8, 52, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 57};
    private static final int $$k = 219;
    private static final byte[] $$a = {57, -56, 23, -36, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 50;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i6));
        int i12 = (~(i6 | i7)) | (~(i8 | i10));
        int i13 = ~(i5 | i4);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i5 + i4 + i3 + ((-1585779005) * i2) + (640148872 * i);
        int i17 = i16 * i16;
        int i18 = (i5 * 308833806) + 153878528 + (308833806 * i4) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i3) + (1159200768 * i2) + ((-734003200) * i) + (2089549824 * i17);
        int i19 = (i5 * (-1291220770)) + 263398195 + (i4 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * TypedValues.Custom.TYPE_FLOAT) + (i3 * (-1291221671)) + (i2 * (-1079815989)) + (i * 669414472) + (i17 * 145489920);
        return i18 + ((i19 * i19) * (-1699479552)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 144 - r5
            int r0 = r7 + 1
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = com.bpjstku.presentation.membership.payment.PaymentAutoDebetActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentAutoDebetActivity.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.payment.PaymentAutoDebetActivity.$$j
            int r7 = r7 * 30
            int r7 = r7 + 84
            int r6 = r6 * 2
            int r1 = 53 - r6
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-9)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentAutoDebetActivity.f(byte, short, byte, java.lang.Object[]):void");
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
        float f = 0.0f;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 11;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i6;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1)) + 3292, ExpandableListView.getPackedPositionChild(0L) + 32, 1948206109, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i7 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), Color.rgb(0, 0, 0) + 16780507, 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1948206109, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                f = 0.0f;
                i4 = -1870535734;
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = $10 + 27;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr4 = new Object[i5];
                objArr4[0] = Integer.valueOf(iArr5[i11]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3291, 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1948206109, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                i11++;
                int i12 = $10 + 31;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                iArr5 = iArr5;
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        char c = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = 17;
            for (int i15 = 1; i14 > i15; i15 = 1) {
                int i16 = $10 + 113;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 2559, TextUtils.indexOf("", "", 0, 0) + 29, 683220507, false, $$i(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i14--;
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28878 - ((byte) KeyEvent.getModifierMetaStateMask())), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 348, 25 - KeyEvent.normalizeMetaState(0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            c = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPaymentAutoDebetBinding> TuitionPaymentFragmentbindingInflater1() throws Throwable {
        int i;
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int i3 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
            int i4 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((short) 141, bArr[80], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, i3, i4, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{-690223496, 1967099485, -679271945, 242426559, 897187587, 1956764589, -949331244, -1236599485, -2014027220, -594805486, -148971066, 2013421447, 236302342, -836917051}, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{-301140559, -1726416194, -1517351957, 55105072, -931463360, -1861977674, 10725914, -2011962915, -1830790037, 1737524352}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31534 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int i5 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 141, b, (byte) (b | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, jumpTapTimeout, i5, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 31533);
                int i6 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0');
                byte b2 = $$a[7];
                Object[] objArr6 = new Object[1];
                c((short) 89, b2, (byte) (b2 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, i6, iLastIndexOf, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i7 = (int) Runtime.getRuntime().totalMemory();
            int i8 = 828843563 + (((~((-705058497) | (~i7))) | (~(1069021147 | i7))) * (-272)) + (((~((-798455491) | i7)) | 93396994) * (-272)) + (((~(i7 | 798455490)) | 975624153) * 272) + 1015898779;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                e(new int[]{1668681873, 1785963972, 515784351, 1310987385, -1465105387, 1490015217, 1172270390, 352383208, 1512861476, -960542986, 1905468709, 501025989, -348932771, -1673752862, -1638685042, 1314890062}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 10, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new int[]{-294532878, -1525465061, 482798557, 448129713, 410885685, 1393774684, -885496392, -1751725175, 651650930, -2145675877, -582588152, -1345801995}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 28, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                i = 2;
                int i12 = i11 % 2;
            } else {
                i = 2;
            }
            if (baseContext != null) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                int i14 = i13 % i;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new int[]{1714164523, 335176265, -962694023, -809611775, 968743684, 1931885811, -1118709166, -1772485156, -280111520, -1574648555}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{1824842342, 365512196, -910185937, -1495487835, -472808875, -389416297, -605175399, -1924920176, -310416110, -1841516745}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1015898779};
                byte[] bArr2 = $$j;
                Object[] objArr13 = new Object[1];
                f(bArr2[89], bArr2[43], bArr2[14], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b3 = bArr2[89];
                byte b4 = b3;
                Object[] objArr14 = new Object[1];
                f(b3, b4, (byte) (b4 | 51), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 31533);
                    int capsMode2 = 921 - TextUtils.getCapsMode("", 0, 0);
                    int i15 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                    byte b5 = $$a[7];
                    Object[] objArr16 = new Object[1];
                    c((short) 89, b5, (byte) (b5 | 37), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, capsMode2, i15, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new int[]{-690223496, 1967099485, -679271945, 242426559, 897187587, 1956764589, -949331244, -1236599485, -2014027220, -594805486, -148971066, 2013421447, 236302342, -836917051}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new int[]{-301140559, -1726416194, -1517351957, 55105072, -931463360, -1861977674, 10725914, -2011962915, -1830790037, 1737524352}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_invalid_input_telkomsel).substring(0, 6).codePointAt(5) - 82, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                        byte b6 = $$a[7];
                        Object[] objArr19 = new Object[1];
                        c((short) 141, b6, (byte) (b6 | 52), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, scrollBarFadeDuration, doubleTapTimeout, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char minimumFlingVelocity = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
                        int iMyTid = (Process.myTid() >> 22) + 28;
                        byte[] bArr3 = $$a;
                        byte b7 = bArr3[80];
                        byte b8 = bArr3[7];
                        Object[] objArr20 = new Object[1];
                        c((short) 141, b7, b8, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, maximumFlingVelocity, iMyTid, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            int i16 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = ~iIdentityHashCode;
            int i18 = i16 + 1954434400 + (((~(i17 | 1517509727)) | 256569916) * (-1042)) + ((1517509727 | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-256569917))) | 172118044 | (~(i17 | 1601961599))) * 521);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
            return PaymentAutoDebetActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr == null) {
            throw null;
        }
        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
        int i22 = i21 % 2;
        for (String str : strArr) {
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
            int i24 = i23 % 2;
            arrayList.add(str);
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final PaymentAutoDebetActivity paymentAutoDebetActivity = (PaymentAutoDebetActivity) objArr[0];
        int i = 2 % 2;
        Button button = ((ActivityPaymentAutoDebetBinding) ((ViewBinding) paymentAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnOk;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setContentWidth
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        startActivity(Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse("https://www.tokopedia.com/langganan")), "Open With"));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
            int i2 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iResolveSize = 23 - View.resolveSize(0, 0);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 89, b, (byte) (b | 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, i2, iResolveSize, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b2 = $$a[7];
                Object[] objArr3 = new Object[1];
                c((short) 141, b2, (byte) (b2 | 52), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iIndexOf, threadPriority, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ~iIdentityHashCode;
            int i4 = ~((-1002268826) | i3);
            int i5 = ~(789666399 | iIdentityHashCode);
            int i6 = (-1774707662) + ((i4 | i5) * 1150) + (((~((-789666400) | i3)) | i5) * (-575)) + (((~(iIdentityHashCode | (-1002268826))) | (~(i3 | 1002268825))) * 575) + 1056698963;
            int i7 = i6 ^ (i6 << 13);
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{1714164523, 335176265, -962694023, -809611775, 968743684, 1931885811, -1118709166, -1772485156, -280111520, -1574648555}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{1824842342, 365512196, -910185937, -1495487835, -472808875, -389416297, -605175399, -1924920176, -310416110, -1841516745}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1533953957};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42048 - TextUtils.lastIndexOf("", '0', 0, 0)), 1726 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1056698963, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 29944);
                    int threadPriority2 = 1755 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c((short) 141, b3, (byte) (b3 | 52), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, threadPriority2, iResolveOpacity, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{-690223496, 1967099485, -679271945, 242426559, 897187587, 1956764589, -949331244, -1236599485, -2014027220, -594805486, -148971066, 2013421447, 236302342, -836917051}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{-301140559, -1726416194, -1517351957, 55105072, -931463360, -1861977674, 10725914, -2011962915, -1830790037, 1737524352}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char edgeSlop = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iIndexOf2 = 23 - TextUtils.indexOf("", "");
                        short s = (short) ($$b + 2);
                        byte b4 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c(s, b4, (byte) (b4 | 52), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, iMakeMeasureSpec, iIndexOf2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyPid = (char) (29944 - (Process.myPid() >> 22));
                        int iRgb = Color.rgb(0, 0, 0) + 16778971;
                        int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                        byte b5 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((short) 89, b5, (byte) (b5 | 37), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, iRgb, deadChar, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i13 = ~i12;
        int i14 = i11 + 103761587 + (((~((-34771442) | i13)) | (~((-177830985) | i12))) * 1900) + (((~(i13 | 177830984)) | (~(i12 | 34771441))) * (-950)) + (((~(i12 | 177830984)) | (~(i13 | 34771441))) * 950);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
        int i18 = i17 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int mirror = AndroidCharacter.getMirror('0') + 983;
            int i19 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
            short s2 = $$a[7];
            byte b6 = (byte) s2;
            Object[] objArr14 = new Object[1];
            c(s2, b6, (byte) (b6 | 52), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, mirror, i19, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new int[]{-690223496, 1967099485, -679271945, 242426559, 897187587, 1956764589, -949331244, -1236599485, -2014027220, -594805486, -148971066, 2013421447, 236302342, -836917051}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new int[]{-301140559, -1726416194, -1517351957, 55105072, -931463360, -1861977674, 10725914, -2011962915, -1830790037, 1737524352}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step2).substring(35, 36).length() + 14, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
            byte b7 = $$a[7];
            Object[] objArr17 = new Object[1];
            c((short) 141, b7, (byte) (b7 | 52), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop2, packedPositionChild, touchSlop, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                int iBlue = 1031 - Color.blue(0);
                int i20 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr18 = new Object[1];
                c((short) 141, bArr[80], bArr[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(absoluteGravity2, iBlue, i20, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr19[3])[0];
            int i22 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iMyTid = Process.myTid();
            int i23 = ~iMyTid;
            int i24 = 731725265 + (((~((-277983275) | i23)) | (~((-191254213) | iMyTid))) * 520);
            int i25 = ~(191254212 | i23);
            int i26 = ~(iMyTid | 435534382);
            int i27 = ((i24 + ((i25 | i26) * (-1040))) + ((i26 | ((~(i23 | (-435534383))) | (-469237487))) * 520)) - 1697717099;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new int[]{1714164523, 335176265, -962694023, -809611775, 968743684, 1931885811, -1118709166, -1772485156, -280111520, -1574648555}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new int[]{1824842342, 365512196, -910185937, -1495487835, -472808875, -389416297, -605175399, -1924920176, -310416110, -1841516745}, 16 - View.MeasureSpec.getMode(0), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1533953957};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (TextUtils.getTrimmedLength("") + 46038), TextUtils.lastIndexOf("", '0') + 1135, 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1697717099, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                int iResolveSize2 = 1031 - View.resolveSize(0, 0);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
                short s3 = $$a[7];
                byte b8 = (byte) s3;
                Object[] objArr24 = new Object[1];
                c(s3, b8, (byte) (b8 | 52), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, iResolveSize2, iCombineMeasuredStates, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 45993), 1117 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                int iIndexOf3 = 15 - TextUtils.indexOf("", "", 0);
                byte[] bArr2 = $$a;
                Object[] objArr25 = new Object[1];
                c((short) 141, bArr2[80], bArr2[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cRgb, pressedStateDuration, iIndexOf3, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new int[]{-690223496, 1967099485, -679271945, 242426559, 897187587, 1956764589, -949331244, -1236599485, -2014027220, -594805486, -148971066, 2013421447, 236302342, -836917051}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_message_not_enabled).substring(17, 18).codePointAt(0) - 10, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new int[]{-301140559, -1726416194, -1517351957, 55105072, -931463360, -1861977674, 10725914, -2011962915, -1830790037, 1737524352}, 15 - Color.red(0), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int windowTouchSlop2 = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i30 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte b9 = $$a[7];
                    Object[] objArr28 = new Object[1];
                    c((short) 141, b9, (byte) (b9 | 52), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollBarSize, windowTouchSlop2, i30, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int scrollBarFadeDuration = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i31 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    short s4 = $$a[7];
                    byte b10 = (byte) s4;
                    Object[] objArr29 = new Object[1];
                    c(s4, b10, (byte) (b10 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionGroup, scrollBarFadeDuration, i31, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
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
                int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i36 % 128;
                for (int i37 = i36 % 2 != 0 ? 0 : 1; i37 < strArr3.length; i37++) {
                    arrayList2.add(strArr3[i37]);
                }
            }
            throw new RuntimeException(String.valueOf(i35));
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i38 = ((int[]) objArr[2])[0];
        int i39 = ((int[]) objArr[3])[0];
        int i40 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i41 = ~iIdentityHashCode2;
        int i42 = i38 + ((((~(i41 | (-575576497))) | ((~((-819856667) | i41)) | 541982992)) * (-397)) - 238418328) + ((iIdentityHashCode2 | (-311467179)) * 397);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr30[2])[0] = i44 ^ (i44 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00aa  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            if (i3 != (-1869657114) + ((~((~i4) | (-21237765))) * 433) + (((~(1095652188 | i4)) | (-265664646)) * (-433)) + (((~(i4 | (-265664646))) | 1074414424) * 433)) {
                int[] iArr = new int[717861081];
                iArr[717861080] = 1;
                int i5 = 941844248 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i6 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            if (i6 != 183490024 + (((~((-1012421157) | i7)) | 268964356 | (~(1842408699 | i7))) * (-1136)) + (((~((-1012421157) | iIdentityHashCode)) | (~(1842408699 | iIdentityHashCode)) | (~((-1098951900) | i7))) * (-568)) + (((~(iIdentityHashCode | (-268964357))) | (~(i7 | (-1842408700))) | (~(1012421156 | i7))) * 568)) {
                int[] iArr2 = new int[717861081];
                iArr2[717861080] = 1;
                int i8 = 941844248 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i9 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i10 = ~((int) Runtime.getRuntime().totalMemory());
        if (i9 != ((((~((-349957868) | i10)) | 81348193) * (-241)) - 1502517347) + (((~(i10 | (-268609675))) | (-2147217392)) * 241)) {
            int i11 = 1202723584 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i4 != 550387624 + (((~((-128604676) | iUptimeMillis)) | 109578753) * 1504) + ((~(iUptimeMillis | (-19025923))) * (-1504)) + 1316904864) {
            throw null;
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMyPid = Process.myPid();
        int i6 = ~iMyPid;
        if (i5 != 767966968 + ((2042180815 | i6) * (-369)) + (((~((-831009934) | i6)) | 1748046031) * (-369)) + (((~(iMyPid | 831009933)) | 1211170882 | (~(i6 | (-294134785)))) * 369)) {
            throw null;
        }
        super.onStart();
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b7, code lost:
    
        if (r1 != ((1623409585 + (r2 * 495)) + (((~r2) | 704743430) * 495))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b9, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.membership.payment.PaymentAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        com.bpjstku.presentation.membership.payment.PaymentAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c5, code lost:
    
        if ((r10 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c7, code lost:
    
        r10 = 59 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ca, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d2, code lost:
    
        throw new java.lang.RuntimeException("-1075607323");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00da, code lost:
    
        throw new java.lang.RuntimeException("-148272190");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005c, code lost:
    
        if (r1 == ((((-730401040) + (((~(r5 | (-1098925145))) | 268937601) * 220)) + (((~(r5 | (-1742755451))) | 912767907) * (-440))) + ((r4 | (-1098925145)) * 220))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0094, code lost:
    
        if (r1 == (((1759517702 + (((~((-269518898) | r4)) | (~((-1099506441) | r4))) * 69)) + (((~(r4 | (-1709799311))) | ((~((-879811768) | r4)) | 610292870)) * (-69))) + 865997120)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0096, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = (~java.lang.System.identityHashCode(r9)) | 780246294;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentAutoDebetActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentAutoDebetActivity paymentAutoDebetActivity, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentAutoDebetActivity, null, null, 44);
            paymentAutoDebetActivity.d_();
            return Unit.INSTANCE;
        }
        MainActivity.Companion companion2 = MainActivity.INSTANCE;
        MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentAutoDebetActivity, null, null, 6);
        paymentAutoDebetActivity.d_();
        return Unit.INSTANCE;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        d();
        INSTANCE = new Companion(null);
        int i = d + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 89 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_payment_auto_debet;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, 1040309898, -1040309897, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this}, -1308702781, 1308702781, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static void d() {
        TuitionPaymentFragmentbindingInflater1 = new int[]{-1473729891, 2110781494, -477810743, 415859433, 1319453379, -1562123638, 180350911, 218501244, -1032819379, -22559183, -961494989, 1719766690, -927603810, -2109149521, -1627083121, -898245187, -1117115489, -841228419};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        PaymentAutoDebetActivity paymentAutoDebetActivity = (PaymentAutoDebetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static String $$i(short s, short s2, short s3) {
        int i = (s3 * 56) + 66;
        int i2 = (s * 3) + 4;
        byte[] bArr = $$c;
        int i3 = s2 * 2;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i += i3;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i += bArr[i2];
            i2++;
        }
    }
}
