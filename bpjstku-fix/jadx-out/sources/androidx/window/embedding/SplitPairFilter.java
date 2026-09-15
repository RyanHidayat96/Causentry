package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a"}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "Landroid/content/ComponentName;", "p0", "p1", "", "p2", "<init>", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/app/Activity;", "Landroid/content/Intent;", "matchesActivityIntentPair", "(Landroid/app/Activity;Landroid/content/Intent;)Z", "matchesActivityPair", "(Landroid/app/Activity;Landroid/app/Activity;)Z", "toString", "()Ljava/lang/String;", "primaryActivityName", "Landroid/content/ComponentName;", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "secondaryActivityIntentAction", "Ljava/lang/String;", "getSecondaryActivityIntentAction", "secondaryActivityName", "getSecondaryActivityName"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    public SplitPairFilter(ComponentName componentName, ComponentName componentName2, String str) {
        Intrinsics.checkNotNullParameter(componentName, "");
        Intrinsics.checkNotNullParameter(componentName2, "");
        this.primaryActivityName = componentName;
        this.secondaryActivityName = componentName2;
        this.secondaryActivityIntentAction = str;
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String className = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "");
        String packageName2 = componentName2.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "");
        String className2 = componentName2.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "");
        String str2 = packageName;
        if (str2.length() != 0) {
            String str3 = packageName2;
            if (str3.length() != 0) {
                String str4 = className;
                if (str4.length() != 0) {
                    String str5 = className2;
                    if (str5.length() != 0) {
                        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "*", false, 2, (Object) null) && StringsKt.indexOf$default((CharSequence) str2, "*", 0, false, 6, (Object) null) != packageName.length() - 1) {
                            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                        }
                        if (StringsKt.contains$default((CharSequence) str4, (CharSequence) "*", false, (int) r11, (Object) null) && StringsKt.indexOf$default((CharSequence) str4, "*", 0, false, 6, (Object) null) != className.length() - 1) {
                            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                        }
                        if (StringsKt.contains$default(str3, "*", (boolean) r13, (int) r11, (Object) null) && StringsKt.indexOf$default((CharSequence) str3, "*", 0, false, 6, (Object) null) != packageName2.length() - 1) {
                            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                        }
                        if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "*", false, 2, (Object) null) && StringsKt.indexOf$default((CharSequence) str5, "*", 0, false, 6, (Object) null) != className2.length() - 1) {
                            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                        }
                        return;
                    }
                }
                throw new IllegalArgumentException("Activity class name must not be empty.".toString());
            }
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final boolean matchesActivityPair(Activity p0, Activity p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        boolean z = MatcherUtils.INSTANCE.areComponentsMatching$window_release(p0.getComponentName(), this.primaryActivityName) && MatcherUtils.INSTANCE.areComponentsMatching$window_release(p1.getComponentName(), this.secondaryActivityName);
        if (p1.getIntent() == null) {
            return z;
        }
        if (z) {
            Intent intent = p1.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "");
            if (matchesActivityIntentPair(p0, intent)) {
                return true;
            }
        }
        return false;
    }

    public final boolean matchesActivityIntentPair(Activity p0, Intent p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(p0.getComponentName(), this.primaryActivityName) || !MatcherUtils.INSTANCE.areComponentsMatching$window_release(p1.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || Intrinsics.areEqual(str, p1.getAction());
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) p0;
        return Intrinsics.areEqual(this.primaryActivityName, splitPairFilter.primaryActivityName) && Intrinsics.areEqual(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && Intrinsics.areEqual(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final int hashCode() {
        int iHashCode = this.primaryActivityName.hashCode();
        int iHashCode2 = this.secondaryActivityName.hashCode();
        String str = this.secondaryActivityIntentAction;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitPairFilter{primaryActivityName=");
        sb.append(this.primaryActivityName);
        sb.append(", secondaryActivityName=");
        sb.append(this.secondaryActivityName);
        sb.append(", secondaryActivityAction=");
        sb.append((Object) this.secondaryActivityIntentAction);
        sb.append('}');
        return sb.toString();
    }
}
