package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ZExternalSyntheticLambda1;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class zzkx {
    private static zzp zza;
    private static final zzr zzb = zzr.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
    private final String zzc;
    private final String zzd;
    private final zzkw zze;
    private final SharedPrefManager zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzkx(Context context, final SharedPrefManager sharedPrefManager, zzkw zzkwVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzkwVar;
        zzlk.zza();
        this.zzi = str;
        this.zzg = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzkt
            private static final byte[] $$c = {0, -94, -62, -97};
            private static final int $$d = 245;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {93, -122, -23, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 184;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static int[] b = {-190594261, 237130702, 1035931600, 1226282387, -2117521842, -247093534, 1538298892, -2083142485, 957815510, 358178222, -724824321, 1184880471, -1259492517, 57898009, -750164850, 1808969241, -1933517293, 667266934};

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 14
                    int r8 = r8 + 84
                    int r7 = r7 + 4
                    byte[] r0 = com.google.android.gms.internal.mlkit_vision_common.zzkt.$$a
                    int r6 = 53 - r6
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r6
                    r4 = r2
                    goto L24
                L12:
                    r3 = r2
                L13:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r6) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L22:
                    r3 = r0[r7]
                L24:
                    int r3 = -r3
                    int r7 = r7 + 1
                    int r8 = r8 + r3
                    int r8 = r8 + (-11)
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzkt.c(short, int, short, java.lang.Object[]):void");
            }

            private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
                int length;
                int[] iArr2;
                int i2 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = b;
                int i3 = -1870535734;
                long j = 0;
                int i4 = 1;
                int i5 = 0;
                if (iArr3 != null) {
                    int i6 = $10 + 25;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        length = iArr3.length;
                        iArr2 = new int[length];
                    } else {
                        length = iArr3.length;
                        iArr2 = new int[length];
                    }
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 3291;
                                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j) + 31;
                                byte b2 = $$c[0];
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, deadChar, packedPositionGroup, 1948206109, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr2[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i7++;
                            i3 = -1870535734;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr3 = iArr2;
                }
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = b;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i8 = 0;
                    while (i8 < length3) {
                        Object[] objArr3 = new Object[i4];
                        objArr3[i5] = Integer.valueOf(iArr5[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char absoluteGravity = (char) Gravity.getAbsoluteGravity(i5, i5);
                            int i9 = (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)) + 3292;
                            int iResolveOpacity = Drawable.resolveOpacity(i5, i5) + 31;
                            byte b4 = $$c[i5];
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, i9, iResolveOpacity, 1948206109, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i8++;
                        i4 = 1;
                        i5 = 0;
                    }
                    iArr5 = iArr6;
                }
                int i10 = i5;
                System.arraycopy(iArr5, i10, iArr4, i10, length2);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    cArr[i10] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i11 = 17;
                    for (int i12 = 1; i11 > i12; i12 = 1) {
                        int i13 = $10 + 47;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                            Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int iIndexOf = 2559 - TextUtils.indexOf("", "", 0, 0);
                                int i14 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29;
                                byte b6 = $$c[0];
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, iIndexOf, i14, 683220507, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i11 += 102;
                        } else {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                            try {
                                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                                    int i15 = 2559 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int iLastIndexOf = 28 - TextUtils.lastIndexOf("", '0', 0, 0);
                                    byte b8 = $$c[0];
                                    byte b9 = b8;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, i15, iLastIndexOf, 683220507, false, $$e(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                                }
                                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                                i11--;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        int i16 = $10 + 63;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr6 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28880 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (Process.myPid() >> 22) + 348, (Process.myPid() >> 22) + 25, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    i10 = 0;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                String strZza = this.zza.zza();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                return strZza;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0619 A[Catch: all -> 0x0670, TryCatch #0 {all -> 0x0670, blocks: (B:98:0x060c, B:100:0x0619, B:101:0x0661), top: B:125:0x060c, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:104:0x066e  */
            /* JADX WARN: Code duplicated, block: B:111:0x067b A[PHI: r31
  0x067b: PHI (r31v4 ??) = (r31v3 ??), (r31v6 ??), (r31v7 ??), (r31v8 ??) binds: [B:110:0x0679, B:124:0x067b, B:103:0x066c, B:84:0x04d7] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:114:0x06a0  */
            /* JADX WARN: Code duplicated, block: B:115:0x06a3  */
            /* JADX WARN: Code duplicated, block: B:127:0x03cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:48:0x0352  */
            /* JADX WARN: Code duplicated, block: B:50:0x0358  */
            /* JADX WARN: Code duplicated, block: B:55:0x037e  */
            /* JADX WARN: Code duplicated, block: B:57:0x038b  */
            /* JADX WARN: Code duplicated, block: B:61:0x03a4  */
            /* JADX WARN: Code duplicated, block: B:73:0x0416  */
            /* JADX WARN: Code duplicated, block: B:82:0x04d5 A[Catch: Exception -> 0x067b, TryCatch #2 {Exception -> 0x067b, blocks: (B:80:0x04cf, B:82:0x04d5, B:83:0x04d6, B:85:0x04dd, B:89:0x054b, B:91:0x0583, B:95:0x05cf, B:97:0x05ed, B:102:0x0668, B:106:0x0671, B:108:0x0677, B:109:0x0678, B:96:0x05d7, B:90:0x0562, B:98:0x060c, B:100:0x0619, B:101:0x0661), top: B:129:0x037c, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:83:0x04d6 A[Catch: Exception -> 0x067b, TryCatch #2 {Exception -> 0x067b, blocks: (B:80:0x04cf, B:82:0x04d5, B:83:0x04d6, B:85:0x04dd, B:89:0x054b, B:91:0x0583, B:95:0x05cf, B:97:0x05ed, B:102:0x0668, B:106:0x0671, B:108:0x0677, B:109:0x0678, B:96:0x05d7, B:90:0x0562, B:98:0x060c, B:100:0x0619, B:101:0x0661), top: B:129:0x037c, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:85:0x04dd A[Catch: Exception -> 0x067b, TRY_LEAVE, TryCatch #2 {Exception -> 0x067b, blocks: (B:80:0x04cf, B:82:0x04d5, B:83:0x04d6, B:85:0x04dd, B:89:0x054b, B:91:0x0583, B:95:0x05cf, B:97:0x05ed, B:102:0x0668, B:106:0x0671, B:108:0x0677, B:109:0x0678, B:96:0x05d7, B:90:0x0562, B:98:0x060c, B:100:0x0619, B:101:0x0661), top: B:129:0x037c, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:88:0x0540  */
            /* JADX WARN: Code duplicated, block: B:90:0x0562 A[Catch: Exception -> 0x067b, TryCatch #2 {Exception -> 0x067b, blocks: (B:80:0x04cf, B:82:0x04d5, B:83:0x04d6, B:85:0x04dd, B:89:0x054b, B:91:0x0583, B:95:0x05cf, B:97:0x05ed, B:102:0x0668, B:106:0x0671, B:108:0x0677, B:109:0x0678, B:96:0x05d7, B:90:0x0562, B:98:0x060c, B:100:0x0619, B:101:0x0661), top: B:129:0x037c, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:94:0x05be  */
            /* JADX WARN: Code duplicated, block: B:96:0x05d7 A[Catch: Exception -> 0x067b, TryCatch #2 {Exception -> 0x067b, blocks: (B:80:0x04cf, B:82:0x04d5, B:83:0x04d6, B:85:0x04dd, B:89:0x054b, B:91:0x0583, B:95:0x05cf, B:97:0x05ed, B:102:0x0668, B:106:0x0671, B:108:0x0677, B:109:0x0678, B:96:0x05d7, B:90:0x0562, B:98:0x060c, B:100:0x0619, B:101:0x0661), top: B:129:0x037c, inners: #0 }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r31v0, types: [android.content.Context, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r31v1 */
            /* JADX WARN: Type inference failed for: r31v11 */
            /* JADX WARN: Type inference failed for: r31v12 */
            /* JADX WARN: Type inference failed for: r31v13 */
            /* JADX WARN: Type inference failed for: r31v14 */
            /* JADX WARN: Type inference failed for: r31v2 */
            /* JADX WARN: Type inference failed for: r31v3 */
            /* JADX WARN: Type inference failed for: r31v4 */
            /* JADX WARN: Type inference failed for: r31v5 */
            /* JADX WARN: Type inference failed for: r31v6 */
            /* JADX WARN: Type inference failed for: r31v7 */
            /* JADX WARN: Type inference failed for: r31v8 */
            /* JADX WARN: Type inference failed for: r3v4 */
            public static Object[] TuitionPaymentFragmentbindingInflater1(Context context2, int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                ?? r31;
                int i6;
                ?? r32;
                int i7;
                int i8;
                int[] iArr;
                int i9;
                int i10;
                int i11;
                int i12;
                String str2;
                int[] iArr2;
                int edgeSlop;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                Object[] objArr;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i20;
                Object obj;
                Throwable cause;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i21;
                int i22;
                int i23;
                int i24 = 2 % 2;
                if (context2 != 0) {
                    int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                    int i26 = i25 % 2;
                    try {
                        int[] iArr3 = {-1571349282, 1692512661, -739235914, -767157680, 2064175160, 1499428750, 2033245249, 1861443451, 1331010719, 317888409, -1460712058, -873489361, 1337841991, 1024364752};
                        int i27 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i28 = i27 * 868;
                        int i29 = (i28 ^ 19964) + ((i28 & 19964) << 1);
                        int i30 = ~i27;
                        int i31 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i32 = ~((i30 & i31) | (i30 ^ i31));
                        int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i33 % 128;
                        if (i33 % 2 == 0) {
                            int i34 = ~(((-24) ^ i31) | ((-24) & i31));
                            int i35 = (i32 ^ i34) | (i32 & i34);
                            int i36 = -((i35 & (-867)) + (i35 | (-867)));
                            int i37 = ((i29 | i36) << 1) - (i36 ^ i29);
                            int i38 = ~i27;
                            int i39 = ~((i38 ^ (-24)) | (i38 & (-24)));
                            int i40 = ~((i38 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i38 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i41 = (i39 ^ i40) | (i40 & i39);
                            int i42 = ~(((-24) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-24) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            i21 = i37 * ((i41 ^ i42) | (i41 & i42)) * (-1734);
                        } else {
                            int i43 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i44 = (i29 - (~((i32 | (~(((-24) ^ i43) | (i43 & (-24))))) * (-867)))) - 1;
                            int i45 = ~i27;
                            int i46 = -(-(((~((i45 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i45 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) | (~((i45 ^ (-24)) | (i45 & (-24)))) | (~((-24) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) * (-1734)));
                            i21 = (i44 & i46) + (i46 | i44);
                        }
                        int i47 = ~i27;
                        int i48 = ~((i47 ^ (-24)) | (i47 & (-24)) | i31);
                        int i49 = (i47 & 23) | (i47 ^ 23);
                        int i50 = ~((i49 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i49 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i51 = (i50 & i48) | (i48 ^ i50);
                        int i52 = (-24) | i27;
                        int i53 = ~((i52 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i52 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i54 = (i21 - (~(867 * ((i53 & i51) | (i51 ^ i53))))) - 1;
                        Object[] objArr2 = new Object[1];
                        a(iArr3, i54, objArr2);
                        Class<?> cls = Class.forName((String) objArr2[0]);
                        int[] iArr4 = {-1865078898, -981168094, -219769523, 1858991802, 748995072, 816429168, -751930711, 2033202599, 756713265, -1288683581, 45709150, 1885339635};
                        int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i55 = touchSlop * (-515);
                        int i56 = ((i55 | 9306) << 1) - (i55 ^ 9306);
                        int i57 = ~(((-19) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-19) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i58 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i59 = ~((i58 ^ touchSlop) | (i58 & touchSlop));
                        int i60 = (i57 ^ i59) | (i57 & i59);
                        int i61 = ~((i58 & 18) | (i58 ^ 18));
                        int i62 = i56 + (((i60 & i61) | (i60 ^ i61)) * (-516));
                        int i63 = ~touchSlop;
                        int i64 = i63 | (-19);
                        int i65 = ~((i64 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i64 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i66 = ~touchSlop;
                        int i67 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i68 % 128;
                        int i69 = i68 % 2;
                        int i70 = ~((i66 & i67) | (i66 ^ i67) | 18);
                        int i71 = i62 + (516 * ((i70 & i65) | (i65 ^ i70))) + (((~((i63 ^ 18) | (i63 & 18))) | (~((i67 ^ 18) | (i67 & 18)))) * 516);
                        Object[] objArr3 = new Object[1];
                        a(iArr4, i71, objArr3);
                        Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context2, null);
                        int[] iArr5 = {-411806231, -267063086, -1370603512, 1427506961, -286700156, -1067377445, -950666751, -2030924584, -1309405325, 1017090280, -2071809926, 1567062630, -293751463, -1606191286, 678629422, -1492247474, 1916694491, -1564352562, -1246817695, 653254944};
                        int deadChar = KeyEvent.getDeadChar(0, 0);
                        int i72 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i73 = (i72 & 47) + (i72 | 47);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i73 % 128;
                        int i74 = -deadChar;
                        if (i73 % 2 == 0) {
                            int i75 = ((i74 | 34) << 1) - (i74 ^ 34);
                            Object[] objArr4 = new Object[1];
                            a(iArr5, i75, objArr4);
                            Class<?> cls2 = Class.forName((String) objArr4[0]);
                            Object[] objArr5 = new Object[1];
                            a(new int[]{1859237561, -281564470, 1762543608, -697171493, 1537612249, -2114653704}, (ViewConfiguration.getTouchSlop() >>> 67) * 5, objArr5);
                            int i76 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                            int i77 = -i76;
                            i23 = ((i76 & i77) | (i76 ^ i77)) << 99;
                            i22 = i;
                        } else {
                            int i78 = (i74 ^ 34) + ((i74 & 34) << 1);
                            Object[] objArr6 = new Object[1];
                            a(iArr5, i78, objArr6);
                            Class<?> cls3 = Class.forName((String) objArr6[0]);
                            int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                            int i79 = (touchSlop2 & 5) + (touchSlop2 | 5);
                            Object[] objArr7 = new Object[1];
                            a(new int[]{1859237561, -281564470, 1762543608, -697171493, 1537612249, -2114653704}, i79, objArr7);
                            int i80 = cls3.getField((String) objArr7[0]).getInt(objInvoke) & 2;
                            i22 = (i & (-2)) | ((~i) & 1);
                            int i81 = -i80;
                            i23 = ((i80 & i81) | (i80 ^ i81)) >> 31;
                        }
                        i4 = (i23 & i22) | ((~i23) & i);
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th;
                    }
                } else {
                    i4 = i;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    int i82 = 13;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 16949);
                        int i83 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2739;
                        int deadChar2 = KeyEvent.getDeadChar(0, 0) + 13;
                        byte b2 = $$a[7];
                        short s = b2;
                        Object[] objArr8 = new Object[1];
                        c(b2, s, (byte) s, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, i83, deadChar2, 1501733736, false, (String) objArr8[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16949);
                        int defaultSize = View.getDefaultSize(0, 0) + 2739;
                        int maximumDrawingCacheSize = 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b3 = $$a[7];
                        byte b4 = b3;
                        Object[] objArr9 = new Object[1];
                        c(b4, (short) (b4 | 52), b3, objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, defaultSize, maximumDrawingCacheSize, 47863026, false, (String) objArr9[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                        int i84 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i85 = (i84 & 65) + (i84 | 65);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i85 % 128;
                        int i86 = i85 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (i86 == 0) {
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cRgb = (char) (Color.rgb(0, 0, 0) + 16794165);
                                int keyRepeatTimeout = 2739 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int i87 = 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                Object[] objArr10 = new Object[1];
                                c((byte) 15, (short) 104, $$a[7], objArr10);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, keyRepeatTimeout, i87, 631063962, false, (String) objArr10[0], null);
                            }
                            boolean zContains = set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null));
                            int i88 = 66 / 0;
                            if (zContains) {
                                if (Build.VERSION.SDK_INT == 30) {
                                    int i89 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i90 = (i89 ^ 93) + ((i89 & 93) << 1);
                                    int i91 = i90 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i91;
                                    int i92 = i90 % 2;
                                    int i93 = (i91 & 77) + (i91 | 77);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i93 % 128;
                                    int i94 = i93 % 2;
                                    i5 = i;
                                    r31 = i4;
                                }
                            }
                        } else {
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16948);
                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2739;
                                int minimumFlingVelocity = 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                Object[] objArr11 = new Object[1];
                                c((byte) 15, (short) 104, $$a[7], objArr11);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, pressedStateDuration, minimumFlingVelocity, 631063962, false, (String) objArr11[0], null);
                            }
                            if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                                if (Build.VERSION.SDK_INT == 30) {
                                    int i810 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i95 = (i810 ^ 93) + ((i810 & 93) << 1);
                                    int i96 = i95 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i96;
                                    int i97 = i95 % 2;
                                    int i98 = (i96 & 77) + (i96 | 77);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i98 % 128;
                                    int i99 = i98 % 2;
                                    i5 = i;
                                    r31 = i4;
                                }
                            }
                        }
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i20 = (i100 & 15) + (i100 | 15);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        Object[] objArr12 = new Object[1];
                                        a(new int[]{-746843779, -96085828, 1136673697, -2043639538, 1346956157, -69677561, 1831669733, 18551562, 595518113, 786459353, 182740834, -1055086640, -2003942146, -79829227, 593824619, -867622205}, 67 >> TextUtils.indexOf((CharSequence) "", 'Q'), objArr12);
                                        obj = objArr12[0];
                                    } else {
                                        try {
                                            int[] iArr6 = {-746843779, -96085828, 1136673697, -2043639538, 1346956157, -69677561, 1831669733, 18551562, 595518113, 786459353, 182740834, -1055086640, -2003942146, -79829227, 593824619, -867622205};
                                            int i101 = -TextUtils.indexOf((CharSequence) "", '0');
                                            int i102 = (i101 & 27) + (i101 | 27);
                                            Object[] objArr13 = new Object[1];
                                            a(iArr6, i102, objArr13);
                                            obj = objArr13[0];
                                        } catch (Exception unused) {
                                            context2 = i4;
                                            i6 = 0;
                                            r32 = context2;
                                        }
                                    }
                                    try {
                                        Object[] objArr14 = {(String) obj};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            try {
                                                char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                                int scrollBarFadeDuration = 993 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                int fadingEdgeLength = 8 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                try {
                                                    Object[] objArr15 = new Object[1];
                                                    c((byte) 52, (short) 141, $$a[5], objArr15);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, scrollBarFadeDuration, fadingEdgeLength, 410748506, false, (String) objArr15[0], new Class[]{String.class});
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr14)).longValue();
                                        long j = 1107672191;
                                        long j2 = 829;
                                        long j3 = (j2 * j) + (j2 * jLongValue);
                                        long j4 = -828;
                                        long j5 = -1;
                                        r32 = i4;
                                        long j6 = ((long) i) ^ j5;
                                        long j7 = j3 + (((((j ^ j5) | (jLongValue ^ j5)) ^ j5) | (((j6 | j) | jLongValue) ^ j5)) * j4);
                                        long j8 = jLongValue | j;
                                        long j9 = j7 + (j4 * (j6 | j8)) + (((long) 828) * (j5 ^ j8)) + ((long) (-1308590428));
                                        int i103 = ~i;
                                        int i104 = ((int) (j9 >> 32)) & (1972008040 + (((~(2034888127 | i103)) | (~(822852757 | i103))) * (-867)) + (((~(2034888127 | i)) | (-2035023296) | (~(822852757 | i))) * (-1734)) + (((~(2035023295 | i103)) | (~((-135169) | i)) | (~((-1212170539) | i))) * 867));
                                        int i105 = ((int) j9) & (414878832 + ((~((-1075855361) | i)) * 623) + ((134349077 | i103) * (-623)) + (((~((-1899623585) | i)) | 1075855360 | (~(958117301 | i))) * 623));
                                        i6 = (i104 & i105) | (i104 ^ i105);
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } else {
                                    context2 = i4;
                                    iArr = new int[]{1083920484, 525226273, 93123770, 2058728089};
                                    int i106 = -TextUtils.getOffsetBefore("", 0);
                                    int i107 = i106 * (-405);
                                    int i108 = ((i107 | 407) << 1) - (i107 ^ 407);
                                    int i109 = ~(((-2) ^ i) | ((-2) & i));
                                    i9 = ~i;
                                    int i110 = ~(i9 | i106 | 1);
                                    int i111 = ((i109 & i110) | (i109 ^ i110)) * (-406);
                                    int i112 = (i108 ^ i111) + ((i108 & i111) << 1);
                                    int i113 = ((-2) & i9) | ((-2) ^ i9);
                                    int i114 = -(-((~((i113 & i106) | (i113 ^ i106))) * (-406)));
                                    i10 = (i112 ^ i114) + ((i114 & i112) << 1);
                                    int i115 = ~i106;
                                    int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i117 = ((i116 | 3) << 1) - (i116 ^ 3);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i117 % 128;
                                    i11 = i117 % 2;
                                    i12 = ~((i115 & i) | (i115 ^ i));
                                    if (i11 != 0) {
                                        int i118 = ~i;
                                        int i119 = i10 >> (406 - (i12 | (~((i118 & 1) | (i118 ^ 1)))));
                                        Object[] objArr16 = new Object[1];
                                        a(iArr, i119, objArr16);
                                        str2 = (String) objArr16[0];
                                        iArr2 = new int[]{-958818982, -193110919, 1788491377, -1159425104, -41107278, -875671362, -1490069697, 738978233, 347763111, 802185092};
                                        edgeSlop = ViewConfiguration.getEdgeSlop() % 40;
                                        i82 = 85;
                                    } else {
                                        int i120 = (i12 | (~((i9 ^ 1) | (i9 & 1)))) * 406;
                                        int i121 = (i10 & i120) + (i120 | i10);
                                        Object[] objArr17 = new Object[1];
                                        a(iArr, i121, objArr17);
                                        str2 = (String) objArr17[0];
                                        iArr2 = new int[]{-958818982, -193110919, 1788491377, -1159425104, -41107278, -875671362, -1490069697, 738978233, 347763111, 802185092};
                                        edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                                    }
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i122 = ((edgeSlop * (-813)) - (~(-(-(i82 * 408))))) - 1;
                                    int i123 = ~i82;
                                    int i124 = ~(i123 | edgeSlop);
                                    int i125 = ~(edgeSlop | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    i13 = i122 + (((i124 ^ i125) | (i124 & i125)) * (-814));
                                    int i126 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i14 = ~((i123 & i126) | (i123 ^ i126));
                                    i15 = ~edgeSlop;
                                    i16 = (i15 ^ i82) | (i15 & i82);
                                    int i127 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i17 = ((i127 | 81) << 1) - (i127 ^ 81);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        int i128 = ~i16;
                                        int i129 = (i128 & i14) | (i14 ^ i128);
                                        int i130 = ~((edgeSlop ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (edgeSlop & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                        i18 = i13 % (407 >> ((i129 & i130) | (i129 ^ i130)));
                                        i15 = ~edgeSlop;
                                        i19 = (i15 ^ i82) | (i15 & i82);
                                    } else {
                                        int i131 = ~i16;
                                        int i132 = (i131 & i14) | (i14 ^ i131);
                                        int i133 = ~((edgeSlop ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (edgeSlop & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                        i18 = i13 + (((i132 & i133) | (i132 ^ i133)) * 407);
                                        int i134 = ~edgeSlop;
                                        i19 = (i134 & i82) | (i134 ^ i82);
                                    }
                                    int i135 = ~i19;
                                    int i136 = ~((i15 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i15 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    int i137 = (i135 & i136) | (i135 ^ i136);
                                    int i138 = ~((i82 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i82));
                                    int i139 = i18 + (407 * ((i137 & i138) | (i137 ^ i138)));
                                    Object[] objArr18 = new Object[1];
                                    a(iArr2, i139, objArr18);
                                    try {
                                        objArr = new Object[]{(String) objArr18[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char mirror = (char) (33650 - AndroidCharacter.getMirror('0'));
                                            int i140 = 3086 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                            int edgeSlop2 = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                                            Object[] objArr19 = new Object[1];
                                            c((byte) 52, (short) 141, $$a[5], objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, i140, edgeSlop2, 1411172903, false, (String) objArr19[0], new Class[]{String.class});
                                        }
                                        if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            i6 = 1;
                                            r32 = context2;
                                        } else {
                                            i6 = 0;
                                            r32 = context2;
                                        }
                                    } catch (Throwable th5) {
                                        Throwable cause3 = th5.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th5;
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            context2 = i4;
                        }
                        int i141 = (~(i & 10)) & (i | 10);
                        int i142 = -i6;
                        int i143 = ((i6 & i142) | (i6 ^ i142)) >> 31;
                        int i144 = (~i143) & i;
                        int i145 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i7 = ((i145 | 45) << 1) - (i145 ^ 45);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                        int i146 = i143 & i141;
                        int i147 = (i146 & i144) | (i144 ^ i146);
                        if (i7 % 2 != 0) {
                            i8 = 8;
                        } else {
                            i8 = 32;
                        }
                        ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i148 = i2 & i8;
                        int i149 = -i148;
                        int i150 = ((i148 & i149) | (i148 ^ i149)) >> 31;
                        i5 = (i147 & (~i150)) | (i150 & i);
                        int i151 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i152 = ((i151 | 81) << 1) - (i151 ^ 81);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i152 % 128;
                        int i153 = i152 % 2;
                        r31 = r32;
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i811 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i910 = (i811 ^ 93) + ((i811 & 93) << 1);
                        int i911 = i910 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i911;
                        int i912 = i910 % 2;
                        int i913 = (i911 & 77) + (i911 | 77);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i913 % 128;
                        int i914 = i913 % 2;
                        i5 = i;
                        r31 = i4;
                    } else {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i1010 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i20 = (i1010 & 15) + (i1010 | 15);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                            if (i20 % 2 != 0) {
                                Object[] objArr110 = new Object[1];
                                a(new int[]{-746843779, -96085828, 1136673697, -2043639538, 1346956157, -69677561, 1831669733, 18551562, 595518113, 786459353, 182740834, -1055086640, -2003942146, -79829227, 593824619, -867622205}, 67 >> TextUtils.indexOf((CharSequence) "", 'Q'), objArr110);
                                obj = objArr110[0];
                            } else {
                                int[] iArr7 = {-746843779, -96085828, 1136673697, -2043639538, 1346956157, -69677561, 1831669733, 18551562, 595518113, 786459353, 182740834, -1055086640, -2003942146, -79829227, 593824619, -867622205};
                                int i1011 = -TextUtils.indexOf((CharSequence) "", '0');
                                int i1012 = (i1011 & 27) + (i1011 | 27);
                                Object[] objArr111 = new Object[1];
                                a(iArr7, i1012, objArr111);
                                obj = objArr111[0];
                            }
                            Object[] objArr112 = {(String) obj};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                int scrollBarFadeDuration2 = 993 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int fadingEdgeLength2 = 8 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                Object[] objArr113 = new Object[1];
                                c((byte) 52, (short) 141, $$a[5], objArr113);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask2, scrollBarFadeDuration2, fadingEdgeLength2, 410748506, false, (String) objArr113[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr112)).longValue();
                            long j10 = 1107672191;
                            long j11 = 829;
                            long j12 = (j11 * j10) + (j11 * jLongValue2);
                            long j13 = -828;
                            long j14 = -1;
                            r32 = i4;
                            long j15 = ((long) i) ^ j14;
                            long j16 = j12 + (((((j10 ^ j14) | (jLongValue2 ^ j14)) ^ j14) | (((j15 | j10) | jLongValue2) ^ j14)) * j13);
                            long j17 = jLongValue2 | j10;
                            long j18 = j16 + (j13 * (j15 | j17)) + (((long) 828) * (j14 ^ j17)) + ((long) (-1308590428));
                            int i1013 = ~i;
                            int i1014 = ((int) (j18 >> 32)) & (1972008040 + (((~(2034888127 | i1013)) | (~(822852757 | i1013))) * (-867)) + (((~(2034888127 | i)) | (-2035023296) | (~(822852757 | i))) * (-1734)) + (((~(2035023295 | i1013)) | (~((-135169) | i)) | (~((-1212170539) | i))) * 867));
                            int i1015 = ((int) j18) & (414878832 + ((~((-1075855361) | i)) * 623) + ((134349077 | i1013) * (-623)) + (((~((-1899623585) | i)) | 1075855360 | (~(958117301 | i))) * 623));
                            i6 = (i1014 & i1015) | (i1014 ^ i1015);
                        } else {
                            context2 = i4;
                            iArr = new int[]{1083920484, 525226273, 93123770, 2058728089};
                            int i1016 = -TextUtils.getOffsetBefore("", 0);
                            int i1017 = i1016 * (-405);
                            int i1018 = ((i1017 | 407) << 1) - (i1017 ^ 407);
                            int i1019 = ~(((-2) ^ i) | ((-2) & i));
                            i9 = ~i;
                            int i1110 = ~(i9 | i1016 | 1);
                            int i1111 = ((i1019 & i1110) | (i1019 ^ i1110)) * (-406);
                            int i1112 = (i1018 ^ i1111) + ((i1018 & i1111) << 1);
                            int i1113 = ((-2) & i9) | ((-2) ^ i9);
                            int i1114 = -(-((~((i1113 & i1016) | (i1113 ^ i1016))) * (-406)));
                            i10 = (i1112 ^ i1114) + ((i1114 & i1112) << 1);
                            int i1115 = ~i1016;
                            int i1116 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i1117 = ((i1116 | 3) << 1) - (i1116 ^ 3);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1117 % 128;
                            i11 = i1117 % 2;
                            i12 = ~((i1115 & i) | (i1115 ^ i));
                            if (i11 != 0) {
                                int i1118 = ~i;
                                int i1119 = i10 >> (406 - (i12 | (~((i1118 & 1) | (i1118 ^ 1)))));
                                Object[] objArr114 = new Object[1];
                                a(iArr, i1119, objArr114);
                                str2 = (String) objArr114[0];
                                iArr2 = new int[]{-958818982, -193110919, 1788491377, -1159425104, -41107278, -875671362, -1490069697, 738978233, 347763111, 802185092};
                                edgeSlop = ViewConfiguration.getEdgeSlop() % 40;
                                i82 = 85;
                            } else {
                                int i1210 = (i12 | (~((i9 ^ 1) | (i9 & 1)))) * 406;
                                int i1211 = (i10 & i1210) + (i1210 | i10);
                                Object[] objArr115 = new Object[1];
                                a(iArr, i1211, objArr115);
                                str2 = (String) objArr115[0];
                                iArr2 = new int[]{-958818982, -193110919, 1788491377, -1159425104, -41107278, -875671362, -1490069697, 738978233, 347763111, 802185092};
                                edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                            }
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i1212 = ((edgeSlop * (-813)) - (~(-(-(i82 * 408))))) - 1;
                            int i1213 = ~i82;
                            int i1214 = ~(i1213 | edgeSlop);
                            int i1215 = ~(edgeSlop | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            i13 = i1212 + (((i1214 ^ i1215) | (i1214 & i1215)) * (-814));
                            int i1216 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i14 = ~((i1213 & i1216) | (i1213 ^ i1216));
                            i15 = ~edgeSlop;
                            i16 = (i15 ^ i82) | (i15 & i82);
                            int i1217 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i17 = ((i1217 | 81) << 1) - (i1217 ^ 81);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                            if (i17 % 2 != 0) {
                                int i1218 = ~i16;
                                int i1219 = (i1218 & i14) | (i14 ^ i1218);
                                int i1310 = ~((edgeSlop ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (edgeSlop & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                i18 = i13 % (407 >> ((i1219 & i1310) | (i1219 ^ i1310)));
                                i15 = ~edgeSlop;
                                i19 = (i15 ^ i82) | (i15 & i82);
                            } else {
                                int i1311 = ~i16;
                                int i1312 = (i1311 & i14) | (i14 ^ i1311);
                                int i1313 = ~((edgeSlop ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (edgeSlop & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                i18 = i13 + (((i1312 & i1313) | (i1312 ^ i1313)) * 407);
                                int i1314 = ~edgeSlop;
                                i19 = (i1314 & i82) | (i1314 ^ i82);
                            }
                            int i1315 = ~i19;
                            int i1316 = ~((i15 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i15 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            int i1317 = (i1315 & i1316) | (i1315 ^ i1316);
                            int i1318 = ~((i82 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i82));
                            int i1319 = i18 + (407 * ((i1317 & i1318) | (i1317 ^ i1318)));
                            Object[] objArr116 = new Object[1];
                            a(iArr2, i1319, objArr116);
                            objArr = new Object[]{(String) objArr116[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char mirror2 = (char) (33650 - AndroidCharacter.getMirror('0'));
                                int i1410 = 3086 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int edgeSlop3 = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                                Object[] objArr117 = new Object[1];
                                c((byte) 52, (short) 141, $$a[5], objArr117);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror2, i1410, edgeSlop3, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                            }
                            if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                i6 = 1;
                                r32 = context2;
                            } else {
                                i6 = 0;
                                r32 = context2;
                            }
                        }
                        int i1411 = (~(i & 10)) & (i | 10);
                        int i1412 = -i6;
                        int i1413 = ((i6 & i1412) | (i6 ^ i1412)) >> 31;
                        int i1414 = (~i1413) & i;
                        int i1415 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i7 = ((i1415 | 45) << 1) - (i1415 ^ 45);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                        int i1416 = i1413 & i1411;
                        int i1417 = (i1416 & i1414) | (i1414 ^ i1416);
                        if (i7 % 2 != 0) {
                            i8 = 8;
                        } else {
                            i8 = 32;
                        }
                        ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i1418 = i2 & i8;
                        int i1419 = -i1418;
                        int i154 = ((i1418 & i1419) | (i1418 ^ i1419)) >> 31;
                        i5 = (i1417 & (~i154)) | (i154 & i);
                        int i155 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i156 = ((i155 | 81) << 1) - (i155 ^ 81);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i156 % 128;
                        int i157 = i156 % 2;
                        r31 = r32;
                    }
                    int i158 = (~((i & r31) == true ? 1 : 0)) & ((i | r31) == true ? 1 : 0);
                    int i159 = -i158;
                    int i160 = ((i158 & i159) | (i158 ^ i159)) >> 31;
                    int i161 = i5 & (~i160);
                    int i162 = r31 & i160;
                    int i163 = (i161 & i162) | (i161 ^ i162);
                    int i164 = ((~i163) & i) | ((~i) & i163);
                    int i165 = -i164;
                    Object[] objArr20 = {new int[]{i}, new int[1], new int[]{i163}, null};
                    int iMyPid = Process.myPid();
                    int i166 = (-968814334) + (((~(967030092 | iMyPid)) | 1007340321) * (-366)) + (((~(iMyPid | 1034682221)) | 939688192) * 366);
                    int i167 = -(-((((i164 & i165) | (i164 ^ i165)) >> 31) & 16));
                    int i168 = (i166 & i167) + (i167 | i166);
                    int i169 = ((i3 | i168) << 1) - (i3 ^ i168);
                    int i170 = i169 << 13;
                    int i171 = (i169 | i170) & (~(i169 & i170));
                    int i172 = i171 >>> 17;
                    int i173 = ((~i171) & i172) | ((~i172) & i171);
                    int i174 = i173 << 5;
                    ((int[]) objArr20[1])[0] = (i173 | i174) & (~(i173 & i174));
                    return objArr20;
                } catch (Throwable th6) {
                    Throwable cause4 = th6.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th6;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, byte r7, short r8) {
                /*
                    int r6 = r6 * 4
                    int r6 = 3 - r6
                    int r8 = r8 * 56
                    int r8 = 122 - r8
                    int r7 = r7 * 2
                    int r7 = 1 - r7
                    byte[] r0 = com.google.android.gms.internal.mlkit_vision_common.zzkt.$$c
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r7
                    r5 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    int r6 = r6 + 1
                    if (r5 != r7) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L26:
                    r3 = r0[r6]
                L28:
                    int r3 = -r3
                    int r8 = r8 + r3
                    r3 = r5
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzkt.$$e(byte, byte, short):java.lang.String");
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        this.zzh = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzku
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sharedPrefManager.getMlSdkInstanceId();
            }
        });
        zzr zzrVar = zzb;
        this.zzj = zzrVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzrVar.get(str)) : -1;
    }

    private static zzp zzd() {
        synchronized (zzkx.class) {
            zzp zzpVar = zza;
            if (zzpVar != null) {
                return zzpVar;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzm zzmVar = new zzm();
            for (int i = 0; i < locales.size(); i++) {
                zzmVar.zzb(CommonUtils.languageTagFromLocale(locales.get(i)));
            }
            zzp zzpVarZzc = zzmVar.zzc();
            zza = zzpVarZzc;
            return zzpVarZzc;
        }
    }

    final /* synthetic */ String zza() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzb(zzkp zzkpVar, zzhs zzhsVar, String str) {
        zzkpVar.zza(zzhsVar);
        String strZzc = zzkpVar.zzc();
        zzjo zzjoVar = new zzjo();
        zzjoVar.zzb(this.zzc);
        zzjoVar.zzc(this.zzd);
        zzjoVar.zzh(zzd());
        zzjoVar.zzg(true);
        zzjoVar.zzl(strZzc);
        zzjoVar.zzj(str);
        zzjoVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzjoVar.zzd(10);
        zzjoVar.zzk(Integer.valueOf(this.zzj));
        zzkpVar.zzb(zzjoVar);
        this.zze.zza(zzkpVar);
    }

    public final void zzc(zzlh zzlhVar, final zzhs zzhsVar) {
        zzhg zzhgVar;
        zzhl zzhlVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzk.get(zzhsVar) != null && jElapsedRealtime - ((Long) this.zzk.get(zzhsVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.zzk.put(zzhsVar, Long.valueOf(jElapsedRealtime));
        int i = zzlhVar.zza;
        int i2 = zzlhVar.zzb;
        int i3 = zzlhVar.zzc;
        int i4 = zzlhVar.zzd;
        int i5 = zzlhVar.zze;
        long j = zzlhVar.zzf;
        int i6 = zzlhVar.zzg;
        zzhk zzhkVar = new zzhk();
        if (i == -1) {
            zzhgVar = zzhg.BITMAP;
        } else if (i == 35) {
            zzhgVar = zzhg.YUV_420_888;
        } else if (i == 842094169) {
            zzhgVar = zzhg.YV12;
        } else if (i != 16) {
            zzhgVar = i != 17 ? zzhg.UNKNOWN_FORMAT : zzhg.NV21;
        } else {
            zzhgVar = zzhg.NV16;
        }
        zzhkVar.zzd(zzhgVar);
        if (i2 == 1) {
            zzhlVar = zzhl.BITMAP;
        } else if (i2 == 2) {
            zzhlVar = zzhl.BYTEARRAY;
        } else if (i2 != 3) {
            zzhlVar = i2 != 4 ? zzhl.ANDROID_MEDIA_IMAGE : zzhl.FILEPATH;
        } else {
            zzhlVar = zzhl.BYTEBUFFER;
        }
        zzhkVar.zzf(zzhlVar);
        zzhkVar.zzc(Integer.valueOf(i3));
        zzhkVar.zze(Integer.valueOf(i4));
        zzhkVar.zzg(Integer.valueOf(i5));
        zzhkVar.zzb(Long.valueOf(j));
        zzhkVar.zzh(Integer.valueOf(i6));
        zzhn zzhnVarZzj = zzhkVar.zzj();
        zzht zzhtVar = new zzht();
        zzhtVar.zzd(zzhnVarZzj);
        final zzkp zzkpVarZze = zzky.zze(zzhtVar);
        final String version = this.zzg.isSuccessful() ? (String) this.zzg.getResult() : LibraryVersion.getInstance().getVersion(this.zzi);
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzkv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzkpVarZze, zzhsVar, version);
            }
        });
    }
}
