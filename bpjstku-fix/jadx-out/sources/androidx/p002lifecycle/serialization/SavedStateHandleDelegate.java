package androidx.p002lifecycle.serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.SavedStateHandle;
import androidx.p002lifecycle.internal.CanonicalName_jvmKt;
import androidx.p013savedstate.SavedStateRegistry;
import androidx.p013savedstate.p017serialization.SavedStateConfiguration;
import androidx.p013savedstate.p017serialization.SavedStateDecoderKt;
import androidx.p013savedstate.p017serialization.SavedStateEncoderKt;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0097\u0002¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001a\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Landroidx/lifecycle/serialization/SavedStateHandleDelegate;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadWriteProperty;", "Landroidx/lifecycle/SavedStateHandle;", "p0", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "p1", "", "p2", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "p3", "Lkotlin/Function0;", "p4", "<init>", "(Landroidx/lifecycle/SavedStateHandle;LvideoProfileHdrFormatsToDynamicRangeEncoding;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;)V", "loadValue", "(Ljava/lang/String;)Ljava/lang/Object;", "", "registerSave", "(Ljava/lang/String;)V", "Lkotlin/reflect/KProperty;", "createDefaultKey", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/String;", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "serializer", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "key", "Ljava/lang/String;", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "init", "Lkotlin/jvm/functions/Function0;", "value", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SavedStateHandleDelegate<T> implements ReadWriteProperty<Object, T> {
    private final SavedStateConfiguration configuration;
    private final Function0<T> init;
    private final String key;
    private final SavedStateHandle savedStateHandle;
    private final videoProfileHdrFormatsToDynamicRangeEncoding<T> serializer;
    private T value;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleDelegate(SavedStateHandle savedStateHandle, videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, String str, SavedStateConfiguration savedStateConfiguration, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.savedStateHandle = savedStateHandle;
        this.serializer = videoprofilehdrformatstodynamicrangeencoding;
        this.key = str;
        this.configuration = savedStateConfiguration;
        this.init = function0;
    }

    private final T loadValue(String p0) {
        Bundle bundle = (Bundle) this.savedStateHandle.get(p0);
        if (bundle != null) {
            return (T) SavedStateDecoderKt.decodeFromSavedState(this.serializer, bundle, this.configuration);
        }
        return null;
    }

    private final void registerSave(String p0) {
        this.savedStateHandle.setSavedStateProvider(p0, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.serialization.SavedStateHandleDelegate$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleDelegate.registerSave$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle registerSave$lambda$1(SavedStateHandleDelegate savedStateHandleDelegate) {
        videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding = savedStateHandleDelegate.serializer;
        Object obj = savedStateHandleDelegate.value;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            obj = Unit.INSTANCE;
        }
        return SavedStateEncoderKt.encodeToSavedState(videoprofilehdrformatstodynamicrangeencoding, obj, savedStateHandleDelegate.configuration);
    }

    private final String createDefaultKey(Object p0, KProperty<?> p1) {
        String string;
        if (p0 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(CanonicalName_jvmKt.getCanonicalName(Reflection.getOrCreateKotlinClass(p0.getClass())));
            sb.append('.');
            string = sb.toString();
        } else {
            string = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(p1.getName());
        return sb2.toString();
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public final T getValue(Object p0, KProperty<?> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.value == null) {
            String strCreateDefaultKey = this.key;
            if (strCreateDefaultKey == null) {
                strCreateDefaultKey = createDefaultKey(p0, p1);
            }
            registerSave(strCreateDefaultKey);
            T tLoadValue = loadValue(strCreateDefaultKey);
            if (tLoadValue == null) {
                tLoadValue = this.init.invoke();
            }
            this.value = tLoadValue;
        }
        T t = this.value;
        if (t != null) {
            return t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return (T) Unit.INSTANCE;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object p0, KProperty<?> p1, T p2) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (this.value == null) {
            String strCreateDefaultKey = this.key;
            if (strCreateDefaultKey == null) {
                strCreateDefaultKey = createDefaultKey(p0, p1);
            }
            registerSave(strCreateDefaultKey);
        }
        this.value = p2;
    }
}
