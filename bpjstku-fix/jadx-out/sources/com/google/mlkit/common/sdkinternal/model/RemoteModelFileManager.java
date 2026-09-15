package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_common.zziy;
import com.google.android.gms.internal.mlkit_common.zzje;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.internal.mlkit_common.zznb;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class RemoteModelFileManager {
    private static int[] TuitionPaymentFragmentbindingInflater1;
    private static int b;
    private static final GmsLogger zza;
    private final MlKitContext zzb;
    private final String zzc;
    private final ModelType zzd;
    private final ModelValidator zze;
    private final RemoteModelFileMover zzf;
    private final SharedPrefManager zzg;
    private final ModelFileHelper zzh;
    private static final byte[] $$c = {58, -51, 54, -115};
    private static final int $$f = 197;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {27, -8, 5, 78, -27, -9, 11, -10, 20, 27, -24, 18, -28, 14, 0};
    private static final int $$e = 51;
    private static final byte[] $$a = {99, -43, -44, -62, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 190;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        zza = new GmsLogger("RemoteModelFileManager", "");
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        b = i % 128;
        int i2 = i % 2;
    }

    public RemoteModelFileManager(MlKitContext mlKitContext, RemoteModel remoteModel, ModelValidator modelValidator, ModelFileHelper modelFileHelper, RemoteModelFileMover remoteModelFileMover) throws Throwable {
        String uniqueModelNameForPersist;
        this.zzb = mlKitContext;
        ModelType modelType = remoteModel.getModelType();
        this.zzd = modelType;
        if (modelType != ModelType.TRANSLATE) {
            uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
            if (i % 2 == 0) {
            }
            this.zzc = uniqueModelNameForPersist;
            this.zze = modelValidator;
            this.zzg = SharedPrefManager.getInstance(mlKitContext);
            this.zzh = modelFileHelper;
            this.zzf = remoteModelFileMover;
        }
        uniqueModelNameForPersist = remoteModel.getModelNameForBackend();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        this.zzc = uniqueModelNameForPersist;
        this.zze = modelValidator;
        this.zzg = SharedPrefManager.getInstance(mlKitContext);
        this.zzh = modelFileHelper;
        this.zzf = remoteModelFileMover;
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
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 1
            byte[] r0 = com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.$$a
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r7 = r7 + 1
            r3 = r0[r7]
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 11
            int r0 = r8 + 1
            int r7 = r7 * 31
            int r7 = 98 - r7
            byte[] r1 = com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.$$d
            int r6 = r6 * 11
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2d
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
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + 3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.d(short, byte, byte, java.lang.Object[]):void");
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
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
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 81;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.red(0) + 3291, Color.alpha(0) + 31, 1948206109, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = 2;
                    i5 = -1870535734;
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
            int i11 = $10 + 7;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr5[i13]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i7;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (MotionEvent.axisFromString("") + i6), View.getDefaultSize(i7, i7) + 3291, (Process.myPid() >> 22) + 31, 1948206109, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i13++;
                iArr5 = iArr5;
                i6 = 1;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            for (int i14 = 17; i14 > 1; i14--) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.argb(0, 0, 0, 0), 2559 - TextUtils.getOffsetBefore("", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 28879), TextUtils.indexOf((CharSequence) "", '0', 0) + 349, 25 - TextUtils.getCapsMode("", 0, 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
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

    public File getModelDirUnsafe(boolean z) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (37567 - (Process.myTid() >> 22));
            int mirror = 673 - AndroidCharacter.getMirror('0');
            int iResolveSize = View.resolveSize(0, 0) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, mirror, iResolveSize, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{-1113310779, -1122904306, -2098912002, -458243459, 1340091188, -730484872, 583679128, 1580798339, -1819891623, -1697484473, 113953799, -2048042429, -1856516493, -1030675226}, KeyEvent.getDeadChar(0, 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{1385612002, -475402181, 1114480842, 881300707, 872926134, 765256579, -366834744, -234528160, 1312721669, 1137569075}, KeyEvent.normalizeMetaState(0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 37567);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 625;
            int iAxisFromString = 13 - MotionEvent.axisFromString("");
            byte b3 = $$a[5];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, edgeSlop, iAxisFromString, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 37568);
                int pressedStateDuration = 625 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int maximumDrawingCacheSize = 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr2 = $$a;
                byte b5 = bArr2[5];
                Object[] objArr6 = new Object[1];
                a(b5, bArr2[7], b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, pressedStateDuration, maximumDrawingCacheSize, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i3};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (((-677398776) + (((~((-1445360059) | iIdentityHashCode)) | 369365258) * 576)) + (((~((~iIdentityHashCode) | (-1075994801))) | 9012804) * 576)) - 1271005215;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{new int[]{i4}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{1947945428, 52697871, 1089637518, -1504005664, -1919048361, -1782430122, -870535634, 957278988, 1191867323, -1549966708, -1737284986, 1873056426, -613693955, 629322624, 2073858274, -945366192}, 26 - View.MeasureSpec.getMode(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{-1746801946, -833862644, -453308697, -1924904770, -1165994690, -432675208, -213163933, -1707030943, -1312396410, 956155039, 561911784, -295180084}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{-1737600932, 1417988121, 1131874322, 1581011158, 1854881665, 140748502, -444158051, 1736446213, 1698050700, -1030626674}, 16 - (Process.myTid() >> 22), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{-1834946830, -2061464797, 239137153, -362552951, -1377602206, -961389647, -1104360271, 766680750, 964428791, -1841884527}, 16 - TextUtils.getOffsetAfter("", 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new int[]{-1038332839, 1012591569, 159634732, 1495291619, 452959048, -22361903, 700601214, -1241345117, 1690636213, 21429252, -1185752510, -715431320, -525901460, 1834508235, 1663366085, 1311138635, 1218130791, 1913753821, 1533166839, 882750843, -909528890, 768609116, -1405231382, -1404008083, 306141920, 1232650522, 607665218, -354484700, 937780584, 1566362172, 557181731, 513326251, 295926054, -1520144048}, (Process.myPid() >> 22) + 64, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new int[]{-1457276173, 1755454613, -479132374, -1735740360, 1119487458, 1852023278, -361310599, 1677692368, -1593250708, -1459252059, -1789680085, -1723330656, -89190730, -346325049, -1929924543, -2032295764, -2003136153, 274179778, 836429531, 1771430209, 987847937, -386208064, -1923941249, 1751732269, -420842281, 325935377, 1164955540, -727406531, -806155401, -372938387, -83713567, 2144090506, 1765552560, -1701035234}, Drawable.resolveOpacity(0, 0) + 64, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 722970977};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[14];
                byte b7 = (byte) (b6 + 1);
                Object[] objArr15 = new Object[1];
                d(b6, b7, b7, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = (byte) ($$e & 5);
                byte b9 = bArr3[14];
                Object[] objArr16 = new Object[1];
                d(b8, b9, b9, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i8 = ((int[]) objArr17[0])[0];
                int i9 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionGroup = (char) (37567 - ExpandableListView.getPackedPositionGroup(0L));
                        int i10 = 625 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int mirror2 = '>' - AndroidCharacter.getMirror('0');
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[5];
                        Object[] objArr18 = new Object[1];
                        a(b10, bArr4[7], b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, i10, mirror2, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new int[]{-1113310779, -1122904306, -2098912002, -458243459, 1340091188, -730484872, 583679128, 1580798339, -1819891623, -1697484473, 113953799, -2048042429, -1856516493, -1030675226}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new int[]{1385612002, -475402181, 1114480842, 881300707, 872926134, 765256579, -366834744, -234528160, 1312721669, 1137569075}, 15 - TextUtils.indexOf("", "", 0, 0), objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 37567);
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 625;
                            int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14;
                            byte b11 = $$a[5];
                            byte b12 = b11;
                            Object[] objArr21 = new Object[1];
                            a(b11, b12, b12, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, touchSlop, i11, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 37567);
                            int longPressTimeout = 625 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            int i12 = 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b13 = bArr5[7];
                            Object[] objArr22 = new Object[1];
                            a(b13, bArr5[5], b13, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, longPressTimeout, i12, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] == ((int[]) objArr[0])[0]) {
            int i13 = ((int[]) objArr[1])[0];
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i16 = i13 + (-1080911748) + ((~(1073479654 | startUptimeMillis)) * (-301)) + (((~((-771488615) | startUptimeMillis)) | (~((~startUptimeMillis) | 1052249506))) * (-301)) + (((~(startUptimeMillis | (-1052249507))) | (-771488615)) * 301);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr[1])[0] = i18 ^ (i18 << 5);
            Object[] objArr23 = {new int[]{i15}, new int[1], new int[]{i14}, strArr2};
            return this.zzh.getModelDirUnsafe(this.zzc, this.zzd, z);
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 == null) {
            throw null;
        }
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
        while (true) {
            int i20 = i19 % 2;
            if (i2 >= strArr3.length) {
                throw null;
            }
            arrayList.add(strArr3[i2]);
            i2++;
            i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
        }
    }

    public File moveModelToPrivateFolder(ParcelFileDescriptor parcelFileDescriptor, String str, RemoteModel remoteModel) throws MlKitException {
        MlKitException mlKitException;
        File fileMoveAllFilesFromPrivateTempToPrivateDestination;
        ModelValidator modelValidator;
        synchronized (this) {
            File file = new File(this.zzh.zza(this.zzc, this.zzd), "to_be_validated_model.tmp");
            ModelValidator.ValidationResult validationResultValidateModel = null;
            try {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = autoCloseInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                            try {
                                autoCloseInputStream.close();
                            } catch (Throwable th) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                            }
                            throw th;
                        }
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        autoCloseInputStream.close();
                        boolean zZza = ModelUtils.zza(file, str);
                        if (zZza && (modelValidator = this.zze) != null) {
                            validationResultValidateModel = modelValidator.validateModel(file, remoteModel);
                            if (validationResultValidateModel.getErrorCode().equals(ModelValidator.ValidationResult.ErrorCode.TFLITE_VERSION_INCOMPATIBLE)) {
                                String appVersion = CommonUtils.getAppVersion(this.zzb.getApplicationContext());
                                this.zzg.setIncompatibleModelInfo(remoteModel, str, appVersion);
                                GmsLogger gmsLogger = zza;
                                gmsLogger.d("RemoteModelFileManager", "Model is not compatible. Model hash: ".concat(String.valueOf(str)));
                                gmsLogger.d("RemoteModelFileManager", "The current app version is: ".concat(String.valueOf(appVersion)));
                            }
                        }
                        if (zZza && (validationResultValidateModel == null || validationResultValidateModel.isValid())) {
                            fileMoveAllFilesFromPrivateTempToPrivateDestination = this.zzf.moveAllFilesFromPrivateTempToPrivateDestination(file);
                        }
                        if (!zZza) {
                            zza.d("RemoteModelFileManager", "Hash does not match with expected: ".concat(String.valueOf(str)));
                            zznb.zzb("common").zzf(zzmt.zzg(), remoteModel, zziy.MODEL_HASH_MISMATCH, true, this.zzd, zzje.SUCCEEDED);
                            mlKitException = new MlKitException("Hash does not match with expected", 102);
                        } else {
                            mlKitException = new MlKitException("Model is not compatible with TFLite run time", 100);
                        }
                        if (!file.delete()) {
                            zza.d("RemoteModelFileManager", "Failed to delete the temp file: ".concat(String.valueOf(file.getAbsolutePath())));
                            throw mlKitException;
                        }
                        throw mlKitException;
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    autoCloseInputStream.close();
                    throw th4;
                }
            } catch (IOException e2) {
                zza.e("RemoteModelFileManager", "Failed to copy downloaded model file to private folder: ".concat(e2.toString()));
                return null;
            }
        }
        return fileMoveAllFilesFromPrivateTempToPrivateDestination;
    }

    public final File zza(File file) throws MlKitException {
        synchronized (this) {
            File file2 = new File(String.valueOf(this.zzh.getModelDir(this.zzc, this.zzd).getAbsolutePath()).concat("/0"));
            if (file2.exists()) {
                return file;
            }
            return file.renameTo(file2) ? file2 : file;
        }
    }

    public final String zzb() throws MlKitException {
        String strZzb;
        synchronized (this) {
            strZzb = this.zzh.zzb(this.zzc, this.zzd);
        }
        return strZzb;
    }

    public final void zzc(File file) {
        synchronized (this) {
            File modelDirUnsafe = getModelDirUnsafe(false);
            if (modelDirUnsafe.exists()) {
                File[] fileArrListFiles = modelDirUnsafe.listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.equals(file)) {
                        this.zzh.deleteRecursively(file);
                        return;
                    }
                }
            }
        }
    }

    public final boolean zzd(File file) throws MlKitException {
        synchronized (this) {
            File modelDir = this.zzh.getModelDir(this.zzc, this.zzd);
            if (!modelDir.exists()) {
                return false;
            }
            File[] fileArrListFiles = modelDir.listFiles();
            boolean z = true;
            if (fileArrListFiles == null) {
                return true;
            }
            for (File file2 : fileArrListFiles) {
                if (!file2.equals(file) && !this.zzh.deleteRecursively(file2)) {
                    z = false;
                }
            }
            return z;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = new int[]{-1062609139, -170694313, -384231298, 2062523525, 1962630319, 1190065698, 1768428089, 906476988, -1303751393, -502393065, -855452821, 872750616, -162156831, 1038177758, -1687780570, 1779211488, -1685814508, -1335385575};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.$$c
            int r8 = r8 * 56
            int r8 = 122 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2c
        L19:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r4 = r1[r8]
            int r3 = r3 + 1
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r8 = r8 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.$$g(int, byte, int):java.lang.String");
    }
}
