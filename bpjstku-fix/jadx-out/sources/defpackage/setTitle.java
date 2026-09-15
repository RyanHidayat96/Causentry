package defpackage;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class setTitle extends setMediaUri {
    public final Drawable TuitionPaymentFragmentbindingInflater1;
    public final DataSource TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setTitle(Drawable drawable, boolean z, DataSource dataSource) {
        super(null);
        this.TuitionPaymentFragmentbindingInflater1 = drawable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTitle)) {
            return false;
        }
        setTitle settitle = (setTitle) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, settitle.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == settitle.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == settitle.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }
}
