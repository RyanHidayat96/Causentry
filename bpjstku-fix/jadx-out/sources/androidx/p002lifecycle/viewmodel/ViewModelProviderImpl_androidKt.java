package androidx.p002lifecycle.viewmodel;

import androidx.p002lifecycle.ViewModel;
import androidx.p002lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "p0", "Lkotlin/reflect/KClass;", "p1", "Landroidx/lifecycle/viewmodel/CreationExtras;", "p2", "createViewModel", "(Landroidx/lifecycle/ViewModelProvider$Factory;Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewModelProviderImpl_androidKt {
    public static final <VM extends ViewModel> VM createViewModel(ViewModelProvider.Factory factory, KClass<VM> kClass, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(factory, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(creationExtras, "");
        try {
            try {
                return (VM) factory.create(kClass, creationExtras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(JvmClassMappingKt.getJavaClass((KClass) kClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(JvmClassMappingKt.getJavaClass((KClass) kClass), creationExtras);
        }
    }
}
