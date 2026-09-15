package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acquireInputBuffer {
    private static final Function1<Object, Object> TuitionPaymentFragmentbindingInflater1 = new Function1() { // from class: isInPauseRange
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return acquireInputBuffer.TuitionPaymentFragmentbindingInflater1(obj);
        }
    };
    private static final Function2<Object, Object, Boolean> b = new Function2() { // from class: getAdjustedTimeUs
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
        }
    };

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> clampVideoBitrateIfNotSupported<T> b(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported) {
        return clampvideobitrateifnotsupported instanceof stopMediaCodec ? clampvideobitrateifnotsupported : TuitionPaymentFragmentspecialinlinedviewModeldefault3(clampvideobitrateifnotsupported, TuitionPaymentFragmentbindingInflater1, b);
    }

    public static final <T> clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentbindingInflater1(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Function2<? super T, ? super T, Boolean> function2) {
        Function1<Object, Object> function1 = TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(function2, "");
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(clampvideobitrateifnotsupported, function1, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (clampvideobitrateifnotsupported instanceof lambdaacquireInputBuffer13) {
            lambdaacquireInputBuffer13 lambdaacquireinputbuffer13 = (lambdaacquireInputBuffer13) clampvideobitrateifnotsupported;
            if (lambdaacquireinputbuffer13.TuitionPaymentFragmentbindingInflater1 == function1 && lambdaacquireinputbuffer13.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == function2) {
                return clampvideobitrateifnotsupported;
            }
        }
        return new lambdaacquireInputBuffer13(clampvideobitrateifnotsupported, function1, function2);
    }
}
