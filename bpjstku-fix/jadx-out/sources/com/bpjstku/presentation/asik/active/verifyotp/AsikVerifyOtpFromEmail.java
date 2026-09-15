package com.bpjstku.presentation.asik.active.verifyotp;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.OtpByEmailRequest;
import com.bpjstku.data.asik.model.request.VerifyOtpAsikRequest;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.databinding.ActivityAsikVerifyOtpFromEmailBinding;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.connector.internal.zzg;
import com.mukesh.OtpView;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.EncoderImplByteBufferInput;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deriveCodec;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.notifyStateAttached;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.select;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.suspendUseCases;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u001d8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0015\u0010\u0016\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u001c"}, d2 = {"Lcom/bpjstku/presentation/asik/active/verifyotp/AsikVerifyOtpFromEmail;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAsikVerifyOtpFromEmailBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "onResume", "onStop", "onDestroy", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "Lkotlin/Lazy;", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;", "Lselect;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikVerifyOtpFromEmail extends BindingBaseActivity<ActivityAsikVerifyOtpFromEmailBinding> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: setStyle
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AsikVerifyOtpFromEmail.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private getCameraCharacteristic b;
    private static final byte[] $$j = {25, 5, -88, -44, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -25, 9, -25, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$k = 167;
    private static final byte[] $$a = {84, 10, 24, -102, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 182;
    private static int asBinder = 0;
    private static int g = 0;
    private static int asInterface = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r7 = 144 - r7
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-11)
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 37
            int r8 = 40 - r8
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r0 = com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail.$$j
            int r6 = r6 * 15
            int r1 = r6 + 38
            byte[] r1 = new byte[r1]
            int r6 = r6 + 37
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L32
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L32:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-8)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail.f(byte, byte, short, java.lang.Object[]):void");
    }

    public AsikVerifyOtpFromEmail() {
        final AsikVerifyOtpFromEmail asikVerifyOtpFromEmail = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, select] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ select invoke() {
                LifecycleOwner lifecycleOwner = asikVerifyOtpFromEmail;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(select.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/asik/active/verifyotp/AsikVerifyOtpFromEmail$b;", "", "<init>", "()V", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "p0", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "p1", "", "TuitionPaymentFragmentbindingInflater1", "(Lcom/nbs/nucleosnucleo/presentation/BaseActivity;Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(BaseActivity p0, AsikActiveParticipant p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) AsikVerifyOtpFromEmail.class);
            intent.putExtra("asik_active_participant", p1);
            p0.startActivityForResult(intent, 100);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAsikVerifyOtpFromEmailBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 53;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AsikVerifyOtpFromEmail$bindingInflater$1 asikVerifyOtpFromEmail$bindingInflater$1 = AsikVerifyOtpFromEmail$bindingInflater$1.b;
            obj.hashCode();
            throw null;
        }
        AsikVerifyOtpFromEmail$bindingInflater$1 asikVerifyOtpFromEmail$bindingInflater$2 = AsikVerifyOtpFromEmail$bindingInflater$1.b;
        int i3 = asInterface + 63;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            return asikVerifyOtpFromEmail$bindingInflater$2;
        }
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
        int i3 = $10 + 83;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $11 + 73;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 19473), 2624 - (ViewConfiguration.getWindowTouchSlop() >> 8), 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 481, (ViewConfiguration.getFadingEdgeLength() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 119;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 481, AndroidCharacter.getMirror('0') - 11, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        String str;
        int i = 2 % 2;
        final ActivityAsikVerifyOtpFromEmailBinding activityAsikVerifyOtpFromEmailBinding = (ActivityAsikVerifyOtpFromEmailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityAsikVerifyOtpFromEmailBinding.otpVerifyEmailAsik.setOtpCompletionListener(new notifyStateAttached() { // from class: hasPanelItems
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str2) {
                AsikVerifyOtpFromEmail.TuitionPaymentFragmentbindingInflater1(activityAsikVerifyOtpFromEmailBinding, this);
            }
        });
        OtpView otpView = activityAsikVerifyOtpFromEmailBinding.otpVerifyEmailAsik;
        String str2 = "";
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getThemeResId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikVerifyOtpFromEmail.TuitionPaymentFragmentbindingInflater1(activityAsikVerifyOtpFromEmailBinding, (String) obj);
            }
        }));
        activityAsikVerifyOtpFromEmailBinding.btnChangeEmailAsik.setOnClickListener(new View.OnClickListener() { // from class: AppCompatDialog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikVerifyOtpFromEmail.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        activityAsikVerifyOtpFromEmailBinding.btnVerificationOtpEmail.setOnClickListener(new View.OnClickListener() { // from class: readFromParcel
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikVerifyOtpFromEmail.b(this.b, activityAsikVerifyOtpFromEmailBinding, view);
            }
        });
        TextView textView = activityAsikVerifyOtpFromEmailBinding.tvEmailAsik;
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        Object obj = null;
        if (asikActiveParticipant != null) {
            int i2 = asInterface + 41;
            g = i2 % 128;
            int i3 = i2 % 2;
            str = asikActiveParticipant.INotificationSideChannelDefault;
        } else {
            str = null;
        }
        if (str == null) {
            int i4 = g + 53;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str2 = str;
        }
        textView.setText(str2);
        activityAsikVerifyOtpFromEmailBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: AppCompatDelegateImplPanelFeatureStateSavedState1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikVerifyOtpFromEmail.TuitionPaymentFragmentbindingInflater1(activityAsikVerifyOtpFromEmailBinding, this, view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0248  */
    /* JADX WARN: Code duplicated, block: B:28:0x0252  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
            int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
            int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 141), (byte) ($$b & 125), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, i4, maximumDrawingCacheSize, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{57751, 34645, 11272, 54755, 31405, 58270, 35164, 11843, 55281, 31920, 58842, 35690, 12307, 55788, 32436, 59280, 36171, 12840, 56304, 16558, 59793, 36684}, View.getDefaultSize(0, 0) + 26317, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{57747, 15283, 21957, 28669, 35105, 41822, 64868, 5819, 12507, 19174, 25600, 48705, 55411, 62862, 4013}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 55751, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
            int i5 = 922 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 140), bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, i5, iCombineMeasuredStates, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
                byte b3 = $$a[5];
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 88), (byte) 15, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, iMakeMeasureSpec, maximumDrawingCacheSize2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1758109072;
            int i7 = ((((~((-508327539) | i6)) | 336340562) * (-566)) - 1130690585) + ((~(i6 | (-171986977))) * 566) + 203948353;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                e(new char[]{57751, 20055, 48652, 61161, 24229, 36500, 65352, 12145, 40943, 53185, 16272, 27709, 56323, 3094, 31952, 44222, 7536, 19744, 48396, 60882, 23950, 35429, 64078, 10762, 39679, 51877}, Color.argb(0, 0, 0, 0) + 45007, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{57749, 57898, 59094, 60287, 61239, 62421, 62580, 63528, 64718, 49527, 50432, 51676, 51833, 52738, 53948, 55160, 56073, 57249}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 938, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i10 = asInterface + 67;
                g = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 48 / 0;
                    if (baseContext instanceof ContextWrapper) {
                        if (((ContextWrapper) baseContext).getBaseContext() != null) {
                            baseContext = null;
                        }
                    }
                } else if (baseContext instanceof ContextWrapper) {
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = null;
                    }
                }
                baseContext = baseContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{57756, 44550, 32418, 3876, 57244, 27727, 15601, 52591, 40217, 11713, 64015, 35508, 23369, 60383, 47229, 18660}, 20369 - (ViewConfiguration.getTapTimeout() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{57759, 14339, 21169, 27947, 34758, 56906, 63716, 4984, 11574, 18318, 40495, 47269, 54137, 60868, 1148, 24300}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto7_bni).substring(105, 113).codePointAt(4) + 55586, objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 203948353};
                byte[] bArr2 = $$j;
                byte b4 = bArr2[51];
                Object[] objArr13 = new Object[1];
                f(b4, b4, bArr2[74], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr2[74];
                Object[] objArr14 = new Object[1];
                f(b5, b5, bArr2[51], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 31533);
                    int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                    byte b6 = $$a[5];
                    Object[] objArr16 = new Object[1];
                    c(b6, (short) (b6 | 88), (byte) 15, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, i12, doubleTapTimeout, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{57751, 34645, 11272, 54755, 31405, 58270, 35164, 11843, 55281, 31920, 58842, 35690, 12307, 55788, 32436, 59280, 36171, 12840, 56304, 16558, 59793, 36684}, 26317 - TextUtils.indexOf("", "", 0, 0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{57747, 15283, 21957, 28669, 35105, 41822, 64868, 5819, 12507, 19174, 25600, 48705, 55411, 62862, 4013}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 55813, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 31534);
                        int iGreen = Color.green(0) + 921;
                        int packedPositionType = 28 - ExpandableListView.getPackedPositionType(0L);
                        byte[] bArr3 = $$a;
                        byte b7 = bArr3[5];
                        Object[] objArr19 = new Object[1];
                        c(b7, (short) (b7 | 140), bArr3[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iGreen, packedPositionType, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
                        int iBlue = Color.blue(0) + 921;
                        int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b8 = $$a[7];
                        Object[] objArr20 = new Object[1];
                        c(b8, (short) (b8 | 141), (byte) ($$b & 125), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iBlue, maxKeyCode, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i16 = i15 + ((((~((-1050033940) | iUptimeMillis)) | 364785819) * 398) - 2109220185) + (((~((~iUptimeMillis) | (-1050033940))) | 364785819) * 398);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
            ((select) this.TuitionPaymentFragmentbindingInflater1.getValue()).INotificationSideChannelDefault.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setMenu
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AsikVerifyOtpFromEmail.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
                }
            }));
            int i19 = g + 115;
            asInterface = i19 % 128;
            int i20 = i19 % 2;
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i14));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.b;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = g + 97;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        g = i2 % 128;
        int i3 = i2 % 2;
        AsikVerifyOtpFromEmail asikVerifyOtpFromEmail = this;
        Intrinsics.checkNotNullParameter(asikVerifyOtpFromEmail, "");
        asikVerifyOtpFromEmail.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityAsikVerifyOtpFromEmailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityAsikVerifyOtpFromEmailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_email_verification));
        int i4 = g + 25;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.b = new getCameraCharacteristic(((ActivityAsikVerifyOtpFromEmailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, null);
        int i2 = asInterface + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = null;
        int i2 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i4 = ~(933118775 | i3);
        if (i2 != (-504192403) + (((-2141118272) | i4) * (-814)) + ((i4 | (~((~i3) | 1763106318)) | 555106822) * 407) + (((~(i3 | (-1763106319))) | (~((-933118776) | i3)) | 555106822) * 407)) {
            throw null;
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i6 = (~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi) | 644109977;
        if (i5 != 1471476700 + (i6 * 495) + (((~i6) | 574899841) * 495)) {
            int i7 = asInterface + 15;
            g = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[327832145];
            iArr[327832144] = 1;
            int i9 = (-868111536) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i10 = asInterface + 103;
            g = i10 % 128;
            int i11 = i10 % 2;
        }
        super.onResume();
        getCameraCharacteristic getcameracharacteristic2 = this.b;
        if (getcameracharacteristic2 == null) {
            int i12 = g + 55;
            asInterface = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i13 == 0) {
                throw null;
            }
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.b();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.b;
        if (getcameracharacteristic == null) {
            int i2 = asInterface + 21;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i4 = g + 15;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onStop();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = g + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.b;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i4 = asInterface + 37;
            g = i4 % 128;
            int i5 = i4 % 2;
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = g + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = g + 67;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i5 = 53 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6 = g + 45;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 57;
        asInterface = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                int iRed = 1755 - Color.red(0);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                byte b = $$a[5];
                Object[] objArr2 = new Object[1];
                c(b, (short) (b | 88), (byte) 15, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, iRed, iCombineMeasuredStates, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
            byte b2 = $$a[5];
            Object[] objArr3 = new Object[1];
            c(b2, (short) (b2 | 88), (byte) 15, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionType, fadingEdgeLength, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                int mirror = 1803 - AndroidCharacter.getMirror('0');
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                byte[] bArr = $$a;
                byte b3 = bArr[5];
                Object[] objArr4 = new Object[1];
                c(b3, (short) (b3 | 140), bArr[7], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, mirror, iMakeMeasureSpec, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int i4 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i5 = 1076905305 + (((~(i4 | 399877349)) | 136843786) * (-160)) + (((~(i4 | 187274923)) | 399877349) * 160) + 523488183;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{57756, 44550, 32418, 3876, 57244, 27727, 15601, 52591, 40217, 11713, 64015, 35508, 23369, 60383, 47229, 18660}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 20333, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{57759, 14339, 21169, 27947, 34758, 56906, 63716, 4984, 11574, 18318, 40495, 47269, 54137, 60868, 1148, 24300}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_max_retry_exhausted).substring(0, 47).codePointAt(38) + 55596, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {147008260};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42048 - TextUtils.lastIndexOf("", '0', 0)), 1726 - TextUtils.indexOf("", ""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 523488183, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
                    int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
                    int minimumFlingVelocity = 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[5];
                    Object[] objArr9 = new Object[1];
                    c(b4, (short) (b4 | 140), bArr2[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, i8, minimumFlingVelocity, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{57751, 34645, 11272, 54755, 31405, 58270, 35164, 11843, 55281, 31920, 58842, 35690, 12307, 55788, 32436, 59280, 36171, 12840, 56304, 16558, 59793, 36684}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 26281, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{57747, 15283, 21957, 28669, 35105, 41822, 64868, 5819, 12507, 19174, 25600, 48705, 55411, 62862, 4013}, View.MeasureSpec.makeMeasureSpec(0, 0) + 55849, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                        int iMyTid = 1755 - (Process.myTid() >> 22);
                        int i9 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr3 = $$a;
                        Object[] objArr12 = new Object[1];
                        c(bArr3[5], (short) ($$b & 125), bArr3[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iMyTid, i9, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                        int absoluteGravity = 23 - Gravity.getAbsoluteGravity(0, 0);
                        byte b5 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        c(b5, (short) (b5 | 88), (byte) 15, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, iIndexOf, absoluteGravity, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                while (i3 < strArr.length) {
                    int i12 = asInterface + 99;
                    g = i12 % 128;
                    if (i12 % 2 != 0) {
                        arrayList.add(strArr[i3]);
                        i3 += 116;
                    } else {
                        arrayList.add(strArr[i3]);
                        i3++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i14 = i13 + 1203717843 + (((~iMaxMemory) | 620761164) * 1324) + (((~(iMaxMemory | (-419227540))) | (~(631829965 | iMaxMemory))) * (-1324)) + 1754824278;
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr14[3])[0] = i16 ^ (i16 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int deadChar2 = KeyEvent.getDeadChar(0, 0) + 1031;
            int i17 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr4 = $$a;
            byte b6 = bArr4[5];
            short s = bArr4[7];
            Object[] objArr15 = new Object[1];
            c(b6, s, (byte) s, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, deadChar2, i17, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{57751, 34645, 11272, 54755, 31405, 58270, 35164, 11843, 55281, 31920, 58842, 35690, 12307, 55788, 32436, 59280, 36171, 12840, 56304, 16558, 59793, 36684}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_no_shopee_message).substring(3, 4).codePointAt(0) + 26206, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{57747, 15283, 21957, 28669, 35105, 41822, 64868, 5819, 12507, 19174, 25600, 48705, 55411, 62862, 4013}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_token_no).substring(0, 16).codePointAt(12) + 55742, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int iRed2 = Color.red(0) + 1031;
            int scrollDefaultDelay = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr5 = $$a;
            byte b7 = bArr5[5];
            Object[] objArr18 = new Object[1];
            c(b7, (short) (b7 | 140), bArr5[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, iRed2, scrollDefaultDelay, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i18 = asInterface + 33;
            g = i18 % 128;
            int i19 = i18 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 15;
                byte b8 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(b8, (short) (b8 | 141), (byte) ($$b & 125), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollDefaultDelay2, iNormalizeMetaState, offsetBefore, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr20[3])[0];
            int i21 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode;
            int i23 = 1511923504 + (((~((-50544754) | i22)) | (~(193948409 | iIdentityHashCode))) * (-831)) + ((~((-212994) | iIdentityHashCode)) * (-1662)) + (((~(iIdentityHashCode | 50544753)) | (~(i22 | (-193735417))) | (~(193735416 | iIdentityHashCode))) * 831) + 1780283032;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[2])[0] = i25 ^ (i25 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{57756, 44550, 32418, 3876, 57244, 27727, 15601, 52591, 40217, 11713, 64015, 35508, 23369, 60383, 47229, 18660}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20369, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{57759, 14339, 21169, 27947, 34758, 56906, 63716, 4984, 11574, 18318, 40495, 47269, 54137, 60868, 1148, 24300}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 55686, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {147008260};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1134 - TextUtils.indexOf("", "", 0), 18 - TextUtils.getCapsMode("", 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 1780283032, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollDefaultDelay3 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                byte[] bArr6 = $$a;
                byte b9 = bArr6[5];
                short s2 = bArr6[7];
                Object[] objArr25 = new Object[1];
                c(b9, s2, (byte) s2, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollDefaultDelay3, doubleTapTimeout, packedPositionChild, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1117 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 17 - (Process.myPid() >> 22)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int size = View.MeasureSpec.getSize(0) + 1031;
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                byte b10 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b10, (short) (b10 | 141), (byte) ($$b & 125), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSizeAndState, size, maximumFlingVelocity, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{57751, 34645, 11272, 54755, 31405, 58270, 35164, 11843, 55281, 31920, 58842, 35690, 12307, 55788, 32436, 59280, 36171, 12840, 56304, 16558, 59793, 36684}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 26208, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{57747, 15283, 21957, 28669, 35105, 41822, 64868, 5819, 12507, 19174, 25600, 48705, 55411, 62862, 4013}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_notification_shopee_app).substring(26, 27).length() + 55848, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                    int iAlpha = 1031 - Color.alpha(0);
                    int iMyTid2 = (Process.myTid() >> 22) + 15;
                    byte[] bArr7 = $$a;
                    byte b11 = bArr7[5];
                    Object[] objArr29 = new Object[1];
                    c(b11, (short) (b11 | 140), bArr7[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveSizeAndState2, iAlpha, iMyTid2, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                    int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
                    byte[] bArr8 = $$a;
                    byte b12 = bArr8[5];
                    short s3 = bArr8[7];
                    Object[] objArr30 = new Object[1];
                    c(b12, s3, (byte) s3, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cLastIndexOf2, maxKeyCode, maximumDrawingCacheSize, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i26 = ((int[]) objArr[1])[0];
        int i27 = ((int[]) objArr[3])[0];
        if (i27 == i26) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i31 = (int) Runtime.getRuntime().totalMemory();
            int i32 = ~i31;
            int i33 = (~((-67998694) | i32)) | 67895393 | (~(176281476 | i32));
            int i34 = i28 + 781947639 + (((~(i31 | (-176178177))) | i33) * 590) + (i33 * (-1180)) + (((~((-176281477) | i32)) | (~(i32 | 67998693))) * 590);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr31[2])[0] = i36 ^ (i36 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i37 = g + 9;
            asInterface = i37 % 128;
            int i38 = i37 % 2 == 0 ? 1 : 0;
            while (i38 < strArr4.length) {
                int i39 = asInterface + 93;
                g = i39 % 128;
                int i40 = i39 % 2;
                arrayList2.add(strArr4[i38]);
                i38++;
                int i41 = g + 57;
                asInterface = i41 % 128;
                int i42 = i41 % 2;
            }
        }
        int[] iArr = new int[i27];
        int i43 = i27 - 1;
        iArr[i43] = 1;
        Toast.makeText((Context) null, iArr[((i27 * i43) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i44 = ((int[]) objArr[2])[0];
        int i45 = ((int[]) objArr[3])[0];
        int i46 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
        int i47 = i44 + 75085423 + (((-269485185) | (~iMaxMemory2)) * (-490)) + (((~(iMaxMemory2 | 736680726)) | (-1006165911)) * 490) + 365497622;
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr32[2])[0] = i49 ^ (i49 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1626728059
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00be, code lost:
    
        if (r1 != ((1108602892 + ((1879048167 | r2) * 184)) + (((~(r2 | 83408162)) | 1875368679) * 184))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c0, code lost:
    
        super.onCreate(r9);
        r9 = com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail.g + 29;
        com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail.asInterface = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00cc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00cd, code lost:
    
        r9 = (-911319680) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d6, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d7, code lost:
    
        r9 = (-454265982) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e0, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
    
        if (r1 == (((((~((-134367881) | r2)) | (-1065086976)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1603811584) + ((~((~r2) | (-134367881))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0092, code lost:
    
        if (r1 == (((((~((-531749324) | r2)) | 287330434) * (-283)) - 1119853346) + ((~(r2 | (-244418890))) * 283))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0094, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ActivityAsikVerifyOtpFromEmailBinding activityAsikVerifyOtpFromEmailBinding, AsikVerifyOtpFromEmail asikVerifyOtpFromEmail, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                activityAsikVerifyOtpFromEmailBinding.otpVerifyEmailAsik.getEditableText().clear();
                throw null;
            }
            activityAsikVerifyOtpFromEmailBinding.otpVerifyEmailAsik.getEditableText().clear();
            select selectVar = (select) asikVerifyOtpFromEmail.TuitionPaymentFragmentbindingInflater1.getValue();
            AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) asikVerifyOtpFromEmail.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (asikActiveParticipant == null) {
                int i4 = asInterface + 109;
                g = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str = asikActiveParticipant.INotificationSideChannelDefault;
            }
            String strValueOf = String.valueOf(str);
            String string = Settings.Secure.getString(asikVerifyOtpFromEmail.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new OtpByEmailRequest(strValueOf, string));
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        AsikVerifyOtpFromEmail asikVerifyOtpFromEmail = (AsikVerifyOtpFromEmail) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = g + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                asikVerifyOtpFromEmail.finish();
                ViewPortBuilder.b();
                return null;
            }
            asikVerifyOtpFromEmail.finish();
            ViewPortBuilder.b();
            int i4 = 68 / 0;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AsikVerifyOtpFromEmail asikVerifyOtpFromEmail, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 85;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i6 = i4 + 39;
            g = i6 % 128;
            if (i6 % 2 != 0) {
                asikVerifyOtpFromEmail.MediaBrowserCompat();
                throw null;
            }
            asikVerifyOtpFromEmail.MediaBrowserCompat();
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            asikVerifyOtpFromEmail.IconCompatParcelizer();
            asikVerifyOtpFromEmail.setResult(-1);
            asikVerifyOtpFromEmail.finish();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i7 = i2 + 89;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            asikVerifyOtpFromEmail.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asikVerifyOtpFromEmail, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        } else {
            asikVerifyOtpFromEmail.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ActivityAsikVerifyOtpFromEmailBinding activityAsikVerifyOtpFromEmailBinding, AsikVerifyOtpFromEmail asikVerifyOtpFromEmail) {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        g = i2 % 128;
        int i3 = i2 % 2;
        OtpView otpView = activityAsikVerifyOtpFromEmailBinding.otpVerifyEmailAsik;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, asikVerifyOtpFromEmail);
        int i4 = g + 69;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(AsikVerifyOtpFromEmail asikVerifyOtpFromEmail, ActivityAsikVerifyOtpFromEmailBinding activityAsikVerifyOtpFromEmailBinding, View view) {
        String str;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            final select selectVar = (select) asikVerifyOtpFromEmail.TuitionPaymentFragmentbindingInflater1.getValue();
            AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) asikVerifyOtpFromEmail.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (asikActiveParticipant != null) {
                int i2 = asInterface + 35;
                g = i2 % 128;
                if (i2 % 2 != 0) {
                    str = asikActiveParticipant.INotificationSideChannelDefault;
                    int i3 = 72 / 0;
                } else {
                    str = asikActiveParticipant.INotificationSideChannelDefault;
                }
            } else {
                str = null;
            }
            if (str == null) {
                int i4 = g + 29;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                str = "";
            }
            VerifyOtpAsikRequest verifyOtpAsikRequest = new VerifyOtpAsikRequest(str, activityAsikVerifyOtpFromEmailBinding.otpVerifyEmailAsik.getEditableText().toString());
            Intrinsics.checkNotNullParameter(verifyOtpAsikRequest, "");
            MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.INotificationSideChannelDefault;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar.d.b(verifyOtpAsikRequest)));
            final Function1 function1 = new Function1() { // from class: setText
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return select.TuitionPaymentFragmentspecialinlinedviewModeldefault1(selectVar, (BaseItem) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: ActionBarTabListener
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: onDrawerClosed
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return select.TuitionPaymentFragmentspecialinlinedviewModeldefault3(selectVar, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setDrawerSlideAnimationEnabled
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        AsikVerifyOtpFromEmail asikVerifyOtpFromEmail = (AsikVerifyOtpFromEmail) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 77;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) asikVerifyOtpFromEmail.getIntent().getParcelableExtra("asik_active_participant");
        int i3 = g + 65;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return asikActiveParticipant;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ActivityAsikVerifyOtpFromEmailBinding activityAsikVerifyOtpFromEmailBinding, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 6) {
            int i4 = g + 39;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            MaterialButton materialButton = activityAsikVerifyOtpFromEmailBinding.btnVerificationOtpEmail;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
            int i6 = g + 27;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        } else {
            MaterialButton materialButton3 = activityAsikVerifyOtpFromEmailBinding.btnVerificationOtpEmail;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = i5 | i7;
        int i9 = (~(i4 | i)) | i5;
        int i10 = ~i4;
        int i11 = (~(i | i4 | i5)) | (~(i7 | i10)) | (~((~i5) | i10));
        int i12 = i4 + i5 + i6 + (1609234610 * i2) + (1307081305 * i3);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i4) - 1772093440) + (1576585830 * i5) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i6) + ((-2101346304) * i2) + (23068672 * i3) + ((-2103967744) * i13);
        int i15 = (i4 * 273352028) + 245730370 + (i5 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i6 * 273352337) + (i2 * (-770635566)) + (i3 * (-73506199)) + (i13 * (-2011693056));
        int i16 = i14 + (i15 * i15 * 1080557568);
        if (i16 != 1) {
            if (i16 == 2) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            }
            if (i16 == 3) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            }
            int i17 = 2 % 2;
            int i18 = g + 3;
            asInterface = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }
        AsikVerifyOtpFromEmail asikVerifyOtpFromEmail = (AsikVerifyOtpFromEmail) objArr[0];
        int i20 = 2 % 2;
        int i21 = asInterface + 39;
        g = i21 % 128;
        int i22 = i21 % 2;
        super.onPause();
        int i23 = g + 95;
        asInterface = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikVerifyOtpFromEmail asikVerifyOtpFromEmail, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1513588905, -1513588903, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{asikVerifyOtpFromEmail, view});
    }

    public static /* synthetic */ AsikActiveParticipant b(AsikVerifyOtpFromEmail asikVerifyOtpFromEmail) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (AsikActiveParticipant) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1791816505, -1791816502, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{asikVerifyOtpFromEmail});
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 125;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 35 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 21;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        g = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_asik_verify_otp_from_email;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentbindingInflater1 = zzg.TuitionPaymentFragmentbindingInflater1();
        int length = (-597596357) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1052).substring(0, 25).length();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentbindingInflater1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step6).substring(6, 7).length() + 1271060316, 416234299 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indomaret).substring(0, 9).length(), 112486747, -112486747, length, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 2074414893, zzg.TuitionPaymentFragmentbindingInflater1(), -182848947, 182848948, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this});
    }

    static void g() {
        TuitionPaymentFragmentbindingInflater1 = -7522669602774562579L;
    }
}
