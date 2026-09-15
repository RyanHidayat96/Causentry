package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010"}, d2 = {"LAutoValue_AudioEncoderConfigBuilder;", "LsetCompatibleAudioProfile;", "LReportedVideoQualityNotSupportedQuirk;", "<init>", "()V", "", "dispose", "", "p0", "", "b", "(Ljava/lang/Throwable;)Z", "", "toString", "()Ljava/lang/String;", "LVideoMimeInfoBuilder;", "()LVideoMimeInfoBuilder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoValue_AudioEncoderConfigBuilder implements ReportedVideoQualityNotSupportedQuirk {
    public static final AutoValue_AudioEncoderConfigBuilder INSTANCE = new AutoValue_AudioEncoderConfigBuilder();

    @Override // defpackage.ReportedVideoQualityNotSupportedQuirk
    public final VideoMimeInfoBuilder b() {
        return null;
    }

    @Override // defpackage.ReportedVideoQualityNotSupportedQuirk
    public final boolean b(Throwable p0) {
        return false;
    }

    @Override // defpackage.setCompatibleAudioProfile
    public final void dispose() {
    }

    private AutoValue_AudioEncoderConfigBuilder() {
    }

    public final String toString() {
        return "NonDisposableHandle";
    }
}
