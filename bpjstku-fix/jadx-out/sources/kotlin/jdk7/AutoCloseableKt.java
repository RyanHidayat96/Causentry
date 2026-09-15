package kotlin.jdk7;

import androidx.exifinterface.media.ExifInterface;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aP\u0010\n\u001a\u00028\u0001\"\u0010\b\u0000\u0010\u0007*\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\"\u0004\b\u0001\u0010\b*\u00028\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\r\u001a\u00020\u0001*\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\r\u0010\u000e*\n\u0010\u000f\"\u00020\u00032\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function0;", "", "p0", "Ljava/lang/AutoCloseable;", "Lkotlin/jdk7/TuitionPaymentFragmentbindingInflater1;", "AutoCloseable", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/AutoCloseable;", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlin/Function1;", "use", "(Ljava/lang/AutoCloseable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "closeFinally", "(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V", "TuitionPaymentFragmentbindingInflater1"}, k = 2, mv = {2, 1, 0}, pn = "", xi = 48)
public final class AutoCloseableKt {
    public static /* synthetic */ void AutoCloseable$annotations() {
    }

    private static final AutoCloseable AutoCloseable(final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return new AutoCloseable() { // from class: kotlin.jdk7.AutoCloseableKt.AutoCloseable.1
            @Override // java.lang.AutoCloseable
            public final void close() {
                function0.invoke();
            }
        };
    }

    private static final <T extends AutoCloseable, R> R use(T t, Function1<? super T, ? extends R> function1) throws Exception {
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            R rInvoke = function1.invoke(t);
            closeFinally(t, null);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                closeFinally(t, th);
                throw th2;
            }
        }
    }

    public static final void closeFinally(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }
}
