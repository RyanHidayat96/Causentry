package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class checkEglErrorOrLog {
    public checkInitializedOrThrow[] TuitionPaymentFragmentbindingInflater1;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public checkEglErrorOrLog TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public checkEglErrorOrLog(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getSimpleName());
        sb.append(": ");
        sb.append(th.getMessage());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = th.getClass().getCanonicalName();
        if (th.getCause() != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new checkEglErrorOrLog((Exception) th.getCause());
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        this.TuitionPaymentFragmentbindingInflater1 = new checkInitializedOrThrow[stackTrace.length];
        for (int i = 0; i < stackTrace.length; i++) {
            this.TuitionPaymentFragmentbindingInflater1[i] = new checkInitializedOrThrow(stackTrace[i]);
        }
    }

    public /* synthetic */ checkEglErrorOrLog() {
    }
}
