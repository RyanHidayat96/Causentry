package androidx.FastestIyy;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: androidx.FastestIyy.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0203y extends BluetoothGattCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f303a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public C0203y(AtomicInteger atomicInteger, String str, String str2, int i) {
        this.f303a = atomicInteger;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.f303a.set(i == 0 ? 1 : 0);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onConnectionStateChange(bluetoothGatt, i, i2);
        if (i2 == 2) {
            bluetoothGatt.discoverServices();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        super.onServicesDiscovered(bluetoothGatt, i);
        try {
            BluetoothGattCharacteristic characteristic = bluetoothGatt.getService(UUID.fromString(this.b)).getCharacteristic(UUID.fromString(this.c));
            characteristic.setValue(this.d, 17, 0);
            bluetoothGatt.writeCharacteristic(characteristic);
        } catch (Exception unused) {
            this.f303a.set(0);
        }
    }
}
