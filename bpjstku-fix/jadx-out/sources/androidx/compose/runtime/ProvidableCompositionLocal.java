package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0004\u001a\u00028\u0000H!¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0087\u0004¢\u0006\u0004\b\n\u0010\tJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0087\u0004¢\u0006\u0004\b\u000b\u0010\tJ/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0002\b\u000eH\u0087\u0004¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011H\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/CompositionLocal;", "Lkotlin/Function0;", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "provides", "providesDefault", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "providesComputed", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ValueHolder;", "p1", "updatedStateOf$runtime", "(Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/ValueHolder;", "valueHolderOf", "(Landroidx/compose/runtime/ProvidedValue;)Landroidx/compose/runtime/ValueHolder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    public abstract ProvidedValue<T> defaultProvidedValue$runtime(T p0);

    public ProvidableCompositionLocal(Function0<? extends T> function0) {
        super(function0, null);
    }

    public final ProvidedValue<T> provides(T p0) {
        return defaultProvidedValue$runtime(p0);
    }

    public final ProvidedValue<T> providesDefault(T p0) {
        return defaultProvidedValue$runtime(p0).ifNotAlreadyProvided$runtime();
    }

    public final ProvidedValue<T> providesComputed(Function1<? super CompositionLocalAccessorScope, ? extends T> p0) {
        return new ProvidedValue<>(this, null, false, null, null, p0, false);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    public ValueHolder<T> updatedStateOf$runtime(ProvidedValue<T> p0, ValueHolder<T> p1) {
        DynamicValueHolder dynamicValueHolder = null;
        if (p1 instanceof DynamicValueHolder) {
            if (p0.getIsDynamic()) {
                dynamicValueHolder = (DynamicValueHolder) p1;
                dynamicValueHolder.getState().setValue(p0.getEffectiveValue$runtime());
            }
            dynamicValueHolder = dynamicValueHolder;
        } else if (p1 instanceof StaticValueHolder) {
            if (p0.isStatic$runtime()) {
                StaticValueHolder staticValueHolder = (StaticValueHolder) p1;
                if (Intrinsics.areEqual(p0.getEffectiveValue$runtime(), staticValueHolder.getValue())) {
                    dynamicValueHolder = staticValueHolder;
                }
            }
            dynamicValueHolder = dynamicValueHolder;
        } else if (p1 instanceof ComputedValueHolder) {
            ComputedValueHolder computedValueHolder = (ComputedValueHolder) p1;
            if (p0.getCompute$runtime() == computedValueHolder.getCompute()) {
                dynamicValueHolder = computedValueHolder;
            }
            dynamicValueHolder = dynamicValueHolder;
        }
        return dynamicValueHolder == null ? valueHolderOf(p0) : dynamicValueHolder;
    }

    private final ValueHolder<T> valueHolderOf(ProvidedValue<T> p0) {
        if (p0.getIsDynamic()) {
            MutableState<T> state$runtime = p0.getState$runtime();
            if (state$runtime == null) {
                T value = p0.getValue();
                SnapshotMutationPolicy<T> mutationPolicy$runtime = p0.getMutationPolicy$runtime();
                if (mutationPolicy$runtime == null) {
                    mutationPolicy$runtime = SnapshotStateKt.structuralEqualityPolicy();
                }
                state$runtime = SnapshotStateKt.mutableStateOf(value, mutationPolicy$runtime);
            }
            return new DynamicValueHolder(state$runtime);
        }
        if (p0.getCompute$runtime() != null) {
            return new ComputedValueHolder(p0.getCompute$runtime());
        }
        return p0.getState$runtime() != null ? new DynamicValueHolder(p0.getState$runtime()) : new StaticValueHolder(p0.getEffectiveValue$runtime());
    }
}
