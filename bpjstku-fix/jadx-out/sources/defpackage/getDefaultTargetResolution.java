package defpackage;

import com.bumptech.glide.request.RequestCoordinator;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultTargetResolution implements RequestCoordinator, ImageAnalysisBuilder {
    private final RequestCoordinator TuitionPaymentFragmentbindingInflater1;
    public volatile ImageAnalysisBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public volatile ImageAnalysisBuilder b;
    private final Object g;
    private RequestCoordinator.RequestState TuitionPaymentFragmentspecialinlinedviewModeldefault3 = RequestCoordinator.RequestState.CLEARED;
    private RequestCoordinator.RequestState TuitionPaymentFragmentspecialinlinedviewModeldefault1 = RequestCoordinator.RequestState.CLEARED;

    public getDefaultTargetResolution(Object obj, RequestCoordinator requestCoordinator) {
        this.g = obj;
        this.TuitionPaymentFragmentbindingInflater1 = requestCoordinator;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        synchronized (this.g) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != RequestCoordinator.RequestState.RUNNING) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = RequestCoordinator.RequestState.RUNNING;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        synchronized (this.g) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = RequestCoordinator.RequestState.CLEARED;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != RequestCoordinator.RequestState.CLEARED) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = RequestCoordinator.RequestState.CLEARED;
                this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final void g() {
        synchronized (this.g) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == RequestCoordinator.RequestState.RUNNING) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = RequestCoordinator.RequestState.PAUSED;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.g();
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == RequestCoordinator.RequestState.RUNNING) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = RequestCoordinator.RequestState.PAUSED;
                this.b.g();
            }
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean asBinder() {
        boolean z;
        synchronized (this.g) {
            z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == RequestCoordinator.RequestState.RUNNING || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean a() {
        boolean z;
        synchronized (this.g) {
            z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == RequestCoordinator.RequestState.SUCCESS || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        boolean z;
        synchronized (this.g) {
            z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == RequestCoordinator.RequestState.CLEARED && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1(ImageAnalysisBuilder imageAnalysisBuilder) {
        if (!(imageAnalysisBuilder instanceof getDefaultTargetResolution)) {
            return false;
        }
        getDefaultTargetResolution getdefaulttargetresolution = (getDefaultTargetResolution) imageAnalysisBuilder;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(getdefaulttargetresolution.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.b.TuitionPaymentFragmentbindingInflater1(getdefaulttargetresolution.b);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageAnalysisBuilder imageAnalysisBuilder) {
        boolean z;
        synchronized (this.g) {
            RequestCoordinator requestCoordinator = this.TuitionPaymentFragmentbindingInflater1;
            z = requestCoordinator == null || requestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageAnalysisBuilder imageAnalysisBuilder) {
        boolean z;
        synchronized (this.g) {
            RequestCoordinator requestCoordinator = this.TuitionPaymentFragmentbindingInflater1;
            if (requestCoordinator == null || requestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this)) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != RequestCoordinator.RequestState.FAILED) {
                    z = imageAnalysisBuilder.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else if (!imageAnalysisBuilder.equals(this.b) || (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != RequestCoordinator.RequestState.SUCCESS && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != RequestCoordinator.RequestState.FAILED)) {
                }
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageAnalysisBuilder imageAnalysisBuilder) {
        boolean z;
        synchronized (this.g) {
            RequestCoordinator requestCoordinator = this.TuitionPaymentFragmentbindingInflater1;
            z = (requestCoordinator == null || requestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this)) && imageAnalysisBuilder.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, defpackage.ImageAnalysisBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1() {
        boolean z;
        synchronized (this.g) {
            z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1() || this.b.TuitionPaymentFragmentbindingInflater1();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void g(ImageAnalysisBuilder imageAnalysisBuilder) {
        synchronized (this.g) {
            if (imageAnalysisBuilder.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = RequestCoordinator.RequestState.SUCCESS;
            } else if (imageAnalysisBuilder.equals(this.b)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.TuitionPaymentFragmentbindingInflater1;
            if (requestCoordinator != null) {
                requestCoordinator.g(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void b(ImageAnalysisBuilder imageAnalysisBuilder) {
        synchronized (this.g) {
            if (!imageAnalysisBuilder.equals(this.b)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = RequestCoordinator.RequestState.FAILED;
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != RequestCoordinator.RequestState.RUNNING) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = RequestCoordinator.RequestState.RUNNING;
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.TuitionPaymentFragmentbindingInflater1;
            if (requestCoordinator != null) {
                requestCoordinator.b(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator b() {
        RequestCoordinator requestCoordinatorB;
        synchronized (this.g) {
            RequestCoordinator requestCoordinator = this.TuitionPaymentFragmentbindingInflater1;
            requestCoordinatorB = requestCoordinator != null ? requestCoordinator.b() : this;
        }
        return requestCoordinatorB;
    }
}
