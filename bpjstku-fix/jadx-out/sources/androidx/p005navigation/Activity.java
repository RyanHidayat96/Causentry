package androidx.p005navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.navigation.ActivityKt__Activity_androidKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/app/Activity;", "", "p0", "Landroidx/navigation/NavController;", "findNavController", "(Landroid/app/Activity;I)Landroidx/navigation/NavController;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/ActivityKt")
final /* synthetic */ class Activity {
    public static final NavController findNavController(android.app.Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        return Navigation.findNavController(activity, i);
    }
}
