package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.EncoderImplMediaCodecCallback1;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0005j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u0017\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0002\u0010\u001cJ\r\u0010\u001d\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001eJ\r\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001eJ$\u0010 \u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0019H\u0086\b¢\u0006\u0002\u0010\u001cJ\u0013\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010$J,\u0010%\u001a\u00020\u00152\u0006\u0010#\u001a\u00028\u00002\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150\u0019H\u0086\b¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00152\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0002\u0010\u001eJ\u0015\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010-J\u0015\u0010.\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010$J\u0011\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u000eH\u0082\u0010J\u0011\u00101\u001a\u00020\"2\u0006\u00100\u001a\u00020\u000eH\u0082\u0010J\u0015\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\tH\u0002¢\u0006\u0002\u00103J\u0018\u00104\u001a\u00020\"2\u0006\u00100\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0002R\u001a\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u00066"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "<init>", "()V", "a", "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "_size", "Lkotlinx/atomicfu/AtomicInt;", "value", "", "size", "getSize", "()I", "setSize", "(I)V", "isEmpty", "", "()Z", "find", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "removeFirstIf", "addLast", "", "node", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLastIf", "cond", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "firstImpl", "removeAtImpl", FirebaseAnalytics.Param.INDEX, "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "addImpl", "siftUpFrom", "i", "siftDownFrom", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "swap", "j", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class EncoderImplMediaCodecCallbackExternalSyntheticLambda9<T extends EncoderImplMediaCodecCallback1 & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AtomicIntegerFieldUpdater.newUpdater(EncoderImplMediaCodecCallbackExternalSyntheticLambda9.class, "_size$volatile");
    private T[] TuitionPaymentFragmentbindingInflater1;
    private volatile /* synthetic */ int _size$volatile;

    public final boolean TuitionPaymentFragmentbindingInflater1() {
        return asBinder() == 0;
    }

    public final T b() {
        T[] tArr = this.TuitionPaymentFragmentbindingInflater1;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003d  */
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        T[] tArr = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(tArr);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(asBinder() - 1);
        if (i < asBinder()) {
            TuitionPaymentFragmentbindingInflater1(i, asBinder());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                Object obj = tArr[i];
                Intrinsics.checkNotNull(obj);
                Object obj2 = tArr[i2];
                Intrinsics.checkNotNull(obj2);
                if (((Comparable) obj).compareTo(obj2) < 0) {
                    TuitionPaymentFragmentbindingInflater1(i, i2);
                    TuitionPaymentFragmentbindingInflater1(i2);
                } else {
                    b(i);
                }
            } else {
                b(i);
            }
        }
        T t = (T) tArr[asBinder()];
        Intrinsics.checkNotNull(t);
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        t.TuitionPaymentFragmentspecialinlinedviewModeldefault3(null);
        t.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1);
        tArr[asBinder()] = null;
        return t;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        t.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        EncoderImplMediaCodecCallback1[] encoderImplMediaCodecCallback1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iAsBinder = asBinder();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iAsBinder + 1);
        encoderImplMediaCodecCallback1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[iAsBinder] = t;
        t.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iAsBinder);
        TuitionPaymentFragmentbindingInflater1(iAsBinder);
    }

    private final void TuitionPaymentFragmentbindingInflater1(int i) {
        while (i > 0) {
            Object[] objArr = this.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNull(objArr);
            int i2 = (i - 1) / 2;
            Object obj = objArr[i2];
            Intrinsics.checkNotNull(obj);
            Object obj2 = objArr[i];
            Intrinsics.checkNotNull(obj2);
            if (((Comparable) obj).compareTo(obj2) <= 0) {
                return;
            }
            TuitionPaymentFragmentbindingInflater1(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    private final void b(int i) {
        while (true) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (i3 >= asBinder()) {
                return;
            }
            Object[] objArr = this.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNull(objArr);
            int i4 = i2 + 2;
            if (i4 < asBinder()) {
                Object obj = objArr[i4];
                Intrinsics.checkNotNull(obj);
                Object obj2 = objArr[i3];
                Intrinsics.checkNotNull(obj2);
                if (((Comparable) obj).compareTo(obj2) >= 0) {
                    i4 = i3;
                }
            } else {
                i4 = i3;
            }
            Object obj3 = objArr[i];
            Intrinsics.checkNotNull(obj3);
            Object obj4 = objArr[i4];
            Intrinsics.checkNotNull(obj4);
            if (((Comparable) obj3).compareTo(obj4) <= 0) {
                return;
            }
            TuitionPaymentFragmentbindingInflater1(i, i4);
            i = i4;
        }
    }

    private final T[] TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        T[] tArr = this.TuitionPaymentFragmentbindingInflater1;
        if (tArr == null) {
            T[] tArr2 = (T[]) new EncoderImplMediaCodecCallback1[4];
            this.TuitionPaymentFragmentbindingInflater1 = tArr2;
            return tArr2;
        }
        if (asBinder() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, asBinder() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        T[] tArr3 = (T[]) ((EncoderImplMediaCodecCallback1[]) objArrCopyOf);
        this.TuitionPaymentFragmentbindingInflater1 = tArr3;
        return tArr3;
    }

    private final void TuitionPaymentFragmentbindingInflater1(int i, int i2) {
        T[] tArr = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(tArr);
        T t = tArr[i2];
        Intrinsics.checkNotNull(t);
        T t2 = tArr[i];
        Intrinsics.checkNotNull(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
        t2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2);
    }

    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        T t;
        synchronized (this) {
            t = (T) b();
        }
        return t;
    }

    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        T t;
        synchronized (this) {
            t = asBinder() > 0 ? (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(0) : null;
        }
        return t;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(T t) {
        boolean z;
        synchronized (this) {
            if (t.TuitionPaymentFragmentspecialinlinedviewModeldefault1() == null) {
                z = false;
            } else {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = t.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                z = true;
            }
        }
        return z;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(this, i);
    }

    private int asBinder() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this);
    }
}
