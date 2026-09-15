package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.common.base.AbstractIterator;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class markCameraState {
    final traceState TuitionPaymentFragmentbindingInflater1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        Iterator<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2(markCameraState markcamerastate, CharSequence charSequence);
    }

    public markCameraState(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this(tuitionPaymentFragmentspecialinlinedviewModeldefault1, false, traceState.b(), Integer.MAX_VALUE);
    }

    public markCameraState(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, boolean z, traceState tracestate, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        this.TuitionPaymentFragmentbindingInflater1 = tracestate;
        this.b = i;
    }

    /* JADX INFO: renamed from: markCameraState$3, reason: invalid class name */
    public class AnonymousClass3 implements TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        final /* synthetic */ traceState TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public AnonymousClass3(traceState tracestate) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tracestate;
        }

        @Override // markCameraState.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ Iterator TuitionPaymentFragmentspecialinlinedviewModeldefault2(markCameraState markcamerastate, CharSequence charSequence) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(markcamerastate, charSequence) { // from class: markCameraState.3.2
                @Override // markCameraState.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                final int TuitionPaymentFragmentbindingInflater1(int i) {
                    return i + 1;
                }

                @Override // markCameraState.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
                    return AnonymousClass3.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(((TuitionPaymentFragmentspecialinlinedviewModeldefault2) this).b, i);
                }
            };
        }
    }

    static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends AbstractIterator<String> {
        private int TuitionPaymentFragmentbindingInflater1;
        private traceState TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final CharSequence b;
        private static final byte[] $$c = {108, -26, -110, 50};
        private static final int $$f = 46;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {119, -102, -34, -3, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 11, 7, -15, 1, 6, 16, -5, 11, -6, -3, 73, -73, 3, 16, -1, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
        private static final int $$e = 106;
        private static final byte[] $$a = {102, -96, -78, -55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 211;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1274a = 0;
        private static int g = 1;
        private static char[] d = {60045, 60063, 60041, 60088, 60034, 60056, 60048, 60053, 60058, 60072, 59747, 60061, 60060, 60079, 60090, 60055, 60046, 60059, 60050, 60043, 59746, 60054, 60049, 60073, 60051, 60062, 60044, 60083, 60040, 59749, 59744, 60117, 59745, 60057, 60052, 60047};
        private static char asInterface = 57191;

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = markCameraState.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                int r1 = r7 + 1
                int r5 = r5 * 52
                int r5 = r5 + 4
                int r6 = r6 * 14
                int r6 = r6 + 84
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L22:
                int r3 = r3 + 1
                r4 = r0[r5]
            L26:
                int r4 = -r4
                int r5 = r5 + 1
                int r6 = r6 + r4
                int r6 = r6 + (-10)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: markCameraState.TuitionPaymentFragmentspecialinlinedviewModeldefault2.c(short, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(short r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 15
                int r5 = 99 - r5
                int r6 = r6 * 5
                int r0 = 53 - r6
                byte[] r1 = markCameraState.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                int r6 = 52 - r6
                r2 = 0
                if (r1 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L24:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r1[r7]
            L2a:
                int r4 = -r4
                int r5 = r5 + r4
                int r5 = r5 + 3
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: markCameraState.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f(short, short, short, java.lang.Object[]):void");
        }

        abstract int TuitionPaymentFragmentbindingInflater1(int i);

        abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i);

        /* JADX WARN: Code duplicated, block: B:36:0x012c  */
        /* JADX WARN: Code duplicated, block: B:37:0x0144  */
        /* JADX WARN: Code duplicated, block: B:40:0x0190 A[Catch: all -> 0x0353, TryCatch #0 {all -> 0x0353, blocks: (B:7:0x0029, B:9:0x0037, B:10:0x0067, B:14:0x0081, B:16:0x0092, B:17:0x00c5, B:38:0x0146, B:40:0x0190, B:41:0x0205, B:45:0x0224, B:47:0x0261, B:49:0x02ca), top: B:66:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x0218  */
        /* JADX WARN: Code duplicated, block: B:47:0x0261 A[Catch: all -> 0x0353, TryCatch #0 {all -> 0x0353, blocks: (B:7:0x0029, B:9:0x0037, B:10:0x0067, B:14:0x0081, B:16:0x0092, B:17:0x00c5, B:38:0x0146, B:40:0x0190, B:41:0x0205, B:45:0x0224, B:47:0x0261, B:49:0x02ca), top: B:66:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x02c8  */
        /* JADX WARN: Code duplicated, block: B:51:0x02eb  */
        /* JADX WARN: Code duplicated, block: B:53:0x02f4  */
        /* JADX WARN: Code duplicated, block: B:54:0x031c  */
        private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            Object[] objArr2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i3 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = d;
            int i4 = 1770390596;
            Object obj2 = null;
            int i5 = 8;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = $11 + 105;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2267 - (ViewConfiguration.getTouchSlop() >> i5), KeyEvent.normalizeMetaState(0) + 33, -1927765101, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                        i8++;
                        i4 = 1770390596;
                        i5 = 8;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(asInterface)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266, 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1927765101, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i9 = $10 + 59;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                } else {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                }
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i10 = $10 + 85;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            obj = obj2;
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b6 = (byte) 1;
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - Color.alpha(0)), 3261 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - ImageFormat.getBitsPerPixel(0), -127612708, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                int i11 = $10 + 67;
                                $11 = i11 % 128;
                                int i12 = i11 % 2;
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b8 = (byte) 3;
                                    byte b9 = (byte) (b8 - 3);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22877 - MotionEvent.axisFromString("")), Color.alpha(0) + 594, TextUtils.getOffsetBefore("", 0) + 17, 1570859318, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                } else {
                                    int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                }
                            }
                        }
                    } else {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            obj = obj2;
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b10 = (byte) 1;
                                byte b11 = (byte) (b10 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - Color.alpha(0)), 3261 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - ImageFormat.getBitsPerPixel(0), -127612708, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                int i18 = $10 + 67;
                                $11 = i18 % 128;
                                int i19 = i18 % 2;
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b12 = (byte) 3;
                                    byte b13 = (byte) (b12 - 3);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22877 - MotionEvent.axisFromString("")), Color.alpha(0) + 594, TextUtils.getOffsetBefore("", 0) + 17, 1570859318, false, $$g(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i111 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i112 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i111];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i112];
                                } else {
                                    int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                                }
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            for (int i20 = 0; i20 < i; i20++) {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0235  */
        /* JADX WARN: Code duplicated, block: B:27:0x0237  */
        @Override // com.google.common.base.AbstractIterator
        public final /* synthetic */ String b() throws Throwable {
            Object[] objArr;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 31534);
                int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
                byte[] bArr = $$a;
                byte b = bArr[80];
                Object[] objArr2 = new Object[1];
                c(b, bArr[7], b, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, packedPositionChild, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{'\t', '\b', 2, 3, 30, 22, 7, 1, 4, Typography.quote, '!', 7, '\n', Typography.quote, 31, 29, 27, '\t', 16, '!', 0, 11}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17), (KeyEvent.getMaxKeyCode() >> 16) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{27, '\r', 7, 20, 29, 26, 5, 19, 26, 7, 17, '!', 19, 22, 13889}, (byte) (66 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 15 - (Process.myPid() >> 22), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cKeyCodeFromString = (char) (31533 - KeyEvent.keyCodeFromString(""));
                int i2 = 922 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iMyTid = 28 - (Process.myTid() >> 22);
                byte b2 = $$a[80];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                c(b2, b3, (byte) (b3 | 52), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, i2, iMyTid, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int iAlpha = 921 - Color.alpha(0);
                    int iRgb = Color.rgb(0, 0, 0) + 16777244;
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[7];
                    byte b5 = bArr2[80];
                    Object[] objArr6 = new Object[1];
                    c(b4, b5, (byte) (b5 | 37), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iAlpha, iRgb, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i3 = ((int[]) objArr7[3])[0];
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i3}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = ~iIdentityHashCode;
                int i5 = 1990247780 + (((~(i4 | 1604924112)) | (-1606237148) | (~((-167842497) | iIdentityHashCode))) * 717) + (((~(iIdentityHashCode | 1604924112)) | (~(i4 | (-167842497))) | (-1606237148)) * 717) + 1759150865;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(new char[]{'\t', '\b', 2, 3, 30, 22, 7, 1, 7, 20, 25, 1, 17, 2, 30, 23, 6, 24, Typography.quote, 5, '\f', 25, 1, 26, 7, 2}, (byte) (93 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 26 - (ViewConfiguration.getTapTimeout() >> 16), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{4, 17, 13825, 13825, 31, '\r', ' ', 17, 13827, 13827, '\f', 21, 2, 11, 30, 23, 31, '\n'}, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 25), 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i8 = g;
                    int i9 = i8 + 105;
                    f1274a = i9 % 128;
                    int i10 = i9 % 2;
                    if (applicationContext instanceof ContextWrapper) {
                        int i11 = i8 + 99;
                        f1274a = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 27 / 0;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                e(new char[]{20, '\n', 2, 6, '!', '\r', '\t', '\b', '\r', 30, '\n', 3, 29, Typography.quote, 27, 19}, (byte) ((-16777172) - Color.rgb(0, 0, 0)), KeyEvent.getDeadChar(0, 0) + 16, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(new char[]{19, 0, 31, '\r', 30, 23, Typography.quote, 5, 26, '\t', 29, 25, 4, '!', 7, 31}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 23), 15 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1759150865};
                    byte[] bArr3 = $$d;
                    byte b6 = bArr3[39];
                    Object[] objArr13 = new Object[1];
                    f((byte) (b6 - 1), b6, bArr3[50], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr3[39];
                    byte b8 = (byte) (b7 - 1);
                    Object[] objArr14 = new Object[1];
                    f(b7, b8, (byte) (b8 | 46), objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                        int iIndexOf2 = 921 - TextUtils.indexOf("", "", 0);
                        int gidForName = Process.getGidForName("") + 29;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        byte b10 = bArr4[80];
                        Object[] objArr16 = new Object[1];
                        c(b9, b10, (byte) (b10 | 37), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, iIndexOf2, gidForName, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{'\t', '\b', 2, 3, 30, 22, 7, 1, 4, Typography.quote, '!', 7, '\n', Typography.quote, 31, 29, 27, '\t', 16, '!', 0, 11}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 17), 22 - KeyEvent.keyCodeFromString(""), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{27, '\r', 7, 20, 29, 26, 5, 19, 26, 7, 17, '!', 19, 22, 13889}, (byte) (66 - (ViewConfiguration.getScrollBarSize() >> 8)), 15 - View.combineMeasuredStates(0, 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 921;
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                            byte b11 = $$a[80];
                            byte b12 = b11;
                            Object[] objArr19 = new Object[1];
                            c(b11, b12, (byte) (b12 | 52), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask, scrollBarSize, longPressTimeout, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                            int iIndexOf3 = 921 - TextUtils.indexOf("", "", 0);
                            int scrollBarSize2 = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte[] bArr5 = $$a;
                            byte b13 = bArr5[80];
                            Object[] objArr20 = new Object[1];
                            c(b13, bArr5[7], b13, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf3, scrollBarSize2, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
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
            int i13 = ((int[]) objArr[1])[0];
            int i14 = ((int[]) objArr[3])[0];
            if (i14 == i13) {
                int i15 = g + 81;
                f1274a = i15 % 128;
                int i16 = i15 % 2;
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((int[]) objArr[3])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i18}, (String[]) objArr[4]};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i19 = ~iFreeMemory;
                int i20 = i17 + (-839820280) + (((~(i19 | 992594603)) | 781485040) * (-1042)) + ((992594603 | iFreeMemory) * 521) + (((~(iFreeMemory | (-781485041))) | 704676512 | (~(i19 | 1069403131))) * 521);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i23 = 0;
                    while (i23 < strArr.length) {
                        int i24 = g + 101;
                        f1274a = i24 % 128;
                        if (i24 % 2 != 0) {
                            arrayList.add(strArr[i23]);
                            i23 += 3;
                        } else {
                            arrayList.add(strArr[i23]);
                            i23++;
                        }
                    }
                }
                Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                int i25 = ((int[]) objArr[0])[0];
                int i26 = ((int[]) objArr[3])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i26}, (String[]) objArr[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i27 = ~iIdentityHashCode2;
                int i28 = i25 + (-887169932) + ((~((-1428011837) | i27)) * 979) + ((iIdentityHashCode2 | 346067807) * (-979)) + (((~(iIdentityHashCode2 | (-1428011837))) | (~(i27 | 346067807))) * 979);
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr22[0])[0] = i30 ^ (i30 << 5);
                int i31 = f1274a + 89;
                g = i31 % 128;
                int i32 = i31 % 2;
            }
            int i33 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            while (true) {
                int i34 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (i34 == -1) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i35 = g + 39;
                    f1274a = i35 % 128;
                    int i36 = i35 % 2;
                    return null;
                }
                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(i34);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == -1) {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.length();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                int i37 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (i37 == i33) {
                    int i38 = i37 + 1;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i38;
                    if (i38 > this.b.length()) {
                        int i39 = f1274a;
                        int i40 = i39 + 87;
                        g = i40 % 128;
                        int i41 = i40 % 2;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;
                        int i42 = i39 + 63;
                        g = i42 % 128;
                        int i43 = i42 % 2;
                    }
                } else {
                    while (i33 < iTuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b.charAt(i33))) {
                        i33++;
                    }
                    while (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 > i33 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b.charAt(iTuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1))) {
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1--;
                    }
                    if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 || i33 != iTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        break;
                    }
                    i33 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
            }
            int i44 = this.TuitionPaymentFragmentbindingInflater1;
            if (i44 == 1) {
                int i45 = f1274a + 41;
                g = i45 % 128;
                int i46 = i45 % 2;
                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.length();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;
                while (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 > i33 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b.charAt(iTuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1))) {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1--;
                    int i47 = g + 123;
                    f1274a = i47 % 128;
                    int i48 = i47 % 2;
                }
            } else {
                this.TuitionPaymentFragmentbindingInflater1 = i44 - 1;
            }
            return this.b.subSequence(i33, iTuitionPaymentFragmentspecialinlinedviewModeldefault1).toString();
        }

        protected TuitionPaymentFragmentspecialinlinedviewModeldefault2(markCameraState markcamerastate, CharSequence charSequence) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = markcamerastate.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = markcamerastate.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentbindingInflater1 = markcamerastate.b;
            this.b = charSequence;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, short r7, short r8) {
            /*
                int r8 = r8 + 4
                byte[] r0 = markCameraState.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                int r7 = r7 * 3
                int r7 = r7 + 1
                int r6 = r6 + 113
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r8
                r4 = r2
                goto L2c
            L12:
                r3 = r2
            L13:
                r5 = r8
                r8 = r6
                r6 = r5
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                int r6 = r6 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r6 = r6 + r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: markCameraState.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(int, short, short):java.lang.String");
        }
    }

    public final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CharSequence charSequence) {
        Iterator<String> itTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itTuitionPaymentFragmentspecialinlinedviewModeldefault2.hasNext()) {
            arrayList.add(itTuitionPaymentFragmentspecialinlinedviewModeldefault2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
