package defpackage;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes.dex */
public interface fromMediaDescription {

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentbindingInflater1();

        TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        void b();
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends Closeable {
        SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentbindingInflater1();

        TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(String str);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3 */
    animateToFullOpacity getTuitionPaymentFragmentspecialinlinedviewModeldefault1();

    TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str);

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private long b;
        private animateToFullOpacity TuitionPaymentFragmentbindingInflater1 = animateToFullOpacity.TuitionPaymentFragmentbindingInflater1;
        private double TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0.02d;
        private long g = 10485760;
        private long asInterface = 262144000;
        private CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Dispatchers.getIO();

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file) {
            return b(SurfaceViewImplementationExternalSyntheticLambda1.Companion.b(SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE, file));
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1 b(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = surfaceViewImplementationExternalSyntheticLambda1;
            return this;
        }

        public final fromMediaDescription b() {
            long jCoerceIn;
            SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (surfaceViewImplementationExternalSyntheticLambda1 == null) {
                throw new IllegalStateException("directory == null".toString());
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 <= 0.0d) {
                jCoerceIn = this.b;
            } else {
                try {
                    File file = new File(surfaceViewImplementationExternalSyntheticLambda1.toString());
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jCoerceIn = RangesKt.coerceIn((long) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.g, this.asInterface);
                } catch (Exception unused) {
                    jCoerceIn = this.g;
                }
            }
            return new getMediaUri(jCoerceIn, surfaceViewImplementationExternalSyntheticLambda1, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }
}
