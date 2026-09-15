package kotlin;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u001c\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\u0002\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\"!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00008G¢\u0006\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011\"$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014*\u00020\u00008GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"", "", "printStackTrace", "(Ljava/lang/Throwable;)V", "Ljava/io/PrintWriter;", "p0", "(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V", "Ljava/io/PrintStream;", "(Ljava/lang/Throwable;Ljava/io/PrintStream;)V", "", "stackTraceToString", "(Ljava/lang/Throwable;)Ljava/lang/String;", "addSuppressed", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "Ljava/lang/StackTraceElement;", "getStackTrace", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "getStackTrace$annotations", "stackTrace", "", "getSuppressedExceptions", "(Ljava/lang/Throwable;)Ljava/util/List;", "getSuppressedExceptions$annotations", "suppressedExceptions"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
public class ExceptionsKt__ExceptionsKt {
    public static /* synthetic */ void getStackTrace$annotations(Throwable th) {
    }

    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th) {
    }

    private static final void printStackTrace(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        th.printStackTrace();
    }

    private static final void printStackTrace(Throwable th, PrintWriter printWriter) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(printWriter, "");
        th.printStackTrace(printWriter);
    }

    private static final void printStackTrace(Throwable th, PrintStream printStream) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(printStream, "");
        th.printStackTrace(printStream);
    }

    public static final StackTraceElement[] getStackTrace(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNull(stackTrace);
        return stackTrace;
    }

    public static final String stackTraceToString(Throwable th) throws IOException {
        Intrinsics.checkNotNullParameter(th, "");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final void addSuppressed(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (th != th2) {
            PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(th, th2);
        }
    }

    public static final List<Throwable> getSuppressedExceptions(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed(th);
    }
}
