package androidx.p005navigation;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavigatorProvider;", "Lkotlin/reflect/KClass;", "p0", "get", "(Landroidx/navigation/NavigatorProvider;Lkotlin/reflect/KClass;)Landroidx/navigation/Navigator;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavigatorProviderKt")
final /* synthetic */ class NavigatorProviderKt__NavigatorProvider_androidKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        return (T) navigatorProvider.getNavigator(JvmClassMappingKt.getJavaClass((KClass) kClass));
    }
}
