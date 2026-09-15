package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.AuthorAttribution;
import com.google.android.libraries.places.api.model.Review;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "p0", "Lcom/google/android/libraries/places/api/model/AuthorAttribution;", "p1", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/Review$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p2", "Lcom/google/android/libraries/places/api/model/Review;", "review", "(DLcom/google/android/libraries/places/api/model/AuthorAttribution;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/Review;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReviewKt {
    public static final Review review(double d, AuthorAttribution authorAttribution, Function1<? super Review.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(authorAttribution, "");
        Review.Builder builder = Review.builder(Double.valueOf(d), authorAttribution);
        if (function1 != null) {
            function1.invoke(builder);
        }
        Review reviewBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(reviewBuild, "");
        return reviewBuild;
    }

    public static /* synthetic */ Review review$default(double d, AuthorAttribution authorAttribution, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return review(d, authorAttribution, function1);
    }
}
