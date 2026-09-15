package com.bpjstku.presentation.splash;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.databinding.ActivitySplashscreenBinding;
import com.bpjstku.di.ApiModuleKt;
import com.bpjstku.presentation.about.UpdateActivity;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$2;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity;
import com.bpjstku.presentation.onboarding.OnBoardingActivity;
import com.bpjstku.presentation.splash.SplashscreenActivity;
import com.bpjstku.util.constant.ProgramType;
import com.bpjstku.util.enums.BpjsServiceEnum;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import defpackage.AndroidImageReaderProxyExternalSyntheticLambda1;
import defpackage.ApiCompatApi29Impl;
import defpackage.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternalBuilder;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCamera2Interop;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessgetMCameraXp;
import defpackage.getCollectionUri;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setContentResolver;
import defpackage.setQuickZoomEnabled;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;
import okhttp3.tls.internal.der.DerHeader;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000eR \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019R\u001a\u0010\u0016\u001a\u00020\u001b8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u001d\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010!R\u0015\u0010\b\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010!R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&"}, d2 = {"Lcom/bpjstku/presentation/splash/SplashscreenActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySplashscreenBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/content/Intent;", "p0", "onNewIntent", "(Landroid/content/Intent;)V", "cancelAll", "onTransact", "INotificationSideChannelStub", "INotificationSideChannel", "INotificationSideChannelDefault", "RemoteActionCompatParcelizer", "getInterfaceDescriptor", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "LApiCompatApi29Impl;", "d", "Lkotlin/Lazy;", "Lcom/bpjstku/data/lib/PreferenceManager;", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "Landroidx/activity/result/ActivityResultLauncher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SplashscreenActivity extends BindingBaseActivity<ActivitySplashscreenBinding> {
    private static int INotificationSideChannel;
    private static char[] asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {123, -2, -101, -104};
    private static final int $$f = 166;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {111, 40, 23, -13, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -27, 1};
    private static final int $$k = 234;
    private static final byte[] $$a = {111, 40, 23, -13, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 183;
    private static int notify = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f631a = 0;
    private static int g = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_splashscreen;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final ActivityResultLauncher<String[]> b = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: ApiCompatApi24Impl
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) throws Throwable {
            SplashscreenActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Map) obj);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> d = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: ApiCompatApi23Impl
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) throws Throwable {
            SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> a = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: ApiCompat
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            SplashscreenActivity.TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1684707913, new Object[]{(ActivityResult) obj}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1684707916);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i4);
        int i9 = ~i6;
        int i10 = ~i4;
        int i11 = i8 | (~(i9 | i10 | i2));
        int i12 = (~(i4 | i9 | i2)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i6 + i2 + i + (563899752 * i5) + (667302295 * i3);
        int i15 = i14 * i14;
        int i16 = ((i6 * 1426164010) - 416808960) + (1426164010 * i2) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i) + ((-1270874112) * i5) + (1914175488 * i3) + ((-1995833344) * i15);
        int i17 = (i6 * (-901935710)) + 144807674 + (i2 * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + (i * (-901935539)) + (i5 * 42244168) + (i3 * (-913566613)) + (i15 * (-1006501888));
        switch (i16 + (i17 * i17 * (-1006239744))) {
            case 1:
                SplashscreenActivity splashscreenActivity = (SplashscreenActivity) objArr[0];
                DialogInterface dialogInterface = (DialogInterface) objArr[1];
                int i18 = 2 % 2;
                int i19 = g + 13;
                f631a = i19 % 128;
                int i20 = i19 % 2;
                dialogInterface.dismiss();
                splashscreenActivity.finish();
                int i21 = f631a + 77;
                g = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 2:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 5:
                return b(objArr);
            case 6:
                return g(objArr);
            case 7:
                return a(objArr);
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = 53 - r9
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.splash.SplashscreenActivity.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r5 = r2
            r8 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.splash.SplashscreenActivity.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 47
            int r6 = 51 - r6
            byte[] r0 = com.bpjstku.presentation.splash.SplashscreenActivity.$$j
            int r5 = 99 - r5
            int r7 = r7 * 47
            int r1 = 48 - r7
            byte[] r1 = new byte[r1]
            int r7 = 47 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r5 = r5 + r4
            int r6 = r6 + 1
            int r5 = r5 + 3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.splash.SplashscreenActivity.f(byte, short, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object g(Object[] objArr) throws Throwable {
        SplashscreenActivity splashscreenActivity = (SplashscreenActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 83;
        f631a = i2 % 128;
        int i3 = i2 % 2;
        splashscreenActivity.cancelAll();
        int i4 = f631a + 27;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return null;
    }

    public SplashscreenActivity() {
        final SplashscreenActivity splashscreenActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ApiCompatApi29Impl>() { // from class: com.bpjstku.presentation.splash.SplashscreenActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ApiCompatApi29Impl, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ApiCompatApi29Impl invoke() {
                LifecycleOwner lifecycleOwner = splashscreenActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ApiCompatApi29Impl.class);
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
        final SplashscreenActivity splashscreenActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.splash.SplashscreenActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = splashscreenActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySplashscreenBinding> TuitionPaymentFragmentbindingInflater1() {
        SplashscreenActivity$bindingInflater$1 splashscreenActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = f631a + 65;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            splashscreenActivity$bindingInflater$1 = SplashscreenActivity$bindingInflater$1.b;
            int i3 = 29 / 0;
        } else {
            splashscreenActivity$bindingInflater$1 = SplashscreenActivity$bindingInflater$1.b;
        }
        int i4 = g + 109;
        f631a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return splashscreenActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 75;
        int i3 = i2 % 128;
        f631a = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentbindingInflater1;
        int i6 = i3 + 61;
        g = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        SplashscreenActivity splashscreenActivity = this;
        Intrinsics.checkNotNullParameter(splashscreenActivity, "");
        splashscreenActivity.getWindow().addFlags(8192);
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new SplashscreenActivity$initUI$1(this, null), 3, null);
        int i2 = f631a + 79;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent p0) {
        int i = 2 % 2;
        int i2 = f631a + 37;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            super.onNewIntent(p0);
            ((ApiCompatApi29Impl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        super.onNewIntent(p0);
        if (((ApiCompatApi29Impl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
            return;
        }
        TuitionPaymentFragmentbindingInflater1(getIntent());
        int i3 = f631a + 75;
        g = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void cancelAll() throws Throwable {
        int i = 2 % 2;
        int i2 = g + 65;
        f631a = i2 % 128;
        int i3 = i2 % 2;
        SplashscreenActivity splashscreenActivity = this;
        int iCheckSelfPermission = ContextCompat.checkSelfPermission(splashscreenActivity, "android.permission.ACCESS_FINE_LOCATION");
        int iCheckSelfPermission2 = ContextCompat.checkSelfPermission(splashscreenActivity, "android.permission.ACCESS_COARSE_LOCATION");
        if (iCheckSelfPermission == 0 || iCheckSelfPermission2 == 0) {
            onTransact();
            return;
        }
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_FINE_LOCATION")) {
            int iTuitionPaymentFragmentbindingInflater1 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
            TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1539750932, new Object[]{this}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentbindingInflater1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1539750934);
            return;
        }
        this.b.launch(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
        int i4 = g + 121;
        f631a = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onTransact() throws Throwable {
        int i = 2 % 2;
        int i2 = g + 111;
        f631a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(this, "");
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        if (!ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            int i4 = g + 27;
            f631a = i4 % 128;
            int i5 = i4 % 2;
            RemoteActionCompatParcelizer();
            int i6 = g + 119;
            f631a = i6 % 128;
            int i7 = i6 % 2;
        }
        INotificationSideChannelStub();
        TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1186304534, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gopay_transaction).substring(0, 6).length() - 882456223, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1570561872, 1186304538);
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
        char[] cArr = asBinder;
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
                        byte b = (byte) i3;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetBefore("", i3), Gravity.getAbsoluteGravity(i3, i3) + 1270, (Process.myPid() >> 22) + 18, 407021364, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    int i10 = $11 + 111;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    i3 = 0;
                    i5 = 1;
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
            int i12 = $11 + 51;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i14 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 3225 - ExpandableListView.getPackedPositionType(0L), 13 - TextUtils.getCapsMode("", 0, 0), 2133916302, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.alpha(0) + 29944), 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, 387247676, false, $$i(b5, b5, (byte) (-$$c[1])), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41240 - MotionEvent.axisFromString("")), 1705 - KeyEvent.keyCodeFromString(""), 21 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1434471773, false, $$i(b6, b7, (byte) (b7 | 6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i16 = $11 + 37;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                char[] cArr5 = new char[i6];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 1, i6);
                System.arraycopy(cArr5, 1, cArr3, i6 >> i8, i8);
                System.arraycopy(cArr5, i8, cArr3, 1, i6 - i8);
            } else {
                i = 0;
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr3, 0, cArr6, 0, i6);
                int i17 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr3, i17, i8);
                System.arraycopy(cArr6, i8, cArr3, 0, i17);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i6];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i6) {
                cArr7[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr3 = cArr7;
        }
        if (i7 > 0) {
            int i18 = $10 + 53;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                int i21 = $10 + 79;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private final void INotificationSideChannelStub() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (43042 - View.resolveSizeAndState(0, 0, 0));
            int doubleTapTimeout = 3111 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[132], bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, doubleTapTimeout, iIndexOf, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 0, 19}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 17, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) ((Process.myPid() >> 22) + 43042);
            int i2 = 3111 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int tapTimeout = 22 - (ViewConfiguration.getTapTimeout() >> 16);
            short s = (short) ($$b & 123);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(s, bArr2[5], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, i2, tapTimeout, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = g + 89;
            f631a = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 43042);
                int keyRepeatTimeout = 3111 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i5 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                byte b = $$a[5];
                Object[] objArr6 = new Object[1];
                c((short) 103, b, (byte) (b | 14), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, keyRepeatTimeout, i5, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int i8 = ~System.identityHashCode(this);
            int i9 = ~(816222024 | i8);
            int i10 = (((1637250258 + ((i9 | 888809434) * 764)) + (((~(i8 | 888809434)) | 296960) * (-1528))) + ((73181330 | i9) * 764)) - 733345446;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            objArr = new Object[]{new int[1], new int[]{i7}, new int[]{i6}, strArr};
            int i13 = g + 41;
            f631a = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{37, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -733345446};
                byte[] bArr3 = $$j;
                byte b2 = bArr3[50];
                byte b3 = (byte) (b2 - 1);
                byte b4 = b2;
                Object[] objArr11 = new Object[1];
                f(b3, b4, (byte) (b4 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr3[50];
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                f(b6, (byte) (b6 - 1), b5, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 43042);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 3111;
                    int i15 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b7 = $$a[5];
                    Object[] objArr14 = new Object[1];
                    c((short) 103, b7, (byte) (b7 | 14), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, packedPositionGroup, i15, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new int[]{0, 22, 0, 19}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new int[]{22, 15, 17, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 43042);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 3111;
                        int bitsPerPixel = 21 - ImageFormat.getBitsPerPixel(0);
                        short s2 = (short) ($$b & 123);
                        byte[] bArr4 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(s2, bArr4[5], bArr4[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, trimmedLength, bitsPerPixel, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (43043 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3111;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c(bArr5[132], bArr5[5], bArr5[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, fadingEdgeLength, iLastIndexOf, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            for (String str : strArr2) {
                int i16 = f631a + 75;
                g = i16 % 128;
                int i17 = i16 % 2;
                arrayList.add(str);
            }
            throw null;
        }
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr = {i19};
        int i21 = ~((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bri).substring(1, 3).length() - 294332332) | 840095002);
        int i22 = i18 + ((((-1027528482) + (((-864936457) | i21) * (-220))) + ((i21 | (-866121499)) * 220)) - 1301698116);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr[0])[0] = i24 ^ (i24 << 5);
        Object[] objArr19 = {new int[1], new int[]{i20}, iArr, strArr3};
        ExperimentalCamera2Interop.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, new Function1() { // from class: CameraExecutor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SplashscreenActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (UserLocationComplete) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0303  */
    /* JADX WARN: Code duplicated, block: B:102:0x030b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0316  */
    /* JADX WARN: Code duplicated, block: B:108:0x031f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0334  */
    /* JADX WARN: Code duplicated, block: B:114:0x0341 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0344 A[LOOP:3: B:99:0x0301->B:116:0x0344, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0357  */
    /* JADX WARN: Code duplicated, block: B:120:0x035f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0387  */
    /* JADX WARN: Code duplicated, block: B:128:0x039a  */
    /* JADX WARN: Code duplicated, block: B:131:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:32:0x010a  */
    /* JADX WARN: Code duplicated, block: B:35:0x011a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x0184  */
    /* JADX WARN: Code duplicated, block: B:48:0x0190  */
    /* JADX WARN: Code duplicated, block: B:51:0x0198 A[PHI: r0
  0x0198: PHI (r0v72 java.lang.String[]) = (r0v58 java.lang.String[]), (r0v84 java.lang.String[]) binds: [B:49:0x0194, B:46:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x019d  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0217 A[LOOP:2: B:61:0x01e9->B:65:0x0217, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0223  */
    /* JADX WARN: Code duplicated, block: B:77:0x0256  */
    /* JADX WARN: Code duplicated, block: B:79:0x025c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0268  */
    /* JADX WARN: Code duplicated, block: B:83:0x026e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0277  */
    /* JADX WARN: Code duplicated, block: B:88:0x027f  */
    /* JADX WARN: Code duplicated, block: B:90:0x028b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0293  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d0  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00fc, please report this as an issue */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        int i;
        FirebaseRemoteConfig firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        List listSplit$default;
        List listSplit$default2;
        int iMax;
        int i2;
        String str;
        int iIntValue;
        String str2;
        int iIntValue2;
        Integer intOrNull;
        Integer intOrNull2;
        HashMap map;
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3;
        boolean z;
        String string;
        int i4;
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3;
        int i5;
        int length;
        int i6;
        boolean z2;
        String str4;
        String[] strArrSplit;
        String str5;
        String[] strArr;
        int length2;
        String str6;
        boolean z3;
        int i7;
        String[] strArr2;
        int i8;
        String str7;
        String[] strArr3;
        int i9;
        String strReplace;
        String[] strArrSplit2;
        int length3;
        int i10;
        int i11;
        final SplashscreenActivity splashscreenActivity = (SplashscreenActivity) objArr[0];
        char c = 2;
        int i12 = 2 % 2;
        int i13 = f631a + 81;
        g = i13 % 128;
        Object obj = null;
        if (i13 % 2 == 0) {
            AndroidImageReaderProxyExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(splashscreenActivity);
            obj.hashCode();
            throw null;
        }
        SplashscreenActivity splashscreenActivity2 = splashscreenActivity;
        if (AndroidImageReaderProxyExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(splashscreenActivity2)) {
            new AlertDialog.Builder(splashscreenActivity).setTitle(splashscreenActivity.getString(R.string.developer_mode_detected_title)).setMessage(splashscreenActivity.getString(R.string.developer_mode_detected_message)).setPositiveButton(splashscreenActivity.getString(R.string.action_settings), new DialogInterface.OnClickListener() { // from class: isCapabilitySupported
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    SplashscreenActivity.g(this.TuitionPaymentFragmentbindingInflater1, dialogInterface);
                }
            }).setNegativeButton(splashscreenActivity.getString(R.string.action_exit), new DialogInterface.OnClickListener() { // from class: ZslControlNoOpImpl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, dialogInterface);
                }
            }).setCancelable(false).show();
            return null;
        }
        Intrinsics.checkNotNullParameter(splashscreenActivity2, "");
        if (!(!AndroidImageReaderProxyExternalSyntheticLambda1.b(splashscreenActivity2)) || AndroidImageReaderProxyExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity2) || AndroidImageReaderProxyExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity2)) {
            new AlertDialog.Builder(splashscreenActivity).setTitle(splashscreenActivity.getString(R.string.fake_gps_detected_title)).setMessage(splashscreenActivity.getString(R.string.fake_gps_detected_message)).setPositiveButton(splashscreenActivity.getString(R.string.action_settings), new DialogInterface.OnClickListener() { // from class: isJpegValidOutputForInputFormat
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, dialogInterface);
                }
            }).setNegativeButton(splashscreenActivity.getString(R.string.action_exit), new DialogInterface.OnClickListener() { // from class: lambdaaddZslConfig1androidxcameracamera2internalZslControlImpl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, dialogInterface};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    SplashscreenActivity.TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1963602137, objArr2, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1963602144);
                }
            }).setCancelable(false).show();
            return null;
        }
        SplashscreenActivity splashscreenActivity3 = splashscreenActivity;
        Intrinsics.checkNotNullParameter(splashscreenActivity3, "");
        getCollectionUri getcollectionuri = new getCollectionUri(splashscreenActivity3);
        if (getcollectionuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList(Arrays.asList(AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3)))) {
            i = f631a + 63;
            g = i % 128;
            if (i % 2 == 0) {
                Object obj2 = null;
                CommonUtils.isRooted();
                obj2.hashCode();
                throw null;
            }
            if (!CommonUtils.isRooted()) {
                int i14 = f631a + 125;
                g = i14 % 128;
                int i15 = i14 % 2;
                Intrinsics.checkNotNullParameter(splashscreenActivity3, "");
                if (!accessgetMCameraXp.TuitionPaymentFragmentbindingInflater1(splashscreenActivity3)) {
                    if (StringsKt.equals(Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), ApiModuleKt.getAppSignature(), true)) {
                        getMaxImages getmaximages = getMaxImages.INSTANCE;
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        listSplit$default = StringsKt.split$default((CharSequence) "4.17.8", new String[]{"."}, false, 0, 6, (Object) null);
                        listSplit$default2 = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault1, new String[]{"."}, false, 0, 6, (Object) null);
                        iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
                        i2 = 0;
                        while (true) {
                            if (i2 < iMax) {
                                str = (String) CollectionsKt.getOrNull(listSplit$default, i2);
                                if (str != null) {
                                    iIntValue = 0;
                                } else {
                                    iIntValue = 0;
                                }
                                str2 = (String) CollectionsKt.getOrNull(listSplit$default2, i2);
                                if (str2 != null) {
                                    iIntValue2 = 0;
                                } else {
                                    iIntValue2 = 0;
                                }
                                if (iIntValue < iIntValue2) {
                                    UpdateActivity.Companion companion = UpdateActivity.INSTANCE;
                                    UpdateActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity3);
                                    splashscreenActivity.d_();
                                } else if (iIntValue <= iIntValue2) {
                                    i2++;
                                }
                            }
                            if (((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                                MainActivity.Companion companion2 = MainActivity.INSTANCE;
                                MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3, null, null, 6);
                            } else {
                                OnBoardingActivity.Companion companion3 = OnBoardingActivity.INSTANCE;
                                OnBoardingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3);
                            }
                            splashscreenActivity.d_();
                        }
                    } else {
                        String string2 = splashscreenActivity.getString(R.string.error_message_app_invalid);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity, string2, new Function0() { // from class: r8lambdaTUxZVHRXbKIIvwcobeYpqdAnw2s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                            }
                        });
                    }
                }
            }
            getMaxImages getmaximages2 = getMaxImages.INSTANCE;
            firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                return null;
            }
            splashscreenActivity.TuitionPaymentFragmentbindingInflater1(splashscreenActivity.getIntent());
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1));
        if (getcollectionuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList)) {
            i = f631a + 63;
            g = i % 128;
            if (i % 2 == 0) {
                Object obj3 = null;
                CommonUtils.isRooted();
                obj3.hashCode();
                throw null;
            }
            if (!CommonUtils.isRooted()) {
                int i16 = f631a + 125;
                g = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(splashscreenActivity3, "");
                if (!accessgetMCameraXp.TuitionPaymentFragmentbindingInflater1(splashscreenActivity3)) {
                    if (StringsKt.equals(Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), ApiModuleKt.getAppSignature(), true)) {
                        String string3 = splashscreenActivity.getString(R.string.error_message_app_invalid);
                        Intrinsics.checkNotNullExpressionValue(string3, "");
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity, string3, new Function0() { // from class: r8lambdaTUxZVHRXbKIIvwcobeYpqdAnw2s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                            }
                        });
                    } else {
                        getMaxImages getmaximages3 = getMaxImages.INSTANCE;
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        listSplit$default = StringsKt.split$default((CharSequence) "4.17.8", new String[]{"."}, false, 0, 6, (Object) null);
                        listSplit$default2 = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault2, new String[]{"."}, false, 0, 6, (Object) null);
                        iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
                        i2 = 0;
                        while (true) {
                            if (i2 < iMax) {
                                str = (String) CollectionsKt.getOrNull(listSplit$default, i2);
                                if (str != null) {
                                    iIntValue = 0;
                                } else {
                                    iIntValue = 0;
                                }
                                str2 = (String) CollectionsKt.getOrNull(listSplit$default2, i2);
                                if (str2 != null) {
                                    iIntValue2 = 0;
                                } else {
                                    iIntValue2 = 0;
                                }
                                if (iIntValue < iIntValue2) {
                                    UpdateActivity.Companion companion4 = UpdateActivity.INSTANCE;
                                    UpdateActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity3);
                                    splashscreenActivity.d_();
                                } else if (iIntValue <= iIntValue2) {
                                    i2++;
                                }
                            }
                            if (((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                                MainActivity.Companion companion5 = MainActivity.INSTANCE;
                                MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3, null, null, 6);
                            } else {
                                OnBoardingActivity.Companion companion6 = OnBoardingActivity.INSTANCE;
                                OnBoardingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3);
                            }
                            splashscreenActivity.d_();
                        }
                    }
                }
            }
            getMaxImages getmaximages4 = getMaxImages.INSTANCE;
            firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                return null;
            }
            splashscreenActivity.TuitionPaymentFragmentbindingInflater1(splashscreenActivity.getIntent());
            return null;
        }
        int i18 = f631a + 121;
        g = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 7 / 0;
            if (!getCollectionUri.TuitionPaymentFragmentspecialinlinedviewModeldefault1("su")) {
                if (!getCollectionUri.TuitionPaymentFragmentspecialinlinedviewModeldefault1("busybox")) {
                    map = new HashMap();
                    map.put("ro.debuggable", "1");
                    map.put("ro.secure", "0");
                    strArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getcollectionuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    if (strArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        int i20 = f631a + 61;
                        g = i20 % 128;
                        int i21 = i20 % 2;
                    } else {
                        int i22 = f631a + 115;
                        g = i22 % 128;
                        int i23 = i22 % 2;
                        z = false;
                        for (String str8 : strArrTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            for (String str9 : map.keySet()) {
                                if (str8.contains(str9)) {
                                    String str10 = (String) map.get(str9);
                                    StringBuilder sb = new StringBuilder("[");
                                    sb.append(str10);
                                    sb.append("]");
                                    string = sb.toString();
                                    if (str8.contains(string)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str9);
                                        sb2.append(" = ");
                                        sb2.append(string);
                                        sb2.append(" detected!");
                                        String string4 = sb2.toString();
                                        setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        String.valueOf(string4);
                                        z = true;
                                    }
                                }
                            }
                        }
                        if (!z) {
                        }
                    }
                    i4 = f631a + 117;
                    g = i4 % 128;
                    if (i4 % 2 == 0) {
                        strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getcollectionuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        if (strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                            length = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
                            i6 = 0;
                            z2 = false;
                            while (i6 < length) {
                                str4 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i6];
                                strArrSplit = str4.split(" ");
                                if (strArrSplit.length < 6) {
                                    setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Error formatting mount line: ".concat(String.valueOf(str4)));
                                    strArr2 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i8 = length;
                                } else {
                                    str5 = strArrSplit[c];
                                    String str11 = strArrSplit[5];
                                    strArr = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternalBuilder.b;
                                    length2 = strArr.length;
                                    str6 = str11;
                                    z3 = z2;
                                    i7 = 0;
                                    while (i7 < length2) {
                                        str7 = strArr[i7];
                                        if (str5.equalsIgnoreCase(str7)) {
                                            strReplace = str6.replace("(", "").replace(")", "");
                                            strArrSplit2 = strReplace.split(",");
                                            strArr3 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            length3 = strArrSplit2.length;
                                            i10 = 0;
                                            while (true) {
                                                if (i10 < length3) {
                                                    i9 = length;
                                                    str6 = strReplace;
                                                    break;
                                                    break;
                                                }
                                                i11 = length3;
                                                i9 = length;
                                                if (strArrSplit2[i10].equalsIgnoreCase("rw")) {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append(str7);
                                                    sb3.append(" path is mounted with rw permissions! ");
                                                    sb3.append(str4);
                                                    String string5 = sb3.toString();
                                                    setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                    String.valueOf(string5);
                                                    str6 = strReplace;
                                                    z3 = true;
                                                    break;
                                                    break;
                                                }
                                                i10++;
                                                length3 = i11;
                                                length = i9;
                                            }
                                        } else {
                                            strArr3 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            i9 = length;
                                        }
                                        i7++;
                                        strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = strArr3;
                                        length = i9;
                                    }
                                    strArr2 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i8 = length;
                                    z2 = z3;
                                }
                                i6++;
                                strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = strArr2;
                                length = i8;
                                c = 2;
                            }
                            if (!z2) {
                            }
                        }
                        int i110 = f631a + 125;
                        g = i110 % 128;
                        int i111 = i110 % 2;
                        Intrinsics.checkNotNullParameter(splashscreenActivity3, "");
                        if (!accessgetMCameraXp.TuitionPaymentFragmentbindingInflater1(splashscreenActivity3)) {
                            if (StringsKt.equals(Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), ApiModuleKt.getAppSignature(), true)) {
                                String string6 = splashscreenActivity.getString(R.string.error_message_app_invalid);
                                Intrinsics.checkNotNullExpressionValue(string6, "");
                                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity, string6, new Function0() { // from class: r8lambdaTUxZVHRXbKIIvwcobeYpqdAnw2s
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                                    }
                                });
                            } else {
                                getMaxImages getmaximages5 = getMaxImages.INSTANCE;
                                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                listSplit$default = StringsKt.split$default((CharSequence) "4.17.8", new String[]{"."}, false, 0, 6, (Object) null);
                                listSplit$default2 = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault3, new String[]{"."}, false, 0, 6, (Object) null);
                                iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
                                i2 = 0;
                                while (true) {
                                    if (i2 < iMax) {
                                        str = (String) CollectionsKt.getOrNull(listSplit$default, i2);
                                        if (str != null) {
                                            iIntValue = 0;
                                        } else {
                                            iIntValue = 0;
                                        }
                                        str2 = (String) CollectionsKt.getOrNull(listSplit$default2, i2);
                                        if (str2 != null) {
                                            iIntValue2 = 0;
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        if (iIntValue < iIntValue2) {
                                            UpdateActivity.Companion companion7 = UpdateActivity.INSTANCE;
                                            UpdateActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity3);
                                            splashscreenActivity.d_();
                                        } else if (iIntValue <= iIntValue2) {
                                            i2++;
                                        }
                                    }
                                    if (((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                                        MainActivity.Companion companion8 = MainActivity.INSTANCE;
                                        MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3, null, null, 6);
                                    } else {
                                        OnBoardingActivity.Companion companion9 = OnBoardingActivity.INSTANCE;
                                        OnBoardingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3);
                                    }
                                    splashscreenActivity.d_();
                                }
                            }
                        }
                        getMaxImages getmaximages6 = getMaxImages.INSTANCE;
                        firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        if (!((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                            return null;
                        }
                        splashscreenActivity.TuitionPaymentFragmentbindingInflater1(splashscreenActivity.getIntent());
                        return null;
                    }
                    strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getcollectionuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i24 = 90 / 0;
                    if (strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        length = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
                        i6 = 0;
                        z2 = false;
                        while (i6 < length) {
                            str4 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i6];
                            strArrSplit = str4.split(" ");
                            if (strArrSplit.length < 6) {
                                setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Error formatting mount line: ".concat(String.valueOf(str4)));
                                strArr2 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i8 = length;
                            } else {
                                str5 = strArrSplit[c];
                                String str12 = strArrSplit[5];
                                strArr = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternalBuilder.b;
                                length2 = strArr.length;
                                str6 = str12;
                                z3 = z2;
                                i7 = 0;
                                while (i7 < length2) {
                                    str7 = strArr[i7];
                                    if (str5.equalsIgnoreCase(str7)) {
                                        strReplace = str6.replace("(", "").replace(")", "");
                                        strArrSplit2 = strReplace.split(",");
                                        strArr3 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        length3 = strArrSplit2.length;
                                        i10 = 0;
                                        while (true) {
                                            if (i10 < length3) {
                                                i9 = length;
                                                str6 = strReplace;
                                                break;
                                            }
                                            i11 = length3;
                                            i9 = length;
                                            if (strArrSplit2[i10].equalsIgnoreCase("rw")) {
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append(str7);
                                                sb4.append(" path is mounted with rw permissions! ");
                                                sb4.append(str4);
                                                String string7 = sb4.toString();
                                                setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                String.valueOf(string7);
                                                str6 = strReplace;
                                                z3 = true;
                                                break;
                                            }
                                            i10++;
                                            length3 = i11;
                                            length = i9;
                                        }
                                    } else {
                                        strArr3 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        i9 = length;
                                    }
                                    i7++;
                                    strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = strArr3;
                                    length = i9;
                                }
                                strArr2 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i8 = length;
                                z2 = z3;
                            }
                            i6++;
                            strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = strArr2;
                            length = i8;
                            c = 2;
                        }
                        if (!z2) {
                        }
                    }
                    int i112 = f631a + 125;
                    g = i112 % 128;
                    int i113 = i112 % 2;
                    Intrinsics.checkNotNullParameter(splashscreenActivity3, "");
                    if (!accessgetMCameraXp.TuitionPaymentFragmentbindingInflater1(splashscreenActivity3)) {
                        if (StringsKt.equals(Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), ApiModuleKt.getAppSignature(), true)) {
                            String string8 = splashscreenActivity.getString(R.string.error_message_app_invalid);
                            Intrinsics.checkNotNullExpressionValue(string8, "");
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity, string8, new Function0() { // from class: r8lambdaTUxZVHRXbKIIvwcobeYpqdAnw2s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                                }
                            });
                        } else {
                            getMaxImages getmaximages7 = getMaxImages.INSTANCE;
                            String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            listSplit$default = StringsKt.split$default((CharSequence) "4.17.8", new String[]{"."}, false, 0, 6, (Object) null);
                            listSplit$default2 = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault4, new String[]{"."}, false, 0, 6, (Object) null);
                            iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
                            i2 = 0;
                            while (true) {
                                if (i2 < iMax) {
                                    str = (String) CollectionsKt.getOrNull(listSplit$default, i2);
                                    if (str != null || (intOrNull2 = StringsKt.toIntOrNull(str)) == null) {
                                        iIntValue = 0;
                                    } else {
                                        iIntValue = intOrNull2.intValue();
                                    }
                                    str2 = (String) CollectionsKt.getOrNull(listSplit$default2, i2);
                                    if (str2 != null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
                                        iIntValue2 = 0;
                                    } else {
                                        int i25 = f631a + 67;
                                        g = i25 % 128;
                                        int i26 = i25 % 2;
                                        iIntValue2 = intOrNull.intValue();
                                    }
                                    if (iIntValue < iIntValue2) {
                                        UpdateActivity.Companion companion10 = UpdateActivity.INSTANCE;
                                        UpdateActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity3);
                                        splashscreenActivity.d_();
                                    } else if (iIntValue <= iIntValue2) {
                                        i2++;
                                    }
                                }
                                if (((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                                    MainActivity.Companion companion11 = MainActivity.INSTANCE;
                                    MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3, null, null, 6);
                                } else {
                                    OnBoardingActivity.Companion companion12 = OnBoardingActivity.INSTANCE;
                                    OnBoardingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3);
                                }
                                splashscreenActivity.d_();
                            }
                        }
                    }
                    getMaxImages getmaximages8 = getMaxImages.INSTANCE;
                    firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    if (!((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                        return null;
                    }
                    splashscreenActivity.TuitionPaymentFragmentbindingInflater1(splashscreenActivity.getIntent());
                    return null;
                    str3 = Build.TAGS;
                    if (str3 == null && str3.contains("test-keys")) {
                        int i27 = f631a + 33;
                        g = i27 % 128;
                        int i28 = i27 % 2;
                    } else if (!getcollectionuri.b()) {
                        i5 = f631a + 29;
                        g = i5 % 128;
                        if (i5 % 2 == 0) {
                            getcollectionuri.TuitionPaymentFragmentbindingInflater1();
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        if (getcollectionuri.TuitionPaymentFragmentbindingInflater1() && !getCollectionUri.TuitionPaymentFragmentspecialinlinedviewModeldefault1("magisk")) {
                            int i114 = f631a + 125;
                            g = i114 % 128;
                            int i115 = i114 % 2;
                            Intrinsics.checkNotNullParameter(splashscreenActivity3, "");
                            if (!accessgetMCameraXp.TuitionPaymentFragmentbindingInflater1(splashscreenActivity3)) {
                                if (StringsKt.equals(Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), ApiModuleKt.getAppSignature(), true)) {
                                    String string9 = splashscreenActivity.getString(R.string.error_message_app_invalid);
                                    Intrinsics.checkNotNullExpressionValue(string9, "");
                                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity, string9, new Function0() { // from class: r8lambdaTUxZVHRXbKIIvwcobeYpqdAnw2s
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                                        }
                                    });
                                } else {
                                    getMaxImages getmaximages9 = getMaxImages.INSTANCE;
                                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    listSplit$default = StringsKt.split$default((CharSequence) "4.17.8", new String[]{"."}, false, 0, 6, (Object) null);
                                    listSplit$default2 = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault5, new String[]{"."}, false, 0, 6, (Object) null);
                                    iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < iMax) {
                                            str = (String) CollectionsKt.getOrNull(listSplit$default, i2);
                                            if (str != null) {
                                                iIntValue = 0;
                                            } else {
                                                iIntValue = 0;
                                            }
                                            str2 = (String) CollectionsKt.getOrNull(listSplit$default2, i2);
                                            if (str2 != null) {
                                                iIntValue2 = 0;
                                            } else {
                                                iIntValue2 = 0;
                                            }
                                            if (iIntValue < iIntValue2) {
                                                UpdateActivity.Companion companion13 = UpdateActivity.INSTANCE;
                                                UpdateActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity3);
                                                splashscreenActivity.d_();
                                            } else if (iIntValue <= iIntValue2) {
                                                i2++;
                                            }
                                        }
                                        if (((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                                            MainActivity.Companion companion14 = MainActivity.INSTANCE;
                                            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3, null, null, 6);
                                        } else {
                                            OnBoardingActivity.Companion companion15 = OnBoardingActivity.INSTANCE;
                                            OnBoardingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3);
                                        }
                                        splashscreenActivity.d_();
                                    }
                                }
                            }
                        }
                        getMaxImages getmaximages10 = getMaxImages.INSTANCE;
                        firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        if (!((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                            return null;
                        }
                        splashscreenActivity.TuitionPaymentFragmentbindingInflater1(splashscreenActivity.getIntent());
                        return null;
                    }
                }
            }
        } else if (!getCollectionUri.TuitionPaymentFragmentspecialinlinedviewModeldefault1("su")) {
            if (!getCollectionUri.TuitionPaymentFragmentspecialinlinedviewModeldefault1("busybox")) {
                map = new HashMap();
                map.put("ro.debuggable", "1");
                map.put("ro.secure", "0");
                strArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getcollectionuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                if (strArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    int i29 = f631a + 61;
                    g = i29 % 128;
                    int i210 = i29 % 2;
                } else {
                    int i211 = f631a + 115;
                    g = i211 % 128;
                    int i212 = i211 % 2;
                    z = false;
                    while (i3 < r11) {
                        while (r15.hasNext()) {
                            if (str8.contains(str9)) {
                                String str13 = (String) map.get(str9);
                                StringBuilder sb5 = new StringBuilder("[");
                                sb5.append(str13);
                                sb5.append("]");
                                string = sb5.toString();
                                if (str8.contains(string)) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(str9);
                                    sb6.append(" = ");
                                    sb6.append(string);
                                    sb6.append(" detected!");
                                    String string10 = sb6.toString();
                                    setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    String.valueOf(string10);
                                    z = true;
                                }
                            }
                        }
                    }
                    if (!z) {
                    }
                }
                i4 = f631a + 117;
                g = i4 % 128;
                if (i4 % 2 == 0) {
                    strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getcollectionuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    if (strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        length = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
                        i6 = 0;
                        z2 = false;
                        while (i6 < length) {
                            str4 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i6];
                            strArrSplit = str4.split(" ");
                            if (strArrSplit.length < 6) {
                                setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Error formatting mount line: ".concat(String.valueOf(str4)));
                                strArr2 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i8 = length;
                            } else {
                                str5 = strArrSplit[c];
                                String str14 = strArrSplit[5];
                                strArr = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternalBuilder.b;
                                length2 = strArr.length;
                                str6 = str14;
                                z3 = z2;
                                i7 = 0;
                                while (i7 < length2) {
                                    str7 = strArr[i7];
                                    if (str5.equalsIgnoreCase(str7)) {
                                        strReplace = str6.replace("(", "").replace(")", "");
                                        strArrSplit2 = strReplace.split(",");
                                        strArr3 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        length3 = strArrSplit2.length;
                                        i10 = 0;
                                        while (true) {
                                            if (i10 < length3) {
                                                i9 = length;
                                                str6 = strReplace;
                                                break;
                                                break;
                                            }
                                            i11 = length3;
                                            i9 = length;
                                            if (strArrSplit2[i10].equalsIgnoreCase("rw")) {
                                                StringBuilder sb7 = new StringBuilder();
                                                sb7.append(str7);
                                                sb7.append(" path is mounted with rw permissions! ");
                                                sb7.append(str4);
                                                String string11 = sb7.toString();
                                                setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                String.valueOf(string11);
                                                str6 = strReplace;
                                                z3 = true;
                                                break;
                                                break;
                                            }
                                            i10++;
                                            length3 = i11;
                                            length = i9;
                                        }
                                    } else {
                                        strArr3 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        i9 = length;
                                    }
                                    i7++;
                                    strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = strArr3;
                                    length = i9;
                                }
                                strArr2 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i8 = length;
                                z2 = z3;
                            }
                            i6++;
                            strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = strArr2;
                            length = i8;
                            c = 2;
                        }
                        if (!z2) {
                        }
                    }
                    int i116 = f631a + 125;
                    g = i116 % 128;
                    int i117 = i116 % 2;
                    Intrinsics.checkNotNullParameter(splashscreenActivity3, "");
                    if (!accessgetMCameraXp.TuitionPaymentFragmentbindingInflater1(splashscreenActivity3)) {
                        if (StringsKt.equals(Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), ApiModuleKt.getAppSignature(), true)) {
                            String string12 = splashscreenActivity.getString(R.string.error_message_app_invalid);
                            Intrinsics.checkNotNullExpressionValue(string12, "");
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity, string12, new Function0() { // from class: r8lambdaTUxZVHRXbKIIvwcobeYpqdAnw2s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                                }
                            });
                        } else {
                            getMaxImages getmaximages11 = getMaxImages.INSTANCE;
                            String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            listSplit$default = StringsKt.split$default((CharSequence) "4.17.8", new String[]{"."}, false, 0, 6, (Object) null);
                            listSplit$default2 = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault6, new String[]{"."}, false, 0, 6, (Object) null);
                            iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
                            i2 = 0;
                            while (true) {
                                if (i2 < iMax) {
                                    str = (String) CollectionsKt.getOrNull(listSplit$default, i2);
                                    if (str != null) {
                                        iIntValue = 0;
                                    } else {
                                        iIntValue = 0;
                                    }
                                    str2 = (String) CollectionsKt.getOrNull(listSplit$default2, i2);
                                    if (str2 != null) {
                                        iIntValue2 = 0;
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    if (iIntValue < iIntValue2) {
                                        UpdateActivity.Companion companion16 = UpdateActivity.INSTANCE;
                                        UpdateActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity3);
                                        splashscreenActivity.d_();
                                    } else if (iIntValue <= iIntValue2) {
                                        i2++;
                                    }
                                }
                                if (((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                                    MainActivity.Companion companion17 = MainActivity.INSTANCE;
                                    MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3, null, null, 6);
                                } else {
                                    OnBoardingActivity.Companion companion18 = OnBoardingActivity.INSTANCE;
                                    OnBoardingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3);
                                }
                                splashscreenActivity.d_();
                            }
                        }
                    }
                    getMaxImages getmaximages12 = getMaxImages.INSTANCE;
                    firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    if (!((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                        return null;
                    }
                    splashscreenActivity.TuitionPaymentFragmentbindingInflater1(splashscreenActivity.getIntent());
                    return null;
                }
                strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getcollectionuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i213 = 90 / 0;
                if (strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    length = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
                    i6 = 0;
                    z2 = false;
                    while (i6 < length) {
                        str4 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i6];
                        strArrSplit = str4.split(" ");
                        if (strArrSplit.length < 6) {
                            setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Error formatting mount line: ".concat(String.valueOf(str4)));
                            strArr2 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i8 = length;
                        } else {
                            str5 = strArrSplit[c];
                            String str15 = strArrSplit[5];
                            strArr = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternalBuilder.b;
                            length2 = strArr.length;
                            str6 = str15;
                            z3 = z2;
                            i7 = 0;
                            while (i7 < length2) {
                                str7 = strArr[i7];
                                if (str5.equalsIgnoreCase(str7)) {
                                    strReplace = str6.replace("(", "").replace(")", "");
                                    strArrSplit2 = strReplace.split(",");
                                    strArr3 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    length3 = strArrSplit2.length;
                                    i10 = 0;
                                    while (true) {
                                        if (i10 < length3) {
                                            i9 = length;
                                            str6 = strReplace;
                                            break;
                                            break;
                                        }
                                        i11 = length3;
                                        i9 = length;
                                        if (strArrSplit2[i10].equalsIgnoreCase("rw")) {
                                            StringBuilder sb8 = new StringBuilder();
                                            sb8.append(str7);
                                            sb8.append(" path is mounted with rw permissions! ");
                                            sb8.append(str4);
                                            String string13 = sb8.toString();
                                            setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            String.valueOf(string13);
                                            str6 = strReplace;
                                            z3 = true;
                                            break;
                                            break;
                                        }
                                        i10++;
                                        length3 = i11;
                                        length = i9;
                                    }
                                } else {
                                    strArr3 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i9 = length;
                                }
                                i7++;
                                strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = strArr3;
                                length = i9;
                            }
                            strArr2 = strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i8 = length;
                            z2 = z3;
                        }
                        i6++;
                        strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = strArr2;
                        length = i8;
                        c = 2;
                    }
                    if (!z2) {
                    }
                }
                int i118 = f631a + 125;
                g = i118 % 128;
                int i119 = i118 % 2;
                Intrinsics.checkNotNullParameter(splashscreenActivity3, "");
                if (!accessgetMCameraXp.TuitionPaymentFragmentbindingInflater1(splashscreenActivity3)) {
                    if (StringsKt.equals(Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), ApiModuleKt.getAppSignature(), true)) {
                        String string14 = splashscreenActivity.getString(R.string.error_message_app_invalid);
                        Intrinsics.checkNotNullExpressionValue(string14, "");
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity, string14, new Function0() { // from class: r8lambdaTUxZVHRXbKIIvwcobeYpqdAnw2s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                            }
                        });
                    } else {
                        getMaxImages getmaximages13 = getMaxImages.INSTANCE;
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        listSplit$default = StringsKt.split$default((CharSequence) "4.17.8", new String[]{"."}, false, 0, 6, (Object) null);
                        listSplit$default2 = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault7, new String[]{"."}, false, 0, 6, (Object) null);
                        iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
                        i2 = 0;
                        while (true) {
                            if (i2 < iMax) {
                                str = (String) CollectionsKt.getOrNull(listSplit$default, i2);
                                if (str != null) {
                                    iIntValue = 0;
                                } else {
                                    iIntValue = 0;
                                }
                                str2 = (String) CollectionsKt.getOrNull(listSplit$default2, i2);
                                if (str2 != null) {
                                    iIntValue2 = 0;
                                } else {
                                    iIntValue2 = 0;
                                }
                                if (iIntValue < iIntValue2) {
                                    UpdateActivity.Companion companion19 = UpdateActivity.INSTANCE;
                                    UpdateActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity3);
                                    splashscreenActivity.d_();
                                } else if (iIntValue <= iIntValue2) {
                                    i2++;
                                }
                            }
                            if (((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                                MainActivity.Companion companion110 = MainActivity.INSTANCE;
                                MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3, null, null, 6);
                            } else {
                                OnBoardingActivity.Companion companion111 = OnBoardingActivity.INSTANCE;
                                OnBoardingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3);
                            }
                            splashscreenActivity.d_();
                        }
                    }
                }
                getMaxImages getmaximages14 = getMaxImages.INSTANCE;
                firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (!((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                    return null;
                }
                splashscreenActivity.TuitionPaymentFragmentbindingInflater1(splashscreenActivity.getIntent());
                return null;
                str3 = Build.TAGS;
                if (str3 == null) {
                    if (!getcollectionuri.b()) {
                        i5 = f631a + 29;
                        g = i5 % 128;
                        if (i5 % 2 == 0) {
                            getcollectionuri.TuitionPaymentFragmentbindingInflater1();
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                        if (getcollectionuri.TuitionPaymentFragmentbindingInflater1()) {
                        }
                    }
                } else if (!getcollectionuri.b()) {
                    i5 = f631a + 29;
                    g = i5 % 128;
                    if (i5 % 2 == 0) {
                        getcollectionuri.TuitionPaymentFragmentbindingInflater1();
                        Object obj6 = null;
                        obj6.hashCode();
                        throw null;
                    }
                    if (getcollectionuri.TuitionPaymentFragmentbindingInflater1()) {
                    }
                }
                int i1110 = f631a + 125;
                g = i1110 % 128;
                int i1111 = i1110 % 2;
                Intrinsics.checkNotNullParameter(splashscreenActivity3, "");
                if (!accessgetMCameraXp.TuitionPaymentFragmentbindingInflater1(splashscreenActivity3)) {
                    if (StringsKt.equals(Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), ApiModuleKt.getAppSignature(), true)) {
                        String string15 = splashscreenActivity.getString(R.string.error_message_app_invalid);
                        Intrinsics.checkNotNullExpressionValue(string15, "");
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity, string15, new Function0() { // from class: r8lambdaTUxZVHRXbKIIvwcobeYpqdAnw2s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                            }
                        });
                    } else {
                        getMaxImages getmaximages15 = getMaxImages.INSTANCE;
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault8 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        listSplit$default = StringsKt.split$default((CharSequence) "4.17.8", new String[]{"."}, false, 0, 6, (Object) null);
                        listSplit$default2 = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault8, new String[]{"."}, false, 0, 6, (Object) null);
                        iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
                        i2 = 0;
                        while (true) {
                            if (i2 < iMax) {
                                str = (String) CollectionsKt.getOrNull(listSplit$default, i2);
                                if (str != null) {
                                    iIntValue = 0;
                                } else {
                                    iIntValue = 0;
                                }
                                str2 = (String) CollectionsKt.getOrNull(listSplit$default2, i2);
                                if (str2 != null) {
                                    iIntValue2 = 0;
                                } else {
                                    iIntValue2 = 0;
                                }
                                if (iIntValue < iIntValue2) {
                                    UpdateActivity.Companion companion112 = UpdateActivity.INSTANCE;
                                    UpdateActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity3);
                                    splashscreenActivity.d_();
                                } else if (iIntValue <= iIntValue2) {
                                    i2++;
                                }
                            }
                            if (((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                                MainActivity.Companion companion113 = MainActivity.INSTANCE;
                                MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3, null, null, 6);
                            } else {
                                OnBoardingActivity.Companion companion114 = OnBoardingActivity.INSTANCE;
                                OnBoardingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3);
                            }
                            splashscreenActivity.d_();
                        }
                    }
                }
                getMaxImages getmaximages16 = getMaxImages.INSTANCE;
                firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (!((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                    return null;
                }
                splashscreenActivity.TuitionPaymentFragmentbindingInflater1(splashscreenActivity.getIntent());
                return null;
            }
        }
        i = f631a + 63;
        g = i % 128;
        if (i % 2 == 0) {
            Object obj7 = null;
            CommonUtils.isRooted();
            obj7.hashCode();
            throw null;
        }
        if (!CommonUtils.isRooted()) {
            int i1112 = f631a + 125;
            g = i1112 % 128;
            int i1113 = i1112 % 2;
            Intrinsics.checkNotNullParameter(splashscreenActivity3, "");
            if (!accessgetMCameraXp.TuitionPaymentFragmentbindingInflater1(splashscreenActivity3)) {
                if (StringsKt.equals(Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), ApiModuleKt.getAppSignature(), true)) {
                    String string16 = splashscreenActivity.getString(R.string.error_message_app_invalid);
                    Intrinsics.checkNotNullExpressionValue(string16, "");
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity, string16, new Function0() { // from class: r8lambdaTUxZVHRXbKIIvwcobeYpqdAnw2s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                        }
                    });
                } else {
                    getMaxImages getmaximages17 = getMaxImages.INSTANCE;
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault9 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    listSplit$default = StringsKt.split$default((CharSequence) "4.17.8", new String[]{"."}, false, 0, 6, (Object) null);
                    listSplit$default2 = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault9, new String[]{"."}, false, 0, 6, (Object) null);
                    iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
                    i2 = 0;
                    while (true) {
                        if (i2 < iMax) {
                            str = (String) CollectionsKt.getOrNull(listSplit$default, i2);
                            if (str != null) {
                                iIntValue = 0;
                            } else {
                                iIntValue = 0;
                            }
                            str2 = (String) CollectionsKt.getOrNull(listSplit$default2, i2);
                            if (str2 != null) {
                                iIntValue2 = 0;
                            } else {
                                iIntValue2 = 0;
                            }
                            if (iIntValue < iIntValue2) {
                                UpdateActivity.Companion companion115 = UpdateActivity.INSTANCE;
                                UpdateActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity3);
                                splashscreenActivity.d_();
                            } else if (iIntValue <= iIntValue2) {
                                i2++;
                            }
                        }
                        if (((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                            MainActivity.Companion companion116 = MainActivity.INSTANCE;
                            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3, null, null, 6);
                        } else {
                            OnBoardingActivity.Companion companion117 = OnBoardingActivity.INSTANCE;
                            OnBoardingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity3);
                        }
                        splashscreenActivity.d_();
                    }
                }
            }
        }
        getMaxImages getmaximages18 = getMaxImages.INSTANCE;
        firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
            return null;
        }
        splashscreenActivity.TuitionPaymentFragmentbindingInflater1(splashscreenActivity.getIntent());
        return null;
        String string17 = splashscreenActivity.getString(R.string.error_message_device_not_support);
        Intrinsics.checkNotNullExpressionValue(string17, "");
        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(splashscreenActivity, string17, new Function0() { // from class: ZslUtil
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        getMaxImages getmaximages19 = getMaxImages.INSTANCE;
        firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!((ApiCompatApi29Impl) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
            return null;
        }
        splashscreenActivity.TuitionPaymentFragmentbindingInflater1(splashscreenActivity.getIntent());
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final SplashscreenActivity splashscreenActivity = (SplashscreenActivity) objArr[0];
        int i = 2 % 2;
        new AlertDialog.Builder(splashscreenActivity).setTitle(splashscreenActivity.getString(R.string.permission_location_title)).setMessage(splashscreenActivity.getString(R.string.permission_location_rationale)).setPositiveButton(splashscreenActivity.getString(R.string.action_allow), new DialogInterface.OnClickListener() { // from class: createReprocessingInputSizeMap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, dialogInterface};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                SplashscreenActivity.TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1163190290, objArr2, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1163190290);
            }
        }).setNegativeButton(splashscreenActivity.getString(R.string.action_exit), new DialogInterface.OnClickListener() { // from class: onRemove
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, dialogInterface);
            }
        }).setCancelable(false).show();
        int i2 = f631a + 85;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        new AlertDialog.Builder(this).setTitle(getString(R.string.gps_required_title)).setMessage(getString(R.string.gps_required_message)).setPositiveButton(getString(R.string.action_settings), new DialogInterface.OnClickListener() { // from class: ApiCompatApi26Impl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SplashscreenActivity.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, dialogInterface);
            }
        }).setNegativeButton(getString(R.string.action_later), new DialogInterface.OnClickListener() { // from class: ApiCompatApi21Impl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SplashscreenActivity.b(dialogInterface);
            }
        }).setCancelable(true).show();
        int i2 = g + 11;
        f631a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Object obj = null;
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        this.d.launch(intent);
        int i2 = f631a + 63;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void TuitionPaymentFragmentbindingInflater1(Intent p0) {
        int i = 2 % 2;
        Task<PendingDynamicLinkData> dynamicLink = FirebaseDynamicLinks.getInstance().getDynamicLink(p0);
        final Function1 function1 = new Function1() { // from class: ZslControlImplExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SplashscreenActivity.TuitionPaymentFragmentbindingInflater1(this.b, (PendingDynamicLinkData) obj);
            }
        };
        dynamicLink.addOnSuccessListener(new OnSuccessListener() { // from class: ZslControlImplExternalSyntheticLambda1
            private static final byte[] $$a = {25, 5, -88, -44};
            private static final int $$b = 21;
            private static int $10 = 0;
            private static int $11 = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f244a = 0;
            private static int asInterface = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
            private static char b = 983;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-483221296, 132393751, 2114531860, -1167897175, -68544018, 74974543, 1535662121, 350161275, 2014874300, -944074557, -1394634076, -1321289368, -1506707765, -1897270978, -128888464, -851496355, 615359130, 775998031};

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = asInterface + 5;
                f244a = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {function1, obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                SplashscreenActivity.TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -825408883, objArr, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 825408888);
                int i5 = asInterface + 57;
                f244a = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            private static void c(char[] cArr, char[] cArr2, char c, int i2, char[] cArr3, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i5 = $10 + 81;
                    $11 = i5 % 128;
                    int i6 = i5 % i3;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.red(0) + 8328), 1235 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 35, -653973969, false, $$c(b2, (byte) (b2 | 36), b2), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        try {
                            Object[] objArr3 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2764, KeyEvent.normalizeMetaState(0) + 14, 1504416861, false, $$c(b3, (byte) (b3 | 38), b3), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            try {
                                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 43325), 253 - TextUtils.getTrimmedLength(""), 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                try {
                                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b4 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 65200), 2891 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 17, 2012627446, false, $$c(b4, (byte) (b4 | 37), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                    cArr4[iIntValue2] = sessionProcessor.b;
                                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                    int i7 = $11 + 35;
                                    $10 = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        int i8 = 2 % 3;
                                    }
                                    i3 = 2;
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
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            private static void d(int[] iArr, int i2, Object[] objArr) throws Throwable {
                int length;
                int[] iArr2;
                int i3 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                char c = '0';
                int i4 = -1870535734;
                int i5 = 1;
                int i6 = 0;
                if (iArr3 != null) {
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int i7 = 0;
                    while (i7 < length2) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i6] = Integer.valueOf(iArr3[i7]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i6;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", c)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3291, (ViewConfiguration.getWindowTouchSlop() >> 8) + 31, 1948206109, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr4[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i7++;
                            int i8 = $11 + 15;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            c = '0';
                            i4 = -1870535734;
                            i6 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr3 = iArr4;
                }
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int[] iArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (iArr6 != null) {
                    int i10 = $10 + 43;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        length = iArr6.length;
                        iArr2 = new int[length];
                    } else {
                        length = iArr6.length;
                        iArr2 = new int[length];
                    }
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = new Object[i5];
                        objArr3[0] = Integer.valueOf(iArr6[i11]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0') + 3292, ExpandableListView.getPackedPositionChild(0L) + 32, 1948206109, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr2[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i11++;
                        iArr6 = iArr6;
                        i5 = 1;
                    }
                    iArr6 = iArr2;
                }
                System.arraycopy(iArr6, 0, iArr5, 0, length3);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    int i12 = $11 + 87;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i14 = $10 + 27;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    for (int i16 = 17; i16 > 1; i16--) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i16];
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2559 - (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myTid() >> 22) + 29, 683220507, false, $$c(b6, (byte) (b6 | 56), b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    }
                    int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 28879), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 348, 24 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                }
                objArr[0] = new String(cArr2, 0, i2);
                int i19 = $11 + 49;
                $10 = i19 % 128;
                int i20 = i19 % 2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v92, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v93 */
            /* JADX WARN: Type inference failed for: r10v94, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r26v2 */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v100 */
            /* JADX WARN: Type inference failed for: r4v101 */
            /* JADX WARN: Type inference failed for: r4v102 */
            /* JADX WARN: Type inference failed for: r4v103 */
            /* JADX WARN: Type inference failed for: r4v2 */
            /* JADX WARN: Type inference failed for: r4v29 */
            /* JADX WARN: Type inference failed for: r4v3 */
            /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v37 */
            /* JADX WARN: Type inference failed for: r4v38 */
            /* JADX WARN: Type inference failed for: r4v76, types: [byte[]] */
            /* JADX WARN: Type inference failed for: r4v78 */
            /* JADX WARN: Type inference failed for: r4v91 */
            /* JADX WARN: Type inference failed for: r4v93 */
            /* JADX WARN: Type inference failed for: r4v98 */
            /* JADX WARN: Type inference failed for: r4v99 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r33, int r34, int r35) {
                /*
                    Method dump skipped, instruction units count: 4192
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ZslControlImplExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context, int, int):java.lang.Object[]");
            }

            private static String $$c(int i2, int i3, int i4) {
                int i5 = i3 + 66;
                byte[] bArr = $$a;
                int i6 = i4 * 4;
                int i7 = 4 - (i2 * 3);
                byte[] bArr2 = new byte[1 - i6];
                int i8 = 0 - i6;
                int i9 = -1;
                if (bArr == null) {
                    i5 = i7 + i5;
                    i7++;
                }
                while (true) {
                    i9++;
                    bArr2[i9] = (byte) i5;
                    if (i9 == i8) {
                        return new String(bArr2, 0);
                    }
                    int i10 = i5;
                    int i11 = i7 + 1;
                    i5 = i10 + bArr[i7];
                    i7 = i11;
                }
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: ZslControlImplExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                SplashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(exc);
            }
        });
        int i2 = f631a + 65;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = f631a + 123;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29943);
            int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            c((short) 103, b, (byte) (b | 14), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, touchSlop, packedPositionGroup, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 0, 19}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 17, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
            int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c((short) 140, bArr[5], bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, keyRepeatTimeout, deadChar, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int i4 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                short s = (short) ($$b & 123);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(s, bArr2[5], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i4, iLastIndexOf, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i5 = ~(534568911 | iElapsedRealtime);
            int i6 = ((((-810356811) + ((185125257 | i5) * (-476))) + (i5 * 952)) + ((~((~iElapsedRealtime) | 534568911)) * 476)) - 463746613;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{37, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1602914387};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 42049), TextUtils.getOffsetBefore("", 0) + 1726, 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -463746613, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c3 = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
                    int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                    short s2 = (short) ($$b & 123);
                    byte[] bArr3 = $$a;
                    Object[] objArr11 = new Object[1];
                    c(s2, bArr3[5], bArr3[7], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, iNormalizeMetaState, threadPriority, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new int[]{0, 22, 0, 19}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new int[]{22, 15, 17, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                        int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        c((short) 140, bArr4[5], bArr4[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity, maximumFlingVelocity, i9, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c4 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                        int i10 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 24;
                        byte b2 = $$a[5];
                        Object[] objArr15 = new Object[1];
                        c((short) 103, b2, (byte) (b2 | 14), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c4, i10, packedPositionChild, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i11 = ((int[]) objArrB$7879113[1])[0];
        int i12 = ((int[]) objArrB$7879113[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i13 = g + 101;
                f631a = i13 % 128;
                int i14 = i13 % 2;
                for (String str : strArr) {
                    int i15 = f631a + 121;
                    g = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i17 = ((int[]) objArrB$7879113[3])[0];
        Object[] objArr16 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.input_2).substring(3, 4).length() + 88286737;
        int i18 = i17 + 1878469249 + ((928259678 | length) * 376) + (((~((~length) | 571021036)) | 357828626) * (-376)) + (((~(length | (-571021037))) | (-358418611)) * 376);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr16[3])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c5 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
            int windowTouchSlop = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr5 = $$a;
            Object[] objArr17 = new Object[1];
            c(bArr5[132], bArr5[5], bArr5[7], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c5, maximumFlingVelocity2, windowTouchSlop, 1357589585, false, (String) objArr17[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr18 = new Object[1];
        e(new int[]{0, 22, 0, 19}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, objArr18);
        Class<?> cls4 = Class.forName((String) objArr18[0]);
        Object[] objArr19 = new Object[1];
        e(new int[]{22, 15, 17, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr19);
        long jLongValue3 = ((Long) cls4.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c6 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int iRed = Color.red(0) + 1031;
            int i21 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
            short s3 = (short) ($$b & 123);
            byte[] bArr6 = $$a;
            Object[] objArr20 = new Object[1];
            c(s3, bArr6[5], bArr6[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c6, iRed, i21, 1344079056, false, (String) objArr20[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iResolveSize = View.resolveSize(0, 0) + 1031;
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 15;
                short s4 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte b3 = $$a[7];
                Object[] objArr21 = new Object[1];
                c(s4, b3, (byte) (b3 | 52), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollBarFadeDuration, iResolveSize, offsetBefore, 632103528, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr22[3])[0];
            int i23 = ((int[]) objArr22[1])[0];
            String[] strArr2 = (String[]) objArr22[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i24 = 1972551637 + ((~((~iIdentityHashCode) | (-1317019))) * (-116)) + ((799769956 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 555489786)) | 245597188) * 116) + 2085132471;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[2])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new int[]{37, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr23);
            Class<?> cls5 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr24);
            int iIntValue2 = ((Integer) cls5.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1602914387};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (Process.getGidForName("") + 46039), TextUtils.lastIndexOf("", '0', 0) + 1135, 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr26 = {Integer.valueOf(iIntValue2), 0, 2085132471, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 15;
                byte[] bArr7 = $$a;
                Object[] objArr27 = new Object[1];
                c(bArr7[132], bArr7[5], bArr7[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(absoluteGravity2, iIndexOf, iIndexOf2, 1298546779, false, (String) objArr27[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ((byte) KeyEvent.getModifierMetaStateMask())), 1117 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0', 0) + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr26);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c7 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int i27 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                short s5 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte b4 = $$a[7];
                Object[] objArr28 = new Object[1];
                c(s5, b4, (byte) (b4 | 52), objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c7, i27, iKeyCodeFromString, 632103528, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr29 = new Object[1];
                e(new int[]{0, 22, 0, 19}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, objArr29);
                Class<?> cls6 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                e(new int[]{22, 15, 17, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr30);
                long jLongValue4 = ((Long) cls6.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int size = View.MeasureSpec.getSize(0) + 1031;
                    int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
                    short s6 = (short) ($$b & 123);
                    byte[] bArr8 = $$a;
                    Object[] objArr31 = new Object[1];
                    c(s6, bArr8[5], bArr8[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMakeMeasureSpec, size, iResolveOpacity, 1344079056, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i28 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr9 = $$a;
                    Object[] objArr32 = new Object[1];
                    c(bArr9[132], bArr9[5], bArr9[7], objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(capsMode, longPressTimeout, i28, 1357589585, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArr[1])[0];
        int i30 = ((int[]) objArr[3])[0];
        if (i30 == i29) {
            Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[3])[0];
            int i33 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i34 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i35 = ~i34;
            int i36 = i31 + 433629483 + (((~((-52133445) | i35)) | (~((-192146726) | i34))) * (-370)) + (((~(i34 | (-52133445))) | (~(i35 | (-192146726))) | (-192675686)) * (-370)) + 1724440212;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr33[2])[0] = i38 ^ (i38 << 5);
            int i39 = g + 1;
            f631a = i39 % 128;
            int i40 = i39 % 2;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i30];
        int i41 = i30 - 1;
        iArr[i41] = 1;
        Toast.makeText((Context) null, iArr[((i30 * i41) % 2) - 1], 1).show();
        Object[] objArr34 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i42 = ((int[]) objArr[2])[0];
        int i43 = ((int[]) objArr[3])[0];
        int i44 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i45 = ~((-973309718) | iIdentityHashCode2);
        int i46 = (-1946391307) + ((704643841 | i45) * (-280)) + ((i45 | (~(729029547 | iIdentityHashCode2))) * 140);
        int i47 = ~((-268665877) | iIdentityHashCode2);
        int i48 = ~iIdentityHashCode2;
        int i49 = i42 + i46 + (((~(i48 | 997695423)) | i47 | (~((-704643842) | i48))) * 140);
        int i50 = i49 ^ (i49 << 13);
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr34[2])[0] = i51 ^ (i51 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1281368111
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
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.cacheInteropConfig.b
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
            android.content.Context r4 = r4.getApplicationContext()
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.targetSdkVersion
            r5 = -369310066(0xffffffffe9fcc68e, float:-3.819837E25)
            int r4 = r4 + r5
            int r5 = ~r4
            r6 = 1129416812(0x4351886c, float:209.5329)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = 277374353(0x10886591, float:5.379903E-29)
            r6 = r6 | r7
            int r6 = r6 * 168
            r7 = 1168966376(0x45ad02e8, float:5536.3633)
            int r7 = r7 + r6
            r6 = -277374354(0xffffffffef779a6e, float:-7.662949E28)
            r6 = r6 | r4
            int r6 = ~r6
            int r6 = r6 * 168
            int r7 = r7 + r6
            r6 = -299429270(0xffffffffee27126a, float:-1.2926564E28)
            r5 = r5 | r6
            int r5 = ~r5
            r6 = 22054916(0x1508804, float:3.8301153E-38)
            r5 = r5 | r6
            r6 = 1406791165(0x53d9edfd, float:1.8720014E12)
            r4 = r4 | r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 168
            int r7 = r7 + r4
            if (r1 == r7) goto L8b
            int r1 = com.bpjstku.presentation.splash.SplashscreenActivity.g
            int r1 = r1 + 101
            int r4 = r1 % 128
            com.bpjstku.presentation.splash.SplashscreenActivity.f631a = r4
            int r1 = r1 % r0
            r1 = -1281368111(0xffffffffb39fdfd1, float:-7.4447264E-8)
            int[] r1 = new int[r1]
            r4 = -1281368112(0xffffffffb39fdfd0, float:-7.444726E-8)
            r5 = 1
            r1[r4] = r5
            r4 = 1537992912(0x5babe8d0, float:9.67764E16)
            int r4 = r4 % r0
            r4 = -1
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
            int r1 = com.bpjstku.presentation.splash.SplashscreenActivity.f631a
            int r1 = r1 + 61
            int r4 = r1 % 128
            com.bpjstku.presentation.splash.SplashscreenActivity.g = r4
            int r1 = r1 % r0
        L8b:
            java.lang.reflect.Member[] r1 = defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r8)
            r3 = 1856744648(0x6eabacc8, float:2.6565408E28)
            r2 = r2 | r3
            int r2 = ~r2
            r3 = -722311317(0xffffffffd4f2676b, float:-8.328937E12)
            r3 = r3 | r2
            int r3 = r3 * (-220)
            r4 = -1482296396(0xffffffffa7a5f3b4, float:-4.6060923E-15)
            int r4 = r4 + r3
            r3 = -1873788125(0xffffffff90504323, float:-4.1072487E-29)
            r2 = r2 | r3
            int r2 = r2 * 220
            int r4 = r4 + r2
            r2 = -311787640(0xffffffffed6a7f88, float:-4.5358543E27)
            int r4 = r4 + r2
            if (r1 != r4) goto Lb9
            super.onResume()
            return
        Lb9:
            r1 = -1488414430(0xffffffffa7489922, float:-2.783859E-15)
            int r1 = r1 % r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.splash.SplashscreenActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e5, code lost:
    
        if (r1 != ((1127048527 + (((~(r2 | 1960329108)) | 618726856) * 191)) + (((~((~r2) | 1960329108)) | 2162760) * 191))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e7, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.splash.SplashscreenActivity.f631a + 77;
        com.bpjstku.presentation.splash.SplashscreenActivity.g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f3, code lost:
    
        if ((r1 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f5, code lost:
    
        r0 = 48 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f9, code lost:
    
        r1 = 1330213564 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0102, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0103, code lost:
    
        r1 = 1306021606 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010c, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0067, code lost:
    
        if (r1 == ((((-864906616) + (((~(r2 | (-1098914529))) | 268926985) * (-828))) + ((r2 | (-1098914529)) * (-828))) - 631837568)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00bb, code lost:
    
        if (r1 == ((r7 + (((~(286107777 | r6)) | (-1401940954)) * (-1976))) + ((((~(r2 | 1116095320)) | 262144) | (~((-1116095321) | r6))) * 988))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00bd, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r10);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.splash.SplashscreenActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b1, code lost:
    
        if (r1 != (((((~(r4 | 1727893158)) | ((~((-851162807) | r4)) | 268578832)) * (-397)) - 1137124004) + ((r2 | 1413888016) * 397))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b3, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.splash.SplashscreenActivity.g + 125;
        com.bpjstku.presentation.splash.SplashscreenActivity.f631a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bf, code lost:
    
        if ((r10 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c1, code lost:
    
        r10 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c5, code lost:
    
        r10 = (-1660373896) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ce, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d6, code lost:
    
        throw new java.lang.RuntimeException("595674491");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0057, code lost:
    
        if (r1 == (((((~((-335475366) | r4)) | 310932097) * (-241)) + 419114679) + (((~(r4 | (-24543269))) | (-1476395006)) * 241))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007f, code lost:
    
        if (r1 == (((((~(1793300740 | r4)) | (-1401513770)) * 398) + 313874434) + (((~((~r4) | 1793300740)) | (-1401513770)) * 398))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = new java.util.Random().nextInt();
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.splash.SplashscreenActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(SplashscreenActivity splashscreenActivity) {
        int i = 2 % 2;
        int i2 = f631a + 11;
        g = i2 % 128;
        int i3 = i2 % 2;
        splashscreenActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = f631a + 3;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(SplashscreenActivity splashscreenActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = f631a + 105;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            dialogInterface.dismiss();
            splashscreenActivity.finish();
        } else {
            dialogInterface.dismiss();
            splashscreenActivity.finish();
            throw null;
        }
    }

    public static /* synthetic */ void b(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = g + 5;
        f631a = i2 % 128;
        int i3 = i2 % 2;
        dialogInterface.dismiss();
        int i4 = g + 51;
        f631a = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        SplashscreenActivity splashscreenActivity = (SplashscreenActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = f631a + 73;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            dialogInterface.dismiss();
            splashscreenActivity.b.launch(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            return null;
        }
        dialogInterface.dismiss();
        ActivityResultLauncher<String[]> activityResultLauncher = splashscreenActivity.b;
        String[] strArr = new String[2];
        strArr[1] = "android.permission.ACCESS_FINE_LOCATION";
        strArr[1] = "android.permission.ACCESS_COARSE_LOCATION";
        activityResultLauncher.launch(strArr);
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(SplashscreenActivity splashscreenActivity, PendingDynamicLinkData pendingDynamicLinkData) {
        int i = 2 % 2;
        int i2 = f631a + 45;
        g = i2 % 128;
        Uri link = null;
        if (i2 % 2 == 0) {
            link.hashCode();
            throw null;
        }
        link = pendingDynamicLinkData != null ? pendingDynamicLinkData.getLink() : null;
        if (link != null && !(!link.isHierarchical())) {
            String queryParameter = link.getQueryParameter("type");
            if (queryParameter == null) {
                queryParameter = "";
            }
            if (Intrinsics.areEqual(link.getPath(), "/bpu")) {
                int i3 = f631a + 95;
                g = i3 % 128;
                int i4 = i3 % 2;
                if (Intrinsics.areEqual(queryParameter, BpjsServiceEnum.REGISTRATION.getType())) {
                    int i5 = g + 109;
                    f631a = i5 % 128;
                    int i6 = i5 % 2;
                    TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
                    TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(splashscreenActivity, false, true, 2);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(SplashscreenActivity splashscreenActivity) {
        int i = 2 % 2;
        int i2 = f631a + 77;
        g = i2 % 128;
        int i3 = i2 % 2;
        splashscreenActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = g + 35;
        f631a = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SplashscreenActivity splashscreenActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = f631a + 113;
        g = i2 % 128;
        int i3 = i2 % 2;
        dialogInterface.dismiss();
        splashscreenActivity.finish();
        int i4 = f631a + 65;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Exception exc) {
        int i = 2 % 2;
        int i2 = g + 37;
        f631a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        if (i3 != 0) {
            exc.printStackTrace();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        exc.printStackTrace();
        int i4 = g + 93;
        f631a = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = g + 21;
        f631a = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = g + 113;
        f631a = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SplashscreenActivity splashscreenActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = f631a + 101;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            dialogInterface.dismiss();
            splashscreenActivity.getInterfaceDescriptor();
            int i3 = 91 / 0;
        } else {
            dialogInterface.dismiss();
            splashscreenActivity.getInterfaceDescriptor();
        }
        int i4 = f631a + 21;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        ActivityResult activityResult = (ActivityResult) objArr[0];
        int i = 2 % 2;
        int i2 = g + 15;
        f631a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(activityResult, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(activityResult, "");
        int i3 = g + 31;
        f631a = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        SplashscreenActivity splashscreenActivity = (SplashscreenActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = f631a + 39;
        g = i2 % 128;
        int i3 = i2 % 2;
        dialogInterface.dismiss();
        splashscreenActivity.finish();
        int i4 = g + 121;
        f631a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    public static /* synthetic */ Unit b(SplashscreenActivity splashscreenActivity, UserLocationComplete userLocationComplete) {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        if (userLocationComplete != null && userLocationComplete.b != 0.0d && userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != 0.0d) {
            ((PreferenceManager) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("CACHED_LATITUDE", String.valueOf(userLocationComplete.b));
            ((PreferenceManager) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("CACHED_LONGITUDE", String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            PreferenceManager preferenceManager = (PreferenceManager) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str4 = "";
            if (locationAddressInfo != null) {
                int i2 = f631a + 49;
                g = i2 % 128;
                int i3 = i2 % 2;
                str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str == null) {
                    str = "";
                }
            } else {
                str = "";
            }
            preferenceManager.saveString("CACHED_CITY", str);
            ((PreferenceManager) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("CACHED_PROVINCE", userLocationComplete.TuitionPaymentFragmentbindingInflater1());
            PreferenceManager preferenceManager2 = (PreferenceManager) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                str2 = "";
            }
            preferenceManager2.saveString("CACHED_COUNTRY", str2);
            PreferenceManager preferenceManager3 = (PreferenceManager) splashscreenActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
                int i4 = f631a + 121;
                g = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str4 = str3;
            }
            preferenceManager3.saveString("CACHED_FULL_ADDRESS", str4);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void asInterface(SplashscreenActivity splashscreenActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        dialogInterface.dismiss();
        splashscreenActivity.d.launch(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        int i2 = f631a + 93;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void asBinder(SplashscreenActivity splashscreenActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = f631a + 63;
        g = i2 % 128;
        int i3 = i2 % 2;
        dialogInterface.dismiss();
        splashscreenActivity.getInterfaceDescriptor();
        int i4 = f631a + 73;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SplashscreenActivity splashscreenActivity, ActivityResult activityResult) throws Throwable {
        int i = 2 % 2;
        int i2 = f631a + 105;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (i3 != 0) {
            splashscreenActivity.cancelAll();
        } else {
            splashscreenActivity.cancelAll();
            int i4 = 86 / 0;
        }
    }

    public static /* synthetic */ void g(SplashscreenActivity splashscreenActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        dialogInterface.dismiss();
        try {
            splashscreenActivity.a.launch(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
            int i2 = g + 83;
            f631a = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Exception unused) {
            splashscreenActivity.a.launch(new Intent("android.settings.SETTINGS"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r13 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r13 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        new androidx.appcompat.app.AlertDialog.Builder(r12).setTitle(r12.getString(com.bpjstku.R.string.permission_location_title)).setMessage(r12.getString(com.bpjstku.R.string.permission_location_denied_message)).setPositiveButton(r12.getString(com.bpjstku.R.string.action_settings), new defpackage.onImageAvailable(r12)).setNegativeButton(r12.getString(com.bpjstku.R.string.action_exit), new defpackage.ZslControlImpl1(r12)).setCancelable(false).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final com.bpjstku.presentation.splash.SplashscreenActivity r12, java.util.Map r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.splash.SplashscreenActivity.TuitionPaymentFragmentbindingInflater1(com.bpjstku.presentation.splash.SplashscreenActivity, java.util.Map):void");
    }

    public static /* synthetic */ void b(SplashscreenActivity splashscreenActivity, DialogInterface dialogInterface) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1163190290, new Object[]{splashscreenActivity, dialogInterface}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1163190290);
    }

    public static /* synthetic */ void b(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -825408883, new Object[]{function1, obj}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 825408888);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(SplashscreenActivity splashscreenActivity, DialogInterface dialogInterface) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1567518969, new Object[]{splashscreenActivity, dialogInterface}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1567518968);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityResult activityResult) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1684707913, new Object[]{activityResult}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1684707916);
    }

    public static /* synthetic */ void a(SplashscreenActivity splashscreenActivity, DialogInterface dialogInterface) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1963602137, new Object[]{splashscreenActivity, dialogInterface}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1963602144);
    }

    static {
        INotificationSideChannel = 0;
        g();
        INSTANCE = new Companion(null);
        int i = notify + 67;
        INotificationSideChannel = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(SplashscreenActivity splashscreenActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1702431192, new Object[]{splashscreenActivity}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1702431198);
    }

    private final void INotificationSideChannel() {
        int iTuitionPaymentFragmentbindingInflater1 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1186304534, new Object[]{this}, (-882456223) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gopay_transaction).substring(0, 6).length(), iTuitionPaymentFragmentbindingInflater1, (-1570561872) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, 1186304538);
    }

    private final void INotificationSideChannelDefault() {
        int iTuitionPaymentFragmentbindingInflater1 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1539750932, new Object[]{this}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentbindingInflater1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1539750934);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = f631a + 89;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f631a + 85;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = g + 75;
        f631a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g + 87;
        f631a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 49;
        f631a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    static void g() {
        asBinder = new char[]{59709, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59757, 59756, 59746, 59696, 59761, 59767, 59764, 59786, 59772, 59775, 59751, 59751, 59774, 59766, 59785, 59762, 59772, 59762, 59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r8 = r8 + 99
            byte[] r0 = com.bpjstku.presentation.splash.SplashscreenActivity.$$c
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.splash.SplashscreenActivity.$$i(short, byte, int):java.lang.String");
    }
}
