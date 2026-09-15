package androidx.camera.core.impl.utils;

/* JADX INFO: loaded from: classes5.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    LongRational(long j, long j2) {
        this.mNumerator = j;
        this.mDenominator = j2;
    }

    LongRational(double d) {
        this((long) (d * 10000.0d), 10000L);
    }

    final long getNumerator() {
        return this.mNumerator;
    }

    final long getDenominator() {
        return this.mDenominator;
    }

    final double toDouble() {
        return this.mNumerator / this.mDenominator;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mNumerator);
        sb.append("/");
        sb.append(this.mDenominator);
        return sb.toString();
    }
}
