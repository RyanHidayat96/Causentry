package com.nbs.nucleo.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionProcessor;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0018\u0010\u000b\u001a\u0006*\u00020\u00040\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/nbs/nucleo/utils/ImagePickerUtils;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroid/content/Context;", "Landroid/content/Context;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "ResultImage"}, k = 1, mv = {2, 3, 0})
public final class ImagePickerUtils {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Context b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ImagePickerUtils() {
        Context contextTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.b = contextTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String packageName = contextTuitionPaymentFragmentspecialinlinedviewModeldefault2.getPackageName();
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) packageName, '.', 0, false, 6, (Object) null);
        if (packageName == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = packageName.substring(iLastIndexOf$default + 1);
        Intrinsics.checkExpressionValueIsNotNull(strSubstring, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = StringsKt.capitalize(strSubstring);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = contextTuitionPaymentFragmentspecialinlinedviewModeldefault2.getPackageName();
    }

    /* JADX INFO: renamed from: com.nbs.nucleo.utils.ImagePickerUtils$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/nbs/nucleo/utils/ImagePickerUtils$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0})
    public static final class Companion {
        private static final byte[] $$c = {0, -94, -62, -97};
        private static final int $$d = 1;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {82, Base64.padSymbol, -66, -42};
        private static final int $$b = 196;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static long b = 6131675804737447837L;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.nbs.nucleo.utils.ImagePickerUtils.Companion.$$a
                int r6 = r6 * 3
                int r1 = r6 + 1
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r8 = r8 * 4
                int r8 = 98 - r8
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2e
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r7 = -r7
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nbs.nucleo.utils.ImagePickerUtils.Companion.c(short, int, int, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            while (abortcapture.b < cArrB.length) {
                int i3 = $11 + 101;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i5 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMyTid = (char) ((Process.myTid() >> 22) + 64838);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1357;
                        int iArgb = 38 - Color.argb(0, 0, 0, 0);
                        byte b2 = $$c[0];
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iLastIndexOf, iArgb, 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 47774), 469 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 13 - View.getDefaultSize(0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
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
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            int i6 = $11 + 59;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0531  */
        /* JADX WARN: Code duplicated, block: B:104:0x053e  */
        /* JADX WARN: Code duplicated, block: B:107:0x0587  */
        /* JADX WARN: Code duplicated, block: B:108:0x05c9  */
        /* JADX WARN: Code duplicated, block: B:111:0x0675  */
        /* JADX WARN: Code duplicated, block: B:46:0x024d  */
        /* JADX WARN: Code duplicated, block: B:47:0x024e A[Catch: Exception -> 0x02c5, TRY_LEAVE, TryCatch #6 {Exception -> 0x02c5, blocks: (B:33:0x020f, B:36:0x023a, B:38:0x0240, B:47:0x024e, B:55:0x02a2, B:56:0x02a9, B:59:0x02be, B:60:0x02c4, B:44:0x0247, B:49:0x0267, B:51:0x0288), top: B:131:0x020f, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x0298  */
        /* JADX WARN: Code duplicated, block: B:56:0x02a9 A[Catch: Exception -> 0x02c5, TRY_LEAVE, TryCatch #6 {Exception -> 0x02c5, blocks: (B:33:0x020f, B:36:0x023a, B:38:0x0240, B:47:0x024e, B:55:0x02a2, B:56:0x02a9, B:59:0x02be, B:60:0x02c4, B:44:0x0247, B:49:0x0267, B:51:0x0288), top: B:131:0x020f, inners: #7 }] */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) throws Throwable {
            int i3;
            String line;
            int i4;
            Object[] objArr;
            String[] strArr;
            Object[] objArr2;
            int i5;
            int i6;
            Object obj;
            String[] strArr2;
            Object[] objArr3;
            int i7;
            int i8;
            int i9;
            int iTuitionPaymentFragmentbindingInflater1;
            int i10;
            int i11;
            int i12;
            boolean zEquals;
            String str;
            FileReader fileReader;
            BufferedReader bufferedReader;
            Object[] objArr4;
            int i13 = 2 % 2;
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i15 = (i14 ^ 31) + ((i14 & 31) << 1);
            int i16 = i15 % 128;
            TuitionPaymentFragmentbindingInflater1 = i16;
            try {
                String[] strArr3 = i15 % 2 != 0 ? new String[3] : new String[2];
                int i17 = i16 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                if (i17 % 2 == 0) {
                    Object[] objArr5 = new Object[1];
                    a(new char[]{18325, 20831, 18428, 65132, 3571, 7383, 26078, 58471, 28699, 54477, 11753, 11337, 10280, 60670, 62945, 21589, 57407, 42126, 48563, 39973, 38993, 31889, 34222}, Color.green(0), objArr5);
                    strArr3[0] = (String) objArr5[0];
                } else {
                    int i18 = -Color.green(0);
                    int i19 = ((i18 | 1) << 1) - (i18 ^ 1);
                    Object[] objArr6 = new Object[1];
                    a(new char[]{18325, 20831, 18428, 65132, 3571, 7383, 26078, 58471, 28699, 54477, 11753, 11337, 10280, 60670, 62945, 21589, 57407, 42126, 48563, 39973, 38993, 31889, 34222}, i19, objArr6);
                    strArr3[0] = (String) objArr6[0];
                }
                int i20 = -(-View.getDefaultSize(0, 0));
                int i21 = ((i20 | 1) << 1) - (i20 ^ 1);
                Object[] objArr7 = new Object[1];
                a(new char[]{28347, 55866, 28364, 60024, 60223, 38816, 29159, 698, 22846, 24499, 14845, 51876, 268, 26523, 57842, 45715, 51485, 12272, 43429, 31469, 45422, 63459}, i21, objArr7);
                strArr3[1] = (String) objArr7[0];
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i23 = ((i22 | 65) << 1) - (i22 ^ 65);
                TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                int i24 = i23 % 2 != 0 ? 1 : 0;
                while (true) {
                    if (i24 >= 2) {
                        i3 = i;
                        break;
                    }
                    int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i26 = (i25 & 61) + (i25 | 61);
                    TuitionPaymentFragmentbindingInflater1 = i26 % 128;
                    int i27 = i26 % 2;
                    String str2 = strArr3[i24];
                    Object[] objArr8 = new Object[1];
                    a(new char[]{47306, 33663, 47275, 32750, 19963, 52970, 58492, 42104, 36681, 1777, 44136, 27656, 55165, 16095, 29710, 5238, 8043, 30370, 15393, 56361}, -TextUtils.lastIndexOf("", '0'), objArr8);
                    Class<?> cls = Class.forName((String) objArr8[0]);
                    if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(cls, null)).booleanValue()) {
                        i3 = (i & (-2)) | ((~i) & 1);
                        int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i29 = (i28 ^ 123) + ((i28 & 123) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i29 % 128;
                        int i30 = i29 % 2;
                        break;
                    }
                    int i31 = i24 + 73;
                    i24 = (i31 | (-72)) + (i31 & (-72));
                }
            } catch (Exception unused) {
                i3 = i ^ 2;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cRed = (char) (2419 - Color.red(0));
                    int i32 = 2846 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int iMyPid = (Process.myPid() >> 22) + 5;
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    Object[] objArr9 = new Object[1];
                    c(b2, b3, b3, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, i32, iMyPid, -501222268, false, (String) objArr9[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                long j = 144610020;
                long j2 = (((long) 450) * j) + (((long) (-448)) * jLongValue);
                long j3 = 449;
                long j4 = -1;
                long j5 = ((j ^ j4) | jLongValue) ^ j4;
                long j6 = jLongValue ^ j4;
                long j7 = i;
                long j8 = j2 + ((j5 | (((j6 | j) | j7) ^ j4)) * j3) + (((long) (-1347)) * j5) + (j3 * (j5 | (j4 ^ ((j6 | (j7 ^ j4)) | j)))) + ((long) (-1303796706));
                int i33 = ~i;
                int i34 = ((int) (j8 >> 32)) & ((-802173004) + ((1402449818 | i33) * (-369)) + (((~((-1133749915) | i33)) | 303476496) * (-369)) + (((~(1133749914 | i)) | 268699904 | (~((-1098973323) | i33))) * 369));
                int iNextInt = new Random().nextInt(1614552111);
                int i35 = ((int) j8) & ((((-12893015) + (((~((-1921187024) | iNextInt)) | (-936553863)) * (-948))) + ((~((~iNextInt) | (-847424647))) * (-948))) - 19485192);
                int i36 = (i34 & i35) | (i34 ^ i35);
                int i37 = (i36 | 1) & (~(i36 & 1));
                int i38 = -i37;
                int i39 = ((i37 & i38) | (i37 ^ i38)) >> 31;
                int i40 = ((i & (-11)) | (i33 & 10)) & (~i39);
                int i41 = i39 & i;
                int i42 = (i41 & i40) | (i40 ^ i41);
                int i43 = ((~i3) & i) | (i3 & i33);
                int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i45 = (i44 ^ 75) + ((i44 & 75) << 1);
                TuitionPaymentFragmentbindingInflater1 = i45 % 128;
                int i46 = -i43;
                int i47 = i45 % 2 != 0 ? ((i43 & i46) | (i43 ^ i46)) * 101 : ((i43 & i46) | (i43 ^ i46)) >> 31;
                int i48 = i42 & (~i47);
                int i49 = i3 & i47;
                int i50 = (i48 ^ i49) | (i49 & i48);
                try {
                    int i51 = -KeyEvent.normalizeMetaState(0);
                    int i52 = (i51 & 1) + (i51 | 1);
                    Object[] objArr10 = new Object[1];
                    a(new char[]{16680, 15020, 16647, 44484, 986, 30500, 13899, 59992, 30443, 48928, 32323, 8821, 11934, 34586, 42598, 23100, 59016, 53110, 60956, 37402, 40703, 5928, 54806, 51721, 22229, 24408, 7743, 569, 3783, 42752, 18137, 15062, 50734, 61361, 36555, 29393, 65084, 14248, 63206, 43769, 46597, 32648, 16099, 58005}, i52, objArr10);
                    File file = new File((String) objArr10[0]);
                    int i53 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
                    TuitionPaymentFragmentbindingInflater1 = i53 % 128;
                    if (i53 % 2 != 0) {
                        int i54 = 20 / 0;
                        if (file.canRead()) {
                            fileReader = new FileReader(file);
                            bufferedReader = new BufferedReader(fileReader);
                            int i55 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i56 = ((i55 | 59) << 1) - (i55 ^ 59);
                            TuitionPaymentFragmentbindingInflater1 = i56 % 128;
                            int i57 = i56 % 2;
                            try {
                                line = bufferedReader.readLine();
                                char[] cArr = {42489, 57596, 42391, 59852, 41115, 44392, 29258};
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                int i58 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i59 = (i58 ^ 99) + ((i58 & 99) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i59 % 128;
                                int i60 = i59 % 2;
                                objArr4 = new Object[1];
                                a(cArr, (jUptimeMillis > 0L ? 1 : (jUptimeMillis == 0L ? 0 : -1)), objArr4);
                                if (!line.equals((String) objArr4[0])) {
                                    int i61 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                                    TuitionPaymentFragmentbindingInflater1 = i61 % 128;
                                    int i62 = i61 % 2;
                                    fileReader.close();
                                    bufferedReader.close();
                                } else {
                                    fileReader.close();
                                    bufferedReader.close();
                                    int i63 = TuitionPaymentFragmentbindingInflater1;
                                    int i64 = (i63 & 61) + (i63 | 61);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i64 % 128;
                                    int i65 = i64 % 2;
                                }
                            } catch (Throwable th) {
                                fileReader.close();
                                bufferedReader.close();
                                throw th;
                            }
                        }
                        line = null;
                    } else {
                        if (file.canRead()) {
                            fileReader = new FileReader(file);
                            bufferedReader = new BufferedReader(fileReader);
                            int i510 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i511 = ((i510 | 59) << 1) - (i510 ^ 59);
                            TuitionPaymentFragmentbindingInflater1 = i511 % 128;
                            int i512 = i511 % 2;
                            line = bufferedReader.readLine();
                            char[] cArr2 = {42489, 57596, 42391, 59852, 41115, 44392, 29258};
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            int i513 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i514 = (i513 ^ 99) + ((i513 & 99) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i514 % 128;
                            int i66 = i514 % 2;
                            objArr4 = new Object[1];
                            a(cArr2, (jUptimeMillis2 > 0L ? 1 : (jUptimeMillis2 == 0L ? 0 : -1)), objArr4);
                            if (!line.equals((String) objArr4[0])) {
                                int i67 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                                TuitionPaymentFragmentbindingInflater1 = i67 % 128;
                                int i68 = i67 % 2;
                                fileReader.close();
                                bufferedReader.close();
                            } else {
                                fileReader.close();
                                bufferedReader.close();
                                int i69 = TuitionPaymentFragmentbindingInflater1;
                                int i610 = (i69 & 61) + (i69 | 61);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i610 % 128;
                                int i611 = i610 % 2;
                            }
                        }
                        line = null;
                    }
                } catch (Exception unused2) {
                }
                try {
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                    int i70 = ~packedPositionType;
                    int i71 = ((packedPositionType * (-574)) - 574) + (((~(i70 | i33)) | (~((-2) | i))) * 1150);
                    int i72 = ~(((-2) ^ i) | ((-2) & i));
                    int i73 = ~i;
                    int i74 = ~((i73 & 1) | (i73 ^ 1));
                    int i75 = ((i72 & i74) | (i72 ^ i74)) * (-575);
                    int i76 = (i71 & i75) + (i71 | i75);
                    int i77 = ~((i70 ^ i) | (i70 & i));
                    int i78 = ~((i33 ^ packedPositionType) | (packedPositionType & i33));
                    int i79 = ((i77 & i78) | (i77 ^ i78)) * 575;
                    int i80 = ((i76 | i79) << 1) - (i79 ^ i76);
                    Object[] objArr11 = new Object[1];
                    a(new char[]{57652, 49165, 57627, 32508, 61360, 36230, 58744, 1582, 54971, 17861, 44397, 52756, 36511, 32241, 30041, 46620, 18050, 13788, 15651, 32361, 16043, 60864, 1326, 9827, 63177, 42489, 52491, 61026, 44761, 24032, 38371, 54955, 26156, 5383, 24050}, i80, objArr11);
                    File file2 = new File((String) objArr11[0]);
                    if (file2.canRead()) {
                        FileReader fileReader2 = new FileReader(file2);
                        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                        try {
                            String line2 = bufferedReader2.readLine();
                            Object[] objArr12 = new Object[1];
                            a(new char[]{46453, 24836, 46404, 52709, 9818}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr12);
                            boolean zEquals2 = line2.equals((String) objArr12[0]);
                            int i81 = TuitionPaymentFragmentbindingInflater1;
                            int i82 = (i81 & 125) + (i81 | 125);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i82 % 128;
                            int i83 = i82 % 2;
                            fileReader2.close();
                            bufferedReader2.close();
                            if (zEquals2) {
                                try {
                                    int mode = View.MeasureSpec.getMode(0);
                                    int iTuitionPaymentFragmentbindingInflater2 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                    int i84 = (mode * (-380)) + 382;
                                    int i85 = iTuitionPaymentFragmentbindingInflater2 | 1;
                                    int i86 = ~mode;
                                    int i87 = -(-(((i85 & i86) | (i85 ^ i86)) * (-381)));
                                    int i88 = (i84 & i87) + (i84 | i87);
                                    int i89 = ~mode;
                                    int i90 = ~((i89 & (-2)) | (i89 ^ (-2)));
                                    int i91 = ~iTuitionPaymentFragmentbindingInflater2;
                                    int i92 = ~((i91 & 1) | (i91 ^ 1));
                                    int i93 = (i92 & i90) | (i90 ^ i92);
                                    int i94 = ~((mode & 1) | (mode ^ 1));
                                    int i95 = ((i94 & i93) | (i93 ^ i94)) * 381;
                                    int i96 = (((i88 & i95) + (i95 | i88)) - (~(-(-((~((i86 ^ 1) | (i86 & 1))) * 381))))) - 1;
                                    Object[] objArr13 = new Object[1];
                                    a(new char[]{53676, 48079, 53635, 53277, 56101, 63047, 19346, 12967, 58991, 15939, 922, 64138, 48666, 1657, 56255, 33475, 30220, 19989, 37829, 19173, 3707, 38475, 43983, 4854, 50769, 56891, 25574, 56006, 40515, 9827, 15127, 57902, 22201, 28355, 62238, 43566, 28331, 46795, 35620, 29210}, i96, objArr13);
                                    File file3 = new File((String) objArr13[0]);
                                    if (file3.canRead()) {
                                        FileReader fileReader3 = new FileReader(file3);
                                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                        try {
                                            String line3 = bufferedReader3.readLine();
                                            char[] cArr3 = {46453, 24836, 46404, 52709, 9818};
                                            int i97 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            int iTuitionPaymentFragmentbindingInflater3 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                            int i98 = i97 * 319;
                                            int i99 = (i98 & (-317)) + (i98 | (-317));
                                            int i100 = ~i97;
                                            int i101 = ~((i100 & iTuitionPaymentFragmentbindingInflater3) | (i100 ^ iTuitionPaymentFragmentbindingInflater3));
                                            int i102 = ((i99 + (((i101 & (-2)) | ((-2) ^ i101)) * (-318))) - (~(((~(((-2) ^ iTuitionPaymentFragmentbindingInflater3) | ((-2) & iTuitionPaymentFragmentbindingInflater3))) | (~(((~iTuitionPaymentFragmentbindingInflater3) | i97) | 1))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))) - 1;
                                            int i103 = ~iTuitionPaymentFragmentbindingInflater3;
                                            int i104 = ((-2) & i103) | ((-2) ^ i103);
                                            int i105 = ~((i104 & i97) | (i104 ^ i97));
                                            int i106 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
                                            TuitionPaymentFragmentbindingInflater1 = i106 % 128;
                                            if (i106 % 2 != 0) {
                                                int i107 = (i97 & 1) | (i97 ^ 1);
                                                int i108 = ~((i107 & iTuitionPaymentFragmentbindingInflater3) | (i107 ^ iTuitionPaymentFragmentbindingInflater3));
                                                int i109 = (i108 & i105) | (i105 ^ i108);
                                                Object[] objArr14 = new Object[1];
                                                a(cArr3, i102 >> ((i109 & TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (i109 | TypedValues.AttributesType.TYPE_PIVOT_TARGET)), objArr14);
                                                str = (String) objArr14[0];
                                            } else {
                                                int i110 = (i97 & 1) | (i97 ^ 1);
                                                int i111 = ~((i110 & iTuitionPaymentFragmentbindingInflater3) | (i110 ^ iTuitionPaymentFragmentbindingInflater3));
                                                int i112 = -(-(((i111 & i105) | (i105 ^ i111)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                                int i113 = ((i102 | i112) << 1) - (i112 ^ i102);
                                                Object[] objArr15 = new Object[1];
                                                a(cArr3, i113, objArr15);
                                                str = (String) objArr15[0];
                                            }
                                            zEquals = line3.equals(str);
                                            int i114 = TuitionPaymentFragmentbindingInflater1 + 53;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i114 % 128;
                                            int i115 = i114 % 2;
                                            fileReader3.close();
                                            bufferedReader3.close();
                                        } catch (Throwable th2) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            throw th2;
                                        }
                                    } else {
                                        int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                                        TuitionPaymentFragmentbindingInflater1 = i116 % 128;
                                        int i117 = i116 % 2;
                                        zEquals = false;
                                    }
                                } catch (Exception unused3) {
                                }
                                if (!(!zEquals)) {
                                    int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i119 = (i118 ^ 57) + ((i118 & 57) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i119 % 128;
                                    i12 = 2;
                                    int i120 = i119 % 2;
                                    if (line != null) {
                                        int i121 = i118 + 123;
                                        int i122 = i121 % 128;
                                        TuitionPaymentFragmentbindingInflater1 = i122;
                                        int i123 = i121 % 2;
                                        objArr = new Object[]{new int[]{(~(i & 20)) & (i | 20)}, new String[]{line}};
                                        i4 = (i122 & 23) + (i122 | 23);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                                    }
                                }
                                objArr = new Object[i12];
                                objArr[0] = new int[]{i};
                                objArr[1] = new String[0];
                                i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                            }
                            int i124 = i4 % 2;
                            int i125 = ((int[]) objArr[0])[0];
                            int i126 = (~(i & i50)) & (i | i50);
                            int i127 = -i126;
                            int i128 = ((i126 & i127) | (i126 ^ i127)) >> 31;
                            int i129 = (~i128) & i125;
                            int i130 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                            int i131 = i130 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i131;
                            int i132 = i130 % 2;
                            int i133 = (i50 & i128) | i129;
                            strArr = (String[]) objArr[1];
                            objArr2 = new Object[2];
                            int i134 = (i125 | i) & (~(i & i125));
                            int i135 = -i134;
                            i5 = (((i134 & i135) | (i134 ^ i135)) >> 31) & 1;
                            i6 = i131 + 125;
                            int i136 = i6 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i136;
                            if (i6 % 2 == 0) {
                                objArr2[i5] = null;
                                objArr2[0] = strArr;
                                obj = objArr2[1];
                            } else {
                                int i137 = -i5;
                                int i138 = (~(((i137 & i5) | (i5 ^ i137)) >> 31)) & 1;
                                objArr2[i5] = null;
                                objArr2[i138] = strArr;
                                obj = objArr2[0];
                            }
                            strArr2 = (String[]) obj;
                            objArr3 = new Object[4];
                            objArr3[0] = new int[]{i};
                            objArr3[1] = new int[1];
                            objArr3[2] = new int[]{i133};
                            int i139 = ((~i133) & i) | (i133 & i33);
                            int i140 = -i139;
                            i7 = (((i139 & i140) | (i139 ^ i140)) >> 31) & 16;
                            int i141 = i136 + 33;
                            TuitionPaymentFragmentbindingInflater1 = i141 % 128;
                            int i142 = i141 % 2;
                            i8 = (i136 & 41) + (i136 | 41);
                            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                            if (i8 % 2 != 0) {
                                objArr3[3] = strArr2;
                                i9 = 629539536 + (((~((-583184013) | i33)) | (~(542873783 | i33))) * (-867)) + (((~((-583184013) | i)) | 41952776 | (~(542873783 | i))) * (-1734)) + (((~((-41952777) | i33)) | (~((-541231237) | i)) | (~(i | 584826559))) * 867);
                                iTuitionPaymentFragmentbindingInflater1 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                i10 = (i7 * 50) % ((-97) / i9);
                            } else {
                                objArr3[3] = strArr2;
                                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                i9 = (-208210156) + (((~((-115532679) | iFreeMemory)) | 41951750) * 1504) + ((~(iFreeMemory | (-73580929))) * (-1504)) + 1577597824;
                                iTuitionPaymentFragmentbindingInflater1 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                i10 = ((i7 * 50) - (~(i9 * (-97)))) - 1;
                            }
                            int i143 = ~i9;
                            int i144 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i145 = ~((i143 & i144) | (i143 ^ i144));
                            int i146 = ~i9;
                            int i147 = i10 + (98 * (i145 | (~((i146 ^ i7) | (i146 & i7)))));
                            int i148 = ~i9;
                            int i149 = ~i7;
                            int i150 = ~((i144 & i149) | (i149 ^ i144));
                            int i151 = (i148 & i150) | (i148 ^ i150);
                            int i152 = ~(i7 | iTuitionPaymentFragmentbindingInflater1);
                            int i153 = -(-(((i151 & i152) | (i151 ^ i152)) * (-49)));
                            int i154 = (i147 & i153) + (i147 | i153);
                            int i155 = TuitionPaymentFragmentbindingInflater1;
                            int i156 = ((i155 | 39) << 1) - (i155 ^ 39);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i156 % 128;
                            int i157 = i156 % 2;
                            int i158 = ~((iTuitionPaymentFragmentbindingInflater1 & i146) | (i146 ^ iTuitionPaymentFragmentbindingInflater1));
                            int i159 = ~(i7 | i9);
                            int i160 = 49 * ((i158 & i159) | (i158 ^ i159));
                            int i161 = -(-((i154 & i160) + (i160 | i154)));
                            int i162 = (i2 & i161) + (i2 | i161);
                            int i163 = (i162 << 13) ^ i162;
                            int i164 = i163 >>> 17;
                            int i165 = ((~i163) & i164) | ((~i164) & i163);
                            int i166 = i165 << 5;
                            ((int[]) objArr3[1])[0] = ((~i165) & i166) | ((~i166) & i165);
                            i11 = i155 + 47;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i167 = 59 / 0;
                            }
                            return objArr3;
                        } catch (Throwable th3) {
                            fileReader2.close();
                            bufferedReader2.close();
                            throw th3;
                        }
                    }
                } catch (Exception unused4) {
                }
                i12 = 2;
                objArr = new Object[i12];
                objArr[0] = new int[]{i};
                objArr[1] = new String[0];
                i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i1210 = i4 % 2;
                int i1211 = ((int[]) objArr[0])[0];
                int i1212 = (~(i & i50)) & (i | i50);
                int i1213 = -i1212;
                int i1214 = ((i1212 & i1213) | (i1212 ^ i1213)) >> 31;
                int i1215 = (~i1214) & i1211;
                int i1310 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                int i1311 = i1310 % 128;
                TuitionPaymentFragmentbindingInflater1 = i1311;
                int i1312 = i1310 % 2;
                int i1313 = (i50 & i1214) | i1215;
                strArr = (String[]) objArr[1];
                objArr2 = new Object[2];
                int i1314 = (i1211 | i) & (~(i & i1211));
                int i1315 = -i1314;
                i5 = (((i1314 & i1315) | (i1314 ^ i1315)) >> 31) & 1;
                i6 = i1311 + 125;
                int i1316 = i6 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1316;
                if (i6 % 2 == 0) {
                    objArr2[i5] = null;
                    objArr2[0] = strArr;
                    obj = objArr2[1];
                } else {
                    int i1317 = -i5;
                    int i1318 = (~(((i1317 & i5) | (i5 ^ i1317)) >> 31)) & 1;
                    objArr2[i5] = null;
                    objArr2[i1318] = strArr;
                    obj = objArr2[0];
                }
                strArr2 = (String[]) obj;
                objArr3 = new Object[4];
                objArr3[0] = new int[]{i};
                objArr3[1] = new int[1];
                objArr3[2] = new int[]{i1313};
                int i1319 = ((~i1313) & i) | (i1313 & i33);
                int i1410 = -i1319;
                i7 = (((i1319 & i1410) | (i1319 ^ i1410)) >> 31) & 16;
                int i1411 = i1316 + 33;
                TuitionPaymentFragmentbindingInflater1 = i1411 % 128;
                int i1412 = i1411 % 2;
                i8 = (i1316 & 41) + (i1316 | 41);
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                if (i8 % 2 != 0) {
                    objArr3[3] = strArr2;
                    i9 = 629539536 + (((~((-583184013) | i33)) | (~(542873783 | i33))) * (-867)) + (((~((-583184013) | i)) | 41952776 | (~(542873783 | i))) * (-1734)) + (((~((-41952777) | i33)) | (~((-541231237) | i)) | (~(i | 584826559))) * 867);
                    iTuitionPaymentFragmentbindingInflater1 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                    i10 = (i7 * 50) % ((-97) / i9);
                } else {
                    objArr3[3] = strArr2;
                    int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                    i9 = (-208210156) + (((~((-115532679) | iFreeMemory2)) | 41951750) * 1504) + ((~(iFreeMemory2 | (-73580929))) * (-1504)) + 1577597824;
                    iTuitionPaymentFragmentbindingInflater1 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                    i10 = ((i7 * 50) - (~(i9 * (-97)))) - 1;
                }
                int i1413 = ~i9;
                int i1414 = ~iTuitionPaymentFragmentbindingInflater1;
                int i1415 = ~((i1413 & i1414) | (i1413 ^ i1414));
                int i1416 = ~i9;
                int i1417 = i10 + (98 * (i1415 | (~((i1416 ^ i7) | (i1416 & i7)))));
                int i1418 = ~i9;
                int i1419 = ~i7;
                int i1510 = ~((i1414 & i1419) | (i1419 ^ i1414));
                int i1511 = (i1418 & i1510) | (i1418 ^ i1510);
                int i1512 = ~(i7 | iTuitionPaymentFragmentbindingInflater1);
                int i1513 = -(-(((i1511 & i1512) | (i1511 ^ i1512)) * (-49)));
                int i1514 = (i1417 & i1513) + (i1417 | i1513);
                int i1515 = TuitionPaymentFragmentbindingInflater1;
                int i1516 = ((i1515 | 39) << 1) - (i1515 ^ 39);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1516 % 128;
                int i1517 = i1516 % 2;
                int i1518 = ~((iTuitionPaymentFragmentbindingInflater1 & i1416) | (i1416 ^ iTuitionPaymentFragmentbindingInflater1));
                int i1519 = ~(i7 | i9);
                int i168 = 49 * ((i1518 & i1519) | (i1518 ^ i1519));
                int i169 = -(-((i1514 & i168) + (i168 | i1514)));
                int i1610 = (i2 & i169) + (i2 | i169);
                int i1611 = (i1610 << 13) ^ i1610;
                int i1612 = i1611 >>> 17;
                int i1613 = ((~i1611) & i1612) | ((~i1612) & i1611);
                int i1614 = i1613 << 5;
                ((int[]) objArr3[1])[0] = ((~i1613) & i1614) | ((~i1614) & i1613);
                i11 = i1515 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i1615 = 59 / 0;
                }
                return objArr3;
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r7, short r8, int r9) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 1
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r9 = r9 * 2
                int r9 = 107 - r9
                byte[] r0 = com.nbs.nucleo.utils.ImagePickerUtils.Companion.$$c
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r9 = r7
                r3 = r8
                r4 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                r6 = r9
                r9 = r7
                r7 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L28:
                r3 = r0[r9]
                r6 = r9
                r9 = r7
                r7 = r6
            L2d:
                int r7 = r7 + 1
                int r9 = r9 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nbs.nucleo.utils.ImagePickerUtils.Companion.$$e(short, short, int):java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/nbs/nucleo/utils/ImagePickerUtils$ResultImage;", "Landroid/os/Parcelable;", "", "p0", "Ljava/io/File;", "p1", "<init>", "(Ljava/lang/String;Ljava/io/File;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0})
    public static final /* data */ class ResultImage implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static int g;

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public String b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public File TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static final byte[] $$c = {31, -3, -46, 11};
        private static final int $$d = ModuleDescriptor.MODULE_VERSION;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {89, 107, -36, -112, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
        private static final int $$b = 148;
        private static int asInterface = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f860a = 1;
        private static int asBinder = 0;

        public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new ResultImage(parcel.readString(), (File) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResultImage[i];
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r0 = r6 + 53
                int r8 = r8 * 4
                int r8 = 84 - r8
                byte[] r1 = com.nbs.nucleo.utils.ImagePickerUtils.ResultImage.$$a
                int r7 = r7 * 4
                int r7 = 4 - r7
                byte[] r0 = new byte[r0]
                int r6 = r6 + 52
                r2 = 0
                if (r1 != 0) goto L19
                r4 = r8
                r3 = r2
                r8 = r7
                goto L2e
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L2e:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                int r8 = r8 + 1
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nbs.nucleo.utils.ImagePickerUtils.ResultImage.d(short, int, byte, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i4 = $11 + 125;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - ExpandableListView.getPackedPositionType(0L)), TextUtils.getOffsetBefore("", 0) + 1235, ((byte) KeyEvent.getModifierMetaStateMask()) + 36, -653973969, false, $$e(b, b2, (byte) (b2 - 2)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2764, TextUtils.lastIndexOf("", '0', 0, 0) + 15, 1504416861, false, $$e(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - TextUtils.indexOf("", "")), View.getDefaultSize(0, 0) + 253, 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - TextUtils.getCapsMode("", 0, 0)), View.getDefaultSize(0, 0) + 2891, View.MeasureSpec.makeMeasureSpec(0, 0) + 17, 2012627446, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i6 = $11 + 93;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public ResultImage(String str, File file) {
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file;
        }

        @Override // android.os.Parcelable
        public final int describeContents() throws Throwable {
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - TextUtils.getCapsMode("", 0, 0)), 40 - (Process.myTid() >> 22), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{12695, 45887, 44094, 10370}, (char) (ViewConfiguration.getEdgeSlop() >> 16), ViewConfiguration.getEdgeSlop() >> 16, new char[]{45779, 45304, 37175, 58713, 2808, 7778, 54703, 64574, 36093, 62418, 30482, 31377, 37823, 6750, 13089, 33792, 4064, 29592, 48650, 34220, 61669, 7893}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{38837, 43873, 20670, 18594}, (char) (41552 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-1096064617) - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{11857, 56189, 9611, 21600, 26468, 1006, 62919, 9171, 47056, 13050, 47601, 64566, 33173, 63098, 7408}, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j = -272;
            int i3 = i2;
            long j2 = -1;
            long j3 = j2 ^ 341352111116539231L;
            long jIdentityHashCode = System.identityHashCode(this);
            long j4 = (((long) 273) * 341352111116539231L) + (((long) (-271)) * 1755905063625419756L) + (((((j3 | (j2 ^ 1755905063625419756L)) | (jIdentityHashCode ^ j2)) ^ j2) | ((2089313984241991679L | jIdentityHashCode) ^ j2)) * j) + (j * (((j3 | 1755905063625419756L) ^ j2) | ((j3 | jIdentityHashCode) ^ j2))) + (((long) 272) * ((j2 ^ (jIdentityHashCode | 341352111116539231L)) | 1755905063625419756L));
            int i4 = 0;
            while (i4 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37837 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 59, MotionEvent.axisFromString("") + 19, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                long j5 = jLongValue;
                int i6 = 0;
                while (true) {
                    int i7 = 0;
                    while (i7 != 8) {
                        int i8 = asInterface + 67;
                        f860a = i8 % 128;
                        if (i8 % 2 == 0) {
                            i5 = (((((int) (j5 >>> i7)) & 22602) << (i5 * 101)) + (i5 % 127)) >> i5;
                            i7 += 72;
                        } else {
                            i5 = (((((int) (j5 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                            i7++;
                        }
                    }
                    if (i6 != 0) {
                        break;
                    }
                    i6++;
                    j5 = j4;
                }
                int i9 = i3;
                if (i5 == i9) {
                    return 0;
                }
                int i10 = f860a;
                int i11 = i10 + 19;
                asInterface = i11 % 128;
                if (i11 % 2 != 0) {
                    i4 += 75;
                    jLongValue ^= 1024;
                } else {
                    jLongValue -= 1024;
                    i4++;
                }
                int i12 = i10 + 45;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                i3 = i9;
            }
            Object[] objArr3 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{14785, 1442, 19735, 17486}, (char) (20045 - ExpandableListView.getPackedPositionGroup(0L)), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{47565, 20693, 34858, 25747, 9085, 22910, 3567, 19932, 19206, 22853, 26842, 44250, 53719, 20227, 30037, 33211}, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{24415, 22143, 63722, 26769}, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37369), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, new char[]{53525, 41217, 7720, 47951, 21490, 37596, 24371, 42052, 57046, 16536, 46549, 61136, 7697, 63235, 9259, 9343}, objArr4);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr5 = {1524419470};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.rgb(0, 0, 0) + 16823254), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1134, 'B' - AndroidCharacter.getMirror('0'), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -662596301, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyTid = (char) (Process.myTid() >> 22);
                    int iGreen = Color.green(0) + 1031;
                    int iGreen2 = Color.green(0) + 15;
                    byte b = $$a[7];
                    byte b2 = b;
                    Object[] objArr7 = new Object[1];
                    d(b, b2, b2, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, iGreen, iGreen2, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Drawable.resolveOpacity(0, 0)), 1117 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 17 - TextUtils.getTrimmedLength("")), Boolean.TYPE});
                }
                Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                    return 0;
                }
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr8[0];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ResultImage(String str, File file, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                str = "";
                int i2 = f860a + 25;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = asInterface + 39;
                f860a = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                file = null;
            }
            this(str, file);
        }

        static {
            g = 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i = asBinder + 61;
            g = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ResultImage() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            int i = 2 % 2;
            int i2 = f860a;
            int i3 = i2 + 93;
            asInterface = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this != p0) {
                if (!(p0 instanceof ResultImage)) {
                    return false;
                }
                int i4 = i2 + 15;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                ResultImage resultImage = (ResultImage) p0;
                if (!Intrinsics.areEqual(this.b, resultImage.b)) {
                    return false;
                }
                int i6 = f860a + 99;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, resultImage.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                    return false;
                }
            }
            int i8 = asInterface + 35;
            f860a = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 15;
            f860a = i3 % 128;
            int i4 = i3 % 2;
            String str = this.b;
            int iHashCode2 = 0;
            if (str != null) {
                int i5 = i2 + 65;
                f860a = i5 % 128;
                if (i5 % 2 == 0) {
                    str.hashCode();
                    throw null;
                }
                iHashCode = str.hashCode();
            } else {
                iHashCode = 0;
            }
            File file = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (file != null) {
                int i6 = f860a + 55;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = file.hashCode();
            }
            return (iHashCode * 31) + iHashCode2;
        }

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder("ResultImage(b=");
            sb.append(this.b);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(")");
            String string = sb.toString();
            int i2 = f860a + 1;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 92 / 0;
            }
            return string;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            int i = 2 % 2;
            int i2 = asInterface + 67;
            f860a = i2 % 128;
            int i3 = i2 % 2;
            p0.writeString(this.b);
            p0.writeSerializable(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (i3 == 0) {
                throw null;
            }
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 57024;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, int r7, short r8) {
            /*
                int r6 = r6 * 3
                int r6 = 4 - r6
                byte[] r0 = com.nbs.nucleo.utils.ImagePickerUtils.ResultImage.$$c
                int r8 = r8 * 3
                int r1 = 1 - r8
                int r7 = 104 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r8 = 0 - r8
                if (r0 != 0) goto L17
                r4 = r7
                r3 = r2
                r7 = r6
                goto L2d
            L17:
                r3 = r2
            L18:
                r5 = r7
                r7 = r6
                r6 = r5
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L2d:
                int r6 = r6 + 1
                int r4 = -r4
                int r7 = r7 + r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nbs.nucleo.utils.ImagePickerUtils.ResultImage.$$e(short, int, short):java.lang.String");
        }
    }
}
