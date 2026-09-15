package androidx.p013savedstate.p017serialization.serializers;

import android.os.Bundle;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0007\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/savedstate/serialization/serializers/SavedStateSerializer;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "<init>", "()V", "LstartListeningToRotationEvents;", "p0", "p1", "", "serialize", "(LstartListeningToRotationEvents;Landroid/os/Bundle;)V", "LstopListeningToRotationEvents;", "deserialize", "(LstopListeningToRotationEvents;)Landroid/os/Bundle;", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateSerializer implements videoProfileHdrFormatsToDynamicRangeEncoding<Bundle> {
    public static final SavedStateSerializer INSTANCE = new SavedStateSerializer();
    private static final createImageAnalysis descriptor = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("androidx.savedstate.SavedState", new createImageAnalysis[0], new getViewportAspectRatioInt());

    private SavedStateSerializer() {
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!(p0 instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(INSTANCE.getDescriptor().getINotificationSideChannel(), p0).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) p0;
        if (Intrinsics.areEqual(savedStateEncoder.getKey(), "")) {
            SavedStateWriter.m7458putAllimpl(SavedStateWriter.m7454constructorimpl(savedStateEncoder.getSavedState()), p1);
        } else {
            SavedStateWriter.m7481putSavedStateimpl(SavedStateWriter.m7454constructorimpl(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), p1);
        }
    }

    @Override // defpackage.isBitDepthMatched
    public final Bundle deserialize(stopListeningToRotationEvents p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!(p0 instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(INSTANCE.getDescriptor().getINotificationSideChannel(), p0).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) p0;
        if (Intrinsics.areEqual(savedStateDecoder.getKey(), "")) {
            return savedStateDecoder.getSavedState();
        }
        return SavedStateReader.m7425getSavedStateimpl(SavedStateReader.m7368constructorimpl(savedStateDecoder.getSavedState()), savedStateDecoder.getKey());
    }
}
