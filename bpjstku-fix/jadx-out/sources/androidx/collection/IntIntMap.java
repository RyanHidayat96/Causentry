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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\n\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0010\u001a\u00020\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0019\u001a\u00020\u00182\"\u0010\u0007\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0017\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00180\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001c\u001a\u00020\u00182\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00180\u001bH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001e\u001a\u00020\u00182\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00180\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ,\u0010\u001f\u001a\u00020\u00182\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00180\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b \u0010\u0016J\u001d\u0010\"\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J)\u0010%\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050$H\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0011J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\u000bJ\r\u0010)\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\u000bJA\u0010/\u001a\u00020.2\b\b\u0002\u0010\u0007\u001a\u00020*2\b\b\u0002\u0010!\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020*H\u0007¢\u0006\u0004\b/\u00100Jk\u0010/\u001a\u00020.2\b\b\u0002\u0010\u0007\u001a\u00020*2\b\b\u0002\u0010!\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020*2$\b\u0004\u00101\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0017\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020*0\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b/\u00102J\r\u00103\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u000bJ\u000f\u00104\u001a\u00020.H\u0017¢\u0006\u0004\b4\u00105R\u001c\u00106\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u0010\u0003R\u001c\u00109\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b9\u00107\u0012\u0004\b:\u0010\u0003R\u0011\u0010<\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b;\u0010\u0011R\u001c\u0010>\u001a\u00020=8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010\u0003R\u001c\u0010B\u001a\u00020A8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010\u0003R\u0011\u0010F\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\bE\u0010\u0011R\u001c\u0010G\u001a\u00020=8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bG\u0010?\u0012\u0004\bH\u0010\u0003\u0082\u0001\u0001I\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/IntIntMap;", "", "<init>", "()V", "Lkotlin/Function2;", "", "", "p0", "all", "(Lkotlin/jvm/functions/Function2;)Z", "any", "()Z", "contains", "(I)Z", "containsKey", "containsValue", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "equals", "(Ljava/lang/Object;)Z", "findKeyIndex", "(I)I", "Lkotlin/ParameterName;", "", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "forEachKey", "forEachValue", "get", "p1", "getOrDefault", "(II)I", "Lkotlin/Function0;", "getOrElse", "(ILkotlin/jvm/functions/Function0;)I", "hashCode", "isEmpty", "isNotEmpty", "", "p2", "p3", "p4", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "p5", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "none", "toString", "()Ljava/lang/String;", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "", UserMetadata.KEYDATA_FILENAME, "[I", "getKeys$annotations", "", "metadata", "[J", "getMetadata$annotations", "getSize", "size", "values", "getValues$annotations", "Landroidx/collection/MutableIntIntMap;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IntIntMap {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public int[] values;

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

    private IntIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = IntSetKt.getEmptyIntArray();
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

    public final int get(int p0) {
        int iFindKeyIndex = findKeyIndex(p0);
        if (iFindKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key ".concat(String.valueOf(p0)));
        }
        return this.values[iFindKeyIndex];
    }

    public final int getOrDefault(int p0, int p1) {
        int iFindKeyIndex = findKeyIndex(p0);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : p1;
    }

    public final int getOrElse(int p0, Function0<Integer> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        int iFindKeyIndex = findKeyIndex(p0);
        if (iFindKeyIndex < 0) {
            return p1.invoke().intValue();
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

    public final void forEach(Function2<? super Integer, ? super Integer, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                        int i4 = (i << 3) + i3;
                        p0.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr2[i4]));
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

    public final void forEachValue(Function1<? super Integer, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.values;
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

    public final int count() {
        return get_size();
    }

    public final boolean contains(int p0) {
        return containsKey(p0);
    }

    public final boolean containsKey(int p0) {
        return findKeyIndex(p0) >= 0;
    }

    public static /* synthetic */ String joinToString$default(IntIntMap intIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return intIntMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4) {
        int[] iArr;
        int[] iArr2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        int[] iArr3 = this.keys;
        int[] iArr4 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append(p2);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            int i3 = i;
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = iArr3[i6];
                        int i8 = iArr4[i6];
                        if (i2 == p3) {
                            sb.append(p4);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(p0);
                        }
                        sb.append(i7);
                        sb.append('=');
                        sb.append(i8);
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    iArr4 = iArr4;
                    iArr3 = iArr3;
                }
                iArr = iArr3;
                iArr2 = iArr4;
                if (i4 == 8) {
                }
                sb.append(p2);
                break;
            }
            iArr = iArr3;
            iArr2 = iArr4;
            if (i3 == length) {
                sb.append(p2);
                break;
            }
            i = i3 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String joinToString$default(IntIntMap intIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i2, Object obj) {
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
        int[] iArr = intIntMap.keys;
        int[] iArr2 = intIntMap.values;
        long[] jArr2 = intIntMap.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append(charSequence8);
            break;
        }
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            long j = jArr2[i4];
            int i6 = i4;
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j & 255) < 128) {
                        int i9 = (i6 << 3) + i8;
                        int i10 = iArr[i9];
                        int i11 = iArr2[i9];
                        if (i5 == i3) {
                            sb.append(charSequence9);
                            break loop0;
                        }
                        if (i5 != 0) {
                            sb.append(charSequence6);
                        }
                        sb.append((CharSequence) function2.invoke(Integer.valueOf(i10), Integer.valueOf(i11)));
                        i5++;
                    }
                    j >>= 8;
                    i8++;
                    charSequence6 = charSequence6;
                    jArr2 = jArr2;
                }
                jArr = jArr2;
                charSequence5 = charSequence6;
                if (i7 == 8) {
                }
                sb.append(charSequence8);
                break;
            }
            jArr = jArr2;
            charSequence5 = charSequence6;
            if (i6 == length) {
                sb.append(charSequence8);
                break;
            }
            i4 = i6 + 1;
            charSequence6 = charSequence5;
            jArr2 = jArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0093 A[PHI: r13
  0x0093: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:6:0x0045, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0097 A[LOOP:0: B:5:0x0032->B:22:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x009e A[SYNTHETIC] */
    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4, Function2<? super Integer, ? super Integer, ? extends CharSequence> p5) {
        CharSequence charSequence = p0;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append(p2);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
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
                        int i8 = iArr2[i6];
                        if (i2 == p3) {
                            sb.append(p4);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(p5.invoke(Integer.valueOf(i7), Integer.valueOf(i8)));
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

    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0069 A[LOOP:0: B:14:0x0027->B:28:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x006d A[SYNTHETIC] */
    public boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (!(p0 instanceof IntIntMap)) {
            return false;
        }
        IntIntMap intIntMap = (IntIntMap) p0;
        if (intIntMap.get_size() != get_size()) {
            return false;
        }
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        int i6 = iArr2[i4];
                        int iFindKeyIndex = intIntMap.findKeyIndex(i5);
                        if (iFindKeyIndex < 0 || i6 != intIntMap.values[iFindKeyIndex]) {
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
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0030, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x006c A[LOOP:0: B:9:0x0022->B:21:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006f A[EDGE_INSN: B:25:0x006f->B:22:0x006f BREAK  A[LOOP:0: B:9:0x0022->B:21:0x006c], SYNTHETIC] */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final boolean all(Function2<? super Integer, ? super Integer, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!p0.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr2[i4])).booleanValue()) {
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
    public final boolean any(Function2<? super Integer, ? super Integer, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (p0.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr2[i4])).booleanValue()) {
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

    public final int count(Function2<? super Integer, ? super Integer, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        if (p0.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr2[i5])).booleanValue()) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[LOOP:0: B:5:0x000b->B:18:0x0041, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[SYNTHETIC] */
    public final boolean containsValue(int p0) {
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && p0 == iArr[(i << 3) + i3]) {
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
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        iHashCode += Integer.hashCode(iArr2[i4]) ^ Integer.hashCode(i5);
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
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Function2<? super Integer, ? super Integer, ? extends CharSequence> function2) {
        CharSequence charSequence4 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append(charSequence3);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i2];
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
                        int i9 = iArr2[i7];
                        if (i3 == i) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append(charSequence4);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i8), Integer.valueOf(i9)));
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
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function2<? super Integer, ? super Integer, ? extends CharSequence> function2) {
        CharSequence charSequence4 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append(charSequence3);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
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
                        int i8 = iArr2[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence4);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), Integer.valueOf(i8)));
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
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, Function2<? super Integer, ? super Integer, ? extends CharSequence> function2) {
        CharSequence charSequence3 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) str);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
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
                        int i8 = iArr2[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence3);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), Integer.valueOf(i8)));
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
    public final String joinToString(CharSequence charSequence, Function2<? super Integer, ? super Integer, ? extends CharSequence> function2) {
        CharSequence charSequence2 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) str);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
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
                        int i8 = iArr2[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence2);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), Integer.valueOf(i8)));
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

    public final String joinToString(Function2<? super Integer, ? super Integer, ? extends CharSequence> function2) {
        String str;
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) str);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            int i3 = i;
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = iArr[i6];
                        int i8 = iArr2[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) str);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), Integer.valueOf(i8)));
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

    public /* synthetic */ IntIntMap(DefaultConstructorMarker defaultConstructorMarker) {
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
