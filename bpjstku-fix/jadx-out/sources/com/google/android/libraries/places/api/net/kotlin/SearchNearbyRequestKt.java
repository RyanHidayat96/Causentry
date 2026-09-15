package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/google/android/libraries/places/api/model/LocationRestriction;", "p0", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "p1", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/SearchNearbyRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p2", "Lcom/google/android/libraries/places/api/net/SearchNearbyRequest;", "searchNearbyRequest", "(Lcom/google/android/libraries/places/api/model/LocationRestriction;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/SearchNearbyRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SearchNearbyRequestKt {
    public static final SearchNearbyRequest searchNearbyRequest(LocationRestriction locationRestriction, List<? extends Place.Field> list, Function1<? super SearchNearbyRequest.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(locationRestriction, "");
        Intrinsics.checkNotNullParameter(list, "");
        SearchNearbyRequest.Builder builder = SearchNearbyRequest.builder(locationRestriction, list);
        if (function1 != null) {
            function1.invoke(builder);
        }
        SearchNearbyRequest searchNearbyRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(searchNearbyRequestBuild, "");
        return searchNearbyRequestBuild;
    }

    public static /* synthetic */ SearchNearbyRequest searchNearbyRequest$default(LocationRestriction locationRestriction, List list, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return searchNearbyRequest(locationRestriction, list, function1);
    }
}
