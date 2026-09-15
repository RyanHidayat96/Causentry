package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.collect.ImmutableList;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.addAllCameraCaptureCallbacks;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
final class zzbti extends zzbia {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static int b;
    private static final Logger zzf;
    private final boolean zzg;
    private final zzbhr zzh;
    private final Map zzi;
    private final zzbtb zzj;
    private int zzk;
    private boolean zzl;
    private zzbkc zzm;
    private zzbfy zzn;
    private zzbfy zzo;
    private boolean zzp;
    private zzbkc zzq;
    private final boolean zzr;
    private zzbon zzs;
    private static final byte[] $$c = {25, 31, 20, 1};
    private static final int $$f = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -77, 2, Base64.padSymbol, -16, -2, 59, -61, -12, -4, 4, -9, 3, 51, -55, -17, 6, -18, -1, 2, 1, 50, -67, 8, -23, 11, -17, 5, 4, -15, 58, -57, -16, -1, -7, -7, 64, -75, -3, 7, -7, -1, -15, 7, 0, -18, 65, -35, -24, -23, 11, -17, 5, 4, -15, 36, -57, 7, 9, -16, 0, 2, 28, -48, -1, -7, -7, -5, 75, -4, -37, -55, 0, 11, -17, 0, 9, -15, 21, -42, 7, -10, 8, -1, -19, 7, 2, 19, -25, -16, 7, -6, -1, 44, -9, 1, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
    private static final int $$e = 221;
    private static final byte[] $$a = {119, -102, -34, -3, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 23;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f791a = 1;
    private static int d = 0;

    static {
        asBinder = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zzf = Logger.getLogger(zzbti.class.getName());
        int i = d + 29;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    zzbti(zzbhr zzbhrVar) {
        boolean z;
        if (zze() || !zzbpf.zzj("GRPC_PF_USE_HAPPY_EYEBALLS", false)) {
            z = false;
        } else {
            int i = f791a + 15;
            g = i % 128;
            z = i % 2 == 0;
            int i2 = 2 % 2;
        }
        this.zzg = z;
        this.zzi = new HashMap();
        this.zzj = new zzbtb(ImmutableList.asInterface(), z);
        this.zzk = 0;
        this.zzl = true;
        this.zzm = null;
        zzbfy zzbfyVar = zzbfy.IDLE;
        this.zzn = zzbfyVar;
        this.zzo = zzbfyVar;
        this.zzp = true;
        this.zzq = null;
        this.zzr = zze();
        if (zzbhrVar == null) {
            throw new NullPointerException("helper");
        }
        int i3 = f791a + 105;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 % 2;
        }
        this.zzh = zzbhrVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r0 = 53 - r8
            byte[] r1 = com.google.android.libraries.places.internal.zzbti.$$a
            int r6 = r6 * 52
            int r6 = 55 - r6
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbti.c(short, byte, short, java.lang.Object[]):void");
    }

    private static void f(byte b2, short s, byte b3, Object[] objArr) {
        int i = 95 - (b2 * 92);
        int i2 = b3 * 40;
        int i3 = 99 - (s * 15);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i2 + 53];
        int i4 = i2 + 52;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i3)) - 4;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            i++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i])) - 4;
                i5 = i6;
            }
        }
    }

    static boolean zze() {
        int i = 2 % 2;
        int i2 = f791a + 45;
        g = i2 % 128;
        int i3 = i2 % 2;
        boolean zZzj = zzbpf.zzj("GRPC_SERIALIZE_RETRIES", false);
        int i4 = g + 41;
        f791a = i4 % 128;
        int i5 = i4 % 2;
        return zZzj;
    }

    private final void zzp() {
        int i = 2 % 2;
        int i2 = f791a + 9;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.zzr && this.zzq == null) {
            int i4 = i3 + 107;
            f791a = i4 % 128;
            int i5 = i4 % 2;
            if (this.zzs == null) {
                this.zzs = new zzbon();
                int i6 = f791a + 95;
                g = i6 % 128;
                int i7 = i6 % 2;
            }
            long jZza = this.zzs.zza();
            zzbhr zzbhrVar = this.zzh;
            this.zzq = zzbhrVar.zzd().zzd(new zzbsx(this), jZza, TimeUnit.NANOSECONDS, zzbhrVar.zze());
        }
    }

    private final void zzq(zzbth zzbthVar) throws IllegalAccessException {
        int i = 2 % 2;
        zzbfy zzbfyVarZzg = zzbthVar.zzg();
        zzbfy zzbfyVar = zzbfy.READY;
        if (zzbfyVarZzg == zzbfyVar) {
            Object obj = null;
            if (!this.zzp) {
                int i2 = g + 3;
                f791a = i2 % 128;
                if (i2 % 2 == 0) {
                    zzbthVar.zze();
                    obj.hashCode();
                    throw null;
                }
                if (zzbthVar.zze() != zzbfyVar) {
                    int i3 = f791a + 51;
                    g = i3 % 128;
                    int i4 = i3 % 2;
                    zzbfy zzbfyVarZze = zzbthVar.zze();
                    zzbfy zzbfyVar2 = zzbfy.TRANSIENT_FAILURE;
                    if (zzbfyVarZze != zzbfyVar2) {
                        if (this.zzo != zzbfyVar2) {
                            zzr(zzbthVar.zze(), new zzbte(zzbht.zzd()));
                            return;
                        }
                        return;
                    } else {
                        zzr(zzbfyVar2, new zzbte(zzbht.zzb(zzbthVar.zzh().zzd())));
                        int i5 = f791a + 5;
                        g = i5 % 128;
                        if (i5 % 2 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            zzr(zzbfyVar, new zzbhq(zzbht.zza(zzbthVar.zzf(), null)));
        }
    }

    private final boolean zzo(ImmutableList immutableList) {
        int i = 2 % 2;
        Map map = this.zzi;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        int size = immutableList.size();
        int i2 = g + 125;
        f791a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < size) {
            int i5 = f791a + 55;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                hashSet2.addAll(((zzbgl) immutableList.get(i4)).zza());
                i4 += 56;
            } else {
                hashSet2.addAll(((zzbgl) immutableList.get(i4)).zza());
                i4++;
            }
        }
        for (SocketAddress socketAddress : hashSet) {
            int i6 = f791a + 29;
            g = i6 % 128;
            int i7 = i6 % 2;
            if (!hashSet2.contains(socketAddress)) {
                int i8 = g + 49;
                f791a = i8 % 128;
                if (i8 % 2 == 0) {
                    ((zzbth) map.remove(socketAddress)).zza().zzb();
                    throw null;
                }
                ((zzbth) map.remove(socketAddress)).zza().zzb();
            }
        }
        return hashSet.isEmpty();
    }

    private final void zzr(zzbfy zzbfyVar, zzbhy zzbhyVar) throws IllegalAccessException {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39, 19 - Color.alpha(0), 1513912262, false, "b", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - ((Process.getThreadPriority(0) + 20) >> 6)), 59 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - View.resolveSize(0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 59, 18 - (ViewConfiguration.getLongPressTimeout() >> 16), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 85;
        long j3 = (j2 * 494566231346928711L) + (j2 * 5024687265812857528L);
        long j4 = -84;
        long j5 = -1;
        long j6 = j5 ^ 494566231346928711L;
        long j7 = j5 ^ 5024687265812857528L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j8 = jIdentityHashCode ^ j5;
        long j9 = (j8 | 5024687265812857528L) ^ j5;
        long j10 = j3 + ((((j6 | j7) ^ j5) | ((j6 | j8) ^ j5) | ((j7 | j8) ^ j5) | ((5187952706852380415L | jIdentityHashCode) ^ j5)) * j4) + (j4 * (((j7 | jIdentityHashCode) ^ j5) | 494566231346928711L | j9)) + (((long) 84) * ((5187952706852380415L ^ j5) | j9));
        int i4 = 0;
        while (true) {
            int i5 = 0;
            while (i5 != 8) {
                int i6 = f791a + 91;
                g = i6 % 128;
                if (i6 % 2 != 0) {
                    i3 *= ((((int) (j >>> i5)) & 16516) / (i3 + 52)) >> (i3 * 23);
                    i5 += 70;
                } else {
                    i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                    i5++;
                }
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            int i7 = g + 109;
            f791a = i7 % 128;
            int i8 = i7 % 2;
            j = j10;
        }
        if (i3 != i2) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - TextUtils.getOffsetBefore("", 0)), 39 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Process.getGidForName("") + 20, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw null;
        }
        if (zzbfyVar == this.zzo) {
            int i9 = g + 57;
            f791a = i9 % 128;
            int i10 = i9 % 2;
            if (zzbfyVar == zzbfy.IDLE || zzbfyVar == zzbfy.CONNECTING) {
                return;
            }
        }
        this.zzo = zzbfyVar;
        this.zzh.zzb(zzbfyVar, zzbhyVar);
    }

    private final void zzt() {
        zzbkc zzbkcVar;
        int i = 2 % 2;
        int i2 = g + 1;
        int i3 = i2 % 128;
        f791a = i3;
        if (i2 % 2 == 0) {
            zzbkcVar = this.zzm;
            int i4 = 13 / 0;
            if (zzbkcVar == null) {
                return;
            }
        } else {
            zzbkcVar = this.zzm;
            if (zzbkcVar == null) {
                return;
            }
        }
        int i5 = i3 + 15;
        g = i5 % 128;
        int i6 = i5 % 2;
        zzbkcVar.zza();
        this.zzm = null;
        if (i6 != 0) {
            int i7 = 12 / 0;
        }
    }

    private final void zzs() {
        int i = 2 % 2;
        int i2 = f791a;
        int i3 = i2 + 71;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 29 / 0;
            if (!this.zzg) {
                return;
            }
        } else if (!this.zzg) {
            return;
        }
        int i5 = i2 + 59;
        int i6 = i5 % 128;
        g = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        zzbkc zzbkcVar = this.zzm;
        if (zzbkcVar != null) {
            int i7 = i6 + 91;
            f791a = i7 % 128;
            if (i7 % 2 == 0) {
                zzbkcVar.zzb();
                throw null;
            }
            if (zzbkcVar.zzb()) {
                return;
            }
        }
        zzbhr zzbhrVar = this.zzh;
        this.zzm = zzbhrVar.zzd().zzd(new zzbsy(this), 250L, TimeUnit.MILLISECONDS, zzbhrVar.zze());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    private static final SocketAddress zzu(zzbhx zzbhxVar) {
        boolean z;
        int i = 2 % 2;
        zzbrv zzbrvVar = (zzbrv) zzbhxVar;
        zzbrvVar.zzj.zze.zzc();
        if (!zzbrvVar.zzg) {
            throw new IllegalStateException("not started");
        }
        List list = zzbrvVar.zze;
        if (list != null) {
            int i2 = g + 93;
            f791a = i2 % 128;
            int i3 = i2 % 2;
            z = true;
            if (list.size() != 1) {
                int i4 = f791a + 69;
                g = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
        } else {
            int i6 = f791a + 69;
            g = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (z) {
            return (SocketAddress) ((zzbgl) list.get(0)).zza().get(0);
        }
        throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("%s does not have exactly one group", list));
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzb(zzbjv zzbjvVar) throws IllegalAccessException {
        int i = 2 % 2;
        if (this.zzn == zzbfy.SHUTDOWN) {
            return;
        }
        Map map = this.zzi;
        Iterator it = map.values().iterator();
        int i2 = g + 75;
        f791a = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                map.clear();
                this.zzj.zzg(ImmutableList.asInterface());
                zzbfy zzbfyVar = zzbfy.TRANSIENT_FAILURE;
                this.zzn = zzbfyVar;
                zzr(zzbfyVar, new zzbte(zzbht.zzb(zzbjvVar)));
                return;
            }
            ((zzbth) it.next()).zza().zzb();
            i2 = f791a + 105;
            g = i2 % 128;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzc() {
        int i = 2 % 2;
        Map map = this.zzi;
        zzf.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        zzbfy zzbfyVar = zzbfy.SHUTDOWN;
        this.zzn = zzbfyVar;
        this.zzo = zzbfyVar;
        zzt();
        zzbkc zzbkcVar = this.zzq;
        Object obj = null;
        if (zzbkcVar != null) {
            int i2 = f791a + 99;
            g = i2 % 128;
            int i3 = i2 % 2;
            zzbkcVar.zza();
            this.zzq = null;
            int i4 = g + 101;
            f791a = i4 % 128;
            int i5 = i4 % 2;
        }
        this.zzs = null;
        Iterator it = map.values().iterator();
        int i6 = f791a + 1;
        g = i6 % 128;
        int i7 = i6 % 2;
        while (it.hasNext()) {
            ((zzbth) it.next()).zza().zzb();
        }
        map.clear();
        int i8 = f791a + 91;
        g = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzd() {
        int i = 2 % 2;
        zzbtb zzbtbVar = this.zzj;
        if ((!zzbtbVar.zza()) || this.zzn == zzbfy.SHUTDOWN) {
            return;
        }
        int i2 = g + 93;
        f791a = i2 % 128;
        int i3 = i2 % 2;
        Map map = this.zzi;
        SocketAddress socketAddressZzd = zzbtbVar.zzd();
        zzbth zzbthVar = (zzbth) map.get(socketAddressZzd);
        byte[] bArr = null;
        if (zzbthVar == null) {
            zzbez zzbezVarZze = zzbtbVar.zze();
            zzbsz zzbszVar = new zzbsz(this, bArr);
            zzbhr zzbhrVar = this.zzh;
            zzbhm zzbhmVarZzd = zzbho.zzd();
            zzbgl[] zzbglVarArr = {new zzbgl(Collections.singletonList(socketAddressZzd), zzbezVarZze)};
            addAllCameraCaptureCallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, "arraySize");
            int i4 = 1 / 10;
            int i5 = f791a + 57;
            g = i5 % 128;
            int i6 = i5 % 2;
            ArrayList arrayList = new ArrayList(6);
            Collections.addAll(arrayList, zzbglVarArr);
            zzbhmVarZzd.zzb(arrayList);
            zzbhmVarZzd.zza(zzb, zzbszVar);
            zzbhmVarZzd.zza(zzbia.zzc, Boolean.valueOf(this.zzr));
            zzbhx zzbhxVarZza = zzbhrVar.zza(zzbhmVarZzd.zzc());
            final zzbth zzbthVar2 = new zzbth(zzbhxVarZza, zzbfy.IDLE);
            zzbszVar.zzb(zzbthVar2);
            map.put(socketAddressZzd, zzbthVar2);
            zzbez zzbezVarZzb = ((zzbrv) zzbhxVarZza).zza.zzb();
            if (this.zzp || zzbezVarZzb.zza(zzbia.zzd) == null) {
                zzbthVar2.zzi(zzbfz.zza(zzbfy.READY));
            }
            zzbhxVarZza.zza(new zzbhz() { // from class: com.google.android.libraries.places.internal.zzbtc
                @Override // com.google.android.libraries.places.internal.zzbhz
                public final /* synthetic */ void zza(zzbfz zzbfzVar) throws IllegalAccessException {
                    this.zza.zzf(zzbthVar2, zzbfzVar);
                }
            });
            zzbthVar = zzbthVar2;
        }
        int iOrdinal = zzbthVar.zzb().ordinal();
        if (iOrdinal == 0) {
            zzs();
            return;
        }
        int i7 = f791a;
        int i8 = i7 + 11;
        int i9 = i8 % 128;
        g = i9;
        if (i8 % 2 == 0 ? iOrdinal != 2 : iOrdinal != 3) {
            int i10 = i9 + 65;
            f791a = i10 % 128;
            if (i10 % 2 == 0) {
                if (iOrdinal != 4) {
                    return;
                }
            } else if (iOrdinal != 3) {
                return;
            }
            zzbthVar.zzf().zzc();
            zzbthVar.zzd(zzbfy.CONNECTING);
            zzs();
            return;
        }
        if (!this.zzr) {
            int i11 = i7 + 29;
            g = i11 % 128;
            int i12 = i11 % 2;
            zzbtbVar.zzb();
            zzd();
            return;
        }
        if (zzbtbVar.zza()) {
            zzbthVar.zzf().zzc();
            zzbthVar.zzd(zzbfy.CONNECTING);
            return;
        }
        int i13 = g + 71;
        f791a = i13 % 128;
        if (i13 % 2 != 0) {
            zzp();
        } else {
            zzp();
            bArr.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    @Override // com.google.android.libraries.places.internal.zzbia
    public final zzbjv zza(zzbhw zzbhwVar) throws IllegalAccessException {
        zzbtb zzbtbVar;
        SocketAddress socketAddressZzd;
        int i = 2 % 2;
        if (this.zzn == zzbfy.SHUTDOWN) {
            int i2 = g + 123;
            f791a = i2 % 128;
            int i3 = i2 % 2;
            return zzbjv.zzg.zze("Already shut down");
        }
        Boolean bool = (Boolean) zzbhwVar.zzd().zza(zze);
        this.zzp = bool == null || !bool.booleanValue();
        List<zzbgl> listZzc = zzbhwVar.zzc();
        if (listZzc.isEmpty()) {
            zzbjv zzbjvVar = zzbjv.zzi;
            String strValueOf = String.valueOf(zzbhwVar.zzc());
            String strValueOf2 = String.valueOf(zzbhwVar.zzd());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 55 + String.valueOf(strValueOf2).length());
            sb.append("NameResolver returned no usable address. addrs=");
            sb.append(strValueOf);
            sb.append(", attrs=");
            sb.append(strValueOf2);
            zzbjv zzbjvVarZze = zzbjvVar.zze(sb.toString());
            zzb(zzbjvVarZze);
            return zzbjvVarZze;
        }
        Iterator it = listZzc.iterator();
        do {
            Object obj = null;
            if (!it.hasNext()) {
                this.zzl = true;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (zzbgl zzbglVar : listZzc) {
                    ArrayList arrayList2 = new ArrayList();
                    for (SocketAddress socketAddress : zzbglVar.zza()) {
                        if (hashSet.add(socketAddress)) {
                            arrayList2.add(socketAddress);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new zzbgl(arrayList2, zzbglVar.zzb()));
                    }
                }
                if (zzbhwVar.zze() instanceof zzbtd) {
                    int i4 = f791a + 103;
                    g = i4 % 128;
                    if (i4 % 2 != 0) {
                        Boolean bool2 = ((zzbtd) zzbhwVar.zze()).zza;
                        obj.hashCode();
                        throw null;
                    }
                    zzbtd zzbtdVar = (zzbtd) zzbhwVar.zze();
                    Boolean bool3 = zzbtdVar.zza;
                    if (bool3 != null && bool3.booleanValue()) {
                        Long l = zzbtdVar.zzb;
                        Collections.shuffle(arrayList, new Random());
                    }
                }
                ImmutableList.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ImmutableList.g().TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayList);
                tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                ImmutableList immutableListTuitionPaymentFragmentbindingInflater1 = ImmutableList.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
                zzbfy zzbfyVar = this.zzn;
                zzbfy zzbfyVar2 = zzbfy.READY;
                if (zzbfyVar != zzbfyVar2) {
                    int i5 = g + 81;
                    f791a = i5 % 128;
                    int i6 = i5 % 2;
                    if (zzbfyVar != zzbfy.CONNECTING) {
                        this.zzj.zzg(immutableListTuitionPaymentFragmentbindingInflater1);
                    } else {
                        zzbtbVar = this.zzj;
                        socketAddressZzd = zzbtbVar.zzd();
                        zzbtbVar.zzg(immutableListTuitionPaymentFragmentbindingInflater1);
                        if (zzbtbVar.zzh(socketAddressZzd)) {
                            ((zzbth) this.zzi.get(socketAddressZzd)).zza().zzd(zzbtbVar.zzf());
                            zzo(immutableListTuitionPaymentFragmentbindingInflater1);
                            return zzbjv.zza;
                        }
                    }
                } else {
                    zzbtbVar = this.zzj;
                    socketAddressZzd = zzbtbVar.zzd();
                    zzbtbVar.zzg(immutableListTuitionPaymentFragmentbindingInflater1);
                    if (zzbtbVar.zzh(socketAddressZzd)) {
                        ((zzbth) this.zzi.get(socketAddressZzd)).zza().zzd(zzbtbVar.zzf());
                        zzo(immutableListTuitionPaymentFragmentbindingInflater1);
                        return zzbjv.zza;
                    }
                }
                if (zzo(immutableListTuitionPaymentFragmentbindingInflater1)) {
                    zzbfy zzbfyVar3 = zzbfy.CONNECTING;
                    this.zzn = zzbfyVar3;
                    zzr(zzbfyVar3, new zzbte(zzbht.zzd()));
                    int i7 = f791a + 19;
                    g = i7 % 128;
                    int i8 = i7 % 2;
                }
                zzbfy zzbfyVar4 = this.zzn;
                if (zzbfyVar4 == zzbfyVar2) {
                    zzbfy zzbfyVar5 = zzbfy.IDLE;
                    this.zzn = zzbfyVar5;
                    zzr(zzbfyVar5, new zzbtg(this, this));
                } else if (zzbfyVar4 != zzbfy.CONNECTING) {
                    int i9 = g + 53;
                    f791a = i9 % 128;
                    if (i9 % 2 == 0) {
                        zzbfy zzbfyVar6 = zzbfy.TRANSIENT_FAILURE;
                        obj.hashCode();
                        throw null;
                    }
                    if (zzbfyVar4 == zzbfy.TRANSIENT_FAILURE) {
                        zzt();
                        zzd();
                    }
                } else {
                    zzt();
                    zzd();
                }
                return zzbjv.zza;
            }
            int i10 = f791a + 15;
            g = i10 % 128;
            if (i10 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        } while (((zzbgl) it.next()) != null);
        zzbjv zzbjvVar2 = zzbjv.zzi;
        String strValueOf3 = String.valueOf(zzbhwVar.zzc());
        String strValueOf4 = String.valueOf(zzbhwVar.zzd());
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf3).length() + 69 + String.valueOf(strValueOf4).length());
        sb2.append("NameResolver returned address list with null endpoint. addrs=");
        sb2.append(strValueOf3);
        sb2.append(", attrs=");
        sb2.append(strValueOf4);
        zzbjv zzbjvVarZze2 = zzbjvVar2.zze(sb2.toString());
        zzb(zzbjvVarZze2);
        return zzbjvVarZze2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x018c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[LOOP:0: B:50:0x010c->B:84:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0160 A[SYNTHETIC] */
    final /* synthetic */ void zzf(zzbth zzbthVar, zzbfz zzbfzVar) throws IllegalAccessException {
        int iOrdinal;
        int i;
        zzbkc zzbkcVar;
        int i2;
        zzbtb zzbtbVar;
        int i3;
        Iterator it;
        int i4;
        int i5 = 2 % 2;
        zzbhx zzbhxVarZzf = zzbthVar.zzf();
        zzbfy zzbfyVarZzc = zzbfzVar.zzc();
        Map map = this.zzi;
        if (zzbthVar == map.get(zzu(zzbhxVarZzf)) && zzbfyVarZzc != zzbfy.SHUTDOWN) {
            int i6 = g + 101;
            f791a = i6 % 128;
            int i7 = i6 % 2;
            zzbfy zzbfyVar = zzbfy.IDLE;
            Object obj = null;
            if (zzbfyVarZzc == zzbfyVar && zzbthVar.zzg() == zzbfy.READY) {
                int i8 = g + 67;
                f791a = i8 % 128;
                if (i8 % 2 == 0) {
                    this.zzh.zzc();
                    throw null;
                }
                this.zzh.zzc();
            }
            zzbthVar.zzd(zzbfyVarZzc);
            zzbfy zzbfyVar2 = this.zzn;
            zzbfy zzbfyVar3 = zzbfy.TRANSIENT_FAILURE;
            if (zzbfyVar2 != zzbfyVar3) {
                int i9 = f791a + 81;
                g = i9 % 128;
                int i10 = i9 % 2;
                if (this.zzo != zzbfyVar3) {
                    iOrdinal = zzbfyVarZzc.ordinal();
                    if (iOrdinal == 0) {
                        zzbfy zzbfyVar4 = zzbfy.CONNECTING;
                        this.zzn = zzbfyVar4;
                        zzr(zzbfyVar4, new zzbte(zzbht.zzd()));
                        return;
                    }
                    int i11 = f791a + 11;
                    i = i11 % 128;
                    g = i;
                    int i12 = i11 % 2;
                    if (iOrdinal == 1) {
                        zzbkcVar = this.zzq;
                        if (zzbkcVar != null) {
                            zzbkcVar.zza();
                            this.zzq = null;
                        }
                        this.zzs = null;
                        zzt();
                        for (zzbth zzbthVar2 : map.values()) {
                            int i13 = g + 45;
                            f791a = i13 % 128;
                            int i14 = i13 % 2;
                            if (!zzbthVar2.zza().equals(zzbthVar.zzf())) {
                                i2 = g + 13;
                                f791a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    zzbthVar2.zza().zzb();
                                    obj.hashCode();
                                    throw null;
                                }
                                zzbthVar2.zza().zzb();
                            }
                        }
                        map.clear();
                        zzbfy zzbfyVar5 = zzbfy.READY;
                        zzbthVar.zzd(zzbfyVar5);
                        map.put(zzu(zzbthVar.zzf()), zzbthVar);
                        this.zzj.zzh(zzu(zzbthVar.zzf()));
                        this.zzn = zzbfyVar5;
                        zzq(zzbthVar);
                        return;
                    }
                    if (iOrdinal != 2) {
                        int i15 = i + 33;
                        f791a = i15 % 128;
                        int i16 = i15 % 2;
                        if (iOrdinal != 3) {
                            throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(String.valueOf(zzbfyVarZzc))));
                        }
                        this.zzj.zzc();
                        this.zzn = zzbfyVar;
                        zzr(zzbfyVar, new zzbtg(this, this));
                        return;
                    }
                    zzbtbVar = this.zzj;
                    if (zzbtbVar.zza()) {
                        int i17 = f791a + 29;
                        g = i17 % 128;
                        int i18 = i17 % 2;
                        if (zzbtbVar.zzb()) {
                            zzt();
                            zzd();
                        } else if (map.size() >= zzbtbVar.zzi()) {
                            zzp();
                        } else {
                            zzbtbVar.zzc();
                            zzd();
                        }
                    }
                    if (map.size() >= zzbtbVar.zzi()) {
                        i3 = f791a + 33;
                        g = i3 % 128;
                        if (i3 % 2 != 0) {
                            it = map.values().iterator();
                            int i19 = 58 / 0;
                        } else {
                            it = map.values().iterator();
                        }
                        while (it.hasNext()) {
                            if (!((zzbth) it.next()).zzc()) {
                                return;
                            }
                        }
                        this.zzn = zzbfyVar3;
                        zzr(zzbfyVar3, new zzbte(zzbht.zzb(zzbfzVar.zzd())));
                        i4 = this.zzk + 1;
                        this.zzk = i4;
                        if (i4 < zzbtbVar.zzi()) {
                        }
                        this.zzl = false;
                        this.zzk = 0;
                        this.zzh.zzc();
                        return;
                    }
                } else if (zzbfyVarZzc != zzbfy.CONNECTING) {
                    if (zzbfyVarZzc != zzbfyVar) {
                        iOrdinal = zzbfyVarZzc.ordinal();
                        if (iOrdinal == 0) {
                            zzbfy zzbfyVar6 = zzbfy.CONNECTING;
                            this.zzn = zzbfyVar6;
                            zzr(zzbfyVar6, new zzbte(zzbht.zzd()));
                            return;
                        }
                        int i110 = f791a + 11;
                        i = i110 % 128;
                        g = i;
                        int i111 = i110 % 2;
                        if (iOrdinal == 1) {
                            zzbkcVar = this.zzq;
                            if (zzbkcVar != null) {
                                zzbkcVar.zza();
                                this.zzq = null;
                            }
                            this.zzs = null;
                            zzt();
                            while (r11.hasNext()) {
                                int i112 = g + 45;
                                f791a = i112 % 128;
                                int i113 = i112 % 2;
                                if (!zzbthVar2.zza().equals(zzbthVar.zzf())) {
                                    i2 = g + 13;
                                    f791a = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        zzbthVar2.zza().zzb();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    zzbthVar2.zza().zzb();
                                }
                            }
                            map.clear();
                            zzbfy zzbfyVar7 = zzbfy.READY;
                            zzbthVar.zzd(zzbfyVar7);
                            map.put(zzu(zzbthVar.zzf()), zzbthVar);
                            this.zzj.zzh(zzu(zzbthVar.zzf()));
                            this.zzn = zzbfyVar7;
                            zzq(zzbthVar);
                            return;
                        }
                        if (iOrdinal != 2) {
                            int i114 = i + 33;
                            f791a = i114 % 128;
                            int i115 = i114 % 2;
                            if (iOrdinal != 3) {
                                throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(String.valueOf(zzbfyVarZzc))));
                            }
                            this.zzj.zzc();
                            this.zzn = zzbfyVar;
                            zzr(zzbfyVar, new zzbtg(this, this));
                            return;
                        }
                        zzbtbVar = this.zzj;
                        if (zzbtbVar.zza() && map.get(zzbtbVar.zzd()) == zzbthVar) {
                            int i116 = f791a + 29;
                            g = i116 % 128;
                            int i117 = i116 % 2;
                            if (zzbtbVar.zzb()) {
                                zzt();
                                zzd();
                            } else if (map.size() >= zzbtbVar.zzi()) {
                                zzp();
                            } else {
                                zzbtbVar.zzc();
                                zzd();
                            }
                        }
                        if (map.size() >= zzbtbVar.zzi()) {
                            i3 = f791a + 33;
                            g = i3 % 128;
                            if (i3 % 2 != 0) {
                                it = map.values().iterator();
                                int i118 = 58 / 0;
                            } else {
                                it = map.values().iterator();
                            }
                            while (it.hasNext()) {
                                if (!((zzbth) it.next()).zzc()) {
                                    return;
                                }
                            }
                            this.zzn = zzbfyVar3;
                            zzr(zzbfyVar3, new zzbte(zzbht.zzb(zzbfzVar.zzd())));
                            i4 = this.zzk + 1;
                            this.zzk = i4;
                            if (i4 < zzbtbVar.zzi() || this.zzl) {
                                this.zzl = false;
                                this.zzk = 0;
                                this.zzh.zzc();
                                return;
                            }
                        }
                    } else {
                        zzd();
                    }
                }
            } else if (zzbfyVarZzc != zzbfy.CONNECTING) {
                if (zzbfyVarZzc != zzbfyVar) {
                    iOrdinal = zzbfyVarZzc.ordinal();
                    if (iOrdinal == 0) {
                        zzbfy zzbfyVar8 = zzbfy.CONNECTING;
                        this.zzn = zzbfyVar8;
                        zzr(zzbfyVar8, new zzbte(zzbht.zzd()));
                        return;
                    }
                    int i119 = f791a + 11;
                    i = i119 % 128;
                    g = i;
                    int i1110 = i119 % 2;
                    if (iOrdinal == 1) {
                        zzbkcVar = this.zzq;
                        if (zzbkcVar != null) {
                            zzbkcVar.zza();
                            this.zzq = null;
                        }
                        this.zzs = null;
                        zzt();
                        while (r11.hasNext()) {
                            int i1111 = g + 45;
                            f791a = i1111 % 128;
                            int i1112 = i1111 % 2;
                            if (!zzbthVar2.zza().equals(zzbthVar.zzf())) {
                                i2 = g + 13;
                                f791a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    zzbthVar2.zza().zzb();
                                    obj.hashCode();
                                    throw null;
                                }
                                zzbthVar2.zza().zzb();
                            }
                        }
                        map.clear();
                        zzbfy zzbfyVar9 = zzbfy.READY;
                        zzbthVar.zzd(zzbfyVar9);
                        map.put(zzu(zzbthVar.zzf()), zzbthVar);
                        this.zzj.zzh(zzu(zzbthVar.zzf()));
                        this.zzn = zzbfyVar9;
                        zzq(zzbthVar);
                        return;
                    }
                    if (iOrdinal != 2) {
                        int i1113 = i + 33;
                        f791a = i1113 % 128;
                        int i1114 = i1113 % 2;
                        if (iOrdinal != 3) {
                            throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(String.valueOf(zzbfyVarZzc))));
                        }
                        this.zzj.zzc();
                        this.zzn = zzbfyVar;
                        zzr(zzbfyVar, new zzbtg(this, this));
                        return;
                    }
                    zzbtbVar = this.zzj;
                    if (zzbtbVar.zza()) {
                        int i1115 = f791a + 29;
                        g = i1115 % 128;
                        int i1116 = i1115 % 2;
                        if (zzbtbVar.zzb()) {
                            zzt();
                            zzd();
                        } else if (map.size() >= zzbtbVar.zzi()) {
                            zzp();
                        } else {
                            zzbtbVar.zzc();
                            zzd();
                        }
                    }
                    if (map.size() >= zzbtbVar.zzi()) {
                        i3 = f791a + 33;
                        g = i3 % 128;
                        if (i3 % 2 != 0) {
                            it = map.values().iterator();
                            int i1117 = 58 / 0;
                        } else {
                            it = map.values().iterator();
                        }
                        while (it.hasNext()) {
                            if (!((zzbth) it.next()).zzc()) {
                                return;
                            }
                        }
                        this.zzn = zzbfyVar3;
                        zzr(zzbfyVar3, new zzbte(zzbht.zzb(zzbfzVar.zzd())));
                        i4 = this.zzk + 1;
                        this.zzk = i4;
                        if (i4 < zzbtbVar.zzi()) {
                        }
                        this.zzl = false;
                        this.zzk = 0;
                        this.zzh.zzc();
                        return;
                    }
                } else {
                    zzd();
                }
            }
        }
        int i20 = f791a + 95;
        g = i20 % 128;
        int i21 = i20 % 2;
    }

    final /* synthetic */ Map zzj() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Map map = this.zzi;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
            int i2 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b2, b2, (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i2, tapTimeout, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(1190661454 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 22, (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (byte) Gravity.getAbsoluteGravity(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 828499190, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1190661459, View.MeasureSpec.makeMeasureSpec(0, 0) - 28, (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (-828499168) - Color.blue(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf2 = (char) (31532 - TextUtils.lastIndexOf("", '0'));
            int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
            int i3 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf2, packedPositionType, i3, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = f791a + 55;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[80];
                Object[] objArr6 = new Object[1];
                c(b5, b5, (byte) (-bArr2[33]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, i6, doubleTapTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = ((((-1232707873) + ((iIdentityHashCode | 1355251232) * 140)) + (((~(1355251232 | i7)) | 137396315) * (-280))) + (((~(iIdentityHashCode | (-137396316))) | ((~(418828411 | i7)) | 1073819136)) * 140)) - 291042235;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(1190661454 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-17) - (ViewConfiguration.getScrollBarSize() >> 8), (short) TextUtils.indexOf("", "", 0, 0), (byte) View.MeasureSpec.getMode(0), KeyEvent.normalizeMetaState(0) - 828499154, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((Process.myTid() >> 22) + 1190661456, (-25) - TextUtils.getOffsetAfter("", 0), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) - 828499128, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(TextUtils.lastIndexOf("", '0') + 1190661464, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 27, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) View.getDefaultSize(0, 0), (-828499112) - TextUtils.getCapsMode("", 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(View.MeasureSpec.getSize(0) + 1190661462, TextUtils.lastIndexOf("", '0') - 26, (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (-828499097) - Color.argb(0, 0, 0, 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = g + 121;
            f791a = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -291042235};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[20];
                Object[] objArr13 = new Object[1];
                f(b6, bArr3[44], b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[44];
                Object[] objArr14 = new Object[1];
                f(b7, bArr3[20], b7, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 922;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[80];
                    Object[] objArr15 = new Object[1];
                    c(b8, b8, (byte) (-bArr4[33]), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, packedPositionChild, keyRepeatTimeout, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(1190661454 - ExpandableListView.getPackedPositionGroup(0L), (-21) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionType(0L) - 828499189, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(1190661458 - ExpandableListView.getPackedPositionType(0L), (-28) - TextUtils.getOffsetAfter("", 0), (short) TextUtils.getTrimmedLength(""), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-828499168) - (ViewConfiguration.getScrollBarSize() >> 8), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 921;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 29;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[7];
                        byte b10 = bArr5[80];
                        Object[] objArr18 = new Object[1];
                        c(b9, b10, b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, pressedStateDuration, iLastIndexOf, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAlpha = (char) (Color.alpha(0) + 31533);
                        int size = View.MeasureSpec.getSize(0) + 921;
                        int packedPositionChild2 = 27 - ExpandableListView.getPackedPositionChild(0L);
                        byte b11 = $$a[7];
                        Object[] objArr19 = new Object[1];
                        c(b11, b11, (byte) 52, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, size, packedPositionChild2, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            int i13 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i14 = i13 + (-1489013195) + (((~(818312614 | iIdentityHashCode2)) | 137463889) * (-140)) + ((~(955776503 | iIdentityHashCode2)) * 70) + (((~(iIdentityHashCode2 | 955767029)) | 137473363) * 70);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr20[0])[0] = i16 ^ (i16 << 5);
            return map;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr == null) {
            throw null;
        }
        for (String str : strArr) {
            int i17 = f791a + 1;
            g = i17 % 128;
            int i18 = i17 % 2;
            arrayList.add(str);
        }
        throw null;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int iMyTid = (Process.myTid() >> 22) + 2267;
                int deadChar = 33 - KeyEvent.getDeadChar(0, 0);
                byte b3 = (byte) ($$c[3] - 1);
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMyTid, deadChar, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int i7 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3358;
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 18;
                            byte[] bArr3 = $$c;
                            byte b5 = (byte) (bArr3[3] - 1);
                            byte length2 = (byte) bArr3.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, i7, pressedStateDuration, -1054011043, false, $$g(b5, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int iIndexOf = TextUtils.indexOf("", "") + 2267;
                        int scrollBarFadeDuration = 33 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b6 = (byte) ($$c[3] - 1);
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iIndexOf, scrollBarFadeDuration, 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                int i8 = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ j));
                if (!z) {
                    i4 = 0;
                } else {
                    int i9 = $10 + 17;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 1;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i8 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cNormalizeMetaState = (char) (55904 - KeyEvent.normalizeMetaState(0));
                    int iGreen = Color.green(0) + 2855;
                    int i11 = 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b8 = $$c[3];
                    byte b9 = (byte) (b8 - 1);
                    byte b10 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, iGreen, i11, -1529949196, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr5 != null) {
                    int length3 = bArr5.length;
                    byte[] bArr6 = new byte[length3];
                    int i12 = 0;
                    while (i12 < length3) {
                        int i13 = $11 + 1;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            bArr6[i12] = (byte) (((long) bArr5[i12]) % 3046761265686732006L);
                        } else {
                            bArr6[i12] = (byte) (((long) bArr5[i12]) ^ 3046761265686732006L);
                            i12++;
                        }
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i14 = $11 + 123;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    if (z2) {
                        byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static /* synthetic */ Logger zzh() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 13;
        f791a = i3 % 128;
        int i4 = i3 % 2;
        Logger logger = zzf;
        int i5 = i2 + 87;
        f791a = i5 % 128;
        int i6 = i5 % 2;
        return logger;
    }

    final /* synthetic */ void zzg(zzbth zzbthVar) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = g + 57;
        f791a = i2 % 128;
        int i3 = i2 % 2;
        zzq(zzbthVar);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        int i5 = g + 11;
        f791a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    final /* synthetic */ zzbhr zzi() {
        int i = 2 % 2;
        int i2 = f791a + 83;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzbhr zzbhrVar = this.zzh;
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return zzbhrVar;
    }

    final /* synthetic */ zzbtb zzk() {
        int i = 2 % 2;
        int i2 = g + 15;
        int i3 = i2 % 128;
        f791a = i3;
        int i4 = i2 % 2;
        zzbtb zzbtbVar = this.zzj;
        int i5 = i3 + 63;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return zzbtbVar;
    }

    final /* synthetic */ void zzl(zzbkc zzbkcVar) {
        int i = 2 % 2;
        int i2 = f791a;
        int i3 = i2 + 69;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.zzm = null;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 47;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ boolean zzm() {
        int i = 2 % 2;
        int i2 = f791a + 75;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzp;
        }
        throw null;
    }

    final /* synthetic */ void zzn(zzbkc zzbkcVar) {
        int i = 2 % 2;
        int i2 = f791a + 29;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.zzq = null;
        int i5 = i3 + 105;
        f791a = i5 % 128;
        int i6 = i5 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = -1110657005;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795571;
        TuitionPaymentFragmentbindingInflater1 = 900378613;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[]{-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -26, -26, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbti.$$c
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 + 117
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L29:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbti.$$g(int, int, short):java.lang.String");
    }
}
