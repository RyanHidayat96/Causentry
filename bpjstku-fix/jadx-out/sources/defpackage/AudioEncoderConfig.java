package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class AudioEncoderConfig extends AudioEncoderConfigBuilder implements SizeCannotEncodeVideoQuirk {
    private final boolean TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.AudioEncoderConfigBuilder
    public final boolean t_() {
        return true;
    }

    public AudioEncoderConfig(VideoMimeInfoBuilder videoMimeInfoBuilder) {
        super(true);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoMimeInfoBuilder);
        this.TuitionPaymentFragmentbindingInflater1 = g();
    }

    @Override // defpackage.AudioEncoderConfigBuilder
    public final boolean o_() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.SizeCannotEncodeVideoQuirk
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return asInterface(Unit.INSTANCE);
    }

    @Override // defpackage.SizeCannotEncodeVideoQuirk
    public final boolean b(Throwable th) {
        return asInterface(new isVivoY91i(th, false, 2, null));
    }

    private final boolean g() {
        AudioEncoderConfigBuilder audioEncoderConfigBuilderTuitionPaymentFragmentbindingInflater1;
        ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub = INotificationSideChannelStub();
        isHuaweiMate20Pro ishuaweimate20pro = reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub instanceof isHuaweiMate20Pro ? (isHuaweiMate20Pro) reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub : null;
        if (ishuaweimate20pro == null || (audioEncoderConfigBuilderTuitionPaymentFragmentbindingInflater1 = ishuaweimate20pro.TuitionPaymentFragmentbindingInflater1()) == null) {
            return false;
        }
        while (!audioEncoderConfigBuilderTuitionPaymentFragmentbindingInflater1.o_()) {
            ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub2 = audioEncoderConfigBuilderTuitionPaymentFragmentbindingInflater1.INotificationSideChannelStub();
            isHuaweiMate20Pro ishuaweimate20pro2 = reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub2 instanceof isHuaweiMate20Pro ? (isHuaweiMate20Pro) reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub2 : null;
            if (ishuaweimate20pro2 == null || (audioEncoderConfigBuilderTuitionPaymentFragmentbindingInflater1 = ishuaweimate20pro2.TuitionPaymentFragmentbindingInflater1()) == null) {
                return false;
            }
        }
        return true;
    }
}
