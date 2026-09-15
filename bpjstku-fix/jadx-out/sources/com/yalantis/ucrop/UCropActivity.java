package com.yalantis.ucrop;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.util.SelectedStateListDrawable;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.TransformImageView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import defpackage.EncoderImplByteBufferInput;
import defpackage.SurfaceCombination;
import defpackage.UseCaseAttachState;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.getAttachedBuilder;
import defpackage.getElementsArrangements;
import defpackage.getMaximumSize;
import defpackage.getOrCreateUseCaseAttachInfo;
import defpackage.getSupportedPostviewSize;
import defpackage.getUltraMaximumSize;
import defpackage.initSession;
import defpackage.lambdagetActiveAndAttachedSessionConfigs3;
import defpackage.onCaptureSessionStart;
import defpackage.removeSurfaceConfig;
import defpackage.removeUseCase;
import defpackage.setUseCaseDetached;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public class UCropActivity extends AppCompatActivity {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    public static final int ALL = 3;
    private static final long CONTROLS_ANIMATION_DURATION = 50;
    public static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT;
    public static final int DEFAULT_COMPRESS_QUALITY = 90;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    private static final int ROTATE_WIDGET_SENSITIVITY_COEFFICIENT = 42;
    public static final int SCALE = 1;
    private static final int SCALE_WIDGET_SENSITIVITY_COEFFICIENT = 15000;
    private static final int TABS_COUNT = 3;
    private static final String TAG = "UCropActivity";
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static int b;
    private int mActiveControlsWidgetColor;
    private View mBlockingView;
    private Transition mControlsTransition;
    private GestureCropImageView mGestureCropImageView;
    private ViewGroup mLayoutAspectRatio;
    private ViewGroup mLayoutRotate;
    private ViewGroup mLayoutScale;
    private int mLogoColor;
    private OverlayView mOverlayView;
    private int mRootViewBackgroundColor;
    private boolean mShowBottomControls;
    private int mStatusBarColor;
    private TextView mTextViewRotateAngle;
    private TextView mTextViewScalePercent;
    private int mToolbarCancelDrawable;
    private int mToolbarColor;
    private int mToolbarCropDrawable;
    private String mToolbarTitle;
    private int mToolbarWidgetColor;
    private UCropView mUCropView;
    private ViewGroup mWrapperStateAspectRatio;
    private ViewGroup mWrapperStateRotate;
    private ViewGroup mWrapperStateScale;
    private static final byte[] $$c = {14, 116, 92, -78};
    private static final int $$f = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private boolean mShowLoader = true;
    private List<ViewGroup> mCropAspectRatioViews = new ArrayList();
    private Bitmap.CompressFormat mCompressFormat = DEFAULT_COMPRESS_FORMAT;
    private int mCompressQuality = 90;
    private int[] mAllowedGestures = {1, 2, 3};
    private TransformImageView.TransformImageListener mImageListener = new TransformImageView.TransformImageListener() { // from class: com.yalantis.ucrop.UCropActivity.1
        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onRotate(float f) {
            UCropActivity.access$000(UCropActivity.this, f);
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onScale(float f) {
            UCropActivity.access$100(UCropActivity.this, f);
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onLoadComplete() {
            UCropActivity.access$200(UCropActivity.this).animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.access$300(UCropActivity.this).setClickable(false);
            UCropActivity.access$402(UCropActivity.this, false);
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onLoadFailure(Exception exc) {
            UCropActivity.this.setResultError(exc);
            UCropActivity.this.finish();
        }
    };
    private final View.OnClickListener mStateClickListener = new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropActivity.7
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                if (!view.isSelected()) {
                    UCropActivity.access$900(UCropActivity.this, view.getId());
                }
            } finally {
                ViewPortBuilder.b();
            }
        }
    };

    /* JADX INFO: loaded from: classes5.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r7
            int r8 = 103 - r8
            int r6 = r6 + 4
            byte[] r1 = com.yalantis.ucrop.UCropActivity.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r6 = r6 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 84
            byte[] r0 = com.yalantis.ucrop.UCropActivity.$$d
            int r8 = r8 + 1
            int r6 = 538 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r7
            r3 = r2
            r7 = r6
            goto L26
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L26:
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + (-4)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.d(int, int, short, java.lang.Object[]):void");
    }

    static /* synthetic */ void access$000(UCropActivity uCropActivity, float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        uCropActivity.setAngleText(f);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void access$100(UCropActivity uCropActivity, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        uCropActivity.setScaleText(f);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ UCropView access$200(UCropActivity uCropActivity) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        UCropView uCropView = uCropActivity.mUCropView;
        int i5 = i3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return uCropView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ View access$300(UCropActivity uCropActivity) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        View view = uCropActivity.mBlockingView;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        throw null;
    }

    static /* synthetic */ boolean access$402(UCropActivity uCropActivity, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        uCropActivity.mShowLoader = z;
        int i5 = i3 + 29;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static /* synthetic */ GestureCropImageView access$500(UCropActivity uCropActivity) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        GestureCropImageView gestureCropImageView = uCropActivity.mGestureCropImageView;
        if (i3 != 0) {
            return gestureCropImageView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ List access$600(UCropActivity uCropActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        List<ViewGroup> list = uCropActivity.mCropAspectRatioViews;
        int i5 = i3 + 105;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static /* synthetic */ void access$700(UCropActivity uCropActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        uCropActivity.resetRotation();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void access$800(UCropActivity uCropActivity, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        uCropActivity.rotateByAngle(i);
        int i5 = asBinder + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void access$900(UCropActivity uCropActivity, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        uCropActivity.setWidgetState(i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = asBinder + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
    }

    static {
        byte[] bArr = new byte[575];
        System.arraycopy("Y\\¸+\u0010\u0002Å=\f\u0004ü\týÍ<\u0007\r÷\u0001\u0003\u0016öÍ9\u0013ó\u0016ù\b\u0011ÿùþ\u0014¿\u001c'\r÷\u0001\u0003\u0016öâ3ó\u0016ù\b\u0011ÿùþ\u0014Ü-\bÞ\u0017\u0006\u0006\u000e\u0005\u0002ó\u0015¶#0\u0002\u0007õ\u0011ÿ\n\u0003\u0010\u0002ÅI\u0002\bð\u0015÷\u0014ÿÂE\u0000\u0001\u0010\u0004\u0000Â?\t\nõ\u0011\u0000÷\u000fÆ>\u0010\u0004\u0000Â\u001e0\u0004\u0000ÅKß%\u0002÷\u0000\u0010»&'\u0013ñ\u0003ì\u001d\rý\u0011øï \n\u0001õ\u0006\u0002\u0013â\u0013\u0017ù\týð%\t÷ýÃ4%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\nò\u000b\tú\t\týæ)ü\nù\u0017õ\u0011Ã\u0010\u0002Å8\u0012þ\r\u0005û\u000e½:\u0001\u0017ñÑG\bô\u0014ô\b\týËH÷\f\u0006\tõÍ'(ô\u0014ô\b\týÞ3ý\u0010\u0002Å:\u0001\u0017ñ\u0007\u000füË7\u0011ú\u0012\u0001þÿÎH\u0007üÅC\u0006ù\u0005\u000bÆ\u0017&\u0015ù\n\u0003Û5ó\r\n´)\t%\tù\u0001\u0007þ\u0002\u0017ù\n\u0003é\u001aÿ\u0005â)ý\u0011\u0004û\u000bÜ%\u0005ÿ\u0018û\f´4%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\nò\u000b\tú\t\týæ)ü\nù\u0017õ\u0011Ã%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\n\u0003\u0001ù\u0002\nü\u000f\u0001\t\u0002\u0001\tû\u0003\u0016÷\u0000\u0016Ú&ù\u0005\u000bü\u0005\u0005ÿ\u0018û\fÃ\u0011ú\u0012\u0001þÿÎI\u0006ÿ\u0004\u0003\u0007\u0006¾LÂþCü\u0003\tüÑ(\u0013\u0017ù\týà0\u0002\u0007õ\u0017´\u0011%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\n\u0003\u0001ù\u0002\nü\u000f\u0001\t\u0002\u0001\tû\u0003\u0016÷\u0000\u0016Ú&ù\u0005\u000bü\u0005\u0005ÿ\u0018û\fÂ\u0010\u0002Å8\u0012þ\r\u0005û\u000e½:\u0001\u0017ñ\u0005\u000b\tú\t\týË\u0017&\u0015ù\u0011÷\u000f\tÎ0\u0003\nñ\u0006\u0015Ó&\r\nõ\u0011Ô+\tú\t\tý%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\nò\u000b\tú\t\týæ)ü\nù\u0017õ\u0011Ã".getBytes("ISO-8859-1"), 0, bArr, 0, 575);
        $$d = bArr;
        $$e = 243;
        $$a = new byte[]{80, -8, 43, 65, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$b = 225;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        asBinder = 1;
        b = 0;
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        int i = TuitionPaymentFragmentbindingInflater1 + 89;
        b = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $10 + 75;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 19;
                $10 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int i9 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 2266;
                        int i10 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 32;
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, i9, i10, -1927765101, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.red(0), 2267 - Color.alpha(0), Drawable.resolveOpacity(0, 0) + 33, -1927765101, false, $$g(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
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
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i11 = $11 + 77;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b % b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
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
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - Color.green(0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3261, 29 - TextUtils.indexOf((CharSequence) "", '0'), -127612708, false, $$g(b7, b8, (byte) (b8 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 22878), ((Process.getThreadPriority(0) + 20) >> 6) + 594, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i12];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                        } else {
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = $11 + 49;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr4[i17] = (char) (cArr4[i17] ^ 9874);
                i17 += 97;
            } else {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:548:0x3683  */
    /* JADX WARN: Code duplicated, block: B:549:0x3684  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        String str;
        Object[] objArr;
        int i;
        Throwable cause;
        Object[] objArr2;
        char c;
        char c2;
        String str2;
        String str3;
        Object[] objArr3;
        Object[] objArr4;
        char c3;
        char c4;
        String str4;
        Object[] objArr5;
        String str5;
        Object[] objArr6;
        char c5;
        int i2;
        Object[] objArr7;
        Object[] objArr8;
        Object[] objArr9;
        char c6;
        String str6;
        Object[] objArr10;
        Object[] objArr11;
        char c7;
        int i3;
        Object[] objArr12;
        Object[] objArr13;
        String str7;
        char c8;
        char c9;
        Object[] objArr14;
        Object[] objArr15;
        char c10;
        int i4;
        Object[] objArr16;
        int i5;
        char c11;
        Object[] objArr17;
        char c12;
        char c13;
        String str8;
        Object[] objArr18;
        String str9;
        Object[] objArr19;
        int i6 = 2 % 2;
        Object[] objArr20 = new Object[1];
        a(new char[]{'\t', '\'', '.', 27, '-', 29, '/', 20, '-', Typography.dollar, 16, '!', 24, '%', 30, '\b', 22, '(', '\b', '0', ',', 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_backend_error_message_1065).substring(0, 62).length() + 57), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.next).substring(1, 2).codePointAt(0) - 79, objArr20);
        String str10 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        a(new char[]{'\n', 7, 7, '.', '%', '\n', '/', '\r', '\n', '\f', '\b', Typography.quote, '!', 24, 13898}, (byte) (76 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr21);
        String str11 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        a(new char[]{18, '\n', '.', '\f', 20, '\f', '\t', '\'', 26, 17, '%', 30, Typography.dollar, 31, '\f', 23}, (byte) (109 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.validation_message_invalid_cvv).substring(12, 13).length() + 15, objArr22);
        String str12 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        a(new char[]{Typography.quote, '-', 16, ',', 30, ' ', 30, 22, '\t', '\f', Typography.dollar, 3, '+', 1, ',', '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 84), 15 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr23);
        String str13 = (String) objArr23[0];
        Object[] objArr24 = new Object[1];
        a(new char[]{'\t', '\'', '.', 27, '-', 29, '/', 20, 7, '.', '/', 14, 31, '0', 30, ' ', '-', '!', 30, 22, 29, 4, 23, 11, '\r', '.'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.instruction_klikbca2).substring(15, 16).length() + 37), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 72, objArr24);
        String str14 = (String) objArr24[0];
        Object[] objArr25 = new Object[1];
        a(new char[]{'0', 17, 13884, 13884, 16, ',', 30, 28, 13886, 13886, '\n', Typography.quote, '.', '\n', 30, ' ', ',', Typography.dollar}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 48), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.instruction_prima6).substring(8, 9).length() + 17, objArr25);
        String str15 = (String) objArr25[0];
        int i7 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = ~new Random().nextInt();
        if (i7 != 1017649032 + (((~(i8 | 174745952)) | 830538775) * (-160)) + (((~(i8 | 1004733495)) | 174745952) * 160)) {
            throw new RuntimeException("-900409430");
        }
        int i9 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i10 = (int) Runtime.getRuntime().totalMemory();
        int i11 = ~i10;
        int i12 = 176424844 + (((~((-1838328748) | i11)) | 738363809 | (~((-740727218) | i11)) | (~(1840692155 | i10))) * (-84));
        int i13 = (~((-1838328748) | i10)) | 740727217;
        int i14 = ~(1838328747 | i11);
        if (i9 != i12 + ((i13 | i14) * (-84)) + (((-1840692156) | i14) * 84)) {
            throw new RuntimeException("679832425");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) (37567 - KeyEvent.normalizeMetaState(0));
            int iAxisFromString = 624 - MotionEvent.axisFromString("");
            int i15 = 14 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            short s = bArr[7];
            Object[] objArr26 = new Object[1];
            c(s, (byte) (s | 52), (byte) (bArr[19] - 1), objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, iAxisFromString, i15, -477065106, false, (String) objArr26[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c14 = (char) (37568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int iKeyCodeFromString = 625 - KeyEvent.keyCodeFromString("");
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 14;
            byte[] bArr2 = $$a;
            short s2 = bArr2[7];
            Object[] objArr27 = new Object[1];
            c(s2, (byte) s2, bArr2[10], objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c14, iKeyCodeFromString, iCombineMeasuredStates, -976899241, false, (String) objArr27[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 37567);
                int mirror = AndroidCharacter.getMirror('0') + 577;
                int keyRepeatTimeout = 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr3 = $$a;
                Object[] objArr28 = new Object[1];
                c((short) 52, bArr3[7], bArr3[10], objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, mirror, keyRepeatTimeout, -973632554, false, (String) objArr28[0], null);
            }
            Object[] objArr29 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i16 = ((int[]) objArr29[2])[0];
            int i17 = ((int[]) objArr29[0])[0];
            String[] strArr = (String[]) objArr29[3];
            int[] iArr = {i16};
            int i18 = ~((int) Process.getStartUptimeMillis());
            int i19 = (-450695408) + ((~(1806956543 | i18)) * 52) + (((~(25187839 | i18)) | (~((-1798550282) | i18)) | 1781768704) * (-52)) + (((~(i18 | (-25187840))) | 8406262) * 52) + 1038336607;
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr[1])[0] = i21 ^ (i21 << 5);
            objArr = new Object[]{new int[]{i17}, new int[1], iArr, strArr};
            i = 0;
            str = "currentApplication";
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str14).getMethod(str15, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str12).getMethod(str13, Object.class).invoke(null, this)).intValue();
            str = r7;
            Object[] objArr30 = new Object[1];
            a(new char[]{2, '\n', '\b', '\f', 18, 4, 14, 28, '*', '\t', '\t', 14, 13947, 13947, '\t', 18, 25, 11, 23, 7, 17, 19, 25, 4, 11, 16, 4, 11, 6, '*', 16, '*', '.', '\t', 2, '-', 13863, 13863, 25, '\b', '\t', 14, 15, 21, '\b', '\n', 2, 14, '\f', '\'', 25, '\b', 15, 21, 4, '-', '+', 23, 18, '*', '*', 11, 4, '-'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 113), ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.details_message_invalid).substring(0, 6).codePointAt(2) - 33, objArr30);
            String str16 = (String) objArr30[0];
            Object[] objArr31 = new Object[1];
            a(new char[]{'.', '\n', '*', 27, '%', 19, 4, 25, '\n', '\b', '\'', '/', '\n', 2, 14, 21, 4, 1, 28, 7, 17, 19, 14, 28, '*', 18, '/', '-', 2, '*', '+', 23, '-', '/', 18, 2, 16, 7, '\n', 4, 2, '\n', 14, 28, 19, 15, 13803, 13803, '-', '.', 13797, 13797, '*', 18, 1, 4, '*', '\n', 0, 17, '\f', '\'', 28, 14}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_internal_detection_error_detected_image_is_null).substring(0, 24).codePointAt(18) + 34), ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bni_internet_instruction_8).substring(21, 22).length() + 63, objArr31);
            try {
                Object[] objArr32 = {baseContext, new String[]{str16, (String) objArr31[0]}, Integer.valueOf(iIntValue), 17, 1038336607};
                byte[] bArr4 = $$d;
                Object[] objArr33 = new Object[1];
                d((short) 534, bArr4[102], bArr4[216], objArr33);
                Class<?> cls = Class.forName((String) objArr33[0]);
                Object[] objArr34 = new Object[1];
                d((short) 462, bArr4[61], bArr4[89], objArr34);
                Object[] objArr35 = (Object[]) cls.getMethod((String) objArr34[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
                int i22 = ((int[]) objArr35[0])[0];
                int i23 = ((int[]) objArr35[2])[0];
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c15 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37567);
                        int defaultSize = View.getDefaultSize(0, 0) + 625;
                        int i24 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13;
                        byte[] bArr5 = $$a;
                        Object[] objArr36 = new Object[1];
                        c((short) 52, bArr5[7], bArr5[10], objArr36);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c15, defaultSize, i24, -973632554, false, (String) objArr36[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr35);
                    try {
                        str11 = str11;
                        long jLongValue2 = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cKeyCodeFromString = (char) (37567 - KeyEvent.keyCodeFromString(r14));
                            int iBlue = Color.blue(0) + 625;
                            int i25 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14;
                            byte[] bArr6 = $$a;
                            short s3 = bArr6[7];
                            Object[] objArr37 = new Object[1];
                            c(s3, (byte) s3, bArr6[10], objArr37);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, iBlue, i25, -976899241, false, (String) objArr37[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cRgb = (char) ((-16739649) - Color.rgb(0, 0, 0));
                            int maximumFlingVelocity = 625 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iResolveSize = View.resolveSize(0, 0) + 14;
                            byte[] bArr7 = $$a;
                            short s4 = bArr7[7];
                            Object[] objArr38 = new Object[1];
                            c(s4, (byte) (s4 | 52), (byte) (bArr7[19] - 1), objArr38);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, maximumFlingVelocity, iResolveSize, -477065106, false, (String) objArr38[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr35 = objArr35;
                }
                objArr = objArr35;
                i = 0;
            } catch (Throwable th) {
                th = th;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i26 = ((int[]) objArr[i])[i];
        int i27 = ((int[]) objArr[2])[i];
        if (i27 == i26) {
            objArr2 = new Object[4];
            int[] iArr2 = new int[1];
            objArr2[i] = iArr2;
            objArr2[1] = new int[1];
            int[] iArr3 = new int[1];
            objArr2[2] = iArr3;
            int i28 = ((int[]) objArr[1])[i];
            int i29 = ((int[]) objArr[2])[i];
            int i30 = ((int[]) objArr[i])[i];
            String[] strArr2 = (String[]) objArr[3];
            iArr3[i] = i29;
            iArr2[i] = i30;
            int i31 = ~((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[i]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i32 = ~(463004341 | i31);
            int i33 = i28 + (-1360273972) + ((i32 | 1360733779) * 764) + (((~(i31 | 1360733779)) | 176210084) * (-1528)) + ((1250149606 | i32) * 764);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr2[1])[0] = i35 ^ (i35 << 5);
            objArr2[3] = strArr2;
            c = 1;
            c2 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str17 : strArr3) {
                    arrayList.add(str17);
                }
            }
            int[] iArr4 = new int[i27];
            int i36 = i27 - 1;
            iArr4[i36] = 1;
            Toast.makeText((Context) null, iArr4[((i27 * i36) % 2) - 1], 1).show();
            int i37 = ((int[]) objArr[1])[0];
            int i38 = ((int[]) objArr[2])[0];
            int i39 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr5 = {i38};
            int i40 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i41 = ~i40;
            int i42 = i37 + ((((-1997990248) + (((~((-958084131) | i41)) | (~((-865653991) | i40))) * (-370))) + ((((~(i40 | (-958084131))) | (~(i41 | (-865653991)))) | (-1000076519)) * (-370))) - 661124574);
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            c = 1;
            c2 = 0;
            ((int[]) objArr2[1])[0] = i44 ^ (i44 << 5);
            objArr2 = new Object[]{new int[]{i39}, new int[1], iArr5, strArr4};
        }
        ((Field) setUseCaseDetached.TuitionPaymentFragmentbindingInflater1[c2]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1855579229, 796590362, 1403018915}, ((int[]) objArr2[c])[c2], Integer.MAX_VALUE) - (-1857125079));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (Process.getGidForName("") + 46401), 40 - (ViewConfiguration.getScrollBarSize() >> 8), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                str2 = r14;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (46401 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) str2, '0', 0) + 41, 19 - ((Process.getThreadPriority(0) + 20) >> 6), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            } else {
                str2 = r14;
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(obj, null);
            super.onCreate(bundle);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c16 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 53893);
                int iLastIndexOf = 1319 - TextUtils.lastIndexOf(str2, '0', 0);
                int mode = View.MeasureSpec.getMode(0) + 36;
                byte[] bArr8 = $$a;
                short s5 = bArr8[7];
                Object[] objArr39 = new Object[1];
                c(s5, (byte) (s5 | 52), (byte) (bArr8[19] - 1), objArr39);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c16, iLastIndexOf, mode, -1433084963, false, (String) objArr39[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char maximumFlingVelocity2 = (char) (53893 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int iLastIndexOf2 = 1319 - TextUtils.lastIndexOf(str2, '0');
                    int iIndexOf = 36 - TextUtils.indexOf(str2, str2);
                    byte[] bArr9 = $$a;
                    Object[] objArr40 = new Object[1];
                    c((short) 52, bArr9[7], bArr9[10], objArr40);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maximumFlingVelocity2, iLastIndexOf2, iIndexOf, -1920778747, false, (String) objArr40[0], null);
                }
                Object[] objArr41 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                objArr3 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i45 = ((int[]) objArr41[0])[0];
                int i46 = ((int[]) objArr41[3])[0];
                String[] strArr5 = (String[]) objArr41[2];
                int i47 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
                int i48 = (-1298360076) + (((~(397594733 | i47)) | 676138626) * (-140)) + ((~(1073733359 | i47)) * 70) + (((~(i47 | 973033091)) | 776838894) * 70) + 1002736203;
                int i49 = (i48 << 13) ^ i48;
                int i50 = i49 ^ (i49 >>> 17);
                ((int[]) objArr3[1])[0] = i50 ^ (i50 << 5);
                str12 = str12;
                str13 = str13;
                str3 = str11;
            } else {
                Context baseContext2 = getBaseContext();
                if (baseContext2 == null) {
                    int i51 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                    asBinder = i51 % 128;
                    baseContext2 = i51 % 2 == 0 ? (Context) Class.forName(str14).getMethod(str15, new Class[1]).invoke(null, null) : (Context) Class.forName(str14).getMethod(str15, new Class[0]).invoke(null, null);
                }
                if (baseContext2 != null) {
                    baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
                }
                int iIntValue2 = ((Integer) Class.forName(str12).getMethod(str13, Object.class).invoke(null, this)).intValue();
                Object[] objArr42 = {547056160};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (47977 - ExpandableListView.getPackedPositionGroup(0L)), 1300 - KeyEvent.keyCodeFromString(str2), 20 - KeyEvent.keyCodeFromString(str2), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr43 = {baseContext2, "com.bpjstku", 1002736203, Integer.valueOf(iIntValue2), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr42), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char c17 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 53892);
                    int i52 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1320;
                    int iResolveSizeAndState = 36 - View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr10 = $$a;
                    Object[] objArr44 = new Object[1];
                    c((short) 52, bArr10[7], bArr10[10], objArr44);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c17, i52, iResolveSizeAndState, 819724799, false, (String) objArr44[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionType(0L) + 57878), (ViewConfiguration.getTapTimeout() >> 16) + 1394, 74 - TextUtils.lastIndexOf(str2, '0', 0, 0)), Boolean.TYPE});
                }
                Object[] objArr45 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr43);
                if (baseContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char c18 = (char) (53893 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int i53 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1319;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 36;
                        byte[] bArr11 = $$a;
                        Object[] objArr46 = new Object[1];
                        c((short) 52, bArr11[7], bArr11[10], objArr46);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c18, i53, windowTouchSlop, -1920778747, false, (String) objArr46[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr45);
                    try {
                        str3 = str11;
                        long jLongValue3 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                            char cMyTid = (char) ((Process.myTid() >> 22) + 53893);
                            int iIndexOf2 = 1319 - TextUtils.indexOf((CharSequence) str2, '0', 0);
                            int iKeyCodeFromString2 = 36 - KeyEvent.keyCodeFromString(str2);
                            Object[] objArr47 = new Object[1];
                            c((short) 104, (byte) 15, $$a[10], objArr47);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyTid, iIndexOf2, iKeyCodeFromString2, -1273706634, false, (String) objArr47[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                            char cRed = (char) (Color.red(0) + 53893);
                            int i54 = 1320 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i55 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35;
                            byte[] bArr12 = $$a;
                            short s6 = bArr12[7];
                            Object[] objArr48 = new Object[1];
                            c(s6, (byte) (s6 | 52), (byte) (bArr12[19] - 1), objArr48);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cRed, i54, i55, -1433084963, false, (String) objArr48[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    str12 = str12;
                    objArr45 = objArr45;
                    str13 = str13;
                    str3 = str11;
                }
                objArr3 = objArr45;
            }
            int i56 = ((int[]) objArr3[3])[0];
            int i57 = ((int[]) objArr3[0])[0];
            if (i57 == i56) {
                objArr4 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i58 = ((int[]) objArr3[1])[0];
                int i59 = ((int[]) objArr3[0])[0];
                int i60 = ((int[]) objArr3[3])[0];
                String[] strArr6 = (String[]) objArr3[2];
                int i61 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
                int i62 = ~i61;
                int i63 = i58 + (-1756802320) + ((201956352 | i62) * (-192)) + (((~((-1129603449) | i62)) | 39068024) * (-384)) + (((~(i61 | 1331559800)) | (~(i62 | (-1090535425))) | (~((-39068025) | i61))) * DerHeader.TAG_CLASS_PRIVATE);
                int i64 = (i63 << 13) ^ i63;
                int i65 = i64 ^ (i64 >>> 17);
                c3 = 1;
                c4 = 0;
                ((int[]) objArr4[1])[0] = i65 ^ (i65 << 5);
            } else {
                int[] iArr6 = new int[i57];
                int i66 = i57 - 1;
                iArr6[i66] = 1;
                Toast.makeText((Context) null, iArr6[((i57 * i66) % 2) - 1], 1).show();
                objArr4 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i67 = ((int[]) objArr3[1])[0];
                int i68 = ((int[]) objArr3[0])[0];
                int i69 = ((int[]) objArr3[3])[0];
                String[] strArr7 = (String[]) objArr3[2];
                int i70 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
                int i71 = ~i70;
                int i72 = i67 + 1784335600 + (((~((-662304889) | i71)) | (~(796524152 | i70))) * (-831)) + ((~((-88201217) | i70)) * (-1662)) + (((~(i70 | 662304888)) | (~(i71 | (-708322937))) | (~(708322936 | i70))) * 831);
                int i73 = (i72 << 13) ^ i72;
                int i74 = i73 ^ (i73 >>> 17);
                c3 = 1;
                c4 = 0;
                ((int[]) objArr4[1])[0] = i74 ^ (i74 << 5);
            }
            ((Field) removeUseCase.TuitionPaymentFragmentspecialinlinedviewModeldefault1[c4]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{131716640, 658959884, 1738740287}, ((int[]) objArr4[c3])[c4], Integer.MAX_VALUE) + 67946555);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char cMyTid2 = (char) (Process.myTid() >> 22);
                int i75 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                Object[] objArr49 = new Object[1];
                c((short) 104, (byte) 15, $$a[10], objArr49);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cMyTid2, i75, tapTimeout, -1650998592, false, (String) objArr49[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).getLong(null);
            long jLongValue4 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength(str2);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                byte[] bArr13 = $$a;
                Object[] objArr50 = new Object[1];
                c((short) 52, bArr13[7], bArr13[10], objArr50);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(trimmedLength, threadPriority, scrollBarSize, 2012020043, false, (String) objArr50[0], null);
            }
            if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char cRgb2 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                    int iMyTid = (Process.myTid() >> 22) + 10;
                    byte[] bArr14 = $$a;
                    short s7 = bArr14[7];
                    Object[] objArr51 = new Object[1];
                    c(s7, (byte) s7, bArr14[10], objArr51);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cRgb2, iMakeMeasureSpec, iMyTid, 2012931276, false, (String) objArr51[0], null);
                }
                Object[] objArr52 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).get(null);
                objArr5 = new Object[]{new int[]{((int[]) objArr52[0])[0]}, new int[1], new int[]{((int[]) objArr52[2])[0]}, (String[]) objArr52[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i76 = (-340708924) + ((~((~iIdentityHashCode) | (-101345861))) * (-116)) + ((167084347 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 126774118)) | 141656089) * 116) + 755451580;
                int i77 = (i76 << 13) ^ i76;
                int i78 = i77 ^ (i77 >>> 17);
                ((int[]) objArr5[1])[0] = i78 ^ (i78 << 5);
                str4 = str13;
            } else {
                Context baseContext3 = getBaseContext();
                if (baseContext3 == null) {
                    baseContext3 = (Context) Class.forName(str14).getMethod(str15, new Class[0]).invoke(null, null);
                }
                if (baseContext3 != null) {
                    baseContext3 = (((baseContext3 instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext3).getBaseContext() != null) ? baseContext3.getApplicationContext() : null;
                }
                str4 = str13;
                Object[] objArr53 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 755451580};
                short s8 = (short) 462;
                byte[] bArr15 = $$d;
                Object[] objArr54 = new Object[1];
                d(s8, bArr15[102], bArr15[95], objArr54);
                Class<?> cls2 = Class.forName((String) objArr54[0]);
                Object[] objArr55 = new Object[1];
                d(s8, bArr15[61], bArr15[89], objArr55);
                Object[] objArr56 = (Object[]) cls2.getMethod((String) objArr55[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr53);
                if (baseContext3 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                        char cRed2 = (char) Color.red(0);
                        int iMyTid2 = 876 - (Process.myTid() >> 22);
                        int packedPositionType2 = 10 - ExpandableListView.getPackedPositionType(0L);
                        byte[] bArr16 = $$a;
                        short s9 = bArr16[7];
                        Object[] objArr57 = new Object[1];
                        c(s9, (byte) s9, bArr16[10], objArr57);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cRed2, iMyTid2, packedPositionType2, 2012931276, false, (String) objArr57[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr56);
                    try {
                        long jLongValue5 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue5);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                            char c19 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                            int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
                            byte[] bArr17 = $$a;
                            Object[] objArr58 = new Object[1];
                            c((short) 52, bArr17[7], bArr17[10], objArr58);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c19, edgeSlop, packedPositionChild, 2012020043, false, (String) objArr58[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                            char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int iIndexOf3 = 875 - TextUtils.indexOf((CharSequence) str2, '0', 0, 0);
                            int gidForName = Process.getGidForName(str2) + 11;
                            Object[] objArr59 = new Object[1];
                            c((short) 104, (byte) 15, $$a[10], objArr59);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(windowTouchSlop2, iIndexOf3, gidForName, -1650998592, false, (String) objArr59[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf6);
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr56 = objArr56;
                }
                objArr5 = objArr56;
            }
            int i79 = ((int[]) objArr5[2])[0];
            int i80 = ((int[]) objArr5[0])[0];
            if (i80 == i79) {
                int i81 = ((int[]) objArr5[1])[0];
                objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
                str5 = str;
                int i82 = ~((Context) Class.forName("android.app.ActivityThread").getMethod(str5, new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
                int i83 = i81 + 459189252 + ((528480215 | i82) * 184) + (((~(i82 | 293009238)) | 511252183) * 184);
                int i84 = i83 ^ (i83 << 13);
                int i85 = i84 ^ (i84 >>> 17);
                i2 = 0;
                ((int[]) objArr6[1])[0] = i85 ^ (i85 << 5);
                c5 = 1;
            } else {
                str5 = str;
                Toast.makeText((Context) null, i80 / (((i80 - 1) * i80) % 2), 0).show();
                int i86 = ((int[]) objArr5[1])[0];
                objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
                int i87 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str5, new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
                int i88 = ~i87;
                int i89 = (-868597916) + (((~((-234388473) | i88)) | 73931224 | (~(194078243 | i88)) | (~((-33620996) | i87))) * (-84));
                int i90 = (~(i87 | 194078243)) | 234388472;
                int i91 = ~(i88 | (-194078244));
                int i92 = i86 + i89 + ((i90 | i91) * (-84)) + ((33620995 | i91) * 84);
                int i93 = i92 ^ (i92 << 13);
                int i94 = i93 ^ (i93 >>> 17);
                c5 = 1;
                i2 = 0;
                ((int[]) objArr6[1])[0] = i94 ^ (i94 << 5);
            }
            ((Field) getAttachedBuilder.b[i2]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{825712283, 998171838, 2081152710}, ((int[]) objArr6[c5])[i2], Integer.MAX_VALUE) - (-2128217922));
            setContentView(R.layout.ucrop_activity_photobox);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char cRed3 = (char) Color.red(i2);
                int iIndexOf4 = TextUtils.indexOf(str2, str2, i2, i2) + 2267;
                int iIndexOf5 = 32 - TextUtils.indexOf((CharSequence) str2, '0', i2, i2);
                byte[] bArr18 = $$a;
                Object[] objArr60 = new Object[1];
                c((short) 52, bArr18[7], bArr18[10], objArr60);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cRed3, iIndexOf4, iIndexOf5, -887667012, false, (String) objArr60[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int i95 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2267;
                    int threadPriority2 = 33 - ((Process.getThreadPriority(0) + 20) >> 6);
                    Object[] objArr61 = new Object[1];
                    c((short) 104, (byte) 15, $$a[10], objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cCombineMeasuredStates, i95, threadPriority2, -654680577, false, (String) objArr61[0], null);
                }
                Object[] objArr62 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).get(null);
                objArr7 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i96 = ((int[]) objArr62[0])[0];
                int i97 = ((int[]) objArr62[3])[0];
                String[] strArr8 = (String[]) objArr62[1];
                int i98 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str5, new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
                int i99 = ~i98;
                int i100 = ((((-1423784170) + ((790618047 | i99) * (-369))) + (((~((-186113983) | i99)) | 622599333) * (-369))) + ((((~(i98 | 186113982)) | 604504065) | (~(i99 | (-168018715)))) * 369)) - 720265024;
                int i101 = (i100 << 13) ^ i100;
                int i102 = i101 ^ (i101 >>> 17);
                ((int[]) objArr7[2])[0] = i102 ^ (i102 << 5);
                str15 = str15;
            } else {
                Context baseContext4 = getBaseContext();
                if (baseContext4 == null) {
                    baseContext4 = (Context) Class.forName(str14).getMethod(str15, new Class[0]).invoke(null, null);
                }
                if (baseContext4 != null) {
                    int i103 = asBinder + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i103 % 128;
                    int i104 = i103 % 2;
                    baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
                }
                try {
                    Object[] objArr63 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, -720265024};
                    byte[] bArr19 = $$d;
                    Object[] objArr64 = new Object[1];
                    d((short) 399, bArr19[24], bArr19[153], objArr64);
                    Class<?> cls3 = Class.forName((String) objArr64[0]);
                    Object[] objArr65 = new Object[1];
                    d((short) 462, bArr19[61], bArr19[89], objArr65);
                    Object[] objArr66 = (Object[]) cls3.getMethod((String) objArr65[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr63);
                    if (baseContext4 != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int i105 = 2268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 33;
                            Object[] objArr67 = new Object[1];
                            c((short) 104, (byte) 15, $$a[10], objArr67);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(packedPositionGroup, i105, deadChar, -654680577, false, (String) objArr67[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr66);
                        try {
                            long jLongValue6 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf7 = Long.valueOf(jLongValue6);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf(str2, '0') + 1);
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267;
                                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 33;
                                byte[] bArr20 = $$a;
                                short s10 = bArr20[7];
                                Object[] objArr68 = new Object[1];
                                c(s10, (byte) s10, bArr20[10], objArr68);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cLastIndexOf, scrollBarFadeDuration, tapTimeout2, -874156483, false, (String) objArr68[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf7);
                            Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                                char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
                                int jumpTapTimeout2 = 33 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                byte[] bArr21 = $$a;
                                Object[] objArr69 = new Object[1];
                                c((short) 52, bArr21[7], bArr21[10], objArr69);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(tapTimeout3, jumpTapTimeout, jumpTapTimeout2, -887667012, false, (String) objArr69[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf8);
                        } catch (Exception unused4) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr66 = objArr66;
                        str15 = str15;
                    }
                    objArr7 = objArr66;
                } catch (Throwable th2) {
                    th = th2;
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i106 = ((int[]) objArr7[3])[0];
            int i107 = ((int[]) objArr7[0])[0];
            if (i107 != i106) {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr9 = (String[]) objArr7[1];
                if (strArr9 != null) {
                    for (String str18 : strArr9) {
                        arrayList2.add(str18);
                    }
                }
                throw new RuntimeException(String.valueOf(i107));
            }
            Object[] objArr70 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i108 = ((int[]) objArr7[2])[0];
            int i109 = ((int[]) objArr7[0])[0];
            int i110 = ((int[]) objArr7[3])[0];
            String[] strArr10 = (String[]) objArr7[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i111 = i108 + ((((~((-880099257) | iIdentityHashCode2)) | 71369488) * (-566)) - 1745829437) + ((~(iIdentityHashCode2 | (-808729769))) * 566);
            int i112 = (i111 << 13) ^ i111;
            int i113 = i112 ^ (i112 >>> 17);
            Object obj2 = objArr70[2];
            ((int[]) obj2)[0] = i113 ^ (i113 << 5);
            ((Field) lambdagetActiveAndAttachedSessionConfigs3.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{533691660, 572621608, 349259740}, ((int[]) obj2)[0], Integer.MAX_VALUE) + 1880000420);
            Intent intent = getIntent();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char cAlpha = (char) (Color.alpha(0) + 43042);
                int i114 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3110;
                int i115 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
                byte[] bArr22 = $$a;
                short s11 = bArr22[7];
                Object[] objArr71 = new Object[1];
                c(s11, (byte) s11, bArr22[10], objArr71);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cAlpha, i114, i115, -1272852037, false, (String) objArr71[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    char deadChar2 = (char) (KeyEvent.getDeadChar(0, 0) + 43042);
                    int iLastIndexOf3 = 3110 - TextUtils.lastIndexOf(str2, '0', 0);
                    int keyRepeatTimeout2 = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    Object[] objArr72 = new Object[1];
                    c((short) 104, (byte) 15, $$a[10], objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(deadChar2, iLastIndexOf3, keyRepeatTimeout2, 154975793, false, (String) objArr72[0], null);
                }
                Object[] objArr73 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
                int i116 = ((int[]) objArr73[2])[0];
                int i117 = ((int[]) objArr73[1])[0];
                String[] strArr11 = (String[]) objArr73[3];
                int[] iArr7 = {i117};
                int i118 = ~((Context) Class.forName("android.app.ActivityThread").getMethod(str5, new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
                int i119 = 426838298 + (((~(1067447773 | i118)) | 637583685) * (-828)) + ((i118 | 1067447773) * (-828)) + 1901857554;
                int i120 = (i119 << 13) ^ i119;
                int i121 = i120 ^ (i120 >>> 17);
                ((int[]) objArr8[0])[0] = i121 ^ (i121 << 5);
                objArr8 = new Object[]{new int[1], iArr7, new int[]{i116}, strArr11};
                str5 = str5;
            } else {
                Object[] objArr74 = {null, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 985351450};
                byte[] bArr23 = $$d;
                Object[] objArr75 = new Object[1];
                d((short) 347, bArr23[102], bArr23[3], objArr75);
                Class<?> cls4 = Class.forName((String) objArr75[0]);
                Object[] objArr76 = new Object[1];
                d((short) 462, bArr23[61], bArr23[89], objArr76);
                Object[] objArr77 = (Object[]) cls4.getMethod((String) objArr76[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr74);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43042);
                    int i122 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3112;
                    int offsetBefore = 22 - TextUtils.getOffsetBefore(str2, 0);
                    Object[] objArr78 = new Object[1];
                    c((short) 104, (byte) 15, $$a[10], objArr78);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(keyRepeatDelay, i122, offsetBefore, 154975793, false, (String) objArr78[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr77);
                try {
                    long jLongValue7 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char keyRepeatTimeout3 = (char) (43042 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int i123 = 3111 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iLastIndexOf4 = 21 - TextUtils.lastIndexOf(str2, '0');
                        byte[] bArr24 = $$a;
                        Object[] objArr79 = new Object[1];
                        c((short) 52, bArr24[7], bArr24[10], objArr79);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(keyRepeatTimeout3, i123, iLastIndexOf4, -1269618118, false, (String) objArr79[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 43042);
                        int iBlue2 = 3111 - Color.blue(0);
                        int i124 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22;
                        byte[] bArr25 = $$a;
                        short s12 = bArr25[7];
                        Object[] objArr80 = new Object[1];
                        c(s12, (byte) s12, bArr25[10], objArr80);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cResolveOpacity, iBlue2, i124, -1272852037, false, (String) objArr80[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf10);
                    objArr8 = objArr77;
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            }
            int i125 = ((int[]) objArr8[1])[0];
            int i126 = ((int[]) objArr8[2])[0];
            if (i126 == i125) {
                int i127 = ((int[]) objArr8[0])[0];
                int i128 = ((int[]) objArr8[2])[0];
                int i129 = ((int[]) objArr8[1])[0];
                String[] strArr12 = (String[]) objArr8[3];
                int[] iArr8 = {i128};
                int[] iArr9 = {i129};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i130 = 787407662 + (((~((-871844077) | iIdentityHashCode3)) | 39190728 | (~(833187382 | iIdentityHashCode3))) * (-754));
                int i131 = ~((-39190729) | iIdentityHashCode3);
                int i132 = ~iIdentityHashCode3;
                int i133 = i127 + i130 + ((i131 | (~(872378110 | i132))) * (-754)) + ((i132 | (-871844077)) * 754);
                int i134 = (i133 << 13) ^ i133;
                int i135 = i134 ^ (i134 >>> 17);
                ((int[]) objArr9[0])[0] = i135 ^ (i135 << 5);
                objArr9 = new Object[]{new int[1], iArr9, iArr8, strArr12};
                c6 = 0;
            } else {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr13 = (String[]) objArr8[3];
                if (strArr13 != null) {
                    for (String str19 : strArr13) {
                        int i136 = asBinder + 123;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i136 % 128;
                        int i137 = i136 % 2;
                        arrayList3.add(str19);
                    }
                }
                int[] iArr10 = new int[i126];
                int i138 = i126 - 1;
                iArr10[i138] = 1;
                Toast.makeText((Context) null, iArr10[((i126 * i138) % 2) - 1], 1).show();
                int i139 = ((int[]) objArr8[0])[0];
                int i140 = ((int[]) objArr8[2])[0];
                int i141 = ((int[]) objArr8[1])[0];
                String[] strArr14 = (String[]) objArr8[3];
                int[] iArr11 = {i140};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i142 = ~elapsedCpuTime;
                int i143 = i139 + (-1507728136) + ((456073712 | i142) * (-757)) + ((~((-1079022595) | elapsedCpuTime)) * 1514) + (((~(elapsedCpuTime | 1535096306)) | (~(i142 | (-1248957747))) | 169935152) * 757);
                int i144 = (i143 << 13) ^ i143;
                int i145 = i144 ^ (i144 >>> 17);
                c6 = 0;
                ((int[]) objArr9[0])[0] = i145 ^ (i145 << 5);
                objArr9 = new Object[]{new int[1], new int[]{i141}, iArr11, strArr14};
            }
            ((Field) UseCaseAttachState.TuitionPaymentFragmentbindingInflater1[c6]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{225305921, 1622148046, 473355311}, ((int[]) objArr9[c6])[c6], Integer.MAX_VALUE) + 224431091);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char c20 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int mode2 = 876 - View.MeasureSpec.getMode(0);
                int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr26 = $$a;
                short s13 = bArr26[7];
                Object[] objArr81 = new Object[1];
                c(s13, (byte) (s13 | 52), (byte) (bArr26[19] - 1), objArr81);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c20, mode2, doubleTapTimeout, 252381699, false, (String) objArr81[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null);
            long jLongValue8 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                int i146 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                int scrollBarFadeDuration2 = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr27 = $$a;
                Object[] objArr82 = new Object[1];
                c((short) 141, bArr27[7], bArr27[10], objArr82);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cNormalizeMetaState2, i146, scrollBarFadeDuration2, 2009631821, false, (String) objArr82[0], null);
            }
            if (j3 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) << 52) >>> 52)) >> 12)) {
                int i147 = asBinder + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i147 % 128;
                int i148 = i147 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char c21 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int packedPositionChild2 = 875 - ExpandableListView.getPackedPositionChild(0L);
                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                    Object[] objArr83 = new Object[1];
                    c((short) ($$b & 983), (byte) 52, $$a[7], objArr83);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c21, packedPositionChild2, scrollBarSize2, 256017550, false, (String) objArr83[0], null);
                }
                Object[] objArr84 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
                objArr10 = new Object[]{new int[]{((int[]) objArr84[0])[0]}, new int[1], new int[]{((int[]) objArr84[2])[0]}, (String[]) objArr84[3]};
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int i149 = (((704236372 + (((~((-44564491) | elapsedCpuTime2)) | (~((~elapsedCpuTime2) | (-4254262)))) * (-318))) + (((~(397284426 | elapsedCpuTime2)) | (-401538688)) * (-318))) + (((~(elapsedCpuTime2 | (-397284427))) | 356974197) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 1127748057;
                int i150 = (i149 << 13) ^ i149;
                int i151 = i150 ^ (i150 >>> 17);
                ((int[]) objArr10[1])[0] = i151 ^ (i151 << 5);
                str6 = str15;
            } else {
                Context baseContext5 = getBaseContext();
                if (baseContext5 == null) {
                    str6 = str15;
                    baseContext5 = (Context) Class.forName(str14).getMethod(str6, new Class[0]).invoke(null, null);
                } else {
                    str6 = str15;
                }
                if (baseContext5 != null) {
                    baseContext5 = (((baseContext5 instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext5).getBaseContext() != null) ? baseContext5.getApplicationContext() : null;
                }
                Object[] objArr85 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue()), -1127748057};
                byte[] bArr28 = $$d;
                byte b2 = bArr28[102];
                Object[] objArr86 = new Object[1];
                d((short) 304, b2, (byte) (b2 | 96), objArr86);
                Class<?> cls5 = Class.forName((String) objArr86[0]);
                Object[] objArr87 = new Object[1];
                d((short) ($$e & 965), bArr28[89], bArr28[153], objArr87);
                Object[] objArr88 = (Object[]) cls5.getMethod((String) objArr87[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr85);
                if (baseContext5 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                        char c22 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int mode3 = 876 - View.MeasureSpec.getMode(0);
                        int iIndexOf6 = TextUtils.indexOf(str2, str2, 0, 0) + 10;
                        Object[] objArr89 = new Object[1];
                        c((short) ($$b & 983), (byte) 52, $$a[7], objArr89);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c22, mode3, iIndexOf6, 256017550, false, (String) objArr89[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr88);
                    try {
                        long jLongValue9 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf11 = Long.valueOf(jLongValue9);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                            char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int mirror2 = AndroidCharacter.getMirror('0') + 828;
                            int iCombineMeasuredStates2 = 10 - View.combineMeasuredStates(0, 0);
                            byte[] bArr29 = $$a;
                            Object[] objArr90 = new Object[1];
                            c((short) 141, bArr29[7], bArr29[10], objArr90);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(windowTouchSlop3, mirror2, iCombineMeasuredStates2, 2009631821, false, (String) objArr90[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf11);
                        Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int i152 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int packedPositionType3 = 10 - ExpandableListView.getPackedPositionType(0L);
                            byte[] bArr30 = $$a;
                            short s14 = bArr30[7];
                            Object[] objArr91 = new Object[1];
                            c(s14, (byte) (s14 | 52), (byte) (bArr30[19] - 1), objArr91);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cMakeMeasureSpec, i152, packedPositionType3, 252381699, false, (String) objArr91[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf12);
                    } catch (Exception unused6) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr88 = objArr88;
                }
                objArr10 = objArr88;
            }
            int i153 = ((int[]) objArr10[2])[0];
            int i154 = ((int[]) objArr10[0])[0];
            if (i154 == i153) {
                int i155 = ((int[]) objArr10[1])[0];
                objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
                int i156 = ~((~((int) SystemClock.elapsedRealtime())) | (-417580487));
                int i157 = i155 + ((((-468443104) | i156) * (-970)) - 1175065510) + ((i156 | 50862617) * 970);
                int i158 = (i157 << 13) ^ i157;
                int i159 = i158 ^ (i158 >>> 17);
                c7 = 1;
                i3 = 0;
                ((int[]) objArr11[1])[0] = i159 ^ (i159 << 5);
            } else {
                int[] iArr12 = new int[i154];
                int i160 = i154 - 1;
                iArr12[i160] = 1;
                Toast.makeText((Context) null, iArr12[((i154 * i160) % 2) - 1], 1).show();
                int i161 = ((int[]) objArr10[1])[0];
                objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
                int i162 = (int) Runtime.getRuntime().totalMemory();
                int i163 = i161 + ((~((~i162) | (-1441941))) * 130) + 867440684 + (((~(i162 | (-1441941))) | 25233728) * 130);
                int i164 = (i163 << 13) ^ i163;
                int i165 = i164 ^ (i164 >>> 17);
                c7 = 1;
                i3 = 0;
                ((int[]) objArr11[1])[0] = i165 ^ (i165 << 5);
            }
            ((Field) getOrCreateUseCaseAttachInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{320369578, 195634850, 26876845}, ((int[]) objArr11[c7])[i3], Integer.MAX_VALUE) - (-398503839));
            setupViews(intent);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char cRgb3 = (char) (Color.rgb(i3, i3, i3) + 16777216);
                int tapTimeout4 = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                int iBlue3 = 15 - Color.blue(i3);
                byte[] bArr31 = $$a;
                short s15 = bArr31[7];
                Object[] objArr92 = new Object[1];
                c(s15, (byte) s15, bArr31[10], objArr92);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cRgb3, tapTimeout4, iBlue3, 1357589585, false, (String) objArr92[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null);
            long jLongValue10 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                int i166 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                int iIndexOf7 = 14 - TextUtils.indexOf((CharSequence) str2, '0', 0, 0);
                byte[] bArr32 = $$a;
                Object[] objArr93 = new Object[1];
                c((short) 52, bArr32[7], bArr32[10], objArr93);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(deadChar3, i166, iIndexOf7, 1344079056, false, (String) objArr93[0], null);
            }
            if (j4 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter(str2, 0);
                    int iMyTid3 = (Process.myTid() >> 22) + 1031;
                    int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr33 = $$a;
                    short s16 = bArr33[7];
                    Object[] objArr94 = new Object[1];
                    c(s16, (byte) (s16 | 52), (byte) (bArr33[19] - 1), objArr94);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(offsetAfter, iMyTid3, fadingEdgeLength, 632103528, false, (String) objArr94[0], null);
                }
                Object[] objArr95 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
                objArr12 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i167 = ((int[]) objArr95[3])[0];
                int i168 = ((int[]) objArr95[1])[0];
                String[] strArr15 = (String[]) objArr95[0];
                int i169 = ~System.identityHashCode(this);
                int i170 = (-99586683) + ((~((-302032153) | i169)) * 52) + (((~(703615171 | i169)) | (~(459335001 | i169)) | (-1005647324)) * (-52)) + (((~(i169 | (-703615172))) | 157302849) * 52) + 1643940837;
                int i171 = (i170 << 13) ^ i170;
                int i172 = i171 ^ (i171 >>> 17);
                ((int[]) objArr12[2])[0] = i172 ^ (i172 << 5);
            } else {
                int iIntValue3 = ((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr96 = {1531516063};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 46038), 1135 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr97 = {Integer.valueOf(iIntValue3), 0, 1643940837, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).newInstance(objArr96), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iIndexOf8 = TextUtils.indexOf(str2, str2, 0) + 1031;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                        byte[] bArr34 = $$a;
                        short s17 = bArr34[7];
                        Object[] objArr98 = new Object[1];
                        c(s17, (byte) s17, bArr34[10], objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cMakeMeasureSpec2, iIndexOf8, absoluteGravity, 1298546779, false, (String) objArr98[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45992), 1116 - ImageFormat.getBitsPerPixel(0), 17 - (ViewConfiguration.getTapTimeout() >> 16)), Boolean.TYPE});
                    }
                    objArr12 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).invoke(null, objArr97);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        int i173 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i174 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte[] bArr35 = $$a;
                        short s18 = bArr35[7];
                        Object[] objArr99 = new Object[1];
                        c(s18, (byte) (s18 | 52), (byte) (bArr35[19] - 1), objArr99);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cResolveSize, i173, i174, 632103528, false, (String) objArr99[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, objArr12);
                    try {
                        long jLongValue11 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf13 = Long.valueOf(jLongValue11);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                            int iKeyCodeFromString3 = 1031 - KeyEvent.keyCodeFromString(str2);
                            int minimumFlingVelocity = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            byte[] bArr36 = $$a;
                            Object[] objArr100 = new Object[1];
                            c((short) 52, bArr36[7], bArr36[10], objArr100);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(bitsPerPixel, iKeyCodeFromString3, minimumFlingVelocity, 1344079056, false, (String) objArr100[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf13);
                        Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                            char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int trimmedLength2 = 1031 - TextUtils.getTrimmedLength(str2);
                            int trimmedLength3 = 15 - TextUtils.getTrimmedLength(str2);
                            byte[] bArr37 = $$a;
                            short s19 = bArr37[7];
                            Object[] objArr101 = new Object[1];
                            c(s19, (byte) s19, bArr37[10], objArr101);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(jumpTapTimeout3, trimmedLength2, trimmedLength3, 1357589585, false, (String) objArr101[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf14);
                    } catch (Exception unused7) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        throw th;
                    }
                    throw cause2;
                }
            }
            int i175 = ((int[]) objArr12[1])[0];
            int i176 = ((int[]) objArr12[3])[0];
            if (i176 == i175) {
                objArr13 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i177 = ((int[]) objArr12[2])[0];
                int i178 = ((int[]) objArr12[3])[0];
                int i179 = ((int[]) objArr12[1])[0];
                String[] strArr16 = (String[]) objArr12[0];
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i180 = ~iIdentityHashCode4;
                int i181 = i177 + 125553621 + (((~((-33628329) | i180)) | 277908498) * 220) + (((~(i180 | (-590164202))) | 834444371) * (-440)) + ((iIdentityHashCode4 | (-33628329)) * 220);
                int i182 = (i181 << 13) ^ i181;
                int i183 = i182 ^ (i182 >>> 17);
                ((int[]) objArr13[2])[0] = i183 ^ (i183 << 5);
                c9 = 0;
                str7 = str5;
                c8 = 2;
            } else {
                ArrayList arrayList4 = new ArrayList();
                String[] strArr17 = (String[]) objArr12[0];
                if (strArr17 != null) {
                    int i184 = 0;
                    while (i184 < strArr17.length) {
                        int i185 = asBinder + 21;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i185 % 128;
                        if (i185 % 2 != 0) {
                            arrayList4.add(strArr17[i184]);
                            i184 += 112;
                        } else {
                            arrayList4.add(strArr17[i184]);
                            i184++;
                        }
                    }
                }
                int[] iArr13 = new int[i176];
                int i186 = i176 - 1;
                iArr13[i186] = 1;
                Toast.makeText((Context) null, iArr13[((i176 * i186) % 2) - 1], 1).show();
                objArr13 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i187 = ((int[]) objArr12[2])[0];
                int i188 = ((int[]) objArr12[3])[0];
                int i189 = ((int[]) objArr12[1])[0];
                String[] strArr18 = (String[]) objArr12[0];
                str7 = str5;
                int length = ((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1835203067;
                int i190 = ~length;
                int i191 = i187 + 753966085 + (((~(121094153 | i190)) | (-365374324) | (~((-121094154) | length))) * (-564)) + ((~(length | (-84344834))) * 1128) + (((~((-365374324) | i190)) | 36749320) * 564);
                int i192 = (i191 << 13) ^ i191;
                int i193 = i192 ^ (i192 >>> 17);
                c8 = 2;
                c9 = 0;
                ((int[]) objArr13[2])[0] = i193 ^ (i193 << 5);
            }
            ((Field) getUltraMaximumSize.TuitionPaymentFragmentspecialinlinedviewModeldefault1[c9]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{559328956, 527150324, 1042809281}, ((int[]) objArr13[c8])[c9], Integer.MAX_VALUE) + 1154840548);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char jumpTapTimeout4 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                int iIndexOf9 = TextUtils.indexOf((CharSequence) str2, '0', 0) + 1756;
                int i194 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                Object[] objArr102 = new Object[1];
                c((short) 104, (byte) 15, $$a[10], objArr102);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(jumpTapTimeout4, iIndexOf9, i194, 986134021, false, (String) objArr102[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                    int iIndexOf10 = TextUtils.indexOf((CharSequence) str2, '0', 0, 0) + 1756;
                    int i195 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr38 = $$a;
                    Object[] objArr103 = new Object[1];
                    c((short) 52, bArr38[7], bArr38[10], objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(packedPositionGroup2, iIndexOf10, i195, 1599039318, false, (String) objArr103[0], null);
                }
                Object[] objArr104 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
                objArr14 = new Object[]{new int[]{((int[]) objArr104[0])[0]}, new int[]{((int[]) objArr104[1])[0]}, (Object[]) objArr104[2], new int[1], (String[]) objArr104[4]};
                int i196 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
                int i197 = (-120790168) + (((~((-107750034) | i196)) | 103555712) * 345) + (((~((-107750034) | (~i196))) | 1296680) * 345) + ((~(i196 | (-103555713))) * 345) + 1943164458;
                int i198 = (i197 << 13) ^ i197;
                int i199 = i198 ^ (i198 >>> 17);
                ((int[]) objArr14[3])[0] = i199 ^ (i199 << 5);
            } else {
                int iIntValue4 = ((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue();
                Object[] objArr105 = {1515429992};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 42049), TextUtils.indexOf(str2, str2, 0, 0) + 1726, 29 - Gravity.getAbsoluteGravity(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue4, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).newInstance(objArr105), 1943164458, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char c23 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                    int iMyPid = 1755 - (Process.myPid() >> 22);
                    int iIndexOf11 = 22 - TextUtils.indexOf((CharSequence) str2, '0', 0, 0);
                    byte[] bArr39 = $$a;
                    Object[] objArr106 = new Object[1];
                    c((short) 52, bArr39[7], bArr39[10], objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(c23, iMyPid, iIndexOf11, 1599039318, false, (String) objArr106[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    long jLongValue12 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                        char fadingEdgeLength2 = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int i200 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iRed = Color.red(0) + 23;
                        byte[] bArr40 = $$a;
                        Object[] objArr107 = new Object[1];
                        c((short) 141, bArr40[7], bArr40[10], objArr107);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(fadingEdgeLength2, i200, iRed, 1596667560, false, (String) objArr107[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                        char c24 = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                        Object[] objArr108 = new Object[1];
                        c((short) 104, (byte) 15, $$a[10], objArr108);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(c24, maximumDrawingCacheSize, maxKeyCode, 986134021, false, (String) objArr108[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf16);
                    objArr14 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
            int i201 = ((int[]) objArr14[1])[0];
            int i202 = ((int[]) objArr14[0])[0];
            if (i202 == i201) {
                int i203 = ((int[]) objArr14[3])[0];
                objArr15 = new Object[]{new int[]{((int[]) objArr14[0])[0]}, new int[]{((int[]) objArr14[1])[0]}, (Object[]) objArr14[2], new int[1], (String[]) objArr14[4]};
                int i204 = ((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
                int i205 = ~i204;
                int i206 = i203 + 1958332176 + (((~((-149087837) | i205)) | 63514589) * 226) + (((~(i205 | (-136495105))) | (~((-63514590) | i204)) | 50921857) * (-113)) + ((~(i204 | (-149087837))) * 113);
                int i207 = (i206 << 13) ^ i206;
                int i208 = i207 ^ (i207 >>> 17);
                ((int[]) objArr15[3])[0] = i208 ^ (i208 << 5);
                i4 = 0;
                c10 = 3;
            } else {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr19 = (String[]) objArr14[4];
                if (strArr19 != null) {
                    for (String str20 : strArr19) {
                        arrayList5.add(str20);
                    }
                }
                Toast.makeText((Context) null, i202 / (((i202 - 1) * i202) % 2), 0).show();
                int i209 = ((int[]) objArr14[3])[0];
                objArr15 = new Object[]{new int[]{((int[]) objArr14[0])[0]}, new int[]{((int[]) objArr14[1])[0]}, (Object[]) objArr14[2], new int[1], (String[]) objArr14[4]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i210 = i209 + 1111385459 + (((-286007937) | (~iMaxMemory)) * (-490)) + (((~(iMaxMemory | 644043879)) | (-930051816)) * 490) + 1150105068;
                int i211 = (i210 << 13) ^ i210;
                int i212 = i211 ^ (i211 >>> 17);
                c10 = 3;
                i4 = 0;
                ((int[]) objArr15[3])[0] = i212 ^ (i212 << 5);
            }
            ((Field) getMaximumSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i4]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1043736272, 1811217536, 833610618}, ((int[]) objArr15[c10])[i4], Integer.MAX_VALUE) - (-667285796));
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf(str2, '0', i4, i4) + 1);
                int iIndexOf12 = 651 - TextUtils.indexOf(str2, str2, i4);
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44;
                byte[] bArr41 = $$a;
                Object[] objArr109 = new Object[1];
                c((short) 141, bArr41[7], bArr41[10], objArr109);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cLastIndexOf2, iIndexOf12, maximumDrawingCacheSize2, -459846511, false, (String) objArr109[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null);
            long jLongValue13 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cAlpha2 = (char) Color.alpha(0);
                int iIndexOf13 = 651 - TextUtils.indexOf(str2, str2);
                int iBlue4 = Color.blue(0) + 44;
                byte[] bArr42 = $$a;
                short s20 = bArr42[7];
                Object[] objArr110 = new Object[1];
                c(s20, (byte) (s20 | 52), (byte) (bArr42[19] - 1), objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cAlpha2, iIndexOf13, iBlue4, -873460649, false, (String) objArr110[0], null);
            }
            if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char cLastIndexOf3 = (char) ((-1) - TextUtils.lastIndexOf(str2, '0', 0));
                    int deadChar4 = 651 - KeyEvent.getDeadChar(0, 0);
                    int i213 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45;
                    Object[] objArr111 = new Object[1];
                    c((short) 104, (byte) 15, $$a[10], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cLastIndexOf3, deadChar4, i213, -1595579076, false, (String) objArr111[0], null);
                }
                Object[] objArr112 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
                objArr16 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i214 = ((int[]) objArr112[2])[0];
                int i215 = ((int[]) objArr112[0])[0];
                int i216 = ((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
                int i217 = (-1272424567) + (((~((-661518174) | i216)) | 4481564 | (~(658087363 | i216))) * (-880));
                int i218 = (~((-661518174) | (~i216))) | (-658087364);
                int i219 = ~(i216 | 661518173);
                int i220 = i217 + ((i218 | i219) * (-880)) + (i219 * 880) + 1267776843;
                int i221 = (i220 << 13) ^ i220;
                int i222 = i221 ^ (i221 >>> 17);
                ((int[]) objArr16[3])[0] = i222 ^ (i222 << 5);
                c11 = 0;
                i5 = 2;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), Color.green(0) + 1610, (ViewConfiguration.getLongPressTimeout() >> 16) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr113 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).newInstance(null), 1267776843, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                    int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 651;
                    int iIndexOf14 = TextUtils.indexOf(str2, str2, 0) + 44;
                    byte[] bArr43 = $$a;
                    short s21 = bArr43[7];
                    Object[] objArr114 = new Object[1];
                    c(s21, (byte) (s21 | 52), (byte) (bArr43[19] - 1), objArr114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(absoluteGravity2, packedPositionGroup3, iIndexOf14, 2075921419, false, (String) objArr114[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getScrollBarSize() >> 8), 695 - View.resolveSize(0, 0), 98 - TextUtils.indexOf(str2, str2, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf(str2, '0', 0) + 63407), (ViewConfiguration.getJumpTapTimeout() >> 16) + 793, TextUtils.getOffsetAfter(str2, 0) + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr16 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).invoke(null, objArr113);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                    char c25 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int iIndexOf15 = TextUtils.indexOf((CharSequence) str2, '0', 0, 0) + 652;
                    int windowTouchSlop4 = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    Object[] objArr115 = new Object[1];
                    c((short) 104, (byte) 15, $$a[10], objArr115);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c25, iIndexOf15, windowTouchSlop4, -1595579076, false, (String) objArr115[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, objArr16);
                try {
                    long jLongValue14 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                        char tapTimeout5 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int absoluteGravity3 = 651 - Gravity.getAbsoluteGravity(0, 0);
                        int i223 = 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte[] bArr44 = $$a;
                        short s22 = bArr44[7];
                        Object[] objArr116 = new Object[1];
                        c(s22, (byte) (s22 | 52), (byte) (bArr44[19] - 1), objArr116);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(tapTimeout5, absoluteGravity3, i223, -873460649, false, (String) objArr116[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                        char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i224 = 651 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
                        byte[] bArr45 = $$a;
                        Object[] objArr117 = new Object[1];
                        c((short) 141, bArr45[7], bArr45[10], objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(maximumFlingVelocity3, i224, modifierMetaStateMask, -459846511, false, (String) objArr117[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, lValueOf18);
                    int i225 = asBinder + 103;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i225 % 128;
                    i5 = 2;
                    if (i225 % 2 != 0) {
                        int i226 = 4 / 5;
                    }
                    c11 = 0;
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
            int i227 = ((int[]) objArr16[c11])[c11];
            int i228 = ((int[]) objArr16[i5])[c11];
            if (i228 == i227) {
                int i229 = asBinder + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i229 % 128;
                int i230 = i229 % i5;
                Object[] objArr118 = new Object[4];
                objArr118[0] = new int[]{i};
                objArr118[i5] = new int[]{i};
                objArr118[3] = new int[1];
                int i231 = ((int[]) objArr16[3])[0];
                int i232 = ((int[]) objArr16[i5])[0];
                int i233 = ((int[]) objArr16[0])[0];
                objArr118[1] = new String[0];
                int iNextInt = new Random().nextInt();
                int i234 = i231 + 447356959 + (((~((~iNextInt) | (-456130630))) | (~((-5095689) | iNextInt))) * (-302)) + ((~((-456130630) | iNextInt)) * (-604)) + (((~(iNextInt | (-461226318))) | (-469752816)) * 302);
                int i235 = i234 ^ (i234 << 13);
                int i236 = i235 ^ (i235 >>> 17);
                ((int[]) objArr118[3])[0] = i236 ^ (i236 << 5);
                objArr17 = objArr118;
                c13 = 0;
                c12 = 3;
            } else {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr20 = (String[]) objArr16[1];
                if (strArr20 != null) {
                    int i237 = asBinder + 103;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i237 % 128;
                    int i238 = i237 % 2;
                    for (String str21 : strArr20) {
                        arrayList6.add(str21);
                    }
                }
                int[] iArr14 = new int[i228];
                int i239 = i228 - 1;
                iArr14[i239] = 1;
                Toast.makeText((Context) null, iArr14[((i228 * i239) % 2) - 1], 1).show();
                objArr17 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i240 = ((int[]) objArr16[3])[0];
                int i241 = ((int[]) objArr16[2])[0];
                int i242 = ((int[]) objArr16[0])[0];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i243 = ~((-147785595) | startElapsedRealtime);
                int i244 = ~startElapsedRealtime;
                int i245 = i240 + 2105328369 + ((i243 | (~((-144354785) | i244))) * (-1808)) + (((~((-4522523) | startElapsedRealtime)) | (~(i244 | (-1091713)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(startElapsedRealtime | 144354784)) | 143263072 | (~(147785594 | i244))) * TypedValues.Custom.TYPE_BOOLEAN);
                int i246 = (i245 << 13) ^ i245;
                int i247 = i246 ^ (i246 >>> 17);
                c12 = 3;
                c13 = 0;
                ((int[]) objArr17[3])[0] = i247 ^ (i247 << 5);
            }
            ((Field) removeSurfaceConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2[c13]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1398279756, 1897591268, 368243297}, ((int[]) objArr17[c12])[c13], Integer.MAX_VALUE));
            setImageData(intent);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) str2, '0'));
                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                int iAlpha = 28 - Color.alpha(0);
                byte[] bArr46 = $$a;
                short s23 = bArr46[7];
                Object[] objArr119 = new Object[1];
                c(s23, (byte) (s23 | 52), (byte) (bArr46[19] - 1), objArr119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cIndexOf, minimumFlingVelocity2, iAlpha, -1048449946, false, (String) objArr119[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char cResolveOpacity2 = (char) (Drawable.resolveOpacity(0, 0) + 31533);
                    int iRgb = (-16776295) - Color.rgb(0, 0, 0);
                    int fadingEdgeLength3 = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    Object[] objArr120 = new Object[1];
                    c((short) 104, (byte) 15, $$a[10], objArr120);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cResolveOpacity2, iRgb, fadingEdgeLength3, -1142834547, false, (String) objArr120[0], null);
                }
                Object[] objArr121 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).get(null);
                objArr18 = new Object[]{new int[1], new int[]{((int[]) objArr121[1])[0]}, (Object[]) objArr121[2], new int[]{((int[]) objArr121[3])[0]}, (String[]) objArr121[4]};
                int i248 = ((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 86597518;
                int i249 = ~i248;
                int i250 = (((3284954 + (((~((-1397969910) | i249)) | 376109734) * (-90))) + (((~((-1397969910) | i248)) | (-1467743224)) * (-45))) + ((((~(i248 | (-376109735))) | (-1397969910)) | (~(i249 | 376109734))) * 45)) - 228798934;
                int i251 = (i250 << 13) ^ i250;
                int i252 = i251 ^ (i251 >>> 17);
                ((int[]) objArr18[0])[0] = i252 ^ (i252 << 5);
                str8 = str4;
            } else {
                Context baseContext6 = getBaseContext();
                if (baseContext6 == null) {
                    baseContext6 = (Context) Class.forName(str14).getMethod(str9, new Class[0]).invoke(null, null);
                }
                if (baseContext6 != null) {
                    int i253 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                    asBinder = i253 % 128;
                    int i254 = i253 % 2;
                    if ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) {
                        str9 = str6;
                        baseContext6 = null;
                    } else {
                        str9 = str6;
                        str9 = str6;
                        baseContext6 = baseContext6.getApplicationContext();
                    }
                }
                str9 = str6;
                str8 = str4;
                Object[] objArr122 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str8, Object.class).invoke(null, this)).intValue()), 0, -228798934};
                byte[] bArr47 = $$d;
                Object[] objArr123 = new Object[1];
                d((short) 141, bArr47[16], bArr47[122], objArr123);
                Class<?> cls6 = Class.forName((String) objArr123[0]);
                Object[] objArr124 = new Object[1];
                d((short) 103, bArr47[89], bArr47[153], objArr124);
                objArr18 = (Object[]) cls6.getMethod((String) objArr124[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr122);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char c26 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                    int iMakeMeasureSpec2 = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iCombineMeasuredStates3 = 28 - View.combineMeasuredStates(0, 0);
                    Object[] objArr125 = new Object[1];
                    c((short) 104, (byte) 15, $$a[10], objArr125);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(c26, iMakeMeasureSpec2, iCombineMeasuredStates3, -1142834547, false, (String) objArr125[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, objArr18);
                try {
                    long jLongValue15 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                        char c27 = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int deadChar5 = 921 - KeyEvent.getDeadChar(0, 0);
                        int i255 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27;
                        byte[] bArr48 = $$a;
                        Object[] objArr126 = new Object[1];
                        c((short) 52, bArr48[7], bArr48[10], objArr126);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(c27, deadChar5, i255, -778300370, false, (String) objArr126[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                        char jumpTapTimeout5 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                        int iLastIndexOf5 = TextUtils.lastIndexOf(str2, '0') + 29;
                        byte[] bArr49 = $$a;
                        short s24 = bArr49[7];
                        Object[] objArr127 = new Object[1];
                        c(s24, (byte) (s24 | 52), (byte) (bArr49[19] - 1), objArr127);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(jumpTapTimeout5, edgeSlop2, iLastIndexOf5, -1048449946, false, (String) objArr127[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
            int i256 = ((int[]) objArr18[1])[0];
            int i257 = ((int[]) objArr18[3])[0];
            if (i257 != i256) {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr21 = (String[]) objArr18[4];
                if (strArr21 != null) {
                    for (String str22 : strArr21) {
                        arrayList7.add(str22);
                    }
                }
                throw new RuntimeException(String.valueOf(i257));
            }
            int i258 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            asBinder = i258 % 128;
            int i259 = i258 % 2;
            int i260 = ((int[]) objArr18[0])[0];
            Object[] objArr128 = {new int[1], new int[]{((int[]) objArr18[1])[0]}, (Object[]) objArr18[2], new int[]{((int[]) objArr18[3])[0]}, (String[]) objArr18[4]};
            int i261 = (~System.identityHashCode(this)) | 377562449;
            int i262 = i260 + (-1718680118) + (i261 * 495) + (((~i261) | 302063936) * 495);
            int i263 = (i262 << 13) ^ i262;
            int i264 = i263 ^ (i263 >>> 17);
            Object obj3 = objArr128[0];
            ((int[]) obj3)[0] = i264 ^ (i264 << 5);
            ((Field) SurfaceCombination.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1882367539, 1220081412, 1837729587}, ((int[]) obj3)[0], Integer.MAX_VALUE) - (-618825879));
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int iIndexOf16 = TextUtils.indexOf(str2, str2, 0) + 876;
                int maximumDrawingCacheSize3 = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                short s25 = (short) ($$b & 983);
                byte[] bArr50 = $$a;
                Object[] objArr129 = new Object[1];
                c(s25, (byte) (bArr50[2] - 1), bArr50[19], objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cArgb, iIndexOf16, maximumDrawingCacheSize3, -1199417970, false, (String) objArr129[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).getLong(null);
            long jLongValue16 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char c28 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i265 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                int mirror3 = ':' - AndroidCharacter.getMirror('0');
                Object[] objArr130 = new Object[1];
                c((short) 203, (byte) 52, (byte) (-$$a[14]), objArr130);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c28, i265, mirror3, 254769921, false, (String) objArr130[0], null);
            }
            if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char c29 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 876;
                    int windowTouchSlop5 = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr51 = $$a;
                    Object[] objArr131 = new Object[1];
                    c((short) 203, (byte) (-bArr51[44]), bArr51[19], objArr131);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(c29, pressedStateDuration, windowTouchSlop5, 1324201839, false, (String) objArr131[0], null);
                }
                Object[] objArr132 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).get(null);
                objArr19 = new Object[]{new int[]{((int[]) objArr132[0])[0]}, new int[1], new int[]{((int[]) objArr132[2])[0]}, (String[]) objArr132[3]};
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i266 = ((681031930 + (((~(714825010 | iIdentityHashCode5)) | 755135239) * (-366))) + (((~(iIdentityHashCode5 | 798719799)) | 671240450) * 366)) - 1951899068;
                int i267 = (i266 << 13) ^ i266;
                int i268 = i267 ^ (i267 >>> 17);
                ((int[]) objArr19[1])[0] = i268 ^ (i268 << 5);
            } else {
                Object[] objArr133 = {Integer.valueOf(((Integer) Class.forName(str12).getMethod(str8, Object.class).invoke(null, this)).intValue()), -1951899068};
                byte[] bArr52 = $$d;
                byte b3 = bArr52[44];
                Object[] objArr134 = new Object[1];
                d(b3, bArr52[102], b3, objArr134);
                Class<?> cls7 = Class.forName((String) objArr134[0]);
                short s26 = bArr52[89];
                Object[] objArr135 = new Object[1];
                d(s26, (byte) s26, bArr52[116], objArr135);
                objArr19 = (Object[]) cls7.getMethod((String) objArr135[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr133);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) str2, '0', 0));
                    int i269 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int mirror4 = AndroidCharacter.getMirror('0') - '&';
                    byte[] bArr53 = $$a;
                    Object[] objArr136 = new Object[1];
                    c((short) 203, (byte) (-bArr53[44]), bArr53[19], objArr136);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cIndexOf2, i269, mirror4, 1324201839, false, (String) objArr136[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr19);
                try {
                    long jLongValue17 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                        char c30 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int trimmedLength4 = 876 - TextUtils.getTrimmedLength(str2);
                        int iMyTid4 = (Process.myTid() >> 22) + 10;
                        Object[] objArr137 = new Object[1];
                        c((short) 203, (byte) 52, (byte) (-$$a[14]), objArr137);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(c30, trimmedLength4, iMyTid4, 254769921, false, (String) objArr137[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                        int packedPositionType4 = 10 - ExpandableListView.getPackedPositionType(0L);
                        short s27 = (short) ($$b & 983);
                        byte[] bArr54 = $$a;
                        Object[] objArr138 = new Object[1];
                        c(s27, (byte) (bArr54[2] - 1), bArr54[19], objArr138);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(size, maxKeyCode2, packedPositionType4, -1199417970, false, (String) objArr138[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr19[0])[0] != ((int[]) objArr19[2])[0]) {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr22 = (String[]) objArr19[3];
                if (strArr22 != null) {
                    for (String str23 : strArr22) {
                        arrayList8.add(str23);
                    }
                }
                throw null;
            }
            int i270 = ((int[]) objArr19[1])[0];
            Object[] objArr139 = {new int[]{((int[]) objArr19[0])[0]}, new int[1], new int[]{((int[]) objArr19[2])[0]}, (String[]) objArr19[3]};
            int length2 = ((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_backend_error_message_1053).substring(0, 53).length() - 1304655662;
            int i271 = i270 + (-324286932) + ((~((~length2) | (-553963561))) * 433) + (((~(793631529 | length2)) | (-833941759)) * (-433)) + (((~(length2 | (-833941759))) | 239667969) * 433);
            int i272 = (i271 << 13) ^ i271;
            int i273 = i272 ^ (i272 >>> 17);
            Object obj4 = objArr139[1];
            ((int[]) obj4)[0] = i273 ^ (i273 << 5);
            ((Field) getElementsArrangements.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{2138949336, 136291023, 1143574419}, ((int[]) obj4)[0], Integer.MAX_VALUE) + 764292804);
            setInitialState();
            addBlockingView();
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        getMenuInflater().inflate(R.menu.ucrop_menu_activity, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_loader);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.mToolbarWidgetColor, PorterDuff.Mode.SRC_ATOP);
                menuItemFindItem.setIcon(icon);
            } catch (IllegalStateException e2) {
                new Object[]{e2.getMessage(), getString(R.string.ucrop_mutate_exception_hint)};
            }
            ((Animatable) menuItemFindItem.getIcon()).start();
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_crop);
        Drawable drawable = ContextCompat.getDrawable(this, this.mToolbarCropDrawable);
        if (drawable == null) {
            return true;
        }
        int i4 = asBinder + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            drawable.mutate();
            drawable.setColorFilter(this.mToolbarWidgetColor, PorterDuff.Mode.SRC_ATOP);
            menuItemFindItem2.setIcon(drawable);
            return true;
        }
        drawable.mutate();
        drawable.setColorFilter(this.mToolbarWidgetColor, PorterDuff.Mode.SRC_ATOP);
        menuItemFindItem2.setIcon(drawable);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            menu.findItem(R.id.menu_crop).setVisible(this.mShowLoader);
            menu.findItem(R.id.menu_loader).setVisible(this.mShowLoader);
        } else {
            menu.findItem(R.id.menu_crop).setVisible(!this.mShowLoader);
            menu.findItem(R.id.menu_loader).setVisible(this.mShowLoader);
        }
        boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return zOnPrepareOptionsMenu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r6.getItemId() == com.yalantis.ucrop.R.id.menu_crop) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        cropAndSaveImage();
        defpackage.ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r6.getItemId() != 16908332) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        onBackPressed();
        defpackage.ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r6 = super.onOptionsItemSelected(r6);
        defpackage.ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r1 = com.yalantis.ucrop.UCropActivity.asBinder + 7;
        com.yalantis.ucrop.UCropActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r6.getItemId() == com.yalantis.ucrop.R.id.menu_crop) goto L11;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.yalantis.ucrop.UCropActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.yalantis.ucrop.UCropActivity.asBinder = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L1e
            defpackage.ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6)
            int r1 = r6.getItemId()     // Catch: java.lang.Throwable -> L51
            int r3 = com.yalantis.ucrop.R.id.menu_crop     // Catch: java.lang.Throwable -> L51
            r4 = 4
            int r4 = r4 / 0
            if (r1 != r3) goto L30
            goto L29
        L1e:
            defpackage.ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6)
            int r1 = r6.getItemId()     // Catch: java.lang.Throwable -> L51
            int r3 = com.yalantis.ucrop.R.id.menu_crop     // Catch: java.lang.Throwable -> L51
            if (r1 != r3) goto L30
        L29:
            r5.cropAndSaveImage()     // Catch: java.lang.Throwable -> L51
            defpackage.ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3()     // Catch: java.lang.Throwable -> L51
            return r2
        L30:
            int r1 = r6.getItemId()     // Catch: java.lang.Throwable -> L51
            r3 = 16908332(0x102002c, float:2.3877352E-38)
            if (r1 != r3) goto L40
            r5.onBackPressed()     // Catch: java.lang.Throwable -> L51
            defpackage.ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3()     // Catch: java.lang.Throwable -> L51
            return r2
        L40:
            boolean r6 = super.onOptionsItemSelected(r6)     // Catch: java.lang.Throwable -> L51
            defpackage.ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3()     // Catch: java.lang.Throwable -> L51
            int r1 = com.yalantis.ucrop.UCropActivity.asBinder
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.yalantis.ucrop.UCropActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            return r6
        L51:
            r6 = move-exception
            defpackage.ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        if (gestureCropImageView != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            gestureCropImageView.cancelAllAnimations();
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        asBinder = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private void setImageData(Intent intent) throws Throwable {
        int i = 2 % 2;
        Uri uri = (Uri) intent.getParcelableExtra(UCrop.EXTRA_INPUT_URI);
        Uri uri2 = (Uri) intent.getParcelableExtra(UCrop.EXTRA_OUTPUT_URI);
        processOptions(intent);
        if (uri != null) {
            int i2 = asBinder + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (uri2 != null) {
                try {
                    this.mGestureCropImageView.setImageUri(uri, uri2);
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                } catch (Exception e2) {
                    setResultError(e2);
                    finish();
                    return;
                }
            }
        }
        setResultError(new NullPointerException(getString(R.string.ucrop_error_input_data_is_absent)));
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0175  */
    /* JADX WARN: Code duplicated, block: B:33:0x0180  */
    /* JADX WARN: Code duplicated, block: B:35:0x0186  */
    /* JADX WARN: Code duplicated, block: B:36:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a5  */
    private void processOptions(Intent intent) throws Throwable {
        Bitmap.CompressFormat compressFormatValueOf;
        int i;
        int i2 = 2 % 2;
        String stringExtra = intent.getStringExtra(UCrop.Options.EXTRA_COMPRESSION_FORMAT_NAME);
        Object obj = null;
        if (TextUtils.isEmpty(stringExtra)) {
            compressFormatValueOf = null;
        } else {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            compressFormatValueOf = Bitmap.CompressFormat.valueOf(stringExtra);
        }
        if (compressFormatValueOf == null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            compressFormatValueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.mCompressFormat = compressFormatValueOf;
        this.mCompressQuality = intent.getIntExtra(UCrop.Options.EXTRA_COMPRESSION_QUALITY, 90);
        int[] intArrayExtra = intent.getIntArrayExtra(UCrop.Options.EXTRA_ALLOWED_GESTURES);
        if (intArrayExtra != null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            asBinder = i6 % 128;
            if (i6 % 2 != 0 ? intArrayExtra.length == 3 : intArrayExtra.length == 4) {
                this.mAllowedGestures = intArrayExtra;
            }
        }
        this.mGestureCropImageView.setMaxBitmapSize(intent.getIntExtra(UCrop.Options.EXTRA_MAX_BITMAP_SIZE, 0));
        this.mGestureCropImageView.setMaxScaleMultiplier(intent.getFloatExtra(UCrop.Options.EXTRA_MAX_SCALE_MULTIPLIER, 10.0f));
        this.mGestureCropImageView.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra(UCrop.Options.EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, 500));
        this.mOverlayView.setFreestyleCropEnabled(intent.getBooleanExtra(UCrop.Options.EXTRA_FREE_STYLE_CROP, false));
        this.mOverlayView.setDimmedColor(intent.getIntExtra(UCrop.Options.EXTRA_DIMMED_LAYER_COLOR, getResources().getColor(R.color.ucrop_color_default_dimmed)));
        this.mOverlayView.setCircleDimmedLayer(intent.getBooleanExtra(UCrop.Options.EXTRA_CIRCLE_DIMMED_LAYER, false));
        this.mOverlayView.setShowCropFrame(intent.getBooleanExtra(UCrop.Options.EXTRA_SHOW_CROP_FRAME, true));
        this.mOverlayView.setCropFrameColor(intent.getIntExtra(UCrop.Options.EXTRA_CROP_FRAME_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_frame)));
        this.mOverlayView.setCropFrameStrokeWidth(intent.getIntExtra(UCrop.Options.EXTRA_CROP_FRAME_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width)));
        this.mOverlayView.setShowCropGrid(intent.getBooleanExtra(UCrop.Options.EXTRA_SHOW_CROP_GRID, true));
        this.mOverlayView.setCropGridRowCount(intent.getIntExtra(UCrop.Options.EXTRA_CROP_GRID_ROW_COUNT, 2));
        this.mOverlayView.setCropGridColumnCount(intent.getIntExtra(UCrop.Options.EXTRA_CROP_GRID_COLUMN_COUNT, 2));
        this.mOverlayView.setCropGridColor(intent.getIntExtra(UCrop.Options.EXTRA_CROP_GRID_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        this.mOverlayView.setCropGridStrokeWidth(intent.getIntExtra(UCrop.Options.EXTRA_CROP_GRID_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width)));
        float floatExtra = intent.getFloatExtra(UCrop.EXTRA_ASPECT_RATIO_X, 0.0f);
        float floatExtra2 = intent.getFloatExtra(UCrop.EXTRA_ASPECT_RATIO_Y, 0.0f);
        int intExtra = intent.getIntExtra(UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (floatExtra > 0.0f) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            if (floatExtra2 > 0.0f) {
                ViewGroup viewGroup = this.mWrapperStateAspectRatio;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                    int i9 = asBinder + 43;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    int i10 = i9 % 2;
                }
                this.mGestureCropImageView.setTargetAspectRatio(floatExtra / floatExtra2);
            } else if (parcelableArrayListExtra != null) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                asBinder = i % 128;
                if (i % 2 != 0) {
                    parcelableArrayListExtra.size();
                    throw null;
                }
                if (intExtra < parcelableArrayListExtra.size()) {
                    this.mGestureCropImageView.setTargetAspectRatio(((AspectRatio) parcelableArrayListExtra.get(intExtra)).getAspectRatioX() / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).getAspectRatioY());
                } else {
                    this.mGestureCropImageView.setTargetAspectRatio(0.0f);
                }
            } else {
                this.mGestureCropImageView.setTargetAspectRatio(0.0f);
            }
        } else if (parcelableArrayListExtra != null) {
            i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
            asBinder = i % 128;
            if (i % 2 != 0) {
                parcelableArrayListExtra.size();
                throw null;
            }
            if (intExtra < parcelableArrayListExtra.size()) {
                this.mGestureCropImageView.setTargetAspectRatio(((AspectRatio) parcelableArrayListExtra.get(intExtra)).getAspectRatioX() / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).getAspectRatioY());
            } else {
                this.mGestureCropImageView.setTargetAspectRatio(0.0f);
            }
        } else {
            this.mGestureCropImageView.setTargetAspectRatio(0.0f);
        }
        int intExtra2 = intent.getIntExtra(UCrop.EXTRA_MAX_SIZE_X, 0);
        int intExtra3 = intent.getIntExtra(UCrop.EXTRA_MAX_SIZE_Y, 0);
        if (intExtra2 <= 0 || intExtra3 <= 0) {
            return;
        }
        this.mGestureCropImageView.setMaxResultImageSizeX(intExtra2);
        this.mGestureCropImageView.setMaxResultImageSizeY(intExtra3);
    }

    private void setupViews(Intent intent) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.mStatusBarColor = intent.getIntExtra(UCrop.Options.EXTRA_STATUS_BAR_COLOR, ContextCompat.getColor(this, R.color.ucrop_color_statusbar));
        this.mToolbarColor = intent.getIntExtra(UCrop.Options.EXTRA_TOOL_BAR_COLOR, ContextCompat.getColor(this, R.color.ucrop_color_toolbar));
        this.mActiveControlsWidgetColor = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE, ContextCompat.getColor(this, R.color.ucrop_color_active_controls_color));
        this.mToolbarWidgetColor = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_WIDGET_COLOR_TOOLBAR, ContextCompat.getColor(this, R.color.ucrop_color_toolbar_widget));
        this.mToolbarCancelDrawable = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE, R.drawable.ucrop_ic_cross);
        this.mToolbarCropDrawable = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_WIDGET_CROP_DRAWABLE, R.drawable.ucrop_ic_done);
        String stringExtra = intent.getStringExtra(UCrop.Options.EXTRA_UCROP_TITLE_TEXT_TOOLBAR);
        this.mToolbarTitle = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(R.string.ucrop_label_edit_photo);
            int i4 = asBinder + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        }
        this.mToolbarTitle = stringExtra;
        this.mLogoColor = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_LOGO_COLOR, ContextCompat.getColor(this, R.color.ucrop_color_default_logo));
        this.mShowBottomControls = !intent.getBooleanExtra(UCrop.Options.EXTRA_HIDE_BOTTOM_CONTROLS, false);
        this.mRootViewBackgroundColor = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, ContextCompat.getColor(this, R.color.ucrop_color_crop_background));
        setupAppBar();
        initiateRootViews();
        if (this.mShowBottomControls) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(R.id.ucrop_photobox)).findViewById(R.id.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(R.layout.ucrop_controls, viewGroup, true);
            AutoTransition autoTransition = new AutoTransition();
            this.mControlsTransition = autoTransition;
            autoTransition.setDuration(CONTROLS_ANIMATION_DURATION);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.state_aspect_ratio);
            this.mWrapperStateAspectRatio = viewGroup2;
            viewGroup2.setOnClickListener(this.mStateClickListener);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.state_rotate);
            this.mWrapperStateRotate = viewGroup3;
            viewGroup3.setOnClickListener(this.mStateClickListener);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.state_scale);
            this.mWrapperStateScale = viewGroup4;
            viewGroup4.setOnClickListener(this.mStateClickListener);
            this.mLayoutAspectRatio = (ViewGroup) findViewById(R.id.layout_aspect_ratio);
            this.mLayoutRotate = (ViewGroup) findViewById(R.id.layout_rotate_wheel);
            this.mLayoutScale = (ViewGroup) findViewById(R.id.layout_scale_wheel);
            setupAspectRatioWidget(intent);
            setupRotateWidget();
            setupScaleWidget();
            setupStatesWrapper();
        }
    }

    private void setupAppBar() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        setStatusBarColor(this.mStatusBarColor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(this.mToolbarColor);
        toolbar.setTitleTextColor(this.mToolbarWidgetColor);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        textView.setTextColor(this.mToolbarWidgetColor);
        textView.setText(this.mToolbarTitle);
        Drawable drawableMutate = ContextCompat.getDrawable(this, this.mToolbarCancelDrawable).mutate();
        drawableMutate.setColorFilter(this.mToolbarWidgetColor, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(drawableMutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i4 = asBinder + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 57 / 0;
        }
    }

    private void initiateRootViews() {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        UCropView uCropView = (UCropView) findViewById(R.id.ucrop);
        this.mUCropView = uCropView;
        this.mGestureCropImageView = uCropView.getCropImageView();
        this.mOverlayView = this.mUCropView.getOverlayView();
        this.mGestureCropImageView.setTransformImageListener(this.mImageListener);
        ((ImageView) findViewById(R.id.image_view_logo)).setColorFilter(this.mLogoColor, PorterDuff.Mode.SRC_ATOP);
        findViewById(R.id.ucrop_frame).setBackgroundColor(this.mRootViewBackgroundColor);
        if (this.mShowBottomControls) {
            return;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            ((ViewGroup.MarginLayoutParams) ((RelativeLayout.LayoutParams) findViewById(R.id.ucrop_frame).getLayoutParams())).bottomMargin = 1;
            i = R.id.ucrop_frame;
        } else {
            ((ViewGroup.MarginLayoutParams) ((RelativeLayout.LayoutParams) findViewById(R.id.ucrop_frame).getLayoutParams())).bottomMargin = 0;
            i = R.id.ucrop_frame;
        }
        findViewById(i).requestLayout();
    }

    private void setupStatesWrapper() {
        int i = 2 % 2;
        ImageView imageView = (ImageView) findViewById(R.id.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(R.id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(R.id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new SelectedStateListDrawable(imageView.getDrawable(), this.mActiveControlsWidgetColor));
        imageView2.setImageDrawable(new SelectedStateListDrawable(imageView2.getDrawable(), this.mActiveControlsWidgetColor));
        imageView3.setImageDrawable(new SelectedStateListDrawable(imageView3.getDrawable(), this.mActiveControlsWidgetColor));
        int i2 = asBinder + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void setStatusBarColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Window window = getWindow();
        if (window != null) {
            int i5 = asBinder + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
            int i7 = asBinder + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008f A[LOOP:0: B:13:0x0089->B:15:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x00dc A[LOOP:1: B:17:0x00d6->B:19:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r1 r12
  0x002c: PHI (r1v5 int) = (r1v4 int), (r1v19 int) binds: [B:8:0x002a, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r12v2 java.util.ArrayList) = (r12v1 java.util.ArrayList), (r12v11 java.util.ArrayList) binds: [B:8:0x002a, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    private void setupAspectRatioWidget(Intent intent) {
        int intExtra;
        ArrayList<AspectRatio> parcelableArrayListExtra;
        LinearLayout linearLayout;
        LinearLayout.LayoutParams layoutParams;
        Iterator<ViewGroup> it;
        int i = 2 % 2;
        int i2 = asBinder + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            intExtra = intent.getIntExtra(UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
            parcelableArrayListExtra = intent.getParcelableArrayListExtra(UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
            if (parcelableArrayListExtra != null) {
                if (parcelableArrayListExtra.isEmpty()) {
                }
            }
            linearLayout = (LinearLayout) findViewById(R.id.layout_aspect_ratio);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            for (AspectRatio aspectRatio : parcelableArrayListExtra) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R.layout.ucrop_aspect_ratio, (ViewGroup) null);
                frameLayout.setLayoutParams(layoutParams);
                AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
                aspectRatioTextView.setActiveColor(this.mActiveControlsWidgetColor);
                aspectRatioTextView.setAspectRatio(aspectRatio);
                linearLayout.addView(frameLayout);
                this.mCropAspectRatioViews.add(frameLayout);
            }
            this.mCropAspectRatioViews.get(intExtra).setSelected(true);
            it = this.mCropAspectRatioViews.iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                        try {
                            UCropActivity.access$500(UCropActivity.this).setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).getAspectRatio(view.isSelected()));
                            UCropActivity.access$500(UCropActivity.this).setImageToWrapCropBounds();
                            if (!view.isSelected()) {
                                for (ViewGroup viewGroup : UCropActivity.access$600(UCropActivity.this)) {
                                    viewGroup.setSelected(viewGroup == view);
                                }
                            }
                        } finally {
                            ViewPortBuilder.b();
                        }
                    }
                });
                int i5 = asBinder + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        intExtra = intent.getIntExtra(UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 1);
        parcelableArrayListExtra = intent.getParcelableArrayListExtra(UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (parcelableArrayListExtra != null) {
            if (parcelableArrayListExtra.isEmpty()) {
            }
        }
        linearLayout = (LinearLayout) findViewById(R.id.layout_aspect_ratio);
        layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        while (r12.hasNext()) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            FrameLayout frameLayout2 = (FrameLayout) getLayoutInflater().inflate(R.layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout2.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView2 = (AspectRatioTextView) frameLayout2.getChildAt(0);
            aspectRatioTextView2.setActiveColor(this.mActiveControlsWidgetColor);
            aspectRatioTextView2.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout2);
            this.mCropAspectRatioViews.add(frameLayout2);
        }
        this.mCropAspectRatioViews.get(intExtra).setSelected(true);
        it = this.mCropAspectRatioViews.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        UCropActivity.access$500(UCropActivity.this).setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).getAspectRatio(view.isSelected()));
                        UCropActivity.access$500(UCropActivity.this).setImageToWrapCropBounds();
                        if (!view.isSelected()) {
                            for (ViewGroup viewGroup : UCropActivity.access$600(UCropActivity.this)) {
                                viewGroup.setSelected(viewGroup == view);
                            }
                        }
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            int i9 = asBinder + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            int i10 = i9 % 2;
        }
        parcelableArrayListExtra = new ArrayList();
        parcelableArrayListExtra.add(new AspectRatio(null, 1.0f, 1.0f));
        parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 4.0f));
        parcelableArrayListExtra.add(new AspectRatio(getString(R.string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
        parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 2.0f));
        parcelableArrayListExtra.add(new AspectRatio(null, 16.0f, 9.0f));
        intExtra = 2;
        linearLayout = (LinearLayout) findViewById(R.id.layout_aspect_ratio);
        layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        while (r12.hasNext()) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            FrameLayout frameLayout3 = (FrameLayout) getLayoutInflater().inflate(R.layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout3.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView3 = (AspectRatioTextView) frameLayout3.getChildAt(0);
            aspectRatioTextView3.setActiveColor(this.mActiveControlsWidgetColor);
            aspectRatioTextView3.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout3);
            this.mCropAspectRatioViews.add(frameLayout3);
        }
        this.mCropAspectRatioViews.get(intExtra).setSelected(true);
        it = this.mCropAspectRatioViews.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        UCropActivity.access$500(UCropActivity.this).setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).getAspectRatio(view.isSelected()));
                        UCropActivity.access$500(UCropActivity.this).setImageToWrapCropBounds();
                        if (!view.isSelected()) {
                            for (ViewGroup viewGroup : UCropActivity.access$600(UCropActivity.this)) {
                                viewGroup.setSelected(viewGroup == view);
                            }
                        }
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            int i13 = asBinder + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    private void setupRotateWidget() {
        int i = 2 % 2;
        this.mTextViewRotateAngle = (TextView) findViewById(R.id.text_view_rotate);
        ((HorizontalProgressWheelView) findViewById(R.id.rotate_scroll_wheel)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.yalantis.ucrop.UCropActivity.3
            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f, float f2) {
                UCropActivity.access$500(UCropActivity.this).postRotate(f / 42.0f);
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                UCropActivity.access$500(UCropActivity.this).setImageToWrapCropBounds();
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                UCropActivity.access$500(UCropActivity.this).cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) findViewById(R.id.rotate_scroll_wheel)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        findViewById(R.id.wrapper_reset_rotate).setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    UCropActivity.access$700(UCropActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        findViewById(R.id.wrapper_rotate_by_angle).setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    UCropActivity.access$800(UCropActivity.this, 90);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        setAngleTextColor(this.mActiveControlsWidgetColor);
        int i2 = asBinder + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void setupScaleWidget() {
        int i = 2 % 2;
        this.mTextViewScalePercent = (TextView) findViewById(R.id.text_view_scale);
        ((HorizontalProgressWheelView) findViewById(R.id.scale_scroll_wheel)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.yalantis.ucrop.UCropActivity.6
            private static final byte[] $$c = {117, 50, 102, 124};
            private static final int $$f = 239;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {57, -50, -56, -93, -11, 3, 64, -56, -7, 1, 9, -4, 8, 56, -55, -2, -8, 14, 4, 2, -17, 15, 56, -67, 14, -7, -1, -4, 16, 3, -11, 2, 9, -2, 3, 58, -20, -43, 2, 9, -2, 3, 19, -26, 13, 4, -18, 16, -32, 13, -10, 12, -5, 2, 31, -16, -23, 13, 9, -8, -5, 47, -43, 18, -5, -5, 9, -8, -5, 2, 4, 12, 3, -5, 9, -10, 4, -4, 3, 4, -4, 10, 2, -17, 14, 5, -17, 43, -33, 12, 0, -6, 9, 0, 0, 6, -19, 10, -7, 66};
            private static final int $$e = 254;
            private static final byte[] $$a = {119, -103, 14, -22, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
            private static final int $$b = 249;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int asInterface = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47285, 47272, 47282, 47268, 47271, 47277, 47208, 47267, 47235, 47325, 47266, 47281, 47273, 47251, 47274, 47283, 47275, 47270, 47236, 47253, 47264, 47234, 47278, 47265, 47276, 47279, 47246};
            private static int TuitionPaymentFragmentbindingInflater1 = 2047719510;
            private static boolean b = true;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.yalantis.ucrop.UCropActivity.AnonymousClass6.$$a
                    int r1 = r8 + 1
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    int r7 = r7 * 52
                    int r7 = 56 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r7
                    r4 = r2
                    goto L2b
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L22:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2b:
                    int r6 = -r6
                    int r7 = r7 + r6
                    int r6 = r7 + (-10)
                    int r7 = r3 + 1
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.AnonymousClass6.a(int, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r7, byte r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 15
                    int r7 = 99 - r7
                    byte[] r0 = com.yalantis.ucrop.UCropActivity.AnonymousClass6.$$d
                    int r8 = r8 * 8
                    int r8 = r8 + 45
                    int r9 = r9 * 44
                    int r9 = r9 + 4
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r9
                    r4 = r2
                    r9 = r8
                    goto L2d
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r9]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L2d:
                    int r7 = -r7
                    int r9 = r9 + r7
                    int r7 = r9 + 1
                    int r9 = r3 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.AnonymousClass6.d(short, byte, byte, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int[] iArr, int i2, byte[] bArr, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i5 = 0;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = $10 + 13;
                        $11 = i7 % 128;
                        if (i7 % i3 == 0) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i5] = Integer.valueOf(cArr2[i6]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) i5;
                                    byte b3 = b2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31339), 2994 - TextUtils.indexOf("", ""), (Process.myTid() >> 22) + 17, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31339), 2994 - (ViewConfiguration.getLongPressTimeout() >> 16), 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1182129903, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                i6++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i3 = 2;
                        i5 = 0;
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43324), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 253, TextUtils.indexOf((CharSequence) "", '0', 0) + 23, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                int i8 = 33602;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i2] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + i8), 3085 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 26, -2146875848, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        i8 = 33602;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (b) {
                    int i9 = $11 + 125;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i2] - iIntValue);
                        Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 3085, 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -2146875848, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i11 = 0;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i12 = $10 + 95;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i2] - iIntValue);
                    i11 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f, float f2) {
                int i2 = 2 % 2;
                if (f > 0.0f) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    UCropActivity.access$500(UCropActivity.this).zoomInImage(UCropActivity.access$500(UCropActivity.this).getCurrentScale() + (f * ((UCropActivity.access$500(UCropActivity.this).getMaxScale() - UCropActivity.access$500(UCropActivity.this).getMinScale()) / 15000.0f)));
                    return;
                }
                UCropActivity.access$500(UCropActivity.this).zoomOutImage(UCropActivity.access$500(UCropActivity.this).getCurrentScale() + (f * ((UCropActivity.access$500(UCropActivity.this).getMaxScale() - UCropActivity.access$500(UCropActivity.this).getMinScale()) / 15000.0f)));
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code duplicated, block: B:26:0x020a  */
            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
                    int i3 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
                    int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
                    byte[] bArr = $$a;
                    byte b2 = bArr[80];
                    Object[] objArr2 = new Object[1];
                    a(b2, bArr[7], b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, i3, bitsPerPixel, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(null, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char doubleTapTimeout = (char) (31533 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
                    int iAxisFromString = MotionEvent.axisFromString("") + 29;
                    byte b3 = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a(b3, b3, (byte) 52, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, iLastIndexOf, iAxisFromString, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 31534);
                        int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
                        int i4 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr2 = $$a;
                        byte b4 = bArr2[7];
                        byte b5 = bArr2[80];
                        Object[] objArr6 = new Object[1];
                        a(b4, b5, (byte) (b5 | 37), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, packedPositionType, i4, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i5 = 1953390499 + (((~((-1360116165) | iElapsedRealtime)) | 268472516) * 104) + ((~((~iElapsedRealtime) | 1505607127)) * (-104)) + ((iElapsedRealtime | 413963479) * 104) + 1024119041;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(null, null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i8 = asInterface + 25;
                        int i9 = i8 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9;
                        int i10 = i8 % 2;
                        if (applicationContext instanceof ContextWrapper) {
                            int i11 = i9 + 77;
                            asInterface = i11 % 128;
                            if (i11 % 2 == 0) {
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
                    Object[] objArr10 = new Object[1];
                    c(null, null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                    asInterface = i12 % 128;
                    int i13 = i12 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1024119041};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[90];
                        byte b7 = b6;
                        Object[] objArr13 = new Object[1];
                        d(b6, b7, b7, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b8 = bArr3[9];
                        byte b9 = b8;
                        Object[] objArr14 = new Object[1];
                        d(b8, b9, b9, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                            int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[7];
                            byte b11 = bArr4[80];
                            Object[] objArr15 = new Object[1];
                            a(b10, b11, (byte) (b11 | 37), objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, iResolveOpacity, maxKeyCode, -1142834547, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c(null, null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf2 = (char) (31533 - TextUtils.indexOf("", ""));
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 921;
                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                                byte b12 = $$a[7];
                                Object[] objArr18 = new Object[1];
                                a(b12, b12, (byte) 52, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, offsetAfter, scrollBarSize, -778300370, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char packedPositionGroup = (char) (31533 - ExpandableListView.getPackedPositionGroup(0L));
                                int minimumFlingVelocity = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 28;
                                byte[] bArr5 = $$a;
                                byte b13 = bArr5[80];
                                Object[] objArr19 = new Object[1];
                                a(b13, bArr5[7], b13, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, minimumFlingVelocity, offsetAfter2, -1048449946, false, (String) objArr19[0], null);
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
                if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr == null) {
                        throw null;
                    }
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                    asInterface = i14 % 128;
                    int i15 = i14 % 2;
                    for (String str : strArr) {
                        int i16 = asInterface + 105;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                        int i17 = i16 % 2;
                        arrayList.add(str);
                    }
                    throw null;
                }
                int i18 = ((int[]) objArr[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iNextInt = new Random().nextInt();
                int i19 = ~iNextInt;
                int i20 = 1766841713 + (((~(805871288 | i19)) | 162865475) * (-1188));
                int i21 = (~(iNextInt | (-805871289))) | 162865475;
                int i22 = ~(968208355 | i19);
                int i23 = i18 + i20 + ((i21 | i22) * 594) + (((~((-805871289) | i19)) | 528408 | i22) * 594);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr20[0])[0] = i25 ^ (i25 << 5);
                UCropActivity.access$500(UCropActivity.this).setImageToWrapCropBounds();
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    UCropActivity.access$500(UCropActivity.this).cancelAllAnimations();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                UCropActivity.access$500(UCropActivity.this).cancelAllAnimations();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, short r7, short r8) {
                /*
                    int r8 = r8 * 4
                    int r8 = r8 + 4
                    byte[] r0 = com.yalantis.ucrop.UCropActivity.AnonymousClass6.$$c
                    int r7 = 68 - r7
                    int r6 = r6 * 3
                    int r1 = r6 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r4 = r6
                    r7 = r8
                    r3 = r2
                    goto L28
                L15:
                    r3 = r2
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L19:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r6) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                L28:
                    int r4 = -r4
                    int r8 = r8 + r4
                    int r7 = r7 + 1
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.AnonymousClass6.$$g(byte, short, short):java.lang.String");
            }
        });
        ((HorizontalProgressWheelView) findViewById(R.id.scale_scroll_wheel)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        setScaleTextColor(this.mActiveControlsWidgetColor);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void setAngleText(float f) {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = this.mTextViewRotateAngle;
        if (textView != null) {
            int i5 = i2 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[0];
                objArr[0] = Float.valueOf(f);
                str = String.format(locale, "%.1f°", objArr);
            } else {
                str = String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f));
            }
            textView.setText(str);
        }
    }

    private void setAngleTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i3 + 19;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        TextView textView = this.mTextViewRotateAngle;
        if (textView != null) {
            int i6 = i3 + 11;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            textView.setTextColor(i);
            if (i7 == 0) {
                int i8 = 36 / 0;
            }
        }
    }

    private void setScaleText(float f) {
        TextView textView;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            textView = this.mTextViewScalePercent;
            int i4 = 78 / 0;
            if (textView == null) {
                return;
            }
        } else {
            textView = this.mTextViewScalePercent;
            if (textView == null) {
                return;
            }
        }
        int i5 = i2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        textView.setText(i5 % 2 != 0 ? String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f / 100.0f))) : String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f * 100.0f))));
    }

    private void setScaleTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        TextView textView = this.mTextViewScalePercent;
        if (textView != null) {
            textView.setTextColor(i);
        }
        int i4 = asBinder + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void resetRotation() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
            gestureCropImageView.postRotate(-gestureCropImageView.getCurrentAngle());
            this.mGestureCropImageView.setImageToWrapCropBounds();
        } else {
            GestureCropImageView gestureCropImageView2 = this.mGestureCropImageView;
            gestureCropImageView2.postRotate(-gestureCropImageView2.getCurrentAngle());
            this.mGestureCropImageView.setImageToWrapCropBounds();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private void rotateByAngle(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            this.mGestureCropImageView.postRotate(i);
            this.mGestureCropImageView.setImageToWrapCropBounds();
        } else {
            this.mGestureCropImageView.postRotate(i);
            this.mGestureCropImageView.setImageToWrapCropBounds();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private void setInitialState() {
        int i = 2 % 2;
        if (!this.mShowBottomControls) {
            setAllowedGestures(0);
            int i2 = asBinder + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (this.mWrapperStateAspectRatio.getVisibility() != 0) {
            setWidgetState(R.id.state_scale);
            return;
        }
        int i4 = asBinder + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            setWidgetState(R.id.state_aspect_ratio);
            int i5 = 64 / 0;
        } else {
            setWidgetState(R.id.state_aspect_ratio);
        }
        int i6 = asBinder + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 27 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    private void setWidgetState(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3 = 2 % 2;
        if (this.mShowBottomControls) {
            ViewGroup viewGroup = this.mWrapperStateAspectRatio;
            if (i == R.id.state_aspect_ratio) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            viewGroup.setSelected(z);
            ViewGroup viewGroup2 = this.mWrapperStateRotate;
            if (i == R.id.state_rotate) {
                int i5 = asBinder + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            viewGroup2.setSelected(z2);
            ViewGroup viewGroup3 = this.mWrapperStateScale;
            if (i == R.id.state_scale) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            viewGroup3.setSelected(z3);
            ViewGroup viewGroup4 = this.mLayoutAspectRatio;
            if (i == R.id.state_aspect_ratio) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                i2 = 0;
            } else {
                i2 = 8;
            }
            viewGroup4.setVisibility(i2);
            this.mLayoutRotate.setVisibility(i == R.id.state_rotate ? 0 : 8);
            this.mLayoutScale.setVisibility(i == R.id.state_scale ? 0 : 8);
            changeSelectedTab(i);
            if (i == R.id.state_scale) {
                setAllowedGestures(0);
            } else if (i == R.id.state_rotate) {
                setAllowedGestures(1);
            } else {
                setAllowedGestures(2);
            }
        }
    }

    private void changeSelectedTab(int i) {
        int i2;
        int i3 = 2 % 2;
        TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R.id.ucrop_photobox), this.mControlsTransition);
        View viewFindViewById = this.mWrapperStateScale.findViewById(R.id.text_view_scale);
        int i4 = 0;
        if (i == R.id.state_scale) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            i2 = 0;
        } else {
            i2 = 8;
        }
        viewFindViewById.setVisibility(i2);
        this.mWrapperStateAspectRatio.findViewById(R.id.text_view_crop).setVisibility(i == R.id.state_aspect_ratio ? 0 : 8);
        View viewFindViewById2 = this.mWrapperStateRotate.findViewById(R.id.text_view_rotate);
        if (i == R.id.state_rotate) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i4 = 8;
        }
        viewFindViewById2.setVisibility(i4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[DONT_INVERT, PHI: r1 r5
  0x0022: PHI (r1v5 com.yalantis.ucrop.view.GestureCropImageView) = (r1v4 com.yalantis.ucrop.view.GestureCropImageView), (r1v9 com.yalantis.ucrop.view.GestureCropImageView) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0022: PHI (r5v2 int) = (r5v1 int), (r5v8 int) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    private void setAllowedGestures(int i) {
        GestureCropImageView gestureCropImageView;
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = asBinder + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        boolean z2 = false;
        if (i5 % 2 == 0) {
            gestureCropImageView = this.mGestureCropImageView;
            i2 = this.mAllowedGestures[i];
            if (i2 != 3) {
                if (i2 != 1) {
                    z = false;
                }
            }
            gestureCropImageView.setScaleEnabled(z);
            GestureCropImageView gestureCropImageView2 = this.mGestureCropImageView;
            i3 = this.mAllowedGestures[i];
            if (i3 != 3) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                z2 = true;
            } else {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                z2 = true;
            }
            gestureCropImageView2.setRotateEnabled(z2);
        }
        gestureCropImageView = this.mGestureCropImageView;
        i2 = this.mAllowedGestures[i];
        if (i2 != 4) {
            if (i2 != 1) {
                z = false;
            }
        }
        gestureCropImageView.setScaleEnabled(z);
        GestureCropImageView gestureCropImageView3 = this.mGestureCropImageView;
        i3 = this.mAllowedGestures[i];
        if (i3 != 3 || i3 == 2) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            z2 = true;
        }
        gestureCropImageView3.setRotateEnabled(z2);
        z = true;
        gestureCropImageView.setScaleEnabled(z);
        GestureCropImageView gestureCropImageView4 = this.mGestureCropImageView;
        i3 = this.mAllowedGestures[i];
        if (i3 != 3) {
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            z2 = true;
        } else {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            asBinder = i14 % 128;
            int i15 = i14 % 2;
            z2 = true;
        }
        gestureCropImageView4.setRotateEnabled(z2);
    }

    private void addBlockingView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (this.mBlockingView == null) {
            this.mBlockingView = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, R.id.toolbar);
            this.mBlockingView.setLayoutParams(layoutParams);
            this.mBlockingView.setClickable(true);
        }
        ((RelativeLayout) findViewById(R.id.ucrop_photobox)).addView(this.mBlockingView);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
    }

    protected void cropAndSaveImage() {
        int i = 2 % 2;
        this.mBlockingView.setClickable(true);
        this.mShowLoader = true;
        supportInvalidateOptionsMenu();
        this.mGestureCropImageView.cropAndSaveImage(this.mCompressFormat, this.mCompressQuality, new BitmapCropCallback() { // from class: com.yalantis.ucrop.UCropActivity.8
            @Override // com.yalantis.ucrop.callback.BitmapCropCallback
            public void onBitmapCropped(Uri uri, int i2, int i3, int i4, int i5) {
                UCropActivity uCropActivity = UCropActivity.this;
                uCropActivity.setResultUri(uri, UCropActivity.access$500(uCropActivity).getTargetAspectRatio(), i2, i3, i4, i5);
                UCropActivity.this.finish();
            }

            @Override // com.yalantis.ucrop.callback.BitmapCropCallback
            public void onCropFailure(Throwable th) {
                UCropActivity.this.setResultError(th);
                UCropActivity.this.finish();
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
    }

    protected void setResultUri(Uri uri, float f, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        setResult(-1, new Intent().putExtra(UCrop.EXTRA_OUTPUT_URI, uri).putExtra(UCrop.EXTRA_OUTPUT_CROP_ASPECT_RATIO, f).putExtra(UCrop.EXTRA_OUTPUT_IMAGE_WIDTH, i3).putExtra(UCrop.EXTRA_OUTPUT_IMAGE_HEIGHT, i4).putExtra(UCrop.EXTRA_OUTPUT_OFFSET_X, i).putExtra(UCrop.EXTRA_OUTPUT_OFFSET_Y, i2));
        int i6 = asBinder + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
    }

    protected void setResultError(Throwable th) {
        int i = 2 % 2;
        setResult(96, new Intent().putExtra(UCrop.EXTRA_ERROR, th));
        int i2 = asBinder + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -283209767
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.onResume():void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        asBinder = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 46401), 40 - (ViewConfiguration.getScrollBarSize() >> 8), 19 - (Process.myTid() >> 22), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                }
                Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46400), ((byte) KeyEvent.getModifierMetaStateMask()) + 41, 19 - View.MeasureSpec.getSize(0), 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj2, null);
                super.onPause();
                return;
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46401 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 40 - TextUtils.indexOf("", "", 0), 19 - (Process.myPid() >> 22), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46399), 40 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 19 - Color.argb(0, 0, 0, 0), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj3, null);
            super.onPause();
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:17:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:19:0x0181  */
    /* JADX WARN: Code duplicated, block: B:22:0x021b A[Catch: all -> 0x0a69, TryCatch #0 {all -> 0x0a69, blocks: (B:20:0x0207, B:22:0x021b, B:23:0x024a, B:51:0x06fb, B:53:0x070f, B:54:0x0743, B:56:0x0775, B:57:0x07ed), top: B:96:0x0207 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0264  */
    /* JADX WARN: Code duplicated, block: B:31:0x035c  */
    /* JADX WARN: Code duplicated, block: B:34:0x03af  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        asBinder = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 23;
                Object[] objArr2 = new Object[1];
                c((short) 104, (byte) 15, $$a[10], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, keyRepeatDelay, capsMode, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            int i4 = 51 / 0;
            if (j != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                    int iBlue = 1755 - Color.blue(0);
                    int iMyPid = (Process.myPid() >> 22) + 23;
                    byte[] bArr = $$a;
                    Object[] objArr3 = new Object[1];
                    c((short) 52, bArr[7], bArr[10], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iBlue, iMyPid, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i5 = ((int[]) objArr4[0])[0];
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i5}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i6 = ~iIdentityHashCode;
                int i7 = ((((-713884247) + ((~(463764110 | i6)) * (-560))) + ((~(iIdentityHashCode | 536641246)) * (-560))) + (((~((-251161685) | i6)) | 178284548) * 560)) - 1215134181;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                a(new char[]{18, '\n', '.', '\f', 20, '\f', '\t', '\'', 26, 17, '%', 30, Typography.dollar, 31, '\f', 23}, (byte) (Color.red(0) + 109), TextUtils.getOffsetBefore("", 0) + 16, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                a(new char[]{Typography.quote, '-', 16, ',', 30, ' ', 30, 22, '\t', '\f', Typography.dollar, 3, '+', 1, ',', '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 84), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {1626924680};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 42049), 1725 - TextUtils.indexOf((CharSequence) "", '0'), Color.blue(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), -1215134181, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                        int iAxisFromString = MotionEvent.axisFromString("") + 1756;
                        int iAxisFromString2 = 22 - MotionEvent.axisFromString("");
                        byte[] bArr2 = $$a;
                        Object[] objArr8 = new Object[1];
                        c((short) 52, bArr2[7], bArr2[10], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, iAxisFromString, iAxisFromString2, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        a(new char[]{'\t', '\'', '.', 27, '-', 29, '/', 20, '-', Typography.dollar, 16, '!', 24, '%', 30, '\b', 22, '(', '\b', '0', ',', 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 83), 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        a(new char[]{'\n', 7, 7, '.', '%', '\n', '/', '\r', '\n', '\f', '\b', Typography.quote, '!', 24, 13898}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 39), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.xl_instruction_step6).substring(17, 18).codePointAt(0) - 82, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                            int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                            int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte[] bArr3 = $$a;
                            Object[] objArr11 = new Object[1];
                            c((short) 141, bArr3[7], bArr3[10], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iIndexOf, iMakeMeasureSpec, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                            int mode = 1755 - View.MeasureSpec.getMode(0);
                            int trimmedLength = 23 - TextUtils.getTrimmedLength("");
                            Object[] objArr12 = new Object[1];
                            c((short) 104, (byte) 15, $$a[10], objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild2, mode, trimmedLength, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char trimmedLength2 = (char) (29944 - TextUtils.getTrimmedLength(""));
                int keyRepeatTimeout = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i10 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                Object[] objArr13 = new Object[1];
                c((short) 104, (byte) 15, $$a[10], objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength2, keyRepeatTimeout, i10, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionChild3 = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                    int iBlue2 = 1755 - Color.blue(0);
                    int iMyPid2 = (Process.myPid() >> 22) + 23;
                    byte[] bArr4 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((short) 52, bArr4[7], bArr4[10], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild3, iBlue2, iMyPid2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i11 = ((int[]) objArr15[0])[0];
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i11}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i12 = ~iIdentityHashCode2;
                int i13 = ((((-713884247) + ((~(463764110 | i12)) * (-560))) + ((~(iIdentityHashCode2 | 536641246)) * (-560))) + (((~((-251161685) | i12)) | 178284548) * 560)) - 1215134181;
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i15 ^ (i15 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                a(new char[]{18, '\n', '.', '\f', 20, '\f', '\t', '\'', 26, 17, '%', 30, Typography.dollar, 31, '\f', 23}, (byte) (Color.red(0) + 109), TextUtils.getOffsetBefore("", 0) + 16, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                a(new char[]{Typography.quote, '-', 16, ',', 30, ' ', 30, 22, '\t', '\f', Typography.dollar, 3, '+', 1, ',', '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 84), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {1626924680};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 42049), 1725 - TextUtils.indexOf((CharSequence) "", '0'), Color.blue(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), -1215134181, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollBarSize2 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                    int iAxisFromString3 = MotionEvent.axisFromString("") + 1756;
                    int iAxisFromString4 = 22 - MotionEvent.axisFromString("");
                    byte[] bArr5 = $$a;
                    Object[] objArr19 = new Object[1];
                    c((short) 52, bArr5[7], bArr5[10], objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize2, iAxisFromString3, iAxisFromString4, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                Object[] objArr20 = new Object[1];
                a(new char[]{'\t', '\'', '.', 27, '-', 29, '/', 20, '-', Typography.dollar, 16, '!', 24, '%', 30, '\b', 22, '(', '\b', '0', ',', 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 83), 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                a(new char[]{'\n', 7, 7, '.', '%', '\n', '/', '\r', '\n', '\f', '\b', Typography.quote, '!', 24, 13898}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 39), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.xl_instruction_step6).substring(17, 18).codePointAt(0) - 82, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                    int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                    int iMakeMeasureSpec2 = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte[] bArr6 = $$a;
                    Object[] objArr111 = new Object[1];
                    c((short) 141, bArr6[7], bArr6[10], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, iIndexOf2, iMakeMeasureSpec2, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char packedPositionChild4 = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                    int mode2 = 1755 - View.MeasureSpec.getMode(0);
                    int trimmedLength3 = 23 - TextUtils.getTrimmedLength("");
                    Object[] objArr112 = new Object[1];
                    c((short) 104, (byte) 15, $$a[10], objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild4, mode2, trimmedLength3, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i16 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i17 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i17 != i16) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                while (i3 < strArr.length) {
                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                    asBinder = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(strArr[i3]);
                    i3++;
                }
            }
            throw new RuntimeException(String.valueOf(i17));
        }
        int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i21 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr21 = {new int[]{i21}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i22 = ~((int) Runtime.getRuntime().maxMemory());
        int i23 = ~(824565028 | i22);
        int i24 = i20 + 1891045457 + ((i23 | (-611962603)) * 764) + (((~(i22 | (-611962603))) | 539085856) * (-1528)) + (((-358355919) | i23) * 764);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr21[3])[0] = i26 ^ (i26 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int iArgb = Color.argb(0, 0, 0, 0) + 1031;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
            byte[] bArr7 = $$a;
            short s = bArr7[7];
            Object[] objArr22 = new Object[1];
            c(s, (byte) s, bArr7[10], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(offsetBefore, iArgb, packedPositionGroup, 1357589585, false, (String) objArr22[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr23 = new Object[1];
        a(new char[]{'\t', '\'', '.', 27, '-', 29, '/', 20, '-', Typography.dollar, 16, '!', 24, '%', 30, '\b', 22, '(', '\b', '0', ',', 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 83), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr23);
        Class<?> cls5 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        a(new char[]{'\n', 7, 7, '.', '%', '\n', '/', '\r', '\n', '\f', '\b', Typography.quote, '!', 24, 13898}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 39), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr24);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int i27 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i28 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
            byte[] bArr8 = $$a;
            Object[] objArr25 = new Object[1];
            c((short) 52, bArr8[7], bArr8[10], objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(edgeSlop, i27, i28, 1344079056, false, (String) objArr25[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
                int i29 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte[] bArr9 = $$a;
                short s2 = bArr9[7];
                Object[] objArr26 = new Object[1];
                c(s2, (byte) (s2 | 52), (byte) (bArr9[19] - 1), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(touchSlop, absoluteGravity, i29, 632103528, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr27[3])[0];
            int i31 = ((int[]) objArr27[1])[0];
            String[] strArr2 = (String[]) objArr27[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i32 = ~iIdentityHashCode3;
            int i33 = (((189349314 + (((-33626273) | i32) * (-369))) + (((~((-951371103) | i32)) | (-707090933)) * (-369))) + ((((~(iIdentityHashCode3 | 951371102)) | (-984997375)) | (~(i32 | (-673464661)))) * 369)) - 1240725191;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[2])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr28 = new Object[1];
            a(new char[]{18, '\n', '.', '\f', 20, '\f', '\t', '\'', 26, 17, '%', 30, Typography.dollar, 31, '\f', 23}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 109), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 82, objArr28);
            Class<?> cls6 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            a(new char[]{Typography.quote, '-', 16, ',', 30, ' ', 30, 22, '\t', '\f', Typography.dollar, 3, '+', 1, ',', '\r'}, (byte) (95 - KeyEvent.getDeadChar(0, 0)), AndroidCharacter.getMirror('0') - ' ', objArr29);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr30 = {1626924680};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 46038), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1134, 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr31 = {Integer.valueOf(iIntValue3), 0, -1240725191, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr30), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iAlpha = 1031 - Color.alpha(0);
                int i36 = 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte[] bArr10 = $$a;
                short s3 = bArr10[7];
                Object[] objArr32 = new Object[1];
                c(s3, (byte) s3, bArr10[10], objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(minimumFlingVelocity, iAlpha, i36, 1298546779, false, (String) objArr32[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ImageFormat.getBitsPerPixel(0)), 1117 - (KeyEvent.getMaxKeyCode() >> 16), (Process.myPid() >> 22) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr31);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                byte[] bArr11 = $$a;
                short s4 = bArr11[7];
                Object[] objArr33 = new Object[1];
                c(s4, (byte) (s4 | 52), (byte) (bArr11[19] - 1), objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c, threadPriority, scrollBarSize3, 632103528, false, (String) objArr33[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr34 = new Object[1];
                a(new char[]{'\t', '\'', '.', 27, '-', 29, '/', 20, '-', Typography.dollar, 16, '!', 24, '%', 30, '\b', 22, '(', '\b', '0', ',', 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_method_description_epay_bri).substring(1, 3).codePointAt(1) - 2), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr34);
                Class<?> cls7 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                a(new char[]{'\n', 7, 7, '.', '%', '\n', '/', '\r', '\n', '\f', '\b', Typography.quote, '!', 24, 13898}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 76), 15 - TextUtils.getOffsetBefore("", 0), objArr35);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr35[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int iArgb2 = 1031 - Color.argb(0, 0, 0, 0);
                    int scrollBarSize4 = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte[] bArr12 = $$a;
                    Object[] objArr36 = new Object[1];
                    c((short) 52, bArr12[7], bArr12[10], objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetAfter, iArgb2, scrollBarSize4, 1344079056, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte[] bArr13 = $$a;
                    short s5 = bArr13[7];
                    Object[] objArr37 = new Object[1];
                    c(s5, (byte) s5, bArr13[10], objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(keyRepeatDelay2, maximumDrawingCacheSize, iLastIndexOf, 1357589585, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr38 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i37 = ((int[]) objArr[2])[0];
            int i38 = ((int[]) objArr[3])[0];
            int i39 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i40 = ~((~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1569302227)) | 856408819);
            int i41 = i37 + ((537412225 | i40) * (-374)) + 327347539 + ((i40 | 318996594) * 374);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr38[2])[0] = i43 ^ (i43 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        while (i3 < strArr4.length) {
            int i44 = asBinder + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i44 % 128;
            int i45 = i44 % 2;
            arrayList2.add(strArr4[i3]);
            i3++;
            int i46 = asBinder + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i46 % 128;
            int i47 = i46 % 2;
        }
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1736089133
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.onStart():void");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{60104, 60051, 60048, 60105, 60106, 60119, 60114, 60061, 60083, 60062, 60115, 60058, 60073, 60055, 60111, 60112, 60110, 60049, 60108, 60117, 60046, 60109, 60099, 60034, 60060, 60041, 60054, 60123, 60120, 60047, 60072, 60050, 60079, 60116, 60090, 60113, 60088, 60053, 60040, 60121, 60107, 60118, 60043, 60052, 60098, 60056, 60057, 60045, 60063};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 57190;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r8 = 116 - r8
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r0 = com.yalantis.ucrop.UCropActivity.$$c
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r6
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.$$g(short, int, short):java.lang.String");
    }
}
