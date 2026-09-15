package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
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
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.data.vocation.model.request.VocationProfileRequest;
import com.bpjstku.databinding.ActivitySuccessRegistrationNonSalariedWorkerBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.gson.internal.bind.TypeAdapters;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CameraUseCaseAdapter;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\r\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/SuccessRegistrationNonSalariedWorkerActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySuccessRegistrationNonSalariedWorkerBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/user/model/User;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SuccessRegistrationNonSalariedWorkerActivity extends BindingBaseActivity<ActivitySuccessRegistrationNonSalariedWorkerBinding> {
    private static char TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static char asInterface;
    private static char d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: postUpdateFocusedState
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SuccessRegistrationNonSalariedWorkerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {29, 88, -118, 32};
    private static final int $$f = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {25, 5, -88, -44, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 231;
    private static int INotificationSideChannel = 1;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f539a = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i4));
        int i11 = ~(i9 | i6);
        int i12 = i10 | i11;
        int i13 = ~i4;
        int i14 = i11 | (~(i13 | i6));
        int i15 = (~(i3 | i7 | i13)) | (~(i13 | i9 | i6));
        int i16 = i4 + i6 + i2 + ((-1369571145) * i5) + ((-720088171) * i);
        int i17 = i16 * i16;
        int i18 = (((-954023988) * i4) - 252706816) + ((-260227018) * i6) + ((-346898485) * i12) + (i14 * 346898485) + (346898485 * i15) + ((-607125504) * i2) + (565182464 * i5) + (1611661312 * i) + ((-409206784) * i17);
        int i19 = ((i4 * (-1931095572)) - 2087550970) + (i6 * (-1931094842)) + (i12 * (-365)) + (i14 * 365) + (i15 * 365) + (i2 * (-1931095207)) + (i5 * (-789048161)) + (i * 356376013) + (i17 * 423362560);
        return i18 + ((i19 * i19) * (-1901854720)) != 1 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r6 + 1
            int r5 = r5 * 14
            int r5 = 98 - r5
            int r7 = r7 + 4
            byte[] r1 = com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r7]
        L24:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            int r7 = r7 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.c(int, short, int, java.lang.Object[]):void");
    }

    public SuccessRegistrationNonSalariedWorkerActivity() {
        final SuccessRegistrationNonSalariedWorkerActivity successRegistrationNonSalariedWorkerActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = successRegistrationNonSalariedWorkerActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/SuccessRegistrationNonSalariedWorkerActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) SuccessRegistrationNonSalariedWorkerActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySuccessRegistrationNonSalariedWorkerBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 47;
        f539a = i2 % 128;
        int i3 = i2 % 2;
        SuccessRegistrationNonSalariedWorkerActivity$bindingInflater$1 successRegistrationNonSalariedWorkerActivity$bindingInflater$1 = SuccessRegistrationNonSalariedWorkerActivity$bindingInflater$1.b;
        int i4 = f539a + 119;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return successRegistrationNonSalariedWorkerActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivitySuccessRegistrationNonSalariedWorkerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnOk;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: launchSuggestion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SuccessRegistrationNonSalariedWorkerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        int i2 = g + 37;
        f539a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        CharSequence charSequence;
        int i3 = 2;
        int i4 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i6 = $11 + 17;
            $10 = i6 % 128;
            int i7 = 58224;
            if (i6 % i3 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $11 + 47;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (((long) asInterface) ^ 8611973335120459638L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(d);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMakeMeasureSpec = (char) (47773 - View.MeasureSpec.makeMeasureSpec(i5, i5));
                        charSequence = "";
                        int iIndexOf = TextUtils.indexOf(charSequence, charSequence, i5) + 468;
                        int longPressTimeout = 13 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, iIndexOf, longPressTimeout, -2007001706, false, "o", clsArr);
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf(charSequence, '0', 0) + 47774), TextUtils.indexOf(charSequence, '0') + 469, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    int i13 = $11 + 81;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    oncapturesessionend = oncapturesessionend2;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int pressedStateDuration = 2323 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int iKeyCodeFromString = 44 - KeyEvent.keyCodeFromString("");
                byte b = (byte) 0;
                byte b2 = (byte) (b - 1);
                String str$$i = $$i(b, b2, (byte) (b2 + 1));
                i2 = 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, pressedStateDuration, iKeyCodeFromString, -1312321721, false, str$$i, new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            oncapturesessionend = oncapturesessionend3;
            i3 = i2;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
            int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
            int i2 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b | 36), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, iLastIndexOf, i2, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                int iGreen = Color.green(0) + 1755;
                int i3 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr3 = new Object[1];
                c($$a[5], (byte) 52, (short) ($$b & 61), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iGreen, i3, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~((-465784110) | iIdentityHashCode);
            int i5 = ~iIdentityHashCode;
            int i6 = 1617617601 + ((i4 | (~((-253181684) | i5))) * (-1808)) + (((~((-281035021) | iIdentityHashCode)) | (~(i5 | (-68432595)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode | 253181683)) | 184749089 | (~(465784109 | i5))) * TypedValues.Custom.TYPE_BOOLEAN) + 1274914175;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{5140, 24335, 21574, 23694, 10672, 17573, 42597, 53589, 56001, 681, 36597, 43107, 59462, 29968, 1264, 18224, 53227, 33327}, ((byte) KeyEvent.getModifierMetaStateMask()) + 17, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{51076, 3161, 21078, 46466, 62695, 1821, 36235, 62068, 58555, 18330, 38661, 53968, 63936, 32591, 43825, 17328, 36614, 49945}, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {2125441602};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - View.MeasureSpec.makeMeasureSpec(0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 1727, (ViewConfiguration.getWindowTouchSlop() >> 8) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1274914175, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 29944);
                    int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int iIndexOf2 = TextUtils.indexOf("", "") + 23;
                    Object[] objArr8 = new Object[1];
                    c($$a[5], (byte) 52, (short) ($$b & 61), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode, iIndexOf, iIndexOf2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{38622, 44221, 7182, 45740, 11041, 33084, 6409, 32266, 6018, 32526, 3736, 50448, 63668, 53360, 35018, 18071, 13453, 27792, 7628, 44747, 31191, 7380, 62194, 58169}, 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{2896, 51129, 30096, 5318, 4790, 47202, 37210, 50609, 53943, 10411, 33297, 26984, 44139, 19084, 6356, 50396, 41793, 50424}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                        int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                        Object[] objArr11 = new Object[1];
                        c($$a[5], (byte) 52, (short) 89, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, tapTimeout, offsetBefore, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                        int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
                        int iIndexOf3 = TextUtils.indexOf("", "", 0) + 23;
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[5];
                        Object[] objArr12 = new Object[1];
                        c(b2, (byte) (b2 | 36), bArr2[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, iNormalizeMetaState, iIndexOf3, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i11 = g + 7;
        f539a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_bca).substring(8, 9).codePointAt(0) - 824233243;
        int i14 = ~iCodePointAt;
        int i15 = ~((-646526662) | i14);
        int i16 = ~(433924235 | iCodePointAt);
        int i17 = i13 + (-1774707662) + ((i15 | i16) * 1150) + (((~((-433924236) | i14)) | i16) * (-575)) + (((~(iCodePointAt | (-646526662))) | (~(i14 | 646526661))) * 575);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr13[3])[0] = i19 ^ (i19 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cAlpha = (char) Color.alpha(0);
            int i20 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
            int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0', 0);
            Object[] objArr14 = new Object[1];
            c($$a[5], (byte) 52, (short) 141, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha, i20, iLastIndexOf2, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{38622, 44221, 7182, 45740, 11041, 33084, 6409, 32266, 6018, 32526, 3736, 50448, 63668, 53360, 35018, 18071, 13453, 27792, 7628, 44747, 31191, 7380, 62194, 58169}, 22 - Color.alpha(0), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{2896, 51129, 30096, 5318, 4790, 47202, 37210, 50609, 53943, 10411, 33297, 26984, 44139, 19084, 6356, 50396, 41793, 50424}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step1).substring(2, 4).length() + 13, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 15;
            Object[] objArr17 = new Object[1];
            c($$a[5], (byte) 52, (short) ($$b & 61), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, iKeyCodeFromString, offsetBefore2, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i21 = g + 17;
            f539a = i21 % 128;
            int i22 = i21 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                int iMyTid = 1031 - (Process.myTid() >> 22);
                int i23 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr18 = new Object[1];
                c(b3, b4, (short) (b4 | 193), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, iMyTid, i23, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr19[3])[0];
            int i25 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i26 = (((((~(781491711 | iUptimeMillis)) | 537135169) * 449) + 1930663271) + (((~((~iUptimeMillis) | 781491711)) | 537135169) * 449)) - 772938885;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[2])[0] = i28 ^ (i28 << 5);
            int i29 = f539a + 103;
            g = i29 % 128;
            int i30 = i29 % 2;
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{5140, 24335, 21574, 23694, 10672, 17573, 42597, 53589, 56001, 681, 36597, 43107, 59462, 29968, 1264, 18224, 53227, 33327}, 16 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{51076, 3161, 21078, 46466, 62695, 1821, 36235, 62068, 58555, 18330, 38661, 53968, 63936, 32591, 43825, 17328, 36614, 49945}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.shipping_address).substring(12, 13).length() + 15, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {2125441602};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1134, 18 - Color.argb(0, 0, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -772938885, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                int keyRepeatDelay = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int mode2 = 15 - View.MeasureSpec.getMode(0);
                Object[] objArr24 = new Object[1];
                c($$a[5], (byte) 52, (short) 141, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cResolveOpacity2, keyRepeatDelay, mode2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.getMode(0) + 45993), (ViewConfiguration.getPressedStateDuration() >> 16) + 1117, View.MeasureSpec.makeMeasureSpec(0, 0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr25 = new Object[1];
                c(b5, b6, (short) (b6 | 193), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(size, trimmedLength, tapTimeout2, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{38622, 44221, 7182, 45740, 11041, 33084, 6409, 32266, 6018, 32526, 3736, 50448, 63668, 53360, 35018, 18071, 13453, 27792, 7628, 44747, 31191, 7380, 62194, 58169}, 'F' - AndroidCharacter.getMirror('0'), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{2896, 51129, 30096, 5318, 4790, 47202, 37210, 50609, 53943, 10411, 33297, 26984, 44139, 19084, 6356, 50396, 41793, 50424}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf3 = (char) TextUtils.indexOf("", "");
                    int jumpTapTimeout = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i31 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    Object[] objArr28 = new Object[1];
                    c($$a[5], (byte) 52, (short) ($$b & 61), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf3, jumpTapTimeout, i31, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                    int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                    int iIndexOf4 = TextUtils.indexOf("", "", 0, 0) + 15;
                    Object[] objArr29 = new Object[1];
                    c($$a[5], (byte) 52, (short) 141, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(trimmedLength2, iAxisFromString, iIndexOf4, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr[1])[0];
        int i33 = ((int[]) objArr[3])[0];
        if (i33 == i32) {
            int i34 = g + 97;
            f539a = i34 % 128;
            int i35 = i34 % 2;
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i36 = ((int[]) objArr[2])[0];
            int i37 = ((int[]) objArr[3])[0];
            int i38 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i39 = i36 + 619471748 + (((~((~iIdentityHashCode2) | 331794876)) | 70325826) * 529) + (((~(iIdentityHashCode2 | 331794876)) | 87514706) * 529);
            int i40 = i39 ^ (i39 << 13);
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr30[2])[0] = i41 ^ (i41 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i33];
        int i42 = i33 - 1;
        iArr[i42] = 1;
        Toast.makeText((Context) null, iArr[((i33 * i42) % 2) - 1], 1).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i43 = ((int[]) objArr[2])[0];
        int i44 = ((int[]) objArr[3])[0];
        int i45 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_invalid_phone_number).substring(13, 14).length() + 2021327833;
        int i46 = i43 + 1972551637 + ((~((~length) | 226454245)) * (-116)) + ((155142277 | length) * 116) + (((~(length | (-89137893))) | 17825924) * 116);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr31[2])[0] = i48 ^ (i48 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -673997016
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.String r5 = "currentApplication"
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)
            r5 = r3
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r4 = r4.invoke(r3, r3)
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.heightPixels
            r5 = 1414849389(0x5454e36d, float:3.6573946E12)
            r5 = r5 | r4
            int r5 = ~r5
            r6 = 579340434(0x22880892, float:3.687195E-18)
            r5 = r5 | r6
            int r5 = r5 * 104
            r6 = -410628888(0xffffffffe7864ce8, float:-1.2684316E24)
            int r6 = r6 + r5
            int r5 = ~r4
            r7 = -1409327978(0xffffffffabff5c96, float:-1.8144538E-12)
            r5 = r5 | r7
            int r5 = ~r5
            int r5 = r5 * (-104)
            int r6 = r6 + r5
            r5 = 584861846(0x22dc4896, float:5.9707973E-18)
            r4 = r4 | r5
            int r4 = r4 * 104
            int r6 = r6 + r4
            if (r1 == r6) goto L83
            int r1 = com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.f539a
            int r1 = r1 + 41
            int r4 = r1 % 128
            com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.g = r4
            int r1 = r1 % r0
            r4 = -1
            r5 = -673997017(0xffffffffd7d39f27, float:-4.65361E14)
            r6 = -673997016(0xffffffffd7d39f28, float:-4.6536105E14)
            r7 = 1
            if (r1 == 0) goto L72
            int[] r1 = new int[r6]
            r1[r5] = r7
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r2)
            r1.show()
            goto L83
        L72:
            int[] r1 = new int[r6]
            r1[r5] = r7
            r5 = 386864920(0x170f1718, float:4.623494E-25)
            int r5 = r5 % r0
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r7)
            r1.show()
        L83:
            java.lang.reflect.Member[] r1 = defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r8)
            int r4 = ~r2
            r5 = -305636186(0xffffffffedc85ca6, float:-7.751126E27)
            r5 = r5 | r4
            int r5 = ~r5
            r6 = 2021547516(0x787e5dfc, float:2.0636713E34)
            r5 = r5 | r6
            int r5 = r5 * (-865)
            r7 = 1253296370(0x4ab3c8f2, float:5891193.0)
            int r7 = r7 + r5
            r5 = 305636185(0x1237a359, float:5.794596E-28)
            r2 = r2 | r5
            int r2 = ~r2
            int r2 = r2 * 865
            int r7 = r7 + r2
            r2 = r6 | r4
            int r2 = ~r2
            r4 = r4 | r5
            int r4 = ~r4
            r2 = r2 | r4
            int r2 = r2 * 865
            int r7 = r7 + r2
            if (r1 != r7) goto Lc1
            super.onResume()
            int r1 = com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.f539a
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.g = r2
            int r1 = r1 % r0
            return
        Lc1:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = g + 75;
        f539a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != (-1609520745) + (((~((-237515584) | i5)) | (~(iIdentityHashCode | (-1067503127)))) * 333) + (((~(iIdentityHashCode | (-237515584))) | (~(i5 | (-1067503127)))) * 333)) {
            int i6 = 109621528 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        int i9 = ~i8;
        int i10 = 176424844 + (((~((-320566689) | i9)) | 35210656 | (~(2036478019 | i9)) | (~((-1751121988) | i8))) * (-84));
        int i11 = (~(i8 | 2036478019)) | 320566688;
        int i12 = ~(i9 | (-2036478020));
        if (i7 != i10 + ((i11 | i12) * (-84)) + ((1751121987 | i12) * 84)) {
            throw null;
        }
        super.onStart();
        int i13 = f539a + 73;
        g = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = g + 117;
        f539a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraUseCaseAdapter.b[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i5 = ~(1424161847 | i4);
            int i6 = ~i4;
            int i7 = i5 | (~(594174304 | i6));
            int i8 = ~((-1424161848) | i6);
            if (i3 != 1385610952 + ((i7 | i8) * (-516)) + (((~(i4 | (-587727169))) | (~((-6447137) | i6))) * 516) + ((6447136 | i8) * 516)) {
                throw null;
            }
        } else {
            int i9 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i9 != (((-22730376) + (((~((~iIdentityHashCode) | 1305127875)) | 269488172) * 446)) + (((~(iIdentityHashCode | 1574616047)) | 205652160) * 446)) - 67359576) {
                throw null;
            }
        }
        int i10 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i11 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        if (i10 != (((-856319252) + (((~(i11 | 2008531804)) | 570524160) * (-828))) + ((i11 | 2008531804) * (-828))) - 911990988) {
            throw new RuntimeException("-2027417443");
        }
        super.onCreate(bundle);
        int i12 = f539a + 53;
        g = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 48 / 0;
        }
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(SuccessRegistrationNonSalariedWorkerActivity successRegistrationNonSalariedWorkerActivity) {
        int i = 2 % 2;
        int i2 = g + 67;
        f539a = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) successRegistrationNonSalariedWorkerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = f539a + 39;
        g = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(SuccessRegistrationNonSalariedWorkerActivity successRegistrationNonSalariedWorkerActivity, View view) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (((User) successRegistrationNonSalariedWorkerActivity.TuitionPaymentFragmentbindingInflater1.getValue()) == null) {
            z = true;
        } else {
            int i2 = g + 1;
            f539a = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if (!z) {
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(successRegistrationNonSalariedWorkerActivity, null, null, 6);
            successRegistrationNonSalariedWorkerActivity.finish();
        } else {
            int i4 = f539a + 111;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(successRegistrationNonSalariedWorkerActivity, null, false, 79);
                successRegistrationNonSalariedWorkerActivity.d_();
            } else {
                LoginActivity.Companion companion3 = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(successRegistrationNonSalariedWorkerActivity, null, false, 6);
                successRegistrationNonSalariedWorkerActivity.d_();
            }
        }
        return Unit.INSTANCE;
    }

    static {
        asBinder = 0;
        d();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 31;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 71;
        int i3 = i2 % 128;
        f539a = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_success_registration_non_salaried_worker;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f539a + 121;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentbindingInflater1 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        int length = (-1273826997) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellSiteTitle).substring(0, 4).length();
        int iTuitionPaymentFragmentbindingInflater2 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), length, iTuitionPaymentFragmentbindingInflater1, 56519659, iTuitionPaymentFragmentbindingInflater2, new Object[]{this}, -56519658);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 466511085 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iCodePointAt = 217858427 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3);
        int iTuitionPaymentFragmentbindingInflater1 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationProfileRequest.TuitionPaymentFragmentbindingInflater1(), iCodePointAt, i, 1338930727, iTuitionPaymentFragmentbindingInflater1, new Object[]{this}, -1338930727);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = f539a + 61;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f539a + 87;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = f539a + 31;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void d() {
        TuitionPaymentFragmentbindingInflater1 = (char) 6950;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 46543;
        asInterface = (char) 60247;
        d = (char) 39677;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 95;
        f539a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 1;
        f539a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return null;
    }

    private static String $$i(short s, byte b, int i) {
        int i2 = (s * 3) + 108;
        int i3 = i * 2;
        int i4 = b + 4;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + (-i4);
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i4 + 1;
            i2 += -bArr[i8];
            i4 = i8;
            i6 = i7;
        }
    }
}
