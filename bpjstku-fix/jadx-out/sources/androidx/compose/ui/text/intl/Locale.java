package androidx.compose.ui.text.intl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\nR\u001e\u0010\u0012\u001a\u00060\u0002j\u0002`\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0019\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u001b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/TuitionPaymentFragmentbindingInflater1;", "p0", "<init>", "(Ljava/util/Locale;)V", "", "(Ljava/lang/String;)V", "toLanguageTag", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "platformLocale", "Ljava/util/Locale;", "getPlatformLocale", "()Ljava/util/Locale;", "getLanguage", "language", "getScript", "script", "getRegion", "region", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Locale {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final java.util.Locale platformLocale;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/intl/Locale;", "getCurrent", "()Landroidx/compose/ui/text/intl/Locale;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Locale(java.util.Locale locale) {
        this.platformLocale = locale;
    }

    public final java.util.Locale getPlatformLocale() {
        return this.platformLocale;
    }

    public Locale(String str) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(str));
    }

    public final String getLanguage() {
        return PlatformLocale_jvmKt.getLanguage(this.platformLocale);
    }

    public final String getScript() {
        return PlatformLocale_jvmKt.getScript(this.platformLocale);
    }

    public final String getRegion() {
        return PlatformLocale_jvmKt.getRegion(this.platformLocale);
    }

    public final String toLanguageTag() {
        return PlatformLocale_jvmKt.getLanguageTag(this.platformLocale);
    }

    public final boolean equals(Object p0) {
        if (p0 == null || !(p0 instanceof Locale)) {
            return false;
        }
        if (this == p0) {
            return true;
        }
        return Intrinsics.areEqual(toLanguageTag(), ((Locale) p0).toLanguageTag());
    }

    public final int hashCode() {
        return toLanguageTag().hashCode();
    }

    public final String toString() {
        return toLanguageTag();
    }
}
