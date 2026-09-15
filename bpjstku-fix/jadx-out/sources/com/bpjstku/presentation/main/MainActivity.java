package com.bpjstku.presentation.main;

import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelKt;
import androidx.view.OnBackPressedCallback;
import androidx.viewbinding.ViewBinding;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.menu.model.response.AvailabilityMenuItem;
import com.bpjstku.data.user.model.request.NotificationBadgeRequest;
import com.bpjstku.databinding.ActivityMainBinding;
import com.bpjstku.domain.mlt.model.MltItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.AccountViewModel$notificationBadge$$inlined$handleApiCall$1;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.danasiaga.DanaSiagaActivity;
import com.bpjstku.presentation.digitalcard.DigitalCardActivity;
import com.bpjstku.presentation.ewallet.EWalletActivity;
import com.bpjstku.presentation.investation.InvestmentListActivity;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.maintenance.MaintenanceActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity;
import com.bpjstku.presentation.notification.NotificationActivity;
import com.bpjstku.presentation.podcast.VideoListActivity;
import com.bpjstku.presentation.podcast.VideoPlayerActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity;
import com.bpjstku.presentation.promo.CoMarketingActivity;
import com.bpjstku.presentation.util.SertakanWebviewActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import com.bpjstku.util.enums.AppsFlyerEventEnum;
import com.bpjstku.util.enums.BpjsServiceEnum;
import com.bpjstku.util.managers.AppsFlyerManager;
import com.bpjstku.util.utils.ObserveExtKt$observeState$1;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.chip.Chip;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.messaging.FirebaseMessaging;
import com.midtrans.sdk.corekit.BuildConfig;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ActivityResultRegistryExternalSyntheticLambda1;
import defpackage.ApiCompatApi29Impl;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2CameraCoordinator;
import defpackage.CameraUseCaseAdapter;
import defpackage.EngagementSignalsCallback;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.PackageIdentityUtilsSignaturesCompat;
import defpackage.TargetAspectRatio;
import defpackage.UseFlashModeTorchFor3aUpdate;
import defpackage.VideoEncoderSession1;
import defpackage.VideoRecordEventStart;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.access000;
import defpackage.acquireBuffer;
import defpackage.appendBackupVideoProfile;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.closeMode;
import defpackage.deInitSession;
import defpackage.dumpAudioCapabilities;
import defpackage.finalizeWithError;
import defpackage.formatInterval;
import defpackage.getClipDataUrisactivity;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.getOpticalInsets;
import defpackage.getZoomControl;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSamsungJ2;
import defpackage.lambdaonVerticalScrollEvent0;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.onNestedPreFling;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.provideSurface;
import defpackage.refreshVisibility;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setCurrentRunnable;
import defpackage.setOnImageAvailableListener;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.shouldUseFlashModeTorch;
import defpackage.shouldUseTorchAsFlash;
import defpackage.stopMediaCodec;
import defpackage.suspend;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.ReadAfterEOFException;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.b;
import okhttp3.tls.internal.der.DerHeader;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\u0005J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0007\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J)\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010\u0005J\u000f\u0010%\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\u0005J\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020'H\u0016¢\u0006\u0004\b\u000f\u0010(J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020)H\u0016¢\u0006\u0004\b\n\u0010*J#\u0010-\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b-\u0010.R\u0016\u0010\n\u001a\u00020)8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0016\u0010\u0007\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0015\u0010-\u001a\u0002008CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b-\u00101R\u0017\u0010\u000f\u001a\u0004\u0018\u0001028CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b3\u00101R\u0015\u0010\b\u001a\u0002048CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b5\u00101R\u0015\u0010\u000b\u001a\u0002068CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u00101R\u0016\u0010\t\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u0015\u00108\u001a\u0002078CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b8\u00101R\u0015\u0010\f\u001a\u0002098CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b:\u00101R\u0015\u0010=\u001a\u00020;8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b<\u00101R\u0015\u0010\u0014\u001a\u00020>8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b?\u00101R\u0015\u0010<\u001a\u00020@8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bA\u00101R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010BR\u0017\u0010?\u001a\u0004\u0018\u00010C8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b=\u00101R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00020D8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010FR\u001a\u0010I\u001a\u00020\u00158\u0015X\u0095D¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\b-\u0010HR\u0016\u0010A\u001a\u00020J8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0017\u00103\u001a\u0004\u0018\u00010)8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u00101"}, d2 = {"Lcom/bpjstku/presentation/main/MainActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityMainBinding;", "Lcom/bpjstku/util/managers/AppsFlyerManager$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/content/Intent;", "p0", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Intent;)V", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "cancelAll", "onTransact", "", "p1", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "LshouldUseFlashModeTorch;", "onNewNotificationEvent", "(LshouldUseFlashModeTorch;)V", "LshouldUseTorchAsFlash;", "onMaintenanceEvent", "(LshouldUseTorchAsFlash;)V", "LCamera2CameraCoordinator;", "onUnauthorizedEvent", "(LCamera2CameraCoordinator;)V", "onNewIntent", "onResume", "onDestroy", "onBackPressed", "Lcom/bpjstku/util/managers/AppsFlyerManager$DeepLinkSource;", "(Landroid/net/Uri;Lcom/bpjstku/util/managers/AppsFlyerManager$DeepLinkSource;)V", "", "(Ljava/lang/String;)V", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/util/Map;)V", "Ljava/lang/String;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "Lcom/bpjstku/domain/user/model/User;", "getInterfaceDescriptor", "LoutputFormatToAudioProfile;", "RemoteActionCompatParcelizer", "LacquireBuffer;", "LgetOpticalInsets;", "g", "Laccess000;", "INotificationSideChannel", "LlambdaonVerticalScrollEvent0;", "notify", "d", "LPackageIdentityUtilsSignaturesCompat;", "cancel", "LApiCompatApi29Impl;", "INotificationSideChannelDefault", "Landroid/net/Uri;", "LsetCurrentRunnable;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "I", "()I", "INotificationSideChannelStub", "Lcom/bpjstku/util/managers/AppsFlyerManager;", "Lcom/bpjstku/util/managers/AppsFlyerManager;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainActivity extends BindingBaseActivity<ActivityMainBinding> implements AppsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
    private static char[] INotificationSideChannelStub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int read;
    private static char write;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Lazy notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private AppsFlyerManager INotificationSideChannelDefault;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy asInterface;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private Uri cancelAll;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy onTransact;
    private final Lazy g;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy d;
    private static final byte[] $$c = {58, 66, -1, 15};
    private static final int $$f = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {89, 107, -36, -112, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 53;
    private static int MediaBrowserCompat = 0;
    private static int IconCompatParcelizer = 0;
    private static int connect = 1;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: onActionProviderVisibilityChanged
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.asInterface(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: onCreateActionView
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String asBinder = "Fitur ini masih dalam pengembangan";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy cancel = LazyKt.lazy(new Function0() { // from class: actionFormatChanged
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.b};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return (setCurrentRunnable) MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr, 1351093786, -1351093786);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final int INotificationSideChannelStub = R.layout.activity_main;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy getInterfaceDescriptor = LazyKt.lazy(new Function0() { // from class: appendModifier
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.a(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
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

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = (~(i8 | i4)) | i7;
        int i10 = (~(i7 | (~i4) | i5)) | (~(i8 | i7 | i4));
        int i11 = (~(i4 | i5)) | (~(i6 | i5));
        int i12 = i6 + i5 + i2 + ((-1520811122) * i) + (1880343047 * i3);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i6) - 1254686720) + (875799021 * i5) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i2) + ((-206831616) * i) + (408289280 * i3) + ((-683737088) * i13);
        int i15 = ((i6 * (-660833811)) - 1995073173) + (i5 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i2 * (-660833671)) + (i * 644061726) + (i3 * (-2012083377)) + (i13 * (-1027145728));
        switch (i14 + (i15 * i15 * 814809088)) {
            case 1:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 3:
                return b(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 5:
                return d(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return a(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                MainActivity mainActivity = (MainActivity) objArr[0];
                int i16 = 2 % 2;
                int i17 = connect + 79;
                IconCompatParcelizer = i17 % 128;
                if (i17 % 2 != 0) {
                    ((ActivityResultContractsPickVisualMediaMediaCapabilities) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
                    LoginActivity.Companion companion = LoginActivity.INSTANCE;
                    LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity, mainActivity.cancelAll, true, 5);
                    mainActivity.d_();
                    return Unit.INSTANCE;
                }
                ((ActivityResultContractsPickVisualMediaMediaCapabilities) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
                LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity, mainActivity.cancelAll, false, 4);
                mainActivity.d_();
                return Unit.INSTANCE;
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.presentation.main.MainActivity.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2f:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.main.MainActivity.c(byte, short, int, java.lang.Object[]):void");
    }

    public MainActivity() {
        final MainActivity mainActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.main.MainActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = mainActivity;
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
        final MainActivity mainActivity2 = this;
        this.asInterface = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.main.MainActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = mainActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.g = LazyKt.lazy(new Function0<getOpticalInsets>() { // from class: com.bpjstku.presentation.main.MainActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getOpticalInsets, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getOpticalInsets invoke() {
                ComponentCallbacks componentCallbacks = mainActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getOpticalInsets.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.a = LazyKt.lazy(new Function0<access000>() { // from class: com.bpjstku.presentation.main.MainActivity$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [access000, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final access000 invoke() {
                ComponentCallbacks componentCallbacks = mainActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(access000.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.d = LazyKt.lazy(new Function0<lambdaonVerticalScrollEvent0>() { // from class: com.bpjstku.presentation.main.MainActivity$special$$inlined$inject$default$4
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lambdaonVerticalScrollEvent0] */
            @Override // kotlin.jvm.functions.Function0
            public final lambdaonVerticalScrollEvent0 invoke() {
                ComponentCallbacks componentCallbacks = mainActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(lambdaonVerticalScrollEvent0.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.onTransact = LazyKt.lazy(new Function0<PackageIdentityUtilsSignaturesCompat>() { // from class: com.bpjstku.presentation.main.MainActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PackageIdentityUtilsSignaturesCompat, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PackageIdentityUtilsSignaturesCompat invoke() {
                LifecycleOwner lifecycleOwner = mainActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PackageIdentityUtilsSignaturesCompat.class);
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
        this.notify = LazyKt.lazy(new Function0<ApiCompatApi29Impl>() { // from class: com.bpjstku.presentation.main.MainActivity$special$$inlined$inject$default$5
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ApiCompatApi29Impl, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ApiCompatApi29Impl invoke() {
                ComponentCallbacks componentCallbacks = mainActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ApiCompatApi29Impl.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.main.MainActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/bpjstku/presentation/main/MainActivity$b;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, String str, Uri uri, int i) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                uri = null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra(NotificationCompat.CATEGORY_EVENT, str);
            intent.putExtra("key_menu_event", uri);
            intent.addFlags(268468224);
            context.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityMainBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = connect + 91;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        MainActivity$bindingInflater$1 mainActivity$bindingInflater$1 = MainActivity$bindingInflater$1.b;
        int i4 = IconCompatParcelizer + 117;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return mainActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        int i3 = i2 % 128;
        connect = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.INotificationSideChannelStub;
        int i5 = i3 + 63;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return i4;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = connect + 3;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        connect = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = mainActivity.getIntent().getStringExtra(NotificationCompat.CATEGORY_EVENT);
        if (stringExtra == null) {
            int i4 = IconCompatParcelizer + 9;
            connect = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = "";
        }
        mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stringExtra;
        mainActivity.cancelAll = (Uri) mainActivity.getIntent().getParcelableExtra("key_menu_event");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:9:0x003d  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws IllegalAccessException {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            MainActivity mainActivity = this;
            Intrinsics.checkNotNullParameter(mainActivity, "");
            mainActivity.getWindow().addFlags(9805);
            if (Build.VERSION.SDK_INT >= 73) {
                VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(((outputFormatToAudioProfile) this.b.getValue()).new AnonymousClass4(new String[]{"android.permission.POST_NOTIFICATIONS"}));
                final Function1 function1 = new Function1() { // from class: MenuItemImpl1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj};
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        return (Unit) MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr, 322151340, -322151333);
                    }
                };
                BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: showsTextAsAction
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
                ((acquireBuffer) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
            }
        } else {
            MainActivity mainActivity2 = this;
            Intrinsics.checkNotNullParameter(mainActivity2, "");
            mainActivity2.getWindow().addFlags(8192);
            if (Build.VERSION.SDK_INT >= 33) {
                VideoRecordEventStart videoRecordEventStartCompose2 = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(((outputFormatToAudioProfile) this.b.getValue()).new AnonymousClass4(new String[]{"android.permission.POST_NOTIFICATIONS"}));
                final Function1 function2 = new Function1() { // from class: MenuItemImpl1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj};
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        return (Unit) MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr, 322151340, -322151333);
                    }
                };
                BufferProviderState bufferProviderStateSubscribe2 = videoRecordEventStartCompose2.subscribe(new logToString() { // from class: showsTextAsAction
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function2, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe2, "");
                ((acquireBuffer) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe2);
            }
        }
        Uri uri = this.cancelAll;
        if (uri != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(uri);
        }
        AppsFlyerManager appsFlyerManagerB = AppsFlyerManager.INSTANCE.b();
        this.INotificationSideChannelDefault = appsFlyerManagerB;
        Object obj = null;
        if (appsFlyerManagerB == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            appsFlyerManagerB = null;
        }
        MainActivity mainActivity3 = this;
        Intrinsics.checkNotNullParameter(mainActivity3, "");
        appsFlyerManagerB.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mainActivity3;
        TuitionPaymentFragmentbindingInflater1(getIntent());
        User user = (User) this.TuitionPaymentFragmentbindingInflater1.getValue();
        String str2 = user != null ? user.RemoteActionCompatParcelizer : null;
        User user2 = (User) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (user2 != null) {
            int i3 = IconCompatParcelizer + 47;
            connect = i3 % 128;
            if (i3 % 2 == 0) {
                String str3 = user2.INotificationSideChannelStubProxy;
                obj.hashCode();
                throw null;
            }
            str = user2.INotificationSideChannelStubProxy;
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str2, "Y")) {
            int i4 = IconCompatParcelizer + 7;
            connect = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(str, ExifInterface.GPS_DIRECTION_TRUE)) {
                Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, R.id.mainContainer, new closeMode(), false);
                ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.getMenu().findItem(R.id.menu_digital_card).setVisible(false);
            } else {
                Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, R.id.mainContainer, new refreshVisibility(), false);
                ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.getMenu().findItem(R.id.menu_digital_card).setVisible(true);
            }
        } else {
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, R.id.mainContainer, new refreshVisibility(), false);
            ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.getMenu().findItem(R.id.menu_digital_card).setVisible(true);
        }
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        boolean zBooleanValue = ((Boolean) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], -540344729, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 540344732)).booleanValue();
        User user3 = (User) this.TuitionPaymentFragmentbindingInflater1.getValue();
        String str4 = user3 != null ? user3.RemoteActionCompatParcelizer : null;
        User user4 = (User) this.TuitionPaymentFragmentbindingInflater1.getValue();
        String str5 = user4 != null ? user4.INotificationSideChannelStubProxy : null;
        if (zBooleanValue) {
            int i6 = connect + 119;
            IconCompatParcelizer = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.areEqual(str4, "Y");
                throw null;
            }
            if ((!Intrinsics.areEqual(str4, "Y")) || !Intrinsics.areEqual(str5, ExifInterface.GPS_DIRECTION_TRUE)) {
                ImageView imageView = ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutMainToolbar.btnEWallet;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
            } else {
                ImageView imageView2 = ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutMainToolbar.btnEWallet;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(8);
            }
        } else {
            ImageView imageView3 = ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutMainToolbar.btnEWallet;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(0);
        }
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
        getOnBackPressedDispatcher().addCallback(this, new TuitionPaymentFragmentbindingInflater1());
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 46400), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40, 19 - (ViewConfiguration.getPressedStateDuration() >> 16), 1513912262, false, "b", null);
        }
        int i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 37836), AndroidCharacter.getMirror('0') + 11, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-16777157) - Color.rgb(0, 0, 0), TextUtils.lastIndexOf("", '0') + 19, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i9 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 449;
        long j3 = -1;
        long j4 = ((j3 ^ 1090770857577262872L) | 4428482639582523367L) ^ j3;
        long j5 = j3 ^ 4428482639582523367L;
        long j6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        long j7 = (((long) 450) * 1090770857577262872L) + (((long) (-448)) * 4428482639582523367L) + ((j4 | (((j5 | 1090770857577262872L) | j6) ^ j3)) * j2) + (((long) (-1347)) * j4) + (j2 * (j4 | (((j5 | (j6 ^ j3)) | 1090770857577262872L) ^ j3)));
        long j8 = j;
        int i10 = 0;
        while (true) {
            for (int i11 = 0; i11 != 8; i11++) {
                i9 = (((((int) (j8 >> i11)) & 255) + (i9 << 6)) + (i9 << 16)) - i9;
            }
            if (i10 != 0) {
                break;
            }
            int i12 = IconCompatParcelizer + 77;
            connect = i12 % 128;
            int i13 = i12 % 2;
            i10++;
            j8 = j7;
        }
        if (i9 == i7) {
            ViewCompat.setOnApplyWindowInsetsListener(((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain, new OnApplyWindowInsetsListener() { // from class: isExclusiveCheckable
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(view, windowInsetsCompat);
                }
            });
            return;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 40 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
        }
        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
        throw new RuntimeException(String.valueOf(i8));
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends OnBackPressedCallback {
        TuitionPaymentFragmentbindingInflater1() {
            super(true);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() {
            if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 1) {
                MainActivity.this.finish();
            } else {
                Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "tekan sekali lagi untuk keluar", 0).show();
            }
        }
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = INotificationSideChannelStub;
        long j = 0;
        int i5 = 1770390596;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 41;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2267;
                            int i8 = 34 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                            byte b2 = $$c[i3];
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, tapTimeout, i8, -1927765101, false, $$i(b3, (byte) (b3 + 3), b2), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2266;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34;
                        byte b4 = $$c[2];
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, i9, iIndexOf, -1927765101, false, $$i(b5, (byte) (b5 + 3), b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i3 = 2;
                j = 0;
                i5 = 1770390596;
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(write)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int iMyPid = 2267 - (Process.myPid() >> 22);
                int maximumFlingVelocity = 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b6 = $$c[2];
                byte b7 = (byte) (b6 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iMyPid, maximumFlingVelocity, -1927765101, false, $$i(b7, (byte) (b7 + 3), b6), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i10 = $11 + 125;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i12 = $11 + 37;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b >> b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> b);
                        } else {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        }
                    } else {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0, 0) + 49267);
                            int i13 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3261;
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 30;
                            byte b8 = $$c[2];
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i13, iResolveSizeAndState, -127612708, false, $$i(b9, (byte) (b9 + 2), b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf3 = (char) (22878 - TextUtils.indexOf("", "", 0));
                                int modifierMetaStateMask = 593 - ((byte) KeyEvent.getModifierMetaStateMask());
                                int i14 = 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                byte b10 = $$c[2];
                                byte b11 = (byte) (b10 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf3, modifierMetaStateMask, i14, 1570859318, false, $$i(b11, b11, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        } else {
                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                }
            }
            for (int i20 = 0; i20 < i; i20++) {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ImageView imageView = ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutMainToolbar.btnNotificationMenu;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: requestsActionButton
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (View) obj);
            }
        }));
        ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: getTitleForItemView
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return MainActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, menuItem);
            }
        });
        ImageView imageView2 = ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutMainToolbar.btnEWallet;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        ImageView imageView3 = imageView2;
        Function1 function1 = new Function1() { // from class: setIsActionButton
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        imageView3.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        int i2 = connect + 15;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        String str;
        String str2;
        String str3;
        onNestedPreFling onnestedpreflingTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        User user = (User) mainActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        Object obj = null;
        if (user != null) {
            int i2 = IconCompatParcelizer + 49;
            connect = i2 % 128;
            if (i2 % 2 == 0) {
                str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i3 = 87 / 0;
            } else {
                str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        } else {
            str = null;
        }
        User user2 = (User) mainActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        if (user2 != null) {
            str2 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = connect + 71;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str2 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        provideSurface.TuitionPaymentFragmentbindingInflater1(sb.toString());
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        if (Intrinsics.areEqual(getMaxImages.getRoot(), "true")) {
            MaintenanceActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = MaintenanceActivity.INSTANCE;
            MaintenanceActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity);
            mainActivity.d_();
            int i6 = IconCompatParcelizer + 31;
            connect = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 2;
            }
        } else {
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: applyIconTintIfNecessary
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) throws Throwable {
                    MainActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, task);
                }
            });
            FirebaseMessaging.getInstance().subscribeToTopic("informasi_umum");
            String str4 = mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str4 == null) {
                int i8 = IconCompatParcelizer + 61;
                connect = i8 % 128;
                if (i8 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                str4 = null;
            }
            if (Intrinsics.areEqual(str4, "CLAIM_JHT")) {
                int i9 = IconCompatParcelizer + 61;
                connect = i9 % 128;
                int i10 = i9 % 2;
                getMaxImages getmaximages2 = getMaxImages.INSTANCE;
                if (Intrinsics.areEqual(getMaxImages.getItem(), "true")) {
                    getMaxImages getmaximages3 = getMaxImages.INSTANCE;
                    String strOnResult = getMaxImages.onResult();
                    getMaxImages getmaximages4 = getMaxImages.INSTANCE;
                    String strINotificationSideChannelStubProxy = getMaxImages.INotificationSideChannelStubProxy();
                    getZoomControl.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = getZoomControl.INSTANCE;
                    getZoomControl getzoomcontrolTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getZoomControl.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strOnResult, strINotificationSideChannelStubProxy, new Function0() { // from class: MenuItemImpl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
                        }
                    }, new Function0() { // from class: isActionButton
                        private static final byte[] $$c = {123, -2, -101, -104};
                        private static final int $$f = 246;
                        private static int $10 = 0;
                        private static int $11 = 1;
                        private static final byte[] $$d = {113, 29, -123, -97, 17, -6, 18, 1, -2, -1, -50, 73, 6, -1, 4, 3, 7, 6, -66, 76, -62, -2, 67, -4, 3, 9, -4, -47, 40, 19, 23, -7, 9, -3, -32, 48, 2, 7, -11, 23, -76, 17, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -62};
                        private static final int $$e = 166;
                        private static final byte[] $$a = {114, -59, 10, 31, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
                        private static final int $$b = 226;
                        private static int TuitionPaymentFragmentbindingInflater1 = 0;
                        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
                        private static char[] b = {60073, 60080, 60041, 60034, 60074, 60077, 60076, 60082, 60047, 60056, 60052, 60117, 60088, 60045, 60083, 60055, 60054, 60048, 60079, 60085, 60081, 60051, 60058, 60078, 60090, 60060, 60075, 60063, 60050, 60040, 60072, 60062, 60046, 60049, 60053, 60043};
                        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57191;

                        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
                            /*
                                int r7 = r7 * 52
                                int r7 = 56 - r7
                                byte[] r0 = defpackage.isActionButton.$$a
                                int r8 = r8 * 14
                                int r8 = r8 + 84
                                int r1 = r6 + 1
                                byte[] r1 = new byte[r1]
                                r2 = 0
                                if (r0 != 0) goto L15
                                r3 = r8
                                r4 = r2
                                r8 = r7
                                goto L2c
                            L15:
                                r3 = r2
                            L16:
                                byte r4 = (byte) r8
                                r1[r3] = r4
                                if (r3 != r6) goto L23
                                java.lang.String r6 = new java.lang.String
                                r6.<init>(r1, r2)
                                r9[r2] = r6
                                return
                            L23:
                                int r3 = r3 + 1
                                r4 = r0[r7]
                                r5 = r8
                                r8 = r7
                                r7 = r4
                                r4 = r3
                                r3 = r5
                            L2c:
                                int r3 = r3 + r7
                                int r7 = r8 + 1
                                int r8 = r3 + (-10)
                                r3 = r4
                                goto L16
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.isActionButton.a(byte, short, short, java.lang.Object[]):void");
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static void d(int r5, int r6, short r7, java.lang.Object[] r8) {
                            /*
                                int r6 = r6 * 14
                                int r0 = r6 + 39
                                byte[] r1 = defpackage.isActionButton.$$d
                                int r7 = r7 * 38
                                int r7 = r7 + 4
                                int r5 = r5 * 13
                                int r5 = r5 + 84
                                byte[] r0 = new byte[r0]
                                int r6 = r6 + 38
                                r2 = 0
                                if (r1 != 0) goto L18
                                r4 = r6
                                r3 = r2
                                goto L2a
                            L18:
                                r3 = r2
                            L19:
                                byte r4 = (byte) r5
                                r0[r3] = r4
                                if (r3 != r6) goto L26
                                java.lang.String r5 = new java.lang.String
                                r5.<init>(r0, r2)
                                r8[r2] = r5
                                return
                            L26:
                                int r3 = r3 + 1
                                r4 = r1[r7]
                            L2a:
                                int r7 = r7 + 1
                                int r5 = r5 + r4
                                int r5 = r5 + (-4)
                                goto L19
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.isActionButton.d(int, int, short, java.lang.Object[]):void");
                        }

                        /* JADX WARN: Code duplicated, block: B:23:0x0232  */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() throws Throwable {
                            Object[] objArr2;
                            int i11 = 2 % 2;
                            int i12 = TuitionPaymentFragmentbindingInflater1 + 47;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                            int i13 = i12 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31533);
                                int iAxisFromString = MotionEvent.axisFromString("") + 922;
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
                                byte[] bArr = $$a;
                                byte b2 = bArr[80];
                                byte b3 = bArr[37];
                                Object[] objArr3 = new Object[1];
                                a(b2, b3, b3, objArr3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iAxisFromString, scrollBarFadeDuration, -1048449946, false, (String) objArr3[0], null);
                            }
                            Object obj2 = null;
                            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                            Object[] objArr4 = new Object[1];
                            c(new char[]{28, 4, 26, 3, 16, Typography.quote, 29, '\t', 11, 28, 6, '#', 5, 27, 7, ' ', 17, '\r', 16, '\t', 11, 15}, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 83), 22 - Color.blue(0), objArr4);
                            Class<?> cls = Class.forName((String) objArr4[0]);
                            Object[] objArr5 = new Object[1];
                            c(new char[]{'!', '\r', 23, Typography.quote, 25, '#', 24, 3, Typography.quote, 19, 14, '\t', Typography.quote, 22, 13899}, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 77), 15 - KeyEvent.keyCodeFromString(""), objArr5);
                            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 921;
                                int i14 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                byte[] bArr2 = $$a;
                                Object[] objArr6 = new Object[1];
                                a((byte) 52, bArr2[37], bArr2[80], objArr6);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, jumpTapTimeout, i14, -778300370, false, (String) objArr6[0], null);
                            }
                            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
                                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                                    int touchSlop = 28 - (ViewConfiguration.getTouchSlop() >> 8);
                                    byte b4 = $$a[80];
                                    Object[] objArr7 = new Object[1];
                                    a((byte) 37, b4, b4, objArr7);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, iKeyCodeFromString, touchSlop, -1142834547, false, (String) objArr7[0], null);
                                }
                                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                int i15 = ((int[]) objArr8[3])[0];
                                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{i15}, (String[]) objArr8[4]};
                                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                int i16 = ~((-327967134) | iUptimeMillis);
                                int i17 = (-147450481) + ((25952513 | i16) * (-280)) + ((i16 | (~((-1446112511) | iUptimeMillis))) * 140);
                                int i18 = ~((-302014621) | iUptimeMillis);
                                int i19 = ~iUptimeMillis;
                                int i20 = i17 + (((~(i19 | (-1144097891))) | i18 | (~((-25952514) | i19))) * 140) + 1933039165;
                                int i21 = (i20 << 13) ^ i20;
                                int i22 = i21 ^ (i21 >>> 17);
                                ((int[]) objArr2[0])[0] = i22 ^ (i22 << 5);
                            } else {
                                Object[] objArr9 = new Object[1];
                                c(new char[]{28, 4, 26, 3, 16, Typography.quote, 29, '\t', 23, Typography.quote, 5, 17, 27, 6, '\n', 26, 16, 25, '\t', 2, 19, 22, 1, ' ', 21, 28}, (byte) ((-16777205) - Color.rgb(0, 0, 0)), Color.rgb(0, 0, 0) + 16777242, objArr9);
                                Class<?> cls2 = Class.forName((String) objArr9[0]);
                                Object[] objArr10 = new Object[1];
                                c(new char[]{'\b', '!', 13869, 13869, ' ', '#', 6, 26, 13871, 13871, 16, 27, '\n', 21, '\n', 26, 16, 4}, (byte) (View.combineMeasuredStates(0, 0) + 69), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, objArr10);
                                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                                if (applicationContext != null) {
                                    int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
                                    int i24 = i23 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i24;
                                    int i25 = i23 % 2;
                                    if (!(applicationContext instanceof ContextWrapper)) {
                                        applicationContext = applicationContext.getApplicationContext();
                                        int i26 = TuitionPaymentFragmentbindingInflater1 + 83;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                                        int i27 = i26 % 2;
                                    } else {
                                        int i28 = i24 + 51;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i28 % 128;
                                        if (i28 % 2 == 0) {
                                            ((ContextWrapper) applicationContext).getBaseContext();
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                            applicationContext = applicationContext.getApplicationContext();
                                            int i29 = TuitionPaymentFragmentbindingInflater1 + 83;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i29 % 128;
                                            int i210 = i29 % 2;
                                        } else {
                                            applicationContext = null;
                                        }
                                    }
                                }
                                Object[] objArr11 = new Object[1];
                                c(new char[]{Typography.quote, 21, 16, 19, '\t', 17, 28, 4, 29, 7, '!', 0, 26, 11, Typography.quote, '\r'}, (byte) (88 - TextUtils.getCapsMode("", 0, 0)), 16 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr11);
                                Class<?> cls3 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                c(new char[]{29, 28, ' ', '#', '\n', 26, '\t', 2, 16, 20, 27, 23, 16, 6, 25, '!'}, (byte) (26 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, objArr12);
                                try {
                                    Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 1933039165};
                                    byte[] bArr3 = $$d;
                                    byte b5 = bArr3[7];
                                    byte b6 = bArr3[79];
                                    Object[] objArr14 = new Object[1];
                                    d(b5, b6, b6, objArr14);
                                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                                    byte b7 = bArr3[79];
                                    byte b8 = bArr3[7];
                                    Object[] objArr15 = new Object[1];
                                    d(b7, b8, b8, objArr15);
                                    Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char c = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 921;
                                        int longPressTimeout2 = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                        byte b9 = $$a[80];
                                        Object[] objArr17 = new Object[1];
                                        a((byte) 37, b9, b9, objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, capsMode, longPressTimeout2, -1142834547, false, (String) objArr17[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                                    try {
                                        Object[] objArr18 = new Object[1];
                                        c(new char[]{28, 4, 26, 3, 16, Typography.quote, 29, '\t', 11, 28, 6, '#', 5, 27, 7, ' ', 17, '\r', 16, '\t', 11, 15}, (byte) (View.MeasureSpec.getSize(0) + 83), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, objArr18);
                                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                                        Object[] objArr19 = new Object[1];
                                        c(new char[]{'!', '\r', 23, Typography.quote, 25, '#', 24, 3, Typography.quote, 19, 14, '\t', Typography.quote, 22, 13899}, (byte) ((Process.myPid() >> 22) + 76), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, objArr19);
                                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                        Long lValueOf = Long.valueOf(jLongValue2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
                                            int size = View.MeasureSpec.getSize(0) + 921;
                                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 28;
                                            byte[] bArr4 = $$a;
                                            Object[] objArr20 = new Object[1];
                                            a((byte) 52, bArr4[37], bArr4[80], objArr20);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, size, packedPositionGroup, -778300370, false, (String) objArr20[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31532);
                                            int iRed = Color.red(0) + 921;
                                            int i30 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            byte[] bArr5 = $$a;
                                            byte b10 = bArr5[80];
                                            byte b11 = bArr5[37];
                                            Object[] objArr21 = new Object[1];
                                            a(b10, b11, b11, objArr21);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iRed, i30, -1048449946, false, (String) objArr21[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                        objArr2 = objArr16;
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
                            int i31 = ((int[]) objArr2[1])[0];
                            int i32 = ((int[]) objArr2[3])[0];
                            if (i32 == i31) {
                                int i33 = ((int[]) objArr2[0])[0];
                                int i34 = ((int[]) objArr2[3])[0];
                                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{i34}, (String[]) objArr2[4]};
                                int iIdentityHashCode = System.identityHashCode(this);
                                int i35 = (-679761083) + (((~((-147094420) | iIdentityHashCode)) | (-1626985225)) * (-318));
                                int i36 = ~((-1626985225) | iIdentityHashCode);
                                int i37 = ~iIdentityHashCode;
                                int i38 = i33 + i35 + ((i36 | (~(1761475483 | i37))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | 1761475483)) | (~((-1614381065) | i37))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                                int i39 = (i38 << 13) ^ i38;
                                int i40 = i39 ^ (i39 >>> 17);
                                ((int[]) objArr22[0])[0] = i40 ^ (i40 << 5);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                String[] strArr = (String[]) objArr2[4];
                                if (strArr != null) {
                                    int i41 = 0;
                                    while (i41 < strArr.length) {
                                        arrayList.add(strArr[i41]);
                                        i41++;
                                        int i42 = TuitionPaymentFragmentbindingInflater1 + 85;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i42 % 128;
                                        int i43 = i42 % 2;
                                    }
                                }
                                Toast.makeText((Context) null, i32 / (((i32 - 1) * i32) % 2), 0).show();
                                int i44 = ((int[]) objArr2[0])[0];
                                int i45 = ((int[]) objArr2[3])[0];
                                Object[] objArr23 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{i45}, (String[]) objArr2[4]};
                                int iIdentityHashCode2 = System.identityHashCode(this);
                                int i46 = i44 + ((((~((-25691274) | iIdentityHashCode2)) | 271665682) * 449) - 314013906) + (((~((~iIdentityHashCode2) | (-25691274))) | 271665682) * 449);
                                int i47 = (i46 << 13) ^ i46;
                                int i48 = i47 ^ (i47 >>> 17);
                                ((int[]) objArr23[0])[0] = i48 ^ (i48 << 5);
                            }
                            return MainActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }

                        private static void c(char[] cArr, byte b2, int i11, Object[] objArr2) throws Throwable {
                            int i12;
                            Object obj2;
                            int i13;
                            int i14 = 2 % 2;
                            deInitSession deinitsession = new deInitSession();
                            char[] cArr2 = b;
                            Object obj3 = null;
                            int i15 = 6;
                            if (cArr2 != null) {
                                int length = cArr2.length;
                                char[] cArr3 = new char[length];
                                int i16 = 0;
                                while (i16 < length) {
                                    try {
                                        Object[] objArr3 = {Integer.valueOf(cArr2[i16])};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            byte b3 = (byte) 0;
                                            byte b4 = (byte) (b3 + 3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> i15) + 2267, 33 - KeyEvent.getDeadChar(0, 0), -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                                        }
                                        cArr3[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                                        i16++;
                                        i15 = 6;
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
                            try {
                                Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = (byte) (b5 + 3);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 2268, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33, -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
                                }
                                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).charValue();
                                char[] cArr4 = new char[i11];
                                if (i11 % 2 != 0) {
                                    int i17 = $11 + 63;
                                    $10 = i17 % 128;
                                    int i18 = i17 % 2;
                                    i12 = i11 - 1;
                                    cArr4[i12] = (char) (cArr[i12] - b2);
                                } else {
                                    i12 = i11;
                                }
                                if (i12 > 1) {
                                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i12) {
                                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                            int i19 = $11 + 17;
                                            $10 = i19 % 128;
                                            int i20 = i19 % 2;
                                            obj2 = obj3;
                                            i13 = 2;
                                        } else {
                                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char threadPriority = (char) (49267 - ((Process.getThreadPriority(0) + 20) >> 6));
                                                int offsetAfter = 3261 - TextUtils.getOffsetAfter("", 0);
                                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 30;
                                                byte b7 = (byte) (-$$c[1]);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, offsetAfter, iKeyCodeFromString, -127612708, false, $$g((byte) 0, b7, (byte) (b7 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                            }
                                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                                                try {
                                                    Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                        byte b8 = (byte) 0;
                                                        byte b9 = b8;
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (-16776622) - Color.rgb(0, 0, 0), 17 - View.combineMeasuredStates(0, 0), 1570859318, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                                    }
                                                    obj2 = null;
                                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6)).intValue();
                                                    int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 == null) {
                                                        throw th2;
                                                    }
                                                    throw cause2;
                                                }
                                            } else {
                                                obj2 = null;
                                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                                    int i22 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                                    int i23 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i22];
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i23];
                                                    int i24 = $11 + 25;
                                                    $10 = i24 % 128;
                                                    int i25 = i24 % 2;
                                                } else {
                                                    int i26 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                                    int i27 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i26];
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i27];
                                                    int i28 = $10 + 17;
                                                    $11 = i28 % 128;
                                                    i13 = 2;
                                                    int i29 = i28 % 2;
                                                }
                                            }
                                            i13 = 2;
                                        }
                                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i13;
                                        obj3 = obj2;
                                    }
                                }
                                int i30 = 0;
                                while (i30 < i11) {
                                    int i31 = $11 + 19;
                                    $10 = i31 % 128;
                                    if (i31 % 2 != 0) {
                                        cArr4[i30] = (char) (cArr4[i30] ^ 26105);
                                        i30 += 24;
                                    } else {
                                        cArr4[i30] = (char) (cArr4[i30] ^ 13722);
                                        i30++;
                                    }
                                }
                                objArr2[0] = new String(cArr4);
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static java.lang.String $$g(int r6, short r7, int r8) {
                            /*
                                int r8 = r8 * 3
                                int r8 = 4 - r8
                                int r6 = r6 * 2
                                int r0 = 1 - r6
                                int r7 = 116 - r7
                                byte[] r1 = defpackage.isActionButton.$$c
                                byte[] r0 = new byte[r0]
                                r2 = 0
                                int r6 = 0 - r6
                                if (r1 != 0) goto L16
                                r3 = r8
                                r4 = r2
                                goto L2e
                            L16:
                                r3 = r2
                            L17:
                                r5 = r8
                                r8 = r7
                                r7 = r5
                                byte r4 = (byte) r8
                                r0[r3] = r4
                                if (r3 != r6) goto L25
                                java.lang.String r6 = new java.lang.String
                                r6.<init>(r0, r2)
                                return r6
                            L25:
                                int r3 = r3 + 1
                                r4 = r1[r7]
                                r5 = r8
                                r8 = r7
                                r7 = r4
                                r4 = r3
                                r3 = r5
                            L2e:
                                int r8 = r8 + 1
                                int r7 = -r7
                                int r7 = r7 + r3
                                r3 = r4
                                goto L17
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.isActionButton.$$g(int, short, int):java.lang.String");
                        }
                    });
                    FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getzoomcontrolTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getzoomcontrolTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getzoomcontrolTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";
                }
            } else {
                getMaxImages getmaximages5 = getMaxImages.INSTANCE;
                if (Intrinsics.areEqual(getMaxImages.asBinder(), "true")) {
                    getMaxImages getmaximages6 = getMaxImages.INSTANCE;
                    if (Intrinsics.areEqual(getMaxImages.setCallbacksMessenger(), "true")) {
                        getMaxImages getmaximages7 = getMaxImages.INSTANCE;
                        final String strHandleMessage = getMaxImages.handleMessage();
                        onNestedPreFling.Companion companion = onNestedPreFling.INSTANCE;
                        onNestedPreFling onnestedpreflingTuitionPaymentFragmentspecialinlinedviewModeldefault4 = onNestedPreFling.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("", new Function0() { // from class: hasCollapsibleActionView
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, strHandleMessage};
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                return (Unit) MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr2, -405874759, 405874760);
                            }
                        });
                        FragmentManager supportFragmentManager2 = mainActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                        if (supportFragmentManager2.findFragmentByTag(onnestedpreflingTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            onnestedpreflingTuitionPaymentFragmentspecialinlinedviewModeldefault4.show(supportFragmentManager2, onnestedpreflingTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else {
                        User user3 = (User) mainActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                        if (user3 != null) {
                            int i11 = IconCompatParcelizer + 83;
                            connect = i11 % 128;
                            if (i11 % 2 == 0) {
                                str3 = user3.INotificationSideChannelStubProxy;
                                int i12 = 75 / 0;
                            } else {
                                str3 = user3.INotificationSideChannelStubProxy;
                            }
                        } else {
                            str3 = null;
                        }
                        if (Intrinsics.areEqual(str3, "Y")) {
                            getMaxImages getmaximages8 = getMaxImages.INSTANCE;
                            String sessionToken = getMaxImages.getSessionToken();
                            getMaxImages getmaximages9 = getMaxImages.INSTANCE;
                            final String strIsConnected = getMaxImages.isConnected();
                            if (strIsConnected.length() > 0) {
                                onNestedPreFling.Companion companion2 = onNestedPreFling.INSTANCE;
                                onnestedpreflingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onNestedPreFling.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionToken, new Function0() { // from class: MenuDialogHelper
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MainActivity.TuitionPaymentFragmentbindingInflater1(strIsConnected, mainActivity);
                                    }
                                });
                                int i13 = IconCompatParcelizer + 117;
                                connect = i13 % 128;
                                int i14 = i13 % 2;
                            } else {
                                onNestedPreFling.Companion companion3 = onNestedPreFling.INSTANCE;
                                onnestedpreflingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onNestedPreFling.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionToken, new Function0() { // from class: getShortcutLabel
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    }
                                });
                            }
                            FragmentManager supportFragmentManager3 = mainActivity.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                            Intrinsics.checkNotNullParameter(supportFragmentManager3, "");
                            if (supportFragmentManager3.findFragmentByTag(onnestedpreflingTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                onnestedpreflingTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager3, onnestedpreflingTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                    }
                }
            }
            getMaxImages getmaximages10 = getMaxImages.INSTANCE;
            mainActivity.asBinder = getMaxImages.getNotifyChildrenChangedOptions();
        }
        ((access000) mainActivity.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        MainActivity mainActivity = this;
        ((access000) this.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(mainActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setCheckedInt
            private static final byte[] $$c = {89, 107, -36, -112};
            private static final int $$f = 175;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {0, -94, -62, -97, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -48, -12, 10, 62, -60, 1, 14, 2, -4, 65, -73, 3, 26, -12};
            private static final int $$e = 196;
            private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 74;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int b = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -5282497452812998963L;

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r7, byte r8, short r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 14
                    int r7 = r7 + 84
                    int r9 = 53 - r9
                    int r8 = r8 + 4
                    byte[] r0 = defpackage.setCheckedInt.$$a
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r8
                    r4 = r2
                    goto L2a
                L12:
                    r3 = r2
                L13:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    int r8 = r8 + 1
                    if (r4 != r9) goto L24
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L24:
                    r3 = r0[r8]
                    r6 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r6
                L2a:
                    int r8 = r8 + r7
                    int r7 = r8 + (-10)
                    r8 = r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setCheckedInt.a(short, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.setCheckedInt.$$d
                    int r6 = 99 - r6
                    int r8 = r8 * 49
                    int r1 = r8 + 1
                    int r7 = r7 * 49
                    int r7 = 52 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r7
                    r4 = r2
                    goto L2c
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L22:
                    int r7 = r7 + 1
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2c:
                    int r7 = -r7
                    int r6 = r6 + r7
                    int r6 = r6 + 3
                    r7 = r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setCheckedInt.d(short, short, byte, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i2);
                abortcapture.b = 4;
                while (abortcapture.b < cArrB.length) {
                    int i4 = $11 + 29;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i6 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 64839), TextUtils.indexOf((CharSequence) "", '0') + 1357, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - Color.blue(0)), ExpandableListView.getPackedPositionType(0L) + 468, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                int i7 = $11 + 55;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 22 / 0;
                }
            }

            /* JADX WARN: Code duplicated, block: B:23:0x01fa  */
            /* JADX WARN: Code duplicated, block: B:26:0x0204  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (31533 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 921;
                    int i3 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b2 = bArr[37];
                    byte b3 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, (byte) (b3 & 52), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, longPressTimeout, i3, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{52308, 10675, 52277, 59290, 9590, 27962, 65192, 19273, 65175, 5773, 44028, 13753, 43363, 23491, 39194, 58928, 21545, 36207, 22196, 54106, 1673, 65195, 1008, 40420, 12651, 9183}, 1 - Color.argb(0, 0, 0, 0), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{6745, 4252, 6716, 16537, 7259, 29484, 22958, 21853, 10374, 12206, 3327, 11219, 32612, 25342, 15963, 63489, 33332, 46174, 61862}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char minimumFlingVelocity = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[80];
                    Object[] objArr5 = new Object[1];
                    a(b4, bArr2[7], b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, iLastIndexOf, capsMode, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) (31533 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                        int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 28;
                        byte[] bArr3 = $$a;
                        byte b5 = bArr3[80];
                        Object[] objArr6 = new Object[1];
                        a(b5, (byte) (b5 | 51), bArr3[33], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iKeyCodeFromString, iKeyCodeFromString2, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i4 = ((int[]) objArr7[3])[0];
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i4}, (String[]) objArr7[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i5 = (~((-629825853) | iIdentityHashCode)) | 67264796;
                    int i6 = (-1996094901) + (i5 * 992) + ((i5 | (~((~iIdentityHashCode) | 1706814847))) * (-496)) + ((iIdentityHashCode | 1144253791) * 496) + 353082486;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{16934, 24562, 16967, 36603, 21303, 41370, 38857, 34793, 28901, 24780, 49821, 63769, 10015, 11649, 61477, 10989, 55907, 64318, 16341, 8182, 35040, 35008, 27273, 20818, 48942, 21917, 38971, 33442, 29263, 25381}, -TextUtils.lastIndexOf("", '0', 0), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{35124, 60538, 35159, 58443, 57508, 36750, 64879, 43517, 48125, 54083, 43069, 55138, 60444, 40457, 39561, 1214, 4435, 18612, 21861, 12770, 17387, 15183}, KeyEvent.getDeadChar(0, 0) + 1, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i9 = b + 121;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 41 / 0;
                            if (applicationContext instanceof ContextWrapper) {
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = null;
                                }
                            }
                        } else if (applicationContext instanceof ContextWrapper) {
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = null;
                            }
                        }
                        applicationContext = applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{7553, 23105, 7659, 4162, 22155, 38950, 2402, 48710, 12035, 25978, 23585, 49381, 30910, 10348, 28351, 4870, 34294, 65178, 41341, 9806}, 1 - ExpandableListView.getPackedPositionGroup(0L), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{20357, 54415, 20460, 64797, 55360, 30353, 58414, 20734, 32093, 60337, 45419, 11845, 10901, 42733, 33728, 64928, 55234, 28751, 19491, 51441}, TextUtils.getTrimmedLength("") + 1, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 353082486};
                        byte[] bArr4 = $$d;
                        byte b6 = bArr4[0];
                        byte b7 = bArr4[35];
                        Object[] objArr13 = new Object[1];
                        d(b6, b7, b7, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b8 = bArr4[35];
                        byte b9 = bArr4[0];
                        Object[] objArr14 = new Object[1];
                        d(b8, b9, b9, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) (31534 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
                            int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[80];
                            Object[] objArr15 = new Object[1];
                            a(b10, (byte) (b10 | 51), bArr5[33], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, i11, packedPositionGroup, -1142834547, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c(new char[]{52308, 10675, 52277, 59290, 9590, 27962, 65192, 19273, 65175, 5773, 44028, 13753, 43363, 23491, 39194, 58928, 21545, 36207, 22196, 54106, 1673, 65195, 1008, 40420, 12651, 9183}, 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c(new char[]{6745, 4252, 6716, 16537, 7259, 29484, 22958, 21853, 10374, 12206, 3327, 11219, 32612, 25342, 15963, 63489, 33332, 46174, 61862}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c4 = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                int i12 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
                                int iGreen = 28 - Color.green(0);
                                byte[] bArr6 = $$a;
                                byte b11 = bArr6[80];
                                Object[] objArr18 = new Object[1];
                                a(b11, bArr6[7], b11, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, i12, iGreen, -778300370, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                                int iRgb = (-16776295) - Color.rgb(0, 0, 0);
                                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 29;
                                byte[] bArr7 = $$a;
                                byte b12 = bArr7[37];
                                byte b13 = bArr7[7];
                                Object[] objArr19 = new Object[1];
                                a(b12, b13, (byte) (b13 & 52), objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, iRgb, bitsPerPixel, -1048449946, false, (String) objArr19[0], null);
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
                int i13 = ((int[]) objArr[1])[0];
                int i14 = ((int[]) objArr[3])[0];
                if (i14 == i13) {
                    int i15 = ((int[]) objArr[0])[0];
                    int i16 = ((int[]) objArr[3])[0];
                    Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i16}, (String[]) objArr[4]};
                    int iMyUid = Process.myUid();
                    int i17 = i15 + 1443825355 + (((~((-708857893) | (~iMyUid))) | (~(1065221751 | iMyUid))) * (-272)) + (((~((-996964984) | iMyUid)) | 288107091) * (-272)) + (((~(iMyUid | 996964983)) | 777114660) * 272);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr20[0])[0] = i19 ^ (i19 << 5);
                    int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                    b = i20 % 128;
                    if (i20 % 2 == 0) {
                        int i21 = 4 / 5;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i22 = b + 53;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                        int i23 = 2;
                        int i24 = i22 % 2;
                        int i25 = 0;
                        while (i25 < strArr.length) {
                            int i26 = b + 87;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                            if (i26 % i23 != 0) {
                                arrayList.add(strArr[i25]);
                                i25 += 53;
                            } else {
                                arrayList.add(strArr[i25]);
                                i25++;
                            }
                            i23 = 2;
                        }
                    }
                    int[] iArr = new int[i14];
                    int i27 = i14 - 1;
                    iArr[i27] = 1;
                    Toast.makeText((Context) null, iArr[((i14 * i27) % 2) - 1], 1).show();
                    int i28 = ((int[]) objArr[0])[0];
                    int i29 = ((int[]) objArr[3])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i29}, (String[]) objArr[4]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i30 = i28 + (-335625976) + (((~((~iIdentityHashCode2) | 578132626)) | (-1736294044)) * 529) + (((~(iIdentityHashCode2 | 578132626)) | (-1195947018)) * 529);
                    int i31 = (i30 << 13) ^ i30;
                    int i32 = i31 ^ (i31 >>> 17);
                    ((int[]) objArr21[0])[0] = i32 ^ (i32 << 5);
                    int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
                    b = i33 % 128;
                    if (i33 % 2 == 0) {
                        int i34 = 3 % 4;
                    }
                }
                return MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r7, byte r8, byte r9) {
                /*
                    int r7 = r7 * 3
                    int r7 = r7 + 107
                    byte[] r0 = defpackage.setCheckedInt.$$c
                    int r9 = r9 * 3
                    int r9 = 1 - r9
                    int r8 = r8 * 2
                    int r8 = 4 - r8
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L2a
                L16:
                    r3 = r2
                L17:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r9) goto L24
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L24:
                    r3 = r0[r8]
                    r6 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r6
                L2a:
                    int r7 = r7 + r8
                    int r8 = r3 + 1
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setCheckedInt.$$g(byte, byte, byte):java.lang.String");
            }
        }));
        ((getOpticalInsets) this.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(mainActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setMenuInfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.b(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((lambdaonVerticalScrollEvent0) this.d.getValue()).b.observe(mainActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setActionViewExpanded
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        MainActivity mainActivity2 = this;
        stopMediaCodec<setOnImageAvailableListener<ActivityResultRegistryExternalSyntheticLambda1>> stopmediacodec = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d;
        Function1 function1 = new Function1() { // from class: setVisibleInt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (setOnImageAvailableListener) obj);
            }
        };
        Lifecycle.State state = Lifecycle.State.CREATED;
        Intrinsics.checkNotNullParameter(mainActivity2, "");
        Intrinsics.checkNotNullParameter(stopmediacodec, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(function1, "");
        b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(mainActivity2), null, null, new ObserveExtKt$observeState$1(mainActivity2, state, stopmediacodec, function1, null), 3, null);
        int i2 = connect + 61;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void TuitionPaymentFragmentbindingInflater1(Intent p0) {
        int i = 2 % 2;
        Task<PendingDynamicLinkData> dynamicLink = FirebaseDynamicLinks.getInstance().getDynamicLink(p0);
        final Function1 function1 = new Function1() { // from class: shouldShowShortcut
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (PendingDynamicLinkData) obj);
            }
        };
        dynamicLink.addOnSuccessListener(new OnSuccessListener() { // from class: shouldShowIcon
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                MainActivity.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: MenuItemWrapperICSActionProviderWrapper
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(exc);
            }
        });
        int i2 = IconCompatParcelizer + 15;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Uri p0) {
        int i = 2 % 2;
        String queryParameter = p0.getQueryParameter("type");
        String str = "";
        AppsFlyerManager appsFlyerManager = null;
        if (queryParameter == null) {
            int i2 = connect + 103;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                appsFlyerManager.hashCode();
                throw null;
            }
            queryParameter = "";
        }
        String path = p0.getPath();
        if (path != null) {
            int i3 = connect + 111;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
        } else {
            path = "";
        }
        if (!Intrinsics.areEqual(queryParameter, BpjsServiceEnum.PROMO.getType())) {
            int i5 = IconCompatParcelizer + 25;
            connect = i5 % 128;
            int i6 = i5 % 2;
            if (!Intrinsics.areEqual(path, "/co-marketing")) {
                if (Intrinsics.areEqual(queryParameter, BpjsServiceEnum.DANASIAGA.getType())) {
                    DanaSiagaActivity.Companion tuitionPaymentFragmentbindingInflater1 = DanaSiagaActivity.INSTANCE;
                    DanaSiagaActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
                    return;
                }
                if (Intrinsics.areEqual(queryParameter, BpjsServiceEnum.INVESTASI.getType())) {
                    InvestmentListActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = InvestmentListActivity.INSTANCE;
                    InvestmentListActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                    int i7 = IconCompatParcelizer + 11;
                    connect = i7 % 128;
                    int i8 = i7 % 2;
                    return;
                }
                if (Intrinsics.areEqual(queryParameter, BpjsServiceEnum.REGISTRATION.getType()) && Intrinsics.areEqual(path, "bpu")) {
                    int i9 = IconCompatParcelizer + 27;
                    connect = i9 % 128;
                    if (i9 % 2 == 0) {
                        appsFlyerManager.hashCode();
                        throw null;
                    }
                    AppsFlyerManager appsFlyerManager2 = this.INotificationSideChannelDefault;
                    if (appsFlyerManager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        appsFlyerManager = appsFlyerManager2;
                    }
                    MainActivity mainActivity = this;
                    appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity, AppsFlyerEventEnum.TERM_N_CONDITION_BPU.getType(), new LinkedHashMap());
                    TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
                    TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mainActivity, false, true, 2);
                    return;
                }
                if (!Intrinsics.areEqual(path, "bpu")) {
                    if (Intrinsics.areEqual(queryParameter, BpjsServiceEnum.PODCAST.getType())) {
                        startActivity(new Intent(this, (Class<?>) VideoListActivity.class));
                        return;
                    }
                    if (Intrinsics.areEqual(path, "/jmo/cek-saldo.html")) {
                        onTransact();
                        return;
                    } else if (Intrinsics.areEqual(path, "/jmo/perumahan-pekerja.html")) {
                        ((lambdaonVerticalScrollEvent0) this.d.getValue()).b();
                        return;
                    } else {
                        ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setSelectedItemId(R.id.menu_home);
                        return;
                    }
                }
                int i10 = IconCompatParcelizer + 11;
                connect = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                AppsFlyerManager appsFlyerManager3 = this.INotificationSideChannelDefault;
                if (appsFlyerManager3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    appsFlyerManager = appsFlyerManager3;
                }
                MainActivity mainActivity2 = this;
                appsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity2, AppsFlyerEventEnum.TERM_N_CONDITION_BPU.getType(), new LinkedHashMap());
                TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion2 = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
                TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mainActivity2, true, false, 4);
                return;
            }
        }
        String queryParameter2 = p0.getQueryParameter("idtrx");
        if (queryParameter2 == null) {
            int i11 = connect + 81;
            IconCompatParcelizer = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str = queryParameter2;
        }
        CoMarketingActivity.Companion bVar = CoMarketingActivity.INSTANCE;
        CoMarketingActivity.Companion.b(this, true, str);
    }

    private final void cancelAll() {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 37;
        connect = i3 % 128;
        int i4 = i3 % 2;
        ImageView imageView = ((ActivityMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutMainToolbar.imgUnreadIndicator;
        if (PreferenceManager.getBoolean$default(((PackageIdentityUtilsSignaturesCompat) this.onTransact.getValue()).b, "unread_notif", false, 2, null)) {
            int i5 = connect + 107;
            int i6 = i5 % 128;
            IconCompatParcelizer = i6;
            i = i5 % 2 != 0 ? 1 : 0;
            int i7 = i6 + 39;
            connect = i7 % 128;
            int i8 = i7 % 2;
        } else {
            int i9 = IconCompatParcelizer + 111;
            connect = i9 % 128;
            int i10 = i9 % 2;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    private final void onTransact() {
        AvailabilityMenuItem availabilityMenuItem;
        Object next;
        int i = 2 % 2;
        setCurrentRunnable setcurrentrunnable = (setCurrentRunnable) this.cancel.getValue();
        String active = null;
        if (setcurrentrunnable != null) {
            int i2 = IconCompatParcelizer + 67;
            connect = i2 % 128;
            int i3 = i2 % 2;
            List<AvailabilityMenuItem> list = setcurrentrunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (list != null) {
                int i4 = connect + 83;
                IconCompatParcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    list.iterator();
                    active.hashCode();
                    throw null;
                }
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((AvailabilityMenuItem) next).getMenuCode(), "JM001"));
                availabilityMenuItem = (AvailabilityMenuItem) next;
            } else {
                availabilityMenuItem = null;
            }
        } else {
            availabilityMenuItem = null;
        }
        if (availabilityMenuItem != null) {
            active = availabilityMenuItem.getActive();
            int i5 = connect + 65;
            IconCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
        }
        if (Intrinsics.areEqual(active, "Y")) {
            OldDaySecurityBalanceCheckActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = OldDaySecurityBalanceCheckActivity.INSTANCE;
            OldDaySecurityBalanceCheckActivity.Companion.b(this);
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_rate_app_jmo", "go_rate_app_jmo"));
        Intrinsics.checkNotNullParameter("go_rate_app_jmo", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("go_rate_app_jmo", mapMutableMapOf);
        try {
            String packageName = mainActivity.getPackageName();
            StringBuilder sb = new StringBuilder(BuildConfig.MARKET_URL);
            sb.append(packageName);
            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
        } catch (ActivityNotFoundException unused) {
            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(BuildConfig.PLAY_STORE_URL.concat(String.valueOf(mainActivity.getPackageName())))));
        } catch (Exception unused2) {
            MainActivity mainActivity2 = mainActivity;
            String strConcat = BuildConfig.PLAY_STORE_URL.concat(String.valueOf(mainActivity.getPackageName()));
            Intrinsics.checkNotNullParameter(mainActivity2, "");
            Intrinsics.checkNotNullParameter(strConcat, "");
            WebviewFaqCustomActivity.Companion companion = WebviewFaqCustomActivity.INSTANCE;
            WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mainActivity2, strConcat, "");
        }
        Unit unit = Unit.INSTANCE;
        int i2 = connect + 47;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit TuitionPaymentFragmentbindingInflater1(MainActivity mainActivity, String str) {
        int i = 2 % 2;
        try {
            mainActivity.startActivity(new Intent(mainActivity, Class.forName(str)));
            int i2 = IconCompatParcelizer + 19;
            connect = i2 % 128;
            int i3 = i2 % 2;
        } catch (ClassNotFoundException e2) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(e2.getMessage()), 0).show();
        } catch (Exception e3) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(e3.getMessage()), 0).show();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IconCompatParcelizer + 1;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    private static final Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, MainActivity mainActivity) {
        int i;
        int i2 = 2 % 2;
        try {
            if (!StringsKt.contains((CharSequence) str, (CharSequence) "BalanceCheck", true)) {
                if (StringsKt.contains((CharSequence) str, (CharSequence) "Sertakan", true)) {
                    getMaxImages getmaximages = getMaxImages.INSTANCE;
                    if (!(!getMaxImages.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal())) {
                        SertakanWebviewActivity.Companion companion = SertakanWebviewActivity.INSTANCE;
                        SertakanWebviewActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mainActivity, "", "");
                    } else {
                        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion2 = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
                        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mainActivity, false, false, 6);
                    }
                } else {
                    mainActivity.startActivity(new Intent(mainActivity, Class.forName(str)));
                    i = IconCompatParcelizer + 77;
                }
                return Unit.INSTANCE;
            }
            mainActivity.onTransact();
            i = IconCompatParcelizer + 53;
            connect = i % 128;
            int i3 = i % 2;
        } catch (ClassNotFoundException e2) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(e2.getMessage()), 0).show();
        } catch (Exception e3) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(e3.getMessage()), 0).show();
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        Iterator<Fragment> it;
        int i = 2 % 2;
        int i2 = connect + 87;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onActivityResult(p0, p1, p2);
            it = getSupportFragmentManager().getFragments().iterator();
            int i3 = 29 / 0;
        } else {
            super.onActivityResult(p0, p1, p2);
            it = getSupportFragmentManager().getFragments().iterator();
        }
        while (it.hasNext()) {
            int i4 = IconCompatParcelizer + 51;
            connect = i4 % 128;
            int i5 = i4 % 2;
            it.next().onActivityResult(p0, p1, p2);
        }
    }

    @Subscribe(TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ThreadMode.MAIN)
    public final void onNewNotificationEvent(shouldUseFlashModeTorch p0) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        cancelAll();
        int i4 = connect + 61;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Subscribe(TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ThreadMode.MAIN)
    public final void onMaintenanceEvent(shouldUseTorchAsFlash p0) {
        int i = 2 % 2;
        int i2 = connect + 85;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        MaintenanceActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = MaintenanceActivity.INSTANCE;
        MaintenanceActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        int i4 = IconCompatParcelizer + 51;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Subscribe(TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ThreadMode.MAIN)
    public final void onUnauthorizedEvent(Camera2CameraCoordinator p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        String string = getString(R.string.error_message_session_ends);
        Intrinsics.checkNotNullExpressionValue(string, "");
        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, string, new Function0() { // from class: setSubMenu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (Unit) MainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr, 1704595236, -1704595227);
            }
        });
        int i2 = connect + 63;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent p0) {
        int i = 2 % 2;
        int i2 = connect + 57;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onNewIntent(p0);
        AppsFlyerLib.getInstance().performOnDeepLinking(p0, this);
        TuitionPaymentFragmentbindingInflater1(p0);
        int i4 = IconCompatParcelizer + 29;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00a3  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = connect + 97;
        IconCompatParcelizer = i2 % 128;
        String str = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_3).substring(14, 15).length() + 1500755704;
            if (i3 != 229839776 + (((-536973355) | (~length)) * (-490)) + (((~(length | 1467903953)) | (-2004877308)) * 490) + 953571218) {
                int[] iArr = new int[1771483429];
                iArr[1771483428] = 1;
                int i4 = 39419444 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i5 = connect + 1;
                IconCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            int i7 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i7 != 1940034408 + (((~((~iIdentityHashCode) | (-19988481))) | (~((-1409335388) | iIdentityHashCode))) * (-302)) + ((~((-19988481) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | (-1429323868))) | (-2008671712)) * 302)) {
                int[] iArr2 = new int[1771483429];
                iArr2[1771483428] = 1;
                int i8 = 39419444 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
                int i9 = connect + 1;
                IconCompatParcelizer = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        int i11 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step3).substring(1, 3).codePointAt(0) - 1438252267;
        int i12 = (~((-1995415612) | iCodePointAt)) | 583639073;
        int i13 = ~((~iCodePointAt) | 1995416891);
        if (i11 != 2011513330 + ((i12 | i13) * (-470)) + (((~(iCodePointAt | (-1411776539))) | i13) * 470)) {
            throw new RuntimeException("-1525260974");
        }
        cancelAll();
        super.onResume();
        User user = (User) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (user != null) {
            int i14 = IconCompatParcelizer + 59;
            connect = i14 % 128;
            int i15 = i14 % 2;
            str = user.b;
        }
        boolean zG = ((ApiCompatApi29Impl) this.notify.getValue()).TuitionPaymentFragmentbindingInflater1.g();
        String str2 = str;
        if (str2 == null || str2.length() == 0 || !zG) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.cancelAll, false, 4);
            d_();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
            super.onDestroy();
        } else {
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
            super.onDestroy();
            int i3 = 73 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        super.onBackPressed();
        Object obj = null;
        if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 1) {
            int i2 = IconCompatParcelizer + 103;
            connect = i2 % 128;
            int i3 = i2 % 2;
            mainActivity.finish();
            return null;
        }
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "tekan sekali lagi untuk keluar", 0).show();
        int i4 = IconCompatParcelizer + 37;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r14.equals("/co-marketing") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r14.equals("/menu") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r14.equals("bpu") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r14.equals("/jmo/perumahan-pekerja.html") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r14.equals("/jmo/cek-saldo.html") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        r12.cancelAll = r13;
        r14 = r13.getQueryParameter("type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r14 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r14 = com.bpjstku.presentation.main.MainActivity.IconCompatParcelizer + 79;
        com.bpjstku.presentation.main.MainActivity.connect = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if ((r14 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        r3 = r13.getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14, com.bpjstku.util.enums.BpjsServiceEnum.getInterfaceDescriptor.getType()) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        r10 = com.bpjstku.presentation.main.MainActivity.IconCompatParcelizer + 119;
        com.bpjstku.presentation.main.MainActivity.connect = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        if ((r10 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        r10 = 72 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, "/co-marketing") != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, "/co-marketing") != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14, com.bpjstku.util.enums.BpjsServiceEnum.f668a.getType()) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        r13 = com.bpjstku.presentation.danasiaga.DanaSiagaActivity.TuitionPaymentFragmentbindingInflater1;
        com.bpjstku.presentation.danasiaga.DanaSiagaActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ed, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14, com.bpjstku.util.enums.BpjsServiceEnum.asBinder.getType()) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
    
        r13 = com.bpjstku.presentation.investation.InvestmentListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        com.bpjstku.presentation.investation.InvestmentListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r12);
        r13 = com.bpjstku.presentation.main.MainActivity.connect + 31;
        com.bpjstku.presentation.main.MainActivity.IconCompatParcelizer = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010b, code lost:
    
        if ((r13 % 2) != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0119, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14, com.bpjstku.util.enums.BpjsServiceEnum.INotificationSideChannelStub.getType()) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, "bpu") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        r13 = r12.INotificationSideChannelDefault;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0123, code lost:
    
        if (r13 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0125, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0129, code lost:
    
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012a, code lost:
    
        r13 = r12;
        r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r13, com.bpjstku.util.enums.AppsFlyerEventEnum.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getType(), new java.util.LinkedHashMap());
        r14 = com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
        com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r13, false, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0142, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0147, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, "bpu") == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0149, code lost:
    
        r13 = com.bpjstku.presentation.main.MainActivity.connect + 101;
        com.bpjstku.presentation.main.MainActivity.IconCompatParcelizer = r13 % 128;
        r13 = r13 % 2;
        r13 = r12.INotificationSideChannelDefault;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        if (r13 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0156, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015a, code lost:
    
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015b, code lost:
    
        r13 = r12;
        r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r13, com.bpjstku.util.enums.AppsFlyerEventEnum.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getType(), new java.util.LinkedHashMap());
        r14 = com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
        com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r13, true, false, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14, com.bpjstku.util.enums.BpjsServiceEnum.cancelAll.getType()) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0181, code lost:
    
        startActivity(new android.content.Intent(r12, (java.lang.Class<?>) com.bpjstku.presentation.podcast.VideoListActivity.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0193, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, "/jmo/cek-saldo.html") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0195, code lost:
    
        r13 = com.bpjstku.presentation.main.MainActivity.IconCompatParcelizer + 5;
        com.bpjstku.presentation.main.MainActivity.connect = r13 % 128;
        r13 = r13 % 2;
        onTransact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, "/jmo/perumahan-pekerja.html") == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a8, code lost:
    
        ((defpackage.lambdaonVerticalScrollEvent0) r12.d.getValue()).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b4, code lost:
    
        ((com.bpjstku.databinding.ActivityMainBinding) ((androidx.viewbinding.ViewBinding) r12.INotificationSideChannelStubProxy.getValue())).bnvMain.setSelectedItemId(com.bpjstku.R.id.menu_home);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c4, code lost:
    
        r13 = r13.getQueryParameter("idtrx");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ca, code lost:
    
        if (r13 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cd, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ce, code lost:
    
        r13 = com.bpjstku.presentation.promo.CoMarketingActivity.b;
        com.bpjstku.presentation.promo.CoMarketingActivity.b.b(r12, true, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d6, code lost:
    
        return;
     */
    @Override // com.bpjstku.util.managers.AppsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TuitionPaymentFragmentbindingInflater1(android.net.Uri r13, com.bpjstku.util.managers.AppsFlyerManager.DeepLinkSource r14) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.main.MainActivity.TuitionPaymentFragmentbindingInflater1(android.net.Uri, com.bpjstku.util.managers.AppsFlyerManager$DeepLinkSource):void");
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = connect + 63;
        IconCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.managers.AppsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<String, ? extends Object> p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Objects.toString(p0);
        Object obj = p0.get("campaign");
        if (obj instanceof String) {
        }
        Object obj2 = p0.get("media_source");
        if (obj2 instanceof String) {
            int i2 = connect + 119;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        Object obj3 = p0.get(AppsFlyerProperties.CHANNEL);
        if (!(obj3 instanceof String)) {
            return;
        }
        int i4 = connect + 29;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
        } else {
            int i5 = 62 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 15, bArr[7], bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, offsetBefore, modifierMetaStateMask, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{23, 0, 16, '\n', 2, 22, 17, '\n', 24, 2, 11, 17, '\t', 3, '\b', 21, 19, 23, 2, 20, 1, 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_klikbca1).substring(21, 22).length() + 124), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1064).substring(0, 61).length() - 39, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{20, 3, 21, 0, 3, 24, 17, 5, 24, 21, 1, 5, 18, 19, 13827}, (byte) (4 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), View.resolveSize(0, 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
            int iMyTid = 1755 - (Process.myTid() >> 22);
            int i2 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b, b, (short) (-bArr2[2]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, iMyTid, i2, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = connect + 5;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i5 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, (short) (b3 | 88), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i5, iRgb, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i7 = ~i6;
            int i8 = ((((-1144866607) + (((~((-211476140) | i7)) | 1052298) * 168)) + ((~((-1052299) | i6)) * 168)) + (((~(i6 | (-210423842))) | ((~(i7 | (-1126287))) | 73988)) * 168)) - 584015986;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{5, 24, '\n', 23, '\n', 2, 23, 0, '\n', '\r', 18, 6, 1, '\t', 3, 23}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_card_register_error).substring(1, 2).length() + 100), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step2).substring(28, 29).codePointAt(0) - 81, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{18, 16, 3, '\b', 7, 16, 7, '\t', '\n', 0, '\t', 24, 20, 23, 18, 20}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step4).substring(89, 91).length() + 69), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-876075855};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42048 - ImageFormat.getBitsPerPixel(0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1726, TextUtils.lastIndexOf("", '0', 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -584015986);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                    int threadPriority = 1755 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int iGreen = Color.green(0) + 23;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr11 = new Object[1];
                    c(b4, b5, (short) (b5 | 88), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, threadPriority, iGreen, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new char[]{23, 0, 16, '\n', 2, 22, 17, '\n', 24, 2, 11, 17, '\t', 3, '\b', 21, 19, 23, 2, 20, 1, 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step2).substring(0, 3).codePointAt(0) + 75), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_atm_bersama).substring(1, 3).codePointAt(0) - 75, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new char[]{20, 3, 21, 0, 3, 24, 17, 5, 24, 21, 1, 5, 18, 19, 13827}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.epay_bri).substring(0, 9).length() - 5), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                        int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[7];
                        Object[] objArr14 = new Object[1];
                        c(b6, b6, (short) (-bArr3[2]), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, doubleTapTimeout, iResolveSizeAndState, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                        int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr15 = new Object[1];
                        c((byte) 15, bArr4[7], bArr4[28], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, edgeSlop, iIndexOf, 986134021, false, (String) objArr15[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        int i13 = i11 + ((((-833582122) + (((~((-281813569) | i12)) | (~((-69211143) | i12))) * 69)) + (((~(i12 | (-103978400))) | ((~((-316580826) | i12)) | 34767257)) * (-69))) - 849842016);
        int i14 = (i13 << 13) ^ i13;
        int i15 = i14 ^ (i14 >>> 17);
        ((int[]) objArr16[3])[0] = i15 ^ (i15 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
            int packedPositionChild2 = 14 - ExpandableListView.getPackedPositionChild(0L);
            byte b7 = $$a[7];
            byte b8 = b7;
            Object[] objArr17 = new Object[1];
            c(b7, b8, (short) (b8 | 140), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, iCombineMeasuredStates, packedPositionChild2, 1357589585, false, (String) objArr17[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr18 = new Object[1];
        e(new char[]{23, 0, 16, '\n', 2, 22, 17, '\n', 24, 2, 11, 17, '\t', 3, '\b', 21, 19, 23, 2, 20, 1, 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellSiteTitle).substring(0, 4).length() + 121), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr18);
        Class<?> cls4 = Class.forName((String) objArr18[0]);
        Object[] objArr19 = new Object[1];
        e(new char[]{20, 3, 21, 0, 3, 24, 17, 5, 24, 21, 1, 5, 18, 19, 13827}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_image_captured_failed).substring(6, 7).codePointAt(0) - 28), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr19);
        long jLongValue3 = ((Long) cls4.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1032;
            int i16 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            byte b9 = $$a[7];
            byte b10 = b9;
            Object[] objArr20 = new Object[1];
            c(b9, b10, (short) (b10 | 88), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, iLastIndexOf, i16, 1344079056, false, (String) objArr20[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i17 = IconCompatParcelizer + 31;
            connect = i17 % 128;
            int i18 = i17 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int size = View.MeasureSpec.getSize(0) + 1031;
                int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                Object[] objArr21 = new Object[1];
                c((byte) ($$b - 1), $$a[5], (short) DerHeader.TAG_CLASS_PRIVATE, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(keyRepeatDelay, size, absoluteGravity, 632103528, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr22[3])[0];
            int i20 = ((int[]) objArr22[1])[0];
            String[] strArr2 = (String[]) objArr22[0];
            int iNextInt = new Random().nextInt();
            int i21 = ~iNextInt;
            int i22 = (((1150803557 + (((~(iNextInt | 210216397)) | ((~((-492941) | i21)) | (-243787230))) * (-68))) + ((~((-33570833) | i21)) * (-68))) + (((~((-210216398) | i21)) | (-34063773)) * 68)) - 28412931;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[2])[0] = i24 ^ (i24 << 5);
            int i25 = IconCompatParcelizer + 1;
            connect = i25 % 128;
            int i26 = i25 % 2;
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{5, 24, '\n', 23, '\n', 2, 23, 0, '\n', '\r', 18, 6, 1, '\t', 3, 23}, (byte) (101 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (Process.myTid() >> 22) + 16, objArr23);
            Class<?> cls5 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{18, 16, 3, '\b', 7, 16, 7, '\t', '\n', 0, '\t', 24, 20, 23, 18, 20}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 60), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr24);
            int iIntValue2 = ((Integer) cls5.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-876075855};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46037), ImageFormat.getBitsPerPixel(0) + 1135, TextUtils.getOffsetBefore("", 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr26 = {Integer.valueOf(iIntValue2), 0, -28412931, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int iRgb2 = (-16776185) - Color.rgb(0, 0, 0);
                int i27 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte b11 = $$a[7];
                byte b12 = b11;
                Object[] objArr27 = new Object[1];
                c(b11, b12, (short) (b12 | 140), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveSizeAndState, iRgb2, i27, 1298546779, false, (String) objArr27[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getEdgeSlop() >> 16)), AndroidCharacter.getMirror('0') + 1069, 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr26);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i28 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                Object[] objArr28 = new Object[1];
                c((byte) ($$b - 1), $$a[5], (short) DerHeader.TAG_CLASS_PRIVATE, objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, i28, deadChar, 632103528, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr29 = new Object[1];
                e(new char[]{23, 0, 16, '\n', 2, 22, 17, '\n', 24, 2, 11, 17, '\t', 3, '\b', 21, 19, 23, 2, 20, 1, 22}, (byte) (124 - ExpandableListView.getPackedPositionChild(0L)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr29);
                Class<?> cls6 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                e(new char[]{20, 3, 21, 0, 3, 24, 17, 5, 24, 21, 1, 5, 18, 19, 13827}, (byte) (4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr30);
                long jLongValue4 = ((Long) cls6.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                    int i29 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i30 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte b13 = $$a[7];
                    byte b14 = b13;
                    Object[] objArr31 = new Object[1];
                    c(b13, b14, (short) (b14 | 88), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveSizeAndState2, i29, i30, 1344079056, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int threadPriority2 = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    byte b15 = $$a[7];
                    byte b16 = b15;
                    Object[] objArr32 = new Object[1];
                    c(b15, b16, (short) (b16 | 140), objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c4, threadPriority2, minimumFlingVelocity, 1357589585, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr[1])[0];
        int i32 = ((int[]) objArr[3])[0];
        if (i32 == i31) {
            Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i36 = ~((-584159828) | iIdentityHashCode);
            int i37 = 760789189 + ((4194881 | i36) * (-280)) + ((i36 | (~(339879657 | iIdentityHashCode))) * 140);
            int i38 = ~((-579964947) | iIdentityHashCode);
            int i39 = ~iIdentityHashCode;
            int i40 = i33 + i37 + (((~(i39 | 919844603)) | i38 | (~((-4194882) | i39))) * 140);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr33[2])[0] = i42 ^ (i42 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i43 = 0;
            while (i43 < strArr4.length) {
                int i44 = IconCompatParcelizer + 111;
                connect = i44 % 128;
                if (i44 % 2 == 0) {
                    arrayList2.add(strArr4[i43]);
                    i43 += 87;
                } else {
                    arrayList2.add(strArr4[i43]);
                    i43++;
                }
            }
        }
        Toast.makeText((Context) null, i32 / (((i32 - 1) * i32) % 2), 0).show();
        Object[] objArr34 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i45 = ((int[]) objArr[2])[0];
        int i46 = ((int[]) objArr[3])[0];
        int i47 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i48 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i49 = ~((-210223544) | i48);
        int i50 = (-862155227) + ((209731589 | i49) * (-280)) + ((i49 | (~((-34056627) | i48))) * 140);
        int i51 = ~((-491955) | i48);
        int i52 = ~i48;
        int i53 = i45 + i50 + (((~(i52 | (-33564673))) | i51 | (~((-209731590) | i52))) * 140);
        int i54 = i53 ^ (i53 << 13);
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr34[2])[0] = i55 ^ (i55 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i5 = (-1427393424) + ((iNextInt | 867522358) * (-50));
        int i6 = ~((-311428403) | iNextInt);
        int i7 = ~iNextInt;
        if (i4 != i5 + ((i6 | (~(2008938303 | i7))) * 50) + (((~(i7 | 867522358)) | (~(1697509901 | i7)) | (-2008938304)) * 50)) {
            int i8 = 1162996540 % 2;
            throw new ArithmeticException();
        }
        int i9 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i10 = ~System.identityHashCode(this);
        if (i9 != (-62883594) + (((~((-696575928) | i10)) | (-1882480038)) * (-933)) + (((~(i10 | (-1882480038))) | 1345329152) * 933) + 1868039784) {
            int i11 = 561643116 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i12 = connect + 77;
        IconCompatParcelizer = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -567514050
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    private static /* synthetic */ java.lang.Object asBinder(java.lang.Object[] r10) {
        /*
            r0 = 0
            r1 = r10[r0]
            com.bpjstku.presentation.main.MainActivity r1 = (com.bpjstku.presentation.main.MainActivity) r1
            r2 = 1
            r10 = r10[r2]
            android.os.Bundle r10 = (android.os.Bundle) r10
            r3 = 2
            int r4 = r3 % r3
            java.lang.reflect.Member[] r4 = defpackage.CameraUseCaseAdapter.b
            r4 = r4[r0]
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r5 = 0
            int r4 = r4.getInt(r5)
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            r7 = 773261938(0x2e170a72, float:3.4342702E-11)
            int r6 = r6.nextInt(r7)
            int r7 = ~r6
            r8 = -579561858(0xffffffffdd74967e, float:-1.1015258E18)
            r8 = r8 | r7
            int r8 = ~r8
            r9 = 1409549400(0x54040458, float:2.2680342E12)
            r8 = r8 | r9
            r9 = -1433667163(0xffffffffaa8bf9a5, float:-2.4864586E-13)
            r6 = r6 | r9
            int r6 = ~r6
            r6 = r6 | r8
            int r6 = r6 * (-68)
            r8 = 270640160(0x1021a420, float:3.187809E-29)
            int r8 = r8 + r6
            r6 = -24117763(0xfffffffffe8ffdfd, float:-9.569919E37)
            r6 = r6 | r7
            int r6 = ~r6
            int r6 = r6 * (-68)
            int r8 = r8 + r6
            r6 = 1433667162(0x5574065a, float:1.6769257E13)
            r6 = r6 | r7
            int r6 = ~r6
            r7 = -603679620(0xffffffffdc04947c, float:-1.4927183E17)
            r6 = r6 | r7
            int r6 = r6 * 68
            int r8 = r8 + r6
            if (r4 == r8) goto L81
            int r4 = com.bpjstku.presentation.main.MainActivity.IconCompatParcelizer
            int r4 = r4 + 7
            int r6 = r4 % 128
            com.bpjstku.presentation.main.MainActivity.connect = r6
            int r4 = r4 % r3
            r6 = -1
            r7 = -567514051(0xffffffffde2c6c3d, float:-3.106093E18)
            r8 = -567514050(0xffffffffde2c6c3e, float:-3.1060934E18)
            if (r4 != 0) goto L70
            int[] r4 = new int[r8]
            r4[r7] = r2
            r4 = r4[r6]
            android.widget.Toast r2 = android.widget.Toast.makeText(r5, r4, r2)
            r2.show()
            goto L81
        L70:
            int[] r4 = new int[r8]
            r4[r7] = r2
            r7 = 216527558(0xce7f2c6, float:3.57373E-31)
            int r7 = r7 % r3
            r4 = r4[r6]
            android.widget.Toast r2 = android.widget.Toast.makeText(r5, r4, r2)
            r2.show()
        L81:
            java.lang.reflect.Member[] r2 = defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r0 = r2[r0]
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r0 = r0.getInt(r5)
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            int r2 = r2.nextInt()
            r4 = -69477379(0xfffffffffbdbdbfd, float:-2.2831498E36)
            r6 = r4 | r2
            int r6 = ~r6
            r7 = 1635942688(0x61828120, float:3.0092265E20)
            r6 = r6 | r7
            int r6 = r6 * 501
            r7 = -1432872494(0xffffffffaa9819d2, float:-2.701854E-13)
            int r6 = r6 + r7
            int r2 = ~r2
            r2 = r2 | r4
            int r2 = ~r2
            int r2 = r2 * 501
            int r6 = r6 + r2
            if (r0 != r6) goto Lbc
            super.onCreate(r10)
            int r10 = com.bpjstku.presentation.main.MainActivity.connect
            int r10 = r10 + 45
            int r0 = r10 % 128
            com.bpjstku.presentation.main.MainActivity.IconCompatParcelizer = r0
            int r10 = r10 % r3
            if (r10 != 0) goto Lbb
            return r5
        Lbb:
            throw r5
        Lbc:
            r10 = -216805882(0xfffffffff313ce06, float:-1.1710301E31)
            int r10 = r10 % r3
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.main.MainActivity.asBinder(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(MainActivity mainActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        connect = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setSelectedItemId(R.id.menu_home);
        Unit unit = Unit.INSTANCE;
        int i4 = connect + 65;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit b(MainActivity mainActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = connect;
        int i3 = i2 + 117;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i2 + 25;
            IconCompatParcelizer = i5 % 128;
            if (i5 % 2 != 0) {
                mainActivity.MediaBrowserCompat();
                obj.hashCode();
                throw null;
            }
            mainActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i6 = i2 + 57;
            IconCompatParcelizer = i6 % 128;
            if (i6 % 2 != 0) {
                mainActivity.IconCompatParcelizer();
                obj.hashCode();
                throw null;
            }
            mainActivity.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i7 = i2 + 35;
            IconCompatParcelizer = i7 % 128;
            if (i7 % 2 != 0) {
                mainActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                throw null;
            }
            mainActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Exception exc) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        exc.printStackTrace();
        int i4 = IconCompatParcelizer + 89;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ WindowInsetsCompat TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = connect + 119;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = insets.bottom;
        view.setLayoutParams(layoutParams2);
        int i4 = IconCompatParcelizer + 65;
        connect = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompat;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(MainActivity mainActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = connect + 31;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                mainActivity.MediaBrowserCompat();
                obj.hashCode();
                throw null;
            }
            mainActivity.MediaBrowserCompat();
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            int i3 = connect + 103;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            mainActivity.IconCompatParcelizer();
            MltItem mltItem = (MltItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            String str = mltItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String string = mainActivity.getString(R.string.label_additional_services);
            Intrinsics.checkNotNullExpressionValue(string, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity, str, string, 0, null, false, 56);
            int i5 = IconCompatParcelizer + 83;
            connect = i5 % 128;
            int i6 = i5 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i7 = IconCompatParcelizer + 39;
            connect = i7 % 128;
            int i8 = i7 % 2;
            mainActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        if (!((Boolean) objArr[1]).booleanValue()) {
            int i2 = IconCompatParcelizer + 7;
            connect = i2 % 128;
            int i3 = i2 % 2;
            AutoValue_LifecycleCameraRepository_Key.b(mainActivity, "Notifikasi tidak diizinkan pada perangkat Anda.");
            int i4 = IconCompatParcelizer + 79;
            connect = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 3;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(MainActivity mainActivity, MenuItem menuItem) {
        String str;
        int i = 2 % 2;
        int i2 = connect + 13;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        mainActivity.findViewById(R.id.layoutMainToolbar);
        if (((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.getSelectedItemId() != menuItem.getItemId()) {
            switch (menuItem.getItemId()) {
                case R.id.menu_digital_card /* 2131428832 */:
                    mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "bottom_menu_digital_card";
                    DigitalCardActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = DigitalCardActivity.INSTANCE;
                    DigitalCardActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mainActivity);
                    return false;
                case R.id.menu_done /* 2131428833 */:
                case R.id.menu_loader /* 2131428835 */:
                case R.id.menu_notification /* 2131428837 */:
                default:
                    MainActivity mainActivity2 = mainActivity;
                    String str2 = mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    Intrinsics.checkNotNullParameter(mainActivity2, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                    TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, mapMutableMapOf);
                    int i4 = connect + 67;
                    IconCompatParcelizer = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                case R.id.menu_home /* 2131428834 */:
                    mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "bottom_menu_home";
                    User user = (User) mainActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                    String str3 = null;
                    if (user != null) {
                        int i6 = IconCompatParcelizer + 107;
                        connect = i6 % 128;
                        if (i6 % 2 == 0) {
                            str = user.RemoteActionCompatParcelizer;
                            int i7 = 20 / 0;
                        } else {
                            str = user.RemoteActionCompatParcelizer;
                        }
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, "Y")) {
                        User user2 = (User) mainActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                        if (user2 != null) {
                            int i8 = IconCompatParcelizer + 89;
                            connect = i8 % 128;
                            if (i8 % 2 == 0) {
                                String str4 = user2.INotificationSideChannelStubProxy;
                                str3.hashCode();
                                throw null;
                            }
                            str3 = user2.INotificationSideChannelStubProxy;
                        }
                        if (Intrinsics.areEqual(str3, ExifInterface.GPS_DIRECTION_TRUE)) {
                            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mainActivity, R.id.mainContainer, new closeMode(), false);
                        } else if (Intrinsics.areEqual((String) mainActivity.getInterfaceDescriptor.getValue(), "PELAPOR")) {
                            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mainActivity, R.id.mainContainer, new closeMode(), false);
                        } else {
                            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mainActivity, R.id.mainContainer, new refreshVisibility(), false);
                        }
                    } else if (Intrinsics.areEqual((String) mainActivity.getInterfaceDescriptor.getValue(), "PELAPOR")) {
                        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mainActivity, R.id.mainContainer, new closeMode(), false);
                    } else {
                        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mainActivity, R.id.mainContainer, new refreshVisibility(), false);
                    }
                    MainActivity mainActivity3 = mainActivity;
                    String str5 = mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("menu_name", mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    Intrinsics.checkNotNullParameter(mainActivity3, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                    TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter(str5, "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str5, mapMutableMapOf2);
                    int i9 = connect + 67;
                    IconCompatParcelizer = i9 % 128;
                    int i10 = i9 % 2;
                    break;
                case R.id.menu_news /* 2131428836 */:
                    mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "bottom_menu_news";
                    Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mainActivity, R.id.mainContainer, new EngagementSignalsCallback(), false);
                    break;
                case R.id.menu_profile /* 2131428838 */:
                    mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "bottom_menu_profile";
                    Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mainActivity, R.id.mainContainer, new getClipDataUrisactivity(), false);
                    MainActivity mainActivity4 = mainActivity;
                    String str6 = mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("menu_name", mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    Intrinsics.checkNotNullParameter(mainActivity4, "");
                    Intrinsics.checkNotNullParameter(str6, "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                    TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter(str6, "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str6, mapMutableMapOf3);
                    int i11 = connect + 67;
                    IconCompatParcelizer = i11 % 128;
                    int i12 = i11 % 2;
                    break;
            }
        }
        return true;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(MainActivity mainActivity) {
        int i = 2 % 2;
        mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_rate_app_jmo", "dissmiss_rate_app_jmo"));
        Intrinsics.checkNotNullParameter("dissmiss_rate_app_jmo", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("dissmiss_rate_app_jmo", mapMutableMapOf);
        Unit unit = Unit.INSTANCE;
        int i2 = IconCompatParcelizer + 49;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = connect + 51;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        setCurrentRunnable setcurrentrunnableTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((access000) mainActivity.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i4 = IconCompatParcelizer + 117;
        connect = i4 % 128;
        int i5 = i4 % 2;
        return setcurrentrunnableTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    public static /* synthetic */ Unit b(MainActivity mainActivity, PendingDynamicLinkData pendingDynamicLinkData) {
        Uri link;
        int i;
        int i2 = 2 % 2;
        if (pendingDynamicLinkData != null) {
            int i3 = IconCompatParcelizer + 103;
            connect = i3 % 128;
            int i4 = i3 % 2;
            link = pendingDynamicLinkData.getLink();
        } else {
            link = null;
        }
        if (link != null && link.isHierarchical()) {
            String path = link.getPath();
            if (path != null) {
                switch (path.hashCode()) {
                    case -898497306:
                        if (!path.equals("/jmo/cek-saldo.html")) {
                            ((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setSelectedItemId(R.id.menu_home);
                        } else {
                            mainActivity.cancelAll = link;
                            mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(link);
                        }
                        break;
                    case -508206987:
                        if (!path.equals("/jmo/perumahan-pekerja.html")) {
                            ((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setSelectedItemId(R.id.menu_home);
                        } else {
                            mainActivity.cancelAll = link;
                            mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(link);
                        }
                        break;
                    case -97861643:
                        if (!path.equals("/podcast")) {
                            ((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setSelectedItemId(R.id.menu_home);
                        } else {
                            String queryParameter = link.getQueryParameter("videoId");
                            Intent intent = new Intent(mainActivity, (Class<?>) VideoPlayerActivity.class);
                            intent.putExtra("videoId", queryParameter);
                            intent.putExtra("isDeepLink", true);
                            mainActivity.startActivity(intent);
                        }
                        break;
                    case 1497944:
                        if (!path.equals("/bpu")) {
                            ((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setSelectedItemId(R.id.menu_home);
                        } else {
                            mainActivity.cancelAll = link;
                            mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(link);
                        }
                        break;
                    case 46753294:
                        if (!path.equals("/menu")) {
                            ((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setSelectedItemId(R.id.menu_home);
                        } else {
                            mainActivity.cancelAll = link;
                            mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(link);
                        }
                        break;
                    case 204166068:
                        if (!path.equals("/co-marketing")) {
                            i = IconCompatParcelizer + 15;
                            connect = i % 128;
                            int i5 = i % 2;
                            ((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setSelectedItemId(R.id.menu_home);
                        } else {
                            mainActivity.cancelAll = link;
                            mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(link);
                        }
                        break;
                    default:
                        i = connect + 55;
                        IconCompatParcelizer = i % 128;
                        int i6 = i % 2;
                        ((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setSelectedItemId(R.id.menu_home);
                        break;
                }
            } else {
                ((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).bnvMain.setSelectedItemId(R.id.menu_home);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(MainActivity mainActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_notification_menu", "click_notification"));
        Intrinsics.checkNotNullParameter(mainActivity, "");
        Intrinsics.checkNotNullParameter("view_notification", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_notification", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_notification", mapMutableMapOf);
        NotificationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = NotificationActivity.INSTANCE;
        NotificationActivity.Companion.b(mainActivity);
        Unit unit = Unit.INSTANCE;
        int i2 = connect + 21;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = connect + 89;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            throw null;
        }
        function1.invoke(obj);
        int i3 = connect + 43;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ String a(MainActivity mainActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        connect = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = mainActivity.getIntent().getStringExtra("key_jenis_form");
        int i4 = connect + 105;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public static /* synthetic */ outputFormatToAudioProfile asBinder(MainActivity mainActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(mainActivity);
        int i2 = IconCompatParcelizer + 41;
        connect = i2 % 128;
        int i3 = i2 % 2;
        return outputformattoaudioprofile;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(MainActivity mainActivity, Task task) throws Throwable {
        final String str;
        int length;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        int i2 = connect + 73;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (str = (String) task.getResult()) == null) {
            return;
        }
        final ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        Intrinsics.checkNotNullParameter(str, "");
        VideoEncoderSession1 videoEncoderSession1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
        Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofileB, "");
        appendBackupVideoProfile appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1 = dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
        Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1, "");
        VideoEncoderSession1 videoEncoderSession1TuitionPaymentFragmentbindingInflater1 = VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(((finalizeWithError) share.b(new suspend(appendbackupvideoprofileB, appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1), "transformer is null")).TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoEncoderSession1TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        formatInterval formatinterval = new formatInterval() { // from class: getSupportedHdrTypes
            @Override // defpackage.formatInterval
            public final void run() throws IOException {
                ActivityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentbindingInflater1(activityResultContractsPickVisualMediaMediaCapabilities, str);
            }
        };
        final Function1 function1 = new Function1() { // from class: toApplicationMediaCapabilitiesactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateB = videoEncoderSession1TuitionPaymentFragmentbindingInflater1.b(formatinterval, new logToString() { // from class: ActivityResultContractsPickVisualMediaSingleMimeType
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateB, "");
        acquireBuffer acquirebuffer = activityResultContractsPickVisualMediaMediaCapabilities.b;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
            int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr = $$a;
            Object[] objArr = new Object[1];
            c((byte) 15, bArr[7], bArr[28], objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, iKeyCodeFromString, scrollDefaultDelay, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        e(new char[]{23, 0, 16, '\n', 2, 22, 17, '\n', 24, 2, 11, 17, '\t', 3, '\b', 21, 19, 23, 2, 20, 1, 22}, (byte) (TextUtils.getTrimmedLength("") + 125), 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(new char[]{20, 3, 21, 0, 3, 24, 17, 5, 24, 21, 1, 5, 18, 19, 13827}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 5), View.resolveSize(0, 0) + 15, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
            int size = 23 - View.MeasureSpec.getSize(0);
            byte[] bArr2 = $$a;
            byte b = bArr2[7];
            Object[] objArr4 = new Object[1];
            c(b, b, (short) (-bArr2[2]), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, iCombineMeasuredStates, size, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                int i4 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iAlpha = 23 - Color.alpha(0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                c(b2, b3, (short) (b3 | 88), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i4, iAlpha, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = ~(594218735 | elapsedCpuTime);
            int i6 = ~elapsedCpuTime;
            int i7 = ((((-1673912685) + ((i5 | (~((-57148103) | i6))) * (-406))) + ((~(863969263 | i6)) * (-406))) + (((~(elapsedCpuTime | (-806821162))) | (~((-594218736) | i6))) * 406)) - 1141294452;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            if (str != null) {
                int i10 = connect + 43;
                IconCompatParcelizer = i10 % 128;
                int i11 = i10 % 2;
                length = str.length();
            } else {
                length = 0;
            }
            try {
                Object[] objArr7 = {-1304801320};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1725, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(length, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr7), -1141294452);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                    int mode = 1755 - View.MeasureSpec.getMode(0);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr8 = new Object[1];
                    c(b4, b5, (short) (b5 | 88), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, mode, keyRepeatDelay, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{23, 0, 16, '\n', 2, 22, 17, '\n', 24, 2, 11, 17, '\t', 3, '\b', 21, 19, 23, 2, 20, 1, 22}, (byte) (125 - TextUtils.indexOf("", "")), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{20, 3, 21, 0, 3, 24, 17, 5, 24, 21, 1, 5, 18, 19, 13827}, (byte) (4 - (ViewConfiguration.getTapTimeout() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 15, objArr10);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                        int iResolveSize = 1755 - View.resolveSize(0, 0);
                        int keyRepeatDelay2 = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[7];
                        Object[] objArr11 = new Object[1];
                        c(b6, b6, (short) (-bArr3[2]), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, iResolveSize, keyRepeatDelay2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                        int iRgb = Color.rgb(0, 0, 0) + 16778971;
                        int i12 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((byte) 15, bArr4[7], bArr4[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iRgb, i12, 986134021, false, (String) objArr12[0], null);
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
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i14 == i13) {
            int i15 = connect + 91;
            IconCompatParcelizer = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i18 = (int) Runtime.getRuntime().totalMemory();
            int i19 = i17 + (-1609118391) + (((~((-234889229) | (~i18))) | (~((-22286803) | i18))) * (-272)) + (((~((-774041102) | i18)) | 539151873) * (-272)) + (((~(i18 | 774041101)) | (-561438676)) * 272);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr13[3])[0] = i21 ^ (i21 << 5);
            int i22 = connect + 37;
            IconCompatParcelizer = i22 % 128;
            int i23 = i22 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                int i24 = connect + 7;
                IconCompatParcelizer = i24 % 128;
                for (int i25 = i24 % 2 != 0 ? 1 : 0; i25 < strArr.length; i25++) {
                    int i26 = IconCompatParcelizer + 71;
                    connect = i26 % 128;
                    int i27 = i26 % 2;
                    arrayList.add(strArr[i25]);
                }
            }
            int[] iArr = new int[i14];
            int i28 = i14 - 1;
            iArr[i28] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i28) % 2) - 1], 1).show();
            int i29 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i30 = ~iMaxMemory;
            int i31 = i29 + 363407463 + (((~(i30 | (-322100897))) | 2101792 | (~((-214704219) | iMaxMemory))) * 717) + (((~(iMaxMemory | (-322100897))) | (~(i30 | (-214704219))) | 2101792) * 717);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr14[3])[0] = i33 ^ (i33 << 5);
        }
        acquirebuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateB);
        VideoEncoderSession1 videoEncoderSession1B = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(str);
        appendBackupVideoProfile appendbackupvideoprofileB2 = isSamsungJ2.b();
        Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofileB2, "");
        appendBackupVideoProfile appendbackupvideoprofileTuitionPaymentFragmentbindingInflater2 = dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
        Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofileTuitionPaymentFragmentbindingInflater2, "");
        VideoEncoderSession1 videoEncoderSession1TuitionPaymentFragmentbindingInflater2 = VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(((finalizeWithError) share.b(new suspend(appendbackupvideoprofileB2, appendbackupvideoprofileTuitionPaymentFragmentbindingInflater2), "transformer is null")).TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoEncoderSession1B));
        formatInterval formatinterval2 = new formatInterval() { // from class: ActivityResultContractsRequestMultiplePermissions
            @Override // defpackage.formatInterval
            public final void run() {
                activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(str);
            }
        };
        final Function1 function2 = new Function1() { // from class: createIntentactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContractsPickVisualMediaMediaCapabilities.b((Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateB2 = videoEncoderSession1TuitionPaymentFragmentbindingInflater2.b(formatinterval2, new logToString() { // from class: ActivityResultContractsStartActivityForResultCompanion
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateB2, "");
        activityResultContractsPickVisualMediaMediaCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateB2);
    }

    public static /* synthetic */ User asInterface(MainActivity mainActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        connect = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = connect + 55;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return userAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(MainActivity mainActivity, View view) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        EWalletActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = EWalletActivity.INSTANCE;
        EWalletActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = IconCompatParcelizer + 13;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(MainActivity mainActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            mainActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            User user = (User) mainActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            if (user != null) {
                int i2 = IconCompatParcelizer + 105;
                connect = i2 % 128;
                int i3 = i2 % 2;
                str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                str = null;
            }
            NotificationBadgeRequest notificationBadgeRequest = new NotificationBadgeRequest(String.valueOf(str));
            Intrinsics.checkNotNullParameter(notificationBadgeRequest, "");
            b.TuitionPaymentFragmentbindingInflater1(ViewModelKt.getViewModelScope(activityResultContractsPickVisualMediaMediaCapabilities), null, null, new AccountViewModel$notificationBadge$$inlined$handleApiCall$1(activityResultContractsPickVisualMediaMediaCapabilities.g, null, activityResultContractsPickVisualMediaMediaCapabilities, notificationBadgeRequest), 3, null);
            int i4 = IconCompatParcelizer + 5;
            connect = i4 % 128;
            int i5 = i4 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = connect + 103;
            IconCompatParcelizer = i6 % 128;
            if (i6 % 2 != 0) {
                mainActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                throw null;
            }
            mainActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(MainActivity mainActivity, setOnImageAvailableListener setonimageavailablelistener) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setonimageavailablelistener, "");
            boolean z = setonimageavailablelistener instanceof setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setonimageavailablelistener, "");
        if (setonimageavailablelistener instanceof setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            mainActivity.MediaBrowserCompat();
        } else if (setonimageavailablelistener instanceof setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            mainActivity.IconCompatParcelizer();
            ImageView imageView = ((ActivityMainBinding) ((ViewBinding) mainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutMainToolbar.imgUnreadIndicator;
            setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2) setonimageavailablelistener;
            ((PackageIdentityUtilsSignaturesCompat) mainActivity.onTransact.getValue()).b.saveBoolean("unread_notif", Intrinsics.areEqual(((ActivityResultRegistryExternalSyntheticLambda1) tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentbindingInflater1, Boolean.FALSE));
            imageView.setVisibility(Intrinsics.areEqual(((ActivityResultRegistryExternalSyntheticLambda1) tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentbindingInflater1, Boolean.FALSE) ^ true ? 8 : 0);
        } else {
            if (!(setonimageavailablelistener instanceof setOnImageAvailableListener.b)) {
                throw new NoWhenBranchMatchedException();
            }
            mainActivity.IconCompatParcelizer();
            int i3 = IconCompatParcelizer + 9;
            connect = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        connect = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IconCompatParcelizer + 3;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(MainActivity mainActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{mainActivity}, 1704595236, -1704595227);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(MainActivity mainActivity, String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{mainActivity, str}, -405874759, 405874760);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(String str, MainActivity mainActivity) {
        int i = 2 % 2;
        int i2 = connect + 33;
        IconCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, mainActivity);
            obj.hashCode();
            throw null;
        }
        Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, mainActivity);
        int i3 = connect + 93;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            return unitTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(MainActivity mainActivity, Boolean bool) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{mainActivity, bool}, 322151340, -322151333);
    }

    public static /* synthetic */ setCurrentRunnable TuitionPaymentFragmentspecialinlinedviewModeldefault3(MainActivity mainActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (setCurrentRunnable) TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{mainActivity}, 1351093786, -1351093786);
    }

    public static /* synthetic */ Unit b(MainActivity mainActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {mainActivity};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr, -2024625462, 2024625466);
        int i4 = connect + 61;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    static {
        read = 1;
        g();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompat + 19;
        read = i % 128;
        int i2 = i % 2;
    }

    private static final Unit g(MainActivity mainActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{mainActivity}, -2024625462, 2024625466);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 1851646502;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iCodePointAt, (-17837153) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_2).substring(5, 6).codePointAt(0), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this}, 2142352876, -2142352873);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this}, 1973717086, -1973717081);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this}, 1422191048, -1422191046);
    }

    @Override // com.bpjstku.util.managers.AppsFlyerManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this, p0}, 1955450836, -1955450828);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this, bundle}, -1891285777, 1891285783);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = connect + 59;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = connect + 81;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        INotificationSideChannelStub = new char[]{60055, 60043, 60056, 60053, 60040, 60083, 60047, 60073, 60034, 60049, 60057, 60041, 60117, 60045, 60060, 60063, 60072, 60050, 60054, 60051, 60058, 60048, 60052, 60062, 60088};
        write = (char) 57188;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = connect + 47;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return TuitionPaymentFragmentbindingInflater1(mainActivity, str);
        }
        TuitionPaymentFragmentbindingInflater1(mainActivity, str);
        throw null;
    }

    private static String $$i(short s, short s2, byte b) {
        int i = b + 4;
        int i2 = 116 - s2;
        byte[] bArr = $$c;
        int i3 = s * 4;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i2 += i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            i++;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i];
        }
    }
}
