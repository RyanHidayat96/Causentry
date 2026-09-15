package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001f\b\u0007\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00020\t0\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00020\u000f0\u0013H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\t2\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00020\u000f0\u0013H\u0086\b¢\u0006\u0004\b!\u0010\"J,\u0010'\u001a\u00020\t2\u001a\b\u0004\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0$H\u0086\b¢\u0006\u0004\b%\u0010&J\u0015\u0010*\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b(\u0010)J!\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,0+H\u0007¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0011\u0010>\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b<\u0010=\u0088\u00018\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004"}, d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "", "Key", "Scope", "Landroidx/collection/MutableScatterMap;", "p0", "constructor-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "p1", "", "add-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", "add", "set-impl", "set", "", "contains-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "contains", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "forEachScopeOf-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "forEachScopeOf", "anyScopeOf-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "anyScopeOf", "clear-impl", "(Landroidx/collection/MutableScatterMap;)V", "clear", "remove-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "removeScopeIf-impl", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function1;)V", "removeScopeIf", "Lkotlin/Function2;", "removeIf-impl", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;)V", "removeIf", "removeScope-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V", "removeScope", "", "", "asMap-impl", "(Landroidx/collection/MutableScatterMap;)Ljava/util/Map;", "asMap", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "map", "Landroidx/collection/MutableScatterMap;", "getMap", "()Landroidx/collection/MutableScatterMap;", "getSize-impl", "(Landroidx/collection/MutableScatterMap;)I", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class ScopeMap<Key, Scope> {
    private final MutableScatterMap<Object, Object> map;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <Key, Scope> MutableScatterMap<Object, Object> m3636constructorimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }

    private /* synthetic */ ScopeMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m3637constructorimpl$default(MutableScatterMap mutableScatterMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            mutableScatterMap = ScatterMapKt.mutableScatterMapOf();
        }
        return m3636constructorimpl(mutableScatterMap);
    }

    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m3642getSizeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.get_size();
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m3648setimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Scope scope) {
        mutableScatterMap.set(key, scope);
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3638containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key) {
        return mutableScatterMap.containsKey(key);
    }

    /* JADX INFO: renamed from: forEachScopeOf-impl, reason: not valid java name */
    public static final void m3641forEachScopeOfimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Function1<? super Scope, Unit> function1) {
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            function1.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            function1.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: clear-impl, reason: not valid java name */
    public static final void m3635clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* JADX INFO: renamed from: remove-impl, reason: not valid java name */
    public static final boolean m3644removeimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Scope scope) {
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return false;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            boolean zRemove = mutableScatterSet.remove(scope);
            if (zRemove && mutableScatterSet.isEmpty()) {
                mutableScatterMap.remove(key);
            }
            return zRemove;
        }
        if (!Intrinsics.areEqual(obj, scope)) {
            return false;
        }
        mutableScatterMap.remove(key);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x006d A[LOOP:0: B:5:0x0015->B:19:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[EDGE_INSN: B:23:0x0070->B:20:0x0070 BREAK  A[LOOP:0: B:5:0x0015->B:19:0x006d], SYNTHETIC] */
    /* JADX INFO: renamed from: asMap-impl, reason: not valid java name */
    public static final Map<Key, Set<Scope>> m3633asMapimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        Set setMutableSetOf;
        HashMap map = new HashMap();
        MutableScatterMap<Object, Object> mutableScatterMap2 = mutableScatterMap;
        Object[] objArr = mutableScatterMap2.keys;
        Object[] objArr2 = mutableScatterMap2.values;
        long[] jArr = mutableScatterMap2.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            HashMap map2 = map;
                            Intrinsics.checkNotNull(obj, "");
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "");
                                setMutableSetOf = ((MutableScatterSet) obj2).asSet();
                            } else {
                                Intrinsics.checkNotNull(obj2, "");
                                setMutableSetOf = SetsKt.mutableSetOf(obj2);
                            }
                            map2.put(obj, setMutableSetOf);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: add-impl, reason: not valid java name */
    public static final void m3631addimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Scope scope) {
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(key);
        int i = 1;
        int i2 = 0;
        boolean z = iFindInsertIndex < 0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object obj = z ? null : mutableScatterMap.values[iFindInsertIndex];
        if (obj != null) {
            if (obj instanceof MutableScatterSet) {
                Intrinsics.checkNotNull(obj, "");
                ((MutableScatterSet) obj).add(scope);
            } else if (obj != scope) {
                MutableScatterSet mutableScatterSet = new MutableScatterSet(i2, i, defaultConstructorMarker);
                Intrinsics.checkNotNull(obj, "");
                mutableScatterSet.add(obj);
                mutableScatterSet.add(scope);
                scope = (Scope) mutableScatterSet;
            }
            scope = (Scope) obj;
        }
        if (z) {
            int i3 = ~iFindInsertIndex;
            mutableScatterMap.keys[i3] = key;
            mutableScatterMap.values[i3] = scope;
            return;
        }
        mutableScatterMap.values[iFindInsertIndex] = scope;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[LOOP:0: B:9:0x001a->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0069 A[SYNTHETIC] */
    /* JADX INFO: renamed from: anyScopeOf-impl, reason: not valid java name */
    public static final boolean m3632anyScopeOfimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Function1<? super Scope, Boolean> function1) {
        Object obj = mutableScatterMap.get(key);
        if (obj != null) {
            if (obj instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128 && function1.invoke(objArr[(i << 3) + i3]).booleanValue()) {
                                    return true;
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
            } else if (function1.invoke(obj).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: removeScopeIf-impl, reason: not valid java name */
    public static final void m3647removeScopeIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, Function1<? super Scope, Boolean> function1) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        long j;
        long j2;
        int i4;
        boolean zBooleanValue;
        long[] jArr3 = mutableScatterMap.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j3 = jArr3[i5];
            char c = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j3 & 255) < 128) {
                        int i9 = (i5 << 3) + i8;
                        Object obj = mutableScatterMap.keys[i9];
                        Object obj2 = mutableScatterMap.values[i9];
                        if (obj2 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(obj2, "");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet.elements;
                            long[] jArr4 = mutableScatterSet.metadata;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                i2 = length;
                                int i10 = 0;
                                while (true) {
                                    long j5 = jArr4[i10];
                                    i3 = i5;
                                    j = j3;
                                    j2 = -9187201950435737472L;
                                    if ((((~j5) << c) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j5 & 255) < 128) {
                                                int i13 = (i10 << 3) + i12;
                                                if (function1.invoke(objArr[i13]).booleanValue()) {
                                                    mutableScatterSet.removeElementAt(i13);
                                                }
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i11 != 8) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    i5 = i3;
                                    j3 = j;
                                    c = 7;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = length;
                                i3 = i5;
                                j = j3;
                                j2 = -9187201950435737472L;
                            }
                            zBooleanValue = mutableScatterSet.isEmpty();
                        } else {
                            jArr2 = jArr3;
                            i2 = length;
                            i3 = i5;
                            j = j3;
                            j2 = j4;
                            Intrinsics.checkNotNull(obj2, "");
                            zBooleanValue = function1.invoke(obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            mutableScatterMap.removeValueAt(i9);
                        }
                        i4 = 8;
                    } else {
                        jArr2 = jArr3;
                        i2 = length;
                        i3 = i5;
                        j = j3;
                        j2 = j4;
                        i4 = i6;
                    }
                    j3 = j >> i4;
                    i8++;
                    i6 = i4;
                    j4 = j2;
                    jArr3 = jArr2;
                    length = i2;
                    i5 = i3;
                    c = 7;
                }
                jArr = jArr3;
                int i14 = length;
                int i15 = i5;
                if (i7 != i6) {
                    return;
                }
                length = i14;
                i = i15;
            } else {
                jArr = jArr3;
                i = i5;
            }
            if (i == length) {
                return;
            }
            i5 = i + 1;
            jArr3 = jArr;
        }
    }

    /* JADX INFO: renamed from: removeIf-impl, reason: not valid java name */
    public static final void m3645removeIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, Function2<? super Key, ? super Scope, Boolean> function2) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        long j;
        long j2;
        int i4;
        boolean zBooleanValue;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5 = mutableScatterMap.metadata;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j3 = jArr5[i5];
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j3 & 255) < 128) {
                        int i9 = (i5 << 3) + i8;
                        Object obj = mutableScatterMap.keys[i9];
                        Object obj2 = mutableScatterMap.values[i9];
                        Intrinsics.checkNotNull(obj, "");
                        if (obj2 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(obj2, "");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet.elements;
                            long[] jArr6 = mutableScatterSet.metadata;
                            int length2 = jArr6.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr5;
                                i2 = length;
                                int i10 = 0;
                                while (true) {
                                    long j5 = jArr6[i10];
                                    i3 = i5;
                                    j = j3;
                                    j2 = -9187201950435737472L;
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        int i12 = 0;
                                        while (i12 < i11) {
                                            if ((j5 & 255) < 128) {
                                                int i13 = (i10 << 3) + i12;
                                                jArr4 = jArr6;
                                                if (function2.invoke(obj, objArr[i13]).booleanValue()) {
                                                    mutableScatterSet.removeElementAt(i13);
                                                }
                                            } else {
                                                jArr4 = jArr6;
                                            }
                                            j5 >>= 8;
                                            i12++;
                                            jArr6 = jArr4;
                                        }
                                        jArr3 = jArr6;
                                        if (i11 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr6;
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    jArr6 = jArr3;
                                    i5 = i3;
                                    j3 = j;
                                }
                            } else {
                                jArr2 = jArr5;
                                i2 = length;
                                i3 = i5;
                                j = j3;
                                j2 = -9187201950435737472L;
                            }
                            zBooleanValue = mutableScatterSet.isEmpty();
                        } else {
                            jArr2 = jArr5;
                            i2 = length;
                            i3 = i5;
                            j = j3;
                            j2 = -9187201950435737472L;
                            Intrinsics.checkNotNull(obj2, "");
                            zBooleanValue = function2.invoke(obj, obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            mutableScatterMap.removeValueAt(i9);
                        }
                        i4 = 8;
                    } else {
                        jArr2 = jArr5;
                        i2 = length;
                        i3 = i5;
                        j = j3;
                        j2 = j4;
                        i4 = i6;
                    }
                    j3 = j >> i4;
                    i8++;
                    i6 = i4;
                    j4 = j2;
                    jArr5 = jArr2;
                    length = i2;
                    i5 = i3;
                }
                jArr = jArr5;
                int i14 = length;
                int i15 = i5;
                if (i7 != i6) {
                    return;
                }
                length = i14;
                i = i15;
            } else {
                jArr = jArr5;
                i = i5;
            }
            if (i == length) {
                return;
            }
            i5 = i + 1;
            jArr5 = jArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX INFO: renamed from: removeScope-impl, reason: not valid java name */
    public static final void m3646removeScopeimpl(MutableScatterMap<Object, Object> mutableScatterMap, Scope scope) {
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = mutableScatterMap.keys[i4];
                        Object obj2 = mutableScatterMap.values[i4];
                        if (obj2 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(obj2, "");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            mutableScatterSet.remove(scope);
                            if (mutableScatterSet.isEmpty()) {
                                mutableScatterMap.removeValueAt(i4);
                            }
                        } else if (obj2 == scope) {
                            mutableScatterMap.removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScopeMap m3634boximpl(MutableScatterMap mutableScatterMap) {
        return new ScopeMap(mutableScatterMap);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3639equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof ScopeMap) && Intrinsics.areEqual(mutableScatterMap, ((ScopeMap) obj).getMap());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3640equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return Intrinsics.areEqual(mutableScatterMap, mutableScatterMap2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3643hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3649toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        StringBuilder sb = new StringBuilder("ScopeMap(map=");
        sb.append(mutableScatterMap);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return m3639equalsimpl(this.map, p0);
    }

    public final int hashCode() {
        return m3643hashCodeimpl(this.map);
    }

    public final String toString() {
        return m3649toStringimpl(this.map);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ MutableScatterMap getMap() {
        return this.map;
    }
}
