package androidx.FastestIyy;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.FastestIyy.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0204z extends AbstractC0201w {
    public C0204z(Context context) {
        super(context);
    }

    public final void a() {
        a0.a(277, new b0() { // from class: androidx.FastestIyy.z$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.b(jSONArray);
            }
        });
        a0.a(278, new b0() { // from class: androidx.FastestIyy.z$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.c(jSONArray);
            }
        });
    }

    public final Object b(JSONArray jSONArray) {
        int i = 0;
        int iOptInt = jSONArray.optInt(0);
        String strOptString = jSONArray.isNull(1) ? null : jSONArray.optString(1);
        String strOptString2 = jSONArray.isNull(2) ? null : jSONArray.optString(2);
        jSONArray.optInt(3);
        List<ScanFilter> listSingletonList = Collections.singletonList(new ScanFilter.Builder().setManufacturerData(iOptInt, Base64.decode(strOptString, 0), Base64.decode(strOptString2, 0)).build());
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().build();
        HashSet<BluetoothDevice> hashSet = new HashSet();
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        C0202x c0202x = new C0202x(hashSet, atomicInteger);
        try {
            BluetoothLeScanner bluetoothLeScanner = ((BluetoothManager) this.f301a.getSystemService("bluetooth")).getAdapter().getBluetoothLeScanner();
            bluetoothLeScanner.startScan(listSingletonList, scanSettingsBuild, c0202x);
            while (atomicInteger.get() == -1) {
                Thread.sleep(4000L);
                if (i >= 5) {
                    break;
                }
                i++;
            }
            bluetoothLeScanner.stopScan(c0202x);
        } catch (Exception e2) {
            e2.getMessage();
        }
        JSONArray jSONArray2 = new JSONArray();
        for (BluetoothDevice bluetoothDevice : hashSet) {
            try {
                JSONObject jSONObject = new JSONObject();
                String address = bluetoothDevice.getAddress();
                String name = bluetoothDevice.getName() == null ? "" : bluetoothDevice.getName();
                int type = bluetoothDevice.getType();
                jSONObject.put(PlaceTypes.ADDRESS, address);
                jSONObject.put("name", name);
                jSONObject.put("type", type);
                jSONArray2.put(jSONObject);
            } catch (Exception e3) {
                e3.getMessage();
            }
        }
        return jSONArray2;
    }

    public final Object c(JSONArray jSONArray) {
        boolean z;
        String strA = AbstractC0201w.a(jSONArray);
        String strOptString = jSONArray.isNull(1) ? null : jSONArray.optString(1);
        String strOptString2 = jSONArray.isNull(2) ? null : jSONArray.optString(2);
        int iOptInt = jSONArray.optInt(3);
        try {
            BluetoothDevice remoteDevice = ((BluetoothManager) this.f301a.getSystemService("bluetooth")).getAdapter().getRemoteDevice(strA);
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            BluetoothGatt bluetoothGattConnectGatt = remoteDevice.connectGatt(this.f301a, true, new C0203y(atomicInteger, strOptString, strOptString2, iOptInt));
            int i = 0;
            while (atomicInteger.get() == -1) {
                Thread.sleep(1000L);
                if (i >= 90) {
                    break;
                }
                i++;
            }
            bluetoothGattConnectGatt.disconnect();
            z = atomicInteger.get() == 1;
        } catch (Exception e2) {
            e2.getMessage();
        }
        return Boolean.valueOf(z);
    }
}
