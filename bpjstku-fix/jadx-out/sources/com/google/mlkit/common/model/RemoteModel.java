package com.google.mlkit.common.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzw;
import com.google.android.gms.internal.mlkit_common.zzx;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RemoteModel {
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char[] b;
    public static final Map zza;
    private static final Map zzb;
    private final String zzc;
    private final BaseModel zzd;
    private final ModelType zze;
    private String zzf;
    private static final byte[] $$c = {117, -15, -81, 1};
    private static final int $$f = 185;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, -90, 68, -23, 22, 11, 19, -41, 45, 13, 3, -7, 37, -22, 48, 9, 6, 15, 9, -23, 43, 8, -3, 6, 22, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$e = 172;
    private static final byte[] $$a = {68, 104, -93, -37, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 123;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f827a = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zzb = new EnumMap(BaseModel.class);
        zza = new EnumMap(BaseModel.class);
        int i = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    protected RemoteModel(String str, BaseModel baseModel, ModelType modelType) {
        boolean z = true;
        if (TextUtils.isEmpty(str) == (baseModel != null)) {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = i + 77;
            f827a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = i + 53;
            f827a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "One of cloud model name and base model cannot be empty");
        this.zzc = str;
        this.zzd = baseModel;
        this.zze = modelType;
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        f827a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static void c(byte b2, byte b3, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i = 98 - (b3 * 14);
        int i2 = 56 - (s * 52);
        byte[] bArr2 = new byte[53 - b2];
        int i3 = 52 - b2;
        int i4 = -1;
        if (bArr == null) {
            i = (i + i3) - 10;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i = (i + bArr[i2]) - 10;
                i2++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.mlkit.common.model.RemoteModel.$$d
            int r6 = r6 * 31
            int r1 = r6 + 22
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r1 = new byte[r1]
            int r6 = r6 + 21
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r0[r8]
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.model.RemoteModel.e(int, int, byte, java.lang.Object[]):void");
    }

    public boolean baseModelHashMatches(String str) {
        int i = 2 % 2;
        int i2 = f827a + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        BaseModel baseModel = this.zzd;
        if (baseModel == null) {
            return false;
        }
        boolean zEquals = str.equals(zzb.get(baseModel));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        f827a = i3 % 128;
        int i4 = i3 % 2;
        return zEquals;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == this) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
            f827a = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof RemoteModel)) {
            int i3 = f827a + 121;
            int i4 = i3 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 55;
            f827a = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        RemoteModel remoteModel = (RemoteModel) obj;
        if (!Objects.equal(this.zzc, remoteModel.zzc) || (!Objects.equal(this.zzd, remoteModel.zzd)) || !Objects.equal(this.zze, remoteModel.zze)) {
            return false;
        }
        int i8 = f827a + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0245  */
    public String getModelNameForBackend() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
            int mode = View.MeasureSpec.getMode(0) + 921;
            int iRgb = Color.rgb(0, 0, 0) + 16777244;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[80], bArr[37], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, mode, iRgb, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{'\b', 30, 1, 21, '\r', '\b', 1, '!', 15, '\r', ' ', Typography.quote, 16, '\r', 0, 29, 5, '\r', 20, 17, 18, 3}, (byte) (TextUtils.indexOf("", "") + 78), 'F' - AndroidCharacter.getMirror('0'), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{29, 18, '\b', 24, 18, 30, 4, 5, 30, '\f', 29, 11, '\r', 7, 13872}, (byte) (TextUtils.getCapsMode("", 0, 0) + 49), TextUtils.indexOf("", "", 0, 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31533);
            int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
            int iNormalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            byte b3 = bArr2[37];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, i2, iNormalizeMetaState, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            f827a = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char longPressTimeout = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int iAxisFromString = 920 - MotionEvent.axisFromString("");
                int iIndexOf = TextUtils.indexOf("", "") + 28;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr3[33], bArr3[37], bArr3[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iAxisFromString, iIndexOf, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ((((~((-715683282) | iIdentityHashCode)) | 364752155) * 398) - 2089122777) + (((~((~iIdentityHashCode) | (-715683282))) | 364752155) * 398) + 1450554688;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            int i8 = f827a + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 3;
            }
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{'\b', 30, 1, 21, '\r', '\b', 1, '!', '\b', 24, 25, ' ', 23, 22, 1, 11, 31, 6, 3, 17, 16, 7, 18, 25, '\t', 0}, (byte) (ExpandableListView.getPackedPositionType(0L) + 60), 26 - View.combineMeasuredStates(0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{20, 3, 13824, 13824, 26, 30, 4, 23, 13826, 13826, 19, 11, 18, '\t', 1, 11, 20, 2}, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 24), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = f827a + 85;
                int i11 = i10 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
                int i12 = i10 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i13 = i11 + 79;
                    f827a = i13 % 128;
                    int i14 = i13 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                        f827a = i15 % 128;
                        int i16 = i15 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{24, 11, 0, '\f', '#', 19, '\b', 30, 31, 1, 3, 21, 17, 0, 25, 0}, (byte) (16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 17, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{'\t', 1, 26, 30, 1, 11, 3, 17, 24, '\f', 16, 6, '\f', 15, 0, 27}, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 120), 15 - Process.getGidForName(""), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i17 = f827a + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
            int i18 = i17 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1450554688};
                byte[] bArr4 = $$d;
                byte b4 = (byte) (bArr4[58] - 1);
                byte b5 = bArr4[28];
                Object[] objArr13 = new Object[1];
                e(b4, b5, (byte) (b5 + 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[58];
                Object[] objArr14 = new Object[1];
                e(b6, (byte) (-bArr4[31]), b6, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
                    int iAxisFromString2 = 27 - MotionEvent.axisFromString("");
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    c(bArr5[33], bArr5[37], bArr5[80], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, offsetBefore, iAxisFromString2, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    d(new char[]{'\b', 30, 1, 21, '\r', '\b', 1, '!', 15, '\r', ' ', Typography.quote, 16, '\r', 0, 29, 5, '\r', 20, 17, 18, 3}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 79), Drawable.resolveOpacity(0, 0) + 22, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    d(new char[]{29, 18, '\b', 24, 18, 30, 4, 5, 30, '\f', 29, 11, '\r', 7, 13872}, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 48), 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (31533 - TextUtils.indexOf("", ""));
                        int offsetBefore2 = 921 - TextUtils.getOffsetBefore("", 0);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                        byte[] bArr6 = $$a;
                        byte b7 = bArr6[80];
                        byte b8 = bArr6[37];
                        Object[] objArr18 = new Object[1];
                        c(b7, b8, b8, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, offsetBefore2, maxKeyCode, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 28;
                        byte[] bArr7 = $$a;
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, bArr7[80], bArr7[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iIndexOf2, jumpTapTimeout2, -1048449946, false, (String) objArr19[0], null);
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
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 == i19) {
            int i21 = f827a + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = i23 + 808541329 + (((~((~iIdentityHashCode2) | (-1250717633))) | 167792320) * 446) + (((~(iIdentityHashCode2 | (-1082925313))) | 355569691) * 446) + 1820930688;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr20[0])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
            int i27 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i28 = ~iIdentityHashCode3;
            int i29 = i27 + 338222638 + (((~((-1503803557) | i28)) | (~(1505639927 | iIdentityHashCode3))) * (-831)) + ((~((-1235363841) | iIdentityHashCode3)) * (-1662)) + (((~(iIdentityHashCode3 | 1503803556)) | (~(i28 | (-270276088))) | (~(270276087 | iIdentityHashCode3))) * 831);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr21[0])[0] = i31 ^ (i31 << 5);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) zza.get(this.zzd);
        int i32 = f827a + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 14 / 0;
        }
        return str3;
    }

    public String getUniqueModelNameForPersist() {
        int i = 2 % 2;
        String str = this.zzc;
        if (str != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            f827a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 17 / 0;
            }
            return str;
        }
        String strConcat = "COM.GOOGLE.BASE_".concat(String.valueOf((String) zza.get(this.zzd)));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        f827a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return strConcat;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        f827a = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Objects.hashCode(this.zzc, this.zzd, this.zze);
        int i4 = f827a + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = f827a + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzw zzwVarZzb = zzx.zzb("RemoteModel");
        zzwVarZzb.zza("modelName", this.zzc);
        zzwVarZzb.zza("baseModel", this.zzd);
        zzwVarZzb.zza("modelType", this.zze);
        String string = zzwVarZzb.toString();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        f827a = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private static void d(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = 8;
        char c = 3;
        if (cArr2 != null) {
            int i6 = $10 + 41;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> i5);
                        int iKeyCodeFromString = 2267 - KeyEvent.keyCodeFromString("");
                        int iRed = 33 - Color.red(0);
                        byte b3 = (byte) ($$c[c] - 1);
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, iKeyCodeFromString, iRed, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i4 = 1770390596;
                    i5 = 8;
                    c = 3;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266;
            int size = 33 - View.MeasureSpec.getSize(0);
            byte b5 = (byte) ($$c[3] - 1);
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, i9, size, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49268);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3261;
                        int keyRepeatDelay2 = 30 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b7 = $$c[3];
                        byte b8 = (byte) (b7 - 1);
                        byte b9 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, keyRepeatDelay, keyRepeatDelay2, -127612708, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22877);
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 594;
                            int iRed2 = Color.red(0) + 17;
                            byte b10 = (byte) ($$c[3] - 1);
                            byte b11 = (byte) (b10 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iIndexOf, iRed2, 1570859318, false, $$g(b10, b11, (byte) (b11 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                        int i11 = $10 + 49;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 3 % 4;
                        }
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        } else {
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                            int i17 = $11 + 37;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public String getModelHash() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        int i3 = i2 % 128;
        f827a = i3;
        int i4 = i2 % 2;
        String str = this.zzf;
        int i5 = i3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getModelName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        f827a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzc;
        }
        throw null;
    }

    public ModelType getModelType() {
        int i = 2 % 2;
        int i2 = f827a + 21;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        ModelType modelType = this.zze;
        int i5 = i3 + 65;
        f827a = i5 % 128;
        if (i5 % 2 != 0) {
            return modelType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isBaseModel() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 91;
        f827a = i3 % 128;
        int i4 = i3 % 2;
        if (this.zzd != null) {
            return true;
        }
        int i5 = i2 + 107;
        f827a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return false;
    }

    public void setModelHash(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 105;
        f827a = i3 % 128;
        int i4 = i3 % 2;
        this.zzf = str;
        int i5 = i2 + 59;
        f827a = i5 % 128;
        int i6 = i5 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        b = new char[]{60048, 60054, 60046, 60063, 60073, 60047, 60058, 60050, 59744, 59745, 60051, 59746, 60040, 60079, 60052, 60034, 59747, 60088, 60083, 60041, 59748, 60056, 60090, 60055, 60062, 60060, 60043, 60059, 59749, 60049, 60045, 60117, 60053, 60072, 60061, 60057};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r1 = com.google.mlkit.common.model.RemoteModel.$$c
            int r7 = r7 + 113
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.model.RemoteModel.$$g(byte, int, byte):java.lang.String");
    }
}
