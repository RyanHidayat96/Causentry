package androidx.compose.ui.text;

import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H'¢\u0006\u0004\b\t\u0010\bJ#\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H'¢\u0006\u0004\b\n\u0010\bJ#\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H'¢\u0006\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/PlatformStringDelegate;", "", "", "p0", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/TuitionPaymentFragmentbindingInflater1;", "p1", "toUpperCase", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "toLowerCase", "capitalize", "decapitalize"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PlatformStringDelegate {
    String capitalize(String p0, Locale p1);

    String decapitalize(String p0, Locale p1);

    String toLowerCase(String p0, Locale p1);

    String toUpperCase(String p0, Locale p1);
}
