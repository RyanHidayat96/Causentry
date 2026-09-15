package com.bpjstku.presentation.membership.registration.registeredmember;

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
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivitySalariedWorkerRegistrationBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity;
import com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType;
import com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState;
import com.google.gson.internal.bind.TypeAdapters;
import defpackage.CameraUseCaseAdapter;
import defpackage.CustomTabsIntentApi21Impl;
import defpackage.CustomTabsServiceConnection1;
import defpackage.LifecycleCameraRepository;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deInitSession;
import defpackage.getActiveConcurrentCameraInfos;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getTargetOriginFromBundle;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setActivitySideSheetRoundedCornersPosition;
import defpackage.setColorScheme;
import defpackage.setQuickZoomEnabled;
import defpackage.setSecondaryToolbarSwipeUpGesture;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0012J)\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0004R\u0015\u0010#\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u001a\u0010!\u001a\u00020\u00138\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b#\u0010'R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00020(8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010*R\u0016\u0010\u0007\u001a\u00020+8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010,"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/registeredmember/SalariedWorkerRegistrationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySalariedWorkerRegistrationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Landroid/os/Bundle;", "p0", "onCreate", "(Landroid/os/Bundle;)V", "onSaveInstanceState", "asInterface", "a", "Lcom/bpjstku/presentation/membership/registration/newregistration/VerificationRequestType;", "(Lcom/bpjstku/presentation/membership/registration/newregistration/VerificationRequestType;)V", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "onDestroy", "g", "LgetUntrustedCreatorPackageName;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SalariedWorkerRegistrationActivity extends BindingBaseActivity<ActivitySalariedWorkerRegistrationBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char asInterface;
    private static char[] d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_salaried_worker_registration;
    private static final byte[] $$c = {83, -44, 103, 46};
    private static final int $$f = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {119, -103, 14, -22, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 24;
    private static int asBinder = 0;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f565a = 1;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws IllegalAccessException {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = ~(i7 | i3);
        int i10 = i8 | i9;
        int i11 = ~i5;
        int i12 = (~((~i3) | i7 | i5)) | (~(i7 | i11 | i3));
        int i13 = i9 | (~(i11 | i4));
        int i14 = i4 + i5 + i2 + ((-1696018712) * i6) + (2108813197 * i);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i4) - 2121662464) + (1221732374 * i5) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i2) + (39845888 * i6) + (227278848 * i) + ((-1705377792) * i15);
        int i17 = ((i4 * 362004572) - 1408384217) + (i5 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i2 * 362004373) + (i6 * (-1290304248)) + (155295761 * i) + (i15 * (-60686336));
        int i18 = i16 + (i17 * i17 * (-1680474112));
        if (i18 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i18 != 3) {
            SalariedWorkerRegistrationActivity salariedWorkerRegistrationActivity = (SalariedWorkerRegistrationActivity) objArr[0];
            int i19 = 2 % 2;
            int i20 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i21 = ~startElapsedRealtime;
            if (i20 != (-1435475804) + (((~(1841845417 | i21)) | (~((-1098925098) | startElapsedRealtime))) * (-831)) + ((~(2110782971 | startElapsedRealtime)) * (-1662)) + (((~(startElapsedRealtime | (-1841845418))) | (~(i21 | (-1011857875))) | (~(1011857874 | startElapsedRealtime))) * 831)) {
                int i22 = g + 45;
                f565a = i22 % 128;
                if (i22 % 2 == 0) {
                    int[] iArr = new int[1962758606];
                    iArr[1962758605] = 0;
                    Toast.makeText((Context) null, iArr[-1], 0).show();
                } else {
                    int[] iArr2 = new int[1962758606];
                    iArr2[1962758605] = 1;
                    int i23 = 106082294 % 2;
                    Toast.makeText((Context) null, iArr2[-1], 1).show();
                }
            }
            int i24 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i25 = (-1829295168) + (((-2126076902) | elapsedCpuTime) * 614);
            int i26 = ~elapsedCpuTime;
            if (i24 != i25 + (((~((-226186418) | i26)) | 21103632 | (~((-1942097749) | i26))) * (-1228)) + (((~(i26 | (-1920994117))) | (~((-205082786) | i26))) * 614)) {
                int i27 = g + 63;
                f565a = i27 % 128;
                if (i27 % 2 == 0) {
                    int[] iArr3 = new int[1623767805];
                    iArr3[1623767804] = 0;
                    Toast.makeText((Context) null, iArr3[-1], 1).show();
                } else {
                    int[] iArr4 = new int[1623767805];
                    iArr4[1623767804] = 1;
                    int i28 = 320594700 % 2;
                    Toast.makeText((Context) null, iArr4[-1], 1).show();
                }
            }
            super.onStart();
            return null;
        }
        SalariedWorkerRegistrationActivity salariedWorkerRegistrationActivity2 = (SalariedWorkerRegistrationActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i29 = 2 % 2;
        int i30 = g + 11;
        f565a = i30 % 128;
        int i31 = i30 % 2;
        if (((Field) CameraUseCaseAdapter.b[0]).getInt(null) != (-1541134816) + (((-20056257) | i) * (-627)) + (((~(1228081351 | i)) | 398093808) * (-627)) + (((~(i | 398093808)) | (~((~i) | (-1228081352)))) * 627)) {
            int i32 = (-1291364780) % 2;
            throw new ArithmeticException();
        }
        int i33 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        if (i33 != 1997655162 + ((~((~iNextInt) | (-2404355))) * 433) + (((~(1731507218 | iNextInt)) | (-15595888)) * (-433)) + (((~(iNextInt | (-15595888))) | 1729102864) * 433)) {
            int i34 = f565a + 111;
            g = i34 % 128;
            int i35 = i34 % 2;
            int[] iArr5 = new int[1978355825];
            iArr5[1978355824] = 1;
            int i36 = (-1663991440) % 2;
            Toast.makeText((Context) null, iArr5[-1], 1).show();
        }
        super.onCreate(bundle);
        if (bundle != null) {
            ((getUntrustedCreatorPackageName) salariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.setValue((RegisteredMemberRegistration) bundle.getParcelable("key_membership_data"));
            ((getUntrustedCreatorPackageName) salariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.setValue(Integer.valueOf(bundle.getInt("key_current_step")));
            return null;
        }
        int i37 = g + 9;
        f565a = i37 % 128;
        int i38 = i37 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = salariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (registeredMemberRegistration == null) {
            return null;
        }
        ((getUntrustedCreatorPackageName) salariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.setValue(registeredMemberRegistration);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r6
            byte[] r1 = com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity.$$a
            int r7 = 197 - r7
            int r5 = r5 * 14
            int r5 = r5 + 84
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r5
            r5 = r6
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r7]
        L27:
            int r7 = r7 + 1
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity.c(byte, byte, int, java.lang.Object[]):void");
    }

    public SalariedWorkerRegistrationActivity() {
        final SalariedWorkerRegistrationActivity salariedWorkerRegistrationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                LifecycleOwner lifecycleOwner = salariedWorkerRegistrationActivity;
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
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/registeredmember/SalariedWorkerRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, SalariedWorkerRegistrationActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 57;
        int i3 = i2 % 128;
        f565a = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentbindingInflater1;
        int i6 = i3 + 81;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySalariedWorkerRegistrationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 65;
        f565a = i2 % 128;
        if (i2 % 2 == 0) {
            SalariedWorkerRegistrationActivity$bindingInflater$1 salariedWorkerRegistrationActivity$bindingInflater$1 = SalariedWorkerRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
        SalariedWorkerRegistrationActivity$bindingInflater$1 salariedWorkerRegistrationActivity$bindingInflater$2 = SalariedWorkerRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = f565a + 125;
        g = i3 % 128;
        int i4 = i3 % 2;
        return salariedWorkerRegistrationActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 89;
        f565a = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (RegisteredMemberRegistration) getIntent().getParcelableExtra("registration_data");
        int i4 = g + 37;
        f565a = i4 % 128;
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
        int i2 = g + 59;
        f565a = i2 % 128;
        int i3 = i2 % 2;
        this.b = LayoutRegistrationProgressBinding.bind(((ActivitySalariedWorkerRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        SalariedWorkerRegistrationActivity salariedWorkerRegistrationActivity = this;
        Intrinsics.checkNotNullParameter(salariedWorkerRegistrationActivity, "");
        salariedWorkerRegistrationActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivitySalariedWorkerRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.title_registration_jmo);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = f565a + 95;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.b;
        if (layoutRegistrationProgressBinding == null) {
            int i2 = f565a + 101;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 19 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            layoutRegistrationProgressBinding = null;
        }
        SeekBar seekBar = layoutRegistrationProgressBinding.sbRegisterProgression;
        Intrinsics.checkNotNullExpressionValue(seekBar, "");
        Intrinsics.checkNotNullParameter(seekBar, "");
        seekBar.setOnTouchListener(new getActiveConcurrentCameraInfos());
        ((ActivitySalariedWorkerRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: isSendToExternalDefaultHandlerEnabled
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        int i4 = f565a + 103;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle p0) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = g + 7;
        f565a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onSaveInstanceState(p0);
        p0.putParcelable("key_membership_data", ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.getValue());
        Integer value = ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
        if (value != null) {
            iIntValue = value.intValue();
            int i4 = g + 63;
            f565a = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iIntValue = 1;
        }
        p0.putInt("key_current_step", iIntValue);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new b(new Function1() { // from class: isBackgroundInteractionEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (Integer) obj);
            }
        }));
        int i2 = g + 119;
        f565a = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = d;
        int i5 = 1770390596;
        Object obj2 = null;
        int i6 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) i6;
                        byte b4 = (byte) (b3 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2266, TextUtils.indexOf("", "", 0, 0) + 33, -1927765101, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i5 = 1770390596;
                    i6 = 3;
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
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 3;
            byte b6 = (byte) (b5 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 2267, TextUtils.indexOf((CharSequence) "", '0', 0) + 34, -1927765101, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 103;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                i2 = i + 7;
                cArr4[i2] = (char) (cArr[i2] << b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $10 + 125;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i11 = $10 + 19;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                    i3 = 2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 2;
                        byte b8 = (byte) (b7 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49267), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3261, 29 - TextUtils.lastIndexOf("", '0', 0), -127612708, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i13 = $11 + 3;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 22878), 594 - Color.alpha(0), AndroidCharacter.getMirror('0') - 31, 1570859318, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i16 = $11 + 93;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                        } else {
                            int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                            int i22 = $10 + 25;
                            $11 = i22 % 128;
                            i3 = 2;
                            int i23 = i22 % 2;
                        }
                    }
                    i3 = 2;
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i3;
                obj2 = obj;
            }
        }
        for (int i24 = 0; i24 < i; i24++) {
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public final void b(VerificationRequestType p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i2 = WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i2 == 1) {
            RegistrationVerifyEmailOtpActivity.Companion companion = RegistrationVerifyEmailOtpActivity.INSTANCE;
            RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.getValue());
            return;
        }
        int i3 = g + 67;
        f565a = i3 % 128;
        if (i3 % 2 != 0 ? i2 != 2 : i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        RegistrationVerifyPhoneOtpActivity.Companion companion2 = RegistrationVerifyPhoneOtpActivity.INSTANCE;
        RegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.getValue());
        int i4 = f565a + 123;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        super.onActivityResult(p0, p1, p2);
        if (p1 == -1) {
            int i2 = g + 13;
            f565a = i2 % 128;
            int i3 = i2 % 2;
            RegistrationVerifyEmailOtpActivity.Companion companion = RegistrationVerifyEmailOtpActivity.INSTANCE;
            if (p0 == RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                int i4 = g + 53;
                f565a = i4 % 128;
                if (i4 % 2 != 0) {
                    ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return;
                } else {
                    ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    throw null;
                }
            }
            if (p0 == 101) {
                int i5 = f565a + 117;
                g = i5 % 128;
                int i6 = i5 % 2;
                ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = f565a + 81;
                g = i2 % 128;
                int i3 = i2 % 2;
                onBackPressed();
                int i4 = g + 45;
                f565a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 4;
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6 = f565a + 9;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                return zOnOptionsItemSelected;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = f565a + 31;
        g = i2 % 128;
        int i3 = i2 % 2;
        g();
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = f565a + 125;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = g + 69;
        f565a = i2 % 128;
        int i3 = i2 % 2;
        ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.removeObservers(this);
        super.onDestroy();
        int i4 = f565a + 59;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    private final void g() {
        int i = 2 % 2;
        int i2 = g + 87;
        f565a = i2 % 128;
        int i3 = i2 % 2;
        Integer value = ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
        if (value == null || value.intValue() != 1) {
            ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = g + 63;
            f565a = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        d_();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr2;
        SalariedWorkerRegistrationActivity salariedWorkerRegistrationActivity = (SalariedWorkerRegistrationActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0));
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
            int i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            byte b2 = $$a[7];
            Object[] objArr3 = new Object[1];
            c(b2, (byte) (b2 | 15), (short) 193, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i2, i3, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char longPressTimeout = (char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr4 = new Object[1];
                c(b3, b4, (short) (b4 | 156), objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, i4, longPressTimeout2, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = (((1458938391 + (((~((-556535877) | elapsedCpuTime)) | (~((~elapsedCpuTime) | (-343933451)))) * (-318))) + (((~(691860676 | elapsedCpuTime)) | (-1035794127)) * (-318))) + (((~(elapsedCpuTime | (-691860677))) | 479258250) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 573570619;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{5, 21, 15, 24, 6, '\r', 21, 22, '\r', '\t', 2, 0, 22, '\b', 18, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 24), (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{7, '\n', 16, 22, '\b', 6, '\t', 2, 23, 21, 21, 18, 16, 19, 17, 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step1).substring(1, 3).length() + 12), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step2).substring(15, 16).length() + 15, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, salariedWorkerRegistrationActivity)).intValue();
            try {
                Object[] objArr8 = {-1608746504};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.myTid() >> 22) + 42049), 1726 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 29 - TextUtils.getTrimmedLength(""), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), -573570619);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (29944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                    int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr9 = new Object[1];
                    c(b5, b6, (short) (b6 | 156), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, scrollDefaultDelay, iCombineMeasuredStates, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{21, 22, 17, 7, 15, '\b', '\r', 7, 23, 3, 6, 3, 3, 24, '\f', 22, 0, 18, '\r', 16, 14, 5}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 88), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.chademo_ev_connector_type).substring(0, 6).length() + 16, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{16, '\f', 23, '\n', 22, 18, '\n', 2, 15, 22, '\f', 6, '\b', 0, 13868}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step1).substring(0, 1).codePointAt(0) - 31), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_6).substring(3, 4).codePointAt(0) - 102, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                        int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr12 = new Object[1];
                        c(b7, b8, (short) (b8 | 104), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iIndexOf, iLastIndexOf, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                        int i8 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
                        byte b9 = $$a[7];
                        Object[] objArr13 = new Object[1];
                        c(b9, (byte) (b9 | 15), (short) 193, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, i8, bitsPerPixel, 986134021, false, (String) objArr13[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i11 = g + 125;
        f565a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int i14 = ~((int) SystemClock.elapsedRealtime());
        int i15 = i13 + (-248099679) + ((527867647 | i14) * 184) + (((~(i14 | 504534777)) | 259268166) * 184);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr14[3])[0] = i17 ^ (i17 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i18 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
            byte b10 = $$a[7];
            byte b11 = b10;
            Object[] objArr15 = new Object[1];
            c(b10, b11, (short) (b11 | 52), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, i18, deadChar, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{21, 22, 17, 7, 15, '\b', '\r', 7, 23, 3, 6, 3, 3, 24, '\f', 22, 0, 18, '\r', 16, 14, 5}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_expired).substring(7, 9).codePointAt(1) - 24), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{16, '\f', 23, '\n', 22, 18, '\n', 2, 15, 22, '\f', 6, '\b', 0, 13868}, (byte) (45 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_otp_message).substring(8, 9).codePointAt(0) - 88, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int i19 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int touchSlop = 15 - (ViewConfiguration.getTouchSlop() >> 8);
            byte b12 = $$a[7];
            byte b13 = b12;
            Object[] objArr18 = new Object[1];
            c(b12, b13, (short) (b13 | 156), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveOpacity, i19, touchSlop, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i20 = g + 83;
            f565a = i20 % 128;
            int i21 = i20 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int i22 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                byte[] bArr = $$a;
                Object[] objArr19 = new Object[1];
                c(bArr[28], (byte) 52, bArr[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cCombineMeasuredStates, i22, iKeyCodeFromString, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr20[3])[0];
            int i24 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i25 = ~startElapsedRealtime;
            int i26 = 1798851200 + (((~(i25 | (-658381403))) | 902661572) * (-1042)) + (((-658381403) | startElapsedRealtime) * 521) + (((~(startElapsedRealtime | (-902661573))) | 281118084 | (~(i25 | (-36837915)))) * 521) + 304399378;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[2])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{5, 21, 15, 24, 6, '\r', 21, 22, '\r', '\t', 2, 0, 22, '\b', 18, 2}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 91), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{7, '\n', 16, 22, '\b', 6, '\t', 2, 23, 21, 21, 18, 16, 19, 17, 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_7).substring(0, 1).length() + 13), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_bank_transfer).substring(0, 7).codePointAt(0) - 64, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, salariedWorkerRegistrationActivity)).intValue();
            Object[] objArr23 = {-1608746504};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1135 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 18 - View.resolveSizeAndState(0, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 304399378, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                byte b14 = $$a[7];
                byte b15 = b14;
                Object[] objArr25 = new Object[1];
                c(b14, b15, (short) (b15 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollBarFadeDuration, trimmedLength, iIndexOf2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.alpha(0)), TextUtils.indexOf((CharSequence) "", '0') + 1118, 17 - Drawable.resolveOpacity(0, 0)), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                int i29 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                Object[] objArr26 = new Object[1];
                c(bArr2[28], (byte) 52, bArr2[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, jumpTapTimeout, i29, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{21, 22, 17, 7, 15, '\b', '\r', 7, 23, 3, 6, 3, 3, 24, '\f', 22, 0, 18, '\r', 16, 14, 5}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.danamon_online_description_1).substring(9, 10).codePointAt(0) - 22), (ViewConfiguration.getTouchSlop() >> 8) + 22, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{16, '\f', 23, '\n', 22, 18, '\n', 2, 15, 22, '\f', 6, '\b', 0, 13868}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.email_instruction).substring(8, 9).length() + 44), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int i30 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    byte b16 = $$a[7];
                    byte b17 = b16;
                    Object[] objArr29 = new Object[1];
                    c(b16, b17, (short) (b17 | 156), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(mode, i30, minimumFlingVelocity, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int i31 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                    int mirror = AndroidCharacter.getMirror('0') - '!';
                    byte b18 = $$a[7];
                    byte b19 = b18;
                    Object[] objArr30 = new Object[1];
                    c(b18, b19, (short) (b19 | 52), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, i31, mirror, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr2[1])[0];
        int i33 = ((int[]) objArr2[3])[0];
        if (i33 == i32) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i34 = ((int[]) objArr2[2])[0];
            int i35 = ((int[]) objArr2[3])[0];
            int i36 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int i37 = ~((int) Process.getStartUptimeMillis());
            int i38 = i34 + (-963190647) + (((~(i37 | 593109701)) | 343971098) * (-160)) + (((~(i37 | 348829531)) | 593109701) * 160);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            int i41 = f565a;
            int i42 = i41 + 15;
            g = i42 % 128;
            int i43 = i42 % 2;
            int i44 = i41 + 77;
            g = i44 % 128;
            int i45 = i44 % 2;
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i33];
        int i46 = i33 - 1;
        iArr[i46] = 1;
        Toast.makeText((Context) null, iArr[((i33 * i46) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i47 = ((int[]) objArr2[2])[0];
        int i48 = ((int[]) objArr2[3])[0];
        int i49 = ((int[]) objArr2[1])[0];
        String[] strArr5 = (String[]) objArr2[0];
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i50 = ~iFreeMemory;
        int i51 = i47 + 2085015510 + ((588596737 | i50) * (-757)) + ((~(932568727 | iFreeMemory)) * 1514) + (((~(iFreeMemory | (-343971991))) | (~(i50 | 344316567)) | 588252160) * 757);
        int i52 = (i51 << 13) ^ i51;
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr32[2])[0] = i53 ^ (i53 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f565a + 15;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        if (i4 != 11667230 + ((~(2059403241 | i5)) * 623) + (((~i5) | 134242432) * (-623)) + (((~(i5 | 681829065)) | (~(1511816608 | i5)) | (-2059403242)) * 623)) {
            int i6 = g + 101;
            f565a = i6 % 128;
            if (i6 % 2 == 0) {
                int[] iArr = new int[1590038303];
                iArr[1590038302] = 1;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1590038303];
                iArr2[1590038302] = 1;
                int i7 = (-904751454) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = ~iIdentityHashCode;
        if (i8 != 767966968 + ((1874149179 | i9) * (-369)) + (((~((-800329260) | i9)) | 1778726705) * (-369)) + (((~(iIdentityHashCode | 800329259)) | 1073819920 | (~(i9 | (-95422475)))) * 369)) {
            throw new RuntimeException("641372632");
        }
        super.onResume();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SalariedWorkerRegistrationActivity salariedWorkerRegistrationActivity, View view) {
        int i = 2 % 2;
        int i2 = f565a + 57;
        g = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            salariedWorkerRegistrationActivity.g();
            ViewPortBuilder.b();
            int i4 = f565a + 31;
            g = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(SalariedWorkerRegistrationActivity salariedWorkerRegistrationActivity, Integer num) {
        String string;
        CustomTabsServiceConnection1 customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1;
        String str;
        MembershipType membershipType;
        CustomTabsIntentApi21Impl customTabsIntentApi21ImplTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        int i2 = g + 27;
        f565a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = salariedWorkerRegistrationActivity.b;
        Object obj = null;
        if (layoutRegistrationProgressBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setProgress(iIntValue * 20);
        TextView textView = layoutRegistrationProgressBinding.tvStepNumber;
        StringBuilder sb = new StringBuilder();
        sb.append(iIntValue);
        sb.append("/5");
        textView.setText(sb.toString());
        TextView textView2 = layoutRegistrationProgressBinding.tvRegistrationStep;
        if (iIntValue == 1) {
            string = salariedWorkerRegistrationActivity.getString(R.string.title_term_and_condition);
        } else if (iIntValue == 2) {
            string = salariedWorkerRegistrationActivity.getString(R.string.label_personal_data);
        } else if (iIntValue == 3) {
            string = salariedWorkerRegistrationActivity.getString(R.string.title_email_verification);
        } else if (iIntValue != 4) {
            int i4 = g + 49;
            f565a = i4 % 128;
            if (i4 % 2 == 0) {
                salariedWorkerRegistrationActivity.getString(R.string.label_create_password);
                obj.hashCode();
                throw null;
            }
            string = salariedWorkerRegistrationActivity.getString(R.string.label_create_password);
        } else {
            string = salariedWorkerRegistrationActivity.getString(R.string.label_phone_number_verification);
        }
        textView2.setText(string);
        int iIntValue2 = num.intValue();
        if (iIntValue2 == 1) {
            CustomTabsServiceConnection1.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = CustomTabsServiceConnection1.INSTANCE;
            customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = CustomTabsServiceConnection1.Companion.TuitionPaymentFragmentbindingInflater1();
            str = "registration_account_step_first";
        } else if (iIntValue2 == 2) {
            RegisteredMemberRegistration registeredMemberRegistration = salariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (registeredMemberRegistration != null) {
                int i5 = f565a + 103;
                g = i5 % 128;
                int i6 = i5 % 2;
                membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i7 = f565a + 117;
                g = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 / 2;
                }
            } else {
                membershipType = null;
            }
            if (membershipType == MembershipType.PU) {
                int i9 = g + 93;
                f565a = i9 % 128;
                int i10 = i9 % 2;
                setSecondaryToolbarSwipeUpGesture.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSecondaryToolbarSwipeUpGesture.INSTANCE;
                customTabsIntentApi21ImplTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSecondaryToolbarSwipeUpGesture.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else {
                CustomTabsIntentApi21Impl.Companion bVar = CustomTabsIntentApi21Impl.INSTANCE;
                customTabsIntentApi21ImplTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CustomTabsIntentApi21Impl.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = (LifecycleCameraRepository) customTabsIntentApi21ImplTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            str = "registration_account_step_second";
        } else if (iIntValue2 == 3) {
            setActivitySideSheetRoundedCornersPosition.Companion tuitionPaymentFragmentbindingInflater1 = setActivitySideSheetRoundedCornersPosition.INSTANCE;
            customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = setActivitySideSheetRoundedCornersPosition.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            str = "registration_account_step_third";
        } else if (iIntValue2 != 4) {
            setColorScheme.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = setColorScheme.INSTANCE;
            customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = setColorScheme.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            str = "registration_account_step_fifth";
        } else {
            customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = getTargetOriginFromBundle.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            str = "registration_account_step_fourth";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        salariedWorkerRegistrationActivity.getSupportFragmentManager().beginTransaction().replace(R.id.salariedWorkerContainer, customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1).addToBackStack(null).commit();
        return Unit.INSTANCE;
    }

    static {
        INotificationSideChannel = 1;
        d();
        INSTANCE = new Companion(null);
        int i = asBinder + 103;
        INotificationSideChannel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = g + 67;
        f565a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_primary_cta_text).substring(5, 14).length() - 109859907, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1323507371, -1323507370, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle p0) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1655935672, 1655935675, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, new Object[]{this, p0});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_alfamart).substring(0, 8).codePointAt(7) - 638096933;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iCodePointAt, 485786808, -485786808, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 31;
        f565a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = f565a + 51;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1615718181;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1178804209, 1178804211, i, new Object[]{this, context});
    }

    static void d() {
        d = new char[]{60073, 60072, 60041, 60054, 60034, 60050, 60049, 60047, 60117, 60048, 60056, 60055, 60063, 60043, 60060, 60088, 60051, 60062, 60052, 60045, 60058, 60053, 60083, 60040, 60075};
        asInterface = (char) 57188;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 7;
        f565a = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r6 = 116 - r6
            byte[] r1 = com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity.$$i(int, byte, short):java.lang.String");
    }
}
