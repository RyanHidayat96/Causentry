package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\n\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001a\u001a\u00020\u00192\"\u0010\u0007\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0018\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020\u00190\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u00192\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020\u00190\u001cH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00192\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020\u00190\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ,\u0010 \u001a\u00020\u00192\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020\u00190\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050&H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010\u0012J\r\u0010*\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\u000bJ\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u000bJA\u00101\u001a\u0002002\b\b\u0002\u0010\u0007\u001a\u00020,2\b\b\u0002\u0010#\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010/\u001a\u00020,H\u0007¢\u0006\u0004\b1\u00102Jk\u00101\u001a\u0002002\b\b\u0002\u0010\u0007\u001a\u00020,2\b\b\u0002\u0010#\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010/\u001a\u00020,2$\b\u0004\u00103\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0018\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020,0\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00104J\r\u00105\u001a\u00020\u0006¢\u0006\u0004\b5\u0010\u000bJ\u000f\u00106\u001a\u000200H\u0017¢\u0006\u0004\b6\u00107R\u001c\u00108\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u0003R\u001c\u0010;\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b;\u00109\u0012\u0004\b<\u0010\u0003R\u0011\u0010>\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b=\u0010\u0012R\u001c\u0010@\u001a\u00020?8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b@\u0010A\u0012\u0004\bB\u0010\u0003R\u001c\u0010C\u001a\u00020?8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bC\u0010A\u0012\u0004\bD\u0010\u0003R\u0011\u0010F\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bE\u0010\u0012R\u001c\u0010G\u001a\u00020?8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bG\u0010A\u0012\u0004\bH\u0010\u0003\u0082\u0001\u0001I\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/LongLongMap;", "", "<init>", "()V", "Lkotlin/Function2;", "", "", "p0", "all", "(Lkotlin/jvm/functions/Function2;)Z", "any", "()Z", "contains", "(J)Z", "containsKey", "containsValue", "", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "equals", "(Ljava/lang/Object;)Z", "findKeyIndex", "(J)I", "Lkotlin/ParameterName;", "", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "forEachKey", "forEachValue", "get", "(J)J", "p1", "getOrDefault", "(JJ)J", "Lkotlin/Function0;", "getOrElse", "(JLkotlin/jvm/functions/Function0;)J", "hashCode", "isEmpty", "isNotEmpty", "", "p2", "p3", "p4", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "p5", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "none", "toString", "()Ljava/lang/String;", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "", UserMetadata.KEYDATA_FILENAME, "[J", "getKeys$annotations", "metadata", "getMetadata$annotations", "getSize", "size", "values", "getValues$annotations", "Landroidx/collection/MutableLongLongMap;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LongLongMap {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public long[] values;

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    private LongLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
        this.values = LongSetKt.getEmptyLongArray();
    }

    /* JADX INFO: renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final long get(long p0) {
        int iFindKeyIndex = findKeyIndex(p0);
        if (iFindKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key ".concat(String.valueOf(p0)));
        }
        return this.values[iFindKeyIndex];
    }

    public final long getOrDefault(long p0, long p1) {
        int iFindKeyIndex = findKeyIndex(p0);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : p1;
    }

    public final long getOrElse(long p0, Function0<Long> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        int iFindKeyIndex = findKeyIndex(p0);
        if (iFindKeyIndex < 0) {
            return p1.invoke().longValue();
        }
        return this.values[iFindKeyIndex];
    }

    public final void forEachIndexed(Function1<? super Integer, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.metadata;
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
                        p0.invoke(Integer.valueOf((i << 3) + i3));
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

    public final void forEach(Function2<? super Long, ? super Long, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        p0.invoke(Long.valueOf(jArr[i4]), Long.valueOf(jArr2[i4]));
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

    public final void forEachKey(Function1<? super Long, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.keys;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        p0.invoke(Long.valueOf(jArr[(i << 3) + i3]));
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

    public final void forEachValue(Function1<? super Long, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        p0.invoke(Long.valueOf(jArr[(i << 3) + i3]));
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

    public final int count() {
        return get_size();
    }

    public final boolean contains(long p0) {
        return containsKey(p0);
    }

    public final boolean containsKey(long p0) {
        return findKeyIndex(p0) >= 0;
    }

    public static /* synthetic */ String joinToString$default(LongLongMap longLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        CharSequence charSequence5 = charSequence2;
        if ((i2 & 4) != 0) {
        }
        CharSequence charSequence6 = charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
        }
        return longLongMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4) {
        long[] jArr;
        long[] jArr2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        long[] jArr3 = this.keys;
        long[] jArr4 = this.values;
        long[] jArr5 = this.metadata;
        int length = jArr5.length - 2;
        if (length < 0) {
            sb.append(p2);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr5[i];
            int i3 = i;
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        long j2 = jArr3[i6];
                        long j3 = jArr4[i6];
                        if (i2 == p3) {
                            sb.append(p4);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(p0);
                        }
                        sb.append(j2);
                        sb.append('=');
                        sb.append(j3);
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    jArr5 = jArr5;
                    length = length;
                    jArr3 = jArr3;
                }
                jArr = jArr3;
                jArr2 = jArr5;
                int i7 = length;
                if (i4 == 8) {
                    length = i7;
                }
                sb.append(p2);
                break;
            }
            jArr = jArr3;
            jArr2 = jArr5;
            if (i3 == length) {
                sb.append(p2);
                break;
            }
            i = i3 + 1;
            jArr5 = jArr2;
            jArr3 = jArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String joinToString$default(LongLongMap longLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i2, Object obj) {
        long[] jArr;
        CharSequence charSequence5;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence charSequence6 = (i2 & 1) != 0 ? ", " : charSequence;
        CharSequence charSequence7 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence8 = (i2 & 4) != 0 ? "" : charSequence3;
        int i3 = (i2 & 8) != 0 ? -1 : i;
        CharSequence charSequence9 = (i2 & 16) != 0 ? "..." : charSequence4;
        Intrinsics.checkNotNullParameter(charSequence6, "");
        Intrinsics.checkNotNullParameter(charSequence7, "");
        Intrinsics.checkNotNullParameter(charSequence8, "");
        Intrinsics.checkNotNullParameter(charSequence9, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence7);
        long[] jArr2 = longLongMap.keys;
        long[] jArr3 = longLongMap.values;
        long[] jArr4 = longLongMap.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            sb.append(charSequence8);
            break;
        }
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            long j = jArr4[i4];
            int i6 = i4;
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j & 255) < 128) {
                        int i9 = (i6 << 3) + i8;
                        long j2 = jArr2[i9];
                        long j3 = jArr3[i9];
                        if (i5 == i3) {
                            sb.append(charSequence9);
                            break loop0;
                        }
                        if (i5 != 0) {
                            sb.append(charSequence6);
                        }
                        sb.append((CharSequence) function2.invoke(Long.valueOf(j2), Long.valueOf(j3)));
                        i5++;
                    }
                    j >>= 8;
                    i8++;
                    jArr4 = jArr4;
                    charSequence6 = charSequence6;
                }
                jArr = jArr4;
                charSequence5 = charSequence6;
                if (i7 == 8) {
                }
                sb.append(charSequence8);
                break;
            }
            jArr = jArr4;
            charSequence5 = charSequence6;
            if (i6 == length) {
                sb.append(charSequence8);
                break;
            }
            i4 = i6 + 1;
            jArr4 = jArr;
            charSequence6 = charSequence5;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0093 A[PHI: r13
  0x0093: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:6:0x0045, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0097 A[LOOP:0: B:5:0x0032->B:22:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x009e A[SYNTHETIC] */
    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4, Function2<? super Long, ? super Long, ? extends CharSequence> p5) {
        CharSequence charSequence = p0;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb.append(p2);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr3[i];
            int i3 = i;
            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i3 == length) {
                    sb.append(p2);
                    break;
                }
                i = i3 + 1;
                charSequence = p0;
            } else {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        long j2 = jArr[i6];
                        long j3 = jArr2[i6];
                        if (i2 == p3) {
                            sb.append(p4);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(p5.invoke(Long.valueOf(j2), Long.valueOf(j3)));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    charSequence = p0;
                }
                if (i4 == 8) {
                    if (i3 == length) {
                        i = i3 + 1;
                        charSequence = p0;
                    }
                }
                sb.append(p2);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[LOOP:0: B:14:0x0027->B:31:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0073 A[SYNTHETIC] */
    public boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (!(p0 instanceof LongLongMap)) {
            return false;
        }
        LongLongMap longLongMap = (LongLongMap) p0;
        if (longLongMap.get_size() != get_size()) {
            return false;
        }
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            long j2 = jArr[i5];
                            long j3 = jArr2[i5];
                            int iFindKeyIndex = longLongMap.findKeyIndex(j2);
                            if (iFindKeyIndex < 0 || j3 != longLongMap.values[iFindKeyIndex]) {
                                break loop0;
                            }
                            i2 = 8;
                        }
                        j >>= i2;
                    }
                    if (i3 == i2) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        int i;
        int i2;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr3[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j) < 128) {
                            int i8 = (i3 << 3) + i7;
                            long j2 = jArr[i8];
                            long j3 = jArr2[i8];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(j3);
                            i4++;
                            if (i4 < this._size) {
                                sb.append(", ");
                            }
                            i2 = 8;
                        } else {
                            i2 = i5;
                        }
                        j >>= i2;
                        i7++;
                        i5 = i2;
                        i3 = i3;
                    }
                    int i9 = i3;
                    if (i6 != i5) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final boolean all(Function2<? super Long, ? super Long, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!p0.invoke(Long.valueOf(jArr[i4]), Long.valueOf(jArr2[i4])).booleanValue()) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[LOOP:0: B:5:0x0016->B:18:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[SYNTHETIC] */
    public final boolean any(Function2<? super Long, ? super Long, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (p0.invoke(Long.valueOf(jArr[i4]), Long.valueOf(jArr2[i4])).booleanValue()) {
                                return true;
                            }
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
        return false;
    }

    public final int count(Function2<? super Long, ? super Long, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        if (p0.invoke(Long.valueOf(jArr[i5]), Long.valueOf(jArr2[i5])).booleanValue()) {
                            i2++;
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0044 A[LOOP:0: B:5:0x000c->B:18:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[SYNTHETIC] */
    public final boolean containsValue(long p0) {
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && p0 == jArr[(i << 3) + i3]) {
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
        return false;
    }

    public int hashCode() {
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        iHashCode += Long.hashCode(jArr[i4]) ^ Long.hashCode(jArr2[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final int findKeyIndex(long p0) {
        int iHashCode = Long.hashCode(p0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this._capacity;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = (((long) (i & 127)) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (this.keys[iNumberOfTrailingZeros] == p0) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092 A[PHI: r13
  0x0092: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:6:0x0044, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0096 A[LOOP:0: B:5:0x0031->B:22:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x009d A[SYNTHETIC] */
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Function2<? super Long, ? super Long, ? extends CharSequence> function2) {
        CharSequence charSequence4 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb.append(charSequence3);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr3[i2];
            int i4 = i2;
            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i4 == length) {
                    sb.append(charSequence3);
                    break;
                }
                i2 = i4 + 1;
                charSequence4 = charSequence;
            } else {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j & 255) < 128) {
                        int i7 = (i4 << 3) + i6;
                        long j2 = jArr[i7];
                        long j3 = jArr2[i7];
                        if (i3 == i) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append(charSequence4);
                        }
                        sb.append(function2.invoke(Long.valueOf(j2), Long.valueOf(j3)));
                        i3++;
                    }
                    j >>= 8;
                    i6++;
                    charSequence4 = charSequence;
                }
                if (i5 == 8) {
                    if (i4 == length) {
                        i2 = i4 + 1;
                        charSequence4 = charSequence;
                    }
                }
                sb.append(charSequence3);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0091 A[PHI: r13
  0x0091: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:6:0x0044, B:19:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0095 A[LOOP:0: B:5:0x0031->B:22:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[SYNTHETIC] */
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function2<? super Long, ? super Long, ? extends CharSequence> function2) {
        CharSequence charSequence4 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb.append(charSequence3);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr3[i];
            int i3 = i;
            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i3 == length) {
                    sb.append(charSequence3);
                    break;
                }
                i = i3 + 1;
                charSequence4 = charSequence;
            } else {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        long j2 = jArr[i6];
                        long j3 = jArr2[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence4);
                        }
                        sb.append(function2.invoke(Long.valueOf(j2), Long.valueOf(j3)));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    charSequence4 = charSequence;
                }
                if (i4 == 8) {
                    if (i3 == length) {
                        i = i3 + 1;
                        charSequence4 = charSequence;
                    }
                }
                sb.append(charSequence3);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008f A[PHI: r13
  0x008f: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:6:0x0042, B:19:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0093 A[LOOP:0: B:5:0x002f->B:22:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x009a A[SYNTHETIC] */
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, Function2<? super Long, ? super Long, ? extends CharSequence> function2) {
        CharSequence charSequence3 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb.append((CharSequence) str);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr3[i];
            int i3 = i;
            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i3 == length) {
                    sb.append((CharSequence) str);
                    break;
                }
                i = i3 + 1;
                charSequence3 = charSequence;
            } else {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        long j2 = jArr[i6];
                        long j3 = jArr2[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence3);
                        }
                        sb.append(function2.invoke(Long.valueOf(j2), Long.valueOf(j3)));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    charSequence3 = charSequence;
                }
                if (i4 == 8) {
                    if (i3 == length) {
                        i = i3 + 1;
                        charSequence3 = charSequence;
                    }
                }
                sb.append((CharSequence) str);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008d A[PHI: r13
  0x008d: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:6:0x0040, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0091 A[LOOP:0: B:5:0x002d->B:22:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0098 A[SYNTHETIC] */
    public final String joinToString(CharSequence charSequence, Function2<? super Long, ? super Long, ? extends CharSequence> function2) {
        CharSequence charSequence2 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb.append((CharSequence) str);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr3[i];
            int i3 = i;
            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i3 == length) {
                    sb.append((CharSequence) str);
                    break;
                }
                i = i3 + 1;
                charSequence2 = charSequence;
            } else {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        long j2 = jArr[i6];
                        long j3 = jArr2[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence2);
                        }
                        sb.append(function2.invoke(Long.valueOf(j2), Long.valueOf(j3)));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    charSequence2 = charSequence;
                }
                if (i4 == 8) {
                    if (i3 == length) {
                        i = i3 + 1;
                        charSequence2 = charSequence;
                    }
                }
                sb.append((CharSequence) str);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String joinToString(Function2<? super Long, ? super Long, ? extends CharSequence> function2) {
        String str;
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb.append((CharSequence) str);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr3[i];
            int i3 = i;
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        long j2 = jArr[i6];
                        long j3 = jArr2[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) str);
                        }
                        sb.append(function2.invoke(Long.valueOf(j2), Long.valueOf(j3)));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    str = str;
                }
                str = str;
                if (i4 == 8) {
                }
                sb.append((CharSequence) str);
                break;
            }
            str = str;
            if (i3 == length) {
                sb.append((CharSequence) str);
                break;
            }
            i = i3 + 1;
            str = str;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public /* synthetic */ LongLongMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }
}
