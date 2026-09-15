package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\r8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroid/content/ComponentName;", "p1", "", "areActivityOrIntentComponentsMatching$window_release", "(Landroid/app/Activity;Landroid/content/ComponentName;)Z", "areComponentsMatching$window_release", "(Landroid/content/ComponentName;Landroid/content/ComponentName;)Z", "", "wildcardMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", "sDebugMatchers", "Z", "sMatchersTag", "Ljava/lang/String;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    public final boolean areComponentsMatching$window_release(ComponentName p0, ComponentName p1) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 == null) {
            return Intrinsics.areEqual(p1.getPackageName(), "*") && Intrinsics.areEqual(p1.getClassName(), "*");
        }
        String string = p0.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (StringsKt.contains$default((CharSequence) string, (CharSequence) "*", false, 2, (Object) null)) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.".toString());
        }
        if (Intrinsics.areEqual(p0.getPackageName(), p1.getPackageName())) {
            z = true;
        } else {
            String packageName = p0.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            String packageName2 = p1.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "");
            if (wildcardMatch(packageName, packageName2)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (Intrinsics.areEqual(p0.getClassName(), p1.getClassName())) {
            z2 = true;
        } else {
            String className = p0.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            String className2 = p1.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "");
            if (wildcardMatch(className, className2)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z && z2;
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity p0, ComponentName p1) {
        ComponentName component;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (areComponentsMatching$window_release(p0.getComponentName(), p1)) {
            return true;
        }
        Intent intent = p0.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, p1);
    }

    private final boolean wildcardMatch(String p0, String p1) {
        String str = p1;
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "*", false, 2, (Object) null)) {
            return false;
        }
        if (Intrinsics.areEqual(p1, "*")) {
            return true;
        }
        if (StringsKt.indexOf$default((CharSequence) str, "*", 0, false, 6, (Object) null) != StringsKt.lastIndexOf$default((CharSequence) str, "*", 0, false, 6, (Object) null) || !StringsKt.endsWith$default(p1, "*", false, 2, (Object) null)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        String strSubstring = p1.substring(0, p1.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return StringsKt.startsWith$default(p0, strSubstring, false, 2, (Object) null);
    }
}
