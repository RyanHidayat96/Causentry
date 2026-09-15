package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.material3.CalendarModelKt;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrn;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class zzgi extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$f = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, -119, -76, 97, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 164;
    private static final byte[] $$a = {106, -22, 107, 95, 2, -15, 36, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9};
    private static final int $$b = 136;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int[] b = {-1758005617, -1290511597, -430372385, -1005056098, 1310318343, -699741072, -704543940, 1087449602, 1482715450, -1765431823, 1958805065, 1262754323, -1511354820, -591466933, 1447304050, -1974503579, -1460188918, -859544175};

    zzgi(zzic zzicVar, long j, long j2) {
        super(zzicVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
        this.zzh = j2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r9 = r9 * 2
            int r9 = 14 - r9
            byte[] r0 = com.google.android.gms.measurement.internal.zzgi.$$a
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r7]
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgi.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = 103 - r5
            byte[] r0 = com.google.android.gms.measurement.internal.zzgi.$$d
            int r7 = r7 * 52
            int r1 = 53 - r7
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r6]
            int r3 = r3 + 1
        L28:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgi.c(int, short, short, java.lang.Object[]):void");
    }

    final int zzm() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.zzc;
        int i5 = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    final int zzo() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        int i4 = this.zzk;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    final boolean zzq(String str) {
        int i = 2 % 2;
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (!str2.equals(str)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    z = true;
                }
            }
        }
        this.zzo = str;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    final String zzj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        Preconditions.checkNotNull(this.zza);
        String str = this.zza;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    final String zzl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        Preconditions.checkNotNull(this.zze);
        String str = this.zze;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final String zzk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            zzg();
            zzb();
            Preconditions.checkNotNull(this.zzl);
            return this.zzl;
        }
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzl);
        throw null;
    }

    final void zzi() {
        String str;
        String str2;
        int i = 2 % 2;
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzicVar.zzk().zzf().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            str = null;
            if (i2 % 2 == 0) {
                zzicVar.zzaV().zzj().zza("Analytics Storage consent is not granted");
                int i3 = 58 / 0;
            } else {
                zzicVar.zzaV().zzj().zza("Analytics Storage consent is not granted");
            }
        }
        zzgs zzgsVarZzj = zzicVar.zzaV().zzj();
        if (str == null) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            str2 = "null";
        } else {
            str2 = "not null";
        }
        zzgsVarZzj.zza(String.format("Resetting session stitching token to %s", str2));
        this.zzm = str;
        this.zzn = zzicVar.zzaZ().currentTimeMillis();
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0778 A[Catch: NameNotFoundException -> 0x07ff, TRY_ENTER, TRY_LEAVE, TryCatch #11 {NameNotFoundException -> 0x07ff, blocks: (B:110:0x0701, B:123:0x076f, B:130:0x0778, B:134:0x0785, B:136:0x078c, B:144:0x079b, B:146:0x07a3, B:141:0x0791), top: B:255:0x0701 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x077c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0785 A[Catch: NameNotFoundException -> 0x07ff, TRY_ENTER, TRY_LEAVE, TryCatch #11 {NameNotFoundException -> 0x07ff, blocks: (B:110:0x0701, B:123:0x076f, B:130:0x0778, B:134:0x0785, B:136:0x078c, B:144:0x079b, B:146:0x07a3, B:141:0x0791), top: B:255:0x0701 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0791 A[Catch: NameNotFoundException -> 0x07ff, TRY_ENTER, TryCatch #11 {NameNotFoundException -> 0x07ff, blocks: (B:110:0x0701, B:123:0x076f, B:130:0x0778, B:134:0x0785, B:136:0x078c, B:144:0x079b, B:146:0x07a3, B:141:0x0791), top: B:255:0x0701 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x086c  */
    /* JADX WARN: Code duplicated, block: B:187:0x086f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0872  */
    /* JADX WARN: Code duplicated, block: B:191:0x0875  */
    /* JADX WARN: Code duplicated, block: B:193:0x0878  */
    /* JADX WARN: Code duplicated, block: B:195:0x087b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0889  */
    /* JADX WARN: Code duplicated, block: B:198:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:199:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:200:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:201:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:202:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:203:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:204:0x0906  */
    /* JADX WARN: Code duplicated, block: B:208:0x0932  */
    /* JADX WARN: Code duplicated, block: B:209:0x093e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0943 A[Catch: IllegalStateException -> 0x0955, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x0955, blocks: (B:206:0x091e, B:210:0x093f, B:212:0x0943), top: B:243:0x091e }] */
    /* JADX WARN: Code duplicated, block: B:219:0x097e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0984  */
    /* JADX WARN: Code duplicated, block: B:222:0x0992  */
    /* JADX WARN: Code duplicated, block: B:225:0x099d A[EDGE_INSN: B:225:0x099d->B:228:0x09b2 BREAK  A[LOOP:0: B:223:0x0996->B:266:?]] */
    /* JADX WARN: Code duplicated, block: B:226:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:229:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:231:0x09bf  */
    /* JADX WARN: Code duplicated, block: B:264:0x099d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.internal.zzgi, com.google.android.gms.measurement.internal.zzje] */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.content.pm.PackageManager] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18, types: [int] */
    /* JADX WARN: Type inference failed for: r21v19, types: [char] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v23 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r21v25 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27 */
    /* JADX WARN: Type inference failed for: r21v28 */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v20 */
    /* JADX WARN: Type inference failed for: r27v21 */
    /* JADX WARN: Type inference failed for: r27v22 */
    /* JADX WARN: Type inference failed for: r27v23 */
    /* JADX WARN: Type inference failed for: r27v24 */
    /* JADX WARN: Type inference failed for: r27v25 */
    /* JADX WARN: Type inference failed for: r27v26 */
    /* JADX WARN: Type inference failed for: r27v27 */
    /* JADX WARN: Type inference failed for: r27v28 */
    /* JADX WARN: Type inference failed for: r27v29 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v30 */
    /* JADX WARN: Type inference failed for: r27v31 */
    /* JADX WARN: Type inference failed for: r27v32 */
    /* JADX WARN: Type inference failed for: r27v33 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.pm.PackageManager] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.google.android.gms.measurement.internal.zzg
    protected final void zzf() throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        ?? r27;
        ?? r21;
        ?? r1;
        ?? r3;
        int i;
        int i2;
        int i3;
        String string;
        String string2;
        String str5;
        ?? r4;
        Method method;
        int i4;
        int iIntValue;
        ?? r28;
        ?? r2;
        int iZzC;
        ?? r5;
        zzic zzicVar;
        zzic zzicVar2;
        List listZzs;
        Iterator it;
        String strZza;
        ?? r7;
        ?? r29;
        ?? r6;
        ?? r210;
        ?? r22;
        ?? r8;
        ?? packageManager = this;
        int i5 = 2 % 2;
        zzic zzicVar3 = packageManager.zzu;
        zzicVar3.zzaV().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(packageManager.zzh), Long.valueOf(packageManager.zzg));
        ?? packageName = zzicVar3.zzaY().getPackageName();
        packageManager = zzicVar3.zzaY().getPackageManager();
        ?? r9 = "";
        String installerPackageName = EnvironmentCompat.MEDIA_UNKNOWN;
        try {
            if (packageManager != 0) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    packageManager.zzu.zzaV().zzb().zzb("Error retrieving app installer package name. appId", zzgu.zzl(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    zzic zzicVar4 = packageManager.zzu;
                    ArrayList arrayList = new ArrayList();
                    int iIntValue2 = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                    Method[] methodArr = new Method[2];
                    Class<?> cls = Class.forName("android.content.pm.PackageManager");
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    byte b4 = b3;
                    Object[] objArr = new Object[1];
                    a(b2, b3, b4, objArr);
                    String str6 = (String) objArr[0];
                    str = "Unknown";
                    try {
                        Class<?>[] clsArr = new Class[2];
                        clsArr[0] = String.class;
                        str2 = installerPackageName;
                        try {
                            clsArr[1] = Integer.TYPE;
                            methodArr[0] = cls.getMethod(str6, clsArr);
                            Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
                            Object[] objArr2 = new Object[1];
                            a(b2, b3, b4, objArr2);
                            methodArr[1] = cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                            int i6 = 54;
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2823;
                                int defaultSize = 22 - View.getDefaultSize(0, 0);
                                byte[] bArr = $$d;
                                byte b5 = bArr[54];
                                byte b6 = bArr[7];
                                Object[] objArr3 = new Object[1];
                                c(b5, b6, b6, objArr3);
                                r9 = 0;
                                packageName = keyRepeatDelay;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packageName, jumpTapTimeout, defaultSize, 1814927978, false, (String) objArr3[0], null);
                            }
                            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                                int i7 = TuitionPaymentFragmentbindingInflater1 + 121;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                                int i8 = i7 % 2;
                                char cResolveSize = (char) View.resolveSize(0, 0);
                                int i9 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                                long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
                                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cResolveSize, i9, 23 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)))).getDeclaredMethods();
                                int length = declaredMethods.length;
                                int i10 = 0;
                                packageName = globalActionKeyTimeout;
                                while (i10 < length) {
                                    Method method2 = declaredMethods[i10];
                                    packageName = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i11 = packageName + 43;
                                    TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        try {
                                            int i12 = i6 >>> (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1));
                                            Object[] objArr4 = new Object[1];
                                            d(new int[]{1670843784, 1766891128, -1196109710, 1595037932, 855489057, 1239866403, 1264886437, -1146705887, 458363990, 1907200902, 82116552, 912897206, -499138821, -484190100}, i12, objArr4);
                                            Class<?> cls3 = Class.forName((String) objArr4[0]);
                                            Object[] objArr5 = new Object[1];
                                            d(new int[]{1425250581, -2044899529, -1422267115, 1217816595, 1446810420, -1567139723, -662254855, -1750179212}, 6 >>> (ViewConfiguration.getEdgeSlop() >>> 94), objArr5);
                                            iIntValue = ((Integer) cls3.getMethod((String) objArr5[0], null).invoke(method2, null)).intValue();
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    } else {
                                        Object[] objArr6 = new Object[1];
                                        d(new int[]{1670843784, 1766891128, -1196109710, 1595037932, 855489057, 1239866403, 1264886437, -1146705887, 458363990, 1907200902, 82116552, 912897206, -499138821, -484190100}, 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr6);
                                        Class<?> cls4 = Class.forName((String) objArr6[0]);
                                        Object[] objArr7 = new Object[1];
                                        d(new int[]{1425250581, -2044899529, -1422267115, 1217816595, 1446810420, -1567139723, -662254855, -1750179212}, (ViewConfiguration.getEdgeSlop() >> 16) + 12, objArr7);
                                        iIntValue = ((Integer) cls4.getMethod((String) objArr7[0], null).invoke(method2, null)).intValue();
                                    }
                                    Object[] objArr8 = {Integer.valueOf(iIntValue)};
                                    Object[] objArr9 = new Object[1];
                                    d(new int[]{1707526134, -1555027518, 439455914, 1178508657, -348994529, -575654330, 8064439, -538870374, -615735025, -213615429, 710924603, 1327881436, -316135903, -859267486, -1666838416, 87331849}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, objArr9);
                                    Class<?> cls5 = Class.forName((String) objArr9[0]);
                                    int i13 = length;
                                    Object[] objArr10 = new Object[1];
                                    d(new int[]{-522634852, 1466210941, -72304474, 882179206, -1976618749, -1176275281}, 8 - View.getDefaultSize(0, 0), objArr10);
                                    if (!(!((Boolean) cls5.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, objArr8)).booleanValue())) {
                                        Class cls6 = Long.TYPE;
                                        Object[] objArr11 = new Object[1];
                                        d(new int[]{1670843784, 1766891128, -1196109710, 1595037932, 855489057, 1239866403, 1264886437, -1146705887, 458363990, 1907200902, 82116552, 912897206, -499138821, -484190100}, ExpandableListView.getPackedPositionChild(0L) + 25, objArr11);
                                        Class<?> cls7 = Class.forName((String) objArr11[0]);
                                        Object[] objArr12 = new Object[1];
                                        d(new int[]{821898800, 1963582256, 2091532114, -1618532469, 205175731, 1013359209, 236976715, 1488386033, 936978050, 1839179205}, 12 - TextUtils.lastIndexOf("", '0', 0), objArr12);
                                        if (cls6.equals(cls7.getMethod((String) objArr12[0], null).invoke(method2, null))) {
                                            int i14 = TuitionPaymentFragmentbindingInflater1 + 111;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                                            int i15 = i14 % 2;
                                            Object[] objArr13 = new Object[1];
                                            d(new int[]{1670843784, 1766891128, -1196109710, 1595037932, 855489057, 1239866403, 1264886437, -1146705887, 458363990, 1907200902, 82116552, 912897206, -499138821, -484190100}, 24 - TextUtils.getOffsetBefore("", 0), objArr13);
                                            Class<?> cls8 = Class.forName((String) objArr13[0]);
                                            Object[] objArr14 = new Object[1];
                                            d(new int[]{-592038009, -1693563111, 465516649, 1573926162, 94345489, 2117047756, 80655851, -1284988524, -1798771975, 1507624350, 189120471, -1778963260}, (ViewConfiguration.getPressedStateDuration() >> 16) + 17, objArr14);
                                            Object[] objArr15 = (Object[]) cls8.getMethod((String) objArr14[0], null).invoke(method2, null);
                                            if (objArr15.length == 2 && Long.TYPE.equals(objArr15[0])) {
                                                Object[] objArr16 = new Object[1];
                                                d(new int[]{1670843784, 1766891128, -1196109710, 1595037932, 855489057, 1239866403, 1264886437, -1146705887, 458363990, 1907200902, 82116552, 912897206, -499138821, -484190100}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, objArr16);
                                                if (Class.forName((String) objArr16[0]).equals(objArr15[1])) {
                                                    int i16 = TuitionPaymentFragmentbindingInflater1 + 115;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                                                    if (i16 % 2 == 0) {
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                            int i17 = 2823 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 22;
                                                            byte[] bArr2 = $$d;
                                                            byte b7 = bArr2[54];
                                                            byte b8 = bArr2[7];
                                                            Object[] objArr17 = new Object[1];
                                                            c(b7, b8, b8, objArr17);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i17, scrollBarSize, 1814927978, false, (String) objArr17[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                                            int mode = View.MeasureSpec.getMode(0) + 2823;
                                                            int iRed = Color.red(0) + 22;
                                                            byte[] bArr3 = $$d;
                                                            byte b9 = bArr3[54];
                                                            byte b10 = bArr3[7];
                                                            Object[] objArr18 = new Object[1];
                                                            c(b9, b10, b10, objArr18);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, mode, iRed, 1814927978, false, (String) objArr18[0], null);
                                                        }
                                                        try {
                                                            Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                                                int iIndexOf = 2823 - TextUtils.indexOf("", "", 0, 0);
                                                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                                                                byte[] bArr4 = $$d;
                                                                byte b11 = bArr4[7];
                                                                byte b12 = (byte) (-bArr4[5]);
                                                                Object[] objArr20 = new Object[1];
                                                                c(b11, b12, b12, objArr20);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, iIndexOf, pressedStateDuration, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                            }
                                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr19)).longValue();
                                                            break;
                                                        } catch (Throwable th2) {
                                                            Throwable cause2 = th2.getCause();
                                                            if (cause2 == null) {
                                                                throw th2;
                                                            }
                                                            throw cause2;
                                                        }
                                                    }
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2823;
                                                        int scrollBarSize2 = 22 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                        byte[] bArr5 = $$d;
                                                        byte b13 = bArr5[54];
                                                        byte b14 = bArr5[7];
                                                        Object[] objArr21 = new Object[1];
                                                        c(b13, b14, b14, objArr21);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iMakeMeasureSpec, scrollBarSize2, 1814927978, false, (String) objArr21[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method2);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 2823;
                                                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                                                        byte[] bArr6 = $$d;
                                                        byte b15 = bArr6[54];
                                                        byte b16 = bArr6[7];
                                                        Object[] objArr22 = new Object[1];
                                                        c(b15, b16, b16, objArr22);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, iMakeMeasureSpec2, iIndexOf2, 1814927978, false, (String) objArr22[0], null);
                                                    }
                                                    try {
                                                        Object[] objArr23 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                                                            int i18 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2823;
                                                            int longPressTimeout2 = 22 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                            byte[] bArr7 = $$d;
                                                            byte b17 = bArr7[7];
                                                            byte b18 = (byte) (-bArr7[5]);
                                                            Object[] objArr24 = new Object[1];
                                                            c(b17, b18, b18, objArr24);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAxisFromString, i18, longPressTimeout2, -2137287382, false, (String) objArr24[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
                                                        break;
                                                    } catch (Throwable th3) {
                                                        Throwable cause3 = th3.getCause();
                                                        if (cause3 == null) {
                                                            throw th3;
                                                        }
                                                        throw cause3;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10++;
                                    declaredMethods = declaredMethods;
                                    length = i13;
                                    i6 = 54;
                                    packageName = packageName;
                                }
                            }
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                int i19 = 2824 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int mirror = AndroidCharacter.getMirror('0') - 26;
                                byte[] bArr8 = $$d;
                                byte b19 = bArr8[54];
                                byte b20 = bArr8[7];
                                Object[] objArr25 = new Object[1];
                                c(b19, b20, b20, objArr25);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i19, mirror, 1814927978, false, (String) objArr25[0], null);
                                r9 = mirror;
                            }
                            try {
                                try {
                                    Object[] objArr26 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                                    packageName = packageName;
                                    r9 = r9;
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                        char cAlpha = (char) Color.alpha(0);
                                        int iRed2 = 2823 - Color.red(0);
                                        int iBlue = 22 - Color.blue(0);
                                        byte[] bArr9 = $$d;
                                        byte b21 = (byte) (bArr9[51] - 1);
                                        byte b22 = (byte) (-bArr9[5]);
                                        Object[] objArr27 = new Object[1];
                                        c(b21, b22, b22, objArr27);
                                        char c3 = cAlpha;
                                        Class[] clsArr2 = {Object.class};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, iRed2, iBlue, 1025296417, false, (String) objArr27[0], clsArr2);
                                        packageName = c3;
                                        r9 = clsArr2;
                                    }
                                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr26);
                                    try {
                                        Object[] objArr28 = {0, methodArr, null};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                                        packageName = packageName;
                                        r9 = r9;
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                            char windowTouchSlop = (char) (37657 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2720;
                                            int maximumDrawingCacheSize = 19 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            byte[] bArr10 = $$d;
                                            byte b23 = (byte) (bArr10[51] - 1);
                                            byte b24 = (byte) (-bArr10[5]);
                                            Object[] objArr29 = new Object[1];
                                            c(b23, b24, b24, objArr29);
                                            String str7 = (String) objArr29[0];
                                            char c4 = windowTouchSlop;
                                            Class[] clsArr3 = {Integer.TYPE, Method[].class, List.class};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c4, iResolveSizeAndState, maximumDrawingCacheSize, -1568796068, false, str7, clsArr3);
                                            packageName = c4;
                                            r9 = clsArr3;
                                        }
                                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr28)).longValue();
                                        long j = -162338450;
                                        packageName = packageName;
                                        long j2 = (((long) (-520)) * j) + (((long) 522) * jLongValue);
                                        long j3 = 521;
                                        long j4 = -1;
                                        long j5 = j ^ j4;
                                        long jIdentityHashCode = System.identityHashCode(this);
                                        r9 = "";
                                        long j6 = ((jLongValue ^ j4) | j) ^ j4;
                                        long j7 = j2 + ((((j5 | jLongValue) | jIdentityHashCode) ^ j4) * j3) + (((long) (-1042)) * j6) + (j3 * ((j4 ^ (jLongValue | (j5 | (jIdentityHashCode ^ j4)))) | j6)) + ((long) (-1648067395));
                                        int i20 = (int) (j7 >> 32);
                                        try {
                                            int i21 = ~(((int) SystemClock.uptimeMillis()) | (-598773982));
                                            int i22 = i20 & (((((-2080044766) | i21) * (-196)) - 795919438) + ((i21 | 1481270784) * 196));
                                            int i23 = (int) j7;
                                            int i24 = ~((int) Runtime.getRuntime().totalMemory());
                                            int i25 = i22 | (i23 & (1603376277 + (((~(i24 | 1574250920)) | (-1574283694)) * (-160)) + (((~(i24 | (-1283489966))) | 1574250920) * 160)));
                                            int i26 = i25 >>> 24;
                                            int i27 = i25 & ViewCompat.MEASURED_SIZE_MASK;
                                            boolean z = i26 != 0;
                                            if (!z) {
                                                i2 = 2;
                                                i3 = 0;
                                            } else {
                                                int i28 = TuitionPaymentFragmentbindingInflater1 + 1;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i28 % 128;
                                                i2 = 2;
                                                int i29 = i28 % 2;
                                                i3 = 1;
                                            }
                                            if (z) {
                                                int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                                                int i31 = i30 % 128;
                                                TuitionPaymentFragmentbindingInflater1 = i31;
                                                if (i30 % i2 != 0) {
                                                    int i32 = 7 / 0;
                                                    if (i27 < i2) {
                                                        method = methodArr[i27];
                                                        if (method != null) {
                                                            i4 = i31 + 103;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                                                            if (i4 % i2 == 0) {
                                                                string = method.toString();
                                                                int i33 = 92 / 0;
                                                            } else {
                                                                string = method.toString();
                                                            }
                                                        }
                                                    }
                                                } else if (i27 < i2) {
                                                    method = methodArr[i27];
                                                    if (method != null) {
                                                        i4 = i31 + 103;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                                                        if (i4 % i2 == 0) {
                                                            string = method.toString();
                                                            int i34 = 92 / 0;
                                                        } else {
                                                            string = method.toString();
                                                        }
                                                    }
                                                }
                                                string = null;
                                            } else {
                                                string = null;
                                            }
                                            arrayList.add(string);
                                            if ((i26 + 6) * i3 != 0) {
                                                throw new RuntimeException(String.valueOf(iIntValue2));
                                            }
                                            ?? r10 = packageManager;
                                            PackageInfo packageInfo = r10.getPackageInfo(zzicVar4.zzaY().getPackageName(), 0);
                                            if (packageInfo != null) {
                                                CharSequence applicationLabel = r10.getApplicationLabel(packageInfo.applicationInfo);
                                                if (TextUtils.isEmpty(applicationLabel)) {
                                                    int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                                                    TuitionPaymentFragmentbindingInflater1 = i35 % 128;
                                                    int i36 = i35 % 2;
                                                    string2 = "Unknown";
                                                } else {
                                                    string2 = applicationLabel.toString();
                                                }
                                                try {
                                                    str5 = packageInfo.versionName;
                                                    try {
                                                        i = packageInfo.versionCode;
                                                        str3 = str5;
                                                        installerPackageName = str2;
                                                        r4 = packageName;
                                                        str4 = string2;
                                                        r6 = r10;
                                                        r29 = r9;
                                                    } catch (PackageManager.NameNotFoundException unused2) {
                                                        str3 = str5;
                                                        str4 = string2;
                                                        r1 = r10;
                                                        r21 = packageName;
                                                        r27 = r9;
                                                        this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(r21), str4);
                                                        installerPackageName = str2;
                                                        r3 = r21;
                                                        i = Integer.MIN_VALUE;
                                                        r2 = r1;
                                                        r28 = r27;
                                                    }
                                                } catch (PackageManager.NameNotFoundException unused3) {
                                                    str5 = str;
                                                }
                                            } else {
                                                installerPackageName = str2;
                                                r8 = r10;
                                                r22 = packageName;
                                                r210 = r9;
                                            }
                                            this = this;
                                            r2 = r6;
                                            r3 = r4;
                                            r28 = r29;
                                            this.zza = r3;
                                            this.zzd = installerPackageName;
                                            this.zzb = str3;
                                            this.zzc = i;
                                            this.zze = str4;
                                            this.zzf = ((long) 568) - 568;
                                            zzic zzicVar5 = this.zzu;
                                            iZzC = zzicVar5.zzC();
                                            if (iZzC == 0) {
                                                this.zzu.zzaV().zzk().zza("App measurement collection enabled");
                                            } else if (iZzC == 1) {
                                                this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
                                            } else if (iZzC == 3) {
                                                this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                            } else if (iZzC == 4) {
                                                this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                                            } else if (iZzC == 6) {
                                                this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                            } else if (iZzC != 7) {
                                                int i37 = TuitionPaymentFragmentbindingInflater1 + 79;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i37 % 128;
                                                int i38 = i37 % 2;
                                                if (iZzC != 8) {
                                                    zzic zzicVar6 = this.zzu;
                                                    zzicVar6.zzaV().zzi().zza("App measurement disabled");
                                                    zzicVar6.zzaV().zzc().zza("Invalid scion state in identity");
                                                } else {
                                                    this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                                                }
                                            } else {
                                                this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                                            }
                                            r5 = r28;
                                            this.zzl = r5;
                                            zzicVar = this.zzu;
                                            zzicVar.zzaU();
                                            strZza = zzlt.zza(zzicVar.zzaY(), "google_app_id", zzicVar5.zzq());
                                            if (TextUtils.isEmpty(strZza)) {
                                                int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                                                TuitionPaymentFragmentbindingInflater1 = i39 % 128;
                                                int i40 = i39 % 2;
                                                r7 = r5;
                                            } else {
                                                r7 = strZza;
                                            }
                                            this.zzl = r7;
                                            if (iZzC == 0) {
                                                zzicVar.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
                                            }
                                            this.zzi = null;
                                            zzicVar2 = this.zzu;
                                            zzicVar2.zzaU();
                                            listZzs = zzicVar2.zzc().zzs("analytics.safelisted_events");
                                            if (listZzs == null) {
                                                this.zzi = listZzs;
                                                break;
                                            } else if (listZzs.isEmpty()) {
                                                zzicVar2.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                                            } else {
                                                it = listZzs.iterator();
                                                do {
                                                    if (!it.hasNext()) {
                                                        this.zzi = listZzs;
                                                        break;
                                                    }
                                                } while (zzicVar2.zzk().zzk("safelisted event", (String) it.next()));
                                            }
                                            if (r2 != 0) {
                                                this.zzk = InstantApps.isInstantApp(zzicVar2.zzaY()) ? 1 : 0;
                                            } else {
                                                this.zzk = 0;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            packageManager = packageManager;
                                            str3 = "Unknown";
                                            str4 = str;
                                            r1 = packageManager;
                                            r21 = packageName;
                                            r27 = r9;
                                        }
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 == null) {
                                            throw th4;
                                        }
                                        throw cause4;
                                    }
                                } catch (Throwable th5) {
                                    Throwable cause5 = th5.getCause();
                                    if (cause5 == null) {
                                        throw th5;
                                    }
                                    throw cause5;
                                }
                            } catch (PackageManager.NameNotFoundException unused5) {
                            }
                        } catch (PackageManager.NameNotFoundException unused6) {
                            packageName = packageName;
                            packageManager = packageManager;
                            r9 = "";
                            str3 = "Unknown";
                            str4 = str;
                            r1 = packageManager;
                            r21 = packageName;
                            r27 = r9;
                            this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(r21), str4);
                            installerPackageName = str2;
                            r3 = r21;
                            i = Integer.MIN_VALUE;
                            r2 = r1;
                            r28 = r27;
                            this.zza = r3;
                            this.zzd = installerPackageName;
                            this.zzb = str3;
                            this.zzc = i;
                            this.zze = str4;
                            this.zzf = ((long) 568) - 568;
                            zzic zzicVar7 = this.zzu;
                            iZzC = zzicVar7.zzC();
                            if (iZzC == 0) {
                                this.zzu.zzaV().zzk().zza("App measurement collection enabled");
                            } else if (iZzC == 1) {
                                this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
                            } else if (iZzC == 3) {
                                this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                            } else if (iZzC == 4) {
                                this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                            } else if (iZzC == 6) {
                                this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                            } else if (iZzC != 7) {
                                int i310 = TuitionPaymentFragmentbindingInflater1 + 79;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i310 % 128;
                                int i311 = i310 % 2;
                                if (iZzC != 8) {
                                    zzic zzicVar8 = this.zzu;
                                    zzicVar8.zzaV().zzi().zza("App measurement disabled");
                                    zzicVar8.zzaV().zzc().zza("Invalid scion state in identity");
                                } else {
                                    this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                                }
                            } else {
                                this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                            }
                            r5 = r28;
                            this.zzl = r5;
                            zzicVar = this.zzu;
                            zzicVar.zzaU();
                            strZza = zzlt.zza(zzicVar.zzaY(), "google_app_id", zzicVar7.zzq());
                            if (TextUtils.isEmpty(strZza)) {
                                int i312 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                                TuitionPaymentFragmentbindingInflater1 = i312 % 128;
                                int i41 = i312 % 2;
                                r7 = r5;
                            } else {
                                r7 = strZza;
                            }
                            this.zzl = r7;
                            if (iZzC == 0) {
                                zzicVar.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
                            }
                            this.zzi = null;
                            zzicVar2 = this.zzu;
                            zzicVar2.zzaU();
                            listZzs = zzicVar2.zzc().zzs("analytics.safelisted_events");
                            if (listZzs == null) {
                                this.zzi = listZzs;
                                break;
                            } else if (listZzs.isEmpty()) {
                                zzicVar2.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                            } else {
                                it = listZzs.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        this.zzi = listZzs;
                                        break;
                                    }
                                } while (zzicVar2.zzk().zzk("safelisted event", (String) it.next()));
                            }
                            if (r2 != 0) {
                                this.zzk = InstantApps.isInstantApp(zzicVar2.zzaY()) ? 1 : 0;
                            } else {
                                this.zzk = 0;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused7) {
                        str2 = installerPackageName;
                        str3 = "Unknown";
                        str4 = str;
                        r1 = packageManager;
                        r21 = packageName;
                        r27 = r9;
                        this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(r21), str4);
                        installerPackageName = str2;
                        r3 = r21;
                        i = Integer.MIN_VALUE;
                        r2 = r1;
                        r28 = r27;
                        this.zza = r3;
                        this.zzd = installerPackageName;
                        this.zzb = str3;
                        this.zzc = i;
                        this.zze = str4;
                        this.zzf = ((long) 568) - 568;
                        zzic zzicVar9 = this.zzu;
                        iZzC = zzicVar9.zzC();
                        if (iZzC == 0) {
                            this.zzu.zzaV().zzk().zza("App measurement collection enabled");
                        } else if (iZzC == 1) {
                            this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
                        } else if (iZzC == 3) {
                            this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iZzC == 4) {
                            this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                        } else if (iZzC == 6) {
                            this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iZzC != 7) {
                            int i313 = TuitionPaymentFragmentbindingInflater1 + 79;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i313 % 128;
                            int i314 = i313 % 2;
                            if (iZzC != 8) {
                                zzic zzicVar10 = this.zzu;
                                zzicVar10.zzaV().zzi().zza("App measurement disabled");
                                zzicVar10.zzaV().zzc().zza("Invalid scion state in identity");
                            } else {
                                this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                            }
                        } else {
                            this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                        }
                        r5 = r28;
                        this.zzl = r5;
                        zzicVar = this.zzu;
                        zzicVar.zzaU();
                        strZza = zzlt.zza(zzicVar.zzaY(), "google_app_id", zzicVar9.zzq());
                        if (TextUtils.isEmpty(strZza)) {
                            int i315 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                            TuitionPaymentFragmentbindingInflater1 = i315 % 128;
                            int i42 = i315 % 2;
                            r7 = r5;
                        } else {
                            r7 = strZza;
                        }
                        this.zzl = r7;
                        if (iZzC == 0) {
                            zzicVar.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
                        }
                        this.zzi = null;
                        zzicVar2 = this.zzu;
                        zzicVar2.zzaU();
                        listZzs = zzicVar2.zzc().zzs("analytics.safelisted_events");
                        if (listZzs == null) {
                            this.zzi = listZzs;
                            break;
                        } else if (listZzs.isEmpty()) {
                            zzicVar2.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                        } else {
                            it = listZzs.iterator();
                            do {
                                if (!it.hasNext()) {
                                    this.zzi = listZzs;
                                    break;
                                }
                            } while (zzicVar2.zzk().zzk("safelisted event", (String) it.next()));
                        }
                        if (r2 != 0) {
                            this.zzk = InstantApps.isInstantApp(zzicVar2.zzaY()) ? 1 : 0;
                        } else {
                            this.zzk = 0;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused8) {
                    str = "Unknown";
                }
                this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(r21), str4);
                installerPackageName = str2;
                r3 = r21;
                i = Integer.MIN_VALUE;
                r2 = r1;
                r28 = r27;
                this.zza = r3;
                this.zzd = installerPackageName;
                this.zzb = str3;
                this.zzc = i;
                this.zze = str4;
                this.zzf = ((long) 568) - 568;
                zzic zzicVar11 = this.zzu;
                iZzC = zzicVar11.zzC();
                if (iZzC == 0) {
                    this.zzu.zzaV().zzk().zza("App measurement collection enabled");
                } else if (iZzC == 1) {
                    this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
                } else if (iZzC == 3) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iZzC == 4) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                } else if (iZzC == 6) {
                    this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iZzC != 7) {
                    int i316 = TuitionPaymentFragmentbindingInflater1 + 79;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i316 % 128;
                    int i317 = i316 % 2;
                    if (iZzC != 8) {
                        zzic zzicVar12 = this.zzu;
                        zzicVar12.zzaV().zzi().zza("App measurement disabled");
                        zzicVar12.zzaV().zzc().zza("Invalid scion state in identity");
                    } else {
                        this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                    }
                } else {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                }
                r5 = r28;
                this.zzl = r5;
                zzicVar = this.zzu;
                zzicVar.zzaU();
                strZza = zzlt.zza(zzicVar.zzaY(), "google_app_id", zzicVar11.zzq());
                if (TextUtils.isEmpty(strZza)) {
                    int i318 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                    TuitionPaymentFragmentbindingInflater1 = i318 % 128;
                    int i43 = i318 % 2;
                    r7 = r5;
                } else {
                    r7 = strZza;
                }
                this.zzl = r7;
                if (iZzC == 0) {
                    zzicVar.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
                }
                this.zzi = null;
                zzicVar2 = this.zzu;
                zzicVar2.zzaU();
                listZzs = zzicVar2.zzc().zzs("analytics.safelisted_events");
                if (listZzs == null) {
                    this.zzi = listZzs;
                    break;
                } else if (listZzs.isEmpty()) {
                    zzicVar2.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                } else {
                    it = listZzs.iterator();
                    do {
                        if (!it.hasNext()) {
                            this.zzi = listZzs;
                            break;
                        }
                    } while (zzicVar2.zzk().zzk("safelisted event", (String) it.next()));
                }
                if (r2 != 0) {
                    this.zzk = InstantApps.isInstantApp(zzicVar2.zzaY()) ? 1 : 0;
                } else {
                    this.zzk = 0;
                }
            }
            zzicVar3.zzaV().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzgu.zzl(packageName));
            r22 = packageName;
            r8 = packageManager;
            r210 = "";
            str = "Unknown";
            strZza = zzlt.zza(zzicVar.zzaY(), "google_app_id", zzicVar11.zzq());
            if (TextUtils.isEmpty(strZza)) {
                int i319 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                TuitionPaymentFragmentbindingInflater1 = i319 % 128;
                int i44 = i319 % 2;
                r7 = r5;
            } else {
                r7 = strZza;
            }
            this.zzl = r7;
            if (iZzC == 0) {
                zzicVar.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
            }
        } catch (IllegalStateException e2) {
            this.zzu.zzaV().zzb().zzc("Fetching Google App Id failed with exception. appId", zzgu.zzl(r3), e2);
        }
        str4 = "Unknown";
        str3 = str;
        r4 = r22;
        i = Integer.MIN_VALUE;
        r6 = r8;
        r29 = r210;
        this = this;
        r2 = r6;
        r3 = r4;
        r28 = r29;
        this.zza = r3;
        this.zzd = installerPackageName;
        this.zzb = str3;
        this.zzc = i;
        this.zze = str4;
        this.zzf = ((long) 568) - 568;
        zzic zzicVar13 = this.zzu;
        iZzC = zzicVar13.zzC();
        if (iZzC == 0) {
            this.zzu.zzaV().zzk().zza("App measurement collection enabled");
        } else if (iZzC == 1) {
            this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
        } else if (iZzC == 3) {
            this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iZzC == 4) {
            this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
        } else if (iZzC == 6) {
            this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iZzC != 7) {
            int i3110 = TuitionPaymentFragmentbindingInflater1 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3110 % 128;
            int i3111 = i3110 % 2;
            if (iZzC != 8) {
                zzic zzicVar14 = this.zzu;
                zzicVar14.zzaV().zzi().zza("App measurement disabled");
                zzicVar14.zzaV().zzc().zza("Invalid scion state in identity");
            } else {
                this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
            }
        } else {
            this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
        }
        r5 = r28;
        this.zzl = r5;
        zzicVar = this.zzu;
        zzicVar.zzaU();
        this.zzi = null;
        zzicVar2 = this.zzu;
        zzicVar2.zzaU();
        listZzs = zzicVar2.zzc().zzs("analytics.safelisted_events");
        if (listZzs == null) {
            this.zzi = listZzs;
            break;
        } else if (listZzs.isEmpty()) {
            zzicVar2.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
        } else {
            it = listZzs.iterator();
            do {
                if (!it.hasNext()) {
                    this.zzi = listZzs;
                    break;
                }
            } while (zzicVar2.zzk().zzk("safelisted event", (String) it.next()));
        }
        if (r2 != 0) {
            this.zzk = InstantApps.isInstantApp(zzicVar2.zzaY()) ? 1 : 0;
        } else {
            this.zzk = 0;
        }
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = b;
        char c = '0';
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $11;
            int i7 = i6 + 27;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = i6 + 123;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr2[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf("", c)), 3291 - Gravity.getAbsoluteGravity(i5, i5), (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, 1948206109, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i11++;
                    c = '0';
                    i3 = -1870535734;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i12 = $10 + 3;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                int i15 = $10 + 105;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr5[i14]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), ImageFormat.getBitsPerPixel(0) + 3292, ((Process.getThreadPriority(0) + 20) >> 6) + 31, 1948206109, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i14] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i14++;
                iArr5 = iArr5;
                i4 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i17 = 17;
            for (int i18 = 1; i17 > i18; i18 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i17];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2560 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 29, 683220507, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i17--;
            }
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 28880), 348 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00da  */
    final zzr zzh(String str) {
        long j;
        String str2;
        long j2;
        boolean z;
        String str3;
        int i;
        String str4;
        String str5;
        int i2;
        int i3;
        long j3;
        long jZzV;
        long jZzP;
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        zzg();
        String strZzj = zzj();
        String strZzk = zzk();
        zzb();
        String str6 = this.zzb;
        zzb();
        long j4 = this.zzc;
        zzb();
        Preconditions.checkNotNull(this.zzd);
        String str7 = this.zzd;
        zzic zzicVar = this.zzu;
        zzicVar.zzc().zzi();
        zzb();
        zzg();
        long j5 = this.zzf;
        if (j5 == 0) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            zzpp zzppVarZzk = this.zzu.zzk();
            Context contextZzaY = zzicVar.zzaY();
            String packageName = zzicVar.zzaY().getPackageName();
            zzppVarZzk.zzg();
            Preconditions.checkNotNull(contextZzaY);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzaY.getPackageManager();
            MessageDigest messageDigestZzO = zzpp.zzO();
            if (messageDigestZzO == null) {
                zzppVarZzk.zzu.zzaV().zzb().zza("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (zzppVarZzk.zzad(contextZzaY, packageName)) {
                            jZzP = 0;
                        } else {
                            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(contextZzaY);
                            zzic zzicVar2 = zzppVarZzk.zzu;
                            PackageInfo packageInfo = packageManagerWrapperPackageManager.getPackageInfo(zzicVar2.zzaY().getPackageName(), 64);
                            if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                                zzicVar2.zzaV().zze().zza("Could not get signatures");
                            } else {
                                jZzP = zzpp.zzP(messageDigestZzO.digest(packageInfo.signatures[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        zzppVarZzk.zzu.zzaV().zzb().zzb("Package name not found", e2);
                    }
                } else {
                    jZzP = 0;
                }
                this.zzf = jZzP;
                j = jZzP;
            }
            jZzP = -1;
            this.zzf = jZzP;
            j = jZzP;
        } else {
            j = j5;
        }
        zzic zzicVar3 = this.zzu;
        zzic zzicVar4 = this.zzu;
        boolean zZzB = zzicVar3.zzB();
        boolean z2 = zzicVar4.zzd().zzm;
        zzg();
        if (zzicVar3.zzB()) {
            zzrn.zza();
            if (zzicVar4.zzc().zzp(null, zzfy.zzaH)) {
                this.zzu.zzaV().zzk().zza("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = zzicVar4.zzaY().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzu.zzaY());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                } catch (Exception unused) {
                                    this.zzu.zzaV().zzh().zza("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.zzu.zzaV().zzf().zza("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzic zzicVar5 = this.zzu;
        long jZza = zzicVar5.zzd().zzc.zza();
        long jMin = jZza == 0 ? zzicVar5.zza : Math.min(zzicVar5.zza, jZza);
        zzb();
        int i9 = this.zzk;
        zzic zzicVar6 = this.zzu;
        boolean zZzu = zzicVar6.zzc().zzu();
        zzhh zzhhVarZzd = zzicVar6.zzd();
        zzhhVarZzd.zzg();
        boolean z3 = zzhhVarZzd.zzd().getBoolean("deferred_analytics_collection", false);
        boolean z4 = zzicVar6.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED;
        long j6 = this.zzg;
        List list = this.zzi;
        String strZzl = zzicVar6.zzd().zzl().zzl();
        if (this.zzj == null) {
            this.zzj = zzicVar6.zzk().zzaw();
        }
        String str8 = this.zzj;
        if (zzicVar6.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            zzg();
            j2 = 0;
            if (this.zzn == 0) {
                str4 = str2;
                i = i9;
                z = z2;
                str3 = str8;
            } else {
                long jCurrentTimeMillis = zzicVar6.zzaZ().currentTimeMillis();
                z = z2;
                str3 = str8;
                long j7 = this.zzn;
                i = i9;
                if (this.zzm != null) {
                    int i10 = TuitionPaymentFragmentbindingInflater1 + 41;
                    str4 = str2;
                    int i11 = i10 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11;
                    int i12 = i10 % 2;
                    if (jCurrentTimeMillis - j7 > CalendarModelKt.MillisecondsIn24Hours) {
                        int i13 = i11 + 63;
                        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                        if (i13 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (this.zzo == null) {
                            zzi();
                        }
                    }
                } else {
                    str4 = str2;
                }
            }
            if (this.zzm == null) {
                zzi();
            }
            str5 = this.zzm;
        } else {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
            int i15 = i14 % 2;
            str4 = str2;
            i = i9;
            str3 = str8;
            z = z2;
            str5 = null;
            j2 = 0;
        }
        boolean zZzx = zzicVar6.zzc().zzx();
        zzpp zzppVarZzk2 = zzicVar6.zzk();
        String strZzj2 = zzj();
        zzic zzicVar7 = zzppVarZzk2.zzu;
        if (zzicVar7.zzaY().getPackageManager() == null) {
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentbindingInflater1 = i16 % 128;
            j3 = i16 % 2 != 0 ? 1L : j2;
            i2 = 0;
        } else {
            try {
                i2 = 0;
                try {
                    ApplicationInfo applicationInfo = Wrappers.packageManager(zzicVar7.zzaY()).getApplicationInfo(strZzj2, 0);
                    i3 = applicationInfo != null ? applicationInfo.targetSdkVersion : i2;
                } catch (PackageManager.NameNotFoundException unused4) {
                    zzic zzicVar8 = zzppVarZzk2.zzu;
                    zzicVar8.zzaU();
                    zzicVar8.zzaV().zzi().zzb("PackageManager failed to find running app: app_id", strZzj2);
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                i2 = 0;
            }
            j3 = i3;
        }
        zzic zzicVar9 = this.zzu;
        int iZzb = zzicVar9.zzd().zzl().zzb();
        String strZze = zzicVar9.zzd().zzj().zze();
        zzqp.zza();
        zzal zzalVarZzc = zzicVar9.zzc();
        zzfx zzfxVar = zzfy.zzaQ;
        int iZzU = zzalVarZzc.zzp(null, zzfxVar) ? zzicVar9.zzk().zzU() : i2;
        zzqp.zza();
        if (zzicVar9.zzc().zzp(null, zzfxVar)) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            TuitionPaymentFragmentbindingInflater1 = i17 % 128;
            if (i17 % 2 != 0) {
                zzicVar9.zzk().zzV();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            jZzV = zzicVar9.zzk().zzV();
        } else {
            jZzV = j2;
        }
        return new zzr(strZzj, strZzk, str6, j4, str7, 133005L, j, str, zZzB, !z, str4, jMin, i, zZzu, z3, Boolean.valueOf(z4), j6, list, strZzl, str3, str5, zZzx, j3, iZzb, strZze, iZzU, jZzV, zzicVar9.zzc().zzz(), new zze(zzicVar9.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        return i2 % 2 != 0;
    }

    final long zzn() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.zzh;
        int i5 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    final List zzp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        List list = this.zzi;
        int i5 = i3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return list;
    }

    private static String $$g(byte b2, byte b3, int i) {
        int i2 = 122 - (b2 * 56);
        int i3 = i + 4;
        byte[] bArr = $$c;
        int i4 = b3 * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = (-i2) + i4;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i2 = (-bArr[i7]) + i2;
            i3 = i7;
            i5 = i6;
        }
    }
}
