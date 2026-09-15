package com.bpjstku.presentation.membership.registration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import androidx.work.WorkInfo;
import com.bpjstku.R;
import com.bpjstku.data.user.model.request.LogoutRequest;
import com.bpjstku.databinding.ActivityRegistrationSuccessBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity;
import com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.PaymentActivity;
import com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.libraries.places.internal.zzbla;
import defpackage.ExperimentalCamera2Interop;
import defpackage.IntegerRes;
import defpackage.MediaSpecOutputFormat;
import defpackage.OutputConfigurationCompatApi33Impl;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getCameraState;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getOpticalInsets;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onRestoreInstanceState;
import defpackage.setQuickZoomEnabled;
import defpackage.setSessionCaptureCallback;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\u0004\u0018\u00010\u000f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0015\u0010\u0017\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0015\u0010\u001a\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001dR\u001a\u0010\n\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010&"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/RegistrationSuccessActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationSuccessBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "", "INotificationSideChannel", "()Ljava/lang/String;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "onTransact", "Lkotlin/Lazy;", "LOutputConfigurationCompatApi33Impl;", "cancel", "LOutputConfigurationCompatApi33Impl;", "Lcom/bpjstku/domain/registration/general/model/Registration;", "LgetOpticalInsets;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LIntegerRes;", "cancelAll", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "I", "()I", "g", "Ljava/lang/String;", "d", "notify", "Landroid/net/Uri;", "Landroid/net/Uri;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationSuccessActivity extends BindingBaseActivity<ActivityRegistrationSuccessBinding> {
    private static int INotificationSideChannelDefault;
    private static int INotificationSideChannelStub;
    private static int IconCompatParcelizer;
    private static short[] MediaBrowserCompat;
    private static byte[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int getInterfaceDescriptor;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String notify;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private OutputConfigurationCompatApi33Impl b;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private Uri onTransact;
    private static final byte[] $$c = {117, 57, 101, -72};
    private static final int $$f = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {89, 92, -72, 43, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 150;
    private static int write = 1;
    private static int connect = 0;
    private static int read = 1;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: setSwitchTypefaceByIndex
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationSuccessActivity.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: cancelPositionAnimator
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationSuccessActivity.b(this.b);
        }
    });
    private final int asInterface = R.layout.activity_registration_success;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String INotificationSideChannel = "";

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = i8 | i4;
        int i10 = (~(i7 | i8)) | (~(i7 | i4)) | (~i9);
        int i11 = ~i4;
        int i12 = (~(i5 | i11 | i)) | (~(i7 | i11 | i8)) | (~(i9 | i));
        int i13 = ~(i8 | i11 | i);
        int i14 = i4 + i + i6 + ((-973178360) * i2) + (1542423572 * i3);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i4) - 1073741824) + ((-187520530) * i) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i6) + (1207959552 * i2) + ((-1275068416) * i3) + (196542464 * i15);
        int i17 = (i4 * (-490823948)) + 944362368 + (i * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i6 * (-490822951)) + (i2 * 2145288392) + (i3 * 779328756) + (i15 * (-1138819072));
        int i18 = i16 + (i17 * i17 * 1440284672);
        if (i18 != 1) {
            if (i18 == 2) {
                return TuitionPaymentFragmentbindingInflater1(objArr);
            }
            if (i18 != 3) {
                return i18 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : b(objArr);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        int i19 = 2 % 2;
        int i20 = read + 113;
        connect = i20 % 128;
        int i21 = i20 % 2;
        Unit unit = Unit.INSTANCE;
        int i22 = connect + 93;
        read = i22 % 128;
        int i23 = i22 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity.$$a
            int r1 = r8 + 1
            int r6 = 196 - r6
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity.c(int, byte, short, java.lang.Object[]):void");
    }

    public RegistrationSuccessActivity() {
        final RegistrationSuccessActivity registrationSuccessActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getOpticalInsets>() { // from class: com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getOpticalInsets, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getOpticalInsets invoke() {
                ComponentCallbacks componentCallbacks = registrationSuccessActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getOpticalInsets.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final RegistrationSuccessActivity registrationSuccessActivity2 = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [IntegerRes, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ IntegerRes invoke() {
                LifecycleOwner lifecycleOwner = registrationSuccessActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IntegerRes.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/RegistrationSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, RegistrationSuccessActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegistrationSuccessBinding> TuitionPaymentFragmentbindingInflater1() {
        RegistrationSuccessActivity$bindingInflater$1 registrationSuccessActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = connect + 75;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            registrationSuccessActivity$bindingInflater$1 = RegistrationSuccessActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = 3 / 0;
        } else {
            registrationSuccessActivity$bindingInflater$1 = RegistrationSuccessActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i4 = connect + 29;
        read = i4 % 128;
        int i5 = i4 % 2;
        return registrationSuccessActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        RegistrationSuccessActivity registrationSuccessActivity = (RegistrationSuccessActivity) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 91;
        connect = i3 % 128;
        int i4 = i3 % 2;
        int i5 = registrationSuccessActivity.asInterface;
        if (i4 != 0) {
            int i6 = 1 / 0;
        }
        int i7 = i2 + 109;
        connect = i7 % 128;
        if (i7 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = connect + 67;
        read = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = (Uri) getIntent().getParcelableExtra("key_menu_event");
        int i4 = connect + 15;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = read + 49;
        connect = i2 % 128;
        int i3 = i2 % 2;
        RegistrationSuccessActivity registrationSuccessActivity = this;
        Intrinsics.checkNotNullParameter(registrationSuccessActivity, "");
        registrationSuccessActivity.getWindow().addFlags(8192);
        if (((Registration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
            ((ActivityRegistrationSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvRegistrationSuccessMessage.setText(getString(R.string.label_registration_for_unregistered_success_message));
            ((ActivityRegistrationSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnOk.setText(getString(R.string.action_proceed_to_payment));
        }
        RegistrationSuccessActivity registrationSuccessActivity2 = this;
        this.INotificationSideChannel = setSessionCaptureCallback.INSTANCE.TuitionPaymentFragmentbindingInflater1(registrationSuccessActivity2);
        ExperimentalCamera2Interop.INSTANCE.b(registrationSuccessActivity2, new Function1() { // from class: getThumbOffset
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: getThumbScrollRange
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RegistrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        int i4 = connect + 113;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) throws IllegalAccessException {
        final RegistrationSuccessActivity registrationSuccessActivity = (RegistrationSuccessActivity) objArr[0];
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 46399), Drawable.resolveOpacity(0, 0) + 40, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, 1513912262, false, "b", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.indexOf((CharSequence) "", '0') + 60, View.MeasureSpec.getMode(0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37835 - TextUtils.lastIndexOf("", '0', 0, 0)), 60 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -272;
        long j3 = -1;
        long j4 = j3 ^ 946192151835720929L;
        long jMyUid = Process.myUid();
        long j5 = (((long) 273) * 946192151835720929L) + (((long) (-271)) * 4573061345324065310L) + (((((j4 | (j3 ^ 4573061345324065310L)) | (jMyUid ^ j3)) ^ j3) | ((4573352369009360639L | jMyUid) ^ j3)) * j2) + (j2 * (((j4 | 4573061345324065310L) ^ j3) | ((j4 | jMyUid) ^ j3))) + (((long) 272) * ((j3 ^ (jMyUid | 946192151835720929L)) | 4573061345324065310L));
        int i5 = 0;
        while (true) {
            int i6 = connect + 71;
            read = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 != 8; i8++) {
                i4 = (((((int) (j >> i8)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j = j5;
        }
        if (i4 != i2) {
            int i9 = read + 55;
            connect = i9 % 128;
            int i10 = i9 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - ExpandableListView.getPackedPositionType(0L)), 40 - (ViewConfiguration.getLongPressTimeout() >> 16), 18 - TextUtils.lastIndexOf("", '0', 0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
        }
        ((ActivityRegistrationSuccessBinding) ((ViewBinding) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnOk.setOnClickListener(new View.OnClickListener() { // from class: doTransformForOnOffText
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01c4 A[PHI: r0
  0x01c4: PHI (r0v9 int) = (r0v8 int), (r0v34 int) binds: [B:45:0x01c2, B:42:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01ce A[PHI: r0
  0x01ce: PHI (r0v31 int) = (r0v8 int), (r0v34 int) binds: [B:45:0x01c2, B:42:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(INotificationSideChannelStub)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
                int iIndexOf = TextUtils.indexOf("", "", 0) + 33;
                byte length = (byte) $$c.length;
                byte b2 = (byte) (length - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, i8, iIndexOf, 1387473586, false, $$i(length, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $11 + 91;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = RemoteActionCompatParcelizer;
                char c = '0';
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", c));
                                int i12 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3358;
                                int iLastIndexOf = 17 - TextUtils.lastIndexOf("", c);
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i12, iLastIndexOf, -1054011043, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i11++;
                            c = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i13 = $10 + 91;
                    $11 = i13 % 128;
                    i6 = 2;
                    int i14 = i13 % 2;
                    bArr = bArr2;
                } else {
                    i6 = 2;
                }
                if (bArr != null) {
                    byte[] bArr3 = RemoteActionCompatParcelizer;
                    Object[] objArr4 = new Object[i6];
                    objArr4[1] = Integer.valueOf(INotificationSideChannelDefault);
                    objArr4[0] = Integer.valueOf(i3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                        int touchSlop = 2267 - (ViewConfiguration.getTouchSlop() >> 8);
                        int scrollBarSize = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte length3 = (byte) $$c.length;
                        byte b5 = (byte) (length3 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf2, touchSlop, scrollBarSize, 1387473586, false, $$i(length3, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) INotificationSideChannelStub) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) MediaBrowserCompat[i3 + ((int) (((long) INotificationSideChannelDefault) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) INotificationSideChannelStub) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i15 = $10 + 57;
                int i16 = i15 % 128;
                $11 = i16;
                if (i15 % 2 == 0) {
                    i4 = ((i3 >>> iIntValue) >>> 2) * ((int) (((long) INotificationSideChannelDefault) * 3046761265686732006L));
                    if (z) {
                        int i17 = i16 + 91;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) INotificationSideChannelDefault) ^ 3046761265686732006L));
                    if (z) {
                        int i19 = i16 + 91;
                        $10 = i19 % 128;
                        int i110 = i19 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(getInterfaceDescriptor), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 3;
                    byte b7 = (byte) (b6 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - TextUtils.indexOf("", "", 0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 2856, 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1529949196, false, $$i(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = RemoteActionCompatParcelizer;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i20 = 0; i20 < length4; i20++) {
                        bArr5[i20] = (byte) (((long) bArr4[i20]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = RemoteActionCompatParcelizer;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i21]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = MediaBrowserCompat;
                        int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i22]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
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

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final RegistrationSuccessActivity registrationSuccessActivity = (RegistrationSuccessActivity) objArr[0];
        int i = 2 % 2;
        RegistrationSuccessActivity registrationSuccessActivity2 = registrationSuccessActivity;
        ((IntegerRes) registrationSuccessActivity.TuitionPaymentFragmentbindingInflater1.getValue()).asInterface.observe(registrationSuccessActivity2, new Observer() { // from class: constrain
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationSuccessActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((getOpticalInsets) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(registrationSuccessActivity2, new Observer() { // from class: applyTrackTint
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationSuccessActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((getOpticalInsets) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.observe(registrationSuccessActivity2, new Observer() { // from class: applyThumbTint
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = connect + 33;
        read = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private final String INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = read + 41;
        int i3 = i2 % 128;
        connect = i3;
        int i4 = i2 % 2;
        String str = this.g;
        if (str == null) {
            int i5 = i3 + 47;
            read = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 42 / 0;
            }
            str = "";
        }
        String str2 = this.cancel;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str;
        if (!StringsKt.isBlank(str3)) {
            int i7 = read + 89;
            connect = i7 % 128;
            if (i7 % 2 != 0) {
                StringsKt.isBlank(str2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!StringsKt.isBlank(str2) && !StringsKt.equals(str2, "Indonesia", true)) {
                List listListOf = CollectionsKt.listOf((Object[]) new String[]{str, str2});
                ArrayList arrayList = new ArrayList();
                int i8 = connect + 51;
                read = i8 % 128;
                int i9 = i8 % 2;
                for (Object obj2 : listListOf) {
                    if (!StringsKt.isBlank((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
            }
        }
        if (StringsKt.isBlank(str3)) {
            return !StringsKt.isBlank(str2) ? str2 : "";
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:17:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:19:0x0190  */
    /* JADX WARN: Code duplicated, block: B:22:0x02ed A[Catch: all -> 0x0e61, TryCatch #0 {all -> 0x0e61, blocks: (B:20:0x02d9, B:22:0x02ed, B:23:0x0320, B:51:0x09a6, B:53:0x09ba, B:54:0x09e9, B:56:0x0a1b, B:57:0x0a93), top: B:98:0x02d9 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x033a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0488  */
    /* JADX WARN: Code duplicated, block: B:34:0x04d9  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = read + 115;
        connect = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char c = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i4 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i5 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte b = $$a[28];
                Object[] objArr2 = new Object[1];
                c((short) 193, b, (byte) (b | 36), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i4, i5, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            int i6 = 61 / 0;
            if (j != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int iIndexOf = 1755 - TextUtils.indexOf("", "", 0, 0);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 23;
                    Object[] objArr3 = new Object[1];
                    c((short) 156, $$a[28], (byte) 52, objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, iIndexOf, deadChar, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int iMyUid = Process.myUid();
                int i7 = ~iMyUid;
                int i8 = 410067709 + ((1039433671 | iMyUid) * (-676)) + (((~(697322945 | i7)) | (-1039433672)) * 676) + (((~(iMyUid | (-342110727))) | (~(i7 | 484720519)) | 554713152) * 676) + 1674068187;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(Color.argb(0, 0, 0, 0) + 724959596, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 228, (short) ((-43) - TextUtils.indexOf((CharSequence) "", '0', 0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fetching_offers).substring(1, 2).length() - 20), Color.alpha(0) - 1777006161, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 724959559, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_hint_xl_order_id).substring(14, 15).codePointAt(0) - 153, (short) (52 - View.getDefaultSize(0, 0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step1).substring(14, 15).length() + 66), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1777006181, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {-72771771};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1726 - (ViewConfiguration.getFadingEdgeLength() >> 16), 28 - ((byte) KeyEvent.getModifierMetaStateMask()), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), 1674068187, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int iIndexOf2 = 1755 - TextUtils.indexOf("", "", 0);
                        int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                        Object[] objArr8 = new Object[1];
                        c((short) 156, $$a[28], (byte) 52, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iIndexOf2, packedPositionType, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 724959576, TextUtils.lastIndexOf("", '0', 0, 0) - 120, (short) (ImageFormat.getBitsPerPixel(0) - 80), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 44), (-1777006129) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 724959580, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_payment_cant_open_deeplink).substring(5, 6).length() - 122, (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49), (byte) ((-38) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (-1777006107) - View.MeasureSpec.getSize(0), objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
                            int iBlue = 23 - Color.blue(0);
                            Object[] objArr11 = new Object[1];
                            c((short) 104, $$a[28], (byte) 52, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iLastIndexOf, iBlue, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetAfter = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
                            int windowTouchSlop2 = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte b2 = $$a[28];
                            Object[] objArr12 = new Object[1];
                            c((short) 193, b2, (byte) (b2 | 36), objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, absoluteGravity, windowTouchSlop2, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                byte b3 = $$a[28];
                Object[] objArr13 = new Object[1];
                c((short) 193, b3, (byte) (b3 | 36), objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(minimumFlingVelocity, threadPriority, modifierMetaStateMask, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char windowTouchSlop3 = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int iIndexOf3 = 1755 - TextUtils.indexOf("", "", 0, 0);
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 23;
                    Object[] objArr14 = new Object[1];
                    c((short) 156, $$a[28], (byte) 52, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop3, iIndexOf3, deadChar2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int iMyUid2 = Process.myUid();
                int i11 = ~iMyUid2;
                int i12 = 410067709 + ((1039433671 | iMyUid2) * (-676)) + (((~(697322945 | i11)) | (-1039433672)) * 676) + (((~(iMyUid2 | (-342110727))) | (~(i11 | 484720519)) | 554713152) * 676) + 1674068187;
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i14 ^ (i14 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(Color.argb(0, 0, 0, 0) + 724959596, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 228, (short) ((-43) - TextUtils.indexOf((CharSequence) "", '0', 0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fetching_offers).substring(1, 2).length() - 20), Color.alpha(0) - 1777006161, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 724959559, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_hint_xl_order_id).substring(14, 15).codePointAt(0) - 153, (short) (52 - View.getDefaultSize(0, 0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step1).substring(14, 15).length() + 66), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1777006181, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {-72771771};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1726 - (ViewConfiguration.getFadingEdgeLength() >> 16), 28 - ((byte) KeyEvent.getModifierMetaStateMask()), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), 1674068187, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c4 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int iIndexOf4 = 1755 - TextUtils.indexOf("", "", 0);
                    int packedPositionType2 = 23 - ExpandableListView.getPackedPositionType(0L);
                    Object[] objArr19 = new Object[1];
                    c((short) 156, $$a[28], (byte) 52, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, iIndexOf4, packedPositionType2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                Object[] objArr20 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 724959576, TextUtils.lastIndexOf("", '0', 0, 0) - 120, (short) (ImageFormat.getBitsPerPixel(0) - 80), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 44), (-1777006129) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 724959580, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_payment_cant_open_deeplink).substring(5, 6).length() - 122, (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49), (byte) ((-38) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (-1777006107) - View.MeasureSpec.getSize(0), objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c5 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 1756;
                    int iBlue2 = 23 - Color.blue(0);
                    Object[] objArr111 = new Object[1];
                    c((short) 104, $$a[28], (byte) 52, objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c5, iLastIndexOf2, iBlue2, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char offsetAfter2 = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 1755;
                    int windowTouchSlop4 = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b4 = $$a[28];
                    Object[] objArr112 = new Object[1];
                    c((short) 193, b4, (byte) (b4 | 36), objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter2, absoluteGravity2, windowTouchSlop4, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4];
            if (strArr != null) {
                while (i3 < strArr.length) {
                    int i15 = read + 67;
                    connect = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(strArr[i3]);
                    i3++;
                    int i17 = read + 45;
                    connect = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            throw null;
        }
        int i19 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
        Object[] objArr21 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = i19 + 2045516213 + (((~((-12745) | iIdentityHashCode)) | 212615170) * (-756)) + (((~iIdentityHashCode) | (-12745)) * 756);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[3])[0] = i22 ^ (i22 << 5);
        int i23 = read + 29;
        connect = i23 % 128;
        int i24 = i23 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int touchSlop = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
            int i25 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
            Object[] objArr22 = new Object[1];
            c((short) 52, $$a[28], (byte) 52, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, touchSlop, i25, 1357589585, false, (String) objArr22[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr23 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 724959551, TextUtils.getOffsetAfter("", 0) - 121, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_1).substring(30, 31).codePointAt(0) - 196), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tesla_ev_connector_type).substring(1, 5).codePointAt(3) - 42), TextUtils.indexOf((CharSequence) "", '0') - 1777006128, objArr23);
        Class<?> cls5 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_message_not_enabled).substring(17, 18).length() + 724959590, (-120) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 12), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 74), TextUtils.indexOf("", "", 0) - 1777006107, objArr24);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int iIndexOf5 = 1031 - TextUtils.indexOf("", "", 0, 0);
            int iIndexOf6 = 15 - TextUtils.indexOf("", "", 0);
            Object[] objArr25 = new Object[1];
            c((short) 156, $$a[28], (byte) 52, objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(longPressTimeout, iIndexOf5, iIndexOf6, 1344079056, false, (String) objArr25[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int mode = View.MeasureSpec.getMode(0) + 1031;
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
                short s = $$a[7];
                byte b5 = (byte) s;
                Object[] objArr26 = new Object[1];
                c(s, b5, b5, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cNormalizeMetaState, mode, capsMode, 632103528, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr27[3])[0];
            int i27 = ((int[]) objArr27[1])[0];
            String[] strArr2 = (String[]) objArr27[0];
            int i28 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i29 = ~i28;
            int i30 = 106353603 + (((~((-86768641) | i29)) | (~((-157511530) | i28))) * 1900) + (((~(i29 | 157511529)) | (~(i28 | 86768640))) * (-950)) + (((~(i28 | 157511529)) | (~(i29 | 86768640))) * 950) + 327986095;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr28 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step4).substring(23, 24).codePointAt(0) + 724959564, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_general_network_error).substring(0, 37).codePointAt(7) - 222, (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 42), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_6).substring(13, 14).codePointAt(0) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_payment).substring(6, 7).length() - 1777006162, objArr28);
            Class<?> cls6 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            e(724959595 - View.MeasureSpec.makeMeasureSpec(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 132, (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 53), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellTargetedBrandTitle).substring(0, 14).length() + 53), TextUtils.getOffsetAfter("", 0) - 1777006145, objArr29);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr30 = {-72771771};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (Process.getGidForName("") + 46039), Color.argb(0, 0, 0, 0) + 1134, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr31 = {Integer.valueOf(iIntValue3), 0, 327986095, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr30), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
                int i33 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr32 = new Object[1];
                c((short) 52, $$a[28], (byte) 52, objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(fadingEdgeLength, iCombineMeasuredStates, i33, 1298546779, false, (String) objArr32[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 45993), 1118 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr31);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c6 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int i34 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15;
                short s2 = $$a[7];
                byte b6 = (byte) s2;
                Object[] objArr33 = new Object[1];
                c(s2, b6, b6, objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c6, i34, doubleTapTimeout, 632103528, false, (String) objArr33[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr34 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_bni_title).substring(0, 17).codePointAt(3) + 724959555, (-121) - View.resolveSizeAndState(0, 0, 0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step6).substring(0, 1).length() - 82), (byte) (54 - ((byte) KeyEvent.getModifierMetaStateMask())), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 1777006175, objArr34);
                Class<?> cls7 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 724959482, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 157, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 37), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 74), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1777006143, objArr35);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr35[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 1031;
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
                    Object[] objArr36 = new Object[1];
                    c((short) 156, $$a[28], (byte) 52, objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maximumFlingVelocity, packedPositionType3, threadPriority2, 1344079056, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
                    Object[] objArr37 = new Object[1];
                    c((short) 52, $$a[28], (byte) 52, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cIndexOf, iMakeMeasureSpec, packedPositionGroup, 1357589585, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
                int i35 = connect + 37;
                read = i35 % 128;
                int i36 = i35 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i37 = ((int[]) objArr[1])[0];
        int i38 = ((int[]) objArr[3])[0];
        if (i38 == i37) {
            Object[] objArr38 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i39 = ((int[]) objArr[2])[0];
            int i40 = ((int[]) objArr[3])[0];
            int i41 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i42 = i39 + 1272823593 + (((~(652772900 | iIdentityHashCode2)) | 286749066) * 576) + (((~((~iIdentityHashCode2) | 939521966)) | 610304004) * 576) + 1958704768;
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr38[2])[0] = i44 ^ (i44 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str : strArr4) {
                int i45 = connect + 17;
                read = i45 % 128;
                int i46 = i45 % 2;
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i38 / (((i38 - 1) * i38) % 2), 0).show();
        Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i47 = ((int[]) objArr[2])[0];
        int i48 = ((int[]) objArr[3])[0];
        int i49 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i50 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i51 = i47 + ((~((-201458178) | i50)) * 521) + 2130776800 + (((~((~i50) | (-201458178))) | 9257088) * 521);
        int i52 = i51 ^ (i51 << 13);
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr39[2])[0] = i53 ^ (i53 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = connect + 85;
        read = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_5).substring(1, 2).codePointAt(0) + 1834766293;
        if (i4 != (-755107086) + ((~((~iCodePointAt) | (-745805079))) * 433) + (((~(1853175798 | iCodePointAt)) | (-1023188256)) * (-433)) + (((~(iCodePointAt | (-1023188256))) | 1107370720) * 433)) {
            throw new RuntimeException("-830323511");
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i6 = ~iFreeMemory;
        if (i5 != (-94811252) + (((~(2071141363 | i6)) | (-355230033) | (~((-2071141364) | iFreeMemory))) * (-564)) + ((~(iFreeMemory | (-287310161))) * 1128) + (((~((-355230033) | i6)) | 1783831203) * 564)) {
            throw new RuntimeException("-424500310");
        }
        super.onResume();
        int i7 = connect + 57;
        read = i7 % 128;
        int i8 = i7 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -863116654
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
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00dd, code lost:
    
        if (r1 != (((60576748 + ((r3 | (~(2051092149 | r4))) * (-1808))) + (((~((-440403622) | r2)) | (~(r4 | 2138652343))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(r2 | (-2051092150))) | 87560194) | (~(527963815 | r4))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00df, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity.connect + 85;
        com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity.read = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00eb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ec, code lost:
    
        r10 = 149910536 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f5, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f6, code lost:
    
        r10 = (-590647698) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ff, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r1 == (((1103581734 + ((~((~r4) | (-541479461))) * 433)) + (((~(1682404924 | r4)) | (-852417382)) * (-433))) + (((~(r4 | (-852417382))) | 1140925464) * 433))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
    
        if (r1 == (((1563865192 + (((~(r4 | 985509757)) | (~((-134545477) | r4))) * (-184))) + (((10488369 | (~((-145033846) | r4))) | (~(975021388 | r4))) * 184)) - 28745336)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007a, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 909175577;
        r3 = ~((-527963816) | r2);
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Registration b(RegistrationSuccessActivity registrationSuccessActivity) {
        int i = 2 % 2;
        int i2 = connect + 65;
        read = i2 % 128;
        int i3 = i2 % 2;
        Registration registration = (Registration) registrationSuccessActivity.getIntent().getParcelableExtra("successful_unregistered_registration_data");
        int i4 = connect + 39;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return registration;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final RegistrationSuccessActivity registrationSuccessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registrationSuccessActivity.MediaBrowserCompat();
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                Unit unit2 = Unit.INSTANCE;
                return;
            }
            registrationSuccessActivity.IconCompatParcelizer();
            String str2 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNull(str2, "");
            Toast toastMakeText = Toast.makeText(registrationSuccessActivity, str2, 0);
            toastMakeText.show();
            Intrinsics.checkExpressionValueIsNotNull(toastMakeText, "");
            return;
        }
        registrationSuccessActivity.IconCompatParcelizer();
        final onRestoreInstanceState onrestoreinstancestate = (onRestoreInstanceState) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(registrationSuccessActivity, null, registrationSuccessActivity.onTransact, 2);
            registrationSuccessActivity.d_();
            Unit unit3 = Unit.INSTANCE;
            int i2 = read + 51;
            connect = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (!(!Intrinsics.areEqual(onrestoreinstancestate.asBinder, "-1"))) {
            int i4 = read + 65;
            connect = i4 % 128;
            if (i4 % 2 != 0) {
                OutputConfigurationCompatApi33Impl.Companion companion2 = OutputConfigurationCompatApi33Impl.INSTANCE;
                str = onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i5 = 25 / 0;
                if (str == null) {
                    str = "Perangkat Terhubung";
                }
            } else {
                OutputConfigurationCompatApi33Impl.Companion companion3 = OutputConfigurationCompatApi33Impl.INSTANCE;
                str = onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str == null) {
                    str = "Perangkat Terhubung";
                }
            }
            String str3 = str;
            String str4 = onrestoreinstancestate.TuitionPaymentFragmentbindingInflater1;
            if (str4 == null) {
                str4 = "Akun Anda terhubung dengan perangkat lain. Silakan putuskan koneksi untuk melanjutkan.";
            }
            OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.ic_login_failed, str3, str4, "Lanjutkan", new Function0() { // from class: animateThumbToCheckedState
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegistrationSuccessActivity.TuitionPaymentFragmentbindingInflater1(this.b, onrestoreinstancestate);
                }
            }, "Kembali", new Function0() { // from class: cancelSuperTouch
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegistrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
                }
            }, true);
            registrationSuccessActivity.b = outputConfigurationCompatApi33ImplB;
            FragmentManager supportFragmentManager = registrationSuccessActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i6 = read + 121;
                connect = i6 % 128;
                int i7 = i6 % 2;
                outputConfigurationCompatApi33ImplB.show(supportFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i8 = connect + 85;
                read = i8 % 128;
                int i9 = i8 % 2;
            }
            Unit unit4 = Unit.INSTANCE;
            return;
        }
        if (Intrinsics.areEqual(onrestoreinstancestate.asBinder, "-2")) {
            OutputConfigurationCompatApi33Impl.Companion companion4 = OutputConfigurationCompatApi33Impl.INSTANCE;
            String string = registrationSuccessActivity.getString(R.string.label_forgot_account);
            Intrinsics.checkNotNullExpressionValue(string, "");
            OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB2 = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.ic_login_failed, "Anda telah mencapai batas maksimal percobaan login", "Informasi login yang Anda masukkan tidak sesuai. Silakan gunakan fitur Lupa Akun untuk pemulihan akses atau kunjungi Kantor Cabang terdekat untuk bantuan lebih lanjut.", string, new Function0() { // from class: hitThumb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegistrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }, registrationSuccessActivity.getString(R.string.action_halaman_awal), new Function0() { // from class: getTargetCheckedState
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return (Unit) RegistrationSuccessActivity.TuitionPaymentFragmentbindingInflater1(1353244936, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[0], -1353244935, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }, true);
            registrationSuccessActivity.b = outputConfigurationCompatApi33ImplB2;
            FragmentManager supportFragmentManager2 = registrationSuccessActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
            if (supportFragmentManager2.findFragmentByTag(outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                outputConfigurationCompatApi33ImplB2.show(supportFragmentManager2, outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            Unit unit5 = Unit.INSTANCE;
            return;
        }
        getCameraState.Companion companion5 = getCameraState.INSTANCE;
        String string2 = onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (string2 == null) {
            string2 = registrationSuccessActivity.getString(R.string.error_login_tittle);
            Intrinsics.checkNotNullExpressionValue(string2, "");
        }
        String str5 = onrestoreinstancestate.TuitionPaymentFragmentbindingInflater1;
        if (str5 == null) {
            int i10 = connect + 99;
            read = i10 % 128;
            int i11 = i10 % 2;
            str5 = "Terjadi kesalahan, silakan coba lagi.";
        }
        String string3 = registrationSuccessActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_login_failed, string2, str5, string3);
        FragmentManager supportFragmentManager3 = registrationSuccessActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager3, "");
        if (supportFragmentManager3.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getcamerastateB.show(supportFragmentManager3, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Unit unit6 = Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(RegistrationSuccessActivity registrationSuccessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = connect + 99;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            registrationSuccessActivity.MediaBrowserCompat();
            Unit unit = Unit.INSTANCE;
            int i3 = read + 117;
            connect = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            registrationSuccessActivity.IconCompatParcelizer();
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(registrationSuccessActivity, null, registrationSuccessActivity.onTransact, 2);
            registrationSuccessActivity.d_();
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        registrationSuccessActivity.IconCompatParcelizer();
        String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNull(str, "");
        Toast toastMakeText = Toast.makeText(registrationSuccessActivity, str, 0);
        toastMakeText.show();
        Intrinsics.checkExpressionValueIsNotNull(toastMakeText, "");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationSuccessActivity registrationSuccessActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = read + 63;
        connect = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationSuccessActivity, null, true, 25);
            registrationSuccessActivity.d_();
            unit = Unit.INSTANCE;
        } else {
            LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationSuccessActivity, null, false, 6);
            registrationSuccessActivity.d_();
            unit = Unit.INSTANCE;
        }
        int i3 = read + 9;
        connect = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationSuccessActivity registrationSuccessActivity) {
        int i = 2 % 2;
        int i2 = connect + 9;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            ChooseNationalityActivationActivity.Companion companion = ChooseNationalityActivationActivity.INSTANCE;
            ChooseNationalityActivationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationSuccessActivity);
            return Unit.INSTANCE;
        }
        ChooseNationalityActivationActivity.Companion companion2 = ChooseNationalityActivationActivity.INSTANCE;
        ChooseNationalityActivationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationSuccessActivity);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ void b(RegistrationSuccessActivity registrationSuccessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = connect + 59;
            read = i2 % 128;
            int i3 = i2 % 2;
            registrationSuccessActivity.MediaBrowserCompat();
            return;
        }
        String str3 = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = read + 41;
            connect = i4 % 128;
            if (i4 % 2 != 0) {
                registrationSuccessActivity.INotificationSideChannel();
                str3.hashCode();
                throw null;
            }
            String strINotificationSideChannel = registrationSuccessActivity.INotificationSideChannel();
            getOpticalInsets getopticalinsets = (getOpticalInsets) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            String str4 = registeredMemberRegistration != null ? registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1 : null;
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (registeredMemberRegistration2 != null) {
                str3 = registeredMemberRegistration2.cancelAll;
                int i5 = read + 79;
                connect = i5 % 128;
                int i6 = i5 % 2;
            }
            String str5 = str3;
            String string = Settings.Secure.getString(registrationSuccessActivity.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            String str6 = registrationSuccessActivity.d;
            String str7 = str6 == null ? "" : str6;
            String str8 = registrationSuccessActivity.asBinder;
            String str9 = str8 == null ? "" : str8;
            String str10 = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(str10, "");
            String str11 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str11, "");
            getopticalinsets.b(str4, str5, string, str7, str9, strINotificationSideChannel, str10, str11);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registrationSuccessActivity.IconCompatParcelizer();
            String strINotificationSideChannel2 = registrationSuccessActivity.INotificationSideChannel();
            getOpticalInsets getopticalinsets2 = (getOpticalInsets) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            String str12 = registeredMemberRegistration3 != null ? registeredMemberRegistration3.TuitionPaymentFragmentbindingInflater1 : null;
            RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (registeredMemberRegistration4 != null) {
                int i7 = connect + 67;
                read = i7 % 128;
                if (i7 % 2 == 0) {
                    String str13 = registeredMemberRegistration4.cancelAll;
                    str3.hashCode();
                    throw null;
                }
                str3 = registeredMemberRegistration4.cancelAll;
            }
            String str14 = str3;
            String string2 = Settings.Secure.getString(registrationSuccessActivity.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string2, "");
            String str15 = registrationSuccessActivity.d;
            if (str15 == null) {
                int i8 = read + 107;
                connect = i8 % 128;
                int i9 = i8 % 2;
                str = "";
            } else {
                str = str15;
            }
            String str16 = registrationSuccessActivity.asBinder;
            if (str16 == null) {
                int i10 = connect + 13;
                read = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 81 / 0;
                }
                str2 = "";
            } else {
                str2 = str16;
            }
            String str17 = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(str17, "");
            String str18 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str18, "");
            getopticalinsets2.b(str12, str14, string2, str, str2, strINotificationSideChannel2, str17, str18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0076 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x001c, B:11:0x003c, B:13:0x0076, B:17:0x007d, B:18:0x0085, B:20:0x008f, B:21:0x00ca, B:9:0x002f), top: B:28:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0079  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationSuccessActivity registrationSuccessActivity, View view) {
        RegisteredMemberRegistration registeredMemberRegistration;
        String str;
        int i = 2 % 2;
        int i2 = read + 93;
        connect = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                registrationSuccessActivity.INotificationSideChannel();
                int i4 = 6 / 0;
                if (((RegisteredMemberRegistration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                    Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", "registration_account_registered_member_success"));
                    Intrinsics.checkNotNullParameter(registrationSuccessActivity, "");
                    Intrinsics.checkNotNullParameter("registration_account_registered_member_success", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                    TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("registration_account_registered_member_success", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("registration_account_registered_member_success", mapMutableMapOf);
                    IntegerRes integerRes = (IntegerRes) registrationSuccessActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                    registeredMemberRegistration = (RegisteredMemberRegistration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    if (registeredMemberRegistration != null) {
                        str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new LogoutRequest(str));
                }
            } else {
                registrationSuccessActivity.INotificationSideChannel();
                if (((RegisteredMemberRegistration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                    Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_event_register_account", "registration_account_registered_member_success"));
                    Intrinsics.checkNotNullParameter(registrationSuccessActivity, "");
                    Intrinsics.checkNotNullParameter("registration_account_registered_member_success", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                    TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("registration_account_registered_member_success", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("registration_account_registered_member_success", mapMutableMapOf2);
                    IntegerRes integerRes2 = (IntegerRes) registrationSuccessActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                    registeredMemberRegistration = (RegisteredMemberRegistration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    if (registeredMemberRegistration != null) {
                        str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    integerRes2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new LogoutRequest(str));
                }
            }
            if (((Registration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
                Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_event_register_account", "registration_account_unregistered_member_success"));
                Intrinsics.checkNotNullParameter(registrationSuccessActivity, "");
                Intrinsics.checkNotNullParameter("registration_account_unregistered_member_success", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("registration_account_unregistered_member_success", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("registration_account_unregistered_member_success", mapMutableMapOf3);
                PaymentActivity.Companion companion = PaymentActivity.INSTANCE;
                PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationSuccessActivity, (Registration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                registrationSuccessActivity.d_();
            }
            ViewPortBuilder.b();
            int i5 = read + 107;
            connect = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentbindingInflater1(RegistrationSuccessActivity registrationSuccessActivity) {
        int i = 2 % 2;
        int i2 = connect + 113;
        read = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationSuccessActivity.getIntent().getParcelableExtra("registration_data");
        int i4 = connect + 125;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            return registeredMemberRegistration;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(RegistrationSuccessActivity registrationSuccessActivity, onRestoreInstanceState onrestoreinstancestate) {
        String str;
        int i = 2 % 2;
        int i2 = read + 9;
        connect = i2 % 128;
        int i3 = i2 % 2;
        TermsAndConditionDeviceLinkingActivity.Companion companion = TermsAndConditionDeviceLinkingActivity.INSTANCE;
        RegistrationSuccessActivity registrationSuccessActivity2 = registrationSuccessActivity;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        Object obj = null;
        if (registeredMemberRegistration != null) {
            str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
        } else {
            int i4 = connect + 63;
            read = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        Intrinsics.checkNotNull(str);
        TermsAndConditionDeviceLinkingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationSuccessActivity2, str, onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3, onrestoreinstancestate.TuitionPaymentFragmentbindingInflater1);
        Unit unit = Unit.INSTANCE;
        int i6 = connect + 17;
        read = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationSuccessActivity registrationSuccessActivity) {
        int i = 2 % 2;
        int i2 = connect + 51;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            registrationSuccessActivity.d = "0.0";
            registrationSuccessActivity.asBinder = "0.0";
            return Unit.INSTANCE;
        }
        registrationSuccessActivity.d = "0.0";
        registrationSuccessActivity.asBinder = "0.0";
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationSuccessActivity registrationSuccessActivity, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        int i = 2 % 2;
        String str3 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        registrationSuccessActivity.d = String.valueOf(userLocationComplete.b);
        registrationSuccessActivity.asBinder = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo != null) {
            int i2 = connect + 27;
            read = i2 % 128;
            int i3 = i2 % 2;
            str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str != null) {
                int i4 = connect + 57;
                read = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 0 / 0;
                }
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        registrationSuccessActivity.g = str;
        registrationSuccessActivity.cancelAll = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        } else {
            int i6 = connect + 121;
            read = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 75 / 0;
            }
        }
        registrationSuccessActivity.cancel = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null) {
            int i8 = connect + 109;
            read = i8 % 128;
            int i9 = i8 % 2;
            String str4 = locationAddressInfo3.d;
            if (str4 != null) {
                int i10 = connect + 117;
                read = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                str3 = str4;
            }
        }
        registrationSuccessActivity.notify = str3;
        String str5 = registrationSuccessActivity.d;
        String str6 = registrationSuccessActivity.asBinder;
        String str7 = registrationSuccessActivity.g;
        String str8 = registrationSuccessActivity.cancelAll;
        String str9 = registrationSuccessActivity.cancel;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str5);
        sb.append(", ");
        sb.append(str6);
        sb.append(", City: ");
        sb.append(str7);
        sb.append(", Province: ");
        sb.append(str8);
        sb.append(", Country: ");
        sb.append(str9);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        Unit unit = Unit.INSTANCE;
        int i11 = read + 71;
        connect = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    public static /* synthetic */ Unit g() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentbindingInflater1(1353244936, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[0], -1353244935, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static {
        IconCompatParcelizer = 0;
        d();
        INSTANCE = new Companion(null);
        int i = write + 7;
        IconCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(-1112007950, MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1(), MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 1112007953, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentbindingInflater1 = MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(-849887057, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 482264454 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_bni_details).substring(34, 36).codePointAt(1), new Object[]{this}, 849887061, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = read + 95;
        connect = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentbindingInflater1(-1301118885, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, 1301118887, MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step4).substring(3, 4).length() - 1930868884);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentbindingInflater1 = MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1();
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 712735917;
        TuitionPaymentFragmentbindingInflater1(2144521940, MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1(), zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, -2144521940, iTuitionPaymentFragmentbindingInflater1, i);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = read + 85;
        connect = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = read + 99;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    static void d() {
        INotificationSideChannelDefault = -448288073;
        INotificationSideChannelStub = -1934795618;
        getInterfaceDescriptor = 1482990104;
        RemoteActionCompatParcelizer = new byte[]{126, -23, -96, -16, -89, 19, 20, -78, -40, -20, -92, 27, -84, -42, -60, -94, 126, -24, 100, -35, -126, 100, -5, -64, -66, -12, -14, 100, -9, -16, -24, 98, 120, 118, -14, 99, -119, -44, 118, -15, 97, -8, -124, -123, 59, 98, 33, -88, -5, -8, -3, 108, -12, 109, 113, 20, 72, 25, 68, 71, 16, ByteCompanionObject.MAX_VALUE, -30, 19, 30, 79, 67, 25, 75};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = connect + 1;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity.$$c
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = 121 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L30
        L16:
            r3 = r2
        L17:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity.$$i(int, int, byte):java.lang.String");
    }
}
