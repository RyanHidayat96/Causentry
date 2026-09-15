package androidx.p002lifecycle;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/lifecycle/MethodCallsLogger;", "", "<init>", "()V", "", "p0", "", "p1", "", "approveCall", "(Ljava/lang/String;I)Z", "", "calledMethods", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    public boolean approveCall(String p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Integer num = this.calledMethods.get(p0);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z = (iIntValue & p1) != 0;
        this.calledMethods.put(p0, Integer.valueOf(p1 | iIntValue));
        return !z;
    }
}
