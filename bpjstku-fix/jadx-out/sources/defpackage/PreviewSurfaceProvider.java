package defpackage;

import android.os.Handler;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.RumErrorSourceType;
import com.datadog.android.telemetry.internal.TelemetryEventHandler;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0085\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J5\u0010'\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0%H\u0016¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020)2\u0006\u0010\b\u001a\u00020*2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b-\u0010.J?\u0010-\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020)2\b\u0010\b\u001a\u0004\u0018\u00010*2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0%H\u0016¢\u0006\u0004\b-\u0010/J?\u00100\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020)2\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0%H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020&2\u0006\u0010\u0004\u001a\u0002022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00103\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u000205H\u0016¢\u0006\u0004\b3\u00106J\u001f\u0010\"\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u000205H\u0016¢\u0006\u0004\b\"\u00106J\u001d\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0%H\u0017¢\u0006\u0004\b7\u00108J%\u00100\u001a\u0002092\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0%H\u0002¢\u0006\u0004\b0\u0010:J\u0017\u0010-\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020;H\u0000¢\u0006\u0004\b-\u0010<J\u0017\u0010-\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020=H\u0016¢\u0006\u0004\b-\u0010>J\u000f\u0010-\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010?J\u001f\u00103\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b3\u0010@J5\u0010-\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0%H\u0016¢\u0006\u0004\b-\u0010(J5\u00107\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0%H\u0016¢\u0006\u0004\b7\u0010AJ5\u0010\"\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0%H\u0016¢\u0006\u0004\b\"\u0010(J-\u00100\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\r2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0%H\u0016¢\u0006\u0004\b0\u0010BR\u0014\u00107\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010-\u001a\u0004\u0018\u00010E8\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b-\u0010FR\u0014\u0010\"\u001a\u00020\u001d8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u0010GR\"\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u00103\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\"\u0010KR\u0014\u0010I\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010C\u001a\u00020N8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020Q8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b7\u0010RR\u0016\u0010L\u001a\u00020T8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010U\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010W\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010O\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b]\u0010DR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b^\u0010_"}, d2 = {"LPreviewSurfaceProvider;", "Lcom/datadog/android/rum/RumMonitor;", "LPreviewBuilder;", "", "p0", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p1", "", "p2", "", "p3", "p4", "LImageAnalysisNonBlockingAnalyzer1;", "", "p5", "Landroid/os/Handler;", "p6", "Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "p7", "LPreviewExternalSyntheticLambda3;", "p8", "LsetJpegQuality;", "p9", "LSafeCloseImageReaderProxy;", "p10", "p11", "p12", "LMetadataImageReader;", "p13", "Ljava/util/concurrent/ExecutorService;", "p14", "<init>", "(Ljava/lang/String;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;FZZLImageAnalysisNonBlockingAnalyzer1;Landroid/os/Handler;Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;LPreviewExternalSyntheticLambda3;LsetJpegQuality;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;LMetadataImageReader;Ljava/util/concurrent/ExecutorService;)V", "LdequeImageProxy;", "TuitionPaymentFragmentbindingInflater1", "()LdequeImageProxy;", "Lcom/datadog/android/rum/RumActionType;", "", "", "addAction", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumErrorSource;", "", "", "LisImageFormatSupported;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/List;)V", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/util/Map;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(JLjava/lang/String;)V", "LonSurfaceRequested;", "(Ljava/lang/String;LonSurfaceRequested;)V", "b", "()Ljava/util/Map;", "Llambdanew0androidxcameracoreMetadataImageReader;", "(Ljava/util/Map;)Llambdanew0androidxcameracoreMetadataImageReader;", "LgetPreviewCapabilities;", "(LgetPreviewCapabilities;)V", "LLayoutSettings;", "(LLayoutSettings;)V", "()V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/Object;Ljava/util/Map;)V", "asBinder", "Z", "LlambdaenqueueImageProxy1androidxcameracoreMetadataImageReader;", "LlambdaenqueueImageProxy1androidxcameracoreMetadataImageReader;", "Ljava/util/concurrent/ExecutorService;", "", "d", "Ljava/util/Map;", "Landroid/os/Handler;", "a", "LdequeImageProxy;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "notify", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "asInterface", "LPreview;", "g", "LPreview;", "cancelAll", "F", "cancel", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "onTransact", "Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "INotificationSideChannel", "INotificationSideChannelDefault", "LImageAnalysisNonBlockingAnalyzer1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class PreviewSurfaceProvider implements RumMonitor, PreviewBuilder {
    private static final long asInterface = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final boolean notify;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final ImageAnalysisNonBlockingAnalyzer1<Object> onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final ExecutorService TuitionPaymentFragmentbindingInflater1;
    public lambdaenqueueImageProxy1androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dequeImageProxy d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final boolean b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Runnable asInterface;
    private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 cancel;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final float g;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Preview a;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final AtomicBoolean asBinder;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final TelemetryEventHandler cancelAll;

    public PreviewSurfaceProvider(String str, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, float f, boolean z, boolean z2, ImageAnalysisNonBlockingAnalyzer1<Object> imageAnalysisNonBlockingAnalyzer1, Handler handler, TelemetryEventHandler telemetryEventHandler, PreviewExternalSyntheticLambda3 previewExternalSyntheticLambda3, setJpegQuality setjpegquality, SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2, SafeCloseImageReaderProxy safeCloseImageReaderProxy3, MetadataImageReader metadataImageReader, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzer1, "");
        Intrinsics.checkNotNullParameter(handler, "");
        Intrinsics.checkNotNullParameter(telemetryEventHandler, "");
        Intrinsics.checkNotNullParameter(previewExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(setjpegquality, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy2, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy3, "");
        Intrinsics.checkNotNullParameter(metadataImageReader, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        this.cancel = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
        this.g = f;
        this.b = z;
        this.notify = z2;
        this.onTransact = imageAnalysisNonBlockingAnalyzer1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = handler;
        this.cancelAll = telemetryEventHandler;
        this.TuitionPaymentFragmentbindingInflater1 = executorService;
        this.a = new addCameraSurfaceAndErrorListener(str, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, f, z, z2, setjpegquality, safeCloseImageReaderProxy, safeCloseImageReaderProxy2, safeCloseImageReaderProxy3, previewExternalSyntheticLambda3, new setMinLogLevel(metadataImageReader, telemetryEventHandler));
        Runnable runnable = new Runnable() { // from class: setTargetFrameRate
            @Override // java.lang.Runnable
            public final void run() {
                PreviewSurfaceProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        };
        this.asInterface = runnable;
        this.d = new dequeImageProxy(this);
        handler.postDelayed(runnable, asInterface);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ConcurrentHashMap();
        this.asBinder = new AtomicBoolean(false);
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void b(Object p0, String p1, Map<String, ? extends Object> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereaderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p2);
        onAppEdgeInvalidated.Companion companion = onAppEdgeInvalidated.INSTANCE;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.read(onAppEdgeInvalidated.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1), MapsKt.toMap(p2), lambdanew0androidxcameracoremetadataimagereaderTuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object p0, Map<String, ? extends Object> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.getItem(onAppEdgeInvalidated.Companion.b(onAppEdgeInvalidated.INSTANCE, p0), MapsKt.toMap(p1), TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addAction(RumActionType p0, String p1, Map<String, ? extends Object> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.connect(p0, p1, false, MapsKt.toMap(p2), TuitionPaymentFragmentspecialinlinedviewModeldefault3(p2)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RumActionType p0, String p1, Map<String, ? extends Object> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.connect(p0, p1, true, MapsKt.toMap(p2), TuitionPaymentFragmentspecialinlinedviewModeldefault3(p2)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void TuitionPaymentFragmentbindingInflater1(RumActionType p0, String p1, Map<String, ? extends Object> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.IconCompatParcelizer(p0, p1, MapsKt.toMap(p2), TuitionPaymentFragmentspecialinlinedviewModeldefault3(p2)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, RumErrorSource p1, Throwable p2, Map<String, ? extends Object> p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p3, "");
        lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereaderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p3);
        Object obj = p3.get("_dd.error_type");
        String str = obj instanceof String ? (String) obj : null;
        Map mutableMap = MapsKt.toMutableMap(p3);
        Object objRemove = mutableMap.remove("_dd.error.threads");
        List list = objRemove instanceof List ? (List) objRemove : null;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, p1, p2, null, false, mutableMap, lambdanew0androidxcameracoremetadataimagereaderTuitionPaymentFragmentspecialinlinedviewModeldefault3, str, null, list == null ? CollectionsKt.emptyList() : list, null, 1280, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    @Override // com.datadog.android.rum.RumMonitor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, RumErrorSource p1, String p2, Map<String, ? extends Object> p3) {
        RumErrorSourceType rumErrorSourceType;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p3, "");
        lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereaderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p3);
        Object obj = p3.get("_dd.error_type");
        String lowerCase = null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = p3.get("_dd.error.source_type");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 != null) {
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -861391249:
                    lowerCase.equals("android");
                    rumErrorSourceType = RumErrorSourceType.ANDROID;
                    break;
                case -760334308:
                    if (!lowerCase.equals("flutter")) {
                        rumErrorSourceType = RumErrorSourceType.ANDROID;
                    } else {
                        rumErrorSourceType = RumErrorSourceType.FLUTTER;
                    }
                    break;
                case -380982102:
                    if (!lowerCase.equals("ndk+il2cpp")) {
                        rumErrorSourceType = RumErrorSourceType.ANDROID;
                    } else {
                        rumErrorSourceType = RumErrorSourceType.NDK_IL2CPP;
                    }
                    break;
                case 108917:
                    if (!lowerCase.equals("ndk")) {
                        rumErrorSourceType = RumErrorSourceType.ANDROID;
                    } else {
                        rumErrorSourceType = RumErrorSourceType.NDK;
                    }
                    break;
                case 150940456:
                    if (!lowerCase.equals("browser")) {
                        rumErrorSourceType = RumErrorSourceType.ANDROID;
                    } else {
                        rumErrorSourceType = RumErrorSourceType.BROWSER;
                    }
                    break;
                case 828638245:
                    if (!lowerCase.equals("react-native")) {
                        rumErrorSourceType = RumErrorSourceType.ANDROID;
                    } else {
                        rumErrorSourceType = RumErrorSourceType.REACT_NATIVE;
                    }
                    break;
                default:
                    rumErrorSourceType = RumErrorSourceType.ANDROID;
                    break;
            }
        } else {
            rumErrorSourceType = RumErrorSourceType.ANDROID;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, p1, null, p2, false, MapsKt.toMap(p3), lambdanew0androidxcameracoremetadataimagereaderTuitionPaymentFragmentspecialinlinedviewModeldefault3, str, rumErrorSourceType, CollectionsKt.emptyList(), null, 1024, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final Map<String, Object> b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.getSessionToken(null, 1, null));
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, RumErrorSource p1, Throwable p2, List<isImageFormatSupported> p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, p1, p2, null, true, MapsKt.emptyMap(), lambdanew0androidxcameracoremetadataimagereader, null, null, p3, Long.valueOf(lambdanew0androidxcameracoremetadataimagereader.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - this.cancel.asBinder()), 384, null));
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long p0, String p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.g(p0, p1, null, 4, null));
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentbindingInflater1(String p0, onSurfaceRequested p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p1 instanceof onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.TuitionPaymentFragmentbindingInflater1(p0, ((onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault3) p1).TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, 4, null));
            return;
        }
        if (p1 instanceof onSurfaceRequested.TuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.INotificationSideChannelStubProxy(p0, null, 2, null));
            return;
        }
        if (p1 instanceof onSurfaceRequested.b) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.onTransact(p0, null, 2, null));
        } else if (p1 instanceof onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.cancel(p0, false, null, 4, null));
        } else if (p1 instanceof onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.cancel(p0, true, null, 4, null));
        }
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0, onSurfaceRequested p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p1 instanceof onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, null, 2, null));
            return;
        }
        if (p1 instanceof onSurfaceRequested.TuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.INotificationSideChannelStub(p0, null, 2, null));
            return;
        }
        if (p1 instanceof onSurfaceRequested.b) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.notify(p0, null, 2, null));
        } else if (p1 instanceof onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.INotificationSideChannel(p0, false, null, 4, null));
        } else if (p1 instanceof onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.INotificationSideChannel(p0, true, null, 4, null));
        }
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.MediaBrowserCompat(p0, p1, null, 4, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final dequeImageProxy getD() {
        return this.d;
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutSettings p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.sendCustomAction(p0, null, 2, null));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final getPreviewCapabilities p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if ((p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && ((getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            synchronized (this.a) {
                this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, this.onTransact);
            }
        } else {
            if (p0 instanceof getPreviewCapabilities.sendCustomAction) {
                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3((getPreviewCapabilities.sendCustomAction) p0, this.onTransact);
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.removeCallbacks(this.asInterface);
            if (this.TuitionPaymentFragmentbindingInflater1.isShutdown()) {
                return;
            }
            ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, "Rum event handling", this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Runnable() { // from class: PreviewCapabilities
                @Override // java.lang.Runnable
                public final void run() {
                    PreviewSurfaceProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, p0);
                }
            });
        }
    }

    private static lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<String, ? extends Object> p0) {
        Object obj = p0.get("_dd.timestamp");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l == null) {
            return new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null);
        }
        long jLongValue = l.longValue();
        lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null);
        return new lambdanew0androidxcameracoreMetadataImageReader(jLongValue, TimeUnit.MILLISECONDS.toNanos(jLongValue - lambdanew0androidxcameracoremetadataimagereader.b) + lambdanew0androidxcameracoremetadataimagereader.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PreviewSurfaceProvider previewSurfaceProvider) {
        Intrinsics.checkNotNullParameter(previewSurfaceProvider, "");
        previewSurfaceProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.cancelAll(null, 1, null));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PreviewSurfaceProvider previewSurfaceProvider, getPreviewCapabilities getpreviewcapabilities) {
        Intrinsics.checkNotNullParameter(previewSurfaceProvider, "");
        Intrinsics.checkNotNullParameter(getpreviewcapabilities, "");
        synchronized (previewSurfaceProvider.a) {
            previewSurfaceProvider.a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getpreviewcapabilities, previewSurfaceProvider.onTransact);
            lambdaenqueueImageProxy1androidxcameracoreMetadataImageReader lambdaenqueueimageproxy1androidxcameracoremetadataimagereader = previewSurfaceProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Unit unit = Unit.INSTANCE;
        }
        previewSurfaceProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1.postDelayed(previewSurfaceProvider.asInterface, asInterface);
    }
}
