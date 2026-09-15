package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0015J\u0017\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u000e\u0010\u0017J'\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000e\u0010\u0019J\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f"}, d2 = {"LScreenFlashView;", "LanimateToFullOpacity;", "p0", "<init>", "(LanimateToFullOpacity;)V", "LSurfaceViewImplementationExternalSyntheticLambda1;", "", "p1", "LSurfaceViewImplementationApi24Impl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LSurfaceViewImplementationExternalSyntheticLambda1;Z)LSurfaceViewImplementationApi24Impl;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LSurfaceViewImplementationExternalSyntheticLambda1;LSurfaceViewImplementationExternalSyntheticLambda1;)V", "TuitionPaymentFragmentbindingInflater1", "(LSurfaceViewImplementationExternalSyntheticLambda1;Z)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "b", "(LSurfaceViewImplementationExternalSyntheticLambda1;)Ljava/util/List;", "LlambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper;", "(LSurfaceViewImplementationExternalSyntheticLambda1;)LlambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper;", "LorientationToSurfaceRotation;", "(LSurfaceViewImplementationExternalSyntheticLambda1;)LorientationToSurfaceRotation;", "p2", "(LSurfaceViewImplementationExternalSyntheticLambda1;ZZ)LorientationToSurfaceRotation;", "LtryToComplete;", "(LSurfaceViewImplementationExternalSyntheticLambda1;)LtryToComplete;", "", "toString", "()Ljava/lang/String;", "LanimateToFullOpacity;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ScreenFlashView extends animateToFullOpacity {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final animateToFullOpacity TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ScreenFlashView(animateToFullOpacity animatetofullopacity) {
        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = animatetofullopacity;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.getOrCreateKotlinClass(getClass()).getSimpleName());
        sb.append('(');
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.animateToFullOpacity
    public final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault1(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter("appendingSink", "");
        Intrinsics.checkNotNullParameter("file", "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, p1);
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 p0, SurfaceViewImplementationExternalSyntheticLambda1 p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter("atomicMove", "");
        Intrinsics.checkNotNullParameter("source", "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter("atomicMove", "");
        Intrinsics.checkNotNullParameter(TypedValues.AttributesType.S_TARGET, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1);
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter("createDirectory", "");
        Intrinsics.checkNotNullParameter("dir", "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(p0, p1);
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter("delete", "");
        Intrinsics.checkNotNullParameter("path", "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, p1);
    }

    @Override // defpackage.animateToFullOpacity
    public final List<SurfaceViewImplementationExternalSyntheticLambda1> b(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter("list", "");
        Intrinsics.checkNotNullParameter("dir", "");
        List<SurfaceViewImplementationExternalSyntheticLambda1> listB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(p0);
        ArrayList arrayList = new ArrayList();
        for (SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 : listB) {
            Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter("list", "");
            arrayList.add(surfaceViewImplementationExternalSyntheticLambda1);
        }
        ArrayList arrayList2 = arrayList;
        CollectionsKt.sort(arrayList2);
        return arrayList2;
    }

    @Override // defpackage.animateToFullOpacity
    public final lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter("metadataOrNull", "");
        Intrinsics.checkNotNullParameter("path", "");
        lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        if (lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            return null;
        }
        if (lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3.a == null) {
            return lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3.a;
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter("metadataOrNull", "");
        return lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3, surfaceViewImplementationExternalSyntheticLambda1);
    }

    @Override // defpackage.animateToFullOpacity
    public final orientationToSurfaceRotation TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter("openReadOnly", "");
        Intrinsics.checkNotNullParameter("file", "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(p0);
    }

    @Override // defpackage.animateToFullOpacity
    public final orientationToSurfaceRotation TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1, boolean p2) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter("openReadWrite", "");
        Intrinsics.checkNotNullParameter("file", "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(p0, p1, p2);
    }

    @Override // defpackage.animateToFullOpacity
    public SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter("sink", "");
        Intrinsics.checkNotNullParameter("file", "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1);
    }

    @Override // defpackage.animateToFullOpacity
    public final tryToComplete TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter("source", "");
        Intrinsics.checkNotNullParameter("file", "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
    }
}
