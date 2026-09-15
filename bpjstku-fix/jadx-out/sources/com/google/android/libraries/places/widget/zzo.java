package com.google.android.libraries.places.widget;

import com.google.android.libraries.places.api.model.Place;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
final /* synthetic */ class zzo extends FunctionReferenceImpl implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        Place place = (Place) obj;
        Intrinsics.checkNotNullParameter(place, "");
        PlaceDetailsCompactFragment.zza((PlaceDetailsCompactFragment) this.receiver, place);
        return Unit.INSTANCE;
    }

    zzo(Object obj) {
        super(1, obj, PlaceDetailsCompactFragment.class, "updateUi", "updateUi(Lcom/google/android/libraries/places/api/model/Place;)V", 0);
    }
}
