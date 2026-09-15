package com.bpjstku.presentation.util;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.net.MailTo;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.databinding.ActivityWebviewFaqCustomBinding;
import com.bpjstku.databinding.LayoutToolbarCenterBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.OutputConfigurationCompatApi28Impl;
import defpackage.VideoEncoderSessionVideoEncoderState;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.acquireBuffer;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deInitSession;
import defpackage.getConfigs;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getMaxImages;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.setQuickZoomEnabled;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003(&\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0006\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0006\u0010\u0018J\u0017\u0010\u0007\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0007\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u0004J-\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\u0006\u0010\u0014\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0014¢\u0006\u0004\b$\u0010\u0004R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b'\u0010%R\u0018\u0010\u000f\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010\u0007\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00118\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0007\u0010-R$\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u001a\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010+\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u00105R\u0016\u0010\n\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010,R\u0014\u00107\u001a\u00020\u00118\u0002X\u0083D¢\u0006\u0006\n\u0004\b&\u0010-R\u0015\u00103\u001a\u0002088CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b7\u00109R\u0015\u0010'\u001a\u00020:8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b1\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0015\u0010\u0019\u001a\u00020>8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0015\u0010@\u001a\u00020?8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010\u000b\u001a\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010AR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00020B8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010D"}, d2 = {"Lcom/bpjstku/presentation/util/WebviewFaqCustomActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityWebviewFaqCustomBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Ljava/lang/String;", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "", "(Ljava/lang/String;)Z", "onTransact", "", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/view/KeyEvent;", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onDestroy", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "cancelAll", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/user/model/User;", "Lcom/bpjstku/domain/user/model/User;", "d", "Z", "I", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "Landroid/webkit/ValueCallback;", "g", "Ljava/io/File;", "INotificationSideChannel", "Ljava/io/File;", "Landroid/net/Uri;", "RemoteActionCompatParcelizer", "cancel", "LoutputFormatToAudioProfile;", "Lkotlin/Lazy;", "LacquireBuffer;", "Landroid/content/Context;", "Landroid/content/Context;", "notify", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "LgetStreamUseCaseSupportedCombinationList;", "INotificationSideChannelStub", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebviewFaqCustomActivity extends BindingBaseActivity<ActivityWebviewFaqCustomBinding> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long INotificationSideChannelStub;
    private static int MediaBrowserCompat;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private File a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public Context notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy onTransact;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private Uri d;
    private ValueCallback<Uri[]> asInterface;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy cancelAll;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private User TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy INotificationSideChannelStub;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$j = {117, -15, -81, 1, -12, 11, -13, 4, 7, 6, 55, -68, -1, 6, 1, 2, -2, -1, 71, -71, 67, 7, -62, 9, 2, -4, 9, 52, -68, 15, -13, 1, 11, -5, 2, 65, -30, -23, 2, -4, 9, 31, -43, 2, -5, 3, 4, 4, 1, 8, -12, 48, -43, 3, -2, 16, -18, 52, -46, 8, 56, 2, 14, -47, -29, 18, -12, -4, 4, 2, -2, -1, 50, -43, 2, -5, 3, 4, 4, -6, -32, 13, -10, 12, -5, 2, 31, -16, -23, 13, 9, -8, -5, 47, -43, 18, -5, -5, 9, -8, -5, 2, 4, 12, 3, -5, 9, -10, 4, -4, 3, 4, -4, 10, 2, -17, 14, 5, -17, 43, -33, 12, 0, -6, 9, 0, 0, 6, -19, 10, -7, 68};
    private static final int $$k = 47;
    private static final byte[] $$a = {58, -103, 118, 14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 79;
    private static int read = 0;
    private static int INotificationSideChannelDefault = 0;
    private static int IconCompatParcelizer = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean asBinder = true;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int cancel = 11;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy INotificationSideChannel = LazyKt.lazy(new Function0() { // from class: getOnePlus6TExcludedSizes
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i4) | i7);
        int i9 = (~i2) | (~(i7 | i4));
        int i10 = i4 | i2 | i7;
        int i11 = i2 + i3 + i6 + (1635157569 * i5) + ((-1141649966) * i);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i2) - 711983104) + (488484398 * i3) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i6) + (1462763520 * i5) + (1566572544 * i) + (1631846400 * i12);
        int i14 = (i2 * 1521345644) + 2088555610 + (i3 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i6 * 1521345871) + (i5 * (-1382509809)) + (i * 37969358) + (i12 * (-671350784));
        switch (i13 + (i14 * i14 * (-1069809664))) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 2:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 3:
                int i15 = 2 % 2;
                int i16 = IconCompatParcelizer + 5;
                INotificationSideChannelDefault = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 4:
                return b(objArr);
            case 5:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 6:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return a(objArr);
            case 9:
                return d(objArr);
            default:
                WebviewFaqCustomActivity webviewFaqCustomActivity = (WebviewFaqCustomActivity) objArr[0];
                int i18 = 2 % 2;
                int i19 = INotificationSideChannelDefault + 25;
                int i20 = i19 % 128;
                IconCompatParcelizer = i20;
                int i21 = i19 % 2;
                int i22 = webviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i23 = i20 + 41;
                INotificationSideChannelDefault = i23 % 128;
                int i24 = i23 % 2;
                return Integer.valueOf(i22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 103 - r7
            int r9 = r9 + 4
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.util.WebviewFaqCustomActivity.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r5 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r9]
            r6 = r3
            r3 = r7
            r7 = r6
        L25:
            int r9 = r9 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewFaqCustomActivity.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 76
            int r6 = 79 - r6
            byte[] r0 = com.bpjstku.presentation.util.WebviewFaqCustomActivity.$$j
            int r5 = r5 * 13
            int r5 = 97 - r5
            int r7 = r7 * 24
            int r1 = 77 - r7
            byte[] r1 = new byte[r1]
            int r7 = 76 - r7
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2c:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewFaqCustomActivity.f(int, short, short, java.lang.Object[]):void");
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 91;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $11 + 43;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.getOffsetAfter("", 0) + 2624, 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (INotificationSideChannelStub ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39422), (ViewConfiguration.getTapTimeout() >> 16) + 481, Color.red(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 39422), TextUtils.indexOf((CharSequence) "", '0', 0) + 482, 37 - TextUtils.getOffsetAfter("", 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.util.WebviewFaqCustomActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/bpjstku/presentation/util/WebviewFaqCustomActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, String str, String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, WebviewFaqCustomActivity.class, new Pair[]{TuplesKt.to(ImagesContract.URL, str), TuplesKt.to("toolbar_title", str2), TuplesKt.to("registration_id", 0), TuplesKt.to("key_web_user_data", null), TuplesKt.to("key_web_bsu", Boolean.FALSE)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WebviewFaqCustomActivity() {
        final WebviewFaqCustomActivity webviewFaqCustomActivity = this;
        this.cancelAll = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.util.WebviewFaqCustomActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = webviewFaqCustomActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.onTransact = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.util.WebviewFaqCustomActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = webviewFaqCustomActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final WebviewFaqCustomActivity webviewFaqCustomActivity2 = this;
        this.INotificationSideChannelStub = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.util.WebviewFaqCustomActivity$special$$inlined$viewModel$default$1
            private static final byte[] $$c = {119, -103, 14, -22};
            private static final int $$f = 145;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {81, -102, -70, -91, -4, 20, -5, 16, 10, 2, -29, 34, 8, 16, 13, -4, 4, 10, 3, 20, -42, 41, 24, -4, 13, 6};
            private static final int $$e = 51;
            private static final byte[] $$a = {27, -8, 5, 78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
            private static final int $$b = 234;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60057, 59744, 60063, 59751, 60060, 60106, 60061, 60051, 60109, 60050, 60072, 60099, 60040, 59753, 60098, 60108, 60056, 60058, 60048, 60053, 60047, 60055, 60090, 60079, 60073, 60034, 60041, 60046, 60104, 60088, 60083, 60105, 59747, 60052, 60111, 59749, 60107, 59750, 60059, 60110, 59748, 60045, 60117, 60043, 60062, 60049, 60054, 59746, 59745};
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57190;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 52
                    int r0 = 53 - r7
                    int r6 = r6 * 14
                    int r6 = r6 + 84
                    byte[] r1 = com.bpjstku.presentation.util.WebviewFaqCustomActivity$special$$inlined$viewModel$default$1.$$a
                    int r8 = r8 * 52
                    int r8 = 56 - r8
                    byte[] r0 = new byte[r0]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r1 != 0) goto L18
                    r3 = r8
                    r4 = r2
                    goto L2e
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r7) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                    r5 = r3
                    r3 = r6
                    r6 = r4
                    r4 = r5
                L2e:
                    int r8 = r8 + 1
                    int r3 = r3 + r6
                    int r6 = r3 + (-11)
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewFaqCustomActivity$special$$inlined$viewModel$default$1.a(short, byte, byte, java.lang.Object[]):void");
            }

            private static void d(byte b2, int i, int i2, Object[] objArr) {
                int i3 = 25 - (i2 * 22);
                int i4 = b2 * 22;
                int i5 = 112 - (i * 14);
                byte[] bArr = $$d;
                byte[] bArr2 = new byte[i4 + 1];
                int i6 = -1;
                if (bArr == null) {
                    i5 = (i5 + i3) - 7;
                    i3 = i3;
                    i6 = -1;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i5;
                    if (i7 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i8 = i3 + 1;
                    i5 = (i5 + bArr[i8]) - 7;
                    i3 = i8;
                    i6 = i7;
                }
            }

            private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Object obj2 = null;
                int i4 = 8;
                if (cArr2 != null) {
                    int i5 = $10 + 77;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> i4), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2266, 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1927765101, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i7++;
                            i4 = 8;
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
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.argb(0, 0, 0, 0), 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 33 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1927765101, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
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
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            int i8 = $11 + 47;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c = (char) (49267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 3261;
                                int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29;
                                byte b7 = (byte) ($$f & 7);
                                byte b8 = (byte) (b7 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iKeyCodeFromString, i10, -127612708, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                int i11 = $11 + 55;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b9 = (byte) 3;
                                    byte b10 = (byte) (b9 - 3);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22879), 594 - (ViewConfiguration.getScrollBarSize() >> 8), 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1570859318, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    int i14 = $10 + 63;
                                    $11 = i14 % 128;
                                    int i15 = i14 % 2;
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
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                int i20 = 0;
                while (i20 < i) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                    i20++;
                    int i21 = $11 + 91;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX WARN: Type inference failed for: r0v53, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            private getStreamUseCaseSupportedCombinationList b() throws Throwable {
                Object[] objArr;
                ZoomGestureDetectorZoomEvent koin;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                int i2 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 37567);
                    int iArgb = Color.argb(0, 0, 0, 0) + 625;
                    int deadChar = 14 - KeyEvent.getDeadChar(0, 0);
                    byte b2 = (byte) (-$$a[5]);
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, iArgb, deadChar, -477065106, false, (String) objArr2[0], null);
                }
                Object obj = null;
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{18, 20, 5, 23, 30, '\f', 0, ',', '(', 19, '-', 7, 26, 11, 16, '0', '+', ' ', 26, 28, 17, 19}, (byte) (65 - Color.red(0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{'*', 23, 15, '-', '\t', '/', 3, 23, '-', 16, 27, 14, 11, ',', 13945}, (byte) (122 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 37567);
                    int iAlpha = 625 - Color.alpha(0);
                    int i3 = 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b4 = bArr[7];
                    Object[] objArr5 = new Object[1];
                    a(b4, b4, (byte) (-bArr[5]), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, iAlpha, i3, -976899241, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 37568);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 625;
                        int iIndexOf = 14 - TextUtils.indexOf("", "", 0, 0);
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr6 = new Object[1];
                        a(b5, b6, b6, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, maximumFlingVelocity, iIndexOf, -973632554, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i4 = ((int[]) objArr7[2])[0];
                    int i5 = ((int[]) objArr7[0])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int[] iArr = {i4};
                    int[] iArr2 = {i5};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i6 = ~iIdentityHashCode;
                    int i7 = 240746240 + ((iIdentityHashCode | 545297568) * 988) + (((~(562077362 | i6)) | 1244880964) * (-1976)) + (((~(iIdentityHashCode | (-1261660759))) | 545297568 | (~(1261660758 | i6))) * 988) + 1134798654;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
                    objArr = new Object[]{iArr2, new int[1], iArr, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{18, 20, 5, 23, 30, '\f', 0, ',', 15, '-', ',', '+', 23, 15, 16, '\r', '%', '\r', 18, 27, 21, '\t', 23, '/', 16, 3}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 83), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{20, 23, 13815, 13815, '/', 16, 15, 27, 13817, 13817, 23, 7, 17, 18, 16, '\r', '(', 26}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14), AndroidCharacter.getMirror('0') - 30, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                        TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                        if (i10 % 2 != 0) {
                            boolean z = applicationContext instanceof ContextWrapper;
                            obj.hashCode();
                            throw null;
                        }
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{3, 24, Typography.amp, 20, 0, 28, 18, 20, 0, '.', 11, 24, '\r', 19, '-', '/'}, (byte) (55 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 17, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{16, '\t', '/', 16, 16, '\r', 18, 27, 31, 16, '\r', '\b', 30, Typography.quote, '\t', 2}, (byte) (MotionEvent.axisFromString("") + 79), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr12 = new Object[1];
                    c(new char[]{30, '-', 3, 20, 14, 3, 1, '\r', 20, 0, 4, ')', 13850, 13850, 18, Typography.amp, 19, 1, '\t', '+', Typography.dollar, 18, 14, 1, '+', 16, 1, 6, 30, 0, 28, 20, 15, 18, 28, 17, 13766, 13766, '\n', 18, 4, ')', ' ', '\r', 2, '0', ' ', '#', 15, Typography.amp, '\n', 18, ' ', '\r', 28, 3, 18, 7, 28, 6, 1, 0, 28, 3}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27), View.MeasureSpec.getSize(0) + 64, objArr12);
                    String str = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    c(new char[]{17, 18, 1, '\t', '%', '(', 1, 14, '0', 2, '#', 1, '-', 30, '\r', ')', ' ', 29, 7, 29, Typography.dollar, 18, 1, '\r', 6, 28, 7, 21, '#', 21, 18, 7, 21, 7, '(', 4, 30, '0', 24, Typography.amp, 30, '-', 1, '\r', 20, 29, 13807, 13807, 15, 17, 13801, 13801, 6, 28, 29, ' ', 20, 2, ' ', 28, 15, Typography.amp, '\r', 1}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 70), 64 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr13);
                    try {
                        Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 1134798654};
                        byte b7 = (byte) ($$e & 5);
                        byte b8 = (byte) (b7 - 1);
                        Object[] objArr15 = new Object[1];
                        d(b7, b8, (byte) (b8 + 1), objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        byte b9 = (byte) 0;
                        byte b10 = (byte) (b9 + 1);
                        Object[] objArr16 = new Object[1];
                        d(b9, b10, (byte) (b10 - 1), objArr16);
                        objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                        int i11 = ((int[]) objArr[0])[0];
                        int i12 = ((int[]) objArr[2])[0];
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char tapTimeout = (char) (37567 - (ViewConfiguration.getTapTimeout() >> 16));
                                int i13 = 625 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i14 = 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                byte b11 = $$a[7];
                                byte b12 = b11;
                                Object[] objArr17 = new Object[1];
                                a(b11, b12, b12, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, i13, i14, -973632554, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr18 = new Object[1];
                                c(new char[]{18, 20, 5, 23, 30, '\f', 0, ',', '(', 19, '-', 7, 26, 11, 16, '0', '+', ' ', 26, 28, 17, 19}, (byte) (65 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.getOffsetBefore("", 0) + 22, objArr18);
                                Class<?> cls5 = Class.forName((String) objArr18[0]);
                                Object[] objArr19 = new Object[1];
                                c(new char[]{'*', 23, 15, '-', '\t', '/', 3, 23, '-', 16, 27, 14, 11, ',', 13945}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 122), TextUtils.getOffsetAfter("", 0) + 15, objArr19);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char size = (char) (View.MeasureSpec.getSize(0) + 37567);
                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 625;
                                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 14;
                                    byte[] bArr2 = $$a;
                                    byte b13 = bArr2[7];
                                    Object[] objArr20 = new Object[1];
                                    a(b13, b13, (byte) (-bArr2[5]), objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(size, packedPositionType, deadChar2, -976899241, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 37567);
                                    int i15 = 626 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 15;
                                    byte b14 = (byte) (-$$a[5]);
                                    byte b15 = b14;
                                    Object[] objArr21 = new Object[1];
                                    a(b14, b15, b15, objArr21);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, i15, iIndexOf2, -477065106, false, (String) objArr21[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) objArr[3];
                    if (strArr2 == null) {
                        throw null;
                    }
                    int i16 = TuitionPaymentFragmentbindingInflater1 + 45;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                    int i17 = i16 % 2;
                    while (i2 < strArr2.length) {
                        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                        if (i18 % 2 != 0) {
                            arrayList.add(strArr2[i2]);
                            i2 += 75;
                        } else {
                            arrayList.add(strArr2[i2]);
                            i2++;
                        }
                    }
                    throw null;
                }
                int i19 = ((int[]) objArr[1])[0];
                int i20 = ((int[]) objArr[2])[0];
                int i21 = ((int[]) objArr[0])[0];
                String[] strArr3 = (String[]) objArr[3];
                int[] iArr3 = {i20};
                int i22 = ~new Random().nextInt();
                int i23 = i19 + (((50413288 + (((~(1738537224 | i22)) | 85200896) * (-828))) + ((i22 | 1738537224) * (-828))) - 694778140);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr[1])[0] = i25 ^ (i25 << 5);
                Object[] objArr22 = {new int[]{i21}, new int[1], iArr3, strArr3};
                int i26 = TuitionPaymentFragmentbindingInflater1 + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                int i27 = i26 % 2;
                LifecycleOwner lifecycleOwner = webviewFaqCustomActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class);
                if (lifecycleOwner == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
                }
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                if (componentCallbacks instanceof getEventTime) {
                    int i28 = TuitionPaymentFragmentbindingInflater1 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                    if (i28 % 2 == 0) {
                        ((getEventTime) componentCallbacks).getKoin();
                        obj.hashCode();
                        throw null;
                    }
                    koin = ((getEventTime) componentCallbacks).getKoin();
                } else {
                    koin = ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
                }
                return isQuickZoomEnabled.b(koin, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
            }

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                ?? B = b();
                if (i3 != 0) {
                    int i4 = 91 / 0;
                }
                return B;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r6, short r7, int r8) {
                /*
                    byte[] r0 = com.bpjstku.presentation.util.WebviewFaqCustomActivity$special$$inlined$viewModel$default$1.$$c
                    int r7 = r7 * 2
                    int r1 = r7 + 1
                    int r8 = r8 + 4
                    int r6 = r6 + 113
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L29
                L13:
                    r3 = r2
                L14:
                    int r8 = r8 + 1
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r7) goto L21
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L21:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L29:
                    int r8 = -r8
                    int r6 = r6 + r8
                    r8 = r3
                    r3 = r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewFaqCustomActivity$special$$inlined$viewModel$default$1.$$g(int, short, int):java.lang.String");
            }
        });
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        WebviewFaqCustomActivity webviewFaqCustomActivity = (WebviewFaqCustomActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault3(SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -45405693, 45405700, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1393826158, new Object[]{webviewFaqCustomActivity, str}, LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 941771813)).booleanValue();
        int i4 = IconCompatParcelizer + 97;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i5 = 34 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(WebviewFaqCustomActivity webviewFaqCustomActivity, int i) {
        WebviewFaqCustomActivity webviewFaqCustomActivity2;
        int i2 = 2 % 2;
        String str = (String) MapsKt.mapOf(TuplesKt.to(-4, "User authentication failed on server"), TuplesKt.to(-8, "The server is taking too much time to communicate. Try again later."), TuplesKt.to(-15, "Too many requests during this load"), TuplesKt.to(-1, "Generic error"), TuplesKt.to(-12, "Check entered URL.."), TuplesKt.to(-6, "Error timeout.."), TuplesKt.to(-11, "Failed to perform SSL handshake"), TuplesKt.to(-2, "Server or proxy hostname lookup failed"), TuplesKt.to(-5, "User authentication failed on proxy"), TuplesKt.to(-9, "Too many redirects"), TuplesKt.to(-3, "Unsupported authentication scheme (not basic or digest)"), TuplesKt.to(-10, "unsupported scheme"), TuplesKt.to(-13, "Generic file error"), TuplesKt.to(-14, "File not found"), TuplesKt.to(-7, "The server failed to communicate. Try again later.")).get(Integer.valueOf(i));
        if (str != null) {
            int i3 = IconCompatParcelizer + 77;
            INotificationSideChannelDefault = i3 % 128;
            int i4 = i3 % 2;
            webviewFaqCustomActivity2 = webviewFaqCustomActivity;
            ConstraintLayout constraintLayout = ((ActivityWebviewFaqCustomBinding) ((ViewBinding) webviewFaqCustomActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerWebFaqCustomActivity;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(constraintLayout, str);
        } else {
            webviewFaqCustomActivity2 = webviewFaqCustomActivity;
        }
        if (i == -2) {
            int i5 = IconCompatParcelizer + 85;
            INotificationSideChannelDefault = i5 % 128;
            int i6 = i5 % 2;
            ((ActivityWebviewFaqCustomBinding) ((ViewBinding) webviewFaqCustomActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl("about:blank");
            ((ActivityWebviewFaqCustomBinding) ((ViewBinding) webviewFaqCustomActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(8);
            ((ActivityWebviewFaqCustomBinding) ((ViewBinding) webviewFaqCustomActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerError.setVisibility(0);
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(WebviewFaqCustomActivity webviewFaqCustomActivity, String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 19;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        webviewFaqCustomActivity.g = str;
        int i5 = i2 + 91;
        INotificationSideChannelDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebviewFaqCustomActivity webviewFaqCustomActivity, File file) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 125;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        webviewFaqCustomActivity.a = file;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 85;
        INotificationSideChannelDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebviewFaqCustomActivity webviewFaqCustomActivity, ValueCallback valueCallback) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 75;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        webviewFaqCustomActivity.asInterface = valueCallback;
        int i5 = i2 + 57;
        INotificationSideChannelDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ ValueCallback a(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 115;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        ValueCallback<Uri[]> valueCallback = webviewFaqCustomActivity.asInterface;
        int i5 = i2 + 95;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return valueCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        WebviewFaqCustomActivity webviewFaqCustomActivity = (WebviewFaqCustomActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = webviewFaqCustomActivity.cancel;
        if (i3 != 0) {
            int i5 = 81 / 0;
        }
        return Integer.valueOf(i4);
    }

    public static final /* synthetic */ User asInterface(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 65;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        User user = webviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i2 + 55;
        INotificationSideChannelDefault = i5 % 128;
        int i6 = i5 % 2;
        return user;
    }

    public static final /* synthetic */ ActivityWebviewFaqCustomBinding b(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 53;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        ActivityWebviewFaqCustomBinding activityWebviewFaqCustomBinding = (ActivityWebviewFaqCustomBinding) ((ViewBinding) webviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i4 = INotificationSideChannelDefault + 121;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return activityWebviewFaqCustomBinding;
    }

    public static final /* synthetic */ boolean cancelAll(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 105;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        boolean z = webviewFaqCustomActivity.b;
        int i5 = i3 + 47;
        INotificationSideChannelDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ File d(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 115;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        File file = webviewFaqCustomActivity.a;
        int i5 = i3 + 43;
        INotificationSideChannelDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return file;
        }
        throw null;
    }

    public static final /* synthetic */ String g(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 89;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        String str = webviewFaqCustomActivity.g;
        int i5 = i2 + 97;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return str;
    }

    public static final /* synthetic */ void notify(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            ((getStreamUseCaseSupportedCombinationList) webviewFaqCustomActivity.INotificationSideChannelStub.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "").length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String string = ((getStreamUseCaseSupportedCombinationList) webviewFaqCustomActivity.INotificationSideChannelStub.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "");
        if (string.length() > 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(webviewFaqCustomActivity, string, "Appointment Online", 0, null, false, 56);
        } else {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Sedang memuat appointment online...", 0).show();
            int i3 = INotificationSideChannelDefault + 41;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityWebviewFaqCustomBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        WebviewFaqCustomActivity$bindingInflater$1 webviewFaqCustomActivity$bindingInflater$1 = WebviewFaqCustomActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = IconCompatParcelizer + 27;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return webviewFaqCustomActivity$bindingInflater$1;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final WebviewFaqCustomActivity webviewFaqCustomActivity = (WebviewFaqCustomActivity) objArr[0];
        int i = 2 % 2;
        MaterialToolbar materialToolbar = ((ActivityWebviewFaqCustomBinding) ((ViewBinding) webviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        Intrinsics.checkNotNullExpressionValue(materialToolbar, "");
        materialToolbar.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: workaroundByCaptureIntentPreview
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebviewFaqCustomActivity.b(this.b, (View) obj);
            }
        }));
        Button button = ((ActivityWebviewFaqCustomBinding) ((ViewBinding) webviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnTryAgain;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CaptureSessionOnClosedNotCalledQuirk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        int i2 = INotificationSideChannelDefault + 71;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 89;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra(ImagesContract.URL);
        if (stringExtra == null) {
            int i4 = INotificationSideChannelDefault + 93;
            int i5 = i4 % 128;
            IconCompatParcelizer = i5;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i6 = i5 + 61;
            INotificationSideChannelDefault = i6 % 128;
            int i7 = i6 % 2;
            stringExtra = "";
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("toolbar_title");
        this.TuitionPaymentFragmentbindingInflater1 = stringExtra2 != null ? stringExtra2 : "";
        this.b = getIntent().getBooleanExtra("key_web_bsu", false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (User) getIntent().getParcelableExtra("key_web_user_data");
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends WebViewClient {
        private /* synthetic */ ActivityWebviewFaqCustomBinding TuitionPaymentFragmentbindingInflater1;

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityWebviewFaqCustomBinding activityWebviewFaqCustomBinding) {
            this.TuitionPaymentFragmentbindingInflater1 = activityWebviewFaqCustomBinding;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            WebviewFaqCustomActivity.TuitionPaymentFragmentbindingInflater1(WebviewFaqCustomActivity.this, i);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebviewFaqCustomActivity webviewFaqCustomActivity = WebviewFaqCustomActivity.this;
            Intrinsics.checkNotNull(webResourceError);
            WebviewFaqCustomActivity.TuitionPaymentFragmentbindingInflater1(webviewFaqCustomActivity, webResourceError.getErrorCode());
        }

        @Override // android.webkit.WebViewClient
        @Deprecated(message = "Deprecated in Java")
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = {WebviewFaqCustomActivity.this, str};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (((Boolean) WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1217819696, 1217819698, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr, LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).booleanValue()) {
                return true;
            }
            webView.loadUrl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Object[] objArr = {WebviewFaqCustomActivity.this, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null)};
            if (!((Boolean) WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1217819696, 1217819698, LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2())).booleanValue() && webView != null) {
                webView.loadUrl(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            ProgressBar progressBar = this.TuitionPaymentFragmentbindingInflater1.progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "");
            if (progressBar.getVisibility() == 0) {
                this.TuitionPaymentFragmentbindingInflater1.progressBar.setVisibility(8);
            }
            if (webView != null) {
                webView.clearHistory();
            }
            if (WebviewFaqCustomActivity.cancelAll(WebviewFaqCustomActivity.this)) {
                WebView webView2 = this.TuitionPaymentFragmentbindingInflater1.webView;
                User userAsInterface = WebviewFaqCustomActivity.asInterface(WebviewFaqCustomActivity.this);
                String str2 = userAsInterface != null ? userAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                if (str2 == null) {
                    str2 = "";
                }
                User userAsInterface2 = WebviewFaqCustomActivity.asInterface(WebviewFaqCustomActivity.this);
                String str3 = userAsInterface2 != null ? userAsInterface2.b : null;
                String str4 = str3 != null ? str3 : "";
                StringBuilder sb = new StringBuilder("\n            document.getElementById('nama-bsu').value = '");
                sb.append(str2);
                sb.append("';\n            document.getElementById('nik-bsu').value = '");
                sb.append(str4);
                sb.append("';\n            ");
                webView2.evaluateJavascript(StringsKt.trimIndent(sb.toString()), null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x02c6  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        INotificationSideChannelStubProxy();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int windowTouchSlop = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
            byte b2 = (byte) ($$b & 21);
            byte b3 = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, windowTouchSlop, iNormalizeMetaState, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{32702, 38016, 43481, 48702, 54132, 59459, 64669, 4518, 9784, 15125, 20507, 25751, 31210, 36561, 41733, 47205, 52386, 57821, 63169, 2835, 8296, 13489}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_transfer).substring(0, 13).length() + 60196, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{32698, 56472, 14824, 38446, 62208, 20589, 44217, 2464, 26338, 49981, Typography.rightDoubleQuote, 32114, 55730, 13981, 37856}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_code).substring(4, 5).length() + 41770, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int iBlue = 876 - Color.blue(0);
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr[54], (byte) 52, bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild2, iBlue, bitsPerPixel, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = INotificationSideChannelDefault + 91;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int minimumFlingVelocity = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b4, b5, (short) (b5 | 52), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, minimumFlingVelocity, iLastIndexOf, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_atm_bersama).substring(1, 3).codePointAt(0) + 983014932;
            int i6 = ~iCodePointAt;
            int i7 = 630656756 + (((~(i6 | 80957831)) | (~(40647602 | i6)) | (-117406648)) * 464) + (((-76759046) | iCodePointAt) * (-464)) + (((~(iCodePointAt | 80957831)) | (-117406648)) * 464) + 1950035600;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i10 = IconCompatParcelizer + 85;
                INotificationSideChannelDefault = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr8 = new Object[1];
                e(new char[]{32702, 34152, 35337, 36646, 38100, 39307, 40621, 42014, 43382, 44558, 46037, 47266, 48562, 49849, 51317, 52481, 53817, 55263, 56553, 57789, 59263, 60538, 61707, 63173, 64486, 138}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 64206, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{32700, 27109, 21299, 15680, 9862, 4154, 64113, 58295, 52695, 46952, 41125, 35539, 29704, 23997, 18425, 12567, 6976, 1166}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5700, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = baseContext.getApplicationContext();
                } else {
                    int i12 = INotificationSideChannelDefault + 39;
                    IconCompatParcelizer = i12 % 128;
                    if (i12 % 2 == 0) {
                        ((ContextWrapper) baseContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = baseContext.getApplicationContext();
                    } else {
                        baseContext = null;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{32693, 53489, 8503, 29267, 49869, 4920, 25700, 46232, 1472, 22070, 42650, 63427, 18456, 39080, 59880, 14867}, 44879 - Color.green(0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{32694, 41762, 50824, 60026, 3535, 12619, 21565, 30601, 39775, 48863, 57942, 1316, 10416, 19573, 28645, 37709}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 56427, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i13 = INotificationSideChannelDefault + 107;
            IconCompatParcelizer = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(iIntValue), 1950035600};
                byte[] bArr2 = $$j;
                byte b6 = bArr2[122];
                Object[] objArr13 = new Object[1];
                f(b6, bArr2[3], b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr2[3];
                Object[] objArr14 = new Object[1];
                f(b7, bArr2[122], b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i15 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr16 = new Object[1];
                        c(b8, b9, (short) (b9 | 52), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, scrollDefaultDelay, i15, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{32702, 38016, 43481, 48702, 54132, 59459, 64669, 4518, 9784, 15125, 20507, 25751, 31210, 36561, 41733, 47205, 52386, 57821, 63169, 2835, 8296, 13489}, TextUtils.getOffsetBefore("", 0) + 60209, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{32698, 56472, 14824, 38446, 62208, 20589, 44217, 2464, 26338, 49981, Typography.rightDoubleQuote, 32114, 55730, 13981, 37856}, KeyEvent.keyCodeFromString("") + 41771, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int iResolveSize = 876 - View.resolveSize(0, 0);
                            int iMyPid = (Process.myPid() >> 22) + 10;
                            byte[] bArr3 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr3[54], (byte) 52, bArr3[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iResolveSize, iMyPid, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                            int i16 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
                            byte b10 = (byte) ($$b & 21);
                            byte b11 = $$a[7];
                            Object[] objArr20 = new Object[1];
                            c(b10, b11, b11, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, i16, iIndexOf, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i17 = INotificationSideChannelDefault + 35;
        IconCompatParcelizer = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i20 = ~((-136844822) | iUptimeMillis);
        int i21 = ~iUptimeMillis;
        int i22 = i19 + 1609606132 + ((i20 | (~(803954271 | i21))) * 920) + (((~((-707419680) | i21)) | 136844821) * 920) + (((~(iUptimeMillis | 803954271)) | (~((-136844822) | i21)) | (~((-570574859) | iUptimeMillis))) * 920);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr21[1])[0] = i24 ^ (i24 << 5);
        ArrayList arrayList = new ArrayList();
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) this.INotificationSideChannel.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final Function1 function1 = new Function1() { // from class: CaptureIntentPreviewQuirk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: ConfigureSurfaceToSecondarySessionFailQuirk
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr22 = {function1, obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2116169296, 2116169305, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr22, LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.cancelAll.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_NOTIFICATION_POLICY") != 0) {
            arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
        }
    }

    private final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        getInterfaceDescriptor();
        ((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setWebChromeClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str == null) {
            int i2 = IconCompatParcelizer + 57;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        ((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl(str);
        int i4 = IconCompatParcelizer + 125;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends WebChromeClient {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (callback != null) {
                callback.invoke(str, true, false);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(PermissionRequest permissionRequest) {
            Intrinsics.checkNotNullParameter(permissionRequest, "");
            if (ContextCompat.checkSelfPermission(WebviewFaqCustomActivity.this, "android.permission.CAMERA") == 0) {
                permissionRequest.grant(permissionRequest.getResources());
                return;
            }
            WebviewFaqCustomActivity webviewFaqCustomActivity = WebviewFaqCustomActivity.this;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            ActivityCompat.requestPermissions(webviewFaqCustomActivity, new String[]{"android.permission.CAMERA"}, ((Integer) WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -666297654, 666297662, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{webviewFaqCustomActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).intValue());
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) throws IOException {
            Intent intent = null;
            if (WebviewFaqCustomActivity.a(WebviewFaqCustomActivity.this) != null) {
                ValueCallback valueCallbackA = WebviewFaqCustomActivity.a(WebviewFaqCustomActivity.this);
                Intrinsics.checkNotNull(valueCallbackA);
                valueCallbackA.onReceiveValue(null);
            }
            WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebviewFaqCustomActivity.this, valueCallback);
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent2.resolveActivity(WebviewFaqCustomActivity.this.getPackageManager()) != null) {
                WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebviewFaqCustomActivity.this, (File) null);
                try {
                    WebviewFaqCustomActivity webviewFaqCustomActivity = WebviewFaqCustomActivity.this;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(webviewFaqCustomActivity, (File) WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1177220659, -1177220653, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[0], iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    Intrinsics.checkNotNull(intent2.putExtra("PhotoPath", WebviewFaqCustomActivity.g(WebviewFaqCustomActivity.this)));
                } catch (IOException e2) {
                    getContentPaddingRight.b bVarB = getContentPaddingRight.b("error message");
                    Intrinsics.checkExpressionValueIsNotNull(bVarB, "");
                    bVarB.b(String.valueOf(e2.getMessage()), new Object[0]);
                }
                if (WebviewFaqCustomActivity.d(WebviewFaqCustomActivity.this) != null) {
                    WebviewFaqCustomActivity webviewFaqCustomActivity2 = WebviewFaqCustomActivity.this;
                    File fileD = WebviewFaqCustomActivity.d(webviewFaqCustomActivity2);
                    Intrinsics.checkNotNull(fileD);
                    WebviewFaqCustomActivity.TuitionPaymentFragmentbindingInflater1(webviewFaqCustomActivity2, "file:".concat(String.valueOf(fileD.getAbsolutePath())));
                    Intrinsics.checkNotNull(intent2.putExtra("output", Uri.fromFile(WebviewFaqCustomActivity.d(WebviewFaqCustomActivity.this))));
                    intent = intent2;
                } else {
                    Intrinsics.checkNotNull(null);
                }
            } else {
                intent = intent2;
            }
            Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
            intent3.addCategory("android.intent.category.OPENABLE");
            intent3.setType("*/*");
            Intent[] intentArr = {intent};
            Intent intent4 = new Intent("android.intent.action.CHOOSER");
            intent4.putExtra("android.intent.extra.INTENT", intent3);
            intent4.putExtra("android.intent.extra.TITLE", WebviewFaqCustomActivity.this.getString(R.string.image_chooser));
            intent4.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
            WebviewFaqCustomActivity webviewFaqCustomActivity3 = WebviewFaqCustomActivity.this;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            webviewFaqCustomActivity3.startActivityForResult(intent4, ((Integer) WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1357004815, -1357004815, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, new Object[]{webviewFaqCustomActivity3}, iTuitionPaymentFragmentspecialinlinedviewModeldefault7, iTuitionPaymentFragmentspecialinlinedviewModeldefault6)).intValue());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            super.onProgressChanged(webView, i);
            WebviewFaqCustomActivity.b(WebviewFaqCustomActivity.this).progressBar.setProgress(i);
            if (i < 100 && WebviewFaqCustomActivity.b(WebviewFaqCustomActivity.this).progressBar.getVisibility() == 8) {
                WebviewFaqCustomActivity.b(WebviewFaqCustomActivity.this).progressBar.setVisibility(0);
            }
            if (i == 100) {
                WebviewFaqCustomActivity.b(WebviewFaqCustomActivity.this).progressBar.setVisibility(8);
            }
        }
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        final ActivityWebviewFaqCustomBinding activityWebviewFaqCustomBinding = (ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityWebviewFaqCustomBinding.webView.getSettings().setJavaScriptEnabled(true);
        activityWebviewFaqCustomBinding.webView.getSettings().setLoadWithOverviewMode(true);
        activityWebviewFaqCustomBinding.webView.getSettings().setUseWideViewPort(true);
        activityWebviewFaqCustomBinding.webView.getSettings().setDomStorageEnabled(true);
        activityWebviewFaqCustomBinding.webView.getSettings().setAllowContentAccess(true);
        activityWebviewFaqCustomBinding.webView.getSettings().setAllowFileAccess(true);
        activityWebviewFaqCustomBinding.webView.getSettings().setDatabaseEnabled(true);
        activityWebviewFaqCustomBinding.webView.getSettings().setGeolocationEnabled(true);
        activityWebviewFaqCustomBinding.webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebviewFaqCustomActivity webviewFaqCustomActivity = this;
        activityWebviewFaqCustomBinding.webView.addJavascriptInterface(new OutputConfigurationCompatApi28Impl(webviewFaqCustomActivity), "Android");
        activityWebviewFaqCustomBinding.webView.addJavascriptInterface(new b(this, webviewFaqCustomActivity), "androidApp");
        activityWebviewFaqCustomBinding.webView.addJavascriptInterface(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, webviewFaqCustomActivity, ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.onTransact.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.g(), ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.onTransact.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.d()), "WVGeraiJSInterface");
        activityWebviewFaqCustomBinding.webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        activityWebviewFaqCustomBinding.webView.getSettings().setCacheMode(-1);
        activityWebviewFaqCustomBinding.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        activityWebviewFaqCustomBinding.webView.getSettings().setBuiltInZoomControls(false);
        activityWebviewFaqCustomBinding.webView.getSettings().setUseWideViewPort(true);
        activityWebviewFaqCustomBinding.webView.setDownloadListener(new DownloadListener() { // from class: DeviceQuirksLoader
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityWebviewFaqCustomBinding, this, str, str3, str4);
            }
        });
        Object obj = null;
        activityWebviewFaqCustomBinding.webView.evaluateJavascript("document.dispatchEvent(new Event(\"vueListenAndroid\"))", null);
        LayoutToolbarCenterBinding layoutToolbarCenterBinding = ((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
        if (layoutToolbarCenterBinding != null) {
            int i2 = INotificationSideChannelDefault + 111;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                MaterialToolbar materialToolbar = layoutToolbarCenterBinding.toolbar;
                if (materialToolbar != null) {
                    materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: getOnePlus6ExcludedSizes
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, view);
                        }
                    });
                }
            } else {
                MaterialToolbar materialToolbar2 = layoutToolbarCenterBinding.toolbar;
                obj.hashCode();
                throw null;
            }
        }
        activityWebviewFaqCustomBinding.webView.setWebViewClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityWebviewFaqCustomBinding));
        int i3 = INotificationSideChannelDefault + 81;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        PendingIntent activity;
        int i = 2 % 2;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String str = p0;
        Intrinsics.checkNotNullExpressionValue(p0.substring(StringsKt.indexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) str, ";", 0, false, 6, (Object) null)), "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Simulasi-KPR");
        sb.append(jCurrentTimeMillis);
        sb.append(".pdf");
        File file = new File(externalStoragePublicDirectory, sb.toString());
        try {
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
                int i2 = IconCompatParcelizer + 71;
                INotificationSideChannelDefault = i2 % 128;
                int i3 = i2 % 2;
            }
            if (!file.exists()) {
                int i4 = IconCompatParcelizer + 91;
                INotificationSideChannelDefault = i4 % 128;
                int i5 = i4 % 2;
                file.createNewFile();
            }
            String strSubstring = p0.substring(StringsKt.indexOf$default((CharSequence) p0, ",", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArrDecode);
            fileOutputStream.close();
            MediaScannerConnection.scanFile(this, new String[]{file.toString()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: loadQuirks
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str2, Uri uri) {
                    WebviewFaqCustomActivity.g();
                }
            });
            String packageName = getApplicationContext().getPackageName();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageName);
            sb2.append(".provider");
            Uri uriForFile = FileProvider.getUriForFile(getApplicationContext(), sb2.toString(), file);
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(file));
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(1);
            intent.setDataAndType(uriForFile, mimeTypeFromExtension);
            if (Build.VERSION.SDK_INT >= 31) {
                int i6 = IconCompatParcelizer + 41;
                INotificationSideChannelDefault = i6 % 128;
                activity = i6 % 2 != 0 ? PendingIntent.getActivity(this, 0, intent, 201326592) : PendingIntent.getActivity(this, 0, intent, 201326592);
            } else {
                activity = PendingIntent.getActivity(this, 0, intent, 1140850688);
            }
            Notification notificationBuild = new NotificationCompat.Builder(this, "bpjstku_channel_id").setSmallIcon(2131231113).setContentText("Simulasi KPR Berhasil Diunduh").setContentTitle("Simulasi KPR").setContentIntent(activity).setAutoCancel(true).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "");
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("bpjstku_channel_id", "BPJAMSOSTEK", 3);
                notificationChannel.setDescription("BPJamsostek Channel");
                Object systemService = getSystemService("notification");
                Intrinsics.checkNotNull(systemService, "");
                ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            }
            Object systemService2 = getSystemService("notification");
            Intrinsics.checkNotNull(systemService2, "");
            ((NotificationManager) systemService2).notify(85851, notificationBuild);
            Toast.makeText(this, "Simulasi KPR Berhasil Diunduh", 0).show();
        } catch (IOException unused) {
            Toast.makeText(this, "Gagal Unduh", 0).show();
        }
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/bpjstku/presentation/util/WebviewFaqCustomActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "<init>", "(Lcom/bpjstku/presentation/util/WebviewFaqCustomActivity;Landroid/content/Context;ZLjava/lang/String;)V", "", "requestUserAccessToken", "(Ljava/lang/String;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroid/content/Context;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Z", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ WebviewFaqCustomActivity TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final boolean TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebviewFaqCustomActivity webviewFaqCustomActivity, Context context, boolean z, String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = webviewFaqCustomActivity;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
            this.TuitionPaymentFragmentbindingInflater1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        @JavascriptInterface
        public final void requestUserAccessToken(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            String str = z ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : "";
            StringBuilder sb = new StringBuilder("\n                window.wvgeraiTokenCallback({\n                    success: ");
            sb.append(z);
            sb.append(",\n                    accessToken: '");
            sb.append(str);
            sb.append("'\n                });\n            ");
            final String strTrimIndent = StringsKt.trimIndent(sb.toString());
            Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNull(context, "");
            WebviewFaqCustomActivity.b((WebviewFaqCustomActivity) context).webView.post(new Runnable() { // from class: ExcludedSupportedSizesQuirk
                @Override // java.lang.Runnable
                public final void run() {
                    WebviewFaqCustomActivity.b((WebviewFaqCustomActivity) this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2).webView.evaluateJavascript(strTrimIndent, null);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022 A[DONT_INVERT, PHI: r1
  0x0022: PHI (r1v6 android.net.Uri[]) = (r1v5 android.net.Uri[]), (r1v10 android.net.Uri[]) binds: [B:12:0x0020, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[Catch: all -> 0x008d, Exception -> 0x0094, TRY_LEAVE, TryCatch #0 {Exception -> 0x0094, blocks: (B:27:0x0076, B:29:0x0084), top: B:53:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        Uri[] uriArr;
        String str;
        String strGuessFileName;
        Uri uriForFile;
        HashMap<String, Uri> map;
        int i;
        String dataString;
        Uri uri;
        Cursor cursorQuery;
        String string;
        HashMap<String, Uri> map2;
        int i2 = 2 % 2;
        if (p0 != this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || this.asInterface == null) {
            super.onActivityResult(p0, p1, p2);
            return;
        }
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 93;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            uriArr = new Uri[0];
            if (p1 == -1) {
                if (p2 != null) {
                    i = i3 + 13;
                    INotificationSideChannelDefault = i % 128;
                    if (i % 2 == 0) {
                        p2.getData();
                        throw null;
                    }
                    if (p2.getData() != null) {
                        int i5 = IconCompatParcelizer + 15;
                        INotificationSideChannelDefault = i5 % 128;
                        int i6 = i5 % 2;
                        dataString = p2.getDataString();
                        if (dataString != null) {
                            uri = Uri.parse(dataString);
                            uriArr = new Uri[]{uri};
                            if (StringsKt.equals$default(uri.getScheme(), FirebaseAnalytics.Param.CONTENT, false, 2, null)) {
                                cursorQuery = getContentResolver().query(uriArr[0], null, null, null, null);
                                if (cursorQuery != null) {
                                    int i7 = INotificationSideChannelDefault + 47;
                                    IconCompatParcelizer = i7 % 128;
                                    int i8 = i7 % 2;
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                                map2 = OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                if (map2 != null) {
                                                    map2.put(string, uriArr[0]);
                                                }
                                            } catch (Exception unused) {
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        throw th;
                                    }
                                }
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        }
                    } else {
                        str = this.g;
                        if (str != null && this.a != null) {
                            strGuessFileName = URLUtil.guessFileName(String.valueOf(str), null, null);
                            uriArr = new Uri[]{Uri.parse(this.g)};
                            String packageName = getApplicationContext().getPackageName();
                            StringBuilder sb = new StringBuilder();
                            sb.append(packageName);
                            sb.append(".provider");
                            String string2 = sb.toString();
                            File file = this.a;
                            Intrinsics.checkNotNull(file);
                            uriForFile = FileProvider.getUriForFile(this, string2, file);
                            this.d = uriForFile;
                            if (uriForFile != null && (map = OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
                                int i9 = IconCompatParcelizer + 105;
                                INotificationSideChannelDefault = i9 % 128;
                                int i10 = i9 % 2;
                                map.put(strGuessFileName, this.d);
                            }
                        }
                    }
                } else {
                    str = this.g;
                    if (str != null) {
                        strGuessFileName = URLUtil.guessFileName(String.valueOf(str), null, null);
                        uriArr = new Uri[]{Uri.parse(this.g)};
                        String packageName2 = getApplicationContext().getPackageName();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(packageName2);
                        sb2.append(".provider");
                        String string3 = sb2.toString();
                        File file2 = this.a;
                        Intrinsics.checkNotNull(file2);
                        uriForFile = FileProvider.getUriForFile(this, string3, file2);
                        this.d = uriForFile;
                        if (uriForFile != null) {
                            int i11 = IconCompatParcelizer + 105;
                            INotificationSideChannelDefault = i11 % 128;
                            int i12 = i11 % 2;
                            map.put(strGuessFileName, this.d);
                        }
                    }
                }
            }
        } else {
            uriArr = new Uri[0];
            if (p1 == -1) {
                if (p2 != null) {
                    i = i3 + 13;
                    INotificationSideChannelDefault = i % 128;
                    if (i % 2 == 0) {
                        p2.getData();
                        throw null;
                    }
                    if (p2.getData() != null) {
                        int i13 = IconCompatParcelizer + 15;
                        INotificationSideChannelDefault = i13 % 128;
                        int i14 = i13 % 2;
                        dataString = p2.getDataString();
                        if (dataString != null) {
                            uri = Uri.parse(dataString);
                            uriArr = new Uri[]{uri};
                            if (StringsKt.equals$default(uri.getScheme(), FirebaseAnalytics.Param.CONTENT, false, 2, null)) {
                                cursorQuery = getContentResolver().query(uriArr[0], null, null, null, null);
                                if (cursorQuery != null) {
                                    int i15 = INotificationSideChannelDefault + 47;
                                    IconCompatParcelizer = i15 % 128;
                                    int i16 = i15 % 2;
                                    if (cursorQuery.moveToFirst()) {
                                        string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        map2 = OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        if (map2 != null) {
                                            map2.put(string, uriArr[0]);
                                        }
                                    }
                                }
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        }
                    } else {
                        str = this.g;
                        if (str != null) {
                            strGuessFileName = URLUtil.guessFileName(String.valueOf(str), null, null);
                            uriArr = new Uri[]{Uri.parse(this.g)};
                            String packageName3 = getApplicationContext().getPackageName();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(packageName3);
                            sb3.append(".provider");
                            String string4 = sb3.toString();
                            File file3 = this.a;
                            Intrinsics.checkNotNull(file3);
                            uriForFile = FileProvider.getUriForFile(this, string4, file3);
                            this.d = uriForFile;
                            if (uriForFile != null) {
                                int i17 = IconCompatParcelizer + 105;
                                INotificationSideChannelDefault = i17 % 128;
                                int i18 = i17 % 2;
                                map.put(strGuessFileName, this.d);
                            }
                        }
                    }
                } else {
                    str = this.g;
                    if (str != null) {
                        strGuessFileName = URLUtil.guessFileName(String.valueOf(str), null, null);
                        uriArr = new Uri[]{Uri.parse(this.g)};
                        String packageName4 = getApplicationContext().getPackageName();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(packageName4);
                        sb4.append(".provider");
                        String string5 = sb4.toString();
                        File file4 = this.a;
                        Intrinsics.checkNotNull(file4);
                        uriForFile = FileProvider.getUriForFile(this, string5, file4);
                        this.d = uriForFile;
                        if (uriForFile != null) {
                            int i19 = IconCompatParcelizer + 105;
                            INotificationSideChannelDefault = i19 % 128;
                            int i110 = i19 % 2;
                            map.put(strGuessFileName, this.d);
                        }
                    }
                }
            }
        }
        ValueCallback<Uri[]> valueCallback = this.asInterface;
        Intrinsics.checkNotNull(valueCallback);
        valueCallback.onReceiveValue(uriArr);
        this.asInterface = null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/util/WebviewFaqCustomActivity$b;", "", "Landroid/content/Context;", "p0", "<init>", "(Lcom/bpjstku/presentation/util/WebviewFaqCustomActivity;Landroid/content/Context;)V", "", "", "toastText", "(Ljava/lang/String;)V", "BackActivity", "exitApp", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroid/content/Context;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class b {
        private /* synthetic */ WebviewFaqCustomActivity TuitionPaymentFragmentbindingInflater1;
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public b(WebviewFaqCustomActivity webviewFaqCustomActivity, Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.TuitionPaymentFragmentbindingInflater1 = webviewFaqCustomActivity;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        }

        @JavascriptInterface
        public final void toastText(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Toast.makeText(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, p0, 0).show();
        }

        @JavascriptInterface
        public final void BackActivity(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.TuitionPaymentFragmentbindingInflater1.d_();
        }

        @JavascriptInterface
        public final void exitApp(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 184700839, -184700834, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr, LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static final class asInterface extends ClickableSpan {
        asInterface() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            WebviewFaqCustomActivity.notify(WebviewFaqCustomActivity.this);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(WebviewFaqCustomActivity.this, android.R.color.white));
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        WebviewFaqCustomActivity webviewFaqCustomActivity = (WebviewFaqCustomActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (StringsKt.startsWith$default(str, "tel:", false, 2, (Object) null)) {
            webviewFaqCustomActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            int i2 = INotificationSideChannelDefault + 17;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        if (StringsKt.startsWith$default(str, MailTo.MAILTO_SCHEME, false, 2, (Object) null)) {
            webviewFaqCustomActivity.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)));
            return true;
        }
        if (StringsKt.startsWith$default(str, "https://api.whatsapp.com/", false, 2, (Object) null)) {
            webviewFaqCustomActivity.b(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "https://play.google.com/", false, 2, (Object) null)) {
            webviewFaqCustomActivity.b(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "whatsapp://", false, 2, (Object) null)) {
            webviewFaqCustomActivity.b(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "https://app.tanamduit.com/invite/bpjs", false, 2, (Object) null)) {
            webviewFaqCustomActivity.b(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "tokopedia://", false, 2, (Object) null)) {
            int i3 = IconCompatParcelizer + 7;
            INotificationSideChannelDefault = i3 % 128;
            if (i3 % 2 != 0) {
                webviewFaqCustomActivity.b(str);
                return true;
            }
            webviewFaqCustomActivity.b(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "market://", false, 2, (Object) null)) {
            webviewFaqCustomActivity.b(str);
            return true;
        }
        if (!(!StringsKt.startsWith$default(str, "intent://", false, 2, (Object) null))) {
            try {
                Intent uri = Intent.parseUri(str, 1);
                if (uri.getStringExtra("S.browser_fallback_url") == null) {
                    webviewFaqCustomActivity.startActivity(uri);
                }
                return true;
            } catch (URISyntaxException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private final boolean b(String p0) {
        int i = 2 % 2;
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p0)));
            int i2 = IconCompatParcelizer + 19;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Aplikasi tidak tersedia", 0).show();
            return false;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final WebviewFaqCustomActivity webviewFaqCustomActivity = (WebviewFaqCustomActivity) objArr[0];
        int i = 2 % 2;
        AlertDialog.Builder builder = new AlertDialog.Builder(webviewFaqCustomActivity);
        builder.setMessage("Apakah Anda yakin ingin keluar dari menu ini?").setCancelable(false).setPositiveButton("Ya", new DialogInterface.OnClickListener() { // from class: CaptureSessionShouldUseMrirQuirk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() { // from class: CaptureSessionStuckQuirk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WebviewFaqCustomActivity.TuitionPaymentFragmentbindingInflater1(dialogInterface);
            }
        });
        builder.create().show();
        int i2 = IconCompatParcelizer + 23;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        super.onRequestPermissionsResult(p0, p1, p2);
        if (p0 == this.cancel && p2.length != 0) {
            int i2 = INotificationSideChannelDefault + 23;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            for (int i4 : p2) {
                if (i4 == -1) {
                    this.asBinder = false;
                    Toast.makeText((Context) null, "Permission Denied. This app will not work with right permission.", 1).show();
                    return;
                }
            }
            this.asBinder = true;
        }
        int i5 = INotificationSideChannelDefault + 101;
        IconCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int p0, KeyEvent p1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 89;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0 ? p0 == 4 : p0 == 3) {
            if (((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.canGoBack()) {
                ((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.goBack();
                int i3 = INotificationSideChannelDefault + 51;
                IconCompatParcelizer = i3 % 128;
                if (i3 % 2 != 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        boolean zOnKeyDown = super.onKeyDown(p0, p1);
        int i4 = INotificationSideChannelDefault + 77;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return zOnKeyDown;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 11;
        IconCompatParcelizer = i2 % 128;
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
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = IconCompatParcelizer + 35;
            INotificationSideChannelDefault = i3 % 128;
            if (i3 % 2 == 0) {
                return zOnOptionsItemSelected;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
        ((acquireBuffer) this.cancelAll.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        ((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.clearCache(true);
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
        WebStorage.getInstance().deleteAllData();
        int i4 = INotificationSideChannelDefault + 117;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i;
        Object[] objArr;
        int i2 = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
            int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 23;
            Object[] objArr2 = new Object[1];
            c($$a[54], (byte) 37, (short) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, i3, iNormalizeMetaState, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                Object[] objArr3 = new Object[1];
                c($$a[54], (byte) 52, (short) 89, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, i4, iResolveSizeAndState, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iMyPid = Process.myPid();
            int i5 = (((370336724 + (((-185231366) | iMyPid) * (-627))) + (((~((-14783795) | iMyPid)) | 197818631) * (-627))) + (((~(iMyPid | 197818631)) | (~((~iMyPid) | 14783794))) * 627)) - 908473112;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i7 ^ (i7 << 5);
            i = IconCompatParcelizer + 105;
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{32693, 53489, 8503, 29267, 49869, 4920, 25700, 46232, 1472, 22070, 42650, 63427, 18456, 39080, 59880, 14867}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 44868, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{32694, 41762, 50824, 60026, 3535, 12619, 21565, 30601, 39775, 48863, 57942, 1316, 10416, 19573, 28645, 37709}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_open_with).substring(0, 9).codePointAt(1) + 56361, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-955730931};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1726 - TextUtils.getTrimmedLength(""), 29 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -908473112, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int i8 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                    Object[] objArr8 = new Object[1];
                    c($$a[54], (byte) 52, (short) 89, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, i8, maximumDrawingCacheSize2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{32702, 38016, 43481, 48702, 54132, 59459, 64669, 4518, 9784, 15125, 20507, 25751, 31210, 36561, 41733, 47205, 52386, 57821, 63169, 2835, 8296, 13489}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_user_canceled_liveness_with_back).substring(0, 54).length() + 60155, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{32698, 56472, 14824, 38446, 62208, 20589, 44217, 2464, 26338, 49981, Typography.rightDoubleQuote, 32114, 55730, 13981, 37856}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_danamon_online).substring(1, 3).length() + 41769, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
                        byte[] bArr = $$a;
                        Object[] objArr11 = new Object[1];
                        c(bArr[54], (byte) 52, bArr[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, iLastIndexOf, packedPositionGroup, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
                        int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        Object[] objArr12 = new Object[1];
                        c($$a[54], (byte) 37, (short) 52, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, iLastIndexOf2, iIndexOf, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    i = IconCompatParcelizer + 77;
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
        INotificationSideChannelDefault = i % 128;
        int i9 = i % 2;
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step2).substring(32, 33).length() + 744275953;
            int i13 = i12 + (-1777376057) + (((~(length | (-226795879))) | (-439398305)) * (-465)) + (((-226795879) | (~((-439398305) | length))) * 930) + ((length | (-134258977)) * 465);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                int i16 = INotificationSideChannelDefault + 119;
                IconCompatParcelizer = i16 % 128;
                int i17 = i16 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i20 = i18 + 1878469249 + ((884215370 | i19) * 376) + (((~((~i19) | 737185767)) | 335806472) * (-376)) + (((~(i19 | (-737185768))) | (-524583342)) * 376);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr14[3])[0] = i22 ^ (i22 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
            int i23 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
            Object[] objArr15 = new Object[1];
            c($$a[54], (byte) 52, (short) 141, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout, longPressTimeout, i23, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{32702, 38016, 43481, 48702, 54132, 59459, 64669, 4518, 9784, 15125, 20507, 25751, 31210, 36561, 41733, 47205, 52386, 57821, 63169, 2835, 8296, 13489}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_mandiri_ecash).substring(0, 32).length() + 60177, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{32698, 56472, 14824, 38446, 62208, 20589, 44217, 2464, 26338, 49981, Typography.rightDoubleQuote, 32114, 55730, 13981, 37856}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).codePointAt(0) + 41661, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int mirror = 1079 - AndroidCharacter.getMirror('0');
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 15;
            Object[] objArr18 = new Object[1];
            c($$a[54], (byte) 52, (short) 89, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, mirror, offsetBefore, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                byte b2 = (byte) ($$b & 21);
                byte b3 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(b2, b3, b3, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, iCombineMeasuredStates, longPressTimeout2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr20[3])[0];
            int i25 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = ((((-819766941) + (((~(129740421 | iIdentityHashCode)) | 4198496) * (-140))) + ((~(133938917 | iIdentityHashCode)) * 70)) + (((~(iIdentityHashCode | 114539748)) | 23597665) * 70)) - 361465509;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[2])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{32693, 53489, 8503, 29267, 49869, 4920, 25700, 46232, 1472, 22070, 42650, 63427, 18456, 39080, 59880, 14867}, 44879 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{32694, 41762, 50824, 60026, 3535, 12619, 21565, 30601, 39775, 48863, 57942, 1316, 10416, 19573, 28645, 37709}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 56437, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-955730931};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1134 - (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -361465509, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                Object[] objArr25 = new Object[1];
                c($$a[54], (byte) 52, (short) 141, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf, packedPositionGroup2, tapTimeout, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0) + 45994), View.MeasureSpec.makeMeasureSpec(0, 0) + 1117, 17 - TextUtils.getOffsetBefore("", 0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int i29 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iLastIndexOf3 = 14 - TextUtils.lastIndexOf("", '0', 0);
                byte b4 = (byte) ($$b & 21);
                byte b5 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b4, b5, b5, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cArgb, i29, iLastIndexOf3, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{32702, 38016, 43481, 48702, 54132, 59459, 64669, 4518, 9784, 15125, 20507, 25751, 31210, 36561, 41733, 47205, 52386, 57821, 63169, 2835, 8296, 13489}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 60173, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{32698, 56472, 14824, 38446, 62208, 20589, 44217, 2464, 26338, 49981, Typography.rightDoubleQuote, 32114, 55730, 13981, 37856}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 41735, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int iLastIndexOf4 = 1030 - TextUtils.lastIndexOf("", '0');
                    int i30 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr29 = new Object[1];
                    c($$a[54], (byte) 52, (short) 89, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(size, iLastIndexOf4, i30, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cBlue = (char) Color.blue(0);
                    int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
                    Object[] objArr30 = new Object[1];
                    c($$a[54], (byte) 52, (short) 141, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cBlue, iResolveOpacity, modifierMetaStateMask, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr[1])[0];
        int i32 = ((int[]) objArr[3])[0];
        if (i32 == i31) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i36 = ~iIdentityHashCode2;
            int i37 = i33 + (-892946910) + (((~(i36 | (-707949482))) | 36839592 | (~((-281119763) | iIdentityHashCode2))) * 717) + (((~(iIdentityHashCode2 | (-707949482))) | (~(i36 | (-281119763))) | 36839592) * 717);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr31[2])[0] = i39 ^ (i39 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i40 = 0;
            while (i40 < strArr4.length) {
                int i41 = INotificationSideChannelDefault + 103;
                IconCompatParcelizer = i41 % 128;
                if (i41 % 2 == 0) {
                    arrayList2.add(strArr4[i40]);
                    i40 += 11;
                } else {
                    arrayList2.add(strArr4[i40]);
                    i40++;
                }
                int i42 = IconCompatParcelizer + 103;
                INotificationSideChannelDefault = i42 % 128;
                int i43 = i42 % 2;
            }
        }
        Toast.makeText((Context) null, i32 / (((i32 - 1) * i32) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i44 = ((int[]) objArr[2])[0];
        int i45 = ((int[]) objArr[3])[0];
        int i46 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i47 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i48 = ~i47;
        int i49 = (-711022115) + (((~((-564790485) | i48)) | 547357844 | (~(320510314 | i48)) | (~((-303077675) | i47))) * (-84));
        int i50 = (~(i47 | 320510314)) | 564790484;
        int i51 = ~(i48 | (-320510315));
        int i52 = i44 + i49 + ((i50 | i51) * (-84)) + ((303077674 | i51) * 84);
        int i53 = (i52 << 13) ^ i52;
        int i54 = i53 ^ (i53 >>> 17);
        ((int[]) objArr32[2])[0] = i54 ^ (i54 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i6 = 854761672 + (((~(105816659 | i5)) | (-935804203)) * 672);
        int i7 = ~i5;
        if (i4 != i6 + (((~(i5 | (-935804203))) | (~((-105816660) | i7))) * (-672)) + (((~(935804202 | i7)) | (-936361852)) * 672)) {
            int i8 = 314294000 % 2;
            throw new ArithmeticException();
        }
        int i9 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i9 != 1368812768 + ((~((~iUptimeMillis) | (-537920589))) * 433) + (((~((-1600581905) | iUptimeMillis)) | (-978474061)) * (-433)) + (((~(iUptimeMillis | (-978474061))) | (-2138502493)) * 433)) {
            int i10 = (-538122406) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i11 = INotificationSideChannelDefault + 43;
        IconCompatParcelizer = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 23;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        if (i4 != ((2086574706 + (((-537134083) | iNextInt) * (-381))) + (((~((~iNextInt) | (-1623000867))) | 1341746025) * 381)) - 1510344966) {
            int i5 = (-996148300) % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i7 = ~iIdentityHashCode;
        if (i6 != (-947944364) + (((~(1909177404 | i7)) | (~((-193266074) | iIdentityHashCode))) * (-370)) + (((~(iIdentityHashCode | 1909177404)) | (~(i7 | (-193266074))) | 1883946020) * (-370)) + 1275325448) {
            throw null;
        }
        super.onStart();
        int i8 = IconCompatParcelizer + 11;
        INotificationSideChannelDefault = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cb, code lost:
    
        if (r1 != (((1134762828 + (((~(1898913181 | r2)) | 1896291589) * (-502))) + ((~((~r2) | 2079293439)) * (-502))) + (((~(r2 | (-183001851))) | 1898913181) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_DRAWPATH))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cd, code lost:
    
        super.onCreate(r13);
        r13 = com.bpjstku.presentation.util.WebviewFaqCustomActivity.INotificationSideChannelDefault + 65;
        com.bpjstku.presentation.util.WebviewFaqCustomActivity.IconCompatParcelizer = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e2, code lost:
    
        throw new java.lang.RuntimeException("-435722690");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r1 == (((((~((-20444005) | r6)) | 3179040) * (-566)) + 969349096) + ((~(r6 | (-17264965))) * 566))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0080, code lost:
    
        if (r1 == ((1957974023 + (((~((-283750184) | r7)) | (~(r6 | (-1113737727)))) * 333)) + (((~(r6 | (-283750184))) | (~(r7 | (-1113737727)))) * 333))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0082, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewFaqCustomActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebviewFaqCustomActivity webviewFaqCustomActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 95;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ((ActivityWebviewFaqCustomBinding) ((ViewBinding) webviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(0);
        ((ActivityWebviewFaqCustomBinding) ((ViewBinding) webviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerError.setVisibility(8);
        webviewFaqCustomActivity.INotificationSideChannelStubProxy();
        Unit unit = Unit.INSTANCE;
        int i4 = IconCompatParcelizer + 77;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 35;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            Toast.makeText(webviewFaqCustomActivity, "Download completed", 0).show();
        } else {
            Toast.makeText(webviewFaqCustomActivity, "Download completed", 0).show();
        }
        int i3 = IconCompatParcelizer + 53;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            return null;
        }
        function1.invoke(obj);
        int i3 = 62 / 0;
        return null;
    }

    public static /* synthetic */ void b(String str, String str2, String str3, WebviewFaqCustomActivity webviewFaqCustomActivity, VideoEncoderSessionVideoEncoderState videoEncoderSessionVideoEncoderState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(videoEncoderSessionVideoEncoderState, "");
        String strGuessFileName = URLUtil.guessFileName(str, str2, str3);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(strGuessFileName);
        request.setDescription("Downloading file...");
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
        Object systemService = webviewFaqCustomActivity.getSystemService("download");
        Intrinsics.checkNotNull(systemService, "");
        try {
            ((DownloadManager) systemService).enqueue(request);
            videoEncoderSessionVideoEncoderState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i2 = INotificationSideChannelDefault + 21;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
            }
        } catch (Exception e2) {
            videoEncoderSessionVideoEncoderState.TuitionPaymentFragmentbindingInflater1(e2);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebviewFaqCustomActivity webviewFaqCustomActivity, View view) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 184700839, -184700834, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{webviewFaqCustomActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ViewPortBuilder.b();
                return;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 184700839, -184700834, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, new Object[]{webviewFaqCustomActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault7, iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
            ViewPortBuilder.b();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IconCompatParcelizer + 5;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 73;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        webviewFaqCustomActivity.d_();
        int i4 = INotificationSideChannelDefault + 27;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }

    public static /* synthetic */ Unit b(WebviewFaqCustomActivity webviewFaqCustomActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 1;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        webviewFaqCustomActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannelDefault + 83;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r7, "data:", false, 2, (java.lang.Object) null) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r7);
        r5 = com.bpjstku.presentation.util.WebviewFaqCustomActivity.INotificationSideChannelDefault + 39;
        com.bpjstku.presentation.util.WebviewFaqCustomActivity.IconCompatParcelizer = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if ((r5 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r5 = 69 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r5 = defpackage.VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(new defpackage.CaptureNoResponseQuirk(r7, r8, r9, r6));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r8 = defpackage.isSamsungJ2.b();
        defpackage.share.b(r8, "scheduler is null");
        r0 = new io.reactivex.internal.operators.completable.CompletableSubscribeOn(r5, r8);
        r5 = defpackage.dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
        defpackage.share.b(r5, "scheduler is null");
        r8 = new io.reactivex.internal.operators.completable.CompletableObserveOn(r0, r5);
        r5 = new defpackage.DeviceQuirks(r6);
        r9 = new defpackage.DeviceQuirksExternalSyntheticLambda0(r6);
        r5 = r8.b(r5, new defpackage.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk(r9));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        ((defpackage.acquireBuffer) r6.cancelAll.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r7, "blob:", false, 3, (java.lang.Object) null) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r7, "blob:", false, 2, (java.lang.Object) null) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r5.webView.loadUrl(defpackage.OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentbindingInflater1(r7, r9));
        r5 = com.bpjstku.presentation.util.WebviewFaqCustomActivity.INotificationSideChannelDefault + 61;
        com.bpjstku.presentation.util.WebviewFaqCustomActivity.IconCompatParcelizer = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(com.bpjstku.databinding.ActivityWebviewFaqCustomBinding r5, final com.bpjstku.presentation.util.WebviewFaqCustomActivity r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.util.WebviewFaqCustomActivity.IconCompatParcelizer
            int r1 = r1 + 1
            int r2 = r1 % 128
            com.bpjstku.presentation.util.WebviewFaqCustomActivity.INotificationSideChannelDefault = r2
            int r1 = r1 % r0
            java.lang.String r2 = "blob:"
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L1d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r1 = 3
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r7, r2, r4, r1, r3)
            if (r1 == 0) goto L39
            goto L26
        L1d:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r7, r2, r4, r0, r3)
            if (r1 == 0) goto L39
        L26:
            android.webkit.WebView r5 = r5.webView
            java.lang.String r6 = defpackage.OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentbindingInflater1(r7, r9)
            r5.loadUrl(r6)
            int r5 = com.bpjstku.presentation.util.WebviewFaqCustomActivity.INotificationSideChannelDefault
            int r5 = r5 + 61
            int r6 = r5 % 128
            com.bpjstku.presentation.util.WebviewFaqCustomActivity.IconCompatParcelizer = r6
            int r5 = r5 % r0
            return
        L39:
            java.lang.String r5 = "data:"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r7, r5, r4, r0, r3)
            if (r5 == 0) goto L53
            r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r7)
            int r5 = com.bpjstku.presentation.util.WebviewFaqCustomActivity.INotificationSideChannelDefault
            int r5 = r5 + 39
            int r6 = r5 % 128
            com.bpjstku.presentation.util.WebviewFaqCustomActivity.IconCompatParcelizer = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L52
            r5 = 69
            int r5 = r5 / r4
        L52:
            return
        L53:
            CaptureNoResponseQuirk r5 = new CaptureNoResponseQuirk
            r5.<init>(r7, r8, r9, r6)
            VideoEncoderSession1 r5 = defpackage.VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(r5)
            java.lang.String r7 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            appendBackupVideoProfile r8 = defpackage.isSamsungJ2.b()
            java.lang.String r9 = "scheduler is null"
            defpackage.share.b(r8, r9)
            io.reactivex.internal.operators.completable.CompletableSubscribeOn r0 = new io.reactivex.internal.operators.completable.CompletableSubscribeOn
            r0.<init>(r5, r8)
            appendBackupVideoProfile r5 = defpackage.dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1()
            defpackage.share.b(r5, r9)
            io.reactivex.internal.operators.completable.CompletableObserveOn r8 = new io.reactivex.internal.operators.completable.CompletableObserveOn
            r8.<init>(r0, r5)
            DeviceQuirks r5 = new DeviceQuirks
            r5.<init>()
            DeviceQuirksExternalSyntheticLambda0 r9 = new DeviceQuirksExternalSyntheticLambda0
            r9.<init>(r6)
            CrashWhenTakingPhotoWithAutoFlashAEModeQuirk r0 = new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk
            r0.<init>()
            BufferProviderState r5 = r8.b(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            kotlin.Lazy r6 = r6.cancelAll
            java.lang.Object r6 = r6.getValue()
            acquireBuffer r6 = (defpackage.acquireBuffer) r6
            r6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(com.bpjstku.databinding.ActivityWebviewFaqCustomBinding, com.bpjstku.presentation.util.WebviewFaqCustomActivity, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            dialogInterface.dismiss();
            return;
        }
        dialogInterface.dismiss();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebviewFaqCustomActivity webviewFaqCustomActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
            if (!bool.booleanValue()) {
                int i4 = IconCompatParcelizer + 45;
                INotificationSideChannelDefault = i4 % 128;
                int i5 = i4 % 2;
                WebviewFaqCustomActivity webviewFaqCustomActivity2 = webviewFaqCustomActivity;
                String string = webviewFaqCustomActivity.getString(R.string.message_storage_permission_required);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AutoValue_LifecycleCameraRepository_Key.b(webviewFaqCustomActivity2, string);
            }
        } else if (!bool.booleanValue()) {
            int i6 = IconCompatParcelizer + 45;
            INotificationSideChannelDefault = i6 % 128;
            int i7 = i6 % 2;
            WebviewFaqCustomActivity webviewFaqCustomActivity3 = webviewFaqCustomActivity;
            String string2 = webviewFaqCustomActivity.getString(R.string.message_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            AutoValue_LifecycleCameraRepository_Key.b(webviewFaqCustomActivity3, string2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebviewFaqCustomActivity webviewFaqCustomActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 43;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Toast.makeText(webviewFaqCustomActivity, "Error downloading file: ".concat(String.valueOf(th.getMessage())), 0).show();
        th.printStackTrace();
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannelDefault + 119;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(webviewFaqCustomActivity);
        int i2 = IconCompatParcelizer + 71;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return outputformattoaudioprofile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "JMO Web");
        if (!file.exists()) {
            int i2 = IconCompatParcelizer + 17;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            file.mkdirs();
            int i4 = IconCompatParcelizer + 93;
            INotificationSideChannelDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        String str = File.separator;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        sb.append(str);
        sb.append("IMG_");
        sb.append(jCurrentTimeMillis);
        sb.append(".jpg");
        return new File(sb.toString());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        WebviewFaqCustomActivity webviewFaqCustomActivity = this;
        Intrinsics.checkNotNullParameter(webviewFaqCustomActivity, "");
        webviewFaqCustomActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        TextView textView = ((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle;
        String str = this.TuitionPaymentFragmentbindingInflater1;
        if (str == null) {
            int i4 = IconCompatParcelizer + 95;
            INotificationSideChannelDefault = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        textView.setText(str);
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        String strB = getMaxImages.b();
        if (strB.length() > 0) {
            try {
                if (((AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class)).getStatus()) {
                    ((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutAntrianOnlineInfo.setVisibility(8);
                    int i6 = INotificationSideChannelDefault + 19;
                    IconCompatParcelizer = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
            } catch (Exception unused) {
            }
        }
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, "Appointment Online", 0, false, 6, (Object) null);
        spannableString.setSpan(new asInterface(), iIndexOf$default, iIndexOf$default + 18, 33);
        ((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAntrianOnlineInfo.setText(spannableString);
        ((ActivityWebviewFaqCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAntrianOnlineInfo.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2116169296, 2116169305, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{function1, obj}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ void g() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 29;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        MediaBrowserCompat = 1;
        INotificationSideChannel();
        INSTANCE = new Companion(null);
        int i = read + 105;
        MediaBrowserCompat = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ File cancelAll() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (File) TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1177220659, -1177220653, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[0], iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static final /* synthetic */ int TuitionPaymentFragmentbindingInflater1(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1357004815, -1357004815, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{webviewFaqCustomActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).intValue();
    }

    public static final /* synthetic */ int asBinder(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -666297654, 666297662, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{webviewFaqCustomActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).intValue();
    }

    public static final /* synthetic */ boolean b(WebviewFaqCustomActivity webviewFaqCustomActivity, String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1217819696, 1217819698, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{webviewFaqCustomActivity, str}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).booleanValue();
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        Object[] objArr = {this, p0};
        int i = (-1393826158) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 941771813;
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault3(SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -45405693, 45405700, i, objArr, LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), length)).booleanValue();
    }

    public final void onTransact() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 184700839, -184700834, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 9;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        IconCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_webview_faq_custom;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1177086192, 1177086196, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1943909771, -1943909768, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 252869599, -252869598, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1044634891, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static void INotificationSideChannel() {
        INotificationSideChannelStub = -2815764911530387772L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        WebviewFaqCustomActivity webviewFaqCustomActivity = (WebviewFaqCustomActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannelDefault + 25;
        IconCompatParcelizer = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
