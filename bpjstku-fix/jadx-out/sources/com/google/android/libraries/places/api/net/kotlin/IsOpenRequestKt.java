package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.IsOpenRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a@\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a@\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\r"}, d2 = {"", "p0", "", "p1", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/IsOpenRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p2", "Lcom/google/android/libraries/places/api/net/IsOpenRequest;", "isOpenRequest", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/IsOpenRequest;", "Lcom/google/android/libraries/places/api/model/Place;", "(Lcom/google/android/libraries/places/api/model/Place;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/IsOpenRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IsOpenRequestKt {
    public static final IsOpenRequest isOpenRequest(Place place, Long l, Function1<? super IsOpenRequest.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(place, "");
        IsOpenRequest.Builder builder = l == null ? IsOpenRequest.builder(place) : IsOpenRequest.builder(place, l.longValue());
        if (function1 != null) {
            function1.invoke(builder);
        }
        IsOpenRequest isOpenRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(isOpenRequestBuild, "");
        return isOpenRequestBuild;
    }

    public static /* synthetic */ IsOpenRequest isOpenRequest$default(Place place, Long l, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return isOpenRequest(place, l, (Function1<? super IsOpenRequest.Builder, Unit>) function1);
    }

    public static /* synthetic */ IsOpenRequest isOpenRequest$default(String str, Long l, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return isOpenRequest(str, l, (Function1<? super IsOpenRequest.Builder, Unit>) function1);
    }

    public static final IsOpenRequest isOpenRequest(String str, Long l, Function1<? super IsOpenRequest.Builder, Unit> function1) {
        IsOpenRequest.Builder builder;
        Intrinsics.checkNotNullParameter(str, "");
        if (l == null) {
            builder = IsOpenRequest.builder(str);
        } else {
            builder = IsOpenRequest.builder(str, l.longValue());
        }
        if (function1 != null) {
            function1.invoke(builder);
        }
        IsOpenRequest isOpenRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(isOpenRequestBuild, "");
        return isOpenRequestBuild;
    }
}
