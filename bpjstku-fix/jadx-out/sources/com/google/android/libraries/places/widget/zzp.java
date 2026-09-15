package com.google.android.libraries.places.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
final /* synthetic */ class zzp extends FunctionReferenceImpl implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        Intrinsics.checkNotNullParameter(exc, "");
        PlaceDetailsCompactFragment.zzb((PlaceDetailsCompactFragment) this.receiver, exc);
        return Unit.INSTANCE;
    }

    zzp(Object obj) {
        super(1, obj, PlaceDetailsCompactFragment.class, "onPlaceLoadFailed", "onPlaceLoadFailed(Ljava/lang/Exception;)V", 0);
    }
}
