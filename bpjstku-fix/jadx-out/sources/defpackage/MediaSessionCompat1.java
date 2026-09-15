package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
class MediaSessionCompat1 {
    private static SparseArrayCompat<WeakReference<Interpolator>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final Interpolator TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new LinearInterpolator();
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("t", "s", "e", "o", "i", "h", TypedValues.TransitionType.S_TO, "ti");

    MediaSessionCompat1() {
    }

    private static WeakReference<Interpolator> TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (MediaSessionCompat1.class) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new SparseArrayCompat<>();
            }
            weakReference = TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i);
        }
        return weakReference;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, WeakReference<Interpolator> weakReference) {
        synchronized (MediaSessionCompat1.class) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(i, weakReference);
        }
    }

    static <T> onSkipToNext<T> TuitionPaymentFragmentbindingInflater1(JsonReader jsonReader, previous previousVar, float f, onPrepareFromUri<T> onpreparefromuri, boolean z) throws IOException {
        if (z) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(previousVar, jsonReader, f, onpreparefromuri);
        }
        return new onSkipToNext<>(onpreparefromuri.TuitionPaymentFragmentbindingInflater1(jsonReader, f));
    }

    private static <T> onSkipToNext<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(previous previousVar, JsonReader jsonReader, float f, onPrepareFromUri<T> onpreparefromuri) throws IOException {
        Interpolator linearInterpolator;
        Interpolator interpolator;
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        PointF pointFTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        PointF pointF = null;
        T tTuitionPaymentFragmentbindingInflater1 = null;
        T tTuitionPaymentFragmentbindingInflater2 = null;
        PointF pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        while (true) {
            boolean z = false;
            PointF pointFTuitionPaymentFragmentspecialinlinedviewModeldefault4 = pointF;
            PointF pointF3 = pointF2;
            float fD = f2;
            PointF pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5 = pointF3;
            while (true) {
                if (jsonReader.asInterface()) {
                    switch (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                        case 0:
                            fD = (float) jsonReader.d();
                            break;
                        case 1:
                            tTuitionPaymentFragmentbindingInflater1 = onpreparefromuri.TuitionPaymentFragmentbindingInflater1(jsonReader, f);
                            break;
                        case 2:
                            tTuitionPaymentFragmentbindingInflater2 = onpreparefromuri.TuitionPaymentFragmentbindingInflater1(jsonReader, f);
                            break;
                        case 3:
                            pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, f);
                            break;
                        case 4:
                            pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, f);
                            break;
                        case 5:
                            z = true;
                            if (jsonReader.g() == 1) {
                            }
                            break;
                        case 6:
                            pointFTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, f);
                            break;
                        case 7:
                            pointFTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, f);
                            break;
                        default:
                            jsonReader.onTransact();
                            break;
                    }
                } else {
                    jsonReader.TuitionPaymentFragmentbindingInflater1();
                    if (z) {
                        interpolator = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        tTuitionPaymentFragmentbindingInflater2 = tTuitionPaymentFragmentbindingInflater1;
                    } else {
                        if (pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5 != null && pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                            float f3 = -f;
                            pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.x = onSetRepeatMode.TuitionPaymentFragmentbindingInflater1(pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.x, f3, f);
                            pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.y = onSetRepeatMode.TuitionPaymentFragmentbindingInflater1(pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.y, -100.0f, 100.0f);
                            pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.x = onSetRepeatMode.TuitionPaymentFragmentbindingInflater1(pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.x, f3, f);
                            pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.y = onSetRepeatMode.TuitionPaymentFragmentbindingInflater1(pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.y, -100.0f, 100.0f);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.x, pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.y, pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.x, pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.y);
                            WeakReference<Interpolator> weakReferenceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            Interpolator interpolator2 = weakReferenceTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null ? weakReferenceTuitionPaymentFragmentspecialinlinedviewModeldefault1.get() : null;
                            if (weakReferenceTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || interpolator2 == null) {
                                pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.x /= f;
                                pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.y /= f;
                                pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.x /= f;
                                pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.y /= f;
                                try {
                                    linearInterpolator = PathInterpolatorCompat.create(pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.x, pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.y, pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.x, pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.y);
                                } catch (IllegalArgumentException e2) {
                                    if (e2.getMessage().equals("The Path cannot loop back on itself.")) {
                                        linearInterpolator = PathInterpolatorCompat.create(Math.min(pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.x, 1.0f), pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5.y, Math.max(pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.x, 0.0f), pointFTuitionPaymentFragmentspecialinlinedviewModeldefault3.y);
                                    } else {
                                        linearInterpolator = new LinearInterpolator();
                                    }
                                }
                                try {
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new WeakReference(linearInterpolator));
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                }
                            } else {
                                interpolator = interpolator2;
                            }
                        } else {
                            linearInterpolator = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        }
                        interpolator = linearInterpolator;
                    }
                    onSkipToNext<T> onskiptonext = new onSkipToNext<>(previousVar, tTuitionPaymentFragmentbindingInflater1, tTuitionPaymentFragmentbindingInflater2, interpolator, fD, null);
                    onskiptonext.f1310a = pointFTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    onskiptonext.g = pointFTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    return onskiptonext;
                }
            }
            pointF = pointFTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            float f4 = fD;
            pointF2 = pointFTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            f2 = f4;
        }
    }
}
