package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] DRAWABLE_STATE_CHECKED = {R.attr.state_checked};
    private boolean checkable;
    private boolean checked;
    private boolean pressable;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.checkable = true;
        this.pressable = true;
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.CheckableImageButton.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(CheckableImageButton.this.isCheckable());
                accessibilityNodeInfoCompat.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.checkable || this.checked == z) {
            return;
        }
        this.checked = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.pressable) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.checked) {
            int[] iArr = DRAWABLE_STATE_CHECKED;
            return mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checked = this.checked;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.checked);
    }

    public void setCheckable(boolean z) {
        if (this.checkable != z) {
            this.checkable = z;
            sendAccessibilityEvent(0);
        }
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public void setPressable(boolean z) {
        this.pressable = z;
    }

    public boolean isPressable() {
        return this.pressable;
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.internal.CheckableImageButton.SavedState.1
            private static final byte[] $$c = {81, 125, 2, 46};
            private static final int $$f = 184;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {12, -88, 33, 118, -12, 11, -13, 4, 7, 6, 55, -68, -1, 6, 1, 2, -2, -1, 71, -71, 67, 7, -62, 9, 2, -4, 9, 52, -30, -23, 2, -4, 9, 32, -47, 4, -7, 5, 15, -12, 48, -43, 3, -2, 16, -18, 52, -46, 8, 56, -3, 19, -46, -33, 20, -16, 17, -14, 10, -6, -3, 12, -5, 2, 44, -29, -10, 1, 11, 2, -1, -7, 28, -33, 4, -8, 0, -32, 13, -10, 12, -5, 2, 31, -16, -23, 13, 9, -8, -5, 47, -43, 18, -5, -5, 9, -8, -5, 2, 4, 12, 3, -5, 9, -10, 4, -4, 3, 4, -4, 10, 2, -17, 14, 5, -17, 43, -33, 12, 0, -6, 9, 0, 0, 6, -19, 10, -7, 66};
            private static final int $$e = 91;
            private static final byte[] $$a = {23, -73, 107, 5, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
            private static final int $$b = 18;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static char[] b = {59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59827, 59839, 59828, 59836, 59815, 59835, 59798, 59812, 59835, 59829, 59824, 59815, 59836, 59835, 59835, 59710, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59746, 59703, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759, 59756, 59757, 59759, 59746, 59770, 59749, 59749};

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.google.android.material.internal.CheckableImageButton.SavedState.AnonymousClass1.$$a
                    int r6 = r6 * 10
                    int r6 = r6 + 4
                    int r7 = r7 * 3
                    int r7 = r7 + 97
                    int r1 = r8 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r7 = r6
                    r4 = r8
                    r3 = r2
                    goto L2a
                L15:
                    r3 = r2
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L19:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                L2a:
                    int r4 = -r4
                    int r6 = r6 + r4
                    int r7 = r7 + 1
                    int r6 = r6 + (-5)
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.CheckableImageButton.SavedState.AnonymousClass1.a(byte, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 13
                    int r7 = r7 + 84
                    int r6 = r6 * 73
                    int r6 = 77 - r6
                    byte[] r0 = com.google.android.material.internal.CheckableImageButton.SavedState.AnonymousClass1.$$d
                    int r8 = r8 * 21
                    int r1 = r8 + 53
                    byte[] r1 = new byte[r1]
                    int r8 = r8 + 52
                    r2 = 0
                    if (r0 != 0) goto L19
                    r4 = r7
                    r3 = r2
                    r7 = r6
                    goto L2e
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r8) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L2e:
                    int r4 = -r4
                    int r6 = r6 + r4
                    int r6 = r6 + 1
                    int r7 = r7 + 1
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.CheckableImageButton.SavedState.AnonymousClass1.d(int, short, short, java.lang.Object[]):void");
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                SavedState savedStateCreateFromParcel = createFromParcel(parcel);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return savedStateCreateFromParcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) throws Throwable {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                if (i2 % 2 == 0) {
                    createFromParcel(parcel, classLoader);
                    throw null;
                }
                SavedState savedStateCreateFromParcel = createFromParcel(parcel, classLoader);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return savedStateCreateFromParcel;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                SavedState[] savedStateArrNewArray = newArray(i);
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return savedStateArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i;
                int length;
                char[] cArr;
                int i2;
                int i3 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i4 = 0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                int i7 = iArr[2];
                int i8 = iArr[3];
                char[] cArr2 = b;
                long j = 0;
                if (cArr2 != null) {
                    int i9 = $10 + 9;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = cArr2.length;
                        cArr = new char[length];
                        i2 = 1;
                    } else {
                        length = cArr2.length;
                        cArr = new char[length];
                        i2 = 0;
                    }
                    while (i2 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i4] = Integer.valueOf(cArr2[i2]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                int iRgb = (-16775946) - Color.rgb(i4, i4, i4);
                                int packedPositionType = 18 - ExpandableListView.getPackedPositionType(j);
                                byte b2 = (byte) 5;
                                byte b3 = (byte) (b2 - 5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iRgb, packedPositionType, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i2++;
                            i4 = 0;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr;
                }
                char[] cArr3 = new char[i6];
                System.arraycopy(cArr2, i5, cArr3, 0, i6);
                if (bArr != null) {
                    char[] cArr4 = new char[i6];
                    setvideostabilizationmode.b = 0;
                    char c = 0;
                    while (setvideostabilizationmode.b < i6) {
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i10 = setvideostabilizationmode.b;
                            Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3224, 12 - MotionEvent.axisFromString(""), 2133916302, false, $$g((byte) 6, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        } else {
                            int i11 = setvideostabilizationmode.b;
                            Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cArgb = (char) (29944 - Color.argb(0, 0, 0, 0));
                                int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                byte length2 = (byte) $$c.length;
                                byte b5 = (byte) (length2 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, maximumFlingVelocity, jumpTapTimeout, 387247676, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        }
                        c = cArr4[setvideostabilizationmode.b];
                        Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.green(0) + 41241), (ViewConfiguration.getTapTimeout() >> 16) + 1705, 21 - (ViewConfiguration.getTapTimeout() >> 16), -1434471773, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    cArr3 = cArr4;
                }
                if (i8 > 0) {
                    int i12 = $10 + 115;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    char[] cArr5 = new char[i6];
                    i = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i6);
                    int i14 = i6 - i8;
                    System.arraycopy(cArr5, 0, cArr3, i14, i8);
                    System.arraycopy(cArr5, i8, cArr3, 0, i14);
                } else {
                    i = 0;
                }
                if (z) {
                    char[] cArr6 = new char[i6];
                    while (true) {
                        setvideostabilizationmode.b = i;
                        if (setvideostabilizationmode.b >= i6) {
                            break;
                        }
                        cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                        i = setvideostabilizationmode.b + 1;
                    }
                    cArr3 = cArr6;
                }
                if (i7 > 0) {
                    int i15 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i15;
                        if (setvideostabilizationmode.b >= i6) {
                            break;
                        }
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        i15 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) throws Throwable {
                Object[] objArr;
                char c = 2;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i2 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int gidForName = 9 - Process.getGidForName("");
                    byte[] bArr = $$a;
                    byte b2 = bArr[11];
                    Object[] objArr2 = new Object[1];
                    a(b2, b2, bArr[8], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, i2, gidForName, -1199417970, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new int[]{22, 15, 75, 14}, true, null, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int i3 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                    int iBlue = 10 - Color.blue(0);
                    byte b3 = $$a[11];
                    byte b4 = (byte) (b3 + 1);
                    Object[] objArr5 = new Object[1];
                    a(b4, b4, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i3, iBlue, 254769921, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                        int offsetBefore = 876 - TextUtils.getOffsetBefore("", 0);
                        int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte[] bArr2 = $$a;
                        byte b5 = bArr2[11];
                        Object[] objArr6 = new Object[1];
                        a((byte) (b5 + 1), b5, bArr2[10], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, offsetBefore, maximumFlingVelocity, 1324201839, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i4 = ~iIdentityHashCode;
                    int i5 = 1461683252 + (((~((-856736371) | i4)) | 51397218 | (~(816426141 | i4))) * (-1136)) + (((~((-856736371) | iIdentityHashCode)) | (~(816426141 | iIdentityHashCode)) | (~((-11086990) | i4))) * (-568)) + (((~(iIdentityHashCode | (-51397219))) | (~(i4 | (-816426142))) | (~(856736370 | i4))) * 568) + 178099415;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new int[]{37, 16, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new int[]{53, 16, 0, 9}, false, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1}, objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                    int i9 = i8 % 2;
                    try {
                        Object[] objArr10 = {Integer.valueOf(iIntValue), 178099415};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[14];
                        byte b7 = b6;
                        Object[] objArr11 = new Object[1];
                        d(b6, b7, b7, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b8 = bArr3[76];
                        byte b9 = b8;
                        Object[] objArr12 = new Object[1];
                        d(b8, b9, b9, objArr12);
                        Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                            int iArgb = 10 - Color.argb(0, 0, 0, 0);
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[11];
                            Object[] objArr14 = new Object[1];
                            a((byte) (b10 + 1), b10, bArr4[10], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i10, iArgb, 1324201839, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            c(new int[]{22, 15, 75, 14}, true, null, objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                                int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                byte b11 = $$a[11];
                                byte b12 = (byte) (b11 + 1);
                                Object[] objArr17 = new Object[1];
                                a(b12, b12, b11, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, threadPriority, jumpTapTimeout, 254769921, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11;
                                byte[] bArr5 = $$a;
                                byte b13 = bArr5[11];
                                Object[] objArr18 = new Object[1];
                                a(b13, b13, bArr5[8], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, modifierMetaStateMask, iIndexOf, -1199417970, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr13;
                            c = 2;
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
                int i11 = ((int[]) objArr[c])[0];
                int i12 = ((int[]) objArr[0])[0];
                if (i12 == i11) {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = ((int[]) objArr[1])[0];
                    Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i16 = i15 + 1001096684 + (((~iIdentityHashCode2) | (-6755365)) * 1444) + (((~(iIdentityHashCode2 | 21042428)) | (~(19267800 | iIdentityHashCode2)) | (-23532797)) * (-1444)) + 582405512;
                    int i17 = (i16 << 13) ^ i16;
                    int i18 = i17 ^ (i17 >>> 17);
                    ((int[]) objArr19[1])[0] = i18 ^ (i18 << 5);
                    int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                    if (i19 % 2 == 0) {
                        int i20 = 3 / 5;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[3];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
                    int i21 = ((int[]) objArr[1])[0];
                    Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iMyPid = Process.myPid();
                    int i22 = ~iMyPid;
                    int i23 = i21 + 963257266 + (((~(255798989 | i22)) | (-532639472)) * 98) + (((~(i22 | (-296109219))) | 255798989 | (~(296109218 | iMyPid))) * (-49)) + (((~(iMyPid | 255798989)) | 236530253) * 49);
                    int i24 = (i23 << 13) ^ i23;
                    int i25 = i24 ^ (i24 >>> 17);
                    ((int[]) objArr20[1])[0] = i25 ^ (i25 << 5);
                }
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                SavedState savedState = new SavedState(parcel, null);
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 24 / 0;
                }
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                int i4 = i3 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
                int i5 = i3 % 2;
                SavedState[] savedStateArr = new SavedState[i];
                int i6 = i4 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                if (i6 % 2 == 0) {
                    return savedStateArr;
                }
                throw null;
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
            private static java.lang.String $$g(int r5, byte r6, int r7) {
                /*
                    int r7 = r7 * 4
                    int r7 = 4 - r7
                    int r6 = r6 * 2
                    int r0 = 1 - r6
                    int r5 = 105 - r5
                    byte[] r1 = com.google.android.material.internal.CheckableImageButton.SavedState.AnonymousClass1.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r1 != 0) goto L16
                    r4 = r7
                    r3 = r2
                    goto L26
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r5
                    r0[r3] = r4
                    if (r3 != r6) goto L22
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L22:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                L26:
                    int r7 = r7 + 1
                    int r5 = r5 + r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.CheckableImageButton.SavedState.AnonymousClass1.$$g(int, byte, int):java.lang.String");
            }
        };
        boolean checked;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.checked ? 1 : 0);
        }

        private void readFromParcel(Parcel parcel) {
            this.checked = parcel.readInt() == 1;
        }
    }
}
