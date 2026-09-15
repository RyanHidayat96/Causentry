package com.google.android.libraries.places.widget;

import com.google.android.libraries.places.api.model.Place;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzac extends FunctionReferenceImpl implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        Place place = (Place) obj;
        Intrinsics.checkNotNullParameter(place, "");
        PlaceDetailsFragment.zza((PlaceDetailsFragment) this.receiver, place);
        return Unit.INSTANCE;
    }

    zzac(Object obj) {
        super(1, obj, PlaceDetailsFragment.class, "updateUi", "updateUi(Lcom/google/android/libraries/places/api/model/Place;)V", 0);
    }
}
