package androidx.camera.core.processing;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class SurfaceEdge$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ SurfaceEdge.SettableSurface f$0;

    public /* synthetic */ SurfaceEdge$$ExternalSyntheticLambda2(SurfaceEdge.SettableSurface settableSurface) {
        this.f$0 = settableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.close();
    }
}
