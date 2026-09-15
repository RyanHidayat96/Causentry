package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\b\u0003\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R*\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R2\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00100\u001a\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "", "", "", "", "p0", "Lkotlin/Function1;", "", "p1", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "canBeSaved", "(Ljava/lang/Object;)Z", "consumeRestored", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "performSave", "()Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "Landroidx/collection/MutableScatterMap;", "restored", "Landroidx/collection/MutableScatterMap;", "", "valueProviders"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final Function1<Object, Boolean> canBeSaved;
    private final MutableScatterMap<String, List<Object>> restored;
    private MutableScatterMap<String, List<Function0<Object>>> valueProviders;

    public SaveableStateRegistryImpl(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        this.canBeSaved = function1;
        this.restored = (map == null || map.isEmpty()) ? null : SaveableStateRegistryKt.toMutableScatterMap(map);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(Object p0) {
        return this.canBeSaved.invoke(p0).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object consumeRestored(String p0) {
        MutableScatterMap<String, List<Object>> mutableScatterMap;
        MutableScatterMap<String, List<Object>> mutableScatterMap2 = this.restored;
        List<Object> listRemove = mutableScatterMap2 != null ? mutableScatterMap2.remove(p0) : null;
        List<Object> list = listRemove;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (listRemove.size() > 1 && (mutableScatterMap = this.restored) != null) {
            mutableScatterMap.put(p0, listRemove.subList(1, listRemove.size()));
        }
        return listRemove.get(0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final SaveableStateRegistry.Entry registerProvider(final String p0, final Function0<? extends Object> p1) {
        if (SaveableStateRegistryKt.fastIsBlank(p0)) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        final MutableScatterMap<String, List<Function0<Object>>> mutableScatterMapMutableScatterMapOf = this.valueProviders;
        if (mutableScatterMapMutableScatterMapOf == null) {
            mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
            this.valueProviders = mutableScatterMapMutableScatterMapOf;
        }
        ArrayList arrayList = mutableScatterMapMutableScatterMapOf.get(p0);
        if (arrayList == null) {
            arrayList = new ArrayList();
            mutableScatterMapMutableScatterMapOf.set(p0, arrayList);
        }
        arrayList.add(p1);
        return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.registerProvider.3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public final void unregister() {
                List<Function0<Object>> listRemove = mutableScatterMapMutableScatterMapOf.remove(p0);
                if (listRemove != null) {
                    listRemove.remove(p1);
                }
                List<Function0<Object>> list = listRemove;
                if (list == null || list.isEmpty()) {
                    return;
                }
                mutableScatterMapMutableScatterMapOf.set(p0, listRemove);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[LOOP:0: B:20:0x0041->B:30:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x008a A[EDGE_INSN: B:73:0x008a->B:31:0x008a BREAK  A[LOOP:0: B:20:0x0041->B:30:0x0082], SYNTHETIC] */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map<String, List<Object>> performSave() {
        long[] jArr;
        Object[] objArr;
        int i;
        Object[] objArr2;
        int i2;
        MutableScatterMap<String, List<Object>> mutableScatterMap = this.restored;
        if (mutableScatterMap == null && this.valueProviders == null) {
            return MapsKt.emptyMap();
        }
        int i3 = mutableScatterMap != null ? mutableScatterMap.get_size() : 0;
        MutableScatterMap<String, List<Function0<Object>>> mutableScatterMap2 = this.valueProviders;
        HashMap map = new HashMap(i3 + (mutableScatterMap2 != null ? mutableScatterMap2.get_size() : 0));
        MutableScatterMap<String, List<Object>> mutableScatterMap3 = this.restored;
        char c = 7;
        long j = -9187201950435737472L;
        int i4 = 8;
        if (mutableScatterMap3 != null) {
            MutableScatterMap<String, List<Object>> mutableScatterMap4 = mutableScatterMap3;
            Object[] objArr3 = mutableScatterMap4.keys;
            Object[] objArr4 = mutableScatterMap4.values;
            long[] jArr2 = mutableScatterMap4.metadata;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr2[i5];
                    if ((((~j2) << 7) & j2 & j) == j) {
                        if (i5 != length) {
                            break;
                            break;
                        }
                        i5++;
                        j = -9187201950435737472L;
                    } else {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j2 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                map.put((String) objArr3[i8], (List) objArr4[i8]);
                            }
                            j2 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                        if (i5 != length) {
                            break;
                        }
                        i5++;
                        j = -9187201950435737472L;
                    }
                }
            }
        }
        MutableScatterMap<String, List<Function0<Object>>> mutableScatterMap5 = this.valueProviders;
        if (mutableScatterMap5 != null) {
            MutableScatterMap<String, List<Function0<Object>>> mutableScatterMap6 = mutableScatterMap5;
            Object[] objArr5 = mutableScatterMap6.keys;
            Object[] objArr6 = mutableScatterMap6.values;
            long[] jArr3 = mutableScatterMap6.metadata;
            int length2 = jArr3.length - 2;
            if (length2 >= 0) {
                int i9 = 0;
                while (true) {
                    long j3 = jArr3[i9];
                    if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj = objArr5[i12];
                                List list = (List) objArr6[i12];
                                String str = (String) obj;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(0)).invoke();
                                    if (objInvoke != null) {
                                        if (!canBeSaved(objInvoke)) {
                                            throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(objInvoke).toString());
                                        }
                                        map.put(str, CollectionsKt.arrayListOf(objInvoke));
                                    }
                                    objArr2 = objArr5;
                                    i2 = i4;
                                } else {
                                    HashMap map2 = map;
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object[] objArr7 = objArr5;
                                        Object objInvoke2 = ((Function0) list.get(i13)).invoke();
                                        if (objInvoke2 != null && !canBeSaved(objInvoke2)) {
                                            throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i13++;
                                        objArr5 = objArr7;
                                    }
                                    objArr2 = objArr5;
                                    map2.put(str, arrayList);
                                    i2 = 8;
                                }
                            } else {
                                objArr2 = objArr5;
                                i2 = i4;
                            }
                            j3 >>= i2;
                            i11++;
                            i4 = i2;
                            jArr3 = jArr3;
                            objArr5 = objArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr5;
                        i = i4;
                        if (i10 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        objArr = objArr5;
                        i = i4;
                    }
                    if (i9 == length2) {
                        break;
                    }
                    i9++;
                    i4 = i;
                    jArr3 = jArr;
                    objArr5 = objArr;
                    c = 7;
                }
            }
        }
        return map;
    }
}
