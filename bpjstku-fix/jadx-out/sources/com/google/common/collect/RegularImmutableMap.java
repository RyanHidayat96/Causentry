package com.google.common.collect;

import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.addAllCameraCaptureCallbacks;
import defpackage.mergeOptionValue;
import defpackage.updateAndVerifyState;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: loaded from: classes4.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    static final ImmutableMap<Object, Object> b = new RegularImmutableMap(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    private final transient int TuitionPaymentFragmentbindingInflater1;
    private final transient Object TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private transient Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static <K, V> RegularImmutableMap<K, V> b(int i, Object[] objArr) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, objArr, null);
    }

    static <K, V> RegularImmutableMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, Object[] objArr, ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3<K, V> tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        if (i == 0) {
            return (RegularImmutableMap) b;
        }
        if (i == 1) {
            addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        int length = objArr.length >> 1;
        if (i >= 0 && i <= length) {
            Object objTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(objArr, i, ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i));
            if (objTuitionPaymentFragmentbindingInflater1 instanceof Object[]) {
                Object[] objArr2 = (Object[]) objTuitionPaymentFragmentbindingInflater1;
                ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) objArr2[2];
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    throw tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Object obj = objArr2[0];
                int iIntValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, iIntValue * 2);
                objTuitionPaymentFragmentbindingInflater1 = obj;
                i = iIntValue;
            }
            return new RegularImmutableMap<>(objTuitionPaymentFragmentbindingInflater1, objArr, i);
        }
        throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, length, FirebaseAnalytics.Param.INDEX));
    }

    private static Object TuitionPaymentFragmentbindingInflater1(Object[] objArr, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        if (i == 1) {
            addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
            return null;
        }
        int i5 = i2 - 1;
        long j = 461845907;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            int i6 = 0;
            while (i3 < i) {
                int i7 = i3 * 2;
                int i8 = i6 * 2;
                Object objRequireNonNull = Objects.requireNonNull(objArr[i7]);
                Object objRequireNonNull2 = Objects.requireNonNull(objArr[i7 ^ i4]);
                addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(objRequireNonNull, objRequireNonNull2);
                int i9 = i5;
                int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) objRequireNonNull.hashCode()) * (-862048943)), 15)) * 461845907);
                while (true) {
                    int i10 = iRotateLeft & i9;
                    int i11 = bArr[i10] & UByte.MAX_VALUE;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i8;
                        if (i6 < i3) {
                            objArr[i8] = objRequireNonNull;
                            objArr[i8 ^ 1] = objRequireNonNull2;
                        }
                        i6++;
                        break;
                    }
                    if (objRequireNonNull.equals(objArr[i11])) {
                        int i12 = i11 ^ 1;
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objRequireNonNull, objRequireNonNull2, Objects.requireNonNull(objArr[i12]));
                        objArr[i12] = objRequireNonNull2;
                        break;
                    }
                    iRotateLeft = i10 + 1;
                }
                i3++;
                i5 = i9;
                i4 = 1;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), tuitionPaymentFragmentspecialinlinedviewModeldefault2};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            int i13 = 0;
            while (i3 < i) {
                int i14 = i3 * 2;
                int i15 = i13 * 2;
                Object objRequireNonNull3 = Objects.requireNonNull(objArr[i14]);
                Object objRequireNonNull4 = Objects.requireNonNull(objArr[i14 ^ 1]);
                addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(objRequireNonNull3, objRequireNonNull4);
                int iRotateLeft2 = (int) (((long) Integer.rotateLeft((int) (((long) objRequireNonNull3.hashCode()) * (-862048943)), 15)) * 461845907);
                while (true) {
                    int i16 = iRotateLeft2 & i5;
                    int i17 = sArr[i16] & UShort.MAX_VALUE;
                    if (i17 == 65535) {
                        sArr[i16] = (short) i15;
                        if (i13 < i3) {
                            objArr[i15] = objRequireNonNull3;
                            objArr[i15 ^ 1] = objRequireNonNull4;
                        }
                        i13++;
                        break;
                    }
                    if (objRequireNonNull3.equals(objArr[i17])) {
                        int i18 = i17 ^ 1;
                        ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objRequireNonNull3, objRequireNonNull4, Objects.requireNonNull(objArr[i18]));
                        objArr[i18] = objRequireNonNull4;
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        break;
                    }
                    iRotateLeft2 = i16 + 1;
                }
                i3++;
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), tuitionPaymentFragmentspecialinlinedviewModeldefault3};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = null;
        int i19 = 0;
        while (i3 < i) {
            int i20 = i3 * 2;
            int i21 = i19 * 2;
            Object objRequireNonNull5 = Objects.requireNonNull(objArr[i20]);
            Object objRequireNonNull6 = Objects.requireNonNull(objArr[i20 ^ 1]);
            addAllCameraCaptureCallbacks.TuitionPaymentFragmentbindingInflater1(objRequireNonNull5, objRequireNonNull6);
            int iRotateLeft3 = (int) (((long) Integer.rotateLeft((int) (((long) objRequireNonNull5.hashCode()) * (-862048943)), 15)) * j);
            while (true) {
                int i22 = iRotateLeft3 & i5;
                int i23 = iArr[i22];
                if (i23 == -1) {
                    iArr[i22] = i21;
                    if (i19 < i3) {
                        objArr[i21] = objRequireNonNull5;
                        objArr[i21 ^ 1] = objRequireNonNull6;
                    }
                    i19++;
                    break;
                }
                if (objRequireNonNull5.equals(objArr[i23])) {
                    int i24 = i23 ^ 1;
                    ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = new ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objRequireNonNull5, objRequireNonNull6, Objects.requireNonNull(objArr[i24]));
                    objArr[i24] = objRequireNonNull6;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault5 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    break;
                }
                iRotateLeft3 = i22 + 1;
            }
            i3++;
            j = 461845907;
        }
        return i19 == i ? iArr : new Object[]{iArr, Integer.valueOf(i19), tuitionPaymentFragmentspecialinlinedviewModeldefault5};
    }

    private RegularImmutableMap(Object obj, Object[] objArr, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = obj;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = objArr;
        this.TuitionPaymentFragmentbindingInflater1 = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:44:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0045->B:21:0x005d], EDGE_INSN: B:46:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0076->B:31:0x008f], EDGE_INSN: B:48:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x00a3->B:43:0x00be]] */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(Object obj) {
        Object objRequireNonNull;
        Object obj2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = this.TuitionPaymentFragmentbindingInflater1;
        if (obj == null) {
            objRequireNonNull = null;
        } else if (i == 1) {
            if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                objRequireNonNull = Objects.requireNonNull(objArr[1]);
            } else {
                objRequireNonNull = null;
            }
        } else if (obj2 == null) {
            objRequireNonNull = null;
        } else if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length;
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i2 = iRotateLeft & (length - 1);
                int i3 = bArr[i2] & UByte.MAX_VALUE;
                if (i3 == 255) {
                    break;
                }
                if (obj.equals(objArr[i3])) {
                    objRequireNonNull = objArr[i3 ^ 1];
                } else {
                    iRotateLeft = i2 + 1;
                }
            }
            objRequireNonNull = null;
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length;
            int iRotateLeft2 = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i4 = iRotateLeft2 & (length2 - 1);
                int i5 = sArr[i4] & UShort.MAX_VALUE;
                if (i5 == 65535) {
                    break;
                }
                if (obj.equals(objArr[i5])) {
                    objRequireNonNull = objArr[i5 ^ 1];
                } else {
                    iRotateLeft2 = i4 + 1;
                }
            }
            objRequireNonNull = null;
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length;
            int iRotateLeft3 = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i6 = iRotateLeft3 & (length3 - 1);
                int i7 = iArr[i6];
                if (i7 == -1) {
                    break;
                }
                if (obj.equals(objArr[i7])) {
                    objRequireNonNull = objArr[i7 ^ 1];
                } else {
                    iRotateLeft3 = i6 + 1;
                }
            }
            objRequireNonNull = null;
        }
        if (objRequireNonNull == null) {
            return null;
        }
        return (V) objRequireNonNull;
    }

    @Override // com.google.common.collect.ImmutableMap
    final ImmutableSet<Map.Entry<K, V>> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return new EntrySet(this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1);
    }

    static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient int TuitionPaymentFragmentbindingInflater1 = 0;
        private final transient int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final transient Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final transient ImmutableMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return true;
        }

        EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = immutableMap;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = objArr;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: d */
        public final mergeOptionValue<Map.Entry<K, V>> iterator() {
            return TuitionPaymentFragmentbindingInflater1().iterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i) {
            return TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet
        final ImmutableList<Map.Entry<K, V>> a() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // com.google.common.collect.ImmutableCollection
                public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // java.util.List
                public /* synthetic */ Object get(int i) {
                    int i2 = EntrySet.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (i >= 0 && i < i2) {
                        int i3 = i * 2;
                        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(EntrySet.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[EntrySet.this.TuitionPaymentFragmentbindingInflater1 + i3]), Objects.requireNonNull(EntrySet.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3 + (EntrySet.this.TuitionPaymentFragmentbindingInflater1 ^ 1)]));
                    }
                    throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2, FirebaseAnalytics.Param.INDEX));
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* synthetic */ Iterator iterator() {
            return TuitionPaymentFragmentbindingInflater1().iterator();
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    final ImmutableSet<K> b() {
        return new KeySet(this, new KeysOrValuesAsList(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0, this.TuitionPaymentFragmentbindingInflater1));
    }

    static final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient int TuitionPaymentFragmentbindingInflater1;
        private final transient int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final transient Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return true;
        }

        KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = objArr;
            this.TuitionPaymentFragmentbindingInflater1 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i >= 0 && i < i2) {
                return Objects.requireNonNull(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[(i * 2) + this.TuitionPaymentFragmentbindingInflater1]);
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2, FirebaseAnalytics.Param.INDEX));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        final Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableList<K> TuitionPaymentFragmentbindingInflater1;
        private final transient ImmutableMap<K, ?> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return true;
        }

        KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = immutableMap;
            this.TuitionPaymentFragmentbindingInflater1 = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList<K> TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        final Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableCollection
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i) {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: d */
        public final mergeOptionValue<K> iterator() {
            return this.TuitionPaymentFragmentbindingInflater1.iterator();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final /* synthetic */ Iterator iterator() {
            return this.TuitionPaymentFragmentbindingInflater1.iterator();
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    final ImmutableCollection<V> TuitionPaymentFragmentbindingInflater1() {
        return new KeysOrValuesAsList(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 1, this.TuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.google.common.collect.ImmutableMap
    final Object writeReplace() {
        return super.writeReplace();
    }
}
