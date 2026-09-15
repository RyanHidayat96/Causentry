package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class onAudioInfoChanged extends onSessionEvent<Float> {
    public onAudioInfoChanged(List<onSkipToNext<Float>> list) {
        super(list);
    }

    private float TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSkipToNext<Float> onskiptonext, float f) {
        if (onskiptonext.d == null || onskiptonext.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.b != null) {
            MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler = this.b;
            float f2 = onskiptonext.asInterface;
            Float f3 = onskiptonext.TuitionPaymentFragmentbindingInflater1;
            Float f4 = onskiptonext.d;
            Float f5 = onskiptonext.b;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            b();
            Object obj = mediaSessionCompatCallbackCallbackHandler.b;
            Float f6 = (Float) mediaSessionCompatCallbackCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (f6 != null) {
                return f6.floatValue();
            }
        }
        if (onskiptonext.INotificationSideChannel == -3987645.8f) {
            onskiptonext.INotificationSideChannel = onskiptonext.d.floatValue();
        }
        float f7 = onskiptonext.INotificationSideChannel;
        if (onskiptonext.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == -3987645.8f) {
            onskiptonext.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = onskiptonext.b.floatValue();
        }
        return onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f7, onskiptonext.TuitionPaymentFragmentspecialinlinedviewModeldefault1, f);
    }

    public final float d() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault2(), TuitionPaymentFragmentbindingInflater1());
    }

    @Override // defpackage.binderDied
    final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext onskiptonext, float f) {
        return Float.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3(onskiptonext, f));
    }
}
