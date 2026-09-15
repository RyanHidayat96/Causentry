package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getInputTimebase extends lambdasendEncodedData3 implements setCompatibleAudioProfile, MimeInfoBuilder {
    private AudioEncoderConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    @Override // defpackage.MimeInfoBuilder
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3 */
    public final AutoValue_AudioEncoderConfig getTuitionPaymentFragmentbindingInflater1() {
        return null;
    }

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th);

    @Override // defpackage.MimeInfoBuilder
    public final boolean k_() {
        return true;
    }

    public final AudioEncoderConfigBuilder TuitionPaymentFragmentbindingInflater1() {
        AudioEncoderConfigBuilder audioEncoderConfigBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (audioEncoderConfigBuilder != null) {
            return audioEncoderConfigBuilder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void TuitionPaymentFragmentbindingInflater1(AudioEncoderConfigBuilder audioEncoderConfigBuilder) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioEncoderConfigBuilder;
    }

    @Override // defpackage.setCompatibleAudioProfile
    public void dispose() {
        TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
    }

    @Override // defpackage.lambdasendEncodedData3
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1(this));
        sb.append('@');
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this));
        sb.append("[job@");
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1()));
        sb.append(']');
        return sb.toString();
    }
}
