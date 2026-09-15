package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.CircularBounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "p0", "", "p1", "Lcom/google/android/libraries/places/api/model/CircularBounds;", "circularBounds", "(Lcom/google/android/gms/maps/model/LatLng;D)Lcom/google/android/libraries/places/api/model/CircularBounds;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CircularBoundsKt {
    public static final CircularBounds circularBounds(LatLng latLng, double d) {
        Intrinsics.checkNotNullParameter(latLng, "");
        CircularBounds circularBoundsNewInstance = CircularBounds.newInstance(latLng, d);
        Intrinsics.checkNotNullExpressionValue(circularBoundsNewInstance, "");
        return circularBoundsNewInstance;
    }
}
