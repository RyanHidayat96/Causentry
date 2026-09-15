package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
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
import android.widget.Toast;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class isAutoCancelEnabled extends Drawable implements setAutoCancelDuration.TuitionPaymentFragmentspecialinlinedviewModeldefault1, Animatable, Animatable2Compat {
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;
    private Rect TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private List<Animatable2Compat.AnimationCallback> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1217a;
    private int asBinder;
    private boolean asInterface;
    boolean b;
    private int d;
    private boolean g;
    private Paint onTransact;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public isAutoCancelEnabled(Context context, getMirroring getmirroring, Transformation<Bitmap> transformation, int i, int i2, Bitmap bitmap) {
        this(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new setAutoCancelDuration(Glide.b(context), getmirroring, i, i2, transformation, bitmap)));
    }

    isAutoCancelEnabled(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.g = true;
        this.d = -1;
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.asInterface = true;
        this.asBinder = 0;
        if (this.g) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.asInterface = false;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (!(!this.b)) {
            throw new IllegalArgumentException("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        }
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder.g() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f1217a) {
            return;
        }
        this.f1217a = true;
        setAutoCancelDuration setautocancelduration = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (setautocancelduration.d) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (setautocancelduration.b.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = setautocancelduration.b.isEmpty();
        setautocancelduration.b.add(this);
        if (zIsEmpty && !setautocancelduration.asInterface) {
            setautocancelduration.asInterface = true;
            setautocancelduration.d = false;
            setautocancelduration.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        invalidateSelf();
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.f1217a = false;
        setAutoCancelDuration setautocancelduration = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        setautocancelduration.b.remove(this);
        if (setautocancelduration.b.isEmpty()) {
            setautocancelduration.asInterface = false;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends Drawable.ConstantState {
        private static short[] asInterface;
        public final setAutoCancelDuration TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static final byte[] $$c = {99, -43, -44, -62};
        private static final int $$f = 86;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {55, -64, 35, -71, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -17, -12, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -70};
        private static final int $$e = 70;
        private static final byte[] $$a = {123, -2, -101, -104, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 60;
        private static int d = 0;
        private static int asBinder = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1890497918;
        private static int TuitionPaymentFragmentbindingInflater1 = -1934795621;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 794942935;
        private static byte[] b = {ByteCompanionObject.MAX_VALUE, -14, 14, -7, -45, 44, -14, 11, -5, 0, -36, -33, 65, -2, -69, 48, 1, 0, 7, -12, 12, -9, 116, ByteCompanionObject.MIN_VALUE, 124, -115, 112, 115, -124, 107, -106, -121, -118, 123, 119, -115, ByteCompanionObject.MAX_VALUE, 117, 27, -30, 18, -23, 53, 54, -44, -22, 30, -26, 45, -34, -8, 6, -28, 117, ByteCompanionObject.MIN_VALUE, 116, -83, 90, 116, -109, -104, 78, -124, -118, 116, -121, -120, ByteCompanionObject.MIN_VALUE, 122};

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 15
                int r0 = r6 + 38
                int r8 = r8 * 4
                int r8 = 84 - r8
                int r7 = r7 * 52
                int r7 = 107 - r7
                byte[] r1 = isAutoCancelEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                byte[] r0 = new byte[r0]
                int r6 = r6 + 37
                r2 = 0
                if (r1 != 0) goto L19
                r4 = r8
                r3 = r2
                r8 = r7
                goto L30
            L19:
                r3 = r2
            L1a:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L30:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: isAutoCancelEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a(byte, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(byte r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 4
                int r0 = 53 - r5
                byte[] r1 = isAutoCancelEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$d
                int r6 = r6 * 48
                int r6 = 51 - r6
                int r7 = r7 * 15
                int r7 = 99 - r7
                byte[] r0 = new byte[r0]
                int r5 = 52 - r5
                r2 = 0
                if (r1 != 0) goto L19
                r4 = r7
                r3 = r2
                r7 = r5
                goto L2d
            L19:
                r3 = r2
            L1a:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r5) goto L29
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L29:
                int r3 = r3 + 1
                r4 = r1[r6]
            L2d:
                int r7 = r7 + r4
                int r7 = r7 + 3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: isAutoCancelEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.e(byte, short, int, java.lang.Object[]):void");
        }

        private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2267 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                int i5 = iIntValue == -1 ? 1 : 0;
                char c = '0';
                if (i5 != 0) {
                    byte[] bArr = b;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i6 = 0;
                        while (i6 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cGreen = (char) Color.green(0);
                                int iLastIndexOf = 3357 - TextUtils.lastIndexOf("", c, 0);
                                int windowTouchSlop = 18 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, iLastIndexOf, windowTouchSlop, -1054011043, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i6++;
                            c = '0';
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i7 = $11 + 27;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        byte[] bArr3 = b;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.green(0), (ViewConfiguration.getEdgeSlop() >> 16) + 2267, 33 - KeyEvent.keyCodeFromString(""), 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) asInterface[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)) + i5;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 55904), 2854 - TextUtils.lastIndexOf("", '0'), Process.getGidForName("") + 14, -1529949196, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = b;
                    if (bArr4 != null) {
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        for (int i9 = 0; i9 < length3; i9++) {
                            bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i10 = $11 + 51;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    int i12 = $11 + 33;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i14 = $11;
                        int i15 = i14 + 119;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        if (!z) {
                            short[] sArr = asInterface;
                            int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            int i18 = i14 + 125;
                            $10 = i18 % 128;
                            if (i18 % 2 != 0) {
                                byte[] bArr6 = b;
                                int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * (((byte) (((byte) (((long) bArr6[i19]) - 3046761265686732006L)) >> s)) ^ b2));
                            } else {
                                byte[] bArr7 = b;
                                int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
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

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(setAutoCancelDuration setautocancelduration) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setautocancelduration;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            int i = 2 % 2;
            int i2 = asBinder + 71;
            d = i2 % 128;
            int i3 = i2 % 2;
            Drawable drawableNewDrawable = newDrawable();
            int i4 = asBinder + 37;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                return drawableNewDrawable;
            }
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            int i = 2 % 2;
            isAutoCancelEnabled isautocancelenabled = new isAutoCancelEnabled(this);
            int i2 = asBinder + 79;
            d = i2 % 128;
            int i3 = i2 % 2;
            return isautocancelenabled;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = asBinder + 83;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 43042);
                int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3110;
                int iAxisFromString = 21 - MotionEvent.axisFromString("");
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[5], bArr[40], bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, i4, iAxisFromString, -1272852037, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(1546878768 - Color.blue(0), Drawable.resolveOpacity(0, 0) - 126, (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (byte) (View.MeasureSpec.getSize(0) + 28), 66852456 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(1546878772 - (ViewConfiguration.getScrollBarSize() >> 8), ((Process.getThreadPriority(0) + 20) >> 6) - 126, (short) (Color.rgb(0, 0, 0) + 16777216), (byte) ((KeyEvent.getMaxKeyCode() >> 16) - 98), (ViewConfiguration.getFadingEdgeLength() >> 16) + 66852478, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 43042);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3111;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[5];
                Object[] objArr5 = new Object[1];
                a(b2, b2, bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, keyRepeatDelay, maximumDrawingCacheSize, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = asBinder + 103;
                d = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43042);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3111;
                    int pressedStateDuration = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    a(b3, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, doubleTapTimeout, pressedStateDuration, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i7 = ((int[]) objArr7[2])[0];
                int i8 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int iIdentityHashCode = System.identityHashCode(this);
                int i9 = (((~((-38485850) | iIdentityHashCode)) | 657424) * (-283)) + 1891082450 + ((~(iIdentityHashCode | (-37828426))) * 283) + 966730246;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                objArr = new Object[]{new int[1], new int[]{i8}, new int[]{i7}, strArr};
            } else {
                Object[] objArr8 = new Object[1];
                c(1546878777 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-126) - Gravity.getAbsoluteGravity(0, 0), (short) ((-1) - TextUtils.lastIndexOf("", '0')), (byte) ((-11) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 66852493, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c((ViewConfiguration.getFadingEdgeLength() >> 16) + 1546878776, Color.argb(0, 0, 0, 0) - 126, (short) (Color.rgb(0, 0, 0) + 16777216), (byte) (ExpandableListView.getPackedPositionGroup(0L) + 103), 66852509 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                int i12 = asBinder + 69;
                d = i12 % 128;
                int i13 = i12 % 2;
                try {
                    Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 966730246};
                    byte[] bArr3 = $$d;
                    byte b5 = (byte) (-bArr3[35]);
                    byte b6 = b5;
                    Object[] objArr11 = new Object[1];
                    e(b5, b6, (byte) (b6 - 1), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b7 = bArr3[35];
                    byte b8 = (byte) (b7 + 1);
                    Object[] objArr12 = new Object[1];
                    e(b8, b8, (byte) (-b7), objArr12);
                    objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 43042);
                        int absoluteGravity = 3111 - Gravity.getAbsoluteGravity(0, 0);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr13 = new Object[1];
                        a(b9, b10, b10, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, absoluteGravity, fadingEdgeLength, 154975793, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        c(1546878768 - (Process.myTid() >> 22), (-126) - TextUtils.getOffsetAfter("", 0), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (28 - Color.blue(0)), 66852456 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        c(1546878773 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-125) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (byte) ((-98) - KeyEvent.getDeadChar(0, 0)), 66852478 - Color.argb(0, 0, 0, 0), objArr15);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43042);
                            int defaultSize = View.getDefaultSize(0, 0) + 3111;
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22;
                            byte[] bArr4 = $$a;
                            byte b11 = bArr4[5];
                            Object[] objArr16 = new Object[1];
                            a(b11, b11, bArr4[7], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, defaultSize, scrollBarFadeDuration, -1269618118, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43042);
                            int i14 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3110;
                            int i15 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                            byte[] bArr5 = $$a;
                            Object[] objArr17 = new Object[1];
                            a(bArr5[5], bArr5[40], bArr5[7], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, i14, i15, -1272852037, false, (String) objArr17[0], null);
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
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[2])[0];
            if (i17 == i16) {
                int i18 = d + 101;
                asBinder = i18 % 128;
                int i19 = i18 % 2;
                int i20 = ((int[]) objArr[0])[0];
                int i21 = ((int[]) objArr[2])[0];
                int i22 = ((int[]) objArr[1])[0];
                String[] strArr2 = (String[]) objArr[3];
                int i23 = ~new Random().nextInt(1560666389);
                int i24 = i20 + (-255508182) + (((-268731905) | i23) * 494) + (((~(i23 | 786114718)) | (-404661787)) * 494);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr[0])[0] = i26 ^ (i26 << 5);
                Object[] objArr18 = {new int[1], new int[]{i22}, new int[]{i21}, strArr2};
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i27 = ((int[]) objArr[0])[0];
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr = {i28};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i30 = ~iIdentityHashCode2;
            int i31 = i27 + (-498553052) + ((1067414494 | i30) * (-369)) + (((~((-655193029) | i30)) | 1049838430) * (-369)) + (((~(iIdentityHashCode2 | 655193028)) | 412221466 | (~(i30 | (-17576065)))) * 369);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[0])[0] = i33 ^ (i33 << 5);
            Object[] objArr19 = {new int[1], new int[]{i29}, iArr, strArr4};
            int i34 = d + 87;
            asBinder = i34 % 128;
            if (i34 % 2 != 0) {
                return 0;
            }
            obj.hashCode();
            throw null;
        }

        private static String $$g(byte b2, byte b3, byte b4) {
            int i = 4 - (b2 * 4);
            byte[] bArr = $$c;
            int i2 = b3 + 117;
            int i3 = b4 * 3;
            byte[] bArr2 = new byte[i3 + 1];
            int i4 = -1;
            if (bArr == null) {
                i++;
                i2 = (-i2) + i3;
                i4 = -1;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = (byte) i2;
                if (i5 == i3) {
                    return new String(bArr2, 0);
                }
                int i6 = bArr[i];
                i++;
                i2 = (-i6) + i2;
                i4 = i5;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (!this.b) {
            this.g = z;
            if (!z) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else if (this.asInterface) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            return super.setVisible(z, z2);
        }
        throw new IllegalArgumentException("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancelAll;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.g;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f1217a;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.b) {
            return;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        }
        setAutoCancelDuration setautocancelduration = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        setAutoCancelDuration.b bVar = setautocancelduration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (bVar == null) {
            bitmap = setautocancelduration.TuitionPaymentFragmentbindingInflater1;
        } else {
            bitmap = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Rect();
        }
        Rect rect = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (this.onTransact == null) {
            this.onTransact = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.onTransact);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(animationCallback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (list != null) {
            list.clear();
        }
    }

    @Override // setAutoCancelDuration.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void b() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        setAutoCancelDuration.b bVar = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if ((bVar != null ? bVar.b : -1) == this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder.g() - 1) {
            this.asBinder++;
        }
        int i = this.d;
        if (i == -1 || this.asBinder < i) {
            return;
        }
        List<Animatable2Compat.AnimationCallback> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i2).onAnimationEnd(this);
            }
        }
        stop();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.onTransact == null) {
            this.onTransact = new Paint(2);
        }
        this.onTransact.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.onTransact == null) {
            this.onTransact = new Paint(2);
        }
        this.onTransact.setColorFilter(colorFilter);
    }
}
