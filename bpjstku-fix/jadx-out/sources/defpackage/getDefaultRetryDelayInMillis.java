package defpackage;

import android.content.ComponentName;
import androidx.p005navigation.ActivityNavigator;
import androidx.p005navigation.fragment.DialogFragmentNavigator;
import androidx.p005navigation.fragment.FragmentNavigator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class getDefaultRetryDelayInMillis {
    public static final String b(Object obj) {
        String strB;
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof FragmentNavigator.Destination) {
            String className = ((FragmentNavigator.Destination) obj).getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            return className;
        }
        if (obj instanceof DialogFragmentNavigator.Destination) {
            String className2 = ((DialogFragmentNavigator.Destination) obj).getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "");
            return className2;
        }
        if (obj instanceof ActivityNavigator.Destination) {
            ComponentName component = ((ActivityNavigator.Destination) obj).getComponent();
            return (component == null || (strB = b(component)) == null) ? "Unknown" : strB;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = obj.getClass().getSimpleName();
        }
        Intrinsics.checkNotNullExpressionValue(canonicalName, "");
        return canonicalName;
    }

    private static String b(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "");
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        if (packageName.length() == 0) {
            String className = componentName.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            return className;
        }
        String className2 = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "");
        String packageName2 = componentName.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName2);
        sb.append(".");
        if (StringsKt.startsWith$default(className2, sb.toString(), false, 2, (Object) null)) {
            String className3 = componentName.getClassName();
            Intrinsics.checkNotNullExpressionValue(className3, "");
            return className3;
        }
        String className4 = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className4, "");
        if (StringsKt.contains$default((CharSequence) className4, '.', false, 2, (Object) null)) {
            String className5 = componentName.getClassName();
            Intrinsics.checkNotNullExpressionValue(className5, "");
            return className5;
        }
        String packageName3 = componentName.getPackageName();
        String className6 = componentName.getClassName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageName3);
        sb2.append(".");
        sb2.append(className6);
        return sb2.toString();
    }
}
