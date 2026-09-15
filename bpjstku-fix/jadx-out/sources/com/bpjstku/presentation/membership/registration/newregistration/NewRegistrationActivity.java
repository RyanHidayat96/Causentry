package com.bpjstku.presentation.membership.registration.newregistration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bpjstku.databinding.ActivityNewRegistrationBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.enums.VerificationActionType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.analytics.connector.internal.zzg;
import defpackage.BrowserActionsFallbackMenuAdapter;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CustomTabsIntentApi21Impl;
import defpackage.CustomTabsServiceConnection1;
import defpackage.LifecycleCameraRepository;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.getActiveConcurrentCameraInfos;
import defpackage.getEventTime;
import defpackage.getTargetOriginFromBundle;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
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
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0011J)\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0004R\u0015\u0010\"\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0083D¢\u0006\u0006\n\u0004\b\b\u0010%R\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010\u0006\u001a\u00020(8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b&\u0010)R\u0018\u0010\t\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00020,8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010.R\u0014\u0010\b\u001a\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010/"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/newregistration/NewRegistrationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityNewRegistrationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/os/Bundle;", "p0", "onCreate", "(Landroid/os/Bundle;)V", "onSaveInstanceState", "Lcom/bpjstku/presentation/membership/registration/newregistration/VerificationRequestType;", "(Lcom/bpjstku/presentation/membership/registration/newregistration/VerificationRequestType;)V", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "onDestroy", "onTransact", "LgetUntrustedCreatorPackageName;", "d", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewRegistrationActivity extends BindingBaseActivity<ActivityNewRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char asBinder;
    private static char asInterface;
    private static int cancelAll;
    private static char g;
    private static char onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final FragmentManager b;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private RegisteredMemberRegistration asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {21, 65, -9, -121};
    private static final int $$f = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 41, 28, -3, -3, 30, 7, 29, -72, 72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$k = 215;
    private static final byte[] $$a = {6, 51, 46, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 224;
    private static int cancel = 1;
    private static int INotificationSideChannel = 0;
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

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws IllegalAccessException {
        int i7 = ~((~i2) | i5);
        int i8 = (~((~i5) | (~i3))) | i7;
        int i9 = i5 | i3;
        int i10 = i5 + i3 + i + ((-39394691) * i6) + ((-2104995841) * i4);
        int i11 = i10 * i10;
        int i12 = (i5 * (-1880913482)) + 198443008 + ((-1880913482) * i3) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i) + ((-1529085952) * i6) + ((-319553536) * i4) + ((-289079296) * i11);
        int i13 = ((i5 * 1773844906) - 1404835566) + (i3 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i * 1773845519) + (i6 * 1055723859) + (i4 * 1996616689) + (i11 * (-1450508288));
        int i14 = i12 + (i13 * i13 * (-778371072));
        if (i14 != 1) {
            if (i14 != 2) {
                return i14 != 3 ? TuitionPaymentFragmentbindingInflater1(objArr) : b(objArr);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        NewRegistrationActivity newRegistrationActivity = (NewRegistrationActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i15 = 2 % 2;
        int i16 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        if (i16 != (-22730376) + (((~((~startElapsedRealtime) | 1262242851)) | 281260364) * 446) + (((~(startElapsedRealtime | 1543503215)) | 150994944) * 446) + 888070760) {
            int i17 = (-378701548) % 2;
            throw new ArithmeticException();
        }
        int i18 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i19 = ~((~((int) Process.getElapsedCpuTime())) | 2121640310);
        if (i18 != (((1681137680 | i19) * (-970)) - 890755712) + ((i19 | 440502630) * 970)) {
            throw null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            int i20 = INotificationSideChannel;
            int i21 = i20 + 39;
            notify = i21 % 128;
            int i22 = i21 % 2;
            RegisteredMemberRegistration registeredMemberRegistration = newRegistrationActivity.asInterface;
            if (registeredMemberRegistration != null) {
                int i23 = i20 + 111;
                notify = i23 % 128;
                int i24 = i23 % 2;
                ((getUntrustedCreatorPackageName) newRegistrationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).b.setValue(registeredMemberRegistration);
            }
        } else {
            ((getUntrustedCreatorPackageName) newRegistrationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).b.setValue((RegisteredMemberRegistration) bundle.getParcelable("key_membership_data"));
            ((getUntrustedCreatorPackageName) newRegistrationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.setValue(Integer.valueOf(bundle.getInt("key_current_step")));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.$$a
            int r7 = r7 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 43
            int r0 = 53 - r7
            int r8 = r8 + 4
            byte[] r1 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.$$j
            int r6 = r6 * 17
            int r6 = r6 + 67
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r6]
        L2e:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.f(short, int, short, java.lang.Object[]):void");
    }

    public NewRegistrationActivity() {
        final NewRegistrationActivity newRegistrationActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                LifecycleOwner lifecycleOwner = newRegistrationActivity;
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 6;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/newregistration/NewRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) NewRegistrationActivity.class);
            intent.putExtra("registration_data", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityNewRegistrationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 119;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            NewRegistrationActivity$bindingInflater$1 newRegistrationActivity$bindingInflater$1 = NewRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        NewRegistrationActivity$bindingInflater$1 newRegistrationActivity$bindingInflater$2 = NewRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i3 = notify + 1;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 37 / 0;
        }
        return newRegistrationActivity$bindingInflater$2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 27;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 % 5;
        }
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 113;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) asInterface) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onTransact);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", i5) + 47773);
                        int offsetBefore = 468 - TextUtils.getOffsetBefore("", i5);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, offsetBefore, iKeyCodeFromString, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) asBinder) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(g)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - ExpandableListView.getPackedPositionGroup(0L)), ExpandableListView.getPackedPositionGroup(0L) + 468, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2323, 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i13 = $10 + 71;
            $11 = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0263  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = notify + 89;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (layoutRegistrationProgressBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        SeekBar seekBar = layoutRegistrationProgressBinding.sbRegisterProgression;
        Intrinsics.checkNotNullExpressionValue(seekBar, "");
        Intrinsics.checkNotNullParameter(seekBar, "");
        seekBar.setOnTouchListener(new getActiveConcurrentCameraInfos());
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
            int iMyTid = (Process.myTid() >> 22) + 2267;
            int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iMyTid, iIndexOf, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{22030, 38720, 6481, 61114, 13717, 53689, 54043, 19568, 40594, 55958, 10898, 54322, 36697, 12701, 8498, 18552, 4312, 33957, 13921, 33921, 8404, 13525, 50008, 49789}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{60612, 63026, 941, 14643, 55082, 2341, 3722, 24600, 17372, 60538, 5520, 2866, 7219, 59095, 46157, 32874, 510, 53439}, 15 - Color.blue(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int iBlue = Color.blue(0) + 2267;
            int iIndexOf2 = TextUtils.indexOf("", "") + 33;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b3, bArr2[1], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iBlue, iIndexOf2, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = INotificationSideChannel + 107;
            notify = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
                int iNormalizeMetaState = 33 - KeyEvent.normalizeMetaState(0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b4, (short) (b4 | 103), (byte) (bArr3[33] - 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, i6, iNormalizeMetaState, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[0])[0];
            int i8 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i10 = ~i9;
            int i11 = (-1262639511) + (((~(759575822 | i10)) | 44679761) * (-108)) + (((~(i10 | 49137493)) | (~((-49137494) | i9)) | 755118090) * 54) + ((i9 | 755118090) * 54) + 789624238;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
            c = 3;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                e(new char[]{34547, 24970, 23908, 34672, 59143, 38807, 13991, 23839, 44472, 55251, 61915, 53413, 34555, 62949, 58180, 2033, 61925, 46543, 9474, 15249, 53063, 40407, 41349, 8869, 38032, 18799, 36447, 59810}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 10, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{49198, 6219, 34199, 13650, 760, 35665, 35026, 37852, 39267, 60050, 34176, 3465, 4251, 13578, 44486, 41316, 55814, 49652, 28398, 38650}, 18 - TextUtils.indexOf("", "", 0, 0), objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if (baseContext instanceof ContextWrapper) {
                    int i14 = INotificationSideChannel + 63;
                    notify = i14 % 128;
                    int i15 = i14 % 2;
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
            e(new char[]{2774, 38316, 55769, 9235, Typography.prime, 4328, 43475, 30241, 45459, 51760, 2904, 47753, 604, 28906, 6403, 23018, 64274, 32377}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unable_to_parse_information).substring(0, 31).length() - 15, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{9364, 40621, 47383, 55996, 1112, 32295, 39418, 6710, 54656, 7676, 8365, 36545, 56269, 52370, 33659, 33232, 48827, 60467}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 82, objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 789624238};
                byte[] bArr4 = $$j;
                byte b5 = bArr4[16];
                byte b6 = bArr4[14];
                Object[] objArr13 = new Object[1];
                f(b5, (byte) (-b6), b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f((byte) (-bArr4[14]), bArr4[16], bArr4[35], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (baseContext != null) {
                    int i16 = INotificationSideChannel + 59;
                    notify = i16 % 128;
                    int i17 = i16 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2267;
                        int iResolveSize = 33 - View.resolveSize(0, 0);
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        c(b7, (short) (b7 | 103), (byte) (bArr5[33] - 1), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, maxKeyCode, iResolveSize, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{22030, 38720, 6481, 61114, 13717, 53689, 54043, 19568, 40594, 55958, 10898, 54322, 36697, 12701, 8498, 18552, 4312, 33957, 13921, 33921, 8404, 13525, 50008, 49789}, View.combineMeasuredStates(0, 0) + 22, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{60612, 63026, 941, 14643, 55082, 2341, 3722, 24600, 17372, 60538, 5520, 2866, 7219, 59095, 46157, 32874, 510, 53439}, 15 - TextUtils.indexOf("", "", 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iAxisFromString = 2266 - MotionEvent.axisFromString("");
                            int fadingEdgeLength = 33 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            c(b8, bArr6[1], b8, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, iAxisFromString, fadingEdgeLength, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                            int iMakeMeasureSpec = 2267 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 33;
                            byte[] bArr7 = $$a;
                            byte b9 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            c(b9, bArr7[5], b9, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, iMakeMeasureSpec, threadPriority, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i18 = ((int[]) objArr[c])[0];
        int i19 = ((int[]) objArr[0])[0];
        if (i19 == i18) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = ~iIdentityHashCode;
            int i24 = i20 + (-1065627188) + (((~((-446850189) | i23)) | (~((-361863128) | iIdentityHashCode))) * 217) + (((~(iIdentityHashCode | (-446850189))) | 276825220) * 217) + (((~((-361863128) | i23)) | 446850188) * 217);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr21[2])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i27 = notify + 31;
                INotificationSideChannel = i27 % 128;
                int i28 = i27 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            int i31 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i33 = ~i32;
            int i34 = i29 + 2089260831 + ((i32 | 327878858) * 140) + (((~(327878858 | i33)) | 203485969) * (-280)) + (((~(i32 | (-203485970))) | (~(480834457 | i33)) | 50530370) * 140);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr22[2])[0] = i36 ^ (i36 << 5);
        }
        ((ActivityNewRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: eldest
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException {
                NewRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, view);
            }
        });
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 67;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = (RegisteredMemberRegistration) getIntent().getParcelableExtra("registration_data");
        int i4 = INotificationSideChannel + 61;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new b(new Function1() { // from class: descendingIterator
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Integer) obj);
            }
        }));
        int i2 = notify + 35;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 37;
        notify = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutRegistrationProgressBinding.bind(((ActivityNewRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        NewRegistrationActivity newRegistrationActivity = this;
        Intrinsics.checkNotNullParameter(newRegistrationActivity, "");
        newRegistrationActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityNewRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_string_null);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = notify + 57;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle p0) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onSaveInstanceState(p0);
        p0.putParcelable("key_membership_data", ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.getValue()).b.getValue());
        Integer value = ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
        if (value != null) {
            int i2 = INotificationSideChannel + 13;
            notify = i2 % 128;
            if (i2 % 2 == 0) {
                value.intValue();
                throw null;
            }
            iIntValue = value.intValue();
        } else {
            iIntValue = 1;
        }
        p0.putInt("key_current_step", iIntValue);
        int i3 = notify + 47;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r5 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.INotificationSideChannel + 71;
        com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.notify = r5 % 128;
        r5 = r5 % 2;
        r5 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.INSTANCE;
        com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentbindingInflater1(r4, ((defpackage.getUntrustedCreatorPackageName) r4.TuitionPaymentFragmentbindingInflater1.getValue()).b.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        r5 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.INSTANCE;
        com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.Companion.b(r4, ((defpackage.getUntrustedCreatorPackageName) r4.TuitionPaymentFragmentbindingInflater1.getValue()).b.getValue());
        r5 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.INotificationSideChannel + 61;
        com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.notify = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if ((r5 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        r5 = 96 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r5 != 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.notify
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.INotificationSideChannel = r2
            int r1 = r1 % r0
            r2 = 1
            java.lang.String r3 = ""
            if (r1 == 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int[] r1 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r1[r5]
            if (r5 == r2) goto L58
            goto L2c
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int[] r1 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r1[r5]
            if (r5 == r2) goto L58
        L2c:
            if (r5 != r0) goto L52
            int r5 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.INotificationSideChannel
            int r5 = r5 + 71
            int r1 = r5 % 128
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.notify = r1
            int r5 = r5 % r0
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity$b r5 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.INSTANCE
            r5 = r4
            com.nbs.nucleosnucleo.presentation.BaseActivity r5 = (com.nbs.nucleosnucleo.presentation.BaseActivity) r5
            kotlin.Lazy r0 = r4.TuitionPaymentFragmentbindingInflater1
            java.lang.Object r0 = r0.getValue()
            getUntrustedCreatorPackageName r0 = (defpackage.getUntrustedCreatorPackageName) r0
            androidx.lifecycle.MutableLiveData<com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration> r0 = r0.b
            androidx.lifecycle.LiveData r0 = (androidx.p002lifecycle.LiveData) r0
            java.lang.Object r0 = r0.getValue()
            com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration r0 = (com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration) r0
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentbindingInflater1(r5, r0)
            return
        L52:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L58:
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1 r5 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.INSTANCE
            r5 = r4
            com.nbs.nucleosnucleo.presentation.BaseActivity r5 = (com.nbs.nucleosnucleo.presentation.BaseActivity) r5
            kotlin.Lazy r1 = r4.TuitionPaymentFragmentbindingInflater1
            java.lang.Object r1 = r1.getValue()
            getUntrustedCreatorPackageName r1 = (defpackage.getUntrustedCreatorPackageName) r1
            androidx.lifecycle.MutableLiveData<com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration> r1 = r1.b
            androidx.lifecycle.LiveData r1 = (androidx.p002lifecycle.LiveData) r1
            java.lang.Object r1 = r1.getValue()
            com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration r1 = (com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration) r1
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.Companion.b(r5, r1)
            int r5 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.INotificationSideChannel
            int r5 = r5 + 61
            int r1 = r5 % 128
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.notify = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L81
            r5 = 96
            int r5 = r5 / 0
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.b(com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        RegisteredMemberRegistration registeredMemberRegistration;
        int i = 2 % 2;
        super.onActivityResult(p0, p1, p2);
        if (p2 != null) {
            registeredMemberRegistration = (RegisteredMemberRegistration) p2.getParcelableExtra("registration_data_verify");
        } else {
            int i2 = notify + 81;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            registeredMemberRegistration = null;
        }
        if (registeredMemberRegistration != null) {
            ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.getValue()).b.setValue(registeredMemberRegistration);
        }
        if (p1 == -1) {
            int i4 = notify + 75;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 == 0 ? p0 == 100 : p0 == 119) {
                ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            } else if (p0 == 101) {
                ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = notify + 19;
        INotificationSideChannel = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                onBackPressed();
                int i3 = notify + 39;
                INotificationSideChannel = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 % 2;
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 23;
        notify = i2 % 128;
        int i3 = i2 % 2;
        onTransact();
        int i4 = INotificationSideChannel + 121;
        notify = i4 % 128;
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
        int i2 = notify + 113;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.removeObservers(this);
        super.onDestroy();
        int i4 = INotificationSideChannel + 85;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = notify + 103;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Integer value = ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
        if (value != null) {
            int i4 = notify + 5;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            if (value.intValue() == 1) {
                d_();
                return;
            }
        }
        ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrB$5f1425da;
        int i = 0;
        NewRegistrationActivity newRegistrationActivity = (NewRegistrationActivity) objArr[0];
        Context context = (Context) objArr[1];
        int i2 = 2 % 2;
        int i3 = notify + 33;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            c(b2, bArr[1], b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, threadPriority, iArgb, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{22030, 38720, 6481, 61114, 13717, 53689, 54043, 19568, 40594, 55958, 10898, 54322, 36697, 12701, 8498, 18552, 4312, 33957, 13921, 33921, 8404, 13525, 50008, 49789}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto6_bni).substring(8, 9).length() + 21, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{60612, 63026, 941, 14643, 55082, 2341, 3722, 24600, 17372, 60538, 5520, 2866, 7219, 59095, 46157, 32874, 510, 53439}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b3, bArr2[5], b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, i5, iNormalizeMetaState, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = INotificationSideChannel + 29;
            notify = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int gidForName = 1030 - Process.getGidForName("");
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                c(bArr3[132], (short) 140, (byte) (bArr3[1] + 1), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, gidForName, jumpTapTimeout, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr8[3])[0];
            int i9 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iNextInt = new Random().nextInt();
            int i10 = 462464089 + (((~((-461386373) | iNextInt)) | 318779524 | (~(217106202 | iNextInt))) * (-880));
            int i11 = (~((-461386373) | (~iNextInt))) | (-217106203);
            int i12 = ~(iNextInt | 461386372);
            int i13 = ((i10 + ((i11 | i12) * (-880))) + (i12 * 880)) - 619185217;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr2[2])[0] = i15 ^ (i15 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{2774, 38316, 55769, 9235, Typography.prime, 4328, 43475, 30241, 45459, 51760, 2904, 47753, 604, 28906, 6403, 23018, 64274, 32377}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{9364, 40621, 47383, 55996, 1112, 32295, 39418, 6710, 54656, 7676, 8365, 36545, 56269, 52370, 33659, 33232, 48827, 60467}, 16 - KeyEvent.normalizeMetaState(0), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, newRegistrationActivity)).intValue();
            try {
                Object[] objArr11 = {1134188540};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - TextUtils.indexOf((CharSequence) "", '0')), 1134 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -619185217, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1032;
                    int i16 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b4 = bArr4[7];
                    Object[] objArr13 = new Object[1];
                    c(b4, bArr4[1], b4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, packedPositionChild, i16, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 45994), 1117 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 'A' - AndroidCharacter.getMirror('0')), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                    int iIndexOf = 15 - TextUtils.indexOf("", "", 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr5[132], (short) 140, (byte) (bArr5[1] + 1), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, iLastIndexOf, iIndexOf, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{22030, 38720, 6481, 61114, 13717, 53689, 54043, 19568, 40594, 55958, 10898, 54322, 36697, 12701, 8498, 18552, 4312, 33957, 13921, 33921, 8404, 13525, 50008, 49789}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{60612, 63026, 941, 14643, 55082, 2341, 3722, 24600, 17372, 60538, 5520, 2866, 7219, 59095, 46157, 32874, 510, 53439}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_promo_amount).substring(4, 5).codePointAt(0) - 64, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0);
                        int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr6 = $$a;
                        byte b5 = bArr6[7];
                        Object[] objArr17 = new Object[1];
                        c(b5, bArr6[5], b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(edgeSlop, iIndexOf2, offsetAfter, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 1031;
                        int i17 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                        byte[] bArr7 = $$a;
                        byte b6 = bArr7[7];
                        Object[] objArr18 = new Object[1];
                        c(b6, bArr7[1], b6, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, offsetAfter2, i17, 1357589585, false, (String) objArr18[0], null);
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
            if (strArr2 != null) {
                while (i < strArr2.length) {
                    arrayList.add(strArr2[i]);
                    i++;
                }
            }
            throw null;
        }
        int i18 = notify + 75;
        INotificationSideChannel = i18 % 128;
        int i19 = i18 % 2;
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i20 = ((int[]) objArr2[2])[0];
        int i21 = ((int[]) objArr2[3])[0];
        int i22 = ((int[]) objArr2[1])[0];
        String[] strArr3 = (String[]) objArr2[0];
        int iMyTid = Process.myTid();
        int i23 = i20 + 1680443226 + ((~((~iMyTid) | (-136708609))) * 433) + (((~(178733866 | iMyTid)) | (-423014037)) * (-433)) + (((~(iMyTid | (-423014037))) | 42025258) * 433);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr19[2])[0] = i25 ^ (i25 << 5);
        int i26 = notify + 55;
        int i27 = i26 % 128;
        INotificationSideChannel = i27;
        int i28 = i26 % 2;
        int i29 = i27 + 121;
        notify = i29 % 128;
        if (i29 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                int i30 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                byte[] bArr8 = $$a;
                byte b7 = bArr8[7];
                Object[] objArr20 = new Object[1];
                c(b7, (short) (b7 | 103), (byte) (bArr8[33] - 1), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(pressedStateDuration, i30, iResolveOpacity, 986134021, false, (String) objArr20[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
            int iIndexOf3 = 1755 - TextUtils.indexOf("", "");
            int iMyTid2 = 23 - (Process.myTid() >> 22);
            byte[] bArr9 = $$a;
            byte b8 = bArr9[7];
            Object[] objArr21 = new Object[1];
            c(b8, (short) (b8 | 103), (byte) (bArr9[33] - 1), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(mirror, iIndexOf3, iMyTid2, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c4 = (char) (29944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                int iGreen = Color.green(0) + 23;
                byte[] bArr10 = $$a;
                byte b9 = bArr10[7];
                Object[] objArr22 = new Object[1];
                c(b9, bArr10[5], b9, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c4, tapTimeout, iGreen, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            int i31 = ((int[]) objArr23[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i31}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int i32 = ~Process.myPid();
            int i33 = (-251538111) + (((~(i32 | 1068863334)) | (~((-721518881) | i32))) * (-184)) + ((279973440 | (~((-1001492321) | i32)) | (~(788889894 | i32))) * 184) + 696796396;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            e(new char[]{2774, 38316, 55769, 9235, Typography.prime, 4328, 43475, 30241, 45459, 51760, 2904, 47753, 604, 28906, 6403, 23018, 64274, 32377}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            e(new char[]{9364, 40621, 47383, 55996, 1112, 32295, 39418, 6710, 54656, 7676, 8365, 36545, 56269, 52370, 33659, 33232, 48827, 60467}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 95, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, newRegistrationActivity)).intValue();
            Object[] objArr26 = {1134188540};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 42049), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1726, 29 - Color.red(0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr26), 208161268);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c5 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                int capsMode2 = 1755 - TextUtils.getCapsMode("", 0, 0);
                int iIndexOf4 = 23 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr11 = $$a;
                byte b10 = bArr11[7];
                Object[] objArr27 = new Object[1];
                c(b10, bArr11[5], b10, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c5, capsMode2, iIndexOf4, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArrB$5f1425da);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{22030, 38720, 6481, 61114, 13717, 53689, 54043, 19568, 40594, 55958, 10898, 54322, 36697, 12701, 8498, 18552, 4312, 33957, 13921, 33921, 8404, 13525, 50008, 49789}, 22 - KeyEvent.keyCodeFromString(""), objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{60612, 63026, 941, 14643, 55082, 2341, 3722, 24600, 17372, 60538, 5520, 2866, 7219, 59095, 46157, 32874, 510, 53439}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardWarningTitle).substring(0, 20).codePointAt(17) - 71, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c6 = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int i36 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                    byte b11 = $$a[7];
                    byte b12 = b11;
                    Object[] objArr30 = new Object[1];
                    c(b12, (short) (b12 | 140), b11, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c6, i36, threadPriority2, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                    int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                    int mode = View.MeasureSpec.getMode(0) + 23;
                    byte[] bArr12 = $$a;
                    byte b13 = bArr12[7];
                    Object[] objArr31 = new Object[1];
                    c(b13, (short) (b13 | 103), (byte) (bArr12[33] - 1), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cKeyCodeFromString, iIndexOf5, mode, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i37 = ((int[]) objArrB$5f1425da[1])[0];
        int i38 = ((int[]) objArrB$5f1425da[0])[0];
        if (i38 != i37) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrB$5f1425da[4];
            if (strArr4 != null) {
                while (i < strArr4.length) {
                    arrayList2.add(strArr4[i]);
                    i++;
                }
            }
            throw new RuntimeException(String.valueOf(i38));
        }
        int i39 = ((int[]) objArrB$5f1425da[3])[0];
        int i40 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr32 = {new int[]{i40}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iMyTid3 = Process.myTid();
        int i41 = ~((-286277709) | iMyTid3);
        int i42 = ~iMyTid3;
        int i43 = i39 + (-1825487588) + ((i41 | (~(1039596510 | i42))) * 497) + (((~(iMyTid3 | 1039596510)) | (~((-965921229) | i42)) | 679643520) * 497);
        int i44 = (i43 << 13) ^ i43;
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr32[3])[0] = i45 ^ (i45 << 5);
        return null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1883810637
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.onResume():void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws IllegalAccessException {
        NewRegistrationActivity newRegistrationActivity = (NewRegistrationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 111;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i4 = ~iUptimeMillis;
            if (i3 != 695548304 + (((~((-1414820145) | i4)) | 584832601) * (-328)) + ((iUptimeMillis | 584832601) * 164) + (((~(iUptimeMillis | 1414820144)) | 579569225 | (~(i4 | (-1409556769)))) * 164)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i6 = ~elapsedCpuTime;
            if (i5 != 557189034 + ((99389489 | i6) * (-757)) + ((~(938326841 | elapsedCpuTime)) * 1514) + (((~(elapsedCpuTime | (-838937353))) | (~(i6 | 929377032)) | 8949809) * 757)) {
                throw null;
            }
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i8 = ~iMaxMemory;
        if (i7 != (-1795987538) + (((~((-2131934278) | i8)) | (~(2142682455 | iMaxMemory))) * (-831)) + ((~((-1695560769) | iMaxMemory)) * (-1662)) + (((~(iMaxMemory | 2131934277)) | (~(i8 | (-447121688))) | (~(447121687 | iMaxMemory))) * 831)) {
            throw new RuntimeException("-779893300");
        }
        super.onStart();
        int i9 = notify + 109;
        INotificationSideChannel = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationActivity newRegistrationActivity, Integer num) {
        String string;
        CustomTabsServiceConnection1 customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1;
        String str;
        CustomTabsIntentApi21Impl customTabsIntentApi21ImplTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = newRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
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
        if (iIntValue != 1) {
            int i2 = notify;
            int i3 = i2 + 97;
            INotificationSideChannel = i3 % 128;
            if (i3 % 2 == 0 ? iIntValue == 2 : iIntValue == 2) {
                string = newRegistrationActivity.getString(R.string.label_personal_data);
            } else if (iIntValue != 3) {
                int i4 = i2 + 85;
                INotificationSideChannel = i4 % 128;
                int i5 = i4 % 2;
                if (iIntValue != 4) {
                    int i6 = i2 + 99;
                    INotificationSideChannel = i6 % 128;
                    int i7 = i6 % 2;
                    string = iIntValue != 5 ? newRegistrationActivity.getString(R.string.label_asik_data_biometric) : newRegistrationActivity.getString(R.string.label_create_password);
                } else {
                    string = newRegistrationActivity.getString(R.string.label_phone_number_verification);
                }
            } else {
                string = newRegistrationActivity.getString(R.string.title_email_verification);
            }
        } else {
            string = newRegistrationActivity.getString(R.string.title_term_and_condition);
        }
        textView2.setText(string);
        int iIntValue2 = num.intValue();
        if (iIntValue2 != 1) {
            int i8 = notify + 55;
            int i9 = i8 % 128;
            INotificationSideChannel = i9;
            if (i8 % 2 == 0 ? iIntValue2 == 2 : iIntValue2 == 2) {
                RegisteredMemberRegistration registeredMemberRegistration = newRegistrationActivity.asInterface;
                if ((registeredMemberRegistration != null ? registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null) == MembershipType.PU) {
                    setSecondaryToolbarSwipeUpGesture.Companion companion = setSecondaryToolbarSwipeUpGesture.INSTANCE;
                    customTabsIntentApi21ImplTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSecondaryToolbarSwipeUpGesture.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                } else {
                    CustomTabsIntentApi21Impl.Companion companion2 = CustomTabsIntentApi21Impl.INSTANCE;
                    customTabsIntentApi21ImplTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CustomTabsIntentApi21Impl.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = (LifecycleCameraRepository) customTabsIntentApi21ImplTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                str = "registration_account_step_second";
            } else {
                int i10 = i9 + 103;
                notify = i10 % 128;
                if (i10 % 2 != 0 ? iIntValue2 == 3 : iIntValue2 == 3) {
                    setActivitySideSheetRoundedCornersPosition.Companion companion3 = setActivitySideSheetRoundedCornersPosition.INSTANCE;
                    customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = setActivitySideSheetRoundedCornersPosition.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i11 = INotificationSideChannel + 57;
                    notify = i11 % 128;
                    int i12 = i11 % 2;
                    str = "registration_account_step_third";
                } else if (iIntValue2 == 4) {
                    customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = getTargetOriginFromBundle.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    str = "registration_account_step_fourth";
                } else if (iIntValue2 != 5) {
                    BrowserActionsFallbackMenuAdapter.Companion companion4 = BrowserActionsFallbackMenuAdapter.INSTANCE;
                    customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = BrowserActionsFallbackMenuAdapter.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    str = "registration_account_step_sixth";
                } else {
                    setColorScheme.Companion companion5 = setColorScheme.INSTANCE;
                    customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = setColorScheme.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    str = "registration_account_step_fifth";
                }
            }
        } else {
            CustomTabsServiceConnection1.Companion companion6 = CustomTabsServiceConnection1.INSTANCE;
            customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1 = CustomTabsServiceConnection1.Companion.TuitionPaymentFragmentbindingInflater1();
            int i13 = INotificationSideChannel + 35;
            notify = i13 % 128;
            int i14 = i13 % 2;
            str = "registration_account_step_first";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        newRegistrationActivity.getSupportFragmentManager().beginTransaction().replace(R.id.salariedWorkerContainer, customTabsServiceConnection1TuitionPaymentFragmentbindingInflater1).commit();
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        NewRegistrationActivity newRegistrationActivity = (NewRegistrationActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 33;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            newRegistrationActivity.onTransact();
            ViewPortBuilder.b();
            int i4 = notify + 115;
            INotificationSideChannel = i4 % 128;
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

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewRegistrationActivity newRegistrationActivity, View view) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        b(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -965478553, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 965478553, new Object[]{newRegistrationActivity, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    static {
        cancelAll = 0;
        g();
        INSTANCE = new Companion(null);
        int i = cancel + 27;
        cancelAll = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 119;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_new_registration;
        }
        int i3 = 26 / 0;
        return R.layout.activity_new_registration;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 81;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle p0) throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = zzg.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = zzg.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        b(iTuitionPaymentFragmentbindingInflater2, iTuitionPaymentFragmentbindingInflater1, -292695411, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 292695412, new Object[]{this, p0}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = zzg.TuitionPaymentFragmentbindingInflater1();
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step2).substring(28, 29).codePointAt(0) - 2137211629, iTuitionPaymentFragmentbindingInflater1, 1865956715, zzg.TuitionPaymentFragmentbindingInflater1(), -1865956713, new Object[]{this}, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 53;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = notify + 43;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentbindingInflater1 = zzg.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        b(iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1728985847, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1728985850, new Object[]{this, context}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static void g() {
        asBinder = (char) 31526;
        g = (char) 27416;
        asInterface = (char) 24258;
        onTransact = (char) 39628;
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
    private static java.lang.String $$i(int r5, byte r6, int r7) {
        /*
            int r5 = r5 * 4
            int r5 = 4 - r5
            int r7 = r7 * 4
            int r7 = r7 + 108
            byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.$$c
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r3 = r0[r5]
        L26:
            int r5 = r5 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity.$$i(int, byte, int):java.lang.String");
    }
}
