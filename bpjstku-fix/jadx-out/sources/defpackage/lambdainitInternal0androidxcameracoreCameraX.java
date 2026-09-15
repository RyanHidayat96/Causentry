package defpackage;

import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdainitInternal0androidxcameracoreCameraX {
    private final getAdditionalTransformMatrixAppliedByProcessor<getCameraControl, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getAdditionalTransformMatrixAppliedByProcessor<>(1000);
    private final Pools.Pool<TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentbindingInflater1 = createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10, new createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1<TuitionPaymentFragmentspecialinlinedviewModeldefault2>() { // from class: lambdainitInternal0androidxcameracoreCameraX.2
        @Override // createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        private static TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            try {
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    });

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCameraControl getcameracontrol) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getcameracontrol);
        }
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentbindingInflater1(getcameracontrol);
        }
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getcameracontrol, strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private String TuitionPaymentFragmentbindingInflater1(getCameraControl getcameracontrol) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2Acquire = this.TuitionPaymentFragmentbindingInflater1.acquire();
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2Acquire != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2Acquire;
            try {
                getcameracontrol.updateDiskCacheKey(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                return getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.digest());
            } finally {
                this.TuitionPaymentFragmentbindingInflater1.release(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        throw new NullPointerException("Argument must not be null");
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements createImageReaderProxy.TuitionPaymentFragmentbindingInflater1 {
        final MessageDigest TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final attach TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new attach.TuitionPaymentFragmentbindingInflater1();

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(MessageDigest messageDigest) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = messageDigest;
        }

        @Override // createImageReaderProxy.TuitionPaymentFragmentbindingInflater1
        public final attach e_() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }
}
