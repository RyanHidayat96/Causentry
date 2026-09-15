package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u0003\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0007\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0014\u001a\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0015J7\u0010\u001d\u001a\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001d\u0010\u0016JP\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u0003\u001a\u00028\u00002\"\u0010\f\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b \u0010!J[\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u0003\u001a\u00028\u00002-\u0010\f\u001a)\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00000\"H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b#\u0010$JP\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u0003\u001a\u00028\u00002\"\u0010\f\u001a\u001e\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b%\u0010!J[\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u0003\u001a\u00028\u00002-\u0010\f\u001a)\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00000\"H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b&\u0010$J7\u0010(\u001a\u00020'2\u0017\u0010\u0003\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020'0\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b(\u0010)JB\u0010*\u001a\u00020'2\"\u0010\u0003\u001a\u001e\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020'0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b*\u0010+J7\u0010,\u001a\u00020'2\u0017\u0010\u0003\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020'0\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b,\u0010)JB\u0010-\u001a\u00020'2\"\u0010\u0003\u001a\u001e\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020'0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b-\u0010+J\u0018\u0010.\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b.\u0010\u0018J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u0010\u0015J\u0015\u00100\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b0\u0010\u0018J7\u00101\u001a\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b1\u0010\u0016J7\u00102\u001a\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b2\u0010\u0016J\u0010\u00103\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b3\u0010\bJ\u0010\u00104\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b4\u0010\bJA\u00109\u001a\u0002082\b\b\u0002\u0010\u0003\u001a\u0002052\b\b\u0002\u0010\f\u001a\u0002052\b\b\u0002\u0010\r\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00022\b\b\u0002\u00107\u001a\u000205H\u0007¢\u0006\u0004\b9\u0010:J[\u00109\u001a\u0002082\b\b\u0002\u0010\u0003\u001a\u0002052\b\b\u0002\u0010\f\u001a\u0002052\b\b\u0002\u0010\r\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00022\b\b\u0002\u00107\u001a\u0002052\u0014\b\u0004\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002050\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010<J\r\u0010=\u001a\u00020\u0002¢\u0006\u0004\b=\u0010\u0015J7\u0010=\u001a\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b=\u0010\u0016J\u0015\u0010>\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b>\u0010\u0018J\u0010\u0010?\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b?\u0010\bJ7\u0010@\u001a\u00020\u00062\u0017\u0010\u0003\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b@\u0010\u000bJ\u000f\u0010A\u001a\u000208H\u0017¢\u0006\u0004\bA\u0010BR\u001c\u0010C\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bC\u0010D\u0012\u0004\bE\u0010FR\u001c\u0010H\u001a\u00020G8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bH\u0010I\u0012\u0004\bJ\u0010FR\u0012\u0010N\u001a\u00020K8Ç\u0002¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0012\u0010P\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\bO\u0010\u0015R\u0012\u0010R\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\bQ\u0010\u0015\u0082\u0001\u0001S\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/IntList;", "", "", "p0", "<init>", "(I)V", "", "any", "()Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "(Lkotlin/jvm/functions/Function1;)Z", "p1", "p2", "binarySearch", "(III)I", "contains", "(I)Z", "containsAll", "(Landroidx/collection/IntList;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function1;)I", "elementAt", "(I)I", "elementAtOrElse", "(ILkotlin/jvm/functions/Function1;)I", "equals", "(Ljava/lang/Object;)Z", "first", "R", "Lkotlin/Function2;", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "", "p3", "p4", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "p5", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "last", "lastIndexOf", "none", "reversedAny", "toString", "()Ljava/lang/String;", "_size", "I", "get_size$annotations", "()V", "", FirebaseAnalytics.Param.CONTENT, "[I", "getContent$annotations", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "getLastIndex", "lastIndex", "getSize", "size", "Landroidx/collection/MutableIntList;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IntList {
    public int _size;
    public int[] content;

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    private IntList(int i) {
        int[] emptyIntArray;
        if (i == 0) {
            emptyIntArray = IntSetKt.getEmptyIntArray();
        } else {
            emptyIntArray = new int[i];
        }
        this.content = emptyIntArray;
    }

    public final int getSize() {
        return this._size;
    }

    public final int getLastIndex() {
        return this._size - 1;
    }

    public final IntRange getIndices() {
        return RangesKt.until(0, this._size);
    }

    /* JADX INFO: renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final void forEach(Function1<? super Integer, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            p0.invoke(Integer.valueOf(iArr[i2]));
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super Integer, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            p0.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]));
        }
    }

    public final void forEachReversed(Function1<? super Integer, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            p0.invoke(Integer.valueOf(iArr[i]));
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super Integer, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            p0.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i]));
        }
    }

    public final int get(int p0) {
        if (p0 < 0 || p0 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[p0];
    }

    public final int elementAt(int p0) {
        if (p0 < 0 || p0 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[p0];
    }

    public final int elementAtOrElse(int p0, Function1<? super Integer, Integer> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 >= this._size) {
            return p1.invoke(Integer.valueOf(p0)).intValue();
        }
        return this.content[p0];
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final int binarySearch(int p0, int p1, int p2) {
        if (p1 < 0 || p1 >= p2 || p2 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i = p2 - 1;
        while (p1 <= i) {
            int i2 = (p1 + i) >>> 1;
            int i3 = this.content[i2];
            if (i3 < p0) {
                p1 = i2 + 1;
            } else {
                if (i3 <= p0) {
                    return i2;
                }
                i = i2 - 1;
            }
        }
        return -(p1 + 1);
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return intList.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == p3) {
                sb.append(p4);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (i2 != 0) {
                sb.append(p0);
            }
            sb.append(i3);
        }
        sb.append(p2);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            if ((i2 & 16) != 0) {
            }
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(charSequence4, "");
            Intrinsics.checkNotNullParameter(function1, "");
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence2);
            int[] iArr = intList.content;
            int i3 = intList._size;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = iArr[i4];
                if (i4 == i) {
                    sb.append(charSequence4);
                    String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return string;
                }
                if (i4 != 0) {
                    sb.append(charSequence);
                }
                sb.append((CharSequence) function1.invoke(Integer.valueOf(i5)));
            }
            sb.append(charSequence3);
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4, Function1<? super Integer, ? extends CharSequence> p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == p3) {
                sb.append(p4);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (i2 != 0) {
                sb.append(p0);
            }
            sb.append(p5.invoke(Integer.valueOf(i3)));
        }
        sb.append(p2);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public boolean equals(Object p0) {
        if (p0 instanceof IntList) {
            IntList intList = (IntList) p0;
            int i = intList._size;
            int i2 = this._size;
            if (i == i2) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                IntRange intRangeUntil = RangesKt.until(0, i2);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean any(Function1<? super Integer, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (p0.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super Integer, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            if (p0.invoke(Integer.valueOf(iArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean contains(int p0) {
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] == p0) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(IntList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        IntRange intRangeUntil = RangesKt.until(0, p0._size);
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first > last) {
            return true;
        }
        while (contains(p0.get(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final int count(Function1<? super Integer, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (p0.invoke(Integer.valueOf(iArr[i3])).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final int first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final int first(Function1<? super Integer, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (p0.invoke(Integer.valueOf(i3)).booleanValue()) {
                return i3;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final <R> R fold(R p0, Function2<? super R, ? super Integer, ? extends R> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            p0 = p1.invoke(p0, Integer.valueOf(iArr[i2]));
        }
        return p0;
    }

    public final <R> R foldIndexed(R p0, Function3<? super Integer, ? super R, ? super Integer, ? extends R> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            R r = p0;
            p0 = p1.invoke(Integer.valueOf(i2), r, Integer.valueOf(iArr[i2]));
        }
        return p0;
    }

    public final <R> R foldRight(R p0, Function2<? super Integer, ? super R, ? extends R> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            p0 = p1.invoke(Integer.valueOf(iArr[i]), p0);
        }
        return p0;
    }

    public final <R> R foldRightIndexed(R p0, Function3<? super Integer, ? super Integer, ? super R, ? extends R> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            p0 = p1.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i]), p0);
        }
        return p0;
    }

    public final int indexOf(int p0) {
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (p0 == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super Integer, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (p0.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super Integer, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            if (p0.invoke(Integer.valueOf(iArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public final int last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int last(Function1<? super Integer, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            int i2 = iArr[i];
            if (p0.invoke(Integer.valueOf(i2)).booleanValue()) {
                return i2;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final int lastIndexOf(int p0) {
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            if (iArr[i] == p0) {
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ int binarySearch$default(IntList intList, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = intList._size;
        }
        return intList.binarySearch(i, i2, i3);
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i3 == i) {
                sb.append((CharSequence) str);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (i3 != 0) {
                sb.append(charSequence);
            }
            sb.append(function1.invoke(Integer.valueOf(i4)));
        }
        sb.append(charSequence3);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) str);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append(function1.invoke(Integer.valueOf(i3)));
        }
        sb.append(charSequence3);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) str);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append(function1.invoke(Integer.valueOf(i3)));
        }
        sb.append((CharSequence) str);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final String joinToString(CharSequence charSequence, Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) str);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append(function1.invoke(Integer.valueOf(i3)));
        }
        sb.append((CharSequence) str);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final String joinToString(Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) str);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (i2 != 0) {
                sb.append((CharSequence) str);
            }
            sb.append(function1.invoke(Integer.valueOf(i3)));
        }
        sb.append((CharSequence) str);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public /* synthetic */ IntList(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int binarySearch(int i) {
        return binarySearch$default(this, i, 0, 0, 6, null);
    }

    public final int binarySearch(int i, int i2) {
        return binarySearch$default(this, i, i2, 0, 4, null);
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
