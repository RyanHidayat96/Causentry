package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "p0", "", "p1", "", "p2", "Lcom/google/android/libraries/places/api/model/Money;", "money", "(Ljava/lang/String;JI)Lcom/google/android/libraries/places/api/model/Money;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MoneyKt {
    public static final Money money(String str, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Money moneyNewInstance = Money.newInstance(str, Long.valueOf(j), Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(moneyNewInstance, "");
        return moneyNewInstance;
    }
}
