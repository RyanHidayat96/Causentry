package com.bpjstku.presentation.membership.accountactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.databinding.ActivityActivationSuccessBinding;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity;
import com.bpjstku.presentation.membership.payment.PaymentActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import defpackage.Camera2CameraControlExternalSyntheticLambda4;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCamera2Interop;
import defpackage.TargetAspectRatio;
import defpackage.UseTorchAsFlash;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deInitSession;
import defpackage.generateCameraId;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getOpticalInsets;
import defpackage.initSession;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.mapPoint;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FileTreeWalk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0015\u0010\f\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0015\u0010\t\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\rR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001bR\u001a\u0010\u0018\u001a\u00020\u001d8\u0015X\u0095D¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u0013\u0010\u001f"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/ActivationSuccessActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityActivationSuccessBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "d", "Lkotlin/Lazy;", "Lcom/bpjstku/domain/registration/general/model/Registration;", "INotificationSideChannel", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "g", "LgetOpticalInsets;", "Lcom/bpjstku/data/lib/PreferenceManager;", "onTransact", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "notify", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivationSuccessActivity extends BindingBaseActivity<ActivityActivationSuccessBinding> {
    private static int INotificationSideChannelStub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] cancel;
    private static char cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String asBinder;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;
    private String a;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy asInterface;
    private static final byte[] $$c = {94, -56, 58, -24};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 186;
    private static int INotificationSideChannelDefault = 0;
    private static int notify = 0;
    private static int getInterfaceDescriptor = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: ActionBarOverlayLayout1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ActivationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: setOverlayMode
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ActivationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int onTransact = R.layout.activity_activation_success;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = ~(i7 | i);
        int i10 = i8 | i9;
        int i11 = ~i3;
        int i12 = ~(i7 | i11 | i);
        int i13 = ~i;
        int i14 = (~(i7 | i13 | i3)) | i12;
        int i15 = i9 | (~(i11 | i5));
        int i16 = i5 + i3 + i4 + ((-1696018712) * i6) + (2108813197 * i2);
        int i17 = i16 * i16;
        int i18 = ((212195308 * i5) - 2121662464) + (1221732374 * i3) + (1009537066 * i10) + (i14 * (-504768533)) + ((-504768533) * i15) + (716963840 * i4) + (39845888 * i6) + (227278848 * i2) + ((-1705377792) * i17);
        int i19 = ((i5 * 362004572) - 1408384217) + (i3 * 362004174) + (i10 * (-398)) + (i14 * 199) + (i15 * 199) + (i4 * 362004373) + (i6 * (-1290304248)) + (i2 * 155295761) + (i17 * (-60686336));
        int i20 = i18 + (i19 * i19 * (-1680474112));
        if (i20 != 1) {
            if (i20 != 2) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            }
            final ActivationSuccessActivity activationSuccessActivity = (ActivationSuccessActivity) objArr[0];
            int i21 = 2 % 2;
            ((ActivityActivationSuccessBinding) ((ViewBinding) activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnOk.setOnClickListener(new View.OnClickListener() { // from class: ActionBarOverlayLayout2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivationSuccessActivity.b(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
            int i22 = getInterfaceDescriptor + 37;
            notify = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }
        ActivationSuccessActivity activationSuccessActivity2 = (ActivationSuccessActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i24 = 2 % 2;
        int i25 = notify + 15;
        getInterfaceDescriptor = i25 % 128;
        int i26 = i25 % 2;
        if (((Field) cacheInteropConfig.b[0]).getInt(null) != (((~((-780621169) | i13)) | 243748928 | (~((-1610608712) | i13))) * (-397)) + 1316425792 + (((-1903732024) | i) * 397)) {
            throw new RuntimeException("1313139815");
        }
        if (((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null) != 387859130 + (((~(1774624117 | i13)) | 103817858) * (-108)) + (((~((-804431848) | i)) | 1074010128 | (~(804431847 | i13))) * 54) + ((i | 1074010128) * 54)) {
            throw null;
        }
        super.onCreate(bundle);
        int i27 = notify + 97;
        getInterfaceDescriptor = i27 % 128;
        int i28 = i27 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r6 = 144 - r6
            int r1 = 53 - r5
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
        L29:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/ActivationSuccessActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ActivationSuccessActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ActivationSuccessActivity() {
        final ActivationSuccessActivity activationSuccessActivity = this;
        this.d = LazyKt.lazy(new Function0<getOpticalInsets>() { // from class: com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getOpticalInsets, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getOpticalInsets invoke() {
                ComponentCallbacks componentCallbacks = activationSuccessActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getOpticalInsets.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asInterface = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = activationSuccessActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityActivationSuccessBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 3;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            ActivationSuccessActivity$bindingInflater$1 activationSuccessActivity$bindingInflater$1 = ActivationSuccessActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        ActivationSuccessActivity$bindingInflater$1 activationSuccessActivity$bindingInflater$2 = ActivationSuccessActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i3 = notify + 27;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return activationSuccessActivity$bindingInflater$2;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify + 71;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ((getOpticalInsets) this.d.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(this, new Observer() { // from class: setShowingForActionMode
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                ActivationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = getInterfaceDescriptor + 15;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ActivationSuccessActivity activationSuccessActivity = this;
        Intrinsics.checkNotNullParameter(activationSuccessActivity, "");
        activationSuccessActivity.getWindow().addFlags(8192);
        ExperimentalCamera2Interop.INSTANCE.b(this, new Function1() { // from class: setUiOptions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivationSuccessActivity.b(this.TuitionPaymentFragmentbindingInflater1, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: setWindowCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivationSuccessActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        if (((Registration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
            int i2 = notify + 41;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            ((ActivityActivationSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvRegistrationSuccessMessage.setText(getString(R.string.label_activation_success_message));
            ((ActivityActivationSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnOk.setText(getString(R.string.action_proceed_to_payment));
        }
        int i4 = notify + 41;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
            int i3 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 141), bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iCombineMeasuredStates, i3, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{'\n', '\t', 19, 17, 23, 5, 16, 3, 0, 20, 0, 11, 15, 16, 4, '\t', '\f', 16, 22, 21, 7, 1}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 37), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step3).substring(0, 3).codePointAt(2) + 13, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{1, 24, '\n', 4, 19, 0, 19, '\b', '\t', 19, 22, 20, 6, '\r', 13883}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 24), TextUtils.lastIndexOf("", '0') + 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
            int i4 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 89), bArr2[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, packedPositionChild, i4, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) Color.green(0);
                int offsetAfter = 1031 - TextUtils.getOffsetAfter("", 0);
                int iBlue = 15 - Color.blue(0);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) 52, (short) (-bArr3[2]), bArr3[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, offsetAfter, iBlue, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = (((((~(157330080 | i7)) | (~(iIdentityHashCode | 401610250))) * 959) - 602853443) + (((~(iIdentityHashCode | 157330080)) | (~(i7 | 401610250))) * 959)) - 1266736454;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{24, '\r', '\t', '\f', 6, 1, '\n', '\t', 11, 2, 14, 15, 19, 20, 1, 14}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 55), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.done).substring(4, 5).length() + 15, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{'\r', 23, 0, '\t', 23, '\t', 4, 24, 14, '\n', 17, 20, 15, 22, 19, 3}, (byte) (89 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 16 - TextUtils.getTrimmedLength(""), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1364732080};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - ExpandableListView.getPackedPositionType(0L)), TextUtils.getOffsetBefore("", 0) + 1134, 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1266736454, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                    int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                    byte[] bArr4 = $$a;
                    byte b3 = bArr4[7];
                    Object[] objArr12 = new Object[1];
                    c(b3, (short) (b3 | 141), bArr4[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, iRgb, scrollBarFadeDuration, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Drawable.resolveOpacity(0, 0)), 1118 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int iIndexOf = 1031 - TextUtils.indexOf("", "");
                    int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte[] bArr5 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((byte) 52, (short) (-bArr5[2]), bArr5[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop, iIndexOf, modifierMetaStateMask, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{'\n', '\t', 19, 17, 23, 5, 16, 3, 0, 20, 0, 11, 15, 16, 4, '\t', '\f', 16, 22, 21, 7, 1}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 50), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_hint_xl_order_id).substring(14, 15).length() + 21, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{1, 24, '\n', 4, 19, 0, 19, '\b', '\t', 19, 22, 20, 6, '\r', 13883}, (byte) (Color.rgb(0, 0, 0) + 16777276), (Process.myPid() >> 22) + 15, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i11 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                        int iGreen = Color.green(0) + 15;
                        byte[] bArr6 = $$a;
                        byte b4 = bArr6[7];
                        Object[] objArr16 = new Object[1];
                        c(b4, (short) (b4 | 89), bArr6[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatDelay, i11, iGreen, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
                        int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr7 = $$a;
                        byte b5 = bArr7[7];
                        Object[] objArr17 = new Object[1];
                        c(b5, (short) (b5 | 141), bArr7[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, absoluteGravity, deadChar, 1357589585, false, (String) objArr17[0], null);
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
            if (strArr2 != null) {
                int i12 = notify + 75;
                getInterfaceDescriptor = i12 % 128;
                int i13 = i12 % 2;
                while (i2 < strArr2.length) {
                    int i14 = getInterfaceDescriptor + 41;
                    notify = i14 % 128;
                    if (i14 % 2 != 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 39;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[3])[0];
        int i17 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i18 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        int i19 = i15 + (-1013556763) + ((~(234741607 | i18)) * 52) + (((~(10341383 | i18)) | (~((-233938787) | i18)) | 224400224) * (-52)) + (((~(i18 | (-10341384))) | 802821) * 52);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
            int i22 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
            byte[] bArr8 = $$a;
            Object[] objArr19 = new Object[1];
            c((byte) (bArr8[33] - 1), (short) (-bArr8[2]), bArr8[132], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iIndexOf2, i22, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char bitsPerPixel2 = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                int keyRepeatDelay2 = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte[] bArr9 = $$a;
                byte b6 = bArr9[7];
                Object[] objArr20 = new Object[1];
                c(b6, (short) (b6 | 89), bArr9[132], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(bitsPerPixel2, packedPositionType, keyRepeatDelay2, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i23 = ((int[]) objArr21[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i23}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = 1332474231 + (((~iIdentityHashCode2) | 527725146) * 1444) + (((~(iIdentityHashCode2 | (-702922258))) | (~(915524683 | iIdentityHashCode2)) | 157561360) * (-1444)) + 1740812495;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{24, '\r', '\t', '\f', 6, 1, '\n', '\t', 11, 2, 14, 15, 19, 20, 1, 14}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 30), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{'\r', 23, 0, '\t', 23, '\t', 4, 24, 14, '\n', 17, 20, 15, 22, 19, 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima7).substring(105, 113).length() + 81), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay).substring(1, 3).codePointAt(1) - 105, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-1364732080};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 42049), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1725, 29 - (Process.myPid() >> 22), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 506279285);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                int scrollBarFadeDuration2 = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i27 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23;
                byte[] bArr10 = $$a;
                byte b7 = bArr10[7];
                Object[] objArr25 = new Object[1];
                c(b7, (short) (b7 | 89), bArr10[132], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(tapTimeout, scrollBarFadeDuration2, i27, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{'\n', '\t', 19, 17, 23, 5, 16, 3, 0, 20, 0, 11, 15, 16, 4, '\t', '\f', 16, 22, 21, 7, 1}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step1).substring(0, 1).codePointAt(0) - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 76, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{1, 24, '\n', 4, 19, 0, 19, '\b', '\t', 19, 22, 20, 6, '\r', 13883}, (byte) (Color.red(0) + 60), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.thank_you).substring(0, 1).length() + 14, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char offsetAfter2 = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                    int keyRepeatTimeout = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                    byte[] bArr11 = $$a;
                    byte b8 = bArr11[7];
                    Object[] objArr28 = new Object[1];
                    c(b8, b8, bArr11[132], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetAfter2, keyRepeatTimeout, doubleTapTimeout, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                    int gidForName = 1754 - Process.getGidForName("");
                    int i28 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr12 = $$a;
                    Object[] objArr29 = new Object[1];
                    c((byte) (bArr12[33] - 1), (short) (-bArr12[2]), bArr12[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveOpacity, gidForName, i28, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrB$5f1425da[0])[0] != ((int[]) objArrB$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrB$5f1425da[4];
            if (strArr4 != null) {
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i29 = notify + 13;
        getInterfaceDescriptor = i29 % 128;
        int i30 = i29 % 2;
        int i31 = ((int[]) objArrB$5f1425da[3])[0];
        int i32 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr30 = {new int[]{i32}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i33 = i31 + 1203717843 + (((~iIdentityHashCode3) | 540020804) * 1324) + (((~(iIdentityHashCode3 | (-528769579))) | (~(741372004 | iIdentityHashCode3))) * (-1324)) + 1280878518;
        int i34 = (i33 << 13) ^ i33;
        int i35 = i34 ^ (i34 >>> 17);
        ((int[]) objArr30[3])[0] = i35 ^ (i35 << 5);
        int i36 = notify + 65;
        getInterfaceDescriptor = i36 % 128;
        if (i36 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x010f  */
    /* JADX WARN: Code duplicated, block: B:34:0x012f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0179 A[Catch: all -> 0x0321, TryCatch #0 {all -> 0x0321, blocks: (B:35:0x0131, B:37:0x0179, B:38:0x01ed), top: B:71:0x0131 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0200  */
    /* JADX WARN: Code duplicated, block: B:44:0x023d A[Catch: all -> 0x0354, TryCatch #1 {all -> 0x0354, blocks: (B:7:0x001d, B:9:0x002b, B:10:0x005d, B:14:0x0073, B:16:0x0081, B:17:0x00ab, B:42:0x0202, B:44:0x023d, B:46:0x02a4), top: B:73:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x02ff  */
    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = cancel;
        Object obj2 = null;
        int i4 = 6;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 2267 - ((Process.getThreadPriority(0) + 20) >> i4), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32, -1927765101, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i5++;
                    i4 = 6;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(cancelAll)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 2267 - (ViewConfiguration.getPressedStateDuration() >> 16), 33 - View.resolveSize(0, 0), -1927765101, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $11 + 27;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i8 = $10 + 91;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i9 = $11 + 9;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        try {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49267), 3261 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 30 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -127612708, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = b8;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22877 - TextUtils.indexOf((CharSequence) "", '0')), View.MeasureSpec.getSize(0) + 594, Color.green(0) + 17, 1570859318, false, $$i(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    int i12 = $11 + 77;
                                    $10 = i12 % 128;
                                    int i13 = i12 % 2;
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                } else {
                                    int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i18 = $11 + 9;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49267), 3261 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 30 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -127612708, false, $$i(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22877 - TextUtils.indexOf((CharSequence) "", '0')), View.MeasureSpec.getSize(0) + 594, Color.green(0) + 17, 1570859318, false, $$i(b12, b13, (byte) (b13 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i111 = $11 + 77;
                                $10 = i111 % 128;
                                int i112 = i111 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                            } else {
                                int i115 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i116 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i115];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i116];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i20 = 0;
        while (i20 < i) {
            int i21 = $10 + 1;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                cArr4[i20] = (char) (cArr4[i20] ^ 31540);
                i20 += 18;
            } else {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                i20++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i3 = ~System.identityHashCode(this);
        if (i2 != ((1563865192 + (((~(i3 | 938982381)) | (~((-24117381) | i3))) * (-184))) + (((42438729 | (~((-66556110) | i3))) | (~(896543652 | i3))) * 184)) - 1612644280) {
            int i4 = notify + 77;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                int[] iArr = new int[1473505412];
                iArr[1473505411] = 0;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1473505412];
                iArr2[1473505411] = 1;
                int i5 = 2096339852 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
            int i6 = getInterfaceDescriptor + 31;
            notify = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMyTid = Process.myTid();
        if (i8 != (-1193462180) + (((~((-1546855594) | iMyTid)) | 469901473) * 576) + (((~((~iMyTid) | (-1076954121))) | 562298898) * 576) + 80308800) {
            int i9 = (-411309406) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i10 = notify + 11;
        getInterfaceDescriptor = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -105243037
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
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity.onStart():void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ActivationSuccessActivity activationSuccessActivity) throws IOException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) activationSuccessActivity.asInterface.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B == null || !camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "0.0";
            activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        } else {
            activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            activationSuccessActivity.TuitionPaymentFragmentbindingInflater1 = camera2CameraControlExternalSyntheticLambda4B.b;
            activationSuccessActivity.a = camera2CameraControlExternalSyntheticLambda4B.g;
            activationSuccessActivity.g = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            activationSuccessActivity.asBinder = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 13;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivationSuccessActivity activationSuccessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 101;
        notify = i3 % 128;
        int i4 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i2 + 67;
            notify = i5 % 128;
            int i6 = i5 % 2;
            activationSuccessActivity.MediaBrowserCompat();
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            activationSuccessActivity.IconCompatParcelizer();
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activationSuccessActivity, null, null, 6);
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().b(new UseTorchAsFlash());
            activationSuccessActivity.d_();
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        activationSuccessActivity.IconCompatParcelizer();
        String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNull(str, "");
        Toast toastMakeText = Toast.makeText(activationSuccessActivity, str, 0);
        toastMakeText.show();
        Intrinsics.checkExpressionValueIsNotNull(toastMakeText, "");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IOException {
        String str;
        String str2;
        String str3;
        ActivationSuccessActivity activationSuccessActivity = (ActivationSuccessActivity) objArr[0];
        UserLocationComplete userLocationComplete = (UserLocationComplete) objArr[1];
        int i = 2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = String.valueOf(userLocationComplete.b);
        activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = null;
        if (locationAddressInfo != null) {
            int i2 = notify + 1;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                String str5 = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                obj.hashCode();
                throw null;
            }
            str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        activationSuccessActivity.TuitionPaymentFragmentbindingInflater1 = str;
        activationSuccessActivity.a = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        } else {
            int i3 = notify + 69;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
        activationSuccessActivity.g = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 == null || (str3 = locationAddressInfo3.d) == null) {
            int i4 = notify + 115;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = notify + 109;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str4 = str3;
        }
        activationSuccessActivity.asBinder = str4;
        String str6 = activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str7 = activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str8 = activationSuccessActivity.TuitionPaymentFragmentbindingInflater1;
        String str9 = activationSuccessActivity.a;
        String str10 = activationSuccessActivity.g;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str6);
        sb.append(", ");
        sb.append(str7);
        sb.append(", City: ");
        sb.append(str8);
        sb.append(", Province: ");
        sb.append(str9);
        sb.append(", Country: ");
        sb.append(str10);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivationSuccessActivity activationSuccessActivity) {
        int i = 2 % 2;
        int i2 = notify + 3;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return (RegisteredMemberRegistration) activationSuccessActivity.getIntent().getParcelableExtra("registration_data");
        }
        throw null;
    }

    public static /* synthetic */ Registration TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivationSuccessActivity activationSuccessActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Registration registration = (Registration) activationSuccessActivity.getIntent().getParcelableExtra("successful_unregistered_registration_data");
        int i3 = getInterfaceDescriptor + 23;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return registration;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a A[Catch: all -> 0x01bc, TRY_ENTER, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x000c, B:7:0x001c, B:10:0x0021, B:15:0x0037, B:22:0x005a, B:27:0x0067, B:28:0x007c, B:30:0x0082, B:32:0x0091, B:33:0x0095, B:45:0x00e5, B:47:0x00ef, B:51:0x0136, B:53:0x013b, B:55:0x0145, B:57:0x014a, B:58:0x0171, B:60:0x017b, B:61:0x01b8, B:25:0x0061, B:18:0x0044, B:34:0x00af, B:38:0x00c1), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[Catch: all -> 0x01bc, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x000c, B:7:0x001c, B:10:0x0021, B:15:0x0037, B:22:0x005a, B:27:0x0067, B:28:0x007c, B:30:0x0082, B:32:0x0091, B:33:0x0095, B:45:0x00e5, B:47:0x00ef, B:51:0x0136, B:53:0x013b, B:55:0x0145, B:57:0x014a, B:58:0x0171, B:60:0x017b, B:61:0x01b8, B:25:0x0061, B:18:0x0044, B:34:0x00af, B:38:0x00c1), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[Catch: all -> 0x01bc, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x000c, B:7:0x001c, B:10:0x0021, B:15:0x0037, B:22:0x005a, B:27:0x0067, B:28:0x007c, B:30:0x0082, B:32:0x0091, B:33:0x0095, B:45:0x00e5, B:47:0x00ef, B:51:0x0136, B:53:0x013b, B:55:0x0145, B:57:0x014a, B:58:0x0171, B:60:0x017b, B:61:0x01b8, B:25:0x0061, B:18:0x0044, B:34:0x00af, B:38:0x00c1), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: all -> 0x01bc, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x000c, B:7:0x001c, B:10:0x0021, B:15:0x0037, B:22:0x005a, B:27:0x0067, B:28:0x007c, B:30:0x0082, B:32:0x0091, B:33:0x0095, B:45:0x00e5, B:47:0x00ef, B:51:0x0136, B:53:0x013b, B:55:0x0145, B:57:0x014a, B:58:0x0171, B:60:0x017b, B:61:0x01b8, B:25:0x0061, B:18:0x0044, B:34:0x00af, B:38:0x00c1), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1 A[Catch: all -> 0x01bc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x000c, B:7:0x001c, B:10:0x0021, B:15:0x0037, B:22:0x005a, B:27:0x0067, B:28:0x007c, B:30:0x0082, B:32:0x0091, B:33:0x0095, B:45:0x00e5, B:47:0x00ef, B:51:0x0136, B:53:0x013b, B:55:0x0145, B:57:0x014a, B:58:0x0171, B:60:0x017b, B:61:0x01b8, B:25:0x0061, B:18:0x0044, B:34:0x00af, B:38:0x00c1), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x007c A[SYNTHETIC] */
    public static /* synthetic */ void b(ActivationSuccessActivity activationSuccessActivity, View view) {
        String str;
        int i;
        String str2;
        int i2;
        ArrayList arrayList;
        int i3 = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            String strJoinToString$default = activationSuccessActivity.TuitionPaymentFragmentbindingInflater1;
            if (strJoinToString$default == null) {
                int i4 = getInterfaceDescriptor + 5;
                notify = i4 % 128;
                int i5 = i4 % 2;
                strJoinToString$default = "";
            }
            String str3 = activationSuccessActivity.g;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = strJoinToString$default;
            if (!StringsKt.isBlank(str4)) {
                int i6 = notify + 49;
                getInterfaceDescriptor = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 25 / 0;
                    if (!StringsKt.isBlank(str3)) {
                        i2 = getInterfaceDescriptor + 121;
                        notify = i2 % 128;
                        if (i2 % 2 != 0) {
                            if (!StringsKt.equals(str3, "Indonesia", true)) {
                                List listListOf = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default, str3});
                                arrayList = new ArrayList();
                                for (Object obj : listListOf) {
                                    if (!StringsKt.isBlank((String) obj)) {
                                        arrayList.add(obj);
                                    }
                                }
                                strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
                            }
                            str = strJoinToString$default;
                        } else if (!StringsKt.equals(str3, "Indonesia", true)) {
                            List listListOf2 = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default, str3});
                            arrayList = new ArrayList();
                            while (r4.hasNext()) {
                                if (!StringsKt.isBlank((String) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
                            str = strJoinToString$default;
                        }
                    }
                } else if (!StringsKt.isBlank(str3)) {
                    i2 = getInterfaceDescriptor + 121;
                    notify = i2 % 128;
                    if (i2 % 2 != 0) {
                        if (!StringsKt.equals(str3, "Indonesia", true)) {
                            List listListOf3 = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default, str3});
                            arrayList = new ArrayList();
                            while (r4.hasNext()) {
                                if (!StringsKt.isBlank((String) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
                        }
                        str = strJoinToString$default;
                    } else if (!StringsKt.equals(str3, "Indonesia", true)) {
                        List listListOf4 = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default, str3});
                        arrayList = new ArrayList();
                        while (r4.hasNext()) {
                            if (!StringsKt.isBlank((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
                        str = strJoinToString$default;
                    }
                }
                if (!StringsKt.isBlank(str4)) {
                    int i8 = notify + 119;
                    getInterfaceDescriptor = i8 % 128;
                    int i9 = i8 % 2;
                    str = strJoinToString$default;
                } else if (StringsKt.isBlank(str3)) {
                    int i10 = notify + 103;
                    getInterfaceDescriptor = i10 % 128;
                    int i11 = i10 % 2;
                    str = "";
                } else {
                    i = getInterfaceDescriptor + 93;
                    notify = i % 128;
                    if (i % 2 != 0) {
                        int i12 = 4 % 4;
                    }
                    str = str3;
                }
            } else if (!StringsKt.isBlank(str4)) {
                int i13 = notify + 119;
                getInterfaceDescriptor = i13 % 128;
                int i14 = i13 % 2;
                str = strJoinToString$default;
            } else if (StringsKt.isBlank(str3)) {
                i = getInterfaceDescriptor + 93;
                notify = i % 128;
                if (i % 2 != 0) {
                    int i15 = 4 % 4;
                }
                str = str3;
            } else {
                int i16 = notify + 103;
                getInterfaceDescriptor = i16 % 128;
                int i17 = i16 % 2;
                str = "";
            }
            if (((RegisteredMemberRegistration) activationSuccessActivity.b.getValue()) != null) {
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_activation_account", "activation_account_registered_member_success"));
                Intrinsics.checkNotNullParameter(activationSuccessActivity, "");
                Intrinsics.checkNotNullParameter("activation_account_registered_member_success", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("activation_account_registered_member_success", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("activation_account_registered_member_success", mapMutableMapOf);
                getOpticalInsets getopticalinsets = (getOpticalInsets) activationSuccessActivity.d.getValue();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) activationSuccessActivity.b.getValue();
                if (registeredMemberRegistration != null) {
                    int i18 = getInterfaceDescriptor + 37;
                    notify = i18 % 128;
                    int i19 = i18 % 2;
                    str2 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                } else {
                    str2 = null;
                }
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) activationSuccessActivity.b.getValue();
                String str5 = registeredMemberRegistration2 != null ? registeredMemberRegistration2.cancelAll : null;
                String string = Settings.Secure.getString(activationSuccessActivity.getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string, "");
                String str6 = activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String str7 = activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str8 = Build.BRAND;
                Intrinsics.checkNotNullExpressionValue(str8, "");
                String str9 = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(str9, "");
                getopticalinsets.b(str2, str5, string, str6, str7, str, str8, str9);
            }
            if (((Registration) activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_event_activate_account", "activation_account_unregistered_member_success"));
                Intrinsics.checkNotNullParameter(activationSuccessActivity, "");
                Intrinsics.checkNotNullParameter("activation_account_unregistered_member_success", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("activation_account_unregistered_member_success", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("activation_account_unregistered_member_success", mapMutableMapOf2);
                PaymentActivity.Companion bVar = PaymentActivity.INSTANCE;
                PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activationSuccessActivity, (Registration) activationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
                activationSuccessActivity.d_();
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(ActivationSuccessActivity activationSuccessActivity, UserLocationComplete userLocationComplete) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(new Object[]{activationSuccessActivity, userLocationComplete}, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1732601649, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1732601649, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static {
        INotificationSideChannelStub = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelDefault + 87;
        INotificationSideChannelStub = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1(new Object[]{this}, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -114888024, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 114888026, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TuitionPaymentFragmentbindingInflater1(new Object[]{this, bundle}, CameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 182344718, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -182344717, CameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    static void g() {
        cancel = new char[]{60043, 60117, 60048, 60042, 60062, 60053, 60056, 60045, 60050, 60073, 60072, 60054, 60060, 60083, 60058, 60040, 60041, 60088, 60063, 60034, 60052, 60055, 60051, 60049, 60047};
        cancelAll = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r8 = r8 + 113
            byte[] r1 = com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity.$$i(int, short, byte):java.lang.String");
    }
}
