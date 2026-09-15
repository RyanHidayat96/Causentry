package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.isCameraClosing;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.registerCamera;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrx extends zzbif implements zzbhe {
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    static final Logger zza;
    private static final zzbfi zzaj;
    static final zzbjv zzb;
    static final zzbjv zzc;
    static final zzbjv zzd;
    private static final zzbsh zzg;
    private static final zzbhb zzh;
    private static final zzbhs zzi;
    private final zzbfe zzA;
    private final List zzB;
    private final String zzC;
    private zzbjf zzD;
    private boolean zzE;
    private zzbrf zzF;
    private boolean zzG;
    private final Set zzH;
    private Collection zzI;
    private final Object zzJ;
    private final Set zzK;
    private final zzbnh zzL;
    private final zzbrw zzM;
    private final AtomicBoolean zzN;
    private boolean zzO;
    private boolean zzP;
    private volatile boolean zzQ;
    private final CountDownLatch zzR;
    private final zzblg zzS;
    private final zzblh zzT;
    private final zzblj zzU;
    private final zzbfg zzV;
    private final zzbgy zzW;
    private final zzbrr zzX;
    private zzbsh zzY;
    private boolean zzZ;
    private final boolean zzaa;
    private final zzbuu zzab;
    private final long zzac;
    private final long zzad;
    private final boolean zzae;
    private final zzbsi zzaf;
    private final zzbqx zzag;
    private final zzbub zzah;
    private final zzbiw zzai;
    private int zzak;
    private final zzbom zzal;
    final zzbkd zze;
    final zzbpk zzf;
    private final zzbhf zzj;
    private final String zzk;
    private final URI zzl;
    private final zzbjg zzm;
    private final zzbiy zzn;
    private final zzblb zzo;
    private final zzblw zzp;
    private final zzbrs zzq;
    private final Executor zzr;
    private final zzbsu zzs;
    private final zzbrb zzt;
    private final zzbrb zzu;
    private final zzbwk zzv;
    private final zzbgj zzw;
    private final CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 zzx;
    private final long zzy;
    private final zzbmi zzz;
    private static final byte[] $$c = {81, -102, -70, -91};
    private static final int $$f = 166;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -102, -34, -3, -20, -6, 55, -60, -22, -2, -17, -9, 1, -18, 63, -62, -5, -27, 11, -9, -15, -13, 2, -13, -13, -1, 49, -27, -42, -25, 3, -21, 5, -19, -13, 27, -27, -3, -9, -18, 23, -36, 3, -32, 12, -21, 40, -47, -13, 2, -13, -13, -1, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, 10, -15, -13, 2, -13, -13, -1, 22, -45, 0, -14, 3, -27, 7, -21, 57};
    private static final int $$e = 225;
    private static final byte[] $$a = {58, 66, -1, 15, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 53;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        zza = Logger.getLogger(zzbrx.class.getName());
        zzb = zzbjv.zzi.zze("Channel shutdownNow invoked");
        zzc = zzbjv.zzi.zze("Channel shutdown invoked");
        zzd = zzbjv.zzi.zze("Subchannel shutdown invoked");
        zzg = new zzbsh(null, new HashMap(), new HashMap(), null, null, null);
        zzh = new zzbqo();
        zzi = new zzbqt();
        zzaj = new zzbqv();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        b = i % 128;
        if (i % 2 == 0) {
            int i2 = 59 / 0;
        }
    }

    zzbrx(zzbsc zzbscVar, zzblw zzblwVar, URI uri, zzbjg zzbjgVar, zzbom zzbomVar, zzbsu zzbsuVar, CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 cameraStateRegistryCameraRegistrationExternalSyntheticLambda0, List list, zzbwk zzbwkVar) {
        zzbkd zzbkdVar = new zzbkd(new zzbqu(this));
        this.zze = zzbkdVar;
        this.zzz = new zzbmi();
        this.zzH = new HashSet(16, 0.75f);
        this.zzJ = new Object();
        this.zzK = new HashSet(1, 0.75f);
        byte[] bArr = null;
        this.zzM = new zzbrw(this, bArr);
        this.zzN = new AtomicBoolean(false);
        this.zzR = new CountDownLatch(1);
        this.zzak = 1;
        this.zzY = zzg;
        this.zzZ = false;
        this.zzab = new zzbuu();
        zzbra zzbraVar = new zzbra(this, bArr);
        this.zzaf = zzbraVar;
        this.zzf = new zzbrc(this, null);
        this.zzag = new zzbqx(this, null);
        String str = zzbscVar.zzh;
        if (str == null) {
            throw new NullPointerException(TypedValues.AttributesType.S_TARGET);
        }
        int i = asInterface + 27;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 % 2;
        }
        this.zzk = str;
        zzbhf zzbhfVarZzb = zzbhf.zzb("Channel", str);
        this.zzj = zzbhfVarZzb;
        if (zzbwkVar == null) {
            throw new NullPointerException("timeProvider");
        }
        int i3 = asInterface + 41;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzv = zzbwkVar;
        zzbsu zzbsuVar2 = zzbscVar.zzd;
        if (zzbsuVar2 == null) {
            throw new NullPointerException("executorPool");
        }
        this.zzs = zzbsuVar2;
        Executor executor = (Executor) zzbsuVar2.zza();
        if (executor == null) {
            throw new NullPointerException("executor");
        }
        this.zzr = executor;
        zzbsu zzbsuVar3 = zzbscVar.zze;
        if (zzbsuVar3 == null) {
            throw new NullPointerException("offloadExecutorPool");
        }
        zzbrb zzbrbVar = new zzbrb(zzbsuVar3);
        this.zzu = zzbrbVar;
        zzblf zzblfVar = new zzblf(zzblwVar, null, zzbrbVar);
        this.zzp = zzblfVar;
        new zzblf(zzblwVar, null, zzbrbVar);
        zzbrs zzbrsVar = new zzbrs(zzblfVar.zzb(), null);
        this.zzq = zzbrsVar;
        long jZza = zzbwkVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("Channel for '");
        sb.append(str);
        sb.append("'");
        zzblj zzbljVar = new zzblj(zzbhfVarZzb, 0, jZza, sb.toString());
        this.zzU = zzbljVar;
        zzbli zzbliVar = new zzbli(zzbljVar, zzbwkVar);
        this.zzV = zzbliVar;
        zzbjn zzbjnVar = zzbpf.zzk;
        this.zzae = true;
        zzblb zzblbVar = new zzblb(zzbie.zza(), zzbscVar.zzj);
        this.zzo = zzblbVar;
        if (uri == null) {
            throw new NullPointerException("targetUri");
        }
        this.zzl = uri;
        if (zzbjgVar == null) {
            throw new NullPointerException("nameResolverProvider");
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 5;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 2 % 2;
        this.zzm = zzbjgVar;
        zzbvr zzbvrVar = new zzbvr(true, 5, 5, zzblbVar);
        zzbss zzbssVar = new zzbss(zzbscVar.zzo, zzbiv.zza());
        this.zzai = zzbssVar;
        zzbix zzbixVarZzg = zzbiy.zzg();
        zzbscVar.zzc();
        zzbixVarZzg.zza(443);
        zzbixVarZzg.zzb(zzbjnVar);
        zzbixVarZzg.zzc(zzbkdVar);
        zzbixVarZzg.zzd(zzbrsVar);
        zzbixVarZzg.zze(zzbvrVar);
        zzbixVarZzg.zzf(zzbliVar);
        zzbixVarZzg.zzg(zzbrbVar);
        zzbixVarZzg.zzh(zzbssVar);
        zzbixVarZzg.zzi(zzbscVar.zzf);
        zzbiy zzbiyVarZzj = zzbixVarZzg.zzj();
        this.zzn = zzbiyVarZzj;
        this.zzD = zzf(uri, null, zzbjgVar, zzbiyVarZzj);
        if (zzbsuVar == null) {
            throw new NullPointerException("balancerRpcExecutorPool");
        }
        this.zzt = new zzbrb(zzbsuVar);
        zzbnh zzbnhVar = new zzbnh(executor, zzbkdVar);
        this.zzL = zzbnhVar;
        zzbnhVar.zzao(zzbraVar);
        this.zzal = zzbomVar;
        this.zzaa = true;
        zzbrr zzbrrVar = new zzbrr(this, this.zzD.zza(), null);
        this.zzX = zzbrrVar;
        this.zzA = zzbfl.zza(zzbrrVar, list);
        this.zzB = new ArrayList(zzbscVar.zzg);
        if (cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 == null) {
            throw new NullPointerException("stopwatchSupplier");
        }
        this.zzx = cameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
        long j = zzbscVar.zzm;
        if (j == -1) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 103;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            this.zzy = -1L;
        } else {
            if (!(j >= zzbsc.zzb)) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("invalid idleTimeoutMillis %s", Long.valueOf(j)));
            }
            this.zzy = zzbscVar.zzm;
        }
        this.zzah = new zzbub(new zzbrd(this, null), zzbkdVar, zzblfVar.zzb(), isCameraClosing.TuitionPaymentFragmentbindingInflater1());
        zzbgj zzbgjVar = zzbscVar.zzk;
        if (zzbgjVar == null) {
            throw new NullPointerException("decompressorRegistry");
        }
        this.zzw = zzbgjVar;
        if (zzbscVar.zzl == null) {
            throw new NullPointerException("compressorRegistry");
        }
        int i10 = TuitionPaymentFragmentbindingInflater1 + 45;
        asInterface = i10 % 128;
        if (i10 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zzC = zzbscVar.zzi;
        this.zzad = 16777216L;
        this.zzac = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        zzbqq zzbqqVar = new zzbqq(this, zzbwkVar);
        this.zzS = zzbqqVar;
        this.zzT = zzbqqVar.zza();
        zzbgy zzbgyVar = zzbscVar.zzn;
        this.zzW = zzbgyVar;
        zzbgyVar.zzc(this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 145 - r6
            byte[] r0 = com.google.android.libraries.places.internal.zzbrx.$$a
            int r7 = r7 * 15
            int r1 = 53 - r7
            int r8 = r8 * 2
            int r8 = r8 + 84
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r6 = r6 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbrx.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 12
            int r0 = r7 + 38
            int r8 = r8 * 49
            int r8 = 52 - r8
            int r6 = r6 * 15
            int r6 = r6 + 84
            byte[] r1 = com.google.android.libraries.places.internal.zzbrx.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 37
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2f:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-8)
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbrx.d(byte, int, short, java.lang.Object[]):void");
    }

    private final void zzan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j = this.zzy;
        if (j != -1) {
            this.zzah.zza(j, TimeUnit.MILLISECONDS);
            return;
        }
        int i5 = i2 + 29;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzbfe zzbfeVar = this.zzA;
        if (i3 != 0) {
            return zzbfeVar.zza(zzbiuVar, zzbfdVar);
        }
        zzbfeVar.zza(zzbiuVar, zzbfdVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final String zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzbfe zzbfeVar = this.zzA;
        if (i3 != 0) {
            return zzbfeVar.zzb();
        }
        zzbfeVar.zzb();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbif
    public final /* synthetic */ zzbif zzd() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        int i4 = asInterface + 35;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzl(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        this.zzah.zzb(i2 % 2 == 0);
    }

    final /* synthetic */ void zzo(zzbhy zzbhyVar) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzL.zzg(zzbhyVar);
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
    }

    final /* synthetic */ Executor zzp(zzbfd zzbfdVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            zzbfdVar.zzj();
            throw null;
        }
        Executor executorZzj = zzbfdVar.zzj();
        if (executorZzj == null) {
            executorZzj = this.zzr;
        }
        int i3 = asInterface + 3;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return executorZzj;
        }
        obj.hashCode();
        throw null;
    }

    static zzbjf zzf(URI uri, String str, zzbjg zzbjgVar, zzbiy zzbiyVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzbjf zzbjfVarZza = zzbjgVar.zza(uri, zzbiyVar);
        if (zzbjfVarZza == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(uri))));
        }
        zzbvq zzbvqVar = new zzbvq(zzbjfVarZza, new zzbld(new zzbom(), zzbiyVar.zzd(), zzbiyVar.zzc()), zzbiyVar.zzc());
        int i4 = asInterface + 85;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zzbvqVar;
        }
        throw null;
    }

    final /* synthetic */ void zzn() {
        int i = 2 % 2;
        this.zze.zzc();
        if (this.zzE) {
            this.zzD.zzd();
            int i2 = asInterface + 29;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 119;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        String strValueOf = String.valueOf(this.zzj.zzc());
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte) 0);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = strValueOf;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "logId";
        String str = this.zzk;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = str;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TypedValues.AttributesType.S_TARGET;
        String string = tuitionPaymentFragmentbindingInflater1.toString();
        int i2 = asInterface + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return string;
    }

    final /* synthetic */ void zzi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.zzO) {
            Iterator it = this.zzH.iterator();
            while (it.hasNext()) {
                ((zzbqg) it.next()).zze(zzb);
            }
            Iterator it2 = this.zzK.iterator();
            if (it2.hasNext()) {
                int i4 = asInterface + 91;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = 96 / 0;
                throw null;
            }
        }
        int i6 = TuitionPaymentFragmentbindingInflater1 + 43;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void zzam(boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = asInterface + 41;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zze.zzc();
        if (z) {
            if (!this.zzE) {
                throw new IllegalStateException("nameResolver is not started");
            }
            if (this.zzF != null) {
                int i4 = asInterface + 95;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("lbHelper is null");
            }
        }
        zzbjf zzbjfVar = this.zzD;
        if (zzbjfVar != null) {
            zzbjfVar.zzc();
            this.zzE = false;
            if (z) {
                int i6 = asInterface + 119;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                int i7 = i6 % 2;
                this.zzD = zzf(this.zzl, null, this.zzm, this.zzn);
            } else {
                this.zzD = null;
            }
        }
        zzbrf zzbrfVar = this.zzF;
        if (zzbrfVar != null) {
            zzbrfVar.zza.zzb();
            this.zzF = null;
        }
        int i8 = TuitionPaymentFragmentbindingInflater1 + 83;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzk() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzam(true);
        zzbnh zzbnhVar = this.zzL;
        zzbnhVar.zzg(null);
        this.zzV.zza(2, "Entering IDLE state");
        this.zzz.zza(zzbfy.IDLE);
        if (!(!this.zzf.zzc(this.zzJ, zzbnhVar))) {
            zze();
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 29;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    final /* synthetic */ void zzq() {
        int i = 2 % 2;
        if (!this.zzQ && this.zzN.get()) {
            int i2 = asInterface + 19;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            if (this.zzH.isEmpty() && this.zzK.isEmpty()) {
                this.zzV.zza(2, "Terminated");
                this.zzW.zzf(this);
                this.zzs.zzb(this.zzr);
                this.zzt.zzb();
                this.zzu.zzb();
                this.zzp.close();
                this.zzQ = true;
                this.zzR.countDown();
            }
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 57;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    final void zzh(Throwable th) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 17;
        asInterface = i3 % 128;
        zzbhb zzbhbVar = null;
        if (i3 % 2 == 0) {
            zzbhbVar.hashCode();
            throw null;
        }
        if (this.zzG) {
            int i4 = i2 + 117;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            zzbhbVar.hashCode();
            throw null;
        }
        this.zzG = true;
        try {
            this.zzah.zzb(true);
            zzam(false);
        } finally {
            this.zzL.zzg(new zzbhq(zzbht.zzc(zzbjv.zzh.zze("Panic! This is a bug!").zzd(th))));
            this.zzX.zzc(null);
            this.zzV.zza(4, "PANIC! Entering TRANSIENT_FAILURE");
            this.zzz.zza(zzbfy.TRANSIENT_FAILURE);
        }
    }

    final void zze() {
        int i = 2 % 2;
        this.zze.zzc();
        if (this.zzN.get()) {
            return;
        }
        int i2 = asInterface + 57;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!(!this.zzG)) {
            return;
        }
        if (this.zzf.zzb()) {
            int i3 = asInterface + 125;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            this.zzah.zzb(false);
        } else {
            zzan();
        }
        if (this.zzF == null) {
            this.zzV.zza(2, "Exiting idle mode");
            zzbrf zzbrfVar = new zzbrf(this, null);
            zzbrfVar.zza = new zzbkw(this.zzo, zzbrfVar);
            this.zzF = zzbrfVar;
            this.zzz.zza(zzbfy.CONNECTING);
            this.zzD.zzb(new zzbrh(this, zzbrfVar, this.zzD));
            this.zzE = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    public final zzbrx zzg() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            zzbfg zzbfgVar = this.zzV;
            zzbfgVar.zza(1, "shutdownNow() called");
            zzbfgVar.zza(0, "shutdown() called");
            if (this.zzN.compareAndSet(true, false)) {
                zzbkd zzbkdVar = this.zze;
                zzbkdVar.zzb(new zzbqr(this));
                zzbkdVar.zza();
                zzbrr zzbrrVar = this.zzX;
                zzbkd zzbkdVar2 = zzbrrVar.zza.zze;
                zzbkdVar2.zzb(new zzbrj(zzbrrVar));
                zzbkdVar2.zza();
                zzbkdVar.zzb(new zzbqp(this));
                zzbkdVar.zza();
            }
        } else {
            zzbfg zzbfgVar2 = this.zzV;
            zzbfgVar2.zza(1, "shutdownNow() called");
            zzbfgVar2.zza(1, "shutdown() called");
            if (this.zzN.compareAndSet(false, true)) {
                zzbkd zzbkdVar3 = this.zze;
                zzbkdVar3.zzb(new zzbqr(this));
                zzbkdVar3.zza();
                zzbrr zzbrrVar2 = this.zzX;
                zzbkd zzbkdVar4 = zzbrrVar2.zza.zze;
                zzbkdVar4.zzb(new zzbrj(zzbrrVar2));
                zzbkdVar4.zza();
                zzbkdVar3.zzb(new zzbqp(this));
                zzbkdVar3.zza();
            }
        }
        zzbrr zzbrrVar3 = this.zzX;
        zzbkd zzbkdVar5 = zzbrrVar3.zza.zze;
        zzbkdVar5.zzb(new zzbrk(zzbrrVar3));
        zzbkdVar5.zza();
        zzbkd zzbkdVar6 = this.zze;
        zzbkdVar6.zzb(new zzbqs(this));
        zzbkdVar6.zza();
        int i3 = asInterface + 35;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return this;
        }
        throw null;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        float f = 0.0f;
        char c2 = '0';
        if (cArr2 != null) {
            int i4 = $11 + 25;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), ExpandableListView.getPackedPositionChild(j) + 2268, 'Q' - AndroidCharacter.getMirror(c2), -1927765101, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                    f = 0.0f;
                    c2 = '0';
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
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            char c3 = '\b';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 2267 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, -1927765101, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i7 = $11 + 53;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            char c4 = 3;
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i9 = $11 + 37;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        c = c3;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = deinitsession;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = deinitsession;
                        objArr4[9] = deinitsession;
                        objArr4[c3] = Integer.valueOf(cCharValue);
                        objArr4[7] = deinitsession;
                        objArr4[6] = deinitsession;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = deinitsession;
                        objArr4[c4] = deinitsession;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = deinitsession;
                        objArr4[0] = deinitsession;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49267), (Process.myPid() >> 22) + 3261, 30 - Color.blue(0), -127612708, false, $$g(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i11 = $10 + 73;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            try {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b9 = (byte) 0;
                                    byte b10 = (byte) (b9 + 3);
                                    c = '\b';
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 22878), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 595, 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1570859318, false, $$g(b9, b10, (byte) (b10 - 4)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    c = '\b';
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            c = '\b';
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                            } else {
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    c3 = c;
                    c4 = 3;
                }
            }
            int i18 = 0;
            while (i18 < i) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                i18++;
                int i19 = $11 + 49;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 2 / 3;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    final /* synthetic */ zzblj zzU() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
            int iMyTid = 1755 - (Process.myTid() >> 22);
            int i3 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((short) 141, bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMyTid, i3, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 24, 18, 23, '\n', '\r', 14, 11, '\f', '\t', 15, 20, 2, '\f', 4, 23, 7, 22, 19, 11, 3, 21}, (byte) (17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (Process.myPid() >> 22) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{21, 19, 1, 24, '\t', 22, 11, '\b', 4, '\t', 18, 1, 17, 7, 13877}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 54), 15 - Gravity.getAbsoluteGravity(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
            int mode = View.MeasureSpec.getMode(0) + 23;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            a((short) 104, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, iCombineMeasuredStates, mode, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 19;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                int i6 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                short s = (short) ($$b - 1);
                byte b3 = $$a[7];
                Object[] objArr6 = new Object[1];
                a(s, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, scrollDefaultDelay, i6, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i7}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int i8 = (int) Runtime.getRuntime().totalMemory();
            int i9 = (-750631223) + (((~((-141348679) | i8)) | 2887234) * 1504) + ((~(i8 | (-138461445))) * (-1504)) + 1919925186;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{24, '\t', 14, '\t', 11, 15, 0, 24, '\n', 15, 17, 20, '\b', 2, 22, 4}, (byte) (43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 16 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{'\r', 14, 20, 21, 2, '\r', 2, 23, '\t', 3, 6, '\f', 19, '\f', 14, 23}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31), 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1620435056};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42048 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1726, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 1004124178, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cArgb = (char) (29944 - Color.argb(0, 0, 0, 0));
                    int defaultSize = View.getDefaultSize(0, 0) + 1755;
                    int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                    short s2 = (short) ($$b - 1);
                    byte b4 = $$a[7];
                    Object[] objArr11 = new Object[1];
                    a(s2, b4, b4, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, defaultSize, deadChar, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{0, 24, 18, 23, '\n', '\r', 14, 11, '\f', '\t', 15, 20, 2, '\f', 4, 23, 7, 22, 19, 11, 3, 21}, (byte) (17 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{21, 19, 1, 24, '\t', 22, 11, '\b', 4, '\t', 18, 1, 17, 7, 13877}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 55), 14 - MotionEvent.axisFromString(""), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cArgb2 = (char) (29944 - Color.argb(0, 0, 0, 0));
                        int i12 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iMyPid = (Process.myPid() >> 22) + 23;
                        byte b5 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        a((short) 104, b5, b5, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb2, i12, iMyPid, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollDefaultDelay2 = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int defaultSize2 = 1755 - View.getDefaultSize(0, 0);
                        int iAxisFromString = 22 - MotionEvent.axisFromString("");
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[5];
                        byte b7 = bArr2[7];
                        Object[] objArr15 = new Object[1];
                        a((short) 141, b6, b7, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollDefaultDelay2, defaultSize2, iAxisFromString, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentbindingInflater1$7879113;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    int i15 = TuitionPaymentFragmentbindingInflater1 + 95;
                    asInterface = i15 % 128;
                    if (i15 % 2 == 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 75;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i16 = ((int[]) objArr[3])[0];
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr16 = {new int[]{i17}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iNextInt = new Random().nextInt();
        int i18 = ~iNextInt;
        int i19 = i16 + 382160585 + ((~(1007325995 | i18)) * (-560)) + ((~(iNextInt | 1063163899)) * (-560)) + (((~((-794723570) | i18)) | 738885665) * 560);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr16[3])[0] = i21 ^ (i21 << 5);
        int i22 = asInterface + 65;
        TuitionPaymentFragmentbindingInflater1 = i22 % 128;
        int i23 = i22 % 2;
        return this.zzU;
    }

    final /* synthetic */ zzbrr zzX() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (43041 - ExpandableListView.getPackedPositionChild(0L));
            int touchSlop = 3111 - (ViewConfiguration.getTouchSlop() >> 8);
            int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
            short s = $$a[7];
            byte b2 = (byte) s;
            Object[] objArr2 = new Object[1];
            a(s, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, touchSlop, i4, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 24, 18, 23, '\n', '\r', 14, 11, '\f', '\t', 15, 20, 2, '\f', 4, 23, 7, 22, 19, 11, 3, 21}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17), 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{21, 19, 1, 24, '\t', 22, 11, '\b', 4, '\t', 18, 1, 17, 7, 13877}, (byte) (Gravity.getAbsoluteGravity(0, 0) + 54), 15 - (ViewConfiguration.getTouchSlop() >> 8), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mirror = (char) (43090 - AndroidCharacter.getMirror('0'));
            int minimumFlingVelocity = 3111 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
            short s2 = (short) ($$b - 1);
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(s2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, minimumFlingVelocity, scrollDefaultDelay, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (43042 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                int iBlue = 3111 - Color.blue(0);
                int i5 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                byte b4 = bArr[5];
                byte b5 = bArr[7];
                Object[] objArr6 = new Object[1];
                a((short) 141, b4, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iBlue, i5, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ((1713551354 + (((~(1409265114 | iIdentityHashCode)) | 295766344) * (-756))) + (((~iIdentityHashCode) | 1409265114) * 756)) - 1785603917;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{24, '\t', 14, '\t', 11, 15, 0, 24, '\n', 15, 17, 20, '\b', 2, 22, 4}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 43), KeyEvent.normalizeMetaState(0) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{'\r', 14, 20, 21, 2, '\r', 2, 23, '\t', 3, 6, '\f', 19, '\f', 14, 23}, (byte) (31 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i11 = asInterface + 41;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -1785603917};
                byte[] bArr2 = $$d;
                byte b6 = bArr2[12];
                byte b7 = b6;
                Object[] objArr11 = new Object[1];
                d(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr2[63];
                byte b9 = b8;
                Object[] objArr12 = new Object[1];
                d(b8, b9, b9, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumFlingVelocity = (char) (43042 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int iResolveOpacity = 3111 - Drawable.resolveOpacity(0, 0);
                    int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                    byte[] bArr3 = $$a;
                    Object[] objArr14 = new Object[1];
                    a((short) 141, bArr3[5], bArr3[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, iResolveOpacity, i13, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{0, 24, 18, 23, '\n', '\r', 14, 11, '\f', '\t', 15, 20, 2, '\f', 4, 23, 7, 22, 19, 11, 3, 21}, (byte) (16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), KeyEvent.keyCodeFromString("") + 22, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{21, 19, 1, 24, '\t', 22, 11, '\b', 4, '\t', 18, 1, 17, 7, 13877}, (byte) (53 - ((byte) KeyEvent.getModifierMetaStateMask())), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSize = (char) (43042 - View.resolveSize(0, 0));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 3111;
                        int iRed = 22 - Color.red(0);
                        short s3 = (short) ($$b - 1);
                        byte b10 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        a(s3, b10, b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, iCombineMeasuredStates, iRed, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char deadChar = (char) (43042 - KeyEvent.getDeadChar(0, 0));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 3111;
                        int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
                        short s4 = $$a[7];
                        byte b11 = (byte) s4;
                        Object[] objArr18 = new Object[1];
                        a(s4, b11, b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, iNormalizeMetaState, maximumFlingVelocity2, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i17};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i19 = i16 + ((((~((-724990076) | iElapsedRealtime)) | 18104408) * (-283)) - 1761355670) + ((~(iElapsedRealtime | (-706885668))) * 283);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr[0])[0] = i21 ^ (i21 << 5);
            Object[] objArr19 = {new int[1], new int[]{i18}, iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            int i22 = ((int[]) objArr[0])[0];
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i23};
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i25 = i22 + 475418962 + (((~((-1616265274) | iElapsedRealtime2)) | 4341801) * 104) + ((~((~iElapsedRealtime2) | 1700689657)) * (-104)) + ((iElapsedRealtime2 | 88766185) * 104);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[0])[0] = i27 ^ (i27 << 5);
            Object[] objArr20 = {new int[1], new int[]{i24}, iArr3, strArr4};
        }
        return this.zzX;
    }

    static /* synthetic */ zzbfi zzai() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        zzbfi zzbfiVar = zzaj;
        int i4 = i3 + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zzbfiVar;
    }

    static /* synthetic */ zzbsh zzr() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 75;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        zzbsh zzbshVar = zzg;
        int i5 = i2 + 95;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return zzbshVar;
        }
        throw null;
    }

    static /* synthetic */ zzbhb zzs() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 23;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        zzbhb zzbhbVar = zzh;
        int i5 = i2 + 99;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return zzbhbVar;
        }
        throw null;
    }

    static /* synthetic */ zzbhs zzt() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 81;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzbhs zzbhsVar = zzi;
        int i4 = i2 + 29;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return zzbhsVar;
    }

    final /* synthetic */ zzbmi zzA() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzbmi zzbmiVar = this.zzz;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return zzbmiVar;
    }

    final /* synthetic */ List zzB() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List list = this.zzB;
        int i4 = i3 + 79;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    final /* synthetic */ String zzC() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ zzbjf zzD() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ zzbrf zzE() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        zzbrf zzbrfVar = this.zzF;
        int i5 = i3 + 117;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return zzbrfVar;
        }
        throw null;
    }

    final /* synthetic */ boolean zzF() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.zzG;
        int i4 = i3 + 115;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    final /* synthetic */ Set zzG() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 121;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Set set = this.zzH;
        int i5 = i2 + 109;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    final /* synthetic */ Collection zzH() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        Collection collection = this.zzI;
        int i5 = i3 + 3;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return collection;
    }

    final /* synthetic */ void zzI(Collection collection) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzI = collection;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
    }

    final /* synthetic */ Object zzJ() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Object obj = this.zzJ;
        int i5 = i3 + 71;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return obj;
    }

    final /* synthetic */ zzbnh zzK() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 29;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzL;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ zzbrw zzL() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzbrw zzbrwVar = this.zzM;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return zzbrwVar;
    }

    final /* synthetic */ AtomicBoolean zzM() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 49;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        AtomicBoolean atomicBoolean = this.zzN;
        int i5 = i2 + 85;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return atomicBoolean;
        }
        throw null;
    }

    final /* synthetic */ boolean zzN() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.zzO;
        int i4 = i3 + 87;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    final /* synthetic */ void zzO(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzO = true;
        int i5 = i3 + 95;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ boolean zzP() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.zzP;
        int i5 = i3 + 45;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    final /* synthetic */ void zzQ(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.zzP = true;
        int i5 = i2 + 91;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ boolean zzR() {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.zzQ;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    final /* synthetic */ zzblg zzS() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        zzblg zzblgVar = this.zzS;
        int i5 = i3 + 101;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return zzblgVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ zzblh zzT() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzblh zzblhVar = this.zzT;
        int i4 = i3 + 21;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return zzblhVar;
    }

    final /* synthetic */ zzbfg zzV() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        zzbfg zzbfgVar = this.zzV;
        int i5 = i3 + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zzbfgVar;
    }

    final /* synthetic */ zzbgy zzW() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzbgy zzbgyVar = this.zzW;
        int i4 = i3 + 107;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return zzbgyVar;
    }

    final /* synthetic */ zzbsh zzY() {
        zzbsh zzbshVar;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            zzbshVar = this.zzY;
            int i4 = 84 / 0;
        } else {
            zzbshVar = this.zzY;
        }
        int i5 = i3 + 101;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return zzbshVar;
    }

    final /* synthetic */ void zzZ(zzbsh zzbshVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 73;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.zzY = zzbshVar;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 117;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ boolean zzaa() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 83;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.zzZ;
        int i5 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    final /* synthetic */ void zzab(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzZ = true;
        int i5 = i3 + 49;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
    }

    final /* synthetic */ boolean zzac() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.zzaa;
        int i4 = i2 + 113;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    final /* synthetic */ zzbuu zzad() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        zzbuu zzbuuVar = this.zzab;
        int i5 = i3 + 75;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return zzbuuVar;
    }

    final /* synthetic */ long zzae() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = this.zzac;
        int i5 = i3 + 71;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    final /* synthetic */ long zzaf() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzad;
        }
        int i3 = 86 / 0;
        return this.zzad;
    }

    final /* synthetic */ boolean zzag() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.zzae;
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return z;
    }

    final /* synthetic */ zzbqx zzah() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        zzbqx zzbqxVar = this.zzag;
        int i5 = i3 + 103;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return zzbqxVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ int zzaj() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.zzak;
        int i5 = i3 + 9;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return i4;
    }

    final /* synthetic */ void zzak(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 99;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        this.zzak = i;
        int i6 = i4 + 13;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ zzbom zzal() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 25;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        zzbom zzbomVar = this.zzal;
        int i5 = i2 + 75;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zzbomVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzbhf zzbhfVar = this.zzj;
        int i4 = i3 + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zzbhfVar;
    }

    final /* synthetic */ void zzj(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        zzam(i2 % 2 != 0);
    }

    final /* synthetic */ void zzm() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzan();
        int i4 = asInterface + 31;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ zzblw zzu() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzp;
        }
        throw null;
    }

    final /* synthetic */ zzbrs zzv() {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzq;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ Executor zzw() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        Executor executor = this.zzr;
        int i5 = i3 + 25;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return executor;
    }

    final /* synthetic */ zzbwk zzx() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 55;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        zzbwk zzbwkVar = this.zzv;
        int i5 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return zzbwkVar;
    }

    final /* synthetic */ zzbgj zzy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzw;
        }
        throw null;
    }

    final /* synthetic */ CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 zzz() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 = this.zzx;
        int i5 = i2 + 87;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return cameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{57184, 60056, 60054, 60047, 60058, 60060, 60073, 60040, 60083, 60045, 60117, 60051, 60050, 60063, 60052, 60072, 60055, 60088, 60041, 60049, 60053, 60043, 60034, 60048, 60062};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, byte r8, byte r9) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbrx.$$c
            int r8 = r8 + 113
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r5 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L28:
            int r8 = -r8
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbrx.$$g(short, byte, byte):java.lang.String");
    }
}
