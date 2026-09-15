package defpackage;

import com.bpjstku.data.lib.model.BaseItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RequiresExtension implements Function1 {
    private /* synthetic */ IntegerRes TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public /* synthetic */ RequiresExtension(IntegerRes integerRes) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = integerRes;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        isZslDisabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = isHighResolutionDisabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return IntegerRes.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (BaseItem) obj);
    }
}
