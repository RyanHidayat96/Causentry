package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022(\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"R", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "p0", "Lkotlin/Function3;", "Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "Landroidx/compose/ui/text/TextRange;", "Lkotlin/ParameterName;", "p1", "getIndexTransformationType", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;ILkotlin/jvm/functions/Function3;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransformedTextFieldStateKt {
    public static final <R> R getIndexTransformationType(TransformedTextFieldState transformedTextFieldState, int i, Function3<? super IndexTransformationType, ? super TextRange, ? super TextRange, ? extends R> function3) {
        IndexTransformationType indexTransformationType;
        long jM1549mapFromTransformedjx7JFs = transformedTextFieldState.m1549mapFromTransformedjx7JFs(i);
        long jM1552mapToTransformedGEjPoXI = transformedTextFieldState.m1552mapToTransformedGEjPoXI(jM1549mapFromTransformedjx7JFs);
        if (TextRange.m6391getCollapsedimpl(jM1549mapFromTransformedjx7JFs) && TextRange.m6391getCollapsedimpl(jM1552mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Untransformed;
        } else if (!TextRange.m6391getCollapsedimpl(jM1549mapFromTransformedjx7JFs) && !TextRange.m6391getCollapsedimpl(jM1552mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Replacement;
        } else if (TextRange.m6391getCollapsedimpl(jM1549mapFromTransformedjx7JFs) && !TextRange.m6391getCollapsedimpl(jM1552mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Insertion;
        } else {
            indexTransformationType = IndexTransformationType.Deletion;
        }
        return function3.invoke(indexTransformationType, TextRange.m6385boximpl(jM1549mapFromTransformedjx7JFs), TextRange.m6385boximpl(jM1552mapToTransformedGEjPoXI));
    }
}
