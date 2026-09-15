package defpackage;

import com.bumptech.glide.request.RequestCoordinator;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomOrderedResolutions implements RequestCoordinator, ImageAnalysisBuilder {
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public volatile ImageAnalysisBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public volatile ImageAnalysisBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final RequestCoordinator b;
    private final Object g;
    private RequestCoordinator.RequestState TuitionPaymentFragmentbindingInflater1 = RequestCoordinator.RequestState.CLEARED;
    private RequestCoordinator.RequestState asInterface = RequestCoordinator.RequestState.CLEARED;

    public setCustomOrderedResolutions(Object obj, RequestCoordinator requestCoordinator) {
        this.g = obj;
        this.b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageAnalysisBuilder imageAnalysisBuilder) {
        boolean z;
        synchronized (this.g) {
            RequestCoordinator requestCoordinator = this.b;
            z = (requestCoordinator == null || requestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this)) && (imageAnalysisBuilder.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) || this.TuitionPaymentFragmentbindingInflater1 != RequestCoordinator.RequestState.SUCCESS);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageAnalysisBuilder imageAnalysisBuilder) {
        boolean z;
        synchronized (this.g) {
            RequestCoordinator requestCoordinator = this.b;
            z = (requestCoordinator == null || requestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this)) && imageAnalysisBuilder.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && !TuitionPaymentFragmentbindingInflater1();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageAnalysisBuilder imageAnalysisBuilder) {
        boolean z;
        synchronized (this.g) {
            RequestCoordinator requestCoordinator = this.b;
            z = (requestCoordinator == null || requestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this)) && imageAnalysisBuilder.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentbindingInflater1 != RequestCoordinator.RequestState.PAUSED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, defpackage.ImageAnalysisBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1() {
        boolean z;
        synchronized (this.g) {
            z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1() || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void g(ImageAnalysisBuilder imageAnalysisBuilder) {
        synchronized (this.g) {
            if (imageAnalysisBuilder.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                this.asInterface = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.b;
            if (requestCoordinator != null) {
                requestCoordinator.g(this);
            }
            if (!this.asInterface.isComplete) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void b(ImageAnalysisBuilder imageAnalysisBuilder) {
        synchronized (this.g) {
            if (!imageAnalysisBuilder.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                this.asInterface = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.b;
            if (requestCoordinator != null) {
                requestCoordinator.b(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator b() {
        RequestCoordinator requestCoordinatorB;
        synchronized (this.g) {
            RequestCoordinator requestCoordinator = this.b;
            requestCoordinatorB = requestCoordinator != null ? requestCoordinator.b() : this;
        }
        return requestCoordinatorB;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        synchronized (this.g) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            try {
                if (this.TuitionPaymentFragmentbindingInflater1 != RequestCoordinator.RequestState.SUCCESS && this.asInterface != RequestCoordinator.RequestState.RUNNING) {
                    this.asInterface = RequestCoordinator.RequestState.RUNNING;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.TuitionPaymentFragmentbindingInflater1 != RequestCoordinator.RequestState.RUNNING) {
                    this.TuitionPaymentFragmentbindingInflater1 = RequestCoordinator.RequestState.RUNNING;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
            } catch (Throwable th) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                throw th;
            }
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        synchronized (this.g) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
            this.TuitionPaymentFragmentbindingInflater1 = RequestCoordinator.RequestState.CLEARED;
            this.asInterface = RequestCoordinator.RequestState.CLEARED;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final void g() {
        synchronized (this.g) {
            if (!this.asInterface.isComplete) {
                this.asInterface = RequestCoordinator.RequestState.PAUSED;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.g();
            }
            if (!this.TuitionPaymentFragmentbindingInflater1.isComplete) {
                this.TuitionPaymentFragmentbindingInflater1 = RequestCoordinator.RequestState.PAUSED;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g();
            }
        }
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean asBinder() {
        boolean z;
        synchronized (this.g) {
            z = this.TuitionPaymentFragmentbindingInflater1 == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean a() {
        boolean z;
        synchronized (this.g) {
            z = this.TuitionPaymentFragmentbindingInflater1 == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        boolean z;
        synchronized (this.g) {
            z = this.TuitionPaymentFragmentbindingInflater1 == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // defpackage.ImageAnalysisBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1(ImageAnalysisBuilder imageAnalysisBuilder) {
        if (!(imageAnalysisBuilder instanceof setCustomOrderedResolutions)) {
            return false;
        }
        setCustomOrderedResolutions setcustomorderedresolutions = (setCustomOrderedResolutions) imageAnalysisBuilder;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            if (setcustomorderedresolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                return false;
            }
        } else if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(setcustomorderedresolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return false;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return setcustomorderedresolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(setcustomorderedresolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}
