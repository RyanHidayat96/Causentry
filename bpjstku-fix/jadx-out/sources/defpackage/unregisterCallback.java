package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class unregisterCallback extends onSessionEvent<Integer> {
    public unregisterCallback(List<onSkipToNext<Integer>> list) {
        super(list);
    }

    private int b(onSkipToNext<Integer> onskiptonext, float f) {
        if (onskiptonext.d == null || onskiptonext.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.b != null) {
            MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler = this.b;
            float f2 = onskiptonext.asInterface;
            Float f3 = onskiptonext.TuitionPaymentFragmentbindingInflater1;
            Integer num = onskiptonext.d;
            Integer num2 = onskiptonext.b;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            b();
            Object obj = mediaSessionCompatCallbackCallbackHandler.b;
            Integer num3 = (Integer) mediaSessionCompatCallbackCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (num3 != null) {
                return num3.intValue();
            }
        }
        if (onskiptonext.onTransact == 784923401) {
            onskiptonext.onTransact = onskiptonext.d.intValue();
        }
        int i = onskiptonext.onTransact;
        if (onskiptonext.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 784923401) {
            onskiptonext.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = onskiptonext.b.intValue();
        }
        return onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, onskiptonext.TuitionPaymentFragmentspecialinlinedviewModeldefault2, f);
    }

    public final int d() {
        return b(TuitionPaymentFragmentspecialinlinedviewModeldefault2(), TuitionPaymentFragmentbindingInflater1());
    }

    @Override // defpackage.binderDied
    final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext onskiptonext, float f) {
        return Integer.valueOf(b(onskiptonext, f));
    }
}
