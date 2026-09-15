package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/window/layout/ExtensionInterfaceCompat;", "", "Landroid/app/Activity;", "p0", "", "onWindowLayoutChangeListenerAdded", "(Landroid/app/Activity;)V", "onWindowLayoutChangeListenerRemoved", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "setExtensionCallback", "(Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;)V", "", "validateExtensionInterface", "()Z", "ExtensionCallbackInterface"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ExtensionInterfaceCompat {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "", "Landroid/app/Activity;", "p0", "Landroidx/window/layout/WindowLayoutInfo;", "p1", "", "onWindowLayoutChanged", "(Landroid/app/Activity;Landroidx/window/layout/WindowLayoutInfo;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface ExtensionCallbackInterface {
        void onWindowLayoutChanged(Activity p0, WindowLayoutInfo p1);
    }

    void onWindowLayoutChangeListenerAdded(Activity p0);

    void onWindowLayoutChangeListenerRemoved(Activity p0);

    void setExtensionCallback(ExtensionCallbackInterface p0);

    boolean validateExtensionInterface();
}
