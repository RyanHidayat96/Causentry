package com.appsflyer.internal;

import android.media.AudioTrack;
import android.view.View;
import com.appsflyer.AFLogger;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/appsflyer/internal/AFf1wSDK;", "Lcom/appsflyer/internal/AFf1uSDK;", "Lcom/appsflyer/internal/AFi1fSDK;", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "p1", "Lcom/appsflyer/internal/AFc1dSDK;", "p2", "Lcom/appsflyer/internal/AFh1eSDK;", "p3", "<init>", "(Lcom/appsflyer/internal/AFi1fSDK;Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFc1dSDK;Lcom/appsflyer/internal/AFh1eSDK;)V", "Lcom/appsflyer/internal/AFh1rSDK;", "", "areAllFieldsValid", "(Lcom/appsflyer/internal/AFh1rSDK;)V", "", "getMonetizationNetwork", "()J", "", "", "", "copy", "()Ljava/util/Map;", "AFAdRevenueData", "", "copydefault", "()Z", "getMediationNetwork", "", "(I)V", "equals", "Lcom/appsflyer/internal/AFc1pSDK;", "hashCode", "Lcom/appsflyer/internal/AFi1fSDK;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFf1wSDK extends AFf1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static int registerClient;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    private final AFc1pSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: hashCode, reason: from kotlin metadata */
    private final AFi1fSDK getRevenue;
    private static char[] AFInAppEventParameterName = {10791, 10809, 10763, 10805, 10784, 10788, 10801, 10813, 10802};
    private static char AFLogger = 8141;

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        return getCurrencyIso4217Code(objArr);
    }

    public /* synthetic */ AFf1wSDK(AFi1fSDK aFi1fSDK, AFc1pSDK aFc1pSDK, AFc1dSDK aFc1dSDK, AFh1eSDK aFh1eSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1fSDK, aFc1pSDK, aFc1dSDK, (i & 8) != 0 ? new AFh1eSDK() : aFh1eSDK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1wSDK(AFi1fSDK aFi1fSDK, AFc1pSDK aFc1pSDK, AFc1dSDK aFc1dSDK, AFh1eSDK aFh1eSDK) {
        super(aFh1eSDK, aFc1dSDK);
        Intrinsics.checkNotNullParameter(aFi1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        Intrinsics.checkNotNullParameter(aFh1eSDK, "");
        this.getRevenue = aFi1fSDK;
        this.getMonetizationNetwork = aFc1pSDK;
        this.getCurrencyIso4217Code.add(AFe1mSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        int i = AFKeystoreWrapper;
        registerClient = (i + 107) % 128;
        registerClient = (i + 97) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        int i = (registerClient + 31) % 128;
        AFKeystoreWrapper = i;
        registerClient = (i + 67) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        AFKeystoreWrapper = (registerClient + 63) % 128;
        long millis = TimeUnit.MINUTES.toMillis(1L);
        AFKeystoreWrapper = (registerClient + 85) % 128;
        return millis;
    }

    private final void areAllFieldsValid(AFh1rSDK p0) {
        try {
            Map<String, ?> map = (Map) getRevenue(new Object[]{this}, -846475554, 846475554, System.identityHashCode(this));
            if (map != null) {
                int i = AFKeystoreWrapper + 97;
                registerClient = i % 128;
                if (i % 2 == 0) {
                    p0.getMediationNetwork(map);
                } else {
                    p0.getMediationNetwork(map);
                    throw new NullPointerException();
                }
            }
            if (this.getRevenue.AFAdRevenueData()) {
                return;
            }
            registerClient = (AFKeystoreWrapper + 3) % 128;
            Map<String, Object> mapComponent1 = component1(p0);
            Intrinsics.checkNotNullExpressionValue(mapComponent1, "");
            mapComponent1.put("pia_disabled", Boolean.TRUE);
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFf1wSDK aFf1wSDK = (AFf1wSDK) objArr[0];
        registerClient = (AFKeystoreWrapper + 75) % 128;
        AFi1hSDK currencyIso4217Code = aFf1wSDK.getRevenue.getCurrencyIso4217Code();
        if (currencyIso4217Code == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pia_timestamp", Long.valueOf(currencyIso4217Code.AFAdRevenueData));
        linkedHashMap2.put("ttr_millis", Long.valueOf(currencyIso4217Code.getRevenue));
        if (currencyIso4217Code.getCurrencyIso4217Code != null) {
            int i = AFKeystoreWrapper + 117;
            registerClient = i % 128;
            if (i % 2 != 0) {
                linkedHashMap2.put("pia_token", currencyIso4217Code.getCurrencyIso4217Code);
                throw null;
            }
            linkedHashMap2.put("pia_token", currencyIso4217Code.getCurrencyIso4217Code);
        }
        if (currencyIso4217Code.getMonetizationNetwork != null) {
            registerClient = (AFKeystoreWrapper + 55) % 128;
            linkedHashMap2.put("error_code", currencyIso4217Code.getMonetizationNetwork);
            registerClient = (AFKeystoreWrapper + 19) % 128;
        }
        linkedHashMap.put("pia", linkedHashMap2);
        return linkedHashMap;
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    protected final void AFAdRevenueData(int p0) {
        int i = registerClient + 69;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        int i2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        char[] cArr2 = AFInAppEventParameterName;
        if (cArr2 != null) {
            $11 = ($10 + 121) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (((long) cArr2[i3]) ^ (-374623853307093042L));
            }
            cArr2 = cArr3;
        }
        char c = (char) ((-374623853307093042L) ^ ((long) AFLogger));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            $10 = ($11 + 109) % 128;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $10 = ($11 + 67) % 128;
            aFk1mSDK.AFAdRevenueData = 0;
            while (aFk1mSDK.AFAdRevenueData < i2) {
                $10 = ($11 + 57) % 128;
                aFk1mSDK.getMonetizationNetwork = cArr[aFk1mSDK.AFAdRevenueData];
                aFk1mSDK.getCurrencyIso4217Code = cArr[aFk1mSDK.AFAdRevenueData + 1];
                if (aFk1mSDK.getMonetizationNetwork == aFk1mSDK.getCurrencyIso4217Code) {
                    int i4 = $11 + 81;
                    $10 = i4 % 128;
                    if (i4 % 2 != 0) {
                        cArr4[aFk1mSDK.AFAdRevenueData] = (char) (aFk1mSDK.getMonetizationNetwork >>> b);
                        cArr4[aFk1mSDK.AFAdRevenueData >> 1] = (char) (aFk1mSDK.getCurrencyIso4217Code << b);
                    } else {
                        cArr4[aFk1mSDK.AFAdRevenueData] = (char) (aFk1mSDK.getMonetizationNetwork - b);
                        cArr4[aFk1mSDK.AFAdRevenueData + 1] = (char) (aFk1mSDK.getCurrencyIso4217Code - b);
                    }
                } else {
                    aFk1mSDK.getMediationNetwork = aFk1mSDK.getMonetizationNetwork / c;
                    aFk1mSDK.component1 = aFk1mSDK.getMonetizationNetwork % c;
                    aFk1mSDK.getRevenue = aFk1mSDK.getCurrencyIso4217Code / c;
                    aFk1mSDK.component2 = aFk1mSDK.getCurrencyIso4217Code % c;
                    if (aFk1mSDK.component1 == aFk1mSDK.component2) {
                        $11 = ($10 + 3) % 128;
                        aFk1mSDK.getMediationNetwork = ((aFk1mSDK.getMediationNetwork + c) - 1) % c;
                        aFk1mSDK.getRevenue = ((aFk1mSDK.getRevenue + c) - 1) % c;
                        int i5 = aFk1mSDK.getMediationNetwork;
                        int i6 = aFk1mSDK.component1;
                        int i7 = aFk1mSDK.getRevenue;
                        int i8 = aFk1mSDK.component2;
                        cArr4[aFk1mSDK.AFAdRevenueData] = cArr2[(i5 * c) + i6];
                        cArr4[aFk1mSDK.AFAdRevenueData + 1] = cArr2[(i7 * c) + i8];
                        int i9 = $11 + 19;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 5 / 2;
                        }
                    } else if (aFk1mSDK.getMediationNetwork == aFk1mSDK.getRevenue) {
                        aFk1mSDK.component1 = ((aFk1mSDK.component1 + c) - 1) % c;
                        aFk1mSDK.component2 = ((aFk1mSDK.component2 + c) - 1) % c;
                        int i11 = aFk1mSDK.getMediationNetwork;
                        int i12 = aFk1mSDK.component1;
                        int i13 = aFk1mSDK.getRevenue;
                        int i14 = aFk1mSDK.component2;
                        cArr4[aFk1mSDK.AFAdRevenueData] = cArr2[(i11 * c) + i12];
                        cArr4[aFk1mSDK.AFAdRevenueData + 1] = cArr2[(i13 * c) + i14];
                    } else {
                        int i15 = aFk1mSDK.getMediationNetwork;
                        int i16 = aFk1mSDK.component2;
                        int i17 = aFk1mSDK.getRevenue;
                        int i18 = aFk1mSDK.component1;
                        cArr4[aFk1mSDK.AFAdRevenueData] = cArr2[(i15 * c) + i16];
                        cArr4[aFk1mSDK.AFAdRevenueData + 1] = cArr2[(i17 * c) + i18];
                    }
                }
                aFk1mSDK.AFAdRevenueData += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFf1rSDK
    protected final void AFAdRevenueData(AFh1rSDK p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Map<String, Object> map = p0.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        Object[] objArr = new Object[1];
        a((byte) (View.resolveSize(0, 0) + 107), "\u0005\u0006\u0001\u0005\u0001\u0004\u0000\u0003\u0005\u0004\u0002\u0004", 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        map.put(((String) objArr[0]).intern(), String.valueOf(new Date().getTime()));
        super.AFAdRevenueData(p0);
        areAllFieldsValid(p0);
        AFg1qSDK aFg1qSDK = this.toString;
        Map<String, Object> map2 = p0.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        aFg1qSDK.getRevenue(map2, this.getMonetizationNetwork.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0), this.getMonetizationNetwork.getMonetizationNetwork.AFAdRevenueData("appsFlyerInAppEventCount", 0));
        int i = registerClient + 111;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1wSDK(AFi1fSDK aFi1fSDK, AFc1pSDK aFc1pSDK, AFc1dSDK aFc1dSDK) {
        this(aFi1fSDK, aFc1pSDK, aFc1dSDK, null, 8, null);
        Intrinsics.checkNotNullParameter(aFi1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
    }

    private final Map<String, Object> copy() {
        return (Map) getRevenue(new Object[]{this}, -846475554, 846475554, System.identityHashCode(this));
    }
}
