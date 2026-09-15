package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.libraries.places.internal.zzbla;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class zzp implements ServiceConnection, zzt {
    final /* synthetic */ zzs zza;
    private final Map zzb = new HashMap();
    private int zzc = 2;
    private boolean zzd;
    private IBinder zze;
    private final zzo zzf;
    private ComponentName zzg;
    private static final byte[] $$c = {14, 116, 92, -78};
    private static final int $$d = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {7, 15, 25, 25, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 191;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] b = {60117, 60055, 60043, 60045, 60063, 60062, 60051, 60056, 60088, 60034, 60052, 60072, 60040, 60060, 60047, 60050, 60049, 60054, 60053, 60073, 60083, 60048, 60041, 60058, 60116};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57188;

    public zzp(zzs zzsVar, zzo zzoVar) {
        this.zza = zzsVar;
        this.zzf = zzoVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.common.internal.zzp.$$a
            int r6 = r6 * 3
            int r6 = r6 + 84
            int r7 = r7 * 15
            int r7 = 53 - r7
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
        L26:
            int r8 = r8 + 1
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzp.a(int, int, short, java.lang.Object[]):void");
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        onServiceDisconnected(componentName);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.zza.zzb) {
            this.zza.zzd.removeMessages(1, this.zzf);
            this.zze = iBinder;
            this.zzg = componentName;
            Iterator it = this.zzb.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.zzc = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.zza.zzb) {
            this.zza.zzd.removeMessages(1, this.zzf);
            this.zze = null;
            this.zzg = componentName;
            Iterator it = this.zzb.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.zzc = 2;
        }
    }

    public final void zze(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzb.put(serviceConnection, serviceConnection2);
            throw null;
        }
        this.zzb.put(serviceConnection, serviceConnection2);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void zzf(ServiceConnection serviceConnection, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.remove(serviceConnection);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
    }

    public final void zzg(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzd.removeMessages(1, this.zzf);
        zzs zzsVar = this.zza;
        zzsVar.zzf.unbindService(zzsVar.zzc, this);
        this.zzd = false;
        this.zzc = 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* bridge */ /* synthetic */ ConnectionResult zzd(zzp zzpVar, String str, Executor executor) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Intent intentZzb = zzpVar.zzf.zzb(zzpVar.zza.zzc);
            zzpVar.zzc = 3;
            StrictMode.VmPolicy vmPolicyZza = com.google.android.gms.common.util.zzc.zza();
            try {
                zzs zzsVar = zzpVar.zza;
                boolean zZza = zzsVar.zzf.zza(zzsVar.zzc, str, intentZzb, zzpVar, 4225, executor);
                zzpVar.zzd = zZza;
                if (!(!zZza)) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        zzpVar.zza.zzd.sendMessageDelayed(zzpVar.zza.zzd.obtainMessage(1, zzpVar.zzf), zzpVar.zza.zzh);
                        connectionResult2 = ConnectionResult.RESULT_SUCCESS;
                    } else {
                        zzpVar.zza.zzd.sendMessageDelayed(zzpVar.zza.zzd.obtainMessage(1, zzpVar.zzf), zzpVar.zza.zzh);
                        connectionResult2 = ConnectionResult.RESULT_SUCCESS;
                    }
                    StrictMode.setVmPolicy(vmPolicyZza);
                    return connectionResult2;
                }
                zzpVar.zzc = 2;
                try {
                    zzs zzsVar2 = zzpVar.zza;
                    zzsVar2.zzf.unbindService(zzsVar2.zzc, zzpVar);
                } catch (IllegalArgumentException unused) {
                }
                connectionResult = new ConnectionResult(16);
                StrictMode.setVmPolicy(vmPolicyZza);
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return connectionResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicyZza);
                throw th;
            }
        } catch (zzaj e2) {
            connectionResult = e2.zza;
        }
    }

    public final boolean zzh(ServiceConnection serviceConnection) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
            int iIndexOf = 23 - TextUtils.indexOf("", "", 0);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, packedPositionType, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{3, 23, 2, 24, 15, 20, 0, 1, 11, '\r', 1, '\n', 7, 14, '\n', '\t', 18, 7, 0, 11, 6, 22}, (byte) (111 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 22 - KeyEvent.keyCodeFromString(""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{6, 0, 22, 3, '\n', 7, '\t', 24, '\b', 20, 4, 11, 16, 18, 13833}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 10), '?' - AndroidCharacter.getMirror('0'), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 29944);
            int i3 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
            int iMyTid = (Process.myTid() >> 22) + 23;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 | 37), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i3, iMyTid, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                int iMyPid = 23 - (Process.myPid() >> 22);
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 | 89), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, iResolveOpacity, iMyPid, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i4}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iMyPid2 = Process.myPid();
            int i5 = ~iMyPid2;
            int i6 = 1727726253 + (((~((-395905742) | i5)) | 608508167) * (-328)) + ((iMyPid2 | 608508167) * 164) + (((~(iMyPid2 | 395905741)) | 541331714 | (~(i5 | (-328729289)))) * 164) + 2052277163;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{18, 21, '\b', 3, 1, 2, 3, 23, '\n', 3, 14, 6, '\r', '\n', 7, 15}, (byte) (83 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Color.red(0) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{19, 0, '\b', 15, '\n', 19, 19, 14, 21, 24, 11, 7, 5, '\r', 0, '\t'}, (byte) (4 - Color.green(0)), 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1626183372};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.blue(0) + 42049), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1726, View.getDefaultSize(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 2052277163, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                    int trimmedLength = 1755 - TextUtils.getTrimmedLength("");
                    int mirror = 'G' - AndroidCharacter.getMirror('0');
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr11 = new Object[1];
                    a(b7, b8, (byte) (b8 | 89), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, trimmedLength, mirror, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{3, 23, 2, 24, 15, 20, 0, 1, 11, '\r', 1, '\n', 7, 14, '\n', '\t', 18, 7, 0, 11, 6, 22}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 111), ExpandableListView.getPackedPositionChild(0L) + 23, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{6, 0, 22, 3, '\n', 7, '\t', 24, '\b', 20, 4, 11, 16, 18, 13833}, (byte) (10 - (Process.myTid() >> 22)), ((byte) KeyEvent.getModifierMetaStateMask()) + 16, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
                        int pressedStateDuration = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i9 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr14 = new Object[1];
                        a(b9, b10, (byte) (b10 | 37), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, pressedStateDuration, i9, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                        int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 23;
                        byte[] bArr2 = $$a;
                        byte b11 = bArr2[7];
                        Object[] objArr15 = new Object[1];
                        a(b11, bArr2[5], b11, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, i10, iIndexOf2, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                int i14 = i13 % 2;
                while (i2 < strArr.length) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                    if (i15 % 2 != 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 118;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i16 = ((int[]) objArr[3])[0];
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr16 = {new int[]{i17}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iMyPid3 = Process.myPid();
        int i18 = i16 + (-120790168) + (((~((-314549593) | iMyPid3)) | 279715904) * 345) + (((~((-314549593) | (~iMyPid3))) | (-381663071)) * 345) + ((~(iMyPid3 | (-279715905))) * 345);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr16[3])[0] = i20 ^ (i20 << 5);
        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
        int i22 = i21 % 2;
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEmpty = this.zzb.isEmpty();
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return zIsEmpty;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        long j = 0;
        int i5 = 1770390596;
        if (cArr2 != null) {
            int i6 = $11 + 43;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 57;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 2268 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), 33 - TextUtils.getOffsetAfter("", 0), -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 2266 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getEdgeSlop() >> 16) + 33, -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8++;
                }
                j = 0;
                i5 = 1770390596;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) 0;
            byte b8 = b7;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2267 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 33, -1927765101, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        char c = 4;
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $11 + 1;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    i3 = 2;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = deinitsession;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = deinitsession;
                    objArr5[9] = deinitsession;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = deinitsession;
                    objArr5[6] = deinitsession;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[c] = deinitsession;
                    objArr5[3] = deinitsession;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = deinitsession;
                    objArr5[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarFadeDuration = (char) (49267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 3262;
                        int i12 = 31 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b9 = (byte) ($$d & 3);
                        byte b10 = (byte) (b9 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, iIndexOf, i12, -127612708, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        int i13 = $11 + 17;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b11 = (byte) 3;
                            byte b12 = (byte) (b11 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (MotionEvent.axisFromString("") + 22879), 594 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1570859318, false, $$e(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        int i16 = $10 + 23;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                        int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                        int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                    } else {
                        int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                        int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                        int i22 = $11 + 83;
                        $10 = i22 % 128;
                        i3 = 2;
                        if (i22 % 2 != 0) {
                            int i23 = 5 % 4;
                        }
                    }
                    i3 = 2;
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i3;
                c = 4;
            }
        }
        int i24 = $10 + 123;
        $11 = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 4 % 4;
        }
        for (int i26 = 0; i26 < i; i26++) {
            cArr4[i26] = (char) (cArr4[i26] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public final int zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        int i5 = this.zzc;
        int i6 = i3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final ComponentName zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ComponentName componentName = this.zzg;
        int i4 = i3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return componentName;
        }
        throw null;
    }

    public final IBinder zzc() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zze;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zzj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.zzd;
        int i5 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return z;
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
    private static java.lang.String $$e(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = com.google.android.gms.common.internal.zzp.$$c
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = r6 + 113
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
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
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzp.$$e(byte, int, byte):java.lang.String");
    }
}
