package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class emptyInstance {
    public final List<TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?>> TuitionPaymentFragmentbindingInflater1 = new ArrayList();

    public final <Z, R> ForwardingImageProxy<Z, R> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<Z> cls, Class<R> cls2) {
        synchronized (this) {
            if (cls2.isAssignableFrom(cls)) {
                return isFlipWH.b();
            }
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?> tuitionPaymentFragmentspecialinlinedviewModeldefault2 : this.TuitionPaymentFragmentbindingInflater1) {
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isAssignableFrom(cls) && cls2.isAssignableFrom(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1)) {
                    return (ForwardingImageProxy<Z, R>) tuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No transcoder registered to transcode from ");
            sb.append(cls);
            sb.append(" to ");
            sb.append(cls2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final <Z, R> List<Class<R>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<Z> cls, Class<R> cls2) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            if (cls2.isAssignableFrom(cls)) {
                arrayList.add(cls2);
                return arrayList;
            }
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?> tuitionPaymentFragmentspecialinlinedviewModeldefault2 : this.TuitionPaymentFragmentbindingInflater1) {
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isAssignableFrom(cls) && cls2.isAssignableFrom(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) && !arrayList.contains(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1)) {
                    arrayList.add(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1);
                }
            }
            return arrayList;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<Z, R> {
        final Class<R> TuitionPaymentFragmentbindingInflater1;
        final Class<Z> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final ForwardingImageProxy<Z, R> b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<Z> cls, Class<R> cls2, ForwardingImageProxy<Z, R> forwardingImageProxy) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cls;
            this.TuitionPaymentFragmentbindingInflater1 = cls2;
            this.b = forwardingImageProxy;
        }
    }
}
