package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class setShuffleModeEnabledRemoved implements binderDied.b, getMediaController, unregisterCallbackListener {
    protected final fromMediaSession TuitionPaymentFragmentbindingInflater1;
    final Paint TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final binderDied<?, Float> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private binderDied<ColorFilter, ColorFilter> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f1387a;
    private final prepare asInterface;
    private final List<binderDied<?, Float>> b;
    private final binderDied<?, Float> cancelAll;
    private final binderDied<?, Integer> d;
    private final PathMeasure notify = new PathMeasure();
    private final Path g = new Path();
    private final Path INotificationSideChannel = new Path();
    private final RectF cancel = new RectF();
    private final List<TuitionPaymentFragmentbindingInflater1> asBinder = new ArrayList();

    setShuffleModeEnabledRemoved(prepare prepareVar, fromMediaSession frommediasession, Paint.Cap cap, Paint.Join join, float f, setRating setrating, getVolumeControl getvolumecontrol, List<getVolumeControl> list, getVolumeControl getvolumecontrol2) {
        setVolumeTo setvolumeto = new setVolumeTo(1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setvolumeto;
        this.asInterface = prepareVar;
        this.TuitionPaymentFragmentbindingInflater1 = frommediasession;
        setvolumeto.setStyle(Paint.Style.STROKE);
        setvolumeto.setStrokeCap(cap);
        setvolumeto.setStrokeJoin(join);
        setvolumeto.setStrokeMiter(f);
        this.d = setrating.TuitionPaymentFragmentbindingInflater1();
        this.cancelAll = getvolumecontrol.TuitionPaymentFragmentbindingInflater1();
        if (getvolumecontrol2 == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getvolumecontrol2.TuitionPaymentFragmentbindingInflater1();
        }
        this.b = new ArrayList(list.size());
        this.f1387a = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.b.add(list.get(i).TuitionPaymentFragmentbindingInflater1());
        }
        binderDied<?, Integer> binderdied = this.d;
        if (binderdied != null) {
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied);
        }
        binderDied<?, Float> binderdied2 = this.cancelAll;
        if (binderdied2 != null) {
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            binderDied<?, Float> binderdied3 = this.b.get(i2);
            if (binderdied3 != null) {
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied3);
            }
        }
        binderDied<?, Float> binderdied4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (binderdied4 != null && binderdied4 != null) {
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied4);
        }
        this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.b.get(i3).TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        }
        binderDied<?, Float> binderdied5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (binderdied5 != null) {
            binderdied5.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        }
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.asInterface.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[SYNTHETIC] */
    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = null;
        isSessionReady issessionready = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            setRepeatMode setrepeatmode = list.get(size);
            if (setrepeatmode instanceof isSessionReady) {
                isSessionReady issessionready2 = (isSessionReady) setrepeatmode;
                if (issessionready2.g == ShapeTrimPath.Type.INDIVIDUALLY) {
                    issessionready = issessionready2;
                }
            }
        }
        if (issessionready != null) {
            issessionready.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            setRepeatMode setrepeatmode2 = list2.get(size2);
            byte b = 0;
            if (setrepeatmode2 instanceof isSessionReady) {
                isSessionReady issessionready3 = (isSessionReady) setrepeatmode2;
                if (issessionready3.g == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (tuitionPaymentFragmentbindingInflater1 != null) {
                        this.asBinder.add(tuitionPaymentFragmentbindingInflater1);
                    }
                    TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new TuitionPaymentFragmentbindingInflater1(issessionready3, b);
                    issessionready3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
                    tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater2;
                } else if (!(setrepeatmode2 instanceof getPlaybackInfo)) {
                    if (tuitionPaymentFragmentbindingInflater1 == null) {
                        tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(issessionready, b);
                    }
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add((getPlaybackInfo) setrepeatmode2);
                }
            } else if (!(setrepeatmode2 instanceof getPlaybackInfo)) {
                if (tuitionPaymentFragmentbindingInflater1 == null) {
                    tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(issessionready, b);
                }
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add((getPlaybackInfo) setrepeatmode2);
            }
        }
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            this.asBinder.add(tuitionPaymentFragmentbindingInflater1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01d3  */
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, Matrix matrix, int i) {
        float f;
        float f2;
        float fMin;
        if (!onSkipToPrevious.b(matrix)) {
            float f3 = 100.0f;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setAlpha(onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) ((((i / 255.0f) * ((unregisterCallback) this.d).d()) / 100.0f) * 255.0f)));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setStrokeWidth(((onAudioInfoChanged) this.cancelAll).d() * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(matrix));
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getStrokeWidth() <= 0.0f) {
                int i2 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i2 > 0) {
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i2 - 1;
                    return;
                }
                return;
            }
            float f4 = 1.0f;
            if (!this.b.isEmpty()) {
                float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(matrix);
                for (int i3 = 0; i3 < this.b.size(); i3++) {
                    this.f1387a[i3] = this.b.get(i3).asInterface().floatValue();
                    if (i3 % 2 == 0) {
                        float[] fArr = this.f1387a;
                        if (fArr[i3] < 1.0f) {
                            fArr[i3] = 1.0f;
                        }
                    } else {
                        float[] fArr2 = this.f1387a;
                        if (fArr2[i3] < 0.1f) {
                            fArr2[i3] = 0.1f;
                        }
                    }
                    float[] fArr3 = this.f1387a;
                    fArr3[i3] = fArr3[i3] * fTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                binderDied<?, Float> binderdied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setPathEffect(new DashPathEffect(this.f1387a, binderdied == null ? 0.0f : fTuitionPaymentFragmentspecialinlinedviewModeldefault2 * binderdied.asInterface().floatValue()));
                int i4 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i4 > 0) {
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i4 - 1;
                }
            } else {
                int i5 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i5 > 0) {
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i5 - 1;
                }
            }
            binderDied<ColorFilter, ColorFilter> binderdied2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (binderdied2 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setColorFilter(binderdied2.asInterface());
            }
            int i6 = 0;
            while (i6 < this.asBinder.size()) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.asBinder.get(i6);
                if (tuitionPaymentFragmentbindingInflater1.b == null) {
                    this.g.reset();
                    for (int size = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1; size >= 0; size--) {
                        this.g.addPath(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(size).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), matrix);
                    }
                    int i7 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                    if (i7 > 0) {
                        prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i7 - 1;
                    }
                    canvas.drawPath(this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i8 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                    if (i8 > 0) {
                        prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i8 - 1;
                    }
                } else if (tuitionPaymentFragmentbindingInflater1.b != null) {
                    this.g.reset();
                    for (int size2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1; size2 >= 0; size2--) {
                        this.g.addPath(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(size2).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), matrix);
                    }
                    this.notify.setPath(this.g, false);
                    float length = this.notify.getLength();
                    while (this.notify.nextContour()) {
                        length += this.notify.getLength();
                    }
                    float fFloatValue = (tuitionPaymentFragmentbindingInflater1.b.b.asInterface().floatValue() * length) / 360.0f;
                    float fFloatValue2 = ((tuitionPaymentFragmentbindingInflater1.b.TuitionPaymentFragmentbindingInflater1.asInterface().floatValue() * length) / f3) + fFloatValue;
                    float fFloatValue3 = ((tuitionPaymentFragmentbindingInflater1.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface().floatValue() * length) / f3) + fFloatValue;
                    int size3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1;
                    float f5 = 0.0f;
                    while (size3 >= 0) {
                        this.INotificationSideChannel.set(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(size3).TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                        this.INotificationSideChannel.transform(matrix);
                        this.notify.setPath(this.INotificationSideChannel, false);
                        float length2 = this.notify.getLength();
                        if (fFloatValue3 > length) {
                            float f6 = fFloatValue3 - length;
                            if (f6 >= f5 + length2 || f5 >= f6) {
                                f = f5 + length2;
                                if (f < fFloatValue2 && f5 <= fFloatValue3) {
                                    if (f > fFloatValue3 || fFloatValue2 >= f5) {
                                        f2 = fFloatValue2 < f5 ? 0.0f : (fFloatValue2 - f5) / length2;
                                        fMin = fFloatValue3 <= f ? (fFloatValue3 - f5) / length2 : f4;
                                    } else {
                                        canvas.drawPath(this.INotificationSideChannel, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    }
                                }
                            } else {
                                f2 = fFloatValue2 > length ? (fFloatValue2 - length) / length2 : 0.0f;
                                fMin = Math.min(f6 / length2, f4);
                            }
                            onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannel, f2, fMin, 0.0f);
                            canvas.drawPath(this.INotificationSideChannel, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        } else {
                            f = f5 + length2;
                            if (f < fFloatValue2) {
                            }
                        }
                        f5 += length2;
                        size3--;
                        f4 = 1.0f;
                    }
                    int i9 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                    if (i9 > 0) {
                        prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i9 - 1;
                    }
                } else {
                    int i10 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                    if (i10 > 0) {
                        prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i10 - 1;
                    }
                }
                i6++;
                f3 = 100.0f;
                f4 = 1.0f;
            }
            int i11 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i11 > 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i11 - 1;
                return;
            }
            return;
        }
        int i12 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i12 > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i12 - 1;
        }
    }

    @Override // defpackage.unregisterCallbackListener
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        this.g.reset();
        for (int i = 0; i < this.asBinder.size(); i++) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.asBinder.get(i);
            for (int i2 = 0; i2 < tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size(); i2++) {
                this.g.addPath(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i2).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), matrix);
            }
        }
        this.g.computeBounds(this.cancel, false);
        float fD = ((onAudioInfoChanged) this.cancelAll).d();
        RectF rectF2 = this.cancel;
        float f = fD / 2.0f;
        rectF2.set(rectF2.left - f, this.cancel.top - f, this.cancel.right + f, this.cancel.bottom + f);
        rectF.set(this.cancel);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        int i3 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i3 > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i3 - 1;
        }
    }

    @Override // defpackage.getAudioStream
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaControllerCompatPlaybackInfo, i, list, mediaControllerCompatPlaybackInfo2, this);
    }

    public <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        if (t == registerCallbackListener.asBinder) {
            this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.INotificationSideChannelStub) {
            this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.TuitionPaymentFragmentbindingInflater1) {
            binderDied<ColorFilter, ColorFilter> binderdied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (binderdied != null) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(binderdied);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = processpendingcallbackslocked;
            processpendingcallbackslocked.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            fromMediaSession frommediasession = this.TuitionPaymentFragmentbindingInflater1;
            binderDied<ColorFilter, ColorFilter> binderdied2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (binderdied2 != null) {
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
            }
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 {
        final List<getPlaybackInfo> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final isSessionReady b;

        /* synthetic */ TuitionPaymentFragmentbindingInflater1(isSessionReady issessionready, byte b) {
            this(issessionready);
        }

        private TuitionPaymentFragmentbindingInflater1(isSessionReady issessionready) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
            this.b = issessionready;
        }
    }
}
