package kotlin.text;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.mlkit.common.MlKitException;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0014\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0017"}, d2 = {"", "Lkotlin/text/FlagEnum;", "", "toInt", "(Ljava/lang/Iterable;)I", "", ExifInterface.GPS_DIRECTION_TRUE, "p0", "", "fromInt", "(I)Ljava/util/Set;", "Ljava/util/regex/Matcher;", "", "p1", "Lkotlin/text/MatchResult;", "findNext", "(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lkotlin/text/MatchResult;", "matchEntire", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;", "Ljava/util/regex/MatchResult;", "Lkotlin/ranges/IntRange;", "range", "(Ljava/util/regex/MatchResult;)Lkotlin/ranges/IntRange;", "(Ljava/util/regex/MatchResult;I)Lkotlin/ranges/IntRange;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RegexKt {
    private static final /* synthetic */ <T extends Enum<T> & FlagEnum> Set<T> fromInt(final int i) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        EnumSet enumSetAllOf = EnumSet.allOf(Enum.class);
        Intrinsics.checkNotNull(enumSetAllOf);
        Intrinsics.needClassReification();
        CollectionsKt.retainAll(enumSetAllOf, new Function1<T, Boolean>() { // from class: kotlin.text.RegexKt$fromInt$1$1
            private static final byte[] $$c = {27, 65, -33, 120};
            private static final int $$f = 169;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {93, -77, 2, Base64.padSymbol, -12, -13, 0, -5, -13, 56, -61, -20, -5, -8, -1, -6, -25, 3, -14, -7, -13, Base64.padSymbol, -39, -28, -23, 17, -26, -19, 4, 28, -41, -9, -3, -28, 1, -16, 35, -44, -11, -4, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, 10, -15, -13, 2, -13, -13, -1, 22, -45, 0, -14, 3, -27, 7, -21, 57};
            private static final int $$e = 42;
            private static final byte[] $$a = {117, 50, 102, 124, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
            private static final int $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int b = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
            private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 39823;

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 + 4
                    int r6 = r6 * 3
                    int r6 = 100 - r6
                    byte[] r0 = kotlin.text.RegexKt$fromInt$1$1.$$a
                    int r1 = r8 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r7
                    r4 = r2
                    goto L2a
                L12:
                    r3 = r2
                L13:
                    int r7 = r7 + 1
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L22:
                    r4 = r0[r7]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2a:
                    int r7 = -r7
                    int r6 = r6 + r7
                    int r6 = r6 + (-5)
                    r7 = r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.text.RegexKt$fromInt$1$1.a(short, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r5, byte r6, byte r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = kotlin.text.RegexKt$fromInt$1$1.$$d
                    int r5 = r5 * 36
                    int r5 = r5 + 4
                    int r6 = r6 * 23
                    int r6 = r6 + 84
                    int r1 = r7 + 37
                    byte[] r1 = new byte[r1]
                    int r7 = r7 + 36
                    r2 = -1
                    if (r0 != 0) goto L16
                    r3 = r6
                    r6 = r5
                    goto L2b
                L16:
                    r4 = r6
                    r6 = r5
                    r5 = r4
                L19:
                    int r2 = r2 + 1
                    byte r3 = (byte) r5
                    r1[r2] = r3
                    if (r2 != r7) goto L29
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r1, r6)
                    r8[r6] = r5
                    return
                L29:
                    r3 = r0[r6]
                L2b:
                    int r3 = -r3
                    int r5 = r5 + r3
                    int r5 = r5 + (-8)
                    int r6 = r6 + 1
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.text.RegexKt$fromInt$1$1.d(short, byte, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            /* JADX WARN: Multi-variable type inference failed */
            public final Boolean invoke(Enum r5) {
                int i2 = 2 % 2;
                int i3 = b + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                if (i3 % 2 != 0) {
                    FlagEnum flagEnum = (FlagEnum) r5;
                    flagEnum.getMask();
                    flagEnum.getValue();
                    throw null;
                }
                FlagEnum flagEnum2 = (FlagEnum) r5;
                Boolean boolValueOf = Boolean.valueOf((i & flagEnum2.getMask()) == flagEnum2.getValue());
                int i4 = b + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return boolValueOf;
                }
                throw null;
            }

            private static void c(char[] cArr, char[] cArr2, char c, int i2, char[] cArr3, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                int i4 = 0;
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i5 = $11 + 69;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cRgb = (char) ((-16768888) - Color.rgb(i4, i4, i4));
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 1236;
                            int iLastIndexOf = 34 - TextUtils.lastIndexOf("", '0', i4);
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            String str$$g = $$g(b2, b3, b3);
                            Class[] clsArr = new Class[1];
                            clsArr[i4] = Object.class;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iIndexOf, iLastIndexOf, -653973969, false, str$$g, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) i4;
                            byte b5 = (byte) (b4 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(i4), (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 2764, View.resolveSizeAndState(i4, i4, i4) + 14, 1504416861, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 253, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Drawable.resolveOpacity(0, 0) + 2891, 17 - (Process.myTid() >> 22), 2012627446, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        int i7 = $10 + 113;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        i4 = 0;
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

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Boolean invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                int i3 = b + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int fadingEdgeLength = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i5 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b2 = (byte) ($$b & 3);
                    Object[] objArr2 = new Object[1];
                    a(b2, (byte) (-b2), $$a[8], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, fadingEdgeLength, i5, -1199417970, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{54617, 53866, 46714, 36523}, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), '0' - AndroidCharacter.getMirror('0'), new char[]{8702, 35137, 16147, 43730, 37538, 2551, 26977, 30230, 65510, 33171, 51997, 12693, 32164, 47950, 16153, 44094, 34925, 14774, 9701, 62937, 24218, 18113}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{2956, 10975, 274, 36727}, (char) (30465 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 304799499, new char[]{22379, 25515, 6124, 51998, 9031, 50097, 63512, Typography.degree, 33871, 40662, 37224, 37298, 54150, 40010, 40135}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                    int i6 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                    byte b3 = $$a[11];
                    byte b4 = b3;
                    Object[] objArr5 = new Object[1];
                    a(b4, (byte) (b4 | 9), b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, absoluteGravity, i6, 254769921, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i7 = b + 69;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    int i8 = i7 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int iMyPid = (Process.myPid() >> 22) + 876;
                        int bitsPerPixel = 9 - ImageFormat.getBitsPerPixel(0);
                        byte b5 = (byte) ($$b & 3);
                        Object[] objArr6 = new Object[1];
                        a(b5, (byte) (b5 | 8), $$a[10], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iMyPid, bitsPerPixel, 1324201839, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iNextInt = new Random().nextInt();
                    int i9 = ((((~((~iNextInt) | 511703981)) * 130) + 2102657328) + (((~(iNextInt | 511703981)) | 266624) * 130)) - 222121070;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{29585, 17677, 36502, 62907}, (char) (48014 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, new char[]{54030, 48707, 52996, 19061, 9846, 52088, 61408, 30441, 51045, 59418, 56700, 16554, 38628, 719, 42548, 37704}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{17305, 52175, 3982, 22616}, (char) (TextUtils.getOffsetAfter("", 0) + 22543), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{46254, 23990, 5398, 61929, 57502, 37410, 16703, 50867, 43781, 28632, 29962, 40862, 4061, 7446, 9778, 63681}, objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    try {
                        Object[] objArr10 = {Integer.valueOf(iIntValue), -222121070};
                        byte[] bArr = $$d;
                        byte b6 = bArr[6];
                        Object[] objArr11 = new Object[1];
                        d(b6, bArr[34], b6, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b7 = bArr[34];
                        Object[] objArr12 = new Object[1];
                        d(b7, bArr[6], b7, objArr12);
                        objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i14 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                            byte b8 = (byte) ($$b & 3);
                            Object[] objArr13 = new Object[1];
                            a(b8, (byte) (b8 | 8), $$a[10], objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, doubleTapTimeout, i14, 1324201839, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr14 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{54617, 53866, 46714, 36523}, (char) Color.blue(0), KeyEvent.normalizeMetaState(0), new char[]{8702, 35137, 16147, 43730, 37538, 2551, 26977, 30230, 65510, 33171, 51997, 12693, 32164, 47950, 16153, 44094, 34925, 14774, 9701, 62937, 24218, 18113}, objArr14);
                            Class<?> cls4 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{2956, 10975, 274, 36727}, (char) (30465 - (ViewConfiguration.getWindowTouchSlop() >> 8)), KeyEvent.getDeadChar(0, 0) + 304799499, new char[]{22379, 25515, 6124, 51998, 9031, 50097, 63512, Typography.degree, 33871, 40662, 37224, 37298, 54150, 40010, 40135}, objArr15);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
                                int iRgb = (-16777206) - Color.rgb(0, 0, 0);
                                byte b9 = $$a[11];
                                byte b10 = b9;
                                Object[] objArr16 = new Object[1];
                                a(b10, (byte) (b10 | 9), b9, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel2, packedPositionGroup, iRgb, 254769921, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                                int iRgb2 = Color.rgb(0, 0, 0) + 16778092;
                                int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                                byte b11 = (byte) ($$b & 3);
                                Object[] objArr17 = new Object[1];
                                a(b11, (byte) (-b11), $$a[8], objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, iRgb2, trimmedLength, -1199417970, false, (String) objArr17[0], null);
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
                int i15 = ((int[]) objArr[2])[0];
                int i16 = ((int[]) objArr[0])[0];
                if (i16 == i15) {
                    int i17 = ((int[]) objArr[1])[0];
                    Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i18 = 1258180564 + (((~(502565736 | iIdentityHashCode)) | (-462255508)) * 672);
                    int i19 = ~iIdentityHashCode;
                    int i20 = i17 + i18 + (((~(iIdentityHashCode | (-462255508))) | (~((-502565737) | i19))) * (-672)) + (((~(462255507 | i19)) | (-536739836)) * 672);
                    int i21 = (i20 << 13) ^ i20;
                    int i22 = i21 ^ (i21 >>> 17);
                    ((int[]) objArr18[1])[0] = i22 ^ (i22 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[3];
                    if (strArr != null) {
                        for (String str : strArr) {
                            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                            b = i23 % 128;
                            int i24 = i23 % 2;
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
                    int i25 = ((int[]) objArr[1])[0];
                    Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i26 = i25 + (-441366812) + (((~(853007241 | iIdentityHashCode2)) | 46205569) * (-502)) + ((~((~iIdentityHashCode2) | 939523039)) * (-502)) + (((~(iIdentityHashCode2 | (-893317471))) | 853007241) * TypedValues.PositionType.TYPE_DRAWPATH);
                    int i27 = (i26 << 13) ^ i26;
                    int i28 = i27 ^ (i27 >>> 17);
                    ((int[]) objArr19[1])[0] = i28 ^ (i28 << 5);
                }
                return invoke((Enum) obj);
            }

            private static String $$g(int i2, int i3, int i4) {
                int i5 = i3 + 102;
                byte[] bArr = $$c;
                int i6 = i2 * 3;
                int i7 = 3 - (i4 * 4);
                byte[] bArr2 = new byte[i6 + 1];
                int i8 = -1;
                if (bArr == null) {
                    i5 += -i6;
                }
                while (true) {
                    i8++;
                    bArr2[i8] = (byte) i5;
                    if (i8 == i6) {
                        return new String(bArr2, 0);
                    }
                    i7++;
                    i5 += -bArr[i7];
                }
            }
        });
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "");
        return setUnmodifiableSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult findNext(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult matchEntire(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange range(java.util.regex.MatchResult matchResult) {
        return RangesKt.until(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange range(java.util.regex.MatchResult matchResult, int i) {
        return RangesKt.until(matchResult.start(i), matchResult.end(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toInt(Iterable<? extends FlagEnum> iterable) {
        Iterator<? extends FlagEnum> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}
