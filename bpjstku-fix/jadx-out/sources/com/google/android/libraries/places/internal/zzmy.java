package com.google.android.libraries.places.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes6.dex */
public class zzmy extends AppCompatActivity {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$g;
    private static final int $$h;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    public BaseAutocompleteImplFragment zza;
    private int zzb;

    public zzmy() {
        super(R.layout.autocomplete_activity);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 1
            int r6 = r6 + 4
            byte[] r0 = com.google.android.libraries.places.internal.zzmy.$$a
            int r8 = r8 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L11:
            r3 = r2
        L12:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmy.c(int, byte, short, java.lang.Object[]):void");
    }

    private static void e(int i, short s, short s2, Object[] objArr) {
        int i2 = 556 - i;
        int i3 = s + 66;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[s2 + 20];
        int i4 = s2 + 19;
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = i2 + i3 + 2;
        }
        while (true) {
            int i6 = i3;
            int i7 = i2;
            i5++;
            bArr2[i5] = (byte) i6;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i7 + 1;
                i3 = i6 + bArr[i7] + 2;
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 47;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 2624 - View.resolveSize(0, 0), 13 - ((Process.getThreadPriority(0) + 20) >> 6), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() * (TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 39423), 481 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - KeyEvent.keyCodeFromString("")), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2624, 13 - KeyEvent.keyCodeFromString(""), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (9053247990562531611L ^ TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 39423), 480 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 37 - TextUtils.getTrimmedLength(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - (ViewConfiguration.getScrollBarSize() >> 8)), (Process.myPid() >> 22) + 481, ImageFormat.getBitsPerPixel(0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            int i6 = $11 + 103;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
        int i8 = $10 + 89;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public final void zzc(int i, Status status) {
        int i2 = 2 % 2;
        try {
            Intent intent = new Intent();
            intent.putExtra("places/status", status);
            setResult(i, intent);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            b = i3 % 128;
            int i4 = i3 % 2;
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public final void zza(int i, Place place, Status status) {
        int i2 = 2 % 2;
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i, intent);
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
            Object obj = null;
            if (baseAutocompleteImplFragment != null) {
                int i3 = b + 89;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                if (i3 % 2 != 0) {
                    baseAutocompleteImplFragment.zza();
                    throw null;
                }
                baseAutocompleteImplFragment.zza();
            }
            finish();
            int i4 = b + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public final void zzb(int i, AutocompletePrediction autocompletePrediction, AutocompleteSessionToken autocompleteSessionToken, Status status) {
        int i2 = 2 % 2;
        try {
            Intent intent = new Intent();
            if (autocompletePrediction != null) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (autocompleteSessionToken != null) {
                    intent.putExtra("places/selected_prediction", autocompletePrediction);
                    intent.putExtra("places/session_token", autocompleteSessionToken);
                }
            }
            intent.putExtra("places/status", status);
            setResult(i, intent);
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
            if (baseAutocompleteImplFragment != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                b = i4 % 128;
                int i5 = i4 % 2;
                baseAutocompleteImplFragment.zza();
                int i6 = b + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
            }
            finish();
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        String str;
        String str2;
        Object[] objArr;
        int i;
        String str3;
        String str4;
        Object[] objArr2;
        char c;
        Object[] objArr3;
        Object[] objArr4;
        int i2;
        String str5;
        Object[] objArr5;
        String str6;
        Object[] objArr6;
        Object[] objArr7;
        int i3;
        char c2;
        String str7;
        Object[] objArr8;
        String str8;
        Object[] objArr9;
        Object[] objArr10;
        int i4;
        String str9;
        Object[] objArr11;
        int i5;
        Object[] objArr12;
        String str10;
        Object[] objArr13;
        int i6 = 2 % 2;
        Object[] objArr14 = new Object[1];
        a(new char[]{20666, 14754, 33425, 27628, 62696, 24001, 9781, 36692, 6156, 57703, 18963, 54133, 48566, 1667, 61421, 30951, 49606, 43551, 13097, 39937, 25972, 52819}, View.MeasureSpec.makeMeasureSpec(0, 0) + 26903, objArr14);
        String str11 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a(new char[]{20670, 56896, 19796, 64590, 27508, 39533, 2421, 47176, 9990, 22037, 50449, 29746, 58150, 4669, 33084}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_sdk_general_error).substring(0, 45).codePointAt(5) + 36499, objArr15);
        String str12 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        a(new char[]{20657, 4173, 53571, 37471, 21289, 5220, 54640, 38516, 22276, 6234, 55598, 39487, 23356, 7204, 56636, 40655}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 16595, objArr16);
        String str13 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        a(new char[]{20658, 13332, 39400, 32436, 49667, 42981, 3245, 36879, 30155, 55993, 48646, 1002, 59548, 19483, 53733, 46779}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 25760, objArr17);
        String str14 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        a(new char[]{20666, 3974, 61145, 19760, 11384, 35661, 27533, 51856, 43298, 2144, 59221, 18372, 9982, 34095, 25701, 49999, 41885, 721, 57657, 16491, 16243, 40860, 32459, 56619, 48242, 6980}, (ViewConfiguration.getTapTimeout() >> 16) + 24371, objArr18);
        String str15 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        a(new char[]{20664, 16059, 35971, 6806, 59626, 30428, 50385, 21001, 8195, 36374, 7269, 59989, 30788, 51115, 21897, 9097, 45540, 8144}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.gopay_expiration_message).substring(3, 4).codePointAt(0) + 28084, objArr19);
        String str16 = (String) objArr19[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 37568);
            int iNormalizeMetaState = 625 - KeyEvent.normalizeMetaState(0);
            int mode = 14 - View.MeasureSpec.getMode(0);
            byte[] bArr = $$a;
            short s = bArr[132];
            byte b2 = bArr[7];
            Object[] objArr20 = new Object[1];
            c(s, b2, (byte) (b2 | 14), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iNormalizeMetaState, mode, -477065106, false, (String) objArr20[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetBefore = (char) (37567 - TextUtils.getOffsetBefore("", 0));
            int scrollBarFadeDuration = 625 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i7 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr2 = $$a;
            short s2 = bArr2[132];
            Object[] objArr21 = new Object[1];
            c(s2, (byte) (s2 & 52), bArr2[7], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, scrollBarFadeDuration, i7, -976899241, false, (String) objArr21[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i8 = b + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char windowTouchSlop = (char) (37567 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                int deadChar = 625 - KeyEvent.getDeadChar(0, 0);
                int longPressTimeout = 14 - (ViewConfiguration.getLongPressTimeout() >> 16);
                short s3 = (short) 51;
                Object[] objArr22 = new Object[1];
                c(s3, (byte) (s3 + 1), $$a[7], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, deadChar, longPressTimeout, -973632554, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i10 = ((int[]) objArr23[2])[0];
            int i11 = ((int[]) objArr23[0])[0];
            String[] strArr = (String[]) objArr23[3];
            int[] iArr = {i10};
            int iIdentityHashCode = System.identityHashCode(this);
            int i12 = (-1001994936) + (((-1790175431) | iIdentityHashCode) * 376) + (((~((~iIdentityHashCode) | 184694823)) | (-1806956776)) * (-376)) + (((~(iIdentityHashCode | (-184694824))) | 1639043297) * 376) + 1266494680;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[1])[0] = i14 ^ (i14 << 5);
            objArr = new Object[]{new int[]{i11}, new int[1], iArr, strArr};
            i = 0;
            str14 = str14;
            str2 = "currentApplication";
            str = "";
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str15).getMethod(str16, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue();
            str = r6;
            Object[] objArr24 = new Object[1];
            a(new char[]{20713, 28113, 10851, 59639, 42246, 25490, 8231, 65252, 48026, 30810, 14059, 62251, 45450, 19997, 3240, 51567, 34332, 17589, 291, 57219, 40002, 23287, 5990, 54336, 37590, 44859, 28159, 10847, 59596, 42284, 25581, 8339, 64770, 48117, 30807, 14031, 62326, 45537, 20121, 2899, 51685, 34345, 17625, 326, 57257, 39997, 22810, 6031, 54378, 37588, 44877, 28071, 10851, 59160, 42371, 25184, 8362, 64852, 48073, 30764, 14013, 62414, 45067, 20200}, TextUtils.lastIndexOf(str, '0') + 15728, objArr24);
            String str17 = (String) objArr24[0];
            str2 = r10;
            Object[] objArr25 = new Object[1];
            a(new char[]{20664, 38845, 57009, 1528, 19703, 46029, 64147, 8669, 26758, 44930, 38573, 56820, 1258, 19378, 45791, 63878, 8345, 26527, 44691, 38253, 56418, 895, 18983, 45388, 63505, 16192, 26127, 44383, 37932, 56105, 560, 18746, 45058, 63326, 15872, 25887, 44051, 38077, 56240, 760, 18929, 45217, 63387, 16064, 26072, 44244, 37802, 55969, 434, 18671, 36796, 63111, 15829, 25756, 43922, 37480, 55600, '2', 18303, 36466, 62750, 15424, 25439, 43524}, ((Context) Class.forName(r7).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 50915, objArr25);
            try {
                Object[] objArr26 = {baseContext, new String[]{str17, (String) objArr25[0]}, Integer.valueOf(iIntValue), 17, 1266494680};
                byte[] bArr3 = $$g;
                Object[] objArr27 = new Object[1];
                e((short) 552, bArr3[26], bArr3[34], objArr27);
                Class<?> cls = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e((short) 524, bArr3[80], (byte) (-bArr3[11]), objArr28);
                Object[] objArr29 = (Object[]) cls.getMethod((String) objArr28[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr26);
                int i15 = ((int[]) objArr29[0])[0];
                int i16 = ((int[]) objArr29[2])[0];
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37566);
                        int iIndexOf = TextUtils.indexOf(str, str, 0) + 625;
                        int deadChar2 = KeyEvent.getDeadChar(0, 0) + 14;
                        short s4 = (short) 51;
                        Object[] objArr30 = new Object[1];
                        c(s4, (byte) (s4 + 1), $$a[7], objArr30);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iIndexOf, deadChar2, -973632554, false, (String) objArr30[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr29);
                    try {
                        str12 = str12;
                        long jLongValue2 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char defaultSize = (char) (View.getDefaultSize(0, 0) + 37567);
                            int iBlue = 625 - Color.blue(0);
                            int trimmedLength = 14 - TextUtils.getTrimmedLength(str);
                            byte[] bArr4 = $$a;
                            short s5 = bArr4[132];
                            Object[] objArr31 = new Object[1];
                            c(s5, (byte) (s5 & 52), bArr4[7], objArr31);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, iBlue, trimmedLength, -976899241, false, (String) objArr31[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c4 = (char) (37568 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int touchSlop = 625 - (ViewConfiguration.getTouchSlop() >> 8);
                            int iGreen = Color.green(0) + 14;
                            byte[] bArr5 = $$a;
                            short s6 = bArr5[132];
                            byte b3 = bArr5[7];
                            Object[] objArr32 = new Object[1];
                            c(s6, b3, (byte) (b3 | 14), objArr32);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, touchSlop, iGreen, -477065106, false, (String) objArr32[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr29 = objArr29;
                    str14 = str14;
                }
                objArr = objArr29;
                i = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i17 = ((int[]) objArr[i])[i];
        int i18 = ((int[]) objArr[2])[i];
        if (i18 != i17) {
            int i19 = i;
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
                b = i20 % 128;
                int i21 = i20 % 2;
                for (int i22 = i19; i22 < strArr2.length; i22++) {
                    arrayList.add(strArr2[i22]);
                }
            }
            throw new RuntimeException(String.valueOf(i18));
        }
        Object[] objArr33 = new Object[4];
        int[] iArr2 = new int[1];
        objArr33[i] = iArr2;
        objArr33[1] = new int[1];
        int[] iArr3 = new int[1];
        objArr33[2] = iArr3;
        int i23 = ((int[]) objArr[1])[i];
        int i24 = ((int[]) objArr[2])[i];
        int i25 = ((int[]) objArr[i])[i];
        String[] strArr3 = (String[]) objArr[3];
        iArr3[i] = i24;
        iArr2[i] = i25;
        int iCodePointAt = ((Context) Class.forName(r7).getMethod(str2, new Class[i]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.minutes).substring(i, 1).codePointAt(i) - 1661181537;
        int i26 = i23 + ((~((~iCodePointAt) | (-1610622497))) * 130) + 1096853304 + (((~(iCodePointAt | (-1610622497))) | 179032264) * 130);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr33[1])[0] = i28 ^ (i28 << 5);
        objArr33[3] = strArr3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cGreen = (char) (53893 - Color.green(0));
            int scrollDefaultDelay = 1320 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int offsetAfter = 36 - TextUtils.getOffsetAfter(str, 0);
            byte[] bArr6 = $$a;
            short s7 = bArr6[132];
            byte b4 = bArr6[7];
            Object[] objArr34 = new Object[1];
            c(s7, b4, (byte) (b4 | 14), objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cGreen, scrollDefaultDelay, offsetAfter, -1433084963, false, (String) objArr34[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf(str, '0', 0, 0) + 53894);
                int iGreen2 = Color.green(0) + 1320;
                int size = View.MeasureSpec.getSize(0) + 36;
                short s8 = (short) 51;
                Object[] objArr35 = new Object[1];
                c(s8, (byte) (s8 + 1), $$a[7], objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf2, iGreen2, size, -1920778747, false, (String) objArr35[0], null);
            }
            Object[] objArr36 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr2 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i29 = ((int[]) objArr36[0])[0];
            int i30 = ((int[]) objArr36[3])[0];
            String[] strArr4 = (String[]) objArr36[2];
            int i31 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 712582094;
            int i32 = ~i31;
            int i33 = (((-212402462) + (((~((-670376552) | i32)) | (~((-700251274) | i31))) * 210)) + (((~(i31 | (-104923751))) | (~(i32 | (-134798473)))) * 210)) - 1352845183;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr2[1])[0] = i35 ^ (i35 << 5);
            objArr33 = objArr33;
            str15 = str15;
            str3 = str14;
            str4 = str12;
            c = 3;
            str16 = str16;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                int i36 = b + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i36 % 128;
                int i37 = i36 % 2;
                baseContext2 = (Context) Class.forName(str15).getMethod(str16, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            str3 = str14;
            int iIntValue2 = ((Integer) Class.forName(str13).getMethod(str3, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr37 = {-1601650910};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (47977 - Color.red(0)), 1300 - ExpandableListView.getPackedPositionGroup(0L), View.MeasureSpec.getSize(0) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr38 = {baseContext2, "com.bpjstku", -1352845183, Integer.valueOf(iIntValue2), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr37), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char size2 = (char) (53893 - View.MeasureSpec.getSize(0));
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1320;
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 36;
                    short s9 = (short) 51;
                    Object[] objArr39 = new Object[1];
                    c(s9, (byte) (s9 + 1), $$a[7], objArr39);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(size2, packedPositionGroup, scrollBarSize, 819724799, false, (String) objArr39[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getDeadChar(0, 0) + 57878), 1394 - TextUtils.getOffsetBefore(str, 0), 76 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Boolean.TYPE});
                }
                Object[] objArr40 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr38);
                if (baseContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char gidForName = (char) (Process.getGidForName(str) + 53894);
                        int gidForName2 = 1319 - Process.getGidForName(str);
                        int windowTouchSlop2 = 36 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        short s10 = (short) 51;
                        Object[] objArr41 = new Object[1];
                        c(s10, (byte) (s10 + 1), $$a[7], objArr41);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(gidForName, gidForName2, windowTouchSlop2, -1920778747, false, (String) objArr41[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr40);
                    try {
                        str4 = str12;
                        long jLongValue3 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char doubleTapTimeout = (char) (53893 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int i38 = 1320 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i39 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 36;
                            short s11 = (short) 103;
                            Object[] objArr42 = new Object[1];
                            c(s11, (byte) (s11 & 189), $$a[7], objArr42);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(doubleTapTimeout, i38, i39, -1273706634, false, (String) objArr42[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char touchSlop2 = (char) (53893 - (ViewConfiguration.getTouchSlop() >> 8));
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) str, '0', 0) + 1321;
                            int scrollDefaultDelay2 = 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            byte[] bArr7 = $$a;
                            short s12 = bArr7[132];
                            byte b5 = bArr7[7];
                            Object[] objArr43 = new Object[1];
                            c(s12, b5, (byte) (b5 | 14), objArr43);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(touchSlop2, iIndexOf2, scrollDefaultDelay2, -1433084963, false, (String) objArr43[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    str16 = str16;
                    objArr40 = objArr40;
                    str15 = str15;
                    str4 = str12;
                }
                objArr2 = objArr40;
                c = 3;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i40 = ((int[]) objArr2[c])[0];
        int i41 = ((int[]) objArr2[0])[0];
        if (i41 != i40) {
            throw new RuntimeException(String.valueOf(i41));
        }
        Object[] objArr44 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i42 = ((int[]) objArr2[1])[0];
        int i43 = ((int[]) objArr2[0])[0];
        int i44 = ((int[]) objArr2[3])[0];
        String[] strArr5 = (String[]) objArr2[2];
        int i45 = ~(((Context) Class.forName(r7).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_canceled).substring(13, 14).length() + 1983187559);
        int i46 = ~(359788377 | i45);
        int i47 = i42 + (-1298374844) + ((i46 | 1010839447) * 764) + (((~(i45 | 1010839447)) | 20037704) * (-1528)) + ((691126478 | i46) * 764);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr44[1])[0] = i49 ^ (i49 << 5);
        int i50 = b + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i50 % 128;
        int i51 = i50 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char cArgb = (char) (29944 - Color.argb(0, 0, 0, 0));
            int iArgb = 1755 - Color.argb(0, 0, 0, 0);
            int pressedStateDuration = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
            short s13 = (short) 103;
            Object[] objArr45 = new Object[1];
            c(s13, (byte) (s13 & 189), $$a[7], objArr45);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cArgb, iArgb, pressedStateDuration, 986134021, false, (String) objArr45[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) != -1) {
            int i52 = b + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i52 % 128;
            int i53 = i52 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                short s14 = (short) 51;
                Object[] objArr46 = new Object[1];
                c(s14, (byte) (s14 + 1), $$a[7], objArr46);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(packedPositionType, keyRepeatDelay, iCombineMeasuredStates, 1599039318, false, (String) objArr46[0], null);
            }
            Object[] objArr47 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr47[0])[0]}, new int[]{((int[]) objArr47[1])[0]}, (Object[]) objArr47[2], new int[1], (String[]) objArr47[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i54 = ~iUptimeMillis;
            int i55 = (-879197233) + (((~((-286142149) | i54)) | (-73539723)) * (-602)) + (((~(iUptimeMillis | (-286142149))) | 286002756 | (~((-73400331) | i54))) * (-301)) + ((~(i54 | (-73539723))) * 301) + 1284461783;
            int i56 = (i55 << 13) ^ i55;
            int i57 = i56 ^ (i56 >>> 17);
            ((int[]) objArr3[3])[0] = i57 ^ (i57 << 5);
            str3 = str3;
        } else {
            int iIntValue3 = ((Integer) Class.forName(str13).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr48 = {-1601650910};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b((char) (Color.green(0) + 42049), ExpandableListView.getPackedPositionChild(0L) + 1727, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue3, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).newInstance(objArr48), 1284461783, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                int iRed = Color.red(0) + 1755;
                int iIndexOf3 = TextUtils.indexOf(str, str, 0) + 23;
                short s15 = (short) 51;
                Object[] objArr49 = new Object[1];
                c(s15, (byte) (s15 + 1), $$a[7], objArr49);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(packedPositionType2, iRed, iIndexOf3, 1599039318, false, (String) objArr49[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, objArrB$7879113);
            try {
                long jLongValue4 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char c5 = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) str, '0', 0) + 24;
                    Object[] objArr50 = new Object[1];
                    c((short) 140, (byte) ($$b & 62), $$a[7], objArr50);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c5, jumpTapTimeout, iIndexOf4, 1596667560, false, (String) objArr50[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char pressedStateDuration2 = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int iRed2 = 1755 - Color.red(0);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                    short s16 = (short) 103;
                    Object[] objArr51 = new Object[1];
                    c(s16, (byte) (s16 & 189), $$a[7], objArr51);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(pressedStateDuration2, iRed2, edgeSlop, 986134021, false, (String) objArr51[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf6);
                objArr3 = objArrB$7879113;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i58 = ((int[]) objArr3[1])[0];
        int i59 = ((int[]) objArr3[0])[0];
        if (i59 == i58) {
            int i60 = ((int[]) objArr3[3])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
            int iMyPid = Process.myPid();
            int i61 = ~iMyPid;
            int i62 = i60 + (-1144866607) + (((~(389858054 | i61)) | 549457984) * 168) + ((~((-549457985) | iMyPid)) * 168) + (((~(iMyPid | 939316038)) | (~(i61 | (-602460481))) | 53002496) * 168);
            int i63 = (i62 << 13) ^ i62;
            int i64 = i63 ^ (i63 >>> 17);
            i2 = 0;
            ((int[]) objArr4[3])[0] = i64 ^ (i64 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr6 = (String[]) objArr3[4];
            if (strArr6 != null) {
                int i65 = b + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i65 % 128;
                int i66 = i65 % 2;
                for (String str18 : strArr6) {
                    arrayList2.add(str18);
                }
            }
            int[] iArr4 = new int[i59];
            int i67 = i59 - 1;
            iArr4[i67] = 1;
            Toast.makeText((Context) null, iArr4[((i59 * i67) % 2) - 1], 1).show();
            int i68 = ((int[]) objArr3[3])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
            int i69 = ((Context) Class.forName(r7).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i70 = ~i69;
            int i71 = (~((-109846326) | i70)) | 101453572;
            int i72 = ~(i69 | 111148853);
            int i73 = i68 + (-397311983) + ((i71 | i72) * (-502)) + ((i72 | (~(i70 | (-8392754)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i74 = (i73 << 13) ^ i73;
            int i75 = i74 ^ (i74 >>> 17);
            i2 = 0;
            ((int[]) objArr4[3])[0] = i75 ^ (i75 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b((char) (46400 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.indexOf(str, str, i2, i2) + 40, (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b((char) (46400 - TextUtils.getTrimmedLength(str)), 40 - TextUtils.getOffsetBefore(str, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(obj, null);
        try {
            boolean zIsInitialized = Places.isInitialized();
            int i76 = ((int[]) objArr44[1])[0];
            int i77 = i76 * i76;
            int i78 = -(119714933 * i76);
            int i79 = (i77 ^ i78) + ((i77 & i78) << 1);
            int i80 = -(i76 * (-677121107));
            int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
            int i82 = ((i81 | (-557766367)) << 1) - ((-557766367) ^ i81);
            int i83 = (((i82 >> 25) - 255) / 128) + 1;
            int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
            int i85 = i82 >> 17;
            int i86 = (((-65535) & i85) + (i85 | (-65535))) / 32768;
            int i87 = -(i84 ^ ((i86 ^ 1) + ((i86 & 1) << 1)));
            int i88 = ((i87 | 5) << 1) - (i87 ^ 5);
            int i89 = i88 >> 25;
            int i90 = ((i89 & (-255)) + (i89 | (-255))) / 128;
            int i91 = ((i90 | 1) << 1) - (i90 ^ 1);
            String strSubstring = "16\\21\\6\\22\\Places must be initialized.".substring(41305 / (((-((i91 ^ 1) + ((i91 & 1) << 1))) & i88) * 751));
            if (!zIsInitialized) {
                throw new IllegalStateException(String.valueOf(strSubstring));
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int i92 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                int iIndexOf5 = 10 - TextUtils.indexOf(str, str);
                short s17 = (short) ($$b & 960);
                byte[] bArr8 = $$a;
                Object[] objArr52 = new Object[1];
                c(s17, (byte) (-bArr8[9]), (byte) (-bArr8[205]), objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cCombineMeasuredStates, i92, iIndexOf5, -1199417970, false, (String) objArr52[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null);
            long jLongValue5 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char c6 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int size3 = View.MeasureSpec.getSize(0) + 876;
                int iAxisFromString = MotionEvent.axisFromString(str) + 11;
                byte[] bArr9 = $$a;
                Object[] objArr53 = new Object[1];
                c((short) 202, bArr9[7], (byte) (-bArr9[33]), objArr53);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(c6, size3, iAxisFromString, 254769921, false, (String) objArr53[0], null);
            }
            if (j2 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char c7 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i93 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                    int i94 = 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr10 = $$a;
                    Object[] objArr54 = new Object[1];
                    c((short) 202, bArr10[129], (byte) (-bArr10[205]), objArr54);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c7, i93, i94, 1324201839, false, (String) objArr54[0], null);
                }
                Object[] objArr55 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).get(null);
                objArr5 = new Object[]{new int[]{((int[]) objArr55[0])[0]}, new int[1], new int[]{((int[]) objArr55[2])[0]}, (String[]) objArr55[3]};
                int iCodePointAt2 = ((Context) Class.forName(r7).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 713270969;
                int i95 = ~((-798348758) | (~iCodePointAt2));
                int i96 = (((((-801101270) | i95) | (~(798348757 | iCodePointAt2))) * (-338)) - 148979384) + (((~(iCodePointAt2 | (-2752513))) | i95) * 338) + 1108935604;
                int i97 = (i96 << 13) ^ i96;
                int i98 = i97 ^ (i97 >>> 17);
                ((int[]) objArr5[1])[0] = i98 ^ (i98 << 5);
                str5 = str3;
            } else {
                str5 = str3;
                try {
                    Object[] objArr56 = {Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 1108935604};
                    byte[] bArr11 = $$g;
                    Object[] objArr57 = new Object[1];
                    e((short) 472, (byte) (-bArr11[11]), (byte) 83, objArr57);
                    Class<?> cls2 = Class.forName((String) objArr57[0]);
                    Object[] objArr58 = new Object[1];
                    e((short) 370, bArr11[80], (byte) (-bArr11[11]), objArr58);
                    Object[] objArr59 = (Object[]) cls2.getMethod((String) objArr58[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr56);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char cLastIndexOf3 = (char) ((-1) - TextUtils.lastIndexOf(str, '0', 0));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                        int iLastIndexOf = TextUtils.lastIndexOf(str, '0', 0, 0) + 11;
                        byte[] bArr12 = $$a;
                        Object[] objArr60 = new Object[1];
                        c((short) 202, bArr12[129], (byte) (-bArr12[205]), objArr60);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cLastIndexOf3, keyRepeatTimeout, iLastIndexOf, 1324201839, false, (String) objArr60[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, objArr59);
                    try {
                        long jLongValue6 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue6);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                            char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 876;
                            int capsMode = TextUtils.getCapsMode(str, 0, 0) + 10;
                            byte[] bArr13 = $$a;
                            Object[] objArr61 = new Object[1];
                            c((short) 202, bArr13[7], (byte) (-bArr13[33]), objArr61);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(longPressTimeout2, packedPositionGroup2, capsMode, 254769921, false, (String) objArr61[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) str, '0') + 1);
                            int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                            int edgeSlop2 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                            short s18 = (short) ($$b & 960);
                            byte[] bArr14 = $$a;
                            Object[] objArr62 = new Object[1];
                            c(s18, (byte) (-bArr14[9]), (byte) (-bArr14[205]), objArr62);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cIndexOf, windowTouchSlop3, edgeSlop2, -1199417970, false, (String) objArr62[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf8);
                        objArr5 = objArr59;
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            if (((int[]) objArr5[0])[0] != ((int[]) objArr5[2])[0]) {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr7 = (String[]) objArr5[3];
                if (strArr7 != null) {
                    for (String str19 : strArr7) {
                        arrayList3.add(str19);
                    }
                }
                throw new NullPointerException();
            }
            int i99 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            b = i99 % 128;
            int i100 = i99 % 2;
            int i101 = ((int[]) objArr5[1])[0];
            Object[] objArr63 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
            int length = ((Context) Class.forName(r7).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 219907474;
            int i102 = ~length;
            int i103 = i101 + 727015806 + (((~(317086862 | i102)) | (~((-357397092) | length))) * 210) + (((~(length | 401571567)) | (~(i102 | (-272912387)))) * 210);
            int i104 = (i103 << 13) ^ i103;
            int i105 = i104 ^ (i104 >>> 17);
            ((int[]) objArr63[1])[0] = i105 ^ (i105 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char cLastIndexOf4 = (char) (TextUtils.lastIndexOf(str, '0', 0) + 1);
                int deadChar3 = KeyEvent.getDeadChar(0, 0) + 876;
                int deadChar4 = 10 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr15 = $$a;
                short s19 = bArr15[132];
                byte b6 = bArr15[7];
                Object[] objArr64 = new Object[1];
                c(s19, b6, (byte) (b6 | 14), objArr64);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cLastIndexOf4, deadChar3, deadChar4, 252381699, false, (String) objArr64[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null);
            long jLongValue7 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                char cLastIndexOf5 = (char) ((-1) - TextUtils.lastIndexOf(str, '0', 0));
                int iIndexOf6 = 876 - TextUtils.indexOf(str, str, 0, 0);
                int capsMode2 = TextUtils.getCapsMode(str, 0, 0) + 10;
                Object[] objArr65 = new Object[1];
                c((short) 140, (byte) ($$b & 62), $$a[7], objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cLastIndexOf5, iIndexOf6, capsMode2, 2009631821, false, (String) objArr65[0], null);
            }
            if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int trimmedLength2 = 876 - TextUtils.getTrimmedLength(str);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                    short s20 = (short) ($$b & 987);
                    byte[] bArr16 = $$a;
                    Object[] objArr66 = new Object[1];
                    c(s20, bArr16[7], bArr16[10], objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cMyPid, trimmedLength2, tapTimeout, 256017550, false, (String) objArr66[0], null);
                }
                Object[] objArr67 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
                objArr6 = new Object[]{new int[]{((int[]) objArr67[0])[0]}, new int[1], new int[]{((int[]) objArr67[2])[0]}, (String[]) objArr67[3]};
                int i106 = ((Context) Class.forName(r7).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
                int i107 = ~i106;
                int i108 = (-1561463764) + (((~((-734437353) | i107)) | 774747581) * (-328)) + ((i106 | 774747581) * 164) + (((~(i106 | 734437352)) | 69804053 | (~(i107 | (-29493825)))) * 164) + 1693186889;
                int i109 = (i108 << 13) ^ i108;
                int i110 = i109 ^ (i109 >>> 17);
                ((int[]) objArr6[1])[0] = i110 ^ (i110 << 5);
                str6 = str16;
            } else {
                Context baseContext3 = getBaseContext();
                if (baseContext3 == null) {
                    str6 = str16;
                    baseContext3 = (Context) Class.forName(str15).getMethod(str6, new Class[0]).invoke(null, null);
                } else {
                    str6 = str16;
                }
                if (baseContext3 != null) {
                    baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
                }
                try {
                    Object[] objArr68 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 1693186889};
                    short s21 = (short) TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                    byte[] bArr17 = $$g;
                    Object[] objArr69 = new Object[1];
                    e(s21, bArr17[91], (byte) (-bArr17[158]), objArr69);
                    Class<?> cls3 = Class.forName((String) objArr69[0]);
                    byte b7 = bArr17[80];
                    Object[] objArr70 = new Object[1];
                    e((short) 241, b7, b7, objArr70);
                    Object[] objArr71 = (Object[]) cls3.getMethod((String) objArr70[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr68);
                    if (baseContext3 != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                            int i111 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 10;
                            short s22 = (short) ($$b & 987);
                            byte[] bArr18 = $$a;
                            Object[] objArr72 = new Object[1];
                            c(s22, bArr18[7], bArr18[10], objArr72);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cRgb, i111, iResolveSizeAndState, 256017550, false, (String) objArr72[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr71);
                        try {
                            str4 = str4;
                            long jLongValue8 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf9 = Long.valueOf(jLongValue8);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int mode2 = 876 - View.MeasureSpec.getMode(0);
                                int i112 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                                Object[] objArr73 = new Object[1];
                                c((short) 140, (byte) ($$b & 62), $$a[7], objArr73);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(maximumFlingVelocity, mode2, i112, 2009631821, false, (String) objArr73[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf9);
                            Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                                char cAxisFromString = (char) (MotionEvent.axisFromString(str) + 1);
                                int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                                byte[] bArr19 = $$a;
                                short s23 = bArr19[132];
                                byte b8 = bArr19[7];
                                Object[] objArr74 = new Object[1];
                                c(s23, b8, (byte) (b8 | 14), objArr74);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cAxisFromString, maxKeyCode, minimumFlingVelocity, 252381699, false, (String) objArr74[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf10);
                        } catch (Exception unused5) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr71 = objArr71;
                    }
                    objArr6 = objArr71;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            int i113 = ((int[]) objArr6[2])[0];
            int i114 = ((int[]) objArr6[0])[0];
            if (i114 == i113) {
                int i115 = ((int[]) objArr6[1])[0];
                objArr7 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
                int iCodePointAt3 = ((Context) Class.forName(r7).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 107881556;
                int i116 = i115 + (-1703544620) + (((~(800873510 | iCodePointAt3)) | 268640729) * 576) + (((~((~iCodePointAt3) | 1069514239)) | 572543010) * 576) + 118237248;
                int i117 = (i116 << 13) ^ i116;
                int i118 = i117 ^ (i117 >>> 17);
                ((int[]) objArr7[1])[0] = i118 ^ (i118 << 5);
                i3 = 1;
                c2 = 0;
            } else {
                int[] iArr5 = new int[i114];
                int i119 = i114 - 1;
                iArr5[i119] = 1;
                Toast.makeText((Context) null, iArr5[((i114 * i119) % 2) - 1], 1).show();
                int i120 = ((int[]) objArr6[1])[0];
                objArr7 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
                int layoutDirection = ((Context) Class.forName(r7).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
                int i121 = i120 + (((~((-21022723) | layoutDirection)) | (-535551472)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 121176218 + ((~((~layoutDirection) | (-21022723))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                int i122 = (i121 << 13) ^ i121;
                int i123 = i122 ^ (i122 >>> 17);
                i3 = 1;
                c2 = 0;
                ((int[]) objArr7[1])[0] = i123 ^ (i123 << 5);
            }
            ComponentName callingActivity = getCallingActivity();
            int i124 = ((int[]) objArr63[i3])[c2];
            int i125 = i124 * i124;
            int i126 = -(323064646 * i124);
            int i127 = (((i125 ^ i126) + ((i125 & i126) << i3)) - (~(-(i124 * (-1259188694))))) - i3;
            int i128 = ((i127 | (-1505131456)) << i3) - ((-1505131456) ^ i127);
            int i129 = i128 >> 24;
            int i130 = ((i129 ^ (-511)) + ((i129 & (-511)) << i3)) / 256;
            int i131 = (i130 ^ 1) + ((i130 & i3) << i3);
            int i132 = (i128 ^ i131) + ((i131 & i128) << i3);
            int i133 = i128 >> 28;
            int i134 = -(i132 ^ ((((i133 & (-31)) + (i133 | (-31))) / 16) + 1));
            int i135 = ((i134 | 8) << 1) - (i134 ^ 8);
            int i136 = i135 >> 18;
            int i137 = (((i136 | (-32767)) << 1) - (i136 ^ (-32767))) / 16384;
            int i138 = (i137 ^ 1) + ((i137 & 1) << 1);
            int i139 = 14984 / (((-(((i138 | 1) << 1) - (i138 ^ 1))) & i135) * 1873);
            boolean z = callingActivity != null;
            int i140 = ((int[]) objArr33[1])[0];
            int i141 = i140 * i140;
            int i142 = -(1636050450 * i140);
            int i143 = (((i141 & i142) + (i141 | i142)) - (~(-(i140 * 1392625940)))) - 1;
            int i144 = (i143 & (-214368663)) + ((-214368663) | i143);
            int i145 = i144 >> 18;
            int i146 = (((i145 ^ (-32767)) + ((i145 & (-32767)) << 1)) / 16384) + 1;
            int i147 = ((i144 >> 25) - 255) / 128;
            int i148 = -(((i144 & i146) + (i144 | i146)) ^ ((i147 ^ 1) + ((i147 & 1) << 1)));
            int i149 = (i148 ^ 4) + ((i148 & 4) << 1);
            int i150 = i149 >> 21;
            int i151 = (((i150 | (-4095)) << 1) - (i150 ^ (-4095))) / 2048;
            int i152 = 3605100 / (((-(((i151 ^ 1) + ((i151 & 1) << 1)) + 1)) & i149) * 1525);
            int i153 = ((int[]) objArr4[3])[0];
            int i154 = i153 * i153;
            int i155 = -(1801496577 * i153);
            int i156 = (((i154 & i155) + (i154 | i155)) - (~(-(i153 * 2132371589)))) - (-775045512);
            int i157 = ((i156 >> 29) - 15) / 8;
            int i158 = (i156 - (~((i157 & 1) + (i157 | 1)))) - 1;
            int i159 = i156 >> 18;
            int i160 = (((i159 | (-32767)) << 1) - (i159 ^ (-32767))) / 16384;
            int i161 = -(i158 ^ ((i160 & 1) + (i160 | 1)));
            int i162 = (i161 ^ 2) + ((i161 & 2) << 1);
            int i163 = i162 >> 27;
            int i164 = (((i163 | (-63)) << 1) - (i163 ^ (-63))) / 32;
            int i165 = (i164 ^ 1) + ((i164 & 1) << 1);
            int i166 = i152 + (419992 / (((-((i165 & 1) + (i165 | 1))) & i162) * 1117));
            int i167 = ((int[]) objArr7[1])[0];
            int i168 = ((i167 * i167) - (~(-(208730345 * i167)))) - 1;
            int i169 = -(i167 * (-1398859141));
            int i170 = ((i168 & i169) + (i169 | i168)) - (-1031667652);
            int i171 = i170 >> 16;
            int i172 = (i170 - (~(((((-131071) & i171) + (i171 | (-131071))) / 65536) + 1))) - 1;
            int i173 = i170 >> 24;
            int i174 = -(i172 ^ (((((i173 | (-511)) << 1) - (i173 ^ (-511))) / 256) + 1));
            int i175 = (i174 ^ 5) + ((i174 & 5) << 1);
            int i176 = i175 >> 26;
            int i177 = (((i176 ^ ComposerKt.defaultsKey) + ((i176 & ComposerKt.defaultsKey) << 1)) / 64) + 1;
            String strSubstring2 = "16/29/18/11/Cannot find caller. startActivityForResult should be used.".substring(i166 + ((-2021045) / (((-((i177 & 1) + (i177 | 1))) & i175) * 527)));
            if (!z) {
                throw new IllegalStateException(String.valueOf(strSubstring2));
            }
            zzng zzngVarZzd = zznj.zzd(getIntent());
            this.zzb = R.layout.autocomplete_fullscreen;
            setTheme(R.style.AutocompleteFullscreen);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            int i178 = this.zzb;
            zzox zzoxVarZza = zzow.zza();
            zzoxVarZza.zzc(this);
            zzoxVarZza.zzb(zzngVarZzd.zza() == zzoh.JWT_AND_ONE_PLATFORM ? zzmo.PLACES_UI_KIT : zzmo.ONE_PLATFORM_AUTOCOMPLETE_WIDGET);
            supportFragmentManager.setFragmentFactory(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzab(i178, zzoxVarZza.zza(), zzngVarZzd));
            super.onCreate(bundle);
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = (BaseAutocompleteImplFragment) getSupportFragmentManager().findFragmentById(R.id.autocomplete_content);
            this.zza = baseAutocompleteImplFragment;
            int i179 = baseAutocompleteImplFragment != null ? i139 : 0;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf(str, str, 0) + 31533);
                int packedPositionGroup3 = 921 - ExpandableListView.getPackedPositionGroup(0L);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                byte[] bArr20 = $$a;
                short s24 = bArr20[132];
                byte b9 = bArr20[7];
                Object[] objArr75 = new Object[1];
                c(s24, b9, (byte) (b9 | 14), objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cIndexOf2, packedPositionGroup3, threadPriority, -1048449946, false, (String) objArr75[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char cLastIndexOf6 = (char) (31532 - TextUtils.lastIndexOf(str, '0', 0));
                    int i180 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                    short s25 = (short) 103;
                    Object[] objArr76 = new Object[1];
                    c(s25, (byte) (s25 & 189), $$a[7], objArr76);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cLastIndexOf6, i180, iResolveOpacity, -1142834547, false, (String) objArr76[0], null);
                }
                Object[] objArr77 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).get(null);
                objArr8 = new Object[]{new int[1], new int[]{((int[]) objArr77[1])[0]}, (Object[]) objArr77[2], new int[]{((int[]) objArr77[3])[0]}, (String[]) objArr77[4]};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i181 = (~((-1086342367) | startUptimeMillis)) | 12583068;
                int i182 = ~((~startUptimeMillis) | 1761496575);
                int i183 = (-901812989) + ((i181 | i182) * (-470)) + (((~(startUptimeMillis | (-1073759299))) | i182) * 470) + 1298879731;
                int i184 = (i183 << 13) ^ i183;
                int i185 = i184 ^ (i184 >>> 17);
                ((int[]) objArr8[0])[0] = i185 ^ (i185 << 5);
                i179 = i179;
                str5 = str5;
                str7 = str4;
            } else {
                Context baseContext4 = getBaseContext();
                if (baseContext4 == null) {
                    baseContext4 = (Context) Class.forName(str15).getMethod(str6, new Class[0]).invoke(null, null);
                }
                if (baseContext4 != null) {
                    baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
                }
                try {
                    Object[] objArr78 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1298879731};
                    byte[] bArr21 = $$g;
                    Object[] objArr79 = new Object[1];
                    e((short) 204, (byte) (-bArr21[11]), bArr21[309], objArr79);
                    Class<?> cls4 = Class.forName((String) objArr79[0]);
                    Object[] objArr80 = new Object[1];
                    e((short) 370, bArr21[80], (byte) (-bArr21[11]), objArr80);
                    Object[] objArr81 = (Object[]) cls4.getMethod((String) objArr80[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr78);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char c8 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                        int i186 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                        int deadChar5 = KeyEvent.getDeadChar(0, 0) + 28;
                        short s26 = (short) 103;
                        Object[] objArr82 = new Object[1];
                        c(s26, (byte) (s26 & 189), $$a[7], objArr82);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c8, i186, deadChar5, -1142834547, false, (String) objArr82[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, objArr81);
                    try {
                        str7 = str4;
                        long jLongValue9 = ((Long) Class.forName(str11).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf11 = Long.valueOf(jLongValue9);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                            char packedPositionChild = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
                            int tapTimeout2 = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                            int i187 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            short s27 = (short) 51;
                            Object[] objArr83 = new Object[1];
                            c(s27, (byte) (s27 + 1), $$a[7], objArr83);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(packedPositionChild, tapTimeout2, i187, -778300370, false, (String) objArr83[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf11);
                        Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                            char c9 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                            int keyRepeatDelay2 = 921 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28;
                            byte[] bArr22 = $$a;
                            short s28 = bArr22[132];
                            byte b10 = bArr22[7];
                            Object[] objArr84 = new Object[1];
                            c(s28, b10, (byte) (b10 | 14), objArr84);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c9, keyRepeatDelay2, scrollDefaultDelay3, -1048449946, false, (String) objArr84[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf12);
                        objArr8 = objArr81;
                    } catch (Exception unused6) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th5) {
                    Throwable cause5 = th5.getCause();
                    if (cause5 == null) {
                        throw th5;
                    }
                    throw cause5;
                }
            }
            if (((int[]) objArr8[3])[0] != ((int[]) objArr8[1])[0]) {
                ArrayList arrayList4 = new ArrayList();
                String[] strArr8 = (String[]) objArr8[4];
                if (strArr8 != null) {
                    for (String str20 : strArr8) {
                        arrayList4.add(str20);
                    }
                }
                throw new NullPointerException();
            }
            int i188 = ((int[]) objArr8[0])[0];
            Object[] objArr85 = {new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int i189 = ~((Context) Class.forName(r7).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i190 = i188 + 403831383 + ((~(966786395 | i189)) * 52) + (((~(941513048 | i189)) | (~((-832566596) | i189)) | 25273347) * (-52)) + (((~(i189 | (-941513049))) | 134219800) * 52);
            int i191 = (i190 << 13) ^ i190;
            int i192 = i191 ^ (i191 >>> 17);
            ((int[]) objArr85[0])[0] = i192 ^ (i192 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char c10 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int iIndexOf7 = TextUtils.indexOf(str, str, 0) + 876;
                int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                short s29 = (short) 103;
                Object[] objArr86 = new Object[1];
                c(s29, (byte) (s29 & 189), $$a[7], objArr86);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(c10, iIndexOf7, tapTimeout3, -1650998592, false, (String) objArr86[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null);
            long jLongValue10 = ((Long) Class.forName(str11).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0'));
                int iIndexOf8 = 876 - TextUtils.indexOf(str, str);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
                short s30 = (short) 51;
                Object[] objArr87 = new Object[1];
                c(s30, (byte) (s30 + 1), $$a[7], objArr87);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cIndexOf3, iIndexOf8, absoluteGravity, 2012020043, false, (String) objArr87[0], null);
            }
            if (j4 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char c11 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iNormalizeMetaState2 = 876 - KeyEvent.normalizeMetaState(0);
                    int iRgb = Color.rgb(0, 0, 0) + 16777226;
                    byte[] bArr23 = $$a;
                    short s31 = bArr23[132];
                    Object[] objArr88 = new Object[1];
                    c(s31, (byte) (s31 & 52), bArr23[7], objArr88);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c11, iNormalizeMetaState2, iRgb, 2012931276, false, (String) objArr88[0], null);
                }
                Object[] objArr89 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).get(null);
                objArr9 = new Object[]{new int[]{((int[]) objArr89[0])[0]}, new int[1], new int[]{((int[]) objArr89[2])[0]}, (String[]) objArr89[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i193 = ~iIdentityHashCode2;
                int i194 = (((400299292 + (((~(41058968 | i193)) | (~((-81369198) | iIdentityHashCode2))) * 1900)) + (((~(i193 | 81369197)) | (~(iIdentityHashCode2 | (-41058969)))) * (-950))) + (((~(iIdentityHashCode2 | 81369197)) | (~(i193 | (-41058969)))) * 950)) - 61370716;
                int i195 = (i194 << 13) ^ i194;
                int i196 = i195 ^ (i195 >>> 17);
                ((int[]) objArr9[1])[0] = i196 ^ (i196 << 5);
                str8 = str5;
            } else {
                Context baseContext5 = getBaseContext();
                if (baseContext5 == null) {
                    baseContext5 = (Context) Class.forName(str15).getMethod(str6, new Class[0]).invoke(null, null);
                }
                if (baseContext5 != null) {
                    baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
                }
                str8 = str5;
                try {
                    Object[] objArr90 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str8, Object.class).invoke(null, this)).intValue()), 0, -61370716};
                    byte[] bArr24 = $$g;
                    Object[] objArr91 = new Object[1];
                    e((short) 166, bArr24[145], bArr24[2], objArr91);
                    Class<?> cls5 = Class.forName((String) objArr91[0]);
                    byte b11 = bArr24[80];
                    Object[] objArr92 = new Object[1];
                    e((short) 241, b11, b11, objArr92);
                    Object[] objArr93 = (Object[]) cls5.getMethod((String) objArr92[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr90);
                    if (baseContext5 != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                            char c12 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iIndexOf9 = 875 - TextUtils.indexOf((CharSequence) str, '0');
                            int i197 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            byte[] bArr25 = $$a;
                            short s32 = bArr25[132];
                            Object[] objArr94 = new Object[1];
                            c(s32, (byte) (s32 & 52), bArr25[7], objArr94);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c12, iIndexOf9, i197, 2012931276, false, (String) objArr94[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, objArr93);
                        try {
                            long jLongValue11 = ((Long) Class.forName(str11).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf13 = Long.valueOf(jLongValue11);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                                char cIndexOf4 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0'));
                                int i198 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                                int touchSlop3 = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                                short s33 = (short) 51;
                                Object[] objArr95 = new Object[1];
                                c(s33, (byte) (s33 + 1), $$a[7], objArr95);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cIndexOf4, i198, touchSlop3, 2012020043, false, (String) objArr95[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf13);
                            Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                                char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int iResolveOpacity2 = 876 - Drawable.resolveOpacity(0, 0);
                                int iMyPid2 = (Process.myPid() >> 22) + 10;
                                short s34 = (short) 103;
                                Object[] objArr96 = new Object[1];
                                c(s34, (byte) (s34 & 189), $$a[7], objArr96);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(keyRepeatDelay3, iResolveOpacity2, iMyPid2, -1650998592, false, (String) objArr96[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf14);
                        } catch (Exception unused7) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr93 = objArr93;
                    }
                    objArr9 = objArr93;
                } catch (Throwable th6) {
                    Throwable cause6 = th6.getCause();
                    if (cause6 == null) {
                        throw th6;
                    }
                    throw cause6;
                }
            }
            int i199 = ((int[]) objArr9[2])[0];
            int i200 = ((int[]) objArr9[0])[0];
            if (i200 != i199) {
                throw new RuntimeException(String.valueOf(i200));
            }
            int i201 = ((int[]) objArr9[1])[0];
            Object[] objArr97 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            String str21 = str2;
            int i202 = ((Context) Class.forName(r7).getMethod(str21, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i203 = ~i202;
            int i204 = i201 + 1854270488 + (((~(489723087 | i203)) | 530033316) * (-90)) + (((~(489723087 | i202)) | 2102347) * (-45)) + (((~(i202 | (-530033317))) | 489723087 | (~(i203 | 530033316))) * 45);
            int i205 = (i204 << 13) ^ i204;
            int i206 = i205 ^ (i205 >>> 17);
            ((int[]) objArr97[1])[0] = i206 ^ (i206 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char tapTimeout4 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int deadChar6 = 651 - KeyEvent.getDeadChar(0, 0);
                int iResolveSize = 44 - View.resolveSize(0, 0);
                Object[] objArr98 = new Object[1];
                c((short) 140, (byte) ($$b & 62), $$a[7], objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(tapTimeout4, deadChar6, iResolveSize, -459846511, false, (String) objArr98[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null);
            long jLongValue12 = ((Long) Class.forName(str11).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char edgeSlop3 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int i207 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 651;
                int maximumDrawingCacheSize = 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr26 = $$a;
                short s35 = bArr26[132];
                byte b12 = bArr26[7];
                Object[] objArr99 = new Object[1];
                c(s35, b12, (byte) (b12 | 14), objArr99);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(edgeSlop3, i207, maximumDrawingCacheSize, -873460649, false, (String) objArr99[0], null);
            }
            if (j5 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char c13 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int mirror = 699 - AndroidCharacter.getMirror('0');
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString(str) + 44;
                    short s36 = (short) 103;
                    Object[] objArr100 = new Object[1];
                    c(s36, (byte) (s36 & 189), $$a[7], objArr100);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c13, mirror, iKeyCodeFromString, -1595579076, false, (String) objArr100[0], null);
                }
                Object[] objArr101 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
                objArr10 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i208 = ((int[]) objArr101[2])[0];
                int i209 = ((int[]) objArr101[0])[0];
                int i210 = ((Context) Class.forName(r7).getMethod(str21, new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
                int i211 = (-2140419244) + (((-822117398) | i210) * (-627)) + (((~(828409149 | i210)) | 831839959) * (-627)) + (((~(i210 | 831839959)) | (~((~i210) | (-828409150)))) * 627) + 807607171;
                int i212 = (i211 << 13) ^ i211;
                int i213 = i212 ^ (i212 >>> 17);
                ((int[]) objArr10[3])[0] = i213 ^ (i213 << 5);
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1609 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 26 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2145681644, false, null, new Class[0]);
                    }
                    try {
                        Object[] objArr102 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).newInstance(null), 807607171, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                            char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                            int defaultSize2 = View.getDefaultSize(0, 0) + 651;
                            int mirror2 = '\\' - AndroidCharacter.getMirror('0');
                            byte[] bArr27 = $$a;
                            short s37 = bArr27[132];
                            byte b13 = bArr27[7];
                            Object[] objArr103 = new Object[1];
                            c(s37, b13, (byte) (b13 | 14), objArr103);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(absoluteGravity2, defaultSize2, mirror2, 2075921419, false, (String) objArr103[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 695 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (MotionEvent.axisFromString(str) + 63407), 793 - Color.blue(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                        }
                        objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).invoke(null, objArr102);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                            char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int iLastIndexOf2 = TextUtils.lastIndexOf(str, '0', 0) + 652;
                            int iRed3 = 44 - Color.red(0);
                            short s38 = (short) 103;
                            Object[] objArr104 = new Object[1];
                            c(s38, (byte) (s38 & 189), $$a[7], objArr104);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(scrollBarSize2, iLastIndexOf2, iRed3, -1595579076, false, (String) objArr104[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, objArr10);
                        try {
                            long jLongValue13 = ((Long) Class.forName(str11).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf15 = Long.valueOf(jLongValue13);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                                char c14 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int i214 = 652 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int bitsPerPixel = 43 - ImageFormat.getBitsPerPixel(0);
                                byte[] bArr28 = $$a;
                                short s39 = bArr28[132];
                                byte b14 = bArr28[7];
                                Object[] objArr105 = new Object[1];
                                c(s39, b14, (byte) (b14 | 14), objArr105);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(c14, i214, bitsPerPixel, -873460649, false, (String) objArr105[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf15);
                            Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                                char keyRepeatDelay4 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 651;
                                int iResolveSize2 = 44 - View.resolveSize(0, 0);
                                Object[] objArr106 = new Object[1];
                                c((short) 140, (byte) ($$b & 62), $$a[7], objArr106);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(keyRepeatDelay4, windowTouchSlop4, iResolveSize2, -459846511, false, (String) objArr106[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, lValueOf16);
                        } catch (Exception unused8) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th7) {
                        Throwable cause7 = th7.getCause();
                        if (cause7 == null) {
                            throw th7;
                        }
                        throw cause7;
                    }
                } catch (Throwable th8) {
                    Throwable cause8 = th8.getCause();
                    if (cause8 == null) {
                        throw th8;
                    }
                    throw cause8;
                }
            }
            int i215 = ((int[]) objArr10[0])[0];
            int i216 = ((int[]) objArr10[2])[0];
            if (i216 == i215) {
                Object[] objArr107 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i217 = ((int[]) objArr10[3])[0];
                int i218 = ((int[]) objArr10[2])[0];
                int i219 = ((int[]) objArr10[0])[0];
                int i220 = ((Context) Class.forName(r7).getMethod(str21, new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
                int i221 = ~(471108346 | i220);
                int i222 = ~i220;
                int i223 = i221 | (~(474539156 | i222));
                int i224 = ~((-471108347) | i222);
                int i225 = i217 + 1675591005 + ((i223 | i224) * (-516)) + (((~(i220 | (-4744197))) | (~((-469794961) | i222))) * 516) + ((469794960 | i224) * 516);
                int i226 = (i225 << 13) ^ i225;
                int i227 = i226 ^ (i226 >>> 17);
                ((int[]) objArr107[3])[0] = i227 ^ (i227 << 5);
                i4 = 0;
            } else {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr9 = (String[]) objArr10[1];
                if (strArr9 != null) {
                    int i228 = 0;
                    while (i228 < strArr9.length) {
                        int i229 = b + 93;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i229 % 128;
                        if (i229 % 2 != 0) {
                            arrayList5.add(strArr9[i228]);
                            i228 += 14;
                        } else {
                            arrayList5.add(strArr9[i228]);
                            i228++;
                        }
                    }
                }
                int[] iArr6 = new int[i216];
                int i230 = i216 - 1;
                iArr6[i230] = 1;
                Toast.makeText((Context) null, iArr6[((i216 * i230) % 2) - 1], 1).show();
                Object[] objArr108 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i231 = ((int[]) objArr10[3])[0];
                int i232 = ((int[]) objArr10[2])[0];
                int i233 = ((int[]) objArr10[0])[0];
                int i234 = ((Context) Class.forName(r7).getMethod(str21, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
                int i235 = i231 + 1818329828 + (((~((~i234) | 394760711)) | 5253224) * 529) + (((~(i234 | 394760711)) | 391329901) * 529);
                int i236 = (i235 << 13) ^ i235;
                int i237 = i236 ^ (i236 >>> 17);
                i4 = 0;
                ((int[]) objArr108[3])[0] = i237 ^ (i237 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cRgb2 = (char) (Color.rgb(i4, i4, i4) + 16820258);
                int iRed4 = 3111 - Color.red(i4);
                int packedPositionChild2 = 21 - ExpandableListView.getPackedPositionChild(0L);
                byte[] bArr29 = $$a;
                short s40 = bArr29[132];
                Object[] objArr109 = new Object[1];
                c(s40, (byte) (s40 & 52), bArr29[7], objArr109);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cRgb2, iRed4, packedPositionChild2, -1272852037, false, (String) objArr109[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char cLastIndexOf7 = (char) (TextUtils.lastIndexOf(str, '0') + 43043);
                    int iIndexOf10 = 3110 - TextUtils.indexOf((CharSequence) str, '0');
                    int i238 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                    short s41 = (short) 103;
                    Object[] objArr110 = new Object[1];
                    c(s41, (byte) (s41 & 189), $$a[7], objArr110);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cLastIndexOf7, iIndexOf10, i238, 154975793, false, (String) objArr110[0], null);
                }
                Object[] objArr111 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
                int i239 = ((int[]) objArr111[2])[0];
                int i240 = ((int[]) objArr111[1])[0];
                String[] strArr10 = (String[]) objArr111[3];
                int[] iArr7 = {i240};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i241 = (((((~((-631736250) | iIdentityHashCode3)) | 426128) * (-566)) + 1946219906) + ((~(iIdentityHashCode3 | (-631310122))) * 566)) - 1140320392;
                int i242 = (i241 << 13) ^ i241;
                int i243 = i242 ^ (i242 >>> 17);
                ((int[]) objArr11[0])[0] = i243 ^ (i243 << 5);
                objArr11 = new Object[]{new int[1], iArr7, new int[]{i239}, strArr10};
                str9 = str8;
            } else {
                str9 = str8;
                try {
                    Object[] objArr112 = {null, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, -1140320392};
                    byte[] bArr30 = $$g;
                    Object[] objArr113 = new Object[1];
                    e((short) 70, (byte) (-bArr30[11]), bArr30[0], objArr113);
                    Class<?> cls6 = Class.forName((String) objArr113[0]);
                    byte b15 = bArr30[80];
                    Object[] objArr114 = new Object[1];
                    e((short) 241, b15, b15, objArr114);
                    Object[] objArr115 = (Object[]) cls6.getMethod((String) objArr114[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr112);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char cArgb2 = (char) (43042 - Color.argb(0, 0, 0, 0));
                        int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 3111;
                        int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                        short s42 = (short) 103;
                        Object[] objArr116 = new Object[1];
                        c(s42, (byte) (s42 & 189), $$a[7], objArr116);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cArgb2, iResolveSizeAndState2, modifierMetaStateMask, 154975793, false, (String) objArr116[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, objArr115);
                    try {
                        long jLongValue14 = ((Long) Class.forName(str11).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf17 = Long.valueOf(jLongValue14);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                            char cRed = (char) (Color.red(0) + 43042);
                            int iLastIndexOf3 = TextUtils.lastIndexOf(str, '0') + 3112;
                            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                            short s43 = (short) 51;
                            Object[] objArr117 = new Object[1];
                            c(s43, (byte) (s43 + 1), $$a[7], objArr117);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cRed, iLastIndexOf3, maximumDrawingCacheSize2, -1269618118, false, (String) objArr117[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf17);
                        Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                            char defaultSize3 = (char) (43042 - View.getDefaultSize(0, 0));
                            int i244 = 3112 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int scrollBarFadeDuration2 = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte[] bArr31 = $$a;
                            short s44 = bArr31[132];
                            Object[] objArr118 = new Object[1];
                            c(s44, (byte) (s44 & 52), bArr31[7], objArr118);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(defaultSize3, i244, scrollBarFadeDuration2, -1272852037, false, (String) objArr118[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf18);
                        objArr11 = objArr115;
                    } catch (Exception unused9) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th9) {
                    Throwable cause9 = th9.getCause();
                    if (cause9 == null) {
                        throw th9;
                    }
                    throw cause9;
                }
            }
            int i245 = ((int[]) objArr11[1])[0];
            int i246 = ((int[]) objArr11[2])[0];
            if (i246 == i245) {
                int i247 = b + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i247 % 128;
                int i248 = i247 % 2;
                int i249 = ((int[]) objArr11[0])[0];
                int i250 = ((int[]) objArr11[2])[0];
                int i251 = ((int[]) objArr11[1])[0];
                String[] strArr11 = (String[]) objArr11[3];
                int[] iArr8 = {i250};
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i252 = (-4208694) + (((~((-1038914856) | iIdentityHashCode4)) | (-666116604)) * (-318));
                int i253 = ~((-666116604) | iIdentityHashCode4);
                int i254 = ~iIdentityHashCode4;
                int i255 = i249 + i252 + ((i253 | (~(1073526271 | i254))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode4 | 1073526271)) | (~((-34611417) | i254))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                int i256 = (i255 << 13) ^ i255;
                int i257 = i256 ^ (i256 >>> 17);
                ((int[]) objArr[0])[0] = i257 ^ (i257 << 5);
                Object[] objArr119 = {new int[1], new int[]{i251}, iArr8, strArr11};
                i5 = 0;
            } else {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr12 = (String[]) objArr11[3];
                if (strArr12 != null) {
                    for (String str22 : strArr12) {
                        arrayList6.add(str22);
                    }
                }
                int[] iArr9 = new int[i246];
                int i258 = i246 - 1;
                iArr9[i258] = 1;
                Toast.makeText((Context) null, iArr9[((i246 * i258) % 2) - 1], 1).show();
                int i259 = ((int[]) objArr11[0])[0];
                int i260 = ((int[]) objArr11[2])[0];
                int i261 = ((int[]) objArr11[1])[0];
                String[] strArr13 = (String[]) objArr11[3];
                int iNextInt = new Random().nextInt();
                int i262 = ~iNextInt;
                int i263 = i259 + 1122035740 + (((~((-1355675772) | i262)) | 349355687) * (-90)) + (((~((-1355675772) | iNextInt)) | (-1423965952)) * (-45)) + (((~(iNextInt | (-349355688))) | (-1355675772) | (~(i262 | 349355687))) * 45);
                int i264 = (i263 << 13) ^ i263;
                int i265 = i264 ^ (i264 >>> 17);
                i5 = 0;
                ((int[]) objArr[0])[0] = i265 ^ (i265 << 5);
                Object[] objArr120 = {new int[1], new int[]{i261}, new int[]{i260}, strArr13};
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) str, '0', i5) + 1);
                int defaultSize4 = View.getDefaultSize(i5, i5) + 2267;
                int iResolveSize3 = 33 - View.resolveSize(i5, i5);
                short s45 = (short) 51;
                Object[] objArr121 = new Object[1];
                c(s45, (byte) (s45 + 1), $$a[7], objArr121);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cIndexOf5, defaultSize4, iResolveSize3, -887667012, false, (String) objArr121[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char cIndexOf6 = (char) TextUtils.indexOf(str, str, 0);
                    int i266 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
                    int i267 = 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    short s46 = (short) 103;
                    Object[] objArr122 = new Object[1];
                    c(s46, (byte) (s46 & 189), $$a[7], objArr122);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cIndexOf6, i266, i267, -654680577, false, (String) objArr122[0], null);
                }
                Object[] objArr123 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
                objArr12 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i268 = ((int[]) objArr123[0])[0];
                int i269 = ((int[]) objArr123[3])[0];
                String[] strArr14 = (String[]) objArr123[1];
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i270 = ~iIdentityHashCode5;
                int i271 = (-235756377) + (((-76104218) | iIdentityHashCode5) * (-676)) + (((~(460765638 | i270)) | 76104217) * 676) + (((~(iIdentityHashCode5 | 536869855)) | (~(i270 | (-347947678))) | 271843460) * 676) + 464990760;
                int i272 = (i271 << 13) ^ i271;
                int i273 = i272 ^ (i272 >>> 17);
                ((int[]) objArr12[2])[0] = i273 ^ (i273 << 5);
            } else {
                Context baseContext6 = getBaseContext();
                if (baseContext6 == null) {
                    baseContext6 = (Context) Class.forName(str15).getMethod(str10, new Class[0]).invoke(null, null);
                }
                if (baseContext6 != null) {
                    if (!(baseContext6 instanceof ContextWrapper)) {
                        str10 = str6;
                        baseContext6 = baseContext6.getApplicationContext();
                    } else if (((ContextWrapper) baseContext6).getBaseContext() != null) {
                        str10 = str6;
                        str10 = str6;
                        baseContext6 = baseContext6.getApplicationContext();
                    } else {
                        str10 = str6;
                        baseContext6 = null;
                    }
                }
                str10 = str6;
                try {
                    Object[] objArr124 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, 464990760};
                    byte[] bArr32 = $$g;
                    byte b16 = bArr32[145];
                    Object[] objArr125 = new Object[1];
                    e(b16, bArr32[132], b16, objArr125);
                    Class<?> cls7 = Class.forName((String) objArr125[0]);
                    byte b17 = bArr32[80];
                    Object[] objArr126 = new Object[1];
                    e((short) 241, b17, b17, objArr126);
                    Object[] objArr127 = (Object[]) cls7.getMethod((String) objArr126[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr124);
                    if (baseContext6 != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                            char cLastIndexOf8 = (char) ((-1) - TextUtils.lastIndexOf(str, '0'));
                            int i274 = 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int offsetBefore2 = 33 - TextUtils.getOffsetBefore(str, 0);
                            short s47 = (short) 103;
                            Object[] objArr128 = new Object[1];
                            c(s47, (byte) (s47 & 189), $$a[7], objArr128);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cLastIndexOf8, i274, offsetBefore2, -654680577, false, (String) objArr128[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr127);
                        try {
                            long jLongValue15 = ((Long) Class.forName(str11).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf19 = Long.valueOf(jLongValue15);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                                char cIndexOf7 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 1);
                                int iKeyCodeFromString2 = 2267 - KeyEvent.keyCodeFromString(str);
                                int iIndexOf11 = TextUtils.indexOf(str, str, 0, 0) + 33;
                                byte[] bArr33 = $$a;
                                short s48 = bArr33[132];
                                Object[] objArr129 = new Object[1];
                                c(s48, (byte) (s48 & 52), bArr33[7], objArr129);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cIndexOf7, iKeyCodeFromString2, iIndexOf11, -874156483, false, (String) objArr129[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                            Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                                char cIndexOf8 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                                int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 2267;
                                int i275 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32;
                                short s49 = (short) 51;
                                Object[] objArr130 = new Object[1];
                                c(s49, (byte) (s49 + 1), $$a[7], objArr130);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cIndexOf8, longPressTimeout3, i275, -887667012, false, (String) objArr130[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                        } catch (Exception unused10) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr127 = objArr127;
                    }
                    objArr12 = objArr127;
                } catch (Throwable th10) {
                    Throwable cause10 = th10.getCause();
                    if (cause10 == null) {
                        throw th10;
                    }
                    throw cause10;
                }
            }
            if (((int[]) objArr12[0])[0] != ((int[]) objArr12[3])[0]) {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr15 = (String[]) objArr12[1];
                if (strArr15 != null) {
                    for (String str23 : strArr15) {
                        arrayList7.add(str23);
                    }
                }
                throw new NullPointerException();
            }
            Object[] objArr131 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i276 = ((int[]) objArr12[2])[0];
            int i277 = ((int[]) objArr12[0])[0];
            int i278 = ((int[]) objArr12[3])[0];
            String[] strArr16 = (String[]) objArr12[1];
            int i279 = ((Context) Class.forName(r7).getMethod(str21, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i280 = ~i279;
            int i281 = i276 + (((~(77922212 | i280)) | (~((-886635529) | i279)) | (~(i280 | 886635528))) * 959) + 378266154 + (((~(i279 | 886635528)) | (~(i280 | (-886635529))) | (~(77922212 | i279))) * 959);
            int i282 = (i281 << 13) ^ i281;
            int i283 = i282 ^ (i282 >>> 17);
            ((int[]) objArr131[2])[0] = i283 ^ (i283 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                int windowTouchSlop5 = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int capsMode3 = TextUtils.getCapsMode(str, 0, 0) + 15;
                byte[] bArr34 = $$a;
                short s50 = bArr34[132];
                Object[] objArr132 = new Object[1];
                c(s50, (byte) (s50 & 52), bArr34[7], objArr132);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cCombineMeasuredStates2, windowTouchSlop5, capsMode3, 1357589585, false, (String) objArr132[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
            long jLongValue16 = ((Long) Class.forName(str11).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int mode3 = 1031 - View.MeasureSpec.getMode(0);
                int i284 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                short s51 = (short) 51;
                Object[] objArr133 = new Object[1];
                c(s51, (byte) (s51 + 1), $$a[7], objArr133);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(threadPriority2, mode3, i284, 1344079056, false, (String) objArr133[0], null);
            }
            if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    char c15 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iMyTid = 1031 - (Process.myTid() >> 22);
                    int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
                    byte[] bArr35 = $$a;
                    short s52 = bArr35[132];
                    byte b18 = bArr35[7];
                    Object[] objArr134 = new Object[1];
                    c(s52, b18, (byte) (b18 | 14), objArr134);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c15, iMyTid, threadPriority3, 632103528, false, (String) objArr134[0], null);
                }
                Object[] objArr135 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
                objArr13 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i285 = ((int[]) objArr135[3])[0];
                int i286 = ((int[]) objArr135[1])[0];
                String[] strArr17 = (String[]) objArr135[0];
                int i287 = ~(((Context) Class.forName(r7).getMethod(str21, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1101728894);
                int i288 = ((644797189 + (((~(193845991 | i287)) | 50434178) * (-828))) + ((i287 | 193845991) * (-828))) - 2009660564;
                int i289 = (i288 << 13) ^ i288;
                int i290 = i289 ^ (i289 >>> 17);
                ((int[]) objArr13[2])[0] = i290 ^ (i290 << 5);
            } else {
                int iIntValue4 = ((Integer) Class.forName(str13).getMethod(str9, Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr136 = {-399756377};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b((char) (46038 - Color.blue(0)), 1133 - TextUtils.indexOf((CharSequence) str, '0', 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr137 = {Integer.valueOf(iIntValue4), 0, -418969140, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).newInstance(objArr136), false};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                            char threadPriority4 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int i291 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int iResolveSizeAndState3 = 15 - View.resolveSizeAndState(0, 0, 0);
                            byte[] bArr36 = $$a;
                            short s53 = bArr36[132];
                            Object[] objArr138 = new Object[1];
                            c(s53, (byte) (s53 & 52), bArr36[7], objArr138);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(threadPriority4, i291, iResolveSizeAndState3, 1298546779, false, (String) objArr138[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 1117, 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Boolean.TYPE});
                        }
                        objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).invoke(null, objArr137);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                            char c16 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int tapTimeout5 = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                            int iBlue2 = Color.blue(0) + 15;
                            byte[] bArr37 = $$a;
                            short s54 = bArr37[132];
                            byte b19 = bArr37[7];
                            Object[] objArr139 = new Object[1];
                            c(s54, b19, (byte) (b19 | 14), objArr139);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(c16, tapTimeout5, iBlue2, 632103528, false, (String) objArr139[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr13);
                        try {
                            long jLongValue17 = ((Long) Class.forName(str11).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf21 = Long.valueOf(jLongValue17);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                                char longPressTimeout4 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                int i292 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int minimumFlingVelocity2 = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                short s55 = (short) 51;
                                Object[] objArr140 = new Object[1];
                                c(s55, (byte) (s55 + 1), $$a[7], objArr140);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(longPressTimeout4, i292, minimumFlingVelocity2, 1344079056, false, (String) objArr140[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf21);
                            Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                                char cIndexOf9 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0) + 1);
                                int iIndexOf12 = 1030 - TextUtils.indexOf((CharSequence) str, '0', 0);
                                int iRed5 = Color.red(0) + 15;
                                byte[] bArr38 = $$a;
                                short s56 = bArr38[132];
                                Object[] objArr141 = new Object[1];
                                c(s56, (byte) (s56 & 52), bArr38[7], objArr141);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(cIndexOf9, iIndexOf12, iRed5, 1357589585, false, (String) objArr141[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf22);
                        } catch (Exception unused11) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th11) {
                        Throwable cause11 = th11.getCause();
                        if (cause11 == null) {
                            throw th11;
                        }
                        throw cause11;
                    }
                } catch (Throwable th12) {
                    Throwable cause12 = th12.getCause();
                    if (cause12 == null) {
                        throw th12;
                    }
                    throw cause12;
                }
            }
            int i293 = ((int[]) objArr13[1])[0];
            int i294 = ((int[]) objArr13[3])[0];
            if (i294 == i293) {
                Object[] objArr142 = {strArr, new int[]{i}, new int[1], new int[]{i}};
                int i295 = ((int[]) objArr13[2])[0];
                int i296 = ((int[]) objArr13[3])[0];
                int i297 = ((int[]) objArr13[1])[0];
                String[] strArr18 = (String[]) objArr13[0];
                int iNextInt2 = new Random().nextInt();
                int i298 = ~iNextInt2;
                int i299 = i295 + 259052077 + (((~(iNextInt2 | (-4291100))) | (~((-244352389) | i298)) | 72218) * (-68)) + ((~((-4218882) | i298)) * (-68)) + (((~(4291099 | i298)) | (-248571270)) * 68);
                int i300 = (i299 << 13) ^ i299;
                int i301 = i300 ^ (i300 >>> 17);
                ((int[]) objArr142[2])[0] = i301 ^ (i301 << 5);
            } else {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr19 = (String[]) objArr13[0];
                if (strArr19 != null) {
                    int i302 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                    b = i302 % 128;
                    int i303 = i302 % 2;
                    for (String str24 : strArr19) {
                        arrayList8.add(str24);
                    }
                }
                int[] iArr10 = new int[i294];
                int i304 = i294 - 1;
                iArr10[i304] = 1;
                Toast.makeText((Context) null, iArr10[((i294 * i304) % 2) - 1], 1).show();
                Object[] objArr143 = {strArr, new int[]{i}, new int[1], new int[]{i}};
                int i305 = ((int[]) objArr13[2])[0];
                int i306 = ((int[]) objArr13[3])[0];
                int i307 = ((int[]) objArr13[1])[0];
                String[] strArr20 = (String[]) objArr13[0];
                int i308 = ((Context) Class.forName(r7).getMethod(str21, new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
                int i309 = ~i308;
                int i310 = i305 + 1031173643 + (((~(737625069 | i309)) | (~((-981905240) | i308))) * 210) + (((~(i308 | 1006104575)) | (~(i309 | (-713425734)))) * 210);
                int i311 = (i310 << 13) ^ i310;
                int i312 = i311 ^ (i311 >>> 17);
                ((int[]) objArr143[2])[0] = i312 ^ (i312 << 5);
            }
            if (i179 == 0) {
                throw new IllegalStateException();
            }
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.MeasureSpec.getSize(0)), 40 - View.getDefaultSize(0, 0), TextUtils.indexOf("", "", 0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46401 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
            int i4 = b + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.combineMeasuredStates(0, 0)), 39 - TextUtils.lastIndexOf("", '0'), 19 - View.MeasureSpec.makeMeasureSpec(0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (Process.myTid() >> 22) + 40, 19 - View.combineMeasuredStates(0, 0), 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
                super.onPause();
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46401 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.getDefaultSize(0, 0) + 40, 19 - (ViewConfiguration.getTapTimeout() >> 16), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - View.MeasureSpec.makeMeasureSpec(0, 0)), 40 - ExpandableListView.getPackedPositionType(0L), 19 - (ViewConfiguration.getEdgeSlop() >> 16), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj2, null);
            super.onPause();
            int i3 = 99 / 0;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:17:0x00da  */
    /* JADX WARN: Code duplicated, block: B:19:0x0193  */
    /* JADX WARN: Code duplicated, block: B:22:0x0221 A[Catch: all -> 0x0a65, TryCatch #1 {all -> 0x0a65, blocks: (B:20:0x020d, B:22:0x0221, B:23:0x0251, B:51:0x06b4, B:53:0x06c8, B:54:0x06fa, B:56:0x072c, B:57:0x07a3), top: B:103:0x020d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x026b  */
    /* JADX WARN: Code duplicated, block: B:31:0x033d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0395  */
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
        int i2 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 29944);
                int i3 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                short s = (short) 103;
                Object[] objArr2 = new Object[1];
                c(s, (byte) (s & 189), $$a[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, i3, i4, 986134021, false, (String) objArr2[0], null);
            }
            int i5 = 76 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                    int iAxisFromString = 1754 - MotionEvent.axisFromString("");
                    int i6 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    short s2 = (short) 51;
                    Object[] objArr3 = new Object[1];
                    c(s2, (byte) (s2 + 1), $$a[7], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, iAxisFromString, i6, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i7 = ~elapsedCpuTime;
                int i8 = 434654295 + (((~((-407721804) | i7)) | 4801793) * (-108)) + (((~(i7 | 620324229)) | (~((-620324230) | elapsedCpuTime)) | (-1023244240)) * 54) + ((elapsedCpuTime | (-1023244240)) * 54) + 511910683;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                a(new char[]{20657, 4173, 53571, 37471, 21289, 5220, 54640, 38516, 22276, 6234, 55598, 39487, 23356, 7204, 56636, 40655}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 16519, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                a(new char[]{20658, 13332, 39400, 32436, 49667, 42981, 3245, 36879, 30155, 55993, 48646, 1002, 59548, 19483, 53733, 46779}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 25760, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {-1718449675};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 42050), 1726 - TextUtils.getOffsetBefore("", 0), 29 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$7879113 = com.google.android.gms.tasks.zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), 511910683, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                        int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                        int iArgb = 23 - Color.argb(0, 0, 0, 0);
                        short s3 = (short) 51;
                        Object[] objArr8 = new Object[1];
                        c(s3, (byte) (s3 + 1), $$a[7], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, i11, iArgb, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        a(new char[]{20666, 14754, 33425, 27628, 62696, 24001, 9781, 36692, 6156, 57703, 18963, 54133, 48566, 1667, 61421, 30951, 49606, 43551, 13097, 39937, 25972, 52819}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 26867, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        a(new char[]{20670, 56896, 19796, 64590, 27508, 39533, 2421, 47176, 9990, 22037, 50449, 29746, 58150, 4669, 33084}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.tesla_ev_connector_type).substring(1, 5).codePointAt(1) + 36484, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                            int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                            Object[] objArr11 = new Object[1];
                            c((short) 140, (byte) ($$b & 62), $$a[7], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, iLastIndexOf, i12, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                            int i13 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                            int iMyPid = 23 - (Process.myPid() >> 22);
                            short s4 = (short) 103;
                            Object[] objArr12 = new Object[1];
                            c(s4, (byte) (s4 & 189), $$a[7], objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, i13, iMyPid, 986134021, false, (String) objArr12[0], null);
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
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                int i14 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i15 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                short s5 = (short) 103;
                Object[] objArr13 = new Object[1];
                c(s5, (byte) (s5 & 189), $$a[7], objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollDefaultDelay, i14, i15, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cResolveOpacity2 = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                    int iAxisFromString2 = 1754 - MotionEvent.axisFromString("");
                    int i16 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    short s6 = (short) 51;
                    Object[] objArr14 = new Object[1];
                    c(s6, (byte) (s6 + 1), $$a[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity2, iAxisFromString2, i16, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int i17 = ~elapsedCpuTime2;
                int i18 = 434654295 + (((~((-407721804) | i17)) | 4801793) * (-108)) + (((~(i17 | 620324229)) | (~((-620324230) | elapsedCpuTime2)) | (-1023244240)) * 54) + ((elapsedCpuTime2 | (-1023244240)) * 54) + 511910683;
                int i19 = (i18 << 13) ^ i18;
                int i110 = i19 ^ (i19 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i110 ^ (i110 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                a(new char[]{20657, 4173, 53571, 37471, 21289, 5220, 54640, 38516, 22276, 6234, 55598, 39487, 23356, 7204, 56636, 40655}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 16519, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                a(new char[]{20658, 13332, 39400, 32436, 49667, 42981, 3245, 36879, 30155, 55993, 48646, 1002, 59548, 19483, 53733, 46779}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 25760, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {-1718449675};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 42050), 1726 - TextUtils.getOffsetBefore("", 0), 29 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = com.google.android.gms.tasks.zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), 511910683, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char deadChar2 = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                    int i111 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                    int iArgb2 = 23 - Color.argb(0, 0, 0, 0);
                    short s7 = (short) 51;
                    Object[] objArr19 = new Object[1];
                    c(s7, (byte) (s7 + 1), $$a[7], objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar2, i111, iArgb2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                Object[] objArr20 = new Object[1];
                a(new char[]{20666, 14754, 33425, 27628, 62696, 24001, 9781, 36692, 6156, 57703, 18963, 54133, 48566, 1667, 61421, 30951, 49606, 43551, 13097, 39937, 25972, 52819}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 26867, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                a(new char[]{20670, 56896, 19796, 64590, 27508, 39533, 2421, 47176, 9990, 22037, 50449, 29746, 58150, 4669, 33084}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.tesla_ev_connector_type).substring(1, 5).codePointAt(1) + 36484, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask2 = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0', 0);
                    int i112 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                    Object[] objArr111 = new Object[1];
                    c((short) 140, (byte) ($$b & 62), $$a[7], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask2, iLastIndexOf2, i112, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatDelay2 = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int i113 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                    int iMyPid2 = 23 - (Process.myPid() >> 22);
                    short s8 = (short) 103;
                    Object[] objArr112 = new Object[1];
                    c(s8, (byte) (s8 & 189), $$a[7], objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay2, i113, iMyPid2, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i21 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i21 != i20) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i21));
        }
        int i22 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
        int i23 = i22 % 2;
        int i24 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr21 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i25 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i26 = i24 + (-1144866607) + (((~(133883668 | i25)) | 268701770) * 336) + (((~(i25 | 346486094)) | 56099344) * (-168)) + (((~((~i25) | 346486094)) | 133883668) * 168);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr21[3])[0] = i28 ^ (i28 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int i29 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iRed = 15 - Color.red(0);
            byte[] bArr = $$a;
            short s9 = bArr[132];
            Object[] objArr22 = new Object[1];
            c(s9, (byte) (s9 & 52), bArr[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMakeMeasureSpec, i29, iRed, 1357589585, false, (String) objArr22[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr23 = new Object[1];
        a(new char[]{20666, 14754, 33425, 27628, 62696, 24001, 9781, 36692, 6156, 57703, 18963, 54133, 48566, 1667, 61421, 30951, 49606, 43551, 13097, 39937, 25972, 52819}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26892, objArr23);
        Class<?> cls5 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        a(new char[]{20670, 56896, 19796, 64590, 27508, 39533, 2421, 47176, 9990, 22037, 50449, 29746, 58150, 4669, 33084}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 36563, objArr24);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
            int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
            short s10 = (short) 51;
            Object[] objArr25 = new Object[1];
            c(s10, (byte) (s10 + 1), $$a[7], objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(edgeSlop, packedPositionGroup, pressedStateDuration, 1344079056, false, (String) objArr25[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int iAlpha = Color.alpha(0) + 1031;
                int i30 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                byte[] bArr2 = $$a;
                short s11 = bArr2[132];
                byte b2 = bArr2[7];
                Object[] objArr26 = new Object[1];
                c(s11, b2, (byte) (b2 | 14), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, iAlpha, i30, 632103528, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr27[3])[0];
            int i32 = ((int[]) objArr27[1])[0];
            String[] strArr2 = (String[]) objArr27[0];
            int i33 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i34 = ~i33;
            int i35 = (((1503179761 + (((~((-403070160) | i34)) | (~(158789989 | i33))) * 217)) + (((~(i33 | (-403070160))) | 268438666) * 217)) + (((~(158789989 | i34)) | 403070159) * 217)) - 1983846878;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr[2])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr28 = new Object[1];
            a(new char[]{20657, 4173, 53571, 37471, 21289, 5220, 54640, 38516, 22276, 6234, 55598, 39487, 23356, 7204, 56636, 40655}, (ViewConfiguration.getPressedStateDuration() >> 16) + 16631, objArr28);
            Class<?> cls6 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            a(new char[]{20658, 13332, 39400, 32436, 49667, 42981, 3245, 36879, 30155, 55993, 48646, 1002, 59548, 19483, 53733, 46779}, 25771 - KeyEvent.getDeadChar(0, 0), objArr29);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr30 = {-1718449675};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - Color.red(0)), 1135 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-16777198) - Color.rgb(0, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr31 = {Integer.valueOf(iIntValue3), 0, -1983846878, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr30), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int i38 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                int size = 15 - View.MeasureSpec.getSize(0);
                byte[] bArr3 = $$a;
                short s12 = bArr3[132];
                Object[] objArr32 = new Object[1];
                c(s12, (byte) (s12 & 52), bArr3[7], objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, i38, size, 1298546779, false, (String) objArr32[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.getDefaultSize(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1117, 17 - Color.alpha(0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr31);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int defaultSize2 = 1031 - View.getDefaultSize(0, 0);
                int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr4 = $$a;
                short s13 = bArr4[132];
                byte b3 = bArr4[7];
                Object[] objArr33 = new Object[1];
                c(s13, b3, (byte) (b3 | 14), objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSizeAndState, defaultSize2, longPressTimeout, 632103528, false, (String) objArr33[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr34 = new Object[1];
                a(new char[]{20666, 14754, 33425, 27628, 62696, 24001, 9781, 36692, 6156, 57703, 18963, 54133, 48566, 1667, 61421, 30951, 49606, 43551, 13097, 39937, 25972, 52819}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bca_klik).substring(0, 11).length() + 26892, objArr34);
                Class<?> cls7 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                a(new char[]{20670, 56896, 19796, 64590, 27508, 39533, 2421, 47176, 9990, 22037, 50449, 29746, 58150, 4669, 33084}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 36599, objArr35);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr35[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int size2 = View.MeasureSpec.getSize(0) + 1031;
                    int i39 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    short s14 = (short) 51;
                    Object[] objArr36 = new Object[1];
                    c(s14, (byte) (s14 + 1), $$a[7], objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionChild, size2, i39, 1344079056, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                    int i40 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
                    byte[] bArr5 = $$a;
                    short s15 = bArr5[132];
                    Object[] objArr37 = new Object[1];
                    c(s15, (byte) (s15 & 52), bArr5[7], objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cResolveSizeAndState2, i40, iCombineMeasuredStates, 1357589585, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i41 = ((int[]) objArr[1])[0];
        int i42 = ((int[]) objArr[3])[0];
        if (i42 == i41) {
            Object[] objArr38 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i43 = ((int[]) objArr[2])[0];
            int i44 = ((int[]) objArr[3])[0];
            int i45 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iNextInt = new Random().nextInt();
            int i46 = i43 + 1735288292 + (((~(iNextInt | 186909222)) | (-191851368)) * 305) + (((~((~iNextInt) | 186909222)) | (-57370948)) * 305);
            int i47 = (i46 << 13) ^ i46;
            int i48 = i47 ^ (i47 >>> 17);
            ((int[]) objArr38[2])[0] = i48 ^ (i48 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i49 = 0;
            while (i49 < strArr4.length) {
                int i50 = b + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i50 % 128;
                if (i50 % 2 != 0) {
                    arrayList2.add(strArr4[i49]);
                    i49 += 70;
                } else {
                    arrayList2.add(strArr4[i49]);
                    i49++;
                }
            }
        }
        int[] iArr = new int[i42];
        int i51 = i42 - 1;
        iArr[i51] = 1;
        Toast.makeText((Context) null, iArr[((i42 * i51) % 2) - 1], 1).show();
        Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i52 = ((int[]) objArr[2])[0];
        int i53 = ((int[]) objArr[3])[0];
        int i54 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i55 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i56 = ~i55;
        int i57 = i52 + ((((~(i56 | (-814846664))) | ((~((-1059126834) | i56)) | 805343745)) * (-397)) - 711470591) + ((i55 | (-263286007)) * 397);
        int i58 = i57 ^ (i57 << 13);
        int i59 = i58 ^ (i58 >>> 17);
        ((int[]) objArr39[2])[0] = i59 ^ (i59 << 5);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        byte[] bArr = new byte[575];
        System.arraycopy("3ûMY\bÏ,í\u0014ì\u000bß\u0017ûùÿÚ+ù\u0002ò\u0011ó\u0004ýÕ'ñÿ\b÷ý\u001fò\tó\u0004ýà\u000f\u0016òö\u0007\u0004Ð*í\u0004\u0004ö\u0007\u0004ýûóü\u0004ö\tû\u0003üû\u0003õý\u0010ñú\u0010Ô óÿ\u0005öÿÿù\u0012õ\u0006»\nü¿4û\u0011ë\u0001\töÅ1\u000bô\fûøùÈB\u0001ö¿9\u0003\u0004ï\u000búñ\tÀ9\u0003\u0003ÿü\u0001öö\u0007\u0004ë\u0011ó\u0004ý¾%\u001cð\u000bÍ \u000fó\u0004ýä\u001cí\u0000\u0006ü\u0003÷ê\u001füí\u0011ï\u0000\u0010Æ-÷Ç\u0005éIýÑ \u000fó\u000bñ\t\u0003Õ ñÜ-ñú\u0011ïý¾\u000b\u001fò\tó\u0004ýà\u000f\u0016òö\u0007\u0004Ð*í\u0004\u0004ö\u0007\u0004ýûóü\u0004ö\tû\u0003üû\u0003õý\u0010ñú\u0010Ô óÿ\u0005öÿÿù\u0012õ\u0006¼\u001c\nö\u000bíê\u0012\u000bñ\u0004ü\u000bÏ*ü\u0001ï\u0011Ë3é\u0006\u0001óÿ\u0005\u0001û\t\u0003È\u001c\tþôý\u0000\u0006Ø1ëü\u0010ýù\u0001ã\u0019í\rþó\u000bÑ1úï\u000búñ\tå$ó\u0004òû\róøç\u0013\nó\u0000ûÍ\u001fò\tó\u0004ýà\u000f\u0016òö\u0007\u0004Ð*í\u0004\u0004ö\u0007\u0004ì\u0005\u0003ô\u0003\u0003÷à#ö\u0004ó\u0011ï\u000b½\nü¿7\u0006þö\u0003÷Ç=ýýü\t¸3\nüþ\u0000ý¾Cï\u0005ü\u0003\u0004ï\u000búñ\tÀJþñ1ïþý\u000bñýÛ2í\u0003\u0004â\u001füñú\nÖ1úï\u000búñ\tå$ó\u0004òû\róøç\u0013\nó\u0000ûÎñ.\u001fò\tó\u0004ýà\u000f\u0016òö\u0007\u0004Ð*í\u0004\u0004ö\u0007\u0004ýûóü\u0004ö\tû\u0003üû\u0003õý\u0010ñú\u0010Ô óÿ\u0005öÿÿù\u0012õ\u0006¼\nü¿2\fø\u0007ÿõ\b·4û\u0011ëË@ï\u0016òö\u0007\u0004¸=\u0000óÿ\u0005ÀBñ\n\u0002î\fÿ¸\u0013-ñú\u0011ïé\u000f\u0016òö\u0007\u0004×\u0016\rò\u0005óñ\u0010\tòÚ\u001fû\u0005\tÍ\u001c\u000fðü\r×\u0012\u0015Ç4éî\u0011\u0000\u0000\u0004ýÓ*\u0004÷\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 575);
        $$g = bArr;
        $$h = 142;
        $$a = new byte[]{31, -3, -46, 11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$b = 245;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 7193756072430729664L;
    }
}
