package com.google.android.material.imageview;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {
    private static final int DEF_STYLE_RES;
    private static char[] TuitionPaymentFragmentbindingInflater1 = null;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static final int UNDEFINED_PADDING = Integer.MIN_VALUE;
    private final Paint borderPaint;
    private int bottomContentPadding;
    private final Paint clearPaint;
    private final RectF destination;
    private int endContentPadding;
    private boolean hasAdjustedPaddingAfterLayoutDirectionResolved;
    private int leftContentPadding;
    private Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private final ShapeAppearancePathProvider pathProvider;
    private int rightContentPadding;
    private MaterialShapeDrawable shadowDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    private int startContentPadding;
    private ColorStateList strokeColor;
    private float strokeWidth;
    private int topContentPadding;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 202;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -122, -23, -24, -21, -7, 54, -61, -23, -3, -18, -10, 0, -19, 62, -75, -11, 4, -23, 5, -18, -15, 10, -28, 2, -15, -8, 55, -72, -1, -17, 2, -12, -22, -10, 2, -10, -16, 57, -60, -11, -9, -21, -15, -2, -15, 10, -11, -26, 2, -22, 12, -28, 2, -15, -8, 55, -73, 0, -27, 13, -11, -26, 2, -22, 12, -28, 2, -15, -8, 55, -41, -32, -27, 30, -33, -16, -8, 0, 6, -24, -22, 0, -6, -12, -3, -7, -28, 2, -15, -8, 19, -28, -23, 5, -24, 42, -43, -26, 2, -22, 4, -20, -14, 76, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 56};
    private static final int $$e = 174;
    private static final byte[] $$a = {119, -103, 14, -22, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 64;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f801a = 1;
    private static int b = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.material.imageview.ShapeableImageView.$$a
            int r6 = r6 * 52
            int r6 = 107 - r6
            int r7 = r7 * 15
            int r7 = r7 + 38
            int r8 = r8 * 2
            int r8 = 84 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r6 = r6 + 1
            if (r4 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
        L2b:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.d(byte, byte, int, java.lang.Object[]):void");
    }

    private static void e(byte b2, byte b3, int i, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = i * 87;
        int i3 = 99 - (b2 * 15);
        int i4 = (b3 * 139) + 4;
        byte[] bArr2 = new byte[140 - i2];
        int i5 = 139 - i2;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i3 + (-i4);
            i4++;
            i3 = i7 - 9;
            i6 = -1;
        }
        while (true) {
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i4;
            int i10 = i3 + (-bArr[i4]);
            i4 = i9 + 1;
            i3 = i10 - 9;
            i6 = i8;
        }
    }

    static /* synthetic */ ShapeAppearanceModel access$000(ShapeableImageView shapeableImageView) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 113;
        f801a = i3 % 128;
        int i4 = i3 % 2;
        ShapeAppearanceModel shapeAppearanceModel = shapeableImageView.shapeAppearanceModel;
        int i5 = i2 + 101;
        f801a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return shapeAppearanceModel;
    }

    static /* synthetic */ MaterialShapeDrawable access$100(ShapeableImageView shapeableImageView) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        int i3 = i2 % 128;
        f801a = i3;
        int i4 = i2 % 2;
        MaterialShapeDrawable materialShapeDrawable = shapeableImageView.shadowDrawable;
        int i5 = i3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return materialShapeDrawable;
        }
        throw null;
    }

    static /* synthetic */ MaterialShapeDrawable access$102(ShapeableImageView shapeableImageView, MaterialShapeDrawable materialShapeDrawable) {
        int i = 2 % 2;
        int i2 = f801a;
        int i3 = i2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        shapeableImageView.shadowDrawable = materialShapeDrawable;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return materialShapeDrawable;
    }

    static /* synthetic */ RectF access$200(ShapeableImageView shapeableImageView) {
        int i = 2 % 2;
        int i2 = f801a + 1;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        RectF rectF = shapeableImageView.destination;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 85;
        f801a = i5 % 128;
        int i6 = i5 % 2;
        return rectF;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        b();
        DEF_STYLE_RES = R.style.Widget_MaterialComponents_ShapeableImageView;
        int i = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.pathProvider = ShapeAppearancePathProvider.getInstance();
        this.path = new Path();
        this.hasAdjustedPaddingAfterLayoutDirectionResolved = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.clearPaint = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.destination = new RectF();
        this.maskRect = new RectF();
        this.maskPath = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.ShapeableImageView, i, i2);
        setLayerType(2, null);
        this.strokeColor = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.ShapeableImageView_strokeColor);
        this.strokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPadding, 0);
        this.leftContentPadding = dimensionPixelSize;
        this.topContentPadding = dimensionPixelSize;
        this.rightContentPadding = dimensionPixelSize;
        this.bottomContentPadding = dimensionPixelSize;
        this.leftContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.topContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.rightContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.bottomContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.startContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.endContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.borderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build();
        setOutlineProvider(new OutlineProvider());
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i5 = $10 + 69;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 % 3;
        }
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 99;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            int i9 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i9])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), View.combineMeasuredStates(0, 0) + 2187, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 40, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), AndroidCharacter.getMirror('0') + 2963, 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 321985076, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 36506), (KeyEvent.getMaxKeyCode() >> 16) + 3376, 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i3 = 2;
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
            try {
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (ViewConfiguration.getPressedStateDuration() >> 16)), 3376 - View.resolveSize(0, 0), 17 - KeyEvent.normalizeMetaState(0), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        super.onMeasure(i, i2);
        if (this.hasAdjustedPaddingAfterLayoutDirectionResolved || !isLayoutDirectionResolved()) {
            int i4 = f801a + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.hasAdjustedPaddingAfterLayoutDirectionResolved = true;
        if (isPaddingRelative() || isContentPaddingRelative()) {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            return;
        }
        int i5 = f801a + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        super.onDraw(canvas);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
            int packedPositionType = 2267 - ExpandableListView.getPackedPositionType(0L);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
            byte[] bArr = $$a;
            byte b2 = bArr[132];
            Object[] objArr2 = new Object[1];
            d(b2, b2, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, packedPositionType, iIndexOf, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(Color.argb(0, 0, 0, 0), 22 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(AndroidCharacter.getMirror('0') - 26, 15 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 39426), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int gidForName = 2266 - Process.getGidForName("");
            int offsetBefore = 33 - TextUtils.getOffsetBefore("", 0);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            d(bArr2[37], bArr2[132], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, gidForName, offsetBefore, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            f801a = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2267;
                int mirror = 'Q' - AndroidCharacter.getMirror('0');
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                d(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, maxKeyCode, mirror, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[0])[0];
            int i5 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (~((-745729472) | iIdentityHashCode)) | 4197540;
            int i7 = (-881132397) + (i6 * 992) + ((i6 | (~((~iIdentityHashCode) | 804515775))) * (-496)) + ((iIdentityHashCode | 62983844) * 496) + 413885391;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c((ViewConfiguration.getWindowTouchSlop() >> 8) + 69, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 51778), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(Process.getGidForName("") + 96, 18 - (ViewConfiguration.getTouchSlop() >> 8), (char) (64298 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(TextUtils.indexOf("", "", 0) + 53, 16 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Color.blue(0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            f801a = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 413885391};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[12];
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                e(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[130];
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                e(b7, b8, b8, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                        int iRed = Color.red(0) + 2267;
                        int pressedStateDuration2 = 33 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr15 = new Object[1];
                        d(b9, b10, b10, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, iRed, pressedStateDuration2, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(KeyEvent.getDeadChar(0, 0), 22 - View.combineMeasuredStates(0, 0), (char) TextUtils.getOffsetBefore("", 0), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (39426 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int i12 = 2267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i13 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                            byte[] bArr4 = $$a;
                            Object[] objArr18 = new Object[1];
                            d(bArr4[37], bArr4[132], bArr4[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, i12, i13, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                            int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0', 0);
                            int i14 = 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b11 = bArr5[132];
                            Object[] objArr19 = new Object[1];
                            d(b11, b11, bArr5[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, iLastIndexOf, i14, -887667012, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i15 = ((int[]) objArr[c])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i20 = i17 + (-1753310829) + (((~((-789942089) | startElapsedRealtime)) | 18091272) * 1504) + ((~(startElapsedRealtime | (-771850817))) * (-1504)) + 1122554832;
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr20[2])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i23 = f801a + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                for (int i24 = i23 % 2 != 0 ? 1 : 0; i24 < strArr3.length; i24++) {
                    arrayList.add(strArr3[i24]);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[0])[0];
            int i27 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i28 = ~iIdentityHashCode2;
            int i29 = i25 + (-751218368) + (((~(i28 | 319294871)) | 489418444) * (-1042)) + ((319294871 | iIdentityHashCode2) * 521) + (((~(iIdentityHashCode2 | (-489418445))) | 285740164 | (~(i28 | 522973151))) * 521);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr21[2])[0] = i31 ^ (i31 << 5);
        }
        canvas.drawPath(this.maskPath, this.clearPaint);
        drawStroke(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f801a + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            super.onSizeChanged(i, i2, i3, i4);
            updateShapeMask(i, i2);
        } else {
            super.onSizeChanged(i, i2, i3, i4);
            updateShapeMask(i, i2);
            throw null;
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        f801a = i6 % 128;
        int i7 = i6 % 2;
        this.startContentPadding = Integer.MIN_VALUE;
        this.endContentPadding = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.leftContentPadding) + i, (super.getPaddingTop() - this.topContentPadding) + i2, (super.getPaddingRight() - this.rightContentPadding) + i3, (super.getPaddingBottom() - this.bottomContentPadding) + i4);
        this.leftContentPadding = i;
        this.topContentPadding = i2;
        this.rightContentPadding = i3;
        this.bottomContentPadding = i4;
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        f801a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setContentPaddingRelative(int i, int i2, int i3, int i4) throws Throwable {
        int i5;
        int i6 = 2 % 2;
        int i7 = f801a + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        int i8 = i7 % 2;
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.topContentPadding) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.bottomContentPadding) + i4);
        if (!isRtl()) {
            i5 = i;
        } else {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            f801a = i9 % 128;
            int i10 = i9 % 2;
            i5 = i3;
        }
        this.leftContentPadding = i5;
        this.topContentPadding = i2;
        if (!isRtl()) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            f801a = i11 % 128;
            int i12 = i11 % 2;
            i = i3;
        }
        this.rightContentPadding = i;
        this.bottomContentPadding = i4;
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        f801a = i13 % 128;
        int i14 = i13 % 2;
    }

    private boolean isContentPaddingRelative() {
        int i = 2 % 2;
        if (this.startContentPadding != Integer.MIN_VALUE || this.endContentPadding != Integer.MIN_VALUE) {
            return true;
        }
        int i2 = f801a + 11;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        f801a = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int getContentPaddingBottom() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        f801a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.bottomContentPadding;
        }
        throw null;
    }

    public final int getContentPaddingEnd() {
        int i = 2 % 2;
        int i2 = this.endContentPadding;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (!isRtl()) {
            return this.rightContentPadding;
        }
        int i3 = f801a;
        int i4 = i3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.leftContentPadding;
        int i7 = i3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        f801a = i3 % 128;
        int i4 = i3 % 2;
        if (!(!isContentPaddingRelative())) {
            if (isRtl()) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
                f801a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = this.endContentPadding;
                if (i7 != Integer.MIN_VALUE) {
                    return i7;
                }
            }
            if (!isRtl() && (i = this.startContentPadding) != Integer.MIN_VALUE) {
                return i;
            }
        }
        int i8 = this.leftContentPadding;
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        f801a = i9 % 128;
        if (i9 % 2 != 0) {
            return i8;
        }
        throw null;
    }

    public int getContentPaddingRight() {
        int i;
        int i2 = 2 % 2;
        if (isContentPaddingRelative()) {
            if (isRtl() && (i = this.startContentPadding) != Integer.MIN_VALUE) {
                return i;
            }
            if (!isRtl()) {
                int i3 = f801a + 97;
                int i4 = i3 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
                int i5 = i3 % 2;
                int i6 = this.endContentPadding;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i4 + 113;
                    f801a = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i4 + 117;
                    f801a = i9 % 128;
                    int i10 = i9 % 2;
                    return i6;
                }
            }
        }
        return this.rightContentPadding;
    }

    class OutlineProvider extends ViewOutlineProvider {
        private final Rect rect = new Rect();

        OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.access$000(ShapeableImageView.this) == null) {
                return;
            }
            if (ShapeableImageView.access$100(ShapeableImageView.this) == null) {
                ShapeableImageView.access$102(ShapeableImageView.this, new MaterialShapeDrawable(ShapeableImageView.access$000(ShapeableImageView.this)));
            }
            ShapeableImageView.access$200(ShapeableImageView.this).round(this.rect);
            ShapeableImageView.access$100(ShapeableImageView.this).setBounds(this.rect);
            ShapeableImageView.access$100(ShapeableImageView.this).getOutline(outline);
        }
    }

    public final int getContentPaddingStart() throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        f801a = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getLongPressTimeout() >> 16)), 40 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(ViewConfiguration.getKeyRepeatDelay() >> 16, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) KeyEvent.getDeadChar(0, 0), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(AndroidCharacter.getMirror('0') - 26, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, (char) ((-16737790) - Color.rgb(0, 0, 0)), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -159;
        long j2 = (j * 1947793578850683899L) + (j * 149463595891275088L);
        long j3 = 160;
        long j4 = -1;
        long jMyTid = ((long) Process.myTid()) ^ j4;
        long j5 = j2 + (((j4 ^ 1947793578850683899L) | 149463595891275088L) * j3) + (((long) (-160)) * (((jMyTid | 1947793578850683899L) ^ j4) | (1952297217414905851L ^ j4))) + (j3 * ((((j4 ^ 149463595891275088L) | jMyTid) ^ j4) | 1947793578850683899L));
        int i6 = 0;
        long j6 = jLongValue;
        while (true) {
            if (i6 == 10) {
                Object[] objArr3 = new Object[1];
                c(((byte) KeyEvent.getModifierMetaStateMask()) + 38, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(53 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 16, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-947313525};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 46038), 1134 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1364352747, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int scrollBarSize = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte[] bArr = $$a;
                        Object[] objArr7 = new Object[1];
                        d(bArr[37], bArr[132], bArr[7], objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, scrollBarSize, scrollBarFadeDuration, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.green(0)), 1117 - Gravity.getAbsoluteGravity(0, 0), 17 - (ViewConfiguration.getLongPressTimeout() >> 16)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    int i7 = ((int[]) objArr8[1])[0];
                    int i8 = ((int[]) objArr8[3])[0];
                    if (i8 == i7) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i8));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i9 = f801a + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % i;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37836), 58 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getTouchSlop() >> 8) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i12 = 0;
            long j7 = j6;
            while (true) {
                for (int i13 = 0; i13 != 8; i13++) {
                    i11 = (((((int) (j7 >> i13)) & 255) + (i11 << 6)) + (i11 << 16)) - i11;
                }
                if (i12 != 0) {
                    break;
                }
                i12++;
                j7 = j5;
            }
            if (i11 == i5) {
                break;
            }
            j6 -= 1024;
            i6++;
            i = 2;
        }
        int i14 = this.startContentPadding;
        if (i14 == Integer.MIN_VALUE) {
            return isRtl() ? this.rightContentPadding : this.leftContentPadding;
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        f801a = i15 % 128;
        if (i15 % 2 != 0) {
            return i14;
        }
        throw null;
    }

    public int getContentPaddingTop() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        int i3 = i2 % 128;
        f801a = i3;
        int i4 = i2 % 2;
        int i5 = this.topContentPadding;
        int i6 = i3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    private boolean isRtl() {
        int i = 2 % 2;
        int i2 = f801a + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0 ? getLayoutDirection() == 1 : getLayoutDirection() == 0) {
            return true;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        f801a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 89 / 0;
        }
        return false;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        f801a = i6 % 128;
        int i7 = i6 % 2;
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        f801a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 38 / 0;
        }
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) throws Throwable {
        int i5;
        int i6;
        int contentPaddingEnd;
        int contentPaddingBottom;
        int i7 = 2 % 2;
        int i8 = f801a + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        if (i8 % 2 != 0) {
            int contentPaddingStart = getContentPaddingStart();
            int contentPaddingTop = getContentPaddingTop();
            i5 = i << contentPaddingStart;
            i6 = i2 >>> contentPaddingTop;
            contentPaddingEnd = i3 << getContentPaddingEnd();
            contentPaddingBottom = i4 << getContentPaddingBottom();
        } else {
            int contentPaddingStart2 = getContentPaddingStart();
            int contentPaddingTop2 = getContentPaddingTop();
            i5 = i + contentPaddingStart2;
            i6 = i2 + contentPaddingTop2;
            contentPaddingEnd = i3 + getContentPaddingEnd();
            contentPaddingBottom = i4 + getContentPaddingBottom();
        }
        super.setPaddingRelative(i5, i6, contentPaddingEnd, contentPaddingBottom);
        int i9 = f801a + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        int i = 2 % 2;
        int i2 = f801a + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int paddingBottom = super.getPaddingBottom();
        return i3 != 0 ? paddingBottom >>> getContentPaddingBottom() : paddingBottom - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        int i = 2 % 2;
        int i2 = f801a + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int paddingEnd = super.getPaddingEnd() - getContentPaddingEnd();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        f801a = i4 % 128;
        int i5 = i4 % 2;
        return paddingEnd;
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        int i = 2 % 2;
        int i2 = f801a + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int paddingLeft = i2 % 2 != 0 ? super.getPaddingLeft() << getContentPaddingLeft() : super.getPaddingLeft() - getContentPaddingLeft();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        f801a = i3 % 128;
        int i4 = i3 % 2;
        return paddingLeft;
    }

    @Override // android.view.View
    public int getPaddingRight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        f801a = i2 % 128;
        int i3 = i2 % 2;
        int paddingRight = super.getPaddingRight();
        return i3 == 0 ? paddingRight << getContentPaddingRight() : paddingRight - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        f801a = i2 % 128;
        int i3 = i2 % 2;
        int paddingStart = super.getPaddingStart();
        return i3 == 0 ? paddingStart * getContentPaddingStart() : paddingStart - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        f801a = i2 % 128;
        int i3 = i2 % 2;
        int paddingTop = super.getPaddingTop();
        return i3 == 0 ? paddingTop * getContentPaddingTop() : paddingTop - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 23;
        f801a = i3 % 128;
        int i4 = i3 % 2;
        this.shapeAppearanceModel = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.shadowDrawable;
        if (materialShapeDrawable != null) {
            int i5 = i2 + 45;
            f801a = i5 % 128;
            if (i5 % 2 == 0) {
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        updateShapeMask(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 103;
        f801a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        int i4 = i2 + 25;
        f801a = i4 % 128;
        int i5 = i4 % 2;
        return shapeAppearanceModel;
    }

    private void updateShapeMask(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        f801a = i4 % 128;
        int i5 = i4 % 2;
        this.destination.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.pathProvider.calculatePath(this.shapeAppearanceModel, 1.0f, this.destination, this.path);
        this.maskPath.rewind();
        this.maskPath.addPath(this.path);
        this.maskRect.set(0.0f, 0.0f, i, i2);
        this.maskPath.addRect(this.maskRect, Path.Direction.CCW);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        f801a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 90 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    private void drawStroke(Canvas canvas) {
        int colorForState;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = f801a + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
            if (this.strokeColor != null) {
                this.borderPaint.setStrokeWidth(this.strokeWidth);
                colorForState = this.strokeColor.getColorForState(getDrawableState(), this.strokeColor.getDefaultColor());
                if (this.strokeWidth > 0.0f) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i2 = i + 125;
                    f801a = i2 % 128;
                    if (i2 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (colorForState != 0) {
                        int i6 = i + 7;
                        f801a = i6 % 128;
                        int i7 = i6 % 2;
                        this.borderPaint.setColor(colorForState);
                        canvas.drawPath(this.path, this.borderPaint);
                    }
                }
            }
        } else if (this.strokeColor != null) {
            this.borderPaint.setStrokeWidth(this.strokeWidth);
            colorForState = this.strokeColor.getColorForState(getDrawableState(), this.strokeColor.getDefaultColor());
            if (this.strokeWidth > 0.0f) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i2 = i + 125;
                f801a = i2 % 128;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (colorForState != 0) {
                    int i8 = i + 7;
                    f801a = i8 % 128;
                    int i9 = i8 % 2;
                    this.borderPaint.setColor(colorForState);
                    canvas.drawPath(this.path, this.borderPaint);
                }
            }
        }
        int i10 = f801a + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public void setStrokeColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        f801a = i3 % 128;
        int i4 = i3 % 2;
        setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        f801a = i5 % 128;
        int i6 = i5 % 2;
    }

    public ColorStateList getStrokeColor() {
        int i = 2 % 2;
        int i2 = f801a + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        ColorStateList colorStateList = this.strokeColor;
        int i5 = i3 + 73;
        f801a = i5 % 128;
        int i6 = i5 % 2;
        return colorStateList;
    }

    public void setStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        int i3 = i2 % 128;
        f801a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.strokeWidth != f) {
            int i4 = i3 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                this.strokeWidth = f;
                invalidate();
            } else {
                this.strokeWidth = f;
                invalidate();
                int i5 = 11 / 0;
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = f801a + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        setStrokeWidth(getResources().getDimensionPixelSize(i));
        if (i4 != 0) {
            throw null;
        }
    }

    public float getStrokeWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        int i3 = i2 % 128;
        f801a = i3;
        int i4 = i2 % 2;
        float f = this.strokeWidth;
        int i5 = i3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        f801a = i2 % 128;
        if (i2 % 2 == 0) {
            this.strokeColor = colorStateList;
            invalidate();
            int i3 = 4 / 0;
        } else {
            this.strokeColor = colorStateList;
            invalidate();
        }
        int i4 = f801a + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void b() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{45565, 46365, 47142, 48931, 41551, 43358, 44130, 37691, 38539, 40328, 32996, 34698, 35537, 61900, 62714, 64504, 65281, 57856, 59710, 60494, 54099, 54892, 11259, 12061, 8737, 9507, 14417, 13136, 13920, 2373, 3203, 1944, 6820, 7599, 4291, 27600, 28393, 45558, 46354, 47156, 48944, 41486, 43355, 44135, 37755, 38531, 40405, 32921, 34720, 35547, 61899, 62699, 64496, 45557, 46359, 47143, 48959, 41556, 43358, 44146, 37740, 38572, 40346, 32953, 34737, 35563, 61904, 62698, 64504, 31679, 32607, 29284, 30049, 26637, 25372, 26144, 22905, 23751, 22473, 19192, 19893, 16555, 15262, 16056, 12726, 13656, 10344, 9060, 9754, 6438, 7213, 5926, 2754, 3543, 237, 19157, 20012, 17178, 17417, 22895, 21107, 22360, 26750, 28094, 26273, 31628, 31898, 29153, 2804, 4048, 222, 1065, 6407};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6723304182841821837L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 109
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = com.google.android.material.imageview.ShapeableImageView.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.$$g(int, int, int):java.lang.String");
    }
}
