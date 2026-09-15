package androidx.p013savedstate.p017serialization.serializers;

import android.os.IBinder;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/savedstate/serialization/serializers/IBinderSerializer;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Landroid/os/IBinder;", "<init>", "()V", "LstartListeningToRotationEvents;", "p0", "p1", "", "serialize", "(LstartListeningToRotationEvents;Landroid/os/IBinder;)V", "LstopListeningToRotationEvents;", "deserialize", "(LstopListeningToRotationEvents;)Landroid/os/IBinder;", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IBinderSerializer implements videoProfileHdrFormatsToDynamicRangeEncoding<IBinder> {
    public static final IBinderSerializer INSTANCE = new IBinderSerializer();
    private static final createImageAnalysis descriptor = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("android.os.IBinder", new createImageAnalysis[0], new getViewportAspectRatioInt());

    private IBinderSerializer() {
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, IBinder p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!(p0 instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(INSTANCE.getDescriptor().getINotificationSideChannel(), p0).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) p0;
        SavedStateWriter.m7459putBinderimpl(SavedStateWriter.m7454constructorimpl(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), p1);
    }

    @Override // defpackage.isBitDepthMatched
    public final IBinder deserialize(stopListeningToRotationEvents p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!(p0 instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(INSTANCE.getDescriptor().getINotificationSideChannel(), p0).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) p0;
        return SavedStateReader.m7375getBinderimpl(SavedStateReader.m7368constructorimpl(savedStateDecoder.getSavedState()), savedStateDecoder.getKey());
    }
}
