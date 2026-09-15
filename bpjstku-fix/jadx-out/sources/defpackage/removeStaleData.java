package defpackage;

import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.configuration.VitalsUpdateFrequency;
import com.datadog.android.rum.internal.RumFeature$1;
import com.datadog.android.rum.internal.RumFeature$handleMapLikeEvent$2;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.google.gson.JsonObject;
import defpackage.ImageAnalysisBlockingAnalyzer;
import defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
import defpackage.ResolutionInfo;
import defpackage.getCameraCaptureCallback;
import defpackage.getSurfaceAspectRatio;
import defpackage.getY;
import defpackage.truncateTag;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0002\u001a\u001dB5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0018\u001a\u00020\u00158\u0001@\u0001X\u0081,¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0014\u0010#\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010&\u001a\u00020(8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010+\u001a\u00020.8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b-\u0010/R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u0017008\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u000204038\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00105\u001a\u00020.8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b7\u0010/R\u0014\u00107\u001a\u0002088\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b;\u0010<R\u0015\u0010;\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b>\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020C8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b=\u0010DR\u0016\u0010F\u001a\u00020.8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bB\u0010/R\u001a\u0010I\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\bG\u0010'\u001a\u0004\b\u001d\u0010HR\u001b\u0010M\u001a\u00020J8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\b#\u0010LR\u0016\u0010P\u001a\u00020N8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bF\u0010OR\u0014\u0010R\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010QR\u0016\u0010U\u001a\u00020S8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bI\u0010TR\u001a\u0010 \u001a\u00020V8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b\u0013\u0010YR\u0016\u0010Z\u001a\u00020N8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bM\u0010OR\u0016\u0010[\u001a\u00020N8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bP\u0010OR\u0016\u0010@\u001a\u00020(8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bU\u0010*R\u0016\u0010>\u001a\u00020\\8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bR\u0010]R\u0016\u00109\u001a\u00020^8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b[\u0010_"}, d2 = {"LremoveStaleData;", "LImageAnalysisAbstractAnalyzerExternalSyntheticLambda0;", "LsetRelativeRotation;", "LImageAnalysisBlockingAnalyzer;", "p0", "", "p1", "LremoveStaleData$TuitionPaymentFragmentbindingInflater1;", "p2", "Lkotlin/Function1;", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "LgetCameraCaptureCallback;", "p3", "<init>", "(LImageAnalysisBlockingAnalyzer;Ljava/lang/String;LremoveStaleData$TuitionPaymentFragmentbindingInflater1;Lkotlin/jvm/functions/Function1;)V", "LwrapImageProxy;", "LgetImageReaderProxy;", "", "", "b", "(LwrapImageProxy;LgetImageReaderProxy;J)V", "Landroid/content/Context;", "(Landroid/content/Context;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/Object;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()V", "LRetryPolicy1;", "TuitionPaymentFragmentbindingInflater1", "LRetryPolicy1;", "Ljava/util/concurrent/ExecutorService;", "connect", "Ljava/util/concurrent/ExecutorService;", "LenqueueImageProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LenqueueImageProxy;", "Landroid/content/Context;", "a", "Ljava/lang/String;", "", "g", "Z", "asBinder", "LremoveStaleData$TuitionPaymentFragmentbindingInflater1;", "d", "LSafeCloseImageReaderProxy;", "LSafeCloseImageReaderProxy;", "LImageAnalysisNonBlockingAnalyzer1;", "asInterface", "LImageAnalysisNonBlockingAnalyzer1;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "INotificationSideChannel", "Ljava/util/concurrent/atomic/AtomicReference;", "cancel", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getItem", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cancelAll", "Landroid/app/Application$ActivityLifecycleCallbacks;", "notify", "getRoot", "Lkotlin/Lazy;", "getExtras", "Lkotlin/jvm/functions/Function1;", "onTransact", "LSurfaceOutputEventEventCode;", "LSurfaceOutputEventEventCode;", "INotificationSideChannelStubProxy", "RemoteActionCompatParcelizer", "disconnect", "()Ljava/lang/String;", "INotificationSideChannelDefault", "LImageAnalysisBlockingAnalyzer1;", "getNotifyChildrenChangedOptions", "()LImageAnalysisBlockingAnalyzer1;", "INotificationSideChannelStub", "", "F", "getInterfaceDescriptor", "LImageAnalysisBlockingAnalyzer;", "IconCompatParcelizer", "LMetadataImageReader;", "LMetadataImageReader;", "read", "LanalyzeCachedImage;", "sendCustomAction", "LanalyzeCachedImage;", "()LanalyzeCachedImage;", "write", "MediaBrowserCompat", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class removeStaleData implements ImageAnalysisAbstractAnalyzerExternalSyntheticLambda0, setRelativeRotation {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TuitionPaymentFragmentbindingInflater1 write = new TuitionPaymentFragmentbindingInflater1(null, 100.0f, 20.0f, 20.0f, true, CollectionsKt.emptyList(), new getDefaultRetryTimeoutInMillis(), new safeClose(false, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), new getSurfaceProvider(), new LayoutSettingsBuilder(), new LayoutSettingsBuilder(), new LayoutSettingsBuilder(), new LayoutSettingsBuilder(), new LayoutSettingsBuilder(), new LayoutSettingsBuilder(), false, true, Companion.TuitionPaymentFragmentbindingInflater1(), VitalsUpdateFrequency.AVERAGE, new imageIncoming(), MapsKt.emptyMap());

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public AtomicReference<Application.ActivityLifecycleCallbacks> g;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public MetadataImageReader read;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public float write;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final ImageAnalysisBlockingAnalyzer IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public ViewTrackingStrategy getRoot;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public ScheduledExecutorService getItem;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public float getInterfaceDescriptor;
    public RetryPolicy1 TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public enqueueImageProxy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final TuitionPaymentFragmentbindingInflater1 d;
    public ImageAnalysisNonBlockingAnalyzer1<Object> asInterface;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public SafeCloseImageReaderProxy INotificationSideChannel;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public Application.ActivityLifecycleCallbacks notify;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private ExecutorService b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public SafeCloseImageReaderProxy asBinder;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean a;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private final Function1<ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, getCameraCaptureCallback> onTransact;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public float MediaBrowserCompat;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private final AtomicBoolean cancel;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private final Lazy INotificationSideChannelStub;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private final Lazy cancelAll;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public SurfaceOutputEventEventCode INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public SafeCloseImageReaderProxy RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public boolean getExtras;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    private final analyzeCachedImage connect;

    /* JADX WARN: Multi-variable type inference failed */
    private removeStaleData(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, String str, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Function1<? super ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, ? extends getCameraCaptureCallback> function1) {
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.IconCompatParcelizer = imageAnalysisBlockingAnalyzer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.d = tuitionPaymentFragmentbindingInflater1;
        this.onTransact = function1;
        this.asInterface = new ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy();
        this.cancel = new AtomicBoolean(false);
        this.getRoot = new SurfaceOutputEvent();
        this.TuitionPaymentFragmentbindingInflater1 = new getTimeoutInMillis();
        this.INotificationSideChannelStubProxy = new SurfaceOutputCameraInputInfo();
        this.asBinder = new shouldCompleteWithoutFailure();
        this.RemoteActionCompatParcelizer = new shouldCompleteWithoutFailure();
        this.INotificationSideChannel = new shouldCompleteWithoutFailure();
        this.g = new AtomicReference<>(null);
        this.read = new imageIncoming();
        this.getItem = new ResolutionInfoResolutionInfoInternalBuilder();
        this.cancelAll = LazyKt.lazy(new Function0<getCameraCaptureCallback>() { // from class: com.datadog.android.rum.internal.RumFeature$lateCrashEventHandler$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final getCameraCaptureCallback invoke() {
                Function1 function2 = this.this$0.onTransact;
                ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer2 = this.this$0.IconCompatParcelizer;
                Intrinsics.checkNotNull(imageAnalysisBlockingAnalyzer2, "");
                return (getCameraCaptureCallback) function2.invoke((ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) imageAnalysisBlockingAnalyzer2);
            }

            {
                super(0);
            }
        });
        this.INotificationSideChannelDefault = "rum";
        this.INotificationSideChannelStub = LazyKt.lazy(new Function0<ResolutionInfo>() { // from class: com.datadog.android.rum.internal.RumFeature$requestFactory$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ResolutionInfo invoke() {
                return new ResolutionInfo(this.this$0.d.b, new getY(new getSurfaceAspectRatio(this.this$0.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3())), this.this$0.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }

            {
                super(0);
            }
        });
        analyzeCachedImage.Companion companion = analyzeCachedImage.INSTANCE;
        this.connect = analyzeCachedImage.Companion.TuitionPaymentFragmentbindingInflater1();
    }

    public /* synthetic */ removeStaleData(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, String str, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, RumFeature$1 rumFeature$1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageAnalysisBlockingAnalyzer, str, tuitionPaymentFragmentbindingInflater1, (i & 8) != 0 ? new Function1<ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, truncateTag>() { // from class: com.datadog.android.rum.internal.RumFeature$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final truncateTag invoke(ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) {
                Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
                return new truncateTag(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, null, null, 6, null);
            }
        } : rumFeature$1);
    }

    @Override // defpackage.detach
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final String getINotificationSideChannelDefault() {
        return this.INotificationSideChannelDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.detach
    public final void b(Context p0) {
        float f;
        getTimeoutInMillis gettimeoutinmillis;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.d;
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.IconCompatParcelizer;
        Intrinsics.checkNotNull(imageAnalysisBlockingAnalyzer, "");
        ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 = (ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) imageAnalysisBlockingAnalyzer;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.asInterface = new resultIncoming(new LayoutSettings1(new MeteringPoint(tuitionPaymentFragmentbindingInflater1.RemoteActionCompatParcelizer, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater1.asBinder, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1.g, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), new setSurfaceAspectRatio(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, 2, null)), new MeteringPointFactory(), imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0);
        if (((ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) this.IconCompatParcelizer).cancelAll()) {
            this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.RumFeature$onInitialize$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Developer mode enabled, setting RUM sample rate to 100%.";
                }
            }, null, false, null);
            f = 100.0f;
        } else {
            f = this.d.asInterface;
        }
        this.getInterfaceDescriptor = f;
        this.MediaBrowserCompat = this.d.cancel;
        this.write = this.d.cancelAll;
        this.a = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.getExtras = this.d.getInterfaceDescriptor;
        ViewTrackingStrategy viewTrackingStrategy = this.d.INotificationSideChannelStubProxy;
        if (viewTrackingStrategy != null) {
            this.getRoot = viewTrackingStrategy;
        }
        if (this.d.INotificationSideChannelStub) {
            gettimeoutinmillis = Companion.b(INSTANCE, (updateTransformMatrix[]) this.d.notify.toArray(new updateTransformMatrix[0]), this.d.a, this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        } else {
            gettimeoutinmillis = new getTimeoutInMillis();
        }
        this.TuitionPaymentFragmentbindingInflater1 = gettimeoutinmillis;
        SurfaceOutputEventEventCode surfaceOutputEventEventCode = this.d.d;
        if (surfaceOutputEventEventCode != null) {
            this.INotificationSideChannelStubProxy = surfaceOutputEventEventCode;
        }
        VitalsUpdateFrequency vitalsUpdateFrequency = this.d.write;
        int i = 1;
        if (vitalsUpdateFrequency != VitalsUpdateFrequency.NEVER) {
            this.asBinder = new getNumOfAttempts();
            this.RemoteActionCompatParcelizer = new getNumOfAttempts();
            this.INotificationSideChannel = new getNumOfAttempts();
            long periodInMs = vitalsUpdateFrequency.getPeriodInMs();
            this.getItem = this.IconCompatParcelizer.TuitionPaymentFragmentbindingInflater1("rum-vital");
            b(new RetryPolicyRetryConfig(null, this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1, null), this.asBinder, periodInMs);
            b(new setRetryDelayInMillis(objArr2 == true ? 1 : 0, this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), i, objArr == true ? 1 : 0), this.RemoteActionCompatParcelizer, periodInMs);
            this.notify = new RetryPolicyExecutionStateStatus(this.INotificationSideChannel, this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, 0.0d, null, 28, null);
            Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                context = null;
            }
            Application application = context instanceof Application ? (Application) context : null;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(this.notify);
            }
        }
        if (this.d.INotificationSideChannelDefault) {
            enqueueImageProxy enqueueimageproxy = new enqueueImageProxy(this.IconCompatParcelizer, new Handler(Looper.getMainLooper()), 0L, 0L, 12, null);
            ExecutorService executorServiceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1("rum-anr-detection");
            this.b = executorServiceTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (executorServiceTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault2(executorServiceTuitionPaymentFragmentspecialinlinedviewModeldefault1, "ANR detection", this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), enqueueimageproxy);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = enqueueimageproxy;
        }
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.IconCompatParcelizer, p0);
        this.getRoot.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.IconCompatParcelizer, p0);
        this.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.IconCompatParcelizer, p0);
        this.read = this.d.INotificationSideChannel;
        this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelDefault, this);
        this.cancel.set(true);
    }

    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b&\b\u0080\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010'¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00138\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010'8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00105\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010:R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00160\u00138\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00103R\u0014\u0010;\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00138\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u00103R\u0016\u0010@\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u00103R\u0014\u0010>\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020%8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u00103\u001a\u0004\b8\u0010GR\u0014\u0010C\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010BR\u0014\u0010I\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010BR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u00109R\u0014\u0010N\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u00109R\u0014\u0010P\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u00109R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u00103R\u0016\u0010O\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010R"}, d2 = {"LremoveStaleData$TuitionPaymentFragmentbindingInflater1;", "", "", "p0", "", "p1", "p2", "p3", "", "p4", "", "LupdateTransformMatrix;", "p5", "LgetUseCaseAspectRatio;", "p6", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "p7", "LSurfaceOutputEventEventCode;", "p8", "LgetOffsetY;", "Lcom/datadog/android/rum/model/ViewEvent;", "p9", "Lcom/datadog/android/rum/model/ErrorEvent;", "p10", "Lcom/datadog/android/rum/model/ResourceEvent;", "p11", "Lcom/datadog/android/rum/model/ActionEvent;", "p12", "Lcom/datadog/android/rum/model/LongTaskEvent;", "p13", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "p14", "p15", "p16", "p17", "Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;", "p18", "LMetadataImageReader;", "p19", "", "p20", "<init>", "(Ljava/lang/String;FFFZLjava/util/List;LgetUseCaseAspectRatio;Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;LSurfaceOutputEventEventCode;LgetOffsetY;LgetOffsetY;LgetOffsetY;LgetOffsetY;LgetOffsetY;LgetOffsetY;ZZZLcom/datadog/android/rum/configuration/VitalsUpdateFrequency;LMetadataImageReader;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "LgetOffsetY;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z", "Ljava/lang/String;", "a", "LgetUseCaseAspectRatio;", "g", "asInterface", "LSurfaceOutputEventEventCode;", "d", "asBinder", "F", "cancelAll", "LMetadataImageReader;", "INotificationSideChannel", "MediaBrowserCompat", "()LgetOffsetY;", "onTransact", "cancel", "Ljava/util/List;", "notify", "getInterfaceDescriptor", "RemoteActionCompatParcelizer", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "INotificationSideChannelStub", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;", "write"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentbindingInflater1 {

        /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
        final float cancelAll;

        /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
        public final VitalsUpdateFrequency write;

        /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
        public final ViewTrackingStrategy INotificationSideChannelStubProxy;

        /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
        public final boolean INotificationSideChannelStub;

        /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
        private final getOffsetY<TelemetryConfigurationEvent> onTransact;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        final boolean INotificationSideChannelDefault;

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final getOffsetY<ErrorEvent> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentbindingInflater1;
        final getUseCaseAspectRatio a;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        public final float asInterface;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        public final SurfaceOutputEventEventCode d;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final getOffsetY<ActionEvent> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
        final List<updateTransformMatrix> notify;

        /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
        final MetadataImageReader INotificationSideChannel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        final getOffsetY<ResourceEvent> asBinder;
        final getOffsetY<LongTaskEvent> g;

        /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
        final getOffsetY<ViewEvent> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
        public final boolean getInterfaceDescriptor;

        /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
        public final float cancel;
        private static final byte[] $$c = {106, -66, 28, 119};
        private static final int $$f = 45;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {123, -2, -101, -104, -3, -20, 34, -25, -28, 50, -59, 16, 11, -24, -7, -7, -11, -4, 38, -49, -11, 2, -11, -38, 7, -16, 6, -11, -4, 25, -22, -29, 7, 3, -14, -11, 41, -49, 12, -11, -11, 3, -14, -11, 13, -12, -10, 5, -10, -10, 2, 25, -42, 3, -11, 6, -24, 10, -18, 60};
        private static final int $$e = 23;
        private static final byte[] $$a = {104, 27, -72, 120, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 153;
        private static int connect = 0;
        private static int read = 1;
        private static int[] write = {886937011, -530265626, -1282218003, 1983453090, -273223244, 1461205354, -175120556, -257576201, 166241826, 1052154418, -627158092, -307379202, 1625494536, 1971265091, -755342279, 1639807524, 2031767714, 1507135622};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 15
                int r0 = r6 + 38
                int r8 = r8 * 2
                int r8 = 84 - r8
                byte[] r1 = removeStaleData.TuitionPaymentFragmentbindingInflater1.$$a
                int r7 = r7 * 52
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                int r6 = r6 + 37
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r6
                r8 = r7
                r4 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L30:
                int r3 = r3 + r7
                int r7 = r3 + (-11)
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: removeStaleData.TuitionPaymentFragmentbindingInflater1.c(int, short, byte, java.lang.Object[]):void");
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
        private static void f(short r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 19
                int r9 = 103 - r9
                byte[] r0 = removeStaleData.TuitionPaymentFragmentbindingInflater1.$$d
                int r7 = r7 * 18
                int r7 = r7 + 20
                int r8 = r8 * 19
                int r8 = 22 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r9 = r8
                r4 = r2
                goto L2f
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                int r8 = r8 + 1
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2f:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + (-5)
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: removeStaleData.TuitionPaymentFragmentbindingInflater1.f(short, byte, short, java.lang.Object[]):void");
        }

        private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int length;
            int[] iArr2;
            int i3;
            int i4 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = write;
            int i5 = -1870535734;
            int i6 = 1;
            int i7 = 0;
            if (iArr3 != null) {
                int i8 = $10 + 73;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i3 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 3291 - Gravity.getAbsoluteGravity(0, 0), 31 - Color.alpha(0), 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i3++;
                        i5 = -1870535734;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = write;
            float f = 0.0f;
            if (iArr5 != null) {
                int i9 = $11 + 49;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = 0;
                while (i11 < length3) {
                    try {
                        Object[] objArr3 = new Object[i6];
                        objArr3[i7] = Integer.valueOf(iArr5[i11]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int threadPriority = 3291 - ((Process.getThreadPriority(i7) + 20) >> 6);
                            int i12 = (TypedValue.complexToFraction(i7, f, f) > f ? 1 : (TypedValue.complexToFraction(i7, f, f) == f ? 0 : -1)) + 31;
                            byte b3 = (byte) i7;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, threadPriority, i12, 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i11++;
                        iArr5 = iArr5;
                        f = 0.0f;
                        i6 = 1;
                        i7 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = i7;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            sessionConfigValidatingBuilder.b = 2;
            int i13 = $10 + 9;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                int i15 = $11 + 75;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                for (int i17 = 17; i17 > 1; i17--) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i17];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.keyCodeFromString(""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2559, AndroidCharacter.getMirror('0') - 19, 683220507, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                }
                int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - ExpandableListView.getPackedPositionType(0L)), 349 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 25, -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
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
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentbindingInflater1(String str, float f, float f2, float f3, boolean z, List<? extends updateTransformMatrix> list, getUseCaseAspectRatio getusecaseaspectratio, ViewTrackingStrategy viewTrackingStrategy, SurfaceOutputEventEventCode surfaceOutputEventEventCode, getOffsetY<ViewEvent> getoffsety, getOffsetY<ErrorEvent> getoffsety2, getOffsetY<ResourceEvent> getoffsety3, getOffsetY<ActionEvent> getoffsety4, getOffsetY<LongTaskEvent> getoffsety5, getOffsetY<TelemetryConfigurationEvent> getoffsety6, boolean z2, boolean z3, boolean z4, VitalsUpdateFrequency vitalsUpdateFrequency, MetadataImageReader metadataImageReader, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(getusecaseaspectratio, "");
            Intrinsics.checkNotNullParameter(getoffsety, "");
            Intrinsics.checkNotNullParameter(getoffsety2, "");
            Intrinsics.checkNotNullParameter(getoffsety3, "");
            Intrinsics.checkNotNullParameter(getoffsety4, "");
            Intrinsics.checkNotNullParameter(getoffsety5, "");
            Intrinsics.checkNotNullParameter(getoffsety6, "");
            Intrinsics.checkNotNullParameter(vitalsUpdateFrequency, "");
            Intrinsics.checkNotNullParameter(metadataImageReader, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.b = str;
            this.asInterface = f;
            this.cancel = f2;
            this.cancelAll = f3;
            this.INotificationSideChannelStub = z;
            this.notify = list;
            this.a = getusecaseaspectratio;
            this.INotificationSideChannelStubProxy = viewTrackingStrategy;
            this.d = surfaceOutputEventEventCode;
            this.RemoteActionCompatParcelizer = getoffsety;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getoffsety2;
            this.asBinder = getoffsety3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getoffsety4;
            this.g = getoffsety5;
            this.onTransact = getoffsety6;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z2;
            this.getInterfaceDescriptor = z3;
            this.INotificationSideChannelDefault = z4;
            this.write = vitalsUpdateFrequency;
            this.INotificationSideChannel = metadataImageReader;
            this.TuitionPaymentFragmentbindingInflater1 = map;
        }

        public final getOffsetY<TelemetryConfigurationEvent> TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int iNormalizeMetaState = 2267 - KeyEvent.normalizeMetaState(0);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 33;
                byte[] bArr = $$a;
                byte b = bArr[132];
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b, b2, b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, iNormalizeMetaState, iResolveOpacity, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new int[]{1553997620, 1721899987, -1302404987, 849137740, -1518743875, 1299805615, 629507682, -183208541, -1947496625, 1050240677, 690023326, -2009319885, 2099872076, 320550069}, 21 - Process.getGidForName(""), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new int[]{1739279764, -1564107609, -1894649854, -919323922, 2084781158, 49114816, 1306005649, 1141698416, -436695198, 1644664279}, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2267;
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 34;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[132];
                Object[] objArr5 = new Object[1];
                c(b3, b3, bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, iMakeMeasureSpec, packedPositionChild, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int iGreen = 2267 - Color.green(0);
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 34;
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    c(b4, bArr3[37], b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, iGreen, packedPositionChild2, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i2 = ((int[]) objArr7[0])[0];
                int i3 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iMyUid = Process.myUid();
                int i4 = ((((-796593235) + (((~(80639966 | iMyUid)) | 13370268) * (-502))) + ((~((~iMyUid) | 902723550)) * (-502))) + (((~(iMyUid | (-889353283))) | 80639966) * TypedValues.PositionType.TYPE_DRAWPATH)) - 2108757768;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
                c = 3;
            } else {
                Object[] objArr8 = new Object[1];
                e(new int[]{-579500055, -794854982, 48676545, 1372630205, 1148672323, -450810985, -856815347, -1429243105, -1849769330, -46138737, -1073126557, -592273400, 1863133295, -966315297, -427758523, 2092736147}, 26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new int[]{-466481728, -1873889106, 143459496, -1624377526, -634488003, -832381241, 870951890, 776144770, -908496913, 577180205, 765711635, 1461064809}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                e(new int[]{-1327861913, 1466138907, 1835160636, -708871994, -1534108419, -1335366410, -391946141, -873866294, -2065392597, 1648129307}, (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(new int[]{487854649, -865046840, -600481846, 1977885457, 1777725112, 31555314, 726401458, 1620258545, 1421588766, -468711341}, View.getDefaultSize(0, 0) + 16, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i7 = read + 45;
                connect = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -2108757768};
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    Object[] objArr13 = new Object[1];
                    f(b5, b6, (byte) (b6 - 1), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = (byte) ($$e & 1);
                    byte b8 = (byte) (b7 - 1);
                    Object[] objArr14 = new Object[1];
                    f(b7, b8, (byte) (b8 + 1), objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2267;
                            int iAlpha = Color.alpha(0) + 33;
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[7];
                            Object[] objArr16 = new Object[1];
                            c(b9, bArr4[37], b9, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, windowTouchSlop, iAlpha, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            e(new int[]{1553997620, 1721899987, -1302404987, 849137740, -1518743875, 1299805615, 629507682, -183208541, -1947496625, 1050240677, 690023326, -2009319885, 2099872076, 320550069}, 22 - TextUtils.indexOf("", ""), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            e(new int[]{1739279764, -1564107609, -1894649854, -919323922, 2084781158, 49114816, 1306005649, 1141698416, -436695198, 1644664279}, (-16777201) - Color.rgb(0, 0, 0), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i9 = 2268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 33;
                                byte[] bArr5 = $$a;
                                byte b10 = bArr5[132];
                                Object[] objArr19 = new Object[1];
                                c(b10, b10, bArr5[7], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i9, offsetBefore, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                int iResolveSizeAndState = 2267 - View.resolveSizeAndState(0, 0, 0);
                                int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32;
                                byte[] bArr6 = $$a;
                                byte b11 = bArr6[132];
                                byte b12 = bArr6[7];
                                Object[] objArr20 = new Object[1];
                                c(b11, b12, b12, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop, iResolveSizeAndState, i10, -887667012, false, (String) objArr20[0], null);
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
            int i11 = ((int[]) objArr[c])[0];
            int i12 = ((int[]) objArr[0])[0];
            if (i12 == i11) {
                int i13 = connect + 119;
                read = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i15 = ((int[]) objArr[2])[0];
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((int[]) objArr[3])[0];
                String[] strArr2 = (String[]) objArr[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i18 = i15 + 421428395 + (((~(177917987 | iIdentityHashCode)) | (-798751844) | (~(630795328 | iIdentityHashCode))) * (-744)) + (((~iIdentityHashCode) | 9961472) * 744) + ((iIdentityHashCode | 798751843) * 744);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr21[2])[0] = i20 ^ (i20 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[1];
                if (strArr3 != null) {
                    for (String str : strArr3) {
                        int i21 = connect + 31;
                        read = i21 % 128;
                        int i22 = i21 % 2;
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
                Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i23 = ((int[]) objArr[2])[0];
                int i24 = ((int[]) objArr[0])[0];
                int i25 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[1];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i26 = ~iUptimeMillis;
                int i27 = i23 + (-1722473309) + ((iUptimeMillis | 263332417) * 988) + (((~(267526993 | i26)) | 536991746) * (-1976)) + (((~(iUptimeMillis | (-541186323))) | 263332417 | (~(541186322 | i26))) * 988);
                int i28 = (i27 << 13) ^ i27;
                int i29 = i28 ^ (i28 >>> 17);
                ((int[]) objArr22[2])[0] = i29 ^ (i29 << 5);
            }
            return this.onTransact;
        }

        public static /* synthetic */ TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, String str, float f, float f2, float f3, boolean z, List list, getUseCaseAspectRatio getusecaseaspectratio, ViewTrackingStrategy viewTrackingStrategy, SurfaceOutputEventEventCode surfaceOutputEventEventCode, getOffsetY getoffsety, getOffsetY getoffsety2, getOffsetY getoffsety3, getOffsetY getoffsety4, getOffsetY getoffsety5, getOffsetY getoffsety6, boolean z2, boolean z3, boolean z4, VitalsUpdateFrequency vitalsUpdateFrequency, MetadataImageReader metadataImageReader, Map map, int i) {
            String str2;
            float f4;
            float f5;
            float f6;
            getOffsetY getoffsety7;
            getOffsetY getoffsety8;
            getOffsetY getoffsety9;
            boolean z5;
            MetadataImageReader metadataImageReader2;
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = connect + 63;
                read = i3 % 128;
                int i4 = i3 % 2;
                str2 = tuitionPaymentFragmentbindingInflater1.b;
            } else {
                str2 = str;
            }
            if ((i & 2) != 0) {
                f4 = tuitionPaymentFragmentbindingInflater1.asInterface;
                int i5 = connect + 79;
                read = i5 % 128;
                int i6 = i5 % 2;
            } else {
                f4 = f;
            }
            if ((i & 4) != 0) {
                int i7 = connect + 7;
                read = i7 % 128;
                if (i7 % 2 == 0) {
                    f5 = tuitionPaymentFragmentbindingInflater1.cancel;
                    int i8 = 89 / 0;
                } else {
                    f5 = tuitionPaymentFragmentbindingInflater1.cancel;
                }
            } else {
                f5 = f2;
            }
            if ((i & 8) != 0) {
                int i9 = read + 35;
                connect = i9 % 128;
                if (i9 % 2 != 0) {
                    float f7 = tuitionPaymentFragmentbindingInflater1.cancelAll;
                    throw null;
                }
                f6 = tuitionPaymentFragmentbindingInflater1.cancelAll;
            } else {
                f6 = f3;
            }
            boolean z6 = (i & 16) != 0 ? tuitionPaymentFragmentbindingInflater1.INotificationSideChannelStub : z;
            List list2 = (i & 32) != 0 ? tuitionPaymentFragmentbindingInflater1.notify : list;
            getUseCaseAspectRatio getusecaseaspectratio2 = (i & 64) != 0 ? tuitionPaymentFragmentbindingInflater1.a : getusecaseaspectratio;
            ViewTrackingStrategy viewTrackingStrategy2 = (i & 128) != 0 ? tuitionPaymentFragmentbindingInflater1.INotificationSideChannelStubProxy : viewTrackingStrategy;
            SurfaceOutputEventEventCode surfaceOutputEventEventCode2 = (i & 256) != 0 ? tuitionPaymentFragmentbindingInflater1.d : surfaceOutputEventEventCode;
            getOffsetY getoffsety10 = (i & 512) != 0 ? tuitionPaymentFragmentbindingInflater1.RemoteActionCompatParcelizer : getoffsety;
            if ((i & 1024) != 0) {
                int i10 = connect + 113;
                read = i10 % 128;
                if (i10 % 2 == 0) {
                    getoffsety7 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i11 = 60 / 0;
                } else {
                    getoffsety7 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
            } else {
                getoffsety7 = getoffsety2;
            }
            if ((i & 2048) != 0) {
                int i12 = connect + 7;
                read = i12 % 128;
                int i13 = i12 % 2;
                getoffsety8 = tuitionPaymentFragmentbindingInflater1.asBinder;
            } else {
                getoffsety8 = getoffsety3;
            }
            getOffsetY getoffsety11 = (i & 4096) != 0 ? tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : getoffsety4;
            getOffsetY getoffsety12 = (i & 8192) != 0 ? tuitionPaymentFragmentbindingInflater1.g : getoffsety5;
            SurfaceOutputEventEventCode surfaceOutputEventEventCode3 = surfaceOutputEventEventCode2;
            if ((i & 16384) != 0) {
                int i14 = read + 5;
                connect = i14 % 128;
                int i15 = i14 % 2;
                getoffsety9 = tuitionPaymentFragmentbindingInflater1.onTransact;
            } else {
                getoffsety9 = getoffsety6;
            }
            boolean z7 = (32768 & i) != 0 ? tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : z2;
            boolean z8 = (i & 65536) != 0 ? tuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor : z3;
            if ((i & 131072) != 0) {
                int i16 = connect + 101;
                read = i16 % 128;
                int i17 = i16 % 2;
                z5 = tuitionPaymentFragmentbindingInflater1.INotificationSideChannelDefault;
            } else {
                z5 = z4;
            }
            VitalsUpdateFrequency vitalsUpdateFrequency2 = (262144 & i) != 0 ? tuitionPaymentFragmentbindingInflater1.write : vitalsUpdateFrequency;
            if ((i & 524288) != 0) {
                MetadataImageReader metadataImageReader3 = tuitionPaymentFragmentbindingInflater1.INotificationSideChannel;
                int i18 = connect + 31;
                read = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 2 / 5;
                }
                metadataImageReader2 = metadataImageReader3;
            } else {
                metadataImageReader2 = metadataImageReader;
            }
            Map map2 = (i & 1048576) != 0 ? tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 : map;
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(getusecaseaspectratio2, "");
            Intrinsics.checkNotNullParameter(getoffsety10, "");
            Intrinsics.checkNotNullParameter(getoffsety7, "");
            Intrinsics.checkNotNullParameter(getoffsety8, "");
            Intrinsics.checkNotNullParameter(getoffsety11, "");
            Intrinsics.checkNotNullParameter(getoffsety12, "");
            Intrinsics.checkNotNullParameter(getoffsety9, "");
            Intrinsics.checkNotNullParameter(vitalsUpdateFrequency2, "");
            Intrinsics.checkNotNullParameter(metadataImageReader2, "");
            Intrinsics.checkNotNullParameter(map2, "");
            return new TuitionPaymentFragmentbindingInflater1(str2, f4, f5, f6, z6, list2, getusecaseaspectratio2, viewTrackingStrategy2, surfaceOutputEventEventCode3, getoffsety10, getoffsety7, getoffsety8, getoffsety11, getoffsety12, getoffsety9, z7, z8, z5, vitalsUpdateFrequency2, metadataImageReader2, map2);
        }

        public final boolean equals(Object p0) {
            int i = 2 % 2;
            if (this == p0) {
                int i2 = read + 9;
                connect = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(p0 instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) p0;
            if (!Intrinsics.areEqual(this.b, tuitionPaymentFragmentbindingInflater1.b)) {
                return false;
            }
            if (Float.compare(this.asInterface, tuitionPaymentFragmentbindingInflater1.asInterface) != 0) {
                int i3 = read + 73;
                connect = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Float.compare(this.cancel, tuitionPaymentFragmentbindingInflater1.cancel) != 0) {
                int i5 = read + 25;
                connect = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 66 / 0;
                }
                return false;
            }
            if (Float.compare(this.cancelAll, tuitionPaymentFragmentbindingInflater1.cancelAll) != 0) {
                return false;
            }
            if (this.INotificationSideChannelStub != tuitionPaymentFragmentbindingInflater1.INotificationSideChannelStub) {
                int i7 = read + 19;
                connect = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.notify, tuitionPaymentFragmentbindingInflater1.notify)) {
                int i9 = connect + 27;
                read = i9 % 128;
                return i9 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.a, tuitionPaymentFragmentbindingInflater1.a)) {
                int i10 = connect + 91;
                read = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.INotificationSideChannelStubProxy, tuitionPaymentFragmentbindingInflater1.INotificationSideChannelStubProxy) || !Intrinsics.areEqual(this.d, tuitionPaymentFragmentbindingInflater1.d) || (!Intrinsics.areEqual(this.RemoteActionCompatParcelizer, tuitionPaymentFragmentbindingInflater1.RemoteActionCompatParcelizer)) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) || !Intrinsics.areEqual(this.asBinder, tuitionPaymentFragmentbindingInflater1.asBinder)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                int i12 = read + 43;
                connect = i12 % 128;
                return i12 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.g, tuitionPaymentFragmentbindingInflater1.g) || !Intrinsics.areEqual(this.onTransact, tuitionPaymentFragmentbindingInflater1.onTransact) || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return false;
            }
            if (this.getInterfaceDescriptor != tuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor) {
                int i13 = read + 29;
                connect = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            if (this.INotificationSideChannelDefault != tuitionPaymentFragmentbindingInflater1.INotificationSideChannelDefault || this.write != tuitionPaymentFragmentbindingInflater1.write) {
                return false;
            }
            if (!Intrinsics.areEqual(this.INotificationSideChannel, tuitionPaymentFragmentbindingInflater1.INotificationSideChannel)) {
                int i15 = read + 27;
                connect = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1))) {
                return true;
            }
            int i17 = read + 105;
            connect = i17 % 128;
            return i17 % 2 != 0;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.b;
            int iHashCode2 = 0;
            if (str == null) {
                int i2 = connect + 107;
                read = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int iHashCode3 = Float.hashCode(this.asInterface);
            int iHashCode4 = Float.hashCode(this.cancel);
            int iHashCode5 = Float.hashCode(this.cancelAll);
            int iHashCode6 = Boolean.hashCode(this.INotificationSideChannelStub);
            int iHashCode7 = this.notify.hashCode();
            int iHashCode8 = this.a.hashCode();
            ViewTrackingStrategy viewTrackingStrategy = this.INotificationSideChannelStubProxy;
            int iHashCode9 = viewTrackingStrategy == null ? 0 : viewTrackingStrategy.hashCode();
            SurfaceOutputEventEventCode surfaceOutputEventEventCode = this.d;
            if (surfaceOutputEventEventCode != null) {
                int i4 = connect + 61;
                read = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = surfaceOutputEventEventCode.hashCode();
            }
            return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.g.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 31) + Boolean.hashCode(this.getInterfaceDescriptor)) * 31) + Boolean.hashCode(this.INotificationSideChannelDefault)) * 31) + this.write.hashCode()) * 31) + this.INotificationSideChannel.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            int i = 2 % 2;
            String str = this.b;
            float f = this.asInterface;
            float f2 = this.cancel;
            float f3 = this.cancelAll;
            boolean z = this.INotificationSideChannelStub;
            List<updateTransformMatrix> list = this.notify;
            getUseCaseAspectRatio getusecaseaspectratio = this.a;
            ViewTrackingStrategy viewTrackingStrategy = this.INotificationSideChannelStubProxy;
            SurfaceOutputEventEventCode surfaceOutputEventEventCode = this.d;
            getOffsetY<ViewEvent> getoffsety = this.RemoteActionCompatParcelizer;
            getOffsetY<ErrorEvent> getoffsety2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getOffsetY<ResourceEvent> getoffsety3 = this.asBinder;
            getOffsetY<ActionEvent> getoffsety4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            getOffsetY<LongTaskEvent> getoffsety5 = this.g;
            getOffsetY<TelemetryConfigurationEvent> getoffsety6 = this.onTransact;
            boolean z2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            boolean z3 = this.getInterfaceDescriptor;
            boolean z4 = this.INotificationSideChannelDefault;
            VitalsUpdateFrequency vitalsUpdateFrequency = this.write;
            MetadataImageReader metadataImageReader = this.INotificationSideChannel;
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentbindingInflater1(b=");
            sb.append(str);
            sb.append(", asInterface=");
            sb.append(f);
            sb.append(", cancel=");
            sb.append(f2);
            sb.append(", cancelAll=");
            sb.append(f3);
            sb.append(", INotificationSideChannelStub=");
            sb.append(z);
            sb.append(", notify=");
            sb.append(list);
            sb.append(", a=");
            sb.append(getusecaseaspectratio);
            sb.append(", INotificationSideChannelStubProxy=");
            sb.append(viewTrackingStrategy);
            sb.append(", d=");
            sb.append(surfaceOutputEventEventCode);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(getoffsety);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(getoffsety2);
            sb.append(", asBinder=");
            sb.append(getoffsety3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(getoffsety4);
            sb.append(", g=");
            sb.append(getoffsety5);
            sb.append(", onTransact=");
            sb.append(getoffsety6);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(z2);
            sb.append(", getInterfaceDescriptor=");
            sb.append(z3);
            sb.append(", INotificationSideChannelDefault=");
            sb.append(z4);
            sb.append(", write=");
            sb.append(vitalsUpdateFrequency);
            sb.append(", INotificationSideChannel=");
            sb.append(metadataImageReader);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(map);
            sb.append(")");
            String string = sb.toString();
            int i2 = connect + 59;
            read = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, short r7, short r8) {
            /*
                int r8 = r8 * 56
                int r8 = r8 + 66
                int r6 = r6 * 3
                int r6 = r6 + 4
                int r7 = r7 * 2
                int r0 = r7 + 1
                byte[] r1 = removeStaleData.TuitionPaymentFragmentbindingInflater1.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r8 = r6
                r4 = r7
                r3 = r2
                goto L2a
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r5
            L2a:
                int r6 = r6 + r4
                int r8 = r8 + 1
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: removeStaleData.TuitionPaymentFragmentbindingInflater1.$$g(short, short, short):java.lang.String");
        }
    }

    @Override // defpackage.ImageAnalysisAbstractAnalyzerExternalSyntheticLambda0
    public final ImageAnalysisBlockingAnalyzer1 TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return (ImageAnalysisBlockingAnalyzer1) this.INotificationSideChannelStub.getValue();
    }

    @Override // defpackage.ImageAnalysisAbstractAnalyzerExternalSyntheticLambda0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final analyzeCachedImage getConnect() {
        return this.connect;
    }

    @Override // defpackage.detach
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelDefault);
        Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            context = null;
        }
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context);
        this.getRoot.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context);
        this.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context);
        this.asInterface = new ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy();
        this.getRoot = new SurfaceOutputEvent();
        this.TuitionPaymentFragmentbindingInflater1 = new getTimeoutInMillis();
        this.INotificationSideChannelStubProxy = new SurfaceOutputCameraInputInfo();
        this.asBinder = new shouldCompleteWithoutFailure();
        this.RemoteActionCompatParcelizer = new shouldCompleteWithoutFailure();
        this.INotificationSideChannel = new shouldCompleteWithoutFailure();
        this.getItem.shutdownNow();
        ExecutorService executorService = this.b;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        enqueueImageProxy enqueueimageproxy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (enqueueimageproxy != null) {
            enqueueimageproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        }
        this.getItem = new ResolutionInfoResolutionInfoInternalBuilder();
        this.read = new imageIncoming();
        GlobalRumMonitor globalRumMonitor = GlobalRumMonitor.INSTANCE;
        GlobalRumMonitor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.IconCompatParcelizer);
    }

    @Override // defpackage.setRelativeRotation
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final Object p0) throws InterruptedException {
        BlockingQueue<Runnable> queue;
        Intrinsics.checkNotNullParameter(p0, "");
        if (!(p0 instanceof Map)) {
            if (!(p0 instanceof getSessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                if (p0 instanceof LayoutSettings) {
                    LayoutSettings layoutSettings = (LayoutSettings) p0;
                    RumMonitor rumMonitorB = GlobalRumMonitor.b(this.IconCompatParcelizer);
                    PreviewBuilder previewBuilder = rumMonitorB instanceof PreviewBuilder ? (PreviewBuilder) rumMonitorB : null;
                    if (previewBuilder != null) {
                        previewBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutSettings);
                        return;
                    }
                    return;
                }
                this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.RumFeature$onReceive$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String str = String.format(Locale.US, "RUM feature receive an event of unsupported type=%s.", Arrays.copyOf(new Object[]{p0.getClass().getCanonicalName()}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        return str;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, null, false, null);
                return;
            }
            getSessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (getSessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0;
            RumMonitor rumMonitorB2 = GlobalRumMonitor.b(this.IconCompatParcelizer);
            PreviewBuilder previewBuilder2 = rumMonitorB2 instanceof PreviewBuilder ? (PreviewBuilder) rumMonitorB2 : null;
            if (previewBuilder2 != null) {
                previewBuilder2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, RumErrorSource.SOURCE, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
                return;
            }
            return;
        }
        Map<?, ?> map = (Map) p0;
        Object obj = map.get("type");
        if (Intrinsics.areEqual(obj, "ndk_crash")) {
            ((getCameraCaptureCallback) this.cancelAll.getValue()).TuitionPaymentFragmentbindingInflater1(map, this.asInterface);
            return;
        }
        if (!Intrinsics.areEqual(obj, "logger_error")) {
            if (!Intrinsics.areEqual(obj, "logger_error_with_stacktrace")) {
                if (Intrinsics.areEqual(obj, "web_view_ingested_notification")) {
                    RumMonitor rumMonitorB3 = GlobalRumMonitor.b(this.IconCompatParcelizer);
                    PreviewBuilder previewBuilder3 = rumMonitorB3 instanceof PreviewBuilder ? (PreviewBuilder) rumMonitorB3 : null;
                    if (previewBuilder3 != null) {
                        previewBuilder3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(obj, "flush_and_stop_monitor")) {
                    RumMonitor rumMonitorB4 = GlobalRumMonitor.b(this.IconCompatParcelizer);
                    PreviewSurfaceProvider previewSurfaceProvider = rumMonitorB4 instanceof PreviewSurfaceProvider ? (PreviewSurfaceProvider) rumMonitorB4 : null;
                    if (previewSurfaceProvider != null) {
                        previewSurfaceProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1.removeCallbacks(previewSurfaceProvider.asInterface);
                        ArrayList arrayList = new ArrayList();
                        ExecutorService executorService = previewSurfaceProvider.TuitionPaymentFragmentbindingInflater1;
                        ThreadPoolExecutor threadPoolExecutor = executorService instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) executorService : null;
                        if (threadPoolExecutor != null && (queue = threadPoolExecutor.getQueue()) != null) {
                            queue.drainTo(arrayList);
                        }
                        previewSurfaceProvider.TuitionPaymentFragmentbindingInflater1.shutdown();
                        previewSurfaceProvider.TuitionPaymentFragmentbindingInflater1.awaitTermination(10L, TimeUnit.SECONDS);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        return;
                    }
                    return;
                }
                this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new RumFeature$handleMapLikeEvent$2(map), null, false, null);
                return;
            }
            Object obj2 = map.get("stacktrace");
            String str = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = map.get("message");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = map.get("attributes");
            Map<String, ? extends Object> mapEmptyMap = obj4 instanceof Map ? (Map) obj4 : null;
            if (str2 != null) {
                RumMonitor rumMonitorB5 = GlobalRumMonitor.b(this.IconCompatParcelizer);
                PreviewBuilder previewBuilder4 = rumMonitorB5 instanceof PreviewBuilder ? (PreviewBuilder) rumMonitorB5 : null;
                if (previewBuilder4 != null) {
                    RumErrorSource rumErrorSource = RumErrorSource.LOGGER;
                    if (mapEmptyMap == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    previewBuilder4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, rumErrorSource, str, mapEmptyMap);
                    return;
                }
                return;
            }
            this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.WARN, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.RumFeature$addLoggerErrorWithStacktrace$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "RUM feature received a log event with stacktrace where mandatory message field is either missing or has a wrong type.";
                }
            }, null, false, null);
            return;
        }
        Object obj5 = map.get("throwable");
        Throwable th = obj5 instanceof Throwable ? (Throwable) obj5 : null;
        Object obj6 = map.get("message");
        String str3 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = map.get("attributes");
        Map<String, ? extends Object> mapEmptyMap2 = obj7 instanceof Map ? (Map) obj7 : null;
        if (str3 != null) {
            RumMonitor rumMonitorB6 = GlobalRumMonitor.b(this.IconCompatParcelizer);
            PreviewBuilder previewBuilder5 = rumMonitorB6 instanceof PreviewBuilder ? (PreviewBuilder) rumMonitorB6 : null;
            if (previewBuilder5 != null) {
                RumErrorSource rumErrorSource2 = RumErrorSource.LOGGER;
                if (mapEmptyMap2 == null) {
                    mapEmptyMap2 = MapsKt.emptyMap();
                }
                previewBuilder5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str3, rumErrorSource2, th, mapEmptyMap2);
                return;
            }
            return;
        }
        this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.WARN, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.RumFeature$addLoggerError$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "RUM feature received a log event where mandatory message field is either missing or has a wrong type.";
            }
        }, null, false, null);
    }

    private final void b(wrapImageProxy p0, getImageReaderProxy p1, long p2) {
        ImageProxyDownsampler.TuitionPaymentFragmentbindingInflater1(this.getItem, "Vitals monitoring", p2, TimeUnit.MILLISECONDS, this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new setShouldRetry(this.IconCompatParcelizer, p0, p1, this.getItem, p2));
    }

    /* JADX INFO: renamed from: removeStaleData$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"LremoveStaleData$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LremoveStaleData$TuitionPaymentFragmentbindingInflater1;", "write", "LremoveStaleData$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LremoveStaleData$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return removeStaleData.write;
        }

        public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1() {
            isSupportedRotationDegrees.Companion companion = isSupportedRotationDegrees.INSTANCE;
            isSupportedRotationDegrees issupportedrotationdegreesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isSupportedRotationDegrees.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            Intrinsics.checkNotNullParameter(issupportedrotationdegreesTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
            return issupportedrotationdegreesTuitionPaymentFragmentspecialinlinedviewModeldefault2.b() < 30;
        }

        public static final /* synthetic */ RetryPolicy1 b(Companion companion, updateTransformMatrix[] updatetransformmatrixArr, getUseCaseAspectRatio getusecaseaspectratio, InternalLogger internalLogger) {
            getCameraEdge getcameraedge = new getCameraEdge((updateTransformMatrix[]) ArraysKt.plus((Object[]) updatetransformmatrixArr, (Object[]) new RetryPolicy[]{new RetryPolicy()}), getusecaseaspectratio, internalLogger);
            if (Build.VERSION.SDK_INT >= 29) {
                return new updateConfigAndOutput(getcameraedge);
            }
            return new getTargetFrameRate(getcameraedge);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void E_(removeStaleData removestaledata, ApplicationExitInfo applicationExitInfo) {
        Intrinsics.checkNotNullParameter(removestaledata, "");
        Intrinsics.checkNotNullParameter(applicationExitInfo, "");
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = removestaledata.IconCompatParcelizer;
        Intrinsics.checkNotNull(imageAnalysisBlockingAnalyzer, "");
        JsonObject jsonObjectG = ((ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) imageAnalysisBlockingAnalyzer).g();
        if (jsonObjectG != null) {
            ((getCameraCaptureCallback) removestaledata.cancelAll.getValue()).D_(applicationExitInfo, jsonObjectG, removestaledata.asInterface);
        } else {
            removestaledata.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.RumFeature$consumeLastFatalAnr$1$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "No last known RUM view event found, skipping fatal ANR reporting.";
                }
            }, null, false, null);
        }
    }
}
