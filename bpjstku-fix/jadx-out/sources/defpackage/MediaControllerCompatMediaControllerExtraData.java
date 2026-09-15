package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaControllerCompatMediaControllerExtraData extends onSessionEvent<onStop> {
    private final onStop TuitionPaymentFragmentbindingInflater1;

    public MediaControllerCompatMediaControllerExtraData(List<onSkipToNext<onStop>> list) {
        super(list);
        this.TuitionPaymentFragmentbindingInflater1 = new onStop();
    }

    @Override // defpackage.binderDied
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext onskiptonext, float f) {
        if (onskiptonext.d == null || onskiptonext.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        onStop onstop = (onStop) onskiptonext.d;
        onStop onstop2 = (onStop) onskiptonext.b;
        if (this.b != null) {
            MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler = this.b;
            float f2 = onskiptonext.asInterface;
            Float f3 = onskiptonext.TuitionPaymentFragmentbindingInflater1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            b();
            Object obj = mediaSessionCompatCallbackCallbackHandler.b;
            onStop onstop3 = (onStop) mediaSessionCompatCallbackCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (onstop3 != null) {
                return onstop3;
            }
        }
        onStop onstop4 = this.TuitionPaymentFragmentbindingInflater1;
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(onstop.b, onstop2.b, f);
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault4 = onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(onstop.TuitionPaymentFragmentspecialinlinedviewModeldefault3, onstop2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, f);
        onstop4.b = fTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        onstop4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}
