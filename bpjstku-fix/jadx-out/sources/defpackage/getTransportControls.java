package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class getTransportControls implements binderDied.b, getMediaController, getPlaybackInfo {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private final binderDied<?, Float> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final binderDied<?, PointF> f999a;
    private final binderDied<?, PointF> asInterface;
    private final prepare b;
    private final Path g = new Path();
    private final RectF d = new RectF();
    private setShuffleMode asBinder = new setShuffleMode();

    public getTransportControls(prepare prepareVar, fromMediaSession frommediasession, MediaControllerCompatApi23TransportControls mediaControllerCompatApi23TransportControls) throws Throwable {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaControllerCompatApi23TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaControllerCompatApi23TransportControls.b;
        this.b = prepareVar;
        binderDied<PointF, PointF> binderdiedTuitionPaymentFragmentbindingInflater1 = mediaControllerCompatApi23TransportControls.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        this.f999a = binderdiedTuitionPaymentFragmentbindingInflater1;
        binderDied<PointF, PointF> binderdiedTuitionPaymentFragmentbindingInflater2 = mediaControllerCompatApi23TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
        this.asInterface = binderdiedTuitionPaymentFragmentbindingInflater2;
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater3 = mediaControllerCompatApi23TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = binderdiedTuitionPaymentFragmentbindingInflater3;
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater2);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater3);
        binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderdiedTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderdiedTuitionPaymentFragmentbindingInflater3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        for (int i = 0; i < list.size(); i++) {
            setRepeatMode setrepeatmode = list.get(i);
            if (setrepeatmode instanceof isSessionReady) {
                isSessionReady issessionready = (isSessionReady) setrepeatmode;
                if (issessionready.g == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(issessionready);
                    issessionready.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
                }
            }
        }
    }

    @Override // defpackage.getPlaybackInfo
    public final Path TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (this.TuitionPaymentFragmentbindingInflater1) {
            return this.g;
        }
        this.g.reset();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentbindingInflater1 = true;
            return this.g;
        }
        PointF pointFAsInterface = this.asInterface.asInterface();
        float f = pointFAsInterface.x / 2.0f;
        float f2 = pointFAsInterface.y / 2.0f;
        binderDied<?, Float> binderdied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float fD = binderdied == null ? 0.0f : ((onAudioInfoChanged) binderdied).d();
        float fMin = Math.min(f, f2);
        if (fD > fMin) {
            fD = fMin;
        }
        PointF pointFAsInterface2 = this.f999a.asInterface();
        this.g.moveTo(pointFAsInterface2.x + f, (pointFAsInterface2.y - f2) + fD);
        this.g.lineTo(pointFAsInterface2.x + f, (pointFAsInterface2.y + f2) - fD);
        if (fD > 0.0f) {
            float f3 = fD * 2.0f;
            this.d.set((pointFAsInterface2.x + f) - f3, (pointFAsInterface2.y + f2) - f3, pointFAsInterface2.x + f, pointFAsInterface2.y + f2);
            this.g.arcTo(this.d, 0.0f, 90.0f, false);
        }
        this.g.lineTo((pointFAsInterface2.x - f) + fD, pointFAsInterface2.y + f2);
        if (fD > 0.0f) {
            float f4 = fD * 2.0f;
            this.d.set(pointFAsInterface2.x - f, (pointFAsInterface2.y + f2) - f4, (pointFAsInterface2.x - f) + f4, pointFAsInterface2.y + f2);
            this.g.arcTo(this.d, 90.0f, 90.0f, false);
        }
        this.g.lineTo(pointFAsInterface2.x - f, (pointFAsInterface2.y - f2) + fD);
        if (fD > 0.0f) {
            float f5 = fD * 2.0f;
            this.d.set(pointFAsInterface2.x - f, pointFAsInterface2.y - f2, (pointFAsInterface2.x - f) + f5, (pointFAsInterface2.y - f2) + f5);
            this.g.arcTo(this.d, 180.0f, 90.0f, false);
        }
        this.g.lineTo((pointFAsInterface2.x + f) - fD, pointFAsInterface2.y - f2);
        if (fD > 0.0f) {
            float f6 = fD * 2.0f;
            this.d.set((pointFAsInterface2.x + f) - f6, pointFAsInterface2.y - f2, pointFAsInterface2.x + f, (pointFAsInterface2.y - f2) + f6);
            this.g.arcTo(this.d, 270.0f, 90.0f, false);
        }
        this.g.close();
        this.asBinder.TuitionPaymentFragmentbindingInflater1(this.g);
        this.TuitionPaymentFragmentbindingInflater1 = true;
        return this.g;
    }

    @Override // defpackage.getAudioStream
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaControllerCompatPlaybackInfo, i, list, mediaControllerCompatPlaybackInfo2, this);
    }

    @Override // defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        if (t == registerCallbackListener.notify) {
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
        } else if (t == registerCallbackListener.onTransact) {
            this.f999a.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
        } else if (t == registerCallbackListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
        }
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentbindingInflater1 = false;
        this.b.invalidateSelf();
    }
}
