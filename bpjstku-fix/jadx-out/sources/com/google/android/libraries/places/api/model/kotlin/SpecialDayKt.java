package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.LocalDate;
import com.google.android.libraries.places.api.model.SpecialDay;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/google/android/libraries/places/api/model/LocalDate;", "p0", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/SpecialDay$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p1", "Lcom/google/android/libraries/places/api/model/SpecialDay;", "specialDay", "(Lcom/google/android/libraries/places/api/model/LocalDate;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/SpecialDay;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SpecialDayKt {
    public static final SpecialDay specialDay(LocalDate localDate, Function1<? super SpecialDay.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(localDate, "");
        SpecialDay.Builder builder = SpecialDay.builder(localDate);
        if (function1 != null) {
            function1.invoke(builder);
        }
        SpecialDay specialDayBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(specialDayBuild, "");
        return specialDayBuild;
    }

    public static /* synthetic */ SpecialDay specialDay$default(LocalDate localDate, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return specialDay(localDate, function1);
    }
}
