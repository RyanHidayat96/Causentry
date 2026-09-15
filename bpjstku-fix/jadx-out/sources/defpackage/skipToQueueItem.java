package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class skipToQueueItem implements unregisterCallbackListener, getPlaybackInfo, binderDied.b, getAudioStream {
    private final prepare TuitionPaymentFragmentbindingInflater1;
    MediaControllerCompatCallbackStubCompat TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final Matrix TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final List<setRepeatMode> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f1405a;
    private RectF asBinder;
    private final String asInterface;
    private final boolean b;
    private List<getPlaybackInfo> d;
    private final Path g;
    private final RectF onTransact;

    private static List<setRepeatMode> TuitionPaymentFragmentspecialinlinedviewModeldefault3(prepare prepareVar, fromMediaSession frommediasession, List<toLegacyStreamType> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            setRepeatMode setrepeatmodeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = list.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepareVar, frommediasession);
            if (setrepeatmodeTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                arrayList.add(setrepeatmodeTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        return arrayList;
    }

    private static createCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<toLegacyStreamType> list) {
        for (int i = 0; i < list.size(); i++) {
            toLegacyStreamType tolegacystreamtype = list.get(i);
            if (tolegacystreamtype instanceof createCallback) {
                return (createCallback) tolegacystreamtype;
            }
        }
        return null;
    }

    skipToQueueItem(prepare prepareVar, fromMediaSession frommediasession, String str, boolean z, List<setRepeatMode> list, createCallback createcallback) {
        this.f1405a = new setVolumeTo();
        this.asBinder = new RectF();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Matrix();
        this.g = new Path();
        this.onTransact = new RectF();
        this.asInterface = str;
        this.TuitionPaymentFragmentbindingInflater1 = prepareVar;
        this.b = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        if (createcallback != null) {
            MediaControllerCompatCallbackStubCompat mediaControllerCompatCallbackStubCompat = new MediaControllerCompatCallbackStubCompat(createcallback);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaControllerCompatCallbackStubCompat;
            mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(frommediasession);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            setRepeatMode setrepeatmode = list.get(size);
            if (setrepeatmode instanceof setMediaController) {
                arrayList.add((setMediaController) setrepeatmode);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((setMediaController) arrayList.get(size2)).b(list.listIterator(list.size()));
        }
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentbindingInflater1.invalidateSelf();
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.asInterface;
    }

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size());
        arrayList.addAll(list);
        for (int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1; size >= 0; size--) {
            setRepeatMode setrepeatmode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(size);
            setrepeatmode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subList(0, size));
            arrayList.add(setrepeatmode);
        }
    }

    final List<getPlaybackInfo> TuitionPaymentFragmentbindingInflater1() {
        if (this.d == null) {
            this.d = new ArrayList();
            for (int i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size(); i++) {
                setRepeatMode setrepeatmode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i);
                if (setrepeatmode instanceof getPlaybackInfo) {
                    this.d.add((getPlaybackInfo) setrepeatmode);
                }
            }
        }
        return this.d;
    }

    @Override // defpackage.getPlaybackInfo
    public final Path TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.reset();
        MediaControllerCompatCallbackStubCompat mediaControllerCompatCallbackStubCompat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (mediaControllerCompatCallbackStubCompat != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        this.g.reset();
        if (this.b) {
            return this.g;
        }
        for (int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1; size >= 0; size--) {
            setRepeatMode setrepeatmode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(size);
            if (setrepeatmode instanceof getPlaybackInfo) {
                this.g.addPath(((getPlaybackInfo) setrepeatmode).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        return this.g;
    }

    @Override // defpackage.unregisterCallbackListener
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, Matrix matrix, int i) {
        if (this.b) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(matrix);
        MediaControllerCompatCallbackStubCompat mediaControllerCompatCallbackStubCompat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (mediaControllerCompatCallbackStubCompat != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.preConcat(mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            i = (int) (((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1() == null ? 100 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1().asInterface().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = false;
        if (this.TuitionPaymentFragmentbindingInflater1.f1323a) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size(); i3++) {
                if ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i3) instanceof unregisterCallbackListener) && (i2 = i2 + 1) >= 2) {
                    if (i == 255) {
                        break;
                    }
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.asBinder.set(0.0f, 0.0f, 0.0f, 0.0f);
            b(this.asBinder, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, true);
            this.f1405a.setAlpha(i);
            onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.asBinder, this.f1405a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1; size >= 0; size--) {
            setRepeatMode setrepeatmode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(size);
            if (setrepeatmode instanceof unregisterCallbackListener) {
                ((unregisterCallbackListener) setrepeatmode).TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // defpackage.unregisterCallbackListener
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(matrix);
        MediaControllerCompatCallbackStubCompat mediaControllerCompatCallbackStubCompat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (mediaControllerCompatCallbackStubCompat != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.preConcat(mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        this.onTransact.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1; size >= 0; size--) {
            setRepeatMode setrepeatmode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(size);
            if (setrepeatmode instanceof unregisterCallbackListener) {
                ((unregisterCallbackListener) setrepeatmode).b(this.onTransact, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, z);
                rectF.union(this.onTransact);
            }
        }
    }

    @Override // defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        MediaControllerCompatCallbackStubCompat mediaControllerCompatCallbackStubCompat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (mediaControllerCompatCallbackStubCompat != null) {
            mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentbindingInflater1(t, mediaSessionCompatCallbackCallbackHandler);
        }
    }

    public skipToQueueItem(prepare prepareVar, fromMediaSession frommediasession, MediaSessionCompat mediaSessionCompat) {
        this(prepareVar, frommediasession, mediaSessionCompat.TuitionPaymentFragmentbindingInflater1, mediaSessionCompat.b, TuitionPaymentFragmentspecialinlinedviewModeldefault3(prepareVar, frommediasession, mediaSessionCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1), TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    @Override // defpackage.getAudioStream
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        if (mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asInterface, i)) {
            if (!"__container".equals(this.asInterface)) {
                String str = this.asInterface;
                MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo3 = new MediaControllerCompatPlaybackInfo(mediaControllerCompatPlaybackInfo2);
                mediaControllerCompatPlaybackInfo3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(str);
                if (mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asInterface, i)) {
                    MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo4 = new MediaControllerCompatPlaybackInfo(mediaControllerCompatPlaybackInfo3);
                    mediaControllerCompatPlaybackInfo4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this;
                    list.add(mediaControllerCompatPlaybackInfo4);
                }
                mediaControllerCompatPlaybackInfo2 = mediaControllerCompatPlaybackInfo3;
            }
            if (mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentbindingInflater1(this.asInterface, i)) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface, i);
                for (int i2 = 0; i2 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size(); i2++) {
                    setRepeatMode setrepeatmode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i2);
                    if (setrepeatmode instanceof getAudioStream) {
                        ((getAudioStream) setrepeatmode).TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaControllerCompatPlaybackInfo, i + iTuitionPaymentFragmentspecialinlinedviewModeldefault3, list, mediaControllerCompatPlaybackInfo2);
                    }
                }
            }
        }
    }
}
