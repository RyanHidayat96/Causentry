package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.Html;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import androidx.work.PeriodicWorkRequest;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.payment.model.request.SubmitAutodebitBniAutopayRequest;
import com.bpjstku.data.payment.model.request.VerifyOtpSubmitAutodebitBniRequest;
import com.bpjstku.data.payment.model.response.SubmitAutodebitBniAutopayResponse;
import com.bpjstku.databinding.ActivityAuthenticationOtpBniAutodebetBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzpu;
import com.mukesh.OtpView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ListPopupWindow2;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSelectedChildViewEnabled;
import defpackage.lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0016\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0018\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0015\u0010\r\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0015\u0010\u001f\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0015\u0010\t\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010#R\u0014\u0010\b\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010%"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/AuthenticationOtpBniAutodebetActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAuthenticationOtpBniAutodebetBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "onResume", "onStop", "onDestroy", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "TuitionPaymentFragmentbindingInflater1", "I", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;", "Lcom/bpjstku/data/payment/model/response/SubmitAutodebitBniAutopayResponse;", "Lcom/bpjstku/domain/user/model/User;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "d", "LListPopupWindow2;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "g", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthenticationOtpBniAutodebetActivity extends BindingBaseActivity<ActivityAuthenticationOtpBniAutodebetBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static byte[] cancel;
    private static short[] cancelAll;
    private static int d;
    private static int g;
    private static int getInterfaceDescriptor;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private int b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private getCameraCharacteristic TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy asInterface;
    private static final byte[] $$c = {68, 104, -93, -37};
    private static final int $$f = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {58, -103, 118, 14, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 24;
    private static int RemoteActionCompatParcelizer = 0;
    private static int INotificationSideChannel = 0;
    private static int onTransact = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: FitWindowsViewGroup
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AuthenticationOtpBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: DropDownListViewGateKeeperDrawable
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AuthenticationOtpBniAutodebetActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: DropDownListViewResolveHoverRunnable
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AuthenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 1
            int r8 = 145 - r8
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r4 = -r4
            int r8 = r8 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/AuthenticationOtpBniAutodebetActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "p1", "Lcom/bpjstku/data/payment/model/response/SubmitAutodebitBniAutopayResponse;", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/tuition/model/CustomerObject;Lcom/bpjstku/data/payment/model/response/SubmitAutodebitBniAutopayResponse;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, CustomerObject p1, SubmitAutodebitBniAutopayResponse p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) AuthenticationOtpBniAutodebetActivity.class);
            intent.putExtra("customer_object_recurring", p1);
            intent.putExtra("customer_object_verify_otp_bni", p2);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AuthenticationOtpBniAutodebetActivity() {
        final AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity = this;
        this.d = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = authenticationOtpBniAutodebetActivity;
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
        this.asInterface = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = authenticationOtpBniAutodebetActivity;
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

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAuthenticationOtpBniAutodebetBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        AuthenticationOtpBniAutodebetActivity$bindingInflater$1 authenticationOtpBniAutodebetActivity$bindingInflater$1 = AuthenticationOtpBniAutodebetActivity$bindingInflater$1.b;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return authenticationOtpBniAutodebetActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityAuthenticationOtpBniAutodebetBinding activityAuthenticationOtpBniAutodebetBinding = (ActivityAuthenticationOtpBniAutodebetBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView = activityAuthenticationOtpBniAutodebetBinding.tvResendCode;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setOnClickListener(new LifecycleCameraRepositoryKey(new isSelectedChildViewEnabled(this)));
        activityAuthenticationOtpBniAutodebetBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: FitWindowsLinearLayout
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                AuthenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityAuthenticationOtpBniAutodebetBinding, this);
            }
        });
        OtpView otpView = activityAuthenticationOtpBniAutodebetBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: EmojiCompatConfigurationView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityAuthenticationOtpBniAutodebetBinding, (String) obj);
            }
        }));
        Button button = activityAuthenticationOtpBniAutodebetBinding.btnVerification;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: FitWindowsFrameLayout
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationOtpBniAutodebetActivity.b(this.b, activityAuthenticationOtpBniAutodebetBinding, (View) obj);
            }
        }));
        Button button2 = activityAuthenticationOtpBniAutodebetBinding.btnCancel;
        Intrinsics.checkNotNullExpressionValue(button2, "");
        button2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setOnFitSystemWindowsListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (View) obj);
            }
        }));
        int i2 = onTransact + 67;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity = this;
        ((ListPopupWindow2) this.asInterface.getValue()).MediaBrowserCompat.observe(authenticationOtpBniAutodebetActivity, new Observer() { // from class: clearCallbacks
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                AuthenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.asInterface.getValue()).RemoteActionCompatParcelizer.observe(authenticationOtpBniAutodebetActivity, new Observer() { // from class: onTouchForwarded
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                AuthenticationOtpBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = onTransact + 39;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 109;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            int i5 = i3 + 51;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 != 0) {
                int i7 = 75 / 0;
            }
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i8 = INotificationSideChannel + 113;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01b8  */
    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int i5;
        boolean z2;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(d)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i7 = 2268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int touchSlop = 33 - (ViewConfiguration.getTouchSlop() >> 8);
                byte length2 = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, i7, touchSlop, 1387473586, false, $$i((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $11 + 41;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i10 = $11;
                int i11 = i10 + 79;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                byte[] bArr2 = cancel;
                if (bArr2 != null) {
                    int i13 = i10 + 59;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i14 = 0; i14 < length; i14++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i14])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.alpha(0), TextUtils.getOffsetAfter("", 0) + 3358, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, -1054011043, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i14] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = cancel;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(g)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2268;
                        int i15 = 34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte length3 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, iLastIndexOf, i15, 1387473586, false, $$i((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) d) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) cancelAll[i3 + ((int) (((long) g) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) d) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                int i16 = ((i3 + iIntValue) - 2) + ((int) (((long) g) ^ j));
                if (z) {
                    int i17 = $11 + 35;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(notify), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 55904), 2855 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0) + 13, -1529949196, false, $$i(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = cancel;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i18 = 0; i18 < length4; i18++) {
                        bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 3046761265686732006L);
                    }
                    int i19 = $10 + 29;
                    $11 = i19 % 128;
                    i5 = 2;
                    int i20 = i19 % 2;
                    bArr4 = bArr5;
                } else {
                    i5 = 2;
                }
                if (bArr4 != null) {
                    int i21 = $10 + 51;
                    $11 = i21 % 128;
                    int i22 = i21 % i5;
                    z2 = true;
                } else {
                    z2 = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i23 = $11;
                    int i24 = i23 + 81;
                    $10 = i24 % 128;
                    int i25 = i24 % 2;
                    if (z2) {
                        int i26 = i23 + 11;
                        $10 = i26 % 128;
                        int i27 = i26 % 2;
                        byte[] bArr6 = cancel;
                        int i28 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i28 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i28]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = cancelAll;
                        int i29 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i29 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i29]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c2, code lost:
    
        if (r1 != ((((~((~r2) | 1801420775)) * 130) - 1776797396) + (((~(r2 | 1801420775)) | android.R.raw.loaderror) * 130))) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c4, code lost:
    
        super.onResume();
        r1 = r9.TuitionPaymentFragmentbindingInflater1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c9, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00cb, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.INotificationSideChannel + 41;
        com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00da, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00db, code lost:
    
        r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00de, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e6, code lost:
    
        throw new java.lang.RuntimeException("-1969507630");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e7, code lost:
    
        r1 = (-1161885046) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f0, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005e, code lost:
    
        if (r1 == ((((-1541134816) + (((-463009) | r4) * (-627))) + (((~(1141354936 | r4)) | 311367393) * (-627))) + (((~(r4 | 311367393)) | (~((~r4) | (-1141354937)))) * 627))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009e, code lost:
    
        if (r1 == ((((-1343076152) + (((~((-277577794) | (~r4))) | (~((-1107565337) | r4))) * (-272))) + (((~((-365683938) | r4)) | 88106144) * (-272))) + (((~(r4 | 365683937)) | (-1195671481)) * 272))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a0, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.onResume():void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity = (AuthenticationOtpBniAutodebetActivity) objArr[0];
        int i = 2 % 2;
        super.onStop();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46400), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1513912262, false, "b", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - ((Process.getThreadPriority(0) + 20) >> 6)), AndroidCharacter.getMirror('0') + 11, 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - ((Process.getThreadPriority(0) + 20) >> 6)), 60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -183;
        long j3 = -1;
        long j4 = j3 ^ 3817062130497606033L;
        long elapsedCpuTime = ((long) ((int) Process.getElapsedCpuTime())) ^ j3;
        long j5 = j4 | elapsedCpuTime;
        long j6 = j3 ^ 1702191366662180206L;
        long j7 = j6 | elapsedCpuTime;
        long j8 = (j2 * 3817062130497606033L) + (j2 * 1702191366662180206L) + (((long) (-184)) * (((j5 | 1702191366662180206L) ^ j3) | ((3817062130497606033L | j7) ^ j3)));
        long j9 = 184;
        long j10 = j8 + (((j3 ^ j7) | ((j4 | j6) ^ j3) | (j5 ^ j3)) * j9) + (j9 * 4035207466536394239L);
        int i5 = onTransact + 121;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (true) {
            int i8 = 0;
            while (i8 != 8) {
                i4 = (((((int) (j >> i8)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                i8++;
                int i9 = onTransact + 95;
                INotificationSideChannel = i9 % 128;
                int i10 = i9 % 2;
            }
            if (i7 != 0) {
                break;
            }
            i7++;
            j = j10;
        }
        if (i4 != i2) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - View.getDefaultSize(0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, Color.rgb(0, 0, 0) + 16777235, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i3));
        }
        getCameraCharacteristic getcameracharacteristic = authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            int i2 = onTransact + 25;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i4 = onTransact + 107;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                int i5 = 45 / 0;
            } else {
                tuitionPaymentFragmentbindingInflater1.cancel();
            }
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity = this;
        Intrinsics.checkNotNullParameter(authenticationOtpBniAutodebetActivity, "");
        authenticationOtpBniAutodebetActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityAuthenticationOtpBniAutodebetBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityAuthenticationOtpBniAutodebetBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText("Verifikasi OTP");
        TextView textView = ((ActivityAuthenticationOtpBniAutodebetBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvDetailInstructionLineSecond;
        String confirmPhoneNumber = ((SubmitAutodebitBniAutopayResponse) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getConfirmPhoneNumber();
        StringBuilder sb = new StringBuilder("pada Nomor Handphone yang terdaftar<b>");
        sb.append(confirmPhoneNumber);
        sb.append("</b>");
        textView.setText(Html.fromHtml(sb.toString()));
        int i2 = INotificationSideChannel + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        INotificationSideChannel = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = INotificationSideChannel + 99;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 83 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
            int i2 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr3 = new Object[1];
            c($$a[5], (byte) 52, (short) 141, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, fadingEdgeLength, i2, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(908373952 - (ViewConfiguration.getScrollBarSize() >> 8), Color.rgb(0, 0, 0) + 16777181, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (Color.rgb(0, 0, 0) + 16777154), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1132141253, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 908373858, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 78, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 35), TextUtils.getOffsetAfter("", 0) - 1132141196, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
            int i3 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr6 = new Object[1];
            c($$a[5], (byte) 52, (short) ($$b | 65), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, doubleTapTimeout, i3, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                int fadingEdgeLength2 = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr7 = new Object[1];
                c(b, b2, (short) (b2 | 37), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, modifierMetaStateMask, fadingEdgeLength2, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr8[3])[0];
            int i5 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 1388145210;
            int i6 = ((((-1032359005) + (((~((-289439891) | iCodePointAt)) | (~((~iCodePointAt) | (-45159721)))) * (-318))) + (((~(826469075 | iCodePointAt)) | (-871628796)) * (-318))) + (((~(iCodePointAt | (-826469076))) | 582188905) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 1974632665;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama4_permata).substring(16, 17).codePointAt(0) + 908373929, (-42) - TextUtils.lastIndexOf("", '0', 0), (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) ((-77) - TextUtils.indexOf("", "", 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_denied).substring(0, 6).length() - 1132141188, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e((ViewConfiguration.getLongPressTimeout() >> 16) + 908373960, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_close).substring(18, 19).length() - 42, (short) (KeyEvent.getMaxKeyCode() >> 16), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 37), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1132141178, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {-505257161};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1134 - View.MeasureSpec.getMode(0), TextUtils.indexOf("", "", 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -1974632665, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int keyRepeatDelay = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i9 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    Object[] objArr13 = new Object[1];
                    c($$a[5], (byte) 52, (short) 141, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, keyRepeatDelay, i9, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 45993), Color.green(0) + 1117, TextUtils.indexOf("", "") + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int iMyTid = (Process.myTid() >> 22) + 1031;
                    int iAlpha = Color.alpha(0) + 15;
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr14 = new Object[1];
                    c(b3, b4, (short) (b4 | 37), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iMyTid, iAlpha, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card_message).substring(0, 1).length() + 908373951, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step6).substring(3, 4).codePointAt(0) - 152, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 73), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1132141253, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(908373956 - Gravity.getAbsoluteGravity(0, 0), (-42) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step6).substring(39, 40).codePointAt(0) - 32), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 61), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_mandiri_ecash).substring(1, 3).codePointAt(1) - 1132141317, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c4 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                        int mirror = 1079 - AndroidCharacter.getMirror('0');
                        int iResolveSize = View.resolveSize(0, 0) + 15;
                        Object[] objArr17 = new Object[1];
                        c($$a[5], (byte) 52, (short) ($$b | 65), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c4, mirror, iResolveSize, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
                        Object[] objArr18 = new Object[1];
                        c($$a[5], (byte) 52, (short) 141, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(touchSlop, pressedStateDuration, iResolveOpacity, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i10 = INotificationSideChannel + 97;
                    onTransact = i10 % 128;
                    int i11 = i10 % 2;
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
            int i14 = onTransact + 67;
            INotificationSideChannel = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_7).substring(0, 2).codePointAt(0) - 1439433613;
            int i19 = i16 + ((((~((-366636504) | iCodePointAt2)) | 88735813) * (-566)) - 1070857225) + ((~(iCodePointAt2 | (-277900691))) * 566);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr19[2])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i22 = INotificationSideChannel + 125;
                onTransact = i22 % 128;
                for (int i23 = i22 % 2 == 0 ? 1 : 0; i23 < strArr3.length; i23++) {
                    int i24 = onTransact + 21;
                    INotificationSideChannel = i24 % 128;
                    int i25 = i24 % 2;
                    arrayList.add(strArr3[i23]);
                }
            }
            int[] iArr = new int[i13];
            int i26 = i13 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i26) % 2) - 1], 1).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i30 = ~iIdentityHashCode;
            int i31 = i27 + (-1069935103) + (((~((-184879929) | i30)) | 151257632) * 184) + ((iIdentityHashCode | (-462782395)) * (-184)) + ((~((-429160099) | i30)) * 184);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr20[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
            int threadPriority = 1755 - ((Process.getThreadPriority(0) + 20) >> 6);
            int mirror2 = AndroidCharacter.getMirror('0') - 25;
            byte b5 = $$a[5];
            byte b6 = (byte) (b5 | 36);
            Object[] objArr21 = new Object[1];
            c(b5, b6, b6, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(tapTimeout, threadPriority, mirror2, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i34 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr22 = new Object[1];
                c($$a[5], (byte) 52, (short) ($$b | 65), objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maximumFlingVelocity, maximumDrawingCacheSize, i34, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int iCodePointAt3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 412899485;
            int i35 = ((((-1601725979) + (((~(iCodePointAt3 | 259473834)) | 46871408) * (-668))) + ((259473834 | (~(46871408 | iCodePointAt3))) * 1336)) + ((iCodePointAt3 | 268399610) * 668)) - 1824825858;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[3])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_cta_text_retake).substring(0, 13).codePointAt(6) + 908373929, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 77, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 113), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1132141218, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 908373848, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1053).substring(0, 53).codePointAt(14) - 73, (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (byte) (73 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) - 1132141167, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {-505257161};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42049), 1725 - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf((CharSequence) "", '0') + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), -1824825858, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                int iArgb = 23 - Color.argb(0, 0, 0, 0);
                Object[] objArr27 = new Object[1];
                c($$a[5], (byte) 52, (short) ($$b | 65), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, iIndexOf, iArgb, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).codePointAt(0) + 908373920, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step4).substring(0, 1).codePointAt(0) - 102, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fetching_cards).substring(1, 2).length() - 1), (byte) ((ViewConfiguration.getTouchSlop() >> 8) - 62), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1132141253, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(908373956 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) - 42, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_not_enabled_message).substring(5, 6).length() - 1), (byte) (72 - (ViewConfiguration.getPressedStateDuration() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_indomaret).substring(1, 3).length() - 1132141198, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1755;
                    int defaultSize = 23 - View.getDefaultSize(0, 0);
                    byte[] bArr = $$a;
                    Object[] objArr30 = new Object[1];
                    c(bArr[5], (byte) 52, bArr[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRgb, iIndexOf2, defaultSize, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cBlue = (char) (29944 - Color.blue(0));
                    int maximumFlingVelocity2 = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                    byte b7 = $$a[5];
                    byte b8 = (byte) (b7 | 36);
                    Object[] objArr31 = new Object[1];
                    c(b7, b8, b8, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cBlue, maximumFlingVelocity2, iNormalizeMetaState, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArr2[1])[0];
        int i39 = ((int[]) objArr2[0])[0];
        if (i39 == i38) {
            int i40 = ((int[]) objArr2[3])[0];
            Object[] objArr32 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i41 = i40 + (((~(318283369 | layoutDirection)) | (-224146123)) * 262) + 321568945 + (((~((~layoutDirection) | 318283369)) | (-224146123)) * 262);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr32[3])[0] = i43 ^ (i43 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArr2[4];
        if (strArr5 != null) {
            int i44 = onTransact + 73;
            INotificationSideChannel = i44 % 128;
            for (int i45 = i44 % 2 != 0 ? 1 : 0; i45 < strArr5.length; i45++) {
                arrayList2.add(strArr5[i45]);
            }
        }
        Toast.makeText((Context) null, i39 / (((i39 - 1) * i39) % 2), 0).show();
        int i46 = ((int[]) objArr2[3])[0];
        Object[] objArr33 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int i47 = ~(System.identityHashCode(this) | 570494012);
        int i48 = i46 + (((-928379455) | i47) * (-658)) + 214623801 + ((i47 | (-928382527)) * 658);
        int i49 = (i48 << 13) ^ i48;
        int i50 = i49 ^ (i49 >>> 17);
        ((int[]) objArr33[3])[0] = i50 ^ (i50 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != (-326425824) + (((~((-1110532883) | i5)) | 280545339) * (-328)) + ((iIdentityHashCode | 280545339) * 164) + (((~(iIdentityHashCode | 1110532882)) | 277383209 | (~(i5 | (-1107370753)))) * 164)) {
            throw new RuntimeException("1470649799");
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i7 = ~((-79775873) | iIdentityHashCode2);
        int i8 = ~iIdentityHashCode2;
        if (i6 != 1682398784 + ((i7 | (~(i8 | 1879010295))) * 497) + (((~(iIdentityHashCode2 | 1879010295)) | (~((-83323093) | i8)) | 3547220) * 497)) {
            throw null;
        }
        super.onStart();
        int i9 = onTransact + 9;
        INotificationSideChannel = i9 % 128;
        int i10 = i9 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity = (AuthenticationOtpBniAutodebetActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        if (i4 != (-1923110176) + (((~((-545816643) | iMaxMemory)) | (~((~iMaxMemory) | (-1375804186)))) * (-318)) + (((~(768516290 | iMaxMemory)) | (-2144320476)) * (-318)) + (((~(iMaxMemory | (-768516291))) | 1598503833) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            throw null;
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
        if (i5 != ((221489124 + (((~iMaxMemory2) | (-1629827419)) * 1444)) + (((~(iMaxMemory2 | 2104437505)) | ((~(474618459 | iMaxMemory2)) | (-2104441692))) * (-1444))) - 85643308) {
            throw null;
        }
        super.onCreate(bundle);
        int i6 = onTransact + 103;
        INotificationSideChannel = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r4.IconCompatParcelizer();
        r4.b = 0;
        defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r4, java.lang.String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r5).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new defpackage.setSelectedChildViewEnabled());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if ((r5 instanceof VirtualCameraAdapter1.asBinder) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r4.IconCompatParcelizer();
        r4.b = 0;
        r5 = com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r4, (com.bpjstku.presentation.tuition.model.CustomerObject) r4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r4 = com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.onTransact + 99;
        com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.INotificationSideChannel = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if ((r4 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r4 = 9 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        r4.MediaBrowserCompat();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity r4, defpackage.VirtualCameraAdapter1 r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.onTransact
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.INotificationSideChannel = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L17
            boolean r1 = r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r3 = 9
            int r3 = r3 / r2
            if (r1 == 0) goto L1c
            goto L60
        L17:
            boolean r1 = r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r3 = 1
            if (r1 == r3) goto L60
        L1c:
            boolean r1 = r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r1 == 0) goto L38
            r4.IconCompatParcelizer()
            r4.b = r2
            com.nbs.nucleosnucleo.presentation.BaseActivity r4 = (com.nbs.nucleosnucleo.presentation.BaseActivity) r4
            VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r5 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r5
            java.lang.String r5 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r5 = java.lang.String.valueOf(r5)
            setSelectedChildViewEnabled r0 = new setSelectedChildViewEnabled
            r0.<init>()
            defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r4, r5, r0)
            return
        L38:
            boolean r5 = r5 instanceof VirtualCameraAdapter1.asBinder
            if (r5 == 0) goto L51
            r4.IconCompatParcelizer()
            r4.b = r2
            com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r5 = com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.INSTANCE
            r5 = r4
            android.content.Context r5 = (android.content.Context) r5
            kotlin.Lazy r4 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            java.lang.Object r4 = r4.getValue()
            com.bpjstku.presentation.tuition.model.CustomerObject r4 = (com.bpjstku.presentation.tuition.model.CustomerObject) r4
            com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, r4)
        L51:
            int r4 = com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.onTransact
            int r4 = r4 + 99
            int r5 = r4 % 128
            com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.INotificationSideChannel = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L5f
            r4 = 9
            int r4 = r4 / r2
        L5f:
            return
        L60:
            r4.MediaBrowserCompat()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) authenticationOtpBniAutodebetActivity.d.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = INotificationSideChannel + 33;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    public static /* synthetic */ Unit b(AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity, ActivityAuthenticationOtpBniAutodebetBinding activityAuthenticationOtpBniAutodebetBinding, View view) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int i2 = authenticationOtpBniAutodebetActivity.b;
        final ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) authenticationOtpBniAutodebetActivity.asInterface.getValue();
        String strValueOf = String.valueOf(activityAuthenticationOtpBniAutodebetBinding.otpVerify.getText());
        String string = ((SubmitAutodebitBniAutopayResponse) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getReferenceNo().toString();
        String string2 = ((SubmitAutodebitBniAutopayResponse) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getChargeToken().toString();
        String string3 = ((CustomerObject) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.toString();
        User user = (User) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (user != null) {
            int i3 = onTransact + 117;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str = null;
        }
        VerifyOtpSubmitAutodebitBniRequest verifyOtpSubmitAutodebitBniRequest = new VerifyOtpSubmitAutodebitBniRequest(strValueOf, string, string2, string3, String.valueOf(str));
        Intrinsics.checkNotNullParameter(verifyOtpSubmitAutodebitBniRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = listPopupWindow2.MediaBrowserCompat;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(listPopupWindow2.write.verifyOtpInsertAutodebetBni(verifyOtpSubmitAutodebitBniRequest)));
        final Function1 function1 = new Function1() { // from class: getStringArray
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.b(listPopupWindow2, (BaseItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getXml
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ListPopupWindow3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.getInterfaceDescriptor(listPopupWindow2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: MenuPopupWindowMenuDropDownListView
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        listPopupWindow2.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 31;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit d() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannel + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ CustomerObject TuitionPaymentFragmentbindingInflater1(AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = authenticationOtpBniAutodebetActivity.getIntent().getParcelableExtra("customer_object_recurring");
        Intrinsics.checkNotNull(parcelableExtra);
        CustomerObject customerObject = (CustomerObject) parcelableExtra;
        int i4 = INotificationSideChannel + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return customerObject;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityAuthenticationOtpBniAutodebetBinding activityAuthenticationOtpBniAutodebetBinding, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 6) {
            int i2 = INotificationSideChannel + 99;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                Button button = activityAuthenticationOtpBniAutodebetBinding.btnVerification;
                Intrinsics.checkNotNullExpressionValue(button, "");
                Button button2 = button;
                Intrinsics.checkNotNullParameter(button2, "");
                button2.setEnabled(true);
            } else {
                Button button3 = activityAuthenticationOtpBniAutodebetBinding.btnVerification;
                Intrinsics.checkNotNullExpressionValue(button3, "");
                Button button4 = button3;
                Intrinsics.checkNotNullParameter(button4, "");
                button4.setEnabled(false);
            }
            int i3 = onTransact + 41;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
        } else {
            Button button5 = activityAuthenticationOtpBniAutodebetBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(button5, "");
            Button button6 = button5;
            Intrinsics.checkNotNullParameter(button6, "");
            button6.setEnabled(true);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity, View view) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int i2 = authenticationOtpBniAutodebetActivity.b;
        getCameraCharacteristic getcameracharacteristic = authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1;
        String str2 = null;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) authenticationOtpBniAutodebetActivity.asInterface.getValue();
        String string = ((CustomerObject) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.toString();
        String string2 = ((CustomerObject) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.toString();
        String string3 = ((CustomerObject) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).RemoteActionCompatParcelizer.toString();
        String strValueOf = String.valueOf(((CustomerObject) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).getInterfaceDescriptor);
        String strValueOf2 = String.valueOf(((SubmitAutodebitBniAutopayResponse) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getNomorRekening());
        String strValueOf3 = String.valueOf(((SubmitAutodebitBniAutopayResponse) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getNomorKartu());
        String string4 = ((CustomerObject) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString();
        User user = (User) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (user != null) {
            int i3 = onTransact + 53;
            INotificationSideChannel = i3 % 128;
            if (i3 % 2 != 0) {
                String str3 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                throw null;
            }
            str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } else {
            str = null;
        }
        String strValueOf4 = String.valueOf(str);
        User user2 = (User) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (user2 != null) {
            str2 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = INotificationSideChannel + 69;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new SubmitAutodebitBniAutopayRequest(string, string2, string3, "0", strValueOf, strValueOf2, strValueOf3, string4, strValueOf4, String.valueOf(str2)));
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 29;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ SubmitAutodebitBniAutopayResponse b(AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = authenticationOtpBniAutodebetActivity.getIntent().getParcelableExtra("customer_object_verify_otp_bni");
        Intrinsics.checkNotNull(parcelableExtra);
        SubmitAutodebitBniAutopayResponse submitAutodebitBniAutopayResponse = (SubmitAutodebitBniAutopayResponse) parcelableExtra;
        int i4 = onTransact + 1;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return submitAutodebitBniAutopayResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            authenticationOtpBniAutodebetActivity.finish();
            return Unit.INSTANCE;
        }
        authenticationOtpBniAutodebetActivity.finish();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityAuthenticationOtpBniAutodebetBinding activityAuthenticationOtpBniAutodebetBinding, AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 21;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            OtpView otpView = activityAuthenticationOtpBniAutodebetBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, authenticationOtpBniAutodebetActivity);
        } else {
            OtpView otpView2 = activityAuthenticationOtpBniAutodebetBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView2, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, authenticationOtpBniAutodebetActivity);
            int i3 = 84 / 0;
        }
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 65;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    private static /* synthetic */ Object b(Object[] objArr) {
        getCameraCharacteristic getcameracharacteristic;
        AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity = (AuthenticationOtpBniAutodebetActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = onTransact + 77;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            authenticationOtpBniAutodebetActivity.MediaBrowserCompat();
            int i4 = INotificationSideChannel + 113;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            authenticationOtpBniAutodebetActivity.IconCompatParcelizer();
            authenticationOtpBniAutodebetActivity.b = 0;
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(authenticationOtpBniAutodebetActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: post
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthenticationOtpBniAutodebetActivity.d();
                }
            });
            int i6 = INotificationSideChannel + 103;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 18 / 0;
            }
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i8 = INotificationSideChannel + 107;
            onTransact = i8 % 128;
            if (i8 % 2 == 0) {
                authenticationOtpBniAutodebetActivity.IconCompatParcelizer();
                authenticationOtpBniAutodebetActivity.b = 0;
                getcameracharacteristic = authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1;
                if (getcameracharacteristic == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getcameracharacteristic = null;
                }
            } else {
                authenticationOtpBniAutodebetActivity.IconCompatParcelizer();
                authenticationOtpBniAutodebetActivity.b = 0;
                getcameracharacteristic = authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1;
                if (getcameracharacteristic == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getcameracharacteristic = null;
                }
            }
            getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(authenticationOtpBniAutodebetActivity, (CustomerObject) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), (SubmitAutodebitBniAutopayResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "kirim ulang otp berhasil", 0).show();
        }
        int i9 = onTransact + 121;
        INotificationSideChannel = i9 % 128;
        if (i9 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i2) | i3);
        int i11 = i9 | i10 | (~(i3 | i4));
        int i12 = (~(i4 | i2)) | (~(i7 | i2));
        int i13 = i8 | i10;
        int i14 = i2 + i3 + i6 + (793188503 * i5) + (2090109681 * i);
        int i15 = i14 * i14;
        int i16 = (837707615 * i2) + 1286602752 + ((-1676358574) * i3) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i6) + (1186463744 * i5) + (1166540800 * i) + ((-1956446208) * i15);
        int i17 = ((i2 * 1389925299) - 652765764) + (i3 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i6 * 1389926445) + (i5 * (-1551828341)) + (i * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        if (i18 == 1) {
            return b(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i18 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i18 == 4) {
            AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity = (AuthenticationOtpBniAutodebetActivity) objArr[0];
            int i19 = 2 % 2;
            authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1 = new getCameraCharacteristic(((ActivityAuthenticationOtpBniAutodebetBinding) ((ViewBinding) authenticationOtpBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS));
            int i20 = INotificationSideChannel + 65;
            onTransact = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity2 = (AuthenticationOtpBniAutodebetActivity) objArr[0];
        int i22 = 2 % 2;
        int i23 = onTransact + 65;
        INotificationSideChannel = i23 % 128;
        int i24 = i23 % 2;
        super.onPause();
        int i25 = onTransact + 93;
        INotificationSideChannel = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(AuthenticationOtpBniAutodebetActivity authenticationOtpBniAutodebetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        int iB2 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        int iB3 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), 1238840275, -1238840274, iB, iB3, new Object[]{authenticationOtpBniAutodebetActivity, virtualCameraAdapter1}, iB2);
    }

    static {
        getInterfaceDescriptor = 1;
        onTransact();
        INSTANCE = new Companion(null);
        int i = RemoteActionCompatParcelizer + 105;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_authentication_otp_bni_autodebet;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int length = 1505786737 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        int iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), 819128920, -819128916, length, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_warning_text).substring(0, 22).length() - 1485025998, new Object[]{this}, iB);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -488021269, 488021271, iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_day_of_week_column_header).substring(0, 4).length() + 946207717;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 543526179, -543526176, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, length, new Object[]{this, bundle}, iB);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_challenge_token).substring(3, 4).codePointAt(0) + 215711271;
        int iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), -1877418931, 1877418931, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iB, new Object[]{this}, iCodePointAt);
    }

    static void onTransact() {
        g = -808040889;
        d = -1934795553;
        notify = 1165364295;
        cancel = new byte[]{44, -48, 39, 13, -14, 44, -43, 37, -34, 2, 1, -97, 32, 101, -18, -33, -34, -39, 42, -46, 41, 86, -86, 91, -90, -91, 82, -67, 64, 81, 92, -83, -95, 91, -87, 93, -92, 84, -81, 115, 112, -110, -84, 88, -96, 107, -104, -66, 64, -94, -82, 90, -125, 116, 90, -67, -74, 96, -86, -92, 90, -87, -90, -82, 84, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, short r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r5 = r5 + 4
            int r6 = 121 - r6
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.AuthenticationOtpBniAutodebetActivity.$$i(int, short, byte):java.lang.String");
    }
}
