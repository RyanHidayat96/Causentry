package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.ExifDataBuilder2;
import defpackage.ExifTag;
import defpackage.ResolutionSelectorUtil;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.denormalize;
import defpackage.getDenominator;
import defpackage.initSession;
import defpackage.onCaptureSessionStart;
import defpackage.requestByteToBuffer;
import defpackage.setExposureTimeNanos;
import defpackage.setFocalLength;
import defpackage.setOrientationDegrees;
import defpackage.setRotate;
import defpackage.writeExifSegment;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public class MapFragment extends Fragment {
    private final zzaf zza = new zzaf(this);
    private static final byte[] $$c = {87, -91, 60, 112};
    private static final int $$f = 157;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {14, 116, 92, -78, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -64, 1, 5, -18, 15, -19, 7, 2, -16, 67, -68, 2, 9, -4, -4, -16, 67, -61, -7, -8, 13, -15, 2, 11, -13, 60, -78, -2, 18, -22, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, 16, -9, -7, 8, -7, -7, 5, 28, -39, 6, -8, 9, -21, 13, -15, 63, 12, -17, 46, -39, -15, 11, 3, -3, -15, 32, -19, -5, -2, -7, -7, 5, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 65, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -64, 1, 5, -18, 15, -19, 7, 2, -16, 67, -68, 2, 9, -4, -4, -16, 67, -53, -17, 5, 57, -65, -4, 9, -3, -9, 60, -25, -43, 9, -14, 9, -3, -1, 18, -33, 1, -15, 11, 1, -7, 7, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 64, -13, 15, -15, -8, 29, -31, 7, 23, -23, -15, 3, 2, -12, -2, 8, -8, -1, 24, -29, 29, -36, 1, -9, 11, 3, -3, -15, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -59, -8, -8, 67, -53, -22, -1, 10, 56, -53, -17, 5, 57, -61, 3, -3, -11, -8, 9, -13, -7, 73, -22, -37, -4, -4, -7, 25, -24, 0, -9, 35, -39, 26, -21, -14, -6, 14, -16, -3, 78, -46, -19, -20, -2, 6, 4, -22, 45, -43, 2, -1, 26, -21, -14, -6, 14, -16, -3, 35, -35, -6, 9, -8, -1, -7, 77, -32, -53, 10, -5, 6, -3, -15, 12, -17, 34, -36, 11, -19, 11, 2, -20, 35, -21, -16, 2, 1, -11, -1, 9, -8, -1, 25, -20, -9, 5, 0, -19, 3, -5, -53, 13, -2, -1, -15, 11, -1, 33, -54, 15, -7, -8, 26, -35, 0, 11, 2, -14};
    private static final int $$e = 142;
    private static final byte[] $$a = {6, 51, 46, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 57;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] b = {60061, 59748, 60054, 59746, 60107, 59751, 60056, 60105, 60047, 60079, 60072, 60034, 60063, 59749, 60108, 60043, 60088, 59752, 60109, 60045, 59753, 59747, 60058, 60053, 60083, 60052, 60073, 60106, 60055, 60110, 60090, 60104, 60060, 60051, 60111, 60040, 59750, 60041, 60062, 60117, 60046, 60048, 60098, 59744, 60050, 60057, 59745, 60049, 60099};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57190;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.maps.MapFragment.$$a
            int r8 = 214 - r8
            int r1 = 53 - r7
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            int r6 = r6 + 66
            byte[] r1 = com.google.android.gms.maps.MapFragment.$$d
            int r7 = 415 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r3 = r7
            r7 = r8
            r4 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L1f:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L28:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-2)
            int r7 = r3 + 1
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.d(int, int, byte, java.lang.Object[]):void");
    }

    public static MapFragment newInstance() {
        int i = 2 % 2;
        MapFragment mapFragment = new MapFragment();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return mapFragment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttach(activity);
            zzaf.zza(this.zza, activity);
        } else {
            super.onAttach(activity);
            zzaf.zza(this.zza, activity);
            throw null;
        }
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        Preconditions.checkNotNull(onMapReadyCallback, "callback must not be null.");
        this.zza.zzb(onMapReadyCallback);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        int i = 2 % 2;
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            bundle.setClassLoader(classLoader);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
        super.onActivityCreated(bundle);
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i5 = 1770390596;
        Object obj2 = null;
        int i6 = 3;
        if (cArr2 != null) {
            int i7 = $10 + 69;
            int i8 = i7 % 128;
            $11 = i8;
            int i9 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = i8 + 101;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (i12 < length) {
                int i13 = $11 + 23;
                $10 = i13 % 128;
                int i14 = i13 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) i6;
                        byte b4 = (byte) (b3 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2267 - KeyEvent.getDeadChar(0, 0), TextUtils.getTrimmedLength("") + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i12++;
                    i3 = 2;
                    i5 = 1770390596;
                    i6 = 3;
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
            byte b5 = (byte) 3;
            byte b6 = (byte) (b5 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 2267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 33 - View.combineMeasuredStates(0, 0), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
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
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 2;
                        byte b8 = (byte) (b7 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 3261, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31, -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22877), TextUtils.getTrimmedLength("") + 594, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i16 = $10 + 49;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                        } else {
                            int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0296  */
    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        String str;
        String str2;
        Object[] objArr3;
        Object[] objArr4;
        int i2;
        Object[] objArr5;
        String str3;
        Object[] objArr6;
        char c;
        Object[] objArr7;
        Object[] objArr8;
        char c2;
        char c3;
        Object[] objArr9;
        int i3;
        String str4;
        Object[] objArr10;
        char c4;
        Object[] objArr11;
        char c5;
        int i4;
        Object[] objArr12;
        Object[] objArr13;
        char c6;
        int i5;
        Object[] objArr14;
        int i6;
        Object[] objArr15;
        char c7;
        int i7;
        String str5;
        Object[] objArr16;
        Object[] objArr17;
        char c8;
        char c9;
        Object[] objArr18;
        int i8 = 2 % 2;
        int i9 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
        int i10 = i9 % 2;
        Object[] objArr19 = new Object[1];
        a(new char[]{23, 24, '\t', '(', 23, '.', 11, '(', 21, '\'', Typography.amp, 11, 7, '\'', '\n', Typography.dollar, '\t', 23, ' ', 21, '\r', '0'}, (byte) ('5' - AndroidCharacter.getMirror('0')), 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr19);
        String str6 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(new char[]{'#', 31, 29, 22, Typography.dollar, '\'', 19, '!', Typography.dollar, 24, 29, 7, 2, '\t', 13943}, (byte) (119 - TextUtils.lastIndexOf("", '0', 0)), 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr20);
        String str7 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        a(new char[]{'+', 26, 15, 26, '#', ' ', 23, 24, '\'', '.', 11, '\f', Typography.dollar, 7, '%', 3}, (byte) (View.combineMeasuredStates(0, 0) + 90), 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr21);
        String str8 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        a(new char[]{'/', '\t', '%', 24, '\t', '+', '\t', '\f', 25, 23, '(', 28, 18, 23, '\n', '('}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11), ExpandableListView.getPackedPositionGroup(0L) + 16, objArr22);
        String str9 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        a(new char[]{23, 24, '\t', '(', 23, '.', 11, '(', 29, 22, 18, Typography.dollar, Typography.quote, 2, '\t', '+', 16, '/', '\t', '\f', '\f', 30, Typography.amp, '\'', 26, '\b'}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 75), 25 - TextUtils.lastIndexOf("", '0', 0, 0), objArr23);
        String str10 = (String) objArr23[0];
        Object[] objArr24 = new Object[1];
        a(new char[]{5, ')', 13812, 13812, '%', 24, '\t', 29, 13814, 13814, 30, '*', 1, 27, '\t', '+', 26, 24}, (byte) (12 - ExpandableListView.getPackedPositionGroup(0L)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, objArr24);
        String str11 = (String) objArr24[0];
        int i11 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i12 = ~iIdentityHashCode;
        if (i11 != 1641404648 + (((~(1767341039 | iIdentityHashCode)) | (~((-937353497) | i12))) * 217) + (((~((-937353497) | iIdentityHashCode)) | 378044432) * 217) + (((~(1767341039 | i12)) | 937353496) * 217)) {
            throw new RuntimeException("-1978742317");
        }
        int i13 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i13 != (-1130818908) + (((~((-574197761) | iIdentityHashCode2)) | (~((~iIdentityHashCode2) | 2004858204))) * (-318)) + (((~(842903872 | iIdentityHashCode2)) | 1161954332) * (-318)) + (((~(iIdentityHashCode2 | (-842903873))) | (-1736152093)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            int[] iArr = new int[1172001897];
            iArr[1172001896] = 1;
            int i14 = (-610287960) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c10 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
            int iResolveSize = 921 - View.resolveSize(0, 0);
            int size = View.MeasureSpec.getSize(0) + 28;
            Object[] objArr25 = new Object[1];
            c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c10, iResolveSize, size, -1048449946, false, (String) objArr25[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                int absoluteGravity = 921 - Gravity.getAbsoluteGravity(0, 0);
                int iGreen = Color.green(0) + 28;
                byte b2 = $$a[91];
                Object[] objArr26 = new Object[1];
                c(b2, (byte) (b2 - 4), (short) 210, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, absoluteGravity, iGreen, -1142834547, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr27[1])[0]}, (Object[]) objArr27[2], new int[]{((int[]) objArr27[3])[0]}, (String[]) objArr27[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i15 = (-1885892439) + (((~(1312000871 | iIdentityHashCode3)) | 294141968) * (-140)) + ((~(1606142839 | iIdentityHashCode3)) * 70) + (((~(iIdentityHashCode3 | 462078772)) | 1438206035) * 70) + 12737447;
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
            str9 = str9;
        } else {
            Context applicationContext = (Context) Class.forName(str10).getMethod(str11, new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                    TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                    int i19 = i18 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            try {
                Object[] objArr28 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, 12737447};
                byte[] bArr = $$d;
                Object[] objArr29 = new Object[1];
                d(bArr[422], (short) 411, (byte) 48, objArr29);
                Class<?> cls = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                d(bArr[50], (short) 363, (byte) (-bArr[337]), objArr30);
                Object[] objArr31 = (Object[]) cls.getMethod((String) objArr30[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr28);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0'));
                    int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b3 = $$a[91];
                    Object[] objArr32 = new Object[1];
                    c(b3, (byte) (b3 - 4), (short) 210, objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, maximumFlingVelocity, keyRepeatTimeout, -1142834547, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr31);
                try {
                    long jLongValue = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 31534);
                        int iBlue = Color.blue(0) + 921;
                        int keyRepeatTimeout2 = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte[] bArr2 = $$a;
                        byte b4 = bArr2[91];
                        byte b5 = bArr2[7];
                        Object[] objArr33 = new Object[1];
                        c(b4, b5, (short) (b5 | 173), objArr33);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, iBlue, keyRepeatTimeout2, -778300370, false, (String) objArr33[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c11 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                        int i20 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int keyRepeatTimeout3 = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        Object[] objArr34 = new Object[1];
                        c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr34);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c11, i20, keyRepeatTimeout3, -1048449946, false, (String) objArr34[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    objArr = objArr31;
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
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[3])[0];
        if (i22 == i21) {
            int i23 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i24 = ~System.identityHashCode(this);
            int i25 = i23 + 1567857587 + (((-336594515) | i24) * 184) + (((~(i24 | 736622629)) | (-372354644)) * 184);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            i = 0;
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str12 : strArr) {
                    arrayList.add(str12);
                }
            }
            Toast.makeText((Context) null, i22 / (((i22 - 1) * i22) % 2), 0).show();
            int i28 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i29 = i28 + (-1873473365) + (((~((-197) | (~iIdentityHashCode4))) | (~(1774079447 | iIdentityHashCode4))) * (-272)) + (((~((-161875159) | iIdentityHashCode4)) | 161874962) * (-272)) + (((~(iIdentityHashCode4 | 161875158)) | 1612204485) * 272);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            i = 0;
            ((int[]) objArr2[0])[0] = i31 ^ (i31 << 5);
        }
        ((Field) ResolutionSelectorUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1650090179, 1103134081, 309366661}, ((int[]) objArr2[i])[i], Integer.MAX_VALUE) - (-409526805));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cBlue = (char) Color.blue(i);
            int i32 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int iIndexOf = 10 - TextUtils.indexOf("", "");
            byte b6 = $$a[91];
            Object[] objArr35 = new Object[1];
            c(b6, (byte) (b6 - 4), (short) 210, objArr35);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, i32, iIndexOf, -1650998592, false, (String) objArr35[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 876;
            int i33 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
            byte[] bArr3 = $$a;
            byte b7 = bArr3[91];
            byte b8 = bArr3[7];
            Object[] objArr36 = new Object[1];
            c(b7, b8, (short) (b8 | 173), objArr36);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, packedPositionType2, i33, 2012020043, false, (String) objArr36[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char keyRepeatTimeout4 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr4 = $$a;
                byte b9 = bArr4[91];
                byte b10 = bArr4[7];
                Object[] objArr37 = new Object[1];
                c(b9, b10, (short) (b10 | 121), objArr37);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout4, fadingEdgeLength, scrollBarFadeDuration, 2012931276, false, (String) objArr37[0], null);
            }
            Object[] objArr38 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr38[0])[0]}, new int[1], new int[]{((int[]) objArr38[2])[0]}, (String[]) objArr38[3]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i34 = (-818784224) + (((-107550270) | iIdentityHashCode5) * 614);
            int i35 = ~iIdentityHashCode5;
            int i36 = i34 + (((~((-1030241804) | i35)) | 956311554 | (~((-989931575) | i35))) * (-1228)) + (((~(i35 | (-33620021))) | (~((-73930250) | i35))) * 614) + 841044769;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr3[1])[0] = i38 ^ (i38 << 5);
            str11 = str11;
            str2 = str7;
            str = str9;
        } else {
            Context applicationContext2 = (Context) Class.forName(str10).getMethod(str11, new Class[0]).invoke(null, null);
            if (applicationContext2 != null) {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : applicationContext2.getApplicationContext();
            }
            str = str9;
            Object[] objArr39 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, 841044769};
            byte[] bArr5 = $$d;
            Object[] objArr40 = new Object[1];
            d((byte) 49, (short) 326, bArr5[73], objArr40);
            Class<?> cls2 = Class.forName((String) objArr40[0]);
            byte b11 = bArr5[50];
            Object[] objArr41 = new Object[1];
            d(b11, (short) (b11 | 292), bArr5[21], objArr41);
            Object[] objArr42 = (Object[]) cls2.getMethod((String) objArr41[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr39);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iBlue2 = 876 - Color.blue(0);
                    int iAxisFromString = 9 - MotionEvent.axisFromString("");
                    byte[] bArr6 = $$a;
                    byte b12 = bArr6[91];
                    byte b13 = bArr6[7];
                    Object[] objArr43 = new Object[1];
                    c(b12, b13, (short) (b13 | 121), objArr43);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(keyRepeatDelay, iBlue2, iAxisFromString, 2012931276, false, (String) objArr43[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr42);
                try {
                    str2 = str7;
                    long jLongValue3 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char c12 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iIndexOf2 = 10 - TextUtils.indexOf("", "", 0, 0);
                        byte[] bArr7 = $$a;
                        byte b14 = bArr7[91];
                        byte b15 = bArr7[7];
                        Object[] objArr44 = new Object[1];
                        c(b14, b15, (short) (b15 | 173), objArr44);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c12, longPressTimeout, iIndexOf2, 2012020043, false, (String) objArr44[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int size2 = View.MeasureSpec.getSize(0) + 876;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                        byte b16 = $$a[91];
                        Object[] objArr45 = new Object[1];
                        c(b16, (byte) (b16 - 4), (short) 210, objArr45);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(touchSlop, size2, windowTouchSlop, -1650998592, false, (String) objArr45[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                str11 = str11;
                objArr42 = objArr42;
                str2 = str7;
            }
            objArr3 = objArr42;
        }
        int i39 = ((int[]) objArr3[2])[0];
        int i40 = ((int[]) objArr3[0])[0];
        if (i40 == i39) {
            int i41 = ((int[]) objArr3[1])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i42 = i41 + ((~(startUptimeMillis | (-669928441))) * TypedValues.CycleType.TYPE_EASING) + 1129966272 + (((~((~startUptimeMillis) | (-669928441))) | 135340037) * TypedValues.CycleType.TYPE_EASING);
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            i2 = 0;
            ((int[]) objArr4[1])[0] = i44 ^ (i44 << 5);
        } else {
            int[] iArr2 = new int[i40];
            int i45 = i40 - 1;
            iArr2[i45] = 1;
            Toast.makeText((Context) null, iArr2[((i40 * i45) % 2) - 1], 1).show();
            int i46 = ((int[]) objArr3[1])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i47 = ~iIdentityHashCode6;
            int i48 = 1694077810 + (((~((-640654113) | i47)) | 537301024) * (-1188));
            int i49 = (~(iIdentityHashCode6 | 640654112)) | 537301024;
            int i50 = ~(680964341 | i47);
            int i51 = i46 + i48 + ((i49 | i50) * 594) + (((~(640654112 | i47)) | (-784317430) | i50) * 594);
            int i52 = (i51 << 13) ^ i51;
            int i53 = i52 ^ (i52 >>> 17);
            i2 = 0;
            ((int[]) objArr4[1])[0] = i53 ^ (i53 << 5);
        }
        ((Field) setRotate.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{721518075, 863504107, 211918317}, ((int[]) objArr4[1])[i2], Integer.MAX_VALUE));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2) + 876;
            int i54 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            Object[] objArr46 = new Object[1];
            c($$a[i2], (byte) 42, (short) 69, objArr46);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionChild, iMakeMeasureSpec, i54, -1199417970, false, (String) objArr46[i2], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int trimmedLength = TextUtils.getTrimmedLength("") + 876;
            int iIndexOf3 = 9 - TextUtils.indexOf((CharSequence) "", '0');
            byte b17 = $$a[14];
            int i55 = $$b;
            Object[] objArr47 = new Object[1];
            c(b17, (byte) (i55 - 5), (short) (i55 + 2), objArr47);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(threadPriority, trimmedLength, iIndexOf3, 254769921, false, (String) objArr47[0], null);
        }
        if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int i56 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iIndexOf4 = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr8 = $$a;
                Object[] objArr48 = new Object[1];
                c(bArr8[0], bArr8[81], (short) ($$b + 2), objArr48);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(threadPriority2, i56, iIndexOf4, 1324201839, false, (String) objArr48[0], null);
            }
            Object[] objArr49 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            objArr5 = new Object[]{new int[]{((int[]) objArr49[0])[0]}, new int[1], new int[]{((int[]) objArr49[2])[0]}, (String[]) objArr49[3]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i57 = ~iIdentityHashCode7;
            int i58 = ((((-219778240) + (((~(784868071 | i57)) | 825178300) * 226)) + (((~(i57 | 1072642815)) | ((~((-825178301) | iIdentityHashCode7)) | 537403556)) * (-113))) + ((~(iIdentityHashCode7 | 784868071)) * 113)) - 984601047;
            int i59 = (i58 << 13) ^ i58;
            int i60 = i59 ^ (i59 >>> 17);
            ((int[]) objArr5[1])[0] = i60 ^ (i60 << 5);
        } else {
            Object[] objArr50 = {Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), -984601047};
            byte[] bArr9 = $$d;
            Object[] objArr51 = new Object[1];
            d(bArr9[422], (short) 258, bArr9[47], objArr51);
            Class<?> cls3 = Class.forName((String) objArr51[0]);
            Object[] objArr52 = new Object[1];
            d(bArr9[50], (short) 198, bArr9[21], objArr52);
            objArr5 = (Object[]) cls3.getMethod((String) objArr52[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr50);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int scrollBarSize = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iIndexOf5 = 9 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte[] bArr10 = $$a;
                Object[] objArr53 = new Object[1];
                c(bArr10[0], bArr10[81], (short) ($$b + 2), objArr53);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(mode, scrollBarSize, iIndexOf5, 1324201839, false, (String) objArr53[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr5);
            try {
                long jLongValue5 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                    int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                    byte b18 = $$a[14];
                    int i61 = $$b;
                    Object[] objArr54 = new Object[1];
                    c(b18, (byte) (i61 - 5), (short) (i61 + 2), objArr54);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf, edgeSlop, deadChar, 254769921, false, (String) objArr54[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char c13 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i62 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 875;
                    int scrollBarSize2 = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
                    Object[] objArr55 = new Object[1];
                    c($$a[0], (byte) 42, (short) 69, objArr55);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c13, i62, scrollBarSize2, -1199417970, false, (String) objArr55[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i63 = ((int[]) objArr5[2])[0];
        int i64 = ((int[]) objArr5[0])[0];
        if (i64 != i63) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr2 = (String[]) objArr5[3];
            if (strArr2 != null) {
                int i65 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                TuitionPaymentFragmentbindingInflater1 = i65 % 128;
                int i66 = i65 % 2;
                for (String str13 : strArr2) {
                    int i67 = TuitionPaymentFragmentbindingInflater1 + 93;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i67 % 128;
                    int i68 = i67 % 2;
                    arrayList2.add(str13);
                }
            }
            throw new RuntimeException(String.valueOf(i64));
        }
        int i69 = ((int[]) objArr5[1])[0];
        Object[] objArr56 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
        int i70 = ~(System.identityHashCode(this) | 623791380);
        int i71 = i69 + (((-132741676) | i70) * (-658)) + 1373643580 + ((i70 | (-670007104)) * 658);
        int i72 = (i71 << 13) ^ i71;
        int i73 = i72 ^ (i72 >>> 17);
        Object obj = objArr56[1];
        ((int[]) obj)[0] = i73 ^ (i73 << 5);
        ((Field) denormalize.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{245525652, 419638905, 1038286528}, ((int[]) obj)[0], Integer.MAX_VALUE) + 1973354780);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char c14 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int i74 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
            int size3 = 10 - View.MeasureSpec.getSize(0);
            Object[] objArr57 = new Object[1];
            c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr57);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c14, i74, size3, 252381699, false, (String) objArr57[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int maximumFlingVelocity2 = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int packedPositionChild2 = 9 - ExpandableListView.getPackedPositionChild(0L);
            byte[] bArr11 = $$a;
            byte b19 = bArr11[91];
            byte b20 = bArr11[7];
            Object[] objArr58 = new Object[1];
            c(b19, b20, (short) (b20 | 52), objArr58);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cNormalizeMetaState, maximumFlingVelocity2, packedPositionChild2, 2009631821, false, (String) objArr58[0], null);
        }
        if (j3 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) << 52) >>> 52)) >> 12)) {
            int i75 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            TuitionPaymentFragmentbindingInflater1 = i75 % 128;
            int i76 = i75 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                byte b21 = $$a[7];
                byte b22 = b21;
                Object[] objArr59 = new Object[1];
                c(b22, (byte) (b22 | 52), b21, objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cMyTid, scrollBarSize3, maximumFlingVelocity3, 256017550, false, (String) objArr59[0], null);
            }
            Object[] objArr60 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
            Object[] objArr61 = {new int[]{((int[]) objArr60[0])[0]}, new int[1], new int[]{((int[]) objArr60[2])[0]}, (String[]) objArr60[3]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i77 = ~iIdentityHashCode8;
            int i78 = 644038970 + ((iIdentityHashCode8 | 900499827) * (-859)) + (((~(iIdentityHashCode8 | (-78153826))) | (~(900499827 | i77))) * 859) + (((~(860189598 | i77)) | (-938343424)) * 859) + 1205834699;
            int i79 = (i78 << 13) ^ i78;
            int i80 = i79 ^ (i79 >>> 17);
            ((int[]) objArr61[1])[0] = i80 ^ (i80 << 5);
            c = 2;
            String str14 = str11;
            objArr6 = objArr61;
            str3 = str14;
        } else {
            str3 = str11;
            Context applicationContext3 = (Context) Class.forName(str10).getMethod(str3, new Class[0]).invoke(null, null);
            if (applicationContext3 != null) {
                applicationContext3 = ((applicationContext3 instanceof ContextWrapper) && ((ContextWrapper) applicationContext3).getBaseContext() == null) ? null : applicationContext3.getApplicationContext();
            }
            Object[] objArr62 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), 1205834699};
            byte[] bArr12 = $$d;
            Object[] objArr63 = new Object[1];
            d((byte) (-bArr12[337]), (short) ($$e + 4), (byte) (bArr12[58] - 1), objArr63);
            Class<?> cls4 = Class.forName((String) objArr63[0]);
            byte b23 = bArr12[98];
            Object[] objArr64 = new Object[1];
            d(b23, (short) (b23 | 87), bArr12[5], objArr64);
            objArr6 = (Object[]) cls4.getMethod((String) objArr64[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr62);
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
                    byte b24 = $$a[7];
                    byte b25 = b24;
                    Object[] objArr65 = new Object[1];
                    c(b25, (byte) (b25 | 52), b24, objArr65);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(capsMode, iLastIndexOf, fadingEdgeLength2, 256017550, false, (String) objArr65[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, objArr6);
                try {
                    long jLongValue7 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char c15 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iGreen2 = Color.green(0) + 876;
                        int i81 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                        byte[] bArr13 = $$a;
                        byte b26 = bArr13[91];
                        byte b27 = bArr13[7];
                        Object[] objArr66 = new Object[1];
                        c(b26, b27, (short) (b27 | 52), objArr66);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c15, iGreen2, i81, 2009631821, false, (String) objArr66[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                        int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                        Object[] objArr67 = new Object[1];
                        c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr67);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(maximumDrawingCacheSize, iRgb, keyRepeatDelay2, 252381699, false, (String) objArr67[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } else {
                objArr6 = objArr6;
            }
            c = 2;
        }
        if (((int[]) objArr6[0])[0] != ((int[]) objArr6[c])[0]) {
            throw null;
        }
        int i82 = ((int[]) objArr6[1])[0];
        Object[] objArr68 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i83 = i82 + (-1687058546) + ((~((-5009541) | startElapsedRealtime)) * (-301)) + (((~(810315940 | startElapsedRealtime)) | (~((~startElapsedRealtime) | 850626169))) * (-301)) + (((~(startElapsedRealtime | (-850626170))) | 810315940) * 301);
        int i84 = (i83 << 13) ^ i83;
        int i85 = i84 ^ (i84 >>> 17);
        Object obj2 = objArr68[1];
        ((int[]) obj2)[0] = i85 ^ (i85 << 5);
        ((Field) getDenominator.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1655478649, 753119141, 121300687}, ((int[]) obj2)[0], Integer.MAX_VALUE) - (-865114279));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
            char c16 = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int trimmedLength2 = TextUtils.getTrimmedLength("") + 1755;
            int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 23;
            byte b28 = $$a[91];
            Object[] objArr69 = new Object[1];
            c(b28, (byte) (b28 - 4), (short) 210, objArr69);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c16, trimmedLength2, capsMode2, 986134021, false, (String) objArr69[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 24;
                byte[] bArr14 = $$a;
                byte b29 = bArr14[91];
                byte b30 = bArr14[7];
                Object[] objArr70 = new Object[1];
                c(b29, b30, (short) (b30 | 173), objArr70);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cMyPid, iResolveOpacity, packedPositionChild3, 1599039318, false, (String) objArr70[0], null);
            }
            Object[] objArr71 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr71[0])[0]}, new int[]{((int[]) objArr71[1])[0]}, (Object[]) objArr71[2], new int[1], (String[]) objArr71[4]};
            int i86 = ~(Process.myTid() | (-616209413));
            int i87 = (((-905887295) | i86) * (-196)) + 2105029013 + ((i86 | 289677882) * 196) + 1753505257;
            int i88 = (i87 << 13) ^ i87;
            int i89 = i88 ^ (i88 >>> 17);
            ((int[]) objArr7[3])[0] = i89 ^ (i89 << 5);
        } else {
            int iIntValue = ((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr72 = {1783317275};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b((char) (42048 - TextUtils.indexOf((CharSequence) "", '0')), 1774 - AndroidCharacter.getMirror('0'), 29 - (Process.myPid() >> 22), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).newInstance(objArr72), 1753505257);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char cNormalizeMetaState2 = (char) (29944 - KeyEvent.normalizeMetaState(0));
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 1756;
                    int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 23;
                    byte[] bArr15 = $$a;
                    byte b31 = bArr15[91];
                    byte b32 = bArr15[7];
                    Object[] objArr73 = new Object[1];
                    c(b31, b32, (short) (b32 | 173), objArr73);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cNormalizeMetaState2, iLastIndexOf2, iResolveOpacity2, 1599039318, false, (String) objArr73[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, objArrB$5f1425da);
                try {
                    long jLongValue8 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char maximumFlingVelocity4 = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                        int gidForName = 22 - Process.getGidForName("");
                        byte[] bArr16 = $$a;
                        byte b33 = bArr16[91];
                        byte b34 = bArr16[7];
                        Object[] objArr74 = new Object[1];
                        c(b33, b34, (short) (b34 | 52), objArr74);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(maximumFlingVelocity4, iCombineMeasuredStates, gidForName, 1596667560, false, (String) objArr74[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char c17 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                        int iAlpha = Color.alpha(0) + 1755;
                        int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                        byte b35 = $$a[91];
                        Object[] objArr75 = new Object[1];
                        c(b35, (byte) (b35 - 4), (short) 210, objArr75);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c17, iAlpha, maximumDrawingCacheSize2, 986134021, false, (String) objArr75[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf10);
                    objArr7 = objArrB$5f1425da;
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i90 = ((int[]) objArr7[1])[0];
        int i91 = ((int[]) objArr7[0])[0];
        if (i91 == i90) {
            int i92 = ((int[]) objArr7[3])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i93 = 1662354279 + (((~((-286694245) | iIdentityHashCode9)) | 166176 | (~((-74091819) | iIdentityHashCode9))) * (-754));
            int i94 = ~((-166177) | iIdentityHashCode9);
            int i95 = ~iIdentityHashCode9;
            int i96 = i92 + i93 + ((i94 | (~((-73925643) | i95))) * (-754)) + ((i95 | (-286694245)) * 754);
            int i97 = (i96 << 13) ^ i96;
            int i98 = i97 ^ (i97 >>> 17);
            ((int[]) objArr8[3])[0] = i98 ^ (i98 << 5);
            c2 = 3;
            c3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr3 = (String[]) objArr7[4];
            if (strArr3 != null) {
                int i99 = TuitionPaymentFragmentbindingInflater1 + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i99 % 128;
                for (int i100 = i99 % 2 == 0 ? 1 : 0; i100 < strArr3.length; i100++) {
                    arrayList3.add(strArr3[i100]);
                }
            }
            int[] iArr3 = new int[i91];
            int i101 = i91 - 1;
            iArr3[i101] = 1;
            Toast.makeText((Context) null, iArr3[((i91 * i101) % 2) - 1], 1).show();
            int i102 = ((int[]) objArr7[3])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i103 = i102 + (-1144866607) + (((~(104711430 | iFreeMemory)) | 281023040) * 336) + (((~(iFreeMemory | 317313856)) | 68420614) * (-168)) + (((~((~iFreeMemory) | 317313856)) | 104711430) * 168);
            int i104 = (i103 << 13) ^ i103;
            int i105 = i104 ^ (i104 >>> 17);
            c2 = 3;
            c3 = 0;
            ((int[]) objArr8[3])[0] = i105 ^ (i105 << 5);
        }
        ((Field) ExifTag.b[c3]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{2122124175, 778267545, 1695076393}, ((int[]) objArr8[c2])[c3], Integer.MAX_VALUE) + 1738398360);
        super.onCreate(bundle);
        zzaf zzafVar = this.zza;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
            char c18 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43041);
            int iIndexOf6 = 3111 - TextUtils.indexOf("", "", 0);
            int i106 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
            byte[] bArr17 = $$a;
            byte b36 = bArr17[91];
            byte b37 = bArr17[7];
            Object[] objArr76 = new Object[1];
            c(b36, b37, (short) (b37 | 121), objArr76);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(c18, iIndexOf6, i106, -1272852037, false, (String) objArr76[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char cArgb = (char) (43042 - Color.argb(0, 0, 0, 0));
                int i107 = 3111 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iResolveOpacity3 = 22 - Drawable.resolveOpacity(0, 0);
                byte b38 = $$a[91];
                Object[] objArr77 = new Object[1];
                c(b38, (byte) (b38 - 4), (short) 210, objArr77);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cArgb, i107, iResolveOpacity3, 154975793, false, (String) objArr77[0], null);
            }
            Object[] objArr78 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).get(null);
            int i108 = ((int[]) objArr78[2])[0];
            int i109 = ((int[]) objArr78[1])[0];
            String[] strArr4 = (String[]) objArr78[3];
            int i110 = ~(System.identityHashCode(this) | 556663675);
            int i111 = ((1700573404 | i110) * (-658)) + 1450809682 + ((i110 | 1146138756) * 658) + 1298455634;
            int i112 = (i111 << 13) ^ i111;
            int i113 = i112 ^ (i112 >>> 17);
            ((int[]) objArr9[0])[0] = i113 ^ (i113 << 5);
            objArr9 = new Object[]{new int[1], new int[]{i109}, new int[]{i108}, strArr4};
            zzafVar = zzafVar;
            i3 = 1;
        } else {
            Object[] objArr79 = {null, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, 1298455634};
            byte[] bArr18 = $$d;
            byte b39 = bArr18[422];
            Object[] objArr80 = new Object[1];
            d(b39, (short) (b39 | 86), bArr18[2], objArr80);
            Class<?> cls5 = Class.forName((String) objArr80[0]);
            byte b40 = bArr18[98];
            Object[] objArr81 = new Object[1];
            d(b40, (short) (b40 | 87), bArr18[5], objArr81);
            Object[] objArr82 = (Object[]) cls5.getMethod((String) objArr81[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr79);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char cBlue2 = (char) (43042 - Color.blue(0));
                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 3111;
                int iIndexOf7 = TextUtils.indexOf("", "", 0) + 22;
                byte b41 = $$a[91];
                Object[] objArr83 = new Object[1];
                c(b41, (byte) (b41 - 4), (short) 210, objArr83);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cBlue2, touchSlop2, iIndexOf7, 154975793, false, (String) objArr83[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, objArr82);
            try {
                long jLongValue9 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                    char c19 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43043);
                    int size4 = 3111 - View.MeasureSpec.getSize(0);
                    int i114 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
                    byte[] bArr19 = $$a;
                    byte b42 = bArr19[91];
                    byte b43 = bArr19[7];
                    Object[] objArr84 = new Object[1];
                    c(b42, b43, (short) (b43 | 173), objArr84);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c19, size4, i114, -1269618118, false, (String) objArr84[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char c20 = (char) (43042 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int iIndexOf8 = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                    byte[] bArr20 = $$a;
                    byte b44 = bArr20[91];
                    byte b45 = bArr20[7];
                    Object[] objArr85 = new Object[1];
                    c(b44, b45, (short) (b45 | 121), objArr85);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c20, iIndexOf8, longPressTimeout2, -1272852037, false, (String) objArr85[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf12);
                objArr9 = objArr82;
                i3 = 1;
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i115 = ((int[]) objArr9[i3])[0];
        int i116 = ((int[]) objArr9[2])[0];
        if (i116 != i115) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr5 = (String[]) objArr9[3];
            if (strArr5 != null) {
                for (String str15 : strArr5) {
                    arrayList4.add(str15);
                }
            }
            throw new RuntimeException(String.valueOf(i116));
        }
        Object[] objArr86 = new Object[4];
        objArr86[0] = new int[i3];
        int[] iArr4 = new int[i3];
        objArr86[i3] = iArr4;
        int[] iArr5 = new int[i3];
        objArr86[2] = iArr5;
        int i117 = ((int[]) objArr9[0])[0];
        int i118 = ((int[]) objArr9[2])[0];
        int i119 = ((int[]) objArr9[i3])[0];
        String[] strArr6 = (String[]) objArr9[3];
        iArr5[0] = i118;
        iArr4[0] = i119;
        int i120 = ~(((int) Process.getStartElapsedRealtime()) | 607634013);
        int i121 = i117 + ((1700738712 | i120) * (-658)) + 683940050 + ((i120 | 1095251072) * 658);
        int i122 = (i121 << 13) ^ i121;
        int i123 = i122 ^ (i122 >>> 17);
        Object obj3 = objArr86[0];
        ((int[]) obj3)[0] = i123 ^ (i123 << 5);
        objArr86[3] = strArr6;
        ((Field) requestByteToBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{978501771, 718274514, 87605510}, ((int[]) obj3)[0], Integer.MAX_VALUE) + 215424704);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char packedPositionType3 = (char) (37567 - ExpandableListView.getPackedPositionType(0L));
            int gidForName2 = 624 - Process.getGidForName("");
            int i124 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14;
            Object[] objArr87 = new Object[1];
            c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr87);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(packedPositionType3, gidForName2, i124, -477065106, false, (String) objArr87[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
            char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 37568);
            int i125 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 624;
            int minimumFlingVelocity = 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte[] bArr21 = $$a;
            byte b46 = bArr21[91];
            byte b47 = bArr21[7];
            Object[] objArr88 = new Object[1];
            c(b46, b47, (short) (b47 | 121), objArr88);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(bitsPerPixel2, i125, minimumFlingVelocity, -976899241, false, (String) objArr88[0], null);
        }
        if (j4 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null) << 52) >>> 52)) >> 12)) {
            int i126 = TuitionPaymentFragmentbindingInflater1 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i126 % 128;
            int i127 = i126 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char offsetBefore = (char) (37567 - TextUtils.getOffsetBefore("", 0));
                int longPressTimeout3 = 625 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iResolveSize2 = View.resolveSize(0, 0) + 14;
                byte[] bArr22 = $$a;
                byte b48 = bArr22[91];
                byte b49 = bArr22[7];
                Object[] objArr89 = new Object[1];
                c(b48, b49, (short) (b49 | 173), objArr89);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(offsetBefore, longPressTimeout3, iResolveSize2, -973632554, false, (String) objArr89[0], null);
            }
            Object[] objArr90 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).get(null);
            int i128 = ((int[]) objArr90[2])[0];
            int i129 = ((int[]) objArr90[0])[0];
            String[] strArr7 = (String[]) objArr90[3];
            int[] iArr6 = {i128};
            int iMyPid = Process.myPid();
            int i130 = ~iMyPid;
            int i131 = ((((-585023180) + ((iMyPid | 1022692357) * 140)) + (((~(1022692357 | i130)) | 51048706) * (-280))) + (((~(iMyPid | (-51048707))) | ((~(801045763 | i130)) | 272695300)) * 140)) - 2071729555;
            int i132 = (i131 << 13) ^ i131;
            int i133 = i132 ^ (i132 >>> 17);
            ((int[]) objArr10[1])[0] = i133 ^ (i133 << 5);
            objArr10 = new Object[]{new int[]{i129}, new int[1], iArr6, strArr7};
            c4 = 0;
            str4 = str2;
        } else {
            Context applicationContext4 = (Context) Class.forName(str10).getMethod(str3, new Class[0]).invoke(null, null);
            if (applicationContext4 != null) {
                applicationContext4 = ((applicationContext4 instanceof ContextWrapper) && ((ContextWrapper) applicationContext4).getBaseContext() == null) ? null : applicationContext4.getApplicationContext();
            }
            int iIntValue2 = ((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue();
            Object[] objArr91 = new Object[1];
            a(new char[]{'\n', '#', 1, 21, 24, '+', 4, 14, 0, 7, 1, 28, 13843, 13843, 29, Typography.dollar, 20, 21, 17, '\'', 28, 15, 17, '*', '#', 17, '0', 24, '!', '\n', 28, '0', '+', 21, 14, 0, 13759, 13759, '+', 27, 1, 28, ')', 6, 3, '#', ' ', 30, 25, 1, '+', 27, ')', 6, '\n', '*', '+', '*', 31, '0', '*', 3, '\n', '*'}, (byte) (20 - View.MeasureSpec.makeMeasureSpec(0, 0)), 64 - ExpandableListView.getPackedPositionGroup(0L), objArr91);
            String str16 = (String) objArr91[0];
            Object[] objArr92 = new Object[1];
            a(new char[]{1, 27, 11, 19, 1, ' ', '*', 17, '#', 3, 3, '.', '#', '\n', 6, 28, '\n', 28, 17, ' ', 28, 15, 4, 14, '0', 31, '.', '+', 28, '-', '+', '*', '+', '.', Typography.quote, 22, 31, ')', 21, '\b', '\n', '#', 4, 14, 20, 28, 13847, 13847, '0', 0, 13841, 13841, '0', 31, 28, '\n', 0, 1, '\r', 28, 25, 1, 14, 4}, (byte) (109 - MotionEvent.axisFromString("")), 64 - View.MeasureSpec.getMode(0), objArr92);
            Object[] objArr93 = {applicationContext4, new String[]{str16, (String) objArr92[0]}, Integer.valueOf(iIntValue2), 17, -2071729555};
            byte[] bArr23 = $$d;
            short s = (short) (bArr23[58] - 1);
            Object[] objArr94 = new Object[1];
            d((byte) 49, s, (byte) s, objArr94);
            Class<?> cls6 = Class.forName((String) objArr94[0]);
            byte b50 = bArr23[50];
            Object[] objArr95 = new Object[1];
            d(b50, (short) (b50 | 292), bArr23[21], objArr95);
            Object[] objArr96 = (Object[]) cls6.getMethod((String) objArr95[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr93);
            int i134 = ((int[]) objArr96[0])[0];
            int i135 = ((int[]) objArr96[2])[0];
            if (applicationContext4 != null) {
                int i136 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                TuitionPaymentFragmentbindingInflater1 = i136 % 128;
                int i137 = i136 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16814783);
                    int iRed = Color.red(0) + 625;
                    int i138 = 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte[] bArr24 = $$a;
                    byte b51 = bArr24[91];
                    byte b52 = bArr24[7];
                    Object[] objArr97 = new Object[1];
                    c(b51, b52, (short) (b52 | 173), objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cRgb, iRed, i138, -973632554, false, (String) objArr97[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, objArr96);
                try {
                    str4 = str2;
                    long jLongValue11 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        char c21 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37566);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 625;
                        int offsetBefore2 = 14 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr25 = $$a;
                        byte b53 = bArr25[91];
                        byte b54 = bArr25[7];
                        Object[] objArr98 = new Object[1];
                        c(b53, b54, (short) (b54 | 121), objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(c21, iKeyCodeFromString, offsetBefore2, -976899241, false, (String) objArr98[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 37567);
                        int maxKeyCode2 = 625 - (KeyEvent.getMaxKeyCode() >> 16);
                        int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 14;
                        Object[] objArr99 = new Object[1];
                        c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr99);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(maxKeyCode, maxKeyCode2, packedPositionType4, -477065106, false, (String) objArr99[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                objArr96 = objArr96;
                str4 = str2;
            }
            objArr10 = objArr96;
            c4 = 0;
        }
        int i139 = ((int[]) objArr10[c4])[c4];
        int i140 = ((int[]) objArr10[2])[c4];
        if (i140 == i139) {
            objArr11 = new Object[4];
            int[] iArr7 = new int[1];
            objArr11[c4] = iArr7;
            objArr11[1] = new int[1];
            int[] iArr8 = new int[1];
            objArr11[2] = iArr8;
            int i141 = ((int[]) objArr10[1])[c4];
            int i142 = ((int[]) objArr10[2])[c4];
            int i143 = ((int[]) objArr10[c4])[c4];
            String[] strArr8 = (String[]) objArr10[3];
            iArr8[c4] = i142;
            iArr7[c4] = i143;
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i144 = ~iMaxMemory;
            int i145 = i141 + 378411976 + (((~((-1653878175) | i144)) | 34867466) * 168) + ((~((-34867467) | iMaxMemory)) * 168) + (((~(iMaxMemory | (-1619010709))) | (~(i144 | (-169859947))) | 134992480) * 168);
            int i146 = (i145 << 13) ^ i145;
            int i147 = i146 ^ (i146 >>> 17);
            ((int[]) objArr11[1])[0] = i147 ^ (i147 << 5);
            objArr11[3] = strArr8;
            c5 = 1;
            i4 = 0;
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr9 = (String[]) objArr10[3];
            if (strArr9 != null) {
                for (String str17 : strArr9) {
                    arrayList5.add(str17);
                }
            }
            int[] iArr9 = new int[i140];
            int i148 = i140 - 1;
            iArr9[i148] = 1;
            Toast.makeText((Context) null, iArr9[((i140 * i148) % 2) - 1], 1).show();
            int i149 = ((int[]) objArr10[1])[0];
            int i150 = ((int[]) objArr10[2])[0];
            int i151 = ((int[]) objArr10[0])[0];
            String[] strArr10 = (String[]) objArr10[3];
            int[] iArr10 = {i150};
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i152 = ~iIdentityHashCode10;
            int i153 = i149 + (-1838244064) + (((~((-852125489) | i152)) | (~((-971612633) | i152))) * (-867)) + (((~((-852125489) | iIdentityHashCode10)) | 818422032 | (~((-971612633) | iIdentityHashCode10))) * (-1734)) + (((~(iIdentityHashCode10 | (-153190601))) | (~(i152 | (-818422033))) | (~((-33703457) | iIdentityHashCode10))) * 867);
            int i154 = (i153 << 13) ^ i153;
            int i155 = i154 ^ (i154 >>> 17);
            c5 = 1;
            i4 = 0;
            ((int[]) objArr11[1])[0] = i155 ^ (i155 << 5);
            objArr11 = new Object[]{new int[]{i151}, new int[1], iArr10, strArr10};
        }
        ((Field) writeExifSegment.b[i4]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1059683130, 531620854, 931232251}, ((int[]) objArr11[c5])[i4], Integer.MAX_VALUE) - (-990266212));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char c22 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int i156 = (ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1)) + 1031;
            int mirror = '?' - AndroidCharacter.getMirror('0');
            byte[] bArr26 = $$a;
            byte b55 = bArr26[91];
            byte b56 = bArr26[7];
            Object[] objArr100 = new Object[1];
            c(b55, b56, (short) (b56 | 121), objArr100);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c22, i156, mirror, 1357589585, false, (String) objArr100[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
            char trimmedLength3 = (char) TextUtils.getTrimmedLength("");
            int iIndexOf9 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
            byte[] bArr27 = $$a;
            byte b57 = bArr27[91];
            byte b58 = bArr27[7];
            Object[] objArr101 = new Object[1];
            c(b57, b58, (short) (b58 | 173), objArr101);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(trimmedLength3, iIndexOf9, offsetAfter, 1344079056, false, (String) objArr101[0], null);
        }
        if (j5 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int maxKeyCode3 = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                int longPressTimeout4 = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                Object[] objArr102 = new Object[1];
                c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr102);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(threadPriority3, maxKeyCode3, longPressTimeout4, 632103528, false, (String) objArr102[0], null);
            }
            Object[] objArr103 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).get(null);
            objArr12 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i157 = ((int[]) objArr103[3])[0];
            int i158 = ((int[]) objArr103[1])[0];
            String[] strArr11 = (String[]) objArr103[0];
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i159 = ~iIdentityHashCode11;
            int i160 = (~(271112141 | i159)) | 244318258;
            int i161 = ~(iIdentityHashCode11 | (-38089));
            int i162 = ((((i160 | i161) * (-252)) + 1682939041) + ((i161 | (~(i159 | 515430399))) * 252)) - 1095976052;
            int i163 = (i162 << 13) ^ i162;
            int i164 = i163 ^ (i163 >>> 17);
            ((int[]) objArr12[2])[0] = i164 ^ (i164 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue();
            Object[] objArr104 = {153885109};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b((char) (46038 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 1134 - TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0') + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr105 = {Integer.valueOf(iIntValue3), 0, -1095976052, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).newInstance(objArr104), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char maxKeyCode4 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int i165 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iIndexOf10 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte[] bArr28 = $$a;
                byte b59 = bArr28[91];
                byte b60 = bArr28[7];
                Object[] objArr106 = new Object[1];
                c(b59, b60, (short) (b60 | 121), objArr106);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(maxKeyCode4, i165, iIndexOf10, 1298546779, false, (String) objArr106[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 45993), 1117 - Gravity.getAbsoluteGravity(0, 0), 17 - KeyEvent.getDeadChar(0, 0)), Boolean.TYPE});
            }
            objArr12 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).invoke(null, objArr105);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char c23 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 15;
                Object[] objArr107 = new Object[1];
                c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(c23, doubleTapTimeout, iCombineMeasuredStates2, 632103528, false, (String) objArr107[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr12);
            try {
                long jLongValue13 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                    int offsetBefore3 = 15 - TextUtils.getOffsetBefore("", 0);
                    byte[] bArr29 = $$a;
                    byte b61 = bArr29[91];
                    byte b62 = bArr29[7];
                    Object[] objArr108 = new Object[1];
                    c(b61, b62, (short) (b62 | 173), objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cIndexOf2, doubleTapTimeout2, offsetBefore3, 1344079056, false, (String) objArr108[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int i166 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
                    int deadChar2 = 15 - KeyEvent.getDeadChar(0, 0);
                    byte[] bArr30 = $$a;
                    byte b63 = bArr30[91];
                    byte b64 = bArr30[7];
                    Object[] objArr109 = new Object[1];
                    c(b63, b64, (short) (b64 | 121), objArr109);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(defaultSize, i166, deadChar2, 1357589585, false, (String) objArr109[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf16);
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i167 = ((int[]) objArr12[1])[0];
        int i168 = ((int[]) objArr12[3])[0];
        if (i168 == i167) {
            objArr13 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i169 = ((int[]) objArr12[2])[0];
            int i170 = ((int[]) objArr12[3])[0];
            int i171 = ((int[]) objArr12[1])[0];
            String[] strArr12 = (String[]) objArr12[0];
            int i172 = (int) Runtime.getRuntime().totalMemory();
            int i173 = ~i172;
            int i174 = (-711022115) + (((~((-847477634) | i173)) | 268659584 | (~(603197463 | i173)) | (~((-24379415) | i172))) * (-84));
            int i175 = (~(i172 | 603197463)) | 847477633;
            int i176 = ~(i173 | (-603197464));
            int i177 = i169 + i174 + ((i175 | i176) * (-84)) + ((24379414 | i176) * 84);
            int i178 = (i177 << 13) ^ i177;
            int i179 = i178 ^ (i178 >>> 17);
            ((int[]) objArr13[2])[0] = i179 ^ (i179 << 5);
            i5 = 0;
            c6 = 2;
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr13 = (String[]) objArr12[0];
            if (strArr13 != null) {
                for (String str18 : strArr13) {
                    arrayList6.add(str18);
                }
            }
            int[] iArr11 = new int[i168];
            int i180 = i168 - 1;
            iArr11[i180] = 1;
            Toast.makeText((Context) null, iArr11[((i168 * i180) % 2) - 1], 1).show();
            objArr13 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i181 = ((int[]) objArr12[2])[0];
            int i182 = ((int[]) objArr12[3])[0];
            int i183 = ((int[]) objArr12[1])[0];
            String[] strArr14 = (String[]) objArr12[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i184 = ~elapsedCpuTime;
            int i185 = (-711022115) + (((~((-416831770) | i184)) | 277876752 | (~(172551599 | i184)) | (~((-33596583) | elapsedCpuTime))) * (-84));
            int i186 = (~(elapsedCpuTime | 172551599)) | 416831769;
            int i187 = ~(i184 | (-172551600));
            int i188 = i181 + i185 + ((i186 | i187) * (-84)) + ((33596582 | i187) * 84);
            int i189 = (i188 << 13) ^ i188;
            int i190 = i189 ^ (i189 >>> 17);
            c6 = 2;
            i5 = 0;
            ((int[]) objArr13[2])[0] = i190 ^ (i190 << 5);
        }
        ((Field) ExifDataBuilder2.TuitionPaymentFragmentbindingInflater1[i5]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{678954192, 804664366, 877628252}, ((int[]) objArr13[c6])[i5], Integer.MAX_VALUE) + 48183500);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char cAlpha = (char) Color.alpha(i5);
            int i191 = 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int capsMode3 = TextUtils.getCapsMode("", i5, i5) + 44;
            byte[] bArr31 = $$a;
            byte b65 = bArr31[91];
            byte b66 = bArr31[7];
            Object[] objArr110 = new Object[1];
            c(b65, b66, (short) (b66 | 52), objArr110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cAlpha, i191, capsMode3, -459846511, false, (String) objArr110[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char trimmedLength4 = (char) TextUtils.getTrimmedLength("");
            int pressedStateDuration = 651 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int gidForName3 = 43 - Process.getGidForName("");
            Object[] objArr111 = new Object[1];
            c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(trimmedLength4, pressedStateDuration, gidForName3, -873460649, false, (String) objArr111[0], null);
        }
        if (j6 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char trimmedLength5 = (char) TextUtils.getTrimmedLength("");
                int windowTouchSlop2 = 651 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i192 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43;
                byte b67 = $$a[91];
                Object[] objArr112 = new Object[1];
                c(b67, (byte) (b67 - 4), (short) 210, objArr112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(trimmedLength5, windowTouchSlop2, i192, -1595579076, false, (String) objArr112[0], null);
            }
            Object[] objArr113 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            objArr14 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i193 = ((int[]) objArr113[2])[0];
            int i194 = ((int[]) objArr113[0])[0];
            int i195 = ~System.identityHashCode(this);
            int i196 = 551014650 + ((~((-587203717) | i195)) * (-783)) + (((~(i195 | (-589677813))) | (-593108623)) * 783) + 958900814;
            int i197 = (i196 << 13) ^ i196;
            int i198 = i197 ^ (i197 >>> 17);
            ((int[]) objArr14[3])[0] = i198 ^ (i198 << 5);
            i6 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b((char) (Process.getGidForName("") + 1), 1609 - TextUtils.lastIndexOf("", '0', 0), 26 - TextUtils.getOffsetBefore("", 0), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr114 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).newInstance(null), 958900814, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int keyRepeatTimeout5 = 651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 44;
                Object[] objArr115 = new Object[1];
                c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cKeyCodeFromString, keyRepeatTimeout5, jumpTapTimeout, 2075921419, false, (String) objArr115[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf("", "", 0) + 695, 98 - Color.argb(0, 0, 0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63407 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 792 - ExpandableListView.getPackedPositionChild(0L), 83 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Integer.TYPE, Integer.TYPE});
            }
            objArr14 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).invoke(null, objArr114);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int capsMode4 = TextUtils.getCapsMode("", 0, 0) + 651;
                int iIndexOf11 = TextUtils.indexOf("", "", 0) + 44;
                byte b68 = $$a[91];
                Object[] objArr116 = new Object[1];
                c(b68, (byte) (b68 - 4), (short) 210, objArr116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(windowTouchSlop3, capsMode4, iIndexOf11, -1595579076, false, (String) objArr116[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArr14);
            try {
                long jLongValue15 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    int iArgb = 651 - Color.argb(0, 0, 0, 0);
                    int maximumDrawingCacheSize3 = 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    Object[] objArr117 = new Object[1];
                    c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr117);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf3, iArgb, maximumDrawingCacheSize3, -873460649, false, (String) objArr117[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int i199 = 652 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 44;
                    byte[] bArr32 = $$a;
                    byte b69 = bArr32[91];
                    byte b70 = bArr32[7];
                    Object[] objArr118 = new Object[1];
                    c(b69, b70, (short) (b70 | 52), objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(tapTimeout2, i199, touchSlop3, -459846511, false, (String) objArr118[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf18);
                i6 = 0;
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        int i200 = ((int[]) objArr14[i6])[i6];
        int i201 = ((int[]) objArr14[2])[i6];
        if (i201 == i200) {
            objArr15 = new Object[4];
            int[] iArr12 = new int[1];
            objArr15[i6] = iArr12;
            int[] iArr13 = new int[1];
            objArr15[2] = iArr13;
            objArr15[3] = new int[1];
            int i202 = ((int[]) objArr14[3])[i6];
            int i203 = ((int[]) objArr14[2])[i6];
            int i204 = ((int[]) objArr14[i6])[i6];
            iArr13[i6] = i203;
            iArr12[i6] = i204;
            objArr15[1] = new String[i6];
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i205 = i202 + 907342901 + (((~(274171777 | startElapsedRealtime2)) | (-277602588)) * (-948)) + ((~((~startElapsedRealtime2) | (-8937499))) * (-948)) + 2099620348;
            int i206 = (i205 << 13) ^ i205;
            int i207 = i206 ^ (i206 >>> 17);
            ((int[]) objArr15[3])[0] = i207 ^ (i207 << 5);
            i7 = 0;
            c7 = 3;
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr15 = (String[]) objArr14[1];
            if (strArr15 != null) {
                for (String str19 : strArr15) {
                    arrayList7.add(str19);
                }
            }
            Toast.makeText((Context) null, i201 / (((i201 - 1) * i201) % 2), 0).show();
            objArr15 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i208 = ((int[]) objArr14[3])[0];
            int i209 = ((int[]) objArr14[2])[0];
            int i210 = ((int[]) objArr14[0])[0];
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i211 = ~((-3432993) | iIdentityHashCode12);
            int i212 = ~iIdentityHashCode12;
            int i213 = i208 + 4515760 + ((i211 | (~(997522150 | i212))) * 497) + (((~(iIdentityHashCode12 | 997522150)) | (~((-997519969) | i212)) | 994086976) * 497);
            int i214 = i213 ^ (i213 << 13);
            int i215 = i214 ^ (i214 >>> 17);
            c7 = 3;
            i7 = 0;
            ((int[]) objArr15[3])[0] = i215 ^ (i215 << 5);
        }
        ((Field) setOrientationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i7]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1121800734, 1415249141, 418156432}, ((int[]) objArr15[c7])[i7], Integer.MAX_VALUE) - (-2068347199));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char cAlpha2 = (char) (53893 - Color.alpha(i7));
            int iArgb2 = Color.argb(i7, i7, i7, i7) + 1320;
            int i216 = 36 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr119 = new Object[1];
            c((byte) ($$a[i7] - 1), (byte) ($$b - 5), (short) 210, objArr119);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cAlpha2, iArgb2, i216, -1433084963, false, (String) objArr119[i7], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cIndexOf4 = (char) (53892 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int scrollBarFadeDuration2 = 1320 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iIndexOf12 = 35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr33 = $$a;
                byte b71 = bArr33[91];
                byte b72 = bArr33[7];
                Object[] objArr120 = new Object[1];
                c(b71, b72, (short) (b72 | 173), objArr120);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cIndexOf4, scrollBarFadeDuration2, iIndexOf12, -1920778747, false, (String) objArr120[0], null);
            }
            Object[] objArr121 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr16 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i217 = ((int[]) objArr121[0])[0];
            int i218 = ((int[]) objArr121[3])[0];
            String[] strArr16 = (String[]) objArr121[2];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i219 = (((((~((-1026723096) | iUptimeMillis)) | 687868934) * (-283)) - 1530959470) + ((~(iUptimeMillis | (-338854162))) * 283)) - 1171943360;
            int i220 = (i219 << 13) ^ i219;
            int i221 = i220 ^ (i220 >>> 17);
            ((int[]) objArr16[1])[0] = i221 ^ (i221 << 5);
            str5 = str3;
        } else {
            str5 = str3;
            Context applicationContext5 = (Context) Class.forName(str10).getMethod(str5, new Class[0]).invoke(null, null);
            if (applicationContext5 != null) {
                applicationContext5 = ((applicationContext5 instanceof ContextWrapper) && ((ContextWrapper) applicationContext5).getBaseContext() == null) ? null : applicationContext5.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue();
            Object[] objArr122 = {-1893572789};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 47978), 1300 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 20 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr123 = {applicationContext5, "com.bpjstku", -1171943360, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).newInstance(objArr122), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char cMyTid2 = (char) (53893 - (Process.myTid() >> 22));
                int longPressTimeout5 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1320;
                int jumpTapTimeout2 = 36 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte[] bArr34 = $$a;
                byte b73 = bArr34[91];
                byte b74 = bArr34[7];
                Object[] objArr124 = new Object[1];
                c(b73, b74, (short) (b74 | 173), objArr124);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cMyTid2, longPressTimeout5, jumpTapTimeout2, 819724799, false, (String) objArr124[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1393 - TextUtils.indexOf((CharSequence) "", '0'), ImageFormat.getBitsPerPixel(0) + 76), Boolean.TYPE});
            }
            Object[] objArr125 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).invoke(null, objArr123);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char size5 = (char) (53893 - View.MeasureSpec.getSize(0));
                    int maximumFlingVelocity5 = 1320 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i222 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35;
                    byte[] bArr35 = $$a;
                    byte b75 = bArr35[91];
                    byte b76 = bArr35[7];
                    Object[] objArr126 = new Object[1];
                    c(b75, b76, (short) (b76 | 173), objArr126);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(size5, maximumFlingVelocity5, i222, -1920778747, false, (String) objArr126[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArr125);
                try {
                    long jLongValue16 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char cGreen = (char) (53893 - Color.green(0));
                        int capsMode5 = TextUtils.getCapsMode("", 0, 0) + 1320;
                        int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                        byte b77 = $$a[91];
                        Object[] objArr127 = new Object[1];
                        c(b77, (byte) (b77 - 4), (short) 210, objArr127);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cGreen, capsMode5, jumpTapTimeout3, -1273706634, false, (String) objArr127[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 53893);
                        int fadingEdgeLength3 = 1320 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iIndexOf13 = TextUtils.indexOf((CharSequence) "", '0', 0) + 37;
                        Object[] objArr128 = new Object[1];
                        c((byte) ($$a[0] - 1), (byte) ($$b - 5), (short) 210, objArr128);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cCombineMeasuredStates, fadingEdgeLength3, iIndexOf13, -1433084963, false, (String) objArr128[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            } else {
                objArr125 = objArr125;
            }
            objArr16 = objArr125;
        }
        int i223 = ((int[]) objArr16[3])[0];
        int i224 = ((int[]) objArr16[0])[0];
        if (i224 == i223) {
            objArr17 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i225 = ((int[]) objArr16[1])[0];
            int i226 = ((int[]) objArr16[0])[0];
            int i227 = ((int[]) objArr16[3])[0];
            String[] strArr17 = (String[]) objArr16[2];
            int i228 = (int) Runtime.getRuntime().totalMemory();
            int i229 = ~i228;
            int i230 = i225 + (-1781919308) + (((~((-1168163083) | i229)) | (~((-202464743) | i228))) * 210) + (((~(i228 | (-1101037577))) | (~(i229 | (-135339237)))) * 210);
            int i231 = (i230 << 13) ^ i230;
            int i232 = i231 ^ (i231 >>> 17);
            c9 = 0;
            ((int[]) objArr17[1])[0] = i232 ^ (i232 << 5);
            c8 = 1;
        } else {
            int[] iArr14 = new int[i224];
            int i233 = i224 - 1;
            iArr14[i233] = 1;
            Toast.makeText((Context) null, iArr14[((i224 * i233) % 2) - 1], 1).show();
            objArr17 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i234 = ((int[]) objArr16[1])[0];
            int i235 = ((int[]) objArr16[0])[0];
            int i236 = ((int[]) objArr16[3])[0];
            String[] strArr18 = (String[]) objArr16[2];
            int i237 = ~System.identityHashCode(this);
            int i238 = i234 + ((((~((-243645391) | i237)) | 33825538) * (-241)) - 525158990) + (((~(i237 | (-209819853))) | 1093156896) * 241);
            int i239 = (i238 << 13) ^ i238;
            int i240 = i239 ^ (i239 >>> 17);
            c8 = 1;
            c9 = 0;
            ((int[]) objArr17[1])[0] = i240 ^ (i240 << 5);
        }
        ((Field) setExposureTimeNanos.TuitionPaymentFragmentspecialinlinedviewModeldefault3[c9]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{223781324, 1905394863, 582484352}, ((int[]) objArr17[c8])[c9], Integer.MAX_VALUE) - Integer.MAX_VALUE);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char touchSlop4 = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int keyRepeatTimeout6 = 2267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 33;
            byte[] bArr36 = $$a;
            byte b78 = bArr36[91];
            byte b79 = bArr36[7];
            Object[] objArr129 = new Object[1];
            c(b78, b79, (short) (b79 | 173), objArr129);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(touchSlop4, keyRepeatTimeout6, tapTimeout3, -887667012, false, (String) objArr129[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cNormalizeMetaState3 = (char) KeyEvent.normalizeMetaState(0);
                int i241 = 2267 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iGreen3 = 33 - Color.green(0);
                byte b80 = $$a[91];
                Object[] objArr130 = new Object[1];
                c(b80, (byte) (b80 - 4), (short) 210, objArr130);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cNormalizeMetaState3, i241, iGreen3, -654680577, false, (String) objArr130[0], null);
            }
            Object[] objArr131 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr18 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i242 = ((int[]) objArr131[0])[0];
            int i243 = ((int[]) objArr131[3])[0];
            String[] strArr19 = (String[]) objArr131[1];
            int iIdentityHashCode13 = System.identityHashCode(this);
            int i244 = ~iIdentityHashCode13;
            int i245 = (-510675649) + (((~((-452685724) | i244)) | (-356027593) | (~(452685723 | iIdentityHashCode13))) * (-564)) + ((~(iIdentityHashCode13 | (-83918913))) * 1128) + (((~((-356027593) | i244)) | (-536604636)) * 564) + 268508448;
            int i246 = (i245 << 13) ^ i245;
            int i247 = i246 ^ (i246 >>> 17);
            ((int[]) objArr18[2])[0] = i247 ^ (i247 << 5);
        } else {
            Context applicationContext6 = (Context) Class.forName(str10).getMethod(str5, new Class[0]).invoke(null, null);
            if (applicationContext6 != null) {
                int i248 = TuitionPaymentFragmentbindingInflater1 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i248 % 128;
                int i249 = i248 % 2;
                applicationContext6 = ((applicationContext6 instanceof ContextWrapper) && ((ContextWrapper) applicationContext6).getBaseContext() == null) ? null : applicationContext6.getApplicationContext();
            }
            Object[] objArr132 = {applicationContext6, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, 268508448};
            byte[] bArr37 = $$d;
            byte b81 = bArr37[5];
            Object[] objArr133 = new Object[1];
            d(b81, b81, bArr37[50], objArr133);
            Class<?> cls7 = Class.forName((String) objArr133[0]);
            Object[] objArr134 = new Object[1];
            d(bArr37[50], (short) 363, (byte) (-bArr37[337]), objArr134);
            objArr18 = (Object[]) cls7.getMethod((String) objArr134[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr132);
            if (applicationContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int size6 = View.MeasureSpec.getSize(0) + 2267;
                    int iMyPid2 = (Process.myPid() >> 22) + 33;
                    byte b82 = $$a[91];
                    Object[] objArr135 = new Object[1];
                    c(b82, (byte) (b82 - 4), (short) 210, objArr135);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(doubleTapTimeout3, size6, iMyPid2, -654680577, false, (String) objArr135[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr18);
                try {
                    long jLongValue17 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char defaultSize2 = (char) View.getDefaultSize(0, 0);
                        int iLastIndexOf3 = 2266 - TextUtils.lastIndexOf("", '0', 0);
                        int i250 = 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr38 = $$a;
                        byte b83 = bArr38[91];
                        byte b84 = bArr38[7];
                        Object[] objArr136 = new Object[1];
                        c(b83, b84, (short) (b84 | 121), objArr136);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(defaultSize2, iLastIndexOf3, i250, -874156483, false, (String) objArr136[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char c24 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iResolveOpacity4 = Drawable.resolveOpacity(0, 0) + 2267;
                        int scrollBarSize4 = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte[] bArr39 = $$a;
                        byte b85 = bArr39[91];
                        byte b86 = bArr39[7];
                        Object[] objArr137 = new Object[1];
                        c(b85, b86, (short) (b86 | 173), objArr137);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(c24, iResolveOpacity4, scrollBarSize4, -887667012, false, (String) objArr137[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        if (((int[]) objArr18[0])[0] != ((int[]) objArr18[3])[0]) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr20 = (String[]) objArr18[1];
            if (strArr20 != null) {
                for (String str20 : strArr20) {
                    arrayList8.add(str20);
                }
            }
            throw null;
        }
        Object[] objArr138 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i251 = ((int[]) objArr18[2])[0];
        int i252 = ((int[]) objArr18[0])[0];
        int i253 = ((int[]) objArr18[3])[0];
        String[] strArr21 = (String[]) objArr18[1];
        int iIdentityHashCode14 = System.identityHashCode(this);
        int i254 = ~iIdentityHashCode14;
        int i255 = i251 + (((~((-391619925) | i254)) | (~((-417093392) | iIdentityHashCode14)) | (~(i254 | 417093391))) * 959) + 91567654 + (((~(iIdentityHashCode14 | 417093391)) | (~(i254 | (-417093392))) | (~((-391619925) | iIdentityHashCode14))) * 959);
        int i256 = (i255 << 13) ^ i255;
        int i257 = i256 ^ (i256 >>> 17);
        Object obj4 = objArr138[2];
        ((int[]) obj4)[0] = i257 ^ (i257 << 5);
        int i258 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i258 % 128;
        int i259 = i258 % 2;
        ((Field) setFocalLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1896191136, 1836171149, 1601151895}, ((int[]) obj4)[0], Integer.MAX_VALUE) + 819369240);
        zzafVar.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            viewOnCreateView = this.zza.onCreateView(layoutInflater, viewGroup, bundle);
            viewOnCreateView.setClickable(false);
        } else {
            viewOnCreateView = this.zza.onCreateView(layoutInflater, viewGroup, bundle);
            viewOnCreateView.setClickable(true);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
        return viewOnCreateView;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.onDestroy();
        super.onDestroy();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.onDestroyView();
        super.onDestroyView();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.onLowMemory();
        super.onLowMemory();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Fragment
    public void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.onPause();
        super.onPause();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onEnterAmbient(Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
            this.zza.getDelegate();
            throw null;
        }
        Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        zzaf zzafVar = this.zza;
        if (zzafVar.getDelegate() != null) {
            ((zzae) zzafVar.getDelegate()).zza(bundle);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExitAmbient() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
            this.zza.getDelegate();
            throw null;
        }
        Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        zzaf zzafVar = this.zza;
        if (zzafVar.getDelegate() != null) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            zzae zzaeVar = (zzae) zzafVar.getDelegate();
            if (i4 != 0) {
                zzaeVar.zzb();
            } else {
                zzaeVar.zzb();
                throw null;
            }
        }
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        int i = 2 % 2;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            zzaf zzafVar = this.zza;
            zzaf.zza(zzafVar, activity);
            GoogleMapOptions googleMapOptionsCreateFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsCreateFromAttributes);
            zzafVar.onInflate(activity, bundle2, bundle);
            StrictMode.setThreadPolicy(threadPolicy);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -522264765
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Fragment
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.onResume():void");
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            bundle.setClassLoader(classLoader);
            int i6 = TuitionPaymentFragmentbindingInflater1 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
        }
        super.onSaveInstanceState(bundle);
        this.zza.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        super.setArguments(bundle);
        if (i3 != 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1480069813
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Fragment
    public void onStart() {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.onStart():void");
    }

    @Override // android.app.Fragment
    public void onStop() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.onStop();
        super.onStop();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MapFragment newInstance(GoogleMapOptions googleMapOptions) {
        int i = 2 % 2;
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return mapFragment;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, int r6, int r7) {
        /*
            byte[] r0 = com.google.android.gms.maps.MapFragment.$$c
            int r5 = 116 - r5
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r3 = r0[r7]
        L24:
            int r5 = r5 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.$$g(byte, int, int):java.lang.String");
    }
}
