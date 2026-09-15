package androidx.p005navigation.p009serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.SavedStateHandle;
import androidx.p005navigation.NavType;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u000b2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "", "", "Landroidx/navigation/NavType;", "p1", "decodeArguments", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;Landroid/os/Bundle;Ljava/util/Map;)Ljava/lang/Object;", "Landroidx/lifecycle/SavedStateHandle;", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteDeserializerKt {
    public static final <T> T decodeArguments(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, Bundle bundle, Map<String, ? extends NavType<?>> map) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(map, "");
        return (T) new RouteDecoder(bundle, map).decodeRouteWithArgs$navigation_common_release(videoprofilehdrformatstodynamicrangeencoding);
    }

    public static final <T> T decodeArguments(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, SavedStateHandle savedStateHandle, Map<String, ? extends NavType<?>> map) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(map, "");
        return (T) new RouteDecoder(savedStateHandle, map).decodeRouteWithArgs$navigation_common_release(videoprofilehdrformatstodynamicrangeencoding);
    }
}
