package com.bpjstku.presentation.bsu;

import android.content.ComponentCallbacks;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.dispatchOnCreate;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroid/arch/lifecycle/ViewModel;", "org/koin/android/viewmodel/ext/android/LifecycleOwnerExtKt$viewModel$2"}, k = 3, mv = {2, 1, 0})
public final class CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1 extends Lambda implements Function0<dispatchOnCreate> {
    final /* synthetic */ LifecycleOwner $this_viewModel;
    private static final byte[] $$c = {30, 17, -35, 104};
    private static final int $$f = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, ByteCompanionObject.MAX_VALUE, 49, -115, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 214;
    private static final byte[] $$a = {39, -79, 42, -2, 10, -10};
    private static final int $$b = 139;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] b = {59710, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59739, 59744, 59758, 59746, 59747, 59759, 59744, 59738, 59702, 59730, 59751, 59749, 59744, 59746, 59725, 59790, 59786, 59786, 59786, 59787, 59784, 59763, 59761, 59789, 59787, 59788, 59705, 59746, 59733, 59702, 59738, 59744, 59759, 59747, 59746, 59758, 59744, 59739, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59749, 59744, 59756, 59756, 59756, 59769, 59878, 59876, 59877, 59873, 59868, 59883, 59877, 59697, 59768, 59771, 59754, 59757, 59775, 59745, 59757, 59757, 59751, 59752, 59728, 59751, 59704, 59757, 59751, 59753, 59731, 59746, 59746, 59756, 59746, 59751, 59751, 59744, 59752, 59757, 59775, 59745, 59751};
    final /* synthetic */ mapPoint $qualifier = null;
    final /* synthetic */ Function0 $parameters = null;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1.$$a
            int r6 = r6 * 3
            int r6 = r6 + 111
            int r7 = r7 * 4
            int r1 = 4 - r7
            int r8 = r8 * 3
            int r8 = 2 - r8
            byte[] r1 = new byte[r1]
            int r7 = 3 - r7
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2f:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1.a(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r5 = 55 - r5
            byte[] r0 = com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1.$$d
            int r7 = r7 * 52
            int r1 = r7 + 1
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L14
            r3 = r2
            r2 = r5
            goto L2f
        L14:
            r4 = r6
            r6 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            int r6 = r6 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L29:
            r3 = r0[r6]
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r4
        L2f:
            int r6 = -r6
            int r5 = r5 + r6
            int r5 = r5 + (-11)
            r6 = r2
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1.c(short, short, int, java.lang.Object[]):void");
    }

    private static void d(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = b;
        if (cArr != null) {
            int i8 = $11 + 101;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 + 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getSize(i3), 1270 - KeyEvent.normalizeMetaState(i3), Color.rgb(i3, i3, i3) + 16777234, 407021364, false, $$g(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i10++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i11 = $11 + 11;
            $10 = i11 % 128;
            int i12 = 2;
            int i13 = i11 % 2;
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            int i14 = $11 + 75;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i16 = $10 + 59;
                $11 = i16 % 128;
                if (i16 % i12 != 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 1) {
                    int i17 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            int i18 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte length2 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, i18, iMakeMeasureSpec, 387247676, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i19 = $10 + 7;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), 3224 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, 2133916302, false, $$g(b4, (byte) (b4 | 6), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i21] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41240), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1705, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22, -1434471773, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i12 = 2;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i22 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i22, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i22);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i23 = 0;
            while (true) {
                setvideostabilizationmode.b = i23;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                int i24 = $10 + 65;
                $11 = i24 % 128;
                int i25 = i24 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i23 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.lifecycle.ViewModel, dispatchOnCreate] */
    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ dispatchOnCreate invoke() {
        ZoomGestureDetectorZoomEvent koin;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Reflection.getOrCreateKotlinClass(dispatchOnCreate.class);
            obj.hashCode();
            throw null;
        }
        LifecycleOwner lifecycleOwner = this.$this_viewModel;
        mapPoint mappoint = this.$qualifier;
        Function0 function0 = this.$parameters;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(dispatchOnCreate.class);
        if (lifecycleOwner == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
        }
        ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        if (!(componentCallbacks instanceof getEventTime)) {
            koin = ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
        } else {
            koin = ((getEventTime) componentCallbacks).getKoin();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
        }
        ?? B = isQuickZoomEnabled.b(koin, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return B;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1(LifecycleOwner lifecycleOwner) {
        super(0);
        this.$this_viewModel = lifecycleOwner;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0231 A[PHI: r3
  0x0231: PHI (r3v73 java.lang.Object[]) = (r3v72 java.lang.Object[]), (r3v103 java.lang.Object[]) binds: [B:32:0x022f, B:28:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x023b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0269  */
    /* JADX WARN: Code duplicated, block: B:40:0x0275  */
    /* JADX WARN: Code duplicated, block: B:45:0x0285  */
    /* JADX WARN: Code duplicated, block: B:48:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x0325 A[Catch: all -> 0x05af, TryCatch #0 {all -> 0x05af, blocks: (B:50:0x0310, B:52:0x0325, B:53:0x0362, B:65:0x03e1, B:67:0x03ee, B:68:0x042e, B:70:0x0449, B:71:0x048d), top: B:99:0x0310 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x05a4  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        int i;
        int i2;
        String string;
        Method method;
        Object[] objArr;
        Class<?> cls;
        int i3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        byte b2 = (byte) 0;
        byte b3 = b2;
        Object[] objArr2 = new Object[1];
        a(b2, b3, b3, objArr2);
        Method[] methodArr = {AssetManager.class.getMethod((String) objArr2[0], String.class)};
        int i8 = -2001519171;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int maxKeyCode = 2823 - (KeyEvent.getMaxKeyCode() >> 16);
            int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
            byte[] bArr = $$d;
            byte b4 = bArr[5];
            Object[] objArr3 = new Object[1];
            c(b4, bArr[10], b4, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, maxKeyCode, i9, 1814927978, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i11 = (i10 ^ 7) + ((i10 & 7) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 2823 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 22 - (Process.myPid() >> 22))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i13 = 0;
            while (true) {
                if (i13 < length) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i15 = (i14 ^ 19) + ((i14 & 19) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                    int i16 = i15 % 2;
                    Method method2 = declaredMethods[i13];
                    try {
                        Object[] objArr4 = new Object[1];
                        d(new int[]{0, 24, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr4);
                        Class<?> cls2 = Class.forName((String) objArr4[0]);
                        int[] iArr = {24, 12, 26, 11};
                        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                        int i18 = i17 % 2;
                        Object[] objArr5 = new Object[1];
                        d(iArr, true, new byte[]{0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0}, objArr5);
                        int iIntValue = ((Integer) cls2.getMethod((String) objArr5[0], null).invoke(method2, null)).intValue();
                        Object[] objArr6 = new Object[1];
                        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                        int i20 = i19 % 2;
                        objArr6[0] = Integer.valueOf(iIntValue);
                        int[] iArr2 = {36, 26, 0, 21};
                        byte[] bArr2 = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1};
                        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                        int i22 = i21 % 2;
                        Object[] objArr7 = new Object[1];
                        d(iArr2, true, bArr2, objArr7);
                        Class<?> cls3 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        d(new int[]{62, 8, 128, 0}, true, new byte[]{1, 1, 1, 1, 1, 1, 1, 0}, objArr8);
                        Method method3 = cls3.getMethod((String) objArr8[0], Integer.TYPE);
                        int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i24 = ((i23 | 115) << 1) - (i23 ^ 115);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
                        int i25 = i24 % 2;
                        if (((Boolean) method3.invoke(null, objArr6)).booleanValue()) {
                            Class cls4 = Long.TYPE;
                            Object[] objArr9 = new Object[1];
                            d(new int[]{0, 24, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr9);
                            Class<?> cls5 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            d(new int[]{70, 13, 0, 7}, false, new byte[]{1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1}, objArr10);
                            if (cls4.equals(cls5.getMethod((String) objArr10[0], null).invoke(method2, null))) {
                                int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
                                if (i26 % 2 != 0) {
                                    Object[] objArr11 = new Object[1];
                                    d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr11);
                                    Class<?> cls6 = Class.forName((String) objArr11[0]);
                                    Object[] objArr12 = new Object[1];
                                    d(new int[]{83, 17, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0}, objArr12);
                                    objArr = (Object[]) cls6.getMethod((String) objArr12[0], null).invoke(method2, null);
                                    if (objArr.length != 4) {
                                        continue;
                                    } else if (Long.TYPE.equals(objArr[0])) {
                                        int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i27 % 128;
                                        int i28 = i27 % 2;
                                        Object[] objArr13 = new Object[1];
                                        d(new int[]{0, 24, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr13);
                                        cls = Class.forName((String) objArr13[0]);
                                        int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        i3 = ((i29 | 117) << 1) - (i29 ^ 117);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            if (cls.equals(objArr[1])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cGreen = (char) Color.green(0);
                                                    int i30 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                                                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                                    byte[] bArr3 = $$d;
                                                    byte b5 = bArr3[5];
                                                    Object[] objArr14 = new Object[1];
                                                    c(b5, bArr3[10], b5, objArr14);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, i30, threadPriority, 1814927978, false, (String) objArr14[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cAlpha = (char) Color.alpha(0);
                                                    int iRgb = Color.rgb(0, 0, 0) + 16780039;
                                                    int i31 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                                                    byte[] bArr4 = $$d;
                                                    byte b6 = bArr4[5];
                                                    Object[] objArr15 = new Object[1];
                                                    c(b6, bArr4[10], b6, objArr15);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, iRgb, i31, 1814927978, false, (String) objArr15[0], null);
                                                }
                                                try {
                                                    Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                                        int packedPositionChild = 2822 - ExpandableListView.getPackedPositionChild(0L);
                                                        int iArgb = Color.argb(0, 0, 0, 0) + 22;
                                                        byte b7 = $$d[7];
                                                        byte b8 = b7;
                                                        Object[] objArr17 = new Object[1];
                                                        c(b7, b8, b8, objArr17);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, packedPositionChild, iArgb, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr16)).longValue();
                                                    i8 = -2001519171;
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } else if (cls.equals(objArr[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cGreen2 = (char) Color.green(0);
                                                int i32 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                                                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                                byte[] bArr5 = $$d;
                                                byte b9 = bArr5[5];
                                                Object[] objArr18 = new Object[1];
                                                c(b9, bArr5[10], b9, objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen2, i32, threadPriority2, 1814927978, false, (String) objArr18[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cAlpha2 = (char) Color.alpha(0);
                                                int iRgb2 = Color.rgb(0, 0, 0) + 16780039;
                                                int i33 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                                                byte[] bArr6 = $$d;
                                                byte b10 = bArr6[5];
                                                Object[] objArr19 = new Object[1];
                                                c(b10, bArr6[10], b10, objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha2, iRgb2, i33, 1814927978, false, (String) objArr19[0], null);
                                            }
                                            Object[] objArr110 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                                                int packedPositionChild2 = 2822 - ExpandableListView.getPackedPositionChild(0L);
                                                int iArgb2 = Color.argb(0, 0, 0, 0) + 22;
                                                byte b11 = $$d[7];
                                                byte b12 = b11;
                                                Object[] objArr111 = new Object[1];
                                                c(b11, b12, b12, objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, packedPositionChild2, iArgb2, -2137287382, false, (String) objArr111[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr110)).longValue();
                                            i8 = -2001519171;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    Object[] objArr20 = new Object[1];
                                    d(new int[]{0, 24, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr20);
                                    Class<?> cls7 = Class.forName((String) objArr20[0]);
                                    Object[] objArr21 = new Object[1];
                                    d(new int[]{83, 17, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0}, objArr21);
                                    objArr = (Object[]) cls7.getMethod((String) objArr21[0], null).invoke(method2, null);
                                    if (objArr.length != 2) {
                                        continue;
                                    } else if (Long.TYPE.equals(objArr[0])) {
                                        int i210 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i210 % 128;
                                        int i211 = i210 % 2;
                                        Object[] objArr112 = new Object[1];
                                        d(new int[]{0, 24, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr112);
                                        cls = Class.forName((String) objArr112[0]);
                                        int i212 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        i3 = ((i212 | 117) << 1) - (i212 ^ 117);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            if (cls.equals(objArr[1])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cGreen3 = (char) Color.green(0);
                                                    int i34 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                                                    int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                                    byte[] bArr7 = $$d;
                                                    byte b13 = bArr7[5];
                                                    Object[] objArr113 = new Object[1];
                                                    c(b13, bArr7[10], b13, objArr113);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen3, i34, threadPriority3, 1814927978, false, (String) objArr113[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cAlpha3 = (char) Color.alpha(0);
                                                    int iRgb3 = Color.rgb(0, 0, 0) + 16780039;
                                                    int i35 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                                                    byte[] bArr8 = $$d;
                                                    byte b14 = bArr8[5];
                                                    Object[] objArr114 = new Object[1];
                                                    c(b14, bArr8[10], b14, objArr114);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha3, iRgb3, i35, 1814927978, false, (String) objArr114[0], null);
                                                }
                                                Object[] objArr115 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                                                    int packedPositionChild3 = 2822 - ExpandableListView.getPackedPositionChild(0L);
                                                    int iArgb3 = Color.argb(0, 0, 0, 0) + 22;
                                                    byte b15 = $$d[7];
                                                    byte b16 = b15;
                                                    Object[] objArr116 = new Object[1];
                                                    c(b15, b16, b16, objArr116);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf3, packedPositionChild3, iArgb3, -2137287382, false, (String) objArr116[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr115)).longValue();
                                                i8 = -2001519171;
                                            }
                                        } else if (cls.equals(objArr[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cGreen4 = (char) Color.green(0);
                                                int i36 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                                                int threadPriority4 = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                                byte[] bArr9 = $$d;
                                                byte b17 = bArr9[5];
                                                Object[] objArr117 = new Object[1];
                                                c(b17, bArr9[10], b17, objArr117);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen4, i36, threadPriority4, 1814927978, false, (String) objArr117[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cAlpha4 = (char) Color.alpha(0);
                                                int iRgb4 = Color.rgb(0, 0, 0) + 16780039;
                                                int i37 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                                                byte[] bArr10 = $$d;
                                                byte b18 = bArr10[5];
                                                Object[] objArr118 = new Object[1];
                                                c(b18, bArr10[10], b18, objArr118);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha4, iRgb4, i37, 1814927978, false, (String) objArr118[0], null);
                                            }
                                            Object[] objArr119 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cIndexOf4 = (char) TextUtils.indexOf("", "", 0, 0);
                                                int packedPositionChild4 = 2822 - ExpandableListView.getPackedPositionChild(0L);
                                                int iArgb4 = Color.argb(0, 0, 0, 0) + 22;
                                                byte b19 = $$d[7];
                                                byte b110 = b19;
                                                Object[] objArr1110 = new Object[1];
                                                c(b19, b110, b110, objArr1110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf4, packedPositionChild4, iArgb4, -2137287382, false, (String) objArr1110[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr119)).longValue();
                                            i8 = -2001519171;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        int i38 = i13 - 63;
                        i13 = (i38 ^ 64) + ((i38 & 64) << 1);
                        int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i40 = (i39 & 7) + (i39 | 7);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i40 % 128;
                        int i41 = i40 % 2;
                        i8 = -2001519171;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int iGreen = 2823 - Color.green(0);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
            byte[] bArr11 = $$d;
            byte b20 = bArr11[5];
            Object[] objArr22 = new Object[1];
            c(b20, bArr11[10], b20, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iGreen, iResolveOpacity, 1814927978, false, (String) objArr22[0], null);
        }
        Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int tapTimeout = 2823 - (ViewConfiguration.getTapTimeout() >> 16);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 22;
            byte b21 = $$d[7];
            byte b22 = b21;
            Object[] objArr24 = new Object[1];
            c(b22, (byte) (b22 + 5), b21, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, tapTimeout, iIndexOf, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr23);
        Object[] objArr25 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37658);
            int longPressTimeout = 2720 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int iBlue = 19 - Color.blue(0);
            byte b23 = $$d[7];
            byte b24 = b23;
            Object[] objArr26 = new Object[1];
            c(b24, (byte) (b24 + 5), b23, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, longPressTimeout, iBlue, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr25)).longValue();
        long j = -421811354;
        long j2 = -919;
        long j3 = (j2 * j) + (j2 * jLongValue);
        long j4 = 920;
        long j5 = -1;
        long j6 = j ^ j5;
        long j7 = jLongValue ^ j5;
        long j8 = j6 | j7;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j9 = jElapsedRealtime ^ j5;
        long j10 = j3 + ((((j8 | jElapsedRealtime) ^ j5) | (((j7 | j9) | j) ^ j5)) * j4) + (((j8 ^ j5) | ((j6 | j9) ^ j5)) * j4) + (j4 * (((j8 | j9) ^ j5) | (((j6 | jLongValue) | jElapsedRealtime) ^ j5) | ((jElapsedRealtime | (j7 | j)) ^ j5))) + ((long) (-1388594491));
        int iMyUid = Process.myUid();
        int i42 = ((int) (j10 >> 32)) & ((-818884594) + (((~iMyUid) | 1613388336) * 1324) + (((~(iMyUid | (-181413328))) | (~(1618639738 | iMyUid))) * (-1324)) + 728700252);
        int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i43 % 128;
        int i44 = i43 % 2;
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i45 = ~startElapsedRealtime;
        int i46 = 1471125149 + (((~((-207751815) | i45)) | (~((-1913451825) | startElapsedRealtime))) * 520);
        int i47 = ~(1913451824 | i45);
        int i48 = ~(startElapsedRealtime | 476225414);
        int i49 = i42 | (((int) j10) & (i46 + ((i47 | i48) * (-1040)) + ((i48 | (~(i45 | (-476225415))) | (-2121203639)) * 520)));
        int i50 = i49 >>> 24;
        int i51 = i49 & ViewCompat.MEASURED_SIZE_MASK;
        if (i50 != 0) {
            int i52 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i52 % 128;
            int i53 = i52 % 2;
            i = 1;
        } else {
            i = 0;
        }
        if ((i ^ 1) != 0) {
            i2 = 1;
        } else {
            int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            i2 = 1;
            int i55 = ((i54 | 105) << 1) - (i54 ^ 105);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i55 % 128;
            int i56 = i55 % 2;
            i7 = 1;
        }
        if ((i ^ i2) != i2) {
            int i57 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i58 = i57 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i58 % 128;
            int i59 = i58 % 2;
            if (i51 >= i2 || (method = methodArr[i51]) == null) {
                string = null;
            } else {
                int i60 = ((i57 | 11) << i2) - (i57 ^ 11);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i60 % 128;
                if (i60 % 2 == 0) {
                    method.toString();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                string = method.toString();
            }
        } else {
            string = null;
        }
        list.add(string);
        return (i50 + 6) * i7;
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
    private static java.lang.String $$g(byte r5, byte r6, short r7) {
        /*
            byte[] r0 = com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1.$$c
            int r5 = r5 * 4
            int r5 = 1 - r5
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = 105 - r6
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1.$$g(byte, byte, short):java.lang.String");
    }
}
