package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageAnalysisAnalyzer {
    public final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();
    private final Map<String, List<TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?>>> TuitionPaymentFragmentbindingInflater1 = new HashMap();

    public final <T, R> List<Camera<T, R>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator<String> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.iterator();
            while (it.hasNext()) {
                List<TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?>> list = this.TuitionPaymentFragmentbindingInflater1.get(it.next());
                if (list != null) {
                    for (TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?> tuitionPaymentFragmentspecialinlinedviewModeldefault2 : list) {
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isAssignableFrom(cls) && cls2.isAssignableFrom(tuitionPaymentFragmentspecialinlinedviewModeldefault2.b)) {
                            arrayList.add(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final <T, R> List<Class<R>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator<String> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.iterator();
            while (it.hasNext()) {
                List<TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?>> list = this.TuitionPaymentFragmentbindingInflater1.get(it.next());
                if (list != null) {
                    for (TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?> tuitionPaymentFragmentspecialinlinedviewModeldefault2 : list) {
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isAssignableFrom(cls) && cls2.isAssignableFrom(tuitionPaymentFragmentspecialinlinedviewModeldefault2.b) && !arrayList.contains(tuitionPaymentFragmentspecialinlinedviewModeldefault2.b)) {
                            arrayList.add(tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public List<TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?>> TuitionPaymentFragmentbindingInflater1(String str) {
        List<TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?>> arrayList;
        synchronized (this) {
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.contains(str)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(str);
            }
            arrayList = this.TuitionPaymentFragmentbindingInflater1.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.TuitionPaymentFragmentbindingInflater1.put(str, arrayList);
            }
        }
        return arrayList;
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R> {
        final Camera<T, R> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Class<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final Class<R> b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<T> cls, Class<R> cls2, Camera<T, R> camera) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cls;
            this.b = cls2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera;
        }
    }
}
