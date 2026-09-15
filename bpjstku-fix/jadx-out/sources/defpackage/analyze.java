package defpackage;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class analyze {
    private final AtomicReference<ImageAnalysisAbstractAnalyzer> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicReference<>();
    public final ArrayMap<ImageAnalysisAbstractAnalyzer, List<Class<?>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayMap<>();

    public final List<Class<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        ImageAnalysisAbstractAnalyzer andSet = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(null);
        if (andSet == null) {
            andSet = new ImageAnalysisAbstractAnalyzer(cls, cls2, cls3);
        } else {
            andSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cls;
            andSet.b = cls2;
            andSet.TuitionPaymentFragmentbindingInflater1 = cls3;
        }
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(andSet);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(andSet);
        return list;
    }
}
