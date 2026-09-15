package androidx.p013savedstate.p017serialization.serializers;

import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import androidx.p013savedstate.p017serialization.SavedStateDecoder;
import androidx.p013savedstate.p017serialization.SavedStateEncoder;
import defpackage.createImageAnalysis;
import defpackage.getViewportAspectRatioInt;
import defpackage.getViewportAspectRatioStrategy;
import defpackage.startListeningToRotationEvents;
import defpackage.stopListeningToRotationEvents;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/savedstate/serialization/serializers/CharSequenceArraySerializer;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "", "<init>", "()V", "LstartListeningToRotationEvents;", "p0", "p1", "", "serialize", "(LstartListeningToRotationEvents;[Ljava/lang/CharSequence;)V", "LstopListeningToRotationEvents;", "deserialize", "(LstopListeningToRotationEvents;)[Ljava/lang/CharSequence;", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CharSequenceArraySerializer implements videoProfileHdrFormatsToDynamicRangeEncoding<CharSequence[]> {
    public static final CharSequenceArraySerializer INSTANCE = new CharSequenceArraySerializer();
    private static final createImageAnalysis descriptor = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("kotlin.Array<kotlin.CharSequence>", new createImageAnalysis[0], new getViewportAspectRatioInt());

    private CharSequenceArraySerializer() {
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, CharSequence[] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!(p0 instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(INSTANCE.getDescriptor().getINotificationSideChannel(), p0).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) p0;
        SavedStateWriter.m7465putCharSequenceArrayimpl(SavedStateWriter.m7454constructorimpl(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), p1);
    }

    @Override // defpackage.isBitDepthMatched
    public final CharSequence[] deserialize(stopListeningToRotationEvents p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!(p0 instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(INSTANCE.getDescriptor().getINotificationSideChannel(), p0).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) p0;
        return SavedStateReader.m7386getCharSequenceArrayimpl(SavedStateReader.m7368constructorimpl(savedStateDecoder.getSavedState()), savedStateDecoder.getKey());
    }
}
