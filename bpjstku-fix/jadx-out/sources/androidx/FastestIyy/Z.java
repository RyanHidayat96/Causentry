package androidx.FastestIyy;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public final class Z {
    public static Z b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f272a = null;

    public static void a(Context context) {
        Z z;
        if (b == null) {
            synchronized (i0.class) {
                if (b == null) {
                    b = new Z();
                }
                z = b;
            }
            z.b(context);
        }
    }

    public final void b(String str, String str2, j0 j0Var) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return;
            }
            WifiManager wifiManager = (WifiManager) this.f272a.getApplicationContext().getSystemService("wifi");
            if (wifiManager.isWifiEnabled()) {
                wifiManager.setWifiEnabled(false);
            }
        } catch (Exception unused) {
        }
    }

    public final void c(String str, String str2, j0 j0Var) {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || defaultAdapter.isEnabled()) {
                return;
            }
            defaultAdapter.enable();
        } catch (Exception unused) {
        }
    }

    public final void d(String str, String str2, j0 j0Var) {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                return;
            }
            defaultAdapter.disable();
        } catch (Exception unused) {
        }
    }

    public final void a(String str, String str2, j0 j0Var) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return;
            }
            WifiManager wifiManager = (WifiManager) this.f272a.getApplicationContext().getSystemService("wifi");
            if (wifiManager.isWifiEnabled()) {
                return;
            }
            wifiManager.setWifiEnabled(true);
        } catch (Exception unused) {
        }
    }

    public final void b(Context context) {
        this.f272a = context;
        ((i0) i0.a()).a("com.zimperium.action.wifi.enable", new B() { // from class: androidx.FastestIyy.Z$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                this.f$0.a(str, str2, j0Var);
            }
        });
        ((i0) i0.a()).a("com.zimperium.action.wifi.disable", new B() { // from class: androidx.FastestIyy.Z$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                this.f$0.b(str, str2, j0Var);
            }
        });
        ((i0) i0.a()).a("com.zimperium.action.bluetooth.enable", new B() { // from class: androidx.FastestIyy.Z$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                this.f$0.c(str, str2, j0Var);
            }
        });
        ((i0) i0.a()).a("com.zimperium.action.bluetooth.disable", new B() { // from class: androidx.FastestIyy.Z$$ExternalSyntheticLambda3
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                this.f$0.d(str, str2, j0Var);
            }
        });
    }
}
