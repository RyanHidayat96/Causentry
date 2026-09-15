package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ7\u0010\b\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0012\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0012\u0010\u0015J\u001b\u0010\u0012\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\u001b\u0010\u0012\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0012\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u0019\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u001bJ\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u001e\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\u0011J\r\u0010\"\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010#J7\u0010\"\u001a\u00028\u00002\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b%\u0010#J9\u0010%\u001a\u0004\u0018\u00018\u00002\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b%\u0010$JP\u0010(\u001a\u00028\u0001\"\u0004\b\u0001\u0010&2\u0006\u0010\u0004\u001a\u00028\u00012\"\u0010\u001e\u001a\u001e\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00010'H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b(\u0010)J[\u0010+\u001a\u00028\u0001\"\u0004\b\u0001\u0010&2\u0006\u0010\u0004\u001a\u00028\u00012-\u0010\u001e\u001a)\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00010*H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b+\u0010,JP\u0010-\u001a\u00028\u0001\"\u0004\b\u0001\u0010&2\u0006\u0010\u0004\u001a\u00028\u00012\"\u0010\u001e\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00010'H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b-\u0010)J[\u0010.\u001a\u00028\u0001\"\u0004\b\u0001\u0010&2\u0006\u0010\u0004\u001a\u00028\u00012-\u0010\u001e\u001a)\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00010*H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b.\u0010,J7\u00100\u001a\u00020/2\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020/0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u00101JB\u00102\u001a\u00020/2\"\u0010\u0004\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020/0'H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b2\u00103J7\u00104\u001a\u00020/2\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020/0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b4\u00101JB\u00105\u001a\u00020/2\"\u0010\u0004\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020/0'H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b5\u00103J\u0018\u00106\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b6\u0010\u001dJ\u000f\u00107\u001a\u00020\u0003H\u0016¢\u0006\u0004\b7\u0010\u001aJ\u0015\u00108\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b8\u00109J7\u0010:\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u001bJ7\u0010;\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b;\u0010\u001bJ\r\u0010<\u001a\u00020\u0007¢\u0006\u0004\b<\u0010\tJ\r\u0010=\u001a\u00020\u0007¢\u0006\u0004\b=\u0010\tJY\u0010D\u001a\u00020C2\b\b\u0002\u0010\u0004\u001a\u00020>2\b\b\u0002\u0010\u001e\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020>2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020>\u0018\u00010\nH\u0007¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00028\u0000¢\u0006\u0004\bF\u0010#J7\u0010F\u001a\u00028\u00002\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bF\u0010$J\u0015\u0010G\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\bG\u00109J\u0012\u0010H\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\bH\u0010#J9\u0010H\u001a\u0004\u0018\u00018\u00002\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bH\u0010$J\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\tJ7\u0010J\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bJ\u0010\fJ\u0017\u0010K\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\bK\u0010\u0006J\u000f\u0010L\u001a\u00020CH\u0017¢\u0006\u0004\bL\u0010MR\u001c\u0010N\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bN\u0010O\u0012\u0004\bP\u0010QR$\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bR\u0010S\u0012\u0004\bT\u0010QR\u0012\u0010X\u001a\u00020U8Ç\u0002¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0012\u0010Z\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\bY\u0010\u001aR\u0011\u0010\\\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b[\u0010\u001a\u0082\u0001\u0001]\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/ObjectList;", ExifInterface.LONGITUDE_EAST, "", "", "p0", "<init>", "(I)V", "", "any", "()Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "(Lkotlin/jvm/functions/Function1;)Z", "", "asList", "()Ljava/util/List;", "contains", "(Ljava/lang/Object;)Z", "containsAll", "(Landroidx/collection/ObjectList;)Z", "", "([Ljava/lang/Object;)Z", "", "(Ljava/lang/Iterable;)Z", "(Ljava/util/List;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function1;)I", "elementAt", "(I)Ljava/lang/Object;", "p1", "elementAtOrElse", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "equals", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "R", "Lkotlin/Function2;", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "", "p2", "p3", "p4", "p5", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "last", "lastIndexOf", "lastOrNull", "none", "reversedAny", "throwIndexOutOfBoundsExclusiveException$collection", "toString", "()Ljava/lang/String;", "_size", "I", "get_size$annotations", "()V", FirebaseAnalytics.Param.CONTENT, "[Ljava/lang/Object;", "getContent$annotations", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "getLastIndex", "lastIndex", "getSize", "size", "Landroidx/collection/MutableObjectList;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public abstract List<E> asList();

    private ObjectList(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = ObjectListKt.EmptyArray;
        } else {
            objArr = new Object[i];
        }
        this.content = objArr;
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

    public final boolean none() {
        return isEmpty();
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(E p0) {
        return indexOf(p0) >= 0;
    }

    public final boolean containsAll(E[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (E e2 : p0) {
            if (!contains(e2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(List<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            if (!contains(p0.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final E first() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final void forEach(Function1<? super E, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            p0.invoke(objArr[i2]);
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super E, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            p0.invoke(Integer.valueOf(i2), objArr[i2]);
        }
    }

    public final void forEachReversed(Function1<? super E, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            p0.invoke(objArr[i]);
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super E, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            p0.invoke(Integer.valueOf(i), objArr[i]);
        }
    }

    public final E get(int p0) {
        if (p0 < 0 || p0 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(p0);
        }
        return (E) this.content[p0];
    }

    public final E elementAt(int p0) {
        if (p0 < 0 || p0 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(p0);
        }
        return (E) this.content[p0];
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int p0) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(p0);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
    }

    public final E elementAtOrElse(int p0, Function1<? super Integer, ? extends E> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 >= this._size) {
            return p1.invoke(Integer.valueOf(p0));
        }
        return (E) this.content[p0];
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final E last() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return objectList.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public final String joinToString(CharSequence p0, CharSequence p1, CharSequence p2, int p3, CharSequence p4, Function1<? super E, ? extends CharSequence> p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p4, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 == p3) {
                sb.append(p4);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (i2 != 0) {
                sb.append(p0);
            }
            if (p5 == null) {
                sb.append(obj);
            } else {
                sb.append(p5.invoke(obj));
            }
        }
        sb.append(p2);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public boolean equals(Object p0) {
        if (p0 instanceof ObjectList) {
            ObjectList objectList = (ObjectList) p0;
            int i = objectList._size;
            int i2 = this._size;
            if (i == i2) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                IntRange intRangeUntil = RangesKt.until(0, i2);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (Intrinsics.areEqual(objArr[first], objArr2[first])) {
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
        return joinToString$default(this, null, "[", "]", 0, null, new Function1<E, CharSequence>(this) { // from class: androidx.collection.ObjectList.toString.1
            final /* synthetic */ ObjectList<E> this$0;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(E e2) {
                if (e2 == this.this$0) {
                    return "(this)";
                }
                return String.valueOf(e2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }
        }, 25, null);
    }

    public final boolean any(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (p0.invoke(objArr[i2]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            if (p0.invoke(objArr[i]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(Iterable<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.content;
        int i = p0._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (!contains(objArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final int count(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (p0.invoke(objArr[i3]).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E first(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            ?? r3 = (Object) objArr[i2];
            if (p0.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E firstOrNull(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            ?? r3 = (Object) objArr[i2];
            if (p0.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        return null;
    }

    public final <R> R fold(R p0, Function2<? super R, ? super E, ? extends R> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            p0 = p1.invoke(p0, objArr[i2]);
        }
        return p0;
    }

    public final <R> R foldIndexed(R p0, Function3<? super Integer, ? super R, ? super E, ? extends R> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            p0 = p1.invoke(Integer.valueOf(i2), p0, objArr[i2]);
        }
        return p0;
    }

    public final <R> R foldRight(R p0, Function2<? super E, ? super R, ? extends R> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            p0 = p1.invoke(objArr[i], p0);
        }
        return p0;
    }

    public final <R> R foldRightIndexed(R p0, Function3<? super Integer, ? super E, ? super R, ? extends R> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            p0 = p1.invoke(Integer.valueOf(i), objArr[i], p0);
        }
        return p0;
    }

    public final int indexOf(E p0) {
        int i = 0;
        if (p0 == null) {
            Object[] objArr = this.content;
            int i2 = this._size;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i3 = this._size;
        while (i < i3) {
            if (p0.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (p0.invoke(objArr[i2]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            if (p0.invoke(objArr[i]).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E, java.lang.Object] */
    public final E last(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            ?? r2 = (Object) objArr[i];
            if (p0.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E, java.lang.Object] */
    public final E lastOrNull(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            ?? r2 = (Object) objArr[i];
            if (p0.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        return null;
    }

    public final int lastIndexOf(E p0) {
        if (p0 == null) {
            Object[] objArr = this.content;
            for (int i = this._size - 1; i >= 0; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (p0.equals(objArr2[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public /* synthetic */ ObjectList(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final String joinToString(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return joinToString$default(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, null, 48, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, charSequence4, null, 32, null);
    }
}
