package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public class lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor implements lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -218153597;
    private Charset TuitionPaymentFragmentbindingInflater1;
    private AutoValue_Packet TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public TuitionPaymentFragmentspecialinlinedviewModeldefault2 b;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str);
    }

    public lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor() {
        this((byte) 0);
    }

    private lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor(byte b) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_Packet();
        this.TuitionPaymentFragmentbindingInflater1 = null;
    }

    @Override // defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
    public final void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
        byte[] bArrArray;
        int iRemaining;
        int i;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
            byte b = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1).get();
            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2--;
            if (b == 10) {
                byteBufferAllocate.flip();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferAllocate);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b;
                AutoValue_Packet autoValue_Packet2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Charset charset = SurfaceEdgeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                StringBuilder sb = new StringBuilder();
                for (ByteBuffer byteBuffer : autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    if (byteBuffer.isDirect()) {
                        bArrArray = new byte[byteBuffer.remaining()];
                        iRemaining = byteBuffer.remaining();
                        byteBuffer.get(bArrArray);
                        i = 0;
                    } else {
                        bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                        iRemaining = byteBuffer.remaining();
                        i = iArrayOffset;
                    }
                    sb.append(new String(bArrArray, i, iRemaining, charset));
                }
                String string = sb.toString();
                autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_Packet();
                return;
            }
            byteBufferAllocate.put(b);
        }
        byteBufferAllocate.flip();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferAllocate);
    }
}
