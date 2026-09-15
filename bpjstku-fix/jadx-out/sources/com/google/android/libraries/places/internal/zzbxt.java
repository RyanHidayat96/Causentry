package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import defpackage.registerCamera;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxt implements zzbmg, zzbwy, zzbyf {
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;
    static final boolean zza;
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze;
    private static final Logger zzf;
    private int zzA;
    private zzbxr zzB;
    private zzbez zzC;
    private zzbjv zzD;
    private boolean zzE;
    private zzbpj zzF;
    private boolean zzG;
    private boolean zzH;
    private final SocketFactory zzI;
    private SSLSocketFactory zzJ;
    private HostnameVerifier zzK;
    private Socket zzL;
    private int zzM;
    private final Deque zzN;
    private final zzbyl zzO;
    private zzbqk zzP;
    private final Runnable zzQ;
    private final int zzR;
    private final zzbwp zzS;
    private final Map zzT;
    private final zzbpk zzU;
    final zzbgt zzb;
    int zzc;
    private Socket zzg;
    private SSLSession zzh;
    private final InetSocketAddress zzi;
    private final String zzj;
    private final String zzk;
    private final Random zzl;
    private final CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 zzm;
    private final int zzn;
    private final zzbzp zzo;
    private zzbsi zzp;
    private zzbwz zzq;
    private zzbyh zzr;
    private final Object zzs;
    private final zzbhf zzt;
    private int zzu;
    private final Map zzv;
    private final Executor zzw;
    private final zzbvw zzx;
    private final ScheduledExecutorService zzy;
    private final int zzz;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$f = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, 65, -9, -121, -43, 5, -13, -5, 27, -37, -22, -11, -8, -4, 6, 25, -58, -3, 34, -48, -7, 12, -17, -1, 14, -32, -1, -24, -8, -4, 6, 42, -4, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, 11, -14, -12, 3, -12, -12, 0, 23, -44, 1, -13, 4, -26, 8, -20, 58};
    private static final int $$e = 71;
    private static final byte[] $$a = {49, 89, 41, 48, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 215;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        EnumMap enumMap = new EnumMap(zzbyz.class);
        enumMap.put(zzbyz.NO_ERROR, zzbjv.zzh.zze("No error: A GRPC status of OK should have been sent"));
        enumMap.put(zzbyz.PROTOCOL_ERROR, zzbjv.zzh.zze("Protocol error"));
        enumMap.put(zzbyz.INTERNAL_ERROR, zzbjv.zzh.zze("Internal error"));
        enumMap.put(zzbyz.FLOW_CONTROL_ERROR, zzbjv.zzh.zze("Flow control error"));
        enumMap.put(zzbyz.STREAM_CLOSED, zzbjv.zzh.zze("Stream closed"));
        enumMap.put(zzbyz.FRAME_TOO_LARGE, zzbjv.zzh.zze("Frame too large"));
        enumMap.put(zzbyz.REFUSED_STREAM, zzbjv.zzi.zze("Refused stream"));
        enumMap.put(zzbyz.CANCEL, zzbjv.zzb.zze("Cancelled"));
        enumMap.put(zzbyz.COMPRESSION_ERROR, zzbjv.zzh.zze("Compression error"));
        enumMap.put(zzbyz.CONNECT_ERROR, zzbjv.zzh.zze("Connect error"));
        enumMap.put(zzbyz.ENHANCE_YOUR_CALM, zzbjv.zzf.zze("Enhance your calm"));
        enumMap.put(zzbyz.INADEQUATE_SECURITY, zzbjv.zze.zze("Inadequate security"));
        zze = Collections.unmodifiableMap(enumMap);
        zzf = Logger.getLogger(zzbxt.class.getName());
        zza = zzbpf.zzj("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        try {
            Class.forName("javax.net.ssl.X509ExtendedTrustManager").getMethod("checkServerTrusted", X509Certificate[].class, String.class, Socket.class);
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            b = i % 128;
            int i2 = i % 2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public zzbxt(zzbxg zzbxgVar, InetSocketAddress inetSocketAddress, String str, String str2, zzbez zzbezVar, zzbgt zzbgtVar, Runnable runnable, zzbff zzbffVar) {
        CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 = zzbpf.zzo;
        zzbzl zzbzlVar = new zzbzl();
        this.zzl = new Random();
        Object obj = new Object();
        this.zzs = obj;
        this.zzv = new HashMap();
        this.zzM = 0;
        this.zzN = new LinkedList();
        this.zzT = new zzbxs(null);
        this.zzU = new zzbxl(this);
        this.zzc = 30000;
        if (inetSocketAddress == null) {
            throw new NullPointerException(PlaceTypes.ADDRESS);
        }
        this.zzi = inetSocketAddress;
        this.zzj = str;
        this.zzz = 4194304;
        this.zzn = 65535;
        Executor executor = zzbxgVar.zza;
        if (executor == null) {
            throw new NullPointerException("executor");
        }
        this.zzw = executor;
        this.zzx = new zzbvw(zzbxgVar.zza);
        ScheduledExecutorService scheduledExecutorService = zzbxgVar.zzb;
        if (scheduledExecutorService == null) {
            throw new NullPointerException("scheduledExecutorService");
        }
        this.zzy = scheduledExecutorService;
        this.zzu = 3;
        this.zzI = SocketFactory.getDefault();
        this.zzJ = zzbxgVar.zzd;
        this.zzK = zzbyp.zza;
        zzbyl zzbylVar = zzbxgVar.zze;
        if (zzbylVar == null) {
            throw new NullPointerException("connectionSpec");
        }
        this.zzO = zzbylVar;
        if (cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 == null) {
            throw new NullPointerException("stopwatchFactory");
        }
        this.zzm = cameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
        this.zzo = zzbzlVar;
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-okhttp/1.75.0-SNAPSHOT");
        this.zzk = sb.toString();
        this.zzb = zzbgtVar;
        if (runnable == null) {
            throw new NullPointerException("tooManyPingsRunnable");
        }
        this.zzQ = runnable;
        this.zzR = Integer.MAX_VALUE;
        this.zzS = zzbxgVar.zzc.zza();
        this.zzt = zzbhf.zza(getClass(), inetSocketAddress.toString());
        zzbex zzbexVarZzb = zzbez.zzb();
        zzbexVarZzb.zza(zzbox.zzb, zzbezVar);
        this.zzC = zzbexVarZzb.zzc();
        synchronized (obj) {
            new zzbxm(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 100 - r6
            int r0 = 11 - r8
            int r7 = r7 * 10
            int r7 = 14 - r7
            byte[] r1 = com.google.android.libraries.places.internal.zzbxt.$$a
            byte[] r0 = new byte[r0]
            int r8 = 10 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + 1
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-5)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbxt.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 8
            int r7 = r7 + 30
            byte[] r0 = com.google.android.libraries.places.internal.zzbxt.$$d
            int r8 = r8 * 29
            int r8 = 33 - r8
            int r9 = r9 * 11
            int r9 = r9 + 73
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r3 = r3 + r9
            int r8 = r8 + 1
            int r9 = r3 + (-7)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbxt.d(int, short, byte, java.lang.Object[]):void");
    }

    private final void zzae(int i, zzbyz zzbyzVar, zzbjv zzbjvVar) {
        synchronized (this.zzs) {
            if (this.zzD == null) {
                this.zzD = zzbjvVar;
                this.zzp.zzd(zzbjvVar);
            }
            if (zzbyzVar != null && !this.zzE) {
                this.zzE = true;
                this.zzq.zzj(0, zzbyzVar, new byte[0]);
            }
            Iterator it = this.zzv.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((zzbxk) entry.getValue()).zzy().zzg(zzbjvVar, zzbls.REFUSED, false, new zzbip());
                    zzag((zzbxk) entry.getValue());
                }
            }
            Deque<zzbxk> deque = this.zzN;
            for (zzbxk zzbxkVar : deque) {
                zzbxkVar.zzy().zzg(zzbjvVar, zzbls.MISCARRIED, true, new zzbip());
                zzag(zzbxkVar);
            }
            deque.clear();
            zzaf();
        }
    }

    private final zzbjv zzai() {
        synchronized (this.zzs) {
            zzbjv zzbjvVar = this.zzD;
            if (zzbjvVar != null) {
                return zzbjvVar;
            }
            return zzbjv.zzi.zze("Connection closed");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final Runnable zzao(zzbsi zzbsiVar) {
        if (zzbsiVar == null) {
            throw new NullPointerException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        this.zzp = zzbsiVar;
        zzbwx zzbwxVarZza = zzbwx.zza(this.zzx, this, 10000);
        zzbwv zzbwvVar = new zzbwv(zzbwxVarZza, this.zzo.zzb(zzcbp.zzd(zzbwxVarZza), true));
        synchronized (this.zzs) {
            zzbwz zzbwzVar = new zzbwz(this, zzbwvVar);
            this.zzq = zzbwzVar;
            this.zzr = new zzbyh(this, zzbwzVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.zzx.execute(new zzbxo(this, countDownLatch, cyclicBarrier, zzbwxVarZza, countDownLatch2));
        this.zzw.execute(new zzbxp(this, cyclicBarrier, countDownLatch2));
        try {
            synchronized (this.zzs) {
                this.zzq.zzd();
                zzbzo zzbzoVar = new zzbzo();
                zzbzoVar.zza(7, 0, this.zzn);
                this.zzq.zzi(zzbzoVar);
            }
            countDownLatch.countDown();
            this.zzx.execute(new zzbxq(this));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblu
    public final /* synthetic */ zzblr zzb(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbfp[] zzbfpVarArr) throws Throwable {
        Object obj;
        if (zzbiuVar == null) {
            throw new NullPointerException(FirebaseAnalytics.Param.METHOD);
        }
        if (zzbipVar == null) {
            throw new NullPointerException("headers");
        }
        zzbwg zzbwgVarZza = zzbwg.zza(zzbfpVarArr, this.zzC, zzbipVar);
        Object obj2 = this.zzs;
        synchronized (obj2) {
            try {
                obj = obj2;
                try {
                    zzbxk zzbxkVar = new zzbxk(zzbiuVar, zzbipVar, this.zzq, this, this.zzr, obj2, this.zzz, this.zzn, this.zzj, this.zzk, zzbwgVarZza, this.zzS, zzbfdVar, false);
                    return zzbxkVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final void zzd(zzbjv zzbjvVar) {
        synchronized (this.zzs) {
            if (this.zzD != null) {
                return;
            }
            this.zzD = zzbjvVar;
            this.zzp.zzd(zzbjvVar);
            zzaf();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final void zze(zzbjv zzbjvVar) {
        zzd(zzbjvVar);
        synchronized (this.zzs) {
            Iterator it = this.zzv.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((zzbxk) entry.getValue()).zzy().zzg(zzbjvVar, zzbls.PROCESSED, false, new zzbip());
                zzag((zzbxk) entry.getValue());
            }
            Deque<zzbxk> deque = this.zzN;
            for (zzbxk zzbxkVar : deque) {
                zzbxkVar.zzy().zzg(zzbjvVar, zzbls.MISCARRIED, true, new zzbip());
                zzag(zzbxkVar);
            }
            deque.clear();
            zzaf();
        }
    }

    static zzbjv zzq(zzbyz zzbyzVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        zzbjv zzbjvVar = (zzbjv) zze.get(zzbyzVar);
        if (zzbjvVar != null) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                return zzbjvVar;
            }
            obj.hashCode();
            throw null;
        }
        zzbjv zzbjvVar2 = zzbjv.zzc;
        int i4 = zzbyzVar.zzs;
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 26);
        sb.append("Unknown http2 error code: ");
        sb.append(i4);
        return zzbjvVar2.zze(sb.toString());
    }

    private final boolean zzac() {
        boolean z;
        Deque deque;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        loop0: while (true) {
            z = false;
            while (true) {
                deque = this.zzN;
                if (deque.isEmpty() || this.zzv.size() >= this.zzM) {
                    break loop0;
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 != 0) {
                    break;
                }
                zzab((zzbxk) deque.poll());
                z = true;
            }
            zzab((zzbxk) deque.poll());
        }
        return z;
    }

    private final void zzah(zzbxk zzbxkVar) {
        int i = 2 % 2;
        if (!this.zzH) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 97;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            this.zzH = true;
            zzbqk zzbqkVar = this.zzP;
            if (zzbqkVar != null) {
                int i5 = i2 + 77;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                if (i5 % 2 != 0) {
                    zzbqkVar.zzb();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                zzbqkVar.zzb();
                int i6 = TuitionPaymentFragmentbindingInflater1 + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (zzbxkVar.zzi()) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            if (i8 % 2 == 0) {
                this.zzU.zza(zzbxkVar, false);
            } else {
                this.zzU.zza(zzbxkVar, true);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwy
    public final void zzg(Throwable th) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (th == null) {
            throw new NullPointerException("failureCause");
        }
        zzae(0, zzbyz.INTERNAL_ERROR, zzbjv.zzi.zzd(th));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static String zzad(zzcbz zzcbzVar) throws IOException {
        int i = 2 % 2;
        zzcbj zzcbjVar = new zzcbj();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 % 5;
        }
        while (zzcbzVar.zza(zzcbjVar, 1L) != -1) {
            if (zzcbjVar.zzk(zzcbjVar.zzb() - 1) == 10) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                return zzcbjVar.zzq(Long.MAX_VALUE);
            }
        }
        throw new EOFException("\\n not found: ".concat(String.valueOf(zzcbjVar.zzn(zzcbjVar.zzb()).zzg())));
    }

    private final void zzag(zzbxk zzbxkVar) {
        int i = 2 % 2;
        if (this.zzH && this.zzN.isEmpty() && this.zzv.isEmpty()) {
            this.zzH = false;
            zzbqk zzbqkVar = this.zzP;
            if (zzbqkVar != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                zzbqkVar.zzc();
            }
        }
        if (zzbxkVar.zzi()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            this.zzU.zza(zzbxkVar, false);
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        String strValueOf = String.valueOf(this.zzt.zzc());
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte) 0);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = strValueOf;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "logId";
        InetSocketAddress inetSocketAddress = this.zzi;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = inetSocketAddress;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = PlaceTypes.ADDRESS;
        String string = tuitionPaymentFragmentbindingInflater1.toString();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private final void zzaf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
            if (this.zzD == null) {
                return;
            }
        } else if (this.zzD == null) {
            return;
        }
        if (this.zzv.isEmpty() && this.zzN.isEmpty() && (!this.zzG)) {
            this.zzG = true;
            zzbqk zzbqkVar = this.zzP;
            if (zzbqkVar != null) {
                zzbqkVar.zzd();
                int i4 = TuitionPaymentFragmentbindingInflater1 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
            }
            zzbpj zzbpjVar = this.zzF;
            if (zzbpjVar != null) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
                zzbpjVar.zzc(zzai());
                this.zzF = null;
            }
            if (!this.zzE) {
                this.zzE = true;
                this.zzq.zzj(0, zzbyz.NO_ERROR, new byte[0]);
            }
            this.zzq.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    private final void zzab(zzbxk zzbxkVar) {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            zzbxkVar.zzy().zzJ();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (zzbxkVar.zzy().zzJ() == -1) {
            z = true;
            int i3 = TuitionPaymentFragmentbindingInflater1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("StreamId already assigned");
        }
        this.zzv.put(Integer.valueOf(this.zzu), zzbxkVar);
        zzah(zzbxkVar);
        zzbxkVar.zzy().zzF(this.zzu);
        if (zzbxkVar.zzz() != zzbis.UNARY) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 68 / 0;
                if (zzbxkVar.zzz() != zzbis.SERVER_STREAMING) {
                    this.zzq.zze();
                } else {
                    zzbxkVar.zzA();
                }
            } else if (zzbxkVar.zzz() != zzbis.SERVER_STREAMING) {
                this.zzq.zze();
            } else {
                zzbxkVar.zzA();
            }
        } else {
            zzbxkVar.zzA();
        }
        int i7 = this.zzu;
        if (i7 < 2147483645) {
            this.zzu = i7 + 2;
        } else {
            this.zzu = Integer.MAX_VALUE;
            zzae(Integer.MAX_VALUE, zzbyz.NO_ERROR, zzbjv.zzi.zze("Stream ids exhausted"));
        }
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 105;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr2[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetAfter("", i5), ExpandableListView.getPackedPositionChild(0L) + 3292, 31 - TextUtils.getOffsetAfter("", i5), 1948206109, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
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
            int i9 = $10 + 79;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (iArr5 != null) {
            int i11 = $10 + 47;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 83;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr5[i13]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.combineMeasuredStates(0, 0), 3291 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 31 - (Process.myTid() >> 22), 1948206109, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i13++;
                iArr5 = iArr5;
                i4 = 1;
            }
            iArr5 = iArr6;
        }
        char c = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            for (int i16 = 17; i16 > 1; i16--) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2559 - View.MeasureSpec.getSize(0), (ViewConfiguration.getEdgeSlop() >> 16) + 29, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 28880), 347 - TextUtils.indexOf((CharSequence) "", '0', 0), KeyEvent.getDeadChar(0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            int i19 = $11 + 63;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 3 / 3;
            }
            c = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbyf
    public final zzbye[] zzm() {
        zzbye[] zzbyeVarArr;
        synchronized (this.zzs) {
            Map map = this.zzv;
            zzbyeVarArr = new zzbye[map.size()];
            Iterator it = map.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                zzbyeVarArr[i] = ((zzbxk) it.next()).zzy().zzK();
                i++;
            }
        }
        return zzbyeVarArr;
    }

    final void zzn(int i, zzbjv zzbjvVar, zzbls zzblsVar, boolean z, zzbyz zzbyzVar, zzbip zzbipVar) {
        synchronized (this.zzs) {
            zzbxk zzbxkVar = (zzbxk) this.zzv.remove(Integer.valueOf(i));
            if (zzbxkVar != null) {
                if (zzbyzVar != null) {
                    this.zzq.zzb(i, zzbyz.CANCEL);
                }
                if (zzbjvVar != null) {
                    zzbxj zzbxjVarZzy = zzbxkVar.zzy();
                    if (zzbipVar == null) {
                        zzbipVar = new zzbip();
                    }
                    zzbxjVarZzy.zzg(zzbjvVar, zzblsVar, z, zzbipVar);
                }
                if (!zzac()) {
                    zzaf();
                }
                zzag(zzbxkVar);
            }
        }
    }

    final boolean zzo(int i) {
        boolean z;
        synchronized (this.zzs) {
            z = false;
            if (i < this.zzu && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    final zzbxk zzp(int i) {
        zzbxk zzbxkVar;
        synchronized (this.zzs) {
            zzbxkVar = (zzbxk) this.zzv.get(Integer.valueOf(i));
        }
        return zzbxkVar;
    }

    final /* synthetic */ void zzt(zzbyz zzbyzVar, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzae(0, zzbyzVar, zzq(zzbyzVar).zzf(str));
        int i4 = TuitionPaymentFragmentbindingInflater1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    final void zzj(zzbxk zzbxkVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzN.remove(zzbxkVar);
        zzag(zzbxkVar);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final String zzk() {
        int i = 2 % 2;
        String host = this.zzj;
        URI uriZzb = zzbpf.zzb(host);
        if (uriZzb.getHost() != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                host = uriZzb.getHost();
                int i3 = 79 / 0;
            } else {
                host = uriZzb.getHost();
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
        return host;
    }

    final int zzl() {
        int i = 2 % 2;
        URI uriZzb = zzbpf.zzb(this.zzj);
        if (uriZzb.getPort() == -1) {
            return this.zzi.getPort();
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            uriZzb.getPort();
            obj.hashCode();
            throw null;
        }
        int port = uriZzb.getPort();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return port;
        }
        obj.hashCode();
        throw null;
    }

    final void zzi(zzbxk zzbxkVar, String str) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        zzbjv zzbjvVarZze;
        zzbjv zzbjvVar;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int keyRepeatTimeout = 876 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i2 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
            byte b2 = (byte) ($$b & 1);
            Object[] objArr3 = new Object[1];
            a(b2, b2, $$a[11], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, keyRepeatTimeout, i2, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{48573904, 78380153, -1741646875, 1024379515, -2076290524, 1448603461, 755883729, -252377123, 1536307970, -1936401017, -194729565, 1047343251, -1875068617, -336066815}, 21 - TextUtils.lastIndexOf("", '0', 0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{-1008713532, -1254143485, -1727790104, 732603431, 19344078, -738578098, 1825779083, 1958498370, 1926974310, 1786205354}, ((Process.getThreadPriority(0) + 20) >> 6) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iMyTid = 876 - (Process.myTid() >> 22);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 10;
            byte[] bArr = $$a;
            byte b3 = bArr[11];
            Object[] objArr6 = new Object[1];
            a(b3, b3, bArr[8], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iMyTid, iIndexOf, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int windowTouchSlop = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int windowTouchSlop2 = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b4 = (byte) ($$b & 1);
                byte b5 = $$a[11];
                Object[] objArr7 = new Object[1];
                a(b4, b5, (byte) (b5 + 3), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, windowTouchSlop, windowTouchSlop2, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = (-340708924) + ((~((~iIdentityHashCode) | (-100794413))) * (-116)) + ((409573201 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 369262972)) | 141104641) * 116) + 1779577982;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            try {
                Object[] objArr9 = {Integer.valueOf(str != null ? str.length() : 0), 1779577982};
                byte[] bArr2 = $$d;
                byte b6 = bArr2[60];
                Object[] objArr10 = new Object[1];
                d(b6, bArr2[43], b6, objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[0]);
                byte b7 = bArr2[43];
                Object[] objArr11 = new Object[1];
                d(b7, bArr2[60], b7, objArr11);
                objArr = (Object[]) cls2.getMethod((String) objArr11[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int touchSlop = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                    byte b8 = (byte) ($$b & 1);
                    byte b9 = $$a[11];
                    Object[] objArr12 = new Object[1];
                    a(b8, b9, (byte) (b9 + 3), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, touchSlop, packedPositionChild, 1324201839, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr13 = new Object[1];
                    c(new int[]{48573904, 78380153, -1741646875, 1024379515, -2076290524, 1448603461, 755883729, -252377123, 1536307970, -1936401017, -194729565, 1047343251, -1875068617, -336066815}, (KeyEvent.getMaxKeyCode() >> 16) + 22, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    c(new int[]{-1008713532, -1254143485, -1727790104, 732603431, 19344078, -738578098, 1825779083, 1958498370, 1926974310, 1786205354}, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                        int iRed = Color.red(0) + 876;
                        int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
                        byte[] bArr3 = $$a;
                        byte b10 = bArr3[11];
                        Object[] objArr15 = new Object[1];
                        a(b10, b10, bArr3[8], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iRed, iResolveOpacity, 254769921, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i6 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 10;
                        byte b11 = (byte) ($$b & 1);
                        Object[] objArr16 = new Object[1];
                        a(b11, b11, $$a[11], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, i6, iIndexOf2, -1199417970, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i7 = ((int[]) objArr[2])[0];
        int i8 = ((int[]) objArr[0])[0];
        if (i8 == i7) {
            int i9 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iNextInt = new Random().nextInt();
            int i10 = i9 + 2013332804 + ((~((~iNextInt) | (-16777617))) * 433) + (((~((-12514339) | iNextInt)) | (-27795891)) * (-433)) + (((~(iNextInt | (-27795891))) | (-29291955)) * 433);
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr2[1])[0] = i12 ^ (i12 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i13 = TuitionPaymentFragmentbindingInflater1 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                int i14 = 2;
                int i15 = i13 % 2;
                int i16 = 0;
                while (i16 < strArr.length) {
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                    TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                    if (i17 % i14 != 0) {
                        arrayList.add(strArr[i16]);
                        i16 += 53;
                    } else {
                        arrayList.add(strArr[i16]);
                        i16++;
                    }
                    i14 = 2;
                }
            }
            int[] iArr = new int[i8];
            int i18 = i8 - 1;
            iArr[i18] = 1;
            Toast.makeText((Context) null, iArr[((i8 * i18) % 2) - 1], 1).show();
            int i19 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = ~iIdentityHashCode2;
            int i21 = i19 + (-263236316) + (((~((-751489776) | i20)) | 791800004) * (-328)) + ((iIdentityHashCode2 | 791800004) * 164) + (((~(iIdentityHashCode2 | 751489775)) | 53553152 | (~(i20 | (-13242924)))) * 164);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[1])[0] = i23 ^ (i23 << 5);
        }
        zzbjv zzbjvVar2 = this.zzD;
        if (zzbjvVar2 != null) {
            zzbxkVar.zzy().zzg(zzbjvVar2, zzbls.MISCARRIED, true, new zzbip());
            return;
        }
        if ((this.zzL instanceof SSLSocket) && !str.equals(this.zzj)) {
            Map map = this.zzT;
            if (map.containsKey(str)) {
                zzbjvVar = (zzbjv) map.get(str);
                int i24 = TuitionPaymentFragmentbindingInflater1 + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
                int i25 = i24 % 2;
            } else {
                zzbjv zzbjvVarZze2 = this.zzK.verify(str, ((SSLSocket) this.zzL).getSession()) ? zzbjv.zza : zzbjv.zzi.zze(String.format("HostNameVerifier verification failed for authority '%s'", str));
                if (!zzbjvVarZze2.zzj() && !zza) {
                    zzf.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport", "verifyAuthority", String.format("HostNameVerifier verification failed for authority '%s'. This will be an error in the future.", str));
                }
                if (zzbjvVarZze2.zzj()) {
                    int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                    TuitionPaymentFragmentbindingInflater1 = i26 % 128;
                    int i27 = i26 % 2;
                    zzbjv zzbjvVar3 = zzbjv.zzi;
                    int i28 = ((int[]) objArr2[1])[0];
                    int i29 = ((i28 * i28) - (~(-(1403819275 * i28)))) - 1;
                    int i30 = -(i28 * 2052645153);
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    int i32 = (i31 ^ 688989668) + ((688989668 & i31) << 1);
                    int i33 = i32 >> 20;
                    int i34 = ((i33 ^ (-8191)) + ((i33 & (-8191)) << 1)) / 4096;
                    int i35 = ((i34 | 1) << 1) - (i34 ^ 1);
                    int i36 = (i32 & i35) + (i35 | i32);
                    int i37 = i32 >> 21;
                    int i38 = -(i36 ^ ((((i37 & (-4095)) + (i37 | (-4095))) / 2048) + 1));
                    int i39 = (i38 & 9) + (i38 | 9);
                    int i40 = i39 >> 20;
                    int i41 = (((i40 & (-8191)) + (i40 | (-8191))) / 4096) + 1;
                    Object[] objArr17 = new Object[15138 / (((-((i41 & 1) + (i41 | 1))) & i39) * 1682)];
                    objArr17[0] = str;
                    zzbjvVarZze = zzbjvVar3.zze(String.format("Could not verify authority '%s' for the rpc with no X509TrustManager available", objArr17));
                } else {
                    zzbjvVarZze = zzbjvVarZze2;
                }
                map.put(str, zzbjvVarZze);
                zzbjvVar = zzbjvVarZze;
            }
            if ((!zzbjvVar.zzj()) && zza) {
                zzbxkVar.zzy().zzg(zzbjvVar, zzbls.PROCESSED, true, new zzbip());
                return;
            }
        }
        if (this.zzv.size() < this.zzM) {
            zzab(zzbxkVar);
        } else {
            this.zzN.add(zzbxkVar);
            zzah(zzbxkVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x019e A[Catch: IOException -> 0x02a7, TRY_LEAVE, TryCatch #1 {IOException -> 0x02a7, blocks: (B:8:0x003c, B:11:0x00b2, B:12:0x00f3, B:13:0x00f9, B:14:0x00fe, B:15:0x00ff, B:19:0x013d, B:20:0x0161, B:25:0x0183, B:31:0x0196, B:33:0x019e, B:42:0x01b8, B:43:0x01c1, B:50:0x01d8, B:54:0x01e9, B:55:0x01f1, B:58:0x01f9, B:60:0x01ff, B:64:0x0211, B:70:0x0223, B:73:0x0230, B:79:0x0264, B:80:0x0288, B:77:0x023f, B:61:0x0206, B:62:0x020f, B:81:0x0289, B:82:0x0292, B:83:0x0293, B:84:0x029c, B:45:0x01c5, B:46:0x01ce, B:28:0x018c, B:47:0x01cf, B:85:0x029d, B:86:0x02a6, B:74:0x0235), top: B:102:0x003c, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x01a7  */
    final /* synthetic */ Socket zzs(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws zzbjw {
        Socket socketCreateSocket;
        zzbip zzbipVar;
        int i;
        String strSubstring;
        int i2;
        int iCharAt;
        int i3;
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.zzI.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.zzI.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(this.zzc);
                zzcbz zzcbzVarZzb = zzcbp.zzb(socketCreateSocket);
                zzcbk zzcbkVarZzd = zzcbp.zzd(zzcbp.zza(socketCreateSocket));
                zzbzq zzbzqVar = new zzbzq();
                zzbzqVar.zza("https");
                zzbzqVar.zzb(inetSocketAddress.getHostName());
                zzbzqVar.zzc(inetSocketAddress.getPort());
                zzbzr zzbzrVarZze = zzbzqVar.zze();
                zzbzs zzbzsVar = new zzbzs();
                zzbzsVar.zza(zzbzrVarZze);
                String strZza = zzbzrVarZze.zza();
                int iZzb = zzbzrVarZze.zzb();
                StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + 1 + String.valueOf(iZzb).length());
                sb.append(strZza);
                sb.append(":");
                sb.append(iZzb);
                zzbzsVar.zzb("Host", sb.toString());
                zzbzsVar.zzb("User-Agent", this.zzk);
                if (str != null && str2 != null) {
                    try {
                        StringBuilder sb2 = new StringBuilder(str.length() + 1 + str2.length());
                        sb2.append(str);
                        sb2.append(":");
                        sb2.append(str2);
                        String strZzf = zzcbm.zzb(sb2.toString().getBytes("ISO-8859-1")).zzf();
                        StringBuilder sb3 = new StringBuilder(strZzf.length() + 6);
                        sb3.append("Basic ");
                        sb3.append(strZzf);
                        zzbzsVar.zzb("Proxy-Authorization", sb3.toString());
                    } catch (UnsupportedEncodingException unused) {
                        throw new AssertionError();
                    }
                }
                zzbzt zzbztVarZzc = zzbzsVar.zzc();
                zzbzr zzbzrVarZza = zzbztVarZzc.zza();
                zzcbkVarZzd.zzH(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", zzbzrVarZza.zza(), Integer.valueOf(zzbzrVarZza.zzb()))).zzH("\r\n");
                int iZza = zzbztVarZzc.zzb().zza();
                for (int i7 = 0; i7 < iZza; i7++) {
                    int i8 = TuitionPaymentFragmentbindingInflater1 + 17;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                    int i9 = i8 % 2;
                    zzcbkVarZzd.zzH(zzbztVarZzc.zzb().zzb(i7)).zzH(": ").zzH(zzbztVarZzc.zzb().zzc(i7)).zzH("\r\n");
                }
                zzcbkVarZzd.zzH("\r\n");
                zzcbkVarZzd.flush();
                String strZzad = zzad(zzcbzVarZzb);
                if (strZzad.startsWith("HTTP/1.")) {
                    int i10 = TuitionPaymentFragmentbindingInflater1 + 21;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    if (i10 % 2 == 0) {
                        if (strZzad.length() >= 4) {
                            i2 = 31;
                            if (strZzad.charAt(8) == ' ') {
                                iCharAt = strZzad.charAt(7) - '0';
                                if (iCharAt != 0) {
                                    i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                    TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                                    if (i3 % 2 != 0 ? iCharAt != 1 : iCharAt != 0) {
                                        throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                                    }
                                }
                                i = i2;
                            }
                        }
                    } else if (strZzad.length() >= 9) {
                        i2 = 9;
                        if (strZzad.charAt(8) == ' ') {
                            iCharAt = strZzad.charAt(7) - '0';
                            if (iCharAt != 0) {
                                i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                                if (i3 % 2 != 0) {
                                    throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                                }
                                throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                            }
                            i = i2;
                        }
                    }
                    throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                }
                if (!strZzad.startsWith("ICY ")) {
                    throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                }
                i = 4;
                int i11 = i + 3;
                if (strZzad.length() < i11) {
                    throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                }
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                int i13 = i12 % 2;
                try {
                    int i14 = Integer.parseInt(strZzad.substring(i, i11));
                    if (strZzad.length() <= i11) {
                        strSubstring = "";
                    } else {
                        if (strZzad.charAt(i11) != ' ') {
                            throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                        }
                        strSubstring = strZzad.substring(i + 4);
                    }
                    while (!zzad(zzcbzVarZzb).equals("")) {
                    }
                    if (i14 >= 200 && i14 < 300) {
                        socketCreateSocket.setSoTimeout(0);
                        int i15 = TuitionPaymentFragmentbindingInflater1 + 81;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                        int i16 = i15 % 2;
                        return socketCreateSocket;
                    }
                    zzcbj zzcbjVar = new zzcbj();
                    try {
                        socketCreateSocket.shutdownOutput();
                        zzcbzVarZzb.zza(zzcbjVar, 1024L);
                    } catch (IOException e2) {
                        String string = e2.toString();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 21);
                        sb4.append("Unable to read body: ");
                        sb4.append(string);
                        zzcbjVar.zzv(sb4.toString());
                    }
                    try {
                        socketCreateSocket.close();
                    } catch (IOException unused2) {
                    }
                    throw new zzbjw(zzbjv.zzi.zze(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(i14), strSubstring, zzcbjVar.zzo())), null);
                } catch (NumberFormatException unused3) {
                    throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                }
            } catch (IOException e3) {
                e = e3;
                if (socketCreateSocket != null) {
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                    TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                    if (i17 % 2 != 0) {
                        zzbpf.zzh(socketCreateSocket);
                        throw null;
                    }
                    zzbipVar = null;
                    zzbpf.zzh(socketCreateSocket);
                } else {
                    zzbipVar = null;
                }
                throw new zzbjw(zzbjv.zzi.zze("Failed trying to connect with proxy").zzd(e), zzbipVar);
            }
        } catch (IOException e4) {
            e = e4;
            socketCreateSocket = null;
        }
    }

    static /* synthetic */ Logger zzv() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Logger logger = zzf;
        int i5 = i2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return logger;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ InetSocketAddress zzA() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        InetSocketAddress inetSocketAddress = this.zzi;
        int i5 = i3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return inetSocketAddress;
    }

    final /* synthetic */ int zzB() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.zzn;
        int i6 = i2 + 83;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    final /* synthetic */ zzbzp zzC() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zzbzp zzbzpVar = this.zzo;
        int i5 = i2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return zzbzpVar;
    }

    final /* synthetic */ zzbsi zzD() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        zzbsi zzbsiVar = this.zzp;
        int i5 = i3 + 3;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return zzbsiVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ zzbwz zzE() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        zzbwz zzbwzVar = this.zzq;
        int i5 = i3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return zzbwzVar;
    }

    final /* synthetic */ zzbyh zzF() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zzbyh zzbyhVar = this.zzr;
        int i5 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return zzbyhVar;
    }

    final /* synthetic */ Object zzG() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 31;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.zzs;
        int i5 = i2 + 13;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    final /* synthetic */ Map zzH() {
        Map map;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            map = this.zzv;
            int i4 = 50 / 0;
        } else {
            map = this.zzv;
        }
        int i5 = i2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    final /* synthetic */ Executor zzI() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzw;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ int zzJ() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzK(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 105;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        this.zzA = i;
        int i6 = i3 + 125;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
    }

    final /* synthetic */ zzbxr zzL() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        zzbxr zzbxrVar = this.zzB;
        int i5 = i3 + 61;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return zzbxrVar;
    }

    final /* synthetic */ void zzM(zzbxr zzbxrVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzB = zzbxrVar;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ zzbez zzN() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        zzbez zzbezVar = this.zzC;
        int i5 = i2 + 59;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return zzbezVar;
    }

    final /* synthetic */ void zzO(zzbez zzbezVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzC = zzbezVar;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ zzbjv zzP() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzD;
        }
        throw null;
    }

    final /* synthetic */ zzbpj zzQ() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        zzbpj zzbpjVar = this.zzF;
        int i5 = i2 + 37;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return zzbpjVar;
    }

    final /* synthetic */ void zzR(zzbpj zzbpjVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.zzF = null;
        int i5 = i3 + 35;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ SocketFactory zzS() {
        SocketFactory socketFactory;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            socketFactory = this.zzI;
            int i4 = 80 / 0;
        } else {
            socketFactory = this.zzI;
        }
        int i5 = i2 + 5;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return socketFactory;
    }

    final /* synthetic */ SSLSocketFactory zzT() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        SSLSocketFactory sSLSocketFactory = this.zzJ;
        int i5 = i2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return sSLSocketFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ HostnameVerifier zzU() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        HostnameVerifier hostnameVerifier = this.zzK;
        int i4 = i3 + 43;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return hostnameVerifier;
    }

    final /* synthetic */ void zzV(Socket socket) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzL = socket;
        int i5 = i3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzW(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = i3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        this.zzM = i;
        int i6 = i3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    final /* synthetic */ zzbyl zzX() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        zzbyl zzbylVar = this.zzO;
        int i5 = i3 + 77;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return zzbylVar;
    }

    final /* synthetic */ zzbqk zzY() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        zzbqk zzbqkVar = this.zzP;
        int i5 = i3 + 59;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return zzbqkVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ Runnable zzZ() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzQ;
        }
        throw null;
    }

    final /* synthetic */ int zzaa() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzR;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzt;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbmg
    public final zzbez zzf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zzbez zzbezVar = this.zzC;
        int i5 = i2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return zzbezVar;
    }

    final boolean zzh() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (this.zzJ != null) {
            return false;
        }
        int i5 = i2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    final /* synthetic */ boolean zzr() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zZzac = zzac();
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return zZzac;
    }

    final /* synthetic */ void zzu(int i, zzbyz zzbyzVar, zzbjv zzbjvVar) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zzae(i, zzbyzVar, zzbjvVar);
        if (i4 == 0) {
            int i5 = 33 / 0;
        }
    }

    final /* synthetic */ Socket zzw() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzx(Socket socket) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzg = socket;
        int i5 = i2 + 65;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ SSLSession zzy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        SSLSession sSLSession = this.zzh;
        int i5 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return sSLSession;
    }

    final /* synthetic */ void zzz(SSLSession sSLSession) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzh = sSLSession;
        if (i4 != 0) {
            int i5 = 48 / 0;
        }
        int i6 = i2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new int[]{1429983130, -734008316, -1232436055, 246236064, 1519256775, -1886459961, 391378022, -244159544, -1260302036, -344159100, 872494453, 398639281, -1031041600, -1002648926, 53459362, 1477637901, 85482522, 1159074298};
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
    private static java.lang.String $$g(short r6, byte r7, int r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbxt.$$c
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r8 = r8 * 56
            int r8 = 122 - r8
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbxt.$$g(short, byte, int):java.lang.String");
    }
}
