package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lcom/google/android/libraries/places/api/model/Place$Field;", "p0", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p1", "Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest;", "findCurrentPlaceRequest", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FindCurrentPlaceRequestKt {
    public static final FindCurrentPlaceRequest findCurrentPlaceRequest(List<? extends Place.Field> list, Function1<? super FindCurrentPlaceRequest.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        FindCurrentPlaceRequest.Builder builder = FindCurrentPlaceRequest.builder(list);
        if (function1 != null) {
            function1.invoke(builder);
        }
        FindCurrentPlaceRequest findCurrentPlaceRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(findCurrentPlaceRequestBuild, "");
        return findCurrentPlaceRequestBuild;
    }

    public static /* synthetic */ FindCurrentPlaceRequest findCurrentPlaceRequest$default(List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return findCurrentPlaceRequest(list, function1);
    }
}
