package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.privacy.TrackingConsent;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0010\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0014J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0017¢\u0006\u0004\b\u0012\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u0017\u0010\u001aJ!\u0010\u0012\u001a\u00020\u001b2\b\u0010\u0004\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0012\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u0012\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0012\u0010\u001eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0017\u001a\u00020\u00018\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u001f\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001d\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010'\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010!\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\""}, d2 = {"LtakePicturedefault;", "LImageCaptureOutputFileOptionsBuilder;", "LisInfoEnabled;", "LconvertYUVToRGBInternal;", "p0", "p1", "p2", "LImageCaptureExtKttakePicture21;", "Lcom/datadog/android/privacy/TrackingConsent;", "p3", "Ljava/util/concurrent/ExecutorService;", "p4", "Lcom/datadog/android/api/InternalLogger;", "p5", "<init>", "(LconvertYUVToRGBInternal;LImageCaptureOutputFileOptionsBuilder;LImageCaptureOutputFileOptionsBuilder;LImageCaptureExtKttakePicture21;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;)V", "", "Ljava/io/File;", "b", "()Ljava/util/List;", "(Ljava/io/File;)Ljava/io/File;", "", "(Ljava/util/Set;)Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Ljava/io/File;", "", "(Z)Ljava/io/File;", "", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/privacy/TrackingConsent;)V", "TuitionPaymentFragmentbindingInflater1", "(Lcom/datadog/android/privacy/TrackingConsent;)LImageCaptureOutputFileOptionsBuilder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LImageCaptureExtKttakePicture21;", "d", "LImageCaptureOutputFileOptionsBuilder;", "a", "Ljava/util/concurrent/ExecutorService;", "asBinder", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class takePicturedefault implements ImageCaptureOutputFileOptionsBuilder, isInfoEnabled {
    private static final ImageCaptureOutputFileOptionsBuilder b = new ImageCaptureScreenFlash();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final ImageCaptureOutputFileOptionsBuilder d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final ImageCaptureOutputFileOptionsBuilder TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final ImageCaptureExtKttakePicture21<TrackingConsent> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ImageCaptureOutputFileOptionsBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackingConsent.values().length];
            try {
                iArr[TrackingConsent.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingConsent.GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return null;
    }

    public takePicturedefault(convertYUVToRGBInternal convertyuvtorgbinternal, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder2, ImageCaptureExtKttakePicture21<TrackingConsent> imageCaptureExtKttakePicture21, ExecutorService executorService, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(convertyuvtorgbinternal, "");
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder, "");
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder2, "");
        Intrinsics.checkNotNullParameter(imageCaptureExtKttakePicture21, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.d = imageCaptureOutputFileOptionsBuilder;
        this.TuitionPaymentFragmentbindingInflater1 = imageCaptureOutputFileOptionsBuilder2;
        this.b = imageCaptureExtKttakePicture21;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = executorService;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
        b(null, convertyuvtorgbinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        convertyuvtorgbinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean p0) {
        ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (imageCaptureOutputFileOptionsBuilder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageCaptureOutputFileOptionsBuilder = null;
        }
        return imageCaptureOutputFileOptionsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File b(Set<? extends File> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.TuitionPaymentFragmentbindingInflater1.b(p0);
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final List<File> b() {
        return CollectionsKt.plus((Collection) this.d.b(), (Iterable) this.TuitionPaymentFragmentbindingInflater1.b());
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File b(File p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (imageCaptureOutputFileOptionsBuilder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageCaptureOutputFileOptionsBuilder = null;
        }
        return imageCaptureOutputFileOptionsBuilder.b(p0);
    }

    @Override // defpackage.isInfoEnabled
    public final void TuitionPaymentFragmentbindingInflater1(TrackingConsent p0, TrackingConsent p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        b(p0, p1);
    }

    private final void b(final TrackingConsent p0, final TrackingConsent p1) {
        final ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilderB = b(p0);
        final ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilderB2 = b(p1);
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Data migration", this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Runnable() { // from class: ImageCaptureExtKttakePicture22
            @Override // java.lang.Runnable
            public final void run() {
                takePicturedefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, p0, imageCaptureOutputFileOptionsBuilderB, p1, imageCaptureOutputFileOptionsBuilderB2);
            }
        });
    }

    private final ImageCaptureOutputFileOptionsBuilder b(TrackingConsent p0) {
        int i = p0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == -1 || i == 1) {
            return this.d;
        }
        if (i == 2) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        if (i == 3) {
            return b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(takePicturedefault takepicturedefault, TrackingConsent trackingConsent, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder, TrackingConsent trackingConsent2, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder2) {
        Intrinsics.checkNotNullParameter(takepicturedefault, "");
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder, "");
        Intrinsics.checkNotNullParameter(trackingConsent2, "");
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder2, "");
        takepicturedefault.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(trackingConsent, imageCaptureOutputFileOptionsBuilder, trackingConsent2, imageCaptureOutputFileOptionsBuilder2);
        takepicturedefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageCaptureOutputFileOptionsBuilder2;
    }
}
