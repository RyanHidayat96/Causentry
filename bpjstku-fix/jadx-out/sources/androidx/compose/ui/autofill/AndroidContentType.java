package androidx.compose.ui.autofill;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0097\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/autofill/AndroidContentType;", "Landroidx/compose/ui/autofill/ContentType;", "", "", "p0", "<init>", "(Ljava/util/Set;)V", "plus", "(Landroidx/compose/ui/autofill/ContentType;)Landroidx/compose/ui/autofill/ContentType;", "androidAutofillHints", "Ljava/util/Set;", "getAndroidAutofillHints", "()Ljava/util/Set;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AndroidContentType implements ContentType {
    private final Set<String> androidAutofillHints;

    public AndroidContentType(Set<String> set) {
        this.androidAutofillHints = set;
    }

    public final Set<String> getAndroidAutofillHints() {
        return this.androidAutofillHints;
    }

    @Override // androidx.compose.ui.autofill.ContentType
    public final ContentType plus(ContentType p0) {
        Intrinsics.checkNotNull(p0, "");
        return new AndroidContentType(SetsKt.plus((Set) this.androidAutofillHints, (Iterable) ((AndroidContentType) p0).androidAutofillHints));
    }
}
