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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000b\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0012\u001a\u00020\u00052\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001b\u001a\u00020\u001a2\"\u0010\b\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001e\u001a\u00020\u001a2\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a0\u001dH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010 \u001a\u00020\u001a2\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010\u001fJ,\u0010!\u001a\u00020\u001a2\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060'H\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010\u0013J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\fJ\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\fJA\u00102\u001a\u0002012\b\b\u0002\u0010\b\u001a\u00020-2\b\b\u0002\u0010$\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020-H\u0007¢\u0006\u0004\b2\u00103Jk\u00102\u001a\u0002012\b\b\u0002\u0010\b\u001a\u00020-2\b\b\u0002\u0010$\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020-2$\b\u0004\u00104\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020-0\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u00105J\r\u00106\u001a\u00020\u0007¢\u0006\u0004\b6\u0010\fJ\u000f\u00107\u001a\u000201H\u0017¢\u0006\u0004\b7\u00108R\u001c\u00109\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u0010\u0003R\u001c\u0010<\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b<\u0010:\u0012\u0004\b=\u0010\u0003R\u0011\u0010?\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b>\u0010\u0013R\u001c\u0010A\u001a\u00020@8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u0010\u0003R\u001c\u0010E\u001a\u00020D8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bE\u0010F\u0012\u0004\bG\u0010\u0003R\u0011\u0010I\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\bH\u0010\u0013R\u001c\u0010J\u001a\u00020D8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bJ\u0010F\u0012\u0004\bK\u0010\u0003\u0082\u0001\u0001L\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/IntLongMap;", "", "<init>", "()V", "Lkotlin/Function2;", "", "", "", "p0", "all", "(Lkotlin/jvm/functions/Function2;)Z", "any", "()Z", "contains", "(I)Z", "containsKey", "containsValue", "(J)Z", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "equals", "(Ljava/lang/Object;)Z", "findKeyIndex", "(I)I", "Lkotlin/ParameterName;", "", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "forEachKey", "forEachValue", "get", "(I)J", "p1", "getOrDefault", "(IJ)J", "Lkotlin/Function0;", "getOrElse", "(ILkotlin/jvm/functions/Function0;)J", "hashCode", "isEmpty", "isNotEmpty", "", "p2", "p3", "p4", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "p5", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "none", "toString", "()Ljava/lang/String;", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "", UserMetadata.KEYDATA_FILENAME, "[I", "getKeys$annotations", "", "metadata", "[J", "getMetadata$annotations", "getSize", "size", "values", "getValues$annotations", "Landroidx/collection/MutableIntLongMap;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IntLongMap {
    public int _capacity;
    public int _size;
    public int[] keys;
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

    private IntLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
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

    public final long get(int p0) {
        int iFindKeyIndex = findKeyIndex(p0);
        if (iFindKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key ".concat(String.valueOf(p0)));
        }
        return this.values[iFindKeyIndex];
    }

    public final long getOrDefault(int p0, long p1) {
        int iFindKeyIndex = findKeyIndex(p0);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : p1;
    }

    public final long getOrElse(int p0, Function0<Long> p1) {
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

    public final void forEach(Function2<? super Integer, ? super Long, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
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
                        int i4 = (i << 3) + i3;
                        p0.invoke(Integer.valueOf(iArr[i4]), Long.valueOf(jArr[i4]));
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

    public final void forEachKey(Function1<? super Integer, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
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
                        p0.invoke(Integer.valueOf(iArr[(i << 3) + i3]));
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

    public final boolean contains(int p0) {
        return containsKey(p0);
    }

    public final boolean containsKey(int p0) {
        return findKeyIndex(p0) >= 0;
    }

    public static /* synthetic */ String joinToString$default(IntLongMap intLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return intLongMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4) {
        int[] iArr;
        long[] jArr;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        int[] iArr2 = this.keys;
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
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = iArr2[i6];
                        long j2 = jArr2[i6];
                        if (i2 == p3) {
                            sb.append(p4);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(p0);
                        }
                        sb.append(i7);
                        sb.append('=');
                        sb.append(j2);
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    jArr2 = jArr2;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                jArr = jArr2;
                if (i4 == 8) {
                }
                sb.append(p2);
                break;
            }
            iArr = iArr2;
            jArr = jArr2;
            if (i3 == length) {
                sb.append(p2);
                break;
            }
            i = i3 + 1;
            jArr2 = jArr;
            iArr2 = iArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String joinToString$default(IntLongMap intLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i2, Object obj) {
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
        int[] iArr = intLongMap.keys;
        long[] jArr2 = intLongMap.values;
        long[] jArr3 = intLongMap.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb.append(charSequence8);
            break;
        }
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            long j = jArr3[i4];
            int i6 = i4;
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j & 255) < 128) {
                        int i9 = (i6 << 3) + i8;
                        int i10 = iArr[i9];
                        long j2 = jArr2[i9];
                        if (i5 == i3) {
                            sb.append(charSequence9);
                            break loop0;
                        }
                        if (i5 != 0) {
                            sb.append(charSequence6);
                        }
                        sb.append((CharSequence) function2.invoke(Integer.valueOf(i10), Long.valueOf(j2)));
                        i5++;
                    }
                    j >>= 8;
                    i8++;
                    jArr3 = jArr3;
                    charSequence6 = charSequence6;
                }
                jArr = jArr3;
                charSequence5 = charSequence6;
                if (i7 == 8) {
                }
                sb.append(charSequence8);
                break;
            }
            jArr = jArr3;
            charSequence5 = charSequence6;
            if (i6 == length) {
                sb.append(charSequence8);
                break;
            }
            i4 = i6 + 1;
            jArr3 = jArr;
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
    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4, Function2<? super Integer, ? super Long, ? extends CharSequence> p5) {
        CharSequence charSequence = p0;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append(p2);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
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
                        int i7 = iArr[i6];
                        long j2 = jArr[i6];
                        if (i2 == p3) {
                            sb.append(p4);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(p5.invoke(Integer.valueOf(i7), Long.valueOf(j2)));
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

    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a A[LOOP:0: B:14:0x0027->B:28:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x006d A[SYNTHETIC] */
    public boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (!(p0 instanceof IntLongMap)) {
            return false;
        }
        IntLongMap intLongMap = (IntLongMap) p0;
        if (intLongMap.get_size() != get_size()) {
            return false;
        }
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            long j2 = jArr[i4];
                            int iFindKeyIndex = intLongMap.findKeyIndex(i5);
                            if (iFindKeyIndex < 0 || j2 != intLongMap.values[iFindKeyIndex]) {
                                break loop0;
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
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            sb.append(i8);
                            sb.append("=");
                            sb.append(j2);
                            i4++;
                            if (i4 < this._size) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i9 = i3;
                    if (i5 != 8) {
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

    public final boolean all(Function2<? super Integer, ? super Long, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!p0.invoke(Integer.valueOf(iArr[i4]), Long.valueOf(jArr[i4])).booleanValue()) {
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
    public final boolean any(Function2<? super Integer, ? super Long, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
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
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (p0.invoke(Integer.valueOf(iArr[i4]), Long.valueOf(jArr[i4])).booleanValue()) {
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

    public final int count(Function2<? super Integer, ? super Long, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        if (p0.invoke(Integer.valueOf(iArr[i5]), Long.valueOf(jArr[i5])).booleanValue()) {
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
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        iHashCode += Integer.hashCode(iArr[i4]) ^ Long.hashCode(jArr[i4]);
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

    public final int findKeyIndex(int p0) {
        int iHashCode = Integer.hashCode(p0) * ScatterMapKt.MurmurHashC1;
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
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Function2<? super Integer, ? super Long, ? extends CharSequence> function2) {
        CharSequence charSequence4 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append(charSequence3);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr2[i2];
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
                        int i8 = iArr[i7];
                        long j2 = jArr[i7];
                        if (i3 == i) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append(charSequence4);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i8), Long.valueOf(j2)));
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
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function2<? super Integer, ? super Long, ? extends CharSequence> function2) {
        CharSequence charSequence4 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append(charSequence3);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
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
                        int i7 = iArr[i6];
                        long j2 = jArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence4);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), Long.valueOf(j2)));
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
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, Function2<? super Integer, ? super Long, ? extends CharSequence> function2) {
        CharSequence charSequence3 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) str);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
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
                        int i7 = iArr[i6];
                        long j2 = jArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence3);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), Long.valueOf(j2)));
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
    public final String joinToString(CharSequence charSequence, Function2<? super Integer, ? super Long, ? extends CharSequence> function2) {
        CharSequence charSequence2 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) str);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
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
                        int i7 = iArr[i6];
                        long j2 = jArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence2);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), Long.valueOf(j2)));
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

    public final String joinToString(Function2<? super Integer, ? super Long, ? extends CharSequence> function2) {
        String str;
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) str);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
            int i3 = i;
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = iArr[i6];
                        long j2 = jArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) str);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), Long.valueOf(j2)));
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

    public /* synthetic */ IntLongMap(DefaultConstructorMarker defaultConstructorMarker) {
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
