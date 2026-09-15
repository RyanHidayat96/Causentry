package defpackage;

import android.os.StrictMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class abortImageCaptureRequests {
    public static final <T> T TuitionPaymentFragmentbindingInflater1(Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return function0.invoke();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
