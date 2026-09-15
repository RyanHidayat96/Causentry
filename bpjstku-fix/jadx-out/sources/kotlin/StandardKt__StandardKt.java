package kotlin;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0001\u0010\u0005\u001a4\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0006*\u00028\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\r\u001aM\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u000f\u0010\r\u001aC\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00028\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0011\u0010\r\u001a>\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0012\u0010\r\u001aD\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0006*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0013\u0010\r\u001a@\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u000bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0015\u0010\r\u001a@\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u000bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0016\u0010\r\u001a:\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00172\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000bH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "TODO", "()Ljava/lang/Void;", "", "p0", "(Ljava/lang/String;)Ljava/lang/Void;", "R", "Lkotlin/Function0;", "run", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "p1", "with", "", "apply", "also", "let", "", "takeIf", "takeUnless", "", "repeat", "(ILkotlin/jvm/functions/Function1;)V"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/StandardKt")
class StandardKt__StandardKt {
    private static final Void TODO() {
        throw new NotImplementedError(null, 1, null);
    }

    private static final Void TODO(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        throw new NotImplementedError("An operation is not implemented: ".concat(String.valueOf(str)));
    }

    private static final <R> R run(Function0<? extends R> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return function0.invoke();
    }

    private static final <T, R> R run(T t, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return function1.invoke(t);
    }

    private static final <T, R> R with(T t, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return function1.invoke(t);
    }

    private static final <T> T apply(T t, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(t);
        return t;
    }

    private static final <T> T also(T t, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(t);
        return t;
    }

    private static final <T, R> R let(T t, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return function1.invoke(t);
    }

    private static final <T> T takeIf(T t, Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (function1.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    private static final <T> T takeUnless(T t, Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (function1.invoke(t).booleanValue()) {
            return null;
        }
        return t;
    }

    private static final void repeat(int i, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        for (int i2 = 0; i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }
}
