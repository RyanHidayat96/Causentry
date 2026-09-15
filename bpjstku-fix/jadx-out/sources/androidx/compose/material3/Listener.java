package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR+\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00048C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\nR+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00048C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/material3/Listener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroidx/compose/runtime/State;", "", "<init>", "()V", "p0", "", "onAccessibilityStateChanged", "(Z)V", "onTouchExplorationStateChanged", "Landroid/view/accessibility/AccessibilityManager;", "register", "(Landroid/view/accessibility/AccessibilityManager;)V", "unregister", "accessibilityEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "getAccessibilityEnabled", "()Z", "setAccessibilityEnabled", "accessibilityEnabled", "touchExplorationEnabled$delegate", "getTouchExplorationEnabled", "setTouchExplorationEnabled", "touchExplorationEnabled", "getValue", "()Ljava/lang/Boolean;", "value"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, State<Boolean> {

    /* JADX INFO: renamed from: accessibilityEnabled$delegate, reason: from kotlin metadata */
    private final MutableState accessibilityEnabled;

    /* JADX INFO: renamed from: touchExplorationEnabled$delegate, reason: from kotlin metadata */
    private final MutableState touchExplorationEnabled;

    public Listener() {
        Boolean bool = Boolean.FALSE;
        this.accessibilityEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.touchExplorationEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    private final boolean getAccessibilityEnabled() {
        return ((Boolean) this.accessibilityEnabled.getValue()).booleanValue();
    }

    private final void setAccessibilityEnabled(boolean z) {
        this.accessibilityEnabled.setValue(Boolean.valueOf(z));
    }

    private final boolean getTouchExplorationEnabled() {
        return ((Boolean) this.touchExplorationEnabled.getValue()).booleanValue();
    }

    private final void setTouchExplorationEnabled(boolean z) {
        this.touchExplorationEnabled.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public final Boolean getValue() {
        return Boolean.valueOf(getAccessibilityEnabled() && getTouchExplorationEnabled());
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean p0) {
        setAccessibilityEnabled(p0);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean p0) {
        setTouchExplorationEnabled(p0);
    }

    public final void register(AccessibilityManager p0) {
        setAccessibilityEnabled(p0.isEnabled());
        setTouchExplorationEnabled(p0.isTouchExplorationEnabled());
        p0.addTouchExplorationStateChangeListener(this);
        p0.addAccessibilityStateChangeListener(this);
    }

    public final void unregister(AccessibilityManager p0) {
        p0.removeTouchExplorationStateChangeListener(this);
        p0.removeAccessibilityStateChangeListener(this);
    }
}
