package defpackage;

import com.lyft.kronos.internal.ntp.SntpClient;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class DualSurfaceProcessorFactoryExternalSyntheticLambda0 implements DualSurfaceProcessorNode {
    private final DualSurfaceProcessorExternalSyntheticLambda2 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public DualSurfaceProcessorFactoryExternalSyntheticLambda0(DualSurfaceProcessorExternalSyntheticLambda2 dualSurfaceProcessorExternalSyntheticLambda2, lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor) {
        Intrinsics.checkNotNullParameter(dualSurfaceProcessorExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dualSurfaceProcessorExternalSyntheticLambda2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor;
    }

    @Override // defpackage.DualSurfaceProcessorNode
    public final SntpClient.TuitionPaymentFragmentbindingInflater1 b() {
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        long jTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        if (jTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
            return null;
        }
        return new SntpClient.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentspecialinlinedviewModeldefault3, jTuitionPaymentFragmentspecialinlinedviewModeldefault1, jTuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.DualSurfaceProcessorNode
    public final void TuitionPaymentFragmentbindingInflater1(SntpClient.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
        synchronized (this) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.DualSurfaceProcessorNode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        synchronized (this) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
            Unit unit = Unit.INSTANCE;
        }
    }
}
