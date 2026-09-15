package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.os.UserManagerCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.codec.binary.Hex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {
    private final Context applicationContext;
    private final Executor backgroundExecutor;
    private final Set<HeartBeatConsumer> consumers;
    private final Provider<HeartBeatInfoStorage> storageProvider;
    private final Provider<UserAgentPublisher> userAgentProvider;
    private static final byte[] $$c = {48, -110, 22, 55};
    private static final int $$f = 58;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, 6, -99, -107, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -27, 1};
    private static final int $$e = 171;
    private static final byte[] $$a = {114, -59, 10, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 61;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] b = {45565, 51636, 16756, 55612, 20715, 59563, 24668, 63576, 29635, 35737, 782, 39629, 4781, 43617, 8764, 48611, 13713, 19833, 50460, 23745, 54407, 27721, 45561, 51638, 16753, 55614, 20727, 59559, 24668, 63524, 29641, 35723, 844, 39658, 4797, 43647, 8749, 45558, 51643, 16742, 55599, 20650, 59566, 24665, 63512, 29643, 35780, 883, 39655, 4775, 43622, 8749, 48619, 45557, 51646, 16757, 55584, 20720, 59563, 24652, 63503, 29668, 35723, 851, 39670, 4759, 43645, 8748, 48611};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -3026232345778402854L;

    private static void a(byte b2, int i, byte b3, Object[] objArr) {
        int i2 = (b2 * 4) + 84;
        int i3 = i * 15;
        byte[] bArr = $$a;
        int i4 = b3 + 4;
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i5 + i4) - 11;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4 + 1;
            i2 = (i2 + bArr[i8]) - 11;
            i4 = i8;
            i6 = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.firebase.heartbeatinfo.DefaultHeartBeatController.$$d
            int r6 = 99 - r6
            int r8 = r8 * 47
            int r1 = 48 - r8
            int r7 = r7 * 47
            int r7 = 51 - r7
            byte[] r1 = new byte[r1]
            int r8 = 47 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2c:
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + 3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.heartbeatinfo.DefaultHeartBeatController.d(byte, short, short, java.lang.Object[]):void");
    }

    public Task<Void> registerHeartBeat() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.consumers.size() > 0) {
            if (UserManagerCompat.isUserUnlocked(this.applicationContext)) {
                Task<Void> taskCall = Tasks.call(this.backgroundExecutor, new Callable() { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f$0.m7958x734756b4();
                    }
                });
                int i4 = TuitionPaymentFragmentbindingInflater1 + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                return taskCall;
            }
            Task<Void> taskForResult = Tasks.forResult(null);
            int i6 = TuitionPaymentFragmentbindingInflater1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            return taskForResult;
        }
        int i8 = TuitionPaymentFragmentbindingInflater1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        int i9 = i8 % 2;
        return Tasks.forResult(null);
    }

    /* JADX INFO: renamed from: lambda$registerHeartBeat$0$com-google-firebase-heartbeatinfo-DefaultHeartBeatController, reason: not valid java name */
    /* synthetic */ Void m7958x734756b4() throws Exception {
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43042);
            int doubleTapTimeout = 3111 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i = 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, doubleTapTimeout, i, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(ViewConfiguration.getFadingEdgeLength() >> 16, 22 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(Color.green(0) + 22, 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Process.myPid() >> 22), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0'));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 3111;
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 | 51), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, scrollBarSize, maximumFlingVelocity, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) (Color.green(0) + 43042);
                int offsetAfter = 3111 - TextUtils.getOffsetAfter("", 0);
                int maximumDrawingCacheSize = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr2 = $$a;
                byte b5 = bArr2[7];
                byte b6 = bArr2[132];
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 | 102), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, offsetAfter, maximumDrawingCacheSize, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr7[2])[0];
            int i3 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i3};
            int i4 = ~((int) Runtime.getRuntime().maxMemory());
            int i5 = ((1631630771 + (((~((-772324605) | i4)) | (-932706855)) * (-983))) + (((~(i4 | (-932706855))) | 295125506) * 983)) - 2079405212;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i2}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(Drawable.resolveOpacity(0, 0) + 37, ((byte) KeyEvent.getModifierMetaStateMask()) + 17, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(53 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.normalizeMetaState(0) + 16, (char) Color.red(0), objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -2079405212};
                byte[] bArr3 = $$d;
                byte b7 = bArr3[50];
                byte b8 = (byte) (b7 - 1);
                byte b9 = b7;
                Object[] objArr11 = new Object[1];
                d(b8, b9, (byte) (b9 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b10 = bArr3[50];
                byte b11 = b10;
                Object[] objArr12 = new Object[1];
                d(b11, (byte) (b11 - 1), b10, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 43042);
                    int modifierMetaStateMask = 3110 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr4 = $$a;
                    byte b12 = bArr4[7];
                    byte b13 = bArr4[132];
                    Object[] objArr13 = new Object[1];
                    a(b12, b13, (byte) (b13 | 102), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, modifierMetaStateMask, iLastIndexOf, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(ViewConfiguration.getKeyRepeatTimeout() >> 16, 22 - (Process.myPid() >> 22), (char) ExpandableListView.getPackedPositionGroup(0L), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(22 - View.getDefaultSize(0, 0), 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) Color.blue(0), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetAfter2 = (char) (43042 - TextUtils.getOffsetAfter("", 0));
                        int gidForName = Process.getGidForName("") + 3112;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 23;
                        byte b14 = $$a[7];
                        byte b15 = b14;
                        Object[] objArr16 = new Object[1];
                        a(b14, b15, (byte) (b15 | 51), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter2, gidForName, iLastIndexOf2, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (43043 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int scrollBarFadeDuration = 3111 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i8 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                        byte[] bArr5 = $$a;
                        byte b16 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        a(b16, b16, bArr5[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, scrollBarFadeDuration, i8, -1272852037, false, (String) objArr17[0], null);
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArr[0])[0];
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int i14 = ~((int) Runtime.getRuntime().maxMemory());
            int i15 = i11 + 793279242 + ((~(1671409122 | i14)) * 52) + (((~(35327328 | i14)) | (~((-1669704131) | i14)) | 1636081794) * (-52)) + (((~(i14 | (-35327329))) | 1704992) * 52);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
            Object[] objArr18 = {new int[1], new int[]{i13}, new int[]{i12}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr2 = new int[i10];
            int i18 = i10 - 1;
            iArr2[i18] = 1;
            Toast.makeText((Context) null, iArr2[((i10 * i18) % 2) - 1], 1).show();
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iMyTid = Process.myTid();
            int i22 = (~((-895407182) | iMyTid)) | 809549893;
            int i23 = i19 + 2117985602 + (i22 * 992) + ((i22 | (~((~iMyTid) | 895481565))) * (-496)) + ((iMyTid | 809624277) * 496);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[0])[0] = i25 ^ (i25 << 5);
            Object[] objArr19 = {new int[1], new int[]{i21}, new int[]{i20}, strArr4};
        }
        synchronized (this) {
            this.storageProvider.get().storeHeartBeat(System.currentTimeMillis(), this.userAgentProvider.get().getUserAgent());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0222  */
    /* JADX WARN: Code duplicated, block: B:53:0x0223  */
    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        char c2;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            c2 = '0';
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(b[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2187, Color.red(0) + 40, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 33017), 3010 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getTouchSlop() >> 8) + 26, 321985076, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36506 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3376 - TextUtils.getOffsetAfter("", 0), 17 - View.MeasureSpec.getSize(0), -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i5 = $10 + 37;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 57;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (Process.myTid() >> 22)), TextUtils.indexOf("", "") + 3376, 16 - TextUtils.lastIndexOf("", c2), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b10 = (byte) (-1);
                byte b11 = (byte) (b10 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 36505), 3376 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 17, -968507904, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            c2 = '0';
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task<String> getHeartBeatsHeader() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            UserManagerCompat.isUserUnlocked(this.applicationContext);
            throw null;
        }
        if (!UserManagerCompat.isUserUnlocked(this.applicationContext)) {
            return Tasks.forResult("");
        }
        Task<String> taskCall = Tasks.call(this.backgroundExecutor, new DefaultHeartBeatController$$ExternalSyntheticLambda1(this));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return taskCall;
    }

    /* JADX INFO: renamed from: lambda$getHeartBeatsHeader$1$com-google-firebase-heartbeatinfo-DefaultHeartBeatController, reason: not valid java name */
    /* synthetic */ String m7957x341e14f2() throws Exception {
        String string;
        synchronized (this) {
            HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
            List<HeartBeatResult> allHeartBeats = heartBeatInfoStorage.getAllHeartBeats();
            heartBeatInfoStorage.deleteAllHeartBeats();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < allHeartBeats.size(); i++) {
                HeartBeatResult heartBeatResult = allHeartBeats.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", heartBeatResult.getUserAgent());
                jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.getUsedDates()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", ExifInterface.GPS_MEASUREMENT_2D);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes(Hex.DEFAULT_CHARSET_NAME));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    string = byteArrayOutputStream.toString(Hex.DEFAULT_CHARSET_NAME);
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        return string;
    }

    private DefaultHeartBeatController(final Context context, final String str, Set<HeartBeatConsumer> set, Provider<UserAgentPublisher> provider, Executor executor) {
        this(new Lazy(new Provider() { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return DefaultHeartBeatController.lambda$new$2(context, str);
            }
        }), set, executor, provider, context);
    }

    static /* synthetic */ HeartBeatInfoStorage lambda$new$2(Context context, String str) {
        int i = 2 % 2;
        HeartBeatInfoStorage heartBeatInfoStorage = new HeartBeatInfoStorage(context, str);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return heartBeatInfoStorage;
    }

    DefaultHeartBeatController(Provider<HeartBeatInfoStorage> provider, Set<HeartBeatConsumer> set, Executor executor, Provider<UserAgentPublisher> provider2, Context context) {
        this.storageProvider = provider;
        this.consumers = set;
        this.backgroundExecutor = executor;
        this.userAgentProvider = provider2;
        this.applicationContext = context;
    }

    static /* synthetic */ DefaultHeartBeatController lambda$component$3(Qualified qualified, ComponentContainer componentContainer) {
        int i = 2 % 2;
        DefaultHeartBeatController defaultHeartBeatController = new DefaultHeartBeatController((Context) componentContainer.get(Context.class), ((FirebaseApp) componentContainer.get(FirebaseApp.class)).getPersistenceKey(), (Set<HeartBeatConsumer>) componentContainer.setOf(HeartBeatConsumer.class), (Provider<UserAgentPublisher>) componentContainer.getProvider(UserAgentPublisher.class), (Executor) componentContainer.get(qualified));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return defaultHeartBeatController;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Component<DefaultHeartBeatController> component() {
        int i = 2 % 2;
        final Qualified qualified = Qualified.qualified(Background.class, Executor.class);
        Component<DefaultHeartBeatController> componentBuild = Component.builder(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.setOf((Class<?>) HeartBeatConsumer.class)).add(Dependency.requiredProvider((Class<?>) UserAgentPublisher.class)).add(Dependency.required((Qualified<?>) qualified)).factory(new ComponentFactory() { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda2
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultHeartBeatController.lambda$component$3(qualified, componentContainer);
            }
        }).build();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return componentBuild;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public HeartBeatInfo.HeartBeat getHeartBeatCode(String str) {
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
            if (heartBeatInfoStorage.shouldSendGlobalHeartBeat(jCurrentTimeMillis)) {
                heartBeatInfoStorage.postHeartBeatCleanUp();
                return HeartBeatInfo.HeartBeat.GLOBAL;
            }
            return HeartBeatInfo.HeartBeat.NONE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r8 = r8 * 3
            int r8 = r8 + 109
            byte[] r1 = com.google.firebase.heartbeatinfo.DefaultHeartBeatController.$$c
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.heartbeatinfo.DefaultHeartBeatController.$$g(byte, byte, byte):java.lang.String");
    }
}
