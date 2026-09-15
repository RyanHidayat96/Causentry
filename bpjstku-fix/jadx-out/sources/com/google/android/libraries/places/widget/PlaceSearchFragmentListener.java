package com.google.android.libraries.places.widget;

import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceSearchFragmentListener;", "", "", "Lcom/google/android/libraries/places/api/model/Place;", "p0", "", "onLoad", "(Ljava/util/List;)V", "onPlaceSelected", "(Lcom/google/android/libraries/places/api/model/Place;)V", "Ljava/lang/Exception;", "onRequestError", "(Ljava/lang/Exception;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PlaceSearchFragmentListener {
    void onLoad(List<? extends Place> p0);

    default void onPlaceSelected(Place p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    void onRequestError(Exception p0);
}
