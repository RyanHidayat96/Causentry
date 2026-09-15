package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Equivalence<T> {
    protected abstract boolean TuitionPaymentFragmentbindingInflater1(T t, T t2);

    protected abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t);

    protected Equivalence() {
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return TuitionPaymentFragmentbindingInflater1(t, t2);
    }

    public final int b(T t) {
        if (t == null) {
            return 0;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(t);
    }

    public static Equivalence<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return Equals.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static Equivalence<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return Identity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    static final class Equals extends Equivalence<Object> implements Serializable {
        static final Equals TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Equals();
        private static final long serialVersionUID = 1;

        Equals() {
        }

        @Override // com.google.common.base.Equivalence
        protected final boolean TuitionPaymentFragmentbindingInflater1(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        protected final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
            return obj.hashCode();
        }

        private Object readResolve() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }

    static final class Identity extends Equivalence<Object> implements Serializable {
        static final Identity TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Identity();
        private static final long serialVersionUID = 1;

        @Override // com.google.common.base.Equivalence
        protected final boolean TuitionPaymentFragmentbindingInflater1(Object obj, Object obj2) {
            return false;
        }

        Identity() {
        }

        @Override // com.google.common.base.Equivalence
        protected final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
            return System.identityHashCode(obj);
        }

        private Object readResolve() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }
}
