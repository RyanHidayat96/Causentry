package androidx.p005navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.navigation.ViewKt__View_androidKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Landroidx/navigation/NavController;", "findNavController", "(Landroid/view/View;)Landroidx/navigation/NavController;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/ViewKt")
final /* synthetic */ class View {
    public static final NavController findNavController(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Navigation.findNavController(view);
    }
}
