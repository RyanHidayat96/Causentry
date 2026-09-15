package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "p1", "p2", "Lcom/google/android/libraries/places/api/model/LocalDate;", "localDate", "(III)Lcom/google/android/libraries/places/api/model/LocalDate;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LocalDateKt {
    public static final LocalDate localDate(int i, int i2, int i3) {
        LocalDate localDateNewInstance = LocalDate.newInstance(i, i2, i3);
        Intrinsics.checkNotNullExpressionValue(localDateNewInstance, "");
        return localDateNewInstance;
    }
}
