package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
public final class getSessionActivity implements unregisterCallbackListener, getPlaybackInfo, setMediaController, binderDied.b, getMediaController {
    private final fromMediaSession TuitionPaymentFragmentbindingInflater1;
    private final binderDied<Float, Float> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final prepare TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final binderDied<Float, Float> f978a;
    private final String asInterface;
    private skipToQueueItem b;
    private final MediaControllerCompatCallbackStubCompat d;
    private final Matrix g = new Matrix();
    private final Path asBinder = new Path();

    public getSessionActivity(prepare prepareVar, fromMediaSession frommediasession, MediaControllerCompatApi24 mediaControllerCompatApi24) throws Throwable {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = prepareVar;
        this.TuitionPaymentFragmentbindingInflater1 = frommediasession;
        this.asInterface = mediaControllerCompatApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaControllerCompatApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater1 = mediaControllerCompatApi24.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = binderdiedTuitionPaymentFragmentbindingInflater1;
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
        binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater2 = mediaControllerCompatApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        this.f978a = binderdiedTuitionPaymentFragmentbindingInflater2;
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater2);
        binderdiedTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        MediaControllerCompatCallbackStubCompat mediaControllerCompatCallbackStubCompat = new MediaControllerCompatCallbackStubCompat(mediaControllerCompatApi24.b);
        this.d = mediaControllerCompatCallbackStubCompat;
        mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(frommediasession);
        mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentbindingInflater1(this);
    }

    @Override // defpackage.setMediaController
    public final void b(ListIterator<setRepeatMode> listIterator) {
        if (this.b != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.b = new skipToQueueItem(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, "Repeater", this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, arrayList, null);
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.asInterface;
    }

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(list, list2);
    }

    @Override // defpackage.getPlaybackInfo
    public final Path TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Path pathTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.asBinder.reset();
        float fFloatValue = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface().floatValue();
        float fFloatValue2 = this.f978a.asInterface().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.g.set(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i + fFloatValue2));
            this.asBinder.addPath(pathTuitionPaymentFragmentspecialinlinedviewModeldefault2, this.g);
        }
        return this.asBinder;
    }

    @Override // defpackage.unregisterCallbackListener
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface().floatValue();
        float fFloatValue2 = this.f978a.asInterface().floatValue();
        float fFloatValue3 = this.d.asInterface.asInterface().floatValue() / 100.0f;
        float fFloatValue4 = this.d.b.asInterface().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.g.set(matrix);
            float f = i2;
            this.g.preConcat(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(f + fFloatValue2));
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, this.g, (int) (i * onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // defpackage.unregisterCallbackListener
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        this.b.b(rectF, matrix, z);
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invalidateSelf();
    }

    @Override // defpackage.getAudioStream
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaControllerCompatPlaybackInfo, i, list, mediaControllerCompatPlaybackInfo2, this);
    }

    @Override // defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        if (this.d.TuitionPaymentFragmentbindingInflater1(t, mediaSessionCompatCallbackCallbackHandler)) {
            return;
        }
        if (t == registerCallbackListener.cancel) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
        } else if (t == registerCallbackListener.getInterfaceDescriptor) {
            this.f978a.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
        }
    }
}
