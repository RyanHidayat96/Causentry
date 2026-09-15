package com.google.android.libraries.places.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bpjstku.R;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzmy;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.DecorContentParent;
import defpackage.abortCapture;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/google/android/libraries/places/widget/BasicPlaceAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/internal/autocomplete/base/BaseAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/listener/PlaceSelectionListener;", "<init>", "()V", "resultErrorStatus", "Lcom/google/android/gms/common/api/Status;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPlaceSelected", "place", "Lcom/google/android/libraries/places/api/model/Place;", "onError", NotificationCompat.CATEGORY_STATUS, "setTestFragmentFactory", "factory", "Landroidx/fragment/app/FragmentFactory;", "Companion", "java.com.google.android.libraries.places.widget_basic_place_autocomplete_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BasicPlaceAutocompleteActivity extends zzmy implements PlaceSelectionListener {
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_ERROR;
    public static final int RESULT_OK;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private Status zzb;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$f = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {41, 2, 45, -60, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 208;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.google.android.libraries.places.widget.BasicPlaceAutocompleteActivity.$$d
            int r6 = r6 + 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.BasicPlaceAutocompleteActivity.d(short, int, byte, java.lang.Object[]):void");
    }

    private static void f(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 117;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 65;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1355, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 38, 894276454, false, $$i(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 47773), (ViewConfiguration.getEdgeSlop() >> 16) + 468, ExpandableListView.getPackedPositionGroup(0L) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public final void onPlaceSelected(Place place) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(place, "");
        zza(RESULT_OK, place, Status.RESULT_SUCCESS);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzmy, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (((-1134047304) + (((~iIdentityHashCode) | 269484041) * 1324)) + (((~(iIdentityHashCode | (-1743641585))) | (~(913654041 | iIdentityHashCode))) * (-1324))) - 10524956) {
            throw new RuntimeException("-1541426230");
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i6 = ~iIdentityHashCode2;
        int i7 = (~((-915492879) | i6)) | 570511374;
        int i8 = ~(iIdentityHashCode2 | 2008544590);
        if (i5 != 1212956880 + ((i7 | i8) * (-502)) + ((i8 | (~(i6 | (-344981505)))) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            throw null;
        }
        super.onCreate(savedInstanceState);
        BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
        if (baseAutocompleteImplFragment != null) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.checkNotNull(baseAutocompleteImplFragment, "");
            baseAutocompleteImplFragment.zzb(this);
            if (i10 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public final void onError(Status status) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(status, "");
        if (!status.isCanceled()) {
            this.zzb = status;
            zzc(RESULT_ERROR, status);
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Status status2 = this.zzb;
        if (status2 == null) {
            zza(RESULT_CANCELED, null, status);
        } else {
            zza(RESULT_ERROR, null, status2);
            this.zzb = null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzmy, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
            int iArgb = 15 - Color.argb(0, 0, 0, 0);
            byte[] bArr = $$d;
            short s = bArr[132];
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            d(s, b2, (byte) (b2 | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, keyRepeatTimeout, iArgb, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        f(new char[]{35359, 24840, 1246, 34497, 35454, 7497, 64740, 62014, 31436, 3466, 60832, 58278, 27400, 15580, 56614, 53399, 22610, 12056, 52792, 49253, 18562, 24148, 49148, 45523, 14800, 20152}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.card_details).substring(8, 9).codePointAt(0) - 96, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f(new char[]{51663, 13325, 54904, 9389, 51626, 18510, 11847, 20560, 14592, 22659, 16134, 16822, 10450, 27083, 4034, 29404, 7058, 31235, 7311}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
            int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0);
            byte b3 = $$d[7];
            Object[] objArr5 = new Object[1];
            d((short) 51, b3, (byte) (b3 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, doubleTapTimeout, iLastIndexOf, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                byte[] bArr2 = $$d;
                Object[] objArr6 = new Object[1];
                d((short) 103, bArr2[5], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, iAxisFromString, offsetBefore, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ((((-1996871398) + (((~(iIdentityHashCode | (-442663242))) | (-686943412)) * (-465))) + (((-442663242) | (~((-686943412) | iIdentityHashCode))) * 930)) + ((iIdentityHashCode | (-140541954)) * 465)) - 1424773869;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            f(new char[]{45368, 53871, 8730, 4976, 45394, 44577, 55858, 26524, 16810, 48872, 52065, 30295, 20519, 36838, 64415, 17676, 25471, 40056, 59629, 21980}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            f(new char[]{33170, 39316, 42872, 14631, 33275, 58847, 24387, 19908, 29018, 62742, 19990, 23575, 24738, 50258, 32477, 28490, 21477, 55192, 28046, 32643}, 1 - TextUtils.indexOf("", ""), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1844138034};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 46038), (ViewConfiguration.getEdgeSlop() >> 16) + 1134, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1424773869, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 15;
                    byte[] bArr3 = $$d;
                    short s2 = bArr3[132];
                    byte b4 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    d(s2, b4, (byte) (b4 | 52), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, windowTouchSlop2, offsetBefore2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetBefore("", 0) + 45993), 1118 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i9 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
                    byte[] bArr4 = $$d;
                    Object[] objArr13 = new Object[1];
                    d((short) 103, bArr4[5], bArr4[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout2, i9, packedPositionGroup, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    f(new char[]{35359, 24840, 1246, 34497, 35454, 7497, 64740, 62014, 31436, 3466, 60832, 58278, 27400, 15580, 56614, 53399, 22610, 12056, 52792, 49253, 18562, 24148, 49148, 45523, 14800, 20152}, 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    f(new char[]{51663, 13325, 54904, 9389, 51626, 18510, 11847, 20560, 14592, 22659, 16134, 16822, 10450, 27083, 4034, 29404, 7058, 31235, 7311}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_1).substring(5, 6).codePointAt(0) - 31, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
                        int gidForName = Process.getGidForName("") + 16;
                        byte b5 = $$d[7];
                        Object[] objArr16 = new Object[1];
                        d((short) 51, b5, (byte) (b5 | 52), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout, scrollBarSize2, gidForName, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                        int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr5 = $$d;
                        short s3 = bArr5[132];
                        byte b6 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        d(s3, b6, (byte) (b6 | 52), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, i10, maxKeyCode, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                int i12 = i11 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
        int i14 = i13 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[3])[0];
        int i17 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i18 = ~System.identityHashCode(this);
        int i19 = i15 + 1416459213 + ((~((-532818) | i18)) * (-783)) + (((~(i18 | 193415694)) | (-50864476)) * 783);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
            int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int offsetAfter = 23 - TextUtils.getOffsetAfter("", 0);
            byte b7 = $$d[7];
            Object[] objArr19 = new Object[1];
            d((short) 103, b7, (byte) (b7 | 37), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, maximumFlingVelocity, offsetAfter, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
            int i23 = i22 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char offsetAfter2 = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
                int i24 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                byte b8 = $$d[7];
                Object[] objArr20 = new Object[1];
                d((short) 51, b8, (byte) (b8 | 52), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetAfter2, absoluteGravity, i24, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_scarf_text).substring(0, 4).length() + 95985976;
            int i25 = ((((-423213295) + (((~((-98890925) | length)) | 79958156) * 104)) + ((~((~length) | 132644269)) * (-104))) + ((length | 113711501) * 104)) - 1279665431;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            f(new char[]{45368, 53871, 8730, 4976, 45394, 44577, 55858, 26524, 16810, 48872, 52065, 30295, 20519, 36838, 64415, 17676, 25471, 40056, 59629, 21980}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            f(new char[]{33170, 39316, 42872, 14631, 33275, 58847, 24387, 19908, 29018, 62742, 19990, 23575, 24738, 50258, 32477, 28490, 21477, 55192, 28046, 32643}, 1 - TextUtils.indexOf("", "", 0), objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1844138034};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42048 - MotionEvent.axisFromString("")), 1726 - Color.red(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -1279665431);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int i28 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int keyRepeatDelay = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte b9 = $$d[7];
                Object[] objArr25 = new Object[1];
                d((short) 51, b9, (byte) (b9 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, i28, keyRepeatDelay, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                f(new char[]{35359, 24840, 1246, 34497, 35454, 7497, 64740, 62014, 31436, 3466, 60832, 58278, 27400, 15580, 56614, 53399, 22610, 12056, 52792, 49253, 18562, 24148, 49148, 45523, 14800, 20152}, View.MeasureSpec.getSize(0) + 1, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                f(new char[]{51663, 13325, 54904, 9389, 51626, 18510, 11847, 20560, 14592, 22659, 16134, 16822, 10450, 27083, 4034, 29404, 7058, 31235, 7311}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                    int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                    int iBlue = Color.blue(0) + 23;
                    byte b10 = $$d[7];
                    Object[] objArr28 = new Object[1];
                    d((short) 140, b10, (byte) (b10 | 52), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration, iResolveOpacity, iBlue, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                    int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                    byte b11 = $$d[7];
                    Object[] objArr29 = new Object[1];
                    d((short) 103, b11, (byte) (b11 | 37), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyPid, keyRepeatTimeout3, iIndexOf, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i30 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i30 == i29) {
            int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iNextInt = new Random().nextInt();
            int i32 = i31 + (((~(iNextInt | 867333736)) | (-654731311)) * 56) + 1713844337 + (((~((~iNextInt) | (-654731311))) | 867333736) * 56);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr30[3])[0] = i34 ^ (i34 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
        if (strArr4 != null) {
            int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i35 % 128;
            for (int i36 = i35 % 2 != 0 ? 1 : 0; i36 < strArr4.length; i36++) {
                arrayList2.add(strArr4[i36]);
            }
        }
        int[] iArr = new int[i30];
        int i37 = i30 - 1;
        iArr[i37] = 1;
        Toast.makeText((Context) null, iArr[((i30 * i37) % 2) - 1], 1).show();
        int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i39 = i38 + 1222751521 + (((~(753059381 | iElapsedRealtime)) | (-965661808)) * (-964)) + (((~((~iElapsedRealtime) | 753059381)) | (-1039062656)) * (-964));
        int i40 = (i39 << 13) ^ i39;
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr31[3])[0] = i41 ^ (i41 << 5);
    }

    @Override // com.google.android.libraries.places.internal.zzmy, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i4 != 2007683688 + ((1904731995 | iElapsedRealtime) * 376) + (((~((~iElapsedRealtime) | 672120418)) | 1367359769) * (-376)) + (((~(iElapsedRealtime | (-672120419))) | (-1502107962)) * 376)) {
            throw new RuntimeException("-1941207597");
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i6 = ~iIdentityHashCode;
        int i7 = ~(38867641 | i6);
        if (i5 != 1107953708 + (((-1792532478) | i7) * (-712)) + (((~(iIdentityHashCode | (-1753664837))) | (~(i6 | 1792532477))) * (-712)) + ((1754778972 | i7) * 712)) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            int[] iArr = new int[360426925];
            iArr[360426924] = 1;
            int i10 = (-1500145348) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
        }
        super.onResume();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f7, code lost:
    
        if (r1 != ((379255766 + (((~((~r2) | (-608175458))) | (-1970880508)) * (-591))) + ((r2 | (-608175458)) * 591))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f9, code lost:
    
        super.onStart();
        r1 = com.google.android.libraries.places.widget.BasicPlaceAutocompleteActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        com.google.android.libraries.places.widget.BasicPlaceAutocompleteActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0105, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0107, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0108, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0113, code lost:
    
        throw new java.lang.RuntimeException("125812613");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0114, code lost:
    
        r1 = 1997914374 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x011d, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0057, code lost:
    
        if (r1 == ((r9 + (r6 * (-245))) + ((r6 | 121000082) * 245))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b6, code lost:
    
        if (r1 == (((2002710656 + (((~(1136869911 | r7)) | (~((-1098989592) | r6))) * (-831))) + ((~(1405871959 | r6)) * (-1662))) + (((~(r6 | (-1136869912))) | ((~(r7 | (-306882369))) | (~(306882368 | r6)))) * 831))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b8, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1913045034;
     */
    @Override // com.google.android.libraries.places.internal.zzmy, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.BasicPlaceAutocompleteActivity.onStart():void");
    }

    static {
        b = 0;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new Companion(null);
        RESULT_ERROR = 2;
        RESULT_OK = -1;
        int i = TuitionPaymentFragmentbindingInflater1 + 33;
        b = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzmy, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1413142201330800201L;
    }

    private static String $$i(int i, int i2, byte b2) {
        byte[] bArr = $$c;
        int i3 = 3 - (b2 * 2);
        int i4 = (i2 * 3) + 107;
        int i5 = i * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 += -i3;
            i3 = i3;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            int i9 = i3 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i9];
            i3 = i9;
            i7 = i8;
        }
    }
}
