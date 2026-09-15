package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getMediaSession extends fromMediaSession {
    private final skipToQueueItem asBinder;

    getMediaSession(prepare prepareVar, Layer layer) {
        super(prepareVar, layer);
        skipToQueueItem skiptoqueueitem = new skipToQueueItem(prepareVar, this, new MediaSessionCompat("__container", layer.cancel, false));
        this.asBinder = skiptoqueueitem;
        skiptoqueueitem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.fromMediaSession
    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Canvas canvas, Matrix matrix, int i) {
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, matrix, i);
    }

    @Override // defpackage.fromMediaSession, defpackage.unregisterCallbackListener
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        this.asBinder.b(rectF, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, z);
    }

    @Override // defpackage.fromMediaSession
    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaControllerCompatPlaybackInfo, i, list, mediaControllerCompatPlaybackInfo2);
    }
}
