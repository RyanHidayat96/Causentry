package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> TuitionPaymentFragmentbindingInflater1 = new Comparator<Comparable>() { // from class: com.squareup.moshi.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.TuitionPaymentFragmentbindingInflater1 entrySet;
    final a<K, V> header;
    private LinkedHashTreeMap<K, V>.TuitionPaymentFragmentspecialinlinedviewModeldefault3 keySet;
    int modCount;
    int size;
    a<K, V>[] table;
    int threshold;

    public LinkedHashTreeMap() {
        this((byte) 0);
    }

    private LinkedHashTreeMap(byte b2) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = TuitionPaymentFragmentbindingInflater1;
        this.header = new a<>();
        this.table = new a[16];
        int i = 16 / 2;
        int i2 = 16 / 4;
        this.threshold = 12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        a<K, V> aVarB = b(obj);
        if (aVarB != null) {
            return aVarB.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        a<K, V> aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1((Object) k, true);
        V v2 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.g;
        aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        a<K, V> aVar = this.header;
        a<K, V> aVar2 = aVar.TuitionPaymentFragmentbindingInflater1;
        while (aVar2 != aVar) {
            a<K, V> aVar3 = aVar2.TuitionPaymentFragmentbindingInflater1;
            aVar2.d = null;
            aVar2.TuitionPaymentFragmentbindingInflater1 = null;
            aVar2 = aVar3;
        }
        aVar.d = aVar;
        aVar.TuitionPaymentFragmentbindingInflater1 = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1(K k, boolean z) {
        a<K, V> aVar;
        int i;
        a<K, V> aVar2;
        a<K, V> aVar3;
        a<K, V> aVar4;
        int iCompare;
        Comparator<? super K> comparator = this.comparator;
        a<K, V>[] aVarArr = this.table;
        int iHashCode = k.hashCode();
        int i2 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i3 = (i2 >>> 4) ^ (i2 ^ (i2 >>> 7));
        int length = (aVarArr.length - 1) & i3;
        a<K, V> aVar5 = aVarArr[length];
        if (aVar5 != null) {
            Comparable comparable = comparator == TuitionPaymentFragmentbindingInflater1 ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    iCompare = comparable.compareTo(aVar5.b);
                } else {
                    iCompare = comparator.compare(k, aVar5.b);
                }
                if (iCompare == 0) {
                    return aVar5;
                }
                a<K, V> aVar6 = iCompare < 0 ? aVar5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : aVar5.asBinder;
                if (aVar6 == null) {
                    aVar = aVar5;
                    i = iCompare;
                    break;
                }
                aVar5 = aVar6;
            }
        } else {
            aVar = aVar5;
            i = 0;
        }
        if (!z) {
            return null;
        }
        a<K, V> aVar7 = this.header;
        if (aVar == null) {
            if (comparator == TuitionPaymentFragmentbindingInflater1 && !(k instanceof Comparable)) {
                StringBuilder sb = new StringBuilder();
                sb.append(k.getClass().getName());
                sb.append(" is not Comparable");
                throw new ClassCastException(sb.toString());
            }
            aVar2 = new a<>(aVar, k, i3, aVar7, aVar7.d);
            aVarArr[length] = aVar2;
        } else {
            a<K, V> aVar8 = new a<>(aVar, k, i3, aVar7, aVar7.d);
            if (i < 0) {
                aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVar8;
            } else {
                aVar.asBinder = aVar8;
            }
            TuitionPaymentFragmentbindingInflater1(aVar, true);
            aVar2 = aVar8;
        }
        int i4 = this.size;
        this.size = i4 + 1;
        if (i4 > this.threshold) {
            a<K, V>[] aVarArr2 = this.table;
            int length2 = aVarArr2.length;
            int i5 = length2 * 2;
            a<K, V>[] aVarArr3 = new a[i5];
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            b bVar = new b();
            b bVar2 = new b();
            for (int i6 = 0; i6 < length2; i6++) {
                a<K, V> aVar9 = aVarArr2[i6];
                if (aVar9 != null) {
                    a<K, V> aVar10 = null;
                    for (a<K, V> aVar11 = aVar9; aVar11 != null; aVar11 = aVar11.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        aVar11.asInterface = aVar10;
                        aVar10 = aVar11;
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVar10;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        a<K, V> aVarB = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
                        if (aVarB == null) {
                            break;
                        }
                        if ((aVarB.TuitionPaymentFragmentspecialinlinedviewModeldefault2 & length2) == 0) {
                            i7++;
                        } else {
                            i8++;
                        }
                    }
                    bVar.b(i7);
                    bVar2.b(i8);
                    a<K, V> aVar12 = null;
                    while (aVar9 != null) {
                        aVar9.asInterface = aVar12;
                        a<K, V> aVar13 = aVar9;
                        aVar9 = aVar9.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        aVar12 = aVar13;
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVar12;
                    while (true) {
                        a<K, V> aVarB2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
                        if (aVarB2 == null) {
                            break;
                        }
                        if ((aVarB2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 & length2) == 0) {
                            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(aVarB2);
                        } else {
                            bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(aVarB2);
                        }
                    }
                    if (i7 > 0) {
                        aVar3 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (aVar3.asInterface != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        aVar3 = null;
                    }
                    aVarArr3[i6] = aVar3;
                    if (i8 > 0) {
                        aVar4 = bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (aVar4.asInterface != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        aVar4 = null;
                    }
                    aVarArr3[i6 + length2] = aVar4;
                }
            }
            this.table = aVarArr3;
            this.threshold = (i5 / 2) + (i5 / 4);
        }
        this.modCount++;
        return aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final a<K, V> b(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    final a<K, V> TuitionPaymentFragmentbindingInflater1(Map.Entry<?, ?> entry) {
        a<K, V> aVarB = b(entry.getKey());
        if (aVarB == null) {
            return null;
        }
        V v = aVarB.g;
        Object value = entry.getValue();
        if (v == value || (v != null && v.equals(value))) {
            return aVarB;
        }
        return null;
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(a<K, V> aVar, boolean z) {
        a<K, V> aVar2;
        a<K, V> aVar3;
        int i;
        if (z) {
            aVar.d.TuitionPaymentFragmentbindingInflater1 = aVar.TuitionPaymentFragmentbindingInflater1;
            aVar.TuitionPaymentFragmentbindingInflater1.d = aVar.d;
            aVar.d = null;
            aVar.TuitionPaymentFragmentbindingInflater1 = null;
        }
        a<K, V> aVar4 = aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        a<K, V> aVar5 = aVar.asBinder;
        a<K, V> aVar6 = aVar.asInterface;
        int i2 = 0;
        if (aVar4 != null && aVar5 != null) {
            if (aVar4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > aVar5.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                a<K, V> aVar7 = aVar4.asBinder;
                while (true) {
                    a<K, V> aVar8 = aVar7;
                    aVar3 = aVar4;
                    aVar4 = aVar8;
                    if (aVar4 == null) {
                        break;
                    } else {
                        aVar7 = aVar4.asBinder;
                    }
                }
            } else {
                a<K, V> aVar9 = aVar5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                while (true) {
                    aVar2 = aVar5;
                    aVar5 = aVar9;
                    if (aVar5 == null) {
                        break;
                    } else {
                        aVar9 = aVar5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    }
                }
                aVar3 = aVar2;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1((a) aVar3, false);
            a<K, V> aVar10 = aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (aVar10 != null) {
                i = aVar10.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVar10;
                aVar10.asInterface = aVar3;
                aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            } else {
                i = 0;
            }
            a<K, V> aVar11 = aVar.asBinder;
            if (aVar11 != null) {
                i2 = aVar11.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                aVar3.asBinder = aVar11;
                aVar11.asInterface = aVar3;
                aVar.asBinder = null;
            }
            aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.max(i, i2) + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(aVar, aVar3);
            return;
        }
        if (aVar4 != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(aVar, aVar4);
            aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        } else if (aVar5 != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(aVar, aVar5);
            aVar.asBinder = null;
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(aVar, null);
        }
        TuitionPaymentFragmentbindingInflater1(aVar6, false);
        this.size--;
        this.modCount++;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(a<K, V> aVar, a<K, V> aVar2) {
        a<K, V> aVar3 = aVar.asInterface;
        aVar.asInterface = null;
        if (aVar2 != null) {
            aVar2.asInterface = aVar3;
        }
        if (aVar3 != null) {
            if (aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == aVar) {
                aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVar2;
                return;
            } else {
                aVar3.asBinder = aVar2;
                return;
            }
        }
        int i = aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        a<K, V>[] aVarArr = this.table;
        aVarArr[i & (aVarArr.length - 1)] = aVar2;
    }

    private void TuitionPaymentFragmentbindingInflater1(a<K, V> aVar, boolean z) {
        while (aVar != null) {
            a<K, V> aVar2 = aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            a<K, V> aVar3 = aVar.asBinder;
            int i = aVar2 != null ? aVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0;
            int i2 = aVar3 != null ? aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                a<K, V> aVar4 = aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                a<K, V> aVar5 = aVar3.asBinder;
                int i4 = (aVar4 != null ? aVar4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0) - (aVar5 != null ? aVar5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(aVar3);
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(aVar);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                a<K, V> aVar6 = aVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                a<K, V> aVar7 = aVar2.asBinder;
                int i5 = (aVar6 != null ? aVar6.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0) - (aVar7 != null ? aVar7.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(aVar2);
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(aVar);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
                if (z) {
                    return;
                }
            } else {
                aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            aVar = aVar.asInterface;
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        a<K, V> aVar3 = aVar.asBinder;
        a<K, V> aVar4 = aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        a<K, V> aVar5 = aVar3.asBinder;
        aVar.asBinder = aVar4;
        if (aVar4 != null) {
            aVar4.asInterface = aVar;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(aVar, aVar3);
        aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVar;
        aVar.asInterface = aVar3;
        aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.max(aVar2 != null ? aVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0, aVar4 != null ? aVar4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0) + 1;
        aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.max(aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3, aVar5 != null ? aVar5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0) + 1;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        a<K, V> aVar3 = aVar.asBinder;
        a<K, V> aVar4 = aVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        a<K, V> aVar5 = aVar2.asBinder;
        aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVar5;
        if (aVar5 != null) {
            aVar5.asInterface = aVar;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(aVar, aVar2);
        aVar2.asBinder = aVar;
        aVar.asInterface = aVar2;
        aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.max(aVar3 != null ? aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0, aVar5 != null ? aVar5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0) + 1;
        aVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.max(aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3, aVar4 != null ? aVar4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.entrySet;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            return tuitionPaymentFragmentbindingInflater1;
        }
        LinkedHashTreeMap<K, V>.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new TuitionPaymentFragmentbindingInflater1();
        this.entrySet = tuitionPaymentFragmentbindingInflater2;
        return tuitionPaymentFragmentbindingInflater2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        LinkedHashTreeMap<K, V>.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.keySet;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        LinkedHashTreeMap<K, V>.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.keySet = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        return tuitionPaymentFragmentspecialinlinedviewModeldefault4;
    }

    static final class a<K, V> implements Map.Entry<K, V> {
        a<K, V> TuitionPaymentFragmentbindingInflater1;
        a<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        a<K, V> asBinder;
        a<K, V> asInterface;
        final K b;
        a<K, V> d;
        V g;

        a() {
            this.b = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;
            this.d = this;
            this.TuitionPaymentFragmentbindingInflater1 = this;
        }

        a(a<K, V> aVar, K k, int i, a<K, V> aVar2, a<K, V> aVar3) {
            this.asInterface = aVar;
            this.b = k;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            this.TuitionPaymentFragmentbindingInflater1 = aVar2;
            this.d = aVar3;
            aVar3.TuitionPaymentFragmentbindingInflater1 = this;
            aVar2.d = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.b;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.g;
            if (v == null) {
                return entry.getValue() == null;
            }
            return v.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.b;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.g;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append("=");
            sb.append(this.g);
            return sb.toString();
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1<K, V> {
        a<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        public final a<K, V> b() {
            a<K, V> aVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (aVar == null) {
                return null;
            }
            a<K, V> aVar2 = aVar.asInterface;
            aVar.asInterface = null;
            for (a<K, V> aVar3 = aVar.asBinder; aVar3 != null; aVar3 = aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                aVar3.asInterface = aVar2;
                aVar2 = aVar3;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVar2;
            return aVar;
        }
    }

    public static final class b<K, V> {
        public static int b = -328703210;
        private int TuitionPaymentFragmentbindingInflater1;
        a<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        b() {
        }

        final void b(int i) {
            this.TuitionPaymentFragmentbindingInflater1 = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(a<K, V> aVar) {
            aVar.asBinder = null;
            aVar.asInterface = null;
            aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            int i = this.TuitionPaymentFragmentbindingInflater1;
            if (i > 0) {
                int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if ((i2 & 1) == 0) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 + 1;
                    this.TuitionPaymentFragmentbindingInflater1 = i - 1;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                }
            }
            aVar.asInterface = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVar;
            int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = i3 + 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
            int i5 = this.TuitionPaymentFragmentbindingInflater1;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 + 2;
                this.TuitionPaymentFragmentbindingInflater1 = i5 - 1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 & i7) != i7) {
                    return;
                }
                int i8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (i8 == 0) {
                    a<K, V> aVar2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    a<K, V> aVar3 = aVar2.asInterface;
                    a<K, V> aVar4 = aVar3.asInterface;
                    aVar3.asInterface = aVar4.asInterface;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVar3;
                    aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVar4;
                    aVar3.asBinder = aVar2;
                    aVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = aVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                    aVar4.asInterface = aVar3;
                    aVar2.asInterface = aVar3;
                } else if (i8 == 1) {
                    a<K, V> aVar5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    a<K, V> aVar6 = aVar5.asInterface;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVar6;
                    aVar6.asBinder = aVar5;
                    aVar6.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = aVar5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                    aVar5.asInterface = aVar6;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                } else if (i8 == 2) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                }
                i6 *= 2;
            }
        }
    }

    abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements Iterator<T> {
        private a<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private a<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LinkedHashTreeMap.this.header.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LinkedHashTreeMap.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != LinkedHashTreeMap.this.header;
        }

        final a<K, V> b() {
            a<K, V> aVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (aVar == LinkedHashTreeMap.this.header) {
                throw new NoSuchElementException();
            }
            if (LinkedHashTreeMap.this.modCount != this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                throw new ConcurrentModificationException();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = aVar.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVar;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            a<K, V> aVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (aVar == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1((a) aVar, true);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LinkedHashTreeMap.this.modCount;
        }
    }

    final class TuitionPaymentFragmentbindingInflater1 extends AbstractSet<Map.Entry<K, V>> {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedHashTreeMap.this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedHashTreeMap<K, V>.TuitionPaymentFragmentspecialinlinedviewModeldefault2<Map.Entry<K, V>>() { // from class: com.squareup.moshi.LinkedHashTreeMap.TuitionPaymentFragmentbindingInflater1.2
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return b();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.TuitionPaymentFragmentbindingInflater1((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            a<K, V> aVarTuitionPaymentFragmentbindingInflater1;
            if (!(obj instanceof Map.Entry) || (aVarTuitionPaymentFragmentbindingInflater1 = LinkedHashTreeMap.this.TuitionPaymentFragmentbindingInflater1((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1((a) aVarTuitionPaymentFragmentbindingInflater1, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends AbstractSet<K> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedHashTreeMap.this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new LinkedHashTreeMap<K, V>.TuitionPaymentFragmentspecialinlinedviewModeldefault2<K>() { // from class: com.squareup.moshi.LinkedHashTreeMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.4
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return b().b;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            a<K, V> aVarB = linkedHashTreeMap.b(obj);
            if (aVarB != null) {
                linkedHashTreeMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1((a) aVarB, true);
            }
            return aVarB != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        a<K, V> aVarB = b(obj);
        if (aVarB != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1((a) aVarB, true);
        }
        if (aVarB != null) {
            return aVarB.g;
        }
        return null;
    }
}
