package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class AttachedSurfaceInfo<T> implements getSurfaceConfig<T> {
    private final T b;

    static {
        new AttachedSurfaceInfo(null);
    }

    public AttachedSurfaceInfo(T t) {
        this.b = t;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final T get() {
        return this.b;
    }
}
