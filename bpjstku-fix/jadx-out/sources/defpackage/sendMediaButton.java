package defpackage;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sendMediaButton {
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
    public final Set<TuitionPaymentFragmentspecialinlinedviewModeldefault3> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArraySet();
    public final Map<String, onSetShuffleMode> b = new HashMap();
    private final Comparator<Pair<String, Float>> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Comparator<Pair<String, Float>>() { // from class: sendMediaButton.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = pair.second.floatValue();
            float fFloatValue2 = pair2.second.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    }
}
