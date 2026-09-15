package defpackage;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentAsikResignNonSalariedVerificationRegistrationBinding;
import com.bpjstku.presentation.asik.resign.nonsalariedworker.AsikResignNonSalariedVerificationFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0015\u0010\u000f\u001a\u00020\f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0015\u0010\u0012\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR.\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u00198\u0015X\u0095D¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"LcreateRatingBar;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentAsikResignNonSalariedVerificationRegistrationBinding;", "<init>", "()V", "", "b_", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "LgetStringOrNull;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LsetOnItemSelectedAction;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentbindingInflater1", "", "I", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class createRatingBar extends AutoValue_CameraState_StateError<FragmentAsikResignNonSalariedVerificationRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: createMultiAutoCompleteTextView
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return createRatingBar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: createSpinner
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return createRatingBar.TuitionPaymentFragmentbindingInflater1();
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int b = R.layout.fragment_asik_resign_non_salaried_verification_registration;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
    }

    /* JADX INFO: renamed from: createRatingBar$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LcreateRatingBar$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "LcreateRatingBar;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LcreateRatingBar;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static createRatingBar TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            createRatingBar createratingbar = new createRatingBar();
            createratingbar.setArguments(new Bundle());
            return createratingbar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikResignNonSalariedVerificationRegistrationBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return AsikResignNonSalariedVerificationFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        FragmentAsikResignNonSalariedVerificationRegistrationBinding fragmentAsikResignNonSalariedVerificationRegistrationBindingAsInterface = asInterface();
        CardView cardView = fragmentAsikResignNonSalariedVerificationRegistrationBindingAsInterface.cvSelfieWithIdCard;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        CardView cardView2 = cardView;
        Function1 function1 = new Function1() { // from class: createImageView
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {39, -79, 42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 63;
            private static int b = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -2245104830670149639L;

            private static void c(int i, short s, int i2, Object[] objArr) {
                int i3 = s + 3;
                byte[] bArr = $$a;
                int i4 = (i * 14) + 84;
                byte[] bArr2 = new byte[53 - i2];
                int i5 = 52 - i2;
                int i6 = -1;
                if (bArr == null) {
                    i4 = (i4 + (-i5)) - 11;
                    i3++;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i4;
                    if (i6 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i4 = (i4 + (-bArr[i3])) - 11;
                        i3++;
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = b + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createRatingBar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
                int i4 = b + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
                throw null;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i3 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19473 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2624, 13 - (Process.myTid() >> 22), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.resolveSize(0, 0) + 39422), ((Process.getThreadPriority(0) + 20) >> 6) + 481, ImageFormat.getBitsPerPixel(0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i4 = $10 + 71;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39421), 481 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf("", "") + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i6 = $11 + 17;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Code duplicated, block: B:110:0x02fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:43:0x02f5  */
            /* JADX WARN: Code duplicated, block: B:45:0x02fb  */
            /* JADX WARN: Code duplicated, block: B:48:0x0304 A[Catch: Exception -> 0x053b, TRY_LEAVE, TryCatch #2 {Exception -> 0x053b, blocks: (B:46:0x02fe, B:48:0x0304, B:54:0x0380, B:56:0x0401, B:58:0x0407, B:59:0x0408, B:60:0x0409, B:64:0x0498, B:69:0x0516, B:73:0x052c, B:75:0x0532, B:76:0x0533, B:78:0x0535, B:79:0x0538, B:49:0x0320, B:51:0x032d, B:52:0x036f, B:65:0x04bc, B:67:0x04c9, B:68:0x050f), top: B:110:0x02fe, inners: #0, #4 }] */
            /* JADX WARN: Code duplicated, block: B:51:0x032d A[Catch: all -> 0x0400, TryCatch #0 {all -> 0x0400, blocks: (B:49:0x0320, B:51:0x032d, B:52:0x036f), top: B:106:0x0320, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:60:0x0409 A[Catch: Exception -> 0x053b, TRY_LEAVE, TryCatch #2 {Exception -> 0x053b, blocks: (B:46:0x02fe, B:48:0x0304, B:54:0x0380, B:56:0x0401, B:58:0x0407, B:59:0x0408, B:60:0x0409, B:64:0x0498, B:69:0x0516, B:73:0x052c, B:75:0x0532, B:76:0x0533, B:78:0x0535, B:79:0x0538, B:49:0x0320, B:51:0x032d, B:52:0x036f, B:65:0x04bc, B:67:0x04c9, B:68:0x050f), top: B:110:0x02fe, inners: #0, #4 }] */
            /* JADX WARN: Code duplicated, block: B:63:0x044f  */
            /* JADX WARN: Code duplicated, block: B:67:0x04c9 A[Catch: all -> 0x052b, TryCatch #4 {all -> 0x052b, blocks: (B:65:0x04bc, B:67:0x04c9, B:68:0x050f), top: B:113:0x04bc, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:71:0x051c  */
            /* JADX WARN: Code duplicated, block: B:77:0x0534  */
            /* JADX WARN: Code duplicated, block: B:82:0x053b  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                char[] cArr;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                String str;
                Object[] objArr;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i15;
                int i16;
                int i17;
                int i18 = 2 % 2;
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i20 = ((i19 | 45) << 1) - (i19 ^ 45);
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 38 / 0;
                }
                if (context != null) {
                    int i22 = (i19 & 103) + (i19 | 103);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    try {
                        char[] cArr2 = {52867, 6193, 25596, 19111, 38009, 65338, 50920, 4583, 31593, 16936, 44526, 62601, 56923, 10517, 28864, 23519, 42353, 35840, 55238, 16017, 2115, 21275, 47784};
                        int i24 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i25 = i24 * (-501);
                        int i26 = ((i25 | 27651419) << 1) - (i25 ^ 27651419);
                        int i27 = b;
                        int i28 = (i27 ^ 5) + ((i27 & 5) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
                        if (i28 % 2 == 0) {
                            int i29 = ~(((-54974) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-54974) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i30 = ~((i24 ^ 54973) | (i24 & 54973));
                            int i31 = i26 % (((i29 ^ i30) | (i30 & i29)) * (-502));
                            int i32 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i33 = (i32 & (-54974)) | ((-54974) ^ i32);
                            i15 = i31 % ((-502) - (~((i33 & i24) | (i33 ^ i24))));
                        } else {
                            int i34 = -(-(((~(((-54974) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-54974) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) | (~((i24 ^ 54973) | (i24 & 54973)))) * (-502)));
                            int i35 = (i26 & i34) + (i34 | i26);
                            int i36 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i37 = (i36 & (-54974)) | ((-54974) ^ i36);
                            int i38 = -(-((~((i37 & i24) | (i37 ^ i24))) * (-502)));
                            i15 = (i35 & i38) + (i38 | i35);
                        }
                        int i39 = ~i24;
                        int i40 = ~((i39 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i39 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i41 = i15 + (TypedValues.PositionType.TYPE_DRAWPATH * ((i40 & (-54974)) | ((-54974) ^ i40)));
                        Object[] objArr2 = new Object[1];
                        a(cArr2, i41, objArr2);
                        Class<?> cls = Class.forName((String) objArr2[0]);
                        int i42 = -Drawable.resolveOpacity(0, 0);
                        int i43 = (i42 & 54449) + (i42 | 54449);
                        Object[] objArr3 = new Object[1];
                        a(new char[]{52869, 6710, 26612, 45232, 40022, 59879, 12968, 7772, 27401, 46266, 32892, 60688, 14017, 625, 28421, 47315, 34196, 53580}, i43, objArr3);
                        Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                        char[] cArr3 = {52867, 46531, 14360, 49021, 9137, 42496, 11612, 37349, 5369, 39754, 8090, 33523, 2355, 36239, 28868, 63341, 31330, 65200, 25922, 59518, 27838, 54249, 22084, 55954, 16873, 50228, 18576, 53214, 45609, 14719, 48617, Typography.rightDoubleQuote, 42852, 11170};
                        int i44 = b + 91;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i44 % 128;
                        int i45 = i44 % 2;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                        int i46 = ((iLastIndexOf | 31568) << 1) - (iLastIndexOf ^ 31568);
                        Object[] objArr4 = new Object[1];
                        a(cArr3, i46, objArr4);
                        Class<?> cls2 = Class.forName((String) objArr4[0]);
                        char[] cArr4 = {52868, 44563, 4025, 61266, 19685};
                        int i47 = -View.getDefaultSize(0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i48 = i47 * 471;
                        int i49 = ((i48 | 11649243) << 1) - (i48 ^ 11649243);
                        int i50 = ((i47 ^ 24733) | (i47 & 24733)) * (-470);
                        int i51 = (i49 & i50) + (i50 | i49);
                        int i52 = ~i47;
                        int i53 = (~((i52 & (-24734)) | (i52 ^ (-24734)))) | (~(((-24734) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-24734) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                        int i54 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i55 = (i54 ^ i47) | (i54 & i47);
                        int i56 = ~((i55 ^ 24733) | (i55 & 24733));
                        int i57 = (i51 - (~(((i56 & i53) | (i53 ^ i56)) * (-470)))) - 1;
                        int i58 = ((-24734) & i47) | ((-24734) ^ i47);
                        int i59 = ~((i58 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i58 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i60 = i47 | i54;
                        int i61 = b + 67;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i61 % 128;
                        if (i61 % 2 == 0) {
                            int i62 = ~((i60 & 24733) | (i60 ^ 24733));
                            int i63 = (i57 - (~(470 << ((i62 & i59) | (i59 ^ i62))))) - 1;
                            Object[] objArr5 = new Object[1];
                            a(cArr4, i63, objArr5);
                            int i64 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                            i17 = (i64 | (-i64)) << 94;
                            i16 = i;
                        } else {
                            int i65 = ~((i60 & 24733) | (i60 ^ 24733));
                            int i66 = -(-(((i65 & i59) | (i59 ^ i65)) * 470));
                            int i67 = (i57 & i66) + (i66 | i57);
                            Object[] objArr6 = new Object[1];
                            a(cArr4, i67, objArr6);
                            int i68 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                            i16 = (i & (-2)) | ((~i) & 1);
                            int i69 = -i68;
                            i17 = ((i68 & i69) | (i68 ^ i69)) >> 31;
                        }
                        int i70 = b;
                        int i71 = (i70 ^ 13) + ((i70 & 13) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i71 % 128;
                        int i72 = i71 % 2;
                        int i73 = (~i17) & i;
                        int i74 = i17 & i16;
                        i4 = (i74 & i73) | (i73 ^ i74);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i4 = i;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char edgeSlop = (char) (16949 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int packedPositionGroup = 2739 - ExpandableListView.getPackedPositionGroup(0L);
                        int absoluteGravity = 13 - Gravity.getAbsoluteGravity(0, 0);
                        byte b2 = $$a[6];
                        short s = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, s, (byte) s, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, packedPositionGroup, absoluteGravity, 1501733736, false, (String) objArr7[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char keyRepeatTimeout = (char) (16949 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int i75 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2738;
                        int i76 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13;
                        byte b3 = $$a[6];
                        byte b4 = b3;
                        Object[] objArr8 = new Object[1];
                        c(b4, (short) (b4 | 52), b3, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, i75, i76, 47863026, false, (String) objArr8[0], null);
                    }
                    Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                    int i77 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i78 = (i77 ^ 45) + ((i77 & 45) << 1);
                    b = i78 % 128;
                    if (i78 % 2 != 0) {
                        set.contains(obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (!set.contains(obj)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 16949);
                            int packedPositionGroup2 = 2739 - ExpandableListView.getPackedPositionGroup(0L);
                            int i79 = 13 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            byte b5 = $$a[6];
                            Object[] objArr9 = new Object[1];
                            c(b5, (short) (b5 | 104), (byte) ($$b >>> 2), objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, packedPositionGroup2, i79, 631063962, false, (String) objArr9[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0);
                                int i80 = (iLastIndexOf2 ^ 390) + ((iLastIndexOf2 & 390) << 1);
                                Object[] objArr10 = new Object[1];
                                a(new char[]{52941, 52994, 52636, 51726, 51417, 51474, 51090, 50216, 49854, 50016, 49596, 56889, 56501, 56647, 56201, 55373, 54999, 55125, 54733, 53850, 53473, 53610, 61422, 60541, 60159, 60209, 59666, 59270}, i80, objArr10);
                                Object[] objArr11 = {(String) objArr10[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char mode = (char) View.MeasureSpec.getMode(0);
                                    int i81 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 992;
                                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 8;
                                    byte b6 = $$a[4];
                                    Object[] objArr12 = new Object[1];
                                    c(b6, (short) (b6 | 140), (byte) ($$b & 244), objArr12);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, i81, pressedStateDuration, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr11)).longValue();
                                long j = 41296612;
                                long j2 = 829;
                                long j3 = (j2 * j) + (j2 * jLongValue);
                                long j4 = -828;
                                long j5 = -1;
                                long startElapsedRealtime = ((long) ((int) Process.getStartElapsedRealtime())) ^ j5;
                                long j6 = j3 + (((((j ^ j5) | (jLongValue ^ j5)) ^ j5) | (((startElapsedRealtime | j) | jLongValue) ^ j5)) * j4);
                                long j7 = jLongValue | j;
                                long j8 = j6 + (j4 * (startElapsedRealtime | j7)) + (((long) 828) * (j7 ^ j5)) + ((long) (-242214849));
                                int i82 = ~((-576687379) | i);
                                int i83 = ((int) (j8 >> 32)) & ((((-2053107648) | i82) * (-196)) + 1139489334 + ((i82 | 1476420269) * 196));
                                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                int i84 = ~elapsedCpuTime;
                                int i85 = ((int) j8) & ((-771028391) + (((~(1848170974 | i84)) | (~(410944564 | elapsedCpuTime))) * 333) + (((~(elapsedCpuTime | 1848170974)) | (~(i84 | 410944564))) * 333));
                                i9 = (i83 & i85) | (i83 ^ i85);
                            } else {
                                cArr = new char[]{52947};
                                i10 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i86 = i10 * 868;
                                int i87 = (i86 ^ 34378876) + ((i86 & 34378876) << 1);
                                i11 = ~i10;
                                i12 = ~i;
                                int i88 = ~((i11 ^ i12) | (i11 & i12));
                                int i89 = ~i;
                                int i90 = ~((i89 & (-39608)) | ((-39608) ^ i89));
                                int i91 = -(-(((i88 & i90) | (i88 ^ i90)) * (-867)));
                                i13 = (i87 ^ i91) + ((i87 & i91) << 1);
                                i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                int i92 = ~((i11 ^ (-39608)) | (i11 & (-39608)));
                                int i93 = ~i10;
                                int i94 = ~((i93 & i) | (i93 ^ i));
                                int i95 = (i92 & i94) | (i92 ^ i94);
                                int i96 = ~(((-39608) ^ i) | ((-39608) & i));
                                int i97 = (-1734) * ((i95 & i96) | (i95 ^ i96));
                                int i98 = (i13 & i97) + (i97 | i13);
                                int i99 = (i11 ^ (-39608)) | (i11 & (-39608));
                                int i100 = (~((i11 & 39607) | (i11 ^ 39607) | i)) | (~((i12 & i99) | (i99 ^ i12)));
                                int i101 = (i10 & (-39608)) | ((-39608) ^ i10);
                                int i102 = ~((i101 & i) | (i101 ^ i));
                                int i103 = ((i102 & i100) | (i100 ^ i102)) * 867;
                                Object[] objArr13 = new Object[1];
                                a(cArr, (i98 & i103) + (i103 | i98), objArr13);
                                str = (String) objArr13[0];
                                Object[] objArr14 = new Object[1];
                                a(new char[]{52880, 16168, 11654, 6761, 2067, 30393, 26441, 21766, 17325, 45134, 48882, 44185, 40251}, 61860 - (~TextUtils.getOffsetAfter("", 0)), objArr14);
                                objArr = new Object[]{(String) objArr14[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char packedPositionChild = (char) (33601 - ExpandableListView.getPackedPositionChild(0L));
                                    int pressedStateDuration2 = 3085 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                    int iAxisFromString = MotionEvent.axisFromString("") + 27;
                                    byte b7 = $$a[4];
                                    Object[] objArr15 = new Object[1];
                                    c(b7, (short) (b7 | 140), (byte) ($$b & 244), objArr15);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, pressedStateDuration2, iAxisFromString, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i104 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i105 = (i104 & 121) + (i104 | 121);
                                    b = i105 % 128;
                                    int i106 = i105 % 2;
                                    i9 = 1;
                                } else {
                                    i9 = 0;
                                }
                            }
                            int i107 = (i & (-11)) | ((~i) & 10);
                            int i108 = -i9;
                            int i109 = (i9 & i108) | (i9 ^ i108);
                            int i110 = b;
                            int i111 = ((i110 | 65) << 1) - (i110 ^ 65);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111 % 128;
                            int i112 = i111 % 2;
                            int i113 = i109 >> 31;
                            int i114 = (~i113) & i;
                            int i115 = i110 + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i115 % 128;
                            int i116 = i115 % 2;
                            int i117 = i113 & i107;
                            int i118 = i110 + 1;
                            int i119 = i118 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i119;
                            int i120 = i118 % 2;
                            int i121 = i2 & 32;
                            int i122 = (i121 | (-i121)) >> 31;
                            int i123 = ((i117 & i114) | (i114 ^ i117)) & (~i122);
                            int i124 = (i119 ^ 83) + ((i119 & 83) << 1);
                            b = i124 % 128;
                            int i125 = i124 % 2;
                            int i126 = i & i122;
                            i5 = (i123 & i126) | (i123 ^ i126);
                        } else if (Build.VERSION.SDK_INT == 30) {
                            i5 = i;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0);
                                int i810 = (iLastIndexOf3 ^ 390) + ((iLastIndexOf3 & 390) << 1);
                                Object[] objArr16 = new Object[1];
                                a(new char[]{52941, 52994, 52636, 51726, 51417, 51474, 51090, 50216, 49854, 50016, 49596, 56889, 56501, 56647, 56201, 55373, 54999, 55125, 54733, 53850, 53473, 53610, 61422, 60541, 60159, 60209, 59666, 59270}, i810, objArr16);
                                Object[] objArr17 = {(String) objArr16[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char mode2 = (char) View.MeasureSpec.getMode(0);
                                    int i811 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 992;
                                    int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 8;
                                    byte b8 = $$a[4];
                                    Object[] objArr18 = new Object[1];
                                    c(b8, (short) (b8 | 140), (byte) ($$b & 244), objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode2, i811, pressedStateDuration3, 410748506, false, (String) objArr18[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr17)).longValue();
                                long j9 = 41296612;
                                long j10 = 829;
                                long j11 = (j10 * j9) + (j10 * jLongValue2);
                                long j12 = -828;
                                long j13 = -1;
                                long startElapsedRealtime2 = ((long) ((int) Process.getStartElapsedRealtime())) ^ j13;
                                long j14 = j11 + (((((j9 ^ j13) | (jLongValue2 ^ j13)) ^ j13) | (((startElapsedRealtime2 | j9) | jLongValue2) ^ j13)) * j12);
                                long j15 = jLongValue2 | j9;
                                long j16 = j14 + (j12 * (startElapsedRealtime2 | j15)) + (((long) 828) * (j15 ^ j13)) + ((long) (-242214849));
                                int i812 = ~((-576687379) | i);
                                int i813 = ((int) (j16 >> 32)) & ((((-2053107648) | i812) * (-196)) + 1139489334 + ((i812 | 1476420269) * 196));
                                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                int i814 = ~elapsedCpuTime2;
                                int i815 = ((int) j16) & ((-771028391) + (((~(1848170974 | i814)) | (~(410944564 | elapsedCpuTime2))) * 333) + (((~(elapsedCpuTime2 | 1848170974)) | (~(i814 | 410944564))) * 333));
                                i9 = (i813 & i815) | (i813 ^ i815);
                            } else {
                                cArr = new char[]{52947};
                                i10 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i816 = i10 * 868;
                                int i817 = (i816 ^ 34378876) + ((i816 & 34378876) << 1);
                                i11 = ~i10;
                                i12 = ~i;
                                int i818 = ~((i11 ^ i12) | (i11 & i12));
                                int i819 = ~i;
                                int i910 = ~((i819 & (-39608)) | ((-39608) ^ i819));
                                int i911 = -(-(((i818 & i910) | (i818 ^ i910)) * (-867)));
                                i13 = (i817 ^ i911) + ((i817 & i911) << 1);
                                i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                                int i912 = ~((i11 ^ (-39608)) | (i11 & (-39608)));
                                int i913 = ~i10;
                                int i914 = ~((i913 & i) | (i913 ^ i));
                                int i915 = (i912 & i914) | (i912 ^ i914);
                                int i916 = ~(((-39608) ^ i) | ((-39608) & i));
                                int i917 = (-1734) * ((i915 & i916) | (i915 ^ i916));
                                int i918 = (i13 & i917) + (i917 | i13);
                                int i919 = (i11 ^ (-39608)) | (i11 & (-39608));
                                int i1010 = (~((i11 & 39607) | (i11 ^ 39607) | i)) | (~((i12 & i919) | (i919 ^ i12)));
                                int i1011 = (i10 & (-39608)) | ((-39608) ^ i10);
                                int i1012 = ~((i1011 & i) | (i1011 ^ i));
                                int i1013 = ((i1012 & i1010) | (i1010 ^ i1012)) * 867;
                                Object[] objArr19 = new Object[1];
                                a(cArr, (i918 & i1013) + (i1013 | i918), objArr19);
                                str = (String) objArr19[0];
                                Object[] objArr110 = new Object[1];
                                a(new char[]{52880, 16168, 11654, 6761, 2067, 30393, 26441, 21766, 17325, 45134, 48882, 44185, 40251}, 61860 - (~TextUtils.getOffsetAfter("", 0)), objArr110);
                                objArr = new Object[]{(String) objArr110[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char packedPositionChild2 = (char) (33601 - ExpandableListView.getPackedPositionChild(0L));
                                    int pressedStateDuration4 = 3085 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                    int iAxisFromString2 = MotionEvent.axisFromString("") + 27;
                                    byte b9 = $$a[4];
                                    Object[] objArr111 = new Object[1];
                                    c(b9, (short) (b9 | 140), (byte) ($$b & 244), objArr111);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild2, pressedStateDuration4, iAxisFromString2, 1411172903, false, (String) objArr111[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i1014 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i1015 = (i1014 & 121) + (i1014 | 121);
                                    b = i1015 % 128;
                                    int i1016 = i1015 % 2;
                                    i9 = 1;
                                } else {
                                    i9 = 0;
                                }
                            }
                            int i1017 = (i & (-11)) | ((~i) & 10);
                            int i1018 = -i9;
                            int i1019 = (i9 & i1018) | (i9 ^ i1018);
                            int i1110 = b;
                            int i1111 = ((i1110 | 65) << 1) - (i1110 ^ 65);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111 % 128;
                            int i1112 = i1111 % 2;
                            int i1113 = i1019 >> 31;
                            int i1114 = (~i1113) & i;
                            int i1115 = i1110 + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1115 % 128;
                            int i1116 = i1115 % 2;
                            int i1117 = i1113 & i1017;
                            int i1118 = i1110 + 1;
                            int i1119 = i1118 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1119;
                            int i127 = i1118 % 2;
                            int i128 = i2 & 32;
                            int i129 = (i128 | (-i128)) >> 31;
                            int i1210 = ((i1117 & i1114) | (i1114 ^ i1117)) & (~i129);
                            int i1211 = (i1119 ^ 83) + ((i1119 & 83) << 1);
                            b = i1211 % 128;
                            int i1212 = i1211 % 2;
                            int i1213 = i & i129;
                            i5 = (i1210 & i1213) | (i1210 ^ i1213);
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        i5 = i;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0);
                                int i8110 = (iLastIndexOf4 ^ 390) + ((iLastIndexOf4 & 390) << 1);
                                Object[] objArr112 = new Object[1];
                                a(new char[]{52941, 52994, 52636, 51726, 51417, 51474, 51090, 50216, 49854, 50016, 49596, 56889, 56501, 56647, 56201, 55373, 54999, 55125, 54733, 53850, 53473, 53610, 61422, 60541, 60159, 60209, 59666, 59270}, i8110, objArr112);
                                try {
                                    Object[] objArr113 = {(String) objArr112[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char mode3 = (char) View.MeasureSpec.getMode(0);
                                        int i8111 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 992;
                                        int pressedStateDuration5 = (ViewConfiguration.getPressedStateDuration() >> 16) + 8;
                                        byte b10 = $$a[4];
                                        Object[] objArr114 = new Object[1];
                                        c(b10, (short) (b10 | 140), (byte) ($$b & 244), objArr114);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode3, i8111, pressedStateDuration5, 410748506, false, (String) objArr114[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr113)).longValue();
                                    long j17 = 41296612;
                                    long j18 = 829;
                                    long j19 = (j18 * j17) + (j18 * jLongValue3);
                                    long j110 = -828;
                                    long j111 = -1;
                                    long startElapsedRealtime3 = ((long) ((int) Process.getStartElapsedRealtime())) ^ j111;
                                    long j112 = j19 + (((((j17 ^ j111) | (jLongValue3 ^ j111)) ^ j111) | (((startElapsedRealtime3 | j17) | jLongValue3) ^ j111)) * j110);
                                    long j113 = jLongValue3 | j17;
                                    long j114 = j112 + (j110 * (startElapsedRealtime3 | j113)) + (((long) 828) * (j113 ^ j111)) + ((long) (-242214849));
                                    int i8112 = ~((-576687379) | i);
                                    int i8113 = ((int) (j114 >> 32)) & ((((-2053107648) | i8112) * (-196)) + 1139489334 + ((i8112 | 1476420269) * 196));
                                    int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                    int i8114 = ~elapsedCpuTime3;
                                    int i8115 = ((int) j114) & ((-771028391) + (((~(1848170974 | i8114)) | (~(410944564 | elapsedCpuTime3))) * 333) + (((~(elapsedCpuTime3 | 1848170974)) | (~(i8114 | 410944564))) * 333));
                                    i9 = (i8113 & i8115) | (i8113 ^ i8115);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                cArr = new char[]{52947};
                                i10 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i8116 = i10 * 868;
                                int i8117 = (i8116 ^ 34378876) + ((i8116 & 34378876) << 1);
                                i11 = ~i10;
                                i12 = ~i;
                                int i8118 = ~((i11 ^ i12) | (i11 & i12));
                                int i8119 = ~i;
                                int i9110 = ~((i8119 & (-39608)) | ((-39608) ^ i8119));
                                int i9111 = -(-(((i8118 & i9110) | (i8118 ^ i9110)) * (-867)));
                                i13 = (i8117 ^ i9111) + ((i8117 & i9111) << 1);
                                i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                                int i9112 = ~((i11 ^ (-39608)) | (i11 & (-39608)));
                                int i9113 = ~i10;
                                int i9114 = ~((i9113 & i) | (i9113 ^ i));
                                int i9115 = (i9112 & i9114) | (i9112 ^ i9114);
                                int i9116 = ~(((-39608) ^ i) | ((-39608) & i));
                                int i9117 = (-1734) * ((i9115 & i9116) | (i9115 ^ i9116));
                                int i9118 = (i13 & i9117) + (i9117 | i13);
                                int i9119 = (i11 ^ (-39608)) | (i11 & (-39608));
                                int i10110 = (~((i11 & 39607) | (i11 ^ 39607) | i)) | (~((i12 & i9119) | (i9119 ^ i12)));
                                int i10111 = (i10 & (-39608)) | ((-39608) ^ i10);
                                int i10112 = ~((i10111 & i) | (i10111 ^ i));
                                int i10113 = ((i10112 & i10110) | (i10110 ^ i10112)) * 867;
                                Object[] objArr115 = new Object[1];
                                a(cArr, (i9118 & i10113) + (i10113 | i9118), objArr115);
                                str = (String) objArr115[0];
                                Object[] objArr116 = new Object[1];
                                a(new char[]{52880, 16168, 11654, 6761, 2067, 30393, 26441, 21766, 17325, 45134, 48882, 44185, 40251}, 61860 - (~TextUtils.getOffsetAfter("", 0)), objArr116);
                                try {
                                    objArr = new Object[]{(String) objArr116[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char packedPositionChild3 = (char) (33601 - ExpandableListView.getPackedPositionChild(0L));
                                        int pressedStateDuration6 = 3085 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                        int iAxisFromString3 = MotionEvent.axisFromString("") + 27;
                                        byte b11 = $$a[4];
                                        Object[] objArr117 = new Object[1];
                                        c(b11, (short) (b11 | 140), (byte) ($$b & 244), objArr117);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild3, pressedStateDuration6, iAxisFromString3, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        int i10114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i10115 = (i10114 & 121) + (i10114 | 121);
                                        b = i10115 % 128;
                                        int i10116 = i10115 % 2;
                                        i9 = 1;
                                    } else {
                                        i9 = 0;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                            i9 = 0;
                        }
                        int i10117 = (i & (-11)) | ((~i) & 10);
                        int i10118 = -i9;
                        int i10119 = (i9 & i10118) | (i9 ^ i10118);
                        int i11110 = b;
                        int i11111 = ((i11110 | 65) << 1) - (i11110 ^ 65);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11111 % 128;
                        int i11112 = i11111 % 2;
                        int i11113 = i10119 >> 31;
                        int i11114 = (~i11113) & i;
                        int i11115 = i11110 + 43;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11115 % 128;
                        int i11116 = i11115 % 2;
                        int i11117 = i11113 & i10117;
                        int i11118 = i11110 + 1;
                        int i11119 = i11118 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11119;
                        int i1214 = i11118 % 2;
                        int i1215 = i2 & 32;
                        int i1216 = (i1215 | (-i1215)) >> 31;
                        int i1217 = ((i11117 & i11114) | (i11114 ^ i11117)) & (~i1216);
                        int i1218 = (i11119 ^ 83) + ((i11119 & 83) << 1);
                        b = i1218 % 128;
                        int i1219 = i1218 % 2;
                        int i12110 = i & i1216;
                        i5 = (i1217 & i12110) | (i1217 ^ i12110);
                    }
                    int i130 = (~i4) & i;
                    int i131 = ~i;
                    int i132 = i130 | (i4 & i131);
                    int i133 = -i132;
                    int i134 = ((i132 & i133) | (i132 ^ i133)) >> 31;
                    int i135 = i5 & (~i134);
                    int i136 = i134 & i4;
                    int i137 = (i135 & i136) | (i135 ^ i136);
                    Object[] objArr20 = new Object[4];
                    int[] iArr = new int[1];
                    objArr20[0] = iArr;
                    objArr20[1] = new int[1];
                    int[] iArr2 = new int[1];
                    objArr20[2] = iArr2;
                    int i138 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                    b = i138 % 128;
                    int i139 = i138 % 2;
                    int i140 = (i131 & i137) | ((~i137) & i);
                    int i141 = -i140;
                    if (i139 != 0) {
                        int i142 = (i140 & i141) | (i140 ^ i141);
                        int i143 = (i142 ^ 80) + ((i142 & 80) << 1);
                        int i144 = (~i143) & 1;
                        int i145 = i143 & 81;
                        i6 = (i144 & i145) | (i144 ^ i145);
                    } else {
                        i6 = (((i140 & i141) | (i140 ^ i141)) >> 31) & 16;
                    }
                    iArr[0] = i;
                    iArr2[0] = i137;
                    NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    objArr20[3] = null;
                    int i146 = (((((-1969898924) + (((~(i | (-931926612))) | (-972236841)) * (-465))) + (((-931926612) | (~((-972236841) | i))) * 930)) + (((-830472193) | i) * 465)) - (~i6)) - 1;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i147 = b + 17;
                    int i148 = i147 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i148;
                    if (i147 % 2 == 0) {
                        i7 = i3;
                        int i149 = ~i146;
                        int i150 = ~((i149 & i7) | (i149 ^ i7));
                        int i151 = ~i7;
                        int i152 = (i151 & i146) | (i151 ^ i146);
                        int i153 = ~((i152 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i152 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        i8 = (450 / i146) * ((-448) % i7) * ((i150 & i153) | (i150 ^ i153)) * 449;
                    } else {
                        i7 = i3;
                        int i154 = ~i146;
                        int i155 = ~((i154 & i7) | (i154 ^ i7));
                        int i156 = ~i7;
                        int i157 = (i156 & i146) | (i156 ^ i146);
                        int i158 = ~((i157 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i157 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        i8 = (((i146 * 450) + (i7 * (-448))) - (~(((i155 & i158) | (i155 ^ i158)) * 449))) - 1;
                    }
                    int i159 = ~i146;
                    int i160 = i8 + ((-1347) * (~((i159 ^ i7) | (i159 & i7))));
                    int i161 = ~((i159 & i7) | (i159 ^ i7));
                    int i162 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (~i7) | i146;
                    int i163 = ((i148 | 29) << 1) - (i148 ^ 29);
                    b = i163 % 128;
                    if (i163 % 2 != 0) {
                        int i164 = i160 >>> (449 / ((~i162) | i161));
                        int i165 = i164 << 69;
                        int i166 = (i164 | i165) & (~(i164 & i165));
                        int i167 = i166 ^ (i166 >> 6);
                        ((int[]) objArr20[1])[0] = i167 ^ (i167 / 2);
                        return objArr20;
                    }
                    int i168 = (i160 - (~(((~i162) | i161) * 449))) - 1;
                    int i169 = (i168 << 13) ^ i168;
                    int i170 = i169 >>> 17;
                    int i171 = (i169 | i170) & (~(i169 & i170));
                    ((int[]) objArr20[1])[0] = i171 ^ (i171 << 5);
                    return objArr20;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
        };
        Intrinsics.checkNotNullParameter(cardView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        cardView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        CardView cardView3 = fragmentAsikResignNonSalariedVerificationRegistrationBindingAsInterface.cvFacialVerification;
        Intrinsics.checkNotNullExpressionValue(cardView3, "");
        CardView cardView4 = cardView3;
        Function1 function2 = new Function1() { // from class: createRadioButton
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return createRatingBar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(cardView4, "");
        Intrinsics.checkNotNullParameter(function2, "");
        cardView4.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
        MaterialButton materialButton = fragmentAsikResignNonSalariedVerificationRegistrationBindingAsInterface.btnConfirmation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: createSeekBar
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return createRatingBar.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ setOnItemSelectedAction TuitionPaymentFragmentbindingInflater1() {
        return new setOnItemSelectedAction();
    }

    public static /* synthetic */ Unit b(createRatingBar createratingbar, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        getStringOrNull getstringornull = (getStringOrNull) createratingbar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        FragmentManager childFragmentManager = createratingbar.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornull.show(childFragmentManager, getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(createRatingBar createratingbar, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setOnItemSelectedAction setonitemselectedaction = (setOnItemSelectedAction) createratingbar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        FragmentManager childFragmentManager = createratingbar.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            setonitemselectedaction.show(childFragmentManager, setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault1(createRatingBar createratingbar) {
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = createratingbar.getString(R.string.label_success);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = createratingbar.getString(R.string.label_membership_data_verified);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = createratingbar.getString(R.string.action_ok_thanks);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        return getStringOrNull.Companion.b(R.drawable.ic_success, string, string2, string3, null, 112);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(createRatingBar createratingbar, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setOnItemSelectedAction setonitemselectedaction = (setOnItemSelectedAction) createratingbar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        FragmentManager childFragmentManager = createratingbar.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            setonitemselectedaction.show(childFragmentManager, setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }
}
