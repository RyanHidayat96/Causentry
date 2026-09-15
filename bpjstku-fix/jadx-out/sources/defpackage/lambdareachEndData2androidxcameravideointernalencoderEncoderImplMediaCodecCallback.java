package defpackage;

import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException b(Function1<? super E, Unit> function1, E e2, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(e2);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                ExceptionsKt.addSuppressed(undeliveredElementException, th);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for ".concat(String.valueOf(e2)), th);
        }
    }
}
