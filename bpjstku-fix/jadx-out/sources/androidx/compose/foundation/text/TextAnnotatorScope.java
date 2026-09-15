package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/text/TextAnnotatorScope;", "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "p0", "<init>", "(Landroidx/compose/ui/text/AnnotatedString$Builder;)V", "Landroidx/compose/ui/text/SpanStyle;", "", "p1", "p2", "", "replaceStyle", "(Landroidx/compose/ui/text/SpanStyle;II)V", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TextAnnotatorScope {
    private final AnnotatedString.Builder builder;

    public TextAnnotatorScope(AnnotatedString.Builder builder) {
        this.builder = builder;
    }

    public final void replaceStyle(SpanStyle p0, int p1, int p2) {
        this.builder.addStyle(p0, p1, p2);
    }
}
