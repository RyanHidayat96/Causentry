package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.DdRumContentProvider;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0016\b\u0001\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00182\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 J%\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00182\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0017¢\u0006\u0004\b\u001f\u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020$H\u0016¢\u0006\u0004\b\u001f\u0010%R\u0014\u0010\u001f\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\"\u0010&R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010'8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0014\u0010+\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010*R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0018\u0010,\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010*R\u0016\u0010)\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u00104R\u0014\u00100\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00105\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00107\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u00109\u001a\u0004\u0018\u00010\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010;\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b=\u0010&"}, d2 = {"LaddCameraSurfaceAndErrorListener;", "LPreview;", "LshouldMirror;", "", "p0", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p1", "", "p2", "", "p3", "p4", "LsetJpegQuality;", "p5", "LSafeCloseImageReaderProxy;", "p6", "p7", "p8", "LPreviewExternalSyntheticLambda3;", "p9", "LMetadataImageReader;", "p10", "<init>", "(Ljava/lang/String;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;FZZLsetJpegQuality;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;LPreviewExternalSyntheticLambda3;LMetadataImageReader;)V", "LgetPreviewCapabilities;", "LImageAnalysisNonBlockingAnalyzer1;", "", "", "b", "(LgetPreviewCapabilities;LImageAnalysisNonBlockingAnalyzer1;)V", "LMetadataImageReaderExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LMetadataImageReaderExternalSyntheticLambda0;", "(LgetPreviewCapabilities;LImageAnalysisNonBlockingAnalyzer1;)LPreview;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Z", "LlambdasendSurfaceRequest2;", "(LlambdasendSurfaceRequest2;)V", "Z", "", "Ljava/util/List;", "a", "LSafeCloseImageReaderProxy;", "TuitionPaymentFragmentbindingInflater1", "g", "LsetJpegQuality;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "d", "asBinder", "LlambdasendSurfaceRequest2;", "INotificationSideChannel", "LMetadataImageReaderExternalSyntheticLambda0;", "notify", "F", "cancelAll", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "onTransact", "LPreviewExternalSyntheticLambda3;", "cancel", "LMetadataImageReader;", "INotificationSideChannelDefault"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class addCameraSurfaceAndErrorListener implements Preview, shouldMirror {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final SafeCloseImageReaderProxy asBinder;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final boolean cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public MetadataImageReaderExternalSyntheticLambda0 a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SafeCloseImageReaderProxy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private lambdasendSurfaceRequest2 g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final SafeCloseImageReaderProxy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final List<Preview> b;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final MetadataImageReader onTransact;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 notify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean asInterface;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final setJpegQuality TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final float d;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final PreviewExternalSyntheticLambda3 cancelAll;

    @Override // defpackage.Preview
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return true;
    }

    public addCameraSurfaceAndErrorListener(String str, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, float f, boolean z, boolean z2, setJpegQuality setjpegquality, SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2, SafeCloseImageReaderProxy safeCloseImageReaderProxy3, PreviewExternalSyntheticLambda3 previewExternalSyntheticLambda3, MetadataImageReader metadataImageReader) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(setjpegquality, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy2, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy3, "");
        Intrinsics.checkNotNullParameter(previewExternalSyntheticLambda3, "");
        this.notify = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
        this.d = f;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        this.cancel = z2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = setjpegquality;
        this.TuitionPaymentFragmentbindingInflater1 = safeCloseImageReaderProxy;
        this.asBinder = safeCloseImageReaderProxy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = safeCloseImageReaderProxy3;
        this.cancelAll = previewExternalSyntheticLambda3;
        this.onTransact = metadataImageReader;
        this.a = new MetadataImageReaderExternalSyntheticLambda0(str, null, false, null, null, null, null, null, null, null, null, null, 0L, 0L, false, 32766, null);
        this.b = CollectionsKt.mutableListOf(new RumSessionScope(this, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, previewExternalSyntheticLambda3, f, z, z2, this, setjpegquality, safeCloseImageReaderProxy, safeCloseImageReaderProxy2, safeCloseImageReaderProxy3, metadataImageReader, false, 0L, 0L, 24576, null));
    }

    @Override // defpackage.Preview
    public final Preview TuitionPaymentFragmentspecialinlinedviewModeldefault3(getPreviewCapabilities p0, ImageAnalysisNonBlockingAnalyzer1<Object> p1) throws Throwable {
        Object next;
        lambdasendSurfaceRequest2 lambdasendsurfacerequest2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 instanceof getPreviewCapabilities.MediaBrowserCompat) {
            getPreviewCapabilities.MediaBrowserCompat mediaBrowserCompat = (getPreviewCapabilities.MediaBrowserCompat) p0;
            this.a = MetadataImageReaderExternalSyntheticLambda0.b(this.a, null, null, false, null, null, null, null, null, null, null, mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2, mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 0L, 0L, false, 29695);
        }
        boolean z = p0 instanceof getPreviewCapabilities.read;
        boolean z2 = z || (p0 instanceof getPreviewCapabilities.connect);
        Iterator<T> it = this.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Preview) next).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        if (((Preview) next) != null || !z2) {
            if (p0 instanceof getPreviewCapabilities.getRoot) {
                this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault2("rum", new Function1<Map<String, Object>, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumApplicationScope$handleEvent$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(Map<String, Object> map) {
                        b(map);
                        return Unit.INSTANCE;
                    }

                    public final void b(Map<String, Object> map) {
                        Intrinsics.checkNotNullParameter(map, "");
                        map.putAll(this.this$0.a.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    }

                    {
                        super(1);
                    }
                });
            }
        } else {
            RumSessionScope rumSessionScope = new RumSessionScope(this, this.notify, this.cancelAll, this.d, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.cancel, this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, this.asBinder, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.onTransact, true, 0L, 0L, 24576, null);
            this.b.add(rumSessionScope);
            if (!z && (lambdasendsurfacerequest2 = this.g) != null) {
                rumSessionScope.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getPreviewCapabilities.read(lambdasendsurfacerequest2.TuitionPaymentFragmentbindingInflater1, lambdasendsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null, 4, null), p1);
            }
            List<Preview> list = this.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Preview) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() > 1) {
                this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumApplicationScope$startNewSession$3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Application has multiple active sessions when starting a new session";
                    }
                }, null, false, null);
            }
        }
        if (!(p0 instanceof getPreviewCapabilities.getInterfaceDescriptor) && !this.asInterface) {
            lambdanew0androidxcameracoreMetadataImageReader tuitionPaymentFragmentspecialinlinedviewModeldefault2 = p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (DdRumContentProvider.INSTANCE.getProcessImportance$dd_sdk_android_rum_release() == 100) {
                long jAsBinder = this.notify.asBinder();
                b(new getPreviewCapabilities.a(new lambdanew0androidxcameracoreMetadataImageReader(TimeUnit.NANOSECONDS.toMillis((TimeUnit.MILLISECONDS.toNanos(tuitionPaymentFragmentspecialinlinedviewModeldefault2.b) - tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + jAsBinder), jAsBinder), tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - jAsBinder), p1);
                this.asInterface = true;
            }
        }
        b(p0, p1);
        return this;
    }

    @Override // defpackage.Preview
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final MetadataImageReaderExternalSyntheticLambda0 getA() {
        return this.a;
    }

    private final void b(getPreviewCapabilities p0, ImageAnalysisNonBlockingAnalyzer1<Object> p1) {
        Iterator<Preview> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1) == null) {
                it.remove();
            }
        }
    }

    @Override // defpackage.shouldMirror
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasendSurfaceRequest2 p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.b) {
            this.g = p0;
        }
    }
}
