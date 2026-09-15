package androidx.p013savedstate.p017serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.isBitDepthMatched;
import defpackage.isCloseToRealtime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "p1", "decodeFromSavedState", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;", "LisBitDepthMatched;", "p2", "(LisBitDepthMatched;Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateDecoderKt {
    public static /* synthetic */ Object decodeFromSavedState$default(Bundle bundle, SavedStateConfiguration savedStateConfiguration, int i, Object obj) {
        if ((i & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        PreviewViewImplementationOnSurfaceNotInUseListener serializersModule = savedStateConfiguration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeFromSavedState(isCloseToRealtime.TuitionPaymentFragmentspecialinlinedviewModeldefault2(serializersModule, null), bundle, savedStateConfiguration);
    }

    public static final /* synthetic */ <T> T decodeFromSavedState(Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        PreviewViewImplementationOnSurfaceNotInUseListener serializersModule = savedStateConfiguration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromSavedState(isCloseToRealtime.TuitionPaymentFragmentspecialinlinedviewModeldefault2(serializersModule, null), bundle, savedStateConfiguration);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(isBitDepthMatched isbitdepthmatched, Bundle bundle, SavedStateConfiguration savedStateConfiguration, int i, Object obj) {
        if ((i & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return decodeFromSavedState(isbitdepthmatched, bundle, savedStateConfiguration);
    }

    public static final <T> T decodeFromSavedState(isBitDepthMatched<? extends T> isbitdepthmatched, Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        return (T) new SavedStateDecoder(bundle, savedStateConfiguration).decodeSerializableValue(isbitdepthmatched);
    }

    public static final <T> T decodeFromSavedState(isBitDepthMatched<? extends T> isbitdepthmatched, Bundle bundle) {
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        return (T) decodeFromSavedState$default(isbitdepthmatched, bundle, null, 4, null);
    }
}
