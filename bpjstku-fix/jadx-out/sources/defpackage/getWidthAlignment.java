package defpackage;

/* JADX INFO: loaded from: classes4.dex */
final class getWidthAlignment extends getSupportedHeightsFor {
    private Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getWidthAlignment(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        sb.append('@');
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(getSupportedHeights.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asInterface));
        sb.append(']');
        return sb.toString();
    }
}
