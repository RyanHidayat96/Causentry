package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015"}, d2 = {"Landroidx/window/embedding/ActivityFilter;", "", "Landroid/content/ComponentName;", "p0", "", "p1", "<init>", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/app/Activity;", "matchesActivity", "(Landroid/app/Activity;)Z", "Landroid/content/Intent;", "matchesIntent", "(Landroid/content/Intent;)Z", "toString", "()Ljava/lang/String;", "componentName", "Landroid/content/ComponentName;", "getComponentName", "()Landroid/content/ComponentName;", "intentAction", "Ljava/lang/String;", "getIntentAction"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName, String str) {
        Intrinsics.checkNotNullParameter(componentName, "");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String className = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "");
        String str2 = packageName;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        String str3 = className;
        if (str3.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "*", false, 2, (Object) null) && StringsKt.indexOf$default((CharSequence) str2, "*", 0, false, 6, (Object) null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (StringsKt.contains$default((CharSequence) str3, (CharSequence) "*", false, 2, (Object) null) && StringsKt.indexOf$default((CharSequence) str3, "*", 0, false, 6, (Object) null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public final boolean matchesIntent(Intent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(p0.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        return str == null || Intrinsics.areEqual(str, p0.getAction());
    }

    public final boolean matchesActivity(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(p0, this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        if (str == null) {
            return true;
        }
        Intent intent = p0.getIntent();
        return Intrinsics.areEqual(str, intent == null ? null : intent.getAction());
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) p0;
        return Intrinsics.areEqual(this.componentName, activityFilter.componentName) && Intrinsics.areEqual(this.intentAction, activityFilter.intentAction);
    }

    public final int hashCode() {
        int iHashCode = this.componentName.hashCode();
        String str = this.intentAction;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityFilter(componentName=");
        sb.append(this.componentName);
        sb.append(", intentAction=");
        sb.append((Object) this.intentAction);
        sb.append(')');
        return sb.toString();
    }
}
