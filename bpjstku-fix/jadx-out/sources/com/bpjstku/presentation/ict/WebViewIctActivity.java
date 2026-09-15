package com.bpjstku.presentation.ict;

import android.app.DownloadManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.net.MailTo;
import androidx.core.view.PointerIconCompat;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.databinding.ActivityWebViewIctBinding;
import com.bpjstku.presentation.ict.WebViewIctActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityMenu;
import com.bpjstku.util.viewbinding.BindingAppCompatActivity;
import com.google.firebase.abt.R;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.OutputConfigurationCompatApi28Impl;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.acquireBuffer;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getSessionStateCallback;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.setGroupCheckable;
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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR$\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\n8\u0002X\u0083D¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010'R2\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170)j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010+\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0015\u0010.\u001a\u00020-8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b.\u0010/R\u0015\u0010&\u001a\u0002008CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010/R \u00104\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0002018UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u00103"}, d2 = {"Lcom/bpjstku/presentation/ict/WebViewIctActivity;", "Lcom/bpjstku/util/viewbinding/BindingAppCompatActivity;", "Lcom/bpjstku/databinding/ActivityWebViewIctBinding;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/KeyEvent;", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Z", "b", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "cancel", "Landroid/webkit/ValueCallback;", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "Ljava/lang/String;", "asInterface", "Ljava/util/HashMap;", "Lkotlin/collections/TuitionPaymentFragmentbindingInflater1;", "asBinder", "Ljava/util/HashMap;", "LoutputFormatToAudioProfile;", "d", "Lkotlin/Lazy;", "LacquireBuffer;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "cancelAll"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebViewIctActivity extends BindingAppCompatActivity<ActivityWebViewIctBinding> {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$g;
    private static final int $$h;
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancelAll;
    private static int getInterfaceDescriptor;
    private static long notify;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private ValueCallback<Uri[]> b;
    private static final byte[] $$c = {56, 94, 119, -19};
    private static final int $$f = 1;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 100;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 11;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String asInterface = "";

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private HashMap<String, String> g = new HashMap<>();

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String asBinder = "";
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: removeMenuPresenter
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i2)) | i3;
        int i9 = (~(i7 | (~i2))) | (~((~i3) | i7)) | (~(i3 | i4 | i2));
        int i10 = ~(i2 | i3);
        int i11 = i3 + i4 + i + ((-813770285) * i6) + (135932771 * i5);
        int i12 = i11 * i11;
        int i13 = (526900465 * i3) + 74317824 + ((-1745228167) * i4) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i) + (1331953664 * i6) + ((-366739456) * i5) + ((-1308753920) * i12);
        int i14 = (i3 * 1149714451) + 247108311 + (i4 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i * 1149713731) + (i6 * 1918847289) + (i5 * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        if (i15 == 1) {
            return b(objArr);
        }
        if (i15 != 2) {
            return i15 != 3 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 84
            byte[] r0 = com.bpjstku.presentation.ict.WebViewIctActivity.$$a
            int r1 = 53 - r8
            int r6 = 213 - r6
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.ict.WebViewIctActivity.e(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = 105 - r9
            byte[] r0 = com.bpjstku.presentation.ict.WebViewIctActivity.$$g
            int r8 = r8 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r7
            goto L29
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.ict.WebViewIctActivity.f(int, short, int, java.lang.Object[]):void");
    }

    public WebViewIctActivity() {
        final WebViewIctActivity webViewIctActivity = this;
        this.a = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.ict.WebViewIctActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = webViewIctActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebViewIctActivity webViewIctActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 5;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = webViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        WebViewIctActivity webViewIctActivity = (WebViewIctActivity) objArr[0];
        ValueCallback<Uri[]> valueCallback = (ValueCallback) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 81;
        int i3 = i2 % 128;
        cancelAll = i3;
        int i4 = i2 % 2;
        webViewIctActivity.b = valueCallback;
        if (i4 == 0) {
            int i5 = 42 / 0;
        }
        int i6 = i3 + 77;
        INotificationSideChannel = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        WebViewIctActivity webViewIctActivity = (WebViewIctActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 55;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        ValueCallback<Uri[]> valueCallback = webViewIctActivity.b;
        int i5 = i3 + 121;
        cancelAll = i5 % 128;
        if (i5 % 2 != 0) {
            return valueCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ HashMap TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewIctActivity webViewIctActivity) {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 15;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        HashMap<String, String> map = webViewIctActivity.g;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 49;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewIctActivity webViewIctActivity, int i) {
        int i2 = 2 % 2;
        String str = (String) MapsKt.mapOf(TuplesKt.to(-4, "User authentication failed on server"), TuplesKt.to(-8, "The server is taking too much time to communicate. Try again later."), TuplesKt.to(-15, "Too many requests during this load"), TuplesKt.to(-1, "Generic error"), TuplesKt.to(-12, "Check entered URL.."), TuplesKt.to(-6, "Error timeout.."), TuplesKt.to(-11, "Failed to perform SSL handshake"), TuplesKt.to(-2, "Server or proxy hostname lookup failed"), TuplesKt.to(-5, "User authentication failed on proxy"), TuplesKt.to(-9, "Too many redirects"), TuplesKt.to(-3, "Unsupported authentication scheme (not basic or digest)"), TuplesKt.to(-10, "unsupported scheme"), TuplesKt.to(-13, "Generic file error"), TuplesKt.to(-14, "File not found"), TuplesKt.to(-7, "The server failed to communicate. Try again later.")).get(Integer.valueOf(i));
        if (str != null) {
            int i3 = INotificationSideChannel + 35;
            cancelAll = i3 % 128;
            if (i3 % 2 == 0) {
                ConstraintLayout constraintLayout = webViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2().rootWebView;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(constraintLayout, str);
                int i4 = 3 / 0;
            } else {
                ConstraintLayout constraintLayout2 = webViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2().rootWebView;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(constraintLayout2, str);
            }
        }
        int i5 = INotificationSideChannel + 125;
        cancelAll = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean b(WebViewIctActivity webViewIctActivity, String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 65;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            webViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = webViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        int i3 = INotificationSideChannel + 77;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(notify ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 57;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 105;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(notify)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char maximumDrawingCacheSize = (char) (64838 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int trimmedLength = 1356 - TextUtils.getTrimmedLength("");
                    int pressedStateDuration = 38 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b = (byte) ($$f - 1);
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, trimmedLength, pressedStateDuration, 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 468 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.ict.WebViewIctActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/ict/WebViewIctActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, String p1, String p2, String p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) WebViewIctActivity.class);
            intent.putExtra("KEY_URL", p1);
            intent.putExtra("API_TOKEN", p2);
            intent.putExtra("MENU_ICT", p3);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancelAll + 77;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        WebViewIctActivity$bindingInflater$1 webViewIctActivity$bindingInflater$1 = WebViewIctActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = INotificationSideChannel + 19;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return webViewIctActivity$bindingInflater$1;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends WebChromeClient {
        private /* synthetic */ ActivityWebViewIctBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityWebViewIctBinding activityWebViewIctBinding) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = activityWebViewIctBinding;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(valueCallback, "");
            Intrinsics.checkNotNullParameter(fileChooserParams, "");
            Object[] objArr = {WebViewIctActivity.this};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (((ValueCallback) WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 362523748, -362523745, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) != null) {
                Object[] objArr2 = {WebViewIctActivity.this};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                ValueCallback valueCallback2 = (ValueCallback) WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr2, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 362523748, -362523745, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                Intrinsics.checkNotNull(valueCallback2);
                valueCallback2.onReceiveValue(null);
                Object[] objArr3 = {WebViewIctActivity.this, null};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr3, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -482005522, 482005524, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
            Object[] objArr4 = {WebViewIctActivity.this, valueCallback};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr4, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, -482005522, 482005524, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            Intent intentCreateIntent = fileChooserParams.createIntent();
            intentCreateIntent.addCategory("android.intent.category.OPENABLE");
            intentCreateIntent.setType("*/*");
            try {
                WebViewIctActivity webViewIctActivity = WebViewIctActivity.this;
                Intrinsics.checkNotNull(intentCreateIntent);
                webViewIctActivity.startActivityForResult(intentCreateIntent, WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(WebViewIctActivity.this));
                return true;
            } catch (Exception unused) {
                Object[] objArr5 = {WebViewIctActivity.this, null};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr5, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault5, -482005522, 482005524, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                return false;
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(PermissionRequest permissionRequest) {
            Intrinsics.checkNotNullParameter(permissionRequest, "");
            permissionRequest.grant(permissionRequest.getResources());
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.progressBar.setProgress(i);
            if (i < 100 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.progressBar.getVisibility() == 8) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.progressBar.setVisibility(0);
            }
            if (i == 100) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.progressBar.setVisibility(8);
            }
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends WebViewClient {
        private /* synthetic */ ActivityWebViewIctBinding b;

        TuitionPaymentFragmentbindingInflater1(ActivityWebViewIctBinding activityWebViewIctBinding) {
            this.b = activityWebViewIctBinding;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (WebViewIctActivity.b(WebViewIctActivity.this, str)) {
                return true;
            }
            webView.loadUrl(str, WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewIctActivity.this));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!WebViewIctActivity.b(WebViewIctActivity.this, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null)) && webView != null) {
                webView.loadUrl(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewIctActivity.this));
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceError != null) {
                WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewIctActivity.this, webResourceError.getErrorCode());
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            ProgressBar progressBar = this.b.progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "");
            if (progressBar.getVisibility() == 0) {
                this.b.progressBar.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:405:0x2b0f  */
    /* JADX WARN: Code duplicated, block: B:544:0x3690  */
    /* JADX WARN: Code duplicated, block: B:545:0x3691  */
    /* JADX WARN: Code duplicated, block: B:556:0x36c5  */
    /* JADX WARN: Code duplicated, block: B:557:0x36c6  */
    @Override // com.bpjstku.util.viewbinding.BindingAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Throwable cause;
        String str;
        String str2;
        Object[] objArr3;
        Throwable th;
        Throwable cause2;
        Object[] objArr4;
        String str3;
        Object[] objArr5;
        int i;
        Object[] objArr6;
        Object[] objArr7;
        int i2;
        String str4;
        String str5;
        Object[] objArr8;
        char c;
        Object[] objArr9;
        int i3;
        Object[] objArr10;
        String str6;
        Object[] objArr11;
        int i4;
        String str7;
        Object[] objArr12;
        Object[] objArr13;
        String str8;
        Object[] objArr14;
        String str9;
        String str10;
        Object[] objArr15;
        Object[] objArr16;
        Object[] objArr17;
        int i5 = 2 % 2;
        int i6 = INotificationSideChannel + 5;
        cancelAll = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr18 = new Object[1];
        c(new char[]{7319, 7414, 1427, 10153, 1555, 18176, 4928, 5596, 14305, 22292, 8209, 19640, 904, 9534, 1907, 26577, 13254, 13686, 5985, 30255, 8730, 17566, 26305, 1661, 21100, 21758}, TextUtils.getCapsMode("", 0, 0), objArr18);
        String str11 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        c(new char[]{Typography.plusMinus, 212, 41312, 62242, 41698, 26733, 3962, 45345, 58223, 30727, 62623, 25559, 8100, 33245, 54207, 18585, 12272, 37273, 50174}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr19);
        String str12 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        c(new char[]{12486, 12460, 13993, 62328, 13606, 59356, 16208, 9964, 58151, 63387, 62674, 60535, 12241, 5718, 54221, 50996, 8093, 1604, 50099, 55016}, View.MeasureSpec.getMode(0), objArr20);
        String str13 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        c(new char[]{39225, 39248, 62817, 21083, 63211, 50804, 38645, 58660, 16898, 54827, 21986, 52688, 34305, 54740, 29405, 59010, 46674, 50578, 25218, 63303}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr21);
        String str14 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        c(new char[]{54109, 54076, 17405, 4712, 16509, 46271, 56458, 21426, 544, 42155, 5584, 48903, 52300, 25427, 13036, 37907, 64564, 29448, 8864, 34204, 60875, 730, 21272, 62932, 40337, 4755, 17366, 58624, 36204, 8743}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106, objArr22);
        String str15 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        c(new char[]{64226, 64129, 21924, 8802, 22079, 26076, 62783, 17911, 12844, 30119, 9676, 28260, 58850, 29969, 748, 17719, 54697, 25928, 4796, 21759, 50285, 5279}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr23);
        String str16 = (String) objArr23[0];
        int i8 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i10 = 1743023188 + ((i9 | 1028075543) * (-50));
        int i11 = ~((-289419282) | i9);
        int i12 = ~i9;
        if (i8 != i10 + ((i11 | (~(i12 | 2147482367))) * 50) + (((~(i12 | 1028075543)) | (~(1858063086 | i12)) | (-2147482368)) * 50)) {
            int[] iArr = new int[1867920183];
            iArr[1867920182] = 1;
            int i13 = (-1243823462) % 2;
            objArr = null;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        } else {
            objArr = null;
        }
        int i14 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(objArr);
        int i15 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(objArr, objArr)).getResources().getConfiguration().keyboardHidden;
        if (i14 != (((~(2031711469 | i15)) | (-1808518824)) * 262) + 1808467760 + (((~((~i15) | 2031711469)) | (-1808518824)) * 262)) {
            int[] iArr2 = new int[1550146111];
            iArr2[1550146110] = 1;
            int i16 = 1092682050 % 2;
            Toast.makeText((Context) null, iArr2[-1], 1).show();
        }
        super.onCreate(p0);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int i17 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2266;
            int iResolveSize = View.resolveSize(0, 0) + 33;
            byte b = $$a[7];
            Object[] objArr24 = new Object[1];
            e((short) 210, b, b, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, i17, iResolveSize, -887667012, false, (String) objArr24[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 33;
                byte b2 = $$a[7];
                Object[] objArr25 = new Object[1];
                e((short) 158, b2, (byte) (b2 | 15), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, jumpTapTimeout, packedPositionGroup, -654680577, false, (String) objArr25[0], null);
            }
            Object[] objArr26 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr26[0])[0];
            int i19 = ((int[]) objArr26[3])[0];
            String[] strArr = (String[]) objArr26[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i20 = (-1983556511) + (((~iElapsedRealtime) | 4195588) * 1324) + (((~(iElapsedRealtime | 785470804)) | (~(23242511 | iElapsedRealtime))) * (-1324)) + 782729894;
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[2])[0] = i22 ^ (i22 << 5);
            str14 = str14;
            str15 = str15;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str15).getMethod(str16, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
            }
            try {
                Object[] objArr27 = {baseContext, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue()), 0, -749548716};
                byte[] bArr = $$g;
                Object[] objArr28 = new Object[1];
                f(bArr[67], (byte) (-bArr[366]), bArr[4], objArr28);
                Class<?> cls = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                f(bArr[210], bArr[141], bArr[11], objArr29);
                Object[] objArr30 = (Object[]) cls.getMethod((String) objArr29[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr27);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int gidForName = Process.getGidForName("") + 2268;
                        int iCombineMeasuredStates = 33 - View.combineMeasuredStates(0, 0);
                        byte b3 = $$a[7];
                        Object[] objArr31 = new Object[1];
                        e((short) 158, b3, (byte) (b3 | 15), objArr31);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, gidForName, iCombineMeasuredStates, -654680577, false, (String) objArr31[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr30);
                    try {
                        long jLongValue = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cBlue = (char) Color.blue(0);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2267;
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
                            byte b4 = $$a[7];
                            Object[] objArr32 = new Object[1];
                            e((short) 121, b4, b4, objArr32);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, iNormalizeMetaState, iIndexOf, -874156483, false, (String) objArr32[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int iMyTid = (Process.myTid() >> 22) + 2267;
                            int iIndexOf2 = 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            byte b5 = $$a[7];
                            Object[] objArr33 = new Object[1];
                            e((short) 210, b5, b5, objArr33);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iMyTid, iIndexOf2, -887667012, false, (String) objArr33[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr30 = objArr30;
                    str14 = str14;
                    str15 = str15;
                }
                objArr2 = objArr30;
            } catch (Throwable th2) {
                th = th2;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i23 = ((int[]) objArr2[3])[0];
        int i24 = ((int[]) objArr2[0])[0];
        if (i24 != i23) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[1];
            if (strArr2 != null) {
                for (String str17 : strArr2) {
                    int i25 = cancelAll + 49;
                    INotificationSideChannel = i25 % 128;
                    int i26 = i25 % 2;
                    arrayList.add(str17);
                }
            }
            throw new RuntimeException(String.valueOf(i24));
        }
        Object[] objArr34 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i27 = ((int[]) objArr2[2])[0];
        int i28 = ((int[]) objArr2[0])[0];
        int i29 = ((int[]) objArr2[3])[0];
        String[] strArr3 = (String[]) objArr2[1];
        int iIdentityHashCode = System.identityHashCode(this);
        int i30 = ~iIdentityHashCode;
        int i31 = i27 + 596375563 + (((~((-568106205) | i30)) | 5512324 | (~((-240607112) | i30))) * (-1136)) + (((~((-568106205) | iIdentityHashCode)) | (~((-240607112) | iIdentityHashCode)) | (~(803200991 | i30))) * (-568)) + (((~(iIdentityHashCode | (-5512325))) | (~(i30 | 240607111)) | (~(568106204 | i30))) * 568);
        int i32 = (i31 << 13) ^ i31;
        int i33 = i32 ^ (i32 >>> 17);
        ((int[]) objArr34[2])[0] = i33 ^ (i33 << 5);
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) this.d.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final Function1 function1 = new Function1() { // from class: setCurrentMenuInfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebViewIctActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: setGroupEnabled
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_NOTIFICATION_POLICY") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_NOTIFICATION_POLICY"}, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int size = View.MeasureSpec.getSize(0) + 1031;
            int i34 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
            byte b6 = $$a[7];
            Object[] objArr35 = new Object[1];
            e((short) 121, b6, b6, objArr35);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, size, i34, 1357589585, false, (String) objArr35[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
            int i35 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i36 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
            byte b7 = $$a[7];
            Object[] objArr36 = new Object[1];
            e((short) 210, b7, b7, objArr36);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetBefore2, i35, i36, 1344079056, false, (String) objArr36[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
                Object[] objArr37 = new Object[1];
                e((short) 69, (byte) 14, (byte) 52, objArr37);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, longPressTimeout, iResolveSizeAndState, 632103528, false, (String) objArr37[0], null);
            }
            Object[] objArr38 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr3 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i37 = ((int[]) objArr38[3])[0];
            int i38 = ((int[]) objArr38[1])[0];
            String[] strArr4 = (String[]) objArr38[0];
            str = "currentApplication";
            int i39 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i40 = 1517436899 + (((-317830319) | i39) * 614);
            int i41 = ~i39;
            int i42 = i40 + (((~((-1036032285) | i41)) | 754977040 | (~((-791752115) | i41))) * (-1228)) + (((~(i41 | (-36775075))) | (~((-281055245) | i41))) * 614) + 1667533285;
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr3[2])[0] = i44 ^ (i44 << 5);
            str12 = str12;
            str2 = str14;
        } else {
            str = r11;
            str2 = str14;
            int iIntValue = ((Integer) Class.forName(str13).getMethod(str2, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr39 = {-566833522};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (46038 - TextUtils.indexOf("", "", 0)), 1134 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), MotionEvent.axisFromString("") + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr40 = {Integer.valueOf(iIntValue), 0, 1667533285, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr39), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int packedPositionGroup2 = 1031 - ExpandableListView.getPackedPositionGroup(0L);
                    int i45 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                    byte b8 = $$a[7];
                    Object[] objArr41 = new Object[1];
                    e((short) 121, b8, b8, objArr41);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(absoluteGravity, packedPositionGroup2, i45, 1298546779, false, (String) objArr41[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 45992), 1117 - Color.green(0), 17 - View.MeasureSpec.makeMeasureSpec(0, 0)), Boolean.TYPE});
                }
                Object[] objArr42 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr40);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int scrollDefaultDelay = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int modifierMetaStateMask2 = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                    Object[] objArr43 = new Object[1];
                    e((short) 69, (byte) 14, (byte) 52, objArr43);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollBarSize, scrollDefaultDelay, modifierMetaStateMask2, 632103528, false, (String) objArr43[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr42);
                try {
                    long jLongValue3 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                        int iArgb = 15 - Color.argb(0, 0, 0, 0);
                        byte b9 = $$a[7];
                        Object[] objArr44 = new Object[1];
                        e((short) 210, b9, b9, objArr44);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maxKeyCode, keyRepeatTimeout, iArgb, 1344079056, false, (String) objArr44[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                        int size2 = View.MeasureSpec.getSize(0) + 1031;
                        int capsMode = 15 - TextUtils.getCapsMode("", 0, 0);
                        byte b10 = $$a[7];
                        Object[] objArr45 = new Object[1];
                        e((short) 121, b10, b10, objArr45);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, size2, capsMode, 1357589585, false, (String) objArr45[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
                    objArr3 = objArr42;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                th = th3;
                cause2 = th.getCause();
                if (cause2 != null) {
                    throw th;
                }
                throw cause2;
            }
        }
        int i46 = ((int[]) objArr3[1])[0];
        int i47 = ((int[]) objArr3[3])[0];
        if (i47 == i46) {
            objArr4 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i48 = ((int[]) objArr3[2])[0];
            int i49 = ((int[]) objArr3[3])[0];
            int i50 = ((int[]) objArr3[1])[0];
            String[] strArr5 = (String[]) objArr3[0];
            int i51 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i52 = ~((-277885323) | i51);
            int i53 = ~i51;
            int i54 = i48 + (-1155175919) + ((i52 | (~(445904878 | i53))) * 920) + (((~((-412299727) | i53)) | 277885322) * 920) + (((~(i51 | 445904878)) | (~((-277885323) | i53)) | (~((-134414405) | i51))) * 920);
            int i55 = (i54 << 13) ^ i54;
            int i56 = i55 ^ (i55 >>> 17);
            ((int[]) objArr4[2])[0] = i56 ^ (i56 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr6 = (String[]) objArr3[0];
            if (strArr6 != null) {
                int i57 = cancelAll + 79;
                INotificationSideChannel = i57 % 128;
                int i58 = i57 % 2;
                for (String str18 : strArr6) {
                    arrayList2.add(str18);
                }
            }
            int[] iArr3 = new int[i47];
            int i59 = i47 - 1;
            iArr3[i59] = 1;
            Toast.makeText((Context) null, iArr3[((i47 * i59) % 2) - 1], 1).show();
            objArr4 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i60 = ((int[]) objArr3[2])[0];
            int i61 = ((int[]) objArr3[3])[0];
            int i62 = ((int[]) objArr3[1])[0];
            String[] strArr7 = (String[]) objArr3[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i63 = i60 + (-684444025) + (((~((~iIdentityHashCode2) | (-202140170))) | (~((-36836647) | iIdentityHashCode2))) * (-302)) + ((~((-202140170) | iIdentityHashCode2)) * (-604)) + (((~(iIdentityHashCode2 | (-238976816))) | (-520093632)) * 302);
            int i64 = (i63 << 13) ^ i63;
            int i65 = i64 ^ (i64 >>> 17);
            ((int[]) objArr4[2])[0] = i65 ^ (i65 << 5);
        }
        this.TuitionPaymentFragmentbindingInflater1 = getIntent().getStringExtra("KEY_URL");
        this.asInterface = getIntent().getStringExtra("API_TOKEN");
        this.asBinder = getIntent().getStringExtra("MENU_ICT");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char longPressTimeout2 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
            int longPressTimeout3 = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int iKeyCodeFromString = 23 - KeyEvent.keyCodeFromString("");
            byte b11 = $$a[7];
            Object[] objArr46 = new Object[1];
            e((short) 158, b11, (byte) (b11 | 15), objArr46);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(longPressTimeout2, longPressTimeout3, iKeyCodeFromString, 986134021, false, (String) objArr46[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                int i66 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                byte b12 = $$a[7];
                Object[] objArr47 = new Object[1];
                e((short) 210, b12, b12, objArr47);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cIndexOf2, jumpTapTimeout2, i66, 1599039318, false, (String) objArr47[0], null);
            }
            Object[] objArr48 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null);
            objArr5 = new Object[]{new int[]{((int[]) objArr48[0])[0]}, new int[]{((int[]) objArr48[1])[0]}, (Object[]) objArr48[2], new int[1], (String[]) objArr48[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i67 = ~iIdentityHashCode3;
            int i68 = 740003713 + ((iIdentityHashCode3 | 134457897) * 988) + (((~(137345577 | i67)) | 72369168) * (-1976)) + (((~(iIdentityHashCode3 | (-75256849))) | 134457897 | (~(75256848 | i67))) * 988) + 1583957291;
            int i69 = (i68 << 13) ^ i68;
            int i70 = i69 ^ (i69 >>> 17);
            ((int[]) objArr5[3])[0] = i70 ^ (i70 << 5);
            objArr4 = objArr4;
            str13 = str13;
            str3 = str12;
            i = 1;
            str2 = str2;
        } else {
            int iIntValue2 = ((Integer) Class.forName(str13).getMethod(str2, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr49 = {-46986977};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b((char) (42049 - (Process.myPid() >> 22)), 1726 - (Process.myPid() >> 22), 28 - TextUtils.indexOf((CharSequence) "", '0'), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).newInstance(objArr49), 1583957291);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char c4 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int i71 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
                    int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b13 = $$a[7];
                    Object[] objArr50 = new Object[1];
                    e((short) 210, b13, b13, objArr50);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c4, i71, maximumFlingVelocity, 1599039318, false, (String) objArr50[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    str3 = str12;
                    long jLongValue4 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                        int i72 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
                        byte b14 = $$a[7];
                        Object[] objArr51 = new Object[1];
                        e((short) 69, b14, b14, objArr51);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cResolveOpacity, i72, windowTouchSlop, 1596667560, false, (String) objArr51[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                        char offsetBefore3 = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                        int iRed = Color.red(0) + 1755;
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 23;
                        byte b15 = $$a[7];
                        Object[] objArr52 = new Object[1];
                        e((short) 158, b15, (byte) (b15 | 15), objArr52);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(offsetBefore3, iRed, scrollBarSize2, 986134021, false, (String) objArr52[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf6);
                    objArr5 = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
                    i = 1;
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } catch (Throwable th4) {
                th = th4;
                cause2 = th.getCause();
                if (cause2 != null) {
                    throw th;
                }
                throw cause2;
            }
        }
        int i73 = ((int[]) objArr5[i])[0];
        int i74 = ((int[]) objArr5[0])[0];
        if (i74 == i73) {
            objArr6 = new Object[5];
            int[] iArr4 = new int[i];
            objArr6[0] = iArr4;
            int[] iArr5 = new int[i];
            objArr6[i] = iArr5;
            objArr6[3] = new int[i];
            int i75 = ((int[]) objArr5[3])[0];
            int i76 = ((int[]) objArr5[0])[0];
            int i77 = ((int[]) objArr5[i])[0];
            String[] strArr8 = (String[]) objArr5[4];
            Object[] objArr53 = (Object[]) objArr5[2];
            iArr4[0] = i76;
            iArr5[0] = i77;
            objArr6[4] = strArr8;
            objArr6[2] = objArr53;
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i78 = (~((-914015695) | iIdentityHashCode4)) | 372260938;
            int i79 = i75 + 2135982025 + (i78 * 992) + ((i78 | (~((~iIdentityHashCode4) | (-159658513)))) * (-496)) + ((iIdentityHashCode4 | (-701413269)) * 496);
            int i80 = (i79 << 13) ^ i79;
            int i81 = i80 ^ (i80 >>> 17);
            ((int[]) objArr6[3])[0] = i81 ^ (i81 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr9 = (String[]) objArr5[4];
            if (strArr9 != null) {
                int i82 = cancelAll + 23;
                INotificationSideChannel = i82 % 128;
                for (int i83 = i82 % 2 != 0 ? 1 : 0; i83 < strArr9.length; i83++) {
                    arrayList3.add(strArr9[i83]);
                }
            }
            int[] iArr6 = new int[i74];
            int i84 = i74 - 1;
            iArr6[i84] = 1;
            Toast.makeText((Context) null, iArr6[((i74 * i84) % 2) - 1], 1).show();
            int i85 = ((int[]) objArr5[3])[0];
            objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iNextInt = new Random().nextInt(1028580312);
            int i86 = ~iNextInt;
            int i87 = i85 + 812874956 + ((316623440 | i86) * (-757)) + ((~(385842774 | iNextInt)) * 1514) + (((~(iNextInt | (-69219335))) | (~(i86 | 104021014)) | 281821760) * 757);
            int i88 = (i87 << 13) ^ i87;
            int i89 = i88 ^ (i88 >>> 17);
            ((int[]) objArr6[3])[0] = i89 ^ (i89 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
            char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int minimumFlingVelocity = 651 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int windowTouchSlop2 = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte b16 = $$a[7];
            Object[] objArr54 = new Object[1];
            e((short) 69, b16, b16, objArr54);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(jumpTapTimeout3, minimumFlingVelocity, windowTouchSlop2, -459846511, false, (String) objArr54[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
            char cBlue2 = (char) Color.blue(0);
            int trimmedLength = TextUtils.getTrimmedLength("") + 651;
            int iIndexOf3 = 43 - TextUtils.indexOf((CharSequence) "", '0');
            Object[] objArr55 = new Object[1];
            e((short) 69, (byte) 14, (byte) 52, objArr55);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cBlue2, trimmedLength, iIndexOf3, -873460649, false, (String) objArr55[0], null);
        }
        if (j2 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iResolveSize2 = View.resolveSize(0, 0) + 651;
                int packedPositionChild = 43 - ExpandableListView.getPackedPositionChild(0L);
                byte b17 = $$a[7];
                Object[] objArr56 = new Object[1];
                e((short) 158, b17, (byte) (b17 | 15), objArr56);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(fadingEdgeLength, iResolveSize2, packedPositionChild, -1595579076, false, (String) objArr56[0], null);
            }
            Object[] objArr57 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).get(null);
            objArr7 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i90 = ((int[]) objArr57[2])[0];
            int i91 = ((int[]) objArr57[0])[0];
            int i92 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i93 = (((~(276923642 | i92)) | (-3431023)) * 398) + 1369020549 + (((~((~i92) | 276923642)) | (-3431023)) * 398) + 2056042300;
            int i94 = (i93 << 13) ^ i93;
            int i95 = i94 ^ (i94 >>> 17);
            ((int[]) objArr7[3])[0] = i95 ^ (i95 << 5);
            i2 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1610, 26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr58 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).newInstance(null), 2056042300, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                int iLastIndexOf = 650 - TextUtils.lastIndexOf("", '0');
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44;
                Object[] objArr59 = new Object[1];
                e((short) 69, (byte) 14, (byte) 52, objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cLastIndexOf, iLastIndexOf, maximumDrawingCacheSize2, 2075921419, false, (String) objArr59[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", ""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 695, 98 - (Process.myTid() >> 22)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - Color.argb(0, 0, 0, 0)), 794 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr58);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                int i96 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 651;
                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 45;
                byte b18 = $$a[7];
                Object[] objArr60 = new Object[1];
                e((short) 158, b18, (byte) (b18 | 15), objArr60);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cLastIndexOf2, i96, packedPositionChild2, -1595579076, false, (String) objArr60[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, objArr7);
            try {
                long jLongValue6 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char cIndexOf3 = (char) TextUtils.indexOf("", "", 0);
                    int defaultSize = View.getDefaultSize(0, 0) + 651;
                    int jumpTapTimeout4 = 44 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    Object[] objArr61 = new Object[1];
                    e((short) 69, (byte) 14, (byte) 52, objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cIndexOf3, defaultSize, jumpTapTimeout4, -873460649, false, (String) objArr61[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char jumpTapTimeout5 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iMakeMeasureSpec = 651 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 45;
                    byte b19 = $$a[7];
                    Object[] objArr62 = new Object[1];
                    e((short) 69, b19, b19, objArr62);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(jumpTapTimeout5, iMakeMeasureSpec, iLastIndexOf2, -459846511, false, (String) objArr62[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf8);
                i2 = 0;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr7[2])[i2] != ((int[]) objArr7[i2])[i2]) {
            int i97 = i2;
            ArrayList arrayList4 = new ArrayList();
            String[] strArr10 = (String[]) objArr7[1];
            if (strArr10 != null) {
                for (int i98 = i97; i98 < strArr10.length; i98++) {
                    arrayList4.add(strArr10[i98]);
                }
            }
            throw null;
        }
        Object[] objArr63 = new Object[4];
        int[] iArr7 = new int[1];
        objArr63[i2] = iArr7;
        int[] iArr8 = new int[1];
        objArr63[2] = iArr8;
        objArr63[3] = new int[1];
        int i99 = ((int[]) objArr7[3])[i2];
        int i100 = ((int[]) objArr7[2])[i2];
        int i101 = ((int[]) objArr7[i2])[i2];
        iArr8[i2] = i100;
        iArr7[i2] = i101;
        objArr63[1] = new String[i2];
        int iMyUid = Process.myUid();
        int i102 = ~iMyUid;
        int i103 = ~(737979768 | i102);
        int i104 = i99 + (-465002591) + (((-738000895) | i103) * (-712)) + (((~(iMyUid | (-21127))) | (~(i102 | 738000894))) * (-712)) + ((734548958 | i103) * 712);
        int i105 = (i104 << 13) ^ i104;
        int i106 = i105 ^ (i105 >>> 17);
        ((int[]) objArr63[3])[0] = i106 ^ (i106 << 5);
        HashMap<String, String> map = this.g;
        int i107 = ((int[]) objArr34[2])[0];
        int i108 = ((i107 * i107) - (~(-(856196865 * i107)))) - 1;
        int i109 = -(i107 * 1837878593);
        int i110 = (i108 ^ i109) + ((i108 & i109) << 1);
        int i111 = (i110 & 33740865) + (33740865 | i110);
        int i112 = ((i111 >> 20) - 8191) / 4096;
        int i113 = (i112 & 1) + (i112 | 1);
        int i114 = -((((i111 | i113) << 1) - (i111 ^ i113)) ^ i113);
        int i115 = ((i114 | 6) << 1) - (i114 ^ 6);
        int i116 = i115 >> 19;
        int i117 = (((i116 | (-16383)) << 1) - (i116 ^ (-16383))) / 8192;
        int i118 = (i117 ^ 1) + ((i117 & 1) << 1);
        int i119 = 1893846 / (((-(((i118 | 1) << 1) - (i118 ^ 1))) & i115) * 439);
        int i120 = ((int[]) objArr4[2])[0];
        int i121 = i120 * i120;
        int i122 = -(1751858372 * i120);
        int i123 = (i121 ^ i122) + ((i121 & i122) << 1);
        int i124 = -(i120 * 239089354);
        int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
        int i126 = ((i125 | (-1627965263)) << 1) - ((-1627965263) ^ i125);
        int i127 = ((i126 >> 21) - 4095) / 2048;
        int i128 = (i127 & 1) + (i127 | 1);
        int i129 = (i126 ^ i128) + ((i128 & i126) << 1);
        int i130 = i126 >> 18;
        int i131 = (-(i129 ^ (((((i130 | (-32767)) << 1) - (i130 ^ (-32767))) / 16384) + 1))) + 1;
        int i132 = ((i131 >> 27) - 63) / 32;
        int i133 = (i132 ^ 1) + ((i132 & 1) << 1);
        map.put("18,22,access-token".substring(i119 + ((-990357) / ((i131 & (-(((i133 | 1) << 1) - (i133 ^ 1)))) * 1389))), String.valueOf(this.asInterface));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
            char bitsPerPixel = (char) (37566 - ImageFormat.getBitsPerPixel(0));
            int longPressTimeout4 = (ViewConfiguration.getLongPressTimeout() >> 16) + 625;
            int iResolveSize3 = 14 - View.resolveSize(0, 0);
            Object[] objArr64 = new Object[1];
            e((short) 69, (byte) 14, (byte) 52, objArr64);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(bitsPerPixel, longPressTimeout4, iResolveSize3, -477065106, false, (String) objArr64[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
            char c5 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37566);
            int mirror = AndroidCharacter.getMirror('0') + 577;
            int longPressTimeout5 = 14 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte b20 = $$a[7];
            Object[] objArr65 = new Object[1];
            e((short) 121, b20, b20, objArr65);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c5, mirror, longPressTimeout5, -976899241, false, (String) objArr65[0], null);
        }
        if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
                int tapTimeout2 = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                int iRgb = (-16777202) - Color.rgb(0, 0, 0);
                byte b21 = $$a[7];
                Object[] objArr66 = new Object[1];
                e((short) 210, b21, b21, objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(tapTimeout, tapTimeout2, iRgb, -973632554, false, (String) objArr66[0], null);
            }
            Object[] objArr67 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
            int i134 = ((int[]) objArr67[2])[0];
            int i135 = ((int[]) objArr67[0])[0];
            String[] strArr11 = (String[]) objArr67[3];
            int[] iArr9 = {i134};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i136 = ~iIdentityHashCode5;
            int i137 = ((157365594 + ((((~(i136 | 1587521712)) | (-1587538169)) | (~((-236199953) | iIdentityHashCode5))) * 717)) + (((~(iIdentityHashCode5 | 1587521712)) | ((~(i136 | (-236199953))) | (-1587538169))) * 717)) - 48964318;
            int i138 = (i137 << 13) ^ i137;
            int i139 = i138 ^ (i138 >>> 17);
            ((int[]) objArr8[1])[0] = i139 ^ (i139 << 5);
            objArr8 = new Object[]{new int[]{i135}, new int[1], iArr9, strArr11};
            c = 0;
            str5 = str2;
            str4 = str16;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str15).getMethod(str4, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                str4 = str16;
                if ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) {
                    str4 = str16;
                    baseContext2 = null;
                } else {
                    str4 = str16;
                    str4 = str16;
                    baseContext2 = baseContext2.getApplicationContext();
                }
            }
            str4 = str16;
            str4 = str16;
            str5 = str2;
            int iIntValue3 = ((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr68 = new Object[1];
            c(new char[]{8624, 8578, 59706, 49128, 60081, 5303, 11881, 63861, 44960, 1192, 47186, 7964, 16121, 51593, 40824, 13331, 3837, 55746, 36663, 9691, 8039, 43086, 65240, 21971, 28445, 47104, 60945, 17692, 32645, 35000, 56860, 30007, 20363, 39715, 52610, 26359, 23625, 27518, 15868, 38575, 44281, 31718, 11582, 34367, 48358, 19354, 7530, 47070, 36158, 23042, 3237, 42907, 40305, 10767, 31766, 55063, 60892, 15055, 27732, 51036, 64921, 13687, 23434, 63652, 51738, 1377, 19396, 59628}, View.resolveSize(0, 0), objArr68);
            String str19 = (String) objArr68[0];
            Object[] objArr69 = new Object[1];
            c(new char[]{22246, 22149, 60904, 24494, 61031, 21665, 22894, 65012, 20448, 17640, 22550, 24413, 18931, 52575, 32618, 29701, 31147, 56643, 28532, 26011, 26676, 44186, 7836, 5572, 6219, 48342, 3588, 1289, 2260, 35949, 15960, 13694, 14557, 40872, 11723, 9911, 11039, 28587, 56767, 55014, 56234, 32612, 52515, 50733, 52196, 20252, 64892, 63377, 64057, 24197, 60641, 59356, 60031, 11914, 40019, 38670, 39644, 15893, 35857, 34637, 35477, 12799, 48072, 47283, 48463, 481, 43908, 43177}, ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.error_qr_code).substring(1, 2).length() - 1, objArr69);
            try {
                Object[] objArr70 = {baseContext2, new String[]{str19, (String) objArr69[0]}, Integer.valueOf(iIntValue3), 17, -48964318};
                byte[] bArr2 = $$g;
                Object[] objArr71 = new Object[1];
                f(bArr2[210], (byte) (bArr2[497] + 1), bArr2[141], objArr71);
                Class<?> cls2 = Class.forName((String) objArr71[0]);
                Object[] objArr72 = new Object[1];
                f((short) (-bArr2[506]), (byte) (-bArr2[366]), bArr2[299], objArr72);
                Object[] objArr73 = (Object[]) cls2.getMethod((String) objArr72[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr70);
                int i140 = ((int[]) objArr73[0])[0];
                int i141 = ((int[]) objArr73[2])[0];
                if (baseContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char c6 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
                        int iLastIndexOf3 = 624 - TextUtils.lastIndexOf("", '0');
                        int touchSlop = 14 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte b22 = $$a[7];
                        Object[] objArr74 = new Object[1];
                        e((short) 210, b22, b22, objArr74);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c6, iLastIndexOf3, touchSlop, -973632554, false, (String) objArr74[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr73);
                    try {
                        long jLongValue8 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf9 = Long.valueOf(jLongValue8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                            char c7 = (char) (37568 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int i142 = 625 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int gidForName2 = Process.getGidForName("") + 15;
                            byte b23 = $$a[7];
                            Object[] objArr75 = new Object[1];
                            e((short) 121, b23, b23, objArr75);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c7, i142, gidForName2, -976899241, false, (String) objArr75[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf9);
                        Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                            char c8 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37566);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 625;
                            int i143 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                            Object[] objArr76 = new Object[1];
                            e((short) 69, (byte) 14, (byte) 52, objArr76);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c8, threadPriority, i143, -477065106, false, (String) objArr76[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf10);
                    } catch (Exception unused5) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr73 = objArr73;
                    str4 = str4;
                }
                objArr8 = objArr73;
                c = 0;
            } catch (Throwable th5) {
                th = th5;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i144 = ((int[]) objArr8[c])[c];
        int i145 = ((int[]) objArr8[2])[c];
        if (i145 == i144) {
            objArr9 = new Object[4];
            int[] iArr10 = new int[1];
            objArr9[c] = iArr10;
            objArr9[1] = new int[1];
            int[] iArr11 = new int[1];
            objArr9[2] = iArr11;
            int i146 = ((int[]) objArr8[1])[c];
            int i147 = ((int[]) objArr8[2])[c];
            int i148 = ((int[]) objArr8[c])[c];
            String[] strArr12 = (String[]) objArr8[3];
            iArr11[c] = i147;
            iArr10[c] = i148;
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i149 = i146 + 1733804596 + (((~((-1776162307) | iIdentityHashCode6)) | (-47575815)) * (-964)) + (((~((~iIdentityHashCode6) | (-1776162307))) | 1762264064) * (-964));
            int i150 = (i149 << 13) ^ i149;
            int i151 = i150 ^ (i150 >>> 17);
            ((int[]) objArr9[1])[0] = i151 ^ (i151 << 5);
            objArr9[3] = strArr12;
            i3 = 0;
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr13 = (String[]) objArr8[3];
            if (strArr13 != null) {
                for (String str20 : strArr13) {
                    int i152 = INotificationSideChannel + 103;
                    cancelAll = i152 % 128;
                    int i153 = i152 % 2;
                    arrayList5.add(str20);
                }
            }
            int[] iArr12 = new int[i145];
            int i154 = i145 - 1;
            iArr12[i154] = 1;
            Toast.makeText((Context) null, iArr12[((i145 * i154) % 2) - 1], 1).show();
            int i155 = ((int[]) objArr8[1])[0];
            int i156 = ((int[]) objArr8[2])[0];
            int i157 = ((int[]) objArr8[0])[0];
            String[] strArr14 = (String[]) objArr8[3];
            int[] iArr13 = {i156};
            int iMyTid2 = Process.myTid();
            int i158 = ~((-343235287) | iMyTid2);
            int i159 = ~iMyTid2;
            int i160 = i155 + 231058472 + ((i158 | (~(1480502834 | i159))) * (-1808)) + (((~((-271845907) | iMyTid2)) | (~(i159 | 1551892214))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iMyTid2 | (-1480502835))) | 71389380 | (~(343235286 | i159))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i161 = (i160 << 13) ^ i160;
            int i162 = i161 ^ (i161 >>> 17);
            i3 = 0;
            ((int[]) objArr9[1])[0] = i162 ^ (i162 << 5);
            objArr9 = new Object[]{new int[]{i157}, new int[1], iArr13, strArr14};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
            char cRgb = (char) ((-16734174) - Color.rgb(i3, i3, i3));
            int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 3111;
            int iNormalizeMetaState2 = 22 - KeyEvent.normalizeMetaState(i3);
            byte b24 = $$a[7];
            Object[] objArr77 = new Object[1];
            e((short) 121, b24, b24, objArr77);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cRgb, touchSlop2, iNormalizeMetaState2, -1272852037, false, (String) objArr77[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                char scrollDefaultDelay2 = (char) (43042 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int i163 = 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int iIndexOf4 = 22 - TextUtils.indexOf("", "");
                byte b25 = $$a[7];
                Object[] objArr78 = new Object[1];
                e((short) 158, b25, (byte) (b25 | 15), objArr78);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(scrollDefaultDelay2, i163, iIndexOf4, 154975793, false, (String) objArr78[0], null);
            }
            Object[] objArr79 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).get(null);
            int i164 = ((int[]) objArr79[2])[0];
            int i165 = ((int[]) objArr79[1])[0];
            String[] strArr15 = (String[]) objArr79[3];
            int[] iArr14 = {i165};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 171318282;
            int i166 = ~(395401768 | iCodePointAt);
            int i167 = ((((-1881088664) + ((1208878290 | i166) * (-814))) + ((i166 | ((~((~iCodePointAt) | (-1309629691))) | 294650368)) * 407)) + (((~(iCodePointAt | 1309629690)) | ((~((-395401769) | iCodePointAt)) | 294650368)) * 407)) - 983289679;
            int i168 = (i167 << 13) ^ i167;
            int i169 = i168 ^ (i168 >>> 17);
            ((int[]) objArr10[0])[0] = i169 ^ (i169 << 5);
            objArr10 = new Object[]{new int[1], iArr14, new int[]{i164}, strArr15};
            objArr9 = objArr9;
        } else {
            Object[] objArr80 = {null, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -983289679};
            byte[] bArr3 = $$g;
            Object[] objArr81 = new Object[1];
            f((short) 131, bArr3[210], bArr3[191], objArr81);
            Class<?> cls3 = Class.forName((String) objArr81[0]);
            Object[] objArr82 = new Object[1];
            f(bArr3[210], bArr3[141], bArr3[11], objArr82);
            Object[] objArr83 = (Object[]) cls3.getMethod((String) objArr82[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr80);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 43042);
                int minimumFlingVelocity2 = 3111 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                byte b26 = $$a[7];
                Object[] objArr84 = new Object[1];
                e((short) 158, b26, (byte) (b26 | 15), objArr84);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(packedPositionType2, minimumFlingVelocity2, maximumDrawingCacheSize3, 154975793, false, (String) objArr84[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, objArr83);
            try {
                long jLongValue9 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    char c9 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43041);
                    int iNormalizeMetaState3 = 3111 - KeyEvent.normalizeMetaState(0);
                    int iAlpha = Color.alpha(0) + 22;
                    byte b27 = $$a[7];
                    Object[] objArr85 = new Object[1];
                    e((short) 210, b27, b27, objArr85);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(c9, iNormalizeMetaState3, iAlpha, -1269618118, false, (String) objArr85[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char c10 = (char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int jumpTapTimeout6 = 3111 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int maximumDrawingCacheSize4 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                    byte b28 = $$a[7];
                    Object[] objArr86 = new Object[1];
                    e((short) 121, b28, b28, objArr86);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c10, jumpTapTimeout6, maximumDrawingCacheSize4, -1272852037, false, (String) objArr86[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf12);
                objArr10 = objArr83;
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i170 = ((int[]) objArr10[1])[0];
        int i171 = ((int[]) objArr10[2])[0];
        if (i171 != i170) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr16 = (String[]) objArr10[3];
            if (strArr16 != null) {
                for (String str21 : strArr16) {
                    arrayList6.add(str21);
                }
            }
            throw new RuntimeException(String.valueOf(i171));
        }
        int i172 = INotificationSideChannel + 69;
        cancelAll = i172 % 128;
        int i173 = i172 % 2;
        int i174 = ((int[]) objArr10[0])[0];
        int i175 = ((int[]) objArr10[2])[0];
        int i176 = ((int[]) objArr10[1])[0];
        String[] strArr17 = (String[]) objArr10[3];
        int[] iArr15 = {i176};
        int iIdentityHashCode7 = System.identityHashCode(this);
        int i177 = ~iIdentityHashCode7;
        int i178 = i174 + (((~((-1488313869) | i177)) | (~(iIdentityHashCode7 | 216717590))) * 959) + 2014913879 + (((~(iIdentityHashCode7 | (-1488313869))) | (~(i177 | 216717590))) * 959);
        int i179 = (i178 << 13) ^ i178;
        int i180 = i179 ^ (i179 >>> 17);
        ((int[]) objArr[0])[0] = i180 ^ (i180 << 5);
        Object[] objArr87 = {new int[1], iArr15, new int[]{i175}, strArr17};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
            char cResolveOpacity2 = (char) (Drawable.resolveOpacity(0, 0) + 31533);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
            int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            Object[] objArr88 = new Object[1];
            e((short) 69, (byte) 14, (byte) 52, objArr88);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cResolveOpacity2, keyRepeatDelay, doubleTapTimeout, -1048449946, false, (String) objArr88[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char cBlue3 = (char) (Color.blue(0) + 31533);
                int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0) + 922;
                int i181 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b29 = $$a[7];
                Object[] objArr89 = new Object[1];
                e((short) 158, b29, (byte) (b29 | 15), objArr89);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cBlue3, iLastIndexOf4, i181, -1142834547, false, (String) objArr89[0], null);
            }
            Object[] objArr90 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
            objArr11 = new Object[]{new int[1], new int[]{((int[]) objArr90[1])[0]}, (Object[]) objArr90[2], new int[]{((int[]) objArr90[3])[0]}, (String[]) objArr90[4]};
            int i182 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i183 = ~i182;
            int i184 = 149746270 + (((~((-464554466) | i183)) | 1309525178) * 519) + (((~(i183 | (-296749378))) | (~(1606274555 | i182))) * (-519)) + (((~(i182 | 1309525178)) | 464554465) * 519) + 411295595;
            int i185 = (i184 << 13) ^ i184;
            int i186 = i185 ^ (i185 >>> 17);
            ((int[]) objArr11[0])[0] = i186 ^ (i186 << 5);
            str5 = str5;
            str6 = str4;
            i4 = 1;
            objArr87 = objArr87;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                str6 = str4;
                baseContext3 = (Context) Class.forName(str15).getMethod(str6, new Class[0]).invoke(null, null);
            } else {
                str6 = str4;
            }
            if (baseContext3 != null) {
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            Object[] objArr91 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 411295595};
            byte[] bArr4 = $$g;
            Object[] objArr92 = new Object[1];
            f((short) 182, (byte) (-bArr4[307]), bArr4[3], objArr92);
            Class<?> cls4 = Class.forName((String) objArr92[0]);
            Object[] objArr93 = new Object[1];
            f((short) (-bArr4[506]), (byte) (-bArr4[366]), bArr4[299], objArr93);
            Object[] objArr94 = (Object[]) cls4.getMethod((String) objArr93[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr91);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 31534);
                int mirror2 = AndroidCharacter.getMirror('0') + 873;
                int iIndexOf5 = TextUtils.indexOf("", "", 0) + 28;
                byte b30 = $$a[7];
                Object[] objArr95 = new Object[1];
                e((short) 158, b30, (byte) (b30 | 15), objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cAxisFromString, mirror2, iIndexOf5, -1142834547, false, (String) objArr95[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr94);
            try {
                long jLongValue10 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char size3 = (char) (View.MeasureSpec.getSize(0) + 31533);
                    int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0) + 922;
                    int iIndexOf7 = 28 - TextUtils.indexOf("", "");
                    byte b31 = $$a[7];
                    Object[] objArr96 = new Object[1];
                    e((short) 210, b31, b31, objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(size3, iIndexOf6, iIndexOf7, -778300370, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
                    int iIndexOf8 = 921 - TextUtils.indexOf("", "", 0);
                    int iAlpha2 = Color.alpha(0) + 28;
                    Object[] objArr97 = new Object[1];
                    e((short) 69, (byte) 14, (byte) 52, objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(deadChar, iIndexOf8, iAlpha2, -1048449946, false, (String) objArr97[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf14);
                objArr11 = objArr94;
                i4 = 1;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i187 = ((int[]) objArr11[i4])[0];
        int i188 = ((int[]) objArr11[3])[0];
        if (i188 != i187) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr18 = (String[]) objArr11[4];
            if (strArr18 != null) {
                for (String str22 : strArr18) {
                    arrayList7.add(str22);
                }
            }
            throw new RuntimeException(String.valueOf(i188));
        }
        Object[] objArr98 = new Object[5];
        objArr98[0] = new int[i4];
        int[] iArr16 = new int[i4];
        objArr98[i4] = iArr16;
        int[] iArr17 = new int[i4];
        objArr98[3] = iArr17;
        int i189 = ((int[]) objArr11[0])[0];
        int i190 = ((int[]) objArr11[3])[0];
        int i191 = ((int[]) objArr11[i4])[0];
        String[] strArr19 = (String[]) objArr11[4];
        Object[] objArr99 = (Object[]) objArr11[2];
        iArr17[0] = i190;
        iArr16[0] = i191;
        objArr98[4] = strArr19;
        objArr98[2] = objArr99;
        int i192 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i193 = i189 + (((~((-1109393718) | i192)) | 1706970195) * 262) + 473491935 + (((~((~i192) | (-1109393718))) | 1706970195) * 262);
        int i194 = (i193 << 13) ^ i193;
        int i195 = i194 ^ (i194 >>> 17);
        ((int[]) objArr98[0])[0] = i195 ^ (i195 << 5);
        ActivityWebViewIctBinding activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        WebView webView = activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser;
        String str23 = this.TuitionPaymentFragmentbindingInflater1;
        if (str23 == null) {
            str23 = "";
        }
        webView.loadUrl(str23, this.g);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.getSettings().setJavaScriptEnabled(true);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.setDownloadListener(new setGroupCheckable(this, activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2));
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.getSettings().setSupportZoom(true);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.getSettings().setCacheMode(-1);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.getSettings().setDatabaseEnabled(true);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.getSettings().setDomStorageEnabled(true);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.getSettings().setUseWideViewPort(true);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.getSettings().setLoadWithOverviewMode(true);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.getSettings().setAllowContentAccess(true);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.getSettings().setAllowFileAccess(true);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.addJavascriptInterface(new OutputConfigurationCompatApi28Impl(getApplicationContext()), "Android");
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.getSettings().setPluginState(WebSettings.PluginState.ON);
        WebView.setWebContentsDebuggingEnabled(false);
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.setWebChromeClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2));
        activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2.browser.setWebViewClient(new TuitionPaymentFragmentbindingInflater1(activityWebViewIctBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char offsetBefore4 = (char) TextUtils.getOffsetBefore("", 0);
            int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 876;
            int iMyTid3 = (Process.myTid() >> 22) + 10;
            byte b32 = $$a[7];
            Object[] objArr100 = new Object[1];
            e((short) 158, b32, (byte) (b32 | 15), objArr100);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(offsetBefore4, packedPositionType3, iMyTid3, -1650998592, false, (String) objArr100[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char cGreen = (char) Color.green(0);
            int mirror3 = 924 - AndroidCharacter.getMirror('0');
            int i196 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte b33 = $$a[7];
            Object[] objArr101 = new Object[1];
            e((short) 210, b33, b33, objArr101);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cGreen, mirror3, i196, 2012020043, false, (String) objArr101[0], null);
        }
        if (j4 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i197 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                byte b34 = $$a[7];
                Object[] objArr102 = new Object[1];
                e((short) 121, b34, b34, objArr102);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(keyRepeatDelay2, i197, scrollDefaultDelay3, 2012931276, false, (String) objArr102[0], null);
            }
            Object[] objArr103 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            objArr12 = new Object[]{new int[]{((int[]) objArr103[0])[0]}, new int[1], new int[]{((int[]) objArr103[2])[0]}, (String[]) objArr103[3]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i198 = (((-875256932) + (((~iIdentityHashCode8) | 145326809) * 1324)) + (((~(iIdentityHashCode8 | (-643198215))) | (~(683508443 | iIdentityHashCode8))) * (-1324))) - 2081121016;
            int i199 = (i198 << 13) ^ i198;
            int i200 = i199 ^ (i199 >>> 17);
            ((int[]) objArr12[1])[0] = i200 ^ (i200 << 5);
            str7 = str5;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                int i201 = INotificationSideChannel + 15;
                cancelAll = i201 % 128;
                int i202 = i201 % 2;
                baseContext4 = (Context) Class.forName(str15).getMethod(str6, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            str7 = str5;
            Object[] objArr104 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, 437445916};
            byte[] bArr5 = $$g;
            Object[] objArr105 = new Object[1];
            f((short) 258, bArr5[424], bArr5[191], objArr105);
            Class<?> cls5 = Class.forName((String) objArr105[0]);
            Object[] objArr106 = new Object[1];
            f((short) 306, (byte) (-bArr5[366]), bArr5[299], objArr106);
            Object[] objArr107 = (Object[]) cls5.getMethod((String) objArr106[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr104);
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char defaultSize2 = (char) View.getDefaultSize(0, 0);
                    int i203 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                    int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 10;
                    byte b35 = $$a[7];
                    Object[] objArr108 = new Object[1];
                    e((short) 121, b35, b35, objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(defaultSize2, i203, iNormalizeMetaState4, 2012931276, false, (String) objArr108[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, objArr107);
                try {
                    long jLongValue12 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                        char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int scrollBarSize4 = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int maximumDrawingCacheSize5 = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b36 = $$a[7];
                        Object[] objArr109 = new Object[1];
                        e((short) 210, b36, b36, objArr109);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(scrollBarSize3, scrollBarSize4, maximumDrawingCacheSize5, 2012020043, false, (String) objArr109[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                        char c11 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int i204 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                        int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                        byte b37 = $$a[7];
                        Object[] objArr110 = new Object[1];
                        e((short) 158, b37, (byte) (b37 | 15), objArr110);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(c11, i204, tapTimeout3, -1650998592, false, (String) objArr110[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf16);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            } else {
                objArr107 = objArr107;
            }
            objArr12 = objArr107;
        }
        int i205 = ((int[]) objArr12[2])[0];
        int i206 = ((int[]) objArr12[0])[0];
        if (i206 == i205) {
            int i207 = ((int[]) objArr12[1])[0];
            objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
            int iMyTid4 = Process.myTid();
            int i208 = i207 + (-981816544) + (((~((-1066218457) | iMyTid4)) | 42541528) * 345) + (((~((-1066218457) | (~iMyTid4))) | (-1068449756)) * 345) + ((~(iMyTid4 | (-42541529))) * 345);
            int i209 = (i208 << 13) ^ i208;
            int i210 = i209 ^ (i209 >>> 17);
            ((int[]) objArr13[1])[0] = i210 ^ (i210 << 5);
        } else {
            int[] iArr18 = new int[i206];
            int i211 = i206 - 1;
            iArr18[i211] = 1;
            Toast.makeText((Context) null, iArr18[((i206 * i211) % 2) - 1], 1).show();
            int i212 = ((int[]) objArr12[1])[0];
            objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i213 = ~layoutDirection;
            int i214 = i212 + (-1201700774) + (((~(319124504 | i213)) | (~((-33649681) | layoutDirection))) * (-831)) + ((~(393084413 | layoutDirection)) * (-1662)) + (((~(layoutDirection | (-319124505))) | (~(i213 | (-359434734))) | (~(359434733 | layoutDirection))) * 831);
            int i215 = (i214 << 13) ^ i214;
            int i216 = i215 ^ (i215 >>> 17);
            ((int[]) objArr13[1])[0] = i216 ^ (i216 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char c12 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int longPressTimeout6 = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
            str8 = "";
            int iIndexOf9 = TextUtils.indexOf((CharSequence) str8, '0', 0) + 11;
            byte[] bArr6 = $$a;
            Object[] objArr111 = new Object[1];
            e((short) (-bArr6[8]), (byte) (-bArr6[205]), (byte) 42, objArr111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c12, longPressTimeout6, iIndexOf9, -1199417970, false, (String) objArr111[0], null);
        } else {
            str8 = r4;
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int size4 = 876 - View.MeasureSpec.getSize(0);
            int maximumFlingVelocity2 = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr7 = $$a;
            short s = bArr7[77];
            byte b38 = (byte) (-bArr7[33]);
            Object[] objArr112 = new Object[1];
            e(s, b38, (byte) (b38 | 36), objArr112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(pressedStateDuration, size4, maximumFlingVelocity2, 254769921, false, (String) objArr112[0], null);
        }
        if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char c13 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iAxisFromString = 875 - MotionEvent.axisFromString(str8);
                int iRgb2 = (-16777206) - Color.rgb(0, 0, 0);
                byte[] bArr8 = $$a;
                Object[] objArr113 = new Object[1];
                e(bArr8[77], (byte) (-bArr8[205]), (byte) (-bArr8[44]), objArr113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c13, iAxisFromString, iRgb2, 1324201839, false, (String) objArr113[0], null);
            }
            Object[] objArr114 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr14 = new Object[]{new int[]{((int[]) objArr114[0])[0]}, new int[1], new int[]{((int[]) objArr114[2])[0]}, (String[]) objArr114[3]};
            int i217 = (~((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection()) | 150835849;
            int i218 = (((-1100699556) + (i217 * 495)) + (((~i217) | 141132297) * 495)) - 112677412;
            int i219 = (i218 << 13) ^ i218;
            int i220 = i219 ^ (i219 >>> 17);
            ((int[]) objArr14[1])[0] = i220 ^ (i220 << 5);
            str9 = str3;
        } else {
            Object[] objArr115 = {Integer.valueOf(((Integer) Class.forName(str13).getMethod(str7, Object.class).invoke(null, this)).intValue()), -112677412};
            byte[] bArr9 = $$g;
            Object[] objArr116 = new Object[1];
            f((short) 358, bArr9[138], bArr9[191], objArr116);
            Class<?> cls6 = Class.forName((String) objArr116[0]);
            Object[] objArr117 = new Object[1];
            f(bArr9[210], bArr9[141], bArr9[11], objArr117);
            objArr14 = (Object[]) cls6.getMethod((String) objArr117[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr115);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                int iRed2 = Color.red(0) + 10;
                byte[] bArr10 = $$a;
                Object[] objArr118 = new Object[1];
                e(bArr10[77], (byte) (-bArr10[205]), (byte) (-bArr10[44]), objArr118);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(minimumFlingVelocity3, threadPriority2, iRed2, 1324201839, false, (String) objArr118[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, objArr14);
            try {
                str9 = str3;
                long jLongValue14 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int iRgb3 = (-16776340) - Color.rgb(0, 0, 0);
                    int iRed3 = 10 - Color.red(0);
                    byte[] bArr11 = $$a;
                    short s2 = bArr11[77];
                    byte b39 = (byte) (-bArr11[33]);
                    Object[] objArr119 = new Object[1];
                    e(s2, b39, (byte) (b39 | 36), objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(maxKeyCode2, iRgb3, iRed3, 254769921, false, (String) objArr119[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char capsMode2 = (char) TextUtils.getCapsMode(str8, 0, 0);
                    int iMyPid = 876 - (Process.myPid() >> 22);
                    int bitsPerPixel2 = 9 - ImageFormat.getBitsPerPixel(0);
                    byte[] bArr12 = $$a;
                    Object[] objArr120 = new Object[1];
                    e((short) (-bArr12[8]), (byte) (-bArr12[205]), (byte) 42, objArr120);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(capsMode2, iMyPid, bitsPerPixel2, -1199417970, false, (String) objArr120[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf18);
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr14[0])[0] != ((int[]) objArr14[2])[0]) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr20 = (String[]) objArr14[3];
            if (strArr20 != null) {
                int i221 = INotificationSideChannel + 99;
                cancelAll = i221 % 128;
                int i222 = i221 % 2;
                for (String str24 : strArr20) {
                    arrayList8.add(str24);
                }
            }
            throw null;
        }
        int i223 = ((int[]) objArr14[1])[0];
        Object[] objArr121 = {new int[]{((int[]) objArr14[0])[0]}, new int[1], new int[]{((int[]) objArr14[2])[0]}, (String[]) objArr14[3]};
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bank_atm_transfer_step2).substring(17, 18).codePointAt(0) - 147209703;
        int i224 = ~iCodePointAt2;
        int i225 = i223 + 517347592 + (((~((-887737817) | i224)) | (~(847427587 | iCodePointAt2))) * 217) + (((~(iCodePointAt2 | (-887737817))) | 74008024) * 217) + (((~(i224 | 847427587)) | 887737816) * 217);
        int i226 = (i225 << 13) ^ i225;
        int i227 = i226 ^ (i226 >>> 17);
        ((int[]) objArr121[1])[0] = i227 ^ (i227 << 5);
        setSupportActionBar(TuitionPaymentFragmentspecialinlinedviewModeldefault2().layoutToolbarCenter.toolbar);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
            int iIndexOf10 = 875 - TextUtils.indexOf((CharSequence) str8, '0', 0, 0);
            int packedPositionType4 = 10 - ExpandableListView.getPackedPositionType(0L);
            Object[] objArr122 = new Object[1];
            e((short) 69, (byte) 14, (byte) 52, objArr122);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(packedPositionGroup3, iIndexOf10, packedPositionType4, 252381699, false, (String) objArr122[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char c14 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int packedPositionChild3 = 875 - ExpandableListView.getPackedPositionChild(0L);
            int iAlpha3 = 10 - Color.alpha(0);
            byte b40 = $$a[7];
            Object[] objArr123 = new Object[1];
            e((short) 69, b40, b40, objArr123);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c14, packedPositionChild3, iAlpha3, 2009631821, false, (String) objArr123[0], null);
        }
        if (j6 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int i228 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                int mirror4 = ':' - AndroidCharacter.getMirror('0');
                byte[] bArr13 = $$a;
                Object[] objArr124 = new Object[1];
                e(bArr13[7], bArr13[10], (byte) 52, objArr124);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cArgb, i228, mirror4, 256017550, false, (String) objArr124[0], null);
            }
            Object[] objArr125 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr15 = new Object[]{new int[]{((int[]) objArr125[0])[0]}, new int[1], new int[]{((int[]) objArr125[2])[0]}, (String[]) objArr125[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i229 = ~iIdentityHashCode9;
            int i230 = 1461683252 + (((~((-815912759) | i229)) | 276895254 | (~(775602529 | i229))) * (-1136)) + (((~((-815912759) | iIdentityHashCode9)) | (~(775602529 | iIdentityHashCode9)) | (~((-236585026) | i229))) * (-568)) + (((~(iIdentityHashCode9 | (-276895255))) | (~(i229 | (-775602530))) | (~(815912758 | i229))) * 568) + 985261821;
            int i231 = (i230 << 13) ^ i230;
            int i232 = i231 ^ (i231 >>> 17);
            ((int[]) objArr15[1])[0] = i232 ^ (i232 << 5);
            str10 = str6;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str15).getMethod(str10, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                str10 = str6;
                if (baseContext5 instanceof ContextWrapper) {
                    int i233 = INotificationSideChannel + 105;
                    cancelAll = i233 % 128;
                    int i234 = i233 % 2;
                    if (((ContextWrapper) baseContext5).getBaseContext() != null) {
                        str10 = str6;
                        str10 = str6;
                        baseContext5 = baseContext5.getApplicationContext();
                    } else {
                        str10 = str6;
                        baseContext5 = null;
                    }
                } else {
                    str10 = str6;
                    str10 = str6;
                    baseContext5 = baseContext5.getApplicationContext();
                }
            }
            str10 = str6;
            str10 = str6;
            Object[] objArr126 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str7, Object.class).invoke(null, this)).intValue()), 985261821};
            byte[] bArr14 = $$g;
            Object[] objArr127 = new Object[1];
            f((short) 421, bArr14[2], bArr14[191], objArr127);
            Class<?> cls7 = Class.forName((String) objArr127[0]);
            Object[] objArr128 = new Object[1];
            f(bArr14[210], bArr14[141], bArr14[11], objArr128);
            Object[] objArr129 = (Object[]) cls7.getMethod((String) objArr128[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr126);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int fadingEdgeLength2 = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iLastIndexOf5 = TextUtils.lastIndexOf(str8, '0', 0, 0) + 11;
                    byte[] bArr15 = $$a;
                    Object[] objArr130 = new Object[1];
                    e(bArr15[7], bArr15[10], (byte) 52, objArr130);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(keyRepeatDelay3, fadingEdgeLength2, iLastIndexOf5, 256017550, false, (String) objArr130[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, objArr129);
                try {
                    long jLongValue16 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                        char packedPositionChild4 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                        int iBlue = Color.blue(0) + 876;
                        int i235 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte b41 = $$a[7];
                        Object[] objArr131 = new Object[1];
                        e((short) 69, b41, b41, objArr131);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(packedPositionChild4, iBlue, i235, 2009631821, false, (String) objArr131[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char trimmedLength2 = (char) TextUtils.getTrimmedLength(str8);
                        int mirror5 = 924 - AndroidCharacter.getMirror('0');
                        int iIndexOf11 = 10 - TextUtils.indexOf(str8, str8, 0, 0);
                        Object[] objArr132 = new Object[1];
                        e((short) 69, (byte) 14, (byte) 52, objArr132);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(trimmedLength2, mirror5, iIndexOf11, 252381699, false, (String) objArr132[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            } else {
                objArr129 = objArr129;
            }
            objArr15 = objArr129;
        }
        int i236 = ((int[]) objArr15[2])[0];
        int i237 = ((int[]) objArr15[0])[0];
        if (i237 != i236) {
            throw new RuntimeException(String.valueOf(i237));
        }
        int i238 = ((int[]) objArr15[1])[0];
        Object[] objArr133 = {new int[]{((int[]) objArr15[0])[0]}, new int[1], new int[]{((int[]) objArr15[2])[0]}, (String[]) objArr15[3]};
        String str25 = str;
        int i239 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str25, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i240 = (~(69018282 | i239)) | 41949269;
        int i241 = ~((~i239) | (-1639041));
        int i242 = i238 + (-1718369822) + ((i240 | i241) * (-470)) + (((~(i239 | 110967551)) | i241) * 470);
        int i243 = (i242 << 13) ^ i242;
        int i244 = i243 ^ (i243 >>> 17);
        ((int[]) objArr133[1])[0] = i244 ^ (i244 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
            char scrollDefaultDelay4 = (char) (53893 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
            int i245 = 1320 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int mirror6 = 'T' - AndroidCharacter.getMirror('0');
            Object[] objArr134 = new Object[1];
            e((short) 69, (byte) 14, (byte) 52, objArr134);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(scrollDefaultDelay4, i245, mirror6, -1433084963, false, (String) objArr134[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                char fadingEdgeLength3 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 53893);
                int fadingEdgeLength4 = 1320 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i246 = 37 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte b42 = $$a[7];
                Object[] objArr135 = new Object[1];
                e((short) 210, b42, b42, objArr135);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(fadingEdgeLength3, fadingEdgeLength4, i246, -1920778747, false, (String) objArr135[0], null);
            }
            Object[] objArr136 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).get(null);
            objArr16 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i247 = ((int[]) objArr136[0])[0];
            int i248 = ((int[]) objArr136[3])[0];
            String[] strArr21 = (String[]) objArr136[2];
            int i249 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str25, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i250 = ~i249;
            int i251 = (~((-546113612) | i250)) | 537198593;
            int i252 = ~(i249 | 833429231);
            int i253 = 461381862 + ((i251 | i252) * (-502)) + ((i252 | (~(i250 | (-8915019)))) * TypedValues.PositionType.TYPE_DRAWPATH) + 238954781;
            int i254 = (i253 << 13) ^ i253;
            int i255 = i254 ^ (i254 >>> 17);
            ((int[]) objArr16[1])[0] = i255 ^ (i255 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str15).getMethod(str10, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str13).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr137 = {-2009571042};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 47977), View.MeasureSpec.getSize(0) + 1300, 20 - (ViewConfiguration.getLongPressTimeout() >> 16), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr138 = {baseContext6, "com.bpjstku", 238954781, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).newInstance(objArr137), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 53893);
                int iMyTid5 = 1320 - (Process.myTid() >> 22);
                int iLastIndexOf6 = TextUtils.lastIndexOf(str8, '0', 0, 0) + 37;
                byte b43 = $$a[7];
                Object[] objArr139 = new Object[1];
                e((short) 210, b43, b43, objArr139);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cResolveSizeAndState, iMyTid5, iLastIndexOf6, 819724799, false, (String) objArr139[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) str8, '0', 0) + 57879), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1393, (ViewConfiguration.getLongPressTimeout() >> 16) + 75), Boolean.TYPE});
            }
            objArr16 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).invoke(null, objArr138);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char c15 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 53892);
                    int scrollBarSize5 = (ViewConfiguration.getScrollBarSize() >> 8) + 1320;
                    int packedPositionChild5 = 35 - ExpandableListView.getPackedPositionChild(0L);
                    byte b44 = $$a[7];
                    Object[] objArr140 = new Object[1];
                    e((short) 210, b44, b44, objArr140);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c15, scrollBarSize5, packedPositionChild5, -1920778747, false, (String) objArr140[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr16);
                try {
                    long jLongValue17 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char maxKeyCode3 = (char) (53893 - (KeyEvent.getMaxKeyCode() >> 16));
                        int defaultSize3 = View.getDefaultSize(0, 0) + 1320;
                        int i256 = 37 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b45 = $$a[7];
                        Object[] objArr141 = new Object[1];
                        e((short) 158, b45, (byte) (b45 | 15), objArr141);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(maxKeyCode3, defaultSize3, i256, -1273706634, false, (String) objArr141[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char keyRepeatTimeout2 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 53893);
                        int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1320;
                        int i257 = 36 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr142 = new Object[1];
                        e((short) 69, (byte) 14, (byte) 52, objArr142);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(keyRepeatTimeout2, keyRepeatTimeout3, i257, -1433084963, false, (String) objArr142[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i258 = ((int[]) objArr16[3])[0];
        int i259 = ((int[]) objArr16[0])[0];
        if (i259 == i258) {
            objArr17 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i260 = ((int[]) objArr16[1])[0];
            int i261 = ((int[]) objArr16[0])[0];
            int i262 = ((int[]) objArr16[3])[0];
            String[] strArr22 = (String[]) objArr16[2];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i263 = i260 + 583274754 + (((~((~iFreeMemory) | 382736548)) | (-1056055021)) * 529) + (((~(iFreeMemory | 382736548)) | (-987891277)) * 529);
            int i264 = (i263 << 13) ^ i263;
            int i265 = i264 ^ (i264 >>> 17);
            ((int[]) objArr17[1])[0] = i265 ^ (i265 << 5);
        } else {
            int[] iArr19 = new int[i259];
            int i266 = i259 - 1;
            iArr19[i266] = 1;
            Toast.makeText((Context) null, iArr19[((i259 * i266) % 2) - 1], 1).show();
            objArr17 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i267 = ((int[]) objArr16[1])[0];
            int i268 = ((int[]) objArr16[0])[0];
            int i269 = ((int[]) objArr16[3])[0];
            String[] strArr23 = (String[]) objArr16[2];
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i270 = i267 + (-44025648) + (((~((~iIdentityHashCode10) | (-438677529))) | 302260248) * 446) + (((~(iIdentityHashCode10 | (-136417281))) | 629690048) * 446) + 1664084432;
            int i271 = (i270 << 13) ^ i270;
            int i272 = i271 ^ (i271 >>> 17);
            ((int[]) objArr17[1])[0] = i272 ^ (i272 << 5);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i273 = INotificationSideChannel + 27;
            cancelAll = i273 % 128;
            if (i273 % 2 == 0) {
                supportActionBar.setDisplayHomeAsUpEnabled(true);
            } else {
                supportActionBar.setDisplayHomeAsUpEnabled(true);
            }
        }
        String str26 = this.asBinder;
        int i274 = ((int[]) objArr6[3])[0];
        int i275 = i274 * i274;
        int i276 = -(823376609 * i274);
        int i277 = (i275 & i276) + (i275 | i276);
        int i278 = -(i274 * (-716509543));
        int i279 = (i277 & i278) + (i278 | i277);
        int i280 = ((i279 | (-1485663351)) << 1) - ((-1485663351) ^ i279);
        int i281 = ((i280 >> 18) - 32767) / 16384;
        int i282 = (i281 ^ 1) + ((i281 & 1) << 1);
        int i283 = (i280 & i282) + (i282 | i280);
        int i284 = i280 >> 17;
        int i285 = ((((-65535) | i284) << 1) - (i284 ^ (-65535))) / 32768;
        int i286 = -(i283 ^ ((i285 ^ 1) + ((i285 & 1) << 1)));
        int i287 = (i286 ^ 1) + ((i286 & 1) << 1);
        int i288 = ((i287 >> 25) - 255) / 128;
        int i289 = (i288 ^ 1) + ((i288 & 1) << 1);
        int i290 = 141718 / (((-(((i289 | 1) << 1) - (i289 ^ 1))) & i287) * 1201);
        int i291 = ((int[]) objArr63[3])[0];
        int i292 = i291 * i291;
        int i293 = -(930822355 * i291);
        int i294 = ((i292 | i293) << 1) - (i292 ^ i293);
        int i295 = -(i291 * 199870081);
        int i296 = (i294 ^ i295) + ((i295 & i294) << 1);
        int i297 = (i296 ^ (-1676534556)) + (((-1676534556) & i296) << 1);
        int i298 = i297 >> 23;
        int i299 = ((i298 ^ (-1023)) + ((i298 & (-1023)) << 1)) / 512;
        int i300 = ((i299 | 1) << 1) - (i299 ^ 1);
        int i301 = ((i297 | i300) << 1) - (i300 ^ i297);
        int i302 = i297 >> 24;
        int i303 = ((i302 ^ (-511)) + ((i302 & (-511)) << 1)) / 256;
        int i304 = -(((i303 & 1) + (i303 | 1)) ^ i301);
        int i305 = ((i304 | 6) << 1) - (i304 ^ 6);
        int i306 = i305 >> 22;
        int i307 = ((i306 ^ (-2047)) + ((i306 & (-2047)) << 1)) / 1024;
        int i308 = (i307 & 1) + (i307 | 1);
        int i309 = i290 + (869400 / (((-(((i308 | 1) << 1) - (i308 ^ 1))) & i305) * 575));
        int i310 = ((int[]) objArr9[1])[0];
        int i311 = ((((i310 * i310) - (~(-(1755381589 * i310)))) - 1) - (~(-(i310 * 1655491975)))) - 1;
        int i312 = ((i311 | 1913771844) << 1) - (1913771844 ^ i311);
        int i313 = i312 >> 25;
        int i314 = (((i313 ^ (-255)) + ((i313 & (-255)) << 1)) / 128) + 1;
        int i315 = ((i312 | i314) << 1) - (i314 ^ i312);
        int i316 = i312 >> 20;
        int i317 = (((i316 | (-8191)) << 1) - (i316 ^ (-8191))) / 4096;
        int i318 = (-(i315 ^ ((i317 ^ 1) + ((i317 & 1) << 1)))) + 9;
        int i319 = i318 >> 28;
        int i320 = i309 + (7784091 / ((i318 & (-((((i319 & (-31)) + (i319 | (-31))) / 16) + 2))) * 931));
        int i321 = ((int[]) objArr87[0])[0];
        int i322 = i321 * i321;
        int i323 = -(406335162 * i321);
        int i324 = (i322 & i323) + (i322 | i323);
        int i325 = -(i321 * 269342536);
        int i326 = (i324 & i325) + (i325 | i324);
        int i327 = (i326 & (-95484415)) + ((-95484415) | i326);
        int i328 = i327 >> 28;
        int i329 = ((i328 ^ (-31)) + ((i328 & (-31)) << 1)) / 16;
        int i330 = (i329 ^ 1) + ((i329 & 1) << 1);
        int i331 = (i327 ^ i330) + ((i330 & i327) << 1);
        int i332 = ((i327 >> 24) - 511) / 256;
        int i333 = -(i331 ^ (((i332 | 1) << 1) - (i332 ^ 1)));
        int i334 = (i333 ^ 7) + ((i333 & 7) << 1);
        int i335 = i334 >> 26;
        int i336 = ((i335 & ComposerKt.defaultsKey) + (i335 | ComposerKt.defaultsKey)) / 64;
        int i337 = i320 + (1840062 / (((-(((i336 & 1) + (i336 | 1)) + 1)) & i334) * 681));
        int i338 = ((int[]) objArr98[0])[0];
        int i339 = i338 * i338;
        int i340 = -(444064396 * i338);
        int i341 = (i339 ^ i340) + ((i339 & i340) << 1);
        int i342 = -(i338 * 1060764000);
        int i343 = (((i341 | i342) << 1) - (i342 ^ i341)) - 61773724;
        int i344 = ((i343 >> 28) - 31) / 16;
        int i345 = ((i344 | 1) << 1) - (i344 ^ 1);
        int i346 = (i343 ^ i345) + ((i345 & i343) << 1);
        int i347 = i343 >> 21;
        int i348 = ((i347 & (-4095)) + (i347 | (-4095))) / 2048;
        int i349 = (-(i346 ^ ((i348 & 1) + (i348 | 1)))) + 5;
        int i350 = i349 >> 16;
        int i351 = ((((-131071) & i350) + (i350 | (-131071))) / 65536) + 1;
        int i352 = i337 + (473200 / ((i349 & (-((i351 & 1) + (i351 | 1)))) * 182));
        int i353 = ((int[]) objArr13[1])[0];
        int i354 = ((i353 * i353) - (~(-(1123503887 * i353)))) - 1;
        int i355 = -(i353 * 1114587109);
        int i356 = ((i354 | i355) << 1) - (i355 ^ i354);
        int i357 = (i356 ^ (-258939356)) + (((-258939356) & i356) << 1);
        int i358 = i357 >> 27;
        int i359 = (i357 - (~((((i358 ^ (-63)) + ((i358 & (-63)) << 1)) / 32) + 1))) - 1;
        int i360 = i357 >> 20;
        int i361 = (((i360 | (-8191)) << 1) - (i360 ^ (-8191))) / 4096;
        int i362 = -(i359 ^ ((i361 & 1) + (i361 | 1)));
        int i363 = (i362 ^ 4) + ((i362 & 4) << 1);
        int i364 = i363 >> 22;
        int i365 = (((i364 | (-2047)) << 1) - (i364 ^ (-2047))) / 1024;
        int i366 = (i365 ^ 1) + ((i365 & 1) << 1);
        int i367 = i352 + (5554808 / (((-((i366 ^ 1) + ((i366 & 1) << 1))) & i363) * 1967));
        int i368 = ((int[]) objArr121[1])[0];
        int i369 = i368 * i368;
        int i370 = -(1296770033 * i368);
        int i371 = (((i369 ^ i370) + ((i369 & i370) << 1)) - (~(-(i368 * (-1316190163))))) - 1;
        int i372 = (i371 ^ (-2054744863)) + (((-2054744863) & i371) << 1);
        int i373 = ((i372 >> 25) - 255) / 128;
        int i374 = ((i373 | 1) << 1) - (i373 ^ 1);
        int i375 = (i372 ^ i374) + ((i374 & i372) << 1);
        int i376 = i372 >> 15;
        int i377 = ((((-262143) | i376) << 1) - (i376 ^ (-262143))) / 131072;
        int i378 = (-(i375 ^ (((i377 | 1) << 1) - (i377 ^ 1)))) + 1;
        int i379 = i378 >> 25;
        int i380 = (((i379 | (-255)) << 1) - (i379 ^ (-255))) / 128;
        int i381 = ((i380 | 1) << 1) - (i380 ^ 1);
        int i382 = i367 + (946810 / ((i378 & (-(((i381 | 1) << 1) - (i381 ^ 1)))) * 1297));
        int i383 = ((int[]) objArr133[1])[0];
        int i384 = ((((i383 * i383) - (~(-(580888543 * i383)))) - 1) - (~(-(i383 * (-1498638441))))) - 1;
        int i385 = (i384 & 1114821273) + (1114821273 | i384);
        int i386 = ((i385 >> 18) - 32767) / 16384;
        int i387 = (i386 ^ 1) + ((i386 & 1) << 1);
        int i388 = ((i385 | i387) << 1) - (i387 ^ i385);
        int i389 = i385 >> 25;
        int i390 = (-(i388 ^ (((((i389 | (-255)) << 1) - (i389 ^ (-255))) / 128) + 1))) + 6;
        int i391 = i390 >> 21;
        int i392 = ((i391 & (-4095)) + (i391 | (-4095))) / 2048;
        int i393 = ((i392 | 1) << 1) - (i392 ^ 1);
        int i394 = i382 + (3176016 / ((i390 & (-(((i393 | 1) << 1) - (i393 ^ 1)))) * PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW));
        int i395 = ((int[]) objArr17[1])[0];
        int i396 = i395 * i395;
        int i397 = -(1413340440 * i395);
        int i398 = (i396 ^ i397) + ((i396 & i397) << 1);
        int i399 = -(i395 * 1791711824);
        int i400 = (i398 ^ i399) + ((i399 & i398) << 1);
        int i401 = (i400 ^ (-2007796080)) + (((-2007796080) & i400) << 1);
        int i402 = i401 >> 20;
        int i403 = (((i402 | (-8191)) << 1) - (i402 ^ (-8191))) / 4096;
        int i404 = (i403 & 1) + (i403 | 1);
        int i405 = (i401 & i404) + (i404 | i401);
        int i406 = i401 >> 16;
        int i407 = (((-131071) ^ i406) + ((i406 & (-131071)) << 1)) / 65536;
        int i408 = -(((i407 & 1) + (i407 | 1)) ^ i405);
        int i409 = ((i408 | 9) << 1) - (i408 ^ 9);
        int i410 = i409 >> 26;
        int i411 = ((i410 & ComposerKt.defaultsKey) + (i410 | ComposerKt.defaultsKey)) / 64;
        if (Intrinsics.areEqual(str26, "6/18/30/PROMO".substring(i394 + ((-73500876) / (((-(((i411 ^ 1) + ((i411 & 1) << 1)) + 1)) & i409) * 1966))))) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2().layoutToolbarCenter.tvToolbarTitle.setText(getString(com.bpjstku.R.string.label_promo));
        } else if (Intrinsics.areEqual(this.asBinder, "DANASIAGA")) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2().layoutToolbarCenter.tvToolbarTitle.setText(getString(com.bpjstku.R.string.menu_danasiaga));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        int i2 = cancelAll + 23;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        if (p0 == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i5 = i3 + 91;
            int i6 = i5 % 128;
            cancelAll = i6;
            int i7 = i5 % 2;
            ValueCallback<Uri[]> valueCallback = this.b;
            if (valueCallback != null) {
                if (valueCallback != null) {
                    int i8 = i6 + 7;
                    INotificationSideChannel = i8 % 128;
                    if (i8 % 2 != 0) {
                        valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(p1, p2));
                        int i9 = 98 / 0;
                    } else {
                        valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(p1, p2));
                    }
                }
                this.b = null;
                int i10 = INotificationSideChannel + 91;
                cancelAll = i10 % 128;
                int i11 = i10 % 2;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int p0, KeyEvent p1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 51;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        if (p0 != 4 || !TuitionPaymentFragmentspecialinlinedviewModeldefault2().browser.canGoBack()) {
            finish();
            return super.onKeyDown(p0, p1);
        }
        int i4 = INotificationSideChannel + 47;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2().browser.goBack();
            return true;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2().browser.goBack();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:5:0x0016, B:15:0x003e, B:13:0x0032, B:11:0x0029), top: B:19:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancelAll + 35;
        INotificationSideChannel = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 70 / 0;
                if (p0.getItemId() == 16908332) {
                    onBackPressed();
                    int i4 = cancelAll + 39;
                    INotificationSideChannel = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    onBackPressed();
                    int i6 = cancelAll + 39;
                    INotificationSideChannel = i6 % 128;
                    int i7 = i6 % 2;
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

    private final String TuitionPaymentFragmentbindingInflater1(String p0) {
        int i = 2 % 2;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String str = p0;
        String strSubstring = p0.substring(StringsKt.indexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) str, ";", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append(".");
        sb.append(strSubstring);
        File file = new File(externalStoragePublicDirectory, sb.toString());
        try {
            if (!externalStoragePublicDirectory.exists()) {
                int i2 = INotificationSideChannel + 45;
                cancelAll = i2 % 128;
                if (i2 % 2 == 0) {
                    externalStoragePublicDirectory.mkdirs();
                    int i3 = 7 / 0;
                } else {
                    externalStoragePublicDirectory.mkdirs();
                }
            }
            if (!file.exists()) {
                int i4 = INotificationSideChannel + 71;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
                file.createNewFile();
            }
            String strSubstring2 = p0.substring(StringsKt.indexOf$default((CharSequence) p0, ",", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            byte[] bArrDecode = Base64.decode(strSubstring2, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArrDecode);
            fileOutputStream.close();
            MediaScannerConnection.scanFile(this, new String[]{file.toString()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: setExclusiveItemChecked
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str2, Uri uri) {
                    WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
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
            Notification notificationBuild = new NotificationCompat.Builder(this, "bpjstku_channel_id").setSmallIcon(2131231113).setContentText("Kode QR Voucher Berhasil Diunduh").setContentTitle("QR Promo").setContentIntent(Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(this, 0, intent, 201326592) : PendingIntent.getActivity(this, 0, intent, 1140850688)).setAutoCancel(true).build();
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
            ConstraintLayout constraintLayout = TuitionPaymentFragmentspecialinlinedviewModeldefault2().rootWebView;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(constraintLayout, "Kode QR Berhasil Diunduh");
        } catch (IOException unused) {
            ConstraintLayout constraintLayout2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2().rootWebView;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(constraintLayout2, "Gagal Unduh");
        }
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i6 = cancelAll + 9;
        INotificationSideChannel = i6 % 128;
        if (i6 % 2 == 0) {
            return string;
        }
        throw null;
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        int i = 2 % 2;
        if (StringsKt.startsWith$default(p0, "tel:", false, 2, (Object) null)) {
            startActivity(new Intent("android.intent.action.DIAL", Uri.parse(p0)));
            return true;
        }
        if (StringsKt.startsWith$default(p0, MailTo.MAILTO_SCHEME, false, 2, (Object) null)) {
            startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(p0)));
            int i2 = INotificationSideChannel + 3;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (StringsKt.startsWith$default(p0, "https://api.whatsapp.com/", false, 2, (Object) null)) {
            b(p0);
            return true;
        }
        if (StringsKt.startsWith$default(p0, "https://play.google.com/", false, 2, (Object) null)) {
            int i4 = cancelAll + 109;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            b(p0);
            return true;
        }
        if (StringsKt.startsWith$default(p0, "whatsapp://", false, 2, (Object) null)) {
            b(p0);
            return true;
        }
        if (StringsKt.startsWith$default(p0, "tokopedia://", false, 2, (Object) null)) {
            int i6 = cancelAll + 115;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            b(p0);
            return true;
        }
        if (StringsKt.startsWith$default(p0, "market://", false, 2, (Object) null)) {
            int i8 = cancelAll + 19;
            INotificationSideChannel = i8 % 128;
            if (i8 % 2 != 0) {
                b(p0);
                return true;
            }
            b(p0);
            return true;
        }
        if (StringsKt.startsWith$default(p0, "intent://", false, 2, (Object) null)) {
            try {
                Intent uri = Intent.parseUri(p0, 1);
                if (uri.getStringExtra("S.browser_fallback_url") == null) {
                    startActivity(uri);
                }
                return true;
            } catch (URISyntaxException e2) {
                e2.printStackTrace();
            }
        }
        if (!StringsKt.startsWith$default(p0, "https://bukarekening.bni.co.id/simpanan/home-promo", false, 2, (Object) null)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p0));
        intent.setPackage("com.android.chrome");
        PackageManager packageManager = getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        if (intent.resolveActivity(packageManager) != null) {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Google Chrome tidak terpasang", 0).show();
            }
        } else {
            b(p0);
        }
        return true;
    }

    private final boolean b(String p0) {
        int i = 2 % 2;
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p0)));
            int i2 = cancelAll + 79;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 68 / 0;
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Aplikasi tidak tersedia", 0).show();
            return false;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr2;
        WebViewIctActivity webViewIctActivity = (WebViewIctActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cGreen = (char) (29944 - Color.green(0));
            int i2 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iMyTid = (Process.myTid() >> 22) + 23;
            byte b = $$a[7];
            Object[] objArr3 = new Object[1];
            e((short) 158, b, (byte) (b | 15), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, i2, iMyTid, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                byte b2 = $$a[7];
                Object[] objArr4 = new Object[1];
                e((short) 210, b2, b2, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, tapTimeout, i3, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i4 = ~startElapsedRealtime;
            int i5 = (((711695537 + (((~(160595749 | i4)) | ((~((-373198176) | i4)) | 372015194)) * (-1136))) + ((((~((-373198176) | startElapsedRealtime)) | (~(160595749 | startElapsedRealtime))) | (~((-159412769) | i4))) * (-568))) + (((~(startElapsedRealtime | (-372015195))) | ((~(373198175 | i4)) | (~(i4 | (-160595750))))) * 568)) - 311655480;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            c(new char[]{12486, 12460, 13993, 62328, 13606, 59356, 16208, 9964, 58151, 63387, 62674, 60535, 12241, 5718, 54221, 50996, 8093, 1604, 50099, 55016}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            c(new char[]{39225, 39248, 62817, 21083, 63211, 50804, 38645, 58660, 16898, 54827, 21986, 52688, 34305, 54740, 29405, 59010, 46674, 50578, 25218, 63303}, Gravity.getAbsoluteGravity(0, 0), objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, webViewIctActivity)).intValue();
            try {
                Object[] objArr8 = {1105494792};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 42049), 1726 - Color.argb(0, 0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), -311655480, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                    int i8 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                    byte b3 = $$a[7];
                    Object[] objArr9 = new Object[1];
                    e((short) 210, b3, b3, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, i8, i9, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    c(new char[]{7319, 7414, 1427, 10153, 1555, 18176, 4928, 5596, 14305, 22292, 8209, 19640, 904, 9534, 1907, 26577, 13254, 13686, 5985, 30255, 8730, 17566, 26305, 1661, 21100, 21758}, Color.green(0), objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{Typography.plusMinus, 212, 41312, 62242, 41698, 26733, 3962, 45345, 58223, 30727, 62623, 25559, 8100, 33245, 54207, 18585, 12272, 37273, 50174}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1755;
                        int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
                        byte b4 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        e((short) 69, b4, b4, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, packedPositionGroup, i10, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                        int i11 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b5 = $$a[7];
                        Object[] objArr13 = new Object[1];
                        e((short) 158, b5, (byte) (b5 | 15), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, iResolveSizeAndState, i11, 986134021, false, (String) objArr13[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                int i12 = cancelAll + 45;
                INotificationSideChannel = i12 % 128;
                int i13 = i12 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int iMyUid = Process.myUid();
        int i15 = ~iMyUid;
        int i16 = i14 + (-1144866607) + (((~(151605005 | i15)) | 347344962) * 168) + ((~((-347344963) | iMyUid)) * 168) + (((~(iMyUid | 498949967)) | (~(i15 | (-364207432))) | 16862469) * 168);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr14[3])[0] = i18 ^ (i18 << 5);
        int i19 = INotificationSideChannel + 75;
        int i20 = i19 % 128;
        cancelAll = i20;
        int i21 = i19 % 2;
        int i22 = i20 + 27;
        INotificationSideChannel = i22 % 128;
        int i23 = i22 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int iIndexOf = TextUtils.indexOf("", "") + 1031;
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
            byte b6 = $$a[7];
            Object[] objArr15 = new Object[1];
            e((short) 121, b6, b6, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel, iIndexOf, iCombineMeasuredStates, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        c(new char[]{7319, 7414, 1427, 10153, 1555, 18176, 4928, 5596, 14305, 22292, 8209, 19640, 904, 9534, 1907, 26577, 13254, 13686, 5985, 30255, 8730, 17566, 26305, 1661, 21100, 21758}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        c(new char[]{Typography.plusMinus, 212, 41312, 62242, 41698, 26733, 3962, 45345, 58223, 30727, 62623, 25559, 8100, 33245, 54207, 18585, 12272, 37273, 50174}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
            int iBlue = Color.blue(0) + 15;
            byte b7 = $$a[7];
            Object[] objArr18 = new Object[1];
            e((short) 210, b7, b7, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, keyRepeatTimeout, iBlue, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int mode = View.MeasureSpec.getMode(0) + 1031;
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                Object[] objArr19 = new Object[1];
                e((short) 69, (byte) 14, (byte) 52, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, mode, iIndexOf2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr20[3])[0];
            int i25 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i26 = (((1661121899 + (((~((~iUptimeMillis) | (-172163657))) | (~(242181865 | iUptimeMillis))) * (-302))) + ((~((-172163657) | iUptimeMillis)) * (-604))) + (((~(iUptimeMillis | 70018209)) | 67919905) * 302)) - 1905564058;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[2])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            c(new char[]{12486, 12460, 13993, 62328, 13606, 59356, 16208, 9964, 58151, 63387, 62674, 60535, 12241, 5718, 54221, 50996, 8093, 1604, 50099, 55016}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            c(new char[]{39225, 39248, 62817, 21083, 63211, 50804, 38645, 58660, 16898, 54827, 21986, 52688, 34305, 54740, 29405, 59010, 46674, 50578, 25218, 63303}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, webViewIctActivity)).intValue();
            Object[] objArr23 = {1105494792};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - TextUtils.indexOf("", "")), View.MeasureSpec.getMode(0) + 1134, Color.green(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1905564058, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i29 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte b8 = $$a[7];
                Object[] objArr25 = new Object[1];
                e((short) 121, b8, b8, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(mirror, maximumFlingVelocity, i29, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1117 - (Process.myTid() >> 22), 17 - (ViewConfiguration.getTapTimeout() >> 16)), Boolean.TYPE});
            }
            Object[] objArr26 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 16;
                Object[] objArr27 = new Object[1];
                e((short) 69, (byte) 14, (byte) 52, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, edgeSlop, iIndexOf3, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr26);
            try {
                Object[] objArr28 = new Object[1];
                c(new char[]{7319, 7414, 1427, 10153, 1555, 18176, 4928, 5596, 14305, 22292, 8209, 19640, 904, 9534, 1907, 26577, 13254, 13686, 5985, 30255, 8730, 17566, 26305, 1661, 21100, 21758}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_bank_description_bni).substring(1, 3).codePointAt(1) - 121, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                c(new char[]{Typography.plusMinus, 212, 41312, 62242, 41698, 26733, 3962, 45345, 58223, 30727, 62623, 25559, 8100, 33245, 54207, 18585, 12272, 37273, 50174}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 1031;
                    int mode2 = View.MeasureSpec.getMode(0) + 15;
                    byte b9 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    e((short) 210, b9, b9, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf2, deadChar, mode2, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
                    byte b10 = $$a[7];
                    Object[] objArr31 = new Object[1];
                    e((short) 121, b10, b10, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cAxisFromString, iIndexOf4, keyRepeatTimeout2, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArr26;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArr2[1])[0];
        int i31 = ((int[]) objArr2[3])[0];
        if (i31 == i30) {
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i32 = ((int[]) objArr2[2])[0];
            int i33 = ((int[]) objArr2[3])[0];
            int i34 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int i35 = ~new Random().nextInt();
            int i36 = ~(496722916 | i35);
            int i37 = i32 + 968926721 + ((i36 | (-252442747)) * 764) + (((~(i35 | (-252442747))) | 218849376) * (-1528)) + (((-311466911) | i36) * 764);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr32[2])[0] = i39 ^ (i39 << 5);
            int i40 = INotificationSideChannel + 25;
            cancelAll = i40 % 128;
            int i41 = i40 % 2;
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            int i42 = INotificationSideChannel + 123;
            cancelAll = i42 % 128;
            int i43 = i42 % 2 == 0 ? 1 : 0;
            while (i43 < strArr4.length) {
                int i44 = INotificationSideChannel + 13;
                cancelAll = i44 % 128;
                if (i44 % 2 == 0) {
                    arrayList2.add(strArr4[i43]);
                    i43 += 96;
                } else {
                    arrayList2.add(strArr4[i43]);
                    i43++;
                }
            }
        }
        Toast.makeText((Context) null, i31 / (((i31 - 1) * i31) % 2), 0).show();
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i45 = ((int[]) objArr2[2])[0];
        int i46 = ((int[]) objArr2[3])[0];
        int i47 = ((int[]) objArr2[1])[0];
        String[] strArr5 = (String[]) objArr2[0];
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i48 = ~startUptimeMillis;
        int i49 = ~((-474966443) | i48);
        int i50 = ~(230686272 | startUptimeMillis);
        int i51 = i45 + 1517103762 + ((i49 | i50) * 1150) + (((~((-230686273) | i48)) | i50) * (-575)) + (((~(startUptimeMillis | (-474966443))) | (~(i48 | 474966442))) * 575);
        int i52 = (i51 << 13) ^ i51;
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr33[2])[0] = i53 ^ (i53 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 97;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~(991995905 | iIdentityHashCode);
            int i5 = ~iIdentityHashCode;
            int i6 = i4 | (~(162008362 | i5));
            int i7 = ~((-991995906) | i5);
            if (i3 != 704264312 + ((i6 | i7) * (-516)) + (((~(iIdentityHashCode | (-8914219))) | (~((-153094145) | i5))) * 516) + ((153094144 | i7) * 516)) {
                throw null;
            }
        } else {
            int i8 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.error_message_invalid_input_telkomsel).substring(0, 6).length() + 3156710;
            if (i8 != (((-1134047304) + (((~length) | 1053193) * 1324)) + (((~(length | (-1036905717))) | (~(206918173 | length))) * (-1324))) - 1090367772) {
                throw null;
            }
        }
        int i9 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i9 != (((~(iIdentityHashCode2 | (-1720474129))) * TypedValues.CycleType.TYPE_EASING) - 269050808) + (((~((~iIdentityHashCode2) | (-1720474129))) | 4293997) * TypedValues.CycleType.TYPE_EASING)) {
            int i10 = 848563352 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i11 = cancelAll + 59;
        INotificationSideChannel = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 91;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        int i6 = (~((-448666526) | i5)) | 310905225;
        int i7 = ~(iIdentityHashCode | (-1140892769));
        if (i4 != 625612750 + ((i6 | i7) * (-502)) + ((i7 | (~(i5 | (-137761301)))) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            throw null;
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i10 = ~i9;
        if (i8 != 1716961852 + ((~(285582145 | i10)) * (-560)) + ((~(i9 | 2001600485)) * (-560)) + (((~((-2001493477) | i10)) | 285475136) * 560)) {
            int i11 = 1837139574 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i12 = cancelAll + 25;
        INotificationSideChannel = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebViewIctActivity webViewIctActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(webViewIctActivity);
        int i2 = cancelAll + 85;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        return outputformattoaudioprofile;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = cancelAll + 59;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = cancelAll + 35;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static /* synthetic */ Unit b(WebViewIctActivity webViewIctActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = cancelAll + 1;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
            if (!bool.booleanValue()) {
                WebViewIctActivity webViewIctActivity2 = webViewIctActivity;
                String string = webViewIctActivity.getString(com.bpjstku.R.string.message_storage_permission_required);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AutoValue_LifecycleCameraRepository_Key.b(webViewIctActivity2, string);
                int i4 = cancelAll + 97;
                INotificationSideChannel = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (!bool.booleanValue()) {
            WebViewIctActivity webViewIctActivity3 = webViewIctActivity;
            String string2 = webViewIctActivity.getString(com.bpjstku.R.string.message_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            AutoValue_LifecycleCameraRepository_Key.b(webViewIctActivity3, string2);
            int i6 = cancelAll + 97;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewIctActivity webViewIctActivity, ActivityWebViewIctBinding activityWebViewIctBinding, String str, String str2, String str3) {
        int i = 2 % 2;
        Intrinsics.checkNotNull(str);
        if (StringsKt.startsWith$default(str, "data:", false, 2, (Object) null)) {
            int i2 = INotificationSideChannel + 87;
            cancelAll = i2 % 128;
            if (i2 % 2 != 0) {
                webViewIctActivity.TuitionPaymentFragmentbindingInflater1(str);
                return;
            } else {
                webViewIctActivity.TuitionPaymentFragmentbindingInflater1(str);
                throw null;
            }
        }
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) ".pdf", false, 2, (Object) null)) {
            activityWebViewIctBinding.browser.loadUrl(OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentbindingInflater1(str, str3), webViewIctActivity.g);
            int i3 = INotificationSideChannel + 59;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setMimeType(str3);
        request.addRequestHeader("User-Agent", str2);
        request.setDescription("Downloading PDF");
        request.setTitle("PDF Download");
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        Object systemService = webViewIctActivity.getSystemService("download");
        Intrinsics.checkNotNull(systemService, "");
        ((DownloadManager) systemService).enqueue(request);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 33;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static {
        byte[] bArr = new byte[539];
        System.arraycopy("Z.q\b\u0002ñ\"ñí\u000bû\u0007\u0014ßû\r\u0007AÐß\fõ\u000bú\u0001\u001eïè\f\b÷ú.Ô\u0011úú\b÷ú\u0012ùû\nûû\u0007\u001eÛ\bú\u000bí\u000fóAö/Ò\u0011ê\u0012ó\u001fç\u0003\u0005ÿ$Ó\u0005ü\fí\u000bú\u0001)×\rÿö\u0007\u0001ß\fõ\u000bú\u0001\u001eïè\f\b÷ú.Ô\u0011úú\b÷ú\u0001\u0003\u000b\u0002ú\bõ\u0003û\u0002\u0003û\t\u0001î\r\u0004î*Þ\u000bÿù\bÿÿ\u0005ì\tøCô\u0002?Çø\u0000\bû\u00077Èý÷\r\u0003\u0001î\u000e7Á\bò\u0000\u0012úþû\u00079Ûë\u0007ï\r\u0001\u0014Þ\rÿ\u0001ó\r÷\u000bþò\"Ü\u0010ð\u0010ó\nò\u0003\u0006\u00056»þ\u0005\u0000\u0001ýþF¸B\u0006Á\b\u0001û\b3»\u000eò\u0000\nú\u0001@áè\u0001û\b\u001eÔ\u0001ú\u0002\u0003\u0003\u0000\u0007ó/Ô\u0002ý\u000fíPÐâ\u0011óû\u0003\u0001ýþ1Ô\u0001ú\u0002\u0003\u0003ù2Ñ\u00077\u0001ô\u0002?Çø\u0000\bû\u00077Íó\nò\u0003\u0006\u00056ÇúúEÅûú\u000fó\u0004\rõ>Á\u0001\u0001\u0002õ\u0015üô\u0002\u0000þ\u0001@´\u0000\f\fß\fõ\u000bú\u0001\u001eïè\f\b÷ú.Ô\u0011úú\b÷ú\u0001\u0003\u000b\u0002ú\bõ\u0003û\u0002\u0003û\t\u0001î\r\u0004î*Þ\u000bÿù\bÿÿ\u0005ì\tøAô\u0002?Ìò\u0006÷ÿ\töGÊ\u0003í\u00133¾þ\u0003\u0002þAÞÞ\u0003\u0002þ+ãí\u0013\u000eß\u0005ý\rA\u0000ßÍ\u0004\u000fó\u0004\rõ\u0019Ú\u000bú\f\u0003ñ\u000b\u0006\u0017ëô\u000bþ\u00030\u0001ô\u0002?Ìò\u0006÷ÿ\töG¾þ\rò\u000e÷ú\u0013í\u000bú\u0001@Íî\nþ=Íþï\u000bó\u00117íÎ\nþ*Þï\u000bó\u0011\u0015ïïþ\u000b\u0006úù\u000fóú'èø\u000býóÿ\u000bÿù,ãí\u0013\u001bÔ\u0011úú\b÷úP±\u0003\u000b\u0002ú\bõH\u0000»û\u0002\u0003û\t\u0001@»û\u0004\u0005\u0002ïPÀÿÿ\u0005ì\tøPò".getBytes("ISO-8859-1"), 0, bArr, 0, 539);
        $$g = bArr;
        $$h = 172;
        $$a = new byte[]{77, -106, 83, 4, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$b = 137;
        onTransact = 0;
        getInterfaceDescriptor = 1;
        INotificationSideChannel = 0;
        cancelAll = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = getInterfaceDescriptor + 87;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ ValueCallback b(WebViewIctActivity webViewIctActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (ValueCallback) TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{webViewIctActivity}, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 362523748, -362523745, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewIctActivity webViewIctActivity, ValueCallback valueCallback) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{webViewIctActivity, valueCallback}, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -482005522, 482005524, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingAppCompatActivity
    public final Function1<LayoutInflater, ActivityWebViewIctBinding> TuitionPaymentFragmentbindingInflater1() {
        int iCodePointAt = 408275547 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.instruction_alto7).substring(16, 17).codePointAt(0);
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this}, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iCodePointAt, -360509240, 360509241, OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 13;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = cancelAll + 121;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iCodePointAt = 422227434 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this, context}, (-821292883) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bni_internet_instruction_4).substring(6, 7).length(), iCodePointAt, -460440572, 460440572, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        notify = 116081850064693640L;
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
    private static java.lang.String $$i(byte r6, short r7, int r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 107
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r0 = com.bpjstku.presentation.ict.WebViewIctActivity.$$c
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.ict.WebViewIctActivity.$$i(byte, short, int):java.lang.String");
    }
}
