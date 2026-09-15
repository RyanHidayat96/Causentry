package com.bpjstku.presentation.membership.payment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityPaymentSuccessBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.PaymentSuccessActivity;
import com.bpjstku.presentation.tuition.TuitionActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzpu;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\r\u001a\u00020\u000b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0015\u0010\u0006\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0015\u0010\u0010\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0015"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentSuccessActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPaymentSuccessBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Lcom/bpjstku/domain/registration/general/model/Registration;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentSuccessActivity extends BindingBaseActivity<ActivityPaymentSuccessBinding> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder;
    private static long b;
    private static final byte[] $$a = {89, 92, -72, 43, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 83;
    private static int d = 1;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f535a = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: setSelection
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: setSoftInputMode
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (String) PaymentSuccessActivity.b(936071498, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -936071496, new Object[]{this.b}, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: ListPopupWindow1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (String) PaymentSuccessActivity.b(2083298378, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2083298377, new Object[]{this.TuitionPaymentFragmentbindingInflater1}, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
    });

    public static /* synthetic */ Object b(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i);
        int i9 = (~(i7 | i4)) | i8 | (~(i | i4));
        int i10 = (~((~i) | i3)) | (~(i3 | i4));
        int i11 = (~((~i4) | i7)) | i8;
        int i12 = i3 + i + i5 + (1821889583 * i2) + ((-349070011) * i6);
        int i13 = i12 * i12;
        int i14 = (575745661 * i3) + 325058560 + (1920428227 * i) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i5) + (473956352 * i2) + (1723858944 * i6) + ((-1436549120) * i13);
        int i15 = (i3 * 921699331) + 387174459 + (i * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i5 * 921699455) + (i2 * 347275089) + (i6 * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i16 != 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        PaymentSuccessActivity paymentSuccessActivity = (PaymentSuccessActivity) objArr[0];
        int i17 = 2 % 2;
        int i18 = f535a + 121;
        g = i18 % 128;
        int i19 = i18 % 2;
        String stringExtra = paymentSuccessActivity.getIntent().getStringExtra("status_payment");
        Intrinsics.checkNotNull(stringExtra);
        int i20 = g + 21;
        f535a = i20 % 128;
        int i21 = i20 % 2;
        return stringExtra;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r0 = 53 - r7
            byte[] r1 = com.bpjstku.presentation.membership.payment.PaymentSuccessActivity.$$a
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r6]
        L2a:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentSuccessActivity.c(short, byte, int, java.lang.Object[]):void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPaymentSuccessBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 51;
        f535a = i2 % 128;
        int i3 = i2 % 2;
        PaymentSuccessActivity$bindingInflater$1 paymentSuccessActivity$bindingInflater$1 = PaymentSuccessActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = f535a + 31;
        g = i4 % 128;
        int i5 = i4 % 2;
        return paymentSuccessActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityPaymentSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnOk;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ListPopupWindowApi24Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        int i2 = f535a + 125;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 1;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $10 + 93;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19472), 2623 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (b ^ 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 480, 37 - Gravity.getAbsoluteGravity(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i7 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (Process.myTid() >> 22)), 2624 - (ViewConfiguration.getPressedStateDuration() >> 16), View.combineMeasuredStates(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (b ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 39422), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 480, View.getDefaultSize(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i8 = $10 + 101;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.rgb(0, 0, 0) + 16816638), 481 - KeyEvent.getDeadChar(0, 0), 37 - TextUtils.indexOf("", "", 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
        int i10 = $11 + 115;
        $10 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g + 35;
        f535a = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityPaymentSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvIdPaymentValue.setText((String) this.TuitionPaymentFragmentbindingInflater1.getValue());
        int i4 = g + 31;
        f535a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i = 2 % 2;
        int i2 = f535a + 49;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
            int iBlue = 15 - Color.blue(0);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, iBlue, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{36277, 50865, 7078, 27783, 41367, 64138, 20466, 32951, 54755, 11972, 25492, 46334, 2345, 16936, 38714, 59412, 15625, 30252, 52094, 7274, 20843, 43608}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 19175, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{36273, 59747, 17411, 41781, 7883, 30198, 53394, 19579, 43881, 1542, 32054, 55497, 14329, 37542, 3659}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 25712, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
            int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            c(b4, b5, (short) (b5 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i5, modifierMetaStateMask, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int gidForName = Process.getGidForName("") + 1032;
                int windowTouchSlop = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b6 = (byte) 52;
                Object[] objArr6 = new Object[1];
                c($$a[132], b6, (short) (b6 << 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, gidForName, windowTouchSlop, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i9 = (((((~((-498151395) | i8)) | 220267616) * (-566)) + 361699241) + ((~(i8 | (-277883779))) * 566)) - 1065231088;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{36286, 61482, 30364, 62824, 31622, 63907, 31759, 58083, 24907, 59245, 26033, 59512, 28371, 60595, 21251, 53736}, TextUtils.lastIndexOf("", '0', 0) + 32160, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{36285, 613, 37403, 8901, 45812, 17044, 54110, 25470, 62260, 33736, 5109, 41883, 12395, 49258, 20502, 57546}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 36810, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {2075602365};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - View.MeasureSpec.makeMeasureSpec(0, 0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1134, View.resolveSizeAndState(0, 0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1065231088, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 15;
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr12 = new Object[1];
                    c(b7, b8, b8, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, doubleTapTimeout, iIndexOf, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45993), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1116, 17 - (ViewConfiguration.getTapTimeout() >> 16)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cMyTid = (char) (Process.myTid() >> 22);
                    int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int iGreen = Color.green(0) + 15;
                    byte b9 = (byte) 52;
                    Object[] objArr13 = new Object[1];
                    c($$a[132], b9, (short) (b9 << 1), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, threadPriority, iGreen, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{36277, 50865, 7078, 27783, 41367, 64138, 20466, 32951, 54755, 11972, 25492, 46334, 2345, 16936, 38714, 59412, 15625, 30252, 52094, 7274, 20843, 43608}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step4).substring(3, 4).length() + 19210, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{36273, 59747, 17411, 41781, 7883, 30198, 53394, 19579, 43881, 1542, 32054, 55497, 14329, 37542, 3659}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 25702, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                        int capsMode = 15 - TextUtils.getCapsMode("", 0, 0);
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr16 = new Object[1];
                        c(b10, b11, (short) (b11 | 52), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, scrollBarFadeDuration, capsMode, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c4 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0);
                        int iIndexOf3 = 15 - TextUtils.indexOf("", "", 0);
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr17 = new Object[1];
                        c(b12, b13, b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, iIndexOf2, iIndexOf3, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = f535a + 41;
            g = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i20 = ~((-21632006) | i19);
            int i21 = i16 + 19966237 + ((201621568 | i20) * (-476)) + (i20 * 952) + ((~((~i19) | (-21632006))) * 476);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i24 = 0;
                while (i24 < strArr3.length) {
                    arrayList.add(strArr3[i24]);
                    i24++;
                    int i25 = g + 39;
                    f535a = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step5).substring(40, 41).length() + 598564318;
            int i30 = i27 + 619471748 + (((~((~length) | 821760138)) | 33596704) * 529) + (((~(length | 821760138)) | 577479968) * 529);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr19[2])[0] = i32 ^ (i32 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
            int i33 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int iResolveSize = View.resolveSize(0, 0) + 23;
            byte b14 = $$a[7];
            Object[] objArr20 = new Object[1];
            c(b14, (byte) (b14 | 15), (short) 104, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cNormalizeMetaState, i33, iResolveSize, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i34 = f535a + 97;
            g = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c5 = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                int iMyTid = (Process.myTid() >> 22) + 23;
                byte b15 = $$a[7];
                byte b16 = b15;
                Object[] objArr21 = new Object[1];
                c(b15, b16, (short) (b16 | 52), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c5, iKeyCodeFromString, iMyTid, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i36 = 370336724 + (((-838912165) | iIdentityHashCode) * (-627)) + (((~(844421804 | iIdentityHashCode)) | 1057024230) * (-627)) + (((~(iIdentityHashCode | 1057024230)) | (~((~iIdentityHashCode) | (-844421805)))) * 627) + 170482213;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i38 ^ (i38 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{36286, 61482, 30364, 62824, 31622, 63907, 31759, 58083, 24907, 59245, 26033, 59512, 28371, 60595, 21251, 53736}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32123, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{36285, 613, 37403, 8901, 45812, 17044, 54110, 25470, 62260, 33736, 5109, 41883, 12395, 49258, 20502, 57546}, Process.getGidForName("") + 36822, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {2075602365};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42050 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1726, View.resolveSizeAndState(0, 0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 170482213, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c6 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
                int defaultSize = 23 - View.getDefaultSize(0, 0);
                byte b17 = $$a[7];
                byte b18 = b17;
                Object[] objArr26 = new Object[1];
                c(b17, b18, (short) (b18 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c6, deadChar, defaultSize, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{36277, 50865, 7078, 27783, 41367, 64138, 20466, 32951, 54755, 11972, 25492, 46334, 2345, 16936, 38714, 59412, 15625, 30252, 52094, 7274, 20843, 43608}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 19211, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{36273, 59747, 17411, 41781, 7883, 30198, 53394, 19579, 43881, 1542, 32054, 55497, 14329, 37542, 3659}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 25783, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                    int iRgb = (-16775461) - Color.rgb(0, 0, 0);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                    byte b19 = $$a[7];
                    byte b20 = b19;
                    Object[] objArr29 = new Object[1];
                    c(b19, b20, (short) (b20 | 141), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cKeyCodeFromString, iRgb, packedPositionType, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                    int iMyPid = (Process.myPid() >> 22) + 1755;
                    int iIndexOf4 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte b21 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(b21, (byte) (b21 | 15), (short) 104, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(mode, iMyPid, iIndexOf4, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr5 != null) {
                for (String str : strArr5) {
                    arrayList2.add(str);
                }
            }
            throw null;
        }
        int i39 = f535a + 65;
        g = i39 % 128;
        int i40 = i39 % 2;
        int i41 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1505126488;
        int i42 = i41 + 1320524901 + ((~((~length2) | (-143144969))) * (-116)) + ((896976450 | length2) * 116) + (((~(length2 | 684374024)) | 355747394) * 116);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr31[3])[0] = i44 ^ (i44 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f535a + 11;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            if (i3 != (-1803456904) + (((~((~i4) | (-644157473))) | (~((-1098957848) | i4))) * (-302)) + ((~((-644157473) | i4)) * (-604)) + (((~(i4 | (-1743115320))) | (-2012085624)) * 302)) {
                throw null;
            }
        } else {
            int i5 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i6 = (int) Runtime.getRuntime().totalMemory();
            if (i5 != 1422866152 + (((~((-842571780) | i6)) | 12584236) * (-756)) + (((~i6) | (-842571780)) * 756)) {
                throw null;
            }
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ~System.identityHashCode(this);
        if (i7 != (((-856319252) + (((~(i8 | 1836495579)) | 742560385) * (-828))) + ((i8 | 1836495579) * (-828))) - 199917456) {
            throw new RuntimeException("113641667");
        }
        super.onResume();
        int i9 = g + 61;
        f535a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f535a + 19;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ~Process.myUid();
        if (i4 != (-1009304368) + ((~((-1100546273) | i5)) * 52) + (((~(371387915 | i5)) | (~(1201375458 | i5)) | (-1471934188)) * (-52)) + (((~(i5 | (-371387916))) | 100829186) * 52)) {
            int i6 = 196661166 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyPid = Process.myPid();
        int i8 = ~iMyPid;
        if (i7 != 1282488668 + (((~(1908918318 | i8)) | 670137646) * (-328)) + ((iMyPid | 670137646) * 164) + (((~(iMyPid | (-1908918319))) | 566315054 | (~(i8 | 2012740910))) * 164)) {
            throw new RuntimeException("-1576420408");
        }
        super.onStart();
        int i9 = g + 99;
        f535a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 15 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f535a + 21;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i4 != ((501467944 + (((~(1831301905 | iElapsedRealtime)) | 310937642) * 576)) + (((~((~iElapsedRealtime) | 2142239547)) | 690376720) * 576)) - 1288544640) {
            throw new RuntimeException("669633713");
        }
        int i5 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i6 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        if (i5 != (-856319252) + (((~(i6 | (-1754268361))) | 38357029) * (-828)) + ((i6 | (-1754268361)) * (-828)) + 835256032) {
            throw null;
        }
        super.onCreate(bundle);
        int i7 = g + 49;
        f535a = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentSuccessActivity paymentSuccessActivity, View view) {
        int i = 2 % 2;
        int i2 = g + 33;
        f535a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            Intrinsics.areEqual((String) paymentSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue(), "unregistered_member");
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual((String) paymentSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue(), "unregistered_member")) {
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentSuccessActivity, null, false, 6);
            paymentSuccessActivity.d_();
            int i4 = g + 85;
            f535a = i4 % 128;
            int i5 = i4 % 2;
        } else {
            TuitionActivity.Companion companion2 = TuitionActivity.INSTANCE;
            TuitionActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentSuccessActivity);
            paymentSuccessActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Registration TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentSuccessActivity paymentSuccessActivity) {
        int i = 2 % 2;
        int i2 = f535a + 19;
        g = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = paymentSuccessActivity.getIntent().getParcelableExtra("successful_unregistered_registration_data");
        Intrinsics.checkNotNull(parcelableExtra);
        Registration registration = (Registration) parcelableExtra;
        int i4 = f535a + 25;
        g = i4 % 128;
        int i5 = i4 % 2;
        return registration;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        PaymentSuccessActivity paymentSuccessActivity = (PaymentSuccessActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 71;
        f535a = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = paymentSuccessActivity.getIntent().getStringExtra("transaction_id_payment");
        Intrinsics.checkNotNull(stringExtra);
        int i4 = g + 89;
        f535a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return stringExtra;
    }

    public static /* synthetic */ String b(PaymentSuccessActivity paymentSuccessActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (String) b(936071498, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -936071496, new Object[]{paymentSuccessActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(PaymentSuccessActivity paymentSuccessActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (String) b(2083298378, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2083298377, new Object[]{paymentSuccessActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static {
        asBinder = 0;
        d();
        INSTANCE = new Companion(null);
        int i = d + 59;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 43;
        f535a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        f535a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return R.layout.activity_payment_success;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f535a + 25;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = g + 111;
        f535a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = g + 9;
        f535a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iB = ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1.b();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 990713710;
        b(-1743631330, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1743631330, new Object[]{this}, iB, iCodePointAt, ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1.b());
    }

    static void d() {
        b = -7481937133043505969L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        PaymentSuccessActivity paymentSuccessActivity = (PaymentSuccessActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 17;
        f535a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = f535a + 97;
        g = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
