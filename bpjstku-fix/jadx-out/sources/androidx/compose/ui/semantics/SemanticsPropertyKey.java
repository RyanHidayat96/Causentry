package androidx.compose.ui.semantics;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nBC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\t\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\rJ!\u0010\u000e\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00102\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00102\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R0\u0010\u001c\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u00038\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "p0", "Lkotlin/Function2;", "p1", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "(Ljava/lang/String;Z)V", "p2", "p3", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Ljava/lang/String;)V", "merge", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/reflect/KProperty;", "getValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "", "setValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName", "mergePolicy", "Lkotlin/jvm/functions/Function2;", "getMergePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "isImportantForAccessibility", "Z", "isImportantForAccessibility$ui_release", "()Z", "accessibilityExtraKey", "getAccessibilityExtraKey$ui_release", "setAccessibilityExtraKey$ui_release", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private String accessibilityExtraKey;
    private boolean isImportantForAccessibility;
    private final Function2<T, T, T> mergePolicy;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, Function2<? super T, ? super T, ? extends T> function2) {
        this.name = str;
        this.mergePolicy = function2;
    }

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Function2<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // kotlin.jvm.functions.Function2
            public final T invoke(T t, T t2) {
                return t == null ? t2 : t;
            }
        } : anonymousClass1);
    }

    public final Function2<T, T, T> getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    /* JADX INFO: renamed from: isImportantForAccessibility$ui_release, reason: from getter */
    public final boolean getIsImportantForAccessibility() {
        return this.isImportantForAccessibility;
    }

    /* JADX INFO: renamed from: getAccessibilityExtraKey$ui_release, reason: from getter */
    public final String getAccessibilityExtraKey() {
        return this.accessibilityExtraKey;
    }

    public final void setAccessibilityExtraKey$ui_release(String str) {
        this.accessibilityExtraKey = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, boolean z) {
        this(str, (Function2) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.isImportantForAccessibility = z;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, boolean z, Function2 function2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, function2, (i & 8) != 0 ? null : str2);
    }

    public SemanticsPropertyKey(String str, boolean z, Function2<? super T, ? super T, ? extends T> function2, String str2) {
        this(str, function2);
        this.isImportantForAccessibility = z;
        this.accessibilityExtraKey = str2;
    }

    public final T merge(T p0, T p1) {
        return this.mergePolicy.invoke(p0, p1);
    }

    public final T getValue(SemanticsPropertyReceiver p0, KProperty<?> p1) {
        return (T) SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public final void setValue(SemanticsPropertyReceiver p0, KProperty<?> p1, T p2) {
        p0.set(this, p2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityKey: ");
        sb.append(this.name);
        return sb.toString();
    }
}
