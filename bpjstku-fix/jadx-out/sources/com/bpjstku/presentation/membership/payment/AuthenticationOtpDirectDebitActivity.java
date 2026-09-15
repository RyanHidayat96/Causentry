package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.Html;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.request.AuthOtpBriDirectDebitRequest;
import com.bpjstku.data.payment.model.request.CreateRecurringPlanRequest;
import com.bpjstku.data.payment.model.request.ForceExpirePaymentMethodRequest;
import com.bpjstku.data.payment.model.request.PaymentProfileItem;
import com.bpjstku.data.payment.model.response.AuthOtpBriDirectDebitResponse;
import com.bpjstku.data.payment.model.response.RecurringPlanResponse;
import com.bpjstku.databinding.ActivityAuthenticationOtpDirectDebitBinding;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.membership.payment.AuthenticationOtpDirectDebitActivity;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState;
import com.google.gson.internal.bind.TypeAdapters;
import com.mukesh.OtpView;
import defpackage.AutoValue_MediaSpec1;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.ListPopupWindow2;
import defpackage.SessionProcessor;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deriveCodec;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.notifyStateAttached;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.suspendUseCases;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004R\u001b\u0010\u0013\u001a\u00020\u000f8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00178\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0018\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001e"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/AuthenticationOtpDirectDebitActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAuthenticationOtpDirectDebitBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "onResume", "onStop", "onDestroy", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "Lkotlin/Lazy;", "INotificationSideChannel", "()Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "LgetCameraCharacteristic;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetCameraCharacteristic;", "LListPopupWindow2;", "LgetStringOrNull;", "LgetStringOrNull;", "", "()I", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthenticationOtpDirectDebitActivity extends BindingBaseActivity<ActivityAuthenticationOtpDirectDebitBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char asBinder;
    private static long asInterface;
    private static int g;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: toGlobalMotionEvent
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AuthenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private getStringOrNull b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private getCameraCharacteristic TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 79;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {77, -106, 83, 4, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 1;
    private static int cancelAll = 1;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f525a = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = (~(i7 | i8 | i6)) | (~(i5 | i2 | i6));
        int i10 = ~i6;
        int i11 = (~(i8 | i5)) | (~(i8 | i10));
        int i12 = (~(i6 | i2)) | (~(i7 | i10));
        int i13 = i5 + i2 + i + ((-564018846) * i3) + (483938512 * i4);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i5) + 752877568 + ((-1516524009) * i2) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i) + (1390411776 * i3) + (452984832 * i4) + ((-1135738880) * i14);
        int i16 = ((i5 * 1456092922) - 824780772) + (i2 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i * 1456093799) + (i3 * 578355822) + (i4 * 1098359728) + (i14 * 1868693504);
        int i17 = i15 + (i16 * i16 * 2110914560);
        if (i17 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i17 == 2) {
            return b(objArr);
        }
        if (i17 != 3) {
            return i17 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
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
    private static void e(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r0 = 53 - r6
            int r8 = r8 + 4
            byte[] r1 = com.bpjstku.presentation.membership.payment.AuthenticationOtpDirectDebitActivity.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r3 = r3 + 1
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.AuthenticationOtpDirectDebitActivity.e(short, short, short, java.lang.Object[]):void");
    }

    public AuthenticationOtpDirectDebitActivity() {
        final AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.AuthenticationOtpDirectDebitActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = authenticationOtpDirectDebitActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListPopupWindow2.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.AuthenticationOtpDirectDebitActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/AuthenticationOtpDirectDebitActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/tuition/model/CustomerObject;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, CustomerObject p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) AuthenticationOtpDirectDebitActivity.class);
            intent.putExtra("customer_object_recurring", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
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
            int i3 = $10 + 49;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), MotionEvent.axisFromString("") + 1236, KeyEvent.getDeadChar(0, 0) + 35, -653973969, false, $$i(b, b2, (byte) (b2 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getOffsetBefore("", 0), KeyEvent.normalizeMetaState(0) + 2764, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, 1504416861, false, $$i(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 253, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65199 - Process.getGidForName("")), 2890 - ImageFormat.getBitsPerPixel(0), 17 - View.resolveSizeAndState(0, 0, 0), 2012627446, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (asInterface ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) g) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asBinder) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i5 = $11 + 89;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private final CustomerObject INotificationSideChannel() throws Throwable {
        int iIntValue;
        long j;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - MotionEvent.axisFromString("")), (ViewConfiguration.getTouchSlop() >> 8) + 40, ExpandableListView.getPackedPositionGroup(0L) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        Object obj = null;
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(new char[]{41999, 43400, 40776, 44739}, new char[]{14732, 21410, 31621, 29813}, (char) ((-1) - Process.getGidForName("")), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46, new char[]{56005, 43552, 7680, 36842, 22645, 5902, 48393, 47856, 49508, 12573, 16384, 8206, 2421, 12700, 4325, 55748, 58176, 52732, 23030, 15723, 27470, 16230}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(new char[]{41999, 43400, 40776, 44739}, new char[]{55697, 44113, 9553, 50354}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.successful).substring(5, 6).codePointAt(0) + 45490), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1370247605, new char[]{47573, 13323, 56058, 45548, 33301, 12616, 14412, 62849, 37119, 50666, 53817, 1888, 59811, 37792, 33469}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -964;
        int i3 = i2;
        long j3 = -1;
        long j4 = j3 ^ 1422856655489211839L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = (((long) (-963)) * 674400519252747148L) + j2 + (((long) 965) * 1422856655489211839L) + (((j3 ^ 674400519252747148L) | ((j4 | jIdentityHashCode) ^ j3)) * j2) + (j2 * (((j4 | 674400519252747148L) ^ j3) | ((j4 | (jIdentityHashCode ^ j3)) ^ j3)));
        int i4 = 0;
        try {
            while (i4 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37835 - ((byte) KeyEvent.getModifierMetaStateMask())), 59 - View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 19, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(obj);
                int i6 = 0;
                long j6 = jLongValue;
                while (true) {
                    int i7 = 0;
                    while (i7 != 8) {
                        i5 = (((((int) (j6 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                        i7++;
                        jLongValue = jLongValue;
                    }
                    j = jLongValue;
                    if (i6 != 0) {
                        break;
                    }
                    int i8 = d + 109;
                    int i9 = i8 % 128;
                    f525a = i9;
                    i6 = i8 % 2 == 0 ? i6 + 103 : i6 + 1;
                    int i10 = i9 + 55;
                    d = i10 % 128;
                    int i11 = i10 % 2;
                    j6 = j5;
                    jLongValue = j;
                }
                int i12 = i3;
                if (i5 == i12) {
                    return (CustomerObject) this.TuitionPaymentFragmentbindingInflater1.getValue();
                }
                int i13 = d + 99;
                f525a = i13 % 128;
                if (i13 % 2 == 0) {
                    jLongValue = j - 1024;
                    i4 += 53;
                } else {
                    jLongValue = j - 1024;
                    i4++;
                }
                i3 = i12;
                obj = null;
            }
            Object[] objArr3 = {1845775703};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - TextUtils.indexOf("", "", 0, 0)), View.getDefaultSize(0, 0) + 1134, (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, -1519900047, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                int size = View.MeasureSpec.getSize(0) + 15;
                byte b = $$a[7];
                Object[] objArr5 = new Object[1];
                e(b, (byte) $$b, b, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, pressedStateDuration, size, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1118, 17 - View.MeasureSpec.makeMeasureSpec(0, 0)), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i14 = ((int[]) objArr6[1])[0];
            int i15 = ((int[]) objArr6[3])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i15];
                int i16 = i15 - 1;
                iArr[i16] = 1;
                Toast.makeText((Context) null, iArr[((i15 * i16) % 2) - 1], 1).show();
                int i17 = d + 107;
                f525a = i17 % 128;
                int i18 = i17 % 2;
            }
            return (CustomerObject) this.TuitionPaymentFragmentbindingInflater1.getValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        Object[] objArr7 = new Object[1];
        c(new char[]{41999, 43400, 40776, 44739}, new char[]{50853, 7786, 34837, 30034}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_left_eye_closed).substring(0, 14).length() + 21114), TextUtils.getOffsetBefore("", 0), new char[]{56349, 64867, 56745, 26509, 12282, 2615, 28548, 5565, 2051, 29642, 22151, 10893, 48334, 17655, 57922, 5804}, objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        c(new char[]{41999, 43400, 40776, 44739}, new char[]{64371, 45728, 16691, 51145}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 51485), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{20213, 32192, 22991, 55794, 11689, 19941, 221, 31773, 13288, 51963, 49094, 55768, 11882, 19293, 49861, 62217}, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f525a + 45;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            AuthenticationOtpDirectDebitActivity$bindingInflater$1 authenticationOtpDirectDebitActivity$bindingInflater$1 = AuthenticationOtpDirectDebitActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
        AuthenticationOtpDirectDebitActivity$bindingInflater$1 authenticationOtpDirectDebitActivity$bindingInflater$2 = AuthenticationOtpDirectDebitActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = d + 107;
        f525a = i3 % 128;
        int i4 = i3 % 2;
        return authenticationOtpDirectDebitActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getCameraCharacteristic(((ActivityAuthenticationOtpDirectDebitBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, null);
        int i2 = d + 111;
        f525a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityAuthenticationOtpDirectDebitBinding activityAuthenticationOtpDirectDebitBinding = (ActivityAuthenticationOtpDirectDebitBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityAuthenticationOtpDirectDebitBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: drawDividersHorizontal
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                AuthenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityAuthenticationOtpDirectDebitBinding, this);
            }
        });
        Button button = activityAuthenticationOtpDirectDebitBinding.btnCancel;
        Intrinsics.checkNotNullExpressionValue(button, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button, new Function0() { // from class: onLongPress
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AuthenticationOtpDirectDebitActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        OtpView otpView = activityAuthenticationOtpDirectDebitBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: toLocalMotionEvent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityAuthenticationOtpDirectDebitBinding, (String) obj);
            }
        }));
        Button button2 = activityAuthenticationOtpDirectDebitBinding.btnVerification;
        Intrinsics.checkNotNullExpressionValue(button2, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button2, new Function0() { // from class: onTouchObserved
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AuthenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activityAuthenticationOtpDirectDebitBinding);
            }
        });
        int i2 = f525a + 55;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity = this;
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(authenticationOtpDirectDebitActivity, new Observer() { // from class: ForwardingListenerDisallowIntercept
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                AuthenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).f164a.observe(authenticationOtpDirectDebitActivity, new Observer() { // from class: forceUniformHeight
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                AuthenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 93311932, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -93311931, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj}, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).cancelAll.observe(authenticationOtpDirectDebitActivity, new Observer() { // from class: LinearLayoutCompat
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                AuthenticationOtpDirectDebitActivity.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = d + 79;
        f525a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ((ActivityAuthenticationOtpDirectDebitBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.setCursorVisible(true);
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (getcameracharacteristic == null) {
            int i2 = f525a + 105;
            d = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i4 = f525a + 55;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        TextView textView = ((ActivityAuthenticationOtpDirectDebitBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvDetailInstructionLineSecond;
        String str = INotificationSideChannel().asInterface;
        StringBuilder sb = new StringBuilder("registered mobile number <b>");
        sb.append(str);
        sb.append("</b>");
        textView.setText(Html.fromHtml(sb.toString()));
        int i2 = d + 119;
        f525a = i2 % 128;
        int i3 = i2 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2076084260
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
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.AuthenticationOtpDirectDebitActivity.onResume():void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        super.onStop();
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i2 = f525a + 75;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                int i3 = 39 / 0;
            } else {
                tuitionPaymentFragmentbindingInflater1.cancel();
            }
        }
        getcameracharacteristic.b = null;
        int i4 = f525a + 53;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity = (AuthenticationOtpDirectDebitActivity) objArr[0];
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = authenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = null;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = f525a + 27;
            d = i2 % 128;
            int i3 = i2 % 2;
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i4 = f525a + 53;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                obj.hashCode();
                throw null;
            }
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
        int i5 = d + 107;
        f525a = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr2;
        AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity = (AuthenticationOtpDirectDebitActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
            int i2 = $$b;
            Object[] objArr3 = new Object[1];
            e((byte) (i2 | 14), (byte) i2, (short) 52, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, iCombineMeasuredStates, windowTouchSlop, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = d + 91;
            f525a = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cBlue = (char) (Color.blue(0) + 29944);
                int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0');
                byte b = $$a[7];
                byte b2 = (byte) $$b;
                Object[] objArr4 = new Object[1];
                e(b, b2, (short) (b2 | 88), objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, iLastIndexOf, iIndexOf, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iNextInt = new Random().nextInt(473179089);
            int i5 = 1650324667 + (((~((~iNextInt) | (-537955857))) | (~((-69210567) | iNextInt))) * (-302)) + ((~((-537955857) | iNextInt)) * (-604)) + (((~(iNextInt | (-607166423))) | (-888979415)) * 302) + 1818287518;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            c(new char[]{41999, 43400, 40776, 44739}, new char[]{50853, 7786, 34837, 30034}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto7_bni).substring(105, 113).codePointAt(3) + 21026), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{56349, 64867, 56745, 26509, 12282, 2615, 28548, 5565, 2051, 29642, 22151, 10893, 48334, 17655, 57922, 5804}, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            c(new char[]{41999, 43400, 40776, 44739}, new char[]{64371, 45728, 16691, 51145}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step3).substring(1, 3).length() + 51519), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step5).substring(1, 7).codePointAt(3) - 105, new char[]{20213, 32192, 22991, 55794, 11689, 19941, 221, 31773, 13288, 51963, 49094, 55768, 11882, 19293, 49861, 62217}, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, authenticationOtpDirectDebitActivity)).intValue();
            try {
                Object[] objArr8 = {463487304};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 42049), 1726 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 1818287518);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 1756;
                    int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                    byte b3 = $$a[7];
                    byte b4 = (byte) $$b;
                    Object[] objArr9 = new Object[1];
                    e(b3, b4, (short) (b4 | 88), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, iLastIndexOf2, i8, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    c(new char[]{41999, 43400, 40776, 44739}, new char[]{14732, 21410, 31621, 29813}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0), new char[]{56005, 43552, 7680, 36842, 22645, 5902, 48393, 47856, 49508, 12573, 16384, 8206, 2421, 12700, 4325, 55748, 58176, 52732, 23030, 15723, 27470, 16230}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{41999, 43400, 40776, 44739}, new char[]{55697, 44113, 9553, 50354}, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 45605), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay).substring(0, 16).codePointAt(4) + 1370247536, new char[]{47573, 13323, 56058, 45548, 33301, 12616, 14412, 62849, 37119, 50666, 53817, 1888, 59811, 37792, 33469}, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarSize = (char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int mirror = AndroidCharacter.getMirror('0') + 1707;
                        int iArgb = Color.argb(0, 0, 0, 0) + 23;
                        byte b5 = $$a[7];
                        byte b6 = (byte) $$b;
                        Object[] objArr12 = new Object[1];
                        e(b5, b6, (short) (b6 | 140), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, mirror, iArgb, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                        int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                        int i9 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                        int i10 = $$b;
                        Object[] objArr13 = new Object[1];
                        e((byte) (i10 | 14), (byte) i10, (short) 52, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, offsetBefore, i9, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i12 == i11) {
            int i13 = f525a + 31;
            d = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i16 = ~iMaxMemory;
            int i17 = i15 + 2118678097 + (((~((-320350185) | i16)) | 318776864) * 184) + ((iMaxMemory | (-534525931)) * (-184)) + ((~((-532952611) | i16)) * 184);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr14[3])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                int i20 = d + 105;
                f525a = i20 % 128;
                int i21 = i20 % 2 == 0 ? 1 : 0;
                while (i21 < strArr.length) {
                    int i22 = d + 107;
                    f525a = i22 % 128;
                    if (i22 % 2 == 0) {
                        arrayList.add(strArr[i21]);
                        i21 += 60;
                    } else {
                        arrayList.add(strArr[i21]);
                        i21++;
                    }
                }
            }
            int[] iArr = new int[i12];
            int i23 = i12 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i25 = ~((int) Runtime.getRuntime().freeMemory());
            int i26 = i24 + 393636345 + (((~(i25 | 670481930)) | 403177936) * (-160)) + (((~(i25 | 457879504)) | 670481930) * 160);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr15[3])[0] = i28 ^ (i28 << 5);
            int i29 = d + 31;
            f525a = i29 % 128;
            int i30 = i29 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iCombineMeasuredStates2 = 1031 - View.combineMeasuredStates(0, 0);
            int iResolveSize = 15 - View.resolveSize(0, 0);
            byte b7 = $$a[7];
            Object[] objArr16 = new Object[1];
            e(b7, (byte) $$b, b7, objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iCombineMeasuredStates2, iResolveSize, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr17 = new Object[1];
        c(new char[]{41999, 43400, 40776, 44739}, new char[]{14732, 21410, 31621, 29813}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.amount_after_discount).substring(14, 15).codePointAt(0) - 65), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{56005, 43552, 7680, 36842, 22645, 5902, 48393, 47856, 49508, 12573, 16384, 8206, 2421, 12700, 4325, 55748, 58176, 52732, 23030, 15723, 27470, 16230}, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        c(new char[]{41999, 43400, 40776, 44739}, new char[]{55697, 44113, 9553, 50354}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 45569), 1370247641 - Gravity.getAbsoluteGravity(0, 0), new char[]{47573, 13323, 56058, 45548, 33301, 12616, 14412, 62849, 37119, 50666, 53817, 1888, 59811, 37792, 33469}, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
            int iRed = Color.red(0) + 15;
            byte b8 = $$a[7];
            byte b9 = (byte) $$b;
            Object[] objArr19 = new Object[1];
            e(b8, b9, (short) (b9 | 88), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(mode, scrollBarFadeDuration, iRed, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i31 = f525a + 113;
            d = i31 % 128;
            int i32 = i31 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 1031;
                int i33 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b10 = $$a[7];
                Object[] objArr20 = new Object[1];
                e((byte) 52, b10, (short) (b10 | 193), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cArgb, offsetBefore2, i33, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i34 = ((int[]) objArr21[3])[0];
            int i35 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int i36 = (int) Runtime.getRuntime().totalMemory();
            int i37 = ~i36;
            int i38 = (((((~(817240763 | i37)) | (~((-1061520934) | i36))) | (~(i37 | 1061520933))) * 959) - 400432084) + (((~(i36 | 1061520933)) | (~(i37 | (-1061520934))) | (~(817240763 | i36))) * 959) + 861465623;
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr2[2])[0] = i40 ^ (i40 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            c(new char[]{41999, 43400, 40776, 44739}, new char[]{50853, 7786, 34837, 30034}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.api_fail_message).substring(6, 7).codePointAt(0) + 21023), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{56349, 64867, 56745, 26509, 12282, 2615, 28548, 5565, 2051, 29642, 22151, 10893, 48334, 17655, 57922, 5804}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            c(new char[]{41999, 43400, 40776, 44739}, new char[]{64371, 45728, 16691, 51145}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_shippingzipcode_empty).substring(24, 25).length() + 51520), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{20213, 32192, 22991, 55794, 11689, 19941, 221, 31773, 13288, 51963, 49094, 55768, 11882, 19293, 49861, 62217}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, authenticationOtpDirectDebitActivity)).intValue();
            Object[] objArr24 = {463487304};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 46038), 1134 - View.MeasureSpec.getMode(0), View.resolveSizeAndState(0, 0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, 861465623, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int defaultSize = 1031 - View.getDefaultSize(0, 0);
                int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
                byte b11 = $$a[7];
                Object[] objArr26 = new Object[1];
                e(b11, (byte) $$b, b11, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cCombineMeasuredStates, defaultSize, packedPositionGroup, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1117 - Drawable.resolveOpacity(0, 0), 17 - (KeyEvent.getMaxKeyCode() >> 16)), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int i41 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iAxisFromString = 14 - MotionEvent.axisFromString("");
                byte b12 = $$a[7];
                Object[] objArr27 = new Object[1];
                e((byte) 52, b12, (short) (b12 | 193), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cAxisFromString, i41, iAxisFromString, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr28 = new Object[1];
                c(new char[]{41999, 43400, 40776, 44739}, new char[]{14732, 21410, 31621, 29813}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_invalid_merchant_url).substring(0, 13).length() - 13), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step1).substring(0, 1).codePointAt(0) - 84, new char[]{56005, 43552, 7680, 36842, 22645, 5902, 48393, 47856, 49508, 12573, 16384, 8206, 2421, 12700, 4325, 55748, 58176, 52732, 23030, 15723, 27470, 16230}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                c(new char[]{41999, 43400, 40776, 44739}, new char[]{55697, 44113, 9553, 50354}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_format_valid_until).substring(3, 4).length() + 45604), 1370247605 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, new char[]{47573, 13323, 56058, 45548, 33301, 12616, 14412, 62849, 37119, 50666, 53817, 1888, 59811, 37792, 33469}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cRed = (char) Color.red(0);
                    int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                    int mode2 = 15 - View.MeasureSpec.getMode(0);
                    byte b13 = $$a[7];
                    byte b14 = (byte) $$b;
                    Object[] objArr30 = new Object[1];
                    e(b13, b14, (short) (b14 | 88), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRed, tapTimeout, mode2, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                    int defaultSize2 = 15 - View.getDefaultSize(0, 0);
                    byte b15 = $$a[7];
                    Object[] objArr31 = new Object[1];
                    e(b15, (byte) $$b, b15, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, doubleTapTimeout, defaultSize2, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i42 = ((int[]) objArr2[1])[0];
        int i43 = ((int[]) objArr2[3])[0];
        if (i43 == i42) {
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i44 = ((int[]) objArr2[2])[0];
            int i45 = ((int[]) objArr2[3])[0];
            int i46 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i47 = ~iUptimeMillis;
            int i48 = ~(982650819 | i47);
            int i49 = i44 + (-1057326399) + (((-1049800668) | i48) * (-712)) + (((~(iUptimeMillis | (-67149849))) | (~(i47 | 1049800667))) * (-712)) + ((738370649 | i48) * 712);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr32[2])[0] = i51 ^ (i51 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            int i52 = f525a + 35;
            d = i52 % 128;
            int i53 = i52 % 2;
            for (String str : strArr4) {
                int i54 = f525a + 125;
                d = i54 % 128;
                int i55 = i54 % 2;
                arrayList2.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i43));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = d + 83;
        f525a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        if (i4 != (-303025332) + (((~(1423859550 | startUptimeMillis)) | (-593872008)) * (-964)) + (((~((~startUptimeMillis) | 1423859550)) | (-2013257696)) * (-964))) {
            int i5 = d + 121;
            f525a = i5 % 128;
            if (i5 % 2 == 0) {
                int[] iArr = new int[433886112];
                iArr[433886111] = 1;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[433886112];
                iArr2[433886111] = 1;
                int i6 = 910463072 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 957700016;
        if (i7 != ((((~((-2122238902) | i8)) | 1699000850) * 398) - 243198242) + (((~((~i8) | (-2122238902))) | 1699000850) * 398)) {
            int i9 = (-1225994278) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f525a + 85;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != 1887090036 + (((~(1874942665 | iIdentityHashCode)) | (-1044955123)) * (-964)) + (((~((~iIdentityHashCode) | 1874942665)) | (-2143944700)) * (-964))) {
            int i5 = 874549922 % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        if (i6 != (-1578041088) + (((~(1564648235 | i7)) | 540278800) * (-140)) + ((~(2104927035 | i7)) * 70) + (((~(i7 | 1014407729)) | 1630798106) * 70)) {
            throw new RuntimeException("-303296729");
        }
        super.onCreate(bundle);
        int i8 = d + 7;
        f525a = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f525a + 25;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = f525a + 73;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity, ActivityAuthenticationOtpDirectDebitBinding activityAuthenticationOtpDirectDebitBinding) {
        int i = 2 % 2;
        final ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) authenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        AuthOtpBriDirectDebitRequest authOtpBriDirectDebitRequest = new AuthOtpBriDirectDebitRequest(String.valueOf(activityAuthenticationOtpDirectDebitBinding.otpVerify.getText()), String.valueOf(authenticationOtpDirectDebitActivity.INotificationSideChannel().INotificationSideChannelStub), String.valueOf(authenticationOtpDirectDebitActivity.INotificationSideChannel().INotificationSideChannelStubProxy));
        Intrinsics.checkNotNullParameter(authOtpBriDirectDebitRequest, "");
        MutableLiveData<VirtualCameraAdapter1<AuthOtpBriDirectDebitResponse>> mutableLiveData = listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec<AuthOtpBriDirectDebitResponse> derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault3 = listPopupWindow2.write.TuitionPaymentFragmentspecialinlinedviewModeldefault3(authOtpBriDirectDebitRequest);
        Object obj = null;
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault3));
        final Function1 function1 = new Function1() { // from class: isVectorDrawable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listPopupWindow2, (AuthOtpBriDirectDebitResponse) obj2);
            }
        };
        logToString logtostring = new logToString() { // from class: ResourceManagerInternalDrawableDelegate
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function1.invoke(obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: ResourceManagerInternalColorFilterLruCache
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ListPopupWindow2.asInterface(listPopupWindow2, (Throwable) obj2);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: generateCacheKey
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function2.invoke(obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        listPopupWindow2.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Unit unit = Unit.INSTANCE;
        int i2 = f525a + 51;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity = (AuthenticationOtpDirectDebitActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            authenticationOtpDirectDebitActivity.MediaBrowserCompat();
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            authenticationOtpDirectDebitActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(authenticationOtpDirectDebitActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: pointInView
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthenticationOtpDirectDebitActivity.onTransact();
                }
            });
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            authenticationOtpDirectDebitActivity.IconCompatParcelizer();
            String recurringPlanId = ((RecurringPlanResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringPlanId();
            Intrinsics.checkNotNull(recurringPlanId);
            if (recurringPlanId.length() > 0) {
                int i2 = f525a + 73;
                d = i2 % 128;
                if (i2 % 2 != 0) {
                    RegisterRecurringSuccessActivity.Companion companion = RegisterRecurringSuccessActivity.INSTANCE;
                    RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(authenticationOtpDirectDebitActivity, authenticationOtpDirectDebitActivity.INotificationSideChannel());
                    throw null;
                }
                RegisterRecurringSuccessActivity.Companion companion2 = RegisterRecurringSuccessActivity.INSTANCE;
                RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(authenticationOtpDirectDebitActivity, authenticationOtpDirectDebitActivity.INotificationSideChannel());
            }
        }
        int i3 = d + 1;
        f525a = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityAuthenticationOtpDirectDebitBinding activityAuthenticationOtpDirectDebitBinding, AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity) {
        int i = 2 % 2;
        int i2 = d + 27;
        f525a = i2 % 128;
        if (i2 % 2 != 0) {
            OtpView otpView = activityAuthenticationOtpDirectDebitBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, authenticationOtpDirectDebitActivity);
        } else {
            OtpView otpView2 = activityAuthenticationOtpDirectDebitBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView2, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, authenticationOtpDirectDebitActivity);
            int i3 = 13 / 0;
        }
    }

    public static /* synthetic */ Unit b(AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity, String str) {
        int i = 2 % 2;
        ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) authenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String str2 = authenticationOtpDirectDebitActivity.INotificationSideChannel().TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("#");
        sb.append(str);
        String string = sb.toString();
        String str3 = authenticationOtpDirectDebitActivity.INotificationSideChannel().INotificationSideChannel;
        Intrinsics.checkNotNull(str3);
        int i2 = authenticationOtpDirectDebitActivity.INotificationSideChannel().IconCompatParcelizer;
        String strValueOf = String.valueOf(authenticationOtpDirectDebitActivity.INotificationSideChannel().d);
        int i3 = authenticationOtpDirectDebitActivity.INotificationSideChannel().IconCompatParcelizer;
        String str4 = authenticationOtpDirectDebitActivity.INotificationSideChannel().TuitionPaymentFragmentbindingInflater1;
        String str5 = authenticationOtpDirectDebitActivity.INotificationSideChannel().getItem;
        String str6 = authenticationOtpDirectDebitActivity.INotificationSideChannel().RemoteActionCompatParcelizer;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i3);
        sb2.append("#");
        sb2.append(str4);
        sb2.append("#");
        sb2.append(str5);
        sb2.append("#");
        sb2.append(str6);
        String string2 = sb2.toString();
        String strValueOf2 = String.valueOf(authenticationOtpDirectDebitActivity.INotificationSideChannel().INotificationSideChannel);
        String string3 = authenticationOtpDirectDebitActivity.INotificationSideChannel().TuitionPaymentFragmentbindingInflater1.toString();
        String string4 = authenticationOtpDirectDebitActivity.INotificationSideChannel().b.toString();
        String string5 = authenticationOtpDirectDebitActivity.INotificationSideChannel().TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString();
        String strValueOf3 = String.valueOf(authenticationOtpDirectDebitActivity.INotificationSideChannel().asInterface);
        String strValueOf4 = String.valueOf(authenticationOtpDirectDebitActivity.INotificationSideChannel().a);
        String str7 = authenticationOtpDirectDebitActivity.INotificationSideChannel().getInterfaceDescriptor;
        String str8 = authenticationOtpDirectDebitActivity.INotificationSideChannel().getInterfaceDescriptor;
        String string6 = authenticationOtpDirectDebitActivity.INotificationSideChannel().RemoteActionCompatParcelizer.toString();
        int i4 = authenticationOtpDirectDebitActivity.INotificationSideChannel().IconCompatParcelizer;
        listPopupWindow2.b(new CreateRecurringPlanRequest(string, str3, String.valueOf(i2), strValueOf, string2, new PaymentProfileItem(strValueOf2, string3, string4, string5, strValueOf3, strValueOf4, "BRI", string6, String.valueOf(i4), str8, str7, String.valueOf(authenticationOtpDirectDebitActivity.INotificationSideChannel().getItem))));
        Unit unit = Unit.INSTANCE;
        int i5 = d + 1;
        f525a = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit d() {
        int i = 2 % 2;
        int i2 = f525a + 61;
        d = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = d + 37;
        f525a = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity) {
        int i = 2 % 2;
        ((ListPopupWindow2) authenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ForceExpirePaymentMethodRequest(String.valueOf(authenticationOtpDirectDebitActivity.INotificationSideChannel().d)));
        getStringOrNull getstringornull = authenticationOtpDirectDebitActivity.b;
        if (getstringornull != null) {
            int i2 = f525a + 47;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                getstringornull.dismiss();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getstringornull.dismiss();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = f525a + 53;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = f525a + 95;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i4 = i3 + 87;
            f525a = i4 % 128;
            int i5 = i4 % 2;
            authenticationOtpDirectDebitActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            authenticationOtpDirectDebitActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(authenticationOtpDirectDebitActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: onTouch
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthenticationOtpDirectDebitActivity.d();
                }
            });
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i6 = i3 + 63;
            f525a = i6 % 128;
            int i7 = i6 % 2;
            authenticationOtpDirectDebitActivity.IconCompatParcelizer();
            authenticationOtpDirectDebitActivity.d_();
        }
        int i8 = d + 81;
        f525a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 58 / 0;
        }
    }

    public static /* synthetic */ Unit onTransact() {
        int i = 2 % 2;
        int i2 = d + 79;
        f525a = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = d + 7;
        f525a = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityAuthenticationOtpDirectDebitBinding activityAuthenticationOtpDirectDebitBinding, String str) {
        int i = 2 % 2;
        int i2 = d + 19;
        f525a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 6) {
            int i4 = d + 13;
            f525a = i4 % 128;
            int i5 = i4 % 2;
            Button button = activityAuthenticationOtpDirectDebitBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(button, "");
            Button button2 = button;
            Intrinsics.checkNotNullParameter(button2, "");
            button2.setEnabled(false);
        } else {
            Button button3 = activityAuthenticationOtpDirectDebitBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(button3, "");
            Button button4 = button3;
            Intrinsics.checkNotNullParameter(button4, "");
            button4.setEnabled(true);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = d + 35;
        f525a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            authenticationOtpDirectDebitActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            authenticationOtpDirectDebitActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(authenticationOtpDirectDebitActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: ForwardingListener
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    return (Unit) AuthenticationOtpDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1725569329, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1725569327, new Object[0], iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            });
            int i2 = d + 5;
            f525a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = f525a + 77;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                authenticationOtpDirectDebitActivity.IconCompatParcelizer();
                Intrinsics.areEqual(((AuthOtpBriDirectDebitResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataAuthOtp().getStatus(), "ACTIVE");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            authenticationOtpDirectDebitActivity.IconCompatParcelizer();
            if (!Intrinsics.areEqual(((AuthOtpBriDirectDebitResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataAuthOtp().getStatus(), "ACTIVE")) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Gagal Autentikasi Kartu Debit", 0).show();
                return;
            }
            final String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string2 = authenticationOtpDirectDebitActivity.getString(R.string.action_ok_continue);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_email, "Pendaftaran Auto Debit", "Tagihan akan dibayarkan secara otomatis. Apakah Anda yakin akan melanjutkan ke  proses berikutnya?", string2, new Function0() { // from class: FitWindowsViewGroupOnFitSystemWindowsListener
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthenticationOtpDirectDebitActivity.b(this.b, string);
                }
            }, authenticationOtpDirectDebitActivity.getString(R.string.action_return), new Function0() { // from class: ForwardingListenerTriggerLongPress
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthenticationOtpDirectDebitActivity.TuitionPaymentFragmentbindingInflater1(this.b);
                }
            });
            authenticationOtpDirectDebitActivity.b = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            FragmentManager supportFragmentManager = authenticationOtpDirectDebitActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i5 = f525a + 95;
                d = i5 % 128;
                if (i5 % 2 == 0) {
                    getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i6 = 45 / 0;
                }
            }
        }
    }

    public static /* synthetic */ CustomerObject TuitionPaymentFragmentspecialinlinedviewModeldefault1(AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity) {
        int i = 2 % 2;
        int i2 = d + 119;
        f525a = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = authenticationOtpDirectDebitActivity.getIntent().getParcelableExtra("customer_object_recurring");
        Intrinsics.checkNotNull(parcelableExtra);
        CustomerObject customerObject = (CustomerObject) parcelableExtra;
        int i4 = f525a + 45;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return customerObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity) {
        int i = 2 % 2;
        int i2 = d + 103;
        f525a = i2 % 128;
        int i3 = i2 % 2;
        authenticationOtpDirectDebitActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = f525a + 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit g() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1725569329, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1725569327, new Object[0], iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AuthenticationOtpDirectDebitActivity authenticationOtpDirectDebitActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 93311932, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -93311931, new Object[]{authenticationOtpDirectDebitActivity, virtualCameraAdapter1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static {
        notify = 0;
        cancelAll();
        INSTANCE = new Companion(null);
        int i = cancelAll + 13;
        notify = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAuthenticationOtpDirectDebitBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1412212857, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1412212861, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f525a + 9;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        f525a = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_authentication_otp_direct_debit;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f525a + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2106601085, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 711798202 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7), 2106601088, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f525a + 123;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = d + 45;
        f525a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2((-1905029127) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.email_instruction).substring(8, 9).codePointAt(0), 1598488579, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1598488579, new Object[]{this, context}, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static void cancelAll() {
        asInterface = 701842716481102142L;
        g = -981105359;
        asBinder = (char) 34097;
    }

    private static String $$i(byte b, byte b2, int i) {
        int i2 = 104 - i;
        byte[] bArr = $$c;
        int i3 = (b * 3) + 4;
        int i4 = b2 * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = i3 + i5;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = i2;
            int i8 = i3 + 1;
            i2 = i7 + bArr[i3];
            i3 = i8;
        }
    }
}
