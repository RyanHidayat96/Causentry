package androidx.p005navigation.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.p005navigation.NavArgs;
import androidx.p005navigation.NavArgsLazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/NavArgs;", "Args", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavArgsLazy;", "navArgs", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavArgsLazy;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FragmentNavArgsLazyKt {
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(final Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.reifiedOperationMarker(4, "Args");
        return new NavArgsLazy<>(Reflection.getOrCreateKotlinClass(NavArgs.class), new Function0<Bundle>() { // from class: androidx.navigation.fragment.FragmentNavArgsLazyKt.navArgs.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Bundle invoke() {
                Bundle arguments = fragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" has null arguments");
                throw new IllegalStateException(sb.toString());
            }
        });
    }
}
