package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0003\u0010\t\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0005\u0010\t\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0006\u0010\t\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0007\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"", "Landroidx/compose/ui/text/intl/Locale;", "p0", "toUpperCase", "(Ljava/lang/String;Landroidx/compose/ui/text/intl/Locale;)Ljava/lang/String;", "toLowerCase", "capitalize", "decapitalize", "Landroidx/compose/ui/text/intl/LocaleList;", "(Ljava/lang/String;Landroidx/compose/ui/text/intl/LocaleList;)Ljava/lang/String;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "stringDelegate", "Landroidx/compose/ui/text/PlatformStringDelegate;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StringKt {
    private static final PlatformStringDelegate stringDelegate = AndroidStringDelegate_androidKt.ActualStringDelegate();

    public static final String toUpperCase(String str, Locale locale) {
        return stringDelegate.toUpperCase(str, locale.getPlatformLocale());
    }

    public static final String toLowerCase(String str, Locale locale) {
        return stringDelegate.toLowerCase(str, locale.getPlatformLocale());
    }

    public static final String capitalize(String str, Locale locale) {
        return stringDelegate.capitalize(str, locale.getPlatformLocale());
    }

    public static final String decapitalize(String str, Locale locale) {
        return stringDelegate.decapitalize(str, locale.getPlatformLocale());
    }

    public static final String toUpperCase(String str, LocaleList localeList) {
        return toUpperCase(str, localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0));
    }

    public static final String toLowerCase(String str, LocaleList localeList) {
        return toLowerCase(str, localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0));
    }

    public static final String capitalize(String str, LocaleList localeList) {
        return capitalize(str, localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0));
    }

    public static final String decapitalize(String str, LocaleList localeList) {
        return decapitalize(str, localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0));
    }
}
