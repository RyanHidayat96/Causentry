package defpackage;

import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_TakePictureRequest<T extends Enum<T>> implements getInMemoryCallback<T> {
    private setViewPort TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final CaptureNodeIn TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final setViewPort f87a;

    @Deprecated
    private final setCameraCaptureCallback d;
    private final Map<T, setViewPort> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashMap();
    private final AtomicBoolean b = new AtomicBoolean(false);

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        CaptureNodeIn TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Deprecated
        setCameraCaptureCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        setViewPort b;
    }

    public AutoValue_TakePictureRequest(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.f87a = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.d = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.getInMemoryCallback
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CaptureNodeExternalSyntheticLambda0<T> captureNodeExternalSyntheticLambda0) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(captureNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2, new setViewPort(captureNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1, captureNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    @Override // defpackage.getInMemoryCallback
    public final Map<T, setViewPort> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.getInMemoryCallback
    public final AtomicBoolean asInterface() {
        return this.b;
    }

    @Override // defpackage.getInMemoryCallback
    public final setCameraCaptureCallback b() {
        return this.d;
    }

    @Override // defpackage.getInMemoryCallback
    public final String TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.getInMemoryCallback
    public final setViewPort a() {
        return this.f87a;
    }

    @Override // defpackage.getInMemoryCallback
    public final setViewPort TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.getInMemoryCallback
    public final void TuitionPaymentFragmentbindingInflater1(setViewPort setviewport) {
        this.TuitionPaymentFragmentbindingInflater1 = setviewport;
    }

    @Override // defpackage.getInMemoryCallback
    public final CaptureNodeIn TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LifecycleActionImpl{name='");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("', startPoint=");
        sb.append(this.f87a);
        sb.append(", endPoint=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", parentAction=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", lifecycleEvents=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('}');
        return sb.toString();
    }
}
