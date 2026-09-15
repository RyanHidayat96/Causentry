package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AutoValue_GraphicDeviceInfo {
    String TuitionPaymentFragmentbindingInflater1;
    List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public AutoValue_GraphicDeviceInfo(Context context) {
        String str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String upperCase = inetAddress.getHostAddress().toUpperCase();
                        boolean zB = b(upperCase);
                        if (zB) {
                            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.contains(upperCase)) {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(upperCase);
                            }
                        } else if (!zB) {
                            int iIndexOf = upperCase.indexOf(37);
                            upperCase = iIndexOf >= 0 ? upperCase.substring(0, iIndexOf) : upperCase;
                            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.contains(upperCase)) {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(upperCase);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            switch (activeNetworkInfo.getType()) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                            str = "Connected - Mobile - GPRS";
                            break;
                        case 2:
                            str = "Connected - Mobile - EDGE";
                            break;
                        case 3:
                            str = "Connected - Mobile - UMTS";
                            break;
                        case 4:
                            str = "Connected - Mobile - CDMA";
                            break;
                        case 5:
                            str = "Connected - Mobile - EVDO_0";
                            break;
                        case 6:
                            str = "Connected - Mobile - EVDO_A";
                            break;
                        case 7:
                            str = "Connected - Mobile - 1xRTT";
                            break;
                        case 8:
                            str = "Connected - Mobile - HSDPA";
                            break;
                        case 9:
                            str = "Connected - Mobile - HSUPA";
                            break;
                        case 10:
                            str = "Connected - Mobile - HSPA";
                            break;
                        case 11:
                            str = "Connected - Mobile - IDEN";
                            break;
                        default:
                            str = "Connected - Mobile - subtype unknown/EVDO_B/EHRPD/LTE/HSPAP or similar";
                            break;
                    }
                    break;
                case 1:
                    str = "Connected - WiFi";
                    break;
                case 6:
                    str = "Connected - WiMax";
                    break;
                default:
                    str = "Connected - unknown type";
                    break;
            }
        } else {
            str = "Not connected";
        }
        this.TuitionPaymentFragmentbindingInflater1 = str;
    }

    private static boolean b(String str) {
        try {
            return InetAddress.getByName(str) instanceof Inet4Address;
        } catch (UnknownHostException e2) {
            e2.getMessage();
            return false;
        }
    }

    public /* synthetic */ AutoValue_GraphicDeviceInfo() {
    }
}
