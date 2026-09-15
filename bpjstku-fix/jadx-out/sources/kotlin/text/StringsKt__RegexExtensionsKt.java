package kotlin.text;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0006\u001a\"\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0087\b¢\u0006\u0004\b\u0002\u0010\b"}, d2 = {"", "Lkotlin/text/Regex;", "toRegex", "(Ljava/lang/String;)Lkotlin/text/Regex;", "Lkotlin/text/RegexOption;", "p0", "(Ljava/lang/String;Lkotlin/text/RegexOption;)Lkotlin/text/Regex;", "", "(Ljava/lang/String;Ljava/util/Set;)Lkotlin/text/Regex;"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__RegexExtensionsKt extends StringsKt__RegexExtensionsJVMKt {
    private static final Regex toRegex(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Regex(str);
    }

    private static final Regex toRegex(String str, RegexOption regexOption) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(regexOption, "");
        return new Regex(str, regexOption);
    }

    private static final Regex toRegex(String str, Set<? extends RegexOption> set) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        return new Regex(str, set);
    }
}
