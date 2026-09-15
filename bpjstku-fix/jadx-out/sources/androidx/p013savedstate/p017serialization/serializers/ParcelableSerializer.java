package androidx.p013savedstate.p017serialization.serializers;

import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
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
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/savedstate/serialization/serializers/ParcelableSerializer;", "Landroid/os/Parcelable;", ExifInterface.GPS_DIRECTION_TRUE, "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "<init>", "()V", "LstartListeningToRotationEvents;", "p0", "p1", "", "serialize", "(LstartListeningToRotationEvents;Landroid/os/Parcelable;)V", "LstopListeningToRotationEvents;", "deserialize", "(LstopListeningToRotationEvents;)Landroid/os/Parcelable;", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ParcelableSerializer<T extends Parcelable> implements videoProfileHdrFormatsToDynamicRangeEncoding<T> {
    private final createImageAnalysis descriptor = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("android.os.Parcelable", new createImageAnalysis[0], new getViewportAspectRatioInt());

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!(p0 instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(this.descriptor.getB(), p0).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) p0;
        SavedStateWriter.m7478putParcelableimpl(SavedStateWriter.m7454constructorimpl(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), p1);
    }

    @Override // defpackage.isBitDepthMatched
    public final T deserialize(stopListeningToRotationEvents p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!(p0 instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(this.descriptor.getB(), p0).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) p0;
        T t = (T) SavedStateReader.m7414getParcelableimpl(SavedStateReader.m7368constructorimpl(savedStateDecoder.getSavedState()), savedStateDecoder.getKey(), Reflection.getOrCreateKotlinClass(Parcelable.class));
        Intrinsics.checkNotNull(t, "");
        return t;
    }
}
