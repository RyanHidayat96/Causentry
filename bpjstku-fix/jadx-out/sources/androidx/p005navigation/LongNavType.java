package androidx.p005navigation;

import android.os.Bundle;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH\u0097\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/navigation/LongNavType;", "Landroidx/navigation/NavType;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "", "p1", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LongNavType extends NavType<Long> {
    public LongNavType() {
        super(false);
    }

    @Override // androidx.p005navigation.NavType
    public final /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Long l) {
        put(bundle, str, l.longValue());
    }

    @Override // androidx.p005navigation.NavType
    public final String getName() {
        return "long";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.p005navigation.NavType
    public final Long parseValue(String p0) {
        String strSubstring;
        long j;
        Intrinsics.checkNotNullParameter(p0, "");
        if (StringsKt.endsWith$default(p0, "L", false, 2, (Object) null)) {
            strSubstring = p0.substring(0, p0.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else {
            strSubstring = p0;
        }
        if (StringsKt.startsWith$default(p0, "0x", false, 2, (Object) null)) {
            String strSubstring2 = strSubstring.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            j = Long.parseLong(strSubstring2, CharsKt.checkRadix(16));
        } else {
            j = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j);
    }

    public final void put(Bundle p0, String p1, long p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        SavedStateWriter.m7475putLongimpl(SavedStateWriter.m7454constructorimpl(p0), p1, p2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.p005navigation.NavType
    public final Long get(Bundle p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return Long.valueOf(SavedStateReader.m7409getLongimpl(SavedStateReader.m7368constructorimpl(p0), p1));
    }
}
