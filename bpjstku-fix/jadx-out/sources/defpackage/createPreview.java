package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class createPreview {

    public static final class TuitionPaymentFragmentbindingInflater1 implements Iterable<createImageAnalysis>, KMappedMarker {
        private /* synthetic */ createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentbindingInflater1(createImageAnalysis createimageanalysis) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = createimageanalysis;
        }

        @Override // java.lang.Iterable
        public final Iterator<createImageAnalysis> iterator() {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    public static final class b implements Iterable<String>, KMappedMarker {
        private /* synthetic */ createImageAnalysis TuitionPaymentFragmentbindingInflater1;

        public b(createImageAnalysis createimageanalysis) {
            this.TuitionPaymentFragmentbindingInflater1 = createimageanalysis;
        }

        @Override // java.lang.Iterable
        public final Iterator<String> iterator() {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Iterator<createImageAnalysis>, KMappedMarker {
        private /* synthetic */ createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(createImageAnalysis createimageanalysis) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = createimageanalysis;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ createImageAnalysis next() {
            createImageAnalysis createimageanalysis = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i - 1;
            return createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault2 - i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Iterator<String>, KMappedMarker {
        private /* synthetic */ createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private int b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(createImageAnalysis createimageanalysis) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = createimageanalysis;
            this.b = createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b > 0;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ String next() {
            createImageAnalysis createimageanalysis = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i = this.b;
            this.b = i - 1;
            return createimageanalysis.TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2 - i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
