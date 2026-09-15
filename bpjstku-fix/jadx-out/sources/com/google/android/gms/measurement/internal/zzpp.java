package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.material3.CalendarModelKt;
import androidx.core.app.NotificationCompat;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import defpackage.deInitSession;
import defpackage.initSession;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzpp extends zzjf {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] b;
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb;
    private static final String[] zzc;
    private SecureRandom zzd;
    private final AtomicLong zze;
    private int zzf;
    private MeasurementManagerFutures zzg;
    private Boolean zzh;
    private Integer zzi;
    private static final byte[] $$c = {46, 47, -18, 64};
    private static final int $$d = 243;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {53, -70, 9, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 114;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    zzpp(zzic zzicVar) {
        super(zzicVar);
        this.zzi = null;
        this.zze = new AtomicLong(0L);
    }

    private static void c(int i, byte b2, int i2, Object[] objArr) {
        int i3 = 4 - (i * 4);
        int i4 = 84 - (i2 * 4);
        int i5 = b2 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i5];
        int i6 = 52 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i4 = (i3 + i6) - 11;
        }
        while (true) {
            int i8 = i4;
            int i9 = i3;
            i7++;
            bArr2[i7] = (byte) i8;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = i9 + 1;
                i4 = (i8 + bArr[i9]) - 11;
            }
        }
    }

    static MessageDigest zzO() {
        int i = 2 % 2;
        int i2 = d + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2 != 0 ? 1 : 0;
        while (true) {
            Object obj = null;
            if (i3 >= 2) {
                int i4 = d + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int i5 = d + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                MessageDigest.getInstance("MD5");
                throw null;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
                i3++;
            } catch (NoSuchAlgorithmException unused) {
                continue;
            }
            continue;
            i3++;
        }
    }

    static boolean zzZ(String str) {
        int i = 2 % 2;
        int i2 = d + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!(!TextUtils.isEmpty(str))) {
            return false;
        }
        int i4 = d + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str.startsWith("_");
        }
        str.startsWith("_");
        throw null;
    }

    public static boolean zzaf(String str) {
        int i = 2 % 2;
        int i2 = d + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!zzc[0].equals(str)) {
                return true;
            }
        } else if (!zzc[0].equals(str)) {
            return true;
        }
        int i3 = d + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
        return false;
    }

    public final long zzd() {
        long andIncrement;
        long jNextLong;
        long j;
        AtomicLong atomicLong = this.zze;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.zze;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            jNextLong = new Random(System.nanoTime() ^ this.zzu.zzaZ().currentTimeMillis()).nextLong();
            int i = this.zzf + 1;
            this.zzf = i;
            j = i;
        }
        return jNextLong + j;
    }

    static boolean zzQ(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotNull(context);
        boolean zZzR = zzR(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        int i4 = d + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return zZzR;
    }

    static final boolean zzax(Bundle bundle, int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            int i3 = d + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i4 = d + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    static boolean zzh(String str) {
        int i = 2 % 2;
        int i2 = d + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Preconditions.checkNotEmpty(str);
            if (str.charAt(0) != 'o') {
                return true;
            }
        } else {
            Preconditions.checkNotEmpty(str);
            if (str.charAt(0) != '_') {
                return true;
            }
        }
        if (str.equals("_ep")) {
            return true;
        }
        int i3 = d + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final String zzC(String str, int i, boolean z) {
        int i2 = 2 % 2;
        if (str == null) {
            int i3 = d + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (!z) {
            return null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            String strSubstring = str.substring(1, str.offsetByCodePoints(1, i));
            String.valueOf(strSubstring);
            return String.valueOf(strSubstring).concat("...");
        }
        String strSubstring2 = str.substring(0, str.offsetByCodePoints(0, i));
        String.valueOf(strSubstring2);
        return String.valueOf(strSubstring2).concat("...");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r1 = 78 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (zzV() == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (zzV() == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r1 = com.google.android.gms.measurement.internal.zzpp.d + 81;
        com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzS() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzpp.d
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1d
            r7.zzg()
            long r5 = r7.zzV()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L38
            goto L28
        L1d:
            r7.zzg()
            long r5 = r7.zzV()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L38
        L28:
            int r1 = com.google.android.gms.measurement.internal.zzpp.d
            int r1 = r1 + 81
            int r3 = r1 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r1 = r1 % r0
            r0 = 1
            if (r1 == 0) goto L37
            r1 = 78
            int r1 = r1 / r2
        L37:
            return r0
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpp.zzS():boolean");
    }

    final MeasurementManagerFutures zzT() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.zzg == null) {
            this.zzg = MeasurementManagerFutures.from(this.zzu.zzaY());
        }
        MeasurementManagerFutures measurementManagerFutures = this.zzg;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        d = i3 % 128;
        int i4 = i3 % 2;
        return measurementManagerFutures;
    }

    final int zzU() {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = d + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int extensionVersion = SdkExtensions.getExtensionVersion(1000000);
        int i5 = d + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return extensionVersion;
    }

    public final void zzaq(com.google.android.gms.internal.measurement.zzcu zzcuVar, Bundle bundle) {
        int i = 2 % 2;
        int i2 = d + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                zzcuVar.zzb(bundle);
                obj.hashCode();
                throw null;
            }
            zzcuVar.zzb(bundle);
            int i3 = d + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            this.zzu.zzaV().zze().zzb("Error returning bundle value to wrapper", e2);
        }
    }

    final String zzaw() {
        int i = 2 % 2;
        byte[] bArr = new byte[16];
        zzf().nextBytes(bArr);
        String str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    final SecureRandom zzf() {
        int i = 2 % 2;
        int i2 = d + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            zzg();
            int i3 = 92 / 0;
            if (this.zzd == null) {
                this.zzd = new SecureRandom();
            }
        } else {
            zzg();
            if (this.zzd == null) {
                this.zzd = new SecureRandom();
            }
        }
        SecureRandom secureRandom = this.zzd;
        int i4 = d + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return secureRandom;
    }

    static boolean zzR(Context context, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                int i4 = d + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private static boolean zzaA(String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = d + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotNull(strArr);
        int i4 = d + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        for (String str2 : strArr) {
            int i6 = d + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            if (!(!Objects.equals(str, str2))) {
                int i8 = d + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                int i9 = i8 % 2;
                return true;
            }
        }
        return false;
    }

    final Object zzL(String str, Object obj) {
        int i = 2 % 2;
        int i2 = d + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!(!"_ldl".equals(str))) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            d = i4 % 128;
            return i4 % 2 == 0 ? zzay(zzaz(str), obj, true, false, null) : zzay(zzaz(str), obj, true, false, null);
        }
        Object objZzay = zzay(zzaz(str), obj, false, false, null);
        int i5 = d + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return objZzay;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    final boolean zzX(String str) {
        int i = 2 % 2;
        String str2 = (String) zzfy.zzar.zzb(null);
        if (str2.equals("*")) {
            return true;
        }
        int i2 = d + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (Arrays.asList(str2.split(",")).contains(str)) {
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        d = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    public final boolean zzag(int i, boolean z) {
        int i2;
        int i3 = 2 % 2;
        Boolean boolZzJ = this.zzu.zzt().zzJ();
        if (zzah() >= i / 1000) {
            return true;
        }
        int i4 = d + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
            if (boolZzJ != null) {
                if (!boolZzJ.booleanValue()) {
                    i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                    d = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i6 = 3 / 0;
                    }
                    return true;
                }
            }
        } else if (boolZzJ != null) {
            if (!boolZzJ.booleanValue()) {
                i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                d = i2 % 128;
                if (i2 % 2 == 0) {
                    int i7 = 3 / 0;
                }
                return true;
            }
        }
        return false;
    }

    public final int zzah() {
        int i = 2 % 2;
        if (this.zzi == null) {
            int i2 = d + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            this.zzi = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzu.zzaY()) / 1000);
        }
        int iIntValue = this.zzi.intValue();
        int i4 = d + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return iIntValue;
    }

    public final int zzai(int i) {
        int iIsGooglePlayServicesAvailable;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzu.zzaY(), 12451000);
            int i4 = 47 / 0;
        } else {
            iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzu.zzaY(), 12451000);
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        d = i5 % 128;
        int i6 = i5 % 2;
        return iIsGooglePlayServicesAvailable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static long zzP(byte[] bArr) {
        int length;
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        d = i2 % 128;
        boolean z2 = true;
        boolean z3 = false;
        if (i2 % 2 == 0) {
            Preconditions.checkNotNull(bArr);
            length = bArr.length;
            if (length > 0) {
                z3 = true;
                int i3 = d + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                z = z3;
            } else {
                z = z2;
                z2 = false;
            }
        } else {
            Preconditions.checkNotNull(bArr);
            length = bArr.length;
            if (length > 0) {
                int i5 = d + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                z = z3;
            } else {
                z2 = false;
                z = z2;
                z2 = false;
            }
        }
        Preconditions.checkState(z2);
        int i7 = length - 1;
        long j = 0;
        int i8 = z;
        while (i7 >= 0 && i7 >= bArr.length - 8) {
            j += (((long) bArr[i7]) & 255) << i8;
            i7--;
            i8 += 8;
        }
        return j;
    }

    public static void zzav(zzlu zzluVar, Bundle bundle, boolean z) {
        int i = 2 % 2;
        Object obj = null;
        if (bundle != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
            d = i2 % 128;
            int i3 = i2 % 2;
            if (zzluVar != null) {
                if (bundle.containsKey("_sc")) {
                    int i4 = d + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (!z) {
                        z = false;
                    }
                }
                String str = zzluVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzluVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzluVar.zzc);
                return;
            }
        }
        if (bundle != null) {
            int i5 = d + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (zzluVar == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
            }
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    final boolean zzA(String str) {
        int i = 2 % 2;
        int i2 = d + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            TextUtils.isEmpty(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            this.zzu.zzaV().zzd().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
            d = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = d + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        Preconditions.checkNotNull(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.zzu.zzaV().zzd().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzgu.zzl(str));
        return false;
    }

    final boolean zzB(String str, String str2) {
        int i = 2 % 2;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
            d = i2 % 128;
            int i3 = i2 % 2;
            Preconditions.checkNotNull(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        int i4 = d + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    final void zzI(Bundle bundle, Bundle bundle2) {
        int i = 2 % 2;
        if (bundle2 == null) {
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        d = i2 % 128;
        int i3 = i2 % 2;
        for (String str : bundle2.keySet()) {
            int i4 = d + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            if (!bundle.containsKey(str)) {
                this.zzu.zzk().zzM(bundle, str, bundle2.get(str));
            }
        }
    }

    final void zzak(Bundle bundle, long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        d = i2 % 128;
        int i3 = i2 % 2;
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            int i4 = d + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                this.zzu.zzaV().zze().zzb("Params already contained engagement", Long.valueOf(j2));
                int i5 = 53 / 0;
            } else {
                this.zzu.zzaV().zze().zzb("Params already contained engagement", Long.valueOf(j2));
            }
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void zzal(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcuVar.zzb(bundle);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (RemoteException e2) {
            this.zzu.zzaV().zze().zzb("Error returning string value to wrapper", e2);
        }
    }

    public final void zzam(com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcuVar.zzb(bundle);
            int i2 = d + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
        } catch (RemoteException e2) {
            this.zzu.zzaV().zze().zzb("Error returning long value to wrapper", e2);
        }
    }

    public final void zzan(com.google.android.gms.internal.measurement.zzcu zzcuVar, int i) {
        int i2 = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcuVar.zzb(bundle);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (RemoteException e2) {
            this.zzu.zzaV().zze().zzb("Error returning int value to wrapper", e2);
        }
    }

    public final void zzao(com.google.android.gms.internal.measurement.zzcu zzcuVar, byte[] bArr) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcuVar.zzb(bundle);
            int i2 = d + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (RemoteException e2) {
            this.zzu.zzaV().zze().zzb("Error returning byte array to wrapper", e2);
        }
    }

    public final void zzap(com.google.android.gms.internal.measurement.zzcu zzcuVar, boolean z) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcuVar.zzb(bundle);
            int i2 = d + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            this.zzu.zzaV().zze().zzb("Error returning boolean value to wrapper", e2);
        }
    }

    public final void zzar(com.google.android.gms.internal.measurement.zzcu zzcuVar, ArrayList arrayList) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcuVar.zzb(bundle);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            this.zzu.zzaV().zze().zzb("Error returning bundle list to wrapper", e2);
        }
    }

    final int zzn(String str) {
        int i = 2 % 2;
        if (!zzk(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!zzl(NotificationCompat.CATEGORY_EVENT, zzjm.zza, zzjm.zzb, str)) {
            return 13;
        }
        this.zzu.zzc();
        if (zzm(NotificationCompat.CATEGORY_EVENT, 40, str)) {
            return 0;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 45;
        d = i3 % 128;
        int i4 = i3 % 2 == 0 ? 5 : 2;
        int i5 = i2 + 97;
        d = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static boolean zzau(Context context) {
        int i = 2 % 2;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                int i2 = d + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        d = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    final int zzK(String str, Object obj) {
        boolean zZzu;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            "_ldl".equals(str);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if ("_ldl".equals(str)) {
            zZzu = zzu("user property referrer", str, zzaz(str), obj);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 4;
            }
        } else {
            zZzu = zzu("user property", str, zzaz(str), obj);
        }
        if (!zZzu) {
            return 7;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        r1.zzaV().zzj().zzb("Permission not granted", r7);
        r7 = com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        com.google.android.gms.measurement.internal.zzpp.d = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if ((r7 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (com.google.android.gms.common.wrappers.Wrappers.packageManager(r1.zzaY()).checkCallingOrSelfPermission(r7) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (com.google.android.gms.common.wrappers.Wrappers.packageManager(r1.zzaY()).checkCallingOrSelfPermission(r7) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzY(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzpp.d
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L26
            r6.zzg()
            com.google.android.gms.measurement.internal.zzic r1 = r6.zzu
            android.content.Context r4 = r1.zzaY()
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r4)
            int r4 = r4.checkCallingOrSelfPermission(r7)
            r5 = 54
            int r5 = r5 / r3
            if (r4 != 0) goto L3a
            goto L39
        L26:
            r6.zzg()
            com.google.android.gms.measurement.internal.zzic r1 = r6.zzu
            android.content.Context r4 = r1.zzaY()
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r4)
            int r4 = r4.checkCallingOrSelfPermission(r7)
            if (r4 != 0) goto L3a
        L39:
            return r2
        L3a:
            com.google.android.gms.measurement.internal.zzgu r1 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzj()
            java.lang.String r2 = "Permission not granted"
            r1.zzb(r2, r7)
            int r7 = com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r7 = r7 + 37
            int r1 = r7 % 128
            com.google.android.gms.measurement.internal.zzpp.d = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L53
            return r3
        L53:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpp.zzY(java.lang.String):boolean");
    }

    final byte[] zzae(Parcelable parcelable) {
        int i = 2 % 2;
        if (parcelable != null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelable.writeToParcel(parcelObtain, 0);
                return parcelObtain.marshall();
            } finally {
                parcelObtain.recycle();
            }
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 73;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = i2 + 89;
        d = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    final int zzp(String str) {
        int i = 2 % 2;
        if (!zzk("user property", str)) {
            int i2 = d + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            return i2 % 2 != 0 ? 43 : 6;
        }
        if (!zzl("user property", zzjo.zza, null, str)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            d = i3 % 128;
            return i3 % 2 == 0 ? 14 : 15;
        }
        this.zzu.zzc();
        if (zzm("user property", 24, str)) {
            return 0;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i4 + 9;
        d = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 45;
        d = i7 % 128;
        int i8 = i7 % 2;
        return 6;
    }

    private final int zzaz(String str) {
        int i = 2 % 2;
        if ("_ldl".equals(str)) {
            this.zzu.zzc();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            d = i2 % 128;
            int i3 = i2 % 2;
            return 2048;
        }
        if ("_id".equals(str)) {
            this.zzu.zzc();
            return 256;
        }
        if (!"_lgclid".equals(str)) {
            this.zzu.zzc();
            int i4 = d + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 80 / 0;
            }
            return 36;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            this.zzu.zzc();
            return 14;
        }
        this.zzu.zzc();
        return 100;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    final void zzN(zzpo zzpoVar, String str, int i, String str2, String str3, int i2) {
        int i3 = 2 % 2;
        Bundle bundle = new Bundle();
        zzax(bundle, i);
        if (!TextUtils.isEmpty(str2)) {
            int i4 = d + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                TextUtils.isEmpty(str3);
                throw null;
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        }
        if (i != 6) {
            int i5 = d + 81;
            int i6 = i5 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
            int i7 = i5 % 2;
            if (i != 7) {
                int i8 = i6 + 119;
                d = i8 % 128;
                int i9 = i8 % 2;
                if (i == 2) {
                    bundle.putLong("_el", i2);
                }
            } else {
                bundle.putLong("_el", i2);
            }
        } else {
            bundle.putLong("_el", i2);
        }
        zzpoVar.zza(str, "_err", bundle);
        int i10 = d + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
        int i11 = i10 % 2;
    }

    final boolean zzaa(String str, String str2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            TextUtils.isEmpty(str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!TextUtils.isEmpty(str2)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            d = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            d = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        zzic zzicVar = this.zzu;
        String strZzA = zzicVar.zzc().zzA();
        zzicVar.zzaU();
        return strZzA.equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r6.codePointCount(0, r6.length()) <= r5) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r3.zzu.zzaV().zzd().zzd("Name is too long. Type, maximum supported length, name", r4, java.lang.Integer.valueOf(r5), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r4 = com.google.android.gms.measurement.internal.zzpp.d + 115;
        com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r3.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzm(java.lang.String r4, int r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzpp.d
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 70
            int r1 = r1 / r2
            if (r6 != 0) goto L27
            goto L17
        L15:
            if (r6 != 0) goto L27
        L17:
            com.google.android.gms.measurement.internal.zzic r5 = r3.zzu
            com.google.android.gms.measurement.internal.zzgu r5 = r5.zzaV()
            com.google.android.gms.measurement.internal.zzgs r5 = r5.zzd()
            java.lang.String r6 = "Name is required and can't be null. Type"
            r5.zzb(r6, r4)
            return r2
        L27:
            int r1 = r6.length()
            int r1 = r6.codePointCount(r2, r1)
            if (r1 <= r5) goto L45
            com.google.android.gms.measurement.internal.zzic r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzgu r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzd()
            java.lang.String r1 = "Name is too long. Type, maximum supported length, name"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.zzd(r1, r4, r5, r6)
            return r2
        L45:
            int r4 = com.google.android.gms.measurement.internal.zzpp.d
            int r4 = r4 + 115
            int r5 = r4 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5
            int r4 = r4 % r0
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpp.zzm(java.lang.String, int, java.lang.String):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    protected final void zzba() {
        int i = 2 % 2;
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            d = i2 % 128;
            int i3 = i2 % 2;
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
                d = i4 % 128;
                if (i4 % 2 == 0) {
                    this.zzu.zzaV().zze().zza("Utils falling back to Random for random id");
                    int i5 = 24 / 0;
                } else {
                    this.zzu.zzaV().zze().zza("Utils falling back to Random for random id");
                }
                int i6 = d + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        this.zze.set(jNextLong);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    final void zzJ(Bundle bundle, int i, String str, Object obj) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            zzax(bundle, i);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (zzax(bundle, i)) {
            this.zzu.zzc();
            bundle.putString("_ev", zzC(str, 40, true));
            if (obj != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                d = i4 % 128;
                if (i4 % 2 == 0) {
                    Preconditions.checkNotNull(bundle);
                    int i5 = 70 / 0;
                    if (!(obj instanceof String)) {
                        if (obj instanceof CharSequence) {
                        }
                    }
                } else {
                    Preconditions.checkNotNull(bundle);
                    if (!(obj instanceof String)) {
                        if (obj instanceof CharSequence) {
                        }
                    }
                }
                bundle.putLong("_el", obj.toString().length());
            }
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 24 / 0;
        }
    }

    final Bundle zzab(Bundle bundle, String str) {
        int i = 2 % 2;
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                d = i2 % 128;
                int i3 = i2 % 2;
                Object objZzE = zzE(str2, bundle.get(str2));
                if (objZzE == null) {
                    zzic zzicVar = this.zzu;
                    zzicVar.zzaV().zzh().zzb("Param value can't be null", zzicVar.zzl().zzb(str2));
                } else {
                    zzM(bundle2, str2, objZzE);
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                    d = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    final zzbg zzac(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        int i = 2 % 2;
        Object obj = null;
        if (TextUtils.isEmpty(str2)) {
            int i2 = d + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (zzn(str2) != 0) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzb().zzb("Invalid conditional property event name", zzicVar.zzl().zzc(str2));
            throw new IllegalArgumentException();
        }
        int i3 = d + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
        } else if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", str3);
        Bundle bundleZzF = zzF(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (!(!z)) {
            int i5 = d + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                zzab(bundleZzF, str);
                obj.hashCode();
                throw null;
            }
            bundleZzF = zzab(bundleZzF, str);
        }
        Preconditions.checkNotNull(bundleZzF);
        return new zzbg(str2, new zzbe(bundleZzF), str3, j);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    final long zzV() {
        long j;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        if (!zzX(this.zzu.zzv().zzj())) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
            d = i4 % 128;
            return i4 % 2 == 0 ? 1L : 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            zzic zzicVar = this.zzu;
            int iZzU = zzU();
            zzicVar.zzc();
            j = iZzU < ((Integer) zzfy.zzal.zzb(null)).intValue() ? 16L : 0L;
        }
        if (!zzY("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
            d = i5 % 128;
            int i6 = i5 % 2;
            boolean zZzW = zzW();
            if (i6 == 0) {
                int i7 = 23 / 0;
                if (!zZzW) {
                    j = 64;
                }
            } else if (!zZzW) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    final Object zzE(String str, Object obj) {
        int iZzf;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        d = i2 % 128;
        int i3 = i2 % 2;
        if ("_ev".equals(str)) {
            return zzay(this.zzu.zzc().zzf(null, false), obj, true, true, null);
        }
        if (!zzZ(str)) {
            iZzf = this.zzu.zzc().zze(null, false);
        } else {
            int i4 = d + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            iZzf = i4 % 2 != 0 ? this.zzu.zzc().zzf(null, false) : this.zzu.zzc().zzf(null, false);
        }
        Object objZzay = zzay(iZzf, obj, false, true, null);
        int i5 = d + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return objZzay;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    final boolean zzW() {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Integer num = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.zzh == null) {
            MeasurementManagerFutures measurementManagerFuturesZzT = zzT();
            if (measurementManagerFuturesZzT == null) {
                return false;
            }
            try {
                Integer num2 = measurementManagerFuturesZzT.getMeasurementApiStatusAsync().get(10000L, TimeUnit.MILLISECONDS);
                if (num2 != null) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                    d = i3 % 128;
                    int i4 = i3 % 2;
                    try {
                        z = true;
                        if (num2.intValue() != 1) {
                            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
                            d = i5 % 128;
                            int i6 = i5 % 2;
                            z = false;
                        }
                        this.zzh = Boolean.valueOf(z);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
                        e = e2;
                        num = num2;
                        this.zzu.zzaV().zze().zzb("Measurement manager api exception", e);
                        this.zzh = false;
                        num2 = num;
                    }
                    this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num2);
                } else {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
                    d = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                    this.zzh = Boolean.valueOf(z);
                    this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num2);
                }
            } catch (InterruptedException e3) {
                e = e3;
            } catch (CancellationException e4) {
                e = e4;
            } catch (ExecutionException e5) {
                e = e5;
            } catch (TimeoutException e6) {
                e = e6;
            }
        }
        return this.zzh.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e A[PHI: r5
  0x007e: PHI (r5v6 int) = (r5v3 int), (r5v7 int) binds: [B:25:0x007c, B:22:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099 A[SYNTHETIC] */
    final boolean zzk(String str, String str2) {
        int iCodePointAt;
        int i;
        int i2 = 2 % 2;
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt2 = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt2)) {
            int i3 = d;
            int i4 = i3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            if (iCodePointAt2 != 95) {
                this.zzu.zzaV().zzd().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            int i6 = i3 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            iCodePointAt2 = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt2);
        while (iCharCount < length) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            d = i8 % 128;
            if (i8 % 2 == 0) {
                iCodePointAt = str2.codePointAt(iCharCount);
                if (iCodePointAt != 95) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                    d = i % 128;
                    if (i % 2 != 0) {
                        Character.isLetterOrDigit(iCodePointAt);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (Character.isLetterOrDigit(iCodePointAt)) {
                        this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                    int i9 = d + 79;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    continue;
                }
            } else {
                iCodePointAt = str2.codePointAt(iCharCount);
                if (iCodePointAt != 95) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                    d = i % 128;
                    if (i % 2 != 0) {
                        Character.isLetterOrDigit(iCodePointAt);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (Character.isLetterOrDigit(iCodePointAt)) {
                        this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                    int i11 = d + 79;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    continue;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (zzaA(r9, r8) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzl(java.lang.String r6, java.lang.String[] r7, java.lang.String[] r8, java.lang.String r9) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            if (r9 != 0) goto L16
            com.google.android.gms.measurement.internal.zzic r7 = r5.zzu
            com.google.android.gms.measurement.internal.zzgu r7 = r7.zzaV()
            com.google.android.gms.measurement.internal.zzgs r7 = r7.zzd()
            java.lang.String r8 = "Name is required and can't be null. Type"
            r7.zzb(r8, r6)
            return r1
        L16:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.zzpp.zzb
            r3 = r1
        L1c:
            r4 = 3
            if (r3 >= r4) goto L3a
            r4 = r2[r3]
            boolean r4 = r9.startsWith(r4)
            if (r4 == 0) goto L37
            com.google.android.gms.measurement.internal.zzic r7 = r5.zzu
            com.google.android.gms.measurement.internal.zzgu r7 = r7.zzaV()
            com.google.android.gms.measurement.internal.zzgs r7 = r7.zzd()
            java.lang.String r8 = "Name starts with reserved prefix. Type, name"
            r7.zzc(r8, r6, r9)
            return r1
        L37:
            int r3 = r3 + 1
            goto L1c
        L3a:
            if (r7 == 0) goto L6f
            boolean r7 = zzaA(r9, r7)
            if (r7 == 0) goto L6f
            if (r8 == 0) goto L5f
            int r7 = com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r7 = r7 + 117
            int r2 = r7 % 128
            com.google.android.gms.measurement.internal.zzpp.d = r2
            int r7 = r7 % r0
            if (r7 != 0) goto L59
            boolean r7 = zzaA(r9, r8)
            r8 = 68
            int r8 = r8 / r1
            if (r7 != 0) goto L6f
            goto L5f
        L59:
            boolean r7 = zzaA(r9, r8)
            if (r7 != 0) goto L6f
        L5f:
            com.google.android.gms.measurement.internal.zzic r7 = r5.zzu
            com.google.android.gms.measurement.internal.zzgu r7 = r7.zzaV()
            com.google.android.gms.measurement.internal.zzgs r7 = r7.zzd()
            java.lang.String r8 = "Name is reserved. Type, name"
            r7.zzc(r8, r6, r9)
            return r1
        L6f:
            int r6 = com.google.android.gms.measurement.internal.zzpp.d
            int r6 = r6 + 33
            int r7 = r6 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r7
            int r6 = r6 % r0
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpp.zzl(java.lang.String, java.lang.String[], java.lang.String[], java.lang.String):boolean");
    }

    final boolean zzad(Context context, String str) {
        int i = 2 % 2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null) {
                return true;
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
            d = i2 % 128;
            int i3 = i2 % 2;
            if (packageInfo.signatures == null) {
                return true;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                int length = packageInfo.signatures.length;
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (packageInfo.signatures.length <= 0) {
                return true;
            }
            boolean zEquals = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            d = i5 % 128;
            int i6 = i5 % 2;
            return zEquals;
        } catch (PackageManager.NameNotFoundException e2) {
            this.zzu.zzaV().zzb().zzb("Package name not found", e2);
            return true;
        } catch (CertificateException e3) {
            this.zzu.zzaV().zzb().zzb("Error obtaining certificate", e3);
            return true;
        }
    }

    final Bundle zzi(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        int i = 2 % 2;
        if (uri == null) {
            return null;
        }
        int i2 = d + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (!uri.isHierarchical()) {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            } else {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3)) {
                int i4 = d + 33;
                str = "sfmc_id";
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                if (TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                    return null;
                }
            } else {
                str = "sfmc_id";
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                int i6 = d + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                int i7 = i6 % 2;
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                d = i8 % 128;
                if (i8 % 2 == 0) {
                    bundle.putString("source", queryParameter2);
                    throw null;
                }
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                int i9 = d + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                if (i9 % 2 != 0) {
                    bundle.putString("gad_source", queryParameter10);
                    int i10 = 72 / 0;
                } else {
                    bundle.putString("gad_source", queryParameter10);
                }
            }
            String queryParameter11 = uri.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM);
            if (!TextUtils.isEmpty(queryParameter11)) {
                int i11 = d + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                int i12 = i11 % 2;
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT);
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                d = i13 % 128;
                int i14 = i13 % 2;
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            for (String str2 : uri.getQueryParameterNames()) {
                int i15 = d + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                int i16 = i15 % 2;
                if (str2.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str2, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            this.zzu.zzaV().zze().zzb("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    final boolean zzj(String str, String str2) {
        int i = 2 % 2;
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.zzu.zzaV().zzd().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        while (true) {
            d = i2 % 128;
            int i3 = i2 % 2;
            if (iCharCount >= length) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                d = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                d = i6 % 128;
                int i7 = i6 % 2;
                if (!Character.isLetterOrDigit(iCodePointAt2)) {
                    this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            iCharCount += Character.charCount(iCodePointAt2);
            i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if ((r6 instanceof android.os.Parcelable[]) != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object zzay(int r5, java.lang.Object r6, boolean r7, boolean r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpp.zzay(int, java.lang.Object, boolean, boolean, java.lang.String):java.lang.Object");
    }

    final void zzM(Bundle bundle, String str, Object obj) {
        int i = 2 % 2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            int i2 = d + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            int i4 = d + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (!(!(obj instanceof Bundle[]))) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzh().zzc("Not putting event parameter. Invalid value type. name, type", zzicVar.zzl().zzb(str), simpleName);
        }
    }

    final void zzG(zzgv zzgvVar, int i) {
        int i2 = 2 % 2;
        Bundle bundle = zzgvVar.zzd;
        int i3 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            d = i4 % 128;
            int i5 = i4 % 2;
            if (!(!zzh(str)) && (i3 = i3 + 1) > i) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                d = i6 % 128;
                int i7 = i6 % 2;
                zzic zzicVar = this.zzu;
                if (!zzicVar.zzc().zzp(null, zzfy.zzbe) || !z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    zzicVar.zzaV().zzd().zzc(sb.toString(), zzicVar.zzl().zza(zzgvVar.zza), zzicVar.zzl().zze(bundle));
                    zzax(bundle, 5);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final URL zzat(long j, String str, String str2, long j2, String str3) {
        int i = 2 % 2;
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 133005L, Integer.valueOf(zzah())), str2, str, Long.valueOf(j2));
            if (!(!str.equals(this.zzu.zzc().zzB()))) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                int i2 = d + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    if (str3.charAt(1) != 'g') {
                        strConcat = strConcat.concat("&");
                        int i3 = d + 55;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                        int i4 = i3 % 2;
                    }
                } else if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                    int i5 = d + 55;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    int i6 = i5 % 2;
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            this.zzu.zzaV().zzb().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            d = i7 % 128;
            int i8 = i7 % 2;
            return null;
        }
    }

    final void zzH(Parcelable[] parcelableArr, int i) {
        int length;
        int i2 = 2 % 2;
        int i3 = d + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            Preconditions.checkNotNull(parcelableArr);
            length = parcelableArr.length;
        } else {
            Preconditions.checkNotNull(parcelableArr);
            length = parcelableArr.length;
        }
        for (int i4 = 0; i4 < length; i4++) {
            Bundle bundle = (Bundle) parcelableArr[i4];
            int i5 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                int i6 = d + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                int i7 = i6 % 2;
                if (zzh(str)) {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                    d = i8 % 128;
                    int i9 = i8 % 2;
                    if (!zzaA(str, zzjn.zzd) && (i5 = i5 + 1) > i) {
                        int i10 = d + 101;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                        int i11 = i10 % 2;
                        zzic zzicVar = this.zzu;
                        if (!zzicVar.zzc().zzp(null, zzfy.zzbe) || !z) {
                            zzgs zzgsVarZzd = zzicVar.zzaV().zzd();
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                            sb.append("Param can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom parameters");
                            zzgsVarZzd.zzc(sb.toString(), zzicVar.zzl().zzb(str), zzicVar.zzl().zze(bundle));
                        }
                        zzax(bundle, 28);
                        bundle.remove(str);
                        z = true;
                    }
                }
            }
        }
    }

    public static ArrayList zzas(List list) {
        int i = 2 % 2;
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.zza);
            bundle.putString("origin", zzahVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzahVar.zzd);
            bundle.putString("name", zzahVar.zzc.zzb);
            zzjh.zza(bundle, Preconditions.checkNotNull(zzahVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzahVar.zze);
            String str = zzahVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzbg zzbgVar = zzahVar.zzg;
            if (zzbgVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzbgVar.zza);
                zzbe zzbeVar = zzbgVar.zzb;
                if (zzbeVar != null) {
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
                    d = i2 % 128;
                    int i3 = i2 % 2;
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzbeVar.zzf());
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
                    d = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzahVar.zzh);
            zzbg zzbgVar2 = zzahVar.zzi;
            if (zzbgVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzbgVar2.zza);
                zzbe zzbeVar2 = zzbgVar2.zzb;
                if (zzbeVar2 != null) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
                    d = i6 % 128;
                    int i7 = i6 % 2;
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzbeVar2.zzf());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzahVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzahVar.zzj);
            zzbg zzbgVar3 = zzahVar.zzk;
            if (zzbgVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzbgVar3.zza);
                zzbe zzbeVar3 = zzbgVar3.zzb;
                if (zzbeVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzbeVar3.zzf());
                }
            }
            arrayList.add(bundle);
            int i8 = d + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    final Bundle zzF(String str, String str2, Bundle bundle, List list, boolean z) {
        int iZzq;
        zzic zzicVar;
        Bundle bundle2;
        int i;
        int i2 = 2 % 2;
        boolean zZzaA = zzaA(str2, zzjm.zzd);
        Throwable th = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle3 = new Bundle(bundle);
        zzic zzicVar2 = this.zzu;
        int iZzc = zzicVar2.zzc().zzc();
        boolean z2 = false;
        int i3 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            d = i4 % 128;
            int i5 = i4 % 2;
            if (list != null) {
                int i6 = d + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                if (i6 % 2 != 0) {
                    list.contains(str3);
                    throw th;
                }
                if (list.contains(str3)) {
                    iZzq = 0;
                } else {
                    if (!(!z)) {
                        int i7 = d + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                        int i8 = i7 % 2;
                        iZzq = 0;
                    } else {
                        iZzq = zzq(str3);
                    }
                    if (iZzq == 0) {
                        iZzq = zzs(str3);
                    }
                }
            } else {
                if (!(!z)) {
                    int i9 = d + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                    iZzq = 0;
                } else {
                    iZzq = zzq(str3);
                }
                if (iZzq == 0) {
                    iZzq = zzs(str3);
                }
            }
            if (iZzq != 0) {
                zzJ(bundle3, iZzq, str3, iZzq == 3 ? str3 : th);
                bundle3.remove(str3);
                i = iZzc;
                zzicVar = zzicVar2;
                bundle2 = bundle3;
            } else {
                int i11 = iZzc;
                zzicVar = zzicVar2;
                Bundle bundle4 = bundle3;
                int iZzD = zzD(str, str2, str3, bundle.get(str3), bundle3, list, z, zZzaA);
                if (iZzD == 17) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                    d = i12 % 128;
                    if (i12 % 2 == 0) {
                        bundle2 = bundle4;
                        zzJ(bundle2, 96, str3, false);
                    } else {
                        bundle2 = bundle4;
                        zzJ(bundle2, 17, str3, false);
                    }
                } else {
                    bundle2 = bundle4;
                    if (iZzD != 0 && !"_ev".equals(str3)) {
                        int i13 = d + 79;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                        zzJ(bundle2, iZzD, (i13 % 2 == 0 ? iZzD != 21 : iZzD != 112) ? str3 : str2, bundle.get(str3));
                        bundle2.remove(str3);
                    }
                    i = i11;
                }
                if (!(!zzh(str3))) {
                    int i14 = i3 + 1;
                    i = i11;
                    if (i14 > i) {
                        if (!zzicVar.zzc().zzp(null, zzfy.zzbe) || !z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            zzicVar.zzaV().zzd().zzc(sb.toString(), zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                        }
                        zzax(bundle2, 5);
                        bundle2.remove(str3);
                        i3 = i14;
                        z2 = true;
                    } else {
                        i3 = i14;
                    }
                } else {
                    i = i11;
                }
            }
            bundle3 = bundle2;
            iZzc = i;
            zzicVar2 = zzicVar;
            th = null;
        }
        Bundle bundle5 = bundle3;
        int i15 = d + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
        int i16 = i15 % 2;
        return bundle5;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[PHI: r2
  0x00b4: PHI (r2v30 android.os.Parcelable[]) = (r2v29 android.os.Parcelable[]), (r2v34 android.os.Parcelable[]) binds: [B:37:0x00b2, B:34:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    final int zzD(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z, boolean z2) throws Throwable {
        int i;
        Object obj2;
        int size;
        Parcelable[] parcelableArr;
        int i2 = 2 % 2;
        zzg();
        Object obj3 = null;
        if (!zzt(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                zzaA(str3, zzjn.zzc);
                throw null;
            }
            if (!zzaA(str3, zzjn.zzc)) {
                return 20;
            }
            zznl zznlVarZzt = this.zzu.zzt();
            zznlVarZzt.zzg();
            zznlVarZzt.zzb();
            if (zznlVarZzt.zzK() && zznlVarZzt.zzu.zzk().zzah() < 200900) {
                return 25;
            }
            zzic zzicVar = this.zzu;
            zzicVar.zzc();
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                int i4 = d + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 != 0) {
                    zzicVar.zzaV().zzh().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                    zzicVar.zzc();
                    obj3.hashCode();
                    throw null;
                }
                zzicVar.zzaV().zzh().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                zzicVar.zzc();
                if (!(!z3)) {
                    int i5 = d + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        parcelableArr = (Parcelable[]) obj;
                        if (parcelableArr.length > 32015) {
                            bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                        }
                    } else {
                        parcelableArr = (Parcelable[]) obj;
                        if (parcelableArr.length > 200) {
                            bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                        }
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
            } else {
                i = 0;
            }
        }
        if (zzu("param", str3, ((zzZ(str2) ^ true) && !zzZ(str3)) ? this.zzu.zzc().zze(null, false) : this.zzu.zzc().zzf(null, false), obj)) {
            int i6 = d + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                zzz(str, str2, str3, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        int i8 = d + 51;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                        if (i8 % 2 == 0) {
                            this.zzu.zzaV().zzh().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                            return 4;
                        }
                        this.zzu.zzaV().zzh().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                        int i9 = 2 / 0;
                        return 4;
                    }
                    zzz(str, str2, str3, (Bundle) parcelable, list, z);
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    Object obj4 = arrayList2.get(i10);
                    if (!(obj4 instanceof Bundle)) {
                        int i11 = d + 55;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                        int i12 = i11 % 2;
                        zzgs zzgsVarZzh = this.zzu.zzaV().zzh();
                        if (obj4 != null) {
                            int i13 = d + 111;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                            int i14 = i13 % 2;
                            obj2 = obj4.getClass();
                        } else {
                            obj2 = "null";
                        }
                        zzgsVarZzh.zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2, str3);
                        return 4;
                    }
                    zzz(str, str2, str3, (Bundle) obj4, list, z);
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r6 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r2 + 61;
        com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzt(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzpp.d = r2
            int r1 = r1 % r0
            boolean r1 = r6 instanceof android.os.Parcelable[]
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == r3) goto L13
            goto L3b
        L13:
            int r2 = r2 + 89
            int r1 = r2 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r2 = r2 % r0
            boolean r2 = r6 instanceof java.util.ArrayList
            if (r2 != 0) goto L3b
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzpp.d = r2
            int r1 = r1 % r0
            r4 = 0
            boolean r6 = r6 instanceof android.os.Bundle
            if (r1 != 0) goto L30
            r1 = 42
            int r1 = r1 / r4
            if (r6 == 0) goto L3a
            goto L32
        L30:
            if (r6 == 0) goto L3a
        L32:
            int r2 = r2 + 61
            int r6 = r2 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6
            int r2 = r2 % r0
            goto L3b
        L3a:
            return r4
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpp.zzt(java.lang.Object):boolean");
    }

    final int zzq(String str) throws Throwable {
        boolean z;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getTrimmedLength("") + 40, 19 - TextUtils.indexOf("", ""), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new char[]{'\t', 18, 18, 1, 16, 23, 17, 16, 15, '\r', 20, 5, 0, 14, 2, 3, '\n', 24, 23, 19, 6, '\f'}, (byte) (View.MeasureSpec.getSize(0) + 86), 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{4, 22, '\t', 6, '\f', 0, 18, 21, 3, 7, 21, 4, 24, 11, 13904}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 81), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 140;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = i2;
        long j2 = -1;
        long j3 = (j2 ^ 2767988325344326549L) | (-670731150602367562L);
        long j4 = jElapsedRealtime ^ j2;
        long j5 = (((long) 141) * 2767988325344326549L) + (((long) (-279)) * (-670731150602367562L)) + ((jElapsedRealtime | (-670731150602367562L)) * j) + (((long) (-280)) * ((j3 ^ j2) | ((j4 | (-670731150602367562L)) ^ j2))) + (j * ((((j2 ^ (-670731150602367562L)) | 2767988325344326549L) ^ j2) | ((j4 | 2767988325344326549L) ^ j2) | (j2 ^ (j3 | jElapsedRealtime))));
        int i4 = 0;
        long j6 = jLongValue;
        while (true) {
            if (i4 == 10) {
                int length = str != null ? str.length() : 0;
                try {
                    Object[] objArr3 = {-2067126139};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46037), ((byte) KeyEvent.getModifierMetaStateMask()) + 1135, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(length), 0, 65623227, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int iResolveSize = View.resolveSize(0, 0) + 1031;
                        int iAlpha = Color.alpha(0) + 15;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        c(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, iResolveSize, iAlpha, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.resolveSize(0, 0)), MotionEvent.axisFromString("") + 1118, ExpandableListView.getPackedPositionType(0L) + 17), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i5 = ((int[]) objArr6[1])[0];
                    int i6 = ((int[]) objArr6[3])[0];
                    if (i6 != i5) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr6[0];
                        if (strArr != null) {
                            for (String str2 : strArr) {
                                arrayList.add(str2);
                            }
                        }
                        int[] iArr = new int[i6];
                        int i7 = i6 - 1;
                        z = true;
                        iArr[i7] = 1;
                        Toast.makeText((Context) null, iArr[((i6 * i7) % 2) - 1], 1).show();
                        break;
                    }
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - KeyEvent.normalizeMetaState(0)), Gravity.getAbsoluteGravity(0, 0) + 59, (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i9 = 0;
            long j7 = j6;
            while (true) {
                int i10 = 0;
                while (i10 != 8) {
                    i8 = (((((int) (j7 >> i10)) & 255) + (i8 << 6)) + (i8 << 16)) - i8;
                    i10++;
                    i9 = i9;
                }
                int i11 = i9;
                if (i11 != 0) {
                    break;
                }
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                d = i12 % 128;
                i9 = i12 % 2 == 0 ? i11 + 89 : i11 + 1;
                j7 = j5;
            }
            int i13 = i3;
            if (i8 != i13) {
                j6 -= 1024;
                i4++;
                i3 = i13;
            }
            z = true;
            break;
        }
        if (zzj("event param", str) == z) {
            if (!zzl("event param", null, null, str)) {
                return 14;
            }
            this.zzu.zzc();
            if (zzm("event param", 40, str)) {
                return 0;
            }
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
            d = i14 % 128;
            return i14 % 2 == 0 ? 2 : 3;
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i16 = i15 + 117;
        d = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i15 + 23;
        d = i18 % 128;
        if (i18 % 2 != 0) {
            return 3;
        }
        int i19 = 27 / 0;
        return 3;
    }

    final int zzs(String str) {
        int i = 2 % 2;
        if (!zzk("event param", str)) {
            return 3;
        }
        if (zzl("event param", null, null, str)) {
            this.zzu.zzc();
            if (zzm("event param", 40, str)) {
                return 0;
            }
            int i2 = d + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return 3;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        d = i4 % 128;
        int i5 = i4 % 2;
        return 14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r10 instanceof java.lang.Long) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if ((r10 instanceof java.lang.Float) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if ((r10 instanceof java.lang.Integer) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if ((r10 instanceof java.lang.Byte) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if ((r10 instanceof java.lang.Short) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        if ((r10 instanceof java.lang.Boolean) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        r2 = r1 + 105;
        com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if ((r10 instanceof java.lang.Double) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if ((!(r10 instanceof java.lang.String)) == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        r1 = r1 + 81;
        r2 = r1 % 128;
        com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if ((r1 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r5 = 66 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if ((r10 instanceof java.lang.Character) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        if ((r10 instanceof java.lang.Character) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        r2 = r2 + 79;
        com.google.android.gms.measurement.internal.zzpp.d = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if ((r2 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
    
        if ((r10 instanceof java.lang.CharSequence) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006f, code lost:
    
        r7 = r10 instanceof java.lang.CharSequence;
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
    
        r10 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0082, code lost:
    
        if (r10.codePointCount(0, r10.length()) <= r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        r6.zzu.zzaV().zzh().zzd("Value is too long; discarded. Value kind, name, value length", r7, r8, java.lang.Integer.valueOf(r10.length()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 79;
        com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzu(java.lang.String r7, java.lang.String r8, int r9, java.lang.Object r10) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzpp.d
            int r2 = r1 + 93
            int r3 = r2 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 61
            int r2 = r2 / r4
            if (r10 != 0) goto L20
            goto L18
        L16:
            if (r10 != 0) goto L20
        L18:
            int r1 = r1 + 79
            int r7 = r1 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r7
            int r1 = r1 % r0
            return r3
        L20:
            boolean r2 = r10 instanceof java.lang.Long
            if (r2 != 0) goto L9c
            boolean r2 = r10 instanceof java.lang.Float
            if (r2 != 0) goto L9c
            boolean r2 = r10 instanceof java.lang.Integer
            if (r2 != 0) goto L9c
            boolean r2 = r10 instanceof java.lang.Byte
            if (r2 != 0) goto L9c
            boolean r2 = r10 instanceof java.lang.Short
            if (r2 == 0) goto L35
            goto L9c
        L35:
            boolean r2 = r10 instanceof java.lang.Boolean
            if (r2 != 0) goto L9c
            int r2 = r1 + 105
            int r5 = r2 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5
            int r2 = r2 % r0
            boolean r2 = r10 instanceof java.lang.Double
            if (r2 == 0) goto L45
            goto L9c
        L45:
            boolean r2 = r10 instanceof java.lang.String
            r2 = r2 ^ r3
            if (r2 == r3) goto L4b
            goto L76
        L4b:
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzpp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L5c
            boolean r1 = r10 instanceof java.lang.Character
            r5 = 66
            int r5 = r5 / r4
            if (r1 != 0) goto L76
            goto L60
        L5c:
            boolean r1 = r10 instanceof java.lang.Character
            if (r1 != 0) goto L76
        L60:
            int r2 = r2 + 79
            int r1 = r2 % 128
            com.google.android.gms.measurement.internal.zzpp.d = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L6f
            boolean r0 = r10 instanceof java.lang.CharSequence
            if (r0 == 0) goto L6e
            goto L76
        L6e:
            return r4
        L6f:
            boolean r7 = r10 instanceof java.lang.CharSequence
            r7 = 0
            r7.hashCode()
            throw r7
        L76:
            java.lang.String r10 = r10.toString()
            int r0 = r10.length()
            int r0 = r10.codePointCount(r4, r0)
            if (r0 <= r9) goto L9c
            com.google.android.gms.measurement.internal.zzic r9 = r6.zzu
            com.google.android.gms.measurement.internal.zzgu r9 = r9.zzaV()
            com.google.android.gms.measurement.internal.zzgs r9 = r9.zzh()
            int r10 = r10.length()
            java.lang.String r0 = "Value is too long; discarded. Value kind, name, value length"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.zzd(r0, r7, r8, r10)
            return r4
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpp.zzu(java.lang.String, java.lang.String, int, java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0075 A[PHI: r0
  0x0075: PHI (r0v16 java.lang.String) = (r0v15 java.lang.String), (r0v39 java.lang.String) binds: [B:18:0x0073, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x0127  */
    /* JADX WARN: Code duplicated, block: B:52:0x012d  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a9 A[DONT_INVERT] */
    final void zzz(String str, String str2, String str3, Bundle bundle, List list, boolean z) throws Throwable {
        int i;
        String str4;
        String str5;
        int iZzq;
        String str6;
        int iZzD;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        d = i8 % 128;
        int i9 = i8 % 2;
        if (bundle == null) {
            return;
        }
        zzic zzicVar = this.zzu;
        boolean z2 = true;
        if (true != zzicVar.zzc().zzu.zzk().zzag(231100000, true)) {
            int i10 = d + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = i10 % 2;
            i = 0;
        } else {
            i = 35;
        }
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i12 = 0;
        boolean z3 = false;
        while (it.hasNext()) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            d = i13 % 128;
            if (i13 % i6 == 0) {
                str4 = (String) it.next();
                int i14 = 4 / 0;
                if (list != null) {
                    if (!list.contains(str4)) {
                        str5 = str4;
                        iZzq = 0;
                    }
                }
                str6 = null;
                if (iZzq != 0) {
                    int i15 = d + 7;
                    i4 = i15 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
                    int i16 = i15 % i6;
                    if (iZzq == 3) {
                        i5 = i4 + 25;
                        d = i5 % 128;
                        if (i5 % i6 == 0) {
                            int i17 = 88 / 0;
                        }
                        str6 = str5;
                    }
                    zzJ(bundle, iZzq, str5, str6);
                    bundle.remove(str5);
                    i2 = i;
                    z2 = z2;
                    i3 = i6;
                } else {
                    if ((zzt(bundle.get(str5)) ^ z2) != z2) {
                        zzicVar.zzaV().zzh().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                        iZzD = 22;
                    } else {
                        iZzD = zzD(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                    }
                    if (iZzD == 0 && !"_ev".equals(str5)) {
                        zzJ(bundle, iZzD, str5, bundle.get(str5));
                        bundle.remove(str5);
                    } else if (zzh(str5) && !zzaA(str5, zzjn.zzd)) {
                        int i18 = i12 + 1;
                        if (zzag(231100000, z2)) {
                            i2 = i;
                            i3 = 2;
                            if (i18 > i2) {
                                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
                                d = i19 % 128;
                                if (i19 % 2 == 0) {
                                    int i20 = 23 / 0;
                                    if (zzicVar.zzc().zzp(null, zzfy.zzbe)) {
                                        if (!z3) {
                                        }
                                    }
                                    zzax(bundle, 28);
                                    bundle.remove(str5);
                                    i12 = i18;
                                    i = i2;
                                    i6 = 2;
                                    z2 = z2;
                                    z3 = z2;
                                } else {
                                    if (zzicVar.zzc().zzp(null, zzfy.zzbe)) {
                                        if (!z3) {
                                        }
                                    }
                                    zzax(bundle, 28);
                                    bundle.remove(str5);
                                    i12 = i18;
                                    i = i2;
                                    i6 = 2;
                                    z2 = z2;
                                    z3 = z2;
                                }
                                zzgs zzgsVarZzd = zzicVar.zzaV().zzd();
                                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
                                sb.append("Item can't contain more than ");
                                sb.append(i2);
                                sb.append(" item-scoped custom params");
                                zzgsVarZzd.zzc(sb.toString(), zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                                zzax(bundle, 28);
                                bundle.remove(str5);
                                i12 = i18;
                                i = i2;
                                i6 = 2;
                                z2 = z2;
                                z3 = z2;
                            }
                        } else {
                            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                            d = i21 % 128;
                            int i22 = i21 % 2;
                            zzicVar.zzaV().zzd().zzc("Item array not supported on client's version of Google Play Services (Android Only)", zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                            zzax(bundle, 23);
                            bundle.remove(str5);
                            int i23 = d + 65;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                            i3 = 2;
                            int i24 = i23 % 2;
                            i2 = i;
                        }
                        i12 = i18;
                    }
                    i2 = i;
                    i3 = 2;
                }
                i = i2;
                i6 = i3;
                z2 = z2;
            } else {
                str4 = (String) it.next();
                if (list != 0) {
                    if (!list.contains(str4)) {
                        str5 = str4;
                        iZzq = 0;
                    }
                }
                str6 = null;
                if (iZzq != 0) {
                    int i110 = d + 7;
                    i4 = i110 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
                    int i111 = i110 % i6;
                    if (iZzq == 3) {
                        i5 = i4 + 25;
                        d = i5 % 128;
                        if (i5 % i6 == 0) {
                            int i112 = 88 / 0;
                        }
                        str6 = str5;
                    }
                    zzJ(bundle, iZzq, str5, str6);
                    bundle.remove(str5);
                    i2 = i;
                    z2 = z2;
                    i3 = i6;
                } else {
                    if ((zzt(bundle.get(str5)) ^ z2) != z2) {
                        zzicVar.zzaV().zzh().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                        iZzD = 22;
                    } else {
                        iZzD = zzD(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                    }
                    if (iZzD == 0) {
                        if (zzh(str5)) {
                            i2 = i;
                            i3 = 2;
                        } else {
                            i2 = i;
                            i3 = 2;
                        }
                    } else if (zzh(str5)) {
                        i2 = i;
                        i3 = 2;
                    } else {
                        i2 = i;
                        i3 = 2;
                    }
                }
                i = i2;
                i6 = i3;
                z2 = z2;
            }
            if (z) {
                iZzq = 0;
            } else {
                int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                d = i25 % 128;
                if (i25 % i6 == 0) {
                    iZzq = zzq(str4);
                    int i26 = 25 / 0;
                } else {
                    iZzq = zzq(str4);
                }
            }
            if (iZzq == 0) {
                iZzq = zzs(str4);
            }
            str5 = str4;
            str6 = null;
            if (iZzq != 0) {
                int i113 = d + 7;
                i4 = i113 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
                int i114 = i113 % i6;
                if (iZzq == 3) {
                    i5 = i4 + 25;
                    d = i5 % 128;
                    if (i5 % i6 == 0) {
                        int i115 = 88 / 0;
                    }
                    str6 = str5;
                }
                zzJ(bundle, iZzq, str5, str6);
                bundle.remove(str5);
                i2 = i;
                z2 = z2;
                i3 = i6;
            } else {
                if ((zzt(bundle.get(str5)) ^ z2) != z2) {
                    zzicVar.zzaV().zzh().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iZzD = 22;
                } else {
                    iZzD = zzD(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (iZzD == 0) {
                    if (zzh(str5)) {
                        i2 = i;
                        i3 = 2;
                    } else {
                        i2 = i;
                        i3 = 2;
                    }
                } else if (zzh(str5)) {
                    i2 = i;
                    i3 = 2;
                } else {
                    i2 = i;
                    i3 = 2;
                }
            }
            i = i2;
            i6 = i3;
            z2 = z2;
        }
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        long j = -1;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1)) + 2266, (ViewConfiguration.getScrollBarSize() >> 8) + 33, -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    j = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        long j2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267, 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $11 + 113;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i8 = $10 + 29;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                    i3 = 2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (49268 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)));
                        int iIndexOf = TextUtils.indexOf("", "") + 3261;
                        int packedPositionChild = 29 - ExpandableListView.getPackedPositionChild(j2);
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iIndexOf, packedPositionChild, -127612708, false, $$e(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 22878), 593 - TextUtils.lastIndexOf("", '0', 0, 0), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1570859318, false, $$e(b9, b10, (byte) (b10 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                        int i11 = $11 + 99;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        } else {
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                            int i17 = $11 + 125;
                            $10 = i17 % 128;
                            i3 = 2;
                            int i18 = i17 % 2;
                        }
                    }
                    i3 = 2;
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i3;
                obj2 = obj;
                j2 = 0;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zzb = new String[]{"firebase_", "google_", "ga_"};
        zzc = new String[]{"_err"};
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    protected final boolean zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        d = i2 % 128;
        return i2 % 2 != 0;
    }

    public final long zzaj(long j, long j2) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        long j3 = (j + (j2 * 60000)) / CalendarModelKt.MillisecondsIn24Hours;
        int i5 = i2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return j3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        b = new char[]{60072, 60047, 60062, 60041, 60034, 60043, 60076, 60056, 60058, 60074, 60040, 60048, 60075, 60078, 60054, 60117, 60063, 60079, 60052, 60053, 60088, 60050, 60077, 60073, 60055};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 57188;
    }

    private static String $$e(int i, int i2, short s) {
        int i3 = 3 - (s * 2);
        byte[] bArr = $$c;
        int i4 = i * 2;
        int i5 = i2 + 113;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = i4 + i3;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i5;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            int i8 = i3 + 1;
            i5 += bArr[i8];
            i3 = i8;
            i6 = i7;
        }
    }
}
