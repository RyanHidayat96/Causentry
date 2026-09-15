package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes6.dex */
public final class getTargetResolution {
    private static final getTargetResolution[] g;
    final int TuitionPaymentFragmentbindingInflater1;
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f995a;
    final int asBinder;
    final int b;

    private getTargetResolution(int i, int i2, int i3, int i4, int i5, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        this.asBinder = i;
        this.TuitionPaymentFragmentbindingInflater1 = i2;
        this.b = i3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i7 = 0;
        for (TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 : tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            i7 += tuitionPaymentFragmentspecialinlinedviewModeldefault3.b * (tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 + i6);
        }
        this.f995a = i7;
    }

    public static getTargetResolution TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws FormatException {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        for (getTargetResolution gettargetresolution : g) {
            if (gettargetresolution.TuitionPaymentFragmentbindingInflater1 == i && gettargetresolution.b == i2) {
                return gettargetresolution;
            }
        }
        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final TuitionPaymentFragmentspecialinlinedviewModeldefault3[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, byte b) {
            this(i, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4) {
            this(62, tuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault4);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3[]{tuitionPaymentFragmentspecialinlinedviewModeldefault3};
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 62;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3[]{tuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault4};
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1534005142;
        final int TuitionPaymentFragmentbindingInflater1;
        final int b;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, byte b) {
            this(i, i2);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2) {
            this.b = i;
            this.TuitionPaymentFragmentbindingInflater1 = i2;
        }
    }

    public final String toString() {
        return String.valueOf(this.asBinder);
    }

    static {
        int i = 1;
        byte b = 0;
        int i2 = 5;
        getTargetResolution gettargetresolution = new getTargetResolution(1, 10, 10, 8, 8, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 3, b), b));
        getTargetResolution gettargetresolution2 = new getTargetResolution(2, 12, 12, 10, 10, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(7, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i2, b), b));
        getTargetResolution gettargetresolution3 = new getTargetResolution(3, 14, 14, 12, 12, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(10, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 8, b), b));
        int i3 = 12;
        getTargetResolution gettargetresolution4 = new getTargetResolution(4, 16, 16, 14, 14, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i3, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i3, b), b));
        int i4 = 18;
        int i5 = 36;
        int i6 = 42;
        int i7 = 56;
        int i8 = 2;
        int i9 = 4;
        g = new getTargetResolution[]{gettargetresolution, gettargetresolution2, gettargetresolution3, gettargetresolution4, new getTargetResolution(5, 18, 18, 16, 16, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(14, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i4, b), b)), new getTargetResolution(6, 20, 20, 18, 18, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i4, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 22, b), b)), new getTargetResolution(7, 22, 22, 20, 20, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(20, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 30, b), b)), new getTargetResolution(8, 24, 24, 22, 22, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(24, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i5, b), b)), new getTargetResolution(9, 26, 26, 24, 24, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(28, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 44, b), b)), new getTargetResolution(10, 32, 32, 14, 14, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i5, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 62, b), b)), new getTargetResolution(11, 36, 36, 16, 16, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i6, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 86, b), b)), new getTargetResolution(12, 40, 40, 18, 18, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(48, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 114, b), b)), new getTargetResolution(13, 44, 44, 20, 20, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i7, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 144, b), b)), new getTargetResolution(14, 48, 48, 22, 22, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(68, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 174, b), b)), new getTargetResolution(15, 52, 52, 24, 24, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i6, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8, 102, b), b)), new getTargetResolution(16, 64, 64, 14, 14, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i7, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8, 140, b), b)), new getTargetResolution(17, 72, 72, 16, 16, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(36, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i9, 92, b), b)), new getTargetResolution(18, 80, 80, 18, 18, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(48, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i9, 114, b), b)), new getTargetResolution(19, 88, 88, 20, 20, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i7, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i9, 144, b), b)), new getTargetResolution(20, 96, 96, 22, 22, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(68, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i9, 174, b), b)), new getTargetResolution(21, 104, 104, 24, 24, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i7, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(6, 136, b), b)), new getTargetResolution(22, 120, 120, 18, 18, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(68, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(6, 175, b), b)), new getTargetResolution(23, 132, 132, 20, 20, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(62, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(8, 163, b), b)), new getTargetResolution(24, 144, 144, 22, 22, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(8, 156, b), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8, ModuleDescriptor.MODULE_VERSION, b))), new getTargetResolution(25, 8, 18, 6, 16, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(7, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, 5, b), b)), new getTargetResolution(26, 8, 32, 6, 14, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(11, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, 10, b), b)), new getTargetResolution(27, 12, 26, 10, 24, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(14, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, 16, b), b)), new getTargetResolution(28, 12, 36, 10, 16, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(18, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, 22, b), b)), new getTargetResolution(29, 16, 36, 14, 16, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(24, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, 32, b), b)), new getTargetResolution(30, 16, 48, 14, 22, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(28, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, 49, b), b))};
    }
}
