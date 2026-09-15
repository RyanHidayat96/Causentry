package defpackage;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class DebugUtils {
    public static appendBackupVideoProfile b(Callable<appendBackupVideoProfile> callable) {
        try {
            appendBackupVideoProfile appendbackupvideoprofileCall = callable.call();
            if (appendbackupvideoprofileCall != null) {
                return appendbackupvideoprofileCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        }
    }
}
