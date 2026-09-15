package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class dumpAudioCapabilities {
    private static final appendBackupVideoProfile TuitionPaymentFragmentbindingInflater1 = DebugUtils.b(new Callable<appendBackupVideoProfile>() { // from class: dumpAudioCapabilities.2
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ appendBackupVideoProfile call() throws Exception {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    });

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        static final appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new BufferProvider(new Handler(Looper.getMainLooper()));
    }

    public static appendBackupVideoProfile TuitionPaymentFragmentbindingInflater1() {
        appendBackupVideoProfile appendbackupvideoprofile = TuitionPaymentFragmentbindingInflater1;
        if (appendbackupvideoprofile != null) {
            return appendbackupvideoprofile;
        }
        throw new NullPointerException("scheduler == null");
    }
}
