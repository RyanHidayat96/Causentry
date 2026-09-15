package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/google/android/libraries/places/api/model/AddressComponent;", "p0", "Lcom/google/android/libraries/places/api/model/AddressComponents;", "addressComponents", "(Ljava/util/List;)Lcom/google/android/libraries/places/api/model/AddressComponents;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AddressComponentsKt {
    public static final AddressComponents addressComponents(List<? extends AddressComponent> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AddressComponents addressComponentsNewInstance = AddressComponents.newInstance(list);
        Intrinsics.checkNotNullExpressionValue(addressComponentsNewInstance, "");
        return addressComponentsNewInstance;
    }
}
