package com.google.android.libraries.places.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.R;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.internal.zzmy;
import com.google.android.libraries.places.widget.listener.PredictionSelectionListener;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/internal/autocomplete/base/BaseAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/listener/PredictionSelectionListener;", "<init>", "()V", "resultErrorStatus", "Lcom/google/android/gms/common/api/Status;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPredictionSelected", "prediction", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "onError", "errorStatus", "setTestFragmentFactory", "factory", "Landroidx/fragment/app/FragmentFactory;", "Companion", "java.com.google.android.libraries.places.widget_place_autocomplete_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlaceAutocompleteActivity extends zzmy implements PredictionSelectionListener {
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_ERROR;
    public static final int RESULT_OK;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private Status zzb;
    private static final byte[] $$c = {111, 40, 23, -13};
    private static final int $$f = 185;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {82, Base64.padSymbol, -66, -42, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = ModuleDescriptor.MODULE_VERSION;
    private static int d = 0;
    private static int g = 1;
    private static int asBinder = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.libraries.places.widget.PlaceAutocompleteActivity.$$d
            int r1 = 53 - r6
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = 145 - r8
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceAutocompleteActivity.f(short, byte, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.libraries.places.widget.listener.PredictionSelectionListener
    public final void onPredictionSelected(AutocompletePrediction prediction, AutocompleteSessionToken sessionToken) {
        int i = 2 % 2;
        int i2 = g + 83;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(prediction, "");
        Intrinsics.checkNotNullParameter(sessionToken, "");
        zzb(RESULT_OK, prediction, sessionToken, Status.RESULT_SUCCESS);
        int i4 = d + 97;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1018476341
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.google.android.libraries.places.internal.zzmy, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceAutocompleteActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r1 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        zzb(com.google.android.libraries.places.widget.PlaceAutocompleteActivity.RESULT_ERROR, null, null, r1);
        r3.zzb = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        zzb(com.google.android.libraries.places.widget.PlaceAutocompleteActivity.RESULT_CANCELED, null, null, r4);
        r4 = com.google.android.libraries.places.widget.PlaceAutocompleteActivity.d + 19;
        com.google.android.libraries.places.widget.PlaceAutocompleteActivity.g = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r3.zzb = r4;
        zzc(com.google.android.libraries.places.widget.PlaceAutocompleteActivity.RESULT_ERROR, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r4.isCanceled() != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r4.isCanceled() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r1 = com.google.android.libraries.places.widget.PlaceAutocompleteActivity.d + 61;
        com.google.android.libraries.places.widget.PlaceAutocompleteActivity.g = r1 % 128;
        r1 = r1 % 2;
        r1 = r3.zzb;
     */
    @Override // com.google.android.libraries.places.widget.listener.PredictionSelectionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.widget.PlaceAutocompleteActivity.g
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.google.android.libraries.places.widget.PlaceAutocompleteActivity.d = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            boolean r1 = r4.isCanceled()
            r2 = 86
            int r2 = r2 / 0
            r2 = 1
            if (r1 == r2) goto L28
            goto L4d
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            boolean r1 = r4.isCanceled()
            if (r1 == 0) goto L4d
        L28:
            int r1 = com.google.android.libraries.places.widget.PlaceAutocompleteActivity.d
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.google.android.libraries.places.widget.PlaceAutocompleteActivity.g = r2
            int r1 = r1 % r0
            com.google.android.gms.common.api.Status r1 = r3.zzb
            r2 = 0
            if (r1 == 0) goto L3e
            int r4 = com.google.android.libraries.places.widget.PlaceAutocompleteActivity.RESULT_ERROR
            r3.zzb(r4, r2, r2, r1)
            r3.zzb = r2
            return
        L3e:
            int r1 = com.google.android.libraries.places.widget.PlaceAutocompleteActivity.RESULT_CANCELED
            r3.zzb(r1, r2, r2, r4)
            int r4 = com.google.android.libraries.places.widget.PlaceAutocompleteActivity.d
            int r4 = r4 + 19
            int r1 = r4 % 128
            com.google.android.libraries.places.widget.PlaceAutocompleteActivity.g = r1
            int r4 = r4 % r0
            return
        L4d:
            r3.zzb = r4
            int r0 = com.google.android.libraries.places.widget.PlaceAutocompleteActivity.RESULT_ERROR
            r3.zzc(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceAutocompleteActivity.onError(com.google.android.gms.common.api.Status):void");
    }

    @Override // com.google.android.libraries.places.internal.zzmy, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1032;
            int i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
            byte[] bArr = $$d;
            byte b2 = bArr[7];
            byte b3 = bArr[132];
            Object[] objArr2 = new Object[1];
            f(b2, b3, (short) (b3 | 140), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iLastIndexOf, i3, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        h(new char[]{57695, 23462, 51294, 46414, 62853, 30440, 14838, 22728, 60447, 57651, 60941, 33221, 29313, 48540, 37576, 44125, 6532, 35751, 51218, 2941, 41308, 28956, 45642, 51266}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        h(new char[]{2821, 16867, 54724, 14806, 43169, 48266, 54473, 63866, 38062, 41400, 61530, 11414, 39644, 35726, 30559, 5069, 8681, 17332}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int i4 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte[] bArr2 = $$d;
            byte b4 = bArr2[7];
            byte b5 = bArr2[132];
            Object[] objArr5 = new Object[1];
            f(b4, b5, (short) (b5 | 88), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, i4, fadingEdgeLength, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 15;
                byte b6 = $$d[7];
                Object[] objArr6 = new Object[1];
                f((byte) 52, b6, (short) (b6 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, absoluteGravity, packedPositionType, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iMyTid = Process.myTid();
            int i7 = ~((-553648145) | iMyTid);
            int i8 = ~iMyTid;
            int i9 = (((-618658912) + ((i7 | (~(930321854 | i8))) * 497)) + (((~(iMyTid | 930321854)) | ((~((-620953881) | i8)) | 67305736)) * 497)) - 822256164;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            h(new char[]{26713, 38547, 31853, 43967, 47006, 40405, 3602, 34460, 38170, 36813, 49713, 53021, 36756, 30192, 1777, 20671, 42030, 46478}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_encryption_error_null_object).substring(0, 36).length() - 20, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            h(new char[]{64827, 32780, 49682, 18721, 48953, 51842, 48838, 55083, 9351, 34933, 38346, 47272, 40831, 62273, 42166, 12264, 1407, 47346}, (ViewConfiguration.getLongPressTimeout() >> 16) + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1726337474};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1134, 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -822256164, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                    int mirror = '?' - AndroidCharacter.getMirror('0');
                    byte[] bArr3 = $$d;
                    byte b7 = bArr3[7];
                    byte b8 = bArr3[132];
                    Object[] objArr12 = new Object[1];
                    f(b7, b8, (short) (b8 | 140), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(size, scrollBarFadeDuration, mirror, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 45994), ExpandableListView.getPackedPositionGroup(0L) + 1117, 17 - (KeyEvent.getMaxKeyCode() >> 16)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                    int i12 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b9 = $$d[7];
                    Object[] objArr13 = new Object[1];
                    f((byte) 52, b9, (short) (b9 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, iNormalizeMetaState, i12, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    h(new char[]{57695, 23462, 51294, 46414, 62853, 30440, 14838, 22728, 60447, 57651, 60941, 33221, 29313, 48540, 37576, 44125, 6532, 35751, 51218, 2941, 41308, 28956, 45642, 51266}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    h(new char[]{2821, 16867, 54724, 14806, 43169, 48266, 54473, 63866, 38062, 41400, 61530, 11414, 39644, 35726, 30559, 5069, 8681, 17332}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int offsetBefore = 1031 - TextUtils.getOffsetBefore("", 0);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
                        byte[] bArr4 = $$d;
                        byte b10 = bArr4[7];
                        byte b11 = bArr4[132];
                        Object[] objArr16 = new Object[1];
                        f(b10, b11, (short) (b11 | 88), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, offsetBefore, iLastIndexOf2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                        int iMyTid2 = (Process.myTid() >> 22) + 1031;
                        int iArgb = Color.argb(0, 0, 0, 0) + 15;
                        byte[] bArr5 = $$d;
                        byte b12 = bArr5[7];
                        byte b13 = bArr5[132];
                        Object[] objArr17 = new Object[1];
                        f(b12, b13, (short) (b13 | 140), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionChild, iMyTid2, iArgb, 1357589585, false, (String) objArr17[0], null);
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
            if (strArr2 == null) {
                throw null;
            }
            int i13 = g;
            int i14 = i13 + 23;
            d = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 11;
            d = i16 % 128;
            int i17 = i16 % 2;
            while (i2 < strArr2.length) {
                int i18 = d + 117;
                g = i18 % 128;
                if (i18 % 2 == 0) {
                    arrayList.add(strArr2[i2]);
                    i2 += 11;
                } else {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i23 = ~i22;
        int i24 = i19 + (-98567639) + ((222300513 | i23) * (-192)) + (((~(256380407 | i23)) | 278360064) * (-384)) + (((~(i22 | (-34079895))) | (~(i23 | 534740471)) | (~((-278360065) | i22))) * DerHeader.TAG_CLASS_PRIVATE);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr18[2])[0] = i26 ^ (i26 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
            int iKeyCodeFromString = 23 - KeyEvent.keyCodeFromString("");
            byte[] bArr6 = $$d;
            byte b14 = (byte) (bArr6[33] - 1);
            byte b15 = bArr6[132];
            Object[] objArr19 = new Object[1];
            f(b14, b15, (short) (b15 | 36), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, jumpTapTimeout2, iKeyCodeFromString, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cBlue = (char) (Color.blue(0) + 29944);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
                byte[] bArr7 = $$d;
                byte b16 = bArr7[7];
                byte b17 = bArr7[132];
                Object[] objArr20 = new Object[1];
                f(b16, b17, (short) (b17 | 88), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cBlue, iIndexOf, bitsPerPixel, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i27 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{i27}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int i28 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i29 = 370336724 + (((-721551745) | i28) * (-627)) + (((~(790758818 | i28)) | 1003361244) * (-627)) + (((~(i28 | 1003361244)) | (~((~i28) | (-790758819)))) * 627) + 498354015;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            h(new char[]{26713, 38547, 31853, 43967, 47006, 40405, 3602, 34460, 38170, 36813, 49713, 53021, 36756, 30192, 1777, 20671, 42030, 46478}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 82, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            h(new char[]{64827, 32780, 49682, 18721, 48953, 51842, 48838, 55083, 9351, 34933, 38346, 47272, 40831, 62273, 42166, 12264, 1407, 47346}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.timeout_message).substring(3, 4).length() + 15, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1726337474};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42048), 1726 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 29 - View.getDefaultSize(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 498354015);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMakeMeasureSpec2 = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr8 = $$d;
                byte b18 = bArr8[7];
                byte b19 = bArr8[132];
                Object[] objArr25 = new Object[1];
                f(b18, b19, (short) (b19 | 88), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMakeMeasureSpec2, windowTouchSlop, scrollDefaultDelay, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                h(new char[]{57695, 23462, 51294, 46414, 62853, 30440, 14838, 22728, 60447, 57651, 60941, 33221, 29313, 48540, 37576, 44125, 6532, 35751, 51218, 2941, 41308, 28956, 45642, 51266}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                h(new char[]{2821, 16867, 54724, 14806, 43169, 48266, 54473, 63866, 38062, 41400, 61530, 11414, 39644, 35726, 30559, 5069, 8681, 17332}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 23;
                    byte[] bArr9 = $$d;
                    byte b20 = bArr9[7];
                    Object[] objArr28 = new Object[1];
                    f(b20, bArr9[132], b20, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, iIndexOf2, offsetBefore2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cRed = (char) (29944 - Color.red(0));
                    int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iAxisFromString = 22 - MotionEvent.axisFromString("");
                    byte[] bArr10 = $$d;
                    byte b21 = (byte) (bArr10[33] - 1);
                    byte b22 = bArr10[132];
                    Object[] objArr29 = new Object[1];
                    f(b21, b22, (short) (b22 | 36), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cRed, maximumFlingVelocity, iAxisFromString, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr4 == null) {
                throw null;
            }
            while (i2 < strArr4.length) {
                arrayList2.add(strArr4[i2]);
                i2++;
            }
            throw null;
        }
        int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        int i33 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        Object[] objArr30 = {new int[]{i33}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 1582288161;
        int i34 = ~iCodePointAt;
        int i35 = ~(868111259 | i34);
        int i36 = i32 + 2021822097 + (((-935221244) | i35) * (-712)) + (((~(iCodePointAt | (-67109985))) | (~(i34 | 935221243))) * (-712)) + ((655508833 | i35) * 712);
        int i37 = (i36 << 13) ^ i36;
        int i38 = i37 ^ (i37 >>> 17);
        ((int[]) objArr30[3])[0] = i38 ^ (i38 << 5);
    }

    private static void h(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                int i5 = $10 + 5;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            int i7 = $10 + 59;
            $11 = i7 % 128;
            int i8 = 58224;
            char c = 1;
            if (i7 % 2 == 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                int i9 = oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr3[0] = cArr[0];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i10 = $10 + 95;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                int i12 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[c] = Integer.valueOf(i12);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) (47773 - (TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int capsMode = 468 - TextUtils.getCapsMode("", i4, i4);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 14;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, capsMode, packedPositionChild, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.getDefaultSize(0, 0) + 47773), (ViewConfiguration.getPressedStateDuration() >> 16) + 468, 13 - (ViewConfiguration.getScrollBarSize() >> 8), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    i4 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2324 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 44, -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -991674863
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.google.android.libraries.places.internal.zzmy, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceAutocompleteActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1701694926
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.google.android.libraries.places.internal.zzmy, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceAutocompleteActivity.onStart():void");
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        RESULT_ERROR = 2;
        RESULT_OK = -1;
        int i = asBinder + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzmy, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = d + 9;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = (char) 53195;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 46943;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 65121;
        b = (char) 7536;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = com.google.android.libraries.places.widget.PlaceAutocompleteActivity.$$c
            int r8 = r8 * 4
            int r8 = 108 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2d:
            int r3 = -r3
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceAutocompleteActivity.$$i(byte, byte, short):java.lang.String");
    }
}
