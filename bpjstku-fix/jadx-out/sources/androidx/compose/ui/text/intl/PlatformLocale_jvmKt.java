package androidx.compose.ui.text.intl;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u0006\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004\"\u001c\u0010\b\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"\u001c\u0010\n\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004*\n\u0010\u000b\"\u00020\u00002\u00020\u0000"}, d2 = {"Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/TuitionPaymentFragmentbindingInflater1;", "", "getLanguageTag", "(Ljava/util/Locale;)Ljava/lang/String;", "getLanguage", "language", "getScript", "script", "getRegion", "region", "TuitionPaymentFragmentbindingInflater1"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PlatformLocale_jvmKt {
    public static final String getLanguage(java.util.Locale locale) {
        return locale.getLanguage();
    }

    public static final String getScript(java.util.Locale locale) {
        return locale.getScript();
    }

    public static final String getRegion(java.util.Locale locale) {
        return locale.getCountry();
    }

    public static final String getLanguageTag(java.util.Locale locale) {
        return locale.toLanguageTag();
    }
}
