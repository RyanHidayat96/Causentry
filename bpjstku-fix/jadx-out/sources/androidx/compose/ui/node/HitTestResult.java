package androidx.compose.ui.node;

import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.Modifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002FGB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0004J\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J6\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J>\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0086\b¢\u0006\u0004\b\u0018\u0010\u001bJ+\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u001c\u0010\u0016J3\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0086\b¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001eH\u0097\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010\u0007J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0097\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b2\u0010-J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0017¢\u0006\u0004\b4\u00105J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u0002032\u0006\u0010\u000b\u001a\u00020\u001eH\u0017¢\u0006\u0004\b4\u00106J%\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\u0004R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D"}, d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "hasHit", "()Z", "", "acceptHits", "", "p0", "p1", "isHitInMinimumTouchTargetBetter", "(FZ)Z", "Landroidx/compose/ui/node/DistanceAndFlags;", "findBestHitDistance-fn2tFes", "()J", "findBestHitDistance", "Lkotlin/Function0;", "p2", "hit", "(Landroidx/compose/ui/Modifier$Node;ZLkotlin/jvm/functions/Function0;)V", "p3", "hitInMinimumTouchTarget", "(Landroidx/compose/ui/Modifier$Node;FZLkotlin/jvm/functions/Function0;)V", "p4", "(Landroidx/compose/ui/Modifier$Node;FZZLkotlin/jvm/functions/Function0;)V", "hitExpandedTouchBounds", "speculativeHit", "", "removeNodeAtDepth", "(I)V", "removeNodesInRange", "(II)V", "siblingHits", "(Lkotlin/jvm/functions/Function0;)V", "contains", "(Landroidx/compose/ui/Modifier$Node;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "get", "(I)Landroidx/compose/ui/Modifier$Node;", "indexOf", "(Landroidx/compose/ui/Modifier$Node;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "subList", "(II)Ljava/util/List;", "clear", "Landroidx/collection/MutableObjectList;", "", "values", "Landroidx/collection/MutableObjectList;", "Landroidx/collection/MutableLongList;", "distanceFromEdgeAndFlags", "Landroidx/collection/MutableLongList;", "hitDepth", "I", "getSize", "()I", "size", "HitTestResultIterator", "SubList"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HitTestResult implements List<Modifier.Node>, KMappedMarker {
    public static final int $stable = 8;
    private MutableObjectList<Object> values = new MutableObjectList<>(16);
    private MutableLongList distanceFromEdgeAndFlags = new MutableLongList(16);
    private int hitDepth = -1;

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    public final int getSize() {
        return this.values.getSize();
    }

    public final boolean hasHit() {
        long jM5821findBestHitDistancefn2tFes = m5821findBestHitDistancefn2tFes();
        return DistanceAndFlags.m5802getDistanceimpl(jM5821findBestHitDistancefn2tFes) < 0.0f && DistanceAndFlags.m5805isInLayerimpl(jM5821findBestHitDistancefn2tFes) && !DistanceAndFlags.m5804isInExpandedBoundsimpl(jM5821findBestHitDistancefn2tFes);
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float p0, boolean p1) {
        if (this.hitDepth == CollectionsKt.getLastIndex(this)) {
            return true;
        }
        return DistanceAndFlags.m5798compareTo9YPOF3E(m5821findBestHitDistancefn2tFes(), HitTestResultKt.DistanceAndFlags$default(p0, p1, false, 4, null)) > 0;
    }

    /* JADX INFO: renamed from: findBestHitDistance-fn2tFes, reason: not valid java name */
    private final long m5821findBestHitDistancefn2tFes() {
        long jDistanceAndFlags$default = HitTestResultKt.DistanceAndFlags$default(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i = this.hitDepth + 1;
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                long jM5799constructorimpl = DistanceAndFlags.m5799constructorimpl(this.distanceFromEdgeAndFlags.get(i));
                if (DistanceAndFlags.m5798compareTo9YPOF3E(jM5799constructorimpl, jDistanceAndFlags$default) < 0) {
                    jDistanceAndFlags$default = jM5799constructorimpl;
                }
                if ((DistanceAndFlags.m5802getDistanceimpl(jDistanceAndFlags$default) < 0.0f && DistanceAndFlags.m5805isInLayerimpl(jDistanceAndFlags$default)) || i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return jDistanceAndFlags$default;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node p0, float p1, boolean p2, boolean p3, Function0<Unit> p4) {
        int i = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(p0);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(p1, p2, p3));
        p4.invoke();
        this.hitDepth = i;
    }

    public final void hitExpandedTouchBounds(Modifier.Node p0, boolean p1, Function0<Unit> p2) {
        HitTestResult hitTestResult = this;
        if (this.hitDepth == CollectionsKt.getLastIndex(hitTestResult)) {
            int i = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.add(p0);
            this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, p1, true));
            p2.invoke();
            this.hitDepth = i;
            return;
        }
        long jM5821findBestHitDistancefn2tFes = m5821findBestHitDistancefn2tFes();
        int i2 = this.hitDepth;
        if (!DistanceAndFlags.m5804isInExpandedBoundsimpl(jM5821findBestHitDistancefn2tFes)) {
            if (DistanceAndFlags.m5802getDistanceimpl(jM5821findBestHitDistancefn2tFes) > 0.0f) {
                int i3 = this.hitDepth;
                removeNodesInRange(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.add(p0);
                this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, p1, true));
                p2.invoke();
                this.hitDepth = i3;
                return;
            }
            return;
        }
        this.hitDepth = CollectionsKt.getLastIndex(hitTestResult);
        int i4 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(p0);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, p1, true));
        p2.invoke();
        this.hitDepth = i4;
        if (DistanceAndFlags.m5802getDistanceimpl(m5821findBestHitDistancefn2tFes()) < 0.0f) {
            removeNodesInRange(i2 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i2;
    }

    public final void speculativeHit(Modifier.Node p0, float p1, boolean p2, Function0<Unit> p3) {
        int i;
        HitTestResult hitTestResult = this;
        if (this.hitDepth == CollectionsKt.getLastIndex(hitTestResult)) {
            int i2 = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.add(p0);
            this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(p1, p2, false));
            p3.invoke();
            this.hitDepth = i2;
            if (this.hitDepth + 1 == CollectionsKt.getLastIndex(hitTestResult) || DistanceAndFlags.m5804isInExpandedBoundsimpl(m5821findBestHitDistancefn2tFes())) {
                removeNodeAtDepth(this.hitDepth + 1);
                return;
            }
            return;
        }
        long jM5821findBestHitDistancefn2tFes = m5821findBestHitDistancefn2tFes();
        int i3 = this.hitDepth;
        this.hitDepth = CollectionsKt.getLastIndex(hitTestResult);
        int i4 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(p0);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(p1, p2, false));
        p3.invoke();
        this.hitDepth = i4;
        long jM5821findBestHitDistancefn2tFes2 = m5821findBestHitDistancefn2tFes();
        if (this.hitDepth + 1 < CollectionsKt.getLastIndex(hitTestResult) && DistanceAndFlags.m5798compareTo9YPOF3E(jM5821findBestHitDistancefn2tFes, jM5821findBestHitDistancefn2tFes2) > 0) {
            if (DistanceAndFlags.m5804isInExpandedBoundsimpl(jM5821findBestHitDistancefn2tFes2)) {
                i = this.hitDepth + 2;
            } else {
                i = this.hitDepth + 1;
            }
            removeNodesInRange(i3 + 1, i);
        } else {
            removeNodesInRange(this.hitDepth + 1, size());
        }
        this.hitDepth = i3;
    }

    private final void removeNodeAtDepth(int p0) {
        this.values.removeAt(p0);
        this.distanceFromEdgeAndFlags.removeAt(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeNodesInRange(int p0, int p1) {
        if (p0 >= p1) {
            return;
        }
        this.values.removeRange(p0, p1);
        this.distanceFromEdgeAndFlags.removeRange(p0, p1);
    }

    public final void siblingHits(Function0<Unit> p0) {
        int i = this.hitDepth;
        p0.invoke();
        this.hitDepth = i;
    }

    public final boolean contains(Modifier.Node p0) {
        return indexOf((Object) p0) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> p0) {
        Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public final Modifier.Node get(int p0) {
        Object obj = this.values.get(p0);
        Intrinsics.checkNotNull(obj, "");
        return (Modifier.Node) obj;
    }

    public final int indexOf(Modifier.Node p0) {
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        int i = 0;
        while (!Intrinsics.areEqual(this.values.get(i), p0)) {
            if (i == lastIndex) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<Modifier.Node> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    public final int lastIndexOf(Modifier.Node p0) {
        for (int lastIndex = CollectionsKt.getLastIndex(this); lastIndex >= 0; lastIndex--) {
            if (Intrinsics.areEqual(this.values.get(lastIndex), p0)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final ListIterator<Modifier.Node> listIterator(int p0) {
        return new HitTestResultIterator(this, p0, 0, 0, 6, null);
    }

    @Override // java.util.List
    public final List<Modifier.Node> subList(int p0, int p1) {
        return new SubList(p0, p1);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.clear();
        this.distanceFromEdgeAndFlags.clear();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0097\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0010"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$HitTestResultIterator;", "", "Landroidx/compose/ui/Modifier$Node;", "", "p0", "p1", "p2", "<init>", "(Landroidx/compose/ui/node/HitTestResult;III)V", "", "hasNext", "()Z", "hasPrevious", "next", "()Landroidx/compose/ui/Modifier$Node;", "nextIndex", "()I", "previous", "previousIndex", FirebaseAnalytics.Param.INDEX, "I", "getIndex", "setIndex", "(I)V", "minIndex", "getMinIndex", "maxIndex", "getMaxIndex"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class HitTestResultIterator implements ListIterator<Modifier.Node>, KMappedMarker {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        public HitTestResultIterator(int i, int i2, int i3) {
            this.index = i;
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? hitTestResult.size() : i3);
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Modifier.Node next() {
            MutableObjectList mutableObjectList = HitTestResult.this.values;
            int i = this.index;
            this.index = i + 1;
            Object obj = mutableObjectList.get(i);
            Intrinsics.checkNotNull(obj, "");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.index - this.minIndex;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.ListIterator
        public final Modifier.Node previous() {
            MutableObjectList mutableObjectList = HitTestResult.this.values;
            int i = this.index - 1;
            this.index = i;
            Object obj = mutableObjectList.get(i);
            Intrinsics.checkNotNull(obj, "");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
        public final void add2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public final void set2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\r\b\u0083\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0097\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0019\u0010\u001bJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0014\u0010%\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010!"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$SubList;", "", "Landroidx/compose/ui/Modifier$Node;", "", "p0", "p1", "<init>", "(Landroidx/compose/ui/node/HitTestResult;II)V", "", "contains", "(Landroidx/compose/ui/Modifier$Node;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "get", "(I)Landroidx/compose/ui/Modifier$Node;", "indexOf", "(Landroidx/compose/ui/Modifier$Node;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "subList", "(II)Ljava/util/List;", "minIndex", "I", "getMinIndex", "()I", "maxIndex", "getMaxIndex", "getSize", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class SubList implements List<Modifier.Node>, KMappedMarker {
        private final int maxIndex;
        private final int minIndex;

        public SubList(int i, int i2) {
            this.minIndex = i;
            this.maxIndex = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return contains((Modifier.Node) obj);
            }
            return false;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return indexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return lastIndexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return getSize();
        }

        public final int getSize() {
            return this.maxIndex - this.minIndex;
        }

        public final boolean contains(Modifier.Node p0) {
            return indexOf((Object) p0) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> p0) {
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public final Modifier.Node get(int p0) {
            Object obj = HitTestResult.this.values.get(p0 + this.minIndex);
            Intrinsics.checkNotNull(obj, "");
            return (Modifier.Node) obj;
        }

        public final int indexOf(Modifier.Node p0) {
            int i = this.minIndex;
            int i2 = this.maxIndex;
            if (i > i2) {
                return -1;
            }
            while (!Intrinsics.areEqual(HitTestResult.this.values.get(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<Modifier.Node> iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i, i, this.maxIndex);
        }

        public final int lastIndexOf(Modifier.Node p0) {
            int i = this.maxIndex;
            int i2 = this.minIndex;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual(HitTestResult.this.values.get(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List
        public final ListIterator<Modifier.Node> listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public final ListIterator<Modifier.Node> listIterator(int p0) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new HitTestResultIterator(p0 + i, i, this.maxIndex);
        }

        @Override // java.util.List
        public final List<Modifier.Node> subList(int p0, int p1) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new SubList(p0 + i, i + p1);
        }

        /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
        public final void add2(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ void add(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void addFirst(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void addLast(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public final Modifier.Node remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ Modifier.Node remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final Modifier.Node removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: removeFirst, reason: collision with other method in class */
        public final /* synthetic */ Object m5824removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final Modifier.Node removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: removeLast, reason: collision with other method in class */
        public final /* synthetic */ Object m5825removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public final Modifier.Node set2(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }
    }

    public final void hit(Modifier.Node p0, boolean p1, Function0<Unit> p2) {
        int i = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(p0);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(-1.0f, p1, false));
        p2.invoke();
        this.hitDepth = i;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node p0, float p1, boolean p2, Function0<Unit> p3) {
        int i = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(p0);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(p1, p2, false));
        p3.invoke();
        this.hitDepth = i;
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public final void add2(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public final Modifier.Node remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ Modifier.Node remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Modifier.Node removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: removeFirst, reason: collision with other method in class */
    public final /* synthetic */ Object m5822removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Modifier.Node removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: removeLast, reason: collision with other method in class */
    public final /* synthetic */ Object m5823removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public final Modifier.Node set2(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }
}
