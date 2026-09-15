package com.lyft.kronos.internal.ntp;

import defpackage.DualSurfaceProcessorExternalSyntheticLambda3;
import defpackage.DualSurfaceProcessorExternalSyntheticLambda7;
import defpackage.lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public class SntpClient {
    private final DualSurfaceProcessorExternalSyntheticLambda3 TuitionPaymentFragmentbindingInflater1;
    private final lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final DualSurfaceProcessorExternalSyntheticLambda7 b;

    static class InvalidServerReplyException extends IOException {
        public InvalidServerReplyException(String str) {
            super(str);
        }
    }

    public SntpClient(lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor, DualSurfaceProcessorExternalSyntheticLambda7 dualSurfaceProcessorExternalSyntheticLambda7, DualSurfaceProcessorExternalSyntheticLambda3 dualSurfaceProcessorExternalSyntheticLambda3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor;
        this.b = dualSurfaceProcessorExternalSyntheticLambda7;
        this.TuitionPaymentFragmentbindingInflater1 = dualSurfaceProcessorExternalSyntheticLambda3;
    }

    public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(String str, Long l) throws IOException {
        DatagramSocket datagramSocket = null;
        try {
            InetAddress inetAddressTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
            DatagramSocket datagramSocketTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
            datagramSocketTuitionPaymentFragmentbindingInflater1.setSoTimeout(l.intValue());
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacketB = this.TuitionPaymentFragmentbindingInflater1.b(bArr, inetAddressTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            bArr[0] = 27;
            long jB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            long j = jB / 1000;
            long j2 = j + 2208988800L;
            bArr[40] = (byte) (j2 >> 24);
            bArr[41] = (byte) (j2 >> 16);
            bArr[42] = (byte) (j2 >> 8);
            bArr[43] = (byte) j2;
            long j3 = ((jB - (j * 1000)) * 4294967296L) / 1000;
            bArr[44] = (byte) (j3 >> 24);
            bArr[45] = (byte) (j3 >> 16);
            bArr[46] = (byte) (j3 >> 8);
            bArr[47] = (byte) (Math.random() * 255.0d);
            datagramSocketTuitionPaymentFragmentbindingInflater1.send(datagramPacketB);
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 48);
            datagramSocketTuitionPaymentFragmentbindingInflater1.receive(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArrCopyOf));
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            long j4 = jB + (jTuitionPaymentFragmentspecialinlinedviewModeldefault3 - jTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            byte b = bArrCopyOf[0];
            byte b2 = (byte) ((b >> 6) & 3);
            byte b3 = (byte) (b & 7);
            byte b4 = bArrCopyOf[1];
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrCopyOf, 24);
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrCopyOf, 32);
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrCopyOf, 40);
            int i = b4 & UByte.MAX_VALUE;
            if (b2 == 3) {
                throw new InvalidServerReplyException("unsynchronized server");
            }
            if (b3 != 4 && b3 != 5) {
                throw new InvalidServerReplyException("untrusted mode: ".concat(String.valueOf((int) b3)));
            }
            if (i == 0 || i > 15) {
                throw new InvalidServerReplyException("untrusted stratum: ".concat(String.valueOf(i)));
            }
            if (jTuitionPaymentFragmentspecialinlinedviewModeldefault6 != 0) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(j4, jTuitionPaymentFragmentspecialinlinedviewModeldefault3, ((jTuitionPaymentFragmentspecialinlinedviewModeldefault5 - jTuitionPaymentFragmentspecialinlinedviewModeldefault4) + (jTuitionPaymentFragmentspecialinlinedviewModeldefault6 - j4)) / 2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                datagramSocketTuitionPaymentFragmentbindingInflater1.close();
                return tuitionPaymentFragmentbindingInflater1;
            }
            throw new InvalidServerReplyException("zero transmitTime");
        } catch (Throwable th) {
            if (0 != 0) {
                datagramSocket.close();
            }
            throw th;
        }
    }

    private static long TuitionPaymentFragmentbindingInflater1(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, int i) {
        return ((TuitionPaymentFragmentbindingInflater1(bArr, i) - 2208988800L) * 1000) + ((TuitionPaymentFragmentbindingInflater1(bArr, i + 4) * 1000) / 4294967296L);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 {
        public final long TuitionPaymentFragmentbindingInflater1;
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentbindingInflater1(long j, long j2, long j3, lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j2;
            this.TuitionPaymentFragmentbindingInflater1 = j3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor;
        }
    }
}
