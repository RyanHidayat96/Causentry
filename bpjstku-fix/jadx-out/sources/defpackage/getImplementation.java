package defpackage;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class getImplementation {
    private static SparseArray<Priority> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new SparseArray<>();
    private static HashMap<Priority, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        HashMap<Priority, Integer> map = new HashMap<>();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
        map.put(Priority.DEFAULT, 0);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(Priority.VERY_LOW, 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(Priority.HIGHEST, 2);
        for (Priority priority : TuitionPaymentFragmentspecialinlinedviewModeldefault3.keySet()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(priority).intValue(), priority);
        }
    }

    public static Priority TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        Priority priority = TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value ".concat(String.valueOf(i)));
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Priority priority) {
        Integer num = TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(priority);
        if (num == null) {
            throw new IllegalStateException("PriorityMapping is missing known Priority value ".concat(String.valueOf(priority)));
        }
        return num.intValue();
    }
}
