package androidx.FastestIyy;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: androidx.FastestIyy.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0202x extends ScanCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashSet f302a;
    public final /* synthetic */ AtomicInteger b;

    public C0202x(HashSet hashSet, AtomicInteger atomicInteger) {
        this.f302a = hashSet;
        this.b = atomicInteger;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
        super.onScanFailed(i);
        this.b.set(0);
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        this.f302a.add(scanResult.getDevice());
        this.b.set(4 == i ? 0 : 1);
    }
}
