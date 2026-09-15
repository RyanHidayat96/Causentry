package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaControllerCompatApi24 implements toLegacyStreamType {
    public final getVolumeControl TuitionPaymentFragmentbindingInflater1;
    public final getVolumeControl TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final createCallback b;

    public MediaControllerCompatApi24(String str, getVolumeControl getvolumecontrol, getVolumeControl getvolumecontrol2, createCallback createcallback, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentbindingInflater1 = getvolumecontrol;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getvolumecontrol2;
        this.b = createcallback;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        return new getSessionActivity(prepareVar, frommediasession, this);
    }
}
