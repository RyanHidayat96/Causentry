package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Hex;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigGetParameterHandler {
    private static int $10 = 0;
    private static int $11 = 1;
    static final Pattern FALSE_REGEX;
    public static final Charset FRC_BYTE_ARRAY_ENCODING;
    static final Pattern TRUE_REGEX;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ConfigCacheClient activatedConfigsCache;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final Set<BiConsumer<String, ConfigContainer>> listeners = new HashSet();
    private static final byte[] $$d = {117, -15, -81, 1, 41, 26, 15, 12, 8, -2, -12, 44, -18, 30, 25, 8, 10, 10, 16, -3, -9, 47, -1, 20, 4, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 39;
    private static final byte[] $$a = {30, 17, -35, 104, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 31;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 11 - r6
            byte[] r1 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.$$a
            int r7 = r7 * 3
            int r7 = 100 - r7
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r6 = 10 - r6
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-5)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.a(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 31
            int r7 = 53 - r7
            int r6 = r6 * 21
            int r6 = 24 - r6
            int r8 = r8 * 17
            int r8 = r8 + 67
            byte[] r0 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.d(short, short, byte, java.lang.Object[]):void");
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        FRC_BYTE_ARRAY_ENCODING = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
        TRUE_REGEX = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        FALSE_REGEX = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 23;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 4;
        }
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $11 + 47;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 19472), 2623 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 13 - TextUtils.getCapsMode("", 0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() * (TuitionPaymentFragmentbindingInflater1 | 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.getCapsMode("", 0, 0)), 481 - TextUtils.indexOf("", ""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 2623 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf((CharSequence) "", '0') + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (ViewConfiguration.getTapTimeout() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 481, TextUtils.indexOf((CharSequence) "", '0') + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 123;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - View.resolveSizeAndState(0, 0, 0)), 481 - (ViewConfiguration.getEdgeSlop() >> 16), Color.rgb(0, 0, 0) + 16777253, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            int i10 = $10 + 1;
            $11 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr2);
        int i12 = $10 + 121;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.executor = executor;
        this.activatedConfigsCache = configCacheClient;
        this.defaultConfigsCache = configCacheClient2;
    }

    public String getString(String str) {
        int i = 2 % 2;
        String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
                return stringFromCache;
            }
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            throw null;
        }
        String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
        if (stringFromCache2 == null) {
            logParameterValueDoesNotExist(str, "String");
            return "";
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return stringFromCache2;
        }
        throw null;
    }

    public boolean getBoolean(String str) {
        int i = 2 % 2;
        String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            if (TRUE_REGEX.matcher(stringFromCache).matches()) {
                int i2 = b + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
                return true;
            }
            if (FALSE_REGEX.matcher(stringFromCache).matches()) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                b = i4 % 128;
                int i5 = i4 % 2;
                callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
                return false;
            }
        }
        String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
        if (stringFromCache2 != null) {
            if (TRUE_REGEX.matcher(stringFromCache2).matches()) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                b = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(!FALSE_REGEX.matcher(stringFromCache2).matches())) {
                return false;
            }
        }
        logParameterValueDoesNotExist(str, "Boolean");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return r1.getBytes(com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r1 = getStringFromCache(r3.defaultConfigsCache, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r4 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.b + 41;
        com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if ((r4 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return r1.getBytes(com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r1.getBytes(com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        logParameterValueDoesNotExist(r4, "ByteArray");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return com.google.firebase.remoteconfig.FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        callListeners(r4, getConfigsFromCache(r3.activatedConfigsCache));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getByteArray(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.b = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r1 = r3.activatedConfigsCache
            java.lang.String r1 = getStringFromCache(r1, r4)
            r2 = 21
            int r2 = r2 / 0
            if (r1 == 0) goto L33
            goto L23
        L1b:
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r1 = r3.activatedConfigsCache
            java.lang.String r1 = getStringFromCache(r1, r4)
            if (r1 == 0) goto L33
        L23:
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r0 = r3.activatedConfigsCache
            com.google.firebase.remoteconfig.internal.ConfigContainer r0 = getConfigsFromCache(r0)
            r3.callListeners(r4, r0)
            java.nio.charset.Charset r4 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING
            byte[] r4 = r1.getBytes(r4)
            return r4
        L33:
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r1 = r3.defaultConfigsCache
            java.lang.String r1 = getStringFromCache(r1, r4)
            if (r1 == 0) goto L54
            int r4 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.b
            int r4 = r4 + 41
            int r2 = r4 % 128
            com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r4 = r4 % r0
            if (r4 != 0) goto L4d
            java.nio.charset.Charset r4 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING
            byte[] r4 = r1.getBytes(r4)
            return r4
        L4d:
            java.nio.charset.Charset r4 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING
            r1.getBytes(r4)
            r4 = 0
            throw r4
        L54:
            java.lang.String r0 = "ByteArray"
            logParameterValueDoesNotExist(r4, r0)
            byte[] r4 = com.google.firebase.remoteconfig.FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.getByteArray(java.lang.String):byte[]");
    }

    public double getDouble(String str) {
        int i = 2 % 2;
        Double doubleFromCache = getDoubleFromCache(this.activatedConfigsCache, str);
        if (doubleFromCache != null) {
            int i2 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            return doubleFromCache.doubleValue();
        }
        Double doubleFromCache2 = getDoubleFromCache(this.defaultConfigsCache, str);
        if (doubleFromCache2 != null) {
            int i4 = b + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return doubleFromCache2.doubleValue();
        }
        logParameterValueDoesNotExist(str, "Double");
        int i6 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return 0.0d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getLong(String str) {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cGreen = (char) Color.green(0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
            int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
            byte b2 = $$a[11];
            byte b3 = (byte) (b2 + 1);
            Object[] objArr3 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iIndexOf, i4, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{64883, 1651, 2920, 3149, 4417, 6704, 7980, 8277, 9477, 12006, 13226, 13540, 14815, 17058, 18356, 18582, 19855, 22190, 23152, 24416, 24669, 25922}, 64271 - (ViewConfiguration.getScrollBarSize() >> 8), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{64887, 7905, 14925, 22463, 29469, 36716, 43212, 50201, 57743, 64996, 6472, 15027, 22031, 29292, 36805}, 58271 - (KeyEvent.getMaxKeyCode() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int iIndexOf2 = 875 - TextUtils.indexOf((CharSequence) "", '0');
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 10;
            byte[] bArr = $$a;
            byte b4 = bArr[8];
            byte b5 = bArr[11];
            Object[] objArr6 = new Object[1];
            a(b4, b5, (byte) (b5 | 9), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, iIndexOf2, maxKeyCode, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 11;
                byte b6 = (byte) ($$b & 3);
                byte b7 = (byte) (b6 - 2);
                Object[] objArr7 = new Object[1];
                a(b6, b7, (byte) (b7 | 8), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i5, iLastIndexOf, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~(1039137471 | iIdentityHashCode);
            int i7 = (-203209588) + ((810074242 | i6) * (-476)) + (i6 * 952) + ((~((~iIdentityHashCode) | 1039137471)) * 476) + 1747960418;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            try {
                Object[] objArr9 = {Integer.valueOf(str != null ? str.length() : 0), 1747960418};
                byte[] bArr2 = $$d;
                byte b8 = bArr2[3];
                Object[] objArr10 = new Object[1];
                d(b8, b8, bArr2[28], objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[0]);
                byte b9 = bArr2[28];
                Object[] objArr11 = new Object[1];
                d(b9, b9, bArr2[3], objArr11);
                objArr = (Object[]) cls2.getMethod((String) objArr11[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int iRed = 876 - Color.red(0);
                    int mode2 = View.MeasureSpec.getMode(0) + 10;
                    byte b10 = (byte) ($$b & 3);
                    byte b11 = (byte) (b10 - 2);
                    Object[] objArr12 = new Object[1];
                    a(b10, b11, (byte) (b11 | 8), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode, iRed, mode2, 1324201839, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr13 = new Object[1];
                    c(new char[]{64883, 1651, 2920, 3149, 4417, 6704, 7980, 8277, 9477, 12006, 13226, 13540, 14815, 17058, 18356, 18582, 19855, 22190, 23152, 24416, 24669, 25922}, 64272 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    c(new char[]{64887, 7905, 14925, 22463, 29469, 36716, 43212, 50201, 57743, 64996, 6472, 15027, 22031, 29292, 36805}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 58271, objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                        byte[] bArr3 = $$a;
                        byte b12 = bArr3[8];
                        byte b13 = bArr3[11];
                        Object[] objArr15 = new Object[1];
                        a(b12, b13, (byte) (b13 | 9), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, longPressTimeout, threadPriority, 254769921, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                        int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
                        byte b14 = $$a[11];
                        byte b15 = (byte) (b14 + 1);
                        Object[] objArr16 = new Object[1];
                        a(b14, b15, (byte) (-b15), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, i10, packedPositionType, -1199417970, false, (String) objArr16[0], null);
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
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i14 = ~iIdentityHashCode2;
            int i15 = i13 + 1556643396 + (((~((-804372997) | i14)) | 575717888) * 184) + ((iIdentityHashCode2 | (-1073338334)) * (-184)) + ((~((-844683226) | i14)) * 184);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr2[1])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
                b = i18 % 128;
                int i19 = i18 % 2;
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
            int[] iArr = new int[i12];
            int i20 = i12 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyPid = Process.myPid();
            int i22 = ~((-872917942) | (~iMyPid));
            int i23 = i21 + (((-900186102) | i22 | (~(872917941 | iMyPid))) * (-338)) + 720085768 + (((~(iMyPid | (-27268161))) | i22) * 338);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[1])[0] = i25 ^ (i25 << 5);
            int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
            b = i26 % 128;
            int i27 = i26 % 2;
        }
        Long longFromCache = getLongFromCache(this.activatedConfigsCache, str);
        if (longFromCache != null) {
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            return longFromCache.longValue();
        }
        Long longFromCache2 = getLongFromCache(this.defaultConfigsCache, str);
        if (longFromCache2 != null) {
            return longFromCache2.longValue();
        }
        logParameterValueDoesNotExist(str, "Long");
        int i28 = ((int[]) objArr2[1])[0];
        int i29 = i28 * i28;
        int i30 = -(141918043 * i28);
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        int i32 = -(i28 * (-108744931));
        int i33 = ((i31 ^ i32) + ((i32 & i31) << 1)) - 290204144;
        int i34 = i33 >> 20;
        int i35 = (((i34 & (-8191)) + (i34 | (-8191))) / 4096) + 1;
        int i36 = (i34 - 8191) / 4096;
        int i37 = -((((i33 | i35) << 1) - (i33 ^ i35)) ^ ((i36 & 1) + (i36 | 1)));
        int i38 = (i37 ^ 4) + ((i37 & 4) << 1);
        int i39 = ((i38 >> 24) - 511) / 256;
        int i40 = (i39 ^ 1) + ((i39 & 1) << 1);
        return ((long) (73264 / (((-(((i40 | 1) << 1) - (i40 ^ 1))) & i38) * 19))) - 964;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl(r1, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r1 = getStringFromCache(r4.defaultConfigsCache, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r5 = new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl(r1, 1);
        r1 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        logParameterValueDoesNotExist(r5, "FirebaseRemoteConfigValue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        return new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl("", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        callListeners(r5, getConfigsFromCache(r4.activatedConfigsCache));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.firebase.remoteconfig.FirebaseRemoteConfigValue getValue(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.b
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1b
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r1 = r4.activatedConfigsCache
            java.lang.String r1 = getStringFromCache(r1, r5)
            r3 = 65
            int r3 = r3 / r2
            if (r1 == 0) goto L32
            goto L23
        L1b:
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r1 = r4.activatedConfigsCache
            java.lang.String r1 = getStringFromCache(r1, r5)
            if (r1 == 0) goto L32
        L23:
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r2 = r4.activatedConfigsCache
            com.google.firebase.remoteconfig.internal.ConfigContainer r2 = getConfigsFromCache(r2)
            r4.callListeners(r5, r2)
            com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl r5 = new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl
            r5.<init>(r1, r0)
            return r5
        L32:
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r1 = r4.defaultConfigsCache
            java.lang.String r1 = getStringFromCache(r1, r5)
            if (r1 == 0) goto L4a
            com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl r5 = new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl
            r2 = 1
            r5.<init>(r1, r2)
            int r1 = com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.b = r2
            int r1 = r1 % r0
            return r5
        L4a:
            java.lang.String r0 = "FirebaseRemoteConfigValue"
            logParameterValueDoesNotExist(r5, r0)
            com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl r5 = new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl
            java.lang.String r0 = ""
            r5.<init>(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.getValue(java.lang.String):com.google.firebase.remoteconfig.FirebaseRemoteConfigValue");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public Set<String> getKeysByPrefix(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
            if (str == null) {
                str = "";
            }
        } else if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        ConfigContainer configsFromCache = getConfigsFromCache(this.activatedConfigsCache);
        if (configsFromCache != null) {
            int i4 = b + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            treeSet.addAll(getKeysByPrefix(str, configsFromCache));
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        ConfigContainer configsFromCache2 = getConfigsFromCache(this.defaultConfigsCache);
        if (configsFromCache2 != null) {
            treeSet.addAll(getKeysByPrefix(str, configsFromCache2));
        }
        return treeSet;
    }

    private static TreeSet<String> getKeysByPrefix(String str, ConfigContainer configContainer) {
        int i = 2 % 2;
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator<String> itKeys = configContainer.getConfigs().keys();
        int i2 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        while (!(!itKeys.hasNext())) {
            int i4 = b + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                itKeys.next().startsWith(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String next = itKeys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        int i = 2 % 2;
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(getKeySetFromCache(this.activatedConfigsCache));
        hashSet.addAll(getKeySetFromCache(this.defaultConfigsCache));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            int i2 = b + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            map.put(str, getValue(str));
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public void addListener(BiConsumer<String, ConfigContainer> biConsumer) {
        synchronized (this.listeners) {
            this.listeners.add(biConsumer);
        }
    }

    private void callListeners(final String str, final ConfigContainer configContainer) {
        if (configContainer == null) {
            return;
        }
        synchronized (this.listeners) {
            for (final BiConsumer<String, ConfigContainer> biConsumer : this.listeners) {
                this.executor.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConfigGetParameterHandler.lambda$callListeners$0(biConsumer, str, configContainer);
                    }
                });
            }
        }
    }

    static /* synthetic */ void lambda$callListeners$0(BiConsumer biConsumer, String str, ConfigContainer configContainer) {
        int i = 2 % 2;
        int i2 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        biConsumer.accept(str, configContainer);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    private static String getStringFromCache(ConfigCacheClient configCacheClient, String str) {
        int i = 2 % 2;
        ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
        if (configsFromCache == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        try {
            String string = configsFromCache.getConfigs().getString(str);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            b = i3 % 128;
            int i4 = i3 % 2;
            return string;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Double getDoubleFromCache(ConfigCacheClient configCacheClient, String str) {
        int i = 2 % 2;
        int i2 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
        if (configsFromCache != null) {
            try {
                Double dValueOf = Double.valueOf(configsFromCache.getConfigs().getDouble(str));
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    return dValueOf;
                }
                throw null;
            } catch (JSONException unused) {
                return null;
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private static Long getLongFromCache(ConfigCacheClient configCacheClient, String str) {
        int i = 2 % 2;
        ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
        if (configsFromCache == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            b = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        try {
            Long lValueOf = Long.valueOf(configsFromCache.getConfigs().getLong(str));
            int i4 = b + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                return lValueOf;
            }
            throw null;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Set<String> getKeySetFromCache(ConfigCacheClient configCacheClient) {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
        if (configsFromCache != null) {
            Iterator<String> itKeys = configsFromCache.getConfigs().keys();
            while (itKeys.hasNext()) {
                int i2 = b + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                hashSet.add(itKeys.next());
            }
        }
        int i4 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return hashSet;
    }

    private static ConfigContainer getConfigsFromCache(ConfigCacheClient configCacheClient) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        ConfigContainer blocking = configCacheClient.getBlocking();
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return blocking;
    }

    private static void logParameterValueDoesNotExist(String str, String str2) {
        int i = 2 % 2;
        int i2 = b + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        new Object[]{str2, str};
        int i5 = i3 + 125;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = -4125244424452156407L;
    }
}
