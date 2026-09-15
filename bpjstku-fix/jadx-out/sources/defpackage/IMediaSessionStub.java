package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class IMediaSessionStub implements getPlaybackInfo, binderDied.b, getMediaController {
    private final prepare TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final binderDied<?, PointF> f149a;
    private final MediaControllerCompatApi21TransportControls b;
    private final binderDied<?, PointF> d;
    private final Path TuitionPaymentFragmentbindingInflater1 = new Path();
    private setShuffleMode asInterface = new setShuffleMode();

    public IMediaSessionStub(prepare prepareVar, fromMediaSession frommediasession, MediaControllerCompatApi21TransportControls mediaControllerCompatApi21TransportControls) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaControllerCompatApi21TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = prepareVar;
        binderDied<PointF, PointF> binderdiedTuitionPaymentFragmentbindingInflater1 = mediaControllerCompatApi21TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
        this.d = binderdiedTuitionPaymentFragmentbindingInflater1;
        binderDied<PointF, PointF> binderdiedTuitionPaymentFragmentbindingInflater2 = mediaControllerCompatApi21TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        this.f149a = binderdiedTuitionPaymentFragmentbindingInflater2;
        this.b = mediaControllerCompatApi21TransportControls;
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater2);
        binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderdiedTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
    }

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        for (int i = 0; i < list.size(); i++) {
            setRepeatMode setrepeatmode = list.get(i);
            if (setrepeatmode instanceof isSessionReady) {
                isSessionReady issessionready = (isSessionReady) setrepeatmode;
                if (issessionready.g == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(issessionready);
                    issessionready.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
                }
            }
        }
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.getPlaybackInfo
    public final Path TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        this.TuitionPaymentFragmentbindingInflater1.reset();
        if (this.b.b) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        PointF pointFAsInterface = this.d.asInterface();
        float f = pointFAsInterface.x / 2.0f;
        float f2 = pointFAsInterface.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.TuitionPaymentFragmentbindingInflater1.reset();
        if (this.b.TuitionPaymentFragmentbindingInflater1) {
            float f5 = -f2;
            this.TuitionPaymentFragmentbindingInflater1.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.TuitionPaymentFragmentbindingInflater1.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.TuitionPaymentFragmentbindingInflater1.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.TuitionPaymentFragmentbindingInflater1.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.TuitionPaymentFragmentbindingInflater1.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.TuitionPaymentFragmentbindingInflater1.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.TuitionPaymentFragmentbindingInflater1.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.TuitionPaymentFragmentbindingInflater1.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.TuitionPaymentFragmentbindingInflater1.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.TuitionPaymentFragmentbindingInflater1.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFAsInterface2 = this.f149a.asInterface();
        this.TuitionPaymentFragmentbindingInflater1.offset(pointFAsInterface2.x, pointFAsInterface2.y);
        this.TuitionPaymentFragmentbindingInflater1.close();
        this.asInterface.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.getAudioStream
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaControllerCompatPlaybackInfo, i, list, mediaControllerCompatPlaybackInfo2, this);
    }

    @Override // defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        if (t == registerCallbackListener.b) {
            this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
        } else if (t == registerCallbackListener.onTransact) {
            this.f149a.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
        }
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invalidateSelf();
    }
}
