package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class outputFormatToVideoMime {
    public final long TuitionPaymentFragmentbindingInflater1;
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1317a;
    public final long asBinder;
    public final int asInterface;
    public final long b;
    public final long cancel;
    public final long cancelAll;
    public final int d;
    public final int g;
    public final int notify;
    private long onTransact;

    public outputFormatToVideoMime(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.asInterface = i;
        this.d = i2;
        this.b = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j2;
        this.asBinder = j3;
        this.cancelAll = j4;
        this.cancel = j5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j6;
        this.TuitionPaymentFragmentbindingInflater1 = j7;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j8;
        this.g = i3;
        this.f1317a = i4;
        this.notify = i5;
        this.onTransact = j9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatsSnapshot{maxSize=");
        sb.append(this.asInterface);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", cacheHits=");
        sb.append(this.b);
        sb.append(", cacheMisses=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", downloadCount=");
        sb.append(this.g);
        sb.append(", totalDownloadSize=");
        sb.append(this.asBinder);
        sb.append(", averageDownloadSize=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", totalOriginalBitmapSize=");
        sb.append(this.cancelAll);
        sb.append(", totalTransformedBitmapSize=");
        sb.append(this.cancel);
        sb.append(", averageOriginalBitmapSize=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", averageTransformedBitmapSize=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", originalBitmapCount=");
        sb.append(this.f1317a);
        sb.append(", transformedBitmapCount=");
        sb.append(this.notify);
        sb.append(", timeStamp=");
        sb.append(this.onTransact);
        sb.append('}');
        return sb.toString();
    }
}
