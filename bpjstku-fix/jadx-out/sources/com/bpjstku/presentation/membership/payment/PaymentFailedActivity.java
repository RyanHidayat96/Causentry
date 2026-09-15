package com.bpjstku.presentation.membership.payment;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityPaymentFailedBinding;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.payment.PaymentFailedActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_face.zzee;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.getSessionConfigTemplateType;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\r\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u001b\u0010\u0007\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0015\u0010\u0006\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0017"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentFailedActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPaymentFailedBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "", "cancelAll", "()Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "()I", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentFailedActivity extends BindingBaseActivity<ActivityPaymentFailedBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f532a;
    private static char asBinder;
    private static char asInterface;
    private static int cancel;
    private static char d;
    private static final byte[] $$c = {58, -51, 54, -115};
    private static final int $$f = 102;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {81, -102, -70, -91, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -20, 16, -7, 13, -3, 4, 18, -4, 8, 1, 1, 58, -73, 3, 14, -6, -48, 18, 3, 4, -10, 16, 4, 38, -49, 20, -2, -3, 31, -30, 5, 16, 7, -9, 43, -48, 7, 18, -10, 7, 16, -8, 28, -35, 14, -3, 15, 6, -12, 14, 9, 26, -18, -9, 14, 1, 6, 51, 16, -45, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 21, -4, -2, 13, -2, -2, 10, 33, -34, 11, -3, 14, -16, 18, -10, 68};
    private static final int $$k = 207;
    private static final byte[] $$a = {57, -50, -56, -93, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 110;
    private static int INotificationSideChannel = 0;
    private static int g = 0;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: postShow
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentFailedActivity.b(this.b);
        }
    });
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: setDropDownGravity
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(PaymentFailedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        }
    });
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: setHeight
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(PaymentFailedActivity.TuitionPaymentFragmentbindingInflater1(this.b));
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: setInputMethodMode
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.b};
            return (String) PaymentFailedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzee.b(), zzee.b(), objArr, 1838268841, zzee.b(), zzee.b(), -1838268840);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i3) | i7 | i);
        int i9 = (~i) | i7;
        int i10 = i8 | (~(i9 | i3)) | (~(i6 | i3 | i));
        int i11 = ~i9;
        int i12 = (~(i | i6)) | i3 | i11;
        int i13 = (~(i7 | i3)) | i11;
        int i14 = i6 + i3 + i2 + (933655473 * i5) + ((-1037598838) * i4);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i6) - 925892608) + (470833381 * i3) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i2) + ((-1691877376) * i5) + ((-393216000) * i4) + ((-1633878016) * i15);
        int i17 = ((i6 * (-727610197)) - 1081761860) + (i3 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i2 * (-727609241)) + (i5 * 1532828727) + (i4 * (-747900794)) + (i15 * 556466176);
        int i18 = i16 + (i17 * i17 * (-1911357440));
        if (i18 != 1) {
            return i18 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 1
            int r7 = 162 - r7
            byte[] r1 = com.bpjstku.presentation.membership.payment.PaymentFailedActivity.$$a
            int r8 = 100 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r3 = r6
            r4 = r2
            goto L26
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L1e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L1e:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L26:
            int r8 = -r8
            int r7 = r7 + 1
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentFailedActivity.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 152 - r8
            int r7 = r7 + 66
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.membership.payment.PaymentFailedActivity.$$j
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L28
        L10:
            r3 = r2
        L11:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + 3
            r8 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentFailedActivity.f(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.PaymentFailedActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentFailedActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "p3", "p4", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Ljava/lang/String;ZZLjava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, String p1, boolean p2, boolean p3, String p4) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p4, "");
            Intent intent = new Intent(p0, (Class<?>) PaymentFailedActivity.class);
            intent.putExtra("status_transaction_payment", p1);
            intent.putExtra("key_sertakan_deeplink", p2);
            intent.putExtra("key_bpu_deeplink", p3);
            intent.putExtra("userId", p4);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = $11 + 63;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $11 + 11;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) asBinder) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asInterface);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c3 = (char) ((TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47773);
                        int iLastIndexOf = 467 - TextUtils.lastIndexOf("", '0', i3, i3);
                        int iAlpha = 13 - Color.alpha(i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, iLastIndexOf, iAlpha, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) d) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f532a)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 47773), ExpandableListView.getPackedPositionGroup(0L) + 468, (ViewConfiguration.getEdgeSlop() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2323 - TextUtils.indexOf("", "", 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 45, -1312321721, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    private final boolean cancelAll() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = g + 85;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int tapTimeout = 876 - (ViewConfiguration.getTapTimeout() >> 16);
            int defaultSize = 10 - View.getDefaultSize(0, 0);
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[26]);
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 148), (byte) (-bArr[31]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, tapTimeout, defaultSize, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{52834, 17719, 61717, 14828, 33698, 57562, 46823, 50920, 45446, 51119, 36506, 37062, 31516, 38030, 9902, 26773, 38754, 9775, 13175, 25731, 47641, 65164, 59611, 38438}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{2041, 12474, 22474, 31679, 48445, 29921, 10069, 33791, 17947, 61033, 64573, 41382, 43112, 7743, 7949, 6154, 13835, 7268}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int iArgb = Color.argb(0, 0, 0, 0) + 876;
            int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte b2 = $$a[24];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            c(b3, (short) (b3 | 148), b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, iArgb, minimumFlingVelocity, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = g + 23;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr2[42], (short) 148, (byte) (-bArr2[31]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, iRgb, offsetBefore, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            Object[] objArr8 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i7 = (-1349031468) + (((~((-497440235) | elapsedCpuTime)) | 457130005) * (-318));
            int i8 = ~(457130005 | elapsedCpuTime);
            int i9 = ~elapsedCpuTime;
            int i10 = i7 + ((i8 | (~((-35192854) | i9))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(elapsedCpuTime | (-35192854))) | (~(532633087 | i9))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 182644609;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr8[1])[0] = i12 ^ (i12 << 5);
            objArr = objArr8;
            c = 2;
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{63051, 59903, 27931, 48698, 54434, 23036, 18417, 54502, 22892, 38826, 27651, 25379, 37434, 52161, 7255, 52949, 44499, 20448}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_status_code_500).substring(13, 15).length() + 14, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{53674, 22810, 23835, 34931, 38848, 63855, 49214, 57442, 18668, 25845, 17658, 39750, 16184, 48884, 21484, 25944, 1907, 17080}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_method_empty).substring(5, 7).length() + 14, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i13 = cancelAll + 75;
            g = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr11 = {Integer.valueOf(iIntValue), 182644609};
                byte[] bArr3 = $$j;
                Object[] objArr12 = new Object[1];
                f((byte) 53, bArr3[107], (short) 149, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b4 = (byte) (bArr3[50] - 1);
                byte b5 = (byte) (b4 | 32);
                Object[] objArr13 = new Object[1];
                f(b4, b5, (short) (b5 | 64), objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr4 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr4[42], (short) 148, (byte) (-bArr4[31]), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, edgeSlop, fadingEdgeLength, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{52834, 17719, 61717, 14828, 33698, 57562, 46823, 50920, 45446, 51119, 36506, 37062, 31516, 38030, 9902, 26773, 38754, 9775, 13175, 25731, 47641, 65164, 59611, 38438}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{2041, 12474, 22474, 31679, 48445, 29921, 10069, 33791, 17947, 61033, 64573, 41382, 43112, 7743, 7949, 6154, 13835, 7268}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int iNormalizeMetaState = 876 - KeyEvent.normalizeMetaState(0);
                        int longPressTimeout = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b6 = $$a[24];
                        byte b7 = b6;
                        Object[] objArr17 = new Object[1];
                        c(b7, (short) (b7 | 148), b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, iNormalizeMetaState, longPressTimeout, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0');
                        int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0');
                        byte[] bArr5 = $$a;
                        byte b8 = (byte) (-bArr5[26]);
                        Object[] objArr18 = new Object[1];
                        c(b8, (short) (b8 | 148), (byte) (-bArr5[31]), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, iLastIndexOf, iIndexOf, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i15 = cancelAll + 79;
                    g = i15 % 128;
                    c = 2;
                    if (i15 % 2 != 0) {
                        int i16 = 3 / 3;
                    }
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
        int i17 = ((int[]) objArr[c])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 != i17) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                while (i4 < strArr.length) {
                    arrayList.add(strArr[i4]);
                    i4++;
                    int i19 = cancelAll + 35;
                    g = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i18));
        }
        int i21 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i22 = (~(601870291 | iIdentityHashCode)) | 67117096;
        int i23 = ~iIdentityHashCode;
        int i24 = i21 + 498992236 + ((i22 | (~((-26806868) | i23))) * 886) + (((~(i23 | (-601870292))) | 642180520) * (-1772)) + ((~(i23 | 642180520)) * 886);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr19[1])[0] = i26 ^ (i26 << 5);
        int i27 = g + 27;
        cancelAll = i27 % 128;
        if (i27 % 2 != 0) {
            return ((Boolean) this.b.getValue()).booleanValue();
        }
        int i28 = 80 / 0;
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPaymentFailedBinding> TuitionPaymentFragmentbindingInflater1() {
        PaymentFailedActivity$bindingInflater$1 paymentFailedActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = cancelAll + 77;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            paymentFailedActivity$bindingInflater$1 = PaymentFailedActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = 40 / 0;
        } else {
            paymentFailedActivity$bindingInflater$1 = PaymentFailedActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i4 = cancelAll + 45;
        g = i4 % 128;
        int i5 = i4 % 2;
        return paymentFailedActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = g + 21;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i4 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (bArr[15] - 1), (short) 141, (byte) (-bArr[17]), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, edgeSlop, -1650998592, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{52834, 17719, 61717, 14828, 33698, 57562, 46823, 50920, 45446, 51119, 36506, 37062, 31516, 38030, 9902, 26773, 38754, 9775, 13175, 25731, 47641, 65164, 59611, 38438}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{2041, 12474, 22474, 31679, 48445, 29921, 10069, 33791, 17947, 61033, 64573, 41382, 43112, 7743, 7949, 6154, 13835, 7268}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step3).substring(0, 1).codePointAt(0) - 52, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
            int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte b = (byte) 52;
            Object[] objArr6 = new Object[1];
            c(b, (short) (b << 1), (byte) (-$$a[17]), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, fadingEdgeLength, keyRepeatTimeout, 2012020043, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                int iArgb = 10 - Color.argb(0, 0, 0, 0);
                byte b2 = (byte) 52;
                Object[] objArr7 = new Object[1];
                c(b2, b2, (byte) (-$$a[17]), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, tapTimeout, iArgb, 2012931276, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i6 = ((1001096684 + (((~i5) | 111753781) * 1444)) + (((~(i5 | (-858067763))) | ((~(898377991 | i5)) | 35721776)) * (-1444))) - 475543512;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr9 = new Object[1];
                e(new char[]{46355, 47595, 60745, 16625, 21191, 20503, 21065, 2354, 47360, 16601, 59400, 20656, 62597, 20876, 41739, 34914, 63177, 32589, 56368, 3617, 10627, 6718, 15417, 5536, 31454, 51900, 9312, 30139}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 89, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                e(new char[]{25727, 60052, 51236, 60630, 16819, 56462, 23738, 12709, 3867, 56637, 23605, 3415, 56108, 33741, 27522, 37822, 59180, 59893, 53782, 22387}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku_instruction_step3).substring(19, 20).codePointAt(0) - 87, objArr10);
                baseContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i9 = cancelAll + 123;
                g = i9 % 128;
                if (i9 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e(new char[]{63051, 59903, 27931, 48698, 54434, 23036, 18417, 54502, 22892, 38826, 27651, 25379, 37434, 52161, 7255, 52949, 44499, 20448}, 16 - Drawable.resolveOpacity(0, 0), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(new char[]{53674, 22810, 23835, 34931, 38848, 63855, 49214, 57442, 18668, 25845, 17658, 39750, 16184, 48884, 21484, 25944, 1907, 17080}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i10 = cancelAll + 123;
            g = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr13 = {baseContext, Integer.valueOf(iIntValue), 0, -1393691532};
                byte[] bArr2 = $$j;
                byte b3 = (byte) (bArr2[50] - 1);
                Object[] objArr14 = new Object[1];
                f((byte) 96, b3, (short) (b3 | 96), objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                f((byte) (bArr2[64] - 1), bArr2[29], (short) (bArr2[50] - 1), objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                        int iAxisFromString = MotionEvent.axisFromString("") + 877;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 10;
                        byte b4 = (byte) 52;
                        Object[] objArr17 = new Object[1];
                        c(b4, b4, (byte) (-$$a[17]), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iAxisFromString, capsMode, 2012931276, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(new char[]{52834, 17719, 61717, 14828, 33698, 57562, 46823, 50920, 45446, 51119, 36506, 37062, 31516, 38030, 9902, 26773, 38754, 9775, 13175, 25731, 47641, 65164, 59611, 38438}, 22 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(new char[]{2041, 12474, 22474, 31679, 48445, 29921, 10069, 33791, 17947, 61033, 64573, 41382, 43112, 7743, 7949, 6154, 13835, 7268}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                            int iMyTid = 876 - (Process.myTid() >> 22);
                            int i12 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte b5 = (byte) 52;
                            Object[] objArr20 = new Object[1];
                            c(b5, (short) (b5 << 1), (byte) (-$$a[17]), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, iMyTid, i12, 2012020043, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                            int iGreen = Color.green(0) + 876;
                            int bitsPerPixel = 9 - ImageFormat.getBitsPerPixel(0);
                            byte[] bArr3 = $$a;
                            Object[] objArr21 = new Object[1];
                            c((byte) (bArr3[15] - 1), (short) 141, (byte) (-bArr3[17]), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, iGreen, bitsPerPixel, -1650998592, false, (String) objArr21[0], null);
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
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i16 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i17 = i15 + 2063533684 + ((61281901 | i16) * 376) + (((~((~i16) | 320839329)) | 10485836) * (-376)) + (((~(i16 | (-320839330))) | (-280529101)) * 376);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[1])[0] = i19 ^ (i19 << 5);
        } else {
            int[] iArr = new int[i14];
            int i20 = i14 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i23 = i21 + (((1795330146 + (((~((-277366790) | i22)) | (~((-237056561) | i22))) * 69)) + (((~(i22 | (-241546033))) | ((~((-281856262) | i22)) | 4489472)) * (-69))) - 1445246350);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[1])[0] = i25 ^ (i25 << 5);
            int i26 = g + 23;
            cancelAll = i26 % 128;
            int i27 = i26 % 2;
        }
        Button button = ((ActivityPaymentFailedBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnOk;
        int i28 = ((int[]) objArr2[1])[0];
        int i29 = ((((i28 * i28) - (~(-(1552936026 * i28)))) - 1) - (~(-(i28 * (-124150208))))) - 48785112;
        int i30 = (((i29 >> 20) - 8191) / 4096) + 1;
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        int i32 = i29 >> 29;
        int i33 = ((i32 ^ (-15)) + ((i32 & (-15)) << 1)) / 8;
        int i34 = -(((i33 ^ 1) + ((i33 & 1) << 1)) ^ i31);
        int i35 = (i34 & 8) + (i34 | 8);
        int i36 = i35 >> 28;
        int i37 = ((i36 & (-31)) + (i36 | (-31))) / 16;
        int i38 = (i37 & 1) + (i37 | 1);
        Intrinsics.checkNotNullExpressionValue(button, "14\\13\\25\\btnOk".substring(102888 / (((-((i38 & 1) + (i38 | 1))) & i35) * 1429)));
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setListItemExpandMax
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return PaymentFailedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj2);
            }
        }));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        String str;
        String str2;
        int i = 2 % 2;
        if (Intrinsics.areEqual((String) this.TuitionPaymentFragmentbindingInflater1.getValue(), "PENDING")) {
            ((ActivityPaymentFailedBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgPaymentResult.setImageResource(R.drawable.ic_asik_loading_send_data);
            ((ActivityPaymentFailedBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvStatusPaymentResult.setText("Pembayaran Dalam Proses");
            int i2 = g + 95;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
        }
        if (Intrinsics.areEqual((String) this.TuitionPaymentFragmentbindingInflater1.getValue(), "PENDING")) {
            int i4 = g;
            int i5 = i4 + 111;
            cancelAll = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = i4 + 85;
            cancelAll = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 3;
            }
            str = "pending_payment_sertakan_deeplink";
        } else {
            str = "failed_payment_sertakan_deeplink";
        }
        if (Intrinsics.areEqual((String) this.TuitionPaymentFragmentbindingInflater1.getValue(), "PENDING")) {
            int i8 = cancelAll + 109;
            g = i8 % 128;
            int i9 = i8 % 2;
            str2 = "pending_payment_bpu_deeplink";
        } else {
            str2 = "failed_payment_bpu_deeplink";
        }
        if (cancelAll()) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("user_id", (String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()));
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        }
        if (((Boolean) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).booleanValue()) {
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("user_id", (String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()));
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, mapMutableMapOf2);
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrB$7879113;
        int i = 0;
        PaymentFailedActivity paymentFailedActivity = (PaymentFailedActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte b = (byte) 52;
            Object[] objArr3 = new Object[1];
            c(b, b, (byte) (-$$a[17]), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iMakeMeasureSpec, threadPriority, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{52834, 17719, 61717, 14828, 33698, 57562, 46823, 50920, 45446, 51119, 36506, 37062, 31516, 38030, 9902, 26773, 38754, 9775, 13175, 25731, 47641, 65164, 59611, 38438}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_gopay_qris).substring(0, 6).length() + 16, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{2041, 12474, 22474, 31679, 48445, 29921, 10069, 33791, 17947, 61033, 64573, 41382, 43112, 7743, 7949, 6154, 13835, 7268}, 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
            byte b2 = (byte) 52;
            Object[] objArr6 = new Object[1];
            c(b2, (short) (b2 << 1), (byte) (-$$a[17]), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, maxKeyCode, iCombineMeasuredStates, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = g + 89;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
                int i5 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b3 = bArr[24];
                Object[] objArr7 = new Object[1];
                c(b3, b3, bArr[94], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, absoluteGravity, i5, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr8[3])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i8 = ((1834870540 + (((~((-224273) | iElapsedRealtime)) | (~(244055897 | iElapsedRealtime))) * 69)) + (((~(iElapsedRealtime | 235105873)) | ((~((-9174297) | iElapsedRealtime)) | 8950024)) * (-69))) - 680294758;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr2[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{63051, 59903, 27931, 48698, 54434, 23036, 18417, 54502, 22892, 38826, 27651, 25379, 37434, 52161, 7255, 52949, 44499, 20448}, TextUtils.lastIndexOf("", '0', 0, 0) + 17, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{53674, 22810, 23835, 34931, 38848, 63855, 49214, 57442, 18668, 25845, 17658, 39750, 16184, 48884, 21484, 25944, 1907, 17080}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_token_no).substring(0, 16).length(), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, paymentFailedActivity)).intValue();
            try {
                Object[] objArr11 = {-1242409425};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.getGidForName("") + 46039), View.resolveSize(0, 0) + 1134, View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 292743957, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                    byte b4 = (byte) 52;
                    Object[] objArr13 = new Object[1];
                    c(b4, b4, (byte) (-$$a[17]), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, packedPositionGroup, iKeyCodeFromString, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getCapsMode("", 0, 0) + 45993), View.resolveSize(0, 0) + 1117, 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int modifierMetaStateMask = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int deadChar2 = 15 - KeyEvent.getDeadChar(0, 0);
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[24];
                    Object[] objArr14 = new Object[1];
                    c(b5, b5, bArr2[94], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, modifierMetaStateMask, deadChar2, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{52834, 17719, 61717, 14828, 33698, 57562, 46823, 50920, 45446, 51119, 36506, 37062, 31516, 38030, 9902, 26773, 38754, 9775, 13175, 25731, 47641, 65164, 59611, 38438}, 22 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{2041, 12474, 22474, 31679, 48445, 29921, 10069, 33791, 17947, 61033, 64573, 41382, 43112, 7743, 7949, 6154, 13835, 7268}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 97, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                        int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                        byte b6 = (byte) 52;
                        Object[] objArr17 = new Object[1];
                        c(b6, (short) (b6 << 1), (byte) (-$$a[17]), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, i11, scrollBarFadeDuration2, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
                        int i12 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                        byte b7 = (byte) 52;
                        Object[] objArr18 = new Object[1];
                        c(b7, b7, (byte) (-$$a[17]), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionGroup2, capsMode, i12, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i13 = ((int[]) objArr2[1])[0];
        int i14 = ((int[]) objArr2[3])[0];
        if (i14 == i13) {
            int i15 = cancelAll + 115;
            g = i15 % 128;
            int i16 = i15 % 2;
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr2[2])[0];
            int i18 = ((int[]) objArr2[3])[0];
            int i19 = ((int[]) objArr2[1])[0];
            String[] strArr2 = (String[]) objArr2[0];
            int iMyTid = Process.myTid();
            int i20 = ~iMyTid;
            int i21 = i17 + (-1394001451) + (((~(iMyTid | (-434265281))) | (~((-538017835) | i20)) | 293737664) * (-68)) + ((~((-140527617) | i20)) * (-68)) + (((~(434265280 | i20)) | (-678545451)) * 68);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr19[2])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr2[2])[0];
            int i25 = ((int[]) objArr2[3])[0];
            int i26 = ((int[]) objArr2[1])[0];
            String[] strArr4 = (String[]) objArr2[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i27 = 1642562321 + ((~(elapsedCpuTime | 1030103756)) * 216);
            int i28 = ~elapsedCpuTime;
            int i29 = i24 + i27 + ((1073133550 | i28) * (-216)) + (((~(i28 | 1030103756)) | (-785823587)) * 216);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr20[2])[0] = i31 ^ (i31 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
            int capsMode2 = 1755 - TextUtils.getCapsMode("", 0, 0);
            int i32 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr3 = $$a;
            Object[] objArr21 = new Object[1];
            c((byte) (bArr3[15] - 1), (short) 141, (byte) (-bArr3[17]), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionChild, capsMode2, i32, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i33 = cancelAll + 103;
            g = i33 % 128;
            int i34 = i33 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                int i35 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b8 = (byte) 52;
                Object[] objArr22 = new Object[1];
                c(b8, (short) (b8 << 1), (byte) (-$$a[17]), objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maximumDrawingCacheSize, windowTouchSlop, i35, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i36 = ~((-212603011) | startElapsedRealtime);
            int i37 = ~startElapsedRealtime;
            int i38 = 212893170 + ((i36 | (~(1019215835 | i37))) * 497) + (((~(startElapsedRealtime | 1019215835)) | (~((-1019215252) | i37)) | 806612241) * 497) + 307463271;
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i40 ^ (i40 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            e(new char[]{63051, 59903, 27931, 48698, 54434, 23036, 18417, 54502, 22892, 38826, 27651, 25379, 37434, 52161, 7255, 52949, 44499, 20448}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            e(new char[]{53674, 22810, 23835, 34931, 38848, 63855, 49214, 57442, 18668, 25845, 17658, 39750, 16184, 48884, 21484, 25944, 1907, 17080}, TextUtils.getCapsMode("", 0, 0) + 16, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, paymentFailedActivity)).intValue();
            Object[] objArr26 = {-1242409425};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 42049), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1725, 29 - (KeyEvent.getMaxKeyCode() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), 307463271, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
                int maximumDrawingCacheSize2 = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int capsMode3 = 23 - TextUtils.getCapsMode("", 0, 0);
                byte b9 = (byte) 52;
                Object[] objArr27 = new Object[1];
                c(b9, (short) (b9 << 1), (byte) (-$$a[17]), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(trimmedLength, maximumDrawingCacheSize2, capsMode3, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{52834, 17719, 61717, 14828, 33698, 57562, 46823, 50920, 45446, 51119, 36506, 37062, 31516, 38030, 9902, 26773, 38754, 9775, 13175, 25731, 47641, 65164, 59611, 38438}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_rba_unsuccessful).substring(0, 1).codePointAt(0) - 58, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{2041, 12474, 22474, 31679, 48445, 29921, 10069, 33791, 17947, 61033, 64573, 41382, 43112, 7743, 7949, 6154, 13835, 7268}, 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int iMyPid = 1755 - (Process.myPid() >> 22);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                    byte[] bArr4 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((byte) 52, bArr4[24], (byte) (-bArr4[17]), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(doubleTapTimeout, iMyPid, minimumFlingVelocity, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                    int trimmedLength2 = TextUtils.getTrimmedLength("") + 1755;
                    int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr31 = new Object[1];
                    c((byte) (bArr5[15] - 1), (short) 141, (byte) (-bArr5[17]), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, trimmedLength2, iRgb, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i41 = ((int[]) objArrB$7879113[1])[0];
        int i42 = ((int[]) objArrB$7879113[0])[0];
        if (i42 == i41) {
            int i43 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr32 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iMyTid2 = Process.myTid();
            int i44 = i43 + (-91527707) + (((~((-1439943) | iMyTid2)) | 214042368) * (-756)) + (((~iMyTid2) | (-1439943)) * 756);
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr32[3])[0] = i46 ^ (i46 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrB$7879113[4];
        if (strArr5 != null) {
            int i47 = cancelAll + 81;
            g = i47 % 128;
            int i48 = i47 % 2;
            while (i < strArr5.length) {
                arrayList2.add(strArr5[i]);
                i++;
                int i49 = g + 95;
                cancelAll = i49 % 128;
                if (i49 % 2 == 0) {
                    int i50 = 5 % 5;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i42));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 21;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i6 = ~i5;
        if (i4 != 436818192 + (((~((-117251442) | i6)) | (-947238985)) * 519) + (((~(i6 | (-7673921))) | (~((-939565065) | i5))) * (-519)) + (((~(i5 | (-947238985))) | 117251441) * 519)) {
            throw new RuntimeException("-177594182");
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        if (i7 != (((-1349017452) + (((~((-536971651) | startUptimeMillis)) | (~(2042084314 | startUptimeMillis))) * 69)) + (((~(startUptimeMillis | 1753713602)) | ((~((-825342363) | startUptimeMillis)) | 288370712)) * (-69))) - 1944151232) {
            throw null;
        }
        super.onResume();
        int i8 = g + 15;
        cancelAll = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws IllegalAccessException {
        PaymentFailedActivity paymentFailedActivity = (PaymentFailedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 29;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iNextInt = new Random().nextInt(1601650181);
        if (i4 != (((~((-70791476) | iNextInt)) | 70254594) * (-566)) + 279406996 + ((~(iNextInt | (-536882))) * 566)) {
            throw new RuntimeException("135899091");
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i6 = (-1635100044) + ((iFreeMemory | 2099200) * 988);
        int i7 = ~iFreeMemory;
        if (i5 != i6 + (((~(610422438 | i7)) | 1360310288) * (-1976)) + (((~(iFreeMemory | (-1968633527))) | 2099200 | (~(1968633526 | i7))) * 988)) {
            int i8 = (-689265862) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i9 = cancelAll + 99;
        g = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 20 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e9, code lost:
    
        if (r1 != ((r5 + ((r4 | (~(2063300605 | r2))) * 50)) + (((~(r2 | 309491641)) | ((~(2025402972 | r2)) | (-2063300606))) * 50))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00eb, code lost:
    
        super.onCreate(r14);
        r14 = com.bpjstku.presentation.membership.payment.PaymentFailedActivity.cancelAll + 57;
        com.bpjstku.presentation.membership.payment.PaymentFailedActivity.g = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ff, code lost:
    
        throw new java.lang.RuntimeException("-754825678");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0107, code lost:
    
        throw new java.lang.RuntimeException("-1601801986");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005c, code lost:
    
        if (r1 == (((-602006963) + ((((~(r7 | (-947512591))) | 947430664) | (~((-117443122) | r6))) * 717)) + (((~(r6 | (-947512591))) | ((~(r7 | (-117443122))) | 947430664)) * 717))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0097, code lost:
    
        if (r1 == (((585917280 + (((~((-268436035) | r6)) | (~((~r6) | (-1098423578)))) * (-318))) + (((~(872620770 | r6)) | (-1971044348)) * (-318))) + (((~(r6 | (-872620771))) | 1702608313) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0099, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        r5 = (-935297624) + ((r2 | 309491641) * (-50));
        r4 = ~((-37897634) | r2);
        r2 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentFailedActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(PaymentFailedActivity paymentFailedActivity) {
        int i = 2 % 2;
        int i2 = g + 17;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = paymentFailedActivity.getIntent().getBooleanExtra("key_bpu_deeplink", false);
        int i4 = g + 111;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return booleanExtra;
    }

    public static /* synthetic */ String b(PaymentFailedActivity paymentFailedActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 87;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(paymentFailedActivity.getIntent().getStringExtra("status_transaction_payment"));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String stringExtra = paymentFailedActivity.getIntent().getStringExtra("status_transaction_payment");
        Intrinsics.checkNotNull(stringExtra);
        int i3 = g + 13;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return stringExtra;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        PaymentFailedActivity paymentFailedActivity = (PaymentFailedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 123;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            paymentFailedActivity.getIntent().getStringExtra("userId");
            throw null;
        }
        String stringExtra = paymentFailedActivity.getIntent().getStringExtra("userId");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i3 = cancelAll + 9;
        g = i3 % 128;
        int i4 = i3 % 2;
        return "";
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentFailedActivity paymentFailedActivity) {
        int i = 2 % 2;
        int i2 = g + 23;
        cancelAll = i2 % 128;
        return i2 % 2 == 0 ? paymentFailedActivity.getIntent().getBooleanExtra("key_sertakan_deeplink", false) : paymentFailedActivity.getIntent().getBooleanExtra("key_sertakan_deeplink", false);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentFailedActivity paymentFailedActivity, View view) {
        int i = 2 % 2;
        int i2 = g + 93;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (Intrinsics.areEqual((String) paymentFailedActivity.TuitionPaymentFragmentbindingInflater1.getValue(), "PENDING")) {
            int i4 = g + 99;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentFailedActivity, null, null, 6);
            int i6 = g + 19;
            cancelAll = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 5;
            }
        }
        paymentFailedActivity.d_();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentFailedActivity paymentFailedActivity) {
        return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzee.b(), zzee.b(), new Object[]{paymentFailedActivity}, 1838268841, zzee.b(), zzee.b(), -1838268840);
    }

    static {
        cancel = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 125;
        cancel = i % 128;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 83;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_payment_failed;
        }
        int i3 = 27 / 0;
        return R.layout.activity_payment_failed;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 43;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = g + 11;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g + 113;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 2110147214, 615000100 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1051).substring(0, 32).length(), new Object[]{this}, 461875122, getSessionConfigTemplateType.b(), getSessionConfigTemplateType.b(), -461875120);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 117;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = cancelAll + 105;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzee.b(), zzee.b(), new Object[]{this, context}, -54578904, getSessionConfigTemplateType.b(), zzee.b(), 54578904);
    }

    static void g() {
        d = (char) 33286;
        f532a = (char) 20031;
        asBinder = (char) 29225;
        asInterface = (char) 43656;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, short r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 108
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r0 = com.bpjstku.presentation.membership.payment.PaymentFailedActivity.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r7 = r7 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentFailedActivity.$$i(byte, short, byte):java.lang.String");
    }
}
