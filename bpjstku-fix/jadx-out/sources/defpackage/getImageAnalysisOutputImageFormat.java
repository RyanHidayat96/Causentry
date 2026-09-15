package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b*\u00028\u00022\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\n\u001a\u00028\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\f\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0014\u001a\u00020\u001a8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0003\u001d\u001e\u001f"}, d2 = {"LgetImageAnalysisOutputImageFormat;", "Element", "Collection", "Builder", "LspeedUpZoomBy2X;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "p0", "<init>", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;)V", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/Object;ILjava/lang/Object;)V", "LstartListeningToRotationEvents;", "serialize", "(LstartListeningToRotationEvents;Ljava/lang/Object;)V", "LsetActiveRecording;", "p2", "p3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LsetActiveRecording;Ljava/lang/Object;II)V", "", "(LsetActiveRecording;ILjava/lang/Object;Z)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "LgetImageAnalysisBackpressureStrategy;", "LonRotationChanged;", "Llambdaaccept0androidxcameraviewCameraController2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getImageAnalysisOutputImageFormat<Element, Collection, Builder> extends speedUpZoomBy2X<Element, Collection, Builder> {
    private final videoProfileHdrFormatsToDynamicRangeEncoding<Element> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Builder builder, int i, Element element);

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public abstract createImageAnalysis getDescriptor();

    private getImageAnalysisOutputImageFormat(videoProfileHdrFormatsToDynamicRangeEncoding<Element> videoprofilehdrformatstodynamicrangeencoding) {
        super(null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoprofilehdrformatstodynamicrangeencoding;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public void serialize(startListeningToRotationEvents p0, Collection p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        int iB = b(p1);
        createImageAnalysis descriptor = getDescriptor();
        isUseCaseEnabled isusecaseenabledBeginCollection = p0.beginCollection(descriptor, iB);
        Iterator<Element> itTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1);
        for (int i = 0; i < iB; i++) {
            isusecaseenabledBeginCollection.encodeSerializableElement(getDescriptor(), i, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, itTuitionPaymentFragmentspecialinlinedviewModeldefault3.next());
        }
        isusecaseenabledBeginCollection.endStructure(descriptor);
    }

    @Override // defpackage.speedUpZoomBy2X
    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(setActiveRecording p0, Builder p1, int p2, int p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p3 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i = 0; i < p3; i++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, p2 + i, p1, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.speedUpZoomBy2X
    protected void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording p0, int p1, Builder p2, boolean p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(p2, p1, p0.decodeSerializableElement(getDescriptor(), p1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null));
    }

    public /* synthetic */ getImageAnalysisOutputImageFormat(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoprofilehdrformatstodynamicrangeencoding);
    }
}
