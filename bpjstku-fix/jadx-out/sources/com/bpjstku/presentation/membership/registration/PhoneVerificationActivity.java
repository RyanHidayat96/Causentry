package com.bpjstku.presentation.membership.registration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.registration.bpu.model.request.PhoneVerificationRequestAuth;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.databinding.ActivityPhoneVerificationBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.presentation.membership.registration.PhoneVerificationActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import com.google.android.material.button.MaterialButton;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionProcessor;
import defpackage.UseTorchAsFlash;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deInitSession;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getItemView;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.lambdagetPreviewBitmap1;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.mapPoint;
import defpackage.onScroll;
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
import kotlin.Pair;
import kotlin.TuplesKt;
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
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0006\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0017\u0010\b\u001a\u0004\u0018\u00010 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010#R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020$8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010&R\u0014\u0010\n\u001a\u00020'8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010("}, d2 = {"Lcom/bpjstku/presentation/membership/registration/PhoneVerificationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityPhoneVerificationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "onBackPressed", "a", "asBinder", "asInterface", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "onDestroy", "", "INotificationSideChannel", "()Ljava/lang/String;", "LUseTorchAsFlash;", "p0", "onClosePageEvent", "(LUseTorchAsFlash;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LsetSplitTrack;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhoneVerificationActivity extends BindingReactiveFormActivity<ActivityPhoneVerificationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long asInterface;
    private static char d;
    private static int g;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {14, 116, 92, -78};
    private static final int $$f = 202;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {25, 5, -88, -44, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 182;
    private static int notify = 1;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f545a = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: ShareActionProviderShareActivityChooserModelPolicy
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: formatUrl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = i7 | i6;
        int i9 = ~i8;
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i6));
        int i12 = i8 | i10;
        int i13 = (~(i4 | i6)) | (~(i7 | (~i6)));
        int i14 = i6 + i2 + i + ((-1311665080) * i3) + (1761575915 * i5);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i6) + 412680192 + (1917570655 * i2) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i) + (175112192 * i3) + ((-649461760) * i5) + (1783169024 * i15);
        int i17 = ((i6 * 1226044109) - 1701849991) + (i2 * 1226043089) + (i11 * TypedValues.PositionType.TYPE_POSITION_TYPE) + (i12 * (-510)) + (i13 * TypedValues.PositionType.TYPE_POSITION_TYPE) + (i * 1226043599) + (i3 * (-858626504)) + (i5 * 1069087493) + (i15 * 1627848704);
        int i18 = i16 + (i17 * i17 * 739704832);
        int i19 = 1;
        if (i18 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i18 == 2) {
            return b(objArr);
        }
        if (i18 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i18 != 4) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        PhoneVerificationActivity phoneVerificationActivity = (PhoneVerificationActivity) objArr[0];
        CodeNamePair codeNamePair = (CodeNamePair) objArr[1];
        int i20 = 2 % 2;
        int i21 = f545a + 63;
        asBinder = i21 % 128;
        int i22 = i21 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = codeNamePair;
        TextView textView = phoneVerificationActivity.INotificationSideChannelStub().tvPhoneExample;
        if (!Intrinsics.areEqual(codeNamePair.b, "+62")) {
            i19 = 8;
        } else {
            int i23 = asBinder + 19;
            f545a = i23 % 128;
            if (i23 % 2 != 0) {
                i19 = 0;
            }
        }
        textView.setVisibility(i19);
        phoneVerificationActivity.INotificationSideChannelStub().tvPrefix.setText(codeNamePair.b);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 1
            int r6 = r6 + 4
            int r5 = r5 * 14
            int r5 = r5 + 84
            byte[] r1 = com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r5
            r5 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.c(int, int, int, java.lang.Object[]):void");
    }

    public PhoneVerificationActivity() {
        final PhoneVerificationActivity phoneVerificationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.PhoneVerificationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = phoneVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.PhoneVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/PhoneVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, PhoneVerificationActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, PhoneVerificationActivity.class, new Pair[]{TuplesKt.to("unregistered_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityPhoneVerificationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f545a + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        PhoneVerificationActivity$bindingInflater$1 phoneVerificationActivity$bindingInflater$1 = PhoneVerificationActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        if (i3 == 0) {
            return phoneVerificationActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        INotificationSideChannelStub().btnNext.setOnClickListener(new View.OnClickListener() { // from class: getIcon2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        INotificationSideChannelStub().tvPrefix.setOnClickListener(new View.OnClickListener() { // from class: getDrawableFromResourceValue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        int i2 = asBinder + 79;
        f545a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f545a + 107;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        } else {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            int i3 = 34 / 0;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        f545a = i2 % 128;
        int i3 = i2 % 2;
        d_();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
            int i4 = $11 + 31;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1235 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 35, -653973969, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0), 2763 - Process.getGidForName(""), 13 - TextUtils.lastIndexOf("", '0', 0), 1504416861, false, $$i(b3, b4, (byte) (b4 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - TextUtils.getCapsMode("", 0, 0)), Color.rgb(0, 0, 0) + 16777469, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 2892 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777233, 2012627446, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (asInterface ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) g) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) d) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 111;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
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

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        final PhoneVerificationActivity phoneVerificationActivity = (PhoneVerificationActivity) objArr[0];
        int i = 2 % 2;
        PhoneVerificationActivity phoneVerificationActivity2 = phoneVerificationActivity;
        ((setSplitTrack) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getInterfaceDescriptor.observe(phoneVerificationActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: getActivityIconWithCache
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelDefault.observe(phoneVerificationActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: getColumnString
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj};
                return (Unit) PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1038525792, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1038525790, objArr2);
            }
        }));
        ((setSplitTrack) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).IconCompatParcelizer.observe(phoneVerificationActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: getActivityIcon
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = f545a + 99;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;
        private static final byte[] $$c = {2, -84, 82, -15};
        private static final int $$f = 12;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {0, -94, -62, -97, 32, 7, 13, 0, -23, 56, 5, 16, 4, -6, 21, -39, 52, 6, 11, -7, 27, -35, 51, -7, 16, -34, 38, 19, 8, -2, 7, 10, 16, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
        private static final int $$e = 69;
        private static final byte[] $$a = {83, -44, 103, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 52;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60054, 59744, 60088, 60043, 60048, 60046, 60079, 59746, 60083, 60061, 60090, 60059, 60049, 60073, 60062, 59748, 60041, 60058, 60040, 60063, 60117, 60034, 60072, 60045, 60056, 60052, 60055, 60057, 59749, 60047, 59745, 60050, 59747, 60051, 60060, 60053};
        private static char b = 57191;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 15
                int r9 = 53 - r9
                int r8 = 92 - r8
                int r7 = r7 * 2
                int r7 = 84 - r7
                byte[] r0 = com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r7 = r9
                r5 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
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
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a(int, byte, int, java.lang.Object[]):void");
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
        private static void d(short r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 7
                int r9 = 84 - r9
                byte[] r0 = com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r7 = r7 * 23
                int r7 = r7 + 30
                int r8 = r8 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r9 = r8
                r5 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                int r8 = r8 + 1
                if (r5 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2c:
                int r8 = r8 + r3
                int r8 = r8 + (-8)
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d(short, byte, short, java.lang.Object[]):void");
        }

        public final int hashCode() throws Throwable {
            Object[] objArr;
            char c = 2;
            int i = 2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                int iBlue = 876 - Color.blue(0);
                int i2 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, (byte) (b2 | 89), bArr[28], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iBlue, i2, -1650998592, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{23, 5, 22, '\r', 31, 1, 20, 21, 24, 19, 21, 23, 22, 19, 26, 17, 1, 3, 27, 26, 28, 0}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 78), (Process.myTid() >> 22) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{20, ' ', 15, 5, 20, '\f', 25, 19, 15, '\f', 27, 24, 30, 1, 13907}, (byte) (KeyEvent.normalizeMetaState(0) + 84), ((byte) KeyEvent.getModifierMetaStateMask()) + 16, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 876;
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr5 = new Object[1];
                a(b3, (byte) $$b, b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, capsMode, offsetAfter, 2012020043, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "");
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
                    int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr6 = new Object[1];
                    a(b5, b6, b6, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, iLastIndexOf, iKeyCodeFromString, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iMyUid = Process.myUid();
                int i3 = ~iMyUid;
                int i4 = (-1076980708) + ((iMyUid | (-607695910)) * 140) + (((~((-607695910) | i3)) | 605585440) * (-280)) + (((~(iMyUid | (-605585441))) | (~(648006138 | i3)) | (-650116608)) * 140) + 97305666;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{23, 5, 22, '\r', 31, 1, 20, 21, 15, 5, 2, 21, 6, 28, 25, '#', 19, '#', 27, 23, '\t', 30, 17, 15, '\r', 23}, (byte) (103 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), View.MeasureSpec.getMode(0) + 26, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{29, 0, 13825, 13825, 17, ' ', 28, 11, 13827, 13827, 25, ' ', 29, '\f', 25, '#', 29, 31}, (byte) (26 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{'\r', '\f', 29, 23, 26, ' ', 23, 5, ' ', 22, 23, 22, 23, 24, '\f', 2}, (byte) (TextUtils.getTrimmedLength("") + 95), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{1, 25, 17, ' ', 25, '#', 27, 23, 11, 14, 21, 30, 1, 26, 20, '\r'}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 126), (ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i8 = i7 + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 97305666};
                    byte[] bArr2 = $$d;
                    byte b7 = bArr2[0];
                    byte b8 = bArr2[66];
                    Object[] objArr13 = new Object[1];
                    d(b7, b8, (byte) (-b8), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    d((byte) (-bArr2[66]), bArr2[81], bArr2[0], objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                            int i13 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr16 = new Object[1];
                            a(b9, b10, b10, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, i12, i13, 2012931276, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new char[]{23, 5, 22, '\r', 31, 1, 20, 21, 24, 19, 21, 23, 22, 19, 26, 17, 1, 3, 27, 26, 28, 0}, (byte) (79 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new char[]{20, ' ', 15, 5, 20, '\f', 25, 19, 15, '\f', 27, 24, 30, 1, 13907}, (byte) (84 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ((Process.getThreadPriority(0) + 20) >> 6) + 15, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 877;
                                int capsMode2 = 10 - TextUtils.getCapsMode("", 0, 0);
                                byte b11 = $$a[7];
                                Object[] objArr19 = new Object[1];
                                a(b11, (byte) $$b, b11, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, iLastIndexOf2, capsMode2, 2012020043, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                int capsMode3 = 876 - TextUtils.getCapsMode("", 0, 0);
                                int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                byte[] bArr3 = $$a;
                                byte b12 = bArr3[7];
                                Object[] objArr20 = new Object[1];
                                a(b12, (byte) (b12 | 89), bArr3[28], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, capsMode3, keyRepeatDelay, -1650998592, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                    c = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i14 = ((int[]) objArr[c])[0];
            int i15 = ((int[]) objArr[0])[0];
            if (i15 != i14) {
                Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
                int i16 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i17 = ~iIdentityHashCode;
                int i18 = i16 + (-877786292) + (((~((-775804973) | i17)) | 816115201) * (-328)) + ((iIdentityHashCode | 816115201) * 164) + (((~(iIdentityHashCode | 775804972)) | 276833793 | (~(i17 | (-236523565)))) * 164);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
            } else {
                int i21 = ((int[]) objArr[1])[0];
                Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i22 = ~iIdentityHashCode2;
                int i23 = i21 + (((~(i22 | (-376771966))) | (~((-417082195) | i22)) | 273940816) * (-397)) + 287477588 + ((iIdentityHashCode2 | (-245972528)) * 397);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr22[1])[0] = i25 ^ (i25 << 5);
            }
            return functionDelegate.hashCode();
        }

        private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i5 = 1770390596;
            int i6 = 6;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> i6), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2266, 33 - (ViewConfiguration.getPressedStateDuration() >> 16), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i7++;
                        i5 = 1770390596;
                        i6 = 6;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i8 = $11 + 55;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267, KeyEvent.getDeadChar(0, 0) + 33, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i10 = $10 + 53;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i12 = $10 + 79;
                    $11 = i12 % 128;
                    int i13 = i12 % i3;
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = deinitsession;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = deinitsession;
                        objArr4[9] = deinitsession;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = deinitsession;
                        objArr4[6] = deinitsession;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = deinitsession;
                        objArr4[3] = deinitsession;
                        objArr4[i3] = Integer.valueOf(cCharValue);
                        objArr4[1] = deinitsession;
                        objArr4[0] = deinitsession;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3261, 30 - (ViewConfiguration.getWindowTouchSlop() >> 8), -127612708, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - TextUtils.getOffsetBefore("", 0)), 594 - KeyEvent.normalizeMetaState(0), 17 - Color.blue(0), 1570859318, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        } else {
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    i3 = 2;
                }
            }
            int i19 = 0;
            while (i19 < i) {
                int i20 = $10 + 117;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    cArr4[i19] = (char) (cArr4[i19] ^ 11089);
                    i19 += 75;
                } else {
                    cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                    i19++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        
            if ((r5 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        
            r5 = kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) r5).getFunctionDelegate());
            r1 = com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if ((!(r5 instanceof kotlin.jvm.internal.FunctionAdapter)) != true) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r5 instanceof androidx.p002lifecycle.Observer
                r2 = 0
                if (r1 == 0) goto L3c
                int r1 = com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r1 = r1 + 3
                int r3 = r1 % 128
                com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
                int r1 = r1 % r0
                if (r1 != 0) goto L1d
                boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionAdapter
                r3 = 90
                int r3 = r3 / r2
                r3 = 1
                r1 = r1 ^ r3
                if (r1 == r3) goto L3c
                goto L21
            L1d:
                boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L3c
            L21:
                r1 = r4
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r5 = (kotlin.jvm.internal.FunctionAdapter) r5
                kotlin.Function r5 = r5.getFunctionDelegate()
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                int r1 = com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                int r1 = r1 + 115
                int r2 = r1 % 128
                com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
                int r1 = r1 % r0
                return r5
            L3c:
                int r5 = com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                int r5 = r5 + 115
                int r1 = r5 % 128
                com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
                int r5 = r5 % r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(java.lang.Object):boolean");
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.TuitionPaymentFragmentbindingInflater1;
            int i5 = i3 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
            if (i3 != 0) {
                int i4 = 16 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r5, int r6, int r7) {
            /*
                int r7 = r7 + 113
                int r6 = r6 * 2
                int r6 = r6 + 4
                byte[] r0 = com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                int r5 = r5 * 3
                int r1 = 1 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L16
                r3 = r5
                r4 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L24:
                r3 = r0[r6]
            L26:
                int r6 = r6 + 1
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(int, int, int):java.lang.String");
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        PhoneVerificationActivity phoneVerificationActivity = this;
        Intrinsics.checkNotNullParameter(phoneVerificationActivity, "");
        phoneVerificationActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        TextView textView = INotificationSideChannelStub().layoutToolbar.tvToolbarTitle;
        String string = getString(R.string.title_phone_number_verification);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1756;
            int capsMode = 23 - TextUtils.getCapsMode("", 0, 0);
            byte b = $$a[7];
            short s = b;
            Object[] objArr2 = new Object[1];
            c(b, s, (byte) (s | 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, iIndexOf, capsMode, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{49162, 23703, 34569, 17342}, new char[]{2187, 51020, 4062, 57198}, (char) Color.red(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_1).substring(0, 3).codePointAt(1) - 111, new char[]{41036, 9815, 12989, 35738, 50310, 31847, 1733, 51057, 2706, 55360, 45768, 25628, 5357, 60645, 2270, 56518, 29096, 24390, 52212, 17125, 3232, 56425}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{49162, 23703, 34569, 17342}, new char[]{63943, 27892, 32008, 58288}, (char) (45182 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 141358330, new char[]{64018, 40975, 14273, 42836, 55925, 63947, 64710, 45590, 52781, 37394, 49917, 40188, 1784, 50754, 34200}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
            int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0);
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 37), (byte) ($$b & 125), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf2, iLastIndexOf, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = asBinder + 65;
            f545a = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int iMyPid = (Process.myPid() >> 22) + 1755;
                int i4 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte b3 = $$a[7];
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 89), (byte) ($$b & 125), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, iMyPid, i4, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i5}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i7 = (((((~(i6 | android.R.string.config_wlan_data_service_package)) | 195562301) * 56) - 726953647) + (((~((~i6) | 195562301)) | android.R.string.config_wlan_data_service_package) * 56)) - 243632682;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{49162, 23703, 34569, 17342}, new char[]{24971, 12491, 39537, 43451}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_epay_bri).substring(1, 3).codePointAt(1) + 47905), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{7413, 42264, 53147, 12554, 61294, 6804, 50781, 9075, 58081, 9229, 50281, 38258, 4924, 33160, 16969, 26737}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{49162, 23703, 34569, 17342}, new char[]{47315, 41512, 16613, 14483}, (char) (37696 - ((Process.getThreadPriority(0) + 20) >> 6)), Gravity.getAbsoluteGravity(0, 0), new char[]{23159, 269, 51458, 17820, 64482, 14901, 47232, 48524, 6994, 30950, 24682, 8391, 53193, 14836, 44158, 37064}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1196497114};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 42049), (ViewConfiguration.getLongPressTimeout() >> 16) + 1726, View.resolveSize(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -243632682, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarSize = (char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int scrollBarSize2 = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int capsMode2 = 23 - TextUtils.getCapsMode("", 0, 0);
                    byte b4 = $$a[7];
                    Object[] objArr11 = new Object[1];
                    c(b4, (short) (b4 | 89), (byte) ($$b & 125), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, scrollBarSize2, capsMode2, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new char[]{49162, 23703, 34569, 17342}, new char[]{2187, 51020, 4062, 57198}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step1).substring(0, 1).codePointAt(0) - 84), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{41036, 9815, 12989, 35738, 50310, 31847, 1733, 51057, 2706, 55360, 45768, 25628, 5357, 60645, 2270, 56518, 29096, 24390, 52212, 17125, 3232, 56425}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new char[]{49162, 23703, 34569, 17342}, new char[]{63943, 27892, 32008, 58288}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 45082), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_alfamart).substring(1, 3).codePointAt(1) + 141358208, new char[]{64018, 40975, 14273, 42836, 55925, 63947, 64710, 45590, 52781, 37394, 49917, 40188, 1784, 50754, 34200}, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                        byte b5 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        c(b5, (short) (b5 | 37), (byte) ($$b & 125), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, i10, iResolveSizeAndState, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
                        int size = View.MeasureSpec.getSize(0) + 1755;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
                        byte b6 = $$a[7];
                        short s2 = b6;
                        Object[] objArr15 = new Object[1];
                        c(b6, s2, (byte) (s2 | 37), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask, size, bitsPerPixel, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrB$7879113;
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i11 = 0;
                while (i11 < strArr.length) {
                    int i12 = asBinder + 39;
                    f545a = i12 % 128;
                    if (i12 % 2 == 0) {
                        arrayList.add(strArr[i11]);
                        i11 += 57;
                    } else {
                        arrayList.add(strArr[i11]);
                        i11++;
                    }
                }
            }
            throw null;
        }
        int i13 = f545a + 31;
        asBinder = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[0])[0];
        Object[] objArr16 = {new int[]{i16}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int i17 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i18 = i15 + (-1018038119) + (((~(i17 | (-492818964))) | 705421389) * 191) + (((~((~i17) | (-492818964))) | 134987777) * 191);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr16[3])[0] = i20 ^ (i20 << 5);
        textView.setText(string);
        if (((RegistrationForUnregistered) this.b.getValue()) != null) {
            INotificationSideChannelStub().tvEnterPhoneNumberInstruction.setText(getString(R.string.label_edit_phone_number_instruction));
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        f545a = i2 % 128;
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
            materialButton4.setEnabled(false);
        }
        int i3 = asBinder + 113;
        f545a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 15 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        f545a = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = asBinder + 95;
        f545a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        EditText editText = INotificationSideChannelStub().edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(editText, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(editText, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        int i2 = asBinder + 7;
        f545a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        f545a = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
        } else {
            super.onDestroy();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
            int i3 = 94 / 0;
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
        int i2 = f545a + 63;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return string2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Subscribe(TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ThreadMode.MAIN)
    public final void onClosePageEvent(UseTorchAsFlash p0) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        f545a = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            d_();
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            d_();
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f545a + 37;
        asBinder = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = f545a + 57;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    obj.hashCode();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        int i2 = asBinder + 77;
        f545a = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 1031;
            int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 141), (byte) ($$b & 125), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, deadChar, iMakeMeasureSpec, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{49162, 23703, 34569, 17342}, new char[]{2187, 51020, 4062, 57198}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 112), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{41036, 9815, 12989, 35738, 50310, 31847, 1733, 51057, 2706, 55360, 45768, 25628, 5357, 60645, 2270, 56518, 29096, 24390, 52212, 17125, 3232, 56425}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{49162, 23703, 34569, 17342}, new char[]{63943, 27892, 32008, 58288}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.details_message_invalid).substring(0, 6).length() + 45175), 141358328 - ImageFormat.getBitsPerPixel(0), new char[]{64018, 40975, 14273, 42836, 55925, 63947, 64710, 45590, 52781, 37394, 49917, 40188, 1784, 50754, 34200}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int i4 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
            int mode = View.MeasureSpec.getMode(0) + 15;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 89), (byte) ($$b & 125), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, i4, mode, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = f545a + 75;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int iResolveSize = View.resolveSize(0, 0) + 1031;
                int mirror = '?' - AndroidCharacter.getMirror('0');
                byte[] bArr = $$a;
                byte b3 = bArr[28];
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 192), bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iResolveSize, mirror, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = ~((-950501155) | i9);
            int i11 = ~(706220984 | iIdentityHashCode);
            int i12 = 1517103762 + ((i10 | i11) * 1150) + (((~((-706220985) | i9)) | i11) * (-575)) + (((~(iIdentityHashCode | (-950501155))) | (~(i9 | 950501154))) * 575) + 1676130596;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[2])[0] = i14 ^ (i14 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{49162, 23703, 34569, 17342}, new char[]{24971, 12491, 39537, 43451}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 47990), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111, new char[]{7413, 42264, 53147, 12554, 61294, 6804, 50781, 9075, 58081, 9229, 50281, 38258, 4924, 33160, 16969, 26737}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{49162, 23703, 34569, 17342}, new char[]{47315, 41512, 16613, 14483}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 37660), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{23159, 269, 51458, 17820, 64482, 14901, 47232, 48524, 6994, 30950, 24682, 8391, 53193, 14836, 44158, 37064}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1459841388};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - Color.argb(0, 0, 0, 0)), 1135 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 18 - TextUtils.getTrimmedLength(""), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1676130596, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iIndexOf = 15 - TextUtils.indexOf("", "");
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c(b4, (short) (b4 | 141), (byte) ($$b & 125), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, doubleTapTimeout, iIndexOf, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "", 0) + 45993), 1116 - TextUtils.indexOf((CharSequence) "", '0', 0), 17 - TextUtils.getTrimmedLength("")), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int i15 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int iMyTid = (Process.myTid() >> 22) + 15;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[28];
                    Object[] objArr13 = new Object[1];
                    c(b5, (short) (b5 | 192), bArr2[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, i15, iMyTid, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{49162, 23703, 34569, 17342}, new char[]{2187, 51020, 4062, 57198}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.danamon_online_instruction_step3).substring(104, 112).length() - 8, new char[]{41036, 9815, 12989, 35738, 50310, 31847, 1733, 51057, 2706, 55360, 45768, 25628, 5357, 60645, 2270, 56518, 29096, 24390, 52212, 17125, 3232, 56425}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{49162, 23703, 34569, 17342}, new char[]{63943, 27892, 32008, 58288}, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 45180), 141358329 - ExpandableListView.getPackedPositionGroup(0L), new char[]{64018, 40975, 14273, 42836, 55925, 63947, 64710, 45590, 52781, 37394, 49917, 40188, 1784, 50754, 34200}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i16 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i17 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                        byte b6 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c(b6, (short) (b6 | 89), (byte) ($$b & 125), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout, i16, i17, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                        int i18 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte b7 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c(b7, (short) (b7 | 141), (byte) ($$b & 125), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cKeyCodeFromString, iAxisFromString, i18, 1357589585, false, (String) objArr17[0], null);
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
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 == i19) {
            int i21 = asBinder + 25;
            f545a = i21 % 128;
            int i22 = i21 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[3])[0];
            int i25 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iMyTid2 = Process.myTid();
            int i26 = ~iMyTid2;
            int i27 = i23 + ((((~(361297703 | i26)) | (~(iMyTid2 | 605577873))) * 959) - 234976465) + (((~(iMyTid2 | 361297703)) | (~(i26 | 605577873))) * 959);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr18[2])[0] = i29 ^ (i29 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i30 = f545a + 117;
                asBinder = i30 % 128;
                int i31 = 2;
                int i32 = i30 % 2;
                int i33 = 0;
                while (i33 < strArr3.length) {
                    int i34 = asBinder + 17;
                    f545a = i34 % 128;
                    if (i34 % i31 == 0) {
                        arrayList.add(strArr3[i33]);
                        i33 += 48;
                    } else {
                        arrayList.add(strArr3[i33]);
                        i33++;
                    }
                    i31 = 2;
                }
            }
            Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[3])[0];
            int i37 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iMyPid = Process.myPid();
            int i38 = ~((-411443553) | iMyPid);
            int i39 = (-355127555) + ((143008096 | i38) * (-280)) + ((i38 | (~(167163382 | iMyPid))) * 140);
            int i40 = ~((-268435457) | iMyPid);
            int i41 = ~iMyPid;
            int i42 = i35 + i39 + (((~(i41 | 435598838)) | i40 | (~((-143008097) | i41))) * 140);
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr19[2])[0] = i44 ^ (i44 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
            byte b8 = $$a[7];
            short s = b8;
            Object[] objArr20 = new Object[1];
            c(b8, s, (byte) (s | 37), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(touchSlop, jumpTapTimeout2, maximumDrawingCacheSize, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                int longPressTimeout3 = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b9 = $$a[7];
                Object[] objArr21 = new Object[1];
                c(b9, (short) (b9 | 89), (byte) ($$b & 125), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(capsMode, longPressTimeout2, longPressTimeout3, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i45 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i45}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i46 = (-952709922) + (((~((-268829315) | (~iIdentityHashCode2))) | 56226888) * (-591)) + ((iIdentityHashCode2 | (-268829315)) * 591) + 1509685123;
            int i47 = (i46 << 13) ^ i46;
            int i48 = i47 ^ (i47 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i48 ^ (i48 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{49162, 23703, 34569, 17342}, new char[]{24971, 12491, 39537, 43451}, (char) (48025 - ImageFormat.getBitsPerPixel(0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.how_much_point).substring(27, 28).length() - 1, new char[]{7413, 42264, 53147, 12554, 61294, 6804, 50781, 9075, 58081, 9229, 50281, 38258, 4924, 33160, 16969, 26737}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{49162, 23703, 34569, 17342}, new char[]{47315, 41512, 16613, 14483}, (char) (37696 - Color.red(0)), ViewConfiguration.getTouchSlop() >> 8, new char[]{23159, 269, 51458, 17820, 64482, 14901, 47232, 48524, 6994, 30950, 24682, 8391, 53193, 14836, 44158, 37064}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1459841388};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42050), 1726 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 29 - TextUtils.indexOf("", "", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1509685123, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                int jumpTapTimeout3 = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b10 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b10, (short) (b10 | 89), (byte) ($$b & 125), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c, scrollBarFadeDuration, jumpTapTimeout3, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{49162, 23703, 34569, 17342}, new char[]{2187, 51020, 4062, 57198}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.chademo_ev_connector_type).substring(0, 6).length() - 6), KeyEvent.getMaxKeyCode() >> 16, new char[]{41036, 9815, 12989, 35738, 50310, 31847, 1733, 51057, 2706, 55360, 45768, 25628, 5357, 60645, 2270, 56518, 29096, 24390, 52212, 17125, 3232, 56425}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{49162, 23703, 34569, 17342}, new char[]{63943, 27892, 32008, 58288}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1059).substring(0, 54).length() + 45127), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_snap_transaction_details).substring(1, 2).codePointAt(0) + 141358232, new char[]{64018, 40975, 14273, 42836, 55925, 63947, 64710, 45590, 52781, 37394, 49917, 40188, 1784, 50754, 34200}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cAlpha = (char) (Color.alpha(0) + 29944);
                    int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                    int gidForName = Process.getGidForName("") + 24;
                    byte b11 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c(b11, (short) (b11 | 37), (byte) ($$b & 125), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha, iKeyCodeFromString, gidForName, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                    int i49 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                    int capsMode2 = 23 - TextUtils.getCapsMode("", 0, 0);
                    byte b12 = $$a[7];
                    short s2 = b12;
                    Object[] objArr30 = new Object[1];
                    c(b12, s2, (byte) (s2 | 37), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(fadingEdgeLength, i49, capsMode2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i50 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i51 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i51 == i50) {
            int i52 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            int i53 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            Object[] objArr31 = {new int[]{i53}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i54 = ~iFreeMemory;
            int i55 = i52 + 1958332176 + (((~(336853171 | i54)) | 549455597) * 226) + (((~(i54 | 886308607)) | (~((-549455598) | iFreeMemory)) | 161) * (-113)) + ((~(iFreeMemory | 336853171)) * 113);
            int i56 = (i55 << 13) ^ i55;
            int i57 = i56 ^ (i56 >>> 17);
            ((int[]) objArr31[3])[0] = i57 ^ (i57 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr5 != null) {
            int i58 = 0;
            while (i58 < strArr5.length) {
                int i59 = asBinder + 113;
                f545a = i59 % 128;
                if (i59 % 2 == 0) {
                    arrayList2.add(strArr5[i58]);
                    i58 += 56;
                } else {
                    arrayList2.add(strArr5[i58]);
                    i58++;
                }
            }
        }
        Toast.makeText((Context) null, i51 / (((i51 - 1) * i51) % 2), 0).show();
        int i60 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i61 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr32 = {new int[]{i61}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i62 = ~iIdentityHashCode3;
        int i63 = (~((-633652980) | i62)) | 16810161;
        int i64 = ~(iIdentityHashCode3 | 1037893371);
        int i65 = i60 + 596944654 + ((i63 | i64) * (-713)) + (i64 * 1426) + ((~(421050553 | i62)) * 713);
        int i66 = (i65 << 13) ^ i65;
        int i67 = i66 ^ (i66 >>> 17);
        ((int[]) objArr32[3])[0] = i67 ^ (i67 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        f545a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i5 = ~startElapsedRealtime;
        if (i4 != 475278640 + (((~(1487965900 | i5)) | 657978357) * (-90)) + (((~(1487965900 | startElapsedRealtime)) | 1484786696) * (-45)) + (((~(startElapsedRealtime | (-657978358))) | 1487965900 | (~(i5 | 657978357))) * 45)) {
            throw null;
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        if (i6 != (((~((-262165) | iMaxMemory)) * 521) - 235455200) + (((~((~iMaxMemory) | (-262165))) | (-1857936056)) * 521)) {
            throw null;
        }
        super.onResume();
        int i7 = f545a + 85;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws IllegalAccessException {
        PhoneVerificationActivity phoneVerificationActivity = (PhoneVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 65;
        f545a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i5 = ~startUptimeMillis;
        if (i4 != (((~(1448750019 | i5)) | (~(startUptimeMillis | 618762476))) * 959) + 1934573623 + (((~(startUptimeMillis | 1448750019)) | (~(i5 | 618762476))) * 959)) {
            int i6 = (-1719837976) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i8 = ~iMyTid;
        if (i7 != 607248884 + (((~(1857123813 | i8)) | (~((-141212483) | iMyTid))) * 1900) + (((~(i8 | 141212482)) | (~(iMyTid | (-1857123814)))) * (-950)) + (((~(iMyTid | 141212482)) | (~(i8 | (-1857123814)))) * 950)) {
            int i9 = (-818044290) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i10 = f545a + 107;
        asBinder = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -819912741
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ca A[PHI: r3
  0x00ca: PHI (r3v3 com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered) = 
  (r3v2 com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered)
  (r3v6 com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered)
 binds: [B:21:0x00c8, B:18:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object b(Object[] objArr) {
        RegistrationForUnregistered registrationForUnregistered;
        PhoneVerificationActivity phoneVerificationActivity = (PhoneVerificationActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            phoneVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i2 = asBinder + 103;
            f545a = i2 % 128;
            int i3 = i2 % 2;
            phoneVerificationActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
            String string2 = phoneVerificationActivity.getString(R.string.error_phone_number_not_match);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string3 = phoneVerificationActivity.getString(R.string.title_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = phoneVerificationActivity.getString(R.string.message_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = phoneVerificationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: getDefaultIcon1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PhoneVerificationActivity.cancelAll();
                    }
                }, 96);
                FragmentManager supportFragmentManager = phoneVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = asBinder + 103;
            f545a = i4 % 128;
            if (i4 % 2 == 0) {
                registrationForUnregistered = (RegistrationForUnregistered) phoneVerificationActivity.b.getValue();
                int i5 = 79 / 0;
                if (registrationForUnregistered != null) {
                    RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, phoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
                    RegistrationVerifyPhoneOtpActivity.Companion companion2 = RegistrationVerifyPhoneOtpActivity.INSTANCE;
                    RegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    phoneVerificationActivity.d_();
                }
            } else {
                registrationForUnregistered = (RegistrationForUnregistered) phoneVerificationActivity.b.getValue();
                if (registrationForUnregistered != null) {
                    RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault4 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, phoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
                    RegistrationVerifyPhoneOtpActivity.Companion companion3 = RegistrationVerifyPhoneOtpActivity.INSTANCE;
                    RegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    phoneVerificationActivity.d_();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PhoneVerificationActivity phoneVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        RegisteredMemberRegistration registeredMemberRegistration;
        int i = 2 % 2;
        int i2 = asBinder + 59;
        int i3 = i2 % 128;
        f545a = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            phoneVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = i3 + 17;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            phoneVerificationActivity.IconCompatParcelizer();
            if (((RegisteredMemberRegistration) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null && (registeredMemberRegistration = (RegisteredMemberRegistration) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, phoneVerificationActivity.INotificationSideChannel(), null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, null, null, null, null, null, null, null, null, 8380159);
                RegistrationVerifyPhoneOtpActivity.Companion companion = RegistrationVerifyPhoneOtpActivity.INSTANCE;
                RegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            if (((RegistrationForUnregistered) phoneVerificationActivity.b.getValue()) != null) {
                int i6 = f545a + 51;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) phoneVerificationActivity.b.getValue();
                if (registrationForUnregistered != null) {
                    int i8 = asBinder + 39;
                    f545a = i8 % 128;
                    int i9 = i8 % 2;
                    RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, phoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
                    RegistrationVerifyPhoneOtpActivity.Companion companion2 = RegistrationVerifyPhoneOtpActivity.INSTANCE;
                    RegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            int i10 = i3 + 25;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            phoneVerificationActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
            String string2 = phoneVerificationActivity.getString(R.string.error_phone_number_not_match);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                String string3 = phoneVerificationActivity.getString(R.string.title_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = phoneVerificationActivity.getString(R.string.message_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = phoneVerificationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_warning_blue, string3, string4, string5, new Function0() { // from class: checkIconCache
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PhoneVerificationActivity.g();
                    }
                }, 96);
                FragmentManager supportFragmentManager = phoneVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = f545a + 79;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return Unit.INSTANCE;
        }
        int i3 = 81 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(PhoneVerificationActivity phoneVerificationActivity) {
        int i = 2 % 2;
        int i2 = f545a + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) phoneVerificationActivity.getIntent().getParcelableExtra("registration_data");
        int i4 = asBinder + 51;
        f545a = i4 % 128;
        int i5 = i4 % 2;
        return registeredMemberRegistration;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0179 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:3:0x0008, B:6:0x0047, B:45:0x0179, B:46:0x0190, B:8:0x005a, B:14:0x006e, B:16:0x007d, B:22:0x008e, B:26:0x00aa, B:28:0x00bd, B:29:0x00e4, B:31:0x00fa, B:32:0x010d, B:33:0x010e, B:37:0x0123, B:38:0x0129, B:39:0x012b, B:41:0x012f, B:43:0x013a, B:44:0x016d), top: B:51:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x005a A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #0 {all -> 0x0194, blocks: (B:3:0x0008, B:6:0x0047, B:45:0x0179, B:46:0x0190, B:8:0x005a, B:14:0x006e, B:16:0x007d, B:22:0x008e, B:26:0x00aa, B:28:0x00bd, B:29:0x00e4, B:31:0x00fa, B:32:0x010d, B:33:0x010e, B:37:0x0123, B:38:0x0129, B:39:0x012b, B:41:0x012f, B:43:0x013a, B:44:0x016d), top: B:51:0x0008 }] */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(PhoneVerificationActivity phoneVerificationActivity, View view) {
        int length;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            String string = StringsKt.trim((CharSequence) phoneVerificationActivity.INotificationSideChannelStub().edtPhoneNumber.getText().toString()).toString();
            String str = "";
            if (Intrinsics.areEqual(StringsKt.trim((CharSequence) phoneVerificationActivity.INotificationSideChannelStub().tvPrefix.getText().toString()).toString(), "+62")) {
                Intrinsics.checkNotNullParameter(string, "");
                if (new Regex("^(?![01234579]|61|6[23456789]|60|0[1-7]|09)\\d{9,14}$").matches(string)) {
                    length = string.length();
                    if (4 <= length || length >= 16) {
                        String string2 = phoneVerificationActivity.getString(R.string.error_format_phone_number);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
                    } else {
                        int i2 = asBinder + 107;
                        f545a = i2 % 128;
                        int i3 = i2 % 2;
                        String strINotificationSideChannel = phoneVerificationActivity.INotificationSideChannel();
                        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        MembershipType membershipType = null;
                        String str2 = registeredMemberRegistration != null ? registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1 : null;
                        if (str2 == null) {
                            int i4 = f545a + 115;
                            asBinder = i4 % 128;
                            int i5 = i4 % 2;
                        } else {
                            str = str2;
                        }
                        PhoneVerificationRequest phoneVerificationRequest = new PhoneVerificationRequest(strINotificationSideChannel, str);
                        if (((RegistrationForUnregistered) phoneVerificationActivity.b.getValue()) != null) {
                            int i6 = f545a + 53;
                            asBinder = i6 % 128;
                            if (i6 % 2 != 0) {
                                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) phoneVerificationActivity.b.getValue();
                                Intrinsics.checkNotNull(registrationForUnregistered);
                                Intrinsics.areEqual(registrationForUnregistered.IconCompatParcelizer, "cross_selling");
                                membershipType.hashCode();
                                throw null;
                            }
                            RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) phoneVerificationActivity.b.getValue();
                            Intrinsics.checkNotNull(registrationForUnregistered2);
                            if (Intrinsics.areEqual(registrationForUnregistered2.IconCompatParcelizer, "cross_selling")) {
                                String strINotificationSideChannel2 = phoneVerificationActivity.INotificationSideChannel();
                                RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) phoneVerificationActivity.b.getValue();
                                Intrinsics.checkNotNull(registrationForUnregistered3);
                                ((setSplitTrack) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new PhoneVerificationRequestAuth(strINotificationSideChannel2, String.valueOf(registrationForUnregistered3.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                            } else {
                                ((setSplitTrack) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationRequest);
                                int i7 = asBinder + 65;
                                f545a = i7 % 128;
                                int i8 = i7 % 2;
                            }
                        } else {
                            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                            if (registeredMemberRegistration2 != null) {
                                int i9 = f545a + 73;
                                asBinder = i9 % 128;
                                if (i9 % 2 != 0) {
                                    membershipType = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i10 = 87 / 0;
                                } else {
                                    membershipType = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                }
                            }
                            if (membershipType == MembershipType.PMI) {
                                RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                                if (registeredMemberRegistration3 != null) {
                                    RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration3, null, null, null, null, null, null, null, null, phoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388351);
                                    RegistrationPasswordActivity.Companion companion = RegistrationPasswordActivity.INSTANCE;
                                    RegistrationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                }
                            } else {
                                ((setSplitTrack) phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneVerificationRequest);
                            }
                        }
                    }
                } else {
                    String string3 = phoneVerificationActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 0).show();
                }
            } else {
                length = string.length();
                if (4 <= length) {
                    String string4 = phoneVerificationActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string4, 0).show();
                } else {
                    String string5 = phoneVerificationActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string5, 0).show();
                }
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault1(PhoneVerificationActivity phoneVerificationActivity) {
        RegistrationForUnregistered registrationForUnregistered;
        int i = 2 % 2;
        int i2 = f545a + 89;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            registrationForUnregistered = (RegistrationForUnregistered) phoneVerificationActivity.getIntent().getParcelableExtra("unregistered_data");
            int i3 = 12 / 0;
        } else {
            registrationForUnregistered = (RegistrationForUnregistered) phoneVerificationActivity.getIntent().getParcelableExtra("unregistered_data");
        }
        int i4 = asBinder + 81;
        f545a = i4 % 128;
        int i5 = i4 % 2;
        return registrationForUnregistered;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(PhoneVerificationActivity phoneVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        RegistrationForUnregistered registrationForUnregistered;
        int i = 2 % 2;
        int i2 = f545a + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            phoneVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            phoneVerificationActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else if ((virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) && (registrationForUnregistered = (RegistrationForUnregistered) phoneVerificationActivity.b.getValue()) != null) {
            int i3 = asBinder + 117;
            f545a = i3 % 128;
            int i4 = i3 % 2;
            RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, phoneVerificationActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
            RegistrationVerifyPhoneOtpActivity.Companion companion = RegistrationVerifyPhoneOtpActivity.INSTANCE;
            RegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            phoneVerificationActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final PhoneVerificationActivity phoneVerificationActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getItemView.Companion companion = getItemView.INSTANCE;
            getItemView getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getItemView.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new Function1() { // from class: getIcon1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, (CodeNamePair) obj};
                    return (Unit) PhoneVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1221034923, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1221034919, objArr);
                }
            });
            FragmentManager supportFragmentManager = phoneVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = asBinder + 41;
                f545a = i2 % 128;
                if (i2 % 2 == 0) {
                    getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    throw null;
                }
                getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i3 = asBinder + 63;
            f545a = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit cancelAll() {
        int i = 2 % 2;
        int i2 = f545a + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 33;
        f545a = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PhoneVerificationActivity phoneVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1038525792, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1038525790, new Object[]{phoneVerificationActivity, virtualCameraAdapter1});
    }

    public static /* synthetic */ Unit b(PhoneVerificationActivity phoneVerificationActivity, CodeNamePair codeNamePair) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1221034923, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1221034919, new Object[]{phoneVerificationActivity, codeNamePair});
    }

    static {
        onTransact = 0;
        onTransact();
        INSTANCE = new Companion(null);
        int i = notify + 69;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        int i3 = i2 % 128;
        f545a = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_phone_verification;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        f545a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 761219222, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -761219222, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        f545a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1200539539, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1184622709, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1200539540, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1022194313, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1022194310, new Object[]{this});
    }

    static void onTransact() {
        asInterface = -1963452362746870469L;
        g = -981105359;
        d = (char) 34097;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        PhoneVerificationActivity phoneVerificationActivity = (PhoneVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f545a + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = f545a + 3;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
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
    private static java.lang.String $$i(short r6, int r7, short r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.$$c
            int r8 = r8 + 102
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.PhoneVerificationActivity.$$i(short, int, short):java.lang.String");
    }
}
