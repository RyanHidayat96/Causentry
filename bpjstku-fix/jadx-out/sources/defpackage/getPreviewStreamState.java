package defpackage;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class getPreviewStreamState {
    private int TuitionPaymentFragmentbindingInflater1;
    private final ArrayDeque<char[]> b = new ArrayDeque<>();

    protected final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        char[] cArrRemoveLastOrNull;
        synchronized (this) {
            cArrRemoveLastOrNull = this.b.removeLastOrNull();
            if (cArrRemoveLastOrNull != null) {
                this.TuitionPaymentFragmentbindingInflater1 -= cArrRemoveLastOrNull.length;
            } else {
                cArrRemoveLastOrNull = null;
            }
        }
        return cArrRemoveLastOrNull == null ? new char[128] : cArrRemoveLastOrNull;
    }

    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        synchronized (this) {
            if (this.TuitionPaymentFragmentbindingInflater1 + cArr.length < lambdanew0androidxcameraviewPreviewView.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentbindingInflater1 += cArr.length;
                this.b.addLast(cArr);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
