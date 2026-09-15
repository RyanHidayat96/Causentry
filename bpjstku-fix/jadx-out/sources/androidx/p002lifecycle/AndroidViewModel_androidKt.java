package androidx.p002lifecycle;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/AndroidViewModel;", "Landroid/app/Application;", "getApplication", "(Landroidx/lifecycle/AndroidViewModel;)Landroid/app/Application;", "application"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidViewModel_androidKt {
    public static final Application getApplication(AndroidViewModel androidViewModel) {
        Intrinsics.checkNotNullParameter(androidViewModel, "");
        return androidViewModel.getApplication();
    }
}
