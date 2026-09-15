package defpackage;

import java.lang.ref.Reference;

/* JADX INFO: loaded from: classes4.dex */
public final class getProcessor extends SurfaceEdgeExternalSyntheticLambda2<String, SurfaceProcessorNodeExternalSyntheticLambda2> {
    public checkSupportedTargets<String, SurfaceProcessorNodeExternalSyntheticLambda2> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.SurfaceEdgeExternalSyntheticLambda2
    public final /* synthetic */ long b(String str, SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2) {
        return surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // defpackage.SurfaceEdgeExternalSyntheticLambda2
    public final /* bridge */ /* synthetic */ void b(boolean z, String str, SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2, SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda3) {
        String str2 = str;
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda4 = surfaceProcessorNodeExternalSyntheticLambda2;
        super.b(z, str2, surfaceProcessorNodeExternalSyntheticLambda4, surfaceProcessorNodeExternalSyntheticLambda3);
        if (z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, surfaceProcessorNodeExternalSyntheticLambda4);
        }
    }

    public getProcessor(int i) {
        super(i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new checkSupportedTargets<>();
    }

    public final SurfaceProcessorNodeExternalSyntheticLambda2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2B = b(str);
        if (surfaceProcessorNodeExternalSyntheticLambda2B != null) {
            return surfaceProcessorNodeExternalSyntheticLambda2B;
        }
        Reference reference = (Reference) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b.remove(str);
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = (SurfaceProcessorNodeExternalSyntheticLambda2) (reference == null ? null : reference.get());
        if (surfaceProcessorNodeExternalSyntheticLambda2 != null) {
            TuitionPaymentFragmentbindingInflater1(str, surfaceProcessorNodeExternalSyntheticLambda2);
        }
        return surfaceProcessorNodeExternalSyntheticLambda2;
    }
}
