package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MultiValueMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\f\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Landroidx/compose/runtime/NestedContentMap;", "", "<init>", "()V", "Landroidx/compose/runtime/MovableContent;", "p0", "Landroidx/compose/runtime/NestedMovableContent;", "p1", "", "add", "(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/NestedMovableContent;)V", "clear", "removeLast", "(Landroidx/compose/runtime/MovableContent;)Landroidx/compose/runtime/NestedMovableContent;", "", "contains", "(Landroidx/compose/runtime/MovableContent;)Z", "Landroidx/compose/runtime/MovableContentStateReference;", "usedContainer", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/collection/MultiValueMap;", "contentMap", "Landroidx/collection/MutableScatterMap;", "containerMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NestedContentMap {
    private final MutableScatterMap<Object, Object> contentMap = MultiValueMap.m3616constructorimpl$default(null, 1, null);
    private final MutableScatterMap<Object, Object> containerMap = MultiValueMap.m3616constructorimpl$default(null, 1, null);

    public final void add(MovableContent<Object> p0, NestedMovableContent p1) {
        MultiValueMap.m3612addimpl(this.contentMap, p0, p1);
        MultiValueMap.m3612addimpl(this.containerMap, p1.getContainer(), p0);
    }

    public final void clear() {
        MultiValueMap.m3614clearimpl(this.contentMap);
        MultiValueMap.m3614clearimpl(this.containerMap);
    }

    public final NestedMovableContent removeLast(MovableContent<Object> p0) {
        NestedMovableContent nestedMovableContent = (NestedMovableContent) MultiValueMap.m3626removeLastimpl(this.contentMap, p0);
        if (MultiValueMap.m3623isEmptyimpl(this.contentMap)) {
            MultiValueMap.m3614clearimpl(this.containerMap);
        }
        return nestedMovableContent;
    }

    public final boolean contains(MovableContent<Object> p0) {
        return MultiValueMap.m3617containsimpl(this.contentMap, p0);
    }

    public final void usedContainer(final MovableContentStateReference p0) {
        Object obj = this.containerMap.get(p0);
        if (obj != null) {
            if (obj instanceof MutableObjectList) {
                ObjectList objectList = (ObjectList) obj;
                Object[] objArr = objectList.content;
                int i = objectList._size;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj2 = objArr[i2];
                    Intrinsics.checkNotNull(obj2, "");
                    MultiValueMap.m3627removeValueIfimpl(this.contentMap, (MovableContent) obj2, new Function1() { // from class: androidx.compose.runtime.NestedContentMap$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return Boolean.valueOf(NestedContentMap.usedContainer$lambda$2$lambda$1(p0, (NestedMovableContent) obj3));
                        }
                    });
                }
                return;
            }
            Intrinsics.checkNotNull(obj, "");
            MultiValueMap.m3627removeValueIfimpl(this.contentMap, (MovableContent) obj, new Function1() { // from class: androidx.compose.runtime.NestedContentMap$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(NestedContentMap.usedContainer$lambda$2$lambda$1(p0, (NestedMovableContent) obj3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean usedContainer$lambda$2$lambda$1(MovableContentStateReference movableContentStateReference, NestedMovableContent nestedMovableContent) {
        return Intrinsics.areEqual(nestedMovableContent.getContainer(), movableContentStateReference);
    }
}
