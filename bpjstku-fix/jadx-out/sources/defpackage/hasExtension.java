package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public final class hasExtension implements ServiceConnection {
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
    public final hasUltraHdrImageCapture TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final hasNonSdrConfig b;

    public hasExtension(hasUltraHdrImageCapture hasultrahdrimagecapture, hasNonSdrConfig hasnonsdrconfig) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = hasultrahdrimagecapture;
        this.b = hasnonsdrconfig;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws Throwable {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final hasUltraHdrImageCapture b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final hasNonSdrConfig TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.b;
    }
}
