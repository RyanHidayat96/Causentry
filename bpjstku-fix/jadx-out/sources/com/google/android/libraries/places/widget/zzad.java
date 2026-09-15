package com.google.android.libraries.places.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzad extends FunctionReferenceImpl implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        Intrinsics.checkNotNullParameter(exc, "");
        PlaceDetailsFragment.zzb((PlaceDetailsFragment) this.receiver, exc);
        return Unit.INSTANCE;
    }

    zzad(Object obj) {
        super(1, obj, PlaceDetailsFragment.class, "onPlaceLoadFailed", "onPlaceLoadFailed(Ljava/lang/Exception;)V", 0);
    }
}
