package com.bpjstku.presentation.membership.login;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.view.OnBackPressedCallback;
import com.airbnb.lottie.LottieAnimationView;
import com.bpjstku.R;
import com.bpjstku.data.bsu.model.BsuConfig;
import com.bpjstku.data.config.model.RegisterParticipantConfig;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.bpjstku.databinding.LayoutBottomSheetRegisterParticipantBinding;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.maintenance.MaintenanceActivity;
import com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity;
import com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity;
import com.bpjstku.presentation.membership.forgotpassword.inputemail.ForgotPasswordActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.registration.ChooseNationalityActivity;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseException;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.Gson;
import com.midtrans.sdk.corekit.core.Constants;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.Camera2CameraControlExternalSyntheticLambda4;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.DecorContentParent;
import defpackage.ExperimentalCamera2Interop;
import defpackage.LayoutSettings;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.OutputConfigurationCompatApi33Impl;
import defpackage.TargetAspectRatio;
import defpackage.UseFlashModeTorchFor3aUpdate;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.acquireBuffer;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.getBuffer;
import defpackage.getCameraState;
import defpackage.getConfigs;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.getOpticalInsets;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.onRestoreInstanceState;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import defpackage.setSessionCaptureCallback;
import defpackage.setSurfaceAspectRatio;
import defpackage.unregisterLifecycle;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001c\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0015\u0010\u001f\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0015\u0010!\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\b\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010\t\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b!\u0010)R\u0018\u0010\u0007\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010,R\u0016\u0010\r\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010&R\u0016\u0010\n\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010.R\u0016\u0010\u000e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010.R\u0016\u0010/\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010.R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010.R\u0016\u0010\u000b\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010.R\u0016\u0010%\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u0010\f\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010.R \u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0002028UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u00104R\u0014\u00108\u001a\u0002068UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00107"}, d2 = {"Lcom/bpjstku/presentation/membership/login/LoginActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityLoginBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "INotificationSideChannel", "", "p0", "p1", "p2", "(Ljava/lang/String;)V", "onDestroy", "d_", "LOutputConfigurationCompatApi33Impl;", "RemoteActionCompatParcelizer", "LOutputConfigurationCompatApi33Impl;", "LgetOpticalInsets;", "onTransact", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/lib/PreferenceManager;", "INotificationSideChannelDefault", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LoutputFormatToAudioProfile;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LacquireBuffer;", "LacquireBuffer;", "", "INotificationSideChannelStub", "Z", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/RelativeLayout;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "g", "Landroid/net/Uri;", "Landroid/net/Uri;", "connect", "Ljava/lang/String;", "notify", "cancel", "cancelAll", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "read", "", "()I", "write"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoginActivity extends BindingReactiveFormActivity<ActivityLoginBinding> {
    private static int IconCompatParcelizer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int getExtras;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private boolean asInterface;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private OutputConfigurationCompatApi33Impl b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private BottomSheetBehavior<RelativeLayout> g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String onTransact;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private boolean d;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private Uri asBinder;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {111, 40, 23, -13};
    private static final int $$f = 146;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {123, -2, -101, -104, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 22;
    private static int MediaBrowserCompat = 0;
    private static int read = 0;
    private static int write = 1;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: DialogTitle
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new acquireBuffer();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String a = "";

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String INotificationSideChannel = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String notify = "";

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String INotificationSideChannelDefault = "";

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String INotificationSideChannelStubProxy = "";

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private String INotificationSideChannelStub = "";

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private String getInterfaceDescriptor = "";

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i2) | i7);
        int i9 = ~i;
        int i10 = ~(i9 | i3);
        int i11 = ~(i7 | i);
        int i12 = i8 | i10 | i11;
        int i13 = ~(i9 | i7 | i2);
        int i14 = (~(i2 | i7)) | i10 | i11;
        int i15 = i + i3 + i4 + (2052055731 * i6) + (1687666023 * i5);
        int i16 = i15 * i15;
        int i17 = (i * (-1966771951)) + 1000013824 + ((-1966771951) * i3) + ((-617538080) * i12) + ((-926307120) * i13) + (308769040 * i14) + (2019426304 * i4) + (632946688 * i6) + ((-741212160) * i5) + (2121465856 * i16);
        int i18 = (i * 1533266457) + 1248777597 + (i3 * 1533266457) + (i12 * (-800)) + (i13 * (-1200)) + (i14 * 400) + (i4 * 1533266057) + (i6 * 706030027) + (i5 * 1023530015) + (i16 * (-2088042496));
        switch (i17 + (i18 * i18 * 1434255360)) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 2:
                LoginActivity loginActivity = (LoginActivity) objArr[0];
                int i19 = 2 % 2;
                TextInputLayout textInputLayout = loginActivity.INotificationSideChannelStub().tilPassword;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
                String string = loginActivity.getString(R.string.error_field_required);
                Intrinsics.checkNotNullExpressionValue(string, "");
                loginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
                TextInputLayout textInputLayout2 = loginActivity.INotificationSideChannelStub().tilEmail;
                Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
                String string2 = loginActivity.getString(R.string.error_field_required);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string2);
                String string3 = loginActivity.getString(R.string.error_email_invalid);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                loginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string3)})));
                int i20 = read + 35;
                write = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 4:
                return b(objArr);
            case 5:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return d(objArr);
            case 8:
                return g(objArr);
            default:
                return TuitionPaymentFragmentbindingInflater1(objArr);
        }
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
    private static void c(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = 144 - r6
            int r0 = r5 + 1
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = com.bpjstku.presentation.membership.login.LoginActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r6]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.login.LoginActivity.c(int, short, short, java.lang.Object[]):void");
    }

    public LoginActivity() {
        final LoginActivity loginActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<getOpticalInsets>() { // from class: com.bpjstku.presentation.membership.login.LoginActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getOpticalInsets] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getOpticalInsets invoke() {
                LifecycleOwner lifecycleOwner = loginActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getOpticalInsets.class);
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
        final LoginActivity loginActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.login.LoginActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = loginActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ BottomSheetBehavior a(LoginActivity loginActivity) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 43;
        read = i3 % 128;
        int i4 = i3 % 2;
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior = loginActivity.g;
        int i5 = i2 + 87;
        read = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return bottomSheetBehavior;
    }

    public static final /* synthetic */ ActivityLoginBinding d(LoginActivity loginActivity) {
        int i = 2 % 2;
        int i2 = write + 19;
        read = i2 % 128;
        int i3 = i2 % 2;
        ActivityLoginBinding activityLoginBindingINotificationSideChannelStub = loginActivity.INotificationSideChannelStub();
        if (i3 == 0) {
            return activityLoginBindingINotificationSideChannelStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.login.LoginActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/bpjstku/presentation/membership/login/LoginActivity$b;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, Uri uri, boolean z, int i) {
            if ((i & 2) != 0) {
                uri = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) LoginActivity.class);
            intent.putExtra("key_menu_event", uri);
            intent.putExtra("key_session_expire", z);
            intent.addFlags(268468224);
            context.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityLoginBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = write + 21;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            LoginActivity$bindingInflater$1 loginActivity$bindingInflater$1 = LoginActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            throw null;
        }
        LoginActivity$bindingInflater$1 loginActivity$bindingInflater$2 = LoginActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = write + 89;
        read = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 98 / 0;
        }
        return loginActivity$bindingInflater$2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0183  */
    /* JADX WARN: Code duplicated, block: B:42:0x0184  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(IconCompatParcelizer)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) + 3291, TextUtils.lastIndexOf("", '0') + 32, 1199271174, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 651 - View.MeasureSpec.getSize(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 44, -450685997, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
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
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i7 = $11 + 77;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (!(!z)) {
            int i9 = $10 + 77;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getSize(0), Process.getGidForName("") + 652, 44 - KeyEvent.keyCodeFromString(""), -450685997, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i10 = $11 + 29;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                i4 = 29209604;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r1
  0x0038: PHI (r1v9 android.content.Intent) = (r1v7 android.content.Intent), (r1v18 android.content.Intent) binds: [B:9:0x0036, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        Intent intent;
        boolean booleanExtra;
        int i = 2 % 2;
        int i2 = write + 27;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            this.asBinder = (Uri) getIntent().getParcelableExtra("key_menu_event");
            intent = getIntent();
            if (intent != null) {
                booleanExtra = intent.getBooleanExtra("key_session_expire", false);
            } else {
                booleanExtra = true;
            }
        } else {
            this.asBinder = (Uri) getIntent().getParcelableExtra("key_menu_event");
            intent = getIntent();
            if (intent != null) {
                booleanExtra = intent.getBooleanExtra("key_session_expire", false);
            } else {
                booleanExtra = false;
            }
        }
        this.d = booleanExtra;
        int i3 = read + 99;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 90 / 0;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends BottomSheetBehavior.BottomSheetCallback {
        private /* synthetic */ LayoutBottomSheetRegisterParticipantBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ LoginActivity b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutBottomSheetRegisterParticipantBinding layoutBottomSheetRegisterParticipantBinding, LoginActivity loginActivity) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = layoutBottomSheetRegisterParticipantBinding;
            this.b = loginActivity;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onStateChanged(View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.viewBottomSheetRegistrationParticipant.setVisibility(8);
                return;
            }
            if (i == 6) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.containerChooseMembership.setVisibility(0);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.viewBottomSheetRegistrationParticipant.setVisibility(8);
            } else if (i == 3) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.containerChooseMembership.setVisibility(0);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.viewBottomSheetRegistrationParticipant.setVisibility(8);
                this.b.getWindow().getDecorView().setSystemUiVisibility(1792);
            } else {
                if (i != 4) {
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.containerChooseMembership.setVisibility(8);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.viewBottomSheetRegistrationParticipant.setVisibility(0);
                this.b.getWindow().getDecorView().setSystemUiVisibility(256);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onSlide(View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.viewBottomSheetRegistrationParticipant.setAlpha(1.0f - f);
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        Object objM8024constructorimpl;
        int i;
        boolean z;
        Object objM8024constructorimpl2;
        int i2 = 2 % 2;
        TextInputEditText textInputEditText = INotificationSideChannelStub().edtEmail;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        LoginActivity loginActivity = this;
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputEditText, loginActivity);
        TextInputEditText textInputEditText2 = INotificationSideChannelStub().edtPassword;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputEditText2, loginActivity);
        setSessionCaptureCallback setsessioncapturecallback = setSessionCaptureCallback.INSTANCE;
        this.RemoteActionCompatParcelizer = setSessionCaptureCallback.b(loginActivity);
        setSessionCaptureCallback setsessioncapturecallback2 = setSessionCaptureCallback.INSTANCE;
        this.INotificationSideChannelDefault = setSessionCaptureCallback.b();
        setSessionCaptureCallback setsessioncapturecallback3 = setSessionCaptureCallback.INSTANCE;
        this.INotificationSideChannelStubProxy = setSessionCaptureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.INotificationSideChannelStub = setSessionCaptureCallback.INSTANCE.TuitionPaymentFragmentbindingInflater1(loginActivity);
        ExperimentalCamera2Interop.INSTANCE.b(loginActivity, new Function1() { // from class: fixDrawable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: setNavigationIcon
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(INotificationSideChannelStub().getRoot(), new OnApplyWindowInsetsListener() { // from class: getVisibility
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view, windowInsetsCompat);
            }
        });
        getOnBackPressedDispatcher().addCallback(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        String strOnTransact = getMaxImages.onTransact();
        try {
            Result.Companion companion = Result.INSTANCE;
            LoginActivity loginActivity2 = this;
            objM8024constructorimpl = Result.m8024constructorimpl((BsuConfig) new Gson().fromJson(strOnTransact, BsuConfig.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8031isSuccessimpl(objM8024constructorimpl)) {
            final BsuConfig bsuConfig = (BsuConfig) objM8024constructorimpl;
            if (bsuConfig == null || !bsuConfig.getAppBsuLogin()) {
                INotificationSideChannel();
            } else {
                final MaterialButton materialButton = INotificationSideChannelStub().btnBsu;
                materialButton.setVisibility(0);
                materialButton.setText(bsuConfig.getAppBsuText());
                materialButton.setOnClickListener(new View.OnClickListener() { // from class: getViewGroup
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginActivity.TuitionPaymentFragmentbindingInflater1(1757564663, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1757564663, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, materialButton, bsuConfig, view}, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    }
                });
            }
        }
        if (Result.m8027exceptionOrNullimpl(objM8024constructorimpl) != null) {
            INotificationSideChannel();
        }
        INotificationSideChannelStub().edtEmail.setText(((getOpticalInsets) this.TuitionPaymentFragmentbindingInflater1.getValue()).b.b());
        if (this.d) {
            int i3 = read + 95;
            write = i3 % 128;
            int i4 = i3 % 2;
            getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
            String string = getString(R.string.error_message_session_expire);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_information, "", string, string2, null, 112);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        final LayoutBottomSheetRegisterParticipantBinding layoutBottomSheetRegisterParticipantBinding = INotificationSideChannelStub().layoutBottomSheetRegisterParticipant;
        int i5 = 8;
        try {
            Group group = layoutBottomSheetRegisterParticipantBinding.groupIndonesianMigrantWorker;
            getMaxImages getmaximages2 = getMaxImages.INSTANCE;
            group.setVisibility(Intrinsics.areEqual(getMaxImages.MediaBrowserCompatMediaBrowserImplApi214(), "true") ? 0 : 8);
        } catch (FirebaseException unused) {
            layoutBottomSheetRegisterParticipantBinding.groupIndonesianMigrantWorker.setVisibility(8);
        } catch (Exception unused2) {
            layoutBottomSheetRegisterParticipantBinding.groupIndonesianMigrantWorker.setVisibility(8);
        }
        Group group2 = layoutBottomSheetRegisterParticipantBinding.groupSalariedWorker;
        getMaxImages getmaximages3 = getMaxImages.INSTANCE;
        if (Intrinsics.areEqual(getMaxImages.MediaBrowserCompatMediaBrowserImplApi21(), "")) {
            i = 8;
        } else {
            int i6 = write + 15;
            read = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        group2.setVisibility(i);
        layoutBottomSheetRegisterParticipantBinding.containerChooseMembership.setVisibility(8);
        RelativeLayout relativeLayout = layoutBottomSheetRegisterParticipantBinding.rlBottomSheetRegistrationParticipant;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        RelativeLayout relativeLayout2 = relativeLayout;
        BottomSheetBehavior<RelativeLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(relativeLayout2);
        this.g = bottomSheetBehaviorFrom;
        if (bottomSheetBehaviorFrom == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bottomSheetBehaviorFrom = null;
        }
        bottomSheetBehaviorFrom.setFitToContents(false);
        bottomSheetBehaviorFrom.setHalfExpandedRatio(0.6f);
        bottomSheetBehaviorFrom.setHideable(false);
        bottomSheetBehaviorFrom.setDraggable(true);
        int i8 = Resources.getSystem().getDisplayMetrics().heightPixels;
        int i9 = Resources.getSystem().getDisplayMetrics().widthPixels;
        if (i9 <= 0 || (i8 * 3) / 5 < i9 - 1) {
            z = false;
        } else {
            int i10 = read + 45;
            write = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        }
        this.asInterface = z;
        if (i9 > 0) {
            int i12 = write;
            int i13 = i12 + 71;
            read = i13 % 128;
            int i14 = i13 % 2;
            if (i8 / i9 < 1.7d) {
                int i15 = i12 + 111;
                read = i15 % 128;
                int i16 = i15 % 2;
                if (i8 < 850) {
                    INotificationSideChannelStub().tvForgotAccount.setTextSize(10.0f);
                    INotificationSideChannelStub().tvForgotPassword.setTextSize(10.0f);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = INotificationSideChannelStub().constraintLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) (((double) i8) * 0.3d);
        INotificationSideChannelStub().constraintLayout.setLayoutParams(marginLayoutParams);
        ViewCompat.setOnApplyWindowInsetsListener(relativeLayout2, new OnApplyWindowInsetsListener() { // from class: DecorToolbar
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, layoutBottomSheetRegisterParticipantBinding, view, windowInsetsCompat);
            }
        });
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior = this.g;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.addBottomSheetCallback(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(layoutBottomSheetRegisterParticipantBinding, this));
        getMaxImages getmaximages4 = getMaxImages.INSTANCE;
        String str = (String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], 464075583, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -464075571);
        try {
            Result.Companion companion4 = Result.INSTANCE;
            LoginActivity loginActivity3 = this;
            objM8024constructorimpl2 = Result.m8024constructorimpl((RegisterParticipantConfig) new Gson().fromJson(str, RegisterParticipantConfig.class));
        } catch (Throwable th2) {
            Result.Companion companion5 = Result.INSTANCE;
            objM8024constructorimpl2 = Result.m8024constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m8031isSuccessimpl(objM8024constructorimpl2)) {
            RegisterParticipantConfig registerParticipantConfig = (RegisterParticipantConfig) objM8024constructorimpl2;
            if (registerParticipantConfig != null) {
                LayoutBottomSheetRegisterParticipantBinding layoutBottomSheetRegisterParticipantBinding2 = INotificationSideChannelStub().layoutBottomSheetRegisterParticipant;
                layoutBottomSheetRegisterParticipantBinding2.groupSalariedWorker.setVisibility(registerParticipantConfig.getHidePu() ? 8 : 0);
                layoutBottomSheetRegisterParticipantBinding2.groupNonSalariedWorkerCm.setVisibility(registerParticipantConfig.getHideBpu() ? 8 : 0);
                Group group3 = layoutBottomSheetRegisterParticipantBinding2.groupIndonesianMigrantWorker;
                if (registerParticipantConfig.getHidePmi()) {
                    int i17 = read + 5;
                    write = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    int i19 = read + 29;
                    write = i19 % 128;
                    int i20 = i19 % 2;
                    i5 = 0;
                }
                group3.setVisibility(i5);
            } else {
                LayoutBottomSheetRegisterParticipantBinding layoutBottomSheetRegisterParticipantBinding3 = INotificationSideChannelStub().layoutBottomSheetRegisterParticipant;
                layoutBottomSheetRegisterParticipantBinding3.groupSalariedWorker.setVisibility(8);
                layoutBottomSheetRegisterParticipantBinding3.groupNonSalariedWorkerCm.setVisibility(0);
                layoutBottomSheetRegisterParticipantBinding3.groupIndonesianMigrantWorker.setVisibility(0);
            }
        }
        if (Result.m8027exceptionOrNullimpl(objM8024constructorimpl2) != null) {
            LayoutBottomSheetRegisterParticipantBinding layoutBottomSheetRegisterParticipantBinding4 = INotificationSideChannelStub().layoutBottomSheetRegisterParticipant;
            layoutBottomSheetRegisterParticipantBinding4.groupSalariedWorker.setVisibility(0);
            layoutBottomSheetRegisterParticipantBinding4.groupNonSalariedWorkerCm.setVisibility(0);
            layoutBottomSheetRegisterParticipantBinding4.groupIndonesianMigrantWorker.setVisibility(0);
        }
        int i21 = write + 121;
        read = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends OnBackPressedCallback {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            super(true);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() {
            try {
                if (LoginActivity.d(LoginActivity.this).layoutBottomSheetRegisterParticipant.containerChooseMembership.getVisibility() == 0) {
                    BottomSheetBehavior bottomSheetBehaviorA = LoginActivity.a(LoginActivity.this);
                    if (bottomSheetBehaviorA == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        bottomSheetBehaviorA = null;
                    }
                    bottomSheetBehaviorA.setState(4);
                    return;
                }
                LoginActivity.this.finishAndRemoveTask();
            } catch (Exception unused) {
                LoginActivity.this.finish();
            }
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements ActionMode.Callback {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i2 = i % 7273702;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentbindingInflater1;
            }
            int iMyTid = Process.myTid();
            TuitionPaymentFragmentbindingInflater1 = iMyTid;
            return iMyTid;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        LayoutBottomSheetRegisterParticipantBinding layoutBottomSheetRegisterParticipantBinding = INotificationSideChannelStub().layoutBottomSheetRegisterParticipant;
        ImageView imageView = layoutBottomSheetRegisterParticipantBinding.imgNonSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ImageView imageView2 = imageView;
        Function1 function1 = new Function1() { // from class: initIndeterminateProgress
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        imageView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        ImageView imageView3 = layoutBottomSheetRegisterParticipantBinding.imgIndonesianMigrantWorker;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: initProgress
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        ImageView imageView4 = layoutBottomSheetRegisterParticipantBinding.imgSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView4, "");
        imageView4.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setDropdownSelectedPosition
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        LottieAnimationView lottieAnimationView = layoutBottomSheetRegisterParticipantBinding.viewBottomSheetRegistrationParticipant;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setEmbeddedTabView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        RelativeLayout relativeLayout = layoutBottomSheetRegisterParticipantBinding.rlBottomSheetRegistrationParticipant;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        relativeLayout.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setNavigationContentDescription
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        final ActivityLoginBinding activityLoginBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = activityLoginBindingINotificationSideChannelStub.btnLogin;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getFixedWidthMinor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, activityLoginBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        MaterialButton materialButton2 = activityLoginBindingINotificationSideChannelStub.tvForgotPassword;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setDefaultNavigationContentDescription
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        MaterialButton materialButton3 = activityLoginBindingINotificationSideChannelStub.tvForgotAccount;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        materialButton3.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setDefaultNavigationIcon
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (View) obj);
            }
        }));
        MaterialButton materialButton4 = activityLoginBindingINotificationSideChannelStub.btnRegister;
        Intrinsics.checkNotNullExpressionValue(materialButton4, "");
        materialButton4.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setDropdownParams
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        EditText editText = activityLoginBindingINotificationSideChannelStub.tilPassword.getEditText();
        if (editText != null) {
            editText.setCustomSelectionActionModeCallback(new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        int i2 = read + 23;
        write = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        FirebaseRemoteConfig firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            int i2 = read + 9;
            write = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        if (!(!Intrinsics.areEqual(getMaxImages.getRoot(), "true"))) {
            MaintenanceActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = MaintenanceActivity.INSTANCE;
            MaintenanceActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    finishAndRemoveTask();
                    int i4 = read + 95;
                    write = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 52 / 0;
                        return;
                    }
                    return;
                }
                finish();
                return;
            } catch (Exception unused) {
                finish();
                return;
            }
        }
        getMaxImages getmaximages3 = getMaxImages.INSTANCE;
        Intrinsics.areEqual("4.17.8", getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        LoginActivity loginActivity = this;
        ((getOpticalInsets) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(loginActivity, new Observer() { // from class: getFixedHeightMajor
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((getOpticalInsets) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(loginActivity, new DecorContentParent(this));
        int i2 = write + 55;
        read = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = write + 75;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnLogin;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnLogin;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(false);
        }
        int i3 = write + 59;
        read = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = write + 109;
        read = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnLogin;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = read + 15;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004e  */
    /* JADX WARN: Code duplicated, block: B:9:0x004b A[PHI: r1
  0x004b: PHI (r1v11 android.view.ViewGroup$LayoutParams) = (r1v10 android.view.ViewGroup$LayoutParams), (r1v24 android.view.ViewGroup$LayoutParams) binds: [B:8:0x0049, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    private final void INotificationSideChannel() {
        ViewGroup.LayoutParams layoutParams;
        ConstraintLayout.LayoutParams layoutParams2;
        int i = 2 % 2;
        int i2 = read + 81;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            INotificationSideChannelStub().btnBsu.setVisibility(124);
            layoutParams = INotificationSideChannelStub().btnRegister.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            } else {
                layoutParams2 = null;
            }
        } else {
            INotificationSideChannelStub().btnBsu.setVisibility(8);
            layoutParams = INotificationSideChannelStub().btnRegister.getLayoutParams();
            if (!(!(layoutParams instanceof ConstraintLayout.LayoutParams))) {
                layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            } else {
                layoutParams2 = null;
            }
        }
        if (layoutParams2 != null) {
            layoutParams2.setMarginEnd(0);
            layoutParams2.startToStart = 0;
        }
        int i3 = read + 59;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
    }

    private final void b(String str) {
        Editable text;
        int i = 2 % 2;
        int i2 = read + 11;
        write = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = INotificationSideChannelStub().tilEmail.getEditText();
        Editable text2 = null;
        if (editText != null) {
            int i4 = write + 115;
            read = i4 % 128;
            int i5 = i4 % 2;
            text = editText.getText();
        } else {
            text = null;
        }
        String strValueOf = String.valueOf(text);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = strValueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String string = StringsKt.trim((CharSequence) lowerCase).toString();
        EditText editText2 = INotificationSideChannelStub().tilPassword.getEditText();
        if (editText2 != null) {
            int i6 = write + 23;
            read = i6 % 128;
            int i7 = i6 % 2;
            text2 = editText2.getText();
            int i8 = read + 3;
            write = i8 % 128;
            int i9 = i8 % 2;
        }
        String strValueOf2 = String.valueOf(text2);
        this.getInterfaceDescriptor = string;
        getOpticalInsets getopticalinsets = (getOpticalInsets) this.TuitionPaymentFragmentbindingInflater1.getValue();
        String string2 = Settings.Secure.getString(getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string2, "");
        String str2 = this.a;
        String str3 = this.INotificationSideChannel;
        String str4 = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        String str5 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str5, "");
        getopticalinsets.b(string, strValueOf2, string2, str2, str3, str, str4, str5);
    }

    private static /* synthetic */ Object d(Object[] objArr) throws IOException {
        LoginActivity loginActivity = (LoginActivity) objArr[0];
        int i = 2 % 2;
        int i2 = write + 23;
        read = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                loginActivity.b = null;
                loginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                obj.hashCode();
                throw null;
            }
            loginActivity.b = null;
            loginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = write + 49;
            read = i3 % 128;
            int i4 = i3 % 2;
            super.onDestroy();
            return null;
        } catch (Exception e2) {
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, "Error during LoginActivity cleanup", new Object[0]);
        }
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        LoginActivity loginActivity = (LoginActivity) objArr[0];
        int i = 2 % 2;
        int i2 = write + 105;
        read = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                loginActivity.finishAndRemoveTask();
                return null;
            }
            loginActivity.finish();
            int i4 = read + 91;
            write = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 92 / 0;
            }
            return null;
        } catch (Exception unused) {
            loginActivity.finish();
            return null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        int i;
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i2 = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i3 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int iRed = Color.red(0) + 1031;
            int i4 = 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            Object[] objArr2 = new Object[1];
            c((byte) 52, (short) 141, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iRed, i4, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 176, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 24, ((byte) KeyEvent.getModifierMetaStateMask()) + 23, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, 216 - (ViewConfiguration.getLongPressTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 106, new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
            Object[] objArr5 = new Object[1];
            c((byte) 52, (short) 89, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i5, jumpTapTimeout, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int iMyTid = (Process.myTid() >> 22) + 1031;
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b, (short) (b | 37), bArr[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, iMyTid, scrollBarSize, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            i = 3;
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i9 = (~(745396785 | i8)) | 311428490;
            int i10 = ~i8;
            int i11 = (((601776473 + (((~(i10 | (-67148321))) | i9) * 886)) + (((~((-745396786) | i10)) | 989676955) * (-1772))) + ((~(i10 | 989676955)) * 886)) - 219120851;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
        } else {
            i = 3;
            Object[] objArr8 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingaddress_empty).substring(18, 19).codePointAt(0) + 101, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_backend_liveness_is_not_configured).substring(0, 64).length() - 51, new char[]{65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 215, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_atm).substring(4, 5).codePointAt(0) - 99, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_title).substring(18, 19).codePointAt(0) - 30, new char[]{65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1619267320};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1134 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -219120851, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iRed2 = 1031 - Color.red(0);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 15;
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, (short) 141, $$a[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, iRed2, iResolveSizeAndState, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1118, 17 - View.MeasureSpec.getMode(0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[7];
                    Object[] objArr13 = new Object[1];
                    c(b2, (short) (b2 | 37), bArr2[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, minimumFlingVelocity, keyRepeatTimeout, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_3).substring(14, 15).length() + 211, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_bni).substring(14, 15).length() + 21, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(false, 216 - View.resolveSizeAndState(0, 0, 0), 15 - KeyEvent.keyCodeFromString(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iRed3 = 1031 - Color.red(0);
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                        Object[] objArr16 = new Object[1];
                        c((byte) 52, (short) 89, $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iRed3, scrollBarSize2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int minimumFlingVelocity2 = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, (short) 141, $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(pressedStateDuration, minimumFlingVelocity2, i14, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[i])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            while (i3 < strArr2.length) {
                arrayList.add(strArr2[i3]);
                i3++;
            }
            throw null;
        }
        Object[] objArr18 = new Object[4];
        objArr18[1] = new int[]{i};
        objArr18[2] = new int[1];
        objArr18[i] = new int[]{i};
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[i])[0];
        int i17 = ((int[]) objArr[1])[0];
        objArr18[0] = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i18 = i15 + (-852311239) + (((~((-79245392) | iIdentityHashCode)) | (-165034779)) * (-964)) + (((~((~iIdentityHashCode) | (-79245392))) | 69795909) * (-964));
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        int i21 = write + 31;
        read = i21 % 128;
        int i22 = i21 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
            int iRed4 = 1755 - Color.red(0);
            int i23 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            byte b3 = (byte) 37;
            Object[] objArr19 = new Object[1];
            c(b3, b3, $$a[7], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mirror, iRed4, i23, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char offsetAfter = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                Object[] objArr20 = new Object[1];
                c((byte) 52, (short) 89, $$a[7], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetAfter, iIndexOf, longPressTimeout, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[5];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0] = new int[]{i};
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1] = new int[]{i};
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[i] = new int[1];
            int i24 = ((int[]) objArr21[0])[0];
            int i25 = ((int[]) objArr21[1])[0];
            String[] strArr3 = (String[]) objArr21[4];
            Object[] objArr22 = (Object[]) objArr21[2];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4] = strArr3;
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2] = objArr22;
            int i26 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i27 = (((-1589546847) + ((930901726 | i26) * 184)) + (((~(i26 | 857239192)) | 359927494) * 184)) - 169998931;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[i])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 175, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, 13 - TextUtils.getCapsMode("", 0, 0), new char[]{65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(true, Drawable.resolveOpacity(0, 0) + 215, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step4).substring(39, 42).codePointAt(0) - 81, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 109, new char[]{65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1619267320};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1726, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -169998931, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 1755;
                int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                Object[] objArr26 = new Object[1];
                c((byte) 52, (short) 89, $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, deadChar, doubleTapTimeout, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bca_klikpay).substring(0, 11).codePointAt(9) + 115, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_permata).substring(1, i).length() + 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(false, (ViewConfiguration.getTapTimeout() >> 16) + 216, 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step5).substring(8, 9).length() + 10, new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                    int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                    short s = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, s, (byte) s, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(modifierMetaStateMask, iIndexOf2, tapTimeout, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                    int iResolveSizeAndState2 = 23 - View.resolveSizeAndState(0, 0, 0);
                    byte b4 = (byte) 37;
                    Object[] objArr30 = new Object[1];
                    c(b4, b4, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, iIndexOf3, iResolveSizeAndState2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i31 != i30) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr4 != null) {
                while (i3 < strArr4.length) {
                    int i32 = write + 13;
                    read = i32 % 128;
                    if (i32 % 2 != 0) {
                        arrayList2.add(strArr4[i3]);
                        i3 += 108;
                    } else {
                        arrayList2.add(strArr4[i3]);
                        i3++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i31));
        }
        int i33 = read + 87;
        write = i33 % 128;
        int i34 = i33 % 2;
        Object[] objArr31 = new Object[5];
        objArr31[0] = new int[]{i};
        objArr31[1] = new int[]{i};
        objArr31[i] = new int[1];
        int i35 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[i])[0];
        int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
        Object[] objArr32 = (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2];
        objArr31[4] = strArr5;
        objArr31[2] = objArr32;
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step1).substring(24, 34).length() + 925222400;
        int i38 = ~length;
        int i39 = i35 + 1541093546 + (((~((-728938473) | i38)) | (-516336047)) * 519) + (((~(i38 | (-172138921))) | (~((-344197127) | length))) * (-519)) + (((~(length | (-516336047))) | 728938472) * 519);
        int i40 = (i39 << 13) ^ i39;
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr31[i])[0] = i41 ^ (i41 << 5);
        int i42 = write + 85;
        read = i42 % 128;
        if (i42 % 2 != 0) {
            int i43 = 56 / 0;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -304791073
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.login.LoginActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = write + 15;
        read = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != ((((~(1437593021 | i5)) | (~((-1099170817) | iIdentityHashCode))) * 988) - 1141398476) + (((~(iIdentityHashCode | 1168409748)) | 269183273 | (~(i5 | (-1099170817)))) * 988)) {
            int[] iArr = new int[1985197933];
            iArr[1985197932] = 1;
            int i6 = 2043104508 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = read + 85;
            write = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_status_code_500).substring(13, 15).codePointAt(1) - 1913429034;
        int i10 = ~iCodePointAt;
        int i11 = (~((-2036259348) | i10)) | 1493471250 | (~(542796617 | i10));
        if (i9 != (-1041196312) + (((~(iCodePointAt | (-8521))) | i11) * 590) + (i11 * (-1180)) + (((~((-542796618) | i10)) | (~(i10 | 2036259347))) * 590)) {
            throw new RuntimeException("2120453629");
        }
        super.onStart();
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = read + 27;
        write = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 1193951072 + (((~((-1023507291) | i5)) | 193519747) * (-328)) + ((iIdentityHashCode | 193519747) * 164) + (((~(iIdentityHashCode | 1023507290)) | 42500225 | (~(i5 | (-872487769)))) * 164)) {
            throw new RuntimeException("-559458447");
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i6 != (((~((~iElapsedRealtime) | 2130699759)) * 130) - 51198936) + (((~(iElapsedRealtime | 2130699759)) | 3448842) * 130)) {
            throw null;
        }
        super.onCreate(bundle);
        int i7 = read + 107;
        write = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        Unit unit;
        LoginActivity loginActivity = (LoginActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = read + 59;
        write = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
            TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(loginActivity, true, false, 111);
            unit = Unit.INSTANCE;
        } else {
            TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion2 = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
            TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(loginActivity, false, false, 6);
            unit = Unit.INSTANCE;
        }
        int i4 = read + 125;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ WindowInsetsCompat TuitionPaymentFragmentspecialinlinedviewModeldefault2(LoginActivity loginActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        view.setPadding(0, 0, 0, 0);
        CoordinatorLayout root = loginActivity.INotificationSideChannelStub().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        int childCount = root.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            int i3 = write + 71;
            read = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = root.getChildAt(i2) instanceof NestedScrollView;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            View childAt = root.getChildAt(i2);
            if (childAt instanceof NestedScrollView) {
                NestedScrollView nestedScrollView = (NestedScrollView) childAt;
                nestedScrollView.setPadding(0, 0, 0, 0);
                nestedScrollView.setClipToPadding(false);
                break;
            }
            i2++;
            int i4 = read + 79;
            write = i4 % 128;
            int i5 = i4 % 2;
        }
        ViewGroup.LayoutParams layoutParams = loginActivity.INotificationSideChannelStub().constraintLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0;
        loginActivity.INotificationSideChannelStub().constraintLayout.setLayoutParams(marginLayoutParams);
        return windowInsetsCompat;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(LoginActivity loginActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_forgot_password", "forgot_password"));
        Intrinsics.checkNotNullParameter(loginActivity, "");
        Intrinsics.checkNotNullParameter("forgot_password", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("forgot_password", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("forgot_password", mapMutableMapOf);
        ForgotPasswordActivity.Companion tuitionPaymentFragmentbindingInflater1 = ForgotPasswordActivity.INSTANCE;
        ForgotPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(loginActivity);
        Unit unit = Unit.INSTANCE;
        int i2 = read + 107;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(final LoginActivity loginActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = read + 111;
            write = i2 % 128;
            int i3 = i2 % 2;
            loginActivity.MediaBrowserCompat();
            return;
        }
        Object obj = null;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                loginActivity.IconCompatParcelizer();
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String string = loginActivity.getString(R.string.label_name_information);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string2 = loginActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_login_failed, string, strValueOf, string2);
                FragmentManager supportFragmentManager = loginActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i4 = read + 25;
                    write = i4 % 128;
                    if (i4 % 2 != 0) {
                        getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        return;
                    } else {
                        getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        obj.hashCode();
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        int i5 = read + 97;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            loginActivity.IconCompatParcelizer();
            boolean z = ((onRestoreInstanceState) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        loginActivity.IconCompatParcelizer();
        final onRestoreInstanceState onrestoreinstancestate = (onRestoreInstanceState) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (!(!onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(loginActivity, null, loginActivity.asBinder, 2);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    loginActivity.finishAndRemoveTask();
                    return;
                } else {
                    loginActivity.finish();
                    return;
                }
            } catch (Exception unused) {
                loginActivity.finish();
                return;
            }
        }
        if (Intrinsics.areEqual(onrestoreinstancestate.asBinder, "-1")) {
            OutputConfigurationCompatApi33Impl.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = OutputConfigurationCompatApi33Impl.INSTANCE;
            String str = onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str == null) {
                int i6 = read + 101;
                write = i6 % 128;
                int i7 = i6 % 2;
                str = "Perangkat Terhubung";
            }
            String str2 = str;
            String str3 = onrestoreinstancestate.TuitionPaymentFragmentbindingInflater1;
            if (str3 == null) {
                int i8 = write + 93;
                read = i8 % 128;
                int i9 = i8 % 2;
                str3 = "Akun Anda terhubung dengan perangkat lain. Silakan putuskan koneksi untuk melanjutkan.";
            }
            OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.ic_login_failed, str2, str3, "Lanjutkan", new Function0() { // from class: setDecorPadding
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, onrestoreinstancestate);
                }
            }, "Kembali", new Function0() { // from class: ContentFrameLayoutOnAttachListener
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LoginActivity.asBinder(this.TuitionPaymentFragmentbindingInflater1);
                }
            }, true);
            loginActivity.b = outputConfigurationCompatApi33ImplB;
            FragmentManager supportFragmentManager2 = loginActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
            if (supportFragmentManager2.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i10 = read + 99;
                write = i10 % 128;
                if (i10 % 2 != 0) {
                    outputConfigurationCompatApi33ImplB.show(supportFragmentManager2, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    return;
                } else {
                    outputConfigurationCompatApi33ImplB.show(supportFragmentManager2, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    obj.hashCode();
                    throw null;
                }
            }
            return;
        }
        if (Intrinsics.areEqual(onrestoreinstancestate.asBinder, "-2")) {
            OutputConfigurationCompatApi33Impl.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = OutputConfigurationCompatApi33Impl.INSTANCE;
            String string3 = loginActivity.getString(R.string.label_forgot_account);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB2 = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.ic_login_failed, "Anda telah mencapai batas maksimal percobaan login", "Informasi login yang Anda masukkan tidak sesuai. Silakan gunakan fitur Lupa Akun untuk pemulihan akses atau kunjungi Kantor Cabang terdekat untuk bantuan lebih lanjut.", string3, new Function0() { // from class: setAttachListener
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LoginActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }, loginActivity.getString(R.string.action_halaman_awal), new Function0() { // from class: getMinWidthMinor
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LoginActivity.g();
                }
            }, true);
            loginActivity.b = outputConfigurationCompatApi33ImplB2;
            FragmentManager supportFragmentManager3 = loginActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager3, "");
            if (supportFragmentManager3.findFragmentByTag(outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                outputConfigurationCompatApi33ImplB2.show(supportFragmentManager3, outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                return;
            }
            return;
        }
        getCameraState.Companion bVar2 = getCameraState.INSTANCE;
        String string4 = onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (string4 == null) {
            int i11 = read + 113;
            write = i11 % 128;
            if (i11 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(loginActivity.getString(R.string.label_name_information), "");
                throw null;
            }
            string4 = loginActivity.getString(R.string.label_name_information);
            Intrinsics.checkNotNullExpressionValue(string4, "");
        }
        String str4 = onrestoreinstancestate.TuitionPaymentFragmentbindingInflater1;
        if (str4 == null) {
            str4 = "Terjadi kesalahan, silakan coba lagi.";
        }
        String string5 = loginActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        getCameraState getcamerastateB2 = getCameraState.Companion.b(R.drawable.ic_login_failed, string4, str4, string5);
        FragmentManager supportFragmentManager4 = loginActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager4, "");
        if (supportFragmentManager4.findFragmentByTag(getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getcamerastateB2.show(supportFragmentManager4, getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(LoginActivity loginActivity, onRestoreInstanceState onrestoreinstancestate) {
        int i = 2 % 2;
        int i2 = read + 19;
        write = i2 % 128;
        int i3 = i2 % 2;
        TermsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = TermsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentbindingInflater1;
        TermsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(loginActivity, loginActivity.getInterfaceDescriptor, onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3, onrestoreinstancestate.TuitionPaymentFragmentbindingInflater1);
        Unit unit = Unit.INSTANCE;
        int i4 = write + 1;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = write + 47;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
        } else {
            function1.invoke(obj);
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        LoginActivity loginActivity = (LoginActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_forgot_account", "forgot_account"));
        Intrinsics.checkNotNullParameter(loginActivity, "");
        Intrinsics.checkNotNullParameter("forgot_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("forgot_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("forgot_account", mapMutableMapOf);
        ChooseNationalityActivationActivity.Companion bVar = ChooseNationalityActivationActivity.INSTANCE;
        ChooseNationalityActivationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(loginActivity);
        Unit unit = Unit.INSTANCE;
        int i2 = read + 99;
        write = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ Unit b(LoginActivity loginActivity) {
        int i = 2 % 2;
        int i2 = read + 95;
        write = i2 % 128;
        int i3 = i2 % 2;
        ChooseNationalityActivationActivity.Companion bVar = ChooseNationalityActivationActivity.INSTANCE;
        ChooseNationalityActivationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(loginActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = write + 87;
        read = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ WindowInsetsCompat TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity loginActivity, LayoutBottomSheetRegisterParticipantBinding layoutBottomSheetRegisterParticipantBinding, View view, WindowInsetsCompat windowInsetsCompat) {
        int dimensionPixelSize;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = read + 79;
        write = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), insets.bottom);
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior = loginActivity.g;
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            int i6 = read + 99;
            write = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                bottomSheetBehavior2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            bottomSheetBehavior = null;
        }
        if (loginActivity.asInterface) {
            dimensionPixelSize = loginActivity.getResources().getDimensionPixelSize(R.dimen.dimen_140dp);
            i = insets.bottom;
        } else {
            dimensionPixelSize = loginActivity.getResources().getDimensionPixelSize(R.dimen.dimen_105dp);
            i = insets.bottom;
        }
        bottomSheetBehavior.setPeekHeight(dimensionPixelSize + i);
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior3 = loginActivity.g;
        if (bottomSheetBehavior3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            bottomSheetBehavior2 = bottomSheetBehavior3;
        }
        bottomSheetBehavior2.setExpandedOffset(insets.top);
        AppCompatTextView appCompatTextView = layoutBottomSheetRegisterParticipantBinding.tvDescriptionRegisterParticipant;
        if (loginActivity.asInterface) {
            i2 = 0;
        } else {
            int i7 = write + 49;
            read = i7 % 128;
            i2 = i7 % 2 != 0 ? 36 : 8;
        }
        appCompatTextView.setVisibility(i2);
        int i8 = read + 57;
        write = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 77 / 0;
        }
        return windowInsetsCompat;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity loginActivity, View view) {
        int i = 2 % 2;
        int i2 = read + 113;
        write = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            LoginActivity loginActivity2 = loginActivity;
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(loginActivity2, getMaxImages.MediaBrowserCompatMediaBrowserImplApi21(), "Pendaftaran PU", 1, null, false, 116);
            return Unit.INSTANCE;
        }
        WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
        LoginActivity loginActivity3 = loginActivity;
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(loginActivity3, getMaxImages.MediaBrowserCompatMediaBrowserImplApi21(), "Pendaftaran PU", 0, null, false, 56);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity loginActivity) throws IOException {
        int i = 2 % 2;
        int i2 = read + 95;
        write = i2 % 128;
        int i3 = i2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) loginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null) {
            loginActivity.a = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            loginActivity.INotificationSideChannel = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            loginActivity.notify = camera2CameraControlExternalSyntheticLambda4B.b;
            loginActivity.onTransact = camera2CameraControlExternalSyntheticLambda4B.g;
            loginActivity.cancel = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            loginActivity.cancelAll = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = loginActivity.a;
            String str2 = loginActivity.INotificationSideChannel;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
            int i4 = read + 103;
            write = i4 % 128;
            int i5 = i4 % 2;
        } else {
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        LoginActivity loginActivity = (LoginActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", "register_account"));
        Intrinsics.checkNotNullParameter(loginActivity, "");
        Intrinsics.checkNotNullParameter("register_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("register_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("register_account", mapMutableMapOf);
        ChooseNationalityActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = ChooseNationalityActivity.INSTANCE;
        ChooseNationalityActivity.Companion.b(loginActivity);
        Unit unit = Unit.INSTANCE;
        int i2 = write + 101;
        read = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ Unit g(LoginActivity loginActivity, View view) {
        int i = 2 % 2;
        int i2 = write + 29;
        read = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            LoginActivity loginActivity2 = loginActivity;
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(loginActivity2, getMaxImages.MediaBrowserCompatMediaBrowserImplApi211(), "Pendaftaran PMI", 1, null, false, 37);
            return Unit.INSTANCE;
        }
        WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
        LoginActivity loginActivity3 = loginActivity;
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(loginActivity3, getMaxImages.MediaBrowserCompatMediaBrowserImplApi211(), "Pendaftaran PMI", 0, null, false, 56);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final LoginActivity loginActivity, Boolean bool) {
        int i = 2 % 2;
        if (bool.booleanValue()) {
            getBuffer getbuffer = getBuffer.INSTANCE;
            getBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(loginActivity, new Function1() { // from class: DrawableUtils
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LoginActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (getBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj);
                }
            }, new Function0() { // from class: canSafelyMutateDrawable
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
                }
            });
        } else {
            getBuffer getbuffer2 = getBuffer.INSTANCE;
            getBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            String str = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
            loginActivity.b(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
            int i2 = write + 23;
            read = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = read + 19;
        write = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        LoginActivity loginActivity = (LoginActivity) objArr[0];
        MaterialButton materialButton = (MaterialButton) objArr[1];
        BsuConfig bsuConfig = (BsuConfig) objArr[2];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) objArr[3]);
        try {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_bsu_login", "bsu_login"));
            Intrinsics.checkNotNullParameter(loginActivity, "");
            Intrinsics.checkNotNullParameter("bsu_login", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("bsu_login", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("bsu_login", mapMutableMapOf);
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            Context context = materialButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(context, bsuConfig.getAppLinkPortalBsu(), "BPJS Ketenagakerjaan", 0, null, false, 56);
            ViewPortBuilder.b();
            int i2 = read + 43;
            write = i2 % 128;
            int i3 = i2 % 2;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit b(LoginActivity loginActivity, getBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        int i = 2 % 2;
        int i2 = read + 3;
        write = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        String str = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
        loginActivity.b(tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
        Unit unit = Unit.INSTANCE;
        int i4 = write + 13;
        read = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2(LoginActivity loginActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(loginActivity);
        int i2 = write + 37;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return outputformattoaudioprofile;
    }

    public static /* synthetic */ Unit d(LoginActivity loginActivity, View view) {
        int i = 2 % 2;
        int i2 = write + 49;
        read = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            BottomSheetBehavior<RelativeLayout> bottomSheetBehavior2 = loginActivity.g;
            throw null;
        }
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior3 = loginActivity.g;
        if (bottomSheetBehavior3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = write + 13;
            read = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            }
        } else {
            bottomSheetBehavior = bottomSheetBehavior3;
        }
        bottomSheetBehavior.setState(3);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        LoginActivity loginActivity = (LoginActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = write + 65;
        read = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            BottomSheetBehavior<RelativeLayout> bottomSheetBehavior2 = loginActivity.g;
            throw null;
        }
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior3 = loginActivity.g;
        if (bottomSheetBehavior3 == null) {
            int i4 = write + 21;
            read = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 6 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            bottomSheetBehavior = bottomSheetBehavior3;
        }
        bottomSheetBehavior.setState(3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final LoginActivity loginActivity, ActivityLoginBinding activityLoginBinding, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_login", FirebaseAnalytics.Event.LOGIN));
        Intrinsics.checkNotNullParameter(loginActivity, "");
        Intrinsics.checkNotNullParameter(FirebaseAnalytics.Event.LOGIN, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(FirebaseAnalytics.Event.LOGIN, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(FirebaseAnalytics.Event.LOGIN, mapMutableMapOf);
        TextInputLayout textInputLayout = activityLoginBinding.tilPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(textInputLayout, loginActivity);
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(((outputFormatToAudioProfile) loginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).new AnonymousClass4(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}));
        final Function1 function1 = new Function1() { // from class: setCollapsible
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj);
            }
        };
        loginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(videoRecordEventStartCompose.subscribe(new logToString() { // from class: hasExpandedActionView
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                LoginActivity.b(function1, obj);
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = write + 13;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1 A[PHI: r1
  0x00d1: PHI (r1v8 VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2) = 
  (r1v2 VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2)
  (r1v15 VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2)
 binds: [B:27:0x008b, B:24:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0106  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final LoginActivity loginActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB;
        FragmentManager supportFragmentManager;
        getCameraState getcamerastateB;
        FragmentManager supportFragmentManager2;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 3;
        int i4 = i3 % 128;
        write = i4;
        int i5 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i6 = i4 + 75;
            read = i6 % 128;
            if (i6 % 2 != 0) {
                loginActivity.MediaBrowserCompat();
                throw null;
            }
            loginActivity.MediaBrowserCompat();
            str = "loading_login_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            loginActivity.IconCompatParcelizer();
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(loginActivity, null, loginActivity.asBinder, 2);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    loginActivity.finishAndRemoveTask();
                } else {
                    loginActivity.finish();
                }
            } catch (Exception unused) {
                loginActivity.finish();
            }
            str = "success_login_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i7 = i2 + 47;
            write = i7 % 128;
            if (i7 % 2 == 0) {
                loginActivity.IconCompatParcelizer();
                tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Mohon maaf, Anda telah memasukkan email atau password yang tidak sesuai sebanyak 3 kali", true, 2, (Object) null)) {
                    OutputConfigurationCompatApi33Impl.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = OutputConfigurationCompatApi33Impl.INSTANCE;
                    String string = loginActivity.getString(R.string.label_forgot_account);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.ic_login_failed, "Anda telah mencapai batas maksimal percobaan login", "Informasi login yang Anda masukkan tidak sesuai. Silakan gunakan fitur Lupa Akun untuk pemulihan akses atau kunjungi Kantor Cabang terdekat untuk bantuan lebih lanjut.", string, new Function0() { // from class: getDropdownSelectedPosition
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoginActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }, loginActivity.getString(R.string.action_halaman_awal), new Function0() { // from class: getDropdownItemCount
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoginActivity.cancelAll();
                        }
                    }, true);
                    loginActivity.b = outputConfigurationCompatApi33ImplB;
                    supportFragmentManager = loginActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        outputConfigurationCompatApi33ImplB.show(supportFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    getCameraState.Companion bVar = getCameraState.INSTANCE;
                    String string2 = loginActivity.getString(R.string.error_login_tittle);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    String string3 = loginActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    getcamerastateB = getCameraState.Companion.b(R.drawable.ic_login_failed, string2, strValueOf, string3);
                    supportFragmentManager2 = loginActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                    if (supportFragmentManager2.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getcamerastateB.show(supportFragmentManager2, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        int i8 = read + 65;
                        write = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }
            } else {
                loginActivity.IconCompatParcelizer();
                tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Mohon maaf, Anda telah memasukkan email atau password yang tidak sesuai sebanyak 3 kali", false, 2, (Object) null)) {
                    OutputConfigurationCompatApi33Impl.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = OutputConfigurationCompatApi33Impl.INSTANCE;
                    String string4 = loginActivity.getString(R.string.label_forgot_account);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.ic_login_failed, "Anda telah mencapai batas maksimal percobaan login", "Informasi login yang Anda masukkan tidak sesuai. Silakan gunakan fitur Lupa Akun untuk pemulihan akses atau kunjungi Kantor Cabang terdekat untuk bantuan lebih lanjut.", string4, new Function0() { // from class: getDropdownSelectedPosition
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoginActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }, loginActivity.getString(R.string.action_halaman_awal), new Function0() { // from class: getDropdownItemCount
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoginActivity.cancelAll();
                        }
                    }, true);
                    loginActivity.b = outputConfigurationCompatApi33ImplB;
                    supportFragmentManager = loginActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        outputConfigurationCompatApi33ImplB.show(supportFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    getCameraState.Companion bVar2 = getCameraState.INSTANCE;
                    String string5 = loginActivity.getString(R.string.error_login_tittle);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    String strValueOf2 = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    String string6 = loginActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    getcamerastateB = getCameraState.Companion.b(R.drawable.ic_login_failed, string5, strValueOf2, string6);
                    supportFragmentManager2 = loginActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                    if (supportFragmentManager2.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getcamerastateB.show(supportFragmentManager2, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        int i10 = read + 65;
                        write = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
            }
            str = "failure_login_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_login_result", str));
        Intrinsics.checkNotNullParameter(loginActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(LoginActivity loginActivity) {
        int i = 2 % 2;
        int i2 = read + 11;
        write = i2 % 128;
        int i3 = i2 % 2;
        ChooseNationalityActivationActivity.Companion bVar = ChooseNationalityActivationActivity.INSTANCE;
        ChooseNationalityActivationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(loginActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = read + 43;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit cancelAll() {
        int i = 2 % 2;
        int i2 = write + 79;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = read + 81;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 97 / 0;
        }
        return unit2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity loginActivity, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        loginActivity.a = String.valueOf(userLocationComplete.b);
        loginActivity.INotificationSideChannel = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        loginActivity.notify = str;
        loginActivity.onTransact = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        } else {
            int i2 = write + 119;
            read = i2 % 128;
            int i3 = i2 % 2;
        }
        loginActivity.cancel = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        loginActivity.cancelAll = str4;
        String str5 = loginActivity.a;
        String str6 = loginActivity.INotificationSideChannel;
        String str7 = loginActivity.notify;
        String str8 = loginActivity.onTransact;
        String str9 = loginActivity.cancel;
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
        int i4 = read + 49;
        write = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit asBinder(LoginActivity loginActivity) {
        int i = 2 % 2;
        Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(loginActivity, null, false, 6);
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                int i2 = write + 23;
                read = i2 % 128;
                if (i2 % 2 != 0) {
                    loginActivity.finishAndRemoveTask();
                    throw null;
                }
                loginActivity.finishAndRemoveTask();
            } else {
                loginActivity.finish();
                int i3 = write + 29;
                read = i3 % 128;
                int i4 = i3 % 2;
            }
        } catch (Exception unused) {
            loginActivity.finish();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = write + 81;
        read = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = read + 27;
        write = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(LoginActivity loginActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = write + 97;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            getBuffer getbuffer = getBuffer.INSTANCE;
            getBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            String str = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
            loginActivity.b(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
            unit = Unit.INSTANCE;
            int i3 = 93 / 0;
        } else {
            getBuffer getbuffer2 = getBuffer.INSTANCE;
            getBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault4 = getBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            String str3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str4 = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1;
            loginActivity.b(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault4.b);
            unit = Unit.INSTANCE;
        }
        int i4 = read + 57;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit b(LoginActivity loginActivity, View view) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(1475103354, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1475103349, new Object[]{loginActivity, view}, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(LoginActivity loginActivity, View view) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(-615855501, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 615855502, new Object[]{loginActivity, view}, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(LoginActivity loginActivity, View view) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(-1686011293, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1686011299, new Object[]{loginActivity, view}, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ Unit g() {
        return (Unit) TuitionPaymentFragmentbindingInflater1(1101956584, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1101956580, new Object[0], LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ Unit asInterface(LoginActivity loginActivity, View view) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(981713022, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -981713019, new Object[]{loginActivity, view}, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static {
        getExtras = 1;
        onTransact();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompat + 3;
        getExtras = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void d_() {
        TuitionPaymentFragmentbindingInflater1(1166870954, 1808944213 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_shippingcity_empty).substring(18, 19).length(), -1166870946, new Object[]{this}, setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1(), setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1(), setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 61;
        read = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 7;
        read = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_login;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        TuitionPaymentFragmentbindingInflater1(1223057503, setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1(), -1223057496, new Object[]{this}, setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_cimb_clicks).substring(1, 3).length() + 2077354634, setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        TuitionPaymentFragmentbindingInflater1(-2027521224, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2027521226, new Object[]{this}, setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1(), setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_eye_occlude).substring(0, 28).length() + 852938923);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = read + 63;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    static void onTransact() {
        IconCompatParcelizer = -83722477;
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
    private static java.lang.String $$i(short r7, short r8, byte r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.login.LoginActivity.$$c
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = r7 + 4
            int r9 = 120 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.login.LoginActivity.$$i(short, short, byte):java.lang.String");
    }
}
