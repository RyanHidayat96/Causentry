package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0082\b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "p0", "p1", "p2", "Landroidx/compose/ui/input/pointer/ProcessResult;", "ProcessResult", "(ZZZ)I", "", "toInt", "(Z)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PointerInputEventProcessorKt {
    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public static final int ProcessResult(boolean z, boolean z2, boolean z3) {
        return ProcessResult.m5592constructorimpl((z ? 1 : 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 2));
    }
}
