package androidx.compose.ui.semantics;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"/\u0010\u0011\u001a\u00020\n*\u00020\t2\u0006\u0010\u0002\u001a\u00020\n8G@GX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e*\u0004\b\u000f\u0010\u0010\"/\u0010\u0017\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015*\u0004\b\u0016\u0010\u0010"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "p1", "Lkotlin/Function2;", "p2", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "SemanticsPropertyKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "getTestTagsAsResourceId", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setTestTagsAsResourceId", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "getTestTagsAsResourceId$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "testTagsAsResourceId", "getAccessibilityClassName", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setAccessibilityClassName", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "getAccessibilityClassName$delegate", "accessibilityClassName"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "accessibilityClassName", "getAccessibilityClassName(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1))};

    public static /* synthetic */ SemanticsPropertyKey SemanticsPropertyKey$default(String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function2<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsProperties_androidKt.SemanticsPropertyKey.1
                @Override // kotlin.jvm.functions.Function2
                public final T invoke(T t, T t2) {
                    return t;
                }
            };
        }
        return SemanticsPropertyKey(str, str2, function2);
    }

    public static final <T> SemanticsPropertyKey<T> SemanticsPropertyKey(String str, String str2, Function2<? super T, ? super T, ? extends T> function2) {
        return new SemanticsPropertyKey<>(str, false, (Function2) function2, str2);
    }

    static {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
        SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName();
    }

    public static final boolean getTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]).booleanValue();
    }

    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public static final String getAccessibilityClassName(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final void setAccessibilityClassName(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], str);
    }
}
