package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "p0", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "p1", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FetchPlaceRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p2", "Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;", "fetchPlaceRequest", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FetchPlaceRequestKt {
    public static final FetchPlaceRequest fetchPlaceRequest(String str, List<? extends Place.Field> list, Function1<? super FetchPlaceRequest.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        FetchPlaceRequest.Builder builder = FetchPlaceRequest.builder(str, list);
        if (function1 != null) {
            function1.invoke(builder);
        }
        FetchPlaceRequest fetchPlaceRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(fetchPlaceRequestBuild, "");
        return fetchPlaceRequestBuild;
    }

    public static /* synthetic */ FetchPlaceRequest fetchPlaceRequest$default(String str, List list, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return fetchPlaceRequest(str, list, function1);
    }
}
