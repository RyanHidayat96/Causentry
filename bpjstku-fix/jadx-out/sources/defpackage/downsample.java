package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class downsample {
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
