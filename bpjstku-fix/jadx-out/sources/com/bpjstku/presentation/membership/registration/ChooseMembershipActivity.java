package com.bpjstku.presentation.membership.registration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityChooseMembershipBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.presentation.membership.registration.ChooseMembershipActivity;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity;
import com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity;
import com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.constant.RegistrationStatus;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.dynamite.zzk;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.FirebaseException;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.TargetAspectRatio;
import defpackage.UseFlashModeTorchFor3aUpdate;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getMaxImages;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onSuggestionClick;
import defpackage.setButtonPanelLayoutHint;
import defpackage.setQuickZoomEnabled;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u00020\u000f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0015\u0010\f\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\u0010\u001a\u00020\u00158\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/ChooseMembershipActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityChooseMembershipBinding;", "<init>", "()V", "", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "asBinder", "Lcom/bpjstku/util/constant/RegistrationStatus;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LonSuggestionClick;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChooseMembershipActivity extends BindingBaseActivity<ActivityChooseMembershipBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] asBinder;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {33, -59, 107, -108};
    private static final int $$f = 186;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {53, -70, 9, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 232;
    private static int d = 0;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f541a = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: SearchView6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: onFocusChange
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChooseMembershipActivity.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_choose_membership;

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RegistrationStatus.values().length];
            try {
                iArr[RegistrationStatus.REGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = (~(i7 | i8 | i9)) | (~(i3 | i));
        int i11 = ~(i5 | i);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i3 + i + i2 + (1349231875 * i4) + (1735201104 * i6);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i3) + 1558183936 + (237349861 * i) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i2) + ((-1337982976) * i4) + (469762048 * i6) + (1272971264 * i16);
        int i18 = ((i3 * 236314795) - 374860141) + (i * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i2 * 236313959) + (i4 * (-66979019)) + (i6 * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        if (i19 == 1) {
            return b(objArr);
        }
        if (i19 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        ChooseMembershipActivity chooseMembershipActivity = (ChooseMembershipActivity) objArr[0];
        int i20 = 2 % 2;
        int i21 = asInterface + 29;
        int i22 = i21 % 128;
        f541a = i22;
        int i23 = i21 % 2;
        int i24 = chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i25 = i22 + 41;
        asInterface = i25 % 128;
        int i26 = i25 % 2;
        return Integer.valueOf(i24);
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
    private static void c(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.ChooseMembershipActivity.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r1 = r6 + 1
            int r5 = 197 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            r4 = r0[r5]
            int r3 = r3 + 1
        L25:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r5 = r5 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseMembershipActivity.c(short, byte, byte, java.lang.Object[]):void");
    }

    public ChooseMembershipActivity() {
        final ChooseMembershipActivity chooseMembershipActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<onSuggestionClick>() { // from class: com.bpjstku.presentation.membership.registration.ChooseMembershipActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, onSuggestionClick] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ onSuggestionClick invoke() {
                LifecycleOwner lifecycleOwner = chooseMembershipActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(onSuggestionClick.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.ChooseMembershipActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/ChooseMembershipActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/util/constant/RegistrationStatus;", "p1", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p2", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Lcom/bpjstku/util/constant/RegistrationStatus;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, RegistrationStatus p1, RegisteredMemberRegistration p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ChooseMembershipActivity.class, new Pair[]{TuplesKt.to("registration_status", p1), TuplesKt.to("registration_data", p2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityChooseMembershipBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        f541a = i2 % 128;
        if (i2 % 2 == 0) {
            ChooseMembershipActivity$bindingInflater$1 chooseMembershipActivity$bindingInflater$1 = ChooseMembershipActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            throw null;
        }
        ChooseMembershipActivity$bindingInflater$1 chooseMembershipActivity$bindingInflater$2 = ChooseMembershipActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = asInterface + 25;
        f541a = i3 % 128;
        int i4 = i3 % 2;
        return chooseMembershipActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityChooseMembershipBinding activityChooseMembershipBinding = (ActivityChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityChooseMembershipBinding.layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: afterTextChanged
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-604286522, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view}, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 604286523, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        ImageView imageView = activityChooseMembershipBinding.imgSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ImageView imageView2 = imageView;
        Function1 function1 = new Function1() { // from class: beforeTextChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseMembershipActivity.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        imageView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        ImageView imageView3 = activityChooseMembershipBinding.imgNonSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        ImageView imageView4 = imageView3;
        Function1 function2 = new Function1() { // from class: SearchView1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView4, "");
        Intrinsics.checkNotNullParameter(function2, "");
        imageView4.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
        ImageView imageView5 = activityChooseMembershipBinding.imgIndonesianMigrantWorker;
        Intrinsics.checkNotNullExpressionValue(imageView5, "");
        ImageView imageView6 = imageView5;
        Function1 function3 = new Function1() { // from class: SearchView4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView6, "");
        Intrinsics.checkNotNullParameter(function3, "");
        imageView6.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function3));
        int i2 = asInterface + 49;
        f541a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((onSuggestionClick) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: SearchView2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = f541a + 7;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        Citizenship citizenship;
        String strName;
        boolean z;
        boolean zAreEqual;
        int i;
        ChooseMembershipActivity chooseMembershipActivity = (ChooseMembershipActivity) objArr[0];
        int i2 = 2 % 2;
        ActivityChooseMembershipBinding activityChooseMembershipBinding = (ActivityChooseMembershipBinding) ((ViewBinding) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        RegistrationStatus registrationStatus = (RegistrationStatus) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        try {
            if (registrationStatus != null) {
                if (WhenMappings.$EnumSwitchMapping$0[registrationStatus.ordinal()] == 1) {
                    activityChooseMembershipBinding.groupSalariedWorker.setVisibility(0);
                    Citizenship citizenship2 = ((RegisteredMemberRegistration) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (Intrinsics.areEqual(citizenship2 != null ? citizenship2.name() : null, "WNA")) {
                        int i3 = asInterface + 65;
                        f541a = i3 % 128;
                        if (i3 % 2 == 0) {
                            activityChooseMembershipBinding.groupNonSalariedWorkerCm.setVisibility(13);
                            activityChooseMembershipBinding.groupIndonesianMigrantWorker.setVisibility(70);
                        } else {
                            activityChooseMembershipBinding.groupNonSalariedWorkerCm.setVisibility(8);
                            activityChooseMembershipBinding.groupIndonesianMigrantWorker.setVisibility(8);
                        }
                    }
                }
                citizenship = ((RegisteredMemberRegistration) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (citizenship != null) {
                    i = f541a + 103;
                    asInterface = i % 128;
                    if (i % 2 != 0) {
                        strName = citizenship.name();
                        int i4 = 42 / 0;
                    } else {
                        strName = citizenship.name();
                    }
                } else {
                    strName = null;
                }
                if (!Intrinsics.areEqual(strName, "WNA") && ((RegistrationStatus) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) == RegistrationStatus.UNREGISTERED) {
                    int i5 = f541a + 65;
                    asInterface = i5 % 128;
                    z = i5 % 2 == 0;
                }
                getMaxImages getmaximages = getMaxImages.INSTANCE;
                zAreEqual = Intrinsics.areEqual(getMaxImages.MediaBrowserCompatMediaBrowserImplApi214(), "true");
                int i6 = asInterface + 99;
                f541a = i6 % 128;
                int i7 = i6 % 2;
                if (z) {
                    activityChooseMembershipBinding.groupIndonesianMigrantWorker.setVisibility(zAreEqual ? 0 : 8);
                }
                return null;
            }
            int i8 = asInterface + 95;
            f541a = i8 % 128;
            int i9 = i8 % 2;
            getMaxImages getmaximages2 = getMaxImages.INSTANCE;
            zAreEqual = Intrinsics.areEqual(getMaxImages.MediaBrowserCompatMediaBrowserImplApi214(), "true");
            int i10 = asInterface + 99;
            f541a = i10 % 128;
            int i11 = i10 % 2;
        } catch (Exception unused) {
            zAreEqual = false;
        }
        activityChooseMembershipBinding.imgIndonesianMigrantWorker.setVisibility(8);
        activityChooseMembershipBinding.tvIndonesianMigrantWorker.setVisibility(8);
        citizenship = ((RegisteredMemberRegistration) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (citizenship != null) {
            i = f541a + 103;
            asInterface = i % 128;
            if (i % 2 != 0) {
                strName = citizenship.name();
                int i12 = 42 / 0;
            } else {
                strName = citizenship.name();
            }
        } else {
            strName = null;
        }
        if (!Intrinsics.areEqual(strName, "WNA")) {
        }
        if (z) {
            activityChooseMembershipBinding.groupIndonesianMigrantWorker.setVisibility(zAreEqual ? 0 : 8);
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        f541a = i2 % 128;
        int i3 = i2 % 2;
        ChooseMembershipActivity chooseMembershipActivity = this;
        Intrinsics.checkNotNullParameter(chooseMembershipActivity, "");
        chooseMembershipActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_string_null);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = f541a + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = 1;
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr2 = asBinder;
        if (cArr2 != null) {
            int i11 = $10;
            int i12 = i11 + 7;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            int i13 = i11 + 47;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            while (i2 < length) {
                int i15 = $10 + 45;
                $11 = i15 % 128;
                int i16 = i15 % i3;
                try {
                    Object[] objArr2 = new Object[i7];
                    objArr2[i5] = Integer.valueOf(cArr2[i2]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int iIndexOf = TextUtils.indexOf("", "", i5) + 1270;
                        int deadChar = KeyEvent.getDeadChar(i5, i5) + 18;
                        byte b = (byte) i5;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, deadChar, 407021364, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i2++;
                    i3 = 2;
                    i5 = 0;
                    i7 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i8];
        System.arraycopy(cArr2, i6, cArr3, 0, i8);
        if (bArr != null) {
            char[] cArr4 = new char[i8];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i8) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i17 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3225, View.combineMeasuredStates(0, 0) + 13, 2133916302, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i18 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.indexOf("", "", 0) + 23, 387247676, false, $$i(b5, b6, (byte) (b6 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 41241), 1705 - (Process.myTid() >> 22), 21 - TextUtils.getCapsMode("", 0, 0), -1434471773, false, $$i(b7, (byte) (b7 | 6), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i8);
            int i19 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr3, i19, i10);
            System.arraycopy(cArr5, i10, cArr3, 0, i19);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i8];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i8) {
                cArr6[setvideostabilizationmode.b] = cArr3[(i8 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
                int i20 = $10 + 37;
                $11 = i20 % 128;
                int i21 = i20 % 2;
            }
            cArr3 = cArr6;
        }
        if (i9 > 0) {
            int i22 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i22;
                while (true) {
                    if (setvideostabilizationmode.b >= i8) {
                        break loop3;
                    }
                    int i23 = $10 + 77;
                    $11 = i23 % 128;
                    if (i23 % 2 == 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] >>> iArr[5]);
                        setvideostabilizationmode.b--;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i22 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
            int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr2 = new Object[1];
            c((short) 193, (byte) 37, $$a[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, maximumFlingVelocity, packedPositionGroup, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = asInterface + 87;
            f541a = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
                int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr = $$a;
                Object[] objArr3 = new Object[1];
                c((short) 156, (byte) (bArr[0] - 1), bArr[28], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, offsetBefore, deadChar, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i5 = 1786623863 + (((~((-196566302) | i4)) | (-16036125)) * (-318));
            int i6 = ~((-16036125) | i4);
            int i7 = ~i4;
            int i8 = i5 + ((i6 | (~(200801565 | i7))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i4 | 200801565)) | (~((-4235265) | i7))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 550994149;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{0, 16, 58, 3}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{16, 16, 58, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-967817284};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 42049), 1725 - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 550994149);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                    int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                    byte[] bArr2 = $$a;
                    Object[] objArr8 = new Object[1];
                    c((short) 156, (byte) (bArr2[0] - 1), bArr2[28], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, i11, packedPositionType, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{32, 22, 173, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{54, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                        int iGreen = 1755 - Color.green(0);
                        int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                        short s = (short) ($$b & 382);
                        Object[] objArr11 = new Object[1];
                        c(s, (byte) (s >>> 1), $$a[28], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, iGreen, packedPositionChild, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                        int deadChar2 = 1755 - KeyEvent.getDeadChar(0, 0);
                        int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                        Object[] objArr12 = new Object[1];
                        c((short) 193, (byte) 37, $$a[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, deadChar2, iRgb, 986134021, false, (String) objArr12[0], null);
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
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i13 == i12) {
            int i14 = f541a + 37;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_instruction_step1).substring(0, 1).codePointAt(0) - 1331060899;
            int i17 = ~iCodePointAt;
            int i18 = 508430921 + (((~((-488463749) | i17)) | 151603588) * (-1188));
            int i19 = (~(iCodePointAt | 488463748)) | 151603588;
            int i20 = ~(701066174 | i17);
            int i21 = i16 + i18 + ((i19 | i20) * 594) + (((~(488463748 | i17)) | (-1037926335) | i20) * 594);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr13[3])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i24 = 0;
                while (i24 < strArr.length) {
                    arrayList.add(strArr[i24]);
                    i24++;
                    int i25 = f541a + 121;
                    asInterface = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            int[] iArr = new int[i13];
            int i27 = i13 - 1;
            iArr[i27] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i27) % 2) - 1], 1).show();
            int i28 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i29 = (int) Runtime.getRuntime().totalMemory();
            int i30 = ~i29;
            int i31 = ~((-521900010) | i30);
            int i32 = ~(309297583 | i29);
            int i33 = i28 + (-1774707662) + ((i31 | i32) * 1150) + (((~((-309297584) | i30)) | i32) * (-575)) + (((~(i29 | (-521900010))) | (~(i30 | 521900009))) * 575);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr14[3])[0] = i35 ^ (i35 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr3 = $$a;
            short s2 = (short) (bArr3[0] - 1);
            Object[] objArr15 = new Object[1];
            c(s2, (byte) s2, bArr3[28], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(minimumFlingVelocity, iIndexOf, keyRepeatDelay, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{32, 22, 173, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{54, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
            int defaultSize2 = 1031 - View.getDefaultSize(0, 0);
            int i36 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr4 = $$a;
            Object[] objArr18 = new Object[1];
            c((short) 156, (byte) (bArr4[0] - 1), bArr4[28], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionType2, defaultSize2, i36, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i37 = asInterface + 101;
            f541a = i37 % 128;
            int i38 = i37 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cAlpha = (char) Color.alpha(0);
                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 1031;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                short s3 = $$a[7];
                byte b = (byte) s3;
                Object[] objArr19 = new Object[1];
                c(s3, b, b, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cAlpha, packedPositionType3, absoluteGravity, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i39 = ((int[]) objArr20[3])[0];
            int i40 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i41 = (-1820134283) + (((~((-87559611) | iIdentityHashCode)) | 156720559) * (-366)) + (((~(iIdentityHashCode | (-69730321))) | 138891269) * 366) + 980950764;
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr[2])[0] = i43 ^ (i43 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{0, 16, 58, 3}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{16, 16, 58, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-967817284};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46038), 1133 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 'B' - AndroidCharacter.getMirror('0'), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 980950764, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int packedPositionType4 = 1031 - ExpandableListView.getPackedPositionType(0L);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 16;
                byte[] bArr5 = $$a;
                short s4 = (short) (bArr5[0] - 1);
                Object[] objArr25 = new Object[1];
                c(s4, (byte) s4, bArr5[28], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf, packedPositionType4, iLastIndexOf, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45993), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1117, (Process.myPid() >> 22) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                int gidForName = 1030 - Process.getGidForName("");
                int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                short s5 = $$a[7];
                byte b2 = (byte) s5;
                Object[] objArr26 = new Object[1];
                c(s5, b2, b2, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar3, gidForName, scrollBarSize, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{32, 22, 173, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{54, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char gidForName2 = (char) ((-1) - Process.getGidForName(""));
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                    int i44 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                    byte[] bArr6 = $$a;
                    Object[] objArr29 = new Object[1];
                    c((short) 156, (byte) (bArr6[0] - 1), bArr6[28], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(gidForName2, iIndexOf2, i44, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cGreen = (char) Color.green(0);
                    int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i45 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr7 = $$a;
                    short s6 = (short) (bArr7[0] - 1);
                    Object[] objArr30 = new Object[1];
                    c(s6, (byte) s6, bArr7[28], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cGreen, tapTimeout, i45, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i46 = ((int[]) objArr[1])[0];
        int i47 = ((int[]) objArr[3])[0];
        if (i47 != i46) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i47));
        }
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i48 = ((int[]) objArr[2])[0];
        int i49 = ((int[]) objArr[3])[0];
        int i50 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i51 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        int i52 = ~i51;
        int i53 = i48 + 102517293 + ((i51 | 20407578) * 140) + (((~(20407578 | i52)) | 206045765) * (-280)) + (((~(i51 | (-206045766))) | (~(223872591 | i52)) | 2580752) * 140);
        int i54 = (i53 << 13) ^ i53;
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr31[2])[0] = i55 ^ (i55 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f541a + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        if (i4 != 576112254 + ((~((~i5) | (-822483537))) * 433) + (((~(1896274512 | i5)) | (-1066286970)) * (-433)) + (((~(i5 | (-1066286970))) | 1073790976) * 433)) {
            throw null;
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        if (i6 != ((1551950062 + (((~((-626088708) | i7)) | (-1952967258)) * (-933))) + (((~(i7 | (-1952967258))) | 1344708696) * 933)) - 507975244) {
            int i8 = 1569615478 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i9 = asInterface + 79;
        f541a = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c6, code lost:
    
        if (r1 != (((942615536 + (((~((-529452301) | r4)) | (~((-2049603665) | r4))) * (-867))) + ((((~((-529452301) | r2)) | 436881408) | (~((-2049603665) | r2))) * (-1734))) + (((~(r2 | (-1612722257))) | ((~(r4 | (-436881409))) | (~((-92570893) | r2)))) * 867))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c8, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.registration.ChooseMembershipActivity.asInterface + 69;
        com.bpjstku.presentation.membership.registration.ChooseMembershipActivity.f541a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d6, code lost:
    
        r1 = 7507112 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00df, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
    
        if (r1 == ((((-213171982) + (((~((~r4) | (-1024039283))) | (-1854026826)) * (-235))) + (((~((-1024039283) | r4)) | (-1854026826)) * (-470))) + (((~(r4 | (-738201665))) | (-2139864444)) * 235))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0081, code lost:
    
        if (r1 == ((r7 + ((r6 | r4) * (-1040))) + ((r4 | ((~(r5 | (-1058988573))) | (-2141191936))) * 520))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0083, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = android.os.Process.myTid();
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseMembershipActivity.onStart():void");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00b0  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f541a + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i5 = ~i4;
            if (i3 != (-1530675584) + (((~(1176412858 | i5)) | 346425315) * 226) + (((~(i5 | 1455335419)) | (~((-346425316) | i4)) | 67502754) * (-113)) + ((~(i4 | 1176412858)) * 113)) {
                int[] iArr = new int[1465777182];
                iArr[1465777181] = 1;
                int i6 = 850990950 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i7 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            if (i7 != 959287048 + ((~((~i8) | (-1107337226))) * (-116)) + ((968492406 | i8) * 116) + (((~(i8 | 1798479949)) | 277349682) * 116)) {
                int[] iArr2 = new int[1465777182];
                iArr2[1465777181] = 1;
                int i9 = 850990950 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i10 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i11 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1427535077;
        int i12 = (-793582000) + ((i11 | 8346) * 988);
        int i13 = ~i11;
        if (i10 != i12 + (((~(717367803 | i13)) | 1144328704) * (-1976)) + (((~(i11 | (-1861688162))) | 8346 | (~(i13 | 1861688161))) * 988)) {
            int[] iArr3 = new int[1495179171];
            iArr3[1495179170] = 1;
            int i14 = (-895401434) % 2;
            Toast.makeText((Context) null, iArr3[-1], 1).show();
            int i15 = asInterface + 33;
            f541a = i15 % 128;
            int i16 = i15 % 2;
        }
        super.onCreate(bundle);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ChooseMembershipActivity chooseMembershipActivity = (ChooseMembershipActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = f541a + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            chooseMembershipActivity.d_();
            ViewPortBuilder.b();
            int i4 = f541a + 43;
            asInterface = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChooseMembershipActivity chooseMembershipActivity, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        f541a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (((RegistrationStatus) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) == RegistrationStatus.REGISTERED) {
            int i4 = asInterface + 63;
            f541a = i4 % 128;
            int i5 = i4 % 2;
            RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3((RegisteredMemberRegistration) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue(), null, null, null, null, MembershipType.PMI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388591);
            IndonesianMigrantWorkerRegistrationActivity.Companion companion = IndonesianMigrantWorkerRegistrationActivity.INSTANCE;
            IndonesianMigrantWorkerRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(chooseMembershipActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            try {
                WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
                getMaxImages getmaximages = getMaxImages.INSTANCE;
                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(chooseMembershipActivity, getMaxImages.MediaBrowserCompatMediaBrowserImplApi211(), "Pendaftaran PMI", 0, null, false, 56);
                int i6 = f541a + 115;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            } catch (FirebaseException unused) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "gagal terhubung, silakan periksa koneksi internet anda", 0).show();
            } catch (Exception unused2) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "gagal terhubung, silakan periksa koneksi internet anda", 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RegistrationStatus TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChooseMembershipActivity chooseMembershipActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        f541a = i2 % 128;
        int i3 = i2 % 2;
        RegistrationStatus registrationStatus = (RegistrationStatus) chooseMembershipActivity.getIntent().getParcelableExtra("registration_status");
        int i4 = asInterface + 67;
        f541a = i4 % 128;
        int i5 = i4 % 2;
        return registrationStatus;
    }

    public static /* synthetic */ RegisteredMemberRegistration b(ChooseMembershipActivity chooseMembershipActivity) {
        RegisteredMemberRegistration registeredMemberRegistration;
        int i = 2 % 2;
        int i2 = f541a + 11;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Parcelable parcelableExtra = chooseMembershipActivity.getIntent().getParcelableExtra("registration_data");
            Intrinsics.checkNotNull(parcelableExtra);
            registeredMemberRegistration = (RegisteredMemberRegistration) parcelableExtra;
            int i3 = 54 / 0;
        } else {
            Parcelable parcelableExtra2 = chooseMembershipActivity.getIntent().getParcelableExtra("registration_data");
            Intrinsics.checkNotNull(parcelableExtra2);
            registeredMemberRegistration = (RegisteredMemberRegistration) parcelableExtra2;
        }
        int i4 = asInterface + 17;
        f541a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return registeredMemberRegistration;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChooseMembershipActivity chooseMembershipActivity, View view) {
        int i = 2 % 2;
        int i2 = f541a + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            RegistrationStatus registrationStatus = RegistrationStatus.REGISTERED;
            throw null;
        }
        String str = ((RegistrationStatus) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) == RegistrationStatus.REGISTERED ? "registered_non_salaried_worker_registration_account" : "non_registered_non_salaried_worker_registration_account";
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("params_event_register_account", str));
        if (((RegistrationStatus) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) == RegistrationStatus.REGISTERED) {
            RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3((RegisteredMemberRegistration) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue(), null, null, null, null, MembershipType.BPU, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388591);
            NewRegistrationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewRegistrationActivity.INSTANCE;
            NewRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(chooseMembershipActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
            TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(chooseMembershipActivity, false, false, 6);
            int i4 = f541a + 35;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        Intrinsics.checkNotNullParameter(chooseMembershipActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChooseMembershipActivity chooseMembershipActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        f541a = i2 % 128;
        int i3 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            chooseMembershipActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            chooseMembershipActivity.IconCompatParcelizer();
            if (((BaseModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getB()) {
                if (((RegistrationStatus) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) == RegistrationStatus.REGISTERED) {
                    int i4 = f541a + 103;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3((RegisteredMemberRegistration) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue(), null, null, null, null, MembershipType.PMI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388591);
                    IndonesianMigrantWorkerRegistrationActivity.Companion companion = IndonesianMigrantWorkerRegistrationActivity.INSTANCE;
                    IndonesianMigrantWorkerRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(chooseMembershipActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    IndonesianMigrantWorkerActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = IndonesianMigrantWorkerActivity.INSTANCE;
                    IndonesianMigrantWorkerActivity.Companion.b(chooseMembershipActivity);
                    int i6 = asInterface + 121;
                    f541a = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            chooseMembershipActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ChooseMembershipActivity chooseMembershipActivity, View view) {
        String strName;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", "registered_salaried_worker_registration_account"));
        Intrinsics.checkNotNullParameter(chooseMembershipActivity, "");
        Intrinsics.checkNotNullParameter("registered_salaried_worker_registration_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("registered_salaried_worker_registration_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("registered_salaried_worker_registration_account", mapMutableMapOf);
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3((RegisteredMemberRegistration) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue(), null, null, null, null, MembershipType.PU, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388591);
        Citizenship citizenship = ((RegisteredMemberRegistration) chooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (citizenship != null) {
            strName = citizenship.name();
            int i2 = f541a + 13;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        } else {
            strName = null;
        }
        if (!(!Intrinsics.areEqual(strName, "WNA"))) {
            SalariedWorkerRegistrationActivity.Companion companion = SalariedWorkerRegistrationActivity.INSTANCE;
            SalariedWorkerRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(chooseMembershipActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i4 = f541a + 117;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } else {
            NewRegistrationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewRegistrationActivity.INSTANCE;
            NewRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(chooseMembershipActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    static {
        g = 1;
        g();
        INSTANCE = new Companion(null);
        int i = d + 75;
        g = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1952826605, new Object[]{this}, zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1952826605, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 605028043 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_eye_occlude).substring(0, 28).codePointAt(8) - 1829123558)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        f541a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1527053663, new Object[]{this}, (-2134639316) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, 1527053665, zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        f541a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
    }

    static void g() {
        asBinder = new char[]{59731, 59822, 59796, 59822, 59816, 59821, 59814, 59835, 59819, 59761, 59791, 59823, 59818, 59819, 59788, 59786, 59716, 59797, 59816, 59800, 59780, 59820, 59823, 59781, 59793, 59835, 59811, 59811, 59808, 59816, 59797, 59819, 59788, 59423, 59421, 59411, 59414, 59410, 59416, 59901, 59888, 59413, 59894, 59878, 59416, 59432, 59435, 59410, 59421, 59406, 59407, 59409, 59421, 59423, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746};
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
    private static java.lang.String $$i(byte r7, byte r8, byte r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = com.bpjstku.presentation.membership.registration.ChooseMembershipActivity.$$c
            int r8 = r8 + 99
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseMembershipActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
