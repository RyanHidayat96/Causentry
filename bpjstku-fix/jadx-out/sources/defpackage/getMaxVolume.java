package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getMaxVolume {
    public final double TuitionPaymentFragmentbindingInflater1;
    private final char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final double TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final List<MediaSessionCompat> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f955a;
    private final String b;

    public getMaxVolume(List<MediaSessionCompat> list, char c, double d, double d2, String str, String str2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = c;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = d;
        this.TuitionPaymentFragmentbindingInflater1 = d2;
        this.f955a = str;
        this.b = str2;
    }

    public final int hashCode() {
        char c = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return (((c * 31) + this.b.hashCode()) * 31) + this.f955a.hashCode();
    }
}
