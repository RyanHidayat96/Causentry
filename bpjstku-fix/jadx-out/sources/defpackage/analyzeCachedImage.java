package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0012\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"LanalyzeCachedImage;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "()V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "J", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class analyzeCachedImage {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final analyzeCachedImage d = new analyzeCachedImage();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final long TuitionPaymentFragmentbindingInflater1 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 500;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final long b = 4194304;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 64800000;

    private analyzeCachedImage() {
    }

    /* JADX INFO: renamed from: analyzeCachedImage$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"LanalyzeCachedImage$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "LanalyzeCachedImage;", "d", "LanalyzeCachedImage;", "TuitionPaymentFragmentbindingInflater1", "()LanalyzeCachedImage;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static analyzeCachedImage TuitionPaymentFragmentbindingInflater1() {
            return analyzeCachedImage.d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof analyzeCachedImage)) {
            return false;
        }
        analyzeCachedImage analyzecachedimage = (analyzeCachedImage) p0;
        return this.TuitionPaymentFragmentbindingInflater1 == analyzecachedimage.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == analyzecachedimage.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.b == analyzecachedimage.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == analyzecachedimage.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final int hashCode() {
        return (((((Long.hashCode(this.TuitionPaymentFragmentbindingInflater1) * 31) + Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final String toString() {
        long j = this.TuitionPaymentFragmentbindingInflater1;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j2 = this.b;
        long j3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("analyzeCachedImage(TuitionPaymentFragmentbindingInflater1=");
        sb.append(j);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(i);
        sb.append(", b=");
        sb.append(j2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }
}
