package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Landroidx/work/InputMergerFactory;", "", "<init>", "()V", "", "p0", "Landroidx/work/InputMerger;", "createInputMerger", "(Ljava/lang/String;)Landroidx/work/InputMerger;", "createInputMergerWithDefaultFallback"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class InputMergerFactory {
    public abstract InputMerger createInputMerger(String p0);

    public final InputMerger createInputMergerWithDefaultFallback(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        InputMerger inputMergerCreateInputMerger = createInputMerger(p0);
        return inputMergerCreateInputMerger == null ? InputMergerKt.fromClassName(p0) : inputMergerCreateInputMerger;
    }
}
