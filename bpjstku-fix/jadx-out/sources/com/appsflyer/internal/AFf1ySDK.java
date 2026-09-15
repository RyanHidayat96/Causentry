package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1ySDK extends AFe1dSDK<Map<String, String>> {
    public AFa1ySDK component2;
    private final AFd1oSDK copy;
    private String copydefault;
    private final boolean equals;
    private String hashCode;
    private final UUID registerClient;
    private String toString;

    public interface AFa1ySDK {
        void getRevenue(String str);

        void getRevenue(Map<String, String> map);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AppsFlyerRequestListener component3() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return 3000L;
    }

    public AFf1ySDK(AFc1dSDK aFc1dSDK, UUID uuid, Uri uri) throws Throwable {
        super(AFe1mSDK.ONELINK, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, aFc1dSDK, uuid.toString());
        this.copy = aFc1dSDK.getCurrencyIso4217Code();
        this.registerClient = uuid;
        boolean zBooleanValue = false;
        try {
            if (!AFk1ySDK.getMediationNetwork(uri.getHost()) && !AFk1ySDK.getMediationNetwork(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFc1dSDK.d()};
                    Object declaredConstructor = AFa1kSDK.i.get(-1523018365);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1kSDK.getCurrencyIso4217Code(Color.red(0), (char) (MotionEvent.axisFromString("") + 1), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getDeclaredConstructor(Uri.class, AFa1oSDK.class);
                        AFa1kSDK.i.put(-1523018365, declaredConstructor);
                    }
                    Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                    try {
                        Object method = AFa1kSDK.i.get(1191605722);
                        if (method == null) {
                            method = ((Class) AFa1kSDK.getCurrencyIso4217Code(ViewConfiguration.getWindowTouchSlop() >> 8, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("getRevenue", null);
                            AFa1kSDK.i.put(1191605722, method);
                        }
                        Object objInvoke = ((Method) method).invoke(objNewInstance, null);
                        try {
                            Object method2 = AFa1kSDK.i.get(1984406162);
                            if (method2 == null) {
                                method2 = ((Class) AFa1kSDK.getCurrencyIso4217Code((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, (char) (44103 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 50)).getMethod("getRevenue", null);
                                AFa1kSDK.i.put(1984406162, method2);
                            }
                            boolean zBooleanValue2 = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                            try {
                                Object method3 = AFa1kSDK.i.get(-1632086821);
                                if (method3 == null) {
                                    method3 = ((Class) AFa1kSDK.getCurrencyIso4217Code((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, (char) (44102 - View.MeasureSpec.makeMeasureSpec(0, 0)), 50 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("getMonetizationNetwork", null);
                                    AFa1kSDK.i.put(-1632086821, method3);
                                }
                                zBooleanValue = ((Boolean) ((Method) method3).invoke(objInvoke, null)).booleanValue();
                                String[] strArrSplit = uri.getPath().split("/");
                                if (zBooleanValue2 && strArrSplit.length == 3) {
                                    this.hashCode = strArrSplit[1];
                                    this.toString = strArrSplit[2];
                                    this.copydefault = uri.toString();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e2);
        }
        this.equals = zBooleanValue;
    }

    public final boolean equals() {
        return (TextUtils.isEmpty(this.hashCode) || TextUtils.isEmpty(this.toString) || this.hashCode.equals("app")) ? false : true;
    }

    public final boolean copy() {
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        AFa1ySDK aFa1ySDK = this.component2;
        if (aFa1ySDK != null) {
            if (this.getMediationNetwork == AFe1rSDK.SUCCESS && ((AFe1dSDK) this).component1 != null) {
                aFa1ySDK.getRevenue((Map<String, String>) ((AFe1dSDK) this).component1.getBody());
                return;
            }
            Throwable thComponent4 = component4();
            if (thComponent4 instanceof ParsingException) {
                if (((ParsingException) thComponent4).getRawResponse().isSuccessful()) {
                    aFa1ySDK.getRevenue("Can't parse one link data");
                    return;
                } else {
                    String str = this.copydefault;
                    aFa1ySDK.getRevenue(str != null ? str : "Can't get OneLink data");
                    return;
                }
            }
            String str2 = this.copydefault;
            aFa1ySDK.getRevenue(str2 != null ? str2 : "Can't get OneLink data");
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AFd1nSDK<Map<String, String>> getRevenue(String str) {
        return this.copy.getRevenue(this.hashCode, this.toString, this.registerClient, str);
    }
}
