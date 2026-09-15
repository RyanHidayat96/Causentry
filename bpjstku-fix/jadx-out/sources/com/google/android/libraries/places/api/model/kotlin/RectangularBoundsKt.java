package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.RectangularBounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/google/android/gms/maps/model/LatLngBounds;", "p0", "Lcom/google/android/libraries/places/api/model/RectangularBounds;", "rectangularBounds", "(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/libraries/places/api/model/RectangularBounds;", "Lcom/google/android/gms/maps/model/LatLng;", "p1", "(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/libraries/places/api/model/RectangularBounds;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RectangularBoundsKt {
    public static final RectangularBounds rectangularBounds(LatLng latLng, LatLng latLng2) {
        Intrinsics.checkNotNullParameter(latLng, "");
        Intrinsics.checkNotNullParameter(latLng2, "");
        RectangularBounds rectangularBoundsNewInstance = RectangularBounds.newInstance(latLng, latLng2);
        Intrinsics.checkNotNullExpressionValue(rectangularBoundsNewInstance, "");
        return rectangularBoundsNewInstance;
    }

    public static final RectangularBounds rectangularBounds(LatLngBounds latLngBounds) {
        Intrinsics.checkNotNullParameter(latLngBounds, "");
        RectangularBounds rectangularBoundsNewInstance = RectangularBounds.newInstance(latLngBounds);
        Intrinsics.checkNotNullExpressionValue(rectangularBoundsNewInstance, "");
        return rectangularBoundsNewInstance;
    }
}
