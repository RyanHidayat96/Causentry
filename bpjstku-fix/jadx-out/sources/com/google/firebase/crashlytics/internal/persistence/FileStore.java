package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FileStore {
    private static final String CRASHLYTICS_PATH_V1 = ".com.google.firebase.crashlytics.files.v1";
    private static final String CRASHLYTICS_PATH_V2 = ".com.google.firebase.crashlytics.files.v2";
    private static final String CRASHLYTICS_PATH_V3 = ".crashlytics.v3";
    private static final String NATIVE_REPORTS_PATH = "native-reports";
    private static final String NATIVE_SESSION_SUBDIR = "native";
    private static final String PRIORITY_REPORTS_PATH = "priority-reports";
    private static final String REPORTS_PATH = "reports";
    private static final String SESSIONS_PATH = "open-sessions";
    private final File crashlyticsDir;
    private final File filesDir;
    private final File nativeReportsDir;
    private final File priorityReportsDir;
    final String processName;
    private final File reportsDir;
    private final File sessionsDir;

    public FileStore(Context context) {
        String string;
        String processName = ProcessDetailsProvider.INSTANCE.getCurrentProcessDetails(context).getProcessName();
        this.processName = processName;
        File filesDir = context.getFilesDir();
        this.filesDir = filesDir;
        if (useV3FileSystem()) {
            StringBuilder sb = new StringBuilder(CRASHLYTICS_PATH_V3);
            sb.append(File.separator);
            sb.append(sanitizeName(processName));
            string = sb.toString();
        } else {
            string = CRASHLYTICS_PATH_V1;
        }
        File filePrepareBaseDir = prepareBaseDir(new File(filesDir, string));
        this.crashlyticsDir = filePrepareBaseDir;
        this.sessionsDir = prepareBaseDir(new File(filePrepareBaseDir, SESSIONS_PATH));
        this.reportsDir = prepareBaseDir(new File(filePrepareBaseDir, REPORTS_PATH));
        this.priorityReportsDir = prepareBaseDir(new File(filePrepareBaseDir, PRIORITY_REPORTS_PATH));
        this.nativeReportsDir = prepareBaseDir(new File(filePrepareBaseDir, NATIVE_REPORTS_PATH));
    }

    public void deleteAllCrashlyticsFiles() {
        recursiveDelete(this.crashlyticsDir);
    }

    public void cleanupPreviousFileSystems() {
        cleanupFileSystemDir(".com.google.firebase.crashlytics");
        cleanupFileSystemDir(".com.google.firebase.crashlytics-ndk");
        if (useV3FileSystem()) {
            cleanupFileSystemDir(CRASHLYTICS_PATH_V1);
            StringBuilder sb = new StringBuilder(CRASHLYTICS_PATH_V2);
            sb.append(File.pathSeparator);
            cleanupFileSystemDirs(sb.toString());
        }
    }

    private void cleanupFileSystemDir(String str) {
        File file = new File(this.filesDir, str);
        if (file.exists() && recursiveDelete(file)) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Deleted previous Crashlytics file system: ");
            sb.append(file.getPath());
            logger.d(sb.toString());
        }
    }

    private void cleanupFileSystemDirs(final String str) {
        String[] list;
        if (!this.filesDir.exists() || (list = this.filesDir.list(new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.FileStore$$ExternalSyntheticLambda0
            private static final byte[] $$c = {80, -8, 43, 65};
            private static final int $$d = 236;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {31, -3, -46, 11};
            private static final int $$b = 38;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int b = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -7909642766141795648L;

            private static void c(short s, byte b2, byte b3, Object[] objArr) {
                int i = b2 + 4;
                int i2 = s * 2;
                int i3 = (b3 * 4) + 98;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[1 - i2];
                int i4 = 0 - i2;
                int i5 = -1;
                if (bArr == null) {
                    i5 = -1;
                    i3 = (-i) + i4;
                    i = i;
                }
                while (true) {
                    int i6 = i5 + 1;
                    bArr2[i6] = (byte) i3;
                    if (i6 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i7 = i + 1;
                    i5 = i6;
                    i3 = (-bArr[i7]) + i3;
                    i = i7;
                }
            }

            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                b = i2 % 128;
                int i3 = i2 % 2;
                boolean zStartsWith = str2.startsWith(str);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    return zStartsWith;
                }
                throw null;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                int i3 = $11 + 103;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 / 2;
                }
                while (abortcapture.b < cArrB.length) {
                    int i5 = $11 + 85;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i7 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(0, 0, 0) + 16842054), 1356 - ExpandableListView.getPackedPositionGroup(0L), 38 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        try {
                            Object[] objArr3 = {abortcapture, abortcapture};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 47773), (ViewConfiguration.getFadingEdgeLength() >> 16) + 468, 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                            int i8 = $10 + 69;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
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
            }

            /* JADX WARN: Code duplicated, block: B:102:0x0577  */
            /* JADX WARN: Code duplicated, block: B:103:0x057e  */
            /* JADX WARN: Code duplicated, block: B:107:0x0651  */
            /* JADX WARN: Code duplicated, block: B:108:0x0680  */
            /* JADX WARN: Code duplicated, block: B:66:0x03f1  */
            /* JADX WARN: Code duplicated, block: B:67:0x03f3 A[Catch: Exception -> 0x054a, TRY_LEAVE, TryCatch #2 {Exception -> 0x054a, blocks: (B:64:0x03cc, B:67:0x03f3, B:69:0x041d, B:72:0x042f, B:75:0x0492, B:82:0x04f2, B:94:0x053b, B:95:0x0541, B:97:0x0543, B:98:0x0549, B:68:0x03fd, B:78:0x04ad, B:80:0x04d3, B:79:0x04c3), top: B:123:0x03cc, inners: #0, #4 }] */
            /* JADX WARN: Code duplicated, block: B:72:0x042f A[Catch: Exception -> 0x054a, TRY_ENTER, TryCatch #2 {Exception -> 0x054a, blocks: (B:64:0x03cc, B:67:0x03f3, B:69:0x041d, B:72:0x042f, B:75:0x0492, B:82:0x04f2, B:94:0x053b, B:95:0x0541, B:97:0x0543, B:98:0x0549, B:68:0x03fd, B:78:0x04ad, B:80:0x04d3, B:79:0x04c3), top: B:123:0x03cc, inners: #0, #4 }] */
            /* JADX WARN: Code duplicated, block: B:74:0x0490  */
            /* JADX WARN: Code duplicated, block: B:75:0x0492 A[Catch: Exception -> 0x054a, TRY_LEAVE, TryCatch #2 {Exception -> 0x054a, blocks: (B:64:0x03cc, B:67:0x03f3, B:69:0x041d, B:72:0x042f, B:75:0x0492, B:82:0x04f2, B:94:0x053b, B:95:0x0541, B:97:0x0543, B:98:0x0549, B:68:0x03fd, B:78:0x04ad, B:80:0x04d3, B:79:0x04c3), top: B:123:0x03cc, inners: #0, #4 }] */
            /* JADX WARN: Code duplicated, block: B:78:0x04ad A[Catch: all -> 0x053a, TRY_ENTER, TryCatch #4 {all -> 0x053a, blocks: (B:78:0x04ad, B:80:0x04d3, B:79:0x04c3), top: B:126:0x04ab, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:79:0x04c3 A[Catch: all -> 0x053a, TryCatch #4 {all -> 0x053a, blocks: (B:78:0x04ad, B:80:0x04d3, B:79:0x04c3), top: B:126:0x04ab, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:84:0x04fa  */
            /* JADX WARN: Code duplicated, block: B:86:0x050b  */
            /* JADX WARN: Code duplicated, block: B:89:0x0512  */
            /* JADX WARN: Code duplicated, block: B:91:0x0515 A[PHI: r7
  0x0515: PHI (r7v96 char) = (r7v95 char), (r7v99 char) binds: [B:90:0x0513, B:87:0x050f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:92:0x0538  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2) throws Throwable {
                int i3;
                String str2;
                char c;
                Object[] objArr;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                Object[] objArr2;
                String[] strArr;
                int i11;
                File file;
                FileReader fileReader;
                BufferedReader bufferedReader;
                boolean zEquals;
                File file2;
                FileReader fileReader2;
                BufferedReader bufferedReader2;
                int i12;
                String line;
                char[] cArr;
                float f;
                char c2;
                float fComplexToFraction;
                boolean zEquals2;
                int i13;
                int i14;
                char c3;
                String line2;
                char[] cArr2;
                char[] cArr3;
                int iIndexOf;
                int i15 = 2 % 2;
                try {
                    String[] strArr2 = new String[2];
                    char[] cArr4 = {52381, 52468, 20674, 59415, 257, 28681, 49560, 59407, 11879, 29532, 21122, 52597, 2504, 38323, 14142, 11989, 27451, 34839, 6256, 4161, 18057, 43892, 64201};
                    int i16 = b + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                    if (i16 % 2 != 0) {
                        Object[] objArr3 = new Object[1];
                        a(cArr4, TextUtils.indexOf("", "", 0, 1), objArr3);
                        strArr2[0] = (String) objArr3[0];
                        cArr3 = new char[]{47445, 47394, 45507, 2308, 20358, 16035, 16354, 5732, 23460, 37460, 7173, 13102, 31754, 29856, 31166, 53413, 7935, 26911, 22261, 60991, 13136, 19056};
                        iIndexOf = TextUtils.indexOf((CharSequence) "", 'm');
                    } else {
                        Object[] objArr4 = new Object[1];
                        a(cArr4, TextUtils.indexOf("", "", 0, 0), objArr4);
                        strArr2[0] = (String) objArr4[0];
                        cArr3 = new char[]{47445, 47394, 45507, 2308, 20358, 16035, 16354, 5732, 23460, 37460, 7173, 13102, 31754, 29856, 31166, 53413, 7935, 26911, 22261, 60991, 13136, 19056};
                        iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                    }
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i17 = iIndexOf * (-721);
                    int i18 = b + 61;
                    int i19 = i18 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19;
                    int i20 = i18 % 2;
                    int i21 = ((i17 | (-721)) << 1) - (i17 ^ (-721));
                    int i22 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i23 = ~((~iIndexOf) | (-2));
                    int i24 = (i22 ^ i23) | (i23 & i22);
                    int i25 = (iIndexOf ^ 1) | (iIndexOf & 1);
                    int i26 = (i21 - (~((i24 | (~i25)) * 1444))) - 1;
                    int i27 = ~i25;
                    int i28 = (i19 ^ 103) + ((i19 & 103) << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = ~(iIndexOf | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i31 = (i27 & i30) | (i27 ^ i30);
                    int i32 = ~((1 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 1));
                    int i33 = -(-((-1444) * ((i31 & i32) | (i31 ^ i32))));
                    int i34 = ((i26 | i33) << 1) - (i33 ^ i26);
                    int i35 = ~((~iIndexOf) | 1);
                    int i36 = ~((iIndexOf & (-2)) | ((-2) ^ iIndexOf));
                    int i37 = i19 + 111;
                    b = i37 % 128;
                    int i38 = i37 % 2;
                    int i39 = 722 * ((i35 & i36) | (i35 ^ i36));
                    int i40 = ((i34 | i39) << 1) - (i34 ^ i39);
                    Object[] objArr5 = new Object[1];
                    a(cArr3, i40, objArr5);
                    strArr2[1] = (String) objArr5[0];
                    int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    int i43 = 0;
                    while (true) {
                        if (i43 < 2) {
                            String str3 = strArr2[i43];
                            Object[] objArr6 = new Object[1];
                            a(new char[]{50789, 50692, 19820, 62884, 56962, 44970, 41926, 35398, 9362, 28403, 36098, 44898, 826, 34817, 59600, 19616, 25032, 38312, 51171, 29211}, View.resolveSizeAndState(0, 0, 0), objArr6);
                            Class<?> cls = Class.forName((String) objArr6[0]);
                            if (((Boolean) cls.getMethod(str3, new Class[0]).invoke(cls, null)).booleanValue()) {
                                int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
                                b = i44 % 128;
                                if (i44 % 2 != 0) {
                                    i3 = (~(i & 1)) & (i | 1);
                                    break;
                                }
                                break;
                            }
                            int i45 = (i43 & (-85)) + (i43 | (-85));
                            i43 = ((i45 | 86) << 1) - (i45 ^ 86);
                            int i46 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i47 = ((i46 | 5) << 1) - (i46 ^ 5);
                            b = i47 % 128;
                            int i48 = i47 % 2;
                        }
                        i3 = i;
                        break;
                    }
                } catch (Exception unused) {
                    i3 = (i & (-3)) | ((~i) & 2);
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) (2420 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 2845;
                        int i49 = 5 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, (byte) (b3 + 1), objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, capsMode, i49, -501222268, false, (String) objArr7[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j = -447118820;
                    long j2 = -518;
                    long j3 = (j2 * j) + (j2 * jLongValue);
                    long j4 = 519;
                    long j5 = -1;
                    long startUptimeMillis = (int) Process.getStartUptimeMillis();
                    long j6 = (j ^ j5) | (startUptimeMillis ^ j5);
                    long j7 = j3 + ((jLongValue | (j6 ^ j5)) * j4) + (((long) (-519)) * (((j6 | jLongValue) ^ j5) | (((j | jLongValue) | startUptimeMillis) ^ j5))) + (j4 * ((j5 ^ (jLongValue | startUptimeMillis)) | j)) + ((long) (-712067866));
                    int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i51 = (i50 ^ 7) + ((i50 & 7) << 1);
                    b = i51 % 128;
                    int i52 = i51 % 2;
                    int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                    int i53 = ((int) (j7 >> 32)) & ((-2088991750) + ((1517181549 | startUptimeMillis2) * 376) + (((~((~startUptimeMillis2) | (-132350962))) | 39977569) * (-376)) + (((~(startUptimeMillis2 | 132350961)) | 1569577372) * 376));
                    int i54 = ~i;
                    int i55 = ((int) j7) & (321779352 + (((~(i54 | (-505965131))) | (-931261280)) * (-1042)) + (((-505965131) | i) * 521) + (((~(931261279 | i)) | (-1068100448) | (~((-369125963) | i54))) * 521));
                    int i56 = (i55 & i53) | (i53 ^ i55);
                    int i57 = (~(i & 10)) & (i | 10);
                    int i58 = (i56 | 1) & (~(i56 & 1));
                    int i59 = -i58;
                    int i60 = ((i58 & i59) | (i58 ^ i59)) >> 31;
                    int i61 = b;
                    int i62 = ((i61 | 77) << 1) - (i61 ^ 77);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i62 % 128;
                    if (i62 % 2 != 0) {
                        throw null;
                    }
                    int i63 = i57 & (~i60);
                    int i64 = i60 & i;
                    int i65 = (i64 & i63) | (i63 ^ i64);
                    int i66 = ((~i3) & i) | (i3 & i54);
                    int i67 = -i66;
                    int i68 = ((i66 & i67) | (i66 ^ i67)) >> 31;
                    int i69 = i65 & (~i68);
                    int i70 = i3 & i68;
                    int i71 = (i69 ^ i70) | (i70 & i69);
                    try {
                        Object[] objArr8 = new Object[1];
                        a(new char[]{29209, 29238, 44856, 6125, 63219, 34758, 65052, 55197, 37038, 36024, 42354, 62180, 46919, 27230, 49379, 4369, 54709, 30694, 61317, 12243, 63518, 21700, 3371, 19004, 7808, 12816, 10462, 26776, 15854, 8180, 13900, 34795, 16451, 64849, 21986, 41576, 26285, 56020, 28811, 49372, 34080, 47216, 40498, 57124}, Process.myTid() >> 22, objArr8);
                        File file3 = new File((String) objArr8[0]);
                        int i72 = b;
                        int i73 = ((i72 | 119) << 1) - (i72 ^ 119);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i73 % 128;
                        try {
                            if (i73 % 2 != 0) {
                                file3.canRead();
                                throw null;
                            }
                            if (file3.canRead()) {
                                FileReader fileReader3 = new FileReader(file3);
                                BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                int i74 = ~((816590356 ^ i54) | (816590356 & i54));
                                int i75 = -(-(((i74 & 1815794587) | (1815794587 ^ i74)) * 519));
                                int i76 = ((2103251676 | i75) << 1) - (i75 ^ 2103251676);
                                int i77 = ~i;
                                int i78 = (816590356 & i77) | (816590356 ^ i77);
                                int i79 = ~((i78 & 1815794587) | (i78 ^ 1815794587));
                                int i80 = ~(((-277097477) & i) | ((-277097477) ^ i));
                                int i81 = i76 + (((i79 & i80) | (i79 ^ i80)) * (-519));
                                int i82 = ((~(1815794587 | i)) | (-816590357)) * 519;
                                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                                int i84 = (~(((-264302293) & i54) | ((-264302293) ^ i54))) | 41992320;
                                int i85 = ~((i54 ^ (-42848649)) | (i54 & (-42848649)));
                                int i86 = (-562662213) + (((i84 & i85) | (i84 ^ i85)) * 464);
                                int i87 = ((-222309973) | i) * (-464);
                                int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                                int i89 = ((~(((-42848649) ^ i) | ((-42848649) & i))) | 41992320) * 464;
                                try {
                                    if (i83 <= (i88 ^ i89) + ((i89 & i88) << 1)) {
                                        line2 = bufferedReader3.readLine();
                                        cArr2 = new char[]{20503, 20601, 47908, 1005, 38907, 59079, 65024};
                                    } else {
                                        line2 = bufferedReader3.readLine();
                                        cArr2 = new char[]{20503, 20601, 47908, 1005, 38907, 59079, 65024};
                                    }
                                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                    String str4 = line2;
                                    int i90 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i91 = (i90 ^ 69) + ((i90 & 69) << 1);
                                    b = i91 % 128;
                                    if (i91 % 2 == 0) {
                                        int i92 = 1 << (jElapsedRealtimeNanos > 1L ? 1 : (jElapsedRealtimeNanos == 1L ? 0 : -1));
                                        Object[] objArr9 = new Object[1];
                                        a(cArr2, i92, objArr9);
                                        if (!str4.equals((String) objArr9[0])) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            int i93 = b + 87;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i93 % 128;
                                            int i94 = i93 % 2;
                                            str2 = str4;
                                        }
                                        fileReader3.close();
                                        bufferedReader3.close();
                                    } else {
                                        Object[] objArr10 = new Object[1];
                                        a(cArr2, 1 - (jElapsedRealtimeNanos > 0L ? 1 : (jElapsedRealtimeNanos == 0L ? 0 : -1)), objArr10);
                                        if (str4.equals((String) objArr10[0])) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                        } else {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            int i95 = b + 87;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i95 % 128;
                                            int i96 = i95 % 2;
                                            str2 = str4;
                                        }
                                    }
                                    str2 = null;
                                } catch (Throwable th) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th;
                                }
                            } else {
                                str2 = null;
                            }
                            Object[] objArr11 = new Object[1];
                            a(new char[]{43732, 43771, 28931, 51669, 21015, 9001, 40659, 46926, 18479, 21188, 384, 37408, 28567, 46124, 25600, 29076, 3438, 43477, 19302, 20229, 8347, 35509, 43471, 10995, 50765, 60456, 35894, 2150, 58657, 49549, 37546, 59187, 39056, 9086, 61703}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr11);
                            file = new File((String) objArr11[0]);
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                try {
                                    String line3 = bufferedReader.readLine();
                                    Object[] objArr12 = new Object[1];
                                    a(new char[]{29865, 29848, 44679, 29834, 3293}, (-Process.getGidForName("")) - 1, objArr12);
                                    zEquals = line3.equals((String) objArr12[0]);
                                    fileReader.close();
                                    bufferedReader.close();
                                    int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                                    b = i97 % 128;
                                    int i98 = i97 % 2;
                                    if (zEquals) {
                                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                        int i99 = (iIndexOf2 * (-500)) - 500;
                                        int i100 = ~((-2) | iIndexOf2);
                                        int i101 = (~iIndexOf2) | 1;
                                        int i102 = ~((i101 & i) | (i101 ^ i));
                                        int i103 = -(-(((i100 & i102) | (i100 ^ i102)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                        int i104 = (i99 ^ i103) + ((i99 & i103) << 1);
                                        int i105 = ~iIndexOf2;
                                        int i106 = (~((i105 ^ (-2)) | (i105 & (-2)))) * 1002;
                                        int i107 = (i104 ^ i106) + ((i106 & i104) << 1);
                                        int i108 = (i105 & i54) | (i105 ^ i54);
                                        int i109 = -(-((~((i108 & 1) | (i108 ^ 1))) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                        int i110 = (i107 ^ i109) + ((i109 & i107) << 1);
                                        Object[] objArr13 = new Object[1];
                                        a(new char[]{1313, 1294, 29457, 52164, 29623, 642, 'v', 10743, 59286, 20625, 8246, 3214, 49279, 46711, 17831, 61307, 41613, 43983, 27329, 53689, 36646, 35053, 34927, 46166, 27064, 60985, 44442, 38642, 19158, 50141, 45855, 31110, 14184, 8553, 53418, 23554, 4486, 1789, 62932, 16042}, i110, objArr13);
                                        file2 = new File((String) objArr13[0]);
                                        if (!file2.canRead()) {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            int i111 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            i12 = (i111 ^ 15) + ((i111 & 15) << 1);
                                            b = i12 % 128;
                                            try {
                                                if (i12 % 2 == 0) {
                                                    line = bufferedReader2.readLine();
                                                    cArr = new char[]{29865, 29848, 44679, 29834, 3293};
                                                    fComplexToFraction = TypedValue.complexToFraction(0, 1.0f, 0.0f);
                                                    f = 0.0f;
                                                    c2 = 0;
                                                } else {
                                                    line = bufferedReader2.readLine();
                                                    cArr = new char[]{29865, 29848, 44679, 29834, 3293};
                                                    f = 0.0f;
                                                    c2 = 0;
                                                    fComplexToFraction = TypedValue.complexToFraction(0, 0.0f, 0.0f);
                                                }
                                                Object[] objArr14 = new Object[1];
                                                a(cArr, (fComplexToFraction > f ? 1 : (fComplexToFraction == f ? 0 : -1)), objArr14);
                                                zEquals2 = line.equals((String) objArr14[c2]);
                                                int i112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i113 = (i112 ^ 27) + ((i112 & 27) << 1);
                                                b = i113 % 128;
                                                int i114 = i113 % 2;
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                if (zEquals2) {
                                                    i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    i14 = (i13 ^ 89) + ((i13 & 89) << 1);
                                                    b = i14 % 128;
                                                    if (i14 % 2 == 0) {
                                                        c3 = 0;
                                                        int i115 = 46 / 0;
                                                        if (str2 != null) {
                                                            objArr = new Object[2];
                                                            objArr[c3] = new int[]{i};
                                                            int i116 = (~(i & 20)) & (i | 20);
                                                            int i117 = i13 + 67;
                                                            b = i117 % 128;
                                                            int i118 = i117 % 2;
                                                            objArr[1] = new String[]{str2};
                                                            c = 0;
                                                        } else {
                                                            i10 = 2;
                                                        }
                                                    } else {
                                                        c3 = 0;
                                                        if (str2 != null) {
                                                            objArr = new Object[2];
                                                            objArr[c3] = new int[]{i116};
                                                            int i119 = (~(i & 20)) & (i | 20);
                                                            int i1110 = i13 + 67;
                                                            b = i1110 % 128;
                                                            int i1111 = i1110 % 2;
                                                            objArr[1] = new String[]{str2};
                                                            c = 0;
                                                        } else {
                                                            i10 = 2;
                                                        }
                                                    }
                                                }
                                                objArr2 = new Object[i10];
                                                objArr2[0] = new int[]{i};
                                                strArr = new String[0];
                                                int i120 = b;
                                                int i121 = ((i120 | 27) << 1) - (i120 ^ 27);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i121 % 128;
                                                int i122 = i121 % 2;
                                                i11 = (i120 ^ 109) + ((i120 & 109) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                                                if (i11 % 2 != 0) {
                                                    objArr2[1] = strArr;
                                                    c = 0;
                                                    int i123 = 64 / 0;
                                                } else {
                                                    c = 0;
                                                    objArr2[1] = strArr;
                                                }
                                                objArr = objArr2;
                                            } catch (Throwable th2) {
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                throw th2;
                                            }
                                        }
                                    }
                                    int i124 = ((int[]) objArr[c])[c];
                                    int i125 = (~(i & i71)) & (i | i71);
                                    int i126 = -i125;
                                    int i127 = ((i125 & i126) | (i125 ^ i126)) >> 31;
                                    int i128 = (~i127) & i124;
                                    int i129 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i130 = (i129 ^ 61) + ((i129 & 61) << 1);
                                    b = i130 % 128;
                                    int i131 = i130 % 2;
                                    int i132 = i71 & i127;
                                    int i133 = (i132 & i128) | (i128 ^ i132);
                                    String[] strArr3 = (String[]) objArr[1];
                                    Object[] objArr15 = new Object[2];
                                    int i134 = (i124 & i54) | ((~i124) & i);
                                    int i135 = -i134;
                                    int i136 = (((i134 & i135) | (i134 ^ i135)) >> 31) & 1;
                                    int i137 = (~(((-i136) | i136) >> 31)) & 1;
                                    objArr15[i136] = null;
                                    objArr15[i137] = strArr3;
                                    String[] strArr4 = (String[]) objArr15[0];
                                    int i138 = i ^ i133;
                                    i4 = ((i138 | (-i138)) >> 31) & 16;
                                    int i139 = (i129 ^ 89) + ((i129 & 89) << 1);
                                    b = i139 % 128;
                                    int i140 = i139 % 2;
                                    Object[] objArr16 = {new int[]{i}, new int[1], new int[]{i133}, strArr4};
                                    int i141 = (int) Runtime.getRuntime().totalMemory();
                                    int i142 = ~i141;
                                    int i143 = (-868597916) + (((~((-1005619122) | i142)) | 40928801 | (~(965308892 | i142)) | (~((-618573) | i141))) * (-84));
                                    int i144 = (~(i141 | 965308892)) | 1005619121;
                                    int i145 = ~(i142 | (-965308893));
                                    i5 = i143 + ((i144 | i145) * (-84)) + ((618572 | i145) * 84);
                                    int i146 = i4 * 303;
                                    int i147 = i5 * (-301);
                                    i6 = (i146 ^ i147) + ((i146 & i147) << 1);
                                    i7 = b + 37;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        int i148 = ~i4;
                                        int i149 = ~i;
                                        int i150 = ~((i148 & i149) | (i148 ^ i149) | i5);
                                        int i151 = (i4 ^ i5) | (i4 & i5);
                                        int i152 = ~((i151 & i) | (i151 ^ i));
                                        int i153 = i6 - (((i150 & i152) | (i150 ^ i152)) * (-302));
                                        int i154 = ~i4;
                                        int i155 = (i154 & i5) | (i154 ^ i5);
                                        int i156 = -(-((-604) >>> (~((i155 & i) | (i155 ^ i)))));
                                        i8 = (i153 & i156) + (i156 | i153);
                                        i9 = ~i5;
                                    } else {
                                        int i157 = ~i4;
                                        int i158 = ~i;
                                        int i159 = i6 + (((~((i158 & i157) | (i157 ^ i158) | i5)) | (~(i4 | i5 | i))) * (-302));
                                        int i160 = (i157 & i5) | (i157 ^ i5);
                                        i8 = (i159 - (~(-(-((~((i160 & i) | (i160 ^ i))) * (-604)))))) - 1;
                                        i9 = ~i5;
                                    }
                                    int i161 = ~((i9 & i4) | (i9 ^ i4));
                                    int i162 = ~((i & i5) | (i5 ^ i));
                                    int i163 = 302 * ((i161 & i162) | (i161 ^ i162));
                                    int i164 = i2 + (((i8 | i163) << 1) - (i163 ^ i8));
                                    int i165 = i164 << 13;
                                    int i166 = ((~i164) & i165) | ((~i165) & i164);
                                    int i167 = i166 >>> 17;
                                    int i168 = (i166 | i167) & (~(i166 & i167));
                                    ((int[]) objArr16[1])[0] = i168 ^ (i168 << 5);
                                    return objArr16;
                                } catch (Throwable th3) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th3;
                                }
                            }
                            i10 = 2;
                            objArr2 = new Object[i10];
                            objArr2[0] = new int[]{i};
                            strArr = new String[0];
                            int i1210 = b;
                            int i1211 = ((i1210 | 27) << 1) - (i1210 ^ 27);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1211 % 128;
                            int i1212 = i1211 % 2;
                            i11 = (i1210 ^ 109) + ((i1210 & 109) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            if (i11 % 2 != 0) {
                                objArr2[1] = strArr;
                                c = 0;
                                int i1213 = 64 / 0;
                            } else {
                                c = 0;
                                objArr2[1] = strArr;
                            }
                            objArr = objArr2;
                            int i1214 = ((int[]) objArr[c])[c];
                            int i1215 = (~(i & i71)) & (i | i71);
                            int i1216 = -i1215;
                            int i1217 = ((i1215 & i1216) | (i1215 ^ i1216)) >> 31;
                            int i1218 = (~i1217) & i1214;
                            int i1219 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i1310 = (i1219 ^ 61) + ((i1219 & 61) << 1);
                            b = i1310 % 128;
                            int i1311 = i1310 % 2;
                            int i1312 = i71 & i1217;
                            int i1313 = (i1312 & i1218) | (i1218 ^ i1312);
                            String[] strArr5 = (String[]) objArr[1];
                            Object[] objArr17 = new Object[2];
                            int i1314 = (i1214 & i54) | ((~i1214) & i);
                            int i1315 = -i1314;
                            int i1316 = (((i1314 & i1315) | (i1314 ^ i1315)) >> 31) & 1;
                            int i1317 = (~(((-i1316) | i1316) >> 31)) & 1;
                            objArr17[i1316] = null;
                            objArr17[i1317] = strArr5;
                            String[] strArr6 = (String[]) objArr17[0];
                            int i1318 = i ^ i1313;
                            i4 = ((i1318 | (-i1318)) >> 31) & 16;
                            int i1319 = (i1219 ^ 89) + ((i1219 & 89) << 1);
                            b = i1319 % 128;
                            int i1410 = i1319 % 2;
                            Object[] objArr18 = {new int[]{i}, new int[1], new int[]{i1313}, strArr6};
                            int i1411 = (int) Runtime.getRuntime().totalMemory();
                            int i1412 = ~i1411;
                            int i1413 = (-868597916) + (((~((-1005619122) | i1412)) | 40928801 | (~(965308892 | i1412)) | (~((-618573) | i1411))) * (-84));
                            int i1414 = (~(i1411 | 965308892)) | 1005619121;
                            int i1415 = ~(i1412 | (-965308893));
                            i5 = i1413 + ((i1414 | i1415) * (-84)) + ((618572 | i1415) * 84);
                            int i1416 = i4 * 303;
                            int i1417 = i5 * (-301);
                            i6 = (i1416 ^ i1417) + ((i1416 & i1417) << 1);
                            i7 = b + 37;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i1418 = ~i4;
                                int i1419 = ~i;
                                int i1510 = ~((i1418 & i1419) | (i1418 ^ i1419) | i5);
                                int i1511 = (i4 ^ i5) | (i4 & i5);
                                int i1512 = ~((i1511 & i) | (i1511 ^ i));
                                int i1513 = i6 - (((i1510 & i1512) | (i1510 ^ i1512)) * (-302));
                                int i1514 = ~i4;
                                int i1515 = (i1514 & i5) | (i1514 ^ i5);
                                int i1516 = -(-((-604) >>> (~((i1515 & i) | (i1515 ^ i)))));
                                i8 = (i1513 & i1516) + (i1516 | i1513);
                                i9 = ~i5;
                            } else {
                                int i1517 = ~i4;
                                int i1518 = ~i;
                                int i1519 = i6 + (((~((i1518 & i1517) | (i1517 ^ i1518) | i5)) | (~(i4 | i5 | i))) * (-302));
                                int i169 = (i1517 & i5) | (i1517 ^ i5);
                                i8 = (i1519 - (~(-(-((~((i169 & i) | (i169 ^ i))) * (-604)))))) - 1;
                                i9 = ~i5;
                            }
                            int i1610 = ~((i9 & i4) | (i9 ^ i4));
                            int i1611 = ~((i & i5) | (i5 ^ i));
                            int i1612 = 302 * ((i1610 & i1611) | (i1610 ^ i1611));
                            int i1613 = i2 + (((i8 | i1612) << 1) - (i1612 ^ i8));
                            int i1614 = i1613 << 13;
                            int i1615 = ((~i1613) & i1614) | ((~i1614) & i1613);
                            int i1616 = i1615 >>> 17;
                            int i1617 = (i1615 | i1616) & (~(i1615 & i1616));
                            ((int[]) objArr18[1])[0] = i1617 ^ (i1617 << 5);
                            return objArr18;
                            Object[] objArr19 = new Object[1];
                            a(new char[]{43732, 43771, 28931, 51669, 21015, 9001, 40659, 46926, 18479, 21188, 384, 37408, 28567, 46124, 25600, 29076, 3438, 43477, 19302, 20229, 8347, 35509, 43471, 10995, 50765, 60456, 35894, 2150, 58657, 49549, 37546, 59187, 39056, 9086, 61703}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr19);
                            file = new File((String) objArr19[0]);
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                String line4 = bufferedReader.readLine();
                                Object[] objArr110 = new Object[1];
                                a(new char[]{29865, 29848, 44679, 29834, 3293}, (-Process.getGidForName("")) - 1, objArr110);
                                zEquals = line4.equals((String) objArr110[0]);
                                fileReader.close();
                                bufferedReader.close();
                                int i910 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                                b = i910 % 128;
                                int i911 = i910 % 2;
                                if (zEquals) {
                                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                    int i912 = (iIndexOf3 * (-500)) - 500;
                                    int i1010 = ~((-2) | iIndexOf3);
                                    int i1011 = (~iIndexOf3) | 1;
                                    int i1012 = ~((i1011 & i) | (i1011 ^ i));
                                    int i1013 = -(-(((i1010 & i1012) | (i1010 ^ i1012)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                    int i1014 = (i912 ^ i1013) + ((i912 & i1013) << 1);
                                    int i1015 = ~iIndexOf3;
                                    int i1016 = (~((i1015 ^ (-2)) | (i1015 & (-2)))) * 1002;
                                    int i1017 = (i1014 ^ i1016) + ((i1016 & i1014) << 1);
                                    int i1018 = (i1015 & i54) | (i1015 ^ i54);
                                    int i1019 = -(-((~((i1018 & 1) | (i1018 ^ 1))) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                    int i1112 = (i1017 ^ i1019) + ((i1019 & i1017) << 1);
                                    Object[] objArr111 = new Object[1];
                                    a(new char[]{1313, 1294, 29457, 52164, 29623, 642, 'v', 10743, 59286, 20625, 8246, 3214, 49279, 46711, 17831, 61307, 41613, 43983, 27329, 53689, 36646, 35053, 34927, 46166, 27064, 60985, 44442, 38642, 19158, 50141, 45855, 31110, 14184, 8553, 53418, 23554, 4486, 1789, 62932, 16042}, i1112, objArr111);
                                    file2 = new File((String) objArr111[0]);
                                    if (!file2.canRead()) {
                                        fileReader2 = new FileReader(file2);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        int i1113 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        i12 = (i1113 ^ 15) + ((i1113 & 15) << 1);
                                        b = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            line = bufferedReader2.readLine();
                                            cArr = new char[]{29865, 29848, 44679, 29834, 3293};
                                            fComplexToFraction = TypedValue.complexToFraction(0, 1.0f, 0.0f);
                                            f = 0.0f;
                                            c2 = 0;
                                        } else {
                                            line = bufferedReader2.readLine();
                                            cArr = new char[]{29865, 29848, 44679, 29834, 3293};
                                            f = 0.0f;
                                            c2 = 0;
                                            fComplexToFraction = TypedValue.complexToFraction(0, 0.0f, 0.0f);
                                        }
                                        Object[] objArr112 = new Object[1];
                                        a(cArr, (fComplexToFraction > f ? 1 : (fComplexToFraction == f ? 0 : -1)), objArr112);
                                        zEquals2 = line.equals((String) objArr112[c2]);
                                        int i1114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i1115 = (i1114 ^ 27) + ((i1114 & 27) << 1);
                                        b = i1115 % 128;
                                        int i1116 = i1115 % 2;
                                        fileReader2.close();
                                        bufferedReader2.close();
                                        if (zEquals2) {
                                            i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            i14 = (i13 ^ 89) + ((i13 & 89) << 1);
                                            b = i14 % 128;
                                            if (i14 % 2 == 0) {
                                                c3 = 0;
                                                int i1117 = 46 / 0;
                                                if (str2 != null) {
                                                    objArr = new Object[2];
                                                    objArr[c3] = new int[]{i119};
                                                    int i1118 = (~(i & 20)) & (i | 20);
                                                    int i1119 = i13 + 67;
                                                    b = i1119 % 128;
                                                    int i11110 = i1119 % 2;
                                                    objArr[1] = new String[]{str2};
                                                    c = 0;
                                                } else {
                                                    i10 = 2;
                                                }
                                            } else {
                                                c3 = 0;
                                                if (str2 != null) {
                                                    objArr = new Object[2];
                                                    objArr[c3] = new int[]{i1118};
                                                    int i11111 = (~(i & 20)) & (i | 20);
                                                    int i11112 = i13 + 67;
                                                    b = i11112 % 128;
                                                    int i11113 = i11112 % 2;
                                                    objArr[1] = new String[]{str2};
                                                    c = 0;
                                                } else {
                                                    i10 = 2;
                                                }
                                            }
                                        }
                                        objArr2 = new Object[i10];
                                        objArr2[0] = new int[]{i};
                                        strArr = new String[0];
                                        int i12110 = b;
                                        int i12111 = ((i12110 | 27) << 1) - (i12110 ^ 27);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12111 % 128;
                                        int i12112 = i12111 % 2;
                                        i11 = (i12110 ^ 109) + ((i12110 & 109) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            objArr2[1] = strArr;
                                            c = 0;
                                            int i12113 = 64 / 0;
                                        } else {
                                            c = 0;
                                            objArr2[1] = strArr;
                                        }
                                        objArr = objArr2;
                                    }
                                }
                                int i12114 = ((int[]) objArr[c])[c];
                                int i12115 = (~(i & i71)) & (i | i71);
                                int i12116 = -i12115;
                                int i12117 = ((i12115 & i12116) | (i12115 ^ i12116)) >> 31;
                                int i12118 = (~i12117) & i12114;
                                int i12119 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i13110 = (i12119 ^ 61) + ((i12119 & 61) << 1);
                                b = i13110 % 128;
                                int i13111 = i13110 % 2;
                                int i13112 = i71 & i12117;
                                int i13113 = (i13112 & i12118) | (i12118 ^ i13112);
                                String[] strArr7 = (String[]) objArr[1];
                                Object[] objArr113 = new Object[2];
                                int i13114 = (i12114 & i54) | ((~i12114) & i);
                                int i13115 = -i13114;
                                int i13116 = (((i13114 & i13115) | (i13114 ^ i13115)) >> 31) & 1;
                                int i13117 = (~(((-i13116) | i13116) >> 31)) & 1;
                                objArr113[i13116] = null;
                                objArr113[i13117] = strArr7;
                                String[] strArr8 = (String[]) objArr113[0];
                                int i13118 = i ^ i13113;
                                i4 = ((i13118 | (-i13118)) >> 31) & 16;
                                int i13119 = (i12119 ^ 89) + ((i12119 & 89) << 1);
                                b = i13119 % 128;
                                int i14110 = i13119 % 2;
                                Object[] objArr114 = {new int[]{i}, new int[1], new int[]{i13113}, strArr8};
                                int i14111 = (int) Runtime.getRuntime().totalMemory();
                                int i14112 = ~i14111;
                                int i14113 = (-868597916) + (((~((-1005619122) | i14112)) | 40928801 | (~(965308892 | i14112)) | (~((-618573) | i14111))) * (-84));
                                int i14114 = (~(i14111 | 965308892)) | 1005619121;
                                int i14115 = ~(i14112 | (-965308893));
                                i5 = i14113 + ((i14114 | i14115) * (-84)) + ((618572 | i14115) * 84);
                                int i14116 = i4 * 303;
                                int i14117 = i5 * (-301);
                                i6 = (i14116 ^ i14117) + ((i14116 & i14117) << 1);
                                i7 = b + 37;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                                if (i7 % 2 != 0) {
                                    int i14118 = ~i4;
                                    int i14119 = ~i;
                                    int i15110 = ~((i14118 & i14119) | (i14118 ^ i14119) | i5);
                                    int i15111 = (i4 ^ i5) | (i4 & i5);
                                    int i15112 = ~((i15111 & i) | (i15111 ^ i));
                                    int i15113 = i6 - (((i15110 & i15112) | (i15110 ^ i15112)) * (-302));
                                    int i15114 = ~i4;
                                    int i15115 = (i15114 & i5) | (i15114 ^ i5);
                                    int i15116 = -(-((-604) >>> (~((i15115 & i) | (i15115 ^ i)))));
                                    i8 = (i15113 & i15116) + (i15116 | i15113);
                                    i9 = ~i5;
                                } else {
                                    int i15117 = ~i4;
                                    int i15118 = ~i;
                                    int i15119 = i6 + (((~((i15118 & i15117) | (i15117 ^ i15118) | i5)) | (~(i4 | i5 | i))) * (-302));
                                    int i1618 = (i15117 & i5) | (i15117 ^ i5);
                                    i8 = (i15119 - (~(-(-((~((i1618 & i) | (i1618 ^ i))) * (-604)))))) - 1;
                                    i9 = ~i5;
                                }
                                int i1619 = ~((i9 & i4) | (i9 ^ i4));
                                int i16110 = ~((i & i5) | (i5 ^ i));
                                int i16111 = 302 * ((i1619 & i16110) | (i1619 ^ i16110));
                                int i16112 = i2 + (((i8 | i16111) << 1) - (i16111 ^ i8));
                                int i16113 = i16112 << 13;
                                int i16114 = ((~i16112) & i16113) | ((~i16113) & i16112);
                                int i16115 = i16114 >>> 17;
                                int i16116 = (i16114 | i16115) & (~(i16114 & i16115));
                                ((int[]) objArr114[1])[0] = i16116 ^ (i16116 << 5);
                                return objArr114;
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                    }
                    int i170 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i171 = (i170 & 49) + (i170 | 49);
                    b = i171 % 128;
                    int i172 = i171 % 2;
                    str2 = null;
                    i10 = 2;
                    objArr2 = new Object[i10];
                    objArr2[0] = new int[]{i};
                    strArr = new String[0];
                    int i121110 = b;
                    int i121111 = ((i121110 | 27) << 1) - (i121110 ^ 27);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i121111 % 128;
                    int i121112 = i121111 % 2;
                    i11 = (i121110 ^ 109) + ((i121110 & 109) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    if (i11 % 2 != 0) {
                        objArr2[1] = strArr;
                        c = 0;
                        int i121113 = 64 / 0;
                    } else {
                        c = 0;
                        objArr2[1] = strArr;
                    }
                    objArr = objArr2;
                    int i121114 = ((int[]) objArr[c])[c];
                    int i121115 = (~(i & i71)) & (i | i71);
                    int i121116 = -i121115;
                    int i121117 = ((i121115 & i121116) | (i121115 ^ i121116)) >> 31;
                    int i121118 = (~i121117) & i121114;
                    int i121119 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i131110 = (i121119 ^ 61) + ((i121119 & 61) << 1);
                    b = i131110 % 128;
                    int i131111 = i131110 % 2;
                    int i131112 = i71 & i121117;
                    int i131113 = (i131112 & i121118) | (i121118 ^ i131112);
                    String[] strArr9 = (String[]) objArr[1];
                    Object[] objArr115 = new Object[2];
                    int i131114 = (i121114 & i54) | ((~i121114) & i);
                    int i131115 = -i131114;
                    int i131116 = (((i131114 & i131115) | (i131114 ^ i131115)) >> 31) & 1;
                    int i131117 = (~(((-i131116) | i131116) >> 31)) & 1;
                    objArr115[i131116] = null;
                    objArr115[i131117] = strArr9;
                    String[] strArr10 = (String[]) objArr115[0];
                    int i131118 = i ^ i131113;
                    i4 = ((i131118 | (-i131118)) >> 31) & 16;
                    int i131119 = (i121119 ^ 89) + ((i121119 & 89) << 1);
                    b = i131119 % 128;
                    int i141110 = i131119 % 2;
                    Object[] objArr116 = {new int[]{i}, new int[1], new int[]{i131113}, strArr10};
                    int i141111 = (int) Runtime.getRuntime().totalMemory();
                    int i141112 = ~i141111;
                    int i141113 = (-868597916) + (((~((-1005619122) | i141112)) | 40928801 | (~(965308892 | i141112)) | (~((-618573) | i141111))) * (-84));
                    int i141114 = (~(i141111 | 965308892)) | 1005619121;
                    int i141115 = ~(i141112 | (-965308893));
                    i5 = i141113 + ((i141114 | i141115) * (-84)) + ((618572 | i141115) * 84);
                    int i141116 = i4 * 303;
                    int i141117 = i5 * (-301);
                    i6 = (i141116 ^ i141117) + ((i141116 & i141117) << 1);
                    i7 = b + 37;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i141118 = ~i4;
                        int i141119 = ~i;
                        int i151110 = ~((i141118 & i141119) | (i141118 ^ i141119) | i5);
                        int i151111 = (i4 ^ i5) | (i4 & i5);
                        int i151112 = ~((i151111 & i) | (i151111 ^ i));
                        int i151113 = i6 - (((i151110 & i151112) | (i151110 ^ i151112)) * (-302));
                        int i151114 = ~i4;
                        int i151115 = (i151114 & i5) | (i151114 ^ i5);
                        int i151116 = -(-((-604) >>> (~((i151115 & i) | (i151115 ^ i)))));
                        i8 = (i151113 & i151116) + (i151116 | i151113);
                        i9 = ~i5;
                    } else {
                        int i151117 = ~i4;
                        int i151118 = ~i;
                        int i151119 = i6 + (((~((i151118 & i151117) | (i151117 ^ i151118) | i5)) | (~(i4 | i5 | i))) * (-302));
                        int i16117 = (i151117 & i5) | (i151117 ^ i5);
                        i8 = (i151119 - (~(-(-((~((i16117 & i) | (i16117 ^ i))) * (-604)))))) - 1;
                        i9 = ~i5;
                    }
                    int i16118 = ~((i9 & i4) | (i9 ^ i4));
                    int i16119 = ~((i & i5) | (i5 ^ i));
                    int i161110 = 302 * ((i16118 & i16119) | (i16118 ^ i16119));
                    int i161111 = i2 + (((i8 | i161110) << 1) - (i161110 ^ i8));
                    int i161112 = i161111 << 13;
                    int i161113 = ((~i161111) & i161112) | ((~i161112) & i161111);
                    int i161114 = i161113 >>> 17;
                    int i161115 = (i161113 | i161114) & (~(i161113 & i161114));
                    ((int[]) objArr116[1])[0] = i161115 ^ (i161115 << 5);
                    return objArr116;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r6, byte r7, byte r8) {
                /*
                    byte[] r0 = com.google.firebase.crashlytics.internal.persistence.FileStore$$ExternalSyntheticLambda0.$$c
                    int r8 = r8 * 3
                    int r8 = r8 + 107
                    int r7 = r7 * 4
                    int r7 = 4 - r7
                    int r6 = r6 * 2
                    int r6 = 1 - r6
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L27
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L25:
                    r3 = r0[r7]
                L27:
                    int r7 = r7 + 1
                    int r8 = r8 + r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.FileStore$$ExternalSyntheticLambda0.$$e(int, byte, byte):java.lang.String");
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            cleanupFileSystemDir(str2);
        }
    }

    static boolean recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        return file.delete();
    }

    public File getCommonFile(String str) {
        return new File(this.crashlyticsDir, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return safeArrayToList(this.crashlyticsDir.listFiles(filenameFilter));
    }

    private File getSessionDir(String str) {
        return prepareDir(new File(this.sessionsDir, str));
    }

    public File getSessionFile(String str, String str2) {
        return new File(getSessionDir(str), str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        return safeArrayToList(getSessionDir(str).listFiles(filenameFilter));
    }

    public File getNativeSessionDir(String str) {
        return prepareDir(new File(getSessionDir(str), NATIVE_SESSION_SUBDIR));
    }

    public boolean deleteSessionFiles(String str) {
        return recursiveDelete(new File(this.sessionsDir, str));
    }

    public List<String> getAllOpenSessionIds() {
        return safeArrayToList(this.sessionsDir.list());
    }

    public File getReport(String str) {
        return new File(this.reportsDir, str);
    }

    public List<File> getReports() {
        return safeArrayToList(this.reportsDir.listFiles());
    }

    public File getPriorityReport(String str) {
        return new File(this.priorityReportsDir, str);
    }

    public List<File> getPriorityReports() {
        return safeArrayToList(this.priorityReportsDir.listFiles());
    }

    public File getNativeReport(String str) {
        return new File(this.nativeReportsDir, str);
    }

    public List<File> getNativeReports() {
        return safeArrayToList(this.nativeReportsDir.listFiles());
    }

    private static File prepareDir(File file) {
        file.mkdirs();
        return file;
    }

    private static File prepareBaseDir(File file) {
        synchronized (FileStore.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Unexpected non-directory file: ");
                sb.append(file);
                sb.append("; deleting file and creating new directory.");
                logger.d(sb.toString());
                file.delete();
            }
            if (!file.mkdirs()) {
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder("Could not create Crashlytics-specific directory: ");
                sb2.append(file);
                logger2.e(sb2.toString());
            }
            return file;
        }
    }

    private static <T> List<T> safeArrayToList(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    private boolean useV3FileSystem() {
        return !this.processName.isEmpty();
    }

    static String sanitizeName(String str) {
        if (str.length() > 40) {
            return CommonUtils.sha1(str);
        }
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }
}
