package androidx.p013savedstate.p017serialization;

import android.os.Parcelable;
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
import defpackage.createImageAnalysis;
import defpackage.isBitDepthMatched;
import defpackage.stopListeningToRotationEvents;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/savedstate/serialization/SavedStateDecoder;", "LisBitDepthMatched;", "p0", "decodeFormatSpecificTypesOnPlatform", "(Landroidx/savedstate/serialization/SavedStateDecoder;LisBitDepthMatched;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "", "", "getArrayKClass", "(LisBitDepthMatched;)Lkotlin/reflect/KClass;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateDecoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T decodeFormatSpecificTypesOnPlatform(SavedStateDecoder savedStateDecoder, isBitDepthMatched<? extends T> isbitdepthmatched) {
        Intrinsics.checkNotNullParameter(savedStateDecoder, "");
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        createImageAnalysis descriptor = isbitdepthmatched.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            return (T) CharSequenceSerializer.INSTANCE.deserialize((stopListeningToRotationEvents) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            return (T) DefaultParcelableSerializer.INSTANCE.deserialize((stopListeningToRotationEvents) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            return (T) DefaultJavaSerializableSerializer.INSTANCE.deserialize((stopListeningToRotationEvents) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            return (T) IBinderSerializer.INSTANCE.deserialize((stopListeningToRotationEvents) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            return (T) CharSequenceArraySerializer.INSTANCE.deserialize((stopListeningToRotationEvents) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            return (T) CharSequenceListSerializer.INSTANCE.deserialize((stopListeningToRotationEvents) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor())) {
            Parcelable[] parcelableArrDeserialize = ParcelableArraySerializer.INSTANCE.deserialize((stopListeningToRotationEvents) savedStateDecoder);
            return (T) Arrays.copyOf(parcelableArrDeserialize, parcelableArrDeserialize.length, JvmClassMappingKt.getJavaClass((KClass) getArrayKClass(isbitdepthmatched)));
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            return (T) ParcelableArraySerializer.INSTANCE.deserialize((stopListeningToRotationEvents) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            return (T) ParcelableListSerializer.INSTANCE.deserialize((stopListeningToRotationEvents) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return (T) SparseParcelableArraySerializer.INSTANCE.deserialize((stopListeningToRotationEvents) savedStateDecoder);
        }
        return null;
    }

    private static final KClass<Object[]> getArrayKClass(isBitDepthMatched<?> isbitdepthmatched) {
        Object objDeserialize = isbitdepthmatched.deserialize(EmptyArrayDecoder.INSTANCE);
        Intrinsics.checkNotNull(objDeserialize);
        return Reflection.getOrCreateKotlinClass(objDeserialize.getClass());
    }
}
