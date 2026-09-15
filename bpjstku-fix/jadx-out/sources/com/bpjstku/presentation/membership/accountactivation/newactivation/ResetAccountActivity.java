package com.bpjstku.presentation.membership.accountactivation.newactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityResetAccountBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.membership.accountactivation.newactivation.ResetAccountActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.enums.VerificationActionType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.dynamite.zzk;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.ActivityChooserModelActivityResolveInfo;
import defpackage.AppCompatEditTextInspectionCompanion;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.LifecycleCameraRepository;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.getActiveConcurrentCameraInfos;
import defpackage.getEventTime;
import defpackage.getSuperCaller;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onSetCheckMarkDrawable;
import defpackage.setButtonPanelLayoutHint;
import defpackage.setCheckMarkDrawable;
import defpackage.setInternalBackgroundTint;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import defpackage.setSupportAllCaps;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011J)\u0010\u0016\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0004R\u0015\u0010\b\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010\u0006\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\"\u001a\u00020\u00128\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0016\u0010&\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010(R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00020)8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010+R\u0016\u0010\u000f\u001a\u00020,8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b&\u0010-R\u001a\u0010\u001e\u001a\u00020\u00128\u0015X\u0095D¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b&\u0010."}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/newactivation/ResetAccountActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityResetAccountBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Landroid/os/Bundle;", "p0", "onCreate", "(Landroid/os/Bundle;)V", "onSaveInstanceState", "asInterface", "a", "Lcom/bpjstku/presentation/membership/registration/newregistration/VerificationRequestType;", "(Lcom/bpjstku/presentation/membership/registration/newregistration/VerificationRequestType;)V", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "onDestroy", "g", "LgetUntrustedCreatorPackageName;", "Lkotlin/Lazy;", "Landroidx/fragment/app/FragmentManager;", "TuitionPaymentFragmentbindingInflater1", "Landroidx/fragment/app/FragmentManager;", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResetAccountActivity extends BindingBaseActivity<ActivityResetAccountBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int d;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final FragmentManager b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {94, -56, 58, -24};
    private static final int $$f = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {114, -115, 48, 84, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 40;
    private static int cancelAll = 1;
    private static int asBinder = 0;
    private static int notify = 1;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VerificationRequestType.values().length];
            try {
                iArr[VerificationRequestType.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationRequestType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VerificationActionType.values().length];
            try {
                iArr2[VerificationActionType.EMAIL_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VerificationActionType.PHONE_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
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

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = i6 | i7 | i8;
        int i10 = (~(i7 | i)) | (~(i8 | i6));
        int i11 = (~(i | i6)) | (~(i7 | (~i6) | i8));
        int i12 = i6 + i2 + i3 + ((-160716491) * i5) + (1883135422 * i4);
        int i13 = i12 * i12;
        int i14 = (((-1835184368) * i6) - 666828800) + ((-962678542) * i2) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i3) + ((-1967783936) * i5) + ((-2092695552) * i4) + ((-870252544) * i13);
        int i15 = (i6 * 1975847376) + 750996803 + (i2 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i3 * 1975846509) + (i5 * (-526956143)) + (i4 * 972447206) + (i13 * (-1341325312));
        int i16 = i14 + (i15 * i15 * 1929838592);
        if (i16 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        int i17 = 2 % 2;
        int i18 = asBinder + 75;
        notify = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    private static void c(int i, byte b, short s, Object[] objArr) {
        int i2 = i + 4;
        byte[] bArr = $$a;
        int i3 = 98 - (b * 14);
        byte[] bArr2 = new byte[s + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i3 = (s + (-i2)) - 11;
            i2++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == s) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i3;
            int i7 = i2 + 1;
            i4 = i5;
            i3 = (i6 + (-bArr[i2])) - 11;
            i2 = i7;
        }
    }

    public ResetAccountActivity() {
        final ResetAccountActivity resetAccountActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.ResetAccountActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                LifecycleOwner lifecycleOwner = resetAccountActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class);
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
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        this.b = supportFragmentManager;
        this.TuitionPaymentFragmentbindingInflater1 = 6;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        this.g = R.layout.activity_reset_account;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.newactivation.ResetAccountActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/newactivation/ResetAccountActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) ResetAccountActivity.class);
            intent.putExtra("registration_data", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityResetAccountBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ResetAccountActivity$bindingInflater$1 resetAccountActivity$bindingInflater$1 = ResetAccountActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = asBinder + 75;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return resetAccountActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        int i3 = i2 % 128;
        notify = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.g;
        int i5 = i3 + 71;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 79;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (RegisteredMemberRegistration) getIntent().getParcelableExtra("registration_data");
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (RegisteredMemberRegistration) getIntent().getParcelableExtra("registration_data");
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = notify + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.a = LayoutRegistrationProgressBinding.bind(((ActivityResetAccountBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        ResetAccountActivity resetAccountActivity = this;
        Intrinsics.checkNotNullParameter(resetAccountActivity, "");
        resetAccountActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityResetAccountBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_string_null);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = asBinder + 17;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.a;
        Object obj = null;
        if (layoutRegistrationProgressBinding == null) {
            int i2 = notify + 13;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        SeekBar seekBar = layoutRegistrationProgressBinding.sbRegisterProgression;
        Intrinsics.checkNotNullExpressionValue(seekBar, "");
        Intrinsics.checkNotNullParameter(seekBar, "");
        seekBar.setOnTouchListener(new getActiveConcurrentCameraInfos());
        ((ActivityResetAccountBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: AppCompatButton
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        int i4 = notify + 117;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $11 + 17;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(d)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 3291 - TextUtils.getOffsetAfter("", 0), KeyEvent.getDeadChar(0, 0) + 31, 1199271174, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), 651 - KeyEvent.getDeadChar(0, 0), 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -450685997, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i8 = $10 + 29;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $11 + 111;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i12 = i2 % setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr4[i11] = cArr2[0];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", ""), 651 - ((Process.getThreadPriority(0) + 20) >> 6), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44, -450685997, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -450685997, false, $$i(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        ResetAccountActivity resetAccountActivity = (ResetAccountActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 11;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            if (i3 != (-1679769934) + ((~((-1098425441) | iFreeMemory)) * (-301)) + (((~(1736287346 | iFreeMemory)) | (~((~iFreeMemory) | 906299803))) * (-301)) + (((~(iFreeMemory | (-906299804))) | 1736287346) * 301)) {
                throw null;
            }
        } else {
            int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iMyPid = Process.myPid();
            int i5 = ~iMyPid;
            if (i4 != (((((~(1828508046 | i5)) | (~((-998520504) | iMyPid))) | (~(i5 | 998520503))) * 959) - 1594337448) + (((~(iMyPid | 998520503)) | (~(i5 | (-998520504))) | (~(1828508046 | iMyPid))) * 959)) {
                throw null;
            }
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = (int) Runtime.getRuntime().totalMemory();
        int i8 = ~((-1815677959) | i7);
        int i9 = ~i7;
        if (i6 != 316106876 + ((i8 | (~(1840856406 | i9))) * (-406)) + ((~((-1077478401) | i9)) * (-406)) + (((~(i7 | (-763378007))) | (~(1815677958 | i9))) * 406)) {
            throw new RuntimeException("-750300082");
        }
        super.onCreate(bundle);
        if (bundle == null) {
            int i10 = asBinder + 41;
            notify = i10 % 128;
            if (i10 % 2 != 0) {
                RegisteredMemberRegistration registeredMemberRegistration = resetAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (registeredMemberRegistration != null) {
                    ((getUntrustedCreatorPackageName) resetAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.setValue(registeredMemberRegistration);
                }
                return null;
            }
            RegisteredMemberRegistration registeredMemberRegistration2 = resetAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        ((getUntrustedCreatorPackageName) resetAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.setValue((RegisteredMemberRegistration) bundle.getParcelable("key_membership_data"));
        ((getUntrustedCreatorPackageName) resetAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.setValue(Integer.valueOf(bundle.getInt("key_current_step")));
        return null;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle p0) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onSaveInstanceState(p0);
        p0.putParcelable("key_membership_data", ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.getValue());
        Integer value = ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
        if (value != null) {
            int i2 = asBinder + 45;
            notify = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = value.intValue();
            int i4 = asBinder + 25;
            notify = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iIntValue = 1;
        }
        p0.putInt("key_current_step", iIntValue);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getAutoSizeMaxTextSize
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResetAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (Integer) obj);
            }
        }));
        int i2 = notify + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void b(VerificationRequestType p0) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = asBinder + 111;
            notify = i5 % 128;
            int i6 = i5 % 2;
            NewRegistrationActivationVerifyPhoneOtpActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewRegistrationActivationVerifyPhoneOtpActivity.INSTANCE;
            NewRegistrationActivationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.getValue());
            return;
        }
        NewRegistrationActivationVerifyEmailOtpActivity.Companion companion = NewRegistrationActivationVerifyEmailOtpActivity.INSTANCE;
        ResetAccountActivity resetAccountActivity = this;
        RegisteredMemberRegistration value = ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.getValue();
        Intrinsics.checkNotNullParameter(resetAccountActivity, "");
        Intent intent = new Intent(resetAccountActivity, (Class<?>) NewRegistrationActivationVerifyEmailOtpActivity.class);
        intent.putExtra("registration_data", value);
        resetAccountActivity.startActivityForResult(intent, NewRegistrationActivationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i7 = asBinder + 53;
        notify = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 80 / 0;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        super.onActivityResult(p0, p1, p2);
        if (p1 == -1) {
            int i2 = notify + 65;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                NewRegistrationActivationVerifyEmailOtpActivity.Companion companion = NewRegistrationActivationVerifyEmailOtpActivity.INSTANCE;
                NewRegistrationActivationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                throw null;
            }
            NewRegistrationActivationVerifyEmailOtpActivity.Companion companion2 = NewRegistrationActivationVerifyEmailOtpActivity.INSTANCE;
            if (p0 != NewRegistrationActivationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                if (p0 == 101) {
                    ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            } else {
                int i3 = asBinder + 89;
                notify = i3 % 128;
                if (i3 % 2 != 0) {
                    ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } else {
                    ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                onBackPressed();
                int i4 = asBinder + 121;
                notify = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 4;
                }
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ResetAccountActivity resetAccountActivity = (ResetAccountActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        resetAccountActivity.g();
        int i4 = asBinder + 17;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = notify + 21;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.removeObservers(this);
            super.onDestroy();
            throw null;
        }
        ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.removeObservers(this);
        super.onDestroy();
        int i3 = asBinder + 115;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 87 / 0;
        }
    }

    private final void g() {
        int i = 2 % 2;
        int i2 = notify + 25;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Integer value = ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
            if (value == null || value.intValue() != 1) {
                ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return;
            }
            d_();
            int i3 = notify + 19;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = asBinder + 95;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int scrollBarSize = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 16;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[5], (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, scrollBarSize, bitsPerPixel, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 182, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 90, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20, new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(true, 186 - (ViewConfiguration.getTapTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 101, 8 - ExpandableListView.getPackedPositionType(0L), new char[]{65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int iIndexOf = 1031 - TextUtils.indexOf("", "", 0);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
            Object[] objArr5 = new Object[1];
            c((short) 52, $$a[5], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, iIndexOf, touchSlop, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                short s = (short) ($$b | 64);
                byte b = $$a[7];
                Object[] objArr6 = new Object[1];
                c(s, b, b, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, fadingEdgeLength, scrollBarFadeDuration, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iMyUid = Process.myUid();
            int i6 = (-266778885) + (((~((-425225729) | iMyUid)) | 180945558) * (-318));
            int i7 = ~(180945558 | iMyUid);
            int i8 = ~iMyUid;
            int i9 = i6 + ((i7 | (~((-42008727) | i8))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyUid | (-42008727))) | (~(467234454 | i8))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 906023352;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
            int i12 = asBinder + 31;
            notify = i12 % 128;
            int i13 = i12 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(false, 181 - TextUtils.getOffsetBefore("", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_time_save_credit).substring(12, 14).length() + 6, new char[]{5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f'}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 184, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 27, new char[]{65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1463944068};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 46039), (ViewConfiguration.getLongPressTimeout() >> 16) + 1134, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 906023352, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int i14 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
                    byte[] bArr2 = $$a;
                    Object[] objArr12 = new Object[1];
                    c(bArr2[7], bArr2[5], (byte) 52, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop2, i14, iNormalizeMetaState, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - KeyEvent.keyCodeFromString("")), 1118 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 17 - (Process.myPid() >> 22)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int i15 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1030;
                    int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                    short s2 = (short) ($$b | 64);
                    byte b2 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    c(s2, b2, b2, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i15, trimmedLength, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(true, TextUtils.getOffsetBefore("", 0) + 182, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 10, new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 150, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_mandiri_point).substring(1, 3).codePointAt(0) - 82, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step3).substring(0, 1).length() + 7, new char[]{65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
                        Object[] objArr16 = new Object[1];
                        c((short) 52, $$a[5], (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, packedPositionType, modifierMetaStateMask, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                        int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(bArr3[7], bArr3[5], (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, offsetAfter, iResolveOpacity, 1357589585, false, (String) objArr17[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = i18 + (-634604599) + (((~(iIdentityHashCode | (-639559113))) | (-883839283)) * (-465)) + (((-639559113) | (~((-883839283) | iIdentityHashCode))) * 930) + ((iIdentityHashCode | (-604913921)) * 465);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i24 = asBinder + 71;
                notify = i24 % 128;
                int i25 = 2;
                int i26 = i24 % 2;
                int i27 = 0;
                while (i27 < strArr3.length) {
                    int i28 = asBinder + 83;
                    notify = i28 % 128;
                    int i29 = i28 % i25;
                    arrayList.add(strArr3[i27]);
                    i27++;
                    i25 = 2;
                }
            }
            int[] iArr = new int[i17];
            int i30 = i17 - 1;
            iArr[i30] = 1;
            Toast.makeText((Context) null, iArr[((i17 * i30) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[3])[0];
            int i33 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i34 = ~iFreeMemory;
            int i35 = i31 + (-704166954) + (((~((-203518972) | i34)) | (-40761199)) * (-865)) + ((~(iFreeMemory | 203518971)) * 865) + (((~((-40761199) | i34)) | (~(i34 | 203518971))) * 865);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr19[2])[0] = i37 ^ (i37 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1755;
            int i38 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            short s3 = (short) ($$b | 64);
            byte b3 = $$a[5];
            Object[] objArr20 = new Object[1];
            c(s3, b3, (byte) (b3 | 36), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionGroup, iIndexOf2, i38, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                int iAlpha = 23 - Color.alpha(0);
                Object[] objArr21 = new Object[1];
                c((short) 52, $$a[5], (byte) 52, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveOpacity, iIndexOf3, iAlpha, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i39 = ~iElapsedRealtime;
            int i40 = ((((-1807175903) + (((~((-526444065) | i39)) | 201384960) * (-108))) + (((~(i39 | 739046490)) | ((~((-739046491) | iElapsedRealtime)) | (-1064105595))) * 54)) + ((iElapsedRealtime | (-1064105595)) * 54)) - 1287773658;
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i42 ^ (i42 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 170, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.chademo_ev_connector_type).substring(0, 6).codePointAt(3) - 84, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 28, new char[]{5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f'}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 149, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 89, new char[]{65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1463944068};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42049), 1726 - TextUtils.getTrimmedLength(""), 29 - TextUtils.indexOf("", "", 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1287773658);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                Object[] objArr26 = new Object[1];
                c((short) 52, $$a[5], (byte) 52, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cAxisFromString, scrollDefaultDelay, threadPriority, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(true, AndroidCharacter.getMirror('0') + 134, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_mandiri).substring(15, 17).length() + 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_empty_expiry_date).substring(9, 10).length() + 20, new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(true, ExpandableListView.getPackedPositionChild(0L) + 187, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step5).substring(28, 29).codePointAt(0) - 31, 8 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                    int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                    Object[] objArr29 = new Object[1];
                    c((short) 141, $$a[5], (byte) 52, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cKeyCodeFromString, capsMode, maxKeyCode, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char modifierMetaStateMask2 = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iMyTid = 1755 - (Process.myTid() >> 22);
                    int i43 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                    short s4 = (short) ($$b | 64);
                    byte b4 = $$a[5];
                    Object[] objArr30 = new Object[1];
                    c(s4, b4, (byte) (b4 | 36), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(modifierMetaStateMask2, iMyTid, i43, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i44 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i45 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i45 == i44) {
            int i46 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i47 = ~iIdentityHashCode2;
            int i48 = i46 + (-2077952424) + (((~((-550067217) | i47)) | (~(337464790 | iIdentityHashCode2))) * 217) + (((~(iIdentityHashCode2 | (-550067217))) | 549457920) * 217) + (((~(337464790 | i47)) | 550067216) * 217);
            int i49 = (i48 << 13) ^ i48;
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr31[3])[0] = i50 ^ (i50 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
        if (strArr5 != null) {
            int i51 = asBinder + 19;
            notify = i51 % 128;
            int i52 = i51 % 2 != 0 ? 0 : 1;
            while (i52 < strArr5.length) {
                int i53 = asBinder + 35;
                notify = i53 % 128;
                if (i53 % 2 == 0) {
                    arrayList2.add(strArr5[i52]);
                    i52 += 111;
                } else {
                    arrayList2.add(strArr5[i52]);
                    i52++;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i45));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        Object obj = null;
        int i2 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i4 = ~i3;
        if (i2 != (((~(1027498320 | i4)) | (~((-197510778) | i3)) | (~(i4 | 197510777))) * 959) + 2073154896 + (((~(i3 | 197510777)) | (~(i4 | (-197510778))) | (~(1027498320 | i3))) * 959)) {
            throw new RuntimeException("363052755");
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        if (i5 != ((((~(i6 | 747477288)) | 1831578676) * 56) - 140280172) + (((~((~i6) | 1831578676)) | 747477288) * 56)) {
            int i7 = asBinder + 93;
            notify = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[1842508117];
            iArr[1842508116] = 1;
            int i9 = 365802724 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onResume();
        int i10 = asBinder + 87;
        notify = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IllegalAccessException {
        ResetAccountActivity resetAccountActivity = (ResetAccountActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ~(((int) Process.getElapsedCpuTime()) | (-1653459043));
        if (i4 != 1585559780 + (((-823471500) | i5) * (-220)) + ((i5 | 1116258400) * 220) + 340604276) {
            throw new RuntimeException("1853995191");
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMyPid = Process.myPid();
        if (i6 != ((((~((-25427979) | iMyPid)) | (-2077214640)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 267977414) + ((~((~iMyPid) | (-25427979))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
            throw new RuntimeException("51237382");
        }
        super.onStart();
        int i7 = asBinder + 125;
        notify = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ResetAccountActivity resetAccountActivity, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            resetAccountActivity.g();
            ViewPortBuilder.b();
            int i4 = asBinder + 69;
            notify = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ResetAccountActivity resetAccountActivity, Integer num) {
        String string;
        AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanionTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str;
        setInternalBackgroundTint setinternalbackgroundtintTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = resetAccountActivity.a;
        MembershipType membershipType = null;
        if (layoutRegistrationProgressBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setProgress(iIntValue * 16);
        TextView textView = layoutRegistrationProgressBinding.tvStepNumber;
        StringBuilder sb = new StringBuilder();
        sb.append(iIntValue);
        sb.append("/6");
        textView.setText(sb.toString());
        TextView textView2 = layoutRegistrationProgressBinding.tvRegistrationStep;
        if (iIntValue == 1) {
            string = resetAccountActivity.getString(R.string.label_personal_data);
        } else if (iIntValue == 2) {
            string = resetAccountActivity.getString(R.string.title_email_verification);
        } else if (iIntValue == 3) {
            string = resetAccountActivity.getString(R.string.label_phone_number_verification);
        } else if (iIntValue != 4) {
            int i2 = asBinder + 105;
            notify = i2 % 128;
            if (i2 % 2 == 0) {
                resetAccountActivity.getString(R.string.title_term_and_condition);
                throw null;
            }
            string = resetAccountActivity.getString(R.string.title_term_and_condition);
        } else {
            string = resetAccountActivity.getString(R.string.label_create_password);
            int i3 = asBinder + 123;
            notify = i3 % 128;
            int i4 = i3 % 2;
        }
        textView2.setText(string);
        int iIntValue2 = num.intValue();
        if (iIntValue2 == 1) {
            AppCompatEditTextInspectionCompanion.Companion companion = AppCompatEditTextInspectionCompanion.INSTANCE;
            appCompatEditTextInspectionCompanionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AppCompatEditTextInspectionCompanion.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            str = "registration_account_step_first";
        } else if (iIntValue2 == 2) {
            RegisteredMemberRegistration registeredMemberRegistration = resetAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if ((registeredMemberRegistration != null ? registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null) == MembershipType.PU) {
                onSetCheckMarkDrawable.Companion companion2 = onSetCheckMarkDrawable.INSTANCE;
                setinternalbackgroundtintTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onSetCheckMarkDrawable.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else {
                setInternalBackgroundTint.Companion companion3 = setInternalBackgroundTint.INSTANCE;
                setinternalbackgroundtintTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setInternalBackgroundTint.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i5 = asBinder + 61;
                notify = i5 % 128;
                int i6 = i5 % 2;
            }
            appCompatEditTextInspectionCompanionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = (LifecycleCameraRepository) setinternalbackgroundtintTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            str = "registration_account_step_second";
        } else if (iIntValue2 == 3) {
            setCheckMarkDrawable.Companion companion4 = setCheckMarkDrawable.INSTANCE;
            appCompatEditTextInspectionCompanionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setCheckMarkDrawable.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            str = "registration_account_step_third";
        } else if (iIntValue2 == 4) {
            getSuperCaller.Companion companion5 = getSuperCaller.INSTANCE;
            appCompatEditTextInspectionCompanionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSuperCaller.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            str = "registration_account_step_fourth";
        } else if (iIntValue2 != 5) {
            int i7 = asBinder + 33;
            notify = i7 % 128;
            if (i7 % 2 == 0) {
                ActivityChooserModelActivityResolveInfo.Companion bVar = ActivityChooserModelActivityResolveInfo.INSTANCE;
                ActivityChooserModelActivityResolveInfo.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                membershipType.hashCode();
                throw null;
            }
            ActivityChooserModelActivityResolveInfo.Companion bVar2 = ActivityChooserModelActivityResolveInfo.INSTANCE;
            appCompatEditTextInspectionCompanionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ActivityChooserModelActivityResolveInfo.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            str = "registration_account_step_six";
        } else {
            setSupportAllCaps.Companion companion6 = setSupportAllCaps.INSTANCE;
            appCompatEditTextInspectionCompanionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setSupportAllCaps.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            str = "registration_account_step_fifth";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        resetAccountActivity.getSupportFragmentManager().beginTransaction().replace(R.id.salariedWorkerContainer, appCompatEditTextInspectionCompanionTuitionPaymentFragmentspecialinlinedviewModeldefault3).commit();
        return Unit.INSTANCE;
    }

    static {
        onTransact = 0;
        d();
        INSTANCE = new Companion(null);
        int i = cancelAll + 25;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        b(new Object[]{this}, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -985145064, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 985145066);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        b(new Object[]{this}, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 405085608, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingcity_empty).substring(15, 16).codePointAt(0) - 1354588680, 1770517320 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -405085607);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle p0) {
        b(new Object[]{this, p0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 569334358, -405881982, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_invalid_input_telkomsel).substring(0, 6).length() - 1364399085, 405881985);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        b(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima3).substring(12, 18).codePointAt(2) - 579027209, -458377390, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.input_3).substring(3, 4).length() - 2037483883, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingcity_empty).substring(15, 16).codePointAt(0) - 960032368, zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 458377390);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
    }

    static void d() {
        d = -83722447;
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
    private static java.lang.String $$i(short r6, byte r7, int r8) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r7 = 120 - r7
            byte[] r1 = com.bpjstku.presentation.membership.accountactivation.newactivation.ResetAccountActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
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
            int r3 = r3 + 1
            r4 = r1[r6]
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
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.ResetAccountActivity.$$i(short, byte, int):java.lang.String");
    }
}
