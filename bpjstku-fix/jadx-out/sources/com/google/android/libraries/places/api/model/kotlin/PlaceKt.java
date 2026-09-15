package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.Place;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/Place$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lcom/google/android/libraries/places/api/model/Place;", "place", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/Place;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PlaceKt {
    public static final Place place(Function1<? super Place.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Place.Builder builder = Place.builder();
        function1.invoke(builder);
        Place placeBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(placeBuild, "");
        return placeBuild;
    }
}
