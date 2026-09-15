package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class lambdainitAndRetryRecursively1androidxcameracoreCameraX implements traceExecutionState.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    private final long TuitionPaymentFragmentbindingInflater1 = 262144000;
    private final b TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public interface b {
        File TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public lambdainitAndRetryRecursively1androidxcameracoreCameraX(b bVar, long j) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar;
    }

    @Override // traceExecutionState.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final traceExecutionState TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        File fileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            return null;
        }
        if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault3.isDirectory() || fileTuitionPaymentFragmentspecialinlinedviewModeldefault3.mkdirs()) {
            return new isInitialized(fileTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1);
        }
        return null;
    }
}
