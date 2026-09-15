package com.bpjstku.presentation.program.jpn.jpnPeriodic;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Bitmap;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityJpnPeriodicInformationVerifiedBinding;
import com.bpjstku.domain.jp.model.JpBenefitInformation;
import com.bpjstku.domain.jp.model.JpDataTk;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity;
import com.bpjstku.util.custom.CircleImageView;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_common.zzhe;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CaptureSessionExternalSyntheticLambda3;
import defpackage.CaptureSessionInterface;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.activityDestroyed;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getCameraOperatingMode;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdacreateCameraSelectorById0;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import defpackage.stopRepeating;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0013\u001a\u00020\u00168BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0015\u0010\r\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0015\u0010\b\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0017\u0010\t\u001a\u0004\u0018\u00010\u001a8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\n\u001a\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001dR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010 "}, d2 = {"Lcom/bpjstku/presentation/program/jpn/jpnPeriodic/JpnPeriodicInformationVerifiedActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJpnPeriodicInformationVerifiedBinding;", "<init>", "()V", "", "asBinder", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Z)V", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LCaptureSessionExternalSyntheticLambda3;", "g", "LstopRepeating;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "Z", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JpnPeriodicInformationVerifiedActivity extends BindingBaseActivity<ActivityJpnPeriodicInformationVerifiedBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancelAll;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private boolean asInterface;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {73, 55, 58, 33};
    private static final int $$f = 193;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {104, 27, -72, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 204;
    private static int INotificationSideChannel = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: setStreamUseCaseMap
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
            int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
            int iB2 = ClaimOldDaySecurityTermsConditionActivity.b.b();
            return (JpDataTk) JpnPeriodicInformationVerifiedActivity.b(ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, objArr, ClaimOldDaySecurityTermsConditionActivity.b.b(), -1857623933, 1857623933, iB2);
        }
    });

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: lambdaopen0androidxcameracamera2internalCaptureSession
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.b};
            int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
            int iB2 = ClaimOldDaySecurityTermsConditionActivity.b.b();
            return (User) JpnPeriodicInformationVerifiedActivity.b(ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, objArr, ClaimOldDaySecurityTermsConditionActivity.b.b(), 567628581, -567628580, iB2);
        }
    });

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i2)) | i5;
        int i9 = (~(i7 | (~i2))) | (~((~i5) | i7)) | (~(i5 | i4 | i2));
        int i10 = ~(i2 | i5);
        int i11 = i5 + i4 + i6 + ((-813770285) * i3) + (135932771 * i);
        int i12 = i11 * i11;
        int i13 = (526900465 * i5) + 74317824 + ((-1745228167) * i4) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i6) + (1331953664 * i3) + ((-366739456) * i) + ((-1308753920) * i12);
        int i14 = (i5 * 1149714451) + 247108311 + (i4 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i6 * 1149713731) + (i3 * 1918847289) + (i * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        if (i15 == 1) {
            JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity = (JpnPeriodicInformationVerifiedActivity) objArr[0];
            int i16 = 2 % 2;
            int i17 = onTransact + 85;
            asInterface = i17 % 128;
            int i18 = i17 % 2;
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            int i19 = asInterface + 117;
            onTransact = i19 % 128;
            int i20 = i19 % 2;
            return userAsBinder;
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i15 != 3) {
            return b(objArr);
        }
        int i21 = 2 % 2;
        int i22 = asInterface + 35;
        int i23 = i22 % 128;
        onTransact = i23;
        int i24 = i22 % 2;
        int i25 = i23 + 65;
        asInterface = i25 % 128;
        int i26 = i25 % 2;
        return Integer.valueOf(R.layout.activity_jpn_periodic_information_verified);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity.$$a
            int r1 = r7 + 1
            int r8 = 144 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity.c(int, short, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ JpDataTk TuitionPaymentFragmentbindingInflater1(JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        JpDataTk jpDataTk = (JpDataTk) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        int i4 = asInterface + 109;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return jpDataTk;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ stopRepeating a(JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        stopRepeating stoprepeating = (stopRepeating) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        int i3 = asInterface + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return stoprepeating;
    }

    public JpnPeriodicInformationVerifiedActivity() {
        final JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<CaptureSessionExternalSyntheticLambda3>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [CaptureSessionExternalSyntheticLambda3, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ CaptureSessionExternalSyntheticLambda3 invoke() {
                LifecycleOwner lifecycleOwner = jpnPeriodicInformationVerifiedActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CaptureSessionExternalSyntheticLambda3.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<stopRepeating>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, stopRepeating] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ stopRepeating invoke() {
                LifecycleOwner lifecycleOwner = jpnPeriodicInformationVerifiedActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(stopRepeating.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = jpnPeriodicInformationVerifiedActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/jpnPeriodic/JpnPeriodicInformationVerifiedActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "jpDataTk", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "isConfirm", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, JpDataTk jpDataTk, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, JpnPeriodicInformationVerifiedActivity.class, new Pair[]{TuplesKt.to("jp_info", jpDataTk), TuplesKt.to("key_is_confirm", Boolean.valueOf(z))});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJpnPeriodicInformationVerifiedBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            JpnPeriodicInformationVerifiedActivity$bindingInflater$1 jpnPeriodicInformationVerifiedActivity$bindingInflater$1 = JpnPeriodicInformationVerifiedActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            throw null;
        }
        JpnPeriodicInformationVerifiedActivity$bindingInflater$1 jpnPeriodicInformationVerifiedActivity$bindingInflater$2 = JpnPeriodicInformationVerifiedActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = onTransact + 31;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return jpnPeriodicInformationVerifiedActivity$bindingInflater$2;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws Throwable {
        int i = 2 % 2;
        JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity = this;
        Intrinsics.checkNotNullParameter(jpnPeriodicInformationVerifiedActivity, "");
        jpnPeriodicInformationVerifiedActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_jp_periodically_confirmation));
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            String str = userAsBinder.TuitionPaymentFragmentbindingInflater1;
            if (str != null) {
                int i2 = onTransact + 33;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    str.length();
                    throw null;
                }
                if (str.length() > 0) {
                    CircleImageView circleImageView = ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfile;
                    Intrinsics.checkNotNullExpressionValue(circleImageView, "");
                    Drawable drawable = getResources().getDrawable(R.drawable.ic_placeholder);
                    Intrinsics.checkNotNullExpressionValue(drawable, "");
                    Drawable drawable2 = getResources().getDrawable(R.drawable.ic_placeholder);
                    Intrinsics.checkNotNullExpressionValue(drawable2, "");
                    lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(circleImageView, this, str, drawable, drawable2);
                    String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (str2 != null) {
                        int i3 = onTransact + 45;
                        asInterface = i3 % 128;
                        if (i3 % 2 != 0) {
                            ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, str);
                            throw null;
                        }
                        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, str);
                    }
                }
            } else {
                ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfile.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_placeholder));
            }
            ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvNamesWorker.setText(String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        }
        int i4 = onTransact + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asInterface);
        int i4 = asInterface + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityJpnPeriodicInformationVerifiedBinding activityJpnPeriodicInformationVerifiedBinding = (ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        Button button = activityJpnPeriodicInformationVerifiedBinding.btnBackToHome;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdarelease1androidxcameracamera2internalCaptureSession
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        activityJpnPeriodicInformationVerifiedBinding.swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: setSessionConfig
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                JpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        activityJpnPeriodicInformationVerifiedBinding.llNotes.setOnClickListener(new View.OnClickListener() { // from class: CaptureSessionExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = getIntent().getBooleanExtra("key_is_confirm", false);
        int i4 = onTransact + 87;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity = this;
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(jpnPeriodicInformationVerifiedActivity, new Observer() { // from class: issueRepeatingCaptureRequests
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((stopRepeating) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.observe(jpnPeriodicInformationVerifiedActivity, new Observer() { // from class: lambdaissueBurstCaptureRequest3androidxcameracamera2internalCaptureSession
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(d)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 3291 - View.resolveSize(0, 0), 30 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1199271174, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 650, View.resolveSize(0, 0) + 44, -450685997, false, $$i(b3, b4, (byte) (-b4)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
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
        }
        if (i3 > 0) {
            int i6 = $10 + 123;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i8 = $11 + 121;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i2 >>> setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 651 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, -450685997, false, $$i(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), 651 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 45, -450685997, false, $$i(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            int i9 = $10 + 25;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean p0) {
        String str;
        int i = 2 % 2;
        Object obj = null;
        if (p0) {
            MediaBrowserCompat();
            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new JpnPeriodicInformationVerifiedActivity$getInformation$1(this, null), 3, null);
            return;
        }
        stopRepeating stoprepeating = (stopRepeating) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        JpDataTk jpDataTk = (JpDataTk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (jpDataTk != null) {
            int i2 = asInterface + 59;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                String str2 = jpDataTk.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                obj.hashCode();
                throw null;
            }
            str = jpDataTk.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } else {
            str = null;
        }
        stoprepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(str));
        int i3 = asInterface + 37;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        onTransact = i2 % 128;
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
                getOnBackPressedDispatcher().onBackPressed();
                int i3 = asInterface + 21;
                onTransact = i3 % 128;
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

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int bitsPerPixel = 1030 - ImageFormat.getBitsPerPixel(0);
            int i2 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr2 = new Object[1];
            c($$a[5], (byte) 52, (short) 141, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, bitsPerPixel, i2, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_alfamart).substring(0, 8).codePointAt(6) + 100, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 113, new char[]{'\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, 219 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_mandiri).substring(15, 17).codePointAt(0) - 85, new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
            int size = View.MeasureSpec.getSize(0) + 15;
            Object[] objArr5 = new Object[1];
            c($$a[5], (byte) 52, (short) 89, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, tapTimeout, size, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i3 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 16;
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                c(b, b2, (short) (b2 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i3, iLastIndexOf, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i6 = ~(Process.myPid() | (-625881799));
            int i7 = (((((-937410295) | i6) * (-196)) + 265413005) + ((i6 | 311528496) * 196)) - 1495433610;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(true, 213 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_debit_card).substring(1, 2).length() + 15, View.resolveSize(0, 0) + 5, new char[]{65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n'}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(false, 217 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 82, (ViewConfiguration.getTapTimeout() >> 16) + 6, new char[]{'\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1143080013};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getScrollBarSize() >> 8)), 1134 - TextUtils.getOffsetBefore("", 0), 18 - ((Process.getThreadPriority(0) + 20) >> 6), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1495433610, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
                    Object[] objArr12 = new Object[1];
                    c($$a[5], (byte) 52, (short) 141, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, scrollDefaultDelay, capsMode, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.blue(0)), 1117 - (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.keyCodeFromString("") + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15;
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr13 = new Object[1];
                    c(b3, b4, (short) (b4 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity2, keyRepeatTimeout, doubleTapTimeout, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_kioson).substring(19, 20).length() + 213, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 85, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 33, new char[]{'\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t'}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step7).substring(0, 3).codePointAt(2) + 209, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 100, 12 - View.MeasureSpec.getMode(0), new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int offsetBefore = 1031 - TextUtils.getOffsetBefore("", 0);
                        int iAlpha = 15 - Color.alpha(0);
                        Object[] objArr16 = new Object[1];
                        c($$a[5], (byte) 52, (short) 89, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cKeyCodeFromString, offsetBefore, iAlpha, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                        int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iBlue = 15 - Color.blue(0);
                        Object[] objArr17 = new Object[1];
                        c($$a[5], (byte) 52, (short) 141, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAxisFromString, fadingEdgeLength, iBlue, 1357589585, false, (String) objArr17[0], null);
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 == i10) {
            int i12 = asInterface + 111;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i17 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i18 = (~((-205921303) | i17)) | 4197394;
            int i19 = i14 + (-659599367) + (i18 * 992) + ((i18 | (~((~i17) | 240082775))) * (-496)) + ((i17 | 38358867) * 496);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
            int i22 = onTransact + 81;
            asInterface = i22 % 128;
            int i23 = i22 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i24 = onTransact;
                int i25 = i24 + 57;
                asInterface = i25 % 128;
                int i26 = i25 % 2;
                int i27 = i24 + 77;
                asInterface = i27 % 128;
                int i28 = i27 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i11];
            int i29 = i11 - 1;
            iArr[i29] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i29) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[3])[0];
            int i32 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i33 = i30 + 510657629 + (((~((~layoutDirection) | (-396044535))) | (-151764365)) * (-235)) + (((~((-396044535) | layoutDirection)) | (-151764365)) * (-470)) + (((~(layoutDirection | (-17508485))) | (-530300415)) * 235);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr19[2])[0] = i35 ^ (i35 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
            int i36 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
            byte b5 = $$a[5];
            byte b6 = (byte) (b5 | 36);
            Object[] objArr20 = new Object[1];
            c(b5, b6, b6, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, i36, iIndexOf, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i37 = onTransact + 31;
            asInterface = i37 % 128;
            int i38 = i37 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
                Object[] objArr21 = new Object[1];
                c($$a[5], (byte) 52, (short) 89, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(trimmedLength, iIndexOf2, maximumFlingVelocity, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i39 = ~iIdentityHashCode;
            int i40 = (-1917404935) + ((170525113 | i39) * (-192)) + (((~((-29427265) | i39)) | 12650048) * (-384)) + (((~(iIdentityHashCode | 199952377)) | (~(i39 | (-16777217))) | (~((-12650049) | iIdentityHashCode))) * DerHeader.TAG_CLASS_PRIVATE) + 856180306;
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i42 ^ (i42 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indosat_dompetku).substring(0, 16).length() + 197, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.chademo_ev_connector_type).substring(0, 6).length() + 10, 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n'}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 206, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step2).substring(32, 33).length() + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step5).substring(8, 9).length() + 5, new char[]{'\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1143080013};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 42049), Color.green(0) + 1726, ImageFormat.getBitsPerPixel(0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 856180306, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                Object[] objArr26 = new Object[1];
                c($$a[5], (byte) 52, (short) 89, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionType, longPressTimeout, iIndexOf3, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_address).substring(0, 6).codePointAt(3) + 105, Color.rgb(0, 0, 0) + 16777238, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, new char[]{'\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t'}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step1).substring(24, 34).length() + 208, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step3).substring(1, 3).length() + 13, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_permata).substring(1, 3).codePointAt(1) - 109, new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                    int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                    byte[] bArr = $$a;
                    Object[] objArr29 = new Object[1];
                    c(bArr[5], (byte) 52, bArr[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, iLastIndexOf2, iCombineMeasuredStates, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                    int maximumFlingVelocity2 = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i43 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte b7 = $$a[5];
                    byte b8 = (byte) (b7 | 36);
                    Object[] objArr30 = new Object[1];
                    c(b7, b8, b8, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, maximumFlingVelocity2, i43, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i44 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i45 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i45 == i44) {
            int i46 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i47 = ~System.identityHashCode(this);
            int i48 = i46 + (((153751189 + (((~((-8393225) | i47)) | 220995650) * (-828))) + ((i47 | (-8393225)) * (-828))) - 1640345120);
            int i49 = (i48 << 13) ^ i48;
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr31[3])[0] = i50 ^ (i50 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr5 != null) {
            for (String str2 : strArr5) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i45 / (((i45 - 1) * i45) % 2), 0).show();
        int i51 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i52 = ~((-651266643) | iIdentityHashCode2);
        int i53 = (-1815899971) + ((33622032 | i52) * (-280)) + ((i52 | (~(438664216 | iIdentityHashCode2))) * 140);
        int i54 = ~((-617644611) | iIdentityHashCode2);
        int i55 = ~iIdentityHashCode2;
        int i56 = i51 + i53 + (((~(i55 | 1056308826)) | i54 | (~((-33622033) | i55))) * 140);
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr32[3])[0] = i58 ^ (i58 << 5);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IllegalAccessException {
        JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity = (JpnPeriodicInformationVerifiedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        if (i4 != (((-1134047304) + (((~elapsedCpuTime) | 277317682) * 1324)) + (((~(elapsedCpuTime | (-1644192590))) | (~(814205046 | elapsedCpuTime))) * (-1324))) - 1792331048) {
            throw null;
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i6 = ~iNextInt;
        int i7 = (~((-1957821376) | i6)) | 604064157;
        int i8 = ~(iNextInt | 1974991807);
        if (i5 != ((i7 | i8) * (-252)) + 184400872 + ((i8 | (~(i6 | (-1353757219)))) * 252)) {
            int i9 = 450858778 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i10 = onTransact + 39;
        asInterface = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e4, code lost:
    
        if (r1 != ((r6 + (((~(r2 | (-80478211))) | (~(348996946 | r5))) * 859)) + (((~(2064908277 | r5)) | (-2145386488)) * 859))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e6, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity.onTransact + 123;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f2, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f4, code lost:
    
        r0 = 54 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ff, code lost:
    
        throw new java.lang.RuntimeException("1372268658");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0107, code lost:
    
        throw new java.lang.RuntimeException("-974213739");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0066, code lost:
    
        if (r1 == (((1007651706 + (((~(r3 | (-1377148301))) | 547160757) * (-1042))) + (((-1377148301) | r2) * 521)) + ((((~(r2 | (-547160758))) | 545784369) | (~(r3 | (-1375771913)))) * 521))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b1, code lost:
    
        if (r1 == ((r7 + ((2046820329 | r2) * (-216))) + (((~(r2 | 947903113)) | (-1777890657)) * 216))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b3, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
        r6 = 1654439412 + ((r2 | 348996946) * (-859));
        r5 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.place_photo_viewer_previous_image_button_content_description).substring(0, 19).length() - 243785392);
        if (i4 != 98440136 + (((~(i5 | 934286695)) | 1208524824) * (-160)) + (((~(i5 | 1764274238)) | 934286695) * 160)) {
            int i6 = 488609608 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i8 = ~iNextInt;
        if (i7 != (-1622509944) + (((~(2108257854 | i8)) | 392346523) * (-90)) + (((~(2108257854 | iNextInt)) | 1753826340) * (-45)) + (((~(iNextInt | (-392346524))) | 2108257854 | (~(i8 | 392346523))) * 45)) {
            int i9 = 1748248480 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i10 = asInterface + 3;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            CaptureSessionInterface.Companion companion = CaptureSessionInterface.INSTANCE;
            CaptureSessionInterface captureSessionInterfaceTuitionPaymentFragmentbindingInflater1 = CaptureSessionInterface.Companion.TuitionPaymentFragmentbindingInflater1();
            captureSessionInterfaceTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(jpnPeriodicInformationVerifiedActivity.getResources().getDisplayMetrics().heightPixels));
            captureSessionInterfaceTuitionPaymentFragmentbindingInflater1.setCancelable(false);
            FragmentManager supportFragmentManager = jpnPeriodicInformationVerifiedActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(captureSessionInterfaceTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = asInterface + 67;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                captureSessionInterfaceTuitionPaymentFragmentbindingInflater1.show(supportFragmentManager, captureSessionInterfaceTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i4 = onTransact + 53;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 4;
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity = (JpnPeriodicInformationVerifiedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        JpDataTk jpDataTk = (JpDataTk) jpnPeriodicInformationVerifiedActivity.getIntent().getParcelableExtra("jp_info");
        int i4 = onTransact + 43;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return jpDataTk;
    }

    public static /* synthetic */ Unit b(JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            jpnPeriodicInformationVerifiedActivity.onBackPressed();
            return Unit.INSTANCE;
        }
        jpnPeriodicInformationVerifiedActivity.onBackPressed();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.g();
        try {
            if (i3 != 0) {
                jpnPeriodicInformationVerifiedActivity.asBinder = false;
                jpnPeriodicInformationVerifiedActivity.asInterface = false;
                jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
            } else {
                jpnPeriodicInformationVerifiedActivity.asBinder = true;
                jpnPeriodicInformationVerifiedActivity.asInterface = false;
                jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
            }
            ViewPortBuilder.asBinder();
        } catch (Throwable th) {
            ViewPortBuilder.asBinder();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jpnPeriodicInformationVerifiedActivity, null, null, 1);
            unit = Unit.INSTANCE;
        } else {
            MainActivity.Companion companion2 = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jpnPeriodicInformationVerifiedActivity, null, null, 6);
            unit = Unit.INSTANCE;
        }
        int i4 = asInterface + 63;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (!(!jpnPeriodicInformationVerifiedActivity.asInterface) || jpnPeriodicInformationVerifiedActivity.asBinder) {
                return;
            }
            jpnPeriodicInformationVerifiedActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                jpnPeriodicInformationVerifiedActivity.IconCompatParcelizer();
                ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).swipeRefreshLayout.setRefreshing(false);
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpnPeriodicInformationVerifiedActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: lambdaissuePendingCaptureRequest2androidxcameracamera2internalCaptureSession
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return JpnPeriodicInformationVerifiedActivity.b(this.b);
                    }
                });
                return;
            }
            return;
        }
        jpnPeriodicInformationVerifiedActivity.IconCompatParcelizer();
        ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).swipeRefreshLayout.setRefreshing(false);
        JpBenefitInformation jpBenefitInformation = ((activityDestroyed) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).b;
        if (!Intrinsics.areEqual(jpBenefitInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "Y")) {
            ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupContent.setVisibility(8);
            ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupDataProcess.setVisibility(0);
            return;
        }
        int i2 = asInterface + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupContent.setVisibility(0);
        ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupDataProcess.setVisibility(8);
        ActivityJpnPeriodicInformationVerifiedBinding activityJpnPeriodicInformationVerifiedBinding = (ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        if (jpBenefitInformation.a.length() > 0) {
            activityJpnPeriodicInformationVerifiedBinding.tvCurrentMonth2.setText(jpBenefitInformation.a);
        }
        if (jpBenefitInformation.notify.length() > 0) {
            int i4 = onTransact + 85;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                activityJpnPeriodicInformationVerifiedBinding.tvDateNextConfirm.setText(jpBenefitInformation.notify);
                int i5 = 24 / 0;
            } else {
                activityJpnPeriodicInformationVerifiedBinding.tvDateNextConfirm.setText(jpBenefitInformation.notify);
            }
        }
        if (Intrinsics.areEqual(jpBenefitInformation.asInterface, "0") || jpBenefitInformation.asInterface.length() == 0) {
            activityJpnPeriodicInformationVerifiedBinding.tvRapel2.setVisibility(8);
        } else {
            activityJpnPeriodicInformationVerifiedBinding.tvRapel2.setVisibility(0);
            AppCompatTextView appCompatTextView = activityJpnPeriodicInformationVerifiedBinding.tvRapel2;
            String str = jpBenefitInformation.asInterface;
            StringBuilder sb = new StringBuilder("(");
            sb.append(str);
            sb.append(" Bulan)");
            appCompatTextView.setText(sb.toString());
        }
        String str2 = jpBenefitInformation.d;
        if (Intrinsics.areEqual(str2, ExifInterface.GPS_DIRECTION_TRUE)) {
            int i6 = asInterface + 15;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                activityJpnPeriodicInformationVerifiedBinding.tvProcessPayment.setVisibility(1);
                activityJpnPeriodicInformationVerifiedBinding.tvSuccessPayment.setVisibility(38);
            } else {
                activityJpnPeriodicInformationVerifiedBinding.tvProcessPayment.setVisibility(0);
                activityJpnPeriodicInformationVerifiedBinding.tvSuccessPayment.setVisibility(8);
            }
        } else if (Intrinsics.areEqual(str2, "Y")) {
            int i7 = asInterface + 51;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                activityJpnPeriodicInformationVerifiedBinding.tvProcessPayment.setVisibility(34);
                activityJpnPeriodicInformationVerifiedBinding.tvSuccessPayment.setVisibility(1);
            } else {
                activityJpnPeriodicInformationVerifiedBinding.tvProcessPayment.setVisibility(8);
                activityJpnPeriodicInformationVerifiedBinding.tvSuccessPayment.setVisibility(0);
            }
        } else {
            activityJpnPeriodicInformationVerifiedBinding.tvProcessPayment.setVisibility(8);
            activityJpnPeriodicInformationVerifiedBinding.tvSuccessPayment.setVisibility(8);
        }
        if (jpBenefitInformation.TuitionPaymentFragmentbindingInflater1 == 0.0d) {
            activityJpnPeriodicInformationVerifiedBinding.tvTotalRapel.setText("Rp 0,00");
        } else {
            activityJpnPeriodicInformationVerifiedBinding.tvTotalRapel.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpBenefitInformation.TuitionPaymentFragmentbindingInflater1));
        }
        if (jpBenefitInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 0.0d) {
            activityJpnPeriodicInformationVerifiedBinding.tvTotalCompensation.setText("Rp 0,00");
        } else {
            activityJpnPeriodicInformationVerifiedBinding.tvTotalCompensation.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpBenefitInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        }
        if (jpBenefitInformation.g == 0.0d) {
            activityJpnPeriodicInformationVerifiedBinding.tvTotalJpnBenefit.setText("Rp 0,00");
        } else {
            activityJpnPeriodicInformationVerifiedBinding.tvTotalJpnBenefit.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpBenefitInformation.g));
        }
        if (jpBenefitInformation.asBinder == 0.0d) {
            activityJpnPeriodicInformationVerifiedBinding.tvTotalBenefit.setText("Rp 0,00");
        } else {
            activityJpnPeriodicInformationVerifiedBinding.tvTotalBenefit.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpBenefitInformation.asBinder));
        }
        if (jpBenefitInformation.INotificationSideChannel == 0.0d) {
            activityJpnPeriodicInformationVerifiedBinding.tvConfirmationMonth.setVisibility(8);
            return;
        }
        activityJpnPeriodicInformationVerifiedBinding.tvConfirmationMonth.setVisibility(0);
        AppCompatTextView appCompatTextView2 = activityJpnPeriodicInformationVerifiedBinding.tvConfirmationMonth;
        int i8 = (int) jpBenefitInformation.INotificationSideChannel;
        StringBuilder sb2 = new StringBuilder("* Keterlambatan konfirmasi ");
        sb2.append(i8);
        sb2.append(" bulan");
        appCompatTextView2.setText(sb2.toString());
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            CircleImageView circleImageView = ((ActivityJpnPeriodicInformationVerifiedBinding) ((ViewBinding) jpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfile;
            Intrinsics.checkNotNullExpressionValue(circleImageView, "");
            JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity2 = jpnPeriodicInformationVerifiedActivity;
            Bitmap bitmap = (Bitmap) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Drawable drawable = jpnPeriodicInformationVerifiedActivity.getResources().getDrawable(R.drawable.ic_placeholder);
            Intrinsics.checkNotNullExpressionValue(drawable, "");
            Drawable drawable2 = jpnPeriodicInformationVerifiedActivity.getResources().getDrawable(R.drawable.ic_placeholder);
            Intrinsics.checkNotNullExpressionValue(drawable2, "");
            lambdacreateCameraSelectorById0.b(circleImageView, jpnPeriodicInformationVerifiedActivity2, bitmap, drawable, drawable2);
        }
        int i3 = asInterface + 105;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ JpDataTk TuitionPaymentFragmentspecialinlinedviewModeldefault1(JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity) {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        int iB2 = ClaimOldDaySecurityTermsConditionActivity.b.b();
        int iB3 = ClaimOldDaySecurityTermsConditionActivity.b.b();
        return (JpDataTk) b(ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, new Object[]{jpnPeriodicInformationVerifiedActivity}, iB3, -1857623933, 1857623933, iB2);
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault2(JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity) {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        int iB2 = ClaimOldDaySecurityTermsConditionActivity.b.b();
        int iB3 = ClaimOldDaySecurityTermsConditionActivity.b.b();
        return (User) b(ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, new Object[]{jpnPeriodicInformationVerifiedActivity}, iB3, 567628581, -567628580, iB2);
    }

    static {
        cancelAll = 0;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 27;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        int i = 803571920 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto7).substring(16, 17).codePointAt(0) + 1510581032, iB, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 925641164, -925641161, i)).intValue();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        int i = (-36509966) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iCodePointAt = (-1096700180) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6);
        b(zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iB, new Object[]{this}, iCodePointAt, 327311503, -327311501, i);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
    }

    static void g() {
        d = -83722479;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, int r6, int r7) {
        /*
            int r5 = r5 * 3
            int r0 = 1 - r5
            int r7 = 120 - r7
            byte[] r1 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity.$$c
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity.$$i(int, int, int):java.lang.String");
    }
}
