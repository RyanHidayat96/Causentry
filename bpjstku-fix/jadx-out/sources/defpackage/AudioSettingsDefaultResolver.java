package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
final class AudioSettingsDefaultResolver implements setCompatibleAudioProfile {
    private final Future<?> b;

    public AudioSettingsDefaultResolver(Future<?> future) {
        this.b = future;
    }

    @Override // defpackage.setCompatibleAudioProfile
    public final void dispose() {
        this.b.cancel(false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisposableFutureHandle[");
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }
}
