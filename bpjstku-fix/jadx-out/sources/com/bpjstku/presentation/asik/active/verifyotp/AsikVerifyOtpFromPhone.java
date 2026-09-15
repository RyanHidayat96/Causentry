package com.bpjstku.presentation.asik.active.verifyotp;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.OtpByPhoneRequest;
import com.bpjstku.data.asik.model.request.VerifyOtpAsikRequest;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.databinding.ActivityAsikVerifyOtpFromPhoneBinding;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromPhone;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.api.internal.zag;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.EncoderImplByteBufferInput;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
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
import defpackage.setButtonPanelLayoutHint;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.suspendUseCases;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import retrofit2.ParameterHandler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\b\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f"}, d2 = {"Lcom/bpjstku/presentation/asik/active/verifyotp/AsikVerifyOtpFromPhone;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAsikVerifyOtpFromPhoneBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "a", "asInterface", "asBinder", "onResume", "onStop", "onDestroy", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "Lkotlin/Lazy;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lselect;", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikVerifyOtpFromPhone extends BindingBaseActivity<ActivityAsikVerifyOtpFromPhoneBinding> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private getCameraCharacteristic TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: checkOnClickListener
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AsikVerifyOtpFromPhone.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 26;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f467a = 1;
    private static int g = 0;
    private static int asInterface = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -881753226
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(int r8, int r9, java.lang.Object[] r10, int r11, int r12, int r13, int r14) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromPhone.TuitionPaymentFragmentbindingInflater1(int, int, java.lang.Object[], int, int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r9 = 53 - r9
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromPhone.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromPhone.c(int, int, byte, java.lang.Object[]):void");
    }

    public AsikVerifyOtpFromPhone() {
        final AsikVerifyOtpFromPhone asikVerifyOtpFromPhone = this;
        this.b = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromPhone$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, select] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ select invoke() {
                LifecycleOwner lifecycleOwner = asikVerifyOtpFromPhone;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromPhone$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/asik/active/verifyotp/AsikVerifyOtpFromPhone$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "p0", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "p1", "", "TuitionPaymentFragmentbindingInflater1", "(Lcom/nbs/nucleosnucleo/presentation/BaseActivity;Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(BaseActivity p0, AsikActiveParticipant p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) AsikVerifyOtpFromPhone.class);
            intent.putExtra("asik_active_participant", p1);
            p0.startActivityForResult(intent, 101);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAsikVerifyOtpFromPhoneBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 9;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            AsikVerifyOtpFromPhone$bindingInflater$1 asikVerifyOtpFromPhone$bindingInflater$1 = AsikVerifyOtpFromPhone$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
        AsikVerifyOtpFromPhone$bindingInflater$1 asikVerifyOtpFromPhone$bindingInflater$2 = AsikVerifyOtpFromPhone$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = asInterface + 111;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return asikVerifyOtpFromPhone$bindingInflater$2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
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
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - View.getDefaultSize(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2624, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 481, 36 - TextUtils.lastIndexOf("", '0'), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i4 = $10 + 73;
                $11 = i4 % 128;
                int i5 = i4 % 2;
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
            int i6 = $11 + 77;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 39422), TextUtils.indexOf("", "") + 481, 37 - View.resolveSize(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39422), (ViewConfiguration.getFadingEdgeLength() >> 16) + 481, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i7 = $11 + 33;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        String str;
        int i = 2 % 2;
        final ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding = (ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik.setOtpCompletionListener(new notifyStateAttached() { // from class: AppCompatDelegateImplPanelMenuPresenterCallback
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str2) {
                AsikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityAsikVerifyOtpFromPhoneBinding, this);
            }
        });
        OtpView otpView = activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik;
        String str2 = "";
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: AppCompatDialogExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityAsikVerifyOtpFromPhoneBinding, (String) obj);
            }
        }));
        activityAsikVerifyOtpFromPhoneBinding.btnPhoneNumberAsik.setOnClickListener(new View.OnClickListener() { // from class: AppCompatDialogFragment
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        activityAsikVerifyOtpFromPhoneBinding.btnVerificationOtpPhone.setOnClickListener(new View.OnClickListener() { // from class: dismiss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikVerifyOtpFromPhone.TuitionPaymentFragmentbindingInflater1(this.b, activityAsikVerifyOtpFromPhoneBinding, view);
            }
        });
        TextView textView = activityAsikVerifyOtpFromPhoneBinding.tvPhoneNumberAsik;
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        Object obj = null;
        if (asikActiveParticipant != null) {
            int i2 = g + 7;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            str = asikActiveParticipant.INotificationSideChannelStubProxy;
            int i4 = g + 89;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = null;
        }
        if (str == null) {
            int i6 = g + 21;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str2 = str;
        }
        textView.setText(str2);
        activityAsikVerifyOtpFromPhoneBinding.tvResendCodeAsik.setOnClickListener(new View.OnClickListener() { // from class: superDispatchKeyEvent
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityAsikVerifyOtpFromPhoneBinding, this, view);
            }
        });
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getCameraCharacteristic(((ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCodeAsik, null, 2, null);
        int i2 = asInterface + 99;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((select) this.b.getValue()).RemoteActionCompatParcelizer.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: onCreateDialog
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = asInterface + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 117;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getcameracharacteristic == null) {
            int i5 = i2 + 63;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = g + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AsikVerifyOtpFromPhone asikVerifyOtpFromPhone = this;
        Intrinsics.checkNotNullParameter(asikVerifyOtpFromPhone, "");
        asikVerifyOtpFromPhone.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_phone_number_verification));
        int i4 = g + 107;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = null;
        int i2 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i3 = ~iIdentityHashCode;
        int i4 = ~((-496730211) | i3);
        int i5 = ~(1326717753 | iIdentityHashCode);
        if (i2 != (-328519600) + ((i4 | i5) * 1150) + (((~((-1326717754) | i3)) | i5) * (-575)) + (((~(iIdentityHashCode | (-496730211))) | (~(i3 | 496730210))) * 575)) {
            int i6 = g + 39;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int[] iArr = new int[2127112919];
            iArr[2127112918] = 1;
            int i8 = 1912608186 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i9 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i10 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 1225173518);
        if (i9 != (((~((-1021449084) | i10)) | 482480481) * (-241)) + 1485310253 + (((~(i10 | (-538968603))) | 1075126400) * 241)) {
            int i11 = (-755209158) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        getCameraCharacteristic getcameracharacteristic2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getcameracharacteristic2 == null) {
            int i12 = asInterface + 125;
            g = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i13 != 0) {
                throw null;
            }
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.b();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        getCameraCharacteristic getcameracharacteristic;
        AsikVerifyOtpFromPhone asikVerifyOtpFromPhone = (AsikVerifyOtpFromPhone) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 97;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            getcameracharacteristic = asikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = 73 / 0;
            if (getcameracharacteristic == null) {
                int i5 = i3 + 115;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                getcameracharacteristic = null;
            }
        } else {
            getcameracharacteristic = asikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (getcameracharacteristic == null) {
                int i7 = i3 + 115;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                getcameracharacteristic = null;
            }
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onStop();
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getcameracharacteristic == null) {
            int i2 = g + 45;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 65 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
            int i4 = asInterface + 115;
            g = i4 % 128;
            int i5 = i4 % 2;
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
                int i2 = g + 21;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 3 / 2;
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = g + 113;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, bArr[5], b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, iLastIndexOf, iMakeMeasureSpec, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{31425, 25897, 17674, 9575, 1363, 58698, 50606, 42463, 34295, 26060, 17800, 9246, 1037, 58472, 50294, 42060, 33981, 25780, 17650, 9450, 1231, 59192}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_6).substring(0, 1).length() + 8166, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{31429, 49043, 61567, 10957, 28591, 40990, 56062, 8043, 20541, 35478, 53114, 449, 15037, 32542, 45559}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 50416, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int scrollBarSize = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            c(b3, (short) (b3 | 51), b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollBarSize, minimumFlingVelocity, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int iAlpha = 1031 - Color.alpha(0);
                int maximumFlingVelocity = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b4 = $$a[132];
                Object[] objArr6 = new Object[1];
                c(b4, (short) (b4 | 102), (byte) ($$b << 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, iAlpha, maximumFlingVelocity, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr7[3])[0];
            int i3 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iNextInt = new Random().nextInt(1862967454);
            int i4 = 1551849007 + (((~((~iNextInt) | (-6553878))) | (~((-335677633) | iNextInt))) * (-302)) + ((~((-6553878) | iNextInt)) * (-604)) + (((~(iNextInt | (-342231510))) | (-922189312)) * 302) + 2123961566;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{31434, 60816, 21620, 48946, 10186, 36441, 61735, 23033, 49231, 11095, 37849, 64162, 27935, 54729, 15531, 42866}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 38701, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{31433, 42903, 49251, 60727, 3992, 10326, 21798, 30620, 36976, 48426, 57325, 63577, 9479, 18424, 24654, 36120}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_qr_code).substring(1, 2).length() + 56658, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {665889908};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - Drawable.resolveOpacity(0, 0)), 1134 - TextUtils.indexOf("", "", 0, 0), 18 - TextUtils.indexOf("", "", 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 2123961566, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 16;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[7];
                    Object[] objArr12 = new Object[1];
                    c(b5, bArr2[5], b5, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(size, pressedStateDuration, iLastIndexOf2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - Process.getGidForName("")), 1117 - Drawable.resolveOpacity(0, 0), 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cRed = (char) Color.red(0);
                    int iResolveSizeAndState = 1031 - View.resolveSizeAndState(0, 0, 0);
                    int iIndexOf = 15 - TextUtils.indexOf("", "", 0, 0);
                    byte b6 = $$a[132];
                    Object[] objArr13 = new Object[1];
                    c(b6, (short) (b6 | 102), (byte) ($$b << 1), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iResolveSizeAndState, iIndexOf, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{31425, 25897, 17674, 9575, 1363, 58698, 50606, 42463, 34295, 26060, 17800, 9246, 1037, 58472, 50294, 42060, 33981, 25780, 17650, 9450, 1231, 59192}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step9).substring(20, 21).length() + 8166, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{31429, 49043, 61567, 10957, 28591, 40990, 56062, 8043, 20541, 35478, 53114, 449, 15037, 32542, 45559}, 50526 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cRed2 = (char) Color.red(0);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1031;
                        int defaultSize = View.getDefaultSize(0, 0) + 15;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr16 = new Object[1];
                        c(b8, (short) (b8 | 51), b7, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRed2, offsetBefore, defaultSize, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
                        int i7 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b9 = bArr3[7];
                        Object[] objArr17 = new Object[1];
                        c(b9, bArr3[5], b9, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(trimmedLength, capsMode, i7, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            int i8 = g + 59;
            asInterface = i8 % 128;
            for (int i9 = i8 % 2 != 0 ? 0 : 1; i9 < strArr2.length; i9++) {
                int i10 = asInterface + 15;
                g = i10 % 128;
                int i11 = i10 % 2;
                arrayList.add(strArr2[i9]);
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i15 = ~iUptimeMillis;
        int i16 = i12 + 1921361041 + (((~((-491871290) | i15)) | 155206689) * 184) + ((iUptimeMillis | (-1072816060)) * (-184)) + ((~((-736151460) | i15)) * 184);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr18[2])[0] = i18 ^ (i18 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
            byte[] bArr4 = $$a;
            byte b10 = bArr4[7];
            Object[] objArr19 = new Object[1];
            c(b10, (short) (b10 | 103), (byte) (bArr4[33] - 1), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveOpacity, longPressTimeout, offsetAfter, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                int i19 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 23;
                byte b11 = $$a[7];
                byte b12 = b11;
                Object[] objArr20 = new Object[1];
                c(b12, (short) (b12 | 51), b11, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(mode, i19, iIndexOf2, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = ~((-355210590) | iIdentityHashCode);
            int i21 = 1187751109 + ((1281 | i20) * (-280)) + ((i20 | (~(142608163 | iIdentityHashCode))) * 140);
            int i22 = ~((-355209309) | iIdentityHashCode);
            int i23 = ~iIdentityHashCode;
            int i24 = i21 + (((~(i23 | 497817471)) | i22 | (~(i23 | (-1282)))) * 140) + 752142586;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{31434, 60816, 21620, 48946, 10186, 36441, 61735, 23033, 49231, 11095, 37849, 64162, 27935, 54729, 15531, 42866}, 38737 - KeyEvent.getDeadChar(0, 0), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{31433, 42903, 49251, 60727, 3992, 10326, 21798, 30620, 36976, 48426, 57325, 63577, 9479, 18424, 24654, 36120}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama4_permata).substring(16, 17).codePointAt(0) + 56627, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {665889908};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42049), 1726 - Color.blue(0), View.resolveSize(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 752142586, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cBlue = (char) (29944 - Color.blue(0));
                int capsMode2 = 1755 - TextUtils.getCapsMode("", 0, 0);
                int absoluteGravity = 23 - Gravity.getAbsoluteGravity(0, 0);
                byte b13 = $$a[7];
                byte b14 = b13;
                Object[] objArr25 = new Object[1];
                c(b14, (short) (b14 | 51), b13, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cBlue, capsMode2, absoluteGravity, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{31425, 25897, 17674, 9575, 1363, 58698, 50606, 42463, 34295, 26060, 17800, 9246, 1037, 58472, 50294, 42060, 33981, 25780, 17650, 9450, 1231, 59192}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8167, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{31429, 49043, 61567, 10957, 28591, 40990, 56062, 8043, 20541, 35478, 53114, 449, 15037, 32542, 45559}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 50491, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                    int mode2 = 1755 - View.MeasureSpec.getMode(0);
                    int iGreen = Color.green(0) + 23;
                    byte b15 = $$a[7];
                    byte b16 = b15;
                    Object[] objArr28 = new Object[1];
                    c(b16, (short) (b16 | 140), b15, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, mode2, iGreen, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
                    int iResolveSize = 1755 - View.resolveSize(0, 0);
                    int i27 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                    byte[] bArr5 = $$a;
                    byte b17 = bArr5[7];
                    Object[] objArr29 = new Object[1];
                    c(b17, (short) (b17 | 103), (byte) (bArr5[33] - 1), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(keyRepeatTimeout, iResolveSize, i27, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i28 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i29 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i29 == i28) {
            int i30 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iNextInt2 = new Random().nextInt(1948017686);
            int i31 = ~iNextInt2;
            int i32 = i30 + (-2142922444) + ((~(697527935 | i31)) * 979) + ((iNextInt2 | 910130361) * (-979)) + (((~(iNextInt2 | 697527935)) | (~(i31 | 910130361))) * 979);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr30[3])[0] = i34 ^ (i34 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
        if (strArr4 != null) {
            int i35 = g + 69;
            asInterface = i35 % 128;
            int i36 = i35 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i29 / (((i29 - 1) * i29) % 2), 0).show();
        int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int i38 = ~System.identityHashCode(this);
        int i39 = i37 + (-251538111) + (((~(i38 | 884792927)) | (~((-536924186) | i38))) * (-184)) + ((280235584 | (~((-817159770) | i38)) | (~(604557343 | i38))) * 184) + 440400632;
        int i40 = (i39 << 13) ^ i39;
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr31[3])[0] = i41 ^ (i41 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i6 = ~i5;
        int i7 = (~((-116118133) | i6)) | 109810228;
        int i8 = ~(i5 | (-939797772));
        if (i4 != (-1539827936) + ((i7 | i8) * (-502)) + ((i8 | (~(i6 | (-6307905)))) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            int i9 = (-814139626) % 2;
            throw new ArithmeticException();
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i11 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        if (i10 != (-1193462180) + (((~(1945522277 | i11)) | 201950594) * 576) + (((~((~i11) | 2147472871)) | 27660352) * 576) + 359425152) {
            int[] iArr = new int[1379921158];
            iArr[1379921157] = 1;
            int i12 = 170405662 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i13 = g + 9;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ AsikActiveParticipant b(AsikVerifyOtpFromPhone asikVerifyOtpFromPhone) {
        int i = 2 % 2;
        int i2 = g + 81;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return (AsikActiveParticipant) asikVerifyOtpFromPhone.getIntent().getParcelableExtra("asik_active_participant");
        }
        int i3 = 62 / 0;
        return (AsikActiveParticipant) asikVerifyOtpFromPhone.getIntent().getParcelableExtra("asik_active_participant");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding, String str) {
        int i = 2 % 2;
        int i2 = g + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0 ? str.length() >= 6 : str.length() >= 91) {
            MaterialButton materialButton = activityAsikVerifyOtpFromPhoneBinding.btnVerificationOtpPhone;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
        } else {
            MaterialButton materialButton3 = activityAsikVerifyOtpFromPhoneBinding.btnVerificationOtpPhone;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(false);
            int i4 = g + 3;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(AsikVerifyOtpFromPhone asikVerifyOtpFromPhone, ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding, View view) {
        String str;
        int i = 2 % 2;
        int i2 = g + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            final select selectVar = (select) asikVerifyOtpFromPhone.b.getValue();
            AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) asikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            if (asikActiveParticipant != null) {
                int i4 = g + 77;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                str = asikActiveParticipant.INotificationSideChannelStubProxy;
            } else {
                int i6 = asInterface + 123;
                g = i6 % 128;
                int i7 = i6 % 2;
                str = null;
            }
            if (str == null) {
                int i8 = asInterface + 103;
                g = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 22 / 0;
                }
                str = "";
            }
            VerifyOtpAsikRequest verifyOtpAsikRequest = new VerifyOtpAsikRequest(str, activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik.getEditableText().toString());
            Intrinsics.checkNotNullParameter(verifyOtpAsikRequest, "");
            MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.RemoteActionCompatParcelizer;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(verifyOtpAsikRequest)));
            final Function1 function1 = new Function1() { // from class: onKeyUp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return select.b(selectVar, (BaseItem) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: setCustomTitle
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final setButtonPanelLayoutHint setbuttonpanellayouthint = new setButtonPanelLayoutHint(selectVar);
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setButton
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    setbuttonpanellayouthint.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding, AsikVerifyOtpFromPhone asikVerifyOtpFromPhone) {
        int i = 2 % 2;
        int i2 = g + 39;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            OtpView otpView = activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, asikVerifyOtpFromPhone);
            int i3 = 73 / 0;
        } else {
            OtpView otpView2 = activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik;
            Intrinsics.checkNotNullExpressionValue(otpView2, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, asikVerifyOtpFromPhone);
        }
        int i4 = asInterface + 37;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0050 A[PHI: r3
  0x0050: PHI (r3v7 select) = (r3v6 select), (r3v17 select) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding, AsikVerifyOtpFromPhone asikVerifyOtpFromPhone, View view) {
        select selectVar;
        AsikActiveParticipant asikActiveParticipant;
        String str;
        int i = 2 % 2;
        int i2 = g + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik.getEditableText().clear();
                selectVar = (select) asikVerifyOtpFromPhone.b.getValue();
                asikActiveParticipant = (AsikActiveParticipant) asikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                int i4 = 46 / 0;
                if (asikActiveParticipant != null) {
                    str = asikActiveParticipant.INotificationSideChannelStubProxy;
                } else {
                    str = null;
                }
            } else {
                activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik.getEditableText().clear();
                selectVar = (select) asikVerifyOtpFromPhone.b.getValue();
                asikActiveParticipant = (AsikActiveParticipant) asikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (asikActiveParticipant != null) {
                    str = asikActiveParticipant.INotificationSideChannelStubProxy;
                } else {
                    str = null;
                }
            }
            String strValueOf = String.valueOf(str);
            String string = Settings.Secure.getString(asikVerifyOtpFromPhone.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new OtpByPhoneRequest(strValueOf, string));
            ViewPortBuilder.b();
            int i5 = g + 123;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        AsikVerifyOtpFromPhone asikVerifyOtpFromPhone = (AsikVerifyOtpFromPhone) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = g + 117;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                asikVerifyOtpFromPhone.MediaBrowserCompat();
                throw null;
            }
            asikVerifyOtpFromPhone.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i3 = asInterface + 77;
            g = i3 % 128;
            int i4 = i3 % 2;
            asikVerifyOtpFromPhone.IconCompatParcelizer();
            getCameraCharacteristic getcameracharacteristic2 = asikVerifyOtpFromPhone.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (getcameracharacteristic2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                getcameracharacteristic = getcameracharacteristic2;
            }
            getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            asikVerifyOtpFromPhone.setResult(-1);
            asikVerifyOtpFromPhone.finish();
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            asikVerifyOtpFromPhone.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asikVerifyOtpFromPhone, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        } else {
            asikVerifyOtpFromPhone.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikVerifyOtpFromPhone asikVerifyOtpFromPhone, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        g = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            asikVerifyOtpFromPhone.finish();
            ViewPortBuilder.b();
            int i4 = asInterface + 59;
            g = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AsikVerifyOtpFromPhone asikVerifyOtpFromPhone, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentbindingInflater1 = zag.TuitionPaymentFragmentbindingInflater1();
        return (Unit) TuitionPaymentFragmentbindingInflater1(zag.TuitionPaymentFragmentbindingInflater1(), zag.TuitionPaymentFragmentbindingInflater1(), new Object[]{asikVerifyOtpFromPhone, virtualCameraAdapter1}, iTuitionPaymentFragmentbindingInflater1, zag.TuitionPaymentFragmentbindingInflater1(), 1701253333, -1701253330);
    }

    static {
        asBinder = 0;
        d();
        INSTANCE = new Companion(null);
        int i = f467a + 11;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_asik_verify_otp_from_phone;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 79;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() throws IllegalAccessException {
        TuitionPaymentFragmentbindingInflater1(ParameterHandler.AnonymousClass1.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 237430728, new Object[]{this}, 928720206 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 845197221, 1427425525, -1427425523);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        TuitionPaymentFragmentbindingInflater1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_full_name_empty).substring(19, 20).codePointAt(0) - 1195844581, zag.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, ParameterHandler.AnonymousClass1.b(), ParameterHandler.AnonymousClass1.b(), -72135679, 72135680);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws IllegalAccessException {
        int iB = ParameterHandler.AnonymousClass1.b();
        TuitionPaymentFragmentbindingInflater1(ParameterHandler.AnonymousClass1.b(), ParameterHandler.AnonymousClass1.b(), new Object[]{this}, iB, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1118690192, 1071985915, -1071985915);
    }

    static void d() {
        TuitionPaymentFragmentbindingInflater1 = 3107265985746490299L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        AsikVerifyOtpFromPhone asikVerifyOtpFromPhone = (AsikVerifyOtpFromPhone) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 95;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = g + 39;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
