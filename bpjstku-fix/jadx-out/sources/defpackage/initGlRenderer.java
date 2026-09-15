package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class initGlRenderer extends getExif {
    public AutoValue_Packet TuitionPaymentFragmentbindingInflater1(AutoValue_Packet autoValue_Packet) {
        return autoValue_Packet;
    }

    public initGlRenderer(executeSafely executesafely) {
        super(executesafely);
        this.b = 0;
    }

    @Override // defpackage.getExif
    protected final void b(AutoValue_Packet autoValue_Packet) {
        AutoValue_Packet autoValue_PacketTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(autoValue_Packet);
        if (autoValue_PacketTuitionPaymentFragmentbindingInflater1 != autoValue_Packet) {
            while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
            }
            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            autoValue_PacketTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(autoValue_Packet, autoValue_PacketTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }
}
