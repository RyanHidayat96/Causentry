package com.appsflyer.internal;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.appsflyer.AFLogger;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ConcurrentModificationException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1jSDK {
    final Intent getCurrencyIso4217Code;

    public AFj1jSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getCurrencyIso4217Code = intent;
    }

    public final <T extends Parcelable> T H_(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Function0 function0 = new Function0<T>() { // from class: com.appsflyer.internal.AFj1jSDK.1
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1jSDK.this.getCurrencyIso4217Code.getParcelableExtra(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        };
        StringBuilder sb = new StringBuilder("Error while trying to read ");
        sb.append(str);
        sb.append(" extra from intent");
        return (T) getMonetizationNetwork(function0, sb.toString(), null, true);
    }

    public final String getRevenue(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Function0<String> function0 = new Function0<String>() { // from class: com.appsflyer.internal.AFj1jSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1jSDK.this.getCurrencyIso4217Code.getStringExtra(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        };
        StringBuilder sb = new StringBuilder("Error while trying to read ");
        sb.append(str);
        sb.append(" extra from intent");
        return (String) getMonetizationNetwork(function0, sb.toString(), null, true);
    }

    public final boolean getMonetizationNetwork(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Function0<Boolean> function0 = new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1jSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1jSDK.this.getCurrencyIso4217Code.hasExtra(str));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        };
        StringBuilder sb = new StringBuilder("Error while trying to check presence of ");
        sb.append(str);
        sb.append(" extra from intent");
        Boolean bool = (Boolean) getMonetizationNetwork(function0, sb.toString(), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1jSDK$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "K_", "()Landroid/content/Intent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends Lambda implements Function0<Intent> {
        private /* synthetic */ String $getMonetizationNetwork;
        private /* synthetic */ long $getRevenue;
        private static final byte[] $$c = {31, -3, -46, 11};
        private static final int $$f = 15;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {53, -70, 9, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$e = 140;
        private static final byte[] $$a = {2, -84, 82, -15, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
        private static final int $$b = 178;
        private static int $TuitionPaymentFragmentbindingInflater1 = 0;
        private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static long b = 119051236476446692L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 6
                int r6 = 103 - r6
                int r8 = r8 * 19
                int r8 = 33 - r8
                byte[] r0 = com.appsflyer.internal.AFj1jSDK.AnonymousClass3.$$a
                int r7 = r7 * 32
                int r7 = 35 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2f
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r7 = r7 + 1
                r4 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2f:
                int r7 = -r7
                int r6 = r6 + r7
                int r6 = r6 + (-2)
                r7 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1jSDK.AnonymousClass3.a(short, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 52
                int r7 = 56 - r7
                int r6 = 103 - r6
                int r8 = r8 * 52
                int r0 = 53 - r8
                byte[] r1 = com.appsflyer.internal.AFj1jSDK.AnonymousClass3.$$d
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r7
                r7 = r8
                r4 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L25:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r7 + (-11)
                int r7 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1jSDK.AnonymousClass3.c(int, int, byte, java.lang.Object[]):void");
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Intent invoke() {
            int i = 2 % 2;
            int i2 = $TuitionPaymentFragmentbindingInflater1 + 49;
            $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                return K_();
            }
            K_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Intent K_() {
            int i = 2 % 2;
            int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
            $TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Intent intentPutExtra = AFj1jSDK.this.getCurrencyIso4217Code.putExtra(this.$getMonetizationNetwork, this.$getRevenue);
            int i4 = $TuitionPaymentFragmentbindingInflater1 + 49;
            $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                return intentPutExtra;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
                int i4 = $11 + 71;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1234, 35 - (KeyEvent.getMaxKeyCode() >> 16), -653973969, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - Process.getGidForName("")), 2765 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') - '\"', 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 253, 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2891, TextUtils.indexOf((CharSequence) "", '0') + 18, 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
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
            int i6 = $10 + 57;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str, long j) {
            super(0);
            this.$getMonetizationNetwork = str;
            this.$getRevenue = j;
        }

        /* JADX WARN: Code duplicated, block: B:110:0x093a  */
        /* JADX WARN: Code duplicated, block: B:123:0x0601 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:129:0x0723 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x054d  */
        /* JADX WARN: Code duplicated, block: B:59:0x059a  */
        /* JADX WARN: Code duplicated, block: B:60:0x05a6  */
        /* JADX WARN: Code duplicated, block: B:65:0x0614  */
        /* JADX WARN: Code duplicated, block: B:68:0x065b  */
        /* JADX WARN: Code duplicated, block: B:72:0x06ba A[Catch: all -> 0x0958, TryCatch #0 {all -> 0x0958, blocks: (B:70:0x06a3, B:72:0x06ba, B:73:0x0700, B:90:0x0793, B:92:0x07a0, B:93:0x07de, B:95:0x07fd, B:96:0x084d), top: B:118:0x06a3 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x071d A[EDGE_INSN: B:76:0x071d->B:86:0x0748 BREAK  A[LOOP:0: B:16:0x012a->B:79:0x0723]] */
        /* JADX WARN: Code duplicated, block: B:77:0x0721  */
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) throws Throwable {
            Method[] methodArr;
            Class<?> cls;
            String str;
            Class<?>[] clsArr;
            char c;
            int i;
            boolean z;
            int i2;
            int i3;
            String string;
            char c2;
            int i4;
            char[] cArr;
            int threadPriority;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i5;
            int i6;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i7;
            int iIndexOf;
            int i8;
            int i9;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i10;
            int i11 = 2;
            int i12 = 2 % 2;
            int i13 = $TuitionPaymentFragmentbindingInflater1;
            int i14 = 1;
            int i15 = ((i13 | 9) << 1) - (i13 ^ 9);
            $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
            int i16 = 0;
            if (i15 % 2 == 0) {
                methodArr = new Method[5];
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b2, bArr[28], objArr2);
                cls = Class.forName((String) objArr2[0]);
                byte b3 = bArr[28];
                Object[] objArr3 = new Object[1];
                a(b3, b3, bArr[7], objArr3);
                str = (String) objArr3[0];
                clsArr = new Class[3];
                c = 1;
            } else {
                methodArr = new Method[2];
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr4 = new Object[1];
                a(b4, b4, bArr2[28], objArr4);
                cls = Class.forName((String) objArr4[0]);
                byte b5 = bArr2[28];
                Object[] objArr5 = new Object[1];
                a(b5, b5, bArr2[7], objArr5);
                str = (String) objArr5[0];
                clsArr = new Class[2];
                c = 0;
            }
            clsArr[0] = String.class;
            clsArr[1] = Integer.TYPE;
            methodArr[c] = cls.getMethod(str, clsArr);
            Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
            byte[] bArr3 = $$a;
            byte b6 = bArr3[28];
            Object[] objArr6 = new Object[1];
            a(b6, b6, bArr3[7], objArr6);
            String str2 = (String) objArr6[0];
            Class<?>[] clsArr2 = new Class[2];
            int i17 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i18 = (i17 & 75) + (i17 | 75);
            $TuitionPaymentFragmentbindingInflater1 = i18 % 128;
            if (i18 % 2 != 0) {
                clsArr2[0] = String.class;
                clsArr2[1] = Integer.TYPE;
                methodArr[1] = cls2.getMethod(str2, clsArr2);
            } else {
                clsArr2[0] = String.class;
                clsArr2[1] = Integer.TYPE;
                methodArr[1] = cls2.getMethod(str2, clsArr2);
            }
            int i19 = -2001519171;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 2823;
                int i20 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                byte[] bArr4 = $$d;
                Object[] objArr7 = new Object[1];
                c(bArr4[10], bArr4[5], bArr4[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, deadChar, i20, 1814927978, false, (String) objArr7[0], null);
            }
            Class<?>[] clsArr3 = null;
            char c3 = '0';
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) != null) {
                i = i19;
                break;
            }
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0, 0), 2822 - TextUtils.lastIndexOf("", '0'), View.MeasureSpec.getSize(0) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length) {
                    i = i19;
                    break;
                }
                int i22 = $TuitionPaymentFragmentbindingInflater1;
                int i23 = (i22 ^ 125) + ((i22 & 125) << i14);
                int i24 = i23 % 128;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24;
                int i25 = i23 % i11;
                Method method = declaredMethods[i21];
                int i26 = i24 + 111;
                $TuitionPaymentFragmentbindingInflater1 = i26 % 128;
                int i27 = i26 % i11;
                try {
                    Object[] objArr8 = new Object[i14];
                    d(new char[]{25301, 49594, 6411, 42712}, new char[]{60893, 35323, 40309, 12468}, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{63518, 34968, 58913, 48151, 25622, 53068, 35469, 2537, 11927, 65209, 62671, 22537, 39937, 29299, 4481, 27085, 48287, 56300, 12943, 8938, 55557, 4303, 34894, 48400}, objArr8);
                    Class<?> cls3 = Class.forName((String) objArr8[i16]);
                    int iLastIndexOf = TextUtils.lastIndexOf("", c3, i16, i16);
                    Object[] objArr9 = new Object[i14];
                    d(new char[]{25301, 49594, 6411, 42712}, new char[]{18138, 8648, 64306, 35466}, (char) (((iLastIndexOf | 1) << i14) - (iLastIndexOf ^ i14)), KeyEvent.normalizeMetaState(i16), new char[]{1892, 56903, 62370, 15728, 4411, 51735, 45140, 4206, 61723, 4885, 64711, 16066}, objArr9);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr9[i16], clsArr3).invoke(method, clsArr3)).intValue();
                    int i28 = $TuitionPaymentFragmentbindingInflater1 + 23;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i28 % 128;
                    int i29 = i28 % 2;
                    Object[] objArr10 = new Object[i14];
                    objArr10[i16] = Integer.valueOf(iIntValue);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i30 = packedPositionGroup * (-51);
                    int i31 = (i30 & 3266125) + (i30 | 3266125);
                    int i32 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i33 = i32 | packedPositionGroup;
                    int i34 = (i31 - (~((~((i33 ^ 61625) | (i33 & 61625))) * 52))) - 1;
                    int i35 = ~(((-61626) ^ i32) | ((-61626) & i32));
                    int i36 = ~(((-61626) ^ packedPositionGroup) | ((-61626) & packedPositionGroup));
                    int i37 = (i35 ^ i36) | (i35 & i36);
                    int i38 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i39 = i34 + ((i37 | (~((i38 & packedPositionGroup) | (i38 ^ packedPositionGroup)))) * (-52));
                    int i40 = ~packedPositionGroup;
                    Object[] objArr11 = new Object[i14];
                    d(new char[]{25301, 49594, 6411, 42712}, new char[]{46225, 44890, 47585, 40432}, (char) ((i39 - (~(((~(i40 | 61625)) | (~((i40 ^ i32) | (i40 & i32)))) * 52))) - 1), Color.blue(i16), new char[]{35326, 1124, 53826, 14584, 6523, 41846, 57124, 5197, 20954, 62672, 701, 3917, 54085, 58921, 58567, 42096, 63062, 47680, 45094, 38907, 39000, 59589, 7489, 1604, 20801, 56647}, objArr11);
                    Class<?> cls4 = Class.forName((String) objArr11[i16]);
                    Object[] objArr12 = new Object[i14];
                    d(new char[]{25301, 49594, 6411, 42712}, new char[]{65119, 52882, 9507, 44766}, (char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", "", i16), new char[]{3015, 1868, 45609, 58224, 16150, 47273, 31169, 43915}, objArr12);
                    String str3 = (String) objArr12[i16];
                    Class<?>[] clsArr4 = new Class[i14];
                    clsArr4[i16] = Integer.TYPE;
                    if (((Boolean) cls4.getMethod(str3, clsArr4).invoke(null, objArr10)).booleanValue()) {
                        Class cls5 = Long.TYPE;
                        char[] cArr2 = {25301, 49594, 6411, 42712};
                        char[] cArr3 = {60893, 35323, 40309, 12468};
                        int i41 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i42 = i41 * 71;
                        int i43 = ((i42 | 69) << i14) - (i42 ^ 69);
                        int i44 = ~i41;
                        int i45 = i43 + ((~((~i44) | i44)) * (-140));
                        int i46 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i47 = ((i46 | 9) << 1) - (i46 ^ 9);
                        $TuitionPaymentFragmentbindingInflater1 = i47 % 128;
                        int i48 = i47 % 2;
                        int i49 = (i45 - (~(70 * (~(((i41 ^ (-1)) | i41) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4))))) - i14;
                        int i50 = ~((i44 ^ (-1)) | i44);
                        int i51 = ~i41;
                        int i52 = (i50 & i51) | (i50 ^ i51);
                        int i53 = ~(i41 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                        int i54 = -(-(((i53 & i52) | (i52 ^ i53)) * 70));
                        Object[] objArr13 = new Object[i14];
                        d(cArr2, cArr3, (char) ((i49 & i54) + (i54 | i49)), View.combineMeasuredStates(0, 0), new char[]{63518, 34968, 58913, 48151, 25622, 53068, 35469, 2537, 11927, 65209, 62671, 22537, 39937, 29299, 4481, 27085, 48287, 56300, 12943, 8938, 55557, 4303, 34894, 48400}, objArr13);
                        Class<?> cls6 = Class.forName((String) objArr13[0]);
                        char[] cArr4 = {25301, 49594, 6411, 42712};
                        char[] cArr5 = {53768, 3802, 17226, 38764};
                        int i55 = $TuitionPaymentFragmentbindingInflater1;
                        int i56 = (i55 & 99) + (i55 | 99);
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i56 % 128;
                        if (i56 % 2 == 0) {
                            c2 = (char) (27715 << (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            int i57 = -(-TextUtils.getCapsMode("", 0, i14));
                            i4 = ((i57 | 1242487506) << i14) - (i57 ^ 1242487506);
                            cArr = new char[13];
                        } else {
                            int i58 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            c2 = (char) (((i58 | 27715) << i14) - (27715 ^ i58));
                            int capsMode = TextUtils.getCapsMode("", 0, 0);
                            i4 = (capsMode ^ 1242487506) + ((1242487506 & capsMode) << i14);
                            cArr = new char[13];
                        }
                        // fill-array-data instruction
                        cArr[0] = 51850;
                        cArr[1] = 3807;
                        cArr[2] = 16005;
                        cArr[3] = 58098;
                        cArr[4] = 51388;
                        cArr[5] = 57426;
                        cArr[6] = 48585;
                        cArr[7] = 11818;
                        cArr[8] = 3248;
                        cArr[9] = 50029;
                        cArr[10] = 38561;
                        cArr[11] = 51958;
                        cArr[12] = 46150;
                        Object[] objArr14 = new Object[i14];
                        d(cArr4, cArr5, c2, i4, cArr, objArr14);
                        if (cls5.equals(cls6.getMethod((String) objArr14[0], null).invoke(method, null))) {
                            int i59 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i60 = (i59 ^ 47) + ((i59 & 47) << i14);
                            $TuitionPaymentFragmentbindingInflater1 = i60 % 128;
                            int i61 = i60 % 2;
                            Object[] objArr15 = new Object[i14];
                            d(new char[]{25301, 49594, 6411, 42712}, new char[]{60893, 35323, 40309, 12468}, (char) Color.alpha(0), (-TextUtils.indexOf((CharSequence) "", '0')) - 1, new char[]{63518, 34968, 58913, 48151, 25622, 53068, 35469, 2537, 11927, 65209, 62671, 22537, 39937, 29299, 4481, 27085, 48287, 56300, 12943, 8938, 55557, 4303, 34894, 48400}, objArr15);
                            Class<?> cls7 = Class.forName((String) objArr15[0]);
                            char[] cArr6 = {25301, 49594, 6411, 42712};
                            char[] cArr7 = {12109, 58113, 27275, 4258};
                            int i62 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                            $TuitionPaymentFragmentbindingInflater1 = i62 % 128;
                            if (i62 % 2 != 0) {
                                threadPriority = Process.getThreadPriority(0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i5 = 8 >> ((-657) - threadPriority);
                                i6 = 77;
                            } else {
                                threadPriority = Process.getThreadPriority(0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i63 = -(-(threadPriority * (-657)));
                                i5 = ((i63 & 13180) << i14) + (13180 ^ i63);
                                i6 = 20;
                            }
                            int i64 = ~i6;
                            int i65 = ~((i64 & threadPriority) | (i64 ^ threadPriority));
                            int i66 = ~threadPriority;
                            int i67 = ~((i66 ^ i6) | (i66 & i6));
                            int i68 = (i65 ^ i67) | (i65 & i67);
                            int i69 = ~(i6 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            int i70 = i5 + ((-658) * ((i68 ^ i69) | (i69 & i68)));
                            int i71 = ~threadPriority;
                            int i72 = (i70 - (~((~((i71 & i6) | (i71 ^ i6))) * 658))) - 1;
                            int i73 = ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i6) | (i6 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) | i67) * 658;
                            int i74 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i75 = (i74 & 37) + (i74 | 37);
                            $TuitionPaymentFragmentbindingInflater1 = i75 % 128;
                            int i76 = -(((i72 ^ i73) + ((i73 & i72) << 1)) >> 6);
                            if (i75 % 2 != 0) {
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i7 = ((-830) / i76) * (-40746);
                            } else {
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i7 = (i76 * (-830)) + 34592896;
                            }
                            int i77 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i78 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i79 = ((i78 | 25) << 1) - (i78 ^ 25);
                            $TuitionPaymentFragmentbindingInflater1 = i79 % 128;
                            int i80 = i79 % 2;
                            int i81 = ~((i77 & (-41579)) | ((-41579) ^ i77));
                            int i82 = ~((i76 ^ 41578) | (i76 & 41578) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            int i83 = (-831) * ((i81 ^ i82) | (i81 & i82));
                            int i84 = (i7 ^ i83) + ((i7 & i83) << 1);
                            int i85 = (-41579) | i76;
                            int i86 = -(-((~((i85 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i85 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) * (-1662)));
                            int i87 = (i84 ^ i86) + ((i86 & i84) << 1);
                            int i88 = i78 + 53;
                            $TuitionPaymentFragmentbindingInflater1 = i88 % 128;
                            int i89 = i88 % 2;
                            int i90 = ~i76;
                            int i91 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i92 = ~((i90 & i91) | (i90 ^ i91));
                            int i93 = ~((i76 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i76 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i94 = (i93 & i92) | (i92 ^ i93);
                            int i95 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 41578) | (41578 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i96 = -(-(831 * ((i94 & i95) | (i94 ^ i95))));
                            char c4 = (char) ((i87 & i96) + (i96 | i87));
                            int i97 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            Object[] objArr16 = new Object[1];
                            d(cArr6, cArr7, c4, (i97 & (-1948057297)) + (i97 | (-1948057297)), new char[]{11686, 49631, 20002, 17506, 31151, 28346, 10578, 15043, 22910, 545, 2178, 63268, 57816, 63415, 42398, 11653, 38760}, objArr16);
                            Object[] objArr17 = (Object[]) cls7.getMethod((String) objArr16[0], null).invoke(method, null);
                            if (objArr17.length == 2) {
                                int i98 = $TuitionPaymentFragmentbindingInflater1;
                                int i99 = (i98 & 111) + (i98 | 111);
                                $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i99 % 128;
                                int i100 = i99 % 2;
                                Class cls8 = Long.TYPE;
                                if (i100 == 0) {
                                    if (cls8.equals(objArr17[1])) {
                                        char[] cArr8 = {25301, 49594, 6411, 42712};
                                        char[] cArr9 = {60893, 35323, 40309, 12468};
                                        iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                                        int i101 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                                        $TuitionPaymentFragmentbindingInflater1 = i101 % 128;
                                        int i102 = i101 % 2;
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i103 = (iIndexOf * 165) - 163;
                                        int i104 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                        int i105 = ~((i104 & 1) | (i104 ^ 1));
                                        int i106 = ((i105 & iIndexOf) | (iIndexOf ^ i105)) * (-328);
                                        int i107 = (i103 ^ i106) + ((i103 & i106) << 1);
                                        int i108 = ((iIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault5)) * 164;
                                        int i109 = (i107 ^ i108) + ((i108 & i107) << 1);
                                        i8 = $TuitionPaymentFragmentbindingInflater1 + 7;
                                        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            int i110 = ~iIndexOf;
                                            i9 = ~((i110 & (-2)) | (i110 ^ (-2)));
                                            int i111 = 14 / 0;
                                        } else {
                                            int i112 = ~iIndexOf;
                                            i9 = ~((i112 & (-2)) | (i112 ^ (-2)));
                                        }
                                        int i113 = ~(((-2) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-2) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                        int i114 = (i9 & i113) | (i9 ^ i113);
                                        int i115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                        int i116 = (i115 & iIndexOf) | (i115 ^ iIndexOf);
                                        int i117 = ~((i116 & 1) | (i116 ^ 1));
                                        int i118 = -(-(164 * ((i117 & i114) | (i114 ^ i117))));
                                        objArr = new Object[1];
                                        d(cArr8, cArr9, (char) (((i109 | i118) << 1) - (i118 ^ i109)), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{63518, 34968, 58913, 48151, 25622, 53068, 35469, 2537, 11927, 65209, 62671, 22537, 39937, 29299, 4481, 27085, 48287, 56300, 12943, 8938, 55557, 4303, 34894, 48400}, objArr);
                                        if (!(!Class.forName((String) objArr[0]).equals(objArr17[1]))) {
                                            int i119 = $TuitionPaymentFragmentbindingInflater1 + 39;
                                            $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i119 % 128;
                                            int i120 = i119 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                                int iMyPid = 2823 - (Process.myPid() >> 22);
                                                int offsetBefore = 22 - TextUtils.getOffsetBefore("", 0);
                                                byte[] bArr5 = $$d;
                                                Object[] objArr18 = new Object[1];
                                                c(bArr5[10], bArr5[5], bArr5[7], objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, iMyPid, offsetBefore, 1814927978, false, (String) objArr18[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                                int maximumDrawingCacheSize = 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int i121 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                byte[] bArr6 = $$d;
                                                Object[] objArr19 = new Object[1];
                                                c(bArr6[10], bArr6[5], bArr6[7], objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, maximumDrawingCacheSize, i121, 1814927978, false, (String) objArr19[0], null);
                                            }
                                            try {
                                                Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                    int threadPriority3 = 2823 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                    int mirror = AndroidCharacter.getMirror('0') - 26;
                                                    byte[] bArr7 = $$d;
                                                    byte b7 = bArr7[7];
                                                    Object[] objArr21 = new Object[1];
                                                    c(b7, b7, bArr7[5], objArr21);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority2, threadPriority3, mirror, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr20)).longValue();
                                                int i122 = $TuitionPaymentFragmentbindingInflater1;
                                                i10 = ((i122 | 35) << 1) - (i122 ^ 35);
                                                $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                                                if (i10 % 2 != 0) {
                                                    throw null;
                                                }
                                                i = -2001519171;
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if (cls8.equals(objArr17[0])) {
                                    char[] cArr10 = {25301, 49594, 6411, 42712};
                                    char[] cArr11 = {60893, 35323, 40309, 12468};
                                    iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                                    int i1010 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                                    $TuitionPaymentFragmentbindingInflater1 = i1010 % 128;
                                    int i1011 = i1010 % 2;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1012 = (iIndexOf * 165) - 163;
                                    int i1013 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i1014 = ~((i1013 & 1) | (i1013 ^ 1));
                                    int i1015 = ((i1014 & iIndexOf) | (iIndexOf ^ i1014)) * (-328);
                                    int i1016 = (i1012 ^ i1015) + ((i1012 & i1015) << 1);
                                    int i1017 = ((iIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault6)) * 164;
                                    int i1018 = (i1016 ^ i1017) + ((i1017 & i1016) << 1);
                                    i8 = $TuitionPaymentFragmentbindingInflater1 + 7;
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        int i1110 = ~iIndexOf;
                                        i9 = ~((i1110 & (-2)) | (i1110 ^ (-2)));
                                        int i1111 = 14 / 0;
                                    } else {
                                        int i1112 = ~iIndexOf;
                                        i9 = ~((i1112 & (-2)) | (i1112 ^ (-2)));
                                    }
                                    int i1113 = ~(((-2) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-2) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                    int i1114 = (i9 & i1113) | (i9 ^ i1113);
                                    int i1115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i1116 = (i1115 & iIndexOf) | (i1115 ^ iIndexOf);
                                    int i1117 = ~((i1116 & 1) | (i1116 ^ 1));
                                    int i1118 = -(-(164 * ((i1117 & i1114) | (i1114 ^ i1117))));
                                    objArr = new Object[1];
                                    d(cArr10, cArr11, (char) (((i1018 | i1118) << 1) - (i1118 ^ i1018)), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{63518, 34968, 58913, 48151, 25622, 53068, 35469, 2537, 11927, 65209, 62671, 22537, 39937, 29299, 4481, 27085, 48287, 56300, 12943, 8938, 55557, 4303, 34894, 48400}, objArr);
                                    if (!(!Class.forName((String) objArr[0]).equals(objArr17[1]))) {
                                        int i1119 = $TuitionPaymentFragmentbindingInflater1 + 39;
                                        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1119 % 128;
                                        int i123 = i1119 % 2;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                                            int iMyPid2 = 2823 - (Process.myPid() >> 22);
                                            int offsetBefore2 = 22 - TextUtils.getOffsetBefore("", 0);
                                            byte[] bArr8 = $$d;
                                            Object[] objArr110 = new Object[1];
                                            c(bArr8[10], bArr8[5], bArr8[7], objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString2, iMyPid2, offsetBefore2, 1814927978, false, (String) objArr110[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                            int maximumDrawingCacheSize2 = 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int i124 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            byte[] bArr9 = $$d;
                                            Object[] objArr111 = new Object[1];
                                            c(bArr9[10], bArr9[5], bArr9[7], objArr111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, maximumDrawingCacheSize2, i124, 1814927978, false, (String) objArr111[0], null);
                                        }
                                        Object[] objArr22 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char threadPriority4 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                            int threadPriority5 = 2823 - ((Process.getThreadPriority(0) + 20) >> 6);
                                            int mirror2 = AndroidCharacter.getMirror('0') - 26;
                                            byte[] bArr10 = $$d;
                                            byte b8 = bArr10[7];
                                            Object[] objArr23 = new Object[1];
                                            c(b8, b8, bArr10[5], objArr23);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority4, threadPriority5, mirror2, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr22)).longValue();
                                        int i125 = $TuitionPaymentFragmentbindingInflater1;
                                        i10 = ((i125 | 35) << 1) - (i125 ^ 35);
                                        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            throw null;
                                        }
                                        i = -2001519171;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    int i126 = ((i21 | (-38)) << 1) - (i21 ^ (-38));
                    i21 = (i126 & 39) + (i126 | 39);
                    i11 = 2;
                    i19 = -2001519171;
                    i14 = 1;
                    clsArr3 = null;
                    i16 = 0;
                    c3 = '0';
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char c5 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int i127 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                int absoluteGravity = 22 - Gravity.getAbsoluteGravity(0, 0);
                byte[] bArr11 = $$d;
                Object[] objArr24 = new Object[1];
                c(bArr11[10], bArr11[5], bArr11[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c5, i127, absoluteGravity, 1814927978, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                int iRed = Color.red(0) + 2823;
                int iLastIndexOf2 = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr12 = $$d;
                Object[] objArr26 = new Object[1];
                c((byte) (bArr12[19] - 1), bArr12[7], bArr12[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf3, iRed, iLastIndexOf2, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr25);
            Object[] objArr27 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cIndexOf4 = (char) (37656 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int i128 = 2721 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 19;
                byte[] bArr13 = $$d;
                Object[] objArr28 = new Object[1];
                c((byte) (bArr13[19] - 1), bArr13[7], bArr13[5], objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf4, i128, iNormalizeMetaState, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr27)).longValue();
            long j = -895249162;
            long j2 = -344;
            long j3 = (j2 * j) + (j2 * jLongValue);
            long j4 = 345;
            long j5 = -1;
            long j6 = j ^ j5;
            long j7 = jLongValue ^ j5;
            long j8 = j6 | j7;
            Method[] methodArr2 = methodArr;
            long jMyPid = Process.myPid();
            long j9 = j3 + (((j8 ^ j5) | ((j6 | jMyPid) ^ j5)) * j4) + ((((j7 | j) ^ j5) | ((j6 | (jMyPid ^ j5)) ^ j5)) * j4) + (j4 * ((j8 | jMyPid) ^ j5)) + ((long) (-915156683));
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i129 = 421059966 + ((1427259794 | startUptimeMillis) * 614);
            int i130 = ~startUptimeMillis;
            int i131 = ((int) (j9 >> 32)) & (i129 + (((~((-1095518989) | i130)) | 1090535680 | (~(341707422 | i130))) * (-1228)) + (((~(i130 | 1432243102)) | (~((-4983309) | i130))) * 614));
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i132 = ((int) j9) & (659697589 + (((~((-17608856) | startUptimeMillis2)) | 1454835265) * (-964)) + (((~((~startUptimeMillis2) | (-17608856))) | 262145) * (-964)));
            int i133 = (i131 & i132) | (i131 ^ i132);
            int i134 = i133 >>> 24;
            int i135 = i133 & ViewCompat.MEASURED_SIZE_MASK;
            if (i134 != 0) {
                int i136 = $TuitionPaymentFragmentbindingInflater1 + 121;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i136 % 128;
                int i137 = i136 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i138 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i139 = (i138 & 29) + (i138 | 29);
                $TuitionPaymentFragmentbindingInflater1 = i139 % 128;
                i2 = 2;
                int i140 = i139 % 2;
                i3 = 1;
            } else {
                i2 = 2;
                i3 = 0;
            }
            if (z) {
                int i141 = $TuitionPaymentFragmentbindingInflater1;
                int i142 = i141 + 55;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i142 % 128;
                int i143 = i142 % i2;
                if (i135 < methodArr2.length) {
                    int i144 = i141 + 85;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i144 % 128;
                    int i145 = i144 % i2;
                    Method method2 = methodArr2[i135];
                    if (method2 != null) {
                        string = method2.toString();
                    } else {
                        string = null;
                    }
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
            list.add(string);
            int i146 = (((i134 | 6) << 1) - (i134 ^ 6)) * i3;
            int i147 = $TuitionPaymentFragmentbindingInflater1;
            int i148 = (i147 ^ 57) + ((i147 & 57) << 1);
            $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i148 % 128;
            int i149 = i148 % 2;
            return i146;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r7, byte r8, int r9) {
            /*
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r8 = r8 + 1
                byte[] r0 = com.appsflyer.internal.AFj1jSDK.AnonymousClass3.$$c
                int r9 = 104 - r9
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r8
                r5 = r2
                goto L27
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                int r7 = r7 + 1
                if (r5 != r8) goto L22
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L22:
                r3 = r0[r7]
                r6 = r3
                r3 = r9
                r9 = r6
            L27:
                int r9 = -r9
                int r9 = r9 + r3
                r3 = r5
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1jSDK.AnonymousClass3.$$g(byte, byte, int):java.lang.String");
        }
    }

    public final Intent I_(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(str, j);
        StringBuilder sb = new StringBuilder("Error while trying to write ");
        sb.append(str);
        sb.append(" extra to intent");
        return (Intent) getMonetizationNetwork(anonymousClass3, sb.toString(), null, true);
    }

    private final <T> T getMonetizationNetwork(Function0<? extends T> function0, String str, T t, boolean z) {
        Object objM8024constructorimpl;
        Object objM8024constructorimpl2;
        Object monetizationNetwork;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFj1jSDK aFj1jSDK = this;
                objM8024constructorimpl = Result.m8024constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
            }
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(ConcurrentModificationException.class), Reflection.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable thM8027exceptionOrNullimpl = Result.m8027exceptionOrNullimpl(objM8024constructorimpl);
            if (thM8027exceptionOrNullimpl != null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    if (ArraysKt.contains(kClassArr, Reflection.getOrCreateKotlinClass(thM8027exceptionOrNullimpl.getClass()))) {
                        if (z) {
                            monetizationNetwork = getMonetizationNetwork(function0, str, t, false);
                        } else {
                            AFLogger.afErrorLog(str, thM8027exceptionOrNullimpl, false, false);
                            monetizationNetwork = t;
                        }
                        objM8024constructorimpl2 = Result.m8024constructorimpl(monetizationNetwork);
                        objM8024constructorimpl = objM8024constructorimpl2;
                    } else {
                        throw thM8027exceptionOrNullimpl;
                    }
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM8024constructorimpl2 = Result.m8024constructorimpl(ResultKt.createFailure(th2));
                }
            }
            Throwable thM8027exceptionOrNullimpl2 = Result.m8027exceptionOrNullimpl(objM8024constructorimpl);
            if (thM8027exceptionOrNullimpl2 == null) {
                t = (T) objM8024constructorimpl;
            } else {
                AFLogger.afErrorLog(str, thM8027exceptionOrNullimpl2, false, false);
            }
        }
        return t;
    }
}
