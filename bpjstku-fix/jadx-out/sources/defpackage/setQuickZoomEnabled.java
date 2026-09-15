package defpackage;

import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002BW\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nj\u0004\u0018\u0001`\u000f¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nj\u0004\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lorg/koin/android/viewmodel/ViewModelParameters;", ExifInterface.GPS_DIRECTION_TRUE, "", "clazz", "Lkotlin/reflect/KClass;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "from", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lorg/koin/android/viewmodel/ViewModelStoreOwnerDefinition;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Landroid/arch/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getClazz", "()Lkotlin/reflect/KClass;", "getFrom", "()Lkotlin/jvm/functions/Function0;", "getOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "getParameters", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "koin-android-viewmodel_release"}, k = 1, mv = {1, 1, 15})
public final class setQuickZoomEnabled<T> {
    final Function0<CoordinateTransform> TuitionPaymentFragmentbindingInflater1;
    final Function0<ViewModelStoreOwner> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final LifecycleOwner TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final mapPoint TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final KClass<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public setQuickZoomEnabled(KClass<T> kClass, LifecycleOwner lifecycleOwner, mapPoint mappoint, Function0<? extends ViewModelStoreOwner> function0, Function0<CoordinateTransform> function1) {
        this.b = kClass;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lifecycleOwner;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mappoint;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function0;
        this.TuitionPaymentFragmentbindingInflater1 = function1;
    }

    public /* synthetic */ setQuickZoomEnabled(KClass kClass, LifecycleOwner lifecycleOwner, mapPoint mappoint, Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, lifecycleOwner, (i & 4) != 0 ? null : mappoint, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function1);
    }
}
