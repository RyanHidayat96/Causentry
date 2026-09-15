package defpackage;

import com.koushikdutta.async.http.filter.PrematureDataEndException;

/* JADX INFO: loaded from: classes4.dex */
public final class notifyTransformationInfoUpdate extends lambdaexecuteSafely11 {
    private long TuitionPaymentFragmentbindingInflater1;
    private AutoValue_Packet TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_Packet();
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public notifyTransformationInfoUpdate(long j) {
        this.TuitionPaymentFragmentbindingInflater1 = j;
    }

    @Override // defpackage.getSurfaceEdge
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
        if (exc == null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != this.TuitionPaymentFragmentbindingInflater1) {
            StringBuilder sb = new StringBuilder("End of data reached before content length was read: ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append("/");
            sb.append(this.TuitionPaymentFragmentbindingInflater1);
            sb.append(" Paused: ");
            sb.append(f_());
            exc = new PrematureDataEndException(sb.toString());
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
    }

    @Override // defpackage.lambdaexecuteSafely11, defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
    public final void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
        autoValue_Packet.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (int) Math.min(this.TuitionPaymentFragmentbindingInflater1 - this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        super.TuitionPaymentFragmentbindingInflater1(checkreadytorelease, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += (long) (i - this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        AutoValue_Packet autoValue_Packet2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        autoValue_Packet2.TuitionPaymentFragmentbindingInflater1(autoValue_Packet, autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == this.TuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2((Exception) null);
        }
    }
}
