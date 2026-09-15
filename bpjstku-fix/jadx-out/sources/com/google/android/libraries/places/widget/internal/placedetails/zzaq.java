package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import com.google.android.libraries.places.internal.zzor;
import com.google.android.libraries.places.internal.zzot;
import com.google.android.libraries.places.internal.zzoy;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
final class zzaq extends SuspendLambda implements Function2 {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ zzbp zzc;
    final /* synthetic */ ImageView zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            final zzar zzarVar = this.zzb;
            zzoy zzoyVar = zzarVar.zzb;
            if (zzoyVar != null) {
                zzbp zzbpVar = this.zzc;
                zzor zzorVarZze = zzoyVar.zze();
                Uri uriZza = ((zzbl) zzbpVar).zza();
                final ImageView imageView = this.zzd;
                Intrinsics.checkNotNull(imageView);
                this.zza = 1;
                if (zzorVarZze.zza(uriZza, new zzot(imageView, new Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzap
                    private static final byte[] $$c = {7, 15, 25, 25};
                    private static final int $$f = 190;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$d = {94, -1, 37, -59, 41, 9, 7, 21, 8, -9, 9, 18, 1, -10, 42, 5, -4, 3, 10, 10, 22, -38, 59, 4, -7, 21, 4, -5, 19, -17, 46, -3, 14, -4, 5, 23, -3, 2, -15, 29, 20, -3, 10, 5, -41, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -59};
                    private static final int $$e = 180;
                    private static final byte[] $$a = {55, -47, -47, 67, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
                    private static final int $$b = 208;
                    private static int b = 0;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
                    private static int[] TuitionPaymentFragmentbindingInflater1 = {81607584, -577420684, 1438210360, -810478347, -1400322624, 1070929912, -631279267, -1810797850, 674345619, 1113349, 1283617753, -2117870563, -845666300, 747477451, -1312731228, -1959084367, 537417606, -1247764404};

                    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
                        /*
                            int r8 = 53 - r8
                            int r6 = r6 * 14
                            int r6 = 98 - r6
                            int r7 = r7 * 52
                            int r7 = 55 - r7
                            byte[] r0 = com.google.android.libraries.places.widget.internal.placedetails.zzap.$$a
                            byte[] r1 = new byte[r8]
                            r2 = 0
                            if (r0 != 0) goto L15
                            r3 = r6
                            r6 = r8
                            r4 = r2
                            goto L29
                        L15:
                            r3 = r2
                        L16:
                            int r4 = r3 + 1
                            byte r5 = (byte) r6
                            r1[r3] = r5
                            int r7 = r7 + 1
                            if (r4 != r8) goto L27
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            r9[r2] = r6
                            return
                        L27:
                            r3 = r0[r7]
                        L29:
                            int r6 = r6 + r3
                            int r6 = r6 + (-10)
                            r3 = r4
                            goto L16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.placedetails.zzap.a(byte, short, byte, java.lang.Object[]):void");
                    }

                    private static void d(byte b2, short s, short s2, Object[] objArr) {
                        int i2 = b2 * 11;
                        byte[] bArr = $$d;
                        int i3 = 45 - (s * 41);
                        int i4 = 84 - (s2 * 16);
                        byte[] bArr2 = new byte[53 - i2];
                        int i5 = 52 - i2;
                        int i6 = -1;
                        if (bArr == null) {
                            i3++;
                            i4 = (i3 + i5) - 8;
                        }
                        while (true) {
                            int i7 = i4;
                            int i8 = i3;
                            i6++;
                            bArr2[i6] = (byte) i7;
                            if (i6 == i5) {
                                objArr[0] = new String(bArr2, 0);
                                return;
                            } else {
                                i3 = i8 + 1;
                                i4 = (i7 + bArr[i8]) - 8;
                            }
                        }
                    }

                    private static void c(int[] iArr, int i2, Object[] objArr) throws Throwable {
                        int i3 = 2;
                        int i4 = 2 % 2;
                        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length * 2];
                        int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
                        int i5 = -1870535734;
                        int i6 = 1;
                        int i7 = 0;
                        if (iArr2 != null) {
                            int i8 = $10 + 1;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            int length = iArr2.length;
                            int[] iArr3 = new int[length];
                            int i10 = 0;
                            while (i10 < length) {
                                int i11 = $11 + 5;
                                $10 = i11 % 128;
                                int i12 = i11 % i3;
                                try {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[i7] = Integer.valueOf(iArr2[i10]);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b2 = (byte) 1;
                                        byte b3 = (byte) (b2 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getTrimmedLength("") + 3291, Drawable.resolveOpacity(i7, i7) + 31, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                                    }
                                    iArr3[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                    i10++;
                                    i3 = 2;
                                    i5 = -1870535734;
                                    i7 = 0;
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
                        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
                        if (iArr5 != null) {
                            int length3 = iArr5.length;
                            int[] iArr6 = new int[length3];
                            int i13 = $11 + 99;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            int i15 = 0;
                            while (i15 < length3) {
                                try {
                                    Object[] objArr3 = new Object[i6];
                                    objArr3[0] = Integer.valueOf(iArr5[i15]);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b4 = (byte) i6;
                                        byte b5 = (byte) (b4 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 3291 - TextUtils.getCapsMode("", 0, 0), 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                    }
                                    iArr6[i15] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                                    i15++;
                                    iArr5 = iArr5;
                                    i6 = 1;
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }
                            iArr5 = iArr6;
                        }
                        System.arraycopy(iArr5, 0, iArr4, 0, length2);
                        int i16 = 2;
                        sessionConfigValidatingBuilder.b = 2;
                        while (sessionConfigValidatingBuilder.b < iArr.length) {
                            int i17 = $10 + 1;
                            $11 = i17 % 128;
                            int i18 = i17 % i16;
                            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                            for (int i19 = 17; i19 > 1; i19--) {
                                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i19];
                                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 2559 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            }
                            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            Object[] objArr5 = {sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (AndroidCharacter.getMirror('0') + 28831), 349 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
                            }
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                            sessionConfigValidatingBuilder.b += 2;
                            i16 = 2;
                        }
                        objArr[0] = new String(cArr2, 0, i2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj2) throws Throwable {
                        Object[] objArr;
                        int i2 = 2 % 2;
                        int i3 = b + 91;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                        int i4 = i3 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int i5 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                            byte[] bArr = $$a;
                            Object[] objArr2 = new Object[1];
                            a(bArr[80], bArr[37], (byte) ($$b >>> 2), objArr2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i5, modifierMetaStateMask, -1048449946, false, (String) objArr2[0], null);
                        }
                        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                        Object[] objArr3 = new Object[1];
                        c(new int[]{-1051842174, 828073078, -305057925, 203632142, -650687307, -248914710, -434140716, 302076931, -1040906195, -819140047, 1240244754, 1750122539, 357577867, -1666712680}, (Process.myTid() >> 22) + 22, objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        c(new int[]{-1687512662, -624654742, -1445575600, 59676275, 1572356123, -533250837, 1057830707, -1158891260, -204878473, 1957005298}, AndroidCharacter.getMirror('0') - '!', objArr4);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
                            int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int gidForName = Process.getGidForName("") + 29;
                            byte[] bArr2 = $$a;
                            byte b2 = bArr2[37];
                            Object[] objArr5 = new Object[1];
                            a(b2, b2, bArr2[80], objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, jumpTapTimeout, gidForName, -778300370, false, (String) objArr5[0], null);
                        }
                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                            int i6 = b + 53;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                            int i7 = i6 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 921;
                                int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                byte[] bArr3 = $$a;
                                Object[] objArr6 = new Object[1];
                                a(bArr3[37], bArr3[80], bArr3[33], objArr6);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, iNormalizeMetaState, maximumDrawingCacheSize, -1142834547, false, (String) objArr6[0], null);
                            }
                            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                            int iNextInt = new Random().nextInt();
                            int i8 = (((((~((-369099779) | iNextInt)) | 4065889) * 449) - 99164457) + (((~((~iNextInt) | (-369099779))) | 4065889) * 449)) - 223246085;
                            int i9 = (i8 << 13) ^ i8;
                            int i10 = i9 ^ (i9 >>> 17);
                            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                        } else {
                            Object[] objArr8 = new Object[1];
                            c(new int[]{-795794806, -1495723936, 332008198, 46206772, 1809244381, -689662772, -128969945, -1528333366, -1614065970, 1046871251, 1153438290, 1584896949, -1066027407, 1985448587, -1312868594, -947187983}, TextUtils.indexOf("", "") + 26, objArr8);
                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            c(new int[]{1661775814, -1888767562, -1293713673, 2083517933, -1737886514, 1849973862, 2005455043, -1707206739, 431698948, 475612166, -286387727, 1956184223}, View.combineMeasuredStates(0, 0) + 18, objArr9);
                            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                            if (applicationContext != null) {
                                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                            }
                            Object[] objArr10 = new Object[1];
                            c(new int[]{1268348363, 1748638295, -216914385, 175175816, -682214319, -1594805070, 607446729, -129692566, 983591705, -1207990738}, 15 - ExpandableListView.getPackedPositionChild(0L), objArr10);
                            Class<?> cls3 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            c(new int[]{60230148, 1641394584, -1600551279, -999665351, -1262509611, -1725238000, -170675556, 1784687394, 818209126, -533635258}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr11);
                            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                            b = i11 % 128;
                            int i12 = i11 % 2;
                            try {
                                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -223246085};
                                byte[] bArr4 = $$d;
                                byte b3 = bArr4[12];
                                byte b4 = b3;
                                Object[] objArr13 = new Object[1];
                                d(b3, b4, b4, objArr13);
                                Class<?> cls4 = Class.forName((String) objArr13[0]);
                                byte b5 = bArr4[55];
                                byte b6 = b5;
                                Object[] objArr14 = new Object[1];
                                d(b5, b6, b6, objArr14);
                                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 921;
                                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
                                    byte[] bArr5 = $$a;
                                    Object[] objArr15 = new Object[1];
                                    a(bArr5[37], bArr5[80], bArr5[33], objArr15);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, pressedStateDuration, packedPositionChild, -1142834547, false, (String) objArr15[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                try {
                                    Object[] objArr16 = new Object[1];
                                    c(new int[]{-1051842174, 828073078, -305057925, 203632142, -650687307, -248914710, -434140716, 302076931, -1040906195, -819140047, 1240244754, 1750122539, 357577867, -1666712680}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, objArr16);
                                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                                    Object[] objArr17 = new Object[1];
                                    c(new int[]{-1687512662, -624654742, -1445575600, 59676275, 1572356123, -533250837, 1057830707, -1158891260, -204878473, 1957005298}, ImageFormat.getBitsPerPixel(0) + 16, objArr17);
                                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char scrollDefaultDelay = (char) (31533 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                                        int i13 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                                        byte[] bArr6 = $$a;
                                        byte b7 = bArr6[37];
                                        Object[] objArr18 = new Object[1];
                                        a(b7, b7, bArr6[80], objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay, i13, windowTouchSlop, -778300370, false, (String) objArr18[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                                        int i14 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int i15 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        byte[] bArr7 = $$a;
                                        Object[] objArr19 = new Object[1];
                                        a(bArr7[80], bArr7[37], (byte) ($$b >>> 2), objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask2, i14, i15, -1048449946, false, (String) objArr19[0], null);
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
                        int i16 = ((int[]) objArr[1])[0];
                        int i17 = ((int[]) objArr[3])[0];
                        if (i17 != i16) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr[4];
                            if (strArr != null) {
                                int i18 = b + 7;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                                int i19 = i18 % 2;
                                for (String str : strArr) {
                                    arrayList.add(str);
                                }
                            }
                            throw new RuntimeException(String.valueOf(i17));
                        }
                        int i20 = ((int[]) objArr[0])[0];
                        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                        int iMyPid = Process.myPid();
                        int i21 = i20 + (((~(iMyPid | 774650240)) | 999429403) * 56) + 968529619 + (((~((~iMyPid) | 999429403)) | 774650240) * 56);
                        int i22 = (i21 << 13) ^ i21;
                        int i23 = i22 ^ (i22 >>> 17);
                        ((int[]) objArr20[0])[0] = i23 ^ (i23 << 5);
                        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        zzar zzarVar2 = zzarVar;
                        ImageView imageView2 = imageView;
                        Intrinsics.checkNotNull(imageView2);
                        zzarVar2.zzh(imageView2);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$g(byte r6, int r7, short r8) {
                        /*
                            byte[] r0 = com.google.android.libraries.places.widget.internal.placedetails.zzap.$$c
                            int r6 = r6 * 56
                            int r6 = 122 - r6
                            int r8 = r8 * 2
                            int r1 = 1 - r8
                            int r7 = r7 * 2
                            int r7 = 4 - r7
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            int r8 = 0 - r8
                            if (r0 != 0) goto L19
                            r3 = r7
                            r7 = r8
                            r4 = r2
                            goto L2e
                        L19:
                            r3 = r2
                        L1a:
                            byte r4 = (byte) r6
                            r1[r3] = r4
                            if (r3 != r8) goto L25
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L25:
                            r4 = r0[r7]
                            int r3 = r3 + 1
                            r5 = r7
                            r7 = r6
                            r6 = r4
                            r4 = r3
                            r3 = r5
                        L2e:
                            int r6 = -r6
                            int r6 = r6 + r7
                            int r7 = r3 + 1
                            r3 = r4
                            goto L1a
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.placedetails.zzap.$$g(byte, int, short):java.lang.String");
                    }
                }), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaq(zzar zzarVar, zzbp zzbpVar, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzarVar;
        this.zzc = zzbpVar;
        this.zzd = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzaq(this.zzb, this.zzc, this.zzd, continuation);
    }
}
