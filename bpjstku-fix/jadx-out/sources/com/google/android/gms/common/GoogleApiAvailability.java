package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {com.google.android.gms.internal.base.zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int asInterface;
    private static char b;
    private static final Object zaa;
    private static final GoogleApiAvailability zab;
    private String zac;
    private static final byte[] $$c = {68, 83, 49, -116};
    private static final int $$f = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {55, -64, 35, -71, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 55, -2, 20, -18, -50, 68, 5, -15, 17, -15, 5, 6, -6, -56, 69, -12, 9, 3, 6, -14, -54, 36, 37, -15, 17, -15, 5, 6, -6, -37, 48, -6};
    private static final int $$e = 248;
    private static final byte[] $$a = {22, 102, 43, -6, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 129;
    private static int g = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    static {
        asInterface = 1;
        TuitionPaymentFragmentbindingInflater1();
        zaa = new Object();
        zab = new GoogleApiAvailability();
        GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.common.GoogleApiAvailability.$$a
            int r8 = r8 * 52
            int r8 = r8 + 4
            int r6 = r6 * 15
            int r1 = 53 - r6
            int r7 = r7 * 3
            int r7 = 84 - r7
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 98
            byte[] r0 = com.google.android.gms.common.GoogleApiAvailability.$$d
            int r6 = r6 * 43
            int r1 = 44 - r6
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r8 = r8 + r7
            int r7 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.e(byte, byte, short, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(Context context) {
        int i = 2 % 2;
        int i2 = d + 73;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getClientVersion(context);
        }
        super.getClientVersion(context);
        throw null;
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = d + 73;
        g = i4 % 128;
        int i5 = i4 % 2;
        Dialog errorDialog = getErrorDialog(activity, i, i2, (DialogInterface.OnCancelListener) null);
        if (i5 != 0) {
            int i6 = 31 / 0;
        }
        return errorDialog;
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        int i2 = 2 % 2;
        int i3 = d + 107;
        g = i3 % 128;
        int i4 = i3 % 2;
        Intent errorResolutionIntent = super.getErrorResolutionIntent(context, i, str);
        int i5 = g + 101;
        d = i5 % 128;
        int i6 = i5 % 2;
        return errorResolutionIntent;
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = d + 59;
        g = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            super.getErrorResolutionPendingIntent(context, i, i2);
            obj.hashCode();
            throw null;
        }
        PendingIntent errorResolutionPendingIntent = super.getErrorResolutionPendingIntent(context, i, i2);
        int i5 = d + 109;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return errorResolutionPendingIntent;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int i) {
        int i2 = 2 % 2;
        int i3 = d + 85;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.getErrorString(i);
            throw null;
        }
        String errorString = super.getErrorString(i);
        int i4 = d + 33;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return errorString;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(Context context) {
        int i = 2 % 2;
        int i2 = d + 3;
        g = i2 % 128;
        int i3 = i2 % 2;
        int iIsGooglePlayServicesAvailable = super.isGooglePlayServicesAvailable(context);
        int i4 = g + 71;
        d = i4 % 128;
        int i5 = i4 % 2;
        return iIsGooglePlayServicesAvailable;
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i) {
        int i2 = 2 % 2;
        int i3 = d + 57;
        g = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsUserResolvableError = super.isUserResolvableError(i);
        int i5 = d + 119;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return zIsUserResolvableError;
    }

    public void setDefaultNotificationChannelId(Context context, String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = g + 59;
        d = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return showErrorDialogFragment(activity, i, i2, (DialogInterface.OnCancelListener) null);
        }
        showErrorDialogFragment(activity, i, i2, (DialogInterface.OnCancelListener) null);
        obj.hashCode();
        throw null;
    }

    public Task<Void> checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        int i = 2 % 2;
        int i2 = g + 39;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return zai(googleApi, googleApiArr).onSuccessTask(zab.zaa);
        }
        Task<Void> taskOnSuccessTask = zai(googleApi, googleApiArr).onSuccessTask(zab.zaa);
        int i3 = 93 / 0;
        return taskOnSuccessTask;
    }

    public void showErrorNotification(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = d + 125;
        g = i3 % 128;
        Object obj = null;
        zae(context, i, null, i3 % 2 != 0 ? getErrorResolutionPendingIntent(context, i, 0, "n") : getErrorResolutionPendingIntent(context, i, 0, "n"));
        int i4 = g + 43;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final Task zai(HasApiKey hasApiKey, HasApiKey... hasApiKeyArr) {
        int i = 2 % 2;
        int i2 = d + 79;
        g = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        int i4 = g + 51;
        d = i4 % 128;
        int i5 = i4 % 2;
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zaj().zam(arrayList);
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        int i = 2 % 2;
        int i2 = g + 103;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i4);
        if (iIsGooglePlayServicesAvailable != 0) {
            zacc zaccVarZaa = zacc.zaa(activity);
            zaccVarZaa.zah(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
            return zaccVarZaa.zad();
        }
        int i5 = d + 107;
        g = i5 % 128;
        int i6 = i5 % 2;
        return Tasks.forResult(null);
    }

    final Dialog zaa(Context context, int i, zag zagVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        int i2 = 2 % 2;
        AlertDialog.Builder builder2 = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(com.google.android.gms.common.internal.zac.zac(context, i));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strZab = com.google.android.gms.common.internal.zac.zab(context, i);
        DialogInterface.OnClickListener onClickListener2 = zagVar;
        if (strZab != null) {
            if (zagVar == null) {
                int i3 = g + 95;
                d = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 49 / 0;
                }
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strZab, onClickListener2);
        }
        String strZaf = com.google.android.gms.common.internal.zac.zaf(context, i);
        if (strZaf != null) {
            builder2.setTitle(strZaf);
            int i5 = g + 13;
            d = i5 % 128;
            int i6 = i5 % 2;
        }
        new Object[]{Integer.valueOf(i)};
        new IllegalArgumentException();
        return builder2.create();
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i4 = $11 + 35;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 1];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i5 = $11 + 83;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i7) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char deadChar = (char) (47773 - KeyEvent.getDeadChar(i3, i3));
                        int size = View.MeasureSpec.getSize(i3) + 468;
                        int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, size, i11, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i8;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 47773), TextUtils.lastIndexOf("", '0', 0) + 469, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i12 + 1;
                    int i13 = $10 + 113;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 4 / 2;
                    }
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 1), TextUtils.lastIndexOf("", '0') + 2324, (ViewConfiguration.getEdgeSlop() >> 16) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    final void zae(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        new Object[]{Integer.valueOf(i), null};
        new IllegalArgumentException();
        if (i == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strZae = com.google.android.gms.common.internal.zac.zae(context, i);
        String strZad = com.google.android.gms.common.internal.zac.zad(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
        NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(strZae).setStyle(new NotificationCompat.BigTextStyle().bigText(strZad));
        if (DeviceProperties.isWearable(context)) {
            Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
            style.setSmallIcon(((PackageItemInfo) context.getApplicationInfo()).icon).setPriority(2);
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                style.addAction(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(android.R.drawable.stat_sys_warning).setTicker(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(strZad);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            style.setChannelId(str2);
        }
        Notification notificationBuild = style.build();
        if (i == 1 || i == 2 || i == 3) {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationBuild);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = g + 123;
        d = i3 % 128;
        int i4 = i3 % 2;
        int iIsGooglePlayServicesAvailable = super.isGooglePlayServicesAvailable(context, i);
        int i5 = d + 91;
        g = i5 % 128;
        int i6 = i5 % 2;
        return iIsGooglePlayServicesAvailable;
    }

    final void zaf(Context context) {
        int i = 2 % 2;
        new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
        int i2 = g + 109;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        int i3 = 2 % 2;
        int i4 = d + 105;
        g = i4 % 128;
        int i5 = i4 % 2;
        Dialog dialogZaa = zaa(activity, i, zag.zab(activity, getErrorResolutionIntent(activity, i, "d"), i2), onCancelListener, null);
        int i6 = g + 3;
        d = i6 % 128;
        int i7 = i6 % 2;
        return dialogZaa;
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        int i3 = 2 % 2;
        int i4 = g + 59;
        d = i4 % 128;
        int i5 = i4 % 2;
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog != null) {
            zad(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
            return true;
        }
        int i6 = g + 117;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(Activity activity, LifecycleFragment lifecycleFragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        int i3 = 2 % 2;
        int i4 = g + 15;
        d = i4 % 128;
        int i5 = i4 % 2;
        Dialog dialogZaa = zaa(activity, i, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i, "d"), 2), onCancelListener, null);
        if (dialogZaa != null) {
            zad(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
            return true;
        }
        int i6 = d + 109;
        g = i6 % 128;
        return i6 % 2 != 0;
    }

    public Task<Void> checkApiAvailability(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        int i = 2 % 2;
        int i2 = g + 13;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    int i3 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                    return Tasks.forResult(null);
                }
            });
        }
        zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i3 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
        throw null;
    }

    public Dialog getErrorDialog(Fragment fragment, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = g + 85;
        d = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        Dialog errorDialog = getErrorDialog(fragment, i, i2, (DialogInterface.OnCancelListener) null);
        int i6 = g + 41;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return errorDialog;
        }
        obj.hashCode();
        throw null;
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        int i = 2 % 2;
        int i2 = d + 115;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            connectionResult.hasResolution();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!connectionResult.hasResolution()) {
            return getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
        }
        PendingIntent resolution = connectionResult.getResolution();
        int i3 = g + 89;
        d = i3 % 128;
        int i4 = i3 % 2;
        return resolution;
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        int i = 2 % 2;
        int i2 = d + 121;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
            obj.hashCode();
            throw null;
        }
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
        int i3 = d + 49;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
    }

    final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        int i = 2 % 2;
        if (!(activity instanceof FragmentActivity)) {
            ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
            return;
        }
        int i2 = g + 43;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
            int i3 = 39 / 0;
        } else {
            SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
        }
        int i4 = d + 15;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean showErrorDialogFragment(Activity activity, int i, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher, DialogInterface.OnCancelListener onCancelListener) {
        int i2 = 2 % 2;
        Dialog dialogZaa = zaa(activity, i, null, onCancelListener, new zac(this, activity, i, activityResultLauncher));
        Object obj = null;
        if (dialogZaa == null) {
            int i3 = d + 87;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        zad(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        int i4 = g + 39;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i) {
        int i2 = 2 % 2;
        if (!InstantApps.isInstantApp(context)) {
            int i3 = g + 7;
            d = i3 % 128;
            int i4 = i3 % 2;
            PendingIntent errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult);
            if (errorResolutionPendingIntent != null) {
                int i5 = g + 13;
                d = i5 % 128;
                if (i5 % 2 == 0) {
                    zae(context, connectionResult.getErrorCode(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i, false), zap.zaa | 134217728));
                    return false;
                }
                zae(context, connectionResult.getErrorCode(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i, true), zap.zaa | 134217728));
                return true;
            }
        }
        return false;
    }

    public Dialog getErrorDialog(Fragment fragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        int i3 = 2 % 2;
        int i4 = d + 15;
        g = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            zaa(fragment.requireContext(), i, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i, "d"), i2), onCancelListener, null);
            throw null;
        }
        Dialog dialogZaa = zaa(fragment.requireContext(), i, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i, "d"), i2), onCancelListener, null);
        int i5 = g + 59;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return dialogZaa;
        }
        obj.hashCode();
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public final zabx zac(Context context, zabw zabwVar) {
        int i = 2 % 2;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        zao.zaa(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabxVar;
        }
        int i2 = d + 99;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            zabwVar.zaa();
            zabxVar.zab();
            throw null;
        }
        zabwVar.zaa();
        zabxVar.zab();
        int i3 = d + 75;
        g = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        int i2 = 0;
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        String strZac = com.google.android.gms.common.internal.zac.zac(activity, 18);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) (Color.blue(0) + 43042);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3111;
            int i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, minimumFlingVelocity, i3, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{24041, 9481, 33582, 38988, 42465, 27436, 34264, 21784, 12131, 31416, 42838, 29257, 3057, 6495, 13668, 4158, 41761, 16303, 4453, 28831, 23905, 50129, 20319, 15835}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{13974, 62034, 31245, 48519, 13026, 18967, 5505, 35833, 55400, 64327, 44125, 64998, 49707, 11145, 37908, 34712, 24395, 41635}, ExpandableListView.getPackedPositionType(0L) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) (43041 - MotionEvent.axisFromString(""));
            int i4 = 3111 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int maximumDrawingCacheSize = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, b4, bArr[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, i4, maximumDrawingCacheSize, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = g + 61;
            d = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char modifierMetaStateMask = (char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask()));
                int iGreen = 3111 - Color.green(0);
                int maximumDrawingCacheSize2 = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr2[5], bArr2[7], bArr2[40], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, iGreen, maximumDrawingCacheSize2, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = (-967034562) + (((~iIdentityHashCode) | (-442008797)) * 1444) + (((~(iIdentityHashCode | 905223479)) | (~(799807979 | iIdentityHashCode)) | (-1073520128)) * (-1444)) + 2122889178;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{new int[1], new int[]{i8}, iArr, strArr};
            int i12 = d + 13;
            g = i12 % 128;
            int i13 = i12 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{19522, 57451, 42052, 20647, 5146, 23671, 17430, 35295, 13847, 51020, 22671, 27484, 58534, 15528, 19118, 32618, 2952, 4578}, 16 - View.resolveSizeAndState(0, 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{19420, 10057, 30119, 32997, 20320, 14599, 47522, 48651, 51694, 37588, 61667, 50250, 1534, 19015, 785, 61804, 27949, 5944}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i14 = d + 61;
            g = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 820118370};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[5];
                Object[] objArr11 = new Object[1];
                e((byte) (b5 + 1), (byte) (-b5), b5, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = (byte) (-bArr3[5]);
                byte b7 = (byte) (b6 - 1);
                Object[] objArr12 = new Object[1];
                e(b6, b7, (byte) (b7 | 42), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyPid = (char) (43042 - (Process.myPid() >> 22));
                    int iRgb = (-16774105) - Color.rgb(0, 0, 0);
                    int mode = 22 - View.MeasureSpec.getMode(0);
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    a(bArr4[5], bArr4[7], bArr4[40], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, iRgb, mode, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{24041, 9481, 33582, 38988, 42465, 27436, 34264, 21784, 12131, 31416, 42838, 29257, 3057, 6495, 13668, 4158, 41761, 16303, 4453, 28831, 23905, 50129, 20319, 15835}, 22 - ExpandableListView.getPackedPositionGroup(0L), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{13974, 62034, 31245, 48519, 13026, 18967, 5505, 35833, 55400, 64327, 44125, 64998, 49707, 11145, 37908, 34712, 24395, 41635}, TextUtils.lastIndexOf("", '0') + 16, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int iIndexOf = TextUtils.indexOf("", "") + 3111;
                        int i16 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        a(b8, b8, bArr5[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf, i16, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char deadChar = (char) (43042 - KeyEvent.getDeadChar(0, 0));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 3111;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 22;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr17 = new Object[1];
                        a(b9, b10, b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, windowTouchSlop, scrollBarSize, -1272852037, false, (String) objArr17[0], null);
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 != i17) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                    int i19 = d + 73;
                    g = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i18));
        }
        int i21 = d + 9;
        g = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((int[]) objArr[0])[0];
        int i24 = ((int[]) objArr[2])[0];
        int i25 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i24};
        int iMyTid = Process.myTid();
        int i26 = ~iMyTid;
        int i27 = i23 + (-1272411950) + (((~((-1153313622) | i26)) | 10619717) * 168) + ((~((-10619718) | iMyTid)) * 168) + (((~(iMyTid | (-1142693905))) | (~(i26 | (-551717838))) | 541098120) * 168);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr[0])[0] = i29 ^ (i29 << 5);
        Object[] objArr18 = {new int[1], new int[]{i25}, iArr2, strArr3};
        builder.setMessage(strZac);
        int i30 = ((int[]) objArr18[0])[0];
        int i31 = i30 * i30;
        int i32 = -(641206185 * i30);
        int i33 = (((i31 & i32) + (i31 | i32)) - (~(-(i30 * 1653643985)))) - 1;
        int i34 = (i33 & (-110122871)) + ((-110122871) | i33);
        int i35 = i34 >> 18;
        int i36 = ((i35 & (-32767)) + (i35 | (-32767))) / 16384;
        int i37 = (i36 & 1) + (i36 | 1);
        int i38 = (i34 & i37) + (i37 | i34);
        int i39 = i34 >> 28;
        int i40 = ((i39 & (-31)) + (i39 | (-31))) / 16;
        int i41 = (-((((i40 | 1) << 1) - (i40 ^ 1)) ^ i38)) + 2;
        builder.setPositiveButton("16/26/12/".substring(24732 / ((i41 & (-((((i41 >> 29) - 15) / 8) + 2))) * 1374)), (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zad(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        int i42 = d + 83;
        g = i42 % 128;
        if (i42 % 2 == 0) {
            return alertDialogCreate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GoogleApiAvailability getInstance() {
        int i = 2 % 2;
        int i2 = g + 109;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        GoogleApiAvailability googleApiAvailability = zab;
        int i4 = i3 + 125;
        g = i4 % 128;
        int i5 = i4 % 2;
        return googleApiAvailability;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = (char) 5331;
        TuitionPaymentFragmentbindingInflater1 = (char) 33803;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 20842;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 38100;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r6 = r6 * 4
            int r6 = r6 + 108
            byte[] r0 = com.google.android.gms.common.GoogleApiAvailability.$$c
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L30
        L18:
            r3 = r2
        L19:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r8 = r8 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.$$g(byte, int, int):java.lang.String");
    }
}
