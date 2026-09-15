package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class getIControllerCallback extends onSessionEvent<Integer> {
    public getIControllerCallback(List<onSkipToNext<Integer>> list) {
        super(list);
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2(onSkipToNext<Integer> onskiptonext, float f) {
        if (onskiptonext.d == null || onskiptonext.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iIntValue = onskiptonext.d.intValue();
        int iIntValue2 = onskiptonext.b.intValue();
        if (this.b != null) {
            MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler = this.b;
            float f2 = onskiptonext.asInterface;
            Float f3 = onskiptonext.TuitionPaymentFragmentbindingInflater1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            b();
            Object obj = mediaSessionCompatCallbackCallbackHandler.b;
            Integer num = (Integer) mediaSessionCompatCallbackCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (num != null) {
                return num.intValue();
            }
        }
        return onSetRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSetRepeatMode.TuitionPaymentFragmentbindingInflater1(f, 0.0f, 1.0f), iIntValue, iIntValue2);
    }

    public final int g() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault2(), TuitionPaymentFragmentbindingInflater1());
    }

    @Override // defpackage.binderDied
    final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext onskiptonext, float f) {
        return Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2(onskiptonext, f));
    }
}
