package defpackage;

import java.util.Random;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getRequiredMaxBitDepth implements Function1 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private /* synthetic */ isUltraHdrOn TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public /* synthetic */ getRequiredMaxBitDepth(isUltraHdrOn isultrahdron) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isultrahdron;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 6014070;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int iNextInt = new Random().nextInt();
        TuitionPaymentFragmentbindingInflater1 = iNextInt;
        return iNextInt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return isUltraHdrOn.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (r8lambdadPEOltVNxwFUffOSXiaKZsPUiI) obj);
    }
}
