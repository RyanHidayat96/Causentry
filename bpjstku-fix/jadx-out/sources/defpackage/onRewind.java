package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class onRewind implements rate {
    private static final Set<String> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashSet();

    @Override // defpackage.rate
    public final void TuitionPaymentFragmentbindingInflater1(String str) {
        Set<String> set = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }

    @Override // defpackage.rate
    public final void b(String str) {
        Set<String> set = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }
}
