package com.bpjstku.presentation.membership.devicebinding;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.databinding.ActivityDeviceUnlinkingOtpBinding;
import com.bpjstku.databinding.ActivityVocationalTrainingDetilInformationBinding;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import com.mukesh.OtpView;
import defpackage.AppCompatSpinnerDropDownAdapter;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.notifyStateAttached;
import defpackage.onResume;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\u000e\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0014R\u0015\u0010\u0007\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0017\u0010\f\u001a\u0004\u0018\u00010\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00158BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDeviceUnlinkingOtpBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "LAppCompatSpinnerDropDownAdapter;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceUnlinkingOtpActivity extends BindingBaseActivity<ActivityDeviceUnlinkingOtpBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f515a;
    private static int asBinder;
    private static byte[] asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static short[] d;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {21, 65, -9, -121};
    private static final int $$f = 87;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {56, 94, 119, -19, 12, -2, -63, 69, -4, -9, -5, 10, -2, 5, -7, -1, 9, 3, -13, 17, -17, 13, -68, 51, 13, -13, 11, 13, -5, -11, -6, 16, -69, 55, 19, -21, 2, 11, 4, -11, 6, -1, 5, -69, 23, 49, -17, 9, 6, -38, 33, 5, -32, 30, -17, 2, 8, -6, -1, -31, 51, -21, 2, 11, 4, -11, 6, -1, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -18, 7, 5, -10, 5, 5, -7, -30, 37, -8, 6, -11, 19, -15, 13, -65};
    private static final int $$k = 53;
    private static final byte[] $$a = {22, 102, 43, -6, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 245;
    private static int cancel = 1;
    private static int notify = 0;
    private static int onTransact = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: setDropDownHorizontalOffset
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: getInternalPopup
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingOtpActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: getPrompt
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (String) DeviceUnlinkingOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(16058217, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3}, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), -16058216);
        }
    });

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.b.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i6);
        int i8 = ~((~i4) | i6);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i6) | i)) | i7;
        int i11 = i6 + i + i5 + ((-1814252664) * i2) + (2073254503 * i3);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i6) + 1943797760 + (1745420935 * i) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i5) + ((-1631584256) * i2) + ((-1368915968) * i3) + ((-1053032448) * i12);
        int i14 = (i6 * (-1919122223)) + 1408767311 + (i * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i5 * (-1919121629)) + (i2 * (-390511720)) + (i3 * 1804971285) + (i12 * 255066112);
        int i15 = i13 + (i14 * i14 * 379846656);
        if (i15 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i15 != 2) {
            return i15 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.$$a
            int r9 = r9 + 1
            int r7 = 144 - r7
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L2c
        L12:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.c(int, int, byte, java.lang.Object[]):void");
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
    private static void f(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.$$j
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r6 = r6 * 27
            int r1 = 65 - r6
            byte[] r1 = new byte[r1]
            int r6 = 64 - r6
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
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.f(byte, int, byte, java.lang.Object[]):void");
    }

    public DeviceUnlinkingOtpActivity() {
        final DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<AppCompatSpinnerDropDownAdapter>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [AppCompatSpinnerDropDownAdapter, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ AppCompatSpinnerDropDownAdapter invoke() {
                LifecycleOwner lifecycleOwner = deviceUnlinkingOtpActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppCompatSpinnerDropDownAdapter.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingOtpActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, String p1, String p2, String p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) DeviceUnlinkingOtpActivity.class);
            intent.putExtra("email", p1);
            intent.putExtra("key_transaction_id", p2);
            intent.putExtra("check_sum", p3);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDeviceUnlinkingOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        DeviceUnlinkingOtpActivity$bindingInflater$1 deviceUnlinkingOtpActivity$bindingInflater$1 = DeviceUnlinkingOtpActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = notify + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return deviceUnlinkingOtpActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        final DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity = (DeviceUnlinkingOtpActivity) objArr[0];
        int i = 2 % 2;
        final ActivityDeviceUnlinkingOtpBinding activityDeviceUnlinkingOtpBinding = (ActivityDeviceUnlinkingOtpBinding) ((ViewBinding) deviceUnlinkingOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityDeviceUnlinkingOtpBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: setDropDownWidth
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                DeviceUnlinkingOtpActivity.TuitionPaymentFragmentbindingInflater1(activityDeviceUnlinkingOtpBinding, deviceUnlinkingOtpActivity);
            }
        });
        OtpView otpView = activityDeviceUnlinkingOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: setPopupBackgroundResource
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) DeviceUnlinkingOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(-143745745, new Object[]{activityDeviceUnlinkingOtpBinding, (String) obj}, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), 143745748);
            }
        }));
        MaterialButton materialButton = activityDeviceUnlinkingOtpBinding.btnVerification;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setPopupBackgroundDrawable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityDeviceUnlinkingOtpBinding, deviceUnlinkingOtpActivity, (View) obj);
            }
        }));
        TextView textView = activityDeviceUnlinkingOtpBinding.tvResendCode;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setDropDownVerticalOffset
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingOtpActivity.TuitionPaymentFragmentbindingInflater1(activityDeviceUnlinkingOtpBinding, deviceUnlinkingOtpActivity, (View) obj);
            }
        }));
        int i2 = onTransact + 19;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity = (DeviceUnlinkingOtpActivity) objArr[0];
        int i = 2 % 2;
        DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity2 = deviceUnlinkingOtpActivity;
        ((AppCompatSpinnerDropDownAdapter) deviceUnlinkingOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue()).asBinder.observe(deviceUnlinkingOtpActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: getPopupBackground
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((AppCompatSpinnerDropDownAdapter) deviceUnlinkingOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue()).d.observe(deviceUnlinkingOtpActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: getPopupContext
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = onTransact + 25;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityDeviceUnlinkingOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvEmail.setText(Camera2CameraControlExternalSyntheticLambda5.a((String) this.b.getValue()));
        ((ActivityDeviceUnlinkingOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.setCursorVisible(true);
        int i4 = onTransact + 51;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        notify = i2 % 128;
        int i3 = i2 % 2;
        DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity = this;
        Intrinsics.checkNotNullParameter(deviceUnlinkingOtpActivity, "");
        deviceUnlinkingOtpActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityDeviceUnlinkingOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_string_null);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = notify + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(g)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            int i6 = -1;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) (-1);
                byte b3 = (byte) (b2 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - Process.getGidForName("")), 2267 - KeyEvent.keyCodeFromString(""), 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1387473586, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 115;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i9 = $10 + 99;
                int i10 = i9 % 128;
                $11 = i10;
                int i11 = i9 % 2;
                byte[] bArr = asInterface;
                long j = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = i10 + 19;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = 0;
                    while (i14 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i14])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + i6);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 3359;
                            int i15 = 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1));
                            byte length2 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, bitsPerPixel, i15, -1054011043, false, $$i((byte) i6, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i14] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i14++;
                        i6 = -1;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = asInterface;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(f515a)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 34 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1387473586, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) d[i3 + ((int) (((long) f515a) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) f515a) ^ 3046761265686732006L)) + i4;
                try {
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asBinder), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 55904), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2855, 13 - (Process.myPid() >> 22), -1529949196, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = asInterface;
                    if (bArr4 != null) {
                        int i16 = $11 + 107;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        int i18 = 0;
                        while (i18 < length3) {
                            int i19 = $10 + 101;
                            $11 = i19 % 128;
                            if (i19 % 2 == 0) {
                                bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 3046761265686732006L);
                            } else {
                                bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 3046761265686732006L);
                                i18++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i20 = $11 + 3;
                        int i21 = i20 % 128;
                        $10 = i21;
                        int i22 = i20 % 2;
                        if (!(!z)) {
                            int i23 = i21 + 33;
                            $11 = i23 % 128;
                            if (i23 % 2 == 0) {
                                byte[] bArr6 = asInterface;
                                int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - (((byte) (((byte) (((long) bArr6[i24]) * 3046761265686732006L)) - s)) ^ b));
                            } else {
                                byte[] bArr7 = asInterface;
                                int i25 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i25]) ^ 3046761265686732006L)) + s)) ^ b));
                            }
                            int i26 = $11 + 51;
                            $10 = i26 % 128;
                            int i27 = i26 % 2;
                        } else {
                            short[] sArr = d;
                            int i28 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i28 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i28]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 37567);
            int i2 = 626 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i3 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b = $$a[7];
            Object[] objArr3 = new Object[1];
            c((short) 141, b, b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, i2, i3, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e((KeyEvent.getMaxKeyCode() >> 16) - 223478700, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_1).substring(0, 3).codePointAt(1) - 124, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.vida_preview_width) & (-865)) - 228), (byte) TextUtils.indexOf("", ""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1772693910, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gross_amount_not_equal).substring(5, 6).codePointAt(0) - 223478728, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step5).substring(28, 29).length() - 14, (short) ((KeyEvent.getMaxKeyCode() >> 16) - 21), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1772693863, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37566);
            int edgeSlop = 625 - (ViewConfiguration.getEdgeSlop() >> 16);
            int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15;
            Object[] objArr6 = new Object[1];
            c((short) 141, $$a[132], (byte) ($$b & 62), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, edgeSlop, i4, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cKeyCodeFromString = (char) (37567 - KeyEvent.keyCodeFromString(""));
                int iBlue = 625 - Color.blue(0);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 14;
                Object[] objArr7 = new Object[1];
                c((short) 89, $$a[132], (byte) ($$b & 62), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, iBlue, offsetAfter, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr8[2])[0];
            int i6 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i5};
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i8 = ~((-465371810) | i7);
            int i9 = ~i7;
            int i10 = 2010559960 + ((i8 | (~(1358366311 | i9))) * (-1808)) + (((~((-280298018) | i7)) | (~(i9 | 1543440103))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(i7 | (-1358366312))) | 185073792 | (~(465371809 | i9))) * TypedValues.Custom.TYPE_BOOLEAN) + 1619298248;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr2[1])[0] = i12 ^ (i12 << 5);
            objArr2 = new Object[]{new int[]{i6}, new int[1], iArr, strArr};
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr9 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_payment_cant_open_deeplink).substring(5, 6).codePointAt(0) - 223478732, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 119, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction).substring(0, 6).codePointAt(3) - 95), (byte) TextUtils.getCapsMode("", 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step1).substring(24, 34).length() - 1772693847, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step3).substring(10, 11).length() - 223478699, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret).substring(0, 9).codePointAt(2) - 113, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_hat_text).substring(0, 4).codePointAt(2) - 176), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.currency_invalid).substring(15, 16).codePointAt(0) - 1772693843, objArr10);
                baseContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            }
            if (baseContext == null) {
                objArr = null;
            } else {
                if (baseContext instanceof ContextWrapper) {
                    int i13 = onTransact + 125;
                    notify = i13 % 128;
                    if (i13 % 2 != 0) {
                        ((ContextWrapper) baseContext).getBaseContext();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) baseContext).getBaseContext() == null) {
                        baseContext = null;
                        objArr = null;
                    }
                }
                objArr = null;
                baseContext = baseContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e(Process.getGidForName("") - 223478690, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(objArr, objArr)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step1).substring(14, 15).length() - 14, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 99), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step5).substring(3, 4).codePointAt(0) - 1772693910, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay_qris).substring(0, 5).codePointAt(2) - 223478789, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 24, (short) (TextUtils.getTrimmedLength("") + 39), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), TextUtils.lastIndexOf("", '0') - 1772693776, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 223478758, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 49, (short) ((-111) - (ViewConfiguration.getWindowTouchSlop() >> 8)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step1).substring(2, 4).length() - 2), (-1772693762) - MotionEvent.axisFromString(""), objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            e((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 223478698, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 13, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_app_name).substring(0, 12).length() - 11), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_title).substring(18, 19).codePointAt(0) - 32), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bni).substring(1, 3).codePointAt(0) - 1772693794, objArr14);
            try {
                Object[] objArr15 = {baseContext, new String[]{str, (String) objArr14[0]}, Integer.valueOf(iIntValue), 17, 1619298248};
                byte[] bArr = $$j;
                byte b2 = bArr[15];
                byte b3 = (byte) (b2 + 1);
                Object[] objArr16 = new Object[1];
                f(b3, b3, b2, objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b4 = (byte) (-bArr[15]);
                Object[] objArr17 = new Object[1];
                f(b4, b4, (byte) (-bArr[6]), objArr17);
                objArr2 = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i14 = ((int[]) objArr2[0])[0];
                int i15 = ((int[]) objArr2[2])[0];
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (37568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i16 = 626 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i17 = 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        Object[] objArr18 = new Object[1];
                        c((short) 89, $$a[132], (byte) ($$b & 62), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i16, i17, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr2);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 223478812, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 49, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_format_valid_until).substring(3, 4).length() - 101), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 115), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1772693874, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_detection_timeout_error).substring(0, 19).length() - 223478715, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_otp_message).substring(8, 9).codePointAt(0) - 116, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).codePointAt(0) - 131), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (ViewConfiguration.getTapTimeout() >> 16) - 1772693852, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37567);
                            int pressedStateDuration = 625 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int iRed = Color.red(0) + 14;
                            Object[] objArr21 = new Object[1];
                            c((short) 141, $$a[132], (byte) ($$b & 62), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, pressedStateDuration, iRed, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37568);
                            int i18 = 625 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i19 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                            byte b5 = $$a[7];
                            Object[] objArr22 = new Object[1];
                            c((short) 141, b5, b5, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, i18, i19, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i20 = onTransact + 63;
                        notify = i20 % 128;
                        int i21 = i20 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i22 = ((int[]) objArr2[0])[0];
        int i23 = ((int[]) objArr2[2])[0];
        if (i23 == i22) {
            int i24 = ((int[]) objArr2[1])[0];
            int i25 = ((int[]) objArr2[2])[0];
            int i26 = ((int[]) objArr2[0])[0];
            String[] strArr2 = (String[]) objArr2[3];
            int[] iArr2 = {i25};
            int i27 = ~System.identityHashCode(this);
            int i28 = i24 + 1172376024 + (((-1210057445) | i27) * 184) + (((~(i27 | 306939162)) | (-1210255093)) * 184);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[1])[0] = i30 ^ (i30 << 5);
            Object[] objArr23 = {new int[]{i26}, new int[1], iArr2, strArr2};
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr2[3];
        if (strArr3 != null) {
            int i31 = onTransact + 17;
            notify = i31 % 128;
            int i32 = i31 % 2;
            for (String str2 : strArr3) {
                int i33 = onTransact + 85;
                notify = i33 % 128;
                int i34 = i33 % 2;
                arrayList.add(str2);
            }
        }
        throw new RuntimeException(String.valueOf(i23));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
            int defaultSize = 23 - View.getDefaultSize(0, 0);
            short s = (short) ($$b & 47);
            byte b = $$a[132];
            Object[] objArr2 = new Object[1];
            c(s, b, (byte) (b | 36), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, threadPriority, defaultSize, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = onTransact + 1;
            notify = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int mirror = 1803 - AndroidCharacter.getMirror('0');
                int i4 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                Object[] objArr3 = new Object[1];
                c((short) 89, $$a[132], (byte) ($$b & 62), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, mirror, i4, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_full_name).substring(0, 12).codePointAt(8) - 589984525;
            int i5 = ~iCodePointAt;
            int i6 = 14516873 + (((~(i5 | 443946177)) | (~(231343751 | i5)) | (-536745672)) * 464) + (((-305401921) | iCodePointAt) * (-464)) + (((~(iCodePointAt | 443946177)) | (-536745672)) * 464) + 2041863243;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 223478702, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 24, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (-1772693793) - View.combineMeasuredStates(0, 0), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e((-223478692) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 119, (short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 39), (byte) (ViewConfiguration.getScrollBarSize() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1772693813, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-414061805};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.getOffsetBefore("", 0)), 1726 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.alpha(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 2041863243);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                    int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                    Object[] objArr8 = new Object[1];
                    c((short) 89, $$a[132], (byte) ($$b & 62), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, offsetBefore, absoluteGravity, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 223478736, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 24, (short) (KeyEvent.keyCodeFromString("") - 100), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-1772693875) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e((-223478696) - (ViewConfiguration.getTouchSlop() >> 8), Color.argb(0, 0, 0, 0) - 13, (short) ((-21) - (KeyEvent.getMaxKeyCode() >> 16)), (byte) Color.alpha(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1772693888, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cBlue = (char) (Color.blue(0) + 29944);
                        int absoluteGravity2 = 1755 - Gravity.getAbsoluteGravity(0, 0);
                        int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr = $$a;
                        Object[] objArr11 = new Object[1];
                        c(bArr[7], bArr[132], (byte) ($$b & 62), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, absoluteGravity2, longPressTimeout, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 1755;
                        int iAxisFromString = MotionEvent.axisFromString("") + 24;
                        short s2 = (short) ($$b & 47);
                        byte b2 = $$a[132];
                        Object[] objArr12 = new Object[1];
                        c(s2, b2, (byte) (b2 | 36), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, iIndexOf, iAxisFromString, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i10 == i9) {
            int i11 = notify + 21;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i14 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i15 = ~i14;
            int i16 = (~((-80030558) | i15)) | 79962716;
            int i17 = ~(i14 | 132639709);
            int i18 = i13 + (((i16 | i17) * (-252)) - 1111629623) + ((i17 | (~(i15 | (-67842)))) * 252);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr13[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i21 = 0;
                while (i21 < strArr.length) {
                    int i22 = notify + 51;
                    onTransact = i22 % 128;
                    if (i22 % 2 == 0) {
                        arrayList.add(strArr[i21]);
                        i21 += 93;
                    } else {
                        arrayList.add(strArr[i21]);
                        i21++;
                    }
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i23 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i24 = ~System.identityHashCode(this);
            int i25 = i23 + 1260931451 + (((-570441734) | i24) * 494) + (((~(i24 | (-571757782))) | 215234522) * 494);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr14[3])[0] = i27 ^ (i27 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int i28 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1030;
            int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 15;
            Object[] objArr15 = new Object[1];
            c((short) 141, $$a[132], (byte) ($$b & 62), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMyTid, i28, absoluteGravity3, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 223478711, Process.getGidForName("") - 12, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 136), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_invalid_progress_configuration).substring(0, 134).codePointAt(126) - 1772693989, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 223478707, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 49, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 57), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), TextUtils.lastIndexOf("", '0') - 1772693851, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int i29 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
            Object[] objArr18 = new Object[1];
            c((short) 89, $$a[132], (byte) ($$b & 62), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i29, minimumFlingVelocity, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i30 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                byte b3 = $$a[7];
                Object[] objArr19 = new Object[1];
                c((short) 141, b3, b3, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, i30, packedPositionChild, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr20[3])[0];
            int i32 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i33 = ~iIdentityHashCode;
            int i34 = 688808506 + (((~((-485992927) | i33)) | (~(241712756 | iIdentityHashCode))) * 217) + (((~(iIdentityHashCode | (-485992927))) | 278364554) * 217) + (((~(241712756 | i33)) | 485992926) * 217) + 519429318;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr[2])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e((-223478692) - ((byte) KeyEvent.getModifierMetaStateMask()), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 24, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_giftcard_number).substring(1, 2).codePointAt(0) - 111), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 116), (-1772693794) - TextUtils.lastIndexOf("", '0', 0), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(Gravity.getAbsoluteGravity(0, 0) - 223478692, (-13) - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_secondary_cta_text).substring(0, 8).codePointAt(2) - 77), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), Color.argb(0, 0, 0, 0) - 1772693777, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-414061805};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1134, 18 - View.getDefaultSize(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 519429318, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iBlue = 1031 - Color.blue(0);
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 15;
                Object[] objArr25 = new Object[1];
                c((short) 141, $$a[132], (byte) ($$b & 62), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(doubleTapTimeout, iBlue, iIndexOf2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.blue(0)), 1117 - (Process.myTid() >> 22), View.MeasureSpec.makeMeasureSpec(0, 0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int size = View.MeasureSpec.getSize(0) + 1031;
                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                byte b4 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((short) 141, b4, b4, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(pressedStateDuration, size, minimumFlingVelocity2, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e((ViewConfiguration.getWindowTouchSlop() >> 8) - 223478700, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 49, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 136), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.getOffsetAfter("", 0) - 1772693874, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 223478794, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step2).substring(8, 9).codePointAt(0) - 123, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 57), (byte) ExpandableListView.getPackedPositionType(0L), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1772693863, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int i37 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                    Object[] objArr29 = new Object[1];
                    c((short) 89, $$a[132], (byte) ($$b & 62), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(packedPositionChild2, i37, trimmedLength, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int iIndexOf3 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                    int doubleTapTimeout2 = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    Object[] objArr30 = new Object[1];
                    c((short) 141, $$a[132], (byte) ($$b & 62), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, iIndexOf3, doubleTapTimeout2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArr[1])[0];
        int i39 = ((int[]) objArr[3])[0];
        if (i39 == i38) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i40 = ((int[]) objArr[2])[0];
            int i41 = ((int[]) objArr[3])[0];
            int i42 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1628132577;
            int i43 = i40 + (-1447165921) + (((~((-172561536) | length)) | 138941545) * (-140)) + ((~((-33619991) | length)) * 70) + (((~(length | 416841705)) | (-311520151)) * 70);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr31[2])[0] = i45 ^ (i45 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i46 = notify + 73;
            onTransact = i46 % 128;
            int i47 = i46 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        int[] iArr = new int[i39];
        int i48 = i39 - 1;
        iArr[i48] = 1;
        Toast.makeText((Context) null, iArr[((i39 * i48) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i49 = ((int[]) objArr[2])[0];
        int i50 = ((int[]) objArr[3])[0];
        int i51 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i52 = (-358840765) + (((-848786591) | layoutDirection) * 614);
        int i53 = ~layoutDirection;
        int i54 = i49 + i52 + (((~((-765194533) | i53)) | 218661152 | (~((-520914363) | i53))) * (-1228)) + (((~(i53 | (-302253211))) | (~((-546533381) | i53))) * 614);
        int i55 = i54 ^ (i54 << 13);
        int i56 = i55 ^ (i55 >>> 17);
        ((int[]) objArr32[2])[0] = i56 ^ (i56 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:9:0x007e  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 109;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iNextInt = new Random().nextInt();
            int i5 = ~(1796962032 | iNextInt);
            int i6 = ~iNextInt;
            int i7 = i5 | (~(966974489 | i6));
            int i8 = ~((-1796962033) | i6);
            if (i4 != (-1092090624) + ((i7 | i8) * (-516)) + (((~(iNextInt | (-278956042))) | (~((-688018449) | i6))) * 516) + ((688018448 | i8) * 516)) {
                int[] iArr = new int[1730106995];
                iArr[1730106994] = 1;
                int i9 = 804004150 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                i = onTransact + 53;
                notify = i % 128;
                if (i % 2 != 0) {
                    int i10 = 4 % 4;
                }
            }
        } else {
            int i11 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i11 != (-1698330168) + (((~(1609002895 | iIdentityHashCode)) | 779015352) * (-366)) + (((~(iIdentityHashCode | 2146435007)) | 241583240) * 366)) {
                int[] iArr2 = new int[1730106995];
                iArr2[1730106994] = 1;
                int i12 = 804004150 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
                i = onTransact + 53;
                notify = i % 128;
                if (i % 2 != 0) {
                    int i13 = 4 % 4;
                }
            }
        }
        int i14 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iNextInt2 = new Random().nextInt(1891481299);
        int i15 = ~(301656676 | iNextInt2);
        if (i14 != 1032231852 + (((-2046553960) | i15) * (-814)) + ((i15 | (~((~iNextInt2) | 2017568007)) | 272670724) * 407) + (((~(iNextInt2 | (-2017568008))) | (~((-301656677) | iNextInt2)) | 272670724) * 407)) {
            throw new RuntimeException("-1150740419");
        }
        super.onResume();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        int i6 = (-1829464504) + (((~((-284642341) | i5)) | 277874692 | (~(1114629883 | i5)) | (~((-1107862236) | iIdentityHashCode))) * (-84));
        int i7 = (~(iIdentityHashCode | 1114629883)) | 284642340;
        int i8 = ~(i5 | (-1114629884));
        if (i4 != i6 + ((i7 | i8) * (-84)) + ((1107862235 | i8) * 84)) {
            throw new RuntimeException("-1213363604");
        }
        int i9 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1357979776;
        if (i9 != (((~((-268743185) | i10)) | 1226965058) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 553536226 + ((~((~i10) | (-268743185))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
            int i11 = (-165789882) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i12 = notify + 5;
        onTransact = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = notify + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step1).substring(1, 2).codePointAt(0) - 434161273;
        if (i4 != (((~((~iCodePointAt) | 1593688063)) * 130) - 1335224324) + (((~(iCodePointAt | 1593688063)) | 276046102) * 130)) {
            int i5 = 1487355420 % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1120665486);
        if (i6 != 728652999 + (((~((-2004806643) | i7)) | (-574249323)) * (-983)) + (((~(i7 | (-574249323))) | 4104) * 983)) {
            throw new RuntimeException("-1876515036");
        }
        super.onCreate(bundle);
        int i8 = notify + 31;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r8.length() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r8 = (defpackage.AppCompatSpinnerDropDownAdapter) r9.TuitionPaymentFragmentbindingInflater1.getValue();
        r9 = (java.lang.String) r9.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r9);
        defpackage.AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1549146552, com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new java.lang.Object[]{r8, r9}, com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1549146551, com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        r8 = kotlin.Unit.INSTANCE;
        r9 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.onTransact + 9;
        com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.notify = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        if ((r9 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        r9 = 39 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r8.length() != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ kotlin.Unit TuitionPaymentFragmentbindingInflater1(com.bpjstku.databinding.ActivityDeviceUnlinkingOtpBinding r8, com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity r9, android.view.View r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            com.mukesh.OtpView r8 = r8.otpVerify
            android.text.Editable r8 = r8.getEditableText()
            r8.clear()
            kotlin.Lazy r8 = r9.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r10 = 0
            if (r8 == 0) goto L7a
            int r1 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.onTransact
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.notify = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L33
            int r8 = r8.length()
            r1 = 45
            int r1 = r1 / r10
            if (r8 == 0) goto L7a
            goto L39
        L33:
            int r8 = r8.length()
            if (r8 == 0) goto L7a
        L39:
            kotlin.Lazy r8 = r9.TuitionPaymentFragmentbindingInflater1
            java.lang.Object r8 = r8.getValue()
            AppCompatSpinnerDropDownAdapter r8 = (defpackage.AppCompatSpinnerDropDownAdapter) r8
            kotlin.Lazy r9 = r9.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r9}
            int r2 = com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            int r6 = com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            int r4 = com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            int r7 = com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            r1 = 1549146552(0x5c5619b8, float:2.410557E17)
            r5 = -1549146551(0xffffffffa3a9e649, float:-1.8420546E-17)
            defpackage.AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r1, r2, r3, r4, r5, r6, r7)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            int r9 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.onTransact
            int r9 = r9 + 9
            int r1 = r9 % 128
            com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.notify = r1
            int r9 = r9 % r0
            if (r9 == 0) goto L79
            r9 = 39
            int r9 = r9 / r10
        L79:
            return r8
        L7a:
            android.content.Context r8 = defpackage.ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2()
            java.lang.String r9 = "Transaction ID tidak ditemukan"
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r10)
            r8.show()
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.TuitionPaymentFragmentbindingInflater1(com.bpjstku.databinding.ActivityDeviceUnlinkingOtpBinding, com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity, android.view.View):kotlin.Unit");
    }

    public static /* synthetic */ String b(DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity) {
        int i = 2 % 2;
        int i2 = notify + 99;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return deviceUnlinkingOtpActivity.getIntent().getStringExtra("key_transaction_id");
        }
        deviceUnlinkingOtpActivity.getIntent().getStringExtra("key_transaction_id");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity = (DeviceUnlinkingOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingOtpActivity.getIntent().getStringExtra("check_sum");
        int i4 = onTransact + 63;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityDeviceUnlinkingOtpBinding activityDeviceUnlinkingOtpBinding, DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity, View view) {
        int i = 2 % 2;
        int i2 = notify + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        String string = StringsKt.trim((CharSequence) String.valueOf(activityDeviceUnlinkingOtpBinding.otpVerify.getText())).toString();
        if (string.length() == 0) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "OTP tidak boleh kosong", 0).show();
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 29;
            notify = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return unit;
        }
        if (string.length() != 6) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "OTP harus 6 digit", 0).show();
            return Unit.INSTANCE;
        }
        String str = (String) deviceUnlinkingOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (str == null || str.length() == 0) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Transaction ID tidak ditemukan", 0).show();
            Unit unit2 = Unit.INSTANCE;
            int i6 = onTransact + 65;
            notify = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 21 / 0;
            }
            return unit2;
        }
        final AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter = (AppCompatSpinnerDropDownAdapter) deviceUnlinkingOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        String str2 = (String) deviceUnlinkingOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(string, "");
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = appCompatSpinnerDropDownAdapter.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, string)));
        final Function1 function1 = new Function1() { // from class: AppCompatSpinnerDropdownPopup2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(appCompatSpinnerDropDownAdapter, (BaseItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: AppCompatSpinnerInspectionCompanion
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: AppCompatTextHelper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(appCompatSpinnerDropDownAdapter, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: AppCompatSpinnerSavedState1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr = {function2, obj};
                AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(443101344, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -443101339, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Unit unit3 = Unit.INSTANCE;
        int i8 = notify + 49;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return unit3;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ActivityDeviceUnlinkingOtpBinding activityDeviceUnlinkingOtpBinding, DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            OtpView otpView = activityDeviceUnlinkingOtpBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, deviceUnlinkingOtpActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        OtpView otpView2 = activityDeviceUnlinkingOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView2, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, deviceUnlinkingOtpActivity);
        int i3 = notify + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = notify + 35;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            deviceUnlinkingOtpActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            deviceUnlinkingOtpActivity.IconCompatParcelizer();
            DeviceUnlinkingSuccessActivity.Companion tuitionPaymentFragmentbindingInflater1 = DeviceUnlinkingSuccessActivity.INSTANCE;
            DeviceUnlinkingSuccessActivity.Companion.TuitionPaymentFragmentbindingInflater1(deviceUnlinkingOtpActivity, (String) deviceUnlinkingOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
            deviceUnlinkingOtpActivity.finish();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = i3 + 15;
            notify = i4 % 128;
            if (i4 % 2 != 0) {
                deviceUnlinkingOtpActivity.IconCompatParcelizer();
                ((ActivityDeviceUnlinkingOtpBinding) ((ViewBinding) deviceUnlinkingOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i5 = 21 / 0;
                if (str == null) {
                    int i6 = onTransact + 41;
                    notify = i6 % 128;
                    int i7 = i6 % 2;
                    str = "Gagal memverifikasi OTP";
                }
            } else {
                deviceUnlinkingOtpActivity.IconCompatParcelizer();
                ((ActivityDeviceUnlinkingOtpBinding) ((ViewBinding) deviceUnlinkingOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str == null) {
                    int i8 = onTransact + 41;
                    notify = i8 % 128;
                    int i9 = i8 % 2;
                    str = "Gagal memverifikasi OTP";
                }
            }
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str, 0).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        notify = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingOtpActivity.getIntent().getStringExtra("email");
        if (stringExtra == null) {
            int i4 = notify + 89;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = "";
        }
        int i6 = notify + 11;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return stringExtra;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ActivityDeviceUnlinkingOtpBinding activityDeviceUnlinkingOtpBinding = (ActivityDeviceUnlinkingOtpBinding) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 73;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 == 0 ? str.length() >= 6 : str.length() >= 7) {
            MaterialButton materialButton = activityDeviceUnlinkingOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
            int i4 = notify + 17;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 3;
            }
        } else {
            MaterialButton materialButton3 = activityDeviceUnlinkingOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(false);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 65;
        notify = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            deviceUnlinkingOtpActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            deviceUnlinkingOtpActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "OTP berhasil dikirim ulang ke email: ".concat(String.valueOf((String) deviceUnlinkingOtpActivity.b.getValue())), 0).show();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            deviceUnlinkingOtpActivity.IconCompatParcelizer();
            String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str == null) {
                int i2 = notify + 89;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str = "Gagal mengirim ulang OTP";
            }
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str, 0).show();
            int i3 = onTransact + 39;
            notify = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceUnlinkingOtpActivity deviceUnlinkingOtpActivity) {
        return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(16058217, new Object[]{deviceUnlinkingOtpActivity}, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), -16058216);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityDeviceUnlinkingOtpBinding activityDeviceUnlinkingOtpBinding, String str) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(-143745745, new Object[]{activityDeviceUnlinkingOtpBinding, str}, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), 143745748);
    }

    static {
        INotificationSideChannel = 0;
        g();
        INSTANCE = new Companion(null);
        int i = cancel + 109;
        INotificationSideChannel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify + 53;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_device_unlinking_otp;
        }
        int i3 = 85 / 0;
        return R.layout.activity_device_unlinking_otp;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(304153342, new Object[]{this}, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1566579489, ActivityVocationalTrainingDetilInformationBinding.TuitionPaymentFragmentbindingInflater1(), -304153342);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1433457495, new Object[]{this}, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), ActivityVocationalTrainingDetilInformationBinding.TuitionPaymentFragmentbindingInflater1(), 1433457497);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 73;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    static void g() {
        f515a = -452692588;
        g = -1934795542;
        asBinder = -2113971989;
        asInterface = new byte[]{-20, -118, -66, -127, 107, -36, -118, -77, -125, -72, 108, 111, -7, -114, 67, -56, -71, -72, -121, -108, -68, -105, -27, -21, -1, -20, -5, -58, -9, -50, -27, -14, -31, -2, -62, -20, -6, -24, 8, 1, 56, 19, 25, 32, 22, 16, 56, 30, 6, 26, -21, 24, 79, 13, 28, -8, 83, 0, 3, 14, 31, 7, 30, -32, -39, -96, -45, -75, -40, -36, -37, -38, -90, -119, -21, -96, -81, -43, -90, -37, -76, -30, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -30, 60, 40, -29, 82, 40, 13, 20, 78, 56, 2, 40, 57, 4, 60, 50, -46, 121, -35, -107, -119, 123, -115, -120, -96, 121, -113, -107, -92, 126, -111, -40, 125, -105, -37, -120, 123, -107, -120, -40, -110, 126, -112, -119, -127, -112, -90, 113, -119, -110, -39, 70, -105, -40, 124, -89, -108, 124, -119, -105, -39, 120, -110, -113, -105, -91, -115, -119, 121, -40, -119, 122, -108, -39, -107, -106, -119, -116, -106, 68, -46, -55, -29, 40, -54, -25, 45, -28, -42, 24, 24, 55, -50, 25, 51, -49, -29, 25, 24, 26, -26, 41, -26, -44, 25, 54, 29, -42, -28, 29, 52, -50, -26, 24, 25, -29, 31, 48, -53, 55, -51, 41, -56, -25, -25, 26, -28, -26, 27, 43, -43, 42, -28, -41, 47, -26, -53, 50, -54, -30, 31, 55, -28, 27};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, byte r8) {
        /*
            int r7 = r7 + 117
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.$$c
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingOtpActivity.$$i(int, byte, byte):java.lang.String");
    }
}
