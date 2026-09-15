package androidx.compose.ui.text.intl;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "", "", "p0", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/TuitionPaymentFragmentbindingInflater1;", "parseLanguageTag", "(Ljava/lang/String;)Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PlatformLocaleDelegate {
    LocaleList getCurrent();

    java.util.Locale parseLanguageTag(String p0);
}
