package com.rtchagas.pingplacepicker.ui;

import com.google.android.libraries.places.api.model.Place;
import defpackage.ExifDataBuilder;
import defpackage.guessDataFormat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/libraries/places/api/model/Place;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/android/libraries/places/api/model/Place;)V"}, k = 3, mv = {2, 3, 0})
public final class PlacePickerActivity$bindPlaces$1 extends Lambda implements Function1<Place, Unit> {
    final /* synthetic */ PlacePickerActivity this$0;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Place place) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(place);
        return Unit.INSTANCE;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Place place) {
        PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.this$0, place);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlacePickerActivity$bindPlaces$1(PlacePickerActivity placePickerActivity) {
        super(1);
        this.this$0 = placePickerActivity;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
        guessDataFormat.b[0] = ExifDataBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
    }
}
