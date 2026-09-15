package androidx.p013savedstate.p017serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import androidx.p013savedstate.p017serialization.serializers.CharSequenceArraySerializer;
import androidx.p013savedstate.p017serialization.serializers.CharSequenceListSerializer;
import androidx.p013savedstate.p017serialization.serializers.CharSequenceSerializer;
import androidx.p013savedstate.p017serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.p013savedstate.p017serialization.serializers.DefaultParcelableSerializer;
import androidx.p013savedstate.p017serialization.serializers.IBinderSerializer;
import androidx.p013savedstate.p017serialization.serializers.ParcelableArraySerializer;
import androidx.p013savedstate.p017serialization.serializers.ParcelableListSerializer;
import androidx.p013savedstate.p017serialization.serializers.SparseParcelableArraySerializer;
import defpackage.QualityAddedEncoderProfilesProvider;
import defpackage.createImageAnalysis;
import defpackage.startListeningToRotationEvents;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/savedstate/serialization/SavedStateEncoder;", "LQualityAddedEncoderProfilesProvider;", "p0", "p1", "", "encodeFormatSpecificTypesOnPlatform", "(Landroidx/savedstate/serialization/SavedStateEncoder;LQualityAddedEncoderProfilesProvider;Ljava/lang/Object;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateEncoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean encodeFormatSpecificTypesOnPlatform(SavedStateEncoder savedStateEncoder, QualityAddedEncoderProfilesProvider<? super T> qualityAddedEncoderProfilesProvider, T t) {
        Intrinsics.checkNotNullParameter(savedStateEncoder, "");
        Intrinsics.checkNotNullParameter(qualityAddedEncoderProfilesProvider, "");
        createImageAnalysis descriptor = qualityAddedEncoderProfilesProvider.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            Intrinsics.checkNotNull(t, "");
            CharSequenceSerializer.INSTANCE.serialize((startListeningToRotationEvents) savedStateEncoder, (CharSequence) t);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            Intrinsics.checkNotNull(t, "");
            DefaultParcelableSerializer.INSTANCE.serialize((startListeningToRotationEvents) savedStateEncoder, (Parcelable) t);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            Intrinsics.checkNotNull(t, "");
            DefaultJavaSerializableSerializer.INSTANCE.serialize((startListeningToRotationEvents) savedStateEncoder, (Serializable) t);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            Intrinsics.checkNotNull(t, "");
            IBinderSerializer.INSTANCE.serialize((startListeningToRotationEvents) savedStateEncoder, (IBinder) t);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            Intrinsics.checkNotNull(t, "");
            CharSequenceArraySerializer.INSTANCE.serialize((startListeningToRotationEvents) savedStateEncoder, (CharSequence[]) t);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            Intrinsics.checkNotNull(t, "");
            CharSequenceListSerializer.INSTANCE.serialize((startListeningToRotationEvents) savedStateEncoder, (List<? extends CharSequence>) t);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            Intrinsics.checkNotNull(t, "");
            ParcelableArraySerializer.INSTANCE.serialize((startListeningToRotationEvents) savedStateEncoder, (Parcelable[]) t);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            Intrinsics.checkNotNull(t, "");
            ParcelableListSerializer.INSTANCE.serialize((startListeningToRotationEvents) savedStateEncoder, (List<? extends Parcelable>) t);
            return true;
        }
        if (!Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) && !Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) && !Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return false;
        }
        Intrinsics.checkNotNull(t, "");
        SparseParcelableArraySerializer.INSTANCE.serialize((startListeningToRotationEvents) savedStateEncoder, (SparseArray<Parcelable>) t);
        return true;
    }
}
