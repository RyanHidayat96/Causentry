package androidx.compose.ui.graphics;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0004J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ?\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u000f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0013J8\u0010\u0015\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u00050\u0014H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u00050\u0014H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u0019\u001a\u00020\u00182\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u001cH\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u00052\u0010\u0010\t\u001a\f0#R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\u00052\u0010\u0010\t\u001a\f0#R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b&\u0010%J!\u0010'\u001a\u00020\u00052\u0010\u0010\t\u001a\f0#R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b'\u0010%J!\u0010(\u001a\u00020\u00052\u0010\u0010\t\u001a\f0#R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b(\u0010%R\u001e\u0010)\u001a\f0#R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010+\u001a\f0#R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b+\u0010*R8\u0010.\u001a&\u0012\u000e\u0012\f0#R\b\u0012\u0004\u0012\u00028\u00000\u00000,j\u0012\u0012\u000e\u0012\f0#R\b\u0012\u0004\u0012\u00028\u00000\u0000`-8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "", "clear", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "p0", "Landroidx/compose/ui/graphics/Interval;", "findFirstOverlap", "(Lkotlin/ranges/ClosedFloatingPointRange;)Landroidx/compose/ui/graphics/Interval;", "p1", "(FF)Landroidx/compose/ui/graphics/Interval;", "", "findOverlaps", "(Lkotlin/ranges/ClosedFloatingPointRange;Ljava/util/List;)Ljava/util/List;", "p2", "(FFLjava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "forEach$ui_graphics_release", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;)V", "(FFLkotlin/jvm/functions/Function1;)V", "", "contains", "(F)Z", "(Lkotlin/ranges/ClosedFloatingPointRange;)Z", "", "iterator", "()Ljava/util/Iterator;", "plusAssign", "(Landroidx/compose/ui/graphics/Interval;)V", "addInterval", "(FFLjava/lang/Object;)V", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "rebalance", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "rotateLeft", "rotateRight", "updateNodeData", "terminator", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "root", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "stack", "Ljava/util/ArrayList;", "Node"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntervalTree<T> {
    public IntervalTree<T>.Node root;
    public final ArrayList<IntervalTree<T>.Node> stack;
    public final IntervalTree<T>.Node terminator;

    public IntervalTree() {
        IntervalTree<T>.Node node = new Node(Float.MAX_VALUE, Float.MIN_VALUE, null, 1);
        this.terminator = node;
        this.root = node;
        this.stack = new ArrayList<>();
    }

    public final void clear() {
        this.root = this.terminator;
    }

    public final Interval<T> findFirstOverlap(ClosedFloatingPointRange<Float> p0) {
        return findFirstOverlap(p0.getStart().floatValue(), p0.getEndInclusive().floatValue());
    }

    public static /* synthetic */ Interval findFirstOverlap$default(IntervalTree intervalTree, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return intervalTree.findFirstOverlap(f, f2);
    }

    public final Interval<T> findFirstOverlap(float p0, float p1) {
        IntervalTree<T>.Node node = this.root;
        IntervalTree<T>.Node node2 = this.terminator;
        if (node != node2 && node != node2) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(p0, p1)) {
                    return nodeRemove;
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= p0) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= p1) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
        Interval<T> interval = (Interval<T>) IntervalTreeKt.getEmptyInterval();
        Intrinsics.checkNotNull(interval, "");
        return interval;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, ClosedFloatingPointRange closedFloatingPointRange, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(closedFloatingPointRange, list);
    }

    public final List<Interval<T>> findOverlaps(ClosedFloatingPointRange<Float> p0, List<Interval<T>> p1) {
        return findOverlaps(p0.getStart().floatValue(), p0.getEndInclusive().floatValue(), p1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, float f, float f2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        if ((i & 4) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(f, f2, list);
    }

    public final void forEach$ui_graphics_release(ClosedFloatingPointRange<Float> p0, Function1<? super Interval<T>, Unit> p1) {
        float fFloatValue = p0.getStart().floatValue();
        float fFloatValue2 = p0.getEndInclusive().floatValue();
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(fFloatValue, fFloatValue2)) {
                    p1.invoke(nodeRemove);
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= fFloatValue) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= fFloatValue2) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public static /* synthetic */ void forEach$ui_graphics_release$default(IntervalTree intervalTree, float f, float f2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        IntervalTree<T>.Node node = intervalTree.root;
        if (node != intervalTree.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = intervalTree.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(f, f2)) {
                    function1.invoke(nodeRemove);
                }
                if (nodeRemove.getLeft() != intervalTree.terminator && nodeRemove.getLeft().getMax() >= f) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != intervalTree.terminator && nodeRemove.getRight().getMin() <= f2) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public final void forEach$ui_graphics_release(float p0, float p1, Function1<? super Interval<T>, Unit> p2) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(p0, p1)) {
                    p2.invoke(nodeRemove);
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= p0) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= p1) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public final boolean contains(float p0) {
        return findFirstOverlap(p0, p0) != IntervalTreeKt.getEmptyInterval();
    }

    public final boolean contains(ClosedFloatingPointRange<Float> p0) {
        return findFirstOverlap(p0.getStart().floatValue(), p0.getEndInclusive().floatValue()) != IntervalTreeKt.getEmptyInterval();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.IntervalTree$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0006\u001a\f0\bR\b\u0012\u0004\u0012\u00028\u00000\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$iterator$1;", "", "Landroidx/compose/ui/graphics/Interval;", "", "hasNext", "()Z", "next", "()Landroidx/compose/ui/graphics/Interval;", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/IntervalTree;", "Landroidx/compose/ui/graphics/IntervalTree$Node;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Interval<T>>, KMappedMarker {
        private IntervalTree<T>.Node next;
        final /* synthetic */ IntervalTree<T> this$0;

        AnonymousClass1(IntervalTree<T> intervalTree) {
            this.this$0 = intervalTree;
            this.next = intervalTree.root.lowestNode();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.next != this.this$0.terminator;
        }

        @Override // java.util.Iterator
        public final Interval<T> next() {
            IntervalTree<T>.Node node = this.next;
            this.next = node.next();
            return node;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final Iterator<Interval<T>> iterator() {
        return new AnonymousClass1(this);
    }

    public final void plusAssign(Interval<T> p0) {
        addInterval(p0.getStart(), p0.getEnd(), p0.getData());
    }

    public final void addInterval(float p0, float p1, T p2) {
        IntervalTree<T>.Node right;
        IntervalTree<T>.Node node = new Node(p0, p1, p2, 0);
        IntervalTree<T>.Node node2 = this.root;
        IntervalTree<T>.Node node3 = this.terminator;
        while (node2 != this.terminator) {
            if (node.getStart() <= node2.getStart()) {
                right = node2.getLeft();
            } else {
                right = node2.getRight();
            }
            IntervalTree<T>.Node node4 = right;
            node3 = node2;
            node2 = node4;
        }
        node.setParent(node3);
        if (node3 == this.terminator) {
            this.root = node;
        } else if (node.getStart() <= node3.getStart()) {
            node3.setLeft(node);
        } else {
            node3.setRight(node);
        }
        updateNodeData(node);
        rebalance(node);
    }

    private final void rebalance(IntervalTree<T>.Node p0) {
        while (p0 != this.root && p0.getParent().getColor() == 0) {
            IntervalTree<T>.Node parent = p0.getParent().getParent();
            if (p0.getParent() == parent.getLeft()) {
                IntervalTree<T>.Node right = parent.getRight();
                if (right.getColor() == 0) {
                    right.setColor(1);
                    p0.getParent().setColor(1);
                    parent.setColor(0);
                    p0 = parent;
                } else {
                    if (p0 == p0.getParent().getRight()) {
                        p0 = p0.getParent();
                        rotateLeft(p0);
                    }
                    p0.getParent().setColor(1);
                    parent.setColor(0);
                    rotateRight(parent);
                }
            } else {
                IntervalTree<T>.Node left = parent.getLeft();
                if (left.getColor() == 0) {
                    left.setColor(1);
                    p0.getParent().setColor(1);
                    parent.setColor(0);
                    p0 = parent;
                } else {
                    if (p0 == p0.getParent().getLeft()) {
                        p0 = p0.getParent();
                        rotateRight(p0);
                    }
                    p0.getParent().setColor(1);
                    parent.setColor(0);
                    rotateLeft(parent);
                }
            }
        }
        this.root.setColor(1);
    }

    private final void rotateLeft(IntervalTree<T>.Node p0) {
        IntervalTree<T>.Node right = p0.getRight();
        p0.setRight(right.getLeft());
        if (right.getLeft() != this.terminator) {
            right.getLeft().setParent(p0);
        }
        right.setParent(p0.getParent());
        if (p0.getParent() == this.terminator) {
            this.root = right;
        } else if (p0.getParent().getLeft() == p0) {
            p0.getParent().setLeft(right);
        } else {
            p0.getParent().setRight(right);
        }
        right.setLeft(p0);
        p0.setParent(right);
        updateNodeData(p0);
    }

    private final void rotateRight(IntervalTree<T>.Node p0) {
        IntervalTree<T>.Node left = p0.getLeft();
        p0.setLeft(left.getRight());
        if (left.getRight() != this.terminator) {
            left.getRight().setParent(p0);
        }
        left.setParent(p0.getParent());
        if (p0.getParent() == this.terminator) {
            this.root = left;
        } else if (p0.getParent().getRight() == p0) {
            p0.getParent().setRight(left);
        } else {
            p0.getParent().setLeft(left);
        }
        left.setRight(p0);
        p0.setParent(left);
        updateNodeData(p0);
    }

    private final void updateNodeData(IntervalTree<T>.Node p0) {
        while (p0 != this.terminator) {
            p0.setMin(Math.min(p0.getStart(), Math.min(p0.getLeft().getMin(), p0.getRight().getMin())));
            p0.setMax(Math.max(p0.getEnd(), Math.max(p0.getLeft().getMax(), p0.getRight().getMax())));
            p0 = p0.getParent();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rR&\u0010\u000f\u001a\u00060\u0006j\u0002`\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR,\u0010\u001e\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\"R,\u0010#\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\"R,\u0010&\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\""}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/Interval;", "", "p0", "p1", "p2", "", "Landroidx/compose/ui/graphics/TreeColor;", "p3", "<init>", "(Landroidx/compose/ui/graphics/IntervalTree;FFLjava/lang/Object;I)V", "Landroidx/compose/ui/graphics/IntervalTree;", "lowestNode", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "next", TypedValues.Custom.S_COLOR, "I", "getColor", "()I", "setColor", "(I)V", "min", "F", "getMin", "()F", "setMin", "(F)V", "max", "getMax", "setMax", "left", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "getLeft", "setLeft", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "right", "getRight", "setRight", "parent", "getParent", "setParent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Node extends Interval<T> {
        private int color;
        private IntervalTree<T>.Node left;
        private float max;
        private float min;
        private IntervalTree<T>.Node parent;
        private IntervalTree<T>.Node right;

        public Node(float f, float f2, T t, int i) {
            super(f, f2, t);
            this.color = i;
            this.min = f;
            this.max = f2;
            this.left = IntervalTree.this.terminator;
            this.right = IntervalTree.this.terminator;
            this.parent = IntervalTree.this.terminator;
        }

        public final int getColor() {
            return this.color;
        }

        public final void setColor(int i) {
            this.color = i;
        }

        public final float getMin() {
            return this.min;
        }

        public final void setMin(float f) {
            this.min = f;
        }

        public final float getMax() {
            return this.max;
        }

        public final void setMax(float f) {
            this.max = f;
        }

        public final IntervalTree<T>.Node getLeft() {
            return this.left;
        }

        public final void setLeft(IntervalTree<T>.Node node) {
            this.left = node;
        }

        public final IntervalTree<T>.Node getRight() {
            return this.right;
        }

        public final void setRight(IntervalTree<T>.Node node) {
            this.right = node;
        }

        public final IntervalTree<T>.Node getParent() {
            return this.parent;
        }

        public final void setParent(IntervalTree<T>.Node node) {
            this.parent = node;
        }

        public final IntervalTree<T>.Node lowestNode() {
            Node node = this;
            while (node.left != IntervalTree.this.terminator) {
                node = node.left;
            }
            return node;
        }

        public final IntervalTree<T>.Node next() {
            if (this.right != IntervalTree.this.terminator) {
                return this.right.lowestNode();
            }
            IntervalTree<T>.Node node = this.parent;
            Node node2 = this;
            while (node != IntervalTree.this.terminator && node2 == node.right) {
                node2 = node;
                node = node.parent;
            }
            return node;
        }
    }

    public final List<Interval<T>> findOverlaps(float p0, float p1, List<Interval<T>> p2) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(p0, p1)) {
                    p2.add(nodeRemove);
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= p0) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= p1) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
        return p2;
    }
}
