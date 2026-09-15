package androidx.compose.ui;

import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\u0006\u0012\u0004\b\t\u0010\u0003R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003R\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u0006\u0012\u0004\b\r\u0010\u0003R\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003R\u001c\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003R\u001c\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u0013\u0010\u0003R\u001c\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003R\u001c\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0017\u0010\u0003R\u001c\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u0012\u0004\b\u0019\u0010\u0003R\u001c\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003R\u001c\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003R\u001c\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u0012\u0004\b\u001f\u0010\u0003"}, d2 = {"Landroidx/compose/ui/ComposeUiFlags;", "", "<init>", "()V", "", "isRectTrackingEnabled", "Z", "isRectTrackingEnabled$annotations", "isSemanticAutofillEnabled", "isSemanticAutofillEnabled$annotations", "isViewFocusFixEnabled", "isViewFocusFixEnabled$annotations", "isRemoveFocusedViewFixEnabled", "isRemoveFocusedViewFixEnabled$annotations", "areWindowInsetsRulersEnabled", "getAreWindowInsetsRulersEnabled$annotations", "isFocusActionExitsTouchModeEnabled", "isFocusActionExitsTouchModeEnabled$annotations", "isNoPinningInFocusRestorationEnabled", "isNoPinningInFocusRestorationEnabled$annotations", "isOutOfFrameDeactivationEnabled", "isOutOfFrameDeactivationEnabled$annotations", "isClearFocusOnResetEnabled", "isClearFocusOnResetEnabled$annotations", "isAdaptiveRefreshRateEnabled", "isAdaptiveRefreshRateEnabled$annotations", "isPointerInteropFilterDispatchingFixEnabled", "isPointerInteropFilterDispatchingFixEnabled$annotations", "isNestedScrollInteropPostFlingFixEnabled", "isNestedScrollInteropPostFlingFixEnabled$annotations", "isNestedScrollDispatcherNodeFixEnabled", "isNestedScrollDispatcherNodeFixEnabled$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeUiFlags {
    public static boolean isRemoveFocusedViewFixEnabled;
    public static boolean isViewFocusFixEnabled;
    public static final ComposeUiFlags INSTANCE = new ComposeUiFlags();
    public static boolean isRectTrackingEnabled = true;
    public static boolean isSemanticAutofillEnabled = true;
    public static boolean areWindowInsetsRulersEnabled = true;
    public static boolean isFocusActionExitsTouchModeEnabled = true;
    public static boolean isNoPinningInFocusRestorationEnabled = true;
    public static boolean isOutOfFrameDeactivationEnabled = true;
    public static boolean isClearFocusOnResetEnabled = true;
    public static boolean isAdaptiveRefreshRateEnabled = true;
    public static boolean isPointerInteropFilterDispatchingFixEnabled = true;
    public static boolean isNestedScrollInteropPostFlingFixEnabled = true;
    public static boolean isNestedScrollDispatcherNodeFixEnabled = true;
    public static final int $stable = 8;

    public static /* synthetic */ void getAreWindowInsetsRulersEnabled$annotations() {
    }

    public static /* synthetic */ void isAdaptiveRefreshRateEnabled$annotations() {
    }

    public static /* synthetic */ void isClearFocusOnResetEnabled$annotations() {
    }

    public static /* synthetic */ void isFocusActionExitsTouchModeEnabled$annotations() {
    }

    public static /* synthetic */ void isNestedScrollDispatcherNodeFixEnabled$annotations() {
    }

    public static /* synthetic */ void isNestedScrollInteropPostFlingFixEnabled$annotations() {
    }

    public static /* synthetic */ void isNoPinningInFocusRestorationEnabled$annotations() {
    }

    public static /* synthetic */ void isOutOfFrameDeactivationEnabled$annotations() {
    }

    public static /* synthetic */ void isPointerInteropFilterDispatchingFixEnabled$annotations() {
    }

    public static /* synthetic */ void isRectTrackingEnabled$annotations() {
    }

    @Deprecated(message = "This flag is no longer needed.")
    public static /* synthetic */ void isRemoveFocusedViewFixEnabled$annotations() {
    }

    public static /* synthetic */ void isSemanticAutofillEnabled$annotations() {
    }

    public static /* synthetic */ void isViewFocusFixEnabled$annotations() {
    }

    private ComposeUiFlags() {
    }
}
