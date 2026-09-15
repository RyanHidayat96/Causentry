package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "p0", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CacheTextLayoutInput {
    public static final int $stable = 0;
    private final TextLayoutInput textLayoutInput;

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public final int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        int iHashCode = textLayoutInput.getText().hashCode();
        int iHashCodeLayoutAffectingAttributes$ui_text = textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text();
        int iHashCode2 = textLayoutInput.getPlaceholders().hashCode();
        int maxLines = textLayoutInput.getMaxLines();
        int iHashCode3 = Boolean.hashCode(textLayoutInput.getSoftWrap());
        int iM6862hashCodeimpl = TextOverflow.m6862hashCodeimpl(textLayoutInput.getOverflow());
        int iHashCode4 = textLayoutInput.getDensity().hashCode();
        return (((((((((((((((((iHashCode * 31) + iHashCodeLayoutAffectingAttributes$ui_text) * 31) + iHashCode2) * 31) + maxLines) * 31) + iHashCode3) * 31) + iM6862hashCodeimpl) * 31) + iHashCode4) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + Constraints.m6891hashCodeimpl(textLayoutInput.getConstraints());
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) p0;
        return Intrinsics.areEqual(textLayoutInput.getText(), cacheTextLayoutInput.textLayoutInput.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.textLayoutInput.getStyle()) && Intrinsics.areEqual(textLayoutInput.getPlaceholders(), cacheTextLayoutInput.textLayoutInput.getPlaceholders()) && textLayoutInput.getMaxLines() == cacheTextLayoutInput.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == cacheTextLayoutInput.textLayoutInput.getSoftWrap() && TextOverflow.m6861equalsimpl0(textLayoutInput.getOverflow(), cacheTextLayoutInput.textLayoutInput.getOverflow()) && Intrinsics.areEqual(textLayoutInput.getDensity(), cacheTextLayoutInput.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.textLayoutInput.getFontFamilyResolver() && Constraints.m6881equalsimpl0(textLayoutInput.getConstraints(), cacheTextLayoutInput.textLayoutInput.getConstraints());
    }
}
