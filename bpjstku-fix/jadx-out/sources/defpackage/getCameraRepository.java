package defpackage;

import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes3.dex */
public final class getCameraRepository extends getAdditionalTransformMatrixAppliedByProcessor<getCameraControl, Resource<?>> implements lambdashutdownInternal4androidxcameracoreCameraX {
    private lambdashutdownInternal4androidxcameracoreCameraX.b TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.getAdditionalTransformMatrixAppliedByProcessor
    public final /* bridge */ /* synthetic */ int TuitionPaymentFragmentbindingInflater1(Resource<?> resource) {
        Resource<?> resource2 = resource;
        if (resource2 == null) {
            return super.TuitionPaymentFragmentbindingInflater1((Object) null);
        }
        return resource2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // defpackage.lambdashutdownInternal4androidxcameracoreCameraX
    public final /* synthetic */ Resource TuitionPaymentFragmentbindingInflater1(getCameraControl getcameracontrol, Resource resource) {
        return (Resource) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getcameracontrol, resource);
    }

    @Override // defpackage.lambdashutdownInternal4androidxcameracoreCameraX
    public final /* synthetic */ Resource TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCameraControl getcameracontrol) {
        return (Resource) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getcameracontrol);
    }

    @Override // defpackage.getAdditionalTransformMatrixAppliedByProcessor
    public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCameraControl getcameracontrol, Resource<?> resource) {
        Resource<?> resource2 = resource;
        lambdashutdownInternal4androidxcameracoreCameraX.b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (bVar == null || resource2 == null) {
            return;
        }
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(resource2);
    }

    public getCameraRepository(long j) {
        super(j);
    }

    @Override // defpackage.lambdashutdownInternal4androidxcameracoreCameraX
    public final void TuitionPaymentFragmentbindingInflater1(lambdashutdownInternal4androidxcameracoreCameraX.b bVar) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar;
    }

    @Override // defpackage.lambdashutdownInternal4androidxcameracoreCameraX
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        if (i >= 40) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } else if (i >= 20 || i == 15) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1() / 2);
        }
    }
}
