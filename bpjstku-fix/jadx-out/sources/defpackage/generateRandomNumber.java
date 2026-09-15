package defpackage;

import java.util.Random;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class generateRandomNumber implements logToString {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    private /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public /* synthetic */ generateRandomNumber(Function1 function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    public static int b() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 6627245;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iNextInt = new Random().nextInt(425352359);
        b = iNextInt;
        return iNextInt;
    }

    @Override // defpackage.logToString
    public final void accept(Object obj) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
    }
}
