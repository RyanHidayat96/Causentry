package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ImageInputConfigBuilder {
    public static final ImageInputConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static final ImageInputConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImageInputConfigBuilder f156a;
    public static final ImageInputConfigBuilder asBinder;
    public static final ImageInputConfigBuilder b;
    public static final ImageInputConfigBuilder d;
    final int INotificationSideChannel;
    final int asInterface;
    private final int cancel;
    final ImageOutputConfig cancelAll;
    final int[] g;
    final ImageOutputConfig notify;
    final int[] onTransact;
    public static final ImageInputConfigBuilder TuitionPaymentFragmentbindingInflater1 = new ImageInputConfigBuilder(4201, 4096, 1);
    public static final ImageInputConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ImageInputConfigBuilder(1033, 1024, 1);

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) {
        return i ^ i2;
    }

    static {
        ImageInputConfigBuilder imageInputConfigBuilder = new ImageInputConfigBuilder(67, 64, 1);
        b = imageInputConfigBuilder;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ImageInputConfigBuilder(19, 16, 1);
        f156a = new ImageInputConfigBuilder(285, 256, 0);
        ImageInputConfigBuilder imageInputConfigBuilder2 = new ImageInputConfigBuilder(301, 256, 1);
        asBinder = imageInputConfigBuilder2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageInputConfigBuilder2;
        d = imageInputConfigBuilder;
    }

    private ImageInputConfigBuilder(int i, int i2, int i3) {
        this.cancel = i;
        this.INotificationSideChannel = i2;
        this.asInterface = i3;
        this.g = new int[i2];
        this.onTransact = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.g[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.onTransact[this.g[i6]] = i6;
        }
        this.cancelAll = new ImageOutputConfig(this, new int[]{0});
        this.notify = new ImageOutputConfig(this, new int[]{1});
    }

    final ImageOutputConfig TuitionPaymentFragmentbindingInflater1(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.cancelAll;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new ImageOutputConfig(this, iArr);
    }

    final int b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.g;
        int[] iArr2 = this.onTransact;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.INotificationSideChannel - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.cancel));
        sb.append(',');
        sb.append(this.INotificationSideChannel);
        sb.append(')');
        return sb.toString();
    }
}
