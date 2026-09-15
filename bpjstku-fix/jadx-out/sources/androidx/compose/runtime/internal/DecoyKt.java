package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "illegalDecoyCallException", "(Ljava/lang/String;)Ljava/lang/Void;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DecoyKt {
    @ComposeCompilerApi
    public static final Void illegalDecoyCallException(String str) {
        StringBuilder sb = new StringBuilder("Function ");
        sb.append(str);
        sb.append(" should have been replaced by compiler.");
        throw new IllegalStateException(sb.toString());
    }
}
