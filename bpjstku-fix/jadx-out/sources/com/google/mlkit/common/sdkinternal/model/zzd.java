package com.google.mlkit.common.sdkinternal.model;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.mlkit_common.zziy;
import com.google.android.gms.internal.mlkit_common.zzje;
import com.google.android.gms.internal.mlkit_common.zzmh;
import com.google.android.gms.internal.mlkit_common.zzmq;
import com.google.android.gms.internal.mlkit_common.zzmr;
import com.google.android.gms.internal.mlkit_common.zzms;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import defpackage.EncoderImplByteBufferInput;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
final class zzd extends BroadcastReceiver {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int[] b;
    final /* synthetic */ RemoteModelDownloadManager zza;
    private final long zzb;
    private final TaskCompletionSource zzc;
    private static final byte[] $$c = {29, -5, -24, -13};
    private static final int $$f = 125;
    private static int $10 = 0;
    private static int $11 = 1;

    /* synthetic */ zzd(RemoteModelDownloadManager remoteModelDownloadManager, long j, TaskCompletionSource taskCompletionSource, zzc zzcVar) {
        this.zza = remoteModelDownloadManager;
        this.zzb = j;
        this.zzc = taskCompletionSource;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r5 + 1
            int r6 = 103 - r6
            byte[] r1 = com.google.mlkit.common.sdkinternal.model.zzd.$$a
            int r7 = 214 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r3 = r5
            r6 = r7
            r4 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            r3 = r1[r7]
        L23:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.zzd.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 105 - r8
            int r0 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = com.google.mlkit.common.sdkinternal.model.zzd.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L11:
            r3 = r2
        L12:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.zzd.d(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:531:0x3361  */
    /* JADX WARN: Code duplicated, block: B:532:0x3362  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Object[] objArr;
        Throwable cause;
        Object[] objArr2;
        Context applicationContext;
        Object[] objArr3;
        Object[] objArr4;
        int i;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        int i2;
        Object[] objArr9;
        int i3;
        Object[] objArr10;
        int i4;
        Object[] objArr11;
        Object[] objArr12;
        Object[] objArr13;
        int i5;
        Object[] objArr14;
        Object[] objArr15;
        int i6;
        Object[] objArr16;
        Object[] objArr17;
        Object[] objArr18;
        char c;
        Object[] objArr19 = new Object[1];
        a(new int[]{1459073986, 634551905, -837181138, -1291644760, 164759168, 1864994853, 1220874995, 934464172, 1358473100, -21799872, -953143512, -1601947335, 1415197521, -139422129}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, objArr19);
        String str = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(new int[]{790034593, 1027824859, 311654751, -773232903, 659550934, -961055277, 415272431, -1341793091, -2139244384, -1223266621}, ((byte) KeyEvent.getModifierMetaStateMask()) + 16, objArr20);
        String str2 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        a(new int[]{523098473, 6285873, -318705010, -654766199, 1829784335, 134279576, 836577151, -2140218105, 335968938, -915033071}, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr21);
        String str3 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        a(new int[]{-2143580034, -581823672, 1773533633, -1813110399, -1156695206, 212959299, 2145519838, 856575925, 550391015, 1042376399}, (ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr22);
        String str4 = (String) objArr22[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 53893);
            int maxKeyCode = 1320 - (KeyEvent.getMaxKeyCode() >> 16);
            int i7 = 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte b2 = $$a[7];
            Object[] objArr23 = new Object[1];
            c(b2, (byte) (b2 + 5), (short) 210, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, maxKeyCode, i7, -1433084963, false, (String) objArr23[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char minimumFlingVelocity = (char) (53893 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int i8 = 1320 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int packedPositionChild = 35 - ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr24 = new Object[1];
                c((byte) 52, $$a[54], (short) 210, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, i8, packedPositionChild, -1920778747, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i9 = ((int[]) objArr25[0])[0];
            int i10 = ((int[]) objArr25[3])[0];
            String[] strArr = (String[]) objArr25[2];
            int i11 = ~((int) Runtime.getRuntime().freeMemory());
            int i12 = (-1723334757) + ((~((-596129) | i11)) * (-783)) + (((~(i11 | 1336182348)) | (-34445477)) * 783) + 959817882;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[1])[0] = i14 ^ (i14 << 5);
        } else {
            Context applicationContext2 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            int iIntValue = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr26 = {-1566164747};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (47977 - TextUtils.getTrimmedLength("")), Process.getGidForName("") + 1301, (ViewConfiguration.getScrollBarSize() >> 8) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr27 = {applicationContext2, "com.bpjstku", 959817882, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr26), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    try {
                        char cArgb2 = (char) (Color.argb(0, 0, 0, 0) + 53893);
                        int iArgb = 1320 - Color.argb(0, 0, 0, 0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 36;
                        Object[] objArr28 = new Object[1];
                        c((byte) 52, $$a[54], (short) 210, objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb2, iArgb, iMakeMeasureSpec, 819724799, false, (String) objArr28[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getScrollBarSize() >> 8)), View.MeasureSpec.getSize(0) + 1394, Color.blue(0) + 75), Boolean.TYPE});
                    } catch (Throwable th) {
                        th = th;
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                Object[] objArr29 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr27);
                if (applicationContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 53893);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1321;
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36;
                        Object[] objArr30 = new Object[1];
                        c((byte) 52, $$a[54], (short) 210, objArr30);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, bitsPerPixel, maximumFlingVelocity, -1920778747, false, (String) objArr30[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr29);
                    try {
                        long jLongValue = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char bitsPerPixel2 = (char) (53892 - ImageFormat.getBitsPerPixel(0));
                            int i15 = 1321 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                            Object[] objArr31 = new Object[1];
                            c((byte) 37, $$a[54], (short) ($$b | 148), objArr31);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel2, i15, jumpTapTimeout, -1273706634, false, (String) objArr31[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char scrollBarFadeDuration = (char) (53893 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int iArgb2 = 1320 - Color.argb(0, 0, 0, 0);
                            int i16 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36;
                            byte b3 = $$a[7];
                            Object[] objArr32 = new Object[1];
                            c(b3, (byte) (b3 + 5), (short) 210, objArr32);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarFadeDuration, iArgb2, i16, -1433084963, false, (String) objArr32[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr29 = objArr29;
                }
                objArr = objArr29;
            } catch (Throwable th2) {
                th = th2;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[3])[0]) {
            throw null;
        }
        Object[] objArr33 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[3])[0];
        String[] strArr2 = (String[]) objArr[2];
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i20 = ~startElapsedRealtime;
        int i21 = (-1979694720) + (((~((-671229698) | i20)) | (~(698611553 | startElapsedRealtime))) * 520);
        int i22 = ~((-698611554) | i20);
        int i23 = ~(startElapsedRealtime | 672016271);
        int i24 = i17 + i21 + ((i22 | i23) * (-1040)) + ((i23 | (~(i20 | (-672016272))) | 27381856) * 520);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr33[1])[0] = i26 ^ (i26 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 16;
            Object[] objArr34 = new Object[1];
            c((byte) 52, $$a[54], (short) 121, objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(threadPriority, iResolveOpacity, iLastIndexOf, 1357589585, false, (String) objArr34[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int iRgb = (-16776185) - Color.rgb(0, 0, 0);
            int edgeSlop = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
            Object[] objArr35 = new Object[1];
            c((byte) 52, $$a[54], (short) 210, objArr35);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionChild2, iRgb, edgeSlop, 1344079056, false, (String) objArr35[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int i27 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
                int i28 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                byte b4 = $$a[7];
                Object[] objArr36 = new Object[1];
                c(b4, (byte) (b4 + 5), (short) 210, objArr36);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cMyPid, i27, i28, 632103528, false, (String) objArr36[0], null);
            }
            Object[] objArr37 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr37[3])[0];
            int i30 = ((int[]) objArr37[1])[0];
            String[] strArr3 = (String[]) objArr37[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i31 = ((((~(iIdentityHashCode | 331703261)) | (-87423092)) * 56) - 191978239) + (((~((~iIdentityHashCode) | (-87423092))) | 331703261) * 56) + 2139633997;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr2[2])[0] = i33 ^ (i33 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr38 = {-1566164747};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - TextUtils.indexOf("", "", 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1135, TextUtils.indexOf("", "", 0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr39 = {Integer.valueOf(iIntValue2), 0, 2139633997, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr38), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int i34 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 15;
                Object[] objArr40 = new Object[1];
                c((byte) 52, $$a[54], (short) 121, objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(capsMode, i34, offsetAfter, 1298546779, false, (String) objArr40[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1116, 17 - View.combineMeasuredStates(0, 0)), Boolean.TYPE});
            }
            Object[] objArr41 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr39);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 1031;
                int i35 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                byte b5 = $$a[7];
                Object[] objArr42 = new Object[1];
                c(b5, (byte) (b5 + 5), (short) 210, objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(trimmedLength, capsMode2, i35, 632103528, false, (String) objArr42[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr41);
            try {
                long jLongValue3 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cArgb3 = (char) Color.argb(0, 0, 0, 0);
                    int mode = 1031 - View.MeasureSpec.getMode(0);
                    int defaultSize = 15 - View.getDefaultSize(0, 0);
                    Object[] objArr43 = new Object[1];
                    c((byte) 52, $$a[54], (short) 210, objArr43);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cArgb3, mode, defaultSize, 1344079056, false, (String) objArr43[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cMyPid2 = (char) (Process.myPid() >> 22);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 16;
                    Object[] objArr44 = new Object[1];
                    c((byte) 52, $$a[54], (short) 121, objArr44);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cMyPid2, iIndexOf, iLastIndexOf2, 1357589585, false, (String) objArr44[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                objArr2 = objArr41;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArr2[1])[0];
        int i37 = ((int[]) objArr2[3])[0];
        if (i37 != i36) {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr2[0];
            if (strArr4 != null) {
                for (String str5 : strArr4) {
                    arrayList.add(str5);
                }
            }
            throw new RuntimeException(String.valueOf(i37));
        }
        Object[] objArr45 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i38 = ((int[]) objArr2[2])[0];
        int i39 = ((int[]) objArr2[3])[0];
        int i40 = ((int[]) objArr2[1])[0];
        String[] strArr5 = (String[]) objArr2[0];
        int i41 = ~(((int) Process.getStartElapsedRealtime()) | 44050496);
        int i42 = i38 + ((156199785 | i41) * (-658)) + 251060201 + ((i41 | 156189481) * 658);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr45[2])[0] = i44 ^ (i44 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int iIndexOf2 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
            Object[] objArr46 = new Object[1];
            c((byte) 37, $$a[54], (short) ($$b | 148), objArr46);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(deadChar, iIndexOf2, pressedStateDuration, -1650998592, false, (String) objArr46[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
            Object[] objArr47 = new Object[1];
            c((byte) 52, $$a[54], (short) 210, objArr47);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(windowTouchSlop, keyRepeatTimeout, iMakeMeasureSpec2, 2012020043, false, (String) objArr47[0], null);
        }
        if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                int i45 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                int maximumFlingVelocity2 = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                Object[] objArr48 = new Object[1];
                c((byte) 52, $$a[54], (short) 121, objArr48);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cIndexOf2, i45, maximumFlingVelocity2, 2012931276, false, (String) objArr48[0], null);
            }
            Object[] objArr49 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr49[0])[0]}, new int[1], new int[]{((int[]) objArr49[2])[0]}, (String[]) objArr49[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i46 = ~iIdentityHashCode2;
            int i47 = 2070192700 + (((~(776014554 | i46)) | (~((-816324784) | iIdentityHashCode2))) * (-370)) + (((~(iIdentityHashCode2 | 776014554)) | (~(i46 | (-816324784))) | 239143504) * (-370)) + 1569927766;
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr3[1])[0] = i49 ^ (i49 << 5);
            applicationContext = context;
        } else {
            applicationContext = context;
            Context applicationContext3 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
            try {
                Object[] objArr50 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, -1013822794};
                byte[] bArr = $$d;
                short s = bArr[5];
                Object[] objArr51 = new Object[1];
                d(s, (byte) (s & 74), bArr[11], objArr51);
                Class<?> cls = Class.forName((String) objArr51[0]);
                Object[] objArr52 = new Object[1];
                d((short) 73, bArr[14], bArr[126], objArr52);
                Object[] objArr53 = (Object[]) cls.getMethod((String) objArr52[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr50);
                if (applicationContext3 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                        char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i50 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                        int i51 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                        Object[] objArr54 = new Object[1];
                        c((byte) 52, $$a[54], (short) 121, objArr54);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(maximumFlingVelocity3, i50, i51, 2012931276, false, (String) objArr54[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr53);
                    try {
                        long jLongValue5 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue5);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                            char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int mirror = 924 - AndroidCharacter.getMirror('0');
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 10;
                            Object[] objArr55 = new Object[1];
                            c((byte) 52, $$a[54], (short) 210, objArr55);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cIndexOf3, mirror, iResolveSizeAndState, 2012020043, false, (String) objArr55[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                            char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i52 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 875;
                            int iMyTid = (Process.myTid() >> 22) + 10;
                            Object[] objArr56 = new Object[1];
                            c((byte) 37, $$a[54], (short) ($$b | 148), objArr56);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c2, i52, iMyTid, -1650998592, false, (String) objArr56[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf6);
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr53 = objArr53;
                }
                objArr3 = objArr53;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        }
        int i53 = ((int[]) objArr3[2])[0];
        int i54 = ((int[]) objArr3[0])[0];
        if (i54 == i53) {
            int i55 = ((int[]) objArr3[1])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int i56 = ~((int) Process.getStartUptimeMillis());
            int i57 = ~(886686227 | i56);
            int i58 = i55 + (-658874736) + ((i57 | (-846375999)) * 764) + (((~(i56 | (-846375999))) | 810582034) * (-1528)) + (((-111898158) | i57) * 764);
            int i59 = (i58 << 13) ^ i58;
            int i60 = i59 ^ (i59 >>> 17);
            ((int[]) objArr4[1])[0] = i60 ^ (i60 << 5);
            i = 0;
        } else {
            int[] iArr = new int[i54];
            int i61 = i54 - 1;
            iArr[i61] = 1;
            Toast.makeText((Context) null, iArr[((i54 * i61) % 2) - 1], 1).show();
            int i62 = ((int[]) objArr3[1])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iMyPid = Process.myPid();
            int i63 = i62 + (((1091747212 + (((~(812912674 | iMyPid)) | (-853222904)) * (-948))) + ((~((~iMyPid) | (-42673622))) * (-948))) - 653011284);
            int i64 = (i63 << 13) ^ i63;
            int i65 = i64 ^ (i64 >>> 17);
            i = 0;
            ((int[]) objArr4[1])[0] = i65 ^ (i65 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int i66 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
            int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(i);
            Object[] objArr57 = new Object[1];
            c((byte) $$b, $$a[51], (short) 69, objArr57);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(packedPositionGroup, i66, iNormalizeMetaState, -1199417970, false, (String) objArr57[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
            char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 876;
            int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr2 = $$a;
            byte b6 = bArr2[7];
            byte b7 = bArr2[14];
            Object[] objArr58 = new Object[1];
            c(b6, b7, (short) (b7 | 56), objArr58);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(offsetAfter2, packedPositionGroup2, keyRepeatDelay, 254769921, false, (String) objArr58[0], null);
        }
        if (j3 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 876;
                int deadChar2 = 10 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr3 = $$a;
                Object[] objArr59 = new Object[1];
                c(bArr3[41], bArr3[51], (short) ($$b | 49), objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c3, iResolveSizeAndState2, deadChar2, 1324201839, false, (String) objArr59[0], null);
            }
            Object[] objArr60 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).get(null);
            objArr5 = new Object[]{new int[]{((int[]) objArr60[0])[0]}, new int[1], new int[]{((int[]) objArr60[2])[0]}, (String[]) objArr60[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i67 = ~iUptimeMillis;
            int i68 = 327917211 + (((~(455999200 | i67)) | (-532545270)) * 98) + (((~(i67 | (-496309430))) | 455999200 | (~(496309429 | iUptimeMillis))) * (-49)) + (((~(iUptimeMillis | 455999200)) | 36235840) * 49) + 183062362;
            int i69 = (i68 << 13) ^ i68;
            int i70 = i69 ^ (i69 >>> 17);
            ((int[]) objArr5[1])[0] = i70 ^ (i70 << 5);
        } else {
            Object[] objArr61 = {Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 183062362};
            short s2 = (short) ($$e | 17);
            byte[] bArr4 = $$d;
            Object[] objArr62 = new Object[1];
            d(s2, bArr4[141], bArr4[11], objArr62);
            Class<?> cls2 = Class.forName((String) objArr62[0]);
            Object[] objArr63 = new Object[1];
            d((short) 180, bArr4[14], bArr4[126], objArr63);
            objArr5 = (Object[]) cls2.getMethod((String) objArr63[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr61);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char maximumFlingVelocity4 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int maximumFlingVelocity5 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                int edgeSlop2 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte[] bArr5 = $$a;
                Object[] objArr64 = new Object[1];
                c(bArr5[41], bArr5[51], (short) ($$b | 49), objArr64);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(maximumFlingVelocity4, maximumFlingVelocity5, edgeSlop2, 1324201839, false, (String) objArr64[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, objArr5);
            try {
                long jLongValue7 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iAlpha = 876 - Color.alpha(0);
                    int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 10;
                    byte[] bArr6 = $$a;
                    byte b8 = bArr6[7];
                    byte b9 = bArr6[14];
                    Object[] objArr65 = new Object[1];
                    c(b8, b9, (short) (b9 | 56), objArr65);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(minimumFlingVelocity2, iAlpha, offsetAfter3, 254769921, false, (String) objArr65[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue7 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                    int iIndexOf3 = 10 - TextUtils.indexOf("", "");
                    Object[] objArr66 = new Object[1];
                    c((byte) $$b, $$a[51], (short) 69, objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(doubleTapTimeout, threadPriority2, iIndexOf3, -1199417970, false, (String) objArr66[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf8);
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i71 = ((int[]) objArr5[2])[0];
        int i72 = ((int[]) objArr5[0])[0];
        if (i72 == i71) {
            int i73 = ((int[]) objArr5[1])[0];
            objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i74 = ~((-837777084) | iIdentityHashCode3);
            int i75 = 1341194860 + ((562585762 | i74) * (-280)) + ((i74 | (~(797466854 | iIdentityHashCode3))) * 140);
            int i76 = ~((-275191322) | iIdentityHashCode3);
            int i77 = ~iIdentityHashCode3;
            int i78 = i73 + i75 + (((~(i77 | 1072658175)) | i76 | (~((-562585763) | i77))) * 140);
            int i79 = (i78 << 13) ^ i78;
            int i80 = i79 ^ (i79 >>> 17);
            ((int[]) objArr6[1])[0] = i80 ^ (i80 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr6 = (String[]) objArr5[3];
            if (strArr6 != null) {
                for (String str6 : strArr6) {
                    arrayList2.add(str6);
                }
            }
            Toast.makeText((Context) null, i72 / (((i72 - 1) * i72) % 2), 0).show();
            int i81 = ((int[]) objArr5[1])[0];
            objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i82 = i81 + (-1063758740) + (((~((~iUptimeMillis2) | (-553713941))) | (~((-234942540) | iUptimeMillis2))) * (-302)) + ((~((-553713941) | iUptimeMillis2)) * (-604)) + (((~(iUptimeMillis2 | (-788656480))) | (-1063909248)) * 302);
            int i83 = i82 ^ (i82 << 13);
            int i84 = i83 ^ (i83 >>> 17);
            ((int[]) objArr6[1])[0] = i84 ^ (i84 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
            char mirror2 = (char) ('0' - AndroidCharacter.getMirror('0'));
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
            int iGreen = Color.green(0) + 10;
            byte b10 = $$a[7];
            Object[] objArr67 = new Object[1];
            c(b10, (byte) (b10 + 5), (short) 210, objArr67);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(mirror2, scrollDefaultDelay, iGreen, 252381699, false, (String) objArr67[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int iCombineMeasuredStates = 876 - View.combineMeasuredStates(0, 0);
            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 10;
            Object[] objArr68 = new Object[1];
            c((byte) 52, $$a[54], (short) 52, objArr68);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cAxisFromString, iCombineMeasuredStates, iNormalizeMetaState2, 2009631821, false, (String) objArr68[0], null);
        }
        if (j4 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                int maximumDrawingCacheSize = 876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iRgb2 = Color.rgb(0, 0, 0) + 16777226;
                byte b11 = $$a[7];
                byte b12 = b11;
                Object[] objArr69 = new Object[1];
                c(b11, b12, b12, objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cIndexOf4, maximumDrawingCacheSize, iRgb2, 256017550, false, (String) objArr69[0], null);
            }
            Object[] objArr70 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr70[0])[0]}, new int[1], new int[]{((int[]) objArr70[2])[0]}, (String[]) objArr70[3]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i85 = ~((-467750249) | iIdentityHashCode4);
            int i86 = 812896164 + ((425723136 | i85) * (-280)) + ((i85 | (~(427440019 | iIdentityHashCode4))) * 140);
            int i87 = ~((-42027113) | iIdentityHashCode4);
            int i88 = ~iIdentityHashCode4;
            int i89 = i86 + (((~(i88 | 469467131)) | i87 | (~((-425723137) | i88))) * 140) + 456024446;
            int i90 = (i89 << 13) ^ i89;
            int i91 = i90 ^ (i90 >>> 17);
            ((int[]) objArr7[1])[0] = i91 ^ (i91 << 5);
        } else {
            Context applicationContext4 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
            Object[] objArr71 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 456024446};
            byte[] bArr7 = $$d;
            Object[] objArr72 = new Object[1];
            d((short) 232, bArr7[133], bArr7[11], objArr72);
            Class<?> cls3 = Class.forName((String) objArr72[0]);
            Object[] objArr73 = new Object[1];
            d((short) 285, bArr7[374], bArr7[126], objArr73);
            objArr7 = (Object[]) cls3.getMethod((String) objArr73[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr71);
            if (applicationContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                    byte b13 = $$a[7];
                    byte b14 = b13;
                    Object[] objArr74 = new Object[1];
                    c(b13, b14, b14, objArr74);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cResolveOpacity, iMakeMeasureSpec3, modifierMetaStateMask, 256017550, false, (String) objArr74[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr7);
                try {
                    long jLongValue9 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                        char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 876;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                        Object[] objArr75 = new Object[1];
                        c((byte) 52, $$a[54], (short) 52, objArr75);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(bitsPerPixel3, iNormalizeMetaState3, longPressTimeout, 2009631821, false, (String) objArr75[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                        int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 877;
                        int iArgb3 = 10 - Color.argb(0, 0, 0, 0);
                        byte b15 = $$a[7];
                        Object[] objArr76 = new Object[1];
                        c(b15, (byte) (b15 + 5), (short) 210, objArr76);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c4, packedPositionChild3, iArgb3, 252381699, false, (String) objArr76[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            }
        }
        int i92 = ((int[]) objArr7[2])[0];
        int i93 = ((int[]) objArr7[0])[0];
        if (i93 == i92) {
            int i94 = ((int[]) objArr7[1])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
            int i95 = ~iUptimeMillis3;
            int i96 = ~(106358776 | i95);
            int i97 = i94 + 1840347124 + (((-134215676) | i96) * (-712)) + (((~(iUptimeMillis3 | (-27856900))) | (~(i95 | 134215675))) * (-712)) + ((66048547 | i96) * 712);
            int i98 = (i97 << 13) ^ i97;
            int i99 = i98 ^ (i98 >>> 17);
            ((int[]) objArr8[1])[0] = i99 ^ (i99 << 5);
            i2 = 0;
        } else {
            int[] iArr2 = new int[i93];
            int i100 = i93 - 1;
            iArr2[i100] = 1;
            Toast.makeText((Context) null, iArr2[((i93 * i100) % 2) - 1], 1).show();
            int i101 = ((int[]) objArr7[1])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i102 = i101 + (-1714736048) + (((~(iMaxMemory | 708149731)) | 667839502) * (-668)) + ((708149731 | (~(667839502 | iMaxMemory))) * 1336) + ((iMaxMemory | 805301743) * 668);
            int i103 = (i102 << 13) ^ i102;
            int i104 = i103 ^ (i103 >>> 17);
            i2 = 0;
            ((int[]) objArr8[1])[0] = i104 ^ (i104 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
            char defaultSize2 = (char) View.getDefaultSize(i2, i2);
            int i105 = 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iResolveOpacity2 = 44 - Drawable.resolveOpacity(i2, i2);
            Object[] objArr77 = new Object[1];
            c((byte) 52, $$a[54], (short) 52, objArr77);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(defaultSize2, i105, iResolveOpacity2, -459846511, false, (String) objArr77[i2], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char gidForName = (char) ((-1) - Process.getGidForName(""));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 651;
            int scrollBarSize2 = 44 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b16 = $$a[7];
            Object[] objArr78 = new Object[1];
            c(b16, (byte) (b16 + 5), (short) 210, objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(gidForName, scrollBarSize, scrollBarSize2, -873460649, false, (String) objArr78[0], null);
        }
        if (j5 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char cGreen = (char) Color.green(0);
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 651;
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 44;
                Object[] objArr79 = new Object[1];
                c((byte) 37, $$a[54], (short) ($$b | 148), objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cGreen, longPressTimeout2, iKeyCodeFromString, -1595579076, false, (String) objArr79[0], null);
            }
            Object[] objArr80 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
            objArr9 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i106 = ((int[]) objArr80[2])[0];
            int i107 = ((int[]) objArr80[0])[0];
            int iMyPid2 = Process.myPid();
            int i108 = ~iMyPid2;
            int i109 = (((((~(201308095 | i108)) | (~((-14788369) | iMyPid2))) * 988) - 1219350335) + ((((~(iMyPid2 | 183088917)) | R.^attr-private.allowMassStorage) | (~(i108 | (-14788369)))) * 988)) - 1798350793;
            int i110 = (i109 << 13) ^ i109;
            int i111 = i110 ^ (i110 >>> 17);
            ((int[]) objArr9[3])[0] = i111 ^ (i111 << 5);
            i3 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1610, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr81 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).newInstance(null), -1798350793, r7};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char cGreen2 = (char) Color.green(0);
                int i112 = 652 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                byte b17 = $$a[7];
                Object[] objArr82 = new Object[1];
                c(b17, (byte) (b17 + 5), (short) 210, objArr82);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cGreen2, i112, doubleTapTimeout2, 2075921419, false, (String) objArr82[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 696 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (MotionEvent.axisFromString("") + 63407), 793 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-16777133) - Color.rgb(0, 0, 0)), Integer.TYPE, Integer.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).invoke(null, objArr81);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int iNormalizeMetaState4 = 651 - KeyEvent.normalizeMetaState(0);
                int iMyTid2 = (Process.myTid() >> 22) + 44;
                Object[] objArr83 = new Object[1];
                c((byte) 37, $$a[54], (short) ($$b | 148), objArr83);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(threadPriority3, iNormalizeMetaState4, iMyTid2, -1595579076, false, (String) objArr83[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, objArr9);
            try {
                long jLongValue11 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 651;
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 44;
                    byte b18 = $$a[7];
                    Object[] objArr84 = new Object[1];
                    c(b18, (byte) (b18 + 5), (short) 210, objArr84);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(windowTouchSlop2, packedPositionType, packedPositionType2, -873460649, false, (String) objArr84[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue11 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char cRed = (char) Color.red(0);
                    int modifierMetaStateMask2 = 650 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
                    Object[] objArr85 = new Object[1];
                    c((byte) 52, $$a[54], (short) 52, objArr85);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cRed, modifierMetaStateMask2, modifierMetaStateMask3, -459846511, false, (String) objArr85[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf12);
                i3 = 0;
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i113 = ((int[]) objArr9[i3])[i3];
        int i114 = ((int[]) objArr9[2])[i3];
        if (i114 == i113) {
            objArr10 = new Object[4];
            int[] iArr3 = new int[1];
            objArr10[i3] = iArr3;
            int[] iArr4 = new int[1];
            objArr10[2] = iArr4;
            objArr10[3] = new int[1];
            int i115 = ((int[]) objArr9[3])[i3];
            int i116 = ((int[]) objArr9[2])[i3];
            int i117 = ((int[]) objArr9[i3])[i3];
            iArr4[i3] = i116;
            iArr3[i3] = i117;
            objArr10[1] = new String[i3];
            int iUptimeMillis4 = (int) SystemClock.uptimeMillis();
            int i118 = i115 + (-103924145) + (((~((-5529643) | iUptimeMillis4)) | (~((~iUptimeMillis4) | (-2098833)))) * (-318)) + (((~(332785770 | iUptimeMillis4)) | (-334884603)) * (-318)) + (((~(iUptimeMillis4 | (-332785771))) | 329354960) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i119 = (i118 << 13) ^ i118;
            int i120 = i119 ^ (i119 >>> 17);
            i4 = 0;
            ((int[]) objArr10[3])[0] = i120 ^ (i120 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr7 = (String[]) objArr9[1];
            if (strArr7 != null) {
                for (String str7 : strArr7) {
                    arrayList3.add(str7);
                }
            }
            Toast.makeText((Context) null, i114 / (((i114 - 1) * i114) % 2), 0).show();
            objArr10 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i121 = ((int[]) objArr9[3])[0];
            int i122 = ((int[]) objArr9[2])[0];
            int i123 = ((int[]) objArr9[0])[0];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i124 = ~iIdentityHashCode5;
            int i125 = i121 + 287224089 + (((~((-330183182) | i124)) | (~(iIdentityHashCode5 | (-326752372)))) * 333) + (((~(iIdentityHashCode5 | (-330183182))) | (~(i124 | (-326752372)))) * 333);
            int i126 = i125 ^ (i125 << 13);
            int i127 = i126 ^ (i126 >>> 17);
            i4 = 0;
            ((int[]) objArr10[3])[0] = i127 ^ (i127 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
            char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', i4, i4));
            int iNormalizeMetaState5 = KeyEvent.normalizeMetaState(i4) + 1755;
            int bitsPerPixel4 = 22 - ImageFormat.getBitsPerPixel(i4);
            Object[] objArr86 = new Object[1];
            c((byte) 37, $$a[54], (short) ($$b | 148), objArr86);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cLastIndexOf, iNormalizeMetaState5, bitsPerPixel4, 986134021, false, (String) objArr86[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char pressedStateDuration2 = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int jumpTapTimeout2 = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i128 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                Object[] objArr87 = new Object[1];
                c((byte) 52, $$a[54], (short) 210, objArr87);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(pressedStateDuration2, jumpTapTimeout2, i128, 1599039318, false, (String) objArr87[0], null);
            }
            Object[] objArr88 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr88[0])[0]}, new int[]{((int[]) objArr88[1])[0]}, (Object[]) objArr88[2], new int[1], (String[]) objArr88[4]};
            int iMyTid3 = Process.myTid();
            int i129 = (-1742989114) + ((~((~iMyTid3) | (-54710277))) * 433) + (((~((-79245292) | iMyTid3)) | (-133357135)) * (-433)) + (((~(iMyTid3 | (-133357135))) | (-133955568)) * 433) + 1943325417;
            int i130 = (i129 << 13) ^ i129;
            int i131 = i130 ^ (i130 >>> 17);
            ((int[]) objArr11[3])[0] = i131 ^ (i131 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr89 = {-1566164747};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b((char) (MotionEvent.axisFromString("") + 42050), Process.getGidForName("") + 1727, 29 - TextUtils.indexOf("", "", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue3, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).newInstance(objArr89), 1943325417, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                int offsetAfter4 = 1755 - TextUtils.getOffsetAfter("", 0);
                int i132 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
                Object[] objArr90 = new Object[1];
                c((byte) 52, $$a[54], (short) 210, objArr90);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cNormalizeMetaState, offsetAfter4, i132, 1599039318, false, (String) objArr90[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                long jLongValue12 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char offsetAfter5 = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                    int size = View.MeasureSpec.getSize(0) + 1755;
                    int trimmedLength2 = 23 - TextUtils.getTrimmedLength("");
                    Object[] objArr91 = new Object[1];
                    c((byte) 52, $$a[54], (short) 52, objArr91);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(offsetAfter5, size, trimmedLength2, 1596667560, false, (String) objArr91[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char minimumFlingVelocity3 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                    int scrollDefaultDelay2 = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int mode2 = 23 - View.MeasureSpec.getMode(0);
                    Object[] objArr92 = new Object[1];
                    c((byte) 37, $$a[54], (short) ($$b | 148), objArr92);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(minimumFlingVelocity3, scrollDefaultDelay2, mode2, 986134021, false, (String) objArr92[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf14);
                objArr11 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i133 = ((int[]) objArr11[1])[0];
        int i134 = ((int[]) objArr11[0])[0];
        if (i134 != i133) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr8 = (String[]) objArr11[4];
            if (strArr8 != null) {
                for (String str8 : strArr8) {
                    arrayList4.add(str8);
                }
            }
            throw new RuntimeException(String.valueOf(i134));
        }
        int i135 = ((int[]) objArr11[3])[0];
        Object[] objArr93 = {new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
        int iNextInt = new Random().nextInt();
        int i136 = i135 + (((80553629 + (((~((-33742668) | iNextInt)) | (-178859759)) * (-948))) + ((~((~iNextInt) | (-33558091))) * (-948))) - 174979944);
        int i137 = (i136 << 13) ^ i136;
        int i138 = i137 ^ (i137 >>> 17);
        ((int[]) objArr93[3])[0] = i138 ^ (i138 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
            char cArgb4 = (char) (Color.argb(0, 0, 0, 0) + 43042);
            int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 3112;
            int minimumFlingVelocity4 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
            Object[] objArr94 = new Object[1];
            c((byte) 52, $$a[54], (short) 121, objArr94);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cArgb4, iIndexOf4, minimumFlingVelocity4, -1272852037, false, (String) objArr94[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char keyRepeatDelay2 = (char) (43042 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3112;
                int defaultSize3 = View.getDefaultSize(0, 0) + 22;
                Object[] objArr95 = new Object[1];
                c((byte) 37, $$a[54], (short) ($$b | 148), objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(keyRepeatDelay2, iIndexOf5, defaultSize3, 154975793, false, (String) objArr95[0], null);
            }
            Object[] objArr96 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).get(null);
            int i139 = ((int[]) objArr96[2])[0];
            int i140 = ((int[]) objArr96[1])[0];
            String[] strArr9 = (String[]) objArr96[3];
            int[] iArr5 = {i140};
            int iUptimeMillis5 = (int) SystemClock.uptimeMillis();
            int i141 = ~iUptimeMillis5;
            int i142 = ((((-410238350) + (((~(iUptimeMillis5 | 994391751)) | ((~((-708902980) | i141)) | (-996128480))) * (-68))) + ((~((-1736729) | i141)) * (-68))) + (((~((-994391752) | i141)) | (-710639708)) * 68)) - 2121468783;
            int i143 = (i142 << 13) ^ i142;
            int i144 = i143 ^ (i143 >>> 17);
            ((int[]) objArr12[0])[0] = i144 ^ (i144 << 5);
            objArr12 = new Object[]{new int[1], iArr5, new int[]{i139}, strArr9};
            objArr10 = objArr10;
        } else {
            Object[] objArr97 = {null, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), r7, -2121468783};
            byte[] bArr8 = $$d;
            Object[] objArr98 = new Object[1];
            d((short) 322, bArr8[445], bArr8[11], objArr98);
            Class<?> cls4 = Class.forName((String) objArr98[0]);
            Object[] objArr99 = new Object[1];
            d((short) 373, bArr8[58], bArr8[74], objArr99);
            Object[] objArr100 = (Object[]) cls4.getMethod((String) objArr99[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr97);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                char size2 = (char) (View.MeasureSpec.getSize(0) + 43042);
                int bitsPerPixel5 = 3110 - ImageFormat.getBitsPerPixel(0);
                int defaultSize4 = View.getDefaultSize(0, 0) + 22;
                Object[] objArr101 = new Object[1];
                c((byte) 37, $$a[54], (short) ($$b | 148), objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(size2, bitsPerPixel5, defaultSize4, 154975793, false, (String) objArr101[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, objArr100);
            try {
                long jLongValue13 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char maximumDrawingCacheSize2 = (char) (43042 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int i145 = 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 23;
                    Object[] objArr102 = new Object[1];
                    c((byte) 52, $$a[54], (short) 210, objArr102);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(maximumDrawingCacheSize2, i145, modifierMetaStateMask4, -1269618118, false, (String) objArr102[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                    char packedPositionType3 = (char) (ExpandableListView.getPackedPositionType(0L) + 43042);
                    int defaultSize5 = View.getDefaultSize(0, 0) + 3111;
                    int iLastIndexOf3 = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                    Object[] objArr103 = new Object[1];
                    c((byte) 52, $$a[54], (short) 121, objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(packedPositionType3, defaultSize5, iLastIndexOf3, -1272852037, false, (String) objArr103[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, lValueOf16);
                objArr12 = objArr100;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i146 = ((int[]) objArr12[1])[0];
        int i147 = ((int[]) objArr12[2])[0];
        if (i147 == i146) {
            int i148 = ((int[]) objArr12[0])[0];
            int i149 = ((int[]) objArr12[2])[0];
            int i150 = ((int[]) objArr12[1])[0];
            String[] strArr10 = (String[]) objArr12[3];
            int[] iArr6 = {i150};
            int iMyPid3 = Process.myPid();
            int i151 = ~iMyPid3;
            int i152 = i148 + (-1796411576) + (((~((-938304790) | i151)) | (~((-766726670) | i151))) * (-867)) + (((~((-938304790) | iMyPid3)) | 631324677 | (~((-766726670) | iMyPid3))) * (-1734)) + (((~(iMyPid3 | (-135401993))) | (~(i151 | (-631324678))) | (~((-306980113) | iMyPid3))) * 867);
            int i153 = (i152 << 13) ^ i152;
            int i154 = i153 ^ (i153 >>> 17);
            ((int[]) objArr13[0])[0] = i154 ^ (i154 << 5);
            objArr13 = new Object[]{new int[1], iArr6, new int[]{i149}, strArr10};
            i5 = 0;
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr11 = (String[]) objArr12[3];
            if (strArr11 != null) {
                for (String str9 : strArr11) {
                    arrayList5.add(str9);
                }
            }
            Toast.makeText((Context) null, i147 / (((i147 - 1) * i147) % 2), 0).show();
            int i155 = ((int[]) objArr12[0])[0];
            int i156 = ((int[]) objArr12[2])[0];
            int i157 = ((int[]) objArr12[1])[0];
            String[] strArr12 = (String[]) objArr12[3];
            int[] iArr7 = {i156};
            int[] iArr8 = {i157};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i158 = i155 + 1312898920 + (((-269354497) | iIdentityHashCode6) * (-627)) + (((~((-1332850910) | iIdentityHashCode6)) | 372180549) * (-627)) + (((~(iIdentityHashCode6 | 372180549)) | (~((~iIdentityHashCode6) | 1332850909))) * 627);
            int i159 = (i158 << 13) ^ i158;
            int i160 = i159 ^ (i159 >>> 17);
            i5 = 0;
            ((int[]) objArr13[0])[0] = i160 ^ (i160 << 5);
            objArr13 = new Object[]{new int[1], iArr8, iArr7, strArr12};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
            char offsetAfter6 = (char) TextUtils.getOffsetAfter("", i5);
            int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 2267;
            int defaultSize6 = View.getDefaultSize(i5, i5) + 33;
            Object[] objArr104 = new Object[1];
            c((byte) 52, $$a[54], (short) 210, objArr104);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(offsetAfter6, packedPositionGroup3, defaultSize6, -887667012, false, (String) objArr104[i5], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char c5 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0) + 2268;
                int i161 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32;
                Object[] objArr105 = new Object[1];
                c((byte) 37, $$a[54], (short) ($$b | 148), objArr105);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(c5, iLastIndexOf4, i161, -654680577, false, (String) objArr105[0], null);
            }
            Object[] objArr106 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
            objArr14 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i162 = ((int[]) objArr106[0])[0];
            int i163 = ((int[]) objArr106[3])[0];
            String[] strArr13 = (String[]) objArr106[1];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i164 = ~iIdentityHashCode7;
            int i165 = ((((-1464643309) + ((~(218481621 | i164)) * (-560))) + ((~(iIdentityHashCode7 | (-573192203))) * (-560))) + (((~(590231694 | i164)) | 201442129) * 560)) - 1772053635;
            int i166 = (i165 << 13) ^ i165;
            int i167 = i166 ^ (i166 >>> 17);
            ((int[]) objArr14[2])[0] = i167 ^ (i167 << 5);
            objArr13 = objArr13;
        } else {
            Context applicationContext5 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
            Object[] objArr107 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), r7, -1772053635};
            byte b19 = (byte) ($$e & 191);
            byte[] bArr9 = $$d;
            Object[] objArr108 = new Object[1];
            d((short) 373, b19, bArr9[11], objArr108);
            Class<?> cls5 = Class.forName((String) objArr108[0]);
            Object[] objArr109 = new Object[1];
            d((short) 180, bArr9[14], bArr9[126], objArr109);
            Object[] objArr110 = (Object[]) cls5.getMethod((String) objArr109[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr107);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char c6 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int iNormalizeMetaState6 = KeyEvent.normalizeMetaState(0) + 2267;
                    int iIndexOf6 = 33 - TextUtils.indexOf("", "", 0);
                    Object[] objArr111 = new Object[1];
                    c((byte) 37, $$a[54], (short) ($$b | 148), objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(c6, iNormalizeMetaState6, iIndexOf6, -654680577, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, objArr110);
                try {
                    long jLongValue14 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        int iGreen2 = 2267 - Color.green(0);
                        int capsMode3 = 33 - TextUtils.getCapsMode("", 0, 0);
                        Object[] objArr112 = new Object[1];
                        c((byte) 52, $$a[54], (short) 121, objArr112);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cLastIndexOf2, iGreen2, capsMode3, -874156483, false, (String) objArr112[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char cGreen3 = (char) Color.green(0);
                        int iIndexOf7 = TextUtils.indexOf("", "", 0) + 2267;
                        int iNormalizeMetaState7 = KeyEvent.normalizeMetaState(0) + 33;
                        Object[] objArr113 = new Object[1];
                        c((byte) 52, $$a[54], (short) 210, objArr113);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cGreen3, iIndexOf7, iNormalizeMetaState7, -887667012, false, (String) objArr113[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr110 = objArr110;
                objArr13 = objArr13;
            }
            objArr14 = objArr110;
        }
        int i168 = ((int[]) objArr14[3])[0];
        int i169 = ((int[]) objArr14[0])[0];
        if (i169 == i168) {
            objArr15 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i170 = ((int[]) objArr14[2])[0];
            int i171 = ((int[]) objArr14[0])[0];
            int i172 = ((int[]) objArr14[3])[0];
            String[] strArr14 = (String[]) objArr14[1];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i173 = ~startUptimeMillis;
            int i174 = i170 + (-2136194841) + ((startUptimeMillis | 33767952) * 988) + (((~(857427604 | i173)) | (-872373941)) * (-1976)) + (((~(startUptimeMillis | 48714288)) | 33767952 | (~((-48714289) | i173))) * 988);
            int i175 = (i174 << 13) ^ i174;
            int i176 = i175 ^ (i175 >>> 17);
            i6 = 0;
            ((int[]) objArr15[2])[0] = i176 ^ (i176 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr15 = (String[]) objArr14[1];
            if (strArr15 != null) {
                for (String str10 : strArr15) {
                    arrayList6.add(str10);
                }
            }
            int[] iArr9 = new int[i169];
            int i177 = i169 - 1;
            iArr9[i177] = 1;
            Toast.makeText((Context) null, iArr9[((i169 * i177) % 2) - 1], 1).show();
            objArr15 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i178 = ((int[]) objArr14[2])[0];
            int i179 = ((int[]) objArr14[0])[0];
            int i180 = ((int[]) objArr14[3])[0];
            String[] strArr16 = (String[]) objArr14[1];
            int i181 = ~new Random().nextInt();
            int i182 = ~(581362213 | i181);
            int i183 = i178 + (-1207287617) + ((i182 | 227351102) * 764) + (((~(i181 | 227351102)) | 572710913) * (-1528)) + ((791410715 | i182) * 764);
            int i184 = (i183 << 13) ^ i183;
            int i185 = i184 ^ (i184 >>> 17);
            i6 = 0;
            ((int[]) objArr15[2])[0] = i185 ^ (i185 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
            char offsetBefore = (char) (TextUtils.getOffsetBefore("", i6) + 31533);
            int i186 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
            int iArgb4 = 28 - Color.argb(i6, i6, i6, i6);
            byte b20 = $$a[7];
            Object[] objArr114 = new Object[1];
            c(b20, (byte) (b20 + 5), (short) 210, objArr114);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(offsetBefore, i186, iArgb4, -1048449946, false, (String) objArr114[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char cIndexOf5 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int pressedStateDuration3 = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int capsMode4 = TextUtils.getCapsMode("", 0, 0) + 28;
                Object[] objArr115 = new Object[1];
                c((byte) 37, $$a[54], (short) ($$b | 148), objArr115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cIndexOf5, pressedStateDuration3, capsMode4, -1142834547, false, (String) objArr115[0], null);
            }
            Object[] objArr116 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            objArr16 = new Object[]{new int[1], new int[]{((int[]) objArr116[1])[0]}, (Object[]) objArr116[2], new int[]{((int[]) objArr116[3])[0]}, (String[]) objArr116[4]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i187 = (-173040250) + ((~((~iIdentityHashCode8) | (-1025))) * 433) + (((~((-939346428) | iIdentityHashCode8)) | (-834733217)) * (-433)) + (((~(iIdentityHashCode8 | (-834733217))) | (-939347452)) * 433) + 609170019;
            int i188 = (i187 << 13) ^ i187;
            int i189 = i188 ^ (i188 >>> 17);
            ((int[]) objArr16[0])[0] = i189 ^ (i189 << 5);
            objArr15 = objArr15;
        } else {
            Object[] objArr117 = {applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 609170019};
            byte[] bArr10 = $$d;
            Object[] objArr118 = new Object[1];
            d((short) 417, bArr10[118], bArr10[11], objArr118);
            Class<?> cls6 = Class.forName((String) objArr118[0]);
            Object[] objArr119 = new Object[1];
            d((short) 452, bArr10[14], bArr10[126], objArr119);
            Object[] objArr120 = (Object[]) cls6.getMethod((String) objArr119[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr117);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char bitsPerPixel6 = (char) (ImageFormat.getBitsPerPixel(0) + 31534);
                int iMyTid4 = 921 - (Process.myTid() >> 22);
                int deadChar3 = 28 - KeyEvent.getDeadChar(0, 0);
                Object[] objArr121 = new Object[1];
                c((byte) 37, $$a[54], (short) ($$b | 148), objArr121);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(bitsPerPixel6, iMyTid4, deadChar3, -1142834547, false, (String) objArr121[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr120);
            try {
                long jLongValue15 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char keyRepeatTimeout2 = (char) (31533 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int mode3 = View.MeasureSpec.getMode(0) + 921;
                    int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                    Object[] objArr122 = new Object[1];
                    c((byte) 52, $$a[54], (short) 210, objArr122);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(keyRepeatTimeout2, mode3, edgeSlop3, -778300370, false, (String) objArr122[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char c7 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int modifierMetaStateMask5 = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                    byte b21 = $$a[7];
                    Object[] objArr123 = new Object[1];
                    c(b21, (byte) (b21 + 5), (short) 210, objArr123);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(c7, modifierMetaStateMask5, windowTouchSlop3, -1048449946, false, (String) objArr123[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                objArr16 = objArr120;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i190 = ((int[]) objArr16[1])[0];
        int i191 = ((int[]) objArr16[3])[0];
        if (i191 != i190) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr17 = (String[]) objArr16[4];
            if (strArr17 != null) {
                for (String str11 : strArr17) {
                    arrayList7.add(str11);
                }
            }
            throw new RuntimeException(String.valueOf(i191));
        }
        int i192 = ((int[]) objArr16[0])[0];
        Object[] objArr124 = {new int[1], new int[]{((int[]) objArr16[1])[0]}, (Object[]) objArr16[2], new int[]{((int[]) objArr16[3])[0]}, (String[]) objArr16[4]};
        int iMyUid = Process.myUid();
        int i193 = i192 + (((808541329 + (((~((~iMyUid) | (-950646334))) | 805343260) * 446)) + (((~(iMyUid | (-145303074))) | 18090050) * 446)) - 1594158904);
        int i194 = (i193 << 13) ^ i193;
        int i195 = i194 ^ (i194 >>> 17);
        ((int[]) objArr124[0])[0] = i195 ^ (i195 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char cBlue = (char) (Color.blue(0) + 37567);
            int i196 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 625;
            int mirror3 = AndroidCharacter.getMirror('0') - '\"';
            byte b22 = $$a[7];
            Object[] objArr125 = new Object[1];
            c(b22, (byte) (b22 + 5), (short) 210, objArr125);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cBlue, i196, mirror3, -477065106, false, (String) objArr125[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char cIndexOf6 = (char) (37567 - TextUtils.indexOf("", "", 0));
            int doubleTapTimeout3 = 625 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int packedPositionGroup4 = 14 - ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr126 = new Object[1];
            c((byte) 52, $$a[54], (short) 121, objArr126);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cIndexOf6, doubleTapTimeout3, packedPositionGroup4, -976899241, false, (String) objArr126[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char maxKeyCode2 = (char) (37567 - (KeyEvent.getMaxKeyCode() >> 16));
                int mode4 = View.MeasureSpec.getMode(0) + 625;
                int iLastIndexOf5 = 13 - TextUtils.lastIndexOf("", '0', 0);
                Object[] objArr127 = new Object[1];
                c((byte) 52, $$a[54], (short) 210, objArr127);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(maxKeyCode2, mode4, iLastIndexOf5, -973632554, false, (String) objArr127[0], null);
            }
            Object[] objArr128 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            int i197 = ((int[]) objArr128[2])[0];
            int i198 = ((int[]) objArr128[0])[0];
            String[] strArr18 = (String[]) objArr128[3];
            int[] iArr10 = {i197};
            int i199 = ~System.identityHashCode(this);
            int i200 = ((1263373128 + (((~(i199 | (-1107387505))) | (~((-558011009) | i199))) * (-184))) + (((79169804 | (~((-637180813) | i199))) | (~((-1186557309) | i199))) * 184)) - 350888148;
            int i201 = (i200 << 13) ^ i200;
            int i202 = i201 ^ (i201 >>> 17);
            ((int[]) objArr17[1])[0] = i202 ^ (i202 << 5);
            objArr17 = new Object[]{new int[]{i198}, new int[1], iArr10, strArr18};
        } else {
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr129 = new Object[1];
            a(new int[]{1930957090, 2041514061, 645955581, 1544050799, -767960995, -115215862, -133622141, -2136791881, -295788754, 1611220548, 1802520449, 907857940, 341115857, 1572956379, 245732190, 478532413, 2048821963, -1187380905, -1175678546, -1971997562, -1521801064, 583439587, -274636755, 725220654, 541561926, -1776784912, 1761065789, -780514880, -696519221, -1068786605, -356672249, -682789803, 1773095946, -1088673195}, ExpandableListView.getPackedPositionGroup(0L) + 64, objArr129);
            String str12 = (String) objArr129[0];
            Object[] objArr130 = new Object[1];
            a(new int[]{-2112538249, -57260518, 1556305283, 1868713904, 1070816137, 753278139, 2115100343, 323201957, -1057322825, 832538879, -366543453, 286857329, -147721811, -731459095, -1674062231, 607139882, -514130581, -1930830643, 622493187, 1461243847, -1818632113, 1268401622, -1465129875, 765857162, -1440889236, -1961577823, -922668491, 1550927673, -594519919, -1866934804, 315995156, -581871057, -460647935, 1724939077}, 64 - View.getDefaultSize(0, 0), objArr130);
            Object[] objArr131 = {applicationContext, new String[]{str12, (String) objArr130[0]}, Integer.valueOf(iIntValue4), 17, 771088908};
            byte[] bArr11 = $$d;
            Object[] objArr132 = new Object[1];
            d((short) TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (byte) 28, bArr11[58], objArr132);
            Class<?> cls7 = Class.forName((String) objArr132[0]);
            Object[] objArr133 = new Object[1];
            d((short) 180, bArr11[14], bArr11[126], objArr133);
            objArr17 = (Object[]) cls7.getMethod((String) objArr133[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr131);
            int i203 = ((int[]) objArr17[0])[0];
            int i204 = ((int[]) objArr17[2])[0];
            if (applicationContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char mirror4 = (char) (37615 - AndroidCharacter.getMirror('0'));
                    int windowTouchSlop4 = 625 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iIndexOf8 = 14 - TextUtils.indexOf("", "", 0);
                    Object[] objArr134 = new Object[1];
                    c((byte) 52, $$a[54], (short) 210, objArr134);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(mirror4, windowTouchSlop4, iIndexOf8, -973632554, false, (String) objArr134[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr17);
                try {
                    long jLongValue17 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 37567);
                        int iMyPid4 = 625 - (Process.myPid() >> 22);
                        int iAxisFromString = 13 - MotionEvent.axisFromString("");
                        Object[] objArr135 = new Object[1];
                        c((byte) 52, $$a[54], (short) 121, objArr135);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(absoluteGravity, iMyPid4, iAxisFromString, -976899241, false, (String) objArr135[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char keyRepeatDelay3 = (char) (37567 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int jumpTapTimeout3 = 625 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int scrollBarSize3 = 14 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b23 = $$a[7];
                        Object[] objArr136 = new Object[1];
                        c(b23, (byte) (b23 + 5), (short) 210, objArr136);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(keyRepeatDelay3, jumpTapTimeout3, scrollBarSize3, -477065106, false, (String) objArr136[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i205 = ((int[]) objArr17[0])[0];
        int i206 = ((int[]) objArr17[2])[0];
        if (i206 == i205) {
            int i207 = ((int[]) objArr17[1])[0];
            int i208 = ((int[]) objArr17[2])[0];
            int i209 = ((int[]) objArr17[0])[0];
            String[] strArr19 = (String[]) objArr17[3];
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i210 = i207 + ((~((~iIdentityHashCode9) | (-1082221587))) * 130) + 1970914332 + (((~(iIdentityHashCode9 | (-1082221587))) | 304251108) * 130);
            int i211 = (i210 << 13) ^ i210;
            int i212 = i211 ^ (i211 >>> 17);
            ((int[]) objArr18[1])[0] = i212 ^ (i212 << 5);
            objArr18 = new Object[]{new int[]{i209}, new int[1], new int[]{i208}, strArr19};
            c = 0;
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr20 = (String[]) objArr17[3];
            if (strArr20 != null) {
                for (String str13 : strArr20) {
                    arrayList8.add(str13);
                }
            }
            Toast.makeText((Context) null, i206 / (((i206 - 1) * i206) % 2), 0).show();
            int i213 = ((int[]) objArr17[1])[0];
            int i214 = ((int[]) objArr17[2])[0];
            int i215 = ((int[]) objArr17[0])[0];
            String[] strArr21 = (String[]) objArr17[3];
            int[] iArr11 = {i214};
            int i216 = (int) Runtime.getRuntime().totalMemory();
            int i217 = ~((-285483282) | i216);
            int i218 = ~i216;
            int i219 = i213 + (-978086840) + ((i217 | (~((-1076593667) | i218))) * 920) + (((~((-461661174) | i218)) | 285483281) * 920) + (((~(i216 | (-1076593667))) | (~((-285483282) | i218)) | (~((-176177893) | i216))) * 920);
            int i220 = (i219 << 13) ^ i219;
            int i221 = i220 ^ (i220 >>> 17);
            c = 0;
            ((int[]) objArr18[1])[0] = i221 ^ (i221 << 5);
            objArr18 = new Object[]{new int[]{i215}, new int[1], iArr11, strArr21};
        }
        int i222 = ((int[]) objArr45[2])[c];
        int i223 = i222 * i222;
        int i224 = -(867918067 * i222);
        int i225 = (i223 ^ i224) + ((i223 & i224) << 1);
        int i226 = -(i222 * (-1466086431));
        int i227 = ((i225 ^ i226) + ((i226 & i225) << 1)) - 375692316;
        int i228 = i227 >> 20;
        int i229 = ((i228 & (-8191)) + (i228 | (-8191))) / 4096;
        int i230 = (i229 & 1) + (i229 | 1);
        int i231 = ((i227 | i230) << 1) - (i230 ^ i227);
        int i232 = i227 >> 27;
        int i233 = ((i232 & (-63)) + (i232 | (-63))) / 32;
        int i234 = (-(((i233 ^ 1) + ((i233 & 1) << 1)) ^ i231)) + 6;
        int i235 = i234 >> 28;
        int i236 = ((i235 ^ (-31)) + ((i235 & (-31)) << 1)) / 16;
        int i237 = (i236 ^ 1) + ((i236 & 1) << 1);
        int i238 = 6816852 / ((i234 & (-((i237 & 1) + (i237 | 1)))) * 1491);
        int i239 = ((int[]) objArr93[3])[0];
        int i240 = i239 * i239;
        int i241 = -(1146849418 * i239);
        int i242 = ((((i240 | i241) << 1) - (i240 ^ i241)) - (~(-(i239 * 234522770)))) - (-1543319235);
        int i243 = i242 >> 22;
        int i244 = ((i242 >> 23) - 1023) / 512;
        int i245 = -(((i242 - (~((((i243 & (-2047)) + (i243 | (-2047))) / 1024) + 1))) - 1) ^ ((i244 ^ 1) + ((i244 & 1) << 1)));
        int i246 = ((i245 | 9) << 1) - (i245 ^ 9);
        int i247 = i246 >> 27;
        int i248 = ((((i247 | (-63)) << 1) - (i247 ^ (-63))) / 32) + 1;
        int i249 = i238 + (1319445 / (((-(((i248 | 1) << 1) - (i248 ^ 1))) & i246) * 545));
        int i250 = ((int[]) objArr13[0])[0];
        int i251 = i250 * i250;
        int i252 = -(582698148 * i250);
        int i253 = (((i251 ^ i252) + ((i251 & i252) << 1)) - (~(-(i250 * (-286673612))))) - 1;
        int i254 = (i253 & (-265979504)) + ((-265979504) | i253);
        int i255 = ((i254 >> 26) + ComposerKt.defaultsKey) / 64;
        int i256 = (i255 ^ 1) + ((i255 & 1) << 1);
        int i257 = (i254 ^ i256) + ((i256 & i254) << 1);
        int i258 = i254 >> 29;
        int i259 = ((i258 ^ (-15)) + ((i258 & (-15)) << 1)) / 8;
        int i260 = -(i257 ^ ((i259 ^ 1) + ((i259 & 1) << 1)));
        int i261 = (i260 & 3) + (i260 | 3);
        int i262 = i261 >> 26;
        int i263 = ((i262 & ComposerKt.defaultsKey) + (i262 | ComposerKt.defaultsKey)) / 64;
        int i264 = (i263 & 1) + (i263 | 1);
        int i265 = i249 + (72618 / (((-(((i264 | 1) << 1) - (i264 ^ 1))) & i261) * 49));
        int i266 = ((int[]) objArr15[2])[0];
        int i267 = i266 * i266;
        int i268 = -(1351396380 * i266);
        int i269 = (((i267 & i268) + (i267 | i268)) - (~(-(i266 * 1383190478)))) - 1844138888;
        int i270 = i269 >> 27;
        int i271 = ((((i270 | (-63)) << 1) - (i270 ^ (-63))) / 32) + 1;
        int i272 = ((i269 | i271) << 1) - (i271 ^ i269);
        int i273 = ((i269 >> 18) - 32767) / 16384;
        int i274 = -(i272 ^ ((i273 ^ 1) + ((i273 & 1) << 1)));
        int i275 = (i274 ^ 3) + ((i274 & 3) << 1);
        int i276 = i275 >> 28;
        int i277 = ((i276 & (-31)) + (i276 | (-31))) / 16;
        int i278 = ((i277 | 1) << 1) - (i277 ^ 1);
        int i279 = i265 + (2339652 / (((-((i278 & 1) + (i278 | 1))) & i275) * 1127));
        int i280 = ((int[]) objArr124[0])[0];
        int i281 = ((i280 * i280) - (~(-(264971336 * i280)))) - 1;
        int i282 = -(i280 * (-1074778180));
        int i283 = ((i281 | i282) << 1) - (i281 ^ i282);
        int i284 = (i283 ^ (-1805998076)) + (((-1805998076) & i283) << 1);
        int i285 = (((i284 >> 25) - 255) / 128) + 1;
        int i286 = ((i284 | i285) << 1) - (i285 ^ i284);
        int i287 = i284 >> 23;
        int i288 = ((i287 & (-1023)) + (i287 | (-1023))) / 512;
        int i289 = -(((i288 ^ 1) + ((i288 & 1) << 1)) ^ i286);
        int i290 = (i289 ^ 9) + ((i289 & 9) << 1);
        int i291 = i290 >> 24;
        int i292 = (((i291 | (-511)) << 1) - (i291 ^ (-511))) / 256;
        int i293 = i279 + (359370 / (((-(((i292 & 1) + (i292 | 1)) + 1)) & i290) * 165));
        int i294 = ((int[]) objArr18[1])[0];
        int i295 = i294 * i294;
        int i296 = -(1297561825 * i294);
        int i297 = (i295 & i296) + (i295 | i296);
        int i298 = -(i294 * (-292177081));
        int i299 = ((i297 | i298) << 1) - (i298 ^ i297);
        int i300 = ((i299 | 1621561744) << 1) - (1621561744 ^ i299);
        int i301 = i300 >> 27;
        int i302 = (((i301 & (-63)) + (i301 | (-63))) / 32) + 1;
        int i303 = -((((i300 | i302) << 1) - (i302 ^ i300)) ^ ((((i300 >> 20) - 8191) / 4096) + 1));
        int i304 = (i303 ^ 8) + ((i303 & 8) << 1);
        int i305 = i304 >> 19;
        int i306 = (((i305 | (-16383)) << 1) - (i305 ^ (-16383))) / 8192;
        int i307 = ((i306 | 1) << 1) - (i306 ^ 1);
        String strSubstring = "4|14|2|31|15|extra_download_id".substring(i293 + ((-13951984) / (((-((i307 ^ 1) + ((i307 & 1) << 1))) & i304) * 713)));
        int i308 = ((int[]) objArr33[1])[0];
        int i309 = ((i308 * i308) - (~(-(159254770 * i308)))) - 1;
        int i310 = -(i308 * 242789296);
        int i311 = (i309 & i310) + (i310 | i309);
        int i312 = ((i311 | 817040801) << 1) - (817040801 ^ i311);
        int i313 = i312 >> 17;
        int i314 = (((-65535) ^ i313) + ((i313 & (-65535)) << 1)) / 32768;
        int i315 = (i312 - (~((i314 & 1) + (i314 | 1)))) - 1;
        int i316 = i312 >> 20;
        int i317 = ((i316 & (-8191)) + (i316 | (-8191))) / 4096;
        int i318 = -(i315 ^ ((i317 & 1) + (i317 | 1)));
        int i319 = (i318 ^ 7) + ((i318 & 7) << 1);
        int i320 = i319 >> 26;
        int i321 = (((i320 | ComposerKt.defaultsKey) << 1) - (i320 ^ ComposerKt.defaultsKey)) / 64;
        int i322 = ((i321 | 1) << 1) - (i321 ^ 1);
        int i323 = 278460 / (((-(((i322 | 1) << 1) - (i322 ^ 1))) & i319) * 1530);
        int i324 = ((int[]) objArr4[1])[0];
        int i325 = i324 * i324;
        int i326 = -(851885339 * i324);
        int i327 = (((i325 ^ i326) + ((i325 & i326) << 1)) - (~(-(i324 * 1497367683)))) - 1;
        int i328 = (i327 ^ (-1653217439)) + (((-1653217439) & i327) << 1);
        int i329 = i328 >> 27;
        int i330 = (((i329 & (-63)) + (i329 | (-63))) / 32) + 1;
        int i331 = (i328 & i330) + (i330 | i328);
        int i332 = i328 >> 17;
        int i333 = (-(i331 ^ (((((-65535) ^ i332) + ((i332 & (-65535)) << 1)) / 32768) + 1))) + 5;
        int i334 = i333 >> 23;
        int i335 = ((i334 ^ (-1023)) + ((i334 & (-1023)) << 1)) / 512;
        int i336 = (i335 & 1) + (i335 | 1);
        int i337 = i323 + (877440 / ((i333 & (-((i336 & 1) + (i336 | 1)))) * 1371));
        int i338 = ((int[]) objArr6[1])[0];
        int i339 = i338 * i338;
        int i340 = -(1047941680 * i338);
        int i341 = ((((i339 | i340) << 1) - (i339 ^ i340)) - (~(-(i338 * 250164396)))) - 1;
        int i342 = (i341 & 1838465860) + (1838465860 | i341);
        int i343 = i342 >> 20;
        int i344 = ((i343 & (-8191)) + (i343 | (-8191))) / 4096;
        int i345 = (i344 & 1) + (i344 | 1);
        int i346 = (i342 ^ i345) + ((i345 & i342) << 1);
        int i347 = ((i342 >> 18) - 32767) / 16384;
        int i348 = -(i346 ^ ((i347 & 1) + (i347 | 1)));
        int i349 = (i348 ^ 3) + ((i348 & 3) << 1);
        int i350 = i349 >> 24;
        int i351 = ((i350 ^ (-511)) + ((i350 & (-511)) << 1)) / 256;
        int i352 = (i351 ^ 1) + ((i351 & 1) << 1);
        int i353 = i337 + (2141826 / (((-((i352 & 1) + (i352 | 1))) & i349) * 1466));
        int i354 = ((int[]) objArr8[1])[0];
        int i355 = i354 * i354;
        int i356 = -(273814691 * i354);
        int i357 = (i355 ^ i356) + ((i355 & i356) << 1);
        int i358 = -(i354 * 680227259);
        int i359 = ((i357 & i358) + (i358 | i357)) - 1724603743;
        int i360 = i359 >> 27;
        int i361 = (i359 - (~((((i360 ^ (-63)) + ((i360 & (-63)) << 1)) / 32) + 1))) - 1;
        int i362 = i359 >> 25;
        int i363 = ((i362 ^ (-255)) + ((i362 & (-255)) << 1)) / 128;
        int i364 = -(i361 ^ ((i363 & 1) + (i363 | 1)));
        int i365 = ((i364 | 4) << 1) - (i364 ^ 4);
        int i366 = ((i365 >> 26) + ComposerKt.defaultsKey) / 64;
        int i367 = (i366 & 1) + (i366 | 1);
        int i368 = i353 + (4999904 / (((-((i367 & 1) + (i367 | 1))) & i365) * 1768));
        int i369 = ((int[]) objArr10[3])[0];
        int i370 = i369 * i369;
        int i371 = -(1687132170 * i369);
        int i372 = (i370 & i371) + (i370 | i371);
        int i373 = -(i369 * 831388806);
        int i374 = ((i372 | i373) << 1) - (i373 ^ i372);
        int i375 = (i374 & (-273304512)) + ((-273304512) | i374);
        int i376 = i375 >> 29;
        int i377 = (((i376 & (-15)) + (i376 | (-15))) / 8) + 1;
        int i378 = (i375 ^ i377) + ((i377 & i375) << 1);
        int i379 = i375 >> 27;
        int i380 = ((i379 & (-63)) + (i379 | (-63))) / 32;
        int i381 = -(i378 ^ (((i380 | 1) << 1) - (i380 ^ 1)));
        int i382 = ((i381 | 6) << 1) - (i381 ^ 6);
        int i383 = i382 >> 17;
        int i384 = (((-65535) ^ i383) + ((i383 & (-65535)) << 1)) / 32768;
        int i385 = (i384 & 1) + (i384 | 1);
        long longExtra = intent.getLongExtra(strSubstring, ((long) (i368 + ((-7738308) / (((-((i385 & 1) + (i385 | 1))) & i382) * 1233)))) - 303);
        if (longExtra != this.zzb) {
            return;
        }
        Integer downloadingModelStatusCode = this.zza.getDownloadingModelStatusCode();
        synchronized (this.zza) {
            try {
                this.zza.zze.getApplicationContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                RemoteModelDownloadManager.zza.w("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e2);
            }
            this.zza.zzc.remove(this.zzb);
            this.zza.zzd.remove(this.zzb);
        }
        if (downloadingModelStatusCode != null) {
            if (downloadingModelStatusCode.intValue() == 16) {
                zzmq zzmqVar = this.zza.zzi;
                zzmh zzmhVarZzg = zzmt.zzg();
                RemoteModelDownloadManager remoteModelDownloadManager = this.zza;
                RemoteModel remoteModel = remoteModelDownloadManager.zzg;
                Long lValueOf23 = Long.valueOf(longExtra);
                zzmqVar.zze(zzmhVarZzg, remoteModel, false, remoteModelDownloadManager.getFailureReason(lValueOf23));
                this.zzc.setException(this.zza.zzl(lValueOf23));
                return;
            }
            if (downloadingModelStatusCode.intValue() == 8) {
                zzmq zzmqVar2 = this.zza.zzi;
                zzmh zzmhVarZzg2 = zzmt.zzg();
                RemoteModel remoteModel2 = this.zza.zzg;
                zzmr zzmrVarZzh = zzms.zzh();
                zzmrVarZzh.zzb(zziy.NO_ERROR);
                zzmrVarZzh.zze(true);
                zzmrVarZzh.zzd(this.zza.zzg.getModelType());
                zzmrVarZzh.zza(zzje.SUCCEEDED);
                zzmqVar2.zzg(zzmhVarZzg2, remoteModel2, zzmrVarZzh.zzh());
                this.zzc.setResult(null);
                return;
            }
        }
        this.zza.zzi.zze(zzmt.zzg(), this.zza.zzg, false, 0);
        this.zzc.setException(new MlKitException("Model downloading failed", 13));
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = b;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 31;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr2[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3291, 31 - TextUtils.getTrimmedLength(""), 1948206109, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i4 = -1870535734;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = b;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr5[i10]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 3290 - TextUtils.indexOf("", c, 0, 0), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1948206109, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i10++;
                iArr5 = iArr5;
                c = '0';
                i5 = 1;
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
            int i11 = 17;
            while (i11 > 1) {
                int i12 = $11 + 13;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), KeyEvent.keyCodeFromString("") + 2559, 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i11 += 31;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.green(0), 2559 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 29 - TextUtils.indexOf("", "", 0), 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i11--;
                }
            }
            int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i14 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 28879), View.MeasureSpec.getMode(0) + 348, 24 - TextUtils.indexOf((CharSequence) "", '0', 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
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
        int i15 = $11 + 27;
        $10 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    static {
        byte[] bArr = new byte[537];
        System.arraycopy("A\u0086¿\u0002\rÿÂ:\t\u0001ù\u0006úÊ4\u000e÷\u000fþûüË?þú\u0011ð\u0012øý\u000f¼Cýö\u0003\u0003\u000f¼4\u0010úÆ@\u0003ö\u0002\bÃ>\u0005\u0006ùþ\u0006Á\u0016-\u0000\u0001øÿ\u0012ü\u0004Ð'\u0001\fô\u0003û\u0014ö\u0007\u0000Þ*\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007\u0000þöÿ\u0007ù\fþ\u0006ÿþ\u0006ø\u0000\u0013ôý\u0013×#ö\u0002\bù\u0002\u0002ü\u0015ø\tÀ\rÿÂ5\u000fû\n\u0002ø\u000bº7þ\u0014îÎC\u0003þÿ\u0003À@\u0003ö\u0002\bÃEô\r\u0005ñ\u000f\u0002»\u0019'ö\u0007Þ\"\u0001\fýþ\u0006þè\u0014\r\u0005ñ\u000f\u0002\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007\u0000þöÿ\u0007ù\fþ\u0006ÿþ\u0006ø\u0000\u0013ôý\u0013×#ö\u0002\bù\u0002\u0002ü\u0015ø\t¾\rÿÂ:\t\u0001ù\u0006úÊ4\u000e÷\u000fþûüË:\u0007\u0007¼<\u0006\u0007ò\u000eýô\fÃ@\u0000\u0000ÿ\fì\u0018ô\u000b÷\u0007\u0000ò\bü\u0003\u0003ÊM\u0001õ\u0000\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007ï\b\u0006÷\u0006\u0006úã&ù\u0007ö\u0014ò\u000eÀ\rÿÂ:\t\u0001ù\u0006úÊ9\u0004\nôþ\u0000\u0013óÊ@ù\u000f\u0001ï\u0007\u0003\u0006úÈ&\u0016ú\u0012ô\u0000í#ô\u0002\u0000\u000eô\nö\u0003\u000fß%ñ\u0011ñ\rÿÂ:\t\u0001ù\u0006úÊ4\u000e÷\u000fþûüË:\u0007\u0007¼<\u0006\u0007ò\u000eýô\fÃ?\u0004õÿ\u0014ö\u0007\u0000ÁM\u0001ì\u0000\rÿÂ>\u0005\u0007ÿö\u0002\u0003ú\u0012\u0000\u0001îÎ4\u0013\u0007ööÌ\u00143\u0007ööñ\u0013\u000e\u0005ð\u000e³\u000e\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007\u0000þöÿ\u0007ù\fþ\u0006ÿþ\u0006ø\u0000\u0013ôý\u0013×#ö\u0002\bù\u0002\u0002ü\u0015ø\t¿\u000bÒ/ð\u0017ï\u000eâ\u001aþü\u0002Ý.ü\u0005õ\u0014ö\u0007\u0000Ø*ô\u0002\u000bú\u0000".getBytes("ISO-8859-1"), 0, bArr, 0, 537);
        $$d = bArr;
        $$e = 108;
        $$a = new byte[]{48, -119, -71, 110, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        $$b = 10;
        b = new int[]{1748851771, -2107594094, -1579279849, 641499601, 412533706, -234777878, -160774784, 1347129167, 1539799142, -493497311, -824024679, -1208043769, -1270067206, 1266659543, 1441404734, 318443656, -1174771434, -497121685};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, byte r6, byte r7) {
        /*
            int r7 = r7 * 56
            int r7 = 122 - r7
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r1 = com.google.mlkit.common.sdkinternal.model.zzd.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.zzd.$$g(int, byte, byte):java.lang.String");
    }
}
