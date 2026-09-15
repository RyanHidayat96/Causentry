package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 )*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J:\u0010\u0018\u001a\u00020\u00062\u001f\u0010\u0003\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\tJ#\u0010\u001c\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u00028\u00008\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/RecordingApplier;", "N", "Landroidx/compose/runtime/Applier;", "p0", "<init>", "(Ljava/lang/Object;)V", "", EnabledPayment.STATUS_DOWN, EnabledPayment.STATUS_UP, "()V", "", "p1", "remove", "(II)V", "p2", "move", "(III)V", "clear", "insertBottomUp", "(ILjava/lang/Object;)V", "insertTopDown", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "apply", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "reuse", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "playTo", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/internal/RememberEventDispatcher;)V", "Landroidx/collection/MutableIntList;", "operations", "Landroidx/collection/MutableIntList;", "Landroidx/collection/MutableObjectList;", "instances", "Landroidx/collection/MutableObjectList;", "current", "Ljava/lang/Object;", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordingApplier<N> implements Applier<N> {
    public static final int APPLY = 7;
    public static final int CLEAR = 4;
    public static final int DOWN = 1;
    public static final int INSERT_BOTTOM_UP = 5;
    public static final int INSERT_TOP_DOWN = 6;
    public static final int MOVE = 3;
    public static final int REMOVE = 2;
    public static final int REUSE = 8;
    public static final int UP = 0;
    private N current;
    public static final int $stable = 8;
    private final MutableIntList operations = new MutableIntList(0, 1, null);
    private final MutableObjectList<Object> instances = new MutableObjectList<>(0, 1, null);

    public RecordingApplier(N n) {
        this.current = n;
    }

    @Override // androidx.compose.runtime.Applier
    public final N getCurrent() {
        return this.current;
    }

    public final void setCurrent(N n) {
        this.current = n;
    }

    @Override // androidx.compose.runtime.Applier
    public final void down(N p0) {
        this.operations.add(1);
        this.instances.add(p0);
    }

    @Override // androidx.compose.runtime.Applier
    public final void up() {
        this.operations.add(0);
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int p0, int p1) {
        this.operations.add(2);
        this.operations.add(p0);
        this.operations.add(p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int p0, int p1, int p2) {
        this.operations.add(3);
        this.operations.add(p0);
        this.operations.add(p1);
        this.operations.add(p2);
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        this.operations.add(4);
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int p0, N p1) {
        this.operations.add(5);
        this.operations.add(p0);
        this.instances.add(p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int p0, N p1) {
        this.operations.add(6);
        this.operations.add(p0);
        this.instances.add(p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void apply(Function2<? super N, Object, Unit> p0, Object p1) {
        this.operations.add(7);
        this.instances.add(p0);
        this.instances.add(p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void reuse() {
        this.operations.add(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void playTo(Applier<N> p0, RememberEventDispatcher p1) {
        Exception e2;
        int i;
        int i2;
        MutableIntList mutableIntList = this.operations;
        int i3 = mutableIntList._size;
        MutableObjectList<Object> mutableObjectList = this.instances;
        int i4 = 0;
        MutableObjectList mutableObjectList2 = new MutableObjectList(0, 1, null);
        p0.onBeginChanges();
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i4 + 1;
            try {
                try {
                    switch (mutableIntList.get(i4)) {
                        case 0:
                            p0.up();
                            i4 = i6;
                            break;
                        case 1:
                            p0.down(mutableObjectList.get(i5));
                            i5++;
                            i4 = i6;
                            break;
                        case 2:
                            int i7 = i4 + 2;
                            i4 += 3;
                            p0.remove(mutableIntList.get(i6), mutableIntList.get(i7));
                            break;
                        case 3:
                            int i8 = i4 + 2;
                            try {
                                i = i4 + 3;
                                try {
                                    i4 += 4;
                                    p0.move(mutableIntList.get(i6), mutableIntList.get(i8), mutableIntList.get(i));
                                } catch (Exception e3) {
                                    e2 = e3;
                                    throw new ComposePausableCompositionException(mutableObjectList, mutableObjectList2, mutableIntList, i, e2);
                                }
                            } catch (Exception e4) {
                                e2 = e4;
                                i6 = i8;
                                i = i6;
                                throw new ComposePausableCompositionException(mutableObjectList, mutableObjectList2, mutableIntList, i, e2);
                            }
                            break;
                        case 4:
                            p0.clear();
                            i4 = i6;
                            break;
                        case 5:
                            i4 += 2;
                            i2 = i5 + 1;
                            p0.insertBottomUp(mutableIntList.get(i6), mutableObjectList.get(i5));
                            i5 = i2;
                            break;
                        case 6:
                            i4 += 2;
                            try {
                                i2 = i5 + 1;
                                p0.insertTopDown(mutableIntList.get(i6), mutableObjectList.get(i5));
                                i5 = i2;
                            } catch (Exception e5) {
                                e2 = e5;
                                i = i4;
                                throw new ComposePausableCompositionException(mutableObjectList, mutableObjectList2, mutableIntList, i, e2);
                            }
                            break;
                        case 7:
                            Object obj = mutableObjectList.get(i5);
                            Intrinsics.checkNotNull(obj, "");
                            int i9 = i5 + 2;
                            p0.apply((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 2), mutableObjectList.get(i5 + 1));
                            i5 = i9;
                            i4 = i6;
                            break;
                        case 8:
                            Object current = p0.getCurrent();
                            if (current instanceof ComposeNodeLifecycleCallback) {
                                p1.dispatchOnDeactivateIfNecessary((ComposeNodeLifecycleCallback) current);
                            }
                            mutableObjectList2.add(current);
                            p0.reuse();
                            i4 = i6;
                            break;
                        default:
                            i4 = i6;
                            break;
                    }
                } catch (Exception e6) {
                    e2 = e6;
                }
            } catch (Throwable th) {
                p0.onEndChanges();
                throw th;
            }
        }
        if (i5 != mutableObjectList.getSize()) {
            ComposerKt.composeImmediateRuntimeError("Applier operation size mismatch");
        }
        mutableObjectList.clear();
        mutableIntList.clear();
        p0.onEndChanges();
    }
}
