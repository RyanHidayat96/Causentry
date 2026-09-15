package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    private static final long serialVersionUID = 0;
    final C endpoint;

    abstract void TuitionPaymentFragmentbindingInflater1(StringBuilder sb);

    abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1(StringBuilder sb);

    public abstract boolean b(C c);

    Cut(C c) {
        this.endpoint = c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        try {
            return compareTo((Cut) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    static <C extends Comparable> Cut<C> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return BelowAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    static final class BelowAll extends Cut<Comparable<?>> {
        private static final BelowAll TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new BelowAll();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1 */
        public final int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public final boolean b(Comparable<?> comparable) {
            return true;
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return ((Cut) obj) == this ? 0 : -1;
        }

        private BelowAll() {
            super("");
        }

        @Override // com.google.common.collect.Cut
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.Cut
        final void TuitionPaymentFragmentbindingInflater1(StringBuilder sb) {
            throw new AssertionError();
        }

        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "-∞";
        }

        private Object readResolve() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }

    static <C extends Comparable> Cut<C> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return AboveAll.b;
    }

    static final class AboveAll extends Cut<Comparable<?>> {
        private static final AboveAll b = new AboveAll();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1 */
        public final int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public final boolean b(Comparable<?> comparable) {
            return false;
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return ((Cut) obj) == this ? 0 : 1;
        }

        private AboveAll() {
            super("");
        }

        @Override // com.google.common.collect.Cut
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        final void TuitionPaymentFragmentbindingInflater1(StringBuilder sb) {
            sb.append("+∞)");
        }

        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "+∞";
        }

        private Object readResolve() {
            return b;
        }
    }

    static <C extends Comparable> Cut<C> TuitionPaymentFragmentspecialinlinedviewModeldefault2(C c) {
        return new BelowValue(c);
    }

    static final class BelowValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) obj);
        }

        BelowValue(C c) {
            super(c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public final boolean b(C c) {
            return Range.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.endpoint, c) <= 0;
        }

        @Override // com.google.common.collect.Cut
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(StringBuilder sb) {
            sb.append('[');
            sb.append(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        final void TuitionPaymentFragmentbindingInflater1(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(')');
        }

        public final int hashCode() {
            return this.endpoint.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\\");
            sb.append(this.endpoint);
            sb.append("/");
            return sb.toString();
        }
    }

    static <C extends Comparable> Cut<C> TuitionPaymentFragmentspecialinlinedviewModeldefault1(C c) {
        return new AboveValue(c);
    }

    static final class AboveValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) obj);
        }

        AboveValue(C c) {
            super(c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public final boolean b(C c) {
            return Range.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.endpoint, c) < 0;
        }

        @Override // com.google.common.collect.Cut
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(StringBuilder sb) {
            sb.append('(');
            sb.append(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        final void TuitionPaymentFragmentbindingInflater1(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(']');
        }

        public final int hashCode() {
            return ~this.endpoint.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("/");
            sb.append(this.endpoint);
            sb.append("\\");
            return sb.toString();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public int compareTo(Cut<C> cut) {
        if (cut == BelowAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return 1;
        }
        if (cut == AboveAll.b) {
            return -1;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.endpoint, cut.endpoint);
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 0 ? iTuitionPaymentFragmentspecialinlinedviewModeldefault3 : Boolean.compare(this instanceof AboveValue, cut instanceof AboveValue);
    }
}
