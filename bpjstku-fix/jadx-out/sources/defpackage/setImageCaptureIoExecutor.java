package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0001\u0002\u001f "}, d2 = {"LsetImageCaptureIoExecutor;", "Key", "Value", "Collection", "", "Builder", "LspeedUpZoomBy2X;", "", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "p0", "p1", "<init>", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;LvideoProfileHdrFormatsToDynamicRangeEncoding;)V", "LsetActiveRecording;", "", "p2", "", "p3", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LsetActiveRecording;ILjava/util/Map;Z)V", "LstartListeningToRotationEvents;", "serialize", "(LstartListeningToRotationEvents;Ljava/lang/Object;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "LisImageCaptureEnabled;", "LsetImageAnalysisAnalyzer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setImageCaptureIoExecutor<Key, Value, Collection, Builder extends Map<Key, Value>> extends speedUpZoomBy2X<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final videoProfileHdrFormatsToDynamicRangeEncoding<Key> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final videoProfileHdrFormatsToDynamicRangeEncoding<Value> b;

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public abstract createImageAnalysis getDescriptor();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(setActiveRecording setactiverecording, Object obj, int i, int i2) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, i2 * 2), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(setactiverecording, i + first, map, false);
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    private setImageCaptureIoExecutor(videoProfileHdrFormatsToDynamicRangeEncoding<Key> videoprofilehdrformatstodynamicrangeencoding, videoProfileHdrFormatsToDynamicRangeEncoding<Value> videoprofilehdrformatstodynamicrangeencoding2) {
        super(null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoprofilehdrformatstodynamicrangeencoding;
        this.b = videoprofilehdrformatstodynamicrangeencoding2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.speedUpZoomBy2X
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording p0, int p1, Builder p2, boolean p3) {
        int iDecodeElementIndex;
        Object objDecodeSerializableElement;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Object objDecodeSerializableElement2 = p0.decodeSerializableElement(getDescriptor(), p1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        if (p3) {
            iDecodeElementIndex = p0.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != p1 + 1) {
                StringBuilder sb = new StringBuilder("Value must follow key in a map, index for key: ");
                sb.append(p1);
                sb.append(", returned index for value: ");
                sb.append(iDecodeElementIndex);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        } else {
            iDecodeElementIndex = p1 + 1;
        }
        if (p2.containsKey(objDecodeSerializableElement2) && !(this.b.getDescriptor().TuitionPaymentFragmentbindingInflater1() instanceof checkAudioPermissionGranted)) {
            objDecodeSerializableElement = p0.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, this.b, MapsKt.getValue(p2, objDecodeSerializableElement2));
        } else {
            objDecodeSerializableElement = p0.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, this.b, null);
        }
        p2.put(objDecodeSerializableElement2, objDecodeSerializableElement);
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public void serialize(startListeningToRotationEvents p0, Collection p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        int iB = b(p1);
        createImageAnalysis descriptor = getDescriptor();
        isUseCaseEnabled isusecaseenabledBeginCollection = p0.beginCollection(descriptor, iB);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1);
        int i = 0;
        while (itTuitionPaymentFragmentspecialinlinedviewModeldefault3.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itTuitionPaymentFragmentspecialinlinedviewModeldefault3.next();
            Key key = next.getKey();
            Value value = next.getValue();
            isusecaseenabledBeginCollection.encodeSerializableElement(getDescriptor(), i, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, key);
            isusecaseenabledBeginCollection.encodeSerializableElement(getDescriptor(), i + 1, this.b, value);
            i += 2;
        }
        isusecaseenabledBeginCollection.endStructure(descriptor);
    }

    public /* synthetic */ setImageCaptureIoExecutor(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding, videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding2, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoprofilehdrformatstodynamicrangeencoding, videoprofilehdrformatstodynamicrangeencoding2);
    }
}
