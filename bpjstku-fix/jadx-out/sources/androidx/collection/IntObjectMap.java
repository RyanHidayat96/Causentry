package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000b\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0012\u001a\u00020\u00062\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001a\u001a\u00020\u00192\"\u0010\b\u001a\u001e\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020\u00190\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u00192\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020\u00190\u001cH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00192\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020\u00190\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ,\u0010 \u001a\u00020\u00192\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020\u00190\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ\u001a\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0013J\r\u0010*\u001a\u00020\u0007¢\u0006\u0004\b*\u0010\fJ\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\fJA\u00101\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020,2\b\b\u0002\u0010#\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020,H\u0007¢\u0006\u0004\b1\u00102Jk\u00101\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020,2\b\b\u0002\u0010#\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020,2$\b\u0004\u00103\u001a\u001e\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020,0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00104J\r\u00105\u001a\u00020\u0007¢\u0006\u0004\b5\u0010\fJ\u000f\u00106\u001a\u000200H\u0017¢\u0006\u0004\b6\u00107R\u001c\u00108\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u0004R\u001c\u0010;\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b;\u00109\u0012\u0004\b<\u0010\u0004R\u0011\u0010>\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b=\u0010\u0013R\u001c\u0010@\u001a\u00020?8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b@\u0010A\u0012\u0004\bB\u0010\u0004R\u001c\u0010D\u001a\u00020C8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bD\u0010E\u0012\u0004\bF\u0010\u0004R\u0011\u0010H\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bG\u0010\u0013R$\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020I8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010\u0004\u0082\u0001\u0001M\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/IntObjectMap;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "<init>", "()V", "Lkotlin/Function2;", "", "", "p0", "all", "(Lkotlin/jvm/functions/Function2;)Z", "any", "()Z", "contains", "(I)Z", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "equals", "findKeyIndex$collection", "(I)I", "Lkotlin/ParameterName;", "", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "forEachKey", "forEachValue", "get", "(I)Ljava/lang/Object;", "p1", "getOrDefault", "(ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hashCode", "isEmpty", "isNotEmpty", "", "p2", "p3", "p4", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "p5", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "none", "toString", "()Ljava/lang/String;", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "", UserMetadata.KEYDATA_FILENAME, "[I", "getKeys$annotations", "", "metadata", "[J", "getMetadata$annotations", "getSize", "size", "", "values", "[Ljava/lang/Object;", "getValues$annotations", "Landroidx/collection/MutableIntObjectMap;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IntObjectMap<V> {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public Object[] values;

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

    private IntObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
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

    public final V getOrElse(int p0, Function0<? extends V> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        V v = get(p0);
        return v == null ? p1.invoke() : v;
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

    public final void forEach(Function2<? super Integer, ? super V, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                        p0.invoke(Integer.valueOf(iArr[i4]), objArr[i4]);
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

    public final void forEachValue(Function1<? super V, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.values;
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
                        p0.invoke(objArr[(i << 3) + i3]);
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

    public static /* synthetic */ String joinToString$default(IntObjectMap intObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return intObjectMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4) {
        int[] iArr;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        int[] iArr2 = this.keys;
        Object[] objArr2 = this.values;
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
                        int i7 = iArr2[i6];
                        Object obj = objArr2[i6];
                        if (i2 == p3) {
                            sb.append(p4);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(p0);
                        }
                        sb.append(i7);
                        sb.append('=');
                        sb.append(obj);
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    objArr2 = objArr2;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                objArr = objArr2;
                if (i4 == 8) {
                }
                sb.append(p2);
                break;
            }
            iArr = iArr2;
            objArr = objArr2;
            if (i3 == length) {
                sb.append(p2);
                break;
            }
            i = i3 + 1;
            objArr2 = objArr;
            iArr2 = iArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String joinToString$default(IntObjectMap intObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i2, Object obj) {
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
        int[] iArr = intObjectMap.keys;
        Object[] objArr = intObjectMap.values;
        long[] jArr2 = intObjectMap.metadata;
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
                        Object obj2 = objArr[i9];
                        if (i5 == i3) {
                            sb.append(charSequence9);
                            break loop0;
                        }
                        if (i5 != 0) {
                            sb.append(charSequence6);
                        }
                        sb.append((CharSequence) function2.invoke(Integer.valueOf(i10), obj2));
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

    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4, Function2<? super Integer, ? super V, ? extends CharSequence> p5) {
        int[] iArr;
        CharSequence charSequence = p0;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        int[] iArr2 = this.keys;
        Object[] objArr = this.values;
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
                        int i7 = iArr2[i6];
                        Object obj = objArr[i6];
                        if (i2 == p3) {
                            sb.append(p4);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(p5.invoke(Integer.valueOf(i7), obj));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    charSequence = p0;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                if (i4 == 8) {
                }
                sb.append(p2);
                break;
            }
            iArr = iArr2;
            if (i3 == length) {
                sb.append(p2);
                break;
            }
            i = i3 + 1;
            charSequence = p0;
            iArr2 = iArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    public boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (!(p0 instanceof IntObjectMap)) {
            return false;
        }
        IntObjectMap intObjectMap = (IntObjectMap) p0;
        if (intObjectMap.get_size() != get_size()) {
            return false;
        }
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
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
                            int i5 = iArr[i4];
                            Object obj = objArr[i4];
                            if (obj == null) {
                                if (intObjectMap.get(i5) != null || !intObjectMap.containsKey(i5)) {
                                    return false;
                                }
                            } else if (!Intrinsics.areEqual(obj, intObjectMap.get(i5))) {
                                return false;
                            }
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
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_INVERT, PHI: r8
  0x006e: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0030, B:22:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[LOOP:0: B:9:0x0022->B:24:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[EDGE_INSN: B:28:0x0073->B:25:0x0073 BREAK  A[LOOP:0: B:9:0x0022->B:24:0x0070], SYNTHETIC] */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            Object obj = objArr[i5];
                            sb.append(i6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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

    public final V get(int p0) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(p0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this._capacity;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = (((long) (i & 127)) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (this.keys[iNumberOfTrailingZeros] == p0) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return (V) this.values[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final V getOrDefault(int p0, V p1) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(p0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this._capacity;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = (((long) (i & 127)) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (this.keys[iNumberOfTrailingZeros] == p0) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        return iNumberOfTrailingZeros >= 0 ? (V) this.values[iNumberOfTrailingZeros] : p1;
    }

    public final boolean all(Function2<? super Integer, ? super V, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                        if (!p0.invoke(Integer.valueOf(iArr[i4]), objArr[i4]).booleanValue()) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[LOOP:0: B:5:0x0016->B:18:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[SYNTHETIC] */
    public final boolean any(Function2<? super Integer, ? super V, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            if (p0.invoke(Integer.valueOf(iArr[i4]), objArr[i4]).booleanValue()) {
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

    public final int count(Function2<? super Integer, ? super V, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                        if (p0.invoke(Integer.valueOf(iArr[i5]), objArr[i5]).booleanValue()) {
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

    public final boolean containsKey(int p0) {
        int iHashCode = Integer.hashCode(p0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this._capacity;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = (((long) (i & 127)) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (this.keys[iNumberOfTrailingZeros] == p0) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return true;
                    }
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean containsValue(V p0) {
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && Intrinsics.areEqual(p0, objArr[(i << 3) + i3])) {
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
        Object[] objArr = this.values;
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
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i5);
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

    public final int findKeyIndex$collection(int p0) {
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Function2<? super Integer, ? super V, ? extends CharSequence> function2) {
        int[] iArr;
        CharSequence charSequence4 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr2 = this.keys;
        Object[] objArr = this.values;
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
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j & 255) < 128) {
                        int i7 = (i4 << 3) + i6;
                        int i8 = iArr2[i7];
                        Object obj = objArr[i7];
                        if (i3 == i) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append(charSequence4);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i8), obj));
                        i3++;
                    }
                    j >>= 8;
                    i6++;
                    charSequence4 = charSequence;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                if (i5 == 8) {
                }
                sb.append(charSequence3);
                break;
            }
            iArr = iArr2;
            if (i4 == length) {
                sb.append(charSequence3);
                break;
            }
            i2 = i4 + 1;
            charSequence4 = charSequence;
            iArr2 = iArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function2<? super Integer, ? super V, ? extends CharSequence> function2) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr2 = this.keys;
        Object[] objArr = this.values;
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
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = iArr2[i6];
                        Object obj = objArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), obj));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                if (i4 == 8) {
                }
                sb.append(charSequence3);
                break;
            }
            iArr = iArr2;
            if (i3 == length) {
                sb.append(charSequence3);
                break;
            }
            i = i3 + 1;
            iArr2 = iArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, Function2<? super Integer, ? super V, ? extends CharSequence> function2) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr2 = this.keys;
        Object[] objArr = this.values;
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
                        int i7 = iArr2[i6];
                        Object obj = objArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), obj));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                if (i4 == 8) {
                }
                sb.append((CharSequence) str);
                break;
            }
            iArr = iArr2;
            if (i3 == length) {
                sb.append((CharSequence) str);
                break;
            }
            i = i3 + 1;
            iArr2 = iArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String joinToString(CharSequence charSequence, Function2<? super Integer, ? super V, ? extends CharSequence> function2) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr2 = this.keys;
        Object[] objArr = this.values;
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
                        int i7 = iArr2[i6];
                        Object obj = objArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), obj));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                if (i4 == 8) {
                }
                sb.append((CharSequence) str);
                break;
            }
            iArr = iArr2;
            if (i3 == length) {
                sb.append((CharSequence) str);
                break;
            }
            i = i3 + 1;
            iArr2 = iArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String joinToString(Function2<? super Integer, ? super V, ? extends CharSequence> function2) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr2 = this.keys;
        Object[] objArr = this.values;
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
                        int i7 = iArr2[i6];
                        Object obj = objArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) str);
                        }
                        sb.append(function2.invoke(Integer.valueOf(i7), obj));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                if (i4 == 8) {
                }
                sb.append((CharSequence) str);
                break;
            }
            iArr = iArr2;
            if (i3 == length) {
                sb.append((CharSequence) str);
                break;
            }
            i = i3 + 1;
            iArr2 = iArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public /* synthetic */ IntObjectMap(DefaultConstructorMarker defaultConstructorMarker) {
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
