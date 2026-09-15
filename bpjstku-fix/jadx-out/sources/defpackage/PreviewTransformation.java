package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LPreviewTransformation;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LPreviewStreamStateObserverExternalSyntheticLambda2;", "<init>", "()V", "LcreateImageAnalysis;", "TuitionPaymentFragmentbindingInflater1", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "b"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewTransformation implements videoProfileHdrFormatsToDynamicRangeEncoding<PreviewStreamStateObserverExternalSyntheticLambda2> {
    public static final PreviewTransformation INSTANCE = new PreviewTransformation();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private static final createImageAnalysis b = b.INSTANCE;

    private PreviewTransformation() {
    }

    @Override // defpackage.isBitDepthMatched
    public final /* bridge */ /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        getTextureViewCorrectionMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault2(stoplisteningtorotationevents);
        getTransformedSurfaceRect gettransformedsurfacerect = getTransformedSurfaceRect.INSTANCE;
        Intrinsics.checkNotNullParameter(gettransformedsurfacerect, "");
        return new PreviewStreamStateObserverExternalSyntheticLambda2((List) new unbindImageCaptureAndRecreate(gettransformedsurfacerect).deserialize(stoplisteningtorotationevents));
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* bridge */ /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        PreviewStreamStateObserverExternalSyntheticLambda2 previewStreamStateObserverExternalSyntheticLambda2 = (PreviewStreamStateObserverExternalSyntheticLambda2) obj;
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserverExternalSyntheticLambda2, "");
        getTextureViewCorrectionMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(startlisteningtorotationevents);
        getTransformedSurfaceRect gettransformedsurfacerect = getTransformedSurfaceRect.INSTANCE;
        Intrinsics.checkNotNullParameter(gettransformedsurfacerect, "");
        new unbindImageCaptureAndRecreate(gettransformedsurfacerect).serialize(startlisteningtorotationevents, previewStreamStateObserverExternalSyntheticLambda2);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\r\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0011\u001a\u00020\f8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00048\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017R\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\u0018R\u0014\u0010\r\u001a\u00020\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u001b"}, d2 = {"LPreviewTransformation$b;", "LcreateImageAnalysis;", "<init>", "()V", "", "p0", "", "", "b", "(I)Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)LcreateImageAnalysis;", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)I", "(I)Ljava/lang/String;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(I)Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "()Ljava/lang/String;", "()Ljava/util/List;", "()I", "()Z", "d", "LdeactivateRecording;", "()LdeactivateRecording;", "a"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class b implements createImageAnalysis {
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "kotlinx.serialization.json.JsonArray";
        private final /* synthetic */ createImageAnalysis TuitionPaymentFragmentbindingInflater1;

        private b() {
            getTransformedSurfaceRect gettransformedsurfacerect = getTransformedSurfaceRect.INSTANCE;
            Intrinsics.checkNotNullParameter(gettransformedsurfacerect, "");
            this.TuitionPaymentFragmentbindingInflater1 = new unbindImageCaptureAndRecreate(gettransformedsurfacerect).getDescriptor();
        }

        @Override // defpackage.createImageAnalysis
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
        public final String getINotificationSideChannel() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        @Override // defpackage.createImageAnalysis
        public final List<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.createImageAnalysis
        public final List<Annotation> b(int p0) {
            return this.TuitionPaymentFragmentbindingInflater1.b(p0);
        }

        @Override // defpackage.createImageAnalysis
        public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        }

        @Override // defpackage.createImageAnalysis
        public final int TuitionPaymentFragmentbindingInflater1(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(p0);
        }

        @Override // defpackage.createImageAnalysis
        public final String TuitionPaymentFragmentbindingInflater1(int p0) {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(p0);
        }

        @Override // defpackage.createImageAnalysis
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
        public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentbindingInflater1.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.createImageAnalysis
        public final deactivateRecording TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.createImageAnalysis
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int p0) {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
        }

        @Override // defpackage.createImageAnalysis
        public final boolean b() {
            return this.TuitionPaymentFragmentbindingInflater1.b();
        }

        @Override // defpackage.createImageAnalysis
        public final boolean d() {
            return this.TuitionPaymentFragmentbindingInflater1.d();
        }
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return b;
    }
}
