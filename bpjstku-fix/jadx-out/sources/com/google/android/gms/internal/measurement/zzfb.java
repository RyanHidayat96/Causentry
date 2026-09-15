package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfb {
    private static volatile zzfb zzc;
    protected final ExecutorService zzb;
    private final AppMeasurementSdk zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzcr zzj;
    private static final byte[] $$c = {58, -103, 118, 14};
    private static final int $$f = 152;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {51, -99, -8, -59, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 67, 3, -12, 15, -13, 10, 7, -18, 20, -10, 7, 0, -63, 55, 6, -1, 3, 12, -18, 12, -8, -1, 18, -13, -53, 23, 34, 16, -18, 9, 4, -39, 38, -1, 3, 12, -18, 12, -40, 31, 18, -13, -34, 35, 18, -10, 14, -12, 12, 6, -84, 80, -2, -10, -1, 7, -7, 12, -71, 1, 70, 6, -1, -2, 6, -8, 0, -63, 83, -12, -3, 19, -41, 35, -10, 2, 8, -71, 65, 2, 2, -4, 21, -8, 9, -79, 16, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -64};
    private static final int $$e = 251;
    private static final byte[] $$a = {53, -70, 9, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 181;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = 3470603854573876912L;
    private final String zzd = "FA";
    protected final Clock zza = DefaultClock.getInstance();

    protected zzfb(Context context, Bundle bundle) {
        zzcm.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzed(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzlt.zza(context, "google_app_id", com.google.android.gms.measurement.internal.zzhu.zza(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
                    int i = b + 25;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 2 % 2;
                    }
                } catch (ClassNotFoundException unused) {
                    this.zzi = null;
                    this.zzh = true;
                    Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.zzi = "fa";
        zzS(new zzdr(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            int i3 = b + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
            return;
        }
        application.registerActivityLifecycleCallbacks(new zzfa(this));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r5 = r5 * 15
            int r0 = 53 - r5
            int r6 = r6 * 2
            int r6 = r6 + 84
            byte[] r1 = com.google.android.gms.internal.measurement.zzfb.$$a
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfb.a(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            int r5 = r5 * 46
            int r0 = r5 + 53
            byte[] r1 = com.google.android.gms.internal.measurement.zzfb.$$d
            int r6 = r6 * 15
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            int r5 = r5 + 52
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2b:
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfb.d(byte, short, int, java.lang.Object[]):void");
    }

    private final void zzS(zzeq zzeqVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.execute(zzeqVar);
        int i4 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void zzU(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        int i = 2 % 2;
        zzS(new zzep(this, l, str, str2, bundle, z, z2));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static zzfb zza(Context context, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzc == null) {
            synchronized (zzfb.class) {
                if (zzc == null) {
                    zzc = new zzfb(context, bundle);
                }
            }
        }
        return zzc;
    }

    public final void zzD(int i, String str, Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        zzS(new zzec(this, false, 5, str, obj, null, null));
        int i3 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
    }

    public final void zzK(boolean z) {
        int i = 2 % 2;
        zzS(new zzej(this, z));
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
    }

    public final void zzL(Bundle bundle) {
        int i = 2 % 2;
        zzS(new zzek(this, bundle));
        int i2 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zze(Intent intent) {
        int i = 2 % 2;
        zzS(new zzem(this, intent));
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
    }

    public final void zzf(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        Preconditions.checkNotNull(zzjqVar);
        List list = this.zzf;
        synchronized (list) {
            for (int i = 0; i < list.size(); i++) {
                if (zzjqVar.equals(((Pair) list.get(i)).first)) {
                    Log.w(this.zzd, "OnEventListener already registered.");
                    return;
                }
            }
            zzes zzesVar = new zzes(zzjqVar);
            list.add(new Pair(zzjqVar, zzesVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzesVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzS(new zzen(this, zzesVar));
        }
    }

    public final void zzg(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        Pair pair;
        Preconditions.checkNotNull(zzjqVar);
        List list = this.zzf;
        synchronized (list) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    pair = null;
                    break;
                } else {
                    if (zzjqVar.equals(((Pair) list.get(i)).first)) {
                        pair = (Pair) list.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (pair == null) {
                Log.w(this.zzd, "OnEventListener had not been registered.");
                return;
            }
            list.remove(pair);
            zzes zzesVar = (zzes) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzesVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzS(new zzeo(this, zzesVar));
        }
    }

    public final void zzh(String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            zzU(null, str, bundle, false, false, null);
        } else {
            zzU(null, str, bundle, false, true, null);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
    }

    public final void zzi(String str, String str2, Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            zzU(str, str2, bundle, true, true, null);
        } else {
            zzU(str, str2, bundle, true, true, null);
        }
        int i3 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
    }

    public final void zzj(String str, String str2, Bundle bundle, long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            zzU(str, str2, bundle, false, false, Long.valueOf(j));
        } else {
            zzU(str, str2, bundle, true, false, Long.valueOf(j));
        }
    }

    public final void zzk(String str, String str2, Object obj, boolean z) {
        int i = 2 % 2;
        zzS(new zzdh(this, str, str2, obj, z));
        int i2 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void zzl(Bundle bundle) {
        int i = 2 % 2;
        zzS(new zzdi(this, bundle));
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void zzm(String str, String str2, Bundle bundle) {
        int i = 2 % 2;
        zzS(new zzdj(this, str, str2, bundle));
        int i2 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzo(String str) {
        int i = 2 % 2;
        zzS(new zzdl(this, str));
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
    }

    public final void zzp(zzdf zzdfVar, String str, String str2) {
        int i = 2 % 2;
        zzS(new zzdm(this, zzdfVar, str, str2));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }

    private final void zzT(Exception exc, boolean z, boolean z2) {
        int i = 2 % 2;
        this.zzh |= z;
        if (z) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            b = i2 % 128;
            int i3 = i2 % 2;
            Log.w(this.zzd, "Data collection startup failed. No data will be collected.", exc);
            int i4 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (!(!z2)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                zzD(4, "Error with data collection. Data lost.", exc, null, null);
            } else {
                zzD(5, "Error with data collection. Data lost.", exc, null, null);
            }
        }
        Log.w(this.zzd, "Error with data collection. Data lost.", exc);
    }

    public final String zzA() {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzdz(this, zzcoVar));
        String strZzc = zzcoVar.zzc(500L);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return strZzc;
        }
        throw null;
    }

    public final String zzB() {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzea(this, zzcoVar));
        String strZzc = zzcoVar.zzc(500L);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return strZzc;
    }

    public final Bundle zzE(Bundle bundle, boolean z) {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzee(this, bundle, zzcoVar));
        if (!z) {
            int i2 = b + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return zzcoVar.zze(5000L);
        }
        zzcoVar.zze(5000L);
        throw null;
    }

    public final String zzG() {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzeg(this, zzcoVar));
        String strZzc = zzcoVar.zzc(120000L);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
        return strZzc;
    }

    public final Long zzH() {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzeh(this, zzcoVar));
        Long lZzd = zzcoVar.zzd(120000L);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return lZzd;
    }

    public final Object zzJ(int i) {
        int i2 = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzei(this, zzcoVar, i));
        Object objZzf = zzco.zzf(zzcoVar.zze(15000L), Object.class);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return objZzf;
    }

    public final int zzF(String str) {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzef(this, str, zzcoVar));
        Integer num = (Integer) zzco.zzf(zzcoVar.zze(10000L), Integer.class);
        if (num == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            b = i2 % 128;
            int i3 = i2 % 2;
            return 25;
        }
        int iIntValue = num.intValue();
        int i4 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        int i = 2 % 2;
        zzer zzerVar = new zzer(zzjpVar);
        if (this.zzj != null) {
            int i2 = b + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzj.setEventInterceptor(zzerVar);
                int i4 = b + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zzS(new zzel(this, zzerVar));
    }

    public final List zzn(String str, String str2) {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzdk(this, str, str2, zzcoVar));
        List listEmptyList = (List) zzco.zzf(zzcoVar.zze(5000L), List.class);
        if (listEmptyList == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                listEmptyList = Collections.emptyList();
                int i3 = 23 / 0;
            } else {
                listEmptyList = Collections.emptyList();
            }
        }
        int i4 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }

    public final Map zzC(String str, String str2, boolean z) {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzeb(this, str, str2, z, zzcoVar));
        Bundle bundleZze = zzcoVar.zze(5000L);
        if (bundleZze == null || bundleZze.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleZze.size());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        b = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            for (String str3 : bundleZze.keySet()) {
                Object obj = bundleZze.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    map.put(str3, obj);
                    i2 = b + 5;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                }
            }
            return map;
        }
    }

    protected final zzcr zzc(Context context, boolean z) {
        DynamiteModule.VersionPolicy versionPolicy;
        int i = 2 % 2;
        try {
            if (z) {
                int i2 = b + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                versionPolicy = DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION;
            } else {
                versionPolicy = DynamiteModule.PREFER_LOCAL;
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
            zzcr zzcrVarAsInterface = zzcq.asInterface(DynamiteModule.load(context, versionPolicy, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            b = i6 % 128;
            int i7 = i6 % 2;
            return zzcrVarAsInterface;
        } catch (DynamiteModule.LoadingException e2) {
            zzT(e2, true, false);
            return null;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 85;
        $10 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (abortcapture.b >= cArrB.length) {
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                return;
            }
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16778572, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.indexOf("", "", 0, 0)), 468 - View.MeasureSpec.makeMeasureSpec(0, 0), Process.getGidForName("") + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                i3 = $10 + 101;
                $11 = i3 % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public final void zzq(Boolean bool) throws IllegalAccessException {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.red(0) + 46400), 40 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf("", "") + 19, 1513912262, false, "b", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), TextUtils.getTrimmedLength("") + 59, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - (ViewConfiguration.getLongPressTimeout() >> 16)), 59 - TextUtils.getTrimmedLength(""), TextUtils.lastIndexOf("", '0', 0) + 19, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -55;
        long j3 = (j2 * 3032946423217010767L) + (j2 * 2486307073942775472L);
        long j4 = 56;
        long jMyPid = Process.myPid();
        long j5 = -1;
        long j6 = j3 + ((((jMyPid | 3032946423217010767L) ^ j5) | 2486307073942775472L) * j4) + (((long) (-56)) * (3068978570717462271L ^ j5)) + (j4 * ((j5 ^ ((jMyPid ^ j5) | 2486307073942775472L)) | 3032946423217010767L));
        int i5 = 0;
        int i6 = i4;
        while (true) {
            int i7 = 0;
            while (i7 != 8) {
                int i8 = b + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                if (i8 % 2 == 0) {
                    i6 = (((((int) (j >>> i7)) & 26699) * (i6 / 38)) / (i6 >> 2)) - i6;
                    i7 += 61;
                } else {
                    i6 = (((((int) (j >> i7)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                    i7++;
                }
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j = j6;
        }
        if (i6 != i2) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 40 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i3));
        }
        zzS(new zzdn(this, bool));
        int i9 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 77 / 0;
        }
    }

    public final void zzr(Bundle bundle) {
        int i = 2 % 2;
        zzS(new zzdo(this, bundle));
        int i2 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void zzs() {
        int i = 2 % 2;
        zzS(new zzdp(this));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void zzt(long j) {
        int i = 2 % 2;
        zzS(new zzdq(this, j));
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void zzu(String str) {
        int i = 2 % 2;
        zzS(new zzds(this, str));
        int i2 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
    }

    public final void zzv(String str) {
        int i = 2 % 2;
        zzS(new zzdt(this, str));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzw(Runnable runnable) {
        int i = 2 % 2;
        zzS(new zzdv(this, runnable));
        int i2 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
    }

    public final String zzx() {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzdw(this, zzcoVar));
        String strZzc = zzcoVar.zzc(500L);
        int i2 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return strZzc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzy() {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzdx(this, zzcoVar));
        String strZzc = zzcoVar.zzc(50L);
        int i2 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return strZzc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long zzz() {
        int i = 2 % 2;
        zzco zzcoVar = new zzco();
        zzS(new zzdy(this, zzcoVar));
        Long lZzd = zzcoVar.zzd(500L);
        if (lZzd != null) {
            long jLongValue = lZzd.longValue();
            int i2 = b + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 0;
            }
            return jLongValue;
        }
        long jNextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i4 = this.zzg + 1;
        this.zzg = i4;
        long j = jNextLong + ((long) i4);
        int i5 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    final /* synthetic */ void zzN(Exception exc, boolean z, boolean z2) {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
            int scrollBarSize = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, i2, scrollBarSize, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{37737, 37640, 62039, 12015, 6452, 41212, 50355, 57438, 21059, 32424, 36252, 23479, 30134, 60698, 142, 12066, 51480, 6210, 45884, 41644, 24164, 33946, 10140, 12750, 54194, 13066}, (-1) - TextUtils.lastIndexOf("", '0', 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{41804, 41769, 25575, 48989, 18424, 65077, 56653, 53351, 19391, 61206, 54101, 16951, 17817, 31930, 24069, 14073, 63789, 35310, 60900}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int defaultSize2 = 2267 - View.getDefaultSize(0, 0);
            int maxKeyCode = 33 - (KeyEvent.getMaxKeyCode() >> 16);
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, b4, bArr[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, defaultSize2, maxKeyCode, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int jumpTapTimeout = 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iIndexOf = 33 - TextUtils.indexOf("", "", 0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr2[132], bArr2[7], bArr2[37], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, jumpTapTimeout, iIndexOf, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[0])[0];
            int i4 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (~((-831357301) | i5)) | 813957220;
            int i7 = ~(iIdentityHashCode | (-5243905));
            int i8 = 1393344635 + ((i6 | i7) * (-502)) + ((i7 | (~(i5 | (-17400081)))) * TypedValues.PositionType.TYPE_DRAWPATH) + 1235105009;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{41885, 41980, 65053, 8869, 37638, 10958, 17403, 53418, 54539, 29410, 1966, 56575, 17740, 57683, 35554, 43031, 63956, 5144, 14606, 9704, 28299, 35066, 44470, 46736, 58225, 16195, 53464, 596, 6124, 45607}, ExpandableListView.getPackedPositionType(0L), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{46902, 46933, 3067, 55128, 4106, 43476, 45641, 50187, 9401, 34584, 33956, 11554, 20982, 5294, 2532, 23010, 60765, 57831, 47636, 54362, 31289, 32000}, KeyEvent.normalizeMetaState(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{50859, 50881, 20307, 37860, 24493, 58999, 29936, 46557, 57875, 50086, 51986, 60327, 8316, 20556, 18040, 40792, 40144, 42318, 62886, 4852}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{14445, 14340, 62722, 10672, 23802, 58675, 30649, 19265, 57685, 31223, 51267, 59638, 56981, 59991, 17692, 39951, 25126, 7937, 63203, 4538}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i12 = i11 + 21;
            b = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 73;
            b = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1235105009};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                d(bArr3[74], bArr3[26], bArr3[5], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[26];
                byte b6 = bArr3[74];
                Object[] objArr14 = new Object[1];
                d(b5, b6, (byte) (b6 | 96), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int iArgb = 2267 - Color.argb(0, 0, 0, 0);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33;
                        byte[] bArr4 = $$a;
                        Object[] objArr15 = new Object[1];
                        a(bArr4[132], bArr4[7], bArr4[37], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, iArgb, minimumFlingVelocity, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(new char[]{37737, 37640, 62039, 12015, 6452, 41212, 50355, 57438, 21059, 32424, 36252, 23479, 30134, 60698, 142, 12066, 51480, 6210, 45884, 41644, 24164, 33946, 10140, 12750, 54194, 13066}, ViewConfiguration.getPressedStateDuration() >> 16, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(new char[]{41804, 41769, 25575, 48989, 18424, 65077, 56653, 53351, 19391, 61206, 54101, 16951, 17817, 31930, 24069, 14073, 63789, 35310, 60900}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c4 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2268;
                            int i16 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33;
                            byte[] bArr5 = $$a;
                            byte b7 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            a(b7, b7, bArr5[132], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, bitsPerPixel, i16, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int i17 = 2267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 33;
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr19 = new Object[1];
                            a(b8, b9, b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, i17, tapTimeout2, -887667012, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i18 = ((int[]) objArr[c])[0];
        int i19 = ((int[]) objArr[0])[0];
        if (i19 == i18) {
            Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i23 = ~((-747168644) | iIdentityHashCode2);
            int i24 = i20 + (-77667985) + ((50532376 | i23) * (-476)) + (i23 * 952) + ((~((~iIdentityHashCode2) | (-747168644))) * 476);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr20[2])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                b = i27 % 128;
                int i28 = i27 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i19];
            int i29 = i19 - 1;
            iArr[i29] = 1;
            Toast.makeText((Context) null, iArr[((i19 * i29) % 2) - 1], 1).show();
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int i33 = ~((~((int) Runtime.getRuntime().totalMemory())) | 540337120);
            int i34 = i30 + (((536929120 | i33) * (-374)) - 1517850717) + ((i33 | 3408000) * 374);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr21[2])[0] = i36 ^ (i36 << 5);
        }
        zzT(exc, z, z2);
    }

    public final String zzI() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.zzi;
        int i5 = i3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return str;
    }

    final /* synthetic */ void zzM(zzeq zzeqVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzS(zzeqVar);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
    }

    final /* synthetic */ String zzO() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzd;
        int i5 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    final /* synthetic */ boolean zzP() {
        int i = 2 % 2;
        int i2 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzh;
        }
        throw null;
    }

    final /* synthetic */ zzcr zzQ() {
        int i = 2 % 2;
        int i2 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        zzcr zzcrVar = this.zzj;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return zzcrVar;
        }
        throw null;
    }

    final /* synthetic */ void zzR(zzcr zzcrVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.zzj = zzcrVar;
        int i4 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final AppMeasurementSdk zzb() {
        int i = 2 % 2;
        int i2 = b + 59;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        AppMeasurementSdk appMeasurementSdk = this.zze;
        int i5 = i3 + 71;
        b = i5 % 128;
        int i6 = i5 % 2;
        return appMeasurementSdk;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 107
            byte[] r0 = com.google.android.gms.internal.measurement.zzfb.$$c
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfb.$$g(byte, short, byte):java.lang.String");
    }
}
