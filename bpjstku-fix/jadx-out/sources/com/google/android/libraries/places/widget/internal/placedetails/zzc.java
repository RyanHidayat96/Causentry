package com.google.android.libraries.places.widget.internal.placedetails;

import androidx.p002lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzc implements Observer, FunctionAdapter {
    private final /* synthetic */ Function1 zza;

    zzc(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.zza = function1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.zza;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.p002lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.zza.invoke(obj);
    }
}
