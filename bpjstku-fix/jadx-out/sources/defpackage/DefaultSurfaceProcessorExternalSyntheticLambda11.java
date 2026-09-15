package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultSurfaceProcessorExternalSyntheticLambda11 {
    static <T, F> void TuitionPaymentFragmentbindingInflater1(final Iterator<F> it, final DefaultSurfaceProcessorPendingSnapshot<T, F> defaultSurfaceProcessorPendingSnapshot, final DefaultSurfaceProcessorExternalSyntheticLambda5<T> defaultSurfaceProcessorExternalSyntheticLambda5, Exception e2) {
        while (it.hasNext()) {
            try {
                defaultSurfaceProcessorPendingSnapshot.TuitionPaymentFragmentspecialinlinedviewModeldefault1(it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new DefaultSurfaceProcessorExternalSyntheticLambda9() { // from class: DefaultSurfaceProcessorExternalSyntheticLambda2
                    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda9
                    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                        defaultSurfaceProcessorExternalSyntheticLambda5.b((Exception) null, obj, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                    }
                }).TuitionPaymentFragmentbindingInflater1(new onFrameAvailable() { // from class: DefaultSurfaceProcessorExternalSyntheticLambda12
                    private static final byte[] $$c = {93, -77, 2, Base64.padSymbol};
                    private static final int $$d = 73;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {38, 31, -70, -1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
                    private static final int $$b = 29;
                    private static int g = 0;
                    private static int asInterface = 1;
                    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 3815506004861539813L;
                    private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
                    private static char d = 34097;

                    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void c(int r5, byte r6, short r7, java.lang.Object[] r8) {
                        /*
                            int r7 = r7 + 4
                            int r5 = r5 * 3
                            int r5 = r5 + 84
                            int r6 = r6 * 4
                            int r0 = 53 - r6
                            byte[] r1 = defpackage.DefaultSurfaceProcessorExternalSyntheticLambda12.$$a
                            byte[] r0 = new byte[r0]
                            int r6 = 52 - r6
                            r2 = -1
                            if (r1 != 0) goto L16
                            r3 = r6
                            r5 = r7
                            goto L2d
                        L16:
                            r4 = r7
                            r7 = r5
                            r5 = r4
                        L19:
                            int r2 = r2 + 1
                            int r5 = r5 + 1
                            byte r3 = (byte) r7
                            r0[r2] = r3
                            if (r2 != r6) goto L2b
                            java.lang.String r5 = new java.lang.String
                            r6 = 0
                            r5.<init>(r0, r6)
                            r8[r6] = r5
                            return
                        L2b:
                            r3 = r1[r5]
                        L2d:
                            int r7 = r7 + r3
                            int r7 = r7 + (-11)
                            goto L19
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.DefaultSurfaceProcessorExternalSyntheticLambda12.c(int, byte, short, java.lang.Object[]):void");
                    }

                    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
                            int i4 = $10 + 49;
                            $11 = i4 % 128;
                            int i5 = i4 % i2;
                            try {
                                Object[] objArr2 = {sessionProcessor};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b = (byte) 0;
                                    byte b2 = b;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8329 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1235 - (ViewConfiguration.getJumpTapTimeout() >> 16), 35 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -653973969, false, $$e(b, b2, b2), new Class[]{Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                Object[] objArr3 = {sessionProcessor};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                    int i6 = 2764 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14;
                                    byte b3 = $$c[2];
                                    byte b4 = (byte) (b3 - 2);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, i6, i7, 1504416861, false, $$e(b3, b4, b4), new Class[]{Object.class});
                                }
                                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 253, TextUtils.getOffsetBefore("", 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char c2 = (char) (65201 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2891;
                                    int i8 = 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    byte b5 = (byte) ($$d & 7);
                                    byte b6 = (byte) (b5 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, fadingEdgeLength, i8, 2012627446, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = sessionProcessor.b;
                                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) d) ^ (-6377398940819159759L)))));
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
                        int i9 = $11 + 125;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                    }

                    @Override // defpackage.onFrameAvailable
                    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) throws Throwable {
                        int i = 2 % 2;
                        int i2 = g + 37;
                        asInterface = i2 % 128;
                        int i3 = i2 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                        int i4 = 0;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.resolveSize(0, 0)), 39 - ImageFormat.getBitsPerPixel(0), MotionEvent.axisFromString("") + 20, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                        Object[] objArr = new Object[1];
                        a(new char[]{53460, 16289, 35597, 37773}, new char[]{59765, 34868, 49512, 26201}, (char) View.MeasureSpec.getSize(0), (-1) - ExpandableListView.getPackedPositionChild(0L), new char[]{13941, 3146, 56956, 29973, 30528, 17923, 13472, 56512, 64612, 59966, 16114, 37938, 57815, 57099, 33940, 13572, 51761, 3, 52639, 55299, 52575, 14993}, objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        Object[] objArr2 = new Object[1];
                        a(new char[]{53460, 16289, 35597, 37773}, new char[]{41296, 33670, 44868, 28955}, (char) (7087 - Color.blue(0)), 1149470369 + KeyEvent.keyCodeFromString(""), new char[]{47498, 6476, 43302, 47112, 39436, 57908, 63437, 39957, 16334, 53793, 6660, 38105, 30246, 38057, 37735}, objArr2);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                        long j = -1;
                        long j2 = j ^ 768981048659306398L;
                        long jIdentityHashCode = System.identityHashCode(this);
                        long j3 = (((long) 303) * 768981048659306398L) + (((long) (-301)) * 1328276126082652589L) + (((long) (-302)) * ((((j2 | (jIdentityHashCode ^ j)) | 1328276126082652589L) ^ j) | ((1941047290036355007L | jIdentityHashCode) ^ j))) + (((long) (-604)) * (((j2 | 1328276126082652589L) | jIdentityHashCode) ^ j)) + (((long) 302) * ((j ^ (jIdentityHashCode | 1328276126082652589L)) | (((j ^ 1328276126082652589L) | 768981048659306398L) ^ j)));
                        int i6 = 0;
                        while (true) {
                            int i7 = 8;
                            if (i6 == 10) {
                                Object[] objArr3 = new Object[1];
                                a(new char[]{53460, 16289, 35597, 37773}, new char[]{31256, 19062, 34839, 20223}, (char) (65415 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, new char[]{26405, 4389, 41603, 62501, 1673, 6794, 40566, 37166, 10717, 24758, 26176, 15601, 55630, 29768, 29885, 8201}, objArr3);
                                Class<?> cls2 = Class.forName((String) objArr3[0]);
                                Object[] objArr4 = new Object[1];
                                a(new char[]{53460, 16289, 35597, 37773}, new char[]{49182, 40739, 28707, 29098}, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43632), TextUtils.indexOf("", ""), new char[]{9742, 9195, 55033, 51996, 30996, 38016, 61504, 57881, 35688, 10711, 33950, 38933, 12347, 46185, 16244, 26671}, objArr4);
                                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                                try {
                                    Object[] objArr5 = {56651468};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 46038), 1134 - ((Process.getThreadPriority(0) + 20) >> 6), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                                    }
                                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1237271119, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                                        int iBlue = 1031 - Color.blue(0);
                                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
                                        byte[] bArr = $$a;
                                        byte b = bArr[7];
                                        Object[] objArr7 = new Object[1];
                                        c(b, b, bArr[3], objArr7);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, iBlue, maximumDrawingCacheSize, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1117 - View.MeasureSpec.getSize(0), 16 - ExpandableListView.getPackedPositionChild(0L)), Boolean.TYPE});
                                    }
                                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                                    int i8 = ((int[]) objArr8[1])[0];
                                    int i9 = ((int[]) objArr8[3])[0];
                                    if (i9 == i8) {
                                        break;
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    String[] strArr = (String[]) objArr8[0];
                                    if (strArr != null) {
                                        for (String str : strArr) {
                                            arrayList.add(str);
                                        }
                                    }
                                    Toast.makeText((Context) null, i9 / (((i9 - 1) * i9) % 2), 0).show();
                                    break;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            int i10 = asInterface + 23;
                            g = i10 % 128;
                            int i11 = i10 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - Drawable.resolveOpacity(i4, i4)), KeyEvent.normalizeMetaState(i4) + 59, 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                            }
                            int i12 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                            int i13 = i4;
                            long j4 = jLongValue;
                            while (true) {
                                int i14 = i4;
                                while (i14 != i7) {
                                    int i15 = g + 21;
                                    asInterface = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        i12 = (((((int) (j4 >>> i14)) & 20508) * (i12 - 57)) - (i12 << 8)) % i12;
                                        i14 += 37;
                                    } else {
                                        i12 = (((((int) (j4 >> i14)) & 255) + (i12 << 6)) + (i12 << 16)) - i12;
                                        i14++;
                                    }
                                    i7 = 8;
                                }
                                if (i13 != 0) {
                                    break;
                                }
                                i13++;
                                j4 = j3;
                                i4 = 0;
                                i7 = 8;
                            }
                            if (i12 == i5) {
                                break;
                            }
                            jLongValue -= 1024;
                            i6++;
                            i4 = 0;
                        }
                        DefaultSurfaceProcessorExternalSyntheticLambda11.TuitionPaymentFragmentbindingInflater1(it, defaultSurfaceProcessorPendingSnapshot, defaultSurfaceProcessorExternalSyntheticLambda5, exc);
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$e(byte r6, int r7, short r8) {
                        /*
                            byte[] r0 = defpackage.DefaultSurfaceProcessorExternalSyntheticLambda12.$$c
                            int r7 = r7 * 2
                            int r7 = 3 - r7
                            int r8 = r8 * 4
                            int r8 = 1 - r8
                            int r6 = r6 + 102
                            byte[] r1 = new byte[r8]
                            r2 = 0
                            if (r0 != 0) goto L14
                            r3 = r8
                            r4 = r2
                            goto L26
                        L14:
                            r3 = r2
                        L15:
                            int r4 = r3 + 1
                            byte r5 = (byte) r6
                            r1[r3] = r5
                            if (r4 != r8) goto L22
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L22:
                            int r7 = r7 + 1
                            r3 = r0[r7]
                        L26:
                            int r3 = -r3
                            int r6 = r6 + r3
                            r3 = r4
                            goto L15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.DefaultSurfaceProcessorExternalSyntheticLambda12.$$e(byte, int, short):java.lang.String");
                    }
                });
                return;
            } catch (Exception e3) {
                e2 = e3;
            }
        }
        if (e2 == null) {
            defaultSurfaceProcessorExternalSyntheticLambda5.b(new Exception("empty list"), (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
        } else {
            defaultSurfaceProcessorExternalSyntheticLambda5.b(e2, (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
        }
    }

    public static <T, F> DefaultSurfaceProcessorExternalSyntheticLambda10<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Iterable<F> iterable, DefaultSurfaceProcessorPendingSnapshot<T, F> defaultSurfaceProcessorPendingSnapshot) {
        DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        TuitionPaymentFragmentbindingInflater1(iterable.iterator(), defaultSurfaceProcessorPendingSnapshot, defaultSurfaceProcessorExternalSyntheticLambda5, null);
        return defaultSurfaceProcessorExternalSyntheticLambda5;
    }
}
