package com.google.firebase.crashlytics.internal.metadata;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.google.firebase.abt.R;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";
    public static final int MAX_ATTRIBUTES = 64;
    public static final int MAX_ATTRIBUTE_SIZE = 1024;
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final MetaDataStore metaDataStore;
    private String sessionIdentifier;
    private final SerializeableKeysMap customKeys = new SerializeableKeysMap(false);
    private final SerializeableKeysMap internalKeys = new SerializeableKeysMap(true);
    private final RolloutAssignmentList rolloutsState = new RolloutAssignmentList(128);
    private final AtomicMarkableReference<String> userId = new AtomicMarkableReference<>(null, false);

    public static String readUserId(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).readUserId(str);
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsWorkers);
        userMetadata.customKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, false));
        userMetadata.internalKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, true));
        userMetadata.userId.set(metaDataStore.readUserId(str), false);
        userMetadata.rolloutsState.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        this.sessionIdentifier = str;
        this.metaDataStore = new MetaDataStore(fileStore);
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    public void setNewSession(final String str) {
        synchronized (this.sessionIdentifier) {
            this.sessionIdentifier = str;
            final Map<String, String> keys = this.customKeys.getKeys();
            final List<RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
            this.crashlyticsWorkers.diskWrite.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.m7945xeeb41fb7(str, keys, rolloutAssignmentList);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$setNewSession$0$com-google-firebase-crashlytics-internal-metadata-UserMetadata, reason: not valid java name */
    /* synthetic */ void m7945xeeb41fb7(String str, Map map, List list) throws Throwable {
        if (getUserId() != null) {
            this.metaDataStore.writeUserData(str, getUserId());
        }
        if (!map.isEmpty()) {
            this.metaDataStore.writeKeyData(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.metaDataStore.writeRolloutState(str, list);
    }

    public String getUserId() {
        return this.userId.getReference();
    }

    /* JADX INFO: loaded from: classes5.dex */
    class SerializeableKeysMap {
        private final boolean isInternal;
        final AtomicMarkableReference<KeysMap> map;
        private final AtomicReference<Runnable> queuedSerializer = new AtomicReference<>(null);
        private static final byte[] $$c = {87, -91, 60, 112};
        private static final int $$d = 189;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {38, 31, -70, -1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
        private static final int $$b = 5;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        private static char TuitionPaymentFragmentbindingInflater1 = 57309;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 15
                int r0 = r5 + 38
                int r7 = 93 - r7
                int r6 = r6 * 3
                int r6 = r6 + 84
                byte[] r1 = com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap.$$a
                byte[] r0 = new byte[r0]
                int r5 = r5 + 37
                r2 = 0
                if (r1 != 0) goto L17
                r4 = r6
                r3 = r2
                r6 = r5
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L25:
                int r3 = r3 + 1
                r4 = r1[r7]
            L29:
                int r6 = r6 + r4
                int r6 = r6 + (-11)
                int r7 = r7 + 1
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap.a(short, short, byte, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
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
            int i3 = $10 + 69;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i5 = $10 + 91;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), ImageFormat.getBitsPerPixel(0) + 1236, (ViewConfiguration.getPressedStateDuration() >> 16) + 35, -653973969, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), 2764 - Color.green(0), TextUtils.indexOf("", "", 0) + 14, 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43325), (ViewConfiguration.getTouchSlop() >> 8) + 253, 22 - TextUtils.getTrimmedLength(""), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - KeyEvent.keyCodeFromString("")), 2891 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 17, 2012627446, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i7 = $11 + 47;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
            int i9 = $11 + 87;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }

        public SerializeableKeysMap(boolean z) {
            int i;
            Object obj = null;
            this.isInternal = z;
            if (z) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
                b = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                i = 8192;
            } else {
                int i5 = 2 % 2;
                i = 1024;
            }
            this.map = new AtomicMarkableReference<>(new KeysMap(64, i), false);
            int i6 = b + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public Map<String, String> getKeys() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 23;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                a(b2, b3, (byte) (b3 | 89), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, trimmedLength, iNormalizeMetaState, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{Typography.greater, 5874, 5252, 7670}, (char) TextUtils.indexOf("", ""), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{44687, 50599, 21021, 34431, 40692, 2949, 17216, 56802, 40502, 16251, 23908, 55558, 54622, 48390, 24807, 61309, 41729, 8832, 7758, 33856, 50983, 29737}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{35118, 4840, 19686, 12526}, (char) (Process.getGidForName("") + 61005), (-434968440) - TextUtils.lastIndexOf("", '0', 0), new char[]{45451, 10766, 3992, 49859, 14406, 56122, 6973, 55247, 60757, 42561, 15819, 51512, 15999, 47156, 43041}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                int scrollDefaultDelay = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i4 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                byte b4 = bArr[28];
                byte b5 = bArr[7];
                Object[] objArr5 = new Object[1];
                a(b4, b5, (byte) (b5 | 52), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollDefaultDelay, i4, 1596667560, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = b + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1756;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                    byte[] bArr2 = $$a;
                    byte b6 = bArr2[28];
                    byte b7 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    a(b6, b7, b7, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, iLastIndexOf, iCombineMeasuredStates, 1599039318, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
                int iNextInt = new Random().nextInt(811577733);
                int i7 = ~iNextInt;
                int i8 = (((((~(267673167 | i7)) | (~((-6554633) | iNextInt))) * 988) - 1279130271) + ((((~(iNextInt | 48516109)) | 219157058) | (~(i7 | (-6554633)))) * 988)) - 1648534239;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
                int i11 = b + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 5 / 4;
                }
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{37839, 35624, 41905, 32371}, (char) (29604 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{49268, 3143, 5035, 5405, 54107, 64723, 37473, 21464, 9216, 12331, 56991, 14019, 33303, 59515, 6179, 14593}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{21313, 12265, 7593, 6029}, (char) (36124 - TextUtils.lastIndexOf("", '0', 0)), Gravity.getAbsoluteGravity(0, 0), new char[]{23438, 4770, 26713, 16072, 16441, 30662, 58684, 10658, 43831, 42082, 5568, 29462, 13490, 50478, 12043, 1638}, objArr9);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr10 = {-2050271403};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - TextUtils.getOffsetBefore("", 0)), 1726 - View.resolveSize(0, 0), 29 - Gravity.getAbsoluteGravity(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -1648534239);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cGreen = (char) (29944 - Color.green(0));
                        int i13 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                        byte[] bArr3 = $$a;
                        byte b8 = bArr3[28];
                        byte b9 = bArr3[7];
                        Object[] objArr11 = new Object[1];
                        a(b8, b9, b9, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, i13, maximumDrawingCacheSize, 1599039318, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{Typography.greater, 5874, 5252, 7670}, (char) ('0' - AndroidCharacter.getMirror('0')), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{44687, 50599, 21021, 34431, 40692, 2949, 17216, 56802, 40502, 16251, 23908, 55558, 54622, 48390, 24807, 61309, 41729, 8832, 7758, 33856, 50983, 29737}, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{35118, 4840, 19686, 12526}, (char) (TextUtils.getOffsetAfter("", 0) + 61004), (-434968439) - TextUtils.getOffsetAfter("", 0), new char[]{45451, 10766, 3992, 49859, 14406, 56122, 6973, 55247, 60757, 42561, 15819, 51512, 15999, 47156, 43041}, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAlpha = (char) (29944 - Color.alpha(0));
                            int scrollDefaultDelay2 = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int i14 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[28];
                            byte b11 = bArr4[7];
                            Object[] objArr14 = new Object[1];
                            a(b10, b11, (byte) (b11 | 52), objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, scrollDefaultDelay2, i14, 1596667560, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                            int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr15 = new Object[1];
                            a(b12, b13, (byte) (b13 | 89), objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, packedPositionType, jumpTapTimeout, 986134021, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                        objArr = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
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
            int i15 = ((int[]) objArr[1])[0];
            int i16 = ((int[]) objArr[0])[0];
            if (i16 == i15) {
                int i17 = ((int[]) objArr[3])[0];
                Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i18 = i17 + ((((~((-44953455) | iIdentityHashCode)) | 190050725) * 398) - 936740319) + (((~((~iIdentityHashCode) | (-44953455))) | 190050725) * 398);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr16[3])[0] = i20 ^ (i20 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
                int i23 = ((int[]) objArr[3])[0];
                Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i24 = i23 + (-112080253) + (((~(iIdentityHashCode2 | 139181367)) | 73421058) * 191) + (((~((~iIdentityHashCode2) | 139181367)) | 69222400) * 191);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr17[3])[0] = i26 ^ (i26 << 5);
            }
            return this.map.getReference().getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                if (!this.map.getReference().setKey(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                scheduleSerializationTaskIfNeeded();
                return true;
            }
        }

        public void setKeys(Map<String, String> map) {
            synchronized (this) {
                this.map.getReference().setKeys(map);
                AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            scheduleSerializationTaskIfNeeded();
        }

        /* JADX INFO: renamed from: lambda$scheduleSerializationTaskIfNeeded$0$com-google-firebase-crashlytics-internal-metadata-UserMetadata$SerializeableKeysMap, reason: not valid java name */
        /* synthetic */ void m7947xb9b680d3() throws Throwable {
            int i = 2 % 2;
            int i2 = b + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.queuedSerializer.set(null);
            serializeIfMarked();
            int i4 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        private void scheduleSerializationTaskIfNeeded() {
            int i = 2 % 2;
            Runnable runnable = new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.m7947xb9b680d3();
                }
            };
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.queuedSerializer, null, runnable)) {
                int i2 = b + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                UserMetadata.this.crashlyticsWorkers.diskWrite.submit(runnable);
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            b = i4 % 128;
            int i5 = i4 % 2;
        }

        private void serializeIfMarked() throws Throwable {
            Map<String, String> keys;
            synchronized (this) {
                if (this.map.isMarked()) {
                    keys = this.map.getReference().getKeys();
                    AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    keys = null;
                }
            }
            if (keys != null) {
                UserMetadata.this.metaDataStore.writeKeyData(UserMetadata.this.sessionIdentifier, keys, this.isInternal);
            }
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
        private static java.lang.String $$e(byte r5, int r6, short r7) {
            /*
                int r7 = 104 - r7
                int r5 = r5 * 3
                int r5 = r5 + 4
                int r6 = r6 * 2
                int r6 = r6 + 1
                byte[] r0 = com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap.$$c
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r6
                r3 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L22:
                r4 = r0[r5]
            L24:
                int r5 = r5 + 1
                int r4 = -r4
                int r7 = r7 + r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap.$$e(byte, int, short):java.lang.String");
        }
    }

    public void setUserId(String str) {
        String strSanitizeString = KeysMap.sanitizeString(str, 1024);
        synchronized (this.userId) {
            if (CommonUtils.nullSafeEquals(strSanitizeString, this.userId.getReference())) {
                return;
            }
            this.userId.set(strSanitizeString, true);
            this.crashlyticsWorkers.diskWrite.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.serializeUserDataIfNeeded();
                }
            });
        }
    }

    public Map<String, String> getCustomKeys(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.customKeys.getKeys();
        }
        HashMap map2 = new HashMap(this.customKeys.getKeys());
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strSanitizeString = KeysMap.sanitizeString(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strSanitizeString)) {
                map2.put(strSanitizeString, KeysMap.sanitizeString(entry.getValue(), 1024));
            } else {
                i++;
            }
        }
        if (i > 0) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Ignored ");
            sb.append(i);
            sb.append(" keys when adding event specific keys. Maximum allowable: 1024");
            logger.w(sb.toString());
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map<String, String> getCustomKeys() {
        return this.customKeys.getKeys();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.customKeys.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.customKeys.setKeys(map);
    }

    public Map<String, String> getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public boolean setInternalKey(String str, String str2) {
        return this.internalKeys.setKey(str, str2);
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.rolloutsState) {
            if (!this.rolloutsState.updateRolloutAssignmentList(list)) {
                return false;
            }
            final List<RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
            this.crashlyticsWorkers.diskWrite.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.m7946x8982b7e8(rolloutAssignmentList);
                }
            });
            return true;
        }
    }

    /* JADX INFO: renamed from: lambda$updateRolloutsState$1$com-google-firebase-crashlytics-internal-metadata-UserMetadata, reason: not valid java name */
    /* synthetic */ void m7946x8982b7e8(List list) throws Throwable {
        this.metaDataStore.writeRolloutState(this.sessionIdentifier, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializeUserDataIfNeeded() throws Throwable {
        boolean z;
        String userId;
        synchronized (this.userId) {
            z = false;
            if (this.userId.isMarked()) {
                userId = getUserId();
                this.userId.set(userId, false);
                z = true;
            } else {
                userId = null;
            }
        }
        if (z) {
            this.metaDataStore.writeUserData(this.sessionIdentifier, userId);
        }
    }
}
