package com.bpjstku.presentation.membership.registration.newregistration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.databinding.ActivityRegistrationVerifyPhoneOtpBinding;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.fido.zzah;
import com.google.android.libraries.places.internal.zzbgc;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.BrowserActionItem;
import defpackage.BufferProviderState;
import defpackage.CameraUseCaseAdapter;
import defpackage.IntegerRes;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.buildCustomTabsIntent;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deriveCodec;
import defpackage.getCameraCharacteristic;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSticky;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
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
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0007\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u0017\u0010\b\u001a\u0004\u0018\u00010\u000f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u0015\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0015\u0010\u001f\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0015\u0010\u001e\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0015\u0010\u0019\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0015\u0010\t\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010%R\u0014\u0010\u000e\u001a\u00020&8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010'"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/newregistration/NewRegistrationVerifyPhoneOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationVerifyPhoneOtpBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "Lcom/bpjstku/data/otpverification/model/response/OtpVerificationResponse;", "p0", "(Lcom/bpjstku/data/otpverification/model/response/OtpVerificationResponse;)V", "asInterface", "asBinder", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "(Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V", "onResume", "onStop", "onDestroy", "onBackPressed", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "", "d", "Ljava/lang/String;", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;", "LsetSplitTrack;", "g", "TuitionPaymentFragmentbindingInflater1", "LisSticky;", "Lcom/bpjstku/data/lib/PreferenceManager;", "LIntegerRes;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewRegistrationVerifyPhoneOtpActivity extends BindingBaseActivity<ActivityRegistrationVerifyPhoneOtpBinding> {
    private static int asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private getCameraCharacteristic TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: HintConstants
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: enqueue
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {83, -90, 68, -23};
    private static final int $$f = 108;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {49, 84, -120, 101, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 254;
    private static int notify = 0;
    private static int INotificationSideChannel = 0;
    private static int cancel = 1;

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

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~(i8 | i2)) | i7;
        int i10 = (~(i7 | (~i2) | i4)) | (~(i8 | i7 | i2));
        int i11 = (~(i2 | i4)) | (~(i6 | i4));
        int i12 = i6 + i4 + i5 + ((-1520811122) * i3) + (1880343047 * i);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i6) - 1254686720) + (875799021 * i4) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i5) + ((-206831616) * i3) + (408289280 * i) + ((-683737088) * i13);
        int i15 = ((i6 * (-660833811)) - 1995073173) + (i4 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i5 * (-660833671)) + (i3 * 644061726) + (i * (-2012083377)) + (i13 * (-1027145728));
        int i16 = i14 + (i15 * i15 * 814809088);
        if (i16 == 1) {
            return b(objArr);
        }
        if (i16 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i16 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i16 != 4) {
            return i16 != 5 ? TuitionPaymentFragmentbindingInflater1(objArr) : a(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r5 = r5 * 14
            int r5 = r5 + 84
            byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.$$a
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L28
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
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
        L28:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/newregistration/NewRegistrationVerifyPhoneOtpActivity$b;", "", "<init>", "()V", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentbindingInflater1", "(Lcom/nbs/nucleosnucleo/presentation/BaseActivity;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V", "Landroid/content/Context;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(BaseActivity p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) NewRegistrationVerifyPhoneOtpActivity.class);
            intent.putExtra("registration_data", p1);
            p0.startActivityForResult(intent, 101);
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) NewRegistrationVerifyPhoneOtpActivity.class);
            intent.putExtra("unregistered_data", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NewRegistrationVerifyPhoneOtpActivity() {
        final NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = newRegistrationVerifyPhoneOtpActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setSplitTrack.class);
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
        this.g = LazyKt.lazy(new Function0<isSticky>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, isSticky] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ isSticky invoke() {
                LifecycleOwner lifecycleOwner = newRegistrationVerifyPhoneOtpActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(isSticky.class);
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
        final NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity2 = this;
        this.d = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = newRegistrationVerifyPhoneOtpActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.a = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = newRegistrationVerifyPhoneOtpActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegistrationVerifyPhoneOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancel + 9;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        NewRegistrationVerifyPhoneOtpActivity$bindingInflater$1 newRegistrationVerifyPhoneOtpActivity$bindingInflater$1 = NewRegistrationVerifyPhoneOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = INotificationSideChannel + 79;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return newRegistrationVerifyPhoneOtpActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding = (ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityRegistrationVerifyPhoneOtpBinding.otpVerify.setOtpCompletionListener(new BrowserActionItem(activityRegistrationVerifyPhoneOtpBinding, this));
        OtpView otpView = activityRegistrationVerifyPhoneOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getIconId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (String) obj);
            }
        }));
        activityRegistrationVerifyPhoneOtpBinding.btnVerification.setOnClickListener(new View.OnClickListener() { // from class: getRunnableAction
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        activityRegistrationVerifyPhoneOtpBinding.btnChangePhone.setOnClickListener(new View.OnClickListener() { // from class: BrowserActionsFallbackMenuAdapter1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationVerifyPhoneOtpActivity.b(this.b, view);
            }
        });
        activityRegistrationVerifyPhoneOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: releaseRequest
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {activityRegistrationVerifyPhoneOtpBinding, this, view};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, -786523106, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 786523107);
            }
        });
        int i2 = INotificationSideChannel + 59;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0176  */
    /* JADX WARN: Code duplicated, block: B:33:0x0177  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(asInterface)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 3291, ((Process.getThreadPriority(0) + 20) >> 6) + 31, 1199271174, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 651, 44 - (ViewConfiguration.getLongPressTimeout() >> 16), -450685997, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i7 = $11 + 71;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i9 = $11 + 101;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - Process.getGidForName("")), 651 - (Process.myPid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 44, -450685997, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            int i11 = $11 + 83;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getCameraCharacteristic(((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, 0 == true ? 1 : 0);
        int i2 = INotificationSideChannel + 7;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity = (NewRegistrationVerifyPhoneOtpActivity) objArr[0];
        int i = 2 % 2;
        NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity2 = newRegistrationVerifyPhoneOtpActivity;
        ((setSplitTrack) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue()).IconCompatParcelizer.observe(newRegistrationVerifyPhoneOtpActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: AsyncLayoutInflaterInflateThread
            private static final byte[] $$c = {119, -102, -34, -3};
            private static final int $$d = 186;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {58, -103, 118, 14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 122;
            private static int asInterface = 0;
            private static int g = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47331, 47382, 47328, 47378, 47381, 47387, 47318, 47377, 47345, 47371, 47376, 47391, 47383, 47297, 47384, 47329, 47385, 47380, 47346};
            private static int b = 2047719556;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r5 = r5 * 52
                    int r5 = 56 - r5
                    byte[] r0 = defpackage.AsyncLayoutInflaterInflateThread.$$a
                    int r1 = r6 + 1
                    int r7 = r7 * 14
                    int r7 = r7 + 84
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r5
                    r7 = r6
                    r4 = r2
                    goto L27
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L25
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L25:
                    r3 = r0[r5]
                L27:
                    int r5 = r5 + 1
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AsyncLayoutInflaterInflateThread.a(byte, byte, byte, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr2;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                int i3 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                    int threadPriority = 651 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int iIndexOf = 44 - TextUtils.indexOf("", "");
                    byte[] bArr = $$a;
                    Object[] objArr3 = new Object[1];
                    a(bArr[80], (byte) 52, bArr[7], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, threadPriority, iIndexOf, -459846511, false, (String) objArr3[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr4 = new Object[1];
                c(null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                c(null, null, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    int keyRepeatTimeout = 651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    a(b2, b2, bArr2[80], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, keyRepeatTimeout, i4, -873460649, false, (String) objArr6[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i5 = g + 35;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int iResolveOpacity = 651 - Drawable.resolveOpacity(0, 0);
                        int jumpTapTimeout = 44 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b3 = $$a[7];
                        byte b4 = b3;
                        Object[] objArr7 = new Object[1];
                        a(b4, (byte) (b4 | 37), b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, iResolveOpacity, jumpTapTimeout, -1595579076, false, (String) objArr7[0], null);
                    }
                    Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i7 = ((int[]) objArr8[2])[0];
                    int i8 = ((int[]) objArr8[0])[0];
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i9 = ((((-1286553375) + ((130935418 | iUptimeMillis) * 376)) + (((~((~iUptimeMillis) | 606151434)) | 63752304) * (-376))) + (((~(iUptimeMillis | (-606151435))) | (-602720625)) * 376)) - 1259459953;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr2[3])[0] = i11 ^ (i11 << 5);
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 1611 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Color.blue(0) + 26, 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1259459953, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 651;
                            int i12 = 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr3 = $$a;
                            byte b5 = bArr3[7];
                            Object[] objArr10 = new Object[1];
                            a(b5, b5, bArr3[80], objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, edgeSlop, i12, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getCapsMode("", 0, 0) + 695, TextUtils.getOffsetBefore("", 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (Process.myPid() >> 22)), 794 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                        }
                        Object[] objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 651;
                            int size2 = 44 - View.MeasureSpec.getSize(0);
                            byte b6 = $$a[7];
                            byte b7 = b6;
                            Object[] objArr12 = new Object[1];
                            a(b7, (byte) (b7 | 37), b6, objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, deadChar, size2, -1595579076, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr11);
                        try {
                            Object[] objArr13 = new Object[1];
                            c(null, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr13);
                            Class<?> cls2 = Class.forName((String) objArr13[0]);
                            Object[] objArr14 = new Object[1];
                            c(null, null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr14);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                int i13 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 650;
                                int keyRepeatTimeout2 = 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte[] bArr4 = $$a;
                                byte b8 = bArr4[7];
                                Object[] objArr15 = new Object[1];
                                a(b8, b8, bArr4[80], objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetBefore, i13, keyRepeatTimeout2, -873460649, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 652;
                                int offsetAfter = 44 - TextUtils.getOffsetAfter("", 0);
                                byte[] bArr5 = $$a;
                                Object[] objArr16 = new Object[1];
                                a(bArr5[80], (byte) 52, bArr5[7], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(fadingEdgeLength, iIndexOf2, offsetAfter, -459846511, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                            objArr2 = objArr11;
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
                if (((int[]) objArr2[2])[0] != ((int[]) objArr2[0])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr2[1];
                    if (strArr != null) {
                        int i14 = asInterface + 71;
                        while (true) {
                            g = i14 % 128;
                            int i15 = i14 % 2;
                            if (i3 >= strArr.length) {
                                break;
                            }
                            arrayList.add(strArr[i3]);
                            i3++;
                            i14 = asInterface + 17;
                        }
                    }
                    throw null;
                }
                Object[] objArr17 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i16 = ((int[]) objArr2[3])[0];
                int i17 = ((int[]) objArr2[2])[0];
                int i18 = ((int[]) objArr2[0])[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i19 = i16 + ((((-1972715175) + (((~(641426290 | iIdentityHashCode)) | 4496396) * 576)) + (((~((~iIdentityHashCode) | 645922686)) | 640360704) * 576)) - 1705043200);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr17[3])[0] = i21 ^ (i21 << 5);
                int i22 = g + 103;
                asInterface = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 4 / 3;
                }
                return NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }

            private static void c(char[] cArr, int[] iArr, int i2, byte[] bArr, Object[] objArr2) throws Throwable {
                int i3 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i4 = 0;
                if (cArr2 != null) {
                    int i5 = $11 + 59;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr3 = new Object[1];
                            objArr3[i4] = Integer.valueOf(cArr2[i7]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i4;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 31340), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2993, 17 - TextUtils.getCapsMode("", i4, i4), 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                            i7++;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i8 = $10 + 97;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "", 0, 0) + 253, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).intValue();
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i10 = $10 + 97;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i2] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.green(0) + 33602), TextUtils.getTrimmedLength("") + 3085, 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -2146875848, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5);
                    }
                    objArr2[0] = new String(cArr4);
                    return;
                }
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i2] - iIntValue);
                        Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ((Process.getThreadPriority(0) + 20) >> 6) + 3085, TextUtils.indexOf("", "", 0) + 26, -2146875848, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                    }
                    objArr2[0] = new String(cArr5);
                    return;
                }
                int i12 = 0;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr2[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i2] - iIntValue);
                        i12 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, int r7, byte r8) {
                /*
                    int r8 = r8 * 3
                    int r0 = r8 + 1
                    int r7 = 68 - r7
                    byte[] r1 = defpackage.AsyncLayoutInflaterInflateThread.$$c
                    int r6 = r6 * 4
                    int r6 = 3 - r6
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r4 = r7
                    r3 = r2
                    r7 = r6
                    goto L2a
                L15:
                    r3 = r2
                L16:
                    int r6 = r6 + 1
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L23:
                    r4 = r1[r6]
                    int r3 = r3 + 1
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L2a:
                    int r6 = r6 + r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AsyncLayoutInflaterInflateThread.$$e(byte, int, byte):java.lang.String");
            }
        }));
        ((isSticky) newRegistrationVerifyPhoneOtpActivity.g.getValue()).TuitionPaymentFragmentbindingInflater1.observe(newRegistrationVerifyPhoneOtpActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: AsyncLayoutInflaterOnInflateFinishedListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (Unit) NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr2, 1719842163, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1719842159);
            }
        }));
        ((isSticky) newRegistrationVerifyPhoneOtpActivity.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(newRegistrationVerifyPhoneOtpActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: generateSmsOtpHintForCharacterPosition
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) newRegistrationVerifyPhoneOtpActivity.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(newRegistrationVerifyPhoneOtpActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: onInflateFinished
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = INotificationSideChannel + 93;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void b(OtpVerificationResponse p0) {
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 2 % 2;
        int i2 = cancel + 75;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String str = null;
        if (registeredMemberRegistration != null) {
            registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, null, null, null, p0.getCheckSum(), null, null, null, null, null, null, null, null, null, 8380415);
            int i4 = INotificationSideChannel + 59;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        Object obj = StringsKt.split$default((CharSequence) p0.getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str = str2;
        }
        if (!Intrinsics.areEqual(obj, str)) {
            String string = getString(R.string.error_signature_checking);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(this, string, "Coba Kembali", new Function0() { // from class: Rxml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    return (Unit) NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, 1355075260, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1355075255);
                }
            });
            return;
        }
        int i6 = INotificationSideChannel + 31;
        cancel = i6 % 128;
        if (i6 % 2 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i7 = 27 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        getCameraCharacteristic getcameracharacteristic;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 7;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            ((IntegerRes) this.a.getValue()).b();
            getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = 28 / 0;
            if (getcameracharacteristic == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = cancel + 39;
                INotificationSideChannel = i4 % 128;
                int i5 = i4 % 2;
                getcameracharacteristic = null;
            }
        } else {
            ((IntegerRes) this.a.getValue()).b();
            getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (getcameracharacteristic == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = cancel + 39;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
                getcameracharacteristic = null;
            }
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        String str;
        NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity = (NewRegistrationVerifyPhoneOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 13;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity2 = newRegistrationVerifyPhoneOtpActivity;
        Intrinsics.checkNotNullParameter(newRegistrationVerifyPhoneOtpActivity2, "");
        newRegistrationVerifyPhoneOtpActivity2.getWindow().addFlags(8192);
        newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(newRegistrationVerifyPhoneOtpActivity.getString(R.string.label_string_null));
        TextView textView = ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvPhoneNumber;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        Object obj = null;
        if (registeredMemberRegistration == null || (str = registeredMemberRegistration.g) == null) {
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationVerifyPhoneOtpActivity.b.getValue();
            if (registrationForUnregistered != null) {
                int i4 = cancel + 53;
                INotificationSideChannel = i4 % 128;
                if (i4 % 2 != 0) {
                    String str2 = registrationForUnregistered.TuitionPaymentFragmentbindingInflater1;
                    obj.hashCode();
                    throw null;
                }
                str = registrationForUnregistered.TuitionPaymentFragmentbindingInflater1;
            } else {
                str = null;
            }
        }
        int i5 = INotificationSideChannel + 121;
        cancel = i5 % 128;
        int i6 = i5 % 2;
        textView.setText(str);
        int i7 = cancel + 35;
        INotificationSideChannel = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegisteredMemberRegistration p0) {
        int i = 2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        Object obj = null;
        if (registeredMemberRegistration != null) {
            int i2 = INotificationSideChannel + 25;
            cancel = i2 % 128;
            if (i2 % 2 == 0) {
                MembershipType membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                obj.hashCode();
                throw null;
            }
            MembershipType membershipType2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (((RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
            Intent intent = new Intent();
            intent.putExtra("registration_data_verify", p0);
            setResult(-1, intent);
            finish();
        }
        if (((RegistrationForUnregistered) this.b.getValue()) != null) {
            int i3 = INotificationSideChannel + 83;
            cancel = i3 % 128;
            if (i3 % 2 == 0) {
                NonSalariedWorkerConfirmationActivity.Companion tuitionPaymentFragmentbindingInflater1 = NonSalariedWorkerConfirmationActivity.INSTANCE;
                NonSalariedWorkerConfirmationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, (RegistrationForUnregistered) this.b.getValue());
                d_();
                int i4 = 36 / 0;
            } else {
                NonSalariedWorkerConfirmationActivity.Companion tuitionPaymentFragmentbindingInflater2 = NonSalariedWorkerConfirmationActivity.INSTANCE;
                NonSalariedWorkerConfirmationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, (RegistrationForUnregistered) this.b.getValue());
                d_();
            }
            int i5 = INotificationSideChannel + 47;
            cancel = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 4;
            }
        }
        int i7 = cancel + 5;
        INotificationSideChannel = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancel + 5;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        getCameraCharacteristic getcameracharacteristic = null;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 922553643;
        int i5 = 358976328 + (((~((-485037069) | length)) | 1315024611) * (-318));
        int i6 = ~(1315024611 | length);
        int i7 = ~length;
        if (i4 != i5 + ((i6 | (~(i7 | (-1107340004)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(length | (-1107340004))) | (~(1592377071 | i7))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            int i8 = (-197283442) % 2;
            throw new ArithmeticException();
        }
        int i9 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyPid = Process.myPid();
        if (i9 != 645208060 + (((~(2146813496 | iMyPid)) | 657797) * 104) + ((~((~iMyPid) | (-1716569129))) * (-104)) + ((iMyPid | 430902165) * 104)) {
            int i10 = 357171390 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        getCameraCharacteristic getcameracharacteristic2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (getcameracharacteristic2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.b();
        int i11 = INotificationSideChannel + 31;
        cancel = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        int i2 = cancel + 115;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (getcameracharacteristic == null) {
            int i5 = i3 + 37;
            cancel = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = 85 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            int i7 = INotificationSideChannel + 47;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onStop();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = cancel + 61;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (getcameracharacteristic == null) {
            int i5 = i3 + 65;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = cancel + 41;
            INotificationSideChannel = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 5;
            }
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 95;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        d_();
        int i4 = INotificationSideChannel + 123;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr2;
        NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity = (NewRegistrationVerifyPhoneOtpActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
            int iMyTid = 1755 - (Process.myTid() >> 22);
            int iGreen = 23 - Color.green(0);
            byte[] bArr = $$a;
            byte b = bArr[7];
            short s = bArr[5];
            Object[] objArr3 = new Object[1];
            c(b, s, (byte) (s & 15), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMyTid, iGreen, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
                int i2 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr4 = new Object[1];
                c(b3, (short) (b3 | 36), b2, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iNormalizeMetaState, i2, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iMyPid = Process.myPid();
            int i3 = ~iMyPid;
            int i4 = 1189776958 + (((~(439987367 | i3)) | 652589793) * (-90)) + (((~(439987367 | iMyPid)) | 404227078) * (-45)) + (((~(iMyPid | (-652589794))) | 439987367 | (~(i3 | 652589793))) * 45) + 86075106;
            int i5 = i4 ^ (i4 << 13);
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(false, 242 - (ViewConfiguration.getFadingEdgeLength() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step5).substring(10, 11).length() + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellCategoryTitle).substring(0, 8).length() + 1, new char[]{'\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535}, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.page_title_uobapp).substring(0, 12).codePointAt(8) + 214, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step4).substring(45, 46).codePointAt(0) - 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_cvv).substring(12, 13).codePointAt(0) - 26, new char[]{3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14}, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, newRegistrationVerifyPhoneOtpActivity)).intValue();
            try {
                Object[] objArr8 = {1015452600};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 42049), (ViewConfiguration.getScrollBarSize() >> 8) + 1726, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 86075106, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                    int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0);
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr9 = new Object[1];
                    c(b5, (short) (b5 | 36), b4, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, maximumFlingVelocity, iLastIndexOf, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 128, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_null_json_response_from_server).substring(0, 40).length() - 18, ExpandableListView.getPackedPositionGroup(0L) + 10, new char[]{16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 138, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_bank_transfer).substring(0, 7).codePointAt(6) - 82, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 27, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                        int i7 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr12 = new Object[1];
                        c(b7, (short) (b7 | 88), b6, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i7, packedPositionChild, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
                        int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                        byte[] bArr2 = $$a;
                        byte b8 = bArr2[7];
                        short s2 = bArr2[5];
                        Object[] objArr13 = new Object[1];
                        c(b8, s2, (byte) (s2 & 15), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, i8, i9, 986134021, false, (String) objArr13[0], null);
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
        int i10 = ((int[]) objArrB$7879113[1])[0];
        int i11 = ((int[]) objArrB$7879113[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i13 = (-1361929159) + (((~(437085110 | iMaxMemory)) | (-224482685)) * 672);
            int i14 = ~iMaxMemory;
            int i15 = i12 + i13 + (((~(iMaxMemory | (-224482685))) | (~((-437085111) | i14))) * (-672)) + (((~(224482684 | i14)) | (-527267839)) * 672);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr14[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i18 = 0;
                while (i18 < strArr.length) {
                    int i19 = cancel + 23;
                    INotificationSideChannel = i19 % 128;
                    int i20 = i19 % 2;
                    arrayList.add(strArr[i18]);
                    i18++;
                    int i21 = cancel + 79;
                    INotificationSideChannel = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
            int[] iArr = new int[i11];
            int i23 = i11 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iMyPid2 = Process.myPid();
            int i25 = i24 + 1010136612 + (((~((~iMyPid2) | 184157380)) | (-200936950)) * 529) + (((~(iMyPid2 | 184157380)) | (-28445046)) * 529);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr15[3])[0] = i27 ^ (i27 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
            int iAlpha = Color.alpha(0) + 15;
            byte b9 = $$a[7];
            byte b10 = b9;
            Object[] objArr16 = new Object[1];
            c(b10, (short) (b10 | 140), b9, objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength, modifierMetaStateMask2, iAlpha, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr17 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 207, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step5).substring(37, 38).codePointAt(0) - 87, new char[]{16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483}, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(false, ExpandableListView.getPackedPositionGroup(0L) + 247, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, 10 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c4 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
            int i28 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
            byte b11 = $$a[7];
            byte b12 = b11;
            Object[] objArr19 = new Object[1];
            c(b12, (short) (b12 | 36), b11, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, maxKeyCode, i28, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i29 = cancel + 11;
            INotificationSideChannel = i29 % 128;
            int i30 = i29 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                int i31 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 15;
                byte b13 = $$a[28];
                int i32 = $$b;
                Object[] objArr20 = new Object[1];
                c(b13, (short) (i32 & 960), (byte) (i32 & 53), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(trimmedLength2, i31, iNormalizeMetaState2, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr21[3])[0];
            int i34 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int iMyTid2 = Process.myTid();
            int i35 = ((1735288292 + (((~(iMyTid2 | 399058407)) | 137402904) * 305)) + (((~((~iMyTid2) | 399058407)) | 154778237) * 305)) - 914207362;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[2])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 231, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 91, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9, new char[]{'\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_bni_point).substring(1, 3).codePointAt(0) + 149, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_with).substring(0, 4).codePointAt(3) - 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, new char[]{3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, newRegistrationVerifyPhoneOtpActivity)).intValue();
            Object[] objArr24 = {1015452600};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 46038), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1134, (ViewConfiguration.getTapTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, -914207362, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int iAlpha2 = 1031 - Color.alpha(0);
                int i38 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b14 = $$a[7];
                byte b15 = b14;
                Object[] objArr26 = new Object[1];
                c(b15, (short) (b15 | 140), b14, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(touchSlop, iAlpha2, i38, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "") + 45993), 1118 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 17), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
                int i39 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16;
                byte b16 = $$a[28];
                int i40 = $$b;
                Object[] objArr27 = new Object[1];
                c(b16, (short) (i40 & 960), (byte) (i40 & 53), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(capsMode, fadingEdgeLength, i39, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr28 = new Object[1];
                e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 207, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 26, new char[]{16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(false, Drawable.resolveOpacity(0, 0) + 247, 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
                    byte b17 = $$a[7];
                    byte b18 = b17;
                    Object[] objArr30 = new Object[1];
                    c(b18, (short) (b18 | 36), b17, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollBarSize, iRgb, packedPositionGroup, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 1031;
                    int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
                    byte b19 = $$a[7];
                    byte b20 = b19;
                    Object[] objArr31 = new Object[1];
                    c(b20, (short) (b20 | 140), b19, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, iIndexOf, iKeyCodeFromString, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i41 = ((int[]) objArr2[1])[0];
        int i42 = ((int[]) objArr2[3])[0];
        if (i42 != i41) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                int i43 = INotificationSideChannel + 45;
                cancel = i43 % 128;
                int i44 = i43 % 2;
                for (String str : strArr3) {
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i42));
        }
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i45 = ((int[]) objArr2[2])[0];
        int i46 = ((int[]) objArr2[3])[0];
        int i47 = ((int[]) objArr2[1])[0];
        String[] strArr4 = (String[]) objArr2[0];
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i48 = ~iFreeMemory;
        int i49 = i45 + (-2140082559) + (((~((-67969612) | i48)) | 10) * 168) + ((~((-11) | iFreeMemory)) * 168) + (((~(iFreeMemory | (-67969602))) | (~(i48 | (-176310559))) | 176310548) * 168);
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr32[2])[0] = i51 ^ (i51 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancel + 73;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        if (i4 != (-1913624364) + (((~(1727659421 | iNextInt)) | (-897671879)) * (-964)) + (((~((~iNextInt) | 1727659421)) | (-2012872672)) * (-964))) {
            int i5 = cancel + 117;
            INotificationSideChannel = i5 % 128;
            if (i5 % 2 != 0) {
                int[] iArr = new int[428352152];
                iArr[428352151] = 0;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[428352152];
                iArr2[428352151] = 1;
                int i6 = 1554290600 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        if (i7 != 2010584484 + (((~((-700484097) | iFreeMemory)) | (~((~iFreeMemory) | 1878571868))) * (-318)) + (((~(736668160 | iFreeMemory)) | 1141903708) * (-318)) + (((~(iFreeMemory | (-736668161))) | (-1842387805)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            throw new RuntimeException("-1316533394");
        }
        super.onStart();
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -138530288
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.cancel
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.INotificationSideChannel = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
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
            int r4 = r4.widthPixels
            r5 = 1598692079(0x5f4a1aef, float:1.4563215E19)
            r6 = r5 | r4
            int r6 = ~r6
            r7 = -768704537(0xffffffffd22e7fe7, float:-1.8736754E11)
            r6 = r6 | r7
            int r6 = r6 * (-964)
            r7 = 1922275140(0x72939744, float:5.846677E30)
            int r7 = r7 + r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = ~r4
            r5 = -2145098496(0xffffffff80246500, float:-3.34231E-39)
            r4 = r4 | r5
            int r4 = r4 * (-964)
            int r7 = r7 + r4
            if (r1 != r7) goto Lb5
            java.lang.reflect.Member[] r1 = defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = android.os.Process.myUid()
            int r4 = ~r2
            r5 = -700549223(0xffffffffd63e7799, float:-5.235522E13)
            r5 = r5 | r4
            int r5 = ~r5
            r6 = -1878506743(0xffffffff90084309, float:-2.6872913E-29)
            r5 = r5 | r6
            r6 = 1774292070(0x69c18c66, float:2.9248212E25)
            r2 = r2 | r6
            int r2 = ~r2
            r2 = r2 | r5
            int r2 = r2 * (-68)
            r5 = 1075649436(0x401d1b9c, float:2.4548101)
            int r5 = r5 + r2
            r2 = -104214673(0xfffffffff9c9cf6f, float:-1.3098237E35)
            r2 = r2 | r4
            int r2 = ~r2
            int r2 = r2 * (-68)
            int r5 = r5 + r2
            r2 = -1774292071(0xffffffff963e7399, float:-1.5384554E-25)
            r2 = r2 | r4
            int r2 = ~r2
            r4 = -804763895(0xffffffffd0084709, float:-9.145427E9)
            r2 = r2 | r4
            int r2 = r2 * 68
            int r5 = r5 + r2
            if (r1 == r5) goto Lb1
            int r1 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.INotificationSideChannel
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.cancel = r2
            int r1 = r1 % r0
            r1 = -138530288(0xfffffffff7be3210, float:-7.7152484E33)
            int[] r1 = new int[r1]
            r2 = -138530289(0xfffffffff7be320f, float:-7.715248E33)
            r4 = 1
            r1[r2] = r4
            r2 = 1103892208(0x41cc0ef0, float:25.507294)
            int r2 = r2 % r0
            r0 = -1
            r0 = r1[r0]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r4)
            r0.show()
        Lb1:
            super.onCreate(r9)
            return
        Lb5:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "1586684972"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void b(NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 47;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                newRegistrationVerifyPhoneOtpActivity.onBackPressed();
                ViewPortBuilder.b();
                int i4 = 70 / 0;
            } else {
                newRegistrationVerifyPhoneOtpActivity.onBackPressed();
                ViewPortBuilder.b();
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationVerifyPhoneOtpActivity.MediaBrowserCompat();
        } else {
            getCameraCharacteristic getcameracharacteristic = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i2 = INotificationSideChannel + 101;
                cancel = i2 % 128;
                int i3 = i2 % 2;
                newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                getCameraCharacteristic getcameracharacteristic2 = newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (getcameracharacteristic2 == null) {
                    int i4 = cancel + 117;
                    INotificationSideChannel = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    getcameracharacteristic = getcameracharacteristic2;
                }
                getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i6 = cancel + 119;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = cancel + 65;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return (RegistrationForUnregistered) newRegistrationVerifyPhoneOtpActivity.getIntent().getParcelableExtra("unregistered_data");
        }
        int i3 = 50 / 0;
        return (RegistrationForUnregistered) newRegistrationVerifyPhoneOtpActivity.getIntent().getParcelableExtra("unregistered_data");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding, NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 89;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            OtpView otpView = activityRegistrationVerifyPhoneOtpBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, newRegistrationVerifyPhoneOtpActivity);
        } else {
            OtpView otpView2 = activityRegistrationVerifyPhoneOtpBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView2, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, newRegistrationVerifyPhoneOtpActivity);
            int i3 = 7 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[PHI: r2
  0x00c2: PHI (r2v9 java.lang.String) = (r2v7 java.lang.String), (r2v15 java.lang.String) binds: [B:38:0x00bf, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object b(Object[] objArr) {
        String str;
        String str2;
        String str3 = "";
        ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding = (ActivityRegistrationVerifyPhoneOtpBinding) objArr[0];
        NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity = (NewRegistrationVerifyPhoneOtpActivity) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 101;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            activityRegistrationVerifyPhoneOtpBinding.otpVerify.getEditableText().clear();
            setSplitTrack setsplittrack = (setSplitTrack) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            String string = ((PreferenceManager) newRegistrationVerifyPhoneOtpActivity.d.getValue()).getString("OCR_TRANSACTION_ID", "");
            Object obj = null;
            if (((RegisteredMemberRegistration) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (registeredMemberRegistration != null) {
                    int i4 = INotificationSideChannel + 49;
                    cancel = i4 % 128;
                    if (i4 % 2 == 0) {
                        String str4 = registeredMemberRegistration.g;
                        obj.hashCode();
                        throw null;
                    }
                    str = registeredMemberRegistration.g;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationVerifyPhoneOtpActivity.b.getValue();
                str = registrationForUnregistered != null ? registrationForUnregistered.TuitionPaymentFragmentbindingInflater1 : null;
                if (str == null) {
                    str = "";
                }
            }
            if (((RegisteredMemberRegistration) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                str2 = registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null;
                if (str2 == null) {
                    int i5 = cancel + 85;
                    INotificationSideChannel = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    str3 = str2;
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) newRegistrationVerifyPhoneOtpActivity.b.getValue();
                if (registrationForUnregistered2 != null) {
                    int i7 = INotificationSideChannel + 35;
                    cancel = i7 % 128;
                    if (i7 % 2 == 0) {
                        String str5 = registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        obj.hashCode();
                        throw null;
                    }
                    str2 = registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    str3 = str2;
                }
            }
            setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, new PhoneVerificationRequest(str, str3));
            ViewPortBuilder.b();
            int i8 = cancel + 43;
            INotificationSideChannel = i8 % 128;
            int i9 = i8 % 2;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048 A[Catch: all -> 0x019b, TryCatch #0 {all -> 0x019b, blocks: (B:3:0x0006, B:7:0x003a, B:15:0x004f, B:17:0x005a, B:29:0x0081, B:31:0x008b, B:35:0x009a, B:38:0x00a8, B:40:0x00b0, B:42:0x00ba, B:44:0x00be, B:46:0x00c4, B:50:0x00cf, B:54:0x00e4, B:57:0x00ee, B:59:0x00f6, B:61:0x0108, B:62:0x010a, B:68:0x0197, B:66:0x0117, B:67:0x0180, B:55:0x00ea, B:36:0x00a2, B:20:0x005f, B:24:0x0074, B:25:0x007a, B:9:0x003e, B:11:0x0048), top: B:73:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e A[Catch: all -> 0x019b, TryCatch #0 {all -> 0x019b, blocks: (B:3:0x0006, B:7:0x003a, B:15:0x004f, B:17:0x005a, B:29:0x0081, B:31:0x008b, B:35:0x009a, B:38:0x00a8, B:40:0x00b0, B:42:0x00ba, B:44:0x00be, B:46:0x00c4, B:50:0x00cf, B:54:0x00e4, B:57:0x00ee, B:59:0x00f6, B:61:0x0108, B:62:0x010a, B:68:0x0197, B:66:0x0117, B:67:0x0180, B:55:0x00ea, B:36:0x00a2, B:20:0x005f, B:24:0x0074, B:25:0x007a, B:9:0x003e, B:11:0x0048), top: B:73:0x0006 }] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity, View view) {
        RegistrationForUnregistered registrationForUnregistered;
        String str;
        String str2;
        String strName;
        boolean z;
        String str3;
        Citizenship citizenship;
        MembershipType membershipType;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            String string = StringsKt.trim((CharSequence) String.valueOf(((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getText())).toString();
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            if (registeredMemberRegistration != null) {
                int i2 = cancel + 37;
                INotificationSideChannel = i2 % 128;
                int i3 = i2 % 2;
                str = registeredMemberRegistration.g;
                if (str == null) {
                    registrationForUnregistered = (RegistrationForUnregistered) newRegistrationVerifyPhoneOtpActivity.b.getValue();
                    if (registrationForUnregistered != null) {
                        str = registrationForUnregistered.TuitionPaymentFragmentbindingInflater1;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                }
            } else {
                registrationForUnregistered = (RegistrationForUnregistered) newRegistrationVerifyPhoneOtpActivity.b.getValue();
                if (registrationForUnregistered != null) {
                    str = registrationForUnregistered.TuitionPaymentFragmentbindingInflater1;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            }
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            if (registeredMemberRegistration2 == null || (str2 = registeredMemberRegistration2.INotificationSideChannel) == null) {
                RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) newRegistrationVerifyPhoneOtpActivity.b.getValue();
                if (registrationForUnregistered2 != null) {
                    int i4 = cancel + 97;
                    INotificationSideChannel = i4 % 128;
                    if (i4 % 2 != 0) {
                        str2 = registrationForUnregistered2.connect;
                        int i5 = 88 / 0;
                    } else {
                        str2 = registrationForUnregistered2.connect;
                    }
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
            }
            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            if (registeredMemberRegistration3 == null || (membershipType = registeredMemberRegistration3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
                strName = null;
            } else {
                int i6 = INotificationSideChannel + 91;
                cancel = i6 % 128;
                if (i6 % 2 == 0) {
                    strName = membershipType.name();
                    int i7 = 70 / 0;
                } else {
                    strName = membershipType.name();
                }
            }
            if (Intrinsics.areEqual(strName, "PU")) {
                RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (Intrinsics.areEqual((registeredMemberRegistration4 == null || (citizenship = registeredMemberRegistration4.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship.name(), "WNA")) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) newRegistrationVerifyPhoneOtpActivity.b.getValue();
            if (registrationForUnregistered3 != null) {
                int i8 = INotificationSideChannel + 95;
                cancel = i8 % 128;
                if (i8 % 2 == 0) {
                    str3 = registrationForUnregistered3.IconCompatParcelizer;
                    int i9 = 72 / 0;
                } else {
                    str3 = registrationForUnregistered3.IconCompatParcelizer;
                }
            } else {
                str3 = null;
            }
            if (Intrinsics.areEqual(str3, "cross_selling")) {
                isSticky issticky = (isSticky) newRegistrationVerifyPhoneOtpActivity.g.getValue();
                RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) newRegistrationVerifyPhoneOtpActivity.b.getValue();
                issticky.TuitionPaymentFragmentbindingInflater1(str, string, str2, String.valueOf(registrationForUnregistered4 != null ? registrationForUnregistered4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null));
            } else if (z) {
                final isSticky issticky2 = (isSticky) newRegistrationVerifyPhoneOtpActivity.g.getValue();
                String string2 = ((PreferenceManager) newRegistrationVerifyPhoneOtpActivity.d.getValue()).getString("OCR_TRANSACTION_ID", "");
                Intrinsics.checkNotNullParameter(string2, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(string, "");
                Intrinsics.checkNotNullParameter(str2, "");
                MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = issticky2.TuitionPaymentFragmentbindingInflater1;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(issticky2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string2, str, string, str2)));
                buildCustomTabsIntent buildcustomtabsintent = new buildCustomTabsIntent(new Function1() { // from class: getUri
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return isSticky.b(issticky2, (OtpVerificationResponse) obj);
                    }
                });
                final Function1 function1 = new Function1() { // from class: getDisplayMode
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return isSticky.TuitionPaymentFragmentspecialinlinedviewModeldefault3(issticky2, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(buildcustomtabsintent, new logToString() { // from class: setScreenOrientation
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                issticky2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                ((isSticky) newRegistrationVerifyPhoneOtpActivity.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(((PreferenceManager) newRegistrationVerifyPhoneOtpActivity.d.getValue()).getString("OCR_TRANSACTION_ID", ""), str, string, str2);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity, String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 17;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        MaterialButton materialButton = ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnVerification;
        int length = str.length();
        Intrinsics.checkNotNull(materialButton);
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        if (length < 6) {
            materialButton2.setEnabled(false);
        } else {
            materialButton2.setEnabled(true);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = cancel + 13;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = cancel + 71;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationVerifyPhoneOtpActivity.getIntent().getParcelableExtra("registration_data");
        int i4 = cancel + 49;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return registeredMemberRegistration;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i;
        int i2;
        NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity = (NewRegistrationVerifyPhoneOtpActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i3 = 2 % 2;
        int i4 = cancel;
        int i5 = i4 + 15;
        int i6 = i5 % 128;
        INotificationSideChannel = i6;
        if (i5 % 2 != 0) {
            int i7 = 22 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                i = i6 + 23;
                cancel = i % 128;
                if (i % 2 != 0) {
                    newRegistrationVerifyPhoneOtpActivity.MediaBrowserCompat();
                    throw null;
                }
                newRegistrationVerifyPhoneOtpActivity.MediaBrowserCompat();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                i2 = i4 + 39;
                INotificationSideChannel = i2 % 128;
                if (i2 % 2 != 0) {
                    newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                    newRegistrationVerifyPhoneOtpActivity.b((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i8 = 78 / 0;
                } else {
                    newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                    newRegistrationVerifyPhoneOtpActivity.b((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            i = i6 + 23;
            cancel = i % 128;
            if (i % 2 != 0) {
                newRegistrationVerifyPhoneOtpActivity.MediaBrowserCompat();
                throw null;
            }
            newRegistrationVerifyPhoneOtpActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            i2 = i4 + 39;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                newRegistrationVerifyPhoneOtpActivity.b((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i9 = 78 / 0;
            } else {
                newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                newRegistrationVerifyPhoneOtpActivity.b((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
            ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = cancel + 45;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                newRegistrationVerifyPhoneOtpActivity.MediaBrowserCompat();
                int i3 = 47 / 0;
            } else {
                newRegistrationVerifyPhoneOtpActivity.MediaBrowserCompat();
            }
        } else {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i4 = INotificationSideChannel + 45;
                cancel = i4 % 128;
                if (i4 % 2 == 0) {
                    newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                    newRegistrationVerifyPhoneOtpActivity.b((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    obj.hashCode();
                    throw null;
                }
                newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                newRegistrationVerifyPhoneOtpActivity.b((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i5 = INotificationSideChannel + 67;
                cancel = i5 % 128;
                int i6 = i5 % 2;
                newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = cancel + 67;
        INotificationSideChannel = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 39;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationVerifyPhoneOtpActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
            newRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            newRegistrationVerifyPhoneOtpActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            int i4 = INotificationSideChannel + 41;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = cancel + 65;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity = (NewRegistrationVerifyPhoneOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 123;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            newRegistrationVerifyPhoneOtpActivity.d_();
            return Unit.INSTANCE;
        }
        newRegistrationVerifyPhoneOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding, NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{activityRegistrationVerifyPhoneOtpBinding, newRegistrationVerifyPhoneOtpActivity, view}, -786523106, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 786523107);
    }

    public static /* synthetic */ Unit b(NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{newRegistrationVerifyPhoneOtpActivity, virtualCameraAdapter1}, 1719842163, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1719842159);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{newRegistrationVerifyPhoneOtpActivity}, 1355075260, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1355075255);
    }

    static {
        onTransact = 1;
        d();
        INSTANCE = new Companion(null);
        int i = notify + 109;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 71;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return R.layout.activity_registration_verify_phone_otp;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancel + 85;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iCodePointAt = (-416980267) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_empty_expiry_date).substring(9, 10).codePointAt(0);
        int iB = zzbgc.b();
        int iB2 = zzbgc.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzbgc.b(), iCodePointAt, iB2, new Object[]{this}, -192352065, iB, 192352067);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iB = zzbgc.b();
        int length = 807700442 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.expand_link_atm_bersama).substring(1, 2).length();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzbgc.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, length, new Object[]{this}, -1239449586, iB, 1239449586);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 79;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iB = zzbgc.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iB2 = zzbgc.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzbgc.b(), iB, iB2, new Object[]{this, context}, -616110674, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 616110677);
    }

    static void d() {
        asInterface = -83722254;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r6 = r6 + 4
            int r8 = 120 - r8
            byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.$$c
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r6 = r6 + 1
            r3 = r0[r6]
        L24:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.$$i(byte, int, int):java.lang.String");
    }
}
