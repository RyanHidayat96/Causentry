package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BG\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J!\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00028\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010$\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableHolder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/runtime/saveable/Saver;", "", "p0", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "p1", "", "p2", "p3", "", "p4", "<init>", "(Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "", "update", "register", "()V", "", "canBeSaved", "(Ljava/lang/Object;)Z", "onRemembered", "onForgotten", "onAbandoned", "getValueIfInputsDidntChange", "([Ljava/lang/Object;)Ljava/lang/Object;", "saver", "Landroidx/compose/runtime/saveable/Saver;", "registry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "key", "Ljava/lang/String;", "value", "Ljava/lang/Object;", "inputs", "[Ljava/lang/Object;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "entry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "Lkotlin/Function0;", "valueProvider", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SaveableHolder<T> implements SaverScope, RememberObserver {
    private SaveableStateRegistry.Entry entry;
    private Object[] inputs;
    private String key;
    private SaveableStateRegistry registry;
    private Saver<T, Object> saver;
    private T value;
    private final Function0<Object> valueProvider = new Function0() { // from class: androidx.compose.runtime.saveable.SaveableHolder$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SaveableHolder.valueProvider$lambda$2(this.f$0);
        }
    };

    public SaveableHolder(Saver<T, Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t, Object[] objArr) {
        this.saver = saver;
        this.registry = saveableStateRegistry;
        this.key = str;
        this.value = t;
        this.inputs = objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object valueProvider$lambda$2(SaveableHolder saveableHolder) {
        Saver<T, Object> saver = saveableHolder.saver;
        SaveableHolder saveableHolder2 = saveableHolder;
        T t = saveableHolder.value;
        if (t != null) {
            return saver.save(saveableHolder2, t);
        }
        throw new IllegalArgumentException("Value should be initialized".toString());
    }

    public final void update(Saver<T, Object> p0, SaveableStateRegistry p1, String p2, T p3, Object[] p4) {
        boolean z;
        boolean z2 = true;
        if (this.registry != p1) {
            this.registry = p1;
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.areEqual(this.key, p2)) {
            z2 = z;
        } else {
            this.key = p2;
        }
        this.saver = p0;
        this.value = p3;
        this.inputs = p4;
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry == null || !z2) {
            return;
        }
        if (entry != null) {
            entry.unregister();
        }
        this.entry = null;
        register();
    }

    private final void register() {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        if (this.entry != null) {
            StringBuilder sb = new StringBuilder("entry(");
            sb.append(this.entry);
            sb.append(") is not null");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (saveableStateRegistry != null) {
            RememberSaveableKt.requireCanBeSaved(saveableStateRegistry, this.valueProvider.invoke());
            this.entry = saveableStateRegistry.registerProvider(this.key, this.valueProvider);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(Object p0) {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        return saveableStateRegistry == null || saveableStateRegistry.canBeSaved(p0);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        register();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    public final T getValueIfInputsDidntChange(Object[] p0) {
        if (Arrays.equals(p0, this.inputs)) {
            return this.value;
        }
        return null;
    }
}
