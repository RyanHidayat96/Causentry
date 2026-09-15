package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\t\u001a\u00020\u0000*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\r\u001a\u00020\f*\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "p0", "Landroidx/compose/runtime/MutableLongState;", "mutableLongStateOf", "(J)Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/LongState;", "", "Lkotlin/reflect/KProperty;", "p1", "getValue", "(Landroidx/compose/runtime/LongState;Ljava/lang/Object;Lkotlin/reflect/KProperty;)J", "p2", "", "setValue", "(Landroidx/compose/runtime/MutableLongState;Ljava/lang/Object;Lkotlin/reflect/KProperty;J)V"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotLongStateKt")
final /* synthetic */ class SnapshotLongStateKt__SnapshotLongStateKt {
    public static final MutableLongState mutableLongStateOf(long j) {
        return SnapshotLongState_androidKt.createSnapshotMutableLongState(j);
    }

    public static final long getValue(LongState longState, Object obj, KProperty<?> kProperty) {
        return longState.getLongValue();
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, KProperty<?> kProperty, long j) {
        mutableLongState.setLongValue(j);
    }
}
