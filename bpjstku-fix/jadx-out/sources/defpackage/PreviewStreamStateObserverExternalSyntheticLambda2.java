package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@CorrectNegativeLatLongForMediaMuxer(TuitionPaymentFragmentspecialinlinedviewModeldefault2 = PreviewTransformation.class)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\n\b\u0007\u0018\u0000 \"2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\"B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0097\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\u0006\u0010\u0003\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001bJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"LPreviewStreamStateObserverExternalSyntheticLambda2;", "LisTransformationInfoReady;", "", "p0", "<init>", "(Ljava/util/List;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "p1", "subList", "(II)Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewStreamStateObserverExternalSyntheticLambda2 extends isTransformationInfoReady implements List<isTransformationInfoReady>, KMappedMarker {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final List<isTransformationInfoReady> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof isTransformationInfoReady)) {
            return false;
        }
        isTransformationInfoReady istransformationinfoready = (isTransformationInfoReady) obj;
        Intrinsics.checkNotNullParameter(istransformationinfoready, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.contains(istransformationinfoready);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof isTransformationInfoReady)) {
            return -1;
        }
        isTransformationInfoReady istransformationinfoready = (isTransformationInfoReady) obj;
        Intrinsics.checkNotNullParameter(istransformationinfoready, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.indexOf(istransformationinfoready);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof isTransformationInfoReady)) {
            return -1;
        }
        isTransformationInfoReady istransformationinfoready = (isTransformationInfoReady) obj;
        Intrinsics.checkNotNullParameter(istransformationinfoready, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.lastIndexOf(istransformationinfoready);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewStreamStateObserverExternalSyntheticLambda2(List<? extends isTransformationInfoReady> list) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object p0) {
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, p0);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        return CollectionsKt.joinToString$default(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ",", "[", "]", 0, null, null, 56, null);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ isTransformationInfoReady get(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, isTransformationInfoReady istransformationinfoready) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends isTransformationInfoReady> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends isTransformationInfoReady> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.containsAll(p0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<isTransformationInfoReady> iterator() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
    }

    @Override // java.util.List
    public final ListIterator<isTransformationInfoReady> listIterator() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<isTransformationInfoReady> listIterator(int p0) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.listIterator(p0);
    }

    @Override // java.util.List
    public final /* synthetic */ isTransformationInfoReady remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<isTransformationInfoReady> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ isTransformationInfoReady set(int i, isTransformationInfoReady istransformationinfoready) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super isTransformationInfoReady> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<isTransformationInfoReady> subList(int p0, int p1) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subList(p0, p1);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) CollectionToArray.toArray(this, tArr);
    }
}
