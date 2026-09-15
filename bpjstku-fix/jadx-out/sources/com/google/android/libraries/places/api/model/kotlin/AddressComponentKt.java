package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.AddressComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "p0", "", "p1", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/AddressComponent$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p2", "Lcom/google/android/libraries/places/api/model/AddressComponent;", "addressComponent", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/AddressComponent;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AddressComponentKt {
    public static final AddressComponent addressComponent(String str, List<String> list, Function1<? super AddressComponent.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AddressComponent.Builder builder = AddressComponent.builder(str, list);
        if (function1 != null) {
            function1.invoke(builder);
        }
        AddressComponent addressComponentBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(addressComponentBuild, "");
        return addressComponentBuild;
    }

    public static /* synthetic */ AddressComponent addressComponent$default(String str, List list, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return addressComponent(str, list, function1);
    }
}
