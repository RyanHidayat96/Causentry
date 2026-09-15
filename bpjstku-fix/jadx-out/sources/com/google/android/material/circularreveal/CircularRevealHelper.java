package com.google.android.material.circularreveal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.google.android.material.math.MathUtils;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    private static final boolean DEBUG = false;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;
    private boolean buildingCircularRevealCache;
    private Paint debugPaint;
    private final Delegate delegate;
    private boolean hasCircularRevealCache;
    private Drawable overlayDrawable;
    private CircularRevealWidget.RevealInfo revealInfo;
    private final Paint revealPaint;
    private final Path revealPath;
    private final Paint scrimPaint;
    private final View view;
    private static final byte[] $$c = {109, 84, -87, -114};
    private static final int $$f = 125;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {0, -94, -62, -97, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -67, 14, -25, 11, 7, -10, -7, 69, -64, -3, 10, -2, -8, Base64.padSymbol, -69, 12, -13, -5, 15, -15, -2, 69, -28, -38, 9, -6, -14, 12, 4, -18, 19, -12, 39, -34, -16, 18, -9, -4, 40, -51, 1, -2, 4, 1, 7, -14, 34, -20, -9, 4, 1, -18, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64};
    private static final int $$e = 156;
    private static final byte[] $$a = {19, 78, 114, 113, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 32;
    private static int g = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    public interface Delegate {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    private static void a(int i, byte b2, byte b3, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 55 - (b2 * 52);
        int i3 = 98 - (i * 14);
        byte[] bArr2 = new byte[b3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = (i2 + (-i3)) - 10;
            i4 = -1;
        }
        while (true) {
            int i5 = i2;
            int i6 = i3;
            int i7 = i4 + 1;
            bArr2[i7] = (byte) i6;
            int i8 = i5 + 1;
            if (i7 == b3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i8;
                i3 = (i6 + (-bArr[i8])) - 10;
                i4 = i7;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.material.circularreveal.CircularRevealHelper.$$d
            int r7 = r7 * 31
            int r1 = 69 - r7
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r6 = r6 * 68
            int r6 = 72 - r6
            byte[] r1 = new byte[r1]
            int r7 = 68 - r7
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.CircularRevealHelper.d(short, byte, byte, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
        int i5 = $10 + 73;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $10 + 93;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8328), 1235 - (ViewConfiguration.getEdgeSlop() >> 16), View.getDefaultSize(0, 0) + 35, -653973969, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myTid() >> 22), ImageFormat.getBitsPerPixel(0) + 2765, TextUtils.getTrimmedLength("") + 14, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 254, TextUtils.indexOf("", "", 0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char fadingEdgeLength = (char) (65200 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int packedPositionType = 2891 - ExpandableListView.getPackedPositionType(0L);
                    int i9 = 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    String str$$g = $$g(b6, b7, (byte) (b7 + 1));
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, packedPositionType, i9, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = i2;
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

    static {
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        STRATEGY = 2;
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        b = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(Delegate delegate) {
        this.delegate = delegate;
        View view = (View) delegate;
        this.view = view;
        view.setWillNotDraw(false);
        this.revealPath = new Path();
        this.revealPaint = new Paint(7);
        Paint paint = new Paint(1);
        this.scrimPaint = paint;
        paint.setColor(0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040 A[PHI: r1
  0x0040: PHI (r1v7 android.graphics.Bitmap) = (r1v6 android.graphics.Bitmap), (r1v14 android.graphics.Bitmap) binds: [B:12:0x003e, B:9:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    public void buildCircularRevealCache() {
        Bitmap drawingCache;
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 5;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (STRATEGY == 0) {
            int i4 = i2 + 65;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                this.buildingCircularRevealCache = false;
                this.hasCircularRevealCache = false;
                this.view.buildDrawingCache();
                drawingCache = this.view.getDrawingCache();
                if (drawingCache == null) {
                    if (this.view.getWidth() != 0) {
                        int i5 = asBinder + 25;
                        g = i5 % 128;
                        int i6 = i5 % 2;
                        if (this.view.getHeight() != 0) {
                            drawingCache = Bitmap.createBitmap(this.view.getWidth(), this.view.getHeight(), Bitmap.Config.ARGB_8888);
                            this.view.draw(new Canvas(drawingCache));
                        }
                    }
                }
            } else {
                this.buildingCircularRevealCache = true;
                this.hasCircularRevealCache = false;
                this.view.buildDrawingCache();
                drawingCache = this.view.getDrawingCache();
                if (drawingCache == null) {
                    if (this.view.getWidth() != 0) {
                        int i7 = asBinder + 25;
                        g = i7 % 128;
                        int i8 = i7 % 2;
                        if (this.view.getHeight() != 0) {
                            drawingCache = Bitmap.createBitmap(this.view.getWidth(), this.view.getHeight(), Bitmap.Config.ARGB_8888);
                            this.view.draw(new Canvas(drawingCache));
                        }
                    }
                }
            }
            if (drawingCache != null) {
                Paint paint = this.revealPaint;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.buildingCircularRevealCache = false;
            this.hasCircularRevealCache = true;
        }
    }

    public void destroyCircularRevealCache() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (STRATEGY == 0) {
            int i4 = i3 + 121;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            this.hasCircularRevealCache = false;
            this.view.destroyDrawingCache();
            this.revealPaint.setShader(null);
            this.view.invalidate();
        }
    }

    public void setRevealInfo(CircularRevealWidget.RevealInfo revealInfo) {
        int i = 2 % 2;
        int i2 = g + 77;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (revealInfo == null) {
            this.revealInfo = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = this.revealInfo;
            if (revealInfo2 == null) {
                this.revealInfo = new CircularRevealWidget.RevealInfo(revealInfo);
                int i3 = g + 43;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            } else {
                revealInfo2.set(revealInfo);
            }
            if (!(!MathUtils.geq(revealInfo.radius, getDistanceToFurthestCorner(revealInfo), 1.0E-4f))) {
                this.revealInfo.radius = Float.MAX_VALUE;
            }
        }
        invalidateRevealInfo();
    }

    public CircularRevealWidget.RevealInfo getRevealInfo() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo = new CircularRevealWidget.RevealInfo(this.revealInfo);
        if (revealInfo.isInvalid()) {
            revealInfo.radius = getDistanceToFurthestCorner(revealInfo);
        }
        int i3 = asBinder + 109;
        g = i3 % 128;
        int i4 = i3 % 2;
        return revealInfo;
    }

    public void setCircularRevealScrimColor(int i) {
        int i2 = 2 % 2;
        int i3 = g + 87;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.scrimPaint.setColor(i);
        this.view.invalidate();
        int i5 = g + 71;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getCircularRevealScrimColor() {
        int i = 2 % 2;
        int i2 = g + 41;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.scrimPaint.getColor();
            obj.hashCode();
            throw null;
        }
        int color = this.scrimPaint.getColor();
        int i3 = g + 77;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return color;
        }
        throw null;
    }

    public Drawable getCircularRevealOverlayDrawable() {
        int i = 2 % 2;
        int i2 = g + 91;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Drawable drawable = this.overlayDrawable;
        int i5 = i3 + 43;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return drawable;
        }
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        this.overlayDrawable = drawable;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 921;
            int i2 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[7], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, iNormalizeMetaState, i2, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{59874, 40379, 2729, 58422}, new char[]{5521, 32591, 7928, 60572}, (char) Drawable.resolveOpacity(0, 0), Color.green(0), new char[]{46744, 45517, 58444, 45651, 38750, 28002, 1102, 59697, 4906, 44390, 30883, 38538, 49973, 14209, 57851, 61033, 42701, 7577, 4056, 22895, 9072, 29770}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{59874, 40379, 2729, 58422}, new char[]{53518, 43885, 51622, 45294}, (char) (Color.blue(0) + 61129), TextUtils.indexOf((CharSequence) "", '0') - 1498714670, new char[]{19188, 23342, 52116, 54059, 13064, 54182, 38874, 42485, 46691, 6076, 13328, 24058, 38200, 48168, 29294}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
            int i3 = 921 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(b3, b3, (byte) ($$b | 20), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i3, maximumFlingVelocity, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asBinder + 43;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 28;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                byte b5 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, iResolveSizeAndState, packedPositionGroup, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~((-834736193) | iIdentityHashCode);
            int i7 = ~iIdentityHashCode;
            int i8 = (-1223147536) + ((i6 | (~((-33563665) | i7))) * 497) + (((~(iIdentityHashCode | (-33563665))) | (~((-905779788) | i7)) | 71043595) * 497) + 1009376598;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{59874, 40379, 2729, 58422}, new char[]{45918, 40355, 14990, 58990}, (char) (28218 - Color.green(0)), KeyEvent.keyCodeFromString(""), new char[]{53803, 40555, 62849, 11323, 33908, 56291, 27299, 41871, 18954, 45748, 54453, 52112, 27787, 5903, 24870, 46778, 12564, 15836, 32412, 36559, 18748, 56832, 34464, 43293, 40927, 14798}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{59874, 40379, 2729, 58422}, new char[]{61017, 37582, 29351, 50821}, (char) (34163 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{14402, 59836, 25520, 53373, 22891, 23266, 42272, 59026, 33425, 27265, 25, 7337, 50894, 25359, 12987, 10053, 22968, 57292}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{59874, 40379, 2729, 58422}, new char[]{44658, 9536, 19778, 1013}, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 62797), TextUtils.getOffsetAfter("", 0), new char[]{3168, 10130, 54447, 30604, 10220, 62045, 48991, 43702, 33810, 29313, 59281, 37646, 29599, 37397, 61478, 54453}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{59874, 40379, 2729, 58422}, new char[]{32174, 62033, 8238, 11816}, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10272), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{38440, 21940, 6221, 41808, 17879, 38769, 3533, 17304, 32325, 18361, 13887, 30887, 19753, 57863, 11565, 30407}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1009376598};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[5];
                Object[] objArr13 = new Object[1];
                d(b6, bArr3[0], b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[0];
                Object[] objArr14 = new Object[1];
                d(b7, bArr3[5], b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetAfter = (char) (31533 - TextUtils.getOffsetAfter("", 0));
                    int i11 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iRed = 28 - Color.red(0);
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[7];
                    byte b9 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    a(b8, b9, (byte) (b9 | 37), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, i11, iRed, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{59874, 40379, 2729, 58422}, new char[]{5521, 32591, 7928, 60572}, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1) - TextUtils.lastIndexOf("", '0', 0), new char[]{46744, 45517, 58444, 45651, 38750, 28002, 1102, 59697, 4906, 44390, 30883, 38538, 49973, 14209, 57851, 61033, 42701, 7577, 4056, 22895, 9072, 29770}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{59874, 40379, 2729, 58422}, new char[]{53518, 43885, 51622, 45294}, (char) (61129 - KeyEvent.getDeadChar(0, 0)), (-1498714672) + (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{19188, 23342, 52116, 54059, 13064, 54182, 38874, 42485, 46691, 6076, 13328, 24058, 38200, 48168, 29294}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char bitsPerPixel = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 921;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                        byte b10 = $$a[7];
                        Object[] objArr19 = new Object[1];
                        a(b10, b10, (byte) ($$b | 20), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, maxKeyCode, longPressTimeout, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int iGreen = 921 - Color.green(0);
                        int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        a(b11, bArr5[7], b11, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iGreen, iIndexOf, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i15 = ~iIdentityHashCode2;
            int i16 = i14 + (-1586691025) + (((~((-1424738923) | i15)) | (-349340722) | (~(1424738922 | iIdentityHashCode2))) * (-564)) + ((~(iIdentityHashCode2 | (-1049618))) * 1128) + (((~((-349340722) | i15)) | (-1425788540)) * 564);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i19 = 0;
                while (i19 < strArr.length) {
                    int i20 = g + 57;
                    asBinder = i20 % 128;
                    if (i20 % 2 == 0) {
                        arrayList.add(strArr[i19]);
                        i19 += 55;
                    } else {
                        arrayList.add(strArr[i19]);
                        i19++;
                    }
                    int i21 = g + 103;
                    asBinder = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
            int[] iArr = new int[i13];
            int i23 = i13 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i25 = i24 + (-398041160) + (((~((-617520924) | iIdentityHashCode3)) | 80645888) * 345) + (((~((-617520924) | (~iIdentityHashCode3))) | 1075912832) * 345) + ((~(iIdentityHashCode3 | (-80645889))) * 345);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr22[0])[0] = i27 ^ (i27 << 5);
        }
        this.view.invalidate();
    }

    private void invalidateRevealInfo() {
        int i = 2 % 2;
        if (STRATEGY == 1) {
            int i2 = g + 71;
            asBinder = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.revealPath.rewind();
                throw null;
            }
            this.revealPath.rewind();
            CircularRevealWidget.RevealInfo revealInfo = this.revealInfo;
            if (revealInfo != null) {
                int i3 = asBinder + 61;
                g = i3 % 128;
                if (i3 % 2 != 0) {
                    this.revealPath.addCircle(revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, Path.Direction.CW);
                    obj.hashCode();
                    throw null;
                }
                this.revealPath.addCircle(revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, Path.Direction.CW);
            }
        }
        this.view.invalidate();
        int i4 = asBinder + 19;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }

    private float getDistanceToFurthestCorner(CircularRevealWidget.RevealInfo revealInfo) {
        int i = 2 % 2;
        int i2 = g + 43;
        asBinder = i2 % 128;
        float fDistanceToFurthestCorner = i2 % 2 == 0 ? MathUtils.distanceToFurthestCorner(revealInfo.centerX, revealInfo.centerY, 2.0f, 0.0f, this.view.getWidth(), this.view.getHeight()) : MathUtils.distanceToFurthestCorner(revealInfo.centerX, revealInfo.centerY, 0.0f, 0.0f, this.view.getWidth(), this.view.getHeight());
        int i3 = g + 103;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return fDistanceToFurthestCorner;
    }

    public void draw(Canvas canvas) {
        int i = 2 % 2;
        if (shouldDrawCircularReveal()) {
            int i2 = g + 43;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int i4 = STRATEGY;
            if (i4 == 0) {
                canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.revealPaint);
                if (shouldDrawScrim()) {
                    canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.scrimPaint);
                    int i5 = asBinder + 61;
                    g = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else if (i4 == 1) {
                int iSave = canvas.save();
                canvas.clipPath(this.revealPath);
                this.delegate.actualDraw(canvas);
                if (shouldDrawScrim()) {
                    canvas.drawRect(0.0f, 0.0f, this.view.getWidth(), this.view.getHeight(), this.scrimPaint);
                }
                canvas.restoreToCount(iSave);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("Unsupported strategy ".concat(String.valueOf(i4)));
                }
                this.delegate.actualDraw(canvas);
                if (shouldDrawScrim()) {
                    int i7 = asBinder + 73;
                    g = i7 % 128;
                    int i8 = i7 % 2;
                    canvas.drawRect(0.0f, 0.0f, this.view.getWidth(), this.view.getHeight(), this.scrimPaint);
                }
            }
        } else {
            this.delegate.actualDraw(canvas);
            if (!(!shouldDrawScrim())) {
                canvas.drawRect(0.0f, 0.0f, this.view.getWidth(), this.view.getHeight(), this.scrimPaint);
            }
        }
        drawOverlayDrawable(canvas);
    }

    private void drawOverlayDrawable(Canvas canvas) {
        int i = 2 % 2;
        if (shouldDrawOverlayDrawable()) {
            int i2 = g + 47;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Rect bounds = this.overlayDrawable.getBounds();
            float fWidth = this.revealInfo.centerX - (bounds.width() / 2.0f);
            float fHeight = this.revealInfo.centerY - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.overlayDrawable.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
        int i4 = g + 45;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean isOpaque() {
        int i = 2 % 2;
        int i2 = g + 73;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            this.delegate.actualIsOpaque();
            throw null;
        }
        if (!this.delegate.actualIsOpaque() || shouldDrawCircularReveal()) {
            return false;
        }
        int i3 = asBinder + 109;
        g = i3 % 128;
        return i3 % 2 == 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    private boolean shouldDrawCircularReveal() {
        boolean z;
        int i = 2 % 2;
        int i2 = g + 103;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        CircularRevealWidget.RevealInfo revealInfo = this.revealInfo;
        if (revealInfo != null) {
            int i5 = i3 + 5;
            g = i5 % 128;
            int i6 = i5 % 2;
            if (revealInfo.isInvalid()) {
                z = true;
            } else {
                int i7 = g + 13;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                z = false;
            }
        } else {
            z = true;
        }
        if (STRATEGY == 0) {
            return (z || (this.hasCircularRevealCache ^ true)) ? false : true;
        }
        return !z;
    }

    private boolean shouldDrawScrim() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        if (this.buildingCircularRevealCache) {
            return false;
        }
        int i5 = i3 + 17;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            Color.alpha(this.scrimPaint.getColor());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (Color.alpha(this.scrimPaint.getColor()) == 0) {
            return false;
        }
        int i6 = asBinder + 97;
        g = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private boolean shouldDrawOverlayDrawable() {
        int i = 2 % 2;
        if (this.buildingCircularRevealCache || this.overlayDrawable == null) {
            return false;
        }
        int i2 = asBinder;
        int i3 = i2 + 115;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.revealInfo == null) {
            return false;
        }
        int i4 = i2 + 3;
        g = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 + 9;
        g = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    private void drawDebugMode(Canvas canvas) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            this.delegate.actualDraw(canvas);
            int i3 = 32 / 0;
            if (shouldDrawScrim()) {
                canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.scrimPaint);
            }
        } else {
            this.delegate.actualDraw(canvas);
            if (shouldDrawScrim()) {
                canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.scrimPaint);
            }
        }
        if (shouldDrawCircularReveal()) {
            int i4 = g + 89;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            drawDebugCircle(canvas, ViewCompat.MEASURED_STATE_MASK, 10.0f);
            drawDebugCircle(canvas, SupportMenu.CATEGORY_MASK, 5.0f);
        }
        drawOverlayDrawable(canvas);
        int i6 = asBinder + 91;
        g = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private void drawDebugCircle(Canvas canvas, int i, float f) {
        int i2 = 2 % 2;
        int i3 = g + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.debugPaint.setColor(i);
        this.debugPaint.setStrokeWidth(f);
        canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius - (f / 2.0f), this.debugPaint);
        int i5 = g + 23;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = 4848379923833711827L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, byte r6, short r7) {
        /*
            byte[] r0 = com.google.android.material.circularreveal.CircularRevealHelper.$$c
            int r7 = 104 - r7
            int r5 = r5 * 4
            int r5 = 3 - r5
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r5 = r5 + 1
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.CircularRevealHelper.$$g(byte, byte, short):java.lang.String");
    }
}
