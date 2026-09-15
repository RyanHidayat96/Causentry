package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class isAffectedSamsungDevice {
    public static <T, U> void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getBytesPerFrame<T> getbytesperframe, deriveMediaType<? super U> derivemediatype, boolean z, BufferProviderState bufferProviderState, isMotoC<T, U> ismotoc) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        while (!TuitionPaymentFragmentspecialinlinedviewModeldefault1(ismotoc.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getbytesperframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), derivemediatype, z, getbytesperframe, bufferProviderState, ismotoc)) {
            while (true) {
                boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ismotoc.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbytesperframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                boolean z2 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(zTuitionPaymentFragmentspecialinlinedviewModeldefault2, z2, derivemediatype, z, getbytesperframe, bufferProviderState, ismotoc)) {
                    return;
                }
                if (z2) {
                    break;
                } else {
                    ismotoc.TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivemediatype, tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ismotoc.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                return;
            }
        }
    }

    private static <T, U> boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, boolean z2, deriveMediaType<?> derivemediatype, boolean z3, AudioSettingsBuilder<?> audioSettingsBuilder, BufferProviderState bufferProviderState, isMotoC<T, U> ismotoc) {
        if (ismotoc.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
            bufferProviderState.dispose();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            if (bufferProviderState != null) {
                bufferProviderState.dispose();
            }
            Throwable thB = ismotoc.b();
            if (thB != null) {
                derivemediatype.onError(thB);
            } else {
                derivemediatype.onComplete();
            }
            return true;
        }
        Throwable thB2 = ismotoc.b();
        if (thB2 != null) {
            audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
            if (bufferProviderState != null) {
                bufferProviderState.dispose();
            }
            derivemediatype.onError(thB2);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (bufferProviderState != null) {
            bufferProviderState.dispose();
        }
        derivemediatype.onComplete();
        return true;
    }
}
