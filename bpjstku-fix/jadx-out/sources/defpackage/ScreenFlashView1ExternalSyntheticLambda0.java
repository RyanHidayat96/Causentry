package defpackage;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ScreenFlashView1ExternalSyntheticLambda0 extends orientationToSurfaceRotation {
    private final RandomAccessFile TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenFlashView1ExternalSyntheticLambda0(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        Intrinsics.checkNotNullParameter(randomAccessFile, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = randomAccessFile;
    }

    @Override // defpackage.orientationToSurfaceRotation
    protected final long TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        long length;
        synchronized (this) {
            length = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length();
        }
        return length;
    }

    @Override // defpackage.orientationToSurfaceRotation
    protected final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, byte[] bArr, int i, int i2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(bArr, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.seek(j);
            int i3 = 0;
            while (i3 < i2) {
                int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.read(bArr, i, i2 - i3);
                if (i4 == -1) {
                    if (i3 != 0) {
                        break;
                    }
                    return -1;
                }
                i3 += i4;
            }
            return i3;
        }
    }

    @Override // defpackage.orientationToSurfaceRotation
    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j, byte[] bArr, int i, int i2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(bArr, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.seek(j);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.write(bArr, i, i2);
        }
    }

    @Override // defpackage.orientationToSurfaceRotation
    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        synchronized (this) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getFD().sync();
        }
    }

    @Override // defpackage.orientationToSurfaceRotation
    protected final void b() {
        synchronized (this) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.close();
        }
    }
}
