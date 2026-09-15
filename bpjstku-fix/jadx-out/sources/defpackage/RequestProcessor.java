package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class RequestProcessor {
    private final Map<Integer, Integer> b = new HashMap();

    RequestProcessor() {
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        Integer num = this.b.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.b.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }

    final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry<Integer, Integer> entry : this.b.entrySet()) {
            if (entry.getValue().intValue() > iIntValue) {
                iIntValue = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return resolveQuirkNames.TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayList);
    }
}
