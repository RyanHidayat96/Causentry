package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaControllerCompat implements unregisterCallbackListener, binderDied.b, getMediaController {
    private final boolean TuitionPaymentFragmentbindingInflater1;
    private final fromMediaSession TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final binderDied<Integer, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private binderDied<ColorFilter, ColorFilter> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final binderDied<Integer, Integer> f173a;
    private final String asBinder;
    private final Path asInterface;
    private final prepare b;
    private final List<getPlaybackInfo> d;
    private final Paint g;

    public MediaControllerCompat(prepare prepareVar, fromMediaSession frommediasession, MediaControllerCompatApi24TransportControls mediaControllerCompatApi24TransportControls) {
        Path path = new Path();
        this.asInterface = path;
        this.g = new setVolumeTo(1);
        this.d = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = frommediasession;
        this.asBinder = mediaControllerCompatApi24TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentbindingInflater1 = mediaControllerCompatApi24TransportControls.b;
        this.b = prepareVar;
        if (mediaControllerCompatApi24TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || mediaControllerCompatApi24TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            this.f173a = null;
            return;
        }
        path.setFillType(mediaControllerCompatApi24TransportControls.TuitionPaymentFragmentbindingInflater1);
        binderDied<Integer, Integer> binderdiedTuitionPaymentFragmentbindingInflater1 = mediaControllerCompatApi24TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = binderdiedTuitionPaymentFragmentbindingInflater1;
        binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
        binderDied<Integer, Integer> binderdiedTuitionPaymentFragmentbindingInflater2 = mediaControllerCompatApi24TransportControls.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        this.f173a = binderdiedTuitionPaymentFragmentbindingInflater2;
        binderdiedTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater2);
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.b.invalidateSelf();
    }

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        for (int i = 0; i < list2.size(); i++) {
            setRepeatMode setrepeatmode = list2.get(i);
            if (setrepeatmode instanceof getPlaybackInfo) {
                this.d.add((getPlaybackInfo) setrepeatmode);
            }
        }
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.asBinder;
    }

    @Override // defpackage.unregisterCallbackListener
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, Matrix matrix, int i) {
        if (this.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        this.g.setColor(((getIControllerCallback) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).g());
        this.g.setAlpha(onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) ((((i / 255.0f) * this.f173a.asInterface().intValue()) / 100.0f) * 255.0f)));
        binderDied<ColorFilter, ColorFilter> binderdied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (binderdied != null) {
            this.g.setColorFilter(binderdied.asInterface());
        }
        this.asInterface.reset();
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            this.asInterface.addPath(this.d.get(i2).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), matrix);
        }
        canvas.drawPath(this.asInterface, this.g);
        int i3 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i3 > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i3 - 1;
        }
    }

    @Override // defpackage.unregisterCallbackListener
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        this.asInterface.reset();
        for (int i = 0; i < this.d.size(); i++) {
            this.asInterface.addPath(this.d.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), matrix);
        }
        this.asInterface.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.getAudioStream
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaControllerCompatPlaybackInfo, i, list, mediaControllerCompatPlaybackInfo2, this);
    }

    @Override // defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        if (t == registerCallbackListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.asBinder) {
            this.f173a.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.TuitionPaymentFragmentbindingInflater1) {
            binderDied<ColorFilter, ColorFilter> binderdied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (binderdied != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(binderdied);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = processpendingcallbackslocked;
            processpendingcallbackslocked.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            fromMediaSession frommediasession = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            binderDied<ColorFilter, ColorFilter> binderdied2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (binderdied2 != null) {
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
            }
        }
    }
}
