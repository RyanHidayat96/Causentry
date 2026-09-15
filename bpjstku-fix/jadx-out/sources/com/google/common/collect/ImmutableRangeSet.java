package com.google.common.collect;

import defpackage.CameraValidator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ImmutableRangeSet<C extends Comparable> extends CameraValidator<C> implements Serializable {
    private final transient ImmutableList<Range<C>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final ImmutableRangeSet<Comparable<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ImmutableRangeSet<>(ImmutableList.asInterface());
    private static final ImmutableRangeSet<Comparable<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ImmutableRangeSet<>(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Range.b()));

    public static class b<C extends Comparable<?>> {
        public final List<Range<C>> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();
    }

    @Override // defpackage.CameraValidator
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static <C extends Comparable> ImmutableRangeSet<C> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = immutableList;
    }

    public static <C extends Comparable<?>> b<C> b() {
        return new b<>();
    }

    /* JADX INFO: loaded from: classes6.dex */
    static final class SerializedForm<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> ranges;

        SerializedForm(ImmutableList<Range<C>> immutableList) {
            this.ranges = immutableList;
        }

        final Object readResolve() {
            if (this.ranges.isEmpty()) {
                return ImmutableRangeSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            if (this.ranges.equals(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Range.b()))) {
                return ImmutableRangeSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            return new ImmutableRangeSet(this.ranges);
        }
    }

    final Object writeReplace() {
        return new SerializedForm(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.CaptureStageDefaultCaptureStage
    public final /* synthetic */ Set TuitionPaymentFragmentbindingInflater1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
            return ImmutableSet.g();
        }
        return new RegularImmutableSortedSet(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Range.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }
}
