package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.exifinterface.media.ExifInterface;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"LaccessgetMContextp;", "", "LaccessgetMContextp$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p0", "<init>", "(LaccessgetMContextp$TuitionPaymentFragmentspecialinlinedviewModeldefault3;)V", "", "sendApiChange", "()Z", "", "", "sendError", "(Ljava/lang/String;)V", "sendPlaybackQualityChange", "sendPlaybackRateChange", "sendReady", "sendStateChange", "sendVideoCurrentTime", "sendVideoDuration", "sendVideoId", "(Ljava/lang/String;)Z", "sendVideoLoadedFraction", "sendYouTubeIFrameAPIReady", "Landroid/os/Handler;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroid/os/Handler;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LaccessgetMContextp$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "b"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class accessgetMContextp {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        Collection<setContext> TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        accessgetActiveConcurrentCameraInfos b();
    }

    public accessgetMContextp(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Handler(Looper.getMainLooper());
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: accessgetOrCreateCameraXInstance
            @Override // java.lang.Runnable
            public final void run() {
                accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: accesssetCameraOperatingMode
            @Override // java.lang.Runnable
            public final void run() {
                accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: accessisVideoCapture
            @Override // java.lang.Runnable
            public final void run() {
                accessgetMContextp.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            final float f = Float.parseFloat(p0);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: accessgetMLockp
                @Override // java.lang.Runnable
                public final void run() {
                    accessgetMContextp.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, f);
                }
            });
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            if (TextUtils.isEmpty(p0)) {
                p0 = "0";
            }
            final float f = Float.parseFloat(p0);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: accessgetSAppInstancecp
                @Override // java.lang.Runnable
                public final void run() {
                    accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, f);
                }
            });
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            final float f = Float.parseFloat(p0);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: configureInstance
                @Override // java.lang.Runnable
                public final void run() {
                    accessgetMContextp.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, f);
                }
            });
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(final String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: accessisPreview
            @Override // java.lang.Runnable
            public final void run() {
                accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, p0);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(accessgetMContextp accessgetmcontextp, float f) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        Iterator<T> it = accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (it.hasNext()) {
            ((setContext) it.next()).b(accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(), f);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(accessgetMContextp accessgetmcontextp) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        Iterator<T> it = accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (it.hasNext()) {
            ((setContext) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b());
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(accessgetMContextp accessgetmcontextp, String str) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (it.hasNext()) {
            ((setContext) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(), str);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(accessgetMContextp accessgetmcontextp, PlayerConstants.PlaybackQuality playbackQuality) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        Intrinsics.checkNotNullParameter(playbackQuality, "");
        Iterator<T> it = accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (it.hasNext()) {
            ((setContext) it.next()).TuitionPaymentFragmentbindingInflater1(accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(), playbackQuality);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(accessgetMContextp accessgetmcontextp, PlayerConstants.PlayerError playerError) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        Intrinsics.checkNotNullParameter(playerError, "");
        Iterator<T> it = accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (it.hasNext()) {
            ((setContext) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(), playerError);
        }
    }

    public static /* synthetic */ void b(accessgetMContextp accessgetmcontextp, float f) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        Iterator<T> it = accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (it.hasNext()) {
            ((setContext) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b());
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(accessgetMContextp accessgetmcontextp, float f) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        Iterator<T> it = accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (it.hasNext()) {
            ((setContext) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b());
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(accessgetMContextp accessgetmcontextp) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(accessgetMContextp accessgetmcontextp, PlayerConstants.PlayerState playerState) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        Intrinsics.checkNotNullParameter(playerState, "");
        Iterator<T> it = accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (it.hasNext()) {
            ((setContext) it.next()).b(accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(), playerState);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(accessgetMContextp accessgetmcontextp, PlayerConstants.PlaybackRate playbackRate) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        Intrinsics.checkNotNullParameter(playbackRate, "");
        Iterator<T> it = accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (it.hasNext()) {
            ((setContext) it.next()).b(accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(), playbackRate);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(accessgetMContextp accessgetmcontextp) {
        Intrinsics.checkNotNullParameter(accessgetmcontextp, "");
        Iterator<T> it = accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (it.hasNext()) {
            ((setContext) it.next()).TuitionPaymentFragmentbindingInflater1(accessgetmcontextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b());
        }
    }

    @JavascriptInterface
    public final void sendError(String p0) {
        final PlayerConstants.PlayerError playerError;
        Intrinsics.checkNotNullParameter(p0, "");
        if (StringsKt.equals(p0, ExifInterface.GPS_MEASUREMENT_2D, true)) {
            playerError = PlayerConstants.PlayerError.INVALID_PARAMETER_IN_REQUEST;
        } else if (StringsKt.equals(p0, "5", true)) {
            playerError = PlayerConstants.PlayerError.HTML_5_PLAYER;
        } else if (StringsKt.equals(p0, "100", true)) {
            playerError = PlayerConstants.PlayerError.VIDEO_NOT_FOUND;
        } else {
            playerError = (StringsKt.equals(p0, "101", true) || StringsKt.equals(p0, "150", true)) ? PlayerConstants.PlayerError.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER : PlayerConstants.PlayerError.UNKNOWN;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: configureInstanceInternal
            @Override // java.lang.Runnable
            public final void run() {
                accessgetMContextp.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, playerError);
            }
        });
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String p0) {
        final PlayerConstants.PlaybackQuality playbackQuality;
        Intrinsics.checkNotNullParameter(p0, "");
        if (StringsKt.equals(p0, "small", true)) {
            playbackQuality = PlayerConstants.PlaybackQuality.SMALL;
        } else if (StringsKt.equals(p0, "medium", true)) {
            playbackQuality = PlayerConstants.PlaybackQuality.MEDIUM;
        } else if (StringsKt.equals(p0, "large", true)) {
            playbackQuality = PlayerConstants.PlaybackQuality.LARGE;
        } else if (StringsKt.equals(p0, "hd720", true)) {
            playbackQuality = PlayerConstants.PlaybackQuality.HD720;
        } else if (StringsKt.equals(p0, "hd1080", true)) {
            playbackQuality = PlayerConstants.PlaybackQuality.HD1080;
        } else if (StringsKt.equals(p0, "highres", true)) {
            playbackQuality = PlayerConstants.PlaybackQuality.HIGH_RES;
        } else {
            playbackQuality = StringsKt.equals(p0, "default", true) ? PlayerConstants.PlaybackQuality.DEFAULT : PlayerConstants.PlaybackQuality.UNKNOWN;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: accessgetMLifecycleCameraRepositoryp
            @Override // java.lang.Runnable
            public final void run() {
                accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, playbackQuality);
            }
        });
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String p0) {
        final PlayerConstants.PlaybackRate playbackRate;
        Intrinsics.checkNotNullParameter(p0, "");
        if (StringsKt.equals(p0, "0.25", true)) {
            playbackRate = PlayerConstants.PlaybackRate.RATE_0_25;
        } else if (StringsKt.equals(p0, "0.5", true)) {
            playbackRate = PlayerConstants.PlaybackRate.RATE_0_5;
        } else if (StringsKt.equals(p0, "0.75", true)) {
            playbackRate = PlayerConstants.PlaybackRate.RATE_0_75;
        } else if (StringsKt.equals(p0, "1", true)) {
            playbackRate = PlayerConstants.PlaybackRate.RATE_1;
        } else if (StringsKt.equals(p0, "1.25", true)) {
            playbackRate = PlayerConstants.PlaybackRate.RATE_1_25;
        } else if (StringsKt.equals(p0, "1.5", true)) {
            playbackRate = PlayerConstants.PlaybackRate.RATE_1_5;
        } else if (StringsKt.equals(p0, "1.75", true)) {
            playbackRate = PlayerConstants.PlaybackRate.RATE_1_75;
        } else {
            playbackRate = StringsKt.equals(p0, ExifInterface.GPS_MEASUREMENT_2D, true) ? PlayerConstants.PlaybackRate.RATE_2 : PlayerConstants.PlaybackRate.UNKNOWN;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: accesssetActiveConcurrentCameraInfos
            @Override // java.lang.Runnable
            public final void run() {
                accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, playbackRate);
            }
        });
    }

    @JavascriptInterface
    public final void sendStateChange(String p0) {
        final PlayerConstants.PlayerState playerState;
        Intrinsics.checkNotNullParameter(p0, "");
        if (StringsKt.equals(p0, "UNSTARTED", true)) {
            playerState = PlayerConstants.PlayerState.UNSTARTED;
        } else if (StringsKt.equals(p0, "ENDED", true)) {
            playerState = PlayerConstants.PlayerState.ENDED;
        } else if (StringsKt.equals(p0, "PLAYING", true)) {
            playerState = PlayerConstants.PlayerState.PLAYING;
        } else if (StringsKt.equals(p0, "PAUSED", true)) {
            playerState = PlayerConstants.PlayerState.PAUSED;
        } else if (StringsKt.equals(p0, "BUFFERING", true)) {
            playerState = PlayerConstants.PlayerState.BUFFERING;
        } else {
            playerState = StringsKt.equals(p0, "CUED", true) ? PlayerConstants.PlayerState.VIDEO_CUED : PlayerConstants.PlayerState.UNKNOWN;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: accessgetMCameraXConfigProviderp
            @Override // java.lang.Runnable
            public final void run() {
                accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, playerState);
            }
        });
    }
}
