package defpackage;

import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes7.dex */
public final class r8lambdaQiw_1x4yhF4ntlZsRCSMeKTMWf8<A, B, C> implements videoProfileHdrFormatsToDynamicRangeEncoding<Triple<? extends A, ? extends B, ? extends C>> {
    private final createImageAnalysis TuitionPaymentFragmentbindingInflater1;
    private final videoProfileHdrFormatsToDynamicRangeEncoding<B> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final videoProfileHdrFormatsToDynamicRangeEncoding<C> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final videoProfileHdrFormatsToDynamicRangeEncoding<A> b;

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        setActiveRecording setactiverecordingBeginStructure = stoplisteningtorotationevents.beginStructure(getDescriptor());
        if (!setactiverecordingBeginStructure.decodeSequentially()) {
            Object objDecodeSerializableElement = propagateIfHasValue.b;
            Object objDecodeSerializableElement2 = propagateIfHasValue.b;
            Object objDecodeSerializableElement3 = propagateIfHasValue.b;
            while (true) {
                int iDecodeElementIndex = setactiverecordingBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    setactiverecordingBeginStructure.endStructure(getDescriptor());
                    if (objDecodeSerializableElement != propagateIfHasValue.b) {
                        if (objDecodeSerializableElement2 != propagateIfHasValue.b) {
                            if (objDecodeSerializableElement3 == propagateIfHasValue.b) {
                                throw new SerializationException("Element 'third' is missing");
                            }
                            return new Triple(objDecodeSerializableElement, objDecodeSerializableElement2, objDecodeSerializableElement3);
                        }
                        throw new SerializationException("Element 'second' is missing");
                    }
                    throw new SerializationException("Element 'first' is missing");
                }
                if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement = setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 0, this.b, null);
                } else if (iDecodeElementIndex == 1) {
                    objDecodeSerializableElement2 = setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationException("Unexpected index ".concat(String.valueOf(iDecodeElementIndex)));
                    }
                    objDecodeSerializableElement3 = setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
                }
            }
        } else {
            Object objDecodeSerializableElement4 = setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 0, this.b, null);
            Object objDecodeSerializableElement5 = setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
            Object objDecodeSerializableElement6 = setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
            setactiverecordingBeginStructure.endStructure(getDescriptor());
            return new Triple(objDecodeSerializableElement4, objDecodeSerializableElement5, objDecodeSerializableElement6);
        }
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        Triple triple = (Triple) obj;
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter(triple, "");
        isUseCaseEnabled isusecaseenabledBeginStructure = startlisteningtorotationevents.beginStructure(getDescriptor());
        isusecaseenabledBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.b, triple.getFirst());
        isusecaseenabledBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, triple.getSecond());
        isusecaseenabledBeginStructure.encodeSerializableElement(getDescriptor(), 2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, triple.getThird());
        isusecaseenabledBeginStructure.endStructure(getDescriptor());
    }

    public r8lambdaQiw_1x4yhF4ntlZsRCSMeKTMWf8(videoProfileHdrFormatsToDynamicRangeEncoding<A> videoprofilehdrformatstodynamicrangeencoding, videoProfileHdrFormatsToDynamicRangeEncoding<B> videoprofilehdrformatstodynamicrangeencoding2, videoProfileHdrFormatsToDynamicRangeEncoding<C> videoprofilehdrformatstodynamicrangeencoding3) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding2, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding3, "");
        this.b = videoprofilehdrformatstodynamicrangeencoding;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoprofilehdrformatstodynamicrangeencoding2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoprofilehdrformatstodynamicrangeencoding3;
        this.TuitionPaymentFragmentbindingInflater1 = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("kotlin.Triple", new createImageAnalysis[0], new Function1() { // from class: LifecycleCameraController
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r8lambdaQiw_1x4yhF4ntlZsRCSMeKTMWf8.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (calculateUptimeToRealtimeOffsetUs) obj);
            }
        });
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public static /* synthetic */ Unit b(r8lambdaQiw_1x4yhF4ntlZsRCSMeKTMWf8 r8lambdaqiw_1x4yhf4ntlzsrcsmektmwf8, calculateUptimeToRealtimeOffsetUs calculateuptimetorealtimeoffsetus) {
        Intrinsics.checkNotNullParameter(calculateuptimetorealtimeoffsetus, "");
        calculateuptimetorealtimeoffsetus.b("first", r8lambdaqiw_1x4yhf4ntlzsrcsmektmwf8.b.getDescriptor(), CollectionsKt.emptyList(), false);
        calculateuptimetorealtimeoffsetus.b("second", r8lambdaqiw_1x4yhf4ntlzsrcsmektmwf8.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getDescriptor(), CollectionsKt.emptyList(), false);
        calculateuptimetorealtimeoffsetus.b("third", r8lambdaqiw_1x4yhf4ntlzsrcsmektmwf8.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getDescriptor(), CollectionsKt.emptyList(), false);
        return Unit.INSTANCE;
    }
}
