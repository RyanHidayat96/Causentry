package com.bpjstku.presentation.membership.registration.newregistration;

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
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.registration.bpu.model.request.PhoneVerificationRequestAuth;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.databinding.ActivityPhoneVerificationBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.connector.internal.zzg;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.UseTorchAsFlash;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getItemView;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setSplitTrack;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004R\u0015\u0010\b\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\"R\u0015\u0010\n\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010%\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\u000e\u001a\u00020&8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010'"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/newregistration/NewPhoneVerificationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityPhoneVerificationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "", "INotificationSideChannel", "()Ljava/lang/String;", "LUseTorchAsFlash;", "p0", "onClosePageEvent", "(LUseTorchAsFlash;)V", "onDestroy", "onBackPressed", "LsetSplitTrack;", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/data/lib/PreferenceManager;", "Ljava/lang/String;", "g", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewPhoneVerificationActivity extends BindingReactiveFormActivity<ActivityPhoneVerificationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] asInterface;
    private static int cancel;
    private static long d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: DefaultTaskExecutor1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: TaskExecutor
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (RegistrationForUnregistered) NewPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2}, 947300916, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -947300912, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String g;
    private static final byte[] $$c = {119, -102, -34, -3};
    private static final int $$f = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {59, -124, -78, 46, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -9, 5};
    private static final int $$n = 18;
    private static final byte[] $$a = {42, -104, -68, 105, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 62;
    private static int INotificationSideChannel = 1;
    private static int g = 0;
    private static int onTransact = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~(i7 | i);
        int i10 = i8 | i9;
        int i11 = ~i5;
        int i12 = (~((~i) | i7 | i5)) | (~(i7 | i11 | i));
        int i13 = i9 | (~(i11 | i2));
        int i14 = i2 + i5 + i3 + ((-1696018712) * i4) + (2108813197 * i6);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i2) - 2121662464) + (1221732374 * i5) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i3) + (39845888 * i4) + (227278848 * i6) + ((-1705377792) * i15);
        int i17 = ((i2 * 362004572) - 1408384217) + (i5 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i3 * 362004373) + (i4 * (-1290304248)) + (i6 * 155295761) + (i15 * (-60686336));
        int i18 = i16 + (i17 * i17 * (-1680474112));
        if (i18 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i18 == 2) {
            return b(objArr);
        }
        if (i18 != 3) {
            return i18 != 4 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
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
    private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity.$$a
            int r1 = 53 - r7
            int r5 = 145 - r5
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r5 = r5 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity.c(int, int, byte, java.lang.Object[]):void");
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
    private static void f(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity.$$m
            int r6 = r6 * 49
            int r6 = r6 + 4
            int r7 = r7 * 49
            int r1 = r7 + 1
            int r5 = 99 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + 3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity.f(short, int, int, java.lang.Object[]):void");
    }

    public NewPhoneVerificationActivity() {
        final NewPhoneVerificationActivity newPhoneVerificationActivity = this;
        this.b = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = newPhoneVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        Lazy lazy = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = newPhoneVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asInterface = lazy;
        this.g = ((PreferenceManager) lazy.getValue()).getString("OCR_TRANSACTION_ID", "");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/newregistration/NewPhoneVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) NewPhoneVerificationActivity.class);
            intent.putExtra("unregistered_data", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityPhoneVerificationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        NewPhoneVerificationActivity$bindingInflater$1 newPhoneVerificationActivity$bindingInflater$1 = NewPhoneVerificationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            return newPhoneVerificationActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final NewPhoneVerificationActivity newPhoneVerificationActivity = (NewPhoneVerificationActivity) objArr[0];
        int i = 2 % 2;
        newPhoneVerificationActivity.INotificationSideChannelStub().btnNext.setOnClickListener(new View.OnClickListener() { // from class: newThread
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, view);
            }
        });
        newPhoneVerificationActivity.INotificationSideChannelStub().tvPrefix.setOnClickListener(new View.OnClickListener() { // from class: createAsync
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        int i2 = g + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0232  */
    /* JADX WARN: Code duplicated, block: B:54:0x0233  */
    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        char c2;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            c2 = '0';
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(asInterface[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 2188, 39 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 841711447, false, $$i(b, b2, (byte) (b2 - 3)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(d), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33016), 3010 - MotionEvent.axisFromString(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, 321985076, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 3376, Gravity.getAbsoluteGravity(0, 0) + 17, -968507904, false, $$i(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i5 = $10 + 5;
                        $11 = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $10 + 81;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (36505 - TextUtils.indexOf("", "", 0));
                    int iGreen = 3376 - Color.green(0);
                    int iLastIndexOf = 16 - TextUtils.lastIndexOf("", c2, 0);
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iGreen, iLastIndexOf, -968507904, false, $$i(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b9 = (byte) 0;
                byte b10 = (byte) (b9 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 36505), 3375 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.getOffsetBefore("", 0) + 17, -968507904, false, $$i(b9, b10, (byte) (-b10)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            c2 = '0';
        }
        objArr[0] = new String(cArr);
        int i8 = $10 + 29;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = g + 91;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            throw null;
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        int i3 = onTransact + 59;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        NewPhoneVerificationActivity newPhoneVerificationActivity = this;
        ((setSplitTrack) this.b.getValue()).getInterfaceDescriptor.observe(newPhoneVerificationActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: executeOnMainThread
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.b.getValue()).INotificationSideChannelDefault.observe(newPhoneVerificationActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: FastSafeIterableMap
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewPhoneVerificationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.b.getValue()).IconCompatParcelizer.observe(newPhoneVerificationActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: putIfAbsent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) NewPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj}, 1154899836, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1154899836, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        }));
        int i2 = g + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        NewPhoneVerificationActivity newPhoneVerificationActivity = this;
        Intrinsics.checkNotNullParameter(newPhoneVerificationActivity, "");
        newPhoneVerificationActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_phone_number_verification));
        if (((RegistrationForUnregistered) this.TuitionPaymentFragmentbindingInflater1.getValue()) != null) {
            int i2 = onTransact + 1;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                INotificationSideChannelStub().tvEnterPhoneNumberInstruction.setText(getString(R.string.label_edit_phone_number_instruction));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            INotificationSideChannelStub().tvEnterPhoneNumberInstruction.setText(getString(R.string.label_edit_phone_number_instruction));
        }
        int i3 = onTransact + 9;
        g = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0338  */
    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iMyPid = (Process.myPid() >> 22) + 876;
            int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 141, b, (byte) (b | 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iMyPid, deadChar, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 115, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_credit_card_4).substring(1, 3).length() + 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step1).substring(0, 1).codePointAt(0) - 84), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ViewConfiguration.getPressedStateDuration() >> 16) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) View.getDefaultSize(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
            byte[] bArr = $$a;
            short s = (short) (-bArr[1]);
            byte b2 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(s, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, longPressTimeout, threadPriority, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "");
                int iAlpha = 876 - Color.alpha(0);
                int mode = View.MeasureSpec.getMode(0) + 10;
                short s2 = (short) ($$b & 245);
                byte b3 = $$a[7];
                Object[] objArr6 = new Object[1];
                c(s2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iAlpha, mode, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i5 = ~(430338840 | i4);
            int i6 = (((2103957608 + (((-532643676) | i5) * (-814))) + ((i5 | ((~((~i4) | 390028611)) | 287723776)) * 407)) + (((~(i4 | (-390028612))) | ((~((-430338841) | i4)) | 287723776)) * 407)) - 1031725191;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step1).substring(46, 48).length() + 35, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 15, (char) (TextUtils.lastIndexOf("", '0', 0) + 1526), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step4).substring(39, 42).codePointAt(1) - 47, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_kioson).substring(0, 6).codePointAt(3) - 97, (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if (baseContext instanceof ContextWrapper) {
                    int i9 = onTransact + 51;
                    g = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = baseContext.getApplicationContext();
                    } else {
                        baseContext = null;
                    }
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 70, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 61, 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (25341 - View.resolveSizeAndState(0, 0, 0)), objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1031725191};
                byte[] bArr2 = $$m;
                byte b4 = bArr2[35];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr13 = new Object[1];
                f(b5, b5, b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr2[35];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                f(b6, b7, (byte) (b7 - 1), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (baseContext != null) {
                    int i11 = g + 33;
                    onTransact = i11 % 128;
                    int i12 = i11 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                        int iIndexOf = 10 - TextUtils.indexOf("", "", 0);
                        short s3 = (short) ($$b & 245);
                        byte b8 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c(s3, b8, b8, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, iKeyCodeFromString, iIndexOf, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step4).substring(0, 1).length() - 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(((Process.getThreadPriority(0) + 20) >> 6) + 22, ((Process.getThreadPriority(0) + 20) >> 6) + 15, (char) TextUtils.getTrimmedLength(""), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int offsetAfter = 876 - TextUtils.getOffsetAfter("", 0);
                            int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte[] bArr3 = $$a;
                            short s4 = (short) (-bArr3[1]);
                            byte b9 = bArr3[7];
                            Object[] objArr19 = new Object[1];
                            c(s4, b9, b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, offsetAfter, fadingEdgeLength, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int iIndexOf2 = TextUtils.indexOf("", "") + 876;
                            int i13 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9;
                            byte b10 = $$a[7];
                            Object[] objArr20 = new Object[1];
                            c((short) 141, b10, (byte) (b10 | 15), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iIndexOf2, i13, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 != i14) {
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = g + 75;
        onTransact = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i19 = ~layoutDirection;
        int i20 = i18 + 445893241 + (((~((-225910927) | i19)) | (~(layoutDirection | (-185600698)))) * 333) + (((~(layoutDirection | (-225910927))) | (~(i19 | (-185600698)))) * 333);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[1])[0] = i22 ^ (i22 << 5);
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        int i23 = ((int[]) objArr21[1])[0];
        int i24 = ((i23 * i23) - (~(-(1670406091 * i23)))) - 1;
        int i25 = -(i23 * (-1695225723));
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        int i27 = (i26 ^ (-1109178816)) + (((-1109178816) & i26) << 1);
        int i28 = i27 >> 15;
        int i29 = ((i28 & (-262143)) + (i28 | (-262143))) / 131072;
        int i30 = (i29 & 1) + (i29 | 1);
        int i31 = (i27 ^ i30) + ((i30 & i27) << 1);
        int i32 = i27 >> 25;
        int i33 = ((i32 & (-255)) + (i32 | (-255))) / 128;
        int i34 = -((((i33 | 1) << 1) - (i33 ^ 1)) ^ i31);
        int i35 = ((i34 | 2) << 1) - (i34 ^ 2);
        int i36 = i35 >> 15;
        int i37 = (((i36 | (-262143)) << 1) - (i36 ^ (-262143))) / 131072;
        int i38 = (i37 ^ 1) + ((i37 & 1) << 1);
        Intrinsics.checkNotNullExpressionValue(materialButton, "5/26/29/30/31/btnNext".substring(19600 / (((-(((i38 | 1) << 1) - (i38 ^ 1))) & i35) * TypedValues.TransitionType.TYPE_DURATION)));
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = g + 73;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        int i3 = onTransact + 95;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 23 / 0;
        }
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        EditText editText = INotificationSideChannelStub().edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(editText, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(editText, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        int i2 = onTransact + 43;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    private final String INotificationSideChannel() {
        int i = 2 % 2;
        String strReplace$default = StringsKt.replace$default(StringsKt.trim((CharSequence) INotificationSideChannelStub().tvPrefix.getText().toString()).toString(), "+", "", false, 4, (Object) null);
        String string = StringsKt.trim((CharSequence) INotificationSideChannelStub().edtPhoneNumber.getText().toString()).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(strReplace$default);
        sb.append(string);
        String string2 = sb.toString();
        int i2 = g + 59;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return string2;
        }
        throw null;
    }

    @Subscribe(TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ThreadMode.MAIN)
    public final void onClosePageEvent(UseTorchAsFlash p0) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        d_();
        int i4 = g + 11;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
            throw null;
        }
        super.onDestroy();
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
        int i3 = g + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        NewPhoneVerificationActivity newPhoneVerificationActivity = (NewPhoneVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        newPhoneVerificationActivity.d_();
        int i4 = g + 93;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        int i2 = onTransact + 31;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int deadChar = 1031 - KeyEvent.getDeadChar(0, 0);
            int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
            short s = (short) ($$b & 245);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c(s, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, deadChar, iResolveSizeAndState, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 115, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_title).substring(18, 19).length() + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int iBlue = Color.blue(0) + 1031;
            int iAlpha = 15 - Color.alpha(0);
            byte[] bArr = $$a;
            short s2 = (short) (-bArr[1]);
            byte b2 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(s2, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, iBlue, iAlpha, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = g + 121;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr2[7], bArr2[5], (byte) ($$b & 245), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, doubleTapTimeout, offsetBefore, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ((1372410981 + (((~((-134258849) | iIdentityHashCode)) | 378539018) * (-756))) + (((~iIdentityHashCode) | (-134258849)) * 756)) - 645588242;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay).substring(1, 3).codePointAt(1) - 40, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_klik_bca).substring(1, 3).codePointAt(1) - 121), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_redirecting_to_shopee).substring(1, 2).length() + 96, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 25305), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1465697492};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 1135, TextUtils.lastIndexOf("", '0') + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -645588242, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int scrollBarFadeDuration = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int offsetBefore2 = 15 - TextUtils.getOffsetBefore("", 0);
                    short s3 = (short) ($$b & 245);
                    byte b3 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c(s3, b3, b3, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollBarFadeDuration, offsetBefore2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45993), ((byte) KeyEvent.getModifierMetaStateMask()) + 1118, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                    int keyRepeatDelay = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
                    byte[] bArr3 = $$a;
                    Object[] objArr13 = new Object[1];
                    c(bArr3[7], bArr3[5], (byte) ($$b & 245), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, keyRepeatDelay, touchSlop, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_alto).substring(1, 3).codePointAt(1) - 121, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_warning_text).substring(0, 22).codePointAt(16) - 75, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(View.MeasureSpec.getMode(0) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step3).substring(10, 11).length() + 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int iRed = 1031 - Color.red(0);
                        int bitsPerPixel2 = 14 - ImageFormat.getBitsPerPixel(0);
                        byte[] bArr4 = $$a;
                        short s4 = (short) (-bArr4[1]);
                        byte b4 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        c(s4, b4, b4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup, iRed, bitsPerPixel2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iMyPid = (Process.myPid() >> 22) + 1031;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                        short s5 = (short) ($$b & 245);
                        byte b5 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c(s5, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iMyPid, iMakeMeasureSpec, 1357589585, false, (String) objArr17[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            int i13 = onTransact + 105;
            g = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i18 = ~((int) Process.getElapsedCpuTime());
            int i19 = ~(150933775 | i18);
            int i20 = i15 + (-1305801987) + ((i19 | 93346394) * 764) + (((~(i18 | 93346394)) | 141492485) * (-1528)) + ((225397589 | i19) * 764);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
            int i23 = onTransact + 109;
            g = i23 % 128;
            int i24 = i23 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i25 = i12 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i25) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i29 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp) | 231393009);
            int i30 = i26 + ((218776193 | i29) * (-374)) + 38475839 + ((i29 | 12616816) * 374);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr19[2])[0] = i32 ^ (i32 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char offsetBefore3 = (char) (29944 - TextUtils.getOffsetBefore("", 0));
            int defaultSize = 1755 - View.getDefaultSize(0, 0);
            int i33 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            byte b6 = $$a[7];
            Object[] objArr20 = new Object[1];
            c((short) 141, b6, (byte) (b6 | 15), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetBefore3, defaultSize, i33, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c3 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                int mode = View.MeasureSpec.getMode(0) + 1755;
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
                byte[] bArr5 = $$a;
                short s6 = (short) (-bArr5[1]);
                byte b7 = bArr5[7];
                Object[] objArr21 = new Object[1];
                c(s6, b7, b7, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, mode, keyRepeatTimeout, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_done_step4).substring(20, 21).length() + 1888190169;
            int i34 = ~length;
            int i35 = ((1810995191 + (((~(224165679 | i34)) | (~((-436768106) | length))) * 210)) + (((~(length | 526188399)) | (~(i34 | (-134745386)))) * 210)) - 1169682230;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(81 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 16 - (KeyEvent.getMaxKeyCode() >> 16), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 86, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step3).substring(92, 93).length() + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima5).substring(12, 13).codePointAt(0) + 25233), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1465697492};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 42049), Color.green(0) + 1726, 29 - (KeyEvent.getMaxKeyCode() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1169682230, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1755;
                int mirror = 'G' - AndroidCharacter.getMirror('0');
                byte[] bArr6 = $$a;
                short s7 = (short) (-bArr6[1]);
                byte b8 = bArr6[7];
                Object[] objArr26 = new Object[1];
                c(s7, b8, b8, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(touchSlop2, iIndexOf, mirror, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e((-1) - MotionEvent.axisFromString(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_offers).substring(9, 10).length() - 1), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_done_step1).substring(92, 93).codePointAt(0) - 79, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                    int i38 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int keyRepeatTimeout2 = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    short s8 = $$a[7];
                    byte b9 = (byte) s8;
                    Object[] objArr29 = new Object[1];
                    c(s8, b9, b9, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollDefaultDelay2, i38, keyRepeatTimeout2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 29944);
                    int iIndexOf2 = 1755 - TextUtils.indexOf("", "", 0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 24;
                    byte b10 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c((short) 141, b10, (byte) (b10 | 15), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(size, iIndexOf2, packedPositionChild, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i39 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i40 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i40 == i39) {
            int i41 = onTransact + 117;
            g = i41 % 128;
            int i42 = i41 % 2;
            int i43 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i44 = ~startElapsedRealtime;
            int i45 = i43 + 1524817165 + (((~(startElapsedRealtime | (-250734486))) | (~((-286003275) | i44)) | 73400848) * (-68)) + ((~((-177333638) | i44)) * (-68)) + (((~(250734485 | i44)) | (-463336912)) * 68);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr31[3])[0] = i47 ^ (i47 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr5 != null) {
            for (String str2 : strArr5) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i40 / (((i40 - 1) * i40) % 2), 0).show();
        int i48 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i49 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i50 = i48 + 1720454822 + (((-4448257) | i49) * (-381)) + (((~((~i49) | (-4448779))) | 212603470) * 381) + 1694785536;
        int i51 = (i50 << 13) ^ i50;
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr32[3])[0] = i52 ^ (i52 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i3 != (((~(iIdentityHashCode | (-1647041723))) * TypedValues.CycleType.TYPE_EASING) - 1840302756) + (((~((~iIdentityHashCode) | (-1647041723))) | 277872961) * TypedValues.CycleType.TYPE_EASING)) {
                throw null;
            }
        } else {
            int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_alfamart).substring(0, 8).length() + 1537209149;
            if (i4 != (((-495259952) + (((-386957331) | (~length)) * (-490))) + (((~(length | 1217354733)) | (-1604312064)) * 490)) - 831362566) {
                throw null;
            }
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i6 = ~(2146131695 | iIdentityHashCode2);
        if (i5 != 2092146228 + ((27398154 | i6) * (-476)) + (i6 * 952) + ((~((~iIdentityHashCode2) | 2146131695)) * 476)) {
            int i7 = 205669982 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i8 = onTransact + 47;
        g = i8 % 128;
        int i9 = i8 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1156531127
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i6 = ~i5;
        int i7 = ~((-23616239) | i6);
        int i8 = ~(853603781 | i5);
        if (i4 != (-328519600) + ((i7 | i8) * 1150) + (((~((-853603782) | i6)) | i8) * (-575)) + (((~(i5 | (-23616239))) | (~(i6 | 23616238))) * 575)) {
            throw null;
        }
        int i9 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        if (i9 != (-683167236) + (((~(280339038 | i10)) | 1716018433 | (~((-1996250370) | i10))) * (-744)) + (((~i10) | 107102) * 744) + ((i10 | (-1716018434)) * 744)) {
            throw null;
        }
        super.onCreate(bundle);
        int i11 = onTransact + 61;
        g = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = g + 109;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = g + 119;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewPhoneVerificationActivity newPhoneVerificationActivity) {
        int i = 2 % 2;
        int i2 = g + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newPhoneVerificationActivity.getIntent().getParcelableExtra("registration_data");
        int i4 = g + 91;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return registeredMemberRegistration;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewPhoneVerificationActivity newPhoneVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = g + 1;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                newPhoneVerificationActivity.MediaBrowserCompat();
                int i3 = 58 / 0;
            } else {
                newPhoneVerificationActivity.MediaBrowserCompat();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = onTransact + 41;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                newPhoneVerificationActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            } else {
                newPhoneVerificationActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
            int i5 = onTransact + 109;
            g = i5 % 128;
            int i6 = i5 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i7 = onTransact + 27;
            g = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newPhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            if (registrationForUnregistered != null) {
                RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, newPhoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
                NewRegistrationVerifyPhoneOtpActivity.Companion companion = NewRegistrationVerifyPhoneOtpActivity.INSTANCE;
                NewRegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newPhoneVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                newPhoneVerificationActivity.d_();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final NewPhoneVerificationActivity newPhoneVerificationActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getItemView.Companion companion = getItemView.INSTANCE;
            getItemView getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getItemView.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2, new Function1() { // from class: DefaultTaskExecutorApi28Impl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (CodeNamePair) obj);
                }
            });
            FragmentManager supportFragmentManager = newPhoneVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = g + 1;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i3 = g + 107;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        RegistrationForUnregistered registrationForUnregistered;
        RegisteredMemberRegistration registeredMemberRegistration;
        NewPhoneVerificationActivity newPhoneVerificationActivity = (NewPhoneVerificationActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = g + 111;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i3 + 107;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                newPhoneVerificationActivity.MediaBrowserCompat();
                throw null;
            }
            newPhoneVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i6 = i3 + 57;
            g = i6 % 128;
            int i7 = i6 % 2;
            newPhoneVerificationActivity.IconCompatParcelizer();
            if (((RegisteredMemberRegistration) newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null && (registeredMemberRegistration = (RegisteredMemberRegistration) newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, newPhoneVerificationActivity.INotificationSideChannel(), null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, null, null, null, null, null, null, null, null, 8380159);
                NewRegistrationVerifyPhoneOtpActivity.Companion companion = NewRegistrationVerifyPhoneOtpActivity.INSTANCE;
                NewRegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentbindingInflater1(newPhoneVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            if (((RegistrationForUnregistered) newPhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()) != null && (registrationForUnregistered = (RegistrationForUnregistered) newPhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()) != null) {
                RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, newPhoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
                NewRegistrationVerifyPhoneOtpActivity.Companion companion2 = NewRegistrationVerifyPhoneOtpActivity.INSTANCE;
                NewRegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newPhoneVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            newPhoneVerificationActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
            String string2 = newPhoneVerificationActivity.getString(R.string.error_phone_number_not_match);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                String string3 = newPhoneVerificationActivity.getString(R.string.title_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = newPhoneVerificationActivity.getString(R.string.message_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = newPhoneVerificationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: SafeIterableMap
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NewPhoneVerificationActivity.cancelAll();
                    }
                }, 96);
                FragmentManager supportFragmentManager = newPhoneVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i8 = g + 69;
                    onTransact = i8 % 128;
                    if (i8 % 2 == 0) {
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        throw null;
                    }
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newPhoneVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                int i9 = g + 95;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0049 A[PHI: r1
  0x0049: PHI (r1v10 android.widget.TextView) = (r1v6 android.widget.TextView), (r1v13 android.widget.TextView) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003e A[PHI: r1
  0x003e: PHI (r1v7 android.widget.TextView) = (r1v6 android.widget.TextView), (r1v13 android.widget.TextView) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewPhoneVerificationActivity newPhoneVerificationActivity, CodeNamePair codeNamePair) {
        TextView textView;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 37;
        g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        if (i4 != 0) {
            newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = codeNamePair;
            textView = newPhoneVerificationActivity.INotificationSideChannelStub().tvPhoneExample;
            int i5 = 42 / 0;
            if (Intrinsics.areEqual(codeNamePair.b, "+62")) {
                int i6 = onTransact + 125;
                g = i6 % 128;
                int i7 = i6 % 2;
                i = 0;
            } else {
                i = 8;
            }
        } else {
            newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = codeNamePair;
            textView = newPhoneVerificationActivity.INotificationSideChannelStub().tvPhoneExample;
            if (Intrinsics.areEqual(codeNamePair.b, "+62")) {
                int i8 = onTransact + 125;
                g = i8 % 128;
                int i9 = i8 % 2;
                i = 0;
            } else {
                i = 8;
            }
        }
        textView.setVisibility(i);
        newPhoneVerificationActivity.INotificationSideChannelStub().tvPrefix.setText(codeNamePair.b);
        Unit unit = Unit.INSTANCE;
        int i10 = onTransact + 47;
        g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 61 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0077 A[Catch: all -> 0x0192, TRY_ENTER, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0086 A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e7 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00fe A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    /* JADX WARN: Code duplicated, block: B:36:0x0106  */
    /* JADX WARN: Code duplicated, block: B:38:0x0111 A[Catch: all -> 0x0192, TRY_ENTER, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x011c A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x015b  */
    /* JADX WARN: Code duplicated, block: B:44:0x015d A[Catch: all -> 0x0192, TRY_ENTER, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0169 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0177 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0063 A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0011, B:6:0x0050, B:47:0x0177, B:48:0x018e, B:8:0x0063, B:13:0x0077, B:15:0x0086, B:22:0x0099, B:24:0x009c, B:26:0x00ab, B:28:0x00c0, B:29:0x00e7, B:30:0x00f4, B:32:0x00fe, B:34:0x0102, B:38:0x0111, B:40:0x011c, B:44:0x015d, B:45:0x0168, B:46:0x0169), top: B:53:0x0011 }] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewPhoneVerificationActivity newPhoneVerificationActivity, View view) {
        int length;
        RegisteredMemberRegistration registeredMemberRegistration;
        Object obj;
        String str;
        PhoneVerificationRequest phoneVerificationRequest;
        RegisteredMemberRegistration registeredMemberRegistration2;
        MembershipType membershipType;
        int i;
        RegisteredMemberRegistration registeredMemberRegistration3;
        int i2;
        RegistrationForUnregistered registrationForUnregistered;
        int i3;
        int i4 = 2 % 2;
        int i5 = onTransact + 117;
        g = i5 % 128;
        int i6 = i5 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            String string = StringsKt.trim((CharSequence) newPhoneVerificationActivity.INotificationSideChannelStub().edtPhoneNumber.getText().toString()).toString();
            String str2 = "";
            if (Intrinsics.areEqual(StringsKt.trim((CharSequence) newPhoneVerificationActivity.INotificationSideChannelStub().tvPrefix.getText().toString()).toString(), "+62")) {
                Intrinsics.checkNotNullParameter(string, "");
                if (new Regex("^(?![01234579]|61|6[23456789]|60|0[1-7]|09)\\d{9,14}$").matches(string)) {
                    length = string.length();
                    if (4 <= length) {
                        int i7 = onTransact + 47;
                        g = i7 % 128;
                        int i8 = i7 % 2;
                        if (length < 16) {
                            String strINotificationSideChannel = newPhoneVerificationActivity.INotificationSideChannel();
                            registeredMemberRegistration = (RegisteredMemberRegistration) newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                            obj = null;
                            if (registeredMemberRegistration != null) {
                                str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                i3 = g + 17;
                                onTransact = i3 % 128;
                                if (i3 % 2 == 0) {
                                    int i9 = 69 / 0;
                                }
                            } else {
                                str2 = str;
                            }
                            phoneVerificationRequest = new PhoneVerificationRequest(strINotificationSideChannel, str2);
                            if (((RegistrationForUnregistered) newPhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()) != null) {
                                registrationForUnregistered = (RegistrationForUnregistered) newPhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                Intrinsics.checkNotNull(registrationForUnregistered);
                                if (Intrinsics.areEqual(registrationForUnregistered.IconCompatParcelizer, "cross_selling")) {
                                    String strINotificationSideChannel2 = newPhoneVerificationActivity.INotificationSideChannel();
                                    RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) newPhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                    Intrinsics.checkNotNull(registrationForUnregistered2);
                                    ((setSplitTrack) newPhoneVerificationActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new PhoneVerificationRequestAuth(strINotificationSideChannel2, String.valueOf(registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                                } else {
                                    ((setSplitTrack) newPhoneVerificationActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationRequest);
                                }
                            } else {
                                registeredMemberRegistration2 = (RegisteredMemberRegistration) newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                                if (registeredMemberRegistration2 != null) {
                                    membershipType = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                } else {
                                    membershipType = null;
                                }
                                if (membershipType == MembershipType.PMI) {
                                    i = g + 119;
                                    onTransact = i % 128;
                                    if (i % 2 != 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    registeredMemberRegistration3 = (RegisteredMemberRegistration) newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                                    if (registeredMemberRegistration3 != null) {
                                        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration3, null, null, null, null, null, null, null, null, newPhoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388351);
                                        RegistrationPasswordActivity.Companion companion = RegistrationPasswordActivity.INSTANCE;
                                        RegistrationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newPhoneVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                    i2 = onTransact + 57;
                                    g = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        int i10 = 2 / 4;
                                    }
                                } else {
                                    ((setSplitTrack) newPhoneVerificationActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(newPhoneVerificationActivity.g, phoneVerificationRequest);
                                }
                            }
                        } else {
                            String string2 = newPhoneVerificationActivity.getString(R.string.error_format_phone_number);
                            Intrinsics.checkNotNullExpressionValue(string2, "");
                            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
                        }
                    } else {
                        String string3 = newPhoneVerificationActivity.getString(R.string.error_format_phone_number);
                        Intrinsics.checkNotNullExpressionValue(string3, "");
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 0).show();
                    }
                } else {
                    String string4 = newPhoneVerificationActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string4, 0).show();
                }
            } else {
                length = string.length();
                if (4 <= length) {
                    int i11 = onTransact + 47;
                    g = i11 % 128;
                    int i12 = i11 % 2;
                    if (length < 16) {
                        String strINotificationSideChannel3 = newPhoneVerificationActivity.INotificationSideChannel();
                        registeredMemberRegistration = (RegisteredMemberRegistration) newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                        obj = null;
                        if (registeredMemberRegistration != null) {
                            str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            i3 = g + 17;
                            onTransact = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i13 = 69 / 0;
                            }
                        } else {
                            str2 = str;
                        }
                        phoneVerificationRequest = new PhoneVerificationRequest(strINotificationSideChannel3, str2);
                        if (((RegistrationForUnregistered) newPhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()) != null) {
                            registrationForUnregistered = (RegistrationForUnregistered) newPhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                            Intrinsics.checkNotNull(registrationForUnregistered);
                            if (Intrinsics.areEqual(registrationForUnregistered.IconCompatParcelizer, "cross_selling")) {
                                String strINotificationSideChannel4 = newPhoneVerificationActivity.INotificationSideChannel();
                                RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) newPhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                Intrinsics.checkNotNull(registrationForUnregistered3);
                                ((setSplitTrack) newPhoneVerificationActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new PhoneVerificationRequestAuth(strINotificationSideChannel4, String.valueOf(registrationForUnregistered3.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                            } else {
                                ((setSplitTrack) newPhoneVerificationActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationRequest);
                            }
                        } else {
                            registeredMemberRegistration2 = (RegisteredMemberRegistration) newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                            if (registeredMemberRegistration2 != null) {
                                membershipType = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            } else {
                                membershipType = null;
                            }
                            if (membershipType == MembershipType.PMI) {
                                i = g + 119;
                                onTransact = i % 128;
                                if (i % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                registeredMemberRegistration3 = (RegisteredMemberRegistration) newPhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                                if (registeredMemberRegistration3 != null) {
                                    RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault4 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration3, null, null, null, null, null, null, null, null, newPhoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388351);
                                    RegistrationPasswordActivity.Companion companion2 = RegistrationPasswordActivity.INSTANCE;
                                    RegistrationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newPhoneVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                }
                                i2 = onTransact + 57;
                                g = i2 % 128;
                                if (i2 % 2 != 0) {
                                    int i14 = 2 / 4;
                                }
                            } else {
                                ((setSplitTrack) newPhoneVerificationActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(newPhoneVerificationActivity.g, phoneVerificationRequest);
                            }
                        }
                    } else {
                        String string5 = newPhoneVerificationActivity.getString(R.string.error_format_phone_number);
                        Intrinsics.checkNotNullExpressionValue(string5, "");
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string5, 0).show();
                    }
                } else {
                    String string6 = newPhoneVerificationActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string6, 0).show();
                }
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static /* synthetic */ Unit b(NewPhoneVerificationActivity newPhoneVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i;
        RegistrationForUnregistered registrationForUnregistered;
        VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String string;
        String string2;
        getStringOrNull getstringornullB;
        FragmentManager supportFragmentManager;
        int i2;
        int i3 = 2 % 2;
        int i4 = onTransact + 75;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                newPhoneVerificationActivity.MediaBrowserCompat();
                i = g + 67;
                onTransact = i % 128;
                if (i % 2 == 0) {
                    int i6 = 4 % 4;
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newPhoneVerificationActivity.IconCompatParcelizer();
                tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                string2 = newPhoneVerificationActivity.getString(R.string.error_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string3 = newPhoneVerificationActivity.getString(R.string.title_phone_number_not_match);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    String string4 = newPhoneVerificationActivity.getString(R.string.message_phone_number_not_match);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String string5 = newPhoneVerificationActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: iteratorWithAdditions
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewPhoneVerificationActivity.g();
                        }
                    }, 96);
                    supportFragmentManager = newPhoneVerificationActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        i2 = onTransact + 85;
                        g = i2 % 128;
                        if (i2 % 2 != 0) {
                            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            int i7 = 7 / 0;
                        } else {
                            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                    int i8 = g + 21;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newPhoneVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                }
            } else if ((virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) && (registrationForUnregistered = (RegistrationForUnregistered) newPhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()) != null) {
                RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, newPhoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
                NewRegistrationVerifyPhoneOtpActivity.Companion companion2 = NewRegistrationVerifyPhoneOtpActivity.INSTANCE;
                NewRegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newPhoneVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                newPhoneVerificationActivity.d_();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newPhoneVerificationActivity.MediaBrowserCompat();
            i = g + 67;
            onTransact = i % 128;
            if (i % 2 == 0) {
                int i10 = 4 % 4;
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            newPhoneVerificationActivity.IconCompatParcelizer();
            tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
            string2 = newPhoneVerificationActivity.getString(R.string.error_phone_number_not_match);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                String string6 = newPhoneVerificationActivity.getString(R.string.title_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                String string7 = newPhoneVerificationActivity.getString(R.string.message_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                String string8 = newPhoneVerificationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string8, "");
                getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string6, string7, string8, new Function0() { // from class: iteratorWithAdditions
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NewPhoneVerificationActivity.g();
                    }
                }, 96);
                supportFragmentManager = newPhoneVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    i2 = onTransact + 85;
                    g = i2 % 128;
                    if (i2 % 2 != 0) {
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        int i11 = 7 / 0;
                    } else {
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                int i12 = g + 21;
                onTransact = i12 % 128;
                int i13 = i12 % 2;
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newPhoneVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault4 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, newPhoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
            NewRegistrationVerifyPhoneOtpActivity.Companion companion4 = NewRegistrationVerifyPhoneOtpActivity.INSTANCE;
            NewRegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newPhoneVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            newPhoneVerificationActivity.d_();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        NewPhoneVerificationActivity newPhoneVerificationActivity = (NewPhoneVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 113;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return (RegistrationForUnregistered) newPhoneVerificationActivity.getIntent().getParcelableExtra("unregistered_data");
        }
        throw null;
    }

    public static /* synthetic */ Unit cancelAll() {
        int i = 2 % 2;
        int i2 = g + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = g + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewPhoneVerificationActivity newPhoneVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{newPhoneVerificationActivity, virtualCameraAdapter1}, 1154899836, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1154899836, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentbindingInflater1(NewPhoneVerificationActivity newPhoneVerificationActivity) {
        return (RegistrationForUnregistered) TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{newPhoneVerificationActivity}, 947300916, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -947300912, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static {
        cancel = 0;
        onTransact();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 17;
        cancel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 25;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
        int i5 = i2 + 83;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_phone_verification;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, -2964172, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzg.TuitionPaymentFragmentbindingInflater1(), 2964175, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzg.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, -1993700756, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzg.TuitionPaymentFragmentbindingInflater1(), 1993700758, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzg.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 1754816570, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1754816569, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 1316046314);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    static void onTransact() {
        asInterface = new char[]{45565, 10692, 33172, 31052, 53547, 18683, 8380, 39112, 28739, 59401, 17326, 15261, 37741, 2897, 58140, 23251, 12945, 43593, 572, 65009, 21959, 52633, 45561, 10694, 33169, 31054, 53559, 18679, 8380, 39092, 28745, 59419, 17388, 15290, 37757, 2895, 58125, 46088, 11313, 33889, 31929, 54494, 19726, 9545, 40253, 30136, 60927, 17925, 15893, 38560, 3764, 59113, 24362, 14207, 44950, 2001, 63506, 20485, 51311, 41151, 6358, 61720, 26955, 45567, 10719, 33154, 31052, 53537, 18684, Typography.euro, 39079, 28764, 59402, 17388, 15271, 37751, 2883, 58140, 23263, 12947, 43620, 45558, 10699, 33158, 31071, 53610, 18686, 8377, 39048, 28747, 59476, 17363, 15287, 37735, 2902, 58125, 23259, 54024, 19251, 58216, 7085, 46029, 10758, 16977, 64098, 4761, 35558, 8462, 22875, 61866, 27056, 33265, 14382};
        d = -2960595890277635670L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 51;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = 115 - r7
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity.$$c
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r8 = r8 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewPhoneVerificationActivity.$$i(int, int, byte):java.lang.String");
    }
}
