package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.model.content.ShapeStroke;

/* JADX INFO: loaded from: classes6.dex */
public final class getSessionToken2Bundle extends setShuffleModeEnabledRemoved {
    private final binderDied<Integer, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private binderDied<ColorFilter, ColorFilter> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fromMediaSession f980a;
    private final boolean b;
    private final String g;

    @Override // defpackage.setShuffleModeEnabledRemoved, defpackage.unregisterCallbackListener
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, Matrix matrix, int i) {
        if (this.b) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setColor(((getIControllerCallback) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).g());
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setColorFilter(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface());
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, matrix, i);
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.g;
    }

    @Override // defpackage.setShuffleModeEnabledRemoved, defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        super.b(t, mediaSessionCompatCallbackCallbackHandler);
        if (t == registerCallbackListener.INotificationSideChannelDefault) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.TuitionPaymentFragmentbindingInflater1) {
            binderDied<ColorFilter, ColorFilter> binderdied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (binderdied != null) {
                this.f980a.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(binderdied);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = processpendingcallbackslocked;
            processpendingcallbackslocked.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            fromMediaSession frommediasession = this.f980a;
            binderDied<Integer, Integer> binderdied2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (binderdied2 != null) {
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSessionToken2Bundle(prepare prepareVar, fromMediaSession frommediasession, ShapeStroke shapeStroke) {
        Paint.Cap cap;
        int i = ShapeStroke.AnonymousClass4.TuitionPaymentFragmentspecialinlinedviewModeldefault1[shapeStroke.b.ordinal()];
        if (i == 1) {
            cap = Paint.Cap.BUTT;
        } else if (i == 2) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = Paint.Cap.SQUARE;
        }
        super(prepareVar, frommediasession, cap, shapeStroke.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), shapeStroke.asBinder, shapeStroke.asInterface, shapeStroke.d, shapeStroke.TuitionPaymentFragmentspecialinlinedviewModeldefault1, shapeStroke.f364a);
        this.f980a = frommediasession;
        this.g = shapeStroke.g;
        this.b = shapeStroke.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        binderDied<Integer, Integer> binderdiedTuitionPaymentFragmentbindingInflater1 = shapeStroke.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = binderdiedTuitionPaymentFragmentbindingInflater1;
        binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
    }
}
