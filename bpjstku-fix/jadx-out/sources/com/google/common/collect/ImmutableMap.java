package com.google.common.collect;

import defpackage.CaptureStage;
import defpackage.addAllCameraCaptureCallbacks;
import defpackage.mergeOptionValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    private static final long serialVersionUID = 912559;
    private transient ImmutableCollection<V> TuitionPaymentFragmentbindingInflater1;
    private transient ImmutableSet<K> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    transient ImmutableSet<Map.Entry<K, V>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    abstract ImmutableCollection<V> TuitionPaymentFragmentbindingInflater1();

    abstract ImmutableSet<Map.Entry<K, V>> TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    abstract ImmutableSet<K> b();

    @Override // java.util.Map
    public abstract V get(Object obj);

    public static <K, V> ImmutableMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return (ImmutableMap<K, V>) RegularImmutableMap.b;
    }

    public static <K, V> ImmutableMap<K, V> TuitionPaymentFragmentbindingInflater1(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(k, v);
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(k2, v2);
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(k3, v3);
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(k4, v4);
        return RegularImmutableMap.b(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> ImmutableMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault2(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(k, v);
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(k2, v2);
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(k3, v3);
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(k4, v4);
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(k5, v5);
        return RegularImmutableMap.b(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> TuitionPaymentFragmentbindingInflater1(Map.Entry<? extends K, ? extends V>... entryArr) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(Arrays.asList(entryArr));
    }

    public static <K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault3<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3<>();
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3<K, V> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private Comparator<? super V> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private int b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this(4);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Object[i * 2];
            this.b = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        }

        private void TuitionPaymentFragmentbindingInflater1(int i) {
            int i2 = i * 2;
            Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i2 > objArr.length) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Arrays.copyOf(objArr, ImmutableCollection.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(objArr.length, i2));
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
            }
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3<K, V> TuitionPaymentFragmentbindingInflater1(K k, V v) {
            TuitionPaymentFragmentbindingInflater1(this.b + 1);
            addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(k, v);
            Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i = this.b;
            int i2 = i * 2;
            objArr[i2] = k;
            objArr[i2 + 1] = v;
            this.b = i + 1;
            return this;
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3<K, V> b(Map<? extends K, ? extends V> map) {
            return TuitionPaymentFragmentbindingInflater1(map.entrySet());
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3<K, V> TuitionPaymentFragmentbindingInflater1(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                TuitionPaymentFragmentbindingInflater1(this.b + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                TuitionPaymentFragmentbindingInflater1(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final ImmutableMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                throw tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            int i = this.b;
            Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            RegularImmutableMap regularImmutableMapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = RegularImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, objArr, this);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                return regularImmutableMapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            throw tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        public final ImmutableMap<K, V> b() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
            private final Object TuitionPaymentFragmentbindingInflater1;
            private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, Object obj2, Object obj3) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = obj;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj2;
                this.TuitionPaymentFragmentbindingInflater1 = obj3;
            }

            final IllegalArgumentException TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sb.append("=");
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb.append(" and ");
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sb.append("=");
                sb.append(this.TuitionPaymentFragmentbindingInflater1);
                return new IllegalArgumentException(sb.toString());
            }
        }
    }

    public static <K, V> ImmutableMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Map<? extends K, ? extends V> map) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(map.entrySet());
    }

    private static <K, V> ImmutableMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(iterable);
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    ImmutableMap() {
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public final ImmutableSet<K> asInterface() {
        ImmutableSet<K> immutableSet = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetB = b();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = immutableSetB;
        return immutableSetB;
    }

    static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            ImmutableSet<Map.Entry<K, V>> immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3 = immutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3 = immutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                immutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            mergeOptionValue<Map.Entry<K, V>> it = immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object readResolve() {
            Object obj = this.keys;
            if (obj instanceof ImmutableSet) {
                ImmutableSet immutableSet = (ImmutableSet) obj;
                ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(immutableSet.size());
                mergeOptionValue<E> it = immutableSet.iterator();
                mergeOptionValue it2 = immutableCollection.iterator();
                while (it.hasNext()) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(it.next(), it2.next());
                }
                return tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.values;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1(objArr[i], objArr2[i]);
            }
            return tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    Object writeReplace() {
        return new SerializedForm(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        ImmutableCollection<V> immutableCollectionTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentbindingInflater1;
        if (immutableCollectionTuitionPaymentFragmentbindingInflater1 == null) {
            immutableCollectionTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
            this.TuitionPaymentFragmentbindingInflater1 = immutableCollectionTuitionPaymentFragmentbindingInflater1;
        }
        return immutableCollectionTuitionPaymentFragmentbindingInflater1.contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // java.util.Map
    public int hashCode() {
        ImmutableSet<Map.Entry<K, V>> immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        return CaptureStage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        ImmutableSet<K> immutableSet = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetB = b();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = immutableSetB;
        return immutableSetB;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        ImmutableCollection<V> immutableCollection = this.TuitionPaymentFragmentbindingInflater1;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentbindingInflater1 = immutableCollectionTuitionPaymentFragmentbindingInflater1;
        return immutableCollectionTuitionPaymentFragmentbindingInflater1;
    }

    public String toString() {
        int size = size();
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
