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
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
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
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityWebviewCustomBinding;
import com.bpjstku.databinding.LayoutToolbarCenterBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.OutputConfigurationCompatApi28Impl;
import defpackage.VideoEncoderSessionVideoEncoderState;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.pickSuitableFpsRange;
import defpackage.unbindImageCaptureAndRecreate;
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
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0006\u0017\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\n\u0010\u000fJ)\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u0004J-\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u001b2\u0006\u0010\u0013\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0014¢\u0006\u0004\b%\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010\n\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\u0006\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010-R$\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u001b\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00100R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010&R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00106\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\t\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010+R\u0014\u0010'\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0015\u00109\u001a\u0002088CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b9\u0010:R\u0015\u00102\u001a\u00020;8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u0010:R\u0018\u0010\u001a\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b,\u0010=R\u0015\u0010)\u001a\u00020>8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010:R\u0014\u0010@\u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b,\u0010?R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00020A8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010C"}, d2 = {"Lcom/bpjstku/presentation/util/WebviewCustomActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityWebviewCustomBinding;", "<init>", "()V", "", "b", "asBinder", "asInterface", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "INotificationSideChannelDefault", "getInterfaceDescriptor", "", "p0", "(Ljava/lang/String;)Ljava/lang/String;", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Z", "TuitionPaymentFragmentbindingInflater1", "cancelAll", "", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/view/KeyEvent;", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onDestroy", "Ljava/lang/String;", "cancel", "Lcom/bpjstku/domain/user/model/User;", "notify", "Lcom/bpjstku/domain/user/model/User;", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "Landroid/webkit/ValueCallback;", "Ljava/io/File;", "INotificationSideChannel", "Ljava/io/File;", "g", "Landroid/net/Uri;", "d", "RemoteActionCompatParcelizer", "LoutputFormatToAudioProfile;", "onTransact", "Lkotlin/Lazy;", "LacquireBuffer;", "Landroid/content/Context;", "Landroid/content/Context;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "()I", "INotificationSideChannelStubProxy", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebviewCustomActivity extends BindingBaseActivity<ActivityWebviewCustomBinding> {
    private static boolean INotificationSideChannelDefault;
    private static char[] INotificationSideChannelStub;
    private static int IconCompatParcelizer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int getInterfaceDescriptor;
    private static boolean read;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private File g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public Context cancelAll;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private ValueCallback<Uri[]> asInterface;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy INotificationSideChannel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Uri d;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private User TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {88, 99, -94, -58};
    private static final int $$f = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {14, 70, 6, -35, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 19;
    private static int connect = 0;
    private static int MediaBrowserCompat = 0;
    private static int write = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int b = 1;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean a = true;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int cancel = 11;
    private final Lazy onTransact = LazyKt.lazy(new Function0() { // from class: SessionConfigurationCompatSessionConfigurationCompatImpl
        private static final byte[] $$c = {88, ByteCompanionObject.MAX_VALUE, -112, -47};
        private static final int $$f = 201;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {109, 84, -87, -114, 8, 25, -39, 51, 13, 14, -4, -21, 57, 9, 11, 7, -3, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -57};
        private static final int $$e = 44;
        private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 33;
        private static int d = 0;
        private static int g = 1;
        private static char TuitionPaymentFragmentbindingInflater1 = 57378;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 7587;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 62777;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 9394;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 15
                int r0 = r7 + 38
                int r5 = r5 * 2
                int r5 = r5 + 84
                byte[] r1 = defpackage.SessionConfigurationCompatSessionConfigurationCompatImpl.$$a
                int r6 = r6 * 52
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                int r7 = r7 + 37
                r2 = 0
                if (r1 != 0) goto L19
                r4 = r6
                r5 = r7
                r3 = r2
                goto L2b
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r6]
            L2b:
                int r6 = r6 + 1
                int r5 = r5 + r4
                int r5 = r5 + (-11)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.SessionConfigurationCompatSessionConfigurationCompatImpl.a(int, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(short r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = defpackage.SessionConfigurationCompatSessionConfigurationCompatImpl.$$d
                int r5 = r5 * 39
                int r1 = r5 + 14
                int r6 = r6 * 13
                int r6 = 16 - r6
                int r7 = r7 * 19
                int r7 = 103 - r7
                byte[] r1 = new byte[r1]
                int r5 = r5 + 13
                r2 = 0
                if (r0 != 0) goto L19
                r4 = r7
                r3 = r2
                r7 = r5
                goto L2d
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                int r6 = r6 + 1
                r1[r3] = r4
                if (r3 != r5) goto L29
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L29:
                r4 = r0[r6]
                int r3 = r3 + 1
            L2d:
                int r7 = r7 + r4
                int r7 = r7 + (-10)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.SessionConfigurationCompatSessionConfigurationCompatImpl.e(short, int, int, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i3 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                int i4 = $11 + 93;
                $10 = i4 % 128;
                int i5 = 58224;
                char c = 1;
                if (i4 % 2 != 0) {
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 1];
                } else {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                }
                int i6 = 0;
                while (i6 < 16) {
                    int i7 = $11 + 41;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                    int i10 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[c] = Integer.valueOf(i9);
                        objArr2[i3] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char scrollBarSize = (char) (47773 - (ViewConfiguration.getScrollBarSize() >> 8));
                            int iBlue = Color.blue(i3) + 468;
                            int gidForName = 12 - Process.getGidForName("");
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, iBlue, gidForName, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - Color.red(0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 468, 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6++;
                        i3 = 0;
                        c = 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getSize(0), 2323 - (ViewConfiguration.getScrollBarSize() >> 8), Drawable.resolveOpacity(0, 0) + 44, -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int keyRepeatDelay = 2267 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 33;
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b, b, bArr[132], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, keyRepeatDelay, iKeyCodeFromString, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{5419, 57464, 42338, 27990, 33262, 24497, 24571, 54231, 5027, 29674, 54592, 28275, 49597, 21547, 45091, 56302, 50497, 44660, 32562, 58485, 7440, 41284, 65165, 26772}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{23234, 20865, 32153, 1702, 30380, 42575, 25621, 33188, 33043, 49288, 28116, 28020, 32391, 16792, 28633, 8949, 64705, 31893}, View.getDefaultSize(0, 0) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int fadingEdgeLength = 2267 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iMyPid = (Process.myPid() >> 22) + 33;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[7];
                byte b3 = bArr2[132];
                Object[] objArr5 = new Object[1];
                a(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, fadingEdgeLength, iMyPid, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2267;
                    int pressedStateDuration = 33 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    a(b4, bArr3[37], b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, absoluteGravity, pressedStateDuration, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i2 = ((int[]) objArr7[0])[0];
                int i3 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iNextInt = new Random().nextInt(748167885);
                int i4 = ((((-1596401559) + (((~(145431009 | iNextInt)) | 654369282) * (-140))) + ((~(799800291 | iNextInt)) * 70)) + (((~(iNextInt | 663282306)) | 790887267) * 70)) - 2019233036;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
                c = 3;
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{64159, 4075, 11955, 47463, 34826, 26636, 4009, 15427, 57321, 38563, 55378, ']', 21665, 49834, 2433, 25677, 51662, 53696, 18829, 40620, 6952, 60506, 49074, 8477, 63735, 21441, 18378, 64273}, 26 - Drawable.resolveOpacity(0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{16876, 20258, 37599, 8681, 41206, 44490, 25192, 25260, 21694, 10919, 37761, 57017, 38448, 14607, 48826, 17533, 58169, 6399, 9068, 8934}, TextUtils.lastIndexOf("", '0', 0, 0) + 19, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        applicationContext = null;
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                        int i7 = d + 107;
                        g = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{30529, 5672, 14315, 17364, 41848, 4032, 60914, 11990, 35305, 33190, 21375, 23346, 242, 21749, 3575, 36747, 22041, 40193}, (ViewConfiguration.getTapTimeout() >> 16) + 16, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{58941, 2565, 5294, 55998, 41721, 20364, 18806, 21374, 54577, 9953, 4571, 55217, 63035, 63789, 63218, 30527, 27072, 63418}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i9 = d + 49;
                g = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -2019233036};
                    byte[] bArr4 = $$d;
                    byte b5 = bArr4[50];
                    byte b6 = (byte) (b5 - 1);
                    byte b7 = b5;
                    Object[] objArr13 = new Object[1];
                    e(b6, b7, (byte) (b7 - 1), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b8 = bArr4[50];
                    byte b9 = b8;
                    Object[] objArr14 = new Object[1];
                    e(b9, (byte) (b9 - 1), b8, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cBlue = (char) Color.blue(0);
                            int i11 = 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int defaultSize = 33 - View.getDefaultSize(0, 0);
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[7];
                            Object[] objArr16 = new Object[1];
                            a(b10, bArr5[37], b10, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, i11, defaultSize, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new char[]{5419, 57464, 42338, 27990, 33262, 24497, 24571, 54231, 5027, 29674, 54592, 28275, 49597, 21547, 45091, 56302, 50497, 44660, 32562, 58485, 7440, 41284, 65165, 26772}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new char[]{23234, 20865, 32153, 1702, 30380, 42575, 25621, 33188, 33043, 49288, 28116, 28020, 32391, 16792, 28633, 8949, 64705, 31893}, AndroidCharacter.getMirror('0') - '!', objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                int iBlue = 2267 - Color.blue(0);
                                int iMyTid = 33 - (Process.myTid() >> 22);
                                byte[] bArr6 = $$a;
                                byte b11 = bArr6[7];
                                byte b12 = bArr6[132];
                                Object[] objArr19 = new Object[1];
                                a(b11, b12, b12, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iBlue, iMyTid, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2268;
                                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 34;
                                byte[] bArr7 = $$a;
                                byte b13 = bArr7[7];
                                Object[] objArr20 = new Object[1];
                                a(b13, b13, bArr7[132], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iIndexOf, modifierMetaStateMask2, -887667012, false, (String) objArr20[0], null);
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
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i12 = ((int[]) objArr[c])[0];
            int i13 = ((int[]) objArr[0])[0];
            if (i13 == i12) {
                int i14 = g + 11;
                d = i14 % 128;
                int i15 = i14 % 2;
                Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i16 = ((int[]) objArr[2])[0];
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((int[]) objArr[3])[0];
                String[] strArr2 = (String[]) objArr[1];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i19 = i16 + ((~((-226644545) | elapsedCpuTime)) * 521) + 1515823368 + (((~((~elapsedCpuTime) | (-226644545))) | (-1035884285)) * 521);
                int i20 = i19 ^ (i19 << 13);
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr21[2])[0] = i21 ^ (i21 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[1];
                if (strArr3 != null) {
                    int i22 = d + 55;
                    g = i22 % 128;
                    if (i22 % 2 == 0) {
                        int i23 = 5 % 2;
                    }
                    for (String str : strArr3) {
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i13];
                int i24 = i13 - 1;
                iArr[i24] = 1;
                Toast.makeText((Context) null, iArr[((i13 * i24) % 2) - 1], 1).show();
                Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i25 = ((int[]) objArr[2])[0];
                int i26 = ((int[]) objArr[0])[0];
                int i27 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[1];
                int i28 = ~((~((int) Runtime.getRuntime().freeMemory())) | 194239394);
                int i29 = i25 + ((185850658 | i28) * (-970)) + 1148085815 + ((i28 | 8388736) * 970);
                int i30 = (i29 << 13) ^ i29;
                int i31 = i30 ^ (i30 >>> 17);
                ((int[]) objArr22[2])[0] = i31 ^ (i31 << 5);
            }
            return WebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r7, byte r8, short r9) {
            /*
                byte[] r0 = defpackage.SessionConfigurationCompatSessionConfigurationCompatImpl.$$c
                int r7 = r7 * 3
                int r7 = 108 - r7
                int r9 = r9 * 3
                int r9 = 3 - r9
                int r8 = r8 * 4
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r8
                r3 = r9
                r4 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r9 = r9 + 1
                if (r4 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L27:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2c:
                int r9 = -r9
                int r7 = r7 + r9
                r9 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.SessionConfigurationCompatSessionConfigurationCompatImpl.$$g(int, byte, short):java.lang.String");
        }
    });

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i6;
        int i8 = (~(i7 | i2)) | i3;
        int i9 = ~i2;
        int i10 = ~i3;
        int i11 = (~(i9 | i10)) | i6;
        int i12 = (~(i3 | i9 | i6)) | (~(i7 | i9 | i10)) | (~(i10 | i2 | i6));
        int i13 = i2 + i6 + i + ((-104759182) * i4) + ((-453318476) * i5);
        int i14 = i13 * i13;
        int i15 = (i2 * 1504131295) + 1805123584 + (1504131295 * i6) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i) + (711983104 * i4) + (1180696576 * i5) + (1022754816 * i14);
        int i16 = ((i2 * (-1431886989)) - 1507491630) + (i6 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + ((-1431886867) * i) + (i4 * 722567050) + (i5 * (-1618605404)) + (i14 * 297664512);
        switch (i15 + (i16 * i16 * (-277217280))) {
            case 1:
                return b(objArr);
            case 2:
                WebviewCustomActivity webviewCustomActivity = (WebviewCustomActivity) objArr[0];
                int i17 = 2 % 2;
                int i18 = MediaBrowserCompat + 29;
                write = i18 % 128;
                int i19 = i18 % 2;
                int i20 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i21 = 1816599732 + (((~((~startElapsedRealtime) | 1645491325)) | (-1923071488)) * (-245));
                int i22 = ~(startElapsedRealtime | 1645491325);
                if (i20 != i21 + (i22 * (-245)) + ((i22 | 815503782) * 245)) {
                    int i23 = write + 99;
                    MediaBrowserCompat = i23 % 128;
                    if (i23 % 2 != 0) {
                        int[] iArr = new int[1526913590];
                        iArr[1526913589] = 1;
                        Toast.makeText((Context) null, iArr[-1], 0).show();
                    } else {
                        int[] iArr2 = new int[1526913590];
                        iArr2[1526913589] = 1;
                        int i24 = 735389998 % 2;
                        Toast.makeText((Context) null, iArr2[-1], 1).show();
                    }
                }
                int i25 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
                int i26 = ~i;
                if (i25 != (-1091459136) + (((~((-1667750934) | i26)) | 911305031) * 226) + (((~(i26 | (-1093047313))) | (~((-911305032) | i)) | 336601410) * (-113)) + ((~(i | (-1667750934))) * 113)) {
                    throw new RuntimeException("-1847040070");
                }
                super.onStart();
                return null;
            case 3:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 5:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 6:
                return d(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return g(objArr);
            case 9:
                return a(objArr);
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.util.WebviewCustomActivity.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r5 = r5 + 4
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
        L24:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewCustomActivity.c(short, short, short, java.lang.Object[]):void");
    }

    public WebviewCustomActivity() {
        final WebviewCustomActivity webviewCustomActivity = this;
        this.INotificationSideChannel = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.util.WebviewCustomActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = webviewCustomActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.notify = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.util.WebviewCustomActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = webviewCustomActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ ActivityWebviewCustomBinding TuitionPaymentFragmentbindingInflater1(WebviewCustomActivity webviewCustomActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 81;
        write = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivityWebviewCustomBinding activityWebviewCustomBinding = (ActivityWebviewCustomBinding) ((ViewBinding) webviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i3 = MediaBrowserCompat + 77;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            return activityWebviewCustomBinding;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        WebviewCustomActivity webviewCustomActivity = (WebviewCustomActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat;
        int i3 = i2 + 75;
        write = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        webviewCustomActivity.asBinder = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 11;
        write = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebviewCustomActivity webviewCustomActivity, int i) {
        WebviewCustomActivity webviewCustomActivity2;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompat + 5;
        write = i3 % 128;
        int i4 = i3 % 2;
        String str = (String) MapsKt.mapOf(TuplesKt.to(-4, "User authentication failed on server"), TuplesKt.to(-8, "The server is taking too much time to communicate. Try again later."), TuplesKt.to(-15, "Too many requests during this load"), TuplesKt.to(-1, "Generic error"), TuplesKt.to(-12, "Check entered URL.."), TuplesKt.to(-6, "Error timeout.."), TuplesKt.to(-11, "Failed to perform SSL handshake"), TuplesKt.to(-2, "Server or proxy hostname lookup failed"), TuplesKt.to(-5, "User authentication failed on proxy"), TuplesKt.to(-9, "Too many redirects"), TuplesKt.to(-3, "Unsupported authentication scheme (not basic or digest)"), TuplesKt.to(-10, "unsupported scheme"), TuplesKt.to(-13, "Generic file error"), TuplesKt.to(-14, "File not found"), TuplesKt.to(-7, "The server failed to communicate. Try again later.")).get(Integer.valueOf(i));
        if (str != null) {
            webviewCustomActivity2 = webviewCustomActivity;
            ConstraintLayout constraintLayout = ((ActivityWebviewCustomBinding) ((ViewBinding) webviewCustomActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerWebCustomActivity;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(constraintLayout, str);
        } else {
            webviewCustomActivity2 = webviewCustomActivity;
        }
        if (i == -2) {
            int i5 = write + 55;
            MediaBrowserCompat = i5 % 128;
            int i6 = i5 % 2;
            ((ActivityWebviewCustomBinding) ((ViewBinding) webviewCustomActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl("about:blank");
            ((ActivityWebviewCustomBinding) ((ViewBinding) webviewCustomActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(8);
            ((ActivityWebviewCustomBinding) ((ViewBinding) webviewCustomActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerError.setVisibility(0);
        }
        int i7 = write + 53;
        MediaBrowserCompat = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebviewCustomActivity webviewCustomActivity, ValueCallback valueCallback) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 91;
        int i3 = i2 % 128;
        write = i3;
        int i4 = i2 % 2;
        webviewCustomActivity.asInterface = valueCallback;
        int i5 = i3 + 77;
        MediaBrowserCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebviewCustomActivity webviewCustomActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat;
        int i3 = i2 + 103;
        write = i3 % 128;
        int i4 = i3 % 2;
        int i5 = webviewCustomActivity.b;
        int i6 = i2 + 3;
        write = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final /* synthetic */ User a(WebviewCustomActivity webviewCustomActivity) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 23;
        MediaBrowserCompat = i3 % 128;
        int i4 = i3 % 2;
        User user = webviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i2 + 59;
        MediaBrowserCompat = i5 % 128;
        if (i5 % 2 == 0) {
            return user;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        WebviewCustomActivity webviewCustomActivity = (WebviewCustomActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat;
        int i3 = i2 + 29;
        write = i3 % 128;
        int i4 = i3 % 2;
        String str = webviewCustomActivity.asBinder;
        int i5 = i2 + 105;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    public static final /* synthetic */ File asInterface(WebviewCustomActivity webviewCustomActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 19;
        write = i2 % 128;
        int i3 = i2 % 2;
        File file = webviewCustomActivity.g;
        if (i3 != 0) {
            return file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void b(WebviewCustomActivity webviewCustomActivity, File file) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat;
        int i3 = i2 + 49;
        write = i3 % 128;
        int i4 = i3 % 2;
        webviewCustomActivity.g = file;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 49;
        write = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ boolean cancelAll(WebviewCustomActivity webviewCustomActivity) {
        int i = 2 % 2;
        int i2 = write + 69;
        int i3 = i2 % 128;
        MediaBrowserCompat = i3;
        int i4 = i2 % 2;
        boolean z = webviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i3 + 111;
        write = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ int d(WebviewCustomActivity webviewCustomActivity) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 1;
        MediaBrowserCompat = i3 % 128;
        int i4 = i3 % 2;
        int i5 = webviewCustomActivity.cancel;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i2 + 115;
        MediaBrowserCompat = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        WebviewCustomActivity webviewCustomActivity = (WebviewCustomActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = write + 45;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int iB = ModuleInstallRequest.b();
            return Boolean.valueOf(((Boolean) b(ModuleInstallRequest.b(), 945798586, iB, unbindImageCaptureAndRecreate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{webviewCustomActivity, str}, ModuleInstallRequest.b(), -945798578)).booleanValue());
        }
        int iB2 = ModuleInstallRequest.b();
        ((Boolean) b(ModuleInstallRequest.b(), 945798586, iB2, unbindImageCaptureAndRecreate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{webviewCustomActivity, str}, ModuleInstallRequest.b(), -945798578)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ValueCallback g(WebviewCustomActivity webviewCustomActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 43;
        write = i2 % 128;
        int i3 = i2 % 2;
        ValueCallback<Uri[]> valueCallback = webviewCustomActivity.asInterface;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return valueCallback;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.util.WebviewCustomActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/bpjstku/presentation/util/WebviewCustomActivity$b;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, String str, String str2, int i, User user, boolean z, int i2) {
            if ((i2 & 8) != 0) {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                user = null;
            }
            if ((i2 & 32) != 0) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, WebviewCustomActivity.class, new Pair[]{TuplesKt.to(ImagesContract.URL, str), TuplesKt.to("toolbar_title", str2), TuplesKt.to("registration_id", Integer.valueOf(i)), TuplesKt.to("key_web_user_data", user), TuplesKt.to("key_web_bsu", Boolean.valueOf(z))});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityWebviewCustomBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = write + 57;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        WebviewCustomActivity$bindingInflater$1 webviewCustomActivity$bindingInflater$1 = WebviewCustomActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = write + 11;
        MediaBrowserCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return webviewCustomActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra(ImagesContract.URL);
        String str = "";
        if (stringExtra == null) {
            int i2 = MediaBrowserCompat + 87;
            write = i2 % 128;
            int i3 = i2 % 2;
            stringExtra = "";
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("toolbar_title");
        if (stringExtra2 == null) {
            int i4 = MediaBrowserCompat + 85;
            write = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = stringExtra2;
        }
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getIntent().getBooleanExtra("key_web_bsu", false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (User) getIntent().getParcelableExtra("key_web_user_data");
        int i6 = write + 53;
        MediaBrowserCompat = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        TextView textView;
        int i = 2 % 2;
        WebviewCustomActivity webviewCustomActivity = this;
        Intrinsics.checkNotNullParameter(webviewCustomActivity, "");
        webviewCustomActivity.getWindow().addFlags(8192);
        LayoutToolbarCenterBinding layoutToolbarCenterBinding = ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
        String str = null;
        TuitionPaymentFragmentbindingInflater1((Toolbar) (layoutToolbarCenterBinding != null ? layoutToolbarCenterBinding.toolbar : null), true);
        LayoutToolbarCenterBinding layoutToolbarCenterBinding2 = ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
        if (layoutToolbarCenterBinding2 == null || (textView = layoutToolbarCenterBinding2.tvToolbarTitle) == null) {
            return;
        }
        int i2 = write + 85;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = write + 59;
            MediaBrowserCompat = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = str2;
        }
        textView.setText(str);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        INotificationSideChannelDefault();
        ArrayList arrayList = new ArrayList();
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) this.onTransact.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final Function1 function1 = new Function1() { // from class: SessionConfigurationCompatSessionMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebviewCustomActivity.b(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: getCorrectedFpsRange
            @Override // defpackage.logToString
            public final void accept(Object obj) throws IllegalAccessException {
                WebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.INotificationSideChannel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        Object obj = null;
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_NOTIFICATION_POLICY") != 0) {
            int i2 = MediaBrowserCompat + 61;
            write = i2 % 128;
            if (i2 % 2 == 0) {
                arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                throw null;
            }
            arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
        }
        int i3 = write + 7;
        MediaBrowserCompat = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        LayoutToolbarCenterBinding layoutToolbarCenterBinding = ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
        Object obj = null;
        if (layoutToolbarCenterBinding != null) {
            int i2 = MediaBrowserCompat + 25;
            write = i2 % 128;
            if (i2 % 2 == 0) {
                MaterialToolbar materialToolbar = layoutToolbarCenterBinding.toolbar;
                throw null;
            }
            MaterialToolbar materialToolbar2 = layoutToolbarCenterBinding.toolbar;
            if (materialToolbar2 != null) {
                materialToolbar2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: SessionConfigurationCompatSessionConfigurationCompatBaseImpl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return WebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj2);
                    }
                }));
            }
        }
        Button button = ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnTryAgain;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getSessionConfiguration
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return WebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj2);
            }
        }));
        int i3 = write + 81;
        MediaBrowserCompat = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void INotificationSideChannelDefault() {
        int i = 2 % 2;
        getInterfaceDescriptor();
        ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setWebChromeClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str == null) {
            int i2 = MediaBrowserCompat + 23;
            write = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl(str);
        int i4 = MediaBrowserCompat + 49;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = INotificationSideChannelStub;
        char c = '0';
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 27;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i3;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AndroidCharacter.getMirror(c) + 31291), 2993 - TextUtils.indexOf("", c, i3), 17 - View.MeasureSpec.getMode(i3), 1182129903, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
                    i3 = 0;
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
            Object[] objArr3 = {Integer.valueOf(getInterfaceDescriptor)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - TextUtils.indexOf((CharSequence) "", '0')), 252 - TextUtils.lastIndexOf("", '0', 0, 0), Color.blue(0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i7 = 1687675375;
            if (read) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i8 = $10 + 27;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33601), 3086 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 26 - TextUtils.getTrimmedLength(""), -2146875848, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i7 = 1687675375;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (INotificationSideChannelDefault) {
                int i10 = $11 + 23;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i12 = $11 + 71;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - Color.red(0)), KeyEvent.keyCodeFromString("") + 3085, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, -2146875848, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i14 = $10 + 121;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i16 = 0;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16;
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    i16 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends WebViewClient {
        private /* synthetic */ ActivityWebviewCustomBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityWebviewCustomBinding activityWebviewCustomBinding) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = activityWebviewCustomBinding;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            WebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebviewCustomActivity.this, i);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebviewCustomActivity webviewCustomActivity = WebviewCustomActivity.this;
            Intrinsics.checkNotNull(webResourceError);
            WebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(webviewCustomActivity, webResourceError.getErrorCode());
        }

        @Override // android.webkit.WebViewClient
        @Deprecated(message = "Deprecated in Java")
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (WebviewCustomActivity.TuitionPaymentFragmentbindingInflater1(WebviewCustomActivity.this, str)) {
                return true;
            }
            webView.loadUrl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!WebviewCustomActivity.TuitionPaymentFragmentbindingInflater1(WebviewCustomActivity.this, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null)) && webView != null) {
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
            ProgressBar progressBar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "");
            if (progressBar.getVisibility() == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.progressBar.setVisibility(8);
            }
            if (webView != null) {
                webView.clearHistory();
            }
            if (WebviewCustomActivity.cancelAll(WebviewCustomActivity.this)) {
                WebView webView2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.webView;
                User userA = WebviewCustomActivity.a(WebviewCustomActivity.this);
                String str2 = userA != null ? userA.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                if (str2 == null) {
                    str2 = "";
                }
                User userA2 = WebviewCustomActivity.a(WebviewCustomActivity.this);
                String str3 = userA2 != null ? userA2.b : null;
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

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        final ActivityWebviewCustomBinding activityWebviewCustomBinding = (ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityWebviewCustomBinding.webView.getSettings().setJavaScriptEnabled(true);
        activityWebviewCustomBinding.webView.getSettings().setLoadWithOverviewMode(true);
        activityWebviewCustomBinding.webView.getSettings().setUseWideViewPort(true);
        activityWebviewCustomBinding.webView.getSettings().setDomStorageEnabled(true);
        activityWebviewCustomBinding.webView.getSettings().setAllowContentAccess(true);
        activityWebviewCustomBinding.webView.getSettings().setAllowFileAccess(true);
        activityWebviewCustomBinding.webView.getSettings().setDatabaseEnabled(true);
        activityWebviewCustomBinding.webView.getSettings().setGeolocationEnabled(true);
        activityWebviewCustomBinding.webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebviewCustomActivity webviewCustomActivity = this;
        activityWebviewCustomBinding.webView.addJavascriptInterface(new OutputConfigurationCompatApi28Impl(webviewCustomActivity), "Android");
        activityWebviewCustomBinding.webView.addJavascriptInterface(new TuitionPaymentFragmentbindingInflater1(this, webviewCustomActivity), "androidApp");
        activityWebviewCustomBinding.webView.addJavascriptInterface(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, webviewCustomActivity, ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.notify.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.g(), ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.notify.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.d()), "WVGeraiJSInterface");
        activityWebviewCustomBinding.webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        activityWebviewCustomBinding.webView.getSettings().setCacheMode(-1);
        activityWebviewCustomBinding.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        activityWebviewCustomBinding.webView.getSettings().setBuiltInZoomControls(false);
        activityWebviewCustomBinding.webView.getSettings().setUseWideViewPort(true);
        activityWebviewCustomBinding.webView.setDownloadListener(new DownloadListener() { // from class: CameraNoResponseWhenEnablingFlashQuirk
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                WebviewCustomActivity.b(activityWebviewCustomBinding, this, str, str3, str4);
            }
        });
        activityWebviewCustomBinding.webView.evaluateJavascript("document.dispatchEvent(new Event(\"vueListenAndroid\"))", null);
        LayoutToolbarCenterBinding layoutToolbarCenterBinding = ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
        if (layoutToolbarCenterBinding != null) {
            int i2 = MediaBrowserCompat + 73;
            write = i2 % 128;
            int i3 = i2 % 2;
            MaterialToolbar materialToolbar = layoutToolbarCenterBinding.toolbar;
            if (materialToolbar != null) {
                materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: AeFpsRangeLegacyQuirk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws IllegalAccessException {
                        WebviewCustomActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
                    }
                });
                int i4 = write + 55;
                MediaBrowserCompat = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 % 3;
                }
            }
        }
        activityWebviewCustomBinding.webView.setWebViewClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityWebviewCustomBinding));
    }

    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
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
            Object obj = null;
            if (!externalStoragePublicDirectory.exists()) {
                int i2 = MediaBrowserCompat + 111;
                write = i2 % 128;
                if (i2 % 2 == 0) {
                    externalStoragePublicDirectory.mkdirs();
                    obj.hashCode();
                    throw null;
                }
                externalStoragePublicDirectory.mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
                int i3 = MediaBrowserCompat + 9;
                write = i3 % 128;
                int i4 = i3 % 2;
            }
            String strSubstring = p0.substring(StringsKt.indexOf$default((CharSequence) p0, ",", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            byte[] bArrDecode = android.util.Base64.decode(strSubstring, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArrDecode);
            fileOutputStream.close();
            MediaScannerConnection.scanFile(this, new String[]{file.toString()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: CameraQuirks
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str2, Uri uri) throws IllegalAccessException {
                    WebviewCustomActivity.g();
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
                int i5 = MediaBrowserCompat + 97;
                write = i5 % 128;
                int i6 = i5 % 2;
                activity = PendingIntent.getActivity(this, 0, intent, 201326592);
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

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends WebChromeClient {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
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
            if (ContextCompat.checkSelfPermission(WebviewCustomActivity.this, "android.permission.CAMERA") == 0) {
                permissionRequest.grant(permissionRequest.getResources());
            } else {
                WebviewCustomActivity webviewCustomActivity = WebviewCustomActivity.this;
                ActivityCompat.requestPermissions(webviewCustomActivity, new String[]{"android.permission.CAMERA"}, WebviewCustomActivity.d(webviewCustomActivity));
            }
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) throws IllegalAccessException, IOException {
            Intent intent = null;
            if (WebviewCustomActivity.g(WebviewCustomActivity.this) != null) {
                ValueCallback valueCallbackG = WebviewCustomActivity.g(WebviewCustomActivity.this);
                Intrinsics.checkNotNull(valueCallbackG);
                valueCallbackG.onReceiveValue(null);
            }
            WebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebviewCustomActivity.this, valueCallback);
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent2.resolveActivity(WebviewCustomActivity.this.getPackageManager()) != null) {
                WebviewCustomActivity.b(WebviewCustomActivity.this, (File) null);
                try {
                    WebviewCustomActivity.b(WebviewCustomActivity.this, WebviewCustomActivity.INotificationSideChannel());
                    Intrinsics.checkNotNull(intent2.putExtra("PhotoPath", WebviewCustomActivity.asBinder(WebviewCustomActivity.this)));
                } catch (IOException e2) {
                    getContentPaddingRight.b bVarB = getContentPaddingRight.b("error message");
                    Intrinsics.checkExpressionValueIsNotNull(bVarB, "");
                    bVarB.b(String.valueOf(e2.getMessage()), new Object[0]);
                }
                if (WebviewCustomActivity.asInterface(WebviewCustomActivity.this) != null) {
                    WebviewCustomActivity webviewCustomActivity = WebviewCustomActivity.this;
                    File fileAsInterface = WebviewCustomActivity.asInterface(webviewCustomActivity);
                    Intrinsics.checkNotNull(fileAsInterface);
                    WebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(webviewCustomActivity, "file:".concat(String.valueOf(fileAsInterface.getAbsolutePath())));
                    Intrinsics.checkNotNull(intent2.putExtra("output", Uri.fromFile(WebviewCustomActivity.asInterface(WebviewCustomActivity.this))));
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
            intent4.putExtra("android.intent.extra.TITLE", WebviewCustomActivity.this.getString(R.string.image_chooser));
            intent4.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
            WebviewCustomActivity webviewCustomActivity2 = WebviewCustomActivity.this;
            webviewCustomActivity2.startActivityForResult(intent4, WebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(webviewCustomActivity2));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            super.onProgressChanged(webView, i);
            WebviewCustomActivity.TuitionPaymentFragmentbindingInflater1(WebviewCustomActivity.this).progressBar.setProgress(i);
            if (i < 100 && WebviewCustomActivity.TuitionPaymentFragmentbindingInflater1(WebviewCustomActivity.this).progressBar.getVisibility() == 8) {
                WebviewCustomActivity.TuitionPaymentFragmentbindingInflater1(WebviewCustomActivity.this).progressBar.setVisibility(0);
            }
            if (i == 100) {
                WebviewCustomActivity.TuitionPaymentFragmentbindingInflater1(WebviewCustomActivity.this).progressBar.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db A[PHI: r13
  0x00db: PHI (r13v11 java.util.HashMap<java.lang.String, android.net.Uri>) = 
  (r13v10 java.util.HashMap<java.lang.String, android.net.Uri>)
  (r13v12 java.util.HashMap<java.lang.String, android.net.Uri>)
 binds: [B:41:0x00d9, B:38:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        String str;
        String strGuessFileName;
        Uri uriForFile;
        int i;
        HashMap<String, Uri> map;
        int i2 = 2 % 2;
        if (p0 != this.b || this.asInterface == null) {
            super.onActivityResult(p0, p1, p2);
            return;
        }
        Uri[] uriArr = new Uri[0];
        if (p1 == -1) {
            if (p2 != null) {
                int i3 = write + 81;
                MediaBrowserCompat = i3 % 128;
                int i4 = i3 % 2;
                if (p2.getData() != null) {
                    String dataString = p2.getDataString();
                    if (dataString != null) {
                        Uri uri = Uri.parse(dataString);
                        uriArr = new Uri[]{uri};
                        if (StringsKt.equals$default(uri.getScheme(), FirebaseAnalytics.Param.CONTENT, false, 2, null)) {
                            Cursor cursorQuery = getContentResolver().query(uriArr[0], null, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    if (cursorQuery.moveToFirst()) {
                                        try {
                                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            HashMap<String, Uri> map2 = OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
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
                                int i5 = write + 21;
                                MediaBrowserCompat = i5 % 128;
                                int i6 = i5 % 2;
                                cursorQuery.close();
                            }
                        }
                    }
                } else {
                    str = this.asBinder;
                    if (str != null && this.g != null) {
                        strGuessFileName = URLUtil.guessFileName(String.valueOf(str), null, null);
                        uriArr = new Uri[]{Uri.parse(this.asBinder)};
                        String packageName = getApplicationContext().getPackageName();
                        StringBuilder sb = new StringBuilder();
                        sb.append(packageName);
                        sb.append(".provider");
                        String string2 = sb.toString();
                        File file = this.g;
                        Intrinsics.checkNotNull(file);
                        uriForFile = FileProvider.getUriForFile(this, string2, file);
                        this.d = uriForFile;
                        if (uriForFile != null) {
                            i = write + 109;
                            MediaBrowserCompat = i % 128;
                            if (i % 2 != 0) {
                                map = OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i7 = 68 / 0;
                                if (map != null) {
                                    map.put(strGuessFileName, this.d);
                                }
                            } else {
                                map = OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                if (map != null) {
                                    map.put(strGuessFileName, this.d);
                                }
                            }
                        }
                    }
                }
            } else {
                str = this.asBinder;
                if (str != null) {
                    strGuessFileName = URLUtil.guessFileName(String.valueOf(str), null, null);
                    uriArr = new Uri[]{Uri.parse(this.asBinder)};
                    String packageName2 = getApplicationContext().getPackageName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(packageName2);
                    sb2.append(".provider");
                    String string3 = sb2.toString();
                    File file2 = this.g;
                    Intrinsics.checkNotNull(file2);
                    uriForFile = FileProvider.getUriForFile(this, string3, file2);
                    this.d = uriForFile;
                    if (uriForFile != null) {
                        i = write + 109;
                        MediaBrowserCompat = i % 128;
                        if (i % 2 != 0) {
                            map = OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i8 = 68 / 0;
                            if (map != null) {
                                map.put(strGuessFileName, this.d);
                            }
                        } else {
                            map = OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (map != null) {
                                map.put(strGuessFileName, this.d);
                            }
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

    private static /* synthetic */ Object g(Object[] objArr) {
        WebviewCustomActivity webviewCustomActivity = (WebviewCustomActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (StringsKt.startsWith$default(str, "tel:", false, 2, (Object) null)) {
            webviewCustomActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            return true;
        }
        if (StringsKt.startsWith$default(str, MailTo.MAILTO_SCHEME, false, 2, (Object) null)) {
            webviewCustomActivity.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)));
            return true;
        }
        if (StringsKt.startsWith$default(str, "https://api.whatsapp.com/", false, 2, (Object) null)) {
            webviewCustomActivity.TuitionPaymentFragmentbindingInflater1(str);
            int i2 = MediaBrowserCompat + 73;
            write = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (StringsKt.startsWith$default(str, "https://play.google.com/", false, 2, (Object) null)) {
            int i4 = write + 119;
            MediaBrowserCompat = i4 % 128;
            if (i4 % 2 != 0) {
                webviewCustomActivity.TuitionPaymentFragmentbindingInflater1(str);
            } else {
                webviewCustomActivity.TuitionPaymentFragmentbindingInflater1(str);
            }
            int i5 = MediaBrowserCompat + 17;
            write = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        if (StringsKt.startsWith$default(str, "whatsapp://", false, 2, (Object) null)) {
            int i6 = write + 15;
            MediaBrowserCompat = i6 % 128;
            if (i6 % 2 != 0) {
                webviewCustomActivity.TuitionPaymentFragmentbindingInflater1(str);
                return false;
            }
            webviewCustomActivity.TuitionPaymentFragmentbindingInflater1(str);
            return true;
        }
        if (!(!StringsKt.startsWith$default(str, "https://app.tanamduit.com/invite/bpjs", false, 2, (Object) null))) {
            webviewCustomActivity.TuitionPaymentFragmentbindingInflater1(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "tokopedia://", false, 2, (Object) null)) {
            int i7 = write + 29;
            MediaBrowserCompat = i7 % 128;
            int i8 = i7 % 2;
            webviewCustomActivity.TuitionPaymentFragmentbindingInflater1(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "market://", false, 2, (Object) null)) {
            int i9 = write + 27;
            MediaBrowserCompat = i9 % 128;
            int i10 = i9 % 2;
            webviewCustomActivity.TuitionPaymentFragmentbindingInflater1(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "intent://", false, 2, (Object) null)) {
            try {
                Intent uri = Intent.parseUri(str, 1);
                if (uri.getStringExtra("S.browser_fallback_url") == null) {
                    webviewCustomActivity.startActivity(uri);
                }
                return true;
            } catch (URISyntaxException e2) {
                e2.printStackTrace();
            }
        }
        int i11 = write + 3;
        MediaBrowserCompat = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    private final boolean TuitionPaymentFragmentbindingInflater1(String p0) {
        int i = 2 % 2;
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p0)));
            int i2 = write + 25;
            MediaBrowserCompat = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Aplikasi tidak tersedia", 0).show();
            return false;
        }
    }

    public final void cancelAll() {
        int i = 2 % 2;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Anda yakin ingin keluar dari menu ini?").setCancelable(false).setPositiveButton("Ya", new pickSuitableFpsRange(this)).setNegativeButton("Tidak", new DialogInterface.OnClickListener() { // from class: getCorrectedAspectRatio
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dialogInterface);
            }
        });
        builder.create().show();
        int i2 = MediaBrowserCompat + 81;
        write = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        super.onRequestPermissionsResult(p0, p1, p2);
        if (p0 == this.cancel) {
            int i2 = MediaBrowserCompat + 37;
            int i3 = i2 % 128;
            write = i3;
            int i4 = i2 % 2;
            if (p2.length == 0) {
                int i5 = i3 + 91;
                MediaBrowserCompat = i5 % 128;
                int i6 = i5 % 2;
            } else {
                for (int i7 : p2) {
                    if (i7 == -1) {
                        this.a = false;
                        Toast.makeText((Context) null, "Permission Denied. This app will not work with right permission.", 1).show();
                        int i8 = MediaBrowserCompat + 11;
                        write = i8 % 128;
                        if (i8 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                }
                this.a = true;
            }
        }
        int i9 = write + 63;
        MediaBrowserCompat = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/bpjstku/presentation/util/WebviewCustomActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "<init>", "(Lcom/bpjstku/presentation/util/WebviewCustomActivity;Landroid/content/Context;ZLjava/lang/String;)V", "", "requestUserAccessToken", "(Ljava/lang/String;)V", "TuitionPaymentFragmentbindingInflater1", "Landroid/content/Context;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Z", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private final Context TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ WebviewCustomActivity TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final boolean b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebviewCustomActivity webviewCustomActivity, Context context, boolean z, String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = webviewCustomActivity;
            this.TuitionPaymentFragmentbindingInflater1 = context;
            this.b = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        @JavascriptInterface
        public final void requestUserAccessToken(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            boolean z = this.b;
            String str = z ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : "";
            StringBuilder sb = new StringBuilder("\n                window.wvgeraiTokenCallback({\n                    success: ");
            sb.append(z);
            sb.append(",\n                    accessToken: '");
            sb.append(str);
            sb.append("'\n                });\n            ");
            final String strTrimIndent = StringsKt.trimIndent(sb.toString());
            Context context = this.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNull(context, "");
            WebviewCustomActivity.TuitionPaymentFragmentbindingInflater1((WebviewCustomActivity) context).webView.post(new Runnable() { // from class: CamcorderProfileResolutionQuirk
                @Override // java.lang.Runnable
                public final void run() {
                    WebviewCustomActivity.TuitionPaymentFragmentbindingInflater1((WebviewCustomActivity) this.b.TuitionPaymentFragmentbindingInflater1).webView.evaluateJavascript(strTrimIndent, null);
                }
            });
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int p0, KeyEvent p1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 77;
        int i3 = i2 % 128;
        write = i3;
        if (i2 % 2 != 0 ? p0 == 4 : p0 == 5) {
            int i4 = i3 + 97;
            MediaBrowserCompat = i4 % 128;
            if (i4 % 2 != 0) {
                ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.canGoBack();
                throw null;
            }
            if (((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.canGoBack()) {
                ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.goBack();
                int i5 = MediaBrowserCompat + 109;
                write = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 10 / 0;
                }
                return true;
            }
        }
        return super.onKeyDown(p0, p1);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 45;
        write = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = MediaBrowserCompat + 101;
                write = i4 % 128;
                int i5 = i4 % 2;
                onBackPressed();
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = write + 81;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
        ((acquireBuffer) this.INotificationSideChannel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.clearCache(true);
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
        WebStorage.getInstance().deleteAllData();
        int i4 = write + 15;
        MediaBrowserCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/util/WebviewCustomActivity$TuitionPaymentFragmentbindingInflater1;", "", "Landroid/content/Context;", "p0", "<init>", "(Lcom/bpjstku/presentation/util/WebviewCustomActivity;Landroid/content/Context;)V", "", "", "toastText", "(Ljava/lang/String;)V", "BackActivity", "exitApp", "b", "Landroid/content/Context;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class TuitionPaymentFragmentbindingInflater1 {
        private /* synthetic */ WebviewCustomActivity TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Context TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentbindingInflater1(WebviewCustomActivity webviewCustomActivity, Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = webviewCustomActivity;
            this.TuitionPaymentFragmentbindingInflater1 = context;
        }

        @JavascriptInterface
        public final void toastText(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Toast.makeText(this.TuitionPaymentFragmentbindingInflater1, p0, 0).show();
        }

        @JavascriptInterface
        public final void BackActivity(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d_();
        }

        @JavascriptInterface
        public final void exitApp(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancelAll();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 91;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int i5 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
            byte[] bArr = $$a;
            short s = bArr[7];
            Object[] objArr3 = new Object[1];
            c(s, (byte) (s | 52), bArr[132], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, iIndexOf, i5, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1065).substring(0, 62).length() + 65, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iResolveSize = 1031 - View.resolveSize(0, 0);
            int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
            short s2 = (short) 52;
            Object[] objArr6 = new Object[1];
            c(s2, (byte) s2, $$a[132], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, iResolveSize, maxKeyCode, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char gidForName = (char) (Process.getGidForName("") + 1);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                byte b = $$a[7];
                Object[] objArr7 = new Object[1];
                c((short) 104, b, b, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, minimumFlingVelocity, scrollBarFadeDuration, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr8[3])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1367899334;
            int i8 = ~length;
            int i9 = ((((-715180142) + (((~((-1048238694) | i8)) | (-803958524)) * (-602))) + ((((~(length | (-1048238694))) | 269520900) | (~((-25240731) | i8))) * (-301))) + ((~(i8 | (-803958524))) * 301)) - 1237240066;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_atm_bni).substring(0, 7).length() + 120, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_sub_title_text).substring(0, 1).codePointAt(0) + 47, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {-163456059};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46037), 1133 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), ExpandableListView.getPackedPositionChild(0L) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -1237240066, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRed = (char) Color.red(0);
                    int gidForName2 = Process.getGidForName("") + 1032;
                    int i12 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte[] bArr2 = $$a;
                    short s3 = bArr2[7];
                    Object[] objArr13 = new Object[1];
                    c(s3, (byte) (s3 | 52), bArr2[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, gidForName2, i12, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.getOffsetBefore("", 0)), 1118 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                    int scrollDefaultDelay = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b2 = $$a[7];
                    Object[] objArr14 = new Object[1];
                    c((short) 104, b2, b2, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iNormalizeMetaState, scrollDefaultDelay, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(null, null, 127 - (KeyEvent.getMaxKeyCode() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int iIndexOf2 = TextUtils.indexOf("", "") + 1031;
                        int iIndexOf3 = 15 - TextUtils.indexOf("", "");
                        short s4 = (short) 52;
                        Object[] objArr17 = new Object[1];
                        c(s4, (byte) s4, $$a[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, iIndexOf2, iIndexOf3, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 1031;
                        int iIndexOf4 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte[] bArr3 = $$a;
                        short s5 = bArr3[7];
                        Object[] objArr18 = new Object[1];
                        c(s5, (byte) (s5 | 52), bArr3[132], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iNormalizeMetaState2, iIndexOf4, 1357589585, false, (String) objArr18[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i13 = MediaBrowserCompat;
                int i14 = i13 + 31;
                write = i14 % 128;
                int i15 = i14 % 2;
                int i16 = i13 + 109;
                write = i16 % 128;
                int i17 = i16 % 2;
                while (i4 < strArr2.length) {
                    int i18 = MediaBrowserCompat + 85;
                    write = i18 % 128;
                    if (i18 % 2 == 0) {
                        arrayList.add(strArr2[i4]);
                        i4 += 19;
                    } else {
                        arrayList.add(strArr2[i4]);
                        i4++;
                    }
                }
            }
            throw null;
        }
        int i19 = write + 81;
        MediaBrowserCompat = i19 % 128;
        int i20 = i19 % 2;
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[3])[0];
        int i23 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i24 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i25 = ~(1073348543 | i24);
        int i26 = i21 + 172500549 + ((243864577 | i25) * (-476)) + (i25 * 952) + ((~((~i24) | 1073348543)) * 476);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr19[2])[0] = i28 ^ (i28 << 5);
        int i29 = write + 31;
        MediaBrowserCompat = i29 % 128;
        int i30 = i29 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
            int threadPriority = 1755 - ((Process.getThreadPriority(0) + 20) >> 6);
            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
            Object[] objArr20 = new Object[1];
            c((short) 104, (byte) 37, $$a[132], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(deadChar, threadPriority, threadPriority2, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 29944);
                int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                int i31 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
                short s6 = (short) 52;
                Object[] objArr21 = new Object[1];
                c(s6, (byte) s6, $$a[132], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(absoluteGravity, modifierMetaStateMask, i31, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i32 = ((int[]) objArr22[0])[0];
            objArr2 = new Object[]{new int[]{i32}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i33 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i34 = ~i33;
            int i35 = (((~((-178303362) | i34)) | (~(195559391 | i33))) * 988) + 423043461 + (((~(i33 | (-195346396))) | 17043034 | (~(i34 | 195559391))) * 988) + 1844119347;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[3])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 29, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-163456059};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42048 - TextUtils.lastIndexOf("", '0', 0, 0)), 1727 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1844119347);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char trimmedLength = (char) (29944 - TextUtils.getTrimmedLength(""));
                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 1755;
                int i38 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                short s7 = (short) 52;
                Object[] objArr26 = new Object[1];
                c(s7, (byte) s7, $$a[132], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(trimmedLength, absoluteGravity2, i38, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_message_userid_invalid).substring(13, 15).length() + 125, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_atm).substring(4, 5).codePointAt(0) + 12, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int i39 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                    Object[] objArr29 = new Object[1];
                    c((short) 141, (byte) 52, $$a[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatTimeout, i39, iMakeMeasureSpec, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
                    int iAxisFromString = MotionEvent.axisFromString("") + 24;
                    Object[] objArr30 = new Object[1];
                    c((short) 104, (byte) 37, $$a[132], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(mirror, offsetBefore, iAxisFromString, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i40 = MediaBrowserCompat + 29;
                write = i40 % 128;
                int i41 = i40 % 2;
                objArr2 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[4];
            if (strArr4 != null) {
                while (i4 < strArr4.length) {
                    arrayList2.add(strArr4[i4]);
                    i4++;
                }
            }
            throw null;
        }
        int i42 = ((int[]) objArr2[3])[0];
        int i43 = ((int[]) objArr2[0])[0];
        Object[] objArr31 = {new int[]{i43}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int iNextInt = new Random().nextInt();
        int i44 = ~iNextInt;
        int i45 = i42 + 978750013 + (((~(iNextInt | 195409700)) | (~((-17045253) | i44)) | (-195557174)) * (-68)) + ((~((-147474) | i44)) * (-68)) + (((~((-195409701) | i44)) | (-17192726)) * 68);
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr31[3])[0] = i47 ^ (i47 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d4, code lost:
    
        if (r1 != ((((-1091459136) + (((~((-2136535503) | r3)) | 442520462) * 226)) + (((~(r3 | (-1696112705))) | ((~((-442520463) | r2)) | 2097664)) * (-113))) + ((~(r2 | (-2136535503))) * 113))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d6, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.util.WebviewCustomActivity.MediaBrowserCompat + 123;
        com.bpjstku.presentation.util.WebviewCustomActivity.write = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e2, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ee, code lost:
    
        throw new java.lang.RuntimeException("1101023946");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        if (r1 == (((-1431548093) + ((((~(r5 | (-1298475601))) | 1140924416) | (~((-310936874) | r2))) * 717)) + (((~(r2 | (-1298475601))) | ((~(r5 | (-310936874))) | 1140924416)) * 717))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009c, code lost:
    
        if (r1 == ((r7 + (r2 * (-245))) + ((r2 | 47897362) * 245))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009e, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r11);
        r3 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewCustomActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 99;
        write = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful).substring(0, 1).length() + 1224549600;
        if (i4 != 2007683688 + ((1404607871 | length) * 376) + (((~((~length) | 421945812)) | 1117297707) * (-376)) + (((~(length | (-421945813))) | (-1251933356)) * 376)) {
            int i5 = 1731381328 % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1973703531;
        if (i6 != ((~((~i7) | 1877982695)) * 130) + 1354077356 + (((~(i7 | 1877982695)) | 136380480) * 130)) {
            throw null;
        }
        super.onCreate(bundle);
        int i8 = write + 57;
        MediaBrowserCompat = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r8, "data:", false, 2, (java.lang.Object) null) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r6 = defpackage.VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(new defpackage.AspectRatioLegacyApi21Quirk(r8, r9, r10, r7));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        r9 = defpackage.isSamsungJ2.b();
        defpackage.share.b(r9, "scheduler is null");
        r1 = new io.reactivex.internal.operators.completable.CompletableSubscribeOn(r6, r9);
        r6 = defpackage.dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
        defpackage.share.b(r6, "scheduler is null");
        r9 = new io.reactivex.internal.operators.completable.CompletableObserveOn(r1, r6);
        r6 = new defpackage.getRange(r7);
        r10 = new defpackage.AfRegionFlipHorizontallyQuirk(r7);
        r6 = r9.b(r6, new defpackage.AutoFlashUnderExposedQuirk(r10));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        ((defpackage.acquireBuffer) r7.INotificationSideChannel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6);
        r6 = com.bpjstku.presentation.util.WebviewCustomActivity.MediaBrowserCompat + 107;
        com.bpjstku.presentation.util.WebviewCustomActivity.write = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
    
        if ((r6 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r8, "blob:", true, 5, (java.lang.Object) null) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r8, "blob:", false, 2, (java.lang.Object) null) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r6.webView.loadUrl(defpackage.OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentbindingInflater1(r8, r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void b(com.bpjstku.databinding.ActivityWebviewCustomBinding r6, final com.bpjstku.presentation.util.WebviewCustomActivity r7, final java.lang.String r8, final java.lang.String r9, final java.lang.String r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.util.WebviewCustomActivity.write
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.bpjstku.presentation.util.WebviewCustomActivity.MediaBrowserCompat = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "blob:"
            r4 = 0
            if (r1 == 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            r1 = 1
            r5 = 5
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r3, r1, r5, r4)
            if (r1 == 0) goto L31
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r3, r2, r0, r4)
            if (r1 == 0) goto L31
        L27:
            android.webkit.WebView r6 = r6.webView
            java.lang.String r7 = defpackage.OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentbindingInflater1(r8, r10)
            r6.loadUrl(r7)
            return
        L31:
            java.lang.String r6 = "data:"
            boolean r6 = kotlin.text.StringsKt.startsWith$default(r8, r6, r2, r0, r4)
            if (r6 == 0) goto L3d
            r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8)
            return
        L3d:
            AspectRatioLegacyApi21Quirk r6 = new AspectRatioLegacyApi21Quirk
            r6.<init>()
            VideoEncoderSession1 r6 = defpackage.VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(r6)
            java.lang.String r8 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            appendBackupVideoProfile r9 = defpackage.isSamsungJ2.b()
            java.lang.String r10 = "scheduler is null"
            defpackage.share.b(r9, r10)
            io.reactivex.internal.operators.completable.CompletableSubscribeOn r1 = new io.reactivex.internal.operators.completable.CompletableSubscribeOn
            r1.<init>(r6, r9)
            appendBackupVideoProfile r6 = defpackage.dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1()
            defpackage.share.b(r6, r10)
            io.reactivex.internal.operators.completable.CompletableObserveOn r9 = new io.reactivex.internal.operators.completable.CompletableObserveOn
            r9.<init>(r1, r6)
            getRange r6 = new getRange
            r6.<init>()
            AfRegionFlipHorizontallyQuirk r10 = new AfRegionFlipHorizontallyQuirk
            r10.<init>()
            AutoFlashUnderExposedQuirk r1 = new AutoFlashUnderExposedQuirk
            r1.<init>()
            BufferProviderState r6 = r9.b(r6, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            kotlin.Lazy r7 = r7.INotificationSideChannel
            java.lang.Object r7 = r7.getValue()
            acquireBuffer r7 = (defpackage.acquireBuffer) r7
            r7.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6)
            int r6 = com.bpjstku.presentation.util.WebviewCustomActivity.MediaBrowserCompat
            int r6 = r6 + 107
            int r7 = r6 % 128
            com.bpjstku.presentation.util.WebviewCustomActivity.write = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L92
            return
        L92:
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewCustomActivity.b(com.bpjstku.databinding.ActivityWebviewCustomBinding, com.bpjstku.presentation.util.WebviewCustomActivity, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 99;
        write = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        function1.invoke(obj);
        int i3 = write + 65;
        MediaBrowserCompat = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebviewCustomActivity webviewCustomActivity, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 73;
        write = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ((ActivityWebviewCustomBinding) ((ViewBinding) webviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(0);
        ((ActivityWebviewCustomBinding) ((ViewBinding) webviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerError.setVisibility(8);
        webviewCustomActivity.INotificationSideChannelDefault();
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompat + 33;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void b(WebviewCustomActivity webviewCustomActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 69;
        write = i2 % 128;
        int i3 = i2 % 2;
        Toast.makeText(webviewCustomActivity, "Download completed", 0).show();
        int i4 = MediaBrowserCompat + 67;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        WebviewCustomActivity webviewCustomActivity = (WebviewCustomActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = write + 63;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            webviewCustomActivity.cancelAll();
            ViewPortBuilder.b();
            int i4 = MediaBrowserCompat + 29;
            write = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 5;
        write = i2 % 128;
        int i3 = i2 % 2;
        dialogInterface.dismiss();
        int i4 = write + 51;
        MediaBrowserCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebviewCustomActivity webviewCustomActivity, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 91;
        write = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        webviewCustomActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompat + 73;
        write = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit b(WebviewCustomActivity webviewCustomActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 45;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!bool.booleanValue()) {
            WebviewCustomActivity webviewCustomActivity2 = webviewCustomActivity;
            String string = webviewCustomActivity.getString(R.string.message_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(webviewCustomActivity2, string);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = MediaBrowserCompat + 47;
        write = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebviewCustomActivity webviewCustomActivity, Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = write + 87;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Toast.makeText(webviewCustomActivity, "Error downloading file: ".concat(String.valueOf(th.getMessage())), 0).show();
            th.printStackTrace();
            unit = Unit.INSTANCE;
        } else {
            Toast.makeText(webviewCustomActivity, "Error downloading file: ".concat(String.valueOf(th.getMessage())), 0).show();
            th.printStackTrace();
            unit = Unit.INSTANCE;
        }
        int i3 = MediaBrowserCompat + 69;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2, String str3, WebviewCustomActivity webviewCustomActivity, VideoEncoderSessionVideoEncoderState videoEncoderSessionVideoEncoderState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(videoEncoderSessionVideoEncoderState, "");
        String strGuessFileName = URLUtil.guessFileName(str, str2, str3);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(strGuessFileName);
        request.setDescription("Downloading file...");
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
        Object systemService = webviewCustomActivity.getSystemService("download");
        Intrinsics.checkNotNull(systemService, "");
        try {
            ((DownloadManager) systemService).enqueue(request);
            videoEncoderSessionVideoEncoderState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i2 = MediaBrowserCompat + 55;
            write = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e2) {
            videoEncoderSessionVideoEncoderState.TuitionPaymentFragmentbindingInflater1(e2);
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = write + 65;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            return null;
        }
        function1.invoke(obj);
        throw null;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebviewCustomActivity webviewCustomActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(webviewCustomActivity);
        int i2 = write + 105;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return outputformattoaudioprofile;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebviewCustomActivity webviewCustomActivity) {
        int i = 2 % 2;
        int i2 = write + 17;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            webviewCustomActivity.d_();
        } else {
            webviewCustomActivity.d_();
            throw null;
        }
    }

    public static final /* synthetic */ File INotificationSideChannel() {
        int i = 2 % 2;
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "JMO Web");
        if (!file.exists()) {
            int i2 = MediaBrowserCompat + 125;
            write = i2 % 128;
            if (i2 % 2 == 0) {
                file.mkdirs();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            file.mkdirs();
        }
        String str = File.separator;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        sb.append(str);
        sb.append("IMG_");
        sb.append(jCurrentTimeMillis);
        sb.append(".jpg");
        File file2 = new File(sb.toString());
        int i3 = MediaBrowserCompat + 31;
        write = i3 % 128;
        int i4 = i3 % 2;
        return file2;
    }

    public static /* synthetic */ void g() throws IllegalAccessException {
        int iB = ModuleInstallRequest.b();
        b(ModuleInstallRequest.b(), 502927415, iB, ModuleInstallRequest.b(), new Object[0], ModuleInstallRequest.b(), -502927415);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) throws IllegalAccessException {
        int iB = ModuleInstallRequest.b();
        b(ModuleInstallRequest.b(), -1805287224, iB, ModuleInstallRequest.b(), new Object[]{function1, obj}, ModuleInstallRequest.b(), 1805287228);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(WebviewCustomActivity webviewCustomActivity, View view) throws IllegalAccessException {
        int iB = ModuleInstallRequest.b();
        b(ModuleInstallRequest.b(), 694114064, iB, ModuleInstallRequest.b(), new Object[]{webviewCustomActivity, view}, ModuleInstallRequest.b(), -694114057);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) throws IllegalAccessException {
        int iB = ModuleInstallRequest.b();
        b(ModuleInstallRequest.b(), -1475818307, iB, ModuleInstallRequest.b(), new Object[]{function1, obj}, ModuleInstallRequest.b(), 1475818308);
    }

    static {
        IconCompatParcelizer = 1;
        onTransact();
        INSTANCE = new Companion(null);
        int i = connect + 93;
        IconCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ String asBinder(WebviewCustomActivity webviewCustomActivity) {
        int iB = ModuleInstallRequest.b();
        return (String) b(ModuleInstallRequest.b(), -1397216380, iB, ModuleInstallRequest.b(), new Object[]{webviewCustomActivity}, ModuleInstallRequest.b(), 1397216389);
    }

    public static final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(WebviewCustomActivity webviewCustomActivity, String str) {
        int iB = ModuleInstallRequest.b();
        return ((Boolean) b(ModuleInstallRequest.b(), -142289569, iB, ModuleInstallRequest.b(), new Object[]{webviewCustomActivity, str}, ModuleInstallRequest.b(), 142289575)).booleanValue();
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebviewCustomActivity webviewCustomActivity, String str) throws IllegalAccessException {
        int iB = ModuleInstallRequest.b();
        b(ModuleInstallRequest.b(), -263626138, iB, ModuleInstallRequest.b(), new Object[]{webviewCustomActivity, str}, ModuleInstallRequest.b(), 263626143);
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        int iB = ModuleInstallRequest.b();
        return ((Boolean) b(ModuleInstallRequest.b(), 945798586, iB, unbindImageCaptureAndRecreate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this, p0}, ModuleInstallRequest.b(), -945798578)).booleanValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = write + 85;
        int i3 = i2 % 128;
        MediaBrowserCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return R.layout.activity_webview_custom;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 11;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iB = ModuleInstallRequest.b();
        b(ModuleInstallRequest.b(), -1197258460, iB, unbindImageCaptureAndRecreate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, unbindImageCaptureAndRecreate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1197258462);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws IllegalAccessException {
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bca_prima).substring(0, 9).length() - 1220926564, -450948047, ModuleInstallRequest.b(), ModuleInstallRequest.b(), new Object[]{this}, ModuleInstallRequest.b(), 450948050);
    }

    static void onTransact() {
        INotificationSideChannelStub = new char[]{47380, 47367, 47377, 47363, 47366, 47372, 47303, 47362, 47330, 47420, 47361, 47376, 47368, 47346, 47369, 47378, 47370, 47365, 47331, 47371, 47423, 47374, 47341, 47373};
        getInterfaceDescriptor = 2047719605;
        INotificationSideChannelDefault = true;
        read = true;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 115;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        WebviewCustomActivity webviewCustomActivity = (WebviewCustomActivity) objArr[0];
        int i = 2 % 2;
        int i2 = write + 91;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompat + 37;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
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
    private static java.lang.String $$i(short r6, short r7, int r8) {
        /*
            int r7 = r7 + 67
            byte[] r0 = com.bpjstku.presentation.util.WebviewCustomActivity.$$c
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewCustomActivity.$$i(short, short, int):java.lang.String");
    }
}
