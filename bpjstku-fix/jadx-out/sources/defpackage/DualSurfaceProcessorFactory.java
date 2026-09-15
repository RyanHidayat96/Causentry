package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class DualSurfaceProcessorFactory implements DualSurfaceProcessorExternalSyntheticLambda7 {
    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda7
    public final InetAddress TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(str, "");
        InetAddress byName = InetAddress.getByName(str);
        Intrinsics.checkNotNullExpressionValue(byName, "");
        return byName;
    }
}
