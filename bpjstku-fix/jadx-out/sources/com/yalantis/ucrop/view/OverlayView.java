package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.yalantis.ucrop.R;
import com.yalantis.ucrop.callback.OverlayViewChangeListener;
import com.yalantis.ucrop.util.RectUtils;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class OverlayView extends View {
    public static final boolean DEFAULT_CIRCLE_DIMMED_LAYER = false;
    public static final int DEFAULT_CROP_GRID_COLUMN_COUNT = 2;
    public static final int DEFAULT_CROP_GRID_ROW_COUNT = 2;
    public static final int DEFAULT_FREESTYLE_CROP_MODE = 0;
    public static final boolean DEFAULT_SHOW_CROP_FRAME = true;
    public static final boolean DEFAULT_SHOW_CROP_GRID = true;
    public static final int FREESTYLE_CROP_MODE_DISABLE = 0;
    public static final int FREESTYLE_CROP_MODE_ENABLE = 1;
    public static final int FREESTYLE_CROP_MODE_ENABLE_WITH_PASS_THROUGH = 2;
    private OverlayViewChangeListener mCallback;
    private boolean mCircleDimmedLayer;
    private Path mCircularPath;
    private Paint mCropFrameCornersPaint;
    private Paint mCropFramePaint;
    protected float[] mCropGridCenter;
    private int mCropGridColumnCount;
    protected float[] mCropGridCorners;
    private Paint mCropGridPaint;
    private int mCropGridRowCount;
    private int mCropRectCornerTouchAreaLineLength;
    private int mCropRectMinSize;
    private final RectF mCropViewRect;
    private int mCurrentTouchCornerIndex;
    private int mDimmedColor;
    private Paint mDimmedStrokePaint;
    private int mFreestyleCropMode;
    private float[] mGridPoints;
    private float mPreviousTouchX;
    private float mPreviousTouchY;
    private boolean mShouldSetupCropBounds;
    private boolean mShowCropFrame;
    private boolean mShowCropGrid;
    private float mTargetAspectRatio;
    private final RectF mTempRect;
    protected int mThisHeight;
    protected int mThisWidth;
    private int mTouchPointThreshold;
    private static final byte[] $$c = {91, -17, 90, 37};
    private static final int $$f = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, 31, 20, 1, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -40, -19, -23, 7, -9, 3, 32, -48, -2, -7, 11, -23, 76, -17, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
    private static final int $$e = 137;
    private static final byte[] $$a = {63, 56, -36, -117, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 66;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60063, 60048, 60034, 60046, 60040, 60088, 60045, 60056, 60079, 60054, 60073, 60058, 60072, 60062, 60053, 60052, 60047, 59745, 60050, 60041, 60055, 60117, 60043, 60090, 60051};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57188;

    /* JADX INFO: loaded from: classes5.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.yalantis.ucrop.view.OverlayView.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = r8 + 1
            int r9 = r9 * 52
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-10)
            int r7 = r7 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.view.OverlayView.a(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 38
            int r7 = 42 - r7
            int r6 = r6 * 14
            int r0 = r6 + 39
            int r8 = r8 * 13
            int r8 = r8 + 84
            byte[] r1 = com.yalantis.ucrop.view.OverlayView.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 38
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L31:
            int r7 = r7 + 1
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-4)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.view.OverlayView.d(int, short, byte, java.lang.Object[]):void");
    }

    public OverlayView(Context context) {
        this(context, null);
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCropViewRect = new RectF();
        this.mTempRect = new RectF();
        this.mGridPoints = null;
        this.mCircularPath = new Path();
        this.mDimmedStrokePaint = new Paint(1);
        this.mCropGridPaint = new Paint(1);
        this.mCropFramePaint = new Paint(1);
        this.mCropFrameCornersPaint = new Paint(1);
        this.mFreestyleCropMode = 0;
        this.mPreviousTouchX = -1.0f;
        this.mPreviousTouchY = -1.0f;
        this.mCurrentTouchCornerIndex = -1;
        this.mTouchPointThreshold = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.mCropRectMinSize = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.mCropRectCornerTouchAreaLineLength = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        init();
    }

    public OverlayViewChangeListener getOverlayViewChangeListener() {
        int i = 2 % 2;
        int i2 = b + 9;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.mCallback;
        }
        throw null;
    }

    public void setOverlayViewChangeListener(OverlayViewChangeListener overlayViewChangeListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.mCallback = overlayViewChangeListener;
        if (i3 != 0) {
            throw null;
        }
    }

    public RectF getCropViewRect() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 77;
        b = i3 % 128;
        int i4 = i3 % 2;
        RectF rectF = this.mCropViewRect;
        int i5 = i2 + 105;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return rectF;
        }
        throw null;
    }

    @Deprecated
    public boolean isFreestyleCropEnabled() {
        int i = 2 % 2;
        int i2 = b + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        if (this.mFreestyleCropMode != 1) {
            return false;
        }
        int i5 = i3 + 79;
        b = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.mFreestyleCropMode = z ? 1 : 0;
        int i5 = i3 + 11;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getFreestyleCropMode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.mFreestyleCropMode;
        int i6 = i2 + 59;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public void setFreestyleCropMode(int i) {
        int i2 = 2 % 2;
        int i3 = b + 115;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.mFreestyleCropMode = i;
        postInvalidate();
        int i5 = b + 97;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setCircleDimmedLayer(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.mCircleDimmedLayer = z;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object obj2 = null;
        int i4 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> i4), (ViewConfiguration.getTapTimeout() >> 16) + 2267, (ViewConfiguration.getTapTimeout() >> 16) + 33, -1927765101, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 8;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = (byte) (b5 - 1);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 33, -1927765101, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $11 + 121;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i8 = $11 + 95;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b >> b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49266), Color.alpha(0) + 3261, 30 - ExpandableListView.getPackedPositionType(0L), -127612708, false, $$g(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 22878), 594 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, 1570859318, false, $$g(b9, b10, (byte) (b10 + 4)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i10 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i10];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                            int i12 = $10 + 101;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                        } else {
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i16 = $10 + 79;
        $11 = i16 % 128;
        int i17 = i16 % 2;
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public void setCropGridRowCount(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = b + 119;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.mCropGridRowCount = i;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
            int i5 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, i5, edgeSlop, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{'\f', '\n', 4, 15, 16, 19, 1, 20, 19, 0, 22, 11, 3, 0, 18, 11, 5, 6, 0, 20, 6, 2}, (byte) (101 - MotionEvent.axisFromString("")), View.MeasureSpec.makeMeasureSpec(0, 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{'\n', 23, '\f', 21, 3, 14, 5, 15, 14, '\f', 21, 15, 19, '\b', 13864}, (byte) ((-16777175) - Color.rgb(0, 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
            int mirror = 969 - AndroidCharacter.getMirror('0');
            int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[7], (byte) 52, bArr[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, mirror, iKeyCodeFromString, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = b + 83;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int offsetBefore = 921 - TextUtils.getOffsetBefore("", 0);
                int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b5, (byte) (b5 | 36), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, offsetBefore, i8, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i9 = ~i;
            int i10 = (((~((-269495811) | i9)) | (~(1023229527 | i))) * 988) + 328111123 + (((~(i | (-1020345927))) | 750850116 | (~(i9 | 1023229527))) * 988) + 1010272586;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{'\f', '\n', 4, 15, 16, 19, 1, 20, '\f', 21, 23, 22, 22, '\b', 17, 19, '\b', 16, 17, 1, '\t', 23, 18, 14, '\n', 1}, (byte) (TextUtils.getOffsetAfter("", 0) + 53), TextUtils.indexOf((CharSequence) "", '0') + 27, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{'\b', 2, 13808, 13808, 14, '\n', 18, 21, 13810, 13810, 23, 15, 6, '\f', 17, 19, 19, '\n'}, (byte) (9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Process.myTid() >> 22) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i13 = b + 43;
                TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                int i14 = i13 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, 1010272586};
                byte[] bArr2 = $$d;
                byte b6 = bArr2[79];
                byte b7 = bArr2[3];
                Object[] objArr11 = new Object[1];
                d(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr2[3];
                byte b9 = bArr2[79];
                Object[] objArr12 = new Object[1];
                d(b8, b9, b9, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                    int bitsPerPixel = 920 - ImageFormat.getBitsPerPixel(0);
                    int i15 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27;
                    byte b10 = $$a[7];
                    byte b11 = b10;
                    Object[] objArr13 = new Object[1];
                    a(b11, (byte) (b11 | 36), b10, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, bitsPerPixel, i15, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{'\f', '\n', 4, 15, 16, 19, 1, 20, 19, 0, 22, 11, 3, 0, 18, 11, 5, 6, 0, 20, 6, 2}, (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 102), 22 - Color.red(0), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{'\n', 23, '\f', 21, 3, 14, 5, 15, 14, '\f', 21, 15, 19, '\b', 13864}, (byte) (41 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 15 - (ViewConfiguration.getEdgeSlop() >> 16), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
                        int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr3[7], (byte) 52, bArr3[80], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf, capsMode, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 31533);
                        int iKeyCodeFromString2 = 921 - KeyEvent.keyCodeFromString("");
                        int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b12 = $$a[80];
                        byte b13 = b12;
                        Object[] objArr17 = new Object[1];
                        a(b12, b13, b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, iKeyCodeFromString2, packedPositionGroup, -1048449946, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 != i16) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i18 = TuitionPaymentFragmentbindingInflater1 + 123;
                b = i18 % 128;
                int i19 = i18 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i17));
        }
        int i20 = ((int[]) objArr[0])[0];
        Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i21 = i20 + 2147379739 + (((~((-1446979660) | iIdentityHashCode)) | 327099984) * (-366)) + (((~(iIdentityHashCode | (-1140852748))) | 20973072) * 366);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr18[0])[0] = i23 ^ (i23 << 5);
        int i24 = b + 105;
        TuitionPaymentFragmentbindingInflater1 = i24 % 128;
        if (i24 % 2 == 0) {
            this.mGridPoints = null;
            throw null;
        }
        this.mGridPoints = null;
    }

    public void setCropGridColumnCount(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 85;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.mCropGridColumnCount = i;
        this.mGridPoints = null;
        int i6 = i4 + 23;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 87 / 0;
        }
    }

    public void setShowCropFrame(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 51;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.mShowCropFrame = z;
        int i5 = i2 + 79;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setShowCropGrid(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 99;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.mShowCropGrid = z;
        int i5 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setDimmedColor(int i) {
        int i2 = 2 % 2;
        int i3 = b + 85;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.mDimmedColor = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCropFrameStrokeWidth(int i) {
        int i2 = 2 % 2;
        int i3 = b + 109;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.mCropFramePaint.setStrokeWidth(i);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 23;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setCropGridStrokeWidth(int i) {
        int i2 = 2 % 2;
        int i3 = b + 59;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.mCropGridPaint.setStrokeWidth(i);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 69;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setCropFrameColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 71;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.mCropFramePaint.setColor(i);
        int i5 = b + 123;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setCropGridColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 79;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.mCropGridPaint.setColor(i);
        if (i4 != 0) {
            throw null;
        }
    }

    public void setTargetAspectRatio(float f) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 7;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.mTargetAspectRatio = f;
        if (this.mThisWidth > 0) {
            int i5 = i2 + 25;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            setupCropBounds();
            postInvalidate();
            return;
        }
        this.mShouldSetupCropBounds = true;
    }

    public void setupCropBounds() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.mThisWidth;
        float f = this.mTargetAspectRatio;
        int i5 = (int) (i4 / f);
        int i6 = this.mThisHeight;
        if (i5 > i6) {
            int i7 = (int) (i6 * f);
            int i8 = (i4 - i7) / 2;
            this.mCropViewRect.set(getPaddingLeft() + i8, getPaddingTop(), getPaddingLeft() + i7 + i8, getPaddingTop() + this.mThisHeight);
        } else {
            int i9 = (i6 - i5) / 2;
            this.mCropViewRect.set(getPaddingLeft(), getPaddingTop() + i9, getPaddingLeft() + this.mThisWidth, getPaddingTop() + i5 + i9);
            int i10 = TuitionPaymentFragmentbindingInflater1 + 33;
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
        if (overlayViewChangeListener != null) {
            int i12 = b + 109;
            TuitionPaymentFragmentbindingInflater1 = i12 % 128;
            if (i12 % 2 == 0) {
                overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
        }
        updateGridPoints();
    }

    private void updateGridPoints() {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.mCropGridCorners = RectUtils.getCornersFromRect(this.mCropViewRect);
        this.mCropGridCenter = RectUtils.getCenterFromRect(this.mCropViewRect);
        this.mGridPoints = null;
        this.mCircularPath.reset();
        this.mCircularPath.addCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, Path.Direction.CW);
        int i4 = b + 3;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentbindingInflater1 + 59;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            super.onLayout(z, i, i2, i3, i4);
            int i7 = 94 / 0;
            if (!z) {
                return;
            }
        } else {
            super.onLayout(z, i, i2, i3, i4);
            if (!z) {
                return;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth();
        int paddingRight = getPaddingRight();
        int height = getHeight();
        int paddingBottom = getPaddingBottom();
        this.mThisWidth = (width - paddingRight) - paddingLeft;
        this.mThisHeight = (height - paddingBottom) - paddingTop;
        if (this.mShouldSetupCropBounds) {
            int i8 = b + 89;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            if (i8 % 2 == 0) {
                this.mShouldSetupCropBounds = false;
            } else {
                this.mShouldSetupCropBounds = false;
            }
            setTargetAspectRatio(this.mTargetAspectRatio);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = b + 105;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        super.onDraw(canvas);
        drawDimmedLayer(canvas);
        drawCropGrid(canvas);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 101;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        if (!this.mCropViewRect.isEmpty()) {
            int i2 = b + 79;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.mFreestyleCropMode != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if ((motionEvent.getAction() & 255) == 0) {
                    int i3 = b + 63;
                    TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.mCurrentTouchCornerIndex = getCurrentTouchIndex(x, y);
                        throw null;
                    }
                    int currentTouchIndex = getCurrentTouchIndex(x, y);
                    this.mCurrentTouchCornerIndex = currentTouchIndex;
                    if (currentTouchIndex == -1) {
                        this.mPreviousTouchX = -1.0f;
                        this.mPreviousTouchY = -1.0f;
                        return false;
                    }
                    int i4 = b + 19;
                    TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                    int i5 = i4 % 2;
                    if (this.mPreviousTouchX < 0.0f) {
                        this.mPreviousTouchX = x;
                        this.mPreviousTouchY = y;
                    }
                    return true;
                }
                if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1) {
                    int i6 = TuitionPaymentFragmentbindingInflater1 + 23;
                    b = i6 % 128;
                    if (i6 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (this.mCurrentTouchCornerIndex != -1) {
                        float fMin = Math.min(Math.max(x, getPaddingLeft()), getWidth() - getPaddingRight());
                        float fMin2 = Math.min(Math.max(y, getPaddingTop()), getHeight() - getPaddingBottom());
                        updateCropViewRect(fMin, fMin2);
                        this.mPreviousTouchX = fMin;
                        this.mPreviousTouchY = fMin2;
                        return true;
                    }
                }
                if ((motionEvent.getAction() & 255) == 1) {
                    int i7 = TuitionPaymentFragmentbindingInflater1 + 17;
                    b = i7 % 128;
                    if (i7 % 2 != 0) {
                        this.mPreviousTouchX = -1.0f;
                        this.mPreviousTouchY = -1.0f;
                        this.mCurrentTouchCornerIndex = -1;
                        throw null;
                    }
                    this.mPreviousTouchX = -1.0f;
                    this.mPreviousTouchY = -1.0f;
                    this.mCurrentTouchCornerIndex = -1;
                    OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
                    if (overlayViewChangeListener != null) {
                        overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
                    }
                }
            }
        }
        return false;
    }

    private void updateCropViewRect(float f, float f2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.mTempRect.set(this.mCropViewRect);
        int i4 = this.mCurrentTouchCornerIndex;
        if (i4 == 0) {
            this.mTempRect.set(f, f2, this.mCropViewRect.right, this.mCropViewRect.bottom);
        } else if (i4 != 1) {
            int i5 = b + 43;
            int i6 = i5 % 128;
            TuitionPaymentFragmentbindingInflater1 = i6;
            if (i5 % 2 != 0 ? i4 == 2 : i4 == 5) {
                this.mTempRect.set(this.mCropViewRect.left, this.mCropViewRect.top, f, f2);
            } else if (i4 == 3) {
                this.mTempRect.set(f, this.mCropViewRect.top, this.mCropViewRect.right, f2);
                int i7 = b + 61;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
            } else if (i4 == 4) {
                int i9 = i6 + 101;
                b = i9 % 128;
                int i10 = i9 % 2;
                this.mTempRect.offset(f - this.mPreviousTouchX, f2 - this.mPreviousTouchY);
                if (this.mTempRect.left <= getLeft() || this.mTempRect.top <= getTop()) {
                    return;
                }
                int i11 = b + 109;
                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                int i12 = i11 % 2;
                if (this.mTempRect.right >= getRight() || this.mTempRect.bottom >= getBottom()) {
                    return;
                }
                int i13 = b + 77;
                TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                if (i13 % 2 != 0) {
                    this.mCropViewRect.set(this.mTempRect);
                    updateGridPoints();
                    postInvalidate();
                    return;
                } else {
                    this.mCropViewRect.set(this.mTempRect);
                    updateGridPoints();
                    postInvalidate();
                    int i14 = 85 / 0;
                    return;
                }
            }
        } else {
            this.mTempRect.set(this.mCropViewRect.left, f2, f, this.mCropViewRect.bottom);
        }
        boolean z = this.mTempRect.height() >= ((float) this.mCropRectMinSize);
        boolean z2 = this.mTempRect.width() >= ((float) this.mCropRectMinSize);
        RectF rectF = this.mCropViewRect;
        rectF.set(z2 ? this.mTempRect.left : rectF.left, (!(z ^ true) ? this.mTempRect : this.mCropViewRect).top, (!z2 ? this.mCropViewRect : this.mTempRect).right, (z ? this.mTempRect : this.mCropViewRect).bottom);
        if (z || z2) {
            updateGridPoints();
            postInvalidate();
        }
    }

    private int getCurrentTouchIndex(float f, float f2) {
        int i = 2 % 2;
        double d = this.mTouchPointThreshold;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3 += 2) {
            int i4 = b + 75;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            double dSqrt = Math.sqrt(Math.pow(f - this.mCropGridCorners[i3], 2.0d) + Math.pow(f2 - this.mCropGridCorners[i3 + 1], 2.0d));
            if (dSqrt < d) {
                i2 = i3 / 2;
                d = dSqrt;
            }
        }
        Object obj = null;
        if (this.mFreestyleCropMode == 1) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 81;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i2 < 0 && this.mCropViewRect.contains(f, f2)) {
                return 4;
            }
        }
        int i7 = TuitionPaymentFragmentbindingInflater1 + 49;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    protected void drawDimmedLayer(Canvas canvas) {
        int i = 2 % 2;
        canvas.save();
        if (this.mCircleDimmedLayer) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                canvas.clipPath(this.mCircularPath, Region.Op.DIFFERENCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            canvas.clipPath(this.mCircularPath, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.mCropViewRect, Region.Op.DIFFERENCE);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 113;
            b = i3 % 128;
            int i4 = i3 % 2;
        }
        canvas.drawColor(this.mDimmedColor);
        canvas.restore();
        if (!(!this.mCircleDimmedLayer)) {
            canvas.drawCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, this.mDimmedStrokePaint);
        }
    }

    protected void drawCropGrid(Canvas canvas) {
        int i = 2 % 2;
        if (this.mShowCropGrid) {
            int i2 = b;
            int i3 = i2 + 105;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.mGridPoints == null) {
                int i4 = i2 + 15;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    this.mCropViewRect.isEmpty();
                    throw null;
                }
                if (!this.mCropViewRect.isEmpty()) {
                    this.mGridPoints = new float[(this.mCropGridRowCount * 4) + (this.mCropGridColumnCount * 4)];
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    while (i7 < this.mCropGridRowCount) {
                        int i8 = TuitionPaymentFragmentbindingInflater1 + 15;
                        b = i8 % 128;
                        int i9 = i8 % 2;
                        this.mGridPoints[i6] = this.mCropViewRect.left;
                        float f = i7 + 1.0f;
                        this.mGridPoints[i6 + 1] = (this.mCropViewRect.height() * (f / (this.mCropGridRowCount + 1))) + this.mCropViewRect.top;
                        this.mGridPoints[i6 + 2] = this.mCropViewRect.right;
                        this.mGridPoints[i6 + 3] = (this.mCropViewRect.height() * (f / (this.mCropGridRowCount + 1))) + this.mCropViewRect.top;
                        i7++;
                        i6 += 4;
                    }
                    while (i5 < this.mCropGridColumnCount) {
                        int i10 = b + 37;
                        TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                        int i11 = i10 % 2;
                        float f2 = i5 + 1.0f;
                        this.mGridPoints[i6] = (this.mCropViewRect.width() * (f2 / (this.mCropGridColumnCount + 1))) + this.mCropViewRect.left;
                        this.mGridPoints[i6 + 1] = this.mCropViewRect.top;
                        this.mGridPoints[i6 + 2] = (this.mCropViewRect.width() * (f2 / (this.mCropGridColumnCount + 1))) + this.mCropViewRect.left;
                        this.mGridPoints[i6 + 3] = this.mCropViewRect.bottom;
                        i5++;
                        i6 += 4;
                    }
                }
            }
            float[] fArr = this.mGridPoints;
            if (fArr != null) {
                canvas.drawLines(fArr, this.mCropGridPaint);
            }
        }
        if (this.mShowCropFrame) {
            canvas.drawRect(this.mCropViewRect, this.mCropFramePaint);
        }
        if (this.mFreestyleCropMode != 0) {
            canvas.save();
            this.mTempRect.set(this.mCropViewRect);
            RectF rectF = this.mTempRect;
            int i12 = this.mCropRectCornerTouchAreaLineLength;
            rectF.inset(i12, -i12);
            canvas.clipRect(this.mTempRect, Region.Op.DIFFERENCE);
            this.mTempRect.set(this.mCropViewRect);
            RectF rectF2 = this.mTempRect;
            int i13 = this.mCropRectCornerTouchAreaLineLength;
            rectF2.inset(-i13, i13);
            canvas.clipRect(this.mTempRect, Region.Op.DIFFERENCE);
            canvas.drawRect(this.mCropViewRect, this.mCropFrameCornersPaint);
            canvas.restore();
        }
    }

    protected void processStyledAttributes(TypedArray typedArray) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.mCircleDimmedLayer = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R.color.ucrop_color_default_dimmed));
        this.mDimmedColor = color;
        this.mDimmedStrokePaint.setColor(color);
        this.mDimmedStrokePaint.setStyle(Paint.Style.STROKE);
        this.mDimmedStrokePaint.setStrokeWidth(1.0f);
        initCropFrameStyle(typedArray);
        this.mShowCropFrame = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_frame, true);
        initCropGridStyle(typedArray);
        this.mShowCropGrid = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_grid, true);
        int i4 = b + 3;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void initCropFrameStyle(TypedArray typedArray) {
        int i = 2 % 2;
        int i2 = b + 109;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R.color.ucrop_color_default_crop_frame));
        this.mCropFramePaint.setStrokeWidth(dimensionPixelSize);
        this.mCropFramePaint.setColor(color);
        this.mCropFramePaint.setStyle(Paint.Style.STROKE);
        this.mCropFrameCornersPaint.setStrokeWidth(dimensionPixelSize * 3);
        this.mCropFrameCornersPaint.setColor(color);
        this.mCropFrameCornersPaint.setStyle(Paint.Style.STROKE);
        int i4 = b + 17;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void initCropGridStyle(TypedArray typedArray) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
        b = i2 % 128;
        int i3 = i2 % 2;
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R.color.ucrop_color_default_crop_grid));
        this.mCropGridPaint.setStrokeWidth(dimensionPixelSize);
        this.mCropGridPaint.setColor(color);
        this.mCropGridRowCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.mCropGridColumnCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 105;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void init() {
        int i = 2 % 2;
        int i2 = b + 31;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, byte r8) {
        /*
            int r7 = r7 + 4
            int r8 = r8 + 113
            byte[] r0 = com.yalantis.ucrop.view.OverlayView.$$c
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r5 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r7 = r7 + 1
            r3 = r0[r7]
        L24:
            int r8 = r8 + r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.view.OverlayView.$$g(int, short, byte):java.lang.String");
    }
}
