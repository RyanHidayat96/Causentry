package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.serialization.SerializableSaverKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p013savedstate.p017serialization.SavedStateConfiguration;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.isCloseToRealtime;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\b\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0087\b¢\u0006\u0002\u0010\t\u001aU\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0007¢\u0006\u0002\u0010\f\u001aX\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00010\r\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\b\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\r0\bH\u0087\b¢\u0006\u0002\u0010\u000e\u001aa\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\r0\bH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"rememberSerializable", ExifInterface.GPS_DIRECTION_TRUE, "", "inputs", "", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "init", "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "([Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "Landroidx/compose/runtime/MutableState;", "([Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "stateSerializer", "([Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "runtime-saveable"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberSerializableKt {
    /* JADX INFO: renamed from: rememberSerializable, reason: collision with other method in class */
    public static final /* synthetic */ <T> T m3665rememberSerializable(Object[] objArr, SavedStateConfiguration savedStateConfiguration, Function0<? extends T> function0, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        SavedStateConfiguration savedStateConfiguration2 = savedStateConfiguration;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        PreviewViewImplementationOnSurfaceNotInUseListener serializersModule = savedStateConfiguration2.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) m3666rememberSerializable(objArrCopyOf, (videoProfileHdrFormatsToDynamicRangeEncoding) isCloseToRealtime.TuitionPaymentFragmentspecialinlinedviewModeldefault2(serializersModule, null), savedStateConfiguration2, (Function0) function0, composer, (i << 3) & 8064, 0);
    }

    /* JADX INFO: renamed from: rememberSerializable, reason: collision with other method in class */
    public static final <T> T m3666rememberSerializable(Object[] objArr, videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, SavedStateConfiguration savedStateConfiguration, Function0<? extends T> function0, Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1261607160, i, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:93)");
        }
        T t = (T) RememberSaveableKt.m3663rememberSaveable(Arrays.copyOf(objArr, objArr.length), SerializableSaverKt.serializableSaver(videoprofilehdrformatstodynamicrangeencoding, savedStateConfiguration), (String) null, (Function0) function0, composer, (i & 7168) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    public static final /* synthetic */ <T> MutableState<T> rememberSerializable(Object[] objArr, SavedStateConfiguration savedStateConfiguration, Function0<? extends MutableState<T>> function0, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        SavedStateConfiguration savedStateConfiguration2 = savedStateConfiguration;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        PreviewViewImplementationOnSurfaceNotInUseListener serializersModule = savedStateConfiguration2.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return rememberSerializable(objArrCopyOf, (videoProfileHdrFormatsToDynamicRangeEncoding) isCloseToRealtime.TuitionPaymentFragmentspecialinlinedviewModeldefault2(serializersModule, null), savedStateConfiguration2, (Function0) function0, composer, (i << 3) & 8064, 0);
    }

    public static final <T> MutableState<T> rememberSerializable(Object[] objArr, videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, SavedStateConfiguration savedStateConfiguration, Function0<? extends MutableState<T>> function0, Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1248826527, i, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:163)");
        }
        MutableState<T> mutableState = (MutableState) RememberSaveableKt.m3663rememberSaveable(Arrays.copyOf(objArr, objArr.length), RememberSaveableKt.mutableStateSaver(SerializableSaverKt.serializableSaver(videoprofilehdrformatstodynamicrangeencoding, savedStateConfiguration)), (String) null, (Function0) function0, composer, (i & 7168) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
