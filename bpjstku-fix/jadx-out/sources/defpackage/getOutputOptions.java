package defpackage;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes5.dex */
public final class getOutputOptions implements hasAudioEnabled.b {
    private final getRecordingId TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public getOutputOptions(getRecordingId getrecordingid) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getrecordingid;
    }

    @Override // hasAudioEnabled.b
    public final void TuitionPaymentFragmentbindingInflater1(getRecordingId getrecordingid) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(getrecordingid) < 0) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("Latest library version ");
            sb.append(getrecordingid);
            sb.append(" > ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(" (current)");
            printStream.println(sb.toString());
        }
    }
}
