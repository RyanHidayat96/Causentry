package com.datadog.android.rum.internal.domain.scope;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda9;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumPerformanceMetric;
import com.datadog.android.rum.internal.RumErrorSourceType;
import com.datadog.android.rum.internal.anr.ANRException;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ImageAnalysisNonBlockingAnalyzer1;
import defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
import defpackage.LayoutSettings;
import defpackage.MetadataImageReaderExternalSyntheticLambda0;
import defpackage.MirrorMode;
import defpackage.MirrorModeMirror;
import defpackage.Preview;
import defpackage.PreviewBuilder;
import defpackage.PreviewExternalSyntheticLambda3;
import defpackage.SafeCloseImageReaderProxy;
import defpackage.deInitSession;
import defpackage.downsample;
import defpackage.getDefaultPointSize;
import defpackage.getExecutedTimeInMillis;
import defpackage.getPreviewCapabilities;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getRetryDelayInMillis;
import defpackage.getStatus;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.isImageFormatSupported;
import defpackage.lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdanew0androidxcameracoreMetadataImageReader;
import defpackage.lambdasendSurfaceRequest2;
import defpackage.onAppEdgeInvalidated;
import defpackage.onSurfaceRequested;
import defpackage.recalculateTransformMatrixAndCropRect;
import defpackage.resetMinLogLevel;
import defpackage.setJpegQuality;
import defpackage.setTimeoutInMillis;
import defpackage.shouldMirror;
import defpackage.shouldRetry;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0011\u0018\u0000 02\u00020\u0001:\u00030\u0080\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020!2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\"H\u0003¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010(J'\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020!2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\"H\u0017¢\u0006\u0004\b'\u0010)J\u000f\u0010*\u001a\u00020\u001bH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001bH\u0002¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020#H\u0002¢\u0006\u0004\b-\u0010.J-\u00100\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020!2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\"2\u0006\u0010\u0006\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J3\u0010'\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020!2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\"2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020#02H\u0003¢\u0006\u0004\b'\u00103J\u0019\u0010*\u001a\u00020#2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b*\u00104R\u0016\u0010,\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010$\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b*\u00108R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001098\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010*\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010'\u001a\u00020?8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b,\u0010@R\u0014\u0010C\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010-\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u00107R \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000205098\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bE\u0010;R\u0016\u0010H\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u00107R\"\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r098\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010;R\u0014\u0010J\u001a\u0002058\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\bF\u00107R\"\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r098\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bK\u0010;R\u0014\u0010O\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020?8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b-\u0010@R\u0014\u0010U\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bT\u0010BR\u0016\u0010W\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u00107R\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\\\u0010;R\u0014\u0010_\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\bI\u0010^R\u0018\u00106\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010bR\u0016\u0010=\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u00107R\u0016\u0010:\u001a\u00020?8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bC\u0010@R\u0014\u0010g\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bf\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\f0h8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010G\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bk\u00108R\u0016\u0010D\u001a\u0002058\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bH\u00107R\u0016\u0010K\u001a\u0002058\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bL\u00107R\u0016\u0010A\u001a\u0002058\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bJ\u00107R\u0016\u0010V\u001a\u0002058\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bO\u00107R\u0016\u0010M\u001a\u0002058\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bS\u00107R\"\u0010T\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020`098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bm\u0010;R\u0016\u0010Y\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bn\u00107R\u0014\u0010P\u001a\u00020\u001d8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\bR\u0010oR\u0014\u0010\\\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010f\u001a\u0002058\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\bW\u00107R\u0014\u0010c\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010a\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010e\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bv\u00107R\u0016\u0010i\u001a\u00020\u001b8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b[\u0010wR\u0014\u0010p\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bx\u0010wR\u0014\u0010n\u001a\u00020\u00198\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010k\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b{\u0010uR\u0016\u0010m\u001a\u0002058\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b]\u00107R\u0016\u0010t\u001a\u0004\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b|\u0010}R$\u0010y\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f8\u0001@AX\u0081\u000e¢\u0006\f\n\u0004\b_\u0010u\"\u0004\b,\u0010~R\u0018\u0010v\u001a\u0004\u0018\u0001058\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bU\u0010\u007f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "LPreview;", "p0", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p1", "LPreviewExternalSyntheticLambda3;", "p2", "LonAppEdgeInvalidated;", "p3", "Llambdanew0androidxcameracoreMetadataImageReader;", "p4", "", "", "", "p5", "LshouldMirror;", "p6", "LsetJpegQuality;", "p7", "LSafeCloseImageReaderProxy;", "p8", "p9", "p10", "LresetMinLogLevel;", "p11", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "p12", "", "p13", "", "p14", "<init>", "(LPreview;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;LPreviewExternalSyntheticLambda3;LonAppEdgeInvalidated;Llambdanew0androidxcameracoreMetadataImageReader;Ljava/util/Map;LshouldMirror;LsetJpegQuality;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;LresetMinLogLevel;Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;ZF)V", "LgetPreviewCapabilities;", "LImageAnalysisNonBlockingAnalyzer1;", "", "b", "(LgetPreviewCapabilities;LImageAnalysisNonBlockingAnalyzer1;)V", "LMetadataImageReaderExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LMetadataImageReaderExternalSyntheticLambda0;", "(LgetPreviewCapabilities;LImageAnalysisNonBlockingAnalyzer1;)LPreview;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d", "()V", "Lcom/datadog/android/api/storage/EventType;", "TuitionPaymentFragmentbindingInflater1", "(LgetPreviewCapabilities;LImageAnalysisNonBlockingAnalyzer1;Lcom/datadog/android/api/storage/EventType;)V", "Lkotlin/Function0;", "(LgetPreviewCapabilities;LImageAnalysisNonBlockingAnalyzer1;Lkotlin/jvm/functions/Function0;)V", "(LPreview;)V", "", "IconCompatParcelizer", "J", "LPreview;", "", "read", "Ljava/util/Map;", "", "MediaBrowserCompat", "Ljava/lang/Double;", "LshouldRetry;", "LshouldRetry;", "getNotifyChildrenChangedOptions", "LSafeCloseImageReaderProxy;", "asInterface", "getExtras", "disconnect", "asBinder", "getItem", "g", "a", "onTransact", "getRoot", "cancel", "getServiceComponent", "LresetMinLogLevel;", "INotificationSideChannel", "isConnected", "LsetJpegQuality;", "cancelAll", "notify", "getSessionToken", "INotificationSideChannelDefault", "sendCustomAction", "getInterfaceDescriptor", "", FirebaseAnalytics.Event.SEARCH, "I", "INotificationSideChannelStubProxy", "unsubscribe", "INotificationSideChannelStub", "LonAppEdgeInvalidated;", "RemoteActionCompatParcelizer", "LgetRetryDelayInMillis;", "subscribe", "LgetRetryDelayInMillis;", "MediaBrowserCompatCallbackHandler", "connect", "setCallbacksMessenger", "handleMessage", "write", "", "setInternalConnectionCallback", "Ljava/util/Set;", "MediaBrowserCompatConnectionCallback", "Lcom/datadog/android/rum/RumPerformanceMetric;", "onConnectionSuspended", "onConnectionFailed", "F", "onConnected", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "onProgressUpdate", "LPreviewExternalSyntheticLambda3;", "onError", "Ljava/lang/String;", "MediaBrowserCompatCustomActionCallback", "Z", "MediaBrowserCompatConnectionCallbackStubApi21", "MediaBrowserCompatConnectionCallbackConnectionCallbackInternal", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "onResult", "onItemLoaded", "LshouldMirror;", "(Ljava/lang/String;)V", "Ljava/lang/Long;", "RumViewType"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class RumViewScope implements Preview {
    private static char[] MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatItemCallback;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final long connect;
    private static long onReceiveResult;
    private static final long write;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public long sendCustomAction;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    Long MediaBrowserCompatCustomActionCallback;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public long onConnectionSuspended;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public boolean setInternalConnectionCallback;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private Double TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
    private getRetryDelayInMillis connect;

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallback, reason: from kotlin metadata */
    private final Preview getItem;

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallbackConnectionCallbackInternal, reason: from kotlin metadata */
    private final RumViewType onConnectionFailed;

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallbackStubApi21, reason: from kotlin metadata */
    private final boolean onConnected;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionCallback, reason: from kotlin metadata */
    private final long setCallbacksMessenger;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    String MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public Preview b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public shouldRetry TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final onAppEdgeInvalidated RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    final long onTransact;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public shouldRetry read;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final Map<String, Object> a;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public long getRoot;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    final float isConnected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public shouldRetry notify;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final Map<String, Long> asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long getExtras;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private long d;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    final long handleMessage;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private long g;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private final SafeCloseImageReaderProxy asInterface;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private final Map<String, Object> cancel;

    /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
    private final resetMinLogLevel INotificationSideChannel;

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    private final SafeCloseImageReaderProxy INotificationSideChannelDefault;

    /* JADX INFO: renamed from: handleMessage, reason: from kotlin metadata */
    private final SafeCloseImageReaderProxy write;

    /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
    private final setJpegQuality cancelAll;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public long getServiceComponent;

    /* JADX INFO: renamed from: onConnected, reason: from kotlin metadata */
    private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 unsubscribe;

    /* JADX INFO: renamed from: onConnectionFailed, reason: from kotlin metadata */
    private long search;

    /* JADX INFO: renamed from: onConnectionSuspended, reason: from kotlin metadata */
    private Map<RumPerformanceMetric, getRetryDelayInMillis> getSessionToken;

    /* JADX INFO: renamed from: onError, reason: from kotlin metadata */
    private String subscribe;

    /* JADX INFO: renamed from: onItemLoaded, reason: from kotlin metadata */
    private final shouldMirror onError;

    /* JADX INFO: renamed from: onProgressUpdate, reason: from kotlin metadata */
    private final PreviewExternalSyntheticLambda3 MediaBrowserCompatCallbackHandler;

    /* JADX INFO: renamed from: onResult, reason: from kotlin metadata */
    private final String MediaBrowserCompatConnectionCallback;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public long getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Map<Object, Preview> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    private int INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    private long getInterfaceDescriptor;

    /* JADX INFO: renamed from: setCallbacksMessenger, reason: from kotlin metadata */
    private long MediaBrowserCompat;

    /* JADX INFO: renamed from: setInternalConnectionCallback, reason: from kotlin metadata */
    private final Set<String> disconnect;

    /* JADX INFO: renamed from: subscribe, reason: from kotlin metadata */
    private getRetryDelayInMillis IconCompatParcelizer;

    /* JADX INFO: renamed from: unsubscribe, reason: from kotlin metadata */
    private Map<String, ? extends Object> INotificationSideChannelStub;
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$f = 210;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, -5, -24, -13, 34, 13, 3, 4, 23, -20, 30, 20, -3, 6, 13, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 226;
    private static final byte[] $$a = {43, 23, 22, -14, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 133;
    private static int MediaBrowserCompatMediaBrowserImpl = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int onLoadChildren = 1;

    public static /* synthetic */ Object b(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~((~i6) | i7 | i2);
        int i9 = (~i2) | i7;
        int i10 = i8 | (~(i9 | i6)) | (~(i4 | i6 | i2));
        int i11 = ~i9;
        int i12 = (~(i2 | i4)) | i6 | i11;
        int i13 = (~(i7 | i6)) | i11;
        int i14 = i4 + i6 + i5 + (933655473 * i3) + ((-1037598838) * i);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i4) - 925892608) + (470833381 * i6) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i5) + ((-1691877376) * i3) + ((-393216000) * i) + ((-1633878016) * i15);
        int i17 = ((i4 * (-727610197)) - 1081761860) + (i6 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i5 * (-727609241)) + (i3 * 1532828727) + (i * (-747900794)) + (i15 * 556466176);
        int i18 = i16 + (i17 * i17 * (-1911357440));
        if (i18 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        final RumViewScope rumViewScope = (RumViewScope) objArr[0];
        Preview preview = (Preview) objArr[1];
        int i19 = 2 % 2;
        rumViewScope.b = preview;
        final MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = rumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        rumViewScope.unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault2("rum", new Function1<Map<String, Object>, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateActiveActionScope$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Map<String, Object> map) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(map);
                return Unit.INSTANCE;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Map<String, Object> map) {
                Intrinsics.checkNotNullParameter(map, "");
                if (!Intrinsics.areEqual(map.get("session_id"), RumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.this$0)) || Intrinsics.areEqual(map.get("view_id"), this.this$0.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal)) {
                    map.clear();
                    map.putAll(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                } else {
                    RumViewScope.TuitionPaymentFragmentbindingInflater1(this.this$0).TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.DEBUG, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateActiveActionScope$1.1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Trying to update active action in the global RUM context, but the context doesn't reference this view.";
                        }
                    }, null, false, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        int i20 = MediaBrowserCompatItemReceiver + 81;
        MediaBrowserCompatMediaBrowserImpl = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = r6 + 38
            byte[] r1 = com.datadog.android.rum.internal.domain.scope.RumViewScope.$$a
            int r8 = r8 * 3
            int r8 = 84 - r8
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 26
            int r0 = r5 + 12
            byte[] r1 = com.datadog.android.rum.internal.domain.scope.RumViewScope.$$d
            int r6 = r6 * 3
            int r6 = r6 + 84
            int r7 = r7 * 11
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r5 = r5 + 11
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r7]
        L2a:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope.f(byte, short, short, java.lang.Object[]):void");
    }

    private RumViewScope(Preview preview, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, PreviewExternalSyntheticLambda3 previewExternalSyntheticLambda3, onAppEdgeInvalidated onappedgeinvalidated, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, Map<String, ? extends Object> map, shouldMirror shouldmirror, setJpegQuality setjpegquality, SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2, SafeCloseImageReaderProxy safeCloseImageReaderProxy3, resetMinLogLevel resetminloglevel, RumViewType rumViewType, boolean z, float f) {
        Intrinsics.checkNotNullParameter(preview, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(previewExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(onappedgeinvalidated, "");
        Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(setjpegquality, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy2, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy3, "");
        Intrinsics.checkNotNullParameter(resetminloglevel, "");
        Intrinsics.checkNotNullParameter(rumViewType, "");
        this.getItem = preview;
        this.unsubscribe = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
        this.MediaBrowserCompatCallbackHandler = previewExternalSyntheticLambda3;
        this.RemoteActionCompatParcelizer = onappedgeinvalidated;
        this.onError = shouldmirror;
        this.cancelAll = setjpegquality;
        this.asInterface = safeCloseImageReaderProxy;
        this.write = safeCloseImageReaderProxy2;
        this.INotificationSideChannelDefault = safeCloseImageReaderProxy3;
        this.INotificationSideChannel = resetminloglevel;
        this.onConnectionFailed = rumViewType;
        this.onConnected = z;
        this.isConnected = f;
        this.MediaBrowserCompatConnectionCallback = StringsKt.replace$default(onappedgeinvalidated.b, '.', '/', false, 4, (Object) null);
        this.a = MapsKt.toMutableMap(map);
        this.INotificationSideChannelStub = MapsKt.toMap(GlobalRumMonitor.b(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0).b());
        this.subscribe = preview.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal = string;
        this.disconnect = new LinkedHashSet();
        this.setCallbacksMessenger = lambdanew0androidxcameracoremetadataimagereader.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b;
        this.handleMessage = j;
        this.onTransact = lambdanew0androidxcameracoremetadataimagereader.b + j;
        this.TuitionPaymentFragmentbindingInflater1 = new LinkedHashMap();
        this.onConnectionSuspended = 1L;
        this.asBinder = new LinkedHashMap();
        this.cancel = new LinkedHashMap();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.read = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.notify = new b();
        this.getSessionToken = new LinkedHashMap();
        imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2("rum", new Function1<Map<String, Object>, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope.1
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {46, 126, -84, 108, -7, -24, 40, -46, -10, -12, -1, 7, -22, -26, 2, -7, -24, 23, -46, 0, 2, 56, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 58};
            private static final int $$e = 139;
            private static final byte[] $$a = {23, -73, 107, 5, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
            private static final int $$b = 126;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int $b = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = 4957591589017555063L;

            private static void a(int i, int i2, byte b2, Object[] objArr) {
                byte[] bArr = $$a;
                int i3 = 100 - (i2 * 3);
                int i4 = (i * 10) + 4;
                byte[] bArr2 = new byte[b2 + 1];
                int i5 = -1;
                if (bArr == null) {
                    i3 = (i4 + (-b2)) - 5;
                    i4++;
                }
                while (true) {
                    i5++;
                    bArr2[i5] = (byte) i3;
                    if (i5 == b2) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i6 = i3;
                    i3 = (i6 + (-bArr[i4])) - 5;
                    i4++;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r7, int r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 19
                    int r7 = 103 - r7
                    int r8 = r8 + 4
                    byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumViewScope.AnonymousClass1.$$d
                    int r9 = r9 * 19
                    int r9 = 72 - r9
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r8
                    r7 = r9
                    r4 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r9) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L2c:
                    int r8 = -r8
                    int r7 = r7 + r8
                    int r7 = r7 + (-9)
                    r8 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope.AnonymousClass1.d(byte, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:38:0x0184  */
            /* JADX WARN: Code duplicated, block: B:39:0x0185  */
            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                Object obj;
                Throwable cause;
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (true) {
                    obj = null;
                    if (getrealtimecapturelatency.b >= cArr.length) {
                        break;
                    }
                    int i3 = $10 + 117;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 19473), 2624 - KeyEvent.getDeadChar(0, 0), View.combineMeasuredStates(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AndroidCharacter.getMirror('0') + 39374), ExpandableListView.getPackedPositionType(0L) + 481, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i6 = $11 + 91;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 39422), View.resolveSizeAndState(0, 0, 0) + 481, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        obj.hashCode();
                        throw null;
                    }
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.rgb(0, 0, 0) + 16816638), 481 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Map<String, Object> map2) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = $b + 95;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int fadingEdgeLength = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iIndexOf = 10 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr = $$a;
                    byte b2 = bArr[11];
                    Object[] objArr2 = new Object[1];
                    a(b2, (byte) (b2 + 1), bArr[8], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, fadingEdgeLength, iIndexOf, -1199417970, false, (String) objArr2[0], null);
                }
                long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{47373, 3431, 53698, 42033, 26775, 15612, 33622, 22401, 6699, 61074, 45744, 31080, 52649, 36926, 25758, 10466, 65361, 17306, 5658, 55932, 44779, 30030}, Color.green(0) + 46181, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{47369, 38819, 58443, 13045, 915, 20518, 44762, 65355, 52241, 6838, 27486, 47129, 38561, 59206, 13795}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11939, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int iNormalizeMetaState = 876 - KeyEvent.normalizeMetaState(0);
                    int iAlpha = Color.alpha(0) + 10;
                    byte b3 = $$a[11];
                    byte b4 = (byte) (b3 + 1);
                    byte b5 = b3;
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, b5, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iNormalizeMetaState, iAlpha, 254769921, false, (String) objArr5[0], null);
                }
                if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int iCombineMeasuredStates = 876 - View.combineMeasuredStates(0, 0);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 11;
                        byte[] bArr2 = $$a;
                        byte b6 = (byte) (bArr2[11] + 1);
                        Object[] objArr6 = new Object[1];
                        a(b6, b6, bArr2[10], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iCombineMeasuredStates, iIndexOf2, 1324201839, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i4 = ~iIdentityHashCode;
                    int i5 = ((((-810060588) + ((555139330 | i4) * (-192))) + (((~(592956226 | i4)) | 78127125) * (-384))) + (((~(iIdentityHashCode | (-37816897))) | ((~(i4 | 671083351)) | (~((-78127126) | iIdentityHashCode)))) * DerHeader.TAG_CLASS_PRIVATE)) - 1643144129;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{47366, 17084, 20088, 18974, 22406, 21365, 24363, 22741, 25731, 24699, 28117, 27022, 30035, 32485, 31399, 1630}, Color.green(0) + 64433, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{47365, 52967, 22231, 57039, 26276, 61102, 30338, 65180, 1628, 36458, 5705, 40513, 9755, 44576, 13850, 48648}, TextUtils.getTrimmedLength("") + 30703, objArr9);
                    try {
                        Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), -1643144129};
                        byte[] bArr3 = $$d;
                        byte b7 = bArr3[19];
                        Object[] objArr11 = new Object[1];
                        d(b7, bArr3[10], b7, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b8 = bArr3[10];
                        Object[] objArr12 = new Object[1];
                        d((byte) (-b8), (byte) 70, (byte) (-b8), objArr12);
                        objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 876;
                            int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                            byte[] bArr4 = $$a;
                            byte b9 = (byte) (bArr4[11] + 1);
                            Object[] objArr13 = new Object[1];
                            a(b9, b9, bArr4[10], objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, offsetAfter, i8, 1324201839, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr14 = new Object[1];
                            c(new char[]{47373, 3431, 53698, 42033, 26775, 15612, 33622, 22401, 6699, 61074, 45744, 31080, 52649, 36926, 25758, 10466, 65361, 17306, 5658, 55932, 44779, 30030}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46181, objArr14);
                            Class<?> cls4 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            c(new char[]{47369, 38819, 58443, 13045, 915, 20518, 44762, 65355, 52241, 6838, 27486, 47129, 38561, 59206, 13795}, 11939 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr15);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "");
                                int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                                int i10 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                byte b10 = $$a[11];
                                byte b11 = (byte) (b10 + 1);
                                byte b12 = b10;
                                Object[] objArr16 = new Object[1];
                                a(b11, b12, b12, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i9, i10, 254769921, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 876;
                                int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                                byte[] bArr5 = $$a;
                                byte b13 = bArr5[11];
                                Object[] objArr17 = new Object[1];
                                a(b13, (byte) (b13 + 1), bArr5[8], objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iKeyCodeFromString, i11, -1199417970, false, (String) objArr17[0], null);
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
                int i12 = ((int[]) objArr[2])[0];
                int i13 = ((int[]) objArr[0])[0];
                if (i13 != i12) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[3];
                    if (strArr != null) {
                        int i14 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                        $b = i14 % 128;
                        int i15 = i14 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i13));
                }
                int i16 = $b + 101;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                int i17 = i16 % 2;
                int i18 = ((int[]) objArr[1])[0];
                Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iMyTid = Process.myTid();
                int i19 = i18 + ((~((-553649553) | iMyTid)) * 521) + 320037252 + (((~((~iMyTid) | (-553649553))) | (-1065295808)) * 521);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr18[1])[0] = i21 ^ (i21 << 5);
                int i22 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                $b = i22 % 128;
                if (i22 % 2 != 0) {
                    b(map2);
                    return Unit.INSTANCE;
                }
                b(map2);
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            public final void b(Map<String, Object> map2) {
                int i = 2 % 2;
                int i2 = $b + 121;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(map2, "");
                    map2.putAll(RumViewScope.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                } else {
                    Intrinsics.checkNotNullParameter(map2, "");
                    map2.putAll(RumViewScope.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            {
                super(1);
            }
        });
        safeCloseImageReaderProxy.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        safeCloseImageReaderProxy2.b(this.read);
        safeCloseImageReaderProxy3.b(this.notify);
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = preview.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder != null) {
            String str = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str2 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i = MediaBrowserCompatItemReceiver + 15;
            MediaBrowserCompatMediaBrowserImpl = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = MediaBrowserCompatMediaBrowserImpl + 25;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1(RumViewScope rumViewScope) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 99;
        MediaBrowserCompatMediaBrowserImpl = i2 % 128;
        int i3 = i2 % 2;
        ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 = rumViewScope.unsubscribe;
        if (i3 == 0) {
            return imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        RumViewScope rumViewScope = (RumViewScope) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImpl;
        int i3 = i2 + 101;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        PreviewExternalSyntheticLambda3 previewExternalSyntheticLambda3 = rumViewScope.MediaBrowserCompatCallbackHandler;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 27;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return previewExternalSyntheticLambda3;
        }
        throw null;
    }

    public static final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(RumViewScope rumViewScope) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImpl;
        int i3 = i2 + 65;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        String str = rumViewScope.subscribe;
        int i5 = i2 + 95;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RumViewScope rumViewScope, getRetryDelayInMillis getretrydelayinmillis) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImpl;
        int i3 = i2 + 11;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        rumViewScope.IconCompatParcelizer = getretrydelayinmillis;
        int i5 = i2 + 75;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        RumViewScope rumViewScope = (RumViewScope) objArr[0];
        getRetryDelayInMillis getretrydelayinmillis = (getRetryDelayInMillis) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImpl + 55;
        int i3 = i2 % 128;
        MediaBrowserCompatItemReceiver = i3;
        int i4 = i2 % 2;
        rumViewScope.connect = getretrydelayinmillis;
        if (i4 == 0) {
            int i5 = 33 / 0;
        }
        int i6 = i3 + 69;
        MediaBrowserCompatMediaBrowserImpl = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public static final /* synthetic */ resetMinLogLevel TuitionPaymentFragmentspecialinlinedviewModeldefault3(RumViewScope rumViewScope) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImpl + 21;
        int i3 = i2 % 128;
        MediaBrowserCompatItemReceiver = i3;
        int i4 = i2 % 2;
        resetMinLogLevel resetminloglevel = rumViewScope.INotificationSideChannel;
        int i5 = i3 + 87;
        MediaBrowserCompatMediaBrowserImpl = i5 % 128;
        if (i5 % 2 == 0) {
            return resetminloglevel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(RumViewScope rumViewScope, Double d) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 89;
        int i3 = i2 % 128;
        MediaBrowserCompatMediaBrowserImpl = i3;
        int i4 = i2 % 2;
        rumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = d;
        int i5 = i3 + 3;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
    }

    public static final /* synthetic */ long b() {
        long j;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImpl;
        int i3 = i2 + 19;
        MediaBrowserCompatItemReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            j = connect;
            int i4 = 42 / 0;
        } else {
            j = connect;
        }
        int i5 = i2 + 27;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ErrorEvent.Category b(getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 113;
        MediaBrowserCompatMediaBrowserImpl = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder == null) {
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.g == null) {
                return null;
            }
            int i4 = MediaBrowserCompatMediaBrowserImpl + 39;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
            return ErrorEvent.Category.EXCEPTION;
        }
        if (!(tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder instanceof ANRException)) {
            return ErrorEvent.Category.EXCEPTION;
        }
        int i6 = MediaBrowserCompatItemReceiver + 43;
        MediaBrowserCompatMediaBrowserImpl = i6 % 128;
        if (i6 % 2 == 0) {
            return ErrorEvent.Category.ANR;
        }
        ErrorEvent.Category category = ErrorEvent.Category.ANR;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RumViewScope(Preview preview, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, PreviewExternalSyntheticLambda3 previewExternalSyntheticLambda3, onAppEdgeInvalidated onappedgeinvalidated, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, Map map, shouldMirror shouldmirror, setJpegQuality setjpegquality, SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2, SafeCloseImageReaderProxy safeCloseImageReaderProxy3, resetMinLogLevel resetminloglevel, RumViewType rumViewType, boolean z, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        RumViewType rumViewType2;
        resetMinLogLevel resetminloglevel2 = (i & 2048) != 0 ? new resetMinLogLevel() : resetminloglevel;
        if ((i & 4096) != 0) {
            int i2 = MediaBrowserCompatMediaBrowserImpl + 105;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            RumViewType rumViewType3 = RumViewType.FOREGROUND;
            int i4 = MediaBrowserCompatMediaBrowserImpl + 31;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            rumViewType2 = rumViewType3;
        } else {
            rumViewType2 = rumViewType;
        }
        this(preview, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, previewExternalSyntheticLambda3, onappedgeinvalidated, lambdanew0androidxcameracoremetadataimagereader, map, shouldmirror, setjpegquality, safeCloseImageReaderProxy, safeCloseImageReaderProxy2, safeCloseImageReaderProxy3, resetminloglevel2, rumViewType2, z, f);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.disconnect.add(this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
        this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal = str;
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder != null) {
            int i2 = MediaBrowserCompatItemReceiver + 1;
            MediaBrowserCompatMediaBrowserImpl = i2 % 128;
            int i3 = i2 % 2;
            String str2 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = MediaBrowserCompatMediaBrowserImpl + 21;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 119;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver[i - i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2187;
                        int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39;
                        byte b2 = (byte) ($$f & 15);
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, iResolveSizeAndState, i6, 841711447, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onReceiveResult), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getTouchSlop() >> 8)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3011, (-16777190) - Color.rgb(0, 0, 0), 321985076, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 36505), 3376 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.myTid() >> 22) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver[i + i7])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int iIndexOf = 2186 - TextUtils.indexOf((CharSequence) "", '0');
                    int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39;
                    byte b8 = (byte) ($$f & 15);
                    byte b9 = (byte) (b8 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iIndexOf, i8, 841711447, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(onReceiveResult), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 3011, KeyEvent.getDeadChar(0, 0) + 26, 321985076, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (-b12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36504 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3376, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, -968507904, false, $$g(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $11 + 75;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b14 = (byte) 1;
                byte b15 = (byte) (-b14);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36505), 3377 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 18, -968507904, false, $$g(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements shouldRetry {
        private double TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Double.NaN;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // defpackage.shouldRetry
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getRetryDelayInMillis getretrydelayinmillis) {
            Intrinsics.checkNotNullParameter(getretrydelayinmillis, "");
            if (Double.isNaN(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getretrydelayinmillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                RumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault3(RumViewScope.this, Double.valueOf(getretrydelayinmillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            }
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements shouldRetry {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // defpackage.shouldRetry
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getRetryDelayInMillis getretrydelayinmillis) {
            Intrinsics.checkNotNullParameter(getretrydelayinmillis, "");
            Object[] objArr = {RumViewScope.this, getretrydelayinmillis};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            RumViewScope.b(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -1175869121, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1175869123);
        }
    }

    public static final class b implements shouldRetry {
        b() {
        }

        @Override // defpackage.shouldRetry
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getRetryDelayInMillis getretrydelayinmillis) {
            Intrinsics.checkNotNullParameter(getretrydelayinmillis, "");
            RumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault1(RumViewScope.this, getretrydelayinmillis);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x067f A[PHI: r0
  0x067f: PHI (r0v57 getPreviewCapabilities$TuitionPaymentFragmentspecialinlinedviewModeldefault3) = 
  (r0v56 getPreviewCapabilities$TuitionPaymentFragmentspecialinlinedviewModeldefault3)
  (r0v62 getPreviewCapabilities$TuitionPaymentFragmentspecialinlinedviewModeldefault3)
 binds: [B:114:0x067d, B:111:0x0670] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:211:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:212:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:318:0x0c86  */
    /* JADX WARN: Code duplicated, block: B:320:0x0c95  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.Preview
    public final Preview TuitionPaymentFragmentspecialinlinedviewModeldefault3(getPreviewCapabilities p0, ImageAnalysisNonBlockingAnalyzer1<Object> p1) throws Throwable {
        final RumViewScope rumViewScope;
        Preview preview;
        Boolean bool;
        String str;
        String message;
        String string;
        EventType eventType;
        Class<?> cls;
        getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 = this.unsubscribe;
        if (!this.setInternalConnectionCallback && !(p0 instanceof getPreviewCapabilities.read)) {
            this.INotificationSideChannelStub = MapsKt.toMap(GlobalRumMonitor.b(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0).b());
        }
        if (!(p0 instanceof getPreviewCapabilities.INotificationSideChannelStubProxy)) {
            if (p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentbindingInflater1) {
                getPreviewCapabilities.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (getPreviewCapabilities.TuitionPaymentFragmentbindingInflater1) p0;
                if (Intrinsics.areEqual(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1, this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal) || this.disconnect.contains(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1)) {
                    this.getExtras--;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    this.INotificationSideChannelStubProxy += tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1, p1, EventType.DEFAULT);
                }
            } else {
                int i2 = 1;
                if (p0 instanceof getPreviewCapabilities.onTransact) {
                    getPreviewCapabilities.onTransact ontransact = (getPreviewCapabilities.onTransact) p0;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int i3 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2266;
                        int iMakeMeasureSpec = 33 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr = $$a;
                        Object[] objArr2 = new Object[1];
                        c(bArr[5], bArr[132], bArr[7], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, i3, iMakeMeasureSpec, -887667012, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    e(TextUtils.getOffsetBefore("", 0), 21 - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18520), objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    e(22 - (ViewConfiguration.getLongPressTimeout() >> 16), 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (26557 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr4);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int iKeyCodeFromString = 2267 - KeyEvent.keyCodeFromString("");
                        int iArgb = Color.argb(0, 0, 0, 0) + 33;
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[5];
                        Object[] objArr5 = new Object[1];
                        c(b2, (byte) (b2 | 50), bArr2[7], objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iKeyCodeFromString, iArgb, -874156483, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int tapTimeout = 2267 - (ViewConfiguration.getTapTimeout() >> 16);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 33;
                            byte b3 = $$a[7];
                            byte b4 = b3;
                            Object[] objArr6 = new Object[1];
                            c(b4, (byte) (b4 | 103), b3, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, tapTimeout, jumpTapTimeout, -654680577, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                        int i4 = ((int[]) objArr7[0])[0];
                        int i5 = ((int[]) objArr7[3])[0];
                        String[] strArr = (String[]) objArr7[1];
                        int iMyUid = Process.myUid();
                        int i6 = ~iMyUid;
                        int i7 = 1993297838 + (((~((-170581103) | i6)) | 638132213) * 519) + (((~(i6 | (-136495115))) | (~(774627327 | iMyUid))) * (-519)) + (((~(iMyUid | 638132213)) | 170581102) * 519) + 2056756095;
                        int i8 = (i7 << 13) ^ i7;
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
                        c = 3;
                    } else {
                        Object[] objArr8 = new Object[1];
                        e(37 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 26 - View.combineMeasuredStates(0, 0), (char) Color.argb(0, 0, 0, 0), objArr8);
                        Class<?> cls3 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        e(TextUtils.lastIndexOf("", '0') + 64, TextUtils.lastIndexOf("", '0', 0) + 19, (char) (Process.getGidForName("") + 1), objArr9);
                        Context applicationContext = (Context) cls3.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                        }
                        Object[] objArr10 = new Object[1];
                        e(81 - TextUtils.indexOf("", "", 0, 0), 16 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr10);
                        Class<?> cls4 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        e((ViewConfiguration.getTouchSlop() >> 8) + 97, 16 - (ViewConfiguration.getTouchSlop() >> 8), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr11);
                        try {
                            Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls4.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 2056756095};
                            byte[] bArr3 = $$d;
                            byte b5 = bArr3[39];
                            Object[] objArr13 = new Object[1];
                            f(b5, (byte) (-bArr3[18]), b5, objArr13);
                            Class<?> cls5 = Class.forName((String) objArr13[0]);
                            byte b6 = bArr3[18];
                            Object[] objArr14 = new Object[1];
                            f((byte) (-b6), bArr3[39], (byte) (-b6), objArr14);
                            objArr = (Object[]) cls5.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                            if (applicationContext != null) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int iRed = 2267 - Color.red(0);
                                    int mode = View.MeasureSpec.getMode(0) + 33;
                                    byte b7 = $$a[7];
                                    byte b8 = b7;
                                    Object[] objArr15 = new Object[1];
                                    c(b8, (byte) (b8 | 103), b7, objArr15);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, iRed, mode, -654680577, false, (String) objArr15[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                try {
                                    Object[] objArr16 = new Object[1];
                                    e((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18521), objArr16);
                                    Class<?> cls6 = Class.forName((String) objArr16[0]);
                                    Object[] objArr17 = new Object[1];
                                    e(23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 15 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 26556), objArr17);
                                    long jLongValue2 = ((Long) cls6.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                        int defaultSize = View.getDefaultSize(0, 0) + 2267;
                                        int doubleTapTimeout = 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        byte[] bArr4 = $$a;
                                        byte b9 = bArr4[5];
                                        Object[] objArr18 = new Object[1];
                                        c(b9, (byte) (b9 | 50), bArr4[7], objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, defaultSize, doubleTapTimeout, -874156483, false, (String) objArr18[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2267;
                                        int iMyPid = 33 - (Process.myPid() >> 22);
                                        byte[] bArr5 = $$a;
                                        Object[] objArr19 = new Object[1];
                                        c(bArr5[5], bArr5[132], bArr5[7], objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode, iResolveOpacity, iMyPid, -887667012, false, (String) objArr19[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            }
                            c = 3;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int i10 = ((int[]) objArr[c])[0];
                    int i11 = ((int[]) objArr[0])[0];
                    if (i11 != i10) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr2 = (String[]) objArr[1];
                        if (strArr2 != null) {
                            for (String str2 : strArr2) {
                                arrayList.add(str2);
                            }
                        }
                        throw new RuntimeException(String.valueOf(i11));
                    }
                    Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i12 = ((int[]) objArr[2])[0];
                    int i13 = ((int[]) objArr[0])[0];
                    int i14 = ((int[]) objArr[3])[0];
                    String[] strArr3 = (String[]) objArr[1];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i15 = ~iIdentityHashCode;
                    int i16 = i12 + (-159745893) + (((~((-1312005) | i15)) | (~((-269193218) | iIdentityHashCode)) | (~((-536896091) | iIdentityHashCode))) * 765) + (((~((-270505222) | i15)) | 1312004) * 1530) + (((~(iIdentityHashCode | (-270505222))) | (~(i15 | (-536896091)))) * 765);
                    int i17 = (i16 << 13) ^ i16;
                    int i18 = i17 ^ (i17 >>> 17);
                    ((int[]) objArr20[2])[0] = i18 ^ (i18 << 5);
                    if (Intrinsics.areEqual(ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal) || this.disconnect.contains(ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        this.getRoot--;
                        this.g++;
                        getPreviewCapabilities.onTransact ontransact2 = ontransact;
                        int i19 = ((int[]) objArr20[2])[0];
                        int i20 = ((i19 * i19) - (~(-(1565797972 * i19)))) - 1;
                        int i21 = -(i19 * 1007702934);
                        int i22 = ((i20 ^ i21) + ((i21 & i20) << 1)) - 584095111;
                        int i23 = i22 >> 22;
                        int i24 = (((i23 & (-2047)) + (i23 | (-2047))) / 1024) + 1;
                        int i25 = (i22 & i24) + (i24 | i22);
                        int i26 = i22 >> 26;
                        int i27 = -(i25 ^ ((((i26 & ComposerKt.defaultsKey) + (i26 | ComposerKt.defaultsKey)) / 64) + 1));
                        int i28 = (i27 & 1) + (i27 | 1);
                        int i29 = i28 >> 23;
                        int i30 = ((i29 & (-1023)) + (i29 | (-1023))) / 512;
                        int i31 = ((i30 | 1) << 1) - (i30 ^ 1);
                        TuitionPaymentFragmentbindingInflater1(ontransact2, p1, (4 & (492 / (((-((i31 & 1) + (i31 | 1))) & i28) * 123))) != 0 ? EventType.DEFAULT : null);
                    }
                } else if (p0 instanceof getPreviewCapabilities.cancel) {
                    getPreviewCapabilities.cancel cancelVar = (getPreviewCapabilities.cancel) p0;
                    if (Intrinsics.areEqual(cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal) || this.disconnect.contains(cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                        this.sendCustomAction--;
                        this.MediaBrowserCompat++;
                        if (cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            this.getNotifyChildrenChangedOptions--;
                            this.getInterfaceDescriptor++;
                        }
                        TuitionPaymentFragmentbindingInflater1(cancelVar, p1, EventType.DEFAULT);
                    }
                } else if (p0 instanceof getPreviewCapabilities.INotificationSideChannelStub) {
                    getPreviewCapabilities.INotificationSideChannelStub iNotificationSideChannelStub = (getPreviewCapabilities.INotificationSideChannelStub) p0;
                    if (Intrinsics.areEqual(iNotificationSideChannelStub.TuitionPaymentFragmentbindingInflater1, this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal) || this.disconnect.contains(iNotificationSideChannelStub.TuitionPaymentFragmentbindingInflater1)) {
                        this.getServiceComponent--;
                    }
                } else if (p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    int i32 = MediaBrowserCompatMediaBrowserImpl + 99;
                    MediaBrowserCompatItemReceiver = i32 % 128;
                    if (i32 % 2 == 0) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault3) p0;
                        int i33 = 29 / 0;
                        if (!Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal)) {
                            if (this.disconnect.contains(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                            }
                        }
                    } else {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault3) p0;
                        if (!Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal)) {
                            if (this.disconnect.contains(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                            }
                        }
                    }
                    this.getExtras--;
                } else if (p0 instanceof getPreviewCapabilities.notify) {
                    getPreviewCapabilities.notify notifyVar = (getPreviewCapabilities.notify) p0;
                    if (Intrinsics.areEqual(notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal) || this.disconnect.contains(notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        this.getRoot--;
                    }
                } else if (p0 instanceof getPreviewCapabilities.INotificationSideChannel) {
                    getPreviewCapabilities.INotificationSideChannel iNotificationSideChannel = (getPreviewCapabilities.INotificationSideChannel) p0;
                    if (Intrinsics.areEqual(iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal) || this.disconnect.contains(iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        this.sendCustomAction--;
                        if (iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            this.getNotifyChildrenChangedOptions--;
                        }
                    }
                } else if (p0 instanceof getPreviewCapabilities.read) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3((getPreviewCapabilities.read) p0, p1, new Function0<Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$stopScope$1
                        public final void b() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ Unit invoke() {
                            b();
                            return Unit.INSTANCE;
                        }
                    });
                } else if (p0 instanceof getPreviewCapabilities.getItem) {
                    getPreviewCapabilities.getItem getitem = (getPreviewCapabilities.getItem) p0;
                    getPreviewCapabilities.getItem getitem2 = getitem;
                    b(getitem2, p1);
                    if (!(!Intrinsics.areEqual(getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) && !this.setInternalConnectionCallback) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3(getitem2, p1, new RumViewScope$onStopView$1(this, getitem));
                    }
                } else if (p0 instanceof getPreviewCapabilities.connect) {
                    final getPreviewCapabilities.connect connectVar = (getPreviewCapabilities.connect) p0;
                    b(connectVar, p1);
                    if (!this.setInternalConnectionCallback) {
                        if (this.b == null) {
                            getDefaultPointSize.Companion bVar = getDefaultPointSize.INSTANCE;
                            b(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this, getDefaultPointSize.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, this.unsubscribe, connectVar, this.handleMessage, this.INotificationSideChannel, this.onConnected, this.isConnected)}, -837604088, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 837604088);
                            this.getExtras++;
                        } else if (connectVar.b != RumActionType.CUSTOM || connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            this.unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStartAction$1
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                public final String invoke() {
                                    String str3 = String.format(Locale.US, "RUM Action (%s on %s) was dropped, because another action is still active for the same view", Arrays.copyOf(new Object[]{connectVar.b, connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1}, 2));
                                    Intrinsics.checkNotNullExpressionValue(str3, "");
                                    return str3;
                                }

                                {
                                    super(0);
                                }
                            }, null, false, null);
                        } else {
                            getDefaultPointSize.Companion bVar2 = getDefaultPointSize.INSTANCE;
                            Preview previewTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getDefaultPointSize.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, this.unsubscribe, connectVar, this.handleMessage, this.INotificationSideChannel, this.onConnected, this.isConnected);
                            this.getExtras++;
                            previewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getPreviewCapabilities.INotificationSideChannelDefault(null, i2, null == true ? 1 : 0), p1);
                        }
                    }
                } else if (!(!(p0 instanceof getPreviewCapabilities.write))) {
                    int i34 = MediaBrowserCompatItemReceiver + 125;
                    MediaBrowserCompatMediaBrowserImpl = i34 % 128;
                    int i35 = i34 % 2;
                    getPreviewCapabilities.write writeVar = (getPreviewCapabilities.write) p0;
                    b(writeVar, p1);
                    if (!this.setInternalConnectionCallback) {
                        int i36 = MediaBrowserCompatMediaBrowserImpl + 117;
                        MediaBrowserCompatItemReceiver = i36 % 128;
                        int i37 = i36 % 2;
                        Map mutableMap = MapsKt.toMutableMap(writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        mutableMap.putAll(this.INotificationSideChannelStub);
                        getPreviewCapabilities.write writeVarB = getPreviewCapabilities.write.b(writeVar, mutableMap);
                        Map<Object, Preview> map = this.TuitionPaymentFragmentbindingInflater1;
                        Object obj = writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        MirrorModeMirror.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = MirrorModeMirror.INSTANCE;
                        map.put(obj, MirrorModeMirror.Companion.TuitionPaymentFragmentbindingInflater1(this, this.unsubscribe, writeVarB, this.cancelAll, this.handleMessage, this.INotificationSideChannel, this.isConnected));
                        this.getServiceComponent++;
                    }
                } else {
                    if (p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        final getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0;
                        getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        b(tuitionPaymentFragmentspecialinlinedviewModeldefault4, p1);
                        if (!this.setInternalConnectionCallback) {
                            final MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            final Map mutableMap2 = MapsKt.toMutableMap(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            mutableMap2.putAll(this.INotificationSideChannelStub);
                            Object objRemove = mutableMap2.remove("_dd.error.is_crash");
                            if (objRemove instanceof Boolean) {
                                int i38 = MediaBrowserCompatItemReceiver + 65;
                                MediaBrowserCompatMediaBrowserImpl = i38 % 128;
                                if (i38 % 2 != 0) {
                                    bool = (Boolean) objRemove;
                                    int i39 = 98 / 0;
                                } else {
                                    bool = (Boolean) objRemove;
                                }
                            } else {
                                bool = null;
                            }
                            boolean z = Intrinsics.areEqual(bool, Boolean.TRUE) || tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Object objRemove2 = mutableMap2.remove("_dd.error.fingerprint");
                            final String str3 = objRemove2 instanceof String ? (String) objRemove2 : null;
                            if (this.d <= 0 || !z) {
                                String canonicalName = tuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll;
                                if (canonicalName != null) {
                                    str = canonicalName;
                                } else {
                                    Throwable th2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder;
                                    if (th2 == null || (cls = th2.getClass()) == null) {
                                        str = null;
                                    } else {
                                        canonicalName = cls.getCanonicalName();
                                        str = canonicalName;
                                    }
                                }
                                Throwable th3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder;
                                if (th3 == null || (message = th3.getMessage()) == null) {
                                    message = "";
                                }
                                if (!StringsKt.isBlank(message)) {
                                    int i40 = MediaBrowserCompatItemReceiver + 79;
                                    MediaBrowserCompatMediaBrowserImpl = i40 % 128;
                                    if (i40 % 2 != 0) {
                                        int i41 = 87 / 0;
                                        if (Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, message)) {
                                            string = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                                        } else {
                                            String str4 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(str4);
                                            sb.append(": ");
                                            sb.append(message);
                                            string = sb.toString();
                                        }
                                    } else if (Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, message)) {
                                        string = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                                    } else {
                                        String str5 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str5);
                                        sb2.append(": ");
                                        sb2.append(message);
                                        string = sb2.toString();
                                    }
                                } else {
                                    string = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                                }
                                final String str6 = string;
                                final Map mutableMap3 = MapsKt.toMutableMap(this.cancel);
                                if (z) {
                                    int i42 = MediaBrowserCompatMediaBrowserImpl + 123;
                                    MediaBrowserCompatItemReceiver = i42 % 128;
                                    if (i42 % 2 == 0) {
                                        EventType eventType2 = EventType.CRASH;
                                        throw null;
                                    }
                                    eventType = EventType.CRASH;
                                    int i43 = MediaBrowserCompatItemReceiver + 45;
                                    MediaBrowserCompatMediaBrowserImpl = i43 % 128;
                                    int i44 = i43 % 2;
                                } else {
                                    eventType = EventType.DEFAULT;
                                }
                                EventType eventType3 = eventType;
                                final boolean z2 = z;
                                final String str7 = str;
                                getStatus getstatusB = getExecutedTimeInMillis.b(this.unsubscribe, p1, eventType3, new Function1<recalculateTransformMatrixAndCropRect, Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function1
                                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                                    public final Object invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect) {
                                        ErrorEvent.ErrorEventSessionType errorEventSessionType;
                                        String str8;
                                        ErrorEvent.SourceType sourceType;
                                        String str9;
                                        String str10 = "";
                                        Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                                        lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = recalculatetransformmatrixandcroprect.INotificationSideChannel;
                                        RumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0);
                                        String str11 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                                        if (str11 == null) {
                                            str11 = "";
                                        }
                                        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = resetMinLogLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(recalculatetransformmatrixandcroprect, str11);
                                        String str12 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
                                        ErrorEvent.MediaBrowserCompat mediaBrowserCompat = (str12 == null || StringsKt.isBlank(str12) || (str9 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.g) == null || StringsKt.isBlank(str9)) ? null : new ErrorEvent.MediaBrowserCompat(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder, metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, null, 4, null);
                                        if (mediaBrowserCompat == null) {
                                            errorEventSessionType = ErrorEvent.ErrorEventSessionType.USER;
                                        } else {
                                            errorEventSessionType = ErrorEvent.ErrorEventSessionType.SYNTHETICS;
                                        }
                                        String str13 = recalculatetransformmatrixandcroprect.b;
                                        long j2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.b.b;
                                        long j3 = this.this$0.handleMessage;
                                        ErrorEvent.notify notifyVar2 = new ErrorEvent.notify(mutableMap3);
                                        ErrorEvent.ErrorSource errorSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.g;
                                        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                            str8 = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        } else {
                                            Throwable th4 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder;
                                            if (th4 != null) {
                                                strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = downsample.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th4);
                                                str8 = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            } else {
                                                str8 = null;
                                            }
                                        }
                                        RumErrorSourceType rumErrorSourceType = tuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface;
                                        Intrinsics.checkNotNullParameter(rumErrorSourceType, "");
                                        switch (MirrorMode.WhenMappings.$EnumSwitchMapping$3[rumErrorSourceType.ordinal()]) {
                                            case 1:
                                                sourceType = ErrorEvent.SourceType.ANDROID;
                                                break;
                                            case 2:
                                                sourceType = ErrorEvent.SourceType.BROWSER;
                                                break;
                                            case 3:
                                                sourceType = ErrorEvent.SourceType.REACT_NATIVE;
                                                break;
                                            case 4:
                                                sourceType = ErrorEvent.SourceType.FLUTTER;
                                                break;
                                            case 5:
                                                sourceType = ErrorEvent.SourceType.NDK;
                                                break;
                                            case 6:
                                                sourceType = ErrorEvent.SourceType.NDK_IL2CPP;
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        ErrorEvent.SourceType sourceType2 = sourceType;
                                        ErrorEvent.Category.Companion companion = ErrorEvent.Category.INSTANCE;
                                        ErrorEvent.Category categoryB = RumViewScope.b(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                        List<isImageFormatSupported> list = tuitionPaymentFragmentspecialinlinedviewModeldefault2.a;
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            isImageFormatSupported isimageformatsupported = (isImageFormatSupported) it.next();
                                            arrayList2.add(new ErrorEvent.connect(isimageformatsupported.TuitionPaymentFragmentspecialinlinedviewModeldefault3, isimageformatsupported.b, isimageformatsupported.TuitionPaymentFragmentbindingInflater1, isimageformatsupported.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                            str10 = str10;
                                            it = it;
                                            notifyVar2 = notifyVar2;
                                        }
                                        String str14 = str10;
                                        ErrorEvent.notify notifyVar3 = notifyVar2;
                                        ArrayList arrayList3 = arrayList2;
                                        if (arrayList3.isEmpty()) {
                                            arrayList3 = null;
                                        }
                                        ArrayList arrayList4 = arrayList3;
                                        Long l = tuitionPaymentFragmentspecialinlinedviewModeldefault2.d;
                                        ErrorEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ErrorEvent.RemoteActionCompatParcelizer(null, str6, errorSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1, str8, null, Boolean.valueOf(z2), str3, str7, categoryB, null, null, sourceType2, null, arrayList4, null, null, null, l != null ? Long.valueOf(TimeUnit.NANOSECONDS.toMillis(l.longValue())) : null, 120337, null);
                                        String str15 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                                        ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = str15 != null ? new ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CollectionsKt.listOf(str15)) : null;
                                        String str16 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                                        String str17 = str16 == null ? str14 : str16;
                                        String str18 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact;
                                        String str19 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel;
                                        return new ErrorEvent(j3 + j2, new ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2), recalculatetransformmatrixandcroprect.asInterface, recalculatetransformmatrixandcroprect.getInterfaceDescriptor, null, str13, new ErrorEvent.INotificationSideChannelDefault(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, errorEventSessionType, Boolean.valueOf(zTuitionPaymentFragmentspecialinlinedviewModeldefault1)), MirrorMode.TuitionPaymentFragmentbindingInflater1(ErrorEvent.ErrorEventSource.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, RumViewScope.TuitionPaymentFragmentbindingInflater1(this.this$0).TuitionPaymentFragmentspecialinlinedviewModeldefault3()), new ErrorEvent.INotificationSideChannelStub(str17, null, str19 == null ? str14 : str19, str18, null, 18, null), setTimeoutInMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer) ? new ErrorEvent.getItem(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.b, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentbindingInflater1, MapsKt.toMutableMap(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) : null, MirrorMode.b(recalculatetransformmatrixandcroprect.asBinder), null, mediaBrowserCompat, null, new ErrorEvent.write(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d, null, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, 4, null), new ErrorEvent.onTransact(MirrorMode.TuitionPaymentFragmentbindingInflater1(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface), recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3), new ErrorEvent.INotificationSideChannel(new ErrorEvent.cancel(null, MirrorMode.b(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.a), 1, 0 == true ? 1 : 0), new ErrorEvent.a(Float.valueOf(this.this$0.isConnected), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), null, 4, null), new ErrorEvent.notify(mutableMap2), tuitionPaymentFragmentspecialinlinedviewModeldefault5, null, remoteActionCompatParcelizer, notifyVar3, 534544, null);
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                });
                                if (!z) {
                                    Function1<PreviewBuilder, Unit> function1 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$2$1
                                        public final void TuitionPaymentFragmentbindingInflater1(PreviewBuilder previewBuilder) {
                                            Intrinsics.checkNotNullParameter(previewBuilder, "");
                                            String str8 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                                            previewBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str8 != null ? str8 : "", onSurfaceRequested.b.INSTANCE);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                                            TuitionPaymentFragmentbindingInflater1(previewBuilder);
                                            return Unit.INSTANCE;
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    Intrinsics.checkNotNullParameter(function1, "");
                                    getstatusB.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
                                    Function1<PreviewBuilder, Unit> function2 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$2$2
                                        public final void b(PreviewBuilder previewBuilder) {
                                            Intrinsics.checkNotNullParameter(previewBuilder, "");
                                            String str8 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                                            previewBuilder.TuitionPaymentFragmentbindingInflater1(str8 != null ? str8 : "", onSurfaceRequested.b.INSTANCE);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                                            b(previewBuilder);
                                            return Unit.INSTANCE;
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    Intrinsics.checkNotNullParameter(function2, "");
                                    getstatusB.TuitionPaymentFragmentbindingInflater1 = function2;
                                }
                                getstatusB.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                if (z) {
                                    rumViewScope = this;
                                    rumViewScope.g++;
                                    rumViewScope.d++;
                                    rumViewScope.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault4, p1, eventType3);
                                } else {
                                    rumViewScope = this;
                                    rumViewScope.getRoot++;
                                }
                            }
                        }
                    } else {
                        rumViewScope = this;
                        if (p0 instanceof getPreviewCapabilities.g) {
                            final getPreviewCapabilities.g gVar = (getPreviewCapabilities.g) p0;
                            rumViewScope.b(gVar, p1);
                            if (!rumViewScope.setInternalConnectionCallback) {
                                final MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                final Map mutableMap4 = MapsKt.toMutableMap(MapsKt.mapOf(TuplesKt.to("long_task.target", gVar.b)));
                                mutableMap4.putAll(rumViewScope.INotificationSideChannelStub);
                                long j2 = gVar.TuitionPaymentFragmentbindingInflater1.b;
                                long j3 = rumViewScope.handleMessage;
                                boolean z3 = gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > write;
                                final long j4 = j2 + j3;
                                final boolean z4 = z3;
                                getStatus getstatusB2 = getExecutedTimeInMillis.b(rumViewScope.unsubscribe, p1, EventType.DEFAULT, new Function1<recalculateTransformMatrixAndCropRect, Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$1
                                    @Override // kotlin.jvm.functions.Function1
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                                    public final Object invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect) {
                                        LongTaskEvent.LongTaskEventSessionType longTaskEventSessionType;
                                        LongTaskEvent.Status status;
                                        List listListOf;
                                        LongTaskEvent.DeviceType deviceType;
                                        LongTaskEvent.SessionPrecondition sessionPrecondition;
                                        String str8;
                                        Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                                        lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = recalculatetransformmatrixandcroprect.INotificationSideChannel;
                                        RumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0);
                                        String str9 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.d;
                                        if (str9 == null) {
                                            str9 = "";
                                        }
                                        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = resetMinLogLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(recalculatetransformmatrixandcroprect, str9);
                                        String str10 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.asBinder;
                                        LongTaskEvent.INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = (str10 == null || StringsKt.isBlank(str10) || (str8 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.g) == null || StringsKt.isBlank(str8)) ? null : new LongTaskEvent.INotificationSideChannelStubProxy(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.asBinder, metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.g, null, 4, null);
                                        if (iNotificationSideChannelStubProxy == null) {
                                            longTaskEventSessionType = LongTaskEvent.LongTaskEventSessionType.USER;
                                        } else {
                                            longTaskEventSessionType = LongTaskEvent.LongTaskEventSessionType.SYNTHETICS;
                                        }
                                        long j5 = j4;
                                        long millis = TimeUnit.NANOSECONDS.toMillis(gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        LongTaskEvent.INotificationSideChannel iNotificationSideChannel2 = new LongTaskEvent.INotificationSideChannel(null, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Boolean.valueOf(z4), 1, null);
                                        String str11 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.b;
                                        LongTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = str11 != null ? new LongTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CollectionsKt.listOf(str11)) : null;
                                        String str12 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.d;
                                        String str13 = str12 == null ? "" : str12;
                                        String str14 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.onTransact;
                                        String str15 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.INotificationSideChannel;
                                        LongTaskEvent.INotificationSideChannelStub iNotificationSideChannelStub2 = new LongTaskEvent.INotificationSideChannelStub(str13, null, str15 == null ? "" : str15, str14, 2, null);
                                        LongTaskEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setTimeoutInMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer) ? new LongTaskEvent.RemoteActionCompatParcelizer(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.b, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentbindingInflater1, MapsKt.toMutableMap(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) : null;
                                        NetworkInfo networkInfo = recalculatetransformmatrixandcroprect.asBinder;
                                        Intrinsics.checkNotNullParameter(networkInfo, "");
                                        Intrinsics.checkNotNullParameter(networkInfo, "");
                                        if (networkInfo.TuitionPaymentFragmentbindingInflater1 != NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED) {
                                            status = LongTaskEvent.Status.CONNECTED;
                                        } else {
                                            status = LongTaskEvent.Status.NOT_CONNECTED;
                                        }
                                        LongTaskEvent.Status status2 = status;
                                        switch (MirrorMode.WhenMappings.$EnumSwitchMapping$5[networkInfo.TuitionPaymentFragmentbindingInflater1.ordinal()]) {
                                            case 1:
                                                listListOf = CollectionsKt.listOf(LongTaskEvent.Interface.ETHERNET);
                                                break;
                                            case 2:
                                                listListOf = CollectionsKt.listOf(LongTaskEvent.Interface.WIFI);
                                                break;
                                            case 3:
                                                listListOf = CollectionsKt.listOf(LongTaskEvent.Interface.WIMAX);
                                                break;
                                            case 4:
                                                listListOf = CollectionsKt.listOf(LongTaskEvent.Interface.BLUETOOTH);
                                                break;
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                                listListOf = CollectionsKt.listOf(LongTaskEvent.Interface.CELLULAR);
                                                break;
                                            case 11:
                                                listListOf = CollectionsKt.listOf(LongTaskEvent.Interface.OTHER);
                                                break;
                                            case 12:
                                                listListOf = CollectionsKt.emptyList();
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        LongTaskEvent.d dVar = new LongTaskEvent.d(status2, listListOf, null, (networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null && networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) ? null : new LongTaskEvent.b(networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2, networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1), 4, null);
                                        LongTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = new LongTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                        LongTaskEvent.INotificationSideChannelDefault iNotificationSideChannelDefault = new LongTaskEvent.INotificationSideChannelDefault(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1, longTaskEventSessionType, Boolean.valueOf(zTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                        LongTaskEvent.LongTaskEventSource longTaskEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(LongTaskEvent.LongTaskEventSource.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, RumViewScope.TuitionPaymentFragmentbindingInflater1(this.this$0).TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                                        LongTaskEvent.getInterfaceDescriptor getinterfacedescriptor = new LongTaskEvent.getInterfaceDescriptor(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d, null, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, 4, null);
                                        DeviceType deviceType2 = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface;
                                        Intrinsics.checkNotNullParameter(deviceType2, "");
                                        int i45 = MirrorMode.WhenMappings.$EnumSwitchMapping$6[deviceType2.ordinal()];
                                        if (i45 == 1) {
                                            deviceType = LongTaskEvent.DeviceType.MOBILE;
                                        } else if (i45 == 2) {
                                            deviceType = LongTaskEvent.DeviceType.TABLET;
                                        } else if (i45 == 3) {
                                            deviceType = LongTaskEvent.DeviceType.TV;
                                        } else if (i45 == 4) {
                                            deviceType = LongTaskEvent.DeviceType.DESKTOP;
                                        } else {
                                            deviceType = LongTaskEvent.DeviceType.OTHER;
                                        }
                                        LongTaskEvent.cancelAll cancelall = new LongTaskEvent.cancelAll(deviceType, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        LongTaskEvent.asBinder asbinder = new LongTaskEvent.asBinder(mutableMap4);
                                        RumSessionScope.StartReason startReason = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.a;
                                        Intrinsics.checkNotNullParameter(startReason, "");
                                        switch (MirrorMode.WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
                                            case 1:
                                                sessionPrecondition = LongTaskEvent.SessionPrecondition.USER_APP_LAUNCH;
                                                break;
                                            case 2:
                                                sessionPrecondition = LongTaskEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
                                                break;
                                            case 3:
                                                sessionPrecondition = LongTaskEvent.SessionPrecondition.MAX_DURATION;
                                                break;
                                            case 4:
                                                sessionPrecondition = LongTaskEvent.SessionPrecondition.EXPLICIT_STOP;
                                                break;
                                            case 5:
                                                sessionPrecondition = LongTaskEvent.SessionPrecondition.BACKGROUND_LAUNCH;
                                                break;
                                            case 6:
                                                sessionPrecondition = LongTaskEvent.SessionPrecondition.PREWARM;
                                                break;
                                            case 7:
                                                sessionPrecondition = LongTaskEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        return new LongTaskEvent(j5 - millis, tuitionPaymentFragmentspecialinlinedviewModeldefault6, recalculatetransformmatrixandcroprect.asInterface, recalculatetransformmatrixandcroprect.getInterfaceDescriptor, null, null, iNotificationSideChannelDefault, longTaskEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelStub2, remoteActionCompatParcelizer, dVar, null, iNotificationSideChannelStubProxy, null, getinterfacedescriptor, cancelall, new LongTaskEvent.cancel(new LongTaskEvent.notify(null, sessionPrecondition, 1, null), new LongTaskEvent.g(Float.valueOf(this.this$0.isConnected), null, 2, null), null, null, 12, null), asbinder, tuitionPaymentFragmentspecialinlinedviewModeldefault5, null, iNotificationSideChannel2, 534576, null);
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                });
                                final onSurfaceRequested onsurfacerequested = z3 ? onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE : onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;
                                Function1<PreviewBuilder, Unit> function3 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$2$1
                                    public final void b(PreviewBuilder previewBuilder) {
                                        Intrinsics.checkNotNullParameter(previewBuilder, "");
                                        String str8 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.d;
                                        previewBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str8 != null ? str8 : "", onsurfacerequested);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                                        b(previewBuilder);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                };
                                Intrinsics.checkNotNullParameter(function3, "");
                                getstatusB2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function3;
                                Function1<PreviewBuilder, Unit> function4 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$2$2
                                    public final void b(PreviewBuilder previewBuilder) {
                                        Intrinsics.checkNotNullParameter(previewBuilder, "");
                                        String str8 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault4.d;
                                        previewBuilder.TuitionPaymentFragmentbindingInflater1(str8 != null ? str8 : "", onsurfacerequested);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                                        b(previewBuilder);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                };
                                Intrinsics.checkNotNullParameter(function4, "");
                                getstatusB2.TuitionPaymentFragmentbindingInflater1 = function4;
                                getstatusB2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                rumViewScope.sendCustomAction++;
                                if (z3) {
                                    rumViewScope.getNotifyChildrenChangedOptions++;
                                }
                            }
                        } else if (p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = (getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1) p0;
                            if (!rumViewScope.setInternalConnectionCallback && !Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2, rumViewScope.cancel.get(tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
                                rumViewScope.cancel.put(tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                rumViewScope.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault5, p1, EventType.DEFAULT);
                                d();
                            }
                        } else if (p0 instanceof getPreviewCapabilities.asBinder) {
                            getPreviewCapabilities.asBinder asbinder = (getPreviewCapabilities.asBinder) p0;
                            if (!rumViewScope.setInternalConnectionCallback) {
                                int i45 = MediaBrowserCompatItemReceiver + 113;
                                MediaBrowserCompatMediaBrowserImpl = i45 % 128;
                                Iterator<Map.Entry<String, Object>> it = i45 % 2 != 0 ? asbinder.TuitionPaymentFragmentbindingInflater1.entrySet().iterator() : asbinder.TuitionPaymentFragmentbindingInflater1.entrySet().iterator();
                                boolean z5 = false;
                                while (it.hasNext()) {
                                    Map.Entry<String, Object> next = it.next();
                                    String key = next.getKey();
                                    Object value = next.getValue();
                                    if (!Intrinsics.areEqual(value, rumViewScope.cancel.get(key))) {
                                        rumViewScope.cancel.put(key, value);
                                        z5 = true;
                                    }
                                }
                                if (z5) {
                                    rumViewScope.TuitionPaymentFragmentbindingInflater1(asbinder, p1, EventType.DEFAULT);
                                    d();
                                }
                            }
                        } else if (p0 instanceof getPreviewCapabilities.a) {
                            final getPreviewCapabilities.a aVar = (getPreviewCapabilities.a) p0;
                            rumViewScope.getExtras++;
                            final MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            final Map mutableMap5 = MapsKt.toMutableMap(rumViewScope.INotificationSideChannelStub);
                            getStatus getstatusB3 = getExecutedTimeInMillis.b(rumViewScope.unsubscribe, p1, EventType.DEFAULT, new Function1<recalculateTransformMatrixAndCropRect, Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onApplicationStarted$1
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                                public final Object invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect) {
                                    ActionEvent.ActionEventSessionType actionEventSessionType;
                                    String str8;
                                    Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                                    lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = recalculatetransformmatrixandcroprect.INotificationSideChannel;
                                    String str9 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.asBinder;
                                    ActionEvent.getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = (str9 == null || StringsKt.isBlank(str9) || (str8 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.g) == null || StringsKt.isBlank(str8)) ? null : new ActionEvent.getNotifyChildrenChangedOptions(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.asBinder, metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.g, null, 4, null);
                                    if (getnotifychildrenchangedoptions == null) {
                                        actionEventSessionType = ActionEvent.ActionEventSessionType.USER;
                                    } else {
                                        actionEventSessionType = ActionEvent.ActionEventSessionType.SYNTHETICS;
                                    }
                                    long j5 = rumViewScope.onTransact;
                                    ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = new ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActionEvent.ActionEventActionType.APPLICATION_START, UUID.randomUUID().toString(), Long.valueOf(aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1), null, null, new ActionEvent.IconCompatParcelizer(0L), new ActionEvent.cancel(0L), new ActionEvent.connect(0L), new ActionEvent.disconnect(0L), 24, null);
                                    String str10 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.d;
                                    String str11 = str10 == null ? "" : str10;
                                    String str12 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.onTransact;
                                    String str13 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.INotificationSideChannel;
                                    ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault7 = new ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str11, null, str13 == null ? "" : str13, str12, null, 18, null);
                                    ActionEvent.getRoot getroot = setTimeoutInMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer) ? new ActionEvent.getRoot(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.b, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentbindingInflater1, MapsKt.toMutableMap(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) : null;
                                    return new ActionEvent(j5, new ActionEvent.b(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2), recalculatetransformmatrixandcroprect.asInterface, recalculatetransformmatrixandcroprect.getInterfaceDescriptor, null, null, new ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault1, actionEventSessionType, Boolean.FALSE), MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActionEvent.ActionEventSource.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, RumViewScope.TuitionPaymentFragmentbindingInflater1(rumViewScope).TuitionPaymentFragmentspecialinlinedviewModeldefault3()), tuitionPaymentFragmentspecialinlinedviewModeldefault7, getroot, MirrorMode.TuitionPaymentFragmentbindingInflater1(recalculatetransformmatrixandcroprect.asBinder), null, getnotifychildrenchangedoptions, null, new ActionEvent.write(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d, null, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, 4, null), new ActionEvent.getInterfaceDescriptor(MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface), recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3), new ActionEvent.cancelAll(new ActionEvent.RemoteActionCompatParcelizer(null, MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.a), 1, null), new ActionEvent.g(Float.valueOf(rumViewScope.isConnected), null, 2, null), null, null, 12, null), new ActionEvent.onTransact(mutableMap5), null, tuitionPaymentFragmentspecialinlinedviewModeldefault6, 272432, null);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            });
                            final onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = new onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
                            Function1<PreviewBuilder, Unit> function5 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onApplicationStarted$2$1
                                public final void TuitionPaymentFragmentbindingInflater1(PreviewBuilder previewBuilder) {
                                    Intrinsics.checkNotNullParameter(previewBuilder, "");
                                    String str8 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.d;
                                    previewBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str8 != null ? str8 : "", tuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                                    TuitionPaymentFragmentbindingInflater1(previewBuilder);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            Intrinsics.checkNotNullParameter(function5, "");
                            getstatusB3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function5;
                            Function1<PreviewBuilder, Unit> function6 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onApplicationStarted$2$2
                                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PreviewBuilder previewBuilder) {
                                    Intrinsics.checkNotNullParameter(previewBuilder, "");
                                    String str8 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault5.d;
                                    previewBuilder.TuitionPaymentFragmentbindingInflater1(str8 != null ? str8 : "", tuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewBuilder);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            Intrinsics.checkNotNullParameter(function6, "");
                            getstatusB3.TuitionPaymentFragmentbindingInflater1 = function6;
                            getstatusB3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        } else if (p0 instanceof getPreviewCapabilities.b) {
                            getPreviewCapabilities.b bVar3 = (getPreviewCapabilities.b) p0;
                            if (!rumViewScope.setInternalConnectionCallback) {
                                rumViewScope.asBinder.put(bVar3.b, Long.valueOf(Math.max(bVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - rumViewScope.setCallbacksMessenger, 1L)));
                                rumViewScope.TuitionPaymentFragmentbindingInflater1(bVar3, p1, EventType.DEFAULT);
                            }
                        } else if (p0 instanceof getPreviewCapabilities.cancelAll) {
                            int i46 = MediaBrowserCompatMediaBrowserImpl + 77;
                            MediaBrowserCompatItemReceiver = i46 % 128;
                            int i47 = i46 % 2;
                            getPreviewCapabilities.cancelAll cancelall = (getPreviewCapabilities.cancelAll) p0;
                            rumViewScope.b(cancelall, p1);
                            if (!rumViewScope.setInternalConnectionCallback) {
                                rumViewScope.TuitionPaymentFragmentbindingInflater1(cancelall, p1, EventType.DEFAULT);
                            }
                        } else if (p0 instanceof getPreviewCapabilities.getRoot) {
                            rumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault3((getPreviewCapabilities.getRoot) p0, p1, new Function0<Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$stopScope$1
                                public final void b() {
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final /* synthetic */ Unit invoke() {
                                    b();
                                    return Unit.INSTANCE;
                                }
                            });
                        } else if (p0 instanceof getPreviewCapabilities.getServiceComponent) {
                            getPreviewCapabilities.getServiceComponent getservicecomponent = (getPreviewCapabilities.getServiceComponent) p0;
                            if (!rumViewScope.setInternalConnectionCallback) {
                                double d = getservicecomponent.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                getRetryDelayInMillis getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2 = rumViewScope.getSessionToken.get(getservicecomponent.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                if (getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                    getRetryDelayInMillis.Companion companion = getRetryDelayInMillis.INSTANCE;
                                    getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getRetryDelayInMillis.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                }
                                int i48 = getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                                rumViewScope.getSessionToken.put(getservicecomponent.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new getRetryDelayInMillis(i48, Math.min(d, getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1), Math.max(d, getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1), ((((double) getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * getretrydelayinmillisTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + d) / ((double) i48)));
                            }
                        } else if (p0 instanceof getPreviewCapabilities.asInterface) {
                            int i49 = MediaBrowserCompatItemReceiver + 39;
                            MediaBrowserCompatMediaBrowserImpl = i49 % 128;
                            if (i49 % 2 != 0) {
                                rumViewScope.unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                throw null;
                            }
                            getPreviewCapabilities.asInterface asinterface = (getPreviewCapabilities.asInterface) p0;
                            InternalLogger internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = rumViewScope.unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            Object[] objArr21 = !rumViewScope.setInternalConnectionCallback && (rumViewScope.MediaBrowserCompatCustomActionCallback == null || asinterface.TuitionPaymentFragmentbindingInflater1);
                            if (rumViewScope.setInternalConnectionCallback) {
                                internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddViewLoadingTime$1
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                                    public final String invoke() {
                                        return "No active view found to add the loading time.";
                                    }
                                }, null, false, null);
                                internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new LayoutSettings.b.TuitionPaymentFragmentbindingInflater1(asinterface.TuitionPaymentFragmentbindingInflater1, false, true, null, 8, null), 15.0f);
                            }
                            if (objArr21 != false) {
                                final String str8 = rumViewScope.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                final Long l = rumViewScope.MediaBrowserCompatCustomActionCallback;
                                final long j5 = asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - rumViewScope.setCallbacksMessenger;
                                if (l == null) {
                                    internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.DEBUG, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$1
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            String str9 = String.format(Locale.US, "View loading time %dns added to the view %s", Arrays.copyOf(new Object[]{this.this$0.MediaBrowserCompatCustomActionCallback, str8}, 2));
                                            Intrinsics.checkNotNullExpressionValue(str9, "");
                                            return str9;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }
                                    }, null, false, null);
                                    internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new LayoutSettings.b.TuitionPaymentFragmentbindingInflater1(false, false, false, null, 8, null), 15.0f);
                                } else if (asinterface.TuitionPaymentFragmentbindingInflater1) {
                                    internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$2
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            String str9 = String.format(Locale.US, "View loading time already exists for the view %s. Replacing the existing %d ns view loading time with the new %d ns loading time.", Arrays.copyOf(new Object[]{str8, l, Long.valueOf(j5)}, 3));
                                            Intrinsics.checkNotNullExpressionValue(str9, "");
                                            return str9;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }
                                    }, null, false, null);
                                    internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new LayoutSettings.b.TuitionPaymentFragmentbindingInflater1(true, false, false, null, 8, null), 15.0f);
                                }
                                rumViewScope.MediaBrowserCompatCustomActionCallback = Long.valueOf(j5);
                                rumViewScope.TuitionPaymentFragmentbindingInflater1(asinterface, p1, EventType.DEFAULT);
                            }
                        } else {
                            preview = null;
                            b(p0, p1);
                        }
                    }
                    preview = null;
                }
                rumViewScope = this;
                preview = null;
            }
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                return rumViewScope;
            }
            rumViewScope.unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault2("session-replay", new Function1<Map<String, Object>, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1
                private static final byte[] $$c = {23, -73, 107, 5};
                private static final int $$f = 80;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {64, 73, -26, 82, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
                private static final int $$e = 113;
                private static final byte[] $$a = {31, 115, -100, -11, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
                private static final int $$b = 136;
                private static int $a = 0;
                private static int $g = 1;
                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47306, 47357, 47303, 47353, 47356, 47298, 47293, 47304, 47351, 47302, 47272, 47347, 47300, 47323, 47296, 47325, 47358, 47355, 47243, 47359, 47352, 47281, 47349, 47308, 47346, 47320, 47271, 47326, 47292, 47350, 47324, 47266, 47301, 47299};
                private static int TuitionPaymentFragmentbindingInflater1 = 2047719531;
                private static boolean b = true;
                private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60088, 60118, 60117, 60054, 60035, 60057, 60055, 60047, 60085, 60046, 60097, 60045, 60093, 60094, 60044, 60051, 60061, 60043, 60092, 60095, 60041, 60064, 60048, 60123, 60070, 60091, 60062, 60050, 60082, 60116, 60063, 60053, 60052, 60034, 60037, 60099, 60056, 60090, 60075, 60060, 60084, 60040, 60145, 60032, 60079, 60078, 60033, 60058, 60068};
                private static char asInterface = 57190;

                /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                /* JADX WARN: Code duplicated, block: B:8:0x001b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void d(int r5, short r6, short r7, java.lang.Object[] r8) {
                    /*
                        int r6 = r6 * 3
                        int r6 = r6 + 97
                        int r7 = r7 + 4
                        int r5 = r5 + 4
                        byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.$$a
                        byte[] r1 = new byte[r5]
                        r2 = 0
                        if (r0 != 0) goto L13
                        r4 = r6
                        r3 = r2
                        r6 = r5
                        goto L25
                    L13:
                        r3 = r2
                    L14:
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        int r3 = r3 + 1
                        if (r3 != r5) goto L23
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r1, r2)
                        r8[r2] = r5
                        return
                    L23:
                        r4 = r0[r7]
                    L25:
                        int r7 = r7 + 1
                        int r6 = r6 + r4
                        int r6 = r6 + (-2)
                        goto L14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.d(int, short, short, java.lang.Object[]):void");
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
                private static void e(short r6, byte r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r8 = r8 + 4
                        int r7 = 103 - r7
                        byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.$$d
                        int r6 = r6 * 52
                        int r1 = r6 + 1
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L13
                        r4 = r6
                        r7 = r8
                        r3 = r2
                        goto L2a
                    L13:
                        r3 = r2
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L17:
                        byte r4 = (byte) r8
                        r1[r3] = r4
                        int r7 = r7 + 1
                        if (r3 != r6) goto L26
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L26:
                        int r3 = r3 + 1
                        r4 = r0[r7]
                    L2a:
                        int r4 = -r4
                        int r8 = r8 + r4
                        int r8 = r8 + (-10)
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.e(short, byte, int, java.lang.Object[]):void");
                }

                private static void a(char[] cArr, int[] iArr, int i50, byte[] bArr6, Object[] objArr22) throws Throwable {
                    char[] cArr2;
                    int i51 = 2 % 2;
                    getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                    char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i52 = 0;
                    if (cArr3 != null) {
                        int i53 = $11 + 13;
                        $10 = i53 % 128;
                        int i54 = i53 % 2;
                        int length = cArr3.length;
                        char[] cArr4 = new char[length];
                        int i55 = 0;
                        while (i55 < length) {
                            try {
                                Object[] objArr23 = new Object[1];
                                objArr23[i52] = Integer.valueOf(cArr3[i55]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                    byte b10 = (byte) i52;
                                    byte b11 = (byte) (b10 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 31339), View.MeasureSpec.getSize(i52) + 2994, TextUtils.indexOf("", "", i52) + 17, 1182129903, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Integer.TYPE});
                                }
                                cArr4[i55] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).charValue();
                                i55++;
                                i52 = 0;
                            } catch (Throwable th4) {
                                Throwable cause2 = th4.getCause();
                                if (cause2 == null) {
                                    throw th4;
                                }
                                throw cause2;
                            }
                        }
                        cArr3 = cArr4;
                    }
                    Object[] objArr24 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (43324 - TextUtils.lastIndexOf("", '0', 0, 0)), 253 - View.getDefaultSize(0, 0), 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr24)).intValue();
                    long j6 = 0;
                    int i56 = 33602;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i57 = $11 + 23;
                        $10 = i57 % 128;
                        if (i57 % 2 != 0) {
                            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr6.length;
                            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        } else {
                            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr6.length;
                            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        }
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr6[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i50] - iIntValue);
                            Object[] objArr25 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (33602 - Color.green(0)), 3084 - (ExpandableListView.getPackedPositionForChild(0, 0) > j6 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j6 ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 26, -2146875848, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr25);
                            j6 = 0;
                        }
                        objArr22[0] = new String(cArr2);
                        return;
                    }
                    if (!b) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                        char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i50] - iIntValue);
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                            int i58 = $11 + 71;
                            $10 = i58 % 128;
                            int i59 = i58 % 2;
                        }
                        objArr22[0] = new String(cArr5);
                        return;
                    }
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i50] - iIntValue);
                        Object[] objArr26 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (i56 - TextUtils.getTrimmedLength("")), TextUtils.indexOf("", "", 0) + 3085, ExpandableListView.getPackedPositionChild(0L) + 27, -2146875848, false, $$g(b14, b15, b15), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr26);
                        i56 = 33602;
                    }
                    objArr22[0] = new String(cArr6);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(Map<String, Object> map2) {
                    int i50 = 2 % 2;
                    int i51 = $a + 5;
                    $g = i51 % 128;
                    int i52 = i51 % 2;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(map2);
                    Unit unit = Unit.INSTANCE;
                    int i53 = $a + 69;
                    $g = i53 % 128;
                    if (i53 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }

                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<String, Object> map2) {
                    int i50 = 2 % 2;
                    int i51 = $g + 51;
                    $a = i51 % 128;
                    if (i51 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(map2, "");
                        map2.remove(this.this$0.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
                    } else {
                        Intrinsics.checkNotNullParameter(map2, "");
                        map2.remove(this.this$0.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
                        throw null;
                    }
                }

                private static void c(int i50, char[] cArr, byte b10, Object[] objArr22) throws Throwable {
                    int i51;
                    Object obj2;
                    int i52 = 2;
                    int i53 = 2 % 2;
                    deInitSession deinitsession = new deInitSession();
                    char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i54 = 1770390596;
                    Object obj3 = null;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i55 = 0;
                        while (i55 < length) {
                            int i56 = $10 + 79;
                            $11 = i56 % 128;
                            if (i56 % i52 == 0) {
                                try {
                                    Object[] objArr23 = {Integer.valueOf(cArr2[i55])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i54);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                        byte b11 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 33 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1927765101, false, $$g(b11, (byte) (b11 | 46), b11), new Class[]{Integer.TYPE});
                                    }
                                    cArr3[i55] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).charValue();
                                    i55 >>>= 1;
                                    i52 = 2;
                                } catch (Throwable th4) {
                                    Throwable cause2 = th4.getCause();
                                    if (cause2 == null) {
                                        throw th4;
                                    }
                                    throw cause2;
                                }
                            } else {
                                Object[] objArr24 = {Integer.valueOf(cArr2[i55])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i54);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                    byte b12 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), Color.green(0) + 2267, (-16777183) - Color.rgb(0, 0, 0), -1927765101, false, $$g(b12, (byte) (b12 | 46), b12), new Class[]{Integer.TYPE});
                                }
                                cArr3[i55] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr24)).charValue();
                                i55++;
                                i52 = 2;
                                i54 = 1770390596;
                            }
                        }
                        cArr2 = cArr3;
                    }
                    Object[] objArr25 = {Integer.valueOf(asInterface)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        byte b13 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Drawable.resolveOpacity(0, 0) + 2267, 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1927765101, false, $$g(b13, (byte) (b13 | 46), b13), new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr25)).charValue();
                    char[] cArr4 = new char[i50];
                    if (i50 % 2 != 0) {
                        i51 = i50 - 1;
                        cArr4[i51] = (char) (cArr[i51] - b10);
                    } else {
                        i51 = i50;
                    }
                    if (i51 > 1) {
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i51) {
                            int i57 = $11 + 63;
                            $10 = i57 % 128;
                            int i58 = i57 % 2;
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b10);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b10);
                                obj2 = obj3;
                            } else {
                                Object[] objArr26 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                    byte b14 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (49267 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 3261, TextUtils.getTrimmedLength("") + 30, -127612708, false, $$g(b14, (byte) (b14 | 47), b14), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr26)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr27 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                        byte b15 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22878), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 593, TextUtils.getTrimmedLength("") + 17, 1570859318, false, $$g(b15, (byte) (b15 | 49), b15), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj2 = null;
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr27)).intValue();
                                    int i59 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i59];
                                } else {
                                    obj2 = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i60 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i61 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i60];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i61];
                                    } else {
                                        int i62 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i63 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i62];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i63];
                                    }
                                }
                            }
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                            obj3 = obj2;
                        }
                    }
                    for (int i64 = 0; i64 < i50; i64++) {
                        cArr4[i64] = (char) (cArr4[i64] ^ 13722);
                    }
                    objArr22[0] = new String(cArr4);
                }

                {
                    super(1);
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0a64 A[Catch: IOException -> 0x0cb3, Exception -> 0x0cef, all -> 0x0d9a, TryCatch #0 {Exception -> 0x0cef, blocks: (B:69:0x0764, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb), top: B:285:0x0764 }] */
                /* JADX WARN: Code duplicated, block: B:103:0x0abf A[Catch: IOException -> 0x0cb3, Exception -> 0x0cef, all -> 0x0d9a, TryCatch #0 {Exception -> 0x0cef, blocks: (B:69:0x0764, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb), top: B:285:0x0764 }] */
                /* JADX WARN: Code duplicated, block: B:107:0x0b3f A[Catch: IOException -> 0x0cb3, all -> 0x0d9a, TRY_LEAVE, TryCatch #4 {IOException -> 0x0cb3, blocks: (B:69:0x0764, B:97:0x0a53, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb, B:105:0x0b0c, B:107:0x0b3f), top: B:285:0x0764 }] */
                /* JADX WARN: Code duplicated, block: B:111:0x0bbc A[Catch: IOException -> 0x0c9b, all -> 0x0d9a, TryCatch #30 {, blocks: (B:43:0x05e9, B:44:0x0606, B:49:0x0681, B:59:0x06d5, B:69:0x0764, B:97:0x0a53, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb, B:105:0x0b0c, B:107:0x0b3f, B:109:0x0b97, B:111:0x0bbc, B:113:0x0c28, B:115:0x0c4d, B:117:0x0c71, B:119:0x0c7b, B:150:0x0ceb, B:151:0x0cee, B:191:0x0d67, B:192:0x0d99, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:319:0x05e9 }] */
                /* JADX WARN: Code duplicated, block: B:113:0x0c28 A[Catch: IOException -> 0x0c9b, all -> 0x0d9a, TryCatch #30 {, blocks: (B:43:0x05e9, B:44:0x0606, B:49:0x0681, B:59:0x06d5, B:69:0x0764, B:97:0x0a53, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb, B:105:0x0b0c, B:107:0x0b3f, B:109:0x0b97, B:111:0x0bbc, B:113:0x0c28, B:115:0x0c4d, B:117:0x0c71, B:119:0x0c7b, B:150:0x0ceb, B:151:0x0cee, B:191:0x0d67, B:192:0x0d99, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:319:0x05e9 }] */
                /* JADX WARN: Code duplicated, block: B:115:0x0c4d A[Catch: IOException -> 0x0c9b, all -> 0x0d9a, TryCatch #30 {, blocks: (B:43:0x05e9, B:44:0x0606, B:49:0x0681, B:59:0x06d5, B:69:0x0764, B:97:0x0a53, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb, B:105:0x0b0c, B:107:0x0b3f, B:109:0x0b97, B:111:0x0bbc, B:113:0x0c28, B:115:0x0c4d, B:117:0x0c71, B:119:0x0c7b, B:150:0x0ceb, B:151:0x0cee, B:191:0x0d67, B:192:0x0d99, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:319:0x05e9 }] */
                /* JADX WARN: Code duplicated, block: B:117:0x0c71 A[Catch: IOException -> 0x0c9b, all -> 0x0d9a, TRY_LEAVE, TryCatch #30 {, blocks: (B:43:0x05e9, B:44:0x0606, B:49:0x0681, B:59:0x06d5, B:69:0x0764, B:97:0x0a53, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb, B:105:0x0b0c, B:107:0x0b3f, B:109:0x0b97, B:111:0x0bbc, B:113:0x0c28, B:115:0x0c4d, B:117:0x0c71, B:119:0x0c7b, B:150:0x0ceb, B:151:0x0cee, B:191:0x0d67, B:192:0x0d99, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:319:0x05e9 }] */
                /* JADX WARN: Code duplicated, block: B:121:0x0c98  */
                /* JADX WARN: Code duplicated, block: B:123:0x0c9f  */
                /* JADX WARN: Code duplicated, block: B:169:0x0d1e A[Catch: Exception -> 0x0d67, all -> 0x0d9a, IOException -> 0x0d9e, TryCatch #13 {Exception -> 0x0d67, blocks: (B:151:0x0cee, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:302:0x0606 }] */
                /* JADX WARN: Code duplicated, block: B:170:0x0d1f A[Catch: Exception -> 0x0d67, all -> 0x0d9a, IOException -> 0x0d9e, TryCatch #13 {Exception -> 0x0d67, blocks: (B:151:0x0cee, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:302:0x0606 }] */
                /* JADX WARN: Code duplicated, block: B:199:0x0da0  */
                /* JADX WARN: Code duplicated, block: B:232:0x127a A[EDGE_INSN: B:232:0x127a->B:233:0x127f BREAK  A[LOOP:5: B:212:0x0f8b->B:231:0x1268], PHI: r1 r2 r3
  0x127a: PHI (r1v7 int) = (r1v4 int), (r1v4 int), (r1v13 int) binds: [B:208:0x0ee4, B:210:0x0f85, B:347:0x127a] A[DONT_GENERATE, DONT_INLINE]
  0x127a: PHI (r2v9 java.lang.String[]) = (r2v5 java.lang.String[]), (r2v5 java.lang.String[]), (r2v12 java.lang.String[]) binds: [B:208:0x0ee4, B:210:0x0f85, B:347:0x127a] A[DONT_GENERATE, DONT_INLINE]
  0x127a: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v11 int) binds: [B:208:0x0ee4, B:210:0x0f85, B:347:0x127a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:24:0x0386  */
                /* JADX WARN: Code duplicated, block: B:26:0x0389  */
                /* JADX WARN: Code duplicated, block: B:29:0x03ab A[Catch: all -> 0x1a23, TryCatch #2 {all -> 0x1a23, blocks: (B:12:0x01e0, B:14:0x01f6, B:16:0x0258, B:27:0x0393, B:29:0x03ab, B:31:0x0402, B:222:0x1133, B:224:0x114a, B:226:0x11a0, B:248:0x1311, B:250:0x131e, B:251:0x1362, B:253:0x1451, B:255:0x145e, B:256:0x14a1, B:258:0x15d5, B:260:0x15e2, B:261:0x162e, B:263:0x1732, B:265:0x173f, B:266:0x1785, B:268:0x1852, B:270:0x185f, B:271:0x18ab), top: B:289:0x01e0 }] */
                /* JADX WARN: Code duplicated, block: B:30:0x0400  */
                /* JADX WARN: Code duplicated, block: B:317:0x0692 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:319:0x05e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:336:0x04ad A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:337:0x04be A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:342:0x0cb3 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:343:0x0c7b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:35:0x04af A[LOOP:1: B:25:0x0387->B:35:0x04af, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:36:0x04be A[EDGE_INSN: B:36:0x04be->B:37:0x04c6 BREAK  A[LOOP:1: B:25:0x0387->B:35:0x04af], PHI: r1 r2 r5 r8 r23 r28
  0x04be: PHI (r1v44 int) = (r1v43 int), (r1v136 int) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r2v41 int) = (r2v40 int), (r2v93 int) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r5v48 java.lang.Object) = (r5v47 java.lang.Object), (r5v166 java.lang.Object) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r8v95 int) = (r8v35 int), (r8v205 int) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r23v3 ??) = (r23v27 ??), (r23v22 ??) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r28v10 ??) = (r28v29 ??), (r28v26 ??) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:39:0x0562  */
                /* JADX WARN: Code duplicated, block: B:41:0x05cc  */
                /* JADX WARN: Code duplicated, block: B:47:0x064a A[Catch: all -> 0x0d3c, TryCatch #15 {all -> 0x0d3c, blocks: (B:45:0x063d, B:47:0x064a, B:48:0x067b), top: B:306:0x063d }] */
                /* JADX WARN: Code duplicated, block: B:57:0x06cd  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v112 */
                /* JADX WARN: Type inference failed for: r1v135 */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r1v227 */
                /* JADX WARN: Type inference failed for: r1v228 */
                /* JADX WARN: Type inference failed for: r1v229 */
                /* JADX WARN: Type inference failed for: r1v230 */
                /* JADX WARN: Type inference failed for: r1v3 */
                /* JADX WARN: Type inference failed for: r1v56 */
                /* JADX WARN: Type inference failed for: r1v57 */
                /* JADX WARN: Type inference failed for: r1v58 */
                /* JADX WARN: Type inference failed for: r23v10 */
                /* JADX WARN: Type inference failed for: r23v11 */
                /* JADX WARN: Type inference failed for: r23v12 */
                /* JADX WARN: Type inference failed for: r23v13 */
                /* JADX WARN: Type inference failed for: r23v14 */
                /* JADX WARN: Type inference failed for: r23v15 */
                /* JADX WARN: Type inference failed for: r23v16 */
                /* JADX WARN: Type inference failed for: r23v22 */
                /* JADX WARN: Type inference failed for: r23v27 */
                /* JADX WARN: Type inference failed for: r23v3 */
                /* JADX WARN: Type inference failed for: r23v33 */
                /* JADX WARN: Type inference failed for: r23v34 */
                /* JADX WARN: Type inference failed for: r23v35 */
                /* JADX WARN: Type inference failed for: r23v36 */
                /* JADX WARN: Type inference failed for: r23v37 */
                /* JADX WARN: Type inference failed for: r23v4 */
                /* JADX WARN: Type inference failed for: r23v5 */
                /* JADX WARN: Type inference failed for: r23v6 */
                /* JADX WARN: Type inference failed for: r23v7 */
                /* JADX WARN: Type inference failed for: r23v8 */
                /* JADX WARN: Type inference failed for: r23v9 */
                /* JADX WARN: Type inference failed for: r27v10 */
                /* JADX WARN: Type inference failed for: r27v11 */
                /* JADX WARN: Type inference failed for: r27v12 */
                /* JADX WARN: Type inference failed for: r27v13 */
                /* JADX WARN: Type inference failed for: r27v2 */
                /* JADX WARN: Type inference failed for: r27v20 */
                /* JADX WARN: Type inference failed for: r27v21 */
                /* JADX WARN: Type inference failed for: r27v22 */
                /* JADX WARN: Type inference failed for: r27v3 */
                /* JADX WARN: Type inference failed for: r27v4 */
                /* JADX WARN: Type inference failed for: r27v5 */
                /* JADX WARN: Type inference failed for: r27v6 */
                /* JADX WARN: Type inference failed for: r27v7 */
                /* JADX WARN: Type inference failed for: r27v8 */
                /* JADX WARN: Type inference failed for: r27v9 */
                /* JADX WARN: Type inference failed for: r28v0 */
                /* JADX WARN: Type inference failed for: r28v1 */
                /* JADX WARN: Type inference failed for: r28v10 */
                /* JADX WARN: Type inference failed for: r28v11 */
                /* JADX WARN: Type inference failed for: r28v12 */
                /* JADX WARN: Type inference failed for: r28v13 */
                /* JADX WARN: Type inference failed for: r28v14 */
                /* JADX WARN: Type inference failed for: r28v15 */
                /* JADX WARN: Type inference failed for: r28v16 */
                /* JADX WARN: Type inference failed for: r28v17 */
                /* JADX WARN: Type inference failed for: r28v18 */
                /* JADX WARN: Type inference failed for: r28v19 */
                /* JADX WARN: Type inference failed for: r28v20 */
                /* JADX WARN: Type inference failed for: r28v21 */
                /* JADX WARN: Type inference failed for: r28v22 */
                /* JADX WARN: Type inference failed for: r28v23 */
                /* JADX WARN: Type inference failed for: r28v24 */
                /* JADX WARN: Type inference failed for: r28v25 */
                /* JADX WARN: Type inference failed for: r28v26 */
                /* JADX WARN: Type inference failed for: r28v29 */
                /* JADX WARN: Type inference failed for: r28v40 */
                /* JADX WARN: Type inference failed for: r28v41 */
                /* JADX WARN: Type inference failed for: r28v42 */
                /* JADX WARN: Type inference failed for: r28v43 */
                /* JADX WARN: Type inference failed for: r28v44 */
                /* JADX WARN: Type inference failed for: r28v45 */
                /* JADX WARN: Type inference failed for: r28v46 */
                /* JADX WARN: Type inference failed for: r28v47 */
                /* JADX WARN: Type inference failed for: r28v48 */
                /* JADX WARN: Type inference failed for: r29v13 */
                /* JADX WARN: Type inference failed for: r29v2 */
                /* JADX WARN: Type inference failed for: r29v20 */
                /* JADX WARN: Type inference failed for: r29v21 */
                /* JADX WARN: Type inference failed for: r29v22 */
                /* JADX WARN: Type inference failed for: r29v3 */
                /* JADX WARN: Type inference failed for: r29v4 */
                /* JADX WARN: Type inference failed for: r29v5 */
                /* JADX WARN: Type inference failed for: r29v6 */
                /* JADX WARN: Type inference failed for: r29v7 */
                /* JADX WARN: Type inference failed for: r29v8 */
                /* JADX WARN: Type inference failed for: r2v276 */
                /* JADX WARN: Type inference failed for: r2v277 */
                /* JADX WARN: Type inference failed for: r2v278 */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r2v59 */
                /* JADX WARN: Type inference failed for: r2v60 */
                /* JADX WARN: Type inference failed for: r31v10 */
                /* JADX WARN: Type inference failed for: r31v12 */
                /* JADX WARN: Type inference failed for: r31v13 */
                /* JADX WARN: Type inference failed for: r31v14 */
                /* JADX WARN: Type inference failed for: r31v15 */
                /* JADX WARN: Type inference failed for: r31v16 */
                /* JADX WARN: Type inference failed for: r31v19 */
                /* JADX WARN: Type inference failed for: r31v20 */
                /* JADX WARN: Type inference failed for: r31v9 */
                /* JADX WARN: Type inference failed for: r4v106 */
                /* JADX WARN: Type inference failed for: r4v107 */
                /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.reflect.Field] */
                /* JADX WARN: Type inference failed for: r4v304 */
                /* JADX WARN: Type inference failed for: r4v305 */
                /* JADX WARN: Type inference failed for: r4v306 */
                /* JADX WARN: Type inference failed for: r4v32 */
                /* JADX WARN: Type inference failed for: r5v154, types: [java.lang.String[]] */
                /* JADX WARN: Type inference failed for: r5v155, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String[]] */
                /* JADX WARN: Type inference failed for: r5v361 */
                /* JADX WARN: Type inference failed for: r5v70 */
                /* JADX WARN: Type inference failed for: r5v71 */
                /* JADX WARN: Type inference failed for: r7v173 */
                /* JADX WARN: Type inference failed for: r7v174 */
                /* JADX WARN: Type inference failed for: r7v204, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v26, types: [int[]] */
                /* JADX WARN: Type inference failed for: r8v101, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r8v102 */
                /* JADX WARN: Type inference failed for: r8v103 */
                /* JADX WARN: Type inference failed for: r8v106 */
                /* JADX WARN: Type inference failed for: r8v107 */
                /* JADX WARN: Type inference failed for: r8v120 */
                /* JADX WARN: Type inference failed for: r8v123 */
                /* JADX WARN: Type inference failed for: r8v126 */
                /* JADX WARN: Type inference failed for: r8v162 */
                /* JADX WARN: Type inference failed for: r8v231 */
                public static Object[] b(Context context, int i50, int i51, int i52) throws Throwable {
                    int i53;
                    ?? r28;
                    int i54;
                    ?? r1;
                    int i55;
                    int i56;
                    String[] strArr4;
                    int i57;
                    int i58;
                    int i59;
                    Object obj2;
                    int i60;
                    int i61;
                    int i62;
                    int i63;
                    Object obj3;
                    String str9;
                    int i64;
                    ?? r29;
                    ?? r23;
                    int i65;
                    int i66;
                    Object obj4;
                    int i67;
                    int i68;
                    ?? r210;
                    ?? r24;
                    int i69;
                    int i70;
                    ?? r211;
                    ?? r212;
                    ?? r27;
                    ?? r25;
                    ?? r5;
                    ?? r4;
                    ?? r2;
                    ?? r8;
                    Object[] objArr22;
                    ?? r3;
                    ?? r26;
                    Process processExec;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                    Throwable th4;
                    Throwable cause2;
                    boolean z6;
                    Throwable th5;
                    ?? r9;
                    ?? r31;
                    ?? r32;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                    String[] strArrSplit;
                    int length;
                    int i71;
                    ?? r33;
                    String str10;
                    Object[] objArr23;
                    ?? r7;
                    Object[] objArr24;
                    Object[] objArr25;
                    ?? Split;
                    int i72;
                    String str11;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                    int i73;
                    Object obj5;
                    long j6;
                    int i74;
                    int i75;
                    Class[] clsArr;
                    int i76 = i50;
                    char c2 = 1;
                    int i77 = 0;
                    if (context != null) {
                        try {
                            int i78 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            Object[] objArr26 = new Object[1];
                            a(null, null, ((i78 | 128) << 1) - (i78 ^ 128), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr26);
                            Class<?> cls7 = Class.forName((String) objArr26[0]);
                            int iArgb2 = Color.argb(0, 0, 0, 0);
                            Object[] objArr27 = new Object[1];
                            a(null, null, (iArgb2 ^ 127) + ((iArgb2 & 127) << 1), new byte[]{-118, -111, -127, -112, -118, -115, -127, -113, -120, -127, -114, -119, -118, -115}, objArr27);
                            String str12 = (String) cls7.getMethod((String) objArr27[0], null).invoke(context, null);
                            int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                            int i79 = (scrollBarSize2 * (-375)) - 47625;
                            int i80 = ~scrollBarSize2;
                            int i81 = (~((i80 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i80 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) | i76;
                            int i82 = (scrollBarSize2 ^ 127) | (scrollBarSize2 & 127);
                            int i83 = ~i82;
                            int i84 = -(-(((i81 ^ i83) | (i83 & i81)) * 376));
                            int i85 = (i79 & i84) + (i84 | i79);
                            int i86 = ~i76;
                            int i87 = ~((i86 ^ scrollBarSize2) | (i86 & scrollBarSize2));
                            int i88 = ~i82;
                            int i89 = -(-(((i87 ^ i88) | (i88 & i87)) * (-376)));
                            Object[] objArr28 = new Object[1];
                            a(null, null, (i85 & i89) + (i89 | i85) + (((~((~scrollBarSize2) | i76)) | 127) * 376), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr28);
                            Class<?> cls8 = Class.forName((String) objArr28[0]);
                            int i90 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int i91 = ~i90;
                            int i92 = (((i90 * 592) - 10620) - (~((~((i91 ^ 18) | (i91 & 18))) * (-1182)))) - 1;
                            int i93 = (i91 ^ (-19)) | (i91 & (-19));
                            int i94 = ~i76;
                            int i95 = ((~((i93 ^ i94) | (i93 & i94))) | (~((i90 ^ 18) | (i90 & 18)))) * (-591);
                            int i96 = (i92 & i95) + (i95 | i92);
                            int i97 = (i76 ^ i91) | (i76 & i91);
                            int i98 = ((i97 & (-19)) | (i97 ^ (-19))) * 591;
                            int i99 = (i96 ^ i98) + ((i98 & i96) << 1);
                            char[] cArr = {'(', 25, '\t', '#', 13917, 13917, '\r', Typography.quote, '(', '+', '\r', 21, '!', ' ', 29, ' ', 18, 30};
                            int i100 = -View.MeasureSpec.getMode(0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i101 = i100 * (-115);
                            int i102 = ((i101 | (-13225)) << 1) - (i101 ^ (-13225));
                            int i103 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i100;
                            int i104 = (((i102 - (~(-(-((~((i103 ^ 115) | (i103 & 115))) * (-116)))))) - 1) - (~(((i100 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i100 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 116))) - 1;
                            int i105 = ~i100;
                            int i106 = -(-(((~((i105 & (-116)) | (i105 ^ (-116)))) | (~(((-116) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-116) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)))) * 116));
                            byte b10 = (byte) (((i104 | i106) << 1) - (i106 ^ i104));
                            Object[] objArr29 = new Object[1];
                            c(i99, cArr, b10, objArr29);
                            Object objInvoke = cls8.getMethod((String) objArr29[0], null).invoke(context, null);
                            byte[] bArr6 = $$a;
                            byte b11 = (byte) (bArr6[0] - 1);
                            byte b12 = bArr6[28];
                            Object[] objArr30 = new Object[1];
                            d(b11, b12, b12, objArr30);
                            Class<?> cls9 = Class.forName((String) objArr30[0]);
                            byte b13 = bArr6[58];
                            byte b14 = bArr6[13];
                            Object[] objArr31 = new Object[1];
                            d(b13, b14, (byte) (b14 | 32), objArr31);
                            int iIndexOf = ((String) cls9.getField((String) objArr31[0]).get(objInvoke)).indexOf(str12);
                            if (iIndexOf > 0) {
                                byte b15 = (byte) (bArr6[0] - 1);
                                byte b16 = bArr6[28];
                                Object[] objArr32 = new Object[1];
                                d(b15, b16, b16, objArr32);
                                Class<?> cls10 = Class.forName((String) objArr32[0]);
                                byte b17 = bArr6[58];
                                byte b18 = bArr6[13];
                                Object[] objArr33 = new Object[1];
                                d(b17, b18, (byte) (b18 | 32), objArr33);
                                String str13 = (String) cls10.getField((String) objArr33[0]).get(objInvoke);
                                int length2 = str13.length() - 16;
                                if (length2 >= 0) {
                                    int i107 = 0;
                                    while (true) {
                                        if (i107 > length2) {
                                            i53 = i76;
                                            obj2 = objInvoke;
                                            i54 = i94;
                                            i60 = i86;
                                            i61 = 0;
                                            break;
                                        }
                                        String strSubstring = str13.substring(i107, (i107 & 16) + (i107 | 16));
                                        try {
                                            Object[] objArr34 = new Object[2];
                                            objArr34[c2] = 931995;
                                            objArr34[i77] = strSubstring;
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                                char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                                int offsetBefore = 3393 - TextUtils.getOffsetBefore("", i77);
                                                int threadPriority = 9 - ((Process.getThreadPriority(i77) + 20) >> 6);
                                                byte[] bArr7 = $$d;
                                                Object[] objArr35 = new Object[1];
                                                e((byte) (bArr7[7] - 1), (byte) (-bArr7[51]), bArr7[37], objArr35);
                                                String str14 = (String) objArr35[0];
                                                Class[] clsArr2 = {String.class, Integer.TYPE};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, offsetBefore, threadPriority, 1203525406, false, str14, clsArr2);
                                                r29 = str14;
                                                clsArr = clsArr2;
                                            } else {
                                                r29 = r29;
                                                clsArr = clsArr;
                                            }
                                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr34)).longValue();
                                            long j7 = 43760473;
                                            i60 = i86;
                                            r23 = i107;
                                            long j8 = 520;
                                            obj2 = objInvoke;
                                            i54 = i94;
                                            long j9 = -1;
                                            long j10 = j7 ^ j9;
                                            long j11 = jLongValue3 ^ j9;
                                            long jNextInt = new Random().nextInt(966227686);
                                            long j12 = jNextInt ^ j9;
                                            long j13 = (((long) (-519)) * j7) + (((long) 521) * jLongValue3) + (((((j10 | j11) | j12) ^ j9) | ((jLongValue3 | jNextInt) ^ j9)) * j8);
                                            long j14 = (jNextInt | j7) ^ j9;
                                            long j15 = j13 + (((long) (-1040)) * (((j11 | j12) ^ j9) | j14)) + (j8 * (j14 | ((j11 | j7) ^ j9) | ((j10 | j12) ^ j9))) + ((long) (-45830350));
                                            i53 = i50;
                                            int i108 = ((int) (j15 >> 32)) & (((~(1750281138 | i53)) * TypedValues.CycleType.TYPE_EASING) + 1437442710 + (((~(i54 | 1750281138)) | 1750280624) * TypedValues.CycleType.TYPE_EASING));
                                            int i109 = ((int) j15) & (617298657 + (((~((-137651717) | i53)) | (-1299574694)) * (-756)) + (((-137651717) | i54) * 756));
                                            if (((i108 & i109) | (i108 ^ i109)) == -725904754) {
                                                i61 = 1;
                                                break;
                                            }
                                            int i110 = ((r23 | (-90)) << 1) - (r23 ^ (-90));
                                            i107 = (i110 ^ 91) + ((i110 & 91) << 1);
                                            i76 = i53;
                                            i86 = i60;
                                            i94 = i54;
                                            objInvoke = obj2;
                                            str13 = str13;
                                            length2 = length2;
                                            c2 = 1;
                                            i77 = 0;
                                        } catch (Throwable th6) {
                                            Throwable cause3 = th6.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th6;
                                        }
                                    }
                                    i62 = (~(i53 & 20)) & (i53 | 20);
                                    int i111 = -i61;
                                    int i112 = ((i61 & i111) | (i61 ^ i111)) >> 31;
                                    int i113 = (~i112) & i53;
                                    int i114 = i112 & i62;
                                    i63 = (i114 & i113) | (i113 ^ i114);
                                    byte[] bArr8 = $$a;
                                    byte b19 = (byte) (bArr8[0] - 1);
                                    byte b20 = bArr8[28];
                                    Object[] objArr36 = new Object[1];
                                    d(b19, b20, b20, objArr36);
                                    Class<?> cls11 = Class.forName((String) objArr36[0]);
                                    byte b21 = bArr8[58];
                                    byte b22 = bArr8[13];
                                    Object[] objArr37 = new Object[1];
                                    d(b21, b22, (byte) (b22 | 32), objArr37);
                                    Field field = cls11.getField((String) objArr37[0]);
                                    obj3 = obj2;
                                    str9 = (String) field.get(obj3);
                                    int length3 = str9.length();
                                    i64 = (length3 ^ (-6)) + ((length3 & (-6)) << 1);
                                    if (i64 >= 0) {
                                        i65 = i63;
                                        i66 = i62;
                                        obj4 = obj3;
                                        i67 = iIndexOf;
                                        i68 = 0;
                                        r24 = r23;
                                        r210 = r29;
                                        break;
                                    }
                                    i72 = 0;
                                    while (true) {
                                        if (i72 <= i64) {
                                            str11 = str9;
                                            obj3 = obj3;
                                            r23 = r23;
                                            r29 = r29;
                                            i65 = i63;
                                            i66 = i62;
                                            obj4 = obj3;
                                            i67 = iIndexOf;
                                            i68 = 0;
                                            r24 = r23;
                                            r210 = r29;
                                            break;
                                        }
                                        str11 = str9;
                                        obj3 = obj3;
                                        r23 = r23;
                                        r29 = r29;
                                        Object[] objArr38 = {str11.substring(i72, (i72 & 6) + (i72 | 6)), 931995};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                            char cRed = (char) Color.red(0);
                                            int i115 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3392;
                                            int doubleTapTimeout2 = 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            byte[] bArr9 = $$d;
                                            Object[] objArr39 = new Object[1];
                                            e((byte) (bArr9[7] - 1), (byte) (-bArr9[51]), bArr9[37], objArr39);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cRed, i115, doubleTapTimeout2, 1203525406, false, (String) objArr39[0], new Class[]{String.class, Integer.TYPE});
                                        }
                                        long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr38)).longValue();
                                        long j16 = 536137310;
                                        i73 = i64;
                                        i67 = iIndexOf;
                                        obj5 = obj3;
                                        long j17 = -1;
                                        j6 = j16 ^ j17;
                                        i65 = i63;
                                        i66 = i62;
                                        long j18 = i53;
                                        long j19 = (((long) 236) * j16) + (((long) 471) * jLongValue4) + (((long) (-235)) * (jLongValue4 | ((j6 | (j18 ^ j17)) ^ j17))) + (((long) (-470)) * (jLongValue4 | ((j6 | j18) ^ j17))) + (((long) 235) * (((j18 | (j6 | jLongValue4)) ^ j17) | (((jLongValue4 ^ j17) | j16) ^ j17))) + ((long) (-538207187));
                                        int iNextInt = new Random().nextInt(2022844956);
                                        i74 = ((int) (j19 >> 32)) & ((-1267431344) + (((~((-1033591110) | iNextInt)) | 403635301) * (-366)) + (((~(iNextInt | (-630259969))) | 304160) * 366));
                                        int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                        i75 = ((int) j19) & ((((~((~iUptimeMillis) | 1878458235)) * 130) - 212190037) + (((~(iUptimeMillis | 1878458235)) | 18895121) * 130));
                                        if (((i74 & i75) | (i74 ^ i75)) == -2096167706) {
                                            i68 = 1;
                                            r24 = str11;
                                            obj4 = obj5;
                                            r210 = j6;
                                            break;
                                        }
                                        i72++;
                                        iIndexOf = i67;
                                        str11 = str11;
                                        i64 = i73;
                                        obj3 = obj5;
                                        i62 = i66;
                                        i63 = i65;
                                        r23 = str11;
                                        r29 = j6;
                                    }
                                    int i116 = -i68;
                                    int i117 = ((i68 & i116) | (i68 ^ i116)) >> 31;
                                    int i118 = (~i117) & i53;
                                    int i119 = i66 & i117;
                                    int i120 = (i119 & i118) | (i118 ^ i119);
                                    int i121 = i53 ^ i65;
                                    int i122 = -i121;
                                    int i123 = ((i121 & i122) | (i121 ^ i122)) >> 31;
                                    int i124 = i120 & (~i123);
                                    int i125 = i65 & i123;
                                    int i126 = (i124 & i125) | (i124 ^ i125);
                                    byte[] bArr10 = $$a;
                                    byte b23 = (byte) (bArr10[0] - 1);
                                    byte b24 = bArr10[28];
                                    Object[] objArr40 = new Object[1];
                                    d(b23, b24, b24, objArr40);
                                    Class<?> cls12 = Class.forName((String) objArr40[0]);
                                    byte b25 = bArr10[58];
                                    byte b26 = bArr10[13];
                                    Object[] objArr41 = new Object[1];
                                    d(b25, b26, (byte) (b26 | 32), objArr41);
                                    Field field2 = cls12.getField((String) objArr41[0]);
                                    Object obj6 = obj4;
                                    String str15 = (String) field2.get(obj6);
                                    int i127 = i67;
                                    int i128 = ~i127;
                                    int i129 = -i128;
                                    int i130 = i127 & (((i128 & i129) | (i128 ^ i129)) >> 31);
                                    i69 = 0;
                                    String strSubstring2 = str15.substring(0, i130);
                                    int i131 = -View.MeasureSpec.getSize(0);
                                    char mirror = AndroidCharacter.getMirror('0');
                                    Object[] objArr42 = new Object[1];
                                    c((i131 ^ 1) + ((i131 & 1) << 1), new char[]{13800}, (byte) ((mirror & 3) + (mirror | 3)), objArr42);
                                    String[] strArrSplit2 = strSubstring2.split((String) objArr42[0]);
                                    int length4 = strArrSplit2.length;
                                    i70 = 0;
                                    r2 = i126;
                                    r25 = strArrSplit2;
                                    r4 = obj6;
                                    r5 = length4;
                                    r25 = r24;
                                    r27 = obj4;
                                    r212 = r210;
                                    r211 = clsArr;
                                    while (i70 < r5) {
                                        r8 = r25[i70];
                                        int i132 = -TextUtils.lastIndexOf("", '0', i69);
                                        int i133 = i132 * 217;
                                        int i134 = (i133 & (-430)) + (i133 | (-430));
                                        int i135 = (~((i132 ^ i53) | (i132 & i53))) * 216;
                                        int i136 = (i134 ^ i135) + ((i135 & i134) << 1);
                                        int i137 = (i132 ^ (-3)) | (i132 & (-3));
                                        int i138 = (i136 - (~(-(-(((i137 & i54) | (i137 ^ i54)) * (-216)))))) - 1;
                                        int i139 = ~((i54 & i132) | (i54 ^ i132));
                                        int i140 = -(-KeyEvent.getDeadChar(0, 0));
                                        objArr22 = new Object[1];
                                        c((i138 - (~(-(-(((i139 & 2) | (i139 ^ 2)) * 216))))) - 1, new char[]{23, 0, 13864}, (byte) (((i140 | 97) << 1) - (i140 ^ 97)), objArr22);
                                        if (r8.split((String) objArr22[0]).length > 1) {
                                            synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.red(0), 2267 - Drawable.resolveOpacity(0, 0), (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 32))) {
                                                try {
                                                    try {
                                                        Object[] objArr43 = new Object[1];
                                                        a(null, null, 126 - (~(-TextUtils.getTrimmedLength(""))), new byte[]{-107, -118, -115, -127, -113, -120, -127, -110, -109, -119, -107, -122, -108, -109, -111, -110}, objArr43);
                                                        String str16 = (String) objArr43[0];
                                                        try {
                                                            try {
                                                                Runtime runtime = Runtime.getRuntime();
                                                                int i141 = -Color.blue(0);
                                                                int i142 = (i141 ^ 2) + ((i141 & 2) << 1);
                                                                char[] cArr2 = {Typography.dollar, 20};
                                                                int i143 = -KeyEvent.getDeadChar(0, 0);
                                                                Object[] objArr44 = new Object[1];
                                                                c(i142, cArr2, (byte) ((i143 ^ 75) + ((i143 & 75) << 1)), objArr44);
                                                                processExec = runtime.exec((String) objArr44[0], (String[]) null, (File) null);
                                                                try {
                                                                    Object[] objArr45 = {processExec.getInputStream()};
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2142 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 45 - Color.argb(0, 0, 0, 0), -1020714777, false, null, new Class[]{InputStream.class});
                                                                    }
                                                                    Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).newInstance(objArr45);
                                                                    try {
                                                                        Object[] objArr46 = {processExec.getErrorStream()};
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                                            try {
                                                                                try {
                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2143 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 45 - View.MeasureSpec.getMode(0), -1020714777, false, null, new Class[]{InputStream.class});
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                    boolean z7 = r2 == true ? 1 : 0;
                                                                                    Throwable th8 = th;
                                                                                    Throwable cause4 = th8.getCause();
                                                                                    if (cause4 != null) {
                                                                                        throw cause4;
                                                                                    }
                                                                                    throw th8;
                                                                                }
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                            }
                                                                        }
                                                                        Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).newInstance(objArr46);
                                                                        try {
                                                                            DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                            try {
                                                                                byte[] bArr11 = $$a;
                                                                                r27 = r5;
                                                                                try {
                                                                                    r212 = r4;
                                                                                    r211 = i70;
                                                                                    try {
                                                                                        Object[] objArr47 = new Object[1];
                                                                                        d(bArr11[54], bArr11[58], bArr11[34], objArr47);
                                                                                        Class<?> cls13 = Class.forName((String) objArr47[0]);
                                                                                        byte b27 = bArr11[13];
                                                                                        byte b28 = (byte) (-bArr11[35]);
                                                                                        byte b29 = (byte) (b28 | 48);
                                                                                        z6 = r2 == true ? 1 : 0;
                                                                                        try {
                                                                                            Object[] objArr48 = new Object[1];
                                                                                            d(b27, b28, b29, objArr48);
                                                                                            cls13.getMethod((String) objArr48[0], null).invoke(objNewInstance, null);
                                                                                            try {
                                                                                                Object[] objArr49 = new Object[1];
                                                                                                d(bArr11[54], bArr11[58], bArr11[34], objArr49);
                                                                                                Class<?> cls14 = Class.forName((String) objArr49[0]);
                                                                                                byte b30 = bArr11[13];
                                                                                                byte b31 = (byte) (-bArr11[35]);
                                                                                                Object[] objArr50 = new Object[1];
                                                                                                d(b30, b31, (byte) (b31 | 48), objArr50);
                                                                                                cls14.getMethod((String) objArr50[0], null).invoke(objNewInstance2, null);
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            StringBuilder sb3 = new StringBuilder();
                                                                                                            sb3.append(str16);
                                                                                                            int i144 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                                            Object[] objArr51 = new Object[1];
                                                                                                            c(0 - (~(-(-Color.alpha(0)))), new char[]{13799}, (byte) ((i144 & 88) + (i144 | 88)), objArr51);
                                                                                                            sb3.append((String) objArr51[0]);
                                                                                                            String string2 = sb3.toString();
                                                                                                            int i145 = -ImageFormat.getBitsPerPixel(0);
                                                                                                            Object[] objArr52 = new Object[1];
                                                                                                            c(5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{'.', '-', '\b', 5, 13756}, (byte) ((i145 & 25) + (i145 | 25)), objArr52);
                                                                                                            dataOutputStream.write(string2.getBytes((String) objArr52[0]));
                                                                                                            dataOutputStream.flush();
                                                                                                            int i146 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                                                            int i147 = i146 * (-209);
                                                                                                            int i148 = ((i147 | (-1045)) << 1) - (i147 ^ (-1045));
                                                                                                            int i149 = ~i146;
                                                                                                            int i150 = (i148 - (~((~((i149 & (-6)) | (i149 ^ (-6)))) * 210))) - 1;
                                                                                                            int i151 = ~(((-6) ^ i60) | ((-6) & i60));
                                                                                                            int i152 = ~i146;
                                                                                                            int i153 = ~(i152 | i53);
                                                                                                            int i154 = (i150 - (~(-(-(((i151 & i153) | (i151 ^ i153)) * 210))))) - 1;
                                                                                                            int i155 = i152 | i54;
                                                                                                            int i156 = ~((i155 & 5) | (i155 ^ 5));
                                                                                                            int i157 = i146 | (-6);
                                                                                                            int i158 = ~((i157 & i53) | (i157 ^ i53));
                                                                                                            int i159 = i156 ^ i158;
                                                                                                            int i160 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                                            int i161 = (i160 * (-963)) - 964;
                                                                                                            Object[] objArr53 = new Object[1];
                                                                                                            c(i154 + (((i158 & i156) | i159) * 210), new char[]{25, 5, 21, '\r', 13810}, (byte) ((((((i161 | 93605) << 1) - (i161 ^ 93605)) - (~(((~i160) | (~(((-98) & i53) | ((-98) ^ i53)))) * (-964)))) - 1) + (((~(i160 | (-98))) | (~(((-98) ^ i60) | ((-98) & i60)))) * (-964))), objArr53);
                                                                                                            String str17 = (String) objArr53[0];
                                                                                                            int iIndexOf2 = TextUtils.indexOf("", "");
                                                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                                                                            int i162 = (iIndexOf2 * 370) + 1850;
                                                                                                            int i163 = (iIndexOf2 ^ 5) | (iIndexOf2 & 5);
                                                                                                            int i164 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                                                            int i165 = ((i163 & i164) | (i163 ^ i164)) * (-369);
                                                                                                            int i166 = (i162 & i165) + (i162 | i165);
                                                                                                            int i167 = ~iIndexOf2;
                                                                                                            int i168 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | i167);
                                                                                                            int i169 = i166 + (((i168 ^ 5) | (i168 & 5)) * (-369));
                                                                                                            int i170 = (~(iIndexOf2 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) | (~(((-6) ^ iIndexOf2) | ((-6) & iIndexOf2)));
                                                                                                            int i171 = ~(i167 | i164 | 5);
                                                                                                            int i172 = ((i170 & i171) | (i170 ^ i171)) * 369;
                                                                                                            int i173 = -(Process.myPid() >> 22);
                                                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                                                                            int i174 = i173 * (-751);
                                                                                                            int i175 = (i174 & (-19526)) + (i174 | (-19526));
                                                                                                            int i176 = ~i173;
                                                                                                            int i177 = ~((i176 ^ (-27)) | (i176 & (-27)));
                                                                                                            int i178 = ~((i176 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i176 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                                                                            int i179 = (i175 - (~(-(-(((i177 ^ i178) | (i178 & i177)) * 1504))))) - 1;
                                                                                                            int i180 = ~i173;
                                                                                                            int i181 = (i180 & 26) | (i180 ^ 26);
                                                                                                            int i182 = -(-((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault5 | i181)) * (-1504)));
                                                                                                            int i183 = (i179 ^ i182) + ((i182 & i179) << 1);
                                                                                                            int i184 = ~i181;
                                                                                                            int i185 = ~((i173 & (-27)) | ((-27) ^ i173));
                                                                                                            int i186 = ((i185 & i184) | (i184 ^ i185)) * 752;
                                                                                                            Object[] objArr54 = new Object[1];
                                                                                                            c(((i169 | i172) << 1) - (i172 ^ i169), new char[]{'.', '-', '\b', 5, 13756}, (byte) ((i183 ^ i186) + ((i186 & i183) << 1)), objArr54);
                                                                                                            dataOutputStream.write(str17.getBytes((String) objArr54[0]));
                                                                                                            dataOutputStream.flush();
                                                                                                            try {
                                                                                                                long jNanoTime = System.nanoTime();
                                                                                                                long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                                r9 = r8;
                                                                                                                while (true) {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            processExec.exitValue();
                                                                                                                            r32 = r9;
                                                                                                                            break;
                                                                                                                        } catch (IllegalThreadStateException unused2) {
                                                                                                                            if (nanos > 0) {
                                                                                                                                ?? r6 = r9;
                                                                                                                                try {
                                                                                                                                    Object[] objArr55 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                                    byte[] bArr12 = $$a;
                                                                                                                                    r31 = r6;
                                                                                                                                    Object[] objArr56 = new Object[1];
                                                                                                                                    d(bArr12[54], bArr12[58], bArr12[34], objArr56);
                                                                                                                                    Class<?> cls15 = Class.forName((String) objArr56[0]);
                                                                                                                                    Object[] objArr57 = new Object[1];
                                                                                                                                    d(bArr12[13], (byte) (-bArr12[35]), (byte) 58, objArr57);
                                                                                                                                    cls15.getMethod((String) objArr57[0], Long.TYPE).invoke(null, objArr55);
                                                                                                                                } catch (Throwable th10) {
                                                                                                                                    Throwable cause5 = th10.getCause();
                                                                                                                                    if (cause5 != null) {
                                                                                                                                        throw cause5;
                                                                                                                                    }
                                                                                                                                    throw th10;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                r31 = r9;
                                                                                                                            }
                                                                                                                            nanos = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                                                            r32 = r31;
                                                                                                                            if (nanos <= 0) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            r9 = r31;
                                                                                                                        }
                                                                                                                    } catch (InterruptedException e2) {
                                                                                                                        throw e2;
                                                                                                                    } catch (Throwable th11) {
                                                                                                                        th5 = th11;
                                                                                                                        try {
                                                                                                                            processExec.destroy();
                                                                                                                            throw th5;
                                                                                                                        } catch (Exception unused3) {
                                                                                                                            throw th5;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    dataOutputStream.close();
                                                                                                                } catch (IOException unused4) {
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        byte[] bArr13 = $$a;
                                                                                                                        Object[] objArr58 = new Object[1];
                                                                                                                        d(bArr13[54], bArr13[58], bArr13[34], objArr58);
                                                                                                                        Class<?> cls16 = Class.forName((String) objArr58[0]);
                                                                                                                        byte b32 = (byte) 62;
                                                                                                                        Object[] objArr59 = new Object[1];
                                                                                                                        d(bArr13[28], bArr13[58], b32, objArr59);
                                                                                                                        cls16.getMethod((String) objArr59[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                                                        try {
                                                                                                                            Object[] objArr60 = new Object[1];
                                                                                                                            d(bArr13[54], bArr13[58], bArr13[34], objArr60);
                                                                                                                            Class<?> cls17 = Class.forName((String) objArr60[0]);
                                                                                                                            Object[] objArr61 = new Object[1];
                                                                                                                            d(bArr13[28], bArr13[58], b32, objArr61);
                                                                                                                            cls17.getMethod((String) objArr61[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                                                            try {
                                                                                                                                processExec.destroy();
                                                                                                                                while (true) {
                                                                                                                                    if (i71 < length) {
                                                                                                                                        str10 = strArrSplit[i71];
                                                                                                                                        int i187 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                                                                        int i188 = ~i187;
                                                                                                                                        int i189 = (((i187 * (-209)) - 3762) - (~(-(-((~((i188 & (-19)) | (i188 ^ (-19)))) * 210))))) - 1;
                                                                                                                                        int i190 = ~(((-19) ^ i54) | ((-19) & i54));
                                                                                                                                        int i191 = ~i187;
                                                                                                                                        int i192 = ~((i191 ^ i53) | (i191 & i53));
                                                                                                                                        int i193 = -(-(((i190 & i192) | (i190 ^ i192)) * 210));
                                                                                                                                        int i194 = (i187 & (-19)) | ((-19) ^ i187);
                                                                                                                                        int i195 = (((i189 ^ i193) + ((i189 & i193) << 1)) - (~(-(-(((~((i194 & i53) | (i194 ^ i53))) | (~(((i191 ^ i54) | (i191 & i54)) | 18))) * 210))))) - 1;
                                                                                                                                        try {
                                                                                                                                            int i196 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                                                                            byte b33 = (byte) ((i196 ^ 78) + ((i196 & 78) << 1));
                                                                                                                                            objArr23 = new Object[1];
                                                                                                                                            c(i195, new char[]{19, '-', '+', 29, '.', '(', 24, '\f', '\'', 29, 4, 3, '.', '\'', '\'', '.', 5, 27, 13826}, b33, objArr23);
                                                                                                                                            if (str10.startsWith((String) objArr23[0])) {
                                                                                                                                                r7 = r33;
                                                                                                                                            } else {
                                                                                                                                                int i197 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                                                                                                int i198 = (i197 * 141) - 35433;
                                                                                                                                                int i199 = -(-(((i53 ^ 127) | (i53 & 127)) * 140));
                                                                                                                                                int i200 = (i198 & i199) + (i198 | i199);
                                                                                                                                                int i201 = ~i197;
                                                                                                                                                int i202 = (i201 & 127) | (i201 ^ 127);
                                                                                                                                                int i203 = ~i202;
                                                                                                                                                int i204 = ~((i54 ^ 127) | (i54 & 127));
                                                                                                                                                int i205 = ((i203 & i204) | (i203 ^ i204)) * (-280);
                                                                                                                                                int i206 = (i200 & i205) + (i205 | i200);
                                                                                                                                                int i207 = ~(((-128) & i197) | ((-128) ^ i197));
                                                                                                                                                int i208 = ~((i60 & i197) | (i60 ^ i197));
                                                                                                                                                int i209 = (i208 & i207) | (i207 ^ i208);
                                                                                                                                                int i210 = ~((i202 & i53) | (i202 ^ i53));
                                                                                                                                                int i211 = ((i209 & i210) | (i209 ^ i210)) * 140;
                                                                                                                                                objArr24 = new Object[1];
                                                                                                                                                a(null, null, (i206 & i211) + (i211 | i206), new byte[]{-121, -125, -122, -123, -124, -125, -126, -127, -121, -111, -123, -120, -106, -118, -115, -127, -113, -120, -127, -110}, objArr24);
                                                                                                                                                if (str10.startsWith((String) objArr24[0])) {
                                                                                                                                                    r7 = r33;
                                                                                                                                                } else {
                                                                                                                                                    int i212 = -(-View.getDefaultSize(0, 0));
                                                                                                                                                    objArr25 = new Object[1];
                                                                                                                                                    a(null, null, ((i212 | 127) << 1) - (i212 ^ 127), new byte[]{-106, -118, -115, -127, -113, -120, -127, -110}, objArr25);
                                                                                                                                                    if (str10.startsWith((String) objArr25[0])) {
                                                                                                                                                        Object[] objArr62 = new Object[1];
                                                                                                                                                        a(null, null, 126 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), new byte[]{-106}, objArr62);
                                                                                                                                                        Split = str10.split((String) objArr62[0]);
                                                                                                                                                        if (Split.length > 1) {
                                                                                                                                                            r7 = r33;
                                                                                                                                                            if (Split[1].equalsIgnoreCase(r7)) {
                                                                                                                                                                boolean z8 = z6 ? 1 : 0;
                                                                                                                                                                int i213 = ((~(z8 ? 1 : 0)) & i53) | ((z8 ? 1 : 0) & i54);
                                                                                                                                                                int i214 = -i213;
                                                                                                                                                                int i215 = ((i213 & i214) | (i213 ^ i214)) >> 31;
                                                                                                                                                                int i216 = ((i53 & (-21)) | (i54 & 20)) & (~i215);
                                                                                                                                                                int i217 = i215 & (z8 ? 1 : 0);
                                                                                                                                                                r3 = (i216 & i217) | (i216 ^ i217);
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            r7 = r33;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        r7 = r33;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            int i218 = i71 - 38;
                                                                                                                                            i71 = ((i218 | 39) << 1) - (i218 ^ 39);
                                                                                                                                            r33 = r7;
                                                                                                                                            z6 = z6 ? 1 : 0;
                                                                                                                                        } catch (IOException unused5) {
                                                                                                                                            r8 = z6 ? 1 : 0;
                                                                                                                                            r3 = r8;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        r8 = z6;
                                                                                                                                        r25 = r25;
                                                                                                                                        r27 = r27;
                                                                                                                                        r212 = r212;
                                                                                                                                        r211 = r211;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (Exception unused6) {
                                                                                                                            }
                                                                                                                            StringBuilder sb4 = new StringBuilder();
                                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                                                                                                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                                                                                int bitsPerPixel = 2141 - ImageFormat.getBitsPerPixel(0);
                                                                                                                                int i219 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45;
                                                                                                                                byte[] bArr14 = $$d;
                                                                                                                                Object[] objArr63 = new Object[1];
                                                                                                                                e(bArr14[7], (byte) (-bArr14[15]), bArr14[37], objArr63);
                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength, bitsPerPixel, i219, 399405187, false, (String) objArr63[0], null);
                                                                                                                            }
                                                                                                                            sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(objNewInstance).toString());
                                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                                                                                                char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                                                                                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 2142;
                                                                                                                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45;
                                                                                                                                byte[] bArr15 = $$d;
                                                                                                                                Object[] objArr64 = new Object[1];
                                                                                                                                e(bArr15[7], (byte) (-bArr15[15]), bArr15[37], objArr64);
                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollBarFadeDuration2, iResolveOpacity2, maximumFlingVelocity, 399405187, false, (String) objArr64[0], null);
                                                                                                                            }
                                                                                                                            sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(objNewInstance2).toString());
                                                                                                                            String string3 = sb4.toString();
                                                                                                                            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                                                                                            Object[] objArr65 = new Object[1];
                                                                                                                            c(((keyRepeatTimeout | 1) << 1) - (keyRepeatTimeout ^ 1), new char[]{13799}, (byte) (87 - (~(-(-MotionEvent.axisFromString(""))))), objArr65);
                                                                                                                            strArrSplit = string3.split((String) objArr65[0]);
                                                                                                                            length = strArrSplit.length;
                                                                                                                            i71 = 0;
                                                                                                                            z6 = z6;
                                                                                                                            r33 = r32;
                                                                                                                        } catch (Throwable th12) {
                                                                                                                            Throwable cause6 = th12.getCause();
                                                                                                                            if (cause6 != null) {
                                                                                                                                throw cause6;
                                                                                                                            }
                                                                                                                            throw th12;
                                                                                                                        }
                                                                                                                    } catch (InterruptedException e3) {
                                                                                                                        e = e3;
                                                                                                                        throw e;
                                                                                                                    }
                                                                                                                } catch (Throwable th13) {
                                                                                                                    Throwable cause7 = th13.getCause();
                                                                                                                    if (cause7 != null) {
                                                                                                                        throw cause7;
                                                                                                                    }
                                                                                                                    throw th13;
                                                                                                                }
                                                                                                            } catch (InterruptedException e4) {
                                                                                                                e = e4;
                                                                                                            } catch (Throwable th14) {
                                                                                                                th = th14;
                                                                                                                th5 = th;
                                                                                                                processExec.destroy();
                                                                                                                throw th5;
                                                                                                            }
                                                                                                        } catch (Exception unused7) {
                                                                                                            int i220 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                                            int i221 = ((i220 | 28) << 1) - (i220 ^ 28);
                                                                                                            char[] cArr3 = {19, 5, Typography.quote, '\r', 23, '!', 21, '\t', 30, 25, ')', 15, '!', 5, '\f', 21, 26, ',', 24, 16, 18, Typography.quote, '(', 22, 13821, 13821, 13768};
                                                                                                            int iGreen = Color.green(0);
                                                                                                            byte b34 = (byte) (((iGreen | 20) << 1) - (iGreen ^ 20));
                                                                                                            Object[] objArr66 = new Object[1];
                                                                                                            c(i221, cArr3, b34, objArr66);
                                                                                                            throw new IOException((String) objArr66[0]);
                                                                                                        }
                                                                                                    } catch (IOException unused8) {
                                                                                                    }
                                                                                                } catch (Throwable th15) {
                                                                                                    th = th15;
                                                                                                }
                                                                                            } catch (Throwable th16) {
                                                                                                Throwable cause8 = th16.getCause();
                                                                                                if (cause8 != null) {
                                                                                                    throw cause8;
                                                                                                }
                                                                                                throw th16;
                                                                                            }
                                                                                        } catch (Throwable th17) {
                                                                                            th = th17;
                                                                                            th4 = th;
                                                                                            cause2 = th4.getCause();
                                                                                            if (cause2 != null) {
                                                                                                throw cause2;
                                                                                            }
                                                                                            throw th4;
                                                                                        }
                                                                                    } catch (Throwable th18) {
                                                                                        th = th18;
                                                                                        boolean z9 = r2 == true ? 1 : 0;
                                                                                    }
                                                                                } catch (Throwable th19) {
                                                                                    th = th19;
                                                                                    boolean z10 = r2 == true ? 1 : 0;
                                                                                    th4 = th;
                                                                                    cause2 = th4.getCause();
                                                                                    if (cause2 != null) {
                                                                                        throw cause2;
                                                                                    }
                                                                                    throw th4;
                                                                                }
                                                                            } catch (Throwable th20) {
                                                                                th = th20;
                                                                                boolean z11 = r2 == true ? 1 : 0;
                                                                            }
                                                                        } catch (IOException unused9) {
                                                                            r26 = r25;
                                                                            r212 = r4;
                                                                            r27 = r5;
                                                                            r211 = i70;
                                                                            r8 = r2;
                                                                            r25 = r26;
                                                                        } catch (Exception unused10) {
                                                                            boolean z12 = r2 == true ? 1 : 0;
                                                                            int i222 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                            int i223 = ((i222 | 28) << 1) - (i222 ^ 28);
                                                                            char[] cArr4 = {19, 5, Typography.quote, '\r', 23, '!', 21, '\t', 30, 25, ')', 15, '!', 5, '\f', 21, 26, ',', 24, 16, 18, Typography.quote, '(', 22, 13821, 13821, 13768};
                                                                            int iGreen2 = Color.green(0);
                                                                            byte b35 = (byte) (((iGreen2 | 20) << 1) - (iGreen2 ^ 20));
                                                                            Object[] objArr67 = new Object[1];
                                                                            c(i223, cArr4, b35, objArr67);
                                                                            throw new IOException((String) objArr67[0]);
                                                                        }
                                                                    } catch (Throwable th21) {
                                                                        th = th21;
                                                                        boolean z13 = r2 == true ? 1 : 0;
                                                                    }
                                                                } catch (Throwable th22) {
                                                                    boolean z14 = r2 == true ? 1 : 0;
                                                                    Throwable cause9 = th22.getCause();
                                                                    if (cause9 != null) {
                                                                        throw cause9;
                                                                    }
                                                                    throw th22;
                                                                }
                                                            } catch (Exception unused11) {
                                                                boolean z15 = r2 == true ? 1 : 0;
                                                            }
                                                        } catch (Exception unused12) {
                                                            int i224 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            int i225 = ((i224 | 28) << 1) - (i224 ^ 28);
                                                            char[] cArr5 = {19, 5, Typography.quote, '\r', 23, '!', 21, '\t', 30, 25, ')', 15, '!', 5, '\f', 21, 26, ',', 24, 16, 18, Typography.quote, '(', 22, 13821, 13821, 13768};
                                                            int iGreen3 = Color.green(0);
                                                            byte b36 = (byte) (((iGreen3 | 20) << 1) - (iGreen3 ^ 20));
                                                            Object[] objArr68 = new Object[1];
                                                            c(i225, cArr5, b36, objArr68);
                                                            throw new IOException((String) objArr68[0]);
                                                        }
                                                    } catch (IOException unused13) {
                                                        r26 = r25;
                                                    }
                                                } catch (IOException unused14) {
                                                }
                                            }
                                            i70 = (r211 == true ? 1 : 0) + 1;
                                            r25 = r25;
                                            r5 = r27;
                                            r4 = r212;
                                            i69 = 0;
                                            r2 = r3;
                                            r25 = r25;
                                            r27 = r27;
                                            r212 = r212;
                                            r211 = r211;
                                        } else {
                                            r8 = r2 == true ? 1 : 0;
                                            r25 = r25;
                                            r212 = r4;
                                            r27 = r5;
                                            r211 = i70;
                                        }
                                        r3 = r8;
                                        i70 = (r211 == true ? 1 : 0) + 1;
                                        r25 = r25;
                                        r5 = r27;
                                        r4 = r212;
                                        i69 = 0;
                                        r2 = r3;
                                        r25 = r25;
                                        r27 = r27;
                                        r212 = r212;
                                        r211 = r211;
                                    }
                                    boolean z16 = r2 == true ? 1 : 0;
                                    r28 = r4;
                                    r1 = r2;
                                } else {
                                    i53 = i76;
                                    obj2 = objInvoke;
                                    i54 = i94;
                                    i60 = i86;
                                    i61 = 0;
                                    i62 = (~(i53 & 20)) & (i53 | 20);
                                    int i1110 = -i61;
                                    int i1111 = ((i61 & i1110) | (i61 ^ i1110)) >> 31;
                                    int i1112 = (~i1111) & i53;
                                    int i1113 = i1111 & i62;
                                    i63 = (i1113 & i1112) | (i1112 ^ i1113);
                                    byte[] bArr16 = $$a;
                                    byte b110 = (byte) (bArr16[0] - 1);
                                    byte b210 = bArr16[28];
                                    Object[] objArr310 = new Object[1];
                                    d(b110, b210, b210, objArr310);
                                    Class<?> cls18 = Class.forName((String) objArr310[0]);
                                    byte b211 = bArr16[58];
                                    byte b212 = bArr16[13];
                                    Object[] objArr311 = new Object[1];
                                    d(b211, b212, (byte) (b212 | 32), objArr311);
                                    Field field3 = cls18.getField((String) objArr311[0]);
                                    obj3 = obj2;
                                    str9 = (String) field3.get(obj3);
                                    int length5 = str9.length();
                                    i64 = (length5 ^ (-6)) + ((length5 & (-6)) << 1);
                                    if (i64 >= 0) {
                                        i65 = i63;
                                        i66 = i62;
                                        obj4 = obj3;
                                        i67 = iIndexOf;
                                        i68 = 0;
                                        r24 = r23;
                                        r210 = r29;
                                        break;
                                    }
                                    i72 = 0;
                                    while (true) {
                                        if (i72 <= i64) {
                                            str11 = str9;
                                            obj3 = obj3;
                                            r23 = r23;
                                            r29 = r29;
                                            i65 = i63;
                                            i66 = i62;
                                            obj4 = obj3;
                                            i67 = iIndexOf;
                                            i68 = 0;
                                            r24 = r23;
                                            r210 = r29;
                                            break;
                                        }
                                        str11 = str9;
                                        obj3 = obj3;
                                        r23 = r23;
                                        r29 = r29;
                                        Object[] objArr312 = {str11.substring(i72, (i72 & 6) + (i72 | 6)), 931995};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                            char cRed2 = (char) Color.red(0);
                                            int i1114 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3392;
                                            int doubleTapTimeout3 = 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            byte[] bArr17 = $$d;
                                            Object[] objArr313 = new Object[1];
                                            e((byte) (bArr17[7] - 1), (byte) (-bArr17[51]), bArr17[37], objArr313);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cRed2, i1114, doubleTapTimeout3, 1203525406, false, (String) objArr313[0], new Class[]{String.class, Integer.TYPE});
                                        }
                                        long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr312)).longValue();
                                        long j110 = 536137310;
                                        i73 = i64;
                                        i67 = iIndexOf;
                                        obj5 = obj3;
                                        long j111 = -1;
                                        j6 = j110 ^ j111;
                                        i65 = i63;
                                        i66 = i62;
                                        long j112 = i53;
                                        long j113 = (((long) 236) * j110) + (((long) 471) * jLongValue5) + (((long) (-235)) * (jLongValue5 | ((j6 | (j112 ^ j111)) ^ j111))) + (((long) (-470)) * (jLongValue5 | ((j6 | j112) ^ j111))) + (((long) 235) * (((j112 | (j6 | jLongValue5)) ^ j111) | (((jLongValue5 ^ j111) | j110) ^ j111))) + ((long) (-538207187));
                                        int iNextInt2 = new Random().nextInt(2022844956);
                                        i74 = ((int) (j113 >> 32)) & ((-1267431344) + (((~((-1033591110) | iNextInt2)) | 403635301) * (-366)) + (((~(iNextInt2 | (-630259969))) | 304160) * 366));
                                        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                        i75 = ((int) j113) & ((((~((~iUptimeMillis2) | 1878458235)) * 130) - 212190037) + (((~(iUptimeMillis2 | 1878458235)) | 18895121) * 130));
                                        if (((i74 & i75) | (i74 ^ i75)) == -2096167706) {
                                            i68 = 1;
                                            r24 = str11;
                                            obj4 = obj5;
                                            r210 = j6;
                                            break;
                                        }
                                        i72++;
                                        iIndexOf = i67;
                                        str11 = str11;
                                        i64 = i73;
                                        obj3 = obj5;
                                        i62 = i66;
                                        i63 = i65;
                                        r23 = str11;
                                        r29 = j6;
                                    }
                                    int i1115 = -i68;
                                    int i1116 = ((i68 & i1115) | (i68 ^ i1115)) >> 31;
                                    int i1117 = (~i1116) & i53;
                                    int i1118 = i66 & i1116;
                                    int i1210 = (i1118 & i1117) | (i1117 ^ i1118);
                                    int i1211 = i53 ^ i65;
                                    int i1212 = -i1211;
                                    int i1213 = ((i1211 & i1212) | (i1211 ^ i1212)) >> 31;
                                    int i1214 = i1210 & (~i1213);
                                    int i1215 = i65 & i1213;
                                    int i1216 = (i1214 & i1215) | (i1214 ^ i1215);
                                    byte[] bArr18 = $$a;
                                    byte b213 = (byte) (bArr18[0] - 1);
                                    byte b214 = bArr18[28];
                                    Object[] objArr410 = new Object[1];
                                    d(b213, b214, b214, objArr410);
                                    Class<?> cls19 = Class.forName((String) objArr410[0]);
                                    byte b215 = bArr18[58];
                                    byte b216 = bArr18[13];
                                    Object[] objArr411 = new Object[1];
                                    d(b215, b216, (byte) (b216 | 32), objArr411);
                                    Field field4 = cls19.getField((String) objArr411[0]);
                                    Object obj7 = obj4;
                                    String str18 = (String) field4.get(obj7);
                                    int i1217 = i67;
                                    int i1218 = ~i1217;
                                    int i1219 = -i1218;
                                    int i1310 = i1217 & (((i1218 & i1219) | (i1218 ^ i1219)) >> 31);
                                    i69 = 0;
                                    String strSubstring3 = str18.substring(0, i1310);
                                    int i1311 = -View.MeasureSpec.getSize(0);
                                    char mirror2 = AndroidCharacter.getMirror('0');
                                    Object[] objArr412 = new Object[1];
                                    c((i1311 ^ 1) + ((i1311 & 1) << 1), new char[]{13800}, (byte) ((mirror2 & 3) + (mirror2 | 3)), objArr412);
                                    String[] strArrSplit3 = strSubstring3.split((String) objArr412[0]);
                                    int length6 = strArrSplit3.length;
                                    i70 = 0;
                                    r2 = i1216;
                                    r25 = strArrSplit3;
                                    r4 = obj7;
                                    r5 = length6;
                                    r25 = r24;
                                    r27 = obj4;
                                    r212 = r210;
                                    r211 = clsArr;
                                    while (i70 < r5) {
                                        r8 = r25[i70];
                                        int i1312 = -TextUtils.lastIndexOf("", '0', i69);
                                        int i1313 = i1312 * 217;
                                        int i1314 = (i1313 & (-430)) + (i1313 | (-430));
                                        int i1315 = (~((i1312 ^ i53) | (i1312 & i53))) * 216;
                                        int i1316 = (i1314 ^ i1315) + ((i1315 & i1314) << 1);
                                        int i1317 = (i1312 ^ (-3)) | (i1312 & (-3));
                                        int i1318 = (i1316 - (~(-(-(((i1317 & i54) | (i1317 ^ i54)) * (-216)))))) - 1;
                                        int i1319 = ~((i54 & i1312) | (i54 ^ i1312));
                                        int i1410 = -(-KeyEvent.getDeadChar(0, 0));
                                        objArr22 = new Object[1];
                                        c((i1318 - (~(-(-(((i1319 & 2) | (i1319 ^ 2)) * 216))))) - 1, new char[]{23, 0, 13864}, (byte) (((i1410 | 97) << 1) - (i1410 ^ 97)), objArr22);
                                        if (r8.split((String) objArr22[0]).length > 1) {
                                            synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.red(0), 2267 - Drawable.resolveOpacity(0, 0), (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 32))) {
                                                Object[] objArr413 = new Object[1];
                                                a(null, null, 126 - (~(-TextUtils.getTrimmedLength(""))), new byte[]{-107, -118, -115, -127, -113, -120, -127, -110, -109, -119, -107, -122, -108, -109, -111, -110}, objArr413);
                                                String str19 = (String) objArr413[0];
                                                Runtime runtime2 = Runtime.getRuntime();
                                                int i1411 = -Color.blue(0);
                                                int i1412 = (i1411 ^ 2) + ((i1411 & 2) << 1);
                                                char[] cArr6 = {Typography.dollar, 20};
                                                int i1413 = -KeyEvent.getDeadChar(0, 0);
                                                Object[] objArr414 = new Object[1];
                                                c(i1412, cArr6, (byte) ((i1413 ^ 75) + ((i1413 & 75) << 1)), objArr414);
                                                processExec = runtime2.exec((String) objArr414[0], (String[]) null, (File) null);
                                                Object[] objArr415 = {processExec.getInputStream()};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2142 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 45 - Color.argb(0, 0, 0, 0), -1020714777, false, null, new Class[]{InputStream.class});
                                                }
                                                Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).newInstance(objArr415);
                                                Object[] objArr416 = {processExec.getErrorStream()};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2143 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 45 - View.MeasureSpec.getMode(0), -1020714777, false, null, new Class[]{InputStream.class});
                                                }
                                                Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).newInstance(objArr416);
                                                DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                                byte[] bArr19 = $$a;
                                                r27 = r5;
                                                r212 = r4;
                                                r211 = i70;
                                                Object[] objArr417 = new Object[1];
                                                d(bArr19[54], bArr19[58], bArr19[34], objArr417);
                                                Class<?> cls110 = Class.forName((String) objArr417[0]);
                                                byte b217 = bArr19[13];
                                                byte b218 = (byte) (-bArr19[35]);
                                                byte b219 = (byte) (b218 | 48);
                                                z6 = r2 == true ? 1 : 0;
                                                Object[] objArr418 = new Object[1];
                                                d(b217, b218, b219, objArr418);
                                                cls110.getMethod((String) objArr418[0], null).invoke(objNewInstance3, null);
                                                Object[] objArr419 = new Object[1];
                                                d(bArr19[54], bArr19[58], bArr19[34], objArr419);
                                                Class<?> cls111 = Class.forName((String) objArr419[0]);
                                                byte b37 = bArr19[13];
                                                byte b38 = (byte) (-bArr19[35]);
                                                Object[] objArr510 = new Object[1];
                                                d(b37, b38, (byte) (b38 | 48), objArr510);
                                                cls111.getMethod((String) objArr510[0], null).invoke(objNewInstance4, null);
                                                StringBuilder sb5 = new StringBuilder();
                                                sb5.append(str19);
                                                int i1414 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                Object[] objArr511 = new Object[1];
                                                c(0 - (~(-(-Color.alpha(0)))), new char[]{13799}, (byte) ((i1414 & 88) + (i1414 | 88)), objArr511);
                                                sb5.append((String) objArr511[0]);
                                                String string4 = sb5.toString();
                                                int i1415 = -ImageFormat.getBitsPerPixel(0);
                                                Object[] objArr512 = new Object[1];
                                                c(5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{'.', '-', '\b', 5, 13756}, (byte) ((i1415 & 25) + (i1415 | 25)), objArr512);
                                                dataOutputStream2.write(string4.getBytes((String) objArr512[0]));
                                                dataOutputStream2.flush();
                                                int i1416 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                int i1417 = i1416 * (-209);
                                                int i1418 = ((i1417 | (-1045)) << 1) - (i1417 ^ (-1045));
                                                int i1419 = ~i1416;
                                                int i1510 = (i1418 - (~((~((i1419 & (-6)) | (i1419 ^ (-6)))) * 210))) - 1;
                                                int i1511 = ~(((-6) ^ i60) | ((-6) & i60));
                                                int i1512 = ~i1416;
                                                int i1513 = ~(i1512 | i53);
                                                int i1514 = (i1510 - (~(-(-(((i1511 & i1513) | (i1511 ^ i1513)) * 210))))) - 1;
                                                int i1515 = i1512 | i54;
                                                int i1516 = ~((i1515 & 5) | (i1515 ^ 5));
                                                int i1517 = i1416 | (-6);
                                                int i1518 = ~((i1517 & i53) | (i1517 ^ i53));
                                                int i1519 = i1516 ^ i1518;
                                                int i1610 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                int i1611 = (i1610 * (-963)) - 964;
                                                Object[] objArr513 = new Object[1];
                                                c(i1514 + (((i1518 & i1516) | i1519) * 210), new char[]{25, 5, 21, '\r', 13810}, (byte) ((((((i1611 | 93605) << 1) - (i1611 ^ 93605)) - (~(((~i1610) | (~(((-98) & i53) | ((-98) ^ i53)))) * (-964)))) - 1) + (((~(i1610 | (-98))) | (~(((-98) ^ i60) | ((-98) & i60)))) * (-964))), objArr513);
                                                String str110 = (String) objArr513[0];
                                                int iIndexOf3 = TextUtils.indexOf("", "");
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                int i1612 = (iIndexOf3 * 370) + 1850;
                                                int i1613 = (iIndexOf3 ^ 5) | (iIndexOf3 & 5);
                                                int i1614 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                int i1615 = ((i1613 & i1614) | (i1613 ^ i1614)) * (-369);
                                                int i1616 = (i1612 & i1615) + (i1612 | i1615);
                                                int i1617 = ~iIndexOf3;
                                                int i1618 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | i1617);
                                                int i1619 = i1616 + (((i1618 ^ 5) | (i1618 & 5)) * (-369));
                                                int i1710 = (~(iIndexOf3 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6)) | (~(((-6) ^ iIndexOf3) | ((-6) & iIndexOf3)));
                                                int i1711 = ~(i1617 | i1614 | 5);
                                                int i1712 = ((i1710 & i1711) | (i1710 ^ i1711)) * 369;
                                                int i1713 = -(Process.myPid() >> 22);
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                int i1714 = i1713 * (-751);
                                                int i1715 = (i1714 & (-19526)) + (i1714 | (-19526));
                                                int i1716 = ~i1713;
                                                int i1717 = ~((i1716 ^ (-27)) | (i1716 & (-27)));
                                                int i1718 = ~((i1716 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i1716 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                int i1719 = (i1715 - (~(-(-(((i1717 ^ i1718) | (i1718 & i1717)) * 1504))))) - 1;
                                                int i1810 = ~i1713;
                                                int i1811 = (i1810 & 26) | (i1810 ^ 26);
                                                int i1812 = -(-((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault7 | i1811)) * (-1504)));
                                                int i1813 = (i1719 ^ i1812) + ((i1812 & i1719) << 1);
                                                int i1814 = ~i1811;
                                                int i1815 = ~((i1713 & (-27)) | ((-27) ^ i1713));
                                                int i1816 = ((i1815 & i1814) | (i1814 ^ i1815)) * 752;
                                                Object[] objArr514 = new Object[1];
                                                c(((i1619 | i1712) << 1) - (i1712 ^ i1619), new char[]{'.', '-', '\b', 5, 13756}, (byte) ((i1813 ^ i1816) + ((i1816 & i1813) << 1)), objArr514);
                                                dataOutputStream2.write(str110.getBytes((String) objArr514[0]));
                                                dataOutputStream2.flush();
                                                long jNanoTime2 = System.nanoTime();
                                                long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                r9 = r8;
                                                while (true) {
                                                    processExec.exitValue();
                                                    r32 = r9;
                                                    break;
                                                }
                                                dataOutputStream2.close();
                                                byte[] bArr110 = $$a;
                                                Object[] objArr515 = new Object[1];
                                                d(bArr110[54], bArr110[58], bArr110[34], objArr515);
                                                Class<?> cls112 = Class.forName((String) objArr515[0]);
                                                byte b39 = (byte) 62;
                                                Object[] objArr516 = new Object[1];
                                                d(bArr110[28], bArr110[58], b39, objArr516);
                                                cls112.getMethod((String) objArr516[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                                Object[] objArr69 = new Object[1];
                                                d(bArr110[54], bArr110[58], bArr110[34], objArr69);
                                                Class<?> cls113 = Class.forName((String) objArr69[0]);
                                                Object[] objArr610 = new Object[1];
                                                d(bArr110[28], bArr110[58], b39, objArr610);
                                                cls113.getMethod((String) objArr610[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                                processExec.destroy();
                                                StringBuilder sb6 = new StringBuilder();
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                    char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    int bitsPerPixel2 = 2141 - ImageFormat.getBitsPerPixel(0);
                                                    int i2110 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45;
                                                    byte[] bArr111 = $$d;
                                                    Object[] objArr611 = new Object[1];
                                                    e(bArr111[7], (byte) (-bArr111[15]), bArr111[37], objArr611);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength2, bitsPerPixel2, i2110, 399405187, false, (String) objArr611[0], null);
                                                }
                                                sb6.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(objNewInstance3).toString());
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                    char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 2142;
                                                    int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45;
                                                    byte[] bArr112 = $$d;
                                                    Object[] objArr612 = new Object[1];
                                                    e(bArr112[7], (byte) (-bArr112[15]), bArr112[37], objArr612);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollBarFadeDuration3, iResolveOpacity3, maximumFlingVelocity2, 399405187, false, (String) objArr612[0], null);
                                                }
                                                sb6.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(objNewInstance4).toString());
                                                String string5 = sb6.toString();
                                                int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                Object[] objArr613 = new Object[1];
                                                c(((keyRepeatTimeout2 | 1) << 1) - (keyRepeatTimeout2 ^ 1), new char[]{13799}, (byte) (87 - (~(-(-MotionEvent.axisFromString(""))))), objArr613);
                                                strArrSplit = string5.split((String) objArr613[0]);
                                                length = strArrSplit.length;
                                                i71 = 0;
                                                z6 = z6;
                                                r33 = r32;
                                                while (true) {
                                                    if (i71 < length) {
                                                        str10 = strArrSplit[i71];
                                                        int i1817 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                        int i1818 = ~i1817;
                                                        int i1819 = (((i1817 * (-209)) - 3762) - (~(-(-((~((i1818 & (-19)) | (i1818 ^ (-19)))) * 210))))) - 1;
                                                        int i1910 = ~(((-19) ^ i54) | ((-19) & i54));
                                                        int i1911 = ~i1817;
                                                        int i1912 = ~((i1911 ^ i53) | (i1911 & i53));
                                                        int i1913 = -(-(((i1910 & i1912) | (i1910 ^ i1912)) * 210));
                                                        int i1914 = (i1817 & (-19)) | ((-19) ^ i1817);
                                                        int i1915 = (((i1819 ^ i1913) + ((i1819 & i1913) << 1)) - (~(-(-(((~((i1914 & i53) | (i1914 ^ i53))) | (~(((i1911 ^ i54) | (i1911 & i54)) | 18))) * 210))))) - 1;
                                                        int i1916 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        byte b310 = (byte) ((i1916 ^ 78) + ((i1916 & 78) << 1));
                                                        objArr23 = new Object[1];
                                                        c(i1915, new char[]{19, '-', '+', 29, '.', '(', 24, '\f', '\'', 29, 4, 3, '.', '\'', '\'', '.', 5, 27, 13826}, b310, objArr23);
                                                        if (str10.startsWith((String) objArr23[0])) {
                                                            int i1917 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            int i1918 = (i1917 * 141) - 35433;
                                                            int i1919 = -(-(((i53 ^ 127) | (i53 & 127)) * 140));
                                                            int i2010 = (i1918 & i1919) + (i1918 | i1919);
                                                            int i2011 = ~i1917;
                                                            int i2012 = (i2011 & 127) | (i2011 ^ 127);
                                                            int i2013 = ~i2012;
                                                            int i2014 = ~((i54 ^ 127) | (i54 & 127));
                                                            int i2015 = ((i2013 & i2014) | (i2013 ^ i2014)) * (-280);
                                                            int i2016 = (i2010 & i2015) + (i2015 | i2010);
                                                            int i2017 = ~(((-128) & i1917) | ((-128) ^ i1917));
                                                            int i2018 = ~((i60 & i1917) | (i60 ^ i1917));
                                                            int i2019 = (i2018 & i2017) | (i2017 ^ i2018);
                                                            int i2111 = ~((i2012 & i53) | (i2012 ^ i53));
                                                            int i2112 = ((i2019 & i2111) | (i2019 ^ i2111)) * 140;
                                                            objArr24 = new Object[1];
                                                            a(null, null, (i2016 & i2112) + (i2112 | i2016), new byte[]{-121, -125, -122, -123, -124, -125, -126, -127, -121, -111, -123, -120, -106, -118, -115, -127, -113, -120, -127, -110}, objArr24);
                                                            if (str10.startsWith((String) objArr24[0])) {
                                                                int i2113 = -(-View.getDefaultSize(0, 0));
                                                                objArr25 = new Object[1];
                                                                a(null, null, ((i2113 | 127) << 1) - (i2113 ^ 127), new byte[]{-106, -118, -115, -127, -113, -120, -127, -110}, objArr25);
                                                                if (str10.startsWith((String) objArr25[0])) {
                                                                    Object[] objArr614 = new Object[1];
                                                                    a(null, null, 126 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), new byte[]{-106}, objArr614);
                                                                    Split = str10.split((String) objArr614[0]);
                                                                    if (Split.length > 1) {
                                                                        r7 = r33;
                                                                        if (Split[1].equalsIgnoreCase(r7)) {
                                                                            boolean z17 = z6 ? 1 : 0;
                                                                            int i2114 = ((~(z17 ? 1 : 0)) & i53) | ((z17 ? 1 : 0) & i54);
                                                                            int i2115 = -i2114;
                                                                            int i2116 = ((i2114 & i2115) | (i2114 ^ i2115)) >> 31;
                                                                            int i2117 = ((i53 & (-21)) | (i54 & 20)) & (~i2116);
                                                                            int i2118 = i2116 & (z17 ? 1 : 0);
                                                                            r3 = (i2117 & i2118) | (i2117 ^ i2118);
                                                                        }
                                                                    } else {
                                                                        r7 = r33;
                                                                    }
                                                                } else {
                                                                    r7 = r33;
                                                                }
                                                            } else {
                                                                r7 = r33;
                                                            }
                                                        } else {
                                                            r7 = r33;
                                                        }
                                                        int i2119 = i71 - 38;
                                                        i71 = ((i2119 | 39) << 1) - (i2119 ^ 39);
                                                        r33 = r7;
                                                        z6 = z6 ? 1 : 0;
                                                    } else {
                                                        r8 = z6;
                                                        r25 = r25;
                                                        r27 = r27;
                                                        r212 = r212;
                                                        r211 = r211;
                                                    }
                                                    i70 = (r211 == true ? 1 : 0) + 1;
                                                    r25 = r25;
                                                    r5 = r27;
                                                    r4 = r212;
                                                    i69 = 0;
                                                    r2 = r3;
                                                    r25 = r25;
                                                    r27 = r27;
                                                    r212 = r212;
                                                    r211 = r211;
                                                }
                                            }
                                        } else {
                                            r8 = r2 == true ? 1 : 0;
                                            r25 = r25;
                                            r212 = r4;
                                            r27 = r5;
                                            r211 = i70;
                                        }
                                        r3 = r8;
                                        i70 = (r211 == true ? 1 : 0) + 1;
                                        r25 = r25;
                                        r5 = r27;
                                        r4 = r212;
                                        i69 = 0;
                                        r2 = r3;
                                        r25 = r25;
                                        r27 = r27;
                                        r212 = r212;
                                        r211 = r211;
                                    }
                                    boolean z18 = r2 == true ? 1 : 0;
                                    r28 = r4;
                                    r1 = r2;
                                }
                            } else {
                                i53 = i76;
                                r28 = objInvoke;
                                i54 = i94;
                                r1 = i53;
                            }
                            byte[] bArr20 = $$a;
                            byte b40 = (byte) (bArr20[0] - 1);
                            byte b41 = bArr20[28];
                            Object[] objArr70 = new Object[1];
                            d(b40, b41, b41, objArr70);
                            Class<?> cls20 = Class.forName((String) objArr70[0]);
                            byte b42 = bArr20[58];
                            byte b43 = bArr20[13];
                            Object[] objArr71 = new Object[1];
                            d(b42, b43, (byte) (b43 | 32), objArr71);
                            ?? r10 = {cls20.getField((String) objArr71[0]).get(r28)};
                            ?? r11 = new Object[]{new int[1], r10}[0];
                            ((int[]) r11)[0] = r1;
                            i55 = ((int[]) r11)[0];
                            String[] strArr5 = (String[]) r10;
                            if ((i51 & 1) == 0) {
                                int i226 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int i227 = (i226 * 755) - 96384;
                                int i228 = ~i226;
                                int i229 = ~((i228 & 128) | (i228 ^ 128));
                                int i230 = ~i226;
                                int i231 = ~((i230 ^ i53) | (i230 & i53));
                                int i232 = (i229 & i231) | (i229 ^ i231);
                                int i233 = ~((i53 ^ 128) | (i53 & 128));
                                int i234 = -(-(((i232 & i233) | (i232 ^ i233)) * (-754)));
                                int i235 = ((i227 | i234) << 1) - (i227 ^ i234);
                                int i236 = (i230 ^ 128) | (i230 & 128);
                                int i237 = ~((i236 & i53) | (i236 ^ i53));
                                int i238 = (i54 & i226) | (i54 ^ i226);
                                int i239 = ~((i238 & 128) | (i238 ^ 128));
                                int i240 = i235 + (((i239 & i237) | (i237 ^ i239)) * (-754));
                                int i241 = -(-(((i230 ^ i54) | (i230 & i54)) * 754));
                                Object[] objArr72 = new Object[1];
                                a(null, null, (i240 & i241) + (i241 | i240), new byte[]{-103, -120, -122, -108, -123, -110, -104, -118, -120, -122, -105, -118, -125}, objArr72);
                                try {
                                    Object[] objArr73 = {(String) objArr72[0]};
                                    Object[] objArr74 = new Object[1];
                                    a(null, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr74);
                                    Class<?> cls21 = Class.forName((String) objArr74[0]);
                                    int i242 = -(-TextUtils.lastIndexOf("", '0'));
                                    Object[] objArr75 = new Object[1];
                                    a(null, null, (i242 & 128) + (i242 | 128), new byte[]{-118, -120, -122, -105, -124, -118, -102, -111, -118, -119, -107, -103, -102, -119, -118, -115}, objArr75);
                                    Object objInvoke2 = cls21.getMethod((String) objArr75[0], String.class).invoke(context, objArr73);
                                    if (objInvoke2 == null) {
                                        i58 = i55;
                                        strArr5 = strArr5;
                                        i56 = i53;
                                        i59 = i56;
                                        break;
                                    }
                                    int i243 = -Gravity.getAbsoluteGravity(0, 0);
                                    Object[] objArr76 = new Object[1];
                                    a(null, null, (i243 & 127) + (i243 | 127), new byte[]{-124, -118, -115, -127, -126, -127, -100, -103, -120, -122, -108, -123, -114, -118, -120, -122, -105, -118, -101, -121, -126, -122, -111, -125, -127, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr76);
                                    Class<?> cls22 = Class.forName((String) objArr76[0]);
                                    int i244 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i245 = ((i244 | 15) << 1) - (i244 ^ 15);
                                    char[] cArr7 = {'(', 25, '\t', '#', '#', '\b', 25, '\r', 23, '(', 31, 2, 24, Typography.quote, 13864};
                                    int i246 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i247 = i246 * 471;
                                    int i248 = (i247 ^ 29673) + ((i247 & 29673) << 1) + (((i246 ^ 63) | (i246 & 63)) * (-470));
                                    int i249 = ~i246;
                                    int i250 = ~((i249 & (-64)) | (i249 ^ (-64)));
                                    int i251 = ~(((-64) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | ((-64) & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                    int i252 = (i250 & i251) | (i250 ^ i251);
                                    int i253 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                    int i254 = (i253 & i246) | (i253 ^ i246);
                                    int i255 = (i252 | (~((i254 ^ 63) | (i254 & 63)))) * (-470);
                                    int i256 = (i248 & i255) + (i255 | i248);
                                    int i257 = ~(i246 | (-64) | iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                                    int i258 = ~(i254 | 63);
                                    int i259 = ((i257 & i258) | (i257 ^ i258)) * 470;
                                    Object[] objArr77 = new Object[1];
                                    c(i245, cArr7, (byte) ((i256 & i259) + (i259 | i256)), objArr77);
                                    List list = (List) cls22.getMethod((String) objArr77[0], null).invoke(objInvoke2, null);
                                    if (list == null) {
                                        i58 = i55;
                                        strArr5 = strArr5;
                                        i56 = i53;
                                        i59 = i56;
                                        break;
                                    }
                                    Iterator it2 = list.iterator();
                                    loop5: while (true) {
                                        if (!it2.hasNext()) {
                                            i58 = i55;
                                            strArr5 = strArr5;
                                            i56 = i53;
                                            i59 = i56;
                                            break;
                                        }
                                        Object next2 = it2.next();
                                        int i260 = 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        char[] cArr8 = {'-', '!', Typography.quote, 16, Typography.quote, 25, '%', '\t', '\'', 29, 28, '\n', 24, '!', '\t', 0, 4, 28, '\n', 24, '!', ' ', 24, '!', '\b', '\t', '-', 5, 13901};
                                        int i261 = -KeyEvent.normalizeMetaState(0);
                                        Object[] objArr78 = new Object[1];
                                        c(i260, cArr8, (byte) (((i261 | 78) << 1) - (i261 ^ 78)), objArr78);
                                        Class<?> cls23 = Class.forName((String) objArr78[0]);
                                        int iArgb3 = Color.argb(0, 0, 0, 0);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i262 = iArgb3 * 141;
                                        int i263 = (i262 ^ (-35433)) + ((i262 & (-35433)) << 1);
                                        int i264 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 ^ 127) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & 127)) * 140;
                                        int i265 = (i263 & i264) + (i264 | i263);
                                        int i266 = ~iArgb3;
                                        int i267 = (i266 & 127) | (i266 ^ 127);
                                        int i268 = ~i267;
                                        int i269 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                        int i270 = ~((i269 & 127) | (i269 ^ 127));
                                        int i271 = ((i268 & i270) | (i268 ^ i270)) * (-280);
                                        int i272 = ((i265 | i271) << 1) - (i265 ^ i271);
                                        int i273 = ~(((-128) ^ iArgb3) | ((-128) & iArgb3));
                                        int i274 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                        int i275 = ~((iArgb3 & i274) | (i274 ^ iArgb3));
                                        int i276 = (i275 & i273) | (i273 ^ i275);
                                        int i277 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & i267) | (i267 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                        int i278 = -(-(((i277 & i276) | (i276 ^ i277)) * 140));
                                        Object[] objArr79 = new Object[1];
                                        a(null, null, (i272 & i278) + (i278 | i272), new byte[]{-118, -111, -127, -112, -118, -115, -127, -113, -120, -127, -114, -119, -118, -115}, objArr79);
                                        String str20 = (String) cls23.getMethod((String) objArr79[0], null).invoke(next2, null);
                                        int offsetAfter = TextUtils.getOffsetAfter("", 0);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i279 = offsetAfter * 46;
                                        int i280 = (i279 ^ 5842) + ((i279 & 5842) << 1);
                                        int i281 = ~((-128) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                        int i282 = (i280 - (~(((i281 & offsetAfter) | (offsetAfter ^ i281)) * (-90)))) - 1;
                                        int i283 = ~(((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                        int i284 = ~(offsetAfter | 127);
                                        int i285 = -(-(((i283 & i284) | (i283 ^ i284)) * (-45)));
                                        int i286 = (i282 & i285) + (i285 | i282);
                                        int i287 = ~offsetAfter;
                                        int i288 = ~((i287 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i287 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                        int i289 = (i288 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i288);
                                        int i290 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                        int i291 = ((~((offsetAfter & i290) | (i290 ^ offsetAfter))) | i289) * 45;
                                        Object[] objArr80 = new Object[1];
                                        a(null, null, (i286 & i291) + (i291 | i286), new byte[]{-124, -118, -115, -127, -126, -127, -100, -103, -120, -122, -108, -123, -114, -118, -120, -122, -105, -118, -101, -121, -126, -122, -111, -125, -127, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr80);
                                        Class<?> cls24 = Class.forName((String) objArr80[0]);
                                        Object[] objArr81 = new Object[1];
                                        c(Color.rgb(0, 0, 0) + 16777233, new char[]{Typography.quote, '0', ')', 17, 30, 18, Typography.quote, '\r', '!', '/', 17, 28, 27, 19, Typography.amp, 16, 13899}, (byte) (16777312 - (~Color.rgb(0, 0, 0))), objArr81);
                                        if (((Boolean) cls24.getMethod((String) objArr81[0], String.class).invoke(objInvoke2, str20)).booleanValue()) {
                                            int length7 = str20.length();
                                            int i292 = ((length7 | (-20)) << 1) - (length7 ^ (-20));
                                            if (i292 >= 0) {
                                                int i293 = 0;
                                                while (i293 <= i292) {
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                    int i294 = (i293 ^ 20) | (i293 & 20);
                                                    int i295 = ((10060 + (i293 * TypedValues.PositionType.TYPE_PERCENT_WIDTH)) - (~(-(-(i294 * (-502)))))) - 1;
                                                    int i296 = ~((~i293) | (-21));
                                                    int i297 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                    int i298 = i295 + ((i296 | (~(((-21) & i297) | ((-21) ^ i297))) | (~(i294 | iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) * (-502));
                                                    int i299 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                    int i300 = (i299 & (-21)) | ((-21) ^ i299);
                                                    Object[] objArr82 = {str20.substring(i293, (i298 - (~(((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & i294) | (i294 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) | (~((i300 & i293) | (i300 ^ i293)))) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1), 931995};
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                                        char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                                        int packedPositionType = 3393 - ExpandableListView.getPackedPositionType(0L);
                                                        int size = View.MeasureSpec.getSize(0) + 9;
                                                        byte[] bArr21 = $$d;
                                                        Object[] objArr83 = new Object[1];
                                                        e((byte) (bArr21[7] - 1), (byte) (-bArr21[51]), bArr21[37], objArr83);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollBarSize3, packedPositionType, size, 1203525406, false, (String) objArr83[0], new Class[]{String.class, Integer.TYPE});
                                                    }
                                                    long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr82)).longValue();
                                                    long j20 = 826392368;
                                                    Object obj8 = objInvoke2;
                                                    Iterator it3 = it2;
                                                    long j21 = (((long) 450) * j20) + (((long) (-448)) * jLongValue6);
                                                    long j22 = 449;
                                                    String str21 = str20;
                                                    int i301 = i293;
                                                    long j23 = -1;
                                                    long j24 = ((j20 ^ j23) | jLongValue6) ^ j23;
                                                    long j25 = jLongValue6 ^ j23;
                                                    i58 = i55;
                                                    long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                                    int i302 = i292;
                                                    long j26 = j21 + ((j24 | (((j25 | j20) | jMaxMemory) ^ j23)) * j22) + (((long) (-1347)) * j24) + (j22 * (j24 | ((((jMaxMemory ^ j23) | j25) | j20) ^ j23))) + ((long) (-828462245));
                                                    int i303 = ~((-1094436306) | i54);
                                                    i56 = i50;
                                                    int i304 = ((int) (j26 >> 32)) & (((340003336 | i303 | (~(1094436305 | i56))) * (-338)) + 394236986 + ((i303 | (~(1434439641 | i56))) * 338));
                                                    int i305 = ((int) j26) & ((-1754753727) + (((~(i54 | 1706403797)) | 1151337088) * (-828)) + ((1706403797 | i54) * (-828)) + 141895640);
                                                    if (((i304 & i305) | (i304 ^ i305)) == 1245577864) {
                                                        i59 = (~(i56 & 70)) & (i56 | 70);
                                                        break loop5;
                                                    }
                                                    i293 = ((i301 | 1) << 1) - (i301 ^ 1);
                                                    objInvoke2 = obj8;
                                                    i53 = i56;
                                                    i55 = i58;
                                                    strArr5 = strArr5;
                                                    str20 = str21;
                                                    i292 = i302;
                                                    it2 = it3;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                        objInvoke2 = objInvoke2;
                                        i53 = i53;
                                        i55 = i55;
                                        strArr5 = strArr5;
                                        it2 = it2;
                                    }
                                    int i306 = i58;
                                    int i307 = ((~i306) & i56) | (i306 & i54);
                                    int i308 = -i307;
                                    int i309 = ((i307 & i308) | (i307 ^ i308)) >> 31;
                                    int i310 = i59 & (~i309);
                                    int i311 = i306 & i309;
                                    i55 = (i310 & i311) | (i310 ^ i311);
                                } catch (Throwable th23) {
                                    Throwable cause10 = th23.getCause();
                                    if (cause10 != null) {
                                        throw cause10;
                                    }
                                    throw th23;
                                }
                            } else {
                                strArr5 = strArr5;
                                i56 = i53;
                            }
                            strArr4 = strArr5;
                            i57 = 0;
                        } catch (Throwable th24) {
                            Throwable cause11 = th24.getCause();
                            if (cause11 != null) {
                                throw cause11;
                            }
                            throw th24;
                        }
                    } else {
                        i56 = i76;
                        i55 = i56;
                        i57 = 0;
                        strArr4 = null;
                    }
                    int i312 = -View.MeasureSpec.getMode(i57);
                    int i313 = ~i312;
                    int i314 = ~((i313 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i313 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                    int i315 = ~(i313 | i56);
                    int i316 = (i315 & i314) | (i314 ^ i315);
                    int i317 = ~(((-128) & i56) | ((-128) ^ i56));
                    int i318 = ((i312 * 881) - (-111887)) + (((i316 & i317) | (i316 ^ i317)) * (-880));
                    int i319 = ~i312;
                    int i320 = ~i56;
                    int i321 = ~((i319 & i320) | (i319 ^ i320));
                    int i322 = (i321 & 127) | (i321 ^ 127);
                    int i323 = (i312 & i56) | (i312 ^ i56);
                    int i324 = ~i323;
                    int i325 = (i318 - (~(((i322 & i324) | (i322 ^ i324)) * (-880)))) - 1;
                    int i326 = -(-((~i323) * 880));
                    Object[] objArr84 = new Object[1];
                    a(null, null, ((i325 | i326) << 1) - (i326 ^ i325), new byte[]{-123, -95, -126, -96, -102, -97, -119, -107, -118, -98, -115, -99}, objArr84);
                    Object[] objArr85 = {(String) objArr84[0]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int i327 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                        int iIndexOf4 = TextUtils.indexOf("", "") + 8;
                        byte b44 = (byte) ($$d[7] - 1);
                        byte b45 = b44;
                        Object[] objArr86 = new Object[1];
                        e(b44, b45, (byte) (b45 | 51), objArr86);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, i327, iIndexOf4, -545305915, false, (String) objArr86[0], new Class[]{String.class});
                    }
                    long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr85)).longValue();
                    long j27 = -832993533;
                    long j28 = -958;
                    long j29 = (j28 * j27) + (j28 * jLongValue7);
                    long j30 = 959;
                    String[] strArr6 = strArr4;
                    long j31 = -1;
                    long j32 = jLongValue7 ^ j31;
                    long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    long j33 = jElapsedRealtime ^ j31;
                    long j34 = j27 ^ j31;
                    long j35 = j29 + ((((j32 | j33) ^ j31) | ((j34 | jElapsedRealtime) ^ j31) | ((j33 | j27) ^ j31)) * j30);
                    long j36 = -959;
                    long j37 = j35 + (((jLongValue7 | j27) ^ j31) * j36) + ((((j34 | j33) ^ j31) | ((j32 | jElapsedRealtime) ^ j31) | ((jElapsedRealtime | j27) ^ j31)) * j30) + ((long) 1453452817);
                    int i328 = ((int) (j37 >> 32)) & (1687905420 + (((~(2001042081 | i320)) | (-856698804)) * (-90)) + (((~(2001042081 | i50)) | 855648929) * (-45)) + ((2001042081 | (~(856698803 | i50)) | (~((-856698804) | i320))) * 45));
                    int iMyUid2 = Process.myUid();
                    int i329 = ~iMyUid2;
                    int i330 = ((int) j37) & (497234701 + (((~(430411947 | i329)) | (-2146957056)) * 184) + ((iMyUid2 | 151093249) * (-184)) + ((~(1867638357 | i329)) * 184));
                    int i331 = (i328 & i330) | (i328 ^ i330);
                    int i332 = -i331;
                    int i333 = ((i331 & i332) | (i331 ^ i332)) >> 31;
                    int i334 = (~i333) & i50;
                    int i335 = i333 & (i50 ^ 50);
                    int i336 = (i335 & i334) | (i334 ^ i335);
                    int i337 = ((~i55) & i50) | (i55 & i320);
                    int i338 = -i337;
                    int i339 = ((i337 & i338) | (i337 ^ i338)) >> 31;
                    int i340 = i336 & (~i339);
                    int i341 = i55 & i339;
                    int i342 = (i341 & i340) | (i340 ^ i341);
                    Object[] objArr87 = new Object[1];
                    a(null, null, 127 - Color.green(0), new byte[]{-118, -120, -127, -110, -107, -104, -118, -126, -123, -94, -110, -105, -99, -111, -118, -119, -107, -103, -107, -99}, objArr87);
                    Object[] objArr88 = {(String) objArr87[0]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int tapTimeout2 = 993 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iAlpha = 8 - Color.alpha(0);
                        byte b46 = (byte) ($$d[7] - 1);
                        byte b47 = b46;
                        Object[] objArr89 = new Object[1];
                        e(b46, b47, (byte) (b47 | 51), objArr89);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(bitsPerPixel3, tapTimeout2, iAlpha, -545305915, false, (String) objArr89[0], new Class[]{String.class});
                    }
                    long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr88)).longValue();
                    long j38 = -1303652951;
                    long j39 = -445;
                    long j40 = (j39 * j38) + (j39 * jLongValue8);
                    long j41 = 446;
                    long j42 = j38 ^ j31;
                    long j43 = jLongValue8 ^ j31;
                    long j44 = (j42 | j43) ^ j31;
                    long j45 = i50;
                    long j46 = j45 ^ j31;
                    long j47 = j40 + ((j44 | ((j43 | j46) ^ j31)) * j41) + ((((j42 | jLongValue8) ^ j31) | (((j43 | j38) | j45) ^ j31)) * j41) + (j41 * j44) + ((long) 1924112235);
                    int i343 = ((int) (j47 >> 32)) & (((466256908 + (((-570773505) | i50) * (-381))) + (((~((-573405798) | i320)) | 1442490997) * 381)) - 1578627072);
                    int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                    int i344 = ~iUptimeMillis3;
                    int i345 = ((int) j47) & ((-1687905466) + (((~(578502699 | i344)) | (-858723711)) * (-90)) + (((~(578502699 | iUptimeMillis3)) | 573243434) * (-45)) + (((~(iUptimeMillis3 | 858723710)) | 578502699 | (~(i344 | (-858723711)))) * 45));
                    int i346 = (i345 & i343) | (i343 ^ i345);
                    int i347 = -i346;
                    int i348 = ((i346 & i347) | (i346 ^ i347)) >> 31;
                    int i349 = (~i348) & i50;
                    int i350 = i348 & ((i50 & (-61)) | (i320 & 60));
                    int i351 = (i350 & i349) | (i349 ^ i350);
                    int i352 = (~(i50 & i342)) & (i50 | i342);
                    int i353 = -i352;
                    int i354 = ((i352 & i353) | (i352 ^ i353)) >> 31;
                    int i355 = i351 & (~i354);
                    int i356 = i342 & i354;
                    int i357 = (i356 & i355) | (i355 ^ i356);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i358 = (iLastIndexOf * 165) - 6031;
                    int i359 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                    int i360 = ~((i359 ^ 37) | (i359 & 37));
                    int i361 = -(-(((i360 & iLastIndexOf) | (iLastIndexOf ^ i360)) * (-328)));
                    int i362 = (i358 ^ i361) + ((i358 & i361) << 1) + (((iLastIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (iLastIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault12)) * 164);
                    int i363 = ~iLastIndexOf;
                    int i364 = ~((i363 & (-38)) | (i363 ^ (-38)));
                    int i365 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & (-38)) | ((-38) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                    int i366 = (i365 & i364) | (i364 ^ i365);
                    int i367 = ~((iLastIndexOf & i359) | (i359 ^ iLastIndexOf) | 37);
                    int i368 = (i362 - (~(-(-(((i367 & i366) | (i366 ^ i367)) * 164))))) - 1;
                    char[] cArr9 = {30, 31, '*', '\f', '+', '!', '!', ',', '\f', '*', Typography.dollar, '+', 31, 4, 4, '%', 4, '!', 5, 3, '-', '!', Typography.quote, 16, Typography.quote, 25, 31, 30, '\t', 18, '0', 6, '!', ',', '\f', '*'};
                    int i369 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    Object[] objArr90 = new Object[1];
                    c(i368, cArr9, (byte) (((i369 | 88) << 1) - (i369 ^ 88)), objArr90);
                    Object[] objArr91 = {(String) objArr90[0]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char c4 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int mirror3 = AndroidCharacter.getMirror('0') + 945;
                        int i370 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7;
                        byte[] bArr22 = $$d;
                        Object[] objArr92 = new Object[1];
                        e((byte) (bArr22[7] - 1), (byte) (-bArr22[41]), (byte) 51, objArr92);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c4, mirror3, i370, 349342683, false, (String) objArr92[0], new Class[]{String.class});
                    }
                    long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr91)).longValue();
                    long j48 = 464996553;
                    long j49 = j48 ^ j31;
                    long j50 = (j46 | j48) ^ j31;
                    long j51 = (((long) 375) * j48) + (((long) (-747)) * jLongValue9) + (((long) (-374)) * (((j49 | jLongValue9) ^ j31) | j50));
                    long j52 = jLongValue9 ^ j31;
                    long j53 = j51 + (((long) 748) * ((j48 | j52) ^ j31)) + (((long) 374) * (((j49 | j52) ^ j31) | j50)) + ((long) (-1312075158));
                    int i371 = ((int) (j53 >> 32)) & (((~(2054682621 | i320)) * 130) + 900973734 + (((~(2054682621 | i50)) | 539049984) * 130));
                    int i372 = ~((int) SystemClock.uptimeMillis());
                    int i373 = i371 | (((int) j53) & (1179484381 + ((1543404267 | i372) * 184) + (((~(i372 | 61608641)) | 1526364842) * 184)));
                    int i374 = (i373 | (-i373)) >> 31;
                    int i375 = (~i374) & i50;
                    int i376 = i374 & (i50 ^ 80);
                    int i377 = (i376 & i375) | (i375 ^ i376);
                    int i378 = ((~i357) & i50) | (i357 & i320);
                    int i379 = -i378;
                    int i380 = ((i378 & i379) | (i378 ^ i379)) >> 31;
                    int i381 = i377 & (~i380);
                    int i382 = i357 & i380;
                    int i383 = (i382 & i381) | (i381 ^ i382);
                    int i384 = 41 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                    char[] cArr10 = {30, 31, '*', '\f', '+', '!', '!', ',', '\f', '*', Typography.dollar, '+', 31, 4, 1, '%', 4, Typography.quote, '!', 24, 5, ',', ' ', 31, 18, Typography.quote, 23, Typography.quote, '\t', '%', '\f', ',', 0, 3, Typography.amp, 20, '+', '(', 22, '!', '\n', 4};
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0');
                    int i385 = iLastIndexOf2 * 866;
                    int i386 = ((i385 | (-15552)) << 1) - (i385 ^ (-15552));
                    int i387 = ~iLastIndexOf2;
                    int i388 = ~((i387 & i320) | (i387 ^ i320));
                    int i389 = ((i388 & (-19)) | ((-19) ^ i388)) * (-865);
                    int i390 = (i386 ^ i389) + ((i389 & i386) << 1);
                    int i391 = -(-((~((iLastIndexOf2 ^ i50) | (iLastIndexOf2 & i50))) * 865));
                    int i392 = ((i390 | i391) << 1) - (i391 ^ i390);
                    int i393 = ~i50;
                    int i394 = ~((i393 & (-19)) | ((-19) ^ i393));
                    int i395 = ~((iLastIndexOf2 & i320) | (i320 ^ iLastIndexOf2));
                    Object[] objArr93 = new Object[1];
                    c(i384, cArr10, (byte) (i392 + (((i395 & i394) | (i394 ^ i395)) * 865)), objArr93);
                    Object[] objArr94 = {(String) objArr93[0]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char c5 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                        int iResolveSize = 993 - View.resolveSize(0, 0);
                        int scrollBarFadeDuration4 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8;
                        byte[] bArr23 = $$d;
                        Object[] objArr95 = new Object[1];
                        e((byte) (bArr23[7] - 1), (byte) (-bArr23[41]), (byte) 51, objArr95);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c5, iResolveSize, scrollBarFadeDuration4, 349342683, false, (String) objArr95[0], new Class[]{String.class});
                    }
                    long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr94)).longValue();
                    long j54 = 58335379;
                    long j55 = (((long) 960) * j54) + (((long) (-1917)) * jLongValue10);
                    long j56 = jLongValue10 ^ j31;
                    long j57 = j55 + ((((j56 | j46) ^ j31) | ((j54 | j45) ^ j31)) * j30) + (j36 * j56) + ((((j56 | j45) ^ j31) | ((j46 | j54) ^ j31)) * j30) + ((long) (-905413984));
                    int iMyTid = Process.myTid();
                    int i396 = ~iMyTid;
                    int i397 = ((int) (j57 >> 32)) & (1766503934 + (((~(1498121245 | i396)) | (~(1359619639 | iMyTid))) * 217) + (((~(iMyTid | 1498121245)) | (-1498129984)) * 217) + (((~(1359619639 | i396)) | (-1498121246)) * 217));
                    int i398 = ~((~((int) SystemClock.uptimeMillis())) | 362046602);
                    int i399 = ((int) j57) & (((18096128 | i398) * (-374)) + 1247299769 + ((i398 | 343950474) * 374));
                    int i400 = (i397 & i399) | (i397 ^ i399);
                    int i401 = -i400;
                    int i402 = ((i400 & i401) | (i400 ^ i401)) >> 31;
                    int i403 = (~i402) & i50;
                    int i404 = i402 & (i50 ^ 90);
                    int i405 = (i404 & i403) | (i403 ^ i404);
                    int i406 = i50 ^ i383;
                    int i407 = -i406;
                    int i408 = ((i406 & i407) | (i406 ^ i407)) >> 31;
                    int i409 = i405 & (~i408);
                    int i410 = i383 & i408;
                    int i411 = (i410 & i409) | (i409 ^ i410);
                    int i412 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    Object[] objArr96 = new Object[1];
                    a(null, null, ((i412 | 127) << 1) - (i412 ^ 127), new byte[]{-94, -107, -121, -126, -127, -119, -122, -119, -121, -119, -122, -126, -122, -99, -120, -119, -118, -99}, objArr96);
                    Object[] objArr97 = {(String) objArr96[0]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char c6 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i413 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 992;
                        int longPressTimeout = 8 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr24 = $$d;
                        Object[] objArr98 = new Object[1];
                        e((byte) (bArr24[7] - 1), (byte) (-bArr24[41]), (byte) 51, objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c6, i413, longPressTimeout, 349342683, false, (String) objArr98[0], new Class[]{String.class});
                    }
                    long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr97)).longValue();
                    long j58 = 103953560;
                    long j59 = (((long) (-947)) * j58) + (((long) 949) * jLongValue11);
                    long j60 = -948;
                    long j61 = j58 ^ j31;
                    long j62 = jLongValue11 ^ j31;
                    long j63 = j59 + ((j61 | ((j62 | j45) ^ j31)) * j60) + (j60 * (((j61 | j62) | j46) ^ j31)) + (((long) 948) * (j62 | j58)) + ((long) (-951032165));
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i414 = ~(1959416183 | elapsedCpuTime);
                    int i415 = ~elapsedCpuTime;
                    int i416 = i414 | (~((-898324702) | i415));
                    int i417 = ~((-1959416184) | i415);
                    int i418 = ((int) (j63 >> 32)) & ((-625131710) + ((i416 | i417) * (-516)) + (((~(elapsedCpuTime | 1976261119)) | (~((-1077936419) | i415))) * 516) + ((1077936418 | i417) * 516));
                    int i419 = ((int) j63) & ((-1520785380) + (((~(i320 | (-320365569))) | 34627584) * 529) + (((~((-320365569) | i50)) | 1116860841) * 529));
                    int i420 = (i418 & i419) | (i418 ^ i419);
                    int i421 = -i420;
                    int i422 = ((i420 & i421) | (i420 ^ i421)) >> 31;
                    int i423 = (i422 & (~(i50 & 100)) & (i50 | 100)) | ((~i422) & i50);
                    int i424 = ((~i411) & i50) | (i411 & i320);
                    int i425 = -i424;
                    int i426 = ((i424 & i425) | (i424 ^ i425)) >> 31;
                    int i427 = i423 & (~i426);
                    int i428 = i411 & i426;
                    int i429 = (i428 & i427) | (i427 ^ i428);
                    Object[] objArr99 = {new int[]{i50}, strArr6, new int[1], new int[]{i429}};
                    int i430 = i50 ^ i429;
                    int i431 = -i430;
                    int i432 = 1792001511 + (((~(545397365 | i320)) | 263315950) * (-328)) + ((i50 | 263315950) * 164) + (((~((-545397366) | i50)) | 8388708 | (~(800324607 | i320))) * 164) + ((((i430 & i431) | (i430 ^ i431)) >> 31) & 16);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i433 = i432 * 677;
                    int i434 = i52 * (-675);
                    int i435 = (i433 & i434) + (i433 | i434);
                    int i436 = (i432 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (i432 & iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
                    int i437 = ~i52;
                    int i438 = -(-(((i436 & i437) | (i436 ^ i437)) * (-676)));
                    int i439 = ((i435 | i438) << 1) - (i438 ^ i435);
                    int i440 = ~i52;
                    int i441 = ~((i440 ^ i432) | (i440 & i432));
                    int i442 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                    int i443 = ~(i442 | i432);
                    int i444 = i439 + (((i441 & i443) | (i441 ^ i443)) * 676);
                    int i445 = ~i432;
                    int i446 = ~((i445 & i440) | (i445 ^ i440));
                    int i447 = ~((i440 & i442) | (i440 ^ i442));
                    int i448 = (i444 - (~(((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault13 | ((i52 & i432) | (i432 ^ i52)))) | ((i447 & i446) | (i446 ^ i447))) * 676))) - 1;
                    int i449 = i448 << 13;
                    int i450 = (i449 & (~i448)) | ((~i449) & i448);
                    int i451 = i450 >>> 17;
                    int i452 = ((~i450) & i451) | ((~i451) & i450);
                    int i453 = i452 << 5;
                    ((int[]) objArr99[2])[0] = ((~i452) & i453) | ((~i453) & i452);
                    return objArr99;
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
                private static java.lang.String $$g(byte r5, byte r6, short r7) {
                    /*
                        int r5 = r5 * 4
                        int r5 = r5 + 1
                        int r6 = r6 + 67
                        byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.$$c
                        int r7 = r7 * 4
                        int r7 = r7 + 4
                        byte[] r1 = new byte[r5]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r4 = r5
                        r3 = r2
                        goto L24
                    L14:
                        r3 = r2
                    L15:
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        int r3 = r3 + 1
                        if (r3 != r5) goto L22
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r1, r2)
                        return r5
                    L22:
                        r4 = r0[r7]
                    L24:
                        int r4 = -r4
                        int r6 = r6 + r4
                        int r7 = r7 + 1
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.$$g(byte, byte, short):java.lang.String");
                }
            });
            return preview;
        }
        getPreviewCapabilities.INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = (getPreviewCapabilities.INotificationSideChannelStubProxy) p0;
        if (Intrinsics.areEqual(iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal) || this.disconnect.contains(iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            this.getServiceComponent--;
            this.search++;
            TuitionPaymentFragmentbindingInflater1(iNotificationSideChannelStubProxy, p1, EventType.DEFAULT);
        }
        rumViewScope = this;
        preview = null;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            return rumViewScope;
        }
        rumViewScope.unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault2("session-replay", new Function1<Map<String, Object>, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1
            private static final byte[] $$c = {23, -73, 107, 5};
            private static final int $$f = 80;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {64, 73, -26, 82, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
            private static final int $$e = 113;
            private static final byte[] $$a = {31, 115, -100, -11, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
            private static final int $$b = 136;
            private static int $a = 0;
            private static int $g = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47306, 47357, 47303, 47353, 47356, 47298, 47293, 47304, 47351, 47302, 47272, 47347, 47300, 47323, 47296, 47325, 47358, 47355, 47243, 47359, 47352, 47281, 47349, 47308, 47346, 47320, 47271, 47326, 47292, 47350, 47324, 47266, 47301, 47299};
            private static int TuitionPaymentFragmentbindingInflater1 = 2047719531;
            private static boolean b = true;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60088, 60118, 60117, 60054, 60035, 60057, 60055, 60047, 60085, 60046, 60097, 60045, 60093, 60094, 60044, 60051, 60061, 60043, 60092, 60095, 60041, 60064, 60048, 60123, 60070, 60091, 60062, 60050, 60082, 60116, 60063, 60053, 60052, 60034, 60037, 60099, 60056, 60090, 60075, 60060, 60084, 60040, 60145, 60032, 60079, 60078, 60033, 60058, 60068};
            private static char asInterface = 57190;

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                */
            private static void d(int r5, short r6, short r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 * 3
                    int r6 = r6 + 97
                    int r7 = r7 + 4
                    int r5 = r5 + 4
                    byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.$$a
                    byte[] r1 = new byte[r5]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r4 = r6
                    r3 = r2
                    r6 = r5
                    goto L25
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r5) goto L23
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L23:
                    r4 = r0[r7]
                L25:
                    int r7 = r7 + 1
                    int r6 = r6 + r4
                    int r6 = r6 + (-2)
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.d(int, short, short, java.lang.Object[]):void");
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                */
            private static void e(short r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 + 4
                    int r7 = 103 - r7
                    byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.$$d
                    int r6 = r6 * 52
                    int r1 = r6 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r4 = r6
                    r7 = r8
                    r3 = r2
                    goto L2a
                L13:
                    r3 = r2
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L17:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r7 = r7 + 1
                    if (r3 != r6) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                L2a:
                    int r4 = -r4
                    int r8 = r8 + r4
                    int r8 = r8 + (-10)
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.e(short, byte, int, java.lang.Object[]):void");
            }

            private static void a(char[] cArr, int[] iArr, int i50, byte[] bArr6, Object[] objArr22) throws Throwable {
                char[] cArr2;
                int i51 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i52 = 0;
                if (cArr3 != null) {
                    int i53 = $11 + 13;
                    $10 = i53 % 128;
                    int i54 = i53 % 2;
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i55 = 0;
                    while (i55 < length) {
                        try {
                            Object[] objArr23 = new Object[1];
                            objArr23[i52] = Integer.valueOf(cArr3[i55]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                byte b10 = (byte) i52;
                                byte b11 = (byte) (b10 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 31339), View.MeasureSpec.getSize(i52) + 2994, TextUtils.indexOf("", "", i52) + 17, 1182129903, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr4[i55] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).charValue();
                            i55++;
                            i52 = 0;
                        } catch (Throwable th4) {
                            Throwable cause2 = th4.getCause();
                            if (cause2 == null) {
                                throw th4;
                            }
                            throw cause2;
                        }
                    }
                    cArr3 = cArr4;
                }
                Object[] objArr24 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (43324 - TextUtils.lastIndexOf("", '0', 0, 0)), 253 - View.getDefaultSize(0, 0), 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr24)).intValue();
                long j6 = 0;
                int i56 = 33602;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i57 = $11 + 23;
                    $10 = i57 % 128;
                    if (i57 % 2 != 0) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr6.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    } else {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr6.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    }
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr6[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i50] - iIntValue);
                        Object[] objArr25 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (33602 - Color.green(0)), 3084 - (ExpandableListView.getPackedPositionForChild(0, 0) > j6 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j6 ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 26, -2146875848, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr25);
                        j6 = 0;
                    }
                    objArr22[0] = new String(cArr2);
                    return;
                }
                if (!b) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i50] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                        int i58 = $11 + 71;
                        $10 = i58 % 128;
                        int i59 = i58 % 2;
                    }
                    objArr22[0] = new String(cArr5);
                    return;
                }
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i50] - iIntValue);
                    Object[] objArr26 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (i56 - TextUtils.getTrimmedLength("")), TextUtils.indexOf("", "", 0) + 3085, ExpandableListView.getPackedPositionChild(0L) + 27, -2146875848, false, $$g(b14, b15, b15), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr26);
                    i56 = 33602;
                }
                objArr22[0] = new String(cArr6);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Map<String, Object> map2) {
                int i50 = 2 % 2;
                int i51 = $a + 5;
                $g = i51 % 128;
                int i52 = i51 % 2;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(map2);
                Unit unit = Unit.INSTANCE;
                int i53 = $a + 69;
                $g = i53 % 128;
                if (i53 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<String, Object> map2) {
                int i50 = 2 % 2;
                int i51 = $g + 51;
                $a = i51 % 128;
                if (i51 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(map2, "");
                    map2.remove(this.this$0.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
                } else {
                    Intrinsics.checkNotNullParameter(map2, "");
                    map2.remove(this.this$0.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
                    throw null;
                }
            }

            private static void c(int i50, char[] cArr, byte b10, Object[] objArr22) throws Throwable {
                int i51;
                Object obj2;
                int i52 = 2;
                int i53 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i54 = 1770390596;
                Object obj3 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i55 = 0;
                    while (i55 < length) {
                        int i56 = $10 + 79;
                        $11 = i56 % 128;
                        if (i56 % i52 == 0) {
                            try {
                                Object[] objArr23 = {Integer.valueOf(cArr2[i55])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i54);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                    byte b11 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 33 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1927765101, false, $$g(b11, (byte) (b11 | 46), b11), new Class[]{Integer.TYPE});
                                }
                                cArr3[i55] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).charValue();
                                i55 >>>= 1;
                                i52 = 2;
                            } catch (Throwable th4) {
                                Throwable cause2 = th4.getCause();
                                if (cause2 == null) {
                                    throw th4;
                                }
                                throw cause2;
                            }
                        } else {
                            Object[] objArr24 = {Integer.valueOf(cArr2[i55])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i54);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                byte b12 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), Color.green(0) + 2267, (-16777183) - Color.rgb(0, 0, 0), -1927765101, false, $$g(b12, (byte) (b12 | 46), b12), new Class[]{Integer.TYPE});
                            }
                            cArr3[i55] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr24)).charValue();
                            i55++;
                            i52 = 2;
                            i54 = 1770390596;
                        }
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr25 = {Integer.valueOf(asInterface)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    byte b13 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Drawable.resolveOpacity(0, 0) + 2267, 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1927765101, false, $$g(b13, (byte) (b13 | 46), b13), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr25)).charValue();
                char[] cArr4 = new char[i50];
                if (i50 % 2 != 0) {
                    i51 = i50 - 1;
                    cArr4[i51] = (char) (cArr[i51] - b10);
                } else {
                    i51 = i50;
                }
                if (i51 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i51) {
                        int i57 = $11 + 63;
                        $10 = i57 % 128;
                        int i58 = i57 % 2;
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b10);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b10);
                            obj2 = obj3;
                        } else {
                            Object[] objArr26 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                byte b14 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (49267 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 3261, TextUtils.getTrimmedLength("") + 30, -127612708, false, $$g(b14, (byte) (b14 | 47), b14), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr26)).intValue() == deinitsession.asBinder) {
                                Object[] objArr27 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                    byte b15 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22878), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 593, TextUtils.getTrimmedLength("") + 17, 1570859318, false, $$g(b15, (byte) (b15 | 49), b15), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj2 = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr27)).intValue();
                                int i59 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i59];
                            } else {
                                obj2 = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i60 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i61 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i60];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i61];
                                } else {
                                    int i62 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i63 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i62];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i63];
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj3 = obj2;
                    }
                }
                for (int i64 = 0; i64 < i50; i64++) {
                    cArr4[i64] = (char) (cArr4[i64] ^ 13722);
                }
                objArr22[0] = new String(cArr4);
            }

            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0a64 A[Catch: IOException -> 0x0cb3, Exception -> 0x0cef, all -> 0x0d9a, TryCatch #0 {Exception -> 0x0cef, blocks: (B:69:0x0764, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb), top: B:285:0x0764 }] */
            /* JADX WARN: Code duplicated, block: B:103:0x0abf A[Catch: IOException -> 0x0cb3, Exception -> 0x0cef, all -> 0x0d9a, TryCatch #0 {Exception -> 0x0cef, blocks: (B:69:0x0764, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb), top: B:285:0x0764 }] */
            /* JADX WARN: Code duplicated, block: B:107:0x0b3f A[Catch: IOException -> 0x0cb3, all -> 0x0d9a, TRY_LEAVE, TryCatch #4 {IOException -> 0x0cb3, blocks: (B:69:0x0764, B:97:0x0a53, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb, B:105:0x0b0c, B:107:0x0b3f), top: B:285:0x0764 }] */
            /* JADX WARN: Code duplicated, block: B:111:0x0bbc A[Catch: IOException -> 0x0c9b, all -> 0x0d9a, TryCatch #30 {, blocks: (B:43:0x05e9, B:44:0x0606, B:49:0x0681, B:59:0x06d5, B:69:0x0764, B:97:0x0a53, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb, B:105:0x0b0c, B:107:0x0b3f, B:109:0x0b97, B:111:0x0bbc, B:113:0x0c28, B:115:0x0c4d, B:117:0x0c71, B:119:0x0c7b, B:150:0x0ceb, B:151:0x0cee, B:191:0x0d67, B:192:0x0d99, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:319:0x05e9 }] */
            /* JADX WARN: Code duplicated, block: B:113:0x0c28 A[Catch: IOException -> 0x0c9b, all -> 0x0d9a, TryCatch #30 {, blocks: (B:43:0x05e9, B:44:0x0606, B:49:0x0681, B:59:0x06d5, B:69:0x0764, B:97:0x0a53, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb, B:105:0x0b0c, B:107:0x0b3f, B:109:0x0b97, B:111:0x0bbc, B:113:0x0c28, B:115:0x0c4d, B:117:0x0c71, B:119:0x0c7b, B:150:0x0ceb, B:151:0x0cee, B:191:0x0d67, B:192:0x0d99, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:319:0x05e9 }] */
            /* JADX WARN: Code duplicated, block: B:115:0x0c4d A[Catch: IOException -> 0x0c9b, all -> 0x0d9a, TryCatch #30 {, blocks: (B:43:0x05e9, B:44:0x0606, B:49:0x0681, B:59:0x06d5, B:69:0x0764, B:97:0x0a53, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb, B:105:0x0b0c, B:107:0x0b3f, B:109:0x0b97, B:111:0x0bbc, B:113:0x0c28, B:115:0x0c4d, B:117:0x0c71, B:119:0x0c7b, B:150:0x0ceb, B:151:0x0cee, B:191:0x0d67, B:192:0x0d99, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:319:0x05e9 }] */
            /* JADX WARN: Code duplicated, block: B:117:0x0c71 A[Catch: IOException -> 0x0c9b, all -> 0x0d9a, TRY_LEAVE, TryCatch #30 {, blocks: (B:43:0x05e9, B:44:0x0606, B:49:0x0681, B:59:0x06d5, B:69:0x0764, B:97:0x0a53, B:98:0x0a56, B:100:0x0a64, B:101:0x0aa9, B:103:0x0abf, B:104:0x0afb, B:105:0x0b0c, B:107:0x0b3f, B:109:0x0b97, B:111:0x0bbc, B:113:0x0c28, B:115:0x0c4d, B:117:0x0c71, B:119:0x0c7b, B:150:0x0ceb, B:151:0x0cee, B:191:0x0d67, B:192:0x0d99, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:319:0x05e9 }] */
            /* JADX WARN: Code duplicated, block: B:121:0x0c98  */
            /* JADX WARN: Code duplicated, block: B:123:0x0c9f  */
            /* JADX WARN: Code duplicated, block: B:169:0x0d1e A[Catch: Exception -> 0x0d67, all -> 0x0d9a, IOException -> 0x0d9e, TryCatch #13 {Exception -> 0x0d67, blocks: (B:151:0x0cee, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:302:0x0606 }] */
            /* JADX WARN: Code duplicated, block: B:170:0x0d1f A[Catch: Exception -> 0x0d67, all -> 0x0d9a, IOException -> 0x0d9e, TryCatch #13 {Exception -> 0x0d67, blocks: (B:151:0x0cee, B:154:0x0cf4, B:156:0x0cff, B:157:0x0d00, B:167:0x0d15, B:169:0x0d1e, B:170:0x0d1f, B:177:0x0d2b, B:179:0x0d3a, B:180:0x0d3b, B:182:0x0d3d, B:184:0x0d4f, B:185:0x0d50), top: B:302:0x0606 }] */
            /* JADX WARN: Code duplicated, block: B:199:0x0da0  */
            /* JADX WARN: Code duplicated, block: B:232:0x127a A[EDGE_INSN: B:232:0x127a->B:233:0x127f BREAK  A[LOOP:5: B:212:0x0f8b->B:231:0x1268], PHI: r1 r2 r3
  0x127a: PHI (r1v7 int) = (r1v4 int), (r1v4 int), (r1v13 int) binds: [B:208:0x0ee4, B:210:0x0f85, B:347:0x127a] A[DONT_GENERATE, DONT_INLINE]
  0x127a: PHI (r2v9 java.lang.String[]) = (r2v5 java.lang.String[]), (r2v5 java.lang.String[]), (r2v12 java.lang.String[]) binds: [B:208:0x0ee4, B:210:0x0f85, B:347:0x127a] A[DONT_GENERATE, DONT_INLINE]
  0x127a: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v11 int) binds: [B:208:0x0ee4, B:210:0x0f85, B:347:0x127a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:24:0x0386  */
            /* JADX WARN: Code duplicated, block: B:26:0x0389  */
            /* JADX WARN: Code duplicated, block: B:29:0x03ab A[Catch: all -> 0x1a23, TryCatch #2 {all -> 0x1a23, blocks: (B:12:0x01e0, B:14:0x01f6, B:16:0x0258, B:27:0x0393, B:29:0x03ab, B:31:0x0402, B:222:0x1133, B:224:0x114a, B:226:0x11a0, B:248:0x1311, B:250:0x131e, B:251:0x1362, B:253:0x1451, B:255:0x145e, B:256:0x14a1, B:258:0x15d5, B:260:0x15e2, B:261:0x162e, B:263:0x1732, B:265:0x173f, B:266:0x1785, B:268:0x1852, B:270:0x185f, B:271:0x18ab), top: B:289:0x01e0 }] */
            /* JADX WARN: Code duplicated, block: B:30:0x0400  */
            /* JADX WARN: Code duplicated, block: B:317:0x0692 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:319:0x05e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:336:0x04ad A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:337:0x04be A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:342:0x0cb3 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:343:0x0c7b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:35:0x04af A[LOOP:1: B:25:0x0387->B:35:0x04af, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:36:0x04be A[EDGE_INSN: B:36:0x04be->B:37:0x04c6 BREAK  A[LOOP:1: B:25:0x0387->B:35:0x04af], PHI: r1 r2 r5 r8 r23 r28
  0x04be: PHI (r1v44 int) = (r1v43 int), (r1v136 int) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r2v41 int) = (r2v40 int), (r2v93 int) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r5v48 java.lang.Object) = (r5v47 java.lang.Object), (r5v166 java.lang.Object) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r8v95 int) = (r8v35 int), (r8v205 int) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r23v3 ??) = (r23v27 ??), (r23v22 ??) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r28v10 ??) = (r28v29 ??), (r28v26 ??) binds: [B:23:0x0384, B:337:0x04be] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:39:0x0562  */
            /* JADX WARN: Code duplicated, block: B:41:0x05cc  */
            /* JADX WARN: Code duplicated, block: B:47:0x064a A[Catch: all -> 0x0d3c, TryCatch #15 {all -> 0x0d3c, blocks: (B:45:0x063d, B:47:0x064a, B:48:0x067b), top: B:306:0x063d }] */
            /* JADX WARN: Code duplicated, block: B:57:0x06cd  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v112 */
            /* JADX WARN: Type inference failed for: r1v135 */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v227 */
            /* JADX WARN: Type inference failed for: r1v228 */
            /* JADX WARN: Type inference failed for: r1v229 */
            /* JADX WARN: Type inference failed for: r1v230 */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v56 */
            /* JADX WARN: Type inference failed for: r1v57 */
            /* JADX WARN: Type inference failed for: r1v58 */
            /* JADX WARN: Type inference failed for: r23v10 */
            /* JADX WARN: Type inference failed for: r23v11 */
            /* JADX WARN: Type inference failed for: r23v12 */
            /* JADX WARN: Type inference failed for: r23v13 */
            /* JADX WARN: Type inference failed for: r23v14 */
            /* JADX WARN: Type inference failed for: r23v15 */
            /* JADX WARN: Type inference failed for: r23v16 */
            /* JADX WARN: Type inference failed for: r23v22 */
            /* JADX WARN: Type inference failed for: r23v27 */
            /* JADX WARN: Type inference failed for: r23v3 */
            /* JADX WARN: Type inference failed for: r23v33 */
            /* JADX WARN: Type inference failed for: r23v34 */
            /* JADX WARN: Type inference failed for: r23v35 */
            /* JADX WARN: Type inference failed for: r23v36 */
            /* JADX WARN: Type inference failed for: r23v37 */
            /* JADX WARN: Type inference failed for: r23v4 */
            /* JADX WARN: Type inference failed for: r23v5 */
            /* JADX WARN: Type inference failed for: r23v6 */
            /* JADX WARN: Type inference failed for: r23v7 */
            /* JADX WARN: Type inference failed for: r23v8 */
            /* JADX WARN: Type inference failed for: r23v9 */
            /* JADX WARN: Type inference failed for: r27v10 */
            /* JADX WARN: Type inference failed for: r27v11 */
            /* JADX WARN: Type inference failed for: r27v12 */
            /* JADX WARN: Type inference failed for: r27v13 */
            /* JADX WARN: Type inference failed for: r27v2 */
            /* JADX WARN: Type inference failed for: r27v20 */
            /* JADX WARN: Type inference failed for: r27v21 */
            /* JADX WARN: Type inference failed for: r27v22 */
            /* JADX WARN: Type inference failed for: r27v3 */
            /* JADX WARN: Type inference failed for: r27v4 */
            /* JADX WARN: Type inference failed for: r27v5 */
            /* JADX WARN: Type inference failed for: r27v6 */
            /* JADX WARN: Type inference failed for: r27v7 */
            /* JADX WARN: Type inference failed for: r27v8 */
            /* JADX WARN: Type inference failed for: r27v9 */
            /* JADX WARN: Type inference failed for: r28v0 */
            /* JADX WARN: Type inference failed for: r28v1 */
            /* JADX WARN: Type inference failed for: r28v10 */
            /* JADX WARN: Type inference failed for: r28v11 */
            /* JADX WARN: Type inference failed for: r28v12 */
            /* JADX WARN: Type inference failed for: r28v13 */
            /* JADX WARN: Type inference failed for: r28v14 */
            /* JADX WARN: Type inference failed for: r28v15 */
            /* JADX WARN: Type inference failed for: r28v16 */
            /* JADX WARN: Type inference failed for: r28v17 */
            /* JADX WARN: Type inference failed for: r28v18 */
            /* JADX WARN: Type inference failed for: r28v19 */
            /* JADX WARN: Type inference failed for: r28v20 */
            /* JADX WARN: Type inference failed for: r28v21 */
            /* JADX WARN: Type inference failed for: r28v22 */
            /* JADX WARN: Type inference failed for: r28v23 */
            /* JADX WARN: Type inference failed for: r28v24 */
            /* JADX WARN: Type inference failed for: r28v25 */
            /* JADX WARN: Type inference failed for: r28v26 */
            /* JADX WARN: Type inference failed for: r28v29 */
            /* JADX WARN: Type inference failed for: r28v40 */
            /* JADX WARN: Type inference failed for: r28v41 */
            /* JADX WARN: Type inference failed for: r28v42 */
            /* JADX WARN: Type inference failed for: r28v43 */
            /* JADX WARN: Type inference failed for: r28v44 */
            /* JADX WARN: Type inference failed for: r28v45 */
            /* JADX WARN: Type inference failed for: r28v46 */
            /* JADX WARN: Type inference failed for: r28v47 */
            /* JADX WARN: Type inference failed for: r28v48 */
            /* JADX WARN: Type inference failed for: r29v13 */
            /* JADX WARN: Type inference failed for: r29v2 */
            /* JADX WARN: Type inference failed for: r29v20 */
            /* JADX WARN: Type inference failed for: r29v21 */
            /* JADX WARN: Type inference failed for: r29v22 */
            /* JADX WARN: Type inference failed for: r29v3 */
            /* JADX WARN: Type inference failed for: r29v4 */
            /* JADX WARN: Type inference failed for: r29v5 */
            /* JADX WARN: Type inference failed for: r29v6 */
            /* JADX WARN: Type inference failed for: r29v7 */
            /* JADX WARN: Type inference failed for: r29v8 */
            /* JADX WARN: Type inference failed for: r2v276 */
            /* JADX WARN: Type inference failed for: r2v277 */
            /* JADX WARN: Type inference failed for: r2v278 */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r2v59 */
            /* JADX WARN: Type inference failed for: r2v60 */
            /* JADX WARN: Type inference failed for: r31v10 */
            /* JADX WARN: Type inference failed for: r31v12 */
            /* JADX WARN: Type inference failed for: r31v13 */
            /* JADX WARN: Type inference failed for: r31v14 */
            /* JADX WARN: Type inference failed for: r31v15 */
            /* JADX WARN: Type inference failed for: r31v16 */
            /* JADX WARN: Type inference failed for: r31v19 */
            /* JADX WARN: Type inference failed for: r31v20 */
            /* JADX WARN: Type inference failed for: r31v9 */
            /* JADX WARN: Type inference failed for: r4v106 */
            /* JADX WARN: Type inference failed for: r4v107 */
            /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.reflect.Field] */
            /* JADX WARN: Type inference failed for: r4v304 */
            /* JADX WARN: Type inference failed for: r4v305 */
            /* JADX WARN: Type inference failed for: r4v306 */
            /* JADX WARN: Type inference failed for: r4v32 */
            /* JADX WARN: Type inference failed for: r5v154, types: [java.lang.String[]] */
            /* JADX WARN: Type inference failed for: r5v155, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String[]] */
            /* JADX WARN: Type inference failed for: r5v361 */
            /* JADX WARN: Type inference failed for: r5v70 */
            /* JADX WARN: Type inference failed for: r5v71 */
            /* JADX WARN: Type inference failed for: r7v173 */
            /* JADX WARN: Type inference failed for: r7v174 */
            /* JADX WARN: Type inference failed for: r7v204, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v26, types: [int[]] */
            /* JADX WARN: Type inference failed for: r8v101, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r8v102 */
            /* JADX WARN: Type inference failed for: r8v103 */
            /* JADX WARN: Type inference failed for: r8v106 */
            /* JADX WARN: Type inference failed for: r8v107 */
            /* JADX WARN: Type inference failed for: r8v120 */
            /* JADX WARN: Type inference failed for: r8v123 */
            /* JADX WARN: Type inference failed for: r8v126 */
            /* JADX WARN: Type inference failed for: r8v162 */
            /* JADX WARN: Type inference failed for: r8v231 */
            public static Object[] b(Context context, int i50, int i51, int i52) throws Throwable {
                int i53;
                ?? r28;
                int i54;
                ?? r1;
                int i55;
                int i56;
                String[] strArr4;
                int i57;
                int i58;
                int i59;
                Object obj2;
                int i60;
                int i61;
                int i62;
                int i63;
                Object obj3;
                String str9;
                int i64;
                ?? r29;
                ?? r23;
                int i65;
                int i66;
                Object obj4;
                int i67;
                int i68;
                ?? r210;
                ?? r24;
                int i69;
                int i70;
                ?? r211;
                ?? r212;
                ?? r27;
                ?? r25;
                ?? r5;
                ?? r4;
                ?? r2;
                ?? r8;
                Object[] objArr22;
                ?? r3;
                ?? r26;
                Process processExec;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                Throwable th4;
                Throwable cause2;
                boolean z6;
                Throwable th5;
                ?? r9;
                ?? r31;
                ?? r32;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                String[] strArrSplit;
                int length;
                int i71;
                ?? r33;
                String str10;
                Object[] objArr23;
                ?? r7;
                Object[] objArr24;
                Object[] objArr25;
                ?? Split;
                int i72;
                String str11;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                int i73;
                Object obj5;
                long j6;
                int i74;
                int i75;
                Class[] clsArr;
                int i76 = i50;
                char c2 = 1;
                int i77 = 0;
                if (context != null) {
                    try {
                        int i78 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        Object[] objArr26 = new Object[1];
                        a(null, null, ((i78 | 128) << 1) - (i78 ^ 128), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr26);
                        Class<?> cls7 = Class.forName((String) objArr26[0]);
                        int iArgb2 = Color.argb(0, 0, 0, 0);
                        Object[] objArr27 = new Object[1];
                        a(null, null, (iArgb2 ^ 127) + ((iArgb2 & 127) << 1), new byte[]{-118, -111, -127, -112, -118, -115, -127, -113, -120, -127, -114, -119, -118, -115}, objArr27);
                        String str12 = (String) cls7.getMethod((String) objArr27[0], null).invoke(context, null);
                        int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                        int i79 = (scrollBarSize2 * (-375)) - 47625;
                        int i80 = ~scrollBarSize2;
                        int i81 = (~((i80 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i80 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) | i76;
                        int i82 = (scrollBarSize2 ^ 127) | (scrollBarSize2 & 127);
                        int i83 = ~i82;
                        int i84 = -(-(((i81 ^ i83) | (i83 & i81)) * 376));
                        int i85 = (i79 & i84) + (i84 | i79);
                        int i86 = ~i76;
                        int i87 = ~((i86 ^ scrollBarSize2) | (i86 & scrollBarSize2));
                        int i88 = ~i82;
                        int i89 = -(-(((i87 ^ i88) | (i88 & i87)) * (-376)));
                        Object[] objArr28 = new Object[1];
                        a(null, null, (i85 & i89) + (i89 | i85) + (((~((~scrollBarSize2) | i76)) | 127) * 376), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr28);
                        Class<?> cls8 = Class.forName((String) objArr28[0]);
                        int i90 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i91 = ~i90;
                        int i92 = (((i90 * 592) - 10620) - (~((~((i91 ^ 18) | (i91 & 18))) * (-1182)))) - 1;
                        int i93 = (i91 ^ (-19)) | (i91 & (-19));
                        int i94 = ~i76;
                        int i95 = ((~((i93 ^ i94) | (i93 & i94))) | (~((i90 ^ 18) | (i90 & 18)))) * (-591);
                        int i96 = (i92 & i95) + (i95 | i92);
                        int i97 = (i76 ^ i91) | (i76 & i91);
                        int i98 = ((i97 & (-19)) | (i97 ^ (-19))) * 591;
                        int i99 = (i96 ^ i98) + ((i98 & i96) << 1);
                        char[] cArr = {'(', 25, '\t', '#', 13917, 13917, '\r', Typography.quote, '(', '+', '\r', 21, '!', ' ', 29, ' ', 18, 30};
                        int i100 = -View.MeasureSpec.getMode(0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i101 = i100 * (-115);
                        int i102 = ((i101 | (-13225)) << 1) - (i101 ^ (-13225));
                        int i103 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i100;
                        int i104 = (((i102 - (~(-(-((~((i103 ^ 115) | (i103 & 115))) * (-116)))))) - 1) - (~(((i100 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i100 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 116))) - 1;
                        int i105 = ~i100;
                        int i106 = -(-(((~((i105 & (-116)) | (i105 ^ (-116)))) | (~(((-116) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-116) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)))) * 116));
                        byte b10 = (byte) (((i104 | i106) << 1) - (i106 ^ i104));
                        Object[] objArr29 = new Object[1];
                        c(i99, cArr, b10, objArr29);
                        Object objInvoke = cls8.getMethod((String) objArr29[0], null).invoke(context, null);
                        byte[] bArr6 = $$a;
                        byte b11 = (byte) (bArr6[0] - 1);
                        byte b12 = bArr6[28];
                        Object[] objArr30 = new Object[1];
                        d(b11, b12, b12, objArr30);
                        Class<?> cls9 = Class.forName((String) objArr30[0]);
                        byte b13 = bArr6[58];
                        byte b14 = bArr6[13];
                        Object[] objArr31 = new Object[1];
                        d(b13, b14, (byte) (b14 | 32), objArr31);
                        int iIndexOf = ((String) cls9.getField((String) objArr31[0]).get(objInvoke)).indexOf(str12);
                        if (iIndexOf > 0) {
                            byte b15 = (byte) (bArr6[0] - 1);
                            byte b16 = bArr6[28];
                            Object[] objArr32 = new Object[1];
                            d(b15, b16, b16, objArr32);
                            Class<?> cls10 = Class.forName((String) objArr32[0]);
                            byte b17 = bArr6[58];
                            byte b18 = bArr6[13];
                            Object[] objArr33 = new Object[1];
                            d(b17, b18, (byte) (b18 | 32), objArr33);
                            String str13 = (String) cls10.getField((String) objArr33[0]).get(objInvoke);
                            int length2 = str13.length() - 16;
                            if (length2 >= 0) {
                                int i107 = 0;
                                while (true) {
                                    if (i107 > length2) {
                                        i53 = i76;
                                        obj2 = objInvoke;
                                        i54 = i94;
                                        i60 = i86;
                                        i61 = 0;
                                        break;
                                    }
                                    String strSubstring = str13.substring(i107, (i107 & 16) + (i107 | 16));
                                    try {
                                        Object[] objArr34 = new Object[2];
                                        objArr34[c2] = 931995;
                                        objArr34[i77] = strSubstring;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                            char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                            int offsetBefore = 3393 - TextUtils.getOffsetBefore("", i77);
                                            int threadPriority = 9 - ((Process.getThreadPriority(i77) + 20) >> 6);
                                            byte[] bArr7 = $$d;
                                            Object[] objArr35 = new Object[1];
                                            e((byte) (bArr7[7] - 1), (byte) (-bArr7[51]), bArr7[37], objArr35);
                                            String str14 = (String) objArr35[0];
                                            Class[] clsArr2 = {String.class, Integer.TYPE};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, offsetBefore, threadPriority, 1203525406, false, str14, clsArr2);
                                            r29 = str14;
                                            clsArr = clsArr2;
                                        } else {
                                            r29 = r29;
                                            clsArr = clsArr;
                                        }
                                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr34)).longValue();
                                        long j7 = 43760473;
                                        i60 = i86;
                                        r23 = i107;
                                        long j8 = 520;
                                        obj2 = objInvoke;
                                        i54 = i94;
                                        long j9 = -1;
                                        long j10 = j7 ^ j9;
                                        long j11 = jLongValue3 ^ j9;
                                        long jNextInt = new Random().nextInt(966227686);
                                        long j12 = jNextInt ^ j9;
                                        long j13 = (((long) (-519)) * j7) + (((long) 521) * jLongValue3) + (((((j10 | j11) | j12) ^ j9) | ((jLongValue3 | jNextInt) ^ j9)) * j8);
                                        long j14 = (jNextInt | j7) ^ j9;
                                        long j15 = j13 + (((long) (-1040)) * (((j11 | j12) ^ j9) | j14)) + (j8 * (j14 | ((j11 | j7) ^ j9) | ((j10 | j12) ^ j9))) + ((long) (-45830350));
                                        i53 = i50;
                                        int i108 = ((int) (j15 >> 32)) & (((~(1750281138 | i53)) * TypedValues.CycleType.TYPE_EASING) + 1437442710 + (((~(i54 | 1750281138)) | 1750280624) * TypedValues.CycleType.TYPE_EASING));
                                        int i109 = ((int) j15) & (617298657 + (((~((-137651717) | i53)) | (-1299574694)) * (-756)) + (((-137651717) | i54) * 756));
                                        if (((i108 & i109) | (i108 ^ i109)) == -725904754) {
                                            i61 = 1;
                                            break;
                                        }
                                        int i110 = ((r23 | (-90)) << 1) - (r23 ^ (-90));
                                        i107 = (i110 ^ 91) + ((i110 & 91) << 1);
                                        i76 = i53;
                                        i86 = i60;
                                        i94 = i54;
                                        objInvoke = obj2;
                                        str13 = str13;
                                        length2 = length2;
                                        c2 = 1;
                                        i77 = 0;
                                    } catch (Throwable th6) {
                                        Throwable cause3 = th6.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th6;
                                    }
                                }
                                i62 = (~(i53 & 20)) & (i53 | 20);
                                int i1110 = -i61;
                                int i1111 = ((i61 & i1110) | (i61 ^ i1110)) >> 31;
                                int i1112 = (~i1111) & i53;
                                int i1113 = i1111 & i62;
                                i63 = (i1113 & i1112) | (i1112 ^ i1113);
                                byte[] bArr16 = $$a;
                                byte b110 = (byte) (bArr16[0] - 1);
                                byte b210 = bArr16[28];
                                Object[] objArr310 = new Object[1];
                                d(b110, b210, b210, objArr310);
                                Class<?> cls18 = Class.forName((String) objArr310[0]);
                                byte b211 = bArr16[58];
                                byte b212 = bArr16[13];
                                Object[] objArr311 = new Object[1];
                                d(b211, b212, (byte) (b212 | 32), objArr311);
                                Field field3 = cls18.getField((String) objArr311[0]);
                                obj3 = obj2;
                                str9 = (String) field3.get(obj3);
                                int length5 = str9.length();
                                i64 = (length5 ^ (-6)) + ((length5 & (-6)) << 1);
                                if (i64 >= 0) {
                                    i65 = i63;
                                    i66 = i62;
                                    obj4 = obj3;
                                    i67 = iIndexOf;
                                    i68 = 0;
                                    r24 = r23;
                                    r210 = r29;
                                    break;
                                }
                                i72 = 0;
                                while (true) {
                                    if (i72 <= i64) {
                                        str11 = str9;
                                        obj3 = obj3;
                                        r23 = r23;
                                        r29 = r29;
                                        i65 = i63;
                                        i66 = i62;
                                        obj4 = obj3;
                                        i67 = iIndexOf;
                                        i68 = 0;
                                        r24 = r23;
                                        r210 = r29;
                                        break;
                                    }
                                    str11 = str9;
                                    obj3 = obj3;
                                    r23 = r23;
                                    r29 = r29;
                                    Object[] objArr312 = {str11.substring(i72, (i72 & 6) + (i72 | 6)), 931995};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                        char cRed2 = (char) Color.red(0);
                                        int i1114 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3392;
                                        int doubleTapTimeout3 = 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        byte[] bArr17 = $$d;
                                        Object[] objArr313 = new Object[1];
                                        e((byte) (bArr17[7] - 1), (byte) (-bArr17[51]), bArr17[37], objArr313);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cRed2, i1114, doubleTapTimeout3, 1203525406, false, (String) objArr313[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr312)).longValue();
                                    long j110 = 536137310;
                                    i73 = i64;
                                    i67 = iIndexOf;
                                    obj5 = obj3;
                                    long j111 = -1;
                                    j6 = j110 ^ j111;
                                    i65 = i63;
                                    i66 = i62;
                                    long j112 = i53;
                                    long j113 = (((long) 236) * j110) + (((long) 471) * jLongValue5) + (((long) (-235)) * (jLongValue5 | ((j6 | (j112 ^ j111)) ^ j111))) + (((long) (-470)) * (jLongValue5 | ((j6 | j112) ^ j111))) + (((long) 235) * (((j112 | (j6 | jLongValue5)) ^ j111) | (((jLongValue5 ^ j111) | j110) ^ j111))) + ((long) (-538207187));
                                    int iNextInt2 = new Random().nextInt(2022844956);
                                    i74 = ((int) (j113 >> 32)) & ((-1267431344) + (((~((-1033591110) | iNextInt2)) | 403635301) * (-366)) + (((~(iNextInt2 | (-630259969))) | 304160) * 366));
                                    int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                    i75 = ((int) j113) & ((((~((~iUptimeMillis2) | 1878458235)) * 130) - 212190037) + (((~(iUptimeMillis2 | 1878458235)) | 18895121) * 130));
                                    if (((i74 & i75) | (i74 ^ i75)) == -2096167706) {
                                        i68 = 1;
                                        r24 = str11;
                                        obj4 = obj5;
                                        r210 = j6;
                                        break;
                                    }
                                    i72++;
                                    iIndexOf = i67;
                                    str11 = str11;
                                    i64 = i73;
                                    obj3 = obj5;
                                    i62 = i66;
                                    i63 = i65;
                                    r23 = str11;
                                    r29 = j6;
                                }
                                int i1115 = -i68;
                                int i1116 = ((i68 & i1115) | (i68 ^ i1115)) >> 31;
                                int i1117 = (~i1116) & i53;
                                int i1118 = i66 & i1116;
                                int i1210 = (i1118 & i1117) | (i1117 ^ i1118);
                                int i1211 = i53 ^ i65;
                                int i1212 = -i1211;
                                int i1213 = ((i1211 & i1212) | (i1211 ^ i1212)) >> 31;
                                int i1214 = i1210 & (~i1213);
                                int i1215 = i65 & i1213;
                                int i1216 = (i1214 & i1215) | (i1214 ^ i1215);
                                byte[] bArr18 = $$a;
                                byte b213 = (byte) (bArr18[0] - 1);
                                byte b214 = bArr18[28];
                                Object[] objArr410 = new Object[1];
                                d(b213, b214, b214, objArr410);
                                Class<?> cls19 = Class.forName((String) objArr410[0]);
                                byte b215 = bArr18[58];
                                byte b216 = bArr18[13];
                                Object[] objArr411 = new Object[1];
                                d(b215, b216, (byte) (b216 | 32), objArr411);
                                Field field4 = cls19.getField((String) objArr411[0]);
                                Object obj7 = obj4;
                                String str18 = (String) field4.get(obj7);
                                int i1217 = i67;
                                int i1218 = ~i1217;
                                int i1219 = -i1218;
                                int i1310 = i1217 & (((i1218 & i1219) | (i1218 ^ i1219)) >> 31);
                                i69 = 0;
                                String strSubstring3 = str18.substring(0, i1310);
                                int i1311 = -View.MeasureSpec.getSize(0);
                                char mirror2 = AndroidCharacter.getMirror('0');
                                Object[] objArr412 = new Object[1];
                                c((i1311 ^ 1) + ((i1311 & 1) << 1), new char[]{13800}, (byte) ((mirror2 & 3) + (mirror2 | 3)), objArr412);
                                String[] strArrSplit3 = strSubstring3.split((String) objArr412[0]);
                                int length6 = strArrSplit3.length;
                                i70 = 0;
                                r2 = i1216;
                                r25 = strArrSplit3;
                                r4 = obj7;
                                r5 = length6;
                                r25 = r24;
                                r27 = obj4;
                                r212 = r210;
                                r211 = clsArr;
                                while (i70 < r5) {
                                    r8 = r25[i70];
                                    int i1312 = -TextUtils.lastIndexOf("", '0', i69);
                                    int i1313 = i1312 * 217;
                                    int i1314 = (i1313 & (-430)) + (i1313 | (-430));
                                    int i1315 = (~((i1312 ^ i53) | (i1312 & i53))) * 216;
                                    int i1316 = (i1314 ^ i1315) + ((i1315 & i1314) << 1);
                                    int i1317 = (i1312 ^ (-3)) | (i1312 & (-3));
                                    int i1318 = (i1316 - (~(-(-(((i1317 & i54) | (i1317 ^ i54)) * (-216)))))) - 1;
                                    int i1319 = ~((i54 & i1312) | (i54 ^ i1312));
                                    int i1410 = -(-KeyEvent.getDeadChar(0, 0));
                                    objArr22 = new Object[1];
                                    c((i1318 - (~(-(-(((i1319 & 2) | (i1319 ^ 2)) * 216))))) - 1, new char[]{23, 0, 13864}, (byte) (((i1410 | 97) << 1) - (i1410 ^ 97)), objArr22);
                                    if (r8.split((String) objArr22[0]).length > 1) {
                                        synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.red(0), 2267 - Drawable.resolveOpacity(0, 0), (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 32))) {
                                            try {
                                                try {
                                                    Object[] objArr413 = new Object[1];
                                                    a(null, null, 126 - (~(-TextUtils.getTrimmedLength(""))), new byte[]{-107, -118, -115, -127, -113, -120, -127, -110, -109, -119, -107, -122, -108, -109, -111, -110}, objArr413);
                                                    String str19 = (String) objArr413[0];
                                                    try {
                                                        try {
                                                            Runtime runtime2 = Runtime.getRuntime();
                                                            int i1411 = -Color.blue(0);
                                                            int i1412 = (i1411 ^ 2) + ((i1411 & 2) << 1);
                                                            char[] cArr6 = {Typography.dollar, 20};
                                                            int i1413 = -KeyEvent.getDeadChar(0, 0);
                                                            Object[] objArr414 = new Object[1];
                                                            c(i1412, cArr6, (byte) ((i1413 ^ 75) + ((i1413 & 75) << 1)), objArr414);
                                                            processExec = runtime2.exec((String) objArr414[0], (String[]) null, (File) null);
                                                            try {
                                                                Object[] objArr415 = {processExec.getInputStream()};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2142 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 45 - Color.argb(0, 0, 0, 0), -1020714777, false, null, new Class[]{InputStream.class});
                                                                }
                                                                Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).newInstance(objArr415);
                                                                try {
                                                                    Object[] objArr416 = {processExec.getErrorStream()};
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                                        try {
                                                                            try {
                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2143 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 45 - View.MeasureSpec.getMode(0), -1020714777, false, null, new Class[]{InputStream.class});
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                boolean z7 = r2 == true ? 1 : 0;
                                                                                Throwable th8 = th;
                                                                                Throwable cause4 = th8.getCause();
                                                                                if (cause4 != null) {
                                                                                    throw cause4;
                                                                                }
                                                                                throw th8;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                        }
                                                                    }
                                                                    Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).newInstance(objArr416);
                                                                    try {
                                                                        DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                                                        try {
                                                                            byte[] bArr19 = $$a;
                                                                            r27 = r5;
                                                                            try {
                                                                                r212 = r4;
                                                                                r211 = i70;
                                                                                try {
                                                                                    Object[] objArr417 = new Object[1];
                                                                                    d(bArr19[54], bArr19[58], bArr19[34], objArr417);
                                                                                    Class<?> cls110 = Class.forName((String) objArr417[0]);
                                                                                    byte b217 = bArr19[13];
                                                                                    byte b218 = (byte) (-bArr19[35]);
                                                                                    byte b219 = (byte) (b218 | 48);
                                                                                    z6 = r2 == true ? 1 : 0;
                                                                                    try {
                                                                                        Object[] objArr418 = new Object[1];
                                                                                        d(b217, b218, b219, objArr418);
                                                                                        cls110.getMethod((String) objArr418[0], null).invoke(objNewInstance3, null);
                                                                                        try {
                                                                                            Object[] objArr419 = new Object[1];
                                                                                            d(bArr19[54], bArr19[58], bArr19[34], objArr419);
                                                                                            Class<?> cls111 = Class.forName((String) objArr419[0]);
                                                                                            byte b37 = bArr19[13];
                                                                                            byte b38 = (byte) (-bArr19[35]);
                                                                                            Object[] objArr510 = new Object[1];
                                                                                            d(b37, b38, (byte) (b38 | 48), objArr510);
                                                                                            cls111.getMethod((String) objArr510[0], null).invoke(objNewInstance4, null);
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                                        sb5.append(str19);
                                                                                                        int i1414 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                                        Object[] objArr511 = new Object[1];
                                                                                                        c(0 - (~(-(-Color.alpha(0)))), new char[]{13799}, (byte) ((i1414 & 88) + (i1414 | 88)), objArr511);
                                                                                                        sb5.append((String) objArr511[0]);
                                                                                                        String string4 = sb5.toString();
                                                                                                        int i1415 = -ImageFormat.getBitsPerPixel(0);
                                                                                                        Object[] objArr512 = new Object[1];
                                                                                                        c(5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{'.', '-', '\b', 5, 13756}, (byte) ((i1415 & 25) + (i1415 | 25)), objArr512);
                                                                                                        dataOutputStream2.write(string4.getBytes((String) objArr512[0]));
                                                                                                        dataOutputStream2.flush();
                                                                                                        int i1416 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                                                        int i1417 = i1416 * (-209);
                                                                                                        int i1418 = ((i1417 | (-1045)) << 1) - (i1417 ^ (-1045));
                                                                                                        int i1419 = ~i1416;
                                                                                                        int i1510 = (i1418 - (~((~((i1419 & (-6)) | (i1419 ^ (-6)))) * 210))) - 1;
                                                                                                        int i1511 = ~(((-6) ^ i60) | ((-6) & i60));
                                                                                                        int i1512 = ~i1416;
                                                                                                        int i1513 = ~(i1512 | i53);
                                                                                                        int i1514 = (i1510 - (~(-(-(((i1511 & i1513) | (i1511 ^ i1513)) * 210))))) - 1;
                                                                                                        int i1515 = i1512 | i54;
                                                                                                        int i1516 = ~((i1515 & 5) | (i1515 ^ 5));
                                                                                                        int i1517 = i1416 | (-6);
                                                                                                        int i1518 = ~((i1517 & i53) | (i1517 ^ i53));
                                                                                                        int i1519 = i1516 ^ i1518;
                                                                                                        int i1610 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                                        int i1611 = (i1610 * (-963)) - 964;
                                                                                                        Object[] objArr513 = new Object[1];
                                                                                                        c(i1514 + (((i1518 & i1516) | i1519) * 210), new char[]{25, 5, 21, '\r', 13810}, (byte) ((((((i1611 | 93605) << 1) - (i1611 ^ 93605)) - (~(((~i1610) | (~(((-98) & i53) | ((-98) ^ i53)))) * (-964)))) - 1) + (((~(i1610 | (-98))) | (~(((-98) ^ i60) | ((-98) & i60)))) * (-964))), objArr513);
                                                                                                        String str110 = (String) objArr513[0];
                                                                                                        int iIndexOf3 = TextUtils.indexOf("", "");
                                                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                                                                        int i1612 = (iIndexOf3 * 370) + 1850;
                                                                                                        int i1613 = (iIndexOf3 ^ 5) | (iIndexOf3 & 5);
                                                                                                        int i1614 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                                        int i1615 = ((i1613 & i1614) | (i1613 ^ i1614)) * (-369);
                                                                                                        int i1616 = (i1612 & i1615) + (i1612 | i1615);
                                                                                                        int i1617 = ~iIndexOf3;
                                                                                                        int i1618 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | i1617);
                                                                                                        int i1619 = i1616 + (((i1618 ^ 5) | (i1618 & 5)) * (-369));
                                                                                                        int i1710 = (~(iIndexOf3 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6)) | (~(((-6) ^ iIndexOf3) | ((-6) & iIndexOf3)));
                                                                                                        int i1711 = ~(i1617 | i1614 | 5);
                                                                                                        int i1712 = ((i1710 & i1711) | (i1710 ^ i1711)) * 369;
                                                                                                        int i1713 = -(Process.myPid() >> 22);
                                                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                                                                        int i1714 = i1713 * (-751);
                                                                                                        int i1715 = (i1714 & (-19526)) + (i1714 | (-19526));
                                                                                                        int i1716 = ~i1713;
                                                                                                        int i1717 = ~((i1716 ^ (-27)) | (i1716 & (-27)));
                                                                                                        int i1718 = ~((i1716 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i1716 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                                                        int i1719 = (i1715 - (~(-(-(((i1717 ^ i1718) | (i1718 & i1717)) * 1504))))) - 1;
                                                                                                        int i1810 = ~i1713;
                                                                                                        int i1811 = (i1810 & 26) | (i1810 ^ 26);
                                                                                                        int i1812 = -(-((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault7 | i1811)) * (-1504)));
                                                                                                        int i1813 = (i1719 ^ i1812) + ((i1812 & i1719) << 1);
                                                                                                        int i1814 = ~i1811;
                                                                                                        int i1815 = ~((i1713 & (-27)) | ((-27) ^ i1713));
                                                                                                        int i1816 = ((i1815 & i1814) | (i1814 ^ i1815)) * 752;
                                                                                                        Object[] objArr514 = new Object[1];
                                                                                                        c(((i1619 | i1712) << 1) - (i1712 ^ i1619), new char[]{'.', '-', '\b', 5, 13756}, (byte) ((i1813 ^ i1816) + ((i1816 & i1813) << 1)), objArr514);
                                                                                                        dataOutputStream2.write(str110.getBytes((String) objArr514[0]));
                                                                                                        dataOutputStream2.flush();
                                                                                                        try {
                                                                                                            long jNanoTime2 = System.nanoTime();
                                                                                                            long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                            r9 = r8;
                                                                                                            while (true) {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        processExec.exitValue();
                                                                                                                        r32 = r9;
                                                                                                                        break;
                                                                                                                    } catch (IllegalThreadStateException unused2) {
                                                                                                                        if (nanos2 > 0) {
                                                                                                                            ?? r6 = r9;
                                                                                                                            try {
                                                                                                                                Object[] objArr55 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos2) + 1, 3L))};
                                                                                                                                byte[] bArr12 = $$a;
                                                                                                                                r31 = r6;
                                                                                                                                Object[] objArr56 = new Object[1];
                                                                                                                                d(bArr12[54], bArr12[58], bArr12[34], objArr56);
                                                                                                                                Class<?> cls15 = Class.forName((String) objArr56[0]);
                                                                                                                                Object[] objArr57 = new Object[1];
                                                                                                                                d(bArr12[13], (byte) (-bArr12[35]), (byte) 58, objArr57);
                                                                                                                                cls15.getMethod((String) objArr57[0], Long.TYPE).invoke(null, objArr55);
                                                                                                                            } catch (Throwable th10) {
                                                                                                                                Throwable cause5 = th10.getCause();
                                                                                                                                if (cause5 != null) {
                                                                                                                                    throw cause5;
                                                                                                                                }
                                                                                                                                throw th10;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            r31 = r9;
                                                                                                                        }
                                                                                                                        nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime2);
                                                                                                                        r32 = r31;
                                                                                                                        if (nanos2 <= 0) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        r9 = r31;
                                                                                                                    }
                                                                                                                } catch (InterruptedException e2) {
                                                                                                                    throw e2;
                                                                                                                } catch (Throwable th11) {
                                                                                                                    th5 = th11;
                                                                                                                    try {
                                                                                                                        processExec.destroy();
                                                                                                                        throw th5;
                                                                                                                    } catch (Exception unused3) {
                                                                                                                        throw th5;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                dataOutputStream2.close();
                                                                                                            } catch (IOException unused4) {
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    byte[] bArr110 = $$a;
                                                                                                                    Object[] objArr515 = new Object[1];
                                                                                                                    d(bArr110[54], bArr110[58], bArr110[34], objArr515);
                                                                                                                    Class<?> cls112 = Class.forName((String) objArr515[0]);
                                                                                                                    byte b39 = (byte) 62;
                                                                                                                    Object[] objArr516 = new Object[1];
                                                                                                                    d(bArr110[28], bArr110[58], b39, objArr516);
                                                                                                                    cls112.getMethod((String) objArr516[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                                                                                                    try {
                                                                                                                        Object[] objArr69 = new Object[1];
                                                                                                                        d(bArr110[54], bArr110[58], bArr110[34], objArr69);
                                                                                                                        Class<?> cls113 = Class.forName((String) objArr69[0]);
                                                                                                                        Object[] objArr610 = new Object[1];
                                                                                                                        d(bArr110[28], bArr110[58], b39, objArr610);
                                                                                                                        cls113.getMethod((String) objArr610[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                                                                                                        try {
                                                                                                                            processExec.destroy();
                                                                                                                            while (true) {
                                                                                                                                if (i71 < length) {
                                                                                                                                    str10 = strArrSplit[i71];
                                                                                                                                    int i1817 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                                                                    int i1818 = ~i1817;
                                                                                                                                    int i1819 = (((i1817 * (-209)) - 3762) - (~(-(-((~((i1818 & (-19)) | (i1818 ^ (-19)))) * 210))))) - 1;
                                                                                                                                    int i1910 = ~(((-19) ^ i54) | ((-19) & i54));
                                                                                                                                    int i1911 = ~i1817;
                                                                                                                                    int i1912 = ~((i1911 ^ i53) | (i1911 & i53));
                                                                                                                                    int i1913 = -(-(((i1910 & i1912) | (i1910 ^ i1912)) * 210));
                                                                                                                                    int i1914 = (i1817 & (-19)) | ((-19) ^ i1817);
                                                                                                                                    int i1915 = (((i1819 ^ i1913) + ((i1819 & i1913) << 1)) - (~(-(-(((~((i1914 & i53) | (i1914 ^ i53))) | (~(((i1911 ^ i54) | (i1911 & i54)) | 18))) * 210))))) - 1;
                                                                                                                                    try {
                                                                                                                                        int i1916 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                                                                        byte b310 = (byte) ((i1916 ^ 78) + ((i1916 & 78) << 1));
                                                                                                                                        objArr23 = new Object[1];
                                                                                                                                        c(i1915, new char[]{19, '-', '+', 29, '.', '(', 24, '\f', '\'', 29, 4, 3, '.', '\'', '\'', '.', 5, 27, 13826}, b310, objArr23);
                                                                                                                                        if (str10.startsWith((String) objArr23[0])) {
                                                                                                                                            r7 = r33;
                                                                                                                                        } else {
                                                                                                                                            int i1917 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                                                                                            int i1918 = (i1917 * 141) - 35433;
                                                                                                                                            int i1919 = -(-(((i53 ^ 127) | (i53 & 127)) * 140));
                                                                                                                                            int i2010 = (i1918 & i1919) + (i1918 | i1919);
                                                                                                                                            int i2011 = ~i1917;
                                                                                                                                            int i2012 = (i2011 & 127) | (i2011 ^ 127);
                                                                                                                                            int i2013 = ~i2012;
                                                                                                                                            int i2014 = ~((i54 ^ 127) | (i54 & 127));
                                                                                                                                            int i2015 = ((i2013 & i2014) | (i2013 ^ i2014)) * (-280);
                                                                                                                                            int i2016 = (i2010 & i2015) + (i2015 | i2010);
                                                                                                                                            int i2017 = ~(((-128) & i1917) | ((-128) ^ i1917));
                                                                                                                                            int i2018 = ~((i60 & i1917) | (i60 ^ i1917));
                                                                                                                                            int i2019 = (i2018 & i2017) | (i2017 ^ i2018);
                                                                                                                                            int i2111 = ~((i2012 & i53) | (i2012 ^ i53));
                                                                                                                                            int i2112 = ((i2019 & i2111) | (i2019 ^ i2111)) * 140;
                                                                                                                                            objArr24 = new Object[1];
                                                                                                                                            a(null, null, (i2016 & i2112) + (i2112 | i2016), new byte[]{-121, -125, -122, -123, -124, -125, -126, -127, -121, -111, -123, -120, -106, -118, -115, -127, -113, -120, -127, -110}, objArr24);
                                                                                                                                            if (str10.startsWith((String) objArr24[0])) {
                                                                                                                                                r7 = r33;
                                                                                                                                            } else {
                                                                                                                                                int i2113 = -(-View.getDefaultSize(0, 0));
                                                                                                                                                objArr25 = new Object[1];
                                                                                                                                                a(null, null, ((i2113 | 127) << 1) - (i2113 ^ 127), new byte[]{-106, -118, -115, -127, -113, -120, -127, -110}, objArr25);
                                                                                                                                                if (str10.startsWith((String) objArr25[0])) {
                                                                                                                                                    Object[] objArr614 = new Object[1];
                                                                                                                                                    a(null, null, 126 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), new byte[]{-106}, objArr614);
                                                                                                                                                    Split = str10.split((String) objArr614[0]);
                                                                                                                                                    if (Split.length > 1) {
                                                                                                                                                        r7 = r33;
                                                                                                                                                        if (Split[1].equalsIgnoreCase(r7)) {
                                                                                                                                                            boolean z17 = z6 ? 1 : 0;
                                                                                                                                                            int i2114 = ((~(z17 ? 1 : 0)) & i53) | ((z17 ? 1 : 0) & i54);
                                                                                                                                                            int i2115 = -i2114;
                                                                                                                                                            int i2116 = ((i2114 & i2115) | (i2114 ^ i2115)) >> 31;
                                                                                                                                                            int i2117 = ((i53 & (-21)) | (i54 & 20)) & (~i2116);
                                                                                                                                                            int i2118 = i2116 & (z17 ? 1 : 0);
                                                                                                                                                            r3 = (i2117 & i2118) | (i2117 ^ i2118);
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        r7 = r33;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    r7 = r33;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        int i2119 = i71 - 38;
                                                                                                                                        i71 = ((i2119 | 39) << 1) - (i2119 ^ 39);
                                                                                                                                        r33 = r7;
                                                                                                                                        z6 = z6 ? 1 : 0;
                                                                                                                                    } catch (IOException unused5) {
                                                                                                                                        r8 = z6 ? 1 : 0;
                                                                                                                                        r3 = r8;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    r8 = z6;
                                                                                                                                    r25 = r25;
                                                                                                                                    r27 = r27;
                                                                                                                                    r212 = r212;
                                                                                                                                    r211 = r211;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (Exception unused6) {
                                                                                                                        }
                                                                                                                        StringBuilder sb6 = new StringBuilder();
                                                                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                                                                                            char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                                                                            int bitsPerPixel2 = 2141 - ImageFormat.getBitsPerPixel(0);
                                                                                                                            int i2110 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45;
                                                                                                                            byte[] bArr111 = $$d;
                                                                                                                            Object[] objArr611 = new Object[1];
                                                                                                                            e(bArr111[7], (byte) (-bArr111[15]), bArr111[37], objArr611);
                                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength2, bitsPerPixel2, i2110, 399405187, false, (String) objArr611[0], null);
                                                                                                                        }
                                                                                                                        sb6.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(objNewInstance3).toString());
                                                                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                                                                                            char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                                                                            int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 2142;
                                                                                                                            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45;
                                                                                                                            byte[] bArr112 = $$d;
                                                                                                                            Object[] objArr612 = new Object[1];
                                                                                                                            e(bArr112[7], (byte) (-bArr112[15]), bArr112[37], objArr612);
                                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollBarFadeDuration3, iResolveOpacity3, maximumFlingVelocity2, 399405187, false, (String) objArr612[0], null);
                                                                                                                        }
                                                                                                                        sb6.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(objNewInstance4).toString());
                                                                                                                        String string5 = sb6.toString();
                                                                                                                        int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                                                                                        Object[] objArr613 = new Object[1];
                                                                                                                        c(((keyRepeatTimeout2 | 1) << 1) - (keyRepeatTimeout2 ^ 1), new char[]{13799}, (byte) (87 - (~(-(-MotionEvent.axisFromString(""))))), objArr613);
                                                                                                                        strArrSplit = string5.split((String) objArr613[0]);
                                                                                                                        length = strArrSplit.length;
                                                                                                                        i71 = 0;
                                                                                                                        z6 = z6;
                                                                                                                        r33 = r32;
                                                                                                                    } catch (Throwable th12) {
                                                                                                                        Throwable cause6 = th12.getCause();
                                                                                                                        if (cause6 != null) {
                                                                                                                            throw cause6;
                                                                                                                        }
                                                                                                                        throw th12;
                                                                                                                    }
                                                                                                                } catch (InterruptedException e3) {
                                                                                                                    e = e3;
                                                                                                                    throw e;
                                                                                                                }
                                                                                                            } catch (Throwable th13) {
                                                                                                                Throwable cause7 = th13.getCause();
                                                                                                                if (cause7 != null) {
                                                                                                                    throw cause7;
                                                                                                                }
                                                                                                                throw th13;
                                                                                                            }
                                                                                                        } catch (InterruptedException e4) {
                                                                                                            e = e4;
                                                                                                        } catch (Throwable th14) {
                                                                                                            th = th14;
                                                                                                            th5 = th;
                                                                                                            processExec.destroy();
                                                                                                            throw th5;
                                                                                                        }
                                                                                                    } catch (Exception unused7) {
                                                                                                        int i224 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                                        int i225 = ((i224 | 28) << 1) - (i224 ^ 28);
                                                                                                        char[] cArr5 = {19, 5, Typography.quote, '\r', 23, '!', 21, '\t', 30, 25, ')', 15, '!', 5, '\f', 21, 26, ',', 24, 16, 18, Typography.quote, '(', 22, 13821, 13821, 13768};
                                                                                                        int iGreen3 = Color.green(0);
                                                                                                        byte b36 = (byte) (((iGreen3 | 20) << 1) - (iGreen3 ^ 20));
                                                                                                        Object[] objArr68 = new Object[1];
                                                                                                        c(i225, cArr5, b36, objArr68);
                                                                                                        throw new IOException((String) objArr68[0]);
                                                                                                    }
                                                                                                } catch (IOException unused8) {
                                                                                                }
                                                                                            } catch (Throwable th15) {
                                                                                                th = th15;
                                                                                            }
                                                                                        } catch (Throwable th16) {
                                                                                            Throwable cause8 = th16.getCause();
                                                                                            if (cause8 != null) {
                                                                                                throw cause8;
                                                                                            }
                                                                                            throw th16;
                                                                                        }
                                                                                    } catch (Throwable th17) {
                                                                                        th = th17;
                                                                                        th4 = th;
                                                                                        cause2 = th4.getCause();
                                                                                        if (cause2 != null) {
                                                                                            throw cause2;
                                                                                        }
                                                                                        throw th4;
                                                                                    }
                                                                                } catch (Throwable th18) {
                                                                                    th = th18;
                                                                                    boolean z9 = r2 == true ? 1 : 0;
                                                                                }
                                                                            } catch (Throwable th19) {
                                                                                th = th19;
                                                                                boolean z10 = r2 == true ? 1 : 0;
                                                                                th4 = th;
                                                                                cause2 = th4.getCause();
                                                                                if (cause2 != null) {
                                                                                    throw cause2;
                                                                                }
                                                                                throw th4;
                                                                            }
                                                                        } catch (Throwable th20) {
                                                                            th = th20;
                                                                            boolean z11 = r2 == true ? 1 : 0;
                                                                        }
                                                                    } catch (IOException unused9) {
                                                                        r26 = r25;
                                                                        r212 = r4;
                                                                        r27 = r5;
                                                                        r211 = i70;
                                                                        r8 = r2;
                                                                        r25 = r26;
                                                                    } catch (Exception unused10) {
                                                                        boolean z12 = r2 == true ? 1 : 0;
                                                                        int i226 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                        int i227 = ((i226 | 28) << 1) - (i226 ^ 28);
                                                                        char[] cArr7 = {19, 5, Typography.quote, '\r', 23, '!', 21, '\t', 30, 25, ')', 15, '!', 5, '\f', 21, 26, ',', 24, 16, 18, Typography.quote, '(', 22, 13821, 13821, 13768};
                                                                        int iGreen4 = Color.green(0);
                                                                        byte b311 = (byte) (((iGreen4 | 20) << 1) - (iGreen4 ^ 20));
                                                                        Object[] objArr615 = new Object[1];
                                                                        c(i227, cArr7, b311, objArr615);
                                                                        throw new IOException((String) objArr615[0]);
                                                                    }
                                                                } catch (Throwable th21) {
                                                                    th = th21;
                                                                    boolean z13 = r2 == true ? 1 : 0;
                                                                }
                                                            } catch (Throwable th22) {
                                                                boolean z14 = r2 == true ? 1 : 0;
                                                                Throwable cause9 = th22.getCause();
                                                                if (cause9 != null) {
                                                                    throw cause9;
                                                                }
                                                                throw th22;
                                                            }
                                                        } catch (Exception unused11) {
                                                            boolean z15 = r2 == true ? 1 : 0;
                                                        }
                                                    } catch (Exception unused12) {
                                                        int i228 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                        int i229 = ((i228 | 28) << 1) - (i228 ^ 28);
                                                        char[] cArr8 = {19, 5, Typography.quote, '\r', 23, '!', 21, '\t', 30, 25, ')', 15, '!', 5, '\f', 21, 26, ',', 24, 16, 18, Typography.quote, '(', 22, 13821, 13821, 13768};
                                                        int iGreen5 = Color.green(0);
                                                        byte b312 = (byte) (((iGreen5 | 20) << 1) - (iGreen5 ^ 20));
                                                        Object[] objArr616 = new Object[1];
                                                        c(i229, cArr8, b312, objArr616);
                                                        throw new IOException((String) objArr616[0]);
                                                    }
                                                } catch (IOException unused13) {
                                                    r26 = r25;
                                                }
                                            } catch (IOException unused14) {
                                            }
                                        }
                                        i70 = (r211 == true ? 1 : 0) + 1;
                                        r25 = r25;
                                        r5 = r27;
                                        r4 = r212;
                                        i69 = 0;
                                        r2 = r3;
                                        r25 = r25;
                                        r27 = r27;
                                        r212 = r212;
                                        r211 = r211;
                                    } else {
                                        r8 = r2 == true ? 1 : 0;
                                        r25 = r25;
                                        r212 = r4;
                                        r27 = r5;
                                        r211 = i70;
                                    }
                                    r3 = r8;
                                    i70 = (r211 == true ? 1 : 0) + 1;
                                    r25 = r25;
                                    r5 = r27;
                                    r4 = r212;
                                    i69 = 0;
                                    r2 = r3;
                                    r25 = r25;
                                    r27 = r27;
                                    r212 = r212;
                                    r211 = r211;
                                }
                                boolean z18 = r2 == true ? 1 : 0;
                                r28 = r4;
                                r1 = r2;
                            } else {
                                i53 = i76;
                                obj2 = objInvoke;
                                i54 = i94;
                                i60 = i86;
                                i61 = 0;
                                i62 = (~(i53 & 20)) & (i53 | 20);
                                int i1119 = -i61;
                                int i11110 = ((i61 & i1119) | (i61 ^ i1119)) >> 31;
                                int i11111 = (~i11110) & i53;
                                int i11112 = i11110 & i62;
                                i63 = (i11112 & i11111) | (i11111 ^ i11112);
                                byte[] bArr113 = $$a;
                                byte b111 = (byte) (bArr113[0] - 1);
                                byte b2110 = bArr113[28];
                                Object[] objArr314 = new Object[1];
                                d(b111, b2110, b2110, objArr314);
                                Class<?> cls114 = Class.forName((String) objArr314[0]);
                                byte b2111 = bArr113[58];
                                byte b2112 = bArr113[13];
                                Object[] objArr315 = new Object[1];
                                d(b2111, b2112, (byte) (b2112 | 32), objArr315);
                                Field field5 = cls114.getField((String) objArr315[0]);
                                obj3 = obj2;
                                str9 = (String) field5.get(obj3);
                                int length7 = str9.length();
                                i64 = (length7 ^ (-6)) + ((length7 & (-6)) << 1);
                                if (i64 >= 0) {
                                    i65 = i63;
                                    i66 = i62;
                                    obj4 = obj3;
                                    i67 = iIndexOf;
                                    i68 = 0;
                                    r24 = r23;
                                    r210 = r29;
                                    break;
                                }
                                i72 = 0;
                                while (true) {
                                    if (i72 <= i64) {
                                        str11 = str9;
                                        obj3 = obj3;
                                        r23 = r23;
                                        r29 = r29;
                                        i65 = i63;
                                        i66 = i62;
                                        obj4 = obj3;
                                        i67 = iIndexOf;
                                        i68 = 0;
                                        r24 = r23;
                                        r210 = r29;
                                        break;
                                    }
                                    str11 = str9;
                                    obj3 = obj3;
                                    r23 = r23;
                                    r29 = r29;
                                    Object[] objArr316 = {str11.substring(i72, (i72 & 6) + (i72 | 6)), 931995};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                        char cRed3 = (char) Color.red(0);
                                        int i11113 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3392;
                                        int doubleTapTimeout4 = 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        byte[] bArr114 = $$d;
                                        Object[] objArr317 = new Object[1];
                                        e((byte) (bArr114[7] - 1), (byte) (-bArr114[51]), bArr114[37], objArr317);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cRed3, i11113, doubleTapTimeout4, 1203525406, false, (String) objArr317[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr316)).longValue();
                                    long j114 = 536137310;
                                    i73 = i64;
                                    i67 = iIndexOf;
                                    obj5 = obj3;
                                    long j115 = -1;
                                    j6 = j114 ^ j115;
                                    i65 = i63;
                                    i66 = i62;
                                    long j116 = i53;
                                    long j117 = (((long) 236) * j114) + (((long) 471) * jLongValue6) + (((long) (-235)) * (jLongValue6 | ((j6 | (j116 ^ j115)) ^ j115))) + (((long) (-470)) * (jLongValue6 | ((j6 | j116) ^ j115))) + (((long) 235) * (((j116 | (j6 | jLongValue6)) ^ j115) | (((jLongValue6 ^ j115) | j114) ^ j115))) + ((long) (-538207187));
                                    int iNextInt3 = new Random().nextInt(2022844956);
                                    i74 = ((int) (j117 >> 32)) & ((-1267431344) + (((~((-1033591110) | iNextInt3)) | 403635301) * (-366)) + (((~(iNextInt3 | (-630259969))) | 304160) * 366));
                                    int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                                    i75 = ((int) j117) & ((((~((~iUptimeMillis3) | 1878458235)) * 130) - 212190037) + (((~(iUptimeMillis3 | 1878458235)) | 18895121) * 130));
                                    if (((i74 & i75) | (i74 ^ i75)) == -2096167706) {
                                        i68 = 1;
                                        r24 = str11;
                                        obj4 = obj5;
                                        r210 = j6;
                                        break;
                                    }
                                    i72++;
                                    iIndexOf = i67;
                                    str11 = str11;
                                    i64 = i73;
                                    obj3 = obj5;
                                    i62 = i66;
                                    i63 = i65;
                                    r23 = str11;
                                    r29 = j6;
                                }
                                int i11114 = -i68;
                                int i11115 = ((i68 & i11114) | (i68 ^ i11114)) >> 31;
                                int i11116 = (~i11115) & i53;
                                int i11117 = i66 & i11115;
                                int i12110 = (i11117 & i11116) | (i11116 ^ i11117);
                                int i12111 = i53 ^ i65;
                                int i12112 = -i12111;
                                int i12113 = ((i12111 & i12112) | (i12111 ^ i12112)) >> 31;
                                int i12114 = i12110 & (~i12113);
                                int i12115 = i65 & i12113;
                                int i12116 = (i12114 & i12115) | (i12114 ^ i12115);
                                byte[] bArr115 = $$a;
                                byte b2113 = (byte) (bArr115[0] - 1);
                                byte b2114 = bArr115[28];
                                Object[] objArr4110 = new Object[1];
                                d(b2113, b2114, b2114, objArr4110);
                                Class<?> cls115 = Class.forName((String) objArr4110[0]);
                                byte b2115 = bArr115[58];
                                byte b2116 = bArr115[13];
                                Object[] objArr4111 = new Object[1];
                                d(b2115, b2116, (byte) (b2116 | 32), objArr4111);
                                Field field6 = cls115.getField((String) objArr4111[0]);
                                Object obj8 = obj4;
                                String str111 = (String) field6.get(obj8);
                                int i12117 = i67;
                                int i12118 = ~i12117;
                                int i12119 = -i12118;
                                int i13110 = i12117 & (((i12118 & i12119) | (i12118 ^ i12119)) >> 31);
                                i69 = 0;
                                String strSubstring4 = str111.substring(0, i13110);
                                int i13111 = -View.MeasureSpec.getSize(0);
                                char mirror3 = AndroidCharacter.getMirror('0');
                                Object[] objArr4112 = new Object[1];
                                c((i13111 ^ 1) + ((i13111 & 1) << 1), new char[]{13800}, (byte) ((mirror3 & 3) + (mirror3 | 3)), objArr4112);
                                String[] strArrSplit4 = strSubstring4.split((String) objArr4112[0]);
                                int length8 = strArrSplit4.length;
                                i70 = 0;
                                r2 = i12116;
                                r25 = strArrSplit4;
                                r4 = obj8;
                                r5 = length8;
                                r25 = r24;
                                r27 = obj4;
                                r212 = r210;
                                r211 = clsArr;
                                while (i70 < r5) {
                                    r8 = r25[i70];
                                    int i13112 = -TextUtils.lastIndexOf("", '0', i69);
                                    int i13113 = i13112 * 217;
                                    int i13114 = (i13113 & (-430)) + (i13113 | (-430));
                                    int i13115 = (~((i13112 ^ i53) | (i13112 & i53))) * 216;
                                    int i13116 = (i13114 ^ i13115) + ((i13115 & i13114) << 1);
                                    int i13117 = (i13112 ^ (-3)) | (i13112 & (-3));
                                    int i13118 = (i13116 - (~(-(-(((i13117 & i54) | (i13117 ^ i54)) * (-216)))))) - 1;
                                    int i13119 = ~((i54 & i13112) | (i54 ^ i13112));
                                    int i14110 = -(-KeyEvent.getDeadChar(0, 0));
                                    objArr22 = new Object[1];
                                    c((i13118 - (~(-(-(((i13119 & 2) | (i13119 ^ 2)) * 216))))) - 1, new char[]{23, 0, 13864}, (byte) (((i14110 | 97) << 1) - (i14110 ^ 97)), objArr22);
                                    if (r8.split((String) objArr22[0]).length > 1) {
                                        synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.red(0), 2267 - Drawable.resolveOpacity(0, 0), (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 32))) {
                                            Object[] objArr4113 = new Object[1];
                                            a(null, null, 126 - (~(-TextUtils.getTrimmedLength(""))), new byte[]{-107, -118, -115, -127, -113, -120, -127, -110, -109, -119, -107, -122, -108, -109, -111, -110}, objArr4113);
                                            String str112 = (String) objArr4113[0];
                                            Runtime runtime3 = Runtime.getRuntime();
                                            int i14111 = -Color.blue(0);
                                            int i14112 = (i14111 ^ 2) + ((i14111 & 2) << 1);
                                            char[] cArr9 = {Typography.dollar, 20};
                                            int i14113 = -KeyEvent.getDeadChar(0, 0);
                                            Object[] objArr4114 = new Object[1];
                                            c(i14112, cArr9, (byte) ((i14113 ^ 75) + ((i14113 & 75) << 1)), objArr4114);
                                            processExec = runtime3.exec((String) objArr4114[0], (String[]) null, (File) null);
                                            Object[] objArr4115 = {processExec.getInputStream()};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2142 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 45 - Color.argb(0, 0, 0, 0), -1020714777, false, null, new Class[]{InputStream.class});
                                            }
                                            Object objNewInstance5 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).newInstance(objArr4115);
                                            Object[] objArr4116 = {processExec.getErrorStream()};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2143 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 45 - View.MeasureSpec.getMode(0), -1020714777, false, null, new Class[]{InputStream.class});
                                            }
                                            Object objNewInstance6 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).newInstance(objArr4116);
                                            DataOutputStream dataOutputStream3 = new DataOutputStream(processExec.getOutputStream());
                                            byte[] bArr116 = $$a;
                                            r27 = r5;
                                            r212 = r4;
                                            r211 = i70;
                                            Object[] objArr4117 = new Object[1];
                                            d(bArr116[54], bArr116[58], bArr116[34], objArr4117);
                                            Class<?> cls116 = Class.forName((String) objArr4117[0]);
                                            byte b2117 = bArr116[13];
                                            byte b2118 = (byte) (-bArr116[35]);
                                            byte b2119 = (byte) (b2118 | 48);
                                            z6 = r2 == true ? 1 : 0;
                                            Object[] objArr4118 = new Object[1];
                                            d(b2117, b2118, b2119, objArr4118);
                                            cls116.getMethod((String) objArr4118[0], null).invoke(objNewInstance5, null);
                                            Object[] objArr4119 = new Object[1];
                                            d(bArr116[54], bArr116[58], bArr116[34], objArr4119);
                                            Class<?> cls117 = Class.forName((String) objArr4119[0]);
                                            byte b313 = bArr116[13];
                                            byte b314 = (byte) (-bArr116[35]);
                                            Object[] objArr517 = new Object[1];
                                            d(b313, b314, (byte) (b314 | 48), objArr517);
                                            cls117.getMethod((String) objArr517[0], null).invoke(objNewInstance6, null);
                                            StringBuilder sb7 = new StringBuilder();
                                            sb7.append(str112);
                                            int i14114 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            Object[] objArr518 = new Object[1];
                                            c(0 - (~(-(-Color.alpha(0)))), new char[]{13799}, (byte) ((i14114 & 88) + (i14114 | 88)), objArr518);
                                            sb7.append((String) objArr518[0]);
                                            String string6 = sb7.toString();
                                            int i14115 = -ImageFormat.getBitsPerPixel(0);
                                            Object[] objArr519 = new Object[1];
                                            c(5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{'.', '-', '\b', 5, 13756}, (byte) ((i14115 & 25) + (i14115 | 25)), objArr519);
                                            dataOutputStream3.write(string6.getBytes((String) objArr519[0]));
                                            dataOutputStream3.flush();
                                            int i14116 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                            int i14117 = i14116 * (-209);
                                            int i14118 = ((i14117 | (-1045)) << 1) - (i14117 ^ (-1045));
                                            int i14119 = ~i14116;
                                            int i15110 = (i14118 - (~((~((i14119 & (-6)) | (i14119 ^ (-6)))) * 210))) - 1;
                                            int i15111 = ~(((-6) ^ i60) | ((-6) & i60));
                                            int i15112 = ~i14116;
                                            int i15113 = ~(i15112 | i53);
                                            int i15114 = (i15110 - (~(-(-(((i15111 & i15113) | (i15111 ^ i15113)) * 210))))) - 1;
                                            int i15115 = i15112 | i54;
                                            int i15116 = ~((i15115 & 5) | (i15115 ^ 5));
                                            int i15117 = i14116 | (-6);
                                            int i15118 = ~((i15117 & i53) | (i15117 ^ i53));
                                            int i15119 = i15116 ^ i15118;
                                            int i16110 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            int i16111 = (i16110 * (-963)) - 964;
                                            Object[] objArr5110 = new Object[1];
                                            c(i15114 + (((i15118 & i15116) | i15119) * 210), new char[]{25, 5, 21, '\r', 13810}, (byte) ((((((i16111 | 93605) << 1) - (i16111 ^ 93605)) - (~(((~i16110) | (~(((-98) & i53) | ((-98) ^ i53)))) * (-964)))) - 1) + (((~(i16110 | (-98))) | (~(((-98) ^ i60) | ((-98) & i60)))) * (-964))), objArr5110);
                                            String str113 = (String) objArr5110[0];
                                            int iIndexOf4 = TextUtils.indexOf("", "");
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            int i16112 = (iIndexOf4 * 370) + 1850;
                                            int i16113 = (iIndexOf4 ^ 5) | (iIndexOf4 & 5);
                                            int i16114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                            int i16115 = ((i16113 & i16114) | (i16113 ^ i16114)) * (-369);
                                            int i16116 = (i16112 & i16115) + (i16112 | i16115);
                                            int i16117 = ~iIndexOf4;
                                            int i16118 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | i16117);
                                            int i16119 = i16116 + (((i16118 ^ 5) | (i16118 & 5)) * (-369));
                                            int i17110 = (~(iIndexOf4 | iTuitionPaymentFragmentspecialinlinedviewModeldefault8)) | (~(((-6) ^ iIndexOf4) | ((-6) & iIndexOf4)));
                                            int i17111 = ~(i16117 | i16114 | 5);
                                            int i17112 = ((i17110 & i17111) | (i17110 ^ i17111)) * 369;
                                            int i17113 = -(Process.myPid() >> 22);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            int i17114 = i17113 * (-751);
                                            int i17115 = (i17114 & (-19526)) + (i17114 | (-19526));
                                            int i17116 = ~i17113;
                                            int i17117 = ~((i17116 ^ (-27)) | (i17116 & (-27)));
                                            int i17118 = ~((i17116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i17116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                            int i17119 = (i17115 - (~(-(-(((i17117 ^ i17118) | (i17118 & i17117)) * 1504))))) - 1;
                                            int i18110 = ~i17113;
                                            int i18111 = (i18110 & 26) | (i18110 ^ 26);
                                            int i18112 = -(-((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault9 | i18111)) * (-1504)));
                                            int i18113 = (i17119 ^ i18112) + ((i18112 & i17119) << 1);
                                            int i18114 = ~i18111;
                                            int i18115 = ~((i17113 & (-27)) | ((-27) ^ i17113));
                                            int i18116 = ((i18115 & i18114) | (i18114 ^ i18115)) * 752;
                                            Object[] objArr5111 = new Object[1];
                                            c(((i16119 | i17112) << 1) - (i17112 ^ i16119), new char[]{'.', '-', '\b', 5, 13756}, (byte) ((i18113 ^ i18116) + ((i18116 & i18113) << 1)), objArr5111);
                                            dataOutputStream3.write(str113.getBytes((String) objArr5111[0]));
                                            dataOutputStream3.flush();
                                            long jNanoTime3 = System.nanoTime();
                                            long nanos3 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                            r9 = r8;
                                            while (true) {
                                                processExec.exitValue();
                                                r32 = r9;
                                                break;
                                            }
                                            dataOutputStream3.close();
                                            byte[] bArr117 = $$a;
                                            Object[] objArr5112 = new Object[1];
                                            d(bArr117[54], bArr117[58], bArr117[34], objArr5112);
                                            Class<?> cls118 = Class.forName((String) objArr5112[0]);
                                            byte b315 = (byte) 62;
                                            Object[] objArr5113 = new Object[1];
                                            d(bArr117[28], bArr117[58], b315, objArr5113);
                                            cls118.getMethod((String) objArr5113[0], Long.TYPE).invoke(objNewInstance5, 100L);
                                            Object[] objArr617 = new Object[1];
                                            d(bArr117[54], bArr117[58], bArr117[34], objArr617);
                                            Class<?> cls119 = Class.forName((String) objArr617[0]);
                                            Object[] objArr618 = new Object[1];
                                            d(bArr117[28], bArr117[58], b315, objArr618);
                                            cls119.getMethod((String) objArr618[0], Long.TYPE).invoke(objNewInstance6, 10L);
                                            processExec.destroy();
                                            StringBuilder sb8 = new StringBuilder();
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                int bitsPerPixel3 = 2141 - ImageFormat.getBitsPerPixel(0);
                                                int i21110 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45;
                                                byte[] bArr118 = $$d;
                                                Object[] objArr619 = new Object[1];
                                                e(bArr118[7], (byte) (-bArr118[15]), bArr118[37], objArr619);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength3, bitsPerPixel3, i21110, 399405187, false, (String) objArr619[0], null);
                                            }
                                            sb8.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(objNewInstance5).toString());
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                char scrollBarFadeDuration4 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                int iResolveOpacity4 = Drawable.resolveOpacity(0, 0) + 2142;
                                                int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45;
                                                byte[] bArr119 = $$d;
                                                Object[] objArr6110 = new Object[1];
                                                e(bArr119[7], (byte) (-bArr119[15]), bArr119[37], objArr6110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollBarFadeDuration4, iResolveOpacity4, maximumFlingVelocity3, 399405187, false, (String) objArr6110[0], null);
                                            }
                                            sb8.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(objNewInstance6).toString());
                                            String string7 = sb8.toString();
                                            int keyRepeatTimeout3 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                            Object[] objArr6111 = new Object[1];
                                            c(((keyRepeatTimeout3 | 1) << 1) - (keyRepeatTimeout3 ^ 1), new char[]{13799}, (byte) (87 - (~(-(-MotionEvent.axisFromString(""))))), objArr6111);
                                            strArrSplit = string7.split((String) objArr6111[0]);
                                            length = strArrSplit.length;
                                            i71 = 0;
                                            z6 = z6;
                                            r33 = r32;
                                            while (true) {
                                                if (i71 < length) {
                                                    str10 = strArrSplit[i71];
                                                    int i18117 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    int i18118 = ~i18117;
                                                    int i18119 = (((i18117 * (-209)) - 3762) - (~(-(-((~((i18118 & (-19)) | (i18118 ^ (-19)))) * 210))))) - 1;
                                                    int i19110 = ~(((-19) ^ i54) | ((-19) & i54));
                                                    int i19111 = ~i18117;
                                                    int i19112 = ~((i19111 ^ i53) | (i19111 & i53));
                                                    int i19113 = -(-(((i19110 & i19112) | (i19110 ^ i19112)) * 210));
                                                    int i19114 = (i18117 & (-19)) | ((-19) ^ i18117);
                                                    int i19115 = (((i18119 ^ i19113) + ((i18119 & i19113) << 1)) - (~(-(-(((~((i19114 & i53) | (i19114 ^ i53))) | (~(((i19111 ^ i54) | (i19111 & i54)) | 18))) * 210))))) - 1;
                                                    int i19116 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    byte b316 = (byte) ((i19116 ^ 78) + ((i19116 & 78) << 1));
                                                    objArr23 = new Object[1];
                                                    c(i19115, new char[]{19, '-', '+', 29, '.', '(', 24, '\f', '\'', 29, 4, 3, '.', '\'', '\'', '.', 5, 27, 13826}, b316, objArr23);
                                                    if (str10.startsWith((String) objArr23[0])) {
                                                        int i19117 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int i19118 = (i19117 * 141) - 35433;
                                                        int i19119 = -(-(((i53 ^ 127) | (i53 & 127)) * 140));
                                                        int i20110 = (i19118 & i19119) + (i19118 | i19119);
                                                        int i20111 = ~i19117;
                                                        int i20112 = (i20111 & 127) | (i20111 ^ 127);
                                                        int i20113 = ~i20112;
                                                        int i20114 = ~((i54 ^ 127) | (i54 & 127));
                                                        int i20115 = ((i20113 & i20114) | (i20113 ^ i20114)) * (-280);
                                                        int i20116 = (i20110 & i20115) + (i20115 | i20110);
                                                        int i20117 = ~(((-128) & i19117) | ((-128) ^ i19117));
                                                        int i20118 = ~((i60 & i19117) | (i60 ^ i19117));
                                                        int i20119 = (i20118 & i20117) | (i20117 ^ i20118);
                                                        int i21111 = ~((i20112 & i53) | (i20112 ^ i53));
                                                        int i21112 = ((i20119 & i21111) | (i20119 ^ i21111)) * 140;
                                                        objArr24 = new Object[1];
                                                        a(null, null, (i20116 & i21112) + (i21112 | i20116), new byte[]{-121, -125, -122, -123, -124, -125, -126, -127, -121, -111, -123, -120, -106, -118, -115, -127, -113, -120, -127, -110}, objArr24);
                                                        if (str10.startsWith((String) objArr24[0])) {
                                                            int i21113 = -(-View.getDefaultSize(0, 0));
                                                            objArr25 = new Object[1];
                                                            a(null, null, ((i21113 | 127) << 1) - (i21113 ^ 127), new byte[]{-106, -118, -115, -127, -113, -120, -127, -110}, objArr25);
                                                            if (str10.startsWith((String) objArr25[0])) {
                                                                Object[] objArr6112 = new Object[1];
                                                                a(null, null, 126 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), new byte[]{-106}, objArr6112);
                                                                Split = str10.split((String) objArr6112[0]);
                                                                if (Split.length > 1) {
                                                                    r7 = r33;
                                                                    if (Split[1].equalsIgnoreCase(r7)) {
                                                                        boolean z19 = z6 ? 1 : 0;
                                                                        int i21114 = ((~(z19 ? 1 : 0)) & i53) | ((z19 ? 1 : 0) & i54);
                                                                        int i21115 = -i21114;
                                                                        int i21116 = ((i21114 & i21115) | (i21114 ^ i21115)) >> 31;
                                                                        int i21117 = ((i53 & (-21)) | (i54 & 20)) & (~i21116);
                                                                        int i21118 = i21116 & (z19 ? 1 : 0);
                                                                        r3 = (i21117 & i21118) | (i21117 ^ i21118);
                                                                    }
                                                                } else {
                                                                    r7 = r33;
                                                                }
                                                            } else {
                                                                r7 = r33;
                                                            }
                                                        } else {
                                                            r7 = r33;
                                                        }
                                                    } else {
                                                        r7 = r33;
                                                    }
                                                    int i21119 = i71 - 38;
                                                    i71 = ((i21119 | 39) << 1) - (i21119 ^ 39);
                                                    r33 = r7;
                                                    z6 = z6 ? 1 : 0;
                                                } else {
                                                    r8 = z6;
                                                    r25 = r25;
                                                    r27 = r27;
                                                    r212 = r212;
                                                    r211 = r211;
                                                }
                                                i70 = (r211 == true ? 1 : 0) + 1;
                                                r25 = r25;
                                                r5 = r27;
                                                r4 = r212;
                                                i69 = 0;
                                                r2 = r3;
                                                r25 = r25;
                                                r27 = r27;
                                                r212 = r212;
                                                r211 = r211;
                                            }
                                        }
                                    } else {
                                        r8 = r2 == true ? 1 : 0;
                                        r25 = r25;
                                        r212 = r4;
                                        r27 = r5;
                                        r211 = i70;
                                    }
                                    r3 = r8;
                                    i70 = (r211 == true ? 1 : 0) + 1;
                                    r25 = r25;
                                    r5 = r27;
                                    r4 = r212;
                                    i69 = 0;
                                    r2 = r3;
                                    r25 = r25;
                                    r27 = r27;
                                    r212 = r212;
                                    r211 = r211;
                                }
                                boolean z110 = r2 == true ? 1 : 0;
                                r28 = r4;
                                r1 = r2;
                            }
                        } else {
                            i53 = i76;
                            r28 = objInvoke;
                            i54 = i94;
                            r1 = i53;
                        }
                        byte[] bArr20 = $$a;
                        byte b40 = (byte) (bArr20[0] - 1);
                        byte b41 = bArr20[28];
                        Object[] objArr70 = new Object[1];
                        d(b40, b41, b41, objArr70);
                        Class<?> cls20 = Class.forName((String) objArr70[0]);
                        byte b42 = bArr20[58];
                        byte b43 = bArr20[13];
                        Object[] objArr71 = new Object[1];
                        d(b42, b43, (byte) (b43 | 32), objArr71);
                        ?? r10 = {cls20.getField((String) objArr71[0]).get(r28)};
                        ?? r11 = new Object[]{new int[1], r10}[0];
                        ((int[]) r11)[0] = r1;
                        i55 = ((int[]) r11)[0];
                        String[] strArr5 = (String[]) r10;
                        if ((i51 & 1) == 0) {
                            int i2210 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i2211 = (i2210 * 755) - 96384;
                            int i2212 = ~i2210;
                            int i2213 = ~((i2212 & 128) | (i2212 ^ 128));
                            int i230 = ~i2210;
                            int i231 = ~((i230 ^ i53) | (i230 & i53));
                            int i232 = (i2213 & i231) | (i2213 ^ i231);
                            int i233 = ~((i53 ^ 128) | (i53 & 128));
                            int i234 = -(-(((i232 & i233) | (i232 ^ i233)) * (-754)));
                            int i235 = ((i2211 | i234) << 1) - (i2211 ^ i234);
                            int i236 = (i230 ^ 128) | (i230 & 128);
                            int i237 = ~((i236 & i53) | (i236 ^ i53));
                            int i238 = (i54 & i2210) | (i54 ^ i2210);
                            int i239 = ~((i238 & 128) | (i238 ^ 128));
                            int i240 = i235 + (((i239 & i237) | (i237 ^ i239)) * (-754));
                            int i241 = -(-(((i230 ^ i54) | (i230 & i54)) * 754));
                            Object[] objArr72 = new Object[1];
                            a(null, null, (i240 & i241) + (i241 | i240), new byte[]{-103, -120, -122, -108, -123, -110, -104, -118, -120, -122, -105, -118, -125}, objArr72);
                            try {
                                Object[] objArr73 = {(String) objArr72[0]};
                                Object[] objArr74 = new Object[1];
                                a(null, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr74);
                                Class<?> cls21 = Class.forName((String) objArr74[0]);
                                int i242 = -(-TextUtils.lastIndexOf("", '0'));
                                Object[] objArr75 = new Object[1];
                                a(null, null, (i242 & 128) + (i242 | 128), new byte[]{-118, -120, -122, -105, -124, -118, -102, -111, -118, -119, -107, -103, -102, -119, -118, -115}, objArr75);
                                Object objInvoke2 = cls21.getMethod((String) objArr75[0], String.class).invoke(context, objArr73);
                                if (objInvoke2 == null) {
                                    i58 = i55;
                                    strArr5 = strArr5;
                                    i56 = i53;
                                    i59 = i56;
                                    break;
                                }
                                int i243 = -Gravity.getAbsoluteGravity(0, 0);
                                Object[] objArr76 = new Object[1];
                                a(null, null, (i243 & 127) + (i243 | 127), new byte[]{-124, -118, -115, -127, -126, -127, -100, -103, -120, -122, -108, -123, -114, -118, -120, -122, -105, -118, -101, -121, -126, -122, -111, -125, -127, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr76);
                                Class<?> cls22 = Class.forName((String) objArr76[0]);
                                int i244 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i245 = ((i244 | 15) << 1) - (i244 ^ 15);
                                char[] cArr10 = {'(', 25, '\t', '#', '#', '\b', 25, '\r', 23, '(', 31, 2, 24, Typography.quote, 13864};
                                int i246 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i247 = i246 * 471;
                                int i248 = (i247 ^ 29673) + ((i247 & 29673) << 1) + (((i246 ^ 63) | (i246 & 63)) * (-470));
                                int i249 = ~i246;
                                int i250 = ~((i249 & (-64)) | (i249 ^ (-64)));
                                int i251 = ~(((-64) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-64) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                int i252 = (i250 & i251) | (i250 ^ i251);
                                int i253 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                int i254 = (i253 & i246) | (i253 ^ i246);
                                int i255 = (i252 | (~((i254 ^ 63) | (i254 & 63)))) * (-470);
                                int i256 = (i248 & i255) + (i255 | i248);
                                int i257 = ~(i246 | (-64) | iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                                int i258 = ~(i254 | 63);
                                int i259 = ((i257 & i258) | (i257 ^ i258)) * 470;
                                Object[] objArr77 = new Object[1];
                                c(i245, cArr10, (byte) ((i256 & i259) + (i259 | i256)), objArr77);
                                List list = (List) cls22.getMethod((String) objArr77[0], null).invoke(objInvoke2, null);
                                if (list == null) {
                                    i58 = i55;
                                    strArr5 = strArr5;
                                    i56 = i53;
                                    i59 = i56;
                                    break;
                                }
                                Iterator it2 = list.iterator();
                                loop5: while (true) {
                                    if (!it2.hasNext()) {
                                        i58 = i55;
                                        strArr5 = strArr5;
                                        i56 = i53;
                                        i59 = i56;
                                        break;
                                    }
                                    Object next2 = it2.next();
                                    int i260 = 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    char[] cArr11 = {'-', '!', Typography.quote, 16, Typography.quote, 25, '%', '\t', '\'', 29, 28, '\n', 24, '!', '\t', 0, 4, 28, '\n', 24, '!', ' ', 24, '!', '\b', '\t', '-', 5, 13901};
                                    int i261 = -KeyEvent.normalizeMetaState(0);
                                    Object[] objArr78 = new Object[1];
                                    c(i260, cArr11, (byte) (((i261 | 78) << 1) - (i261 ^ 78)), objArr78);
                                    Class<?> cls23 = Class.forName((String) objArr78[0]);
                                    int iArgb3 = Color.argb(0, 0, 0, 0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i262 = iArgb3 * 141;
                                    int i263 = (i262 ^ (-35433)) + ((i262 & (-35433)) << 1);
                                    int i264 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault11 ^ 127) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & 127)) * 140;
                                    int i265 = (i263 & i264) + (i264 | i263);
                                    int i266 = ~iArgb3;
                                    int i267 = (i266 & 127) | (i266 ^ 127);
                                    int i268 = ~i267;
                                    int i269 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                    int i270 = ~((i269 & 127) | (i269 ^ 127));
                                    int i271 = ((i268 & i270) | (i268 ^ i270)) * (-280);
                                    int i272 = ((i265 | i271) << 1) - (i265 ^ i271);
                                    int i273 = ~(((-128) ^ iArgb3) | ((-128) & iArgb3));
                                    int i274 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                    int i275 = ~((iArgb3 & i274) | (i274 ^ iArgb3));
                                    int i276 = (i275 & i273) | (i273 ^ i275);
                                    int i277 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & i267) | (i267 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                    int i278 = -(-(((i277 & i276) | (i276 ^ i277)) * 140));
                                    Object[] objArr79 = new Object[1];
                                    a(null, null, (i272 & i278) + (i278 | i272), new byte[]{-118, -111, -127, -112, -118, -115, -127, -113, -120, -127, -114, -119, -118, -115}, objArr79);
                                    String str20 = (String) cls23.getMethod((String) objArr79[0], null).invoke(next2, null);
                                    int offsetAfter = TextUtils.getOffsetAfter("", 0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i279 = offsetAfter * 46;
                                    int i280 = (i279 ^ 5842) + ((i279 & 5842) << 1);
                                    int i281 = ~((-128) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i282 = (i280 - (~(((i281 & offsetAfter) | (offsetAfter ^ i281)) * (-90)))) - 1;
                                    int i283 = ~(((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | ((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i284 = ~(offsetAfter | 127);
                                    int i285 = -(-(((i283 & i284) | (i283 ^ i284)) * (-45)));
                                    int i286 = (i282 & i285) + (i285 | i282);
                                    int i287 = ~offsetAfter;
                                    int i288 = ~((i287 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i287 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i289 = (i288 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i288);
                                    int i290 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                    int i291 = ((~((offsetAfter & i290) | (i290 ^ offsetAfter))) | i289) * 45;
                                    Object[] objArr80 = new Object[1];
                                    a(null, null, (i286 & i291) + (i291 | i286), new byte[]{-124, -118, -115, -127, -126, -127, -100, -103, -120, -122, -108, -123, -114, -118, -120, -122, -105, -118, -101, -121, -126, -122, -111, -125, -127, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr80);
                                    Class<?> cls24 = Class.forName((String) objArr80[0]);
                                    Object[] objArr81 = new Object[1];
                                    c(Color.rgb(0, 0, 0) + 16777233, new char[]{Typography.quote, '0', ')', 17, 30, 18, Typography.quote, '\r', '!', '/', 17, 28, 27, 19, Typography.amp, 16, 13899}, (byte) (16777312 - (~Color.rgb(0, 0, 0))), objArr81);
                                    if (((Boolean) cls24.getMethod((String) objArr81[0], String.class).invoke(objInvoke2, str20)).booleanValue()) {
                                        int length9 = str20.length();
                                        int i292 = ((length9 | (-20)) << 1) - (length9 ^ (-20));
                                        if (i292 >= 0) {
                                            int i293 = 0;
                                            while (i293 <= i292) {
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                int i294 = (i293 ^ 20) | (i293 & 20);
                                                int i295 = ((10060 + (i293 * TypedValues.PositionType.TYPE_PERCENT_WIDTH)) - (~(-(-(i294 * (-502)))))) - 1;
                                                int i296 = ~((~i293) | (-21));
                                                int i297 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                                int i298 = i295 + ((i296 | (~(((-21) & i297) | ((-21) ^ i297))) | (~(i294 | iTuitionPaymentFragmentspecialinlinedviewModeldefault13))) * (-502));
                                                int i299 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                                int i300 = (i299 & (-21)) | ((-21) ^ i299);
                                                Object[] objArr82 = {str20.substring(i293, (i298 - (~(((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & i294) | (i294 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13))) | (~((i300 & i293) | (i300 ^ i293)))) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1), 931995};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                                    char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                                    int packedPositionType = 3393 - ExpandableListView.getPackedPositionType(0L);
                                                    int size = View.MeasureSpec.getSize(0) + 9;
                                                    byte[] bArr21 = $$d;
                                                    Object[] objArr83 = new Object[1];
                                                    e((byte) (bArr21[7] - 1), (byte) (-bArr21[51]), bArr21[37], objArr83);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollBarSize3, packedPositionType, size, 1203525406, false, (String) objArr83[0], new Class[]{String.class, Integer.TYPE});
                                                }
                                                long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr82)).longValue();
                                                long j20 = 826392368;
                                                Object obj9 = objInvoke2;
                                                Iterator it3 = it2;
                                                long j21 = (((long) 450) * j20) + (((long) (-448)) * jLongValue7);
                                                long j22 = 449;
                                                String str21 = str20;
                                                int i301 = i293;
                                                long j23 = -1;
                                                long j24 = ((j20 ^ j23) | jLongValue7) ^ j23;
                                                long j25 = jLongValue7 ^ j23;
                                                i58 = i55;
                                                long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                                int i302 = i292;
                                                long j26 = j21 + ((j24 | (((j25 | j20) | jMaxMemory) ^ j23)) * j22) + (((long) (-1347)) * j24) + (j22 * (j24 | ((((jMaxMemory ^ j23) | j25) | j20) ^ j23))) + ((long) (-828462245));
                                                int i303 = ~((-1094436306) | i54);
                                                i56 = i50;
                                                int i304 = ((int) (j26 >> 32)) & (((340003336 | i303 | (~(1094436305 | i56))) * (-338)) + 394236986 + ((i303 | (~(1434439641 | i56))) * 338));
                                                int i305 = ((int) j26) & ((-1754753727) + (((~(i54 | 1706403797)) | 1151337088) * (-828)) + ((1706403797 | i54) * (-828)) + 141895640);
                                                if (((i304 & i305) | (i304 ^ i305)) == 1245577864) {
                                                    i59 = (~(i56 & 70)) & (i56 | 70);
                                                    break loop5;
                                                }
                                                i293 = ((i301 | 1) << 1) - (i301 ^ 1);
                                                objInvoke2 = obj9;
                                                i53 = i56;
                                                i55 = i58;
                                                strArr5 = strArr5;
                                                str20 = str21;
                                                i292 = i302;
                                                it2 = it3;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    objInvoke2 = objInvoke2;
                                    i53 = i53;
                                    i55 = i55;
                                    strArr5 = strArr5;
                                    it2 = it2;
                                }
                                int i306 = i58;
                                int i307 = ((~i306) & i56) | (i306 & i54);
                                int i308 = -i307;
                                int i309 = ((i307 & i308) | (i307 ^ i308)) >> 31;
                                int i310 = i59 & (~i309);
                                int i311 = i306 & i309;
                                i55 = (i310 & i311) | (i310 ^ i311);
                            } catch (Throwable th23) {
                                Throwable cause10 = th23.getCause();
                                if (cause10 != null) {
                                    throw cause10;
                                }
                                throw th23;
                            }
                        } else {
                            strArr5 = strArr5;
                            i56 = i53;
                        }
                        strArr4 = strArr5;
                        i57 = 0;
                    } catch (Throwable th24) {
                        Throwable cause11 = th24.getCause();
                        if (cause11 != null) {
                            throw cause11;
                        }
                        throw th24;
                    }
                } else {
                    i56 = i76;
                    i55 = i56;
                    i57 = 0;
                    strArr4 = null;
                }
                int i312 = -View.MeasureSpec.getMode(i57);
                int i313 = ~i312;
                int i314 = ~((i313 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i313 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                int i315 = ~(i313 | i56);
                int i316 = (i315 & i314) | (i314 ^ i315);
                int i317 = ~(((-128) & i56) | ((-128) ^ i56));
                int i318 = ((i312 * 881) - (-111887)) + (((i316 & i317) | (i316 ^ i317)) * (-880));
                int i319 = ~i312;
                int i320 = ~i56;
                int i321 = ~((i319 & i320) | (i319 ^ i320));
                int i322 = (i321 & 127) | (i321 ^ 127);
                int i323 = (i312 & i56) | (i312 ^ i56);
                int i324 = ~i323;
                int i325 = (i318 - (~(((i322 & i324) | (i322 ^ i324)) * (-880)))) - 1;
                int i326 = -(-((~i323) * 880));
                Object[] objArr84 = new Object[1];
                a(null, null, ((i325 | i326) << 1) - (i326 ^ i325), new byte[]{-123, -95, -126, -96, -102, -97, -119, -107, -118, -98, -115, -99}, objArr84);
                Object[] objArr85 = {(String) objArr84[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    int i327 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                    int iIndexOf5 = TextUtils.indexOf("", "") + 8;
                    byte b44 = (byte) ($$d[7] - 1);
                    byte b45 = b44;
                    Object[] objArr86 = new Object[1];
                    e(b44, b45, (byte) (b45 | 51), objArr86);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, i327, iIndexOf5, -545305915, false, (String) objArr86[0], new Class[]{String.class});
                }
                long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr85)).longValue();
                long j27 = -832993533;
                long j28 = -958;
                long j29 = (j28 * j27) + (j28 * jLongValue8);
                long j30 = 959;
                String[] strArr6 = strArr4;
                long j31 = -1;
                long j32 = jLongValue8 ^ j31;
                long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                long j33 = jElapsedRealtime ^ j31;
                long j34 = j27 ^ j31;
                long j35 = j29 + ((((j32 | j33) ^ j31) | ((j34 | jElapsedRealtime) ^ j31) | ((j33 | j27) ^ j31)) * j30);
                long j36 = -959;
                long j37 = j35 + (((jLongValue8 | j27) ^ j31) * j36) + ((((j34 | j33) ^ j31) | ((j32 | jElapsedRealtime) ^ j31) | ((jElapsedRealtime | j27) ^ j31)) * j30) + ((long) 1453452817);
                int i328 = ((int) (j37 >> 32)) & (1687905420 + (((~(2001042081 | i320)) | (-856698804)) * (-90)) + (((~(2001042081 | i50)) | 855648929) * (-45)) + ((2001042081 | (~(856698803 | i50)) | (~((-856698804) | i320))) * 45));
                int iMyUid2 = Process.myUid();
                int i329 = ~iMyUid2;
                int i330 = ((int) j37) & (497234701 + (((~(430411947 | i329)) | (-2146957056)) * 184) + ((iMyUid2 | 151093249) * (-184)) + ((~(1867638357 | i329)) * 184));
                int i331 = (i328 & i330) | (i328 ^ i330);
                int i332 = -i331;
                int i333 = ((i331 & i332) | (i331 ^ i332)) >> 31;
                int i334 = (~i333) & i50;
                int i335 = i333 & (i50 ^ 50);
                int i336 = (i335 & i334) | (i334 ^ i335);
                int i337 = ((~i55) & i50) | (i55 & i320);
                int i338 = -i337;
                int i339 = ((i337 & i338) | (i337 ^ i338)) >> 31;
                int i340 = i336 & (~i339);
                int i341 = i55 & i339;
                int i342 = (i341 & i340) | (i340 ^ i341);
                Object[] objArr87 = new Object[1];
                a(null, null, 127 - Color.green(0), new byte[]{-118, -120, -127, -110, -107, -104, -118, -126, -123, -94, -110, -105, -99, -111, -118, -119, -107, -103, -107, -99}, objArr87);
                Object[] objArr88 = {(String) objArr87[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char bitsPerPixel4 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                    int tapTimeout2 = 993 - (ViewConfiguration.getTapTimeout() >> 16);
                    int iAlpha = 8 - Color.alpha(0);
                    byte b46 = (byte) ($$d[7] - 1);
                    byte b47 = b46;
                    Object[] objArr89 = new Object[1];
                    e(b46, b47, (byte) (b47 | 51), objArr89);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(bitsPerPixel4, tapTimeout2, iAlpha, -545305915, false, (String) objArr89[0], new Class[]{String.class});
                }
                long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr88)).longValue();
                long j38 = -1303652951;
                long j39 = -445;
                long j40 = (j39 * j38) + (j39 * jLongValue9);
                long j41 = 446;
                long j42 = j38 ^ j31;
                long j43 = jLongValue9 ^ j31;
                long j44 = (j42 | j43) ^ j31;
                long j45 = i50;
                long j46 = j45 ^ j31;
                long j47 = j40 + ((j44 | ((j43 | j46) ^ j31)) * j41) + ((((j42 | jLongValue9) ^ j31) | (((j43 | j38) | j45) ^ j31)) * j41) + (j41 * j44) + ((long) 1924112235);
                int i343 = ((int) (j47 >> 32)) & (((466256908 + (((-570773505) | i50) * (-381))) + (((~((-573405798) | i320)) | 1442490997) * 381)) - 1578627072);
                int iUptimeMillis4 = (int) SystemClock.uptimeMillis();
                int i344 = ~iUptimeMillis4;
                int i345 = ((int) j47) & ((-1687905466) + (((~(578502699 | i344)) | (-858723711)) * (-90)) + (((~(578502699 | iUptimeMillis4)) | 573243434) * (-45)) + (((~(iUptimeMillis4 | 858723710)) | 578502699 | (~(i344 | (-858723711)))) * 45));
                int i346 = (i345 & i343) | (i343 ^ i345);
                int i347 = -i346;
                int i348 = ((i346 & i347) | (i346 ^ i347)) >> 31;
                int i349 = (~i348) & i50;
                int i350 = i348 & ((i50 & (-61)) | (i320 & 60));
                int i351 = (i350 & i349) | (i349 ^ i350);
                int i352 = (~(i50 & i342)) & (i50 | i342);
                int i353 = -i352;
                int i354 = ((i352 & i353) | (i352 ^ i353)) >> 31;
                int i355 = i351 & (~i354);
                int i356 = i342 & i354;
                int i357 = (i356 & i355) | (i355 ^ i356);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i358 = (iLastIndexOf * 165) - 6031;
                int i359 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                int i360 = ~((i359 ^ 37) | (i359 & 37));
                int i361 = -(-(((i360 & iLastIndexOf) | (iLastIndexOf ^ i360)) * (-328)));
                int i362 = (i358 ^ i361) + ((i358 & i361) << 1) + (((iLastIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (iLastIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault14)) * 164);
                int i363 = ~iLastIndexOf;
                int i364 = ~((i363 & (-38)) | (i363 ^ (-38)));
                int i365 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault14 & (-38)) | ((-38) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                int i366 = (i365 & i364) | (i364 ^ i365);
                int i367 = ~((iLastIndexOf & i359) | (i359 ^ iLastIndexOf) | 37);
                int i368 = (i362 - (~(-(-(((i367 & i366) | (i366 ^ i367)) * 164))))) - 1;
                char[] cArr12 = {30, 31, '*', '\f', '+', '!', '!', ',', '\f', '*', Typography.dollar, '+', 31, 4, 4, '%', 4, '!', 5, 3, '-', '!', Typography.quote, 16, Typography.quote, 25, 31, 30, '\t', 18, '0', 6, '!', ',', '\f', '*'};
                int i369 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                Object[] objArr90 = new Object[1];
                c(i368, cArr12, (byte) (((i369 | 88) << 1) - (i369 ^ 88)), objArr90);
                Object[] objArr91 = {(String) objArr90[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char c4 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int mirror4 = AndroidCharacter.getMirror('0') + 945;
                    int i370 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7;
                    byte[] bArr22 = $$d;
                    Object[] objArr92 = new Object[1];
                    e((byte) (bArr22[7] - 1), (byte) (-bArr22[41]), (byte) 51, objArr92);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c4, mirror4, i370, 349342683, false, (String) objArr92[0], new Class[]{String.class});
                }
                long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr91)).longValue();
                long j48 = 464996553;
                long j49 = j48 ^ j31;
                long j50 = (j46 | j48) ^ j31;
                long j51 = (((long) 375) * j48) + (((long) (-747)) * jLongValue10) + (((long) (-374)) * (((j49 | jLongValue10) ^ j31) | j50));
                long j52 = jLongValue10 ^ j31;
                long j53 = j51 + (((long) 748) * ((j48 | j52) ^ j31)) + (((long) 374) * (((j49 | j52) ^ j31) | j50)) + ((long) (-1312075158));
                int i371 = ((int) (j53 >> 32)) & (((~(2054682621 | i320)) * 130) + 900973734 + (((~(2054682621 | i50)) | 539049984) * 130));
                int i372 = ~((int) SystemClock.uptimeMillis());
                int i373 = i371 | (((int) j53) & (1179484381 + ((1543404267 | i372) * 184) + (((~(i372 | 61608641)) | 1526364842) * 184)));
                int i374 = (i373 | (-i373)) >> 31;
                int i375 = (~i374) & i50;
                int i376 = i374 & (i50 ^ 80);
                int i377 = (i376 & i375) | (i375 ^ i376);
                int i378 = ((~i357) & i50) | (i357 & i320);
                int i379 = -i378;
                int i380 = ((i378 & i379) | (i378 ^ i379)) >> 31;
                int i381 = i377 & (~i380);
                int i382 = i357 & i380;
                int i383 = (i382 & i381) | (i381 ^ i382);
                int i384 = 41 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                char[] cArr13 = {30, 31, '*', '\f', '+', '!', '!', ',', '\f', '*', Typography.dollar, '+', 31, 4, 1, '%', 4, Typography.quote, '!', 24, 5, ',', ' ', 31, 18, Typography.quote, 23, Typography.quote, '\t', '%', '\f', ',', 0, 3, Typography.amp, 20, '+', '(', 22, '!', '\n', 4};
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0');
                int i385 = iLastIndexOf2 * 866;
                int i386 = ((i385 | (-15552)) << 1) - (i385 ^ (-15552));
                int i387 = ~iLastIndexOf2;
                int i388 = ~((i387 & i320) | (i387 ^ i320));
                int i389 = ((i388 & (-19)) | ((-19) ^ i388)) * (-865);
                int i390 = (i386 ^ i389) + ((i389 & i386) << 1);
                int i391 = -(-((~((iLastIndexOf2 ^ i50) | (iLastIndexOf2 & i50))) * 865));
                int i392 = ((i390 | i391) << 1) - (i391 ^ i390);
                int i393 = ~i50;
                int i394 = ~((i393 & (-19)) | ((-19) ^ i393));
                int i395 = ~((iLastIndexOf2 & i320) | (i320 ^ iLastIndexOf2));
                Object[] objArr93 = new Object[1];
                c(i384, cArr13, (byte) (i392 + (((i395 & i394) | (i394 ^ i395)) * 865)), objArr93);
                Object[] objArr94 = {(String) objArr93[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char c5 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int iResolveSize = 993 - View.resolveSize(0, 0);
                    int scrollBarFadeDuration5 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8;
                    byte[] bArr23 = $$d;
                    Object[] objArr95 = new Object[1];
                    e((byte) (bArr23[7] - 1), (byte) (-bArr23[41]), (byte) 51, objArr95);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c5, iResolveSize, scrollBarFadeDuration5, 349342683, false, (String) objArr95[0], new Class[]{String.class});
                }
                long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr94)).longValue();
                long j54 = 58335379;
                long j55 = (((long) 960) * j54) + (((long) (-1917)) * jLongValue11);
                long j56 = jLongValue11 ^ j31;
                long j57 = j55 + ((((j56 | j46) ^ j31) | ((j54 | j45) ^ j31)) * j30) + (j36 * j56) + ((((j56 | j45) ^ j31) | ((j46 | j54) ^ j31)) * j30) + ((long) (-905413984));
                int iMyTid = Process.myTid();
                int i396 = ~iMyTid;
                int i397 = ((int) (j57 >> 32)) & (1766503934 + (((~(1498121245 | i396)) | (~(1359619639 | iMyTid))) * 217) + (((~(iMyTid | 1498121245)) | (-1498129984)) * 217) + (((~(1359619639 | i396)) | (-1498121246)) * 217));
                int i398 = ~((~((int) SystemClock.uptimeMillis())) | 362046602);
                int i399 = ((int) j57) & (((18096128 | i398) * (-374)) + 1247299769 + ((i398 | 343950474) * 374));
                int i400 = (i397 & i399) | (i397 ^ i399);
                int i401 = -i400;
                int i402 = ((i400 & i401) | (i400 ^ i401)) >> 31;
                int i403 = (~i402) & i50;
                int i404 = i402 & (i50 ^ 90);
                int i405 = (i404 & i403) | (i403 ^ i404);
                int i406 = i50 ^ i383;
                int i407 = -i406;
                int i408 = ((i406 & i407) | (i406 ^ i407)) >> 31;
                int i409 = i405 & (~i408);
                int i410 = i383 & i408;
                int i411 = (i410 & i409) | (i409 ^ i410);
                int i412 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                Object[] objArr96 = new Object[1];
                a(null, null, ((i412 | 127) << 1) - (i412 ^ 127), new byte[]{-94, -107, -121, -126, -127, -119, -122, -119, -121, -119, -122, -126, -122, -99, -120, -119, -118, -99}, objArr96);
                Object[] objArr97 = {(String) objArr96[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char c6 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i413 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 992;
                    int longPressTimeout = 8 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte[] bArr24 = $$d;
                    Object[] objArr98 = new Object[1];
                    e((byte) (bArr24[7] - 1), (byte) (-bArr24[41]), (byte) 51, objArr98);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c6, i413, longPressTimeout, 349342683, false, (String) objArr98[0], new Class[]{String.class});
                }
                long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr97)).longValue();
                long j58 = 103953560;
                long j59 = (((long) (-947)) * j58) + (((long) 949) * jLongValue12);
                long j60 = -948;
                long j61 = j58 ^ j31;
                long j62 = jLongValue12 ^ j31;
                long j63 = j59 + ((j61 | ((j62 | j45) ^ j31)) * j60) + (j60 * (((j61 | j62) | j46) ^ j31)) + (((long) 948) * (j62 | j58)) + ((long) (-951032165));
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i414 = ~(1959416183 | elapsedCpuTime);
                int i415 = ~elapsedCpuTime;
                int i416 = i414 | (~((-898324702) | i415));
                int i417 = ~((-1959416184) | i415);
                int i418 = ((int) (j63 >> 32)) & ((-625131710) + ((i416 | i417) * (-516)) + (((~(elapsedCpuTime | 1976261119)) | (~((-1077936419) | i415))) * 516) + ((1077936418 | i417) * 516));
                int i419 = ((int) j63) & ((-1520785380) + (((~(i320 | (-320365569))) | 34627584) * 529) + (((~((-320365569) | i50)) | 1116860841) * 529));
                int i420 = (i418 & i419) | (i418 ^ i419);
                int i421 = -i420;
                int i422 = ((i420 & i421) | (i420 ^ i421)) >> 31;
                int i423 = (i422 & (~(i50 & 100)) & (i50 | 100)) | ((~i422) & i50);
                int i424 = ((~i411) & i50) | (i411 & i320);
                int i425 = -i424;
                int i426 = ((i424 & i425) | (i424 ^ i425)) >> 31;
                int i427 = i423 & (~i426);
                int i428 = i411 & i426;
                int i429 = (i428 & i427) | (i427 ^ i428);
                Object[] objArr99 = {new int[]{i50}, strArr6, new int[1], new int[]{i429}};
                int i430 = i50 ^ i429;
                int i431 = -i430;
                int i432 = 1792001511 + (((~(545397365 | i320)) | 263315950) * (-328)) + ((i50 | 263315950) * 164) + (((~((-545397366) | i50)) | 8388708 | (~(800324607 | i320))) * 164) + ((((i430 & i431) | (i430 ^ i431)) >> 31) & 16);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i433 = i432 * 677;
                int i434 = i52 * (-675);
                int i435 = (i433 & i434) + (i433 | i434);
                int i436 = (i432 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i432 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15);
                int i437 = ~i52;
                int i438 = -(-(((i436 & i437) | (i436 ^ i437)) * (-676)));
                int i439 = ((i435 | i438) << 1) - (i438 ^ i435);
                int i440 = ~i52;
                int i441 = ~((i440 ^ i432) | (i440 & i432));
                int i442 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                int i443 = ~(i442 | i432);
                int i444 = i439 + (((i441 & i443) | (i441 ^ i443)) * 676);
                int i445 = ~i432;
                int i446 = ~((i445 & i440) | (i445 ^ i440));
                int i447 = ~((i440 & i442) | (i440 ^ i442));
                int i448 = (i444 - (~(((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault15 | ((i52 & i432) | (i432 ^ i52)))) | ((i447 & i446) | (i446 ^ i447))) * 676))) - 1;
                int i449 = i448 << 13;
                int i450 = (i449 & (~i448)) | ((~i449) & i448);
                int i451 = i450 >>> 17;
                int i452 = ((~i450) & i451) | ((~i451) & i450);
                int i453 = i452 << 5;
                ((int[]) objArr99[2])[0] = ((~i452) & i453) | ((~i453) & i452);
                return objArr99;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                */
            private static java.lang.String $$g(byte r5, byte r6, short r7) {
                /*
                    int r5 = r5 * 4
                    int r5 = r5 + 1
                    int r6 = r6 + 67
                    byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.$$c
                    int r7 = r7 * 4
                    int r7 = r7 + 4
                    byte[] r1 = new byte[r5]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r4 = r5
                    r3 = r2
                    goto L24
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r5) goto L22
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L22:
                    r4 = r0[r7]
                L24:
                    int r4 = -r4
                    int r6 = r6 + r4
                    int r7 = r7 + 1
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1.$$g(byte, byte, short):java.lang.String");
            }
        });
        return preview;
    }

    @Override // defpackage.Preview
    public final MetadataImageReaderExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        getDefaultPointSize getdefaultpointsize;
        String str;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 63;
        MediaBrowserCompatMediaBrowserImpl = i2 % 128;
        int i3 = i2 % 2;
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Object obj = null;
        if (!Intrinsics.areEqual(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.subscribe)) {
            int i4 = MediaBrowserCompatMediaBrowserImpl + 15;
            MediaBrowserCompatItemReceiver = i4 % 128;
            if (i4 % 2 == 0) {
                this.subscribe = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(string);
                obj.hashCode();
                throw null;
            }
            this.subscribe = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2);
            int i5 = MediaBrowserCompatItemReceiver + 123;
            MediaBrowserCompatMediaBrowserImpl = i5 % 128;
            int i6 = i5 % 2;
        }
        String str2 = this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
        String str3 = this.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = this.MediaBrowserCompatConnectionCallback;
        Preview preview = this.b;
        if (preview instanceof getDefaultPointSize) {
            getdefaultpointsize = (getDefaultPointSize) preview;
        } else {
            int i7 = MediaBrowserCompatMediaBrowserImpl + 93;
            MediaBrowserCompatItemReceiver = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 5;
            }
            getdefaultpointsize = null;
        }
        if (getdefaultpointsize != null) {
            int i9 = MediaBrowserCompatMediaBrowserImpl + 83;
            MediaBrowserCompatItemReceiver = i9 % 128;
            if (i9 % 2 == 0) {
                String str5 = getdefaultpointsize.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                throw null;
            }
            str = getdefaultpointsize.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } else {
            str = null;
        }
        return MetadataImageReaderExternalSyntheticLambda0.b(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3, null, null, false, str2, str3, str4, str, null, null, this.onConnectionFailed, null, null, this.onTransact, this.handleMessage, false, 3463);
    }

    @Override // defpackage.Preview
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 + 119;
        MediaBrowserCompatMediaBrowserImpl = i3 % 128;
        int i4 = i3 % 2;
        boolean z = !this.setInternalConnectionCallback;
        int i5 = i2 + 69;
        MediaBrowserCompatMediaBrowserImpl = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    private final void b(getPreviewCapabilities p0, ImageAnalysisNonBlockingAnalyzer1<Object> p1) {
        int i = 2 % 2;
        Iterator<Map.Entry<Object, Preview>> it = this.TuitionPaymentFragmentbindingInflater1.entrySet().iterator();
        while (!(!it.hasNext())) {
            if (it.next().getValue().TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1) == null) {
                if (p0 instanceof getPreviewCapabilities.getExtras) {
                    this.getServiceComponent--;
                    this.getRoot++;
                } else {
                    int i2 = MediaBrowserCompatItemReceiver + 53;
                    MediaBrowserCompatMediaBrowserImpl = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 97 / 0;
                        if (p0 instanceof getPreviewCapabilities.getNotifyChildrenChangedOptions) {
                            this.getServiceComponent--;
                            this.getRoot++;
                        }
                    } else if (p0 instanceof getPreviewCapabilities.getNotifyChildrenChangedOptions) {
                        this.getServiceComponent--;
                        this.getRoot++;
                    }
                }
                it.remove();
            }
        }
        Preview preview = this.b;
        if (preview != null) {
            int i4 = MediaBrowserCompatItemReceiver + 7;
            MediaBrowserCompatMediaBrowserImpl = i4 % 128;
            int i5 = i4 % 2;
            if (preview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1) == null) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                b(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this, null}, -837604088, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 837604088);
                int i6 = MediaBrowserCompatMediaBrowserImpl + 97;
                MediaBrowserCompatItemReceiver = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r8.invoke();
        r5.setInternalConnectionCallback = true;
        TuitionPaymentFragmentbindingInflater1(r6, r7, com.datadog.android.api.storage.EventType.DEFAULT);
        b(r6, r7);
        d();
        r5.asInterface.TuitionPaymentFragmentbindingInflater1(r5.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        r5.write.TuitionPaymentFragmentbindingInflater1(r5.read);
        r5.INotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1(r5.notify);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((!r5.setInternalConnectionCallback) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r5.setInternalConnectionCallback != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = r1 + 41;
        com.datadog.android.rum.internal.domain.scope.RumViewScope.MediaBrowserCompatItemReceiver = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.getPreviewCapabilities r6, defpackage.ImageAnalysisNonBlockingAnalyzer1<java.lang.Object> r7, kotlin.jvm.functions.Function0<kotlin.Unit> r8) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.datadog.android.rum.internal.domain.scope.RumViewScope.MediaBrowserCompatMediaBrowserImpl
            int r2 = r1 + 55
            int r3 = r2 % 128
            com.datadog.android.rum.internal.domain.scope.RumViewScope.MediaBrowserCompatItemReceiver = r3
            int r2 = r2 % r0
            r3 = 1
            if (r2 != 0) goto L19
            boolean r2 = r5.setInternalConnectionCallback
            r4 = 62
            int r4 = r4 / 0
            r2 = r2 ^ r3
            if (r2 == r3) goto L25
            goto L1d
        L19:
            boolean r2 = r5.setInternalConnectionCallback
            if (r2 == 0) goto L25
        L1d:
            int r1 = r1 + 41
            int r6 = r1 % 128
            com.datadog.android.rum.internal.domain.scope.RumViewScope.MediaBrowserCompatItemReceiver = r6
            int r1 = r1 % r0
            return
        L25:
            r8.invoke()
            r5.setInternalConnectionCallback = r3
            com.datadog.android.api.storage.EventType r8 = com.datadog.android.api.storage.EventType.DEFAULT
            r5.TuitionPaymentFragmentbindingInflater1(r6, r7, r8)
            r5.b(r6, r7)
            r5.d()
            SafeCloseImageReaderProxy r6 = r5.asInterface
            shouldRetry r7 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r6.TuitionPaymentFragmentbindingInflater1(r7)
            SafeCloseImageReaderProxy r6 = r5.write
            shouldRetry r7 = r5.read
            r6.TuitionPaymentFragmentbindingInflater1(r7)
            SafeCloseImageReaderProxy r6 = r5.INotificationSideChannelDefault
            shouldRetry r7 = r5.notify
            r6.TuitionPaymentFragmentbindingInflater1(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getPreviewCapabilities, ImageAnalysisNonBlockingAnalyzer1, kotlin.jvm.functions.Function0):void");
    }

    private final void TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities p0, ImageAnalysisNonBlockingAnalyzer1<Object> p1, EventType p2) {
        final ViewEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater1;
        final ViewEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater2;
        long j;
        boolean z;
        Boolean boolValueOf;
        final boolean z2;
        boolean zBooleanValue;
        int i = 2 % 2;
        final boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        final long j2 = this.onConnectionSuspended + 1;
        this.onConnectionSuspended = j2;
        final long j3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final long j4 = this.g;
        final long j5 = this.search;
        final long j6 = this.d;
        final long j7 = this.MediaBrowserCompat;
        final long j8 = this.getInterfaceDescriptor;
        final Double d = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final int i2 = this.INotificationSideChannelStubProxy;
        getRetryDelayInMillis getretrydelayinmillis = this.getSessionToken.get(RumPerformanceMetric.FLUTTER_BUILD_TIME);
        if (getretrydelayinmillis != null) {
            remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater1 = Companion.TuitionPaymentFragmentbindingInflater1(getretrydelayinmillis);
        } else {
            int i3 = MediaBrowserCompatMediaBrowserImpl + 115;
            MediaBrowserCompatItemReceiver = i3 % 128;
            int i4 = i3 % 2;
            remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater1 = null;
        }
        getRetryDelayInMillis getretrydelayinmillis2 = this.getSessionToken.get(RumPerformanceMetric.FLUTTER_RASTER_TIME);
        if (getretrydelayinmillis2 != null) {
            int i5 = MediaBrowserCompatItemReceiver + 21;
            MediaBrowserCompatMediaBrowserImpl = i5 % 128;
            int i6 = i5 % 2;
            remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater2 = Companion.TuitionPaymentFragmentbindingInflater1(getretrydelayinmillis2);
        } else {
            remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater2 = null;
        }
        getRetryDelayInMillis getretrydelayinmillis3 = this.getSessionToken.get(RumPerformanceMetric.JS_FRAME_TIME);
        final ViewEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizerB = getretrydelayinmillis3 != null ? Companion.b(INSTANCE, getretrydelayinmillis3) : null;
        long j9 = p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2 - this.setCallbacksMessenger;
        if (j9 <= 0) {
            this.unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.WARN, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$resolveViewDuration$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "The computed duration for the view: %s was 0 or negative. In order to keep the view we forced it to 1ns.", Arrays.copyOf(new Object[]{this.this$0.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                {
                    super(0);
                }
            }, null, false, null);
            j = 1;
        } else {
            j = j9;
        }
        final MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        ViewEvent.INotificationSideChannel iNotificationSideChannel = !this.asBinder.isEmpty() ? new ViewEvent.INotificationSideChannel(new LinkedHashMap(this.asBinder)) : null;
        final getRetryDelayInMillis getretrydelayinmillis4 = this.connect;
        final getRetryDelayInMillis getretrydelayinmillis5 = this.IconCompatParcelizer;
        if (getretrydelayinmillis5 == null) {
            boolValueOf = null;
        } else {
            if (getretrydelayinmillis5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < 55.0d) {
                int i7 = MediaBrowserCompatMediaBrowserImpl + 111;
                MediaBrowserCompatItemReceiver = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        if (boolValueOf != null) {
            int i9 = MediaBrowserCompatMediaBrowserImpl + 65;
            MediaBrowserCompatItemReceiver = i9 % 128;
            if (i9 % 2 == 0) {
                zBooleanValue = boolValueOf.booleanValue();
                int i10 = 90 / 0;
            } else {
                zBooleanValue = boolValueOf.booleanValue();
            }
            z2 = zBooleanValue;
        } else {
            z2 = false;
        }
        final Map mutableMap = MapsKt.toMutableMap(this.cancel);
        final Map mutableMap2 = MapsKt.toMutableMap(MapsKt.plus(this.a, this.INotificationSideChannelStub));
        final long j10 = j;
        final ViewEvent.INotificationSideChannel iNotificationSideChannel2 = iNotificationSideChannel;
        getExecutedTimeInMillis.b(this.unsubscribe, p1, p2, new Function1<recalculateTransformMatrixAndCropRect, Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$sendViewUpdate$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final Object invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect) {
                ViewEvent.ViewEventSessionType viewEventSessionType;
                Double dValueOf;
                ViewEvent.DeviceType deviceType;
                ViewEvent.SessionPrecondition sessionPrecondition;
                ViewEvent.Status status;
                List listListOf;
                Double d2;
                String str;
                Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                String str2 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                String str3 = str2 == null ? "" : str2;
                lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = recalculatetransformmatrixandcroprect.INotificationSideChannel;
                RumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                final boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = resetMinLogLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(recalculatetransformmatrixandcroprect, str3);
                RumViewScope.TuitionPaymentFragmentbindingInflater1(this).TuitionPaymentFragmentspecialinlinedviewModeldefault2("rum", new Function1<Map<String, Object>, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$sendViewUpdate$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(Map<String, Object> map) {
                        b(map);
                        return Unit.INSTANCE;
                    }

                    public final void b(Map<String, Object> map) {
                        Intrinsics.checkNotNullParameter(map, "");
                        map.put("view_has_replay", Boolean.valueOf(zTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                RumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                ViewEvent.getExtras getextras = new ViewEvent.getExtras(Long.valueOf(resetMinLogLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect, str3)), null, null, 6, null);
                String str4 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
                ViewEvent.getRoot getroot = (str4 == null || StringsKt.isBlank(str4) || (str = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.g) == null || StringsKt.isBlank(str)) ? null : new ViewEvent.getRoot(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder, metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, null, 4, null);
                if (getroot == null) {
                    viewEventSessionType = ViewEvent.ViewEventSessionType.USER;
                } else {
                    viewEventSessionType = ViewEvent.ViewEventSessionType.SYNTHETICS;
                }
                ViewEvent.ViewEventSessionType viewEventSessionType2 = viewEventSessionType;
                long j11 = this.onTransact;
                ViewEvent.a aVar = new ViewEvent.a(mutableMap);
                String str5 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact;
                String str6 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel;
                String str7 = str6 != null ? str6 : "";
                ViewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ViewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j3);
                ViewEvent.getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = new ViewEvent.getNotifyChildrenChangedOptions(j5);
                ViewEvent.INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = new ViewEvent.INotificationSideChannelStubProxy(j4);
                ViewEvent.cancelAll cancelall = new ViewEvent.cancelAll(j6);
                ViewEvent.read readVar = new ViewEvent.read(j7);
                ViewEvent.getInterfaceDescriptor getinterfacedescriptor = new ViewEvent.getInterfaceDescriptor(j8);
                boolean z3 = zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                long j12 = j10;
                RumViewScope.Companion companion = RumViewScope.INSTANCE;
                if (j12 < RumViewScope.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3() || (d2 = d) == null) {
                    dValueOf = null;
                } else {
                    long j13 = j10;
                    double dDoubleValue = d2.doubleValue();
                    RumViewScope.Companion companion2 = RumViewScope.INSTANCE;
                    dValueOf = Double.valueOf((dDoubleValue * RumViewScope.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) / j13);
                }
                getRetryDelayInMillis getretrydelayinmillis6 = getretrydelayinmillis4;
                Double dValueOf2 = getretrydelayinmillis6 != null ? Double.valueOf(getretrydelayinmillis6.TuitionPaymentFragmentspecialinlinedviewModeldefault2) : null;
                getRetryDelayInMillis getretrydelayinmillis7 = getretrydelayinmillis4;
                Double dValueOf3 = getretrydelayinmillis7 != null ? Double.valueOf(getretrydelayinmillis7.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : null;
                getRetryDelayInMillis getretrydelayinmillis8 = getretrydelayinmillis5;
                Double dValueOf4 = getretrydelayinmillis8 != null ? Double.valueOf(getretrydelayinmillis8.TuitionPaymentFragmentspecialinlinedviewModeldefault2) : null;
                getRetryDelayInMillis getretrydelayinmillis9 = getretrydelayinmillis5;
                Double dValueOf5 = getretrydelayinmillis9 != null ? Double.valueOf(getretrydelayinmillis9.TuitionPaymentFragmentbindingInflater1) : null;
                String str8 = str7;
                ViewEvent.search searchVar = new ViewEvent.search(str3, null, str8, str5, this.MediaBrowserCompatCustomActionCallback, null, j10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, iNotificationSideChannel2, Boolean.valueOf(!z3), Boolean.valueOf(z2), tuitionPaymentFragmentspecialinlinedviewModeldefault3, iNotificationSideChannelStubProxy, cancelall, readVar, getinterfacedescriptor, getnotifychildrenchangedoptions, new ViewEvent.INotificationSideChannelStub(i2), null, dValueOf2, dValueOf3, d, dValueOf, dValueOf4, dValueOf5, remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater1, remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater2, remoteActionCompatParcelizerB, 4194210, 1, null);
                ViewEvent.getItem getitem = setTimeoutInMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer) ? new ViewEvent.getItem(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.b, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentbindingInflater1, MapsKt.toMutableMap(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) : null;
                ViewEvent.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new ViewEvent.TuitionPaymentFragmentbindingInflater1(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                ViewEvent.getSessionToken getsessiontoken = new ViewEvent.getSessionToken(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, viewEventSessionType2, Boolean.valueOf(zTuitionPaymentFragmentspecialinlinedviewModeldefault1), Boolean.valueOf(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3), null, 16, null);
                ViewEvent.ViewEventSource viewEventSourceTuitionPaymentFragmentbindingInflater1 = MirrorMode.TuitionPaymentFragmentbindingInflater1(ViewEvent.ViewEventSource.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, RumViewScope.TuitionPaymentFragmentbindingInflater1(this).TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                ViewEvent.IconCompatParcelizer iconCompatParcelizer = new ViewEvent.IconCompatParcelizer(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d, null, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, 4, null);
                DeviceType deviceType2 = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface;
                Intrinsics.checkNotNullParameter(deviceType2, "");
                int i11 = MirrorMode.WhenMappings.$EnumSwitchMapping$6[deviceType2.ordinal()];
                if (i11 == 1) {
                    deviceType = ViewEvent.DeviceType.MOBILE;
                } else if (i11 == 2) {
                    deviceType = ViewEvent.DeviceType.TABLET;
                } else if (i11 == 3) {
                    deviceType = ViewEvent.DeviceType.TV;
                } else if (i11 == 4) {
                    deviceType = ViewEvent.DeviceType.DESKTOP;
                } else {
                    deviceType = ViewEvent.DeviceType.OTHER;
                }
                ViewEvent.onTransact ontransact = new ViewEvent.onTransact(deviceType, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ViewEvent.a aVar2 = new ViewEvent.a(mutableMap2);
                RumSessionScope.StartReason startReason = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.a;
                Intrinsics.checkNotNullParameter(startReason, "");
                switch (MirrorMode.WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
                    case 1:
                        sessionPrecondition = ViewEvent.SessionPrecondition.USER_APP_LAUNCH;
                        break;
                    case 2:
                        sessionPrecondition = ViewEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
                        break;
                    case 3:
                        sessionPrecondition = ViewEvent.SessionPrecondition.MAX_DURATION;
                        break;
                    case 4:
                        sessionPrecondition = ViewEvent.SessionPrecondition.EXPLICIT_STOP;
                        break;
                    case 5:
                        sessionPrecondition = ViewEvent.SessionPrecondition.BACKGROUND_LAUNCH;
                        break;
                    case 6:
                        sessionPrecondition = ViewEvent.SessionPrecondition.PREWARM;
                        break;
                    case 7:
                        sessionPrecondition = ViewEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                ViewEvent.notify notifyVar = new ViewEvent.notify(new ViewEvent.cancel(null, sessionPrecondition, 1, null), new ViewEvent.d(Float.valueOf(this.isConnected), null, null, 6, null), null, j2, null, getextras, 20, null);
                NetworkInfo networkInfo = recalculatetransformmatrixandcroprect.asBinder;
                Intrinsics.checkNotNullParameter(networkInfo, "");
                Intrinsics.checkNotNullParameter(networkInfo, "");
                if (networkInfo.TuitionPaymentFragmentbindingInflater1 != NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED) {
                    status = ViewEvent.Status.CONNECTED;
                } else {
                    status = ViewEvent.Status.NOT_CONNECTED;
                }
                ViewEvent.Status status2 = status;
                switch (MirrorMode.WhenMappings.$EnumSwitchMapping$5[networkInfo.TuitionPaymentFragmentbindingInflater1.ordinal()]) {
                    case 1:
                        listListOf = CollectionsKt.listOf(ViewEvent.Interface.ETHERNET);
                        break;
                    case 2:
                        listListOf = CollectionsKt.listOf(ViewEvent.Interface.WIFI);
                        break;
                    case 3:
                        listListOf = CollectionsKt.listOf(ViewEvent.Interface.WIMAX);
                        break;
                    case 4:
                        listListOf = CollectionsKt.listOf(ViewEvent.Interface.BLUETOOTH);
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        listListOf = CollectionsKt.listOf(ViewEvent.Interface.CELLULAR);
                        break;
                    case 11:
                        listListOf = CollectionsKt.listOf(ViewEvent.Interface.OTHER);
                        break;
                    case 12:
                        listListOf = CollectionsKt.emptyList();
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                ViewEvent viewEvent = new ViewEvent(j11, tuitionPaymentFragmentbindingInflater1, recalculatetransformmatrixandcroprect.asInterface, recalculatetransformmatrixandcroprect.getInterfaceDescriptor, null, null, getsessiontoken, viewEventSourceTuitionPaymentFragmentbindingInflater1, searchVar, getitem, new ViewEvent.g(status2, listListOf, null, (networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null && networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) ? null : new ViewEvent.b(networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2, networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1), 4, null), null, getroot, null, iconCompatParcelizer, ontransact, notifyVar, aVar2, null, aVar, null, 1321008, null);
                RumViewScope rumViewScope = this;
                ((PreviewExternalSyntheticLambda3) RumViewScope.b(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{rumViewScope}, 397902464, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -397902463)).TuitionPaymentFragmentspecialinlinedviewModeldefault2(RumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault1(rumViewScope), viewEvent);
                return viewEvent;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "asString", "Ljava/lang/String;", "getAsString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum RumViewType {
        NONE("NONE"),
        FOREGROUND("FOREGROUND"),
        BACKGROUND("BACKGROUND"),
        APPLICATION_LAUNCH("APPLICATION_LAUNCH");


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asString;

        RumViewType(String str) {
            this.asString = str;
        }

        public final String getAsString() {
            return this.asString;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$RumViewType$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static RumViewType TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) throws CloneNotSupportedException {
                for (RumViewType rumViewType : RumViewType.values()) {
                    if (Intrinsics.areEqual(rumViewType.getAsString(), p0)) {
                        return rumViewType;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010!"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "LPreview;", "p0", "LPreviewExternalSyntheticLambda3;", "p1", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p2", "LgetPreviewCapabilities$read;", "p3", "LshouldMirror;", "p4", "LsetJpegQuality;", "p5", "LSafeCloseImageReaderProxy;", "p6", "p7", "p8", "", "p9", "", "p10", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LPreview;LPreviewExternalSyntheticLambda3;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;LgetPreviewCapabilities$read;LshouldMirror;LsetJpegQuality;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;ZF)Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "", "write", "J", "TuitionPaymentFragmentbindingInflater1", "connect", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()J", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static long TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return RumViewScope.b();
        }

        public static final /* synthetic */ ViewEvent.RemoteActionCompatParcelizer b(Companion companion, getRetryDelayInMillis getretrydelayinmillis) {
            double d = getretrydelayinmillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Double dValueOf = Double.valueOf((d == 0.0d ? 0.0d : 1.0d / d) * TimeUnit.SECONDS.toNanos(1L));
            double d2 = getretrydelayinmillis.TuitionPaymentFragmentbindingInflater1;
            Double dValueOf2 = Double.valueOf((d2 == 0.0d ? 0.0d : 1.0d / d2) * TimeUnit.SECONDS.toNanos(1L));
            double d3 = getretrydelayinmillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return new ViewEvent.RemoteActionCompatParcelizer(dValueOf, dValueOf2, Double.valueOf((d3 != 0.0d ? 1.0d / d3 : 0.0d) * TimeUnit.SECONDS.toNanos(1L)), null, 8, null);
        }

        public static final /* synthetic */ ViewEvent.RemoteActionCompatParcelizer TuitionPaymentFragmentbindingInflater1(getRetryDelayInMillis getretrydelayinmillis) {
            return new ViewEvent.RemoteActionCompatParcelizer(Double.valueOf(getretrydelayinmillis.TuitionPaymentFragmentbindingInflater1), Double.valueOf(getretrydelayinmillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Double.valueOf(getretrydelayinmillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null, 8, null);
        }

        public static RumViewScope TuitionPaymentFragmentspecialinlinedviewModeldefault2(Preview p0, PreviewExternalSyntheticLambda3 p1, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 p2, getPreviewCapabilities.read p3, shouldMirror p4, setJpegQuality p5, SafeCloseImageReaderProxy p6, SafeCloseImageReaderProxy p7, SafeCloseImageReaderProxy p8, boolean p9, float p10) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p5, "");
            Intrinsics.checkNotNullParameter(p6, "");
            Intrinsics.checkNotNullParameter(p7, "");
            Intrinsics.checkNotNullParameter(p8, "");
            return new RumViewScope(p0, p2, p1, p3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, p3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, p3.b, p4, p5, p6, p7, p8, null, null, p9, p10, 6144, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void d() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 79;
        MediaBrowserCompatMediaBrowserImpl = i2 % 128;
        int i3 = i2 % 2;
        shouldMirror shouldmirror = this.onError;
        if (shouldmirror != null) {
            shouldmirror.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdasendSurfaceRequest2(this.RemoteActionCompatParcelizer, this.a, TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
            int i4 = MediaBrowserCompatMediaBrowserImpl + 53;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        long j = this.getExtras;
        long j2 = this.getServiceComponent;
        long j3 = this.getRoot;
        long j4 = this.sendCustomAction;
        if (!this.setInternalConnectionCallback) {
            return false;
        }
        int i2 = MediaBrowserCompatMediaBrowserImpl + 11;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentbindingInflater1.isEmpty();
            throw null;
        }
        if ((!this.TuitionPaymentFragmentbindingInflater1.isEmpty()) || j + j2 + j3 + j4 > 0) {
            return false;
        }
        int i3 = MediaBrowserCompatMediaBrowserImpl;
        int i4 = i3 + 21;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 53;
        MediaBrowserCompatItemReceiver = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static {
        MediaBrowserCompatItemCallback = 0;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new Companion(null);
        connect = TimeUnit.SECONDS.toNanos(1L);
        write = TimeUnit.MILLISECONDS.toNanos(700L);
        int i = onLoadChildren + 11;
        MediaBrowserCompatItemCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ PreviewExternalSyntheticLambda3 b(RumViewScope rumViewScope) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (PreviewExternalSyntheticLambda3) b(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, new Object[]{rumViewScope}, 397902464, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, -397902463);
    }

    public static final /* synthetic */ void b(RumViewScope rumViewScope, getRetryDelayInMillis getretrydelayinmillis) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, new Object[]{rumViewScope, getretrydelayinmillis}, -1175869121, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1175869123);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Preview p0) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, new Object[]{this, p0}, -837604088, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 837604088);
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        MediaBrowserCompatCustomActionResultReceiver = new char[]{63908, 65012, 61727, 62634, 59606, 60535, 58267, 59250, 56146, 57057, 53853, 51587, 52680, 49509, 50307, 47153, 48216, 46025, 46855, 43687, 44746, 41573, 54852, 53778, 57086, 56140, 50990, 50079, 52351, 51434, 62652, 61719, 65019, 58944, 57916, 61087, 60278, 45565, 46509, 47430, 48371, 41103, 42030, 43970, 44843, 37637, 38587, 39514, 33191, 34217, 35116, 36058, 61540, 62490, 64442, 65350, 58088, 59044, 59967, 53700, 54640, 55573, 56511, 45567, 46518, 47440, 48371, 41093, 42025, 43986, 44868, 37652, 38587, 39494, 33248, 34187, 35118, 36058, 61540, 62467, 64445, 45558, 46498, 47444, 48352, 41166, 42027, 43975, 44907, 37635, 38629, 39545, 33264, 34203, 35131, 36043, 61536, 45557, 46503, 47431, 48367, 41108, 42030, 43986, 44924, 37676, 38570, 39513, 33249, 34219, 35104, 36042, 61544};
        onReceiveResult = -910767868331313725L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r6 = r6 * 3
            int r6 = 115 - r6
            byte[] r1 = com.datadog.android.rum.internal.domain.scope.RumViewScope.$$c
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumViewScope.$$g(int, int, byte):java.lang.String");
    }
}
