package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.ImageProxyDownsamplerForwardingImageProxyImpl;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\"\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00142\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00150 H\u0017¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010\u001d\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0015\u0010)\u001a\u00020&8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\"\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0015\u0010.\u001a\u00020&8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b.\u0010(R\u0014\u00100\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\"\u0010/R\u0016\u0010*\u001a\u0004\u0018\u00010\u00038\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010'\u001a\u00020\f8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u00101"}, d2 = {"LImageCaptureFlashMode;", "LImageCaptureOnImageSavedCallback;", "LisInfoEnabled;", "", "p0", "p1", "LImageProxyDownsamplerForwardingImageProxyImpl$b;", "p2", "Ljava/util/concurrent/ExecutorService;", "p3", "Lcom/datadog/android/api/InternalLogger;", "p4", "LanalyzeCachedImage;", "p5", "LconvertYUVToRGBInternal;", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;LImageProxyDownsamplerForwardingImageProxyImpl$b;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;LanalyzeCachedImage;LconvertYUVToRGBInternal;)V", "LImageCaptureImageCaptureCapabilitiesImpl;", "LImageCaptureBuilder;", "", "", "b", "(LImageCaptureImageCaptureCapabilitiesImpl;LImageCaptureBuilder;Z)V", "TuitionPaymentFragmentbindingInflater1", "()V", "Lcom/datadog/android/privacy/TrackingConsent;", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/privacy/TrackingConsent;)V", "LImageCaptureFlashType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LImageCaptureFlashType;", "LrecalculateTransformMatrixAndCropRect;", "Lkotlin/Function1;", "LImageAnalysisNonBlockingAnalyzer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LrecalculateTransformMatrixAndCropRect;ZLkotlin/jvm/functions/Function1;)V", "Ljava/util/concurrent/ExecutorService;", "Ljava/lang/String;", "LImageProxyDownsamplerForwardingImageProxyImpl;", "d", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "Lcom/datadog/android/api/InternalLogger;", "asInterface", "LImageProxyDownsamplerForwardingImageProxyImpl;", "g", "LImageProxyDownsamplerForwardingImageProxyImpl$b;", "a", "LanalyzeCachedImage;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageCaptureFlashMode implements ImageCaptureOnImageSavedCallback, isInfoEnabled {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final ExecutorService b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final analyzeCachedImage d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final ImageProxyDownsamplerForwardingImageProxyImpl.b a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final ImageProxyDownsamplerForwardingImageProxyImpl TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy g;

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackingConsent.values().length];
            try {
                iArr[TrackingConsent.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingConsent.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImageCaptureFlashMode(String str, String str2, ImageProxyDownsamplerForwardingImageProxyImpl.b bVar, ExecutorService executorService, InternalLogger internalLogger, analyzeCachedImage analyzecachedimage, convertYUVToRGBInternal convertyuvtorgbinternal) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(analyzecachedimage, "");
        Intrinsics.checkNotNullParameter(convertyuvtorgbinternal, "");
        this.asBinder = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.a = bVar;
        this.b = executorService;
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
        this.d = analyzecachedimage;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ImageProxyDownsamplerForwardingImageProxyImpl>() { // from class: com.datadog.android.core.internal.persistence.AbstractStorage$grantedPersistenceStrategy$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final ImageProxyDownsamplerForwardingImageProxyImpl invoke() {
                ImageProxyDownsamplerForwardingImageProxyImpl.b bVar2 = this.this$0.a;
                String str3 = this.this$0.asBinder;
                String unused = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Objects.toString(TrackingConsent.GRANTED);
                int i = this.this$0.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                long j = this.this$0.d.b;
                return bVar2.TuitionPaymentFragmentbindingInflater1();
            }

            {
                super(0);
            }
        });
        this.g = LazyKt.lazy(new Function0<ImageProxyDownsamplerForwardingImageProxyImpl>() { // from class: com.datadog.android.core.internal.persistence.AbstractStorage$pendingPersistenceStrategy$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final ImageProxyDownsamplerForwardingImageProxyImpl invoke() {
                ImageProxyDownsamplerForwardingImageProxyImpl.b bVar2 = this.this$0.a;
                String str3 = this.this$0.asBinder;
                String unused = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Objects.toString(TrackingConsent.PENDING);
                int i = this.this$0.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                long j = this.this$0.d.b;
                return bVar2.TuitionPaymentFragmentbindingInflater1();
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new chooseCombo();
        convertyuvtorgbinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements ImageAnalysisNonBlockingAnalyzer {
        private /* synthetic */ ImageProxyDownsamplerForwardingImageProxyImpl TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(ImageProxyDownsamplerForwardingImageProxyImpl imageProxyDownsamplerForwardingImageProxyImpl) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageProxyDownsamplerForwardingImageProxyImpl;
        }

        @Override // defpackage.ImageAnalysisNonBlockingAnalyzer
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageCapture imageCapture, EventType eventType) {
            Intrinsics.checkNotNullParameter(imageCapture, "");
            Intrinsics.checkNotNullParameter(eventType, "");
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(imageCapture, eventType);
        }
    }

    @Override // defpackage.ImageCaptureOnImageSavedCallback
    public final void TuitionPaymentFragmentbindingInflater1() {
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, "Data drop", this.TuitionPaymentFragmentbindingInflater1, new Runnable() { // from class: isCaptureProcessProgressSupported
            @Override // java.lang.Runnable
            public final void run() {
                ImageCaptureFlashMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
            }
        });
    }

    @Override // defpackage.isInfoEnabled
    public final void TuitionPaymentFragmentbindingInflater1(final TrackingConsent p0, final TrackingConsent p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, "Data migration", this.TuitionPaymentFragmentbindingInflater1, new Runnable() { // from class: ImageCaptureCaptureMode
            @Override // java.lang.Runnable
            public final void run() {
                ImageCaptureFlashMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, p1, this);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function1 function1, ImageProxyDownsamplerForwardingImageProxyImpl imageProxyDownsamplerForwardingImageProxyImpl) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(imageProxyDownsamplerForwardingImageProxyImpl, "");
        function1.invoke(new TuitionPaymentFragmentbindingInflater1(imageProxyDownsamplerForwardingImageProxyImpl));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TrackingConsent trackingConsent, TrackingConsent trackingConsent2, ImageCaptureFlashMode imageCaptureFlashMode) {
        Intrinsics.checkNotNullParameter(trackingConsent, "");
        Intrinsics.checkNotNullParameter(trackingConsent2, "");
        Intrinsics.checkNotNullParameter(imageCaptureFlashMode, "");
        if (trackingConsent == TrackingConsent.PENDING) {
            int i = WhenMappings.$EnumSwitchMapping$0[trackingConsent2.ordinal()];
            if (i == 1) {
                ((ImageProxyDownsamplerForwardingImageProxyImpl) imageCaptureFlashMode.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3((ImageProxyDownsamplerForwardingImageProxyImpl) imageCaptureFlashMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            } else if (i == 3) {
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageCaptureFlashMode imageCaptureFlashMode) {
        Intrinsics.checkNotNullParameter(imageCaptureFlashMode, "");
    }

    @Override // defpackage.ImageCaptureOnImageSavedCallback
    public final void b(ImageCaptureImageCaptureCapabilitiesImpl p0, ImageCaptureBuilder p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p2) {
            ((ImageProxyDownsamplerForwardingImageProxyImpl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            ((ImageProxyDownsamplerForwardingImageProxyImpl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    @Override // defpackage.ImageCaptureOnImageSavedCallback
    public final ImageCaptureFlashType TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return null;
    }

    @Override // defpackage.ImageCaptureOnImageSavedCallback
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculateTransformMatrixAndCropRect p0, boolean p1, final Function1<? super ImageAnalysisNonBlockingAnalyzer, Unit> p2) {
        final ImageProxyDownsamplerForwardingImageProxyImpl imageProxyDownsamplerForwardingImageProxyImpl;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        int i = WhenMappings.$EnumSwitchMapping$0[p0.notify.ordinal()];
        if (i == 1) {
            imageProxyDownsamplerForwardingImageProxyImpl = (ImageProxyDownsamplerForwardingImageProxyImpl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        } else if (i == 2) {
            imageProxyDownsamplerForwardingImageProxyImpl = (ImageProxyDownsamplerForwardingImageProxyImpl) this.g.getValue();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            imageProxyDownsamplerForwardingImageProxyImpl = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, "Data write", this.TuitionPaymentFragmentbindingInflater1, new Runnable() { // from class: ImageCaptureDefaults
            @Override // java.lang.Runnable
            public final void run() {
                ImageCaptureFlashMode.TuitionPaymentFragmentbindingInflater1(p2, imageProxyDownsamplerForwardingImageProxyImpl);
            }
        });
    }
}
