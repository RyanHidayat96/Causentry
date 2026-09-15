package androidx.p013savedstate.p017serialization;

import androidx.exifinterface.media.ExifInterface;
import androidx.p013savedstate.SavedStateRegistryOwner;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.isCloseToRealtime;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.properties.ReadWriteProperty;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a]\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/savedstate/SavedStateRegistryOwner;", "", "p0", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "p1", "Lkotlin/Function0;", "p2", "Lkotlin/properties/ReadWriteProperty;", "saved", "(Landroidx/savedstate/SavedStateRegistryOwner;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;)Lkotlin/properties/ReadWriteProperty;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "p3", "(Landroidx/savedstate/SavedStateRegistryOwner;LvideoProfileHdrFormatsToDynamicRangeEncoding;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;)Lkotlin/properties/ReadWriteProperty;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateRegistryOwnerDelegateKt {
    public static /* synthetic */ ReadWriteProperty saved$default(SavedStateRegistryOwner savedStateRegistryOwner, String str, SavedStateConfiguration savedStateConfiguration, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        Intrinsics.checkNotNullParameter(function0, "");
        PreviewViewImplementationOnSurfaceNotInUseListener serializersModule = savedStateConfiguration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return saved(savedStateRegistryOwner, isCloseToRealtime.TuitionPaymentFragmentspecialinlinedviewModeldefault2(serializersModule, null), str, savedStateConfiguration, function0);
    }

    public static final /* synthetic */ <T> ReadWriteProperty<Object, T> saved(SavedStateRegistryOwner savedStateRegistryOwner, String str, SavedStateConfiguration savedStateConfiguration, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        Intrinsics.checkNotNullParameter(function0, "");
        PreviewViewImplementationOnSurfaceNotInUseListener serializersModule = savedStateConfiguration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return saved(savedStateRegistryOwner, isCloseToRealtime.TuitionPaymentFragmentspecialinlinedviewModeldefault2(serializersModule, null), str, savedStateConfiguration, function0);
    }

    public static /* synthetic */ ReadWriteProperty saved$default(SavedStateRegistryOwner savedStateRegistryOwner, videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding, String str, SavedStateConfiguration savedStateConfiguration, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return saved(savedStateRegistryOwner, videoprofilehdrformatstodynamicrangeencoding, str, savedStateConfiguration, function0);
    }

    public static final <T> ReadWriteProperty<Object, T> saved(SavedStateRegistryOwner savedStateRegistryOwner, videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, String str, SavedStateConfiguration savedStateConfiguration, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return new SavedStateRegistryOwnerDelegate(savedStateRegistryOwner.getSavedStateRegistry(), videoprofilehdrformatstodynamicrangeencoding, str, savedStateConfiguration, function0);
    }
}
