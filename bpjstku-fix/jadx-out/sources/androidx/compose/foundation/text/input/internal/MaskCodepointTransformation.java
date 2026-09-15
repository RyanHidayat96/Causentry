package androidx.compose.foundation.text.input.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/MaskCodepointTransformation;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "", "p0", "<init>", "(C)V", "component1", "()C", "copy", "(C)Landroidx/compose/foundation/text/input/internal/MaskCodepointTransformation;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p1", "transform", "(II)I", FirebaseAnalytics.Param.CHARACTER, "C", "getCharacter"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class MaskCodepointTransformation implements CodepointTransformation {
    private final char character;

    public MaskCodepointTransformation(char c) {
        this.character = c;
    }

    public final char getCharacter() {
        return this.character;
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int p0, int p1) {
        return this.character;
    }

    public static /* synthetic */ MaskCodepointTransformation copy$default(MaskCodepointTransformation maskCodepointTransformation, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            c = maskCodepointTransformation.character;
        }
        return maskCodepointTransformation.copy(c);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final char getCharacter() {
        return this.character;
    }

    public final MaskCodepointTransformation copy(char p0) {
        return new MaskCodepointTransformation(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof MaskCodepointTransformation) && this.character == ((MaskCodepointTransformation) p0).character;
    }

    public final int hashCode() {
        return Character.hashCode(this.character);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaskCodepointTransformation(character=");
        sb.append(this.character);
        sb.append(')');
        return sb.toString();
    }
}
