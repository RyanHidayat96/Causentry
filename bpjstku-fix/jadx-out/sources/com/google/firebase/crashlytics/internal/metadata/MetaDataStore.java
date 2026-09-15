package com.google.firebase.crashlytics.internal.metadata;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import defpackage.InputBufferImpl;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.binary.Hex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class MetaDataStore {
    private static final String KEY_USER_ID = "userId";
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final Charset UTF_8;
    private static boolean b;
    private static int g;
    private final FileStore fileStore;
    private static final byte[] $$c = {57, -50, -56, -93};
    private static final int $$f = 202;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {112, 19, -59, 97, -12, 2, 63, -52, -14, 6, -9, -1, 9, -10, 71, -54, 3, -19, 19, 51, -71, 2, 14, -13, 68, -63, -2, 11, -1, -7, 62, -68, 13, -12, -4, 16, -14, -1, 70, -39, -27, 12, 3, -19, 15, 33, -33, -17, 13, 6, -2, 17, -27, 4, 6, -9};
    private static final int $$e = 201;
    private static final byte[] $$a = {74, 60, 122, -26, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 21;
    private static int d = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.firebase.crashlytics.internal.metadata.MetaDataStore.$$a
            int r6 = r6 + 4
            int r7 = r7 * 52
            int r1 = 53 - r7
            int r5 = r5 * 14
            int r5 = r5 + 84
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r6]
            int r3 = r3 + 1
        L2b:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.MetaDataStore.a(short, byte, short, java.lang.Object[]):void");
    }

    private static void e(int i, byte b2, byte b3, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = (b2 * 52) + 4;
        int i3 = b3 * 52;
        int i4 = 99 - i;
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 += -i2;
            i2++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i2;
            i4 += -bArr[i2];
            i2 = i8 + 1;
            i6 = i7;
        }
    }

    static {
        g = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
        int i = TuitionPaymentFragmentbindingInflater1 + 83;
        g = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MetaDataStore(FileStore fileStore) {
        this.fileStore = fileStore;
    }

    public void writeUserData(String str, String str2) throws Throwable {
        BufferedWriter bufferedWriter;
        int i = 2 % 2;
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                String strUserIdToJson = userIdToJson(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
                try {
                    bufferedWriter.write(strUserIdToJson);
                    bufferedWriter.flush();
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    int i2 = asBinder + 23;
                    d = i2 % 128;
                    int i3 = i2 % 2;
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter2 = bufferedWriter;
                    Logger.getLogger().w("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                    int i4 = asBinder + 125;
                    d = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter = bufferedWriter2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String readUserId(String str) throws Throwable {
        FileInputStream fileInputStream;
        int i = 2 % 2;
        File userDataFileForSession = getUserDataFileForSession(str);
        InputBufferImpl inputBufferImpl = 0;
        if (userDataFileForSession.exists()) {
            int i2 = d + 57;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            try {
                if (userDataFileForSession.length() != 0) {
                    try {
                        fileInputStream = new FileInputStream(userDataFileForSession);
                        try {
                            String strJsonToUserId = jsonToUserId(CommonUtils.streamToString(fileInputStream));
                            Logger logger = Logger.getLogger();
                            StringBuilder sb = new StringBuilder("Loaded userId ");
                            sb.append(strJsonToUserId);
                            sb.append(" for session ");
                            sb.append(str);
                            logger.d(sb.toString());
                            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                            return strJsonToUserId;
                        } catch (Exception e2) {
                            e = e2;
                            Logger.getLogger().w("Error deserializing user metadata.", e);
                            safeDeleteCorruptFile(userDataFileForSession);
                            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.closeOrLog(inputBufferImpl, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputBufferImpl = 2;
            }
        }
        Logger.getLogger().d("No userId set for session ".concat(String.valueOf(str)));
        safeDeleteCorruptFile(userDataFileForSession);
        int i4 = asBinder + 113;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return null;
    }

    public void writeKeyData(String str, Map<String, String> map) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        d = i2 % 128;
        int i3 = i2 % 2;
        writeKeyData(str, map, false);
        int i4 = asBinder + 65;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void writeKeyData(String str, Map<String, String> map, boolean z) throws Throwable {
        File keysFileForSession;
        BufferedWriter bufferedWriter;
        int i = 2 % 2;
        if (z) {
            keysFileForSession = getInternalKeysFileForSession(str);
            int i2 = asBinder + 81;
            d = i2 % 128;
            int i3 = i2 % 2;
        } else {
            keysFileForSession = getKeysFileForSession(str);
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                String strKeysDataToJson = keysDataToJson(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(keysFileForSession), UTF_8));
                try {
                    bufferedWriter.write(strKeysDataToJson);
                    bufferedWriter.flush();
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    int i4 = asBinder + 71;
                    d = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter2 = bufferedWriter;
                    Logger.getLogger().w("Error serializing key/value metadata.", e);
                    safeDeleteCorruptFile(keysFileForSession);
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter = bufferedWriter2;
        }
    }

    public Map<String, String> readKeyData(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> keyData = readKeyData(str, false);
        int i4 = asBinder + 69;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return keyData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    Map<String, String> readKeyData(String str, boolean z) throws Throwable {
        File keysFileForSession;
        Exception e2;
        Throwable th;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 103;
        d = i3 % 128;
        int i4 = i3 % 2;
        FileInputStream fileInputStream = null;
        if (z) {
            int i5 = i2 + 77;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                keysFileForSession = getInternalKeysFileForSession(str);
            } else {
                getInternalKeysFileForSession(str);
                fileInputStream.hashCode();
                throw null;
            }
        } else {
            keysFileForSession = getKeysFileForSession(str);
        }
        if (!keysFileForSession.exists() || keysFileForSession.length() == 0) {
            safeDeleteCorruptFile(keysFileForSession, "The file has a length of zero for session: ".concat(String.valueOf(str)));
            return Collections.emptyMap();
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(keysFileForSession);
            try {
                Map<String, String> mapJsonToKeysData = jsonToKeysData(CommonUtils.streamToString(fileInputStream2));
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                return mapJsonToKeysData;
            } catch (Exception e3) {
                e2 = e3;
                fileInputStream = fileInputStream2;
                try {
                    Logger.getLogger().w("Error deserializing user metadata.", e2);
                    safeDeleteCorruptFile(keysFileForSession);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                th = th;
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
        } catch (Throwable th4) {
            th = th4;
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            throw th;
        }
    }

    public List<RolloutAssignment> readRolloutsState(String str) throws Throwable {
        FileInputStream fileInputStream;
        int i = 2 % 2;
        int i2 = asBinder + 105;
        d = i2 % 128;
        FileInputStream fileInputStream2 = null;
        if (i2 % 2 != 0) {
            getRolloutsStateForSession(str).exists();
            throw null;
        }
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (!(!rolloutsStateForSession.exists())) {
            try {
                if (rolloutsStateForSession.length() != 0) {
                    try {
                        fileInputStream = new FileInputStream(rolloutsStateForSession);
                        try {
                            List<RolloutAssignment> listJsonToRolloutsState = jsonToRolloutsState(CommonUtils.streamToString(fileInputStream));
                            Logger logger = Logger.getLogger();
                            StringBuilder sb = new StringBuilder("Loaded rollouts state:\n");
                            sb.append(listJsonToRolloutsState);
                            sb.append("\nfor session ");
                            sb.append(str);
                            logger.d(sb.toString());
                            CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                            int i3 = d + 89;
                            asBinder = i3 % 128;
                            int i4 = i3 % 2;
                            return listJsonToRolloutsState;
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = fileInputStream;
                            Logger.getLogger().w("Error deserializing rollouts state.", e);
                            safeDeleteCorruptFile(rolloutsStateForSession);
                            CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                            return Collections.emptyList();
                        } catch (Throwable th) {
                            th = th;
                            CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
            }
        }
        safeDeleteCorruptFile(rolloutsStateForSession, "The file has a length of zero for session: ".concat(String.valueOf(str)));
        return Collections.emptyList();
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        char c = 0;
        if (cArr3 != null) {
            int i4 = $11 + 79;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 101;
                $11 = i7 % 128;
                if (i7 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = Integer.valueOf(cArr3[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cAxisFromString = (char) (31338 - MotionEvent.axisFromString(""));
                            int scrollBarFadeDuration = 2994 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i8 = 18 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, scrollBarFadeDuration, i8, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.myPid() >> 22) + 31339), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2995, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17, 1182129903, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                j = 0;
                c = 0;
            }
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 43325), View.MeasureSpec.getSize(0) + 253, View.combineMeasuredStates(0, 0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        int i9 = 1687675375;
        if (b) {
            int i10 = $11 + 37;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i11 = $11 + 47;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getTouchSlop() >> 8)), 3085 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), -2146875848, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i13 = $11 + 45;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i15 = $10 + 81;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i9);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (b8 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33603 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 3085 - TextUtils.getCapsMode("", 0, 0), Color.blue(0) + 26, -2146875848, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            int i17 = $11 + 3;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            i9 = 1687675375;
        }
        objArr[0] = new String(cArr6);
    }

    public void writeRolloutState(String str, List<RolloutAssignment> list) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        d = i2 % 128;
        int i3 = i2 % 2;
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            if (list.isEmpty()) {
                int i4 = asBinder + 19;
                d = i4 % 128;
                if (i4 % 2 == 0) {
                    safeDeleteCorruptFile(rolloutsStateForSession, "Rollout state is empty for session: ".concat(String.valueOf(str)));
                    return;
                } else {
                    safeDeleteCorruptFile(rolloutsStateForSession, "Rollout state is empty for session: ".concat(String.valueOf(str)));
                    bufferedWriter.hashCode();
                    throw null;
                }
            }
            try {
                String strRolloutsStateToJson = rolloutsStateToJson(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rolloutsStateForSession), UTF_8));
                try {
                    bufferedWriter2.write(strRolloutsStateToJson);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
                    return;
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().w("Error serializing rollouts state.", e);
                    safeDeleteCorruptFile(rolloutsStateForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                    return;
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
        throw th;
    }

    public File getUserDataFileForSession(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        d = i2 % 128;
        int i3 = i2 % 2;
        File sessionFile = this.fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
        int i4 = asBinder + 69;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return sessionFile;
    }

    public File getKeysFileForSession(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        d = i2 % 128;
        int i3 = i2 % 2;
        File sessionFile = this.fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
        int i4 = d + 11;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return sessionFile;
    }

    public File getInternalKeysFileForSession(String str) {
        int i = 2 % 2;
        int i2 = d + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        File sessionFile = this.fileStore.getSessionFile(str, UserMetadata.INTERNAL_KEYDATA_FILENAME);
        int i4 = d + 21;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return sessionFile;
        }
        throw null;
    }

    public File getRolloutsStateForSession(String str) {
        int i = 2 % 2;
        int i2 = d + 49;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
        }
        this.fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private String jsonToUserId(String str) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) (37567 - TextUtils.getCapsMode("", 0, 0));
            int iNormalizeMetaState = 625 - KeyEvent.normalizeMetaState(0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 15;
            byte b2 = $$a[5];
            byte b3 = (byte) (-b2);
            byte b4 = b2;
            Object[] objArr2 = new Object[1];
            a(b3, b4, (byte) (-b4), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, iNormalizeMetaState, iLastIndexOf, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, 127 - TextUtils.getOffsetBefore("", 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 37568);
            int i2 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 624;
            int i3 = 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            byte b5 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b5, bArr[5], b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i2, i3, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 37568);
                int iIndexOf = 625 - TextUtils.indexOf("", "", 0, 0);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                a(b7, (byte) (b7 | 51), b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, iIndexOf, keyRepeatDelay, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = 1528753980 + (((~((-1200842803) | i6)) | (~((-622895319) | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | (-1116948513))) | (~(i6 | (-539001029)))) * 210) + 807302121;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i4}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, 127 - TextUtils.indexOf("", "", 0, 0), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            int length = str != null ? str.length() : 0;
            Object[] objArr10 = new Object[1];
            c(null, null, View.getDefaultSize(0, 0) + 127, new byte[]{-101, -103, -102, -101, -101, -94, -93, -99, -101, -103, -93, -94, -127, -93, -92, -127, -98, -95, -116, -102, -93, -94, -98, -102, -127, -93, -96, -96, -99, -103, -127, -99, -99, -94, -125, -95, -96, -101, -97, -116, -101, -97, -97, -98, -116, -100, -96, -97, -98, -127, -116, -116, -98, -102, -102, -99, -100, -102, -101, -127, -127, -102, -116, -103}, objArr10);
            String str2 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            c(null, null, ExpandableListView.getPackedPositionChild(0L) + 128, new byte[]{-102, -100, -92, -127, -94, -103, -102, -112, -103, -95, -94, -101, -99, -99, -112, -99, -95, -95, -94, -97, -100, -102, -116, -103, -103, -127, -116, -94, -96, -98, -101, -99, -93, -99, -99, -95, -99, -101, -94, -101, -100, -102, -97, -98, -95, -100, -95, -103, -94, -102, -103, -116, -101, -92, -102, -116, -97, -101, -98, -92, -100, -125, -127, -112}, objArr11);
            String[] strArr2 = {str2, (String) objArr11[0]};
            int i10 = asBinder + 117;
            d = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, strArr2, Integer.valueOf(length), 17, 807302121};
                byte[] bArr2 = $$d;
                byte b8 = (byte) (bArr2[11] + 1);
                byte b9 = b8;
                Object[] objArr13 = new Object[1];
                e(b8, b9, b9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                byte b10 = (byte) (-bArr2[11]);
                byte b11 = b10;
                Object[] objArr14 = new Object[1];
                e(b10, b11, b11, objArr14);
                objArr = (Object[]) cls3.getMethod((String) objArr14[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                int i12 = ((int[]) objArr[0])[0];
                int i13 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMyTid = (char) ((Process.myTid() >> 22) + 37567);
                        int iMyPid = (Process.myPid() >> 22) + 625;
                        int maximumDrawingCacheSize = 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr15 = new Object[1];
                        a(b13, (byte) (b13 | 51), b12, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, iMyPid, maximumDrawingCacheSize, -973632554, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(null, null, View.MeasureSpec.getSize(0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(null, null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char defaultSize = (char) (37567 - View.getDefaultSize(0, 0));
                            int i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 624;
                            int iRgb = Color.rgb(0, 0, 0) + 16777230;
                            byte[] bArr3 = $$a;
                            byte b14 = bArr3[7];
                            Object[] objArr18 = new Object[1];
                            a(b14, bArr3[5], b14, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, i14, iRgb, -976899241, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37567);
                            int bitsPerPixel2 = 624 - ImageFormat.getBitsPerPixel(0);
                            int defaultSize2 = View.getDefaultSize(0, 0) + 14;
                            byte b15 = $$a[5];
                            byte b16 = (byte) (-b15);
                            byte b17 = b15;
                            Object[] objArr19 = new Object[1];
                            a(b16, b17, (byte) (-b17), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, bitsPerPixel2, defaultSize2, -477065106, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i15 = d + 65;
                        asBinder = i15 % 128;
                        int i16 = i15 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i17 = asBinder + 51;
                d = i17 % 128;
                int i18 = i17 % 2;
                for (String str3 : strArr3) {
                    arrayList.add(str3);
                }
            }
            throw null;
        }
        int i19 = d + 59;
        asBinder = i19 % 128;
        int i20 = i19 % 2;
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[2])[0];
        int i23 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i22};
        int iMyUid = Process.myUid();
        int i24 = i21 + 1767443508 + ((~(1005846262 | iMyUid)) * (-301)) + (((~((-854699571) | iMyUid)) | (~((~iMyUid) | 969038550))) * (-301)) + (((~(iMyUid | (-969038551))) | (-854699571)) * 301);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr[1])[0] = i26 ^ (i26 << 5);
        Object[] objArr20 = {new int[]{i23}, new int[1], iArr2, strArr4};
        JSONObject jSONObject = new JSONObject(str);
        int i27 = ((int[]) objArr20[1])[0];
        int i28 = ((i27 * i27) - (~(-(1492219186 * i27)))) - 1;
        int i29 = -(i27 * 632065188);
        int i30 = (i28 & i29) + (i29 | i28);
        int i31 = (i30 & 990566329) + (990566329 | i30);
        int i32 = i31 >> 28;
        int i33 = ((i32 ^ (-31)) + ((i32 & (-31)) << 1)) / 16;
        int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
        int i35 = (i31 ^ i34) + ((i34 & i31) << 1);
        int i36 = ((i31 >> 29) - 15) / 8;
        int i37 = -(i35 ^ ((i36 ^ 1) + ((i36 & 1) << 1)));
        int i38 = ((i37 | 7) << 1) - (i37 ^ 7);
        int i39 = i38 >> 18;
        int i40 = ((i39 ^ (-32767)) + ((i39 & (-32767)) << 1)) / 16384;
        int i41 = (i40 ^ 1) + ((i40 & 1) << 1);
        return valueOrNull(jSONObject, "20|2|userId".substring(6965 / (((-((i41 ^ 1) + ((i41 & 1) << 1))) & i38) * 199)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.crashlytics.internal.metadata.MetaDataStore$1] */
    private static String userIdToJson(String str) throws JSONException {
        int i = 2 % 2;
        String string = new JSONObject(str) { // from class: com.google.firebase.crashlytics.internal.metadata.MetaDataStore.1
            final /* synthetic */ String val$userId;

            {
                this.val$userId = str;
                put(MetaDataStore.KEY_USER_ID, str);
            }
        }.toString();
        int i2 = d + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private static Map<String, String> jsonToKeysData(String str) throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        int i2 = asBinder + 41;
        d = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!itKeys.hasNext()) {
                return map;
            }
            int i4 = asBinder + 83;
            d = i4 % 128;
            int i5 = i4 % 2;
            String next = itKeys.next();
            map.put(next, valueOrNull(jSONObject, next));
            i2 = d + 13;
            asBinder = i2 % 128;
        }
    }

    private static String keysDataToJson(Map<String, String> map) {
        int i = 2 % 2;
        String string = new JSONObject(map).toString();
        int i2 = d + 89;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return string;
    }

    private static List<RolloutAssignment> jsonToRolloutsState(String str) throws JSONException {
        String string;
        int i = 2 % 2;
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        int i2 = asBinder + 27;
        d = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            int i5 = d + 117;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                string = jSONArray.getString(i4);
                arrayList.add(RolloutAssignment.create(string));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            string = jSONArray.getString(i4);
            try {
                arrayList.add(RolloutAssignment.create(string));
            } catch (Exception e2) {
                Logger.getLogger().w("Failed de-serializing rollouts state. ".concat(String.valueOf(string)), e2);
            }
            Logger.getLogger().w("Failed de-serializing rollouts state. ".concat(String.valueOf(string)), e2);
        }
        return arrayList;
    }

    private static String rolloutsStateToJson(List<RolloutAssignment> list) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i2))));
                int i3 = d + 91;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            } catch (JSONException e2) {
                Logger.getLogger().w("Exception parsing rollout assignment!", e2);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        int i = 2 % 2;
        if (jSONObject.isNull(str)) {
            return null;
        }
        int i2 = d + 49;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObject.optString(str, null);
            throw null;
        }
        String strOptString = jSONObject.optString(str, null);
        int i3 = asBinder + 41;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 0;
        }
        return strOptString;
    }

    private static void safeDeleteCorruptFile(File file) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            file.exists();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (file.exists() && file.delete()) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Deleted corrupt file: ");
            sb.append(file.getAbsolutePath());
            logger.i(sb.toString());
            int i3 = d + 101;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static void safeDeleteCorruptFile(File file, String str) {
        int i = 2 % 2;
        int i2 = d + 43;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            file.exists();
            throw null;
        }
        if (file.exists() && file.delete()) {
            Logger.getLogger().i(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
        int i3 = d + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{47390, 47377, 47387, 47373, 47376, 47382, 47313, 47372, 47340, 47366, 47371, 47386, 47378, 47356, 47379, 47388, 47380, 47375, 47341, 47358, 47369, 47339, 47383, 47370, 47309, 47385, 47389, 47305, 47302, 47306, 47304, 47310, 47308, 47307, 47303, 47311};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719615;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        b = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            int r8 = 68 - r8
            byte[] r0 = com.google.firebase.crashlytics.internal.metadata.MetaDataStore.$$c
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r8 = r8 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.MetaDataStore.$$g(short, int, int):java.lang.String");
    }
}
