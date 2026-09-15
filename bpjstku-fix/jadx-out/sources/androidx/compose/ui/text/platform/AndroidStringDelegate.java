package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformStringDelegate;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\f\u0010\nJ#\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\r\u0010\n"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "<init>", "()V", "", "p0", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/TuitionPaymentFragmentbindingInflater1;", "p1", "toUpperCase", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "toLowerCase", "capitalize", "decapitalize"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public final String toUpperCase(String p0, Locale p1) {
        String upperCase = p0.toUpperCase(p1);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public final String toLowerCase(String p0, Locale p1) {
        String lowerCase = p0.toLowerCase(p1);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public final String capitalize(String p0, Locale p1) {
        if (p0.length() <= 0) {
            return p0;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = p0.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.titlecase(cCharAt, p1) : String.valueOf(cCharAt)));
        String strSubstring = p0.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public final String decapitalize(String p0, Locale p1) {
        if (p0.length() <= 0) {
            return p0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) CharsKt.lowercase(p0.charAt(0), p1));
        String strSubstring = p0.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        return sb.toString();
    }
}
