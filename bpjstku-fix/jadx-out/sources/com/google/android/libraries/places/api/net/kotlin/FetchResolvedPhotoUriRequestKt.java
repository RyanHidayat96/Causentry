package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "p0", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p1", "Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriRequest;", "fetchResolvedPhotoUriRequest", "(Lcom/google/android/libraries/places/api/model/PhotoMetadata;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FetchResolvedPhotoUriRequestKt {
    public static final FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest(PhotoMetadata photoMetadata, Function1<? super FetchResolvedPhotoUriRequest.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(photoMetadata, "");
        FetchResolvedPhotoUriRequest.Builder builder = FetchResolvedPhotoUriRequest.builder(photoMetadata);
        if (function1 != null) {
            function1.invoke(builder);
        }
        FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(fetchResolvedPhotoUriRequestBuild, "");
        return fetchResolvedPhotoUriRequestBuild;
    }

    public static /* synthetic */ FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest$default(PhotoMetadata photoMetadata, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return fetchResolvedPhotoUriRequest(photoMetadata, function1);
    }
}
