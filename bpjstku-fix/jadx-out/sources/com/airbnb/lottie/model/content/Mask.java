package com.airbnb.lottie.model.content;

import defpackage.setRating;
import defpackage.skipToPrevious;

/* JADX INFO: loaded from: classes.dex */
public final class Mask {
    public final boolean TuitionPaymentFragmentbindingInflater1;
    public final setRating TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final skipToPrevious TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final MaskMode b;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, skipToPrevious skiptoprevious, setRating setrating, boolean z) {
        this.b = maskMode;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = skiptoprevious;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = setrating;
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }
}
