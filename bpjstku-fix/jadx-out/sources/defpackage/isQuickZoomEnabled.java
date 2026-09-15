package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.ViewModel;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.ViewModelStores;
import kotlin.Pair;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class isQuickZoomEnabled {

    public static final class b implements ViewModelProvider.Factory {
        private /* synthetic */ FileTransformFactory TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ setQuickZoomEnabled TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        b(FileTransformFactory fileTransformFactory, setQuickZoomEnabled setquickzoomenabled) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = fileTransformFactory;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = setquickzoomenabled;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends ViewModel> T create(Class<T> cls) {
            return (T) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1);
        }
    }

    public static final <T extends ViewModel> T b(ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent, final setQuickZoomEnabled<T> setquickzoomenabled) {
        ViewModelStore viewModelStoreOf;
        T t;
        LifecycleOwner lifecycleOwner = setquickzoomenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (setquickzoomenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            viewModelStoreOf = setquickzoomenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke().getViewModelStore();
            Intrinsics.checkExpressionValueIsNotNull(viewModelStoreOf, "");
        } else if (lifecycleOwner instanceof FragmentActivity) {
            viewModelStoreOf = ViewModelStores.of((FragmentActivity) lifecycleOwner);
            Intrinsics.checkExpressionValueIsNotNull(viewModelStoreOf, "");
        } else if (lifecycleOwner instanceof Fragment) {
            viewModelStoreOf = ViewModelStores.of((Fragment) lifecycleOwner);
            Intrinsics.checkExpressionValueIsNotNull(viewModelStoreOf, "");
        } else {
            StringBuilder sb = new StringBuilder("Can't getByClass ViewModel '");
            sb.append(setquickzoomenabled.b);
            sb.append("' on ");
            sb.append(lifecycleOwner);
            sb.append(" - Is not a FragmentActivity nor a Fragment neither a valid ViewModelStoreOwner");
            throw new IllegalStateException(sb.toString().toString());
        }
        final ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStoreOf, new b(zoomGestureDetectorZoomEvent.b, setquickzoomenabled));
        final Class<T> javaClass = JvmClassMappingKt.getJavaClass((KClass) setquickzoomenabled.b);
        getFocusX.Companion companion = getFocusX.INSTANCE;
        isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.compareTo(Level.DEBUG) <= 0) {
            getFocusX.Companion companion2 = getFocusX.INSTANCE;
            getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.DEBUG, "!- ViewModelProvider getting instance");
            Pair pairTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isUsingCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function0<T>() { // from class: org.koin.android.viewmodel.ViewModelResolutionKt$getInstance$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ Object invoke() {
                    if (setquickzoomenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        return viewModelProvider.get(setquickzoomenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString(), javaClass);
                    }
                    return viewModelProvider.get(javaClass);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
            T t2 = (T) pairTuitionPaymentFragmentspecialinlinedviewModeldefault2.component1();
            double dDoubleValue = ((Number) pairTuitionPaymentFragmentspecialinlinedviewModeldefault2.component2()).doubleValue();
            getFocusX.Companion companion3 = getFocusX.INSTANCE;
            getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.DEBUG, "!- ViewModelProvider got instance in ".concat(String.valueOf(dDoubleValue)));
            Intrinsics.checkExpressionValueIsNotNull(t2, "");
            return t2;
        }
        if (setquickzoomenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            t = (T) viewModelProvider.get(setquickzoomenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString(), javaClass);
        } else {
            t = (T) viewModelProvider.get(javaClass);
        }
        Intrinsics.checkExpressionValueIsNotNull(t, "");
        return t;
    }
}
