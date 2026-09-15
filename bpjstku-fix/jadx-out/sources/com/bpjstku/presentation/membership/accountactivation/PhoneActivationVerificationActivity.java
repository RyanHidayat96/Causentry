package com.bpjstku.presentation.membership.accountactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.data.registration.general.model.request.PhoneActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.databinding.ActivityPhoneActivationVerificationBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.gms.internal.mlkit_common.zzin;
import com.google.android.material.button.MaterialButton;
import defpackage.BufferProviderState;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.UseTorchAsFlash;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deriveCodec;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getItemView;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setSplitTrack;
import defpackage.setVideoStabilizationMode;
import defpackage.share;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0007\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0017\u0010!\u001a\u0004\u0018\u00010 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010#R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020$8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010&R\u0014\u0010\n\u001a\u00020'8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010("}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/PhoneActivationVerificationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityPhoneActivationVerificationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "onBackPressed", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "onDestroy", "", "INotificationSideChannel", "()Ljava/lang/String;", "LUseTorchAsFlash;", "p0", "onClosePageEvent", "(LUseTorchAsFlash;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LsetSplitTrack;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhoneActivationVerificationActivity extends BindingReactiveFormActivity<ActivityPhoneActivationVerificationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asBinder;
    private static char[] g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private CodeNamePair b;
    private static final byte[] $$c = {115, 98, 19, 9};
    private static final int $$f = 154;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {39, 27, 2, 54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 52;
    private static int asInterface = 1;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f500a = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: ActionMenuPresenterOpenOverflowRunnable
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PhoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: ActionMenuPresenterActionMenuPopupCallback
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (RegistrationForUnregistered) PhoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2138392215, -2138392211);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        Object obj;
        int i7 = (~(i5 | i)) | i6;
        int i8 = ~i5;
        int i9 = ~((~i6) | i8 | i);
        int i10 = (~(i | i6)) | (~(i8 | (~i)));
        int i11 = i5 + i6 + i2 + (1616745821 * i3) + (2077170981 * i4);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i5) + 1587019776 + (806482222 * i6) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i2) + ((-395313152) * i3) + (904921088 * i4) + (345505792 * i12);
        int i14 = (i5 * (-1558553916)) + 318941677 + (i6 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i2 * (-1558553459)) + (i3 * 397062201) + (i4 * 609114465) + (i12 * (-138936320));
        int i15 = i13 + (i14 * i14 * 1630011392);
        if (i15 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i15 == 2) {
            int i16 = 2 % 2;
            int i17 = f500a + 119;
            d = i17 % 128;
            int i18 = i17 % 2;
            obj = Unit.INSTANCE;
            int i19 = d + 27;
            f500a = i19 % 128;
            int i20 = i19 % 2;
        } else {
            if (i15 == 3) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            }
            if (i15 != 4) {
                return i15 != 5 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            }
            PhoneActivationVerificationActivity phoneActivationVerificationActivity = (PhoneActivationVerificationActivity) objArr[0];
            int i21 = 2 % 2;
            int i22 = f500a + 89;
            d = i22 % 128;
            int i23 = i22 % 2;
            obj = (RegistrationForUnregistered) phoneActivationVerificationActivity.getIntent().getParcelableExtra("unregistered_data");
            int i24 = f500a + 5;
            d = i24 % 128;
            int i25 = i24 % 2;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 1
            int r8 = r8 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/PhoneActivationVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, PhoneActivationVerificationActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, PhoneActivationVerificationActivity.class, new Pair[]{TuplesKt.to("unregistered_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PhoneActivationVerificationActivity() {
        final PhoneActivationVerificationActivity phoneActivationVerificationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = phoneActivationVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityPhoneActivationVerificationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f500a + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
        PhoneActivationVerificationActivity$bindingInflater$1 phoneActivationVerificationActivity$bindingInflater$1 = PhoneActivationVerificationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            return phoneActivationVerificationActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        INotificationSideChannelStub().btnNext.setOnClickListener(new View.OnClickListener() { // from class: ActionMenuPresenterOverflowMenuButton1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneActivationVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        INotificationSideChannelStub().tvPrefix.setOnClickListener(new View.OnClickListener() { // from class: performClick
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        int i2 = f500a + 47;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = d + 45;
        f500a = i2 % 128;
        int i3 = i2 % 2;
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        int i4 = d + 63;
        f500a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = d + 27;
        f500a = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        d_();
        int i4 = f500a + 65;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = g;
        char c = '0';
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)));
                        int iLastIndexOf = 1269 - TextUtils.lastIndexOf("", c);
                        int iAlpha = Color.alpha(i3) + 18;
                        byte b = (byte) i3;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iLastIndexOf, iAlpha, 407021364, false, $$i(b, b2, (byte) (-b2)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    i5 = 1;
                    c = '0';
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            int i10 = $10 + 97;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c3 = 0;
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i12 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 3225 - TextUtils.indexOf("", ""), '=' - AndroidCharacter.getMirror('0'), 2133916302, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944), 1755 - Color.green(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22, 387247676, false, $$i(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c3 = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 41241), Drawable.resolveOpacity(0, 0) + 1705, 21 - Color.argb(0, 0, 0, 0), -1434471773, false, $$i(b7, b8, (byte) (b8 & 6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i14 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i14, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i14);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            setvideostabilizationmode.b = i;
            int i15 = $10 + 43;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 3 / 4;
            }
            while (setvideostabilizationmode.b < i6) {
                cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            setvideostabilizationmode.b = 0;
            while (setvideostabilizationmode.b < i6) {
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
                int i17 = $10 + 67;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        PhoneActivationVerificationActivity phoneActivationVerificationActivity = this;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).INotificationSideChannelDefault.observe(phoneActivationVerificationActivity, new Observer() { // from class: setItemLimit
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneActivationVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).RemoteActionCompatParcelizer.observe(phoneActivationVerificationActivity, new Observer() { // from class: ActionMenuPresenterActionButtonSubmenu
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).IconCompatParcelizer.observe(phoneActivationVerificationActivity, new Observer() { // from class: setWidthLimit
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = f500a + 67;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = f500a + 123;
        d = i2 % 128;
        int i3 = i2 % 2;
        PhoneActivationVerificationActivity phoneActivationVerificationActivity = this;
        Intrinsics.checkNotNullParameter(phoneActivationVerificationActivity, "");
        phoneActivationVerificationActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_phone_number_verification));
        if (((RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
            INotificationSideChannelStub().tvEnterPhoneNumberInstruction.setText(getString(R.string.label_edit_phone_number_instruction));
            int i4 = d + 117;
            f500a = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        PhoneActivationVerificationActivity phoneActivationVerificationActivity = (PhoneActivationVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 21;
        f500a = i2 % 128;
        int i3 = i2 % 2;
        ActivityPhoneActivationVerificationBinding activityPhoneActivationVerificationBindingINotificationSideChannelStub = phoneActivationVerificationActivity.INotificationSideChannelStub();
        if (i3 == 0) {
            MaterialButton materialButton = activityPhoneActivationVerificationBindingINotificationSideChannelStub.btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
        } else {
            MaterialButton materialButton3 = activityPhoneActivationVerificationBindingINotificationSideChannelStub.btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(false);
        }
        int i4 = f500a + 5;
        d = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = d + 3;
        f500a = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
            return;
        }
        MaterialButton materialButton3 = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        MaterialButton materialButton4 = materialButton3;
        Intrinsics.checkNotNullParameter(materialButton4, "");
        materialButton4.setEnabled(true);
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        EditText editText = INotificationSideChannelStub().edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(editText, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(editText, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        int i2 = f500a + 83;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = d + 107;
        f500a = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
        int i4 = d + 105;
        f500a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }

    private final String INotificationSideChannel() {
        int i = 2 % 2;
        String strReplace$default = StringsKt.replace$default(StringsKt.trim((CharSequence) INotificationSideChannelStub().tvPrefix.getText().toString()).toString(), "+", "", false, 4, (Object) null);
        String string = StringsKt.trim((CharSequence) INotificationSideChannelStub().edtPhoneNumber.getText().toString()).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(strReplace$default);
        sb.append(string);
        String string2 = sb.toString();
        int i2 = d + 21;
        f500a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return string2;
    }

    @Subscribe(TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ThreadMode.MAIN)
    public final void onClosePageEvent(UseTorchAsFlash p0) {
        int i = 2 % 2;
        int i2 = f500a + 37;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            d_();
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            d_();
            int i3 = 57 / 0;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = d + 109;
        f500a = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                onBackPressed();
                int i3 = d + 39;
                f500a = i3 % 128;
                int i4 = i3 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 0;
        PhoneActivationVerificationActivity phoneActivationVerificationActivity = (PhoneActivationVerificationActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iIndexOf = 1031 - TextUtils.indexOf("", "");
            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 15;
            byte b = (byte) $$b;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(b, bArr[7], bArr[5], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, iIndexOf, iIndexOf2, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new int[]{0, 22, 82, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new int[]{22, 15, 0, 1}, true, new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int i3 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
            byte b2 = (byte) $$b;
            byte b3 = $$a[7];
            Object[] objArr6 = new Object[1];
            c(b2, b3, (short) (b3 | 51), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i3, tapTimeout, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                byte b5 = bArr2[132];
                Object[] objArr7 = new Object[1];
                c(b4, b5, (short) (b5 | 102), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, iIndexOf3, iKeyCodeFromString, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr8[3])[0];
            int i5 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iNextInt = new Random().nextInt();
            int i6 = (-1534657273) + ((iNextInt | 190250056) * (-50));
            int i7 = ~((-51407873) | iNextInt);
            int i8 = ~iNextInt;
            int i9 = ((i6 + (((~(i8 | (-2622242))) | i7) * 50)) + (((~(i8 | 190250056)) | ((~((-54030114) | i8)) | 2622241)) * 50)) - 1461066836;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr2[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new int[]{37, 16, 59, 0}, true, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new int[]{53, 16, 30, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, phoneActivationVerificationActivity)).intValue();
            try {
                Object[] objArr11 = {-1690202320};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getSize(0) + 46038), 1134 - View.combineMeasuredStates(0, 0), 18 - (Process.myPid() >> 22), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -1461066836, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                    int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                    byte b6 = (byte) $$b;
                    byte[] bArr3 = $$a;
                    Object[] objArr13 = new Object[1];
                    c(b6, bArr3[7], bArr3[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, i12, packedPositionType, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1117 - Color.argb(0, 0, 0, 0), 17 - TextUtils.indexOf("", "", 0)), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int mirror = 1079 - AndroidCharacter.getMirror('0');
                    int i13 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr4 = $$a;
                    byte b7 = bArr4[7];
                    byte b8 = bArr4[132];
                    Object[] objArr14 = new Object[1];
                    c(b7, b8, (short) (b8 | 102), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, mirror, i13, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new int[]{0, 22, 82, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new int[]{22, 15, 0, 1}, true, new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                        int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
                        byte b9 = (byte) $$b;
                        byte b10 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c(b9, b10, (short) (b10 | 51), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iNormalizeMetaState, iIndexOf4, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                        int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 15;
                        byte b11 = (byte) $$b;
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c(b11, bArr5[7], bArr5[5], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf2, offsetAfter, packedPositionType2, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[0];
            if (strArr2 == null) {
                throw null;
            }
            while (i < strArr2.length) {
                int i14 = d + 113;
                f500a = i14 % 128;
                if (i14 % 2 == 0) {
                    arrayList.add(strArr2[i]);
                } else {
                    arrayList.add(strArr2[i]);
                    i++;
                }
            }
            throw null;
        }
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i15 = ((int[]) objArr2[2])[0];
        int i16 = ((int[]) objArr2[3])[0];
        int i17 = ((int[]) objArr2[1])[0];
        String[] strArr3 = (String[]) objArr2[0];
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i18 = i15 + 385366201 + (((~((-1086323) | (~startElapsedRealtime))) | (~(243193847 | startElapsedRealtime))) * (-272)) + (((~((-75028472) | startElapsedRealtime)) | 73942149) * (-272)) + (((~(startElapsedRealtime | 75028471)) | 169251698) * 272);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr19[2])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
            int i21 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i22 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte b12 = $$a[7];
            Object[] objArr20 = new Object[1];
            c((byte) 37, b12, (short) (b12 | 103), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(trimmedLength, i21, i22, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                int i23 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b13 = (byte) $$b;
                byte b14 = $$a[7];
                Object[] objArr21 = new Object[1];
                c(b13, b14, (short) (b14 | 51), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, maximumDrawingCacheSize, i23, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i24 = (((867239111 + (((~((~iUptimeMillis) | (-17826050))) | (~(201263029 | iUptimeMillis))) * (-302))) + ((~((-17826050) | iUptimeMillis)) * (-604))) + (((~(iUptimeMillis | 183436980)) | 172097584) * 302)) - 1744609226;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new int[]{37, 16, 59, 0}, true, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new int[]{53, 16, 30, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, phoneActivationVerificationActivity)).intValue();
            Object[] objArr25 = {-1690202320};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - TextUtils.indexOf("", "", 0)), 1726 - Drawable.resolveOpacity(0, 0), 28 - TextUtils.lastIndexOf("", '0', 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1744609226, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                int maxKeyCode2 = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
                int i27 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                byte b15 = (byte) $$b;
                byte b16 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b15, b16, (short) (b16 | 51), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumFlingVelocity, maxKeyCode2, i27, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{0, 22, 82, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{22, 15, 0, 1}, true, new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                    int iAlpha = 1755 - Color.alpha(0);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                    byte b17 = (byte) $$b;
                    byte b18 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c(b17, b18, (short) (b18 | 140), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, iAlpha, minimumFlingVelocity, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                    int offsetAfter2 = 1755 - TextUtils.getOffsetAfter("", 0);
                    int iIndexOf5 = 23 - TextUtils.indexOf("", "");
                    byte b19 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c((byte) 37, b19, (short) (b19 | 103), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(edgeSlop2, offsetAfter2, iIndexOf5, 986134021, false, (String) objArr30[0], null);
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
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i31 = ~startElapsedRealtime2;
            int i32 = ~((-654654942) | i31);
            int i33 = ~(442052515 | startElapsedRealtime2);
            int i34 = i30 + (-1774707662) + ((i32 | i33) * 1150) + (((~((-442052516) | i31)) | i33) * (-575)) + (((~(startElapsedRealtime2 | (-654654942))) | (~(i31 | 654654941))) * 575);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr31[3])[0] = i36 ^ (i36 << 5);
            int i37 = d + 17;
            f500a = i37 % 128;
            int i38 = i37 % 2;
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
        if (strArr4 != null) {
            for (String str : strArr4) {
                int i39 = f500a + 33;
                d = i39 % 128;
                int i40 = i39 % 2;
                arrayList2.add(str);
            }
        }
        int[] iArr = new int[i29];
        int i41 = i29 - 1;
        iArr[i41] = 1;
        Toast.makeText((Context) null, iArr[((i29 * i41) % 2) - 1], 1).show();
        int i42 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int iMyUid = Process.myUid();
        int i43 = ~iMyUid;
        int i44 = i42 + 1570948405 + (((~((-706369547) | i43)) | 570572800) * (-108)) + (((~(i43 | 918971972)) | (~((-918971973) | iMyUid)) | (-1054768719)) * 54) + ((iMyUid | (-1054768719)) * 54);
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr32[3])[0] = i46 ^ (i46 << 5);
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IllegalAccessException {
        PhoneActivationVerificationActivity phoneActivationVerificationActivity = (PhoneActivationVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f500a + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iNextInt = new Random().nextInt(881104981);
        if (i4 != (-22730376) + (((~((~iNextInt) | 1565935919)) | 579446352) * 446) + (((~(iNextInt | 2145382271)) | 156502024) * 446) + 735035232) {
            throw new RuntimeException("347798005");
        }
        int i5 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i6 = ~iMyTid;
        if (i5 != 1429146228 + (((~((-2126179486) | i6)) | (-452876480) | (~(2126179485 | iMyTid))) * (-564)) + ((~(iMyTid | (-4460579))) * 1128) + (((~((-452876480) | i6)) | (-2130640064)) * 564)) {
            throw null;
        }
        super.onResume();
        int i7 = d + 121;
        f500a = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 105;
        f500a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != ((~((~iIdentityHashCode) | 1924918251)) * 130) + 284226048 + (((~(iIdentityHashCode | 1924918251)) | 131200) * 130)) {
            throw new RuntimeException("663264901");
        }
        int i5 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyPid = Process.myPid();
        int i6 = ~iMyPid;
        if (i5 != (-1955321372) + (((~((-1930269547) | i6)) | (~(2008003578 | iMyPid))) * (-831)) + ((~((-1359217161) | iMyPid)) * (-1662)) + (((~(iMyPid | 1930269546)) | (~(i6 | (-648786419))) | (~(648786418 | iMyPid))) * 831)) {
            int i7 = (-417586402) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i8 = f500a + 103;
        d = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 71;
        f500a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        if (i4 != (-2116702596) + ((~(1608246763 | i5)) * 623) + (((~i5) | 223494144) * (-623)) + (((~(i5 | 500876682)) | (~(1330864225 | i5)) | (-1608246764)) * 623)) {
            int i6 = (-1519428368) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i7 != 329612544 + (((~((-1829687532) | iIdentityHashCode)) | (-749368434)) * (-964)) + (((~((~iIdentityHashCode) | (-1829687532))) | 1090814090) * (-964))) {
            int i8 = (-104613600) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i9 = d + 55;
        f500a = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1(PhoneActivationVerificationActivity phoneActivationVerificationActivity) {
        int i = 2 % 2;
        int i2 = f500a + 23;
        d = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) phoneActivationVerificationActivity.getIntent().getParcelableExtra("registration_data");
        int i4 = d + 91;
        f500a = i4 % 128;
        int i5 = i4 % 2;
        return registeredMemberRegistration;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PhoneActivationVerificationActivity phoneActivationVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        RegistrationForUnregistered registrationForUnregistered;
        RegisteredMemberRegistration registeredMemberRegistration;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 39;
        int i4 = i3 % 128;
        f500a = i4;
        int i5 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i6 = i2 + 113;
            f500a = i6 % 128;
            if (i6 % 2 != 0) {
                phoneActivationVerificationActivity.MediaBrowserCompat();
                return;
            } else {
                phoneActivationVerificationActivity.MediaBrowserCompat();
                int i7 = 77 / 0;
                return;
            }
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            phoneActivationVerificationActivity.IconCompatParcelizer();
            if (((RegisteredMemberRegistration) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null && (registeredMemberRegistration = (RegisteredMemberRegistration) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, phoneActivationVerificationActivity.INotificationSideChannel(), null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, null, null, null, null, null, null, null, null, 8380159);
                RegistrationActivationVerifyPhoneOtpActivity.Companion companion = RegistrationActivationVerifyPhoneOtpActivity.INSTANCE;
                RegistrationActivationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneActivationVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            if (((RegistrationForUnregistered) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) == null || (registrationForUnregistered = (RegistrationForUnregistered) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) == null) {
                return;
            }
            RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, phoneActivationVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
            RegistrationActivationVerifyPhoneOtpActivity.Companion companion2 = RegistrationActivationVerifyPhoneOtpActivity.INSTANCE;
            RegistrationActivationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneActivationVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i8 = i4 + 39;
            d = i8 % 128;
            int i9 = i8 % 2;
            phoneActivationVerificationActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (!StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "|", false, 2, (Object) null)) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneActivationVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString(), new String[]{"|"}, false, 0, 6, (Object) null);
            String str = (String) listSplit$default.get(0);
            String str2 = (String) listSplit$default.get(1);
            getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
            String string = phoneActivationVerificationActivity.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, str, str2, string, new Function0() { // from class: setFrame
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return (Unit) PhoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[0], zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2066382647, -2066382645);
                }
            }, 96);
            FragmentManager supportFragmentManager = phoneActivationVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f500a + 63;
        d = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = f500a + 23;
        d = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0138 A[Catch: all -> 0x023b, TryCatch #0 {all -> 0x023b, blocks: (B:3:0x0011, B:5:0x001c, B:8:0x0029, B:11:0x0053, B:13:0x0057, B:17:0x005e, B:21:0x00b5, B:28:0x00c4, B:32:0x00e6, B:35:0x00f0, B:38:0x0107, B:40:0x010b, B:42:0x0125, B:64:0x0220, B:65:0x0237, B:44:0x0138, B:48:0x0143, B:52:0x0158, B:53:0x0165, B:54:0x0170, B:57:0x0175, B:59:0x0180, B:62:0x01c0, B:63:0x0214, B:33:0x00ec, B:22:0x00b8, B:23:0x00bd), top: B:70:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0220 A[Catch: all -> 0x023b, TryCatch #0 {all -> 0x023b, blocks: (B:3:0x0011, B:5:0x001c, B:8:0x0029, B:11:0x0053, B:13:0x0057, B:17:0x005e, B:21:0x00b5, B:28:0x00c4, B:32:0x00e6, B:35:0x00f0, B:38:0x0107, B:40:0x010b, B:42:0x0125, B:64:0x0220, B:65:0x0237, B:44:0x0138, B:48:0x0143, B:52:0x0158, B:53:0x0165, B:54:0x0170, B:57:0x0175, B:59:0x0180, B:62:0x01c0, B:63:0x0214, B:33:0x00ec, B:22:0x00b8, B:23:0x00bd), top: B:70:0x0011 }] */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(PhoneActivationVerificationActivity phoneActivationVerificationActivity, View view) {
        String str;
        MembershipType membershipType;
        String str2;
        String str3;
        String str4;
        int length;
        int i = 2 % 2;
        int i2 = f500a + 37;
        d = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            Object obj = null;
            if (registeredMemberRegistration != null) {
                str = registeredMemberRegistration.asInterface;
                int i4 = f500a + 57;
                d = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str = null;
            }
            List listSplit$default = StringsKt.split$default((CharSequence) String.valueOf(str), new String[]{"#"}, false, 0, 6, (Object) null);
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (registeredMemberRegistration2 != null) {
                int i6 = d + 91;
                f500a = i6 % 128;
                int i7 = i6 % 2;
                membershipType = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else {
                membershipType = null;
            }
            boolean z = membershipType == MembershipType.PMI;
            String string = StringsKt.trim((CharSequence) phoneActivationVerificationActivity.INotificationSideChannelStub().edtPhoneNumber.getText().toString()).toString();
            String string2 = StringsKt.trim((CharSequence) phoneActivationVerificationActivity.INotificationSideChannelStub().tvPrefix.getText().toString()).toString();
            boolean zAreEqual = Intrinsics.areEqual(listSplit$default.get(1), ExifInterface.GPS_DIRECTION_TRUE);
            String strINotificationSideChannel = phoneActivationVerificationActivity.INotificationSideChannel();
            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (registeredMemberRegistration3 != null) {
                int i8 = d + 101;
                f500a = i8 % 128;
                if (i8 % 2 == 0) {
                    String str5 = registeredMemberRegistration3.TuitionPaymentFragmentbindingInflater1;
                    obj.hashCode();
                    throw null;
                }
                str2 = registeredMemberRegistration3.TuitionPaymentFragmentbindingInflater1;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            PhoneVerificationRequest phoneVerificationRequest = new PhoneVerificationRequest(strINotificationSideChannel, str2);
            String strINotificationSideChannel2 = phoneActivationVerificationActivity.INotificationSideChannel();
            String strINotificationSideChannel3 = phoneActivationVerificationActivity.INotificationSideChannel();
            RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (registeredMemberRegistration4 != null) {
                int i9 = d + 13;
                f500a = i9 % 128;
                if (i9 % 2 == 0) {
                    str3 = registeredMemberRegistration4.INotificationSideChannel;
                    int i10 = 42 / 0;
                } else {
                    str3 = registeredMemberRegistration4.INotificationSideChannel;
                }
            } else {
                str3 = null;
            }
            String strValueOf = String.valueOf(str3);
            RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (registeredMemberRegistration5 != null) {
                int i11 = d + 25;
                f500a = i11 % 128;
                int i12 = i11 % 2;
                str4 = registeredMemberRegistration5.TuitionPaymentFragmentbindingInflater1;
            } else {
                str4 = null;
            }
            PhoneActivationVerificationRequest phoneActivationVerificationRequest = new PhoneActivationVerificationRequest(String.valueOf(str4), strINotificationSideChannel2, strINotificationSideChannel3, strValueOf, (String) listSplit$default.get(0));
            if (Intrinsics.areEqual(string2, "+62")) {
                Intrinsics.checkNotNullParameter(string, "");
                if (new Regex("^(?![01234579]|61|6[23456789]|60|0[1-7]|09)\\d{9,14}$").matches(string)) {
                    length = string.length();
                    if (4 <= length || length >= 16) {
                        String string3 = phoneActivationVerificationActivity.getString(R.string.error_format_phone_number);
                        Intrinsics.checkNotNullExpressionValue(string3, "");
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 0).show();
                    } else if (((RegistrationForUnregistered) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
                        int i13 = d + 59;
                        f500a = i13 % 128;
                        if (i13 % 2 == 0) {
                            ((setSplitTrack) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationRequest);
                            throw null;
                        }
                        ((setSplitTrack) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationRequest);
                    } else if (zAreEqual && z) {
                        RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        if (registeredMemberRegistration6 != null) {
                            RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration6, null, null, null, null, null, null, null, null, phoneActivationVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388351);
                            RegistrationActivationPasswordActivity.Companion companion = RegistrationActivationPasswordActivity.INSTANCE;
                            RegistrationActivationPasswordActivity.Companion.TuitionPaymentFragmentbindingInflater1(phoneActivationVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            int i14 = f500a + 73;
                            d = i14 % 128;
                            int i15 = i14 % 2;
                        }
                    } else if (zAreEqual) {
                        final setSplitTrack setsplittrack = (setSplitTrack) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                        Intrinsics.checkNotNullParameter(phoneActivationVerificationRequest, "");
                        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.RemoteActionCompatParcelizer;
                        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack.MediaBrowserCompat.TuitionPaymentFragmentbindingInflater1(phoneActivationVerificationRequest)));
                        final Function1 function1 = new Function1() { // from class: getThemeAttrColorStateList
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setsplittrack, (Verification) obj2);
                            }
                        };
                        logToString logtostring = new logToString() { // from class: getTypedValue
                            @Override // defpackage.logToString
                            public final void accept(Object obj2) {
                                function1.invoke(obj2);
                            }
                        };
                        final Function1 function2 = new Function1() { // from class: ThemedSpinnerAdapter
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return setSplitTrack.write(setsplittrack, (Throwable) obj2);
                            }
                        };
                        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getThemeAttrColor
                            @Override // defpackage.logToString
                            public final void accept(Object obj2) {
                                function2.invoke(obj2);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                        setsplittrack.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    } else {
                        ((setSplitTrack) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneVerificationRequest);
                    }
                } else {
                    String string4 = phoneActivationVerificationActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string4, 0).show();
                }
            } else {
                length = string.length();
                if (4 <= length) {
                    String string5 = phoneActivationVerificationActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string5, 0).show();
                } else {
                    String string6 = phoneActivationVerificationActivity.getString(R.string.error_format_phone_number);
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

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final PhoneActivationVerificationActivity phoneActivationVerificationActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getItemView.Companion companion = getItemView.INSTANCE;
            getItemView getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getItemView.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneActivationVerificationActivity.b, new Function1() { // from class: setOverflowIcon
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhoneActivationVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (CodeNamePair) obj);
                }
            });
            FragmentManager supportFragmentManager = phoneActivationVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = d + 117;
                f500a = i2 % 128;
                int i3 = i2 % 2;
                getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i4 = f500a + 57;
                d = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 2;
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PhoneActivationVerificationActivity phoneActivationVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        RegistrationForUnregistered registrationForUnregistered;
        RegisteredMemberRegistration registeredMemberRegistration;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            phoneActivationVerificationActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            phoneActivationVerificationActivity.IconCompatParcelizer();
            if (((RegisteredMemberRegistration) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null && (registeredMemberRegistration = (RegisteredMemberRegistration) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                int i2 = f500a + 53;
                d = i2 % 128;
                int i3 = i2 % 2;
                RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, phoneActivationVerificationActivity.INotificationSideChannel(), null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, null, null, null, null, null, null, null, null, 8380159);
                RegistrationActivationVerifyPhoneOtpActivity.Companion companion = RegistrationActivationVerifyPhoneOtpActivity.INSTANCE;
                RegistrationActivationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneActivationVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i4 = f500a + 107;
                d = i4 % 128;
                int i5 = i4 % 2;
            }
            if (((RegistrationForUnregistered) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) == null || (registrationForUnregistered = (RegistrationForUnregistered) phoneActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) == null) {
                return;
            }
            RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, phoneActivationVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
            RegistrationActivationVerifyPhoneOtpActivity.Companion companion2 = RegistrationActivationVerifyPhoneOtpActivity.INSTANCE;
            RegistrationActivationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneActivationVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = d + 47;
            f500a = i6 % 128;
            int i7 = i6 % 2;
            phoneActivationVerificationActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
            String string2 = phoneActivationVerificationActivity.getString(R.string.error_phone_number_not_match);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (!StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneActivationVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
            String string3 = phoneActivationVerificationActivity.getString(R.string.title_phone_number_not_match);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            String string4 = phoneActivationVerificationActivity.getString(R.string.message_phone_number_not_match);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            String string5 = phoneActivationVerificationActivity.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string3, string4, string5, new Function0() { // from class: ActionMenuPresenterOverflowMenuButton
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneActivationVerificationActivity.cancel();
                }
            }, 96);
            FragmentManager supportFragmentManager = phoneActivationVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PhoneActivationVerificationActivity phoneActivationVerificationActivity, CodeNamePair codeNamePair) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        phoneActivationVerificationActivity.b = codeNamePair;
        TextView textView = phoneActivationVerificationActivity.INotificationSideChannelStub().tvPhoneExample;
        if (Intrinsics.areEqual(codeNamePair.b, "+62")) {
            int i3 = d + 65;
            f500a = i3 % 128;
            i = i3 % 2 == 0 ? 1 : 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        phoneActivationVerificationActivity.INotificationSideChannelStub().tvPrefix.setText(codeNamePair.b);
        Unit unit = Unit.INSTANCE;
        int i4 = d + 109;
        f500a = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if ((r31 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r30.IconCompatParcelizer();
        r1 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r31;
        r3 = kotlin.text.StringsKt.trim((java.lang.CharSequence) java.lang.String.valueOf(r1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
        r4 = r30.getString(com.bpjstku.R.string.error_phone_number_not_match);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r3, (java.lang.CharSequence) r4, false, 2, (java.lang.Object) null) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        r1 = defpackage.getStringOrNull.INSTANCE;
        r7 = r30.getString(com.bpjstku.R.string.title_phone_number_not_match);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r8 = r30.getString(com.bpjstku.R.string.message_phone_number_not_match);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "");
        r9 = r30.getString(com.bpjstku.R.string.action_ok);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "");
        r1 = defpackage.getStringOrNull.Companion.b(com.bpjstku.R.drawable.ic_failed, r7, r8, r9, new defpackage.setReserveOverflow(), 96);
        r0 = r30.getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        if (r0.findFragmentByTag(r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        r1.show(r0, r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r30, java.lang.String.valueOf(r1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        r0 = com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.d + 107;
        com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.f500a = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b4, code lost:
    
        if ((r0 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if ((r31 instanceof VirtualCameraAdapter1.asBinder) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        r5 = r5 + 91;
        com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.f500a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        if ((r5 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        r3 = (com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered) r30.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        r4 = 99 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r3 = (com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered) r30.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
    
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
    
        r4 = r3;
        r3 = com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.d + 67;
        com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.f500a = r3 % 128;
        r3 = r3 % 2;
        r1 = com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4, null, r30.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((com.bpjstku.domain.registration.general.model.Verification) ((VirtualCameraAdapter1.asBinder) r31).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
        r2 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity.INSTANCE;
        com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r30, r1);
        r30.d_();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0129, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if ((r31 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if ((r31 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r3 = r3 + 13;
        com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.d = r3 % 128;
        r3 = r3 % 2;
        r30.MediaBrowserCompat();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity r30, defpackage.VirtualCameraAdapter1 r31) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.TuitionPaymentFragmentbindingInflater1(com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ Unit cancel() {
        int i = 2 % 2;
        int i2 = f500a + 87;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = f500a + 73;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault3(PhoneActivationVerificationActivity phoneActivationVerificationActivity) {
        return (RegistrationForUnregistered) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{phoneActivationVerificationActivity}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2138392215, -2138392211);
    }

    public static /* synthetic */ Unit g() {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[0], zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2066382647, -2066382645);
    }

    public static /* synthetic */ Unit cancelAll() {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[0], zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -646075976, 646075977);
    }

    static {
        asBinder = 0;
        onTransact();
        INSTANCE = new Companion(null);
        int i = asInterface + 15;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d + 5;
        int i3 = i2 % 128;
        f500a = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return R.layout.activity_phone_activation_verification;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f500a + 17;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 65;
        f500a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), 1596403707, -1596403707);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), -121695502, 121695505);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 95;
        f500a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = d + 111;
        f500a = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 314421352 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0), new Object[]{this, context}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -279292534, 279292539);
    }

    static void onTransact() {
        g = new char[]{59730, 59826, 59824, 59830, 59849, 59829, 59827, 59792, 59819, 59848, 59817, 59801, 59827, 59843, 59854, 59829, 59824, 59809, 59810, 59828, 59824, 59826, 59705, 59758, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59743, 59823, 59820, 59813, 59834, 59818, 59760, 59790, 59822, 59817, 59818, 59779, 59785, 59821, 59821, 59819, 59722, 59785, 59788, 59772, 59768, 59776, 59779, 59769, 59765, 59807, 59783, 59783, 59780, 59788, 59785, 59791};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r7, byte r8, int r9) {
        /*
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r8 = r8 + 4
            int r9 = r9 + 99
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r5 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.PhoneActivationVerificationActivity.$$i(byte, byte, int):java.lang.String");
    }
}
