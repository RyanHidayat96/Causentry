package androidx.p005navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/NavArgs;", "Args", "Landroid/app/Activity;", "Landroidx/navigation/NavArgsLazy;", "navArgs", "(Landroid/app/Activity;)Landroidx/navigation/NavArgsLazy;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/ActivityNavArgsLazyKt")
final /* synthetic */ class ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt {
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.reifiedOperationMarker(4, "Args");
        return new NavArgsLazy<>(Reflection.getOrCreateKotlinClass(NavArgs.class), new Function0<Bundle>() { // from class: androidx.navigation.ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt.navArgs.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Bundle invoke() {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Activity activity2 = activity;
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        StringBuilder sb = new StringBuilder("Activity ");
                        sb.append(activity2);
                        sb.append(" has null extras in ");
                        sb.append(intent);
                        throw new IllegalStateException(sb.toString());
                    }
                    if (extras != null) {
                        return extras;
                    }
                }
                StringBuilder sb2 = new StringBuilder("Activity ");
                sb2.append(activity);
                sb2.append(" has a null Intent");
                throw new IllegalStateException(sb2.toString());
            }
        });
    }
}
