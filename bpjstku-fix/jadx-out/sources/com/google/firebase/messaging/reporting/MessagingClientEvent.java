package com.google.firebase.messaging.reporting;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.firebase.encoders.proto.ProtoEnum;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class MessagingClientEvent {
    private static final MessagingClientEvent DEFAULT_INSTANCE;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static int g;
    private final String analytics_label_;
    private final long bulk_id_;
    private final long campaign_id_;
    private final String collapse_key_;
    private final String composer_label_;
    private final Event event_;
    private final String instance_id_;
    private final String message_id_;
    private final MessageType message_type_;
    private final String package_name_;
    private final int priority_;
    private final long project_number_;
    private final SDKPlatform sdk_platform_;
    private final String topic_;
    private final int ttl_;
    private static final byte[] $$c = {83, -90, 68, -23};
    private static final int $$d = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {27, 65, -33, 120, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 214;
    private static int d = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.google.firebase.messaging.reporting.MessagingClientEvent.$$a
            int r1 = 53 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.reporting.MessagingClientEvent.a(short, short, byte, java.lang.Object[]):void");
    }

    static {
        g = 1;
        TuitionPaymentFragmentbindingInflater1();
        DEFAULT_INSTANCE = new Builder().build();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        g = i % 128;
        if (i % 2 == 0) {
            int i2 = 19 / 0;
        }
    }

    MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.project_number_ = j;
        this.message_id_ = str;
        this.instance_id_ = str2;
        this.message_type_ = messageType;
        this.sdk_platform_ = sDKPlatform;
        this.package_name_ = str3;
        this.collapse_key_ = str4;
        this.priority_ = i;
        this.ttl_ = i2;
        this.topic_ = str5;
        this.bulk_id_ = j2;
        this.event_ = event;
        this.analytics_label_ = str6;
        this.campaign_id_ = j3;
        this.composer_label_ = str7;
    }

    public static Builder newBuilder() {
        int i = 2 % 2;
        Builder builder = new Builder();
        int i2 = d + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return builder;
    }

    public final long getProjectNumber() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.project_number_;
        int i4 = i2 + 85;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return j;
    }

    public final String getMessageId() {
        String str;
        int i = 2 % 2;
        int i2 = d + 107;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            str = this.message_id_;
            int i4 = 41 / 0;
        } else {
            str = this.message_id_;
        }
        int i5 = i3 + 7;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return str;
    }

    public final String getInstanceId() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.instance_id_;
        int i5 = i2 + 43;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final MessageType getMessageType() {
        int i = 2 % 2;
        int i2 = d + 33;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.message_type_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SDKPlatform getSdkPlatform() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 73;
        d = i3 % 128;
        int i4 = i3 % 2;
        SDKPlatform sDKPlatform = this.sdk_platform_;
        int i5 = i2 + 73;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return sDKPlatform;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i4 = $11 + 105;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $11 + 5;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47772);
                        int keyRepeatDelay = 468 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iArgb = 13 - Color.argb(i3, i3, i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, keyRepeatDelay, iArgb, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - TextUtils.lastIndexOf("", '0', 0)), 467 - TextUtils.indexOf((CharSequence) "", '0'), 13 - Gravity.getAbsoluteGravity(0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 2323 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 44 - View.resolveSize(0, 0), -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public static final class Builder {
        private long project_number_ = 0;
        private String message_id_ = "";
        private String instance_id_ = "";
        private MessageType message_type_ = MessageType.UNKNOWN;
        private SDKPlatform sdk_platform_ = SDKPlatform.UNKNOWN_OS;
        private String package_name_ = "";
        private String collapse_key_ = "";
        private int priority_ = 0;
        private int ttl_ = 0;
        private String topic_ = "";
        private long bulk_id_ = 0;
        private Event event_ = Event.UNKNOWN_EVENT;
        private String analytics_label_ = "";
        private long campaign_id_ = 0;
        private String composer_label_ = "";

        Builder() {
        }

        public final MessagingClientEvent build() {
            return new MessagingClientEvent(this.project_number_, this.message_id_, this.instance_id_, this.message_type_, this.sdk_platform_, this.package_name_, this.collapse_key_, this.priority_, this.ttl_, this.topic_, this.bulk_id_, this.event_, this.analytics_label_, this.campaign_id_, this.composer_label_);
        }

        public final Builder setProjectNumber(long j) {
            this.project_number_ = j;
            return this;
        }

        public final Builder setMessageId(String str) {
            this.message_id_ = str;
            return this;
        }

        public final Builder setInstanceId(String str) {
            this.instance_id_ = str;
            return this;
        }

        public final Builder setMessageType(MessageType messageType) {
            this.message_type_ = messageType;
            return this;
        }

        public final Builder setSdkPlatform(SDKPlatform sDKPlatform) {
            this.sdk_platform_ = sDKPlatform;
            return this;
        }

        public final Builder setPackageName(String str) {
            this.package_name_ = str;
            return this;
        }

        public final Builder setCollapseKey(String str) {
            this.collapse_key_ = str;
            return this;
        }

        public final Builder setPriority(int i) {
            this.priority_ = i;
            return this;
        }

        public final Builder setTtl(int i) {
            this.ttl_ = i;
            return this;
        }

        public final Builder setTopic(String str) {
            this.topic_ = str;
            return this;
        }

        public final Builder setBulkId(long j) {
            this.bulk_id_ = j;
            return this;
        }

        public final Builder setEvent(Event event) {
            this.event_ = event;
            return this;
        }

        public final Builder setAnalyticsLabel(String str) {
            this.analytics_label_ = str;
            return this;
        }

        public final Builder setCampaignId(long j) {
            this.campaign_id_ = j;
            return this;
        }

        public final Builder setComposerLabel(String str) {
            this.composer_label_ = str;
            return this;
        }
    }

    public final String getPackageName() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int iArgb = Color.argb(0, 0, 0, 0) + 651;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, iArgb, scrollBarFadeDuration, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{51756, 34219, 46632, 46786, 43491, 8536, 10730, 55518, 49314, 33946, 4682, 37627, 41592, 46693, 53017, 30688, 13066, 8249, 14666, 4920, 4032, 36960, 10423, 32845}, 21 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{48198, 31282, 3825, 63540, 134, 46852, 53030, 37205, 64657, 54419, 38522, 23206, 49010, 6779, 24745, 20026, 18478, 19233}, 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int i2 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 650;
            int defaultSize = 44 - View.getDefaultSize(0, 0);
            Object[] objArr5 = new Object[1];
            a((byte) 51, $$a[80], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode2, i2, defaultSize, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int iRed = 651 - Color.red(0);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 44;
                byte b4 = $$a[7];
                Object[] objArr6 = new Object[1];
                a((byte) 51, b4, (byte) (b4 | 15), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, iRed, tapTimeout, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            int iMyPid = Process.myPid();
            int i5 = ~iMyPid;
            int i6 = (((1269399330 + (((-13411945) | i5) * (-369))) + (((~((-119623940) | i5)) | (-116193130)) * (-369))) + ((((~(iMyPid | 119623939)) | (-133035884)) | (~(i5 | (-102781186)))) * 369)) - 2068824017;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.indexOf("", "") + 1610, (ViewConfiguration.getJumpTapTimeout() >> 16) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -2068824017, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char defaultSize2 = (char) View.getDefaultSize(0, 0);
                    int defaultSize3 = 651 - View.getDefaultSize(0, 0);
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 44;
                    Object[] objArr9 = new Object[1];
                    a((byte) 51, $$a[80], (byte) 52, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize2, defaultSize3, tapTimeout2, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 695 - TextUtils.indexOf("", "", 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - TextUtils.indexOf("", "", 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 792, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int maximumFlingVelocity = 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int scrollDefaultDelay = 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b5 = $$a[7];
                    Object[] objArr11 = new Object[1];
                    a((byte) 51, b5, (byte) (b5 | 15), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, maximumFlingVelocity, scrollDefaultDelay, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{51756, 34219, 46632, 46786, 43491, 8536, 10730, 55518, 49314, 33946, 4682, 37627, 41592, 46693, 53017, 30688, 13066, 8249, 14666, 4920, 4032, 36960, 10423, 32845}, KeyEvent.getDeadChar(0, 0) + 22, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{48198, 31282, 3825, 63540, 134, 46852, 53030, 37205, 64657, 54419, 38522, 23206, 49010, 6779, 24745, 20026, 18478, 19233}, 15 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 651;
                        int iArgb2 = Color.argb(0, 0, 0, 0) + 44;
                        Object[] objArr14 = new Object[1];
                        a((byte) 51, $$a[80], (byte) 52, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarFadeDuration2, tapTimeout3, iArgb2, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 652;
                        int defaultSize4 = 44 - View.getDefaultSize(0, 0);
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[5];
                        byte b7 = bArr2[7];
                        Object[] objArr15 = new Object[1];
                        a(b6, b7, b7, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, iLastIndexOf, defaultSize4, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr == null) {
                throw null;
            }
            int i9 = d;
            int i10 = i9 + 105;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 7;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i14 = asBinder + 125;
        d = i14 % 128;
        int i15 = i14 % 2;
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i16 = ((int[]) objArr[3])[0];
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i19 = ~(968802234 | iIdentityHashCode);
        int i20 = i16 + 1535263501 + ((965346576 | i19) * (-476)) + (i19 * 952) + ((~((~iIdentityHashCode) | 968802234)) * 476);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr16[3])[0] = i22 ^ (i22 << 5);
        String str2 = this.package_name_;
        int i23 = d + 17;
        asBinder = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = 55 / 0;
        }
        return str2;
    }

    public final String getCollapseKey() {
        int i = 2 % 2;
        int i2 = d + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.collapse_key_;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public final int getPriority() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.priority_;
        int i5 = i3 + 47;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int getTtl() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = this.ttl_;
        int i6 = i3 + 61;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 49 / 0;
        }
        return i5;
    }

    public final String getTopic() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 41;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.topic_;
        int i5 = i2 + 81;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long getBulkId() {
        int i = 2 % 2;
        int i2 = d + 119;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.bulk_id_;
        }
        throw null;
    }

    public final Event getEvent() {
        int i = 2 % 2;
        int i2 = d + 119;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.event_;
        }
        throw null;
    }

    public final String getAnalyticsLabel() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.analytics_label_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getCampaignId() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 93;
        d = i3 % 128;
        int i4 = i3 % 2;
        long j = this.campaign_id_;
        int i5 = i2 + 77;
        d = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int getNumber() {
            return this.number_;
        }
    }

    public final String getComposerLabel() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.composer_label_;
        int i5 = i3 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static MessagingClientEvent getDefaultInstance() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 61;
        d = i3 % 128;
        int i4 = i3 % 2;
        MessagingClientEvent messagingClientEvent = DEFAULT_INSTANCE;
        int i5 = i2 + 3;
        d = i5 % 128;
        int i6 = i5 % 2;
        return messagingClientEvent;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = (char) 13383;
        TuitionPaymentFragmentbindingInflater1 = (char) 43189;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 17993;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 47043;
    }

    private static String $$e(byte b2, int i, byte b3) {
        int i2 = (b2 * 4) + 108;
        byte[] bArr = $$c;
        int i3 = 3 - (b3 * 3);
        int i4 = i * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + i2;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            i3++;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i3];
        }
    }

    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int getNumber() {
            return this.number_;
        }
    }

    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int getNumber() {
            return this.number_;
        }
    }
}
