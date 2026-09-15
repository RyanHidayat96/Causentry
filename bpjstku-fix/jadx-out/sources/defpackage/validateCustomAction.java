package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class validateCustomAction implements getPlaybackInfo, binderDied.b, getMediaController {
    private final binderDied<?, PointF> INotificationSideChannel;
    private final binderDied<?, Float> TuitionPaymentFragmentbindingInflater1;
    private final prepare TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final binderDied<?, Float> f1425a;
    private final binderDied<?, Float> asInterface;
    private final binderDied<?, Float> b;
    private final binderDied<?, Float> cancel;
    private final String d;
    private final binderDied<?, Float> g;
    private final PolystarShape.Type notify;
    private final Path asBinder = new Path();
    private setShuffleMode cancelAll = new setShuffleMode();

    public validateCustomAction(prepare prepareVar, fromMediaSession frommediasession, PolystarShape polystarShape) throws Throwable {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = prepareVar;
        this.d = polystarShape.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        PolystarShape.Type type = polystarShape.asInterface;
        this.notify = type;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = polystarShape.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater1 = polystarShape.g.TuitionPaymentFragmentbindingInflater1();
        this.asInterface = binderdiedTuitionPaymentFragmentbindingInflater1;
        binderDied<PointF, PointF> binderdiedTuitionPaymentFragmentbindingInflater2 = polystarShape.f363a.TuitionPaymentFragmentbindingInflater1();
        this.INotificationSideChannel = binderdiedTuitionPaymentFragmentbindingInflater2;
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater3 = polystarShape.d.TuitionPaymentFragmentbindingInflater1();
        this.cancel = binderdiedTuitionPaymentFragmentbindingInflater3;
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater4 = polystarShape.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        this.g = binderdiedTuitionPaymentFragmentbindingInflater4;
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater5 = polystarShape.asBinder.TuitionPaymentFragmentbindingInflater1();
        this.f1425a = binderdiedTuitionPaymentFragmentbindingInflater5;
        if (type == PolystarShape.Type.STAR) {
            this.b = polystarShape.b.TuitionPaymentFragmentbindingInflater1();
            this.TuitionPaymentFragmentbindingInflater1 = polystarShape.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        } else {
            this.b = null;
            this.TuitionPaymentFragmentbindingInflater1 = null;
        }
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater2);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater3);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater4);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater5);
        if (type == PolystarShape.Type.STAR) {
            binderDied<?, Float> binderdied = this.b;
            if (binderdied != null) {
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied);
            }
            binderDied<?, Float> binderdied2 = this.TuitionPaymentFragmentbindingInflater1;
            if (binderdied2 != null) {
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
            }
        }
        binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderdiedTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderdiedTuitionPaymentFragmentbindingInflater3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderdiedTuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderdiedTuitionPaymentFragmentbindingInflater5.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        if (type == PolystarShape.Type.STAR) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        }
    }

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        for (int i = 0; i < list.size(); i++) {
            setRepeatMode setrepeatmode = list.get(i);
            if (setrepeatmode instanceof isSessionReady) {
                isSessionReady issessionready = (isSessionReady) setrepeatmode;
                if (issessionready.g == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(issessionready);
                    issessionready.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
                }
            }
        }
    }

    @Override // defpackage.getPlaybackInfo
    public final Path TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        float fSin;
        float f;
        double d;
        float fCos;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return this.asBinder;
        }
        this.asBinder.reset();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            return this.asBinder;
        }
        int i = AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.notify.ordinal()];
        float f6 = 0.0f;
        if (i == 1) {
            float fFloatValue = this.asInterface.asInterface().floatValue();
            binderDied<?, Float> binderdied = this.cancel;
            double radians = Math.toRadians((binderdied != null ? binderdied.asInterface().floatValue() : 0.0d) - 90.0d);
            double d2 = fFloatValue;
            float f7 = (float) (6.283185307179586d / d2);
            float f8 = f7 / 2.0f;
            float f9 = fFloatValue - ((int) fFloatValue);
            if (f9 != 0.0f) {
                radians += (double) ((1.0f - f9) * f8);
            }
            float fFloatValue2 = this.g.asInterface().floatValue();
            float fFloatValue3 = this.b.asInterface().floatValue();
            binderDied<?, Float> binderdied2 = this.TuitionPaymentFragmentbindingInflater1;
            float fFloatValue4 = binderdied2 != null ? binderdied2.asInterface().floatValue() / 100.0f : 0.0f;
            binderDied<?, Float> binderdied3 = this.f1425a;
            float fFloatValue5 = binderdied3 != null ? binderdied3.asInterface().floatValue() / 100.0f : 0.0f;
            if (f9 != 0.0f) {
                float f10 = ((fFloatValue2 - fFloatValue3) * f9) + fFloatValue3;
                double d3 = f10;
                f2 = f10;
                fCos = (float) (d3 * Math.cos(radians));
                float fSin2 = (float) (d3 * Math.sin(radians));
                this.asBinder.moveTo(fCos, fSin2);
                d = radians + ((double) ((f7 * f9) / 2.0f));
                f = f8;
                fSin = fSin2;
            } else {
                double d4 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d4);
                fSin = (float) (d4 * Math.sin(radians));
                this.asBinder.moveTo(fCos2, fSin);
                f = f8;
                d = radians + ((double) f);
                fCos = fCos2;
                f2 = 0.0f;
            }
            double dCeil = Math.ceil(d2) * 2.0d;
            float f11 = fCos;
            int i2 = 0;
            boolean z = false;
            while (true) {
                double d5 = i2;
                if (d5 >= dCeil) {
                    break;
                }
                float f12 = z ? fFloatValue2 : fFloatValue3;
                float f13 = (f2 == 0.0f || d5 != dCeil - 2.0d) ? f : (f7 * f9) / 2.0f;
                double d6 = (f2 == 0.0f || d5 != dCeil - 1.0d) ? f12 : f2;
                double d7 = dCeil;
                float fCos3 = (float) (d6 * Math.cos(d));
                float fSin3 = (float) (d6 * Math.sin(d));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    this.asBinder.lineTo(fCos3, fSin3);
                    f3 = fFloatValue2;
                    f4 = fFloatValue5;
                    f5 = fFloatValue4;
                } else {
                    f3 = fFloatValue2;
                    double dAtan2 = (float) (Math.atan2(fSin, f11) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    f4 = fFloatValue5;
                    f5 = fFloatValue4;
                    double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin5 = (float) Math.sin(dAtan3);
                    float f14 = z ? f5 : f4;
                    float f15 = z ? f4 : f5;
                    float f16 = (z ? fFloatValue3 : f3) * f14 * 0.47829f;
                    float f17 = fCos4 * f16;
                    float f18 = f16 * fSin4;
                    float f19 = (z ? f3 : fFloatValue3) * f15 * 0.47829f;
                    float f20 = fCos5 * f19;
                    float f21 = f19 * fSin5;
                    if (f9 != 0.0f) {
                        if (i2 == 0) {
                            f17 *= f9;
                            f18 *= f9;
                        } else if (d5 == d7 - 1.0d) {
                            f20 *= f9;
                            f21 *= f9;
                        }
                    }
                    this.asBinder.cubicTo(f11 - f17, fSin - f18, fCos3 + f20, fSin3 + f21, fCos3, fSin3);
                }
                d += (double) f13;
                z = !z;
                i2++;
                f11 = fCos3;
                fSin = fSin3;
                fFloatValue2 = f3;
                f7 = f7;
                f = f;
                fFloatValue4 = f5;
                fFloatValue5 = f4;
                dCeil = d7;
            }
            PointF pointFAsInterface = this.INotificationSideChannel.asInterface();
            this.asBinder.offset(pointFAsInterface.x, pointFAsInterface.y);
            this.asBinder.close();
        } else if (i == 2) {
            int iFloor = (int) Math.floor(this.asInterface.asInterface().floatValue());
            binderDied<?, Float> binderdied4 = this.cancel;
            double radians2 = Math.toRadians((binderdied4 != null ? binderdied4.asInterface().floatValue() : 0.0d) - 90.0d);
            double d8 = iFloor;
            float fFloatValue6 = this.f1425a.asInterface().floatValue() / 100.0f;
            float fFloatValue7 = this.g.asInterface().floatValue();
            double d9 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d9);
            float fSin6 = (float) (Math.sin(radians2) * d9);
            this.asBinder.moveTo(fCos6, fSin6);
            double d10 = (float) (6.283185307179586d / d8);
            double d11 = radians2 + d10;
            double dCeil2 = Math.ceil(d8);
            float f22 = fCos6;
            int i3 = 0;
            while (i3 < dCeil2) {
                float fCos7 = (float) (Math.cos(d11) * d9);
                double d12 = dCeil2;
                float fSin7 = (float) (d9 * Math.sin(d11));
                if (fFloatValue6 != f6) {
                    double dAtan4 = (float) (Math.atan2(fSin6, f22) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan4);
                    float fSin8 = (float) Math.sin(dAtan4);
                    double dAtan5 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f23 = fFloatValue7 * fFloatValue6 * 0.25f;
                    this.asBinder.cubicTo(f22 - (fCos8 * f23), fSin6 - (fSin8 * f23), fCos7 + (((float) Math.cos(dAtan5)) * f23), fSin7 + (f23 * ((float) Math.sin(dAtan5))), fCos7, fSin7);
                } else {
                    this.asBinder.lineTo(fCos7, fSin7);
                }
                d11 += d10;
                i3++;
                f22 = fCos7;
                fSin6 = fSin7;
                dCeil2 = d12;
                d9 = d9;
                f6 = 0.0f;
            }
            PointF pointFAsInterface2 = this.INotificationSideChannel.asInterface();
            this.asBinder.offset(pointFAsInterface2.x, pointFAsInterface2.y);
            this.asBinder.close();
        }
        this.asBinder.close();
        this.cancelAll.TuitionPaymentFragmentbindingInflater1(this.asBinder);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        return this.asBinder;
    }

    /* JADX INFO: renamed from: validateCustomAction$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.d;
    }

    @Override // defpackage.getAudioStream
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaControllerCompatPlaybackInfo, i, list, mediaControllerCompatPlaybackInfo2, this);
    }

    @Override // defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        binderDied<?, Float> binderdied;
        binderDied<?, Float> binderdied2;
        if (t == registerCallbackListener.cancelAll) {
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.INotificationSideChannel) {
            this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.onTransact) {
            this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.asInterface && (binderdied2 = this.b) != null) {
            binderdied2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.d) {
            this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.g && (binderdied = this.TuitionPaymentFragmentbindingInflater1) != null) {
            binderdied.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
        } else if (t == registerCallbackListener.f1340a) {
            this.f1425a.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
        }
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invalidateSelf();
    }
}
