package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import com.yalantis.ucrop.model.AspectRatio;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public class UCrop {
    public static final String EXTRA_ASPECT_RATIO_X = "com.yalantis.ucrop.AspectRatioX";
    public static final String EXTRA_ASPECT_RATIO_Y = "com.yalantis.ucrop.AspectRatioY";
    public static final String EXTRA_ERROR = "com.yalantis.ucrop.Error";
    public static final String EXTRA_INPUT_URI = "com.yalantis.ucrop.InputUri";
    public static final String EXTRA_MAX_SIZE_X = "com.yalantis.ucrop.MaxSizeX";
    public static final String EXTRA_MAX_SIZE_Y = "com.yalantis.ucrop.MaxSizeY";
    public static final String EXTRA_OUTPUT_CROP_ASPECT_RATIO = "com.yalantis.ucrop.CropAspectRatio";
    public static final String EXTRA_OUTPUT_IMAGE_HEIGHT = "com.yalantis.ucrop.ImageHeight";
    public static final String EXTRA_OUTPUT_IMAGE_WIDTH = "com.yalantis.ucrop.ImageWidth";
    public static final String EXTRA_OUTPUT_OFFSET_X = "com.yalantis.ucrop.OffsetX";
    public static final String EXTRA_OUTPUT_OFFSET_Y = "com.yalantis.ucrop.OffsetY";
    public static final String EXTRA_OUTPUT_URI = "com.yalantis.ucrop.OutputUri";
    private static final String EXTRA_PREFIX = "com.yalantis.ucrop";
    public static final int MIN_SIZE = 10;
    public static final int REQUEST_CROP = 69;
    public static final int RESULT_ERROR = 96;
    private Intent mCropIntent = new Intent();
    private Bundle mCropOptionsBundle;

    public static UCrop of(Uri uri, Uri uri2) {
        return new UCrop(uri, uri2);
    }

    private UCrop(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.mCropOptionsBundle = bundle;
        bundle.putParcelable(EXTRA_INPUT_URI, uri);
        this.mCropOptionsBundle.putParcelable(EXTRA_OUTPUT_URI, uri2);
    }

    public UCrop withAspectRatio(float f, float f2) {
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_X, f);
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_Y, f2);
        return this;
    }

    public UCrop useSourceImageAspectRatio() {
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_X, 0.0f);
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_Y, 0.0f);
        return this;
    }

    public UCrop withMaxResultSize(int i, int i2) {
        if (i < 10) {
            i = 10;
        }
        if (i2 < 10) {
            i2 = 10;
        }
        this.mCropOptionsBundle.putInt(EXTRA_MAX_SIZE_X, i);
        this.mCropOptionsBundle.putInt(EXTRA_MAX_SIZE_Y, i2);
        return this;
    }

    public UCrop withOptions(Options options) {
        this.mCropOptionsBundle.putAll(options.getOptionBundle());
        return this;
    }

    public void start(Activity activity) {
        start(activity, 69);
    }

    public void start(Activity activity, int i) {
        activity.startActivityForResult(getIntent(activity), i);
    }

    public void start(Context context, Fragment fragment) {
        start(context, fragment, 69);
    }

    public void start(Context context, Fragment fragment, int i) {
        fragment.startActivityForResult(getIntent(context), i);
    }

    public Intent getIntent(Context context) {
        this.mCropIntent.setClass(context, UCropActivity.class);
        this.mCropIntent.putExtras(this.mCropOptionsBundle);
        return this.mCropIntent;
    }

    public UCropFragment getFragment() {
        return UCropFragment.newInstance(this.mCropOptionsBundle);
    }

    public UCropFragment getFragment(Bundle bundle) {
        this.mCropOptionsBundle = bundle;
        return getFragment();
    }

    public static Uri getOutput(Intent intent) {
        return (Uri) intent.getParcelableExtra(EXTRA_OUTPUT_URI);
    }

    public static int getOutputImageWidth(Intent intent) {
        return intent.getIntExtra(EXTRA_OUTPUT_IMAGE_WIDTH, -1);
    }

    public static int getOutputImageHeight(Intent intent) {
        return intent.getIntExtra(EXTRA_OUTPUT_IMAGE_HEIGHT, -1);
    }

    public static float getOutputCropAspectRatio(Intent intent) {
        return intent.getFloatExtra(EXTRA_OUTPUT_CROP_ASPECT_RATIO, 0.0f);
    }

    public static Throwable getError(Intent intent) {
        return (Throwable) intent.getSerializableExtra(EXTRA_ERROR);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class Options {
        public static final String EXTRA_ALLOWED_GESTURES = "com.yalantis.ucrop.AllowedGestures";
        public static final String EXTRA_ASPECT_RATIO_OPTIONS = "com.yalantis.ucrop.AspectRatioOptions";
        public static final String EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT = "com.yalantis.ucrop.AspectRatioSelectedByDefault";
        public static final String EXTRA_CIRCLE_DIMMED_LAYER = "com.yalantis.ucrop.CircleDimmedLayer";
        public static final String EXTRA_COMPRESSION_FORMAT_NAME = "com.yalantis.ucrop.CompressionFormatName";
        public static final String EXTRA_COMPRESSION_QUALITY = "com.yalantis.ucrop.CompressionQuality";
        public static final String EXTRA_CROP_FRAME_COLOR = "com.yalantis.ucrop.CropFrameColor";
        public static final String EXTRA_CROP_FRAME_STROKE_WIDTH = "com.yalantis.ucrop.CropFrameStrokeWidth";
        public static final String EXTRA_CROP_GRID_COLOR = "com.yalantis.ucrop.CropGridColor";
        public static final String EXTRA_CROP_GRID_COLUMN_COUNT = "com.yalantis.ucrop.CropGridColumnCount";
        public static final String EXTRA_CROP_GRID_ROW_COUNT = "com.yalantis.ucrop.CropGridRowCount";
        public static final String EXTRA_CROP_GRID_STROKE_WIDTH = "com.yalantis.ucrop.CropGridStrokeWidth";
        public static final String EXTRA_DIMMED_LAYER_COLOR = "com.yalantis.ucrop.DimmedLayerColor";
        public static final String EXTRA_FREE_STYLE_CROP = "com.yalantis.ucrop.FreeStyleCrop";
        public static final String EXTRA_HIDE_BOTTOM_CONTROLS = "com.yalantis.ucrop.HideBottomControls";
        public static final String EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = "com.yalantis.ucrop.ImageToCropBoundsAnimDuration";
        public static final String EXTRA_MAX_BITMAP_SIZE = "com.yalantis.ucrop.MaxBitmapSize";
        public static final String EXTRA_MAX_SCALE_MULTIPLIER = "com.yalantis.ucrop.MaxScaleMultiplier";
        public static final String EXTRA_SHOW_CROP_FRAME = "com.yalantis.ucrop.ShowCropFrame";
        public static final String EXTRA_SHOW_CROP_GRID = "com.yalantis.ucrop.ShowCropGrid";
        public static final String EXTRA_STATUS_BAR_COLOR = "com.yalantis.ucrop.StatusBarColor";
        public static final String EXTRA_TOOL_BAR_COLOR = "com.yalantis.ucrop.ToolbarColor";
        public static final String EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE = "com.yalantis.ucrop.UcropColorControlsWidgetActive";
        public static final String EXTRA_UCROP_LOGO_COLOR = "com.yalantis.ucrop.UcropLogoColor";
        public static final String EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR = "com.yalantis.ucrop.UcropRootViewBackgroundColor";
        public static final String EXTRA_UCROP_TITLE_TEXT_TOOLBAR = "com.yalantis.ucrop.UcropToolbarTitleText";
        public static final String EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE = "com.yalantis.ucrop.UcropToolbarCancelDrawable";
        public static final String EXTRA_UCROP_WIDGET_COLOR_TOOLBAR = "com.yalantis.ucrop.UcropToolbarWidgetColor";
        public static final String EXTRA_UCROP_WIDGET_CROP_DRAWABLE = "com.yalantis.ucrop.UcropToolbarCropDrawable";
        private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final Bundle mOptionBundle = new Bundle();
        private static final byte[] $$c = {119, -103, 14, -22};
        private static final int $$f = 81;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {83, -44, 103, 46, -12, 2, 63, -57, -8, 0, 8, -5, 7, 55, -51, -13, 10, -14, 3, 6, 5, 54, -62, 3, 7, -16, 17, -17, 9, 4, -14, 69, -66, 4, 11, -2, -2, -14, 69, -36, 46, -69, 5, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 67};
        private static final int $$e = 88;
        private static final byte[] $$a = {48, -119, -71, 110, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
        private static final int $$b = 186;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f877a = 0;
        private static int asInterface = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 471997534;
        private static int b = -1934795570;
        private static int TuitionPaymentFragmentbindingInflater1 = 480743720;
        private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {8, -54, -2, -63, -85, 28, -54, -13, -61, -8, -84, -81, 57, -50, -125, 8, -7, -8, -57, -44, -4, -41, 1, -33, -93, -48, -81, -86, -37, -78, -55, -90, -43, -94, -74, -48, -82, 20, 42, 35, 90, 53, 59, 66, 40, 50, 90, 48, 88, 60, 13, 58, 97, 47, 62, 26, 117, 34, 37, 32, 49, 89, 48, 12, 51, 58, 45, 15, 50, 54, 53, 52, 48, -29, 69, 58, 57, 47, 48, 53, 14, -2, 39, -69, 115, 119, 89, 107, 118, -114, 39, 109, 115, -126, 92, ByteCompanionObject.MAX_VALUE, -122, 91, 117, -71, 118, 89, 115, 118, -122, 112, 92, 126, 119, 111, 126, -124, 95, 119, 112, -121, 36, 117, -122, 90, -123, 114, 90, 119, 117, -121, 38, 112, 109, 117, -125, 107, 119, 39, -122, 119, 88, 114, -121, 115, 116, 119, 106, 116, 34, -2, 86, 96, -87, 75, 100, -86, 101, 87, -103, -103, -76, 79, 102, -80, 76, 96, 102, -103, -101, 103, -74, 103, 85, 102, -73, -102, 87, 101, -102, -75, 79, 103, -103, 102, 96, -100, -79, 72, -76, 74, -74, 73, 100, 100, -101, 101, 103, -104, -88, 82, -85, 101, 84, -84, 103, 72, -77, 75, 99, -100, -76, 101, -104};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                byte[] r0 = com.yalantis.ucrop.UCrop.Options.$$a
                int r8 = r8 * 14
                int r8 = 98 - r8
                int r6 = r6 * 52
                int r6 = r6 + 1
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r6
                goto L29
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r7 = r7 + 1
                r3 = r0[r7]
            L29:
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCrop.Options.c(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(byte r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 15
                int r8 = r8 + 84
                int r9 = r9 * 39
                int r9 = 43 - r9
                int r7 = r7 * 13
                int r7 = r7 + 40
                byte[] r0 = com.yalantis.ucrop.UCrop.Options.$$d
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r9
                r4 = r2
                goto L2b
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L26:
                r3 = r0[r9]
                r6 = r3
                r3 = r8
                r8 = r6
            L2b:
                int r8 = -r8
                int r9 = r9 + 1
                int r8 = r8 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCrop.Options.e(byte, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:37:0x01a9  */
        private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                int i7 = -1;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int iNormalizeMetaState = 2267 - KeyEvent.normalizeMetaState(0);
                    int i8 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32;
                    byte length = (byte) $$c.length;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iNormalizeMetaState, i8, 1387473586, false, $$g((byte) (-1), length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i9 = $10 + 43;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        int i11 = 0;
                        while (i11 < length2) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) i7;
                                byte b4 = (byte) (b3 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3357, 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1054011043, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i11++;
                            i7 = -1;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cMyTid = (char) (Process.myTid() >> 22);
                            int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266;
                            int minimumFlingVelocity = 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            byte length3 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, i12, minimumFlingVelocity, 1387473586, false, $$g((byte) (-1), length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i13 = $10;
                    int i14 = i13 + 51;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                    if (z) {
                        int i17 = i13 + 111;
                        $11 = i17 % 128;
                        if (i17 % 2 == 0) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                    } else {
                        i4 = 0;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 + i4;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 55904), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2855, 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1529949196, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (bArr4 != null) {
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        int i18 = 0;
                        while (i18 < length4) {
                            int i19 = $10 + 15;
                            $11 = i19 % 128;
                            if (i19 % 2 == 0) {
                                bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 3046761265686732006L);
                                i18 <<= 1;
                            } else {
                                bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 3046761265686732006L);
                                i18++;
                            }
                        }
                        int i20 = $10 + 61;
                        $11 = i20 % 128;
                        i5 = 2;
                        int i21 = i20 % 2;
                        bArr4 = bArr5;
                    } else {
                        i5 = 2;
                    }
                    if (bArr4 != null) {
                        int i22 = $11 + 125;
                        $10 = i22 % 128;
                        int i23 = i22 % i5;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i24 = $11 + 49;
                        $10 = i24 % 128;
                        if (i24 % 2 != 0) {
                            throw null;
                        }
                        if (z2) {
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i25 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i25]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i26 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i26 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i26]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public Bundle getOptionBundle() {
            Bundle bundle;
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 17;
            f877a = i3 % 128;
            if (i3 % 2 != 0) {
                bundle = this.mOptionBundle;
                int i4 = 96 / 0;
            } else {
                bundle = this.mOptionBundle;
            }
            int i5 = i2 + 83;
            f877a = i5 % 128;
            int i6 = i5 % 2;
            return bundle;
        }

        public void setCompressionFormat(Bitmap.CompressFormat compressFormat) {
            int i = 2 % 2;
            int i2 = f877a + 81;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                this.mOptionBundle.putString(EXTRA_COMPRESSION_FORMAT_NAME, compressFormat.name());
                throw null;
            }
            this.mOptionBundle.putString(EXTRA_COMPRESSION_FORMAT_NAME, compressFormat.name());
            int i3 = f877a + 25;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }

        public void setCompressionQuality(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 43;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            this.mOptionBundle.putInt(EXTRA_COMPRESSION_QUALITY, i);
            int i5 = f877a + 43;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 0;
            }
        }

        public void setAllowedGestures(int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = asInterface + 61;
            f877a = i5 % 128;
            int i6 = i5 % 2;
            this.mOptionBundle.putIntArray(EXTRA_ALLOWED_GESTURES, new int[]{i, i2, i3});
            int i7 = f877a + 17;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 84 / 0;
            }
        }

        public void setMaxScaleMultiplier(float f) {
            int i = 2 % 2;
            int i2 = asInterface + 97;
            f877a = i2 % 128;
            int i3 = i2 % 2;
            this.mOptionBundle.putFloat(EXTRA_MAX_SCALE_MULTIPLIER, f);
            int i4 = asInterface + 85;
            f877a = i4 % 128;
            int i5 = i4 % 2;
        }

        public void setImageToCropBoundsAnimDuration(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 59;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                this.mOptionBundle.putInt(EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, i);
                int i4 = 64 / 0;
            } else {
                this.mOptionBundle.putInt(EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, i);
            }
            int i5 = f877a + 79;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setMaxBitmapSize(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 105;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                this.mOptionBundle.putInt(EXTRA_MAX_BITMAP_SIZE, i);
                int i4 = 73 / 0;
            } else {
                this.mOptionBundle.putInt(EXTRA_MAX_BITMAP_SIZE, i);
            }
            int i5 = asInterface + 35;
            f877a = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setDimmedLayerColor(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 85;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            this.mOptionBundle.putInt(EXTRA_DIMMED_LAYER_COLOR, i);
            int i5 = asInterface + 51;
            f877a = i5 % 128;
            int i6 = i5 % 2;
        }

        public void setCircleDimmedLayer(boolean z) {
            int i = 2 % 2;
            int i2 = asInterface + 27;
            f877a = i2 % 128;
            if (i2 % 2 == 0) {
                this.mOptionBundle.putBoolean(EXTRA_CIRCLE_DIMMED_LAYER, z);
            } else {
                this.mOptionBundle.putBoolean(EXTRA_CIRCLE_DIMMED_LAYER, z);
                throw null;
            }
        }

        public void setShowCropFrame(boolean z) {
            int i = 2 % 2;
            int i2 = f877a + 43;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                this.mOptionBundle.putBoolean(EXTRA_SHOW_CROP_FRAME, z);
                throw null;
            }
            this.mOptionBundle.putBoolean(EXTRA_SHOW_CROP_FRAME, z);
            int i3 = asInterface + 25;
            f877a = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        public void setCropFrameColor(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 83;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                this.mOptionBundle.putInt(EXTRA_CROP_FRAME_COLOR, i);
            } else {
                this.mOptionBundle.putInt(EXTRA_CROP_FRAME_COLOR, i);
                throw null;
            }
        }

        public void setCropFrameStrokeWidth(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 3;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                this.mOptionBundle.putInt(EXTRA_CROP_FRAME_STROKE_WIDTH, i);
            } else {
                this.mOptionBundle.putInt(EXTRA_CROP_FRAME_STROKE_WIDTH, i);
                int i4 = 2 / 0;
            }
        }

        public void setShowCropGrid(boolean z) {
            int i = 2 % 2;
            int i2 = f877a + 51;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                this.mOptionBundle.putBoolean(EXTRA_SHOW_CROP_GRID, z);
                return;
            }
            this.mOptionBundle.putBoolean(EXTRA_SHOW_CROP_GRID, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setCropGridRowCount(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 1;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                this.mOptionBundle.putInt(EXTRA_CROP_GRID_ROW_COUNT, i);
                throw null;
            }
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_ROW_COUNT, i);
            int i4 = asInterface + 15;
            f877a = i4 % 128;
            int i5 = i4 % 2;
        }

        public void setCropGridColumnCount(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 13;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_COLUMN_COUNT, i);
            int i5 = asInterface + 69;
            f877a = i5 % 128;
            int i6 = i5 % 2;
        }

        public void setCropGridColor(int i) {
            int i2 = 2 % 2;
            int i3 = asInterface + 31;
            f877a = i3 % 128;
            int i4 = i3 % 2;
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_COLOR, i);
            int i5 = f877a + 83;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 21 / 0;
            }
        }

        public void setCropGridStrokeWidth(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 93;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                this.mOptionBundle.putInt(EXTRA_CROP_GRID_STROKE_WIDTH, i);
            } else {
                this.mOptionBundle.putInt(EXTRA_CROP_GRID_STROKE_WIDTH, i);
                throw null;
            }
        }

        public void setToolbarColor(int i) {
            int i2 = 2 % 2;
            int i3 = asInterface + 25;
            f877a = i3 % 128;
            int i4 = i3 % 2;
            this.mOptionBundle.putInt(EXTRA_TOOL_BAR_COLOR, i);
            int i5 = f877a + 115;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 79 / 0;
            }
        }

        public void setStatusBarColor(int i) {
            int i2 = 2 % 2;
            int i3 = asInterface + 49;
            f877a = i3 % 128;
            if (i3 % 2 == 0) {
                this.mOptionBundle.putInt(EXTRA_STATUS_BAR_COLOR, i);
                return;
            }
            this.mOptionBundle.putInt(EXTRA_STATUS_BAR_COLOR, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setActiveControlsWidgetColor(int i) {
            int i2 = 2 % 2;
            int i3 = asInterface + 11;
            f877a = i3 % 128;
            int i4 = i3 % 2;
            this.mOptionBundle.putInt(EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE, i);
            int i5 = asInterface + 25;
            f877a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 53 / 0;
            }
        }

        public void setToolbarWidgetColor(int i) throws IllegalAccessException {
            int i2 = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 40, (ViewConfiguration.getTouchSlop() >> 8) + 19, 1513912262, false, "b", null);
            }
            int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58, 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.getGidForName("") + 37837), ExpandableListView.getPackedPositionChild(0L) + 60, View.resolveSizeAndState(0, 0, 0) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
            long j2 = -1;
            long j3 = j2 ^ 1151535550949090687L;
            long jIdentityHashCode = System.identityHashCode(this);
            long j4 = jIdentityHashCode ^ j2;
            long j5 = (((long) (-830)) * 4367717946210695552L) + (((long) 832) * 1151535550949090687L) + (((long) (-831)) * (((j3 | j4) ^ j2) | ((4611496351446728191L | jIdentityHashCode) ^ j2))) + (((long) (-1662)) * (((j3 | 4367717946210695552L) | jIdentityHashCode) ^ j2)) + (((long) 831) * (((jIdentityHashCode | 1151535550949090687L) ^ j2) | (((j2 ^ 4367717946210695552L) | j4) ^ j2) | ((4367717946210695552L | jIdentityHashCode) ^ j2)));
            int i5 = f877a + 83;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            long j6 = j;
            while (true) {
                for (int i8 = 0; i8 != 8; i8++) {
                    int i9 = f877a + 23;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = (((((int) (j6 >> i8)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                }
                if (i7 != 0) {
                    break;
                }
                i7++;
                j6 = j5;
            }
            if (i4 != i3) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 46400), 39 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getCapsMode("", 0, 0) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                throw null;
            }
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_COLOR_TOOLBAR, i);
        }

        public void setToolbarTitle(String str) {
            int i = 2 % 2;
            int i2 = asInterface + 73;
            f877a = i2 % 128;
            int i3 = i2 % 2;
            this.mOptionBundle.putString(EXTRA_UCROP_TITLE_TEXT_TOOLBAR, str);
            int i4 = asInterface + 27;
            f877a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 26 / 0;
            }
        }

        public void setToolbarCancelDrawable(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 73;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE, i);
            int i5 = asInterface + 37;
            f877a = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0290  */
        public void setToolbarCropDrawable(int i) throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            int i2 = 2 % 2;
            int i3 = f877a + 5;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char doubleTapTimeout = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int threadPriority = 14 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr3 = new Object[1];
                c(b2, bArr[5], b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iIndexOf, threadPriority, -477065106, false, (String) objArr3[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            d(1878340243 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf("", "", 0) - 41, (short) ((-36) - (ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1869659976 - View.getDefaultSize(0, 0), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            d((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1878340246, (-41) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) ((-65) - TextUtils.getOffsetAfter("", 0)), (byte) KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetBefore("", 0) + 1869659998, objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char mode = (char) (View.MeasureSpec.getMode(0) + 37567);
                int iIndexOf2 = 625 - TextUtils.indexOf("", "");
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 14;
                byte b3 = $$a[5];
                byte b4 = (byte) (-b3);
                byte b5 = b3;
                Object[] objArr6 = new Object[1];
                c(b4, b5, (byte) (-b5), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, iIndexOf2, longPressTimeout, -976899241, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cAxisFromString = (char) (37566 - MotionEvent.axisFromString(""));
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 625;
                    int iRed = Color.red(0) + 14;
                    byte b6 = $$a[5];
                    byte b7 = (byte) (-b6);
                    Object[] objArr7 = new Object[1];
                    c(b7, (byte) (b7 | 50), (byte) (-b6), objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, fadingEdgeLength, iRed, -973632554, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i5 = ((int[]) objArr8[2])[0];
                int i6 = ((int[]) objArr8[0])[0];
                String[] strArr = (String[]) objArr8[3];
                int[] iArr = {i5};
                int i7 = ~System.identityHashCode(this);
                int i8 = ((50413288 + (((~(1537212415 | i7)) | 286525705) * (-828))) + ((i7 | 1537212415) * (-828))) - 1259034366;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
                objArr = new Object[]{new int[]{i6}, new int[1], iArr, strArr};
                int i11 = f877a + 9;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
            } else {
                Object[] objArr9 = new Object[1];
                d(TextUtils.getCapsMode("", 0, 0) + 1878340243, (-41) - TextUtils.getCapsMode("", 0, 0), (short) (55 - View.MeasureSpec.makeMeasureSpec(0, 0)), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (Process.myPid() >> 22) + 1869660013, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                d(1878340244 - ExpandableListView.getPackedPositionChild(0L), (-41) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (View.resolveSizeAndState(0, 0, 0) + 42), (byte) ((Process.getThreadPriority(0) + 20) >> 6), 1869660038 - TextUtils.indexOf((CharSequence) "", '0'), objArr10);
                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i13 = asInterface + 117;
                        f877a = i13 % 128;
                        if (i13 % 2 != 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr11 = new Object[1];
                d(1878340195 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-16777257) - Color.rgb(0, 0, 0), (short) (111 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 1869660058, objArr11);
                String str = (String) objArr11[0];
                Object[] objArr12 = new Object[1];
                d(1878340244 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-41) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 129), (byte) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 1869660121, objArr12);
                String[] strArr2 = {str, (String) objArr12[0]};
                int i14 = f877a + 39;
                asInterface = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Object[] objArr13 = {applicationContext, strArr2, Integer.valueOf(i), 17, 242526466};
                    byte[] bArr2 = $$d;
                    byte b8 = bArr2[9];
                    byte b9 = bArr2[48];
                    Object[] objArr14 = new Object[1];
                    e(b8, b9, b9, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    byte b10 = bArr2[48];
                    byte b11 = bArr2[9];
                    Object[] objArr15 = new Object[1];
                    e(b10, b11, b11, objArr15);
                    Object[] objArr16 = (Object[]) cls3.getMethod((String) objArr15[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                    int i16 = ((int[]) objArr16[0])[0];
                    int i17 = ((int[]) objArr16[2])[0];
                    if (applicationContext != null) {
                        int i18 = asInterface + 5;
                        f877a = i18 % 128;
                        int i19 = i18 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            int iResolveSize = 625 - View.resolveSize(0, 0);
                            int i20 = 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            byte b12 = $$a[5];
                            byte b13 = (byte) (-b12);
                            Object[] objArr17 = new Object[1];
                            c(b13, (byte) (b13 | 50), (byte) (-b12), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iResolveSize, i20, -973632554, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                        try {
                            Object[] objArr18 = new Object[1];
                            d(1878340242 - TextUtils.lastIndexOf("", '0', 0, 0), AndroidCharacter.getMirror('0') - 'Y', (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 37), (byte) Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 1869659977, objArr18);
                            Class<?> cls4 = Class.forName((String) objArr18[0]);
                            Object[] objArr19 = new Object[1];
                            d(1878340247 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionType(0L) - 41, (short) ((-65) - (ViewConfiguration.getScrollBarSize() >> 8)), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), 1869659998 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr19);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
                                int keyRepeatTimeout = 625 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int i21 = 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                byte b14 = $$a[5];
                                byte b15 = (byte) (-b14);
                                byte b16 = b14;
                                Object[] objArr20 = new Object[1];
                                c(b15, b16, (byte) (-b16), objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, keyRepeatTimeout, i21, -976899241, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cIndexOf2 = (char) (TextUtils.indexOf("", "") + 37567);
                                int iArgb = 625 - Color.argb(0, 0, 0, 0);
                                int iBlue = Color.blue(0) + 14;
                                byte[] bArr3 = $$a;
                                byte b17 = bArr3[7];
                                byte b18 = b17;
                                byte b19 = bArr3[5];
                                byte b20 = b17;
                                Object[] objArr21 = new Object[1];
                                c(b18, b19, b20, objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, iArgb, iBlue, -477065106, false, (String) objArr21[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i22 = ((int[]) objArr[0])[0];
            int i23 = ((int[]) objArr[2])[0];
            if (i23 == i22) {
                int i24 = ((int[]) objArr[1])[0];
                int i25 = ((int[]) objArr[2])[0];
                int i26 = ((int[]) objArr[0])[0];
                String[] strArr3 = (String[]) objArr[3];
                int iIdentityHashCode = System.identityHashCode(this);
                int i27 = i24 + ((((~((-33736193) | iIdentityHashCode)) | 144769028) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1708031180) + ((~((~iIdentityHashCode) | (-33736193))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                int i28 = (i27 << 13) ^ i27;
                int i29 = i28 ^ (i28 >>> 17);
                ((int[]) objArr2[1])[0] = i29 ^ (i29 << 5);
                objArr2 = new Object[]{new int[]{i26}, new int[1], new int[]{i25}, strArr3};
                int i30 = f877a + 7;
                asInterface = i30 % 128;
                int i31 = i30 % 2;
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr4 = (String[]) objArr[3];
                if (strArr4 != null) {
                    int i32 = 0;
                    while (i32 < strArr4.length) {
                        int i33 = f877a + 51;
                        asInterface = i33 % 128;
                        if (i33 % 2 == 0) {
                            arrayList.add(strArr4[i32]);
                            i32 += 12;
                        } else {
                            arrayList.add(strArr4[i32]);
                            i32++;
                        }
                    }
                }
                int[] iArr2 = new int[i23];
                int i34 = i23 - 1;
                iArr2[i34] = 1;
                Toast.makeText((Context) null, iArr2[((i23 * i34) % 2) - 1], 1).show();
                int i35 = ((int[]) objArr[1])[0];
                int i36 = ((int[]) objArr[2])[0];
                int i37 = ((int[]) objArr[0])[0];
                String[] strArr5 = (String[]) objArr[3];
                int[] iArr3 = {i36};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i38 = i35 + (-1723571878) + ((~((-35869845) | startUptimeMillis)) * 623) + (((~startUptimeMillis) | 285254242) * (-623)) + (((~(startUptimeMillis | 1036561259)) | (~((-787176862) | startUptimeMillis)) | 35869844) * 623);
                int i39 = (i38 << 13) ^ i38;
                int i40 = i39 ^ (i39 >>> 17);
                ((int[]) objArr2[1])[0] = i40 ^ (i40 << 5);
                objArr2 = new Object[]{new int[]{i37}, new int[1], iArr3, strArr5};
            }
            Bundle bundle = this.mOptionBundle;
            int i41 = ((int[]) objArr2[1])[0];
            int i42 = i41 * i41;
            int i43 = -(1196686293 * i41);
            int i44 = (((i42 ^ i43) + ((i42 & i43) << 1)) - (~(-(i41 * 1627934915)))) - 1;
            int i45 = (i44 & (-1458919792)) + ((-1458919792) | i44);
            int i46 = ((i45 >> 19) - 16383) / 8192;
            int i47 = ((i46 | 1) << 1) - (i46 ^ 1);
            int i48 = ((i45 | i47) << 1) - (i47 ^ i45);
            int i49 = i45 >> 16;
            int i50 = (((-131071) & i49) + (i49 | (-131071))) / 65536;
            int i51 = (-(i48 ^ ((i50 & 1) + (i50 | 1)))) + 7;
            int i52 = i51 >> 20;
            int i53 = ((((i52 | (-8191)) << 1) - (i52 ^ (-8191))) / 4096) + 1;
            bundle.putInt("9;11;23;com.yalantis.ucrop.UcropToolbarCropDrawable".substring(88872 / ((i51 & (-((i53 ^ 1) + ((i53 & 1) << 1)))) * 1587)), i);
        }

        public void setLogoColor(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 29;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                this.mOptionBundle.putInt(EXTRA_UCROP_LOGO_COLOR, i);
            } else {
                this.mOptionBundle.putInt(EXTRA_UCROP_LOGO_COLOR, i);
                throw null;
            }
        }

        public void setHideBottomControls(boolean z) {
            int i = 2 % 2;
            int i2 = asInterface + 61;
            f877a = i2 % 128;
            if (i2 % 2 != 0) {
                this.mOptionBundle.putBoolean(EXTRA_HIDE_BOTTOM_CONTROLS, z);
                int i3 = 67 / 0;
            } else {
                this.mOptionBundle.putBoolean(EXTRA_HIDE_BOTTOM_CONTROLS, z);
            }
            int i4 = f877a + 93;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        public void setFreeStyleCropEnabled(boolean z) {
            int i = 2 % 2;
            int i2 = f877a + 51;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                this.mOptionBundle.putBoolean(EXTRA_FREE_STYLE_CROP, z);
                int i3 = 38 / 0;
            } else {
                this.mOptionBundle.putBoolean(EXTRA_FREE_STYLE_CROP, z);
            }
            int i4 = f877a + 19;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
        }

        public void setAspectRatioOptions(int i, AspectRatio... aspectRatioArr) {
            int i2 = 2 % 2;
            int i3 = asInterface + 7;
            f877a = i3 % 128;
            if (i3 % 2 != 0) {
                int length = aspectRatioArr.length;
                throw null;
            }
            if (i > aspectRatioArr.length) {
                throw new IllegalArgumentException(String.format(Locale.US, "Index [selectedByDefault = %d] cannot be higher than aspect ratio options count [count = %d].", Integer.valueOf(i), Integer.valueOf(aspectRatioArr.length)));
            }
            this.mOptionBundle.putInt(EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, i);
            this.mOptionBundle.putParcelableArrayList(EXTRA_ASPECT_RATIO_OPTIONS, new ArrayList<>(Arrays.asList(aspectRatioArr)));
            int i4 = asInterface + 73;
            f877a = i4 % 128;
            int i5 = i4 % 2;
        }

        public void setRootViewBackgroundColor(int i) {
            int i2 = 2 % 2;
            int i3 = f877a + 115;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                this.mOptionBundle.putInt(EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, i);
                return;
            }
            this.mOptionBundle.putInt(EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void withAspectRatio(float f, float f2) {
            int i = 2 % 2;
            int i2 = f877a + 95;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, f);
                this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, f2);
                int i3 = 86 / 0;
            } else {
                this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, f);
                this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, f2);
            }
            int i4 = f877a + 59;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void useSourceImageAspectRatio() {
            int i = 2 % 2;
            int i2 = asInterface + 97;
            f877a = i2 % 128;
            if (i2 % 2 != 0) {
                this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, 0.0f);
                this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, 1.0f);
            } else {
                this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, 0.0f);
                this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, 0.0f);
            }
            int i3 = asInterface + 57;
            f877a = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        public void withMaxResultSize(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = asInterface + 69;
            f877a = i4 % 128;
            int i5 = i4 % 2;
            this.mOptionBundle.putInt(UCrop.EXTRA_MAX_SIZE_X, i);
            this.mOptionBundle.putInt(UCrop.EXTRA_MAX_SIZE_Y, i2);
            int i6 = asInterface + 81;
            f877a = i6 % 128;
            int i7 = i6 % 2;
        }

        private static String $$g(byte b2, short s, short s2) {
            int i = b2 + 4;
            int i2 = s2 * 4;
            byte[] bArr = $$c;
            int i3 = 121 - s;
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            if (bArr == null) {
                i4 = -1;
                i3 = i + i3;
                i = i;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = (byte) i3;
                if (i5 == i2) {
                    return new String(bArr2, 0);
                }
                int i6 = i + 1;
                i4 = i5;
                i3 = bArr[i6] + i3;
                i = i6;
            }
        }
    }
}
