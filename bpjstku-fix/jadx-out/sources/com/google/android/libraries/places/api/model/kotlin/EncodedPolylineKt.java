package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.EncodedPolyline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "Lcom/google/android/libraries/places/api/model/EncodedPolyline;", "encodedPolyline", "(Ljava/lang/String;)Lcom/google/android/libraries/places/api/model/EncodedPolyline;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EncodedPolylineKt {
    public static final EncodedPolyline encodedPolyline(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EncodedPolyline encodedPolylineNewInstance = EncodedPolyline.newInstance(str);
        Intrinsics.checkNotNullExpressionValue(encodedPolylineNewInstance, "");
        return encodedPolylineNewInstance;
    }
}
