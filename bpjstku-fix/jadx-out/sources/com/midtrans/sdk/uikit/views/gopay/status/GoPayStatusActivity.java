package com.midtrans.sdk.uikit.views.gopay.status;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import com.google.android.libraries.places.internal.zzrf;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.utilities.Utils;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.BoldTextView;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14;
import defpackage.cacheInteropConfig;
import defpackage.calculateInvertedTextureTransform;
import defpackage.deInitSession;
import defpackage.generateCameraId;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class GoPayStatusActivity extends BasePaymentActivity {
    private static final String asInterface = "GoPayStatusActivity";
    private BoldTextView INotificationSideChannel;
    private SemiBoldTextView INotificationSideChannelDefault;
    private ImageView cancel;
    private DefaultTextView cancelAll;
    private FancyButton d;
    private FancyButton getInterfaceDescriptor;
    private BoldTextView onTransact;
    private static final byte[] $$m = {60, 80, 13, 34};
    private static final int $$n = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {14, 116, 92, -78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$k = 240;
    private static int INotificationSideChannelStub = 0;
    private static int connect = 1;
    private static char[] RemoteActionCompatParcelizer = {60073, 60048, 60054, 60062, 60056, 60051, 60072, 60053, 60050, 60045, 60047, 60040, 60060, 60055, 60034, 60083, 60049, 60058, 60052, 60117, 60075, 60041, 60088, 60063, 60043};
    private static char INotificationSideChannelStubProxy = 57188;
    private final int g = 15;
    private boolean notify = true;

    /* JADX INFO: renamed from: com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements DefaultSurfaceProcessorExternalSyntheticLambda14<ImageView> {
        public AnonymousClass5() {
        }

        @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Exception exc, ImageView imageView) {
            if (exc == null) {
                ((FrameLayout) GoPayStatusActivity.this.findViewById(R.id.gopay_qr_code_frame)).setBackgroundColor(0);
                Object[] objArr = {GoPayStatusActivity.this};
                ((FancyButton) GoPayStatusActivity.TuitionPaymentFragmentbindingInflater1(zzrf.b(), zzrf.b(), zzrf.b(), zzrf.b(), 2139141912, objArr, -2139141912)).setVisibility(8);
                GoPayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(GoPayStatusActivity.this, true);
                GoPayStatusActivity.g(GoPayStatusActivity.this);
                return;
            }
            ((FrameLayout) GoPayStatusActivity.this.findViewById(R.id.gopay_qr_code_frame)).setBackgroundColor(GoPayStatusActivity.this.getResources().getColor(R.color.light_gray));
            Object[] objArr2 = {GoPayStatusActivity.this};
            ((FancyButton) GoPayStatusActivity.TuitionPaymentFragmentbindingInflater1(zzrf.b(), zzrf.b(), zzrf.b(), zzrf.b(), 2139141912, objArr2, -2139141912)).setVisibility(0);
            Logger.e(GoPayStatusActivity.g(), exc.getMessage());
            GoPayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(GoPayStatusActivity.this, false);
            Object[] objArr3 = {GoPayStatusActivity.this};
            GoPayStatusActivity.TuitionPaymentFragmentbindingInflater1(zzrf.b(), zzrf.b(), zzrf.b(), zzrf.b(), 1844163861, objArr3, -1844163859);
            GoPayStatusActivity goPayStatusActivity = GoPayStatusActivity.this;
            Toast.makeText(goPayStatusActivity, goPayStatusActivity.getString(R.string.error_qr_code), 0).show();
        }
    }

    public static /* synthetic */ BoldTextView TuitionPaymentFragmentbindingInflater1(GoPayStatusActivity goPayStatusActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 29;
        int i3 = i2 % 128;
        connect = i3;
        int i4 = i2 % 2;
        BoldTextView boldTextView = goPayStatusActivity.INotificationSideChannel;
        int i5 = i3 + 117;
        INotificationSideChannelStub = i5 % 128;
        int i6 = i5 % 2;
        return boldTextView;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i6;
        int i11 = (~i10) | i9;
        int i12 = ~i6;
        int i13 = (~(i | i10)) | (~(i8 | i12)) | (~(i12 | i5));
        int i14 = i5 + i6 + i2 + ((-1017789379) * i4) + (461141949 * i3);
        int i15 = i14 * i14;
        int i16 = ((-551480932) * i5) + 431816704 + ((-1613042074) * i6) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i2) + ((-1727660032) * i4) + (1912995840 * i3) + ((-1005256704) * i15);
        int i17 = ((i5 * (-1063000396)) - 360994079) + (i6 * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i2 * (-1063000885)) + (i4 * (-90181537)) + (i3 * (-1548859681)) + (i15 * 816250880);
        int i18 = i16 + (i17 * i17 * 1493368832);
        if (i18 != 1) {
            return i18 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return b(objArr);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        GoPayStatusActivity goPayStatusActivity = (GoPayStatusActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 31;
        connect = i2 % 128;
        int i3 = i2 % 2;
        goPayStatusActivity.b();
        int i4 = INotificationSideChannelStub + 71;
        connect = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.getMerchantName()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.getMerchantName()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        r1 = com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.connect + 9;
        com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.INotificationSideChannelStub = r1 % 128;
        r1 = r1 % 2;
        r5.onTransact.setText(r6.getMerchantName());
        r5.onTransact.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.INotificationSideChannelStub
            int r2 = r1 + 79
            int r3 = r2 % 128
            com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.connect = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L67
            r2 = 8
            if (r6 == 0) goto L61
            int r1 = r1 + 9
            int r6 = r1 % 128
            com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.connect = r6
            int r1 = r1 % r0
            com.midtrans.sdk.corekit.core.MidtransSDK r6 = com.midtrans.sdk.corekit.core.MidtransSDK.getInstance()
            if (r6 == 0) goto L5b
            int r1 = com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.connect
            int r1 = r1 + 7
            int r3 = r1 % 128
            com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.INotificationSideChannelStub = r3
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L39
            java.lang.String r1 = r6.getMerchantName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r4 = 59
            int r4 = r4 / r3
            if (r1 != 0) goto L5b
            goto L43
        L39:
            java.lang.String r1 = r6.getMerchantName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L5b
        L43:
            int r1 = com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.connect
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.INotificationSideChannelStub = r2
            int r1 = r1 % r0
            com.midtrans.sdk.uikit.widgets.BoldTextView r0 = r5.onTransact
            java.lang.String r6 = r6.getMerchantName()
            r0.setText(r6)
            com.midtrans.sdk.uikit.widgets.BoldTextView r5 = r5.onTransact
            r5.setVisibility(r3)
            return
        L5b:
            com.midtrans.sdk.uikit.widgets.BoldTextView r5 = r5.onTransact
            r5.setVisibility(r2)
            return
        L61:
            com.midtrans.sdk.uikit.widgets.BoldTextView r5 = r5.onTransact
            r5.setVisibility(r2)
            return
        L67:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity, boolean):void");
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(GoPayStatusActivity goPayStatusActivity) {
        int i = 2 % 2;
        int i2 = connect + 71;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        int i4 = i2 % 2;
        boolean z = goPayStatusActivity.notify;
        int i5 = i3 + 51;
        connect = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static /* synthetic */ ImageView TuitionPaymentFragmentspecialinlinedviewModeldefault2(GoPayStatusActivity goPayStatusActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub;
        int i3 = i2 + 29;
        connect = i3 % 128;
        int i4 = i3 % 2;
        ImageView imageView = goPayStatusActivity.cancel;
        int i5 = i2 + 121;
        connect = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return imageView;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(GoPayStatusActivity goPayStatusActivity, boolean z) {
        int i = 2 % 2;
        int i2 = connect + 51;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        goPayStatusActivity.notify = z;
        if (i3 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ DefaultTextView TuitionPaymentFragmentspecialinlinedviewModeldefault3(GoPayStatusActivity goPayStatusActivity) {
        int i = 2 % 2;
        int i2 = connect + 123;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        int i4 = i2 % 2;
        DefaultTextView defaultTextView = goPayStatusActivity.cancelAll;
        int i5 = i3 + 43;
        connect = i5 % 128;
        if (i5 % 2 != 0) {
            return defaultTextView;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        GoPayStatusActivity goPayStatusActivity = (GoPayStatusActivity) objArr[0];
        int i = 2 % 2;
        int i2 = connect + 81;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        FancyButton fancyButton = goPayStatusActivity.getInterfaceDescriptor;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return fancyButton;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        GoPayStatusActivity goPayStatusActivity = (GoPayStatusActivity) objArr[0];
        int i = 2 % 2;
        int i2 = connect + 63;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        goPayStatusActivity.asBinder();
        int i4 = connect + 121;
        INotificationSideChannelStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(GoPayStatusActivity goPayStatusActivity, String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 21;
        connect = i2 % 128;
        int i3 = i2 % 2;
        goPayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(GoPayStatusActivity goPayStatusActivity, String str, ImageView imageView) {
        int i = 2 % 2;
        calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView).TuitionPaymentFragmentbindingInflater1(str).TuitionPaymentFragmentspecialinlinedviewModeldefault1(goPayStatusActivity.new AnonymousClass5());
        int i2 = connect + 61;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
    }

    public static /* synthetic */ String g() {
        int i = 2 % 2;
        int i2 = connect + 123;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        int i4 = i2 % 2;
        String str = asInterface;
        int i5 = i3 + 61;
        connect = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void g(GoPayStatusActivity goPayStatusActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 107;
        connect = i2 % 128;
        int i3 = i2 % 2;
        goPayStatusActivity.b();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 196 - r7
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r0 = 53 - r6
            byte[] r1 = com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.$$j
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.m(int, short, byte, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = connect + 33;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.d);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = connect + 11;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannelDefault = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.d = (FancyButton) findViewById(R.id.button_primary);
        int i4 = INotificationSideChannelStub + 81;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 107;
        connect = i2 % 128;
        int i3 = i2 % 2;
        if (!((BasePaymentActivity) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(getString(R.string.confirm_gopay_qr_scan_tablet));
            return;
        }
        int i4 = connect + 57;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 == 0) {
            d();
        } else {
            d();
            int i5 = 82 / 0;
        }
    }

    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2) {
        long time;
        int i = 2 % 2;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm", locale);
        long time2 = 0;
        try {
            Date date = simpleDateFormat.parse(str);
            Date date2 = simpleDateFormat2.parse(str2);
            time = date.getTime();
            try {
                time2 = date2.getTime();
            } catch (ParseException e2) {
                e = e2;
                Logger.e(e.getMessage());
            }
        } catch (ParseException e3) {
            e = e3;
            time = 0;
        }
        long j = time2 - time;
        int i2 = connect + 97;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        return j;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int i = 2 % 2;
        int i2 = connect + 23;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        if (str != null && str.split(" ").length > 1) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(simpleDateFormat.parse(str));
                calendar.add(12, 15);
                String str2 = simpleDateFormat.format(calendar.getTime());
                StringBuilder sb = new StringBuilder();
                sb.append(str2.split(" ")[1]);
                sb.append(" WIB");
                String string = sb.toString();
                String[] strArrSplit = str2.split(" ")[0].split("-");
                String month = Utils.getMonth(Integer.parseInt(strArrSplit[1]));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArrSplit[2]);
                sb2.append(" ");
                sb2.append(month);
                sb2.append(" ");
                sb2.append(strArrSplit[0]);
                sb2.append(", ");
                sb2.append(string);
                return sb2.toString();
            } catch (RuntimeException | ParseException e2) {
                StringBuilder sb3 = new StringBuilder("Error while parsing date : ");
                sb3.append(e2.getMessage());
                Logger.e(sb3.toString());
                int i4 = connect + 25;
                INotificationSideChannelStub = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 % 3;
                }
                str = "";
            }
        }
        int i6 = connect + 67;
        INotificationSideChannelStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 74 / 0;
        }
        return str;
    }

    private static long TuitionPaymentFragmentbindingInflater1(String str, String str2) {
        long time;
        int i = 2 % 2;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMMM HH:mm", locale);
        long time2 = 0;
        try {
            Date date = simpleDateFormat.parse(str);
            time = date.getTime();
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int i2 = calendar.get(1);
                calendar.setTime(simpleDateFormat2.parse(str2.replace(" WIB", "")));
                calendar.add(1, i2 - calendar.get(1));
                time2 = calendar.getTime().getTime();
            } catch (ParseException e2) {
                e = e2;
                Logger.e(e.getMessage());
            }
        } catch (ParseException e3) {
            e = e3;
            time = 0;
        }
        long j = time2 - time;
        int i3 = connect + 109;
        INotificationSideChannelStub = i3 % 128;
        if (i3 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int i = 2 % 2;
        try {
            new AlertDialog.Builder(this, R.style.AlertDialogCustom).setPositiveButton(R.string.text_yes, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.10
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    if (GoPayStatusActivity.this.isFinishing()) {
                        return;
                    }
                    dialogInterface.dismiss();
                    GoPayStatusActivity.this.finish();
                }
            }).setNegativeButton(R.string.text_no, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    if (GoPayStatusActivity.this.isFinishing()) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }).setTitle(R.string.cancel_transaction).setMessage(str).create().show();
            int i2 = INotificationSideChannelStub + 33;
            connect = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e2) {
            String str2 = asInterface;
            StringBuilder sb = new StringBuilder("showDialog:");
            sb.append(e2.getMessage());
            Logger.e(str2, sb.toString());
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1199215074
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0129  */
    /* JADX WARN: Code duplicated, block: B:42:0x0141  */
    /* JADX WARN: Code duplicated, block: B:45:0x018e A[Catch: all -> 0x0346, TryCatch #0 {all -> 0x0346, blocks: (B:19:0x007b, B:21:0x008e, B:22:0x00bc, B:43:0x0143, B:45:0x018e, B:47:0x0202, B:51:0x0221, B:53:0x025b, B:54:0x02bf), top: B:71:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0200  */
    /* JADX WARN: Code duplicated, block: B:50:0x0215  */
    /* JADX WARN: Code duplicated, block: B:53:0x025b A[Catch: all -> 0x0346, TryCatch #0 {all -> 0x0346, blocks: (B:19:0x007b, B:21:0x008e, B:22:0x00bc, B:43:0x0143, B:45:0x018e, B:47:0x0202, B:51:0x0221, B:53:0x025b, B:54:0x02bf), top: B:71:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x030f  */
    private static void n(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = RemoteActionCompatParcelizer;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 2268, 33 - (ViewConfiguration.getEdgeSlop() >> 16), -1927765101, false, $$u(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i5++;
                    i4 = 1770390596;
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
        try {
            Object[] objArr4 = {Integer.valueOf(INotificationSideChannelStubProxy)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1927765101, false, $$u(b4, b5, b5), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i6 = $10 + 27;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    i2 = i + 3;
                    cArr4[i2] = (char) (cArr[i2] - b);
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
                    int i7 = $10 + 79;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            obj = obj2;
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - TextUtils.indexOf("", "", 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3260, 30 - View.MeasureSpec.makeMeasureSpec(0, 0), -127612708, false, $$u(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                int i8 = $11 + 89;
                                $10 = i8 % 128;
                                int i9 = i8 % 2;
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = b8;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 22878), 593 - Process.getGidForName(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, 1570859318, false, $$u(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                                } else {
                                    int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                }
                            }
                        }
                    } else {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            obj = obj2;
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - TextUtils.indexOf("", "", 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3260, 30 - View.MeasureSpec.makeMeasureSpec(0, 0), -127612708, false, $$u(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                int i15 = $11 + 89;
                                $10 = i15 % 128;
                                int i16 = i15 % 2;
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b12 = (byte) 0;
                                    byte b13 = b12;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 22878), 593 - Process.getGidForName(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, 1570859318, false, $$u(b12, b13, (byte) (b13 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                } else {
                                    int i110 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i111 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i110];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i111];
                                }
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            for (int i20 = 0; i20 < i; i20++) {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
            int i2 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte[] bArr = $$j;
            Object[] objArr2 = new Object[1];
            m((byte) (bArr[0] + 1), (short) 193, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, keyRepeatTimeout, i2, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = INotificationSideChannelStub + 59;
            connect = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                int pressedStateDuration = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte[] bArr2 = $$j;
                byte b = bArr2[7];
                Object[] objArr3 = new Object[1];
                m(b, (short) (b | 156), bArr2[5], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, scrollBarSize, pressedStateDuration, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i5 = ~System.identityHashCode(this);
            int i6 = 1543595486 + (((~((-848161054) | i5)) | 635558627) * (-933)) + (((~(i5 | 635558627)) | (-938343424)) * 933) + 1715412242;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama4_permata).substring(16, 17).length() + 15, new char[]{17, 18, 7, 19, 18, 14, 22, '\f', 14, 17, '\t', 11, '\f', 11, 4, 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_error_empty_number).substring(3, 4).codePointAt(0) - 84), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_uob_description_app).substring(13, 16).length() + 13, new char[]{'\r', 3, 2, '\b', '\r', 5, 11, '\n', 16, 18, '\n', 6, 23, 17, 3, '\b'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_otp_message).substring(8, 9).length() + 99), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1240015311};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42048), 1726 - (Process.myTid() >> 22), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -820360344, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
                    byte[] bArr3 = $$j;
                    byte b2 = bArr3[7];
                    Object[] objArr8 = new Object[1];
                    m(b2, (short) (b2 | 156), bArr3[5], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, windowTouchSlop, keyRepeatTimeout2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, new char[]{22, '\f', 24, 22, 23, '\r', 24, 18, 16, '\r', 16, '\t', '\n', '\f', '\r', 0, 7, 2, 18, 23, 0, 2}, (byte) (117 - Color.green(0)), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_not_enabled_message).substring(5, 6).length() + 14, new char[]{'\b', 18, 19, 22, '\r', 1, 20, 3, 2, 18, 14, 11, 7, 3, 13885}, (byte) (KeyEvent.keyCodeFromString("") + 62), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                        int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iRgb = Color.rgb(0, 0, 0) + 16777239;
                        byte[] bArr4 = $$j;
                        byte b3 = bArr4[7];
                        Object[] objArr11 = new Object[1];
                        m(b3, (short) (b3 | 104), bArr4[5], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, tapTimeout, iRgb, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 29944);
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                        byte[] bArr5 = $$j;
                        Object[] objArr12 = new Object[1];
                        m((byte) (bArr5[0] + 1), (short) 193, bArr5[5], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity, pressedStateDuration2, iCombineMeasuredStates, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                int i9 = INotificationSideChannelStub + 75;
                connect = i9 % 128;
                int i10 = i9 % 2;
                arrayList.add(str);
            }
            throw null;
        }
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i13 = i11 + 1332474231 + (((~i12) | 1064563274) * 1444) + (((~(i12 | (-434896701))) | (~(647499126 | i12)) | 425980424) * (-1444)) + 184461434;
        int i14 = (i13 << 13) ^ i13;
        int i15 = i14 ^ (i14 >>> 17);
        ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1032;
            int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
            byte[] bArr6 = $$j;
            byte b4 = bArr6[7];
            Object[] objArr14 = new Object[1];
            m(b4, (short) (b4 | 52), bArr6[5], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(pressedStateDuration3, iLastIndexOf, iResolveOpacity, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 90, new char[]{22, '\f', 24, 22, 23, '\r', 24, 18, 16, '\r', 16, '\t', '\n', '\f', '\r', 0, 7, 2, 18, 23, 0, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 71), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_3).substring(1, 3).length() + 13, new char[]{'\b', 18, 19, 22, '\r', 1, 20, 3, 2, 18, 14, 11, 7, 3, 13885}, (byte) (62 - ExpandableListView.getPackedPositionType(0L)), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c4 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
            int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte[] bArr7 = $$j;
            byte b5 = bArr7[7];
            Object[] objArr17 = new Object[1];
            m(b5, (short) (b5 | 156), bArr7[5], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, maxKeyCode, doubleTapTimeout, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c5 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1031;
                int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0');
                short s = $$j[7];
                Object[] objArr18 = new Object[1];
                m((byte) 52, s, (byte) s, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c5, iIndexOf, iLastIndexOf2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr19[3])[0];
            int i17 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i18 = ~iUptimeMillis;
            int i19 = 1374490981 + (((~((-64627455) | i18)) | 308907624) * (-328)) + ((iUptimeMillis | 308907624) * 164) + (((~(iUptimeMillis | 64627454)) | 270633984 | (~(i18 | (-26353815)))) * 164) + 968349567;
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr[2])[0] = i21 ^ (i21 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.how_much_point).substring(27, 28).length() + 15, new char[]{17, 18, 7, 19, 18, 14, 22, '\f', 14, 17, '\t', 11, '\f', 11, 4, 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_failed).substring(0, 1).codePointAt(0) - 53), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            n(16 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{'\r', 3, 2, '\b', '\r', 5, 11, '\n', 16, 18, '\n', 6, 23, 17, 3, '\b'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful_msg).substring(0, 21).length() + 79), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-1240015311};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46039 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1134 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 968349567, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c6 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int i22 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int trimmedLength = TextUtils.getTrimmedLength("") + 15;
                byte[] bArr8 = $$j;
                byte b6 = bArr8[7];
                Object[] objArr24 = new Object[1];
                m(b6, (short) (b6 | 52), bArr8[5], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c6, i22, trimmedLength, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionChild(0L) + 45994), 1117 - View.resolveSize(0, 0), 17 - TextUtils.getCapsMode("", 0, 0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                short s2 = $$j[7];
                Object[] objArr25 = new Object[1];
                m((byte) 52, s2, (byte) s2, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(fadingEdgeLength, iNormalizeMetaState, iKeyCodeFromString, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_instruction_step3).substring(0, 1).length() + 21, new char[]{22, '\f', 24, 22, 23, '\r', 24, 18, 16, '\r', 16, '\t', '\n', '\f', '\r', 0, 7, 2, 18, 23, 0, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 106), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step5).substring(28, 29).length() + 14, new char[]{'\b', 18, 19, 22, '\r', 1, 20, 3, 2, 18, 14, 11, 7, 3, 13885}, (byte) (ExpandableListView.getPackedPositionType(0L) + 62), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int iCombineMeasuredStates2 = 1031 - View.combineMeasuredStates(0, 0);
                    int i23 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16;
                    byte[] bArr9 = $$j;
                    byte b7 = bArr9[7];
                    Object[] objArr28 = new Object[1];
                    m(b7, (short) (b7 | 156), bArr9[5], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetBefore, iCombineMeasuredStates2, i23, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c7 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iRgb2 = (-16777201) - Color.rgb(0, 0, 0);
                    byte[] bArr10 = $$j;
                    byte b8 = bArr10[7];
                    byte b9 = bArr10[5];
                    Object[] objArr29 = new Object[1];
                    m(b8, (short) (b8 | 52), b9, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c7, maximumDrawingCacheSize, iRgb2, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[3])[0];
        if (i25 == i24) {
            int i26 = INotificationSideChannelStub + 85;
            connect = i26 % 128;
            int i27 = i26 % 2;
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i31 = ~(917763966 | iIdentityHashCode);
            int i32 = i28 + 1238743373 + ((537034768 | i31) * (-476)) + (i31 * 952) + ((~((~iIdentityHashCode) | 917763966)) * 476);
            int i33 = i32 ^ (i32 << 13);
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr30[2])[0] = i34 ^ (i34 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i35 = connect + 89;
            INotificationSideChannelStub = i35 % 128;
            for (int i36 = i35 % 2 != 0 ? 1 : 0; i36 < strArr4.length; i36++) {
                arrayList2.add(strArr4[i36]);
            }
        }
        Toast.makeText((Context) null, i25 / (((i25 - 1) * i25) % 2), 0).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i37 = ((int[]) objArr[2])[0];
        int i38 = ((int[]) objArr[3])[0];
        int i39 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i40 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i41 = i37 + ((((~((-23929410) | i40)) | (-536721392)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 544974108) + ((~((~i40) | (-23929410))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr31[2])[0] = i43 ^ (i43 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d3, code lost:
    
        if (r1 != ((((-1205616388) + (((~(1919463926 | r2)) | 201410049) * 336)) + (((~(r2 | 203552595)) | 1917321380) * (-168))) + (((~((~r2) | 203552595)) | 1919463926) * 168))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d5, code lost:
    
        super.onResume();
        r1 = com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.INotificationSideChannelStub + 43;
        com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.connect = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e2, code lost:
    
        r1 = (-1883485014) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00eb, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ec, code lost:
    
        r1 = 562563400 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f5, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0069, code lost:
    
        if (r1 == ((r7 + (((~(353214379 | r6)) | (-1469038508)) * (-1976))) + ((((~(r4 | 1183201922)) | 67377794) | (~((-1183201923) | r6))) * 988))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009a, code lost:
    
        if (r1 == ((((-1473026136) + (r5 * 992)) + ((r5 | (~((~r4) | (-1074404578)))) * (-496))) + ((r4 | (-1634622950)) * 496))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009c, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().maxMemory();
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.onResume():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 17;
        connect = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != ((550387624 + (((~((-283707712) | iIdentityHashCode)) | 277350697) * 1504)) + ((~(iIdentityHashCode | (-6357015))) * (-1504))) - 1903995744) {
            throw null;
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i5 != (-2079664956) + (((~((-571049601) | iIdentityHashCode2)) | (~((~iIdentityHashCode2) | 2008006364))) * (-318)) + (((~(864655048 | iIdentityHashCode2)) | 1143351316) * (-318)) + (((~(iIdentityHashCode2 | (-864655049))) | (-1714400917)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            throw new RuntimeException("1089318829");
        }
        super.onStart();
        int i6 = INotificationSideChannelStub + 81;
        connect = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void b(GoPayStatusActivity goPayStatusActivity) {
        int iB = zzrf.b();
        int iB2 = zzrf.b();
        int iB3 = zzrf.b();
        TuitionPaymentFragmentbindingInflater1(iB, iB2, zzrf.b(), iB3, 2084348540, new Object[]{goPayStatusActivity}, -2084348539);
    }

    public static /* synthetic */ FancyButton asBinder(GoPayStatusActivity goPayStatusActivity) {
        int iB = zzrf.b();
        int iB2 = zzrf.b();
        int iB3 = zzrf.b();
        return (FancyButton) TuitionPaymentFragmentbindingInflater1(iB, iB2, zzrf.b(), iB3, 2139141912, new Object[]{goPayStatusActivity}, -2139141912);
    }

    public static /* synthetic */ void asInterface(GoPayStatusActivity goPayStatusActivity) {
        int iB = zzrf.b();
        int iB2 = zzrf.b();
        int iB3 = zzrf.b();
        TuitionPaymentFragmentbindingInflater1(iB, iB2, zzrf.b(), iB3, 1844163861, new Object[]{goPayStatusActivity}, -1844163859);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 35;
        connect = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        int i5 = INotificationSideChannelStub + 65;
        connect = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
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
    private static java.lang.String $$u(short r6, byte r7, byte r8) {
        /*
            int r8 = r8 + 113
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.$$m
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L25
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity.$$u(short, byte, byte):java.lang.String");
    }
}
