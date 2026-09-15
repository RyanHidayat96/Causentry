package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0004\u0012\u00020\u00140\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012"}, d2 = {"Landroidx/compose/ui/text/platform/URLSpanCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/UrlAnnotation;", "p0", "Landroid/text/style/URLSpan;", "toURLSpan", "(Landroidx/compose/ui/text/UrlAnnotation;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroid/text/style/ClickableSpan;", "toClickableSpan", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroid/text/style/ClickableSpan;", "Ljava/util/WeakHashMap;", "spansByAnnotation", "Ljava/util/WeakHashMap;", "urlSpansByAnnotation", "Landroidx/compose/ui/text/platform/ComposeClickableSpan;", "linkSpansWithListenerByAnnotation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class URLSpanCache {
    public static final int $stable = 8;
    private final WeakHashMap<UrlAnnotation, URLSpan> spansByAnnotation = new WeakHashMap<>();
    private final WeakHashMap<AnnotatedString.Range<LinkAnnotation.Url>, URLSpan> urlSpansByAnnotation = new WeakHashMap<>();
    private final WeakHashMap<AnnotatedString.Range<LinkAnnotation>, ComposeClickableSpan> linkSpansWithListenerByAnnotation = new WeakHashMap<>();

    public final URLSpan toURLSpan(UrlAnnotation p0) {
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.spansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(p0);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(p0.getUrl());
            weakHashMap.put(p0, uRLSpan);
        }
        return uRLSpan;
    }

    public final URLSpan toURLSpan(AnnotatedString.Range<LinkAnnotation.Url> p0) {
        WeakHashMap<AnnotatedString.Range<LinkAnnotation.Url>, URLSpan> weakHashMap = this.urlSpansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(p0);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(p0.getItem().getUrl());
            weakHashMap.put(p0, uRLSpan);
        }
        return uRLSpan;
    }

    public final ClickableSpan toClickableSpan(AnnotatedString.Range<LinkAnnotation> p0) {
        WeakHashMap<AnnotatedString.Range<LinkAnnotation>, ComposeClickableSpan> weakHashMap = this.linkSpansWithListenerByAnnotation;
        ComposeClickableSpan composeClickableSpan = weakHashMap.get(p0);
        if (composeClickableSpan == null) {
            composeClickableSpan = new ComposeClickableSpan(p0.getItem());
            weakHashMap.put(p0, composeClickableSpan);
        }
        return composeClickableSpan;
    }
}
