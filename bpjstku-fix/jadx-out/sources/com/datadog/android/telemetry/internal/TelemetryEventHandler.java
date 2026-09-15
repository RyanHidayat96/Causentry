package com.datadog.android.telemetry.internal;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.rum.configuration.VitalsUpdateFrequency;
import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import defpackage.ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;
import defpackage.ImageAnalysisNonBlockingAnalyzer;
import defpackage.ImageAnalysisNonBlockingAnalyzer1;
import defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
import defpackage.ImageReaderProxyProvider;
import defpackage.LayoutSettings;
import defpackage.MetadataImageReader;
import defpackage.MetadataImageReaderExternalSyntheticLambda0;
import defpackage.PreviewExternalSyntheticLambda3;
import defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda1;
import defpackage.SurfaceOrientedMeteringPointFactory;
import defpackage.SurfaceOutput;
import defpackage.SurfaceOutputEventEventCode;
import defpackage.SurfaceProcessor;
import defpackage.SurfaceRequest;
import defpackage.createIsolatedReader;
import defpackage.getPreviewCapabilities;
import defpackage.initialSurfaceRecreationCompleter;
import defpackage.recalculateTransformMatrixAndCropRect;
import defpackage.removeStaleData;
import defpackage.safeClose;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f-B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u001aJ\u0013\u0010\u0017\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u0017\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010#\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0014\u0010\u0015\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010$R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "LMetadataImageReader;", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p0", "LImageReaderProxyProvider;", "p1", "p2", "LPreviewExternalSyntheticLambda3;", "p3", "", "p4", "<init>", "(LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;LImageReaderProxyProvider;LImageReaderProxyProvider;LPreviewExternalSyntheticLambda3;I)V", "LLayoutSettings;", "", "b", "(LLayoutSettings;)Z", "LgetPreviewCapabilities$sendCustomAction;", "LImageAnalysisNonBlockingAnalyzer1;", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LgetPreviewCapabilities$sendCustomAction;LImageAnalysisNonBlockingAnalyzer1;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Z", "", "(Ljava/lang/String;Z)V", "LrecalculateTransformMatrixAndCropRect;", "LMetadataImageReaderExternalSyntheticLambda0;", "(LrecalculateTransformMatrixAndCropRect;)LMetadataImageReaderExternalSyntheticLambda0;", "TuitionPaymentFragmentbindingInflater1", "LImageReaderProxyProvider;", "", "LSurfaceRequest;", "Ljava/util/Set;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "g", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "asInterface", "LPreviewExternalSyntheticLambda3;", "asBinder", "d", "Z", "a", "TracerApi"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class TelemetryEventHandler implements MetadataImageReader {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final ImageReaderProxyProvider b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final ImageReaderProxyProvider TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Set<SurfaceRequest> TuitionPaymentFragmentbindingInflater1;
    private int asBinder;
    private final PreviewExternalSyntheticLambda3 asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/datadog/android/telemetry/internal/TelemetryEventHandler$TracerApi;", "", "<init>", "(Ljava/lang/String;I)V", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum TracerApi {
        OpenTelemetry,
        OpenTracing
    }

    private TelemetryEventHandler(ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, ImageReaderProxyProvider imageReaderProxyProvider, ImageReaderProxyProvider imageReaderProxyProvider2, PreviewExternalSyntheticLambda3 previewExternalSyntheticLambda3, int i) {
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(imageReaderProxyProvider, "");
        Intrinsics.checkNotNullParameter(imageReaderProxyProvider2, "");
        Intrinsics.checkNotNullParameter(previewExternalSyntheticLambda3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageReaderProxyProvider;
        this.b = imageReaderProxyProvider2;
        this.asInterface = previewExternalSyntheticLambda3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.TuitionPaymentFragmentbindingInflater1 = new LinkedHashSet();
    }

    public /* synthetic */ TelemetryEventHandler(ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, ImageReaderProxyProvider imageReaderProxyProvider, createIsolatedReader createisolatedreader, PreviewExternalSyntheticLambda3 previewExternalSyntheticLambda3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, imageReaderProxyProvider, (i2 & 4) != 0 ? new createIsolatedReader(20.0f) : createisolatedreader, previewExternalSyntheticLambda3, (i2 & 16) != 0 ? 100 : i);
    }

    @Override // defpackage.MetadataImageReader
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.TuitionPaymentFragmentbindingInflater1.clear();
        this.asBinder = 0;
    }

    private final boolean b(LayoutSettings p0) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            return false;
        }
        if ((p0 instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && !this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            return false;
        }
        final SurfaceRequest surfaceRequestTuitionPaymentFragmentspecialinlinedviewModeldefault2 = initialSurfaceRecreationCompleter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        if (!(p0 instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || !this.TuitionPaymentFragmentbindingInflater1.contains(surfaceRequestTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            if (this.asBinder < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return true;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventHandler$canWrite$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Max number of telemetry events per session reached, rejecting.";
                }
            }, null, false, null);
            return false;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventHandler$canWrite$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String str = String.format(Locale.US, "Already seen telemetry event with identity=%s, rejecting.", Arrays.copyOf(new Object[]{surfaceRequestTuitionPaymentFragmentspecialinlinedviewModeldefault2}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }

            {
                super(0);
            }
        }, null, false, null);
        return false;
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        boolean zBooleanValue = false;
        try {
            try {
                Object objInvoke = Class.forName("io.opentracing.util.GlobalTracer").getMethod("isRegistered", new Class[0]).invoke(null, new Object[0]);
                Intrinsics.checkNotNull(objInvoke, "");
                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                return zBooleanValue;
            } catch (Throwable th) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, new Function0<String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventHandler$isGlobalTracerRegistered$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "GlobalTracer class exists in the runtime classpath, but there is an error invoking isRegistered method";
                    }
                }, th, false, null);
                return zBooleanValue;
            }
        } catch (Throwable unused) {
            return zBooleanValue;
        }
    }

    public static final /* synthetic */ TelemetryUsageEvent b(TelemetryEventHandler telemetryEventHandler, recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, long j, LayoutSettings.b bVar) {
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect);
        if (!(bVar instanceof LayoutSettings.b.TuitionPaymentFragmentbindingInflater1)) {
            throw new NoWhenBranchMatchedException();
        }
        TelemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TelemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TelemetryUsageEvent.Source sourceTuitionPaymentFragmentbindingInflater1 = SurfaceProcessor.TuitionPaymentFragmentbindingInflater1(TelemetryUsageEvent.Source.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        if (sourceTuitionPaymentFragmentbindingInflater1 == null) {
            sourceTuitionPaymentFragmentbindingInflater1 = TelemetryUsageEvent.Source.ANDROID;
        }
        TelemetryUsageEvent.Source source = sourceTuitionPaymentFragmentbindingInflater1;
        String str = recalculatetransformmatrixandcroprect.d;
        TelemetryUsageEvent.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TelemetryUsageEvent.TuitionPaymentFragmentbindingInflater1(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        TelemetryUsageEvent.d dVar = new TelemetryUsageEvent.d(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String str2 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.d;
        TelemetryUsageEvent.a aVar = str2 != null ? new TelemetryUsageEvent.a(str2) : null;
        String str3 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
        LayoutSettings.b.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = (LayoutSettings.b.TuitionPaymentFragmentbindingInflater1) bVar;
        return new TelemetryUsageEvent(tuitionPaymentFragmentspecialinlinedviewModeldefault2, j, "dd-sdk-android", source, str, tuitionPaymentFragmentbindingInflater1, dVar, aVar, str3 != null ? new TelemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3) : null, null, new TelemetryUsageEvent.g(new TelemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2), new TelemetryUsageEvent.asBinder(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d), new TelemetryUsageEvent.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater2.b), bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3), 512, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019e  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:106:0x01af  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:69:0x0105  */
    /* JADX WARN: Code duplicated, block: B:72:0x011d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:76:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0132  */
    /* JADX WARN: Code duplicated, block: B:80:0x0157  */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0162  */
    /* JADX WARN: Code duplicated, block: B:84:0x016c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0172  */
    /* JADX WARN: Code duplicated, block: B:88:0x017b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:92:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x018b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:98:0x0198  */
    public static final /* synthetic */ TelemetryConfigurationEvent b(TelemetryEventHandler telemetryEventHandler, recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, long j, LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        TelemetryConfigurationEvent.ViewTrackingStrategy viewTrackingStrategy;
        TelemetryConfigurationEvent.ViewTrackingStrategy viewTrackingStrategy2;
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj;
        Boolean bool;
        TracerApi tracerApi;
        String str;
        boolean z;
        TelemetryConfigurationEvent.Source sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2;
        TelemetryConfigurationEvent.cancelAll cancelall;
        String str3;
        TelemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Long lValueOf;
        Long lValueOf2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        boolean z2;
        SurfaceOutputEventEventCode surfaceOutputEventEventCode;
        boolean z3;
        Long lValueOf3;
        String strName;
        VitalsUpdateFrequency vitalsUpdateFrequency;
        Object obj2;
        removeStaleData removestaledata;
        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("tracing");
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault3 = telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("session-replay");
        Object obj3 = mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get("session_replay_sample_rate");
        Long l = obj3 instanceof Long ? (Long) obj3 : null;
        Object obj4 = mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get("session_replay_start_immediate_recording");
        Boolean bool2 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        Object obj5 = mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get("session_replay_image_privacy");
        String str4 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get("session_replay_touch_privacy");
        String str5 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get("session_replay_text_and_input_privacy");
        String str6 = obj7 instanceof String ? (String) obj7 : null;
        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B2 = telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("rum");
        removeStaleData.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B2 == null || (removestaledata = (removeStaleData) imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B2.b()) == null) ? null : removestaledata.d;
        ViewTrackingStrategy viewTrackingStrategy3 = tuitionPaymentFragmentbindingInflater1 != null ? tuitionPaymentFragmentbindingInflater1.INotificationSideChannelStubProxy : null;
        if (viewTrackingStrategy3 instanceof safeClose) {
            viewTrackingStrategy2 = TelemetryConfigurationEvent.ViewTrackingStrategy.ACTIVITYVIEWTRACKINGSTRATEGY;
        } else if (viewTrackingStrategy3 instanceof SurfaceOrientedMeteringPointFactory) {
            viewTrackingStrategy2 = TelemetryConfigurationEvent.ViewTrackingStrategy.FRAGMENTVIEWTRACKINGSTRATEGY;
        } else {
            if (!(viewTrackingStrategy3 instanceof SafeCloseImageReaderProxyExternalSyntheticLambda1)) {
                if (viewTrackingStrategy3 instanceof SurfaceOutput) {
                    viewTrackingStrategy2 = TelemetryConfigurationEvent.ViewTrackingStrategy.NAVIGATIONVIEWTRACKINGSTRATEGY;
                } else {
                    viewTrackingStrategy = null;
                }
                MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect);
                mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("tracing");
                obj = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.get("is_opentelemetry_enabled");
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                } else {
                    bool = null;
                }
                if (bool == null && bool.booleanValue()) {
                    tracerApi = TracerApi.OpenTelemetry;
                } else if (telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    tracerApi = TracerApi.OpenTracing;
                } else {
                    tracerApi = null;
                }
                if (tracerApi == TracerApi.OpenTelemetry) {
                    obj2 = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.get("opentelemetry_api_version");
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null || tracerApi == null) {
                    z = false;
                } else {
                    z = true;
                }
                TelemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TelemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TelemetryConfigurationEvent.Source.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                if (sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TelemetryConfigurationEvent.Source.ANDROID;
                }
                TelemetryConfigurationEvent.Source source = sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str7 = recalculatetransformmatrixandcroprect.d;
                TelemetryConfigurationEvent.b bVar = new TelemetryConfigurationEvent.b(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                TelemetryConfigurationEvent.g gVar = new TelemetryConfigurationEvent.g(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                str2 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.d;
                if (str2 != null) {
                    cancelall = new TelemetryConfigurationEvent.cancelAll(str2);
                } else {
                    cancelall = null;
                }
                str3 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                if (str3 != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TelemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str3);
                } else {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                }
                TelemetryConfigurationEvent.a aVar = new TelemetryConfigurationEvent.a(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                TelemetryConfigurationEvent.d dVar = new TelemetryConfigurationEvent.d(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d);
                if (tuitionPaymentFragmentbindingInflater1 != null) {
                    lValueOf = Long.valueOf((long) tuitionPaymentFragmentbindingInflater1.asInterface);
                } else {
                    lValueOf = null;
                }
                if (tuitionPaymentFragmentbindingInflater1 != null) {
                    lValueOf2 = Long.valueOf((long) tuitionPaymentFragmentbindingInflater1.cancel);
                } else {
                    lValueOf2 = null;
                }
                boolean z4 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.f161a;
                if (tuitionPaymentFragmentbindingInflater1 != null) {
                    boolValueOf = Boolean.valueOf(tuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor);
                } else {
                    boolValueOf = null;
                }
                boolean z5 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (tuitionPaymentFragmentbindingInflater1 != null) {
                    boolValueOf2 = Boolean.valueOf(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    boolValueOf2 = null;
                }
                if (tuitionPaymentFragmentbindingInflater1 != null) {
                    boolValueOf3 = Boolean.valueOf(tuitionPaymentFragmentbindingInflater1.INotificationSideChannelStub);
                } else {
                    boolValueOf3 = null;
                }
                if (boolValueOf3 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (tuitionPaymentFragmentbindingInflater1 != null) {
                    surfaceOutputEventEventCode = tuitionPaymentFragmentbindingInflater1.d;
                } else {
                    surfaceOutputEventEventCode = null;
                }
                if (surfaceOutputEventEventCode == null) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                long j2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                long j3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
                if (tuitionPaymentFragmentbindingInflater1 != null || (vitalsUpdateFrequency = tuitionPaymentFragmentbindingInflater1.write) == null) {
                    lValueOf3 = null;
                } else {
                    lValueOf3 = Long.valueOf(vitalsUpdateFrequency.getPeriodInMs());
                }
                if (tracerApi != null) {
                    strName = tracerApi.name();
                } else {
                    strName = null;
                }
                return new TelemetryConfigurationEvent(tuitionPaymentFragmentspecialinlinedviewModeldefault2, j, "dd-sdk-android", source, str7, bVar, gVar, cancelall, tuitionPaymentFragmentspecialinlinedviewModeldefault3, null, new TelemetryConfigurationEvent.asInterface(aVar, dVar, new TelemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lValueOf, lValueOf2, null, null, null, null, null, null, l, null, null, bool2, Boolean.valueOf(z4), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str6, str4, str5, null, null, null, null, boolValueOf, null, Boolean.valueOf(z2), null, null, null, null, Boolean.valueOf(z5), viewTrackingStrategy, boolValueOf2, lValueOf3, Boolean.valueOf(z6), Boolean.valueOf(telemetryEventHandler.a), Boolean.valueOf(z), null, null, Boolean.valueOf(z3), null, null, null, null, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3), null, null, null, null, null, null, null, strName, str, null, null, 536864508, -236189777, 103, null), null, 8, null));
            }
            viewTrackingStrategy2 = TelemetryConfigurationEvent.ViewTrackingStrategy.MIXEDVIEWTRACKINGSTRATEGY;
        }
        viewTrackingStrategy = viewTrackingStrategy2;
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect);
        mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("tracing");
        obj = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.get("is_opentelemetry_enabled");
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool == null) {
            if (telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                tracerApi = TracerApi.OpenTracing;
            } else {
                tracerApi = null;
            }
        } else if (telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            tracerApi = TracerApi.OpenTracing;
        } else {
            tracerApi = null;
        }
        if (tracerApi == TracerApi.OpenTelemetry) {
            obj2 = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.get("opentelemetry_api_version");
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null) {
            z = false;
        } else {
            z = false;
        }
        TelemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new TelemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TelemetryConfigurationEvent.Source.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        if (sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TelemetryConfigurationEvent.Source.ANDROID;
        }
        TelemetryConfigurationEvent.Source source2 = sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str8 = recalculatetransformmatrixandcroprect.d;
        TelemetryConfigurationEvent.b bVar2 = new TelemetryConfigurationEvent.b(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        TelemetryConfigurationEvent.g gVar2 = new TelemetryConfigurationEvent.g(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        str2 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
        if (str2 != null) {
            cancelall = new TelemetryConfigurationEvent.cancelAll(str2);
        } else {
            cancelall = null;
        }
        str3 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
        if (str3 != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TelemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str3);
        } else {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        TelemetryConfigurationEvent.a aVar2 = new TelemetryConfigurationEvent.a(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        TelemetryConfigurationEvent.d dVar2 = new TelemetryConfigurationEvent.d(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d);
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            lValueOf = Long.valueOf((long) tuitionPaymentFragmentbindingInflater1.asInterface);
        } else {
            lValueOf = null;
        }
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            lValueOf2 = Long.valueOf((long) tuitionPaymentFragmentbindingInflater1.cancel);
        } else {
            lValueOf2 = null;
        }
        boolean z7 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.f161a;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            boolValueOf = Boolean.valueOf(tuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor);
        } else {
            boolValueOf = null;
        }
        boolean z8 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            boolValueOf2 = Boolean.valueOf(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            boolValueOf2 = null;
        }
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            boolValueOf3 = Boolean.valueOf(tuitionPaymentFragmentbindingInflater1.INotificationSideChannelStub);
        } else {
            boolValueOf3 = null;
        }
        if (boolValueOf3 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z9 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            surfaceOutputEventEventCode = tuitionPaymentFragmentbindingInflater1.d;
        } else {
            surfaceOutputEventEventCode = null;
        }
        if (surfaceOutputEventEventCode == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        long j4 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
        long j5 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            lValueOf3 = null;
        } else {
            lValueOf3 = null;
        }
        if (tracerApi != null) {
            strName = tracerApi.name();
        } else {
            strName = null;
        }
        return new TelemetryConfigurationEvent(tuitionPaymentFragmentspecialinlinedviewModeldefault4, j, "dd-sdk-android", source2, str8, bVar2, gVar2, cancelall, tuitionPaymentFragmentspecialinlinedviewModeldefault3, null, new TelemetryConfigurationEvent.asInterface(aVar2, dVar2, new TelemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lValueOf, lValueOf2, null, null, null, null, null, null, l, null, null, bool2, Boolean.valueOf(z7), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str6, str4, str5, null, null, null, null, boolValueOf, null, Boolean.valueOf(z2), null, null, null, null, Boolean.valueOf(z8), viewTrackingStrategy, boolValueOf2, lValueOf3, Boolean.valueOf(z9), Boolean.valueOf(telemetryEventHandler.a), Boolean.valueOf(z), null, null, Boolean.valueOf(z3), null, null, null, null, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3), null, null, null, null, null, null, null, strName, str, null, null, 536864508, -236189777, 103, null), null, 8, null));
    }

    public static final /* synthetic */ TelemetryDebugEvent TuitionPaymentFragmentspecialinlinedviewModeldefault2(TelemetryEventHandler telemetryEventHandler, recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, long j, String str, Map map) {
        LinkedHashMap linkedHashMap;
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect);
        if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        TelemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TelemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TelemetryDebugEvent.Source sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TelemetryDebugEvent.Source.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        if (sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TelemetryDebugEvent.Source.ANDROID;
        }
        TelemetryDebugEvent.Source source = sourceTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = recalculatetransformmatrixandcroprect.d;
        TelemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TelemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        TelemetryDebugEvent.g gVar = new TelemetryDebugEvent.g(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String str3 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.d;
        TelemetryDebugEvent.asBinder asbinder = str3 != null ? new TelemetryDebugEvent.asBinder(str3) : null;
        String str4 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
        return new TelemetryDebugEvent(tuitionPaymentFragmentspecialinlinedviewModeldefault2, j, "dd-sdk-android", source, str2, tuitionPaymentFragmentspecialinlinedviewModeldefault1, gVar, asbinder, str4 != null ? new TelemetryDebugEvent.b(str4) : null, null, new TelemetryDebugEvent.a(new TelemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2), new TelemetryDebugEvent.asInterface(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d), str, linkedHashMap), 512, null);
    }

    public static final /* synthetic */ TelemetryErrorEvent TuitionPaymentFragmentspecialinlinedviewModeldefault1(TelemetryEventHandler telemetryEventHandler, recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, long j, String str, String str2, String str3, Map map) {
        LinkedHashMap linkedHashMap;
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect);
        if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map map2 = linkedHashMap;
        TelemetryErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TelemetryErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TelemetryErrorEvent.Source sourceB = SurfaceProcessor.b(TelemetryErrorEvent.Source.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, telemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        if (sourceB == null) {
            sourceB = TelemetryErrorEvent.Source.ANDROID;
        }
        TelemetryErrorEvent.Source source = sourceB;
        String str4 = recalculatetransformmatrixandcroprect.d;
        TelemetryErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TelemetryErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        TelemetryErrorEvent.g gVar = new TelemetryErrorEvent.g(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String str5 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.d;
        TelemetryErrorEvent.d dVar = str5 != null ? new TelemetryErrorEvent.d(str5) : null;
        String str6 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
        return new TelemetryErrorEvent(tuitionPaymentFragmentspecialinlinedviewModeldefault3, j, "dd-sdk-android", source, str4, tuitionPaymentFragmentspecialinlinedviewModeldefault1, gVar, dVar, str6 != null ? new TelemetryErrorEvent.TuitionPaymentFragmentbindingInflater1(str6) : null, null, new TelemetryErrorEvent.asInterface(new TelemetryErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2), new TelemetryErrorEvent.asBinder(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d), str, (str2 == null && str3 == null) ? null : new TelemetryErrorEvent.a(str2, str3), map2), 512, null);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final getPreviewCapabilities.sendCustomAction p0, final ImageAnalysisNonBlockingAnalyzer1<Object> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        final LayoutSettings layoutSettings = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (b(layoutSettings)) {
            this.TuitionPaymentFragmentbindingInflater1.add(initialSurfaceRecreationCompleter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutSettings));
            this.asBinder++;
            ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("rum");
            if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null) {
                imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false, new Function2<recalculateTransformMatrixAndCropRect, ImageAnalysisNonBlockingAnalyzer, Unit>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventHandler$handleEvent$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Unit invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
                        b(recalculatetransformmatrixandcroprect, imageAnalysisNonBlockingAnalyzer);
                        return Unit.INSTANCE;
                    }

                    public final void b(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
                        Object objB;
                        Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzer, "");
                        long j = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b + recalculatetransformmatrixandcroprect.onTransact.b;
                        LayoutSettings layoutSettings2 = layoutSettings;
                        if (layoutSettings2 instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.C0002TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            objB = TelemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, recalculatetransformmatrixandcroprect, j, ((LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.C0002TuitionPaymentFragmentspecialinlinedviewModeldefault2) layoutSettings2).TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.C0002TuitionPaymentFragmentspecialinlinedviewModeldefault2) layoutSettings).TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                        } else if (layoutSettings2 instanceof LayoutSettings.TuitionPaymentFragmentbindingInflater1) {
                            objB = TelemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, recalculatetransformmatrixandcroprect, j, ((LayoutSettings.TuitionPaymentFragmentbindingInflater1) layoutSettings2).TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((LayoutSettings.TuitionPaymentFragmentbindingInflater1) layoutSettings).TuitionPaymentFragmentbindingInflater1);
                        } else if (layoutSettings2 instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) {
                            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TelemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect).TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) layoutSettings).TuitionPaymentFragmentbindingInflater1);
                            objB = TelemetryEventHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, recalculatetransformmatrixandcroprect, j, ((LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) layoutSettings).TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) layoutSettings).TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) layoutSettings).TuitionPaymentFragmentbindingInflater1, ((LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) layoutSettings).TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                        } else if (layoutSettings2 instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            objB = TelemetryEventHandler.b(this, recalculatetransformmatrixandcroprect, j, (LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1) layoutSettings2);
                        } else if (layoutSettings2 instanceof LayoutSettings.b) {
                            objB = TelemetryEventHandler.b(this, recalculatetransformmatrixandcroprect, j, (LayoutSettings.b) layoutSettings2);
                        } else if (layoutSettings2 instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            this.a = true;
                            objB = null;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (objB != null) {
                            p1.b(imageAnalysisNonBlockingAnalyzer, objB, EventType.TELEMETRY);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MetadataImageReaderExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect) {
        Map<String, Object> mapEmptyMap = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get("rum");
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        MetadataImageReaderExternalSyntheticLambda0.Companion companion = MetadataImageReaderExternalSyntheticLambda0.INSTANCE;
        return MetadataImageReaderExternalSyntheticLambda0.Companion.b(mapEmptyMap);
    }
}
