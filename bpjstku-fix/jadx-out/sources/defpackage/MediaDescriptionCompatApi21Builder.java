package defpackage;

import coil.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompatApi21Builder extends setMediaUri {
    private final MediaBrowserCompatApi23ItemCallback TuitionPaymentFragmentbindingInflater1;
    private final DataSource TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public final MediaBrowserCompatApi23ItemCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public final DataSource TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public MediaDescriptionCompatApi21Builder(MediaBrowserCompatApi23ItemCallback mediaBrowserCompatApi23ItemCallback, String str, DataSource dataSource) {
        super(null);
        this.TuitionPaymentFragmentbindingInflater1 = mediaBrowserCompatApi23ItemCallback;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaDescriptionCompatApi21Builder)) {
            return false;
        }
        MediaDescriptionCompatApi21Builder mediaDescriptionCompatApi21Builder = (MediaDescriptionCompatApi21Builder) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, mediaDescriptionCompatApi21Builder.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, mediaDescriptionCompatApi21Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == mediaDescriptionCompatApi21Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }
}
