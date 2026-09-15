package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.request.RequestOptions;
import com.google.mlkit.common.MlKitException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class setAutoCancelDuration {
    b INotificationSideChannel;
    private Transformation<Bitmap> INotificationSideChannelDefault;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 INotificationSideChannelStub;
    private RequestBuilder<Bitmap> INotificationSideChannelStubProxy;
    public Bitmap TuitionPaymentFragmentbindingInflater1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final BitmapPool TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    b TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f1359a;
    public final getMirroring asBinder;
    boolean asInterface;
    final List<TuitionPaymentFragmentspecialinlinedviewModeldefault1> b;
    private final Handler cancel;
    int cancelAll;
    boolean d;
    int g;
    private boolean getInterfaceDescriptor;
    private boolean notify;
    final RequestManager onTransact;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void b();
    }

    interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    }

    private setAutoCancelDuration(BitmapPool bitmapPool, RequestManager requestManager, getMirroring getmirroring, RequestBuilder<Bitmap> requestBuilder, Transformation<Bitmap> transformation, Bitmap bitmap) {
        this.b = new ArrayList();
        this.onTransact = requestManager;
        Handler handler = new Handler(Looper.getMainLooper(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bitmapPool;
        this.cancel = handler;
        this.INotificationSideChannelStubProxy = requestBuilder;
        this.asBinder = getmirroring;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(transformation, bitmap);
    }

    static class b extends setCaptureOptionUnpacker<Bitmap> {
        private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final int b;
        private static final byte[] $$c = {83, -4, -55, -17};
        private static final int $$d = 139;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {115, 25, -47, -94, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
        private static int asBinder = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1360a = 1;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {45565, 41990, 39440, 61490, 58915, 56369, 12864, 10270, 7763, 29819, 27194, 16563, 46741, 44171, 33456, 63669, 61105, 50411, 15064, 4335, 1775, 31987, 51411, 56622, 58175, 35098, 40725, 42263, 19306, 20808, 26483, 3395, 4946, 14782, 53167, 54719, 64395};
        private static long g = -333150147958168472L;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 52
                int r5 = 56 - r5
                byte[] r0 = setAutoCancelDuration.b.$$a
                int r7 = r7 * 14
                int r7 = 98 - r7
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r6
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L24:
                r3 = r0[r5]
            L26:
                int r3 = -r3
                int r5 = r5 + 1
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: setAutoCancelDuration.b.c(short, byte, short, java.lang.Object[]):void");
        }

        private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i4 = $11 + 113;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i6 = $10 + 77;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 2187 - Color.argb(0, 0, 0, 0), 40 - KeyEvent.normalizeMetaState(0), 841711447, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(g), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getScrollBarSize() >> 8)), 3010 - TextUtils.lastIndexOf("", '0', 0, 0), ExpandableListView.getPackedPositionType(0L) + 26, 321985076, false, $$e(b3, b4, (byte) (b4 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (Process.myPid() >> 22)), 3376 - View.resolveSizeAndState(0, 0, 0), Color.green(0) + 17, -968507904, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - View.MeasureSpec.getMode(0)), 3376 - (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.keyCodeFromString("") + 17, -968507904, false, $$e(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
            int i9 = $10 + 97;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }

        @Override // defpackage.setDefaultResolution
        public final /* synthetic */ void onResourceReady(Object obj, setImageQueueDepth setimagequeuedepth) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = f1360a + 51;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            int i4 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int iBlue = 651 - Color.blue(0);
                int minimumFlingVelocity = 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte b = $$a[5];
                Object[] objArr2 = new Object[1];
                c(b, (byte) 52, b, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, iBlue, minimumFlingVelocity, -459846511, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            d(View.MeasureSpec.getMode(0), 22 - TextUtils.getOffsetBefore("", 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(((Process.getThreadPriority(0) + 20) >> 6) + 22, 15 - ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31018), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 651;
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                c(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iNormalizeMetaState, keyRepeatTimeout, -873460649, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    int iAxisFromString = 650 - MotionEvent.axisFromString("");
                    int iResolveSize = 44 - View.resolveSize(0, 0);
                    byte[] bArr = $$a;
                    byte b4 = bArr[7];
                    Object[] objArr6 = new Object[1];
                    c(b4, (byte) (b4 | 37), bArr[5], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iAxisFromString, iResolveSize, -1595579076, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i5 = ((int[]) objArr7[2])[0];
                int i6 = ((int[]) objArr7[0])[0];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i7 = ~startUptimeMillis;
                int i8 = 157817214 + (((~(921933655 | i7)) | 925364465) * (-90)) + (((~(921933655 | startUptimeMillis)) | 13633286) * (-45)) + (((~(startUptimeMillis | (-925364466))) | 921933655 | (~(i7 | 925364465))) * 45) + 365627988;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1610 - (ViewConfiguration.getJumpTapTimeout() >> 16), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 365627988, 0};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                        int deadChar = 44 - KeyEvent.getDeadChar(0, 0);
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr9 = new Object[1];
                        c(b5, b6, b6, objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i11, deadChar, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 695 - (ViewConfiguration.getEdgeSlop() >> 16), 99 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 63406), (ViewConfiguration.getTapTimeout() >> 16) + 793, View.MeasureSpec.makeMeasureSpec(0, 0) + 83), Integer.TYPE, Integer.TYPE});
                    }
                    Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int i12 = 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iResolveSize2 = View.resolveSize(0, 0) + 44;
                        byte[] bArr2 = $$a;
                        byte b7 = bArr2[7];
                        Object[] objArr11 = new Object[1];
                        c(b7, (byte) (b7 | 37), bArr2[5], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, i12, iResolveSize2, -1595579076, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                    try {
                        Object[] objArr12 = new Object[1];
                        d(Color.green(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, (char) ExpandableListView.getPackedPositionGroup(0L), objArr12);
                        Class<?> cls2 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        d(21 - ((byte) KeyEvent.getModifierMetaStateMask()), KeyEvent.normalizeMetaState(0) + 15, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31018), objArr13);
                        long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int absoluteGravity = 651 - Gravity.getAbsoluteGravity(0, 0);
                            int i13 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr14 = new Object[1];
                            c(b8, b9, b9, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, absoluteGravity, i13, -873460649, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 651;
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 44;
                            byte b10 = $$a[5];
                            Object[] objArr15 = new Object[1];
                            c(b10, (byte) 52, b10, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(modifierMetaStateMask, iIndexOf, touchSlop, -459846511, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                        objArr = objArr10;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[2])[0];
            if (i15 == i14) {
                int i16 = f1360a + 15;
                asBinder = i16 % 128;
                int i17 = i16 % 2;
                Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i18 = ((int[]) objArr[3])[0];
                int i19 = ((int[]) objArr[2])[0];
                int i20 = ((int[]) objArr[0])[0];
                int iNextInt = new Random().nextInt();
                int i21 = ~iNextInt;
                int i22 = i18 + 1107831781 + ((549175226 | iNextInt) * (-676)) + (((~(548933434 | i21)) | (-549175227)) * 676) + (((~(iNextInt | (-241793))) | (~(i21 | 545502624)) | 3672602) * 676);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr16[3])[0] = i24 ^ (i24 << 5);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (Bitmap) obj;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.sendMessageAtTime(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.obtainMessage(1, this), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i25 = f1360a + 57;
                while (true) {
                    asBinder = i25 % 128;
                    int i26 = i25 % 2;
                    if (i4 >= strArr.length) {
                        break;
                    }
                    int i27 = asBinder + 45;
                    f1360a = i27 % 128;
                    if (i27 % 2 == 0) {
                        arrayList.add(strArr[i4]);
                        i4 += 19;
                    } else {
                        arrayList.add(strArr[i4]);
                        i4++;
                    }
                    i25 = f1360a + 1;
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }

        b(Handler handler, int i, long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = handler;
            this.b = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        }

        @Override // defpackage.setDefaultResolution
        public final void onLoadCleared(Drawable drawable) {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 9;
            f1360a = i3 % 128;
            int i4 = i3 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            int i5 = i2 + 41;
            f1360a = i5 % 128;
            int i6 = i5 % 2;
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
        private static java.lang.String $$e(byte r5, short r6, byte r7) {
            /*
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r5 = r5 * 4
                int r0 = r5 + 1
                byte[] r1 = setAutoCancelDuration.b.$$c
                int r6 = r6 * 3
                int r6 = r6 + 109
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r4 = r7
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L22:
                r4 = r1[r7]
                int r3 = r3 + 1
            L26:
                int r7 = r7 + 1
                int r4 = -r4
                int r6 = r6 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: setAutoCancelDuration.b.$$e(byte, short, byte):java.lang.String");
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (!this.asInterface || this.notify) {
            return;
        }
        b bVar = this.INotificationSideChannel;
        if (bVar != null) {
            this.INotificationSideChannel = null;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(bVar);
            return;
        }
        this.notify = true;
        int iAsBinder = this.asBinder.asBinder();
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.f1359a = new b(this.cancel, this.asBinder.b(), SystemClock.uptimeMillis() + ((long) iAsBinder));
        RequestBuilder<Bitmap> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.INotificationSideChannelStubProxy.apply(RequestOptions.b(new setResolutionSelector(Double.valueOf(Math.random())))).TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asBinder);
        requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.f1359a, null, requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1, setTargetAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(b bVar) {
        this.notify = false;
        if (this.d) {
            this.cancel.obtainMessage(2, bVar).sendToTarget();
            return;
        }
        if (!this.asInterface) {
            this.INotificationSideChannel = bVar;
            return;
        }
        if (bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            Bitmap bitmap = this.TuitionPaymentFragmentbindingInflater1;
            if (bitmap != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(bitmap);
                this.TuitionPaymentFragmentbindingInflater1 = null;
            }
            b bVar2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar;
            for (int size = this.b.size() - 1; size >= 0; size--) {
                this.b.get(size).b();
            }
            if (bVar2 != null) {
                this.cancel.obtainMessage(2, bVar2).sendToTarget();
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Handler.Callback {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                setAutoCancelDuration.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1((b) message.obj);
                return true;
            }
            if (message.what != 2) {
                return false;
            }
            setAutoCancelDuration.this.onTransact.b((b) message.obj);
            return false;
        }
    }

    setAutoCancelDuration(Glide glide, getMirroring getmirroring, int i, int i2, Transformation<Bitmap> transformation, Bitmap bitmap) {
        this(glide.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getBaseContext()), getmirroring, Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getBaseContext()).TuitionPaymentFragmentbindingInflater1().apply(RequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraSelector.b).TuitionPaymentFragmentspecialinlinedviewModeldefault1(true).TuitionPaymentFragmentbindingInflater1(true).TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2)), transformation, bitmap);
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Transformation<Bitmap> transformation, Bitmap bitmap) {
        if (transformation == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.INotificationSideChannelDefault = transformation;
        if (bitmap != null) {
            this.TuitionPaymentFragmentbindingInflater1 = bitmap;
            this.INotificationSideChannelStubProxy = this.INotificationSideChannelStubProxy.apply(new RequestOptions().TuitionPaymentFragmentspecialinlinedviewModeldefault1(transformation));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmap);
            this.cancelAll = bitmap.getWidth();
            this.g = bitmap.getHeight();
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }
}
