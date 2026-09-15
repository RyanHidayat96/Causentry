package defpackage;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.mlkit.common.sdkinternal.zze;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public class setSourceFormat extends AudioSpecBuilder<ValueAnimator> {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private ProcessCameraProvidergetOrCreateCameraXInstance111future1 g;
    private static final byte[] $$c = {32, 1, 70, -122};
    private static final int $$d = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, -15, -81, 1, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 90;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1389a = 1;
    private static char[] asBinder = {60043, 60051, 60052, 60040, 60116, 60054, 60044, 60048, 59747, 60117, 60059, 60047, 60082, 60049, 60056, 59745, 60046, 60106, 60090, 60045, 59744, 60058, 60060, 60041, 60088, 60050, 60055, 60042, 60057, 60053, 60035, 60062, 60063, 60118, 59746, 60061};
    private static char asInterface = 57191;

    private static void e(short s, int i, int i2, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = 145 - i;
        int i4 = 98 - (s * 14);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = i2 + (-i4);
            int i7 = i3 + 1;
            int i8 = i6 - 11;
            i5 = -1;
            i3 = i7;
            i4 = i8;
        }
        while (true) {
            int i9 = i5 + 1;
            bArr2[i9] = (byte) i4;
            if (i9 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i3;
            i5 = i9;
            i3 = i10 + 1;
            i4 = (i4 + (-bArr[i3])) - 11;
        }
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSourceFormat setsourceformat, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = f1389a + 35;
        d = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        setsourceformat.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
        setsourceformat.g.TuitionPaymentFragmentbindingInflater1 = iIntValue2;
        if (setsourceformat.TuitionPaymentFragmentbindingInflater1 != null) {
            setsourceformat.TuitionPaymentFragmentbindingInflater1.b(setsourceformat.g);
        }
        int i4 = d + 5;
        f1389a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.AudioSpecBuilder
    public final /* synthetic */ Animator TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: setSourceFormat.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                setSourceFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSourceFormat.this, valueAnimator2);
            }
        });
        int i2 = f1389a + 23;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
        return valueAnimator;
    }

    @Override // defpackage.AudioSpecBuilder
    public final /* synthetic */ AudioSpecBuilder b(float f) {
        int i = 2 % 2;
        int i2 = d + 73;
        f1389a = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = this.b;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.b != null) {
            long j = (long) (f * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (((ValueAnimator) this.b).getValues() != null && ((ValueAnimator) this.b).getValues().length > 0) {
                int i3 = d + 85;
                f1389a = i3 % 128;
                int i4 = i3 % 2;
                ((ValueAnimator) this.b).setCurrentPlayTime(j);
                int i5 = d + 5;
                f1389a = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return this;
    }

    public setSourceFormat(getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        super(tuitionPaymentFragmentbindingInflater1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1;
        this.g = new ProcessCameraProvidergetOrCreateCameraXInstance111future1();
    }

    public final setSourceFormat TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2) {
        int i3 = 2 % 2;
        if (this.b != null) {
            int i4 = f1389a + 35;
            int i5 = i4 % 128;
            d = i5;
            int i6 = i4 % 2;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != i) {
                int i7 = i5 + 9;
                int i8 = i7 % 128;
                f1389a = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 45;
                d = i10 % 128;
                int i11 = i10 % 2;
            } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != i2) {
                int i12 = i5 + 79;
                f1389a = i12 % 128;
                int i13 = i12 % 2;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
            PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", i, i2);
            propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
            PropertyValuesHolder propertyValuesHolderOfInt2 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE_REVERSE", i2, i);
            propertyValuesHolderOfInt2.setEvaluator(new IntEvaluator());
            ((ValueAnimator) this.b).setValues(propertyValuesHolderOfInt, propertyValuesHolderOfInt2);
        }
        return this;
    }

    private static void c(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = asBinder;
        long j = 0;
        int i6 = 1770390596;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 39;
                $11 = i8 % 128;
                if (i8 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int edgeSlop = 2267 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int i9 = 34 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1));
                            byte b2 = (byte) ($$c[1] - 1);
                            byte b3 = (byte) (b2 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, edgeSlop, i9, -1927765101, false, $$e(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i7--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2267;
                        int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32;
                        byte b4 = (byte) ($$c[1] - 1);
                        byte b5 = (byte) (b4 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, fadingEdgeLength, i10, -1927765101, false, $$e(b4, b5, (byte) (b5 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i4 = 2;
                j = 0;
                i6 = 1770390596;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(asInterface)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
            int capsMode = 2267 - TextUtils.getCapsMode("", 0, 0);
            int iArgb = Color.argb(0, 0, 0, 0) + 33;
            byte b6 = (byte) ($$c[1] - 1);
            byte b7 = (byte) (b6 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, capsMode, iArgb, -1927765101, false, $$e(b6, b7, (byte) (b7 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i11 = $10 + 81;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                i2 = i + 39;
                cArr4[i2] = (char) (cArr[i2] % b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                } else {
                    try {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cResolveSizeAndState = (char) (49267 - View.resolveSizeAndState(0, 0, 0));
                            int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3260;
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30;
                            byte b8 = (byte) ($$c[1] - 1);
                            byte b9 = (byte) (b8 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, i12, scrollBarFadeDuration, -127612708, false, $$e(b8, b9, (byte) (b9 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                            int i13 = $10 + 57;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c = (char) (22879 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                int pressedStateDuration2 = 594 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int i15 = 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                byte b10 = (byte) ($$c[1] - 1);
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, pressedStateDuration2, i15, 1570859318, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                            i3 = $11 + 67;
                        } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i17 = $11 + 17;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                            i3 = $11 + 81;
                        } else {
                            int i21 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i22 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i21];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i22];
                        }
                        $10 = i3 % 128;
                        int i23 = i3 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
            }
        }
        for (int i24 = 0; i24 < i; i24++) {
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0727  */
    /* JADX WARN: Code duplicated, block: B:38:0x040f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0415  */
    /* JADX WARN: Code duplicated, block: B:44:0x0422  */
    /* JADX WARN: Code duplicated, block: B:46:0x0430 A[Catch: Exception -> 0x06e0, TRY_ENTER, TryCatch #0 {Exception -> 0x06e0, blocks: (B:41:0x0419, B:46:0x0430, B:51:0x0469, B:68:0x0540, B:58:0x04d0, B:60:0x04d6, B:61:0x04d7, B:62:0x04d8, B:47:0x0440, B:52:0x047b, B:54:0x0488, B:55:0x04c1), top: B:111:0x0419, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0440 A[Catch: Exception -> 0x06e0, TRY_LEAVE, TryCatch #0 {Exception -> 0x06e0, blocks: (B:41:0x0419, B:46:0x0430, B:51:0x0469, B:68:0x0540, B:58:0x04d0, B:60:0x04d6, B:61:0x04d7, B:62:0x04d8, B:47:0x0440, B:52:0x047b, B:54:0x0488, B:55:0x04c1), top: B:111:0x0419, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0469 A[Catch: Exception -> 0x06e0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x06e0, blocks: (B:41:0x0419, B:46:0x0430, B:51:0x0469, B:68:0x0540, B:58:0x04d0, B:60:0x04d6, B:61:0x04d7, B:62:0x04d8, B:47:0x0440, B:52:0x047b, B:54:0x0488, B:55:0x04c1), top: B:111:0x0419, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0488 A[Catch: all -> 0x04cf, TryCatch #7 {all -> 0x04cf, blocks: (B:52:0x047b, B:54:0x0488, B:55:0x04c1), top: B:123:0x047b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x04d8 A[Catch: Exception -> 0x06e0, TRY_LEAVE, TryCatch #0 {Exception -> 0x06e0, blocks: (B:41:0x0419, B:46:0x0430, B:51:0x0469, B:68:0x0540, B:58:0x04d0, B:60:0x04d6, B:61:0x04d7, B:62:0x04d8, B:47:0x0440, B:52:0x047b, B:54:0x0488, B:55:0x04c1), top: B:111:0x0419, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x04f7 A[Catch: all -> 0x0607, TryCatch #3 {all -> 0x0607, blocks: (B:63:0x04ea, B:65:0x04f7, B:66:0x052f), top: B:116:0x04ea, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x05b4 A[Catch: Exception -> 0x06e1, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x06e1, blocks: (B:71:0x05b4, B:73:0x05db, B:78:0x05e1, B:80:0x0608, B:82:0x060f, B:83:0x0610, B:84:0x0611, B:89:0x06b0, B:94:0x06d8, B:96:0x06de, B:97:0x06df, B:85:0x065f, B:87:0x066c, B:88:0x06a9, B:63:0x04ea, B:65:0x04f7, B:66:0x052f), top: B:122:0x0420, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x05e1 A[Catch: Exception -> 0x06e1, TRY_ENTER, TryCatch #6 {Exception -> 0x06e1, blocks: (B:71:0x05b4, B:73:0x05db, B:78:0x05e1, B:80:0x0608, B:82:0x060f, B:83:0x0610, B:84:0x0611, B:89:0x06b0, B:94:0x06d8, B:96:0x06de, B:97:0x06df, B:85:0x065f, B:87:0x066c, B:88:0x06a9, B:63:0x04ea, B:65:0x04f7, B:66:0x052f), top: B:122:0x0420, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0611 A[Catch: Exception -> 0x06e1, TRY_LEAVE, TryCatch #6 {Exception -> 0x06e1, blocks: (B:71:0x05b4, B:73:0x05db, B:78:0x05e1, B:80:0x0608, B:82:0x060f, B:83:0x0610, B:84:0x0611, B:89:0x06b0, B:94:0x06d8, B:96:0x06de, B:97:0x06df, B:85:0x065f, B:87:0x066c, B:88:0x06a9, B:63:0x04ea, B:65:0x04f7, B:66:0x052f), top: B:122:0x0420, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x066c A[Catch: all -> 0x06d7, TryCatch #2 {all -> 0x06d7, blocks: (B:85:0x065f, B:87:0x066c, B:88:0x06a9), top: B:114:0x065f, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:92:0x06c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v106 */
    /* JADX WARN: Type inference failed for: r5v107 */
    /* JADX WARN: Type inference failed for: r5v108 */
    /* JADX WARN: Type inference failed for: r5v109 */
    /* JADX WARN: Type inference failed for: r5v110 */
    /* JADX WARN: Type inference failed for: r5v111 */
    /* JADX WARN: Type inference failed for: r5v112 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [byte] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        ?? r5;
        ?? packedPositionGroup;
        int i6;
        ?? r6;
        int i7;
        int i8;
        String str;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i9;
        char[] cArr;
        int i10;
        int i11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        long jLongValue;
        int i12;
        int i13;
        int i14;
        int i15;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i16 = 2 % 2;
        int i17 = d;
        int i18 = i17 + 93;
        f1389a = i18 % 128;
        int i19 = i18 % 2;
        if (context != null) {
            int i20 = (i17 ^ 99) + ((i17 & 99) << 1);
            f1389a = i20 % 128;
            int i21 = i20 % 2;
            try {
                int i22 = -(Process.myTid() >> 22);
                int i23 = -KeyEvent.normalizeMetaState(0);
                Object[] objArr2 = new Object[1];
                c(new char[]{23, 27, '#', 20, 1, 26, '!', '\b', 20, '\b', '#', 17, '#', 25, 6, '\n', 26, 0, '#', 17, ' ', 31, 13855}, (byte) (((i22 | 49) << 1) - (i22 ^ 49)), (i23 & 23) + (23 | i23), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                char[] cArr2 = {19, Typography.quote, 6, 23, 13819, 13819, 27, 26, 15, 20, 7, 29, 5, 26, 17, 24, ' ', 5};
                int i24 = -TextUtils.getTrimmedLength("");
                int i25 = i24 * (-501);
                int i26 = (i25 & 8551) + (i25 | 8551);
                int i27 = ~((-18) | i);
                int i28 = ~((i24 ^ 17) | (i24 & 17));
                int i29 = -(-(((i27 ^ i28) | (i27 & i28)) * (-502)));
                int i30 = (i26 ^ i29) + ((i29 & i26) << 1);
                int i31 = ~i;
                int i32 = (-18) | i31;
                int i33 = -(-((~((i32 ^ i24) | (i32 & i24))) * (-502)));
                int i34 = (i30 ^ i33) + ((i33 & i30) << 1);
                int i35 = ~i24;
                int i36 = ~((i35 & i) | (i35 ^ i));
                int i37 = -(-(((i36 & (-18)) | ((-18) ^ i36)) * TypedValues.PositionType.TYPE_DRAWPATH));
                byte b = (byte) ((i34 & i37) + (i34 | i37));
                int i38 = -Color.argb(0, 0, 0, 0);
                int iB = zze.b();
                int i39 = i38 * 868;
                int i40 = ((i39 | 15624) << 1) - (i39 ^ 15624);
                int i41 = ~i38;
                int i42 = ~iB;
                int i43 = ~((i41 ^ i42) | (i41 & i42));
                int i44 = f1389a;
                int i45 = (i44 ^ 105) + ((i44 & 105) << 1);
                d = i45 % 128;
                int i46 = i45 % 2;
                int i47 = ~(((-19) ^ i42) | ((-19) & i42));
                int i48 = -(-((-867) * ((i47 & i43) | (i43 ^ i47))));
                int i49 = (i40 & i48) + (i48 | i40);
                int i50 = ~i38;
                int i51 = ~((i50 ^ (-19)) | (i50 & (-19)));
                int i52 = ~((i41 ^ iB) | (i41 & iB));
                int i53 = (i51 & i52) | (i51 ^ i52);
                int i54 = ~(((-19) ^ iB) | ((-19) & iB));
                int i55 = ((i53 & i54) | (i53 ^ i54)) * (-1734);
                int i56 = (i49 ^ i55) + ((i49 & i55) << 1);
                int i57 = (i41 ^ (-19)) | (i41 & (-19));
                int i58 = ~((i57 & i42) | (i57 ^ i42));
                int i59 = ~((i50 & 18) | (i50 ^ 18) | iB);
                int i60 = (i59 & i58) | (i58 ^ i59);
                int i61 = ((-19) ^ i38) | ((-19) & i38);
                int i62 = ~((i61 & iB) | (i61 ^ iB));
                int i63 = -(-(((i60 & i62) | (i60 ^ i62)) * 867));
                int i64 = ((i56 | i63) << 1) - (i63 ^ i56);
                Object[] objArr3 = new Object[1];
                c(cArr2, b, i64, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                int i65 = ~iIndexOf;
                int i66 = ~((i65 & (-45)) | (i65 ^ (-45)));
                int i67 = ~iIndexOf;
                int i68 = ~((i67 ^ i) | (i67 & i));
                int i69 = (i66 & i68) | (i66 ^ i68);
                int i70 = ~(((-45) & i) | ((-45) ^ i));
                int i71 = (iIndexOf * 881) + 38764 + (((i69 & i70) | (i69 ^ i70)) * (-880));
                int i72 = d + 123;
                f1389a = i72 % 128;
                int i73 = i72 % 2;
                int i74 = ~((i67 ^ i31) | (i67 & i31));
                int i75 = (i74 & 44) | (44 ^ i74);
                int i76 = ~((iIndexOf & i) | (iIndexOf ^ i));
                int i77 = -(-((-880) * ((i75 & i76) | (i75 ^ i76))));
                int i78 = (i71 ^ i77) + ((i71 & i77) << 1);
                int i79 = -(-(i76 * 880));
                Object[] objArr4 = new Object[1];
                c(new char[]{23, 27, '#', 20, 1, 26, '!', '\b', 20, '\b', '#', 17, '#', 25, 6, '\n', 1, 0, 6, 21, 13845, 13845, 27, 26, 15, 20, 7, 29, 5, 26, 17, 24, ' ', 5}, (byte) (((i78 | i79) << 1) - (i79 ^ i78)), 33 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                int i80 = -Gravity.getAbsoluteGravity(0, 0);
                int i81 = i80 * (-716);
                int i82 = (i81 & 170765) + (i81 | 170765);
                int i83 = ~i80;
                int i84 = ((i83 ^ 119) | (i83 & 119)) * (-1434);
                int i85 = (i82 & i84) + (i84 | i82);
                int i86 = ~(i31 | 119);
                int i87 = (i80 & 119) | (i80 ^ 119);
                int i88 = ~i87;
                int i89 = (i86 & i88) | (i86 ^ i88);
                int i90 = i83 | (-120);
                int i91 = ~((i90 & i) | (i90 ^ i));
                int i92 = i85 + (((i89 & i91) | (i89 ^ i91)) * 717);
                int i93 = (i83 & (-120)) | (i83 ^ (-120));
                int i94 = ~i;
                int i95 = (~i87) | (~((i93 & i94) | (i93 ^ i94)));
                int i96 = ~(i | 119);
                int i97 = ((i95 & i96) | (i95 ^ i96)) * 717;
                byte b2 = (byte) ((i92 & i97) + (i97 | i92));
                int i98 = d + 1;
                f1389a = i98 % 128;
                int i99 = i98 % 2;
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int iB2 = zze.b();
                int i100 = iIndexOf2 * 755;
                int i101 = (i100 & (-4518)) + (i100 | (-4518));
                int i102 = ~iIndexOf2;
                int i103 = i102 | 6;
                int i104 = ~i103;
                int i105 = ~((i102 & iB2) | (i102 ^ iB2));
                int i106 = i101 + (((i105 & i104) | (i104 ^ i105) | (~((6 ^ iB2) | (6 & iB2)))) * (-754));
                int i107 = ~((i103 ^ iB2) | (i103 & iB2));
                int i108 = ~iB2;
                int i109 = (i108 & iIndexOf2) | (i108 ^ iIndexOf2);
                int i110 = ~((i109 & 6) | (i109 ^ 6));
                int i111 = (i107 & i110) | (i107 ^ i110);
                int i112 = d;
                int i113 = (i112 & 59) + (i112 | 59);
                f1389a = i113 % 128;
                int i114 = i113 % 2;
                int i115 = (-754) * i111;
                int i116 = ~iIndexOf2;
                int i117 = ~iB2;
                int i118 = (i106 & i115) + (i106 | i115) + (((i116 & i117) | (i116 ^ i117)) * 754);
                Object[] objArr5 = new Object[1];
                c(new char[]{' ', 29, 22, 23, 13920}, b2, i118, objArr5);
                int i119 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                int i120 = -i119;
                int i121 = ((i119 & i120) | (i119 ^ i120)) >> 31;
                int i122 = (~i121) & i;
                int i123 = i121 & ((i & (-2)) | (i94 & 1));
                i4 = (i123 & i122) | (i122 ^ i123);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            i4 = i;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 16949);
                int defaultSize = 2739 - View.getDefaultSize(0, 0);
                int i124 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13;
                byte b3 = $$a[3];
                Object[] objArr6 = new Object[1];
                e(b3, (short) (b3 | 140), (byte) 52, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, defaultSize, i124, 1501733736, false, (String) objArr6[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 16949);
                int iResolveSizeAndState = 2739 - View.resolveSizeAndState(0, 0, 0);
                int i125 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13;
                byte b4 = $$a[3];
                Object[] objArr7 = new Object[1];
                e(b4, (short) (b4 | 88), (byte) 52, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, iResolveSizeAndState, i125, 47863026, false, (String) objArr7[0], null);
            }
            Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null);
            int i126 = d + 71;
            f1389a = i126 % 128;
            int i127 = i126 % 2;
            if (!set.contains(obj)) {
                int i128 = d + 11;
                f1389a = i128 % 128;
                if (i128 % 2 == 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 16949);
                        int iRgb = (-16774477) - Color.rgb(0, 0, 0);
                        int touchSlop = 13 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte b5 = $$a[3];
                        short s = (short) (b5 | 36);
                        Object[] objArr8 = new Object[1];
                        e(b5, s, (byte) s, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iRgb, touchSlop, 631063962, false, (String) objArr8[0], null);
                    }
                    boolean zContains = set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null));
                    int i129 = 27 / 0;
                    if (zContains) {
                        if (Build.VERSION.SDK_INT == 30) {
                            i5 = i;
                            r5 = i5;
                        }
                    }
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (16949 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int packedPositionGroup2 = 2739 - ExpandableListView.getPackedPositionGroup(0L);
                        int touchSlop2 = 13 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte b6 = $$a[3];
                        short s2 = (short) (b6 | 36);
                        Object[] objArr9 = new Object[1];
                        e(b6, s2, (byte) s2, objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, packedPositionGroup2, touchSlop2, 631063962, false, (String) objArr9[0], null);
                    }
                    if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null))) {
                        if (Build.VERSION.SDK_INT == 30) {
                            i5 = i;
                            r5 = i5;
                        }
                    }
                }
                try {
                    i8 = 26;
                    packedPositionGroup = 33;
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            i9 = d + 77;
                            f1389a = i9 % 128;
                            if (i9 % 2 == 0) {
                                cArr = new char[]{1, Typography.quote, '\b', 17, 1, 28, 24, 26, '\n', 5, 13930, 13930, '\b', 31, Typography.quote, '!', Typography.quote, 25, 22, 28, 23, 22, 29, 27, '!', 7, 20, 17};
                                i10 = 1;
                                packedPositionGroup = (byte) (26 >> ExpandableListView.getPackedPositionGroup(0L));
                            } else {
                                cArr = new char[]{1, Typography.quote, '\b', 17, 1, 28, 24, 26, '\n', 5, 13930, 13930, '\b', 31, Typography.quote, '!', Typography.quote, 25, 22, 28, 23, 22, 29, 27, '!', 7, 20, 17};
                                int i130 = -ExpandableListView.getPackedPositionGroup(0L);
                                i10 = 1;
                                packedPositionGroup = (byte) ((i130 ^ 116) + ((i130 & 116) << 1));
                                i8 = 28;
                            }
                            int i131 = f1389a;
                            i11 = (i131 ^ 49) + ((i131 & 49) << i10);
                            d = i11 % 128;
                            if (i11 % 2 != 0) {
                                Object[] objArr10 = new Object[1];
                                c(cArr, packedPositionGroup, i8 / (ViewConfiguration.getEdgeSlop() >>> 113), objArr10);
                                try {
                                    Object[] objArr11 = {(String) objArr10[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                        int iMyTid = 993 - (Process.myTid() >> 22);
                                        int i132 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8;
                                        byte b7 = $$a[7];
                                        short s3 = b7;
                                        Object[] objArr12 = new Object[1];
                                        e(b7, s3, (byte) s3, objArr12);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, iMyTid, i132, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                                    }
                                    jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr11)).longValue();
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                Object[] objArr13 = new Object[1];
                                c(cArr, packedPositionGroup, i8 - (ViewConfiguration.getEdgeSlop() >> 16), objArr13);
                                try {
                                    Object[] objArr14 = {(String) objArr13[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                        int i133 = 994 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        int keyRepeatTimeout = 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        byte b8 = $$a[7];
                                        short s4 = b8;
                                        Object[] objArr15 = new Object[1];
                                        e(b8, s4, (byte) s4, objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, i133, keyRepeatTimeout, 410748506, false, (String) objArr15[0], new Class[]{String.class});
                                    }
                                    packedPositionGroup = (Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    jLongValue = ((Long) packedPositionGroup.invoke(null, objArr14)).longValue();
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                            long j = 874562624;
                            long j2 = -949;
                            long j3 = -1;
                            long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                            long j4 = elapsedCpuTime ^ j3;
                            long j5 = (j2 * j) + (j2 * jLongValue) + (((long) 1900) * ((((jLongValue ^ j3) | j4) ^ j3) | (((j ^ j3) | elapsedCpuTime) ^ j3))) + (((long) (-950)) * (((j4 | j) ^ j3) | ((jLongValue | elapsedCpuTime) ^ j3))) + (((long) 950) * (((elapsedCpuTime | j) ^ j3) | ((jLongValue | j4) ^ j3))) + ((long) (-1075480861));
                            i12 = i;
                            i13 = ((int) (j5 >> 32)) & ((((-1076941256) + ((1876426749 | i12) * (-381))) + (((~((~i12) | 1690417896)) | 1809244117) * 381)) - 1954020614);
                            int i134 = d;
                            i14 = ((i134 | 91) << 1) - (i134 ^ 91);
                            f1389a = i14 % 128;
                            i15 = (int) j5;
                            if (i14 % 2 == 0) {
                                int i135 = ~((~((int) Runtime.getRuntime().maxMemory())) | (-238755628));
                                int i136 = i15 & (((1094983764 | i135) * (-970)) + 782156701 + ((i135 | (-1333739392)) * 970));
                                i6 = (i13 & i136) | (i13 ^ i136);
                                int i137 = 5 / 0;
                                r6 = i12;
                            } else {
                                int i138 = ~((int) Process.getStartUptimeMillis());
                                int i139 = i15 & (1481259669 + (((~(i138 | (-1628159504))) | 1611306506) * (-160)) + (((~(i138 | (-190933094))) | (-1628159504)) * 160));
                                i6 = (i13 & i139) | (i13 ^ i139);
                                r6 = i12;
                            }
                        } else {
                            packedPositionGroup = i;
                            int i140 = -(-TextUtils.indexOf("", "", 0, 0));
                            Object[] objArr16 = new Object[1];
                            c(new char[]{13803}, (byte) ((i140 & 64) + (i140 | 64)), -TextUtils.lastIndexOf("", '0', 0, 0), objArr16);
                            str = (String) objArr16[0];
                            char[] cArr3 = {20, 5, '\b', '!', Typography.quote, 25, 22, 28, 23, 22, 29, 27, 13871};
                            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                            Object[] objArr17 = new Object[1];
                            c(cArr3, (byte) ((jumpTapTimeout & 48) + (jumpTapTimeout | 48)), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr17);
                            try {
                                objArr = new Object[]{(String) objArr17[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 33603);
                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 3086;
                                    int iMyTid2 = (Process.myTid() >> 22) + 26;
                                    byte b9 = $$a[7];
                                    short s5 = b9;
                                    Object[] objArr18 = new Object[1];
                                    e(b9, s5, (byte) s5, objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iLastIndexOf, iMyTid2, 1411172903, false, (String) objArr18[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i141 = f1389a;
                                    int i142 = ((i141 | 43) << 1) - (i141 ^ 43);
                                    d = i142 % 128;
                                    int i143 = i142 % 2;
                                    i6 = 1;
                                    r6 = packedPositionGroup;
                                } else {
                                    int i144 = f1389a;
                                    int i145 = (i144 ^ 49) + ((i144 & 49) << 1);
                                    d = i145 % 128;
                                    int i146 = i145 % 2;
                                    i6 = 0;
                                    r6 = packedPositionGroup;
                                }
                            } catch (Throwable th4) {
                                Throwable cause4 = th4.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th4;
                            }
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    packedPositionGroup = i;
                }
                int i147 = (r6 == true ? 1 : 0) ^ 10;
                int i148 = -i6;
                int i149 = ((i6 & i148) | (i6 ^ i148)) >> 31;
                int i150 = (~i149) & (r6 == true ? 1 : 0);
                int i151 = i149 & i147;
                int i152 = (i151 & (i150 == true ? 1 : 0)) | ((i150 == true ? 1 : 0) ^ i151);
                int i153 = f1389a;
                int i154 = (i153 & 87) + (i153 | 87);
                d = i154 % 128;
                int i155 = i154 % 2;
                int i156 = i2 & 32;
                int i157 = ((i153 | 59) << 1) - (i153 ^ 59);
                int i158 = i157 % 128;
                d = i158;
                int i159 = i157 % 2;
                int i160 = (i156 | (-i156)) >> 31;
                int i161 = i152 & (~i160);
                int i162 = (i158 & 121) + (i158 | 121);
                f1389a = i162 % 128;
                i7 = i162 % 2;
                int i163 = (r6 == true ? 1 : 0) & i160;
                i5 = (i161 & i163) | (i161 ^ i163);
                r5 = r6;
                if (i7 == 0) {
                    int i164 = 71 / 0;
                    r5 = r6;
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                i5 = i;
                r5 = i5;
            } else {
                i8 = 26;
                packedPositionGroup = 33;
                if (Build.VERSION.SDK_INT > 33) {
                    i9 = d + 77;
                    f1389a = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr = new char[]{1, Typography.quote, '\b', 17, 1, 28, 24, 26, '\n', 5, 13930, 13930, '\b', 31, Typography.quote, '!', Typography.quote, 25, 22, 28, 23, 22, 29, 27, '!', 7, 20, 17};
                        i10 = 1;
                        packedPositionGroup = (byte) (26 >> ExpandableListView.getPackedPositionGroup(0L));
                    } else {
                        cArr = new char[]{1, Typography.quote, '\b', 17, 1, 28, 24, 26, '\n', 5, 13930, 13930, '\b', 31, Typography.quote, '!', Typography.quote, 25, 22, 28, 23, 22, 29, 27, '!', 7, 20, 17};
                        int i1310 = -ExpandableListView.getPackedPositionGroup(0L);
                        i10 = 1;
                        packedPositionGroup = (byte) ((i1310 ^ 116) + ((i1310 & 116) << 1));
                        i8 = 28;
                    }
                    int i1311 = f1389a;
                    i11 = (i1311 ^ 49) + ((i1311 & 49) << i10);
                    d = i11 % 128;
                    if (i11 % 2 != 0) {
                        Object[] objArr19 = new Object[1];
                        c(cArr, packedPositionGroup, i8 / (ViewConfiguration.getEdgeSlop() >>> 113), objArr19);
                        Object[] objArr110 = {(String) objArr19[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                            int iMyTid3 = 993 - (Process.myTid() >> 22);
                            int i1312 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8;
                            byte b10 = $$a[7];
                            short s6 = b10;
                            Object[] objArr111 = new Object[1];
                            e(b10, s6, (byte) s6, objArr111);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString2, iMyTid3, i1312, 410748506, false, (String) objArr111[0], new Class[]{String.class});
                        }
                        jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr110)).longValue();
                    } else {
                        Object[] objArr112 = new Object[1];
                        c(cArr, packedPositionGroup, i8 - (ViewConfiguration.getEdgeSlop() >> 16), objArr112);
                        Object[] objArr113 = {(String) objArr112[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                            int i1313 = 994 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int keyRepeatTimeout2 = 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            byte b11 = $$a[7];
                            short s7 = b11;
                            Object[] objArr114 = new Object[1];
                            e(b11, s7, (byte) s7, objArr114);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates2, i1313, keyRepeatTimeout2, 410748506, false, (String) objArr114[0], new Class[]{String.class});
                        }
                        packedPositionGroup = (Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        jLongValue = ((Long) packedPositionGroup.invoke(null, objArr113)).longValue();
                    }
                    long j6 = 874562624;
                    long j7 = -949;
                    long j8 = -1;
                    long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                    long j9 = elapsedCpuTime2 ^ j8;
                    long j10 = (j7 * j6) + (j7 * jLongValue) + (((long) 1900) * ((((jLongValue ^ j8) | j9) ^ j8) | (((j6 ^ j8) | elapsedCpuTime2) ^ j8))) + (((long) (-950)) * (((j9 | j6) ^ j8) | ((jLongValue | elapsedCpuTime2) ^ j8))) + (((long) 950) * (((elapsedCpuTime2 | j6) ^ j8) | ((jLongValue | j9) ^ j8))) + ((long) (-1075480861));
                    i12 = i;
                    i13 = ((int) (j10 >> 32)) & ((((-1076941256) + ((1876426749 | i12) * (-381))) + (((~((~i12) | 1690417896)) | 1809244117) * 381)) - 1954020614);
                    int i1314 = d;
                    i14 = ((i1314 | 91) << 1) - (i1314 ^ 91);
                    f1389a = i14 % 128;
                    i15 = (int) j10;
                    if (i14 % 2 == 0) {
                        int i1315 = ~((~((int) Runtime.getRuntime().maxMemory())) | (-238755628));
                        int i1316 = i15 & (((1094983764 | i1315) * (-970)) + 782156701 + ((i1315 | (-1333739392)) * 970));
                        i6 = (i13 & i1316) | (i13 ^ i1316);
                        int i1317 = 5 / 0;
                        r6 = i12;
                    } else {
                        int i1318 = ~((int) Process.getStartUptimeMillis());
                        int i1319 = i15 & (1481259669 + (((~(i1318 | (-1628159504))) | 1611306506) * (-160)) + (((~(i1318 | (-190933094))) | (-1628159504)) * 160));
                        i6 = (i13 & i1319) | (i13 ^ i1319);
                        r6 = i12;
                    }
                } else {
                    packedPositionGroup = i;
                    int i1410 = -(-TextUtils.indexOf("", "", 0, 0));
                    Object[] objArr115 = new Object[1];
                    c(new char[]{13803}, (byte) ((i1410 & 64) + (i1410 | 64)), -TextUtils.lastIndexOf("", '0', 0, 0), objArr115);
                    str = (String) objArr115[0];
                    char[] cArr4 = {20, 5, '\b', '!', Typography.quote, 25, 22, 28, 23, 22, 29, 27, 13871};
                    int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                    Object[] objArr116 = new Object[1];
                    c(cArr4, (byte) ((jumpTapTimeout2 & 48) + (jumpTapTimeout2 | 48)), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr116);
                    objArr = new Object[]{(String) objArr116[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 33603);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 3086;
                        int iMyTid4 = (Process.myTid() >> 22) + 26;
                        byte b12 = $$a[7];
                        short s8 = b12;
                        Object[] objArr117 = new Object[1];
                        e(b12, s8, (byte) s8, objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild2, iLastIndexOf2, iMyTid4, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                    }
                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                        int i1411 = f1389a;
                        int i1412 = ((i1411 | 43) << 1) - (i1411 ^ 43);
                        d = i1412 % 128;
                        int i1413 = i1412 % 2;
                        i6 = 1;
                        r6 = packedPositionGroup;
                    } else {
                        int i1414 = f1389a;
                        int i1415 = (i1414 ^ 49) + ((i1414 & 49) << 1);
                        d = i1415 % 128;
                        int i1416 = i1415 % 2;
                        i6 = 0;
                        r6 = packedPositionGroup;
                    }
                }
                int i1417 = (r6 == true ? 1 : 0) ^ 10;
                int i1418 = -i6;
                int i1419 = ((i6 & i1418) | (i6 ^ i1418)) >> 31;
                int i1510 = (~i1419) & (r6 == true ? 1 : 0);
                int i1511 = i1419 & i1417;
                int i1512 = (i1511 & (i1510 == true ? 1 : 0)) | ((i1510 == true ? 1 : 0) ^ i1511);
                int i1513 = f1389a;
                int i1514 = (i1513 & 87) + (i1513 | 87);
                d = i1514 % 128;
                int i1515 = i1514 % 2;
                int i1516 = i2 & 32;
                int i1517 = ((i1513 | 59) << 1) - (i1513 ^ 59);
                int i1518 = i1517 % 128;
                d = i1518;
                int i1519 = i1517 % 2;
                int i165 = (i1516 | (-i1516)) >> 31;
                int i166 = i1512 & (~i165);
                int i167 = (i1518 & 121) + (i1518 | 121);
                f1389a = i167 % 128;
                i7 = i167 % 2;
                int i168 = (r6 == true ? 1 : 0) & i165;
                i5 = (i166 & i168) | (i166 ^ i168);
                r5 = r6;
                if (i7 == 0) {
                    int i169 = 71 / 0;
                    r5 = r6;
                }
            }
            int i170 = (~(r5 & i4)) & (r5 | i4);
            int i171 = (i170 | (-i170)) >> 31;
            int i172 = i5 & (~i171);
            int i173 = i171 & i4;
            int i174 = (i172 & i173) | (i172 ^ i173);
            int i175 = ((~i174) & r5) | ((~r5) & i174);
            int i176 = -i175;
            int i177 = (((i175 & i176) | (i175 ^ i176)) >> 31) & 16;
            Object[] objArr20 = {new int[]{r5}, new int[1], new int[]{i174}, null};
            int i178 = ~((int) Runtime.getRuntime().totalMemory());
            int i179 = (-1606721932) + ((~((-786482) | i178)) * 52) + (((~(242480774 | i178)) | (~(202170545 | i178)) | (-243267256)) * (-52)) + (((~(i178 | (-242480775))) | 201384064) * 52);
            int iB3 = zze.b();
            int i180 = i177 * 495;
            int i181 = -(-(i179 * (-493)));
            int i182 = ((i180 | i181) << 1) - (i180 ^ i181);
            int i183 = ~i179;
            int i184 = ((i183 & i177) | (i177 ^ i183)) * (-988);
            int i185 = ((i182 | i184) << 1) - (i184 ^ i182);
            int i186 = ~i177;
            int i187 = (i186 & i179) | (i179 ^ i186);
            int i188 = ~iB3;
            int i189 = ((i187 & i188) | (i187 ^ i188)) * 494;
            int i190 = ((i185 | i189) << 1) - (i189 ^ i185);
            int i191 = ~i177;
            int i192 = ~i179;
            int i193 = (~((i188 & i179) | (i188 ^ i179))) | (~((i191 & i192) | (i191 ^ i192)));
            int i194 = ~((i177 & i179) | (i177 ^ i179));
            int i195 = ((i193 & i194) | (i193 ^ i194)) * 494;
            int i196 = (i190 & i195) + (i195 | i190);
            int iB4 = zze.b();
            int i197 = ((i196 * (-743)) - (~(i3 * (-743)))) - 1;
            int i198 = (i196 ^ i3) | (i196 & i3);
            int i199 = (~i198) | (~((i196 ^ iB4) | (i196 & iB4)));
            int i200 = ~((i3 ^ iB4) | (i3 & iB4));
            int i201 = ((i199 & i200) | (i199 ^ i200)) * (-744);
            int i202 = (i197 & i201) + (i197 | i201);
            int i203 = ~iB4;
            int i204 = ~((~i196) | (~i3));
            int i205 = ((i204 & i203) | (i203 ^ i204)) * 744;
            int i206 = ((i202 | i205) << 1) - (i205 ^ i202);
            int i207 = -(-(((iB4 & i198) | (i198 ^ iB4)) * 744));
            int i208 = (i206 & i207) + (i207 | i206);
            int i209 = (i208 << 13) ^ i208;
            int i210 = i209 >>> 17;
            int i211 = ((~i209) & i210) | ((~i210) & i209);
            ((int[]) objArr20[1])[0] = i211 ^ (i211 << 5);
            return objArr20;
        } catch (Throwable th5) {
            Throwable cause5 = th5.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th5;
        }
    }

    private static String $$e(int i, short s, int i2) {
        int i3 = i2 * 4;
        int i4 = 116 - s;
        int i5 = 4 - (i * 2);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i4 = (-i5) + i4;
            i5++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i3) {
                return new String(bArr2, 0);
            }
            int i8 = i4;
            i6 = i7;
            i4 = (-bArr[i5]) + i8;
            i5++;
        }
    }
}
