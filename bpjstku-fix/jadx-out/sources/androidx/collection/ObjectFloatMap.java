package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000b\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0013\u001a\u00020\u00122\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001b\u001a\u00020\u001a2\"\u0010\b\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001e\u001a\u00020\u001a2\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a0\u001dH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010 \u001a\u00020\u001a2\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010\u001fJ,\u0010!\u001a\u00020\u001a2\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060'H\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0014J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\fJ\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\fJA\u00102\u001a\u0002012\b\b\u0002\u0010\b\u001a\u00020-2\b\b\u0002\u0010$\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020-H\u0007¢\u0006\u0004\b2\u00103Jk\u00102\u001a\u0002012\b\b\u0002\u0010\b\u001a\u00020-2\b\b\u0002\u0010$\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020-2$\b\u0004\u00104\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020-0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u00105J\r\u00106\u001a\u00020\u0007¢\u0006\u0004\b6\u0010\fJ\u000f\u00107\u001a\u000201H\u0017¢\u0006\u0004\b7\u00108R\u001c\u00109\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u0010\u0004R\u001c\u0010<\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b<\u0010:\u0012\u0004\b=\u0010\u0004R\u0011\u0010?\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b>\u0010\u0014R$\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020@8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u0010\u0004R\u001c\u0010E\u001a\u00020D8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bE\u0010F\u0012\u0004\bG\u0010\u0004R\u0011\u0010I\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bH\u0010\u0014R\u001c\u0010K\u001a\u00020J8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bK\u0010L\u0012\u0004\bM\u0010\u0004\u0082\u0001\u0001N\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/ObjectFloatMap;", "K", "", "<init>", "()V", "Lkotlin/Function2;", "", "", "p0", "all", "(Lkotlin/jvm/functions/Function2;)Z", "any", "()Z", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "(F)Z", "", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "equals", "findKeyIndex", "(Ljava/lang/Object;)I", "Lkotlin/ParameterName;", "", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)F", "p1", "getOrDefault", "(Ljava/lang/Object;F)F", "Lkotlin/Function0;", "getOrElse", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)F", "hashCode", "isEmpty", "isNotEmpty", "", "p2", "p3", "p4", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "p5", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "none", "toString", "()Ljava/lang/String;", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "", UserMetadata.KEYDATA_FILENAME, "[Ljava/lang/Object;", "getKeys$annotations", "", "metadata", "[J", "getMetadata$annotations", "getSize", "size", "", "values", "[F", "getValues$annotations", "Landroidx/collection/MutableObjectFloatMap;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ObjectFloatMap<K> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public float[] values;

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

    private ObjectFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = FloatSetKt.getEmptyFloatArray();
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

    public final float get(K p0) {
        int iFindKeyIndex = findKeyIndex(p0);
        if (iFindKeyIndex < 0) {
            StringBuilder sb = new StringBuilder("There is no key ");
            sb.append(p0);
            sb.append(" in the map");
            RuntimeHelpersKt.throwNoSuchElementException(sb.toString());
        }
        return this.values[iFindKeyIndex];
    }

    public final float getOrDefault(K p0, float p1) {
        int iFindKeyIndex = findKeyIndex(p0);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : p1;
    }

    public final float getOrElse(K p0, Function0<Float> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        int iFindKeyIndex = findKeyIndex(p0);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        return p1.invoke().floatValue();
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

    public final void forEach(Function2<? super K, ? super Float, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                        p0.invoke(objArr[i4], Float.valueOf(fArr[i4]));
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

    public final void forEachKey(Function1<? super K, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.keys;
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

    public final void forEachValue(Function1<? super Float, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        float[] fArr = this.values;
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
                        p0.invoke(Float.valueOf(fArr[(i << 3) + i3]));
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

    public final boolean contains(K p0) {
        return containsKey(p0);
    }

    public final boolean containsKey(K p0) {
        return findKeyIndex(p0) >= 0;
    }

    public static /* synthetic */ String joinToString$default(ObjectFloatMap objectFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return objectFloatMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4) {
        Object[] objArr;
        float[] fArr;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        Object[] objArr2 = this.keys;
        float[] fArr2 = this.values;
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
                        Object obj = objArr2[i6];
                        float f = fArr2[i6];
                        if (i2 == p3) {
                            sb.append(p4);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(p0);
                        }
                        sb.append(obj);
                        sb.append('=');
                        sb.append(f);
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    fArr2 = fArr2;
                    objArr2 = objArr2;
                }
                objArr = objArr2;
                fArr = fArr2;
                if (i4 == 8) {
                }
                sb.append(p2);
                break;
            }
            objArr = objArr2;
            fArr = fArr2;
            if (i3 == length) {
                sb.append(p2);
                break;
            }
            i = i3 + 1;
            fArr2 = fArr;
            objArr2 = objArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String joinToString$default(ObjectFloatMap objectFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i2, Object obj) {
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
        Object[] objArr = objectFloatMap.keys;
        float[] fArr = objectFloatMap.values;
        long[] jArr2 = objectFloatMap.metadata;
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
                        Object obj2 = objArr[i9];
                        float f = fArr[i9];
                        if (i5 == i3) {
                            sb.append(charSequence9);
                            break loop0;
                        }
                        if (i5 != 0) {
                            sb.append(charSequence6);
                        }
                        sb.append((CharSequence) function2.invoke(obj2, Float.valueOf(f)));
                        i5++;
                    }
                    j >>= 8;
                    i8++;
                    jArr2 = jArr2;
                    charSequence6 = charSequence6;
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
            jArr2 = jArr;
            charSequence6 = charSequence5;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4, Function2<? super K, ? super Float, ? extends CharSequence> p5) {
        Object[] objArr;
        CharSequence charSequence = p0;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        Object[] objArr2 = this.keys;
        float[] fArr = this.values;
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
                        Object obj = objArr2[i6];
                        float f = fArr[i6];
                        if (i2 == p3) {
                            sb.append(p4);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(p5.invoke(obj, Float.valueOf(f)));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    charSequence = p0;
                    objArr2 = objArr2;
                }
                objArr = objArr2;
                if (i4 == 8) {
                }
                sb.append(p2);
                break;
            }
            objArr = objArr2;
            if (i3 == length) {
                sb.append(p2);
                break;
            }
            i = i3 + 1;
            charSequence = p0;
            objArr2 = objArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[LOOP:0: B:14:0x0027->B:28:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (!(p0 instanceof ObjectFloatMap)) {
            return false;
        }
        ObjectFloatMap objectFloatMap = (ObjectFloatMap) p0;
        if (objectFloatMap.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                        Object obj = objArr[i4];
                        float f = fArr[i4];
                        int iFindKeyIndex = objectFloatMap.findKeyIndex(obj);
                        if (iFindKeyIndex < 0 || f != objectFloatMap.values[iFindKeyIndex]) {
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

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_INVERT, PHI: r8
  0x006e: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0030, B:22:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[LOOP:0: B:9:0x0022->B:24:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[EDGE_INSN: B:28:0x0073->B:25:0x0073 BREAK  A[LOOP:0: B:9:0x0022->B:24:0x0070], SYNTHETIC] */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                            Object obj = objArr[i5];
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
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

    public final boolean all(Function2<? super K, ? super Float, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                        if (!p0.invoke(objArr[i4], Float.valueOf(fArr[i4])).booleanValue()) {
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
    public final boolean any(Function2<? super K, ? super Float, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                            if (p0.invoke(objArr[i4], Float.valueOf(fArr[i4])).booleanValue()) {
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

    public final int count(Function2<? super K, ? super Float, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                        if (p0.invoke(objArr[i5], Float.valueOf(fArr[i5])).booleanValue()) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[LOOP:0: B:5:0x000b->B:18:0x0043, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[SYNTHETIC] */
    public final boolean containsValue(float p0) {
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && p0 == fArr[(i << 3) + i3]) {
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
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                        Object obj = objArr[i4];
                        iHashCode += Float.hashCode(fArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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

    public final int findKeyIndex(K p0) {
        int i = 0;
        int iHashCode = (p0 != null ? p0.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = this._capacity;
        int i4 = i2 >>> 7;
        while (true) {
            int i5 = i4 & i3;
            long[] jArr = this.metadata;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], p0)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i4 = i5 + i;
        }
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Function2<? super K, ? super Float, ? extends CharSequence> function2) {
        Object[] objArr;
        CharSequence charSequence4 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr2 = this.keys;
        float[] fArr = this.values;
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
                        Object obj = objArr2[i7];
                        float f = fArr[i7];
                        if (i3 == i) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append(charSequence4);
                        }
                        sb.append(function2.invoke(obj, Float.valueOf(f)));
                        i3++;
                    }
                    j >>= 8;
                    i6++;
                    charSequence4 = charSequence;
                    objArr2 = objArr2;
                }
                objArr = objArr2;
                if (i5 == 8) {
                }
                sb.append(charSequence3);
                break;
            }
            objArr = objArr2;
            if (i4 == length) {
                sb.append(charSequence3);
                break;
            }
            i2 = i4 + 1;
            charSequence4 = charSequence;
            objArr2 = objArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function2<? super K, ? super Float, ? extends CharSequence> function2) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr2 = this.keys;
        float[] fArr = this.values;
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
                        Object obj = objArr2[i6];
                        float f = fArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(function2.invoke(obj, Float.valueOf(f)));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    objArr2 = objArr2;
                }
                objArr = objArr2;
                if (i4 == 8) {
                }
                sb.append(charSequence3);
                break;
            }
            objArr = objArr2;
            if (i3 == length) {
                sb.append(charSequence3);
                break;
            }
            i = i3 + 1;
            objArr2 = objArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, Function2<? super K, ? super Float, ? extends CharSequence> function2) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr2 = this.keys;
        float[] fArr = this.values;
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
                        Object obj = objArr2[i6];
                        float f = fArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(function2.invoke(obj, Float.valueOf(f)));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    objArr2 = objArr2;
                }
                objArr = objArr2;
                if (i4 == 8) {
                }
                sb.append((CharSequence) str);
                break;
            }
            objArr = objArr2;
            if (i3 == length) {
                sb.append((CharSequence) str);
                break;
            }
            i = i3 + 1;
            objArr2 = objArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String joinToString(CharSequence charSequence, Function2<? super K, ? super Float, ? extends CharSequence> function2) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Object[] objArr2 = this.keys;
        float[] fArr = this.values;
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
                        Object obj = objArr2[i6];
                        float f = fArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(function2.invoke(obj, Float.valueOf(f)));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    objArr2 = objArr2;
                }
                objArr = objArr2;
                if (i4 == 8) {
                }
                sb.append((CharSequence) str);
                break;
            }
            objArr = objArr2;
            if (i3 == length) {
                sb.append((CharSequence) str);
                break;
            }
            i = i3 + 1;
            objArr2 = objArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String joinToString(Function2<? super K, ? super Float, ? extends CharSequence> function2) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(function2, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Object[] objArr2 = this.keys;
        float[] fArr = this.values;
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
                        Object obj = objArr2[i6];
                        float f = fArr[i6];
                        if (i2 == -1) {
                            sb.append((CharSequence) str);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) str);
                        }
                        sb.append(function2.invoke(obj, Float.valueOf(f)));
                        i2++;
                    }
                    j >>= 8;
                    i5++;
                    objArr2 = objArr2;
                }
                objArr = objArr2;
                if (i4 == 8) {
                }
                sb.append((CharSequence) str);
                break;
            }
            objArr = objArr2;
            if (i3 == length) {
                sb.append((CharSequence) str);
                break;
            }
            i = i3 + 1;
            objArr2 = objArr;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public /* synthetic */ ObjectFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
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
