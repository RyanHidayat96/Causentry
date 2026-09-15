package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/NoOpInputMergerFactory;", "Landroidx/work/InputMergerFactory;", "<init>", "()V", "", "p0", "", "createInputMerger", "(Ljava/lang/String;)Ljava/lang/Void;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NoOpInputMergerFactory extends InputMergerFactory {
    public static final NoOpInputMergerFactory INSTANCE = new NoOpInputMergerFactory();

    private NoOpInputMergerFactory() {
    }

    @Override // androidx.work.InputMergerFactory
    public final /* bridge */ /* synthetic */ InputMerger createInputMerger(String str) {
        return (InputMerger) m7514createInputMerger(str);
    }

    /* JADX INFO: renamed from: createInputMerger, reason: collision with other method in class */
    public final Void m7514createInputMerger(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return null;
    }
}
