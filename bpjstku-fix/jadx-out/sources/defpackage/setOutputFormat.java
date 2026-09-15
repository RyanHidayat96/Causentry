package defpackage;

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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.gson.JsonParseException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n"}, d2 = {"LsetOutputFormat;", "LisReversedVertical;", "", "Lcom/datadog/android/api/context/NetworkInfo;", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/api/context/NetworkInfo;", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class setOutputFormat implements isReversedVertical<String, NetworkInfo> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setOutputFormat(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.isReversedVertical
    public NetworkInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            NetworkInfo.Companion companion = NetworkInfo.INSTANCE;
            return NetworkInfo.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
        } catch (JsonParseException e2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.net.info.NetworkInfoDeserializer$deserialize$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Error while trying to deserialize the NetworkInfo: %s", Arrays.copyOf(new Object[]{p0}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: setOutputFormat$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LsetOutputFormat$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {41, 2, 45, -60};
        private static final int $$d = 121;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {99, -43, -44, -62, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 118;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
        private static int b = -981105359;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 6608;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 52
                int r6 = 53 - r6
                int r8 = r8 * 3
                int r8 = 4 - r8
                int r7 = r7 * 14
                int r7 = r7 + 84
                byte[] r0 = defpackage.setOutputFormat.Companion.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r6
                r3 = r8
                r4 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r8]
            L29:
                int r8 = r8 + 1
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.setOutputFormat.Companion.c(short, short, short, java.lang.Object[]):void");
        }

        private Companion() {
        }

        private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
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
            int i5 = $10 + 59;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 2;
            }
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i7 = $10 + 9;
                $11 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) (8329 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int packedPositionType = 1235 - ExpandableListView.getPackedPositionType(0L);
                        int iKeyCodeFromString = 35 - KeyEvent.keyCodeFromString("");
                        byte b2 = $$c[1];
                        byte b3 = (byte) (b2 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, packedPositionType, iKeyCodeFromString, -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2764, Color.green(0) + 14, 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.blue(0) + 43325), 253 - TextUtils.getTrimmedLength(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 65200);
                                    int iAlpha = Color.alpha(0) + 2891;
                                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 17;
                                    byte b6 = (byte) ($$d & 7);
                                    byte b7 = (byte) (b6 - 1);
                                    String str$$e = $$e(b6, b7, b7);
                                    i2 = 2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, iAlpha, iResolveOpacity, 2012627446, false, str$$e, new Class[]{Integer.TYPE, Integer.TYPE});
                                } else {
                                    i2 = 2;
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = sessionProcessor.b;
                                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                i3 = i2;
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
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:115:0x0b13  */
        /* JADX WARN: Code duplicated, block: B:117:0x0b24  */
        /* JADX WARN: Code duplicated, block: B:118:0x0b27  */
        /* JADX WARN: Code duplicated, block: B:119:0x0b29  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r10v33 */
        /* JADX WARN: Type inference failed for: r10v38 */
        /* JADX WARN: Type inference failed for: r10v56 */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v1 */
        /* JADX WARN: Type inference failed for: r16v10, types: [char[]] */
        /* JADX WARN: Type inference failed for: r16v12 */
        /* JADX WARN: Type inference failed for: r16v13, types: [java.lang.CharSequence] */
        public static Object[] TuitionPaymentFragmentbindingInflater1(Class cls, int i, int i2, int i3) throws Throwable {
            ?? r16;
            String string;
            ?? r10;
            int i4;
            int i5;
            int i6;
            Object obj;
            Object[] objArr;
            String[] strArr;
            int i7;
            int i8 = 2 % 2;
            int i9 = TuitionPaymentFragmentbindingInflater1;
            int i10 = (i9 & 101) + (i9 | 101);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            if (i10 % 2 == 0 ? (i2 & 2) == 0 : (i2 & 2) == 0) {
                r10 = "";
            } else {
                String[][] strArr2 = new String[1][];
                try {
                    char[] cArr = {0, 0, 0, 0};
                    char[] cArr2 = {65220, 23909, 40132, 51776};
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iB = ModuleInstallRequest.b();
                    int i12 = (i11 * 50) + 97;
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
                    int i14 = i13 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i14;
                    int i15 = i13 % 2;
                    int i16 = ~iB;
                    int i17 = ~i16;
                    int i18 = ~i11;
                    int i19 = 98 * ((i17 ^ i18) | (i17 & i18));
                    int i20 = (i12 ^ i19) + ((i12 & i19) << 1);
                    int i21 = ~i11;
                    int i22 = i20 + (((~((i11 & iB) | (i11 ^ iB))) | (~((i21 ^ i16) | (i16 & i21)))) * (-49));
                    int i23 = (i14 & 19) + (i14 | 19);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = i22 + (49 * (~iB));
                    Object[] objArr2 = new Object[1];
                    a(cArr, cArr2, packedPositionGroup, i25, new char[]{8301, 18778, 46004, 15165, 28460, 9104, 7662, 25887}, objArr2);
                    Field declaredField = Class.class.getDeclaredField((String) objArr2[0]);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(cls);
                    Class<?> cls2 = obj2.getClass();
                    char[] cArr3 = {0, 0, 0, 0};
                    char[] cArr4 = {2491, 21694, 51407, 35687};
                    int iRgb = Color.rgb(0, 0, 0);
                    int i26 = ~iRgb;
                    int i27 = (((iRgb * (-209)) - (-788529152)) - (~(-(-((~((i26 ^ (-16777217)) | (i26 & (-16777217)))) * 210))))) - 1;
                    int i28 = TuitionPaymentFragmentbindingInflater1;
                    int i29 = (i28 ^ 85) + ((i28 & 85) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i29 % 128;
                    int i30 = i29 % 2;
                    int i31 = ~i;
                    int i32 = ~(((-16777217) ^ i31) | ((-16777217) & i31));
                    int i33 = ~((i26 ^ i) | (i26 & i));
                    int i34 = (i27 - (~(((i32 ^ i33) | (i33 & i32)) * 210))) - 1;
                    int i35 = ~i;
                    int i36 = (i26 & i35) | (i26 ^ i35);
                    int i37 = ~((i36 ^ 16777216) | (i36 & 16777216));
                    int i38 = ((-16777217) ^ iRgb) | (iRgb & (-16777217));
                    int i39 = ~((i38 & i) | (i38 ^ i));
                    int i40 = ((i39 & i37) | (i37 ^ i39)) * 210;
                    char c = (char) ((i34 & i40) + (i34 | i40));
                    int i41 = ((i28 | 75) << 1) - (i28 ^ 75);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i41 % 128;
                    int i42 = i41 % 2;
                    int i43 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i44 = (i43 * (-129)) - (-408764059);
                    int i45 = i35 | 816529910;
                    int i46 = -(-((~((i45 & i43) | (i45 ^ i43))) * 130));
                    int i47 = ((i44 | i46) << 1) - (i46 ^ i44);
                    int i48 = (816529910 & i43) | (816529910 ^ i43);
                    int i49 = (i47 - (~(-(-((~i48) * (-260)))))) - 1;
                    int i50 = ~i43;
                    int i51 = ~((i50 & (-816529911)) | (i50 ^ (-816529911)));
                    int i52 = ~((i48 & i) | (i48 ^ i));
                    int i53 = ((i52 & i51) | (i51 ^ i52)) * 130;
                    Object[] objArr3 = new Object[1];
                    r16 = cArr3;
                    a(r16, cArr4, c, (i49 & i53) + (i53 | i49), new char[]{49370, 32335, 11316, 20858, 38236, 6149, 48722}, objArr3);
                    Field declaredField2 = cls2.getDeclaredField((String) objArr3[0]);
                    declaredField2.setAccessible(true);
                    int i54 = TuitionPaymentFragmentbindingInflater1;
                    int i55 = (i54 ^ 113) + ((i54 & 113) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i55 % 128;
                    int i56 = i55 % 2;
                    try {
                        Object[] objArr4 = {Long.valueOf(((Number) declaredField2.get(obj2)).longValue() & 281474976710655L), strArr2};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486768121);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cAxisFromString = (char) (41240 - MotionEvent.axisFromString(""));
                            int iResolveSizeAndState = 1705 - View.resolveSizeAndState(0, 0, 0);
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 22;
                            byte[] bArr = $$a;
                            byte b2 = (byte) (-bArr[5]);
                            Object[] objArr5 = new Object[1];
                            c(b2, b2, bArr[7], objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, iResolveSizeAndState, packedPositionChild, -107095506, false, (String) objArr5[0], new Class[]{Long.TYPE, String[][].class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).longValue();
                        long j = -1524724986;
                        long j2 = -919;
                        long j3 = (j2 * j) + (j2 * jLongValue);
                        long j4 = 920;
                        r16 = "";
                        long j5 = -1;
                        long j6 = j ^ j5;
                        long j7 = jLongValue ^ j5;
                        long j8 = j6 | j7;
                        long jMyTid = Process.myTid();
                        long j9 = jMyTid ^ j5;
                        long j10 = j3 + ((((j8 | jMyTid) ^ j5) | (((j7 | j9) | j) ^ j5)) * j4) + (((j8 ^ j5) | ((j6 | j9) ^ j5)) * j4) + (j4 * (((jMyTid | (j7 | j)) ^ j5) | ((j8 | j9) ^ j5) | (((j6 | jLongValue) | jMyTid) ^ j5))) + ((long) (-581292075));
                        int i57 = (int) (j10 >> 32);
                        try {
                            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                            int i58 = (~((-1710286783) | startElapsedRealtime)) | 1706059180;
                            int i59 = ~startElapsedRealtime;
                            int i60 = i57 & ((-580048986) + ((i58 | (~((-268832770) | i59))) * 886) + (((~(i59 | 1710286782)) | (-273060372)) * (-1772)) + ((~(i59 | (-273060372))) * 886));
                            int i61 = (int) j10;
                            int iMyTid = Process.myTid();
                            int i62 = (~((-725977226) | iMyTid)) | 721420424;
                            int i63 = ~iMyTid;
                            int i64 = i61 & (1800998975 + ((i62 | (~(2136320461 | i63))) * 886) + (((~(i63 | 725977225)) | 2131763660) * (-1772)) + ((~(i63 | 2131763660)) * 886));
                            int i65 = (i60 & i64) | (i60 ^ i64);
                            if (i65 != 0) {
                                int i66 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i67 = (i66 & 121) + (i66 | 121);
                                TuitionPaymentFragmentbindingInflater1 = i67 % 128;
                                int i68 = i67 % 2;
                                int i69 = (i65 & i31) | ((~i65) & i);
                                String[] strArr3 = strArr2[0];
                                String[] strArr4 = {cls.getName(), strArr3[0], strArr3[1], strArr3[2]};
                                Object[] objArr6 = new Object[4];
                                objArr6[0] = new int[1];
                                objArr6[1] = new int[]{i69};
                                objArr6[2] = new int[]{i};
                                int iMyTid2 = Process.myTid();
                                int i70 = ~iMyTid2;
                                int i71 = (-1101214134) + (((~((-617401527) | i70)) | 12634148 | (~((-1087629933) | i70)) | (~(1692397310 | iMyTid2))) * (-84));
                                int i72 = (~(iMyTid2 | (-1087629933))) | 617401526;
                                int i73 = ~(i70 | 1087629932);
                                int i74 = i71 + ((i72 | i73) * (-84)) + (((-1692397311) | i73) * 84);
                                int i75 = (i74 & 16) + (i74 | 16) + i3;
                                int i76 = i75 ^ (i75 << 13);
                                int i77 = i76 >>> 17;
                                int i78 = ((~i76) & i77) | ((~i77) & i76);
                                int i79 = i78 << 5;
                                ((int[]) objArr6[0])[0] = ((~i78) & i79) | ((~i79) & i78);
                                objArr6[3] = strArr4;
                                return objArr6;
                            }
                            r10 = r16;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                StringWriter stringWriter = new StringWriter();
                                try {
                                    Object[] objArr7 = {new PrintWriter(stringWriter)};
                                    char[] cArr5 = {0, 0, 0, 0};
                                    char[] cArr6 = {15505, 23334, 12482, 58235};
                                    int i80 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int iB2 = ModuleInstallRequest.b();
                                    int i81 = (i80 * TypedValues.Custom.TYPE_DIMENSION) - 28477911;
                                    int i82 = ~i80;
                                    int i83 = TuitionPaymentFragmentbindingInflater1 + 23;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i83 % 128;
                                    int i84 = i83 % 2;
                                    int i85 = ~((i82 & iB2) | (i82 ^ iB2));
                                    int i86 = ~iB2;
                                    int i87 = (-1808) * (i85 | (~((i86 ^ 31537) | (i86 & 31537))));
                                    int i88 = (i81 & i87) + (i81 | i87);
                                    int i89 = ~i80;
                                    int i90 = (i89 ^ (-31538)) | (i89 & (-31538));
                                    int i91 = ~((i90 & iB2) | (i90 ^ iB2));
                                    int i92 = (i80 & i86) | (i86 ^ i80);
                                    int i93 = ~((i92 ^ 31537) | (i92 & 31537));
                                    int i94 = ((i93 & i91) | (i91 ^ i93)) * TypedValues.Custom.TYPE_BOOLEAN;
                                    char c2 = (char) (((((i88 | i94) << 1) - (i88 ^ i94)) - (~(((~i92) | ((~((iB2 & (-31538)) | ((-31538) ^ iB2))) | (~(i89 | 31537)))) * TypedValues.Custom.TYPE_BOOLEAN))) - 1);
                                    int i95 = -AndroidCharacter.getMirror('0');
                                    Object[] objArr8 = new Object[1];
                                    a(cArr5, cArr6, c2, ((i95 & (-1034213780)) << 1) + (i95 ^ (-1034213780)), new char[]{20487, 19750, 10913, 15559, 4698, 46599, 30288, 54658, 35531, 17158, 59806, 14811, 49788, 32692, 58536, 50102, 65061, 29661, 38122}, objArr8);
                                    Class<?> cls3 = Class.forName((String) objArr8[0]);
                                    char[] cArr7 = {0, 0, 0, 0};
                                    char[] cArr8 = {57348, 45106, 62740, 4902};
                                    int i96 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i98 = (i97 & 85) + (i97 | 85);
                                    TuitionPaymentFragmentbindingInflater1 = i98 % 128;
                                    int i99 = i98 % 2;
                                    int i100 = -i96;
                                    int i101 = i100 * (-432);
                                    int i102 = (i101 & 4328716) + (i101 | 4328716);
                                    int i103 = ~i100;
                                    int i104 = ~i;
                                    int i105 = (~((i103 & i104) | (i103 ^ i104) | 9974)) * 433;
                                    int i106 = (i102 ^ i105) + ((i105 & i102) << 1);
                                    int i107 = ~i100;
                                    int i108 = ~((-9975) | i);
                                    char c3 = (char) (i106 + (((i108 & i107) | (i107 ^ i108)) * (-433)) + (((~((i100 & 9974) | (i100 ^ 9974))) | (~((i107 & i) | (i107 ^ i)))) * 433));
                                    int iIndexOf = TextUtils.indexOf((CharSequence) r16, '0', 0, 0);
                                    int iB3 = ModuleInstallRequest.b();
                                    int i109 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i110 = (i109 & 57) + (i109 | 57);
                                    TuitionPaymentFragmentbindingInflater1 = i110 % 128;
                                    int i111 = i110 % 2;
                                    int i112 = ~iIndexOf;
                                    int i113 = ~iB3;
                                    int i114 = ~((i113 & i112) | (i112 ^ i113));
                                    int i115 = ~iB3;
                                    int i116 = ~(((-347091682) ^ i115) | ((-347091682) & i115));
                                    int i117 = (((868 * iIndexOf) - (-627868388)) - (~(-(-(((i114 ^ i116) | (i116 & i114)) * (-867)))))) - 1;
                                    int i118 = ~((i112 ^ (-347091682)) | (i112 & (-347091682)));
                                    int i119 = ~iIndexOf;
                                    int i120 = ~((i119 ^ iB3) | (i119 & iB3));
                                    int i121 = (i118 ^ i120) | (i118 & i120);
                                    int i122 = ~(((-347091682) ^ iB3) | ((-347091682) & iB3));
                                    int i123 = i117 + (((i121 ^ i122) | (i121 & i122)) * (-1734));
                                    int i124 = ~((i119 ^ (-347091682)) | (i119 & (-347091682)) | i115);
                                    int i125 = (i119 & 347091681) | (i119 ^ 347091681);
                                    int i126 = ~((i125 & iB3) | (i125 ^ iB3));
                                    int i127 = (i124 & i126) | (i124 ^ i126);
                                    int i128 = i109 + 71;
                                    TuitionPaymentFragmentbindingInflater1 = i128 % 128;
                                    int i129 = i128 % 2;
                                    int i130 = (-347091682) | iIndexOf;
                                    int i131 = ~((i130 & iB3) | (i130 ^ iB3));
                                    int i132 = i123 + (867 * ((i127 & i131) | (i127 ^ i131)));
                                    Object[] objArr9 = new Object[1];
                                    a(cArr7, cArr8, c3, i132, new char[]{42929, 27474, 25420, 30132, 36556, 13407, 32271, 61432, 55038, 42172, 39998, 38538, 51114, 5836, 13500}, objArr9);
                                    cls3.getMethod((String) objArr9[0], PrintWriter.class).invoke(th, objArr7);
                                    string = stringWriter.toString();
                                    int i133 = (~(i & 31)) & (i | 31);
                                    String[] strArr5 = {cls.getName(), string};
                                    int[] iArr = {i133};
                                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                    int i134 = ~startUptimeMillis;
                                    int i135 = (-1131764346) + ((388238011 | i134) * (-757)) + ((~((-1213768773) | startUptimeMillis)) * 1514) + (((~(startUptimeMillis | 1602006783)) | (~(i134 | (-1316793448))) | 103024675) * 757);
                                    int i136 = (i135 & 16) + (16 | i135);
                                    int i137 = ((i3 | i136) << 1) - (i136 ^ i3);
                                    int i138 = i137 << 13;
                                    int i139 = (i138 | i137) & (~(i137 & i138));
                                    int i140 = i139 >>> 17;
                                    int i141 = ((~i139) & i140) | ((~i140) & i139);
                                    int i142 = i141 << 5;
                                    ((int[]) objArr[0])[0] = ((~i141) & i142) | ((~i142) & i141);
                                    Object[] objArr10 = {new int[1], iArr, new int[]{i}, strArr5};
                                    return objArr10;
                                } catch (Throwable th2) {
                                    Throwable cause = th2.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            } catch (Throwable unused) {
                                int i143 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                int iB4 = ModuleInstallRequest.b();
                                int i144 = (i143 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) - (-7362914);
                                int i145 = (i143 ^ 14638) | (i143 & 14638);
                                int i146 = i145 * (-502);
                                int i147 = ((i144 | i146) << 1) - (i144 ^ i146);
                                int i148 = ~i143;
                                int i149 = ~((i148 ^ (-14639)) | (i148 & (-14639)));
                                int i150 = ~i143;
                                int i151 = ~iB4;
                                int i152 = ~((i150 & i151) | (i150 ^ i151));
                                int i153 = (i152 & i149) | (i149 ^ i152);
                                int i154 = ~((iB4 & i145) | (i145 ^ iB4));
                                int i155 = i147 + (((i153 & i154) | (i153 ^ i154)) * (-502));
                                int i156 = ~((i148 ^ i151) | (i148 & i151) | 14638);
                                int i157 = ((i156 & i154) | (i156 ^ i154)) * TypedValues.PositionType.TYPE_DRAWPATH;
                                int i158 = -(-Color.alpha(0));
                                Object[] objArr11 = new Object[1];
                                a(new char[]{0, 0, 0, 0}, new char[]{38705, 29014, 11989, 59193}, (char) ((i155 ^ i157) + ((i157 & i155) << 1)), (i158 | (-713992553)) + (i158 & (-713992553)), new char[]{47032}, objArr11);
                                string = (String) objArr11[0];
                            }
                        }
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r16 = "";
                }
            }
            int[] iArr2 = {-1844476378, 1276062274, -797088743, 965014536, -30564408, 800164665, 427080095, -63109426, -2128711273, 443823261, -421827424, -1596256068, -554832609, -49350782, -437871410, 1291703475, -587285223, 1359539528, -706062319, 1866472215};
            String[][] strArr6 = new String[1][];
            int i159 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
            TuitionPaymentFragmentbindingInflater1 = i159 % 128;
            if (i159 % 2 == 0) {
                System.currentTimeMillis();
                throw null;
            }
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i160 = (iCurrentTimeMillis | 343337308) & (~(iCurrentTimeMillis & 343337308));
            int i161 = i ^ i160;
            int i162 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i163 = ((i162 | 7) << 1) - (i162 ^ 7);
            TuitionPaymentFragmentbindingInflater1 = i163 % 128;
            int i164 = i163 % 2;
            try {
                Object[] objArr12 = {Integer.valueOf(i161), iArr2, Integer.valueOf(i2), strArr6};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cMyTid = (char) (43042 - (Process.myTid() >> 22));
                    int i165 = 3111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iArgb = Color.argb(0, 0, 0, 0) + 22;
                    byte[] bArr2 = $$a;
                    byte b3 = (byte) (-bArr2[5]);
                    Object[] objArr13 = new Object[1];
                    c(b3, b3, bArr2[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, i165, iArgb, 974412207, false, (String) objArr13[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
                }
                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr12)).longValue();
                long j11 = -1103257126;
                long j12 = -112;
                ?? r17 = r10;
                long j13 = -1;
                long j14 = jLongValue2 ^ j13;
                long j15 = i;
                long j16 = j14 | (j15 ^ j13);
                long j17 = j11 ^ j13;
                long j18 = (j12 * j11) + (j12 * jLongValue2) + (((long) 226) * (j11 | (j16 ^ j13))) + (((long) (-113)) * (((j17 | jLongValue2) ^ j13) | ((j17 | j15) ^ j13) | ((j16 | j11) ^ j13))) + (((long) 113) * ((j14 | j15) ^ j13)) + ((long) 1206991191);
                int i166 = ~(Process.myUid() | 1277500815);
                int i167 = ((int) (j18 >> 32)) & (((1168123284 | i166) * (-658)) + 1878557426 + ((i166 | 25174032) * 658));
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i168 = (~((-660140703) | iMaxMemory)) | 39367318;
                int i169 = ~iMaxMemory;
                int i170 = ((int) j18) & (700817973 + ((i168 | (~((-1476593729) | i169))) * 886) + (((~(i169 | 660140702)) | (-2097367113)) * (-1772)) + ((~(i169 | (-2097367113))) * 886));
                int i171 = (i167 & i170) | (i167 ^ i170);
                int i172 = ((~i171) & i160) | ((~i160) & i171);
                if (i172 != i) {
                    int i173 = TuitionPaymentFragmentbindingInflater1 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i173 % 128;
                    if (i173 % 2 != 0) {
                        strArr = strArr6[1];
                        objArr = new Object[4];
                    } else {
                        objArr = new Object[4];
                        strArr = strArr6[0];
                    }
                    int iB5 = ModuleInstallRequest.b();
                    int i174 = ~iB5;
                    int i175 = ~((1268565222 & i174) | (1268565222 ^ i174));
                    int i176 = (i175 & (-2143148007)) | ((-2143148007) ^ i175);
                    int i177 = ~iB5;
                    int i178 = ~((2108233668 ^ i177) | (2108233668 & i177));
                    int i179 = -(-(((i176 & i178) | (i176 ^ i178)) * (-1136)));
                    int i180 = (((-1548188236) | i179) << 1) - (i179 ^ (-1548188236));
                    int i181 = ~((1268565222 & iB5) | (1268565222 ^ iB5));
                    int i182 = ~((2108233668 & iB5) | (2108233668 ^ iB5));
                    int i183 = (i174 ^ (-1268565223)) | (i174 & (-1268565223));
                    int i184 = -(-(((i181 & i182) | (i181 ^ i182) | (~((i183 & (-2108233669)) | (i183 ^ (-2108233669))))) * (-568)));
                    int i185 = (i180 & i184) + (i184 | i180);
                    int i186 = ~((i177 ^ (-1268565223)) | (i177 & (-1268565223)));
                    int i187 = ~(i174 | (-2108233669));
                    int i188 = ((~((iB5 & 2143148006) | (2143148006 ^ iB5))) | (i187 & i186) | (i186 ^ i187)) * 568;
                    int i189 = ((i185 | i188) << 1) - (i188 ^ i185);
                    int iB6 = ModuleInstallRequest.b();
                    int i190 = ~iB6;
                    int i191 = ~((i190 ^ 1911435300) | (i190 & 1911435300));
                    int i192 = -(-(((i191 & (-1899592047)) | ((-1899592047) ^ i191)) * (-1042)));
                    int i193 = ((-1258513782) ^ i192) + ((i192 & (-1258513782)) << 1);
                    int i194 = -(-((1911435300 | iB6) * 521));
                    int i195 = ((i193 | i194) << 1) - (i194 ^ i193);
                    int i196 = ~((iB6 & 1899592046) | (1899592046 ^ iB6));
                    int i197 = (i196 & 12976128) | (12976128 ^ i196);
                    int i198 = (i190 & (-1899592047)) | (i190 ^ (-1899592047));
                    int i199 = ~((i198 & 1911435300) | (i198 ^ 1911435300));
                    if (i189 <= i195 + (((i197 & i199) | (i197 ^ i199)) * 521)) {
                        objArr[1] = new int[1];
                        objArr[0] = new int[1];
                        objArr[2] = new int[0];
                    } else {
                        objArr[0] = new int[1];
                        objArr[1] = new int[1];
                        objArr[2] = new int[1];
                    }
                    int i200 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i201 = (i200 ^ 113) + ((i200 & 113) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i201 % 128;
                    int i202 = i201 % 2;
                    ((int[]) objArr[2])[0] = i;
                    Object obj3 = objArr[1];
                    ((int[]) obj3)[0] = i172;
                    int i203 = (i200 ^ 49) + ((i200 & 49) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i203 % 128;
                    int i204 = i203 % 2;
                    int i205 = ~i;
                    int i206 = 1122035740 + (((~((-1614611759) | i205)) | 90419700) * (-90)) + (((~((-1614611759) | i)) | (-1702868479)) * (-45)) + (((~(i205 | 90419700)) | (~(i | (-90419701))) | (-1614611759)) * 45);
                    int i207 = (i206 ^ 16) + ((i206 & 16) << 1);
                    int i208 = ((i200 | 9) << 1) - (i200 ^ 9);
                    TuitionPaymentFragmentbindingInflater1 = i208 % 128;
                    if (i208 % 2 == 0) {
                        int i209 = i3 / i207;
                        int i210 = (i209 ^ (-48)) + ((i209 & (-48)) << 1);
                        int i211 = (i209 | i210) & (~(i209 & i210));
                        int i212 = ((i211 | (-73)) << 1) - (i211 ^ (-73));
                        int i213 = ((~i211) & i212) | ((~i212) & i211);
                        int i214 = (i213 & (-5)) + (i213 | (-5));
                        i7 = ((~i213) & i214) | ((~i214) & i213);
                    } else {
                        int i215 = i207 + i3;
                        int i216 = i215 ^ (i215 << 13);
                        int i217 = i216 >>> 17;
                        int i218 = ((~i216) & i217) | ((~i217) & i216);
                        int i219 = i218 << 5;
                        i7 = ((~i218) & i219) | ((~i219) & i218);
                        obj3 = objArr[0];
                    }
                    int i220 = (i200 ^ 107) + ((i200 & 107) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i220 % 128;
                    if (i220 % 2 == 0) {
                        ((int[]) obj3)[0] = i7;
                        objArr[3] = strArr;
                    } else {
                        ((int[]) obj3)[0] = i7;
                        objArr[3] = strArr;
                    }
                    return objArr;
                }
                try {
                    char[] cArr9 = {0, 0, 0, 0};
                    char[] cArr10 = {17825, 51504, 57325, 22280};
                    int i221 = -Color.green(0);
                    char c4 = (char) ((i221 & 2271) + (i221 | 2271));
                    int i222 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i223 = ~i222;
                    int i224 = ~((i223 ^ (-2)) | (i223 & (-2)) | i);
                    int i225 = ~i;
                    int i226 = (i225 & i222) | (i225 ^ i222);
                    int i227 = (i222 * (-317)) + 319 + ((i224 | (~((i226 & 1) | (i226 ^ 1)))) * (-318));
                    int i228 = ~((-2) | i222);
                    int i229 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i230 = (i229 ^ 117) + ((i229 & 117) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i230 % 128;
                    if (i230 % 2 == 0) {
                        int i231 = ~(i222 | i);
                        int i232 = i227 << ((-318) << ((i231 & i228) | (i228 ^ i231)));
                        int i233 = ~((i223 ^ i) | (i223 & i));
                        int i234 = -((i233 & (-2)) | ((-2) ^ i233));
                        int i235 = i232 + (i234 ^ TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((i234 & TypedValues.AttributesType.TYPE_PIVOT_TARGET) << 1);
                        Object[] objArr14 = new Object[1];
                        a(cArr9, cArr10, c4, i235, new char[]{39060, 55307, 50868, 1537, 44214, 36342, 41566, 18150, 30666, 60476, 50482, 15531, 49089, 15587, 43097, 18943, 20901, 16548, 5616, 61841, 19280, 51654, 17419, 39203, 43800, 5823}, objArr14);
                        obj = objArr14[0];
                    } else {
                        int i236 = ~((i222 ^ i) | (i222 & i));
                        int i237 = ((i236 & i228) | (i228 ^ i236)) * (-318);
                        int i238 = (i227 & i237) + (i227 | i237);
                        int i239 = ~i222;
                        int i240 = ~((i239 & i) | (i239 ^ i));
                        int i241 = (-2) ^ i240;
                        Object[] objArr15 = new Object[1];
                        a(cArr9, cArr10, c4, i238 + (((i240 & (-2)) | i241) * TypedValues.AttributesType.TYPE_PIVOT_TARGET), new char[]{39060, 55307, 50868, 1537, 44214, 36342, 41566, 18150, 30666, 60476, 50482, 15531, 49089, 15587, 43097, 18943, 20901, 16548, 5616, 61841, 19280, 51654, 17419, 39203, 43800, 5823}, objArr15);
                        obj = objArr15[0];
                    }
                    Class<?> cls4 = Class.forName((String) obj);
                    int offsetBefore = TextUtils.getOffsetBefore(r17, 0);
                    int iB7 = ModuleInstallRequest.b();
                    int i242 = ~iB7;
                    int i243 = ((offsetBefore * (-559)) - (-15679950)) + ((~((i242 ^ offsetBefore) | (i242 & offsetBefore))) * (-560));
                    int i244 = ((-27951) & offsetBefore) | ((-27951) ^ offsetBefore);
                    int i245 = (~((iB7 & i244) | (i244 ^ iB7))) * (-560);
                    int i246 = (i243 & i245) + (i245 | i243);
                    int i247 = ~((~offsetBefore) | 27950);
                    int i248 = ~((i242 ^ 27950) | (i242 & 27950));
                    int i249 = i247 ^ i248;
                    Object[] objArr16 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{25480, 8454, 11846, 1133}, (char) (i246 + (((i247 & i248) | i249) * 560)), (-2) - (~(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), new char[]{46694, 785, 34861, 22990, 8775, 36391, 14996, 15137, 23449, 22907, 47411, 18981, 37433, 35737, 64679, 9508, 61277, 61714}, objArr16);
                    if (cls4.getMethod((String) objArr16[0], new Class[0]).invoke(null, null) != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c5 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22877);
                            int i250 = 595 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 17;
                            byte b4 = $$a[7];
                            byte b5 = b4;
                            Object[] objArr17 = new Object[1];
                            c(b4, b5, b5, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c5, i250, iResolveSizeAndState2, -1471475267, false, (String) objArr17[0], null);
                        }
                        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null) != 0) {
                            i4 = i ^ 9;
                            int i251 = TuitionPaymentFragmentbindingInflater1;
                            int i252 = (i251 & 35) + (i251 | 35);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i252 % 128;
                            int i253 = i252 % 2;
                        }
                        if (i4 != i) {
                            int i254 = TuitionPaymentFragmentbindingInflater1;
                            i6 = (i254 ^ 45) + ((i254 & 45) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                            if (i6 % 2 != 0) {
                                i5 = 99;
                            } else {
                                i5 = 16;
                            }
                        } else {
                            i5 = 0;
                        }
                        int[] iArr3 = {i4};
                        int iMyPid = Process.myPid();
                        int i255 = ~iMyPid;
                        int i256 = (~((-1063306071) | i255)) | 639681348;
                        int i257 = ~(iMyPid | 1065350110);
                        int i258 = (((i256 | i257) * (-252)) - 304026094) + ((i257 | (~(i255 | (-423624723)))) * 252);
                        int i259 = ((i258 | i5) << 1) - (i5 ^ i258);
                        int i260 = i259 * 398;
                        int i261 = -(-(i3 * (-396)));
                        int i262 = ((i260 | i261) << 1) - (i260 ^ i261);
                        int i263 = ~i259;
                        int i264 = ~i;
                        int i265 = ~((i263 ^ i264) | (i263 & i264));
                        int i266 = ~(i263 | i3);
                        int i267 = (i265 & i266) | (i265 ^ i266);
                        int i268 = ~(i264 | i3);
                        int i269 = ((i268 & i267) | (i267 ^ i268)) * (-397);
                        int i270 = ((i262 | i269) << 1) - (i269 ^ i262);
                        int i271 = (~((i263 ^ i3) | (i263 & i3))) * (-397);
                        int i272 = (i270 ^ i271) + ((i271 & i270) << 1);
                        int i273 = ~((i263 & i3) | (i263 ^ i3));
                        int i274 = (i & i273) | (i ^ i273);
                        int i275 = ~i3;
                        int i276 = ~((i259 & i275) | (i275 ^ i259));
                        int i277 = -(-(((i276 & i274) | (i274 ^ i276)) * 397));
                        int i278 = (i272 ^ i277) + ((i277 & i272) << 1);
                        int i279 = i278 << 13;
                        int i280 = (i279 | i278) & (~(i278 & i279));
                        int i281 = i280 >>> 17;
                        int i282 = (i280 | i281) & (~(i280 & i281));
                        int i283 = i282 << 5;
                        ((int[]) objArr[0])[0] = (i282 | i283) & (~(i282 & i283));
                        Object[] objArr18 = {new int[1], iArr3, new int[]{i}, new String[0]};
                        int i284 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i285 = (i284 ^ 95) + ((i284 & 95) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i285 % 128;
                        int i286 = i285 % 2;
                        return objArr18;
                    }
                    int i287 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                    TuitionPaymentFragmentbindingInflater1 = i287 % 128;
                    if (i287 % 2 == 0) {
                        int i288 = 23 / 0;
                    }
                } catch (Exception unused2) {
                }
                i4 = i;
                if (i4 != i) {
                    int i2510 = TuitionPaymentFragmentbindingInflater1;
                    i6 = (i2510 ^ 45) + ((i2510 & 45) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                    if (i6 % 2 != 0) {
                        i5 = 99;
                    } else {
                        i5 = 16;
                    }
                } else {
                    i5 = 0;
                }
                int[] iArr4 = {i4};
                int iMyPid2 = Process.myPid();
                int i2511 = ~iMyPid2;
                int i2512 = (~((-1063306071) | i2511)) | 639681348;
                int i2513 = ~(iMyPid2 | 1065350110);
                int i2514 = (((i2512 | i2513) * (-252)) - 304026094) + ((i2513 | (~(i2511 | (-423624723)))) * 252);
                int i2515 = ((i2514 | i5) << 1) - (i5 ^ i2514);
                int i2610 = i2515 * 398;
                int i2611 = -(-(i3 * (-396)));
                int i2612 = ((i2610 | i2611) << 1) - (i2610 ^ i2611);
                int i2613 = ~i2515;
                int i2614 = ~i;
                int i2615 = ~((i2613 ^ i2614) | (i2613 & i2614));
                int i2616 = ~(i2613 | i3);
                int i2617 = (i2615 & i2616) | (i2615 ^ i2616);
                int i2618 = ~(i2614 | i3);
                int i2619 = ((i2618 & i2617) | (i2617 ^ i2618)) * (-397);
                int i2710 = ((i2612 | i2619) << 1) - (i2619 ^ i2612);
                int i2711 = (~((i2613 ^ i3) | (i2613 & i3))) * (-397);
                int i2712 = (i2710 ^ i2711) + ((i2711 & i2710) << 1);
                int i2713 = ~((i2613 & i3) | (i2613 ^ i3));
                int i2714 = (i & i2713) | (i ^ i2713);
                int i2715 = ~i3;
                int i2716 = ~((i2515 & i2715) | (i2715 ^ i2515));
                int i2717 = -(-(((i2716 & i2714) | (i2714 ^ i2716)) * 397));
                int i2718 = (i2712 ^ i2717) + ((i2717 & i2712) << 1);
                int i2719 = i2718 << 13;
                int i289 = (i2719 | i2718) & (~(i2718 & i2719));
                int i2810 = i289 >>> 17;
                int i2811 = (i289 | i2810) & (~(i289 & i2810));
                int i2812 = i2811 << 5;
                ((int[]) objArr18[0])[0] = (i2811 | i2812) & (~(i2811 & i2812));
                Object[] objArr19 = {new int[1], iArr4, new int[]{i}, new String[0]};
                int i2813 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i2814 = (i2813 ^ 95) + ((i2813 & 95) << 1);
                TuitionPaymentFragmentbindingInflater1 = i2814 % 128;
                int i2815 = i2814 % 2;
                return objArr19;
            } catch (Throwable th5) {
                Throwable cause3 = th5.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th5;
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
        private static java.lang.String $$e(int r5, int r6, int r7) {
            /*
                int r5 = 104 - r5
                int r6 = r6 * 4
                int r6 = r6 + 1
                byte[] r0 = defpackage.setOutputFormat.Companion.$$c
                int r7 = r7 * 2
                int r7 = 4 - r7
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r6
                r3 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L22:
                r4 = r0[r7]
            L24:
                int r4 = -r4
                int r5 = r5 + r4
                int r7 = r7 + 1
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.setOutputFormat.Companion.$$e(int, int, int):java.lang.String");
        }
    }
}
