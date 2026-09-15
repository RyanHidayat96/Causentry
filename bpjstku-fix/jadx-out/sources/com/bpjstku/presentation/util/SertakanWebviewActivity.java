package com.bpjstku.presentation.util;

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
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.net.MailTo;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.registration.bpu.model.request.GetDataSertakanDonaturWebviewRequest;
import com.bpjstku.data.registration.bpu.model.response.GetDataSertakanDonaturResponse;
import com.bpjstku.databinding.ActivitySertakanWebviewBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$2;
import com.bpjstku.presentation.util.SertakanWebviewActivity;
import com.bpjstku.util.constant.ProgramType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CoordinateTransform;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionProcessor;
import defpackage.TargetAspectRatio;
import defpackage.VideoEncoderSessionVideoEncoderState;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.acquireBuffer;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getImeOptions;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.setInputConfiguration;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Map;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J-\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0006\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0004R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\n8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0015\u0010\u0018\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\"R\u0015\u0010\u0011\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0015\u0010\u0012\u001a\u00020$8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\"R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010'R\u0014\u0010)\u001a\u00020\u00078UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010("}, d2 = {"Lcom/bpjstku/presentation/util/SertakanWebviewActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySertakanWebviewBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "p0", "", "", "p1", "", "p2", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "b", "a", "asInterface", "(Ljava/lang/String;)Ljava/lang/String;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Z", "TuitionPaymentFragmentbindingInflater1", "asBinder", "Landroid/content/Context;", "Landroid/content/Context;", "I", "g", "Ljava/lang/String;", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "LacquireBuffer;", "Lkotlin/Lazy;", "LgetImeOptions;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "()I", "INotificationSideChannel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SertakanWebviewActivity extends BindingBaseActivity<ActivitySertakanWebviewBinding> {
    private static char INotificationSideChannel;
    private static int INotificationSideChannelDefault;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancelAll;
    private static long onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public Context TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {114, -115, 48, 84};
    private static final int $$f = 40;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {83, -44, 103, 46, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 17, -5, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 21, -4, -2, 13, -2, -2, 10, 33, -34, 11, -3, 14, -16, 18, -10, 68};
    private static final int $$k = 183;
    private static final byte[] $$a = {57, -50, -56, -93, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 59;
    private static int RemoteActionCompatParcelizer = 0;
    private static int cancel = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int b = 11;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String d = "";

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = (~(i7 | i)) | (~(i7 | i8));
        int i10 = ~i;
        int i11 = (~(i2 | i10 | i4)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i + i4 + i6 + ((-1228711472) * i5) + ((-141981132) * i3);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i) - 2072313856) + (1118068377 * i4) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i6) + ((-287309824) * i5) + ((-1573388288) * i3) + ((-2138374144) * i14);
        int i16 = ((i * (-646461497)) - 273503129) + (i4 * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i6 * (-646461009)) + (i5 * 1623110960) + (i3 * (-2035004020)) + (i14 * 33882112);
        int i17 = i15 + (i16 * i16 * (-1051394048));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return i17 != 4 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        int i18 = 2 % 2;
        int i19 = cancel + 19;
        notify = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r9 = 103 - r9
            byte[] r0 = com.bpjstku.presentation.util.SertakanWebviewActivity.$$a
            int r8 = 53 - r8
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
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.SertakanWebviewActivity.c(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.presentation.util.SertakanWebviewActivity.$$j
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r5 = r5 * 11
            int r1 = r5 + 38
            byte[] r1 = new byte[r1]
            int r5 = r5 + 37
            r2 = -1
            if (r0 != 0) goto L16
            r3 = r2
            r2 = r6
            goto L31
        L16:
            r4 = r7
            r7 = r6
            r6 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            int r7 = r7 + 1
            if (r2 != r5) goto L2b
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L2b:
            r3 = r0[r7]
            r4 = r2
            r2 = r7
            r7 = r3
            r3 = r4
        L31:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + 3
            r7 = r2
            r2 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.SertakanWebviewActivity.f(short, int, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.util.SertakanWebviewActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/bpjstku/presentation/util/SertakanWebviewActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, String str, String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, SertakanWebviewActivity.class, new Pair[]{TuplesKt.to("url_sertakan", str), TuplesKt.to("toolbar_title_sertakan", str2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SertakanWebviewActivity() {
        final SertakanWebviewActivity sertakanWebviewActivity = this;
        this.asBinder = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.util.SertakanWebviewActivity$special$$inlined$inject$default$1
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {111, 40, 23, -13, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 144;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = -3639221432510371442L;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void b(short r5, byte r6, int r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.bpjstku.presentation.util.SertakanWebviewActivity$special$$inlined$inject$default$1.$$a
                    int r5 = 144 - r5
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    int r1 = r7 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r7
                    r4 = r2
                    goto L26
                L12:
                    r3 = r2
                L13:
                    byte r4 = (byte) r6
                    int r5 = r5 + 1
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L24:
                    r3 = r0[r5]
                L26:
                    int r3 = -r3
                    int r6 = r6 + r3
                    int r6 = r6 + (-11)
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.SertakanWebviewActivity$special$$inlined$inject$default$1.b(short, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ZoomGestureDetectorZoomEvent koin;
                int i = 2 % 2;
                int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i3 = i2 + 25;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                ComponentCallbacks componentCallbacks = sertakanWebviewActivity;
                mapPoint mappoint = this.$qualifier;
                Function0<CoordinateTransform> function0 = this.$parameters;
                if (componentCallbacks instanceof getEventTime) {
                    int i5 = i2 + 119;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        ((getEventTime) componentCallbacks).getKoin();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    koin = ((getEventTime) componentCallbacks).getKoin();
                } else {
                    koin = ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
                }
                return koin.b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), mappoint, function0);
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                int i3 = $10 + 123;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i5 = $10 + 51;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - TextUtils.getOffsetAfter("", 0)), 2624 - (KeyEvent.getMaxKeyCode() >> 16), 13 - (Process.myTid() >> 22), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (Process.myTid() >> 22)), 481 - ((Process.getThreadPriority(0) + 20) >> 6), (Process.myPid() >> 22) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                int i8 = $11 + 83;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i10 = $10 + 69;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - Color.alpha(0)), 481 - (ViewConfiguration.getLongPressTimeout() >> 16), 38 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r33, int r34, int r35, int r36) {
                /*
                    Method dump skipped, instruction units count: 1961
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.SertakanWebviewActivity$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context, int, int, int):java.lang.Object[]");
            }
        });
        final SertakanWebviewActivity sertakanWebviewActivity2 = this;
        this.a = LazyKt.lazy(new Function0<getImeOptions>() { // from class: com.bpjstku.presentation.util.SertakanWebviewActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getImeOptions] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getImeOptions invoke() {
                LifecycleOwner lifecycleOwner = sertakanWebviewActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getImeOptions.class);
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
        this.asInterface = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.util.SertakanWebviewActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = sertakanWebviewActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ ActivitySertakanWebviewBinding TuitionPaymentFragmentbindingInflater1(SertakanWebviewActivity sertakanWebviewActivity) {
        ActivitySertakanWebviewBinding activitySertakanWebviewBinding;
        int i = 2 % 2;
        int i2 = cancel + 19;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            activitySertakanWebviewBinding = (ActivitySertakanWebviewBinding) ((ViewBinding) sertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            int i3 = 44 / 0;
        } else {
            activitySertakanWebviewBinding = (ActivitySertakanWebviewBinding) ((ViewBinding) sertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        }
        int i4 = notify + 27;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return activitySertakanWebviewBinding;
    }

    public static final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(SertakanWebviewActivity sertakanWebviewActivity, String str) {
        int i = 2 % 2;
        int i2 = cancel + 105;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            int iTuitionPaymentFragmentbindingInflater1 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
            int iTuitionPaymentFragmentbindingInflater2 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
            ((Boolean) b(429997784, iTuitionPaymentFragmentbindingInflater1, new Object[]{sertakanWebviewActivity, str}, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), -429997784, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentbindingInflater2)).booleanValue();
            throw null;
        }
        int iTuitionPaymentFragmentbindingInflater3 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater4 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        boolean zBooleanValue = ((Boolean) b(429997784, iTuitionPaymentFragmentbindingInflater3, new Object[]{sertakanWebviewActivity, str}, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), -429997784, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentbindingInflater4)).booleanValue();
        int i3 = cancel + 125;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return zBooleanValue;
    }

    public static final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault1(SertakanWebviewActivity sertakanWebviewActivity) {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 79;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = sertakanWebviewActivity.b;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i2 + 43;
        cancel = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 76 / 0;
        }
        return i5;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SertakanWebviewActivity sertakanWebviewActivity, int i) {
        int i2 = 2 % 2;
        int i3 = cancel + 21;
        notify = i3 % 128;
        int i4 = i3 % 2;
        MapsKt.mapOf(TuplesKt.to(-4, "User authentication failed on server"), TuplesKt.to(-8, "The server is taking too much time to communicate. Try again later."), TuplesKt.to(-15, "Too many requests during this load"), TuplesKt.to(-1, "Generic error"), TuplesKt.to(-12, "Check entered URL.."), TuplesKt.to(-6, "Error timeout.."), TuplesKt.to(-11, "Failed to perform SSL handshake"), TuplesKt.to(-2, "Server or proxy hostname lookup failed"), TuplesKt.to(-5, "User authentication failed on proxy"), TuplesKt.to(-9, "Too many redirects"), TuplesKt.to(-3, "Unsupported authentication scheme (not basic or digest)"), TuplesKt.to(-10, "unsupported scheme"), TuplesKt.to(-13, "Generic file error"), TuplesKt.to(-14, "File not found"), TuplesKt.to(-7, "The server failed to communicate. Try again later."));
        if (i == -2) {
            int i5 = notify + 35;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            ((ActivitySertakanWebviewBinding) ((ViewBinding) sertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl("about:blank");
            ((ActivitySertakanWebviewBinding) ((ViewBinding) sertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(8);
            ((ActivitySertakanWebviewBinding) ((ViewBinding) sertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerError.setVisibility(0);
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancel + 85;
        notify = i2 % 128;
        int i3 = i2 % 2;
        SertakanWebviewActivity$bindingInflater$1 sertakanWebviewActivity$bindingInflater$1 = SertakanWebviewActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = notify + 43;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return sertakanWebviewActivity$bindingInflater$1;
        }
        throw null;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (Process.myTid() >> 22)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1235, 34 - TextUtils.lastIndexOf("", '0', 0, 0), -653973969, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0') + 2765, 14 - (ViewConfiguration.getTouchSlop() >> 8), 1504416861, false, $$i(b3, b4, (byte) (b4 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Color.alpha(0)), 253 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.myPid() >> 22) + 65200), View.MeasureSpec.getMode(0) + 2891, 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2012627446, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (onTransact ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) cancelAll) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) INotificationSideChannel) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i5 = $10 + 15;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        super.onRequestPermissionsResult(p0, p1, p2);
        if (p0 == this.b) {
            int i2 = cancel;
            int i3 = i2 + 61;
            notify = i3 % 128;
            int i4 = i3 % 2;
            if (p2.length == 0) {
                return;
            }
            int i5 = i2 + 31;
            notify = i5 % 128;
            int i6 = i5 % 2;
            int length = p2.length;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = notify + 79;
                cancel = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = p2[i7];
                    throw null;
                }
                if (p2[i7] == -1) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                    Toast.makeText((Context) null, "Permission Denied. This app will not work with right permission.", 1).show();
                    return;
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends WebViewClient {
        private /* synthetic */ ActivitySertakanWebviewBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivitySertakanWebviewBinding activitySertakanWebviewBinding) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = activitySertakanWebviewBinding;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            SertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SertakanWebviewActivity.this, i);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            SertakanWebviewActivity sertakanWebviewActivity = SertakanWebviewActivity.this;
            Intrinsics.checkNotNull(webResourceError);
            SertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sertakanWebviewActivity, webResourceError.getErrorCode());
        }

        @Override // android.webkit.WebViewClient
        @Deprecated(message = "Deprecated in Java")
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (SertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(SertakanWebviewActivity.this, str)) {
                return true;
            }
            webView.loadUrl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!SertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(SertakanWebviewActivity.this, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null)) && webView != null) {
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
            ProgressBar progressBar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "");
            if (progressBar.getVisibility() == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.progressBar.setVisibility(8);
            }
            if (webView != null) {
                webView.clearHistory();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0360  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = cancel + 95;
        notify = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra(ImagesContract.URL);
        if (stringExtra == null) {
            int i4 = notify + 87;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = "";
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stringExtra;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iMyTid = 876 - (Process.myTid() >> 22);
            int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b | 52), (byte) (bArr[51] - 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iMyTid, i6, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{46757, 20790, 29724, 17592}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_uob_description_web).substring(1, 3).codePointAt(1) - 121), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{53811, 37508, 7021, 26871, 39222, 47057, 28322, 18032, 49071, 39385, 33470, 15464, 44959, 50495, 2288, 22819, 20967, 34936, 29955, 33093, 14923, 20194}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{17779, 7962, 65534, 38200}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_prima).substring(1, 3).codePointAt(1) + 14470), (KeyEvent.getMaxKeyCode() >> 16) - 31516091, new char[]{12120, 47673, 16921, 55744, 15136, 64931, 35762, 18816, 45696, 14244, 38566, 58652, 64051, 60960, 6975}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
            int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, b2, bArr2[54], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, absoluteGravity, i7, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i8 = notify + 73;
            cancel = i8 % 128;
            int i9 = i8 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iAxisFromString = MotionEvent.axisFromString("") + 877;
                int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr3[184], (byte) 52, bArr3[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, iAxisFromString, windowTouchSlop, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i10 = ~iUptimeMillis;
            int i11 = 755101612 + (((~(iUptimeMillis | 14899295)) | (~((-8591446) | i10)) | (-31718784)) * (-68)) + ((~((-16819489) | i10)) * (-68)) + (((~((-14899296) | i10)) | (-25410934)) * 68) + 593893039;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{18526, 63880, 16194, 17350}, (char) (50799 - AndroidCharacter.getMirror('0')), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, new char[]{1252, 7441, 63237, 32004, 35053, 51672, 10878, 60458, 453, 51344, 40495, 614, 36975, 42893, 45666, 18459, 42054, 33321, 19091, 31451, 44151, 4729, 10652, 13733, 58959, 38568}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{9470, 41940, 46193, 13559}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 63376), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step4).substring(16, 17).codePointAt(0) - 99, new char[]{55756, 36865, 63829, 54370, 13297, 65269, 10810, 36572, 22895, 42477, 5636, 40152, 1274, 38734, 25835, 35267, 39391, 61495}, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i14 = cancel;
                int i15 = i14 + 19;
                notify = i15 % 128;
                int i16 = i15 % 2;
                if (baseContext instanceof ContextWrapper) {
                    int i17 = i14 + 45;
                    notify = i17 % 128;
                    int i18 = i17 % 2;
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
            e(new char[]{0, 0, 0, 0}, new char[]{57416, 39100, 51574, 25472}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 32958), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{10806, 22002, 51047, 50760, 20588, 9052, 64831, 54191, 40349, 34850, 47530, 20915, 62550, 14899, 52552, 33206}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{43580, 1976, 56130, 59071}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.page_title_uobapp).substring(0, 12).length() + 49103), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_paid_orderid).substring(0, 9).length() - 9, new char[]{48927, 2527, 22851, 39466, 62606, 23943, 59829, 51325, 32591, 7209, 24098, 27626, 59137, 17357, 19012, 36940}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i19 = cancel + 103;
            notify = i19 % 128;
            int i20 = i19 % 2;
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(iIntValue), 593893039};
                byte[] bArr4 = $$j;
                byte b3 = bArr4[35];
                byte b4 = b3;
                Object[] objArr13 = new Object[1];
                f(b4, (byte) (-b4), b3, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr4[35];
                byte b6 = (byte) (b5 - 1);
                Object[] objArr14 = new Object[1];
                f(b6, (byte) (b6 | 47), (byte) (b5 - 1), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                        int iAlpha = 876 - Color.alpha(0);
                        int i21 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9;
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        c(bArr5[184], (byte) 52, bArr5[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, iAlpha, i21, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{46757, 20790, 29724, 17592}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), TextUtils.indexOf("", ""), new char[]{53811, 37508, 7021, 26871, 39222, 47057, 28322, 18032, 49071, 39385, 33470, 15464, 44959, 50495, 2288, 22819, 20967, 34936, 29955, 33093, 14923, 20194}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{17779, 7962, 65534, 38200}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step5).substring(37, 38).codePointAt(0) + 14494), (ViewConfiguration.getEdgeSlop() >> 16) - 31516091, new char[]{12120, 47673, 16921, 55744, 15136, 64931, 35762, 18816, 45696, 14244, 38566, 58652, 64051, 60960, 6975}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                            int iResolveSize = 876 - View.resolveSize(0, 0);
                            int iRed = 10 - Color.red(0);
                            byte[] bArr6 = $$a;
                            byte b7 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            c(b7, b7, bArr6[54], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, iResolveSize, iRed, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char gidForName = (char) ((-1) - Process.getGidForName(""));
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                            int iResolveSize2 = View.resolveSize(0, 0) + 10;
                            byte[] bArr7 = $$a;
                            byte b8 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            c(b8, (byte) (b8 | 52), (byte) (bArr7[51] - 1), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName, iResolveSizeAndState, iResolveSize2, 252381699, false, (String) objArr20[0], null);
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
        int i22 = notify + 29;
        cancel = i22 % 128;
        int i23 = i22 % 2;
        int i24 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i25 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i26 = i24 + (-942559356) + (((~((-2228786) | i25)) | 42539014) * (-828)) + ((i25 | (-2228786)) * (-828)) + 1845433980;
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr21[1])[0] = i28 ^ (i28 << 5);
        int i29 = cancel + 15;
        notify = i29 % 128;
        int i30 = i29 % 2;
        Intent intent = getIntent();
        int i31 = ((int[]) objArr21[1])[0];
        int i32 = i31 * i31;
        int i33 = -(651013382 * i31);
        int i34 = (i32 & i33) + (i32 | i33);
        int i35 = -(i31 * (-239764234));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        int i37 = ((i36 | (-810374140)) << 1) - ((-810374140) ^ i36);
        int i38 = i37 >> 15;
        int i39 = (((-262143) ^ i38) + ((i38 & (-262143)) << 1)) / 131072;
        int i40 = (i39 ^ 1) + ((i39 & 1) << 1);
        int i41 = (i37 ^ i40) + ((i40 & i37) << 1);
        int i42 = ((i37 >> 22) - 2047) / 1024;
        int i43 = -(i41 ^ ((i42 ^ 1) + ((i42 & 1) << 1)));
        int i44 = (i43 & 8) + (i43 | 8);
        int i45 = i44 >> 22;
        int i46 = ((i45 & (-2047)) + (i45 | (-2047))) / 1024;
        int i47 = (i46 ^ 1) + ((i46 & 1) << 1);
        String stringExtra2 = intent.getStringExtra("17|24|toolbar_title".substring(70320 / (((-((i47 ^ 1) + ((i47 & 1) << 1))) & i44) * 1465)));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stringExtra2 != null ? stringExtra2 : "";
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((getImeOptions) this.a.getValue()).d.observe(this, new Observer() { // from class: getSessionType
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                SertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancel + 27;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        String str2;
        int i = 2 % 2;
        final ActivitySertakanWebviewBinding activitySertakanWebviewBinding = (ActivitySertakanWebviewBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activitySertakanWebviewBinding.webView.getSettings().setJavaScriptEnabled(true);
        activitySertakanWebviewBinding.webView.getSettings().setLoadWithOverviewMode(true);
        activitySertakanWebviewBinding.webView.getSettings().setUseWideViewPort(true);
        activitySertakanWebviewBinding.webView.getSettings().setDomStorageEnabled(true);
        activitySertakanWebviewBinding.webView.getSettings().setAllowContentAccess(true);
        activitySertakanWebviewBinding.webView.getSettings().setAllowFileAccess(true);
        activitySertakanWebviewBinding.webView.getSettings().setAllowFileAccessFromFileURLs(true);
        activitySertakanWebviewBinding.webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        activitySertakanWebviewBinding.webView.getSettings().setDatabaseEnabled(true);
        activitySertakanWebviewBinding.webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        activitySertakanWebviewBinding.webView.getSettings().setCacheMode(-1);
        activitySertakanWebviewBinding.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        activitySertakanWebviewBinding.webView.getSettings().setBuiltInZoomControls(false);
        activitySertakanWebviewBinding.webView.getSettings().setUseWideViewPort(true);
        activitySertakanWebviewBinding.webView.setDownloadListener(new DownloadListener() { // from class: getSessionParameters
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str3, String str4, String str5, String str6, long j) {
                SertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activitySertakanWebviewBinding, this, str3, str5, str6);
            }
        });
        this.d = activitySertakanWebviewBinding.webView.getSettings().getUserAgentString();
        activitySertakanWebviewBinding.webView.setWebViewClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(activitySertakanWebviewBinding));
        final getImeOptions getimeoptions = (getImeOptions) this.a.getValue();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        Object obj = null;
        String strValueOf = String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder2 != null) {
            int i2 = notify + 99;
            cancel = i2 % 128;
            if (i2 % 2 != 0) {
                String str3 = userAsBinder2.b;
                throw null;
            }
            str = userAsBinder2.b;
        } else {
            int i3 = notify + 125;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            str = null;
        }
        String strValueOf2 = String.valueOf(str);
        User userAsBinder3 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String strValueOf3 = String.valueOf(userAsBinder3 != null ? userAsBinder3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
        User userAsBinder4 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder4 != null) {
            int i5 = cancel + 69;
            notify = i5 % 128;
            if (i5 % 2 == 0) {
                String str4 = userAsBinder4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                obj.hashCode();
                throw null;
            }
            str2 = userAsBinder4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } else {
            str2 = null;
        }
        String strValueOf4 = String.valueOf(str2);
        String str5 = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        sb.append("#");
        GetDataSertakanDonaturWebviewRequest getDataSertakanDonaturWebviewRequest = new GetDataSertakanDonaturWebviewRequest(strValueOf, strValueOf2, strValueOf3, strValueOf4, sb.toString());
        Intrinsics.checkNotNullParameter(getDataSertakanDonaturWebviewRequest, "");
        MutableLiveData<VirtualCameraAdapter1<GetDataSertakanDonaturResponse>> mutableLiveData = getimeoptions.d;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getimeoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getDataSertakanDonaturWebviewRequest)));
        final Function1 function1 = new Function1() { // from class: setOnQueryTextFocusChangeListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return getImeOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getimeoptions, (GetDataSertakanDonaturResponse) obj2);
            }
        };
        logToString logtostring = new logToString() { // from class: setQueryHint
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function1.invoke(obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: setOnQueryTextListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return getImeOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getimeoptions, (Throwable) obj2);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setOnSuggestionListener
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function2.invoke(obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        getimeoptions.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends WebChromeClient {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(PermissionRequest permissionRequest) {
            Intrinsics.checkNotNullParameter(permissionRequest, "");
            if (ContextCompat.checkSelfPermission(SertakanWebviewActivity.this, "android.permission.CAMERA") == 0) {
                permissionRequest.grant(permissionRequest.getResources());
            } else {
                SertakanWebviewActivity sertakanWebviewActivity = SertakanWebviewActivity.this;
                ActivityCompat.requestPermissions(sertakanWebviewActivity, new String[]{"android.permission.CAMERA"}, SertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sertakanWebviewActivity));
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            super.onProgressChanged(webView, i);
            SertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(SertakanWebviewActivity.this).progressBar.setProgress(i);
            if (i < 100 && SertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(SertakanWebviewActivity.this).progressBar.getVisibility() == 8) {
                SertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(SertakanWebviewActivity.this).progressBar.setVisibility(0);
            }
            if (i == 100) {
                SertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(SertakanWebviewActivity.this).progressBar.setVisibility(8);
            }
        }
    }

    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        PendingIntent activity;
        int i = 2 % 2;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String str = p0;
        Intrinsics.checkNotNullExpressionValue(p0.substring(StringsKt.indexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) str, ";", 0, false, 6, (Object) null)), "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("KartuDigital ");
        sb.append(jCurrentTimeMillis);
        sb.append(".png");
        File file = new File(externalStoragePublicDirectory, sb.toString());
        try {
            if (!externalStoragePublicDirectory.exists()) {
                int i2 = cancel + 27;
                notify = i2 % 128;
                if (i2 % 2 == 0) {
                    externalStoragePublicDirectory.mkdirs();
                    int i3 = 35 / 0;
                } else {
                    externalStoragePublicDirectory.mkdirs();
                }
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            String strSubstring = p0.substring(StringsKt.indexOf$default((CharSequence) p0, ",", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArrDecode);
            fileOutputStream.close();
            MediaScannerConnection.scanFile(this, new String[]{file.toString()}, null, new setInputConfiguration());
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
                int i4 = notify + 31;
                cancel = i4 % 128;
                int i5 = i4 % 2;
                activity = PendingIntent.getActivity(this, 0, intent, 201326592);
                int i6 = cancel + 17;
                notify = i6 % 128;
                int i7 = i6 % 2;
            } else {
                activity = PendingIntent.getActivity(this, 0, intent, 1140850688);
            }
            Notification notificationBuild = new NotificationCompat.Builder(this, "bpjstku_channel_id").setSmallIcon(2131231113).setContentText("Kartu Digital Berhasil Diunduh").setContentTitle("Sertakan").setContentIntent(activity).setAutoCancel(true).build();
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
            Toast.makeText(this, "Kartu Digital Berhasil Disimpan", 0).show();
        } catch (IOException unused) {
            Toast.makeText(this, "Gagal Unduh", 0).show();
        }
        return file.toString();
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        SertakanWebviewActivity sertakanWebviewActivity = (SertakanWebviewActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        if (StringsKt.startsWith$default(str, "tel:", false, 2, (Object) null)) {
            sertakanWebviewActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            return true;
        }
        if (StringsKt.startsWith$default(str, MailTo.MAILTO_SCHEME, false, 2, (Object) null)) {
            sertakanWebviewActivity.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)));
            return true;
        }
        if (StringsKt.startsWith$default(str, "https://api.whatsapp.com/", false, 2, (Object) null)) {
            int i2 = notify + 35;
            cancel = i2 % 128;
            if (i2 % 2 != 0) {
                sertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(str);
                return false;
            }
            sertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "https://play.google.com/", false, 2, (Object) null)) {
            int i3 = cancel + 67;
            notify = i3 % 128;
            if (i3 % 2 == 0) {
                sertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(str);
            } else {
                sertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(str);
            }
            return true;
        }
        if (StringsKt.startsWith$default(str, "whatsapp://", false, 2, (Object) null)) {
            sertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "https://app.tanamduit.com/invite/bpjs", false, 2, (Object) null)) {
            int i4 = notify + 45;
            cancel = i4 % 128;
            if (i4 % 2 != 0) {
                sertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(str);
                return true;
            }
            sertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "tokopedia://", false, 2, (Object) null)) {
            sertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "market://", false, 2, (Object) null)) {
            int i5 = cancel + 71;
            notify = i5 % 128;
            int i6 = i5 % 2;
            sertakanWebviewActivity.TuitionPaymentFragmentbindingInflater1(str);
            return true;
        }
        if (StringsKt.startsWith$default(str, "intent://", false, 2, (Object) null)) {
            int i7 = notify + 105;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            try {
                Intent uri = Intent.parseUri(str, 1);
                if (uri.getStringExtra("S.browser_fallback_url") == null) {
                    sertakanWebviewActivity.startActivity(uri);
                }
                return true;
            } catch (URISyntaxException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private final boolean TuitionPaymentFragmentbindingInflater1(String p0) {
        int i = 2 % 2;
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p0)));
            int i2 = cancel + 69;
            notify = i2 % 128;
            int i3 = i2 % 2;
            return true;
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Aplikasi tidak tersedia", 0).show();
            return false;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = cancel + 51;
        notify = i2 % 128;
        int i3 = i2 % 2;
        SertakanWebviewActivity sertakanWebviewActivity = this;
        Intrinsics.checkNotNullParameter(sertakanWebviewActivity, "");
        sertakanWebviewActivity.getWindow().addFlags(8192);
        int i4 = cancel + 17;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
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
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
            int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[184], bArr[7], bArr[54], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, touchSlop, iLastIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{46757, 20790, 29724, 17592}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step4).substring(29, 32).length() - 3, new char[]{53811, 37508, 7021, 26871, 39222, 47057, 28322, 18032, 49071, 39385, 33470, 15464, 44959, 50495, 2288, 22819, 20967, 34936, 29955, 33093, 14923, 20194}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{17779, 7962, 65534, 38200}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima6).substring(8, 9).length() + 14590), (-31516135) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_mobile_instruction_4).substring(17, 19).codePointAt(0), new char[]{12120, 47673, 16921, 55744, 15136, 64931, 35762, 18816, 45696, 14244, 38566, 58652, 64051, 60960, 6975}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0');
            int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr2 = $$a;
            byte b = bArr2[37];
            byte b2 = bArr2[7];
            byte b3 = bArr2[54];
            Object[] objArr5 = new Object[1];
            c(b, b2, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, iIndexOf, packedPositionGroup, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = cancel + 15;
            notify = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i4 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iGreen = 15 - Color.green(0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 52), (byte) (bArr3[51] - 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i4, iGreen, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i7 = (((~(461340575 | elapsedCpuTime)) | 168301313) * 449) + 417044871 + (((~((~elapsedCpuTime) | 461340575)) | 168301313) * 449) + 1001509740;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            int i10 = cancel + 45;
            notify = i10 % 128;
            int i11 = i10 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{57416, 39100, 51574, 25472}, (char) (32970 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 107, new char[]{10806, 22002, 51047, 50760, 20588, 9052, 64831, 54191, 40349, 34850, 47530, 20915, 62550, 14899, 52552, 33206}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{43580, 1976, 56130, 59071}, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49114), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step5).substring(28, 30).length() - 2, new char[]{48927, 2527, 22851, 39466, 62606, 23943, 59829, 51325, 32591, 7209, 24098, 27626, 59137, 17357, 19012, 36940}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {595036281};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 46038), TextUtils.lastIndexOf("", '0', 0) + 1135, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1001509740, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int i12 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                    int iMyPid = 15 - (Process.myPid() >> 22);
                    byte[] bArr4 = $$a;
                    Object[] objArr12 = new Object[1];
                    c(bArr4[184], bArr4[7], bArr4[54], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode, i12, iMyPid, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getDeadChar(0, 0) + 45993), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1117, (ViewConfiguration.getWindowTouchSlop() >> 8) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int gidForName = 1030 - Process.getGidForName("");
                    int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte[] bArr5 = $$a;
                    byte b5 = bArr5[7];
                    Object[] objArr13 = new Object[1];
                    c(b5, (byte) (b5 | 52), (byte) (bArr5[51] - 1), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup2, gidForName, iLastIndexOf2, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{46757, 20790, 29724, 17592}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98, new char[]{53811, 37508, 7021, 26871, 39222, 47057, 28322, 18032, 49071, 39385, 33470, 15464, 44959, 50495, 2288, 22819, 20967, 34936, 29955, 33093, 14923, 20194}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{17779, 7962, 65534, 38200}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay).substring(1, 3).length() + 14589), (-31516092) - ImageFormat.getBitsPerPixel(0), new char[]{12120, 47673, 16921, 55744, 15136, 64931, 35762, 18816, 45696, 14244, 38566, 58652, 64051, 60960, 6975}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                        int iMyTid = 15 - (Process.myTid() >> 22);
                        byte[] bArr6 = $$a;
                        Object[] objArr16 = new Object[1];
                        c(bArr6[37], bArr6[7], bArr6[54], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(absoluteGravity, minimumFlingVelocity, iMyTid, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int iRgb = Color.rgb(0, 0, 0) + 16777231;
                        byte[] bArr7 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(bArr7[184], bArr7[7], bArr7[54], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, iIndexOf2, iRgb, 1357589585, false, (String) objArr17[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode;
            int i19 = i15 + 2049297173 + (((-100668434) | iIdentityHashCode) * (-676)) + (((~(142535662 | i18)) | 100668433) * 676) + (((~(iIdentityHashCode | 243204095)) | (~(i18 | (-101744508))) | 1076074) * 676);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
            int i22 = notify + 35;
            cancel = i22 % 128;
            int i23 = i22 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i24 = notify + 27;
                cancel = i24 % 128;
                int i25 = i24 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i26 = i14 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i26) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i30 = ~((-513128056) | iIdentityHashCode2);
            int i31 = ~iIdentityHashCode2;
            int i32 = i27 + (-1519073007) + ((i30 | (~((-268847886) | i31))) * (-1808)) + (((~((-244429939) | iIdentityHashCode2)) | (~(i31 | (-149769)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode2 | 268847885)) | 268698117 | (~(513128055 | i31))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr19[2])[0] = i34 ^ (i34 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
            int i35 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int size = 23 - View.MeasureSpec.getSize(0);
            byte[] bArr8 = $$a;
            byte b6 = bArr8[14];
            Object[] objArr20 = new Object[1];
            c(b6, (byte) (b6 | 12), bArr8[54], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, i35, size, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cBlue = (char) (29944 - Color.blue(0));
                int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                int iResolveOpacity = 23 - Drawable.resolveOpacity(0, 0);
                byte[] bArr9 = $$a;
                Object[] objArr21 = new Object[1];
                c(bArr9[37], bArr9[7], bArr9[54], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cBlue, offsetBefore, iResolveOpacity, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_card_registration).substring(0, 3).codePointAt(0) + 586658410;
            int i36 = ~iCodePointAt;
            int i37 = 985879221 + (((~(i36 | 138846257)) | (-208137786) | (~((-4464641) | iCodePointAt))) * 717) + (((~(iCodePointAt | 138846257)) | (~(i36 | (-4464641))) | (-208137786)) * 717) + 35192532;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i39 ^ (i39 << 5);
            int i40 = cancel + 81;
            notify = i40 % 128;
            int i41 = i40 % 2;
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{57416, 39100, 51574, 25472}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32933), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step1).substring(1, 2).length() - 1, new char[]{10806, 22002, 51047, 50760, 20588, 9052, 64831, 54191, 40349, 34850, 47530, 20915, 62550, 14899, 52552, 33206}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{43580, 1976, 56130, 59071}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 49079), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{48927, 2527, 22851, 39466, 62606, 23943, 59829, 51325, 32591, 7209, 24098, 27626, 59137, 17357, 19012, 36940}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {595036281};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getTapTimeout() >> 16)), 1726 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 35192532, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 29944);
                int i42 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                byte[] bArr10 = $$a;
                Object[] objArr26 = new Object[1];
                c(bArr10[37], bArr10[7], bArr10[54], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(defaultSize, i42, packedPositionChild, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{46757, 20790, 29724, 17592}, (char) Color.alpha(0), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{53811, 37508, 7021, 26871, 39222, 47057, 28322, 18032, 49071, 39385, 33470, 15464, 44959, 50495, 2288, 22819, 20967, 34936, 29955, 33093, 14923, 20194}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{17779, 7962, 65534, 38200}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 14555), (-31516091) - TextUtils.getOffsetAfter("", 0), new char[]{12120, 47673, 16921, 55744, 15136, 64931, 35762, 18816, 45696, 14244, 38566, 58652, 64051, 60960, 6975}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char longPressTimeout = (char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                    int i43 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                    byte[] bArr11 = $$a;
                    byte b7 = bArr11[7];
                    Object[] objArr29 = new Object[1];
                    c(b7, b7, bArr11[54], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(longPressTimeout, iKeyCodeFromString, i43, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char modifierMetaStateMask2 = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int absoluteGravity2 = 1755 - Gravity.getAbsoluteGravity(0, 0);
                    int iIndexOf3 = 23 - TextUtils.indexOf("", "", 0);
                    byte[] bArr12 = $$a;
                    byte b8 = bArr12[14];
                    Object[] objArr30 = new Object[1];
                    c(b8, (byte) (b8 | 12), bArr12[54], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(modifierMetaStateMask2, absoluteGravity2, iIndexOf3, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] == ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            int i44 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i45 = i44 + 1010136612 + (((~((~iIdentityHashCode3) | 3990556)) | (-209710622)) * 529) + (((~(iIdentityHashCode3 | 3990556)) | (-208611870)) * 529);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr31[3])[0] = i47 ^ (i47 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr5 == null) {
            throw null;
        }
        int i48 = notify + 69;
        cancel = i48 % 128;
        int i49 = i48 % 2 == 0 ? 0 : 1;
        while (i49 < strArr5.length) {
            int i50 = notify + 83;
            cancel = i50 % 128;
            if (i50 % 2 != 0) {
                arrayList2.add(strArr5[i49]);
                i49 += 115;
            } else {
                arrayList2.add(strArr5[i49]);
                i49++;
            }
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        SertakanWebviewActivity sertakanWebviewActivity = (SertakanWebviewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 83;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i4 != 1203004324 + (((~(973367998 | iElapsedRealtime)) | 839131160) * (-502)) + ((~((~iElapsedRealtime) | 982511615)) * (-502)) + (((~(iElapsedRealtime | (-143380456))) | 973367998) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            throw new RuntimeException("-999324257");
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        if (i5 != (-1875576953) + (((~(iNextInt | (-1769086600))) | 53175268) * 191) + (((~((~iNextInt) | (-1769086600))) | 19006084) * 191)) {
            throw new RuntimeException("-142964965");
        }
        super.onResume();
        int i6 = notify + 61;
        cancel = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancel + 77;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 1125317536 + (((~((-923884743) | i5)) | (~(1753872285 | i5))) * (-867)) + (((~((-923884743) | iIdentityHashCode)) | 386926658 | (~(1753872285 | iIdentityHashCode))) * (-1734)) + (((~(iIdentityHashCode | 2140798943)) | (~(i5 | (-386926659))) | (~((-536958085) | iIdentityHashCode))) * 867)) {
            throw null;
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = (int) Runtime.getRuntime().totalMemory();
        int i8 = ~i7;
        if (i6 != (-2088299920) + (((~(i8 | (-1892182540))) | 176271208) * (-1042)) + (((-1892182540) | i7) * 521) + (((~(i7 | (-176271209))) | 167871840 | (~(i8 | (-1883783172)))) * 521)) {
            throw new RuntimeException("1452531387");
        }
        super.onStart();
        int i9 = cancel + 111;
        notify = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a7, code lost:
    
        if (r0 != (((((~(r5 | (-1796290463))) | ((~((-80379132) | r5)) | 13466)) * (-397)) + 287229276) + ((r3 | (-1876642662)) * 397))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a9, code lost:
    
        super.onCreate(r9);
        r9 = com.bpjstku.presentation.util.SertakanWebviewActivity.cancel + 51;
        com.bpjstku.presentation.util.SertakanWebviewActivity.notify = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b5, code lost:
    
        if ((r9 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b9, code lost:
    
        r9 = 828938424 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c2, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c3, code lost:
    
        r9 = 2009985320 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cc, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        if (r3 == (((((~((-689996269) | r5)) | 134217920) * (-283)) - 1501021848) + ((~(r5 | (-555778349))) * 283))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0074, code lost:
    
        if (r3 == ((1770649146 + (((~(1039173554 | r6)) | (~((-209186012) | r5))) * 210)) + (((~(r5 | 1039659003)) | (~(r6 | (-208700563)))) * 210))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0076, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r3 = new java.util.Random().nextInt(1628073650);
        r5 = ~r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[] r9) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.SertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2, String str3, SertakanWebviewActivity sertakanWebviewActivity, VideoEncoderSessionVideoEncoderState videoEncoderSessionVideoEncoderState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(videoEncoderSessionVideoEncoderState, "");
        String strGuessFileName = URLUtil.guessFileName(str, str2, str3);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(strGuessFileName);
        request.setDescription("Downloading file...");
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
        Object systemService = sertakanWebviewActivity.getSystemService("download");
        Intrinsics.checkNotNull(systemService, "");
        try {
            ((DownloadManager) systemService).enqueue(request);
            videoEncoderSessionVideoEncoderState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i2 = notify + 7;
            cancel = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e2) {
            videoEncoderSessionVideoEncoderState.TuitionPaymentFragmentbindingInflater1(e2);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SertakanWebviewActivity sertakanWebviewActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            sertakanWebviewActivity.MediaBrowserCompat();
            str = "loading_get_data";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            sertakanWebviewActivity.IconCompatParcelizer();
            sertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = String.valueOf(((GetDataSertakanDonaturResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData().getUrlSertakan());
            sertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "Sertakan";
            ((ActivitySertakanWebviewBinding) ((ViewBinding) sertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setWebChromeClient(sertakanWebviewActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            String str2 = sertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            }
            ((ActivitySertakanWebviewBinding) ((ViewBinding) sertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl(str2);
            str = "success_login_result";
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i2 = notify + 75;
                cancel = i2 % 128;
                if (i2 % 2 != 0) {
                    sertakanWebviewActivity.IconCompatParcelizer();
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 1).show();
                } else {
                    sertakanWebviewActivity.IconCompatParcelizer();
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
                }
                int i3 = notify + 119;
                cancel = i3 % 128;
                int i4 = i3 % 2;
            }
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_login_result", str));
        Intrinsics.checkNotNullParameter(sertakanWebviewActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(SertakanWebviewActivity sertakanWebviewActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = notify + 87;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            Toast.makeText(sertakanWebviewActivity, "Error downloading file: ".concat(String.valueOf(th.getMessage())), 1).show();
            th.printStackTrace();
            return Unit.INSTANCE;
        }
        Toast.makeText(sertakanWebviewActivity, "Error downloading file: ".concat(String.valueOf(th.getMessage())), 0).show();
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = notify + 23;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = notify + 51;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r7, "data:", false, 2, (java.lang.Object) null) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r5 = defpackage.VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(new defpackage.SessionConfigurationCompatSessionConfigurationCompatApi28Impl(r7, r8, r9, r6));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r8 = defpackage.isSamsungJ2.b();
        defpackage.share.b(r8, "scheduler is null");
        r0 = new io.reactivex.internal.operators.completable.CompletableSubscribeOn(r5, r8);
        r5 = defpackage.dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
        defpackage.share.b(r5, "scheduler is null");
        r8 = new io.reactivex.internal.operators.completable.CompletableObserveOn(r0, r5);
        r5 = new defpackage.transformFromCompat(r6);
        r9 = new defpackage.transformToCompat(r6);
        r5 = r8.b(r5, new defpackage.SessionConfigurationCompat(r9));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        ((defpackage.acquireBuffer) r6.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r7, "blob:", false, 5, (java.lang.Object) null) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r7, "blob:", false, 2, (java.lang.Object) null) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r6 = com.bpjstku.presentation.util.SertakanWebviewActivity.notify + 47;
        com.bpjstku.presentation.util.SertakanWebviewActivity.cancel = r6 % 128;
        r6 = r6 % 2;
        r5.webView.loadUrl(defpackage.OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentbindingInflater1(r7, r9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.databinding.ActivitySertakanWebviewBinding r5, final com.bpjstku.presentation.util.SertakanWebviewActivity r6, final java.lang.String r7, final java.lang.String r8, final java.lang.String r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.util.SertakanWebviewActivity.notify
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.bpjstku.presentation.util.SertakanWebviewActivity.cancel = r2
            int r1 = r1 % r0
            java.lang.String r2 = "blob:"
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L1d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r1 = 5
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r7, r2, r4, r1, r3)
            if (r1 == 0) goto L39
            goto L26
        L1d:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r7, r2, r4, r0, r3)
            if (r1 == 0) goto L39
        L26:
            int r6 = com.bpjstku.presentation.util.SertakanWebviewActivity.notify
            int r6 = r6 + 47
            int r8 = r6 % 128
            com.bpjstku.presentation.util.SertakanWebviewActivity.cancel = r8
            int r6 = r6 % r0
            android.webkit.WebView r5 = r5.webView
            java.lang.String r6 = defpackage.OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentbindingInflater1(r7, r9)
            r5.loadUrl(r6)
            return
        L39:
            java.lang.String r5 = "data:"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r7, r5, r4, r0, r3)
            if (r5 == 0) goto L45
            r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r7)
            return
        L45:
            SessionConfigurationCompatSessionConfigurationCompatApi28Impl r5 = new SessionConfigurationCompatSessionConfigurationCompatApi28Impl
            r5.<init>()
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
            transformFromCompat r5 = new transformFromCompat
            r5.<init>()
            transformToCompat r9 = new transformToCompat
            r9.<init>()
            SessionConfigurationCompat r0 = new SessionConfigurationCompat
            r0.<init>()
            BufferProviderState r5 = r8.b(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            kotlin.Lazy r6 = r6.asBinder
            java.lang.Object r6 = r6.getValue()
            acquireBuffer r6 = (defpackage.acquireBuffer) r6
            r6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.SertakanWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.databinding.ActivitySertakanWebviewBinding, com.bpjstku.presentation.util.SertakanWebviewActivity, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SertakanWebviewActivity sertakanWebviewActivity) {
        int i = 2 % 2;
        int i2 = cancel + 105;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Toast.makeText(sertakanWebviewActivity, "Download completed", 0).show();
        int i4 = notify + 121;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void g() {
        int i = 2 % 2;
        int i2 = cancel + 97;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        INotificationSideChannelDefault = 1;
        cancelAll();
        INSTANCE = new Companion(null);
        int i = RemoteActionCompatParcelizer + 25;
        INotificationSideChannelDefault = i % 128;
        int i2 = i % 2;
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        int iTuitionPaymentFragmentbindingInflater1 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        return ((Boolean) b(429997784, iTuitionPaymentFragmentbindingInflater1, new Object[]{this, p0}, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), -429997784, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentbindingInflater2)).booleanValue();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySertakanWebviewBinding> TuitionPaymentFragmentbindingInflater1() {
        return (Function1) b(1111313614, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1111313610, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1608063826);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancel + 63;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_sertakan_webview;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iCodePointAt = (-852316568) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_bni).substring(14, 15).codePointAt(0);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(946950084, iCodePointAt, new Object[]{this}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -946950082, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iTuitionPaymentFragmentbindingInflater1 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(-1352399837, iTuitionPaymentFragmentbindingInflater1, new Object[]{this, bundle}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1352399838, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentbindingInflater1 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(-652235890, iTuitionPaymentFragmentbindingInflater1, new Object[]{this}, (-1070937175) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), 652235893, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 73;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    static void cancelAll() {
        onTransact = -6377398940819159759L;
        cancelAll = -981105359;
        INotificationSideChannel = (char) 31126;
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
    private static java.lang.String $$i(int r6, int r7, int r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.util.SertakanWebviewActivity.$$c
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r8 = r8 + 102
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.SertakanWebviewActivity.$$i(int, int, int):java.lang.String");
    }
}
