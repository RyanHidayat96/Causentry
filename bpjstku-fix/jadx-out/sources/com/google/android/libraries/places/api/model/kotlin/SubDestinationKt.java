package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.SubDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "p1", "Lcom/google/android/libraries/places/api/model/SubDestination;", "subDestination", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/libraries/places/api/model/SubDestination;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SubDestinationKt {
    public static final SubDestination subDestination(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SubDestination subDestinationNewInstance = SubDestination.newInstance(str, str2);
        Intrinsics.checkNotNullExpressionValue(subDestinationNewInstance, "");
        return subDestinationNewInstance;
    }
}
