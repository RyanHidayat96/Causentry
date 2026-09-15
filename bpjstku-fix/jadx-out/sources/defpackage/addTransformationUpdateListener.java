package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class addTransformationUpdateListener extends initGlRenderer {
    public addTransformationUpdateListener(executeSafely executesafely) {
        super(executesafely);
    }

    @Override // defpackage.initGlRenderer
    public final AutoValue_Packet TuitionPaymentFragmentbindingInflater1(AutoValue_Packet autoValue_Packet) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 16));
        sb.append("\r\n");
        autoValue_Packet.TuitionPaymentFragmentbindingInflater1(ByteBuffer.wrap(sb.toString().getBytes()));
        autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteBuffer.wrap("\r\n".getBytes()));
        return autoValue_Packet;
    }

    @Override // defpackage.getExif, defpackage.executeSafely
    public final void b() {
        this.b = Integer.MAX_VALUE;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AutoValue_Packet());
        this.b = 0;
    }
}
