package defpackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class DualSurfaceProcessorExternalSyntheticLambda8 implements DualSurfaceProcessorExternalSyntheticLambda3 {
    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda3
    public final DatagramSocket TuitionPaymentFragmentbindingInflater1() throws SocketException {
        return new DatagramSocket();
    }

    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda3
    public final DatagramPacket TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new DatagramPacket(bArr, bArr.length);
    }

    @Override // defpackage.DualSurfaceProcessorExternalSyntheticLambda3
    public final DatagramPacket b(byte[] bArr, InetAddress inetAddress) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(inetAddress, "");
        return new DatagramPacket(bArr, bArr.length, inetAddress, 123);
    }
}
