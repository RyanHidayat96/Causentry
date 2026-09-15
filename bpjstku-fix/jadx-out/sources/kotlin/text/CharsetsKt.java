package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "Ljava/nio/charset/Charset;", "charset", "(Ljava/lang/String;)Ljava/nio/charset/Charset;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CharsetsKt {
    private static final Charset charset(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Charset charsetForName = Charset.forName(str);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "");
        return charsetForName;
    }
}
