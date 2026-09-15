package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.messaging.Constants;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzp implements ServiceConnection {
    zzq zzc;
    final /* synthetic */ zzv zzf;
    int zza = 0;
    final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i);
            }
            zzp zzpVar = this.zza;
            synchronized (zzpVar) {
                zzs zzsVar = (zzs) zzpVar.zze.get(i);
                if (zzsVar == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                    return true;
                }
                zzpVar.zze.remove(i);
                zzpVar.zzf();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzsVar.zzc(new zzt(4, "Not supported by GmsCore", null));
                    return true;
                }
                zzsVar.zza(data);
                return true;
            }
        }
    }));
    final Queue zzd = new ArrayDeque();
    final SparseArray zze = new SparseArray();

    /* synthetic */ zzp(zzv zzvVar, zzo zzoVar) {
        this.zzf = zzvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVar = this.zza;
                IBinder iBinder2 = iBinder;
                synchronized (zzpVar) {
                    try {
                        if (iBinder2 == null) {
                            zzpVar.zza(0, "Null service connection");
                            return;
                        }
                        try {
                            zzpVar.zzc = new zzq(iBinder2);
                            zzpVar.zza = 2;
                            zzpVar.zzc();
                        } catch (RemoteException e2) {
                            zzpVar.zza(0, e2.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            private static final byte[] $$c = {39, -79, 42};
            private static final int $$d = 44;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {29, 88, -118, 32, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 92;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {60228, 38498, 4371, 39980, 8174, 39553, 1463, 34580, 526, 36155, 2257, 35730, 13996, 45150, 13167, 48748, 14838, 42227, 10153, 41306, 11380, 44800, 10967, 45563, 52432, 19386, 50854, 17736, 49185, 24326, 56810, 22711, 55180, 21106, 53558, 27679, 60135, 27115, 58517, 25450, 65098, 60258, 38468, 4405, 39946, 8136, 39591, 1425, 34610, 552, 36125, 2295, 35764, 13962, 45176, 13129, 48714, 14819, 42199, 10191, 41289, 11335, 44846, 10985, 54725, 20664, 53859, 23901, 55353, 23312, 50888, 16772, 52378, 20037, 51493, 45562, 52441, 19375, 50816, 17739, 47974, 50693, 16751, 52305, 20418, 51949, 21969, 55103, 21109, 56599, 22719, 56294, 26318, 57400, 25434, 61002, 27068, 62610, 30686, 61733, 31770, 65397, 31405, 34186, 244, 33382, 3345, 34937, 48187, 54004, 44992, 10490, 42393, 9799, 41769, 15365, 48894, 15273, 46230, 12670, 45609, 3855};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -2210042691921130315L;

            private static void b(byte b, int i, int i2, Object[] objArr) {
                int i3 = (i2 * 14) + 84;
                int i4 = i + 4;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[b + 1];
                int i5 = -1;
                if (bArr == null) {
                    i3 = (i3 + b) - 11;
                }
                while (true) {
                    i5++;
                    bArr2[i5] = (byte) i3;
                    i4++;
                    if (i5 == b) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i3 = (i3 + bArr[i4]) - 11;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    this.zza.zza(3, "Service disconnected");
                } else {
                    this.zza.zza(2, "Service disconnected");
                }
            }

            private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i5 = $11 + 31;
                    $10 = i5 % 128;
                    if (i5 % i3 != 0) {
                        int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i >>> i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) 0;
                                byte b2 = (byte) (b + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.red(0), ImageFormat.getBitsPerPixel(0) + 2188, 40 - TextUtils.getOffsetAfter("", 0), 841711447, false, $$e(b, b2, (byte) (b2 - 2)), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 3012, 25 - TextUtils.lastIndexOf("", '0', 0), 321985076, false, $$e(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - TextUtils.indexOf("", "", 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 3377, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, -968507904, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 2187, (ViewConfiguration.getEdgeSlop() >> 16) + 40, 841711447, false, $$e(b7, b8, (byte) (b8 - 2)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 3012 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.red(0) + 26, 321985076, false, $$e(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            byte b11 = (byte) 0;
                            byte b12 = (byte) (b11 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36505), 3376 - View.MeasureSpec.getMode(0), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -968507904, false, $$e(b11, b12, (byte) (b12 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    }
                    i3 = 2;
                }
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i8 = $11 + 5;
                $10 = i8 % 128;
                int i9 = 2;
                int i10 = i8 % 2;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i11 = $11 + 59;
                    $10 = i11 % 128;
                    int i12 = i11 % i9;
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cRed = (char) (Color.red(0) + 36505);
                        int keyRepeatTimeout = 3376 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iAxisFromString = MotionEvent.axisFromString("") + 18;
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 1);
                        String str$$e = $$e(b13, b14, (byte) (b14 - 1));
                        i9 = 2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRed, keyRepeatTimeout, iAxisFromString, -968507904, false, str$$e, new Class[]{Object.class, Object.class});
                    } else {
                        i9 = 2;
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                }
                objArr[0] = new String(cArr);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r29v0, types: [android.content.Context, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r29v1 */
            /* JADX WARN: Type inference failed for: r29v10 */
            /* JADX WARN: Type inference failed for: r29v11 */
            /* JADX WARN: Type inference failed for: r29v12 */
            /* JADX WARN: Type inference failed for: r29v2 */
            /* JADX WARN: Type inference failed for: r29v3 */
            /* JADX WARN: Type inference failed for: r29v4 */
            /* JADX WARN: Type inference failed for: r29v5 */
            /* JADX WARN: Type inference failed for: r29v6 */
            /* JADX WARN: Type inference failed for: r29v7 */
            /* JADX WARN: Type inference failed for: r29v9 */
            /* JADX WARN: Type inference failed for: r2v1 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r29, int r30, int r31, int r32) {
                /*
                    Method dump skipped, instruction units count: 2326
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, byte r7, short r8) {
                /*
                    byte[] r0 = com.google.android.gms.cloudmessaging.zzl.$$c
                    int r7 = r7 * 3
                    int r7 = 115 - r7
                    int r6 = r6 * 3
                    int r1 = r6 + 1
                    int r8 = r8 * 2
                    int r8 = r8 + 3
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r8
                    r4 = r2
                    r8 = r6
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L25:
                    r3 = r0[r8]
                    r5 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r5
                L2b:
                    int r7 = -r7
                    int r3 = r3 + 1
                    int r7 = r7 + r8
                    r8 = r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzl.$$e(byte, byte, short):java.lang.String");
            }
        });
    }

    final void zza(int i, String str) {
        synchronized (this) {
            zzb(i, str, null);
        }
    }

    final void zzb(int i, String str, Throwable th) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.zza;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.zza = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.zza = 4;
            ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
            zzt zztVar = new zzt(i, str, th);
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((zzs) it.next()).zzc(zztVar);
            }
            this.zzd.clear();
            for (int i3 = 0; i3 < this.zze.size(); i3++) {
                ((zzs) this.zze.valueAt(i3)).zzc(zztVar);
            }
            this.zze.clear();
        }
    }

    final void zzc() {
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                final zzs zzsVar;
                while (true) {
                    final zzp zzpVar = this.zza;
                    synchronized (zzpVar) {
                        if (zzpVar.zza != 2) {
                            return;
                        }
                        if (zzpVar.zzd.isEmpty()) {
                            zzpVar.zzf();
                            return;
                        } else {
                            zzsVar = (zzs) zzpVar.zzd.poll();
                            zzpVar.zze.put(zzsVar.zza, zzsVar);
                            zzpVar.zzf.zzc.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzpVar.zze(zzsVar.zza);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(String.valueOf(zzsVar))));
                    }
                    zzv zzvVar = zzpVar.zzf;
                    Messenger messenger = zzpVar.zzb;
                    int i = zzsVar.zzc;
                    Context context = zzvVar.zzb;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = zzsVar.zza;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzsVar.zzb());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, zzsVar.zzd);
                    messageObtain.setData(bundle);
                    try {
                        zzpVar.zzc.zza(messageObtain);
                    } catch (RemoteException e2) {
                        zzpVar.zza(2, e2.getMessage());
                    }
                }
            }
        });
    }

    final void zzd() {
        synchronized (this) {
            if (this.zza == 1) {
                zza(1, "Timed out while binding");
            }
        }
    }

    final void zze(int i) {
        synchronized (this) {
            zzs zzsVar = (zzs) this.zze.get(i);
            if (zzsVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                this.zze.remove(i);
                zzsVar.zzc(new zzt(3, "Timed out waiting for response", null));
                zzf();
            }
        }
    }

    final void zzf() {
        synchronized (this) {
            if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.zza = 3;
                ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
            }
        }
    }

    final boolean zzg(zzs zzsVar) {
        synchronized (this) {
            int i = this.zza;
            if (i != 0) {
                if (i == 1) {
                    this.zzd.add(zzsVar);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                this.zzd.add(zzsVar);
                zzc();
                return true;
            }
            this.zzd.add(zzsVar);
            Preconditions.checkState(this.zza == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.zza = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (ConnectionTracker.getInstance().bindService(this.zzf.zzb, intent, this, 1)) {
                    this.zzf.zzc.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                        private static short[] b;
                        private static final byte[] $$c = {83, -90, 68, -23};
                        private static final int $$f = 241;
                        private static int $10 = 0;
                        private static int $11 = 1;
                        private static final byte[] $$d = {117, 57, 101, -72, 20, 6, -55, 69, 12, 14, 6, -3, 9, 10, 1, 25, 7, 8, -11, -43, 59, 26, 14, -3, -3, -45, 27, 58, 14, -3, -3, -8, 26, 21, 12, -9, 21, -70, 25, -9, 25, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -58};
                        private static final int $$e = 153;
                        private static final byte[] $$a = {106, -66, 28, 119, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
                        private static final int $$b = 31;
                        private static int asInterface = 0;
                        private static int d = 1;
                        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1393154249;
                        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795577;
                        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1116107680;
                        private static byte[] TuitionPaymentFragmentbindingInflater1 = {11, 63, 14, -24, 93, 11, 48, 0, 57, -19, -20, 70, 15, -64, 73, 6, 57, 4, 21, Base64.padSymbol, 20, -83, -79, -82, -67, -72, -87, ByteCompanionObject.MIN_VALUE, -89, -76, -93, -80, -124, -82, -68, -114, -121, -66, -119, -97, -90, -116, -106, -66, -108, -68, -112, 97, -98, -59, -125, -110, 126, -55, -122, -71, -124, -107, -67, -108, -21, -14, -27, -57, -22, -18, -19, -20, -24, -37, Base64.padSymbol, -14, -15, -25, -24, -19, -58, 36, 77, 93, 82, 6, 57, 103, 85, 33, 73, 30, 97, 67, 41, 87, 55, 35, 26, 77, 35, 4, 15, 121, 51, Base64.padSymbol, 35, 48, 63, 55, 45, -26, -26, -26, -26, -26, -26};

                        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static void a(int r5, short r6, int r7, java.lang.Object[] r8) {
                            /*
                                int r6 = r6 * 52
                                int r6 = r6 + 4
                                int r0 = 53 - r7
                                byte[] r1 = com.google.android.gms.cloudmessaging.zzk.$$a
                                int r5 = r5 * 14
                                int r5 = r5 + 84
                                byte[] r0 = new byte[r0]
                                int r7 = 52 - r7
                                r2 = 0
                                if (r1 != 0) goto L16
                                r3 = r6
                                r4 = r2
                                goto L28
                            L16:
                                r3 = r2
                            L17:
                                byte r4 = (byte) r5
                                r0[r3] = r4
                                int r4 = r3 + 1
                                if (r3 != r7) goto L26
                                java.lang.String r5 = new java.lang.String
                                r5.<init>(r0, r2)
                                r8[r2] = r5
                                return
                            L26:
                                r3 = r1[r6]
                            L28:
                                int r6 = r6 + 1
                                int r3 = -r3
                                int r5 = r5 + r3
                                int r5 = r5 + (-10)
                                r3 = r4
                                goto L17
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzk.a(int, short, int, java.lang.Object[]):void");
                        }

                        private static void e(byte b2, short s, short s2, Object[] objArr) {
                            int i2 = (s2 * 15) + 84;
                            int i3 = 41 - (s * 37);
                            int i4 = b2 * 15;
                            byte[] bArr = $$d;
                            byte[] bArr2 = new byte[53 - i4];
                            int i5 = 52 - i4;
                            int i6 = -1;
                            if (bArr == null) {
                                i6 = -1;
                                i2 = (i2 + i3) - 8;
                                i3++;
                            }
                            while (true) {
                                int i7 = i6 + 1;
                                bArr2[i7] = (byte) i2;
                                if (i7 == i5) {
                                    objArr[0] = new String(bArr2, 0);
                                    return;
                                }
                                int i8 = i2;
                                int i9 = i3 + 1;
                                i6 = i7;
                                i2 = (i8 + bArr[i3]) - 8;
                                i3 = i9;
                            }
                        }

                        private static void c(int i2, int i3, short s, byte b2, int i4, Object[] objArr) throws Throwable {
                            long j;
                            boolean z;
                            int length;
                            byte[] bArr;
                            int i5 = 2 % 2;
                            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                            StringBuilder sb = new StringBuilder();
                            try {
                                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = (byte) (b3 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 2267 - ExpandableListView.getPackedPositionGroup(0L), Drawable.resolveOpacity(0, 0) + 33, 1387473586, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                int i6 = iIntValue == -1 ? 1 : 0;
                                if (i6 == 0) {
                                    j = 3046761265686732006L;
                                } else {
                                    byte[] bArr2 = TuitionPaymentFragmentbindingInflater1;
                                    if (bArr2 != null) {
                                        int i7 = $10 + 121;
                                        $11 = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            length = bArr2.length;
                                            bArr = new byte[length];
                                        } else {
                                            length = bArr2.length;
                                            bArr = new byte[length];
                                        }
                                        for (int i8 = 0; i8 < length; i8++) {
                                            Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                byte b5 = (byte) 0;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 3358, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), -1054011043, false, $$g(b5, (byte) (b5 - 1), (byte) $$c.length), new Class[]{Integer.TYPE});
                                            }
                                            bArr[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                        }
                                        bArr2 = bArr;
                                    }
                                    if (bArr2 != null) {
                                        byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                                        Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            byte b6 = (byte) 0;
                                            byte b7 = (byte) (b6 - 1);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2267, 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1387473586, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                        }
                                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                                        j = 3046761265686732006L;
                                    } else {
                                        j = 3046761265686732006L;
                                        iIntValue = (short) (((short) (((long) b[i4 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                                    }
                                }
                                if (iIntValue > 0) {
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i4 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ j)) + i6;
                                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b8 = (byte) 0;
                                        byte b9 = (byte) (b8 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 55904), 2856 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1529949196, false, $$g(b8, b9, (byte) (-b9)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                                    }
                                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                                    if (bArr4 != null) {
                                        int length2 = bArr4.length;
                                        byte[] bArr5 = new byte[length2];
                                        for (int i9 = 0; i9 < length2; i9++) {
                                            bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 3046761265686732006L);
                                        }
                                        bArr4 = bArr5;
                                    }
                                    if (bArr4 != null) {
                                        z = true;
                                    } else {
                                        int i10 = $11 + 115;
                                        $10 = i10 % 128;
                                        int i11 = i10 % 2;
                                        z = false;
                                    }
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                        if (z) {
                                            byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                                            int i12 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 - 1;
                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i12]) ^ 3046761265686732006L)) + s)) ^ b2));
                                        } else {
                                            short[] sArr = b;
                                            int i13 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 - 1;
                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i13]) ^ 3046761265686732006L)) + s)) ^ b2));
                                            int i14 = $10 + 53;
                                            $11 = i14 % 128;
                                            int i15 = i14 % 2;
                                        }
                                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                        int i16 = $10 + 55;
                                        $11 = i16 % 128;
                                        int i17 = i16 % 2;
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

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            Object[] objArr;
                            int i2 = 2 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int windowTouchSlop = 921 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                                byte[] bArr = $$a;
                                byte b2 = bArr[7];
                                byte b3 = bArr[80];
                                Object[] objArr2 = new Object[1];
                                a(b2, b3, (byte) (b3 | 52), objArr2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, windowTouchSlop, i3, -1048449946, false, (String) objArr2[0], null);
                            }
                            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                            Object[] objArr3 = new Object[1];
                            c((Process.myTid() >> 22) + 836030747, Gravity.getAbsoluteGravity(0, 0) - 11, (short) (27 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-542866385) - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
                            Class<?> cls = Class.forName((String) objArr3[0]);
                            Object[] objArr4 = new Object[1];
                            c(836030751 - TextUtils.indexOf("", "", 0, 0), (-18) - Drawable.resolveOpacity(0, 0), (short) (TextUtils.getOffsetAfter("", 0) - 83), (byte) (KeyEvent.getMaxKeyCode() >> 16), (-542866364) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
                            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char doubleTapTimeout = (char) (31533 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                                int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 28;
                                byte b4 = $$a[80];
                                byte b5 = b4;
                                Object[] objArr5 = new Object[1];
                                a(b4, b5, b5, objArr5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, keyRepeatTimeout, offsetAfter, -778300370, false, (String) objArr5[0], null);
                            }
                            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
                                    int maximumDrawingCacheSize = 921 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                    byte[] bArr2 = $$a;
                                    Object[] objArr6 = new Object[1];
                                    a(bArr2[80], bArr2[7], (byte) (-bArr2[33]), objArr6);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, maximumDrawingCacheSize, iIndexOf, -1142834547, false, (String) objArr6[0], null);
                                }
                                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                                int i4 = ~new Random().nextInt(437772843);
                                int i5 = (-1454354442) + (((~((-388143054) | i4)) | (-1385936591)) * (-933)) + (((~(i4 | (-1385936591))) | 1083777026) * 933) + 1974793856;
                                int i6 = (i5 << 13) ^ i5;
                                int i7 = i6 ^ (i6 >>> 17);
                                ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
                            } else {
                                Object[] objArr8 = new Object[1];
                                c((KeyEvent.getMaxKeyCode() >> 16) + 836030747, (ViewConfiguration.getJumpTapTimeout() >> 16) - 7, (short) (View.resolveSize(0, 0) - 101), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (-542866350) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr8);
                                Class<?> cls2 = Class.forName((String) objArr8[0]);
                                Object[] objArr9 = new Object[1];
                                c(836030748 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Process.getGidForName("") - 14, (short) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 14), (byte) Drawable.resolveOpacity(0, 0), View.MeasureSpec.getSize(0) - 542866325, objArr9);
                                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                                if (applicationContext != null) {
                                    int i8 = d + 91;
                                    asInterface = i8 % 128;
                                    int i9 = i8 % 2;
                                    applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                                }
                                Object[] objArr10 = new Object[1];
                                c((KeyEvent.getMaxKeyCode() >> 16) + 836030756, View.MeasureSpec.makeMeasureSpec(0, 0) - 17, (short) (TextUtils.indexOf("", "") + 70), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 542866308, objArr10);
                                Class<?> cls3 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                c(KeyEvent.getDeadChar(0, 0) + 836030755, (KeyEvent.getMaxKeyCode() >> 16) - 17, (short) (View.getDefaultSize(0, 0) + 48), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 542866294, objArr11);
                                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                                int i10 = asInterface + 57;
                                d = i10 % 128;
                                int i11 = i10 % 2;
                                try {
                                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 886693776};
                                    byte[] bArr3 = $$d;
                                    byte b6 = bArr3[14];
                                    byte b7 = b6;
                                    Object[] objArr13 = new Object[1];
                                    e(b6, b7, b7, objArr13);
                                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                                    byte b8 = bArr3[51];
                                    byte b9 = b8;
                                    Object[] objArr14 = new Object[1];
                                    e(b8, b9, b9, objArr14);
                                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
                                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 921;
                                        int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27;
                                        byte[] bArr4 = $$a;
                                        Object[] objArr16 = new Object[1];
                                        a(bArr4[80], bArr4[7], (byte) (-bArr4[33]), objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, maxKeyCode, i12, -1142834547, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                    try {
                                        Object[] objArr17 = new Object[1];
                                        c((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 836030746, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 11, (short) ((KeyEvent.getMaxKeyCode() >> 16) + 27), (byte) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) - 542866385, objArr17);
                                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                                        Object[] objArr18 = new Object[1];
                                        c(TextUtils.indexOf((CharSequence) "", '0', 0) + 836030752, View.MeasureSpec.makeMeasureSpec(0, 0) - 18, (short) (Color.red(0) - 83), (byte) TextUtils.indexOf("", ""), (-542866364) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr18);
                                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                        Long lValueOf = Long.valueOf(jLongValue2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char maxKeyCode2 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
                                            int iIndexOf2 = 921 - TextUtils.indexOf("", "");
                                            int gidForName = 27 - Process.getGidForName("");
                                            byte b10 = $$a[80];
                                            byte b11 = b10;
                                            Object[] objArr19 = new Object[1];
                                            a(b10, b11, b11, objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode2, iIndexOf2, gidForName, -778300370, false, (String) objArr19[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char cMyPid = (char) ((Process.myPid() >> 22) + 31533);
                                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                                            byte[] bArr5 = $$a;
                                            byte b12 = bArr5[7];
                                            byte b13 = bArr5[80];
                                            Object[] objArr20 = new Object[1];
                                            a(b12, b13, (byte) (b13 | 52), objArr20);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, edgeSlop, threadPriority, -1048449946, false, (String) objArr20[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                        objArr = objArr15;
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
                            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                                ArrayList arrayList = new ArrayList();
                                String[] strArr = (String[]) objArr[4];
                                if (strArr != null) {
                                    for (String str : strArr) {
                                        int i13 = asInterface + 85;
                                        d = i13 % 128;
                                        int i14 = i13 % 2;
                                        arrayList.add(str);
                                    }
                                }
                                throw null;
                            }
                            int i15 = ((int[]) objArr[0])[0];
                            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                            int iIdentityHashCode = System.identityHashCode(this);
                            int i16 = ~iIdentityHashCode;
                            int i17 = i15 + 203796725 + (((~((-831365588) | i16)) | (~((-942714057) | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | (-26018068))) | (~(i16 | (-137366537)))) * 210);
                            int i18 = (i17 << 13) ^ i17;
                            int i19 = i18 ^ (i18 >>> 17);
                            ((int[]) objArr21[0])[0] = i19 ^ (i19 << 5);
                            this.zza.zzd();
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
                        private static java.lang.String $$g(short r7, byte r8, int r9) {
                            /*
                                byte[] r0 = com.google.android.gms.cloudmessaging.zzk.$$c
                                int r9 = r9 + 117
                                int r7 = r7 * 4
                                int r7 = 1 - r7
                                int r8 = r8 + 4
                                byte[] r1 = new byte[r7]
                                r2 = 0
                                if (r0 != 0) goto L13
                                r3 = r7
                                r9 = r8
                                r4 = r2
                                goto L29
                            L13:
                                r3 = r2
                            L14:
                                int r4 = r3 + 1
                                int r8 = r8 + 1
                                byte r5 = (byte) r9
                                r1[r3] = r5
                                if (r4 != r7) goto L23
                                java.lang.String r7 = new java.lang.String
                                r7.<init>(r1, r2)
                                return r7
                            L23:
                                r3 = r0[r8]
                                r6 = r9
                                r9 = r8
                                r8 = r3
                                r3 = r6
                            L29:
                                int r8 = -r8
                                int r8 = r8 + r3
                                r3 = r4
                                r6 = r9
                                r9 = r8
                                r8 = r6
                                goto L14
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzk.$$g(short, byte, int):java.lang.String");
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    zza(0, "Unable to bind to service");
                }
            } catch (SecurityException e2) {
                zzb(0, "Unable to bind to service", e2);
            }
            return true;
        }
    }
}
