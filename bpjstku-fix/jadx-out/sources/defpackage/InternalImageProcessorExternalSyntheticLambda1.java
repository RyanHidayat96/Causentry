package defpackage;

import com.koushikdutta.async.AsyncServer;
import com.koushikdutta.async.http.ConnectionClosedException;

/* JADX INFO: loaded from: classes4.dex */
abstract class InternalImageProcessorExternalSyntheticLambda1 extends lambdaexecuteSafely11 implements safeProcess, OpenGlRenderer.a {
    protected getOutSurfaceOrThrow TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f160a;
    getAbsolutePathFromUri asBinder;
    private executeSafely asInterface;
    int b;
    private String d;
    private Node g;
    lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: InternalImageProcessorExternalSyntheticLambda1.1
        public static int b = -1443261190;

        @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
        public final void b(Exception exc) {
            if (InternalImageProcessorExternalSyntheticLambda1.this.b() == null) {
                InternalImageProcessorExternalSyntheticLambda1.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ConnectionClosedException("connection closed before headers received.", exc));
            } else if (exc != null && !InternalImageProcessorExternalSyntheticLambda1.this.TuitionPaymentFragmentbindingInflater1) {
                InternalImageProcessorExternalSyntheticLambda1.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ConnectionClosedException("connection closed before response completed.", exc));
            } else {
                InternalImageProcessorExternalSyntheticLambda1.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
            }
        }
    };
    boolean TuitionPaymentFragmentbindingInflater1 = false;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

    protected void TuitionPaymentFragmentbindingInflater1(Exception exc) {
    }

    protected void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // OpenGlRenderer.a
    public final getAbsolutePathFromUri a() {
        return this.asBinder;
    }

    @Override // defpackage.safeProcess
    public final Node asInterface() {
        return this.g;
    }

    protected final void cancelAll() {
        if (this.g.TuitionPaymentFragmentbindingInflater1 != null) {
            new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: InternalImageProcessorExternalSyntheticLambda1.2
                @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
                public final void b(Exception exc) {
                    InternalImageProcessorExternalSyntheticLambda1.this.TuitionPaymentFragmentbindingInflater1(exc);
                }
            };
        } else {
            TuitionPaymentFragmentbindingInflater1((Exception) null);
        }
    }

    @Override // OpenGlRenderer.a
    public final OpenGlRenderer.a TuitionPaymentFragmentspecialinlinedviewModeldefault1(checkReadyToRelease checkreadytorelease) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkreadytorelease);
        return this;
    }

    /* JADX INFO: renamed from: InternalImageProcessorExternalSyntheticLambda1$3, reason: invalid class name */
    final class AnonymousClass3 extends lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        AnonymousClass3() {
        }

        @Override // lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1, defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
        public final void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
            super.TuitionPaymentFragmentbindingInflater1(checkreadytorelease, autoValue_Packet);
            InternalImageProcessorExternalSyntheticLambda1.this.asBinder.TuitionPaymentFragmentbindingInflater1();
        }
    }

    @Override // defpackage.getSurfaceEdge
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AnonymousClass3());
        this.asBinder.TuitionPaymentFragmentbindingInflater1(null);
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
        this.asBinder.b(null);
        this.TuitionPaymentFragmentbindingInflater1 = true;
    }

    @Override // defpackage.lambdaexecuteSafely11, defpackage.checkReadyToRelease
    public final void TuitionPaymentFragmentbindingInflater1() {
        super.TuitionPaymentFragmentbindingInflater1();
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AnonymousClass3());
    }

    public InternalImageProcessorExternalSyntheticLambda1(Node node) {
        this.g = node;
    }

    @Override // defpackage.safeProcess, OpenGlRenderer.a
    public final getOutSurfaceOrThrow b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // OpenGlRenderer.a
    public final OpenGlRenderer.a TuitionPaymentFragmentspecialinlinedviewModeldefault3(getOutSurfaceOrThrow getoutsurfaceorthrow) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getoutsurfaceorthrow;
        return this;
    }

    @Override // defpackage.safeProcess, OpenGlRenderer.a
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.b;
    }

    @Override // OpenGlRenderer.a
    public final OpenGlRenderer.a TuitionPaymentFragmentbindingInflater1(int i) {
        this.b = i;
        return this;
    }

    @Override // OpenGlRenderer.a
    public final OpenGlRenderer.a TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        this.d = str;
        return this;
    }

    @Override // OpenGlRenderer.a
    public final OpenGlRenderer.a b(String str) {
        this.f160a = str;
        return this;
    }

    @Override // OpenGlRenderer.a
    public final String d() {
        return this.d;
    }

    @Override // defpackage.safeProcess, OpenGlRenderer.a
    public final String asBinder() {
        return this.f160a;
    }

    public String toString() {
        getOutSurfaceOrThrow getoutsurfaceorthrow = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (getoutsurfaceorthrow == null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(" ");
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.f160a);
        return getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
    }

    @Override // OpenGlRenderer.a
    public final executeSafely g() {
        return this.asInterface;
    }

    @Override // OpenGlRenderer.a
    public final OpenGlRenderer.a b(executeSafely executesafely) {
        this.asInterface = executesafely;
        return this;
    }

    @Override // defpackage.lambdaexecuteSafely11, defpackage.checkReadyToRelease
    public final AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }
}
