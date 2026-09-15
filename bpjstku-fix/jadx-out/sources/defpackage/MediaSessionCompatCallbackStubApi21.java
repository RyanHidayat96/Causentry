package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\u000f"}, d2 = {"LMediaSessionCompatCallbackStubApi21;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Ljava/util/Locale;", "b", "(Landroid/content/Context;)Ljava/util/Locale;", "TuitionPaymentFragmentbindingInflater1", "p1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Ljava/util/Locale;)Ljava/util/Locale;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/util/Locale;)V"}, k = 1, mv = {1, 4, 2})
public final class MediaSessionCompatCallbackStubApi21 {
    public static final MediaSessionCompatCallbackStubApi21 INSTANCE = new MediaSessionCompatCallbackStubApi21();

    private MediaSessionCompatCallbackStubApi21() {
    }

    @JvmStatic
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, Locale p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        String string = p1.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        p0.getSharedPreferences("pref_language", 0).edit().putString("key_default_language", string).apply();
    }

    @JvmStatic
    public static final void b(Context p0, Locale p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Locale.setDefault(p1);
        String string = p1.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        p0.getSharedPreferences("pref_language", 0).edit().putString("key_language", string).apply();
    }

    public final Locale TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, Locale p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Locale localeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(p0);
        if (localeTuitionPaymentFragmentbindingInflater1 != null && localeTuitionPaymentFragmentbindingInflater1 != null) {
            return localeTuitionPaymentFragmentbindingInflater1;
        }
        b(p0, p1);
        return p1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006e A[RETURN] */
    @JvmStatic
    public static final Locale b(Context p0) {
        Locale locale;
        Locale locale2;
        Intrinsics.checkNotNullParameter(p0, "");
        String string = p0.getSharedPreferences("pref_language", 0).getString("key_default_language", null);
        if (string != null) {
            List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{"_"}, false, 0, 6, (Object) null);
            int size = listSplit$default.size();
            if (size == 1) {
                locale = new Locale((String) listSplit$default.get(0));
            } else if (size != 2) {
                if (size == 3) {
                    locale = new Locale((String) listSplit$default.get(0), (String) listSplit$default.get(1), (String) listSplit$default.get(2));
                } else {
                    locale2 = Locale.ENGLISH;
                }
                if (locale2 != null) {
                    return locale2;
                }
            } else {
                locale = new Locale((String) listSplit$default.get(0), (String) listSplit$default.get(1));
            }
            locale2 = locale;
            if (locale2 != null) {
                return locale2;
            }
        }
        Locale locale3 = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale3, "");
        return locale3;
    }

    @JvmStatic
    public static final Locale TuitionPaymentFragmentbindingInflater1(Context p0) {
        Locale locale;
        Intrinsics.checkNotNullParameter(p0, "");
        String string = p0.getSharedPreferences("pref_language", 0).getString("key_language", null);
        if (string != null) {
            List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{"_"}, false, 0, 6, (Object) null);
            int size = listSplit$default.size();
            if (size == 1) {
                locale = new Locale((String) listSplit$default.get(0));
            } else if (size == 2) {
                locale = new Locale((String) listSplit$default.get(0), (String) listSplit$default.get(1));
            } else {
                locale = size != 3 ? null : new Locale((String) listSplit$default.get(0), (String) listSplit$default.get(1), (String) listSplit$default.get(2));
            }
            if (locale != null) {
                return locale;
            }
        }
        return null;
    }
}
