package com.google.firebase.abt;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
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
import android.widget.Toast;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseABTesting {
    static final String ABT_PREFERENCES = "com.google.firebase.abt";
    static final String ORIGIN_LAST_KNOWN_START_TIME_KEY_FORMAT = "%s_lastKnownExperimentStartTime";
    private final Provider<AnalyticsConnector> analyticsConnector;
    private Integer maxUserProperties = null;
    private final String originService;
    private static final byte[] $$c = {87, -91, 60, 112};
    private static final int $$f = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {7, 15, 25, 25, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -20, 16, -7, 13, -3, 4, 18, -4, 8, 1, 1, 58, -73, 3, 17, 3, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
    private static final int $$e = 20;
    private static final byte[] $$a = {57, -50, -56, -93, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 55;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {60090, 60093, 60034, 60062, 60053, 60033, 60063, 60052, 60088, 60051, 60072, 60048, 60036, 60046, 60054, 60060, 60037, 60058, 60040, 60079, 60050, 60117, 60095, 60045, 60035, 60043, 60073, 60092, 60094, 60032, 60047, 60055, 60083, 60041, 60056, 60049};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57191;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 107 - r7
            byte[] r0 = com.google.firebase.abt.FirebaseABTesting.$$a
            int r8 = r8 * 3
            int r8 = r8 + 84
            int r6 = r6 * 15
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L30:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.abt.FirebaseABTesting.a(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 53
            int r6 = r6 + 4
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r1 = com.google.firebase.abt.FirebaseABTesting.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 52
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + 3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.abt.FirebaseABTesting.d(short, short, int, java.lang.Object[]):void");
    }

    public FirebaseABTesting(Context context, Provider<AnalyticsConnector> provider, String str) {
        this.analyticsConnector = provider;
        this.originService = str;
    }

    public void replaceAllExperiments(List<Map<String, String>> list) throws Throwable {
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        throwAbtExceptionIfAnalyticsIsNull();
        if (list != null) {
            int i4 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                replaceAllExperimentsWith(convertMapsToExperimentInfos(list));
                return;
            } else {
                replaceAllExperimentsWith(convertMapsToExperimentInfos(list));
                int i5 = 41 / 0;
                return;
            }
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    public void removeAllExperiments() throws AbtException {
        int i = 2 % 2;
        int i2 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        throwAbtExceptionIfAnalyticsIsNull();
        removeExperiments(getAllExperimentsInAnalytics());
        int i4 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public List<AbtExperimentInfo> getAllExperiments() throws AbtException {
        int i = 2 % 2;
        throwAbtExceptionIfAnalyticsIsNull();
        List<AnalyticsConnector.ConditionalUserProperty> allExperimentsInAnalytics = getAllExperimentsInAnalytics();
        ArrayList arrayList = new ArrayList();
        Iterator<AnalyticsConnector.ConditionalUserProperty> it = allExperimentsInAnalytics.iterator();
        int i2 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            int i4 = b + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(AbtExperimentInfo.fromConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    public void reportActiveExperiment(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        int i = 2 % 2;
        throwAbtExceptionIfAnalyticsIsNull();
        AbtExperimentInfo.validateAbtExperimentInfo(abtExperimentInfo);
        ArrayList arrayList = new ArrayList();
        Map<String, String> stringMap = abtExperimentInfo.toStringMap();
        stringMap.remove("triggerEvent");
        arrayList.add(AbtExperimentInfo.fromMap(stringMap));
        addExperiments(arrayList);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void validateRunningExperiments(List<AbtExperimentInfo> list) throws AbtException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        b = i2 % 128;
        int i3 = i2 % 2;
        throwAbtExceptionIfAnalyticsIsNull();
        removeExperiments(getExperimentsToRemove(getAllExperiments(), list));
        int i4 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        long j = 0;
        Object obj2 = null;
        int i5 = 3;
        if (cArr3 != null) {
            int i6 = $10 + 79;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 27;
                $11 = i8 % 128;
                if (i8 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) i5;
                            byte b4 = (byte) (b3 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 2266, KeyEvent.getDeadChar(0, 0) + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) 3;
                            byte b6 = (byte) (b5 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i7++;
                i3 = 2;
                j = 0;
                i5 = 3;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) 3;
            byte b8 = (byte) (b7 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), Color.rgb(0, 0, 0) + 16779483, Gravity.getAbsoluteGravity(0, 0) + 33, -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $11 + 71;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 2;
                            byte b10 = (byte) (b9 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49267), 3261 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 30, -127612708, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b11 = (byte) 0;
                                byte b12 = b11;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (22878 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.indexOf("", "", 0) + 594, 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1570859318, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i10];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i11];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i12];
                            } else {
                                int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i13];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                            }
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private void replaceAllExperimentsWith(List<AbtExperimentInfo> list) throws Throwable {
        Object[] objArr;
        char c;
        int i;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int i3 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[40], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i3, scrollBarFadeDuration, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{16, 5, '\t', 30, '\b', 19, '\t', 18, 6, 19, 22, '\t', 0, 20, '!', 0, 20, 14, 1, '\r', '#', '\n'}, (byte) (TextUtils.getTrimmedLength("") + 29), 21 - ExpandableListView.getPackedPositionChild(0L), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{1, '!', '\r', 29, 21, 0, '\b', 24, 5, 15, ' ', 31, 26, 20, 13884}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 61), 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2268;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 33;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[5], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, modifierMetaStateMask, touchSlop, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2267;
                int i4 = 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr3 = $$a;
                byte b4 = bArr3[5];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, pressedStateDuration, i4, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[0])[0];
            int i6 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i7 = (-1777496893) + (((~(929860351 | iMaxMemory)) | (-121147036)) * 672);
            int i8 = ~iMaxMemory;
            int i9 = i7 + (((~(iMaxMemory | (-121147036))) | (~((-929860352) | i8))) * (-672)) + (((~(121147035 | i8)) | (-930909952)) * 672) + 2128662972;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{16, 5, '\t', 30, '\b', 19, '\t', 18, '\r', 29, 27, 19, 4, 30, ' ', 18, 18, 21, ' ', 0, 21, 7, 3, '\t', '\f', 11}, (byte) (19 - Color.alpha(0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 27, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{31, 16, 13902, 13902, 4, 5, 0, 6, 13904, 13904, ' ', 19, '#', 16, ' ', 18, '\n', 1}, (byte) (102 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{5, 23, 29, 23, 19, '!', 16, 5, 21, 27, '\b', 4, 24, 0, 2, 15}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 70), 16 - TextUtils.indexOf("", "", 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{18, '\b', 4, 5, ' ', 18, ' ', 0, '#', 14, 21, 6, '\t', '\b', '\t', 0}, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 98), '@' - AndroidCharacter.getMirror('0'), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            b = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 2128662972};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[50];
                byte b7 = (byte) (-b6);
                byte b8 = b6;
                Object[] objArr13 = new Object[1];
                d(b7, b8, (byte) (b8 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = (byte) ($$e | 32);
                byte b10 = bArr4[50];
                Object[] objArr14 = new Object[1];
                d(b9, (byte) (b10 - 1), b10, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int iMyTid = (Process.myTid() >> 22) + 2267;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 33;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[5];
                        byte b12 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        a(b11, b12, b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, iMyTid, offsetAfter, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{16, 5, '\t', 30, '\b', 19, '\t', 18, 6, 19, 22, '\t', 0, 20, '!', 0, 20, 14, 1, '\r', '#', '\n'}, (byte) (29 - View.resolveSize(0, 0)), 22 - Color.red(0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{1, '!', '\r', 29, 21, 0, '\b', 24, 5, 15, ' ', 31, 26, 20, 13884}, (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 61), 15 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int i14 = 2267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int size = View.MeasureSpec.getSize(0) + 33;
                            byte[] bArr6 = $$a;
                            byte b13 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            a(b13, bArr6[5], b13, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, i14, size, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int maximumFlingVelocity = 2267 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0');
                            byte[] bArr7 = $$a;
                            byte b14 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            a(b14, bArr7[40], b14, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration2, maximumFlingVelocity, iIndexOf, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i15 = ((int[]) objArr[c])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
            b = i17 % 128;
            int i18 = i17 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr[2])[0];
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode;
            int i23 = i19 + (-377538161) + ((iIdentityHashCode | 41992450) * 988) + (((~(314891698 | i22)) | 220922369) * (-1976)) + (((~(iIdentityHashCode | (-493821618))) | 41992450 | (~(493821617 | i22))) * 988);
            int i24 = i23 ^ (i23 << 13);
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr21[2])[0] = i25 ^ (i25 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i26 = b + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                int i27 = 2;
                int i28 = i26 % 2;
                int i29 = 0;
                while (i29 < strArr3.length) {
                    int i30 = b + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                    if (i30 % i27 != 0) {
                        arrayList.add(strArr3[i29]);
                        i29 += 75;
                    } else {
                        arrayList.add(strArr3[i29]);
                        i29++;
                    }
                    int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    i27 = 2;
                }
                i = i27;
            } else {
                i = 2;
            }
            int[] iArr = new int[i16];
            int i33 = i16 - 1;
            iArr[i33] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i33) % i) - 1], 1).show();
            Object[] objArr22 = new Object[4];
            objArr22[0] = new int[]{i};
            objArr22[i] = new int[1];
            objArr22[3] = new int[]{i};
            int i34 = ((int[]) objArr[i])[0];
            int i35 = ((int[]) objArr[0])[0];
            int i36 = ((int[]) objArr[3])[0];
            objArr22[1] = (String[]) objArr[1];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i37 = ~((-3671561) | elapsedCpuTime);
            int i38 = ~elapsedCpuTime;
            int i39 = i34 + (-178194277) + ((i37 | (~((-536944657) | i38))) * 920) + (((~((-268097100) | i38)) | 3671560) * 920) + (((~(elapsedCpuTime | (-536944657))) | (~((-3671561) | i38)) | (~((-264425540) | elapsedCpuTime))) * 920);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr22[2])[0] = i41 ^ (i41 << 5);
        }
        if (list.isEmpty()) {
            removeAllExperiments();
            return;
        }
        List<AbtExperimentInfo> allExperiments = getAllExperiments();
        removeExperiments(getExperimentsToRemove(allExperiments, list));
        addExperiments(getExperimentsToAdd(list, allExperiments));
    }

    private ArrayList<AnalyticsConnector.ConditionalUserProperty> getExperimentsToRemove(List<AbtExperimentInfo> list, List<AbtExperimentInfo> list2) {
        int i = 2 % 2;
        ArrayList<AnalyticsConnector.ConditionalUserProperty> arrayList = new ArrayList<>();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        for (AbtExperimentInfo abtExperimentInfo : list) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (!experimentsListContainsExperiment(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo.toConditionalUserProperty(this.originService));
            }
        }
        return arrayList;
    }

    private ArrayList<AbtExperimentInfo> getExperimentsToAdd(List<AbtExperimentInfo> list, List<AbtExperimentInfo> list2) {
        int i = 2 % 2;
        ArrayList<AbtExperimentInfo> arrayList = new ArrayList<>();
        int i2 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        for (AbtExperimentInfo abtExperimentInfo : list) {
            if (!experimentsListContainsExperiment(list2, abtExperimentInfo)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                b = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(abtExperimentInfo);
                if (i5 == 0) {
                    throw null;
                }
            }
        }
        return arrayList;
    }

    private boolean experimentsListContainsExperiment(List<AbtExperimentInfo> list, AbtExperimentInfo abtExperimentInfo) {
        int i = 2 % 2;
        int i2 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String experimentId = abtExperimentInfo.getExperimentId();
        String variantId = abtExperimentInfo.getVariantId();
        for (AbtExperimentInfo abtExperimentInfo2 : list) {
            if (abtExperimentInfo2.getExperimentId().equals(experimentId) && abtExperimentInfo2.getVariantId().equals(variantId)) {
                return true;
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return false;
    }

    private void addExperiments(List<AbtExperimentInfo> list) {
        int i = 2 % 2;
        ArrayDeque arrayDeque = new ArrayDeque(getAllExperimentsInAnalytics());
        int maxUserPropertiesInAnalytics = getMaxUserPropertiesInAnalytics();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            while (arrayDeque.size() >= maxUserPropertiesInAnalytics) {
                int i2 = b + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                removeExperimentFromAnalytics(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).name);
            }
            AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = abtExperimentInfo.toConditionalUserProperty(this.originService);
            addExperimentToAnalytics(conditionalUserProperty);
            arrayDeque.offer(conditionalUserProperty);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void removeExperiments(Collection<AnalyticsConnector.ConditionalUserProperty> collection) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        Iterator<AnalyticsConnector.ConditionalUserProperty> it = collection.iterator();
        while (it.hasNext()) {
            int i4 = b + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            removeExperimentFromAnalytics(it.next().name);
        }
        int i6 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
    }

    private static List<AbtExperimentInfo> convertMapsToExperimentInfos(List<Map<String, String>> list) throws AbtException {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        b = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            b = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(AbtExperimentInfo.fromMap(it.next()));
        }
        return arrayList;
    }

    private void addExperimentToAnalytics(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            this.analyticsConnector.get().setConditionalUserProperty(conditionalUserProperty);
            throw null;
        }
        this.analyticsConnector.get().setConditionalUserProperty(conditionalUserProperty);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
    }

    private void throwAbtExceptionIfAnalyticsIsNull() throws AbtException {
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.analyticsConnector.get();
            obj.hashCode();
            throw null;
        }
        if (this.analyticsConnector.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private void removeExperimentFromAnalytics(String str) {
        int i = 2 % 2;
        int i2 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.analyticsConnector.get().clearConditionalUserProperty(str, null, null);
        int i4 = b + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private int getMaxUserPropertiesInAnalytics() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.maxUserProperties == null) {
            this.maxUserProperties = Integer.valueOf(this.analyticsConnector.get().getMaxUserProperties(this.originService));
            int i3 = b + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        }
        return this.maxUserProperties.intValue();
    }

    private List<AnalyticsConnector.ConditionalUserProperty> getAllExperimentsInAnalytics() {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.analyticsConnector.get().getConditionalUserProperties(this.originService, "");
        }
        this.analyticsConnector.get().getConditionalUserProperties(this.originService, "");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, byte r7) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r5 = 116 - r5
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.google.firebase.abt.FirebaseABTesting.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r5 = r6
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            r4 = r1[r7]
            int r3 = r3 + 1
        L25:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.abt.FirebaseABTesting.$$g(byte, short, byte):java.lang.String");
    }
}
