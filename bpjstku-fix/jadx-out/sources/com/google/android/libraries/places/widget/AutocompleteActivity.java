package com.google.android.libraries.places.widget;

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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzmo;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zzow;
import com.google.android.libraries.places.internal.zzox;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import defpackage.CloseGuardHelperCloseGuardImpl;
import defpackage.ContextUtilApi34Impl;
import defpackage.ViewPortBuilder;
import defpackage.cacheInteropConfig;
import defpackage.convertFromExifDate;
import defpackage.convertFromExifTime;
import defpackage.generateCameraId;
import defpackage.getAllExifTags;
import defpackage.initSession;
import defpackage.onCaptureSessionStart;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.surfaceRotationToDegrees;
import defpackage.warnIfOpen;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
public class AutocompleteActivity extends AppCompatActivity implements PlaceSelectionListener {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    public static final int RESULT_ERROR = 2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int zza;
    private int zzb;
    private boolean zzc;
    private static final byte[] $$c = {63, 56, -36, -117};
    private static final int $$f = 246;
    private static int $10 = 0;
    private static int $11 = 1;

    public AutocompleteActivity() {
        super(R.layout.places_autocomplete_activity);
        this.zzc = false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 103 - r6
            int r0 = 53 - r8
            int r7 = r7 + 4
            byte[] r1 = com.google.android.libraries.places.widget.AutocompleteActivity.$$a
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.AutocompleteActivity.b(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 545 - r7
            int r9 = 122 - r9
            int r8 = r8 + 67
            byte[] r0 = com.google.android.libraries.places.widget.AutocompleteActivity.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r4 = r2
            r8 = r7
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L27:
            int r3 = r3 + r7
            int r7 = r3 + (-3)
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.AutocompleteActivity.c(short, byte, byte, java.lang.Object[]):void");
    }

    private final void zzc(int i, Place place, Status status) {
        int i2 = 2 % 2;
        try {
            Intent intent = new Intent();
            if (place != null) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i, intent);
            finish();
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x017e  */
    /* JADX WARN: Code duplicated, block: B:38:0x017f  */
    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i6 = $10 + 105;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.getOffsetBefore("", 0) + 3291, View.resolveSizeAndState(0, 0, 0) + 31, 1199271174, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651, 44 - (KeyEvent.getMaxKeyCode() >> 16), -450685997, false, $$g(b3, b4, (byte) (-b4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i9 = $10 + 29;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 3;
            }
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i11 = $10 + 117;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -450685997, false, $$g(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onError(Status status) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0 ? true == status.isCanceled() : true == status.isCanceled()) {
            i = 0;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        }
        zzc(i, null, status);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onPlaceSelected(Place place) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            zzc(-1, place, Status.RESULT_SUCCESS);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzc(-1, place, Status.RESULT_SUCCESS);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
    }

    final /* synthetic */ void zzb(View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.zzc) {
            zzc(0, null, new Status(16));
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    final /* synthetic */ boolean zza(AutocompleteImplFragment autocompleteImplFragment, View view, View view2, MotionEvent motionEvent) {
        int i = 2 % 2;
        this.zzc = false;
        View view3 = autocompleteImplFragment.getView();
        if (view3 != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            if (motionEvent.getY() > view3.getBottom()) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                this.zzc = true;
                view.performClick();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x1236  */
    /* JADX WARN: Code duplicated, block: B:167:0x1238  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i;
        String str;
        String str2;
        Object[] objArr2;
        int i2;
        String str3;
        String str4;
        String str5;
        Object[] objArr3;
        char c;
        int i3;
        String str6;
        Object[] objArr4;
        char c2;
        final AutocompleteActivity autocompleteActivity;
        String str7;
        Object[] objArr5;
        int i4;
        Object[] objArr6;
        char c3;
        int i5;
        String str8;
        Object[] objArr7;
        Object[] objArr8;
        Object[] objArr9;
        char c4;
        String str9;
        Object[] objArr10;
        Object[] objArr11;
        char c5;
        int i6;
        Object[] objArr12;
        String str10;
        Object[] objArr13;
        char c6;
        char c7;
        Object[] objArr14;
        int i7;
        Object[] objArr15;
        char c8;
        char c9;
        Object[] objArr16;
        int i8 = 2 % 2;
        Object[] objArr17 = new Object[1];
        a(false, 101 - Drawable.resolveOpacity(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.validation_full_name_empty).substring(19, 20).codePointAt(0) - 75, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 88, new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, objArr17);
        String str11 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 94, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.alfamart_instruction_step2).substring(28, 29).length() + 1, new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr18);
        String str12 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 64, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.instruction_atm_bersama6).substring(9, 10).length() + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bni_mobile_instruction_3).substring(5, 6).length() + 1, new char[]{3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18}, objArr19);
        String str13 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 104, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 99, 13 - KeyEvent.normalizeMetaState(0), new char[]{'\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535}, objArr20);
        String str14 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.message_invalid_merchant_url).substring(0, 13).codePointAt(2) - 13, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.indomaret_instruction_step4).substring(45, 46).codePointAt(0) - 6, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bca_klik).substring(0, 11).length() - 7, new char[]{15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5}, objArr21);
        String str15 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        a(false, 108 - Color.alpha(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 18, View.MeasureSpec.makeMeasureSpec(0, 0) + 1, new char[]{4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5}, objArr22);
        String str16 = (String) objArr22[0];
        int i9 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i9 != (-1541134816) + ((iIdentityHashCode | (-141951237)) * (-627)) + (((~(1526144477 | iIdentityHashCode)) | 696156934) * (-627)) + (((~((~iIdentityHashCode) | (-1526144478))) | (~(iIdentityHashCode | 696156934))) * 627)) {
            int i10 = (-827242714) % 2;
            throw new ArithmeticException();
        }
        int i11 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        if (i11 != (-683167236) + (((~(i12 | 1847025038)) | (-1874329551) | (~(732030926 | i12))) * (-744)) + (((~i12) | 704726414) * 744) + ((1874329550 | i12) * 744)) {
            throw new RuntimeException("114362879");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
            int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
            byte[] bArr = $$a;
            byte b = bArr[10];
            short s = bArr[7];
            Object[] objArr23 = new Object[1];
            b(b, s, (byte) (s | 15), objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, maximumDrawingCacheSize, keyRepeatDelay, 986134021, false, (String) objArr23[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
            int i14 = i13 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                int i15 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iIndexOf = 23 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr24 = new Object[1];
                b(bArr2[10], (short) (bArr2[208] - 1), bArr2[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, i15, iIndexOf, 1599039318, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr25[0])[0]}, new int[]{((int[]) objArr25[1])[0]}, (Object[]) objArr25[2], new int[1], (String[]) objArr25[4]};
            int i16 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i17 = (-369218233) + (((-557059715) | (~i16)) * (-490)) + (((~(i16 | 344514920)) | (-901574635)) * 490) + 1304143336;
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr[3])[0] = i19 ^ (i19 << 5);
            str14 = str14;
            str15 = str15;
            str13 = str13;
            i = 1;
        } else {
            str16 = str16;
            int iIntValue = ((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr26 = {-943038270};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42049), ((byte) KeyEvent.getModifierMetaStateMask()) + 1727, 29 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr26), -586263578, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                    int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                    int iMyPid = (Process.myPid() >> 22) + 23;
                    byte[] bArr3 = $$a;
                    Object[] objArr27 = new Object[1];
                    b(bArr3[10], (short) (bArr3[208] - 1), bArr3[7], objArr27);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, iIndexOf2, iMyPid, 1599039318, false, (String) objArr27[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    long jLongValue = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c10 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                        int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0');
                        int i20 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr28 = new Object[1];
                        b(bArr4[10], (short) ($$b >>> 1), bArr4[7], objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c10, iLastIndexOf, i20, 1596667560, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                        int i21 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int fadingEdgeLength = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr5 = $$a;
                        byte b2 = bArr5[10];
                        short s2 = bArr5[7];
                        Object[] objArr29 = new Object[1];
                        b(b2, s2, (byte) (s2 | 15), objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, i21, fadingEdgeLength, 986134021, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArrB$7879113;
                    i = 1;
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
        int i22 = ((int[]) objArr[i])[0];
        int i23 = ((int[]) objArr[0])[0];
        if (i23 == i22) {
            Object[] objArr30 = new Object[5];
            int[] iArr = new int[i];
            objArr30[0] = iArr;
            int[] iArr2 = new int[i];
            objArr30[i] = iArr2;
            objArr30[3] = new int[i];
            int i24 = ((int[]) objArr[3])[0];
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[i])[0];
            String[] strArr = (String[]) objArr[4];
            Object[] objArr31 = (Object[]) objArr[2];
            iArr[0] = i25;
            iArr2[0] = i26;
            objArr30[4] = strArr;
            objArr30[2] = objArr31;
            int iNextInt = new Random().nextInt();
            int i27 = ~iNextInt;
            int i28 = i24 + (-1511993411) + (((~((-89541936) | i27)) | (-123060491) | (~(89541935 | iNextInt))) * (-564)) + ((~(iNextInt | (-33652737))) * 1128) + (((~((-123060491) | i27)) | (-123194672)) * 564);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr30[3])[0] = i30 ^ (i30 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[4];
            if (strArr2 != null) {
                for (String str17 : strArr2) {
                    arrayList.add(str17);
                }
            }
            Toast.makeText((Context) null, i23 / (((i23 - 1) * i23) % 2), 0).show();
            int i31 = ((int[]) objArr[3])[0];
            Object[] objArr32 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i33 = i31 + 950188177 + (((~(43396569 | i32)) | (-177729018) | (~(169205856 | i32))) * (-744)) + (((~i32) | 34873408) * 744) + ((i32 | 177729017) * 744);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr32[3])[0] = i35 ^ (i35 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int i36 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int modifierMetaStateMask2 = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr6 = $$a;
            byte b3 = bArr6[10];
            short s3 = bArr6[7];
            Object[] objArr33 = new Object[1];
            b(b3, s3, (byte) (s3 | 15), objArr33);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask, i36, modifierMetaStateMask2, -1650998592, false, (String) objArr33[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c11 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int minimumFlingVelocity = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int gidForName = 9 - Process.getGidForName("");
            byte[] bArr7 = $$a;
            Object[] objArr34 = new Object[1];
            b(bArr7[10], (short) (bArr7[208] - 1), bArr7[7], objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c11, minimumFlingVelocity, gidForName, 2012020043, false, (String) objArr34[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char gidForName2 = (char) (Process.getGidForName("") + 1);
                int i37 = 877 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                byte[] bArr8 = $$a;
                Object[] objArr35 = new Object[1];
                b(bArr8[10], (short) 141, bArr8[7], objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(gidForName2, i37, keyRepeatDelay2, 2012931276, false, (String) objArr35[0], null);
            }
            Object[] objArr36 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr36[0])[0]}, new int[1], new int[]{((int[]) objArr36[2])[0]}, (String[]) objArr36[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i38 = ~iIdentityHashCode2;
            int i39 = 1858126516 + (((~((-30485760) | i38)) | 9513173) * 168) + ((~((-9513174) | iIdentityHashCode2)) * 168) + (((~(iIdentityHashCode2 | (-20972587))) | (~(i38 | (-9824470))) | 311296) * 168) + 1458853346;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr2[1])[0] = i41 ^ (i41 << 5);
            str = str16;
            str2 = str14;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                str = str16;
                baseContext = (Context) Class.forName(str15).getMethod(str, new Class[0]).invoke(null, null);
            } else {
                str = str16;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            str2 = str14;
            try {
                Object[] objArr37 = {baseContext, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, 1458853346};
                byte[] bArr9 = $$d;
                byte b4 = bArr9[29];
                Object[] objArr38 = new Object[1];
                c((short) 541, b4, (byte) (b4 | 85), objArr38);
                Class<?> cls = Class.forName((String) objArr38[0]);
                Object[] objArr39 = new Object[1];
                c((short) TypedValues.PositionType.TYPE_SIZE_PERCENT, (byte) (-bArr9[16]), (byte) 121, objArr39);
                Object[] objArr40 = (Object[]) cls.getMethod((String) objArr39[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr37);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char cRed = (char) Color.red(0);
                        int iMyPid2 = 876 - (Process.myPid() >> 22);
                        int i42 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                        byte[] bArr10 = $$a;
                        Object[] objArr41 = new Object[1];
                        b(bArr10[10], (short) 141, bArr10[7], objArr41);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cRed, iMyPid2, i42, 2012931276, false, (String) objArr41[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr40);
                    try {
                        long jLongValue3 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char c12 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int i43 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
                            byte[] bArr11 = $$a;
                            Object[] objArr42 = new Object[1];
                            b(bArr11[10], (short) (bArr11[208] - 1), bArr11[7], objArr42);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c12, i43, absoluteGravity, 2012020043, false, (String) objArr42[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                            int iArgb = Color.argb(0, 0, 0, 0) + 10;
                            byte[] bArr12 = $$a;
                            byte b5 = bArr12[10];
                            short s4 = bArr12[7];
                            Object[] objArr43 = new Object[1];
                            b(b5, s4, (byte) (s4 | 15), objArr43);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, iResolveOpacity, iArgb, -1650998592, false, (String) objArr43[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr40 = objArr40;
                    str2 = str2;
                }
                objArr2 = objArr40;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i44 = ((int[]) objArr2[2])[0];
        int i45 = ((int[]) objArr2[0])[0];
        if (i45 == i44) {
            int i46 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i46 % 128;
            int i47 = i46 % 2;
            int i48 = ((int[]) objArr2[1])[0];
            Object[] objArr44 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i49 = ~(922163686 | iIdentityHashCode3);
            int i50 = i48 + (-1413725214) + (((-922164728) | i49) * (-814)) + ((i49 | (~((~iIdentityHashCode3) | 881853457)) | 881852416) * 407) + (((~(iIdentityHashCode3 | (-881853458))) | (~((-922163687) | iIdentityHashCode3)) | 881852416) * 407);
            int i51 = i50 ^ (i50 << 13);
            int i52 = i51 ^ (i51 >>> 17);
            ((int[]) objArr44[1])[0] = i52 ^ (i52 << 5);
            i2 = 0;
        } else {
            int[] iArr3 = new int[i45];
            int i53 = i45 - 1;
            iArr3[i53] = 1;
            Toast.makeText((Context) null, iArr3[((i45 * i53) % 2) - 1], 1).show();
            int i54 = ((int[]) objArr2[1])[0];
            Object[] objArr45 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int i55 = (int) Runtime.getRuntime().totalMemory();
            int i56 = i54 + (((~(848293654 | i55)) | (-108588030)) * 398) + 1011053918 + (((~((~i55) | 848293654)) | (-108588030)) * 398);
            int i57 = (i56 << 13) ^ i56;
            int i58 = i57 ^ (i57 >>> 17);
            i2 = 0;
            ((int[]) objArr45[1])[0] = i58 ^ (i58 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", i2);
            int trimmedLength = 876 - TextUtils.getTrimmedLength("");
            int fadingEdgeLength2 = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            Object[] objArr46 = new Object[1];
            b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr46);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, trimmedLength, fadingEdgeLength2, 252381699, false, (String) objArr46[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int offsetBefore = 876 - TextUtils.getOffsetBefore("", 0);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 10;
            byte[] bArr13 = $$a;
            Object[] objArr47 = new Object[1];
            b(bArr13[10], (short) ($$b >>> 1), bArr13[7], objArr47);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cArgb, offsetBefore, maxKeyCode, 2009631821, false, (String) objArr47[0], null);
        }
        if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) << 52) >>> 52)) >> 12)) {
            int i59 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i59 % 128;
            int i60 = i59 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
                byte b6 = $$a[7];
                Object[] objArr48 = new Object[1];
                b(b6, (short) (b6 | 193), (byte) 52, objArr48);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(scrollBarFadeDuration, iIndexOf3, packedPositionGroup, 256017550, false, (String) objArr48[0], null);
            }
            Object[] objArr49 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr49[0])[0]}, new int[1], new int[]{((int[]) objArr49[2])[0]}, (String[]) objArr49[3]};
            str3 = "currentApplication";
            int i61 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str3, new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i62 = ~i61;
            int i63 = ((((-2122352492) + (((~(i62 | 961976952)) | ((~(921666723 | i62)) | (-1073716988))) * 464)) + (((-152050265) | i61) * (-464))) + (((~(i61 | 961976952)) | (-1073716988)) * 464)) - 165713866;
            int i64 = (i63 << 13) ^ i63;
            int i65 = i64 ^ (i64 >>> 17);
            ((int[]) objArr3[1])[0] = i65 ^ (i65 << 5);
            str5 = str12;
            str4 = str2;
            c = 2;
            str11 = str11;
        } else {
            str3 = r11;
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str15).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            str4 = str2;
            Object[] objArr50 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue()), -165713866};
            short s5 = (short) TypedValues.PositionType.TYPE_SIZE_PERCENT;
            byte[] bArr14 = $$d;
            Object[] objArr51 = new Object[1];
            c(s5, bArr14[199], bArr14[58], objArr51);
            Class<?> cls2 = Class.forName((String) objArr51[0]);
            Object[] objArr52 = new Object[1];
            c((short) 450, bArr14[53], bArr14[158], objArr52);
            Object[] objArr53 = (Object[]) cls2.getMethod((String) objArr52[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr50);
            if (baseContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                    int gidForName3 = Process.getGidForName("") + 877;
                    int i66 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b7 = $$a[7];
                    Object[] objArr54 = new Object[1];
                    b(b7, (short) (b7 | 193), (byte) 52, objArr54);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(deadChar2, gidForName3, i66, 256017550, false, (String) objArr54[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, objArr53);
                try {
                    str5 = str12;
                    long jLongValue5 = ((Long) Class.forName(str11).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char c13 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int deadChar3 = 876 - KeyEvent.getDeadChar(0, 0);
                        int iCombineMeasuredStates = 10 - View.combineMeasuredStates(0, 0);
                        byte[] bArr15 = $$a;
                        Object[] objArr55 = new Object[1];
                        b(bArr15[10], (short) ($$b >>> 1), bArr15[7], objArr55);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c13, deadChar3, iCombineMeasuredStates, 2009631821, false, (String) objArr55[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char c14 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 876;
                        int mode = View.MeasureSpec.getMode(0) + 10;
                        Object[] objArr56 = new Object[1];
                        b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr56);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c14, keyRepeatDelay3, mode, 252381699, false, (String) objArr56[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                str11 = str11;
                str5 = str12;
                objArr53 = objArr53;
            }
            objArr3 = objArr53;
            c = 2;
        }
        int i67 = ((int[]) objArr3[c])[0];
        int i68 = ((int[]) objArr3[0])[0];
        if (i68 == i67) {
            int i69 = ((int[]) objArr3[1])[0];
            Object[] objArr57 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int i70 = ~System.identityHashCode(this);
            int i71 = ~(368063511 | i70);
            int i72 = i69 + 363801184 + ((i71 | (-327753283)) * 764) + (((~(i70 | (-327753283))) | 293606402) * (-1528)) + (((-108603990) | i71) * 764);
            int i73 = (i72 << 13) ^ i72;
            int i74 = i73 ^ (i73 >>> 17);
            ((int[]) objArr57[1])[0] = i74 ^ (i74 << 5);
            i3 = 0;
        } else {
            int[] iArr4 = new int[i68];
            int i75 = i68 - 1;
            iArr4[i75] = 1;
            Toast.makeText((Context) null, iArr4[((i68 * i75) % 2) - 1], 1).show();
            int i76 = ((int[]) objArr3[1])[0];
            Object[] objArr58 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int i77 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str3, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i78 = ~i77;
            int i79 = i76 + (-213894956) + ((~(944567010 | i78)) * (-560)) + ((~(i77 | 1039007727)) * (-560)) + (((~((-904256782) | i78)) | 809816064) * 560);
            int i80 = (i79 << 13) ^ i79;
            int i81 = i80 ^ (i80 >>> 17);
            i3 = 0;
            ((int[]) objArr58[1])[0] = i81 ^ (i81 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char c15 = (char) ((TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 53893);
            int iMyTid = 1320 - (Process.myTid() >> 22);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 36;
            Object[] objArr59 = new Object[1];
            b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr59);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(c15, iMyTid, longPressTimeout, -1433084963, false, (String) objArr59[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char c16 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 53892);
                int iGreen = 1320 - Color.green(0);
                int iLastIndexOf2 = 35 - TextUtils.lastIndexOf("", '0');
                byte[] bArr16 = $$a;
                Object[] objArr60 = new Object[1];
                b(bArr16[10], (short) (bArr16[208] - 1), bArr16[7], objArr60);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c16, iGreen, iLastIndexOf2, -1920778747, false, (String) objArr60[0], null);
            }
            Object[] objArr61 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
            objArr4 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i82 = ((int[]) objArr61[0])[0];
            int i83 = ((int[]) objArr61[3])[0];
            String[] strArr3 = (String[]) objArr61[2];
            int i84 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str3, new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i85 = ~i84;
            int i86 = ((((-1375629536) + (((~((-875599355) | i85)) | 495028470) * (-90))) + (((~((-875599355) | i84)) | (-1035050495)) * (-45))) + ((((~(i84 | (-495028471))) | (-875599355)) | (~(i85 | 495028470))) * 45)) - 976290380;
            int i87 = (i86 << 13) ^ i86;
            int i88 = i87 ^ (i87 >>> 17);
            ((int[]) objArr4[1])[0] = i88 ^ (i88 << 5);
            str6 = str5;
            c2 = 3;
            str3 = str3;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str15).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                int i89 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                int i90 = i89 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i90;
                int i91 = i89 % 2;
                if (baseContext3 instanceof ContextWrapper) {
                    int i92 = i90 + 85;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i92 % 128;
                    if (i92 % 2 != 0) {
                        int i93 = 0 / 0;
                        if (((ContextWrapper) baseContext3).getBaseContext() != null) {
                            baseContext3 = baseContext3.getApplicationContext();
                        } else {
                            baseContext3 = null;
                        }
                    } else if (((ContextWrapper) baseContext3).getBaseContext() != null) {
                        baseContext3 = baseContext3.getApplicationContext();
                    } else {
                        baseContext3 = null;
                    }
                } else {
                    baseContext3 = baseContext3.getApplicationContext();
                }
            }
            int iIntValue2 = ((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr62 = {-943038270};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b((char) (47977 - TextUtils.indexOf("", "", 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1299, 20 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr63 = {baseContext3, "com.bpjstku", -976290380, Integer.valueOf(iIntValue2), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).newInstance(objArr62), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char cRgb = (char) ((-16723323) - Color.rgb(0, 0, 0));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1320;
                int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 36;
                byte[] bArr17 = $$a;
                Object[] objArr64 = new Object[1];
                b(bArr17[10], (short) (bArr17[208] - 1), bArr17[7], objArr64);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cRgb, iMakeMeasureSpec, maxKeyCode2, 819724799, false, (String) objArr64[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57879 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1394 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0, 0) + 75), Boolean.TYPE});
            }
            Object[] objArr65 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr63);
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char jumpTapTimeout = (char) (53893 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int i94 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1319;
                    int iIndexOf4 = 35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte[] bArr18 = $$a;
                    Object[] objArr66 = new Object[1];
                    b(bArr18[10], (short) (bArr18[208] - 1), bArr18[7], objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(jumpTapTimeout, i94, iIndexOf4, -1920778747, false, (String) objArr66[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArr65);
                try {
                    str6 = str5;
                    long jLongValue6 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char c17 = (char) (53893 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int windowTouchSlop = 1320 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i95 = 37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte[] bArr19 = $$a;
                        byte b8 = bArr19[10];
                        short s6 = bArr19[7];
                        Object[] objArr67 = new Object[1];
                        b(b8, s6, (byte) (s6 | 15), objArr67);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c17, windowTouchSlop, i95, -1273706634, false, (String) objArr67[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char scrollBarSize = (char) (53893 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1320;
                        int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 36;
                        Object[] objArr68 = new Object[1];
                        b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr68);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(scrollBarSize, scrollDefaultDelay, maxKeyCode3, -1433084963, false, (String) objArr68[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } else {
                objArr65 = objArr65;
                str6 = str5;
                str3 = str3;
            }
            objArr4 = objArr65;
            c2 = 3;
        }
        int i96 = ((int[]) objArr4[c2])[0];
        int i97 = ((int[]) objArr4[0])[0];
        if (i97 == i96) {
            Object[] objArr69 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i98 = ((int[]) objArr4[1])[0];
            int i99 = ((int[]) objArr4[0])[0];
            int i100 = ((int[]) objArr4[3])[0];
            String[] strArr4 = (String[]) objArr4[2];
            int iMyTid2 = Process.myTid();
            int i101 = ~iMyTid2;
            int i102 = (~((-557787071) | i101)) | 17629324;
            int i103 = ~(iMyTid2 | (-272683009));
            int i104 = i98 + (-94022436) + ((i102 | i103) * (-713)) + (i103 * 1426) + ((~((-812840755) | i101)) * 713);
            int i105 = (i104 << 13) ^ i104;
            int i106 = i105 ^ (i105 >>> 17);
            ((int[]) objArr69[1])[0] = i106 ^ (i106 << 5);
        } else {
            Toast.makeText((Context) null, i97 / (((i97 - 1) * i97) % 2), 0).show();
            Object[] objArr70 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i107 = ((int[]) objArr4[1])[0];
            int i108 = ((int[]) objArr4[0])[0];
            int i109 = ((int[]) objArr4[3])[0];
            String[] strArr5 = (String[]) objArr4[2];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i110 = i107 + 1410641520 + (((-1313709199) | iIdentityHashCode4) * 376) + (((~((~iIdentityHashCode4) | 167166389)) | (-1342168512)) * (-376)) + (((~(iIdentityHashCode4 | (-167166390))) | 1203461435) * 376);
            int i111 = i110 ^ (i110 << 13);
            int i112 = i111 ^ (i111 >>> 17);
            ((int[]) objArr70[1])[0] = i112 ^ (i112 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46400), View.MeasureSpec.getSize(0) + 40, View.MeasureSpec.getMode(0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b((char) (46400 - Drawable.resolveOpacity(0, 0)), TextUtils.lastIndexOf("", '0', 0) + 41, 19 - TextUtils.getOffsetAfter("", 0), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).invoke(obj, null);
        try {
            if (!Places.isInitialized()) {
                throw new IllegalStateException("Places must be initialized.");
            }
            if (!(getCallingActivity() != null)) {
                throw new IllegalStateException("Cannot find caller. startActivityForResult should be used.");
            }
            zzng zzngVarZzd = zznj.zzd(getIntent());
            int iOrdinal = zzngVarZzd.zzb().ordinal();
            if (iOrdinal == 0) {
                autocompleteActivity = this;
                autocompleteActivity.zza = R.layout.places_autocomplete_impl_fragment_fullscreen;
                autocompleteActivity.zzb = R.style.PlacesAutocompleteFullscreen;
            } else if (iOrdinal == 1) {
                try {
                    autocompleteActivity = this;
                    autocompleteActivity.zza = R.layout.places_autocomplete_impl_fragment_overlay;
                    autocompleteActivity.zzb = R.style.PlacesAutocompleteOverlay;
                } catch (Error e2) {
                    e = e2;
                    Throwable th3 = e;
                    zzmr.zzb(th3);
                    throw th3;
                } catch (RuntimeException e3) {
                    e = e3;
                    Throwable th4 = e;
                    zzmr.zzb(th4);
                    throw th4;
                }
            } else {
                autocompleteActivity = this;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            int i113 = autocompleteActivity.zza;
            zzox zzoxVarZza = zzow.zza();
            zzoxVarZza.zzc(autocompleteActivity);
            zzoxVarZza.zzb(zzmo.AUTOCOMPLETE_WIDGET);
            supportFragmentManager.setFragmentFactory(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzj(i113, zzoxVarZza.zza(), zzngVarZzd));
            autocompleteActivity.setTheme(autocompleteActivity.zzb);
            super.onCreate(bundle);
            final AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) getSupportFragmentManager().findFragmentById(R.id.places_autocomplete_content);
            if (autocompleteImplFragment == null) {
                throw new IllegalStateException();
            }
            int i114 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i114 % 128;
            int i115 = i114 % 2;
            autocompleteImplFragment.zza(autocompleteActivity);
            final View viewFindViewById = autocompleteActivity.findViewById(android.R.id.content);
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.libraries.places.widget.zzb
                @Override // android.view.View.OnTouchListener
                public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.zza.zza(autocompleteImplFragment, viewFindViewById, view, motionEvent);
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zza
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        this.zza.zzb(view);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            if (zzngVarZzd.zzc().isEmpty()) {
                autocompleteActivity.zzc(2, null, new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty."));
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char cGreen = (char) (37567 - Color.green(0));
                int gidForName4 = Process.getGidForName("") + 626;
                int mode2 = View.MeasureSpec.getMode(0) + 14;
                Object[] objArr71 = new Object[1];
                b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr71);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cGreen, gidForName4, mode2, -477065106, false, (String) objArr71[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null);
            long jLongValue7 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37567);
                int touchSlop = 625 - (ViewConfiguration.getTouchSlop() >> 8);
                int iAxisFromString = 13 - MotionEvent.axisFromString("");
                byte[] bArr20 = $$a;
                Object[] objArr72 = new Object[1];
                b(bArr20[10], (short) 141, bArr20[7], objArr72);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(scrollDefaultDelay2, touchSlop, iAxisFromString, -976899241, false, (String) objArr72[0], null);
            }
            if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char c18 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37567);
                    int tapTimeout = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i116 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr21 = $$a;
                    Object[] objArr73 = new Object[1];
                    b(bArr21[10], (short) (bArr21[208] - 1), bArr21[7], objArr73);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(c18, tapTimeout, i116, -973632554, false, (String) objArr73[0], null);
                }
                Object[] objArr74 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
                int i117 = ((int[]) objArr74[2])[0];
                int i118 = ((int[]) objArr74[0])[0];
                String[] strArr6 = (String[]) objArr74[3];
                int[] iArr5 = {i117};
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i119 = ((((-300688064) + (((~((-423787556) | iIdentityHashCode5)) | 289410081) * 345)) + (((~((-423787556) | (~iIdentityHashCode5))) | 1110540484) * 345)) + ((~(iIdentityHashCode5 | (-289410082))) * 345)) - 570891522;
                int i120 = (i119 << 13) ^ i119;
                int i121 = i120 ^ (i120 >>> 17);
                ((int[]) objArr5[1])[0] = i121 ^ (i121 << 5);
                objArr5 = new Object[]{new int[]{i118}, new int[1], iArr5, strArr6};
                i4 = 0;
                str7 = str3;
            } else {
                Context baseContext4 = getBaseContext();
                if (baseContext4 == null) {
                    baseContext4 = (Context) Class.forName(str15).getMethod(str, new Class[0]).invoke(null, null);
                }
                if (baseContext4 != null) {
                    int i122 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i122 % 128;
                    int i123 = i122 % 2;
                    baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
                }
                int iIntValue3 = ((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue();
                str7 = str3;
                Object[] objArr75 = new Object[1];
                a(true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 74, ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 28, ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 4, new char[]{65520, 65515, 27, 65514, 65512, 25, 65518, 28, 25, 65518, 65518, 65516, 28, 65517, 65512, 65518, 65516, 24, 28, 28, 65516, 29, 29, 65520, 65517, 29, 25, 24, 24, 29, 28, 65513, 25, 65513, 29, 25, 25, 65515, 65519, 65520, 25, 65513, 65519, 65515, 24, 65519, 65511, 24, 65516, 65514, 28, 29, 65519, 65515, 65516, 29, 24, 65519, 65512, 65512, 65520, 65513, 24, 65520}, objArr75);
                String str18 = (String) objArr75[0];
                Object[] objArr76 = new Object[1];
                a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.mandiri_instruction_step1).substring(28, 30).codePointAt(1) + 5, ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.instruction_atm_bersama4_permata).substring(16, 17).length() + 63, ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.telkomsel_instruction_step3).substring(10, 11).codePointAt(0) - 87, new char[]{65518, 65517, 30, '!', 65517, 65519, 28, 65515, 65521, '!', 30, 28, 31, 65521, 65515, 65520, 29, 65522, ' ', '!', 65515, 29, ' ', 65517, '!', 65519, 65517, 65518, 65521, 65518, 65520, 65522, '!', 65521, 29, 65519, 29, 65524, 65518, 65524, 65524, 65523, 65524, 29, 65520, 65516, 65519, ' ', 28, 65517, 65517, ' ', '!', 65521, 65522, 65519, 65518, 65518, 65524, 30, 65524, 65524, 29, 65519}, objArr76);
                Object[] objArr77 = {baseContext4, new String[]{str18, (String) objArr76[0]}, Integer.valueOf(iIntValue3), 17, -570891522};
                byte[] bArr22 = $$d;
                Object[] objArr78 = new Object[1];
                c((short) 398, bArr22[199], bArr22[23], objArr78);
                Class<?> cls3 = Class.forName((String) objArr78[0]);
                Object[] objArr79 = new Object[1];
                c((short) 291, bArr22[53], bArr22[158], objArr79);
                Object[] objArr80 = (Object[]) cls3.getMethod((String) objArr79[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr77);
                int i124 = ((int[]) objArr80[0])[0];
                int i125 = ((int[]) objArr80[2])[0];
                if (baseContext4 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char c19 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37566);
                        int iAlpha = Color.alpha(0) + 625;
                        int iNormalizeMetaState = 14 - KeyEvent.normalizeMetaState(0);
                        byte[] bArr23 = $$a;
                        Object[] objArr81 = new Object[1];
                        b(bArr23[10], (short) (bArr23[208] - 1), bArr23[7], objArr81);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c19, iAlpha, iNormalizeMetaState, -973632554, false, (String) objArr81[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr80);
                    try {
                        long jLongValue8 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf9 = Long.valueOf(jLongValue8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                            char scrollDefaultDelay3 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37567);
                            int iResolveSize = 625 - View.resolveSize(0, 0);
                            int size = 14 - View.MeasureSpec.getSize(0);
                            byte[] bArr24 = $$a;
                            Object[] objArr82 = new Object[1];
                            b(bArr24[10], (short) 141, bArr24[7], objArr82);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(scrollDefaultDelay3, iResolveSize, size, -976899241, false, (String) objArr82[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf9);
                        Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                            char c20 = (char) (37568 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int i126 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 625;
                            int maximumFlingVelocity = 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            Object[] objArr83 = new Object[1];
                            b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr83);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c20, i126, maximumFlingVelocity, -477065106, false, (String) objArr83[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf10);
                    } catch (Exception unused5) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr80 = objArr80;
                }
                objArr5 = objArr80;
                i4 = 0;
            }
            int i127 = ((int[]) objArr5[i4])[i4];
            int i128 = ((int[]) objArr5[2])[i4];
            if (i128 == i127) {
                objArr6 = new Object[4];
                int[] iArr6 = new int[1];
                objArr6[i4] = iArr6;
                objArr6[1] = new int[1];
                int[] iArr7 = new int[1];
                objArr6[2] = iArr7;
                int i129 = ((int[]) objArr5[1])[i4];
                int i130 = ((int[]) objArr5[2])[i4];
                int i131 = ((int[]) objArr5[i4])[i4];
                String[] strArr7 = (String[]) objArr5[3];
                iArr7[i4] = i130;
                iArr6[i4] = i131;
                int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[i4]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 419217408;
                int i132 = i129 + (((2143736078 + (((~((-80220170) | iCodePointAt)) | (~(1743517951 | iCodePointAt))) * 69)) + (((~(iCodePointAt | 1189656797)) | ((~((-634081324) | iCodePointAt)) | 553861154)) * (-69))) - 758283996);
                int i133 = (i132 << 13) ^ i132;
                int i134 = i133 ^ (i133 >>> 17);
                ((int[]) objArr6[1])[0] = i134 ^ (i134 << 5);
                objArr6[3] = strArr7;
                c3 = 1;
                i5 = 0;
            } else {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr8 = (String[]) objArr5[3];
                if (strArr8 != null) {
                    for (String str19 : strArr8) {
                        arrayList2.add(str19);
                    }
                }
                int[] iArr8 = new int[i128];
                int i135 = i128 - 1;
                iArr8[i135] = 1;
                Toast.makeText((Context) null, iArr8[((i128 * i135) % 2) - 1], 1).show();
                int i136 = ((int[]) objArr5[1])[0];
                int i137 = ((int[]) objArr5[2])[0];
                int i138 = ((int[]) objArr5[0])[0];
                String[] strArr9 = (String[]) objArr5[3];
                int[] iArr9 = {i137};
                int iNextInt2 = new Random().nextInt();
                int i139 = i136 + 1486541236 + (((~(944955947 | iNextInt2)) | 69272788) * (-140)) + ((~(1014228735 | iNextInt2)) * 70) + (((~(iNextInt2 | 878782173)) | 204719350) * 70);
                int i140 = (i139 << 13) ^ i139;
                int i141 = i140 ^ (i140 >>> 17);
                c3 = 1;
                i5 = 0;
                ((int[]) objArr6[1])[0] = i141 ^ (i141 << 5);
                objArr6 = new Object[]{new int[]{i138}, new int[1], iArr9, strArr9};
            }
            ((Field) getAllExifTags.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i5]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{841096075, 1719780358, 876695759}, ((int[]) objArr6[c3])[i5], Integer.MAX_VALUE) - (-1205111577));
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(i5) + 20) >> 6);
                int absoluteGravity2 = 1031 - Gravity.getAbsoluteGravity(i5, i5);
                str8 = "";
                int iIndexOf5 = 15 - TextUtils.indexOf(str8, str8, i5, i5);
                byte[] bArr25 = $$a;
                Object[] objArr84 = new Object[1];
                b(bArr25[10], (short) 141, bArr25[7], objArr84);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(threadPriority, absoluteGravity2, iIndexOf5, 1357589585, false, (String) objArr84[0], null);
            } else {
                str8 = r15;
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null);
            long jLongValue9 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                int scrollDefaultDelay4 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                int size2 = View.MeasureSpec.getSize(0) + 15;
                byte[] bArr26 = $$a;
                Object[] objArr85 = new Object[1];
                b(bArr26[10], (short) (bArr26[208] - 1), bArr26[7], objArr85);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(mirror, scrollDefaultDelay4, size2, 1344079056, false, (String) objArr85[0], null);
            }
            if (j4 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) str8, '0', 0, 0));
                    int i142 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int capsMode = 15 - TextUtils.getCapsMode(str8, 0, 0);
                    Object[] objArr86 = new Object[1];
                    b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr86);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cIndexOf2, i142, capsMode, 632103528, false, (String) objArr86[0], null);
                }
                Object[] objArr87 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
                objArr7 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i143 = ((int[]) objArr87[3])[0];
                int i144 = ((int[]) objArr87[1])[0];
                String[] strArr10 = (String[]) objArr87[0];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i145 = ~iUptimeMillis;
                int i146 = (((189349314 + (((-41993371) | i145) * (-369))) + (((~((-1026962214) | i145)) | (-782682044)) * (-369))) + ((((~(iUptimeMillis | 1026962213)) | (-1068955584)) | (~(i145 | (-740688674)))) * 369)) - 1117825920;
                int i147 = (i146 << 13) ^ i146;
                int i148 = i147 ^ (i147 >>> 17);
                ((int[]) objArr7[2])[0] = i148 ^ (i148 << 5);
            } else {
                int iIntValue4 = ((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue();
                Object[] objArr88 = {-125009852};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46037), 1134 - (ViewConfiguration.getFadingEdgeLength() >> 16), 18 - TextUtils.indexOf(str8, str8, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr89 = {Integer.valueOf(iIntValue4), 0, -1117825920, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).newInstance(objArr88), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                    int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 1031;
                    int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                    byte[] bArr27 = $$a;
                    Object[] objArr90 = new Object[1];
                    b(bArr27[10], (short) 141, bArr27[7], objArr90);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cCombineMeasuredStates2, iNormalizeMetaState2, maximumFlingVelocity2, 1298546779, false, (String) objArr90[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetBefore(str8, 0) + 45993), 1117 - Color.blue(0), KeyEvent.normalizeMetaState(0) + 17), Boolean.TYPE});
                }
                objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).invoke(null, objArr89);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int i149 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int modifierMetaStateMask3 = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                    Object[] objArr91 = new Object[1];
                    b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr91);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(touchSlop2, i149, modifierMetaStateMask3, 632103528, false, (String) objArr91[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, objArr7);
                try {
                    long jLongValue10 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                        char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) str8, '0', 0, 0) + 1);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                        int i150 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
                        byte[] bArr28 = $$a;
                        Object[] objArr92 = new Object[1];
                        b(bArr28[10], (short) (bArr28[208] - 1), bArr28[7], objArr92);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cIndexOf3, doubleTapTimeout, i150, 1344079056, false, (String) objArr92[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                        char c21 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                        int iMyTid3 = (Process.myTid() >> 22) + 1031;
                        int i151 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte[] bArr29 = $$a;
                        Object[] objArr93 = new Object[1];
                        b(bArr29[10], (short) 141, bArr29[7], objArr93);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c21, iMyTid3, i151, 1357589585, false, (String) objArr93[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
            int i152 = ((int[]) objArr7[1])[0];
            int i153 = ((int[]) objArr7[3])[0];
            if (i153 != i152) {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr11 = (String[]) objArr7[0];
                if (strArr11 != null) {
                    for (String str20 : strArr11) {
                        arrayList3.add(str20);
                    }
                }
                throw new RuntimeException(String.valueOf(i153));
            }
            Object[] objArr94 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i154 = ((int[]) objArr7[2])[0];
            int i155 = ((int[]) objArr7[3])[0];
            int i156 = ((int[]) objArr7[1])[0];
            String[] strArr12 = (String[]) objArr7[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i157 = ~iIdentityHashCode6;
            int i158 = i154 + (-296075291) + (((~(224830109 | i157)) | (-469110280) | (~((-224830110) | iIdentityHashCode6))) * (-564)) + ((~(iIdentityHashCode6 | (-157680134))) * 1128) + (((~((-469110280) | i157)) | 67149976) * 564);
            int i159 = (i158 << 13) ^ i158;
            int i160 = i159 ^ (i159 >>> 17);
            Object obj2 = objArr94[2];
            ((int[]) obj2)[0] = i160 ^ (i160 << 5);
            ((Field) convertFromExifTime.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{561578478, 1743444706, 1146574434}, ((int[]) obj2)[0], Integer.MAX_VALUE) - (-2044252601));
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                char threadPriority2 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 43042);
                int iIndexOf6 = 3110 - TextUtils.indexOf((CharSequence) str8, '0', 0);
                int pressedStateDuration = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte[] bArr30 = $$a;
                Object[] objArr95 = new Object[1];
                b(bArr30[10], (short) 141, bArr30[7], objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(threadPriority2, iIndexOf6, pressedStateDuration, -1272852037, false, (String) objArr95[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null) != -1) {
                int i161 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i161 % 128;
                int i162 = i161 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char c22 = (char) (43042 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iLastIndexOf3 = TextUtils.lastIndexOf(str8, '0') + 3112;
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 22;
                    byte[] bArr31 = $$a;
                    byte b9 = bArr31[10];
                    short s7 = bArr31[7];
                    Object[] objArr96 = new Object[1];
                    b(b9, s7, (byte) (s7 | 15), objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c22, iLastIndexOf3, edgeSlop, 154975793, false, (String) objArr96[0], null);
                }
                Object[] objArr97 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).get(null);
                int i163 = ((int[]) objArr97[2])[0];
                int i164 = ((int[]) objArr97[1])[0];
                String[] strArr13 = (String[]) objArr97[3];
                int[] iArr10 = {i163};
                int[] iArr11 = {i164};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i165 = ~startUptimeMillis;
                int i166 = (-1101214134) + (((~((-348061842) | i165)) | 278986897 | (~((-1356969618) | i165)) | (~(1426044561 | startUptimeMillis))) * (-84));
                int i167 = (~(startUptimeMillis | (-1356969618))) | 348061841;
                int i168 = ~(i165 | 1356969617);
                int i169 = i166 + ((i167 | i168) * (-84)) + (((-1426044562) | i168) * 84) + 79083486;
                int i170 = (i169 << 13) ^ i169;
                int i171 = i170 ^ (i170 >>> 17);
                ((int[]) objArr8[0])[0] = i171 ^ (i171 << 5);
                objArr8 = new Object[]{new int[1], iArr11, iArr10, strArr13};
            } else {
                Object[] objArr98 = {null, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 79083486};
                byte[] bArr32 = $$d;
                Object[] objArr99 = new Object[1];
                c((short) 239, bArr32[25], bArr32[29], objArr99);
                Class<?> cls4 = Class.forName((String) objArr99[0]);
                Object[] objArr100 = new Object[1];
                c((short) 450, bArr32[53], bArr32[158], objArr100);
                objArr8 = (Object[]) cls4.getMethod((String) objArr100[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr98);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                    char deadChar4 = (char) (43042 - KeyEvent.getDeadChar(0, 0));
                    int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 3111;
                    int iIndexOf7 = TextUtils.indexOf((CharSequence) str8, '0') + 23;
                    byte[] bArr33 = $$a;
                    byte b10 = bArr33[10];
                    short s8 = bArr33[7];
                    Object[] objArr101 = new Object[1];
                    b(b10, s8, (byte) (s8 | 15), objArr101);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(deadChar4, iNormalizeMetaState3, iIndexOf7, 154975793, false, (String) objArr101[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, objArr8);
                try {
                    long jLongValue11 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char keyRepeatDelay4 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43042);
                        int gidForName5 = Process.getGidForName(str8) + 3112;
                        int iIndexOf8 = TextUtils.indexOf((CharSequence) str8, '0') + 23;
                        byte[] bArr34 = $$a;
                        Object[] objArr102 = new Object[1];
                        b(bArr34[10], (short) (bArr34[208] - 1), bArr34[7], objArr102);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(keyRepeatDelay4, gidForName5, iIndexOf8, -1269618118, false, (String) objArr102[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                        char packedPositionGroup2 = (char) (43042 - ExpandableListView.getPackedPositionGroup(0L));
                        int iMyTid4 = 3111 - (Process.myTid() >> 22);
                        int iLastIndexOf4 = TextUtils.lastIndexOf(str8, '0') + 23;
                        byte[] bArr35 = $$a;
                        Object[] objArr103 = new Object[1];
                        b(bArr35[10], (short) 141, bArr35[7], objArr103);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(packedPositionGroup2, iMyTid4, iLastIndexOf4, -1272852037, false, (String) objArr103[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
            int i172 = ((int[]) objArr8[1])[0];
            int i173 = ((int[]) objArr8[2])[0];
            if (i173 == i172) {
                int i174 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i174 % 128;
                int i175 = i174 % 2;
                int i176 = ((int[]) objArr8[0])[0];
                int i177 = ((int[]) objArr8[2])[0];
                int i178 = ((int[]) objArr8[1])[0];
                String[] strArr14 = (String[]) objArr8[3];
                int[] iArr12 = {i177};
                int[] iArr13 = {i178};
                int iIdentityHashCode7 = System.identityHashCode(this);
                int i179 = ~iIdentityHashCode7;
                int i180 = i176 + (-1272411950) + (((~((-762205824) | i179)) | 673333283) * 168) + ((~((-673333284) | iIdentityHashCode7)) * 168) + (((~(iIdentityHashCode7 | (-88872541))) | (~(i179 | (-942825636))) | 269492352) * 168);
                int i181 = (i180 << 13) ^ i180;
                int i182 = i181 ^ (i181 >>> 17);
                ((int[]) objArr[0])[0] = i182 ^ (i182 << 5);
                Object[] objArr104 = {new int[1], iArr13, iArr12, strArr14};
                objArr9 = objArr104;
                c4 = 0;
            } else {
                ArrayList arrayList4 = new ArrayList();
                String[] strArr15 = (String[]) objArr8[3];
                if (strArr15 != null) {
                    for (String str21 : strArr15) {
                        arrayList4.add(str21);
                    }
                }
                Toast.makeText((Context) null, i173 / (((i173 - 1) * i173) % 2), 0).show();
                int i183 = ((int[]) objArr8[0])[0];
                int i184 = ((int[]) objArr8[2])[0];
                int i185 = ((int[]) objArr8[1])[0];
                String[] strArr16 = (String[]) objArr8[3];
                int[] iArr14 = {i184};
                int[] iArr15 = {i185};
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i186 = i183 + 330931642 + ((~((~iIdentityHashCode8) | (-4981761))) * 433) + (((~((-984836766) | iIdentityHashCode8)) | (-720194694)) * (-433)) + (((~(iIdentityHashCode8 | (-720194694))) | (-989818526)) * 433);
                int i187 = (i186 << 13) ^ i186;
                int i188 = i187 ^ (i187 >>> 17);
                c4 = 0;
                ((int[]) objArr9[0])[0] = i188 ^ (i188 << 5);
                objArr9 = new Object[]{new int[1], iArr15, iArr14, strArr16};
            }
            ((Field) convertFromExifDate.TuitionPaymentFragmentspecialinlinedviewModeldefault1[c4]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1699680453, 877268898, 1948145827}, ((int[]) objArr9[c4])[c4], Integer.MAX_VALUE) + 1146612487);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char gidForName6 = (char) ((-1) - Process.getGidForName(str8));
                int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267;
                int longPressTimeout2 = 33 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr36 = $$a;
                Object[] objArr105 = new Object[1];
                b(bArr36[10], (short) (bArr36[208] - 1), bArr36[7], objArr105);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(gidForName6, maximumFlingVelocity3, longPressTimeout2, -887667012, false, (String) objArr105[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int i189 = 2267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int keyRepeatTimeout = 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr37 = $$a;
                    byte b11 = bArr37[10];
                    short s9 = bArr37[7];
                    Object[] objArr106 = new Object[1];
                    b(b11, s9, (byte) (s9 | 15), objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(tapTimeout2, i189, keyRepeatTimeout, -654680577, false, (String) objArr106[0], null);
                }
                Object[] objArr107 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
                objArr10 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i190 = ((int[]) objArr107[0])[0];
                int i191 = ((int[]) objArr107[3])[0];
                String[] strArr17 = (String[]) objArr107[1];
                str9 = str7;
                int i192 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str9, new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
                int i193 = ((((-1316611999) + (((~((-9959177) | i192)) | 8647432) * (-140))) + ((~((-1311745) | i192)) * 70)) + (((~(i192 | 818672492)) | (-811336805)) * 70)) - 1746853873;
                int i194 = (i193 << 13) ^ i193;
                int i195 = i194 ^ (i194 >>> 17);
                ((int[]) objArr10[2])[0] = i195 ^ (i195 << 5);
            } else {
                str9 = str7;
                Context baseContext5 = getBaseContext();
                if (baseContext5 == null) {
                    baseContext5 = (Context) Class.forName(str15).getMethod(str, new Class[0]).invoke(null, null);
                }
                if (baseContext5 != null) {
                    str = str;
                    if ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) {
                        str = str;
                        baseContext5 = null;
                    } else {
                        str = str;
                        str = str;
                        baseContext5 = baseContext5.getApplicationContext();
                    }
                }
                str = str;
                str = str;
                Object[] objArr108 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, -1746853873};
                byte[] bArr38 = $$d;
                byte b12 = bArr38[95];
                int i196 = $$e;
                Object[] objArr109 = new Object[1];
                c((short) 118, b12, (byte) i196, objArr109);
                Class<?> cls5 = Class.forName((String) objArr109[0]);
                Object[] objArr110 = new Object[1];
                c((short) (i196 - 3), bArr38[53], bArr38[1], objArr110);
                Object[] objArr111 = (Object[]) cls5.getMethod((String) objArr110[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr108);
                if (baseContext5 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int trimmedLength2 = 2267 - TextUtils.getTrimmedLength(str8);
                        int iGreen2 = Color.green(0) + 33;
                        byte[] bArr39 = $$a;
                        byte b13 = bArr39[10];
                        short s10 = bArr39[7];
                        Object[] objArr112 = new Object[1];
                        b(b13, s10, (byte) (s10 | 15), objArr112);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cMyTid, trimmedLength2, iGreen2, -654680577, false, (String) objArr112[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArr111);
                    try {
                        long jLongValue12 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf15 = Long.valueOf(jLongValue12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                            char c23 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 2267;
                            int iLastIndexOf5 = 32 - TextUtils.lastIndexOf(str8, '0', 0);
                            byte[] bArr40 = $$a;
                            Object[] objArr113 = new Object[1];
                            b(bArr40[10], (short) 141, bArr40[7], objArr113);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c23, iMakeMeasureSpec2, iLastIndexOf5, -874156483, false, (String) objArr113[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf15);
                        Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                            char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                            int minimumFlingVelocity2 = 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iAlpha2 = 33 - Color.alpha(0);
                            byte[] bArr41 = $$a;
                            Object[] objArr114 = new Object[1];
                            b(bArr41[10], (short) (bArr41[208] - 1), bArr41[7], objArr114);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(packedPositionType2, minimumFlingVelocity2, iAlpha2, -887667012, false, (String) objArr114[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf16);
                    } catch (Exception unused8) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr111 = objArr111;
                    str = str;
                }
                objArr10 = objArr111;
            }
            int i197 = ((int[]) objArr10[3])[0];
            int i198 = ((int[]) objArr10[0])[0];
            if (i198 == i197) {
                objArr11 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i199 = ((int[]) objArr10[2])[0];
                int i200 = ((int[]) objArr10[0])[0];
                int i201 = ((int[]) objArr10[3])[0];
                String[] strArr18 = (String[]) objArr10[1];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i202 = ~((-130097538) | iElapsedRealtime);
                int i203 = i199 + 960965119 + ((671799826 | i202) * (-476)) + (i202 * 952) + ((~((~iElapsedRealtime) | (-130097538))) * 476);
                int i204 = (i203 << 13) ^ i203;
                int i205 = i204 ^ (i204 >>> 17);
                ((int[]) objArr11[2])[0] = i205 ^ (i205 << 5);
                i6 = 0;
                c5 = 2;
            } else {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr19 = (String[]) objArr10[1];
                if (strArr19 != null) {
                    for (String str22 : strArr19) {
                        arrayList5.add(str22);
                    }
                }
                Toast.makeText((Context) null, i198 / (((i198 - 1) * i198) % 2), 0).show();
                objArr11 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i206 = ((int[]) objArr10[2])[0];
                int i207 = ((int[]) objArr10[0])[0];
                int i208 = ((int[]) objArr10[3])[0];
                String[] strArr20 = (String[]) objArr10[1];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i209 = ~iFreeMemory;
                int i210 = i206 + 1993297838 + (((~((-205639140) | i209)) | 603074176) * 519) + (((~(i209 | (-201441636))) | (~(804515811 | iFreeMemory))) * (-519)) + (((~(iFreeMemory | 603074176)) | 205639139) * 519);
                int i211 = (i210 << 13) ^ i210;
                int i212 = i211 ^ (i211 >>> 17);
                c5 = 2;
                i6 = 0;
                ((int[]) objArr11[2])[0] = i212 ^ (i212 << 5);
            }
            ((Field) ContextUtilApi34Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i6]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{460050989, 548311330, 2102512259}, ((int[]) objArr11[c5])[i6], Integer.MAX_VALUE) - (-2029280728));
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char c24 = (char) (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iArgb2 = Color.argb(i6, i6, i6, i6) + 876;
                int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 10;
                Object[] objArr115 = new Object[1];
                b($$a[19], (short) 193, (byte) 42, objArr115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c24, iArgb2, packedPositionGroup3, -1199417970, false, (String) objArr115[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null);
            long jLongValue13 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char gidForName7 = (char) (Process.getGidForName(str8) + 1);
                int i213 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 875;
                int i214 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte b14 = (byte) (-$$a[14]);
                Object[] objArr116 = new Object[1];
                b(b14, (short) (b14 | 200), (byte) 52, objArr116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(gidForName7, i213, i214, 254769921, false, (String) objArr116[0], null);
            }
            if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char c25 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int iLastIndexOf6 = 875 - TextUtils.lastIndexOf(str8, '0', 0);
                    int i215 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                    byte[] bArr42 = $$a;
                    Object[] objArr117 = new Object[1];
                    b(bArr42[19], (short) 203, (byte) (-bArr42[81]), objArr117);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(c25, iLastIndexOf6, i215, 1324201839, false, (String) objArr117[0], null);
                }
                Object[] objArr118 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
                objArr12 = new Object[]{new int[]{((int[]) objArr118[0])[0]}, new int[1], new int[]{((int[]) objArr118[2])[0]}, (String[]) objArr118[3]};
                int i216 = ~(new Random().nextInt() | (-507118478));
                int i217 = (((((-1052449776) | i216) * (-196)) + 407832332) + ((i216 | 545331298) * 196)) - 820011258;
                int i218 = (i217 << 13) ^ i217;
                int i219 = i218 ^ (i218 >>> 17);
                ((int[]) objArr12[1])[0] = i219 ^ (i219 << 5);
            } else {
                Object[] objArr119 = {Integer.valueOf(((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue()), -820011258};
                byte[] bArr43 = $$d;
                Object[] objArr120 = new Object[1];
                c((short) (-bArr43[212]), (byte) (-bArr43[358]), bArr43[183], objArr120);
                Class<?> cls6 = Class.forName((String) objArr120[0]);
                Object[] objArr121 = new Object[1];
                c((short) 291, bArr43[53], bArr43[158], objArr121);
                objArr12 = (Object[]) cls6.getMethod((String) objArr121[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr119);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf(str8, '0', 0) + 1);
                    int iLastIndexOf7 = 875 - TextUtils.lastIndexOf(str8, '0', 0, 0);
                    int i220 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr44 = $$a;
                    Object[] objArr122 = new Object[1];
                    b(bArr44[19], (short) 203, (byte) (-bArr44[81]), objArr122);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cLastIndexOf2, iLastIndexOf7, i220, 1324201839, false, (String) objArr122[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, objArr12);
                try {
                    long jLongValue14 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char cLastIndexOf3 = (char) ((-1) - TextUtils.lastIndexOf(str8, '0', 0));
                        int i221 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                        int scrollBarFadeDuration2 = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b15 = (byte) (-$$a[14]);
                        Object[] objArr123 = new Object[1];
                        b(b15, (short) (b15 | 200), (byte) 52, objArr123);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cLastIndexOf3, i221, scrollBarFadeDuration2, 254769921, false, (String) objArr123[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char cIndexOf4 = (char) TextUtils.indexOf(str8, str8);
                        int pressedStateDuration2 = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iIndexOf9 = 10 - TextUtils.indexOf(str8, str8, 0, 0);
                        Object[] objArr124 = new Object[1];
                        b($$a[19], (short) 193, (byte) 42, objArr124);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cIndexOf4, pressedStateDuration2, iIndexOf9, -1199417970, false, (String) objArr124[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
            int i222 = ((int[]) objArr12[2])[0];
            int i223 = ((int[]) objArr12[0])[0];
            if (i223 == i222) {
                int i224 = ((int[]) objArr12[1])[0];
                objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
                str10 = str9;
                int i225 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
                int i226 = ~i225;
                int i227 = (~((-164349131) | i226)) | 143343626;
                int i228 = ~(i225 | (-103033398));
                int i229 = i224 + (-1015633552) + ((i227 | i228) * (-502)) + ((i228 | (~(i226 | (-21005505)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i230 = i229 ^ (i229 << 13);
                int i231 = i230 ^ (i230 >>> 17);
                ((int[]) objArr13[1])[0] = i231 ^ (i231 << 5);
                c6 = 1;
                c7 = 0;
            } else {
                str10 = str9;
                ArrayList arrayList6 = new ArrayList();
                String[] strArr21 = (String[]) objArr12[3];
                if (strArr21 != null) {
                    for (String str23 : strArr21) {
                        arrayList6.add(str23);
                    }
                }
                Toast.makeText((Context) null, i223 / (((i223 - 1) * i223) % 2), 0).show();
                int i232 = ((int[]) objArr12[1])[0];
                objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
                int i233 = ~(Process.myPid() | (-422624316));
                int i234 = i232 + ((((-465043004) | i233) * (-196)) - 637933596) + ((i233 | 42418688) * 196);
                int i235 = i234 ^ (i234 << 13);
                int i236 = i235 ^ (i235 >>> 17);
                c6 = 1;
                c7 = 0;
                ((int[]) objArr13[1])[0] = i236 ^ (i236 << 5);
            }
            ((Field) CloseGuardHelperCloseGuardImpl.TuitionPaymentFragmentbindingInflater1[c7]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1413937693, 2123496696, 762066495}, ((int[]) objArr13[c6])[c7], Integer.MAX_VALUE) + 1445513843);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cMyTid2 = (char) (Process.myTid() >> 22);
                int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 651;
                int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 44;
                byte[] bArr45 = $$a;
                Object[] objArr125 = new Object[1];
                b(bArr45[10], (short) ($$b >>> 1), bArr45[7], objArr125);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cMyTid2, pressedStateDuration3, packedPositionGroup4, -459846511, false, (String) objArr125[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null);
            long jLongValue15 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char cRgb2 = (char) (Color.rgb(0, 0, 0) + 16777216);
                int iRgb = Color.rgb(0, 0, 0) + 16777867;
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                Object[] objArr126 = new Object[1];
                b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cRgb2, iRgb, doubleTapTimeout2, -873460649, false, (String) objArr126[0], null);
            }
            if (j6 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).getLong(null) << 52) >>> 52)) >> 12)) {
                int i237 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i237 % 128;
                int i238 = i237 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iMyTid5 = (Process.myTid() >> 22) + 651;
                    int iIndexOf10 = TextUtils.indexOf((CharSequence) str8, '0', 0) + 45;
                    byte[] bArr46 = $$a;
                    byte b16 = bArr46[10];
                    short s11 = bArr46[7];
                    Object[] objArr127 = new Object[1];
                    b(b16, s11, (byte) (s11 | 15), objArr127);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(keyRepeatTimeout2, iMyTid5, iIndexOf10, -1595579076, false, (String) objArr127[0], null);
                }
                Object[] objArr128 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).get(null);
                objArr14 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i239 = ((int[]) objArr128[2])[0];
                int i240 = ((int[]) objArr128[0])[0];
                int iIdentityHashCode9 = System.identityHashCode(this);
                int i241 = ~iIdentityHashCode9;
                int i242 = (((((~(704643070 | i241)) | (~((-13652593) | iIdentityHashCode9))) * 988) + 103692005) + ((((~(iIdentityHashCode9 | 687559668)) | 17083402) | (~(i241 | (-13652593)))) * 988)) - 764212836;
                int i243 = (i242 << 13) ^ i242;
                int i244 = i243 ^ (i243 >>> 17);
                ((int[]) objArr14[3])[0] = i244 ^ (i244 << 5);
                i7 = 0;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b((char) (TextUtils.indexOf((CharSequence) str8, '0') + 1), 1610 - TextUtils.indexOf(str8, str8), 26 - Color.argb(0, 0, 0, 0), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr129 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).newInstance(null), -764212836, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int iResolveOpacity2 = 651 - Drawable.resolveOpacity(0, 0);
                    int scrollDefaultDelay5 = 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    Object[] objArr130 = new Object[1];
                    b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr130);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(touchSlop3, iResolveOpacity2, scrollDefaultDelay5, 2075921419, false, (String) objArr130[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getPressedStateDuration() >> 16), (Process.myTid() >> 22) + 695, 98 - View.resolveSize(0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 793, ExpandableListView.getPackedPositionGroup(0L) + 83), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr131 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).invoke(null, objArr129);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char size3 = (char) View.MeasureSpec.getSize(0);
                    int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 651;
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 44;
                    byte[] bArr47 = $$a;
                    byte b17 = bArr47[10];
                    short s12 = bArr47[7];
                    Object[] objArr132 = new Object[1];
                    b(b17, s12, (byte) (s12 | 15), objArr132);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(size3, tapTimeout3, iResolveSizeAndState, -1595579076, false, (String) objArr132[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, objArr131);
                try {
                    long jLongValue16 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int i245 = 651 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int mirror2 = '\\' - AndroidCharacter.getMirror('0');
                        Object[] objArr133 = new Object[1];
                        b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr133);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cMyPid, i245, mirror2, -873460649, false, (String) objArr133[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                        char cRgb3 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                        int iRed = Color.red(0) + 651;
                        int capsMode2 = TextUtils.getCapsMode(str8, 0, 0) + 44;
                        byte[] bArr48 = $$a;
                        Object[] objArr134 = new Object[1];
                        b(bArr48[10], (short) ($$b >>> 1), bArr48[7], objArr134);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cRgb3, iRed, capsMode2, -459846511, false, (String) objArr134[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, lValueOf20);
                    objArr14 = objArr131;
                    i7 = 0;
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
            int i246 = ((int[]) objArr14[i7])[i7];
            int i247 = ((int[]) objArr14[2])[i7];
            if (i247 == i246) {
                objArr15 = new Object[4];
                int[] iArr16 = new int[1];
                objArr15[i7] = iArr16;
                int[] iArr17 = new int[1];
                objArr15[2] = iArr17;
                objArr15[3] = new int[1];
                int i248 = ((int[]) objArr14[3])[i7];
                int i249 = ((int[]) objArr14[2])[i7];
                int i250 = ((int[]) objArr14[i7])[i7];
                iArr17[i7] = i249;
                iArr16[i7] = i250;
                objArr15[1] = new String[i7];
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                int i251 = ~iElapsedRealtime2;
                int i252 = i248 + (-1653937746) + (((~(185345373 | i251)) | (~((-786697) | iElapsedRealtime2))) * (-831)) + ((~(189562879 | iElapsedRealtime2)) * (-1662)) + (((~(iElapsedRealtime2 | (-185345374))) | (~(i251 | (-188776184))) | (~(188776183 | iElapsedRealtime2))) * 831);
                int i253 = (i252 << 13) ^ i252;
                int i254 = i253 ^ (i253 >>> 17);
                ((int[]) objArr15[3])[0] = i254 ^ (i254 << 5);
                c9 = 0;
                c8 = 3;
            } else {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr22 = (String[]) objArr14[1];
                if (strArr22 != null) {
                    for (String str24 : strArr22) {
                        arrayList7.add(str24);
                    }
                }
                int[] iArr18 = new int[i247];
                int i255 = i247 - 1;
                iArr18[i255] = 1;
                Toast.makeText((Context) null, iArr18[((i247 * i255) % 2) - 1], 1).show();
                objArr15 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i256 = ((int[]) objArr14[3])[0];
                int i257 = ((int[]) objArr14[2])[0];
                int i258 = ((int[]) objArr14[0])[0];
                int iIdentityHashCode10 = System.identityHashCode(this);
                int i259 = ~iIdentityHashCode10;
                int i260 = i256 + (-44208416) + ((509477298 | i259) * (-757)) + ((~(511683002 | iIdentityHashCode10)) * 1514) + (((~(iIdentityHashCode10 | (-2205705))) | (~(i259 | 506046488)) | 5636514) * 757);
                int i261 = (i260 << 13) ^ i260;
                int i262 = i261 ^ (i261 >>> 17);
                c8 = 3;
                c9 = 0;
                ((int[]) objArr15[3])[0] = i262 ^ (i262 << 5);
            }
            ((Field) warnIfOpen.TuitionPaymentFragmentspecialinlinedviewModeldefault2[c9]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{998818156, 2105992019, 440757092}, ((int[]) objArr15[c8])[c9], Integer.MAX_VALUE) - (-499738183));
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char packedPositionGroup5 = (char) (31533 - ExpandableListView.getPackedPositionGroup(0L));
                int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                int i263 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                Object[] objArr135 = new Object[1];
                b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr135);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(packedPositionGroup5, scrollBarFadeDuration3, i263, -1048449946, false, (String) objArr135[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char modifierMetaStateMask4 = (char) (31532 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int i264 = 922 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int mode3 = View.MeasureSpec.getMode(0) + 28;
                    byte[] bArr49 = $$a;
                    byte b18 = bArr49[10];
                    short s13 = bArr49[7];
                    Object[] objArr136 = new Object[1];
                    b(b18, s13, (byte) (s13 | 15), objArr136);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(modifierMetaStateMask4, i264, mode3, -1142834547, false, (String) objArr136[0], null);
                }
                Object[] objArr137 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).get(null);
                objArr16 = new Object[]{new int[1], new int[]{((int[]) objArr137[1])[0]}, (Object[]) objArr137[2], new int[]{((int[]) objArr137[3])[0]}, (String[]) objArr137[4]};
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int i265 = ~iUptimeMillis2;
                int i266 = (-1128424400) + (((~((-1530583500) | i265)) | 243496144) * 226) + (((~(i265 | (-1362659596))) | (~((-243496145) | iUptimeMillis2)) | 75572240) * (-113)) + ((~(iUptimeMillis2 | (-1530583500))) * 113) + 1645442642;
                int i267 = (i266 << 13) ^ i266;
                int i268 = i267 ^ (i267 >>> 17);
                ((int[]) objArr16[0])[0] = i268 ^ (i268 << 5);
            } else {
                Context baseContext6 = getBaseContext();
                if (baseContext6 == null) {
                    baseContext6 = (Context) Class.forName(str15).getMethod(str, new Class[0]).invoke(null, null);
                }
                if (baseContext6 != null) {
                    baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
                }
                Object[] objArr138 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 1645442642};
                byte[] bArr50 = $$d;
                short s14 = bArr50[29];
                Object[] objArr139 = new Object[1];
                c(s14, (byte) (s14 | 30), (byte) 45, objArr139);
                Class<?> cls7 = Class.forName((String) objArr139[0]);
                Object[] objArr140 = new Object[1];
                c((short) 450, bArr50[53], bArr50[158], objArr140);
                objArr16 = (Object[]) cls7.getMethod((String) objArr140[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr138);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char tapTimeout4 = (char) (31533 - (ViewConfiguration.getTapTimeout() >> 16));
                    int i269 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                    int i270 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27;
                    byte[] bArr51 = $$a;
                    byte b19 = bArr51[10];
                    short s15 = bArr51[7];
                    Object[] objArr141 = new Object[1];
                    b(b19, s15, (byte) (s15 | 15), objArr141);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(tapTimeout4, i269, i270, -1142834547, false, (String) objArr141[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr16);
                try {
                    long jLongValue17 = ((Long) Class.forName(str11).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString(str8) + 31534);
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 921;
                        int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 28;
                        byte[] bArr52 = $$a;
                        Object[] objArr142 = new Object[1];
                        b(bArr52[10], (short) (bArr52[208] - 1), bArr52[7], objArr142);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(cAxisFromString, iCombineMeasuredStates2, iResolveOpacity3, -778300370, false, (String) objArr142[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                        char minimumFlingVelocity3 = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int maxKeyCode4 = 921 - (KeyEvent.getMaxKeyCode() >> 16);
                        int jumpTapTimeout2 = 28 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        Object[] objArr143 = new Object[1];
                        b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr143);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(minimumFlingVelocity3, maxKeyCode4, jumpTapTimeout2, -1048449946, false, (String) objArr143[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            int i271 = ((int[]) objArr16[1])[0];
            int i272 = ((int[]) objArr16[3])[0];
            if (i272 != i271) {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr23 = (String[]) objArr16[4];
                if (strArr23 != null) {
                    for (String str25 : strArr23) {
                        arrayList8.add(str25);
                    }
                }
                throw new RuntimeException(String.valueOf(i272));
            }
            int i273 = ((int[]) objArr16[0])[0];
            Object[] objArr144 = {new int[1], new int[]{((int[]) objArr16[1])[0]}, (Object[]) objArr16[2], new int[]{((int[]) objArr16[3])[0]}, (String[]) objArr16[4]};
            int i274 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i275 = ~i274;
            int i276 = i273 + 74920143 + (((~(1029697019 | i275)) | 744382624) * 220) + (((~(i275 | 744482208)) | 1029597435) * (-440)) + ((i274 | 1029697019) * 220);
            int i277 = (i276 << 13) ^ i276;
            int i278 = i277 ^ (i277 >>> 17);
            Object obj3 = objArr144[0];
            ((int[]) obj3)[0] = i278 ^ (i278 << 5);
            ((Field) surfaceRotationToDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1710743766, 1877087721, 455128718}, ((int[]) obj3)[0], Integer.MAX_VALUE) - (-1096420390));
        } catch (Error e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1367193220
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
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.AutocompleteActivity.onResume():void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46400), (ViewConfiguration.getScrollBarSize() >> 8) + 40, 19 - Gravity.getAbsoluteGravity(0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 46400), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj2, null);
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
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 46400), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40, 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - View.MeasureSpec.getSize(0)), TextUtils.indexOf("", "", 0, 0) + 40, 19 - TextUtils.indexOf("", "", 0), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj3, null);
            super.onPause();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int i4 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int mirror = AndroidCharacter.getMirror('0') - '!';
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[10], (short) 141, bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i4, mirror, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 65, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.uikit_confirm_shopeepay_qr_scan_tablet).substring(12, 17).length() + 16, new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 7, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.validation_phone_no_invalid_optional).substring(28, 30).length() + 13, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.notification_gojek_app).substring(4, 5).codePointAt(0) - 105, new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
            int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            b(bArr2[10], (short) (bArr2[208] - 1), bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, windowTouchSlop, packedPositionGroup, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 15;
                Object[] objArr7 = new Object[1];
                b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf2, i7, packedPositionType, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr8[3])[0];
            int i9 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i10 = (((-980007275) + (((~(layoutDirection | (-364529762))) | 608809931) * 191)) + (((~((~layoutDirection) | (-364529762))) | 67633217) * 191)) - 1404595851;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            a(false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 99, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.instruction_alto3_bni).substring(12, 18).codePointAt(2) - 81, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9, new char[]{3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 68, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 90, 13 - View.getDefaultSize(0, 0), new char[]{'\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {-764725291};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.getDefaultSize(0, 0) + 46038), 1134 - TextUtils.indexOf("", ""), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -1404595851, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 1032;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 16;
                    byte[] bArr3 = $$a;
                    Object[] objArr13 = new Object[1];
                    b(bArr3[10], (short) 141, bArr3[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, bitsPerPixel2, iIndexOf, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (46041 - AndroidCharacter.getMirror('0')), TextUtils.indexOf("", "") + 1117, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1031;
                    int i13 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                    Object[] objArr14 = new Object[1];
                    b((byte) ($$a[19] - 1), (short) 193, (byte) 52, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, offsetBefore, i13, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    a(false, KeyEvent.keyCodeFromString("") + 101, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 10, new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.virtual_account_number).substring(14, 15).codePointAt(0) - 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_internal_detection_error_detected_image_is_null).substring(0, 24).codePointAt(8) - 17, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char mirror2 = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int iIndexOf2 = TextUtils.indexOf("", "") + 1031;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
                        byte[] bArr4 = $$a;
                        Object[] objArr17 = new Object[1];
                        b(bArr4[10], (short) (bArr4[208] - 1), bArr4[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mirror2, iIndexOf2, modifierMetaStateMask, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        b(bArr5[10], (short) 141, bArr5[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionGroup2, minimumFlingVelocity, i14, 1357589585, false, (String) objArr18[0], null);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 == i15) {
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[3])[0];
            int i19 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.instruction_alto7).substring(16, 17).codePointAt(0) - 595981582;
            int i20 = ~iCodePointAt;
            int i21 = i17 + (-272051219) + (((~(234809321 | i20)) | 9470848) * 220) + (((~(i20 | 94029697)) | 150250472) * (-440)) + ((iCodePointAt | 234809321) * 220);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr19[2])[0] = i23 ^ (i23 << 5);
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
            int i25 = i24 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
                int i27 = i26 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i16];
            int i28 = i16 - 1;
            iArr[i28] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i28) % 2) - 1], 1).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[3])[0];
            int i31 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i33 = ~i32;
            int i34 = i29 + 600356889 + ((~(543649304 | i33)) * (-560)) + ((~(i32 | 838823614)) * (-560)) + (((~((-299369135) | i33)) | 4194824) * 560);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr20[2])[0] = i36 ^ (i36 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int gidForName = 1754 - Process.getGidForName("");
            int i37 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
            byte[] bArr6 = $$a;
            byte b = bArr6[10];
            short s = bArr6[7];
            Object[] objArr21 = new Object[1];
            b(b, s, (byte) (s | 15), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, gidForName, i37, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c3 = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int iIndexOf3 = 1755 - TextUtils.indexOf("", "");
                int iArgb = 23 - Color.argb(0, 0, 0, 0);
                byte[] bArr7 = $$a;
                Object[] objArr22 = new Object[1];
                b(bArr7[10], (short) (bArr7[208] - 1), bArr7[7], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, iIndexOf3, iArgb, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int i38 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 303344774;
            int i39 = (((~((~i38) | 1073512406)) * 130) - 31432377) + (((~(i38 | 1073512406)) | 844122128) * 130) + 1109687363;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr2[3])[0] = i41 ^ (i41 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 64, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.error_message_status_code_500).substring(13, 15).length(), new char[]{3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18}, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            a(false, 105 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 100, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 23, new char[]{'\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535}, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {-764725291};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42048), 1726 - ((Process.getThreadPriority(0) + 20) >> 6), 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), 1109687363);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cBlue = (char) (29944 - Color.blue(0));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                int size = View.MeasureSpec.getSize(0) + 23;
                byte[] bArr8 = $$a;
                Object[] objArr27 = new Object[1];
                b(bArr8[10], (short) (bArr8[208] - 1), bArr8[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cBlue, iCombineMeasuredStates, size, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr28 = new Object[1];
                a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.j1772_ev_connector_type).substring(0, 5).length() + 96, TextUtils.indexOf("", "") + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.ef_video).substring(0, 5).length() + 16, new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                a(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 7, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bni_atm_instruction_7).substring(39, 40).length() + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_method_indomaret).substring(0, 9).codePointAt(1) - 108, new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int mode = 1755 - View.MeasureSpec.getMode(0);
                    int i42 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                    byte[] bArr9 = $$a;
                    Object[] objArr30 = new Object[1];
                    b(bArr9[10], (short) ($$b >>> 1), bArr9[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, mode, i42, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0) + 29944);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
                    int iRed = Color.red(0) + 23;
                    byte[] bArr10 = $$a;
                    byte b2 = bArr10[10];
                    short s2 = bArr10[7];
                    Object[] objArr31 = new Object[1];
                    b(b2, s2, (byte) (s2 | 15), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, touchSlop, iRed, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i43 = ((int[]) objArr2[1])[0];
        int i44 = ((int[]) objArr2[0])[0];
        if (i44 != i43) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr2[4];
            if (strArr5 != null) {
                int i45 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i45 % 128;
                int i46 = i45 % 2;
                for (String str2 : strArr5) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i44));
        }
        int i47 = ((int[]) objArr2[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i48 = ~((-540021315) | iFreeMemory);
        int i49 = ~iFreeMemory;
        int i50 = i47 + (-268966990) + ((i48 | (~(938835583 | i49))) * 497) + (((~(iFreeMemory | 938835583)) | (~((-611416696) | i49)) | 71395381) * 497);
        int i51 = (i50 << 13) ^ i50;
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr32[3])[0] = i52 ^ (i52 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -660166504
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
            Method dump skipped, instruction units count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.AutocompleteActivity.onStart():void");
    }

    static {
        byte[] bArr = new byte[621];
        System.arraycopy("1T\u0088e!\u000fû\u0010òÔ\u0014/\u0002û\u0006\u0001á6ÿô\u0010ÿö\u000eê)ø\t÷\u0000\u0012øýì\u0018\u000fø\u0005\u0000Ò\u000f\u0001Ä<\u000b\u0003û\büÌ6\u0010ù\u0011\u0000ýþÍB÷\u0016ô\u0010úû\u000eÅCö\u0018ö\u0001ý\u0016ø\t\u0002Ã#\u0016\u0018ö\u0001ý\u0016ø\t\u0002×\"\u0014ç\u0016ÿ\u0015$÷\u000eø\t\u0002å\u0014\u001b÷û\f\tÕ/ò\t\tû\f\t\u0002\u0000ø\u0001\tû\u000e\u0000\b\u0001\u0000\bú\u0002\u0015öÿ\u0015Ù%ø\u0004\nû\u0004\u0004þ\u0017ú\u000bÀ\u000f\u0001Ä7\u0011ý\f\u0004ú\r¼E\u0005ö\u0011õ\f\tð\u0016ø\t\u0002ÃE\u0005\u0000û\u000eò\u000fÄ?\u0001\u000f½D\u0000û\u0003\u0000\u001býõ\u0001\u0015\u0000ú\u000e\b¸$ ûã \u001bÝ\u0015\u0001\u0015\u0000ú\u000e\bË%\u0014ø\u0010ö\u000e\b®R\u0000ø\u0001\tû\u000e»\u0003H\b\u0001\u0000\bú\u0002ÃH\bÿþ\u0001\u0014³C\u0004\u0004þ\u0017ú\u000b³\u0010$÷\u000eø\t\u0002å\u0014\u001b÷û\f\tÕ/ò\t\tû\f\t\u0002\u0000ø\u0001\tû\u000e\u0000\b\u0001\u0000\bú\u0002\u0015öÿ\u0015Ù%ø\u0004\nû\u0004\u0004þ\u0017ú\u000bÁø\u000fø\u0005\u0000\u0007\u0016ð\u0001\u0015\u0002ôî%öá!\u0012\u0007\u0004\u0000öÏ3\u0010ù\u0011\u0000ýþ\u0017î\u0001\u000fû\u0010ò\u0005\u0001\u000fû\u0010òÔ:\b\tô\u0010ÿö\u000eÚ!\u000fû\u0010òÔ\u0014!\u0012\u0007\u0004\u0000öî\u001c\nø\n\u0000\búî\u001c\nø\n\u0000\búÂ3$÷\u000eø\t\u0002å\u0014\u001b÷û\f\tÕ/ò\t\tû\f\tñ\n\bù\b\büå(û\tø\u0016ô\u0010Â\u0001\u0012Ð7\u0002þç\u0019\u0014îò\u0014\u0016ÿÐ8î\u000b\u0006ø\u0004\rüñ\u0019\u0014î\u0011$÷\u000eø\t\u0002å\u0014\u001b÷û\f\tÕ/ò\t\tû\f\tñ\n\bù\b\büå(û\tø\u0016ô\u0010Â\rå!õá!\u0015õß%\u0014ø\u0010òÂ3$÷\u000eø\t\u0002å\u0014\u001b÷û\f\tÕ/ò\t\tû\f\tñ\n\bù\b\büå(û\tø\u0016ô\u0010Â\u0010ù\u0011\u0000ýþÍH\u0005þ\u0003\u0002\u0006\u0005½KÁýBû\u0002\bûÐHõ\u0011\u0003ù\t\u0002Ã\"\u001b\u0002\bûå/\u0002\t\u0001\u0000\u0000\u0003ü\u0010Ô/\u0001\u0006ô\u0016³3!ò\u0010\b\u0000\u0002\u0006\u0005Ò/\u0002\t\u0001\u0000\u0000\nÑ2üÌ\u0002".getBytes("ISO-8859-1"), 0, bArr, 0, 621);
        $$d = bArr;
        $$e = 93;
        $$a = new byte[]{67, -127, -109, 9, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$b = 178;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722400;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r9 = 120 - r9
            int r8 = r8 + 4
            byte[] r0 = com.google.android.libraries.places.widget.AutocompleteActivity.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.AutocompleteActivity.$$g(byte, byte, byte):java.lang.String");
    }
}
