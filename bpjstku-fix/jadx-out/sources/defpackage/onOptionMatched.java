package defpackage;

import android.location.Location;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onOptionMatched implements Function1 {
    private /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public /* synthetic */ onOptionMatched(Function1 function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ExperimentalCamera2Interop.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Location) obj);
    }
}
