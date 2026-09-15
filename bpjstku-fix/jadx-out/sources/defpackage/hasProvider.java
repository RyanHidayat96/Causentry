package defpackage;

import com.koushikdutta.async.http.filter.DataRemainingException;
import java.nio.ByteBuffer;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public class hasProvider extends lambdaexecuteSafely11 {
    private AutoValue_Packet TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Inflater b;

    @Override // defpackage.getSurfaceEdge
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
        this.b.end();
        if (exc != null && this.b.getRemaining() > 0) {
            exc = new DataRemainingException("data still remaining in inflater", exc);
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
    }

    public hasProvider() {
        this(new Inflater());
    }

    public hasProvider(Inflater inflater) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_Packet();
        this.b = inflater;
    }

    @Override // defpackage.lambdaexecuteSafely11, defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
    public void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
        try {
            ByteBuffer byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 2);
            while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                ByteBuffer byteBufferRemove = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= byteBufferRemove.remaining();
                if (byteBufferRemove.hasRemaining()) {
                    byteBufferRemove.remaining();
                    this.b.setInput(byteBufferRemove.array(), byteBufferRemove.arrayOffset() + byteBufferRemove.position(), byteBufferRemove.remaining());
                    do {
                        byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.position(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.position() + this.b.inflate(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.array(), byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.arrayOffset() + byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.position(), byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.remaining()));
                        if (!byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.hasRemaining()) {
                            byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.flip();
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.capacity() * 2);
                        }
                        if (this.b.needsInput()) {
                            break;
                        }
                    } while (!this.b.finished());
                }
                AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBufferRemove);
            }
            byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.flip();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } catch (Exception e2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
        }
    }
}
