package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.datadog.android.DatadogSite;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BatchProcessingLevel;
import com.datadog.android.core.configuration.BatchSize;
import com.datadog.android.core.configuration.UploadFrequency;
import com.datadog.android.core.internal.time.DatadogNtpEndpoint;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import defpackage.ImageInfo;
import defpackage.lambdasubmitStillCaptureRequest4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.CipherSuite;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0018\u001a\u00020\u00168\u0001@\u0001X\u0080,¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0001@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0019\u001a\u00020\u001d8\u0001@\u0001X\u0081,¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0011\u001a\u00020 8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u001e\u001a\u00020#8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u001b\u001a\u00020\u00138\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0016\u0010!\u001a\u00020'8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0*8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010$\u001a\u0004\u0018\u00010-8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00138\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b0\u0010\u001aR\u0014\u0010+\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R.\u00101\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000104038\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010.\u001a\u0002078\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010(\u001a\u00020:8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u00108\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u00105\u001a\u00020?8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010=\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bC\u0010DR\u0017\u0010@\u001a\u0004\u0018\u00010E8AX\u0081\u0084\u0002¢\u0006\u0006\n\u0004\bF\u0010GR\u0015\u0010;\u001a\u00020H8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bI\u0010GR\u001b\u0010F\u001a\b\u0012\u0004\u0012\u00020K0J8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bL\u0010GR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010I\u001a\u00020P8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010L\u001a\u00020S8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010C\u001a\u00020V8\u0001@\u0001X\u0081,¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Q\u001a\u00020\u00138\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bY\u0010\u001aR\u0016\u0010T\u001a\u00020Z8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010[\u001a\u00020]8\u0001@\u0001X\u0081,¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010Y\u001a\u0004\u0018\u00010`8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010W\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010^\u001a\u00020\u00138\u0001@\u0001X\u0081\f¢\u0006\u0006\n\u0004\be\u0010\u001aR\u0016\u0010f\u001a\u00020\u00138\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bf\u0010\u001aR\u0016\u0010a\u001a\u00020g8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010c\u001a\u00020\u00138\u0001@\u0001X\u0081\f¢\u0006\u0006\n\u0004\bj\u0010\u001aR\u0016\u0010e\u001a\u00020H8\u0001@\u0001X\u0081,¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010h\u001a\u00020p8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010q\u001a\u00020s8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010j\u001a\u00020v8\u0001@\u0001X\u0081,¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010k\u001a\u00020y8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010t\u001a\u00020|8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010}\u001a\u00020\u00138\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u007f\u0010\u001a"}, d2 = {"LlambdasubmitStillCaptureRequest4;", "", "Lcom/datadog/android/api/InternalLogger;", "p0", "LImageProcessor;", "p1", "LImageReaderProxys$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p2", "LnativeWriteJpegToSurface;", "p3", "<init>", "(Lcom/datadog/android/api/InternalLogger;LImageProcessor;LImageReaderProxys$TuitionPaymentFragmentspecialinlinedviewModeldefault3;LnativeWriteJpegToSurface;)V", "", "b", "()V", "Landroid/content/Context;", "Landroid/content/pm/PackageInfo;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)Landroid/content/pm/PackageInfo;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)Ljava/lang/String;", "LconvertYuvToJpegBytesIntoSurface;", "LconvertYuvToJpegBytesIntoSurface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "g", "LImageProcessor;", "Llambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;", "asBinder", "Llambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;", "Lcom/datadog/android/core/configuration/BatchProcessingLevel;", "asInterface", "Lcom/datadog/android/core/configuration/BatchProcessingLevel;", "Lcom/datadog/android/core/configuration/BatchSize;", "d", "Lcom/datadog/android/core/configuration/BatchSize;", "a", "LisSessionProcessorEnabledInCurrentCamera;", "onTransact", "LisSessionProcessorEnabledInCurrentCamera;", "Ljava/lang/ref/WeakReference;", "cancel", "Ljava/lang/ref/WeakReference;", "LgetJpegQualityInternal;", "cancelAll", "LgetJpegQualityInternal;", "INotificationSideChannel", "notify", "LImageReaderProxys$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "", "INotificationSideChannelDefault", "Ljava/util/Map;", "LsetIoExecutor;", "INotificationSideChannelStub", "LsetIoExecutor;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "INotificationSideChannelStubProxy", "Ljava/util/concurrent/atomic/AtomicBoolean;", "RemoteActionCompatParcelizer", "Lcom/datadog/android/api/InternalLogger;", "", "getInterfaceDescriptor", "Z", "LDualSurfaceProcessorExternalSyntheticLambda0;", "connect", "LDualSurfaceProcessorExternalSyntheticLambda0;", "Lcom/google/gson/JsonObject;", "MediaBrowserCompat", "Lkotlin/Lazy;", "Ljava/io/File;", "IconCompatParcelizer", "LImageCaptureCapabilities;", "LImageCapture;", "read", "LonOutputSurface;", "write", "LonOutputSurface;", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "getExtras", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "LsetFlashType;", "getRoot", "LsetFlashType;", "Lokhttp3/OkHttpClient;", "getItem", "Lokhttp3/OkHttpClient;", "disconnect", "LcopyByteBufferToBitmap;", "getNotifyChildrenChangedOptions", "LcopyByteBufferToBitmap;", "LImageReaderProxys;", "getServiceComponent", "LImageReaderProxys;", "LImageProxyDownsamplerForwardingImageProxyImpl$b;", FirebaseAnalytics.Event.SEARCH, "LImageProxyDownsamplerForwardingImageProxyImpl$b;", "getSessionToken", "LnativeWriteJpegToSurface;", "isConnected", "sendCustomAction", "Lcom/datadog/android/DatadogSite;", "MediaBrowserCompatCallbackHandler", "Lcom/datadog/android/DatadogSite;", "setCallbacksMessenger", "subscribe", "Ljava/io/File;", "LlambdarotateYUV1;", "unsubscribe", "LlambdarotateYUV1;", "LgetInputImage;", "handleMessage", "LgetInputImage;", "LconvertYUVToRGBInternal;", "MediaBrowserCompatConnectionCallback", "LconvertYUVToRGBInternal;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "onConnectionFailed", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "Lcom/datadog/android/core/configuration/UploadFrequency;", "setInternalConnectionCallback", "Lcom/datadog/android/core/configuration/UploadFrequency;", "Lprocess;", "onConnected", "Lprocess;", "onConnectionSuspended"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class lambdasubmitStillCaptureRequest4 {
    private static final nativeWriteJpegToSurface MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
    private static final ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 MediaBrowserCompatConnectionCallbackStubApi21;
    private static char MediaBrowserCompatCustomActionCallback;
    private static char MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CipherSuite[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static final long b;
    private static char onError;
    private static int onItemLoaded;
    private static char onProgressUpdate;
    public String INotificationSideChannel;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    final Map<String, Map<String, Object>> notify;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public setIoExecutor cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final AtomicBoolean onTransact;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    final Lazy INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public final Lazy getInterfaceDescriptor;

    /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
    public DatadogSite search;

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallback, reason: from kotlin metadata */
    public convertYUVToRGBInternal handleMessage;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final InternalLogger INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public convertYuvToJpegBytesIntoSurface TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    BatchProcessingLevel TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public WeakReference<Context> a;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public getJpegQualityInternal d;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public DualSurfaceProcessorExternalSyntheticLambda0 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public BatchSize asBinder;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    public String getExtras;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    final ImageProcessor b;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    public NdkCrashHandler IconCompatParcelizer;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public boolean INotificationSideChannelDefault;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    public OkHttpClient connect;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    public copyByteBufferToBitmap getRoot;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    public setFlashType read;

    /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
    public ImageReaderProxys getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    final nativeWriteJpegToSurface getItem;

    /* JADX INFO: renamed from: handleMessage, reason: from kotlin metadata */
    getInputImage MediaBrowserCompatCallbackHandler;

    /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
    public String getServiceComponent;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 cancel;

    /* JADX INFO: renamed from: onConnected, reason: from kotlin metadata */
    public process MediaBrowserCompatConnectionCallback;

    /* JADX INFO: renamed from: onConnectionFailed, reason: from kotlin metadata */
    public ScheduledThreadPoolExecutor setCallbacksMessenger;

    /* JADX INFO: renamed from: onConnectionSuspended, reason: from kotlin metadata */
    public String onConnected;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public isSessionProcessorEnabledInCurrentCamera asInterface;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    final Lazy MediaBrowserCompat;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    public ImageProxyDownsamplerForwardingImageProxyImpl.b disconnect;
    public String sendCustomAction;

    /* JADX INFO: renamed from: setCallbacksMessenger, reason: from kotlin metadata */
    public String getSessionToken;

    /* JADX INFO: renamed from: setInternalConnectionCallback, reason: from kotlin metadata */
    public UploadFrequency subscribe;

    /* JADX INFO: renamed from: subscribe, reason: from kotlin metadata */
    public File isConnected;
    public lambdarotateYUV1 unsubscribe;
    public onOutputSurface write;
    private static final byte[] $$c = {106, -22, 107, 95};
    private static final int $$f = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {49, -45, -112, 57, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 122;
    private static final byte[] $$a = {87, 51, -85, 78, -2, 15, -36, 17, 2, 8, -10, 6, -2, -28, 37, -8, 9, 1, -11, 9};
    private static final int $$b = 27;
    private static int MediaBrowserCompatItemCallback = 1;
    private static int onReceiveResult = 0;
    private static int onResult = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i3 | i5);
        int i8 = i2 | i7;
        int i9 = (~(i5 | (~i2))) | i3;
        int i10 = i3 + i2 + i6 + ((-1932811043) * i4) + (1521317780 * i);
        int i11 = i10 * i10;
        int i12 = ((i3 * (-919556932)) - 154402816) + ((-919556932) * i2) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i6) + ((-2098724864) * i4) + ((-1398800384) * i) + ((-1444151296) * i11);
        int i13 = (i3 * 1794637580) + 2133191799 + (i2 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i6 * 1794637741) + (i4 * (-1844343719)) + (i * (-1188939004)) + (i11 * (-394526720));
        return i12 + ((i13 * i13) * 821297152) != 1 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
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
    private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 13
            int r8 = 16 - r8
            int r9 = r9 * 8
            int r9 = r9 + 103
            byte[] r0 = defpackage.lambdasubmitStillCaptureRequest4.$$a
            int r7 = r7 * 10
            int r7 = 14 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
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
            int r8 = r8 + r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdasubmitStillCaptureRequest4.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r0 = 53 - r7
            int r8 = r8 * 52
            int r8 = r8 + 4
            byte[] r1 = defpackage.lambdasubmitStillCaptureRequest4.$$d
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r8 = r8 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdasubmitStillCaptureRequest4.e(short, int, int, java.lang.Object[]):void");
    }

    public lambdasubmitStillCaptureRequest4(InternalLogger internalLogger, ImageProcessor imageProcessor, ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, nativeWriteJpegToSurface nativewritejpegtosurface) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(imageProcessor, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        Intrinsics.checkNotNullParameter(nativewritejpegtosurface, "");
        this.INotificationSideChannelStub = internalLogger;
        this.b = imageProcessor;
        this.cancel = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.getItem = nativewritejpegtosurface;
        this.onTransact = new AtomicBoolean(false);
        this.a = new WeakReference<>(null);
        this.cancelAll = new setIoExecutor(MapsKt.emptyMap());
        this.read = new setSoftwareJpegEncoderRequested();
        this.unsubscribe = new lambdaconvertYUVToRGB0();
        this.MediaBrowserCompatCallbackHandler = new ImageProcessingUtilResult();
        this.handleMessage = new convertYUVToBitmap();
        this.MediaBrowserCompatConnectionCallback = new ImageProcessorResponse();
        this.asInterface = new getOutputFormat();
        this.g = "";
        this.getExtras = "";
        this.getRoot = new nativeCopyBetweenByteBufferAndBitmap();
        this.sendCustomAction = "";
        this.getSessionToken = "android";
        this.getServiceComponent = "2.14.0";
        this.INotificationSideChannelDefault = true;
        this.INotificationSideChannel = "";
        this.onConnected = "";
        this.asBinder = BatchSize.MEDIUM;
        this.subscribe = UploadFrequency.AVERAGE;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = BatchProcessingLevel.MEDIUM;
        this.IconCompatParcelizer = new isWarnEnabled();
        this.search = DatadogSite.US1;
        this.notify = new ConcurrentHashMap();
        this.getInterfaceDescriptor = LazyKt.lazy(new Function0<JsonObject>() { // from class: com.datadog.android.core.internal.CoreFeature$lastViewEvent$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final JsonObject invoke() {
                JsonObject jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.this$0);
                if (jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    Object[] objArr = {this.this$0};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2140535701, objArr, 2140535702, SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
                return jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            {
                super(0);
            }
        });
        this.INotificationSideChannelStubProxy = LazyKt.lazy(new Function0<File>() { // from class: com.datadog.android.core.internal.CoreFeature$lastViewEventFile$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final File invoke() {
                File file = this.this$0.isConnected;
                if (file == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    file = null;
                }
                return new File(file, "last_view_event");
            }

            {
                super(0);
            }
        });
        this.MediaBrowserCompat = LazyKt.lazy(new Function0<ImageInfo>() { // from class: com.datadog.android.core.internal.CoreFeature$lastViewEventFileWriter$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ImageInfo invoke() {
                ImageInfo.Companion companion = ImageInfo.INSTANCE;
                return ImageInfo.Companion.b(lambdasubmitStillCaptureRequest4.b(this.this$0), this.this$0.write);
            }

            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ nativeWriteJpegToSurface TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onResult + 81;
        onReceiveResult = i2 % 128;
        int i3 = i2 % 2;
        nativeWriteJpegToSurface nativewritejpegtosurface = MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return nativewritejpegtosurface;
    }

    public static final /* synthetic */ JsonObject TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4) {
        File file;
        int i = 2 % 2;
        Object obj = null;
        if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2((File) lambdasubmitstillcapturerequest4.INotificationSideChannelStubProxy.getValue(), lambdasubmitstillcapturerequest4.INotificationSideChannelStub)) {
            int i2 = onResult + 35;
            onReceiveResult = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            file = (File) lambdasubmitstillcapturerequest4.INotificationSideChannelStubProxy.getValue();
        } else {
            Logger.Companion bVar = Logger.INSTANCE;
            File file2 = lambdasubmitstillcapturerequest4.isConnected;
            if (file2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                file2 = null;
            }
            Intrinsics.checkNotNullParameter(file2, "");
            File file3 = new File(Logger.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2), "last_view_event");
            file = ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, lambdasubmitstillcapturerequest4.INotificationSideChannelStub) ^ true ? null : file3;
        }
        if (file == null) {
            return null;
        }
        ImageInfo.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = ImageInfo.INSTANCE;
        List<ImageCapture> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ImageInfo.Companion.b(lambdasubmitstillcapturerequest4.INotificationSideChannelStub, lambdasubmitstillcapturerequest4.write).TuitionPaymentFragmentspecialinlinedviewModeldefault1(file);
        if (!(!listTuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty())) {
            return null;
        }
        JsonObject jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new isReversedHorizontalSet(lambdasubmitstillcapturerequest4.INotificationSideChannelStub).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new String(((ImageCapture) CollectionsKt.last((List) listTuitionPaymentFragmentspecialinlinedviewModeldefault1)).TuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8));
        int i3 = onReceiveResult + 61;
        onResult = i3 % 128;
        int i4 = i3 % 2;
        return jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static final /* synthetic */ ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onResult + 31;
        int i3 = i2 % 128;
        onReceiveResult = i3;
        int i4 = i2 % 2;
        ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaBrowserCompatConnectionCallbackStubApi21;
        int i5 = i3 + 25;
        onResult = i5 % 128;
        if (i5 % 2 != 0) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    public static final /* synthetic */ InternalLogger b(lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4) {
        int i = 2 % 2;
        int i2 = onReceiveResult + 19;
        int i3 = i2 % 128;
        onResult = i3;
        int i4 = i2 % 2;
        Object obj = null;
        InternalLogger internalLogger = lambdasubmitstillcapturerequest4.INotificationSideChannelStub;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 91;
        onReceiveResult = i5 % 128;
        if (i5 % 2 == 0) {
            return internalLogger;
        }
        obj.hashCode();
        throw null;
    }

    private static void f(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i3 = $11 + 23;
            $10 = i3 % 128;
            char c2 = 1;
            if (i3 % 2 != 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 << 1];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i8 = i7;
                int i9 = (c4 + i6) ^ ((c4 << 4) + ((char) (((long) onError) ^ 8611973335120459638L)));
                int i10 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c2] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c5 = (char) (47774 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 468;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c5, doubleTapTimeout, edgeSlop, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) onProgressUpdate) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaBrowserCompatCustomActionCallback)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 469 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 13 - View.getDefaultSize(0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i8 + 1;
                    c2 = 1;
                    c = 0;
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
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.blue(0), (ViewConfiguration.getTapTimeout() >> 16) + 2323, TextUtils.indexOf("", "", 0, 0) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f A[PHI: r1
  0x002f: PHI (r1v9 android.content.Context) = (r1v8 android.content.Context), (r1v26 android.content.Context) binds: [B:10:0x002d, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Context context;
        int i = 2 % 2;
        if (this.onTransact.get()) {
            int i2 = onReceiveResult + 83;
            onResult = i2 % 128;
            if (i2 % 2 == 0) {
                context = this.a.get();
                int i3 = 87 / 0;
                if (context != null) {
                    this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context);
                    this.unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault2(context);
                }
            } else {
                context = this.a.get();
                if (context != null) {
                    this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context);
                    this.unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault2(context);
                }
            }
            this.a.clear();
            this.handleMessage.TuitionPaymentFragmentbindingInflater1();
            this.g = "";
            this.getExtras = "";
            this.getRoot = new nativeCopyBetweenByteBufferAndBitmap();
            this.sendCustomAction = "";
            this.getSessionToken = "android";
            this.getServiceComponent = "2.14.0";
            this.INotificationSideChannelDefault = true;
            this.INotificationSideChannel = "";
            this.onConnected = "";
            this.cancelAll = new setIoExecutor(MapsKt.emptyMap());
            this.read = new setSoftwareJpegEncoderRequested();
            this.unsubscribe = new lambdaconvertYUVToRGB0();
            this.MediaBrowserCompatCallbackHandler = new ImageProcessingUtilResult();
            this.handleMessage = new convertYUVToBitmap();
            this.MediaBrowserCompatConnectionCallback = new ImageProcessorResponse();
            nativeConvertAndroid420ToBitmap nativeconvertandroid420tobitmap = new nativeConvertAndroid420ToBitmap();
            Intrinsics.checkNotNullParameter(nativeconvertandroid420tobitmap, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = nativeconvertandroid420tobitmap;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.setCallbacksMessenger;
            ImageReaderProxys imageReaderProxys = null;
            if (scheduledThreadPoolExecutor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                scheduledThreadPoolExecutor = null;
            }
            scheduledThreadPoolExecutor.shutdownNow();
            ImageReaderProxys imageReaderProxys2 = this.getNotifyChildrenChangedOptions;
            if (imageReaderProxys2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageReaderProxys2 = null;
            }
            imageReaderProxys2.shutdownNow();
            try {
                try {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.setCallbacksMessenger;
                    if (scheduledThreadPoolExecutor2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        scheduledThreadPoolExecutor2 = null;
                    }
                    scheduledThreadPoolExecutor2.awaitTermination(1L, TimeUnit.SECONDS);
                    ImageReaderProxys imageReaderProxys3 = this.getNotifyChildrenChangedOptions;
                    if (imageReaderProxys3 != null) {
                        int i4 = onReceiveResult + 97;
                        onResult = i4 % 128;
                        int i5 = i4 % 2;
                        imageReaderProxys = imageReaderProxys3;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i6 = onResult + 19;
                        onReceiveResult = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    imageReaderProxys.awaitTermination(1L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } catch (SecurityException e2) {
                this.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.CoreFeature$shutDownExecutors$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Thread was unable to set its own interrupted state";
                    }
                }, e2, false, null);
            }
            try {
                DualSurfaceProcessorExternalSyntheticLambda0 dualSurfaceProcessorExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
                if (dualSurfaceProcessorExternalSyntheticLambda0 != null) {
                    int i8 = onReceiveResult + 21;
                    onResult = i8 % 128;
                    int i9 = i8 % 2;
                    dualSurfaceProcessorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            } catch (IllegalStateException e3) {
                this.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.CoreFeature$stop$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Trying to shut down Kronos when it is already not running";
                    }
                }, e3, false, null);
            }
            this.notify.clear();
            this.onTransact.set(false);
            this.IconCompatParcelizer = new isWarnEnabled();
            this.handleMessage = new convertYUVToBitmap();
            this.asInterface = new getOutputFormat();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = (lambdasubmitStillCaptureRequest4) objArr[0];
        int i = 2 % 2;
        if (!(!ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2((File) lambdasubmitstillcapturerequest4.INotificationSideChannelStubProxy.getValue(), lambdasubmitstillcapturerequest4.INotificationSideChannelStub))) {
            ImageCaptureOutputFileResults.TuitionPaymentFragmentbindingInflater1((File) lambdasubmitstillcapturerequest4.INotificationSideChannelStubProxy.getValue(), lambdasubmitstillcapturerequest4.INotificationSideChannelStub);
            return null;
        }
        Logger.Companion bVar = Logger.INSTANCE;
        File file = lambdasubmitstillcapturerequest4.isConnected;
        if (file != null) {
            int i2 = onResult + 39;
            onReceiveResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
            file = null;
        }
        Intrinsics.checkNotNullParameter(file, "");
        File file2 = new File(Logger.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file), "last_view_event");
        if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, lambdasubmitstillcapturerequest4.INotificationSideChannelStub)) {
            ImageCaptureOutputFileResults.TuitionPaymentFragmentbindingInflater1(file2, lambdasubmitstillcapturerequest4.INotificationSideChannelStub);
            int i3 = onReceiveResult + 63;
            onResult = i3 % 128;
            int i4 = i3 % 2;
        }
        return null;
    }

    public final PackageInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) throws Throwable {
        String string;
        Method method;
        Method method2;
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this;
        int i = 2;
        int i2 = 2 % 2;
        try {
            PackageManager packageManager = p0.getPackageManager();
            int i3 = 0;
            if (Build.VERSION.SDK_INT >= 33) {
                String str = lambdasubmitstillcapturerequest4.getExtras;
                PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0L);
                if (getMaxPreviewResolution.TuitionPaymentFragmentbindingInflater1(new ArrayList()) == 0) {
                    return packageManager.getPackageInfo(str, packageInfoFlagsOf);
                }
                throw new NullPointerException();
            }
            ArrayList arrayList = new ArrayList();
            int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            Class<?> cls = Class.forName("android.content.pm.PackageManager");
            byte[] bArr = $$a;
            byte b2 = bArr[17];
            byte b3 = (byte) (b2 - 1);
            byte b4 = b2;
            Object[] objArr = new Object[1];
            c(b3, b4, (byte) (b4 - 1), objArr);
            String str2 = (String) objArr[0];
            Class<?>[] clsArr = {String.class, Integer.TYPE};
            Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
            byte b5 = bArr[17];
            byte b6 = (byte) (b5 - 1);
            byte b7 = b5;
            Object[] objArr2 = new Object[1];
            c(b6, b7, (byte) (b7 - 1), objArr2);
            Method[] methodArr = {cls.getMethod(str2, clsArr), cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                int i5 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte b8 = $$d[7];
                byte b9 = b8;
                Object[] objArr3 = new Object[1];
                e(b8, b9, b9, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, i5, 1814927978, false, (String) objArr3[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetAfter("", 0), 2823 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22)).getDeclaredMethods();
                int length = declaredMethods.length;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = onReceiveResult + 73;
                    onResult = i7 % 128;
                    if (i7 % i == 0) {
                        method2 = declaredMethods[i6];
                        int i8 = 49 / i3;
                    } else {
                        method2 = declaredMethods[i6];
                    }
                    try {
                        Object[] objArr4 = new Object[1];
                        f(new char[]{61507, 19440, 18347, 29719, 56788, 23220, 6337, 6999, 58017, 19668, 59894, 56555, 58005, 41921, 2047, 25436, 17698, 63660, 25699, 42125, 31079, 31274, 61722, 60117, 8946, 64018}, ImageFormat.getBitsPerPixel(i3) + 25, objArr4);
                        Class<?> cls3 = Class.forName((String) objArr4[i3]);
                        Object[] objArr5 = new Object[1];
                        f(new char[]{56969, 63780, 55593, 12207, 5710, 50598, 64813, 38232, 20360, 9738, 42802, 28896, 32512, 63585}, 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
                        Object[] objArr6 = new Object[1];
                        objArr6[i3] = Integer.valueOf(((Integer) cls3.getMethod((String) objArr5[i3], null).invoke(method2, null)).intValue());
                        Object[] objArr7 = new Object[1];
                        f(new char[]{57355, 41995, 11234, 22409, 36176, 21281, 61540, 3475, 10946, 32497, 16426, 21852, 54375, 4329, 29041, 13532, 25584, 62787, 59486, 49465, 32527, 61596, 50309, 29481, 62068, 30291, 5906, 53032}, 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr7);
                        Class<?> cls4 = Class.forName((String) objArr7[i3]);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i3, i3) + 8;
                        Object[] objArr8 = new Object[1];
                        f(new char[]{7237, 18751, 55202, 22304, 24598, 24795, 42738, 27152, 59124, 38117}, iCombineMeasuredStates, objArr8);
                        if (((Boolean) cls4.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                            int i9 = onReceiveResult + 41;
                            onResult = i9 % 128;
                            int i10 = i9 % 2;
                            Class cls5 = Long.TYPE;
                            Object[] objArr9 = new Object[1];
                            f(new char[]{61507, 19440, 18347, 29719, 56788, 23220, 6337, 6999, 58017, 19668, 59894, 56555, 58005, 41921, 2047, 25436, 17698, 63660, 25699, 42125, 31079, 31274, 61722, 60117, 8946, 64018}, 24 - (Process.myPid() >> 22), objArr9);
                            Class<?> cls6 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            f(new char[]{45351, 65034, 39598, 3248, 12571, 46410, 56724, 53989, 31535, 31368, 37795, 61491, 63758, 10960, 34441, 37853}, 13 - Color.blue(0), objArr10);
                            if (!cls5.equals(cls6.getMethod((String) objArr10[0], null).invoke(method2, null))) {
                                continue;
                            } else {
                                Object[] objArr11 = new Object[1];
                                f(new char[]{61507, 19440, 18347, 29719, 56788, 23220, 6337, 6999, 58017, 19668, 59894, 56555, 58005, 41921, 2047, 25436, 17698, 63660, 25699, 42125, 31079, 31274, 61722, 60117, 8946, 64018}, 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr11);
                                Class<?> cls7 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                f(new char[]{14793, 12051, 24153, 35147, 2886, 22543, 47769, 57396, 32862, 19496, 41376, 55795, 48516, 63631, 58182, 52980, 28543, 64704, 48245, 10558}, 17 - View.resolveSize(0, 0), objArr12);
                                Object[] objArr13 = (Object[]) cls7.getMethod((String) objArr12[0], null).invoke(method2, null);
                                if (objArr13.length == 2) {
                                    int i11 = onResult + 79;
                                    onReceiveResult = i11 % 128;
                                    int i12 = i11 % 2;
                                    if (!(!Long.TYPE.equals(objArr13[0]))) {
                                        int i13 = onReceiveResult + 97;
                                        onResult = i13 % 128;
                                        int i14 = i13 % 2;
                                        Object[] objArr14 = new Object[1];
                                        f(new char[]{61507, 19440, 18347, 29719, 56788, 23220, 6337, 6999, 58017, 19668, 59894, 56555, 58005, 41921, 2047, 25436, 17698, 63660, 25699, 42125, 31079, 31274, 61722, 60117, 8946, 64018}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, objArr14);
                                        if (!(!Class.forName((String) objArr14[0]).equals(objArr13[1]))) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int iLastIndexOf = 2822 - TextUtils.lastIndexOf("", '0');
                                                int deadChar = KeyEvent.getDeadChar(0, 0) + 22;
                                                byte b10 = $$d[7];
                                                byte b11 = b10;
                                                Object[] objArr15 = new Object[1];
                                                e(b10, b11, b11, objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iLastIndexOf, deadChar, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 2824;
                                                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 22;
                                                byte b12 = $$d[7];
                                                byte b13 = b12;
                                                Object[] objArr16 = new Object[1];
                                                e(b12, b13, b13, objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iIndexOf, iIndexOf2, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            try {
                                                Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int iRgb = (-16774393) - Color.rgb(0, 0, 0);
                                                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 22;
                                                    byte[] bArr2 = $$d;
                                                    byte b14 = bArr2[54];
                                                    byte b15 = (byte) (-bArr2[5]);
                                                    Object[] objArr18 = new Object[1];
                                                    e(b14, b15, b15, objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, iRgb, offsetBefore, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr17)).longValue();
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        i6++;
                        i = 2;
                        i3 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int iIndexOf3 = 2823 - TextUtils.indexOf("", "");
                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 23;
                byte b16 = $$d[7];
                byte b17 = b16;
                Object[] objArr19 = new Object[1];
                e(b16, b17, b17, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iIndexOf3, iIndexOf4, 1814927978, false, (String) objArr19[0], null);
            }
            try {
                Object[] objArr20 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int touchSlop = 2823 - (ViewConfiguration.getTouchSlop() >> 8);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
                    byte b18 = (byte) (-$$d[5]);
                    Object[] objArr21 = new Object[1];
                    e((byte) 14, b18, b18, objArr21);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, touchSlop, fadingEdgeLength, 1025296417, false, (String) objArr21[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr20);
                try {
                    Object[] objArr22 = {0, methodArr, null};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cArgb = (char) (37657 - Color.argb(0, 0, 0, 0));
                        int i15 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2719;
                        int edgeSlop = 19 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b19 = (byte) (-$$d[5]);
                        Object[] objArr23 = new Object[1];
                        e((byte) 14, b19, b19, objArr23);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cArgb, i15, edgeSlop, -1568796068, false, (String) objArr23[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr22)).longValue();
                    long j = -940811252;
                    long j2 = -1;
                    long j3 = ((j ^ j2) | jLongValue) ^ j2;
                    long jIdentityHashCode = System.identityHashCode(this);
                    long j4 = 70;
                    long j5 = (((long) 71) * j) + (((long) (-69)) * jLongValue) + (((long) (-140)) * (j3 | ((jLongValue | jIdentityHashCode) ^ j2))) + ((((j | jLongValue) | jIdentityHashCode) ^ j2) * j4) + (j4 * (((jIdentityHashCode | j) ^ j2) | j3 | (((jLongValue ^ j2) | j) ^ j2))) + ((long) (-869594593));
                    int i16 = (int) (j5 >> 32);
                    try {
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i17 = i16 & ((-484646000) + (((~((-398261791) | iIdentityHashCode)) | 363615756) * 345) + (((~((-398261791) | (~iIdentityHashCode))) | 675348864) * 345) + ((~(iIdentityHashCode | (-363615757))) * 345));
                        int i18 = ~new Random().nextInt();
                        int i19 = i17 | (((int) j5) & (1309775001 + ((~((-676372770) | i18)) * (-783)) + (((~(i18 | (-1056765734))) | 380460676) * 783)));
                        int i20 = i19 >>> 24;
                        int i21 = i19 & ViewCompat.MEASURED_SIZE_MASK;
                        int i22 = i20 != 0 ? 1 : 0;
                        if ((i22 ^ 1) == 1 || i21 >= 2 || (method = methodArr[i21]) == null) {
                            string = null;
                        } else {
                            int i23 = onResult + 75;
                            onReceiveResult = i23 % 128;
                            if (i23 % 2 != 0) {
                                string = method.toString();
                                int i24 = 33 / 0;
                            } else {
                                string = method.toString();
                            }
                        }
                        arrayList.add(string);
                        if ((i20 + 6) * i22 != 0) {
                            int[] iArr = new int[iIntValue];
                            int i25 = iIntValue - 1;
                            iArr[i25] = 1;
                            Toast.makeText((Context) null, iArr[((iIntValue * i25) % 2) - 1], 1).show();
                        }
                        return packageManager.getPackageInfo(this.getExtras, 0);
                    } catch (PackageManager.NameNotFoundException e2) {
                        e = e2;
                        lambdasubmitstillcapturerequest4 = this;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
        }
        lambdasubmitstillcapturerequest4.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.CoreFeature$getPackageInfo$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Unable to read your application's version name";
            }
        }, e, false, null);
        return null;
    }

    /* JADX INFO: renamed from: lambdasubmitStillCaptureRequest4$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013"}, d2 = {"LlambdasubmitStillCaptureRequest4$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "LImageReaderProxys$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "MediaBrowserCompatConnectionCallbackStubApi21", "LImageReaderProxys$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "b", "()LImageReaderProxys$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LnativeWriteJpegToSurface;", "MediaBrowserCompatConnectionCallbackConnectionCallbackInternal", "LnativeWriteJpegToSurface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LnativeWriteJpegToSurface;", "", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Lokhttp3/CipherSuite;", "[Lokhttp3/CipherSuite;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b() {
            return lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        public static nativeWriteJpegToSurface TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentbindingInflater1();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        Method method;
        Method[] declaredMethods;
        int length;
        int i;
        int i2 = 0;
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = (lambdasubmitStillCaptureRequest4) objArr[0];
        int i3 = 2;
        int i4 = 2 % 2;
        AssetManager assets = ((Context) objArr[1]).getAssets();
        try {
            try {
                ArrayList arrayList = new ArrayList();
                int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, lambdasubmitstillcapturerequest4)).intValue();
                byte b2 = $$a[17];
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                c(b3, (byte) (b3 - 1), b2, objArr2);
                Method[] methodArr = {AssetManager.class.getMethod((String) objArr2[0], String.class)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    try {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int iRgb = Color.rgb(0, 0, 0) + 16780039;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                        byte b4 = $$d[7];
                        byte b5 = b4;
                        Object[] objArr3 = new Object[1];
                        e(b4, b5, b5, objArr3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iRgb, keyRepeatDelay, 1814927978, false, (String) objArr3[0], null);
                    } catch (Exception e2) {
                        e = e2;
                        lambdasubmitstillcapturerequest4.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.CoreFeature$readBuildId$1$3
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                return "Failed to read Build ID information, de-obfuscation may not work properly.";
                            }
                        }, e, false, null);
                        return null;
                    }
                }
                Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i5 = 14;
                if (obj == null) {
                    int i6 = onReceiveResult + 87;
                    onResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2824, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getDeclaredMethods();
                        length = declaredMethods.length;
                        i = 1;
                    } else {
                        declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSizeAndState(0, 0, 0), Process.getGidForName("") + 2824, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21)).getDeclaredMethods();
                        length = declaredMethods.length;
                        i = 0;
                    }
                    while (i < length) {
                        int i7 = onReceiveResult;
                        int i8 = i7 + 69;
                        onResult = i8 % 128;
                        int i9 = i8 % i3;
                        Method method2 = declaredMethods[i];
                        int i10 = i7 + 23;
                        onResult = i10 % 128;
                        int i11 = i10 % i3;
                        try {
                            Object[] objArr4 = new Object[1];
                            f(new char[]{61507, 19440, 18347, 29719, 56788, 23220, 6337, 6999, 58017, 19668, 59894, 56555, 58005, 41921, 2047, 25436, 17698, 63660, 25699, 42125, 31079, 31274, 61722, 60117, 8946, 64018}, ((Process.getThreadPriority(i2) + 20) >> 6) + 24, objArr4);
                            Class<?> cls = Class.forName((String) objArr4[i2]);
                            char[] cArr = new char[i5];
                            // fill-array-data instruction
                            cArr[0] = 56969;
                            cArr[1] = 63780;
                            cArr[2] = 55593;
                            cArr[3] = 12207;
                            cArr[4] = 5710;
                            cArr[5] = 50598;
                            cArr[6] = 64813;
                            cArr[7] = 38232;
                            cArr[8] = 20360;
                            cArr[9] = 9738;
                            cArr[10] = 42802;
                            cArr[11] = 28896;
                            cArr[12] = 32512;
                            cArr[13] = 63585;
                            Object[] objArr5 = new Object[1];
                            f(cArr, (-16777204) - Color.rgb(i2, i2, i2), objArr5);
                            Object[] objArr6 = new Object[1];
                            objArr6[i2] = Integer.valueOf(((Integer) cls.getMethod((String) objArr5[i2], null).invoke(method2, null)).intValue());
                            Object[] objArr7 = new Object[1];
                            f(new char[]{57355, 41995, 11234, 22409, 36176, 21281, 61540, 3475, 10946, 32497, 16426, 21852, 54375, 4329, 29041, 13532, 25584, 62787, 59486, 49465, 32527, 61596, 50309, 29481, 62068, 30291, 5906, 53032}, 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
                            Class<?> cls2 = Class.forName((String) objArr7[i2]);
                            Object[] objArr8 = new Object[1];
                            f(new char[]{7237, 18751, 55202, 22304, 24598, 24795, 42738, 27152, 59124, 38117}, (ViewConfiguration.getPressedStateDuration() >> 16) + 8, objArr8);
                            if (((Boolean) cls2.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                Object[] objArr9 = new Object[1];
                                f(new char[]{61507, 19440, 18347, 29719, 56788, 23220, 6337, 6999, 58017, 19668, 59894, 56555, 58005, 41921, 2047, 25436, 17698, 63660, 25699, 42125, 31079, 31274, 61722, 60117, 8946, 64018}, View.MeasureSpec.makeMeasureSpec(0, 0) + 24, objArr9);
                                Class<?> cls4 = Class.forName((String) objArr9[0]);
                                Object[] objArr10 = new Object[1];
                                f(new char[]{45351, 65034, 39598, 3248, 12571, 46410, 56724, 53989, 31535, 31368, 37795, 61491, 63758, 10960, 34441, 37853}, TextUtils.lastIndexOf("", '0', 0, 0) + 14, objArr10);
                                if (cls3.equals(cls4.getMethod((String) objArr10[0], null).invoke(method2, null))) {
                                    Object[] objArr11 = new Object[1];
                                    f(new char[]{61507, 19440, 18347, 29719, 56788, 23220, 6337, 6999, 58017, 19668, 59894, 56555, 58005, 41921, 2047, 25436, 17698, 63660, 25699, 42125, 31079, 31274, 61722, 60117, 8946, 64018}, TextUtils.indexOf("", "") + 24, objArr11);
                                    Class<?> cls5 = Class.forName((String) objArr11[0]);
                                    Object[] objArr12 = new Object[1];
                                    f(new char[]{14793, 12051, 24153, 35147, 2886, 22543, 47769, 57396, 32862, 19496, 41376, 55795, 48516, 63631, 58182, 52980, 28543, 64704, 48245, 10558}, 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr12);
                                    Object[] objArr13 = (Object[]) cls5.getMethod((String) objArr12[0], null).invoke(method2, null);
                                    if (objArr13.length == 2 && Long.TYPE.equals(objArr13[0])) {
                                        Object[] objArr14 = new Object[1];
                                        f(new char[]{61507, 19440, 18347, 29719, 56788, 23220, 6337, 6999, 58017, 19668, 59894, 56555, 58005, 41921, 2047, 25436, 17698, 63660, 25699, 42125, 31079, 31274, 61722, 60117, 8946, 64018}, 24 - (ViewConfiguration.getTapTimeout() >> 16), objArr14);
                                        if (!(!Class.forName((String) objArr14[0]).equals(objArr13[1]))) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                int i12 = 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                int iMyTid = 22 - (Process.myTid() >> 22);
                                                byte b6 = $$d[7];
                                                byte b7 = b6;
                                                Object[] objArr15 = new Object[1];
                                                e(b6, b7, b7, objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i12, iMyTid, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 23;
                                                byte b8 = $$d[7];
                                                byte b9 = b8;
                                                Object[] objArr16 = new Object[1];
                                                e(b8, b9, b9, objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, absoluteGravity, iLastIndexOf, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            try {
                                                Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                                                    int maxKeyCode = 2823 - (KeyEvent.getMaxKeyCode() >> 16);
                                                    int iMyPid = 22 - (Process.myPid() >> 22);
                                                    byte[] bArr = $$d;
                                                    byte b10 = bArr[54];
                                                    byte b11 = (byte) (-bArr[5]);
                                                    Object[] objArr18 = new Object[1];
                                                    e(b10, b11, b11, objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity2, maxKeyCode, iMyPid, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr17)).longValue();
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i++;
                            i2 = 0;
                            i3 = 2;
                            i5 = 14;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2823;
                    int iNormalizeMetaState = 22 - KeyEvent.normalizeMetaState(0);
                    byte b12 = $$d[7];
                    byte b13 = b12;
                    Object[] objArr19 = new Object[1];
                    e(b12, b13, b13, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, windowTouchSlop, iNormalizeMetaState, 1814927978, false, (String) objArr19[0], null);
                }
                try {
                    try {
                        Object[] objArr20 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int iArgb = Color.argb(0, 0, 0, 0) + 2823;
                            int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 22;
                            byte b14 = (byte) (-$$d[5]);
                            Object[] objArr21 = new Object[1];
                            e((byte) 14, b14, b14, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, iArgb, absoluteGravity3, 1025296417, false, (String) objArr21[0], new Class[]{Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr20);
                        try {
                            Object[] objArr22 = {0, methodArr, null};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char keyRepeatTimeout = (char) (37657 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2720;
                                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 20;
                                byte b15 = (byte) (-$$d[5]);
                                Object[] objArr23 = new Object[1];
                                e((byte) 14, b15, b15, objArr23);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout, doubleTapTimeout, bitsPerPixel, -1568796068, false, (String) objArr23[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr22)).longValue();
                            long j = -479755968;
                            long j2 = -167;
                            long j3 = (j2 * j) + (j2 * jLongValue);
                            long j4 = 168;
                            long j5 = -1;
                            long j6 = j ^ j5;
                            long j7 = jLongValue ^ j5;
                            long j8 = j6 | j7;
                            long jMyTid = Process.myTid();
                            long j9 = jMyTid ^ j5;
                            long j10 = j3 + (((j8 ^ j5) | ((j7 | j9) ^ j5)) * j4) + (((j8 | jMyTid) ^ j5) * j4) + (j4 * (((jMyTid | (j7 | j)) ^ j5) | ((j6 | j9) ^ j5) | ((j6 | jLongValue) ^ j5))) + ((long) (-1330649877));
                            int i13 = (int) (j10 >> 32);
                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                            int i14 = ~iMaxMemory;
                            int i15 = i13 & (799102044 + (((~(685000131 | i14)) | (~((-8406146) | iMaxMemory))) * (-831)) + ((~(2130632687 | iMaxMemory)) * (-1662)) + (((~(iMaxMemory | (-685000132))) | (~(i14 | (-2122226543))) | (~(2122226542 | iMaxMemory))) * 831));
                            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                            int i16 = i15 | (((int) j10) & (1320243365 + (((~((-1025479227) | iMaxMemory2)) | 756420634) * 1504) + ((~(iMaxMemory2 | (-269058593))) * (-1504)) + 2047197424));
                            int i17 = i16 >>> 24;
                            int i18 = i16 & ViewCompat.MEASURED_SIZE_MASK;
                            int i19 = i17 != 0 ? 1 : 0;
                            arrayList.add(((i19 ^ 1) == 0 && i18 < 1 && (method = methodArr[i18]) != null) ? method.toString() : null);
                            if ((i17 + 6) * i19 != 0) {
                                int i20 = onResult + 7;
                                onReceiveResult = i20 % 128;
                                int i21 = i20 % 2;
                                Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
                            }
                            InputStream inputStreamOpen = assets.open("datadog.buildId");
                            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
                            try {
                                String string = StringsKt.trim((CharSequence) TextStreamsKt.readText(bufferedReader)).toString();
                                CloseableKt.closeFinally(bufferedReader, null);
                                return string;
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    CloseableKt.closeFinally(bufferedReader, th3);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            Throwable cause3 = th5.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        Throwable cause4 = th6.getCause();
                        if (cause4 != null) {
                            throw cause4;
                        }
                        throw th6;
                    }
                } catch (FileNotFoundException unused) {
                    lambdasubmitstillcapturerequest4 = 1814927978;
                    lambdasubmitstillcapturerequest4.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.CoreFeature$readBuildId$1$2
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Build ID is not found in the application assets. If you are using obfuscation, please use Datadog Gradle Plugin 1.13.0 or above to be able to de-obfuscate stacktraces.";
                        }
                    }, null, false, null);
                    return null;
                } catch (Exception e3) {
                    e = e3;
                    lambdasubmitstillcapturerequest4 = 1814927978;
                    lambdasubmitstillcapturerequest4.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.CoreFeature$readBuildId$1$3
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Failed to read Build ID information, de-obfuscation may not work properly.";
                        }
                    }, e, false, null);
                    return null;
                }
            } catch (FileNotFoundException unused2) {
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    static {
        onItemLoaded = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        MediaBrowserCompatConnectionCallbackStubApi21 = new ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3() { // from class: getTakePictureCropRect
            @Override // ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            public final ImageReaderProxys TuitionPaymentFragmentbindingInflater1(InternalLogger internalLogger, String str, lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy) {
                return lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(internalLogger, str, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy);
            }
        };
        MediaBrowserCompatConnectionCallbackConnectionCallbackInternal = new nativeWriteJpegToSurface() { // from class: sendInvalidCameraError
            @Override // defpackage.nativeWriteJpegToSurface
            public final ScheduledExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger internalLogger, String str, lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy) {
                return lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(internalLogger, str, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy);
            }
        };
        b = TimeUnit.SECONDS.toMillis(45L);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new CipherSuite[]{CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384};
        int i = MediaBrowserCompatItemCallback + 107;
        onItemLoaded = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ImageReaderProxys TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger internalLogger, String str, lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, "");
        nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr = new nativeConvertAndroid420ToABGR(internalLogger, str, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy);
        int i2 = onReceiveResult + 33;
        onResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
        return nativeconvertandroid420toabgr;
    }

    public static /* synthetic */ ScheduledExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault2(InternalLogger internalLogger, String str, lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, "");
        rotateYUVInternal rotateyuvinternal = new rotateYUVInternal(str, internalLogger, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy);
        int i2 = onResult + 21;
        onReceiveResult = i2 % 128;
        if (i2 % 2 == 0) {
            return rotateyuvinternal;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4, Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(lambdasubmitstillcapturerequest4, "");
        Intrinsics.checkNotNullParameter(context, "");
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        Context context2 = contextCreateDeviceProtectedStorageContext == null ? context : contextCreateDeviceProtectedStorageContext;
        lambdaexecuteSafely8androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdaexecutesafely8androidxcameracoreprocessingconcurrentdualsurfaceprocessor = lambdaexecuteSafely8androidxcameracoreprocessingconcurrentDualSurfaceProcessor.INSTANCE;
        List listListOf = CollectionsKt.listOf((Object[]) new DatadogNtpEndpoint[]{DatadogNtpEndpoint.NTP_0, DatadogNtpEndpoint.NTP_1, DatadogNtpEndpoint.NTP_2, DatadogNtpEndpoint.NTP_3});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            int i2 = onResult + 55;
            onReceiveResult = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(((DatadogNtpEndpoint) it.next()).getHost());
        }
        DualSurfaceProcessorExternalSyntheticLambda0 dualSurfaceProcessorExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdaexecuteSafely8androidxcameracoreprocessingconcurrentDualSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context2, new writeJpegBytesToSurface(lambdasubmitstillcapturerequest4.INotificationSideChannelStub), arrayList, TimeUnit.MINUTES.toMillis(5L), TimeUnit.MINUTES.toMillis(30L));
        try {
            dualSurfaceProcessorExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        } catch (IllegalStateException e2) {
            lambdasubmitstillcapturerequest4.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.CoreFeature$initializeClockSync$2$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Unable to launch a synchronize local time with an NTP server.";
                }
            }, e2, false, null);
        }
        lambdasubmitstillcapturerequest4.MediaBrowserCompatCallbackHandler = new ImageProcessingUtilExternalSyntheticLambda0(dualSurfaceProcessorExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        lambdasubmitstillcapturerequest4.RemoteActionCompatParcelizer = dualSurfaceProcessorExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = onReceiveResult + 61;
        onResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault3(SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1756059032, new Object[]{this, p0}, 1756059032, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2140535701, new Object[]{this}, 2140535702, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        onProgressUpdate = (char) 12518;
        MediaBrowserCompatCustomActionCallback = (char) 18802;
        onError = (char) 10552;
        MediaBrowserCompatCustomActionResultReceiver = (char) 58138;
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
    private static java.lang.String $$g(short r7, int r8, short r9) {
        /*
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = r7 + 108
            byte[] r0 = defpackage.lambdasubmitStillCaptureRequest4.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r9 = r9 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
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
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdasubmitStillCaptureRequest4.$$g(short, int, short):java.lang.String");
    }
}
