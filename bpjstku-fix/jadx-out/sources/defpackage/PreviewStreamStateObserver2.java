package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000e\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0001\u0001\u0016"}, d2 = {"LPreviewStreamStateObserver2;", "LexceedUptimeRealtimeDiffThreshold;", "LgetRemainingRotationDegrees;", "p0", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "p1", "<init>", "(LgetRemainingRotationDegrees;LPreviewViewImplementationOnSurfaceNotInUseListener;)V", ExifInterface.GPS_DIRECTION_TRUE, "LQualityAddedEncoderProfilesProvider;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LQualityAddedEncoderProfilesProvider;Ljava/lang/Object;)Ljava/lang/String;", "LisBitDepthMatched;", "TuitionPaymentFragmentbindingInflater1", "(LisBitDepthMatched;Ljava/lang/String;)Ljava/lang/Object;", "LgetRemainingRotationDegrees;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "LsetImplementationMode;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LsetImplementationMode;", "LPreviewStreamStateObserver2$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PreviewStreamStateObserver2 implements exceedUptimeRealtimeDiffThreshold {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final getRemainingRotationDegrees TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final PreviewViewImplementationOnSurfaceNotInUseListener TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final setImplementationMode TuitionPaymentFragmentbindingInflater1;

    private PreviewStreamStateObserver2(getRemainingRotationDegrees getremainingrotationdegrees, PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getremainingrotationdegrees;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = previewViewImplementationOnSurfaceNotInUseListener;
        this.TuitionPaymentFragmentbindingInflater1 = new setImplementationMode();
    }

    /* JADX INFO: renamed from: PreviewStreamStateObserver2$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPreviewStreamStateObserver2$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LPreviewStreamStateObserver2;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion extends PreviewStreamStateObserver2 {
        private Companion() {
            super(new getRemainingRotationDegrees(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), waitForNextFrame.b(), null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final <T> String TuitionPaymentFragmentspecialinlinedviewModeldefault3(QualityAddedEncoderProfilesProvider<? super T> p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        lambdaonSurfaceRequested2androidxcameraviewPreviewView1 lambdaonsurfacerequested2androidxcameraviewpreviewview1 = new lambdaonSurfaceRequested2androidxcameraviewPreviewView1();
        try {
            lambdaonSurfaceRequested2androidxcameraviewPreviewView1 lambdaonsurfacerequested2androidxcameraviewpreviewview2 = lambdaonsurfacerequested2androidxcameraviewpreviewview1;
            Intrinsics.checkNotNullParameter(this, "");
            Intrinsics.checkNotNullParameter(lambdaonsurfacerequested2androidxcameraviewpreviewview2, "");
            Intrinsics.checkNotNullParameter(p0, "");
            new fromId(lambdaonsurfacerequested2androidxcameraviewpreviewview2, this, WriteMode.OBJ, new transformView[WriteMode.TuitionPaymentFragmentbindingInflater1().size()]).encodeSerializableValue(p0, p1);
            return lambdaonsurfacerequested2androidxcameraviewpreviewview1.toString();
        } finally {
            getMeteringPointFactory.INSTANCE.b(lambdaonsurfacerequested2androidxcameraviewpreviewview1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public final <T> T TuitionPaymentFragmentbindingInflater1(isBitDepthMatched<? extends T> p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        PreviewViewImplementationMode previewViewImplementationModeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PreviewViewOnFrameUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, p1);
        T t = (T) new PreviewViewDisplayRotationListener(this, WriteMode.OBJ, previewViewImplementationModeTuitionPaymentFragmentspecialinlinedviewModeldefault2, p0.getDescriptor(), null).decodeSerializableValue(p0);
        previewViewImplementationModeTuitionPaymentFragmentspecialinlinedviewModeldefault2.g();
        return t;
    }

    public /* synthetic */ PreviewStreamStateObserver2(getRemainingRotationDegrees getremainingrotationdegrees, PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(getremainingrotationdegrees, previewViewImplementationOnSurfaceNotInUseListener);
    }
}
